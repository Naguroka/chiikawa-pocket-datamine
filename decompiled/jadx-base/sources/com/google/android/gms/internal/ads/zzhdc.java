package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzhdc extends com.google.android.gms.internal.ads.zzgxr implements com.google.android.gms.internal.ads.zzgzd {
    private static final com.google.android.gms.internal.ads.zzhdc zza;
    private static volatile com.google.android.gms.internal.ads.zzgzk zzb;
    private int zzc;
    private int zzd;
    private com.google.android.gms.internal.ads.zzhcd zzf;
    private com.google.android.gms.internal.ads.zzhch zzg;
    private int zzh;
    private int zzk;
    private byte zzm = 2;
    private java.lang.String zze = "";
    private com.google.android.gms.internal.ads.zzgxz zzi = zzbG();
    private java.lang.String zzj = "";
    private com.google.android.gms.internal.ads.zzgyd zzl = com.google.android.gms.internal.ads.zzgxr.zzbK();

    static {
        com.google.android.gms.internal.ads.zzhdc zzhdcVar = new com.google.android.gms.internal.ads.zzhdc();
        zza = zzhdcVar;
        com.google.android.gms.internal.ads.zzgxr.zzbZ(com.google.android.gms.internal.ads.zzhdc.class, zzhdcVar);
    }

    private zzhdc() {
    }

    public static com.google.android.gms.internal.ads.zzhdb zzd() {
        return (com.google.android.gms.internal.ads.zzhdb) zza.zzaZ();
    }

    static /* synthetic */ void zzh(com.google.android.gms.internal.ads.zzhdc zzhdcVar, java.lang.String str) {
        str.getClass();
        com.google.android.gms.internal.ads.zzgyd zzgydVar = zzhdcVar.zzl;
        if (!zzgydVar.zzc()) {
            zzhdcVar.zzl = com.google.android.gms.internal.ads.zzgxr.zzbL(zzgydVar);
        }
        zzhdcVar.zzl.add(str);
    }

    static /* synthetic */ void zzi(com.google.android.gms.internal.ads.zzhdc zzhdcVar, int i) {
        zzhdcVar.zzc |= 1;
        zzhdcVar.zzd = i;
    }

    static /* synthetic */ void zzj(com.google.android.gms.internal.ads.zzhdc zzhdcVar, com.google.android.gms.internal.ads.zzhcd zzhcdVar) {
        zzhcdVar.getClass();
        zzhdcVar.zzf = zzhcdVar;
        zzhdcVar.zzc |= 4;
    }

    static /* synthetic */ void zzk(com.google.android.gms.internal.ads.zzhdc zzhdcVar, java.lang.String str) {
        str.getClass();
        zzhdcVar.zzc |= 2;
        zzhdcVar.zze = str;
    }

    static /* synthetic */ void zzl(com.google.android.gms.internal.ads.zzhdc zzhdcVar, int i) {
        zzhdcVar.zzk = i - 1;
        zzhdcVar.zzc |= 64;
    }

    public final int zzc() {
        return this.zzl.size();
    }

    @Override // com.google.android.gms.internal.ads.zzgxr
    protected final java.lang.Object zzdc(com.google.android.gms.internal.ads.zzgxq zzgxqVar, java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.gms.internal.ads.zzhdx zzhdxVar = null;
        switch (zzgxqVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return java.lang.Byte.valueOf(this.zzm);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.zzm = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return zzbQ(zza, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0002\u0003\u0001ᔄ\u0000\u0002ဈ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005င\u0004\u0006\u0016\u0007ဈ\u0005\b᠌\u0006\t\u001a", new java.lang.Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", com.google.android.gms.internal.ads.zzhcz.zza, "zzl"});
            case NEW_MUTABLE_INSTANCE:
                return new com.google.android.gms.internal.ads.zzhdc();
            case NEW_BUILDER:
                return new com.google.android.gms.internal.ads.zzhdb(zzhdxVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                com.google.android.gms.internal.ads.zzgzk zzgxmVar = zzb;
                if (zzgxmVar == null) {
                    synchronized (com.google.android.gms.internal.ads.zzhdc.class) {
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

    public final java.lang.String zzg() {
        return this.zze;
    }
}
