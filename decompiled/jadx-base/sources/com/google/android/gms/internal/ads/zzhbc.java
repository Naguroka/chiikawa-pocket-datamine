package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzhbc extends com.google.android.gms.internal.ads.zzgxr implements com.google.android.gms.internal.ads.zzgzd {
    private static final com.google.android.gms.internal.ads.zzhbc zza;
    private static volatile com.google.android.gms.internal.ads.zzgzk zzb;
    private com.google.android.gms.internal.ads.zzgyd zzc = zzbK();

    static {
        com.google.android.gms.internal.ads.zzhbc zzhbcVar = new com.google.android.gms.internal.ads.zzhbc();
        zza = zzhbcVar;
        com.google.android.gms.internal.ads.zzgxr.zzbZ(com.google.android.gms.internal.ads.zzhbc.class, zzhbcVar);
    }

    private zzhbc() {
    }

    public static com.google.android.gms.internal.ads.zzhbb zzc() {
        return (com.google.android.gms.internal.ads.zzhbb) zza.zzaZ();
    }

    static /* synthetic */ void zzf(com.google.android.gms.internal.ads.zzhbc zzhbcVar, com.google.android.gms.internal.ads.zzhba zzhbaVar) {
        zzhbaVar.getClass();
        com.google.android.gms.internal.ads.zzgyd zzgydVar = zzhbcVar.zzc;
        if (!zzgydVar.zzc()) {
            zzhbcVar.zzc = com.google.android.gms.internal.ads.zzgxr.zzbL(zzgydVar);
        }
        zzhbcVar.zzc.add(zzhbaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgxr
    protected final java.lang.Object zzdc(com.google.android.gms.internal.ads.zzgxq zzgxqVar, java.lang.Object obj, java.lang.Object obj2) {
        int iOrdinal = zzgxqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzbQ(zza, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new java.lang.Object[]{"zzc", com.google.android.gms.internal.ads.zzhba.class});
        }
        if (iOrdinal == 3) {
            return new com.google.android.gms.internal.ads.zzhbc();
        }
        com.google.android.gms.internal.ads.zzhbd zzhbdVar = null;
        if (iOrdinal == 4) {
            return new com.google.android.gms.internal.ads.zzhbb(zzhbdVar);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.zzgzk zzgxmVar = zzb;
        if (zzgxmVar == null) {
            synchronized (com.google.android.gms.internal.ads.zzhbc.class) {
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
