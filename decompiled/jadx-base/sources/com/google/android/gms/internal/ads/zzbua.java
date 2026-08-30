package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbua {

    @javax.annotation.Nonnull
    private android.view.View zza;
    private final java.util.Map zzb = new java.util.HashMap();

    public final com.google.android.gms.internal.ads.zzbua zzb(android.view.View view) {
        this.zza = view;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzbua zzc(java.util.Map map) {
        this.zzb.clear();
        for (java.util.Map.Entry entry : map.entrySet()) {
            android.view.View view = (android.view.View) entry.getValue();
            if (view != null) {
                this.zzb.put((java.lang.String) entry.getKey(), new java.lang.ref.WeakReference(view));
            }
        }
        return this;
    }
}
