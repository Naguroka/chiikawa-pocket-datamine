package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzhi implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzhk zza;
    private final java.net.URL zzb;
    private final byte[] zzc;
    private final com.google.android.gms.measurement.internal.zzhg zzd;
    private final java.lang.String zze;
    private final java.util.Map zzf;

    public zzhi(com.google.android.gms.measurement.internal.zzhk zzhkVar, java.lang.String str, java.net.URL url, byte[] bArr, java.util.Map map, com.google.android.gms.measurement.internal.zzhg zzhgVar) {
        this.zza = zzhkVar;
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(url);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzhgVar);
        this.zzb = url;
        this.zzc = bArr;
        this.zzd = zzhgVar;
        this.zze = str;
        this.zzf = map;
    }

    /* JADX WARN: Code duplicated, block: B:68:0x0137  */
    /* JADX WARN: Code duplicated, block: B:79:0x0176  */
    /* JADX WARN: Code duplicated, block: B:85:0x011b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x015a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Not initialized variable reg: 11, insn: 0x00f6: MOVE (r8 I:??[OBJECT, ARRAY]) = (r11 I:??[OBJECT, ARRAY]), block:B:45:0x00f5 */
    /* JADX WARN: Not initialized variable reg: 11, insn: 0x00fa: MOVE (r10 I:??[OBJECT, ARRAY]) = (r11 I:??[OBJECT, ARRAY]), block:B:47:0x00f9 */
    @Override // java.lang.Runnable
    public final void run() throws java.lang.Throwable {
        int i;
        java.net.HttpURLConnection httpURLConnection;
        java.util.Map map;
        java.io.IOException iOException;
        int responseCode;
        java.util.Map map2;
        com.google.android.gms.measurement.internal.zzhh zzhhVar;
        com.google.android.gms.measurement.internal.zzil zzilVarZzaX;
        java.util.Map map3;
        java.util.Map map4;
        java.io.InputStream inputStream;
        com.google.android.gms.measurement.internal.zzhk zzhkVar = this.zza;
        zzhkVar.zzaY();
        java.io.OutputStream outputStream = null;
        try {
            java.net.URL url = this.zzb;
            int i2 = com.google.android.gms.internal.measurement.zzcm.zzb;
            java.net.URLConnection uRLConnectionOpenConnection = url.openConnection();
            if (!(uRLConnectionOpenConnection instanceof java.net.HttpURLConnection)) {
                throw new java.io.IOException("Failed to obtain HTTP connection");
            }
            httpURLConnection = (java.net.HttpURLConnection) uRLConnectionOpenConnection;
            httpURLConnection.setDefaultUseCaches(false);
            com.google.android.gms.measurement.internal.zzio zzioVar = zzhkVar.zzu;
            zzioVar.zzf();
            httpURLConnection.setConnectTimeout(60000);
            zzioVar.zzf();
            httpURLConnection.setReadTimeout(61000);
            httpURLConnection.setInstanceFollowRedirects(false);
            httpURLConnection.setDoInput(true);
            try {
                java.util.Map map5 = this.zzf;
                if (map5 != null) {
                    for (java.util.Map.Entry entry : map5.entrySet()) {
                        httpURLConnection.addRequestProperty((java.lang.String) entry.getKey(), (java.lang.String) entry.getValue());
                    }
                }
                byte[] bArr = this.zzc;
                if (bArr != null) {
                    byte[] bArrZzB = zzhkVar.zzg.zzA().zzB(bArr);
                    com.google.android.gms.measurement.internal.zzhc zzhcVarZzj = zzioVar.zzaW().zzj();
                    int length = bArrZzB.length;
                    zzhcVarZzj.zzb("Uploading data. size", java.lang.Integer.valueOf(length));
                    httpURLConnection.setDoOutput(true);
                    httpURLConnection.addRequestProperty(com.google.common.net.HttpHeaders.CONTENT_ENCODING, "gzip");
                    httpURLConnection.setFixedLengthStreamingMode(length);
                    httpURLConnection.connect();
                    java.io.OutputStream outputStream2 = httpURLConnection.getOutputStream();
                    try {
                        outputStream2.write(bArrZzB);
                        outputStream2.close();
                    } catch (java.io.IOException e) {
                        iOException = e;
                        responseCode = 0;
                        map2 = null;
                        outputStream = outputStream2;
                        if (outputStream != null) {
                            try {
                                outputStream.close();
                            } catch (java.io.IOException e2) {
                                this.zza.zzu.zzaW().zze().zzc("Error closing HTTP compressed POST connection output stream. appId", com.google.android.gms.measurement.internal.zzhe.zzn(this.zze), e2);
                            }
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        com.google.android.gms.measurement.internal.zzhk zzhkVar2 = this.zza;
                        java.lang.String str = this.zze;
                        com.google.android.gms.measurement.internal.zzhg zzhgVar = this.zzd;
                        zzilVarZzaX = zzhkVar2.zzu.zzaX();
                        zzhhVar = new com.google.android.gms.measurement.internal.zzhh(str, zzhgVar, responseCode, iOException, null, map2, null);
                        zzilVarZzaX.zzq(zzhhVar);
                    } catch (java.lang.Throwable th) {
                        th = th;
                        map = null;
                        outputStream = outputStream2;
                        i = 0;
                        if (outputStream != null) {
                            try {
                                outputStream.close();
                            } catch (java.io.IOException e3) {
                                this.zza.zzu.zzaW().zze().zzc("Error closing HTTP compressed POST connection output stream. appId", com.google.android.gms.measurement.internal.zzhe.zzn(this.zze), e3);
                            }
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        this.zza.zzu.zzaX().zzq(new com.google.android.gms.measurement.internal.zzhh(this.zze, this.zzd, i, null, null, map, null));
                        throw th;
                    }
                }
                responseCode = httpURLConnection.getResponseCode();
                try {
                    try {
                        java.util.Map<java.lang.String, java.util.List<java.lang.String>> headerFields = httpURLConnection.getHeaderFields();
                        try {
                            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                            inputStream = httpURLConnection.getInputStream();
                            try {
                                byte[] bArr2 = new byte[1024];
                                while (true) {
                                    int i3 = inputStream.read(bArr2);
                                    if (i3 <= 0) {
                                        break;
                                    } else {
                                        byteArrayOutputStream.write(bArr2, 0, i3);
                                    }
                                }
                                byte[] byteArray = byteArrayOutputStream.toByteArray();
                                if (inputStream != null) {
                                    inputStream.close();
                                }
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                                com.google.android.gms.measurement.internal.zzhk zzhkVar3 = this.zza;
                                java.lang.String str2 = this.zze;
                                com.google.android.gms.measurement.internal.zzhg zzhgVar2 = this.zzd;
                                zzilVarZzaX = zzhkVar3.zzu.zzaX();
                                zzhhVar = new com.google.android.gms.measurement.internal.zzhh(str2, zzhgVar2, responseCode, null, byteArray, headerFields, null);
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
                    } catch (java.io.IOException e4) {
                        e = e4;
                        map2 = map4;
                        iOException = e;
                        if (outputStream != null) {
                            outputStream.close();
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        com.google.android.gms.measurement.internal.zzhk zzhkVar4 = this.zza;
                        java.lang.String str3 = this.zze;
                        com.google.android.gms.measurement.internal.zzhg zzhgVar3 = this.zzd;
                        zzilVarZzaX = zzhkVar4.zzu.zzaX();
                        zzhhVar = new com.google.android.gms.measurement.internal.zzhh(str3, zzhgVar3, responseCode, iOException, null, map2, null);
                    } catch (java.lang.Throwable th4) {
                        th = th4;
                        i = responseCode;
                        map = map3;
                        if (outputStream != null) {
                            outputStream.close();
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        this.zza.zzu.zzaX().zzq(new com.google.android.gms.measurement.internal.zzhh(this.zze, this.zzd, i, null, null, map, null));
                        throw th;
                    }
                } catch (java.io.IOException e5) {
                    e = e5;
                    map2 = null;
                    iOException = e;
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    com.google.android.gms.measurement.internal.zzhk zzhkVar5 = this.zza;
                    java.lang.String str4 = this.zze;
                    com.google.android.gms.measurement.internal.zzhg zzhgVar4 = this.zzd;
                    zzilVarZzaX = zzhkVar5.zzu.zzaX();
                    zzhhVar = new com.google.android.gms.measurement.internal.zzhh(str4, zzhgVar4, responseCode, iOException, null, map2, null);
                } catch (java.lang.Throwable th5) {
                    th = th5;
                    i = responseCode;
                    map = null;
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    this.zza.zzu.zzaX().zzq(new com.google.android.gms.measurement.internal.zzhh(this.zze, this.zzd, i, null, null, map, null));
                    throw th;
                }
            } catch (java.io.IOException e6) {
                iOException = e6;
                responseCode = 0;
                map2 = null;
            } catch (java.lang.Throwable th6) {
                th = th6;
                i = 0;
            }
            zzilVarZzaX.zzq(zzhhVar);
        } catch (java.io.IOException e7) {
            iOException = e7;
            responseCode = 0;
            httpURLConnection = null;
            map2 = null;
        } catch (java.lang.Throwable th7) {
            th = th7;
            i = 0;
            httpURLConnection = null;
            map = null;
        }
    }
}
