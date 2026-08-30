package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0006\u0010\u0005\u001a\u00020\u0004R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/ironsource/sb;", "Lcom/ironsource/xl;", "", androidx.media3.extractor.text.ttml.TtmlNode.START, "Lcom/ironsource/mediationsdk/logger/IronSourceError;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/ironsource/mediationsdk/logger/IronSourceError;", "error", "Lcom/ironsource/b7;", "b", "Lcom/ironsource/b7;", "adLoadTaskListener", "Lcom/ironsource/n3;", "c", "Lcom/ironsource/n3;", "analytics", "<init>", "(Lcom/ironsource/mediationsdk/logger/IronSourceError;Lcom/ironsource/b7;Lcom/ironsource/n3;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class sb implements com.json.xl {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final com.json.mediationsdk.logger.IronSourceError error;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final com.json.b7 adLoadTaskListener;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final com.json.n3 analytics;

    public sb(com.json.mediationsdk.logger.IronSourceError error, com.json.b7 adLoadTaskListener, com.json.n3 analytics) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "error");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adLoadTaskListener, "adLoadTaskListener");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analytics, "analytics");
        this.error = error;
        this.adLoadTaskListener = adLoadTaskListener;
        this.analytics = analytics;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final com.json.mediationsdk.logger.IronSourceError getError() {
        return this.error;
    }

    @Override // com.json.xl
    public void start() {
        com.ironsource.g3.c.Companion companion = com.ironsource.g3.c.INSTANCE;
        companion.a().a(this.analytics);
        companion.a(new com.ironsource.j3.j(this.error.getErrorCode()), new com.ironsource.j3.k(this.error.getErrorMessage()), new com.ironsource.j3.f(0L)).a(this.analytics);
        this.adLoadTaskListener.onAdLoadFailed(this.error);
    }
}
