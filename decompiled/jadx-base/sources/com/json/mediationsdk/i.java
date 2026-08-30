package com.json.mediationsdk;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010%\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b]\u0010^J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\t\u0010\u0005\u001a\u00020\u0006HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R'\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0012j\b\u0012\u0004\u0012\u00020\u0002`\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\"\u0010\u001d\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u0010\u0010\u001cR\"\u0010#\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\u0010\u0010\"R\"\u0010&\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010\u0019\u001a\u0004\b%\u0010\u001b\"\u0004\b\u0014\u0010\u001cR4\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010'8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b(\u0010)\u0012\u0004\b-\u0010.\u001a\u0004\b*\u0010+\"\u0004\b\u0005\u0010,R.\u00106\u001a\b\u0012\u0004\u0012\u00020\b008\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b*\u00101\u0012\u0004\b5\u0010.\u001a\u0004\b2\u00103\"\u0004\b\u0005\u00104R\"\u0010<\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b\u0005\u0010;R$\u0010A\u001a\u0004\u0018\u00010=8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010>\u001a\u0004\b$\u0010?\"\u0004\b\u0005\u0010@R$\u0010G\u001a\u0004\u0018\u00010B8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010C\u001a\u0004\bD\u0010E\"\u0004\b\u0005\u0010FR\"\u0010I\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u0010\u001f\u001a\u0004\bH\u0010!\"\u0004\b\u001e\u0010\"R$\u0010O\u001a\u0004\u0018\u00010J8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\b(\u0010M\"\u0004\b\u0005\u0010NR\"\u0010Q\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bD\u0010\u0019\u001a\u0004\bP\u0010\u001b\"\u0004\b\u0005\u0010\u001cR\"\u0010S\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010\u0019\u001a\u0004\bR\u0010\u001b\"\u0004\b\u001e\u0010\u001cR\"\u0010U\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bR\u0010\u0019\u001a\u0004\bT\u0010\u001b\"\u0004\b$\u0010\u001cR$\u0010V\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bT\u0010\u001f\u001a\u0004\b\u001e\u0010!\"\u0004\b\u0014\u0010\"R$\u0010W\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bH\u0010\u001f\u001a\u0004\b\u0014\u0010!\"\u0004\b\u0005\u0010\"R$\u0010\\\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bP\u0010X\u001a\u0004\bY\u0010Z\"\u0004\b\u0005\u0010[¨\u0006_"}, d2 = {"Lcom/ironsource/mediationsdk/i;", "", "Lcom/ironsource/c5;", "instanceInfo", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;", "adUnit", "", "toString", "", "hashCode", "other", "", "equals", "Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;", "c", "()Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "b", "Ljava/util/ArrayList;", "j", "()Ljava/util/ArrayList;", "instancesInfo", "Z", "u", "()Z", "(Z)V", "isOneFlow", "d", "Ljava/lang/String;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT, "()Ljava/lang/String;", "(Ljava/lang/String;)V", "instanceId", "e", androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_SS, "isEncryptedResponse", "", "f", "Ljava/util/Map;", "g", "()Ljava/util/Map;", "(Ljava/util/Map;)V", "getBidders$annotations", "()V", "bidders", "", "Ljava/util/List;", "k", "()Ljava/util/List;", "(Ljava/util/List;)V", "getNonBidders$annotations", "nonBidders", androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_HLS, "I", com.json.zb.q, "()I", "(I)V", "sessionDepth", "Lcom/ironsource/mediationsdk/h;", "Lcom/ironsource/mediationsdk/h;", "()Lcom/ironsource/mediationsdk/h;", "(Lcom/ironsource/mediationsdk/h;)V", "auctionHistory", "Lcom/ironsource/mediationsdk/IronSourceSegment;", "Lcom/ironsource/mediationsdk/IronSourceSegment;", "m", "()Lcom/ironsource/mediationsdk/IronSourceSegment;", "(Lcom/ironsource/mediationsdk/IronSourceSegment;)V", com.json.y3.i, "q", "waterfallString", "Lcom/ironsource/mediationsdk/ISBannerSize;", androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAM_TYPE_LIVE, "Lcom/ironsource/mediationsdk/ISBannerSize;", "()Lcom/ironsource/mediationsdk/ISBannerSize;", "(Lcom/ironsource/mediationsdk/ISBannerSize;)V", com.json.h6.u, com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ, com.json.mediationsdk.utils.IronSourceConstants.EVENTS_DEMAND_ONLY, "o", "testSuiteLaunched", androidx.media3.extractor.text.ttml.TtmlNode.TAG_P, "useTestAds", "adUnitId", com.json.mediationsdk.impressionData.ImpressionData.IMPRESSION_DATA_KEY_AD_FORMAT, "Ljava/lang/Boolean;", "t", "()Ljava/lang/Boolean;", "(Ljava/lang/Boolean;)V", com.json.ce.d0, "<init>", "(Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final com.ironsource.mediationsdk.IronSource.AD_UNIT adUnit;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final java.util.ArrayList<com.json.c5> instancesInfo;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private boolean isOneFlow;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private java.lang.String instanceId;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private boolean isEncryptedResponse;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private java.util.Map<java.lang.String, java.lang.Object> bidders;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private java.util.List<java.lang.String> nonBidders;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private int sessionDepth;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private com.json.mediationsdk.h auctionHistory;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private com.json.mediationsdk.IronSourceSegment segment;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private java.lang.String waterfallString;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private com.json.mediationsdk.ISBannerSize bannerSize;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private boolean isDemandOnly;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private boolean testSuiteLaunched;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private boolean useTestAds;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private java.lang.String adUnitId;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private java.lang.String adFormat;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private java.lang.Boolean isMultipleAdsFlow;

    public i(com.ironsource.mediationsdk.IronSource.AD_UNIT adUnit) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.adUnit = adUnit;
        this.instancesInfo = new java.util.ArrayList<>();
        this.instanceId = "";
        this.bidders = new java.util.HashMap();
        this.nonBidders = new java.util.ArrayList();
        this.sessionDepth = -1;
        this.waterfallString = "";
    }

    public static /* synthetic */ com.json.mediationsdk.i a(com.json.mediationsdk.i iVar, com.ironsource.mediationsdk.IronSource.AD_UNIT ad_unit, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            ad_unit = iVar.adUnit;
        }
        return iVar.a(ad_unit);
    }

    @kotlin.Deprecated(message = "Use instancesInfo instead")
    public static /* synthetic */ void h() {
    }

    @kotlin.Deprecated(message = "Use instancesInfo instead")
    public static /* synthetic */ void l() {
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final com.ironsource.mediationsdk.IronSource.AD_UNIT getAdUnit() {
        return this.adUnit;
    }

    public final com.json.mediationsdk.i a(com.ironsource.mediationsdk.IronSource.AD_UNIT adUnit) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        return new com.json.mediationsdk.i(adUnit);
    }

    public final void a(int i) {
        this.sessionDepth = i;
    }

    public final void a(com.json.c5 instanceInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instanceInfo, "instanceInfo");
        this.instancesInfo.add(instanceInfo);
    }

    public final void a(com.json.mediationsdk.ISBannerSize iSBannerSize) {
        this.bannerSize = iSBannerSize;
    }

    public final void a(com.json.mediationsdk.IronSourceSegment ironSourceSegment) {
        this.segment = ironSourceSegment;
    }

    public final void a(com.json.mediationsdk.h hVar) {
        this.auctionHistory = hVar;
    }

    public final void a(java.lang.Boolean bool) {
        this.isMultipleAdsFlow = bool;
    }

    public final void a(java.lang.String str) {
        this.adFormat = str;
    }

    public final void a(java.util.List<java.lang.String> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.nonBidders = list;
    }

    public final void a(java.util.Map<java.lang.String, java.lang.Object> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.bidders = map;
    }

    public final void a(boolean z) {
        this.isDemandOnly = z;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final java.lang.String getAdFormat() {
        return this.adFormat;
    }

    public final void b(java.lang.String str) {
        this.adUnitId = str;
    }

    public final void b(boolean z) {
        this.isEncryptedResponse = z;
    }

    public final com.ironsource.mediationsdk.IronSource.AD_UNIT c() {
        return this.adUnit;
    }

    public final void c(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.instanceId = str;
    }

    public final void c(boolean z) {
        this.isOneFlow = z;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final java.lang.String getAdUnitId() {
        return this.adUnitId;
    }

    public final void d(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.waterfallString = str;
    }

    public final void d(boolean z) {
        this.testSuiteLaunched = z;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final com.json.mediationsdk.h getAuctionHistory() {
        return this.auctionHistory;
    }

    public final void e(boolean z) {
        this.useTestAds = z;
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.json.mediationsdk.i) && this.adUnit == ((com.json.mediationsdk.i) other).adUnit;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final com.json.mediationsdk.ISBannerSize getBannerSize() {
        return this.bannerSize;
    }

    public final java.util.Map<java.lang.String, java.lang.Object> g() {
        return this.bidders;
    }

    public int hashCode() {
        return this.adUnit.hashCode();
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final java.lang.String getInstanceId() {
        return this.instanceId;
    }

    public final java.util.ArrayList<com.json.c5> j() {
        return this.instancesInfo;
    }

    public final java.util.List<java.lang.String> k() {
        return this.nonBidders;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final com.json.mediationsdk.IronSourceSegment getSegment() {
        return this.segment;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final int getSessionDepth() {
        return this.sessionDepth;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final boolean getTestSuiteLaunched() {
        return this.testSuiteLaunched;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final boolean getUseTestAds() {
        return this.useTestAds;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final java.lang.String getWaterfallString() {
        return this.waterfallString;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final boolean getIsDemandOnly() {
        return this.isDemandOnly;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final boolean getIsEncryptedResponse() {
        return this.isEncryptedResponse;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final java.lang.Boolean getIsMultipleAdsFlow() {
        return this.isMultipleAdsFlow;
    }

    public java.lang.String toString() {
        return "AuctionRequestParams(adUnit=" + this.adUnit + ')';
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final boolean getIsOneFlow() {
        return this.isOneFlow;
    }
}
