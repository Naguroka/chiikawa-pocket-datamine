package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0011\u001a\u00020\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0012¢\u0006\u0004\b\u001a\u0010\u001bJ$\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002J\"\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001e\u0010\t\u001a\u00020\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\f2\u0006\u0010\u000e\u001a\u00020\nH\u0016R\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"Lcom/ironsource/a5;", "Lcom/ironsource/to;", "Lcom/ironsource/lk;", "publisherDataHolder", "Lcom/ironsource/j5;", "auctionResponseItem", "", com.json.op.d, "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/ironsource/y;", com.json.j5.p, "", "waterfallInstances", "winnerInstance", "Lcom/ironsource/t2;", "Lcom/ironsource/t2;", "adTools", "Lcom/ironsource/mediationsdk/e;", "b", "Lcom/ironsource/mediationsdk/e;", "auctionHandler", "", "c", "Z", "loadResultsReported", "<init>", "(Lcom/ironsource/t2;Lcom/ironsource/mediationsdk/e;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class a5 implements com.json.to {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final com.json.t2 adTools;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final com.json.mediationsdk.e auctionHandler;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private boolean loadResultsReported;

    public a5(com.json.t2 adTools, com.json.mediationsdk.e auctionHandler) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adTools, "adTools");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(auctionHandler, "auctionHandler");
        this.adTools = adTools;
        this.auctionHandler = auctionHandler;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(com.json.a5 this$0, com.json.mediationsdk.impressionData.ImpressionDataListener listener, com.json.mediationsdk.impressionData.ImpressionData impressionData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "$listener");
        com.json.mediationsdk.logger.IronLog.CALLBACK.verbose(com.json.l1.a(this$0.adTools, "onImpressionSuccess " + listener.getClass().getSimpleName() + ": " + impressionData, (java.lang.String) null, 2, (java.lang.Object) null));
        listener.onImpressionSuccess(impressionData);
    }

    private final void a(com.json.lk publisherDataHolder, com.json.j5 auctionResponseItem, java.lang.String placementName) {
        if (auctionResponseItem == null) {
            com.json.mediationsdk.logger.IronLog.INTERNAL.error(com.json.l1.a(this.adTools, "reportImpressionDataToPublisher - no auctionResponseItem or listener", (java.lang.String) null, 2, (java.lang.Object) null));
            this.adTools.getEventSender().getTroubleshoot().g("reportImpressionDataToPublisher - no auctionResponseItem or listener");
            return;
        }
        final com.json.mediationsdk.impressionData.ImpressionData impressionDataA = auctionResponseItem.a(placementName);
        if (impressionDataA != null) {
            for (final com.json.mediationsdk.impressionData.ImpressionDataListener impressionDataListener : new java.util.HashSet(publisherDataHolder.a())) {
                this.adTools.e(new java.lang.Runnable() { // from class: com.ironsource.a5$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.json.a5.a(this.f$0, impressionDataListener, impressionDataA);
                    }
                });
            }
        }
    }

    @Override // com.json.to
    public void a(com.json.y instance, java.lang.String placementName, com.json.lk publisherDataHolder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instance, "instance");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(publisherDataHolder, "publisherDataHolder");
        this.auctionHandler.a(instance.getAuctionResponseItem(), instance.getInstanceType(), instance.getGenericNotifications(), placementName);
        a(publisherDataHolder, instance.getAuctionResponseItem(), placementName);
    }

    @Override // com.json.to
    public void a(java.util.List<? extends com.json.y> waterfallInstances, com.json.y winnerInstance) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(waterfallInstances, "waterfallInstances");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(winnerInstance, "winnerInstance");
        if (this.loadResultsReported) {
            return;
        }
        this.loadResultsReported = true;
        com.json.j5 auctionResponseItem = winnerInstance.getAuctionResponseItem();
        this.auctionHandler.a(auctionResponseItem, winnerInstance.getInstanceType(), winnerInstance.getGenericNotifications());
        java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>();
        java.util.concurrent.ConcurrentHashMap<java.lang.String, com.json.j5> concurrentHashMap = new java.util.concurrent.ConcurrentHashMap<>();
        for (com.json.y yVar : waterfallInstances) {
            arrayList.add(yVar.getInstanceName());
            concurrentHashMap.put(yVar.getInstanceName(), yVar.getAuctionResponseItem());
        }
        this.auctionHandler.a(arrayList, concurrentHashMap, winnerInstance.getInstanceType(), winnerInstance.getGenericNotifications(), auctionResponseItem);
    }
}
