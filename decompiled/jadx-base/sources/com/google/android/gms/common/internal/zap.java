package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zap implements com.google.android.gms.common.api.PendingResult.StatusListener {
    final /* synthetic */ com.google.android.gms.common.api.PendingResult zaa;
    final /* synthetic */ com.google.android.gms.tasks.TaskCompletionSource zab;
    final /* synthetic */ com.google.android.gms.common.internal.PendingResultUtil.ResultConverter zac;
    final /* synthetic */ com.google.android.gms.common.internal.zas zad;

    zap(com.google.android.gms.common.api.PendingResult pendingResult, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource, com.google.android.gms.common.internal.PendingResultUtil.ResultConverter resultConverter, com.google.android.gms.common.internal.zas zasVar) {
        this.zaa = pendingResult;
        this.zab = taskCompletionSource;
        this.zac = resultConverter;
        this.zad = zasVar;
    }

    @Override // com.google.android.gms.common.api.PendingResult.StatusListener
    public final void onComplete(com.google.android.gms.common.api.Status status) {
        if (!status.isSuccess()) {
            this.zab.setException(com.google.android.gms.common.internal.ApiExceptionUtil.fromStatus(status));
        } else {
            this.zab.setResult(this.zac.convert(this.zaa.await(0L, java.util.concurrent.TimeUnit.MILLISECONDS)));
        }
    }
}
