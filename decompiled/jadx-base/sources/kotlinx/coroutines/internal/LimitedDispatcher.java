package kotlinx.coroutines.internal;

/* JADX INFO: compiled from: LimitedDispatcher.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001(B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0019\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0097Aø\u0001\u0000¢\u0006\u0002\u0010\u0014J\u001c\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00172\n\u0010\u0018\u001a\u00060\tj\u0002`\nH\u0016J-\u0010\u0019\u001a\u00020\u00112\n\u0010\u0018\u001a\u00060\tj\u0002`\n2\u0016\u0010\u001a\u001a\u0012\u0012\b\u0012\u00060\u001cR\u00020\u0000\u0012\u0004\u0012\u00020\u00110\u001bH\u0082\bJ\u001c\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00172\n\u0010\u0018\u001a\u00060\tj\u0002`\nH\u0017J%\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u00132\n\u0010\u0018\u001a\u00060\tj\u0002`\n2\u0006\u0010\u0016\u001a\u00020\u0017H\u0096\u0001J\u0010\u0010!\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\u0017J\u0010\u0010\"\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\nH\u0002J\u001f\u0010#\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\u00132\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00110%H\u0096\u0001J\b\u0010&\u001a\u00020'H\u0002R\u000e\u0010\u0003\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0007\u001a\f\u0012\b\u0012\u00060\tj\u0002`\n0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\t\u0010\u000b\u001a\u00020\fX\u0082\u0004R\u0012\u0010\r\u001a\u00060\u000ej\u0002`\u000fX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006)"}, d2 = {"Lkotlinx/coroutines/internal/LimitedDispatcher;", "Lkotlinx/coroutines/CoroutineDispatcher;", "Lkotlinx/coroutines/Delay;", "dispatcher", "parallelism", "", "(Lkotlinx/coroutines/CoroutineDispatcher;I)V", "queue", "Lkotlinx/coroutines/internal/LockFreeTaskQueue;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "runningWorkers", "Lkotlinx/atomicfu/AtomicInt;", "workerAllocationLock", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "delay", "", "time", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "dispatch", "context", "Lkotlin/coroutines/CoroutineContext;", "block", "dispatchInternal", "startWorker", "Lkotlin/Function1;", "Lkotlinx/coroutines/internal/LimitedDispatcher$Worker;", "dispatchYield", "invokeOnTimeout", "Lkotlinx/coroutines/DisposableHandle;", "timeMillis", "limitedParallelism", "obtainTaskOrDeallocateWorker", "scheduleResumeAfterDelay", "continuation", "Lkotlinx/coroutines/CancellableContinuation;", "tryAllocateWorker", "", "Worker", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class LimitedDispatcher extends kotlinx.coroutines.CoroutineDispatcher implements kotlinx.coroutines.Delay {
    private static final java.util.concurrent.atomic.AtomicIntegerFieldUpdater runningWorkers$FU = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(kotlinx.coroutines.internal.LimitedDispatcher.class, "runningWorkers");
    private final /* synthetic */ kotlinx.coroutines.Delay $$delegate_0;
    private final kotlinx.coroutines.CoroutineDispatcher dispatcher;
    private final int parallelism;
    private final kotlinx.coroutines.internal.LockFreeTaskQueue<java.lang.Runnable> queue;

    @kotlin.jvm.Volatile
    private volatile int runningWorkers;
    private final java.lang.Object workerAllocationLock;

    @Override // kotlinx.coroutines.Delay
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Deprecated without replacement as an internal method never intended for public use")
    public java.lang.Object delay(long j, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return this.$$delegate_0.delay(j, continuation);
    }

    @Override // kotlinx.coroutines.Delay
    public kotlinx.coroutines.DisposableHandle invokeOnTimeout(long timeMillis, java.lang.Runnable block, kotlin.coroutines.CoroutineContext context) {
        return this.$$delegate_0.invokeOnTimeout(timeMillis, block, context);
    }

    @Override // kotlinx.coroutines.Delay
    /* JADX INFO: renamed from: scheduleResumeAfterDelay */
    public void mo2861scheduleResumeAfterDelay(long timeMillis, kotlinx.coroutines.CancellableContinuation<? super kotlin.Unit> continuation) {
        this.$$delegate_0.mo2861scheduleResumeAfterDelay(timeMillis, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LimitedDispatcher(kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher, int i) {
        this.dispatcher = coroutineDispatcher;
        this.parallelism = i;
        kotlinx.coroutines.Delay delay = coroutineDispatcher instanceof kotlinx.coroutines.Delay ? (kotlinx.coroutines.Delay) coroutineDispatcher : null;
        this.$$delegate_0 = delay == null ? kotlinx.coroutines.DefaultExecutorKt.getDefaultDelay() : delay;
        this.queue = new kotlinx.coroutines.internal.LockFreeTaskQueue<>(false);
        this.workerAllocationLock = new java.lang.Object();
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public kotlinx.coroutines.CoroutineDispatcher limitedParallelism(int parallelism) {
        kotlinx.coroutines.internal.LimitedDispatcherKt.checkParallelism(parallelism);
        return parallelism >= this.parallelism ? this : super.limitedParallelism(parallelism);
    }

    private final void dispatchInternal(java.lang.Runnable block, kotlin.jvm.functions.Function1<? super kotlinx.coroutines.internal.LimitedDispatcher.Worker, kotlin.Unit> startWorker) {
        java.lang.Runnable runnableObtainTaskOrDeallocateWorker;
        this.queue.addLast(block);
        if (runningWorkers$FU.get(this) < this.parallelism && tryAllocateWorker() && (runnableObtainTaskOrDeallocateWorker = obtainTaskOrDeallocateWorker()) != null) {
            startWorker.invoke(new kotlinx.coroutines.internal.LimitedDispatcher.Worker(runnableObtainTaskOrDeallocateWorker));
        }
    }

    private final boolean tryAllocateWorker() {
        synchronized (this.workerAllocationLock) {
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = runningWorkers$FU;
            if (atomicIntegerFieldUpdater.get(this) >= this.parallelism) {
                return false;
            }
            atomicIntegerFieldUpdater.incrementAndGet(this);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Runnable obtainTaskOrDeallocateWorker() {
        while (true) {
            java.lang.Runnable runnableRemoveFirstOrNull = this.queue.removeFirstOrNull();
            if (runnableRemoveFirstOrNull != null) {
                return runnableRemoveFirstOrNull;
            }
            synchronized (this.workerAllocationLock) {
                java.util.concurrent.atomic.AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = runningWorkers$FU;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.queue.getSize() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    /* JADX INFO: compiled from: LimitedDispatcher.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0011\u0012\n\u0010\u0003\u001a\u00060\u0001j\u0002`\u0002¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016R\u0012\u0010\u0003\u001a\u00060\u0001j\u0002`\u0002X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lkotlinx/coroutines/internal/LimitedDispatcher$Worker;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "currentTask", "(Lkotlinx/coroutines/internal/LimitedDispatcher;Ljava/lang/Runnable;)V", "run", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private final class Worker implements java.lang.Runnable {
        private java.lang.Runnable currentTask;

        public Worker(java.lang.Runnable runnable) {
            this.currentTask = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i = 0;
            while (true) {
                try {
                    this.currentTask.run();
                } catch (java.lang.Throwable th) {
                    kotlinx.coroutines.CoroutineExceptionHandlerKt.handleCoroutineException(kotlin.coroutines.EmptyCoroutineContext.INSTANCE, th);
                }
                java.lang.Runnable runnableObtainTaskOrDeallocateWorker = kotlinx.coroutines.internal.LimitedDispatcher.this.obtainTaskOrDeallocateWorker();
                if (runnableObtainTaskOrDeallocateWorker == null) {
                    return;
                }
                this.currentTask = runnableObtainTaskOrDeallocateWorker;
                i++;
                if (i >= 16 && kotlinx.coroutines.internal.LimitedDispatcher.this.dispatcher.isDispatchNeeded(kotlinx.coroutines.internal.LimitedDispatcher.this)) {
                    kotlinx.coroutines.internal.LimitedDispatcher.this.dispatcher.mo2860dispatch(kotlinx.coroutines.internal.LimitedDispatcher.this, this);
                    return;
                }
            }
        }
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* JADX INFO: renamed from: dispatch */
    public void mo2860dispatch(kotlin.coroutines.CoroutineContext context, java.lang.Runnable block) {
        java.lang.Runnable runnableObtainTaskOrDeallocateWorker;
        this.queue.addLast(block);
        if (runningWorkers$FU.get(this) >= this.parallelism || !tryAllocateWorker() || (runnableObtainTaskOrDeallocateWorker = obtainTaskOrDeallocateWorker()) == null) {
            return;
        }
        this.dispatcher.mo2860dispatch(this, new kotlinx.coroutines.internal.LimitedDispatcher.Worker(runnableObtainTaskOrDeallocateWorker));
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public void dispatchYield(kotlin.coroutines.CoroutineContext context, java.lang.Runnable block) {
        java.lang.Runnable runnableObtainTaskOrDeallocateWorker;
        this.queue.addLast(block);
        if (runningWorkers$FU.get(this) >= this.parallelism || !tryAllocateWorker() || (runnableObtainTaskOrDeallocateWorker = obtainTaskOrDeallocateWorker()) == null) {
            return;
        }
        this.dispatcher.dispatchYield(this, new kotlinx.coroutines.internal.LimitedDispatcher.Worker(runnableObtainTaskOrDeallocateWorker));
    }
}
