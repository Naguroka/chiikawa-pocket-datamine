package com.google.firebase.crashlytics.internal.concurrency;

/* JADX INFO: loaded from: classes5.dex */
public class CrashlyticsWorker implements java.util.concurrent.Executor {
    private final java.util.concurrent.ExecutorService executor;
    private final java.lang.Object tailLock = new java.lang.Object();
    private com.google.android.gms.tasks.Task<?> tail = com.google.android.gms.tasks.Tasks.forResult(null);

    static /* synthetic */ void lambda$await$6() {
    }

    CrashlyticsWorker(java.util.concurrent.ExecutorService executorService) {
        this.executor = executorService;
    }

    public java.util.concurrent.ExecutorService getExecutor() {
        return this.executor;
    }

    public <T> com.google.android.gms.tasks.Task<T> submit(final java.util.concurrent.Callable<T> callable) {
        com.google.android.gms.tasks.zzw zzwVar;
        synchronized (this.tailLock) {
            zzwVar = (com.google.android.gms.tasks.Task<T>) this.tail.continueWithTask(this.executor, new com.google.android.gms.tasks.Continuation() { // from class: com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorker$$ExternalSyntheticLambda6
                @Override // com.google.android.gms.tasks.Continuation
                public final java.lang.Object then(com.google.android.gms.tasks.Task task) {
                    return com.google.android.gms.tasks.Tasks.forResult(callable.call());
                }
            });
            this.tail = zzwVar;
        }
        return zzwVar;
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> submit(final java.lang.Runnable runnable) {
        com.google.android.gms.tasks.Task taskContinueWithTask;
        synchronized (this.tailLock) {
            taskContinueWithTask = this.tail.continueWithTask(this.executor, new com.google.android.gms.tasks.Continuation() { // from class: com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorker$$ExternalSyntheticLambda1
                @Override // com.google.android.gms.tasks.Continuation
                public final java.lang.Object then(com.google.android.gms.tasks.Task task) {
                    return com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorker.lambda$submit$1(runnable, task);
                }
            });
            this.tail = taskContinueWithTask;
        }
        return taskContinueWithTask;
    }

    static /* synthetic */ com.google.android.gms.tasks.Task lambda$submit$1(java.lang.Runnable runnable, com.google.android.gms.tasks.Task task) throws java.lang.Exception {
        runnable.run();
        return com.google.android.gms.tasks.Tasks.forResult(null);
    }

    public <T> com.google.android.gms.tasks.Task<T> submitTask(final java.util.concurrent.Callable<com.google.android.gms.tasks.Task<T>> callable) {
        com.google.android.gms.tasks.zzw zzwVar;
        synchronized (this.tailLock) {
            zzwVar = (com.google.android.gms.tasks.Task<T>) this.tail.continueWithTask(this.executor, new com.google.android.gms.tasks.Continuation() { // from class: com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorker$$ExternalSyntheticLambda0
                @Override // com.google.android.gms.tasks.Continuation
                public final java.lang.Object then(com.google.android.gms.tasks.Task task) {
                    return com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorker.lambda$submitTask$2(callable, task);
                }
            });
            this.tail = zzwVar;
        }
        return zzwVar;
    }

    static /* synthetic */ com.google.android.gms.tasks.Task lambda$submitTask$2(java.util.concurrent.Callable callable, com.google.android.gms.tasks.Task task) throws java.lang.Exception {
        return (com.google.android.gms.tasks.Task) callable.call();
    }

    public <T, R> com.google.android.gms.tasks.Task<R> submitTask(final java.util.concurrent.Callable<com.google.android.gms.tasks.Task<T>> callable, com.google.android.gms.tasks.Continuation<T, com.google.android.gms.tasks.Task<R>> continuation) {
        com.google.android.gms.tasks.zzw zzwVar;
        synchronized (this.tailLock) {
            zzwVar = (com.google.android.gms.tasks.Task<R>) this.tail.continueWithTask(this.executor, new com.google.android.gms.tasks.Continuation() { // from class: com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorker$$ExternalSyntheticLambda4
                @Override // com.google.android.gms.tasks.Continuation
                public final java.lang.Object then(com.google.android.gms.tasks.Task task) {
                    return com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorker.lambda$submitTask$3(callable, task);
                }
            }).continueWithTask(this.executor, continuation);
            this.tail = zzwVar;
        }
        return zzwVar;
    }

    static /* synthetic */ com.google.android.gms.tasks.Task lambda$submitTask$3(java.util.concurrent.Callable callable, com.google.android.gms.tasks.Task task) throws java.lang.Exception {
        return (com.google.android.gms.tasks.Task) callable.call();
    }

    public <T, R> com.google.android.gms.tasks.Task<R> submitTaskOnSuccess(final java.util.concurrent.Callable<com.google.android.gms.tasks.Task<T>> callable, final com.google.android.gms.tasks.SuccessContinuation<T, R> successContinuation) {
        com.google.android.gms.tasks.zzw zzwVar;
        synchronized (this.tailLock) {
            zzwVar = (com.google.android.gms.tasks.Task<R>) this.tail.continueWithTask(this.executor, new com.google.android.gms.tasks.Continuation() { // from class: com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorker$$ExternalSyntheticLambda2
                @Override // com.google.android.gms.tasks.Continuation
                public final java.lang.Object then(com.google.android.gms.tasks.Task task) {
                    return com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorker.lambda$submitTaskOnSuccess$4(callable, task);
                }
            }).continueWithTask(this.executor, new com.google.android.gms.tasks.Continuation() { // from class: com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorker$$ExternalSyntheticLambda3
                @Override // com.google.android.gms.tasks.Continuation
                public final java.lang.Object then(com.google.android.gms.tasks.Task task) {
                    return com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorker.lambda$submitTaskOnSuccess$5(successContinuation, task);
                }
            });
            this.tail = zzwVar;
        }
        return zzwVar;
    }

    static /* synthetic */ com.google.android.gms.tasks.Task lambda$submitTaskOnSuccess$4(java.util.concurrent.Callable callable, com.google.android.gms.tasks.Task task) throws java.lang.Exception {
        return (com.google.android.gms.tasks.Task) callable.call();
    }

    static /* synthetic */ com.google.android.gms.tasks.Task lambda$submitTaskOnSuccess$5(com.google.android.gms.tasks.SuccessContinuation successContinuation, com.google.android.gms.tasks.Task task) throws java.lang.Exception {
        if (task.isSuccessful()) {
            return successContinuation.then(task.getResult());
        }
        if (task.getException() != null) {
            return com.google.android.gms.tasks.Tasks.forException(task.getException());
        }
        return com.google.android.gms.tasks.Tasks.forCanceled();
    }

    @Override // java.util.concurrent.Executor
    public void execute(java.lang.Runnable runnable) {
        this.executor.execute(runnable);
    }

    public void await() throws java.util.concurrent.ExecutionException, java.lang.InterruptedException, java.util.concurrent.TimeoutException {
        com.google.android.gms.tasks.Tasks.await(submit(new java.lang.Runnable() { // from class: com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorker$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorker.lambda$await$6();
            }
        }), 30L, java.util.concurrent.TimeUnit.SECONDS);
        java.lang.Thread.sleep(1L);
    }
}
