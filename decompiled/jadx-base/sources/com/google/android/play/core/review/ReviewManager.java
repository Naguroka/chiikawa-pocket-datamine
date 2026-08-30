package com.google.android.play.core.review;

/* JADX INFO: compiled from: com.google.android.play:review@@2.0.0 */
/* JADX INFO: loaded from: classes5.dex */
public interface ReviewManager {
    com.google.android.gms.tasks.Task<java.lang.Void> launchReviewFlow(android.app.Activity activity, com.google.android.play.core.review.ReviewInfo reviewInfo);

    com.google.android.gms.tasks.Task<com.google.android.play.core.review.ReviewInfo> requestReviewFlow();
}
