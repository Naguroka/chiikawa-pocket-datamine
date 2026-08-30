package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzdzp implements com.google.android.gms.internal.ads.zzffr {
    protected final android.content.Context zza;
    protected final java.lang.String zzb;

    public zzdzp(android.content.Context context, java.lang.String str, com.google.android.gms.internal.ads.zzbvs zzbvsVar, int i) {
        this.zza = context;
        this.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzffr
    /* JADX INFO: renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final com.google.android.gms.internal.ads.zzdzo zza(com.google.android.gms.internal.ads.zzdzn zzdznVar) throws com.google.android.gms.internal.ads.zzdvy {
        return zzc(zzdznVar.zza, zzdznVar.zzb, zzdznVar.zzc, zzdznVar.zzd, zzdznVar.zze, com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime());
    }

    protected final com.google.android.gms.internal.ads.zzdzo zzc(java.lang.String str, int i, java.util.Map map, byte[] bArr, java.lang.String str2, long j) throws java.net.MalformedURLException, com.google.android.gms.internal.ads.zzdvy {
        java.net.HttpURLConnection httpURLConnection;
        java.net.URL url;
        java.io.InputStreamReader inputStreamReader;
        try {
            com.google.android.gms.internal.ads.zzdzo zzdzoVar = new com.google.android.gms.internal.ads.zzdzo();
            com.google.android.gms.ads.internal.util.client.zzo.zzi("SDK version: " + this.zzb);
            com.google.android.gms.ads.internal.util.client.zzo.zze("AdRequestServiceImpl: Sending request: " + str);
            java.net.URL url2 = new java.net.URL(str);
            java.util.HashMap map2 = new java.util.HashMap();
            int i2 = 0;
            while (true) {
                httpURLConnection = (java.net.HttpURLConnection) url2.openConnection();
                try {
                    try {
                        com.google.android.gms.ads.internal.zzv.zzq().zzf(this.zza, this.zzb, false, httpURLConnection, false, i);
                        for (java.util.Map.Entry entry : map.entrySet()) {
                            httpURLConnection.addRequestProperty((java.lang.String) entry.getKey(), (java.lang.String) entry.getValue());
                        }
                        if (!android.text.TextUtils.isEmpty(str2)) {
                            httpURLConnection.setRequestProperty("Content-Type", str2);
                        }
                        java.io.BufferedOutputStream bufferedOutputStream = null;
                        com.google.android.gms.ads.internal.util.client.zzl zzlVar = new com.google.android.gms.ads.internal.util.client.zzl(null);
                        try {
                            zzlVar.zzc(httpURLConnection, bArr);
                        } catch (java.lang.Throwable th) {
                            com.google.android.gms.ads.internal.util.client.zzo.zzh("Network request logging failed.", th);
                            com.google.android.gms.ads.internal.zzv.zzp().zzv(th, "HttpRequestFunction.logAdRequest");
                        }
                        int length = bArr.length;
                        if (length > 0) {
                            httpURLConnection.setDoOutput(true);
                            httpURLConnection.setFixedLengthStreamingMode(length);
                            try {
                                java.io.BufferedOutputStream bufferedOutputStream2 = new java.io.BufferedOutputStream(httpURLConnection.getOutputStream());
                                try {
                                    bufferedOutputStream2.write(bArr);
                                    com.google.android.gms.common.util.IOUtils.closeQuietly(bufferedOutputStream2);
                                } catch (java.lang.Throwable th2) {
                                    th = th2;
                                    bufferedOutputStream = bufferedOutputStream2;
                                    com.google.android.gms.common.util.IOUtils.closeQuietly(bufferedOutputStream);
                                    throw th;
                                }
                            } catch (java.lang.Throwable th3) {
                                th = th3;
                            }
                        }
                        int responseCode = httpURLConnection.getResponseCode();
                        for (java.util.Map.Entry<java.lang.String, java.util.List<java.lang.String>> entry2 : httpURLConnection.getHeaderFields().entrySet()) {
                            java.lang.String key = entry2.getKey();
                            java.util.List<java.lang.String> value = entry2.getValue();
                            if (map2.containsKey(key)) {
                                ((java.util.List) map2.get(key)).addAll(value);
                            } else {
                                map2.put(key, new java.util.ArrayList(value));
                            }
                        }
                        zzlVar.zze(httpURLConnection, responseCode);
                        zzdzoVar.zza = responseCode;
                        zzdzoVar.zzb = map2;
                        zzdzoVar.zzc = "";
                        if (responseCode >= 200 && responseCode < 300) {
                            try {
                                java.io.InputStreamReader inputStreamReader2 = new java.io.InputStreamReader(httpURLConnection.getInputStream());
                                try {
                                    com.google.android.gms.ads.internal.zzv.zzq();
                                    java.lang.StringBuilder sb = new java.lang.StringBuilder(8192);
                                    char[] cArr = new char[2048];
                                    while (true) {
                                        int i3 = inputStreamReader2.read(cArr);
                                        if (i3 == -1) {
                                            break;
                                        }
                                        sb.append(cArr, 0, i3);
                                    }
                                    java.lang.String string = sb.toString();
                                    com.google.android.gms.common.util.IOUtils.closeQuietly(inputStreamReader2);
                                    zzlVar.zzg(string);
                                    zzdzoVar.zzc = string;
                                    if (android.text.TextUtils.isEmpty(string)) {
                                        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzfv)).booleanValue()) {
                                            throw new com.google.android.gms.internal.ads.zzdvy(3);
                                        }
                                    }
                                    zzdzoVar.zzd = com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime() - j;
                                    break;
                                } catch (java.lang.Throwable th4) {
                                    th = th4;
                                    inputStreamReader = inputStreamReader2;
                                    com.google.android.gms.common.util.IOUtils.closeQuietly(inputStreamReader);
                                    throw th;
                                }
                            } catch (java.lang.Throwable th5) {
                                th = th5;
                                inputStreamReader = null;
                            }
                        } else {
                            if (responseCode < 300 || responseCode >= 400) {
                                com.google.android.gms.ads.internal.util.client.zzo.zzj("Received error HTTP response code: " + responseCode);
                                throw new com.google.android.gms.internal.ads.zzdvy(1, "Received error HTTP response code: " + responseCode);
                            }
                            java.lang.String headerField = httpURLConnection.getHeaderField(com.google.common.net.HttpHeaders.LOCATION);
                            if (android.text.TextUtils.isEmpty(headerField)) {
                                com.google.android.gms.ads.internal.util.client.zzo.zzj("No location header to follow redirect.");
                                throw new com.google.android.gms.internal.ads.zzdvy(1, "No location header to follow redirect");
                            }
                            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzhH)).booleanValue()) {
                                try {
                                    url = new java.net.URI(headerField).toURL();
                                } catch (java.net.URISyntaxException e) {
                                    throw new com.google.android.gms.internal.ads.zzdvy(1, e.getMessage(), e);
                                }
                            } else {
                                url = new java.net.URL(headerField);
                            }
                            i2++;
                            if (i2 > ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzfb)).intValue()) {
                                com.google.android.gms.ads.internal.util.client.zzo.zzj("Too many redirects.");
                                throw new com.google.android.gms.internal.ads.zzdvy(1, "Too many redirects");
                            }
                            httpURLConnection.disconnect();
                            url2 = url;
                        }
                    } catch (java.lang.Throwable th6) {
                        httpURLConnection.disconnect();
                        throw th6;
                    }
                } catch (com.google.android.gms.internal.ads.zzdvy e2) {
                    if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzih)).booleanValue()) {
                        throw e2;
                    }
                    zzdzoVar.zzd = com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime() - j;
                }
            }
            httpURLConnection.disconnect();
            return zzdzoVar;
        } catch (java.io.IOException e3) {
            java.lang.String strConcat = "Error while connecting to ad server: ".concat(java.lang.String.valueOf(e3.getMessage()));
            com.google.android.gms.ads.internal.util.client.zzo.zzj(strConcat);
            throw new com.google.android.gms.internal.ads.zzdvy(1, strConcat, e3);
        }
    }
}
