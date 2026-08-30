package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0010¢\u0006\u0004\b\"\u0010#J.\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006H\u0002J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nJ$\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fJ\u0006\u0010\u000f\u001a\u00020\u000eR\u0014\u0010\u0012\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0011R#\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\t\u0010\u0016R\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0014\u0010\u001bR\u001b\u0010!\u001a\u00060\u001dj\u0002`\u001e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001f\u001a\u0004\b\u0019\u0010 ¨\u0006$"}, d2 = {"Lcom/ironsource/b5;", "", "", "instanceName", "", "instanceType", "", "biddingData", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/ironsource/mediationsdk/model/NetworkSettings;", com.json.pr.b, "Lcom/ironsource/x7;", "biddingResponse", "", "d", "Lcom/ironsource/t1;", "Lcom/ironsource/t1;", "adUnitData", "", "b", "Ljava/util/Map;", "()Ljava/util/Map;", "bidderCandidates", "", "c", "Ljava/util/List;", "()Ljava/util/List;", "nonBidderCandidates", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "Ljava/lang/StringBuilder;", "()Ljava/lang/StringBuilder;", "waterfallString", "<init>", "(Lcom/ironsource/t1;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class b5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final com.json.t1 adUnitData;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final java.util.Map<java.lang.String, java.lang.Object> bidderCandidates;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final java.util.List<java.lang.String> nonBidderCandidates;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final java.lang.StringBuilder waterfallString;

    public b5(com.json.t1 adUnitData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
        this.adUnitData = adUnitData;
        this.bidderCandidates = new java.util.HashMap();
        this.nonBidderCandidates = new java.util.ArrayList();
        this.waterfallString = new java.lang.StringBuilder();
    }

    private final void a(java.lang.String instanceName, int instanceType, java.util.Map<java.lang.String, ? extends java.lang.Object> biddingData) {
        this.bidderCandidates.put(instanceName, biddingData);
        this.waterfallString.append(instanceType).append(instanceName).append(",");
    }

    public final java.util.Map<java.lang.String, java.lang.Object> a() {
        return this.bidderCandidates;
    }

    public final void a(com.json.mediationsdk.model.NetworkSettings providerSettings) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(providerSettings, "providerSettings");
        java.util.List<java.lang.String> list = this.nonBidderCandidates;
        java.lang.String providerInstanceName = providerSettings.getProviderInstanceName();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(providerInstanceName, "providerSettings.providerInstanceName");
        list.add(providerInstanceName);
        this.waterfallString.append(providerSettings.getInstanceType(this.adUnitData.getAdProperties().getAdFormat())).append(providerSettings.getProviderInstanceName()).append(",");
    }

    public final void a(com.json.mediationsdk.model.NetworkSettings providerSettings, java.util.Map<java.lang.String, ? extends java.lang.Object> biddingData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(providerSettings, "providerSettings");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(biddingData, "biddingData");
        java.lang.String providerInstanceName = providerSettings.getProviderInstanceName();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(providerInstanceName, "providerSettings.providerInstanceName");
        a(providerInstanceName, providerSettings.getInstanceType(this.adUnitData.getAdProperties().getAdFormat()), biddingData);
    }

    public final void a(com.json.x7 biddingResponse) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(biddingResponse, "biddingResponse");
        java.lang.String strC = biddingResponse.c();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(strC, "biddingResponse.instanceName");
        int iD = biddingResponse.d();
        java.util.Map<java.lang.String, java.lang.Object> mapA = biddingResponse.a();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(mapA, "biddingResponse.biddingData");
        a(strC, iD, mapA);
    }

    public final java.util.List<java.lang.String> b() {
        return this.nonBidderCandidates;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final java.lang.StringBuilder getWaterfallString() {
        return this.waterfallString;
    }

    public final boolean d() {
        return (this.bidderCandidates.isEmpty() ^ true) || (this.nonBidderCandidates.isEmpty() ^ true);
    }
}
