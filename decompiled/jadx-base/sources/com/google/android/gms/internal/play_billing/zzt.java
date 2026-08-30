package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzt implements com.google.android.gms.internal.play_billing.zzcz {
    final java.lang.ref.WeakReference zza;
    private final com.google.android.gms.internal.play_billing.zzo zzb = new com.google.android.gms.internal.play_billing.zzs(this);

    zzt(com.google.android.gms.internal.play_billing.zzp zzpVar) {
        this.zza = new java.lang.ref.WeakReference(zzpVar);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        com.google.android.gms.internal.play_billing.zzp zzpVar = (com.google.android.gms.internal.play_billing.zzp) this.zza.get();
        boolean zCancel = this.zzb.cancel(z);
        if (!zCancel || zzpVar == null) {
            return zCancel;
        }
        zzpVar.zza();
        return true;
    }

    @Override // java.util.concurrent.Future
    public final java.lang.Object get() throws java.util.concurrent.ExecutionException, java.lang.InterruptedException {
        return this.zzb.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.zzb.zzc instanceof com.google.android.gms.internal.play_billing.zze;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.zzb.isDone();
    }

    public final java.lang.String toString() {
        return this.zzb.toString();
    }

    final boolean zza(java.lang.Object obj) {
        return this.zzb.zzd(obj);
    }

    @Override // com.google.android.gms.internal.play_billing.zzcz
    public final void zzb(java.lang.Runnable runnable, java.util.concurrent.Executor executor) {
        this.zzb.zzb(runnable, executor);
    }

    final boolean zzc(java.lang.Throwable th) {
        com.google.android.gms.internal.play_billing.zzg zzgVar = new com.google.android.gms.internal.play_billing.zzg(th);
        com.google.android.gms.internal.play_billing.zzd zzdVar = com.google.android.gms.internal.play_billing.zzo.zzb;
        com.google.android.gms.internal.play_billing.zzo zzoVar = this.zzb;
        if (!zzdVar.zzd(zzoVar, null, zzgVar)) {
            return false;
        }
        com.google.android.gms.internal.play_billing.zzo.zzc(zzoVar);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final java.lang.Object get(long j, java.util.concurrent.TimeUnit timeUnit) throws java.util.concurrent.ExecutionException, java.lang.InterruptedException, java.util.concurrent.TimeoutException {
        return this.zzb.get(j, timeUnit);
    }
}
