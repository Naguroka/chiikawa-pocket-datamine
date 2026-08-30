package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzgrx extends com.google.android.gms.internal.ads.zzgxr implements com.google.android.gms.internal.ads.zzgzd {
    private static final com.google.android.gms.internal.ads.zzgrx zza;
    private static volatile com.google.android.gms.internal.ads.zzgzk zzb;

    static {
        com.google.android.gms.internal.ads.zzgrx zzgrxVar = new com.google.android.gms.internal.ads.zzgrx();
        zza = zzgrxVar;
        com.google.android.gms.internal.ads.zzgxr.zzbZ(com.google.android.gms.internal.ads.zzgrx.class, zzgrxVar);
    }

    private zzgrx() {
    }

    public static com.google.android.gms.internal.ads.zzgrx zzb() {
        return zza;
    }

    public static com.google.android.gms.internal.ads.zzgrx zzc(com.google.android.gms.internal.ads.zzgwj zzgwjVar, com.google.android.gms.internal.ads.zzgxb zzgxbVar) throws com.google.android.gms.internal.ads.zzgyg {
        return (com.google.android.gms.internal.ads.zzgrx) com.google.android.gms.internal.ads.zzgxr.zzbr(zza, zzgwjVar, zzgxbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgxr
    protected final java.lang.Object zzdc(com.google.android.gms.internal.ads.zzgxq zzgxqVar, java.lang.Object obj, java.lang.Object obj2) {
        int iOrdinal = zzgxqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        com.google.android.gms.internal.ads.zzgrw zzgrwVar = null;
        if (iOrdinal == 2) {
            return zzbQ(zza, "\u0000\u0000", null);
        }
        if (iOrdinal == 3) {
            return new com.google.android.gms.internal.ads.zzgrx();
        }
        if (iOrdinal == 4) {
            return new com.google.android.gms.internal.ads.zzgrv(zzgrwVar);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.zzgzk zzgxmVar = zzb;
        if (zzgxmVar == null) {
            synchronized (com.google.android.gms.internal.ads.zzgrx.class) {
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
