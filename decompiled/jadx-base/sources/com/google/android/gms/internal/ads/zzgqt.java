package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzgqt extends com.google.android.gms.internal.ads.zzgxr implements com.google.android.gms.internal.ads.zzgzd {
    private static final com.google.android.gms.internal.ads.zzgqt zza;
    private static volatile com.google.android.gms.internal.ads.zzgzk zzb;
    private int zzc;
    private com.google.android.gms.internal.ads.zzgqw zzd;
    private int zze;

    static {
        com.google.android.gms.internal.ads.zzgqt zzgqtVar = new com.google.android.gms.internal.ads.zzgqt();
        zza = zzgqtVar;
        com.google.android.gms.internal.ads.zzgxr.zzbZ(com.google.android.gms.internal.ads.zzgqt.class, zzgqtVar);
    }

    private zzgqt() {
    }

    public static com.google.android.gms.internal.ads.zzgqr zzb() {
        return (com.google.android.gms.internal.ads.zzgqr) zza.zzaZ();
    }

    public static com.google.android.gms.internal.ads.zzgqt zzd() {
        return zza;
    }

    static /* synthetic */ void zzh(com.google.android.gms.internal.ads.zzgqt zzgqtVar, com.google.android.gms.internal.ads.zzgqw zzgqwVar) {
        zzgqwVar.getClass();
        zzgqtVar.zzd = zzgqwVar;
        zzgqtVar.zzc |= 1;
    }

    public final int zza() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzgxr
    protected final java.lang.Object zzdc(com.google.android.gms.internal.ads.zzgxq zzgxqVar, java.lang.Object obj, java.lang.Object obj2) {
        int iOrdinal = zzgxqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzbQ(zza, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b", new java.lang.Object[]{"zzc", "zzd", "zze"});
        }
        if (iOrdinal == 3) {
            return new com.google.android.gms.internal.ads.zzgqt();
        }
        com.google.android.gms.internal.ads.zzgqs zzgqsVar = null;
        if (iOrdinal == 4) {
            return new com.google.android.gms.internal.ads.zzgqr(zzgqsVar);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.zzgzk zzgxmVar = zzb;
        if (zzgxmVar == null) {
            synchronized (com.google.android.gms.internal.ads.zzgqt.class) {
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
        com.google.android.gms.internal.ads.zzgqw zzgqwVar = this.zzd;
        return zzgqwVar == null ? com.google.android.gms.internal.ads.zzgqw.zzd() : zzgqwVar;
    }
}
