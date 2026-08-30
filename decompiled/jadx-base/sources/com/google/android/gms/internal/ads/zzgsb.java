package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzgsb extends com.google.android.gms.internal.ads.zzgxr implements com.google.android.gms.internal.ads.zzgzd {
    private static final com.google.android.gms.internal.ads.zzgsb zza;
    private static volatile com.google.android.gms.internal.ads.zzgzk zzb;
    private int zzc;
    private int zzd;
    private com.google.android.gms.internal.ads.zzgsh zze;
    private com.google.android.gms.internal.ads.zzgwj zzf = com.google.android.gms.internal.ads.zzgwj.zzb;

    static {
        com.google.android.gms.internal.ads.zzgsb zzgsbVar = new com.google.android.gms.internal.ads.zzgsb();
        zza = zzgsbVar;
        com.google.android.gms.internal.ads.zzgxr.zzbZ(com.google.android.gms.internal.ads.zzgsb.class, zzgsbVar);
    }

    private zzgsb() {
    }

    public static com.google.android.gms.internal.ads.zzgrz zzb() {
        return (com.google.android.gms.internal.ads.zzgrz) zza.zzaZ();
    }

    public static com.google.android.gms.internal.ads.zzgsb zzd() {
        return zza;
    }

    public static com.google.android.gms.internal.ads.zzgsb zzf(com.google.android.gms.internal.ads.zzgwj zzgwjVar, com.google.android.gms.internal.ads.zzgxb zzgxbVar) throws com.google.android.gms.internal.ads.zzgyg {
        return (com.google.android.gms.internal.ads.zzgsb) com.google.android.gms.internal.ads.zzgxr.zzbr(zza, zzgwjVar, zzgxbVar);
    }

    public static com.google.android.gms.internal.ads.zzgzk zzi() {
        return zza.zzbN();
    }

    static /* synthetic */ void zzk(com.google.android.gms.internal.ads.zzgsb zzgsbVar, com.google.android.gms.internal.ads.zzgsh zzgshVar) {
        zzgshVar.getClass();
        zzgsbVar.zze = zzgshVar;
        zzgsbVar.zzc |= 1;
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
            return zzbQ(zza, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new java.lang.Object[]{"zzc", "zzd", "zze", "zzf"});
        }
        if (iOrdinal == 3) {
            return new com.google.android.gms.internal.ads.zzgsb();
        }
        com.google.android.gms.internal.ads.zzgsa zzgsaVar = null;
        if (iOrdinal == 4) {
            return new com.google.android.gms.internal.ads.zzgrz(zzgsaVar);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.zzgzk zzgxmVar = zzb;
        if (zzgxmVar == null) {
            synchronized (com.google.android.gms.internal.ads.zzgsb.class) {
                zzgxmVar = zzb;
                if (zzgxmVar == null) {
                    zzgxmVar = new com.google.android.gms.internal.ads.zzgxm(zza);
                    zzb = zzgxmVar;
                }
            }
        }
        return zzgxmVar;
    }

    public final com.google.android.gms.internal.ads.zzgsh zzg() {
        com.google.android.gms.internal.ads.zzgsh zzgshVar = this.zze;
        return zzgshVar == null ? com.google.android.gms.internal.ads.zzgsh.zzf() : zzgshVar;
    }

    public final com.google.android.gms.internal.ads.zzgwj zzh() {
        return this.zzf;
    }
}
