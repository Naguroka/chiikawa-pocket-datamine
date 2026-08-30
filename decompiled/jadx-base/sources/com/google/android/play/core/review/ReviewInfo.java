package com.google.android.play.core.review;

/* JADX INFO: compiled from: com.google.android.play:review@@2.0.0 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class ReviewInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.google.android.play.core.review.ReviewInfo> CREATOR = new com.google.android.play.core.review.zzb();

    public static com.google.android.play.core.review.ReviewInfo zzc(android.app.PendingIntent pendingIntent, boolean z) {
        return new com.google.android.play.core.review.zza(pendingIntent, false);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeParcelable(zza(), 0);
        parcel.writeInt(zzb() ? 1 : 0);
    }

    abstract android.app.PendingIntent zza();

    abstract boolean zzb();
}
