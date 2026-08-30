package com.google.android.gms.drive;

/* JADX INFO: loaded from: classes4.dex */
public final class zzc implements android.os.Parcelable.Creator<com.google.android.gms.drive.Contents> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.drive.Contents[] newArray(int i) {
        return new com.google.android.gms.drive.Contents[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.drive.Contents createFromParcel(android.os.Parcel parcel) {
        int iValidateObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(parcel);
        android.os.ParcelFileDescriptor parcelFileDescriptor = null;
        com.google.android.gms.drive.DriveId driveId = null;
        java.lang.String strCreateString = null;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(parcel);
            int fieldId = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(header);
            if (fieldId == 2) {
                parcelFileDescriptor = (android.os.ParcelFileDescriptor) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, header, android.os.ParcelFileDescriptor.CREATOR);
            } else if (fieldId == 3) {
                i = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(parcel, header);
            } else if (fieldId == 4) {
                i2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(parcel, header);
            } else if (fieldId == 5) {
                driveId = (com.google.android.gms.drive.DriveId) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, header, com.google.android.gms.drive.DriveId.CREATOR);
            } else if (fieldId == 7) {
                z = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(parcel, header);
            } else if (fieldId == 8) {
                strCreateString = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, header);
            } else {
                com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(parcel, header);
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new com.google.android.gms.drive.Contents(parcelFileDescriptor, i, i2, driveId, z, strCreateString);
    }
}
