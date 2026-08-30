package com.google.ads.mediation.line;

/* JADX INFO: compiled from: LineSdkFactory.kt */
/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000;\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0014\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002¢\u0006\u0002\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u0019\u0010\n\u001a\u00020\u000bX\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0018"}, d2 = {"Lcom/google/ads/mediation/line/LineSdkFactory;", "", "()V", "BACKGROUND_EXECUTOR", "Ljava/util/concurrent/ThreadPoolExecutor;", "getBACKGROUND_EXECUTOR$line_release", "()Ljava/util/concurrent/ThreadPoolExecutor;", "MAX_NUMBER_GENERIC_WORKERS", "", "MIN_NUMBER_GENERIC_WORKERS", "THREAD_KEEP_ALIVE_TIME", "Lkotlin/time/Duration;", "J", "delegate", "Lcom/google/ads/mediation/line/SdkFactory;", "getDelegate$line_release", "()Lcom/google/ads/mediation/line/SdkFactory;", "setDelegate$line_release", "(Lcom/google/ads/mediation/line/SdkFactory;)V", "newThreadFactory", "com/google/ads/mediation/line/LineSdkFactory$newThreadFactory$1", "poolName", "", "(Ljava/lang/String;)Lcom/google/ads/mediation/line/LineSdkFactory$newThreadFactory$1;", "line_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class LineSdkFactory {
    private static final java.util.concurrent.ThreadPoolExecutor BACKGROUND_EXECUTOR;
    public static final com.google.ads.mediation.line.LineSdkFactory INSTANCE;
    private static final int MAX_NUMBER_GENERIC_WORKERS = Integer.MAX_VALUE;
    private static final int MIN_NUMBER_GENERIC_WORKERS = 2;
    private static final long THREAD_KEEP_ALIVE_TIME;
    private static com.google.ads.mediation.line.SdkFactory delegate;

    private LineSdkFactory() {
    }

    static {
        com.google.ads.mediation.line.LineSdkFactory lineSdkFactory = new com.google.ads.mediation.line.LineSdkFactory();
        INSTANCE = lineSdkFactory;
        kotlin.time.Duration.Companion companion = kotlin.time.Duration.INSTANCE;
        long duration = kotlin.time.DurationKt.toDuration(10, kotlin.time.DurationUnit.SECONDS);
        THREAD_KEEP_ALIVE_TIME = duration;
        delegate = new com.google.ads.mediation.line.SdkFactory() { // from class: com.google.ads.mediation.line.LineSdkFactory$delegate$1
            @Override // com.google.ads.mediation.line.SdkFactory
            public com.five_corp.ad.FiveAdConfig createFiveAdConfig(java.lang.String appId) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appId, "appId");
                return new com.five_corp.ad.FiveAdConfig(appId);
            }

            @Override // com.google.ads.mediation.line.SdkFactory
            public com.five_corp.ad.FiveAdCustomLayout createFiveAdCustomLayout(android.content.Context context, java.lang.String slotId, int width) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(slotId, "slotId");
                return new com.five_corp.ad.FiveAdCustomLayout(context, slotId, width);
            }

            @Override // com.google.ads.mediation.line.SdkFactory
            public com.five_corp.ad.FiveAdInterstitial createFiveAdInterstitial(android.app.Activity activity, java.lang.String slotId) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(slotId, "slotId");
                return new com.five_corp.ad.FiveAdInterstitial(activity, slotId);
            }

            @Override // com.google.ads.mediation.line.SdkFactory
            public com.five_corp.ad.FiveAdVideoReward createFiveVideoRewarded(android.app.Activity activity, java.lang.String slotId) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(slotId, "slotId");
                return new com.five_corp.ad.FiveAdVideoReward(activity, slotId);
            }

            @Override // com.google.ads.mediation.line.SdkFactory
            public com.five_corp.ad.FiveAdNative createFiveAdNative(android.content.Context context, java.lang.String slotId) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(slotId, "slotId");
                return new com.five_corp.ad.FiveAdNative(context, slotId);
            }
        };
        BACKGROUND_EXECUTOR = new java.util.concurrent.ThreadPoolExecutor(2, Integer.MAX_VALUE, kotlin.time.Duration.m2649getInWholeSecondsimpl(duration), java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.LinkedBlockingQueue(), lineSdkFactory.newThreadFactory("BG"));
    }

    public final com.google.ads.mediation.line.SdkFactory getDelegate$line_release() {
        return delegate;
    }

    public final void setDelegate$line_release(com.google.ads.mediation.line.SdkFactory sdkFactory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkFactory, "<set-?>");
        delegate = sdkFactory;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.ads.mediation.line.LineSdkFactory$newThreadFactory$1] */
    private final com.google.ads.mediation.line.LineSdkFactory.AnonymousClass1 newThreadFactory(final java.lang.String poolName) {
        return new java.util.concurrent.ThreadFactory() { // from class: com.google.ads.mediation.line.LineSdkFactory.newThreadFactory.1
            private final java.util.concurrent.atomic.AtomicInteger threadId = new java.util.concurrent.atomic.AtomicInteger(1);

            @Override // java.util.concurrent.ThreadFactory
            public java.lang.Thread newThread(java.lang.Runnable runnable) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(runnable, "runnable");
                return new java.lang.Thread(runnable, "GMA-Mediation(" + poolName + ") " + this.threadId.getAndIncrement());
            }
        };
    }

    public final java.util.concurrent.ThreadPoolExecutor getBACKGROUND_EXECUTOR$line_release() {
        return BACKGROUND_EXECUTOR;
    }
}
