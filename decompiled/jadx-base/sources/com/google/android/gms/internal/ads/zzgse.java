package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzgse extends com.google.android.gms.internal.ads.zzgxr implements com.google.android.gms.internal.ads.zzgzd {
    private static final com.google.android.gms.internal.ads.zzgse zza;
    private static volatile com.google.android.gms.internal.ads.zzgzk zzb;
    private int zzc;
    private com.google.android.gms.internal.ads.zzgsh zzd;
    private int zze;
    private int zzf;

    static {
        com.google.android.gms.internal.ads.zzgse zzgseVar = new com.google.android.gms.internal.ads.zzgse();
        zza = zzgseVar;
        com.google.android.gms.internal.ads.zzgxr.zzbZ(com.google.android.gms.internal.ads.zzgse.class, zzgseVar);
    }

    private zzgse() {
    }

    public static com.google.android.gms.internal.ads.zzgsc zzc() {
        return (com.google.android.gms.internal.ads.zzgsc) zza.zzaZ();
    }

    public static com.google.android.gms.internal.ads.zzgse zzf() {
        return zza;
    }

    public static com.google.android.gms.internal.ads.zzgse zzg(com.google.android.gms.internal.ads.zzgwj zzgwjVar, com.google.android.gms.internal.ads.zzgxb zzgxbVar) throws com.google.android.gms.internal.ads.zzgyg {
        return (com.google.android.gms.internal.ads.zzgse) com.google.android.gms.internal.ads.zzgxr.zzbr(zza, zzgwjVar, zzgxbVar);
    }

    static /* synthetic */ void zzj(com.google.android.gms.internal.ads.zzgse zzgseVar, com.google.android.gms.internal.ads.zzgsh zzgshVar) {
        zzgshVar.getClass();
        zzgseVar.zzd = zzgshVar;
        zzgseVar.zzc |= 1;
    }

    public final int zza() {
        return this.zze;
    }

    public final int zzb() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzgxr
    protected final java.lang.Object zzdc(com.google.android.gms.internal.ads.zzgxq zzgxqVar, java.lang.Object obj, java.lang.Object obj2) {
        int iOrdinal = zzgxqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzbQ(zza, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b\u0003\u000b", new java.lang.Object[]{"zzc", "zzd", "zze", "zzf"});
        }
        if (iOrdinal == 3) {
            return new com.google.android.gms.internal.ads.zzgse();
        }
        com.google.android.gms.internal.ads.zzgsd zzgsdVar = null;
        if (iOrdinal == 4) {
            return new com.google.android.gms.internal.ads.zzgsc(zzgsdVar);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.zzgzk zzgxmVar = zzb;
        if (zzgxmVar == null) {
            synchronized (com.google.android.gms.internal.ads.zzgse.class) {
                zzgxmVar = zzb;
                if (zzgxmVar == null) {
                    zzgxmVar = new com.google.android.gms.internal.ads.zzgxm(zza);
                    zzb = zzgxmVar;
                }
            }
        }
        return zzgxmVar;
    }

    public final com.google.android.gms.internal.ads.zzgsh zzh() {
        com.google.android.gms.internal.ads.zzgsh zzgshVar = this.zzd;
        return zzgshVar == null ? com.google.android.gms.internal.ads.zzgsh.zzf() : zzgshVar;
    }
}
