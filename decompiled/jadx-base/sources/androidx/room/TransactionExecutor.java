package androidx.room;

/* JADX INFO: loaded from: classes3.dex */
class TransactionExecutor implements java.util.concurrent.Executor {
    private java.lang.Runnable mActive;
    private final java.util.concurrent.Executor mExecutor;
    private final java.util.ArrayDeque<java.lang.Runnable> mTasks = new java.util.ArrayDeque<>();

    TransactionExecutor(java.util.concurrent.Executor executor) {
        this.mExecutor = executor;
    }

    @Override // java.util.concurrent.Executor
    public synchronized void execute(final java.lang.Runnable runnable) {
        this.mTasks.offer(new java.lang.Runnable() { // from class: androidx.room.TransactionExecutor.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    runnable.run();
                } finally {
                    androidx.room.TransactionExecutor.this.scheduleNext();
                }
            }
        });
        if (this.mActive == null) {
            scheduleNext();
        }
    }

    synchronized void scheduleNext() {
        java.lang.Runnable runnablePoll = this.mTasks.poll();
        this.mActive = runnablePoll;
        if (runnablePoll != null) {
            this.mExecutor.execute(runnablePoll);
        }
    }
}
