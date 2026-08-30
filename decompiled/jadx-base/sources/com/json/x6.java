package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\u0006\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b \u0010!J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\b\u001a\u00020\u0004H\u0002J\u0006\u0010\t\u001a\u00020\u0004J\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\n\u001a\u00020\u0004J\u0006\u0010\u0007\u001a\u00020\u0004R\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\fR\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0012\u0010\u0018R\u001b\u0010\u001a\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001c¨\u0006\""}, d2 = {"Lcom/ironsource/x6;", "", "", "delay", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "f", "b", "g", androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_HLS, "e", "Lcom/ironsource/l2;", "Lcom/ironsource/l2;", "loadingData", "Lcom/ironsource/f2;", "Lcom/ironsource/f2;", "interactionData", "Lcom/ironsource/c6;", "c", "Lcom/ironsource/c6;", "mListener", "Lcom/ironsource/sl;", "d", "Lkotlin/Lazy;", "()Lcom/ironsource/sl;", "mBindLifecycleAwareTimer", "mImpressionTimeoutLifecycleAwareTimer", "", "Z", "isBannerReloadIntervalEnabled", "isBannerImpressionTimeoutEnabled", "isLoadOnShowLoadingMode", "<init>", "(Lcom/ironsource/l2;Lcom/ironsource/f2;Lcom/ironsource/c6;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class x6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final com.json.l2 loadingData;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final com.json.f2 interactionData;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final com.json.c6 mListener;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final kotlin.Lazy mBindLifecycleAwareTimer;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final kotlin.Lazy mImpressionTimeoutLifecycleAwareTimer;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final boolean isBannerReloadIntervalEnabled;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final boolean isBannerImpressionTimeoutEnabled;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final boolean isLoadOnShowLoadingMode;

    @kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/ironsource/sl;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Lcom/ironsource/sl;"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<com.json.sl> {
        a() {
            super(0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(com.json.x6 this$0) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.mListener.e();
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.json.sl invoke() {
            final com.json.x6 x6Var = com.json.x6.this;
            return new com.json.sl(new java.lang.Runnable() { // from class: com.ironsource.x6$a$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    com.ironsource.x6.a.a(x6Var);
                }
            }, com.json.lifecycle.b.d(), new com.json.uu());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/ironsource/sl;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Lcom/ironsource/sl;"}, k = 3, mv = {1, 8, 0})
    static final class b extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<com.json.sl> {
        b() {
            super(0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(com.json.x6 this$0) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.mListener.f();
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.json.sl invoke() {
            final com.json.x6 x6Var = com.json.x6.this;
            return new com.json.sl(new java.lang.Runnable() { // from class: com.ironsource.x6$b$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    com.ironsource.x6.b.a(x6Var);
                }
            }, com.json.lifecycle.b.d(), new com.json.uu());
        }
    }

    public x6(com.json.l2 loadingData, com.json.f2 interactionData, com.json.c6 mListener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loadingData, "loadingData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(interactionData, "interactionData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mListener, "mListener");
        this.loadingData = loadingData;
        this.interactionData = interactionData;
        this.mListener = mListener;
        this.mBindLifecycleAwareTimer = kotlin.LazyKt.lazy(new com.ironsource.x6.a());
        this.mImpressionTimeoutLifecycleAwareTimer = kotlin.LazyKt.lazy(new com.ironsource.x6.b());
        this.isBannerReloadIntervalEnabled = loadingData.b() > 0;
        this.isBannerImpressionTimeoutEnabled = interactionData.b() > 0;
        this.isLoadOnShowLoadingMode = loadingData.a() == com.ironsource.l2.a.MANUAL_WITH_LOAD_ON_SHOW;
    }

    private final void a(long delay) {
        if (this.isLoadOnShowLoadingMode && this.isBannerReloadIntervalEnabled) {
            c().a(delay);
        }
    }

    private final void b(long delay) {
        if (this.isLoadOnShowLoadingMode && this.isBannerImpressionTimeoutEnabled) {
            d().a(delay);
        }
    }

    private final com.json.sl c() {
        return (com.json.sl) this.mBindLifecycleAwareTimer.getValue();
    }

    private final com.json.sl d() {
        return (com.json.sl) this.mImpressionTimeoutLifecycleAwareTimer.getValue();
    }

    private final void f() {
        if (this.isLoadOnShowLoadingMode) {
            c().b();
        }
    }

    private final void g() {
        if (this.isLoadOnShowLoadingMode) {
            d().b();
        }
    }

    public final void a() {
        com.json.mediationsdk.logger.IronLog.INTERNAL.verbose();
        f();
    }

    public final void b() {
        com.json.mediationsdk.logger.IronLog.INTERNAL.verbose();
        g();
    }

    public final void e() {
        com.json.mediationsdk.logger.IronLog.INTERNAL.verbose();
        b(this.interactionData.b());
    }

    public final void h() {
        if (!this.isBannerReloadIntervalEnabled) {
            com.json.mediationsdk.logger.IronLog.INTERNAL.verbose("banner reload interval is disabled");
        } else {
            com.json.mediationsdk.logger.IronLog.INTERNAL.verbose();
            a(this.loadingData.b());
        }
    }
}
