package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzgtc extends com.google.android.gms.internal.ads.zzgxr implements com.google.android.gms.internal.ads.zzgzd {
    private static final com.google.android.gms.internal.ads.zzgtc zza;
    private static volatile com.google.android.gms.internal.ads.zzgzk zzb;
    private int zzc;
    private com.google.android.gms.internal.ads.zzgyd zzd = zzbK();

    static {
        com.google.android.gms.internal.ads.zzgtc zzgtcVar = new com.google.android.gms.internal.ads.zzgtc();
        zza = zzgtcVar;
        com.google.android.gms.internal.ads.zzgxr.zzbZ(com.google.android.gms.internal.ads.zzgtc.class, zzgtcVar);
    }

    private zzgtc() {
    }

    public static com.google.android.gms.internal.ads.zzgsy zza() {
        return (com.google.android.gms.internal.ads.zzgsy) zza.zzaZ();
    }

    static /* synthetic */ void zzc(com.google.android.gms.internal.ads.zzgtc zzgtcVar, com.google.android.gms.internal.ads.zzgta zzgtaVar) {
        zzgtaVar.getClass();
        com.google.android.gms.internal.ads.zzgyd zzgydVar = zzgtcVar.zzd;
        if (!zzgydVar.zzc()) {
            zzgtcVar.zzd = com.google.android.gms.internal.ads.zzgxr.zzbL(zzgydVar);
        }
        zzgtcVar.zzd.add(zzgtaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgxr
    protected final java.lang.Object zzdc(com.google.android.gms.internal.ads.zzgxq zzgxqVar, java.lang.Object obj, java.lang.Object obj2) {
        int iOrdinal = zzgxqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzbQ(zza, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new java.lang.Object[]{"zzc", "zzd", com.google.android.gms.internal.ads.zzgta.class});
        }
        if (iOrdinal == 3) {
            return new com.google.android.gms.internal.ads.zzgtc();
        }
        com.google.android.gms.internal.ads.zzgtb zzgtbVar = null;
        if (iOrdinal == 4) {
            return new com.google.android.gms.internal.ads.zzgsy(zzgtbVar);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.zzgzk zzgxmVar = zzb;
        if (zzgxmVar == null) {
            synchronized (com.google.android.gms.internal.ads.zzgtc.class) {
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
