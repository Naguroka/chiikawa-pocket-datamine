package com.google.android.play.core.review;

/* JADX INFO: compiled from: com.google.android.play:review@@2.0.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzi {
    private static final com.google.android.play.core.review.internal.zzi zzb = new com.google.android.play.core.review.internal.zzi("ReviewService");
    com.google.android.play.core.review.internal.zzt zza;
    private final java.lang.String zzc;

    public zzi(android.content.Context context) {
        this.zzc = context.getPackageName();
        if (com.google.android.play.core.review.internal.zzw.zza(context)) {
            this.zza = new com.google.android.play.core.review.internal.zzt(context, zzb, "com.google.android.finsky.inappreviewservice.InAppReviewService", new android.content.Intent("com.google.android.finsky.BIND_IN_APP_REVIEW_SERVICE").setPackage("com.android.vending"), com.google.android.play.core.review.zze.zza, null, null);
        }
    }

    public final com.google.android.gms.tasks.Task zza() {
        com.google.android.play.core.review.internal.zzi zziVar = zzb;
        zziVar.zzd("requestInAppReview (%s)", this.zzc);
        if (this.zza == null) {
            zziVar.zzb("Play Store app is either not installed or not the official version", new java.lang.Object[0]);
            return com.google.android.gms.tasks.Tasks.forException(new com.google.android.play.core.review.ReviewException(-1));
        }
        com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource = new com.google.android.gms.tasks.TaskCompletionSource();
        this.zza.zzp(new com.google.android.play.core.review.zzf(this, taskCompletionSource, taskCompletionSource), taskCompletionSource);
        return taskCompletionSource.getTask();
    }
}
