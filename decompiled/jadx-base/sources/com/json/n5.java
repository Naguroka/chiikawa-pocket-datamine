package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0011\u001a\u00020\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0012¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0004H\u0002J\u0018\u0010\u0007\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0014\u0010\u0007\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002J\n\u0010\u0007\u001a\u0004\u0018\u00010\rH\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0017\u0010\u001d\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\t\u0010\u001c¨\u0006 "}, d2 = {"Lcom/ironsource/n5;", "", "Lcom/ironsource/n4;", com.json.y3.f, "Lcom/ironsource/o5;", "completionListener", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "b", "", "sessionDepth", "Lcom/ironsource/mediationsdk/i;", "", com.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE, "Lcom/ironsource/t2;", "Lcom/ironsource/t2;", "adTools", "Lcom/ironsource/t1;", "Lcom/ironsource/t1;", "adUnitData", "Lcom/ironsource/mediationsdk/e;", "c", "Lcom/ironsource/mediationsdk/e;", "auctionHandler", "Lcom/ironsource/a5;", "d", "Lcom/ironsource/a5;", "()Lcom/ironsource/a5;", "outcomeReporter", "<init>", "(Lcom/ironsource/t2;Lcom/ironsource/t1;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public class n5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final com.json.t2 adTools;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final com.json.t1 adUnitData;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final com.json.mediationsdk.e auctionHandler;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final com.json.a5 outcomeReporter;

    @kotlin.Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\b"}, d2 = {"com/ironsource/n5$a", "Lcom/ironsource/n4$d;", "Lcom/ironsource/n4;", com.json.y3.f, "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "", "error", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class a implements com.ironsource.n4.d {
        final /* synthetic */ com.json.o5 b;

        a(com.json.o5 o5Var) {
            this.b = o5Var;
        }

        @Override // com.ironsource.n4.d
        public void a(com.json.n4 auction) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(auction, "auction");
            com.json.n5.this.b(auction, this.b);
        }

        @Override // com.ironsource.n4.d
        public void a(com.json.n4 auction, java.lang.String error) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(auction, "auction");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "error");
            com.json.n5.this.b(auction, this.b);
        }
    }

    public n5(com.json.t2 adTools, com.json.t1 adUnitData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adTools, "adTools");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
        this.adTools = adTools;
        this.adUnitData = adUnitData;
        com.json.l5 auctionSettings = adUnitData.getAuctionSettings();
        java.lang.String sessionId = com.json.mediationsdk.utils.IronSourceUtils.getSessionId();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sessionId, "getSessionId()");
        com.json.mediationsdk.e eVar = new com.json.mediationsdk.e(new com.json.mediationsdk.f(auctionSettings, sessionId));
        this.auctionHandler = eVar;
        this.outcomeReporter = new com.json.a5(adTools, eVar);
    }

    private final com.json.mediationsdk.i a(com.json.n4 auction, int sessionDepth) {
        com.json.mediationsdk.i iVar = new com.json.mediationsdk.i(this.adUnitData.getAdProperties().getAdFormat());
        iVar.b(com.json.mediationsdk.utils.IronSourceUtils.isEncryptedResponse());
        iVar.a(auction.getAuctionRequestData().a());
        iVar.a(auction.getAuctionRequestData().b());
        iVar.a(this.adTools.getAuctionHistory());
        iVar.a(sessionDepth);
        iVar.a(this.adTools.l());
        com.json.au testSuiteLoadAdConfig = this.adUnitData.getAdProperties().getTestSuiteLoadAdConfig();
        iVar.e(testSuiteLoadAdConfig != null ? testSuiteLoadAdConfig.b() : false);
        com.json.d5 auctionRequestEnricher = this.adTools.getAuctionRequestEnricher();
        if (auctionRequestEnricher != null) {
            auctionRequestEnricher.a(iVar);
        }
        return iVar;
    }

    private final java.lang.String a() {
        return com.json.l1.a(this.adTools, (java.lang.String) null, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    private final java.lang.String a(java.lang.String message) {
        return com.json.l1.a(this.adTools, message, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    private final void a(com.json.n4 auction, com.json.o5 completionListener) {
        if (auction.d()) {
            auction.a(new com.ironsource.n5.a(completionListener));
        } else {
            b(auction, completionListener);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(com.json.n4 auction, com.json.o5 listener) {
        com.json.mediationsdk.logger.IronLog ironLog = com.json.mediationsdk.logger.IronLog.INTERNAL;
        ironLog.verbose(a("auction waterfallString = " + ((java.lang.Object) auction.getAuctionRequestData().getWaterfallString())));
        if (auction.e()) {
            this.adTools.getEventSender().getCom.ironsource.y3.f java.lang.String().b(auction.getAuctionRequestData().getWaterfallString().toString());
            this.auctionHandler.a(com.json.environment.ContextProvider.getInstance().getApplicationContext(), a(auction, this.adTools.f()), listener);
        } else {
            ironLog.verbose(a("auction failed - no candidates"));
            this.adTools.getEventSender().getCom.ironsource.y3.f java.lang.String().a(1005, "No candidates available for auctioning");
            listener.a(com.json.x1.e(this.adUnitData.getAdProperties().getAdFormat()), "no available ad to load");
        }
    }

    public void a(com.json.o5 completionListener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(completionListener, "completionListener");
        com.json.mediationsdk.logger.IronLog.INTERNAL.verbose(a());
        this.adTools.getEventSender().getCom.ironsource.y3.f java.lang.String().a();
        a(new com.json.n4(this.adTools, this.adUnitData), completionListener);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final com.json.a5 getOutcomeReporter() {
        return this.outcomeReporter;
    }
}
