package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \r2\u00020\u0001:\u0002\u0007\u0019BA\u0012\u0006\u0010&\u001a\u00020\"\u0012\u0006\u0010*\u001a\u00020\u0010\u0012\u0006\u00100\u001a\u00020+\u0012\u0006\u00105\u001a\u000201\u0012\u0006\u0010:\u001a\u000206\u0012\b\b\u0002\u0010?\u001a\u00020;\u0012\u0006\u0010B\u001a\u00020@¢\u0006\u0004\bR\u0010SJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0018\u0010\u0007\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0002J\u0017\u0010\u0007\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0007\u0010\fJ\u0006\u0010\r\u001a\u00020\nJ\u0018\u0010\u0007\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010J\u0006\u0010\u0013\u001a\u00020\u0012J\u0006\u0010\u0014\u001a\u00020\nJ\u0010\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0004H\u0016J\u0012\u0010\u0018\u001a\u00020\n2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0019\u001a\u00020\nH\u0016J\u0010\u0010\u0007\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0002H\u0016J\b\u0010\u001a\u001a\u00020\nH\u0016J\b\u0010\u001b\u001a\u00020\nH\u0016J\u0010\u0010\u001c\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\nH\u0016J\u0010\u0010\u0007\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016J\u0017\u0010\u0007\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\u001fJ\u0019\u0010\u0019\u001a\u00020\n2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0019\u0010 J\u001f\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0019\u0010!R\u0017\u0010&\u001a\u00020\"8\u0006¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010*\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0019\u0010'\u001a\u0004\b(\u0010)R\u0017\u00100\u001a\u00020+8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0017\u00105\u001a\u0002018\u0006¢\u0006\f\n\u0004\b$\u00102\u001a\u0004\b3\u00104R\u001a\u0010:\u001a\u0002068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b.\u00107\u001a\u0004\b8\u00109R\u0017\u0010?\u001a\u00020;8\u0006¢\u0006\f\n\u0004\b8\u0010<\u001a\u0004\b=\u0010>R\u0014\u0010B\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010AR$\u0010G\u001a\u0004\u0018\u00010C8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u0010D\u001a\u0004\b,\u0010E\"\u0004\b\u0007\u0010FR$\u0010M\u001a\u0004\u0018\u00010H8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bI\u0010K\"\u0004\b\u0007\u0010LR\u0016\u0010\u000b\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010NR\u0018\u0010Q\u001a\u0004\u0018\u00010O8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010P¨\u0006T"}, d2 = {"Lcom/ironsource/cl;", "Lcom/ironsource/dd;", "Lcom/unity3d/mediation/LevelPlayAdError;", "displayError", "Lcom/unity3d/mediation/LevelPlayAdInfo;", "currentAdInfo", "Lcom/ironsource/ld;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "oldAdInfo", "newAdInfo", "", "state", "(Lcom/ironsource/ld;)V", androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAM_TYPE_LIVE, "Landroid/app/Activity;", "activity", "", com.json.op.d, "", "k", "m", "adInfo", com.json.ju.j, "error", com.json.ju.b, "b", com.json.ju.g, com.json.ju.f, "onAdInfoChanged", "Lcom/unity3d/mediation/rewarded/LevelPlayReward;", com.json.s.j, "(Lcom/unity3d/mediation/LevelPlayAdInfo;)V", "(Lcom/unity3d/mediation/LevelPlayAdError;)V", "(Lcom/unity3d/mediation/LevelPlayAdError;Lcom/unity3d/mediation/LevelPlayAdInfo;)V", "Lcom/unity3d/mediation/LevelPlay$AdFormat;", "Lcom/unity3d/mediation/LevelPlay$AdFormat;", "d", "()Lcom/unity3d/mediation/LevelPlay$AdFormat;", com.json.mediationsdk.impressionData.ImpressionData.IMPRESSION_DATA_KEY_AD_FORMAT, "Ljava/lang/String;", "g", "()Ljava/lang/String;", "adUnitId", "Lcom/ironsource/l1;", "c", "Lcom/ironsource/l1;", "e", "()Lcom/ironsource/l1;", "adTools", "Lcom/ironsource/bd;", "Lcom/ironsource/bd;", androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_HLS, "()Lcom/ironsource/bd;", "fullscreenAdControllerFactory", "Lcom/ironsource/u1;", "Lcom/ironsource/u1;", "f", "()Lcom/ironsource/u1;", "adUnitDataFactory", "Lcom/ironsource/sf;", "Lcom/ironsource/sf;", "j", "()Lcom/ironsource/sf;", "mediationServicesProvider", "Lcom/ironsource/n9;", "Lcom/ironsource/n9;", "currentTimeProvider", "Lcom/ironsource/ad;", "Lcom/ironsource/ad;", "()Lcom/ironsource/ad;", "(Lcom/ironsource/ad;)V", "adController", "Lcom/ironsource/dl;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT, "Lcom/ironsource/dl;", "()Lcom/ironsource/dl;", "(Lcom/ironsource/dl;)V", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/ironsource/ld;", "Lcom/ironsource/fb;", "Lcom/ironsource/fb;", "loadDuration", "<init>", "(Lcom/unity3d/mediation/LevelPlay$AdFormat;Ljava/lang/String;Lcom/ironsource/l1;Lcom/ironsource/bd;Lcom/ironsource/u1;Lcom/ironsource/sf;Lcom/ironsource/n9;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class cl implements com.json.dd {

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public static final com.json.cl.Companion INSTANCE = new com.json.cl.Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final com.unity3d.mediation.LevelPlay.AdFormat adFormat;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final java.lang.String adUnitId;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final com.json.l1 adTools;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final com.json.bd fullscreenAdControllerFactory;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final com.json.u1 adUnitDataFactory;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final com.json.sf mediationServicesProvider;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final com.json.n9 currentTimeProvider;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private com.json.ad adController;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private com.json.dl listener;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private com.json.ld state;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private com.json.fb loadDuration;

    /* JADX INFO: renamed from: com.ironsource.cl$a, reason: from kotlin metadata */
    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\n"}, d2 = {"Lcom/ironsource/cl$a;", "", "", com.json.op.d, "Lcom/unity3d/mediation/LevelPlay$AdFormat;", com.json.mediationsdk.impressionData.ImpressionData.IMPRESSION_DATA_KEY_AD_FORMAT, "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean a(java.lang.String placementName, com.unity3d.mediation.LevelPlay.AdFormat adFormat) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placementName, "placementName");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adFormat, "adFormat");
            com.json.l1 l1VarA = com.ironsource.l1.a.a(com.unity3d.mediation.a.a(adFormat), com.ironsource.b2.b.MEDIATION);
            if (!l1VarA.g()) {
                l1VarA.getEventSender().getAdInteraction().a(placementName, "SDK is not initialized", false);
                return false;
            }
            com.json.i8 i8VarA = com.json.im.INSTANCE.d().y().a(placementName, adFormat);
            boolean zD = i8VarA.d();
            l1VarA.getEventSender().getAdInteraction().a(placementName, i8VarA.e(), zD);
            return zD;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\u0011\u001a\u00020\f\u0012\u0006\u0010\u0015\u001a\u00020\u0012¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u000b\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\u0003\u0010\nR\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0015\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0013\u001a\u0004\b\r\u0010\u0014¨\u0006\u0018"}, d2 = {"Lcom/ironsource/cl$b;", "", "Lcom/ironsource/l1;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/ironsource/l1;", "b", "()Lcom/ironsource/l1;", "adTools", "Lcom/ironsource/bd;", "Lcom/ironsource/bd;", "()Lcom/ironsource/bd;", "adControllerFactory", "Lcom/ironsource/sf;", "c", "Lcom/ironsource/sf;", "d", "()Lcom/ironsource/sf;", com.json.mediationsdk.utils.IronSourceConstants.EVENTS_PROVIDER, "Lcom/ironsource/n9;", "Lcom/ironsource/n9;", "()Lcom/ironsource/n9;", "currentTimeProvider", "<init>", "(Lcom/ironsource/l1;Lcom/ironsource/bd;Lcom/ironsource/sf;Lcom/ironsource/n9;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final com.json.l1 adTools;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final com.json.bd adControllerFactory;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final com.json.sf provider;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final com.json.n9 currentTimeProvider;

        public b(com.json.l1 adTools, com.json.bd adControllerFactory, com.json.sf provider, com.json.n9 currentTimeProvider) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adTools, "adTools");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adControllerFactory, "adControllerFactory");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(provider, "provider");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
            this.adTools = adTools;
            this.adControllerFactory = adControllerFactory;
            this.provider = provider;
            this.currentTimeProvider = currentTimeProvider;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final com.json.bd getAdControllerFactory() {
            return this.adControllerFactory;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final com.json.l1 getAdTools() {
            return this.adTools;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final com.json.n9 getCurrentTimeProvider() {
            return this.currentTimeProvider;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final com.json.sf getProvider() {
            return this.provider;
        }
    }

    public cl(com.unity3d.mediation.LevelPlay.AdFormat adFormat, java.lang.String adUnitId, com.json.l1 adTools, com.json.bd fullscreenAdControllerFactory, com.json.u1 adUnitDataFactory, com.json.sf mediationServicesProvider, com.json.n9 currentTimeProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adTools, "adTools");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fullscreenAdControllerFactory, "fullscreenAdControllerFactory");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitDataFactory, "adUnitDataFactory");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mediationServicesProvider, "mediationServicesProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
        this.adFormat = adFormat;
        this.adUnitId = adUnitId;
        this.adTools = adTools;
        this.fullscreenAdControllerFactory = fullscreenAdControllerFactory;
        this.adUnitDataFactory = adUnitDataFactory;
        this.mediationServicesProvider = mediationServicesProvider;
        this.currentTimeProvider = currentTimeProvider;
        this.state = new com.json.ed(this, false, 2, null);
    }

    public /* synthetic */ cl(com.unity3d.mediation.LevelPlay.AdFormat adFormat, java.lang.String str, com.json.l1 l1Var, com.json.bd bdVar, com.json.u1 u1Var, com.json.sf sfVar, com.json.n9 n9Var, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(adFormat, str, l1Var, bdVar, u1Var, (i & 32) != 0 ? com.json.im.INSTANCE.d() : sfVar, n9Var);
    }

    private final com.json.ld a(com.unity3d.mediation.LevelPlayAdError displayError, com.unity3d.mediation.LevelPlayAdInfo currentAdInfo) {
        if (com.json.za.f3610a.a(com.json.mu.f3048a.a(displayError))) {
            return new com.json.id(this, currentAdInfo, this.currentTimeProvider);
        }
        return new com.json.ed(this, false, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(com.json.cl this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.adTools.getEventSender().getOperational().a();
        this$0.state.loadAd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(com.json.cl this$0, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.adTools.getEventSender().getOperational().a(j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(com.json.cl this$0, long j, com.unity3d.mediation.LevelPlayAdError levelPlayAdError) {
        java.lang.String errorMessage;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        com.json.ro operational = this$0.adTools.getEventSender().getOperational();
        int errorCode = levelPlayAdError != null ? levelPlayAdError.getErrorCode() : 0;
        if (levelPlayAdError == null || (errorMessage = levelPlayAdError.getErrorMessage()) == null) {
            errorMessage = "";
        }
        operational.a(j, errorCode, errorMessage);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(com.json.cl this$0, android.app.Activity activity, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "$activity");
        this$0.adTools.getEventSender().getTroubleshoot().d();
        this$0.state.a(activity, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(com.json.cl this$0, com.unity3d.mediation.LevelPlayAdError error) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "$error");
        this$0.adTools.getEventSender().getTroubleshoot().a(error);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(com.json.cl this$0, com.unity3d.mediation.LevelPlayAdError error, com.unity3d.mediation.LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "$error");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "$adInfo");
        com.json.dl dlVar = this$0.listener;
        if (dlVar != null) {
            dlVar.onAdDisplayFailed(error, adInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(com.json.cl this$0, com.unity3d.mediation.LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "$adInfo");
        com.json.dl dlVar = this$0.listener;
        if (dlVar != null) {
            dlVar.onAdLoaded(adInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(com.json.cl this$0, com.unity3d.mediation.rewarded.LevelPlayReward reward) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reward, "$reward");
        com.json.dl dlVar = this$0.listener;
        if (dlVar != null) {
            dlVar.onAdRewarded(reward, this$0.state.getAdInfo());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(com.unity3d.mediation.LevelPlayAdError levelPlayAdError, com.json.cl this$0) {
        com.json.dl dlVar;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (levelPlayAdError == null || (dlVar = this$0.listener) == null) {
            return;
        }
        dlVar.onAdLoadFailed(levelPlayAdError);
    }

    private final void a(com.unity3d.mediation.LevelPlayAdInfo oldAdInfo, com.unity3d.mediation.LevelPlayAdInfo newAdInfo) {
        this.adTools.getEventSender().getTroubleshoot().a(oldAdInfo, newAdInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(com.json.cl this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        com.json.dl dlVar = this$0.listener;
        if (dlVar != null) {
            dlVar.onAdClicked(this$0.state.getAdInfo());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(com.json.cl this$0, com.unity3d.mediation.LevelPlayAdError error, com.unity3d.mediation.LevelPlayAdInfo currentAdInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "$error");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currentAdInfo, "$currentAdInfo");
        this$0.a(this$0.a(error, currentAdInfo));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(com.json.cl this$0, com.unity3d.mediation.LevelPlayAdInfo currentAdInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currentAdInfo, "$currentAdInfo");
        com.json.dl dlVar = this$0.listener;
        if (dlVar != null) {
            dlVar.onAdClosed(currentAdInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(com.json.cl this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.a(new com.json.ed(this$0, false, 2, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(com.json.cl this$0, com.unity3d.mediation.LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "$adInfo");
        this$0.a(this$0.state.getAdInfo(), adInfo);
        this$0.state.onAdInfoChanged(adInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(com.json.cl this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.adTools.getEventSender().getTroubleshoot().e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(com.json.cl this$0, com.unity3d.mediation.LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "$adInfo");
        com.json.dl dlVar = this$0.listener;
        if (dlVar != null) {
            dlVar.onAdInfoChanged(adInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(com.json.cl this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        com.json.dl dlVar = this$0.listener;
        if (dlVar != null) {
            dlVar.onAdDisplayed(this$0.state.getAdInfo());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(com.json.cl this$0, com.unity3d.mediation.LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "$adInfo");
        this$0.a(new com.json.id(this$0, adInfo, this$0.currentTimeProvider));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(com.json.cl this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.state.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(com.json.cl this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.a(new com.json.ed(this$0, false, 2, null));
    }

    @Override // com.json.dd
    public void a() {
        this.adTools.d(new java.lang.Runnable() { // from class: com.ironsource.cl$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                com.json.cl.f(this.f$0);
            }
        });
    }

    public final void a(final android.app.Activity activity, final java.lang.String placementName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        this.adTools.d(new java.lang.Runnable() { // from class: com.ironsource.cl$$ExternalSyntheticLambda10
            @Override // java.lang.Runnable
            public final void run() {
                com.json.cl.a(this.f$0, activity, placementName);
            }
        });
    }

    public final void a(com.json.ad adVar) {
        this.adController = adVar;
    }

    public final void a(com.json.dl dlVar) {
        this.listener = dlVar;
    }

    public final void a(com.json.ld state) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "state");
        this.state = state;
    }

    @Override // com.json.dd
    public void a(final com.unity3d.mediation.LevelPlayAdError error) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "error");
        final com.unity3d.mediation.LevelPlayAdInfo adInfo = this.state.getAdInfo();
        this.adTools.d(new java.lang.Runnable() { // from class: com.ironsource.cl$$ExternalSyntheticLambda17
            @Override // java.lang.Runnable
            public final void run() {
                com.json.cl.b(this.f$0, error, adInfo);
            }
        });
        b(error, adInfo);
    }

    public final void a(final com.unity3d.mediation.LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        com.json.mediationsdk.logger.IronLog.CALLBACK.verbose(com.json.l1.a(this.adTools, "onAdLoaded adInfo: " + adInfo, (java.lang.String) null, 2, (java.lang.Object) null));
        final long jA = com.json.fb.a(this.loadDuration);
        this.adTools.d(new java.lang.Runnable() { // from class: com.ironsource.cl$$ExternalSyntheticLambda12
            @Override // java.lang.Runnable
            public final void run() {
                com.json.cl.a(this.f$0, jA);
            }
        });
        this.adTools.e(new java.lang.Runnable() { // from class: com.ironsource.cl$$ExternalSyntheticLambda13
            @Override // java.lang.Runnable
            public final void run() {
                com.json.cl.a(this.f$0, adInfo);
            }
        });
    }

    @Override // com.json.dd
    public void a(final com.unity3d.mediation.rewarded.LevelPlayReward reward) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reward, "reward");
        com.json.mediationsdk.logger.IronLog.CALLBACK.verbose(com.json.l1.a(this.adTools, "onAdRewarded adInfo: " + this.state.getAdInfo() + " reward: " + reward, (java.lang.String) null, 2, (java.lang.Object) null));
        this.adTools.e(new java.lang.Runnable() { // from class: com.ironsource.cl$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                com.json.cl.a(this.f$0, reward);
            }
        });
    }

    @Override // com.json.dd
    public void b() {
        com.json.mediationsdk.logger.IronLog.CALLBACK.verbose(com.json.l1.a(this.adTools, "onAdDisplayed adInfo: " + this.state.getAdInfo(), (java.lang.String) null, 2, (java.lang.Object) null));
        this.adTools.d(new java.lang.Runnable() { // from class: com.ironsource.cl$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.json.cl.d(this.f$0);
            }
        });
        this.adTools.e(new java.lang.Runnable() { // from class: com.ironsource.cl$$ExternalSyntheticLambda11
            @Override // java.lang.Runnable
            public final void run() {
                com.json.cl.e(this.f$0);
            }
        });
    }

    public final void b(final com.unity3d.mediation.LevelPlayAdError error) {
        com.json.mediationsdk.logger.IronLog.CALLBACK.verbose(com.json.l1.a(this.adTools, "onAdLoadFailed error: " + error, (java.lang.String) null, 2, (java.lang.Object) null));
        final long jA = com.json.fb.a(this.loadDuration);
        this.adTools.d(new java.lang.Runnable() { // from class: com.ironsource.cl$$ExternalSyntheticLambda8
            @Override // java.lang.Runnable
            public final void run() {
                com.json.cl.a(this.f$0, jA, error);
            }
        });
        this.adTools.e(new java.lang.Runnable() { // from class: com.ironsource.cl$$ExternalSyntheticLambda9
            @Override // java.lang.Runnable
            public final void run() {
                com.json.cl.a(error, this);
            }
        });
    }

    public final void b(final com.unity3d.mediation.LevelPlayAdError error, final com.unity3d.mediation.LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "error");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        com.json.mediationsdk.logger.IronLog.CALLBACK.verbose(com.json.l1.a(this.adTools, "onAdDisplayFailed error: " + error + ", adInfo: " + adInfo, (java.lang.String) null, 2, (java.lang.Object) null));
        this.adTools.d(new java.lang.Runnable() { // from class: com.ironsource.cl$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                com.json.cl.a(this.f$0, error);
            }
        });
        this.adTools.e(new java.lang.Runnable() { // from class: com.ironsource.cl$$ExternalSyntheticLambda7
            @Override // java.lang.Runnable
            public final void run() {
                com.json.cl.a(this.f$0, error, adInfo);
            }
        });
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final com.json.ad getAdController() {
        return this.adController;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final com.unity3d.mediation.LevelPlay.AdFormat getAdFormat() {
        return this.adFormat;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final com.json.l1 getAdTools() {
        return this.adTools;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final com.json.u1 getAdUnitDataFactory() {
        return this.adUnitDataFactory;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final java.lang.String getAdUnitId() {
        return this.adUnitId;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final com.json.bd getFullscreenAdControllerFactory() {
        return this.fullscreenAdControllerFactory;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final com.json.dl getListener() {
        return this.listener;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final com.json.sf getMediationServicesProvider() {
        return this.mediationServicesProvider;
    }

    public final boolean k() {
        com.json.g1 g1VarC = this.state.c();
        this.adTools.getEventSender().getLoad().a(java.lang.Boolean.valueOf(g1VarC.getIsReady()), g1VarC instanceof com.ironsource.g1.a ? ((com.ironsource.g1.a) g1VarC).c() : null);
        return g1VarC.getIsReady();
    }

    public final void l() {
        this.loadDuration = new com.json.fb();
        this.adTools.d(new java.lang.Runnable() { // from class: com.ironsource.cl$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                com.json.cl.a(this.f$0);
            }
        });
    }

    public final void m() {
        a(new com.json.jd(this));
        com.json.ad adVar = this.adController;
        if (adVar != null) {
            adVar.i();
        }
    }

    @Override // com.json.dd
    public void onAdClicked() {
        com.json.mediationsdk.logger.IronLog.CALLBACK.verbose(com.json.l1.a(this.adTools, "onAdClicked adInfo: " + this.state.getAdInfo(), (java.lang.String) null, 2, (java.lang.Object) null));
        this.adTools.e(new java.lang.Runnable() { // from class: com.ironsource.cl$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                com.json.cl.b(this.f$0);
            }
        });
    }

    @Override // com.json.dd
    public void onAdClosed() {
        final com.unity3d.mediation.LevelPlayAdInfo adInfo = this.state.getAdInfo();
        com.json.mediationsdk.logger.IronLog.CALLBACK.verbose(com.json.l1.a(this.adTools, "onAdClosed adInfo: " + adInfo, (java.lang.String) null, 2, (java.lang.Object) null));
        this.adTools.d(new java.lang.Runnable() { // from class: com.ironsource.cl$$ExternalSyntheticLambda14
            @Override // java.lang.Runnable
            public final void run() {
                com.json.cl.c(this.f$0);
            }
        });
        this.adTools.e(new java.lang.Runnable() { // from class: com.ironsource.cl$$ExternalSyntheticLambda15
            @Override // java.lang.Runnable
            public final void run() {
                com.json.cl.b(this.f$0, adInfo);
            }
        });
    }

    @Override // com.json.dd
    public void onAdInfoChanged(final com.unity3d.mediation.LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        com.json.mediationsdk.logger.IronLog.CALLBACK.verbose(com.json.l1.a(this.adTools, "onAdInfoChanged adInfo: " + adInfo, (java.lang.String) null, 2, (java.lang.Object) null));
        this.adTools.d(new java.lang.Runnable() { // from class: com.ironsource.cl$$ExternalSyntheticLambda18
            @Override // java.lang.Runnable
            public final void run() {
                com.json.cl.c(this.f$0, adInfo);
            }
        });
        this.adTools.e(new java.lang.Runnable() { // from class: com.ironsource.cl$$ExternalSyntheticLambda19
            @Override // java.lang.Runnable
            public final void run() {
                com.json.cl.d(this.f$0, adInfo);
            }
        });
    }

    @Override // com.json.dd
    public void onAdLoadFailed(com.unity3d.mediation.LevelPlayAdError error) {
        this.adTools.d(new java.lang.Runnable() { // from class: com.ironsource.cl$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                com.json.cl.g(this.f$0);
            }
        });
        b(error);
    }

    @Override // com.json.dd
    public void onAdLoaded(final com.unity3d.mediation.LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.adTools.d(new java.lang.Runnable() { // from class: com.ironsource.cl$$ExternalSyntheticLambda16
            @Override // java.lang.Runnable
            public final void run() {
                com.json.cl.e(this.f$0, adInfo);
            }
        });
        a(adInfo);
    }
}
