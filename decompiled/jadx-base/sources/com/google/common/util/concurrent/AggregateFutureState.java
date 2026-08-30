package com.google.common.util.concurrent;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.util.concurrent.ElementTypesAreNonnullByDefault
abstract class AggregateFutureState<OutputT> extends com.google.common.util.concurrent.AbstractFuture.TrustedFuture<OutputT> {
    private static final com.google.common.util.concurrent.AggregateFutureState.AtomicHelper ATOMIC_HELPER;
    private static final com.google.common.util.concurrent.LazyLogger log = new com.google.common.util.concurrent.LazyLogger(com.google.common.util.concurrent.AggregateFutureState.class);
    private volatile int remaining;

    @javax.annotation.CheckForNull
    private volatile java.util.Set<java.lang.Throwable> seenExceptions = null;

    abstract void addInitialException(java.util.Set<java.lang.Throwable> seen);

    static /* synthetic */ int access$306(com.google.common.util.concurrent.AggregateFutureState aggregateFutureState) {
        int i = aggregateFutureState.remaining - 1;
        aggregateFutureState.remaining = i;
        return i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        com.google.common.util.concurrent.AggregateFutureState.AtomicHelper synchronizedAtomicHelper;
        java.lang.Throwable th = null;
        java.lang.Object[] objArr = 0;
        try {
            synchronizedAtomicHelper = new com.google.common.util.concurrent.AggregateFutureState.SafeAtomicHelper(java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(com.google.common.util.concurrent.AggregateFutureState.class, java.util.Set.class, "seenExceptions"), java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(com.google.common.util.concurrent.AggregateFutureState.class, "remaining"));
        } catch (java.lang.Throwable th2) {
            synchronizedAtomicHelper = new com.google.common.util.concurrent.AggregateFutureState.SynchronizedAtomicHelper();
            th = th2;
        }
        ATOMIC_HELPER = synchronizedAtomicHelper;
        if (th != null) {
            log.get().log(java.util.logging.Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
    }

    AggregateFutureState(int remainingFutures) {
        this.remaining = remainingFutures;
    }

    final java.util.Set<java.lang.Throwable> getOrInitSeenExceptions() {
        java.util.Set<java.lang.Throwable> set = this.seenExceptions;
        if (set != null) {
            return set;
        }
        java.util.Set<java.lang.Throwable> setNewConcurrentHashSet = com.google.common.collect.Sets.newConcurrentHashSet();
        addInitialException(setNewConcurrentHashSet);
        ATOMIC_HELPER.compareAndSetSeenExceptions(this, null, setNewConcurrentHashSet);
        return (java.util.Set) java.util.Objects.requireNonNull(this.seenExceptions);
    }

    final int decrementRemainingAndGet() {
        return ATOMIC_HELPER.decrementAndGetRemainingCount(this);
    }

    final void clearSeenExceptions() {
        this.seenExceptions = null;
    }

    private static abstract class AtomicHelper {
        abstract void compareAndSetSeenExceptions(com.google.common.util.concurrent.AggregateFutureState<?> state, @javax.annotation.CheckForNull java.util.Set<java.lang.Throwable> expect, java.util.Set<java.lang.Throwable> update);

        abstract int decrementAndGetRemainingCount(com.google.common.util.concurrent.AggregateFutureState<?> state);

        private AtomicHelper() {
        }
    }

    private static final class SafeAtomicHelper extends com.google.common.util.concurrent.AggregateFutureState.AtomicHelper {
        final java.util.concurrent.atomic.AtomicIntegerFieldUpdater<com.google.common.util.concurrent.AggregateFutureState<?>> remainingCountUpdater;
        final java.util.concurrent.atomic.AtomicReferenceFieldUpdater<com.google.common.util.concurrent.AggregateFutureState<?>, java.util.Set<java.lang.Throwable>> seenExceptionsUpdater;

        SafeAtomicHelper(java.util.concurrent.atomic.AtomicReferenceFieldUpdater seenExceptionsUpdater, java.util.concurrent.atomic.AtomicIntegerFieldUpdater remainingCountUpdater) {
            super();
            this.seenExceptionsUpdater = seenExceptionsUpdater;
            this.remainingCountUpdater = remainingCountUpdater;
        }

        @Override // com.google.common.util.concurrent.AggregateFutureState.AtomicHelper
        void compareAndSetSeenExceptions(com.google.common.util.concurrent.AggregateFutureState<?> state, @javax.annotation.CheckForNull java.util.Set<java.lang.Throwable> expect, java.util.Set<java.lang.Throwable> update) {
            kotlin.UByte$$ExternalSyntheticBackport0.m(this.seenExceptionsUpdater, state, expect, update);
        }

        @Override // com.google.common.util.concurrent.AggregateFutureState.AtomicHelper
        int decrementAndGetRemainingCount(com.google.common.util.concurrent.AggregateFutureState<?> state) {
            return this.remainingCountUpdater.decrementAndGet(state);
        }
    }

    private static final class SynchronizedAtomicHelper extends com.google.common.util.concurrent.AggregateFutureState.AtomicHelper {
        private SynchronizedAtomicHelper() {
            super();
        }

        @Override // com.google.common.util.concurrent.AggregateFutureState.AtomicHelper
        void compareAndSetSeenExceptions(com.google.common.util.concurrent.AggregateFutureState<?> state, @javax.annotation.CheckForNull java.util.Set<java.lang.Throwable> expect, java.util.Set<java.lang.Throwable> update) {
            synchronized (state) {
                if (((com.google.common.util.concurrent.AggregateFutureState) state).seenExceptions == expect) {
                    ((com.google.common.util.concurrent.AggregateFutureState) state).seenExceptions = update;
                }
            }
        }

        @Override // com.google.common.util.concurrent.AggregateFutureState.AtomicHelper
        int decrementAndGetRemainingCount(com.google.common.util.concurrent.AggregateFutureState<?> state) {
            int iAccess$306;
            synchronized (state) {
                iAccess$306 = com.google.common.util.concurrent.AggregateFutureState.access$306(state);
            }
            return iAccess$306;
        }
    }
}
