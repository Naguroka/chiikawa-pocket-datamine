package androidx.core.provider;

/* JADX INFO: loaded from: classes.dex */
@java.lang.Deprecated
public class SelfDestructiveThread {
    private static final int MSG_DESTRUCTION = 0;
    private static final int MSG_INVOKE_RUNNABLE = 1;
    private final int mDestructAfterMillisec;
    private android.os.Handler mHandler;
    private final int mPriority;
    private android.os.HandlerThread mThread;
    private final java.lang.String mThreadName;
    private final java.lang.Object mLock = new java.lang.Object();
    private android.os.Handler.Callback mCallback = new android.os.Handler.Callback() { // from class: androidx.core.provider.SelfDestructiveThread.1
        @Override // android.os.Handler.Callback
        public boolean handleMessage(android.os.Message message) {
            int i = message.what;
            if (i == 0) {
                androidx.core.provider.SelfDestructiveThread.this.onDestruction();
                return true;
            }
            if (i != 1) {
                return true;
            }
            androidx.core.provider.SelfDestructiveThread.this.onInvokeRunnable((java.lang.Runnable) message.obj);
            return true;
        }
    };
    private int mGeneration = 0;

    public interface ReplyCallback<T> {
        void onReply(T t);
    }

    public SelfDestructiveThread(java.lang.String str, int i, int i2) {
        this.mThreadName = str;
        this.mPriority = i;
        this.mDestructAfterMillisec = i2;
    }

    public boolean isRunning() {
        boolean z;
        synchronized (this.mLock) {
            z = this.mThread != null;
        }
        return z;
    }

    public int getGeneration() {
        int i;
        synchronized (this.mLock) {
            i = this.mGeneration;
        }
        return i;
    }

    private void post(java.lang.Runnable runnable) {
        synchronized (this.mLock) {
            if (this.mThread == null) {
                android.os.HandlerThread handlerThread = new android.os.HandlerThread(this.mThreadName, this.mPriority);
                this.mThread = handlerThread;
                handlerThread.start();
                this.mHandler = new android.os.Handler(this.mThread.getLooper(), this.mCallback);
                this.mGeneration++;
            }
            this.mHandler.removeMessages(0);
            android.os.Handler handler = this.mHandler;
            handler.sendMessage(handler.obtainMessage(1, runnable));
        }
    }

    public <T> void postAndReply(final java.util.concurrent.Callable<T> callable, final androidx.core.provider.SelfDestructiveThread.ReplyCallback<T> replyCallback) {
        final android.os.Handler handlerCreate = androidx.core.provider.CalleeHandler.create();
        post(new java.lang.Runnable() { // from class: androidx.core.provider.SelfDestructiveThread.2
            @Override // java.lang.Runnable
            public void run() {
                final java.lang.Object objCall;
                try {
                    objCall = callable.call();
                } catch (java.lang.Exception unused) {
                    objCall = null;
                }
                handlerCreate.post(new java.lang.Runnable() { // from class: androidx.core.provider.SelfDestructiveThread.2.1
                    @Override // java.lang.Runnable
                    public void run() {
                        replyCallback.onReply(objCall);
                    }
                });
            }
        });
    }

    public <T> T postAndWait(final java.util.concurrent.Callable<T> callable, int i) throws java.lang.InterruptedException {
        final java.util.concurrent.locks.ReentrantLock reentrantLock = new java.util.concurrent.locks.ReentrantLock();
        final java.util.concurrent.locks.Condition conditionNewCondition = reentrantLock.newCondition();
        final java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference();
        final java.util.concurrent.atomic.AtomicBoolean atomicBoolean = new java.util.concurrent.atomic.AtomicBoolean(true);
        post(new java.lang.Runnable() { // from class: androidx.core.provider.SelfDestructiveThread.3
            @Override // java.lang.Runnable
            public void run() {
                try {
                    atomicReference.set(callable.call());
                } catch (java.lang.Exception unused) {
                }
                reentrantLock.lock();
                try {
                    atomicBoolean.set(false);
                    conditionNewCondition.signal();
                } finally {
                    reentrantLock.unlock();
                }
            }
        });
        reentrantLock.lock();
        try {
            if (!atomicBoolean.get()) {
                T t = (T) atomicReference.get();
                reentrantLock.unlock();
                return t;
            }
            long nanos = java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(i);
            do {
                try {
                    nanos = conditionNewCondition.awaitNanos(nanos);
                } catch (java.lang.InterruptedException unused) {
                }
                if (!atomicBoolean.get()) {
                    T t2 = (T) atomicReference.get();
                    reentrantLock.unlock();
                    return t2;
                }
            } while (nanos > 0);
            throw new java.lang.InterruptedException("timeout");
        } catch (java.lang.Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    void onInvokeRunnable(java.lang.Runnable runnable) {
        runnable.run();
        synchronized (this.mLock) {
            this.mHandler.removeMessages(0);
            android.os.Handler handler = this.mHandler;
            handler.sendMessageDelayed(handler.obtainMessage(0), this.mDestructAfterMillisec);
        }
    }

    void onDestruction() {
        synchronized (this.mLock) {
            if (this.mHandler.hasMessages(1)) {
                return;
            }
            this.mThread.quit();
            this.mThread = null;
            this.mHandler = null;
        }
    }
}
