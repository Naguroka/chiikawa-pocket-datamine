package com.google.android.gms.internal.nearby;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzgv implements android.os.Parcelable.Creator<com.google.android.gms.internal.nearby.zzgu> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.nearby.zzgu createFromParcel(android.os.Parcel parcel) {
        int iValidateObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(parcel);
        android.os.IBinder iBinder = null;
        android.os.IBinder iBinder2 = null;
        java.lang.String strCreateString = null;
        java.lang.String strCreateString2 = null;
        com.google.android.gms.nearby.connection.AdvertisingOptions advertisingOptions = null;
        android.os.IBinder iBinder3 = null;
        byte[] bArrCreateByteArray = null;
        long j = 0;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(header)) {
                case 1:
                    iBinder = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readIBinder(parcel, header);
                    break;
                case 2:
                    iBinder2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readIBinder(parcel, header);
                    break;
                case 3:
                    strCreateString = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, header);
                    break;
                case 4:
                    strCreateString2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, header);
                    break;
                case 5:
                    j = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(parcel, header);
                    break;
                case 6:
                    advertisingOptions = (com.google.android.gms.nearby.connection.AdvertisingOptions) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, header, com.google.android.gms.nearby.connection.AdvertisingOptions.CREATOR);
                    break;
                case 7:
                    iBinder3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readIBinder(parcel, header);
                    break;
                case 8:
                    bArrCreateByteArray = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createByteArray(parcel, header);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(parcel, header);
                    break;
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new com.google.android.gms.internal.nearby.zzgu(iBinder, iBinder2, strCreateString, strCreateString2, j, advertisingOptions, iBinder3, bArrCreateByteArray);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.nearby.zzgu[] newArray(int i) {
        return new com.google.android.gms.internal.nearby.zzgu[i];
    }
}
