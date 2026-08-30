package com.google.android.play.core.review;

/* JADX INFO: compiled from: com.google.android.play:review@@2.0.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zza extends com.google.android.play.core.review.ReviewInfo {
    private final android.app.PendingIntent zza;
    private final boolean zzb;

    zza(android.app.PendingIntent pendingIntent, boolean z) {
        if (pendingIntent == null) {
            throw new java.lang.NullPointerException("Null pendingIntent");
        }
        this.zza = pendingIntent;
        this.zzb = z;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof com.google.android.play.core.review.ReviewInfo) {
            com.google.android.play.core.review.ReviewInfo reviewInfo = (com.google.android.play.core.review.ReviewInfo) obj;
            if (this.zza.equals(reviewInfo.zza()) && this.zzb == reviewInfo.zzb()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.zza.hashCode() ^ 1000003) * 1000003) ^ (true != this.zzb ? 1237 : 1231);
    }

    public final java.lang.String toString() {
        return "ReviewInfo{pendingIntent=" + this.zza.toString() + ", isNoOp=" + this.zzb + "}";
    }

    @Override // com.google.android.play.core.review.ReviewInfo
    final android.app.PendingIntent zza() {
        return this.zza;
    }

    @Override // com.google.android.play.core.review.ReviewInfo
    final boolean zzb() {
        return this.zzb;
    }
}
