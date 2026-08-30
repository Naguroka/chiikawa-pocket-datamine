package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class PendingResultFacade<A extends com.google.android.gms.common.api.Result, B extends com.google.android.gms.common.api.Result> extends com.google.android.gms.common.api.PendingResult<B> {
    @Override // com.google.android.gms.common.api.PendingResult
    public final void addStatusListener(com.google.android.gms.common.api.PendingResult.StatusListener statusListener) {
        throw null;
    }

    @Override // com.google.android.gms.common.api.PendingResult
    public final B await() {
        throw null;
    }

    @Override // com.google.android.gms.common.api.PendingResult
    public final B await(long j, java.util.concurrent.TimeUnit timeUnit) {
        throw null;
    }

    @Override // com.google.android.gms.common.api.PendingResult
    public final void cancel() {
        throw null;
    }

    @Override // com.google.android.gms.common.api.PendingResult
    public final boolean isCanceled() {
        throw null;
    }

    @Override // com.google.android.gms.common.api.PendingResult
    public final void setResultCallback(com.google.android.gms.common.api.ResultCallback<? super B> resultCallback) {
        throw null;
    }

    @Override // com.google.android.gms.common.api.PendingResult
    public final void setResultCallback(com.google.android.gms.common.api.ResultCallback<? super B> resultCallback, long j, java.util.concurrent.TimeUnit timeUnit) {
        throw null;
    }

    @Override // com.google.android.gms.common.api.PendingResult
    public final <S extends com.google.android.gms.common.api.Result> com.google.android.gms.common.api.TransformedResult<S> then(com.google.android.gms.common.api.ResultTransform<? super B, ? extends S> resultTransform) {
        throw null;
    }
}
