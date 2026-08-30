package com.unity3d.ironsourceads.interstitial;

/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0017\u001a\u00020\u0014¢\u0006\u0004\b$\u0010%J\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004J\b\u0010\b\u001a\u00020\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\u0006H\u0016J\b\u0010\r\u001a\u00020\u0006H\u0016J\b\u0010\u000e\u001a\u00020\u0006H\u0016J\u001a\u0010\u0013\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R$\u0010\u001f\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0011\u0010#\u001a\u00020 8F¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006&"}, d2 = {"Lcom/unity3d/ironsourceads/interstitial/InterstitialAd;", "Lcom/ironsource/xi;", "", "isReadyToShow", "Landroid/app/Activity;", "activity", "", com.json.j5.v, "onAdInstanceDidShow", "Lcom/ironsource/mediationsdk/logger/IronSourceError;", "error", "onAdInstanceDidFailedToShow", "onAdInstanceDidBecomeVisible", "onAdInstanceDidClick", "onAdInstanceDidDismiss", "", "demandSourceId", "", "amount", "onAdInstanceDidReward", "Lcom/ironsource/wi;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/ironsource/wi;", "interstitialAdInternal", "Lcom/unity3d/ironsourceads/interstitial/InterstitialAdListener;", "b", "Lcom/unity3d/ironsourceads/interstitial/InterstitialAdListener;", "getListener", "()Lcom/unity3d/ironsourceads/interstitial/InterstitialAdListener;", "setListener", "(Lcom/unity3d/ironsourceads/interstitial/InterstitialAdListener;)V", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/unity3d/ironsourceads/interstitial/InterstitialAdInfo;", "getAdInfo", "()Lcom/unity3d/ironsourceads/interstitial/InterstitialAdInfo;", "adInfo", "<init>", "(Lcom/ironsource/wi;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class InterstitialAd implements com.json.xi {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final com.json.wi interstitialAdInternal;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private com.unity3d.ironsourceads.interstitial.InterstitialAdListener listener;

    public InterstitialAd(com.json.wi interstitialAdInternal) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(interstitialAdInternal, "interstitialAdInternal");
        this.interstitialAdInternal = interstitialAdInternal;
        interstitialAdInternal.a(this);
    }

    public final com.unity3d.ironsourceads.interstitial.InterstitialAdInfo getAdInfo() {
        return this.interstitialAdInternal.getAdInfo();
    }

    public final com.unity3d.ironsourceads.interstitial.InterstitialAdListener getListener() {
        return this.listener;
    }

    public final boolean isReadyToShow() {
        return this.interstitialAdInternal.d();
    }

    @Override // com.json.xi
    public void onAdInstanceDidBecomeVisible() {
        com.unity3d.ironsourceads.interstitial.InterstitialAdListener interstitialAdListener = this.listener;
        if (interstitialAdListener != null) {
            interstitialAdListener.onInterstitialAdShown(this);
        }
    }

    @Override // com.json.xi
    public void onAdInstanceDidClick() {
        com.unity3d.ironsourceads.interstitial.InterstitialAdListener interstitialAdListener = this.listener;
        if (interstitialAdListener != null) {
            interstitialAdListener.onInterstitialAdClicked(this);
        }
    }

    @Override // com.json.xi
    public void onAdInstanceDidDismiss() {
        com.unity3d.ironsourceads.interstitial.InterstitialAdListener interstitialAdListener = this.listener;
        if (interstitialAdListener != null) {
            interstitialAdListener.onInterstitialAdDismissed(this);
        }
    }

    @Override // com.json.xi
    public void onAdInstanceDidFailedToShow(com.json.mediationsdk.logger.IronSourceError error) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "error");
        com.unity3d.ironsourceads.interstitial.InterstitialAdListener interstitialAdListener = this.listener;
        if (interstitialAdListener != null) {
            interstitialAdListener.onInterstitialAdFailedToShow(this, error);
        }
    }

    @Override // com.json.xi
    public void onAdInstanceDidReward(java.lang.String demandSourceId, int amount) {
    }

    @Override // com.json.xi
    public void onAdInstanceDidShow() {
        com.unity3d.ironsourceads.interstitial.InterstitialAdListener interstitialAdListener = this.listener;
        if (interstitialAdListener != null) {
            interstitialAdListener.onInterstitialAdShown(this);
        }
    }

    public final void setListener(com.unity3d.ironsourceads.interstitial.InterstitialAdListener interstitialAdListener) {
        this.listener = interstitialAdListener;
    }

    public final void show(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        this.interstitialAdInternal.a(activity);
    }
}
