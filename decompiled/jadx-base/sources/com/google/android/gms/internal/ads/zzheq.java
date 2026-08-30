package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzheq implements com.google.android.gms.internal.ads.zzhfa, com.google.android.gms.internal.ads.zzhel {
    private static final java.lang.Object zza = new java.lang.Object();
    private volatile com.google.android.gms.internal.ads.zzhfa zzb;
    private volatile java.lang.Object zzc = zza;

    private zzheq(com.google.android.gms.internal.ads.zzhfa zzhfaVar) {
        this.zzb = zzhfaVar;
    }

    public static com.google.android.gms.internal.ads.zzhel zza(com.google.android.gms.internal.ads.zzhfa zzhfaVar) {
        return zzhfaVar instanceof com.google.android.gms.internal.ads.zzhel ? (com.google.android.gms.internal.ads.zzhel) zzhfaVar : new com.google.android.gms.internal.ads.zzheq(zzhfaVar);
    }

    public static com.google.android.gms.internal.ads.zzhfa zzc(com.google.android.gms.internal.ads.zzhfa zzhfaVar) {
        return zzhfaVar instanceof com.google.android.gms.internal.ads.zzheq ? zzhfaVar : new com.google.android.gms.internal.ads.zzheq(zzhfaVar);
    }

    private final synchronized java.lang.Object zzd() {
        java.lang.Object obj = this.zzc;
        java.lang.Object obj2 = zza;
        if (obj != obj2) {
            return obj;
        }
        java.lang.Object objZzb = this.zzb.zzb();
        java.lang.Object obj3 = this.zzc;
        if (obj3 != obj2 && obj3 != objZzb) {
            throw new java.lang.IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + objZzb + ". This is likely due to a circular dependency.");
        }
        this.zzc = objZzb;
        this.zzb = null;
        return objZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    public final java.lang.Object zzb() {
        java.lang.Object obj = this.zzc;
        return obj == zza ? zzd() : obj;
    }
}
