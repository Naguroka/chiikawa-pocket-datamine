package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzaxw extends com.google.android.gms.internal.ads.zzgxr implements com.google.android.gms.internal.ads.zzgzd {
    private static final com.google.android.gms.internal.ads.zzaxw zza;
    private static volatile com.google.android.gms.internal.ads.zzgzk zzb;
    private int zzc;
    private com.google.android.gms.internal.ads.zzaxz zzd;
    private com.google.android.gms.internal.ads.zzgwj zze = com.google.android.gms.internal.ads.zzgwj.zzb;
    private com.google.android.gms.internal.ads.zzgwj zzf = com.google.android.gms.internal.ads.zzgwj.zzb;

    static {
        com.google.android.gms.internal.ads.zzaxw zzaxwVar = new com.google.android.gms.internal.ads.zzaxw();
        zza = zzaxwVar;
        com.google.android.gms.internal.ads.zzgxr.zzbZ(com.google.android.gms.internal.ads.zzaxw.class, zzaxwVar);
    }

    private zzaxw() {
    }

    public static com.google.android.gms.internal.ads.zzaxw zzb(com.google.android.gms.internal.ads.zzgwj zzgwjVar, com.google.android.gms.internal.ads.zzgxb zzgxbVar) throws com.google.android.gms.internal.ads.zzgyg {
        return (com.google.android.gms.internal.ads.zzaxw) com.google.android.gms.internal.ads.zzgxr.zzbr(zza, zzgwjVar, zzgxbVar);
    }

    public final com.google.android.gms.internal.ads.zzaxz zzc() {
        com.google.android.gms.internal.ads.zzaxz zzaxzVar = this.zzd;
        return zzaxzVar == null ? com.google.android.gms.internal.ads.zzaxz.zzg() : zzaxzVar;
    }

    public final com.google.android.gms.internal.ads.zzgwj zzd() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzgxr
    protected final java.lang.Object zzdc(com.google.android.gms.internal.ads.zzgxq zzgxqVar, java.lang.Object obj, java.lang.Object obj2) {
        int iOrdinal = zzgxqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzbQ(zza, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ည\u0002", new java.lang.Object[]{"zzc", "zzd", "zze", "zzf"});
        }
        if (iOrdinal == 3) {
            return new com.google.android.gms.internal.ads.zzaxw();
        }
        com.google.android.gms.internal.ads.zzaxv zzaxvVar = null;
        if (iOrdinal == 4) {
            return new com.google.android.gms.internal.ads.zzaxu(zzaxvVar);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.zzgzk zzgxmVar = zzb;
        if (zzgxmVar == null) {
            synchronized (com.google.android.gms.internal.ads.zzaxw.class) {
                zzgxmVar = zzb;
                if (zzgxmVar == null) {
                    zzgxmVar = new com.google.android.gms.internal.ads.zzgxm(zza);
                    zzb = zzgxmVar;
                }
            }
        }
        return zzgxmVar;
    }

    public final com.google.android.gms.internal.ads.zzgwj zzf() {
        return this.zze;
    }
}
