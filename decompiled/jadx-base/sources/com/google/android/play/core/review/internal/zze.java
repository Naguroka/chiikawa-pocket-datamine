package com.google.android.play.core.review.internal;

/* JADX INFO: compiled from: com.google.android.play:review@@2.0.0 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class zze extends com.google.android.play.core.review.internal.zzb implements com.google.android.play.core.review.internal.zzf {
    public static com.google.android.play.core.review.internal.zzf zzb(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.inappreview.protocol.IInAppReviewService");
        return iInterfaceQueryLocalInterface instanceof com.google.android.play.core.review.internal.zzf ? (com.google.android.play.core.review.internal.zzf) iInterfaceQueryLocalInterface : new com.google.android.play.core.review.internal.zzd(iBinder);
    }
}
