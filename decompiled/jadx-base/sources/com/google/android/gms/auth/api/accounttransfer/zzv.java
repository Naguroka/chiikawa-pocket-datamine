package com.google.android.gms.auth.api.accounttransfer;

/* JADX INFO: loaded from: classes4.dex */
public final class zzv implements android.os.Parcelable.Creator<com.google.android.gms.auth.api.accounttransfer.DeviceMetaData> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.auth.api.accounttransfer.DeviceMetaData[] newArray(int i) {
        return new com.google.android.gms.auth.api.accounttransfer.DeviceMetaData[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.auth.api.accounttransfer.DeviceMetaData createFromParcel(android.os.Parcel parcel) {
        int iValidateObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(parcel);
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        long j = 0;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(parcel);
            int fieldId = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(header);
            if (fieldId == 1) {
                i = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(parcel, header);
            } else if (fieldId == 2) {
                z = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(parcel, header);
            } else if (fieldId == 3) {
                j = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(parcel, header);
            } else if (fieldId == 4) {
                z2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(parcel, header);
            } else {
                com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(parcel, header);
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new com.google.android.gms.auth.api.accounttransfer.DeviceMetaData(i, z, j, z2);
    }
}
