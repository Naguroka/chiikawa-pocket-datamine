package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzgtl extends com.google.android.gms.internal.ads.zzgxr implements com.google.android.gms.internal.ads.zzgzd {
    private static final com.google.android.gms.internal.ads.zzgtl zza;
    private static volatile com.google.android.gms.internal.ads.zzgzk zzb;
    private int zzc;
    private int zzd;
    private com.google.android.gms.internal.ads.zzgto zze;

    static {
        com.google.android.gms.internal.ads.zzgtl zzgtlVar = new com.google.android.gms.internal.ads.zzgtl();
        zza = zzgtlVar;
        com.google.android.gms.internal.ads.zzgxr.zzbZ(com.google.android.gms.internal.ads.zzgtl.class, zzgtlVar);
    }

    private zzgtl() {
    }

    public static com.google.android.gms.internal.ads.zzgtj zzb() {
        return (com.google.android.gms.internal.ads.zzgtj) zza.zzaZ();
    }

    public static com.google.android.gms.internal.ads.zzgtl zzd(com.google.android.gms.internal.ads.zzgwj zzgwjVar, com.google.android.gms.internal.ads.zzgxb zzgxbVar) throws com.google.android.gms.internal.ads.zzgyg {
        return (com.google.android.gms.internal.ads.zzgtl) com.google.android.gms.internal.ads.zzgxr.zzbr(zza, zzgwjVar, zzgxbVar);
    }

    public static com.google.android.gms.internal.ads.zzgzk zzg() {
        return zza.zzbN();
    }

    static /* synthetic */ void zzh(com.google.android.gms.internal.ads.zzgtl zzgtlVar, com.google.android.gms.internal.ads.zzgto zzgtoVar) {
        zzgtoVar.getClass();
        zzgtlVar.zze = zzgtoVar;
        zzgtlVar.zzc |= 1;
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
            return zzbQ(zza, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new java.lang.Object[]{"zzc", "zzd", "zze"});
        }
        if (iOrdinal == 3) {
            return new com.google.android.gms.internal.ads.zzgtl();
        }
        com.google.android.gms.internal.ads.zzgtk zzgtkVar = null;
        if (iOrdinal == 4) {
            return new com.google.android.gms.internal.ads.zzgtj(zzgtkVar);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.zzgzk zzgxmVar = zzb;
        if (zzgxmVar == null) {
            synchronized (com.google.android.gms.internal.ads.zzgtl.class) {
                zzgxmVar = zzb;
                if (zzgxmVar == null) {
                    zzgxmVar = new com.google.android.gms.internal.ads.zzgxm(zza);
                    zzb = zzgxmVar;
                }
            }
        }
        return zzgxmVar;
    }

    public final com.google.android.gms.internal.ads.zzgto zzf() {
        com.google.android.gms.internal.ads.zzgto zzgtoVar = this.zze;
        return zzgtoVar == null ? com.google.android.gms.internal.ads.zzgto.zzd() : zzgtoVar;
    }
}
