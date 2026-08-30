package androidx.media3.common.util;

/* JADX INFO: loaded from: classes.dex */
public class SystemClock implements androidx.media3.common.util.Clock {
    @Override // androidx.media3.common.util.Clock
    public void onThreadBlocked() {
    }

    protected SystemClock() {
    }

    @Override // androidx.media3.common.util.Clock
    public long currentTimeMillis() {
        return java.lang.System.currentTimeMillis();
    }

    @Override // androidx.media3.common.util.Clock
    public long elapsedRealtime() {
        return android.os.SystemClock.elapsedRealtime();
    }

    @Override // androidx.media3.common.util.Clock
    public long uptimeMillis() {
        return android.os.SystemClock.uptimeMillis();
    }

    @Override // androidx.media3.common.util.Clock
    public long nanoTime() {
        return java.lang.System.nanoTime();
    }

    @Override // androidx.media3.common.util.Clock
    public androidx.media3.common.util.HandlerWrapper createHandler(android.os.Looper looper, android.os.Handler.Callback callback) {
        return new androidx.media3.common.util.SystemHandlerWrapper(new android.os.Handler(looper, callback));
    }
}
