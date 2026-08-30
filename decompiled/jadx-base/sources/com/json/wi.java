package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001Be\b\u0000\u0012\u0006\u0010\u001a\u001a\u00020\u0018\u0012\u0006\u0010\u001e\u001a\u00020\u001b\u0012\u0006\u0010\"\u001a\u00020\u001f\u0012\u0006\u0010%\u001a\u00020#\u0012\b\b\u0002\u0010)\u001a\u00020&\u0012\b\b\u0002\u0010-\u001a\u00020*\u0012\b\b\u0002\u00101\u001a\u00020.\u0012\b\b\u0002\u00105\u001a\u000202\u0012\u0012\u00109\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000006¢\u0006\u0004\bF\u0010GJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000f\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u0005\u0010\u000bJ\b\u0010\f\u001a\u00020\u0004H\u0016J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016J\b\u0010\u000f\u001a\u00020\u0004H\u0016J\u000f\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0010J\b\u0010\u0011\u001a\u00020\u0004H\u0016J\b\u0010\u0012\u001a\u00020\u0004H\u0016J\u001a\u0010\u0016\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016J\b\u0010\u0017\u001a\u00020\u0004H\u0004R\u0016\u0010\u001a\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0019R\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010%\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010$R\u0016\u0010)\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010-\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u00101\u001a\u00020.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00105\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R \u00109\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0000068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\"\u0010?\u001a\u00020:8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b\u001c\u0010=\"\u0004\b\u0005\u0010>R$\u0010E\u001a\u0004\u0018\u00010@8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\b \u0010C\"\u0004\b\u0005\u0010D¨\u0006H"}, d2 = {"Lcom/ironsource/wi;", "Lcom/ironsource/zc;", "Lcom/ironsource/mediationsdk/logger/IronSourceError;", "error", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "", "d", "()Z", "Landroid/app/Activity;", "activity", "(Landroid/app/Activity;)V", "onAdInstanceDidShow", "", "description", "onAdInstanceDidBecomeVisible", "()V", "onAdInstanceDidClick", "onAdInstanceDidDismiss", "demandSourceId", "", "amount", "onAdInstanceDidReward", "finalize", "Lcom/ironsource/mj;", "Lcom/ironsource/mj;", com.ironsource.y8.h.p0, "Lcom/ironsource/x0;", "b", "Lcom/ironsource/x0;", "adNetworkShow", "Lcom/ironsource/u4;", "c", "Lcom/ironsource/u4;", "auctionDataReporter", "Lcom/ironsource/n3;", "Lcom/ironsource/n3;", "analytics", "Lcom/ironsource/in;", "e", "Lcom/ironsource/in;", "networkDestroyAPI", "Lcom/ironsource/qu;", "f", "Lcom/ironsource/qu;", "threadManager", "Lcom/ironsource/vh;", "g", "Lcom/ironsource/vh;", "sessionDepthService", "Lcom/ironsource/vh$a;", androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_HLS, "Lcom/ironsource/vh$a;", "sessionDepthServiceEditor", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT, "Ljava/util/Map;", "retainer", "Lcom/unity3d/ironsourceads/interstitial/InterstitialAdInfo;", "j", "Lcom/unity3d/ironsourceads/interstitial/InterstitialAdInfo;", "()Lcom/unity3d/ironsourceads/interstitial/InterstitialAdInfo;", "(Lcom/unity3d/ironsourceads/interstitial/InterstitialAdInfo;)V", "adInfo", "Lcom/ironsource/xi;", "k", "Lcom/ironsource/xi;", "()Lcom/ironsource/xi;", "(Lcom/ironsource/xi;)V", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(Lcom/ironsource/mj;Lcom/ironsource/x0;Lcom/ironsource/u4;Lcom/ironsource/n3;Lcom/ironsource/in;Lcom/ironsource/qu;Lcom/ironsource/vh;Lcom/ironsource/vh$a;Ljava/util/Map;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class wi implements com.json.zc {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private com.json.mj adInstance;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private com.json.x0 adNetworkShow;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private com.json.u4 auctionDataReporter;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private com.json.n3 analytics;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private com.json.in networkDestroyAPI;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private com.json.qu threadManager;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private com.json.vh sessionDepthService;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private com.ironsource.vh.a sessionDepthServiceEditor;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final java.util.Map<java.lang.String, com.json.wi> retainer;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private com.unity3d.ironsourceads.interstitial.InterstitialAdInfo adInfo;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private com.json.xi listener;

    public wi(com.json.mj adInstance, com.json.x0 adNetworkShow, com.json.u4 auctionDataReporter, com.json.n3 analytics, com.json.in networkDestroyAPI, com.json.qu threadManager, com.json.vh sessionDepthService, com.ironsource.vh.a sessionDepthServiceEditor, java.util.Map<java.lang.String, com.json.wi> retainer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInstance, "adInstance");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adNetworkShow, "adNetworkShow");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(auctionDataReporter, "auctionDataReporter");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analytics, "analytics");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkDestroyAPI, "networkDestroyAPI");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(threadManager, "threadManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionDepthService, "sessionDepthService");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionDepthServiceEditor, "sessionDepthServiceEditor");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(retainer, "retainer");
        this.adInstance = adInstance;
        this.adNetworkShow = adNetworkShow;
        this.auctionDataReporter = auctionDataReporter;
        this.analytics = analytics;
        this.networkDestroyAPI = networkDestroyAPI;
        this.threadManager = threadManager;
        this.sessionDepthService = sessionDepthService;
        this.sessionDepthServiceEditor = sessionDepthServiceEditor;
        this.retainer = retainer;
        java.lang.String strF = adInstance.f();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(strF, "adInstance.instanceId");
        java.lang.String strE = this.adInstance.e();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(strE, "adInstance.id");
        this.adInfo = new com.unity3d.ironsourceads.interstitial.InterstitialAdInfo(strF, strE);
        com.json.xc xcVar = new com.json.xc();
        this.adInstance.a(xcVar);
        xcVar.a(this);
    }

    public /* synthetic */ wi(com.json.mj mjVar, com.json.x0 x0Var, com.json.u4 u4Var, com.json.n3 n3Var, com.json.in inVar, com.json.qu quVar, com.json.vh vhVar, com.ironsource.vh.a aVar, java.util.Map map, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(mjVar, x0Var, u4Var, n3Var, (i & 16) != 0 ? new com.json.jn() : inVar, (i & 32) != 0 ? com.json.cg.f2559a : quVar, (i & 64) != 0 ? com.json.im.INSTANCE.d().k() : vhVar, (i & 128) != 0 ? com.json.im.INSTANCE.a().e() : aVar, map);
    }

    private final void a(final com.json.mediationsdk.logger.IronSourceError error) {
        this.retainer.remove(this.adInfo.getCom.ironsource.sdk.controller.f.b.c java.lang.String());
        com.ironsource.g3.a.INSTANCE.a(new com.ironsource.j3.j(error.getErrorCode()), new com.ironsource.j3.k(error.getErrorMessage())).a(this.analytics);
        this.threadManager.a(new java.lang.Runnable() { // from class: com.ironsource.wi$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.json.wi.a(this.f$0, error);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(com.json.wi this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        com.ironsource.g3.d.INSTANCE.b().a(this$0.analytics);
        this$0.networkDestroyAPI.a(this$0.adInstance);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(com.json.wi this$0, com.json.mediationsdk.logger.IronSourceError error) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "$error");
        com.json.xi xiVar = this$0.listener;
        if (xiVar != null) {
            xiVar.onAdInstanceDidFailedToShow(error);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(com.json.wi this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        com.json.xi xiVar = this$0.listener;
        if (xiVar != null) {
            xiVar.onAdInstanceDidClick();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(com.json.wi this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        com.json.xi xiVar = this$0.listener;
        if (xiVar != null) {
            xiVar.onAdInstanceDidDismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(com.json.wi this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        com.json.xi xiVar = this$0.listener;
        if (xiVar != null) {
            xiVar.onAdInstanceDidShow();
        }
    }

    public final void a() {
        com.json.qu.a(this.threadManager, new java.lang.Runnable() { // from class: com.ironsource.wi$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                com.json.wi.a(this.f$0);
            }
        }, 0L, 2, null);
    }

    public final void a(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        this.retainer.put(this.adInfo.getCom.ironsource.sdk.controller.f.b.c java.lang.String(), this);
        if (!this.adNetworkShow.a(this.adInstance)) {
            a(com.json.tb.f3430a.t());
        } else {
            com.ironsource.g3.a.INSTANCE.d(new com.json.k3[0]).a(this.analytics);
            this.adNetworkShow.a(activity, this.adInstance);
        }
    }

    public final void a(com.json.xi xiVar) {
        this.listener = xiVar;
    }

    public final void a(com.unity3d.ironsourceads.interstitial.InterstitialAdInfo interstitialAdInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(interstitialAdInfo, "<set-?>");
        this.adInfo = interstitialAdInfo;
    }

    @Override // com.json.zc
    public void a(java.lang.String description) {
        a(com.json.tb.f3430a.c(new com.json.mediationsdk.logger.IronSourceError(0, description)));
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final com.unity3d.ironsourceads.interstitial.InterstitialAdInfo getAdInfo() {
        return this.adInfo;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final com.json.xi getListener() {
        return this.listener;
    }

    public final boolean d() {
        boolean zA = this.adNetworkShow.a(this.adInstance);
        com.ironsource.g3.a.INSTANCE.a(zA).a(this.analytics);
        return zA;
    }

    protected final void finalize() {
        a();
    }

    @Override // com.json.zc
    public void onAdInstanceDidBecomeVisible() {
        com.ironsource.g3.a.INSTANCE.f(new com.json.k3[0]).a(this.analytics);
    }

    @Override // com.json.zc
    public void onAdInstanceDidClick() {
        com.ironsource.g3.a.INSTANCE.a().a(this.analytics);
        this.threadManager.a(new java.lang.Runnable() { // from class: com.ironsource.wi$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                com.json.wi.b(this.f$0);
            }
        });
    }

    @Override // com.json.zc
    public void onAdInstanceDidDismiss() {
        this.retainer.remove(this.adInfo.getCom.ironsource.sdk.controller.f.b.c java.lang.String());
        com.ironsource.g3.a.INSTANCE.a(new com.json.k3[0]).a(this.analytics);
        this.threadManager.a(new java.lang.Runnable() { // from class: com.ironsource.wi$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                com.json.wi.c(this.f$0);
            }
        });
    }

    @Override // com.json.zc
    public void onAdInstanceDidReward(java.lang.String demandSourceId, int amount) {
    }

    @Override // com.json.zc
    public void onAdInstanceDidShow() {
        com.json.vh vhVar = this.sessionDepthService;
        com.ironsource.mediationsdk.IronSource.AD_UNIT ad_unit = com.ironsource.mediationsdk.IronSource.AD_UNIT.INTERSTITIAL;
        com.ironsource.g3.a.INSTANCE.b(new com.ironsource.j3.w(vhVar.a(ad_unit))).a(this.analytics);
        this.sessionDepthServiceEditor.b(ad_unit);
        this.auctionDataReporter.c("onAdInstanceDidShow");
        this.threadManager.a(new java.lang.Runnable() { // from class: com.ironsource.wi$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                com.json.wi.d(this.f$0);
            }
        });
    }
}
