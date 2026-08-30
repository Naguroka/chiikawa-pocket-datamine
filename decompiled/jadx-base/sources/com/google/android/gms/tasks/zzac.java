package com.google.android.gms.tasks;

/* JADX INFO: compiled from: com.google.android.gms:play-services-tasks@@18.2.1 */
/* JADX INFO: loaded from: classes5.dex */
final class zzac<T> implements com.google.android.gms.tasks.zzad<T> {
    private final java.util.concurrent.CountDownLatch zza = new java.util.concurrent.CountDownLatch(1);

    private zzac() {
    }

    @Override // com.google.android.gms.tasks.OnCanceledListener
    public final void onCanceled() {
        this.zza.countDown();
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(java.lang.Exception exc) {
        this.zza.countDown();
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(T t) {
        this.zza.countDown();
    }

    public final void zza() throws java.lang.InterruptedException {
        this.zza.await();
    }

    public final boolean zzb(long j, java.util.concurrent.TimeUnit timeUnit) throws java.lang.InterruptedException {
        return this.zza.await(j, timeUnit);
    }

    /* synthetic */ zzac(com.google.android.gms.tasks.zzaf zzafVar) {
    }
}
