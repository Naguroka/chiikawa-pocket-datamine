package com.google.android.gms.common.api;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class PendingResults {
    private PendingResults() {
    }

    public static com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> canceledPendingResult() {
        com.google.android.gms.common.api.internal.StatusPendingResult statusPendingResult = new com.google.android.gms.common.api.internal.StatusPendingResult(android.os.Looper.getMainLooper());
        statusPendingResult.cancel();
        return statusPendingResult;
    }

    public static <R extends com.google.android.gms.common.api.Result> com.google.android.gms.common.api.PendingResult<R> immediateFailedResult(R r, com.google.android.gms.common.api.GoogleApiClient googleApiClient) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(r, "Result must not be null");
        com.google.android.gms.common.internal.Preconditions.checkArgument(!r.getStatus().isSuccess(), "Status code must not be SUCCESS");
        com.google.android.gms.common.api.zag zagVar = new com.google.android.gms.common.api.zag(googleApiClient, r);
        zagVar.setResult(r);
        return zagVar;
    }

    public static <R extends com.google.android.gms.common.api.Result> com.google.android.gms.common.api.OptionalPendingResult<R> immediatePendingResult(R r) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(r, "Result must not be null");
        com.google.android.gms.common.api.zah zahVar = new com.google.android.gms.common.api.zah(null);
        zahVar.setResult(r);
        return new com.google.android.gms.common.api.internal.OptionalPendingResultImpl(zahVar);
    }

    public static <R extends com.google.android.gms.common.api.Result> com.google.android.gms.common.api.PendingResult<R> canceledPendingResult(R r) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(r, "Result must not be null");
        com.google.android.gms.common.internal.Preconditions.checkArgument(r.getStatus().getStatusCode() == 16, "Status code must be CommonStatusCodes.CANCELED");
        com.google.android.gms.common.api.zaf zafVar = new com.google.android.gms.common.api.zaf(r);
        zafVar.cancel();
        return zafVar;
    }

    public static <R extends com.google.android.gms.common.api.Result> com.google.android.gms.common.api.OptionalPendingResult<R> immediatePendingResult(R r, com.google.android.gms.common.api.GoogleApiClient googleApiClient) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(r, "Result must not be null");
        com.google.android.gms.common.api.zah zahVar = new com.google.android.gms.common.api.zah(googleApiClient);
        zahVar.setResult(r);
        return new com.google.android.gms.common.api.internal.OptionalPendingResultImpl(zahVar);
    }

    public static com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> immediatePendingResult(com.google.android.gms.common.api.Status status) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(status, "Result must not be null");
        com.google.android.gms.common.api.internal.StatusPendingResult statusPendingResult = new com.google.android.gms.common.api.internal.StatusPendingResult(android.os.Looper.getMainLooper());
        statusPendingResult.setResult(status);
        return statusPendingResult;
    }

    public static com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> immediatePendingResult(com.google.android.gms.common.api.Status status, com.google.android.gms.common.api.GoogleApiClient googleApiClient) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(status, "Result must not be null");
        com.google.android.gms.common.api.internal.StatusPendingResult statusPendingResult = new com.google.android.gms.common.api.internal.StatusPendingResult(googleApiClient);
        statusPendingResult.setResult(status);
        return statusPendingResult;
    }
}
