package com.google.firebase.crashlytics.internal.concurrency;

/* JADX INFO: loaded from: classes5.dex */
public final class CrashlyticsTasks {
    private static final java.util.concurrent.Executor DIRECT = new androidx.media3.exoplayer.dash.offline.DashDownloader$$ExternalSyntheticLambda0();

    public static <T> com.google.android.gms.tasks.Task<T> race(com.google.android.gms.tasks.Task<T> task, com.google.android.gms.tasks.Task<T> task2) {
        final com.google.android.gms.tasks.CancellationTokenSource cancellationTokenSource = new com.google.android.gms.tasks.CancellationTokenSource();
        final com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource = new com.google.android.gms.tasks.TaskCompletionSource(cancellationTokenSource.getToken());
        final java.util.concurrent.atomic.AtomicBoolean atomicBoolean = new java.util.concurrent.atomic.AtomicBoolean(false);
        com.google.android.gms.tasks.Continuation<T, com.google.android.gms.tasks.Task<TContinuationResult>> continuation = new com.google.android.gms.tasks.Continuation() { // from class: com.google.firebase.crashlytics.internal.concurrency.CrashlyticsTasks$$ExternalSyntheticLambda0
            @Override // com.google.android.gms.tasks.Continuation
            public final java.lang.Object then(com.google.android.gms.tasks.Task task3) {
                return com.google.firebase.crashlytics.internal.concurrency.CrashlyticsTasks.lambda$race$0(taskCompletionSource, atomicBoolean, cancellationTokenSource, task3);
            }
        };
        java.util.concurrent.Executor executor = DIRECT;
        task.continueWithTask(executor, continuation);
        task2.continueWithTask(executor, continuation);
        return taskCompletionSource.getTask();
    }

    static /* synthetic */ com.google.android.gms.tasks.Task lambda$race$0(com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource, java.util.concurrent.atomic.AtomicBoolean atomicBoolean, com.google.android.gms.tasks.CancellationTokenSource cancellationTokenSource, com.google.android.gms.tasks.Task task) throws java.lang.Exception {
        if (task.isSuccessful()) {
            taskCompletionSource.trySetResult(task.getResult());
        } else if (task.getException() != null) {
            taskCompletionSource.trySetException(task.getException());
        } else if (atomicBoolean.getAndSet(true)) {
            cancellationTokenSource.cancel();
        }
        return com.google.android.gms.tasks.Tasks.forResult(null);
    }

    private CrashlyticsTasks() {
    }
}
