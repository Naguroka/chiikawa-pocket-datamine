package com.google.android.gms.drive.query.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class zzg implements android.os.Parcelable.Creator<com.google.android.gms.drive.query.internal.zzf> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.drive.query.internal.zzf[] newArray(int i) {
        return new com.google.android.gms.drive.query.internal.zzf[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.drive.query.internal.zzf createFromParcel(android.os.Parcel parcel) {
        int iValidateObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(parcel);
        java.lang.String strCreateString = null;
        boolean z = false;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(parcel);
            int fieldId = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(header);
            if (fieldId == 1) {
                strCreateString = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, header);
            } else if (fieldId == 2) {
                z = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(parcel, header);
            } else {
                com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(parcel, header);
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new com.google.android.gms.drive.query.internal.zzf(strCreateString, z);
    }
}
