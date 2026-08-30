package com.google.android.gms.nearby.messages.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzay implements com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder<com.google.android.gms.common.api.Status> {
    final /* synthetic */ com.google.android.gms.tasks.TaskCompletionSource zza;

    zzay(com.google.android.gms.nearby.messages.internal.zzbg zzbgVar, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder
    public final void setFailedResult(com.google.android.gms.common.api.Status status) {
        this.zza.setException(new com.google.android.gms.common.api.ApiException(status));
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder
    public final /* bridge */ /* synthetic */ void setResult(com.google.android.gms.common.api.Status status) {
        this.zza.setResult(null);
    }
}
