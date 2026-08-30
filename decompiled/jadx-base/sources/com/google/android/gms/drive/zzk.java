package com.google.android.gms.drive;

/* JADX INFO: loaded from: classes4.dex */
public final class zzk implements android.os.Parcelable.Creator<com.google.android.gms.drive.DriveId> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.drive.DriveId[] newArray(int i) {
        return new com.google.android.gms.drive.DriveId[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.drive.DriveId createFromParcel(android.os.Parcel parcel) {
        int iValidateObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(parcel);
        java.lang.String strCreateString = null;
        long j = 0;
        long j2 = 0;
        int i = -1;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(parcel);
            int fieldId = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(header);
            if (fieldId == 2) {
                strCreateString = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, header);
            } else if (fieldId == 3) {
                j = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(parcel, header);
            } else if (fieldId == 4) {
                j2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(parcel, header);
            } else if (fieldId == 5) {
                i = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(parcel, header);
            } else {
                com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(parcel, header);
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new com.google.android.gms.drive.DriveId(strCreateString, j, j2, i);
    }
}
