package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzgrf extends com.google.android.gms.internal.ads.zzgxr implements com.google.android.gms.internal.ads.zzgzd {
    private static final com.google.android.gms.internal.ads.zzgrf zza;
    private static volatile com.google.android.gms.internal.ads.zzgzk zzb;
    private int zzc;

    static {
        com.google.android.gms.internal.ads.zzgrf zzgrfVar = new com.google.android.gms.internal.ads.zzgrf();
        zza = zzgrfVar;
        com.google.android.gms.internal.ads.zzgxr.zzbZ(com.google.android.gms.internal.ads.zzgrf.class, zzgrfVar);
    }

    private zzgrf() {
    }

    public static com.google.android.gms.internal.ads.zzgrd zzb() {
        return (com.google.android.gms.internal.ads.zzgrd) zza.zzaZ();
    }

    public static com.google.android.gms.internal.ads.zzgrf zzd() {
        return zza;
    }

    public final int zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgxr
    protected final java.lang.Object zzdc(com.google.android.gms.internal.ads.zzgxq zzgxqVar, java.lang.Object obj, java.lang.Object obj2) {
        int iOrdinal = zzgxqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzbQ(zza, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new java.lang.Object[]{"zzc"});
        }
        if (iOrdinal == 3) {
            return new com.google.android.gms.internal.ads.zzgrf();
        }
        com.google.android.gms.internal.ads.zzgre zzgreVar = null;
        if (iOrdinal == 4) {
            return new com.google.android.gms.internal.ads.zzgrd(zzgreVar);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.zzgzk zzgxmVar = zzb;
        if (zzgxmVar == null) {
            synchronized (com.google.android.gms.internal.ads.zzgrf.class) {
                zzgxmVar = zzb;
                if (zzgxmVar == null) {
                    zzgxmVar = new com.google.android.gms.internal.ads.zzgxm(zza);
                    zzb = zzgxmVar;
                }
            }
        }
        return zzgxmVar;
    }
}
