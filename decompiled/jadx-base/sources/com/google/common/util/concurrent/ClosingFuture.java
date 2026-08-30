package com.google.common.util.concurrent;

/* JADX INFO: loaded from: classes5.dex */
@com.google.errorprone.annotations.DoNotMock("Use ClosingFuture.from(Futures.immediate*Future)")
@com.google.common.util.concurrent.ElementTypesAreNonnullByDefault
public final class ClosingFuture<V> {
    private static final com.google.common.util.concurrent.LazyLogger logger = new com.google.common.util.concurrent.LazyLogger(com.google.common.util.concurrent.ClosingFuture.class);
    private final com.google.common.util.concurrent.ClosingFuture.CloseableList closeables;
    private final com.google.common.util.concurrent.FluentFuture<V> future;
    private final java.util.concurrent.atomic.AtomicReference<com.google.common.util.concurrent.ClosingFuture.State> state;

    public interface AsyncClosingCallable<V> {
        com.google.common.util.concurrent.ClosingFuture<V> call(com.google.common.util.concurrent.ClosingFuture.DeferredCloser closer) throws java.lang.Exception;
    }

    public interface AsyncClosingFunction<T, U> {
        com.google.common.util.concurrent.ClosingFuture<U> apply(com.google.common.util.concurrent.ClosingFuture.DeferredCloser closer, @com.google.common.util.concurrent.ParametricNullness T input) throws java.lang.Exception;
    }

    public interface ClosingCallable<V> {
        @com.google.common.util.concurrent.ParametricNullness
        V call(com.google.common.util.concurrent.ClosingFuture.DeferredCloser closer) throws java.lang.Exception;
    }

    public interface ClosingFunction<T, U> {
        @com.google.common.util.concurrent.ParametricNullness
        U apply(com.google.common.util.concurrent.ClosingFuture.DeferredCloser closer, @com.google.common.util.concurrent.ParametricNullness T input) throws java.lang.Exception;
    }

    enum State {
        OPEN,
        SUBSUMED,
        WILL_CLOSE,
        CLOSING,
        CLOSED,
        WILL_CREATE_VALUE_AND_CLOSER
    }

    public interface ValueAndCloserConsumer<V> {
        void accept(com.google.common.util.concurrent.ClosingFuture.ValueAndCloser<V> valueAndCloser);
    }

    public static final class DeferredCloser {
        private final com.google.common.util.concurrent.ClosingFuture.CloseableList list;

        DeferredCloser(com.google.common.util.concurrent.ClosingFuture.CloseableList list) {
            this.list = list;
        }

        @com.google.common.util.concurrent.ParametricNullness
        public <C extends java.io.Closeable> C eventuallyClose(@com.google.common.util.concurrent.ParametricNullness C closeable, java.util.concurrent.Executor closingExecutor) {
            com.google.common.base.Preconditions.checkNotNull(closingExecutor);
            if (closeable != null) {
                this.list.add(closeable, closingExecutor);
            }
            return closeable;
        }
    }

    public static final class ValueAndCloser<V> {
        private final com.google.common.util.concurrent.ClosingFuture<? extends V> closingFuture;

        ValueAndCloser(com.google.common.util.concurrent.ClosingFuture<? extends V> closingFuture) {
            this.closingFuture = (com.google.common.util.concurrent.ClosingFuture) com.google.common.base.Preconditions.checkNotNull(closingFuture);
        }

        @com.google.common.util.concurrent.ParametricNullness
        public V get() throws java.util.concurrent.ExecutionException {
            return (V) com.google.common.util.concurrent.Futures.getDone(((com.google.common.util.concurrent.ClosingFuture) this.closingFuture).future);
        }

        public void closeAsync() {
            this.closingFuture.close();
        }
    }

    public static <V> com.google.common.util.concurrent.ClosingFuture<V> submit(com.google.common.util.concurrent.ClosingFuture.ClosingCallable<V> callable, java.util.concurrent.Executor executor) {
        return new com.google.common.util.concurrent.ClosingFuture<>(callable, executor);
    }

    public static <V> com.google.common.util.concurrent.ClosingFuture<V> submitAsync(com.google.common.util.concurrent.ClosingFuture.AsyncClosingCallable<V> callable, java.util.concurrent.Executor executor) {
        return new com.google.common.util.concurrent.ClosingFuture<>(callable, executor);
    }

    public static <V> com.google.common.util.concurrent.ClosingFuture<V> from(com.google.common.util.concurrent.ListenableFuture<V> future) {
        return new com.google.common.util.concurrent.ClosingFuture<>(future);
    }

    @java.lang.Deprecated
    public static <C extends java.io.Closeable> com.google.common.util.concurrent.ClosingFuture<C> eventuallyClosing(com.google.common.util.concurrent.ListenableFuture<C> future, final java.util.concurrent.Executor closingExecutor) {
        com.google.common.base.Preconditions.checkNotNull(closingExecutor);
        com.google.common.util.concurrent.ClosingFuture<C> closingFuture = new com.google.common.util.concurrent.ClosingFuture<>(com.google.common.util.concurrent.Futures.nonCancellationPropagating(future));
        com.google.common.util.concurrent.Futures.addCallback(future, new com.google.common.util.concurrent.FutureCallback<java.io.Closeable>() { // from class: com.google.common.util.concurrent.ClosingFuture.1
            @Override // com.google.common.util.concurrent.FutureCallback
            public void onFailure(java.lang.Throwable t) {
            }

            @Override // com.google.common.util.concurrent.FutureCallback
            public void onSuccess(@javax.annotation.CheckForNull java.io.Closeable result) {
                com.google.common.util.concurrent.ClosingFuture.this.closeables.closer.eventuallyClose(result, closingExecutor);
            }
        }, com.google.common.util.concurrent.MoreExecutors.directExecutor());
        return closingFuture;
    }

    public static com.google.common.util.concurrent.ClosingFuture.Combiner whenAllComplete(java.lang.Iterable<? extends com.google.common.util.concurrent.ClosingFuture<?>> futures) {
        return new com.google.common.util.concurrent.ClosingFuture.Combiner(false, futures);
    }

    public static com.google.common.util.concurrent.ClosingFuture.Combiner whenAllComplete(com.google.common.util.concurrent.ClosingFuture<?> future1, com.google.common.util.concurrent.ClosingFuture<?>... moreFutures) {
        return whenAllComplete(com.google.common.collect.Lists.asList(future1, moreFutures));
    }

    public static com.google.common.util.concurrent.ClosingFuture.Combiner whenAllSucceed(java.lang.Iterable<? extends com.google.common.util.concurrent.ClosingFuture<?>> futures) {
        return new com.google.common.util.concurrent.ClosingFuture.Combiner(true, futures);
    }

    public static <V1, V2> com.google.common.util.concurrent.ClosingFuture.Combiner2<V1, V2> whenAllSucceed(com.google.common.util.concurrent.ClosingFuture<V1> future1, com.google.common.util.concurrent.ClosingFuture<V2> future2) {
        return new com.google.common.util.concurrent.ClosingFuture.Combiner2<>(future2);
    }

    public static <V1, V2, V3> com.google.common.util.concurrent.ClosingFuture.Combiner3<V1, V2, V3> whenAllSucceed(com.google.common.util.concurrent.ClosingFuture<V1> future1, com.google.common.util.concurrent.ClosingFuture<V2> future2, com.google.common.util.concurrent.ClosingFuture<V3> future3) {
        return new com.google.common.util.concurrent.ClosingFuture.Combiner3<>(future2, future3);
    }

    public static <V1, V2, V3, V4> com.google.common.util.concurrent.ClosingFuture.Combiner4<V1, V2, V3, V4> whenAllSucceed(com.google.common.util.concurrent.ClosingFuture<V1> future1, com.google.common.util.concurrent.ClosingFuture<V2> future2, com.google.common.util.concurrent.ClosingFuture<V3> future3, com.google.common.util.concurrent.ClosingFuture<V4> future4) {
        return new com.google.common.util.concurrent.ClosingFuture.Combiner4<>(future2, future3, future4);
    }

    public static <V1, V2, V3, V4, V5> com.google.common.util.concurrent.ClosingFuture.Combiner5<V1, V2, V3, V4, V5> whenAllSucceed(com.google.common.util.concurrent.ClosingFuture<V1> future1, com.google.common.util.concurrent.ClosingFuture<V2> future2, com.google.common.util.concurrent.ClosingFuture<V3> future3, com.google.common.util.concurrent.ClosingFuture<V4> future4, com.google.common.util.concurrent.ClosingFuture<V5> future5) {
        return new com.google.common.util.concurrent.ClosingFuture.Combiner5<>(future2, future3, future4, future5);
    }

    public static com.google.common.util.concurrent.ClosingFuture.Combiner whenAllSucceed(com.google.common.util.concurrent.ClosingFuture<?> future1, com.google.common.util.concurrent.ClosingFuture<?> future2, com.google.common.util.concurrent.ClosingFuture<?> future3, com.google.common.util.concurrent.ClosingFuture<?> future4, com.google.common.util.concurrent.ClosingFuture<?> future5, com.google.common.util.concurrent.ClosingFuture<?> future6, com.google.common.util.concurrent.ClosingFuture<?>... moreFutures) {
        return whenAllSucceed(com.google.common.collect.FluentIterable.of(future1, future2, future3, future4, future5, future6).append(moreFutures));
    }

    private ClosingFuture(com.google.common.util.concurrent.ListenableFuture<V> future) {
        this.state = new java.util.concurrent.atomic.AtomicReference<>(com.google.common.util.concurrent.ClosingFuture.State.OPEN);
        this.closeables = new com.google.common.util.concurrent.ClosingFuture.CloseableList();
        this.future = com.google.common.util.concurrent.FluentFuture.from(future);
    }

    private ClosingFuture(final com.google.common.util.concurrent.ClosingFuture.ClosingCallable<V> callable, java.util.concurrent.Executor executor) {
        this.state = new java.util.concurrent.atomic.AtomicReference<>(com.google.common.util.concurrent.ClosingFuture.State.OPEN);
        this.closeables = new com.google.common.util.concurrent.ClosingFuture.CloseableList();
        com.google.common.base.Preconditions.checkNotNull(callable);
        com.google.common.util.concurrent.TrustedListenableFutureTask trustedListenableFutureTaskCreate = com.google.common.util.concurrent.TrustedListenableFutureTask.create(new java.util.concurrent.Callable<V>() { // from class: com.google.common.util.concurrent.ClosingFuture.2
            @Override // java.util.concurrent.Callable
            @com.google.common.util.concurrent.ParametricNullness
            public V call() throws java.lang.Exception {
                return (V) callable.call(com.google.common.util.concurrent.ClosingFuture.this.closeables.closer);
            }

            public java.lang.String toString() {
                return callable.toString();
            }
        });
        executor.execute(trustedListenableFutureTaskCreate);
        this.future = trustedListenableFutureTaskCreate;
    }

    private ClosingFuture(final com.google.common.util.concurrent.ClosingFuture.AsyncClosingCallable<V> callable, java.util.concurrent.Executor executor) {
        this.state = new java.util.concurrent.atomic.AtomicReference<>(com.google.common.util.concurrent.ClosingFuture.State.OPEN);
        this.closeables = new com.google.common.util.concurrent.ClosingFuture.CloseableList();
        com.google.common.base.Preconditions.checkNotNull(callable);
        com.google.common.util.concurrent.TrustedListenableFutureTask trustedListenableFutureTaskCreate = com.google.common.util.concurrent.TrustedListenableFutureTask.create(new com.google.common.util.concurrent.AsyncCallable<V>() { // from class: com.google.common.util.concurrent.ClosingFuture.3
            @Override // com.google.common.util.concurrent.AsyncCallable
            public com.google.common.util.concurrent.ListenableFuture<V> call() throws java.lang.Exception {
                com.google.common.util.concurrent.ClosingFuture.CloseableList closeableList = new com.google.common.util.concurrent.ClosingFuture.CloseableList();
                try {
                    com.google.common.util.concurrent.ClosingFuture<V> closingFutureCall = callable.call(closeableList.closer);
                    closingFutureCall.becomeSubsumedInto(com.google.common.util.concurrent.ClosingFuture.this.closeables);
                    return ((com.google.common.util.concurrent.ClosingFuture) closingFutureCall).future;
                } finally {
                    com.google.common.util.concurrent.ClosingFuture.this.closeables.add(closeableList, com.google.common.util.concurrent.MoreExecutors.directExecutor());
                }
            }

            public java.lang.String toString() {
                return callable.toString();
            }
        });
        executor.execute(trustedListenableFutureTaskCreate);
        this.future = trustedListenableFutureTaskCreate;
    }

    public com.google.common.util.concurrent.ListenableFuture<?> statusFuture() {
        return com.google.common.util.concurrent.Futures.nonCancellationPropagating(this.future.transform(com.google.common.base.Functions.constant(null), com.google.common.util.concurrent.MoreExecutors.directExecutor()));
    }

    public <U> com.google.common.util.concurrent.ClosingFuture<U> transform(final com.google.common.util.concurrent.ClosingFuture.ClosingFunction<? super V, U> function, java.util.concurrent.Executor executor) {
        com.google.common.base.Preconditions.checkNotNull(function);
        return derive(this.future.transformAsync(new com.google.common.util.concurrent.AsyncFunction<V, U>() { // from class: com.google.common.util.concurrent.ClosingFuture.4
            @Override // com.google.common.util.concurrent.AsyncFunction
            public com.google.common.util.concurrent.ListenableFuture<U> apply(V input) throws java.lang.Exception {
                return com.google.common.util.concurrent.ClosingFuture.this.closeables.applyClosingFunction(function, input);
            }

            public java.lang.String toString() {
                return function.toString();
            }
        }, executor));
    }

    public <U> com.google.common.util.concurrent.ClosingFuture<U> transformAsync(final com.google.common.util.concurrent.ClosingFuture.AsyncClosingFunction<? super V, U> function, java.util.concurrent.Executor executor) {
        com.google.common.base.Preconditions.checkNotNull(function);
        return derive(this.future.transformAsync(new com.google.common.util.concurrent.AsyncFunction<V, U>() { // from class: com.google.common.util.concurrent.ClosingFuture.5
            @Override // com.google.common.util.concurrent.AsyncFunction
            public com.google.common.util.concurrent.ListenableFuture<U> apply(V input) throws java.lang.Exception {
                return com.google.common.util.concurrent.ClosingFuture.this.closeables.applyAsyncClosingFunction(function, input);
            }

            public java.lang.String toString() {
                return function.toString();
            }
        }, executor));
    }

    public static <V, U> com.google.common.util.concurrent.ClosingFuture.AsyncClosingFunction<V, U> withoutCloser(final com.google.common.util.concurrent.AsyncFunction<V, U> function) {
        com.google.common.base.Preconditions.checkNotNull(function);
        return new com.google.common.util.concurrent.ClosingFuture.AsyncClosingFunction<V, U>() { // from class: com.google.common.util.concurrent.ClosingFuture.6
            @Override // com.google.common.util.concurrent.ClosingFuture.AsyncClosingFunction
            public com.google.common.util.concurrent.ClosingFuture<U> apply(com.google.common.util.concurrent.ClosingFuture.DeferredCloser closer, V input) throws java.lang.Exception {
                return com.google.common.util.concurrent.ClosingFuture.from(function.apply(input));
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <X extends java.lang.Throwable> com.google.common.util.concurrent.ClosingFuture<V> catching(java.lang.Class<X> exceptionType, com.google.common.util.concurrent.ClosingFuture.ClosingFunction<? super X, ? extends V> fallback, java.util.concurrent.Executor executor) {
        return catchingMoreGeneric(exceptionType, fallback, executor);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private <X extends java.lang.Throwable, W extends V> com.google.common.util.concurrent.ClosingFuture<V> catchingMoreGeneric(java.lang.Class<X> cls, final com.google.common.util.concurrent.ClosingFuture.ClosingFunction<? super X, W> closingFunction, java.util.concurrent.Executor executor) {
        com.google.common.base.Preconditions.checkNotNull(closingFunction);
        return (com.google.common.util.concurrent.ClosingFuture<V>) derive(this.future.catchingAsync(cls, new com.google.common.util.concurrent.AsyncFunction<X, W>() { // from class: com.google.common.util.concurrent.ClosingFuture.7
            /* JADX WARN: Incorrect types in method signature: (TX;)Lcom/google/common/util/concurrent/ListenableFuture<TW;>; */
            @Override // com.google.common.util.concurrent.AsyncFunction
            public com.google.common.util.concurrent.ListenableFuture apply(java.lang.Throwable exception) throws java.lang.Exception {
                return com.google.common.util.concurrent.ClosingFuture.this.closeables.applyClosingFunction(closingFunction, exception);
            }

            public java.lang.String toString() {
                return closingFunction.toString();
            }
        }, executor));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <X extends java.lang.Throwable> com.google.common.util.concurrent.ClosingFuture<V> catchingAsync(java.lang.Class<X> exceptionType, com.google.common.util.concurrent.ClosingFuture.AsyncClosingFunction<? super X, ? extends V> fallback, java.util.concurrent.Executor executor) {
        return catchingAsyncMoreGeneric(exceptionType, fallback, executor);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private <X extends java.lang.Throwable, W extends V> com.google.common.util.concurrent.ClosingFuture<V> catchingAsyncMoreGeneric(java.lang.Class<X> cls, final com.google.common.util.concurrent.ClosingFuture.AsyncClosingFunction<? super X, W> asyncClosingFunction, java.util.concurrent.Executor executor) {
        com.google.common.base.Preconditions.checkNotNull(asyncClosingFunction);
        return (com.google.common.util.concurrent.ClosingFuture<V>) derive(this.future.catchingAsync(cls, new com.google.common.util.concurrent.AsyncFunction<X, W>() { // from class: com.google.common.util.concurrent.ClosingFuture.8
            /* JADX WARN: Incorrect types in method signature: (TX;)Lcom/google/common/util/concurrent/ListenableFuture<TW;>; */
            @Override // com.google.common.util.concurrent.AsyncFunction
            public com.google.common.util.concurrent.ListenableFuture apply(java.lang.Throwable exception) throws java.lang.Exception {
                return com.google.common.util.concurrent.ClosingFuture.this.closeables.applyAsyncClosingFunction(asyncClosingFunction, exception);
            }

            public java.lang.String toString() {
                return asyncClosingFunction.toString();
            }
        }, executor));
    }

    public com.google.common.util.concurrent.FluentFuture<V> finishToFuture() {
        if (compareAndUpdateState(com.google.common.util.concurrent.ClosingFuture.State.OPEN, com.google.common.util.concurrent.ClosingFuture.State.WILL_CLOSE)) {
            logger.get().log(java.util.logging.Level.FINER, "will close {0}", this);
            this.future.addListener(new java.lang.Runnable() { // from class: com.google.common.util.concurrent.ClosingFuture.9
                @Override // java.lang.Runnable
                public void run() {
                    com.google.common.util.concurrent.ClosingFuture.this.checkAndUpdateState(com.google.common.util.concurrent.ClosingFuture.State.WILL_CLOSE, com.google.common.util.concurrent.ClosingFuture.State.CLOSING);
                    com.google.common.util.concurrent.ClosingFuture.this.close();
                    com.google.common.util.concurrent.ClosingFuture.this.checkAndUpdateState(com.google.common.util.concurrent.ClosingFuture.State.CLOSING, com.google.common.util.concurrent.ClosingFuture.State.CLOSED);
                }
            }, com.google.common.util.concurrent.MoreExecutors.directExecutor());
        } else {
            switch (com.google.common.util.concurrent.ClosingFuture.AnonymousClass11.$SwitchMap$com$google$common$util$concurrent$ClosingFuture$State[this.state.get().ordinal()]) {
                case 1:
                    throw new java.lang.IllegalStateException("Cannot call finishToFuture() after deriving another step");
                case 2:
                    throw new java.lang.IllegalStateException("Cannot call finishToFuture() after calling finishToValueAndCloser()");
                case 3:
                case 4:
                case 5:
                    throw new java.lang.IllegalStateException("Cannot call finishToFuture() twice");
                case 6:
                    throw new java.lang.AssertionError();
            }
        }
        return this.future;
    }

    /* JADX INFO: renamed from: com.google.common.util.concurrent.ClosingFuture$11, reason: invalid class name */
    static /* synthetic */ class AnonymousClass11 {
        static final /* synthetic */ int[] $SwitchMap$com$google$common$util$concurrent$ClosingFuture$State;

        static {
            int[] iArr = new int[com.google.common.util.concurrent.ClosingFuture.State.values().length];
            $SwitchMap$com$google$common$util$concurrent$ClosingFuture$State = iArr;
            try {
                iArr[com.google.common.util.concurrent.ClosingFuture.State.SUBSUMED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$common$util$concurrent$ClosingFuture$State[com.google.common.util.concurrent.ClosingFuture.State.WILL_CREATE_VALUE_AND_CLOSER.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$common$util$concurrent$ClosingFuture$State[com.google.common.util.concurrent.ClosingFuture.State.WILL_CLOSE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$common$util$concurrent$ClosingFuture$State[com.google.common.util.concurrent.ClosingFuture.State.CLOSING.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$common$util$concurrent$ClosingFuture$State[com.google.common.util.concurrent.ClosingFuture.State.CLOSED.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$common$util$concurrent$ClosingFuture$State[com.google.common.util.concurrent.ClosingFuture.State.OPEN.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
        }
    }

    public void finishToValueAndCloser(final com.google.common.util.concurrent.ClosingFuture.ValueAndCloserConsumer<? super V> consumer, java.util.concurrent.Executor executor) {
        com.google.common.base.Preconditions.checkNotNull(consumer);
        if (!compareAndUpdateState(com.google.common.util.concurrent.ClosingFuture.State.OPEN, com.google.common.util.concurrent.ClosingFuture.State.WILL_CREATE_VALUE_AND_CLOSER)) {
            int i = com.google.common.util.concurrent.ClosingFuture.AnonymousClass11.$SwitchMap$com$google$common$util$concurrent$ClosingFuture$State[this.state.get().ordinal()];
            if (i == 1) {
                throw new java.lang.IllegalStateException("Cannot call finishToValueAndCloser() after deriving another step");
            }
            if (i == 2) {
                throw new java.lang.IllegalStateException("Cannot call finishToValueAndCloser() twice");
            }
            if (i == 3 || i == 4 || i == 5) {
                throw new java.lang.IllegalStateException("Cannot call finishToValueAndCloser() after calling finishToFuture()");
            }
            throw new java.lang.AssertionError(this.state);
        }
        this.future.addListener(new java.lang.Runnable() { // from class: com.google.common.util.concurrent.ClosingFuture.10
            @Override // java.lang.Runnable
            public void run() {
                com.google.common.util.concurrent.ClosingFuture.provideValueAndCloser(consumer, com.google.common.util.concurrent.ClosingFuture.this);
            }
        }, executor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <C, V extends C> void provideValueAndCloser(com.google.common.util.concurrent.ClosingFuture.ValueAndCloserConsumer<C> consumer, com.google.common.util.concurrent.ClosingFuture<V> closingFuture) {
        consumer.accept(new com.google.common.util.concurrent.ClosingFuture.ValueAndCloser<>(closingFuture));
    }

    public boolean cancel(boolean mayInterruptIfRunning) {
        logger.get().log(java.util.logging.Level.FINER, "cancelling {0}", this);
        boolean zCancel = this.future.cancel(mayInterruptIfRunning);
        if (zCancel) {
            close();
        }
        return zCancel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void close() {
        logger.get().log(java.util.logging.Level.FINER, "closing {0}", this);
        this.closeables.close();
    }

    private <U> com.google.common.util.concurrent.ClosingFuture<U> derive(com.google.common.util.concurrent.FluentFuture<U> future) {
        com.google.common.util.concurrent.ClosingFuture<U> closingFuture = new com.google.common.util.concurrent.ClosingFuture<>(future);
        becomeSubsumedInto(closingFuture.closeables);
        return closingFuture;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void becomeSubsumedInto(com.google.common.util.concurrent.ClosingFuture.CloseableList otherCloseables) {
        checkAndUpdateState(com.google.common.util.concurrent.ClosingFuture.State.OPEN, com.google.common.util.concurrent.ClosingFuture.State.SUBSUMED);
        otherCloseables.add(this.closeables, com.google.common.util.concurrent.MoreExecutors.directExecutor());
    }

    public static final class Peeker {
        private volatile boolean beingCalled;
        private final com.google.common.collect.ImmutableList<com.google.common.util.concurrent.ClosingFuture<?>> futures;

        private Peeker(com.google.common.collect.ImmutableList<com.google.common.util.concurrent.ClosingFuture<?>> futures) {
            this.futures = (com.google.common.collect.ImmutableList) com.google.common.base.Preconditions.checkNotNull(futures);
        }

        @com.google.common.util.concurrent.ParametricNullness
        public final <D> D getDone(com.google.common.util.concurrent.ClosingFuture<D> closingFuture) throws java.util.concurrent.ExecutionException {
            com.google.common.base.Preconditions.checkState(this.beingCalled);
            com.google.common.base.Preconditions.checkArgument(this.futures.contains(closingFuture));
            return (D) com.google.common.util.concurrent.Futures.getDone(((com.google.common.util.concurrent.ClosingFuture) closingFuture).future);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @com.google.common.util.concurrent.ParametricNullness
        public <V> V call(com.google.common.util.concurrent.ClosingFuture.Combiner.CombiningCallable<V> combiner, com.google.common.util.concurrent.ClosingFuture.CloseableList closeables) throws java.lang.Exception {
            this.beingCalled = true;
            com.google.common.util.concurrent.ClosingFuture.CloseableList closeableList = new com.google.common.util.concurrent.ClosingFuture.CloseableList();
            try {
                return combiner.call(closeableList.closer, this);
            } finally {
                closeables.add(closeableList, com.google.common.util.concurrent.MoreExecutors.directExecutor());
                this.beingCalled = false;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public <V> com.google.common.util.concurrent.FluentFuture<V> callAsync(com.google.common.util.concurrent.ClosingFuture.Combiner.AsyncCombiningCallable<V> combiner, com.google.common.util.concurrent.ClosingFuture.CloseableList closeables) throws java.lang.Exception {
            this.beingCalled = true;
            com.google.common.util.concurrent.ClosingFuture.CloseableList closeableList = new com.google.common.util.concurrent.ClosingFuture.CloseableList();
            try {
                com.google.common.util.concurrent.ClosingFuture<V> closingFutureCall = combiner.call(closeableList.closer, this);
                closingFutureCall.becomeSubsumedInto(closeables);
                return ((com.google.common.util.concurrent.ClosingFuture) closingFutureCall).future;
            } finally {
                closeables.add(closeableList, com.google.common.util.concurrent.MoreExecutors.directExecutor());
                this.beingCalled = false;
            }
        }
    }

    @com.google.errorprone.annotations.DoNotMock("Use ClosingFuture.whenAllSucceed() or .whenAllComplete() instead.")
    public static class Combiner {
        private final boolean allMustSucceed;
        private final com.google.common.util.concurrent.ClosingFuture.CloseableList closeables;
        protected final com.google.common.collect.ImmutableList<com.google.common.util.concurrent.ClosingFuture<?>> inputs;

        public interface AsyncCombiningCallable<V> {
            com.google.common.util.concurrent.ClosingFuture<V> call(com.google.common.util.concurrent.ClosingFuture.DeferredCloser closer, com.google.common.util.concurrent.ClosingFuture.Peeker peeker) throws java.lang.Exception;
        }

        public interface CombiningCallable<V> {
            @com.google.common.util.concurrent.ParametricNullness
            V call(com.google.common.util.concurrent.ClosingFuture.DeferredCloser closer, com.google.common.util.concurrent.ClosingFuture.Peeker peeker) throws java.lang.Exception;
        }

        private Combiner(boolean allMustSucceed, java.lang.Iterable<? extends com.google.common.util.concurrent.ClosingFuture<?>> inputs) {
            this.closeables = new com.google.common.util.concurrent.ClosingFuture.CloseableList();
            this.allMustSucceed = allMustSucceed;
            this.inputs = com.google.common.collect.ImmutableList.copyOf(inputs);
            java.util.Iterator<? extends com.google.common.util.concurrent.ClosingFuture<?>> it = inputs.iterator();
            while (it.hasNext()) {
                it.next().becomeSubsumedInto(this.closeables);
            }
        }

        public <V> com.google.common.util.concurrent.ClosingFuture<V> call(final com.google.common.util.concurrent.ClosingFuture.Combiner.CombiningCallable<V> combiningCallable, java.util.concurrent.Executor executor) {
            com.google.common.util.concurrent.ClosingFuture<V> closingFuture = new com.google.common.util.concurrent.ClosingFuture<>(futureCombiner().call(new java.util.concurrent.Callable<V>() { // from class: com.google.common.util.concurrent.ClosingFuture.Combiner.1
                @Override // java.util.concurrent.Callable
                @com.google.common.util.concurrent.ParametricNullness
                public V call() throws java.lang.Exception {
                    return (V) new com.google.common.util.concurrent.ClosingFuture.Peeker(com.google.common.util.concurrent.ClosingFuture.Combiner.this.inputs).call(combiningCallable, com.google.common.util.concurrent.ClosingFuture.Combiner.this.closeables);
                }

                public java.lang.String toString() {
                    return combiningCallable.toString();
                }
            }, executor));
            ((com.google.common.util.concurrent.ClosingFuture) closingFuture).closeables.add(this.closeables, com.google.common.util.concurrent.MoreExecutors.directExecutor());
            return closingFuture;
        }

        public <V> com.google.common.util.concurrent.ClosingFuture<V> callAsync(final com.google.common.util.concurrent.ClosingFuture.Combiner.AsyncCombiningCallable<V> asyncCombiningCallable, java.util.concurrent.Executor executor) {
            com.google.common.util.concurrent.ClosingFuture<V> closingFuture = new com.google.common.util.concurrent.ClosingFuture<>(futureCombiner().callAsync(new com.google.common.util.concurrent.AsyncCallable<V>() { // from class: com.google.common.util.concurrent.ClosingFuture.Combiner.2
                @Override // com.google.common.util.concurrent.AsyncCallable
                public com.google.common.util.concurrent.ListenableFuture<V> call() throws java.lang.Exception {
                    return new com.google.common.util.concurrent.ClosingFuture.Peeker(com.google.common.util.concurrent.ClosingFuture.Combiner.this.inputs).callAsync(asyncCombiningCallable, com.google.common.util.concurrent.ClosingFuture.Combiner.this.closeables);
                }

                public java.lang.String toString() {
                    return asyncCombiningCallable.toString();
                }
            }, executor));
            ((com.google.common.util.concurrent.ClosingFuture) closingFuture).closeables.add(this.closeables, com.google.common.util.concurrent.MoreExecutors.directExecutor());
            return closingFuture;
        }

        private com.google.common.util.concurrent.Futures.FutureCombiner<java.lang.Object> futureCombiner() {
            if (this.allMustSucceed) {
                return com.google.common.util.concurrent.Futures.whenAllSucceed(inputFutures());
            }
            return com.google.common.util.concurrent.Futures.whenAllComplete(inputFutures());
        }

        private com.google.common.collect.ImmutableList<com.google.common.util.concurrent.FluentFuture<?>> inputFutures() {
            return com.google.common.collect.FluentIterable.from(this.inputs).transform(new com.google.common.base.Function() { // from class: com.google.common.util.concurrent.ClosingFuture$Combiner$$ExternalSyntheticLambda0
                @Override // com.google.common.base.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return ((com.google.common.util.concurrent.ClosingFuture) obj).future;
                }
            }).toList();
        }
    }

    public static final class Combiner2<V1, V2> extends com.google.common.util.concurrent.ClosingFuture.Combiner {
        private final com.google.common.util.concurrent.ClosingFuture<V1> future1;
        private final com.google.common.util.concurrent.ClosingFuture<V2> future2;

        public interface AsyncClosingFunction2<V1, V2, U> {
            com.google.common.util.concurrent.ClosingFuture<U> apply(com.google.common.util.concurrent.ClosingFuture.DeferredCloser closer, @com.google.common.util.concurrent.ParametricNullness V1 value1, @com.google.common.util.concurrent.ParametricNullness V2 value2) throws java.lang.Exception;
        }

        public interface ClosingFunction2<V1, V2, U> {
            @com.google.common.util.concurrent.ParametricNullness
            U apply(com.google.common.util.concurrent.ClosingFuture.DeferredCloser closer, @com.google.common.util.concurrent.ParametricNullness V1 value1, @com.google.common.util.concurrent.ParametricNullness V2 value2) throws java.lang.Exception;
        }

        private Combiner2(com.google.common.util.concurrent.ClosingFuture<V1> future1, com.google.common.util.concurrent.ClosingFuture<V2> future2) {
            super(true, com.google.common.collect.ImmutableList.of((com.google.common.util.concurrent.ClosingFuture<V2>) future1, future2));
            this.future1 = future1;
            this.future2 = future2;
        }

        public <U> com.google.common.util.concurrent.ClosingFuture<U> call(final com.google.common.util.concurrent.ClosingFuture.Combiner2.ClosingFunction2<V1, V2, U> function, java.util.concurrent.Executor executor) {
            return call(new com.google.common.util.concurrent.ClosingFuture.Combiner.CombiningCallable<U>() { // from class: com.google.common.util.concurrent.ClosingFuture.Combiner2.1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.common.util.concurrent.ClosingFuture.Combiner.CombiningCallable
                @com.google.common.util.concurrent.ParametricNullness
                public U call(com.google.common.util.concurrent.ClosingFuture.DeferredCloser deferredCloser, com.google.common.util.concurrent.ClosingFuture.Peeker peeker) throws java.lang.Exception {
                    return (U) function.apply(deferredCloser, peeker.getDone(com.google.common.util.concurrent.ClosingFuture.Combiner2.this.future1), peeker.getDone(com.google.common.util.concurrent.ClosingFuture.Combiner2.this.future2));
                }

                public java.lang.String toString() {
                    return function.toString();
                }
            }, executor);
        }

        public <U> com.google.common.util.concurrent.ClosingFuture<U> callAsync(final com.google.common.util.concurrent.ClosingFuture.Combiner2.AsyncClosingFunction2<V1, V2, U> function, java.util.concurrent.Executor executor) {
            return callAsync(new com.google.common.util.concurrent.ClosingFuture.Combiner.AsyncCombiningCallable<U>() { // from class: com.google.common.util.concurrent.ClosingFuture.Combiner2.2
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.common.util.concurrent.ClosingFuture.Combiner.AsyncCombiningCallable
                public com.google.common.util.concurrent.ClosingFuture<U> call(com.google.common.util.concurrent.ClosingFuture.DeferredCloser closer, com.google.common.util.concurrent.ClosingFuture.Peeker peeker) throws java.lang.Exception {
                    return function.apply(closer, peeker.getDone(com.google.common.util.concurrent.ClosingFuture.Combiner2.this.future1), peeker.getDone(com.google.common.util.concurrent.ClosingFuture.Combiner2.this.future2));
                }

                public java.lang.String toString() {
                    return function.toString();
                }
            }, executor);
        }
    }

    public static final class Combiner3<V1, V2, V3> extends com.google.common.util.concurrent.ClosingFuture.Combiner {
        private final com.google.common.util.concurrent.ClosingFuture<V1> future1;
        private final com.google.common.util.concurrent.ClosingFuture<V2> future2;
        private final com.google.common.util.concurrent.ClosingFuture<V3> future3;

        public interface AsyncClosingFunction3<V1, V2, V3, U> {
            com.google.common.util.concurrent.ClosingFuture<U> apply(com.google.common.util.concurrent.ClosingFuture.DeferredCloser closer, @com.google.common.util.concurrent.ParametricNullness V1 value1, @com.google.common.util.concurrent.ParametricNullness V2 value2, @com.google.common.util.concurrent.ParametricNullness V3 value3) throws java.lang.Exception;
        }

        public interface ClosingFunction3<V1, V2, V3, U> {
            @com.google.common.util.concurrent.ParametricNullness
            U apply(com.google.common.util.concurrent.ClosingFuture.DeferredCloser closer, @com.google.common.util.concurrent.ParametricNullness V1 value1, @com.google.common.util.concurrent.ParametricNullness V2 value2, @com.google.common.util.concurrent.ParametricNullness V3 value3) throws java.lang.Exception;
        }

        private Combiner3(com.google.common.util.concurrent.ClosingFuture<V1> future1, com.google.common.util.concurrent.ClosingFuture<V2> future2, com.google.common.util.concurrent.ClosingFuture<V3> future3) {
            super(true, com.google.common.collect.ImmutableList.of((com.google.common.util.concurrent.ClosingFuture<V3>) future1, (com.google.common.util.concurrent.ClosingFuture<V3>) future2, future3));
            this.future1 = future1;
            this.future2 = future2;
            this.future3 = future3;
        }

        public <U> com.google.common.util.concurrent.ClosingFuture<U> call(final com.google.common.util.concurrent.ClosingFuture.Combiner3.ClosingFunction3<V1, V2, V3, U> function, java.util.concurrent.Executor executor) {
            return call(new com.google.common.util.concurrent.ClosingFuture.Combiner.CombiningCallable<U>() { // from class: com.google.common.util.concurrent.ClosingFuture.Combiner3.1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.common.util.concurrent.ClosingFuture.Combiner.CombiningCallable
                @com.google.common.util.concurrent.ParametricNullness
                public U call(com.google.common.util.concurrent.ClosingFuture.DeferredCloser deferredCloser, com.google.common.util.concurrent.ClosingFuture.Peeker peeker) throws java.lang.Exception {
                    return (U) function.apply(deferredCloser, peeker.getDone(com.google.common.util.concurrent.ClosingFuture.Combiner3.this.future1), peeker.getDone(com.google.common.util.concurrent.ClosingFuture.Combiner3.this.future2), peeker.getDone(com.google.common.util.concurrent.ClosingFuture.Combiner3.this.future3));
                }

                public java.lang.String toString() {
                    return function.toString();
                }
            }, executor);
        }

        public <U> com.google.common.util.concurrent.ClosingFuture<U> callAsync(final com.google.common.util.concurrent.ClosingFuture.Combiner3.AsyncClosingFunction3<V1, V2, V3, U> function, java.util.concurrent.Executor executor) {
            return callAsync(new com.google.common.util.concurrent.ClosingFuture.Combiner.AsyncCombiningCallable<U>() { // from class: com.google.common.util.concurrent.ClosingFuture.Combiner3.2
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.common.util.concurrent.ClosingFuture.Combiner.AsyncCombiningCallable
                public com.google.common.util.concurrent.ClosingFuture<U> call(com.google.common.util.concurrent.ClosingFuture.DeferredCloser closer, com.google.common.util.concurrent.ClosingFuture.Peeker peeker) throws java.lang.Exception {
                    return function.apply(closer, peeker.getDone(com.google.common.util.concurrent.ClosingFuture.Combiner3.this.future1), peeker.getDone(com.google.common.util.concurrent.ClosingFuture.Combiner3.this.future2), peeker.getDone(com.google.common.util.concurrent.ClosingFuture.Combiner3.this.future3));
                }

                public java.lang.String toString() {
                    return function.toString();
                }
            }, executor);
        }
    }

    public static final class Combiner4<V1, V2, V3, V4> extends com.google.common.util.concurrent.ClosingFuture.Combiner {
        private final com.google.common.util.concurrent.ClosingFuture<V1> future1;
        private final com.google.common.util.concurrent.ClosingFuture<V2> future2;
        private final com.google.common.util.concurrent.ClosingFuture<V3> future3;
        private final com.google.common.util.concurrent.ClosingFuture<V4> future4;

        public interface AsyncClosingFunction4<V1, V2, V3, V4, U> {
            com.google.common.util.concurrent.ClosingFuture<U> apply(com.google.common.util.concurrent.ClosingFuture.DeferredCloser closer, @com.google.common.util.concurrent.ParametricNullness V1 value1, @com.google.common.util.concurrent.ParametricNullness V2 value2, @com.google.common.util.concurrent.ParametricNullness V3 value3, @com.google.common.util.concurrent.ParametricNullness V4 value4) throws java.lang.Exception;
        }

        public interface ClosingFunction4<V1, V2, V3, V4, U> {
            @com.google.common.util.concurrent.ParametricNullness
            U apply(com.google.common.util.concurrent.ClosingFuture.DeferredCloser closer, @com.google.common.util.concurrent.ParametricNullness V1 value1, @com.google.common.util.concurrent.ParametricNullness V2 value2, @com.google.common.util.concurrent.ParametricNullness V3 value3, @com.google.common.util.concurrent.ParametricNullness V4 value4) throws java.lang.Exception;
        }

        private Combiner4(com.google.common.util.concurrent.ClosingFuture<V1> future1, com.google.common.util.concurrent.ClosingFuture<V2> future2, com.google.common.util.concurrent.ClosingFuture<V3> future3, com.google.common.util.concurrent.ClosingFuture<V4> future4) {
            super(true, com.google.common.collect.ImmutableList.of((com.google.common.util.concurrent.ClosingFuture<V4>) future1, (com.google.common.util.concurrent.ClosingFuture<V4>) future2, (com.google.common.util.concurrent.ClosingFuture<V4>) future3, future4));
            this.future1 = future1;
            this.future2 = future2;
            this.future3 = future3;
            this.future4 = future4;
        }

        public <U> com.google.common.util.concurrent.ClosingFuture<U> call(final com.google.common.util.concurrent.ClosingFuture.Combiner4.ClosingFunction4<V1, V2, V3, V4, U> function, java.util.concurrent.Executor executor) {
            return call(new com.google.common.util.concurrent.ClosingFuture.Combiner.CombiningCallable<U>() { // from class: com.google.common.util.concurrent.ClosingFuture.Combiner4.1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.common.util.concurrent.ClosingFuture.Combiner.CombiningCallable
                @com.google.common.util.concurrent.ParametricNullness
                public U call(com.google.common.util.concurrent.ClosingFuture.DeferredCloser deferredCloser, com.google.common.util.concurrent.ClosingFuture.Peeker peeker) throws java.lang.Exception {
                    return (U) function.apply(deferredCloser, peeker.getDone(com.google.common.util.concurrent.ClosingFuture.Combiner4.this.future1), peeker.getDone(com.google.common.util.concurrent.ClosingFuture.Combiner4.this.future2), peeker.getDone(com.google.common.util.concurrent.ClosingFuture.Combiner4.this.future3), peeker.getDone(com.google.common.util.concurrent.ClosingFuture.Combiner4.this.future4));
                }

                public java.lang.String toString() {
                    return function.toString();
                }
            }, executor);
        }

        public <U> com.google.common.util.concurrent.ClosingFuture<U> callAsync(final com.google.common.util.concurrent.ClosingFuture.Combiner4.AsyncClosingFunction4<V1, V2, V3, V4, U> function, java.util.concurrent.Executor executor) {
            return callAsync(new com.google.common.util.concurrent.ClosingFuture.Combiner.AsyncCombiningCallable<U>() { // from class: com.google.common.util.concurrent.ClosingFuture.Combiner4.2
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.common.util.concurrent.ClosingFuture.Combiner.AsyncCombiningCallable
                public com.google.common.util.concurrent.ClosingFuture<U> call(com.google.common.util.concurrent.ClosingFuture.DeferredCloser closer, com.google.common.util.concurrent.ClosingFuture.Peeker peeker) throws java.lang.Exception {
                    return function.apply(closer, peeker.getDone(com.google.common.util.concurrent.ClosingFuture.Combiner4.this.future1), peeker.getDone(com.google.common.util.concurrent.ClosingFuture.Combiner4.this.future2), peeker.getDone(com.google.common.util.concurrent.ClosingFuture.Combiner4.this.future3), peeker.getDone(com.google.common.util.concurrent.ClosingFuture.Combiner4.this.future4));
                }

                public java.lang.String toString() {
                    return function.toString();
                }
            }, executor);
        }
    }

    public static final class Combiner5<V1, V2, V3, V4, V5> extends com.google.common.util.concurrent.ClosingFuture.Combiner {
        private final com.google.common.util.concurrent.ClosingFuture<V1> future1;
        private final com.google.common.util.concurrent.ClosingFuture<V2> future2;
        private final com.google.common.util.concurrent.ClosingFuture<V3> future3;
        private final com.google.common.util.concurrent.ClosingFuture<V4> future4;
        private final com.google.common.util.concurrent.ClosingFuture<V5> future5;

        public interface AsyncClosingFunction5<V1, V2, V3, V4, V5, U> {
            com.google.common.util.concurrent.ClosingFuture<U> apply(com.google.common.util.concurrent.ClosingFuture.DeferredCloser closer, @com.google.common.util.concurrent.ParametricNullness V1 value1, @com.google.common.util.concurrent.ParametricNullness V2 value2, @com.google.common.util.concurrent.ParametricNullness V3 value3, @com.google.common.util.concurrent.ParametricNullness V4 value4, @com.google.common.util.concurrent.ParametricNullness V5 value5) throws java.lang.Exception;
        }

        public interface ClosingFunction5<V1, V2, V3, V4, V5, U> {
            @com.google.common.util.concurrent.ParametricNullness
            U apply(com.google.common.util.concurrent.ClosingFuture.DeferredCloser closer, @com.google.common.util.concurrent.ParametricNullness V1 value1, @com.google.common.util.concurrent.ParametricNullness V2 value2, @com.google.common.util.concurrent.ParametricNullness V3 value3, @com.google.common.util.concurrent.ParametricNullness V4 value4, @com.google.common.util.concurrent.ParametricNullness V5 value5) throws java.lang.Exception;
        }

        private Combiner5(com.google.common.util.concurrent.ClosingFuture<V1> future1, com.google.common.util.concurrent.ClosingFuture<V2> future2, com.google.common.util.concurrent.ClosingFuture<V3> future3, com.google.common.util.concurrent.ClosingFuture<V4> future4, com.google.common.util.concurrent.ClosingFuture<V5> future5) {
            super(true, com.google.common.collect.ImmutableList.of((com.google.common.util.concurrent.ClosingFuture<V5>) future1, (com.google.common.util.concurrent.ClosingFuture<V5>) future2, (com.google.common.util.concurrent.ClosingFuture<V5>) future3, (com.google.common.util.concurrent.ClosingFuture<V5>) future4, future5));
            this.future1 = future1;
            this.future2 = future2;
            this.future3 = future3;
            this.future4 = future4;
            this.future5 = future5;
        }

        public <U> com.google.common.util.concurrent.ClosingFuture<U> call(final com.google.common.util.concurrent.ClosingFuture.Combiner5.ClosingFunction5<V1, V2, V3, V4, V5, U> function, java.util.concurrent.Executor executor) {
            return call(new com.google.common.util.concurrent.ClosingFuture.Combiner.CombiningCallable<U>() { // from class: com.google.common.util.concurrent.ClosingFuture.Combiner5.1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.common.util.concurrent.ClosingFuture.Combiner.CombiningCallable
                @com.google.common.util.concurrent.ParametricNullness
                public U call(com.google.common.util.concurrent.ClosingFuture.DeferredCloser deferredCloser, com.google.common.util.concurrent.ClosingFuture.Peeker peeker) throws java.lang.Exception {
                    return (U) function.apply(deferredCloser, peeker.getDone(com.google.common.util.concurrent.ClosingFuture.Combiner5.this.future1), peeker.getDone(com.google.common.util.concurrent.ClosingFuture.Combiner5.this.future2), peeker.getDone(com.google.common.util.concurrent.ClosingFuture.Combiner5.this.future3), peeker.getDone(com.google.common.util.concurrent.ClosingFuture.Combiner5.this.future4), peeker.getDone(com.google.common.util.concurrent.ClosingFuture.Combiner5.this.future5));
                }

                public java.lang.String toString() {
                    return function.toString();
                }
            }, executor);
        }

        public <U> com.google.common.util.concurrent.ClosingFuture<U> callAsync(final com.google.common.util.concurrent.ClosingFuture.Combiner5.AsyncClosingFunction5<V1, V2, V3, V4, V5, U> function, java.util.concurrent.Executor executor) {
            return callAsync(new com.google.common.util.concurrent.ClosingFuture.Combiner.AsyncCombiningCallable<U>() { // from class: com.google.common.util.concurrent.ClosingFuture.Combiner5.2
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.common.util.concurrent.ClosingFuture.Combiner.AsyncCombiningCallable
                public com.google.common.util.concurrent.ClosingFuture<U> call(com.google.common.util.concurrent.ClosingFuture.DeferredCloser closer, com.google.common.util.concurrent.ClosingFuture.Peeker peeker) throws java.lang.Exception {
                    return function.apply(closer, peeker.getDone(com.google.common.util.concurrent.ClosingFuture.Combiner5.this.future1), peeker.getDone(com.google.common.util.concurrent.ClosingFuture.Combiner5.this.future2), peeker.getDone(com.google.common.util.concurrent.ClosingFuture.Combiner5.this.future3), peeker.getDone(com.google.common.util.concurrent.ClosingFuture.Combiner5.this.future4), peeker.getDone(com.google.common.util.concurrent.ClosingFuture.Combiner5.this.future5));
                }

                public java.lang.String toString() {
                    return function.toString();
                }
            }, executor);
        }
    }

    public java.lang.String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).add("state", this.state.get()).addValue(this.future).toString();
    }

    protected void finalize() {
        if (this.state.get().equals(com.google.common.util.concurrent.ClosingFuture.State.OPEN)) {
            logger.get().log(java.util.logging.Level.SEVERE, "Uh oh! An open ClosingFuture has leaked and will close: {0}", this);
            finishToFuture();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void closeQuietly(@javax.annotation.CheckForNull final java.io.Closeable closeable, java.util.concurrent.Executor executor) {
        if (closeable == null) {
            return;
        }
        try {
            executor.execute(new java.lang.Runnable() { // from class: com.google.common.util.concurrent.ClosingFuture$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    com.google.common.util.concurrent.ClosingFuture.lambda$closeQuietly$0(closeable);
                }
            });
        } catch (java.util.concurrent.RejectedExecutionException e) {
            com.google.common.util.concurrent.LazyLogger lazyLogger = logger;
            if (lazyLogger.get().isLoggable(java.util.logging.Level.WARNING)) {
                lazyLogger.get().log(java.util.logging.Level.WARNING, java.lang.String.format("while submitting close to %s; will close inline", executor), (java.lang.Throwable) e);
            }
            closeQuietly(closeable, com.google.common.util.concurrent.MoreExecutors.directExecutor());
        }
    }

    static /* synthetic */ void lambda$closeQuietly$0(java.io.Closeable closeable) {
        try {
            closeable.close();
        } catch (java.lang.Exception e) {
            com.google.common.util.concurrent.Platform.restoreInterruptIfIsInterruptedException(e);
            logger.get().log(java.util.logging.Level.WARNING, "thrown by close()", (java.lang.Throwable) e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkAndUpdateState(com.google.common.util.concurrent.ClosingFuture.State oldState, com.google.common.util.concurrent.ClosingFuture.State newState) {
        com.google.common.base.Preconditions.checkState(compareAndUpdateState(oldState, newState), "Expected state to be %s, but it was %s", oldState, newState);
    }

    private boolean compareAndUpdateState(com.google.common.util.concurrent.ClosingFuture.State oldState, com.google.common.util.concurrent.ClosingFuture.State newState) {
        return kotlin.UByte$$ExternalSyntheticBackport0.m(this.state, oldState, newState);
    }

    private static final class CloseableList extends java.util.IdentityHashMap<java.io.Closeable, java.util.concurrent.Executor> implements java.io.Closeable {
        private volatile boolean closed;
        private final com.google.common.util.concurrent.ClosingFuture.DeferredCloser closer;

        @javax.annotation.CheckForNull
        private volatile java.util.concurrent.CountDownLatch whenClosed;

        private CloseableList() {
            this.closer = new com.google.common.util.concurrent.ClosingFuture.DeferredCloser(this);
        }

        /* JADX WARN: Multi-variable type inference failed */
        <V, U> com.google.common.util.concurrent.ListenableFuture<U> applyClosingFunction(com.google.common.util.concurrent.ClosingFuture.ClosingFunction<? super V, U> transformation, @com.google.common.util.concurrent.ParametricNullness V input) throws java.lang.Exception {
            com.google.common.util.concurrent.ClosingFuture.CloseableList closeableList = new com.google.common.util.concurrent.ClosingFuture.CloseableList();
            try {
                return com.google.common.util.concurrent.Futures.immediateFuture(transformation.apply(closeableList.closer, input));
            } finally {
                add(closeableList, com.google.common.util.concurrent.MoreExecutors.directExecutor());
            }
        }

        <V, U> com.google.common.util.concurrent.FluentFuture<U> applyAsyncClosingFunction(com.google.common.util.concurrent.ClosingFuture.AsyncClosingFunction<V, U> transformation, @com.google.common.util.concurrent.ParametricNullness V input) throws java.lang.Exception {
            com.google.common.util.concurrent.ClosingFuture.CloseableList closeableList = new com.google.common.util.concurrent.ClosingFuture.CloseableList();
            try {
                com.google.common.util.concurrent.ClosingFuture<U> closingFutureApply = transformation.apply(closeableList.closer, input);
                closingFutureApply.becomeSubsumedInto(closeableList);
                return ((com.google.common.util.concurrent.ClosingFuture) closingFutureApply).future;
            } finally {
                add(closeableList, com.google.common.util.concurrent.MoreExecutors.directExecutor());
            }
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.closed) {
                return;
            }
            synchronized (this) {
                if (this.closed) {
                    return;
                }
                this.closed = true;
                for (java.util.Map.Entry<java.io.Closeable, java.util.concurrent.Executor> entry : entrySet()) {
                    com.google.common.util.concurrent.ClosingFuture.closeQuietly(entry.getKey(), entry.getValue());
                }
                clear();
                if (this.whenClosed != null) {
                    this.whenClosed.countDown();
                }
            }
        }

        void add(@javax.annotation.CheckForNull java.io.Closeable closeable, java.util.concurrent.Executor executor) {
            com.google.common.base.Preconditions.checkNotNull(executor);
            if (closeable == null) {
                return;
            }
            synchronized (this) {
                if (this.closed) {
                    com.google.common.util.concurrent.ClosingFuture.closeQuietly(closeable, executor);
                } else {
                    put(closeable, executor);
                }
            }
        }

        java.util.concurrent.CountDownLatch whenClosedCountDown() {
            if (this.closed) {
                return new java.util.concurrent.CountDownLatch(0);
            }
            synchronized (this) {
                if (this.closed) {
                    return new java.util.concurrent.CountDownLatch(0);
                }
                com.google.common.base.Preconditions.checkState(this.whenClosed == null);
                java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
                this.whenClosed = countDownLatch;
                return countDownLatch;
            }
        }
    }

    java.util.concurrent.CountDownLatch whenClosedCountDown() {
        return this.closeables.whenClosedCountDown();
    }
}
