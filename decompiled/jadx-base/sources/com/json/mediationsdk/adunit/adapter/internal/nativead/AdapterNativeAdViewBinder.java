package com.json.mediationsdk.adunit.adapter.internal.nativead;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\u0012\u0010\u000b\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\u0012\u0010\f\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\u0012\u0010\r\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\u0012\u0010\u000e\u001a\u00020\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u0012\u0010\u0011\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0012"}, d2 = {"Lcom/ironsource/mediationsdk/adunit/adapter/internal/nativead/AdapterNativeAdViewBinder;", "Lcom/ironsource/mediationsdk/adunit/adapter/internal/nativead/AdapterNativeAdViewBinderInterface;", "()V", "nativeAdViewHolder", "Lcom/ironsource/mediationsdk/ads/nativead/internal/NativeAdViewHolder;", "getNativeAdViewHolder", "()Lcom/ironsource/mediationsdk/ads/nativead/internal/NativeAdViewHolder;", "setAdvertiserView", "", "view", "Landroid/view/View;", "setBodyView", "setCallToActionView", "setIconView", "setMediaView", "mediaView", "Lcom/ironsource/mediationsdk/ads/nativead/LevelPlayMediaView;", "setTitleView", "mediationsdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class AdapterNativeAdViewBinder implements com.json.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinderInterface {
    private final com.json.mediationsdk.ads.nativead.internal.NativeAdViewHolder nativeAdViewHolder = new com.json.mediationsdk.ads.nativead.internal.NativeAdViewHolder();

    public final com.json.mediationsdk.ads.nativead.internal.NativeAdViewHolder getNativeAdViewHolder() {
        return this.nativeAdViewHolder;
    }

    @Override // com.json.mediationsdk.ads.nativead.interfaces.NativeAdViewBinderInterface
    public void setAdvertiserView(android.view.View view) {
        this.nativeAdViewHolder.setAdvertiserView(view);
    }

    @Override // com.json.mediationsdk.ads.nativead.interfaces.NativeAdViewBinderInterface
    public void setBodyView(android.view.View view) {
        this.nativeAdViewHolder.setBodyView(view);
    }

    @Override // com.json.mediationsdk.ads.nativead.interfaces.NativeAdViewBinderInterface
    public void setCallToActionView(android.view.View view) {
        this.nativeAdViewHolder.setCallToActionView(view);
    }

    @Override // com.json.mediationsdk.ads.nativead.interfaces.NativeAdViewBinderInterface
    public void setIconView(android.view.View view) {
        this.nativeAdViewHolder.setIconView(view);
    }

    @Override // com.json.mediationsdk.ads.nativead.interfaces.NativeAdViewBinderInterface
    public void setMediaView(com.json.mediationsdk.ads.nativead.LevelPlayMediaView mediaView) {
        this.nativeAdViewHolder.setMediaView(mediaView);
    }

    @Override // com.json.mediationsdk.ads.nativead.interfaces.NativeAdViewBinderInterface
    public void setTitleView(android.view.View view) {
        this.nativeAdViewHolder.setTitleView(view);
    }
}
