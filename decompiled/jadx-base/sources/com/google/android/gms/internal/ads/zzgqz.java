package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzgqz extends com.google.android.gms.internal.ads.zzgxr implements com.google.android.gms.internal.ads.zzgzd {
    private static final com.google.android.gms.internal.ads.zzgqz zza;
    private static volatile com.google.android.gms.internal.ads.zzgzk zzb;
    private int zzc;
    private int zzd;
    private com.google.android.gms.internal.ads.zzgrf zze;
    private com.google.android.gms.internal.ads.zzgwj zzf = com.google.android.gms.internal.ads.zzgwj.zzb;

    static {
        com.google.android.gms.internal.ads.zzgqz zzgqzVar = new com.google.android.gms.internal.ads.zzgqz();
        zza = zzgqzVar;
        com.google.android.gms.internal.ads.zzgxr.zzbZ(com.google.android.gms.internal.ads.zzgqz.class, zzgqzVar);
    }

    private zzgqz() {
    }

    public static com.google.android.gms.internal.ads.zzgqx zzb() {
        return (com.google.android.gms.internal.ads.zzgqx) zza.zzaZ();
    }

    public static com.google.android.gms.internal.ads.zzgqz zzd(com.google.android.gms.internal.ads.zzgwj zzgwjVar, com.google.android.gms.internal.ads.zzgxb zzgxbVar) throws com.google.android.gms.internal.ads.zzgyg {
        return (com.google.android.gms.internal.ads.zzgqz) com.google.android.gms.internal.ads.zzgxr.zzbr(zza, zzgwjVar, zzgxbVar);
    }

    public static com.google.android.gms.internal.ads.zzgzk zzh() {
        return zza.zzbN();
    }

    static /* synthetic */ void zzj(com.google.android.gms.internal.ads.zzgqz zzgqzVar, com.google.android.gms.internal.ads.zzgrf zzgrfVar) {
        zzgrfVar.getClass();
        zzgqzVar.zze = zzgrfVar;
        zzgqzVar.zzc |= 1;
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
            return zzbQ(zza, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new java.lang.Object[]{"zzc", "zzd", "zze", "zzf"});
        }
        if (iOrdinal == 3) {
            return new com.google.android.gms.internal.ads.zzgqz();
        }
        com.google.android.gms.internal.ads.zzgqy zzgqyVar = null;
        if (iOrdinal == 4) {
            return new com.google.android.gms.internal.ads.zzgqx(zzgqyVar);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.zzgzk zzgxmVar = zzb;
        if (zzgxmVar == null) {
            synchronized (com.google.android.gms.internal.ads.zzgqz.class) {
                zzgxmVar = zzb;
                if (zzgxmVar == null) {
                    zzgxmVar = new com.google.android.gms.internal.ads.zzgxm(zza);
                    zzb = zzgxmVar;
                }
            }
        }
        return zzgxmVar;
    }

    public final com.google.android.gms.internal.ads.zzgrf zzf() {
        com.google.android.gms.internal.ads.zzgrf zzgrfVar = this.zze;
        return zzgrfVar == null ? com.google.android.gms.internal.ads.zzgrf.zzd() : zzgrfVar;
    }

    public final com.google.android.gms.internal.ads.zzgwj zzg() {
        return this.zzf;
    }
}
