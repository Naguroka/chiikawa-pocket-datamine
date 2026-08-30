package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzgqb extends com.google.android.gms.internal.ads.zzgxr implements com.google.android.gms.internal.ads.zzgzd {
    private static final com.google.android.gms.internal.ads.zzgqb zza;
    private static volatile com.google.android.gms.internal.ads.zzgzk zzb;
    private int zzc;
    private int zzd;
    private com.google.android.gms.internal.ads.zzgwj zze = com.google.android.gms.internal.ads.zzgwj.zzb;
    private com.google.android.gms.internal.ads.zzgqh zzf;

    static {
        com.google.android.gms.internal.ads.zzgqb zzgqbVar = new com.google.android.gms.internal.ads.zzgqb();
        zza = zzgqbVar;
        com.google.android.gms.internal.ads.zzgxr.zzbZ(com.google.android.gms.internal.ads.zzgqb.class, zzgqbVar);
    }

    private zzgqb() {
    }

    public static com.google.android.gms.internal.ads.zzgpz zzb() {
        return (com.google.android.gms.internal.ads.zzgpz) zza.zzaZ();
    }

    public static com.google.android.gms.internal.ads.zzgqb zzd(com.google.android.gms.internal.ads.zzgwj zzgwjVar, com.google.android.gms.internal.ads.zzgxb zzgxbVar) throws com.google.android.gms.internal.ads.zzgyg {
        return (com.google.android.gms.internal.ads.zzgqb) com.google.android.gms.internal.ads.zzgxr.zzbr(zza, zzgwjVar, zzgxbVar);
    }

    public static com.google.android.gms.internal.ads.zzgzk zzh() {
        return zza.zzbN();
    }

    static /* synthetic */ void zzj(com.google.android.gms.internal.ads.zzgqb zzgqbVar, com.google.android.gms.internal.ads.zzgqh zzgqhVar) {
        zzgqhVar.getClass();
        zzgqbVar.zzf = zzgqhVar;
        zzgqbVar.zzc |= 1;
    }

    public final int zza() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgxr
    protected final java.lang.Object zzdc(com.google.android.gms.internal.ads.zzgxq zzgxqVar, java.lang.Object obj, java.lang.Object obj2) {
        int iOrdinal = zzgxqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzbQ(zza, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003ဉ\u0000", new java.lang.Object[]{"zzc", "zzd", "zze", "zzf"});
        }
        if (iOrdinal == 3) {
            return new com.google.android.gms.internal.ads.zzgqb();
        }
        com.google.android.gms.internal.ads.zzgqa zzgqaVar = null;
        if (iOrdinal == 4) {
            return new com.google.android.gms.internal.ads.zzgpz(zzgqaVar);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.zzgzk zzgxmVar = zzb;
        if (zzgxmVar == null) {
            synchronized (com.google.android.gms.internal.ads.zzgqb.class) {
                zzgxmVar = zzb;
                if (zzgxmVar == null) {
                    zzgxmVar = new com.google.android.gms.internal.ads.zzgxm(zza);
                    zzb = zzgxmVar;
                }
            }
        }
        return zzgxmVar;
    }

    public final com.google.android.gms.internal.ads.zzgqh zzf() {
        com.google.android.gms.internal.ads.zzgqh zzgqhVar = this.zzf;
        return zzgqhVar == null ? com.google.android.gms.internal.ads.zzgqh.zzd() : zzgqhVar;
    }

    public final com.google.android.gms.internal.ads.zzgwj zzg() {
        return this.zze;
    }
}
