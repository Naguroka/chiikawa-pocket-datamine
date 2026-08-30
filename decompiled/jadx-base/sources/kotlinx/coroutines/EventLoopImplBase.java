package kotlinx.coroutines;

/* JADX INFO: compiled from: EventLoop.common.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b \u0018\u00002\u00020\u00012\u00020\u0002:\u00043456B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0016\u001a\u00020\u0017H\u0002J\u0010\u0010\u0018\u001a\n\u0018\u00010\u0019j\u0004\u0018\u0001`\u001aH\u0002J\u001a\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u001d2\n\u0010\u001e\u001a\u00060\u0019j\u0002`\u001aJ\u0014\u0010\u001f\u001a\u00020\u00172\n\u0010 \u001a\u00060\u0019j\u0002`\u001aH\u0016J\u0014\u0010!\u001a\u00020\f2\n\u0010 \u001a\u00060\u0019j\u0002`\u001aH\u0002J\b\u0010\"\u001a\u00020\u0013H\u0016J\b\u0010#\u001a\u00020\u0017H\u0002J\b\u0010$\u001a\u00020\u0017H\u0004J\u0016\u0010%\u001a\u00020\u00172\u0006\u0010&\u001a\u00020\u00132\u0006\u0010'\u001a\u00020(J\u0018\u0010)\u001a\u00020*2\u0006\u0010&\u001a\u00020\u00132\u0006\u0010'\u001a\u00020(H\u0002J\u001c\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\u00132\n\u0010\u001e\u001a\u00060\u0019j\u0002`\u001aH\u0004J\u001e\u0010.\u001a\u00020\u00172\u0006\u0010-\u001a\u00020\u00132\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u001700H\u0016J\u0010\u00101\u001a\u00020\f2\u0006\u0010 \u001a\u00020(H\u0002J\b\u00102\u001a\u00020\u0017H\u0016R\u0011\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005X\u0082\u0004R\t\u0010\u0007\u001a\u00020\bX\u0082\u0004R\u0011\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0005X\u0082\u0004R$\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\f8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u00138TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u00067"}, d2 = {"Lkotlinx/coroutines/EventLoopImplBase;", "Lkotlinx/coroutines/EventLoopImplPlatform;", "Lkotlinx/coroutines/Delay;", "()V", "_delayed", "Lkotlinx/atomicfu/AtomicRef;", "Lkotlinx/coroutines/EventLoopImplBase$DelayedTaskQueue;", "_isCompleted", "Lkotlinx/atomicfu/AtomicBoolean;", "_queue", "", "value", "", "isCompleted", "()Z", "setCompleted", "(Z)V", "isEmpty", "nextTime", "", "getNextTime", "()J", "closeQueue", "", "dequeue", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "dispatch", "context", "Lkotlin/coroutines/CoroutineContext;", "block", "enqueue", "task", "enqueueImpl", "processNextEvent", "rescheduleAllDelayed", "resetAll", "schedule", "now", "delayedTask", "Lkotlinx/coroutines/EventLoopImplBase$DelayedTask;", "scheduleImpl", "", "scheduleInvokeOnTimeout", "Lkotlinx/coroutines/DisposableHandle;", "timeMillis", "scheduleResumeAfterDelay", "continuation", "Lkotlinx/coroutines/CancellableContinuation;", "shouldUnpark", "shutdown", "DelayedResumeTask", "DelayedRunnableTask", "DelayedTask", "DelayedTaskQueue", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class EventLoopImplBase extends kotlinx.coroutines.EventLoopImplPlatform implements kotlinx.coroutines.Delay {

    @kotlin.jvm.Volatile
    private volatile java.lang.Object _delayed;

    @kotlin.jvm.Volatile
    private volatile int _isCompleted = 0;

    @kotlin.jvm.Volatile
    private volatile java.lang.Object _queue;
    private static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater _queue$FU = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(kotlinx.coroutines.EventLoopImplBase.class, java.lang.Object.class, "_queue");
    private static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater _delayed$FU = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(kotlinx.coroutines.EventLoopImplBase.class, java.lang.Object.class, "_delayed");
    private static final java.util.concurrent.atomic.AtomicIntegerFieldUpdater _isCompleted$FU = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(kotlinx.coroutines.EventLoopImplBase.class, "_isCompleted");

    private final void loop$atomicfu(java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> function1, java.lang.Object obj) {
        while (true) {
            function1.invoke(atomicReferenceFieldUpdater.get(obj));
        }
    }

    @Override // kotlinx.coroutines.Delay
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Deprecated without replacement as an internal method never intended for public use")
    public java.lang.Object delay(long j, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return kotlinx.coroutines.Delay.DefaultImpls.delay(this, j, continuation);
    }

    public kotlinx.coroutines.DisposableHandle invokeOnTimeout(long j, java.lang.Runnable runnable, kotlin.coroutines.CoroutineContext coroutineContext) {
        return kotlinx.coroutines.Delay.DefaultImpls.invokeOnTimeout(this, j, runnable, coroutineContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isCompleted() {
        return _isCompleted$FU.get(this) != 0;
    }

    private final void setCompleted(boolean z) {
        _isCompleted$FU.set(this, z ? 1 : 0);
    }

    @Override // kotlinx.coroutines.EventLoop
    protected boolean isEmpty() {
        if (!isUnconfinedQueueEmpty()) {
            return false;
        }
        kotlinx.coroutines.EventLoopImplBase.DelayedTaskQueue delayedTaskQueue = (kotlinx.coroutines.EventLoopImplBase.DelayedTaskQueue) _delayed$FU.get(this);
        if (delayedTaskQueue != null && !delayedTaskQueue.isEmpty()) {
            return false;
        }
        java.lang.Object obj = _queue$FU.get(this);
        if (obj != null) {
            if (obj instanceof kotlinx.coroutines.internal.LockFreeTaskQueueCore) {
                return ((kotlinx.coroutines.internal.LockFreeTaskQueueCore) obj).isEmpty();
            }
            if (obj != kotlinx.coroutines.EventLoop_commonKt.CLOSED_EMPTY) {
                return false;
            }
        }
        return true;
    }

    @Override // kotlinx.coroutines.EventLoop
    protected long getNextTime() {
        kotlinx.coroutines.EventLoopImplBase.DelayedTask delayedTaskPeek;
        if (super.getNextTime() == 0) {
            return 0L;
        }
        java.lang.Object obj = _queue$FU.get(this);
        if (obj != null) {
            if (!(obj instanceof kotlinx.coroutines.internal.LockFreeTaskQueueCore)) {
                return obj == kotlinx.coroutines.EventLoop_commonKt.CLOSED_EMPTY ? Long.MAX_VALUE : 0L;
            }
            if (!((kotlinx.coroutines.internal.LockFreeTaskQueueCore) obj).isEmpty()) {
                return 0L;
            }
        }
        kotlinx.coroutines.EventLoopImplBase.DelayedTaskQueue delayedTaskQueue = (kotlinx.coroutines.EventLoopImplBase.DelayedTaskQueue) _delayed$FU.get(this);
        if (delayedTaskQueue == null || (delayedTaskPeek = delayedTaskQueue.peek()) == null) {
            return Long.MAX_VALUE;
        }
        long j = delayedTaskPeek.nanoTime;
        kotlinx.coroutines.AbstractTimeSource timeSource = kotlinx.coroutines.AbstractTimeSourceKt.getTimeSource();
        return kotlin.ranges.RangesKt.coerceAtLeast(j - (timeSource != null ? timeSource.nanoTime() : java.lang.System.nanoTime()), 0L);
    }

    @Override // kotlinx.coroutines.EventLoop
    public void shutdown() {
        kotlinx.coroutines.ThreadLocalEventLoop.INSTANCE.resetEventLoop$kotlinx_coroutines_core();
        setCompleted(true);
        closeQueue();
        while (processNextEvent() <= 0) {
        }
        rescheduleAllDelayed();
    }

    @Override // kotlinx.coroutines.Delay
    /* JADX INFO: renamed from: scheduleResumeAfterDelay */
    public void mo2861scheduleResumeAfterDelay(long timeMillis, kotlinx.coroutines.CancellableContinuation<? super kotlin.Unit> continuation) {
        long jDelayToNanos = kotlinx.coroutines.EventLoop_commonKt.delayToNanos(timeMillis);
        if (jDelayToNanos < kotlin.time.DurationKt.MAX_MILLIS) {
            kotlinx.coroutines.AbstractTimeSource timeSource = kotlinx.coroutines.AbstractTimeSourceKt.getTimeSource();
            long jNanoTime = timeSource != null ? timeSource.nanoTime() : java.lang.System.nanoTime();
            kotlinx.coroutines.EventLoopImplBase.DelayedResumeTask delayedResumeTask = new kotlinx.coroutines.EventLoopImplBase.DelayedResumeTask(jDelayToNanos + jNanoTime, continuation);
            schedule(jNanoTime, delayedResumeTask);
            kotlinx.coroutines.CancellableContinuationKt.disposeOnCancellation(continuation, delayedResumeTask);
        }
    }

    protected final kotlinx.coroutines.DisposableHandle scheduleInvokeOnTimeout(long timeMillis, java.lang.Runnable block) {
        long jDelayToNanos = kotlinx.coroutines.EventLoop_commonKt.delayToNanos(timeMillis);
        if (jDelayToNanos < kotlin.time.DurationKt.MAX_MILLIS) {
            kotlinx.coroutines.AbstractTimeSource timeSource = kotlinx.coroutines.AbstractTimeSourceKt.getTimeSource();
            long jNanoTime = timeSource != null ? timeSource.nanoTime() : java.lang.System.nanoTime();
            kotlinx.coroutines.EventLoopImplBase.DelayedRunnableTask delayedRunnableTask = new kotlinx.coroutines.EventLoopImplBase.DelayedRunnableTask(jDelayToNanos + jNanoTime, block);
            schedule(jNanoTime, delayedRunnableTask);
            return delayedRunnableTask;
        }
        return kotlinx.coroutines.NonDisposableHandle.INSTANCE;
    }

    @Override // kotlinx.coroutines.EventLoop
    public long processNextEvent() {
        kotlinx.coroutines.EventLoopImplBase.DelayedTask delayedTaskRemoveAtImpl;
        if (processUnconfinedEvent()) {
            return 0L;
        }
        kotlinx.coroutines.EventLoopImplBase.DelayedTaskQueue delayedTaskQueue = (kotlinx.coroutines.EventLoopImplBase.DelayedTaskQueue) _delayed$FU.get(this);
        if (delayedTaskQueue != null && !delayedTaskQueue.isEmpty()) {
            kotlinx.coroutines.AbstractTimeSource timeSource = kotlinx.coroutines.AbstractTimeSourceKt.getTimeSource();
            long jNanoTime = timeSource != null ? timeSource.nanoTime() : java.lang.System.nanoTime();
            do {
                kotlinx.coroutines.EventLoopImplBase.DelayedTaskQueue delayedTaskQueue2 = delayedTaskQueue;
                synchronized (delayedTaskQueue2) {
                    kotlinx.coroutines.EventLoopImplBase.DelayedTask delayedTaskFirstImpl = delayedTaskQueue2.firstImpl();
                    delayedTaskRemoveAtImpl = null;
                    if (delayedTaskFirstImpl != null) {
                        kotlinx.coroutines.EventLoopImplBase.DelayedTask delayedTask = delayedTaskFirstImpl;
                        delayedTaskRemoveAtImpl = delayedTask.timeToExecute(jNanoTime) ? enqueueImpl(delayedTask) : false ? delayedTaskQueue2.removeAtImpl(0) : null;
                    }
                }
            } while (delayedTaskRemoveAtImpl != null);
        }
        java.lang.Runnable runnableDequeue = dequeue();
        if (runnableDequeue != null) {
            runnableDequeue.run();
            return 0L;
        }
        return getNextTime();
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* JADX INFO: renamed from: dispatch */
    public final void mo2860dispatch(kotlin.coroutines.CoroutineContext context, java.lang.Runnable block) {
        enqueue(block);
    }

    public void enqueue(java.lang.Runnable task) {
        if (enqueueImpl(task)) {
            unpark();
        } else {
            kotlinx.coroutines.DefaultExecutor.INSTANCE.enqueue(task);
        }
    }

    private final boolean enqueueImpl(java.lang.Runnable task) {
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _queue$FU;
        while (true) {
            java.lang.Object obj = atomicReferenceFieldUpdater.get(this);
            if (isCompleted()) {
                return false;
            }
            if (obj == null) {
                if (kotlin.UByte$$ExternalSyntheticBackport0.m(_queue$FU, this, (java.lang.Object) null, task)) {
                    return true;
                }
            } else if (!(obj instanceof kotlinx.coroutines.internal.LockFreeTaskQueueCore)) {
                if (obj == kotlinx.coroutines.EventLoop_commonKt.CLOSED_EMPTY) {
                    return false;
                }
                kotlinx.coroutines.internal.LockFreeTaskQueueCore lockFreeTaskQueueCore = new kotlinx.coroutines.internal.LockFreeTaskQueueCore(8, true);
                kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
                lockFreeTaskQueueCore.addLast((java.lang.Runnable) obj);
                lockFreeTaskQueueCore.addLast(task);
                if (kotlin.UByte$$ExternalSyntheticBackport0.m(_queue$FU, this, obj, lockFreeTaskQueueCore)) {
                    return true;
                }
            } else {
                kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }>{ kotlinx.coroutines.EventLoop_commonKt.Queue<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }> }");
                kotlinx.coroutines.internal.LockFreeTaskQueueCore lockFreeTaskQueueCore2 = (kotlinx.coroutines.internal.LockFreeTaskQueueCore) obj;
                int iAddLast = lockFreeTaskQueueCore2.addLast(task);
                if (iAddLast == 0) {
                    return true;
                }
                if (iAddLast == 1) {
                    kotlin.UByte$$ExternalSyntheticBackport0.m(_queue$FU, this, obj, lockFreeTaskQueueCore2.next());
                } else if (iAddLast == 2) {
                    return false;
                }
            }
        }
    }

    private final java.lang.Runnable dequeue() {
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _queue$FU;
        while (true) {
            java.lang.Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                return null;
            }
            if (!(obj instanceof kotlinx.coroutines.internal.LockFreeTaskQueueCore)) {
                if (obj == kotlinx.coroutines.EventLoop_commonKt.CLOSED_EMPTY) {
                    return null;
                }
                if (kotlin.UByte$$ExternalSyntheticBackport0.m(_queue$FU, this, obj, (java.lang.Object) null)) {
                    kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
                    return (java.lang.Runnable) obj;
                }
            } else {
                kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }>{ kotlinx.coroutines.EventLoop_commonKt.Queue<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }> }");
                kotlinx.coroutines.internal.LockFreeTaskQueueCore lockFreeTaskQueueCore = (kotlinx.coroutines.internal.LockFreeTaskQueueCore) obj;
                java.lang.Object objRemoveFirstOrNull = lockFreeTaskQueueCore.removeFirstOrNull();
                if (objRemoveFirstOrNull != kotlinx.coroutines.internal.LockFreeTaskQueueCore.REMOVE_FROZEN) {
                    return (java.lang.Runnable) objRemoveFirstOrNull;
                }
                kotlin.UByte$$ExternalSyntheticBackport0.m(_queue$FU, this, obj, lockFreeTaskQueueCore.next());
            }
        }
    }

    private final void closeQueue() {
        if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED() && !isCompleted()) {
            throw new java.lang.AssertionError();
        }
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _queue$FU;
        while (true) {
            java.lang.Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                if (kotlin.UByte$$ExternalSyntheticBackport0.m(_queue$FU, this, (java.lang.Object) null, kotlinx.coroutines.EventLoop_commonKt.CLOSED_EMPTY)) {
                    return;
                }
            } else if (!(obj instanceof kotlinx.coroutines.internal.LockFreeTaskQueueCore)) {
                if (obj == kotlinx.coroutines.EventLoop_commonKt.CLOSED_EMPTY) {
                    return;
                }
                kotlinx.coroutines.internal.LockFreeTaskQueueCore lockFreeTaskQueueCore = new kotlinx.coroutines.internal.LockFreeTaskQueueCore(8, true);
                kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
                lockFreeTaskQueueCore.addLast((java.lang.Runnable) obj);
                if (kotlin.UByte$$ExternalSyntheticBackport0.m(_queue$FU, this, obj, lockFreeTaskQueueCore)) {
                    return;
                }
            } else {
                ((kotlinx.coroutines.internal.LockFreeTaskQueueCore) obj).close();
                return;
            }
        }
    }

    public final void schedule(long now, kotlinx.coroutines.EventLoopImplBase.DelayedTask delayedTask) {
        int iScheduleImpl = scheduleImpl(now, delayedTask);
        if (iScheduleImpl == 0) {
            if (shouldUnpark(delayedTask)) {
                unpark();
            }
        } else if (iScheduleImpl == 1) {
            reschedule(now, delayedTask);
        } else if (iScheduleImpl != 2) {
            throw new java.lang.IllegalStateException("unexpected result".toString());
        }
    }

    private final boolean shouldUnpark(kotlinx.coroutines.EventLoopImplBase.DelayedTask task) {
        kotlinx.coroutines.EventLoopImplBase.DelayedTaskQueue delayedTaskQueue = (kotlinx.coroutines.EventLoopImplBase.DelayedTaskQueue) _delayed$FU.get(this);
        return (delayedTaskQueue != null ? delayedTaskQueue.peek() : null) == task;
    }

    private final int scheduleImpl(long now, kotlinx.coroutines.EventLoopImplBase.DelayedTask delayedTask) {
        if (isCompleted()) {
            return 1;
        }
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _delayed$FU;
        kotlinx.coroutines.EventLoopImplBase.DelayedTaskQueue delayedTaskQueue = (kotlinx.coroutines.EventLoopImplBase.DelayedTaskQueue) atomicReferenceFieldUpdater.get(this);
        if (delayedTaskQueue == null) {
            kotlin.UByte$$ExternalSyntheticBackport0.m(atomicReferenceFieldUpdater, this, (java.lang.Object) null, new kotlinx.coroutines.EventLoopImplBase.DelayedTaskQueue(now));
            java.lang.Object obj = atomicReferenceFieldUpdater.get(this);
            kotlin.jvm.internal.Intrinsics.checkNotNull(obj);
            delayedTaskQueue = (kotlinx.coroutines.EventLoopImplBase.DelayedTaskQueue) obj;
        }
        return delayedTask.scheduleTask(now, delayedTaskQueue, this);
    }

    protected final void resetAll() {
        _queue$FU.set(this, null);
        _delayed$FU.set(this, null);
    }

    private final void rescheduleAllDelayed() {
        kotlinx.coroutines.EventLoopImplBase.DelayedTask delayedTaskRemoveFirstOrNull;
        kotlinx.coroutines.AbstractTimeSource timeSource = kotlinx.coroutines.AbstractTimeSourceKt.getTimeSource();
        long jNanoTime = timeSource != null ? timeSource.nanoTime() : java.lang.System.nanoTime();
        while (true) {
            kotlinx.coroutines.EventLoopImplBase.DelayedTaskQueue delayedTaskQueue = (kotlinx.coroutines.EventLoopImplBase.DelayedTaskQueue) _delayed$FU.get(this);
            if (delayedTaskQueue == null || (delayedTaskRemoveFirstOrNull = delayedTaskQueue.removeFirstOrNull()) == null) {
                return;
            } else {
                reschedule(jNanoTime, delayedTaskRemoveFirstOrNull);
            }
        }
    }

    /* JADX INFO: compiled from: EventLoop.common.kt */
    @kotlin.Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\b \u0018\u00002\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00020\u00000\u00032\u00020\u00042\u00020\u00052\u00060\u0006j\u0002`\u0007B\r\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0011\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u0000H\u0096\u0002J\u0006\u0010\u001b\u001a\u00020\u001cJ\u001e\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"J\u000e\u0010#\u001a\u00020$2\u0006\u0010\u001e\u001a\u00020\tJ\b\u0010%\u001a\u00020&H\u0016R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R0\u0010\u000e\u001a\b\u0012\u0002\b\u0003\u0018\u00010\r2\f\u0010\f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\r8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u0014X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0012\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lkotlinx/coroutines/EventLoopImplBase$DelayedTask;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "", "Lkotlinx/coroutines/DisposableHandle;", "Lkotlinx/coroutines/internal/ThreadSafeHeapNode;", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "nanoTime", "", "(J)V", "_heap", "value", "Lkotlinx/coroutines/internal/ThreadSafeHeap;", "heap", "getHeap", "()Lkotlinx/coroutines/internal/ThreadSafeHeap;", "setHeap", "(Lkotlinx/coroutines/internal/ThreadSafeHeap;)V", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "", "getIndex", "()I", "setIndex", "(I)V", "compareTo", "other", "dispose", "", "scheduleTask", "now", "delayed", "Lkotlinx/coroutines/EventLoopImplBase$DelayedTaskQueue;", "eventLoop", "Lkotlinx/coroutines/EventLoopImplBase;", "timeToExecute", "", "toString", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class DelayedTask implements java.lang.Runnable, java.lang.Comparable<kotlinx.coroutines.EventLoopImplBase.DelayedTask>, kotlinx.coroutines.DisposableHandle, kotlinx.coroutines.internal.ThreadSafeHeapNode {
        private volatile java.lang.Object _heap;
        private int index = -1;
        public long nanoTime;

        public DelayedTask(long j) {
            this.nanoTime = j;
        }

        @Override // kotlinx.coroutines.internal.ThreadSafeHeapNode
        public kotlinx.coroutines.internal.ThreadSafeHeap<?> getHeap() {
            java.lang.Object obj = this._heap;
            if (obj instanceof kotlinx.coroutines.internal.ThreadSafeHeap) {
                return (kotlinx.coroutines.internal.ThreadSafeHeap) obj;
            }
            return null;
        }

        @Override // kotlinx.coroutines.internal.ThreadSafeHeapNode
        public void setHeap(kotlinx.coroutines.internal.ThreadSafeHeap<?> threadSafeHeap) {
            if (!(this._heap != kotlinx.coroutines.EventLoop_commonKt.DISPOSED_TASK)) {
                throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
            }
            this._heap = threadSafeHeap;
        }

        @Override // kotlinx.coroutines.internal.ThreadSafeHeapNode
        public int getIndex() {
            return this.index;
        }

        @Override // kotlinx.coroutines.internal.ThreadSafeHeapNode
        public void setIndex(int i) {
            this.index = i;
        }

        @Override // java.lang.Comparable
        public int compareTo(kotlinx.coroutines.EventLoopImplBase.DelayedTask other) {
            long j = this.nanoTime - other.nanoTime;
            if (j > 0) {
                return 1;
            }
            return j < 0 ? -1 : 0;
        }

        public final boolean timeToExecute(long now) {
            return now - this.nanoTime >= 0;
        }

        public java.lang.String toString() {
            return "Delayed[nanos=" + this.nanoTime + ']';
        }

        public final int scheduleTask(long now, kotlinx.coroutines.EventLoopImplBase.DelayedTaskQueue delayed, kotlinx.coroutines.EventLoopImplBase eventLoop) {
            synchronized (this) {
                if (this._heap == kotlinx.coroutines.EventLoop_commonKt.DISPOSED_TASK) {
                    return 2;
                }
                kotlinx.coroutines.EventLoopImplBase.DelayedTaskQueue delayedTaskQueue = delayed;
                synchronized (delayedTaskQueue) {
                    kotlinx.coroutines.EventLoopImplBase.DelayedTask delayedTaskFirstImpl = delayedTaskQueue.firstImpl();
                    if (eventLoop.isCompleted()) {
                        return 1;
                    }
                    if (delayedTaskFirstImpl == null) {
                        delayed.timeNow = now;
                    } else {
                        long j = delayedTaskFirstImpl.nanoTime;
                        if (j - now < 0) {
                            now = j;
                        }
                        if (now - delayed.timeNow > 0) {
                            delayed.timeNow = now;
                        }
                    }
                    if (this.nanoTime - delayed.timeNow < 0) {
                        this.nanoTime = delayed.timeNow;
                    }
                    delayedTaskQueue.addImpl(this);
                    return 0;
                }
            }
        }

        @Override // kotlinx.coroutines.DisposableHandle
        public final void dispose() {
            synchronized (this) {
                java.lang.Object obj = this._heap;
                if (obj == kotlinx.coroutines.EventLoop_commonKt.DISPOSED_TASK) {
                    return;
                }
                kotlinx.coroutines.EventLoopImplBase.DelayedTaskQueue delayedTaskQueue = obj instanceof kotlinx.coroutines.EventLoopImplBase.DelayedTaskQueue ? (kotlinx.coroutines.EventLoopImplBase.DelayedTaskQueue) obj : null;
                if (delayedTaskQueue != null) {
                    delayedTaskQueue.remove(this);
                }
                this._heap = kotlinx.coroutines.EventLoop_commonKt.DISPOSED_TASK;
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            }
        }
    }

    /* JADX INFO: compiled from: EventLoop.common.kt */
    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\nH\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lkotlinx/coroutines/EventLoopImplBase$DelayedResumeTask;", "Lkotlinx/coroutines/EventLoopImplBase$DelayedTask;", "nanoTime", "", "cont", "Lkotlinx/coroutines/CancellableContinuation;", "", "(Lkotlinx/coroutines/EventLoopImplBase;JLkotlinx/coroutines/CancellableContinuation;)V", "run", "toString", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private final class DelayedResumeTask extends kotlinx.coroutines.EventLoopImplBase.DelayedTask {
        private final kotlinx.coroutines.CancellableContinuation<kotlin.Unit> cont;

        /* JADX WARN: Multi-variable type inference failed */
        public DelayedResumeTask(long j, kotlinx.coroutines.CancellableContinuation<? super kotlin.Unit> cancellableContinuation) {
            super(j);
            this.cont = cancellableContinuation;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.cont.resumeUndispatched(kotlinx.coroutines.EventLoopImplBase.this, kotlin.Unit.INSTANCE);
        }

        @Override // kotlinx.coroutines.EventLoopImplBase.DelayedTask
        public java.lang.String toString() {
            return super.toString() + this.cont;
        }
    }

    /* JADX INFO: compiled from: EventLoop.common.kt */
    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016R\u0012\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lkotlinx/coroutines/EventLoopImplBase$DelayedRunnableTask;", "Lkotlinx/coroutines/EventLoopImplBase$DelayedTask;", "nanoTime", "", "block", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "(JLjava/lang/Runnable;)V", "run", "", "toString", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class DelayedRunnableTask extends kotlinx.coroutines.EventLoopImplBase.DelayedTask {
        private final java.lang.Runnable block;

        public DelayedRunnableTask(long j, java.lang.Runnable runnable) {
            super(j);
            this.block = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.block.run();
        }

        @Override // kotlinx.coroutines.EventLoopImplBase.DelayedTask
        public java.lang.String toString() {
            return super.toString() + this.block;
        }
    }

    /* JADX INFO: compiled from: EventLoop.common.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R\u0012\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lkotlinx/coroutines/EventLoopImplBase$DelayedTaskQueue;", "Lkotlinx/coroutines/internal/ThreadSafeHeap;", "Lkotlinx/coroutines/EventLoopImplBase$DelayedTask;", "timeNow", "", "(J)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class DelayedTaskQueue extends kotlinx.coroutines.internal.ThreadSafeHeap<kotlinx.coroutines.EventLoopImplBase.DelayedTask> {
        public long timeNow;

        public DelayedTaskQueue(long j) {
            this.timeNow = j;
        }
    }
}
