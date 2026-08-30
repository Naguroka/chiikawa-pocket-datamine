package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzgsl extends com.google.android.gms.internal.ads.zzgxr implements com.google.android.gms.internal.ads.zzgzd {
    private static final com.google.android.gms.internal.ads.zzgsl zza;
    private static volatile com.google.android.gms.internal.ads.zzgzk zzb;
    private java.lang.String zzc = "";
    private com.google.android.gms.internal.ads.zzgwj zzd = com.google.android.gms.internal.ads.zzgwj.zzb;
    private int zze;

    static {
        com.google.android.gms.internal.ads.zzgsl zzgslVar = new com.google.android.gms.internal.ads.zzgsl();
        zza = zzgslVar;
        com.google.android.gms.internal.ads.zzgxr.zzbZ(com.google.android.gms.internal.ads.zzgsl.class, zzgslVar);
    }

    private zzgsl() {
    }

    public static com.google.android.gms.internal.ads.zzgsi zza() {
        return (com.google.android.gms.internal.ads.zzgsi) zza.zzaZ();
    }

    public static com.google.android.gms.internal.ads.zzgsl zzd() {
        return zza;
    }

    static /* synthetic */ void zzi(com.google.android.gms.internal.ads.zzgsl zzgslVar, java.lang.String str) {
        str.getClass();
        zzgslVar.zzc = str;
    }

    static /* synthetic */ void zzj(com.google.android.gms.internal.ads.zzgsl zzgslVar, com.google.android.gms.internal.ads.zzgwj zzgwjVar) {
        zzgwjVar.getClass();
        zzgslVar.zzd = zzgwjVar;
    }

    public final com.google.android.gms.internal.ads.zzgsj zzb() {
        com.google.android.gms.internal.ads.zzgsj zzgsjVar;
        int i = this.zze;
        if (i == 0) {
            zzgsjVar = com.google.android.gms.internal.ads.zzgsj.UNKNOWN_KEYMATERIAL;
        } else if (i == 1) {
            zzgsjVar = com.google.android.gms.internal.ads.zzgsj.SYMMETRIC;
        } else if (i == 2) {
            zzgsjVar = com.google.android.gms.internal.ads.zzgsj.ASYMMETRIC_PRIVATE;
        } else if (i != 3) {
            zzgsjVar = i != 4 ? null : com.google.android.gms.internal.ads.zzgsj.REMOTE;
        } else {
            zzgsjVar = com.google.android.gms.internal.ads.zzgsj.ASYMMETRIC_PUBLIC;
        }
        return zzgsjVar == null ? com.google.android.gms.internal.ads.zzgsj.UNRECOGNIZED : zzgsjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgxr
    protected final java.lang.Object zzdc(com.google.android.gms.internal.ads.zzgxq zzgxqVar, java.lang.Object obj, java.lang.Object obj2) {
        int iOrdinal = zzgxqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzbQ(zza, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new java.lang.Object[]{"zzc", "zzd", "zze"});
        }
        if (iOrdinal == 3) {
            return new com.google.android.gms.internal.ads.zzgsl();
        }
        com.google.android.gms.internal.ads.zzgsk zzgskVar = null;
        if (iOrdinal == 4) {
            return new com.google.android.gms.internal.ads.zzgsi(zzgskVar);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.zzgzk zzgxmVar = zzb;
        if (zzgxmVar == null) {
            synchronized (com.google.android.gms.internal.ads.zzgsl.class) {
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
        return this.zzd;
    }

    public final java.lang.String zzg() {
        return this.zzc;
    }
}
