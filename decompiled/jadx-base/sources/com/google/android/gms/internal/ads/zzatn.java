package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzatn extends com.google.android.gms.internal.ads.zzgxr implements com.google.android.gms.internal.ads.zzgzd {
    private static final com.google.android.gms.internal.ads.zzatn zza;
    private static volatile com.google.android.gms.internal.ads.zzgzk zzb;
    private int zzc;
    private com.google.android.gms.internal.ads.zzgyd zzd = zzbK();
    private com.google.android.gms.internal.ads.zzgwj zze = com.google.android.gms.internal.ads.zzgwj.zzb;
    private int zzf = 1;
    private int zzg = 1;

    static {
        com.google.android.gms.internal.ads.zzatn zzatnVar = new com.google.android.gms.internal.ads.zzatn();
        zza = zzatnVar;
        com.google.android.gms.internal.ads.zzgxr.zzbZ(com.google.android.gms.internal.ads.zzatn.class, zzatnVar);
    }

    private zzatn() {
    }

    public static com.google.android.gms.internal.ads.zzatm zza() {
        return (com.google.android.gms.internal.ads.zzatm) zza.zzaZ();
    }

    static /* synthetic */ void zzc(com.google.android.gms.internal.ads.zzatn zzatnVar, com.google.android.gms.internal.ads.zzgwj zzgwjVar) {
        com.google.android.gms.internal.ads.zzgyd zzgydVar = zzatnVar.zzd;
        if (!zzgydVar.zzc()) {
            zzatnVar.zzd = com.google.android.gms.internal.ads.zzgxr.zzbL(zzgydVar);
        }
        zzatnVar.zzd.add(zzgwjVar);
    }

    static /* synthetic */ void zzd(com.google.android.gms.internal.ads.zzatn zzatnVar, com.google.android.gms.internal.ads.zzgwj zzgwjVar) {
        zzatnVar.zzc |= 1;
        zzatnVar.zze = zzgwjVar;
    }

    static /* synthetic */ void zzf(com.google.android.gms.internal.ads.zzatn zzatnVar, int i) {
        zzatnVar.zzg = i - 1;
        zzatnVar.zzc |= 4;
    }

    static /* synthetic */ void zzg(com.google.android.gms.internal.ads.zzatn zzatnVar, int i) {
        zzatnVar.zzf = 4;
        zzatnVar.zzc |= 2;
    }

    @Override // com.google.android.gms.internal.ads.zzgxr
    protected final java.lang.Object zzdc(com.google.android.gms.internal.ads.zzgxq zzgxqVar, java.lang.Object obj, java.lang.Object obj2) {
        int iOrdinal = zzgxqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzbQ(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001c\u0002ည\u0000\u0003᠌\u0001\u0004᠌\u0002", new java.lang.Object[]{"zzc", "zzd", "zze", "zzf", com.google.android.gms.internal.ads.zzath.zza, "zzg", com.google.android.gms.internal.ads.zzatd.zza});
        }
        if (iOrdinal == 3) {
            return new com.google.android.gms.internal.ads.zzatn();
        }
        com.google.android.gms.internal.ads.zzato zzatoVar = null;
        if (iOrdinal == 4) {
            return new com.google.android.gms.internal.ads.zzatm(zzatoVar);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.zzgzk zzgxmVar = zzb;
        if (zzgxmVar == null) {
            synchronized (com.google.android.gms.internal.ads.zzatn.class) {
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
