package androidx.browser.trusted;

/* JADX INFO: loaded from: classes.dex */
class ConnectionHolder implements android.content.ServiceConnection {
    private static final int STATE_AWAITING_CONNECTION = 0;
    private static final int STATE_CANCELLED = 3;
    private static final int STATE_CONNECTED = 1;
    private static final int STATE_DISCONNECTED = 2;
    private java.lang.Exception mCancellationException;
    private final java.lang.Runnable mCloseRunnable;
    private java.util.List<androidx.concurrent.futures.CallbackToFutureAdapter.Completer<androidx.browser.trusted.TrustedWebActivityServiceConnection>> mCompleters;
    private androidx.browser.trusted.TrustedWebActivityServiceConnection mService;
    private int mState;
    private final androidx.browser.trusted.ConnectionHolder.WrapperFactory mWrapperFactory;

    static class WrapperFactory {
        WrapperFactory() {
        }

        androidx.browser.trusted.TrustedWebActivityServiceConnection create(android.content.ComponentName componentName, android.os.IBinder iBinder) {
            return new androidx.browser.trusted.TrustedWebActivityServiceConnection(android.support.customtabs.trusted.ITrustedWebActivityService.Stub.asInterface(iBinder), componentName);
        }
    }

    ConnectionHolder(java.lang.Runnable runnable) {
        this(runnable, new androidx.browser.trusted.ConnectionHolder.WrapperFactory());
    }

    ConnectionHolder(java.lang.Runnable runnable, androidx.browser.trusted.ConnectionHolder.WrapperFactory wrapperFactory) {
        this.mState = 0;
        this.mCompleters = new java.util.ArrayList();
        this.mCloseRunnable = runnable;
        this.mWrapperFactory = wrapperFactory;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        this.mService = this.mWrapperFactory.create(componentName, iBinder);
        java.util.Iterator<androidx.concurrent.futures.CallbackToFutureAdapter.Completer<androidx.browser.trusted.TrustedWebActivityServiceConnection>> it = this.mCompleters.iterator();
        while (it.hasNext()) {
            it.next().set(this.mService);
        }
        this.mCompleters.clear();
        this.mState = 1;
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(android.content.ComponentName componentName) {
        this.mService = null;
        this.mCloseRunnable.run();
        this.mState = 2;
    }

    public void cancel(java.lang.Exception exc) {
        java.util.Iterator<androidx.concurrent.futures.CallbackToFutureAdapter.Completer<androidx.browser.trusted.TrustedWebActivityServiceConnection>> it = this.mCompleters.iterator();
        while (it.hasNext()) {
            it.next().setException(exc);
        }
        this.mCompleters.clear();
        this.mCloseRunnable.run();
        this.mState = 3;
        this.mCancellationException = exc;
    }

    public com.google.common.util.concurrent.ListenableFuture<androidx.browser.trusted.TrustedWebActivityServiceConnection> getServiceWrapper() {
        return androidx.concurrent.futures.CallbackToFutureAdapter.getFuture(new androidx.concurrent.futures.CallbackToFutureAdapter.Resolver() { // from class: androidx.browser.trusted.ConnectionHolder$$ExternalSyntheticLambda0
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final java.lang.Object attachCompleter(androidx.concurrent.futures.CallbackToFutureAdapter.Completer completer) {
                return this.f$0.m9xa48efda8(completer);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$getServiceWrapper$0$androidx-browser-trusted-ConnectionHolder, reason: not valid java name */
    /* synthetic */ java.lang.Object m9xa48efda8(androidx.concurrent.futures.CallbackToFutureAdapter.Completer completer) throws java.lang.Exception {
        int i = this.mState;
        if (i == 0) {
            this.mCompleters.add(completer);
        } else {
            if (i != 1) {
                if (i == 2) {
                    throw new java.lang.IllegalStateException("Service has been disconnected.");
                }
                if (i == 3) {
                    throw this.mCancellationException;
                }
                throw new java.lang.IllegalStateException("Connection state is invalid");
            }
            androidx.browser.trusted.TrustedWebActivityServiceConnection trustedWebActivityServiceConnection = this.mService;
            if (trustedWebActivityServiceConnection == null) {
                throw new java.lang.IllegalStateException("ConnectionHolder state is incorrect.");
            }
            completer.set(trustedWebActivityServiceConnection);
        }
        return "ConnectionHolder, state = " + this.mState;
    }
}
