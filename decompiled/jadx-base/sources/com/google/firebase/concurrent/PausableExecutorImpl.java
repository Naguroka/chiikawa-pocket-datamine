package com.google.firebase.concurrent;

/* JADX INFO: loaded from: classes5.dex */
final class PausableExecutorImpl implements com.google.firebase.concurrent.PausableExecutor {
    private final java.util.concurrent.Executor delegate;
    private volatile boolean paused;
    final java.util.concurrent.LinkedBlockingQueue<java.lang.Runnable> queue = new java.util.concurrent.LinkedBlockingQueue<>();

    PausableExecutorImpl(boolean z, java.util.concurrent.Executor executor) {
        this.paused = z;
        this.delegate = executor;
    }

    @Override // java.util.concurrent.Executor
    public void execute(java.lang.Runnable runnable) {
        this.queue.offer(runnable);
        maybeEnqueueNext();
    }

    private void maybeEnqueueNext() {
        if (this.paused) {
            return;
        }
        java.lang.Runnable runnablePoll = this.queue.poll();
        while (runnablePoll != null) {
            this.delegate.execute(runnablePoll);
            runnablePoll = !this.paused ? this.queue.poll() : null;
        }
    }

    @Override // com.google.firebase.concurrent.PausableExecutor
    public void pause() {
        this.paused = true;
    }

    @Override // com.google.firebase.concurrent.PausableExecutor
    public void resume() {
        this.paused = false;
        maybeEnqueueNext();
    }

    @Override // com.google.firebase.concurrent.PausableExecutor
    public boolean isPaused() {
        return this.paused;
    }
}
