package com.google.common.util.concurrent;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.util.concurrent.ElementTypesAreNonnullByDefault
public final class Futures extends com.google.common.util.concurrent.GwtFuturesCatchingSpecialization {
    private Futures() {
    }

    public static <V> com.google.common.util.concurrent.ListenableFuture<V> immediateFuture(@com.google.common.util.concurrent.ParametricNullness V v) {
        if (v == null) {
            return (com.google.common.util.concurrent.ListenableFuture<V>) com.google.common.util.concurrent.ImmediateFuture.NULL;
        }
        return new com.google.common.util.concurrent.ImmediateFuture(v);
    }

    public static com.google.common.util.concurrent.ListenableFuture<java.lang.Void> immediateVoidFuture() {
        return com.google.common.util.concurrent.ImmediateFuture.NULL;
    }

    public static <V> com.google.common.util.concurrent.ListenableFuture<V> immediateFailedFuture(java.lang.Throwable throwable) {
        com.google.common.base.Preconditions.checkNotNull(throwable);
        return new com.google.common.util.concurrent.ImmediateFuture.ImmediateFailedFuture(throwable);
    }

    public static <V> com.google.common.util.concurrent.ListenableFuture<V> immediateCancelledFuture() {
        com.google.common.util.concurrent.ImmediateFuture.ImmediateCancelledFuture<java.lang.Object> immediateCancelledFuture = com.google.common.util.concurrent.ImmediateFuture.ImmediateCancelledFuture.INSTANCE;
        return immediateCancelledFuture != null ? immediateCancelledFuture : new com.google.common.util.concurrent.ImmediateFuture.ImmediateCancelledFuture();
    }

    public static <O> com.google.common.util.concurrent.ListenableFuture<O> submit(java.util.concurrent.Callable<O> callable, java.util.concurrent.Executor executor) {
        com.google.common.util.concurrent.TrustedListenableFutureTask trustedListenableFutureTaskCreate = com.google.common.util.concurrent.TrustedListenableFutureTask.create(callable);
        executor.execute(trustedListenableFutureTaskCreate);
        return trustedListenableFutureTaskCreate;
    }

    public static com.google.common.util.concurrent.ListenableFuture<java.lang.Void> submit(java.lang.Runnable runnable, java.util.concurrent.Executor executor) {
        com.google.common.util.concurrent.TrustedListenableFutureTask trustedListenableFutureTaskCreate = com.google.common.util.concurrent.TrustedListenableFutureTask.create(runnable, null);
        executor.execute(trustedListenableFutureTaskCreate);
        return trustedListenableFutureTaskCreate;
    }

    public static <O> com.google.common.util.concurrent.ListenableFuture<O> submitAsync(com.google.common.util.concurrent.AsyncCallable<O> callable, java.util.concurrent.Executor executor) {
        com.google.common.util.concurrent.TrustedListenableFutureTask trustedListenableFutureTaskCreate = com.google.common.util.concurrent.TrustedListenableFutureTask.create(callable);
        executor.execute(trustedListenableFutureTaskCreate);
        return trustedListenableFutureTaskCreate;
    }

    public static <O> com.google.common.util.concurrent.ListenableFuture<O> scheduleAsync(com.google.common.util.concurrent.AsyncCallable<O> callable, long delay, java.util.concurrent.TimeUnit timeUnit, java.util.concurrent.ScheduledExecutorService executorService) {
        com.google.common.util.concurrent.TrustedListenableFutureTask trustedListenableFutureTaskCreate = com.google.common.util.concurrent.TrustedListenableFutureTask.create(callable);
        final java.util.concurrent.ScheduledFuture<?> scheduledFutureSchedule = executorService.schedule(trustedListenableFutureTaskCreate, delay, timeUnit);
        trustedListenableFutureTaskCreate.addListener(new java.lang.Runnable() { // from class: com.google.common.util.concurrent.Futures$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                scheduledFutureSchedule.cancel(false);
            }
        }, com.google.common.util.concurrent.MoreExecutors.directExecutor());
        return trustedListenableFutureTaskCreate;
    }

    public static <V, X extends java.lang.Throwable> com.google.common.util.concurrent.ListenableFuture<V> catching(com.google.common.util.concurrent.ListenableFuture<? extends V> input, java.lang.Class<X> exceptionType, com.google.common.base.Function<? super X, ? extends V> fallback, java.util.concurrent.Executor executor) {
        return com.google.common.util.concurrent.AbstractCatchingFuture.create(input, exceptionType, fallback, executor);
    }

    public static <V, X extends java.lang.Throwable> com.google.common.util.concurrent.ListenableFuture<V> catchingAsync(com.google.common.util.concurrent.ListenableFuture<? extends V> input, java.lang.Class<X> exceptionType, com.google.common.util.concurrent.AsyncFunction<? super X, ? extends V> fallback, java.util.concurrent.Executor executor) {
        return com.google.common.util.concurrent.AbstractCatchingFuture.create(input, exceptionType, fallback, executor);
    }

    public static <V> com.google.common.util.concurrent.ListenableFuture<V> withTimeout(com.google.common.util.concurrent.ListenableFuture<V> delegate, long time, java.util.concurrent.TimeUnit unit, java.util.concurrent.ScheduledExecutorService scheduledExecutor) {
        return delegate.isDone() ? delegate : com.google.common.util.concurrent.TimeoutFuture.create(delegate, time, unit, scheduledExecutor);
    }

    public static <I, O> com.google.common.util.concurrent.ListenableFuture<O> transformAsync(com.google.common.util.concurrent.ListenableFuture<I> input, com.google.common.util.concurrent.AsyncFunction<? super I, ? extends O> function, java.util.concurrent.Executor executor) {
        return com.google.common.util.concurrent.AbstractTransformFuture.create(input, function, executor);
    }

    public static <I, O> com.google.common.util.concurrent.ListenableFuture<O> transform(com.google.common.util.concurrent.ListenableFuture<I> input, com.google.common.base.Function<? super I, ? extends O> function, java.util.concurrent.Executor executor) {
        return com.google.common.util.concurrent.AbstractTransformFuture.create(input, function, executor);
    }

    public static <I, O> java.util.concurrent.Future<O> lazyTransform(final java.util.concurrent.Future<I> input, final com.google.common.base.Function<? super I, ? extends O> function) {
        com.google.common.base.Preconditions.checkNotNull(input);
        com.google.common.base.Preconditions.checkNotNull(function);
        return new java.util.concurrent.Future<O>() { // from class: com.google.common.util.concurrent.Futures.1
            @Override // java.util.concurrent.Future
            public boolean cancel(boolean mayInterruptIfRunning) {
                return input.cancel(mayInterruptIfRunning);
            }

            @Override // java.util.concurrent.Future
            public boolean isCancelled() {
                return input.isCancelled();
            }

            @Override // java.util.concurrent.Future
            public boolean isDone() {
                return input.isDone();
            }

            @Override // java.util.concurrent.Future
            public O get() throws java.util.concurrent.ExecutionException, java.lang.InterruptedException {
                return applyTransformation(input.get());
            }

            @Override // java.util.concurrent.Future
            public O get(long timeout, java.util.concurrent.TimeUnit unit) throws java.util.concurrent.ExecutionException, java.lang.InterruptedException, java.util.concurrent.TimeoutException {
                return applyTransformation(input.get(timeout, unit));
            }

            private O applyTransformation(I i) throws java.util.concurrent.ExecutionException {
                try {
                    return (O) function.apply(i);
                } catch (java.lang.Throwable th) {
                    throw new java.util.concurrent.ExecutionException(th);
                }
            }
        };
    }

    @java.lang.SafeVarargs
    public static <V> com.google.common.util.concurrent.ListenableFuture<java.util.List<V>> allAsList(com.google.common.util.concurrent.ListenableFuture<? extends V>... futures) {
        return new com.google.common.util.concurrent.CollectionFuture.ListFuture(com.google.common.collect.ImmutableList.copyOf(futures), true);
    }

    public static <V> com.google.common.util.concurrent.ListenableFuture<java.util.List<V>> allAsList(java.lang.Iterable<? extends com.google.common.util.concurrent.ListenableFuture<? extends V>> futures) {
        return new com.google.common.util.concurrent.CollectionFuture.ListFuture(com.google.common.collect.ImmutableList.copyOf(futures), true);
    }

    @java.lang.SafeVarargs
    public static <V> com.google.common.util.concurrent.Futures.FutureCombiner<V> whenAllComplete(com.google.common.util.concurrent.ListenableFuture<? extends V>... futures) {
        return new com.google.common.util.concurrent.Futures.FutureCombiner<>(false, com.google.common.collect.ImmutableList.copyOf(futures));
    }

    public static <V> com.google.common.util.concurrent.Futures.FutureCombiner<V> whenAllComplete(java.lang.Iterable<? extends com.google.common.util.concurrent.ListenableFuture<? extends V>> futures) {
        return new com.google.common.util.concurrent.Futures.FutureCombiner<>(false, com.google.common.collect.ImmutableList.copyOf(futures));
    }

    @java.lang.SafeVarargs
    public static <V> com.google.common.util.concurrent.Futures.FutureCombiner<V> whenAllSucceed(com.google.common.util.concurrent.ListenableFuture<? extends V>... futures) {
        return new com.google.common.util.concurrent.Futures.FutureCombiner<>(true, com.google.common.collect.ImmutableList.copyOf(futures));
    }

    public static <V> com.google.common.util.concurrent.Futures.FutureCombiner<V> whenAllSucceed(java.lang.Iterable<? extends com.google.common.util.concurrent.ListenableFuture<? extends V>> futures) {
        return new com.google.common.util.concurrent.Futures.FutureCombiner<>(true, com.google.common.collect.ImmutableList.copyOf(futures));
    }

    public static final class FutureCombiner<V> {
        private final boolean allMustSucceed;
        private final com.google.common.collect.ImmutableList<com.google.common.util.concurrent.ListenableFuture<? extends V>> futures;

        private FutureCombiner(boolean allMustSucceed, com.google.common.collect.ImmutableList<com.google.common.util.concurrent.ListenableFuture<? extends V>> futures) {
            this.allMustSucceed = allMustSucceed;
            this.futures = futures;
        }

        public <C> com.google.common.util.concurrent.ListenableFuture<C> callAsync(com.google.common.util.concurrent.AsyncCallable<C> combiner, java.util.concurrent.Executor executor) {
            return new com.google.common.util.concurrent.CombinedFuture(this.futures, this.allMustSucceed, executor, combiner);
        }

        public <C> com.google.common.util.concurrent.ListenableFuture<C> call(java.util.concurrent.Callable<C> combiner, java.util.concurrent.Executor executor) {
            return new com.google.common.util.concurrent.CombinedFuture(this.futures, this.allMustSucceed, executor, combiner);
        }

        public com.google.common.util.concurrent.ListenableFuture<?> run(final java.lang.Runnable combiner, java.util.concurrent.Executor executor) {
            return call(new java.util.concurrent.Callable<java.lang.Void>(this) { // from class: com.google.common.util.concurrent.Futures.FutureCombiner.1
                @Override // java.util.concurrent.Callable
                @javax.annotation.CheckForNull
                public java.lang.Void call() throws java.lang.Exception {
                    combiner.run();
                    return null;
                }
            }, executor);
        }
    }

    public static <V> com.google.common.util.concurrent.ListenableFuture<V> nonCancellationPropagating(com.google.common.util.concurrent.ListenableFuture<V> future) {
        if (future.isDone()) {
            return future;
        }
        com.google.common.util.concurrent.Futures.NonCancellationPropagatingFuture nonCancellationPropagatingFuture = new com.google.common.util.concurrent.Futures.NonCancellationPropagatingFuture(future);
        future.addListener(nonCancellationPropagatingFuture, com.google.common.util.concurrent.MoreExecutors.directExecutor());
        return nonCancellationPropagatingFuture;
    }

    private static final class NonCancellationPropagatingFuture<V> extends com.google.common.util.concurrent.AbstractFuture.TrustedFuture<V> implements java.lang.Runnable {

        @javax.annotation.CheckForNull
        private com.google.common.util.concurrent.ListenableFuture<V> delegate;

        NonCancellationPropagatingFuture(final com.google.common.util.concurrent.ListenableFuture<V> delegate) {
            this.delegate = delegate;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.google.common.util.concurrent.ListenableFuture<V> listenableFuture = this.delegate;
            if (listenableFuture != null) {
                setFuture(listenableFuture);
            }
        }

        @Override // com.google.common.util.concurrent.AbstractFuture
        @javax.annotation.CheckForNull
        protected java.lang.String pendingToString() {
            com.google.common.util.concurrent.ListenableFuture<V> listenableFuture = this.delegate;
            if (listenableFuture != null) {
                return "delegate=[" + listenableFuture + com.ironsource.y8.i.e;
            }
            return null;
        }

        @Override // com.google.common.util.concurrent.AbstractFuture
        protected void afterDone() {
            this.delegate = null;
        }
    }

    @java.lang.SafeVarargs
    public static <V> com.google.common.util.concurrent.ListenableFuture<java.util.List<V>> successfulAsList(com.google.common.util.concurrent.ListenableFuture<? extends V>... futures) {
        return new com.google.common.util.concurrent.CollectionFuture.ListFuture(com.google.common.collect.ImmutableList.copyOf(futures), false);
    }

    public static <V> com.google.common.util.concurrent.ListenableFuture<java.util.List<V>> successfulAsList(java.lang.Iterable<? extends com.google.common.util.concurrent.ListenableFuture<? extends V>> futures) {
        return new com.google.common.util.concurrent.CollectionFuture.ListFuture(com.google.common.collect.ImmutableList.copyOf(futures), false);
    }

    public static <T> com.google.common.collect.ImmutableList<com.google.common.util.concurrent.ListenableFuture<T>> inCompletionOrder(java.lang.Iterable<? extends com.google.common.util.concurrent.ListenableFuture<? extends T>> futures) {
        com.google.common.util.concurrent.ListenableFuture[] listenableFutureArrGwtCompatibleToArray = gwtCompatibleToArray(futures);
        final com.google.common.util.concurrent.Futures.InCompletionOrderState inCompletionOrderState = new com.google.common.util.concurrent.Futures.InCompletionOrderState(listenableFutureArrGwtCompatibleToArray);
        com.google.common.collect.ImmutableList.Builder builderBuilderWithExpectedSize = com.google.common.collect.ImmutableList.builderWithExpectedSize(listenableFutureArrGwtCompatibleToArray.length);
        for (int i = 0; i < listenableFutureArrGwtCompatibleToArray.length; i++) {
            builderBuilderWithExpectedSize.add(new com.google.common.util.concurrent.Futures.InCompletionOrderFuture(inCompletionOrderState));
        }
        final com.google.common.collect.ImmutableList<com.google.common.util.concurrent.ListenableFuture<T>> immutableListBuild = builderBuilderWithExpectedSize.build();
        for (final int i2 = 0; i2 < listenableFutureArrGwtCompatibleToArray.length; i2++) {
            listenableFutureArrGwtCompatibleToArray[i2].addListener(new java.lang.Runnable() { // from class: com.google.common.util.concurrent.Futures$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    inCompletionOrderState.recordInputCompletion(immutableListBuild, i2);
                }
            }, com.google.common.util.concurrent.MoreExecutors.directExecutor());
        }
        return immutableListBuild;
    }

    private static <T> com.google.common.util.concurrent.ListenableFuture<? extends T>[] gwtCompatibleToArray(java.lang.Iterable<? extends com.google.common.util.concurrent.ListenableFuture<? extends T>> futures) {
        java.util.Collection collectionCopyOf;
        if (futures instanceof java.util.Collection) {
            collectionCopyOf = (java.util.Collection) futures;
        } else {
            collectionCopyOf = com.google.common.collect.ImmutableList.copyOf(futures);
        }
        return (com.google.common.util.concurrent.ListenableFuture[]) collectionCopyOf.toArray(new com.google.common.util.concurrent.ListenableFuture[0]);
    }

    private static final class InCompletionOrderFuture<T> extends com.google.common.util.concurrent.AbstractFuture<T> {

        @javax.annotation.CheckForNull
        private com.google.common.util.concurrent.Futures.InCompletionOrderState<T> state;

        private InCompletionOrderFuture(com.google.common.util.concurrent.Futures.InCompletionOrderState<T> state) {
            this.state = state;
        }

        @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
        public boolean cancel(boolean interruptIfRunning) {
            com.google.common.util.concurrent.Futures.InCompletionOrderState<T> inCompletionOrderState = this.state;
            if (!super.cancel(interruptIfRunning)) {
                return false;
            }
            ((com.google.common.util.concurrent.Futures.InCompletionOrderState) java.util.Objects.requireNonNull(inCompletionOrderState)).recordOutputCancellation(interruptIfRunning);
            return true;
        }

        @Override // com.google.common.util.concurrent.AbstractFuture
        protected void afterDone() {
            this.state = null;
        }

        @Override // com.google.common.util.concurrent.AbstractFuture
        @javax.annotation.CheckForNull
        protected java.lang.String pendingToString() {
            com.google.common.util.concurrent.Futures.InCompletionOrderState<T> inCompletionOrderState = this.state;
            if (inCompletionOrderState != null) {
                return "inputCount=[" + ((com.google.common.util.concurrent.Futures.InCompletionOrderState) inCompletionOrderState).inputFutures.length + "], remaining=[" + ((com.google.common.util.concurrent.Futures.InCompletionOrderState) inCompletionOrderState).incompleteOutputCount.get() + com.ironsource.y8.i.e;
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class InCompletionOrderState<T> {
        private volatile int delegateIndex;
        private final java.util.concurrent.atomic.AtomicInteger incompleteOutputCount;
        private final com.google.common.util.concurrent.ListenableFuture<? extends T>[] inputFutures;
        private boolean shouldInterrupt;
        private boolean wasCancelled;

        private InCompletionOrderState(com.google.common.util.concurrent.ListenableFuture<? extends T>[] inputFutures) {
            this.wasCancelled = false;
            this.shouldInterrupt = true;
            this.delegateIndex = 0;
            this.inputFutures = inputFutures;
            this.incompleteOutputCount = new java.util.concurrent.atomic.AtomicInteger(inputFutures.length);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void recordOutputCancellation(boolean interruptIfRunning) {
            this.wasCancelled = true;
            if (!interruptIfRunning) {
                this.shouldInterrupt = false;
            }
            recordCompletion();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void recordInputCompletion(com.google.common.collect.ImmutableList<com.google.common.util.concurrent.AbstractFuture<T>> delegates, int inputFutureIndex) {
            com.google.common.util.concurrent.ListenableFuture<? extends T> listenableFuture = (com.google.common.util.concurrent.ListenableFuture) java.util.Objects.requireNonNull(this.inputFutures[inputFutureIndex]);
            this.inputFutures[inputFutureIndex] = null;
            for (int i = this.delegateIndex; i < delegates.size(); i++) {
                if (delegates.get(i).setFuture(listenableFuture)) {
                    recordCompletion();
                    this.delegateIndex = i + 1;
                    return;
                }
            }
            this.delegateIndex = delegates.size();
        }

        private void recordCompletion() {
            if (this.incompleteOutputCount.decrementAndGet() == 0 && this.wasCancelled) {
                for (com.google.common.util.concurrent.ListenableFuture<? extends T> listenableFuture : this.inputFutures) {
                    if (listenableFuture != null) {
                        listenableFuture.cancel(this.shouldInterrupt);
                    }
                }
            }
        }
    }

    public static <V> void addCallback(final com.google.common.util.concurrent.ListenableFuture<V> future, final com.google.common.util.concurrent.FutureCallback<? super V> callback, java.util.concurrent.Executor executor) {
        com.google.common.base.Preconditions.checkNotNull(callback);
        future.addListener(new com.google.common.util.concurrent.Futures.CallbackListener(future, callback), executor);
    }

    private static final class CallbackListener<V> implements java.lang.Runnable {
        final com.google.common.util.concurrent.FutureCallback<? super V> callback;
        final java.util.concurrent.Future<V> future;

        CallbackListener(java.util.concurrent.Future<V> future, com.google.common.util.concurrent.FutureCallback<? super V> callback) {
            this.future = future;
            this.callback = callback;
        }

        @Override // java.lang.Runnable
        public void run() {
            java.lang.Throwable thTryInternalFastPathGetFailure;
            java.util.concurrent.Future<V> future = this.future;
            if ((future instanceof com.google.common.util.concurrent.internal.InternalFutureFailureAccess) && (thTryInternalFastPathGetFailure = com.google.common.util.concurrent.internal.InternalFutures.tryInternalFastPathGetFailure((com.google.common.util.concurrent.internal.InternalFutureFailureAccess) future)) != null) {
                this.callback.onFailure(thTryInternalFastPathGetFailure);
                return;
            }
            try {
                this.callback.onSuccess(com.google.common.util.concurrent.Futures.getDone(this.future));
            } catch (java.util.concurrent.ExecutionException e) {
                this.callback.onFailure(e.getCause());
            } catch (java.lang.Throwable th) {
                this.callback.onFailure(th);
            }
        }

        public java.lang.String toString() {
            return com.google.common.base.MoreObjects.toStringHelper(this).addValue(this.callback).toString();
        }
    }

    @com.google.common.util.concurrent.ParametricNullness
    public static <V> V getDone(java.util.concurrent.Future<V> future) throws java.util.concurrent.ExecutionException {
        com.google.common.base.Preconditions.checkState(future.isDone(), "Future was expected to be done: %s", future);
        return (V) com.google.common.util.concurrent.Uninterruptibles.getUninterruptibly(future);
    }

    @com.google.common.util.concurrent.ParametricNullness
    public static <V, X extends java.lang.Exception> V getChecked(java.util.concurrent.Future<V> future, java.lang.Class<X> cls) throws java.lang.Exception {
        return (V) com.google.common.util.concurrent.FuturesGetChecked.getChecked(future, cls);
    }

    @com.google.common.util.concurrent.ParametricNullness
    public static <V, X extends java.lang.Exception> V getChecked(java.util.concurrent.Future<V> future, java.lang.Class<X> cls, long j, java.util.concurrent.TimeUnit timeUnit) throws java.lang.Exception {
        return (V) com.google.common.util.concurrent.FuturesGetChecked.getChecked(future, cls, j, timeUnit);
    }

    @com.google.common.util.concurrent.ParametricNullness
    public static <V> V getUnchecked(java.util.concurrent.Future<V> future) {
        com.google.common.base.Preconditions.checkNotNull(future);
        try {
            return (V) com.google.common.util.concurrent.Uninterruptibles.getUninterruptibly(future);
        } catch (java.util.concurrent.ExecutionException e) {
            wrapAndThrowUnchecked(e.getCause());
            throw new java.lang.AssertionError();
        }
    }

    private static void wrapAndThrowUnchecked(java.lang.Throwable cause) {
        if (cause instanceof java.lang.Error) {
            throw new com.google.common.util.concurrent.ExecutionError((java.lang.Error) cause);
        }
        throw new com.google.common.util.concurrent.UncheckedExecutionException(cause);
    }
}
