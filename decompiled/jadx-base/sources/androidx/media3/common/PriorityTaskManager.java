package androidx.media3.common;

/* JADX INFO: loaded from: classes.dex */
public final class PriorityTaskManager {
    private final java.lang.Object lock = new java.lang.Object();
    private final java.util.PriorityQueue<java.lang.Integer> queue = new java.util.PriorityQueue<>(10, java.util.Collections.reverseOrder());
    private int highestPriority = Integer.MIN_VALUE;

    public static class PriorityTooLowException extends java.io.IOException {
        public PriorityTooLowException(int i, int i2) {
            super("Priority too low [priority=" + i + ", highest=" + i2 + com.ironsource.y8.i.e);
        }
    }

    public void add(int i) {
        synchronized (this.lock) {
            this.queue.add(java.lang.Integer.valueOf(i));
            this.highestPriority = java.lang.Math.max(this.highestPriority, i);
        }
    }

    public void proceed(int i) throws java.lang.InterruptedException {
        synchronized (this.lock) {
            while (this.highestPriority != i) {
                this.lock.wait();
            }
        }
    }

    public boolean proceedNonBlocking(int i) {
        boolean z;
        synchronized (this.lock) {
            z = this.highestPriority == i;
        }
        return z;
    }

    public void proceedOrThrow(int i) throws androidx.media3.common.PriorityTaskManager.PriorityTooLowException {
        synchronized (this.lock) {
            if (this.highestPriority != i) {
                throw new androidx.media3.common.PriorityTaskManager.PriorityTooLowException(i, this.highestPriority);
            }
        }
    }

    public void remove(int i) {
        synchronized (this.lock) {
            this.queue.remove(java.lang.Integer.valueOf(i));
            this.highestPriority = this.queue.isEmpty() ? Integer.MIN_VALUE : ((java.lang.Integer) androidx.media3.common.util.Util.castNonNull(this.queue.peek())).intValue();
            this.lock.notifyAll();
        }
    }
}
