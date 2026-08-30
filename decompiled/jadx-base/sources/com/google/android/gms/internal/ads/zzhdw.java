package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzhdw extends com.google.android.gms.internal.ads.zzgxr implements com.google.android.gms.internal.ads.zzgzd {
    private static final com.google.android.gms.internal.ads.zzhdw zza;
    private static volatile com.google.android.gms.internal.ads.zzgzk zzb;
    private int zzc;
    private boolean zzj;
    private double zzk;
    private int zzm;
    private boolean zzn;
    private boolean zzo;
    private boolean zzp;
    private boolean zzu;
    private java.lang.String zzd = "";
    private java.lang.String zze = "";
    private int zzf = 4;
    private com.google.android.gms.internal.ads.zzgyd zzg = com.google.android.gms.internal.ads.zzgxr.zzbK();
    private java.lang.String zzh = "";
    private java.lang.String zzi = "";
    private com.google.android.gms.internal.ads.zzgyd zzl = zzbK();

    static {
        com.google.android.gms.internal.ads.zzhdw zzhdwVar = new com.google.android.gms.internal.ads.zzhdw();
        zza = zzhdwVar;
        com.google.android.gms.internal.ads.zzgxr.zzbZ(com.google.android.gms.internal.ads.zzhdw.class, zzhdwVar);
    }

    private zzhdw() {
    }

    @Override // com.google.android.gms.internal.ads.zzgxr
    protected final java.lang.Object zzdc(com.google.android.gms.internal.ads.zzgxq zzgxqVar, java.lang.Object obj, java.lang.Object obj2) {
        int iOrdinal = zzgxqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzbQ(zza, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0002\u0000\u0001ဈ\u0000\u0002᠌\u0002\u0003\u001a\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဇ\u0005\u0007က\u0006\b\u001b\tဈ\u0001\n᠌\u0007\u000bဇ\b\fဇ\t\rဇ\n\u000eဇ\u000b", new java.lang.Object[]{"zzc", "zzd", "zzf", com.google.android.gms.internal.ads.zzhdv.zza, "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", com.google.android.gms.internal.ads.zzhdu.class, "zze", "zzm", com.google.android.gms.internal.ads.zzhds.zza, "zzn", "zzo", "zzp", "zzu"});
        }
        if (iOrdinal == 3) {
            return new com.google.android.gms.internal.ads.zzhdw();
        }
        com.google.android.gms.internal.ads.zzhdx zzhdxVar = null;
        if (iOrdinal == 4) {
            return new com.google.android.gms.internal.ads.zzhdr(zzhdxVar);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.zzgzk zzgxmVar = zzb;
        if (zzgxmVar == null) {
            synchronized (com.google.android.gms.internal.ads.zzhdw.class) {
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
