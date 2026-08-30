package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzcei extends com.google.android.gms.internal.ads.zzfr implements com.google.android.gms.internal.ads.zzgt {
    private static final java.util.regex.Pattern zza = java.util.regex.Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    private final int zzb;
    private final int zzc;
    private final java.lang.String zzd;
    private final com.google.android.gms.internal.ads.zzgs zze;
    private com.google.android.gms.internal.ads.zzgd zzf;
    private java.net.HttpURLConnection zzg;
    private final java.util.Queue zzh;
    private java.io.InputStream zzi;
    private boolean zzj;
    private int zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private final long zzq;
    private final long zzr;

    zzcei(java.lang.String str, com.google.android.gms.internal.ads.zzgy zzgyVar, int i, int i2, long j, long j2) {
        super(true);
        com.google.android.gms.internal.ads.zzcw.zzc(str);
        this.zzd = str;
        this.zze = new com.google.android.gms.internal.ads.zzgs();
        this.zzb = i;
        this.zzc = i2;
        this.zzh = new java.util.ArrayDeque();
        this.zzq = j;
        this.zzr = j2;
        if (zzgyVar != null) {
            zzf(zzgyVar);
        }
    }

    private final void zzl() {
        while (!this.zzh.isEmpty()) {
            try {
                ((java.net.HttpURLConnection) this.zzh.remove()).disconnect();
            } catch (java.lang.Exception e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Unexpected error while disconnecting", e);
            }
        }
        this.zzg = null;
    }

    @Override // com.google.android.gms.internal.ads.zzl
    public final int zza(byte[] bArr, int i, int i2) throws com.google.android.gms.internal.ads.zzgp {
        if (i2 == 0) {
            return 0;
        }
        try {
            long j = this.zzl;
            long j2 = this.zzm;
            if (j - j2 == 0) {
                return -1;
            }
            long j3 = this.zzn + j2;
            long j4 = i2;
            long j5 = this.zzr;
            long j6 = j3 + j4 + j5;
            long j7 = this.zzp;
            long j8 = j7 + 1;
            if (j6 > j8) {
                long j9 = this.zzo;
                if (j7 < j9) {
                    long jMin = java.lang.Math.min(j9, java.lang.Math.max(((this.zzq + j8) - j5) - 1, (-1) + j8 + j4));
                    zzk(j8, jMin, 2);
                    this.zzp = jMin;
                    j7 = jMin;
                }
            }
            int i3 = this.zzi.read(bArr, i, (int) java.lang.Math.min(j4, ((j7 + 1) - this.zzn) - this.zzm));
            if (i3 == -1) {
                throw new java.io.EOFException();
            }
            this.zzm += (long) i3;
            zzg(i3);
            return i3;
        } catch (java.io.IOException e) {
            throw new com.google.android.gms.internal.ads.zzgp(e, this.zzf, 2000, 2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfy
    public final long zzb(com.google.android.gms.internal.ads.zzgd zzgdVar) throws com.google.android.gms.internal.ads.zzgp {
        this.zzf = zzgdVar;
        this.zzm = 0L;
        long j = zzgdVar.zze;
        long j2 = zzgdVar.zzf;
        long jMin = j2 == -1 ? this.zzq : java.lang.Math.min(this.zzq, j2);
        this.zzn = j;
        java.net.HttpURLConnection httpURLConnectionZzk = zzk(j, (jMin + j) - 1, 1);
        this.zzg = httpURLConnectionZzk;
        java.lang.String headerField = httpURLConnectionZzk.getHeaderField(com.google.common.net.HttpHeaders.CONTENT_RANGE);
        if (!android.text.TextUtils.isEmpty(headerField)) {
            java.util.regex.Matcher matcher = zza.matcher(headerField);
            if (matcher.find()) {
                try {
                    java.lang.Long.parseLong(matcher.group(1));
                    long j3 = java.lang.Long.parseLong(matcher.group(2));
                    long j4 = java.lang.Long.parseLong(matcher.group(3));
                    long j5 = zzgdVar.zzf;
                    if (j5 != -1) {
                        this.zzl = j5;
                        this.zzo = java.lang.Math.max(j3, (this.zzn + j5) - 1);
                    } else {
                        this.zzl = j4 - this.zzn;
                        this.zzo = j4 - 1;
                    }
                    this.zzp = j3;
                    this.zzj = true;
                    zzj(zzgdVar);
                    return this.zzl;
                } catch (java.lang.NumberFormatException unused) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzg("Unexpected Content-Range [" + headerField + com.ironsource.y8.i.e);
                }
            }
        }
        throw new com.google.android.gms.internal.ads.zzceg(headerField, zzgdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfy
    public final android.net.Uri zzc() {
        java.net.HttpURLConnection httpURLConnection = this.zzg;
        if (httpURLConnection == null) {
            return null;
        }
        return android.net.Uri.parse(httpURLConnection.getURL().toString());
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0025 */
    @Override // com.google.android.gms.internal.ads.zzfy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzd() throws com.google.android.gms.internal.ads.zzgp {
        java.io.InputStream inputStream = this.zzi;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (java.io.IOException e) {
                throw new com.google.android.gms.internal.ads.zzgp(e, this.zzf, 2000, 3);
            }
        }
        this.zzi = null;
        zzl();
        if (this.zzj) {
            this.zzj = false;
            zzh();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfr, com.google.android.gms.internal.ads.zzfy
    public final java.util.Map zze() {
        java.net.HttpURLConnection httpURLConnection = this.zzg;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }

    final java.net.HttpURLConnection zzk(long j, long j2, int i) throws com.google.android.gms.internal.ads.zzgp {
        java.lang.String string = this.zzf.zza.toString();
        try {
            java.net.HttpURLConnection httpURLConnection = (java.net.HttpURLConnection) new java.net.URL(string).openConnection();
            httpURLConnection.setConnectTimeout(this.zzb);
            httpURLConnection.setReadTimeout(this.zzc);
            for (java.util.Map.Entry entry : this.zze.zza().entrySet()) {
                httpURLConnection.setRequestProperty((java.lang.String) entry.getKey(), (java.lang.String) entry.getValue());
            }
            httpURLConnection.setRequestProperty(com.google.common.net.HttpHeaders.RANGE, "bytes=" + j + "-" + j2);
            httpURLConnection.setRequestProperty(com.google.common.net.HttpHeaders.USER_AGENT, this.zzd);
            httpURLConnection.setRequestProperty(com.google.common.net.HttpHeaders.ACCEPT_ENCODING, "identity");
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.connect();
            this.zzh.add(httpURLConnection);
            java.lang.String string2 = this.zzf.zza.toString();
            try {
                int responseCode = httpURLConnection.getResponseCode();
                this.zzk = responseCode;
                if (responseCode < 200 || responseCode > 299) {
                    java.util.Map<java.lang.String, java.util.List<java.lang.String>> headerFields = httpURLConnection.getHeaderFields();
                    zzl();
                    throw new com.google.android.gms.internal.ads.zzceh(this.zzk, headerFields, this.zzf, i);
                }
                try {
                    java.io.InputStream inputStream = httpURLConnection.getInputStream();
                    if (this.zzi != null) {
                        inputStream = new java.io.SequenceInputStream(this.zzi, inputStream);
                    }
                    this.zzi = inputStream;
                    return httpURLConnection;
                } catch (java.io.IOException e) {
                    zzl();
                    throw new com.google.android.gms.internal.ads.zzgp(e, this.zzf, 2000, i);
                }
            } catch (java.io.IOException e2) {
                zzl();
                throw new com.google.android.gms.internal.ads.zzgp("Unable to connect to ".concat(java.lang.String.valueOf(string2)), e2, this.zzf, 2000, i);
            }
        } catch (java.io.IOException e3) {
            throw new com.google.android.gms.internal.ads.zzgp("Unable to connect to ".concat(java.lang.String.valueOf(string)), e3, this.zzf, 2000, i);
        }
    }
}
