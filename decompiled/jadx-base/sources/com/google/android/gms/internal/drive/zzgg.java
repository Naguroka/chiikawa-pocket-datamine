package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgg implements android.os.Parcelable.Creator<com.google.android.gms.internal.drive.zzgf> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.internal.drive.zzgf[] newArray(int i) {
        return new com.google.android.gms.internal.drive.zzgf[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.internal.drive.zzgf createFromParcel(android.os.Parcel parcel) {
        int iValidateObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(parcel);
        android.os.ParcelFileDescriptor parcelFileDescriptor = null;
        android.os.IBinder iBinder = null;
        java.lang.String strCreateString = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(parcel);
            int fieldId = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(header);
            if (fieldId == 2) {
                parcelFileDescriptor = (android.os.ParcelFileDescriptor) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, header, android.os.ParcelFileDescriptor.CREATOR);
            } else if (fieldId == 3) {
                iBinder = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readIBinder(parcel, header);
            } else if (fieldId == 4) {
                strCreateString = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, header);
            } else {
                com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(parcel, header);
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new com.google.android.gms.internal.drive.zzgf(parcelFileDescriptor, iBinder, strCreateString);
    }
}
