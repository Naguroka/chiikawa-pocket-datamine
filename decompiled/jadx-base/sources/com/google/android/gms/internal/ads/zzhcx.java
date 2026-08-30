package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzhcx extends com.google.android.gms.internal.ads.zzgxr implements com.google.android.gms.internal.ads.zzgzd {
    private static final com.google.android.gms.internal.ads.zzhcx zza;
    private static volatile com.google.android.gms.internal.ads.zzgzk zzb;
    private int zzc;
    private int zzd;
    private java.lang.String zze = "";
    private com.google.android.gms.internal.ads.zzgwj zzf = com.google.android.gms.internal.ads.zzgwj.zzb;
    private com.google.android.gms.internal.ads.zzgwj zzg = com.google.android.gms.internal.ads.zzgwj.zzb;

    static {
        com.google.android.gms.internal.ads.zzhcx zzhcxVar = new com.google.android.gms.internal.ads.zzhcx();
        zza = zzhcxVar;
        com.google.android.gms.internal.ads.zzgxr.zzbZ(com.google.android.gms.internal.ads.zzhcx.class, zzhcxVar);
    }

    private zzhcx() {
    }

    public static com.google.android.gms.internal.ads.zzhcv zzc() {
        return (com.google.android.gms.internal.ads.zzhcv) zza.zzaZ();
    }

    static /* synthetic */ void zzf(com.google.android.gms.internal.ads.zzhcx zzhcxVar, com.google.android.gms.internal.ads.zzgwj zzgwjVar) {
        zzgwjVar.getClass();
        zzhcxVar.zzc |= 4;
        zzhcxVar.zzf = zzgwjVar;
    }

    static /* synthetic */ void zzg(com.google.android.gms.internal.ads.zzhcx zzhcxVar, java.lang.String str) {
        zzhcxVar.zzc |= 2;
        zzhcxVar.zze = androidx.media3.common.MimeTypes.IMAGE_PNG;
    }

    static /* synthetic */ void zzh(com.google.android.gms.internal.ads.zzhcx zzhcxVar, int i) {
        zzhcxVar.zzd = 1;
        zzhcxVar.zzc = 1 | zzhcxVar.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgxr
    protected final java.lang.Object zzdc(com.google.android.gms.internal.ads.zzgxq zzgxqVar, java.lang.Object obj, java.lang.Object obj2) {
        int iOrdinal = zzgxqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzbQ(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ည\u0002\u0004ည\u0003", new java.lang.Object[]{"zzc", "zzd", com.google.android.gms.internal.ads.zzhcw.zza, "zze", "zzf", "zzg"});
        }
        if (iOrdinal == 3) {
            return new com.google.android.gms.internal.ads.zzhcx();
        }
        com.google.android.gms.internal.ads.zzhdx zzhdxVar = null;
        if (iOrdinal == 4) {
            return new com.google.android.gms.internal.ads.zzhcv(zzhdxVar);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.zzgzk zzgxmVar = zzb;
        if (zzgxmVar == null) {
            synchronized (com.google.android.gms.internal.ads.zzhcx.class) {
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
