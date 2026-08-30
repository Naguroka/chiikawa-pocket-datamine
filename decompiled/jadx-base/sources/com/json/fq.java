package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/ironsource/fq;", "Lcom/ironsource/z0;", "Lcom/unity3d/ironsourceads/rewarded/RewardedAd;", "Lcom/ironsource/mj;", com.ironsource.y8.h.p0, "Lcom/ironsource/t4;", "auctionDataReporter", "b", "Lcom/ironsource/n3;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/ironsource/n3;", "analytics", "Ljava/util/concurrent/Executor;", "Ljava/util/concurrent/Executor;", "callbackExecutor", "<init>", "(Lcom/ironsource/n3;Ljava/util/concurrent/Executor;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class fq implements com.json.z0<com.unity3d.ironsourceads.rewarded.RewardedAd> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final com.json.n3 analytics;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final java.util.concurrent.Executor callbackExecutor;

    public fq(com.json.n3 analytics, java.util.concurrent.Executor callbackExecutor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analytics, "analytics");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callbackExecutor, "callbackExecutor");
        this.analytics = analytics;
        this.callbackExecutor = callbackExecutor;
    }

    @Override // com.json.z0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.unity3d.ironsourceads.rewarded.RewardedAd a(com.json.mj adInstance, com.json.t4 auctionDataReporter) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInstance, "adInstance");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(auctionDataReporter, "auctionDataReporter");
        return new com.unity3d.ironsourceads.rewarded.RewardedAd(new com.json.iq(adInstance, new com.json.y0(new com.json.yn()), auctionDataReporter, this.analytics, null, null, null, null, com.json.gq.f2698a, androidx.media3.extractor.ts.PsExtractor.VIDEO_STREAM_MASK, null));
    }
}
