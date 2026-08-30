package com.google.common.util.concurrent;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.util.concurrent.ElementTypesAreNonnullByDefault
abstract class InterruptibleTask<T> extends java.util.concurrent.atomic.AtomicReference<java.lang.Runnable> implements java.lang.Runnable {
    private static final java.lang.Runnable DONE;
    private static final int MAX_BUSY_WAIT_SPINS = 1000;
    private static final java.lang.Runnable PARKED;

    abstract void afterRanInterruptiblyFailure(java.lang.Throwable error);

    abstract void afterRanInterruptiblySuccess(@com.google.common.util.concurrent.ParametricNullness T result);

    abstract boolean isDone();

    @com.google.common.util.concurrent.ParametricNullness
    abstract T runInterruptibly() throws java.lang.Exception;

    abstract java.lang.String toPendingString();

    InterruptibleTask() {
    }

    static {
        DONE = new com.google.common.util.concurrent.InterruptibleTask.DoNothingRunnable();
        PARKED = new com.google.common.util.concurrent.InterruptibleTask.DoNothingRunnable();
    }

    private static final class DoNothingRunnable implements java.lang.Runnable {
        @Override // java.lang.Runnable
        public void run() {
        }

        private DoNothingRunnable() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Thread threadCurrentThread = java.lang.Thread.currentThread();
        java.lang.Object objRunInterruptibly = null;
        if (compareAndSet(null, threadCurrentThread)) {
            boolean z = !isDone();
            if (z) {
                try {
                    objRunInterruptibly = runInterruptibly();
                } catch (java.lang.Throwable th) {
                    try {
                        com.google.common.util.concurrent.Platform.restoreInterruptIfIsInterruptedException(th);
                        if (!compareAndSet(threadCurrentThread, DONE)) {
                            waitForInterrupt(threadCurrentThread);
                        }
                        if (z) {
                            afterRanInterruptiblyFailure(th);
                            return;
                        }
                        return;
                    } catch (java.lang.Throwable th2) {
                        if (!compareAndSet(threadCurrentThread, DONE)) {
                            waitForInterrupt(threadCurrentThread);
                        }
                        if (z) {
                            afterRanInterruptiblySuccess(com.google.common.util.concurrent.NullnessCasts.uncheckedCastNullableTToT(null));
                        }
                        throw th2;
                    }
                }
            }
            if (!compareAndSet(threadCurrentThread, DONE)) {
                waitForInterrupt(threadCurrentThread);
            }
            if (z) {
                afterRanInterruptiblySuccess(com.google.common.util.concurrent.NullnessCasts.uncheckedCastNullableTToT(objRunInterruptibly));
            }
        }
    }

    private void waitForInterrupt(java.lang.Thread currentThread) {
        java.lang.Runnable runnable = get();
        com.google.common.util.concurrent.InterruptibleTask.Blocker blocker = null;
        boolean z = false;
        int i = 0;
        while (true) {
            boolean z2 = runnable instanceof com.google.common.util.concurrent.InterruptibleTask.Blocker;
            if (!z2 && runnable != PARKED) {
                break;
            }
            if (z2) {
                blocker = (com.google.common.util.concurrent.InterruptibleTask.Blocker) runnable;
            }
            i++;
            if (i > 1000) {
                java.lang.Runnable runnable2 = PARKED;
                if (runnable == runnable2 || compareAndSet(runnable, runnable2)) {
                    z = java.lang.Thread.interrupted() || z;
                    java.util.concurrent.locks.LockSupport.park(blocker);
                }
            } else {
                java.lang.Thread.yield();
            }
            runnable = get();
        }
        if (z) {
            currentThread.interrupt();
        }
    }

    final void interruptTask() {
        java.lang.Runnable runnable = get();
        if (runnable instanceof java.lang.Thread) {
            com.google.common.util.concurrent.InterruptibleTask.Blocker blocker = new com.google.common.util.concurrent.InterruptibleTask.Blocker();
            blocker.setOwner(java.lang.Thread.currentThread());
            if (compareAndSet(runnable, blocker)) {
                try {
                    ((java.lang.Thread) runnable).interrupt();
                } finally {
                    if (getAndSet(DONE) == PARKED) {
                        java.util.concurrent.locks.LockSupport.unpark((java.lang.Thread) runnable);
                    }
                }
            }
        }
    }

    static final class Blocker extends java.util.concurrent.locks.AbstractOwnableSynchronizer implements java.lang.Runnable {
        private final com.google.common.util.concurrent.InterruptibleTask<?> task;

        @Override // java.lang.Runnable
        public void run() {
        }

        private Blocker(com.google.common.util.concurrent.InterruptibleTask<?> task) {
            this.task = task;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOwner(java.lang.Thread thread) {
            super.setExclusiveOwnerThread(thread);
        }

        @javax.annotation.CheckForNull
        java.lang.Thread getOwner() {
            return super.getExclusiveOwnerThread();
        }

        public java.lang.String toString() {
            return this.task.toString();
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final java.lang.String toString() {
        java.lang.String str;
        java.lang.Runnable runnable = get();
        if (runnable == DONE) {
            str = "running=[DONE]";
        } else if (runnable instanceof com.google.common.util.concurrent.InterruptibleTask.Blocker) {
            str = "running=[INTERRUPTED]";
        } else {
            str = runnable instanceof java.lang.Thread ? "running=[RUNNING ON " + ((java.lang.Thread) runnable).getName() + com.ironsource.y8.i.e : "running=[NOT STARTED YET]";
        }
        return str + ", " + toPendingString();
    }
}
