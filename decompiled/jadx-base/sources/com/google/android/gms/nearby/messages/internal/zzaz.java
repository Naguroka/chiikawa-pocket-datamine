package com.google.android.gms.nearby.messages.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzaz implements com.google.android.gms.tasks.OnCompleteListener<java.lang.Boolean> {
    final /* synthetic */ com.google.android.gms.tasks.TaskCompletionSource zza;

    zzaz(com.google.android.gms.nearby.messages.internal.zzbg zzbgVar, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(com.google.android.gms.tasks.Task<java.lang.Boolean> task) {
        if (task.isSuccessful()) {
            this.zza.setResult(null);
        } else {
            this.zza.setException(task.getException());
        }
    }
}
