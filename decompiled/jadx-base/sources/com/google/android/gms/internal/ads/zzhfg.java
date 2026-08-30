package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzhfg implements com.google.android.gms.internal.ads.zzhfa {
    private static final java.lang.Object zza = new java.lang.Object();
    private volatile com.google.android.gms.internal.ads.zzhfa zzb;
    private volatile java.lang.Object zzc = zza;

    private zzhfg(com.google.android.gms.internal.ads.zzhfa zzhfaVar) {
        this.zzb = zzhfaVar;
    }

    public static com.google.android.gms.internal.ads.zzhfa zza(com.google.android.gms.internal.ads.zzhfa zzhfaVar) {
        return ((zzhfaVar instanceof com.google.android.gms.internal.ads.zzhfg) || (zzhfaVar instanceof com.google.android.gms.internal.ads.zzheq)) ? zzhfaVar : new com.google.android.gms.internal.ads.zzhfg(zzhfaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    public final java.lang.Object zzb() {
        java.lang.Object obj = this.zzc;
        if (obj != zza) {
            return obj;
        }
        com.google.android.gms.internal.ads.zzhfa zzhfaVar = this.zzb;
        if (zzhfaVar == null) {
            return this.zzc;
        }
        java.lang.Object objZzb = zzhfaVar.zzb();
        this.zzc = objZzb;
        this.zzb = null;
        return objZzb;
    }
}
