package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0004R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007¨\u0006\r"}, d2 = {"Lcom/ironsource/yb;", "Landroid/os/HandlerThread;", "Ljava/lang/Runnable;", "task", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Landroid/os/Handler;", "Landroid/os/Handler;", "mHandler", "", "name", "<init>", "(Ljava/lang/String;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
final class yb extends android.os.HandlerThread {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private android.os.Handler mHandler;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yb(java.lang.String name) {
        super(name);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
    }

    public final void a() {
        this.mHandler = new android.os.Handler(getLooper());
    }

    public final void a(java.lang.Runnable task) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(task, "task");
        android.os.Handler handler = this.mHandler;
        if (handler != null) {
            handler.post(task);
        }
    }
}
