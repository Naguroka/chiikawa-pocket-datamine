package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzhdq extends com.google.android.gms.internal.ads.zzgxr implements com.google.android.gms.internal.ads.zzgzd {
    private static final com.google.android.gms.internal.ads.zzhdq zza;
    private static volatile com.google.android.gms.internal.ads.zzgzk zzb;
    private int zzc;
    private int zzd;
    private int zzg;
    private java.lang.String zze = "";
    private com.google.android.gms.internal.ads.zzgxz zzf = zzbG();
    private com.google.android.gms.internal.ads.zzgyd zzh = zzbK();
    private com.google.android.gms.internal.ads.zzgwj zzi = com.google.android.gms.internal.ads.zzgwj.zzb;

    static {
        com.google.android.gms.internal.ads.zzhdq zzhdqVar = new com.google.android.gms.internal.ads.zzhdq();
        zza = zzhdqVar;
        com.google.android.gms.internal.ads.zzgxr.zzbZ(com.google.android.gms.internal.ads.zzhdq.class, zzhdqVar);
    }

    private zzhdq() {
    }

    @Override // com.google.android.gms.internal.ads.zzgxr
    protected final java.lang.Object zzdc(com.google.android.gms.internal.ads.zzgxq zzgxqVar, java.lang.Object obj, java.lang.Object obj2) {
        int iOrdinal = zzgxqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzbQ(zza, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0002\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u0016\u0005င\u0002\u0006\u001b\u0007ည\u0003", new java.lang.Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", com.google.android.gms.internal.ads.zzhdo.class, "zzi"});
        }
        if (iOrdinal == 3) {
            return new com.google.android.gms.internal.ads.zzhdq();
        }
        com.google.android.gms.internal.ads.zzhdx zzhdxVar = null;
        if (iOrdinal == 4) {
            return new com.google.android.gms.internal.ads.zzhdp(zzhdxVar);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.zzgzk zzgxmVar = zzb;
        if (zzgxmVar == null) {
            synchronized (com.google.android.gms.internal.ads.zzhdq.class) {
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
