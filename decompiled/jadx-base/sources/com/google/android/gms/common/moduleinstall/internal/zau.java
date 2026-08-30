package com.google.android.gms.common.moduleinstall.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zau extends com.google.android.gms.common.moduleinstall.internal.zaa {
    final /* synthetic */ java.util.concurrent.atomic.AtomicReference zaa;
    final /* synthetic */ com.google.android.gms.tasks.TaskCompletionSource zab;
    final /* synthetic */ com.google.android.gms.common.moduleinstall.InstallStatusListener zac;
    final /* synthetic */ com.google.android.gms.common.moduleinstall.internal.zay zad;

    zau(com.google.android.gms.common.moduleinstall.internal.zay zayVar, java.util.concurrent.atomic.AtomicReference atomicReference, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource, com.google.android.gms.common.moduleinstall.InstallStatusListener installStatusListener) {
        this.zaa = atomicReference;
        this.zab = taskCompletionSource;
        this.zac = installStatusListener;
        this.zad = zayVar;
    }

    @Override // com.google.android.gms.common.moduleinstall.internal.zaa, com.google.android.gms.common.moduleinstall.internal.zae
    public final void zad(com.google.android.gms.common.api.Status status, com.google.android.gms.common.moduleinstall.ModuleInstallResponse moduleInstallResponse) {
        if (moduleInstallResponse != null) {
            this.zaa.set(moduleInstallResponse);
        }
        com.google.android.gms.common.api.internal.TaskUtil.trySetResultOrApiException(status, null, this.zab);
        if (!status.isSuccess() || (moduleInstallResponse != null && moduleInstallResponse.zaa())) {
            this.zad.doUnregisterEventListener(com.google.android.gms.common.api.internal.ListenerHolders.createListenerKey(this.zac, "InstallStatusListener"), 27306);
        }
    }
}
