package com.google.common.util.concurrent;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.util.concurrent.ElementTypesAreNonnullByDefault
public final class Monitor {

    @javax.annotation.CheckForNull
    private com.google.common.util.concurrent.Monitor.Guard activeGuards;
    private final boolean fair;
    private final java.util.concurrent.locks.ReentrantLock lock;

    public static abstract class Guard {
        final java.util.concurrent.locks.Condition condition;
        final com.google.common.util.concurrent.Monitor monitor;

        @javax.annotation.CheckForNull
        com.google.common.util.concurrent.Monitor.Guard next;
        int waiterCount = 0;

        public abstract boolean isSatisfied();

        protected Guard(com.google.common.util.concurrent.Monitor monitor) {
            this.monitor = (com.google.common.util.concurrent.Monitor) com.google.common.base.Preconditions.checkNotNull(monitor, "monitor");
            this.condition = monitor.lock.newCondition();
        }
    }

    public Monitor() {
        this(false);
    }

    public Monitor(boolean fair) {
        this.activeGuards = null;
        this.fair = fair;
        this.lock = new java.util.concurrent.locks.ReentrantLock(fair);
    }

    public void enter() {
        this.lock.lock();
    }

    public boolean enter(long time, java.util.concurrent.TimeUnit unit) throws java.lang.Throwable {
        boolean zTryLock;
        long safeNanos = toSafeNanos(time, unit);
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.lock;
        boolean z = true;
        if (!this.fair && reentrantLock.tryLock()) {
            return true;
        }
        boolean zInterrupted = java.lang.Thread.interrupted();
        try {
            long jNanoTime = java.lang.System.nanoTime();
            long jRemainingNanos = safeNanos;
            while (true) {
                try {
                    try {
                        zTryLock = reentrantLock.tryLock(jRemainingNanos, java.util.concurrent.TimeUnit.NANOSECONDS);
                        break;
                    } catch (java.lang.Throwable th) {
                        th = th;
                        if (z) {
                            java.lang.Thread.currentThread().interrupt();
                        }
                        throw th;
                    }
                } catch (java.lang.InterruptedException unused) {
                    jRemainingNanos = remainingNanos(jNanoTime, safeNanos);
                    zInterrupted = true;
                }
            }
            if (zInterrupted) {
                java.lang.Thread.currentThread().interrupt();
            }
            return zTryLock;
        } catch (java.lang.Throwable th2) {
            th = th2;
            z = zInterrupted;
        }
    }

    public void enterInterruptibly() throws java.lang.InterruptedException {
        this.lock.lockInterruptibly();
    }

    public boolean enterInterruptibly(long time, java.util.concurrent.TimeUnit unit) throws java.lang.InterruptedException {
        return this.lock.tryLock(time, unit);
    }

    public boolean tryEnter() {
        return this.lock.tryLock();
    }

    public void enterWhen(com.google.common.util.concurrent.Monitor.Guard guard) throws java.lang.InterruptedException {
        if (guard.monitor != this) {
            throw new java.lang.IllegalMonitorStateException();
        }
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.lock;
        boolean zIsHeldByCurrentThread = reentrantLock.isHeldByCurrentThread();
        reentrantLock.lockInterruptibly();
        try {
            if (guard.isSatisfied()) {
                return;
            }
            await(guard, zIsHeldByCurrentThread);
        } catch (java.lang.Throwable th) {
            leave();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0029  */
    /* JADX WARN: Code duplicated, block: B:15:0x0033 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:24:0x0049  */
    public boolean enterWhen(com.google.common.util.concurrent.Monitor.Guard guard, long time, java.util.concurrent.TimeUnit unit) throws java.lang.InterruptedException {
        long jInitNanoTime;
        boolean z;
        long safeNanos = toSafeNanos(time, unit);
        if (guard.monitor != this) {
            throw new java.lang.IllegalMonitorStateException();
        }
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.lock;
        boolean zIsHeldByCurrentThread = reentrantLock.isHeldByCurrentThread();
        if (!this.fair) {
            if (java.lang.Thread.interrupted()) {
                throw new java.lang.InterruptedException();
            }
            if (reentrantLock.tryLock()) {
                jInitNanoTime = 0;
            } else {
                jInitNanoTime = initNanoTime(safeNanos);
                if (!reentrantLock.tryLock(time, unit)) {
                    return false;
                }
            }
        } else {
            jInitNanoTime = initNanoTime(safeNanos);
            if (!reentrantLock.tryLock(time, unit)) {
                return false;
            }
        }
        try {
            if (!guard.isSatisfied()) {
                if (jInitNanoTime != 0) {
                    safeNanos = remainingNanos(jInitNanoTime, safeNanos);
                }
                z = awaitNanos(guard, safeNanos, zIsHeldByCurrentThread);
            }
            if (!z) {
                reentrantLock.unlock();
            }
            return z;
        } catch (java.lang.Throwable th) {
            if (!zIsHeldByCurrentThread) {
                try {
                    signalNextWaiter();
                } finally {
                    reentrantLock.unlock();
                }
            }
            throw th;
        }
    }

    public void enterWhenUninterruptibly(com.google.common.util.concurrent.Monitor.Guard guard) {
        if (guard.monitor != this) {
            throw new java.lang.IllegalMonitorStateException();
        }
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.lock;
        boolean zIsHeldByCurrentThread = reentrantLock.isHeldByCurrentThread();
        reentrantLock.lock();
        try {
            if (guard.isSatisfied()) {
                return;
            }
            awaitUninterruptibly(guard, zIsHeldByCurrentThread);
        } catch (java.lang.Throwable th) {
            leave();
            throw th;
        }
    }

    public boolean enterWhenUninterruptibly(com.google.common.util.concurrent.Monitor.Guard guard, long time, java.util.concurrent.TimeUnit unit) throws java.lang.Throwable {
        long jInitNanoTime;
        long jRemainingNanos;
        long safeNanos = toSafeNanos(time, unit);
        if (guard.monitor != this) {
            throw new java.lang.IllegalMonitorStateException();
        }
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.lock;
        boolean zIsHeldByCurrentThread = reentrantLock.isHeldByCurrentThread();
        boolean zInterrupted = java.lang.Thread.interrupted();
        try {
            boolean zAwaitNanos = true;
            if (this.fair || !reentrantLock.tryLock()) {
                jInitNanoTime = initNanoTime(safeNanos);
                long jRemainingNanos2 = safeNanos;
                while (true) {
                    try {
                        try {
                            break;
                        } catch (java.lang.Throwable th) {
                            th = th;
                            zInterrupted = true;
                            if (zInterrupted) {
                                java.lang.Thread.currentThread().interrupt();
                            }
                            throw th;
                        }
                    } catch (java.lang.InterruptedException unused) {
                        jRemainingNanos2 = remainingNanos(jInitNanoTime, safeNanos);
                        zInterrupted = true;
                    }
                }
                if (!reentrantLock.tryLock(jRemainingNanos2, java.util.concurrent.TimeUnit.NANOSECONDS)) {
                    if (zInterrupted) {
                        java.lang.Thread.currentThread().interrupt();
                    }
                    return false;
                }
            } else {
                jInitNanoTime = 0;
            }
            while (!guard.isSatisfied()) {
                try {
                    if (jInitNanoTime == 0) {
                        jInitNanoTime = initNanoTime(safeNanos);
                        jRemainingNanos = safeNanos;
                    } else {
                        jRemainingNanos = remainingNanos(jInitNanoTime, safeNanos);
                    }
                    zAwaitNanos = awaitNanos(guard, jRemainingNanos, zIsHeldByCurrentThread);
                } catch (java.lang.InterruptedException unused2) {
                    zIsHeldByCurrentThread = false;
                    zInterrupted = zAwaitNanos;
                } catch (java.lang.Throwable th2) {
                    reentrantLock.unlock();
                    throw th2;
                }
            }
            if (!zAwaitNanos) {
                reentrantLock.unlock();
            }
            if (zInterrupted) {
                java.lang.Thread.currentThread().interrupt();
            }
            return zAwaitNanos;
        } catch (java.lang.Throwable th3) {
            th = th3;
        }
    }

    public boolean enterIf(com.google.common.util.concurrent.Monitor.Guard guard) {
        if (guard.monitor != this) {
            throw new java.lang.IllegalMonitorStateException();
        }
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            boolean zIsSatisfied = guard.isSatisfied();
            if (!zIsSatisfied) {
                reentrantLock.unlock();
            }
            return zIsSatisfied;
        } catch (java.lang.Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public boolean enterIf(com.google.common.util.concurrent.Monitor.Guard guard, long time, java.util.concurrent.TimeUnit unit) {
        if (guard.monitor != this) {
            throw new java.lang.IllegalMonitorStateException();
        }
        if (!enter(time, unit)) {
            return false;
        }
        try {
            boolean zIsSatisfied = guard.isSatisfied();
            if (!zIsSatisfied) {
                this.lock.unlock();
            }
            return zIsSatisfied;
        } catch (java.lang.Throwable th) {
            this.lock.unlock();
            throw th;
        }
    }

    public boolean enterIfInterruptibly(com.google.common.util.concurrent.Monitor.Guard guard) throws java.lang.InterruptedException {
        if (guard.monitor != this) {
            throw new java.lang.IllegalMonitorStateException();
        }
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.lock;
        reentrantLock.lockInterruptibly();
        try {
            boolean zIsSatisfied = guard.isSatisfied();
            if (!zIsSatisfied) {
                reentrantLock.unlock();
            }
            return zIsSatisfied;
        } catch (java.lang.Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public boolean enterIfInterruptibly(com.google.common.util.concurrent.Monitor.Guard guard, long time, java.util.concurrent.TimeUnit unit) throws java.lang.InterruptedException {
        if (guard.monitor != this) {
            throw new java.lang.IllegalMonitorStateException();
        }
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.lock;
        if (!reentrantLock.tryLock(time, unit)) {
            return false;
        }
        try {
            boolean zIsSatisfied = guard.isSatisfied();
            if (!zIsSatisfied) {
                reentrantLock.unlock();
            }
            return zIsSatisfied;
        } catch (java.lang.Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public boolean tryEnterIf(com.google.common.util.concurrent.Monitor.Guard guard) {
        if (guard.monitor != this) {
            throw new java.lang.IllegalMonitorStateException();
        }
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.lock;
        if (!reentrantLock.tryLock()) {
            return false;
        }
        try {
            boolean zIsSatisfied = guard.isSatisfied();
            if (!zIsSatisfied) {
                reentrantLock.unlock();
            }
            return zIsSatisfied;
        } catch (java.lang.Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public void waitFor(com.google.common.util.concurrent.Monitor.Guard guard) throws java.lang.InterruptedException {
        if (guard.monitor != this || !this.lock.isHeldByCurrentThread()) {
            throw new java.lang.IllegalMonitorStateException();
        }
        if (guard.isSatisfied()) {
            return;
        }
        await(guard, true);
    }

    public boolean waitFor(com.google.common.util.concurrent.Monitor.Guard guard, long time, java.util.concurrent.TimeUnit unit) throws java.lang.InterruptedException {
        long safeNanos = toSafeNanos(time, unit);
        if (guard.monitor != this || !this.lock.isHeldByCurrentThread()) {
            throw new java.lang.IllegalMonitorStateException();
        }
        if (guard.isSatisfied()) {
            return true;
        }
        if (java.lang.Thread.interrupted()) {
            throw new java.lang.InterruptedException();
        }
        return awaitNanos(guard, safeNanos, true);
    }

    public void waitForUninterruptibly(com.google.common.util.concurrent.Monitor.Guard guard) {
        if (guard.monitor != this || !this.lock.isHeldByCurrentThread()) {
            throw new java.lang.IllegalMonitorStateException();
        }
        if (guard.isSatisfied()) {
            return;
        }
        awaitUninterruptibly(guard, true);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x004b  */
    public boolean waitForUninterruptibly(com.google.common.util.concurrent.Monitor.Guard guard, long time, java.util.concurrent.TimeUnit unit) throws java.lang.Throwable {
        long safeNanos = toSafeNanos(time, unit);
        if (guard.monitor != this || !this.lock.isHeldByCurrentThread()) {
            throw new java.lang.IllegalMonitorStateException();
        }
        boolean z = true;
        if (guard.isSatisfied()) {
            return true;
        }
        long jInitNanoTime = initNanoTime(safeNanos);
        boolean zInterrupted = java.lang.Thread.interrupted();
        long jRemainingNanos = safeNanos;
        boolean z2 = true;
        while (true) {
            try {
                try {
                    boolean zAwaitNanos = awaitNanos(guard, jRemainingNanos, z2);
                    if (zInterrupted) {
                        java.lang.Thread.currentThread().interrupt();
                    }
                    return zAwaitNanos;
                } catch (java.lang.Throwable th) {
                    th = th;
                    if (z) {
                        java.lang.Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            } catch (java.lang.InterruptedException unused) {
                if (!guard.isSatisfied()) {
                    jRemainingNanos = remainingNanos(jInitNanoTime, safeNanos);
                    z2 = false;
                    zInterrupted = true;
                } else {
                    java.lang.Thread.currentThread().interrupt();
                    return true;
                }
            } catch (java.lang.Throwable th2) {
                th = th2;
                z = zInterrupted;
                if (z) {
                    java.lang.Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
    }

    public void leave() {
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.lock;
        try {
            if (reentrantLock.getHoldCount() == 1) {
                signalNextWaiter();
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public boolean isFair() {
        return this.fair;
    }

    public boolean isOccupied() {
        return this.lock.isLocked();
    }

    public boolean isOccupiedByCurrentThread() {
        return this.lock.isHeldByCurrentThread();
    }

    public int getOccupiedDepth() {
        return this.lock.getHoldCount();
    }

    public int getQueueLength() {
        return this.lock.getQueueLength();
    }

    public boolean hasQueuedThreads() {
        return this.lock.hasQueuedThreads();
    }

    public boolean hasQueuedThread(java.lang.Thread thread) {
        return this.lock.hasQueuedThread(thread);
    }

    public boolean hasWaiters(com.google.common.util.concurrent.Monitor.Guard guard) {
        return getWaitQueueLength(guard) > 0;
    }

    public int getWaitQueueLength(com.google.common.util.concurrent.Monitor.Guard guard) {
        if (guard.monitor != this) {
            throw new java.lang.IllegalMonitorStateException();
        }
        this.lock.lock();
        try {
            return guard.waiterCount;
        } finally {
            this.lock.unlock();
        }
    }

    private static long toSafeNanos(long time, java.util.concurrent.TimeUnit unit) {
        return com.google.common.primitives.Longs.constrainToRange(unit.toNanos(time), 0L, 6917529027641081853L);
    }

    private static long initNanoTime(long timeoutNanos) {
        if (timeoutNanos <= 0) {
            return 0L;
        }
        long jNanoTime = java.lang.System.nanoTime();
        if (jNanoTime == 0) {
            return 1L;
        }
        return jNanoTime;
    }

    private static long remainingNanos(long startTime, long timeoutNanos) {
        if (timeoutNanos <= 0) {
            return 0L;
        }
        return timeoutNanos - (java.lang.System.nanoTime() - startTime);
    }

    private void signalNextWaiter() {
        for (com.google.common.util.concurrent.Monitor.Guard guard = this.activeGuards; guard != null; guard = guard.next) {
            if (isSatisfied(guard)) {
                guard.condition.signal();
                return;
            }
        }
    }

    private boolean isSatisfied(com.google.common.util.concurrent.Monitor.Guard guard) {
        try {
            return guard.isSatisfied();
        } catch (java.lang.Throwable th) {
            signalAllWaiters();
            throw th;
        }
    }

    private void signalAllWaiters() {
        for (com.google.common.util.concurrent.Monitor.Guard guard = this.activeGuards; guard != null; guard = guard.next) {
            guard.condition.signalAll();
        }
    }

    private void beginWaitingFor(com.google.common.util.concurrent.Monitor.Guard guard) {
        int i = guard.waiterCount;
        guard.waiterCount = i + 1;
        if (i == 0) {
            guard.next = this.activeGuards;
            this.activeGuards = guard;
        }
    }

    private void endWaitingFor(com.google.common.util.concurrent.Monitor.Guard guard) {
        int i = guard.waiterCount - 1;
        guard.waiterCount = i;
        if (i == 0) {
            com.google.common.util.concurrent.Monitor.Guard guard2 = this.activeGuards;
            com.google.common.util.concurrent.Monitor.Guard guard3 = null;
            while (guard2 != guard) {
                guard3 = guard2;
                guard2 = guard2.next;
            }
            if (guard3 == null) {
                this.activeGuards = guard2.next;
            } else {
                guard3.next = guard2.next;
            }
            guard2.next = null;
        }
    }

    private void await(com.google.common.util.concurrent.Monitor.Guard guard, boolean signalBeforeWaiting) throws java.lang.InterruptedException {
        if (signalBeforeWaiting) {
            signalNextWaiter();
        }
        beginWaitingFor(guard);
        do {
            try {
                guard.condition.await();
            } finally {
                endWaitingFor(guard);
            }
        } while (!guard.isSatisfied());
    }

    private void awaitUninterruptibly(com.google.common.util.concurrent.Monitor.Guard guard, boolean signalBeforeWaiting) {
        if (signalBeforeWaiting) {
            signalNextWaiter();
        }
        beginWaitingFor(guard);
        do {
            try {
                guard.condition.awaitUninterruptibly();
            } finally {
                endWaitingFor(guard);
            }
        } while (!guard.isSatisfied());
    }

    private boolean awaitNanos(com.google.common.util.concurrent.Monitor.Guard guard, long nanos, boolean signalBeforeWaiting) throws java.lang.InterruptedException {
        boolean z = true;
        while (nanos > 0) {
            if (z) {
                if (signalBeforeWaiting) {
                    try {
                        signalNextWaiter();
                    } catch (java.lang.Throwable th) {
                        if (!z) {
                            endWaitingFor(guard);
                        }
                        throw th;
                    }
                }
                beginWaitingFor(guard);
                z = false;
            }
            nanos = guard.condition.awaitNanos(nanos);
            if (guard.isSatisfied()) {
                if (!z) {
                    endWaitingFor(guard);
                }
                return true;
            }
        }
        if (!z) {
            endWaitingFor(guard);
        }
        return false;
    }
}
