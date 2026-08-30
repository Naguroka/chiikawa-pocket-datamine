package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzhbl extends com.google.android.gms.internal.ads.zzgxr implements com.google.android.gms.internal.ads.zzgzd {
    private static final com.google.android.gms.internal.ads.zzhbl zza;
    private static volatile com.google.android.gms.internal.ads.zzgzk zzb;
    private int zzc;
    private int zzd;
    private boolean zze;
    private int zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;
    private int zzm;
    private int zzn;
    private int zzo;
    private boolean zzp;
    private boolean zzv;
    private long zzw;
    private boolean zzy;
    private java.lang.String zzf = "";
    private com.google.android.gms.internal.ads.zzgyd zzg = com.google.android.gms.internal.ads.zzgxr.zzbK();
    private java.lang.String zzl = "";
    private com.google.android.gms.internal.ads.zzgyd zzu = zzbK();
    private com.google.android.gms.internal.ads.zzgxz zzx = zzbG();
    private com.google.android.gms.internal.ads.zzgxz zzz = zzbG();

    static {
        com.google.android.gms.internal.ads.zzhbl zzhblVar = new com.google.android.gms.internal.ads.zzhbl();
        zza = zzhblVar;
        com.google.android.gms.internal.ads.zzgxr.zzbZ(com.google.android.gms.internal.ads.zzhbl.class, zzhblVar);
    }

    private zzhbl() {
    }

    @Override // com.google.android.gms.internal.ads.zzgxr
    protected final java.lang.Object zzdc(com.google.android.gms.internal.ads.zzgxq zzgxqVar, java.lang.Object obj, java.lang.Object obj2) {
        int iOrdinal = zzgxqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzbQ(zza, "\u0001\u0013\u0000\u0001\u0001\u0013\u0013\u0000\u0004\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004\u001a\u0005᠌\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006\tဈ\u0007\nင\b\u000bင\t\fင\n\rဇ\u000b\u000e\u001b\u000fဇ\f\u0010ဂ\r\u0011ࠬ\u0012ဇ\u000e\u0013ࠬ", new java.lang.Object[]{"zzc", "zzd", com.google.android.gms.internal.ads.zzhbk.zza, "zze", "zzf", "zzg", "zzh", com.google.android.gms.internal.ads.zzhbi.zza, "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzu", com.google.android.gms.internal.ads.zzhbh.class, "zzv", "zzw", "zzx", com.google.android.gms.internal.ads.zzhay.zza(), "zzy", "zzz", com.google.android.gms.internal.ads.zzhbj.zza});
        }
        if (iOrdinal == 3) {
            return new com.google.android.gms.internal.ads.zzhbl();
        }
        com.google.android.gms.internal.ads.zzhdx zzhdxVar = null;
        if (iOrdinal == 4) {
            return new com.google.android.gms.internal.ads.zzhbe(zzhdxVar);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.zzgzk zzgxmVar = zzb;
        if (zzgxmVar == null) {
            synchronized (com.google.android.gms.internal.ads.zzhbl.class) {
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
