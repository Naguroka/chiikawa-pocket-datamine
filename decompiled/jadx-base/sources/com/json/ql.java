package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b!\u0010\"J\"\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002J2\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002J\u001e\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u0011H\u0002J*\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u000f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002J\u0018\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H\u0002J\u0018\u0010\u000e\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0016H\u0002J\"\u0010\u000e\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002J\"\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\u00188\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u001f¨\u0006#"}, d2 = {"Lcom/ironsource/ql;", "", "Landroid/content/Context;", "context", "Lcom/unity3d/mediation/LevelPlayInitRequest;", "initRequest", "Lcom/unity3d/mediation/LevelPlayInitListener;", "initializationListener", "", "c", "Lcom/ironsource/gr;", "sdkConfig", "Lcom/ironsource/fb;", "initDuration", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "", "delay", "Lkotlin/Function0;", "successCallback", "Lcom/ironsource/al;", "levelPlayConfig", "delayTimeAfterInitProcessInMS", "Lcom/unity3d/mediation/LevelPlay$AdFormat;", com.json.mediationsdk.impressionData.ImpressionData.IMPRESSION_DATA_KEY_AD_FORMAT, "", "Lcom/ironsource/ir;", "error", "Lcom/ironsource/rl;", "b", "Lcom/ironsource/rl;", "tools", "Z", "ENABLE_STANDALONE_INIT", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class ql {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final com.json.ql f3214a = new com.json.ql();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final com.json.rl tools = new com.json.rl();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static final boolean ENABLE_STANDALONE_INIT = false;

    @kotlin.Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\b"}, d2 = {"com/ironsource/ql$a", "Lcom/ironsource/mr;", "Lcom/ironsource/gr;", "sdkConfig", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/ironsource/ir;", "error", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class a implements com.json.mr {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.unity3d.mediation.LevelPlayInitRequest f3215a;
        final /* synthetic */ android.content.Context b;
        final /* synthetic */ com.json.fb c;
        final /* synthetic */ com.unity3d.mediation.LevelPlayInitListener d;

        a(com.unity3d.mediation.LevelPlayInitRequest levelPlayInitRequest, android.content.Context context, com.json.fb fbVar, com.unity3d.mediation.LevelPlayInitListener levelPlayInitListener) {
            this.f3215a = levelPlayInitRequest;
            this.b = context;
            this.c = fbVar;
            this.d = levelPlayInitListener;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(com.unity3d.mediation.LevelPlayInitListener levelPlayInitListener, com.json.fb initDuration, com.json.ir error) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initDuration, "$initDuration");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "$error");
            com.json.ql.f3214a.a(levelPlayInitListener, initDuration, error);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(com.unity3d.mediation.LevelPlayInitRequest initRequest, com.json.gr sdkConfig, android.content.Context context, com.json.fb initDuration, com.unity3d.mediation.LevelPlayInitListener levelPlayInitListener) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initRequest, "$initRequest");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkConfig, "$sdkConfig");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "$context");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initDuration, "$initDuration");
            com.json.ql.f3214a.a(initRequest, sdkConfig, context, initDuration, levelPlayInitListener);
        }

        @Override // com.json.mr
        public void a(final com.json.gr sdkConfig) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkConfig, "sdkConfig");
            com.json.rl rlVar = com.json.ql.tools;
            final com.unity3d.mediation.LevelPlayInitRequest levelPlayInitRequest = this.f3215a;
            final android.content.Context context = this.b;
            final com.json.fb fbVar = this.c;
            final com.unity3d.mediation.LevelPlayInitListener levelPlayInitListener = this.d;
            rlVar.a(new java.lang.Runnable() { // from class: com.ironsource.ql$a$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    com.ironsource.ql.a.a(levelPlayInitRequest, sdkConfig, context, fbVar, levelPlayInitListener);
                }
            });
        }

        @Override // com.json.mr
        public void a(final com.json.ir error) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "error");
            com.json.rl rlVar = com.json.ql.tools;
            final com.unity3d.mediation.LevelPlayInitListener levelPlayInitListener = this.d;
            final com.json.fb fbVar = this.c;
            rlVar.a(new java.lang.Runnable() { // from class: com.ironsource.ql$a$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    com.ironsource.ql.a.a(levelPlayInitListener, fbVar, error);
                }
            });
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\b"}, d2 = {"com/ironsource/ql$b", "Lcom/ironsource/mr;", "Lcom/ironsource/gr;", "sdkConfig", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/ironsource/ir;", "error", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class b implements com.json.mr {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.unity3d.mediation.LevelPlayInitRequest f3216a;
        final /* synthetic */ android.content.Context b;
        final /* synthetic */ com.json.fb c;
        final /* synthetic */ com.unity3d.mediation.LevelPlayInitListener d;

        b(com.unity3d.mediation.LevelPlayInitRequest levelPlayInitRequest, android.content.Context context, com.json.fb fbVar, com.unity3d.mediation.LevelPlayInitListener levelPlayInitListener) {
            this.f3216a = levelPlayInitRequest;
            this.b = context;
            this.c = fbVar;
            this.d = levelPlayInitListener;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(com.unity3d.mediation.LevelPlayInitListener levelPlayInitListener, com.json.fb initDuration, com.json.ir error) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initDuration, "$initDuration");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "$error");
            com.json.ql.f3214a.a(levelPlayInitListener, initDuration, error);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(com.unity3d.mediation.LevelPlayInitRequest initRequest, com.json.gr sdkConfig, android.content.Context context, com.json.fb initDuration, com.unity3d.mediation.LevelPlayInitListener levelPlayInitListener) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initRequest, "$initRequest");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkConfig, "$sdkConfig");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "$context");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initDuration, "$initDuration");
            com.json.ql.f3214a.a(initRequest, sdkConfig, context, initDuration, levelPlayInitListener);
        }

        @Override // com.json.mr
        public void a(final com.json.gr sdkConfig) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkConfig, "sdkConfig");
            com.json.rl rlVar = com.json.ql.tools;
            final com.unity3d.mediation.LevelPlayInitRequest levelPlayInitRequest = this.f3216a;
            final android.content.Context context = this.b;
            final com.json.fb fbVar = this.c;
            final com.unity3d.mediation.LevelPlayInitListener levelPlayInitListener = this.d;
            rlVar.a(new java.lang.Runnable() { // from class: com.ironsource.ql$b$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    com.ironsource.ql.b.a(levelPlayInitRequest, sdkConfig, context, fbVar, levelPlayInitListener);
                }
            });
        }

        @Override // com.json.mr
        public void a(final com.json.ir error) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "error");
            com.json.rl rlVar = com.json.ql.tools;
            final com.unity3d.mediation.LevelPlayInitListener levelPlayInitListener = this.d;
            final com.json.fb fbVar = this.c;
            rlVar.a(new java.lang.Runnable() { // from class: com.ironsource.ql$b$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    com.ironsource.ql.b.a(levelPlayInitListener, fbVar, error);
                }
            });
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()V"}, k = 3, mv = {1, 8, 0})
    static final class c extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<kotlin.Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.json.al f3217a;
        final /* synthetic */ com.json.fb b;
        final /* synthetic */ long c;
        final /* synthetic */ com.unity3d.mediation.LevelPlayInitListener d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(com.json.al alVar, com.json.fb fbVar, long j, com.unity3d.mediation.LevelPlayInitListener levelPlayInitListener) {
            super(0);
            this.f3217a = alVar;
            this.b = fbVar;
            this.c = j;
            this.d = levelPlayInitListener;
        }

        public final void a() {
            com.json.ql.f3214a.a(this.f3217a, this.b, this.c, this.d);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
            a();
            return kotlin.Unit.INSTANCE;
        }
    }

    private ql() {
    }

    private final void a(long delay, kotlin.jvm.functions.Function0<kotlin.Unit> successCallback) {
        if (com.json.im.INSTANCE.d().t().getIsSDKInitialized() || delay <= 0) {
            successCallback.invoke();
        } else {
            tools.a(successCallback, delay);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(final com.json.al levelPlayConfig, com.json.fb initDuration, long delayTimeAfterInitProcessInMS, final com.unity3d.mediation.LevelPlayInitListener initializationListener) {
        com.json.im.INSTANCE.a().D().d();
        long jA = com.json.fb.a(initDuration);
        com.json.rl rlVar = tools;
        rlVar.a(jA, levelPlayConfig.f(), delayTimeAfterInitProcessInMS);
        rlVar.e(new java.lang.Runnable() { // from class: com.ironsource.ql$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                com.json.ql.a(initializationListener, levelPlayConfig);
            }
        });
    }

    public static /* synthetic */ void a(com.json.ql qlVar, android.content.Context context, com.unity3d.mediation.LevelPlayInitRequest levelPlayInitRequest, com.unity3d.mediation.LevelPlayInitListener levelPlayInitListener, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            levelPlayInitListener = null;
        }
        qlVar.a(context, levelPlayInitRequest, levelPlayInitListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(com.unity3d.mediation.LevelPlayInitListener levelPlayInitListener, com.json.al levelPlayConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(levelPlayConfig, "$levelPlayConfig");
        if (levelPlayInitListener != null) {
            levelPlayInitListener.onInitSuccess(new com.unity3d.mediation.LevelPlayConfiguration(levelPlayConfig.j()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(final com.unity3d.mediation.LevelPlayInitListener initializationListener, com.json.fb initDuration, final com.json.ir error) {
        long jA = com.json.fb.a(initDuration);
        com.json.rl rlVar = tools;
        rlVar.a(error, jA);
        rlVar.e(new java.lang.Runnable() { // from class: com.ironsource.ql$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.json.ql.a(initializationListener, error);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(com.unity3d.mediation.LevelPlayInitListener levelPlayInitListener, com.json.ir error) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "$error");
        if (levelPlayInitListener != null) {
            levelPlayInitListener.onInitFailed(new com.unity3d.mediation.LevelPlayInitError(error));
        }
    }

    private final void a(com.unity3d.mediation.LevelPlayInitRequest initRequest, com.json.al levelPlayConfig) {
        com.unity3d.mediation.LevelPlay.AdFormat adFormat = com.unity3d.mediation.LevelPlay.AdFormat.REWARDED;
        if (a(initRequest, adFormat) && levelPlayConfig.d().c().getRewardedVideoConfigurations() != null) {
            com.json.oq.Companion aVar = com.json.oq.INSTANCE;
            com.ironsource.mediationsdk.IronSource.AD_UNIT ad_unit = com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO;
            com.json.oq oqVarA = aVar.a(new com.json.c1(ad_unit, "", null, null, 12, null), levelPlayConfig, true);
            java.util.List<com.json.vn> listC = levelPlayConfig.c(adFormat);
            com.ironsource.b2.b bVar = com.ironsource.b2.b.MEDIATION;
            new com.json.tp(new com.json.t2(new com.json.l1(ad_unit, bVar), oqVarA, bVar), adFormat, listC, oqVarA).a();
        }
        com.unity3d.mediation.LevelPlay.AdFormat adFormat2 = com.unity3d.mediation.LevelPlay.AdFormat.INTERSTITIAL;
        if (a(initRequest, adFormat2) && levelPlayConfig.d().c().getInterstitialConfigurations() != null) {
            com.json.fj.Companion aVar2 = com.json.fj.INSTANCE;
            com.ironsource.mediationsdk.IronSource.AD_UNIT ad_unit2 = com.ironsource.mediationsdk.IronSource.AD_UNIT.INTERSTITIAL;
            com.json.fj fjVarA = aVar2.a(new com.json.c1(ad_unit2, "", null, null, 12, null), levelPlayConfig, true);
            java.util.List<com.json.vn> listC2 = levelPlayConfig.c(adFormat2);
            com.ironsource.b2.b bVar2 = com.ironsource.b2.b.MEDIATION;
            new com.json.tp(new com.json.t2(new com.json.l1(ad_unit2, bVar2), fjVarA, bVar2), adFormat2, listC2, fjVarA).a();
        }
        com.unity3d.mediation.LevelPlay.AdFormat adFormat3 = com.unity3d.mediation.LevelPlay.AdFormat.BANNER;
        if (!a(initRequest, adFormat3) || levelPlayConfig.d().c().getBannerConfigurations() == null) {
            return;
        }
        com.json.j6 j6VarA = com.json.j6.INSTANCE.a(new com.json.g6(), levelPlayConfig, true);
        java.util.List<com.json.vn> listC3 = levelPlayConfig.c(adFormat3);
        com.ironsource.mediationsdk.IronSource.AD_UNIT ad_unit3 = com.ironsource.mediationsdk.IronSource.AD_UNIT.BANNER;
        com.ironsource.b2.b bVar3 = com.ironsource.b2.b.MEDIATION;
        new com.json.tp(new com.json.t2(new com.json.l1(ad_unit3, bVar3), j6VarA, bVar3), adFormat3, listC3, j6VarA).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(com.unity3d.mediation.LevelPlayInitRequest initRequest, com.json.gr sdkConfig, android.content.Context context, com.json.fb initDuration, com.unity3d.mediation.LevelPlayInitListener initializationListener) {
        com.json.im.Companion companion = com.json.im.INSTANCE;
        com.ironsource.rh.a aVarD = companion.a().D();
        com.json.al alVar = new com.json.al(sdkConfig);
        if (alVar.k()) {
            tools.a(context);
        }
        com.ironsource.uf.a aVarA = companion.a().a();
        com.json.rl rlVar = tools;
        alVar.b(rlVar).a(aVarA);
        alVar.a(rlVar).a(companion.a().w());
        alVar.c(rlVar).a(companion.a().A());
        com.json.ql qlVar = f3214a;
        qlVar.a(initRequest, alVar);
        long jB = companion.d().d().b();
        qlVar.a(jB, new com.ironsource.ql.c(alVar, initDuration, jB, initializationListener));
        aVarD.a(alVar);
        if (sdkConfig.a().getShouldRegisterTrigger()) {
            new com.json.aq(null, null, null, com.json.environment.thread.IronSourceThreadManager.INSTANCE.getThreadPoolExecutor(), 7, null).c(context);
        }
    }

    private final boolean a(com.unity3d.mediation.LevelPlayInitRequest initRequest, com.unity3d.mediation.LevelPlay.AdFormat adFormat) {
        return !initRequest.getLegacyAdFormats().contains(adFormat);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(android.content.Context context, com.unity3d.mediation.LevelPlayInitRequest initRequest, com.unity3d.mediation.LevelPlayInitListener levelPlayInitListener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "$context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initRequest, "$initRequest");
        f3214a.c(context, initRequest, levelPlayInitListener);
    }

    private final void c(android.content.Context context, com.unity3d.mediation.LevelPlayInitRequest initRequest, com.unity3d.mediation.LevelPlayInitListener initializationListener) {
        com.json.fb fbVar = new com.json.fb();
        com.json.rl rlVar = tools;
        com.unity3d.mediation.LevelPlay.AdFormat[] adFormatArr = (com.unity3d.mediation.LevelPlay.AdFormat[]) initRequest.getLegacyAdFormats().toArray(new com.unity3d.mediation.LevelPlay.AdFormat[0]);
        com.json.nr nrVar = new com.json.nr(initRequest.getAppKey(), initRequest.getUserId(), kotlin.collections.ArraysKt.toMutableList(rlVar.a((com.unity3d.mediation.LevelPlay.AdFormat[]) java.util.Arrays.copyOf(adFormatArr, adFormatArr.length))));
        nrVar.e().isEmpty();
        com.json.ur.f3478a.a(context, nrVar, new com.ironsource.ql.a(initRequest, context, fbVar, initializationListener));
    }

    public final void a(final android.content.Context context, final com.unity3d.mediation.LevelPlayInitRequest initRequest, final com.unity3d.mediation.LevelPlayInitListener initializationListener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initRequest, "initRequest");
        tools.d(new java.lang.Runnable() { // from class: com.ironsource.ql$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                com.json.ql.b(context, initRequest, initializationListener);
            }
        });
    }
}
