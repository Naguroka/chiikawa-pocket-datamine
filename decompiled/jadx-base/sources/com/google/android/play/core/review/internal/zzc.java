package com.google.android.play.core.review.internal;

/* JADX INFO: compiled from: com.google.android.play:review@@2.0.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzc {
    private static final java.lang.ClassLoader zza = com.google.android.play.core.review.internal.zzc.class.getClassLoader();

    private zzc() {
    }

    public static android.os.Parcelable zza(android.os.Parcel parcel, android.os.Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (android.os.Parcelable) creator.createFromParcel(parcel);
    }

    public static void zzb(android.os.Parcel parcel) {
        int iDataAvail = parcel.dataAvail();
        if (iDataAvail <= 0) {
            return;
        }
        throw new android.os.BadParcelableException("Parcel data not fully consumed, unread size: " + iDataAvail);
    }

    public static void zzc(android.os.Parcel parcel, android.os.Parcelable parcelable) {
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void zzd(android.os.Parcel parcel, android.os.IInterface iInterface) {
        parcel.writeStrongBinder(iInterface);
    }
}
