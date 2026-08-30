package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b@\u0010AJ \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0010\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\b\u0010\u000f\u001a\u00020\u0012H\u0002J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0018\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0002J \u0010\u000f\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0006H\u0002J \u0010\t\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0006H\u0002J\b\u0010\u0018\u001a\u00020\bH\u0002J\u001e\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u0013J\u0006\u0010\u001b\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u001cJ\u000e\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nR\u0016\u0010\u001f\u001a\u00020\u001d8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000f\u0010\u001eR\u001b\u0010$\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010#R\u001c\u0010(\u001a\n &*\u0004\u0018\u00010%0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010'R\u0014\u0010+\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010*R\u0014\u0010/\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u001a\u00103\u001a\b\u0012\u0004\u0012\u00020\u0013008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0018\u00108\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u0010;\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010?\u001a\u00020<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>¨\u0006B"}, d2 = {"Lcom/ironsource/tr;", "", "Landroid/content/Context;", "context", "Lcom/ironsource/vj;", "globalDataWriter", "Lcom/ironsource/hs;", "serverResponse", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/ironsource/ir;", "error", "applicationContext", "Lcom/ironsource/gr;", "sdkConfig", "b", "", "inProgress", "Lcom/ironsource/vr;", "Lcom/ironsource/mr;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/ironsource/e4;", "config", com.json.hs.n, "d", "Lcom/ironsource/nr;", "initRequest", "e", "Lcom/ironsource/or;", "Lcom/ironsource/ks;", "Lcom/ironsource/ks;", "sessionCalcManager", "Lcom/ironsource/xe;", "c", "Lkotlin/Lazy;", "()Lcom/ironsource/xe;", "applicationLifecycleService", "", "kotlin.jvm.PlatformType", "Ljava/lang/String;", "TAG", "Lcom/ironsource/xr;", "Lcom/ironsource/xr;", "tools", "Lcom/ironsource/fs;", "f", "Lcom/ironsource/fs;", "serverInit", "", "g", "Ljava/util/List;", "sdkInitListeners", androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_HLS, "Lcom/ironsource/gr;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT, "Lcom/ironsource/ir;", "errorReason", "j", "Z", "initInProgress", "", "k", "J", "initStartTime", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class tr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final com.json.tr f3447a;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static com.json.ks sessionCalcManager;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static final kotlin.Lazy applicationLifecycleService;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private static final java.lang.String TAG;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private static final com.json.xr tools;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private static final com.json.fs serverInit;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private static final java.util.List<com.json.mr> sdkInitListeners;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private static com.json.gr sdkConfig;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private static com.json.ir errorReason;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private static boolean initInProgress;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private static long initStartTime;

    @kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/ironsource/xe;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Lcom/ironsource/xe;"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<com.json.xe> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final com.ironsource.tr.a f3448a = new com.ironsource.tr.a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.json.xe invoke() {
            return com.json.im.INSTANCE.d().v();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\b"}, d2 = {"com/ironsource/tr$b", "Lcom/ironsource/mr;", "Lcom/ironsource/gr;", "sdkConfig", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/ironsource/ir;", "error", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class b implements com.json.mr {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.content.Context f3449a;

        b(android.content.Context context) {
            this.f3449a = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(android.content.Context applicationContext, com.json.gr sdkConfig) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkConfig, "$sdkConfig");
            com.json.tr trVar = com.json.tr.f3447a;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
            trVar.a(applicationContext, sdkConfig);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(com.json.ir error) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "$error");
            com.json.tr.f3447a.a(error);
        }

        @Override // com.json.mr
        public void a(final com.json.gr sdkConfig) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkConfig, "sdkConfig");
            com.json.xr xrVar = com.json.tr.tools;
            final android.content.Context context = this.f3449a;
            xrVar.a(new java.lang.Runnable() { // from class: com.ironsource.tr$b$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    com.ironsource.tr.b.a(context, sdkConfig);
                }
            });
        }

        @Override // com.json.mr
        public void a(final com.json.ir error) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "error");
            com.json.tr.tools.a(new java.lang.Runnable() { // from class: com.ironsource.tr$b$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    com.ironsource.tr.b.b(error);
                }
            });
        }
    }

    static {
        com.json.tr trVar = new com.json.tr();
        f3447a = trVar;
        applicationLifecycleService = kotlin.LazyKt.lazy(com.ironsource.tr.a.f3448a);
        TAG = trVar.getClass().getSimpleName();
        tools = new com.json.xr();
        serverInit = new com.json.fs();
        sdkInitListeners = new java.util.ArrayList();
    }

    private tr() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(android.content.Context applicationContext, com.json.gr sdkConfig2) {
        b(sdkConfig2);
        com.json.h4 h4VarA = sdkConfig2.a();
        com.json.ua uaVar = com.json.ua.f3466a;
        uaVar.c(h4VarA.getShouldUseAppSet());
        com.json.im.INSTANCE.a().x().a(h4VarA.getEpConfig());
        uaVar.a(h4VarA.getShouldReuseAdvId());
        uaVar.a(h4VarA.getUserAgentExpirationThresholdInHours());
        com.json.environment.thread.IronSourceThreadManager.INSTANCE.setUseSharedExecutorService(h4VarA.getShouldUseSharedThreadPool());
        c().a(h4VarA);
        com.json.xr xrVar = tools;
        a(applicationContext, xrVar.getGlobalDataWriter(), sdkConfig2.d());
        xrVar.a(new java.util.Date().getTime() - initStartTime, sdkConfig2.f());
        com.json.ks ksVar = new com.json.ks();
        sessionCalcManager = ksVar;
        ksVar.a(c());
        com.json.mediationsdk.utils.IronSourceUtils.saveLastResponse(applicationContext, sdkConfig2.d().toString());
        com.json.jj.i().c(true);
        com.json.wq.i().c(true);
        com.json.ep.P.c(true);
        b(applicationContext, sdkConfig2);
        com.json.mediationsdk.logger.IronSourceLoggerManager.getLogger(0).setDebugLevel(sdkConfig2.e().getCom.ironsource.dm.b java.lang.String());
        com.json.a4 a4VarB = sdkConfig2.b();
        if (a4VarB.getIsCrashReporterEnabled()) {
            xrVar.a(a4VarB);
        }
        a(sdkConfig2);
        new com.ironsource.ep.a().a();
        d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(android.content.Context context, com.json.mr listener, com.json.nr initRequest, android.content.Context context2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "$context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "$listener");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initRequest, "$initRequest");
        com.json.j.f2777a.a(context);
        com.json.gr grVar = sdkConfig;
        if (grVar != null) {
            f3447a.a(listener, grVar);
            return;
        }
        sdkInitListeners.add(listener);
        if (initInProgress) {
            return;
        }
        errorReason = null;
        f3447a.a(true);
        initStartTime = new java.util.Date().getTime();
        serverInit.a(context, initRequest, tools, new com.ironsource.tr.b(context2));
    }

    private final void a(android.content.Context context, com.json.vj globalDataWriter, com.json.hs serverResponse) {
        globalDataWriter.i(serverResponse.f().h());
        globalDataWriter.b(serverResponse.f().d());
        com.json.x3 applicationConfigurations = serverResponse.c().getApplicationConfigurations();
        kotlin.jvm.internal.Intrinsics.checkNotNull(applicationConfigurations);
        globalDataWriter.a(applicationConfigurations.a());
        globalDataWriter.c(applicationConfigurations.b().b());
        globalDataWriter.b(applicationConfigurations.j().b());
        globalDataWriter.a(java.lang.Boolean.valueOf(com.json.mediationsdk.utils.IronSourceUtils.getFirstSession(context)));
        com.json.x3 applicationConfigurations2 = serverResponse.c().getApplicationConfigurations();
        kotlin.jvm.internal.Intrinsics.checkNotNull(applicationConfigurations2);
        globalDataWriter.b(applicationConfigurations2.e().getCmpId());
    }

    private final void a(com.json.e4 config, android.content.Context context, com.json.hs response) {
        com.json.jj.i().a(config.c(), context);
        com.json.jj.i().b(config.d(), context);
        com.json.jj.i().b(config.f());
        com.json.jj.i().a(config.e());
        com.json.jj.i().c(config.a());
        com.json.jj.i().c(config.i(), context);
        com.json.jj.i().a(config.h(), context);
        com.json.jj.i().b(config.j(), context);
        com.json.jj.i().d(config.g(), context);
        com.json.jj jjVarI = com.json.jj.i();
        com.json.x3 applicationConfigurations = response.c().getApplicationConfigurations();
        kotlin.jvm.internal.Intrinsics.checkNotNull(applicationConfigurations);
        jjVarI.a(applicationConfigurations.i());
        com.json.jj.i().a(config.k());
        com.json.jj.i().d(config.b());
    }

    private final void a(com.json.gr sdkConfig2) {
        java.util.Iterator<com.json.mr> it = sdkInitListeners.iterator();
        while (it.hasNext()) {
            a(it.next(), sdkConfig2);
        }
        sdkInitListeners.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(com.json.ir error) {
        errorReason = error;
        a(false);
        java.util.Iterator<com.json.mr> it = sdkInitListeners.iterator();
        while (it.hasNext()) {
            a(it.next(), error);
        }
        sdkInitListeners.clear();
        com.json.mediationsdk.logger.IronSourceLoggerManager.getLogger().log(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API, "Mediation availability false reason: " + error, 1);
    }

    private final void a(final com.json.mr listener, final com.json.gr sdkConfig2) {
        tools.e(new java.lang.Runnable() { // from class: com.ironsource.tr$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                com.json.tr.b(listener, sdkConfig2);
            }
        });
    }

    private final void a(final com.json.mr listener, final com.json.ir error) {
        tools.e(new java.lang.Runnable() { // from class: com.ironsource.tr$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                com.json.tr.b(listener, error);
            }
        });
    }

    private final void a(boolean inProgress) {
        initInProgress = inProgress;
        tools.a(b());
    }

    private final com.json.vr b() {
        if (sdkConfig != null) {
            return com.json.vr.INITIATED;
        }
        if (errorReason != null) {
            return com.json.vr.INIT_FAILED;
        }
        return initInProgress ? com.json.vr.INIT_IN_PROGRESS : com.json.vr.NOT_INIT;
    }

    /* JADX WARN: Code duplicated, block: B:65:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:68:0x010e  */
    /* JADX WARN: Code duplicated, block: B:70:? A[RETURN, SYNTHETIC] */
    private final void b(android.content.Context context, com.json.gr sdkConfig2) {
        com.json.e4 eventsConfigurations;
        java.lang.String str;
        boolean pixelEventsEnabled;
        java.lang.String pixelEventsUrl;
        boolean pixelEventsCompression;
        int pixelEventsCompressionLevel;
        int[] pixelOptOut;
        int[] pixelOptIn;
        com.json.ep epVar;
        com.json.nm nativeAdConfigurations;
        com.json.e4 eventsConfigurations2;
        com.json.r6 bannerConfigurations;
        com.json.e4 e4VarG;
        com.json.hj interstitialConfigurations;
        com.json.e4 e4VarI;
        com.json.uq rewardedVideoConfigurations;
        com.json.e4 e4VarM;
        com.json.hs hsVarD = sdkConfig2.d();
        com.json.p8 p8VarC = hsVarD.c();
        boolean zL = (p8VarC == null || (rewardedVideoConfigurations = p8VarC.getRewardedVideoConfigurations()) == null || (e4VarM = rewardedVideoConfigurations.m()) == null) ? false : e4VarM.l();
        com.json.p8 p8VarC2 = hsVarD.c();
        boolean zL2 = (p8VarC2 == null || (interstitialConfigurations = p8VarC2.getInterstitialConfigurations()) == null || (e4VarI = interstitialConfigurations.i()) == null) ? false : e4VarI.l();
        com.json.p8 p8VarC3 = hsVarD.c();
        boolean zL3 = (p8VarC3 == null || (bannerConfigurations = p8VarC3.getBannerConfigurations()) == null || (e4VarG = bannerConfigurations.g()) == null) ? false : e4VarG.l();
        com.json.p8 p8VarC4 = hsVarD.c();
        boolean zL4 = (p8VarC4 == null || (nativeAdConfigurations = p8VarC4.getNativeAdConfigurations()) == null || (eventsConfigurations2 = nativeAdConfigurations.getEventsConfigurations()) == null) ? false : eventsConfigurations2.l();
        if (zL) {
            com.json.p8 p8VarC5 = hsVarD.c();
            com.json.uq rewardedVideoConfigurations2 = p8VarC5 != null ? p8VarC5.getRewardedVideoConfigurations() : null;
            kotlin.jvm.internal.Intrinsics.checkNotNull(rewardedVideoConfigurations2);
            com.json.e4 rewardedVideoConfig = rewardedVideoConfigurations2.m();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(rewardedVideoConfig, "rewardedVideoConfig");
            b(rewardedVideoConfig, context, hsVarD);
        } else {
            com.json.wq.i().b(false);
        }
        if (!zL2) {
            if (zL3) {
                com.json.p8 p8VarC6 = hsVarD.c();
                com.json.r6 bannerConfigurations2 = p8VarC6 != null ? p8VarC6.getBannerConfigurations() : null;
                kotlin.jvm.internal.Intrinsics.checkNotNull(bannerConfigurations2);
                eventsConfigurations = bannerConfigurations2.g();
                str = "bannerConfig";
            } else if (zL4) {
                com.json.p8 p8VarC7 = hsVarD.c();
                com.json.nm nativeAdConfigurations2 = p8VarC7 != null ? p8VarC7.getNativeAdConfigurations() : null;
                kotlin.jvm.internal.Intrinsics.checkNotNull(nativeAdConfigurations2);
                eventsConfigurations = nativeAdConfigurations2.getEventsConfigurations();
                a(eventsConfigurations, context, hsVarD);
            } else {
                com.json.jj.i().b(false);
            }
            com.json.p8 p8VarC8 = hsVarD.c();
            com.json.x3 applicationConfigurations = p8VarC8 != null ? p8VarC8.getApplicationConfigurations() : null;
            kotlin.jvm.internal.Intrinsics.checkNotNull(applicationConfigurations);
            com.json.fp fpVarH = applicationConfigurations.h();
            pixelEventsEnabled = fpVarH.getPixelEventsEnabled();
            pixelEventsUrl = fpVarH.getPixelEventsUrl();
            pixelEventsCompression = fpVarH.getPixelEventsCompression();
            pixelEventsCompressionLevel = fpVarH.getPixelEventsCompressionLevel();
            pixelOptOut = fpVarH.getPixelOptOut();
            pixelOptIn = fpVarH.getPixelOptIn();
            epVar = com.json.ep.P;
            epVar.b(pixelEventsEnabled);
            if (pixelEventsEnabled) {
                epVar.b(pixelEventsUrl, context);
                epVar.c(pixelOptOut, context);
                epVar.a(pixelOptIn, context);
                epVar.a(pixelEventsCompression);
                epVar.d(pixelEventsCompressionLevel);
            }
        }
        com.json.p8 p8VarC9 = hsVarD.c();
        com.json.hj interstitialConfigurations2 = p8VarC9 != null ? p8VarC9.getInterstitialConfigurations() : null;
        kotlin.jvm.internal.Intrinsics.checkNotNull(interstitialConfigurations2);
        eventsConfigurations = interstitialConfigurations2.i();
        str = "interstitialConfig";
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(eventsConfigurations, str);
        a(eventsConfigurations, context, hsVarD);
        com.json.p8 p8VarC10 = hsVarD.c();
        if (p8VarC10 != null) {
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(applicationConfigurations);
        com.json.fp fpVarH2 = applicationConfigurations.h();
        pixelEventsEnabled = fpVarH2.getPixelEventsEnabled();
        pixelEventsUrl = fpVarH2.getPixelEventsUrl();
        pixelEventsCompression = fpVarH2.getPixelEventsCompression();
        pixelEventsCompressionLevel = fpVarH2.getPixelEventsCompressionLevel();
        pixelOptOut = fpVarH2.getPixelOptOut();
        pixelOptIn = fpVarH2.getPixelOptIn();
        epVar = com.json.ep.P;
        epVar.b(pixelEventsEnabled);
        if (pixelEventsEnabled) {
            epVar.b(pixelEventsUrl, context);
            epVar.c(pixelOptOut, context);
            epVar.a(pixelOptIn, context);
            epVar.a(pixelEventsCompression);
            epVar.d(pixelEventsCompressionLevel);
        }
    }

    private final void b(com.json.e4 config, android.content.Context context, com.json.hs response) {
        com.json.wq.i().a(config.c(), context);
        com.json.wq.i().b(config.d(), context);
        com.json.wq.i().b(config.f());
        com.json.wq.i().a(config.e());
        com.json.wq.i().c(config.a());
        com.json.wq.i().c(config.i(), context);
        com.json.wq.i().a(config.h(), context);
        com.json.wq.i().b(config.j(), context);
        com.json.wq.i().d(config.g(), context);
        com.json.wq wqVarI = com.json.wq.i();
        com.json.x3 applicationConfigurations = response.c().getApplicationConfigurations();
        kotlin.jvm.internal.Intrinsics.checkNotNull(applicationConfigurations);
        wqVarI.a(applicationConfigurations.i());
        com.json.wq.i().a(config.k());
        com.json.wq.i().d(config.b());
    }

    private final void b(com.json.gr sdkConfig2) {
        sdkConfig = sdkConfig2;
        a(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(com.json.mr listener, com.json.gr sdkConfig2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "$listener");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkConfig2, "$sdkConfig");
        listener.a(sdkConfig2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(com.json.mr listener, com.json.ir error) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "$listener");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "$error");
        listener.a(error);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(com.json.or serverResponse) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serverResponse, "$serverResponse");
        com.json.gr grVar = new com.json.gr(serverResponse);
        com.json.tr trVar = f3447a;
        trVar.b(grVar);
        trVar.a(grVar);
    }

    private final com.json.xe c() {
        return (com.json.xe) applicationLifecycleService.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(com.json.ir error) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "$error");
        f3447a.a(error);
    }

    private final void d() {
        if (com.json.im.INSTANCE.d().d().f()) {
            com.json.wq.i().a(new com.json.wb(com.json.mediationsdk.utils.IronSourceConstants.EP_CONFIG_RECEIVED, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f() {
        f3447a.a(true);
    }

    public final void a(final android.content.Context context, final com.json.nr initRequest, final com.json.mr listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initRequest, "initRequest");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "listener");
        final android.content.Context applicationContext = context.getApplicationContext();
        tools.c(new java.lang.Runnable() { // from class: com.ironsource.tr$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.json.tr.a(context, listener, initRequest, applicationContext);
            }
        });
    }

    public final void a(final com.json.or serverResponse) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serverResponse, "serverResponse");
        tools.c(new java.lang.Runnable() { // from class: com.ironsource.tr$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                com.json.tr.b(serverResponse);
            }
        });
    }

    public final void b(final com.json.ir error) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "error");
        tools.c(new java.lang.Runnable() { // from class: com.ironsource.tr$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                com.json.tr.c(error);
            }
        });
    }

    public final void e() {
        tools.c(new java.lang.Runnable() { // from class: com.ironsource.tr$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                com.json.tr.f();
            }
        });
    }
}
