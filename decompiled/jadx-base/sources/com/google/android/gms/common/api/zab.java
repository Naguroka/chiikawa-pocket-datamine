package com.google.android.gms.common.api;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zab implements com.google.android.gms.common.api.PendingResult.StatusListener {
    final /* synthetic */ com.google.android.gms.common.api.Batch zaa;

    zab(com.google.android.gms.common.api.Batch batch) {
        this.zaa = batch;
    }

    @Override // com.google.android.gms.common.api.PendingResult.StatusListener
    public final void onComplete(com.google.android.gms.common.api.Status status) {
        synchronized (this.zaa.zai) {
            if (this.zaa.isCanceled()) {
                return;
            }
            if (status.isCanceled()) {
                this.zaa.zag = true;
            } else if (!status.isSuccess()) {
                this.zaa.zaf = true;
            }
            this.zaa.zae--;
            com.google.android.gms.common.api.Batch batch = this.zaa;
            if (batch.zae == 0) {
                if (batch.zag) {
                    super/*com.google.android.gms.common.api.internal.BasePendingResult*/.cancel();
                } else {
                    this.zaa.setResult(new com.google.android.gms.common.api.BatchResult(batch.zaf ? new com.google.android.gms.common.api.Status(13) : com.google.android.gms.common.api.Status.RESULT_SUCCESS, this.zaa.zah));
                }
            }
        }
    }
}
