package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0016\u001a\u00020\u0013\u0012\u0006\u0010\u001a\u001a\u00020\u0017¢\u0006\u0004\b\u001b\u0010\u001cJ \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002J\b\u0010\u000e\u001a\u00020\rH\u0002J\b\u0010\u000f\u001a\u00020\u0004H\u0002J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J&\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0006R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, d2 = {"Lcom/ironsource/bo;", "Lcom/ironsource/tv;", "Lcom/ironsource/uv;", "waterfallFetcherListener", "Lcom/ironsource/g5;", "auctionData", "Lcom/ironsource/b0;", "adInstanceFactory", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "", "Lcom/ironsource/j5;", "d", "", "c", "b", "", "auctionTrial", com.json.mediationsdk.utils.IronSourceConstants.AUCTION_FALLBACK, "Lcom/ironsource/t2;", "e", "Lcom/ironsource/t2;", "tools", "Lcom/ironsource/t1;", "f", "Lcom/ironsource/t1;", "adUnitData", "<init>", "(Lcom/ironsource/t2;Lcom/ironsource/t1;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class bo extends com.json.tv {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final com.json.t2 tools;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final com.json.t1 adUnitData;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bo(com.json.t2 tools, com.json.t1 adUnitData) {
        super(tools, adUnitData);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tools, "tools");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
        this.tools = tools;
        this.adUnitData = adUnitData;
    }

    private final void a(com.json.uv waterfallFetcherListener, com.json.g5 auctionData, com.json.b0 adInstanceFactory) {
        com.json.mediationsdk.logger.IronLog.INTERNAL.verbose(com.json.l1.a(this.tools, (java.lang.String) null, (java.lang.String) null, 3, (java.lang.Object) null));
        waterfallFetcherListener.a(a(d(), auctionData, adInstanceFactory));
    }

    private final com.json.g5 b() {
        return new com.json.g5("", new org.json.JSONObject(), null, 0, "");
    }

    private final java.lang.String c() {
        return "fallback_" + java.lang.System.currentTimeMillis();
    }

    private final java.util.List<com.json.j5> d() {
        com.json.au testSuiteLoadAdConfig = this.adUnitData.getAdProperties().getTestSuiteLoadAdConfig();
        java.util.List<com.json.mediationsdk.model.NetworkSettings> listM = this.adUnitData.m();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : listM) {
            com.json.mediationsdk.model.NetworkSettings networkSettings = (com.json.mediationsdk.model.NetworkSettings) obj;
            if ((testSuiteLoadAdConfig == null || testSuiteLoadAdConfig.a(networkSettings, this.adUnitData.getAdProperties().getAdFormat())) && !networkSettings.isBidder(this.adUnitData.getAdProperties().getAdFormat())) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new com.json.j5(((com.json.mediationsdk.model.NetworkSettings) it.next()).getProviderInstanceName()));
        }
        return arrayList2;
    }

    @Override // com.json.tv
    public void a(com.json.b0 adInstanceFactory, com.json.uv waterfallFetcherListener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInstanceFactory, "adInstanceFactory");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(waterfallFetcherListener, "waterfallFetcherListener");
        com.json.mediationsdk.logger.IronLog.INTERNAL.verbose(com.json.l1.a(this.tools, "auction disabled", (java.lang.String) null, 2, (java.lang.Object) null));
        a(waterfallFetcherListener, b(), adInstanceFactory);
    }

    public final void a(com.json.uv waterfallFetcherListener, int auctionTrial, java.lang.String auctionFallback, com.json.b0 adInstanceFactory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(waterfallFetcherListener, "waterfallFetcherListener");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(auctionFallback, "auctionFallback");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInstanceFactory, "adInstanceFactory");
        a(waterfallFetcherListener, new com.json.g5(c(), new org.json.JSONObject(), null, auctionTrial, auctionFallback), adInstanceFactory);
    }
}
