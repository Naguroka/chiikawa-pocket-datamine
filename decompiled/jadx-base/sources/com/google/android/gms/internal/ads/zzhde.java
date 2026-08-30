package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzhde extends com.google.android.gms.internal.ads.zzgxr implements com.google.android.gms.internal.ads.zzgzd {
    private static final com.google.android.gms.internal.ads.zzhde zza;
    private static volatile com.google.android.gms.internal.ads.zzgzk zzb;
    private int zzc;
    private long zze;
    private boolean zzf;
    private int zzg;
    private boolean zzj;
    private boolean zzk;
    private java.lang.String zzd = "";
    private java.lang.String zzh = "";
    private java.lang.String zzi = "";

    static {
        com.google.android.gms.internal.ads.zzhde zzhdeVar = new com.google.android.gms.internal.ads.zzhde();
        zza = zzhdeVar;
        com.google.android.gms.internal.ads.zzgxr.zzbZ(com.google.android.gms.internal.ads.zzhde.class, zzhdeVar);
    }

    private zzhde() {
    }

    public static com.google.android.gms.internal.ads.zzhdd zzc() {
        return (com.google.android.gms.internal.ads.zzhdd) zza.zzaZ();
    }

    static /* synthetic */ void zzf(com.google.android.gms.internal.ads.zzhde zzhdeVar, java.lang.String str) {
        zzhdeVar.zzc |= 1;
        zzhdeVar.zzd = str;
    }

    static /* synthetic */ void zzg(com.google.android.gms.internal.ads.zzhde zzhdeVar, long j) {
        zzhdeVar.zzc |= 2;
        zzhdeVar.zze = j;
    }

    static /* synthetic */ void zzh(com.google.android.gms.internal.ads.zzhde zzhdeVar, boolean z) {
        zzhdeVar.zzc |= 4;
        zzhdeVar.zzf = z;
    }

    @Override // com.google.android.gms.internal.ads.zzgxr
    protected final java.lang.Object zzdc(com.google.android.gms.internal.ads.zzgxq zzgxqVar, java.lang.Object obj, java.lang.Object obj2) {
        int iOrdinal = zzgxqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzbQ(zza, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဇ\u0002\u0004᠌\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဇ\u0006\bဇ\u0007", new java.lang.Object[]{"zzc", "zzd", "zze", "zzf", "zzg", com.google.android.gms.internal.ads.zzhdf.zza, "zzh", "zzi", "zzj", "zzk"});
        }
        if (iOrdinal == 3) {
            return new com.google.android.gms.internal.ads.zzhde();
        }
        com.google.android.gms.internal.ads.zzhdx zzhdxVar = null;
        if (iOrdinal == 4) {
            return new com.google.android.gms.internal.ads.zzhdd(zzhdxVar);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.zzgzk zzgxmVar = zzb;
        if (zzgxmVar == null) {
            synchronized (com.google.android.gms.internal.ads.zzhde.class) {
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
