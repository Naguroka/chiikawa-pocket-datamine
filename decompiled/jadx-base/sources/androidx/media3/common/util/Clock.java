package androidx.media3.common.util;

/* JADX INFO: loaded from: classes.dex */
public interface Clock {
    public static final androidx.media3.common.util.Clock DEFAULT = new androidx.media3.common.util.SystemClock();

    androidx.media3.common.util.HandlerWrapper createHandler(android.os.Looper looper, android.os.Handler.Callback callback);

    long currentTimeMillis();

    long elapsedRealtime();

    long nanoTime();

    void onThreadBlocked();

    long uptimeMillis();
}
