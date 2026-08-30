package com.google.android.gms.internal.games_v2;

/* JADX INFO: compiled from: com.google.android.gms:play-services-games-v2@@17.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzbk {
    private final com.google.android.gms.tasks.TaskCompletionSource zza;
    private final com.google.android.gms.internal.games_v2.zzap zzb;

    public zzbk(com.google.android.gms.internal.games_v2.zzap zzapVar, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource, byte[] bArr) {
        this.zzb = zzapVar;
        this.zza = taskCompletionSource;
    }

    public final void zza(com.google.android.gms.common.api.GoogleApi googleApi) {
        this.zzb.zza(googleApi).addOnCompleteListener(com.google.android.gms.internal.games_v2.zzfe.zza(), new com.google.android.gms.tasks.OnCompleteListener() { // from class: com.google.android.gms.internal.games_v2.zzbj
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(com.google.android.gms.tasks.Task task) {
                this.zza.zzb(task);
            }
        });
    }

    final /* synthetic */ void zzb(com.google.android.gms.tasks.Task task) {
        if (task.isSuccessful()) {
            this.zza.setResult(task.getResult());
            return;
        }
        com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource = this.zza;
        java.lang.Exception exception = task.getException();
        com.google.android.gms.internal.games_v2.zzfb.zza(exception);
        taskCompletionSource.setException(exception);
    }

    public final void zzc(java.lang.Exception exc) {
        this.zza.setException(exc);
    }
}
