package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzhch extends com.google.android.gms.internal.ads.zzgxr implements com.google.android.gms.internal.ads.zzgzd {
    private static final com.google.android.gms.internal.ads.zzhch zza;
    private static volatile com.google.android.gms.internal.ads.zzgzk zzb;
    private int zzc;
    private com.google.android.gms.internal.ads.zzhcg zzd;
    private com.google.android.gms.internal.ads.zzgwj zzg;
    private int zzh;
    private com.google.android.gms.internal.ads.zzgwj zzi;
    private byte zzj = 2;
    private com.google.android.gms.internal.ads.zzgyd zze = zzbK();
    private com.google.android.gms.internal.ads.zzgwj zzf = com.google.android.gms.internal.ads.zzgwj.zzb;

    static {
        com.google.android.gms.internal.ads.zzhch zzhchVar = new com.google.android.gms.internal.ads.zzhch();
        zza = zzhchVar;
        com.google.android.gms.internal.ads.zzgxr.zzbZ(com.google.android.gms.internal.ads.zzhch.class, zzhchVar);
    }

    private zzhch() {
        com.google.android.gms.internal.ads.zzgwj zzgwjVar = com.google.android.gms.internal.ads.zzgwj.zzb;
        this.zzg = zzgwjVar;
        this.zzi = zzgwjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgxr
    protected final java.lang.Object zzdc(com.google.android.gms.internal.ads.zzgxq zzgxqVar, java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.gms.internal.ads.zzhdx zzhdxVar = null;
        switch (zzgxqVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return java.lang.Byte.valueOf(this.zzj);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.zzj = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return zzbQ(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003\u0006ည\u0004", new java.lang.Object[]{"zzc", "zzd", "zze", com.google.android.gms.internal.ads.zzhbz.class, "zzf", "zzg", "zzh", "zzi"});
            case NEW_MUTABLE_INSTANCE:
                return new com.google.android.gms.internal.ads.zzhch();
            case NEW_BUILDER:
                return new com.google.android.gms.internal.ads.zzhce(zzhdxVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                com.google.android.gms.internal.ads.zzgzk zzgxmVar = zzb;
                if (zzgxmVar == null) {
                    synchronized (com.google.android.gms.internal.ads.zzhch.class) {
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
