package com.google.firebase.concurrent;

/* JADX INFO: loaded from: classes5.dex */
class DelegatingScheduledExecutorService implements java.util.concurrent.ScheduledExecutorService {
    private final java.util.concurrent.ExecutorService delegate;
    private final java.util.concurrent.ScheduledExecutorService scheduler;

    DelegatingScheduledExecutorService(java.util.concurrent.ExecutorService executorService, java.util.concurrent.ScheduledExecutorService scheduledExecutorService) {
        this.delegate = executorService;
        this.scheduler = scheduledExecutorService;
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        throw new java.lang.UnsupportedOperationException("Shutting down is not allowed.");
    }

    @Override // java.util.concurrent.ExecutorService
    public java.util.List<java.lang.Runnable> shutdownNow() {
        throw new java.lang.UnsupportedOperationException("Shutting down is not allowed.");
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return this.delegate.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return this.delegate.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j, java.util.concurrent.TimeUnit timeUnit) throws java.lang.InterruptedException {
        return this.delegate.awaitTermination(j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> java.util.concurrent.Future<T> submit(java.util.concurrent.Callable<T> callable) {
        return this.delegate.submit(callable);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> java.util.concurrent.Future<T> submit(java.lang.Runnable runnable, T t) {
        return this.delegate.submit(runnable, t);
    }

    @Override // java.util.concurrent.ExecutorService
    public java.util.concurrent.Future<?> submit(java.lang.Runnable runnable) {
        return this.delegate.submit(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> java.util.List<java.util.concurrent.Future<T>> invokeAll(java.util.Collection<? extends java.util.concurrent.Callable<T>> collection) throws java.lang.InterruptedException {
        return this.delegate.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> java.util.List<java.util.concurrent.Future<T>> invokeAll(java.util.Collection<? extends java.util.concurrent.Callable<T>> collection, long j, java.util.concurrent.TimeUnit timeUnit) throws java.lang.InterruptedException {
        return this.delegate.invokeAll(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(java.util.Collection<? extends java.util.concurrent.Callable<T>> collection) throws java.util.concurrent.ExecutionException, java.lang.InterruptedException {
        return (T) this.delegate.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(java.util.Collection<? extends java.util.concurrent.Callable<T>> collection, long j, java.util.concurrent.TimeUnit timeUnit) throws java.util.concurrent.ExecutionException, java.lang.InterruptedException, java.util.concurrent.TimeoutException {
        return (T) this.delegate.invokeAny(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public void execute(java.lang.Runnable runnable) {
        this.delegate.execute(runnable);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public java.util.concurrent.ScheduledFuture<?> schedule(final java.lang.Runnable runnable, final long j, final java.util.concurrent.TimeUnit timeUnit) {
        return new com.google.firebase.concurrent.DelegatingScheduledFuture(new com.google.firebase.concurrent.DelegatingScheduledFuture.Resolver() { // from class: com.google.firebase.concurrent.DelegatingScheduledExecutorService$$ExternalSyntheticLambda6
            @Override // com.google.firebase.concurrent.DelegatingScheduledFuture.Resolver
            public final java.util.concurrent.ScheduledFuture addCompleter(com.google.firebase.concurrent.DelegatingScheduledFuture.Completer completer) {
                return this.f$0.m820x1338b4cd(runnable, j, timeUnit, completer);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$schedule$2$com-google-firebase-concurrent-DelegatingScheduledExecutorService, reason: not valid java name */
    /* synthetic */ java.util.concurrent.ScheduledFuture m820x1338b4cd(final java.lang.Runnable runnable, long j, java.util.concurrent.TimeUnit timeUnit, final com.google.firebase.concurrent.DelegatingScheduledFuture.Completer completer) {
        return this.scheduler.schedule(new java.lang.Runnable() { // from class: com.google.firebase.concurrent.DelegatingScheduledExecutorService$$ExternalSyntheticLambda10
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m819x3777390c(runnable, completer);
            }
        }, j, timeUnit);
    }

    /* JADX INFO: renamed from: lambda$schedule$1$com-google-firebase-concurrent-DelegatingScheduledExecutorService, reason: not valid java name */
    /* synthetic */ void m819x3777390c(final java.lang.Runnable runnable, final com.google.firebase.concurrent.DelegatingScheduledFuture.Completer completer) {
        this.delegate.execute(new java.lang.Runnable() { // from class: com.google.firebase.concurrent.DelegatingScheduledExecutorService$$ExternalSyntheticLambda11
            @Override // java.lang.Runnable
            public final void run() {
                com.google.firebase.concurrent.DelegatingScheduledExecutorService.lambda$schedule$0(runnable, completer);
            }
        });
    }

    static /* synthetic */ void lambda$schedule$0(java.lang.Runnable runnable, com.google.firebase.concurrent.DelegatingScheduledFuture.Completer completer) {
        try {
            runnable.run();
            completer.set(null);
        } catch (java.lang.Exception e) {
            completer.setException(e);
        }
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public <V> java.util.concurrent.ScheduledFuture<V> schedule(final java.util.concurrent.Callable<V> callable, final long j, final java.util.concurrent.TimeUnit timeUnit) {
        return new com.google.firebase.concurrent.DelegatingScheduledFuture(new com.google.firebase.concurrent.DelegatingScheduledFuture.Resolver() { // from class: com.google.firebase.concurrent.DelegatingScheduledExecutorService$$ExternalSyntheticLambda0
            @Override // com.google.firebase.concurrent.DelegatingScheduledFuture.Resolver
            public final java.util.concurrent.ScheduledFuture addCompleter(com.google.firebase.concurrent.DelegatingScheduledFuture.Completer completer) {
                return this.f$0.m822xa67d2810(callable, j, timeUnit, completer);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$schedule$5$com-google-firebase-concurrent-DelegatingScheduledExecutorService, reason: not valid java name */
    /* synthetic */ java.util.concurrent.ScheduledFuture m822xa67d2810(final java.util.concurrent.Callable callable, long j, java.util.concurrent.TimeUnit timeUnit, final com.google.firebase.concurrent.DelegatingScheduledFuture.Completer completer) {
        return this.scheduler.schedule(new java.util.concurrent.Callable() { // from class: com.google.firebase.concurrent.DelegatingScheduledExecutorService$$ExternalSyntheticLambda2
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return this.f$0.m821xcabbac4f(callable, completer);
            }
        }, j, timeUnit);
    }

    /* JADX INFO: renamed from: lambda$schedule$4$com-google-firebase-concurrent-DelegatingScheduledExecutorService, reason: not valid java name */
    /* synthetic */ java.util.concurrent.Future m821xcabbac4f(final java.util.concurrent.Callable callable, final com.google.firebase.concurrent.DelegatingScheduledFuture.Completer completer) throws java.lang.Exception {
        return this.delegate.submit(new java.lang.Runnable() { // from class: com.google.firebase.concurrent.DelegatingScheduledExecutorService$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                com.google.firebase.concurrent.DelegatingScheduledExecutorService.lambda$schedule$3(callable, completer);
            }
        });
    }

    static /* synthetic */ void lambda$schedule$3(java.util.concurrent.Callable callable, com.google.firebase.concurrent.DelegatingScheduledFuture.Completer completer) {
        try {
            completer.set(callable.call());
        } catch (java.lang.Exception e) {
            completer.setException(e);
        }
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public java.util.concurrent.ScheduledFuture<?> scheduleAtFixedRate(final java.lang.Runnable runnable, final long j, final long j2, final java.util.concurrent.TimeUnit timeUnit) {
        return new com.google.firebase.concurrent.DelegatingScheduledFuture(new com.google.firebase.concurrent.DelegatingScheduledFuture.Resolver() { // from class: com.google.firebase.concurrent.DelegatingScheduledExecutorService$$ExternalSyntheticLambda9
            @Override // com.google.firebase.concurrent.DelegatingScheduledFuture.Resolver
            public final java.util.concurrent.ScheduledFuture addCompleter(com.google.firebase.concurrent.DelegatingScheduledFuture.Completer completer) {
                return this.f$0.m824xa2ce000c(runnable, j, j2, timeUnit, completer);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$scheduleAtFixedRate$8$com-google-firebase-concurrent-DelegatingScheduledExecutorService, reason: not valid java name */
    /* synthetic */ java.util.concurrent.ScheduledFuture m824xa2ce000c(final java.lang.Runnable runnable, long j, long j2, java.util.concurrent.TimeUnit timeUnit, final com.google.firebase.concurrent.DelegatingScheduledFuture.Completer completer) {
        return this.scheduler.scheduleAtFixedRate(new java.lang.Runnable() { // from class: com.google.firebase.concurrent.DelegatingScheduledExecutorService$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m823xc70c844b(runnable, completer);
            }
        }, j, j2, timeUnit);
    }

    /* JADX INFO: renamed from: lambda$scheduleAtFixedRate$7$com-google-firebase-concurrent-DelegatingScheduledExecutorService, reason: not valid java name */
    /* synthetic */ void m823xc70c844b(final java.lang.Runnable runnable, final com.google.firebase.concurrent.DelegatingScheduledFuture.Completer completer) {
        this.delegate.execute(new java.lang.Runnable() { // from class: com.google.firebase.concurrent.DelegatingScheduledExecutorService$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() throws java.lang.Exception {
                com.google.firebase.concurrent.DelegatingScheduledExecutorService.lambda$scheduleAtFixedRate$6(runnable, completer);
            }
        });
    }

    static /* synthetic */ void lambda$scheduleAtFixedRate$6(java.lang.Runnable runnable, com.google.firebase.concurrent.DelegatingScheduledFuture.Completer completer) throws java.lang.Exception {
        try {
            runnable.run();
        } catch (java.lang.Exception e) {
            completer.setException(e);
            throw e;
        }
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public java.util.concurrent.ScheduledFuture<?> scheduleWithFixedDelay(final java.lang.Runnable runnable, final long j, final long j2, final java.util.concurrent.TimeUnit timeUnit) {
        return new com.google.firebase.concurrent.DelegatingScheduledFuture(new com.google.firebase.concurrent.DelegatingScheduledFuture.Resolver() { // from class: com.google.firebase.concurrent.DelegatingScheduledExecutorService$$ExternalSyntheticLambda7
            @Override // com.google.firebase.concurrent.DelegatingScheduledFuture.Resolver
            public final java.util.concurrent.ScheduledFuture addCompleter(com.google.firebase.concurrent.DelegatingScheduledFuture.Completer completer) {
                return this.f$0.m826x88d94906(runnable, j, j2, timeUnit, completer);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$scheduleWithFixedDelay$11$com-google-firebase-concurrent-DelegatingScheduledExecutorService, reason: not valid java name */
    /* synthetic */ java.util.concurrent.ScheduledFuture m826x88d94906(final java.lang.Runnable runnable, long j, long j2, java.util.concurrent.TimeUnit timeUnit, final com.google.firebase.concurrent.DelegatingScheduledFuture.Completer completer) {
        return this.scheduler.scheduleWithFixedDelay(new java.lang.Runnable() { // from class: com.google.firebase.concurrent.DelegatingScheduledExecutorService$$ExternalSyntheticLambda8
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m825xad17cd45(runnable, completer);
            }
        }, j, j2, timeUnit);
    }

    /* JADX INFO: renamed from: lambda$scheduleWithFixedDelay$10$com-google-firebase-concurrent-DelegatingScheduledExecutorService, reason: not valid java name */
    /* synthetic */ void m825xad17cd45(final java.lang.Runnable runnable, final com.google.firebase.concurrent.DelegatingScheduledFuture.Completer completer) {
        this.delegate.execute(new java.lang.Runnable() { // from class: com.google.firebase.concurrent.DelegatingScheduledExecutorService$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                com.google.firebase.concurrent.DelegatingScheduledExecutorService.lambda$scheduleWithFixedDelay$9(runnable, completer);
            }
        });
    }

    static /* synthetic */ void lambda$scheduleWithFixedDelay$9(java.lang.Runnable runnable, com.google.firebase.concurrent.DelegatingScheduledFuture.Completer completer) {
        try {
            runnable.run();
        } catch (java.lang.Exception e) {
            completer.setException(e);
        }
    }
}
