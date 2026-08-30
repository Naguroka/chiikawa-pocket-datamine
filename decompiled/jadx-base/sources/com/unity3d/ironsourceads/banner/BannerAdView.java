package com.unity3d.ironsourceads.banner;

/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0012\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019B\u0011\b\u0010\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\u001aJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0007\u0010\bR$\u0010\u0011\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0015\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001b"}, d2 = {"Lcom/unity3d/ironsourceads/banner/BannerAdView;", "Landroid/widget/FrameLayout;", "Lcom/ironsource/n6;", "", "onBannerAdClicked", "onBannerAdShown", "Lcom/ironsource/m6;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/ironsource/m6;", "bannerAdViewInternal", "Lcom/unity3d/ironsourceads/banner/BannerAdViewListener;", "b", "Lcom/unity3d/ironsourceads/banner/BannerAdViewListener;", "getListener", "()Lcom/unity3d/ironsourceads/banner/BannerAdViewListener;", "setListener", "(Lcom/unity3d/ironsourceads/banner/BannerAdViewListener;)V", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/unity3d/ironsourceads/banner/BannerAdInfo;", "getAdInfo", "()Lcom/unity3d/ironsourceads/banner/BannerAdInfo;", "adInfo", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "(Lcom/ironsource/m6;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class BannerAdView extends android.widget.FrameLayout implements com.json.n6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private com.json.m6 bannerAdViewInternal;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private com.unity3d.ironsourceads.banner.BannerAdViewListener listener;

    private BannerAdView(android.content.Context context) {
        super(context);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BannerAdView(com.json.m6 bannerAdViewInternal) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bannerAdViewInternal, "bannerAdViewInternal");
        android.content.Context context = bannerAdViewInternal.getContainer().getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context, "bannerAdViewInternal.container.context");
        this(context);
        this.bannerAdViewInternal = bannerAdViewInternal;
        bannerAdViewInternal.a(new java.lang.ref.WeakReference<>(this));
        bannerAdViewInternal.b(new java.lang.ref.WeakReference<>(this));
    }

    public final com.unity3d.ironsourceads.banner.BannerAdInfo getAdInfo() {
        com.json.m6 m6Var = this.bannerAdViewInternal;
        if (m6Var == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("bannerAdViewInternal");
            m6Var = null;
        }
        return m6Var.getAdInfo();
    }

    public final com.unity3d.ironsourceads.banner.BannerAdViewListener getListener() {
        return this.listener;
    }

    @Override // com.json.n6
    public void onBannerAdClicked() {
        com.unity3d.ironsourceads.banner.BannerAdViewListener bannerAdViewListener = this.listener;
        if (bannerAdViewListener != null) {
            bannerAdViewListener.onBannerAdClicked(this);
        }
    }

    @Override // com.json.n6
    public void onBannerAdShown() {
        com.unity3d.ironsourceads.banner.BannerAdViewListener bannerAdViewListener = this.listener;
        if (bannerAdViewListener != null) {
            bannerAdViewListener.onBannerAdShown(this);
        }
    }

    public final void setListener(com.unity3d.ironsourceads.banner.BannerAdViewListener bannerAdViewListener) {
        this.listener = bannerAdViewListener;
    }
}
