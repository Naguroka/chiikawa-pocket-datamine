package androidx.lifecycle;

/* JADX INFO: compiled from: DispatchQueue.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\n\u001a\u00020\u0004H\u0007J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\tH\u0007J\b\u0010\u0010\u001a\u00020\fH\u0007J\u0010\u0010\u0011\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\tH\u0003J\b\u0010\u0012\u001a\u00020\fH\u0007J\b\u0010\u0013\u001a\u00020\fH\u0007J\b\u0010\u0014\u001a\u00020\fH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Landroidx/lifecycle/DispatchQueue;", "", "()V", "finished", "", "isDraining", com.ironsource.y8.h.e0, "queue", "Ljava/util/Queue;", "Ljava/lang/Runnable;", "canRun", "dispatchAndEnqueue", "", "context", "Lkotlin/coroutines/CoroutineContext;", "runnable", "drainQueue", "enqueue", "finish", "pause", "resume", "lifecycle-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DispatchQueue {
    private boolean finished;
    private boolean isDraining;
    private boolean paused = true;
    private final java.util.Queue<java.lang.Runnable> queue = new java.util.ArrayDeque();

    public final void pause() {
        this.paused = true;
    }

    public final void resume() {
        if (this.paused) {
            if (!(!this.finished)) {
                throw new java.lang.IllegalStateException("Cannot resume a finished dispatcher".toString());
            }
            this.paused = false;
            drainQueue();
        }
    }

    public final void finish() {
        this.finished = true;
        drainQueue();
    }

    public final void drainQueue() {
        if (this.isDraining) {
            return;
        }
        try {
            this.isDraining = true;
            while ((!this.queue.isEmpty()) && canRun()) {
                java.lang.Runnable runnablePoll = this.queue.poll();
                if (runnablePoll != null) {
                    runnablePoll.run();
                }
            }
            this.isDraining = false;
        } catch (java.lang.Throwable th) {
            this.isDraining = false;
            throw th;
        }
    }

    public final boolean canRun() {
        return this.finished || !this.paused;
    }

    public final void dispatchAndEnqueue(kotlin.coroutines.CoroutineContext context, final java.lang.Runnable runnable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(runnable, "runnable");
        kotlinx.coroutines.MainCoroutineDispatcher immediate = kotlinx.coroutines.Dispatchers.getMain().getImmediate();
        if (immediate.isDispatchNeeded(context) || canRun()) {
            immediate.mo2860dispatch(context, new java.lang.Runnable() { // from class: androidx.lifecycle.DispatchQueue$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.lifecycle.DispatchQueue.dispatchAndEnqueue$lambda$2$lambda$1(this.f$0, runnable);
                }
            });
        } else {
            enqueue(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void dispatchAndEnqueue$lambda$2$lambda$1(androidx.lifecycle.DispatchQueue this$0, java.lang.Runnable runnable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(runnable, "$runnable");
        this$0.enqueue(runnable);
    }

    private final void enqueue(java.lang.Runnable runnable) {
        if (!this.queue.offer(runnable)) {
            throw new java.lang.IllegalStateException("cannot enqueue any more runnables".toString());
        }
        drainQueue();
    }
}
