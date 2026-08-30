package okhttp3.internal.concurrent;

/* JADX INFO: compiled from: TaskQueue.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u00013B\u0017\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010!\u001a\u00020\"J\r\u0010#\u001a\u00020\u000eH\u0000¢\u0006\u0002\b$J8\u0010%\u001a\u00020\"2\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010&\u001a\u00020'2\b\b\u0002\u0010(\u001a\u00020\u000e2\u000e\b\u0004\u0010)\u001a\b\u0012\u0004\u0012\u00020\"0*H\u0086\bø\u0001\u0000J\u0006\u0010+\u001a\u00020,J.\u0010-\u001a\u00020\"2\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010&\u001a\u00020'2\u000e\b\u0004\u0010)\u001a\b\u0012\u0004\u0012\u00020'0*H\u0086\bø\u0001\u0000J\u0018\u0010-\u001a\u00020\"2\u0006\u0010.\u001a\u00020\b2\b\b\u0002\u0010&\u001a\u00020'J%\u0010/\u001a\u00020\u000e2\u0006\u0010.\u001a\u00020\b2\u0006\u0010&\u001a\u00020'2\u0006\u00100\u001a\u00020\u000eH\u0000¢\u0006\u0002\b1J\u0006\u0010\u001c\u001a\u00020\"J\b\u00102\u001a\u00020\u0005H\u0016R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0014X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\b0\u001a8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0016R\u001a\u0010\u001c\u001a\u00020\u000eX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0010\"\u0004\b\u001e\u0010\u0012R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 \u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u00064"}, d2 = {"Lokhttp3/internal/concurrent/TaskQueue;", "", "taskRunner", "Lokhttp3/internal/concurrent/TaskRunner;", "name", "", "(Lokhttp3/internal/concurrent/TaskRunner;Ljava/lang/String;)V", "activeTask", "Lokhttp3/internal/concurrent/Task;", "getActiveTask$okhttp", "()Lokhttp3/internal/concurrent/Task;", "setActiveTask$okhttp", "(Lokhttp3/internal/concurrent/Task;)V", "cancelActiveTask", "", "getCancelActiveTask$okhttp", "()Z", "setCancelActiveTask$okhttp", "(Z)V", "futureTasks", "", "getFutureTasks$okhttp", "()Ljava/util/List;", "getName$okhttp", "()Ljava/lang/String;", "scheduledTasks", "", "getScheduledTasks", "shutdown", "getShutdown$okhttp", "setShutdown$okhttp", "getTaskRunner$okhttp", "()Lokhttp3/internal/concurrent/TaskRunner;", "cancelAll", "", "cancelAllAndDecide", "cancelAllAndDecide$okhttp", "execute", "delayNanos", "", "cancelable", "block", "Lkotlin/Function0;", "idleLatch", "Ljava/util/concurrent/CountDownLatch;", "schedule", "task", "scheduleAndDecide", "recurrence", "scheduleAndDecide$okhttp", "toString", "AwaitIdleTask", com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TaskQueue {
    private okhttp3.internal.concurrent.Task activeTask;
    private boolean cancelActiveTask;
    private final java.util.List<okhttp3.internal.concurrent.Task> futureTasks;
    private final java.lang.String name;
    private boolean shutdown;
    private final okhttp3.internal.concurrent.TaskRunner taskRunner;

    public TaskQueue(okhttp3.internal.concurrent.TaskRunner taskRunner, java.lang.String name) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        this.taskRunner = taskRunner;
        this.name = name;
        this.futureTasks = new java.util.ArrayList();
    }

    /* JADX INFO: renamed from: getTaskRunner$okhttp, reason: from getter */
    public final okhttp3.internal.concurrent.TaskRunner getTaskRunner() {
        return this.taskRunner;
    }

    /* JADX INFO: renamed from: getName$okhttp, reason: from getter */
    public final java.lang.String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: getShutdown$okhttp, reason: from getter */
    public final boolean getShutdown() {
        return this.shutdown;
    }

    public final void setShutdown$okhttp(boolean z) {
        this.shutdown = z;
    }

    /* JADX INFO: renamed from: getActiveTask$okhttp, reason: from getter */
    public final okhttp3.internal.concurrent.Task getActiveTask() {
        return this.activeTask;
    }

    public final void setActiveTask$okhttp(okhttp3.internal.concurrent.Task task) {
        this.activeTask = task;
    }

    public final java.util.List<okhttp3.internal.concurrent.Task> getFutureTasks$okhttp() {
        return this.futureTasks;
    }

    /* JADX INFO: renamed from: getCancelActiveTask$okhttp, reason: from getter */
    public final boolean getCancelActiveTask() {
        return this.cancelActiveTask;
    }

    public final void setCancelActiveTask$okhttp(boolean z) {
        this.cancelActiveTask = z;
    }

    public final java.util.List<okhttp3.internal.concurrent.Task> getScheduledTasks() {
        java.util.List<okhttp3.internal.concurrent.Task> list;
        synchronized (this.taskRunner) {
            list = kotlin.collections.CollectionsKt.toList(this.futureTasks);
        }
        return list;
    }

    public static /* synthetic */ void schedule$default(okhttp3.internal.concurrent.TaskQueue taskQueue, okhttp3.internal.concurrent.Task task, long j, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        taskQueue.schedule(task, j);
    }

    public final void schedule(okhttp3.internal.concurrent.Task task, long delayNanos) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(task, "task");
        synchronized (this.taskRunner) {
            if (this.shutdown) {
                if (task.getCancelable()) {
                    if (okhttp3.internal.concurrent.TaskRunner.INSTANCE.getLogger().isLoggable(java.util.logging.Level.FINE)) {
                        okhttp3.internal.concurrent.TaskLoggerKt.log(task, this, "schedule canceled (queue is shutdown)");
                    }
                    return;
                } else {
                    if (okhttp3.internal.concurrent.TaskRunner.INSTANCE.getLogger().isLoggable(java.util.logging.Level.FINE)) {
                        okhttp3.internal.concurrent.TaskLoggerKt.log(task, this, "schedule failed (queue is shutdown)");
                    }
                    throw new java.util.concurrent.RejectedExecutionException();
                }
            }
            if (scheduleAndDecide$okhttp(task, delayNanos, false)) {
                this.taskRunner.kickCoordinator$okhttp(this);
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    public static /* synthetic */ void schedule$default(okhttp3.internal.concurrent.TaskQueue taskQueue, java.lang.String name, long j, kotlin.jvm.functions.Function0 block, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        taskQueue.schedule(new okhttp3.internal.concurrent.TaskQueue.AnonymousClass2(name, block), j);
    }

    /* JADX INFO: renamed from: okhttp3.internal.concurrent.TaskQueue$schedule$2, reason: invalid class name */
    /* JADX INFO: compiled from: TaskQueue.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"okhttp3/internal/concurrent/TaskQueue$schedule$2", "Lokhttp3/internal/concurrent/Task;", "runOnce", "", com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = org.objectweb.asm.Opcodes.ARETURN)
    public static final class AnonymousClass2 extends okhttp3.internal.concurrent.Task {
        final /* synthetic */ kotlin.jvm.functions.Function0<java.lang.Long> $block;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(java.lang.String str, kotlin.jvm.functions.Function0<java.lang.Long> function0) {
            super(str, false, 2, null);
            this.$block = function0;
        }

        @Override // okhttp3.internal.concurrent.Task
        public long runOnce() {
            return this.$block.invoke().longValue();
        }
    }

    public final void schedule(java.lang.String name, long delayNanos, kotlin.jvm.functions.Function0<java.lang.Long> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        schedule(new okhttp3.internal.concurrent.TaskQueue.AnonymousClass2(name, block), delayNanos);
    }

    public static /* synthetic */ void execute$default(okhttp3.internal.concurrent.TaskQueue taskQueue, java.lang.String name, long j, boolean z, kotlin.jvm.functions.Function0 block, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        if ((i & 4) != 0) {
            z = true;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        taskQueue.schedule(new okhttp3.internal.concurrent.TaskQueue.AnonymousClass1(name, z, block), j);
    }

    /* JADX INFO: renamed from: okhttp3.internal.concurrent.TaskQueue$execute$1, reason: invalid class name */
    /* JADX INFO: compiled from: TaskQueue.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"okhttp3/internal/concurrent/TaskQueue$execute$1", "Lokhttp3/internal/concurrent/Task;", "runOnce", "", com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = org.objectweb.asm.Opcodes.ARETURN)
    public static final class AnonymousClass1 extends okhttp3.internal.concurrent.Task {
        final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> $block;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(java.lang.String str, boolean z, kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
            super(str, z);
            this.$block = function0;
        }

        @Override // okhttp3.internal.concurrent.Task
        public long runOnce() {
            this.$block.invoke();
            return -1L;
        }
    }

    public final void execute(java.lang.String name, long delayNanos, boolean cancelable, kotlin.jvm.functions.Function0<kotlin.Unit> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        schedule(new okhttp3.internal.concurrent.TaskQueue.AnonymousClass1(name, cancelable, block), delayNanos);
    }

    public final java.util.concurrent.CountDownLatch idleLatch() {
        synchronized (this.taskRunner) {
            if (this.activeTask == null && this.futureTasks.isEmpty()) {
                return new java.util.concurrent.CountDownLatch(0);
            }
            okhttp3.internal.concurrent.Task task = this.activeTask;
            if (task instanceof okhttp3.internal.concurrent.TaskQueue.AwaitIdleTask) {
                return ((okhttp3.internal.concurrent.TaskQueue.AwaitIdleTask) task).getLatch();
            }
            for (okhttp3.internal.concurrent.Task task2 : this.futureTasks) {
                if (task2 instanceof okhttp3.internal.concurrent.TaskQueue.AwaitIdleTask) {
                    return ((okhttp3.internal.concurrent.TaskQueue.AwaitIdleTask) task2).getLatch();
                }
            }
            okhttp3.internal.concurrent.TaskQueue.AwaitIdleTask awaitIdleTask = new okhttp3.internal.concurrent.TaskQueue.AwaitIdleTask();
            if (scheduleAndDecide$okhttp(awaitIdleTask, 0L, false)) {
                this.taskRunner.kickCoordinator$okhttp(this);
            }
            return awaitIdleTask.getLatch();
        }
    }

    /* JADX INFO: compiled from: TaskQueue.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lokhttp3/internal/concurrent/TaskQueue$AwaitIdleTask;", "Lokhttp3/internal/concurrent/Task;", "()V", "latch", "Ljava/util/concurrent/CountDownLatch;", "getLatch", "()Ljava/util/concurrent/CountDownLatch;", "runOnce", "", com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class AwaitIdleTask extends okhttp3.internal.concurrent.Task {
        private final java.util.concurrent.CountDownLatch latch;

        public AwaitIdleTask() {
            super(okhttp3.internal.Util.okHttpName + " awaitIdle", false);
            this.latch = new java.util.concurrent.CountDownLatch(1);
        }

        public final java.util.concurrent.CountDownLatch getLatch() {
            return this.latch;
        }

        @Override // okhttp3.internal.concurrent.Task
        public long runOnce() {
            this.latch.countDown();
            return -1L;
        }
    }

    public final boolean scheduleAndDecide$okhttp(okhttp3.internal.concurrent.Task task, long delayNanos, boolean recurrence) {
        java.lang.String str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(task, "task");
        task.initQueue$okhttp(this);
        long jNanoTime = this.taskRunner.getBackend().nanoTime();
        long j = jNanoTime + delayNanos;
        int iIndexOf = this.futureTasks.indexOf(task);
        if (iIndexOf != -1) {
            if (task.getNextExecuteNanoTime() > j) {
                this.futureTasks.remove(iIndexOf);
            } else {
                if (okhttp3.internal.concurrent.TaskRunner.INSTANCE.getLogger().isLoggable(java.util.logging.Level.FINE)) {
                    okhttp3.internal.concurrent.TaskLoggerKt.log(task, this, "already scheduled");
                }
                return false;
            }
        }
        task.setNextExecuteNanoTime$okhttp(j);
        if (okhttp3.internal.concurrent.TaskRunner.INSTANCE.getLogger().isLoggable(java.util.logging.Level.FINE)) {
            if (recurrence) {
                str = "run again after " + okhttp3.internal.concurrent.TaskLoggerKt.formatDuration(j - jNanoTime);
            } else {
                str = "scheduled after " + okhttp3.internal.concurrent.TaskLoggerKt.formatDuration(j - jNanoTime);
            }
            okhttp3.internal.concurrent.TaskLoggerKt.log(task, this, str);
        }
        java.util.Iterator<okhttp3.internal.concurrent.Task> it = this.futureTasks.iterator();
        int size = 0;
        while (true) {
            if (!it.hasNext()) {
                size = -1;
                break;
            }
            if (it.next().getNextExecuteNanoTime() - jNanoTime > delayNanos) {
                break;
            }
            size++;
        }
        if (size == -1) {
            size = this.futureTasks.size();
        }
        this.futureTasks.add(size, task);
        return size == 0;
    }

    public final boolean cancelAllAndDecide$okhttp() {
        okhttp3.internal.concurrent.Task task = this.activeTask;
        if (task != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(task);
            if (task.getCancelable()) {
                this.cancelActiveTask = true;
            }
        }
        boolean z = false;
        for (int size = this.futureTasks.size() - 1; -1 < size; size--) {
            if (this.futureTasks.get(size).getCancelable()) {
                okhttp3.internal.concurrent.Task task2 = this.futureTasks.get(size);
                if (okhttp3.internal.concurrent.TaskRunner.INSTANCE.getLogger().isLoggable(java.util.logging.Level.FINE)) {
                    okhttp3.internal.concurrent.TaskLoggerKt.log(task2, this, "canceled");
                }
                this.futureTasks.remove(size);
                z = true;
            }
        }
        return z;
    }

    public java.lang.String toString() {
        return this.name;
    }

    public final void cancelAll() {
        if (!okhttp3.internal.Util.assertionsEnabled || !java.lang.Thread.holdsLock(this)) {
            synchronized (this.taskRunner) {
                if (cancelAllAndDecide$okhttp()) {
                    this.taskRunner.kickCoordinator$okhttp(this);
                }
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            }
            return;
        }
        throw new java.lang.AssertionError("Thread " + java.lang.Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
    }

    public final void shutdown() {
        if (!okhttp3.internal.Util.assertionsEnabled || !java.lang.Thread.holdsLock(this)) {
            synchronized (this.taskRunner) {
                this.shutdown = true;
                if (cancelAllAndDecide$okhttp()) {
                    this.taskRunner.kickCoordinator$okhttp(this);
                }
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            }
            return;
        }
        throw new java.lang.AssertionError("Thread " + java.lang.Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
    }
}
