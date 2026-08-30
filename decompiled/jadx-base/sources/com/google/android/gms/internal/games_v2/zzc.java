package com.google.android.gms.internal.games_v2;

/* JADX INFO: compiled from: com.google.android.gms:play-services-games-v2@@17.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzc {
    private static final java.lang.ClassLoader zza = com.google.android.gms.internal.games_v2.zzc.class.getClassLoader();

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
        java.lang.StringBuilder sb = new java.lang.StringBuilder(56);
        sb.append("Parcel data not fully consumed, unread size: ");
        sb.append(iDataAvail);
        throw new android.os.BadParcelableException(sb.toString());
    }

    public static void zzc(android.os.Parcel parcel, boolean z) {
        parcel.writeInt(z ? 1 : 0);
    }

    public static void zzd(android.os.Parcel parcel, android.os.Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
        }
    }

    public static void zze(android.os.Parcel parcel, android.os.Parcelable parcelable) {
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void zzf(android.os.Parcel parcel, android.os.IInterface iInterface) {
        if (iInterface == 0) {
            parcel.writeStrongBinder(null);
        } else {
            parcel.writeStrongBinder(iInterface);
        }
    }

    public static boolean zzg(android.os.Parcel parcel) {
        return parcel.readInt() != 0;
    }
}
