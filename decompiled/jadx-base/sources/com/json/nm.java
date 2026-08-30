package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u0000 @2\u00020\u0001:\u0001\u0005BW\u0012\u0006\u0010\u001a\u001a\u00020\u0015\u0012\u0006\u0010 \u001a\u00020\u001b\u0012\u0006\u0010#\u001a\u00020\t\u0012\u0006\u0010:\u001a\u00020\u000e\u0012\u0006\u00102\u001a\u00020-\u0012\u0006\u0010,\u001a\u00020\u0015\u0012\u0006\u0010;\u001a\u00020\u001b\u0012\u0006\u0010<\u001a\u00020\t\u0012\u0006\u0010=\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\t¢\u0006\u0004\b>\u0010?J\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u0006J\b\u0010\b\u001a\u00020\u0006H\u0016R\u001a\u0010\r\u001a\u00020\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\n\u001a\u0004\b\u000b\u0010\fR\"\u0010\u0014\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0005\u0010\u0013R\"\u0010\u001a\u001a\u00020\u00158\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u000f\u0010\u0018\"\u0004\b\u0005\u0010\u0019R\"\u0010 \u001a\u00020\u001b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0016\u0010\u001e\"\u0004\b\u0005\u0010\u001fR\"\u0010#\u001a\u00020\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b!\u0010\n\u001a\u0004\b\u0005\u0010\f\"\u0004\b\u0005\u0010\"R$\u0010(\u001a\u0012\u0012\u0004\u0012\u00020\u00020$j\b\u0012\u0004\u0012\u00020\u0002`%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010*\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010)R\"\u0010,\u001a\u00020\u00158\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b+\u0010\u0017\u001a\u0004\b&\u0010\u0018\"\u0004\b\u000f\u0010\u0019R\"\u00102\u001a\u00020-8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b\u001c\u00100\"\u0004\b\u0005\u00101R\"\u00103\u001a\u00020\u001b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u001d\u001a\u0004\b+\u0010\u001e\"\u0004\b\u000f\u0010\u001fR\"\u00105\u001a\u00020\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b4\u0010\n\u001a\u0004\b.\u0010\f\"\u0004\b\u000f\u0010\"R\"\u00107\u001a\u00020\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b6\u0010\n\u001a\u0004\b4\u0010\f\"\u0004\b\u0016\u0010\"R\u0013\u00109\u001a\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b!\u00108¨\u0006A"}, d2 = {"Lcom/ironsource/nm;", "", "Lcom/ironsource/ym;", "placement", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "", com.json.op.d, "toString", "", "Z", "j", "()Z", "mSharedManagersThread", "Lcom/ironsource/e4;", "b", "Lcom/ironsource/e4;", "g", "()Lcom/ironsource/e4;", "(Lcom/ironsource/e4;)V", "eventsConfigurations", "", "c", "I", "()I", "(I)V", "adaptersSmartLoadAmount", "", "d", "J", "()J", "(J)V", "adaptersSmartLoadTimeoutInMills", "e", "(Z)V", "adapterAdvancedLoading", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "f", "Ljava/util/ArrayList;", "mPlacements", "Lcom/ironsource/ym;", "mDefaultPlacement", androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_HLS, "delayLoadFailure", "Lcom/ironsource/l5;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT, "Lcom/ironsource/l5;", "()Lcom/ironsource/l5;", "(Lcom/ironsource/l5;)V", "auctionSettings", "mCollectBiddingDataTimeout", "k", "mProvidersParallelInit", androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAM_TYPE_LIVE, "mWaitUntilAllProvidersFinishInit", "()Lcom/ironsource/ym;", "defaultPlacement", "events", "collectBiddingDataTimeout", "providersParallelInit", "waitUntilAllProvidersFinishInit", "<init>", "(IJZLcom/ironsource/e4;Lcom/ironsource/l5;IJZZZ)V", "m", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class nm {
    private static final int n = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean mSharedManagersThread;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private com.json.e4 eventsConfigurations;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private int adaptersSmartLoadAmount;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private long adaptersSmartLoadTimeoutInMills;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private boolean adapterAdvancedLoading;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final java.util.ArrayList<com.json.ym> mPlacements;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private com.json.ym mDefaultPlacement;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private int delayLoadFailure;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private com.json.l5 auctionSettings;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private long mCollectBiddingDataTimeout;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private boolean mProvidersParallelInit;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private boolean mWaitUntilAllProvidersFinishInit;

    public nm(int i, long j, boolean z, com.json.e4 events, com.json.l5 auctionSettings, int i2, long j2, boolean z2, boolean z3, boolean z4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(events, "events");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(auctionSettings, "auctionSettings");
        this.mSharedManagersThread = z4;
        this.mPlacements = new java.util.ArrayList<>();
        this.adaptersSmartLoadAmount = i;
        this.adaptersSmartLoadTimeoutInMills = j;
        this.adapterAdvancedLoading = z;
        this.eventsConfigurations = events;
        this.delayLoadFailure = i2;
        this.auctionSettings = auctionSettings;
        this.mCollectBiddingDataTimeout = j2;
        this.mProvidersParallelInit = z2;
        this.mWaitUntilAllProvidersFinishInit = z3;
    }

    public final com.json.ym a(java.lang.String placementName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placementName, "placementName");
        for (com.json.ym ymVar : this.mPlacements) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(ymVar.getCom.ironsource.op.d java.lang.String(), placementName)) {
                return ymVar;
            }
        }
        return null;
    }

    public final void a(int i) {
        this.adaptersSmartLoadAmount = i;
    }

    public final void a(long j) {
        this.adaptersSmartLoadTimeoutInMills = j;
    }

    public final void a(com.json.e4 e4Var) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(e4Var, "<set-?>");
        this.eventsConfigurations = e4Var;
    }

    public final void a(com.json.l5 l5Var) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(l5Var, "<set-?>");
        this.auctionSettings = l5Var;
    }

    public final void a(com.json.ym placement) {
        if (placement != null) {
            this.mPlacements.add(placement);
            if (this.mDefaultPlacement == null || placement.getPlacementId() == 0) {
                this.mDefaultPlacement = placement;
            }
        }
    }

    public final void a(boolean z) {
        this.adapterAdvancedLoading = z;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getAdapterAdvancedLoading() {
        return this.adapterAdvancedLoading;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getAdaptersSmartLoadAmount() {
        return this.adaptersSmartLoadAmount;
    }

    public final void b(int i) {
        this.delayLoadFailure = i;
    }

    public final void b(long j) {
        this.mCollectBiddingDataTimeout = j;
    }

    public final void b(boolean z) {
        this.mProvidersParallelInit = z;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getAdaptersSmartLoadTimeoutInMills() {
        return this.adaptersSmartLoadTimeoutInMills;
    }

    public final void c(boolean z) {
        this.mWaitUntilAllProvidersFinishInit = z;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final com.json.l5 getAuctionSettings() {
        return this.auctionSettings;
    }

    public final com.json.ym e() {
        for (com.json.ym ymVar : this.mPlacements) {
            if (ymVar.getIsDefault()) {
                return ymVar;
            }
        }
        return this.mDefaultPlacement;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getDelayLoadFailure() {
        return this.delayLoadFailure;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final com.json.e4 getEventsConfigurations() {
        return this.eventsConfigurations;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final long getMCollectBiddingDataTimeout() {
        return this.mCollectBiddingDataTimeout;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getMProvidersParallelInit() {
        return this.mProvidersParallelInit;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final boolean getMSharedManagersThread() {
        return this.mSharedManagersThread;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final boolean getMWaitUntilAllProvidersFinishInit() {
        return this.mWaitUntilAllProvidersFinishInit;
    }

    public java.lang.String toString() {
        return "NativeAdConfigurations{parallelLoad=" + this.adaptersSmartLoadAmount + ", bidderExclusive=" + this.adapterAdvancedLoading + '}';
    }
}
