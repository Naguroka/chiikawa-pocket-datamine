package com.google.android.gms.common.api;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zaf<R extends com.google.android.gms.common.api.Result> extends com.google.android.gms.common.api.internal.BasePendingResult<R> {
    private final com.google.android.gms.common.api.Result zae;

    public zaf(com.google.android.gms.common.api.Result result) {
        super(android.os.Looper.getMainLooper());
        this.zae = result;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected final R createFailedResult(com.google.android.gms.common.api.Status status) {
        if (status.getStatusCode() == this.zae.getStatus().getStatusCode()) {
            return (R) this.zae;
        }
        throw new java.lang.UnsupportedOperationException("Creating failed results is not supported");
    }
}
