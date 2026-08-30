package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzgty extends com.google.android.gms.internal.ads.zzgxr implements com.google.android.gms.internal.ads.zzgzd {
    private static final com.google.android.gms.internal.ads.zzgty zza;
    private static volatile com.google.android.gms.internal.ads.zzgzk zzb;
    private int zzc;
    private int zzd;
    private com.google.android.gms.internal.ads.zzgub zze;

    static {
        com.google.android.gms.internal.ads.zzgty zzgtyVar = new com.google.android.gms.internal.ads.zzgty();
        zza = zzgtyVar;
        com.google.android.gms.internal.ads.zzgxr.zzbZ(com.google.android.gms.internal.ads.zzgty.class, zzgtyVar);
    }

    private zzgty() {
    }

    public static com.google.android.gms.internal.ads.zzgtw zzb() {
        return (com.google.android.gms.internal.ads.zzgtw) zza.zzaZ();
    }

    public static com.google.android.gms.internal.ads.zzgty zzd(com.google.android.gms.internal.ads.zzgwj zzgwjVar, com.google.android.gms.internal.ads.zzgxb zzgxbVar) throws com.google.android.gms.internal.ads.zzgyg {
        return (com.google.android.gms.internal.ads.zzgty) com.google.android.gms.internal.ads.zzgxr.zzbr(zza, zzgwjVar, zzgxbVar);
    }

    static /* synthetic */ void zzg(com.google.android.gms.internal.ads.zzgty zzgtyVar, com.google.android.gms.internal.ads.zzgub zzgubVar) {
        zzgubVar.getClass();
        zzgtyVar.zze = zzgubVar;
        zzgtyVar.zzc |= 1;
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
            return zzbQ(zza, "\u0000\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003ဉ\u0000", new java.lang.Object[]{"zzc", "zzd", "zze"});
        }
        if (iOrdinal == 3) {
            return new com.google.android.gms.internal.ads.zzgty();
        }
        com.google.android.gms.internal.ads.zzgtx zzgtxVar = null;
        if (iOrdinal == 4) {
            return new com.google.android.gms.internal.ads.zzgtw(zzgtxVar);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.zzgzk zzgxmVar = zzb;
        if (zzgxmVar == null) {
            synchronized (com.google.android.gms.internal.ads.zzgty.class) {
                zzgxmVar = zzb;
                if (zzgxmVar == null) {
                    zzgxmVar = new com.google.android.gms.internal.ads.zzgxm(zza);
                    zzb = zzgxmVar;
                }
            }
        }
        return zzgxmVar;
    }

    public final com.google.android.gms.internal.ads.zzgub zzf() {
        com.google.android.gms.internal.ads.zzgub zzgubVar = this.zze;
        return zzgubVar == null ? com.google.android.gms.internal.ads.zzgub.zzd() : zzgubVar;
    }
}
