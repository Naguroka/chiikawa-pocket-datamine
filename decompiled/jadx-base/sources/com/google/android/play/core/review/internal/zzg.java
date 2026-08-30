package com.google.android.play.core.review.internal;

/* JADX INFO: compiled from: com.google.android.play:review@@2.0.0 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class zzg extends com.google.android.play.core.review.internal.zzb implements com.google.android.play.core.review.internal.zzh {
    public zzg() {
        super("com.google.android.play.core.inappreview.protocol.IInAppReviewServiceCallback");
    }

    @Override // com.google.android.play.core.review.internal.zzb
    protected final boolean zza(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i != 2) {
            return false;
        }
        android.os.Bundle bundle = (android.os.Bundle) com.google.android.play.core.review.internal.zzc.zza(parcel, android.os.Bundle.CREATOR);
        com.google.android.play.core.review.internal.zzc.zzb(parcel);
        zzb(bundle);
        return true;
    }
}
