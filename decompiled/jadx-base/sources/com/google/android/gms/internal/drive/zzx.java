package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes3.dex */
public final class zzx implements android.os.Parcelable.Creator<com.google.android.gms.internal.drive.zzw> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.internal.drive.zzw[] newArray(int i) {
        return new com.google.android.gms.internal.drive.zzw[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.internal.drive.zzw createFromParcel(android.os.Parcel parcel) {
        int iValidateObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(parcel);
        java.lang.Integer integerObject = null;
        com.google.android.gms.drive.DriveId driveId = null;
        com.google.android.gms.drive.metadata.internal.MetadataBundle metadataBundle = null;
        com.google.android.gms.drive.Contents contents = null;
        java.lang.String strCreateString = null;
        boolean z = false;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(header)) {
                case 2:
                    driveId = (com.google.android.gms.drive.DriveId) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, header, com.google.android.gms.drive.DriveId.CREATOR);
                    break;
                case 3:
                    metadataBundle = (com.google.android.gms.drive.metadata.internal.MetadataBundle) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, header, com.google.android.gms.drive.metadata.internal.MetadataBundle.CREATOR);
                    break;
                case 4:
                    contents = (com.google.android.gms.drive.Contents) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, header, com.google.android.gms.drive.Contents.CREATOR);
                    break;
                case 5:
                    integerObject = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readIntegerObject(parcel, header);
                    break;
                case 6:
                    z = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 7:
                    strCreateString = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, header);
                    break;
                case 8:
                    i = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(parcel, header);
                    break;
                case 9:
                    i2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(parcel, header);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(parcel, header);
                    break;
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new com.google.android.gms.internal.drive.zzw(driveId, metadataBundle, contents, integerObject.intValue(), z, strCreateString, i, i2);
    }
}
