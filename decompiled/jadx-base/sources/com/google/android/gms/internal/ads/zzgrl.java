package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzgrl extends com.google.android.gms.internal.ads.zzgxr implements com.google.android.gms.internal.ads.zzgzd {
    private static final com.google.android.gms.internal.ads.zzgrl zza;
    private static volatile com.google.android.gms.internal.ads.zzgzk zzb;
    private int zzc;
    private int zzd;

    static {
        com.google.android.gms.internal.ads.zzgrl zzgrlVar = new com.google.android.gms.internal.ads.zzgrl();
        zza = zzgrlVar;
        com.google.android.gms.internal.ads.zzgxr.zzbZ(com.google.android.gms.internal.ads.zzgrl.class, zzgrlVar);
    }

    private zzgrl() {
    }

    public static com.google.android.gms.internal.ads.zzgrj zzc() {
        return (com.google.android.gms.internal.ads.zzgrj) zza.zzaZ();
    }

    public static com.google.android.gms.internal.ads.zzgrl zzf(com.google.android.gms.internal.ads.zzgwj zzgwjVar, com.google.android.gms.internal.ads.zzgxb zzgxbVar) throws com.google.android.gms.internal.ads.zzgyg {
        return (com.google.android.gms.internal.ads.zzgrl) com.google.android.gms.internal.ads.zzgxr.zzbr(zza, zzgwjVar, zzgxbVar);
    }

    public final int zza() {
        return this.zzc;
    }

    public final int zzb() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgxr
    protected final java.lang.Object zzdc(com.google.android.gms.internal.ads.zzgxq zzgxqVar, java.lang.Object obj, java.lang.Object obj2) {
        int iOrdinal = zzgxqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzbQ(zza, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u000b\u0003\u000b", new java.lang.Object[]{"zzc", "zzd"});
        }
        if (iOrdinal == 3) {
            return new com.google.android.gms.internal.ads.zzgrl();
        }
        com.google.android.gms.internal.ads.zzgrk zzgrkVar = null;
        if (iOrdinal == 4) {
            return new com.google.android.gms.internal.ads.zzgrj(zzgrkVar);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.zzgzk zzgxmVar = zzb;
        if (zzgxmVar == null) {
            synchronized (com.google.android.gms.internal.ads.zzgrl.class) {
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
