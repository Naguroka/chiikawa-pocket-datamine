package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\tBk\u0012\u0006\u0010 \u001a\u00020\u001e\u0012\u0006\u0010#\u001a\u00020!\u0012\u0006\u0010'\u001a\u00020$\u0012\u0006\u0010*\u001a\u00020(\u0012\n\b\u0002\u0010K\u001a\u0004\u0018\u00010\n\u0012\"\b\u0002\u0010.\u001a\u001c\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\b\u0018\u00010+j\u0004\u0018\u0001`,\u0012\b\b\u0002\u00101\u001a\u00020/\u0012\b\b\u0002\u00105\u001a\u000202¢\u0006\u0004\bL\u0010MJ\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0001H\u0002J\u0012\u0010\t\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002J\b\u0010\t\u001a\u00020\rH\u0002J\b\u0010\u000e\u001a\u00020\u0003H\u0002J\b\u0010\u000f\u001a\u00020\u0003H\u0002J\u000e\u0010\t\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0010J\u0016\u0010\t\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014J\u0010\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0016H\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\bH\u0016J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016J\u0010\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\bH\u0016J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0016H\u0016R\u0014\u0010 \u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001fR\u0014\u0010#\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\"R\u0014\u0010'\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010*\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010)R.\u0010.\u001a\u001c\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\b\u0018\u00010+j\u0004\u0018\u0001`,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010-R\u0014\u00101\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u00100R\u0014\u00105\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010<\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0018\u0010@\u001a\u0004\u0018\u00010=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0018\u0010D\u001a\u0004\u0018\u00010A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010G\u001a\u00020E8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010FR\u0014\u0010J\u001a\u00020H8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b%\u0010I¨\u0006N"}, d2 = {"Lcom/ironsource/md;", "Lcom/ironsource/gd;", "Lcom/ironsource/nl;", "", "d", "Lcom/ironsource/z;", "data", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/ironsource/fd;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/ironsource/sv;", "factory", "Lcom/ironsource/rv;", "Lcom/ironsource/yv;", "e", "f", "Lcom/ironsource/md$a;", "loadListener", "Landroid/app/Activity;", "activity", "Lcom/ironsource/v1;", "displayListener", "Lcom/ironsource/y;", com.json.j5.p, "b", "fullscreenInstance", "Lcom/ironsource/mediationsdk/logger/IronSourceError;", "error", "Lcom/unity3d/mediation/rewarded/LevelPlayReward;", com.json.s.j, "Lcom/ironsource/im;", "Lcom/ironsource/im;", "mediationServices", "Lcom/ironsource/t2;", "Lcom/ironsource/t2;", "adUnitTools", "Lcom/ironsource/t1;", "c", "Lcom/ironsource/t1;", "adUnitData", "Lcom/ironsource/pd;", "Lcom/ironsource/pd;", "fullscreenListener", "Lkotlin/Function2;", "Lcom/unity3d/mediation/internal/ads/controllers/adunits/FullscreenAdInstanceFactory;", "Lkotlin/jvm/functions/Function2;", "fullscreenAdInstanceFactory", "Lcom/ironsource/qt;", "Lcom/ironsource/qt;", "taskScheduler", "Lcom/ironsource/n9;", "g", "Lcom/ironsource/n9;", "currentTimeProvider", androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_HLS, "Lcom/ironsource/md$a;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT, "Lcom/ironsource/v1;", "j", "Lcom/ironsource/rv;", com.json.mediationsdk.d.h, "Lcom/ironsource/qt$a;", "k", "Lcom/ironsource/qt$a;", "expirationScheduledTask", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAM_TYPE_LIVE, "Ljava/lang/Long;", com.ironsource.y8.h.y0, "Lcom/unity3d/mediation/LevelPlay$AdFormat;", "()Lcom/unity3d/mediation/LevelPlay$AdFormat;", com.json.mediationsdk.impressionData.ImpressionData.IMPRESSION_DATA_KEY_AD_FORMAT, "", "()Ljava/lang/String;", "currentPlacementName", "waterfallFactory", "<init>", "(Lcom/ironsource/im;Lcom/ironsource/t2;Lcom/ironsource/t1;Lcom/ironsource/pd;Lcom/ironsource/sv;Lkotlin/jvm/functions/Function2;Lcom/ironsource/qt;Lcom/ironsource/n9;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class md implements com.json.gd {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final com.json.im mediationServices;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final com.json.t2 adUnitTools;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final com.json.t1 adUnitData;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final com.json.pd fullscreenListener;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function2<com.json.z, com.json.gd, com.json.fd> fullscreenAdInstanceFactory;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final com.json.qt taskScheduler;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final com.json.n9 currentTimeProvider;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private com.ironsource.md.a loadListener;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private com.json.v1 displayListener;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final com.json.rv waterfall;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private com.ironsource.qt.a expirationScheduledTask;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private java.lang.Long loadStartTime;

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0012\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\b\u001a\u00020\u0004H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Lcom/ironsource/md$a;", "", "Lcom/unity3d/mediation/LevelPlayAdInfo;", "adInfo", "", "b", "Lcom/ironsource/mediationsdk/logger/IronSourceError;", "error", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public interface a {
        void a();

        void a(com.json.mediationsdk.logger.IronSourceError error);

        void a(com.unity3d.mediation.LevelPlayAdInfo adInfo);

        void b(com.unity3d.mediation.LevelPlayAdInfo adInfo);
    }

    @kotlin.Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u000b"}, d2 = {"com/ironsource/md$b", "Lcom/ironsource/yv;", "Lcom/ironsource/y;", com.json.j5.p, "", "b", "", com.json.mediationsdk.utils.IronSourceConstants.EVENTS_ERROR_CODE, "", "errorReason", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class b implements com.json.yv {
        b() {
        }

        @Override // com.json.yv
        public void a(int errorCode, java.lang.String errorReason) {
            java.lang.Long lValueOf;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorReason, "errorReason");
            java.lang.Long l = com.json.md.this.loadStartTime;
            if (l != null) {
                lValueOf = java.lang.Long.valueOf(com.json.md.this.currentTimeProvider.a() - l.longValue());
            } else {
                lValueOf = null;
            }
            com.json.md.this.adUnitTools.getEventSender().getLoad().a(lValueOf != null ? lValueOf.longValue() : 0L, errorCode, errorReason, com.json.md.this.adUnitData.getIsPublisherLoad());
            com.ironsource.md.a aVar = com.json.md.this.loadListener;
            if (aVar != null) {
                aVar.a(new com.json.mediationsdk.logger.IronSourceError(errorCode, errorReason));
            }
        }

        @Override // com.json.yv
        public void a(com.json.y instance) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instance, "instance");
            com.json.md.this.adUnitTools.getEventSender().getAdInteraction().e(com.json.md.this.c());
            com.json.md.this.e();
            com.ironsource.md.a aVar = com.json.md.this.loadListener;
            if (aVar != null) {
                aVar.a(instance.e());
            }
        }

        @Override // com.json.yv
        public void b(com.json.y instance) {
            java.lang.Long lValueOf;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instance, "instance");
            java.lang.Long l = com.json.md.this.loadStartTime;
            if (l != null) {
                lValueOf = java.lang.Long.valueOf(com.json.md.this.currentTimeProvider.a() - l.longValue());
            } else {
                lValueOf = null;
            }
            com.json.md.this.adUnitTools.getEventSender().getLoad().a(lValueOf != null ? lValueOf.longValue() : 0L, com.json.md.this.adUnitData.getIsPublisherLoad());
            com.json.md.this.e();
            com.ironsource.md.a aVar = com.json.md.this.loadListener;
            if (aVar != null) {
                aVar.b(instance.e());
            }
        }
    }

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* synthetic */ class c extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function2<com.json.z, com.json.gd, com.json.fd> {
        c(java.lang.Object obj) {
            super(2, obj, com.json.md.class, "createAdInstance", "createAdInstance(Lcom/unity3d/mediation/internal/ads/controllers/adunits/adinstances/AdInstanceData;Lcom/unity3d/mediation/internal/ads/controllers/adunits/adinstances/listeners/FullscreenAdInstanceListener;)Lcom/unity3d/mediation/internal/ads/controllers/adunits/adinstances/FullscreenAdInstance;", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.json.fd invoke(com.json.z p0, com.json.gd p1) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "p0");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "p1");
            return ((com.json.md) this.receiver).a(p0, p1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public md(com.json.im mediationServices, com.json.t2 adUnitTools, com.json.t1 adUnitData, com.json.pd fullscreenListener, com.json.sv svVar, kotlin.jvm.functions.Function2<? super com.json.z, ? super com.json.gd, com.json.fd> function2, com.json.qt taskScheduler, com.json.n9 currentTimeProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mediationServices, "mediationServices");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitTools, "adUnitTools");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fullscreenListener, "fullscreenListener");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taskScheduler, "taskScheduler");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
        this.mediationServices = mediationServices;
        this.adUnitTools = adUnitTools;
        this.adUnitData = adUnitData;
        this.fullscreenListener = fullscreenListener;
        this.fullscreenAdInstanceFactory = function2;
        this.taskScheduler = taskScheduler;
        this.currentTimeProvider = currentTimeProvider;
        this.waterfall = a(svVar);
    }

    public /* synthetic */ md(com.json.im imVar, com.json.t2 t2Var, com.json.t1 t1Var, com.json.pd pdVar, com.json.sv svVar, kotlin.jvm.functions.Function2 function2, com.json.qt qtVar, com.json.n9 n9Var, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(imVar, t2Var, t1Var, pdVar, (i & 16) != 0 ? null : svVar, (i & 32) != 0 ? null : function2, (i & 64) != 0 ? new com.json.ie(com.json.Handler.a(t2Var.a())) : qtVar, (i & 128) != 0 ? new com.ironsource.n9.a() : n9Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.json.fd a(com.json.z data, com.json.gd listener) {
        return new com.json.fd(new com.json.t2(this.adUnitTools, com.ironsource.b2.b.PROVIDER), data, listener);
    }

    private final com.json.rv a(com.json.sv factory) {
        com.json.yv yvVarA = a();
        return factory != null ? factory.a(yvVarA) : new com.json.rv(this.adUnitTools, this.adUnitData, yvVarA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.json.y a(com.json.md this$0, com.json.z instanceData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instanceData, "instanceData");
        kotlin.jvm.functions.Function2 cVar = this$0.fullscreenAdInstanceFactory;
        if (cVar == null) {
            cVar = new com.ironsource.md.c(this$0);
        }
        return (com.json.y) cVar.invoke(instanceData, this$0);
    }

    private final com.json.yv a() {
        return new com.ironsource.md.b();
    }

    private final com.unity3d.mediation.LevelPlay.AdFormat b() {
        return this.adUnitData.getAdProperties().c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.String c() {
        return this.adUnitData.l();
    }

    private final com.json.nl<kotlin.Unit> d() {
        if (!this.waterfall.c()) {
            return new com.ironsource.nl.a(new com.json.mediationsdk.logger.IronSourceError(509, "show called while ad unit is not ready to show"));
        }
        if (this.mediationServices.y().a(c(), b()).d()) {
            return new com.ironsource.nl.a(new com.json.mediationsdk.logger.IronSourceError(com.json.mediationsdk.logger.IronSourceError.ERROR_PLACEMENT_CAPPED, "placement " + c() + " is capped"));
        }
        return this.mediationServices.u().a(this.adUnitData.getAdProperties().getAdUnitId()).d() ? new com.ironsource.nl.a(new com.json.mediationsdk.logger.IronSourceError(com.json.mediationsdk.logger.IronSourceError.ERROR_AD_UNIT_CAPPED, "adUnitId " + this.adUnitData.getAdProperties().getAdUnitId() + " is capped")) : new com.ironsource.nl.b(kotlin.Unit.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e() {
        com.ironsource.qt.a aVar = this.expirationScheduledTask;
        if (aVar != null) {
            aVar.a();
        }
        long jB = this.adUnitTools.b(b());
        com.json.qt qtVar = this.taskScheduler;
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.ironsource.md$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                com.json.md.h(this.f$0);
            }
        };
        kotlin.time.Duration.Companion companion = kotlin.time.Duration.INSTANCE;
        this.expirationScheduledTask = qtVar.a(runnable, kotlin.time.DurationKt.toDuration(jB, kotlin.time.DurationUnit.MILLISECONDS));
    }

    private final void f() {
        java.lang.String strC = c();
        if (strC.length() > 0) {
            this.mediationServices.a().b(strC, b());
            com.json.i8 i8VarA = this.mediationServices.y().a(strC, b());
            if (i8VarA.d()) {
                this.adUnitTools.getEventSender().getAdInteraction().b(strC, i8VarA.e());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(com.json.md this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        com.ironsource.md.a aVar = this$0.loadListener;
        if (aVar != null) {
            aVar.a();
        }
        this$0.waterfall.b();
    }

    public final void a(android.app.Activity activity, com.json.v1 displayListener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(displayListener, "displayListener");
        com.json.mediationsdk.logger.IronLog ironLog = com.json.mediationsdk.logger.IronLog.INTERNAL;
        ironLog.verbose(com.json.l1.a(this.adUnitTools, (java.lang.String) null, (java.lang.String) null, 3, (java.lang.Object) null));
        this.displayListener = displayListener;
        this.adUnitTools.getEventSender().getAdInteraction().a(activity, c());
        com.json.nl<kotlin.Unit> nlVarD = d();
        if (nlVarD instanceof com.ironsource.nl.a) {
            com.json.mediationsdk.logger.IronSourceError ironSourceErrorB = ((com.ironsource.nl.a) nlVarD).b();
            ironLog.verbose(com.json.l1.a(this.adUnitTools, ironSourceErrorB.getErrorMessage(), (java.lang.String) null, 2, (java.lang.Object) null));
            this.adUnitTools.getEventSender().getAdInteraction().a(c(), ironSourceErrorB.getErrorCode(), ironSourceErrorB.getErrorMessage(), "");
            displayListener.b(ironSourceErrorB);
            return;
        }
        com.ironsource.qt.a aVar = this.expirationScheduledTask;
        if (aVar != null) {
            aVar.a();
        }
        this.waterfall.a(new com.json.hd(activity));
    }

    @Override // com.json.gd
    public void a(com.json.fd fullscreenInstance) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fullscreenInstance, "fullscreenInstance");
        this.adUnitTools.getEventSender().getAdInteraction().l(c());
        com.json.v1 v1Var = this.displayListener;
        if (v1Var != null) {
            v1Var.b();
        }
        f();
        this.mediationServices.w().b(this.adUnitData.getAdProperties().getAdUnitId());
    }

    @Override // com.json.gd
    public void a(com.json.fd fullscreenInstance, com.json.mediationsdk.logger.IronSourceError error) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fullscreenInstance, "fullscreenInstance");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "error");
        com.json.mediationsdk.logger.IronLog.INTERNAL.verbose(com.json.l1.a(this.adUnitTools, error.toString(), (java.lang.String) null, 2, (java.lang.Object) null));
        this.adUnitTools.getEventSender().getAdInteraction().a(c(), error.getErrorCode(), error.getErrorMessage(), "");
        com.json.v1 v1Var = this.displayListener;
        if (v1Var != null) {
            v1Var.b(error);
        }
    }

    @Override // com.json.gd
    public void a(com.json.fd fullscreenInstance, com.unity3d.mediation.rewarded.LevelPlayReward reward) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fullscreenInstance, "fullscreenInstance");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reward, "reward");
        com.json.mediationsdk.logger.IronLog.INTERNAL.verbose(com.json.l1.a(this.adUnitTools, fullscreenInstance.getInstanceSignature(), (java.lang.String) null, 2, (java.lang.Object) null));
        this.fullscreenListener.a(reward);
    }

    public final void a(com.ironsource.md.a loadListener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loadListener, "loadListener");
        com.json.mediationsdk.logger.IronLog.INTERNAL.verbose(com.json.l1.a(this.adUnitTools, (java.lang.String) null, (java.lang.String) null, 3, (java.lang.Object) null));
        this.loadListener = loadListener;
        this.loadStartTime = java.lang.Long.valueOf(this.currentTimeProvider.a());
        this.adUnitTools.a(new com.json.o1(this.adUnitData.getAdProperties()));
        com.json.b0 b0Var = new com.json.b0() { // from class: com.ironsource.md$$ExternalSyntheticLambda0
            @Override // com.json.b0
            public final com.json.y a(com.json.z zVar) {
                return com.json.md.a(this.f$0, zVar);
            }
        };
        this.adUnitTools.getEventSender().getLoad().a(this.adUnitData.getIsPublisherLoad());
        this.waterfall.a(b0Var);
    }

    @Override // com.json.c0
    public void a(com.json.y instance) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instance, "instance");
        this.adUnitTools.getEventSender().getAdInteraction().a(c());
        this.fullscreenListener.c();
    }

    @Override // com.json.gd
    public void b(com.json.fd fullscreenInstance) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fullscreenInstance, "fullscreenInstance");
        this.adUnitTools.getEventSender().getAdInteraction().b(c());
        this.fullscreenListener.onClosed();
    }

    @Override // com.json.c0
    public void b(com.json.y instance) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instance, "instance");
        this.waterfall.b(instance);
        this.adUnitTools.getEventSender().getAdInteraction().g(c());
        this.mediationServices.e().b(com.unity3d.mediation.a.a(b()));
    }
}
