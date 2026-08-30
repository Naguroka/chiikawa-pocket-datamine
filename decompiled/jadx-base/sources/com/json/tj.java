package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007J\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\n¨\u0006\u0010"}, d2 = {"Lcom/ironsource/tj;", "Landroid/os/HandlerThread;", "Ljava/lang/Runnable;", "task", "", "delay", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "b", "Landroid/os/Handler;", "Landroid/os/Handler;", "handler", "", "name", "<init>", "(Ljava/lang/String;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class tj extends android.os.HandlerThread {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private android.os.Handler handler;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tj(java.lang.String name) {
        super(name);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
    }

    public static /* synthetic */ void a(com.json.tj tjVar, java.lang.Runnable runnable, long j, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        tjVar.a(runnable, j);
    }

    public final void a() {
        this.handler = new android.os.Handler(getLooper());
    }

    public final void a(java.lang.Runnable task) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(task, "task");
        a(this, task, 0L, 2, null);
    }

    public final void a(java.lang.Runnable task, long delay) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(task, "task");
        android.os.Handler handler = this.handler;
        if (handler != null) {
            handler.postDelayed(task, delay);
        }
    }

    public final void b(java.lang.Runnable task) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(task, "task");
        android.os.Handler handler = this.handler;
        if (handler != null) {
            handler.removeCallbacks(task);
        }
    }
}
