package com.google.common.util.concurrent;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.util.concurrent.ElementTypesAreNonnullByDefault
abstract class AggregateFuture<InputT, OutputT> extends com.google.common.util.concurrent.AggregateFutureState<OutputT> {
    private static final com.google.common.util.concurrent.LazyLogger logger = new com.google.common.util.concurrent.LazyLogger(com.google.common.util.concurrent.AggregateFuture.class);
    private final boolean allMustSucceed;
    private final boolean collectsValues;

    @javax.annotation.CheckForNull
    private com.google.common.collect.ImmutableCollection<? extends com.google.common.util.concurrent.ListenableFuture<? extends InputT>> futures;

    enum ReleaseResourcesReason {
        OUTPUT_FUTURE_DONE,
        ALL_INPUT_FUTURES_PROCESSED
    }

    abstract void collectOneValue(int index, @com.google.common.util.concurrent.ParametricNullness InputT returnValue);

    abstract void handleAllCompleted();

    AggregateFuture(com.google.common.collect.ImmutableCollection<? extends com.google.common.util.concurrent.ListenableFuture<? extends InputT>> futures, boolean allMustSucceed, boolean collectsValues) {
        super(futures.size());
        this.futures = (com.google.common.collect.ImmutableCollection) com.google.common.base.Preconditions.checkNotNull(futures);
        this.allMustSucceed = allMustSucceed;
        this.collectsValues = collectsValues;
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    protected final void afterDone() {
        super.afterDone();
        com.google.common.collect.ImmutableCollection<? extends com.google.common.util.concurrent.ListenableFuture<? extends InputT>> immutableCollection = this.futures;
        releaseResources(com.google.common.util.concurrent.AggregateFuture.ReleaseResourcesReason.OUTPUT_FUTURE_DONE);
        if (isCancelled() && (immutableCollection != null)) {
            boolean zWasInterrupted = wasInterrupted();
            com.google.common.collect.UnmodifiableIterator<? extends com.google.common.util.concurrent.ListenableFuture<? extends InputT>> it = immutableCollection.iterator();
            while (it.hasNext()) {
                it.next().cancel(zWasInterrupted);
            }
        }
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    @javax.annotation.CheckForNull
    protected final java.lang.String pendingToString() {
        com.google.common.collect.ImmutableCollection<? extends com.google.common.util.concurrent.ListenableFuture<? extends InputT>> immutableCollection = this.futures;
        if (immutableCollection != null) {
            return "futures=" + immutableCollection;
        }
        return super.pendingToString();
    }

    final void init() {
        java.util.Objects.requireNonNull(this.futures);
        if (this.futures.isEmpty()) {
            handleAllCompleted();
            return;
        }
        if (this.allMustSucceed) {
            com.google.common.collect.UnmodifiableIterator<? extends com.google.common.util.concurrent.ListenableFuture<? extends InputT>> it = this.futures.iterator();
            final int i = 0;
            while (it.hasNext()) {
                final com.google.common.util.concurrent.ListenableFuture<? extends InputT> next = it.next();
                next.addListener(new java.lang.Runnable() { // from class: com.google.common.util.concurrent.AggregateFuture$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m811lambda$init$0$comgooglecommonutilconcurrentAggregateFuture(next, i);
                    }
                }, com.google.common.util.concurrent.MoreExecutors.directExecutor());
                i++;
            }
            return;
        }
        final com.google.common.collect.ImmutableCollection<? extends com.google.common.util.concurrent.ListenableFuture<? extends InputT>> immutableCollection = this.collectsValues ? this.futures : null;
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.google.common.util.concurrent.AggregateFuture$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m812lambda$init$1$comgooglecommonutilconcurrentAggregateFuture(immutableCollection);
            }
        };
        com.google.common.collect.UnmodifiableIterator<? extends com.google.common.util.concurrent.ListenableFuture<? extends InputT>> it2 = this.futures.iterator();
        while (it2.hasNext()) {
            it2.next().addListener(runnable, com.google.common.util.concurrent.MoreExecutors.directExecutor());
        }
    }

    /* JADX INFO: renamed from: lambda$init$0$com-google-common-util-concurrent-AggregateFuture, reason: not valid java name */
    /* synthetic */ void m811lambda$init$0$comgooglecommonutilconcurrentAggregateFuture(com.google.common.util.concurrent.ListenableFuture listenableFuture, int i) {
        try {
            if (listenableFuture.isCancelled()) {
                this.futures = null;
                cancel(false);
            } else {
                collectValueFromNonCancelledFuture(i, listenableFuture);
            }
        } finally {
            m812lambda$init$1$comgooglecommonutilconcurrentAggregateFuture(null);
        }
    }

    private void handleException(java.lang.Throwable throwable) {
        com.google.common.base.Preconditions.checkNotNull(throwable);
        if (this.allMustSucceed && !setException(throwable) && addCausalChain(getOrInitSeenExceptions(), throwable)) {
            log(throwable);
        } else if (throwable instanceof java.lang.Error) {
            log(throwable);
        }
    }

    private static void log(java.lang.Throwable throwable) {
        logger.get().log(java.util.logging.Level.SEVERE, throwable instanceof java.lang.Error ? "Input Future failed with Error" : "Got more than one input Future failure. Logging failures after the first", throwable);
    }

    @Override // com.google.common.util.concurrent.AggregateFutureState
    final void addInitialException(java.util.Set<java.lang.Throwable> seen) {
        com.google.common.base.Preconditions.checkNotNull(seen);
        if (isCancelled()) {
            return;
        }
        addCausalChain(seen, (java.lang.Throwable) java.util.Objects.requireNonNull(tryInternalFastPathGetFailure()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void collectValueFromNonCancelledFuture(int index, java.util.concurrent.Future<? extends InputT> future) {
        try {
            collectOneValue(index, com.google.common.util.concurrent.Futures.getDone(future));
        } catch (java.util.concurrent.ExecutionException e) {
            handleException(e.getCause());
        } catch (java.lang.Throwable th) {
            handleException(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: decrementCountAndMaybeComplete, reason: merged with bridge method [inline-methods] */
    public void m812lambda$init$1$comgooglecommonutilconcurrentAggregateFuture(@javax.annotation.CheckForNull com.google.common.collect.ImmutableCollection<? extends java.util.concurrent.Future<? extends InputT>> futuresIfNeedToCollectAtCompletion) {
        int iDecrementRemainingAndGet = decrementRemainingAndGet();
        com.google.common.base.Preconditions.checkState(iDecrementRemainingAndGet >= 0, "Less than 0 remaining futures");
        if (iDecrementRemainingAndGet == 0) {
            processCompleted(futuresIfNeedToCollectAtCompletion);
        }
    }

    private void processCompleted(@javax.annotation.CheckForNull com.google.common.collect.ImmutableCollection<? extends java.util.concurrent.Future<? extends InputT>> futuresIfNeedToCollectAtCompletion) {
        if (futuresIfNeedToCollectAtCompletion != null) {
            com.google.common.collect.UnmodifiableIterator<? extends java.util.concurrent.Future<? extends InputT>> it = futuresIfNeedToCollectAtCompletion.iterator();
            int i = 0;
            while (it.hasNext()) {
                java.util.concurrent.Future<? extends InputT> next = it.next();
                if (!next.isCancelled()) {
                    collectValueFromNonCancelledFuture(i, next);
                }
                i++;
            }
        }
        clearSeenExceptions();
        handleAllCompleted();
        releaseResources(com.google.common.util.concurrent.AggregateFuture.ReleaseResourcesReason.ALL_INPUT_FUTURES_PROCESSED);
    }

    void releaseResources(com.google.common.util.concurrent.AggregateFuture.ReleaseResourcesReason reason) {
        com.google.common.base.Preconditions.checkNotNull(reason);
        this.futures = null;
    }

    private static boolean addCausalChain(java.util.Set<java.lang.Throwable> seen, java.lang.Throwable param) {
        while (param != null) {
            if (!seen.add(param)) {
                return false;
            }
            param = param.getCause();
        }
        return true;
    }
}
