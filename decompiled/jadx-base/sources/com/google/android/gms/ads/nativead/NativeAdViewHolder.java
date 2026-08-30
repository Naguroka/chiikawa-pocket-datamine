package com.google.android.gms.ads.nativead;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class NativeAdViewHolder {
    public static final java.util.WeakHashMap zza = new java.util.WeakHashMap();

    @org.checkerframework.checker.initialization.qual.NotOnlyInitialized
    private com.google.android.gms.internal.ads.zzbgg zzb;
    private java.lang.ref.WeakReference zzc;

    public NativeAdViewHolder(android.view.View view, java.util.Map<java.lang.String, android.view.View> map, java.util.Map<java.lang.String, android.view.View> map2) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(view, "ContainerView must not be null");
        if (view instanceof com.google.android.gms.ads.nativead.NativeAdView) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("The provided containerView is of type of NativeAdView, which cannot be usedwith NativeAdViewHolder.");
            return;
        }
        java.util.WeakHashMap weakHashMap = zza;
        if (weakHashMap.get(view) != null) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("The provided containerView is already in use with another NativeAdViewHolder.");
            return;
        }
        weakHashMap.put(view, this);
        this.zzc = new java.lang.ref.WeakReference(view);
        this.zzb = com.google.android.gms.ads.internal.client.zzbc.zza().zzk(view, zza(map), zza(map2));
    }

    private static final java.util.HashMap zza(java.util.Map map) {
        return map == null ? new java.util.HashMap() : new java.util.HashMap(map);
    }

    public final void setClickConfirmingView(android.view.View view) {
        try {
            this.zzb.zzb(com.google.android.gms.dynamic.ObjectWrapper.wrap(view));
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Unable to call setClickConfirmingView on delegate", e);
        }
    }

    public void setNativeAd(com.google.android.gms.ads.nativead.NativeAd nativeAd) {
        com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper = (com.google.android.gms.dynamic.IObjectWrapper) nativeAd.zza();
        java.lang.ref.WeakReference weakReference = this.zzc;
        android.view.View view = weakReference != null ? (android.view.View) weakReference.get() : null;
        if (view == null) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("NativeAdViewHolder.setNativeAd containerView doesn't exist, returning");
            return;
        }
        java.util.WeakHashMap weakHashMap = zza;
        if (!weakHashMap.containsKey(view)) {
            weakHashMap.put(view, this);
        }
        com.google.android.gms.internal.ads.zzbgg zzbggVar = this.zzb;
        if (zzbggVar != null) {
            try {
                zzbggVar.zzc(iObjectWrapper);
            } catch (android.os.RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Unable to call setNativeAd on delegate", e);
            }
        }
    }

    public void unregisterNativeAd() {
        com.google.android.gms.internal.ads.zzbgg zzbggVar = this.zzb;
        if (zzbggVar != null) {
            try {
                zzbggVar.zzd();
            } catch (android.os.RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Unable to call unregisterNativeAd on delegate", e);
            }
        }
        java.lang.ref.WeakReference weakReference = this.zzc;
        android.view.View view = weakReference != null ? (android.view.View) weakReference.get() : null;
        if (view != null) {
            zza.remove(view);
        }
    }
}
