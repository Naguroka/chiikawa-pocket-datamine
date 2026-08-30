package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzfoj extends com.google.android.gms.internal.ads.zzgxr implements com.google.android.gms.internal.ads.zzgzd {
    private static final com.google.android.gms.internal.ads.zzfoj zza;
    private static volatile com.google.android.gms.internal.ads.zzgzk zzb;
    private int zzc;
    private int zzd;
    private java.lang.String zze = "";
    private java.lang.String zzf = "";
    private com.google.android.gms.internal.ads.zzfof zzg;

    static {
        com.google.android.gms.internal.ads.zzfoj zzfojVar = new com.google.android.gms.internal.ads.zzfoj();
        zza = zzfojVar;
        com.google.android.gms.internal.ads.zzgxr.zzbZ(com.google.android.gms.internal.ads.zzfoj.class, zzfojVar);
    }

    private zzfoj() {
    }

    public static com.google.android.gms.internal.ads.zzfog zza() {
        return (com.google.android.gms.internal.ads.zzfog) zza.zzaZ();
    }

    static /* synthetic */ void zzc(com.google.android.gms.internal.ads.zzfoj zzfojVar, java.lang.String str) {
        str.getClass();
        zzfojVar.zzc |= 2;
        zzfojVar.zze = str;
    }

    static /* synthetic */ void zzd(com.google.android.gms.internal.ads.zzfoj zzfojVar, com.google.android.gms.internal.ads.zzfof zzfofVar) {
        zzfofVar.getClass();
        zzfojVar.zzg = zzfofVar;
        zzfojVar.zzc |= 8;
    }

    static /* synthetic */ void zzf(com.google.android.gms.internal.ads.zzfoj zzfojVar, int i) {
        zzfojVar.zzd = 1;
        zzfojVar.zzc = 1 | zzfojVar.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgxr
    protected final java.lang.Object zzdc(com.google.android.gms.internal.ads.zzgxq zzgxqVar, java.lang.Object obj, java.lang.Object obj2) {
        int iOrdinal = zzgxqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzbQ(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဉ\u0003", new java.lang.Object[]{"zzc", "zzd", com.google.android.gms.internal.ads.zzfoh.zza, "zze", "zzf", "zzg"});
        }
        if (iOrdinal == 3) {
            return new com.google.android.gms.internal.ads.zzfoj();
        }
        com.google.android.gms.internal.ads.zzfoi zzfoiVar = null;
        if (iOrdinal == 4) {
            return new com.google.android.gms.internal.ads.zzfog(zzfoiVar);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.zzgzk zzgxmVar = zzb;
        if (zzgxmVar == null) {
            synchronized (com.google.android.gms.internal.ads.zzfoj.class) {
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
