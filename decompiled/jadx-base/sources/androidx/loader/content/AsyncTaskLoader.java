package androidx.loader.content;

/* JADX INFO: loaded from: classes.dex */
public abstract class AsyncTaskLoader<D> extends androidx.loader.content.Loader<D> {
    static final boolean DEBUG = false;
    static final java.lang.String TAG = "AsyncTaskLoader";
    volatile androidx.loader.content.AsyncTaskLoader<D>.LoadTask mCancellingTask;
    private final java.util.concurrent.Executor mExecutor;
    android.os.Handler mHandler;
    long mLastLoadCompleteTime;
    volatile androidx.loader.content.AsyncTaskLoader<D>.LoadTask mTask;
    long mUpdateThrottle;

    public void cancelLoadInBackground() {
    }

    public abstract D loadInBackground();

    public void onCanceled(D d) {
    }

    final class LoadTask extends androidx.loader.content.ModernAsyncTask<java.lang.Void, java.lang.Void, D> implements java.lang.Runnable {
        private final java.util.concurrent.CountDownLatch mDone = new java.util.concurrent.CountDownLatch(1);
        boolean waiting;

        LoadTask() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.loader.content.ModernAsyncTask
        public D doInBackground(java.lang.Void... voidArr) {
            try {
                return (D) androidx.loader.content.AsyncTaskLoader.this.onLoadInBackground();
            } catch (androidx.core.os.OperationCanceledException e) {
                if (isCancelled()) {
                    return null;
                }
                throw e;
            }
        }

        @Override // androidx.loader.content.ModernAsyncTask
        protected void onPostExecute(D d) {
            try {
                androidx.loader.content.AsyncTaskLoader.this.dispatchOnLoadComplete(this, d);
            } finally {
                this.mDone.countDown();
            }
        }

        @Override // androidx.loader.content.ModernAsyncTask
        protected void onCancelled(D d) {
            try {
                androidx.loader.content.AsyncTaskLoader.this.dispatchOnCancelled(this, d);
            } finally {
                this.mDone.countDown();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            this.waiting = false;
            androidx.loader.content.AsyncTaskLoader.this.executePendingTask();
        }

        public void waitForLoader() {
            try {
                this.mDone.await();
            } catch (java.lang.InterruptedException unused) {
            }
        }
    }

    public AsyncTaskLoader(android.content.Context context) {
        this(context, androidx.loader.content.ModernAsyncTask.THREAD_POOL_EXECUTOR);
    }

    private AsyncTaskLoader(android.content.Context context, java.util.concurrent.Executor executor) {
        super(context);
        this.mLastLoadCompleteTime = -10000L;
        this.mExecutor = executor;
    }

    public void setUpdateThrottle(long j) {
        this.mUpdateThrottle = j;
        if (j != 0) {
            this.mHandler = new android.os.Handler();
        }
    }

    @Override // androidx.loader.content.Loader
    protected void onForceLoad() {
        super.onForceLoad();
        cancelLoad();
        this.mTask = new androidx.loader.content.AsyncTaskLoader.LoadTask();
        executePendingTask();
    }

    @Override // androidx.loader.content.Loader
    protected boolean onCancelLoad() {
        if (this.mTask == null) {
            return false;
        }
        if (!this.mStarted) {
            this.mContentChanged = true;
        }
        if (this.mCancellingTask != null) {
            if (this.mTask.waiting) {
                this.mTask.waiting = false;
                this.mHandler.removeCallbacks(this.mTask);
            }
            this.mTask = null;
            return false;
        }
        if (this.mTask.waiting) {
            this.mTask.waiting = false;
            this.mHandler.removeCallbacks(this.mTask);
            this.mTask = null;
            return false;
        }
        boolean zCancel = this.mTask.cancel(false);
        if (zCancel) {
            this.mCancellingTask = this.mTask;
            cancelLoadInBackground();
        }
        this.mTask = null;
        return zCancel;
    }

    void executePendingTask() {
        if (this.mCancellingTask != null || this.mTask == null) {
            return;
        }
        if (this.mTask.waiting) {
            this.mTask.waiting = false;
            this.mHandler.removeCallbacks(this.mTask);
        }
        if (this.mUpdateThrottle > 0 && android.os.SystemClock.uptimeMillis() < this.mLastLoadCompleteTime + this.mUpdateThrottle) {
            this.mTask.waiting = true;
            this.mHandler.postAtTime(this.mTask, this.mLastLoadCompleteTime + this.mUpdateThrottle);
        } else {
            this.mTask.executeOnExecutor(this.mExecutor, null);
        }
    }

    void dispatchOnCancelled(androidx.loader.content.AsyncTaskLoader<D>.LoadTask loadTask, D d) {
        onCanceled(d);
        if (this.mCancellingTask == loadTask) {
            rollbackContentChanged();
            this.mLastLoadCompleteTime = android.os.SystemClock.uptimeMillis();
            this.mCancellingTask = null;
            deliverCancellation();
            executePendingTask();
        }
    }

    void dispatchOnLoadComplete(androidx.loader.content.AsyncTaskLoader<D>.LoadTask loadTask, D d) {
        if (this.mTask != loadTask) {
            dispatchOnCancelled(loadTask, d);
            return;
        }
        if (isAbandoned()) {
            onCanceled(d);
            return;
        }
        commitContentChanged();
        this.mLastLoadCompleteTime = android.os.SystemClock.uptimeMillis();
        this.mTask = null;
        deliverResult(d);
    }

    protected D onLoadInBackground() {
        return loadInBackground();
    }

    public boolean isLoadInBackgroundCanceled() {
        return this.mCancellingTask != null;
    }

    public void waitForLoader() {
        androidx.loader.content.AsyncTaskLoader<D>.LoadTask loadTask = this.mTask;
        if (loadTask != null) {
            loadTask.waitForLoader();
        }
    }

    @Override // androidx.loader.content.Loader
    @java.lang.Deprecated
    public void dump(java.lang.String str, java.io.FileDescriptor fileDescriptor, java.io.PrintWriter printWriter, java.lang.String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (this.mTask != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.mTask);
            printWriter.print(" waiting=");
            printWriter.println(this.mTask.waiting);
        }
        if (this.mCancellingTask != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.mCancellingTask);
            printWriter.print(" waiting=");
            printWriter.println(this.mCancellingTask.waiting);
        }
        if (this.mUpdateThrottle != 0) {
            printWriter.print(str);
            printWriter.print("mUpdateThrottle=");
            androidx.core.util.TimeUtils.formatDuration(this.mUpdateThrottle, printWriter);
            printWriter.print(" mLastLoadCompleteTime=");
            androidx.core.util.TimeUtils.formatDuration(this.mLastLoadCompleteTime, android.os.SystemClock.uptimeMillis(), printWriter);
            printWriter.println();
        }
    }
}
