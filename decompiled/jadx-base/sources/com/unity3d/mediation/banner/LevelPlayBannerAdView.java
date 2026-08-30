package com.unity3d.mediation.banner;

/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010!\u001a\u00020\t¢\u0006\u0004\b\u001f\u0010\"J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\b\u001a\u00020\u0006J\u0006\u0010\n\u001a\u00020\tJ\u000e\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bJ\u0006\u0010\u000e\u001a\u00020\u000bJ\u0010\u0010\u0011\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fJ\b\u0010\u0012\u001a\u0004\u0018\u00010\u000fJ\u0010\u0010\u0014\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\tJ\u0006\u0010\u0015\u001a\u00020\tJ\u0006\u0010\u0016\u001a\u00020\u0006J\u0006\u0010\u0017\u001a\u00020\u0006R\u0014\u0010\u001a\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0019¨\u0006#"}, d2 = {"Lcom/unity3d/mediation/banner/LevelPlayBannerAdView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Lcom/ironsource/t6;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "", "loadAd", "destroy", "", "getAdUnitId", "Lcom/unity3d/mediation/LevelPlayAdSize;", com.ironsource.y8.h.O, "setAdSize", "getAdSize", "Lcom/unity3d/mediation/banner/LevelPlayBannerAdViewListener;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setBannerListener", "getBannerListener", com.json.op.d, "setPlacementName", "getPlacementName", "pauseAutoRefresh", "resumeAutoRefresh", "Lcom/ironsource/zk;", "Lcom/ironsource/zk;", "bannerViewInternal", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "adUnitId", "(Landroid/content/Context;Ljava/lang/String;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class LevelPlayBannerAdView extends android.widget.FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final com.json.zk bannerViewInternal;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LevelPlayBannerAdView(android.content.Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LevelPlayBannerAdView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LevelPlayBannerAdView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        com.json.t6 t6VarA = a(context);
        addView(t6VarA);
        this.bannerViewInternal = new com.json.zk(t6VarA, attributeSet);
    }

    public /* synthetic */ LevelPlayBannerAdView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LevelPlayBannerAdView(android.content.Context context, java.lang.String adUnitId) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        this.bannerViewInternal.a(adUnitId);
    }

    private final com.json.t6 a(android.content.Context context) {
        com.json.t6 t6Var = new com.json.t6(context);
        t6Var.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
        return t6Var;
    }

    public final void destroy() {
        this.bannerViewInternal.f();
    }

    public final com.unity3d.mediation.LevelPlayAdSize getAdSize() {
        return this.bannerViewInternal.getCom.ironsource.y8.h.O java.lang.String();
    }

    public final java.lang.String getAdUnitId() {
        return this.bannerViewInternal.getAdUnitId();
    }

    public final com.unity3d.mediation.banner.LevelPlayBannerAdViewListener getBannerListener() {
        return this.bannerViewInternal.getBannerListener();
    }

    public final java.lang.String getPlacementName() {
        return this.bannerViewInternal.getPlacementName();
    }

    public final void loadAd() {
        this.bannerViewInternal.j();
    }

    public final void pauseAutoRefresh() {
        this.bannerViewInternal.k();
    }

    public final void resumeAutoRefresh() {
        this.bannerViewInternal.l();
    }

    public final void setAdSize(com.unity3d.mediation.LevelPlayAdSize adSize) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adSize, "adSize");
        this.bannerViewInternal.a(adSize);
    }

    public final void setBannerListener(com.unity3d.mediation.banner.LevelPlayBannerAdViewListener listener) {
        this.bannerViewInternal.a(listener);
    }

    public final void setPlacementName(java.lang.String placementName) {
        com.json.zk zkVar = this.bannerViewInternal;
        if (placementName == null) {
            placementName = "";
        }
        zkVar.b(placementName);
    }
}
