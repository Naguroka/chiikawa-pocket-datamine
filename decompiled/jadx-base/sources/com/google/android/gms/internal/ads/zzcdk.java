package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzcdk extends com.google.android.gms.internal.ads.zzcde implements com.google.android.gms.internal.ads.zzgy {
    private static final java.util.concurrent.atomic.AtomicInteger zzd = new java.util.concurrent.atomic.AtomicInteger(0);
    private java.lang.String zze;
    private final com.google.android.gms.internal.ads.zzcbr zzf;
    private boolean zzg;
    private final com.google.android.gms.internal.ads.zzcdj zzh;
    private final com.google.android.gms.internal.ads.zzcco zzi;
    private java.nio.ByteBuffer zzj;
    private boolean zzk;
    private final java.lang.Object zzl;
    private final java.lang.String zzm;
    private final int zzn;
    private boolean zzo;

    public zzcdk(com.google.android.gms.internal.ads.zzcbs zzcbsVar, com.google.android.gms.internal.ads.zzcbr zzcbrVar) {
        super(zzcbsVar);
        this.zzf = zzcbrVar;
        this.zzh = new com.google.android.gms.internal.ads.zzcdj();
        this.zzi = new com.google.android.gms.internal.ads.zzcco();
        this.zzl = new java.lang.Object();
        this.zzm = (java.lang.String) com.google.android.gms.internal.ads.zzful.zzd(zzcbsVar != null ? zzcbsVar.zzr() : null).zzb("");
        this.zzn = zzcbsVar != null ? zzcbsVar.zzf() : 0;
        zzd.incrementAndGet();
    }

    public static int zzi() {
        return zzd.get();
    }

    protected static final java.lang.String zzv(java.lang.String str) {
        return "cache:".concat(java.lang.String.valueOf(com.google.android.gms.ads.internal.util.client.zzf.zzf(str)));
    }

    private final void zzx() {
        int iZza = (int) this.zzh.zza();
        int iZza2 = (int) this.zzi.zza(this.zzj);
        int iPosition = this.zzj.position();
        int iRound = java.lang.Math.round(iZza2 * (iPosition / iZza));
        int iZzs = com.google.android.gms.internal.ads.zzcbj.zzs();
        int iZzu = com.google.android.gms.internal.ads.zzcbj.zzu();
        java.lang.String str = this.zze;
        zzn(str, zzv(str), iPosition, iZza, iRound, iZza2, iRound > 0, iZzs, iZzu);
    }

    @Override // com.google.android.gms.internal.ads.zzcde, com.google.android.gms.common.api.Releasable
    public final void release() {
        zzd.decrementAndGet();
    }

    @Override // com.google.android.gms.internal.ads.zzgy
    public final void zza(com.google.android.gms.internal.ads.zzfy zzfyVar, com.google.android.gms.internal.ads.zzgd zzgdVar, boolean z, int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzgy
    public final void zzb(com.google.android.gms.internal.ads.zzfy zzfyVar, com.google.android.gms.internal.ads.zzgd zzgdVar, boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzgy
    public final void zzc(com.google.android.gms.internal.ads.zzfy zzfyVar, com.google.android.gms.internal.ads.zzgd zzgdVar, boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzgy
    public final void zzd(com.google.android.gms.internal.ads.zzfy zzfyVar, com.google.android.gms.internal.ads.zzgd zzgdVar, boolean z) {
        if (zzfyVar instanceof com.google.android.gms.internal.ads.zzgl) {
            this.zzh.zzb((com.google.android.gms.internal.ads.zzgl) zzfyVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcde
    public final void zzf() {
        this.zzg = true;
    }

    public final java.lang.String zzk() {
        return this.zze;
    }

    public final java.nio.ByteBuffer zzl() {
        synchronized (this.zzl) {
            java.nio.ByteBuffer byteBuffer = this.zzj;
            if (byteBuffer != null && !this.zzk) {
                byteBuffer.flip();
                this.zzk = true;
            }
            this.zzg = true;
        }
        return this.zzj;
    }

    public final boolean zzm() {
        return this.zzo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:? -> B:45:0x0149). Please report as a decompilation issue!!! */
    @Override // com.google.android.gms.internal.ads.zzcde
    public final boolean zzt(java.lang.String str) throws java.lang.Throwable {
        java.lang.String str2;
        this.zze = str;
        java.lang.String str3 = "error";
        java.lang.String strZzv = zzv(str);
        int i = 0;
        try {
            com.google.android.gms.internal.ads.zzgg zzggVar = new com.google.android.gms.internal.ads.zzgg();
            zzggVar.zzf(this.zzb);
            zzggVar.zzc(this.zzf.zzd);
            zzggVar.zzd(this.zzf.zze);
            zzggVar.zzb(true);
            zzggVar.zze(this);
            com.google.android.gms.internal.ads.zzfy zzfyVarZza = zzggVar.zza();
            if (this.zzf.zzi) {
                zzfyVarZza = new com.google.android.gms.internal.ads.zzccm(this.zza, zzfyVarZza, this.zzm, this.zzn, null, null);
            }
            zzfyVarZza.zzb(new com.google.android.gms.internal.ads.zzgd(android.net.Uri.parse(str), 0L, -1L, null));
            com.google.android.gms.internal.ads.zzcbs zzcbsVar = (com.google.android.gms.internal.ads.zzcbs) this.zzc.get();
            if (zzcbsVar != null) {
                zzcbsVar.zzt(strZzv, this);
            }
            com.google.android.gms.common.util.Clock clockZzC = com.google.android.gms.ads.internal.zzv.zzC();
            long jCurrentTimeMillis = clockZzC.currentTimeMillis();
            long jLongValue = ((java.lang.Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzL)).longValue();
            long jLongValue2 = ((java.lang.Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzK)).longValue();
            this.zzj = java.nio.ByteBuffer.allocate(this.zzf.zzc);
            int i2 = 8192;
            byte[] bArr = new byte[8192];
            long j = jCurrentTimeMillis;
            while (true) {
                int iZza = zzfyVarZza.zza(bArr, i, java.lang.Math.min(this.zzj.remaining(), i2));
                if (iZza == -1) {
                    this.zzo = true;
                    zzj(str, strZzv, (int) this.zzi.zza(this.zzj));
                    break;
                }
                synchronized (this.zzl) {
                    try {
                        if (!this.zzg) {
                            try {
                                this.zzj.put(bArr, 0, iZza);
                            } catch (java.lang.Throwable th) {
                                th = th;
                                throw th;
                            }
                        }
                        try {
                            if (this.zzj.remaining() <= 0) {
                                zzx();
                                break;
                            }
                            str2 = 1;
                            try {
                                if (this.zzg) {
                                    throw new java.io.IOException("Precache abort at " + this.zzj.limit() + " bytes");
                                }
                                long jCurrentTimeMillis2 = clockZzC.currentTimeMillis();
                                if (jCurrentTimeMillis2 - j >= jLongValue) {
                                    zzx();
                                    j = jCurrentTimeMillis2;
                                }
                                if (jCurrentTimeMillis2 - jCurrentTimeMillis > 1000 * jLongValue2) {
                                    throw new java.io.IOException("Timeout exceeded. Limit: " + jLongValue2 + " sec");
                                }
                                str3 = str3;
                                i = 0;
                                i2 = 8192;
                            } catch (java.lang.Exception e) {
                                e = e;
                                java.lang.String str4 = e.getClass().getCanonicalName() + ":" + e.getMessage();
                                com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to preload url " + str + " Exception: " + str4);
                                zzg(str, strZzv, str2, str4);
                                return false;
                            }
                        } catch (java.lang.Exception e2) {
                            e = e2;
                            str2 = str3;
                            java.lang.String str5 = e.getClass().getCanonicalName() + ":" + e.getMessage();
                            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to preload url " + str + " Exception: " + str5);
                            zzg(str, strZzv, str2, str5);
                            return false;
                        }
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
            }
            return true;
        } catch (java.lang.Exception e3) {
            e = e3;
            str3 = str3;
        }
    }
}
