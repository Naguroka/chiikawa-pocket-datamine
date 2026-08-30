package okhttp3.internal.concurrent;

/* JADX INFO: compiled from: TaskLogger.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0001H\u0002\u001a5\u0010\u000b\u001a\u0002H\f\"\u0004\b\u0000\u0010\f2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\f0\u000eH\u0080\bø\u0001\u0000¢\u0006\u0002\u0010\u000f\u001a*\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\u000eH\u0080\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0012"}, d2 = {"formatDuration", "", "ns", "", "log", "", "task", "Lokhttp3/internal/concurrent/Task;", "queue", "Lokhttp3/internal/concurrent/TaskQueue;", com.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE, "logElapsed", "T", "block", "Lkotlin/Function0;", "(Lokhttp3/internal/concurrent/Task;Lokhttp3/internal/concurrent/TaskQueue;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "taskLog", "messageBlock", com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class TaskLoggerKt {
    public static final void taskLog(okhttp3.internal.concurrent.Task task, okhttp3.internal.concurrent.TaskQueue queue, kotlin.jvm.functions.Function0<java.lang.String> messageBlock) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(task, "task");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(queue, "queue");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(messageBlock, "messageBlock");
        if (okhttp3.internal.concurrent.TaskRunner.INSTANCE.getLogger().isLoggable(java.util.logging.Level.FINE)) {
            log(task, queue, messageBlock.invoke());
        }
    }

    public static final <T> T logElapsed(okhttp3.internal.concurrent.Task task, okhttp3.internal.concurrent.TaskQueue queue, kotlin.jvm.functions.Function0<? extends T> block) {
        long jNanoTime;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(task, "task");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(queue, "queue");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        boolean zIsLoggable = okhttp3.internal.concurrent.TaskRunner.INSTANCE.getLogger().isLoggable(java.util.logging.Level.FINE);
        if (zIsLoggable) {
            jNanoTime = queue.getTaskRunner().getBackend().nanoTime();
            log(task, queue, "starting");
        } else {
            jNanoTime = -1;
        }
        try {
            T tInvoke = block.invoke();
            kotlin.jvm.internal.InlineMarker.finallyStart(1);
            if (zIsLoggable) {
                long jNanoTime2 = queue.getTaskRunner().getBackend().nanoTime() - jNanoTime;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("finished run in ");
            }
            return tInvoke;
        } finally {
            kotlin.jvm.internal.InlineMarker.finallyStart(1);
            if (zIsLoggable) {
                log(task, queue, "failed a run in " + formatDuration(queue.getTaskRunner().getBackend().nanoTime() - jNanoTime));
            }
            kotlin.jvm.internal.InlineMarker.finallyEnd(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void log(okhttp3.internal.concurrent.Task task, okhttp3.internal.concurrent.TaskQueue taskQueue, java.lang.String str) {
        java.util.logging.Logger logger = okhttp3.internal.concurrent.TaskRunner.INSTANCE.getLogger();
        java.lang.StringBuilder sbAppend = new java.lang.StringBuilder().append(taskQueue.getName()).append(' ');
        kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
        java.lang.String str2 = java.lang.String.format("%-22s", java.util.Arrays.copyOf(new java.lang.Object[]{str}, 1));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "format(format, *args)");
        logger.fine(sbAppend.append(str2).append(": ").append(task.getName()).toString());
    }

    public static final java.lang.String formatDuration(long j) {
        java.lang.String str;
        if (j <= -999500000) {
            str = ((j - ((long) 500000000)) / ((long) okhttp3.internal.http2.Http2Connection.DEGRADED_PONG_TIMEOUT_NS)) + " s ";
        } else if (j <= -999500) {
            str = ((j - ((long) 500000)) / ((long) 1000000)) + " ms";
        } else if (j <= 0) {
            str = ((j - ((long) 500)) / ((long) 1000)) + " µs";
        } else if (j < 999500) {
            str = ((j + ((long) 500)) / ((long) 1000)) + " µs";
        } else if (j < 999500000) {
            str = ((j + ((long) 500000)) / ((long) 1000000)) + " ms";
        } else {
            str = ((j + ((long) 500000000)) / ((long) okhttp3.internal.http2.Http2Connection.DEGRADED_PONG_TIMEOUT_NS)) + " s ";
        }
        kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
        java.lang.String str2 = java.lang.String.format("%6s", java.util.Arrays.copyOf(new java.lang.Object[]{str}, 1));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "format(format, *args)");
        return str2;
    }
}
