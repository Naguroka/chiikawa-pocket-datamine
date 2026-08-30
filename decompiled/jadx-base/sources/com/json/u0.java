package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u0014\u0010\f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/ironsource/u0;", "Lcom/ironsource/t0;", "Landroid/content/Context;", "context", "Lcom/ironsource/gi;", "initConfig", "Lcom/unity3d/ironsourceads/InitListener;", "initListener", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/ironsource/mn;", "Lcom/ironsource/mn;", "networkInitApi", "<init>", "(Lcom/ironsource/mn;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class u0 implements com.json.t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final com.json.mn networkInitApi;

    @kotlin.Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\u0007"}, d2 = {"com/ironsource/u0$a", "Lcom/ironsource/jo;", "", "onSuccess", "Lcom/ironsource/ah;", "error", "onFail", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class a implements com.json.jo {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.json.gi f3457a;
        final /* synthetic */ com.unity3d.ironsourceads.InitListener b;

        a(com.json.gi giVar, com.unity3d.ironsourceads.InitListener initListener) {
            this.f3457a = giVar;
            this.b = initListener;
        }

        @Override // com.json.jo
        public void onFail(com.json.ah error) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "error");
            com.json.mediationsdk.logger.IronLog.ADAPTER_API.verbose("initSDKWithNetworkConfigurations error: " + error);
            this.b.onInitFailed(com.json.tb.f3430a.a(new com.json.mediationsdk.logger.IronSourceError(error.a(), error.b())));
        }

        @Override // com.json.jo
        public void onSuccess() {
            com.json.mediationsdk.logger.IronLog ironLog = com.json.mediationsdk.logger.IronLog.ADAPTER_API;
            ironLog.verbose("initSDKWithNetworkConfigurations success");
            java.lang.StringBuilder sb = new java.lang.StringBuilder("controllerURL = ");
            com.json.s0 applicationConfig = this.f3457a.getApplicationConfig();
            ironLog.verbose(sb.append(applicationConfig != null ? applicationConfig.c() : null).toString());
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("controllerConfig = ");
            com.json.s0 applicationConfig2 = this.f3457a.getApplicationConfig();
            ironLog.verbose(sb2.append(applicationConfig2 != null ? applicationConfig2.a() : null).toString());
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("debugMode = ");
            com.json.s0 applicationConfig3 = this.f3457a.getApplicationConfig();
            ironLog.verbose(sb3.append(applicationConfig3 != null ? java.lang.Integer.valueOf(applicationConfig3.b()) : null).toString());
            ironLog.verbose("applicationKey = " + this.f3457a.d());
            ironLog.verbose("userId = " + this.f3457a.h());
            this.b.onInitSuccess();
        }
    }

    public u0(com.json.mn networkInitApi) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkInitApi, "networkInitApi");
        this.networkInitApi = networkInitApi;
    }

    @Override // com.json.t0
    public void a(android.content.Context context, com.json.gi initConfig, com.unity3d.ironsourceads.InitListener initListener) {
        org.json.JSONObject jSONObjectA;
        java.lang.String strC;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initConfig, "initConfig");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initListener, "initListener");
        com.json.mn mnVar = this.networkInitApi;
        com.json.s0 applicationConfig = initConfig.getApplicationConfig();
        mnVar.a(applicationConfig != null ? applicationConfig.b() : 0);
        com.json.s0 applicationConfig2 = initConfig.getApplicationConfig();
        if (applicationConfig2 != null && (strC = applicationConfig2.c()) != null) {
            this.networkInitApi.b(strC);
        }
        com.json.s0 applicationConfig3 = initConfig.getApplicationConfig();
        if (applicationConfig3 != null && (jSONObjectA = applicationConfig3.a()) != null) {
            com.json.mn mnVar2 = this.networkInitApi;
            java.lang.String string = jSONObjectA.toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "applicationConfig.toString()");
            mnVar2.a(string);
        }
        java.util.Map<java.lang.String, java.lang.String> mapA = new com.json.kn().a();
        this.networkInitApi.a(new com.ironsource.u0.a(initConfig, initListener));
        this.networkInitApi.a(context, initConfig.d(), initConfig.h(), mapA);
    }
}
