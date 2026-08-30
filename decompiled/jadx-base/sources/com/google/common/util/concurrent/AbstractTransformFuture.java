package com.google.common.util.concurrent;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.util.concurrent.ElementTypesAreNonnullByDefault
abstract class AbstractTransformFuture<I, O, F, T> extends com.google.common.util.concurrent.FluentFuture.TrustedFuture<O> implements java.lang.Runnable {

    @javax.annotation.CheckForNull
    F function;

    @javax.annotation.CheckForNull
    com.google.common.util.concurrent.ListenableFuture<? extends I> inputFuture;

    @com.google.common.util.concurrent.ParametricNullness
    abstract T doTransform(F function, @com.google.common.util.concurrent.ParametricNullness I result) throws java.lang.Exception;

    abstract void setResult(@com.google.common.util.concurrent.ParametricNullness T result);

    static <I, O> com.google.common.util.concurrent.ListenableFuture<O> create(com.google.common.util.concurrent.ListenableFuture<I> input, com.google.common.util.concurrent.AsyncFunction<? super I, ? extends O> function, java.util.concurrent.Executor executor) {
        com.google.common.base.Preconditions.checkNotNull(executor);
        com.google.common.util.concurrent.AbstractTransformFuture.AsyncTransformFuture asyncTransformFuture = new com.google.common.util.concurrent.AbstractTransformFuture.AsyncTransformFuture(input, function);
        input.addListener(asyncTransformFuture, com.google.common.util.concurrent.MoreExecutors.rejectionPropagatingExecutor(executor, asyncTransformFuture));
        return asyncTransformFuture;
    }

    static <I, O> com.google.common.util.concurrent.ListenableFuture<O> create(com.google.common.util.concurrent.ListenableFuture<I> input, com.google.common.base.Function<? super I, ? extends O> function, java.util.concurrent.Executor executor) {
        com.google.common.base.Preconditions.checkNotNull(function);
        com.google.common.util.concurrent.AbstractTransformFuture.TransformFuture transformFuture = new com.google.common.util.concurrent.AbstractTransformFuture.TransformFuture(input, function);
        input.addListener(transformFuture, com.google.common.util.concurrent.MoreExecutors.rejectionPropagatingExecutor(executor, transformFuture));
        return transformFuture;
    }

    AbstractTransformFuture(com.google.common.util.concurrent.ListenableFuture<? extends I> listenableFuture, F f) {
        this.inputFuture = (com.google.common.util.concurrent.ListenableFuture) com.google.common.base.Preconditions.checkNotNull(listenableFuture);
        this.function = (F) com.google.common.base.Preconditions.checkNotNull(f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        com.google.common.util.concurrent.ListenableFuture<? extends I> listenableFuture = this.inputFuture;
        F f = this.function;
        if ((isCancelled() | (listenableFuture == null)) || (f == null)) {
            return;
        }
        this.inputFuture = null;
        if (listenableFuture.isCancelled()) {
            setFuture(listenableFuture);
            return;
        }
        try {
            try {
                java.lang.Object objDoTransform = doTransform(f, com.google.common.util.concurrent.Futures.getDone(listenableFuture));
                this.function = null;
                setResult(objDoTransform);
            } catch (java.lang.Throwable th) {
                try {
                    com.google.common.util.concurrent.Platform.restoreInterruptIfIsInterruptedException(th);
                    setException(th);
                } finally {
                    this.function = null;
                }
            }
        } catch (java.lang.Error e) {
            setException(e);
        } catch (java.util.concurrent.CancellationException unused) {
            cancel(false);
        } catch (java.util.concurrent.ExecutionException e2) {
            setException(e2.getCause());
        } catch (java.lang.Exception e3) {
            setException(e3);
        }
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    protected final void afterDone() {
        maybePropagateCancellationTo(this.inputFuture);
        this.inputFuture = null;
        this.function = null;
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    @javax.annotation.CheckForNull
    protected java.lang.String pendingToString() {
        com.google.common.util.concurrent.ListenableFuture<? extends I> listenableFuture = this.inputFuture;
        F f = this.function;
        java.lang.String strPendingToString = super.pendingToString();
        java.lang.String str = listenableFuture != null ? "inputFuture=[" + listenableFuture + "], " : "";
        if (f != null) {
            return str + "function=[" + f + com.ironsource.y8.i.e;
        }
        if (strPendingToString != null) {
            return str + strPendingToString;
        }
        return null;
    }

    private static final class AsyncTransformFuture<I, O> extends com.google.common.util.concurrent.AbstractTransformFuture<I, O, com.google.common.util.concurrent.AsyncFunction<? super I, ? extends O>, com.google.common.util.concurrent.ListenableFuture<? extends O>> {
        AsyncTransformFuture(com.google.common.util.concurrent.ListenableFuture<? extends I> inputFuture, com.google.common.util.concurrent.AsyncFunction<? super I, ? extends O> function) {
            super(inputFuture, function);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.util.concurrent.AbstractTransformFuture
        public com.google.common.util.concurrent.ListenableFuture<? extends O> doTransform(com.google.common.util.concurrent.AsyncFunction<? super I, ? extends O> function, @com.google.common.util.concurrent.ParametricNullness I input) throws java.lang.Exception {
            com.google.common.util.concurrent.ListenableFuture<? extends O> listenableFutureApply = function.apply(input);
            com.google.common.base.Preconditions.checkNotNull(listenableFutureApply, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", function);
            return listenableFutureApply;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.util.concurrent.AbstractTransformFuture
        public void setResult(com.google.common.util.concurrent.ListenableFuture<? extends O> result) {
            setFuture(result);
        }
    }

    private static final class TransformFuture<I, O> extends com.google.common.util.concurrent.AbstractTransformFuture<I, O, com.google.common.base.Function<? super I, ? extends O>, O> {
        TransformFuture(com.google.common.util.concurrent.ListenableFuture<? extends I> inputFuture, com.google.common.base.Function<? super I, ? extends O> function) {
            super(inputFuture, function);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.util.concurrent.AbstractTransformFuture
        @com.google.common.util.concurrent.ParametricNullness
        public O doTransform(com.google.common.base.Function<? super I, ? extends O> function, @com.google.common.util.concurrent.ParametricNullness I input) {
            return function.apply(input);
        }

        @Override // com.google.common.util.concurrent.AbstractTransformFuture
        void setResult(@com.google.common.util.concurrent.ParametricNullness O result) {
            set(result);
        }
    }
}
