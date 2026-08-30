package com.google.android.gms.location;

/* JADX INFO: compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzj implements com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder<com.google.android.gms.common.api.Status> {
    private final com.google.android.gms.tasks.TaskCompletionSource<java.lang.Void> zza;

    public zzj(com.google.android.gms.tasks.TaskCompletionSource<java.lang.Void> taskCompletionSource) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(taskCompletionSource);
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder
    public final void setFailedResult(com.google.android.gms.common.api.Status status) {
        if (status == null) {
            return;
        }
        this.zza.setException(new com.google.android.gms.common.api.ApiException(status));
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder
    public final /* bridge */ /* synthetic */ void setResult(com.google.android.gms.common.api.Status status) {
        com.google.android.gms.common.api.internal.TaskUtil.setResultOrApiException(status, null, this.zza);
    }
}
