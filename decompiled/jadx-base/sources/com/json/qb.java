package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\n\u0010\u000b\u001a\u00060\tj\u0002`\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/ironsource/qb;", "", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/ironsource/mediationsdk/logger/IronSourceError;", "error", "Lcom/ironsource/n3;", "Lcom/ironsource/n3;", "analytics", "", "Lcom/unity3d/ironsourceads/internal/load/AdRequestAdId;", "adRequestAdId", "Lcom/ironsource/up;", "adRequestProviderName", "<init>", "(Lcom/ironsource/n3;Ljava/lang/String;Lcom/ironsource/up;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class qb {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final com.json.n3 analytics;

    public qb(com.json.n3 analytics, java.lang.String adRequestAdId, com.json.up adRequestProviderName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analytics, "analytics");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adRequestAdId, "adRequestAdId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adRequestProviderName, "adRequestProviderName");
        this.analytics = analytics;
        analytics.a(new com.ironsource.j3.s(adRequestProviderName.value()), new com.ironsource.j3.b(adRequestAdId));
    }

    public final void a() {
        com.ironsource.g3.c.INSTANCE.a().a(this.analytics);
    }

    public final void a(com.json.mediationsdk.logger.IronSourceError error) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "error");
        com.ironsource.g3.c.INSTANCE.a(new com.ironsource.j3.j(error.getErrorCode()), new com.ironsource.j3.k(error.getErrorMessage()), new com.ironsource.j3.f(0L)).a(this.analytics);
    }
}
