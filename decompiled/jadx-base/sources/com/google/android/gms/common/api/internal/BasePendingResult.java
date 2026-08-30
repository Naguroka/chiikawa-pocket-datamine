package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class BasePendingResult<R extends com.google.android.gms.common.api.Result> extends com.google.android.gms.common.api.PendingResult<R> {
    static final java.lang.ThreadLocal zaa = new com.google.android.gms.common.api.internal.zaq();
    public static final /* synthetic */ int zad = 0;
    private com.google.android.gms.common.api.internal.zar resultGuardian;
    protected final com.google.android.gms.common.api.internal.BasePendingResult.CallbackHandler zab;
    protected final java.lang.ref.WeakReference zac;
    private final java.lang.Object zae;
    private final java.util.concurrent.CountDownLatch zaf;
    private final java.util.ArrayList zag;
    private com.google.android.gms.common.api.ResultCallback zah;
    private final java.util.concurrent.atomic.AtomicReference zai;
    private com.google.android.gms.common.api.Result zaj;
    private com.google.android.gms.common.api.Status zak;
    private volatile boolean zal;
    private boolean zam;
    private boolean zan;
    private com.google.android.gms.common.internal.ICancelToken zao;
    private volatile com.google.android.gms.common.api.internal.zacx zap;
    private boolean zaq;

    @java.lang.Deprecated
    BasePendingResult() {
        this.zae = new java.lang.Object();
        this.zaf = new java.util.concurrent.CountDownLatch(1);
        this.zag = new java.util.ArrayList();
        this.zai = new java.util.concurrent.atomic.AtomicReference();
        this.zaq = false;
        this.zab = new com.google.android.gms.common.api.internal.BasePendingResult.CallbackHandler(android.os.Looper.getMainLooper());
        this.zac = new java.lang.ref.WeakReference(null);
    }

    private final com.google.android.gms.common.api.Result zaa() {
        com.google.android.gms.common.api.Result result;
        synchronized (this.zae) {
            com.google.android.gms.common.internal.Preconditions.checkState(!this.zal, "Result has already been consumed.");
            com.google.android.gms.common.internal.Preconditions.checkState(isReady(), "Result is not ready.");
            result = this.zaj;
            this.zaj = null;
            this.zah = null;
            this.zal = true;
        }
        com.google.android.gms.common.api.internal.zacy zacyVar = (com.google.android.gms.common.api.internal.zacy) this.zai.getAndSet(null);
        if (zacyVar != null) {
            zacyVar.zaa.zab.remove(this);
        }
        return (com.google.android.gms.common.api.Result) com.google.android.gms.common.internal.Preconditions.checkNotNull(result);
    }

    private final void zab(com.google.android.gms.common.api.Result result) {
        this.zaj = result;
        this.zak = result.getStatus();
        com.google.android.gms.common.api.internal.zas zasVar = null;
        this.zao = null;
        this.zaf.countDown();
        if (this.zam) {
            this.zah = null;
        } else {
            com.google.android.gms.common.api.ResultCallback resultCallback = this.zah;
            if (resultCallback != null) {
                this.zab.removeMessages(2);
                this.zab.zaa(resultCallback, zaa());
            } else if (this.zaj instanceof com.google.android.gms.common.api.Releasable) {
                this.resultGuardian = new com.google.android.gms.common.api.internal.zar(this, zasVar);
            }
        }
        java.util.ArrayList arrayList = this.zag;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((com.google.android.gms.common.api.PendingResult.StatusListener) arrayList.get(i)).onComplete(this.zak);
        }
        this.zag.clear();
    }

    public static void zal(com.google.android.gms.common.api.Result result) {
        if (result instanceof com.google.android.gms.common.api.Releasable) {
            try {
                ((com.google.android.gms.common.api.Releasable) result).release();
            } catch (java.lang.RuntimeException e) {
                android.util.Log.w("BasePendingResult", "Unable to release ".concat(java.lang.String.valueOf(java.lang.String.valueOf(result))), e);
            }
        }
    }

    @Override // com.google.android.gms.common.api.PendingResult
    public final void addStatusListener(com.google.android.gms.common.api.PendingResult.StatusListener statusListener) {
        com.google.android.gms.common.internal.Preconditions.checkArgument(statusListener != null, "Callback cannot be null.");
        synchronized (this.zae) {
            if (isReady()) {
                statusListener.onComplete(this.zak);
            } else {
                this.zag.add(statusListener);
            }
        }
    }

    @Override // com.google.android.gms.common.api.PendingResult
    public final R await() {
        com.google.android.gms.common.internal.Preconditions.checkNotMainThread("await must not be called on the UI thread");
        com.google.android.gms.common.internal.Preconditions.checkState(!this.zal, "Result has already been consumed");
        com.google.android.gms.common.internal.Preconditions.checkState(this.zap == null, "Cannot await if then() has been called.");
        try {
            this.zaf.await();
        } catch (java.lang.InterruptedException unused) {
            forceFailureUnlessReady(com.google.android.gms.common.api.Status.RESULT_INTERRUPTED);
        }
        com.google.android.gms.common.internal.Preconditions.checkState(isReady(), "Result is not ready.");
        return (R) zaa();
    }

    @Override // com.google.android.gms.common.api.PendingResult
    public void cancel() {
        synchronized (this.zae) {
            if (!this.zam && !this.zal) {
                com.google.android.gms.common.internal.ICancelToken iCancelToken = this.zao;
                if (iCancelToken != null) {
                    try {
                        iCancelToken.cancel();
                    } catch (android.os.RemoteException unused) {
                    }
                }
                zal(this.zaj);
                this.zam = true;
                zab(createFailedResult(com.google.android.gms.common.api.Status.RESULT_CANCELED));
            }
        }
    }

    protected abstract R createFailedResult(com.google.android.gms.common.api.Status status);

    @java.lang.Deprecated
    public final void forceFailureUnlessReady(com.google.android.gms.common.api.Status status) {
        synchronized (this.zae) {
            if (!isReady()) {
                setResult(createFailedResult(status));
                this.zan = true;
            }
        }
    }

    @Override // com.google.android.gms.common.api.PendingResult
    public final boolean isCanceled() {
        boolean z;
        synchronized (this.zae) {
            z = this.zam;
        }
        return z;
    }

    public final boolean isReady() {
        return this.zaf.getCount() == 0;
    }

    protected final void setCancelToken(com.google.android.gms.common.internal.ICancelToken iCancelToken) {
        synchronized (this.zae) {
            this.zao = iCancelToken;
        }
    }

    @Override // com.google.android.gms.common.api.PendingResult
    public final void setResultCallback(com.google.android.gms.common.api.ResultCallback<? super R> resultCallback) {
        synchronized (this.zae) {
            try {
                if (resultCallback == null) {
                    this.zah = null;
                    return;
                }
                boolean z = true;
                com.google.android.gms.common.internal.Preconditions.checkState(!this.zal, "Result has already been consumed.");
                if (this.zap != null) {
                    z = false;
                }
                com.google.android.gms.common.internal.Preconditions.checkState(z, "Cannot set callbacks if then() has been called.");
                if (isCanceled()) {
                    return;
                }
                if (isReady()) {
                    this.zab.zaa(resultCallback, zaa());
                } else {
                    this.zah = resultCallback;
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.common.api.PendingResult
    public final <S extends com.google.android.gms.common.api.Result> com.google.android.gms.common.api.TransformedResult<S> then(com.google.android.gms.common.api.ResultTransform<? super R, ? extends S> resultTransform) {
        com.google.android.gms.common.api.TransformedResult<S> transformedResultThen;
        com.google.android.gms.common.internal.Preconditions.checkState(!this.zal, "Result has already been consumed.");
        synchronized (this.zae) {
            com.google.android.gms.common.internal.Preconditions.checkState(this.zap == null, "Cannot call then() twice.");
            com.google.android.gms.common.internal.Preconditions.checkState(this.zah == null, "Cannot call then() if callbacks are set.");
            com.google.android.gms.common.internal.Preconditions.checkState(!this.zam, "Cannot call then() if result was canceled.");
            this.zaq = true;
            this.zap = new com.google.android.gms.common.api.internal.zacx(this.zac);
            transformedResultThen = this.zap.then(resultTransform);
            if (isReady()) {
                this.zab.zaa(this.zap, zaa());
            } else {
                this.zah = this.zap;
            }
        }
        return transformedResultThen;
    }

    public final void zak() {
        boolean z = true;
        if (!this.zaq && !((java.lang.Boolean) zaa.get()).booleanValue()) {
            z = false;
        }
        this.zaq = z;
    }

    public final boolean zam() {
        boolean zIsCanceled;
        synchronized (this.zae) {
            if (((com.google.android.gms.common.api.GoogleApiClient) this.zac.get()) == null || !this.zaq) {
                cancel();
            }
            zIsCanceled = isCanceled();
        }
        return zIsCanceled;
    }

    public final void zan(com.google.android.gms.common.api.internal.zacy zacyVar) {
        this.zai.set(zacyVar);
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
    public static class CallbackHandler<R extends com.google.android.gms.common.api.Result> extends com.google.android.gms.internal.base.zaq {
        public CallbackHandler() {
            super(android.os.Looper.getMainLooper());
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Handler
        public final void handleMessage(android.os.Message message) {
            int i = message.what;
            if (i != 1) {
                if (i == 2) {
                    ((com.google.android.gms.common.api.internal.BasePendingResult) message.obj).forceFailureUnlessReady(com.google.android.gms.common.api.Status.RESULT_TIMEOUT);
                    return;
                }
                android.util.Log.wtf("BasePendingResult", "Don't know how to handle message: " + message.what, new java.lang.Exception());
                return;
            }
            android.util.Pair pair = (android.util.Pair) message.obj;
            com.google.android.gms.common.api.ResultCallback resultCallback = (com.google.android.gms.common.api.ResultCallback) pair.first;
            com.google.android.gms.common.api.Result result = (com.google.android.gms.common.api.Result) pair.second;
            try {
                resultCallback.onResult(result);
            } catch (java.lang.RuntimeException e) {
                com.google.android.gms.common.api.internal.BasePendingResult.zal(result);
                throw e;
            }
        }

        public final void zaa(com.google.android.gms.common.api.ResultCallback resultCallback, com.google.android.gms.common.api.Result result) {
            int i = com.google.android.gms.common.api.internal.BasePendingResult.zad;
            sendMessage(obtainMessage(1, new android.util.Pair((com.google.android.gms.common.api.ResultCallback) com.google.android.gms.common.internal.Preconditions.checkNotNull(resultCallback), result)));
        }

        public CallbackHandler(android.os.Looper looper) {
            super(looper);
        }
    }

    public final void setResult(R r) {
        synchronized (this.zae) {
            if (this.zan || this.zam) {
                zal(r);
                return;
            }
            isReady();
            com.google.android.gms.common.internal.Preconditions.checkState(!isReady(), "Results have already been set");
            com.google.android.gms.common.internal.Preconditions.checkState(!this.zal, "Result has already been consumed");
            zab(r);
        }
    }

    @java.lang.Deprecated
    protected BasePendingResult(android.os.Looper looper) {
        this.zae = new java.lang.Object();
        this.zaf = new java.util.concurrent.CountDownLatch(1);
        this.zag = new java.util.ArrayList();
        this.zai = new java.util.concurrent.atomic.AtomicReference();
        this.zaq = false;
        this.zab = new com.google.android.gms.common.api.internal.BasePendingResult.CallbackHandler(looper);
        this.zac = new java.lang.ref.WeakReference(null);
    }

    @Override // com.google.android.gms.common.api.PendingResult
    public final R await(long j, java.util.concurrent.TimeUnit timeUnit) {
        if (j > 0) {
            com.google.android.gms.common.internal.Preconditions.checkNotMainThread("await must not be called on the UI thread when time is greater than zero.");
        }
        com.google.android.gms.common.internal.Preconditions.checkState(!this.zal, "Result has already been consumed.");
        com.google.android.gms.common.internal.Preconditions.checkState(this.zap == null, "Cannot await if then() has been called.");
        try {
            if (!this.zaf.await(j, timeUnit)) {
                forceFailureUnlessReady(com.google.android.gms.common.api.Status.RESULT_TIMEOUT);
            }
        } catch (java.lang.InterruptedException unused) {
            forceFailureUnlessReady(com.google.android.gms.common.api.Status.RESULT_INTERRUPTED);
        }
        com.google.android.gms.common.internal.Preconditions.checkState(isReady(), "Result is not ready.");
        return (R) zaa();
    }

    @Override // com.google.android.gms.common.api.PendingResult
    public final void setResultCallback(com.google.android.gms.common.api.ResultCallback<? super R> resultCallback, long j, java.util.concurrent.TimeUnit timeUnit) {
        synchronized (this.zae) {
            try {
                if (resultCallback == null) {
                    this.zah = null;
                    return;
                }
                boolean z = true;
                com.google.android.gms.common.internal.Preconditions.checkState(!this.zal, "Result has already been consumed.");
                if (this.zap != null) {
                    z = false;
                }
                com.google.android.gms.common.internal.Preconditions.checkState(z, "Cannot set callbacks if then() has been called.");
                if (isCanceled()) {
                    return;
                }
                if (isReady()) {
                    this.zab.zaa(resultCallback, zaa());
                } else {
                    this.zah = resultCallback;
                    com.google.android.gms.common.api.internal.BasePendingResult.CallbackHandler callbackHandler = this.zab;
                    callbackHandler.sendMessageDelayed(callbackHandler.obtainMessage(2, this), timeUnit.toMillis(j));
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    protected BasePendingResult(com.google.android.gms.common.api.GoogleApiClient googleApiClient) {
        this.zae = new java.lang.Object();
        this.zaf = new java.util.concurrent.CountDownLatch(1);
        this.zag = new java.util.ArrayList();
        this.zai = new java.util.concurrent.atomic.AtomicReference();
        this.zaq = false;
        this.zab = new com.google.android.gms.common.api.internal.BasePendingResult.CallbackHandler(googleApiClient != null ? googleApiClient.getLooper() : android.os.Looper.getMainLooper());
        this.zac = new java.lang.ref.WeakReference(googleApiClient);
    }

    protected BasePendingResult(com.google.android.gms.common.api.internal.BasePendingResult.CallbackHandler<R> callbackHandler) {
        this.zae = new java.lang.Object();
        this.zaf = new java.util.concurrent.CountDownLatch(1);
        this.zag = new java.util.ArrayList();
        this.zai = new java.util.concurrent.atomic.AtomicReference();
        this.zaq = false;
        this.zab = (com.google.android.gms.common.api.internal.BasePendingResult.CallbackHandler) com.google.android.gms.common.internal.Preconditions.checkNotNull(callbackHandler, "CallbackHandler must not be null");
        this.zac = new java.lang.ref.WeakReference(null);
    }
}
