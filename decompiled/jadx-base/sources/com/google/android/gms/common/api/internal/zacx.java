package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zacx<R extends com.google.android.gms.common.api.Result> extends com.google.android.gms.common.api.TransformedResult<R> implements com.google.android.gms.common.api.ResultCallback<R> {
    private final java.lang.ref.WeakReference zag;
    private final com.google.android.gms.common.api.internal.zacw zah;
    private com.google.android.gms.common.api.ResultTransform zaa = null;
    private com.google.android.gms.common.api.internal.zacx zab = null;
    private volatile com.google.android.gms.common.api.ResultCallbacks zac = null;
    private com.google.android.gms.common.api.PendingResult zad = null;
    private final java.lang.Object zae = new java.lang.Object();
    private com.google.android.gms.common.api.Status zaf = null;
    private boolean zai = false;

    public zacx(java.lang.ref.WeakReference weakReference) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(weakReference, "GoogleApiClient reference must not be null");
        this.zag = weakReference;
        com.google.android.gms.common.api.GoogleApiClient googleApiClient = (com.google.android.gms.common.api.GoogleApiClient) weakReference.get();
        this.zah = new com.google.android.gms.common.api.internal.zacw(this, googleApiClient != null ? googleApiClient.getLooper() : android.os.Looper.getMainLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zaj(com.google.android.gms.common.api.Status status) {
        synchronized (this.zae) {
            this.zaf = status;
            zal(status);
        }
    }

    private final void zak() {
        if (this.zaa == null && this.zac == null) {
            return;
        }
        com.google.android.gms.common.api.GoogleApiClient googleApiClient = (com.google.android.gms.common.api.GoogleApiClient) this.zag.get();
        if (!this.zai && this.zaa != null && googleApiClient != null) {
            googleApiClient.zao(this);
            this.zai = true;
        }
        com.google.android.gms.common.api.Status status = this.zaf;
        if (status != null) {
            zal(status);
            return;
        }
        com.google.android.gms.common.api.PendingResult pendingResult = this.zad;
        if (pendingResult != null) {
            pendingResult.setResultCallback(this);
        }
    }

    private final void zal(com.google.android.gms.common.api.Status status) {
        synchronized (this.zae) {
            com.google.android.gms.common.api.ResultTransform resultTransform = this.zaa;
            if (resultTransform != null) {
                ((com.google.android.gms.common.api.internal.zacx) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zab)).zaj((com.google.android.gms.common.api.Status) com.google.android.gms.common.internal.Preconditions.checkNotNull(resultTransform.onFailure(status), "onFailure must not return null"));
            } else if (zam()) {
                ((com.google.android.gms.common.api.ResultCallbacks) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zac)).onFailure(status);
            }
        }
    }

    private final boolean zam() {
        return (this.zac == null || ((com.google.android.gms.common.api.GoogleApiClient) this.zag.get()) == null) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void zan(com.google.android.gms.common.api.Result result) {
        if (result instanceof com.google.android.gms.common.api.Releasable) {
            try {
                ((com.google.android.gms.common.api.Releasable) result).release();
            } catch (java.lang.RuntimeException e) {
                android.util.Log.w("TransformedResultImpl", "Unable to release ".concat(java.lang.String.valueOf(java.lang.String.valueOf(result))), e);
            }
        }
    }

    @Override // com.google.android.gms.common.api.TransformedResult
    public final void andFinally(com.google.android.gms.common.api.ResultCallbacks<? super R> resultCallbacks) {
        synchronized (this.zae) {
            boolean z = true;
            com.google.android.gms.common.internal.Preconditions.checkState(this.zac == null, "Cannot call andFinally() twice.");
            if (this.zaa != null) {
                z = false;
            }
            com.google.android.gms.common.internal.Preconditions.checkState(z, "Cannot call then() and andFinally() on the same TransformedResult.");
            this.zac = resultCallbacks;
            zak();
        }
    }

    @Override // com.google.android.gms.common.api.ResultCallback
    public final void onResult(com.google.android.gms.common.api.Result result) {
        synchronized (this.zae) {
            if (!result.getStatus().isSuccess()) {
                zaj(result.getStatus());
                zan(result);
            } else if (this.zaa != null) {
                com.google.android.gms.common.api.internal.zacl.zaa().submit(new com.google.android.gms.common.api.internal.zacv(this, result));
            } else if (zam()) {
                ((com.google.android.gms.common.api.ResultCallbacks) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zac)).onSuccess(result);
            }
        }
    }

    @Override // com.google.android.gms.common.api.TransformedResult
    public final <S extends com.google.android.gms.common.api.Result> com.google.android.gms.common.api.TransformedResult<S> then(com.google.android.gms.common.api.ResultTransform<? super R, ? extends S> resultTransform) {
        com.google.android.gms.common.api.internal.zacx zacxVar;
        synchronized (this.zae) {
            boolean z = true;
            com.google.android.gms.common.internal.Preconditions.checkState(this.zaa == null, "Cannot call then() twice.");
            if (this.zac != null) {
                z = false;
            }
            com.google.android.gms.common.internal.Preconditions.checkState(z, "Cannot call then() and andFinally() on the same TransformedResult.");
            this.zaa = resultTransform;
            zacxVar = new com.google.android.gms.common.api.internal.zacx(this.zag);
            this.zab = zacxVar;
            zak();
        }
        return zacxVar;
    }

    final void zah() {
        this.zac = null;
    }

    public final void zai(com.google.android.gms.common.api.PendingResult pendingResult) {
        synchronized (this.zae) {
            this.zad = pendingResult;
            zak();
        }
    }
}
