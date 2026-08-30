package com.google.android.gms.internal.nearby;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzc {
    private static final java.lang.ClassLoader zza = com.google.android.gms.internal.nearby.zzc.class.getClassLoader();

    private zzc() {
    }

    public static boolean zza(android.os.Parcel parcel) {
        return parcel.readInt() != 0;
    }

    public static <T extends android.os.Parcelable> T zzb(android.os.Parcel parcel, android.os.Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return creator.createFromParcel(parcel);
    }

    public static void zzc(android.os.Parcel parcel, android.os.Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
        }
    }
}
