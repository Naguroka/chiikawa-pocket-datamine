package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzma implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzmb zza;
    private final java.net.URL zzb;
    private final byte[] zzc;
    private final com.google.android.gms.measurement.internal.zzly zzd;
    private final java.lang.String zze;
    private final java.util.Map zzf;

    public zzma(com.google.android.gms.measurement.internal.zzmb zzmbVar, java.lang.String str, java.net.URL url, byte[] bArr, java.util.Map map, com.google.android.gms.measurement.internal.zzly zzlyVar) {
        this.zza = zzmbVar;
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(url);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzlyVar);
        this.zzb = url;
        this.zzc = bArr;
        this.zzd = zzlyVar;
        this.zze = str;
        this.zzf = map;
    }

    private final void zzb(final int i, final java.lang.Exception exc, final byte[] bArr, final java.util.Map map) {
        this.zza.zzu.zzaX().zzq(new java.lang.Runnable() { // from class: com.google.android.gms.measurement.internal.zzlz
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.gms.measurement.internal.zzma zzmaVar = this.zza;
                zzmaVar.zzd.zza(zzmaVar.zze, i, exc, bArr, map);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:72:0x0148  */
    /* JADX WARN: Code duplicated, block: B:84:0x0171  */
    /* JADX WARN: Code duplicated, block: B:87:0x0155 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x012c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [com.google.android.gms.measurement.internal.zzma] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.Map] */
    @Override // java.lang.Runnable
    public final void run() throws java.lang.Throwable {
        java.net.HttpURLConnection httpURLConnection;
        java.io.OutputStream outputStream;
        java.io.OutputStream outputStream2;
        ?? r6;
        ?? r7;
        java.io.OutputStream outputStream3;
        java.io.OutputStream outputStream4;
        java.io.OutputStream outputStream5;
        ?? r8;
        java.io.OutputStream outputStream6;
        ?? r9;
        java.io.InputStream inputStream;
        com.google.android.gms.measurement.internal.zzmb zzmbVar = this.zza;
        zzmbVar.zzaY();
        int i = 0;
        try {
            java.net.URL url = this.zzb;
            int i2 = com.google.android.gms.internal.measurement.zzcm.zzb;
            java.net.URLConnection uRLConnectionOpenConnection = url.openConnection();
            if (!(uRLConnectionOpenConnection instanceof java.net.HttpURLConnection)) {
                throw new java.io.IOException("Failed to obtain HTTP connection");
            }
            httpURLConnection = (java.net.HttpURLConnection) uRLConnectionOpenConnection;
            httpURLConnection.setDefaultUseCaches(false);
            com.google.android.gms.measurement.internal.zzio zzioVar = zzmbVar.zzu;
            zzioVar.zzf();
            httpURLConnection.setConnectTimeout(60000);
            zzioVar.zzf();
            httpURLConnection.setReadTimeout(61000);
            httpURLConnection.setInstanceFollowRedirects(false);
            ?? r5 = 1;
            httpURLConnection.setDoInput(true);
            try {
                try {
                    java.util.Map map = this.zzf;
                    if (map != null) {
                        for (java.util.Map.Entry entry : map.entrySet()) {
                            httpURLConnection.addRequestProperty((java.lang.String) entry.getKey(), (java.lang.String) entry.getValue());
                        }
                    }
                    byte[] bArr = this.zzc;
                    if (bArr != null) {
                        try {
                            zzioVar.zzaV();
                            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                            java.util.zip.GZIPOutputStream gZIPOutputStream = new java.util.zip.GZIPOutputStream(byteArrayOutputStream);
                            gZIPOutputStream.write(bArr);
                            gZIPOutputStream.close();
                            byteArrayOutputStream.close();
                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                            com.google.android.gms.measurement.internal.zzhc zzhcVarZzj = this.zza.zzu.zzaW().zzj();
                            int length = byteArray.length;
                            zzhcVarZzj.zzb("Uploading data. size", java.lang.Integer.valueOf(length));
                            httpURLConnection.setDoOutput(true);
                            httpURLConnection.addRequestProperty(com.google.common.net.HttpHeaders.CONTENT_ENCODING, "gzip");
                            httpURLConnection.setFixedLengthStreamingMode(length);
                            httpURLConnection.connect();
                            java.io.OutputStream outputStream7 = httpURLConnection.getOutputStream();
                            try {
                                outputStream7.write(byteArray);
                                outputStream7.close();
                                r5 = outputStream7;
                            } catch (java.io.IOException e) {
                                e = e;
                                r6 = 0;
                                outputStream4 = outputStream7;
                                if (outputStream4 != null) {
                                    try {
                                        outputStream4.close();
                                    } catch (java.io.IOException e2) {
                                        this.zza.zzu.zzaW().zze().zzc("Error closing HTTP compressed POST connection output stream. appId", com.google.android.gms.measurement.internal.zzhe.zzn(this.zze), e2);
                                    }
                                }
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                                zzb(i, e, null, r6);
                            } catch (java.lang.Throwable th) {
                                th = th;
                                r7 = 0;
                                outputStream3 = outputStream7;
                                if (outputStream3 != null) {
                                    try {
                                        outputStream3.close();
                                    } catch (java.io.IOException e3) {
                                        this.zza.zzu.zzaW().zze().zzc("Error closing HTTP compressed POST connection output stream. appId", com.google.android.gms.measurement.internal.zzhe.zzn(this.zze), e3);
                                    }
                                }
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                                zzb(i, null, null, r7);
                                throw th;
                            }
                        } catch (java.io.IOException e4) {
                            this.zza.zzu.zzaW().zze().zzb("Failed to gzip post request content", e4);
                            throw e4;
                        }
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    try {
                        try {
                            java.util.Map<java.lang.String, java.util.List<java.lang.String>> headerFields = httpURLConnection.getHeaderFields();
                            try {
                                java.io.ByteArrayOutputStream byteArrayOutputStream2 = new java.io.ByteArrayOutputStream();
                                inputStream = httpURLConnection.getInputStream();
                                try {
                                    byte[] bArr2 = new byte[1024];
                                    while (true) {
                                        int i3 = inputStream.read(bArr2);
                                        if (i3 <= 0) {
                                            break;
                                        } else {
                                            byteArrayOutputStream2.write(bArr2, 0, i3);
                                        }
                                    }
                                    byte[] byteArray2 = byteArrayOutputStream2.toByteArray();
                                    if (inputStream != null) {
                                        inputStream.close();
                                    }
                                    if (httpURLConnection != null) {
                                        httpURLConnection.disconnect();
                                    }
                                    zzb(responseCode, null, byteArray2, headerFields);
                                } catch (java.lang.Throwable th2) {
                                    th = th2;
                                    if (inputStream != null) {
                                        inputStream.close();
                                    }
                                    throw th;
                                }
                            } catch (java.lang.Throwable th3) {
                                th = th3;
                                inputStream = null;
                            }
                        } catch (java.io.IOException e5) {
                            e = e5;
                            r9 = r5;
                            outputStream6 = null;
                            java.io.IOException iOException = e;
                            i = responseCode;
                            e = iOException;
                            outputStream4 = outputStream6;
                            r6 = r9;
                            if (outputStream4 != null) {
                                outputStream4.close();
                            }
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            zzb(i, e, null, r6);
                        } catch (java.lang.Throwable th4) {
                            th = th4;
                            r8 = r5;
                            outputStream5 = null;
                            java.lang.Throwable th5 = th;
                            i = responseCode;
                            th = th5;
                            outputStream3 = outputStream5;
                            r7 = r8;
                            if (outputStream3 != null) {
                                outputStream3.close();
                            }
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            zzb(i, null, null, r7);
                            throw th;
                        }
                    } catch (java.io.IOException e6) {
                        e = e6;
                        outputStream6 = null;
                        r9 = 0;
                        java.io.IOException iOException2 = e;
                        i = responseCode;
                        e = iOException2;
                        outputStream4 = outputStream6;
                        r6 = r9;
                        if (outputStream4 != null) {
                            outputStream4.close();
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        zzb(i, e, null, r6);
                    } catch (java.lang.Throwable th6) {
                        th = th6;
                        outputStream5 = null;
                        r8 = 0;
                        java.lang.Throwable th7 = th;
                        i = responseCode;
                        th = th7;
                        outputStream3 = outputStream5;
                        r7 = r8;
                        if (outputStream3 != null) {
                            outputStream3.close();
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        zzb(i, null, null, r7);
                        throw th;
                    }
                } catch (java.lang.Throwable th8) {
                    th = th8;
                    outputStream = null;
                    r7 = outputStream;
                    outputStream3 = outputStream;
                    if (outputStream3 != null) {
                        outputStream3.close();
                    }
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    zzb(i, null, null, r7);
                    throw th;
                }
            } catch (java.io.IOException e7) {
                e = e7;
                outputStream2 = null;
                r6 = outputStream2;
                outputStream4 = outputStream2;
                if (outputStream4 != null) {
                    outputStream4.close();
                }
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                zzb(i, e, null, r6);
            }
        } catch (java.io.IOException e8) {
            e = e8;
            httpURLConnection = null;
            outputStream2 = null;
        } catch (java.lang.Throwable th9) {
            th = th9;
            httpURLConnection = null;
            outputStream = null;
        }
    }
}
