package kotlinx.coroutines.scheduling;

/* JADX INFO: compiled from: WorkQueue.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0012\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0013\u001a\u00020\u00072\b\b\u0002\u0010\u0014\u001a\u00020\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0013\u001a\u00020\u0007H\u0002J\u000e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aJ\b\u0010\u001b\u001a\u0004\u0018\u00010\u0007J\b\u0010\u001c\u001a\u0004\u0018\u00010\u0007J\n\u0010\u001d\u001a\u0004\u0018\u00010\u0007H\u0002J\b\u0010\u001e\u001a\u0004\u0018\u00010\u0007J\u0010\u0010\u001f\u001a\u00020\u00152\u0006\u0010 \u001a\u00020\u001aH\u0002J\u0012\u0010!\u001a\u0004\u0018\u00010\u00072\u0006\u0010\"\u001a\u00020\u0015H\u0002J\u0016\u0010#\u001a\u0004\u0018\u00010\u00072\n\u0010$\u001a\u00060\tj\u0002`%H\u0002J\u001a\u0010&\u001a\u0004\u0018\u00010\u00072\u0006\u0010'\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\u0015H\u0002J\"\u0010(\u001a\u00020)2\n\u0010$\u001a\u00060\tj\u0002`%2\u000e\u0010*\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070+J$\u0010,\u001a\u00020)2\n\u0010$\u001a\u00060\tj\u0002`%2\u000e\u0010*\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070+H\u0002J\u000e\u0010-\u001a\u00020\u0018*\u0004\u0018\u00010\u0007H\u0002R\t\u0010\u0003\u001a\u00020\u0004X\u0082\u0004R\u0016\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\t\u0010\f\u001a\u00020\u0004X\u0082\u0004R\u0011\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u000eX\u0082\u0004R\t\u0010\u000f\u001a\u00020\u0004X\u0082\u0004R\u0014\u0010\u0010\u001a\u00020\t8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000b¨\u0006."}, d2 = {"Lkotlinx/coroutines/scheduling/WorkQueue;", "", "()V", "blockingTasksInBuffer", "Lkotlinx/atomicfu/AtomicInt;", "buffer", "Ljava/util/concurrent/atomic/AtomicReferenceArray;", "Lkotlinx/coroutines/scheduling/Task;", "bufferSize", "", "getBufferSize", "()I", "consumerIndex", "lastScheduledTask", "Lkotlinx/atomicfu/AtomicRef;", "producerIndex", "size", "getSize$kotlinx_coroutines_core", "add", "task", "fair", "", "addLast", "offloadAllWorkTo", "", "globalQueue", "Lkotlinx/coroutines/scheduling/GlobalQueue;", "poll", "pollBlocking", "pollBuffer", "pollCpu", "pollTo", "queue", "pollWithExclusiveMode", "onlyBlocking", "stealWithExclusiveMode", "stealingMode", "Lkotlinx/coroutines/scheduling/StealingMode;", "tryExtractFromTheMiddle", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "trySteal", "", "stolenTaskRef", "Lkotlin/jvm/internal/Ref$ObjectRef;", "tryStealLastScheduled", "decrementIfBlocking", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class WorkQueue {

    @kotlin.jvm.Volatile
    private volatile int blockingTasksInBuffer;
    private final java.util.concurrent.atomic.AtomicReferenceArray<kotlinx.coroutines.scheduling.Task> buffer = new java.util.concurrent.atomic.AtomicReferenceArray<>(128);

    @kotlin.jvm.Volatile
    private volatile int consumerIndex;

    @kotlin.jvm.Volatile
    private volatile java.lang.Object lastScheduledTask;

    @kotlin.jvm.Volatile
    private volatile int producerIndex;
    private static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater lastScheduledTask$FU = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(kotlinx.coroutines.scheduling.WorkQueue.class, java.lang.Object.class, "lastScheduledTask");
    private static final java.util.concurrent.atomic.AtomicIntegerFieldUpdater producerIndex$FU = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(kotlinx.coroutines.scheduling.WorkQueue.class, "producerIndex");
    private static final java.util.concurrent.atomic.AtomicIntegerFieldUpdater consumerIndex$FU = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(kotlinx.coroutines.scheduling.WorkQueue.class, "consumerIndex");
    private static final java.util.concurrent.atomic.AtomicIntegerFieldUpdater blockingTasksInBuffer$FU = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(kotlinx.coroutines.scheduling.WorkQueue.class, "blockingTasksInBuffer");

    private final int getBufferSize() {
        return producerIndex$FU.get(this) - consumerIndex$FU.get(this);
    }

    public final int getSize$kotlinx_coroutines_core() {
        return lastScheduledTask$FU.get(this) != null ? getBufferSize() + 1 : getBufferSize();
    }

    public final kotlinx.coroutines.scheduling.Task poll() {
        kotlinx.coroutines.scheduling.Task task = (kotlinx.coroutines.scheduling.Task) lastScheduledTask$FU.getAndSet(this, null);
        return task == null ? pollBuffer() : task;
    }

    public static /* synthetic */ kotlinx.coroutines.scheduling.Task add$default(kotlinx.coroutines.scheduling.WorkQueue workQueue, kotlinx.coroutines.scheduling.Task task, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return workQueue.add(task, z);
    }

    public final kotlinx.coroutines.scheduling.Task add(kotlinx.coroutines.scheduling.Task task, boolean fair) {
        if (fair) {
            return addLast(task);
        }
        kotlinx.coroutines.scheduling.Task task2 = (kotlinx.coroutines.scheduling.Task) lastScheduledTask$FU.getAndSet(this, task);
        if (task2 == null) {
            return null;
        }
        return addLast(task2);
    }

    private final kotlinx.coroutines.scheduling.Task addLast(kotlinx.coroutines.scheduling.Task task) {
        if (getBufferSize() == 127) {
            return task;
        }
        if (task.taskContext.getTaskMode() == 1) {
            blockingTasksInBuffer$FU.incrementAndGet(this);
        }
        int i = producerIndex$FU.get(this) & 127;
        while (this.buffer.get(i) != null) {
            java.lang.Thread.yield();
        }
        this.buffer.lazySet(i, task);
        producerIndex$FU.incrementAndGet(this);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long trySteal(int stealingMode, kotlin.jvm.internal.Ref.ObjectRef<kotlinx.coroutines.scheduling.Task> stolenTaskRef) {
        kotlinx.coroutines.scheduling.Task taskStealWithExclusiveMode;
        T t;
        kotlinx.coroutines.scheduling.Task taskPollBuffer;
        if (stealingMode == 3) {
            taskPollBuffer = pollBuffer();
        } else {
            taskStealWithExclusiveMode = stealWithExclusiveMode(stealingMode);
        }
        if (t != 0) {
            t = taskStealWithExclusiveMode;
            t = taskPollBuffer;
            stolenTaskRef.element = t;
            return -1L;
        }
        t = taskStealWithExclusiveMode;
        t = taskPollBuffer;
        return tryStealLastScheduled(stealingMode, stolenTaskRef);
    }

    private final kotlinx.coroutines.scheduling.Task stealWithExclusiveMode(int stealingMode) {
        int i = consumerIndex$FU.get(this);
        int i2 = producerIndex$FU.get(this);
        boolean z = stealingMode == 1;
        while (i != i2) {
            if (z && blockingTasksInBuffer$FU.get(this) == 0) {
                return null;
            }
            int i3 = i + 1;
            kotlinx.coroutines.scheduling.Task taskTryExtractFromTheMiddle = tryExtractFromTheMiddle(i, z);
            if (taskTryExtractFromTheMiddle != null) {
                return taskTryExtractFromTheMiddle;
            }
            i = i3;
        }
        return null;
    }

    public final kotlinx.coroutines.scheduling.Task pollBlocking() {
        return pollWithExclusiveMode(true);
    }

    public final kotlinx.coroutines.scheduling.Task pollCpu() {
        return pollWithExclusiveMode(false);
    }

    private final kotlinx.coroutines.scheduling.Task pollWithExclusiveMode(boolean onlyBlocking) {
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        kotlinx.coroutines.scheduling.Task task;
        do {
            atomicReferenceFieldUpdater = lastScheduledTask$FU;
            task = (kotlinx.coroutines.scheduling.Task) atomicReferenceFieldUpdater.get(this);
            if (task != null) {
                if ((task.taskContext.getTaskMode() == 1) == onlyBlocking) {
                }
            }
            int i = consumerIndex$FU.get(this);
            int i2 = producerIndex$FU.get(this);
            while (i != i2) {
                if (onlyBlocking && blockingTasksInBuffer$FU.get(this) == 0) {
                    return null;
                }
                i2--;
                kotlinx.coroutines.scheduling.Task taskTryExtractFromTheMiddle = tryExtractFromTheMiddle(i2, onlyBlocking);
                if (taskTryExtractFromTheMiddle != null) {
                    return taskTryExtractFromTheMiddle;
                }
            }
            return null;
        } while (!kotlin.UByte$$ExternalSyntheticBackport0.m(atomicReferenceFieldUpdater, this, task, (java.lang.Object) null));
        return task;
    }

    private final kotlinx.coroutines.scheduling.Task tryExtractFromTheMiddle(int index, boolean onlyBlocking) {
        int i = index & 127;
        kotlinx.coroutines.scheduling.Task task = this.buffer.get(i);
        if (task != null) {
            if ((task.taskContext.getTaskMode() == 1) == onlyBlocking && kotlin.UByte$$ExternalSyntheticBackport0.m(this.buffer, i, task, (java.lang.Object) null)) {
                if (onlyBlocking) {
                    blockingTasksInBuffer$FU.decrementAndGet(this);
                }
                return task;
            }
        }
        return null;
    }

    public final void offloadAllWorkTo(kotlinx.coroutines.scheduling.GlobalQueue globalQueue) {
        kotlinx.coroutines.scheduling.Task task = (kotlinx.coroutines.scheduling.Task) lastScheduledTask$FU.getAndSet(this, null);
        if (task != null) {
            globalQueue.addLast(task);
        }
        while (pollTo(globalQueue)) {
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.Object, kotlinx.coroutines.scheduling.Task] */
    private final long tryStealLastScheduled(int stealingMode, kotlin.jvm.internal.Ref.ObjectRef<kotlinx.coroutines.scheduling.Task> stolenTaskRef) {
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        ?? r1;
        do {
            atomicReferenceFieldUpdater = lastScheduledTask$FU;
            r1 = (kotlinx.coroutines.scheduling.Task) atomicReferenceFieldUpdater.get(this);
            if (r1 == 0) {
                return -2L;
            }
            if (((r1.taskContext.getTaskMode() == 1 ? 1 : 2) & stealingMode) == 0) {
                return -2L;
            }
            long jNanoTime = kotlinx.coroutines.scheduling.TasksKt.schedulerTimeSource.nanoTime() - r1.submissionTime;
            if (jNanoTime < kotlinx.coroutines.scheduling.TasksKt.WORK_STEALING_TIME_RESOLUTION_NS) {
                return kotlinx.coroutines.scheduling.TasksKt.WORK_STEALING_TIME_RESOLUTION_NS - jNanoTime;
            }
        } while (!kotlin.UByte$$ExternalSyntheticBackport0.m(atomicReferenceFieldUpdater, this, (java.lang.Object) r1, (java.lang.Object) null));
        stolenTaskRef.element = r1;
        return -1L;
    }

    private final boolean pollTo(kotlinx.coroutines.scheduling.GlobalQueue queue) {
        kotlinx.coroutines.scheduling.Task taskPollBuffer = pollBuffer();
        if (taskPollBuffer == null) {
            return false;
        }
        queue.addLast(taskPollBuffer);
        return true;
    }

    private final kotlinx.coroutines.scheduling.Task pollBuffer() {
        kotlinx.coroutines.scheduling.Task andSet;
        while (true) {
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = consumerIndex$FU;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i - producerIndex$FU.get(this) == 0) {
                return null;
            }
            int i2 = i & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i, i + 1) && (andSet = this.buffer.getAndSet(i2, null)) != null) {
                decrementIfBlocking(andSet);
                return andSet;
            }
        }
    }

    private final void decrementIfBlocking(kotlinx.coroutines.scheduling.Task task) {
        if (task != null) {
            if (task.taskContext.getTaskMode() == 1) {
                int iDecrementAndGet = blockingTasksInBuffer$FU.decrementAndGet(this);
                if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()) {
                    if (!(iDecrementAndGet >= 0)) {
                        throw new java.lang.AssertionError();
                    }
                }
            }
        }
    }
}
