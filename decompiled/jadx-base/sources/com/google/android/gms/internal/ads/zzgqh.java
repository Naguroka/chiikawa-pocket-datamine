package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzgqh extends com.google.android.gms.internal.ads.zzgxr implements com.google.android.gms.internal.ads.zzgzd {
    private static final com.google.android.gms.internal.ads.zzgqh zza;
    private static volatile com.google.android.gms.internal.ads.zzgzk zzb;
    private int zzc;

    static {
        com.google.android.gms.internal.ads.zzgqh zzgqhVar = new com.google.android.gms.internal.ads.zzgqh();
        zza = zzgqhVar;
        com.google.android.gms.internal.ads.zzgxr.zzbZ(com.google.android.gms.internal.ads.zzgqh.class, zzgqhVar);
    }

    private zzgqh() {
    }

    public static com.google.android.gms.internal.ads.zzgqf zzb() {
        return (com.google.android.gms.internal.ads.zzgqf) zza.zzaZ();
    }

    public static com.google.android.gms.internal.ads.zzgqh zzd() {
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
            return new com.google.android.gms.internal.ads.zzgqh();
        }
        com.google.android.gms.internal.ads.zzgqg zzgqgVar = null;
        if (iOrdinal == 4) {
            return new com.google.android.gms.internal.ads.zzgqf(zzgqgVar);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.zzgzk zzgxmVar = zzb;
        if (zzgxmVar == null) {
            synchronized (com.google.android.gms.internal.ads.zzgqh.class) {
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
