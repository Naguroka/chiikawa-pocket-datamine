package com.google.android.gms.internal.nearby;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzhh implements android.os.Parcelable.Creator<com.google.android.gms.internal.nearby.zzhg> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.nearby.zzhg createFromParcel(android.os.Parcel parcel) {
        int iValidateObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(parcel);
        int i = 0;
        int i2 = 0;
        android.os.ParcelUuid parcelUuid = null;
        android.os.ParcelUuid parcelUuid2 = null;
        android.os.ParcelUuid parcelUuid3 = null;
        byte[] bArrCreateByteArray = null;
        byte[] bArrCreateByteArray2 = null;
        byte[] bArrCreateByteArray3 = null;
        byte[] bArrCreateByteArray4 = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(parcel);
            int fieldId = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(header);
            if (fieldId != 1) {
                switch (fieldId) {
                    case 4:
                        parcelUuid = (android.os.ParcelUuid) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, header, android.os.ParcelUuid.CREATOR);
                        break;
                    case 5:
                        parcelUuid2 = (android.os.ParcelUuid) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, header, android.os.ParcelUuid.CREATOR);
                        break;
                    case 6:
                        parcelUuid3 = (android.os.ParcelUuid) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, header, android.os.ParcelUuid.CREATOR);
                        break;
                    case 7:
                        bArrCreateByteArray = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createByteArray(parcel, header);
                        break;
                    case 8:
                        bArrCreateByteArray2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createByteArray(parcel, header);
                        break;
                    case 9:
                        i2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(parcel, header);
                        break;
                    case 10:
                        bArrCreateByteArray3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createByteArray(parcel, header);
                        break;
                    case 11:
                        bArrCreateByteArray4 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createByteArray(parcel, header);
                        break;
                    default:
                        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(parcel, header);
                        break;
                }
            } else {
                i = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(parcel, header);
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new com.google.android.gms.internal.nearby.zzhg(i, parcelUuid, parcelUuid2, parcelUuid3, bArrCreateByteArray, bArrCreateByteArray2, i2, bArrCreateByteArray3, bArrCreateByteArray4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.nearby.zzhg[] newArray(int i) {
        return new com.google.android.gms.internal.nearby.zzhg[i];
    }
}
