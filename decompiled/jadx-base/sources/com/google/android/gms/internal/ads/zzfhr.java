package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzfhr extends com.google.android.gms.internal.ads.zzgxr implements com.google.android.gms.internal.ads.zzgzd {
    private static final com.google.android.gms.internal.ads.zzfhr zza;
    private static volatile com.google.android.gms.internal.ads.zzgzk zzb;
    private int zzc;
    private com.google.android.gms.internal.ads.zzfho zzd;

    static {
        com.google.android.gms.internal.ads.zzfhr zzfhrVar = new com.google.android.gms.internal.ads.zzfhr();
        zza = zzfhrVar;
        com.google.android.gms.internal.ads.zzgxr.zzbZ(com.google.android.gms.internal.ads.zzfhr.class, zzfhrVar);
    }

    private zzfhr() {
    }

    public static com.google.android.gms.internal.ads.zzfhq zza() {
        return (com.google.android.gms.internal.ads.zzfhq) zza.zzaZ();
    }

    static /* synthetic */ void zzc(com.google.android.gms.internal.ads.zzfhr zzfhrVar, com.google.android.gms.internal.ads.zzfho zzfhoVar) {
        zzfhoVar.getClass();
        zzfhrVar.zzd = zzfhoVar;
        zzfhrVar.zzc |= 1;
    }

    @Override // com.google.android.gms.internal.ads.zzgxr
    protected final java.lang.Object zzdc(com.google.android.gms.internal.ads.zzgxq zzgxqVar, java.lang.Object obj, java.lang.Object obj2) {
        int iOrdinal = zzgxqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzbQ(zza, "\u0004\u0001\u0000\u0001\u0006\u0006\u0001\u0000\u0000\u0000\u0006ဉ\u0000", new java.lang.Object[]{"zzc", "zzd"});
        }
        if (iOrdinal == 3) {
            return new com.google.android.gms.internal.ads.zzfhr();
        }
        com.google.android.gms.internal.ads.zzfhs zzfhsVar = null;
        if (iOrdinal == 4) {
            return new com.google.android.gms.internal.ads.zzfhq(zzfhsVar);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.zzgzk zzgxmVar = zzb;
        if (zzgxmVar == null) {
            synchronized (com.google.android.gms.internal.ads.zzfhr.class) {
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
