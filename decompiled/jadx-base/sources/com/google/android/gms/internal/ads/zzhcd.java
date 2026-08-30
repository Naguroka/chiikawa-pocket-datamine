package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzhcd extends com.google.android.gms.internal.ads.zzgxr implements com.google.android.gms.internal.ads.zzgzd {
    private static final com.google.android.gms.internal.ads.zzhcd zza;
    private static volatile com.google.android.gms.internal.ads.zzgzk zzb;
    private int zzc;
    private com.google.android.gms.internal.ads.zzhcc zzd;
    private int zzh;
    private byte zzi = 2;
    private com.google.android.gms.internal.ads.zzgyd zze = zzbK();
    private com.google.android.gms.internal.ads.zzgwj zzf = com.google.android.gms.internal.ads.zzgwj.zzb;
    private com.google.android.gms.internal.ads.zzgwj zzg = com.google.android.gms.internal.ads.zzgwj.zzb;

    static {
        com.google.android.gms.internal.ads.zzhcd zzhcdVar = new com.google.android.gms.internal.ads.zzhcd();
        zza = zzhcdVar;
        com.google.android.gms.internal.ads.zzgxr.zzbZ(com.google.android.gms.internal.ads.zzhcd.class, zzhcdVar);
    }

    private zzhcd() {
    }

    public static com.google.android.gms.internal.ads.zzhca zzc() {
        return (com.google.android.gms.internal.ads.zzhca) zza.zzaZ();
    }

    static /* synthetic */ void zzf(com.google.android.gms.internal.ads.zzhcd zzhcdVar, com.google.android.gms.internal.ads.zzhbz zzhbzVar) {
        zzhbzVar.getClass();
        com.google.android.gms.internal.ads.zzgyd zzgydVar = zzhcdVar.zze;
        if (!zzgydVar.zzc()) {
            zzhcdVar.zze = com.google.android.gms.internal.ads.zzgxr.zzbL(zzgydVar);
        }
        zzhcdVar.zze.add(zzhbzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgxr
    protected final java.lang.Object zzdc(com.google.android.gms.internal.ads.zzgxq zzgxqVar, java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.gms.internal.ads.zzhdx zzhdxVar = null;
        switch (zzgxqVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return java.lang.Byte.valueOf(this.zzi);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.zzi = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return zzbQ(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003", new java.lang.Object[]{"zzc", "zzd", "zze", com.google.android.gms.internal.ads.zzhbz.class, "zzf", "zzg", "zzh"});
            case NEW_MUTABLE_INSTANCE:
                return new com.google.android.gms.internal.ads.zzhcd();
            case NEW_BUILDER:
                return new com.google.android.gms.internal.ads.zzhca(zzhdxVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                com.google.android.gms.internal.ads.zzgzk zzgxmVar = zzb;
                if (zzgxmVar == null) {
                    synchronized (com.google.android.gms.internal.ads.zzhcd.class) {
                        zzgxmVar = zzb;
                        if (zzgxmVar == null) {
                            zzgxmVar = new com.google.android.gms.internal.ads.zzgxm(zza);
                            zzb = zzgxmVar;
                        }
                        break;
                    }
                }
                return zzgxmVar;
            default:
                throw null;
        }
    }
}
