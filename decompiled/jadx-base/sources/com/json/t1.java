package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0010\b&\u0018\u0000 \u00182\u00020\u0001:\u0001\u0006B\u0099\u0001\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0015\u001a\u00020\u0007\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00050\u001b\u0012\u0006\u0010&\u001a\u00020!\u0012\u0006\u0010+\u001a\u00020'\u0012\u0006\u00102\u001a\u00020,\u0012\u0006\u00104\u001a\u00020,\u0012\u0006\u00107\u001a\u00020\u0007\u0012\u0006\u00109\u001a\u00020,\u0012\u0006\u0010:\u001a\u00020,\u0012\u0006\u0010>\u001a\u00020;\u0012\u0006\u0010B\u001a\u00020?\u0012\u0006\u0010D\u001a\u00020\u0007\u0012\u0006\u0010F\u001a\u00020\u0007\u0012\u0006\u0010H\u001a\u00020\u0007\u0012\b\b\u0002\u0010J\u001a\u00020\u0007¢\u0006\u0004\bM\u0010NJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u0002J\u0006\u0010\b\u001a\u00020\u0007J\u0006\u0010\t\u001a\u00020\u0002J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u0005H\u0016R\u001a\u0010\u0011\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\f\u0010\u0010R\u001a\u0010\u0015\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00050\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010&\u001a\u00020!8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010+\u001a\u00020'8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b\"\u0010*R\"\u00102\u001a\u00020,8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b\u0006\u00101R\u0017\u00104\u001a\u00020,8\u0006¢\u0006\f\n\u0004\b3\u0010.\u001a\u0004\b3\u00100R\"\u00107\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u0010\u0012\u001a\u0004\b\u001c\u0010\u0014\"\u0004\b\u0006\u00106R\u0017\u00109\u001a\u00020,8\u0006¢\u0006\f\n\u0004\b8\u0010.\u001a\u0004\b-\u00100R\u0017\u0010:\u001a\u00020,8\u0006¢\u0006\f\n\u0004\b/\u0010.\u001a\u0004\b\u0006\u00100R\u0017\u0010>\u001a\u00020;8\u0006¢\u0006\f\n\u0004\b\u0003\u0010<\u001a\u0004\b5\u0010=R\u0017\u0010B\u001a\u00020?8\u0006¢\u0006\f\n\u0004\b\u001e\u0010@\u001a\u0004\b(\u0010AR\u0017\u0010D\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\bC\u0010\u0012\u001a\u0004\bC\u0010\u0014R\u0017\u0010F\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b$\u0010\u0012\u001a\u0004\bE\u0010\u0014R\u0017\u0010H\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\bG\u0010\u0012\u001a\u0004\bG\u0010\u0014R\"\u0010J\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bI\u0010\u0012\u001a\u0004\bI\u0010\u0014\"\u0004\b\f\u00106R\u0014\u0010K\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0019R\u0014\u0010L\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b8\u0010\u0019¨\u0006O"}, d2 = {"Lcom/ironsource/t1;", "", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAM_TYPE_LIVE, "instanceName", "Lcom/ironsource/mediationsdk/model/NetworkSettings;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "", "t", "v", com.json.pr.b, "Lorg/json/JSONObject;", "b", "Lcom/ironsource/mediationsdk/adunit/adapter/utility/AdData;", "Lcom/ironsource/c1;", "Lcom/ironsource/c1;", "()Lcom/ironsource/c1;", "adProperties", "Z", "u", "()Z", "isPublisherLoad", "c", "Ljava/lang/String;", com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ, "()Ljava/lang/String;", "userId", "", "d", "Ljava/util/List;", "m", "()Ljava/util/List;", "providerList", "Lcom/ironsource/lk;", "e", "Lcom/ironsource/lk;", "o", "()Lcom/ironsource/lk;", "publisherDataHolder", "Lcom/ironsource/l5;", "f", "Lcom/ironsource/l5;", "()Lcom/ironsource/l5;", "auctionSettings", "", "g", "I", "k", "()I", "(I)V", "maxInstancesToLoad", androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_HLS, "instanceLoadTimeout", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT, "(Z)V", "advancedLoading", "j", "delayLoadFailure", "adExpirationInMinutes", "Lcom/ironsource/l2;", "Lcom/ironsource/l2;", "()Lcom/ironsource/l2;", "loadingData", "", "J", "()J", "collectBiddingDataTimeout", com.json.zb.q, "providersParallelInit", androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_SS, "waitUntilAllProvidersFinishInit", androidx.media3.extractor.text.ttml.TtmlNode.TAG_P, "sharedManagersThread", "q", com.json.mediationsdk.d.z, "adUnitPrefix", "managerName", "<init>", "(Lcom/ironsource/c1;ZLjava/lang/String;Ljava/util/List;Lcom/ironsource/lk;Lcom/ironsource/l5;IIZIILcom/ironsource/l2;JZZZZ)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public abstract class t1 {

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public static final com.json.t1.Companion INSTANCE = new com.json.t1.Companion(null);
    public static final int s = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final com.json.c1 adProperties;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean isPublisherLoad;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final java.lang.String userId;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final java.util.List<com.json.mediationsdk.model.NetworkSettings> providerList;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final com.json.lk publisherDataHolder;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final com.json.l5 auctionSettings;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private int maxInstancesToLoad;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final int instanceLoadTimeout;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private boolean advancedLoading;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final int delayLoadFailure;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final int adExpirationInMinutes;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final com.json.l2 loadingData;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final long collectBiddingDataTimeout;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final boolean providersParallelInit;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final boolean waitUntilAllProvidersFinishInit;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private final boolean sharedManagersThread;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private boolean showPriorityEnabled;

    /* JADX INFO: renamed from: com.ironsource.t1$a, reason: from kotlin metadata */
    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014Jc\u0010\u000e\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0016\u0010\n\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0006\u0012\u0004\u0018\u00018\u00000\b2\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000bH\u0080\bø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0015"}, d2 = {"Lcom/ironsource/t1$a;", "", "AdFormatConfig", "AdUnitData", "Lcom/ironsource/c1;", "adProperties", "Lcom/ironsource/al;", "levelPlayConfig", "Lkotlin/Function1;", "Lcom/ironsource/p8;", "getAdFormatConfig", "Lkotlin/Function2;", "Lcom/ironsource/s1;", "createAdUnitData", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lcom/ironsource/c1;Lcom/ironsource/al;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "", "DISABLED", "I", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final <AdFormatConfig, AdUnitData> AdUnitData a(com.json.c1 adProperties, com.json.al levelPlayConfig, kotlin.jvm.functions.Function1<? super com.json.p8, ? extends AdFormatConfig> getAdFormatConfig, kotlin.jvm.functions.Function2<? super com.json.s1, ? super AdFormatConfig, ? extends AdUnitData> createAdUnitData) {
            java.util.List<com.json.vn> listEmptyList;
            com.json.hs hsVarD;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adProperties, "adProperties");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getAdFormatConfig, "getAdFormatConfig");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(createAdUnitData, "createAdUnitData");
            AdFormatConfig adformatconfigInvoke = getAdFormatConfig.invoke((levelPlayConfig == null || (hsVarD = levelPlayConfig.d()) == null) ? null : hsVarD.c());
            if (adformatconfigInvoke == null) {
                throw new java.lang.IllegalStateException("Error getting " + adProperties.getAdFormat() + " configurations");
            }
            if (levelPlayConfig == null || (listEmptyList = levelPlayConfig.c(adProperties.c(), adProperties.getAdUnitId())) == null) {
                listEmptyList = kotlin.collections.CollectionsKt.emptyList();
            }
            java.lang.String userIdForNetworks = com.json.mediationsdk.utils.IronSourceUtils.getUserIdForNetworks();
            java.util.List<com.json.vn> list = listEmptyList;
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((com.json.vn) it.next()).f());
            }
            com.json.lk lkVarB = com.json.lk.b();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lkVarB, "getInstance()");
            return createAdUnitData.invoke(new com.json.s1(userIdForNetworks, arrayList, lkVarB), adformatconfigInvoke);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public t1(com.json.c1 adProperties, boolean z, java.lang.String str, java.util.List<? extends com.json.mediationsdk.model.NetworkSettings> providerList, com.json.lk publisherDataHolder, com.json.l5 auctionSettings, int i, int i2, boolean z2, int i3, int i4, com.json.l2 loadingData, long j, boolean z3, boolean z4, boolean z5, boolean z6) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adProperties, "adProperties");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(providerList, "providerList");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(publisherDataHolder, "publisherDataHolder");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(auctionSettings, "auctionSettings");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loadingData, "loadingData");
        this.adProperties = adProperties;
        this.isPublisherLoad = z;
        this.userId = str;
        this.providerList = providerList;
        this.publisherDataHolder = publisherDataHolder;
        this.auctionSettings = auctionSettings;
        this.maxInstancesToLoad = i;
        this.instanceLoadTimeout = i2;
        this.advancedLoading = z2;
        this.delayLoadFailure = i3;
        this.adExpirationInMinutes = i4;
        this.loadingData = loadingData;
        this.collectBiddingDataTimeout = j;
        this.providersParallelInit = z3;
        this.waitUntilAllProvidersFinishInit = z4;
        this.sharedManagersThread = z5;
        this.showPriorityEnabled = z6;
    }

    public /* synthetic */ t1(com.json.c1 c1Var, boolean z, java.lang.String str, java.util.List list, com.json.lk lkVar, com.json.l5 l5Var, int i, int i2, boolean z2, int i3, int i4, com.json.l2 l2Var, long j, boolean z3, boolean z4, boolean z5, boolean z6, int i5, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(c1Var, z, str, list, lkVar, l5Var, i, i2, z2, i3, i4, l2Var, j, z3, z4, z5, (i5 & 65536) != 0 ? false : z6);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getAdExpirationInMinutes() {
        return this.adExpirationInMinutes;
    }

    public com.json.mediationsdk.adunit.adapter.utility.AdData a(com.json.mediationsdk.model.NetworkSettings providerSettings) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(providerSettings, "providerSettings");
        com.json.mediationsdk.adunit.adapter.utility.AdData adDataCreateAdDataForNetworkAdapter = com.json.mediationsdk.adunit.adapter.utility.AdData.createAdDataForNetworkAdapter(b(providerSettings), getAdProperties().getAdFormat(), this.userId);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(adDataCreateAdDataForNetworkAdapter, "createAdDataForNetworkAd…perties.adFormat, userId)");
        return adDataCreateAdDataForNetworkAdapter;
    }

    public final com.json.mediationsdk.model.NetworkSettings a(java.lang.String instanceName) {
        java.lang.Object next;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instanceName, "instanceName");
        java.util.Iterator<T> it = this.providerList.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (((com.json.mediationsdk.model.NetworkSettings) next).getProviderInstanceName().equals(instanceName)) {
                return (com.json.mediationsdk.model.NetworkSettings) next;
            }
        }
        next = null;
        return (com.json.mediationsdk.model.NetworkSettings) next;
    }

    public final void a(int i) {
        this.maxInstancesToLoad = i;
    }

    public final void a(boolean z) {
        this.advancedLoading = z;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public com.json.c1 getAdProperties() {
        return this.adProperties;
    }

    public abstract org.json.JSONObject b(com.json.mediationsdk.model.NetworkSettings providerSettings);

    public final void b(boolean z) {
        this.showPriorityEnabled = z;
    }

    public abstract java.lang.String c();

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getAdvancedLoading() {
        return this.advancedLoading;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final com.json.l5 getAuctionSettings() {
        return this.auctionSettings;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final long getCollectBiddingDataTimeout() {
        return this.collectBiddingDataTimeout;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getDelayLoadFailure() {
        return this.delayLoadFailure;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final int getInstanceLoadTimeout() {
        return this.instanceLoadTimeout;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final com.json.l2 getLoadingData() {
        return this.loadingData;
    }

    public abstract java.lang.String j();

    /* JADX INFO: renamed from: k, reason: from getter */
    public final int getMaxInstancesToLoad() {
        return this.maxInstancesToLoad;
    }

    public final java.lang.String l() {
        java.lang.String str;
        com.json.mediationsdk.model.Placement placementE = getAdProperties().getPlacement();
        return (placementE == null || (str = placementE.getCom.ironsource.op.d java.lang.String()) == null) ? "" : str;
    }

    public final java.util.List<com.json.mediationsdk.model.NetworkSettings> m() {
        return this.providerList;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final boolean getProvidersParallelInit() {
        return this.providersParallelInit;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final com.json.lk getPublisherDataHolder() {
        return this.publisherDataHolder;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final boolean getSharedManagersThread() {
        return this.sharedManagersThread;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final boolean getShowPriorityEnabled() {
        return this.showPriorityEnabled;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final java.lang.String getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final boolean getWaitUntilAllProvidersFinishInit() {
        return this.waitUntilAllProvidersFinishInit;
    }

    public final boolean t() {
        return this.auctionSettings.g() > 0;
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public boolean getIsPublisherLoad() {
        return this.isPublisherLoad;
    }

    public final java.lang.String v() {
        java.lang.String str = java.lang.String.format(java.util.Locale.getDefault(), "%s: %d, %s: %b, %s: %b", com.json.mediationsdk.d.x, java.lang.Integer.valueOf(this.maxInstancesToLoad), com.json.mediationsdk.d.y, java.lang.Boolean.valueOf(this.advancedLoading), com.json.mediationsdk.d.z, java.lang.Boolean.valueOf(this.showPriorityEnabled));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "format(\n          Locale…     showPriorityEnabled)");
        return str;
    }
}
