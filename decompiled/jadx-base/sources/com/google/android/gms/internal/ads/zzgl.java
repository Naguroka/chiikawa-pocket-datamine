package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzgl extends com.google.android.gms.internal.ads.zzfr implements com.google.android.gms.internal.ads.zzgt {
    private final boolean zza;
    private final int zzb;
    private final int zzc;
    private final java.lang.String zzd;
    private final com.google.android.gms.internal.ads.zzgs zze;
    private final com.google.android.gms.internal.ads.zzgs zzf;
    private com.google.android.gms.internal.ads.zzgd zzg;
    private java.net.HttpURLConnection zzh;
    private java.io.InputStream zzi;
    private boolean zzj;
    private int zzk;
    private long zzl;
    private long zzm;

    /* synthetic */ zzgl(java.lang.String str, int i, int i2, boolean z, boolean z2, com.google.android.gms.internal.ads.zzgs zzgsVar, com.google.android.gms.internal.ads.zzfuo zzfuoVar, boolean z3, com.google.android.gms.internal.ads.zzgk zzgkVar) {
        super(true);
        this.zzd = str;
        this.zzb = i;
        this.zzc = i2;
        this.zza = z;
        this.zze = zzgsVar;
        this.zzf = new com.google.android.gms.internal.ads.zzgs();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0070  */
    private final java.net.HttpURLConnection zzk(java.net.URL url, int i, byte[] bArr, long j, long j2, boolean z, boolean z2, java.util.Map map) throws java.io.IOException {
        java.lang.StringBuilder sb;
        java.lang.String string;
        java.net.HttpURLConnection httpURLConnection = (java.net.HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.zzb);
        httpURLConnection.setReadTimeout(this.zzc);
        java.util.HashMap map2 = new java.util.HashMap();
        map2.putAll(this.zze.zza());
        map2.putAll(this.zzf.zza());
        map2.putAll(map);
        for (java.util.Map.Entry entry : map2.entrySet()) {
            httpURLConnection.setRequestProperty((java.lang.String) entry.getKey(), (java.lang.String) entry.getValue());
        }
        if (j != 0) {
            sb = new java.lang.StringBuilder("bytes=");
            sb.append(j);
            sb.append("-");
            if (j2 != -1) {
                sb.append((j + j2) - 1);
            }
            string = sb.toString();
        } else if (j2 == -1) {
            string = null;
        } else {
            j = 0;
            sb = new java.lang.StringBuilder("bytes=");
            sb.append(j);
            sb.append("-");
            if (j2 != -1) {
                sb.append((j + j2) - 1);
            }
            string = sb.toString();
        }
        if (string != null) {
            httpURLConnection.setRequestProperty(com.google.common.net.HttpHeaders.RANGE, string);
        }
        java.lang.String str = this.zzd;
        if (str != null) {
            httpURLConnection.setRequestProperty(com.google.common.net.HttpHeaders.USER_AGENT, str);
        }
        httpURLConnection.setRequestProperty(com.google.common.net.HttpHeaders.ACCEPT_ENCODING, true != z ? "identity" : "gzip");
        httpURLConnection.setInstanceFollowRedirects(z2);
        httpURLConnection.setDoOutput(false);
        int i2 = com.google.android.gms.internal.ads.zzgd.zzh;
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.connect();
        return httpURLConnection;
    }

    private final java.net.URL zzl(java.net.URL url, java.lang.String str, com.google.android.gms.internal.ads.zzgd zzgdVar) throws com.google.android.gms.internal.ads.zzgp {
        if (str == null) {
            throw new com.google.android.gms.internal.ads.zzgp("Null location redirect", zzgdVar, 2001, 1);
        }
        try {
            java.net.URL url2 = new java.net.URL(url, str);
            java.lang.String protocol = url2.getProtocol();
            if (!"https".equals(protocol) && !androidx.webkit.ProxyConfig.MATCH_HTTP.equals(protocol)) {
                throw new com.google.android.gms.internal.ads.zzgp("Unsupported protocol redirect: ".concat(java.lang.String.valueOf(protocol)), zzgdVar, 2001, 1);
            }
            if (this.zza || protocol.equals(url.getProtocol())) {
                return url2;
            }
            throw new com.google.android.gms.internal.ads.zzgp("Disallowed cross-protocol redirect (" + url.getProtocol() + " to " + protocol + ")", zzgdVar, 2001, 1);
        } catch (java.net.MalformedURLException e) {
            throw new com.google.android.gms.internal.ads.zzgp(e, zzgdVar, 2001, 1);
        }
    }

    private final void zzm() {
        java.net.HttpURLConnection httpURLConnection = this.zzh;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (java.lang.Exception e) {
                com.google.android.gms.internal.ads.zzdo.zzd("DefaultHttpDataSource", "Unexpected error while disconnecting", e);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002b  */
    /* JADX WARN: Code duplicated, block: B:13:0x002c A[Catch: IOException -> 0x0036, TRY_LEAVE, TryCatch #0 {IOException -> 0x0036, blocks: (B:4:0x0004, B:6:0x000d, B:9:0x0018, B:10:0x001e, B:13:0x002c), top: B:18:0x0004 }] */
    @Override // com.google.android.gms.internal.ads.zzl
    public final int zza(byte[] bArr, int i, int i2) throws com.google.android.gms.internal.ads.zzgp {
        int i3;
        if (i2 == 0) {
            return 0;
        }
        try {
            long j = this.zzl;
            if (j != -1) {
                long j2 = j - this.zzm;
                if (j2 != 0) {
                    i2 = (int) java.lang.Math.min(i2, j2);
                    java.io.InputStream inputStream = this.zzi;
                    int i4 = com.google.android.gms.internal.ads.zzei.zza;
                    i3 = inputStream.read(bArr, i, i2);
                    if (i3 == -1) {
                        this.zzm += (long) i3;
                        zzg(i3);
                        return i3;
                    }
                }
            } else {
                java.io.InputStream inputStream2 = this.zzi;
                int i5 = com.google.android.gms.internal.ads.zzei.zza;
                i3 = inputStream2.read(bArr, i, i2);
                if (i3 == -1) {
                    this.zzm += (long) i3;
                    zzg(i3);
                    return i3;
                }
            }
            return -1;
        } catch (java.io.IOException e) {
            com.google.android.gms.internal.ads.zzgd zzgdVar = this.zzg;
            int i6 = com.google.android.gms.internal.ads.zzei.zza;
            throw com.google.android.gms.internal.ads.zzgp.zza(e, zzgdVar, 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00ba  */
    @Override // com.google.android.gms.internal.ads.zzfy
    public final long zzb(com.google.android.gms.internal.ads.zzgd zzgdVar) throws com.google.android.gms.internal.ads.zzgp {
        int i;
        java.net.HttpURLConnection httpURLConnectionZzk;
        byte[] bArrZzb;
        long j;
        this.zzg = zzgdVar;
        this.zzm = 0L;
        this.zzl = 0L;
        zzi(zzgdVar);
        try {
            java.net.URL url = new java.net.URL(zzgdVar.zza.toString());
            int i2 = zzgdVar.zzb;
            byte[] bArr = zzgdVar.zzc;
            long j2 = zzgdVar.zze;
            long j3 = zzgdVar.zzf;
            boolean zZzb = zzgdVar.zzb(1);
            try {
                if (this.zza) {
                    java.net.URL urlZzl = url;
                    int i3 = 0;
                    while (true) {
                        int i4 = i3 + 1;
                        if (i3 > 20) {
                            i = 1;
                            throw new com.google.android.gms.internal.ads.zzgp(new java.net.NoRouteToHostException("Too many redirects: " + i4), zzgdVar, 2001, 1);
                        }
                        long j4 = j3;
                        long j5 = j2;
                        java.net.URL url2 = urlZzl;
                        java.net.HttpURLConnection httpURLConnectionZzk2 = zzk(urlZzl, 1, null, j2, j3, zZzb, false, zzgdVar.zzd);
                        int responseCode = httpURLConnectionZzk2.getResponseCode();
                        java.lang.String headerField = httpURLConnectionZzk2.getHeaderField(com.google.common.net.HttpHeaders.LOCATION);
                        if (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303 && responseCode != 307 && responseCode != 308) {
                            httpURLConnectionZzk = httpURLConnectionZzk2;
                            break;
                        }
                        i = 1;
                        try {
                            httpURLConnectionZzk2.disconnect();
                            urlZzl = zzl(url2, headerField, zzgdVar);
                            i3 = i4;
                            j3 = j4;
                            j2 = j5;
                        } catch (java.io.IOException e) {
                            e = e;
                        }
                        e = e;
                        zzm();
                        throw com.google.android.gms.internal.ads.zzgp.zza(e, zzgdVar, i);
                    }
                }
                httpURLConnectionZzk = zzk(url, 1, null, j2, j3, zZzb, true, zzgdVar.zzd);
                this.zzh = httpURLConnectionZzk;
                this.zzk = httpURLConnectionZzk.getResponseCode();
                java.lang.String responseMessage = httpURLConnectionZzk.getResponseMessage();
                int i5 = this.zzk;
                if (i5 < 200 || i5 > 299) {
                    java.util.Map<java.lang.String, java.util.List<java.lang.String>> headerFields = httpURLConnectionZzk.getHeaderFields();
                    if (this.zzk == 416) {
                        if (zzgdVar.zze == com.google.android.gms.internal.ads.zzgu.zzb(httpURLConnectionZzk.getHeaderField(com.google.common.net.HttpHeaders.CONTENT_RANGE))) {
                            this.zzj = true;
                            zzj(zzgdVar);
                            long j6 = zzgdVar.zzf;
                            if (j6 != -1) {
                                return j6;
                            }
                            return 0L;
                        }
                    }
                    java.io.InputStream errorStream = httpURLConnectionZzk.getErrorStream();
                    try {
                        bArrZzb = errorStream != null ? com.google.android.gms.internal.ads.zzgad.zzb(errorStream) : com.google.android.gms.internal.ads.zzei.zzf;
                    } catch (java.io.IOException unused) {
                        bArrZzb = com.google.android.gms.internal.ads.zzei.zzf;
                    }
                    byte[] bArr2 = bArrZzb;
                    zzm();
                    throw new com.google.android.gms.internal.ads.zzgr(this.zzk, responseMessage, this.zzk == 416 ? new com.google.android.gms.internal.ads.zzfz(2008) : null, headerFields, zzgdVar, bArr2);
                }
                httpURLConnectionZzk.getContentType();
                if (this.zzk == 200) {
                    j = zzgdVar.zze;
                    if (j == 0) {
                        j = 0;
                    }
                } else {
                    j = 0;
                }
                boolean zEqualsIgnoreCase = "gzip".equalsIgnoreCase(httpURLConnectionZzk.getHeaderField(com.google.common.net.HttpHeaders.CONTENT_ENCODING));
                if (zEqualsIgnoreCase) {
                    this.zzl = zzgdVar.zzf;
                } else {
                    long j7 = zzgdVar.zzf;
                    if (j7 != -1) {
                        this.zzl = j7;
                    } else {
                        long jZza = com.google.android.gms.internal.ads.zzgu.zza(httpURLConnectionZzk.getHeaderField(com.google.common.net.HttpHeaders.CONTENT_LENGTH), httpURLConnectionZzk.getHeaderField(com.google.common.net.HttpHeaders.CONTENT_RANGE));
                        this.zzl = jZza != -1 ? jZza - j : -1L;
                    }
                }
                try {
                    this.zzi = httpURLConnectionZzk.getInputStream();
                    if (zEqualsIgnoreCase) {
                        this.zzi = new java.util.zip.GZIPInputStream(this.zzi);
                    }
                    this.zzj = true;
                    zzj(zzgdVar);
                    if (j != 0) {
                        try {
                            byte[] bArr3 = new byte[4096];
                            while (j > 0) {
                                int iMin = (int) java.lang.Math.min(j, 4096L);
                                java.io.InputStream inputStream = this.zzi;
                                int i6 = com.google.android.gms.internal.ads.zzei.zza;
                                int i7 = inputStream.read(bArr3, 0, iMin);
                                if (java.lang.Thread.currentThread().isInterrupted()) {
                                    throw new com.google.android.gms.internal.ads.zzgp(new java.io.InterruptedIOException(), zzgdVar, 2000, 1);
                                }
                                if (i7 == -1) {
                                    throw new com.google.android.gms.internal.ads.zzgp(zzgdVar, 2008, 1);
                                }
                                j -= (long) i7;
                                zzg(i7);
                            }
                        } catch (java.io.IOException e2) {
                            zzm();
                            if (e2 instanceof com.google.android.gms.internal.ads.zzgp) {
                                throw ((com.google.android.gms.internal.ads.zzgp) e2);
                            }
                            throw new com.google.android.gms.internal.ads.zzgp(e2, zzgdVar, 2000, 1);
                        }
                    }
                    return this.zzl;
                } catch (java.io.IOException e3) {
                    zzm();
                    throw new com.google.android.gms.internal.ads.zzgp(e3, zzgdVar, 2000, 1);
                }
            } catch (java.io.IOException e4) {
                e = e4;
                i = 1;
            }
        } catch (java.io.IOException e5) {
            e = e5;
            i = 1;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfy
    public final android.net.Uri zzc() {
        java.net.HttpURLConnection httpURLConnection = this.zzh;
        if (httpURLConnection != null) {
            return android.net.Uri.parse(httpURLConnection.getURL().toString());
        }
        com.google.android.gms.internal.ads.zzgd zzgdVar = this.zzg;
        if (zzgdVar != null) {
            return zzgdVar.zza;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzfy
    public final void zzd() throws com.google.android.gms.internal.ads.zzgp {
        try {
            java.io.InputStream inputStream = this.zzi;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (java.io.IOException e) {
                    com.google.android.gms.internal.ads.zzgd zzgdVar = this.zzg;
                    int i = com.google.android.gms.internal.ads.zzei.zza;
                    throw new com.google.android.gms.internal.ads.zzgp(e, zzgdVar, 2000, 3);
                }
            }
            this.zzi = null;
            zzm();
            if (this.zzj) {
                this.zzj = false;
                zzh();
            }
            this.zzh = null;
            this.zzg = null;
        } catch (java.lang.Throwable th) {
            this.zzi = null;
            zzm();
            if (this.zzj) {
                this.zzj = false;
                zzh();
            }
            this.zzh = null;
            this.zzg = null;
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfr, com.google.android.gms.internal.ads.zzfy
    public final java.util.Map zze() {
        java.net.HttpURLConnection httpURLConnection = this.zzh;
        return httpURLConnection == null ? com.google.android.gms.internal.ads.zzfxq.zzd() : new com.google.android.gms.internal.ads.zzgj(httpURLConnection.getHeaderFields());
    }
}
