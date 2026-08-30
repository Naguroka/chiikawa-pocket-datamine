package androidx.media3.exoplayer.upstream;

/* JADX INFO: loaded from: classes.dex */
public final class Loader implements androidx.media3.exoplayer.upstream.LoaderErrorThrower {
    private static final int ACTION_TYPE_DONT_RETRY = 2;
    private static final int ACTION_TYPE_DONT_RETRY_FATAL = 3;
    private static final int ACTION_TYPE_RETRY = 0;
    private static final int ACTION_TYPE_RETRY_AND_RESET_ERROR_COUNT = 1;
    public static final androidx.media3.exoplayer.upstream.Loader.LoadErrorAction DONT_RETRY;
    public static final androidx.media3.exoplayer.upstream.Loader.LoadErrorAction DONT_RETRY_FATAL;
    public static final androidx.media3.exoplayer.upstream.Loader.LoadErrorAction RETRY;
    public static final androidx.media3.exoplayer.upstream.Loader.LoadErrorAction RETRY_RESET_ERROR_COUNT;
    private static final java.lang.String THREAD_NAME_PREFIX = "ExoPlayer:Loader:";
    private androidx.media3.exoplayer.upstream.Loader.LoadTask<? extends androidx.media3.exoplayer.upstream.Loader.Loadable> currentTask;
    private final java.util.concurrent.ExecutorService downloadExecutorService;
    private java.io.IOException fatalError;

    public interface Callback<T extends androidx.media3.exoplayer.upstream.Loader.Loadable> {
        void onLoadCanceled(T t, long j, long j2, boolean z);

        void onLoadCompleted(T t, long j, long j2);

        androidx.media3.exoplayer.upstream.Loader.LoadErrorAction onLoadError(T t, long j, long j2, java.io.IOException iOException, int i);
    }

    public interface Loadable {
        void cancelLoad();

        void load() throws java.io.IOException;
    }

    public interface ReleaseCallback {
        void onLoaderReleased();
    }

    public static final class UnexpectedLoaderException extends java.io.IOException {
        public UnexpectedLoaderException(java.lang.Throwable th) {
            super("Unexpected " + th.getClass().getSimpleName() + (th.getMessage() != null ? ": " + th.getMessage() : ""), th);
        }
    }

    static {
        long j = androidx.media3.common.C.TIME_UNSET;
        RETRY = createRetryAction(false, androidx.media3.common.C.TIME_UNSET);
        RETRY_RESET_ERROR_COUNT = createRetryAction(true, androidx.media3.common.C.TIME_UNSET);
        DONT_RETRY = new androidx.media3.exoplayer.upstream.Loader.LoadErrorAction(2, j);
        DONT_RETRY_FATAL = new androidx.media3.exoplayer.upstream.Loader.LoadErrorAction(3, j);
    }

    public static final class LoadErrorAction {
        private final long retryDelayMillis;
        private final int type;

        private LoadErrorAction(int i, long j) {
            this.type = i;
            this.retryDelayMillis = j;
        }

        public boolean isRetry() {
            int i = this.type;
            return i == 0 || i == 1;
        }
    }

    public Loader(java.lang.String str) {
        this.downloadExecutorService = androidx.media3.common.util.Util.newSingleThreadExecutor(THREAD_NAME_PREFIX + str);
    }

    public static androidx.media3.exoplayer.upstream.Loader.LoadErrorAction createRetryAction(boolean z, long j) {
        return new androidx.media3.exoplayer.upstream.Loader.LoadErrorAction(z ? 1 : 0, j);
    }

    public boolean hasFatalError() {
        return this.fatalError != null;
    }

    public void clearFatalError() {
        this.fatalError = null;
    }

    public <T extends androidx.media3.exoplayer.upstream.Loader.Loadable> long startLoading(T t, androidx.media3.exoplayer.upstream.Loader.Callback<T> callback, int i) {
        android.os.Looper looper = (android.os.Looper) androidx.media3.common.util.Assertions.checkStateNotNull(android.os.Looper.myLooper());
        this.fatalError = null;
        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
        new androidx.media3.exoplayer.upstream.Loader.LoadTask(looper, t, callback, i, jElapsedRealtime).start(0L);
        return jElapsedRealtime;
    }

    public boolean isLoading() {
        return this.currentTask != null;
    }

    public void cancelLoading() {
        ((androidx.media3.exoplayer.upstream.Loader.LoadTask) androidx.media3.common.util.Assertions.checkStateNotNull(this.currentTask)).cancel(false);
    }

    public void release() {
        release(null);
    }

    public void release(androidx.media3.exoplayer.upstream.Loader.ReleaseCallback releaseCallback) {
        androidx.media3.exoplayer.upstream.Loader.LoadTask<? extends androidx.media3.exoplayer.upstream.Loader.Loadable> loadTask = this.currentTask;
        if (loadTask != null) {
            loadTask.cancel(true);
        }
        if (releaseCallback != null) {
            this.downloadExecutorService.execute(new androidx.media3.exoplayer.upstream.Loader.ReleaseTask(releaseCallback));
        }
        this.downloadExecutorService.shutdown();
    }

    @Override // androidx.media3.exoplayer.upstream.LoaderErrorThrower
    public void maybeThrowError() throws java.io.IOException {
        maybeThrowError(Integer.MIN_VALUE);
    }

    @Override // androidx.media3.exoplayer.upstream.LoaderErrorThrower
    public void maybeThrowError(int i) throws java.io.IOException {
        java.io.IOException iOException = this.fatalError;
        if (iOException != null) {
            throw iOException;
        }
        androidx.media3.exoplayer.upstream.Loader.LoadTask<? extends androidx.media3.exoplayer.upstream.Loader.Loadable> loadTask = this.currentTask;
        if (loadTask != null) {
            if (i == Integer.MIN_VALUE) {
                i = loadTask.defaultMinRetryCount;
            }
            loadTask.maybeThrowError(i);
        }
    }

    private final class LoadTask<T extends androidx.media3.exoplayer.upstream.Loader.Loadable> extends android.os.Handler implements java.lang.Runnable {
        private static final int MSG_FATAL_ERROR = 4;
        private static final int MSG_FINISH = 2;
        private static final int MSG_IO_EXCEPTION = 3;
        private static final int MSG_START = 1;
        private static final java.lang.String TAG = "LoadTask";
        private androidx.media3.exoplayer.upstream.Loader.Callback<T> callback;
        private boolean canceled;
        private java.io.IOException currentError;
        public final int defaultMinRetryCount;
        private int errorCount;
        private java.lang.Thread executorThread;
        private final T loadable;
        private volatile boolean released;
        private final long startTimeMs;

        public LoadTask(android.os.Looper looper, T t, androidx.media3.exoplayer.upstream.Loader.Callback<T> callback, int i, long j) {
            super(looper);
            this.loadable = t;
            this.callback = callback;
            this.defaultMinRetryCount = i;
            this.startTimeMs = j;
        }

        public void maybeThrowError(int i) throws java.io.IOException {
            java.io.IOException iOException = this.currentError;
            if (iOException != null && this.errorCount > i) {
                throw iOException;
            }
        }

        public void start(long j) {
            androidx.media3.common.util.Assertions.checkState(androidx.media3.exoplayer.upstream.Loader.this.currentTask == null);
            androidx.media3.exoplayer.upstream.Loader.this.currentTask = this;
            if (j > 0) {
                sendEmptyMessageDelayed(1, j);
            } else {
                execute();
            }
        }

        public void cancel(boolean z) {
            this.released = z;
            this.currentError = null;
            if (hasMessages(1)) {
                this.canceled = true;
                removeMessages(1);
                if (!z) {
                    sendEmptyMessage(2);
                }
            } else {
                synchronized (this) {
                    this.canceled = true;
                    this.loadable.cancelLoad();
                    java.lang.Thread thread = this.executorThread;
                    if (thread != null) {
                        thread.interrupt();
                    }
                }
            }
            if (z) {
                finish();
                long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
                ((androidx.media3.exoplayer.upstream.Loader.Callback) androidx.media3.common.util.Assertions.checkNotNull(this.callback)).onLoadCanceled(this.loadable, jElapsedRealtime, jElapsedRealtime - this.startTimeMs, true);
                this.callback = null;
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z;
            try {
                synchronized (this) {
                    z = !this.canceled;
                    this.executorThread = java.lang.Thread.currentThread();
                }
                if (z) {
                    androidx.media3.common.util.TraceUtil.beginSection("load:" + this.loadable.getClass().getSimpleName());
                    try {
                        this.loadable.load();
                        androidx.media3.common.util.TraceUtil.endSection();
                    } catch (java.lang.Throwable th) {
                        androidx.media3.common.util.TraceUtil.endSection();
                        throw th;
                    }
                }
                synchronized (this) {
                    this.executorThread = null;
                    java.lang.Thread.interrupted();
                }
                if (this.released) {
                    return;
                }
                sendEmptyMessage(2);
            } catch (java.io.IOException e) {
                if (this.released) {
                    return;
                }
                obtainMessage(3, e).sendToTarget();
            } catch (java.lang.Error e2) {
                if (!this.released) {
                    androidx.media3.common.util.Log.e(TAG, "Unexpected error loading stream", e2);
                    obtainMessage(4, e2).sendToTarget();
                }
                throw e2;
            } catch (java.lang.Exception e3) {
                if (this.released) {
                    return;
                }
                androidx.media3.common.util.Log.e(TAG, "Unexpected exception loading stream", e3);
                obtainMessage(3, new androidx.media3.exoplayer.upstream.Loader.UnexpectedLoaderException(e3)).sendToTarget();
            } catch (java.lang.OutOfMemoryError e4) {
                if (this.released) {
                    return;
                }
                androidx.media3.common.util.Log.e(TAG, "OutOfMemory error loading stream", e4);
                obtainMessage(3, new androidx.media3.exoplayer.upstream.Loader.UnexpectedLoaderException(e4)).sendToTarget();
            }
        }

        @Override // android.os.Handler
        public void handleMessage(android.os.Message message) {
            long retryDelayMillis;
            if (this.released) {
                return;
            }
            if (message.what == 1) {
                execute();
                return;
            }
            if (message.what == 4) {
                throw ((java.lang.Error) message.obj);
            }
            finish();
            long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
            long j = jElapsedRealtime - this.startTimeMs;
            androidx.media3.exoplayer.upstream.Loader.Callback callback = (androidx.media3.exoplayer.upstream.Loader.Callback) androidx.media3.common.util.Assertions.checkNotNull(this.callback);
            if (this.canceled) {
                callback.onLoadCanceled(this.loadable, jElapsedRealtime, j, false);
                return;
            }
            int i = message.what;
            if (i == 2) {
                try {
                    callback.onLoadCompleted(this.loadable, jElapsedRealtime, j);
                    return;
                } catch (java.lang.RuntimeException e) {
                    androidx.media3.common.util.Log.e(TAG, "Unexpected exception handling load completed", e);
                    androidx.media3.exoplayer.upstream.Loader.this.fatalError = new androidx.media3.exoplayer.upstream.Loader.UnexpectedLoaderException(e);
                    return;
                }
            }
            if (i != 3) {
                return;
            }
            java.io.IOException iOException = (java.io.IOException) message.obj;
            this.currentError = iOException;
            int i2 = this.errorCount + 1;
            this.errorCount = i2;
            androidx.media3.exoplayer.upstream.Loader.LoadErrorAction loadErrorActionOnLoadError = callback.onLoadError(this.loadable, jElapsedRealtime, j, iOException, i2);
            if (loadErrorActionOnLoadError.type != 3) {
                if (loadErrorActionOnLoadError.type != 2) {
                    if (loadErrorActionOnLoadError.type == 1) {
                        this.errorCount = 1;
                    }
                    if (loadErrorActionOnLoadError.retryDelayMillis != androidx.media3.common.C.TIME_UNSET) {
                        retryDelayMillis = loadErrorActionOnLoadError.retryDelayMillis;
                    } else {
                        retryDelayMillis = getRetryDelayMillis();
                    }
                    start(retryDelayMillis);
                    return;
                }
                return;
            }
            androidx.media3.exoplayer.upstream.Loader.this.fatalError = this.currentError;
        }

        private void execute() {
            this.currentError = null;
            androidx.media3.exoplayer.upstream.Loader.this.downloadExecutorService.execute((java.lang.Runnable) androidx.media3.common.util.Assertions.checkNotNull(androidx.media3.exoplayer.upstream.Loader.this.currentTask));
        }

        private void finish() {
            androidx.media3.exoplayer.upstream.Loader.this.currentTask = null;
        }

        private long getRetryDelayMillis() {
            return java.lang.Math.min((this.errorCount - 1) * 1000, 5000);
        }
    }

    private static final class ReleaseTask implements java.lang.Runnable {
        private final androidx.media3.exoplayer.upstream.Loader.ReleaseCallback callback;

        public ReleaseTask(androidx.media3.exoplayer.upstream.Loader.ReleaseCallback releaseCallback) {
            this.callback = releaseCallback;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.callback.onLoaderReleased();
        }
    }
}
