package com.google.android.gms.internal.nearby;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzcl<T> implements com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder<T> {
    private final com.google.android.gms.tasks.TaskCompletionSource<java.lang.Void> zza;

    zzcl(com.google.android.gms.internal.nearby.zzcn zzcnVar, com.google.android.gms.tasks.TaskCompletionSource<java.lang.Void> taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder
    public final void setFailedResult(com.google.android.gms.common.api.Status status) {
        this.zza.setException(new com.google.android.gms.common.api.ApiException(status));
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder
    public final void setResult(T t) {
        this.zza.setResult(null);
    }
}
