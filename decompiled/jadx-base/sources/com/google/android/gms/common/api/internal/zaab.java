package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zaab implements com.google.android.gms.tasks.OnCompleteListener {
    final /* synthetic */ com.google.android.gms.tasks.TaskCompletionSource zaa;
    final /* synthetic */ com.google.android.gms.common.api.internal.zaac zab;

    zaab(com.google.android.gms.common.api.internal.zaac zaacVar, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        this.zaa = taskCompletionSource;
        this.zab = zaacVar;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(com.google.android.gms.tasks.Task task) {
        this.zab.zab.remove(this.zaa);
    }
}
