package kotlinx.coroutines.scheduling;

/* JADX INFO: compiled from: CoroutineScheduler.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\b\u0000\u0018\u0000 I2\u00020\u00012\u00020\u0002:\u0003IJKB)\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0010\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020 H\u0002J\u0011\u0010\r\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u0007H\u0086\bJ\u0011\u0010\"\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u0007H\u0082\bJ\b\u0010#\u001a\u00020$H\u0016J\b\u0010%\u001a\u00020\u0004H\u0002J\u001a\u0010&\u001a\u00020 2\n\u0010'\u001a\u00060(j\u0002`)2\u0006\u0010*\u001a\u00020+J\u0011\u0010\u0012\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u0007H\u0082\bJ\u000e\u0010,\u001a\b\u0018\u00010\u001dR\u00020\u0000H\u0002J\t\u0010-\u001a\u00020$H\u0082\bJ\t\u0010.\u001a\u00020\u0004H\u0082\bJ&\u0010/\u001a\u00020$2\n\u0010'\u001a\u00060(j\u0002`)2\b\b\u0002\u0010*\u001a\u00020+2\b\b\u0002\u00100\u001a\u00020\u0018J\u0014\u00101\u001a\u00020$2\n\u00102\u001a\u00060(j\u0002`)H\u0016J\t\u00103\u001a\u00020\u0007H\u0082\bJ\t\u00104\u001a\u00020\u0004H\u0082\bJ\u0014\u00105\u001a\u00020\u00042\n\u00106\u001a\u00060\u001dR\u00020\u0000H\u0002J\u000e\u00107\u001a\b\u0018\u00010\u001dR\u00020\u0000H\u0002J\u0012\u00108\u001a\u00020\u00182\n\u00106\u001a\u00060\u001dR\u00020\u0000J\"\u00109\u001a\u00020$2\n\u00106\u001a\u00060\u001dR\u00020\u00002\u0006\u0010:\u001a\u00020\u00042\u0006\u0010;\u001a\u00020\u0004J\t\u0010<\u001a\u00020\u0007H\u0082\bJ\u000e\u0010=\u001a\u00020$2\u0006\u0010\u001f\u001a\u00020 J\u000e\u0010>\u001a\u00020$2\u0006\u0010?\u001a\u00020\u0007J\u0018\u0010@\u001a\u00020$2\u0006\u0010A\u001a\u00020\u00072\u0006\u0010B\u001a\u00020\u0018H\u0002J\u0006\u0010C\u001a\u00020$J\b\u0010D\u001a\u00020\tH\u0016J\t\u0010E\u001a\u00020\u0018H\u0082\bJ\u0012\u0010F\u001a\u00020\u00182\b\b\u0002\u0010!\u001a\u00020\u0007H\u0002J\b\u0010G\u001a\u00020\u0018H\u0002J$\u0010H\u001a\u0004\u0018\u00010 *\b\u0018\u00010\u001dR\u00020\u00002\u0006\u0010\u001f\u001a\u00020 2\u0006\u00100\u001a\u00020\u0018H\u0002R\t\u0010\u000b\u001a\u00020\fX\u0082\u0004R\u0015\u0010\r\u001a\u00020\u00048Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\t\u0010\u0010\u001a\u00020\u0011X\u0082\u0004R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0015\u0010\u0012\u001a\u00020\u00048Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u000fR\u0010\u0010\u0014\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0017\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0019R\u0010\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\t\u0010\u001a\u001a\u00020\u0011X\u0082\u0004R\u0010\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001b\u001a\f\u0012\b\u0012\u00060\u001dR\u00020\u00000\u001c8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006L"}, d2 = {"Lkotlinx/coroutines/scheduling/CoroutineScheduler;", "Ljava/util/concurrent/Executor;", "Ljava/io/Closeable;", "corePoolSize", "", "maxPoolSize", "idleWorkerKeepAliveNs", "", "schedulerName", "", "(IIJLjava/lang/String;)V", "_isTerminated", "Lkotlinx/atomicfu/AtomicBoolean;", "availableCpuPermits", "getAvailableCpuPermits", "()I", "controlState", "Lkotlinx/atomicfu/AtomicLong;", "createdWorkers", "getCreatedWorkers", "globalBlockingQueue", "Lkotlinx/coroutines/scheduling/GlobalQueue;", "globalCpuQueue", "isTerminated", "", "()Z", "parkedWorkersStack", "workers", "Lkotlinx/coroutines/internal/ResizableAtomicArray;", "Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;", "addToGlobalQueue", "task", "Lkotlinx/coroutines/scheduling/Task;", "state", "blockingTasks", "close", "", "createNewWorker", "createTask", "block", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "taskContext", "Lkotlinx/coroutines/scheduling/TaskContext;", "currentWorker", "decrementBlockingTasks", "decrementCreatedWorkers", "dispatch", "tailDispatch", "execute", com.ironsource.sdk.controller.f.b.COMMAND, "incrementBlockingTasks", "incrementCreatedWorkers", "parkedWorkersStackNextIndex", "worker", "parkedWorkersStackPop", "parkedWorkersStackPush", "parkedWorkersStackTopUpdate", "oldIndex", "newIndex", "releaseCpuPermit", "runSafely", "shutdown", "timeout", "signalBlockingWork", "stateSnapshot", "skipUnpark", "signalCpuWork", "toString", "tryAcquireCpuPermit", "tryCreateWorker", "tryUnpark", "submitToLocalQueue", "Companion", "Worker", "WorkerState", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CoroutineScheduler implements java.util.concurrent.Executor, java.io.Closeable {
    private static final long BLOCKING_MASK = 4398044413952L;
    private static final int BLOCKING_SHIFT = 21;
    private static final int CLAIMED = 0;
    private static final long CPU_PERMITS_MASK = 9223367638808264704L;
    private static final int CPU_PERMITS_SHIFT = 42;
    private static final long CREATED_MASK = 2097151;
    public static final int MAX_SUPPORTED_POOL_SIZE = 2097150;
    public static final int MIN_SUPPORTED_POOL_SIZE = 1;
    private static final int PARKED = -1;
    private static final long PARKED_INDEX_MASK = 2097151;
    private static final long PARKED_VERSION_INC = 2097152;
    private static final long PARKED_VERSION_MASK = -2097152;
    private static final int TERMINATED = 1;

    @kotlin.jvm.Volatile
    private volatile int _isTerminated;

    @kotlin.jvm.Volatile
    private volatile long controlState;
    public final int corePoolSize;
    public final kotlinx.coroutines.scheduling.GlobalQueue globalBlockingQueue;
    public final kotlinx.coroutines.scheduling.GlobalQueue globalCpuQueue;
    public final long idleWorkerKeepAliveNs;
    public final int maxPoolSize;

    @kotlin.jvm.Volatile
    private volatile long parkedWorkersStack;
    public final java.lang.String schedulerName;
    public final kotlinx.coroutines.internal.ResizableAtomicArray<kotlinx.coroutines.scheduling.CoroutineScheduler.Worker> workers;
    private static final java.util.concurrent.atomic.AtomicLongFieldUpdater parkedWorkersStack$FU = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(kotlinx.coroutines.scheduling.CoroutineScheduler.class, "parkedWorkersStack");
    private static final java.util.concurrent.atomic.AtomicLongFieldUpdater controlState$FU = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(kotlinx.coroutines.scheduling.CoroutineScheduler.class, "controlState");
    private static final java.util.concurrent.atomic.AtomicIntegerFieldUpdater _isTerminated$FU = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(kotlinx.coroutines.scheduling.CoroutineScheduler.class, "_isTerminated");
    public static final kotlinx.coroutines.internal.Symbol NOT_IN_STACK = new kotlinx.coroutines.internal.Symbol("NOT_IN_STACK");

    /* JADX INFO: compiled from: CoroutineScheduler.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.values().length];
            try {
                iArr[kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.PARKING.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.BLOCKING.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.CPU_ACQUIRED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.DORMANT.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.TERMINATED.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: compiled from: CoroutineScheduler.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;", "", "(Ljava/lang/String;I)V", "CPU_ACQUIRED", "BLOCKING", "PARKING", "DORMANT", "TERMINATED", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum WorkerState {
        CPU_ACQUIRED,
        BLOCKING,
        PARKING,
        DORMANT,
        TERMINATED
    }

    private final int blockingTasks(long state) {
        return (int) ((state & BLOCKING_MASK) >> 21);
    }

    private final int createdWorkers(long state) {
        return (int) (state & 2097151);
    }

    private final void loop$atomicfu(java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater, kotlin.jvm.functions.Function1<? super java.lang.Long, kotlin.Unit> function1, java.lang.Object obj) {
        while (true) {
            function1.invoke(java.lang.Long.valueOf(atomicLongFieldUpdater.get(obj)));
        }
    }

    public final int availableCpuPermits(long state) {
        return (int) ((state & CPU_PERMITS_MASK) >> 42);
    }

    public CoroutineScheduler(int i, int i2, long j, java.lang.String str) {
        this.corePoolSize = i;
        this.maxPoolSize = i2;
        this.idleWorkerKeepAliveNs = j;
        this.schedulerName = str;
        if (!(i >= 1)) {
            throw new java.lang.IllegalArgumentException(("Core pool size " + i + " should be at least 1").toString());
        }
        if (!(i2 >= i)) {
            throw new java.lang.IllegalArgumentException(("Max pool size " + i2 + " should be greater than or equals to core pool size " + i).toString());
        }
        if (!(i2 <= 2097150)) {
            throw new java.lang.IllegalArgumentException(("Max pool size " + i2 + " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (!(j > 0)) {
            throw new java.lang.IllegalArgumentException(("Idle worker keep alive time " + j + " must be positive").toString());
        }
        this.globalCpuQueue = new kotlinx.coroutines.scheduling.GlobalQueue();
        this.globalBlockingQueue = new kotlinx.coroutines.scheduling.GlobalQueue();
        this.workers = new kotlinx.coroutines.internal.ResizableAtomicArray<>((i + 1) * 2);
        this.controlState = ((long) i) << 42;
        this._isTerminated = 0;
    }

    public /* synthetic */ CoroutineScheduler(int i, int i2, long j, java.lang.String str, int i3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, (i3 & 4) != 0 ? kotlinx.coroutines.scheduling.TasksKt.IDLE_WORKER_KEEP_ALIVE_NS : j, (i3 & 8) != 0 ? kotlinx.coroutines.scheduling.TasksKt.DEFAULT_SCHEDULER_NAME : str);
    }

    public final void parkedWorkersStackTopUpdate(kotlinx.coroutines.scheduling.CoroutineScheduler.Worker worker, int oldIndex, int newIndex) {
        java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater = parkedWorkersStack$FU;
        while (true) {
            long j = atomicLongFieldUpdater.get(this);
            int iParkedWorkersStackNextIndex = (int) (2097151 & j);
            long j2 = (2097152 + j) & PARKED_VERSION_MASK;
            if (iParkedWorkersStackNextIndex == oldIndex) {
                iParkedWorkersStackNextIndex = newIndex == 0 ? parkedWorkersStackNextIndex(worker) : newIndex;
            }
            if (iParkedWorkersStackNextIndex >= 0 && parkedWorkersStack$FU.compareAndSet(this, j, j2 | ((long) iParkedWorkersStackNextIndex))) {
                return;
            }
        }
    }

    public final boolean parkedWorkersStackPush(kotlinx.coroutines.scheduling.CoroutineScheduler.Worker worker) {
        long j;
        long j2;
        int indexInArray;
        if (worker.getNextParkedWorker() != NOT_IN_STACK) {
            return false;
        }
        java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater = parkedWorkersStack$FU;
        do {
            j = atomicLongFieldUpdater.get(this);
            int i = (int) (2097151 & j);
            j2 = (2097152 + j) & PARKED_VERSION_MASK;
            indexInArray = worker.getIndexInArray();
            if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()) {
                if (!(indexInArray != 0)) {
                    throw new java.lang.AssertionError();
                }
            }
            worker.setNextParkedWorker(this.workers.get(i));
        } while (!parkedWorkersStack$FU.compareAndSet(this, j, ((long) indexInArray) | j2));
        return true;
    }

    private final kotlinx.coroutines.scheduling.CoroutineScheduler.Worker parkedWorkersStackPop() {
        java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater = parkedWorkersStack$FU;
        while (true) {
            long j = atomicLongFieldUpdater.get(this);
            kotlinx.coroutines.scheduling.CoroutineScheduler.Worker worker = this.workers.get((int) (2097151 & j));
            if (worker == null) {
                return null;
            }
            long j2 = (2097152 + j) & PARKED_VERSION_MASK;
            int iParkedWorkersStackNextIndex = parkedWorkersStackNextIndex(worker);
            if (iParkedWorkersStackNextIndex >= 0 && parkedWorkersStack$FU.compareAndSet(this, j, ((long) iParkedWorkersStackNextIndex) | j2)) {
                worker.setNextParkedWorker(NOT_IN_STACK);
                return worker;
            }
        }
    }

    private final int parkedWorkersStackNextIndex(kotlinx.coroutines.scheduling.CoroutineScheduler.Worker worker) {
        java.lang.Object nextParkedWorker = worker.getNextParkedWorker();
        while (nextParkedWorker != NOT_IN_STACK) {
            if (nextParkedWorker == null) {
                return 0;
            }
            kotlinx.coroutines.scheduling.CoroutineScheduler.Worker worker2 = (kotlinx.coroutines.scheduling.CoroutineScheduler.Worker) nextParkedWorker;
            int indexInArray = worker2.getIndexInArray();
            if (indexInArray != 0) {
                return indexInArray;
            }
            nextParkedWorker = worker2.getNextParkedWorker();
        }
        return -1;
    }

    private final int getCreatedWorkers() {
        return (int) (controlState$FU.get(this) & 2097151);
    }

    private final int getAvailableCpuPermits() {
        return (int) ((controlState$FU.get(this) & CPU_PERMITS_MASK) >> 42);
    }

    private final int incrementCreatedWorkers() {
        return (int) (controlState$FU.incrementAndGet(this) & 2097151);
    }

    private final int decrementCreatedWorkers() {
        return (int) (controlState$FU.getAndDecrement(this) & 2097151);
    }

    private final long incrementBlockingTasks() {
        return controlState$FU.addAndGet(this, 2097152L);
    }

    private final void decrementBlockingTasks() {
        controlState$FU.addAndGet(this, PARKED_VERSION_MASK);
    }

    private final boolean tryAcquireCpuPermit() {
        long j;
        java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater = controlState$FU;
        do {
            j = atomicLongFieldUpdater.get(this);
            if (((int) ((CPU_PERMITS_MASK & j) >> 42)) == 0) {
                return false;
            }
        } while (!controlState$FU.compareAndSet(this, j, j - 4398046511104L));
        return true;
    }

    private final long releaseCpuPermit() {
        return controlState$FU.addAndGet(this, 4398046511104L);
    }

    public final boolean isTerminated() {
        return _isTerminated$FU.get(this) != 0;
    }

    @Override // java.util.concurrent.Executor
    public void execute(java.lang.Runnable command) {
        dispatch$default(this, command, null, false, 6, null);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        shutdown(10000L);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0076  */
    public final void shutdown(long timeout) {
        int i;
        kotlinx.coroutines.scheduling.Task taskRemoveFirstOrNull;
        if (_isTerminated$FU.compareAndSet(this, 0, 1)) {
            kotlinx.coroutines.scheduling.CoroutineScheduler.Worker workerCurrentWorker = currentWorker();
            synchronized (this.workers) {
                i = (int) (controlState$FU.get(this) & 2097151);
            }
            if (1 <= i) {
                int i2 = 1;
                while (true) {
                    kotlinx.coroutines.scheduling.CoroutineScheduler.Worker worker = this.workers.get(i2);
                    kotlin.jvm.internal.Intrinsics.checkNotNull(worker);
                    kotlinx.coroutines.scheduling.CoroutineScheduler.Worker worker2 = worker;
                    if (worker2 != workerCurrentWorker) {
                        while (worker2.isAlive()) {
                            java.util.concurrent.locks.LockSupport.unpark(worker2);
                            worker2.join(timeout);
                        }
                        kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState workerState = worker2.state;
                        if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()) {
                            if (!(workerState == kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.TERMINATED)) {
                                throw new java.lang.AssertionError();
                            }
                        }
                        worker2.localQueue.offloadAllWorkTo(this.globalBlockingQueue);
                    }
                    if (i2 == i) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            this.globalBlockingQueue.close();
            this.globalCpuQueue.close();
            while (true) {
                if (workerCurrentWorker != null) {
                    taskRemoveFirstOrNull = workerCurrentWorker.findTask(true);
                    if (taskRemoveFirstOrNull == null) {
                        taskRemoveFirstOrNull = this.globalCpuQueue.removeFirstOrNull();
                        if (taskRemoveFirstOrNull == null) {
                            continue;
                        }
                    } else {
                        continue;
                    }
                } else {
                    taskRemoveFirstOrNull = this.globalCpuQueue.removeFirstOrNull();
                    if (taskRemoveFirstOrNull == null && (taskRemoveFirstOrNull = this.globalBlockingQueue.removeFirstOrNull()) == null) {
                        break;
                    }
                }
                runSafely(taskRemoveFirstOrNull);
            }
            if (workerCurrentWorker != null) {
                workerCurrentWorker.tryReleaseCpu(kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.TERMINATED);
            }
            if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()) {
                if (!(((int) ((controlState$FU.get(this) & CPU_PERMITS_MASK) >> 42)) == this.corePoolSize)) {
                    throw new java.lang.AssertionError();
                }
            }
            parkedWorkersStack$FU.set(this, 0L);
            controlState$FU.set(this, 0L);
        }
    }

    public static /* synthetic */ void dispatch$default(kotlinx.coroutines.scheduling.CoroutineScheduler coroutineScheduler, java.lang.Runnable runnable, kotlinx.coroutines.scheduling.TaskContext taskContext, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            taskContext = kotlinx.coroutines.scheduling.TasksKt.NonBlockingContext;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        coroutineScheduler.dispatch(runnable, taskContext, z);
    }

    public final void dispatch(java.lang.Runnable block, kotlinx.coroutines.scheduling.TaskContext taskContext, boolean tailDispatch) {
        kotlinx.coroutines.AbstractTimeSource timeSource = kotlinx.coroutines.AbstractTimeSourceKt.getTimeSource();
        if (timeSource != null) {
            timeSource.trackTask();
        }
        kotlinx.coroutines.scheduling.Task taskCreateTask = createTask(block, taskContext);
        boolean z = false;
        boolean z2 = taskCreateTask.taskContext.getTaskMode() == 1;
        long jAddAndGet = z2 ? controlState$FU.addAndGet(this, 2097152L) : 0L;
        kotlinx.coroutines.scheduling.CoroutineScheduler.Worker workerCurrentWorker = currentWorker();
        kotlinx.coroutines.scheduling.Task taskSubmitToLocalQueue = submitToLocalQueue(workerCurrentWorker, taskCreateTask, tailDispatch);
        if (taskSubmitToLocalQueue != null && !addToGlobalQueue(taskSubmitToLocalQueue)) {
            throw new java.util.concurrent.RejectedExecutionException(this.schedulerName + " was terminated");
        }
        if (tailDispatch && workerCurrentWorker != null) {
            z = true;
        }
        if (z2) {
            signalBlockingWork(jAddAndGet, z);
        } else {
            if (z) {
                return;
            }
            signalCpuWork();
        }
    }

    public final kotlinx.coroutines.scheduling.Task createTask(java.lang.Runnable block, kotlinx.coroutines.scheduling.TaskContext taskContext) {
        long jNanoTime = kotlinx.coroutines.scheduling.TasksKt.schedulerTimeSource.nanoTime();
        if (block instanceof kotlinx.coroutines.scheduling.Task) {
            kotlinx.coroutines.scheduling.Task task = (kotlinx.coroutines.scheduling.Task) block;
            task.submissionTime = jNanoTime;
            task.taskContext = taskContext;
            return task;
        }
        return new kotlinx.coroutines.scheduling.TaskImpl(block, jNanoTime, taskContext);
    }

    private final void signalBlockingWork(long stateSnapshot, boolean skipUnpark) {
        if (skipUnpark || tryUnpark() || tryCreateWorker(stateSnapshot)) {
            return;
        }
        tryUnpark();
    }

    public final void signalCpuWork() {
        if (tryUnpark() || tryCreateWorker$default(this, 0L, 1, null)) {
            return;
        }
        tryUnpark();
    }

    static /* synthetic */ boolean tryCreateWorker$default(kotlinx.coroutines.scheduling.CoroutineScheduler coroutineScheduler, long j, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            j = controlState$FU.get(coroutineScheduler);
        }
        return coroutineScheduler.tryCreateWorker(j);
    }

    private final boolean tryCreateWorker(long state) {
        if (kotlin.ranges.RangesKt.coerceAtLeast(((int) (2097151 & state)) - ((int) ((state & BLOCKING_MASK) >> 21)), 0) < this.corePoolSize) {
            int iCreateNewWorker = createNewWorker();
            if (iCreateNewWorker == 1 && this.corePoolSize > 1) {
                createNewWorker();
            }
            if (iCreateNewWorker > 0) {
                return true;
            }
        }
        return false;
    }

    private final boolean tryUnpark() {
        kotlinx.coroutines.scheduling.CoroutineScheduler.Worker workerParkedWorkersStackPop;
        do {
            workerParkedWorkersStackPop = parkedWorkersStackPop();
            if (workerParkedWorkersStackPop == null) {
                return false;
            }
        } while (!kotlinx.coroutines.scheduling.CoroutineScheduler.Worker.workerCtl$FU.compareAndSet(workerParkedWorkersStackPop, -1, 0));
        java.util.concurrent.locks.LockSupport.unpark(workerParkedWorkersStackPop);
        return true;
    }

    private final int createNewWorker() {
        synchronized (this.workers) {
            if (isTerminated()) {
                return -1;
            }
            java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater = controlState$FU;
            long j = atomicLongFieldUpdater.get(this);
            int i = (int) (j & 2097151);
            int iCoerceAtLeast = kotlin.ranges.RangesKt.coerceAtLeast(i - ((int) ((j & BLOCKING_MASK) >> 21)), 0);
            if (iCoerceAtLeast >= this.corePoolSize) {
                return 0;
            }
            if (i >= this.maxPoolSize) {
                return 0;
            }
            int i2 = ((int) (controlState$FU.get(this) & 2097151)) + 1;
            if (!(i2 > 0 && this.workers.get(i2) == null)) {
                throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
            }
            kotlinx.coroutines.scheduling.CoroutineScheduler.Worker worker = new kotlinx.coroutines.scheduling.CoroutineScheduler.Worker(this, i2);
            this.workers.setSynchronized(i2, worker);
            if (!(i2 == ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this))))) {
                throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
            }
            int i3 = iCoerceAtLeast + 1;
            worker.start();
            return i3;
        }
    }

    private final kotlinx.coroutines.scheduling.Task submitToLocalQueue(kotlinx.coroutines.scheduling.CoroutineScheduler.Worker worker, kotlinx.coroutines.scheduling.Task task, boolean z) {
        if (worker == null || worker.state == kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.TERMINATED) {
            return task;
        }
        if (task.taskContext.getTaskMode() == 0 && worker.state == kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.BLOCKING) {
            return task;
        }
        worker.mayHaveLocalTasks = true;
        return worker.localQueue.add(task, z);
    }

    private final kotlinx.coroutines.scheduling.CoroutineScheduler.Worker currentWorker() {
        java.lang.Thread threadCurrentThread = java.lang.Thread.currentThread();
        kotlinx.coroutines.scheduling.CoroutineScheduler.Worker worker = threadCurrentThread instanceof kotlinx.coroutines.scheduling.CoroutineScheduler.Worker ? (kotlinx.coroutines.scheduling.CoroutineScheduler.Worker) threadCurrentThread : null;
        if (worker == null || !kotlin.jvm.internal.Intrinsics.areEqual(kotlinx.coroutines.scheduling.CoroutineScheduler.this, this)) {
            return null;
        }
        return worker;
    }

    public java.lang.String toString() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int iCurrentLength = this.workers.currentLength();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 1; i6 < iCurrentLength; i6++) {
            kotlinx.coroutines.scheduling.CoroutineScheduler.Worker worker = this.workers.get(i6);
            if (worker != null) {
                int size$kotlinx_coroutines_core = worker.localQueue.getSize$kotlinx_coroutines_core();
                int i7 = kotlinx.coroutines.scheduling.CoroutineScheduler.WhenMappings.$EnumSwitchMapping$0[worker.state.ordinal()];
                if (i7 == 1) {
                    i3++;
                } else if (i7 == 2) {
                    i2++;
                    arrayList.add(new java.lang.StringBuilder().append(size$kotlinx_coroutines_core).append('b').toString());
                } else if (i7 == 3) {
                    i++;
                    arrayList.add(new java.lang.StringBuilder().append(size$kotlinx_coroutines_core).append('c').toString());
                } else if (i7 == 4) {
                    i4++;
                    if (size$kotlinx_coroutines_core > 0) {
                        arrayList.add(new java.lang.StringBuilder().append(size$kotlinx_coroutines_core).append('d').toString());
                    }
                } else if (i7 == 5) {
                    i5++;
                }
            }
        }
        long j = controlState$FU.get(this);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.schedulerName).append('@').append(kotlinx.coroutines.DebugStringsKt.getHexAddress(this)).append("[Pool Size {core = ").append(this.corePoolSize).append(", max = ").append(this.maxPoolSize).append("}, Worker States {CPU = ").append(i).append(", blocking = ").append(i2).append(", parked = ").append(i3).append(", dormant = ").append(i4).append(", terminated = ").append(i5).append("}, running workers queues = ").append(arrayList).append(", global CPU queue size = ").append(this.globalCpuQueue.getSize()).append(", global blocking queue size = ").append(this.globalBlockingQueue.getSize());
        sb.append(", Control State {created workers= ").append((int) (2097151 & j)).append(", blocking tasks = ").append((int) ((BLOCKING_MASK & j) >> 21)).append(", CPUs acquired = ").append(this.corePoolSize - ((int) ((CPU_PERMITS_MASK & j) >> 42))).append("}]");
        return sb.toString();
    }

    public final void runSafely(kotlinx.coroutines.scheduling.Task task) {
        kotlinx.coroutines.AbstractTimeSource timeSource;
        try {
            task.run();
            timeSource = kotlinx.coroutines.AbstractTimeSourceKt.getTimeSource();
            if (timeSource == null) {
                return;
            }
        } catch (java.lang.Throwable th) {
            try {
                java.lang.Thread threadCurrentThread = java.lang.Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
                timeSource = kotlinx.coroutines.AbstractTimeSourceKt.getTimeSource();
                if (timeSource == null) {
                    return;
                }
            } catch (java.lang.Throwable th2) {
                kotlinx.coroutines.AbstractTimeSource timeSource2 = kotlinx.coroutines.AbstractTimeSourceKt.getTimeSource();
                if (timeSource2 != null) {
                    timeSource2.unTrackTask();
                }
                throw th2;
            }
        }
        timeSource.unTrackTask();
    }

    /* JADX INFO: compiled from: CoroutineScheduler.kt */
    @kotlin.Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\u0004\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0007\b\u0002¢\u0006\u0002\u0010\u0005J\u0010\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0003H\u0002J\u0010\u0010'\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0003H\u0002J\u0010\u0010(\u001a\u00020%2\u0006\u0010)\u001a\u00020 H\u0002J\u0012\u0010*\u001a\u0004\u0018\u00010 2\u0006\u0010+\u001a\u00020\u000eH\u0002J\n\u0010,\u001a\u0004\u0018\u00010 H\u0002J\n\u0010-\u001a\u0004\u0018\u00010 H\u0002J\u0010\u0010.\u001a\u0004\u0018\u00010 2\u0006\u0010\r\u001a\u00020\u000eJ\u0010\u0010/\u001a\u00020%2\u0006\u00100\u001a\u00020\u0003H\u0002J\b\u00101\u001a\u00020\u000eH\u0002J\u0006\u00102\u001a\u00020\u000eJ\u000e\u00103\u001a\u00020\u00032\u0006\u00104\u001a\u00020\u0003J\b\u00105\u001a\u00020%H\u0002J\n\u00106\u001a\u0004\u0018\u00010 H\u0002J\b\u00107\u001a\u00020%H\u0016J\u0006\u00108\u001a\u00020\u0010J\b\u00109\u001a\u00020%H\u0002J\b\u0010:\u001a\u00020\u000eH\u0002J\b\u0010;\u001a\u00020%H\u0002J\u000e\u0010<\u001a\u00020\u000e2\u0006\u0010=\u001a\u00020\u001dJ\u0016\u0010>\u001a\u0004\u0018\u00010 2\n\u0010?\u001a\u00060\u0003j\u0002`@H\u0002J\b\u0010A\u001a\u00020%H\u0002R$\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0003@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0010\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0018\u001a\u00020\u00198Æ\u0002¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0012\u0010\u001c\u001a\u00020\u001d8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u001fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0006\u0010\"\u001a\u00020#¨\u0006B"}, d2 = {"Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;", "Ljava/lang/Thread;", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "", "(Lkotlinx/coroutines/scheduling/CoroutineScheduler;I)V", "(Lkotlinx/coroutines/scheduling/CoroutineScheduler;)V", "indexInArray", "getIndexInArray", "()I", "setIndexInArray", "(I)V", "localQueue", "Lkotlinx/coroutines/scheduling/WorkQueue;", "mayHaveLocalTasks", "", "minDelayUntilStealableTaskNs", "", "nextParkedWorker", "", "getNextParkedWorker", "()Ljava/lang/Object;", "setNextParkedWorker", "(Ljava/lang/Object;)V", "rngState", "scheduler", "Lkotlinx/coroutines/scheduling/CoroutineScheduler;", "getScheduler", "()Lkotlinx/coroutines/scheduling/CoroutineScheduler;", "state", "Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;", "stolenTask", "Lkotlin/jvm/internal/Ref$ObjectRef;", "Lkotlinx/coroutines/scheduling/Task;", "terminationDeadline", "workerCtl", "Lkotlinx/atomicfu/AtomicInt;", "afterTask", "", "taskMode", "beforeTask", "executeTask", "task", "findAnyTask", "scanLocalQueue", "findBlockingTask", "findCpuTask", "findTask", "idleReset", com.ironsource.y8.a.t, "inStack", "isIo", "nextInt", "upperBound", "park", "pollGlobalQueues", "run", "runSingleTask", "runWorker", "tryAcquireCpuPermit", "tryPark", "tryReleaseCpu", "newState", "trySteal", "stealingMode", "Lkotlinx/coroutines/scheduling/StealingMode;", "tryTerminateWorker", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class Worker extends java.lang.Thread {
        private static final java.util.concurrent.atomic.AtomicIntegerFieldUpdater workerCtl$FU = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(kotlinx.coroutines.scheduling.CoroutineScheduler.Worker.class, "workerCtl");
        private volatile int indexInArray;
        public final kotlinx.coroutines.scheduling.WorkQueue localQueue;
        public boolean mayHaveLocalTasks;
        private long minDelayUntilStealableTaskNs;
        private volatile java.lang.Object nextParkedWorker;
        private int rngState;
        public kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState state;
        private final kotlin.jvm.internal.Ref.ObjectRef<kotlinx.coroutines.scheduling.Task> stolenTask;
        private long terminationDeadline;

        @kotlin.jvm.Volatile
        private volatile int workerCtl;

        public final int getWorkerCtl() {
            return this.workerCtl;
        }

        private Worker() {
            setDaemon(true);
            this.localQueue = new kotlinx.coroutines.scheduling.WorkQueue();
            this.stolenTask = new kotlin.jvm.internal.Ref.ObjectRef<>();
            this.state = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.DORMANT;
            this.nextParkedWorker = kotlinx.coroutines.scheduling.CoroutineScheduler.NOT_IN_STACK;
            this.rngState = kotlin.random.Random.INSTANCE.nextInt();
        }

        public final int getIndexInArray() {
            return this.indexInArray;
        }

        public final void setIndexInArray(int i) {
            setName(kotlinx.coroutines.scheduling.CoroutineScheduler.this.schedulerName + "-worker-" + (i == 0 ? "TERMINATED" : java.lang.String.valueOf(i)));
            this.indexInArray = i;
        }

        public Worker(kotlinx.coroutines.scheduling.CoroutineScheduler coroutineScheduler, int i) {
            this();
            setIndexInArray(i);
        }

        public final kotlinx.coroutines.scheduling.CoroutineScheduler getScheduler() {
            return kotlinx.coroutines.scheduling.CoroutineScheduler.this;
        }

        public final java.lang.Object getNextParkedWorker() {
            return this.nextParkedWorker;
        }

        public final void setNextParkedWorker(java.lang.Object obj) {
            this.nextParkedWorker = obj;
        }

        private final boolean tryAcquireCpuPermit() {
            boolean z;
            if (this.state == kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.CPU_ACQUIRED) {
                return true;
            }
            kotlinx.coroutines.scheduling.CoroutineScheduler coroutineScheduler = kotlinx.coroutines.scheduling.CoroutineScheduler.this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater = kotlinx.coroutines.scheduling.CoroutineScheduler.controlState$FU;
            while (true) {
                long j = atomicLongFieldUpdater.get(coroutineScheduler);
                if (((int) ((kotlinx.coroutines.scheduling.CoroutineScheduler.CPU_PERMITS_MASK & j) >> 42)) == 0) {
                    z = false;
                    break;
                }
                if (kotlinx.coroutines.scheduling.CoroutineScheduler.controlState$FU.compareAndSet(coroutineScheduler, j, j - 4398046511104L)) {
                    z = true;
                    break;
                }
            }
            if (!z) {
                return false;
            }
            this.state = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.CPU_ACQUIRED;
            return true;
        }

        public final boolean tryReleaseCpu(kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState newState) {
            kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState workerState = this.state;
            boolean z = workerState == kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.CPU_ACQUIRED;
            if (z) {
                kotlinx.coroutines.scheduling.CoroutineScheduler.controlState$FU.addAndGet(kotlinx.coroutines.scheduling.CoroutineScheduler.this, 4398046511104L);
            }
            if (workerState != newState) {
                this.state = newState;
            }
            return z;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            runWorker();
        }

        private final void runWorker() {
            loop0: while (true) {
                boolean z = false;
                while (true) {
                    if (kotlinx.coroutines.scheduling.CoroutineScheduler.this.isTerminated() || this.state == kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.TERMINATED) {
                        break loop0;
                    }
                    kotlinx.coroutines.scheduling.Task taskFindTask = findTask(this.mayHaveLocalTasks);
                    if (taskFindTask != null) {
                        this.minDelayUntilStealableTaskNs = 0L;
                        executeTask(taskFindTask);
                        break;
                    }
                    this.mayHaveLocalTasks = false;
                    if (this.minDelayUntilStealableTaskNs == 0) {
                        tryPark();
                    } else {
                        if (z) {
                            tryReleaseCpu(kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.PARKING);
                            java.lang.Thread.interrupted();
                            java.util.concurrent.locks.LockSupport.parkNanos(this.minDelayUntilStealableTaskNs);
                            this.minDelayUntilStealableTaskNs = 0L;
                            break;
                        }
                        z = true;
                    }
                }
            }
            tryReleaseCpu(kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.TERMINATED);
        }

        public final long runSingleTask() {
            kotlinx.coroutines.scheduling.Task taskFindBlockingTask;
            kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState workerState = this.state;
            boolean z = workerState == kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.CPU_ACQUIRED;
            if (z) {
                taskFindBlockingTask = findCpuTask();
            } else {
                taskFindBlockingTask = findBlockingTask();
            }
            if (taskFindBlockingTask == null) {
                long j = this.minDelayUntilStealableTaskNs;
                if (j == 0) {
                    return -1L;
                }
                return j;
            }
            kotlinx.coroutines.scheduling.CoroutineScheduler.this.runSafely(taskFindBlockingTask);
            if (!z) {
                kotlinx.coroutines.scheduling.CoroutineScheduler.controlState$FU.addAndGet(kotlinx.coroutines.scheduling.CoroutineScheduler.this, kotlinx.coroutines.scheduling.CoroutineScheduler.PARKED_VERSION_MASK);
            }
            if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()) {
                if (!(this.state == workerState)) {
                    throw new java.lang.AssertionError();
                }
            }
            return 0L;
        }

        public final boolean isIo() {
            return this.state == kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.BLOCKING;
        }

        private final void tryPark() {
            if (!inStack()) {
                kotlinx.coroutines.scheduling.CoroutineScheduler.this.parkedWorkersStackPush(this);
                return;
            }
            workerCtl$FU.set(this, -1);
            while (inStack() && workerCtl$FU.get(this) == -1 && !kotlinx.coroutines.scheduling.CoroutineScheduler.this.isTerminated() && this.state != kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.TERMINATED) {
                tryReleaseCpu(kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.PARKING);
                java.lang.Thread.interrupted();
                park();
            }
        }

        private final boolean inStack() {
            return this.nextParkedWorker != kotlinx.coroutines.scheduling.CoroutineScheduler.NOT_IN_STACK;
        }

        private final void beforeTask(int taskMode) {
            if (taskMode != 0 && tryReleaseCpu(kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.BLOCKING)) {
                kotlinx.coroutines.scheduling.CoroutineScheduler.this.signalCpuWork();
            }
        }

        private final void afterTask(int taskMode) {
            if (taskMode == 0) {
                return;
            }
            kotlinx.coroutines.scheduling.CoroutineScheduler.controlState$FU.addAndGet(kotlinx.coroutines.scheduling.CoroutineScheduler.this, kotlinx.coroutines.scheduling.CoroutineScheduler.PARKED_VERSION_MASK);
            kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState workerState = this.state;
            if (workerState != kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.TERMINATED) {
                if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()) {
                    if (!(workerState == kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.BLOCKING)) {
                        throw new java.lang.AssertionError();
                    }
                }
                this.state = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.DORMANT;
            }
        }

        public final int nextInt(int upperBound) {
            int i = this.rngState;
            int i2 = i ^ (i << 13);
            int i3 = i2 ^ (i2 >> 17);
            int i4 = i3 ^ (i3 << 5);
            this.rngState = i4;
            int i5 = upperBound - 1;
            return (i5 & upperBound) == 0 ? i4 & i5 : (i4 & Integer.MAX_VALUE) % upperBound;
        }

        private final void park() {
            if (this.terminationDeadline == 0) {
                this.terminationDeadline = java.lang.System.nanoTime() + kotlinx.coroutines.scheduling.CoroutineScheduler.this.idleWorkerKeepAliveNs;
            }
            java.util.concurrent.locks.LockSupport.parkNanos(kotlinx.coroutines.scheduling.CoroutineScheduler.this.idleWorkerKeepAliveNs);
            if (java.lang.System.nanoTime() - this.terminationDeadline >= 0) {
                this.terminationDeadline = 0L;
                tryTerminateWorker();
            }
        }

        private final void tryTerminateWorker() {
            kotlinx.coroutines.internal.ResizableAtomicArray<kotlinx.coroutines.scheduling.CoroutineScheduler.Worker> resizableAtomicArray = kotlinx.coroutines.scheduling.CoroutineScheduler.this.workers;
            kotlinx.coroutines.scheduling.CoroutineScheduler coroutineScheduler = kotlinx.coroutines.scheduling.CoroutineScheduler.this;
            synchronized (resizableAtomicArray) {
                if (coroutineScheduler.isTerminated()) {
                    return;
                }
                if (((int) (kotlinx.coroutines.scheduling.CoroutineScheduler.controlState$FU.get(coroutineScheduler) & 2097151)) <= coroutineScheduler.corePoolSize) {
                    return;
                }
                if (workerCtl$FU.compareAndSet(this, -1, 1)) {
                    int i = this.indexInArray;
                    setIndexInArray(0);
                    coroutineScheduler.parkedWorkersStackTopUpdate(this, i, 0);
                    int andDecrement = (int) (kotlinx.coroutines.scheduling.CoroutineScheduler.controlState$FU.getAndDecrement(coroutineScheduler) & 2097151);
                    if (andDecrement != i) {
                        kotlinx.coroutines.scheduling.CoroutineScheduler.Worker worker = coroutineScheduler.workers.get(andDecrement);
                        kotlin.jvm.internal.Intrinsics.checkNotNull(worker);
                        kotlinx.coroutines.scheduling.CoroutineScheduler.Worker worker2 = worker;
                        coroutineScheduler.workers.setSynchronized(i, worker2);
                        worker2.setIndexInArray(i);
                        coroutineScheduler.parkedWorkersStackTopUpdate(worker2, andDecrement, i);
                    }
                    coroutineScheduler.workers.setSynchronized(andDecrement, null);
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    this.state = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.TERMINATED;
                }
            }
        }

        private final void idleReset(int mode) {
            this.terminationDeadline = 0L;
            if (this.state == kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.PARKING) {
                if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()) {
                    if (!(mode == 1)) {
                        throw new java.lang.AssertionError();
                    }
                }
                this.state = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.BLOCKING;
            }
        }

        public final kotlinx.coroutines.scheduling.Task findTask(boolean mayHaveLocalTasks) {
            return tryAcquireCpuPermit() ? findAnyTask(mayHaveLocalTasks) : findBlockingTask();
        }

        private final kotlinx.coroutines.scheduling.Task findBlockingTask() {
            kotlinx.coroutines.scheduling.Task taskPollBlocking = this.localQueue.pollBlocking();
            if (taskPollBlocking != null) {
                return taskPollBlocking;
            }
            kotlinx.coroutines.scheduling.Task taskRemoveFirstOrNull = kotlinx.coroutines.scheduling.CoroutineScheduler.this.globalBlockingQueue.removeFirstOrNull();
            return taskRemoveFirstOrNull == null ? trySteal(1) : taskRemoveFirstOrNull;
        }

        private final kotlinx.coroutines.scheduling.Task findCpuTask() {
            kotlinx.coroutines.scheduling.Task taskPollCpu = this.localQueue.pollCpu();
            if (taskPollCpu != null) {
                return taskPollCpu;
            }
            kotlinx.coroutines.scheduling.Task taskRemoveFirstOrNull = kotlinx.coroutines.scheduling.CoroutineScheduler.this.globalBlockingQueue.removeFirstOrNull();
            return taskRemoveFirstOrNull == null ? trySteal(2) : taskRemoveFirstOrNull;
        }

        private final kotlinx.coroutines.scheduling.Task findAnyTask(boolean scanLocalQueue) {
            kotlinx.coroutines.scheduling.Task taskPollGlobalQueues;
            kotlinx.coroutines.scheduling.Task taskPollGlobalQueues2;
            if (scanLocalQueue) {
                boolean z = nextInt(kotlinx.coroutines.scheduling.CoroutineScheduler.this.corePoolSize * 2) == 0;
                if (z && (taskPollGlobalQueues2 = pollGlobalQueues()) != null) {
                    return taskPollGlobalQueues2;
                }
                kotlinx.coroutines.scheduling.Task taskPoll = this.localQueue.poll();
                if (taskPoll != null) {
                    return taskPoll;
                }
                if (!z && (taskPollGlobalQueues = pollGlobalQueues()) != null) {
                    return taskPollGlobalQueues;
                }
            } else {
                kotlinx.coroutines.scheduling.Task taskPollGlobalQueues3 = pollGlobalQueues();
                if (taskPollGlobalQueues3 != null) {
                    return taskPollGlobalQueues3;
                }
            }
            return trySteal(3);
        }

        private final kotlinx.coroutines.scheduling.Task pollGlobalQueues() {
            if (nextInt(2) == 0) {
                kotlinx.coroutines.scheduling.Task taskRemoveFirstOrNull = kotlinx.coroutines.scheduling.CoroutineScheduler.this.globalCpuQueue.removeFirstOrNull();
                return taskRemoveFirstOrNull != null ? taskRemoveFirstOrNull : kotlinx.coroutines.scheduling.CoroutineScheduler.this.globalBlockingQueue.removeFirstOrNull();
            }
            kotlinx.coroutines.scheduling.Task taskRemoveFirstOrNull2 = kotlinx.coroutines.scheduling.CoroutineScheduler.this.globalBlockingQueue.removeFirstOrNull();
            return taskRemoveFirstOrNull2 != null ? taskRemoveFirstOrNull2 : kotlinx.coroutines.scheduling.CoroutineScheduler.this.globalCpuQueue.removeFirstOrNull();
        }

        private final kotlinx.coroutines.scheduling.Task trySteal(int stealingMode) {
            int i = (int) (kotlinx.coroutines.scheduling.CoroutineScheduler.controlState$FU.get(kotlinx.coroutines.scheduling.CoroutineScheduler.this) & 2097151);
            if (i < 2) {
                return null;
            }
            int iNextInt = nextInt(i);
            kotlinx.coroutines.scheduling.CoroutineScheduler coroutineScheduler = kotlinx.coroutines.scheduling.CoroutineScheduler.this;
            long jMin = Long.MAX_VALUE;
            for (int i2 = 0; i2 < i; i2++) {
                iNextInt++;
                if (iNextInt > i) {
                    iNextInt = 1;
                }
                kotlinx.coroutines.scheduling.CoroutineScheduler.Worker worker = coroutineScheduler.workers.get(iNextInt);
                if (worker != null && worker != this) {
                    long jTrySteal = worker.localQueue.trySteal(stealingMode, this.stolenTask);
                    if (jTrySteal == -1) {
                        kotlinx.coroutines.scheduling.Task task = this.stolenTask.element;
                        this.stolenTask.element = null;
                        return task;
                    }
                    if (jTrySteal > 0) {
                        jMin = java.lang.Math.min(jMin, jTrySteal);
                    }
                }
            }
            if (jMin == Long.MAX_VALUE) {
                jMin = 0;
            }
            this.minDelayUntilStealableTaskNs = jMin;
            return null;
        }

        private final void executeTask(kotlinx.coroutines.scheduling.Task task) {
            int taskMode = task.taskContext.getTaskMode();
            idleReset(taskMode);
            beforeTask(taskMode);
            kotlinx.coroutines.scheduling.CoroutineScheduler.this.runSafely(task);
            afterTask(taskMode);
        }
    }

    private final boolean addToGlobalQueue(kotlinx.coroutines.scheduling.Task task) {
        if (task.taskContext.getTaskMode() == 1) {
            return this.globalBlockingQueue.addLast(task);
        }
        return this.globalCpuQueue.addLast(task);
    }
}
