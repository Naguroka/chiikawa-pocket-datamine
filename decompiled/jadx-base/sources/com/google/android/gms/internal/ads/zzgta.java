package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzgta extends com.google.android.gms.internal.ads.zzgxr implements com.google.android.gms.internal.ads.zzgzd {
    private static final com.google.android.gms.internal.ads.zzgta zza;
    private static volatile com.google.android.gms.internal.ads.zzgzk zzb;
    private java.lang.String zzc = "";
    private int zzd;
    private int zze;
    private int zzf;

    static {
        com.google.android.gms.internal.ads.zzgta zzgtaVar = new com.google.android.gms.internal.ads.zzgta();
        zza = zzgtaVar;
        com.google.android.gms.internal.ads.zzgxr.zzbZ(com.google.android.gms.internal.ads.zzgta.class, zzgtaVar);
    }

    private zzgta() {
    }

    public static com.google.android.gms.internal.ads.zzgsz zza() {
        return (com.google.android.gms.internal.ads.zzgsz) zza.zzaZ();
    }

    static /* synthetic */ void zzf(com.google.android.gms.internal.ads.zzgta zzgtaVar, java.lang.String str) {
        str.getClass();
        zzgtaVar.zzc = str;
    }

    @Override // com.google.android.gms.internal.ads.zzgxr
    protected final java.lang.Object zzdc(com.google.android.gms.internal.ads.zzgxq zzgxqVar, java.lang.Object obj, java.lang.Object obj2) {
        int iOrdinal = zzgxqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzbQ(zza, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new java.lang.Object[]{"zzc", "zzd", "zze", "zzf"});
        }
        if (iOrdinal == 3) {
            return new com.google.android.gms.internal.ads.zzgta();
        }
        com.google.android.gms.internal.ads.zzgtb zzgtbVar = null;
        if (iOrdinal == 4) {
            return new com.google.android.gms.internal.ads.zzgsz(zzgtbVar);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.zzgzk zzgxmVar = zzb;
        if (zzgxmVar == null) {
            synchronized (com.google.android.gms.internal.ads.zzgta.class) {
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
