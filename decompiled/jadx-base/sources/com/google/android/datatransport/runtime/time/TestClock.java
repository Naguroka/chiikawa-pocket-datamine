package com.google.android.datatransport.runtime.time;

/* JADX INFO: loaded from: classes4.dex */
public class TestClock implements com.google.android.datatransport.runtime.time.Clock {
    private final java.util.concurrent.atomic.AtomicLong timestamp;

    public TestClock(long j) {
        this.timestamp = new java.util.concurrent.atomic.AtomicLong(j);
    }

    @Override // com.google.android.datatransport.runtime.time.Clock
    public long getTime() {
        return this.timestamp.get();
    }

    public void tick() {
        advance(1L);
    }

    public void advance(long j) {
        if (j < 0) {
            throw new java.lang.IllegalArgumentException("cannot advance time backwards.");
        }
        this.timestamp.addAndGet(j);
    }
}
