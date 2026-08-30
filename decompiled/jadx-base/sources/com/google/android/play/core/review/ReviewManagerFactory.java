package com.google.android.play.core.review;

/* JADX INFO: compiled from: com.google.android.play:review@@2.0.0 */
/* JADX INFO: loaded from: classes5.dex */
public class ReviewManagerFactory {
    private ReviewManagerFactory() {
    }

    public static com.google.android.play.core.review.ReviewManager create(android.content.Context context) {
        android.content.Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return new com.google.android.play.core.review.zzd(new com.google.android.play.core.review.zzi(context));
    }
}
