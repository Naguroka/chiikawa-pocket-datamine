package okhttp3.internal.platform.android;

/* JADX INFO: compiled from: AndroidLog.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J/\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0000¢\u0006\u0002\b\u0012J\u0006\u0010\u0013\u001a\u00020\fJ\u0018\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\nH\u0002J\u0010\u0010\u0017\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lokhttp3/internal/platform/android/AndroidLog;", "", "()V", "MAX_LOG_LENGTH", "", "configuredLoggers", "Ljava/util/concurrent/CopyOnWriteArraySet;", "Ljava/util/logging/Logger;", "knownLoggers", "", "", "androidLog", "", "loggerName", "logLevel", com.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE, "t", "", "androidLog$okhttp", com.json.mediationsdk.metadata.a.j, "enableLogging", "logger", "tag", "loggerTag", com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AndroidLog {
    private static final int MAX_LOG_LENGTH = 4000;
    private static final java.util.Map<java.lang.String, java.lang.String> knownLoggers;
    public static final okhttp3.internal.platform.android.AndroidLog INSTANCE = new okhttp3.internal.platform.android.AndroidLog();
    private static final java.util.concurrent.CopyOnWriteArraySet<java.util.logging.Logger> configuredLoggers = new java.util.concurrent.CopyOnWriteArraySet<>();

    private AndroidLog() {
    }

    static {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.lang.Package r1 = okhttp3.OkHttpClient.class.getPackage();
        java.lang.String name = r1 != null ? r1.getName() : null;
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        java.util.LinkedHashMap linkedHashMap2 = linkedHashMap;
        java.lang.String name2 = okhttp3.OkHttpClient.class.getName();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name2, "OkHttpClient::class.java.name");
        linkedHashMap2.put(name2, "okhttp.OkHttpClient");
        java.lang.String name3 = okhttp3.internal.http2.Http2.class.getName();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name3, "Http2::class.java.name");
        linkedHashMap2.put(name3, "okhttp.Http2");
        java.lang.String name4 = okhttp3.internal.concurrent.TaskRunner.class.getName();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name4, "TaskRunner::class.java.name");
        linkedHashMap2.put(name4, "okhttp.TaskRunner");
        linkedHashMap2.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        knownLoggers = kotlin.collections.MapsKt.toMap(linkedHashMap2);
    }

    public final void androidLog$okhttp(java.lang.String loggerName, int logLevel, java.lang.String message, java.lang.Throwable t) {
        int iMin;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loggerName, "loggerName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        java.lang.String strLoggerTag = loggerTag(loggerName);
        if (android.util.Log.isLoggable(strLoggerTag, logLevel)) {
            if (t != null) {
                message = message + '\n' + android.util.Log.getStackTraceString(t);
            }
            int length = message.length();
            int i = 0;
            while (i < length) {
                int iIndexOf$default = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) message, '\n', i, false, 4, (java.lang.Object) null);
                if (iIndexOf$default == -1) {
                    iIndexOf$default = length;
                }
                while (true) {
                    iMin = java.lang.Math.min(iIndexOf$default, i + 4000);
                    java.lang.String strSubstring = message.substring(i, iMin);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    android.util.Log.println(logLevel, strLoggerTag, strSubstring);
                    if (iMin >= iIndexOf$default) {
                        break;
                    } else {
                        i = iMin;
                    }
                }
                i = iMin + 1;
            }
        }
    }

    private final java.lang.String loggerTag(java.lang.String loggerName) {
        java.lang.String str = knownLoggers.get(loggerName);
        return str == null ? kotlin.text.StringsKt.take(loggerName, 23) : str;
    }

    public final void enable() {
        for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : knownLoggers.entrySet()) {
            enableLogging(entry.getKey(), entry.getValue());
        }
    }

    private final void enableLogging(java.lang.String logger, java.lang.String tag) {
        java.util.logging.Level level;
        java.util.logging.Logger logger2 = java.util.logging.Logger.getLogger(logger);
        if (configuredLoggers.add(logger2)) {
            logger2.setUseParentHandlers(false);
            if (android.util.Log.isLoggable(tag, 3)) {
                level = java.util.logging.Level.FINE;
            } else {
                level = android.util.Log.isLoggable(tag, 4) ? java.util.logging.Level.INFO : java.util.logging.Level.WARNING;
            }
            logger2.setLevel(level);
            logger2.addHandler(okhttp3.internal.platform.android.AndroidLogHandler.INSTANCE);
        }
    }
}
