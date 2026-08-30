package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzgqk extends com.google.android.gms.internal.ads.zzgxr implements com.google.android.gms.internal.ads.zzgzd {
    private static final com.google.android.gms.internal.ads.zzgqk zza;
    private static volatile com.google.android.gms.internal.ads.zzgzk zzb;
    private int zzc;
    private int zzd;
    private com.google.android.gms.internal.ads.zzgqq zze;
    private com.google.android.gms.internal.ads.zzgsb zzf;

    static {
        com.google.android.gms.internal.ads.zzgqk zzgqkVar = new com.google.android.gms.internal.ads.zzgqk();
        zza = zzgqkVar;
        com.google.android.gms.internal.ads.zzgxr.zzbZ(com.google.android.gms.internal.ads.zzgqk.class, zzgqkVar);
    }

    private zzgqk() {
    }

    public static com.google.android.gms.internal.ads.zzgqi zzb() {
        return (com.google.android.gms.internal.ads.zzgqi) zza.zzaZ();
    }

    public static com.google.android.gms.internal.ads.zzgqk zzd(com.google.android.gms.internal.ads.zzgwj zzgwjVar, com.google.android.gms.internal.ads.zzgxb zzgxbVar) throws com.google.android.gms.internal.ads.zzgyg {
        return (com.google.android.gms.internal.ads.zzgqk) com.google.android.gms.internal.ads.zzgxr.zzbr(zza, zzgwjVar, zzgxbVar);
    }

    public static com.google.android.gms.internal.ads.zzgzk zzh() {
        return zza.zzbN();
    }

    static /* synthetic */ void zzi(com.google.android.gms.internal.ads.zzgqk zzgqkVar, com.google.android.gms.internal.ads.zzgqq zzgqqVar) {
        zzgqqVar.getClass();
        zzgqkVar.zze = zzgqqVar;
        zzgqkVar.zzc |= 1;
    }

    static /* synthetic */ void zzj(com.google.android.gms.internal.ads.zzgqk zzgqkVar, com.google.android.gms.internal.ads.zzgsb zzgsbVar) {
        zzgsbVar.getClass();
        zzgqkVar.zzf = zzgsbVar;
        zzgqkVar.zzc |= 2;
    }

    public final int zza() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgxr
    protected final java.lang.Object zzdc(com.google.android.gms.internal.ads.zzgxq zzgxqVar, java.lang.Object obj, java.lang.Object obj2) {
        int iOrdinal = zzgxqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzbQ(zza, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003ဉ\u0001", new java.lang.Object[]{"zzc", "zzd", "zze", "zzf"});
        }
        if (iOrdinal == 3) {
            return new com.google.android.gms.internal.ads.zzgqk();
        }
        com.google.android.gms.internal.ads.zzgqj zzgqjVar = null;
        if (iOrdinal == 4) {
            return new com.google.android.gms.internal.ads.zzgqi(zzgqjVar);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.zzgzk zzgxmVar = zzb;
        if (zzgxmVar == null) {
            synchronized (com.google.android.gms.internal.ads.zzgqk.class) {
                zzgxmVar = zzb;
                if (zzgxmVar == null) {
                    zzgxmVar = new com.google.android.gms.internal.ads.zzgxm(zza);
                    zzb = zzgxmVar;
                }
            }
        }
        return zzgxmVar;
    }

    public final com.google.android.gms.internal.ads.zzgqq zzf() {
        com.google.android.gms.internal.ads.zzgqq zzgqqVar = this.zze;
        return zzgqqVar == null ? com.google.android.gms.internal.ads.zzgqq.zzd() : zzgqqVar;
    }

    public final com.google.android.gms.internal.ads.zzgsb zzg() {
        com.google.android.gms.internal.ads.zzgsb zzgsbVar = this.zzf;
        return zzgsbVar == null ? com.google.android.gms.internal.ads.zzgsb.zzd() : zzgsbVar;
    }
}
