package com.google.android.gms.internal.p001authapiphone;

/* JADX INFO: loaded from: classes4.dex */
public class zzc {
    private static final java.lang.ClassLoader zzd = com.google.android.gms.internal.p001authapiphone.zzc.class.getClassLoader();

    private zzc() {
    }

    public static <T extends android.os.Parcelable> T zza(android.os.Parcel parcel, android.os.Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return creator.createFromParcel(parcel);
    }

    public static void zza(android.os.Parcel parcel, android.os.IInterface iInterface) {
        parcel.writeStrongBinder(iInterface == null ? null : iInterface.asBinder());
    }
}
