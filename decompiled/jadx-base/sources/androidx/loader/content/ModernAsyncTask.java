package androidx.loader.content;

/* JADX INFO: loaded from: classes.dex */
abstract class ModernAsyncTask<Params, Progress, Result> {
    private static final int CORE_POOL_SIZE = 5;
    private static final int KEEP_ALIVE = 1;
    private static final java.lang.String LOG_TAG = "AsyncTask";
    private static final int MAXIMUM_POOL_SIZE = 128;
    private static final int MESSAGE_POST_PROGRESS = 2;
    private static final int MESSAGE_POST_RESULT = 1;
    public static final java.util.concurrent.Executor THREAD_POOL_EXECUTOR;
    private static volatile java.util.concurrent.Executor sDefaultExecutor;
    private static androidx.loader.content.ModernAsyncTask.InternalHandler sHandler;
    private static final java.util.concurrent.BlockingQueue<java.lang.Runnable> sPoolWorkQueue;
    private static final java.util.concurrent.ThreadFactory sThreadFactory;
    private final java.util.concurrent.FutureTask<Result> mFuture;
    private final androidx.loader.content.ModernAsyncTask.WorkerRunnable<Params, Result> mWorker;
    private volatile androidx.loader.content.ModernAsyncTask.Status mStatus = androidx.loader.content.ModernAsyncTask.Status.PENDING;
    final java.util.concurrent.atomic.AtomicBoolean mCancelled = new java.util.concurrent.atomic.AtomicBoolean();
    final java.util.concurrent.atomic.AtomicBoolean mTaskInvoked = new java.util.concurrent.atomic.AtomicBoolean();

    public enum Status {
        PENDING,
        RUNNING,
        FINISHED
    }

    protected abstract Result doInBackground(Params... paramsArr);

    protected void onCancelled() {
    }

    protected void onPostExecute(Result result) {
    }

    protected void onPreExecute() {
    }

    protected void onProgressUpdate(Progress... progressArr) {
    }

    static {
        java.util.concurrent.ThreadFactory threadFactory = new java.util.concurrent.ThreadFactory() { // from class: androidx.loader.content.ModernAsyncTask.1
            private final java.util.concurrent.atomic.AtomicInteger mCount = new java.util.concurrent.atomic.AtomicInteger(1);

            @Override // java.util.concurrent.ThreadFactory
            public java.lang.Thread newThread(java.lang.Runnable runnable) {
                return new java.lang.Thread(runnable, "ModernAsyncTask #" + this.mCount.getAndIncrement());
            }
        };
        sThreadFactory = threadFactory;
        java.util.concurrent.LinkedBlockingQueue linkedBlockingQueue = new java.util.concurrent.LinkedBlockingQueue(10);
        sPoolWorkQueue = linkedBlockingQueue;
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor = new java.util.concurrent.ThreadPoolExecutor(5, 128, 1L, java.util.concurrent.TimeUnit.SECONDS, linkedBlockingQueue, threadFactory);
        THREAD_POOL_EXECUTOR = threadPoolExecutor;
        sDefaultExecutor = threadPoolExecutor;
    }

    private static android.os.Handler getHandler() {
        androidx.loader.content.ModernAsyncTask.InternalHandler internalHandler;
        synchronized (androidx.loader.content.ModernAsyncTask.class) {
            if (sHandler == null) {
                sHandler = new androidx.loader.content.ModernAsyncTask.InternalHandler();
            }
            internalHandler = sHandler;
        }
        return internalHandler;
    }

    public static void setDefaultExecutor(java.util.concurrent.Executor executor) {
        sDefaultExecutor = executor;
    }

    ModernAsyncTask() {
        androidx.loader.content.ModernAsyncTask.WorkerRunnable<Params, Result> workerRunnable = new androidx.loader.content.ModernAsyncTask.WorkerRunnable<Params, Result>() { // from class: androidx.loader.content.ModernAsyncTask.2
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // java.util.concurrent.Callable
            public Result call() throws java.lang.Exception {
                androidx.loader.content.ModernAsyncTask.this.mTaskInvoked.set(true);
                Result result = null;
                try {
                    android.os.Process.setThreadPriority(10);
                    result = (Result) androidx.loader.content.ModernAsyncTask.this.doInBackground(this.mParams);
                    android.os.Binder.flushPendingCommands();
                    androidx.loader.content.ModernAsyncTask.this.postResult(result);
                    return result;
                } catch (java.lang.Throwable th) {
                    try {
                        androidx.loader.content.ModernAsyncTask.this.mCancelled.set(true);
                        throw th;
                    } catch (java.lang.Throwable th2) {
                        androidx.loader.content.ModernAsyncTask.this.postResult(result);
                        throw th2;
                    }
                }
            }
        };
        this.mWorker = workerRunnable;
        this.mFuture = new java.util.concurrent.FutureTask<Result>(workerRunnable) { // from class: androidx.loader.content.ModernAsyncTask.3
            @Override // java.util.concurrent.FutureTask
            protected void done() {
                try {
                    androidx.loader.content.ModernAsyncTask.this.postResultIfNotInvoked(get());
                } catch (java.lang.InterruptedException e) {
                    android.util.Log.w(androidx.loader.content.ModernAsyncTask.LOG_TAG, e);
                } catch (java.util.concurrent.CancellationException unused) {
                    androidx.loader.content.ModernAsyncTask.this.postResultIfNotInvoked(null);
                } catch (java.util.concurrent.ExecutionException e2) {
                    throw new java.lang.RuntimeException("An error occurred while executing doInBackground()", e2.getCause());
                } catch (java.lang.Throwable th) {
                    throw new java.lang.RuntimeException("An error occurred while executing doInBackground()", th);
                }
            }
        };
    }

    void postResultIfNotInvoked(Result result) {
        if (this.mTaskInvoked.get()) {
            return;
        }
        postResult(result);
    }

    Result postResult(Result result) {
        getHandler().obtainMessage(1, new androidx.loader.content.ModernAsyncTask.AsyncTaskResult(this, result)).sendToTarget();
        return result;
    }

    public final androidx.loader.content.ModernAsyncTask.Status getStatus() {
        return this.mStatus;
    }

    protected void onCancelled(Result result) {
        onCancelled();
    }

    public final boolean isCancelled() {
        return this.mCancelled.get();
    }

    public final boolean cancel(boolean z) {
        this.mCancelled.set(true);
        return this.mFuture.cancel(z);
    }

    public final Result get() throws java.util.concurrent.ExecutionException, java.lang.InterruptedException {
        return this.mFuture.get();
    }

    public final Result get(long j, java.util.concurrent.TimeUnit timeUnit) throws java.util.concurrent.ExecutionException, java.lang.InterruptedException, java.util.concurrent.TimeoutException {
        return this.mFuture.get(j, timeUnit);
    }

    public final androidx.loader.content.ModernAsyncTask<Params, Progress, Result> execute(Params... paramsArr) {
        return executeOnExecutor(sDefaultExecutor, paramsArr);
    }

    /* JADX INFO: renamed from: androidx.loader.content.ModernAsyncTask$4, reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] $SwitchMap$androidx$loader$content$ModernAsyncTask$Status;

        static {
            int[] iArr = new int[androidx.loader.content.ModernAsyncTask.Status.values().length];
            $SwitchMap$androidx$loader$content$ModernAsyncTask$Status = iArr;
            try {
                iArr[androidx.loader.content.ModernAsyncTask.Status.RUNNING.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$androidx$loader$content$ModernAsyncTask$Status[androidx.loader.content.ModernAsyncTask.Status.FINISHED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
        }
    }

    public final androidx.loader.content.ModernAsyncTask<Params, Progress, Result> executeOnExecutor(java.util.concurrent.Executor executor, Params... paramsArr) {
        if (this.mStatus != androidx.loader.content.ModernAsyncTask.Status.PENDING) {
            int i = androidx.loader.content.ModernAsyncTask.AnonymousClass4.$SwitchMap$androidx$loader$content$ModernAsyncTask$Status[this.mStatus.ordinal()];
            if (i == 1) {
                throw new java.lang.IllegalStateException("Cannot execute task: the task is already running.");
            }
            if (i == 2) {
                throw new java.lang.IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
            }
            throw new java.lang.IllegalStateException("We should never reach this state");
        }
        this.mStatus = androidx.loader.content.ModernAsyncTask.Status.RUNNING;
        onPreExecute();
        this.mWorker.mParams = paramsArr;
        executor.execute(this.mFuture);
        return this;
    }

    public static void execute(java.lang.Runnable runnable) {
        sDefaultExecutor.execute(runnable);
    }

    protected final void publishProgress(Progress... progressArr) {
        if (isCancelled()) {
            return;
        }
        getHandler().obtainMessage(2, new androidx.loader.content.ModernAsyncTask.AsyncTaskResult(this, progressArr)).sendToTarget();
    }

    void finish(Result result) {
        if (isCancelled()) {
            onCancelled(result);
        } else {
            onPostExecute(result);
        }
        this.mStatus = androidx.loader.content.ModernAsyncTask.Status.FINISHED;
    }

    private static class InternalHandler extends android.os.Handler {
        InternalHandler() {
            super(android.os.Looper.getMainLooper());
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // android.os.Handler
        public void handleMessage(android.os.Message message) {
            androidx.loader.content.ModernAsyncTask.AsyncTaskResult asyncTaskResult = (androidx.loader.content.ModernAsyncTask.AsyncTaskResult) message.obj;
            int i = message.what;
            if (i == 1) {
                asyncTaskResult.mTask.finish(asyncTaskResult.mData[0]);
            } else {
                if (i != 2) {
                    return;
                }
                asyncTaskResult.mTask.onProgressUpdate(asyncTaskResult.mData);
            }
        }
    }

    private static abstract class WorkerRunnable<Params, Result> implements java.util.concurrent.Callable<Result> {
        Params[] mParams;

        WorkerRunnable() {
        }
    }

    private static class AsyncTaskResult<Data> {
        final Data[] mData;
        final androidx.loader.content.ModernAsyncTask mTask;

        AsyncTaskResult(androidx.loader.content.ModernAsyncTask modernAsyncTask, Data... dataArr) {
            this.mTask = modernAsyncTask;
            this.mData = dataArr;
        }
    }
}
