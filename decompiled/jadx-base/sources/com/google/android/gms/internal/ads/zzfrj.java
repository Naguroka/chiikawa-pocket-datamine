package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzfrj {
    public static com.google.common.util.concurrent.ListenableFuture zza(com.google.android.gms.tasks.Task task, com.google.android.gms.tasks.CancellationTokenSource cancellationTokenSource) {
        final com.google.android.gms.internal.ads.zzfri zzfriVar = new com.google.android.gms.internal.ads.zzfri(task, null);
        task.addOnCompleteListener(com.google.android.gms.internal.ads.zzgcz.zzc(), new com.google.android.gms.tasks.OnCompleteListener() { // from class: com.google.android.gms.internal.ads.zzfrh
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(com.google.android.gms.tasks.Task task2) {
                com.google.android.gms.internal.ads.zzfri zzfriVar2 = zzfriVar;
                if (task2.isCanceled()) {
                    zzfriVar2.cancel(false);
                    return;
                }
                if (task2.isSuccessful()) {
                    zzfriVar2.zzc(task2.getResult());
                    return;
                }
                java.lang.Exception exception = task2.getException();
                if (exception == null) {
                    throw new java.lang.IllegalStateException();
                }
                zzfriVar2.zzd(exception);
            }
        });
        return zzfriVar;
    }
}
