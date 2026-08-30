package com.google.android.play.core.review;

/* JADX INFO: compiled from: com.google.android.play:review@@2.0.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzh extends com.google.android.play.core.review.zzg {
    final java.lang.String zzd;

    zzh(com.google.android.play.core.review.zzi zziVar, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource, java.lang.String str) {
        super(zziVar, new com.google.android.play.core.review.internal.zzi("OnRequestInstallCallback"), taskCompletionSource);
        this.zzd = str;
    }

    @Override // com.google.android.play.core.review.zzg, com.google.android.play.core.review.internal.zzh
    public final void zzb(android.os.Bundle bundle) throws android.os.RemoteException {
        super.zzb(bundle);
        this.zzb.trySetResult(new com.google.android.play.core.review.zza((android.app.PendingIntent) bundle.get("confirmation_intent"), bundle.getBoolean("is_review_no_op")));
    }
}
