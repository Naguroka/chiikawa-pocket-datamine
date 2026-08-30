package okhttp3.internal.platform.android;

/* JADX INFO: compiled from: AndroidLog.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"Lokhttp3/internal/platform/android/AndroidLogHandler;", "Ljava/util/logging/Handler;", "()V", "close", "", "flush", "publish", "record", "Ljava/util/logging/LogRecord;", com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AndroidLogHandler extends java.util.logging.Handler {
    public static final okhttp3.internal.platform.android.AndroidLogHandler INSTANCE = new okhttp3.internal.platform.android.AndroidLogHandler();

    @Override // java.util.logging.Handler
    public void close() {
    }

    @Override // java.util.logging.Handler
    public void flush() {
    }

    private AndroidLogHandler() {
    }

    @Override // java.util.logging.Handler
    public void publish(java.util.logging.LogRecord record) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(record, "record");
        okhttp3.internal.platform.android.AndroidLog androidLog = okhttp3.internal.platform.android.AndroidLog.INSTANCE;
        java.lang.String loggerName = record.getLoggerName();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(loggerName, "record.loggerName");
        int androidLevel = okhttp3.internal.platform.android.AndroidLogKt.getAndroidLevel(record);
        java.lang.String message = record.getMessage();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(message, "record.message");
        androidLog.androidLog$okhttp(loggerName, androidLevel, message, record.getThrown());
    }
}
