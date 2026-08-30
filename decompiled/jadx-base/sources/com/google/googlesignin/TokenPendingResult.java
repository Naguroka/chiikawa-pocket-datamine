package com.google.googlesignin;

/* JADX INFO: loaded from: classes5.dex */
public class TokenPendingResult extends com.google.android.gms.common.api.PendingResult<com.google.googlesignin.TokenResult> {
    private static final java.lang.String TAG = "TokenPendingResult";
    private java.util.concurrent.CountDownLatch latch = new java.util.concurrent.CountDownLatch(1);
    private final long requestHandle;
    private com.google.googlesignin.TokenResult result;
    private com.google.android.gms.common.api.ResultCallback<? super com.google.googlesignin.TokenResult> resultCallback;

    public TokenPendingResult(long j) {
        this.requestHandle = j;
        com.google.googlesignin.TokenResult tokenResult = new com.google.googlesignin.TokenResult();
        this.result = tokenResult;
        tokenResult.setHandle(j);
    }

    @Override // com.google.android.gms.common.api.PendingResult
    public com.google.googlesignin.TokenResult await() {
        try {
            this.latch.await();
        } catch (java.lang.InterruptedException unused) {
            setResult(null, 14);
        }
        return getResult();
    }

    @Override // com.google.android.gms.common.api.PendingResult
    public com.google.googlesignin.TokenResult await(long j, java.util.concurrent.TimeUnit timeUnit) {
        try {
            if (!this.latch.await(j, timeUnit)) {
                setResult(null, 15);
            }
        } catch (java.lang.InterruptedException unused) {
            setResult(null, 14);
        }
        return getResult();
    }

    @Override // com.google.android.gms.common.api.PendingResult
    public void cancel() {
        setResult(null, 16);
        this.latch.countDown();
    }

    @Override // com.google.android.gms.common.api.PendingResult
    public boolean isCanceled() {
        return getResult() != null && getResult().getStatus().isCanceled();
    }

    @Override // com.google.android.gms.common.api.PendingResult
    public void setResultCallback(com.google.android.gms.common.api.ResultCallback<? super com.google.googlesignin.TokenResult> resultCallback) {
        if (this.latch.getCount() == 0) {
            resultCallback.onResult(getResult());
        } else {
            setCallback(resultCallback);
        }
    }

    @Override // com.google.android.gms.common.api.PendingResult
    public void setResultCallback(com.google.android.gms.common.api.ResultCallback<? super com.google.googlesignin.TokenResult> resultCallback, long j, java.util.concurrent.TimeUnit timeUnit) {
        try {
            if (!this.latch.await(j, timeUnit)) {
                setResult(null, 15);
            }
        } catch (java.lang.InterruptedException unused) {
            setResult(null, 14);
        }
        resultCallback.onResult(getResult());
    }

    private synchronized void setCallback(com.google.android.gms.common.api.ResultCallback<? super com.google.googlesignin.TokenResult> resultCallback) {
        this.resultCallback = resultCallback;
    }

    private synchronized com.google.android.gms.common.api.ResultCallback<? super com.google.googlesignin.TokenResult> getCallback() {
        return this.resultCallback;
    }

    public synchronized void setResult(com.google.android.gms.auth.api.signin.GoogleSignInAccount googleSignInAccount, int i) {
        com.google.googlesignin.TokenResult tokenResult = new com.google.googlesignin.TokenResult(googleSignInAccount, i);
        this.result = tokenResult;
        tokenResult.setHandle(this.requestHandle);
    }

    private synchronized com.google.googlesignin.TokenResult getResult() {
        return this.result;
    }

    public void setStatus(int i) {
        this.result.setStatus(i);
        this.latch.countDown();
        com.google.android.gms.common.api.ResultCallback<? super com.google.googlesignin.TokenResult> callback = getCallback();
        com.google.googlesignin.TokenResult result = getResult();
        if (callback != null) {
            android.util.Log.d(TAG, " Calling onResult for callback. result: " + result);
            getCallback().onResult(result);
        }
    }
}
