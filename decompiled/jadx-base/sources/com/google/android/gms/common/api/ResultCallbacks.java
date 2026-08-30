package com.google.android.gms.common.api;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class ResultCallbacks<R extends com.google.android.gms.common.api.Result> implements com.google.android.gms.common.api.ResultCallback<R> {
    public abstract void onFailure(com.google.android.gms.common.api.Status status);

    @Override // com.google.android.gms.common.api.ResultCallback
    public final void onResult(R r) {
        com.google.android.gms.common.api.Status status = r.getStatus();
        if (status.isSuccess()) {
            onSuccess(r);
            return;
        }
        onFailure(status);
        if (r instanceof com.google.android.gms.common.api.Releasable) {
            try {
                ((com.google.android.gms.common.api.Releasable) r).release();
            } catch (java.lang.RuntimeException e) {
                android.util.Log.w("ResultCallbacks", "Unable to release ".concat(java.lang.String.valueOf(java.lang.String.valueOf(r))), e);
            }
        }
    }

    public abstract void onSuccess(R r);
}
