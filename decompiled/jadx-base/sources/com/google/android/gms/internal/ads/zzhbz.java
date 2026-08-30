package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzhbz extends com.google.android.gms.internal.ads.zzgxr implements com.google.android.gms.internal.ads.zzgzd {
    private static final com.google.android.gms.internal.ads.zzhbz zza;
    private static volatile com.google.android.gms.internal.ads.zzgzk zzb;
    private int zzc;
    private byte zzf = 2;
    private com.google.android.gms.internal.ads.zzgwj zzd = com.google.android.gms.internal.ads.zzgwj.zzb;
    private com.google.android.gms.internal.ads.zzgwj zze = com.google.android.gms.internal.ads.zzgwj.zzb;

    static {
        com.google.android.gms.internal.ads.zzhbz zzhbzVar = new com.google.android.gms.internal.ads.zzhbz();
        zza = zzhbzVar;
        com.google.android.gms.internal.ads.zzgxr.zzbZ(com.google.android.gms.internal.ads.zzhbz.class, zzhbzVar);
    }

    private zzhbz() {
    }

    public static com.google.android.gms.internal.ads.zzhby zzc() {
        return (com.google.android.gms.internal.ads.zzhby) zza.zzaZ();
    }

    static /* synthetic */ void zzf(com.google.android.gms.internal.ads.zzhbz zzhbzVar, com.google.android.gms.internal.ads.zzgwj zzgwjVar) {
        zzhbzVar.zzc |= 1;
        zzhbzVar.zzd = zzgwjVar;
    }

    static /* synthetic */ void zzg(com.google.android.gms.internal.ads.zzhbz zzhbzVar, com.google.android.gms.internal.ads.zzgwj zzgwjVar) {
        zzhbzVar.zzc |= 2;
        zzhbzVar.zze = zzgwjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgxr
    protected final java.lang.Object zzdc(com.google.android.gms.internal.ads.zzgxq zzgxqVar, java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.gms.internal.ads.zzhdx zzhdxVar = null;
        switch (zzgxqVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return java.lang.Byte.valueOf(this.zzf);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.zzf = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return zzbQ(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᔊ\u0000\u0002ည\u0001", new java.lang.Object[]{"zzc", "zzd", "zze"});
            case NEW_MUTABLE_INSTANCE:
                return new com.google.android.gms.internal.ads.zzhbz();
            case NEW_BUILDER:
                return new com.google.android.gms.internal.ads.zzhby(zzhdxVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                com.google.android.gms.internal.ads.zzgzk zzgxmVar = zzb;
                if (zzgxmVar == null) {
                    synchronized (com.google.android.gms.internal.ads.zzhbz.class) {
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
