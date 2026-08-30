package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzhes implements com.google.android.gms.internal.ads.zzher, com.google.android.gms.internal.ads.zzhel {
    private static final com.google.android.gms.internal.ads.zzhes zza = new com.google.android.gms.internal.ads.zzhes(null);
    private final java.lang.Object zzb;

    private zzhes(java.lang.Object obj) {
        this.zzb = obj;
    }

    public static com.google.android.gms.internal.ads.zzher zza(java.lang.Object obj) {
        com.google.android.gms.internal.ads.zzhez.zza(obj, "instance cannot be null");
        return new com.google.android.gms.internal.ads.zzhes(obj);
    }

    public static com.google.android.gms.internal.ads.zzher zzc(java.lang.Object obj) {
        return obj == null ? zza : new com.google.android.gms.internal.ads.zzhes(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    public final java.lang.Object zzb() {
        return this.zzb;
    }
}
