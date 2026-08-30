package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes3.dex */
public final class zzv implements android.os.Parcelable.Creator<com.google.android.gms.internal.drive.zzu> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.internal.drive.zzu[] newArray(int i) {
        return new com.google.android.gms.internal.drive.zzu[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.internal.drive.zzu createFromParcel(android.os.Parcel parcel) {
        int iValidateObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(parcel);
        com.google.android.gms.drive.metadata.internal.MetadataBundle metadataBundle = null;
        java.lang.String strCreateString = null;
        com.google.android.gms.drive.DriveId driveId = null;
        java.lang.Integer integerObject = null;
        int i = 0;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(parcel);
            int fieldId = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(header);
            if (fieldId == 2) {
                metadataBundle = (com.google.android.gms.drive.metadata.internal.MetadataBundle) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, header, com.google.android.gms.drive.metadata.internal.MetadataBundle.CREATOR);
            } else if (fieldId == 3) {
                i = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(parcel, header);
            } else if (fieldId == 4) {
                strCreateString = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, header);
            } else if (fieldId == 5) {
                driveId = (com.google.android.gms.drive.DriveId) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, header, com.google.android.gms.drive.DriveId.CREATOR);
            } else if (fieldId == 6) {
                integerObject = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readIntegerObject(parcel, header);
            } else {
                com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(parcel, header);
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new com.google.android.gms.internal.drive.zzu(metadataBundle, i, strCreateString, driveId, integerObject);
    }
}
