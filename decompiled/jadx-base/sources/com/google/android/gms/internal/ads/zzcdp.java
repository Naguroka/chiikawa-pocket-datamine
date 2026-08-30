package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzcdp extends com.google.android.gms.internal.ads.zzfr implements com.google.android.gms.internal.ads.zzgt {
    private static final java.util.regex.Pattern zza = java.util.regex.Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    private static final java.util.concurrent.atomic.AtomicReference zzb = new java.util.concurrent.atomic.AtomicReference();
    private final javax.net.ssl.SSLSocketFactory zzc;
    private final int zzd;
    private final int zze;
    private final java.lang.String zzf;
    private final com.google.android.gms.internal.ads.zzgs zzg;
    private com.google.android.gms.internal.ads.zzgd zzh;
    private java.net.HttpURLConnection zzi;
    private java.io.InputStream zzj;
    private boolean zzk;
    private int zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private int zzq;
    private final java.util.Set zzr;

    zzcdp(java.lang.String str, com.google.android.gms.internal.ads.zzgy zzgyVar, int i, int i2, int i3) {
        super(true);
        this.zzc = new com.google.android.gms.internal.ads.zzcdo(this);
        this.zzr = new java.util.HashSet();
        com.google.android.gms.internal.ads.zzcw.zzc(str);
        this.zzf = str;
        this.zzg = new com.google.android.gms.internal.ads.zzgs();
        this.zzd = i;
        this.zze = i2;
        this.zzq = i3;
        if (zzgyVar != null) {
            zzf(zzgyVar);
        }
    }

    private final void zzn() {
        java.net.HttpURLConnection httpURLConnection = this.zzi;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (java.lang.Exception e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Unexpected error while disconnecting", e);
            }
            this.zzi = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:120:0x026d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:126:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x00b9 A[Catch: IOException -> 0x028c, TryCatch #4 {IOException -> 0x028c, blocks: (B:3:0x000e, B:4:0x0025, B:6:0x002b, B:8:0x0035, B:9:0x003d, B:10:0x0055, B:12:0x005b, B:19:0x007f, B:21:0x0099, B:22:0x00ab, B:23:0x00b0, B:25:0x00b9, B:26:0x00c0, B:39:0x00e8, B:93:0x0231, B:95:0x023c, B:97:0x024d, B:100:0x0256, B:101:0x0265, B:103:0x026d, B:104:0x0274, B:105:0x0275, B:106:0x028b), top: B:118:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:49:0x0104  */
    /* JADX WARN: Code duplicated, block: B:87:0x0203  */
    /* JADX WARN: Code duplicated, block: B:95:0x023c A[Catch: IOException -> 0x028c, TryCatch #4 {IOException -> 0x028c, blocks: (B:3:0x000e, B:4:0x0025, B:6:0x002b, B:8:0x0035, B:9:0x003d, B:10:0x0055, B:12:0x005b, B:19:0x007f, B:21:0x0099, B:22:0x00ab, B:23:0x00b0, B:25:0x00b9, B:26:0x00c0, B:39:0x00e8, B:93:0x0231, B:95:0x023c, B:97:0x024d, B:100:0x0256, B:101:0x0265, B:103:0x026d, B:104:0x0274, B:105:0x0275, B:106:0x028b), top: B:118:0x000e }] */
    @Override // com.google.android.gms.internal.ads.zzfy
    public final long zzb(com.google.android.gms.internal.ads.zzgd zzgdVar) throws com.google.android.gms.internal.ads.zzgp {
        int responseCode;
        java.lang.String headerField;
        java.lang.String protocol;
        int responseCode2;
        com.google.android.gms.internal.ads.zzgr zzgrVar;
        long j;
        long jMax;
        this.zzh = zzgdVar;
        long j2 = 0;
        this.zzp = 0L;
        this.zzo = 0L;
        try {
            java.net.URL url = new java.net.URL(zzgdVar.zza.toString());
            byte[] bArr = zzgdVar.zzc;
            long j3 = zzgdVar.zze;
            long j4 = zzgdVar.zzf;
            boolean zZzb = zzgdVar.zzb(1);
            int i = 0;
            while (true) {
                int i2 = i + 1;
                if (i > 20) {
                    throw new java.net.NoRouteToHostException("Too many redirects: " + i2);
                }
                java.net.HttpURLConnection httpURLConnection = (java.net.HttpURLConnection) url.openConnection();
                if (httpURLConnection instanceof javax.net.ssl.HttpsURLConnection) {
                    ((javax.net.ssl.HttpsURLConnection) httpURLConnection).setSSLSocketFactory(this.zzc);
                }
                httpURLConnection.setConnectTimeout(this.zzd);
                httpURLConnection.setReadTimeout(this.zze);
                for (java.util.Map.Entry entry : this.zzg.zza().entrySet()) {
                    httpURLConnection.setRequestProperty((java.lang.String) entry.getKey(), (java.lang.String) entry.getValue());
                }
                if (j3 == j2) {
                    if (j4 != -1) {
                    }
                    httpURLConnection.setRequestProperty(com.google.common.net.HttpHeaders.USER_AGENT, this.zzf);
                    if (!zZzb) {
                        httpURLConnection.setRequestProperty(com.google.common.net.HttpHeaders.ACCEPT_ENCODING, "identity");
                    }
                    httpURLConnection.setInstanceFollowRedirects(false);
                    httpURLConnection.setDoOutput(false);
                    httpURLConnection.connect();
                    responseCode = httpURLConnection.getResponseCode();
                    if (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303 && responseCode != 307 && responseCode != 308) {
                        this.zzi = httpURLConnection;
                        try {
                            responseCode2 = httpURLConnection.getResponseCode();
                            this.zzl = responseCode2;
                            if (responseCode2 >= 200 || responseCode2 > 299) {
                                java.util.Map<java.lang.String, java.util.List<java.lang.String>> headerFields = this.zzi.getHeaderFields();
                                zzn();
                                zzgrVar = new com.google.android.gms.internal.ads.zzgr(this.zzl, null, null, headerFields, zzgdVar, com.google.android.gms.internal.ads.zzei.zzf);
                                if (this.zzl == 416) {
                                    throw zzgrVar;
                                }
                                zzgrVar.initCause(new com.google.android.gms.internal.ads.zzfz(2008));
                                throw zzgrVar;
                            }
                            if (responseCode2 == 200) {
                                j = zzgdVar.zze;
                                if (j == 0) {
                                    j = 0;
                                }
                            } else {
                                j = 0;
                            }
                            this.zzm = j;
                            if (zzgdVar.zzb(1)) {
                                this.zzn = zzgdVar.zzf;
                            } else {
                                long j5 = zzgdVar.zzf;
                                if (j5 != -1) {
                                    this.zzn = j5;
                                } else {
                                    java.net.HttpURLConnection httpURLConnection2 = this.zzi;
                                    java.lang.String headerField2 = httpURLConnection2.getHeaderField(com.google.common.net.HttpHeaders.CONTENT_LENGTH);
                                    if (android.text.TextUtils.isEmpty(headerField2)) {
                                        jMax = -1;
                                    } else {
                                        try {
                                            jMax = java.lang.Long.parseLong(headerField2);
                                        } catch (java.lang.NumberFormatException unused) {
                                            com.google.android.gms.ads.internal.util.client.zzo.zzg("Unexpected Content-Length [" + headerField2 + com.ironsource.y8.i.e);
                                            jMax = -1;
                                        }
                                    }
                                    java.lang.String headerField3 = httpURLConnection2.getHeaderField(com.google.common.net.HttpHeaders.CONTENT_RANGE);
                                    if (!android.text.TextUtils.isEmpty(headerField3)) {
                                        java.util.regex.Matcher matcher = zza.matcher(headerField3);
                                        if (matcher.find()) {
                                            try {
                                                long j6 = (java.lang.Long.parseLong(matcher.group(2)) - java.lang.Long.parseLong(matcher.group(1))) + 1;
                                                if (jMax < 0) {
                                                    jMax = j6;
                                                } else if (jMax != j6) {
                                                    com.google.android.gms.ads.internal.util.client.zzo.zzj("Inconsistent headers [" + headerField2 + "] [" + headerField3 + com.ironsource.y8.i.e);
                                                    jMax = java.lang.Math.max(jMax, j6);
                                                }
                                            } catch (java.lang.NumberFormatException unused2) {
                                                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unexpected Content-Range [" + headerField3 + com.ironsource.y8.i.e);
                                            }
                                        }
                                    }
                                    this.zzn = jMax != -1 ? jMax - this.zzm : -1L;
                                }
                            }
                            try {
                                this.zzj = this.zzi.getInputStream();
                                this.zzk = true;
                                zzj(zzgdVar);
                                return this.zzn;
                            } catch (java.io.IOException e) {
                                zzn();
                                throw new com.google.android.gms.internal.ads.zzgp(e, zzgdVar, 2000, 1);
                            }
                        } catch (java.io.IOException e2) {
                            zzn();
                            throw new com.google.android.gms.internal.ads.zzgp("Unable to connect to ".concat(java.lang.String.valueOf(zzgdVar.zza.toString())), e2, zzgdVar, 2000, 1);
                        }
                    }
                    headerField = httpURLConnection.getHeaderField(com.google.common.net.HttpHeaders.LOCATION);
                    httpURLConnection.disconnect();
                    if (headerField != null) {
                        throw new java.net.ProtocolException("Null location redirect");
                    }
                    java.net.URL url2 = new java.net.URL(url, headerField);
                    protocol = url2.getProtocol();
                    if (!"https".equals(protocol) && !androidx.webkit.ProxyConfig.MATCH_HTTP.equals(protocol)) {
                        throw new java.net.ProtocolException("Unsupported protocol redirect: ".concat(java.lang.String.valueOf(protocol)));
                    }
                    url = url2;
                    i = i2;
                    j2 = 0;
                } else {
                    j2 = j3;
                }
                java.lang.String string = "bytes=" + j2 + "-";
                if (j4 != -1) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append(string);
                    sb.append((j2 + j4) - 1);
                    string = sb.toString();
                }
                httpURLConnection.setRequestProperty(com.google.common.net.HttpHeaders.RANGE, string);
                httpURLConnection.setRequestProperty(com.google.common.net.HttpHeaders.USER_AGENT, this.zzf);
                if (!zZzb) {
                    httpURLConnection.setRequestProperty(com.google.common.net.HttpHeaders.ACCEPT_ENCODING, "identity");
                }
                httpURLConnection.setInstanceFollowRedirects(false);
                httpURLConnection.setDoOutput(false);
                httpURLConnection.connect();
                responseCode = httpURLConnection.getResponseCode();
                if (responseCode != 300) {
                    this.zzi = httpURLConnection;
                    responseCode2 = httpURLConnection.getResponseCode();
                    this.zzl = responseCode2;
                    if (responseCode2 >= 200) {
                    }
                    java.util.Map<java.lang.String, java.util.List<java.lang.String>> headerFields2 = this.zzi.getHeaderFields();
                    zzn();
                    zzgrVar = new com.google.android.gms.internal.ads.zzgr(this.zzl, null, null, headerFields2, zzgdVar, com.google.android.gms.internal.ads.zzei.zzf);
                    if (this.zzl == 416) {
                        throw zzgrVar;
                    }
                    zzgrVar.initCause(new com.google.android.gms.internal.ads.zzfz(2008));
                    throw zzgrVar;
                }
                headerField = httpURLConnection.getHeaderField(com.google.common.net.HttpHeaders.LOCATION);
                httpURLConnection.disconnect();
                if (headerField != null) {
                    throw new java.net.ProtocolException("Null location redirect");
                }
                java.net.URL url3 = new java.net.URL(url, headerField);
                protocol = url3.getProtocol();
                if (!"https".equals(protocol)) {
                    throw new java.net.ProtocolException("Unsupported protocol redirect: ".concat(java.lang.String.valueOf(protocol)));
                }
                url = url3;
                i = i2;
                j2 = 0;
            }
        } catch (java.io.IOException e3) {
            throw new com.google.android.gms.internal.ads.zzgp("Unable to connect to ".concat(java.lang.String.valueOf(zzgdVar.zza.toString())), e3, zzgdVar, 2000, 1);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfy
    public final android.net.Uri zzc() {
        java.net.HttpURLConnection httpURLConnection = this.zzi;
        if (httpURLConnection == null) {
            return null;
        }
        return android.net.Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.google.android.gms.internal.ads.zzfy
    public final void zzd() throws com.google.android.gms.internal.ads.zzgp {
        try {
            if (this.zzj != null) {
                int i = com.google.android.gms.internal.ads.zzei.zza;
                try {
                    this.zzj.close();
                } catch (java.io.IOException e) {
                    throw new com.google.android.gms.internal.ads.zzgp(e, this.zzh, 2000, 3);
                }
            }
            this.zzj = null;
            zzn();
            if (this.zzk) {
                this.zzk = false;
                zzh();
            }
            this.zzr.clear();
        } catch (java.lang.Throwable th) {
            this.zzj = null;
            zzn();
            if (this.zzk) {
                this.zzk = false;
                zzh();
            }
            this.zzr.clear();
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfr, com.google.android.gms.internal.ads.zzfy
    public final java.util.Map zze() {
        java.net.HttpURLConnection httpURLConnection = this.zzi;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }

    final void zzm(int i) {
        this.zzq = i;
        for (java.net.Socket socket : this.zzr) {
            if (!socket.isClosed()) {
                try {
                    socket.setReceiveBufferSize(this.zzq);
                } catch (java.net.SocketException e) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzk("Failed to update receive buffer size.", e);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0077 A[Catch: IOException -> 0x008e, TryCatch #0 {IOException -> 0x008e, blocks: (B:2:0x0000, B:21:0x0056, B:23:0x005e, B:26:0x0069, B:27:0x006f, B:29:0x0077, B:32:0x007e, B:33:0x0083, B:34:0x0084, B:5:0x000b, B:7:0x0016, B:8:0x001a, B:10:0x0022, B:13:0x0038, B:14:0x0042, B:15:0x0047, B:16:0x0048, B:17:0x004d, B:18:0x004e), top: B:39:0x0000 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x007d  */
    /* JADX WARN: Code duplicated, block: B:32:0x007e A[Catch: IOException -> 0x008e, TryCatch #0 {IOException -> 0x008e, blocks: (B:2:0x0000, B:21:0x0056, B:23:0x005e, B:26:0x0069, B:27:0x006f, B:29:0x0077, B:32:0x007e, B:33:0x0083, B:34:0x0084, B:5:0x000b, B:7:0x0016, B:8:0x001a, B:10:0x0022, B:13:0x0038, B:14:0x0042, B:15:0x0047, B:16:0x0048, B:17:0x004d, B:18:0x004e), top: B:39:0x0000 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0084 A[Catch: IOException -> 0x008e, TRY_LEAVE, TryCatch #0 {IOException -> 0x008e, blocks: (B:2:0x0000, B:21:0x0056, B:23:0x005e, B:26:0x0069, B:27:0x006f, B:29:0x0077, B:32:0x007e, B:33:0x0083, B:34:0x0084, B:5:0x000b, B:7:0x0016, B:8:0x001a, B:10:0x0022, B:13:0x0038, B:14:0x0042, B:15:0x0047, B:16:0x0048, B:17:0x004d, B:18:0x004e), top: B:39:0x0000 }] */
    @Override // com.google.android.gms.internal.ads.zzl
    public final int zza(byte[] bArr, int i, int i2) throws com.google.android.gms.internal.ads.zzgp {
        int i3;
        try {
            if (this.zzo != this.zzm) {
                byte[] bArr2 = (byte[]) zzb.getAndSet(null);
                if (bArr2 == null) {
                    bArr2 = new byte[4096];
                }
                while (true) {
                    long j = this.zzo;
                    long j2 = this.zzm;
                    if (j == j2) {
                        zzb.set(bArr2);
                        break;
                    }
                    int i4 = this.zzj.read(bArr2, 0, (int) java.lang.Math.min(j2 - j, bArr2.length));
                    if (java.lang.Thread.interrupted()) {
                        throw new java.io.InterruptedIOException();
                    }
                    if (i4 == -1) {
                        throw new java.io.EOFException();
                    }
                    this.zzo += (long) i4;
                    zzg(i4);
                }
            }
            if (i2 == 0) {
                return 0;
            }
            long j3 = this.zzn;
            if (j3 != -1) {
                long j4 = j3 - this.zzp;
                if (j4 != 0) {
                    i2 = (int) java.lang.Math.min(i2, j4);
                    i3 = this.zzj.read(bArr, i, i2);
                    if (i3 == -1) {
                        this.zzp += (long) i3;
                        zzg(i3);
                        return i3;
                    }
                    if (this.zzn == -1) {
                        throw new java.io.EOFException();
                    }
                }
            } else {
                i3 = this.zzj.read(bArr, i, i2);
                if (i3 == -1) {
                    this.zzp += (long) i3;
                    zzg(i3);
                    return i3;
                }
                if (this.zzn == -1) {
                    throw new java.io.EOFException();
                }
            }
            return -1;
        } catch (java.io.IOException e) {
            throw new com.google.android.gms.internal.ads.zzgp(e, this.zzh, 2000, 2);
        }
    }
}
