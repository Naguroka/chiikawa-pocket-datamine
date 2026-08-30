package com.google.android.play.core.review.testing;

/* JADX INFO: compiled from: com.google.android.play:review@@2.0.0 */
/* JADX INFO: loaded from: classes5.dex */
public class FakeReviewManager implements com.google.android.play.core.review.ReviewManager {
    private final android.content.Context zza;
    private com.google.android.play.core.review.ReviewInfo zzb;

    public FakeReviewManager(android.content.Context context) {
        this.zza = context;
    }

    @Override // com.google.android.play.core.review.ReviewManager
    public com.google.android.gms.tasks.Task<java.lang.Void> launchReviewFlow(android.app.Activity activity, com.google.android.play.core.review.ReviewInfo reviewInfo) {
        return reviewInfo != this.zzb ? com.google.android.gms.tasks.Tasks.forException(new com.google.android.play.core.review.ReviewException(-2)) : com.google.android.gms.tasks.Tasks.forResult(null);
    }

    @Override // com.google.android.play.core.review.ReviewManager
    public com.google.android.gms.tasks.Task<com.google.android.play.core.review.ReviewInfo> requestReviewFlow() {
        com.google.android.play.core.review.ReviewInfo reviewInfoZzc = com.google.android.play.core.review.ReviewInfo.zzc(android.app.PendingIntent.getBroadcast(this.zza, 0, new android.content.Intent(), 67108864), false);
        this.zzb = reviewInfoZzc;
        return com.google.android.gms.tasks.Tasks.forResult(reviewInfoZzc);
    }
}
