package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzgsv extends com.google.android.gms.internal.ads.zzgxr implements com.google.android.gms.internal.ads.zzgzd {
    private static final com.google.android.gms.internal.ads.zzgsv zza;
    private static volatile com.google.android.gms.internal.ads.zzgzk zzb;
    private int zzc;
    private com.google.android.gms.internal.ads.zzgsl zzd;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        com.google.android.gms.internal.ads.zzgsv zzgsvVar = new com.google.android.gms.internal.ads.zzgsv();
        zza = zzgsvVar;
        com.google.android.gms.internal.ads.zzgxr.zzbZ(com.google.android.gms.internal.ads.zzgsv.class, zzgsvVar);
    }

    private zzgsv() {
    }

    public static com.google.android.gms.internal.ads.zzgsu zzc() {
        return (com.google.android.gms.internal.ads.zzgsu) zza.zzaZ();
    }

    static /* synthetic */ void zzg(com.google.android.gms.internal.ads.zzgsv zzgsvVar, com.google.android.gms.internal.ads.zzgsl zzgslVar) {
        zzgslVar.getClass();
        zzgsvVar.zzd = zzgslVar;
        zzgsvVar.zzc |= 1;
    }

    public final int zza() {
        return this.zzf;
    }

    public final com.google.android.gms.internal.ads.zzgsl zzb() {
        com.google.android.gms.internal.ads.zzgsl zzgslVar = this.zzd;
        return zzgslVar == null ? com.google.android.gms.internal.ads.zzgsl.zzd() : zzgslVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgxr
    protected final java.lang.Object zzdc(com.google.android.gms.internal.ads.zzgxq zzgxqVar, java.lang.Object obj, java.lang.Object obj2) {
        int iOrdinal = zzgxqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzbQ(zza, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003\u000b\u0004\f", new java.lang.Object[]{"zzc", "zzd", "zze", "zzf", "zzg"});
        }
        if (iOrdinal == 3) {
            return new com.google.android.gms.internal.ads.zzgsv();
        }
        com.google.android.gms.internal.ads.zzgsw zzgswVar = null;
        if (iOrdinal == 4) {
            return new com.google.android.gms.internal.ads.zzgsu(zzgswVar);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.zzgzk zzgxmVar = zzb;
        if (zzgxmVar == null) {
            synchronized (com.google.android.gms.internal.ads.zzgsv.class) {
                zzgxmVar = zzb;
                if (zzgxmVar == null) {
                    zzgxmVar = new com.google.android.gms.internal.ads.zzgxm(zza);
                    zzb = zzgxmVar;
                }
            }
        }
        return zzgxmVar;
    }

    public final com.google.android.gms.internal.ads.zzgtp zzf() {
        com.google.android.gms.internal.ads.zzgtp zzgtpVarZzb = com.google.android.gms.internal.ads.zzgtp.zzb(this.zzg);
        return zzgtpVarZzb == null ? com.google.android.gms.internal.ads.zzgtp.UNRECOGNIZED : zzgtpVarZzb;
    }

    public final boolean zzj() {
        return (this.zzc & 1) != 0;
    }

    public final int zzk() {
        int i = this.zze;
        int i2 = 2;
        if (i != 0) {
            if (i == 1) {
                i2 = 3;
            } else if (i != 2) {
                i2 = i != 3 ? 0 : 5;
            } else {
                i2 = 4;
            }
        }
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }
}
