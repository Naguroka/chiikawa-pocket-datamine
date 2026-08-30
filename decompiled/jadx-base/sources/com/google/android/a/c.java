package com.google.android.a;

/* JADX INFO: compiled from: Codecs.java */
/* JADX INFO: loaded from: classes4.dex */
public final class c {
    static {
        com.google.android.a.c.class.getClassLoader();
    }

    private c() {
    }

    public static <T extends android.os.Parcelable> T a(android.os.Parcel parcel, android.os.Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return creator.createFromParcel(parcel);
    }

    public static void b(android.os.Parcel parcel, android.os.Parcelable parcelable) {
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }

    public static void c(android.os.Parcel parcel, android.os.Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 1);
        }
    }
}
