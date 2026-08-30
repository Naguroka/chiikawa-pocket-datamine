package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bJ\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0002R\u0017\u0010\u0010\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000e\u001a\u0004\b\n\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/ironsource/si;", "", "Ljava/lang/Runnable;", "runnable", "", "c", "Lcom/ironsource/dr;", "task", "", "delay", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "b", "callback", "Landroid/os/Handler;", "Landroid/os/Handler;", "()Landroid/os/Handler;", "handler", "<init>", "(Landroid/os/Handler;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class si {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final android.os.Handler handler;

    @kotlin.Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"com/ironsource/si$a", "Lcom/ironsource/dr;", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class a extends com.json.dr {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.lang.Runnable f3409a;

        a(java.lang.Runnable runnable) {
            this.f3409a = runnable;
        }

        @Override // com.json.dr
        public void a() {
            this.f3409a.run();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public si() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public si(android.os.Handler handler) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(handler, "handler");
        this.handler = handler;
    }

    public /* synthetic */ si(android.os.Handler handler, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new android.os.Handler(com.json.environment.thread.IronSourceThreadManager.INSTANCE.getSharedManagersThread().getLooper()) : handler);
    }

    public static /* synthetic */ void a(com.json.si siVar, com.json.dr drVar, long j, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        siVar.a(drVar, j);
    }

    private final void c(java.lang.Runnable runnable) {
        com.json.dr aVar = runnable instanceof com.json.dr ? (com.json.dr) runnable : new com.ironsource.si.a(runnable);
        if (java.lang.Thread.currentThread().getId() == this.handler.getLooper().getThread().getId()) {
            aVar.run();
        } else {
            a(this, aVar, 0L, 2, null);
        }
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final android.os.Handler getHandler() {
        return this.handler;
    }

    public final void a(com.json.dr task) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(task, "task");
        this.handler.removeCallbacks(task);
    }

    public final void a(com.json.dr task, long delay) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(task, "task");
        this.handler.postDelayed(task, delay);
    }

    public final void a(java.lang.Runnable callback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "callback");
        c(callback);
    }

    public final void b(java.lang.Runnable runnable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(runnable, "runnable");
        c(runnable);
    }
}
