package com.google.android.play.core.review;

/* JADX INFO: compiled from: com.google.android.play:review@@2.0.0 */
/* JADX INFO: loaded from: classes5.dex */
public class ReviewException extends com.google.android.gms.common.api.ApiException {
    public ReviewException(int i) {
        super(new com.google.android.gms.common.api.Status(i, java.lang.String.format(java.util.Locale.getDefault(), "Review Error(%d): %s", java.lang.Integer.valueOf(i), com.google.android.play.core.review.model.zza.zza(i))));
    }

    public int getErrorCode() {
        return super.getStatusCode();
    }
}
