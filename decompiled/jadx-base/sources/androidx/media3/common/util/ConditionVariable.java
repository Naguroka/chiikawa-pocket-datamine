package androidx.media3.common.util;

/* JADX INFO: loaded from: classes.dex */
public class ConditionVariable {
    private final androidx.media3.common.util.Clock clock;
    private boolean isOpen;

    public ConditionVariable() {
        this(androidx.media3.common.util.Clock.DEFAULT);
    }

    public ConditionVariable(androidx.media3.common.util.Clock clock) {
        this.clock = clock;
    }

    public synchronized boolean open() {
        if (this.isOpen) {
            return false;
        }
        this.isOpen = true;
        notifyAll();
        return true;
    }

    public synchronized boolean close() {
        boolean z;
        z = this.isOpen;
        this.isOpen = false;
        return z;
    }

    public synchronized void block() throws java.lang.InterruptedException {
        while (!this.isOpen) {
            wait();
        }
    }

    public synchronized boolean block(long j) throws java.lang.InterruptedException {
        try {
            if (j <= 0) {
                return this.isOpen;
            }
            long jElapsedRealtime = this.clock.elapsedRealtime();
            long j2 = j + jElapsedRealtime;
            if (j2 < jElapsedRealtime) {
                block();
            } else {
                while (!this.isOpen && jElapsedRealtime < j2) {
                    wait(j2 - jElapsedRealtime);
                    jElapsedRealtime = this.clock.elapsedRealtime();
                }
            }
            return this.isOpen;
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    public synchronized void blockUninterruptible() {
        boolean z = false;
        while (!this.isOpen) {
            try {
                wait();
            } catch (java.lang.InterruptedException unused) {
                z = true;
            }
        }
        if (z) {
            java.lang.Thread.currentThread().interrupt();
        }
    }

    public synchronized boolean isOpen() {
        return this.isOpen;
    }
}
