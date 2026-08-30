package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzgsx extends com.google.android.gms.internal.ads.zzgxr implements com.google.android.gms.internal.ads.zzgzd {
    private static final com.google.android.gms.internal.ads.zzgsx zza;
    private static volatile com.google.android.gms.internal.ads.zzgzk zzb;
    private int zzc;
    private com.google.android.gms.internal.ads.zzgyd zzd = zzbK();

    static {
        com.google.android.gms.internal.ads.zzgsx zzgsxVar = new com.google.android.gms.internal.ads.zzgsx();
        zza = zzgsxVar;
        com.google.android.gms.internal.ads.zzgxr.zzbZ(com.google.android.gms.internal.ads.zzgsx.class, zzgsxVar);
    }

    private zzgsx() {
    }

    public static com.google.android.gms.internal.ads.zzgst zzc() {
        return (com.google.android.gms.internal.ads.zzgst) zza.zzaZ();
    }

    public static com.google.android.gms.internal.ads.zzgsx zzg(java.io.InputStream inputStream, com.google.android.gms.internal.ads.zzgxb zzgxbVar) throws java.io.IOException {
        return (com.google.android.gms.internal.ads.zzgsx) com.google.android.gms.internal.ads.zzgxr.zzbu(zza, inputStream, zzgxbVar);
    }

    static /* synthetic */ void zzi(com.google.android.gms.internal.ads.zzgsx zzgsxVar, com.google.android.gms.internal.ads.zzgsv zzgsvVar) {
        zzgsvVar.getClass();
        com.google.android.gms.internal.ads.zzgyd zzgydVar = zzgsxVar.zzd;
        if (!zzgydVar.zzc()) {
            zzgsxVar.zzd = com.google.android.gms.internal.ads.zzgxr.zzbL(zzgydVar);
        }
        zzgsxVar.zzd.add(zzgsvVar);
    }

    public final int zza() {
        return this.zzd.size();
    }

    public final int zzb() {
        return this.zzc;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final com.google.android.gms.internal.ads.zzgsv zzd(int i) {
        return (com.google.android.gms.internal.ads.zzgsv) this.zzd.get(i);
    }

    @Override // com.google.android.gms.internal.ads.zzgxr
    protected final java.lang.Object zzdc(com.google.android.gms.internal.ads.zzgxq zzgxqVar, java.lang.Object obj, java.lang.Object obj2) {
        int iOrdinal = zzgxqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzbQ(zza, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new java.lang.Object[]{"zzc", "zzd", com.google.android.gms.internal.ads.zzgsv.class});
        }
        if (iOrdinal == 3) {
            return new com.google.android.gms.internal.ads.zzgsx();
        }
        com.google.android.gms.internal.ads.zzgsw zzgswVar = null;
        if (iOrdinal == 4) {
            return new com.google.android.gms.internal.ads.zzgst(zzgswVar);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.zzgzk zzgxmVar = zzb;
        if (zzgxmVar == null) {
            synchronized (com.google.android.gms.internal.ads.zzgsx.class) {
                zzgxmVar = zzb;
                if (zzgxmVar == null) {
                    zzgxmVar = new com.google.android.gms.internal.ads.zzgxm(zza);
                    zzb = zzgxmVar;
                }
            }
        }
        return zzgxmVar;
    }

    public final java.util.List zzh() {
        return this.zzd;
    }
}
