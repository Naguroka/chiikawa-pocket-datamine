package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\tB7\u0012\u0006\u0010\u001a\u001a\u00020\u0017\u0012\u0006\u0010\u001e\u001a\u00020\u001b\u0012\u0006\u0010A\u001a\u00020@\u0012\u0006\u0010C\u001a\u00020B\u0012\u0006\u0010!\u001a\u00020\u001f\u0012\u0006\u0010$\u001a\u00020\"¢\u0006\u0004\bD\u0010EJ\b\u0010\u0005\u001a\u00020\u0004H\u0002J#\u0010\t\u001a\u00020\u00042\u0012\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006\"\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000b\u001a\u00020\u0004H\u0002J\b\u0010\f\u001a\u00020\u0004H\u0002J\b\u0010\r\u001a\u00020\u0004H\u0002J\b\u0010\u000e\u001a\u00020\u0004H\u0016J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0012\u0010\t\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016J\b\u0010\u0014\u001a\u00020\u0004H\u0016J\u0012\u0010\u0014\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016J\b\u0010\u0015\u001a\u00020\u0004H\u0016J\b\u0010\u0016\u001a\u00020\u0004H\u0016J\b\u0010\u0011\u001a\u00020\u0004H\u0016R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010!\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010 R\u0014\u0010$\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010#R\u0018\u0010'\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010&R\u0014\u0010*\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010)R\u0014\u0010-\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010,R\u0014\u00100\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010/R\u001c\u00103\u001a\b\u0018\u000101R\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u00102R\u001a\u00105\u001a\u000601R\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00102R\u0016\u00109\u001a\u0002068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u0010;\u001a\u0002068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u00108R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?¨\u0006F"}, d2 = {"Lcom/ironsource/su;", "Lcom/ironsource/f7;", "Lcom/ironsource/j2;", "Lcom/ironsource/v1;", "", "j", "", "Lcom/ironsource/cp;", "triggers", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "([Lcom/ironsource/cp;)V", androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAM_TYPE_LIVE, androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT, "k", "f", "Lcom/ironsource/q1;", "adUnitCallback", "c", "Lcom/ironsource/mediationsdk/logger/IronSourceError;", "error", "b", "g", androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_HLS, "Lcom/ironsource/l1;", "d", "Lcom/ironsource/l1;", "adTools", "Lcom/ironsource/t6;", "e", "Lcom/ironsource/t6;", "bannerContainer", "Lcom/ironsource/g7;", "Lcom/ironsource/g7;", "bannerStrategyListener", "Lcom/ironsource/k6;", "Lcom/ironsource/k6;", "bannerAdUnitFactory", "Lcom/ironsource/av;", "Lcom/ironsource/av;", "taskScheduler", "Lcom/ironsource/t3;", "Lcom/ironsource/t3;", "appLifecycleTrigger", "Lcom/ironsource/nv;", "Lcom/ironsource/nv;", "viewVisibilityTrigger", "Lcom/ironsource/gm;", "Lcom/ironsource/gm;", "manualTrigger", "Lcom/ironsource/su$a;", "Lcom/ironsource/su$a;", "currentBanner", "m", "nextBanner", "", com.json.zb.q, "Z", "isShowCountdownFinished", "o", "isFirstShow", androidx.media3.extractor.text.ttml.TtmlNode.TAG_P, "Lcom/ironsource/q1;", "q", "Lcom/ironsource/mediationsdk/logger/IronSourceError;", "Lcom/ironsource/f7$b;", "config", "Lcom/ironsource/g6;", "bannerAdProperties", "<init>", "(Lcom/ironsource/l1;Lcom/ironsource/t6;Lcom/ironsource/f7$b;Lcom/ironsource/g6;Lcom/ironsource/g7;Lcom/ironsource/k6;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class su extends com.json.f7 implements com.json.j2, com.json.v1 {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final com.json.l1 adTools;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final com.json.t6 bannerContainer;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final com.json.g7 bannerStrategyListener;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final com.json.k6 bannerAdUnitFactory;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private com.json.av taskScheduler;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final com.json.t3 appLifecycleTrigger;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final com.json.nv viewVisibilityTrigger;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final com.json.gm manualTrigger;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private com.ironsource.su.a currentBanner;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private com.ironsource.su.a nextBanner;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private boolean isShowCountdownFinished;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private boolean isFirstShow;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private com.json.q1 adUnitCallback;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private com.json.mediationsdk.logger.IronSourceError error;

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u0019\u001a\u00020\u0005¢\u0006\u0004\b\u001a\u0010\u001bJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0005R\u0017\u0010\u000b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0004\u0010\b\u001a\u0004\b\t\u0010\nR\"\u0010\u0011\u001a\u00020\f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f\"\u0004\b\u0004\u0010\u0010R\"\u0010\u0016\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0004\u0010\u0015¨\u0006\u001c"}, d2 = {"Lcom/ironsource/su$a;", "", "", "f", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "", "e", "Lcom/ironsource/i6;", "Lcom/ironsource/i6;", "c", "()Lcom/ironsource/i6;", "bannerAdUnit", "Lcom/ironsource/q1;", "b", "Lcom/ironsource/q1;", "()Lcom/ironsource/q1;", "(Lcom/ironsource/q1;)V", "adUnitCallback", "Z", "d", "()Z", "(Z)V", "isLoading", "Lcom/ironsource/k6;", "bannerAdUnitFactory", "isPublisherLoad", "<init>", "(Lcom/ironsource/su;Lcom/ironsource/k6;Z)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    private final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final com.json.i6 bannerAdUnit;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public com.json.q1 adUnitCallback;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private boolean isLoading;
        final /* synthetic */ com.json.su d;

        public a(com.json.su suVar, com.json.k6 bannerAdUnitFactory, boolean z) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bannerAdUnitFactory, "bannerAdUnitFactory");
            this.d = suVar;
            this.bannerAdUnit = bannerAdUnitFactory.a(z);
            this.isLoading = true;
        }

        public final void a() {
            this.bannerAdUnit.d();
        }

        public final void a(com.json.q1 q1Var) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(q1Var, "<set-?>");
            this.adUnitCallback = q1Var;
        }

        public final void a(boolean z) {
            this.isLoading = z;
        }

        public final com.json.q1 b() {
            com.json.q1 q1Var = this.adUnitCallback;
            if (q1Var != null) {
                return q1Var;
            }
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adUnitCallback");
            return null;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final com.json.i6 getBannerAdUnit() {
            return this.bannerAdUnit;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final boolean getIsLoading() {
            return this.isLoading;
        }

        public final boolean e() {
            return this.bannerAdUnit.e().getIsReady();
        }

        public final void f() {
            this.bannerAdUnit.a((com.json.j2) this.d);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public su(com.json.l1 adTools, com.json.t6 bannerContainer, com.ironsource.f7.b config, com.json.g6 bannerAdProperties, com.json.g7 bannerStrategyListener, com.json.k6 bannerAdUnitFactory) {
        super(config, bannerAdProperties);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adTools, "adTools");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bannerContainer, "bannerContainer");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "config");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bannerAdProperties, "bannerAdProperties");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bannerStrategyListener, "bannerStrategyListener");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bannerAdUnitFactory, "bannerAdUnitFactory");
        this.adTools = adTools;
        this.bannerContainer = bannerContainer;
        this.bannerStrategyListener = bannerStrategyListener;
        this.bannerAdUnitFactory = bannerAdUnitFactory;
        com.json.mediationsdk.logger.IronLog.INTERNAL.verbose(com.json.l1.a(adTools, "refresh interval: " + d() + ", auto refresh: " + e(), (java.lang.String) null, 2, (java.lang.Object) null));
        this.appLifecycleTrigger = new com.json.t3(adTools.b());
        this.viewVisibilityTrigger = new com.json.nv(bannerContainer);
        this.manualTrigger = new com.json.gm(!e());
        this.nextBanner = new com.ironsource.su.a(this, bannerAdUnitFactory, true);
        this.isFirstShow = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(com.json.su this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.isShowCountdownFinished = true;
        if (this$0.nextBanner.e()) {
            this$0.l();
            return;
        }
        this$0.k();
        if (this$0.nextBanner.getIsLoading()) {
            return;
        }
        this$0.i();
        this$0.a(this$0.appLifecycleTrigger, this$0.manualTrigger);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(final com.json.su this$0, com.json.cp[] triggers) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(triggers, "$triggers");
        this$0.isShowCountdownFinished = false;
        com.json.av avVar = this$0.taskScheduler;
        if (avVar != null) {
            avVar.c();
        }
        this$0.taskScheduler = new com.json.av(this$0.adTools, new java.lang.Runnable() { // from class: com.ironsource.su$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.json.su.b(this.f$0);
            }
        }, this$0.d(), kotlin.collections.ArraysKt.toList(triggers));
    }

    private final void a(final com.json.cp... triggers) {
        this.adTools.c(new java.lang.Runnable() { // from class: com.ironsource.su$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                com.json.su.a(this.f$0, triggers);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(com.json.su this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.j();
    }

    private final void i() {
        if (e()) {
            com.ironsource.su.a aVar = new com.ironsource.su.a(this, this.bannerAdUnitFactory, false);
            this.nextBanner = aVar;
            aVar.f();
        }
    }

    private final void j() {
        this.adTools.a(new java.lang.Runnable() { // from class: com.ironsource.su$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                com.json.su.a(this.f$0);
            }
        });
    }

    private final void k() {
        this.bannerStrategyListener.c(this.error);
        this.adUnitCallback = null;
        this.error = null;
    }

    private final void l() {
        this.isFirstShow = false;
        this.nextBanner.getBannerAdUnit().a(this.bannerContainer.getViewBinder(), this);
        this.bannerStrategyListener.a(this.nextBanner.b());
        com.ironsource.su.a aVar = this.currentBanner;
        if (aVar != null) {
            aVar.a();
        }
        this.currentBanner = this.nextBanner;
        i();
        a(this.viewVisibilityTrigger, this.appLifecycleTrigger, this.manualTrigger);
    }

    @Override // com.json.j2
    public void a(com.json.mediationsdk.logger.IronSourceError error) {
        this.nextBanner.a(false);
        this.error = error;
        if (this.isFirstShow) {
            k();
            a(this.appLifecycleTrigger, this.manualTrigger);
        } else if (this.isShowCountdownFinished) {
            k();
            i();
            a(this.appLifecycleTrigger, this.manualTrigger);
        }
    }

    @Override // com.json.v1
    public void b() {
        this.bannerStrategyListener.f();
    }

    @Override // com.json.v1
    public void b(com.json.mediationsdk.logger.IronSourceError error) {
        this.bannerStrategyListener.d(error);
    }

    @Override // com.json.f7
    public void c() {
        this.appLifecycleTrigger.e();
        this.viewVisibilityTrigger.e();
        com.json.av avVar = this.taskScheduler;
        if (avVar != null) {
            avVar.c();
        }
        this.taskScheduler = null;
        com.ironsource.su.a aVar = this.currentBanner;
        if (aVar != null) {
            aVar.a();
        }
        this.nextBanner.a();
    }

    @Override // com.json.j2
    public void c(com.json.q1 adUnitCallback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitCallback, "adUnitCallback");
        this.nextBanner.a(adUnitCallback);
        this.nextBanner.a(false);
        if (this.isShowCountdownFinished || this.isFirstShow) {
            l();
        }
    }

    @Override // com.json.f7
    public void f() {
        this.nextBanner.f();
    }

    @Override // com.json.f7
    public void g() {
        if (e()) {
            this.manualTrigger.e();
        }
    }

    @Override // com.json.f7
    public void h() {
        if (e()) {
            this.manualTrigger.f();
        }
    }
}
