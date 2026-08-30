package com.google.android.play.core.review;

/* JADX INFO: compiled from: com.google.android.play:review@@2.0.0 */
/* JADX INFO: loaded from: classes5.dex */
class zzg extends com.google.android.play.core.review.internal.zzg {
    final com.google.android.play.core.review.internal.zzi zza;
    final com.google.android.gms.tasks.TaskCompletionSource zzb;
    final /* synthetic */ com.google.android.play.core.review.zzi zzc;

    zzg(com.google.android.play.core.review.zzi zziVar, com.google.android.play.core.review.internal.zzi zziVar2, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        this.zzc = zziVar;
        this.zza = zziVar2;
        this.zzb = taskCompletionSource;
    }

    @Override // com.google.android.play.core.review.internal.zzh
    public void zzb(android.os.Bundle bundle) throws android.os.RemoteException {
        com.google.android.play.core.review.internal.zzt zztVar = this.zzc.zza;
        if (zztVar != null) {
            zztVar.zzr(this.zzb);
        }
        this.zza.zzd("onGetLaunchReviewFlowInfo", new java.lang.Object[0]);
    }
}
