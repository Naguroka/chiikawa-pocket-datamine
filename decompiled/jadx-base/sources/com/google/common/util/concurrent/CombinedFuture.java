package com.google.common.util.concurrent;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.util.concurrent.ElementTypesAreNonnullByDefault
final class CombinedFuture<V> extends com.google.common.util.concurrent.AggregateFuture<java.lang.Object, V> {

    @javax.annotation.CheckForNull
    private com.google.common.util.concurrent.CombinedFuture<V>.CombinedFutureInterruptibleTask<?> task;

    @Override // com.google.common.util.concurrent.AggregateFuture
    void collectOneValue(int index, @javax.annotation.CheckForNull java.lang.Object returnValue) {
    }

    CombinedFuture(com.google.common.collect.ImmutableCollection<? extends com.google.common.util.concurrent.ListenableFuture<?>> futures, boolean allMustSucceed, java.util.concurrent.Executor listenerExecutor, com.google.common.util.concurrent.AsyncCallable<V> callable) {
        super(futures, allMustSucceed, false);
        this.task = new com.google.common.util.concurrent.CombinedFuture.AsyncCallableInterruptibleTask(callable, listenerExecutor);
        init();
    }

    CombinedFuture(com.google.common.collect.ImmutableCollection<? extends com.google.common.util.concurrent.ListenableFuture<?>> futures, boolean allMustSucceed, java.util.concurrent.Executor listenerExecutor, java.util.concurrent.Callable<V> callable) {
        super(futures, allMustSucceed, false);
        this.task = new com.google.common.util.concurrent.CombinedFuture.CallableInterruptibleTask(callable, listenerExecutor);
        init();
    }

    @Override // com.google.common.util.concurrent.AggregateFuture
    void handleAllCompleted() {
        com.google.common.util.concurrent.CombinedFuture<V>.CombinedFutureInterruptibleTask<?> combinedFutureInterruptibleTask = this.task;
        if (combinedFutureInterruptibleTask != null) {
            combinedFutureInterruptibleTask.execute();
        }
    }

    @Override // com.google.common.util.concurrent.AggregateFuture
    void releaseResources(com.google.common.util.concurrent.AggregateFuture.ReleaseResourcesReason reason) {
        super.releaseResources(reason);
        if (reason == com.google.common.util.concurrent.AggregateFuture.ReleaseResourcesReason.OUTPUT_FUTURE_DONE) {
            this.task = null;
        }
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    protected void interruptTask() {
        com.google.common.util.concurrent.CombinedFuture<V>.CombinedFutureInterruptibleTask<?> combinedFutureInterruptibleTask = this.task;
        if (combinedFutureInterruptibleTask != null) {
            combinedFutureInterruptibleTask.interruptTask();
        }
    }

    private abstract class CombinedFutureInterruptibleTask<T> extends com.google.common.util.concurrent.InterruptibleTask<T> {
        private final java.util.concurrent.Executor listenerExecutor;

        abstract void setValue(@com.google.common.util.concurrent.ParametricNullness T value);

        CombinedFutureInterruptibleTask(java.util.concurrent.Executor listenerExecutor) {
            this.listenerExecutor = (java.util.concurrent.Executor) com.google.common.base.Preconditions.checkNotNull(listenerExecutor);
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        final boolean isDone() {
            return com.google.common.util.concurrent.CombinedFuture.this.isDone();
        }

        final void execute() {
            try {
                this.listenerExecutor.execute(this);
            } catch (java.util.concurrent.RejectedExecutionException e) {
                com.google.common.util.concurrent.CombinedFuture.this.setException(e);
            }
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        final void afterRanInterruptiblySuccess(@com.google.common.util.concurrent.ParametricNullness T result) {
            com.google.common.util.concurrent.CombinedFuture.this.task = null;
            setValue(result);
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        final void afterRanInterruptiblyFailure(java.lang.Throwable error) {
            com.google.common.util.concurrent.CombinedFuture.this.task = null;
            if (error instanceof java.util.concurrent.ExecutionException) {
                com.google.common.util.concurrent.CombinedFuture.this.setException(((java.util.concurrent.ExecutionException) error).getCause());
            } else if (error instanceof java.util.concurrent.CancellationException) {
                com.google.common.util.concurrent.CombinedFuture.this.cancel(false);
            } else {
                com.google.common.util.concurrent.CombinedFuture.this.setException(error);
            }
        }
    }

    private final class AsyncCallableInterruptibleTask extends com.google.common.util.concurrent.CombinedFuture<V>.CombinedFutureInterruptibleTask<com.google.common.util.concurrent.ListenableFuture<V>> {
        private final com.google.common.util.concurrent.AsyncCallable<V> callable;

        AsyncCallableInterruptibleTask(com.google.common.util.concurrent.AsyncCallable<V> callable, java.util.concurrent.Executor listenerExecutor) {
            super(listenerExecutor);
            this.callable = (com.google.common.util.concurrent.AsyncCallable) com.google.common.base.Preconditions.checkNotNull(callable);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.util.concurrent.InterruptibleTask
        public com.google.common.util.concurrent.ListenableFuture<V> runInterruptibly() throws java.lang.Exception {
            return (com.google.common.util.concurrent.ListenableFuture) com.google.common.base.Preconditions.checkNotNull(this.callable.call(), "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", this.callable);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.util.concurrent.CombinedFuture.CombinedFutureInterruptibleTask
        public void setValue(com.google.common.util.concurrent.ListenableFuture<V> value) {
            com.google.common.util.concurrent.CombinedFuture.this.setFuture(value);
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        java.lang.String toPendingString() {
            return this.callable.toString();
        }
    }

    private final class CallableInterruptibleTask extends com.google.common.util.concurrent.CombinedFuture<V>.CombinedFutureInterruptibleTask<V> {
        private final java.util.concurrent.Callable<V> callable;

        CallableInterruptibleTask(java.util.concurrent.Callable<V> callable, java.util.concurrent.Executor listenerExecutor) {
            super(listenerExecutor);
            this.callable = (java.util.concurrent.Callable) com.google.common.base.Preconditions.checkNotNull(callable);
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        @com.google.common.util.concurrent.ParametricNullness
        V runInterruptibly() throws java.lang.Exception {
            return this.callable.call();
        }

        @Override // com.google.common.util.concurrent.CombinedFuture.CombinedFutureInterruptibleTask
        void setValue(@com.google.common.util.concurrent.ParametricNullness V value) {
            com.google.common.util.concurrent.CombinedFuture.this.set(value);
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        java.lang.String toPendingString() {
            return this.callable.toString();
        }
    }
}
