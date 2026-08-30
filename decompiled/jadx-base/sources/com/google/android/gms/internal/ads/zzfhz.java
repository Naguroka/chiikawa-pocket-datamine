package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzfhz extends com.google.android.gms.internal.ads.zzgxr implements com.google.android.gms.internal.ads.zzgzd {
    private static final com.google.android.gms.internal.ads.zzfhz zza;
    private static volatile com.google.android.gms.internal.ads.zzgzk zzb;
    private java.lang.String zzc = "";
    private int zzd;

    static {
        com.google.android.gms.internal.ads.zzfhz zzfhzVar = new com.google.android.gms.internal.ads.zzfhz();
        zza = zzfhzVar;
        com.google.android.gms.internal.ads.zzgxr.zzbZ(com.google.android.gms.internal.ads.zzfhz.class, zzfhzVar);
    }

    private zzfhz() {
    }

    @Override // com.google.android.gms.internal.ads.zzgxr
    protected final java.lang.Object zzdc(com.google.android.gms.internal.ads.zzgxq zzgxqVar, java.lang.Object obj, java.lang.Object obj2) {
        int iOrdinal = zzgxqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzbQ(zza, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u0004", new java.lang.Object[]{"zzc", "zzd"});
        }
        if (iOrdinal == 3) {
            return new com.google.android.gms.internal.ads.zzfhz();
        }
        com.google.android.gms.internal.ads.zzfhy zzfhyVar = null;
        if (iOrdinal == 4) {
            return new com.google.android.gms.internal.ads.zzfhx(zzfhyVar);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.zzgzk zzgxmVar = zzb;
        if (zzgxmVar == null) {
            synchronized (com.google.android.gms.internal.ads.zzfhz.class) {
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
