package com.google.common.util.concurrent;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.util.concurrent.ElementTypesAreNonnullByDefault
public final class ExecutionSequencer {
    private final java.util.concurrent.atomic.AtomicReference<com.google.common.util.concurrent.ListenableFuture<java.lang.Void>> ref = new java.util.concurrent.atomic.AtomicReference<>(com.google.common.util.concurrent.Futures.immediateVoidFuture());
    private com.google.common.util.concurrent.ExecutionSequencer.ThreadConfinedTaskQueue latestTaskQueue = new com.google.common.util.concurrent.ExecutionSequencer.ThreadConfinedTaskQueue();

    enum RunningState {
        NOT_RUN,
        CANCELLED,
        STARTED
    }

    private ExecutionSequencer() {
    }

    public static com.google.common.util.concurrent.ExecutionSequencer create() {
        return new com.google.common.util.concurrent.ExecutionSequencer();
    }

    private static final class ThreadConfinedTaskQueue {

        @javax.annotation.CheckForNull
        java.util.concurrent.Executor nextExecutor;

        @javax.annotation.CheckForNull
        java.lang.Runnable nextTask;

        @javax.annotation.CheckForNull
        java.lang.Thread thread;

        private ThreadConfinedTaskQueue() {
        }
    }

    public <T> com.google.common.util.concurrent.ListenableFuture<T> submit(final java.util.concurrent.Callable<T> callable, java.util.concurrent.Executor executor) {
        com.google.common.base.Preconditions.checkNotNull(callable);
        com.google.common.base.Preconditions.checkNotNull(executor);
        return submitAsync(new com.google.common.util.concurrent.AsyncCallable<T>(this) { // from class: com.google.common.util.concurrent.ExecutionSequencer.1
            @Override // com.google.common.util.concurrent.AsyncCallable
            public com.google.common.util.concurrent.ListenableFuture<T> call() throws java.lang.Exception {
                return com.google.common.util.concurrent.Futures.immediateFuture(callable.call());
            }

            public java.lang.String toString() {
                return callable.toString();
            }
        }, executor);
    }

    public <T> com.google.common.util.concurrent.ListenableFuture<T> submitAsync(final com.google.common.util.concurrent.AsyncCallable<T> callable, java.util.concurrent.Executor executor) {
        com.google.common.base.Preconditions.checkNotNull(callable);
        com.google.common.base.Preconditions.checkNotNull(executor);
        final com.google.common.util.concurrent.ExecutionSequencer.TaskNonReentrantExecutor taskNonReentrantExecutor = new com.google.common.util.concurrent.ExecutionSequencer.TaskNonReentrantExecutor(executor, this);
        com.google.common.util.concurrent.AsyncCallable<T> asyncCallable = new com.google.common.util.concurrent.AsyncCallable<T>(this) { // from class: com.google.common.util.concurrent.ExecutionSequencer.2
            @Override // com.google.common.util.concurrent.AsyncCallable
            public com.google.common.util.concurrent.ListenableFuture<T> call() throws java.lang.Exception {
                if (!taskNonReentrantExecutor.trySetStarted()) {
                    return com.google.common.util.concurrent.Futures.immediateCancelledFuture();
                }
                return callable.call();
            }

            public java.lang.String toString() {
                return callable.toString();
            }
        };
        final com.google.common.util.concurrent.SettableFuture settableFutureCreate = com.google.common.util.concurrent.SettableFuture.create();
        final com.google.common.util.concurrent.ListenableFuture<java.lang.Void> andSet = this.ref.getAndSet(settableFutureCreate);
        final com.google.common.util.concurrent.TrustedListenableFutureTask trustedListenableFutureTaskCreate = com.google.common.util.concurrent.TrustedListenableFutureTask.create(asyncCallable);
        andSet.addListener(trustedListenableFutureTaskCreate, taskNonReentrantExecutor);
        final com.google.common.util.concurrent.ListenableFuture<T> listenableFutureNonCancellationPropagating = com.google.common.util.concurrent.Futures.nonCancellationPropagating(trustedListenableFutureTaskCreate);
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.google.common.util.concurrent.ExecutionSequencer$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.google.common.util.concurrent.ExecutionSequencer.lambda$submitAsync$0(trustedListenableFutureTaskCreate, settableFutureCreate, andSet, listenableFutureNonCancellationPropagating, taskNonReentrantExecutor);
            }
        };
        listenableFutureNonCancellationPropagating.addListener(runnable, com.google.common.util.concurrent.MoreExecutors.directExecutor());
        trustedListenableFutureTaskCreate.addListener(runnable, com.google.common.util.concurrent.MoreExecutors.directExecutor());
        return listenableFutureNonCancellationPropagating;
    }

    static /* synthetic */ void lambda$submitAsync$0(com.google.common.util.concurrent.TrustedListenableFutureTask trustedListenableFutureTask, com.google.common.util.concurrent.SettableFuture settableFuture, com.google.common.util.concurrent.ListenableFuture listenableFuture, com.google.common.util.concurrent.ListenableFuture listenableFuture2, com.google.common.util.concurrent.ExecutionSequencer.TaskNonReentrantExecutor taskNonReentrantExecutor) {
        if (trustedListenableFutureTask.isDone()) {
            settableFuture.setFuture(listenableFuture);
        } else if (listenableFuture2.isCancelled() && taskNonReentrantExecutor.trySetCancelled()) {
            trustedListenableFutureTask.cancel(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class TaskNonReentrantExecutor extends java.util.concurrent.atomic.AtomicReference<com.google.common.util.concurrent.ExecutionSequencer.RunningState> implements java.util.concurrent.Executor, java.lang.Runnable {

        @javax.annotation.CheckForNull
        java.util.concurrent.Executor delegate;

        @javax.annotation.CheckForNull
        com.google.common.util.concurrent.ExecutionSequencer sequencer;

        @javax.annotation.CheckForNull
        java.lang.Thread submitting;

        @javax.annotation.CheckForNull
        java.lang.Runnable task;

        private TaskNonReentrantExecutor(java.util.concurrent.Executor delegate, com.google.common.util.concurrent.ExecutionSequencer sequencer) {
            super(com.google.common.util.concurrent.ExecutionSequencer.RunningState.NOT_RUN);
            this.delegate = delegate;
            this.sequencer = sequencer;
        }

        @Override // java.util.concurrent.Executor
        public void execute(java.lang.Runnable task) {
            if (get() == com.google.common.util.concurrent.ExecutionSequencer.RunningState.CANCELLED) {
                this.delegate = null;
                this.sequencer = null;
                return;
            }
            this.submitting = java.lang.Thread.currentThread();
            try {
                com.google.common.util.concurrent.ExecutionSequencer.ThreadConfinedTaskQueue threadConfinedTaskQueue = ((com.google.common.util.concurrent.ExecutionSequencer) java.util.Objects.requireNonNull(this.sequencer)).latestTaskQueue;
                if (threadConfinedTaskQueue.thread == this.submitting) {
                    this.sequencer = null;
                    com.google.common.base.Preconditions.checkState(threadConfinedTaskQueue.nextTask == null);
                    threadConfinedTaskQueue.nextTask = task;
                    threadConfinedTaskQueue.nextExecutor = (java.util.concurrent.Executor) java.util.Objects.requireNonNull(this.delegate);
                    this.delegate = null;
                } else {
                    java.util.concurrent.Executor executor = (java.util.concurrent.Executor) java.util.Objects.requireNonNull(this.delegate);
                    this.delegate = null;
                    this.task = task;
                    executor.execute(this);
                }
            } finally {
                this.submitting = null;
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            java.util.concurrent.Executor executor;
            java.lang.Thread threadCurrentThread = java.lang.Thread.currentThread();
            if (threadCurrentThread != this.submitting) {
                java.lang.Runnable runnable = (java.lang.Runnable) java.util.Objects.requireNonNull(this.task);
                this.task = null;
                runnable.run();
                return;
            }
            com.google.common.util.concurrent.ExecutionSequencer.ThreadConfinedTaskQueue threadConfinedTaskQueue = new com.google.common.util.concurrent.ExecutionSequencer.ThreadConfinedTaskQueue();
            threadConfinedTaskQueue.thread = threadCurrentThread;
            ((com.google.common.util.concurrent.ExecutionSequencer) java.util.Objects.requireNonNull(this.sequencer)).latestTaskQueue = threadConfinedTaskQueue;
            this.sequencer = null;
            try {
                java.lang.Runnable runnable2 = (java.lang.Runnable) java.util.Objects.requireNonNull(this.task);
                this.task = null;
                runnable2.run();
                while (true) {
                    java.lang.Runnable runnable3 = threadConfinedTaskQueue.nextTask;
                    if (runnable3 == null || (executor = threadConfinedTaskQueue.nextExecutor) == null) {
                        break;
                    }
                    threadConfinedTaskQueue.nextTask = null;
                    threadConfinedTaskQueue.nextExecutor = null;
                    executor.execute(runnable3);
                }
                threadConfinedTaskQueue.thread = null;
            } catch (java.lang.Throwable th) {
                threadConfinedTaskQueue.thread = null;
                throw th;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean trySetStarted() {
            return compareAndSet(com.google.common.util.concurrent.ExecutionSequencer.RunningState.NOT_RUN, com.google.common.util.concurrent.ExecutionSequencer.RunningState.STARTED);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean trySetCancelled() {
            return compareAndSet(com.google.common.util.concurrent.ExecutionSequencer.RunningState.NOT_RUN, com.google.common.util.concurrent.ExecutionSequencer.RunningState.CANCELLED);
        }
    }
}
