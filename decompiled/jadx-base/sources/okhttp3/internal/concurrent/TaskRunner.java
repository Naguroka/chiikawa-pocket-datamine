package okhttp3.internal.concurrent;

/* JADX INFO: compiled from: TaskRunner.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 #2\u00020\u0001:\u0003\"#$B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\u0014J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\rH\u0002J\b\u0010\u001a\u001a\u0004\u0018\u00010\u0018J\u0010\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0006\u0010\u001c\u001a\u00020\u0016J\u0015\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\tH\u0000¢\u0006\u0002\b\u001fJ\u0006\u0010 \u001a\u00020\tJ\u0010\u0010!\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lokhttp3/internal/concurrent/TaskRunner;", "", "backend", "Lokhttp3/internal/concurrent/TaskRunner$Backend;", "(Lokhttp3/internal/concurrent/TaskRunner$Backend;)V", "getBackend", "()Lokhttp3/internal/concurrent/TaskRunner$Backend;", "busyQueues", "", "Lokhttp3/internal/concurrent/TaskQueue;", "coordinatorWaiting", "", "coordinatorWakeUpAt", "", "nextQueueName", "", "readyQueues", "runnable", "Ljava/lang/Runnable;", "activeQueues", "", "afterRun", "", "task", "Lokhttp3/internal/concurrent/Task;", "delayNanos", "awaitTaskToRun", "beforeRun", "cancelAll", "kickCoordinator", "taskQueue", "kickCoordinator$okhttp", "newQueue", "runTask", "Backend", "Companion", "RealBackend", com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TaskRunner {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final okhttp3.internal.concurrent.TaskRunner.Companion INSTANCE = new okhttp3.internal.concurrent.TaskRunner.Companion(null);
    public static final okhttp3.internal.concurrent.TaskRunner INSTANCE = new okhttp3.internal.concurrent.TaskRunner(new okhttp3.internal.concurrent.TaskRunner.RealBackend(okhttp3.internal.Util.threadFactory(okhttp3.internal.Util.okHttpName + " TaskRunner", true)));
    private static final java.util.logging.Logger logger;
    private final okhttp3.internal.concurrent.TaskRunner.Backend backend;
    private final java.util.List<okhttp3.internal.concurrent.TaskQueue> busyQueues;
    private boolean coordinatorWaiting;
    private long coordinatorWakeUpAt;
    private int nextQueueName;
    private final java.util.List<okhttp3.internal.concurrent.TaskQueue> readyQueues;
    private final java.lang.Runnable runnable;

    /* JADX INFO: compiled from: TaskRunner.kt */
    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH&J\b\u0010\r\u001a\u00020\tH&¨\u0006\u000e"}, d2 = {"Lokhttp3/internal/concurrent/TaskRunner$Backend;", "", "beforeTask", "", "taskRunner", "Lokhttp3/internal/concurrent/TaskRunner;", "coordinatorNotify", "coordinatorWait", "nanos", "", "execute", "runnable", "Ljava/lang/Runnable;", "nanoTime", com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface Backend {
        void beforeTask(okhttp3.internal.concurrent.TaskRunner taskRunner);

        void coordinatorNotify(okhttp3.internal.concurrent.TaskRunner taskRunner);

        void coordinatorWait(okhttp3.internal.concurrent.TaskRunner taskRunner, long nanos);

        void execute(java.lang.Runnable runnable);

        long nanoTime();
    }

    public TaskRunner(okhttp3.internal.concurrent.TaskRunner.Backend backend) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(backend, "backend");
        this.backend = backend;
        this.nextQueueName = 10000;
        this.busyQueues = new java.util.ArrayList();
        this.readyQueues = new java.util.ArrayList();
        this.runnable = new java.lang.Runnable() { // from class: okhttp3.internal.concurrent.TaskRunner$runnable$1
            @Override // java.lang.Runnable
            public void run() {
                okhttp3.internal.concurrent.Task taskAwaitTaskToRun;
                long jNanoTime;
                while (true) {
                    okhttp3.internal.concurrent.TaskRunner taskRunner = this.this$0;
                    synchronized (taskRunner) {
                        taskAwaitTaskToRun = taskRunner.awaitTaskToRun();
                    }
                    if (taskAwaitTaskToRun == null) {
                        return;
                    }
                    okhttp3.internal.concurrent.TaskQueue queue = taskAwaitTaskToRun.getQueue();
                    kotlin.jvm.internal.Intrinsics.checkNotNull(queue);
                    okhttp3.internal.concurrent.TaskRunner taskRunner2 = this.this$0;
                    boolean zIsLoggable = okhttp3.internal.concurrent.TaskRunner.INSTANCE.getLogger().isLoggable(java.util.logging.Level.FINE);
                    if (zIsLoggable) {
                        jNanoTime = queue.getTaskRunner().getBackend().nanoTime();
                        okhttp3.internal.concurrent.TaskLoggerKt.log(taskAwaitTaskToRun, queue, "starting");
                    } else {
                        jNanoTime = -1;
                    }
                    try {
                        taskRunner2.runTask(taskAwaitTaskToRun);
                        try {
                            kotlin.Unit unit = kotlin.Unit.INSTANCE;
                            if (zIsLoggable) {
                                okhttp3.internal.concurrent.TaskLoggerKt.log(taskAwaitTaskToRun, queue, "finished run in " + okhttp3.internal.concurrent.TaskLoggerKt.formatDuration(queue.getTaskRunner().getBackend().nanoTime() - jNanoTime));
                            }
                        } catch (java.lang.Throwable th) {
                            if (zIsLoggable) {
                                okhttp3.internal.concurrent.TaskLoggerKt.log(taskAwaitTaskToRun, queue, "failed a run in " + okhttp3.internal.concurrent.TaskLoggerKt.formatDuration(queue.getTaskRunner().getBackend().nanoTime() - jNanoTime));
                            }
                            throw th;
                        }
                    } catch (java.lang.Throwable th2) {
                        taskRunner2.getBackend().execute(this);
                        throw th2;
                    }
                }
            }
        };
    }

    public final okhttp3.internal.concurrent.TaskRunner.Backend getBackend() {
        return this.backend;
    }

    public final okhttp3.internal.concurrent.TaskQueue newQueue() {
        int i;
        synchronized (this) {
            i = this.nextQueueName;
            this.nextQueueName = i + 1;
        }
        return new okhttp3.internal.concurrent.TaskQueue(this, "Q" + i);
    }

    public final java.util.List<okhttp3.internal.concurrent.TaskQueue> activeQueues() {
        java.util.List<okhttp3.internal.concurrent.TaskQueue> listPlus;
        synchronized (this) {
            listPlus = kotlin.collections.CollectionsKt.plus((java.util.Collection) this.busyQueues, (java.lang.Iterable) this.readyQueues);
        }
        return listPlus;
    }

    public final void cancelAll() {
        int size = this.busyQueues.size();
        while (true) {
            size--;
            if (-1 >= size) {
                break;
            } else {
                this.busyQueues.get(size).cancelAllAndDecide$okhttp();
            }
        }
        for (int size2 = this.readyQueues.size() - 1; -1 < size2; size2--) {
            okhttp3.internal.concurrent.TaskQueue taskQueue = this.readyQueues.get(size2);
            taskQueue.cancelAllAndDecide$okhttp();
            if (taskQueue.getFutureTasks$okhttp().isEmpty()) {
                this.readyQueues.remove(size2);
            }
        }
    }

    /* JADX INFO: compiled from: TaskRunner.kt */
    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u000eH\u0016J\u0006\u0010\u0013\u001a\u00020\bR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lokhttp3/internal/concurrent/TaskRunner$RealBackend;", "Lokhttp3/internal/concurrent/TaskRunner$Backend;", "threadFactory", "Ljava/util/concurrent/ThreadFactory;", "(Ljava/util/concurrent/ThreadFactory;)V", "executor", "Ljava/util/concurrent/ThreadPoolExecutor;", "beforeTask", "", "taskRunner", "Lokhttp3/internal/concurrent/TaskRunner;", "coordinatorNotify", "coordinatorWait", "nanos", "", "execute", "runnable", "Ljava/lang/Runnable;", "nanoTime", "shutdown", com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class RealBackend implements okhttp3.internal.concurrent.TaskRunner.Backend {
        private final java.util.concurrent.ThreadPoolExecutor executor;

        @Override // okhttp3.internal.concurrent.TaskRunner.Backend
        public void beforeTask(okhttp3.internal.concurrent.TaskRunner taskRunner) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        }

        public RealBackend(java.util.concurrent.ThreadFactory threadFactory) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(threadFactory, "threadFactory");
            this.executor = new java.util.concurrent.ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.SynchronousQueue(), threadFactory);
        }

        @Override // okhttp3.internal.concurrent.TaskRunner.Backend
        public long nanoTime() {
            return java.lang.System.nanoTime();
        }

        @Override // okhttp3.internal.concurrent.TaskRunner.Backend
        public void coordinatorWait(okhttp3.internal.concurrent.TaskRunner taskRunner, long nanos) throws java.lang.InterruptedException {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
            long j = nanos / 1000000;
            long j2 = nanos - (1000000 * j);
            if (j > 0 || nanos > 0) {
                taskRunner.wait(j, (int) j2);
            }
        }

        @Override // okhttp3.internal.concurrent.TaskRunner.Backend
        public void execute(java.lang.Runnable runnable) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(runnable, "runnable");
            this.executor.execute(runnable);
        }

        public final void shutdown() {
            this.executor.shutdown();
        }

        @Override // okhttp3.internal.concurrent.TaskRunner.Backend
        public void coordinatorNotify(okhttp3.internal.concurrent.TaskRunner taskRunner) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
            taskRunner.notify();
        }
    }

    /* JADX INFO: compiled from: TaskRunner.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lokhttp3/internal/concurrent/TaskRunner$Companion;", "", "()V", "INSTANCE", "Lokhttp3/internal/concurrent/TaskRunner;", "logger", "Ljava/util/logging/Logger;", "getLogger", "()Ljava/util/logging/Logger;", com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final java.util.logging.Logger getLogger() {
            return okhttp3.internal.concurrent.TaskRunner.logger;
        }
    }

    static {
        java.util.logging.Logger logger2 = java.util.logging.Logger.getLogger(okhttp3.internal.concurrent.TaskRunner.class.getName());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(logger2, "getLogger(TaskRunner::class.java.name)");
        logger = logger2;
    }

    public final void kickCoordinator$okhttp(okhttp3.internal.concurrent.TaskQueue taskQueue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taskQueue, "taskQueue");
        if (!okhttp3.internal.Util.assertionsEnabled || java.lang.Thread.holdsLock(this)) {
            if (taskQueue.getActiveTask() == null) {
                if (!taskQueue.getFutureTasks$okhttp().isEmpty()) {
                    okhttp3.internal.Util.addIfAbsent(this.readyQueues, taskQueue);
                } else {
                    this.readyQueues.remove(taskQueue);
                }
            }
            if (this.coordinatorWaiting) {
                this.backend.coordinatorNotify(this);
                return;
            } else {
                this.backend.execute(this.runnable);
                return;
            }
        }
        throw new java.lang.AssertionError("Thread " + java.lang.Thread.currentThread().getName() + " MUST hold lock on " + this);
    }

    private final void beforeRun(okhttp3.internal.concurrent.Task task) {
        if (!okhttp3.internal.Util.assertionsEnabled || java.lang.Thread.holdsLock(this)) {
            task.setNextExecuteNanoTime$okhttp(-1L);
            okhttp3.internal.concurrent.TaskQueue queue = task.getQueue();
            kotlin.jvm.internal.Intrinsics.checkNotNull(queue);
            queue.getFutureTasks$okhttp().remove(task);
            this.readyQueues.remove(queue);
            queue.setActiveTask$okhttp(task);
            this.busyQueues.add(queue);
            return;
        }
        throw new java.lang.AssertionError("Thread " + java.lang.Thread.currentThread().getName() + " MUST hold lock on " + this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void runTask(okhttp3.internal.concurrent.Task task) {
        if (okhttp3.internal.Util.assertionsEnabled && java.lang.Thread.holdsLock(this)) {
            throw new java.lang.AssertionError("Thread " + java.lang.Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        java.lang.Thread threadCurrentThread = java.lang.Thread.currentThread();
        java.lang.String name = threadCurrentThread.getName();
        threadCurrentThread.setName(task.getName());
        try {
            long jRunOnce = task.runOnce();
            synchronized (this) {
                afterRun(task, jRunOnce);
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            }
        } finally {
            synchronized (this) {
                afterRun(task, -1L);
                kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                threadCurrentThread.setName(name);
            }
        }
    }

    private final void afterRun(okhttp3.internal.concurrent.Task task, long delayNanos) {
        if (!okhttp3.internal.Util.assertionsEnabled || java.lang.Thread.holdsLock(this)) {
            okhttp3.internal.concurrent.TaskQueue queue = task.getQueue();
            kotlin.jvm.internal.Intrinsics.checkNotNull(queue);
            if (!(queue.getActiveTask() == task)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            boolean cancelActiveTask$okhttp = queue.getCancelActiveTask();
            queue.setCancelActiveTask$okhttp(false);
            queue.setActiveTask$okhttp(null);
            this.busyQueues.remove(queue);
            if (delayNanos != -1 && !cancelActiveTask$okhttp && !queue.getShutdown()) {
                queue.scheduleAndDecide$okhttp(task, delayNanos, true);
            }
            if (!queue.getFutureTasks$okhttp().isEmpty()) {
                this.readyQueues.add(queue);
                return;
            }
            return;
        }
        throw new java.lang.AssertionError("Thread " + java.lang.Thread.currentThread().getName() + " MUST hold lock on " + this);
    }

    public final okhttp3.internal.concurrent.Task awaitTaskToRun() {
        boolean z;
        if (!okhttp3.internal.Util.assertionsEnabled || java.lang.Thread.holdsLock(this)) {
            while (!this.readyQueues.isEmpty()) {
                long jNanoTime = this.backend.nanoTime();
                java.util.Iterator<okhttp3.internal.concurrent.TaskQueue> it = this.readyQueues.iterator();
                long jMin = Long.MAX_VALUE;
                okhttp3.internal.concurrent.Task task = null;
                while (true) {
                    if (!it.hasNext()) {
                        z = false;
                        break;
                    }
                    okhttp3.internal.concurrent.Task task2 = it.next().getFutureTasks$okhttp().get(0);
                    long jMax = java.lang.Math.max(0L, task2.getNextExecuteNanoTime() - jNanoTime);
                    if (jMax > 0) {
                        jMin = java.lang.Math.min(jMax, jMin);
                    } else {
                        if (task != null) {
                            z = true;
                            break;
                        }
                        task = task2;
                    }
                }
                if (task != null) {
                    beforeRun(task);
                    if (z || (!this.coordinatorWaiting && (!this.readyQueues.isEmpty()))) {
                        this.backend.execute(this.runnable);
                    }
                    return task;
                }
                if (this.coordinatorWaiting) {
                    if (jMin < this.coordinatorWakeUpAt - jNanoTime) {
                        this.backend.coordinatorNotify(this);
                    }
                    return null;
                }
                this.coordinatorWaiting = true;
                this.coordinatorWakeUpAt = jNanoTime + jMin;
                try {
                    try {
                        this.backend.coordinatorWait(this, jMin);
                    } catch (java.lang.InterruptedException unused) {
                        cancelAll();
                    }
                    this.coordinatorWaiting = false;
                } catch (java.lang.Throwable th) {
                    this.coordinatorWaiting = false;
                    throw th;
                }
            }
            return null;
        }
        throw new java.lang.AssertionError("Thread " + java.lang.Thread.currentThread().getName() + " MUST hold lock on " + this);
    }
}
