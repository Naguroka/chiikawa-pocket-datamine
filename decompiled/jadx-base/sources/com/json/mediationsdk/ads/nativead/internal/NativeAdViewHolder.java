package com.json.mediationsdk.ads.nativead.internal;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\"\u0010#R$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0004\u001a\u0004\b\u000b\u0010\u0006\"\u0004\b\f\u0010\bR$\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006\"\u0004\b\u0010\u0010\bR$\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0004\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR$\u0010\u001d\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR$\u0010!\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0004\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\b¨\u0006$"}, d2 = {"Lcom/ironsource/mediationsdk/ads/nativead/internal/NativeAdViewHolder;", "", "Landroid/view/View;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Landroid/view/View;", "getTitleView", "()Landroid/view/View;", "setTitleView", "(Landroid/view/View;)V", "titleView", "b", "getAdvertiserView", "setAdvertiserView", "advertiserView", "c", "getIconView", "setIconView", "iconView", "d", "getBodyView", "setBodyView", "bodyView", "Lcom/ironsource/mediationsdk/ads/nativead/LevelPlayMediaView;", "e", "Lcom/ironsource/mediationsdk/ads/nativead/LevelPlayMediaView;", "getMediaView", "()Lcom/ironsource/mediationsdk/ads/nativead/LevelPlayMediaView;", "setMediaView", "(Lcom/ironsource/mediationsdk/ads/nativead/LevelPlayMediaView;)V", "mediaView", "f", "getCallToActionView", "setCallToActionView", "callToActionView", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class NativeAdViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private android.view.View titleView;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private android.view.View advertiserView;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private android.view.View iconView;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private android.view.View bodyView;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private com.json.mediationsdk.ads.nativead.LevelPlayMediaView mediaView;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private android.view.View callToActionView;

    public final android.view.View getAdvertiserView() {
        return this.advertiserView;
    }

    public final android.view.View getBodyView() {
        return this.bodyView;
    }

    public final android.view.View getCallToActionView() {
        return this.callToActionView;
    }

    public final android.view.View getIconView() {
        return this.iconView;
    }

    public final com.json.mediationsdk.ads.nativead.LevelPlayMediaView getMediaView() {
        return this.mediaView;
    }

    public final android.view.View getTitleView() {
        return this.titleView;
    }

    public final void setAdvertiserView(android.view.View view) {
        this.advertiserView = view;
    }

    public final void setBodyView(android.view.View view) {
        this.bodyView = view;
    }

    public final void setCallToActionView(android.view.View view) {
        this.callToActionView = view;
    }

    public final void setIconView(android.view.View view) {
        this.iconView = view;
    }

    public final void setMediaView(com.json.mediationsdk.ads.nativead.LevelPlayMediaView levelPlayMediaView) {
        this.mediaView = levelPlayMediaView;
    }

    public final void setTitleView(android.view.View view) {
        this.titleView = view;
    }
}
