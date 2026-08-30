package com.google.android.gms.auth.api.accounttransfer;

/* JADX INFO: loaded from: classes4.dex */
public final class zzu implements android.os.Parcelable.Creator<com.google.android.gms.auth.api.accounttransfer.zzt> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.auth.api.accounttransfer.zzt[] newArray(int i) {
        return new com.google.android.gms.auth.api.accounttransfer.zzt[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.auth.api.accounttransfer.zzt createFromParcel(android.os.Parcel parcel) {
        int iValidateObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(parcel);
        java.util.HashSet hashSet = new java.util.HashSet();
        int i = 0;
        java.lang.String strCreateString = null;
        byte[] bArrCreateByteArray = null;
        android.app.PendingIntent pendingIntent = null;
        com.google.android.gms.auth.api.accounttransfer.DeviceMetaData deviceMetaData = null;
        int i2 = 0;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(header)) {
                case 1:
                    i2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(parcel, header);
                    hashSet.add(1);
                    break;
                case 2:
                    strCreateString = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, header);
                    hashSet.add(2);
                    break;
                case 3:
                    i = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(parcel, header);
                    hashSet.add(3);
                    break;
                case 4:
                    bArrCreateByteArray = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createByteArray(parcel, header);
                    hashSet.add(4);
                    break;
                case 5:
                    pendingIntent = (android.app.PendingIntent) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, header, android.app.PendingIntent.CREATOR);
                    hashSet.add(5);
                    break;
                case 6:
                    deviceMetaData = (com.google.android.gms.auth.api.accounttransfer.DeviceMetaData) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, header, com.google.android.gms.auth.api.accounttransfer.DeviceMetaData.CREATOR);
                    hashSet.add(6);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(parcel, header);
                    break;
            }
        }
        if (parcel.dataPosition() != iValidateObjectHeader) {
            throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException(new java.lang.StringBuilder(37).append("Overread allowed size end=").append(iValidateObjectHeader).toString(), parcel);
        }
        return new com.google.android.gms.auth.api.accounttransfer.zzt(hashSet, i2, strCreateString, i, bArrCreateByteArray, pendingIntent, deviceMetaData);
    }
}
