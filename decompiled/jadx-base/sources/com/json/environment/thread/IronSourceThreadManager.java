package com.json.environment.thread;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b6\u00107J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0006\u0010\u0007\u001a\u00020\u0006J$\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\nJ\u001a\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0007J\u000e\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0002J\u001a\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0007J\u000e\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0002J\u001a\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0007J\u000e\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0002J\u001a\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0007R\"\u0010\u001c\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0017\u0010$\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b!\u0010\u001f\u001a\u0004\b\"\u0010#R\u0014\u0010(\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010*\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010'R\u0014\u0010,\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010'R\u001b\u00101\u001a\u00020-8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b\u0005\u00100R\u001b\u00105\u001a\u00020%8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b2\u0010/\u001a\u0004\b3\u00104¨\u00068"}, d2 = {"Lcom/ironsource/environment/thread/IronSourceThreadManager;", "", "Ljava/lang/Runnable;", "action", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/util/concurrent/ThreadPoolExecutor;", "getThreadPoolExecutor", "shouldExecuteAsync", "shouldWaitUntilAllOperationsCompleted", "", "tasks", "", "executeTasks", "", "delay", "postOnUiThreadTask", "removeUiThreadTask", "postMediationBackgroundTask", "removeMediationBackgroundTask", "postAdapterBackgroundTask", "removeAdapterBackgroundTask", "postPublisherCallback", "Z", "getUseSharedExecutorService", "()Z", "setUseSharedExecutorService", "(Z)V", "useSharedExecutorService", "Landroid/os/Handler;", "b", "Landroid/os/Handler;", "uiHandler", "c", "getInitHandler", "()Landroid/os/Handler;", "initHandler", "Lcom/ironsource/tj;", "d", "Lcom/ironsource/tj;", "mediationBackgroundHandler", "e", "adapterBackgroundHandler", "f", "publisherCallbackHandler", "Lcom/ironsource/er;", "g", "Lkotlin/Lazy;", "()Lcom/ironsource/er;", "executorService", androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_HLS, "getSharedManagersThread", "()Lcom/ironsource/tj;", "sharedManagersThread", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class IronSourceThreadManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private static boolean useSharedExecutorService;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static final android.os.Handler initHandler;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private static final com.json.tj mediationBackgroundHandler;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private static final com.json.tj adapterBackgroundHandler;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private static final com.json.tj publisherCallbackHandler;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private static final kotlin.Lazy executorService;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private static final kotlin.Lazy sharedManagersThread;
    public static final com.json.environment.thread.IronSourceThreadManager INSTANCE = new com.json.environment.thread.IronSourceThreadManager();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final android.os.Handler uiHandler = new android.os.Handler(android.os.Looper.getMainLooper());

    @kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/ironsource/er;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Lcom/ironsource/er;"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<com.json.er> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final com.ironsource.environment.thread.IronSourceThreadManager.a f2626a = new com.ironsource.environment.thread.IronSourceThreadManager.a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.json.er invoke() {
            return new com.json.er(0, null, null, 7, null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/ironsource/tj;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Lcom/ironsource/tj;"}, k = 3, mv = {1, 8, 0})
    static final class b extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<com.json.tj> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final com.ironsource.environment.thread.IronSourceThreadManager.b f2627a = new com.ironsource.environment.thread.IronSourceThreadManager.b();

        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.json.tj invoke() {
            com.json.tj tjVar = new com.json.tj("managersThread");
            tjVar.start();
            tjVar.a();
            return tjVar;
        }
    }

    static {
        android.os.HandlerThread handlerThread = new android.os.HandlerThread("IronSourceInitiatorHandler");
        handlerThread.start();
        initHandler = new android.os.Handler(handlerThread.getLooper());
        com.json.tj tjVar = new com.json.tj("mediationBackground");
        tjVar.start();
        tjVar.a();
        mediationBackgroundHandler = tjVar;
        com.json.tj tjVar2 = new com.json.tj("adapterBackground");
        tjVar2.start();
        tjVar2.a();
        adapterBackgroundHandler = tjVar2;
        com.json.tj tjVar3 = new com.json.tj("publisher-callbacks");
        tjVar3.start();
        tjVar3.a();
        publisherCallbackHandler = tjVar3;
        executorService = kotlin.LazyKt.lazy(com.ironsource.environment.thread.IronSourceThreadManager.a.f2626a);
        sharedManagersThread = kotlin.LazyKt.lazy(com.ironsource.environment.thread.IronSourceThreadManager.b.f2627a);
    }

    private IronSourceThreadManager() {
    }

    private final com.json.er a() {
        return (com.json.er) executorService.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(java.lang.Runnable it, final java.util.concurrent.CountDownLatch latch) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "$it");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(latch, "$latch");
        it.run();
        new java.lang.Runnable() { // from class: com.ironsource.environment.thread.IronSourceThreadManager$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.json.environment.thread.IronSourceThreadManager.a(latch);
            }
        }.run();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(java.util.concurrent.CountDownLatch latch) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(latch, "$latch");
        latch.countDown();
    }

    private final boolean a(java.lang.Runnable action) {
        return useSharedExecutorService && a().getQueue().contains(action);
    }

    public static /* synthetic */ void postAdapterBackgroundTask$default(com.json.environment.thread.IronSourceThreadManager ironSourceThreadManager, java.lang.Runnable runnable, long j, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        ironSourceThreadManager.postAdapterBackgroundTask(runnable, j);
    }

    public static /* synthetic */ void postMediationBackgroundTask$default(com.json.environment.thread.IronSourceThreadManager ironSourceThreadManager, java.lang.Runnable runnable, long j, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        ironSourceThreadManager.postMediationBackgroundTask(runnable, j);
    }

    public static /* synthetic */ void postOnUiThreadTask$default(com.json.environment.thread.IronSourceThreadManager ironSourceThreadManager, java.lang.Runnable runnable, long j, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        ironSourceThreadManager.postOnUiThreadTask(runnable, j);
    }

    public static /* synthetic */ void postPublisherCallback$default(com.json.environment.thread.IronSourceThreadManager ironSourceThreadManager, java.lang.Runnable runnable, long j, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        ironSourceThreadManager.postPublisherCallback(runnable, j);
    }

    public final void executeTasks(boolean shouldExecuteAsync, boolean shouldWaitUntilAllOperationsCompleted, java.util.List<? extends java.lang.Runnable> tasks) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tasks, "tasks");
        if (!shouldExecuteAsync) {
            java.util.Iterator<? extends java.lang.Runnable> it = tasks.iterator();
            while (it.hasNext()) {
                it.next().run();
            }
            return;
        }
        if (!shouldWaitUntilAllOperationsCompleted) {
            java.util.Iterator<? extends java.lang.Runnable> it2 = tasks.iterator();
            while (it2.hasNext()) {
                postMediationBackgroundTask$default(INSTANCE, it2.next(), 0L, 2, null);
            }
            return;
        }
        final java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(tasks.size());
        for (final java.lang.Runnable runnable : tasks) {
            postMediationBackgroundTask$default(INSTANCE, new java.lang.Runnable() { // from class: com.ironsource.environment.thread.IronSourceThreadManager$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    com.json.environment.thread.IronSourceThreadManager.a(runnable, countDownLatch);
                }
            }, 0L, 2, null);
        }
        try {
            countDownLatch.await();
        } catch (java.lang.InterruptedException e) {
            com.json.l9.d().a(e);
        }
    }

    public final android.os.Handler getInitHandler() {
        return initHandler;
    }

    public final com.json.tj getSharedManagersThread() {
        return (com.json.tj) sharedManagersThread.getValue();
    }

    public final java.util.concurrent.ThreadPoolExecutor getThreadPoolExecutor() {
        return new java.util.concurrent.ThreadPoolExecutor(java.lang.Runtime.getRuntime().availableProcessors(), java.lang.Runtime.getRuntime().availableProcessors(), Long.MAX_VALUE, java.util.concurrent.TimeUnit.NANOSECONDS, new java.util.concurrent.LinkedBlockingQueue());
    }

    public final boolean getUseSharedExecutorService() {
        return useSharedExecutorService;
    }

    public final void postAdapterBackgroundTask(java.lang.Runnable action) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "action");
        postAdapterBackgroundTask$default(this, action, 0L, 2, null);
    }

    public final void postAdapterBackgroundTask(java.lang.Runnable action, long delay) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "action");
        if (useSharedExecutorService) {
            a().schedule(action, delay, java.util.concurrent.TimeUnit.MILLISECONDS);
        } else {
            adapterBackgroundHandler.a(action, delay);
        }
    }

    public final void postMediationBackgroundTask(java.lang.Runnable action) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "action");
        postMediationBackgroundTask$default(this, action, 0L, 2, null);
    }

    public final void postMediationBackgroundTask(java.lang.Runnable action, long delay) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "action");
        if (useSharedExecutorService) {
            a().schedule(action, delay, java.util.concurrent.TimeUnit.MILLISECONDS);
        } else {
            mediationBackgroundHandler.a(action, delay);
        }
    }

    public final void postOnUiThreadTask(java.lang.Runnable action) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "action");
        postOnUiThreadTask$default(this, action, 0L, 2, null);
    }

    public final void postOnUiThreadTask(java.lang.Runnable action, long delay) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "action");
        uiHandler.postDelayed(action, delay);
    }

    public final void postPublisherCallback(java.lang.Runnable action) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "action");
        postPublisherCallback$default(this, action, 0L, 2, null);
    }

    public final void postPublisherCallback(java.lang.Runnable action, long delay) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "action");
        publisherCallbackHandler.a(action, delay);
    }

    public final void removeAdapterBackgroundTask(java.lang.Runnable action) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "action");
        if (a(action)) {
            a().remove(action);
        } else {
            adapterBackgroundHandler.b(action);
        }
    }

    public final void removeMediationBackgroundTask(java.lang.Runnable action) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "action");
        if (a(action)) {
            a().remove(action);
        } else {
            mediationBackgroundHandler.b(action);
        }
    }

    public final void removeUiThreadTask(java.lang.Runnable action) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "action");
        uiHandler.removeCallbacks(action);
    }

    public final void setUseSharedExecutorService(boolean z) {
        useSharedExecutorService = z;
    }
}
