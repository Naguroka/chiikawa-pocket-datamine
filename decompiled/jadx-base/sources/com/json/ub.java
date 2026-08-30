package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\u0013\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0006\u0010\u0005\u001a\u00020\u0004R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lcom/ironsource/ub;", "Lcom/ironsource/xl;", "", androidx.media3.extractor.text.ttml.TtmlNode.START, "Lcom/ironsource/mediationsdk/logger/IronSourceError;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/unity3d/ironsourceads/interstitial/InterstitialAdRequest;", "Lcom/unity3d/ironsourceads/interstitial/InterstitialAdRequest;", "adRequest", "Lcom/ironsource/aj;", "b", "Lcom/ironsource/aj;", "adLoadTaskListener", "Lcom/ironsource/n3;", "c", "Lcom/ironsource/n3;", "analytics", "d", "Lcom/ironsource/mediationsdk/logger/IronSourceError;", "error", "<init>", "(Lcom/unity3d/ironsourceads/interstitial/InterstitialAdRequest;Lcom/ironsource/aj;Lcom/ironsource/n3;Lcom/ironsource/mediationsdk/logger/IronSourceError;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class ub implements com.json.xl {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final com.unity3d.ironsourceads.interstitial.InterstitialAdRequest adRequest;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final com.json.aj adLoadTaskListener;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final com.json.n3 analytics;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final com.json.mediationsdk.logger.IronSourceError error;

    public ub(com.unity3d.ironsourceads.interstitial.InterstitialAdRequest adRequest, com.json.aj adLoadTaskListener, com.json.n3 analytics, com.json.mediationsdk.logger.IronSourceError error) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adRequest, "adRequest");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adLoadTaskListener, "adLoadTaskListener");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analytics, "analytics");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "error");
        this.adRequest = adRequest;
        this.adLoadTaskListener = adLoadTaskListener;
        this.analytics = analytics;
        this.error = error;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final com.json.mediationsdk.logger.IronSourceError getError() {
        return this.error;
    }

    @Override // com.json.xl
    public void start() {
        com.json.qb qbVar = new com.json.qb(this.analytics, this.adRequest.getCom.ironsource.sdk.controller.f.b.c java.lang.String(), this.adRequest.getProviderName());
        qbVar.a();
        qbVar.a(this.error);
        this.adLoadTaskListener.onAdLoadFailed(this.error);
    }
}
