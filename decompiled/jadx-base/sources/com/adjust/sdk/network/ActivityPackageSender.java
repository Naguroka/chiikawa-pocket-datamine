package com.adjust.sdk.network;

/* JADX INFO: loaded from: classes3.dex */
public class ActivityPackageSender implements com.adjust.sdk.network.IActivityPackageSender {
    private java.lang.String basePath;
    private java.lang.String clientSdk;
    private android.content.Context context;
    private java.lang.String gdprPath;
    private java.lang.String purchaseVerificationPath;
    private java.lang.String subscriptionPath;
    private com.adjust.sdk.network.UrlStrategy urlStrategy;
    private com.adjust.sdk.ILogger logger = com.adjust.sdk.AdjustFactory.getLogger();
    private com.adjust.sdk.scheduler.ThreadExecutor executor = new com.adjust.sdk.scheduler.SingleThreadCachedScheduler("ActivityPackageSender");
    private com.adjust.sdk.network.UtilNetworking.IHttpsURLConnectionProvider httpsURLConnectionProvider = com.adjust.sdk.AdjustFactory.getHttpsURLConnectionProvider();
    private com.adjust.sdk.network.UtilNetworking.IConnectionOptions connectionOptions = com.adjust.sdk.AdjustFactory.getConnectionOptions();

    public class a implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.adjust.sdk.network.IActivityPackageSender.ResponseDataCallbackSubscriber f105a;
        public final /* synthetic */ com.adjust.sdk.ActivityPackage b;
        public final /* synthetic */ java.util.Map c;

        public a(com.adjust.sdk.network.IActivityPackageSender.ResponseDataCallbackSubscriber responseDataCallbackSubscriber, com.adjust.sdk.ActivityPackage activityPackage, java.util.Map map) {
            this.f105a = responseDataCallbackSubscriber;
            this.b = activityPackage;
            this.c = map;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f105a.onResponseDataCallback(com.adjust.sdk.network.ActivityPackageSender.this.sendActivityPackageSync(this.b, this.c));
        }
    }

    public ActivityPackageSender(java.util.List<java.lang.String> list, boolean z, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, android.content.Context context) {
        this.basePath = str;
        this.gdprPath = str2;
        this.subscriptionPath = str3;
        this.purchaseVerificationPath = str4;
        this.clientSdk = str5;
        this.context = context;
        this.urlStrategy = new com.adjust.sdk.network.UrlStrategy(com.adjust.sdk.AdjustFactory.getBaseUrl(), com.adjust.sdk.AdjustFactory.getGdprUrl(), com.adjust.sdk.AdjustFactory.getSubscriptionUrl(), com.adjust.sdk.AdjustFactory.getPurchaseVerificationUrl(), list, z);
    }

    private java.io.DataOutputStream configConnectionForGET(javax.net.ssl.HttpsURLConnection httpsURLConnection) throws java.net.ProtocolException {
        httpsURLConnection.setRequestMethod("GET");
        return null;
    }

    private java.io.DataOutputStream configConnectionForPOST(javax.net.ssl.HttpsURLConnection httpsURLConnection, java.util.Map<java.lang.String, java.lang.String> map, java.util.Map<java.lang.String, java.lang.String> map2, java.util.Map<java.lang.String, java.lang.String> map3) throws java.io.IOException {
        httpsURLConnection.setRequestMethod("POST");
        httpsURLConnection.setUseCaches(false);
        httpsURLConnection.setDoInput(true);
        httpsURLConnection.setDoOutput(true);
        java.lang.String strGeneratePOSTBodyString = generatePOSTBodyString(map, map2, map3);
        if (strGeneratePOSTBodyString == null) {
            return null;
        }
        java.io.DataOutputStream dataOutputStream = new java.io.DataOutputStream(httpsURLConnection.getOutputStream());
        dataOutputStream.writeBytes(strGeneratePOSTBodyString);
        return dataOutputStream;
    }

    private java.lang.String errorMessage(java.lang.Throwable th, java.lang.String str, com.adjust.sdk.ActivityPackage activityPackage) {
        return com.adjust.sdk.Util.formatString("%s. (%s)", activityPackage.getFailureMessage(), com.adjust.sdk.Util.getReasonString(str, th));
    }

    private static java.lang.String extractAuthorizationHeader(java.util.Map<java.lang.String, java.lang.String> map) {
        return map.remove("authorization");
    }

    private static java.lang.String extractTargetUrl(java.util.Map<java.lang.String, java.lang.String> map, com.adjust.sdk.ActivityKind activityKind, com.adjust.sdk.network.UrlStrategy urlStrategy) {
        java.lang.String strRemove = map.remove(com.json.zb.r);
        return strRemove != null ? strRemove : urlStrategy.targetUrlByActivityKind(activityKind);
    }

    private java.lang.String generatePOSTBodyString(java.util.Map<java.lang.String, java.lang.String> map, java.util.Map<java.lang.String, java.lang.String> map2, java.util.Map<java.lang.String, java.lang.String> map3) throws java.io.UnsupportedEncodingException {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (map3 == null || map3.isEmpty()) {
            if (map != null && !map.isEmpty()) {
                injectParametersToPOSTStringBuilder(map, sb);
            }
            if (map2 != null && !map2.isEmpty()) {
                injectParametersToPOSTStringBuilder(map2, sb);
            }
        } else {
            injectParametersToPOSTStringBuilder(map3, sb);
        }
        if (sb.length() > 0 && sb.charAt(sb.length() - 1) == '&') {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }

    private java.lang.String generateUrlStringForGET(com.adjust.sdk.ActivityKind activityKind, java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map, java.util.Map<java.lang.String, java.lang.String> map2, java.util.Map<java.lang.String, java.lang.String> map3) {
        java.net.URL url = new java.net.URL(urlWithExtraPathByActivityKind(activityKind, extractTargetUrl(map3, activityKind, this.urlStrategy)));
        android.net.Uri.Builder builder = new android.net.Uri.Builder();
        builder.scheme(url.getProtocol());
        builder.encodedAuthority(url.getAuthority());
        builder.path(url.getPath());
        builder.appendPath(str);
        this.logger.debug("Making request to url: %s", builder.toString());
        if (map3 == null || map3.isEmpty()) {
            if (map != null) {
                for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : map.entrySet()) {
                    builder.appendQueryParameter(entry.getKey(), entry.getValue());
                }
            }
            if (map2 != null) {
                for (java.util.Map.Entry<java.lang.String, java.lang.String> entry2 : map2.entrySet()) {
                    builder.appendQueryParameter(entry2.getKey(), entry2.getValue());
                }
            }
        } else {
            for (java.util.Map.Entry<java.lang.String, java.lang.String> entry3 : map3.entrySet()) {
                builder.appendQueryParameter(entry3.getKey(), entry3.getValue());
            }
        }
        return builder.build().toString();
    }

    private java.lang.String generateUrlStringForPOST(com.adjust.sdk.ActivityKind activityKind, java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map) {
        java.lang.String string = com.adjust.sdk.Util.formatString("%s%s", urlWithExtraPathByActivityKind(activityKind, extractTargetUrl(map, activityKind, this.urlStrategy)), str);
        this.logger.debug("Making request to url : %s", string);
        return string;
    }

    private void injectParametersToPOSTStringBuilder(java.util.Map<java.lang.String, java.lang.String> map, java.lang.StringBuilder sb) throws java.io.UnsupportedEncodingException {
        if (map == null || map.isEmpty()) {
            return;
        }
        for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : map.entrySet()) {
            java.lang.String strEncode = java.net.URLEncoder.encode(entry.getKey(), com.adjust.sdk.Constants.ENCODING);
            java.lang.String value = entry.getValue();
            java.lang.String strEncode2 = value != null ? java.net.URLEncoder.encode(value, com.adjust.sdk.Constants.ENCODING) : "";
            sb.append(strEncode);
            sb.append(com.ironsource.y8.i.b);
            sb.append(strEncode2);
            sb.append(com.ironsource.y8.i.c);
        }
    }

    private void localError(java.lang.Throwable th, java.lang.String str, com.adjust.sdk.ResponseData responseData, int i) {
        java.lang.String strErrorMessage = errorMessage(th, str, responseData.activityPackage);
        this.logger.error(strErrorMessage, new java.lang.Object[0]);
        responseData.message = strErrorMessage;
        responseData.willRetry = false;
        responseData.activityPackage.addError(i);
    }

    private void parseResponse(com.adjust.sdk.ResponseData responseData, java.lang.String str) {
        org.json.JSONObject jSONObject;
        if (str.length() == 0) {
            this.logger.error("Empty response string", new java.lang.Object[0]);
            return;
        }
        try {
            jSONObject = new org.json.JSONObject(str);
        } catch (org.json.JSONException e) {
            this.logger.error(errorMessage(e, "Failed to parse JSON response", responseData.activityPackage), new java.lang.Object[0]);
            jSONObject = null;
        }
        if (jSONObject == null) {
            return;
        }
        responseData.jsonResponse = jSONObject;
        responseData.message = com.adjust.sdk.network.UtilNetworking.extractJsonString(jSONObject, com.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE);
        responseData.adid = com.adjust.sdk.network.UtilNetworking.extractJsonString(jSONObject, "adid");
        responseData.timestamp = com.adjust.sdk.network.UtilNetworking.extractJsonString(jSONObject, com.ironsource.aa.a.d);
        java.lang.String strExtractJsonString = com.adjust.sdk.network.UtilNetworking.extractJsonString(jSONObject, "tracking_state");
        if (strExtractJsonString != null && strExtractJsonString.equals("opted_out")) {
            responseData.trackingState = com.adjust.sdk.TrackingState.OPTED_OUT;
        }
        responseData.askIn = com.adjust.sdk.network.UtilNetworking.extractJsonLong(jSONObject, "ask_in");
        responseData.retryIn = com.adjust.sdk.network.UtilNetworking.extractJsonLong(jSONObject, "retry_in");
        responseData.continueIn = com.adjust.sdk.network.UtilNetworking.extractJsonLong(jSONObject, "continue_in");
        responseData.attribution = com.adjust.sdk.Util.attributionFromJson(jSONObject.optJSONObject(com.json.z8.ATTRIBUTION), com.adjust.sdk.Util.getSdkPrefixPlatform(this.clientSdk));
        responseData.resolvedDeeplink = com.adjust.sdk.network.UtilNetworking.extractJsonString(jSONObject, "resolved_click_url");
        responseData.controlParams = jSONObject.optJSONObject("control_params");
    }

    private void remoteError(java.lang.Throwable th, java.lang.String str, com.adjust.sdk.ResponseData responseData, java.lang.Integer num) {
        java.lang.String str2 = errorMessage(th, str, responseData.activityPackage) + " Will retry later";
        this.logger.error(str2, new java.lang.Object[0]);
        responseData.message = str2;
        responseData.willRetry = true;
        responseData.activityPackage.addError(num.intValue());
    }

    private boolean shouldRetryToSend(com.adjust.sdk.ResponseData responseData) {
        if (!responseData.willRetry) {
            this.logger.debug("Will not retry with current url strategy", new java.lang.Object[0]);
            this.urlStrategy.resetAfterSuccess();
            return false;
        }
        if (this.urlStrategy.shouldRetryAfterFailure(responseData.activityKind)) {
            this.logger.error("Failed with current url strategy, but it will retry with new", new java.lang.Object[0]);
            return true;
        }
        this.logger.error("Failed with current url strategy and it will not retry", new java.lang.Object[0]);
        return false;
    }

    private java.util.Map<java.lang.String, java.lang.String> signParameters(com.adjust.sdk.ActivityPackage activityPackage, java.util.Map<java.lang.String, java.lang.String> map) {
        java.util.HashMap map2 = new java.util.HashMap(activityPackage.getParameters());
        map2.putAll(map);
        java.util.HashMap map3 = new java.util.HashMap();
        map3.put("client_sdk", activityPackage.getClientSdk());
        map3.put("activity_kind", activityPackage.getActivityKind().toString());
        map3.put(com.json.zb.r, this.urlStrategy.targetUrlByActivityKind(activityPackage.getActivityKind()));
        org.json.JSONObject controlParamsJson = com.adjust.sdk.SharedPreferencesManager.getDefaultInstance(this.context).getControlParamsJson();
        if (controlParamsJson != null) {
            java.util.Iterator<java.lang.String> itKeys = controlParamsJson.keys();
            while (itKeys.hasNext()) {
                java.lang.String next = itKeys.next();
                try {
                    if (controlParamsJson.get(next) instanceof java.lang.String) {
                        map3.put(next, (java.lang.String) controlParamsJson.get(next));
                    }
                } catch (org.json.JSONException unused) {
                    this.logger.error("JSONException while iterating control params", new java.lang.Object[0]);
                }
            }
        }
        return com.adjust.sdk.AdjustSigner.sign(map2, map3, this.context, this.logger);
    }

    private void tryToGetResponse(com.adjust.sdk.ResponseData responseData) {
        java.io.DataOutputStream dataOutputStream = null;
        try {
            try {
                try {
                    try {
                        try {
                            try {
                                try {
                                    java.lang.String strExtractAuthorizationHeader = extractAuthorizationHeader(responseData.signedParameters);
                                    boolean z = true;
                                    this.logger.verbose("authorizationHeader: %s", strExtractAuthorizationHeader);
                                    boolean z2 = responseData.activityPackage.getActivityKind() == com.adjust.sdk.ActivityKind.ATTRIBUTION;
                                    javax.net.ssl.HttpsURLConnection httpsURLConnectionGenerateHttpsURLConnection = this.httpsURLConnectionProvider.generateHttpsURLConnection(new java.net.URL(z2 ? generateUrlStringForGET(responseData.activityPackage.getActivityKind(), responseData.activityPackage.getPath(), responseData.activityPackage.getParameters(), responseData.sendingParameters, responseData.signedParameters) : generateUrlStringForPOST(responseData.activityPackage.getActivityKind(), responseData.activityPackage.getPath(), responseData.signedParameters)));
                                    this.connectionOptions.applyConnectionOptions(httpsURLConnectionGenerateHttpsURLConnection, this.clientSdk);
                                    if (strExtractAuthorizationHeader != null) {
                                        httpsURLConnectionGenerateHttpsURLConnection.setRequestProperty(com.google.common.net.HttpHeaders.AUTHORIZATION, strExtractAuthorizationHeader);
                                    }
                                    java.io.DataOutputStream dataOutputStreamConfigConnectionForGET = z2 ? configConnectionForGET(httpsURLConnectionGenerateHttpsURLConnection) : configConnectionForPOST(httpsURLConnectionGenerateHttpsURLConnection, responseData.activityPackage.getParameters(), responseData.sendingParameters, responseData.signedParameters);
                                    java.lang.Integer connectionResponse = readConnectionResponse(httpsURLConnectionGenerateHttpsURLConnection, responseData);
                                    responseData.success = responseData.jsonResponse != null && responseData.retryIn == null && connectionResponse != null && connectionResponse.intValue() == 200;
                                    org.json.JSONObject jSONObject = responseData.jsonResponse;
                                    if (jSONObject != null && responseData.retryIn == null) {
                                        z = false;
                                    }
                                    responseData.willRetry = z;
                                    if (jSONObject == null) {
                                        responseData.activityPackage.addError(1000);
                                    } else if (responseData.retryIn != null) {
                                        responseData.activityPackage.addError(1001);
                                    }
                                    if (dataOutputStreamConfigConnectionForGET != null) {
                                        try {
                                            dataOutputStreamConfigConnectionForGET.flush();
                                            dataOutputStreamConfigConnectionForGET.close();
                                        } catch (java.io.IOException e) {
                                            this.logger.error(errorMessage(e, "Flushing and closing connection output stream", responseData.activityPackage), new java.lang.Object[0]);
                                        }
                                    }
                                } catch (java.io.UnsupportedEncodingException e2) {
                                    localError(e2, "Failed to encode parameters", responseData, 1002);
                                    if (0 != 0) {
                                        try {
                                            dataOutputStream.flush();
                                            dataOutputStream.close();
                                        } catch (java.io.IOException e3) {
                                            this.logger.error(errorMessage(e3, "Flushing and closing connection output stream", responseData.activityPackage), new java.lang.Object[0]);
                                        }
                                    }
                                }
                            } catch (java.net.SocketTimeoutException e4) {
                                remoteError(e4, "Request timed out", responseData, 1005);
                                if (0 != 0) {
                                    try {
                                        dataOutputStream.flush();
                                        dataOutputStream.close();
                                    } catch (java.io.IOException e5) {
                                        this.logger.error(errorMessage(e5, "Flushing and closing connection output stream", responseData.activityPackage), new java.lang.Object[0]);
                                    }
                                }
                            }
                        } catch (java.lang.Throwable th) {
                            localError(th, "Sending SDK package", responseData, 1100);
                            if (0 != 0) {
                                try {
                                    dataOutputStream.flush();
                                    dataOutputStream.close();
                                } catch (java.io.IOException e6) {
                                    this.logger.error(errorMessage(e6, "Flushing and closing connection output stream", responseData.activityPackage), new java.lang.Object[0]);
                                }
                            }
                        }
                    } catch (java.net.ProtocolException e7) {
                        localError(e7, "Protocol Error", responseData, 1004);
                        if (0 != 0) {
                            try {
                                dataOutputStream.flush();
                                dataOutputStream.close();
                            } catch (java.io.IOException e8) {
                                this.logger.error(errorMessage(e8, "Flushing and closing connection output stream", responseData.activityPackage), new java.lang.Object[0]);
                            }
                        }
                    }
                } catch (java.net.MalformedURLException e9) {
                    localError(e9, "Malformed URL", responseData, 1003);
                    if (0 != 0) {
                        try {
                            dataOutputStream.flush();
                            dataOutputStream.close();
                        } catch (java.io.IOException e10) {
                            this.logger.error(errorMessage(e10, "Flushing and closing connection output stream", responseData.activityPackage), new java.lang.Object[0]);
                        }
                    }
                } catch (java.io.IOException e11) {
                    remoteError(e11, "Request failed", responseData, 1007);
                    if (0 != 0) {
                        try {
                            dataOutputStream.flush();
                            dataOutputStream.close();
                        } catch (java.io.IOException e12) {
                            this.logger.error(errorMessage(e12, "Flushing and closing connection output stream", responseData.activityPackage), new java.lang.Object[0]);
                        }
                    }
                }
            } catch (java.lang.Throwable th2) {
                if (0 != 0) {
                    try {
                        dataOutputStream.flush();
                        dataOutputStream.close();
                    } catch (java.io.IOException e13) {
                        this.logger.error(errorMessage(e13, "Flushing and closing connection output stream", responseData.activityPackage), new java.lang.Object[0]);
                    }
                }
                throw th2;
            }
        } catch (javax.net.ssl.SSLHandshakeException e14) {
            remoteError(e14, "Certificate failed", responseData, 1006);
            if (0 != 0) {
                try {
                    dataOutputStream.flush();
                    dataOutputStream.close();
                } catch (java.io.IOException e15) {
                    this.logger.error(errorMessage(e15, "Flushing and closing connection output stream", responseData.activityPackage), new java.lang.Object[0]);
                }
            }
        }
    }

    private java.lang.String urlWithExtraPathByActivityKind(com.adjust.sdk.ActivityKind activityKind, java.lang.String str) {
        if (activityKind == com.adjust.sdk.ActivityKind.GDPR) {
            return this.gdprPath != null ? str + this.gdprPath : str;
        }
        if (activityKind == com.adjust.sdk.ActivityKind.SUBSCRIPTION) {
            return this.subscriptionPath != null ? str + this.subscriptionPath : str;
        }
        if (activityKind == com.adjust.sdk.ActivityKind.PURCHASE_VERIFICATION) {
            return this.purchaseVerificationPath != null ? str + this.purchaseVerificationPath : str;
        }
        return this.basePath != null ? str + this.basePath : str;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0055  */
    /* JADX WARN: Code duplicated, block: B:22:0x005f  */
    /* JADX WARN: Code duplicated, block: B:24:0x0067  */
    /* JADX WARN: Code duplicated, block: B:26:0x0071  */
    /* JADX WARN: Code duplicated, block: B:28:0x0088  */
    /* JADX WARN: Code duplicated, block: B:31:0x0097 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:32:0x0098  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ac  */
    public java.lang.Integer readConnectionResponse(javax.net.ssl.HttpsURLConnection httpsURLConnection, com.adjust.sdk.ResponseData responseData) {
        java.lang.String str;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.Integer numValueOf = null;
        try {
            try {
                httpsURLConnection.connect();
                numValueOf = java.lang.Integer.valueOf(httpsURLConnection.getResponseCode());
                java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(numValueOf.intValue() >= 400 ? httpsURLConnection.getErrorStream() : httpsURLConnection.getInputStream()));
                while (true) {
                    java.lang.String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    sb.append(line);
                }
            } catch (java.io.IOException e) {
                this.logger.error(errorMessage(e, "Connecting and reading response", responseData.activityPackage), new java.lang.Object[0]);
                if (httpsURLConnection != null) {
                    break;
                }
                if (sb.length() == 0) {
                    this.logger.error("Empty response string buffer", new java.lang.Object[0]);
                    return numValueOf;
                }
                if (numValueOf.intValue() == 429) {
                    this.logger.error("Too frequent requests to the endpoint (429)", new java.lang.Object[0]);
                    return numValueOf;
                }
                java.lang.String string = sb.toString();
                this.logger.debug("Response string: %s", string);
                parseResponse(responseData, string);
                if (responseData.controlParams != null) {
                    com.adjust.sdk.SharedPreferencesManager.getDefaultInstance(this.context).saveControlParams(responseData.controlParams);
                }
                str = responseData.message;
                if (str == null) {
                    return numValueOf;
                }
                if (numValueOf.intValue() == 200) {
                    this.logger.info("Response message: %s", str);
                } else {
                    this.logger.error("Response message: %s", str);
                }
                return numValueOf;
            }
            httpsURLConnection.disconnect();
            if (sb.length() == 0) {
                this.logger.error("Empty response string buffer", new java.lang.Object[0]);
                return numValueOf;
            }
            if (numValueOf.intValue() == 429) {
                this.logger.error("Too frequent requests to the endpoint (429)", new java.lang.Object[0]);
                return numValueOf;
            }
            java.lang.String string2 = sb.toString();
            this.logger.debug("Response string: %s", string2);
            parseResponse(responseData, string2);
            if (responseData.controlParams != null) {
                com.adjust.sdk.SharedPreferencesManager.getDefaultInstance(this.context).saveControlParams(responseData.controlParams);
            }
            str = responseData.message;
            if (str == null) {
                return numValueOf;
            }
            if (numValueOf.intValue() == 200) {
                this.logger.info("Response message: %s", str);
            } else {
                this.logger.error("Response message: %s", str);
            }
            return numValueOf;
        } catch (java.lang.Throwable th) {
            if (httpsURLConnection != null) {
                httpsURLConnection.disconnect();
            }
            throw th;
        }
    }

    @Override // com.adjust.sdk.network.IActivityPackageSender
    public void sendActivityPackage(com.adjust.sdk.ActivityPackage activityPackage, java.util.Map<java.lang.String, java.lang.String> map, com.adjust.sdk.network.IActivityPackageSender.ResponseDataCallbackSubscriber responseDataCallbackSubscriber) {
        this.executor.submit(new com.adjust.sdk.network.ActivityPackageSender.a(responseDataCallbackSubscriber, activityPackage, map));
    }

    @Override // com.adjust.sdk.network.IActivityPackageSender
    public com.adjust.sdk.ResponseData sendActivityPackageSync(com.adjust.sdk.ActivityPackage activityPackage, java.util.Map<java.lang.String, java.lang.String> map) {
        com.adjust.sdk.ResponseData responseDataBuildResponseData;
        do {
            responseDataBuildResponseData = com.adjust.sdk.ResponseData.buildResponseData(activityPackage, map, signParameters(activityPackage, map));
            tryToGetResponse(responseDataBuildResponseData);
        } while (shouldRetryToSend(responseDataBuildResponseData));
        return responseDataBuildResponseData;
    }
}
