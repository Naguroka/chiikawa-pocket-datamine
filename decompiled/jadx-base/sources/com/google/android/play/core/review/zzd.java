package com.google.android.play.core.review;

/* JADX INFO: compiled from: com.google.android.play:review@@2.0.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzd implements com.google.android.play.core.review.ReviewManager {
    private final com.google.android.play.core.review.zzi zza;
    private final android.os.Handler zzb = new android.os.Handler(android.os.Looper.getMainLooper());

    zzd(com.google.android.play.core.review.zzi zziVar) {
        this.zza = zziVar;
    }

    @Override // com.google.android.play.core.review.ReviewManager
    public final com.google.android.gms.tasks.Task<java.lang.Void> launchReviewFlow(android.app.Activity activity, com.google.android.play.core.review.ReviewInfo reviewInfo) {
        if (reviewInfo.zzb()) {
            return com.google.android.gms.tasks.Tasks.forResult(null);
        }
        android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.google.android.play.core.common.PlayCoreDialogWrapperActivity.class);
        intent.putExtra("confirmation_intent", reviewInfo.zza());
        intent.putExtra("window_flags", activity.getWindow().getDecorView().getWindowSystemUiVisibility());
        com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource = new com.google.android.gms.tasks.TaskCompletionSource();
        intent.putExtra("result_receiver", new com.google.android.play.core.review.zzc(this, this.zzb, taskCompletionSource));
        activity.startActivity(intent);
        return taskCompletionSource.getTask();
    }

    @Override // com.google.android.play.core.review.ReviewManager
    public final com.google.android.gms.tasks.Task<com.google.android.play.core.review.ReviewInfo> requestReviewFlow() {
        return this.zza.zza();
    }
}
