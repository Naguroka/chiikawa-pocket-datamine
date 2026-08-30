package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
@java.lang.Deprecated
public final class zzgts extends com.google.android.gms.internal.ads.zzgxr implements com.google.android.gms.internal.ads.zzgzd {
    public static final /* synthetic */ int zza = 0;
    private static final com.google.android.gms.internal.ads.zzgts zzb;
    private static volatile com.google.android.gms.internal.ads.zzgzk zzc;
    private java.lang.String zzd = "";
    private com.google.android.gms.internal.ads.zzgyd zze = zzbK();

    static {
        com.google.android.gms.internal.ads.zzgts zzgtsVar = new com.google.android.gms.internal.ads.zzgts();
        zzb = zzgtsVar;
        com.google.android.gms.internal.ads.zzgxr.zzbZ(com.google.android.gms.internal.ads.zzgts.class, zzgtsVar);
    }

    private zzgts() {
    }

    @Override // com.google.android.gms.internal.ads.zzgxr
    protected final java.lang.Object zzdc(com.google.android.gms.internal.ads.zzgxq zzgxqVar, java.lang.Object obj, java.lang.Object obj2) {
        int iOrdinal = zzgxqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzbQ(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new java.lang.Object[]{"zzd", "zze", com.google.android.gms.internal.ads.zzgss.class});
        }
        if (iOrdinal == 3) {
            return new com.google.android.gms.internal.ads.zzgts();
        }
        com.google.android.gms.internal.ads.zzgtr zzgtrVar = null;
        if (iOrdinal == 4) {
            return new com.google.android.gms.internal.ads.zzgtq(zzgtrVar);
        }
        if (iOrdinal == 5) {
            return zzb;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.zzgzk zzgxmVar = zzc;
        if (zzgxmVar == null) {
            synchronized (com.google.android.gms.internal.ads.zzgts.class) {
                zzgxmVar = zzc;
                if (zzgxmVar == null) {
                    zzgxmVar = new com.google.android.gms.internal.ads.zzgxm(zzb);
                    zzc = zzgxmVar;
                }
            }
        }
        return zzgxmVar;
    }
}
