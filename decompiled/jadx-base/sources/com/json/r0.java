package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\r\b\u0016\u0018\u0000 \u00072\u00020\u0001:\u0001\u0005B\u0093\u0001\u0012\u0006\u0010\r\u001a\u00020\t\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u001c\u001a\u00020\u0018\u0012\u0006\u0010#\u001a\u00020\u001d\u0012\u0006\u0010&\u001a\u00020\u001d\u0012\u0006\u0010+\u001a\u00020\u0006\u0012\u0006\u0010-\u001a\u00020\u001d\u0012\u0006\u0010.\u001a\u00020\u001d\u0012\u0006\u00102\u001a\u00020/\u0012\u0006\u00107\u001a\u000203\u0012\u0006\u0010<\u001a\u000208\u0012\u0006\u0010>\u001a\u00020\u0006\u0012\u0006\u0010@\u001a\u00020\u0006\u0012\u0006\u0010A\u001a\u00020\u0006\u0012\b\b\u0002\u0010B\u001a\u00020\u0006¢\u0006\u0004\bC\u0010DJ\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\b\u001a\u00020\u0002R\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\"\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u001c\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\"\u0010#\u001a\u00020\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\u0005\u0010\"R\u0017\u0010&\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b$\u0010\u001f\u001a\u0004\b%\u0010!R\"\u0010+\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b\u0013\u0010)\"\u0004\b\u0005\u0010*R\u0017\u0010-\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b,\u0010\u001f\u001a\u0004\b$\u0010!R\u0017\u0010.\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b \u0010\u001f\u001a\u0004\b\u0005\u0010!R\u0017\u00102\u001a\u00020/8\u0006¢\u0006\f\n\u0004\b\u0015\u00100\u001a\u0004\b,\u00101R\u0017\u00107\u001a\u0002038\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b'\u00106R\u0017\u0010<\u001a\u0002088\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b\u001e\u0010;R\u0017\u0010>\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b=\u0010(\u001a\u0004\b4\u0010)R\u0017\u0010@\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b%\u0010(\u001a\u0004\b?\u0010)R\u0017\u0010A\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000f\u0010(\u001a\u0004\b9\u0010)R\"\u0010B\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b?\u0010(\u001a\u0004\b=\u0010)\"\u0004\b\u000b\u0010*¨\u0006E"}, d2 = {"Lcom/ironsource/r0;", "", "", "instanceName", "Lcom/ironsource/mediationsdk/model/NetworkSettings;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "", "q", com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ, "Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;", "Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;", "b", "()Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;", "adUnit", "Ljava/lang/String;", "o", "()Ljava/lang/String;", "userId", "", "c", "Ljava/util/List;", "j", "()Ljava/util/List;", "providerList", "Lcom/ironsource/l5;", "d", "Lcom/ironsource/l5;", "()Lcom/ironsource/l5;", "auctionSettings", "", "e", "I", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT, "()I", "(I)V", "maxSmashesToLoad", "f", com.json.zb.q, "smashLoadTimeout", "g", "Z", "()Z", "(Z)V", "advancedLoading", androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_HLS, "delayLoadFailure", "adExpirationInMinutes", "Lcom/ironsource/l2;", "Lcom/ironsource/l2;", "()Lcom/ironsource/l2;", "loadingData", "Lcom/ironsource/f2;", "k", "Lcom/ironsource/f2;", "()Lcom/ironsource/f2;", "interactionData", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAM_TYPE_LIVE, "J", "()J", "collectBiddingDataTimeout", "m", "providersParallelInit", androidx.media3.extractor.text.ttml.TtmlNode.TAG_P, "waitUntilAllProvidersFinishInit", "sharedManagersThread", com.json.mediationsdk.d.z, "<init>", "(Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;Ljava/lang/String;Ljava/util/List;Lcom/ironsource/l5;IIZIILcom/ironsource/l2;Lcom/ironsource/f2;JZZZZ)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public class r0 {
    public static final int r = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final com.ironsource.mediationsdk.IronSource.AD_UNIT adUnit;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final java.lang.String userId;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final java.util.List<com.json.mediationsdk.model.NetworkSettings> providerList;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final com.json.l5 auctionSettings;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private int maxSmashesToLoad;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final int smashLoadTimeout;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private boolean advancedLoading;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final int delayLoadFailure;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final int adExpirationInMinutes;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final com.json.l2 loadingData;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final com.json.f2 interactionData;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final long collectBiddingDataTimeout;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final boolean providersParallelInit;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final boolean waitUntilAllProvidersFinishInit;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final boolean sharedManagersThread;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private boolean showPriorityEnabled;

    /* JADX WARN: Multi-variable type inference failed */
    public r0(com.ironsource.mediationsdk.IronSource.AD_UNIT adUnit, java.lang.String str, java.util.List<? extends com.json.mediationsdk.model.NetworkSettings> list, com.json.l5 auctionSettings, int i, int i2, boolean z, int i3, int i4, com.json.l2 loadingData, com.json.f2 interactionData, long j, boolean z2, boolean z3, boolean z4, boolean z5) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(auctionSettings, "auctionSettings");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loadingData, "loadingData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(interactionData, "interactionData");
        this.adUnit = adUnit;
        this.userId = str;
        this.providerList = list;
        this.auctionSettings = auctionSettings;
        this.maxSmashesToLoad = i;
        this.smashLoadTimeout = i2;
        this.advancedLoading = z;
        this.delayLoadFailure = i3;
        this.adExpirationInMinutes = i4;
        this.loadingData = loadingData;
        this.interactionData = interactionData;
        this.collectBiddingDataTimeout = j;
        this.providersParallelInit = z2;
        this.waitUntilAllProvidersFinishInit = z3;
        this.sharedManagersThread = z4;
        this.showPriorityEnabled = z5;
    }

    public /* synthetic */ r0(com.ironsource.mediationsdk.IronSource.AD_UNIT ad_unit, java.lang.String str, java.util.List list, com.json.l5 l5Var, int i, int i2, boolean z, int i3, int i4, com.json.l2 l2Var, com.json.f2 f2Var, long j, boolean z2, boolean z3, boolean z4, boolean z5, int i5, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(ad_unit, str, list, l5Var, i, i2, z, i3, i4, l2Var, f2Var, j, z2, z3, z4, (i5 & 32768) != 0 ? false : z5);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getAdExpirationInMinutes() {
        return this.adExpirationInMinutes;
    }

    public final com.json.mediationsdk.model.NetworkSettings a(java.lang.String instanceName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instanceName, "instanceName");
        java.util.List<com.json.mediationsdk.model.NetworkSettings> listJ = j();
        java.lang.Object obj = null;
        if (listJ == null) {
            return null;
        }
        for (java.lang.Object obj2 : listJ) {
            if (((com.json.mediationsdk.model.NetworkSettings) obj2).getProviderInstanceName().equals(instanceName)) {
                obj = obj2;
                break;
            }
        }
        return (com.json.mediationsdk.model.NetworkSettings) obj;
    }

    public final void a(int i) {
        this.maxSmashesToLoad = i;
    }

    public final void a(boolean z) {
        this.advancedLoading = z;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final com.ironsource.mediationsdk.IronSource.AD_UNIT getAdUnit() {
        return this.adUnit;
    }

    public final void b(boolean z) {
        this.showPriorityEnabled = z;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getAdvancedLoading() {
        return this.advancedLoading;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final com.json.l5 getAuctionSettings() {
        return this.auctionSettings;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final long getCollectBiddingDataTimeout() {
        return this.collectBiddingDataTimeout;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getDelayLoadFailure() {
        return this.delayLoadFailure;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final com.json.f2 getInteractionData() {
        return this.interactionData;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final com.json.l2 getLoadingData() {
        return this.loadingData;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final int getMaxSmashesToLoad() {
        return this.maxSmashesToLoad;
    }

    public java.util.List<com.json.mediationsdk.model.NetworkSettings> j() {
        return this.providerList;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final boolean getProvidersParallelInit() {
        return this.providersParallelInit;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final boolean getSharedManagersThread() {
        return this.sharedManagersThread;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final boolean getShowPriorityEnabled() {
        return this.showPriorityEnabled;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final int getSmashLoadTimeout() {
        return this.smashLoadTimeout;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public java.lang.String getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final boolean getWaitUntilAllProvidersFinishInit() {
        return this.waitUntilAllProvidersFinishInit;
    }

    public final boolean q() {
        return this.auctionSettings.g() > 0;
    }

    public final java.lang.String r() {
        java.lang.String str = java.lang.String.format(java.util.Locale.getDefault(), "%s: %d, %s: %b, %s: %b", com.json.mediationsdk.d.x, java.lang.Integer.valueOf(this.maxSmashesToLoad), com.json.mediationsdk.d.y, java.lang.Boolean.valueOf(this.advancedLoading), com.json.mediationsdk.d.z, java.lang.Boolean.valueOf(this.showPriorityEnabled));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "format(\n          Locale…     showPriorityEnabled)");
        return str;
    }
}
