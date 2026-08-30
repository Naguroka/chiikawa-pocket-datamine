package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzcdn extends com.google.android.gms.internal.ads.zzcde implements com.google.android.gms.internal.ads.zzcbi {
    public static final /* synthetic */ int zzd = 0;
    private com.google.android.gms.internal.ads.zzcbj zze;
    private java.lang.String zzf;
    private boolean zzg;
    private boolean zzh;
    private com.google.android.gms.internal.ads.zzccw zzi;
    private long zzj;
    private long zzk;

    public zzcdn(com.google.android.gms.internal.ads.zzcbs zzcbsVar, com.google.android.gms.internal.ads.zzcbr zzcbrVar) {
        super(zzcbsVar);
        com.google.android.gms.internal.ads.zzcef zzcefVar = new com.google.android.gms.internal.ads.zzcef(zzcbsVar.getContext(), zzcbrVar, (com.google.android.gms.internal.ads.zzcbs) this.zzc.get(), null);
        com.google.android.gms.ads.internal.util.client.zzo.zzi("ExoPlayerAdapter initialized.");
        this.zze = zzcefVar;
        zzcefVar.zzL(this);
    }

    protected static final java.lang.String zzc(java.lang.String str) {
        return "cache:".concat(java.lang.String.valueOf(com.google.android.gms.ads.internal.util.client.zzf.zzf(str)));
    }

    private static java.lang.String zzd(java.lang.String str, java.lang.Exception exc) {
        return str + "/" + exc.getClass().getCanonicalName() + ":" + exc.getMessage();
    }

    private final void zzx(long j) {
        com.google.android.gms.ads.internal.util.zzs.zza.postDelayed(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzcdm
            @Override // java.lang.Runnable
            public final void run() throws java.lang.Throwable {
                this.zza.zzb();
            }
        }, j);
    }

    @Override // com.google.android.gms.internal.ads.zzcde, com.google.android.gms.common.api.Releasable
    public final void release() {
        com.google.android.gms.internal.ads.zzcbj zzcbjVar = this.zze;
        if (zzcbjVar != null) {
            zzcbjVar.zzL(null);
            this.zze.zzH();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbi
    public final void zzD(int i, int i2) {
    }

    public final com.google.android.gms.internal.ads.zzcbj zza() {
        synchronized (this) {
            this.zzh = true;
            notify();
        }
        this.zze.zzL(null);
        com.google.android.gms.internal.ads.zzcbj zzcbjVar = this.zze;
        this.zze = null;
        return zzcbjVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r17v4 */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v7, types: [long] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [com.google.android.gms.internal.ads.zzcde, com.google.android.gms.internal.ads.zzcdn] */
    /* JADX WARN: Type inference failed for: r3v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18, types: [com.google.android.gms.internal.ads.zzcdn] */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v2, types: [com.google.android.gms.internal.ads.zzcdn] */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22, types: [com.google.android.gms.internal.ads.zzcde, com.google.android.gms.internal.ads.zzcdn] */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26, types: [com.google.android.gms.internal.ads.zzcdn] */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.StringBuilder] */
    final /* synthetic */ void zzb() throws java.lang.Throwable {
        ?? r6;
        ?? BooleanValue;
        ?? r3;
        ?? r4;
        long j;
        java.lang.String str;
        long j2;
        java.lang.String strZzc = zzc(this.zzf);
        ?? r17 = "error";
        try {
            ?? LongValue = ((java.lang.Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzK)).longValue() * 1000;
            long jIntValue = ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzs)).intValue();
            BooleanValue = ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzbY)).booleanValue();
            try {
                synchronized (this) {
                    try {
                        long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis();
                        long j3 = this.zzj;
                        if (jCurrentTimeMillis - j3 <= LongValue) {
                            try {
                                if (this.zzg) {
                                    throw new java.io.IOException("Abort requested before buffering finished. ");
                                }
                                if (!this.zzh) {
                                    if (!this.zze.zzV()) {
                                        throw new java.io.IOException("ExoPlayer was released during preloading.");
                                    }
                                    long jZzz = this.zze.zzz();
                                    if (jZzz > 0) {
                                        long jZzv = this.zze.zzv();
                                        if (jZzv != this.zzk) {
                                            try {
                                                str = strZzc;
                                                try {
                                                    zzo(this.zzf, strZzc, jZzv, jZzz, jZzv > 0, BooleanValue != 0 ? this.zze.zzA() : -1L, BooleanValue != 0 ? this.zze.zzx() : -1L, BooleanValue != 0 ? this.zze.zzB() : -1L, com.google.android.gms.internal.ads.zzcbj.zzs(), com.google.android.gms.internal.ads.zzcbj.zzu());
                                                    BooleanValue = this;
                                                    j = jZzv;
                                                    try {
                                                        BooleanValue.zzk = j;
                                                        j2 = jZzz;
                                                        BooleanValue = BooleanValue;
                                                    } catch (java.lang.Throwable th) {
                                                        th = th;
                                                        r6 = str;
                                                        throw th;
                                                    }
                                                } catch (java.lang.Throwable th2) {
                                                    th = th2;
                                                    BooleanValue = this;
                                                    r6 = str;
                                                    throw th;
                                                }
                                            } catch (java.lang.Throwable th3) {
                                                th = th3;
                                                BooleanValue = this;
                                                r6 = strZzc;
                                                throw th;
                                            }
                                        } else {
                                            j = jZzv;
                                            str = strZzc;
                                            BooleanValue = this;
                                            j2 = jZzz;
                                        }
                                        if (j >= j2) {
                                            BooleanValue.zzj(BooleanValue.zzf, str, j2);
                                            r3 = BooleanValue;
                                        } else if (BooleanValue.zze.zzw() >= jIntValue && j > 0) {
                                            r3 = BooleanValue;
                                        }
                                    } else {
                                        r4 = this;
                                    }
                                    r4.zzx(((java.lang.Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzL)).longValue());
                                    return;
                                }
                                r3 = this;
                                com.google.android.gms.ads.internal.zzv.zzz().zzc(r3.zzi);
                            } catch (java.lang.Throwable th4) {
                                th = th4;
                                r17 = LongValue;
                                r6 = j3;
                            }
                        } else {
                            r6 = strZzc;
                            BooleanValue = this;
                            try {
                                throw new java.io.IOException("Timeout reached. Limit: " + LongValue + " ms");
                            } catch (java.lang.Throwable th5) {
                                th = th5;
                                r17 = "downloadTimeout";
                            }
                        }
                    } catch (java.lang.Throwable th6) {
                        th = th6;
                        r6 = strZzc;
                        BooleanValue = this;
                    }
                    try {
                        throw th;
                    } catch (java.lang.Exception e) {
                        e = e;
                        ?? r1 = r17;
                        com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to preload url " + BooleanValue.zzf + " Exception: " + e.getMessage());
                        com.google.android.gms.ads.internal.zzv.zzp().zzv(e, "VideoStreamExoPlayerCache.preload");
                        release();
                        BooleanValue.zzg(BooleanValue.zzf, r6, r1, zzd(r1, e));
                        r3 = BooleanValue;
                        com.google.android.gms.ads.internal.zzv.zzz().zzc(r3.zzi);
                    }
                }
            } catch (java.lang.Throwable th7) {
                th = th7;
            }
        } catch (java.lang.Exception e2) {
            e = e2;
            r6 = strZzc;
            BooleanValue = this;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcde
    public final void zzf() {
        synchronized (this) {
            this.zzg = true;
            notify();
            release();
        }
        java.lang.String str = this.zzf;
        if (str != null) {
            zzg(this.zzf, zzc(str), "externalAbort", "Programmatic precache abort.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbi
    public final void zzi(final boolean z, final long j) {
        final com.google.android.gms.internal.ads.zzcbs zzcbsVar = (com.google.android.gms.internal.ads.zzcbs) this.zzc.get();
        if (zzcbsVar != null) {
            com.google.android.gms.internal.ads.zzbzw.zzf.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzcdl
                @Override // java.lang.Runnable
                public final void run() {
                    int i = com.google.android.gms.internal.ads.zzcdn.zzd;
                    zzcbsVar.zzv(z, j);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbi
    public final void zzk(java.lang.String str, java.lang.Exception exc) {
        com.google.android.gms.ads.internal.util.client.zzo.zzk("Precache error", exc);
        com.google.android.gms.ads.internal.zzv.zzp().zzv(exc, "VideoStreamExoPlayerCache.onError");
    }

    @Override // com.google.android.gms.internal.ads.zzcbi
    public final void zzl(java.lang.String str, java.lang.Exception exc) {
        com.google.android.gms.ads.internal.util.client.zzo.zzk("Precache exception", exc);
        com.google.android.gms.ads.internal.zzv.zzp().zzv(exc, "VideoStreamExoPlayerCache.onException");
    }

    @Override // com.google.android.gms.internal.ads.zzcbi
    public final void zzm(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzcde
    public final void zzp(int i) {
        this.zze.zzJ(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcde
    public final void zzq(int i) {
        this.zze.zzK(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcde
    public final void zzr(int i) {
        this.zze.zzM(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcde
    public final void zzs(int i) {
        this.zze.zzN(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcde
    public final boolean zzt(java.lang.String str) {
        return zzu(str, new java.lang.String[]{str});
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [com.google.android.gms.internal.ads.zzcbs] */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r15v0, types: [com.google.android.gms.internal.ads.zzcde, com.google.android.gms.internal.ads.zzcdn] */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [com.google.android.gms.internal.ads.zzcdn] */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r17v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18, types: [long] */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [com.google.android.gms.internal.ads.zzcde] */
    /* JADX WARN: Type inference failed for: r5v10, types: [int] */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    @Override // com.google.android.gms.internal.ads.zzcde
    public final boolean zzu(java.lang.String str, java.lang.String[] strArr) throws java.lang.Throwable {
        ?? r6;
        java.lang.String str2;
        ?? r5;
        long j;
        ?? r1;
        java.lang.String str3;
        long j2;
        ?? r2;
        ?? r15 = this;
        ?? r13 = str;
        r15.zzf = r13;
        ?? r17 = "error";
        java.lang.String strZzc = zzc(str);
        try {
            android.net.Uri[] uriArr = new android.net.Uri[strArr.length];
            for (int i = 0; i < strArr.length; i++) {
                uriArr[i] = android.net.Uri.parse(strArr[i]);
            }
            r15.zze.zzF(uriArr, r15.zzb);
            ?? r0 = (com.google.android.gms.internal.ads.zzcbs) r15.zzc.get();
            if (r0 != 0) {
                r0.zzt(strZzc, r15);
            }
            com.google.android.gms.common.util.Clock clockZzC = com.google.android.gms.ads.internal.zzv.zzC();
            long jCurrentTimeMillis = clockZzC.currentTimeMillis();
            long jLongValue = ((java.lang.Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzL)).longValue();
            long jLongValue2 = ((java.lang.Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzK)).longValue() * 1000;
            long jIntValue = ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzs)).intValue();
            boolean zBooleanValue = ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzbY)).booleanValue();
            ?? r3 = -1;
            long j3 = jIntValue;
            r13 = r13;
            r15 = r15;
            while (true) {
                synchronized (this) {
                    try {
                        if (clockZzC.currentTimeMillis() - jCurrentTimeMillis > jLongValue2) {
                            throw new java.io.IOException("Timeout reached. Limit: " + jLongValue2 + " ms");
                        }
                        if (r15.zzg) {
                            throw new java.io.IOException("Abort requested before buffering finished. ");
                        }
                        if (!r15.zzh) {
                            if (!r15.zze.zzV()) {
                                throw new java.io.IOException("ExoPlayer was released during preloading.");
                            }
                            long jZzz = r15.zze.zzz();
                            if (jZzz > 0) {
                                long jZzv = r15.zze.zzv();
                                if (jZzv != r3) {
                                    try {
                                        long j4 = jZzz;
                                        str3 = strZzc;
                                        try {
                                            zzo(str, strZzc, jZzv, j4, jZzv > 0, zBooleanValue ? r15.zze.zzA() : -1L, zBooleanValue ? r15.zze.zzx() : -1L, zBooleanValue ? r15.zze.zzB() : -1L, com.google.android.gms.internal.ads.zzcbj.zzs(), com.google.android.gms.internal.ads.zzcbj.zzu());
                                            r2 = jZzv;
                                            j2 = jZzz;
                                            r6 = j4;
                                        } catch (java.lang.Throwable th) {
                                            th = th;
                                            r5 = this;
                                            r6 = str;
                                            str2 = str3;
                                            try {
                                                throw th;
                                            } catch (java.lang.Exception e) {
                                                e = e;
                                                ?? r4 = r17;
                                                com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to preload url " + r6 + " Exception: " + e.getMessage());
                                                com.google.android.gms.ads.internal.zzv.zzp().zzv(e, "VideoStreamExoPlayerCache.preload");
                                                release();
                                                r5.zzg(r6, str2, r4, zzd(r4, e));
                                                return false;
                                            }
                                        }
                                    } catch (java.lang.Throwable th2) {
                                        th = th2;
                                        r5 = this;
                                        r6 = str;
                                        str2 = strZzc;
                                    }
                                } else {
                                    str3 = strZzc;
                                    j2 = jZzz;
                                    r2 = r3;
                                    r6 = j3;
                                }
                                r5 = (jZzv > j2 ? 1 : (jZzv == j2 ? 0 : -1));
                                if (r5 >= 0) {
                                    zzj(str, str3, j2);
                                } else {
                                    try {
                                        com.google.android.gms.internal.ads.zzcdn zzcdnVar = this;
                                        r6 = str;
                                        str2 = str3;
                                        if (zzcdnVar.zze.zzw() < j3 || jZzv <= 0) {
                                            r1 = r2;
                                            r5 = zzcdnVar;
                                            j = j3;
                                        }
                                    } catch (java.lang.Throwable th3) {
                                        th = th3;
                                        throw th;
                                    }
                                }
                            } else {
                                j = j3;
                                jLongValue2 = jLongValue2;
                                r6 = r13;
                                str2 = strZzc;
                                r5 = r15;
                                r1 = r3;
                            }
                            try {
                                try {
                                    r5.wait(jLongValue);
                                } catch (java.lang.InterruptedException unused) {
                                    throw new java.io.IOException("Wait interrupted.");
                                }
                            } catch (java.lang.Throwable th4) {
                                th = th4;
                                r17 = r1;
                                throw th;
                            }
                        }
                        return true;
                    } catch (java.lang.Throwable th5) {
                        th = th5;
                        r6 = r13;
                        str2 = strZzc;
                        r5 = r15;
                    }
                }
                return true;
                jLongValue = jLongValue;
                r15 = r5;
                r13 = r6;
                strZzc = str2;
                j3 = j;
                jLongValue2 = jLongValue2;
                r3 = r1;
            }
        } catch (java.lang.Exception e2) {
            e = e2;
            r6 = r13;
            str2 = strZzc;
            r5 = r15;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbi
    public final void zzv() {
        com.google.android.gms.ads.internal.util.client.zzo.zzj("Precache onRenderedFirstFrame");
    }

    @Override // com.google.android.gms.internal.ads.zzcde
    public final boolean zzw(java.lang.String str, java.lang.String[] strArr, com.google.android.gms.internal.ads.zzccw zzccwVar) {
        this.zzf = str;
        this.zzi = zzccwVar;
        java.lang.String strZzc = zzc(str);
        try {
            android.net.Uri[] uriArr = new android.net.Uri[strArr.length];
            for (int i = 0; i < strArr.length; i++) {
                uriArr[i] = android.net.Uri.parse(strArr[i]);
            }
            this.zze.zzF(uriArr, this.zzb);
            com.google.android.gms.internal.ads.zzcbs zzcbsVar = (com.google.android.gms.internal.ads.zzcbs) this.zzc.get();
            if (zzcbsVar != null) {
                zzcbsVar.zzt(strZzc, this);
            }
            this.zzj = com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis();
            this.zzk = -1L;
            zzx(0L);
            return true;
        } catch (java.lang.Exception e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to preload url " + str + " Exception: " + e.getMessage());
            com.google.android.gms.ads.internal.zzv.zzp().zzv(e, "VideoStreamExoPlayerCache.preload");
            release();
            zzg(str, strZzc, "error", zzd("error", e));
            return false;
        }
    }
}
