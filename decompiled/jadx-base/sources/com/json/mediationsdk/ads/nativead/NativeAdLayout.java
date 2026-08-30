package com.json.mediationsdk.ads.nativead;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001e\u0010\u001fB\u0011\b\u0016\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001e\u0010 J\u001e\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0012\u0010\u000b\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u000e\u001a\u00020\b2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J\u0012\u0010\u000f\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u0010\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u0011\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u0012\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0006H\u0016J\u0010\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0007J\u000e\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0013R\u0014\u0010\u0019\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0018¨\u0006!"}, d2 = {"Lcom/ironsource/mediationsdk/ads/nativead/NativeAdLayout;", "Landroid/widget/FrameLayout;", "Lcom/ironsource/mediationsdk/ads/nativead/interfaces/NativeAdViewBinderInterface;", "Landroid/view/ViewGroup;", "viewGroup", "", "Landroid/view/View;", com.unity3d.services.ads.adunit.AdUnitActivity.EXTRA_VIEWS, "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "view", "setBodyView", "Lcom/ironsource/mediationsdk/ads/nativead/LevelPlayMediaView;", "mediaView", "setMediaView", "setCallToActionView", "setTitleView", "setIconView", "setAdvertiserView", "Lcom/ironsource/mediationsdk/ads/nativead/LevelPlayNativeAd;", "nativeAd", "setNativeAd", "registerNativeAdViews", "Lcom/ironsource/mediationsdk/ads/nativead/internal/NativeAdViewHolder;", "Lcom/ironsource/mediationsdk/ads/nativead/internal/NativeAdViewHolder;", "mAdViewHolder", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "(Landroid/content/Context;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class NativeAdLayout extends android.widget.FrameLayout implements com.json.mediationsdk.ads.nativead.interfaces.NativeAdViewBinderInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final com.json.mediationsdk.ads.nativead.internal.NativeAdViewHolder mAdViewHolder;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeAdLayout(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.mAdViewHolder = new com.json.mediationsdk.ads.nativead.internal.NativeAdViewHolder();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeAdLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.mAdViewHolder = new com.json.mediationsdk.ads.nativead.internal.NativeAdViewHolder();
    }

    private final java.util.List<android.view.View> a(android.view.ViewGroup viewGroup) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            android.view.View child = viewGroup.getChildAt(i);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(child, "child");
            arrayList.add(child);
        }
        return arrayList;
    }

    private final void a(android.view.ViewGroup viewGroup, java.util.List<? extends android.view.View> views) {
        java.util.Iterator<? extends android.view.View> it = views.iterator();
        while (it.hasNext()) {
            viewGroup.addView(it.next());
        }
    }

    public final void registerNativeAdViews(com.json.mediationsdk.ads.nativead.LevelPlayNativeAd nativeAd) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nativeAd, "nativeAd");
        java.util.List<android.view.View> listA = a(this);
        removeAllViews();
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(getContext());
        a(frameLayout, listA);
        com.json.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder nativeAdViewBinder = nativeAd.getNativeAdViewBinder();
        if (nativeAdViewBinder != null) {
            nativeAdViewBinder.setBodyView(this.mAdViewHolder.getBodyView());
            nativeAdViewBinder.setMediaView(this.mAdViewHolder.getMediaView());
            nativeAdViewBinder.setCallToActionView(this.mAdViewHolder.getCallToActionView());
            nativeAdViewBinder.setTitleView(this.mAdViewHolder.getTitleView());
            nativeAdViewBinder.setIconView(this.mAdViewHolder.getIconView());
            nativeAdViewBinder.setAdvertiserView(this.mAdViewHolder.getAdvertiserView());
            nativeAdViewBinder.setNativeAdView(frameLayout);
            addView(nativeAdViewBinder.getNetworkNativeAdView());
        }
    }

    @Override // com.json.mediationsdk.ads.nativead.interfaces.NativeAdViewBinderInterface
    public void setAdvertiserView(android.view.View view) {
        this.mAdViewHolder.setAdvertiserView(view);
    }

    @Override // com.json.mediationsdk.ads.nativead.interfaces.NativeAdViewBinderInterface
    public void setBodyView(android.view.View view) {
        this.mAdViewHolder.setBodyView(view);
    }

    @Override // com.json.mediationsdk.ads.nativead.interfaces.NativeAdViewBinderInterface
    public void setCallToActionView(android.view.View view) {
        this.mAdViewHolder.setCallToActionView(view);
    }

    @Override // com.json.mediationsdk.ads.nativead.interfaces.NativeAdViewBinderInterface
    public void setIconView(android.view.View view) {
        this.mAdViewHolder.setIconView(view);
    }

    @Override // com.json.mediationsdk.ads.nativead.interfaces.NativeAdViewBinderInterface
    public void setMediaView(com.json.mediationsdk.ads.nativead.LevelPlayMediaView mediaView) {
        this.mAdViewHolder.setMediaView(mediaView);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Deprecated - use registerNativeAdViews instead", replaceWith = @kotlin.ReplaceWith(expression = "registerNativeAdViews", imports = {}))
    public final void setNativeAd(com.json.mediationsdk.ads.nativead.LevelPlayNativeAd nativeAd) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nativeAd, "nativeAd");
        registerNativeAdViews(nativeAd);
    }

    @Override // com.json.mediationsdk.ads.nativead.interfaces.NativeAdViewBinderInterface
    public void setTitleView(android.view.View view) {
        this.mAdViewHolder.setTitleView(view);
    }
}
