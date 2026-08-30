package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: compiled from: com.google.android.ump:user-messaging-platform@@3.1.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzu {
    private final android.app.Application zza;
    private final android.os.Handler zzb;
    private final java.util.concurrent.Executor zzc;
    private final com.google.android.gms.internal.consent_sdk.zzam zzd;
    private final com.google.android.gms.internal.consent_sdk.zzbk zze;
    private final com.google.android.gms.internal.consent_sdk.zzl zzf;
    private final com.google.android.gms.internal.consent_sdk.zzx zzg;
    private final com.google.android.gms.internal.consent_sdk.zze zzh;

    zzu(android.app.Application application, com.google.android.gms.internal.consent_sdk.zzab zzabVar, android.os.Handler handler, java.util.concurrent.Executor executor, com.google.android.gms.internal.consent_sdk.zzam zzamVar, com.google.android.gms.internal.consent_sdk.zzbk zzbkVar, com.google.android.gms.internal.consent_sdk.zzl zzlVar, com.google.android.gms.internal.consent_sdk.zzx zzxVar, com.google.android.gms.internal.consent_sdk.zze zzeVar) {
        this.zza = application;
        this.zzb = handler;
        this.zzc = executor;
        this.zzd = zzamVar;
        this.zze = zzbkVar;
        this.zzf = zzlVar;
        this.zzg = zzxVar;
        this.zzh = zzeVar;
    }

    private final com.google.android.gms.internal.consent_sdk.zzch zzd(com.google.android.gms.internal.consent_sdk.zzcf zzcfVar) throws com.google.android.gms.internal.consent_sdk.zzg {
        try {
            java.net.HttpURLConnection httpURLConnection = (java.net.HttpURLConnection) new java.net.URL("https://fundingchoicesmessages.google.com/a/consent").openConnection();
            httpURLConnection.setRequestProperty(com.google.common.net.HttpHeaders.USER_AGENT, android.webkit.WebSettings.getDefaultUserAgent(this.zza));
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setReadTimeout(30000);
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setRequestProperty("Content-Type", com.json.zb.L);
            java.io.OutputStreamWriter outputStreamWriter = new java.io.OutputStreamWriter(httpURLConnection.getOutputStream(), com.adjust.sdk.Constants.ENCODING);
            try {
                android.util.JsonWriter jsonWriter = new android.util.JsonWriter(outputStreamWriter);
                try {
                    jsonWriter.beginObject();
                    java.lang.String str = zzcfVar.zza;
                    if (str != null) {
                        jsonWriter.name("admob_app_id");
                        jsonWriter.value(str);
                    }
                    com.google.android.gms.internal.consent_sdk.zzcb zzcbVar = zzcfVar.zzb;
                    if (zzcbVar != null) {
                        jsonWriter.name("device_info");
                        jsonWriter.beginObject();
                        int i = zzcbVar.zzc;
                        if (i != 1) {
                            jsonWriter.name("os_type");
                            int i2 = i - 1;
                            if (i2 == 0) {
                                jsonWriter.value("UNKNOWN");
                            } else if (i2 == 1) {
                                jsonWriter.value("ANDROID");
                            }
                        }
                        java.lang.String str2 = zzcbVar.zza;
                        if (str2 != null) {
                            jsonWriter.name(com.json.ce.v);
                            jsonWriter.value(str2);
                        }
                        java.lang.Integer num = zzcbVar.zzb;
                        if (num != null) {
                            jsonWriter.name("android_api_level");
                            jsonWriter.value(num);
                        }
                        jsonWriter.endObject();
                    }
                    java.lang.String str3 = zzcfVar.zzc;
                    if (str3 != null) {
                        jsonWriter.name("language_code");
                        jsonWriter.value(str3);
                    }
                    java.lang.Boolean bool = zzcfVar.zzd;
                    if (bool != null) {
                        jsonWriter.name("tag_for_under_age_of_consent");
                        jsonWriter.value(bool.booleanValue());
                    }
                    java.util.Map map = zzcfVar.zze;
                    if (!map.isEmpty()) {
                        jsonWriter.name("stored_infos_map");
                        jsonWriter.beginObject();
                        for (java.util.Map.Entry entry : map.entrySet()) {
                            jsonWriter.name((java.lang.String) entry.getKey());
                            jsonWriter.value((java.lang.String) entry.getValue());
                        }
                        jsonWriter.endObject();
                    }
                    com.google.android.gms.internal.consent_sdk.zzcd zzcdVar = zzcfVar.zzf;
                    if (zzcdVar != null) {
                        jsonWriter.name("screen_info");
                        jsonWriter.beginObject();
                        java.lang.Integer num2 = zzcdVar.zza;
                        if (num2 != null) {
                            jsonWriter.name("width");
                            jsonWriter.value(num2);
                        }
                        java.lang.Integer num3 = zzcdVar.zzb;
                        if (num3 != null) {
                            jsonWriter.name("height");
                            jsonWriter.value(num3);
                        }
                        java.lang.Double d = zzcdVar.zzc;
                        if (d != null) {
                            jsonWriter.name("density");
                            jsonWriter.value(d);
                        }
                        java.util.List<com.google.android.gms.internal.consent_sdk.zzcc> list = zzcdVar.zzd;
                        if (!list.isEmpty()) {
                            jsonWriter.name("screen_insets");
                            jsonWriter.beginArray();
                            for (com.google.android.gms.internal.consent_sdk.zzcc zzccVar : list) {
                                jsonWriter.beginObject();
                                java.lang.Integer num4 = zzccVar.zza;
                                if (num4 != null) {
                                    jsonWriter.name("top");
                                    jsonWriter.value(num4);
                                }
                                java.lang.Integer num5 = zzccVar.zzb;
                                if (num5 != null) {
                                    jsonWriter.name(androidx.media3.extractor.text.ttml.TtmlNode.LEFT);
                                    jsonWriter.value(num5);
                                }
                                java.lang.Integer num6 = zzccVar.zzc;
                                if (num6 != null) {
                                    jsonWriter.name(androidx.media3.extractor.text.ttml.TtmlNode.RIGHT);
                                    jsonWriter.value(num6);
                                }
                                java.lang.Integer num7 = zzccVar.zzd;
                                if (num7 != null) {
                                    jsonWriter.name("bottom");
                                    jsonWriter.value(num7);
                                }
                                jsonWriter.endObject();
                            }
                            jsonWriter.endArray();
                        }
                        jsonWriter.endObject();
                    }
                    com.google.android.gms.internal.consent_sdk.zzbz zzbzVar = zzcfVar.zzg;
                    if (zzbzVar != null) {
                        jsonWriter.name("app_info");
                        jsonWriter.beginObject();
                        java.lang.String str4 = zzbzVar.zza;
                        if (str4 != null) {
                            jsonWriter.name(com.ironsource.y8.h.V);
                            jsonWriter.value(str4);
                        }
                        java.lang.String str5 = zzbzVar.zzb;
                        if (str5 != null) {
                            jsonWriter.name("publisher_display_name");
                            jsonWriter.value(str5);
                        }
                        java.lang.String str6 = zzbzVar.zzc;
                        if (str6 != null) {
                            jsonWriter.name("version");
                            jsonWriter.value(str6);
                        }
                        jsonWriter.endObject();
                    }
                    com.google.android.gms.internal.consent_sdk.zzce zzceVar = zzcfVar.zzh;
                    if (zzceVar != null) {
                        jsonWriter.name("sdk_info");
                        jsonWriter.beginObject();
                        java.lang.String str7 = zzceVar.zza;
                        if (str7 != null) {
                            jsonWriter.name("version");
                            jsonWriter.value(str7);
                        }
                        jsonWriter.endObject();
                    }
                    java.util.List list2 = zzcfVar.zzi;
                    if (!list2.isEmpty()) {
                        jsonWriter.name("debug_params");
                        jsonWriter.beginArray();
                        java.util.Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            switch ((com.google.android.gms.internal.consent_sdk.zzca) it.next()) {
                                case DEBUG_PARAM_UNKNOWN:
                                    jsonWriter.value("DEBUG_PARAM_UNKNOWN");
                                    break;
                                case ALWAYS_SHOW:
                                    jsonWriter.value("ALWAYS_SHOW");
                                    break;
                                case GEO_OVERRIDE_EEA:
                                    jsonWriter.value("GEO_OVERRIDE_EEA");
                                    break;
                                case GEO_OVERRIDE_REGULATED_US_STATE:
                                    jsonWriter.value("GEO_OVERRIDE_REGULATED_US_STATE");
                                    break;
                                case GEO_OVERRIDE_OTHER:
                                    jsonWriter.value("GEO_OVERRIDE_OTHER");
                                    break;
                                case GEO_OVERRIDE_NON_EEA:
                                    jsonWriter.value("GEO_OVERRIDE_NON_EEA");
                                    break;
                                case PREVIEWING_DEBUG_MESSAGES:
                                    jsonWriter.value("PREVIEWING_DEBUG_MESSAGES");
                                    break;
                            }
                        }
                        jsonWriter.endArray();
                    }
                    jsonWriter.endObject();
                    jsonWriter.close();
                    outputStreamWriter.close();
                    int responseCode = httpURLConnection.getResponseCode();
                    if (responseCode != 200) {
                        throw new java.io.IOException("Http error code - " + responseCode + ".\n" + new java.util.Scanner(httpURLConnection.getErrorStream()).useDelimiter("\\A").next());
                    }
                    java.lang.String headerField = httpURLConnection.getHeaderField("x-ump-using-header");
                    if (headerField != null) {
                        com.google.android.gms.internal.consent_sdk.zzch zzchVarZza = com.google.android.gms.internal.consent_sdk.zzch.zza(new android.util.JsonReader(new java.io.StringReader(headerField)));
                        zzchVarZza.zza = new java.util.Scanner(httpURLConnection.getInputStream()).useDelimiter("\\A").next();
                        return zzchVarZza;
                    }
                    java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(httpURLConnection.getInputStream(), com.adjust.sdk.Constants.ENCODING));
                    try {
                        bufferedReader.readLine();
                        android.util.JsonReader jsonReader = new android.util.JsonReader(bufferedReader);
                        try {
                            com.google.android.gms.internal.consent_sdk.zzch zzchVarZza2 = com.google.android.gms.internal.consent_sdk.zzch.zza(jsonReader);
                            jsonReader.close();
                            bufferedReader.close();
                            return zzchVarZza2;
                        } catch (java.lang.Throwable th) {
                            try {
                                jsonReader.close();
                            } catch (java.lang.Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } catch (java.lang.Throwable th3) {
                        try {
                            bufferedReader.close();
                        } catch (java.lang.Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                } catch (java.lang.Throwable th5) {
                    try {
                        jsonWriter.close();
                    } catch (java.lang.Throwable th6) {
                        th5.addSuppressed(th6);
                    }
                    throw th5;
                }
            } catch (java.lang.Throwable th7) {
                try {
                    outputStreamWriter.close();
                } catch (java.lang.Throwable th8) {
                    th7.addSuppressed(th8);
                }
                throw th7;
            }
        } catch (java.net.SocketTimeoutException e) {
            throw new com.google.android.gms.internal.consent_sdk.zzg(4, "The server timed out.", e);
        } catch (java.io.IOException e2) {
            throw new com.google.android.gms.internal.consent_sdk.zzg(2, "Error making request.", e2);
        }
    }

    final /* synthetic */ void zza(final com.google.android.ump.ConsentInformation.OnConsentInfoUpdateSuccessListener onConsentInfoUpdateSuccessListener, com.google.android.gms.internal.consent_sdk.zzz zzzVar) {
        java.util.Objects.requireNonNull(onConsentInfoUpdateSuccessListener);
        this.zzb.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzr
            @Override // java.lang.Runnable
            public final void run() {
                onConsentInfoUpdateSuccessListener.onConsentInfoUpdateSuccess();
            }
        });
        if (zzzVar.zzb != com.google.android.ump.ConsentInformation.PrivacyOptionsRequirementStatus.NOT_REQUIRED) {
            this.zze.zzc();
        }
    }

    final /* synthetic */ void zzb(android.app.Activity activity, com.google.android.ump.ConsentRequestParameters consentRequestParameters, final com.google.android.ump.ConsentInformation.OnConsentInfoUpdateSuccessListener onConsentInfoUpdateSuccessListener, final com.google.android.ump.ConsentInformation.OnConsentInfoUpdateFailureListener onConsentInfoUpdateFailureListener) {
        try {
            com.google.android.ump.ConsentDebugSettings consentDebugSettings = consentRequestParameters.getConsentDebugSettings();
            if (consentDebugSettings == null || !consentDebugSettings.isTestDevice()) {
                android.util.Log.i("UserMessagingPlatform", "Use new ConsentDebugSettings.Builder().addTestDeviceHashedId(\"" + com.google.android.gms.internal.consent_sdk.zzci.zza(this.zza) + "\") to set this as a debug device.");
            }
            final com.google.android.gms.internal.consent_sdk.zzz zzzVarZza = new com.google.android.gms.internal.consent_sdk.zzw(this.zzg, zzd(this.zzf.zzc(activity, consentRequestParameters))).zza();
            this.zzd.zzg(zzzVarZza.zza);
            this.zzd.zzi(zzzVarZza.zzb);
            this.zze.zzd(zzzVarZza.zzc);
            this.zzh.zza().execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzs
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zza(onConsentInfoUpdateSuccessListener, zzzVarZza);
                }
            });
        } catch (com.google.android.gms.internal.consent_sdk.zzg e) {
            this.zzb.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzp
                @Override // java.lang.Runnable
                public final void run() {
                    onConsentInfoUpdateFailureListener.onConsentInfoUpdateFailure(e.zza());
                }
            });
        } catch (java.lang.RuntimeException e2) {
            final com.google.android.gms.internal.consent_sdk.zzg zzgVar = new com.google.android.gms.internal.consent_sdk.zzg(1, "Caught exception when trying to request consent info update: ".concat(java.lang.String.valueOf(android.util.Log.getStackTraceString(e2))));
            this.zzb.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzq
                @Override // java.lang.Runnable
                public final void run() {
                    onConsentInfoUpdateFailureListener.onConsentInfoUpdateFailure(zzgVar.zza());
                }
            });
        }
    }

    final void zzc(final android.app.Activity activity, final com.google.android.ump.ConsentRequestParameters consentRequestParameters, final com.google.android.ump.ConsentInformation.OnConsentInfoUpdateSuccessListener onConsentInfoUpdateSuccessListener, final com.google.android.ump.ConsentInformation.OnConsentInfoUpdateFailureListener onConsentInfoUpdateFailureListener) {
        this.zzc.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzt
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzb(activity, consentRequestParameters, onConsentInfoUpdateSuccessListener, onConsentInfoUpdateFailureListener);
            }
        });
    }
}
