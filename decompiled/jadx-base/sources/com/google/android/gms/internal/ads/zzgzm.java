package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzgzm {
    public static final /* synthetic */ int zza = 0;
    private static final com.google.android.gms.internal.ads.zzgzm zzb = new com.google.android.gms.internal.ads.zzgzm();
    private final java.util.concurrent.ConcurrentMap zzd = new java.util.concurrent.ConcurrentHashMap();
    private final com.google.android.gms.internal.ads.zzgzw zzc = new com.google.android.gms.internal.ads.zzgyu();

    private zzgzm() {
    }

    public static com.google.android.gms.internal.ads.zzgzm zza() {
        return zzb;
    }

    public final com.google.android.gms.internal.ads.zzgzv zzb(java.lang.Class cls) {
        com.google.android.gms.internal.ads.zzgye.zzc(cls, "messageType");
        com.google.android.gms.internal.ads.zzgzv zzgzvVarZza = (com.google.android.gms.internal.ads.zzgzv) this.zzd.get(cls);
        if (zzgzvVarZza == null) {
            zzgzvVarZza = this.zzc.zza(cls);
            com.google.android.gms.internal.ads.zzgye.zzc(cls, "messageType");
            com.google.android.gms.internal.ads.zzgzv zzgzvVar = (com.google.android.gms.internal.ads.zzgzv) this.zzd.putIfAbsent(cls, zzgzvVarZza);
            if (zzgzvVar != null) {
                return zzgzvVar;
            }
        }
        return zzgzvVarZza;
    }
}
