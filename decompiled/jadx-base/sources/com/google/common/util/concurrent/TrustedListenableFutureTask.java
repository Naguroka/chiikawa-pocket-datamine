package com.google.common.util.concurrent;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.util.concurrent.ElementTypesAreNonnullByDefault
class TrustedListenableFutureTask<V> extends com.google.common.util.concurrent.FluentFuture.TrustedFuture<V> implements java.util.concurrent.RunnableFuture<V> {

    @javax.annotation.CheckForNull
    private volatile com.google.common.util.concurrent.InterruptibleTask<?> task;

    static <V> com.google.common.util.concurrent.TrustedListenableFutureTask<V> create(com.google.common.util.concurrent.AsyncCallable<V> callable) {
        return new com.google.common.util.concurrent.TrustedListenableFutureTask<>(callable);
    }

    static <V> com.google.common.util.concurrent.TrustedListenableFutureTask<V> create(java.util.concurrent.Callable<V> callable) {
        return new com.google.common.util.concurrent.TrustedListenableFutureTask<>(callable);
    }

    static <V> com.google.common.util.concurrent.TrustedListenableFutureTask<V> create(java.lang.Runnable runnable, @com.google.common.util.concurrent.ParametricNullness V result) {
        return new com.google.common.util.concurrent.TrustedListenableFutureTask<>(java.util.concurrent.Executors.callable(runnable, result));
    }

    TrustedListenableFutureTask(java.util.concurrent.Callable<V> callable) {
        this.task = new com.google.common.util.concurrent.TrustedListenableFutureTask.TrustedFutureInterruptibleTask(callable);
    }

    TrustedListenableFutureTask(com.google.common.util.concurrent.AsyncCallable<V> callable) {
        this.task = new com.google.common.util.concurrent.TrustedListenableFutureTask.TrustedFutureInterruptibleAsyncTask(callable);
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public void run() {
        com.google.common.util.concurrent.InterruptibleTask<?> interruptibleTask = this.task;
        if (interruptibleTask != null) {
            interruptibleTask.run();
        }
        this.task = null;
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    protected void afterDone() {
        com.google.common.util.concurrent.InterruptibleTask<?> interruptibleTask;
        super.afterDone();
        if (wasInterrupted() && (interruptibleTask = this.task) != null) {
            interruptibleTask.interruptTask();
        }
        this.task = null;
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    @javax.annotation.CheckForNull
    protected java.lang.String pendingToString() {
        com.google.common.util.concurrent.InterruptibleTask<?> interruptibleTask = this.task;
        if (interruptibleTask != null) {
            return "task=[" + interruptibleTask + com.ironsource.y8.i.e;
        }
        return super.pendingToString();
    }

    private final class TrustedFutureInterruptibleTask extends com.google.common.util.concurrent.InterruptibleTask<V> {
        private final java.util.concurrent.Callable<V> callable;

        TrustedFutureInterruptibleTask(java.util.concurrent.Callable<V> callable) {
            this.callable = (java.util.concurrent.Callable) com.google.common.base.Preconditions.checkNotNull(callable);
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        final boolean isDone() {
            return com.google.common.util.concurrent.TrustedListenableFutureTask.this.isDone();
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        @com.google.common.util.concurrent.ParametricNullness
        V runInterruptibly() throws java.lang.Exception {
            return this.callable.call();
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        void afterRanInterruptiblySuccess(@com.google.common.util.concurrent.ParametricNullness V result) {
            com.google.common.util.concurrent.TrustedListenableFutureTask.this.set(result);
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        void afterRanInterruptiblyFailure(java.lang.Throwable error) {
            com.google.common.util.concurrent.TrustedListenableFutureTask.this.setException(error);
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        java.lang.String toPendingString() {
            return this.callable.toString();
        }
    }

    private final class TrustedFutureInterruptibleAsyncTask extends com.google.common.util.concurrent.InterruptibleTask<com.google.common.util.concurrent.ListenableFuture<V>> {
        private final com.google.common.util.concurrent.AsyncCallable<V> callable;

        TrustedFutureInterruptibleAsyncTask(com.google.common.util.concurrent.AsyncCallable<V> callable) {
            this.callable = (com.google.common.util.concurrent.AsyncCallable) com.google.common.base.Preconditions.checkNotNull(callable);
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        final boolean isDone() {
            return com.google.common.util.concurrent.TrustedListenableFutureTask.this.isDone();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.util.concurrent.InterruptibleTask
        public com.google.common.util.concurrent.ListenableFuture<V> runInterruptibly() throws java.lang.Exception {
            return (com.google.common.util.concurrent.ListenableFuture) com.google.common.base.Preconditions.checkNotNull(this.callable.call(), "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", this.callable);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.util.concurrent.InterruptibleTask
        public void afterRanInterruptiblySuccess(com.google.common.util.concurrent.ListenableFuture<V> result) {
            com.google.common.util.concurrent.TrustedListenableFutureTask.this.setFuture(result);
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        void afterRanInterruptiblyFailure(java.lang.Throwable error) {
            com.google.common.util.concurrent.TrustedListenableFutureTask.this.setException(error);
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        java.lang.String toPendingString() {
            return this.callable.toString();
        }
    }
}
