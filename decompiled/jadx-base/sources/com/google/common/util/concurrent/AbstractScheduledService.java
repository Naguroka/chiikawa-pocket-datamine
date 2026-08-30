package com.google.common.util.concurrent;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.util.concurrent.ElementTypesAreNonnullByDefault
public abstract class AbstractScheduledService implements com.google.common.util.concurrent.Service {
    private static final com.google.common.util.concurrent.LazyLogger logger = new com.google.common.util.concurrent.LazyLogger(com.google.common.util.concurrent.AbstractScheduledService.class);
    private final com.google.common.util.concurrent.AbstractService delegate = new com.google.common.util.concurrent.AbstractScheduledService.ServiceDelegate();

    interface Cancellable {
        void cancel(boolean mayInterruptIfRunning);

        boolean isCancelled();
    }

    protected abstract void runOneIteration() throws java.lang.Exception;

    protected abstract com.google.common.util.concurrent.AbstractScheduledService.Scheduler scheduler();

    protected void shutDown() throws java.lang.Exception {
    }

    protected void startUp() throws java.lang.Exception {
    }

    public static abstract class Scheduler {
        abstract com.google.common.util.concurrent.AbstractScheduledService.Cancellable schedule(com.google.common.util.concurrent.AbstractService service, java.util.concurrent.ScheduledExecutorService executor, java.lang.Runnable runnable);

        public static com.google.common.util.concurrent.AbstractScheduledService.Scheduler newFixedDelaySchedule(final long initialDelay, final long delay, final java.util.concurrent.TimeUnit unit) {
            com.google.common.base.Preconditions.checkNotNull(unit);
            com.google.common.base.Preconditions.checkArgument(delay > 0, "delay must be > 0, found %s", delay);
            return new com.google.common.util.concurrent.AbstractScheduledService.Scheduler() { // from class: com.google.common.util.concurrent.AbstractScheduledService.Scheduler.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super();
                }

                @Override // com.google.common.util.concurrent.AbstractScheduledService.Scheduler
                public com.google.common.util.concurrent.AbstractScheduledService.Cancellable schedule(com.google.common.util.concurrent.AbstractService service, java.util.concurrent.ScheduledExecutorService executor, java.lang.Runnable task) {
                    return new com.google.common.util.concurrent.AbstractScheduledService.FutureAsCancellable(executor.scheduleWithFixedDelay(task, initialDelay, delay, unit));
                }
            };
        }

        public static com.google.common.util.concurrent.AbstractScheduledService.Scheduler newFixedRateSchedule(final long initialDelay, final long period, final java.util.concurrent.TimeUnit unit) {
            com.google.common.base.Preconditions.checkNotNull(unit);
            com.google.common.base.Preconditions.checkArgument(period > 0, "period must be > 0, found %s", period);
            return new com.google.common.util.concurrent.AbstractScheduledService.Scheduler() { // from class: com.google.common.util.concurrent.AbstractScheduledService.Scheduler.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super();
                }

                @Override // com.google.common.util.concurrent.AbstractScheduledService.Scheduler
                public com.google.common.util.concurrent.AbstractScheduledService.Cancellable schedule(com.google.common.util.concurrent.AbstractService service, java.util.concurrent.ScheduledExecutorService executor, java.lang.Runnable task) {
                    return new com.google.common.util.concurrent.AbstractScheduledService.FutureAsCancellable(executor.scheduleAtFixedRate(task, initialDelay, period, unit));
                }
            };
        }

        private Scheduler() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class ServiceDelegate extends com.google.common.util.concurrent.AbstractService {

        @javax.annotation.CheckForNull
        private volatile java.util.concurrent.ScheduledExecutorService executorService;
        private final java.util.concurrent.locks.ReentrantLock lock;

        @javax.annotation.CheckForNull
        private volatile com.google.common.util.concurrent.AbstractScheduledService.Cancellable runningTask;
        private final java.lang.Runnable task;

        private ServiceDelegate() {
            this.lock = new java.util.concurrent.locks.ReentrantLock();
            this.task = new com.google.common.util.concurrent.AbstractScheduledService.ServiceDelegate.Task();
        }

        class Task implements java.lang.Runnable {
            Task() {
            }

            @Override // java.lang.Runnable
            public void run() {
                com.google.common.util.concurrent.AbstractScheduledService.ServiceDelegate.this.lock.lock();
                try {
                    if (((com.google.common.util.concurrent.AbstractScheduledService.Cancellable) java.util.Objects.requireNonNull(com.google.common.util.concurrent.AbstractScheduledService.ServiceDelegate.this.runningTask)).isCancelled()) {
                        com.google.common.util.concurrent.AbstractScheduledService.ServiceDelegate.this.lock.unlock();
                        return;
                    }
                    com.google.common.util.concurrent.AbstractScheduledService.this.runOneIteration();
                } catch (java.lang.Throwable th) {
                    try {
                        com.google.common.util.concurrent.Platform.restoreInterruptIfIsInterruptedException(th);
                        try {
                            com.google.common.util.concurrent.AbstractScheduledService.this.shutDown();
                        } catch (java.lang.Exception e) {
                            com.google.common.util.concurrent.Platform.restoreInterruptIfIsInterruptedException(e);
                            com.google.common.util.concurrent.AbstractScheduledService.logger.get().log(java.util.logging.Level.WARNING, "Error while attempting to shut down the service after failure.", (java.lang.Throwable) e);
                        }
                        com.google.common.util.concurrent.AbstractScheduledService.ServiceDelegate.this.notifyFailed(th);
                        ((com.google.common.util.concurrent.AbstractScheduledService.Cancellable) java.util.Objects.requireNonNull(com.google.common.util.concurrent.AbstractScheduledService.ServiceDelegate.this.runningTask)).cancel(false);
                    } catch (java.lang.Throwable th2) {
                        com.google.common.util.concurrent.AbstractScheduledService.ServiceDelegate.this.lock.unlock();
                        throw th2;
                    }
                }
                com.google.common.util.concurrent.AbstractScheduledService.ServiceDelegate.this.lock.unlock();
            }
        }

        @Override // com.google.common.util.concurrent.AbstractService
        protected final void doStart() {
            this.executorService = com.google.common.util.concurrent.MoreExecutors.renamingDecorator(com.google.common.util.concurrent.AbstractScheduledService.this.executor(), (com.google.common.base.Supplier<java.lang.String>) new com.google.common.base.Supplier() { // from class: com.google.common.util.concurrent.AbstractScheduledService$ServiceDelegate$$ExternalSyntheticLambda1
                @Override // com.google.common.base.Supplier
                public final java.lang.Object get() {
                    return this.f$0.m808xcd8af3c3();
                }
            });
            this.executorService.execute(new java.lang.Runnable() { // from class: com.google.common.util.concurrent.AbstractScheduledService$ServiceDelegate$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m809xfa22122();
                }
            });
        }

        /* JADX INFO: renamed from: lambda$doStart$0$com-google-common-util-concurrent-AbstractScheduledService$ServiceDelegate, reason: not valid java name */
        /* synthetic */ java.lang.String m808xcd8af3c3() {
            return com.google.common.util.concurrent.AbstractScheduledService.this.serviceName() + " " + state();
        }

        /* JADX INFO: renamed from: lambda$doStart$1$com-google-common-util-concurrent-AbstractScheduledService$ServiceDelegate, reason: not valid java name */
        /* synthetic */ void m809xfa22122() {
            this.lock.lock();
            try {
                com.google.common.util.concurrent.AbstractScheduledService.this.startUp();
                java.util.Objects.requireNonNull(this.executorService);
                this.runningTask = com.google.common.util.concurrent.AbstractScheduledService.this.scheduler().schedule(com.google.common.util.concurrent.AbstractScheduledService.this.delegate, this.executorService, this.task);
                notifyStarted();
            } catch (java.lang.Throwable th) {
                try {
                    com.google.common.util.concurrent.Platform.restoreInterruptIfIsInterruptedException(th);
                    notifyFailed(th);
                    if (this.runningTask != null) {
                        this.runningTask.cancel(false);
                    }
                } finally {
                    this.lock.unlock();
                }
            }
        }

        @Override // com.google.common.util.concurrent.AbstractService
        protected final void doStop() {
            java.util.Objects.requireNonNull(this.runningTask);
            java.util.Objects.requireNonNull(this.executorService);
            this.runningTask.cancel(false);
            this.executorService.execute(new java.lang.Runnable() { // from class: com.google.common.util.concurrent.AbstractScheduledService$ServiceDelegate$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m810x2d03b891();
                }
            });
        }

        /* JADX INFO: renamed from: lambda$doStop$2$com-google-common-util-concurrent-AbstractScheduledService$ServiceDelegate, reason: not valid java name */
        /* synthetic */ void m810x2d03b891() {
            try {
                this.lock.lock();
                try {
                    if (state() == com.google.common.util.concurrent.Service.State.STOPPING) {
                        com.google.common.util.concurrent.AbstractScheduledService.this.shutDown();
                        this.lock.unlock();
                        notifyStopped();
                        return;
                    }
                    this.lock.unlock();
                } catch (java.lang.Throwable th) {
                    this.lock.unlock();
                    throw th;
                }
            } catch (java.lang.Throwable th2) {
                com.google.common.util.concurrent.Platform.restoreInterruptIfIsInterruptedException(th2);
                notifyFailed(th2);
            }
        }

        @Override // com.google.common.util.concurrent.AbstractService
        public java.lang.String toString() {
            return com.google.common.util.concurrent.AbstractScheduledService.this.toString();
        }
    }

    protected AbstractScheduledService() {
    }

    protected java.util.concurrent.ScheduledExecutorService executor() {
        final java.util.concurrent.ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = java.util.concurrent.Executors.newSingleThreadScheduledExecutor(new java.util.concurrent.ThreadFactory() { // from class: com.google.common.util.concurrent.AbstractScheduledService.1ThreadFactoryImpl
            @Override // java.util.concurrent.ThreadFactory
            public java.lang.Thread newThread(java.lang.Runnable runnable) {
                return com.google.common.util.concurrent.MoreExecutors.newThread(com.google.common.util.concurrent.AbstractScheduledService.this.serviceName(), runnable);
            }
        });
        addListener(new com.google.common.util.concurrent.Service.Listener(this) { // from class: com.google.common.util.concurrent.AbstractScheduledService.1
            @Override // com.google.common.util.concurrent.Service.Listener
            public void terminated(com.google.common.util.concurrent.Service.State from) {
                scheduledExecutorServiceNewSingleThreadScheduledExecutor.shutdown();
            }

            @Override // com.google.common.util.concurrent.Service.Listener
            public void failed(com.google.common.util.concurrent.Service.State from, java.lang.Throwable failure) {
                scheduledExecutorServiceNewSingleThreadScheduledExecutor.shutdown();
            }
        }, com.google.common.util.concurrent.MoreExecutors.directExecutor());
        return scheduledExecutorServiceNewSingleThreadScheduledExecutor;
    }

    protected java.lang.String serviceName() {
        return getClass().getSimpleName();
    }

    public java.lang.String toString() {
        return serviceName() + " [" + state() + com.ironsource.y8.i.e;
    }

    @Override // com.google.common.util.concurrent.Service
    public final boolean isRunning() {
        return this.delegate.isRunning();
    }

    @Override // com.google.common.util.concurrent.Service
    public final com.google.common.util.concurrent.Service.State state() {
        return this.delegate.state();
    }

    @Override // com.google.common.util.concurrent.Service
    public final void addListener(com.google.common.util.concurrent.Service.Listener listener, java.util.concurrent.Executor executor) {
        this.delegate.addListener(listener, executor);
    }

    @Override // com.google.common.util.concurrent.Service
    public final java.lang.Throwable failureCause() {
        return this.delegate.failureCause();
    }

    @Override // com.google.common.util.concurrent.Service
    public final com.google.common.util.concurrent.Service startAsync() throws java.lang.Exception {
        this.delegate.startAsync();
        return this;
    }

    @Override // com.google.common.util.concurrent.Service
    public final com.google.common.util.concurrent.Service stopAsync() throws java.lang.Exception {
        this.delegate.stopAsync();
        return this;
    }

    @Override // com.google.common.util.concurrent.Service
    public final void awaitRunning() {
        this.delegate.awaitRunning();
    }

    @Override // com.google.common.util.concurrent.Service
    public final void awaitRunning(long timeout, java.util.concurrent.TimeUnit unit) throws java.util.concurrent.TimeoutException {
        this.delegate.awaitRunning(timeout, unit);
    }

    @Override // com.google.common.util.concurrent.Service
    public final void awaitTerminated() {
        this.delegate.awaitTerminated();
    }

    @Override // com.google.common.util.concurrent.Service
    public final void awaitTerminated(long timeout, java.util.concurrent.TimeUnit unit) throws java.util.concurrent.TimeoutException {
        this.delegate.awaitTerminated(timeout, unit);
    }

    private static final class FutureAsCancellable implements com.google.common.util.concurrent.AbstractScheduledService.Cancellable {
        private final java.util.concurrent.Future<?> delegate;

        FutureAsCancellable(java.util.concurrent.Future<?> delegate) {
            this.delegate = delegate;
        }

        @Override // com.google.common.util.concurrent.AbstractScheduledService.Cancellable
        public void cancel(boolean mayInterruptIfRunning) {
            this.delegate.cancel(mayInterruptIfRunning);
        }

        @Override // com.google.common.util.concurrent.AbstractScheduledService.Cancellable
        public boolean isCancelled() {
            return this.delegate.isCancelled();
        }
    }

    public static abstract class CustomScheduler extends com.google.common.util.concurrent.AbstractScheduledService.Scheduler {
        protected abstract com.google.common.util.concurrent.AbstractScheduledService.CustomScheduler.Schedule getNextSchedule() throws java.lang.Exception;

        public CustomScheduler() {
            super();
        }

        private final class ReschedulableCallable implements java.util.concurrent.Callable<java.lang.Void> {

            @javax.annotation.CheckForNull
            private com.google.common.util.concurrent.AbstractScheduledService.CustomScheduler.SupplantableFuture cancellationDelegate;
            private final java.util.concurrent.ScheduledExecutorService executor;
            private final java.util.concurrent.locks.ReentrantLock lock = new java.util.concurrent.locks.ReentrantLock();
            private final com.google.common.util.concurrent.AbstractService service;
            private final java.lang.Runnable wrappedRunnable;

            ReschedulableCallable(com.google.common.util.concurrent.AbstractService service, java.util.concurrent.ScheduledExecutorService executor, java.lang.Runnable runnable) {
                this.wrappedRunnable = runnable;
                this.executor = executor;
                this.service = service;
            }

            @Override // java.util.concurrent.Callable
            @javax.annotation.CheckForNull
            public java.lang.Void call() throws java.lang.Exception {
                this.wrappedRunnable.run();
                reschedule();
                return null;
            }

            public com.google.common.util.concurrent.AbstractScheduledService.Cancellable reschedule() throws java.lang.Exception {
                com.google.common.util.concurrent.AbstractScheduledService.Cancellable futureAsCancellable;
                try {
                    com.google.common.util.concurrent.AbstractScheduledService.CustomScheduler.Schedule nextSchedule = com.google.common.util.concurrent.AbstractScheduledService.CustomScheduler.this.getNextSchedule();
                    this.lock.lock();
                    try {
                        futureAsCancellable = initializeOrUpdateCancellationDelegate(nextSchedule);
                        this.lock.unlock();
                        th = null;
                    } catch (java.lang.Throwable th) {
                        th = th;
                        try {
                            futureAsCancellable = new com.google.common.util.concurrent.AbstractScheduledService.FutureAsCancellable(com.google.common.util.concurrent.Futures.immediateCancelledFuture());
                            this.lock.unlock();
                        } catch (java.lang.Throwable th2) {
                            this.lock.unlock();
                            throw th2;
                        }
                    }
                    if (th != null) {
                        this.service.notifyFailed(th);
                    }
                    return futureAsCancellable;
                } catch (java.lang.Throwable th3) {
                    com.google.common.util.concurrent.Platform.restoreInterruptIfIsInterruptedException(th3);
                    this.service.notifyFailed(th3);
                    return new com.google.common.util.concurrent.AbstractScheduledService.FutureAsCancellable(com.google.common.util.concurrent.Futures.immediateCancelledFuture());
                }
            }

            private com.google.common.util.concurrent.AbstractScheduledService.Cancellable initializeOrUpdateCancellationDelegate(com.google.common.util.concurrent.AbstractScheduledService.CustomScheduler.Schedule schedule) {
                com.google.common.util.concurrent.AbstractScheduledService.CustomScheduler.SupplantableFuture supplantableFuture = this.cancellationDelegate;
                if (supplantableFuture == null) {
                    com.google.common.util.concurrent.AbstractScheduledService.CustomScheduler.SupplantableFuture supplantableFuture2 = new com.google.common.util.concurrent.AbstractScheduledService.CustomScheduler.SupplantableFuture(this.lock, submitToExecutor(schedule));
                    this.cancellationDelegate = supplantableFuture2;
                    return supplantableFuture2;
                }
                if (!supplantableFuture.currentFuture.isCancelled()) {
                    this.cancellationDelegate.currentFuture = submitToExecutor(schedule);
                }
                return this.cancellationDelegate;
            }

            private java.util.concurrent.ScheduledFuture<java.lang.Void> submitToExecutor(com.google.common.util.concurrent.AbstractScheduledService.CustomScheduler.Schedule schedule) {
                return this.executor.schedule(this, schedule.delay, schedule.unit);
            }
        }

        private static final class SupplantableFuture implements com.google.common.util.concurrent.AbstractScheduledService.Cancellable {
            private java.util.concurrent.Future<java.lang.Void> currentFuture;
            private final java.util.concurrent.locks.ReentrantLock lock;

            SupplantableFuture(java.util.concurrent.locks.ReentrantLock lock, java.util.concurrent.Future<java.lang.Void> currentFuture) {
                this.lock = lock;
                this.currentFuture = currentFuture;
            }

            @Override // com.google.common.util.concurrent.AbstractScheduledService.Cancellable
            public void cancel(boolean mayInterruptIfRunning) {
                this.lock.lock();
                try {
                    this.currentFuture.cancel(mayInterruptIfRunning);
                } finally {
                    this.lock.unlock();
                }
            }

            @Override // com.google.common.util.concurrent.AbstractScheduledService.Cancellable
            public boolean isCancelled() {
                this.lock.lock();
                try {
                    return this.currentFuture.isCancelled();
                } finally {
                    this.lock.unlock();
                }
            }
        }

        @Override // com.google.common.util.concurrent.AbstractScheduledService.Scheduler
        final com.google.common.util.concurrent.AbstractScheduledService.Cancellable schedule(com.google.common.util.concurrent.AbstractService service, java.util.concurrent.ScheduledExecutorService executor, java.lang.Runnable runnable) {
            return new com.google.common.util.concurrent.AbstractScheduledService.CustomScheduler.ReschedulableCallable(service, executor, runnable).reschedule();
        }

        protected static final class Schedule {
            private final long delay;
            private final java.util.concurrent.TimeUnit unit;

            public Schedule(long delay, java.util.concurrent.TimeUnit unit) {
                this.delay = delay;
                this.unit = (java.util.concurrent.TimeUnit) com.google.common.base.Preconditions.checkNotNull(unit);
            }
        }
    }
}
