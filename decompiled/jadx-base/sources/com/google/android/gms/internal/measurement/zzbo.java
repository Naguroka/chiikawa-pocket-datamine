package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzbo {
    public static final /* synthetic */ int zza = 0;
    private static final java.lang.ClassLoader zzb = com.google.android.gms.internal.measurement.zzbo.class.getClassLoader();

    private zzbo() {
    }

    public static android.os.Parcelable zza(android.os.Parcel parcel, android.os.Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (android.os.Parcelable) creator.createFromParcel(parcel);
    }

    public static java.util.HashMap zzb(android.os.Parcel parcel) {
        return parcel.readHashMap(zzb);
    }

    public static void zzc(android.os.Parcel parcel) {
        int iDataAvail = parcel.dataAvail();
        if (iDataAvail <= 0) {
            return;
        }
        throw new android.os.BadParcelableException("Parcel data not fully consumed, unread size: " + iDataAvail);
    }

    public static void zzd(android.os.Parcel parcel, android.os.Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
        }
    }

    public static void zze(android.os.Parcel parcel, android.os.IInterface iInterface) {
        if (iInterface == null) {
            parcel.writeStrongBinder(null);
        } else {
            parcel.writeStrongBinder(iInterface.asBinder());
        }
    }

    public static boolean zzf(android.os.Parcel parcel) {
        return parcel.readInt() != 0;
    }
}
