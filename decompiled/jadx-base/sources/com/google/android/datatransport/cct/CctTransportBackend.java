package com.google.android.datatransport.cct;

/* JADX INFO: loaded from: classes4.dex */
final class CctTransportBackend implements com.google.android.datatransport.runtime.backends.TransportBackend {
    private static final java.lang.String ACCEPT_ENCODING_HEADER_KEY = "Accept-Encoding";
    static final java.lang.String API_KEY_HEADER_KEY = "X-Goog-Api-Key";
    private static final int CONNECTION_TIME_OUT = 30000;
    private static final java.lang.String CONTENT_ENCODING_HEADER_KEY = "Content-Encoding";
    private static final java.lang.String CONTENT_TYPE_HEADER_KEY = "Content-Type";
    private static final java.lang.String GZIP_CONTENT_ENCODING = "gzip";
    private static final int INVALID_VERSION_CODE = -1;
    private static final java.lang.String JSON_CONTENT_TYPE = "application/json";
    private static final java.lang.String KEY_APPLICATION_BUILD = "application_build";
    private static final java.lang.String KEY_COUNTRY = "country";
    private static final java.lang.String KEY_DEVICE = "device";
    private static final java.lang.String KEY_FINGERPRINT = "fingerprint";
    private static final java.lang.String KEY_HARDWARE = "hardware";
    private static final java.lang.String KEY_LOCALE = "locale";
    private static final java.lang.String KEY_MANUFACTURER = "manufacturer";
    private static final java.lang.String KEY_MCC_MNC = "mcc_mnc";
    static final java.lang.String KEY_MOBILE_SUBTYPE = "mobile-subtype";
    private static final java.lang.String KEY_MODEL = "model";
    static final java.lang.String KEY_NETWORK_TYPE = "net-type";
    private static final java.lang.String KEY_OS_BUILD = "os-uild";
    private static final java.lang.String KEY_PRODUCT = "product";
    private static final java.lang.String KEY_SDK_VERSION = "sdk-version";
    private static final java.lang.String KEY_TIMEZONE_OFFSET = "tz-offset";
    private static final java.lang.String LOG_TAG = "CctTransportBackend";
    private static final int READ_TIME_OUT = 130000;
    private final android.content.Context applicationContext;
    private final android.net.ConnectivityManager connectivityManager;
    private final com.google.firebase.encoders.DataEncoder dataEncoder;
    final java.net.URL endPoint;
    private final int readTimeout;
    private final com.google.android.datatransport.runtime.time.Clock uptimeClock;
    private final com.google.android.datatransport.runtime.time.Clock wallTimeClock;

    private static java.net.URL parseUrlOrThrow(java.lang.String str) {
        try {
            return new java.net.URL(str);
        } catch (java.net.MalformedURLException e) {
            throw new java.lang.IllegalArgumentException("Invalid url: " + str, e);
        }
    }

    CctTransportBackend(android.content.Context context, com.google.android.datatransport.runtime.time.Clock clock, com.google.android.datatransport.runtime.time.Clock clock2, int i) {
        this.dataEncoder = com.google.android.datatransport.cct.internal.BatchedLogRequest.createDataEncoder();
        this.applicationContext = context;
        this.connectivityManager = (android.net.ConnectivityManager) context.getSystemService("connectivity");
        this.endPoint = parseUrlOrThrow(com.google.android.datatransport.cct.CCTDestination.DEFAULT_END_POINT);
        this.uptimeClock = clock2;
        this.wallTimeClock = clock;
        this.readTimeout = i;
    }

    CctTransportBackend(android.content.Context context, com.google.android.datatransport.runtime.time.Clock clock, com.google.android.datatransport.runtime.time.Clock clock2) {
        this(context, clock, clock2, READ_TIME_OUT);
    }

    private static android.telephony.TelephonyManager getTelephonyManager(android.content.Context context) {
        return (android.telephony.TelephonyManager) context.getSystemService("phone");
    }

    private static java.lang.String getMccMncOrEmpty(android.content.Context context) {
        java.lang.String simOperator = getTelephonyManager(context).getSimOperator();
        return simOperator != null ? simOperator : "";
    }

    private static int getPackageVersionCode(android.content.Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (android.content.pm.PackageManager.NameNotFoundException e) {
            com.google.android.datatransport.runtime.logging.Logging.e(LOG_TAG, "Unable to find version code for package", e);
            return -1;
        }
    }

    @Override // com.google.android.datatransport.runtime.backends.TransportBackend
    public com.google.android.datatransport.runtime.EventInternal decorate(com.google.android.datatransport.runtime.EventInternal eventInternal) {
        android.net.NetworkInfo activeNetworkInfo = this.connectivityManager.getActiveNetworkInfo();
        return eventInternal.toBuilder().addMetadata(KEY_SDK_VERSION, android.os.Build.VERSION.SDK_INT).addMetadata("model", android.os.Build.MODEL).addMetadata(KEY_HARDWARE, android.os.Build.HARDWARE).addMetadata("device", android.os.Build.DEVICE).addMetadata("product", android.os.Build.PRODUCT).addMetadata(KEY_OS_BUILD, android.os.Build.ID).addMetadata(KEY_MANUFACTURER, android.os.Build.MANUFACTURER).addMetadata(KEY_FINGERPRINT, android.os.Build.FINGERPRINT).addMetadata(KEY_TIMEZONE_OFFSET, getTzOffset()).addMetadata(KEY_NETWORK_TYPE, getNetTypeValue(activeNetworkInfo)).addMetadata(KEY_MOBILE_SUBTYPE, getNetSubtypeValue(activeNetworkInfo)).addMetadata("country", java.util.Locale.getDefault().getCountry()).addMetadata(KEY_LOCALE, java.util.Locale.getDefault().getLanguage()).addMetadata(KEY_MCC_MNC, getMccMncOrEmpty(this.applicationContext)).addMetadata(KEY_APPLICATION_BUILD, java.lang.Integer.toString(getPackageVersionCode(this.applicationContext))).build();
    }

    private static int getNetTypeValue(android.net.NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return com.google.android.datatransport.cct.internal.NetworkConnectionInfo.NetworkType.NONE.getValue();
        }
        return networkInfo.getType();
    }

    private static int getNetSubtypeValue(android.net.NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return com.google.android.datatransport.cct.internal.NetworkConnectionInfo.MobileSubtype.UNKNOWN_MOBILE_SUBTYPE.getValue();
        }
        int subtype = networkInfo.getSubtype();
        if (subtype == -1) {
            return com.google.android.datatransport.cct.internal.NetworkConnectionInfo.MobileSubtype.COMBINED.getValue();
        }
        if (com.google.android.datatransport.cct.internal.NetworkConnectionInfo.MobileSubtype.forNumber(subtype) != null) {
            return subtype;
        }
        return 0;
    }

    private com.google.android.datatransport.cct.internal.BatchedLogRequest getRequestBody(com.google.android.datatransport.runtime.backends.BackendRequest backendRequest) {
        com.google.android.datatransport.cct.internal.LogEvent.Builder builderProtoBuilder;
        java.util.HashMap map = new java.util.HashMap();
        for (com.google.android.datatransport.runtime.EventInternal eventInternal : backendRequest.getEvents()) {
            java.lang.String transportName = eventInternal.getTransportName();
            if (!map.containsKey(transportName)) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(eventInternal);
                map.put(transportName, arrayList);
            } else {
                ((java.util.List) map.get(transportName)).add(eventInternal);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.util.Map.Entry entry : map.entrySet()) {
            com.google.android.datatransport.runtime.EventInternal eventInternal2 = (com.google.android.datatransport.runtime.EventInternal) ((java.util.List) entry.getValue()).get(0);
            com.google.android.datatransport.cct.internal.LogRequest.Builder clientInfo = com.google.android.datatransport.cct.internal.LogRequest.builder().setQosTier(com.google.android.datatransport.cct.internal.QosTier.DEFAULT).setRequestTimeMs(this.wallTimeClock.getTime()).setRequestUptimeMs(this.uptimeClock.getTime()).setClientInfo(com.google.android.datatransport.cct.internal.ClientInfo.builder().setClientType(com.google.android.datatransport.cct.internal.ClientInfo.ClientType.ANDROID_FIREBASE).setAndroidClientInfo(com.google.android.datatransport.cct.internal.AndroidClientInfo.builder().setSdkVersion(java.lang.Integer.valueOf(eventInternal2.getInteger(KEY_SDK_VERSION))).setModel(eventInternal2.get("model")).setHardware(eventInternal2.get(KEY_HARDWARE)).setDevice(eventInternal2.get("device")).setProduct(eventInternal2.get("product")).setOsBuild(eventInternal2.get(KEY_OS_BUILD)).setManufacturer(eventInternal2.get(KEY_MANUFACTURER)).setFingerprint(eventInternal2.get(KEY_FINGERPRINT)).setCountry(eventInternal2.get("country")).setLocale(eventInternal2.get(KEY_LOCALE)).setMccMnc(eventInternal2.get(KEY_MCC_MNC)).setApplicationBuild(eventInternal2.get(KEY_APPLICATION_BUILD)).build()).build());
            try {
                clientInfo.setSource(java.lang.Integer.parseInt((java.lang.String) entry.getKey()));
            } catch (java.lang.NumberFormatException unused) {
                clientInfo.setSource((java.lang.String) entry.getKey());
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            for (com.google.android.datatransport.runtime.EventInternal eventInternal3 : (java.util.List) entry.getValue()) {
                com.google.android.datatransport.runtime.EncodedPayload encodedPayload = eventInternal3.getEncodedPayload();
                com.google.android.datatransport.Encoding encoding = encodedPayload.getEncoding();
                if (encoding.equals(com.google.android.datatransport.Encoding.of("proto"))) {
                    builderProtoBuilder = com.google.android.datatransport.cct.internal.LogEvent.protoBuilder(encodedPayload.getBytes());
                } else if (encoding.equals(com.google.android.datatransport.Encoding.of("json"))) {
                    builderProtoBuilder = com.google.android.datatransport.cct.internal.LogEvent.jsonBuilder(new java.lang.String(encodedPayload.getBytes(), java.nio.charset.Charset.forName(com.adjust.sdk.Constants.ENCODING)));
                } else {
                    com.google.android.datatransport.runtime.logging.Logging.w(LOG_TAG, "Received event of unsupported encoding %s. Skipping...", encoding);
                }
                builderProtoBuilder.setEventTimeMs(eventInternal3.getEventMillis()).setEventUptimeMs(eventInternal3.getUptimeMillis()).setTimezoneOffsetSeconds(eventInternal3.getLong(KEY_TIMEZONE_OFFSET)).setNetworkConnectionInfo(com.google.android.datatransport.cct.internal.NetworkConnectionInfo.builder().setNetworkType(com.google.android.datatransport.cct.internal.NetworkConnectionInfo.NetworkType.forNumber(eventInternal3.getInteger(KEY_NETWORK_TYPE))).setMobileSubtype(com.google.android.datatransport.cct.internal.NetworkConnectionInfo.MobileSubtype.forNumber(eventInternal3.getInteger(KEY_MOBILE_SUBTYPE))).build());
                if (eventInternal3.getCode() != null) {
                    builderProtoBuilder.setEventCode(eventInternal3.getCode());
                }
                if (eventInternal3.getProductId() != null) {
                    builderProtoBuilder.setComplianceData(com.google.android.datatransport.cct.internal.ComplianceData.builder().setPrivacyContext(com.google.android.datatransport.cct.internal.ExternalPrivacyContext.builder().setPrequest(com.google.android.datatransport.cct.internal.ExternalPRequestContext.builder().setOriginAssociatedProductId(eventInternal3.getProductId()).build()).build()).setProductIdOrigin(com.google.android.datatransport.cct.internal.ComplianceData.ProductIdOrigin.EVENT_OVERRIDE).build());
                }
                if (eventInternal3.getExperimentIdsClear() != null || eventInternal3.getExperimentIdsEncrypted() != null) {
                    com.google.android.datatransport.cct.internal.ExperimentIds.Builder builder = com.google.android.datatransport.cct.internal.ExperimentIds.builder();
                    if (eventInternal3.getExperimentIdsClear() != null) {
                        builder.setClearBlob(eventInternal3.getExperimentIdsClear());
                    }
                    if (eventInternal3.getExperimentIdsEncrypted() != null) {
                        builder.setEncryptedBlob(eventInternal3.getExperimentIdsEncrypted());
                    }
                    builderProtoBuilder.setExperimentIds(builder.build());
                }
                arrayList3.add(builderProtoBuilder.build());
            }
            clientInfo.setLogEvents(arrayList3);
            arrayList2.add(clientInfo.build());
        }
        return com.google.android.datatransport.cct.internal.BatchedLogRequest.create(arrayList2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.google.android.datatransport.cct.CctTransportBackend.HttpResponse doSend(com.google.android.datatransport.cct.CctTransportBackend.HttpRequest httpRequest) throws java.io.IOException {
        com.google.android.datatransport.runtime.logging.Logging.i(LOG_TAG, "Making request to: %s", httpRequest.url);
        java.net.HttpURLConnection httpURLConnection = (java.net.HttpURLConnection) httpRequest.url.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(this.readTimeout);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty(com.google.common.net.HttpHeaders.USER_AGENT, java.lang.String.format("datatransport/%s android/", "3.3.0"));
        httpURLConnection.setRequestProperty("Content-Encoding", GZIP_CONTENT_ENCODING);
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", GZIP_CONTENT_ENCODING);
        if (httpRequest.apiKey != null) {
            httpURLConnection.setRequestProperty(API_KEY_HEADER_KEY, httpRequest.apiKey);
        }
        try {
            java.io.OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                java.util.zip.GZIPOutputStream gZIPOutputStream = new java.util.zip.GZIPOutputStream(outputStream);
                try {
                    this.dataEncoder.encode(httpRequest.requestBody, new java.io.BufferedWriter(new java.io.OutputStreamWriter(gZIPOutputStream)));
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    com.google.android.datatransport.runtime.logging.Logging.i(LOG_TAG, "Status Code: %d", java.lang.Integer.valueOf(responseCode));
                    com.google.android.datatransport.runtime.logging.Logging.d(LOG_TAG, "Content-Type: %s", httpURLConnection.getHeaderField("Content-Type"));
                    com.google.android.datatransport.runtime.logging.Logging.d(LOG_TAG, "Content-Encoding: %s", httpURLConnection.getHeaderField("Content-Encoding"));
                    if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                        return new com.google.android.datatransport.cct.CctTransportBackend.HttpResponse(responseCode, new java.net.URL(httpURLConnection.getHeaderField(com.google.common.net.HttpHeaders.LOCATION)), 0L);
                    }
                    if (responseCode != 200) {
                        return new com.google.android.datatransport.cct.CctTransportBackend.HttpResponse(responseCode, null, 0L);
                    }
                    java.io.InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        java.io.InputStream inputStreamMaybeUnGzip = maybeUnGzip(inputStream, httpURLConnection.getHeaderField("Content-Encoding"));
                        try {
                            com.google.android.datatransport.cct.CctTransportBackend.HttpResponse httpResponse = new com.google.android.datatransport.cct.CctTransportBackend.HttpResponse(responseCode, null, com.google.android.datatransport.cct.internal.LogResponse.fromJson(new java.io.BufferedReader(new java.io.InputStreamReader(inputStreamMaybeUnGzip))).getNextRequestWaitMillis());
                            if (inputStreamMaybeUnGzip != null) {
                                inputStreamMaybeUnGzip.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            return httpResponse;
                        } catch (java.lang.Throwable th) {
                            if (inputStreamMaybeUnGzip != null) {
                                try {
                                    inputStreamMaybeUnGzip.close();
                                } catch (java.lang.Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                            }
                            throw th;
                        }
                    } catch (java.lang.Throwable th3) {
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (java.lang.Throwable th4) {
                                th3.addSuppressed(th4);
                            }
                        }
                        throw th3;
                    }
                } catch (java.lang.Throwable th5) {
                    try {
                        gZIPOutputStream.close();
                    } catch (java.lang.Throwable th6) {
                        th5.addSuppressed(th6);
                    }
                    throw th5;
                }
            } catch (java.lang.Throwable th7) {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (java.lang.Throwable th8) {
                        th7.addSuppressed(th8);
                    }
                }
                throw th7;
            }
        } catch (com.google.firebase.encoders.EncodingException e) {
            e = e;
            com.google.android.datatransport.runtime.logging.Logging.e(LOG_TAG, "Couldn't encode request, returning with 400", e);
            return new com.google.android.datatransport.cct.CctTransportBackend.HttpResponse(400, null, 0L);
        } catch (java.net.ConnectException e2) {
            e = e2;
            com.google.android.datatransport.runtime.logging.Logging.e(LOG_TAG, "Couldn't open connection, returning with 500", e);
            return new com.google.android.datatransport.cct.CctTransportBackend.HttpResponse(500, null, 0L);
        } catch (java.net.UnknownHostException e3) {
            e = e3;
            com.google.android.datatransport.runtime.logging.Logging.e(LOG_TAG, "Couldn't open connection, returning with 500", e);
            return new com.google.android.datatransport.cct.CctTransportBackend.HttpResponse(500, null, 0L);
        } catch (java.io.IOException e4) {
            e = e4;
            com.google.android.datatransport.runtime.logging.Logging.e(LOG_TAG, "Couldn't encode request, returning with 400", e);
            return new com.google.android.datatransport.cct.CctTransportBackend.HttpResponse(400, null, 0L);
        }
    }

    private static java.io.InputStream maybeUnGzip(java.io.InputStream inputStream, java.lang.String str) throws java.io.IOException {
        return GZIP_CONTENT_ENCODING.equals(str) ? new java.util.zip.GZIPInputStream(inputStream) : inputStream;
    }

    @Override // com.google.android.datatransport.runtime.backends.TransportBackend
    public com.google.android.datatransport.runtime.backends.BackendResponse send(com.google.android.datatransport.runtime.backends.BackendRequest backendRequest) {
        com.google.android.datatransport.cct.internal.BatchedLogRequest requestBody = getRequestBody(backendRequest);
        java.net.URL urlOrThrow = this.endPoint;
        java.lang.String aPIKey = null;
        if (backendRequest.getExtras() != null) {
            try {
                com.google.android.datatransport.cct.CCTDestination cCTDestinationFromByteArray = com.google.android.datatransport.cct.CCTDestination.fromByteArray(backendRequest.getExtras());
                aPIKey = cCTDestinationFromByteArray.getAPIKey() != null ? cCTDestinationFromByteArray.getAPIKey() : null;
                if (cCTDestinationFromByteArray.getEndPoint() != null) {
                    urlOrThrow = parseUrlOrThrow(cCTDestinationFromByteArray.getEndPoint());
                }
            } catch (java.lang.IllegalArgumentException unused) {
                return com.google.android.datatransport.runtime.backends.BackendResponse.fatalError();
            }
        }
        try {
            com.google.android.datatransport.cct.CctTransportBackend.HttpResponse httpResponse = (com.google.android.datatransport.cct.CctTransportBackend.HttpResponse) com.google.android.datatransport.runtime.retries.Retries.retry(5, new com.google.android.datatransport.cct.CctTransportBackend.HttpRequest(urlOrThrow, requestBody, aPIKey), new com.google.android.datatransport.runtime.retries.Function() { // from class: com.google.android.datatransport.cct.CctTransportBackend$$ExternalSyntheticLambda0
                @Override // com.google.android.datatransport.runtime.retries.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return this.f$0.doSend((com.google.android.datatransport.cct.CctTransportBackend.HttpRequest) obj);
                }
            }, new com.google.android.datatransport.runtime.retries.RetryStrategy() { // from class: com.google.android.datatransport.cct.CctTransportBackend$$ExternalSyntheticLambda1
                @Override // com.google.android.datatransport.runtime.retries.RetryStrategy
                public final java.lang.Object shouldRetry(java.lang.Object obj, java.lang.Object obj2) {
                    return com.google.android.datatransport.cct.CctTransportBackend.lambda$send$0((com.google.android.datatransport.cct.CctTransportBackend.HttpRequest) obj, (com.google.android.datatransport.cct.CctTransportBackend.HttpResponse) obj2);
                }
            });
            if (httpResponse.code == 200) {
                return com.google.android.datatransport.runtime.backends.BackendResponse.ok(httpResponse.nextRequestMillis);
            }
            if (httpResponse.code < 500 && httpResponse.code != 404) {
                if (httpResponse.code == 400) {
                    return com.google.android.datatransport.runtime.backends.BackendResponse.invalidPayload();
                }
                return com.google.android.datatransport.runtime.backends.BackendResponse.fatalError();
            }
            return com.google.android.datatransport.runtime.backends.BackendResponse.transientError();
        } catch (java.io.IOException e) {
            com.google.android.datatransport.runtime.logging.Logging.e(LOG_TAG, "Could not make request to the backend", e);
            return com.google.android.datatransport.runtime.backends.BackendResponse.transientError();
        }
    }

    static /* synthetic */ com.google.android.datatransport.cct.CctTransportBackend.HttpRequest lambda$send$0(com.google.android.datatransport.cct.CctTransportBackend.HttpRequest httpRequest, com.google.android.datatransport.cct.CctTransportBackend.HttpResponse httpResponse) {
        if (httpResponse.redirectUrl == null) {
            return null;
        }
        com.google.android.datatransport.runtime.logging.Logging.d(LOG_TAG, "Following redirect to: %s", httpResponse.redirectUrl);
        return httpRequest.withUrl(httpResponse.redirectUrl);
    }

    static long getTzOffset() {
        java.util.Calendar.getInstance();
        return java.util.TimeZone.getDefault().getOffset(java.util.Calendar.getInstance().getTimeInMillis()) / 1000;
    }

    static final class HttpResponse {
        final int code;
        final long nextRequestMillis;
        final java.net.URL redirectUrl;

        HttpResponse(int i, java.net.URL url, long j) {
            this.code = i;
            this.redirectUrl = url;
            this.nextRequestMillis = j;
        }
    }

    static final class HttpRequest {
        final java.lang.String apiKey;
        final com.google.android.datatransport.cct.internal.BatchedLogRequest requestBody;
        final java.net.URL url;

        HttpRequest(java.net.URL url, com.google.android.datatransport.cct.internal.BatchedLogRequest batchedLogRequest, java.lang.String str) {
            this.url = url;
            this.requestBody = batchedLogRequest;
            this.apiKey = str;
        }

        com.google.android.datatransport.cct.CctTransportBackend.HttpRequest withUrl(java.net.URL url) {
            return new com.google.android.datatransport.cct.CctTransportBackend.HttpRequest(url, this.requestBody, this.apiKey);
        }
    }
}
