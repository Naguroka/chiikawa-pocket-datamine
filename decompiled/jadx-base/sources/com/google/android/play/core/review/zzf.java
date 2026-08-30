package com.google.android.play.core.review;

/* JADX INFO: compiled from: com.google.android.play:review@@2.0.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzf extends com.google.android.play.core.review.internal.zzj {
    final /* synthetic */ com.google.android.gms.tasks.TaskCompletionSource zza;
    final /* synthetic */ com.google.android.play.core.review.zzi zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzf(com.google.android.play.core.review.zzi zziVar, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource2) {
        super(taskCompletionSource);
        this.zzb = zziVar;
        this.zza = taskCompletionSource2;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.os.IInterface, com.google.android.play.core.review.internal.zzf] */
    @Override // com.google.android.play.core.review.internal.zzj
    protected final void zza() {
        try {
            ?? Zze = this.zzb.zza.zze();
            java.lang.String str = this.zzb.zzc;
            android.os.Bundle bundleZza = com.google.android.play.core.review.zzj.zza();
            com.google.android.play.core.review.zzi zziVar = this.zzb;
            Zze.zzc(str, bundleZza, new com.google.android.play.core.review.zzh(zziVar, this.zza, zziVar.zzc));
        } catch (android.os.RemoteException e) {
            com.google.android.play.core.review.zzi.zzb.zzc(e, "error requesting in-app review for %s", this.zzb.zzc);
            this.zza.trySetException(new java.lang.RuntimeException(e));
        }
    }
}
