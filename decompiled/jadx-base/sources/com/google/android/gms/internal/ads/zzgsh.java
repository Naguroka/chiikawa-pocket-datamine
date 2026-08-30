package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzgsh extends com.google.android.gms.internal.ads.zzgxr implements com.google.android.gms.internal.ads.zzgzd {
    private static final com.google.android.gms.internal.ads.zzgsh zza;
    private static volatile com.google.android.gms.internal.ads.zzgzk zzb;
    private int zzc;
    private int zzd;

    static {
        com.google.android.gms.internal.ads.zzgsh zzgshVar = new com.google.android.gms.internal.ads.zzgsh();
        zza = zzgshVar;
        com.google.android.gms.internal.ads.zzgxr.zzbZ(com.google.android.gms.internal.ads.zzgsh.class, zzgshVar);
    }

    private zzgsh() {
    }

    public static com.google.android.gms.internal.ads.zzgsf zzc() {
        return (com.google.android.gms.internal.ads.zzgsf) zza.zzaZ();
    }

    public static com.google.android.gms.internal.ads.zzgsh zzf() {
        return zza;
    }

    public final int zza() {
        return this.zzd;
    }

    public final com.google.android.gms.internal.ads.zzgry zzb() {
        com.google.android.gms.internal.ads.zzgry zzgryVar;
        int i = this.zzc;
        if (i == 0) {
            zzgryVar = com.google.android.gms.internal.ads.zzgry.UNKNOWN_HASH;
        } else if (i == 1) {
            zzgryVar = com.google.android.gms.internal.ads.zzgry.SHA1;
        } else if (i == 2) {
            zzgryVar = com.google.android.gms.internal.ads.zzgry.SHA384;
        } else if (i == 3) {
            zzgryVar = com.google.android.gms.internal.ads.zzgry.SHA256;
        } else if (i != 4) {
            zzgryVar = i != 5 ? null : com.google.android.gms.internal.ads.zzgry.SHA224;
        } else {
            zzgryVar = com.google.android.gms.internal.ads.zzgry.SHA512;
        }
        return zzgryVar == null ? com.google.android.gms.internal.ads.zzgry.UNRECOGNIZED : zzgryVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgxr
    protected final java.lang.Object zzdc(com.google.android.gms.internal.ads.zzgxq zzgxqVar, java.lang.Object obj, java.lang.Object obj2) {
        int iOrdinal = zzgxqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzbQ(zza, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new java.lang.Object[]{"zzc", "zzd"});
        }
        if (iOrdinal == 3) {
            return new com.google.android.gms.internal.ads.zzgsh();
        }
        com.google.android.gms.internal.ads.zzgsg zzgsgVar = null;
        if (iOrdinal == 4) {
            return new com.google.android.gms.internal.ads.zzgsf(zzgsgVar);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.zzgzk zzgxmVar = zzb;
        if (zzgxmVar == null) {
            synchronized (com.google.android.gms.internal.ads.zzgsh.class) {
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
