package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002Ba\u0012\u0006\u0010\u0013\u001a\u00020\u0011\u0012\u0006\u0010\u0017\u001a\u00020\u0014\u0012\u0006\u0010\u001b\u001a\u00020\u0018\u0012\u0006\u0010\u001f\u001a\u00020\u001c\u0012\u0006\u0010#\u001a\u00020 \u0012\u0006\u0010'\u001a\u00020$\u0012\f\u0010,\u001a\b\u0012\u0004\u0012\u00020)0(\u0012\u0006\u00100\u001a\u00020-\u0012\b\b\u0002\u00104\u001a\u000201\u0012\b\b\u0002\u00108\u001a\u000205¢\u0006\u0004\bI\u0010JJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0017\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010'\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020)0(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u00100\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00104\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00108\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u0010<\u001a\u0002098\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b:\u0010;R\u0018\u0010@\u001a\u0004\u0018\u00010=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0018\u0010D\u001a\u0004\u0018\u00010A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0016\u0010H\u001a\u00020E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010G¨\u0006K"}, d2 = {"Lcom/ironsource/z6;", "Lcom/ironsource/xl;", "Lcom/ironsource/x5;", "", androidx.media3.extractor.text.ttml.TtmlNode.START, "Lcom/ironsource/mj;", com.ironsource.y8.h.p0, "Lcom/ironsource/qg;", "adContainer", "onBannerLoadSuccess", "", "description", "onBannerLoadFail", "Lcom/ironsource/mediationsdk/logger/IronSourceError;", "error", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lcom/ironsource/mediationsdk/logger/IronSourceError;)V", "Lcom/unity3d/ironsourceads/banner/BannerAdRequest;", "Lcom/unity3d/ironsourceads/banner/BannerAdRequest;", "adRequest", "Lcom/unity3d/ironsourceads/AdSize;", "b", "Lcom/unity3d/ironsourceads/AdSize;", "size", "Lcom/ironsource/i5;", "c", "Lcom/ironsource/i5;", "auctionResponseFetcher", "Lcom/ironsource/yl;", "d", "Lcom/ironsource/yl;", "loadTaskConfig", "Lcom/ironsource/rn;", "e", "Lcom/ironsource/rn;", "networkLoadApi", "Lcom/ironsource/n3;", "f", "Lcom/ironsource/n3;", "analytics", "Lcom/ironsource/q0;", "Lcom/unity3d/ironsourceads/banner/BannerAdView;", "g", "Lcom/ironsource/q0;", "adLoadTaskListener", "Lcom/ironsource/a6;", androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_HLS, "Lcom/ironsource/a6;", "adLayoutFactory", "Lcom/ironsource/tu$c;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT, "Lcom/ironsource/tu$c;", "timerFactory", "Ljava/util/concurrent/Executor;", "j", "Ljava/util/concurrent/Executor;", "taskFinishedExecutor", "Lcom/ironsource/fb;", "k", "Lcom/ironsource/fb;", "taskStartedTime", "Lcom/ironsource/tu;", androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAM_TYPE_LIVE, "Lcom/ironsource/tu;", "loadTimeoutTimer", "Lcom/ironsource/t4;", "m", "Lcom/ironsource/t4;", "auctionDataReporter", "", com.json.zb.q, "Z", "isTaskFinished", "<init>", "(Lcom/unity3d/ironsourceads/banner/BannerAdRequest;Lcom/unity3d/ironsourceads/AdSize;Lcom/ironsource/i5;Lcom/ironsource/yl;Lcom/ironsource/rn;Lcom/ironsource/n3;Lcom/ironsource/q0;Lcom/ironsource/a6;Lcom/ironsource/tu$c;Ljava/util/concurrent/Executor;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class z6 implements com.json.xl, com.json.x5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final com.unity3d.ironsourceads.banner.BannerAdRequest adRequest;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final com.unity3d.ironsourceads.AdSize size;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final com.json.i5 auctionResponseFetcher;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final com.json.yl loadTaskConfig;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final com.json.rn networkLoadApi;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final com.json.n3 analytics;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final com.json.q0<com.unity3d.ironsourceads.banner.BannerAdView> adLoadTaskListener;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final com.json.a6 adLayoutFactory;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final com.ironsource.tu.c timerFactory;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final java.util.concurrent.Executor taskFinishedExecutor;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private com.json.fb taskStartedTime;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private com.json.tu loadTimeoutTimer;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private com.json.t4 auctionDataReporter;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private boolean isTaskFinished;

    @kotlin.Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"com/ironsource/z6$a", "Lcom/ironsource/tu$a;", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class a implements com.ironsource.tu.a {
        a() {
        }

        @Override // com.ironsource.tu.a
        public void a() {
            com.json.z6.this.a(com.json.tb.f3430a.s());
        }
    }

    public z6(com.unity3d.ironsourceads.banner.BannerAdRequest adRequest, com.unity3d.ironsourceads.AdSize size, com.json.i5 auctionResponseFetcher, com.json.yl loadTaskConfig, com.json.rn networkLoadApi, com.json.n3 analytics, com.json.q0<com.unity3d.ironsourceads.banner.BannerAdView> adLoadTaskListener, com.json.a6 adLayoutFactory, com.ironsource.tu.c timerFactory, java.util.concurrent.Executor taskFinishedExecutor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adRequest, "adRequest");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(size, "size");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(auctionResponseFetcher, "auctionResponseFetcher");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loadTaskConfig, "loadTaskConfig");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkLoadApi, "networkLoadApi");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analytics, "analytics");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adLoadTaskListener, "adLoadTaskListener");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adLayoutFactory, "adLayoutFactory");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timerFactory, "timerFactory");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taskFinishedExecutor, "taskFinishedExecutor");
        this.adRequest = adRequest;
        this.size = size;
        this.auctionResponseFetcher = auctionResponseFetcher;
        this.loadTaskConfig = loadTaskConfig;
        this.networkLoadApi = networkLoadApi;
        this.analytics = analytics;
        this.adLoadTaskListener = adLoadTaskListener;
        this.adLayoutFactory = adLayoutFactory;
        this.timerFactory = timerFactory;
        this.taskFinishedExecutor = taskFinishedExecutor;
    }

    public /* synthetic */ z6(com.unity3d.ironsourceads.banner.BannerAdRequest bannerAdRequest, com.unity3d.ironsourceads.AdSize adSize, com.json.i5 i5Var, com.json.yl ylVar, com.json.rn rnVar, com.json.n3 n3Var, com.json.q0 q0Var, com.json.a6 a6Var, com.ironsource.tu.c cVar, java.util.concurrent.Executor executor, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(bannerAdRequest, adSize, i5Var, ylVar, rnVar, n3Var, q0Var, a6Var, (i & 256) != 0 ? new com.ironsource.tu.d() : cVar, (i & 512) != 0 ? com.json.cg.f2559a.c() : executor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(com.json.z6 this$0, com.json.mediationsdk.logger.IronSourceError error) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "$error");
        if (this$0.isTaskFinished) {
            return;
        }
        this$0.isTaskFinished = true;
        com.json.tu tuVar = this$0.loadTimeoutTimer;
        if (tuVar != null) {
            tuVar.cancel();
        }
        com.ironsource.g3.c.Companion companion = com.ironsource.g3.c.INSTANCE;
        com.ironsource.j3.j jVar = new com.ironsource.j3.j(error.getErrorCode());
        com.ironsource.j3.k kVar = new com.ironsource.j3.k(error.getErrorMessage());
        com.json.fb fbVar = this$0.taskStartedTime;
        if (fbVar == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("taskStartedTime");
            fbVar = null;
        }
        companion.a(jVar, kVar, new com.ironsource.j3.f(com.json.fb.a(fbVar))).a(this$0.analytics);
        com.json.t4 t4Var = this$0.auctionDataReporter;
        if (t4Var != null) {
            t4Var.a("onBannerLoadFail");
        }
        this$0.adLoadTaskListener.onAdLoadFailed(error);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(com.json.z6 this$0, com.json.mj adInstance, com.json.qg adContainer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInstance, "$adInstance");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adContainer, "$adContainer");
        if (this$0.isTaskFinished) {
            return;
        }
        this$0.isTaskFinished = true;
        com.json.tu tuVar = this$0.loadTimeoutTimer;
        if (tuVar != null) {
            tuVar.cancel();
        }
        com.json.fb fbVar = this$0.taskStartedTime;
        if (fbVar == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("taskStartedTime");
            fbVar = null;
        }
        com.ironsource.g3.c.INSTANCE.a(new com.ironsource.j3.f(com.json.fb.a(fbVar))).a(this$0.analytics);
        com.json.t4 t4Var = this$0.auctionDataReporter;
        if (t4Var != null) {
            t4Var.b("onBannerLoadSuccess");
        }
        com.json.a6 a6Var = this$0.adLayoutFactory;
        com.json.t4 t4Var2 = this$0.auctionDataReporter;
        kotlin.jvm.internal.Intrinsics.checkNotNull(t4Var2);
        this$0.adLoadTaskListener.a(a6Var.a(adInstance, adContainer, t4Var2));
    }

    public final void a(final com.json.mediationsdk.logger.IronSourceError error) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "error");
        this.taskFinishedExecutor.execute(new java.lang.Runnable() { // from class: com.ironsource.z6$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                com.json.z6.a(this.f$0, error);
            }
        });
    }

    @Override // com.json.x5
    public void onBannerLoadFail(java.lang.String description) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(description, "description");
        a(com.json.tb.f3430a.c(description));
    }

    @Override // com.json.x5
    public void onBannerLoadSuccess(final com.json.mj adInstance, final com.json.qg adContainer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInstance, "adInstance");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adContainer, "adContainer");
        this.taskFinishedExecutor.execute(new java.lang.Runnable() { // from class: com.ironsource.z6$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.json.z6.a(this.f$0, adInstance, adContainer);
            }
        });
    }

    @Override // com.json.xl
    public void start() {
        this.taskStartedTime = new com.json.fb();
        this.analytics.a(new com.ironsource.j3.s(this.loadTaskConfig.f()), new com.ironsource.j3.n(this.loadTaskConfig.g().getValue()), new com.ironsource.j3.c(this.size), new com.ironsource.j3.b(this.adRequest.getCom.ironsource.sdk.controller.f.b.c java.lang.String()));
        com.ironsource.g3.c.INSTANCE.a().a(this.analytics);
        long jH = this.loadTaskConfig.h();
        com.ironsource.tu.c cVar = this.timerFactory;
        com.ironsource.tu.b bVar = new com.ironsource.tu.b();
        bVar.b(jH);
        kotlin.Unit unit = kotlin.Unit.INSTANCE;
        com.json.tu tuVarA = cVar.a(bVar);
        this.loadTimeoutTimer = tuVarA;
        if (tuVarA != null) {
            tuVarA.a(new com.ironsource.z6.a());
        }
        java.lang.Object objA = this.auctionResponseFetcher.a();
        java.lang.Throwable thM1304exceptionOrNullimpl = kotlin.Result.m1304exceptionOrNullimpl(objA);
        if (thM1304exceptionOrNullimpl != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(thM1304exceptionOrNullimpl, "null cannot be cast to non-null type com.unity3d.ironsourceads.internal.error.ISException");
            a(((com.json.lg) thM1304exceptionOrNullimpl).getError());
            objA = null;
        }
        com.json.f5 f5Var = (com.json.f5) objA;
        if (f5Var == null) {
            return;
        }
        com.json.n3 n3Var = this.analytics;
        java.lang.String auctionId = f5Var.getAuctionId();
        if (auctionId != null) {
            n3Var.a(new com.ironsource.j3.d(auctionId));
        }
        org.json.JSONObject genericParams = f5Var.getGenericParams();
        if (genericParams != null) {
            n3Var.a(new com.ironsource.j3.m(genericParams));
        }
        java.lang.String strA = f5Var.a();
        if (strA != null) {
            n3Var.a(new com.ironsource.j3.g(strA));
        }
        com.json.ri riVarG = this.loadTaskConfig.g();
        android.content.Context applicationContext = com.json.environment.ContextProvider.getInstance().getApplicationContext();
        com.json.og ogVar = new com.json.og(com.json.mediationsdk.AdapterUtils.dpToPixels(applicationContext, this.size.getWidth()), com.json.mediationsdk.AdapterUtils.dpToPixels(applicationContext, this.size.getHeight()), this.size.getSizeDescription());
        com.json.go goVar = new com.json.go();
        goVar.a(this);
        com.json.mj adInstance = new com.json.nj(this.adRequest.getProviderName().value(), goVar).a(riVarG.b(com.json.ri.Bidder)).a(ogVar).b(this.loadTaskConfig.i()).a(this.adRequest.getCom.ironsource.sdk.controller.f.b.c java.lang.String()).a(new com.json.kn().a()).a();
        com.json.tn tnVar = new com.json.tn(f5Var, this.loadTaskConfig.j());
        this.auctionDataReporter = new com.json.t4(new com.json.qi(this.adRequest.getInstanceId(), riVarG.getValue(), f5Var.a()), new com.json.mediationsdk.d(), f5Var.getAuctionReportUrls());
        com.ironsource.g3.d.INSTANCE.c().a(this.analytics);
        com.json.rn rnVar = this.networkLoadApi;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(adInstance, "adInstance");
        rnVar.a(adInstance, tnVar);
    }
}
