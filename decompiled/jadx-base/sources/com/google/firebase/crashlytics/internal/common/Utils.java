package com.google.firebase.crashlytics.internal.common;

/* JADX INFO: loaded from: classes5.dex */
public final class Utils {
    private static final int BACKGROUND_TIMEOUT_MILLIS = 4000;
    private static final int MAIN_TIMEOUT_MILLIS = 3000;
    private static final java.util.concurrent.ExecutorService TASK_CONTINUATION_EXECUTOR_SERVICE = com.google.firebase.crashlytics.internal.common.ExecutorUtils.buildSingleThreadExecutorService("awaitEvenIfOnMainThread task continuation executor");

    @java.lang.Deprecated
    public static <T> T awaitEvenIfOnMainThread(com.google.android.gms.tasks.Task<T> task) throws java.lang.InterruptedException, java.util.concurrent.TimeoutException {
        final java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
        task.continueWith(TASK_CONTINUATION_EXECUTOR_SERVICE, new com.google.android.gms.tasks.Continuation() { // from class: com.google.firebase.crashlytics.internal.common.Utils$$ExternalSyntheticLambda0
            @Override // com.google.android.gms.tasks.Continuation
            public final java.lang.Object then(com.google.android.gms.tasks.Task task2) {
                return com.google.firebase.crashlytics.internal.common.Utils.lambda$awaitEvenIfOnMainThread$0(countDownLatch, task2);
            }
        });
        if (android.os.Looper.getMainLooper() == android.os.Looper.myLooper()) {
            countDownLatch.await(androidx.media3.common.C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS, java.util.concurrent.TimeUnit.MILLISECONDS);
        } else {
            countDownLatch.await(4000L, java.util.concurrent.TimeUnit.MILLISECONDS);
        }
        if (task.isSuccessful()) {
            return task.getResult();
        }
        if (task.isCanceled()) {
            throw new java.util.concurrent.CancellationException("Task is already canceled");
        }
        if (task.isComplete()) {
            throw new java.lang.IllegalStateException(task.getException());
        }
        throw new java.util.concurrent.TimeoutException();
    }

    static /* synthetic */ java.lang.Object lambda$awaitEvenIfOnMainThread$0(java.util.concurrent.CountDownLatch countDownLatch, com.google.android.gms.tasks.Task task) throws java.lang.Exception {
        countDownLatch.countDown();
        return null;
    }

    public static boolean awaitUninterruptibly(java.util.concurrent.CountDownLatch countDownLatch, long j, java.util.concurrent.TimeUnit timeUnit) {
        boolean zAwait;
        boolean z = false;
        try {
            long nanos = timeUnit.toNanos(j);
            long jNanoTime = java.lang.System.nanoTime() + nanos;
            while (true) {
                try {
                    zAwait = countDownLatch.await(nanos, java.util.concurrent.TimeUnit.NANOSECONDS);
                    break;
                } catch (java.lang.InterruptedException unused) {
                    z = true;
                    nanos = jNanoTime - java.lang.System.nanoTime();
                }
            }
            if (z) {
                java.lang.Thread.currentThread().interrupt();
            }
            return zAwait;
        } catch (java.lang.Throwable th) {
            if (z) {
                java.lang.Thread.currentThread().interrupt();
            }
            throw th;
        }
    }

    private Utils() {
    }
}
