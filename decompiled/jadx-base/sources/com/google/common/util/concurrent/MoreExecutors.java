package com.google.common.util.concurrent;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.util.concurrent.ElementTypesAreNonnullByDefault
public final class MoreExecutors {
    private MoreExecutors() {
    }

    public static java.util.concurrent.ExecutorService getExitingExecutorService(java.util.concurrent.ThreadPoolExecutor executor, long terminationTimeout, java.util.concurrent.TimeUnit timeUnit) {
        return new com.google.common.util.concurrent.MoreExecutors.Application().getExitingExecutorService(executor, terminationTimeout, timeUnit);
    }

    public static java.util.concurrent.ExecutorService getExitingExecutorService(java.util.concurrent.ThreadPoolExecutor executor) {
        return new com.google.common.util.concurrent.MoreExecutors.Application().getExitingExecutorService(executor);
    }

    public static java.util.concurrent.ScheduledExecutorService getExitingScheduledExecutorService(java.util.concurrent.ScheduledThreadPoolExecutor executor, long terminationTimeout, java.util.concurrent.TimeUnit timeUnit) {
        return new com.google.common.util.concurrent.MoreExecutors.Application().getExitingScheduledExecutorService(executor, terminationTimeout, timeUnit);
    }

    public static java.util.concurrent.ScheduledExecutorService getExitingScheduledExecutorService(java.util.concurrent.ScheduledThreadPoolExecutor executor) {
        return new com.google.common.util.concurrent.MoreExecutors.Application().getExitingScheduledExecutorService(executor);
    }

    public static void addDelayedShutdownHook(java.util.concurrent.ExecutorService service, long terminationTimeout, java.util.concurrent.TimeUnit timeUnit) {
        new com.google.common.util.concurrent.MoreExecutors.Application().addDelayedShutdownHook(service, terminationTimeout, timeUnit);
    }

    static class Application {
        Application() {
        }

        final java.util.concurrent.ExecutorService getExitingExecutorService(java.util.concurrent.ThreadPoolExecutor executor, long terminationTimeout, java.util.concurrent.TimeUnit timeUnit) {
            com.google.common.util.concurrent.MoreExecutors.useDaemonThreadFactory(executor);
            java.util.concurrent.ExecutorService executorServiceUnconfigurableExecutorService = java.util.concurrent.Executors.unconfigurableExecutorService(executor);
            addDelayedShutdownHook(executor, terminationTimeout, timeUnit);
            return executorServiceUnconfigurableExecutorService;
        }

        final java.util.concurrent.ExecutorService getExitingExecutorService(java.util.concurrent.ThreadPoolExecutor executor) {
            return getExitingExecutorService(executor, 120L, java.util.concurrent.TimeUnit.SECONDS);
        }

        final java.util.concurrent.ScheduledExecutorService getExitingScheduledExecutorService(java.util.concurrent.ScheduledThreadPoolExecutor executor, long terminationTimeout, java.util.concurrent.TimeUnit timeUnit) {
            com.google.common.util.concurrent.MoreExecutors.useDaemonThreadFactory(executor);
            java.util.concurrent.ScheduledExecutorService scheduledExecutorServiceUnconfigurableScheduledExecutorService = java.util.concurrent.Executors.unconfigurableScheduledExecutorService(executor);
            addDelayedShutdownHook(executor, terminationTimeout, timeUnit);
            return scheduledExecutorServiceUnconfigurableScheduledExecutorService;
        }

        final java.util.concurrent.ScheduledExecutorService getExitingScheduledExecutorService(java.util.concurrent.ScheduledThreadPoolExecutor executor) {
            return getExitingScheduledExecutorService(executor, 120L, java.util.concurrent.TimeUnit.SECONDS);
        }

        final void addDelayedShutdownHook(final java.util.concurrent.ExecutorService service, final long terminationTimeout, final java.util.concurrent.TimeUnit timeUnit) {
            com.google.common.base.Preconditions.checkNotNull(service);
            com.google.common.base.Preconditions.checkNotNull(timeUnit);
            addShutdownHook(com.google.common.util.concurrent.MoreExecutors.newThread("DelayedShutdownHook-for-" + service, new java.lang.Runnable(this) { // from class: com.google.common.util.concurrent.MoreExecutors.Application.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        service.shutdown();
                        service.awaitTermination(terminationTimeout, timeUnit);
                    } catch (java.lang.InterruptedException unused) {
                    }
                }
            }));
        }

        void addShutdownHook(java.lang.Thread hook) {
            java.lang.Runtime.getRuntime().addShutdownHook(hook);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void useDaemonThreadFactory(java.util.concurrent.ThreadPoolExecutor executor) {
        executor.setThreadFactory(new com.google.common.util.concurrent.ThreadFactoryBuilder().setDaemon(true).setThreadFactory(executor.getThreadFactory()).build());
    }

    private static final class DirectExecutorService extends com.google.common.util.concurrent.AbstractListeningExecutorService {
        private final java.lang.Object lock;
        private int runningTasks;
        private boolean shutdown;

        private DirectExecutorService() {
            this.lock = new java.lang.Object();
            this.runningTasks = 0;
            this.shutdown = false;
        }

        @Override // java.util.concurrent.Executor
        public void execute(java.lang.Runnable command) {
            startTask();
            try {
                command.run();
            } finally {
                endTask();
            }
        }

        @Override // java.util.concurrent.ExecutorService
        public boolean isShutdown() {
            boolean z;
            synchronized (this.lock) {
                z = this.shutdown;
            }
            return z;
        }

        @Override // java.util.concurrent.ExecutorService
        public void shutdown() {
            synchronized (this.lock) {
                this.shutdown = true;
                if (this.runningTasks == 0) {
                    this.lock.notifyAll();
                }
            }
        }

        @Override // java.util.concurrent.ExecutorService
        public java.util.List<java.lang.Runnable> shutdownNow() {
            shutdown();
            return java.util.Collections.emptyList();
        }

        @Override // java.util.concurrent.ExecutorService
        public boolean isTerminated() {
            boolean z;
            synchronized (this.lock) {
                z = this.shutdown && this.runningTasks == 0;
            }
            return z;
        }

        @Override // java.util.concurrent.ExecutorService
        public boolean awaitTermination(long timeout, java.util.concurrent.TimeUnit unit) throws java.lang.InterruptedException {
            long nanos = unit.toNanos(timeout);
            synchronized (this.lock) {
                while (true) {
                    if (this.shutdown && this.runningTasks == 0) {
                        return true;
                    }
                    if (nanos <= 0) {
                        return false;
                    }
                    long jNanoTime = java.lang.System.nanoTime();
                    java.util.concurrent.TimeUnit.NANOSECONDS.timedWait(this.lock, nanos);
                    nanos -= java.lang.System.nanoTime() - jNanoTime;
                }
            }
        }

        private void startTask() {
            synchronized (this.lock) {
                if (this.shutdown) {
                    throw new java.util.concurrent.RejectedExecutionException("Executor already shutdown");
                }
                this.runningTasks++;
            }
        }

        private void endTask() {
            synchronized (this.lock) {
                int i = this.runningTasks - 1;
                this.runningTasks = i;
                if (i == 0) {
                    this.lock.notifyAll();
                }
            }
        }
    }

    public static com.google.common.util.concurrent.ListeningExecutorService newDirectExecutorService() {
        return new com.google.common.util.concurrent.MoreExecutors.DirectExecutorService();
    }

    public static java.util.concurrent.Executor directExecutor() {
        return com.google.common.util.concurrent.DirectExecutor.INSTANCE;
    }

    public static java.util.concurrent.Executor newSequentialExecutor(java.util.concurrent.Executor delegate) {
        return new com.google.common.util.concurrent.SequentialExecutor(delegate);
    }

    public static com.google.common.util.concurrent.ListeningExecutorService listeningDecorator(java.util.concurrent.ExecutorService delegate) {
        com.google.common.util.concurrent.ListeningExecutorService listeningDecorator;
        if (delegate instanceof com.google.common.util.concurrent.ListeningExecutorService) {
            return (com.google.common.util.concurrent.ListeningExecutorService) delegate;
        }
        if (delegate instanceof java.util.concurrent.ScheduledExecutorService) {
            listeningDecorator = new com.google.common.util.concurrent.MoreExecutors.ScheduledListeningDecorator((java.util.concurrent.ScheduledExecutorService) delegate);
        } else {
            listeningDecorator = new com.google.common.util.concurrent.MoreExecutors.ListeningDecorator(delegate);
        }
        return listeningDecorator;
    }

    public static com.google.common.util.concurrent.ListeningScheduledExecutorService listeningDecorator(java.util.concurrent.ScheduledExecutorService delegate) {
        if (delegate instanceof com.google.common.util.concurrent.ListeningScheduledExecutorService) {
            return (com.google.common.util.concurrent.ListeningScheduledExecutorService) delegate;
        }
        return new com.google.common.util.concurrent.MoreExecutors.ScheduledListeningDecorator(delegate);
    }

    private static class ListeningDecorator extends com.google.common.util.concurrent.AbstractListeningExecutorService {
        private final java.util.concurrent.ExecutorService delegate;

        ListeningDecorator(java.util.concurrent.ExecutorService delegate) {
            this.delegate = (java.util.concurrent.ExecutorService) com.google.common.base.Preconditions.checkNotNull(delegate);
        }

        @Override // java.util.concurrent.ExecutorService
        public final boolean awaitTermination(long timeout, java.util.concurrent.TimeUnit unit) throws java.lang.InterruptedException {
            return this.delegate.awaitTermination(timeout, unit);
        }

        @Override // java.util.concurrent.ExecutorService
        public final boolean isShutdown() {
            return this.delegate.isShutdown();
        }

        @Override // java.util.concurrent.ExecutorService
        public final boolean isTerminated() {
            return this.delegate.isTerminated();
        }

        @Override // java.util.concurrent.ExecutorService
        public final void shutdown() {
            this.delegate.shutdown();
        }

        @Override // java.util.concurrent.ExecutorService
        public final java.util.List<java.lang.Runnable> shutdownNow() {
            return this.delegate.shutdownNow();
        }

        @Override // java.util.concurrent.Executor
        public final void execute(java.lang.Runnable command) {
            this.delegate.execute(command);
        }

        public final java.lang.String toString() {
            return super.toString() + com.ironsource.y8.i.d + this.delegate + com.ironsource.y8.i.e;
        }
    }

    private static final class ScheduledListeningDecorator extends com.google.common.util.concurrent.MoreExecutors.ListeningDecorator implements com.google.common.util.concurrent.ListeningScheduledExecutorService {
        final java.util.concurrent.ScheduledExecutorService delegate;

        ScheduledListeningDecorator(java.util.concurrent.ScheduledExecutorService delegate) {
            super(delegate);
            this.delegate = (java.util.concurrent.ScheduledExecutorService) com.google.common.base.Preconditions.checkNotNull(delegate);
        }

        @Override // com.google.common.util.concurrent.ListeningScheduledExecutorService, java.util.concurrent.ScheduledExecutorService
        public com.google.common.util.concurrent.ListenableScheduledFuture<?> schedule(java.lang.Runnable command, long delay, java.util.concurrent.TimeUnit unit) {
            com.google.common.util.concurrent.TrustedListenableFutureTask trustedListenableFutureTaskCreate = com.google.common.util.concurrent.TrustedListenableFutureTask.create(command, null);
            return new com.google.common.util.concurrent.MoreExecutors.ScheduledListeningDecorator.ListenableScheduledTask(trustedListenableFutureTaskCreate, this.delegate.schedule(trustedListenableFutureTaskCreate, delay, unit));
        }

        @Override // com.google.common.util.concurrent.ListeningScheduledExecutorService, java.util.concurrent.ScheduledExecutorService
        public <V> com.google.common.util.concurrent.ListenableScheduledFuture<V> schedule(java.util.concurrent.Callable<V> callable, long delay, java.util.concurrent.TimeUnit unit) {
            com.google.common.util.concurrent.TrustedListenableFutureTask trustedListenableFutureTaskCreate = com.google.common.util.concurrent.TrustedListenableFutureTask.create(callable);
            return new com.google.common.util.concurrent.MoreExecutors.ScheduledListeningDecorator.ListenableScheduledTask(trustedListenableFutureTaskCreate, this.delegate.schedule(trustedListenableFutureTaskCreate, delay, unit));
        }

        @Override // com.google.common.util.concurrent.ListeningScheduledExecutorService, java.util.concurrent.ScheduledExecutorService
        public com.google.common.util.concurrent.ListenableScheduledFuture<?> scheduleAtFixedRate(java.lang.Runnable command, long initialDelay, long period, java.util.concurrent.TimeUnit unit) {
            com.google.common.util.concurrent.MoreExecutors.ScheduledListeningDecorator.NeverSuccessfulListenableFutureTask neverSuccessfulListenableFutureTask = new com.google.common.util.concurrent.MoreExecutors.ScheduledListeningDecorator.NeverSuccessfulListenableFutureTask(command);
            return new com.google.common.util.concurrent.MoreExecutors.ScheduledListeningDecorator.ListenableScheduledTask(neverSuccessfulListenableFutureTask, this.delegate.scheduleAtFixedRate(neverSuccessfulListenableFutureTask, initialDelay, period, unit));
        }

        @Override // com.google.common.util.concurrent.ListeningScheduledExecutorService, java.util.concurrent.ScheduledExecutorService
        public com.google.common.util.concurrent.ListenableScheduledFuture<?> scheduleWithFixedDelay(java.lang.Runnable command, long initialDelay, long delay, java.util.concurrent.TimeUnit unit) {
            com.google.common.util.concurrent.MoreExecutors.ScheduledListeningDecorator.NeverSuccessfulListenableFutureTask neverSuccessfulListenableFutureTask = new com.google.common.util.concurrent.MoreExecutors.ScheduledListeningDecorator.NeverSuccessfulListenableFutureTask(command);
            return new com.google.common.util.concurrent.MoreExecutors.ScheduledListeningDecorator.ListenableScheduledTask(neverSuccessfulListenableFutureTask, this.delegate.scheduleWithFixedDelay(neverSuccessfulListenableFutureTask, initialDelay, delay, unit));
        }

        private static final class ListenableScheduledTask<V> extends com.google.common.util.concurrent.ForwardingListenableFuture.SimpleForwardingListenableFuture<V> implements com.google.common.util.concurrent.ListenableScheduledFuture<V> {
            private final java.util.concurrent.ScheduledFuture<?> scheduledDelegate;

            public ListenableScheduledTask(com.google.common.util.concurrent.ListenableFuture<V> listenableDelegate, java.util.concurrent.ScheduledFuture<?> scheduledDelegate) {
                super(listenableDelegate);
                this.scheduledDelegate = scheduledDelegate;
            }

            @Override // com.google.common.util.concurrent.ForwardingFuture, java.util.concurrent.Future
            public boolean cancel(boolean mayInterruptIfRunning) {
                boolean zCancel = super.cancel(mayInterruptIfRunning);
                if (zCancel) {
                    this.scheduledDelegate.cancel(mayInterruptIfRunning);
                }
                return zCancel;
            }

            @Override // java.util.concurrent.Delayed
            public long getDelay(java.util.concurrent.TimeUnit unit) {
                return this.scheduledDelegate.getDelay(unit);
            }

            @Override // java.lang.Comparable
            public int compareTo(java.util.concurrent.Delayed other) {
                return this.scheduledDelegate.compareTo(other);
            }
        }

        private static final class NeverSuccessfulListenableFutureTask extends com.google.common.util.concurrent.AbstractFuture.TrustedFuture<java.lang.Void> implements java.lang.Runnable {
            private final java.lang.Runnable delegate;

            public NeverSuccessfulListenableFutureTask(java.lang.Runnable delegate) {
                this.delegate = (java.lang.Runnable) com.google.common.base.Preconditions.checkNotNull(delegate);
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    this.delegate.run();
                } catch (java.lang.Throwable th) {
                    setException(th);
                    throw th;
                }
            }

            @Override // com.google.common.util.concurrent.AbstractFuture
            protected java.lang.String pendingToString() {
                return "task=[" + this.delegate + com.ironsource.y8.i.e;
            }
        }
    }

    @com.google.common.util.concurrent.ParametricNullness
    static <T> T invokeAnyImpl(com.google.common.util.concurrent.ListeningExecutorService listeningExecutorService, java.util.Collection<? extends java.util.concurrent.Callable<T>> collection, boolean z, long j, java.util.concurrent.TimeUnit timeUnit) throws java.util.concurrent.ExecutionException, java.lang.InterruptedException, java.util.concurrent.TimeoutException {
        long jNanoTime;
        long jNanoTime2;
        com.google.common.base.Preconditions.checkNotNull(listeningExecutorService);
        com.google.common.base.Preconditions.checkNotNull(timeUnit);
        int size = collection.size();
        com.google.common.base.Preconditions.checkArgument(size > 0);
        java.util.ArrayList arrayListNewArrayListWithCapacity = com.google.common.collect.Lists.newArrayListWithCapacity(size);
        java.util.concurrent.LinkedBlockingQueue linkedBlockingQueueNewLinkedBlockingQueue = com.google.common.collect.Queues.newLinkedBlockingQueue();
        long nanos = timeUnit.toNanos(j);
        if (z) {
            try {
                jNanoTime = java.lang.System.nanoTime();
            } catch (java.lang.Throwable th) {
                java.util.Iterator it = arrayListNewArrayListWithCapacity.iterator();
                while (it.hasNext()) {
                    ((java.util.concurrent.Future) it.next()).cancel(true);
                }
                throw th;
            }
        } else {
            jNanoTime = 0;
        }
        java.util.Iterator<? extends java.util.concurrent.Callable<T>> it2 = collection.iterator();
        arrayListNewArrayListWithCapacity.add(submitAndAddQueueListener(listeningExecutorService, it2.next(), linkedBlockingQueueNewLinkedBlockingQueue));
        int i = size - 1;
        int i2 = 1;
        java.util.concurrent.ExecutionException executionException = null;
        while (true) {
            java.util.concurrent.Future future = (java.util.concurrent.Future) linkedBlockingQueueNewLinkedBlockingQueue.poll();
            if (future != null) {
                jNanoTime2 = jNanoTime;
            } else {
                if (i > 0) {
                    i--;
                    arrayListNewArrayListWithCapacity.add(submitAndAddQueueListener(listeningExecutorService, it2.next(), linkedBlockingQueueNewLinkedBlockingQueue));
                    i2++;
                } else {
                    if (i2 == 0) {
                        if (executionException == null) {
                            throw new java.util.concurrent.ExecutionException((java.lang.Throwable) null);
                        }
                        throw executionException;
                    }
                    if (z) {
                        future = (java.util.concurrent.Future) linkedBlockingQueueNewLinkedBlockingQueue.poll(nanos, java.util.concurrent.TimeUnit.NANOSECONDS);
                        if (future == null) {
                            throw new java.util.concurrent.TimeoutException();
                        }
                        jNanoTime2 = java.lang.System.nanoTime();
                        nanos -= jNanoTime2 - jNanoTime;
                    } else {
                        future = (java.util.concurrent.Future) linkedBlockingQueueNewLinkedBlockingQueue.take();
                    }
                }
                jNanoTime2 = jNanoTime;
            }
            long j2 = nanos;
            int i3 = i;
            if (future != null) {
                i2--;
                try {
                    T t = (T) future.get();
                    java.util.Iterator it3 = arrayListNewArrayListWithCapacity.iterator();
                    while (it3.hasNext()) {
                        ((java.util.concurrent.Future) it3.next()).cancel(true);
                    }
                    return t;
                } catch (java.lang.InterruptedException e) {
                    throw e;
                } catch (java.util.concurrent.ExecutionException e2) {
                    executionException = e2;
                    i = i3;
                    nanos = j2;
                    jNanoTime = jNanoTime2;
                } catch (java.lang.Exception e3) {
                    executionException = new java.util.concurrent.ExecutionException(e3);
                    i = i3;
                    nanos = j2;
                    jNanoTime = jNanoTime2;
                }
            }
            i = i3;
            nanos = j2;
            jNanoTime = jNanoTime2;
        }
    }

    private static <T> com.google.common.util.concurrent.ListenableFuture<T> submitAndAddQueueListener(com.google.common.util.concurrent.ListeningExecutorService executorService, java.util.concurrent.Callable<T> task, final java.util.concurrent.BlockingQueue<java.util.concurrent.Future<T>> queue) {
        final com.google.common.util.concurrent.ListenableFuture<T> listenableFutureSubmit = executorService.submit((java.util.concurrent.Callable) task);
        listenableFutureSubmit.addListener(new java.lang.Runnable() { // from class: com.google.common.util.concurrent.MoreExecutors.1
            @Override // java.lang.Runnable
            public void run() {
                queue.add(listenableFutureSubmit);
            }
        }, directExecutor());
        return listenableFutureSubmit;
    }

    public static java.util.concurrent.ThreadFactory platformThreadFactory() {
        if (!isAppEngineWithApiClasses()) {
            return java.util.concurrent.Executors.defaultThreadFactory();
        }
        try {
            return (java.util.concurrent.ThreadFactory) java.lang.Class.forName("com.google.appengine.api.ThreadManager").getMethod("currentRequestThreadFactory", new java.lang.Class[0]).invoke(null, new java.lang.Object[0]);
        } catch (java.lang.ClassNotFoundException e) {
            throw new java.lang.RuntimeException("Couldn't invoke ThreadManager.currentRequestThreadFactory", e);
        } catch (java.lang.IllegalAccessException e2) {
            throw new java.lang.RuntimeException("Couldn't invoke ThreadManager.currentRequestThreadFactory", e2);
        } catch (java.lang.NoSuchMethodException e3) {
            throw new java.lang.RuntimeException("Couldn't invoke ThreadManager.currentRequestThreadFactory", e3);
        } catch (java.lang.reflect.InvocationTargetException e4) {
            throw com.google.common.base.Throwables.propagate(e4.getCause());
        }
    }

    private static boolean isAppEngineWithApiClasses() {
        if (java.lang.System.getProperty("com.google.appengine.runtime.environment") == null) {
            return false;
        }
        try {
            java.lang.Class.forName("com.google.appengine.api.utils.SystemProperty");
            return java.lang.Class.forName("com.google.apphosting.api.ApiProxy").getMethod("getCurrentEnvironment", new java.lang.Class[0]).invoke(null, new java.lang.Object[0]) != null;
        } catch (java.lang.ClassNotFoundException | java.lang.IllegalAccessException | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException unused) {
            return false;
        }
    }

    static java.lang.Thread newThread(java.lang.String name, java.lang.Runnable runnable) {
        com.google.common.base.Preconditions.checkNotNull(name);
        com.google.common.base.Preconditions.checkNotNull(runnable);
        java.lang.Thread thread = (java.lang.Thread) java.util.Objects.requireNonNull(platformThreadFactory().newThread(runnable));
        try {
            thread.setName(name);
        } catch (java.lang.SecurityException unused) {
        }
        return thread;
    }

    static java.util.concurrent.Executor renamingDecorator(final java.util.concurrent.Executor executor, final com.google.common.base.Supplier<java.lang.String> nameSupplier) {
        com.google.common.base.Preconditions.checkNotNull(executor);
        com.google.common.base.Preconditions.checkNotNull(nameSupplier);
        return new java.util.concurrent.Executor() { // from class: com.google.common.util.concurrent.MoreExecutors.2
            @Override // java.util.concurrent.Executor
            public void execute(java.lang.Runnable command) {
                executor.execute(com.google.common.util.concurrent.Callables.threadRenaming(command, (com.google.common.base.Supplier<java.lang.String>) nameSupplier));
            }
        };
    }

    static java.util.concurrent.ExecutorService renamingDecorator(final java.util.concurrent.ExecutorService service, final com.google.common.base.Supplier<java.lang.String> nameSupplier) {
        com.google.common.base.Preconditions.checkNotNull(service);
        com.google.common.base.Preconditions.checkNotNull(nameSupplier);
        return new com.google.common.util.concurrent.WrappingExecutorService(service) { // from class: com.google.common.util.concurrent.MoreExecutors.3
            @Override // com.google.common.util.concurrent.WrappingExecutorService
            protected <T> java.util.concurrent.Callable<T> wrapTask(java.util.concurrent.Callable<T> callable) {
                return com.google.common.util.concurrent.Callables.threadRenaming(callable, (com.google.common.base.Supplier<java.lang.String>) nameSupplier);
            }

            @Override // com.google.common.util.concurrent.WrappingExecutorService
            protected java.lang.Runnable wrapTask(java.lang.Runnable command) {
                return com.google.common.util.concurrent.Callables.threadRenaming(command, (com.google.common.base.Supplier<java.lang.String>) nameSupplier);
            }
        };
    }

    static java.util.concurrent.ScheduledExecutorService renamingDecorator(final java.util.concurrent.ScheduledExecutorService service, final com.google.common.base.Supplier<java.lang.String> nameSupplier) {
        com.google.common.base.Preconditions.checkNotNull(service);
        com.google.common.base.Preconditions.checkNotNull(nameSupplier);
        return new com.google.common.util.concurrent.WrappingScheduledExecutorService(service) { // from class: com.google.common.util.concurrent.MoreExecutors.4
            @Override // com.google.common.util.concurrent.WrappingExecutorService
            protected <T> java.util.concurrent.Callable<T> wrapTask(java.util.concurrent.Callable<T> callable) {
                return com.google.common.util.concurrent.Callables.threadRenaming(callable, (com.google.common.base.Supplier<java.lang.String>) nameSupplier);
            }

            @Override // com.google.common.util.concurrent.WrappingExecutorService
            protected java.lang.Runnable wrapTask(java.lang.Runnable command) {
                return com.google.common.util.concurrent.Callables.threadRenaming(command, (com.google.common.base.Supplier<java.lang.String>) nameSupplier);
            }
        };
    }

    public static boolean shutdownAndAwaitTermination(java.util.concurrent.ExecutorService service, long timeout, java.util.concurrent.TimeUnit unit) {
        long nanos = unit.toNanos(timeout) / 2;
        service.shutdown();
        try {
            if (!service.awaitTermination(nanos, java.util.concurrent.TimeUnit.NANOSECONDS)) {
                service.shutdownNow();
                service.awaitTermination(nanos, java.util.concurrent.TimeUnit.NANOSECONDS);
            }
        } catch (java.lang.InterruptedException unused) {
            java.lang.Thread.currentThread().interrupt();
            service.shutdownNow();
        }
        return service.isTerminated();
    }

    static java.util.concurrent.Executor rejectionPropagatingExecutor(final java.util.concurrent.Executor delegate, final com.google.common.util.concurrent.AbstractFuture<?> future) {
        com.google.common.base.Preconditions.checkNotNull(delegate);
        com.google.common.base.Preconditions.checkNotNull(future);
        return delegate == directExecutor() ? delegate : new java.util.concurrent.Executor() { // from class: com.google.common.util.concurrent.MoreExecutors.5
            @Override // java.util.concurrent.Executor
            public void execute(java.lang.Runnable command) {
                try {
                    delegate.execute(command);
                } catch (java.util.concurrent.RejectedExecutionException e) {
                    future.setException(e);
                }
            }
        };
    }
}
