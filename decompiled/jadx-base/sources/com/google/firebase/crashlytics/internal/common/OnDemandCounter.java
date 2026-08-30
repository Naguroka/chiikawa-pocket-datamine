package com.google.firebase.crashlytics.internal.common;

/* JADX INFO: loaded from: classes5.dex */
public final class OnDemandCounter {
    private final java.util.concurrent.atomic.AtomicInteger recordedOnDemandExceptions = new java.util.concurrent.atomic.AtomicInteger();
    private final java.util.concurrent.atomic.AtomicInteger droppedOnDemandExceptions = new java.util.concurrent.atomic.AtomicInteger();

    public int getRecordedOnDemandExceptions() {
        return this.recordedOnDemandExceptions.get();
    }

    public void incrementRecordedOnDemandExceptions() {
        this.recordedOnDemandExceptions.getAndIncrement();
    }

    public int getDroppedOnDemandExceptions() {
        return this.droppedOnDemandExceptions.get();
    }

    public void incrementDroppedOnDemandExceptions() {
        this.droppedOnDemandExceptions.getAndIncrement();
    }

    public void resetDroppedOnDemandExceptions() {
        this.droppedOnDemandExceptions.set(0);
    }
}
