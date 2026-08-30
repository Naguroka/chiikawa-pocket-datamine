package com.google.android.gms.common.moduleinstall.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zat extends com.google.android.gms.common.moduleinstall.internal.zaa {
    final /* synthetic */ com.google.android.gms.tasks.TaskCompletionSource zaa;

    zat(com.google.android.gms.common.moduleinstall.internal.zay zayVar, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        this.zaa = taskCompletionSource;
    }

    @Override // com.google.android.gms.common.moduleinstall.internal.zaa, com.google.android.gms.common.moduleinstall.internal.zae
    public final void zad(com.google.android.gms.common.api.Status status, com.google.android.gms.common.moduleinstall.ModuleInstallResponse moduleInstallResponse) {
        com.google.android.gms.common.api.internal.TaskUtil.trySetResultOrApiException(status, moduleInstallResponse, this.zaa);
    }
}
