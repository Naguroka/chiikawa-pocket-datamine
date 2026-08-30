package com.google.android.gms.common.moduleinstall.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zax extends com.google.android.gms.common.api.internal.IStatusCallback.Stub {
    final /* synthetic */ com.google.android.gms.tasks.TaskCompletionSource zaa;

    zax(com.google.android.gms.common.moduleinstall.internal.zay zayVar, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        this.zaa = taskCompletionSource;
    }

    @Override // com.google.android.gms.common.api.internal.IStatusCallback
    public final void onResult(com.google.android.gms.common.api.Status status) {
        com.google.android.gms.common.api.internal.TaskUtil.trySetResultOrApiException(status, null, this.zaa);
    }
}
