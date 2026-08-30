package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzfof extends com.google.android.gms.internal.ads.zzgxr implements com.google.android.gms.internal.ads.zzgzd {
    private static final com.google.android.gms.internal.ads.zzfof zza;
    private static volatile com.google.android.gms.internal.ads.zzgzk zzb;
    private int zzc;
    private com.google.android.gms.internal.ads.zzgxz zzd = zzbG();
    private java.lang.String zze = "";
    private java.lang.String zzf = "";
    private java.lang.String zzg = "";

    static {
        com.google.android.gms.internal.ads.zzfof zzfofVar = new com.google.android.gms.internal.ads.zzfof();
        zza = zzfofVar;
        com.google.android.gms.internal.ads.zzgxr.zzbZ(com.google.android.gms.internal.ads.zzfof.class, zzfofVar);
    }

    private zzfof() {
    }

    public static com.google.android.gms.internal.ads.zzfod zza() {
        return (com.google.android.gms.internal.ads.zzfod) zza.zzaZ();
    }

    static /* synthetic */ void zzc(com.google.android.gms.internal.ads.zzfof zzfofVar, java.lang.String str) {
        str.getClass();
        zzfofVar.zzc |= 1;
        zzfofVar.zze = str;
    }

    static /* synthetic */ void zzd(com.google.android.gms.internal.ads.zzfof zzfofVar, int i) {
        com.google.android.gms.internal.ads.zzgxz zzgxzVar = zzfofVar.zzd;
        if (!zzgxzVar.zzc()) {
            zzfofVar.zzd = com.google.android.gms.internal.ads.zzgxr.zzbH(zzgxzVar);
        }
        zzfofVar.zzd.zzi(2);
    }

    @Override // com.google.android.gms.internal.ads.zzgxr
    protected final java.lang.Object zzdc(com.google.android.gms.internal.ads.zzgxq zzgxqVar, java.lang.Object obj, java.lang.Object obj2) {
        int iOrdinal = zzgxqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzbQ(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ࠞ\u0002ဈ\u0000\u0003ဈ\u0001\u0004ဈ\u0002", new java.lang.Object[]{"zzc", "zzd", com.google.android.gms.internal.ads.zzfoc.zza, "zze", "zzf", "zzg"});
        }
        if (iOrdinal == 3) {
            return new com.google.android.gms.internal.ads.zzfof();
        }
        com.google.android.gms.internal.ads.zzfoe zzfoeVar = null;
        if (iOrdinal == 4) {
            return new com.google.android.gms.internal.ads.zzfod(zzfoeVar);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.zzgzk zzgxmVar = zzb;
        if (zzgxmVar == null) {
            synchronized (com.google.android.gms.internal.ads.zzfof.class) {
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
