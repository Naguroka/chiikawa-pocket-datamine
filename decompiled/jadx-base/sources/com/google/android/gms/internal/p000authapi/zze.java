package com.google.android.gms.internal.p000authapi;

/* JADX INFO: loaded from: classes4.dex */
public class zze {
    private static final java.lang.ClassLoader zzf = com.google.android.gms.internal.p000authapi.zze.class.getClassLoader();

    private zze() {
    }

    public static <T extends android.os.Parcelable> T zzc(android.os.Parcel parcel, android.os.Parcelable.Creator<T> creator) {
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

    public static void zzc(android.os.Parcel parcel, android.os.IInterface iInterface) {
        if (iInterface == null) {
            parcel.writeStrongBinder(null);
        } else {
            parcel.writeStrongBinder(iInterface.asBinder());
        }
    }
}
