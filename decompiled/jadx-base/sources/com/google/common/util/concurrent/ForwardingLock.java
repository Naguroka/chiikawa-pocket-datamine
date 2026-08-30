package com.google.common.util.concurrent;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.util.concurrent.ElementTypesAreNonnullByDefault
abstract class ForwardingLock implements java.util.concurrent.locks.Lock {
    abstract java.util.concurrent.locks.Lock delegate();

    ForwardingLock() {
    }

    @Override // java.util.concurrent.locks.Lock
    public void lock() {
        delegate().lock();
    }

    @Override // java.util.concurrent.locks.Lock
    public void lockInterruptibly() throws java.lang.InterruptedException {
        delegate().lockInterruptibly();
    }

    @Override // java.util.concurrent.locks.Lock
    public boolean tryLock() {
        return delegate().tryLock();
    }

    @Override // java.util.concurrent.locks.Lock
    public boolean tryLock(long time, java.util.concurrent.TimeUnit unit) throws java.lang.InterruptedException {
        return delegate().tryLock(time, unit);
    }

    @Override // java.util.concurrent.locks.Lock
    public void unlock() {
        delegate().unlock();
    }

    @Override // java.util.concurrent.locks.Lock
    public java.util.concurrent.locks.Condition newCondition() {
        return delegate().newCondition();
    }
}
