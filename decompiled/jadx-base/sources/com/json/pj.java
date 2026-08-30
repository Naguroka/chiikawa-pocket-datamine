package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015J*\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002J\"\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002J\"\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0002J\u001e\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\bR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lcom/ironsource/pj;", "", "Landroid/content/Context;", "context", "Lcom/ironsource/hs;", "serverResponse", "Lcom/ironsource/fb;", "initDuration", "Lcom/unity3d/ironsourceads/InitListener;", "initializationListener", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/ironsource/ir;", "error", "Lcom/unity3d/ironsourceads/InitRequest;", "initRequest", "Lcom/ironsource/oi;", "b", "Lcom/ironsource/oi;", "tools", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class pj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final com.json.pj f3163a = new com.json.pj();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final com.json.oi tools = new com.json.oi();

    @kotlin.Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\u0007"}, d2 = {"com/ironsource/pj$a", "Lcom/unity3d/ironsourceads/InitListener;", "", "onInitSuccess", "Lcom/ironsource/mediationsdk/logger/IronSourceError;", "error", "onInitFailed", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class a implements com.unity3d.ironsourceads.InitListener {
        a() {
        }

        @Override // com.unity3d.ironsourceads.InitListener
        public void onInitFailed(com.json.mediationsdk.logger.IronSourceError error) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "error");
        }

        @Override // com.unity3d.ironsourceads.InitListener
        public void onInitSuccess() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\b"}, d2 = {"com/ironsource/pj$b", "Lcom/ironsource/mr;", "Lcom/ironsource/gr;", "sdkConfig", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/ironsource/ir;", "error", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class b implements com.json.mr {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.content.Context f3164a;
        final /* synthetic */ com.json.fb b;
        final /* synthetic */ com.unity3d.ironsourceads.InitListener c;

        b(android.content.Context context, com.json.fb fbVar, com.unity3d.ironsourceads.InitListener initListener) {
            this.f3164a = context;
            this.b = fbVar;
            this.c = initListener;
        }

        @Override // com.json.mr
        public void a(com.json.gr sdkConfig) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkConfig, "sdkConfig");
            com.json.pj.f3163a.a(this.f3164a, sdkConfig.d(), this.b, this.c);
        }

        @Override // com.json.mr
        public void a(com.json.ir error) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "error");
            com.json.pj.f3163a.a(this.c, this.b, error);
        }
    }

    private pj() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(android.content.Context context, com.json.hs serverResponse, com.json.fb initDuration, com.unity3d.ironsourceads.InitListener initializationListener) {
        java.lang.String strU = com.json.mediationsdk.p.m().u();
        com.json.gi giVarF = serverResponse.f();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(giVarF, "serverResponse.initialConfiguration");
        com.json.mediationsdk.model.NetworkSettings networkSettingsB = serverResponse.k().b("IronSource");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(networkSettingsB, "serverResponse.providerS…s.IRONSOURCE_CONFIG_NAME)");
        org.json.JSONObject interstitialSettings = networkSettingsB.getInterstitialSettings();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(interstitialSettings, "networkSettings.interstitialSettings");
        giVarF.a(new com.ironsource.s0.a(interstitialSettings));
        giVarF.a(com.json.mediationsdk.config.ConfigFile.getConfigFile().getPluginType());
        giVarF.b(strU);
        new com.json.u0(new com.json.nn()).a(context, giVarF, new com.ironsource.pj.a());
        a(serverResponse, initDuration, initializationListener);
    }

    private final void a(com.json.hs serverResponse, com.json.fb initDuration, final com.unity3d.ironsourceads.InitListener initializationListener) {
        com.json.g4 g4VarD;
        com.json.x3 applicationConfigurations = serverResponse.c().getApplicationConfigurations();
        new com.json.jm().a((applicationConfigurations == null || (g4VarD = applicationConfigurations.d()) == null) ? null : g4VarD.b(), true);
        java.lang.String sessionId = com.json.mediationsdk.p.m().u();
        com.json.gn gnVarA = com.json.gn.INSTANCE.a();
        gnVarA.a(serverResponse.k());
        gnVarA.a(serverResponse.c());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sessionId, "sessionId");
        gnVarA.a(sessionId);
        gnVarA.g();
        long jA = com.json.fb.a(initDuration);
        com.json.oi oiVar = tools;
        com.ironsource.hs.a aVarH = serverResponse.h();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(aVarH, "serverResponse.origin");
        oiVar.a(jA, aVarH);
        oiVar.b(new java.lang.Runnable() { // from class: com.ironsource.pj$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                com.json.pj.a(initializationListener);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(com.unity3d.ironsourceads.InitListener initListener) {
        if (initListener != null) {
            initListener.onInitSuccess();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(final com.unity3d.ironsourceads.InitListener initializationListener, com.json.fb initDuration, final com.json.ir error) {
        long jA = com.json.fb.a(initDuration);
        com.json.oi oiVar = tools;
        oiVar.a(error, jA);
        oiVar.b(new java.lang.Runnable() { // from class: com.ironsource.pj$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                com.json.pj.a(initializationListener, error);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(com.unity3d.ironsourceads.InitListener initListener, com.json.ir error) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "$error");
        if (initListener != null) {
            initListener.onInitFailed(tools.a(error));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(com.unity3d.ironsourceads.InitRequest initRequest, android.content.Context context, com.unity3d.ironsourceads.InitListener initializationListener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initRequest, "$initRequest");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "$context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initializationListener, "$initializationListener");
        com.json.fb fbVar = new com.json.fb();
        com.json.ur.f3478a.c(context, new com.json.nr(initRequest.getAppKey(), null, kotlin.collections.ArraysKt.toMutableList(tools.a(initRequest.getLegacyAdFormats())), 2, null), new com.ironsource.pj.b(context, fbVar, initializationListener));
    }

    public final void a(final android.content.Context context, final com.unity3d.ironsourceads.InitRequest initRequest, final com.unity3d.ironsourceads.InitListener initializationListener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initRequest, "initRequest");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initializationListener, "initializationListener");
        tools.a(new java.lang.Runnable() { // from class: com.ironsource.pj$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.json.pj.a(initRequest, context, initializationListener);
            }
        });
    }
}
