package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzgqq extends com.google.android.gms.internal.ads.zzgxr implements com.google.android.gms.internal.ads.zzgzd {
    private static final com.google.android.gms.internal.ads.zzgqq zza;
    private static volatile com.google.android.gms.internal.ads.zzgzk zzb;
    private int zzc;
    private int zzd;
    private com.google.android.gms.internal.ads.zzgqw zze;
    private com.google.android.gms.internal.ads.zzgwj zzf = com.google.android.gms.internal.ads.zzgwj.zzb;

    static {
        com.google.android.gms.internal.ads.zzgqq zzgqqVar = new com.google.android.gms.internal.ads.zzgqq();
        zza = zzgqqVar;
        com.google.android.gms.internal.ads.zzgxr.zzbZ(com.google.android.gms.internal.ads.zzgqq.class, zzgqqVar);
    }

    private zzgqq() {
    }

    public static com.google.android.gms.internal.ads.zzgqo zzb() {
        return (com.google.android.gms.internal.ads.zzgqo) zza.zzaZ();
    }

    public static com.google.android.gms.internal.ads.zzgqq zzd() {
        return zza;
    }

    static /* synthetic */ void zzi(com.google.android.gms.internal.ads.zzgqq zzgqqVar, com.google.android.gms.internal.ads.zzgqw zzgqwVar) {
        zzgqwVar.getClass();
        zzgqqVar.zze = zzgqwVar;
        zzgqqVar.zzc |= 1;
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
            return new com.google.android.gms.internal.ads.zzgqq();
        }
        com.google.android.gms.internal.ads.zzgqp zzgqpVar = null;
        if (iOrdinal == 4) {
            return new com.google.android.gms.internal.ads.zzgqo(zzgqpVar);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.zzgzk zzgxmVar = zzb;
        if (zzgxmVar == null) {
            synchronized (com.google.android.gms.internal.ads.zzgqq.class) {
                zzgxmVar = zzb;
                if (zzgxmVar == null) {
                    zzgxmVar = new com.google.android.gms.internal.ads.zzgxm(zza);
                    zzb = zzgxmVar;
                }
            }
        }
        return zzgxmVar;
    }

    public final com.google.android.gms.internal.ads.zzgqw zzf() {
        com.google.android.gms.internal.ads.zzgqw zzgqwVar = this.zze;
        return zzgqwVar == null ? com.google.android.gms.internal.ads.zzgqw.zzd() : zzgqwVar;
    }

    public final com.google.android.gms.internal.ads.zzgwj zzg() {
        return this.zzf;
    }
}
