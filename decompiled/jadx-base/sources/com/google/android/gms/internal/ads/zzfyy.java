package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zzfyy implements java.util.Comparator {
    protected zzfyy() {
    }

    public static com.google.android.gms.internal.ads.zzfyy zzb(java.util.Comparator comparator) {
        return new com.google.android.gms.internal.ads.zzfwy(comparator);
    }

    public static com.google.android.gms.internal.ads.zzfyy zzc() {
        return com.google.android.gms.internal.ads.zzfyw.zza;
    }

    @Override // java.util.Comparator
    public abstract int compare(java.lang.Object obj, java.lang.Object obj2);

    public com.google.android.gms.internal.ads.zzfyy zza() {
        return new com.google.android.gms.internal.ads.zzfzh(this);
    }
}
