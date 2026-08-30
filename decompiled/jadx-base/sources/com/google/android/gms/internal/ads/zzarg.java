package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzarg extends com.google.android.gms.internal.ads.zzgxr implements com.google.android.gms.internal.ads.zzgzd {
    private static final com.google.android.gms.internal.ads.zzarg zza;
    private static volatile com.google.android.gms.internal.ads.zzgzk zzb;
    private int zzc;
    private int zzd;
    private boolean zzg;
    private com.google.android.gms.internal.ads.zzary zzi;
    private com.google.android.gms.internal.ads.zzasb zzj;
    private boolean zzk;
    private boolean zze = true;
    private java.lang.String zzf = "unknown_host";
    private boolean zzh = true;

    static {
        com.google.android.gms.internal.ads.zzarg zzargVar = new com.google.android.gms.internal.ads.zzarg();
        zza = zzargVar;
        com.google.android.gms.internal.ads.zzgxr.zzbZ(com.google.android.gms.internal.ads.zzarg.class, zzargVar);
    }

    private zzarg() {
    }

    public static com.google.android.gms.internal.ads.zzare zza() {
        return (com.google.android.gms.internal.ads.zzare) zza.zzaZ();
    }

    static /* synthetic */ void zzg(com.google.android.gms.internal.ads.zzarg zzargVar, boolean z) {
        zzargVar.zzc |= 8;
        zzargVar.zzg = z;
    }

    static /* synthetic */ void zzh(com.google.android.gms.internal.ads.zzarg zzargVar, java.lang.String str) {
        str.getClass();
        zzargVar.zzc |= 4;
        zzargVar.zzf = str;
    }

    public final com.google.android.gms.internal.ads.zzary zzc() {
        com.google.android.gms.internal.ads.zzary zzaryVar = this.zzi;
        return zzaryVar == null ? com.google.android.gms.internal.ads.zzary.zzc() : zzaryVar;
    }

    public final com.google.android.gms.internal.ads.zzasb zzd() {
        com.google.android.gms.internal.ads.zzasb zzasbVar = this.zzj;
        return zzasbVar == null ? com.google.android.gms.internal.ads.zzasb.zzb() : zzasbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgxr
    protected final java.lang.Object zzdc(com.google.android.gms.internal.ads.zzgxq zzgxqVar, java.lang.Object obj, java.lang.Object obj2) {
        int iOrdinal = zzgxqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzbQ(zza, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဇ\u0007", new java.lang.Object[]{"zzc", "zzd", com.google.android.gms.internal.ads.zzarh.zza, "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (iOrdinal == 3) {
            return new com.google.android.gms.internal.ads.zzarg();
        }
        com.google.android.gms.internal.ads.zzarf zzarfVar = null;
        if (iOrdinal == 4) {
            return new com.google.android.gms.internal.ads.zzare(zzarfVar);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.zzgzk zzgxmVar = zzb;
        if (zzgxmVar == null) {
            synchronized (com.google.android.gms.internal.ads.zzarg.class) {
                zzgxmVar = zzb;
                if (zzgxmVar == null) {
                    zzgxmVar = new com.google.android.gms.internal.ads.zzgxm(zza);
                    zzb = zzgxmVar;
                }
            }
        }
        return zzgxmVar;
    }

    public final java.lang.String zzf() {
        return this.zzf;
    }

    public final boolean zzi() {
        return this.zzg;
    }
}
