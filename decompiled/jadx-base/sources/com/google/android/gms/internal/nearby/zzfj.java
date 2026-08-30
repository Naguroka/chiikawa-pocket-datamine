package com.google.android.gms.internal.nearby;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzfj implements android.os.Parcelable.Creator<com.google.android.gms.internal.nearby.zzfi> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.nearby.zzfi createFromParcel(android.os.Parcel parcel) {
        int iValidateObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(parcel);
        java.lang.String strCreateString = null;
        java.lang.String strCreateString2 = null;
        java.lang.String strCreateString3 = null;
        android.bluetooth.BluetoothDevice bluetoothDevice = null;
        byte[] bArrCreateByteArray = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(parcel);
            int fieldId = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(header);
            if (fieldId == 1) {
                strCreateString = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, header);
            } else if (fieldId == 2) {
                strCreateString2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, header);
            } else if (fieldId == 3) {
                strCreateString3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, header);
            } else if (fieldId == 4) {
                bluetoothDevice = (android.bluetooth.BluetoothDevice) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, header, android.bluetooth.BluetoothDevice.CREATOR);
            } else if (fieldId != 5) {
                com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(parcel, header);
            } else {
                bArrCreateByteArray = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createByteArray(parcel, header);
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new com.google.android.gms.internal.nearby.zzfi(strCreateString, strCreateString2, strCreateString3, bluetoothDevice, bArrCreateByteArray);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.nearby.zzfi[] newArray(int i) {
        return new com.google.android.gms.internal.nearby.zzfi[i];
    }
}
