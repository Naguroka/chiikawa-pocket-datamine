package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000\u009f\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0002\b&\u0018\u00002\u00020\u0001:\u0001\bB)\u0012\u0006\u0010K\u001a\u00020J\u0012\u0006\u0010\u001b\u001a\u00020\u0017\u0012\u0006\u00106\u001a\u000203\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u001c¢\u0006\u0004\bL\u0010MJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\b\u001a\u00020\u0007H$J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tJ\u0016\u0010\b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rJ\u0006\u0010\u000f\u001a\u00020\u0005J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0004J\b\u0010\u0015\u001a\u00020\u0014H\u0016J\u0012\u0010\b\u001a\u00020\u00122\b\u0010\u0016\u001a\u0004\u0018\u00010\u0012H\u0004R\u001a\u0010\u001b\u001a\u00020\u00178\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\b\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001dR\u001a\u0010#\u001a\u00020\u001f8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\"R$\u0010\n\u001a\u0004\u0018\u00010\t8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010$\u001a\u0004\b%\u0010&\"\u0004\b\u0015\u0010'R$\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b\b\u0010,R\u001a\u00101\u001a\u00020-8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0019\u0010.\u001a\u0004\b/\u00100R\"\u00106\u001a\u0010\u0012\f\u0012\n 4*\u0004\u0018\u00010303028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u00105R\u0018\u0010:\u001a\u0004\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0018\u0010>\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010A\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010@R\u0016\u0010D\u001a\u0004\u0018\u00010B8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b8\u0010CR\u0014\u0010F\u001a\u00020\u00128DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b<\u0010ER\u0014\u0010I\u001a\u00020G8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010H¨\u0006N"}, d2 = {"Lcom/ironsource/m1;", "", "com/ironsource/m1$b", "c", "()Lcom/ironsource/m1$b;", "", "m", "Lcom/ironsource/b0;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/ironsource/j2;", "loadListener", "Lcom/ironsource/g0;", "adInstancePresenter", "Lcom/ironsource/v1;", "displayListener", "d", "", com.json.mediationsdk.utils.IronSourceConstants.EVENTS_ERROR_CODE, "", "errorReason", "Lcom/ironsource/o1;", "b", com.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE, "Lcom/ironsource/t1;", "Lcom/ironsource/t1;", "f", "()Lcom/ironsource/t1;", "adUnitData", "Lcom/ironsource/ie;", "Lcom/ironsource/ie;", "taskScheduler", "Lcom/ironsource/t2;", "Lcom/ironsource/t2;", "g", "()Lcom/ironsource/t2;", "adUnitTools", "Lcom/ironsource/j2;", "k", "()Lcom/ironsource/j2;", "(Lcom/ironsource/j2;)V", "e", "Lcom/ironsource/v1;", "j", "()Lcom/ironsource/v1;", "(Lcom/ironsource/v1;)V", "Lcom/ironsource/rv;", "Lcom/ironsource/rv;", androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAM_TYPE_LIVE, "()Lcom/ironsource/rv;", com.json.mediationsdk.d.h, "Ljava/lang/ref/WeakReference;", "Lcom/ironsource/h2;", "kotlin.jvm.PlatformType", "Ljava/lang/ref/WeakReference;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/ironsource/fb;", androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_HLS, "Lcom/ironsource/fb;", "loadDuration", "Lcom/ironsource/qt$a;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT, "Lcom/ironsource/qt$a;", "expirationScheduledTask", "Lcom/ironsource/xb;", "Lcom/ironsource/xb;", "eventsWrapper", "Lcom/ironsource/mediationsdk/model/Placement;", "()Lcom/ironsource/mediationsdk/model/Placement;", "currentPlacement", "()Ljava/lang/String;", "currentPlacementName", "Lcom/ironsource/g1;", "()Lcom/ironsource/g1;", "adReadyStatus", "Lcom/ironsource/l1;", "adTools", "<init>", "(Lcom/ironsource/l1;Lcom/ironsource/t1;Lcom/ironsource/h2;Lcom/ironsource/ie;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public abstract class m1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final com.json.t1 adUnitData;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final com.json.ie taskScheduler;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final com.json.t2 adUnitTools;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private com.json.j2 loadListener;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private com.json.v1 displayListener;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final com.json.rv waterfall;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final java.lang.ref.WeakReference<com.json.h2> listener;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private com.json.fb loadDuration;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private com.ironsource.qt.a expirationScheduledTask;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final com.json.xb eventsWrapper;

    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0094\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"Lcom/ironsource/m1$a;", "Lcom/ironsource/c0;", "Lcom/ironsource/y;", com.json.j5.p, "", "b", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "<init>", "(Lcom/ironsource/m1;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    protected class a implements com.json.c0 {
        public a() {
        }

        @Override // com.json.c0
        public void a(com.json.y instance) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instance, "instance");
            com.json.m1.this.eventsWrapper.getAdInteraction().a(com.json.m1.this.i());
            com.json.h2 h2Var = (com.json.h2) com.json.m1.this.listener.get();
            if (h2Var != null) {
                h2Var.c();
            }
        }

        @Override // com.json.c0
        public void b(com.json.y instance) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instance, "instance");
            com.json.mediationsdk.logger.IronLog.INTERNAL.verbose(com.json.m1.this.a(instance.getInstanceSignature()));
            com.json.m1.this.getWaterfall().b(instance);
            com.json.m1.this.eventsWrapper.getAdInteraction().g(com.json.m1.this.i());
            com.json.m1.this.getAdUnitTools().m().b(com.json.m1.this.getAdUnitData().getAdProperties().getAdFormat());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u000b"}, d2 = {"com/ironsource/m1$b", "Lcom/ironsource/yv;", "Lcom/ironsource/y;", com.json.j5.p, "", "b", "", com.json.mediationsdk.utils.IronSourceConstants.EVENTS_ERROR_CODE, "", "errorReason", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class b implements com.json.yv {
        b() {
        }

        @Override // com.json.yv
        public void a(int errorCode, java.lang.String errorReason) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorReason, "errorReason");
            com.json.m1.this.a(errorCode, errorReason);
        }

        @Override // com.json.yv
        public void a(com.json.y instance) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instance, "instance");
            com.json.m1.this.getAdUnitTools().getEventSender().getAdInteraction().e(com.json.m1.this.i());
            com.json.j2 loadListener = com.json.m1.this.getLoadListener();
            if (loadListener != null) {
                loadListener.b(new com.json.q1(com.json.m1.this, instance.e()));
            }
            com.json.m1.this.m();
        }

        @Override // com.json.yv
        public void b(com.json.y instance) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instance, "instance");
            com.json.m1.this.eventsWrapper.getLoad().a(com.json.fb.a(com.json.m1.this.loadDuration), com.json.m1.this.getAdUnitData().getIsPublisherLoad());
            com.json.j2 loadListener = com.json.m1.this.getLoadListener();
            if (loadListener != null) {
                loadListener.c(new com.json.q1(com.json.m1.this, instance.e()));
            }
            com.json.m1.this.m();
        }
    }

    public m1(com.json.l1 adTools, com.json.t1 adUnitData, com.json.h2 listener, com.json.ie taskScheduler) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adTools, "adTools");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "listener");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taskScheduler, "taskScheduler");
        this.adUnitData = adUnitData;
        this.taskScheduler = taskScheduler;
        com.json.t2 t2Var = new com.json.t2(adTools, adUnitData, com.ironsource.b2.b.MEDIATION);
        this.adUnitTools = t2Var;
        this.waterfall = new com.json.rv(t2Var, adUnitData, c());
        this.listener = new java.lang.ref.WeakReference<>(listener);
        this.eventsWrapper = t2Var.getEventSender();
        com.json.mediationsdk.logger.IronLog.INTERNAL.verbose("adFormat = " + adUnitData.getAdProperties().getAdFormat() + ", adUnitId = " + adUnitData.getAdProperties().getAdUnitId());
    }

    public /* synthetic */ m1(com.json.l1 l1Var, com.json.t1 t1Var, com.json.h2 h2Var, com.json.ie ieVar, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(l1Var, t1Var, h2Var, (i & 8) != 0 ? new com.json.ie(com.json.Handler.a(l1Var.a())) : ieVar);
    }

    private final com.ironsource.m1.b c() {
        return new com.ironsource.m1.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(com.json.m1 this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        com.json.j2 j2Var = this$0.loadListener;
        if (j2Var != null) {
            j2Var.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m() {
        com.json.mediationsdk.logger.IronLog.INTERNAL.verbose(a("starting expiration scheduled task"));
        com.ironsource.qt.a aVar = this.expirationScheduledTask;
        if (aVar != null) {
            aVar.a();
        }
        long jB = this.adUnitTools.b(this.adUnitData.getAdProperties().c());
        com.json.ie ieVar = this.taskScheduler;
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.ironsource.m1$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.json.m1.e(this.f$0);
            }
        };
        kotlin.time.Duration.Companion companion = kotlin.time.Duration.INSTANCE;
        this.expirationScheduledTask = ieVar.a(runnable, kotlin.time.DurationKt.toDuration(jB, kotlin.time.DurationUnit.MILLISECONDS));
    }

    protected abstract com.json.b0 a();

    protected final java.lang.String a(java.lang.String message) {
        return com.json.l1.a(this.adUnitTools, message, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    protected final void a(int errorCode, java.lang.String errorReason) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorReason, "errorReason");
        com.json.mediationsdk.logger.IronLog.INTERNAL.verbose(a("errorCode = " + errorCode + ", errorReason = " + errorReason));
        this.eventsWrapper.getLoad().a(com.json.fb.a(this.loadDuration), errorCode, errorReason, this.adUnitData.getIsPublisherLoad());
        com.json.j2 j2Var = this.loadListener;
        if (j2Var != null) {
            j2Var.a(new com.json.mediationsdk.logger.IronSourceError(errorCode, errorReason));
        }
    }

    public final void a(com.json.g0 adInstancePresenter, com.json.v1 displayListener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInstancePresenter, "adInstancePresenter");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(displayListener, "displayListener");
        this.displayListener = displayListener;
        com.ironsource.qt.a aVar = this.expirationScheduledTask;
        if (aVar != null) {
            aVar.a();
        }
        this.waterfall.a(adInstancePresenter);
    }

    public final void a(com.json.j2 loadListener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loadListener, "loadListener");
        com.json.mediationsdk.logger.IronLog.INTERNAL.verbose(com.json.l1.a(this.adUnitTools, (java.lang.String) null, (java.lang.String) null, 3, (java.lang.Object) null));
        this.adUnitTools.a(b());
        this.loadListener = loadListener;
        this.eventsWrapper.a(this.adUnitData.getIsPublisherLoad());
        this.loadDuration = new com.json.fb();
        this.waterfall.a(a());
    }

    protected final void a(com.json.v1 v1Var) {
        this.displayListener = v1Var;
    }

    public com.json.o1 b() {
        return new com.json.o1(this.adUnitData.getAdProperties());
    }

    protected final void b(com.json.j2 j2Var) {
        this.loadListener = j2Var;
    }

    public final void d() {
        com.json.mediationsdk.logger.IronLog.INTERNAL.verbose(com.json.l1.a(this.adUnitTools, (java.lang.String) null, (java.lang.String) null, 3, (java.lang.Object) null));
        this.waterfall.a();
    }

    public com.json.g1 e() {
        return this.waterfall.c() ? com.ironsource.g1.b.f2669a : new com.ironsource.g1.a(null, 1, null);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    protected final com.json.t1 getAdUnitData() {
        return this.adUnitData;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    protected final com.json.t2 getAdUnitTools() {
        return this.adUnitTools;
    }

    protected final com.json.mediationsdk.model.Placement h() {
        return this.adUnitData.getAdProperties().getPlacement();
    }

    protected final java.lang.String i() {
        return this.adUnitData.l();
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    protected final com.json.v1 getDisplayListener() {
        return this.displayListener;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    protected final com.json.j2 getLoadListener() {
        return this.loadListener;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    protected final com.json.rv getWaterfall() {
        return this.waterfall;
    }
}
