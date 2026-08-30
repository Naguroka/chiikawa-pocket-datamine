package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b!\u0010\"J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001a\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\bH\u0007J\u001a\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\bH\u0007J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016J\u001a\u0010\f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\bH\u0007J\b\u0010\u0007\u001a\u0004\u0018\u00010\rJ\u0006\u0010\f\u001a\u00020\u000eJ\u000e\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0012\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0011R\"\u0010\u0016\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0013\u001a\u0004\b\n\u0010\u0014\"\u0004\b\u0007\u0010\u0015R\u001b\u0010\u001a\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u0018\u001a\u0004\b\u000b\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001cR\u0014\u0010 \u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001c¨\u0006#"}, d2 = {"Lcom/ironsource/cg;", "Lcom/ironsource/qu;", "Ljava/lang/Runnable;", "action", "", "f", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "", "delay", "d", "b", "c", "Landroid/os/Looper;", "Ljava/util/concurrent/ThreadPoolExecutor;", "e", "Landroid/os/Handler;", "Landroid/os/Handler;", "uiHandler", "Z", "()Z", "(Z)V", "useSharedExecutorService", "Lcom/ironsource/er;", "Lkotlin/Lazy;", "()Lcom/ironsource/er;", "executorService", "Lcom/ironsource/tj;", "Lcom/ironsource/tj;", "backgroundHandler", "publisherCallbackHandler", "g", "releaseHandler", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class cg implements com.json.qu {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static boolean useSharedExecutorService;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private static final com.json.tj backgroundHandler;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private static final com.json.tj publisherCallbackHandler;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private static final com.json.tj releaseHandler;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final com.json.cg f2559a = new com.json.cg();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final android.os.Handler uiHandler = new android.os.Handler(android.os.Looper.getMainLooper());

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private static final kotlin.Lazy executorService = kotlin.LazyKt.lazy(com.ironsource.cg.a.f2560a);

    @kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/ironsource/er;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Lcom/ironsource/er;"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<com.json.er> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final com.ironsource.cg.a f2560a = new com.ironsource.cg.a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.json.er invoke() {
            return new com.json.er(0, null, null, 7, null);
        }
    }

    static {
        com.json.tj tjVar = new com.json.tj("isadplayer-background");
        tjVar.start();
        tjVar.a();
        backgroundHandler = tjVar;
        com.json.tj tjVar2 = new com.json.tj("isadplayer-publisher-callbacks");
        tjVar2.start();
        tjVar2.a();
        publisherCallbackHandler = tjVar2;
        com.json.tj tjVar3 = new com.json.tj("isadplayer-release");
        tjVar3.start();
        tjVar3.a();
        releaseHandler = tjVar3;
    }

    private cg() {
    }

    public static /* synthetic */ void a(com.json.cg cgVar, java.lang.Runnable runnable, long j, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        cgVar.b(runnable, j);
    }

    private final com.json.er b() {
        return (com.json.er) executorService.getValue();
    }

    public static /* synthetic */ void b(com.json.cg cgVar, java.lang.Runnable runnable, long j, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        cgVar.c(runnable, j);
    }

    public static /* synthetic */ void c(com.json.cg cgVar, java.lang.Runnable runnable, long j, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        cgVar.d(runnable, j);
    }

    private final boolean f(java.lang.Runnable action) {
        return useSharedExecutorService && b().getQueue().contains(action);
    }

    public final android.os.Looper a() {
        return backgroundHandler.getLooper();
    }

    @Override // com.json.qu
    public void a(java.lang.Runnable action) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "action");
        c(this, action, 0L, 2, null);
    }

    @Override // com.json.qu
    public void a(java.lang.Runnable action, long delay) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "action");
        if (useSharedExecutorService) {
            b().schedule(action, delay, java.util.concurrent.TimeUnit.MILLISECONDS);
        } else {
            releaseHandler.a(action, delay);
        }
    }

    public final void a(boolean z) {
        useSharedExecutorService = z;
    }

    public final void b(java.lang.Runnable action) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "action");
        a(this, action, 0L, 2, (java.lang.Object) null);
    }

    public final void b(java.lang.Runnable action, long delay) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "action");
        backgroundHandler.a(action, delay);
    }

    public final java.util.concurrent.ThreadPoolExecutor c() {
        return b();
    }

    public final void c(java.lang.Runnable action) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "action");
        b(this, action, 0L, 2, null);
    }

    public final void c(java.lang.Runnable action, long delay) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "action");
        publisherCallbackHandler.a(action, delay);
    }

    public final void d(java.lang.Runnable action) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "action");
        c(this, action, 0L, 2, null);
    }

    public final void d(java.lang.Runnable action, long delay) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "action");
        uiHandler.postDelayed(action, delay);
    }

    public final boolean d() {
        return useSharedExecutorService;
    }

    public final void e(java.lang.Runnable action) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "action");
        if (f(action)) {
            b().remove(action);
        } else {
            releaseHandler.b(action);
        }
    }
}
