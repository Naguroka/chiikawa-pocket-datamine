package com.google.android.gms.drive.query;

/* JADX INFO: loaded from: classes4.dex */
public final class zzb implements android.os.Parcelable.Creator<com.google.android.gms.drive.query.Query> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.drive.query.Query[] newArray(int i) {
        return new com.google.android.gms.drive.query.Query[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.drive.query.Query createFromParcel(android.os.Parcel parcel) {
        int iValidateObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(parcel);
        com.google.android.gms.drive.query.internal.zzr zzrVar = null;
        java.lang.String strCreateString = null;
        com.google.android.gms.drive.query.SortOrder sortOrder = null;
        java.util.ArrayList<java.lang.String> arrayListCreateStringList = null;
        java.util.ArrayList arrayListCreateTypedList = null;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(header)) {
                case 1:
                    zzrVar = (com.google.android.gms.drive.query.internal.zzr) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, header, com.google.android.gms.drive.query.internal.zzr.CREATOR);
                    break;
                case 2:
                default:
                    com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(parcel, header);
                    break;
                case 3:
                    strCreateString = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, header);
                    break;
                case 4:
                    sortOrder = (com.google.android.gms.drive.query.SortOrder) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, header, com.google.android.gms.drive.query.SortOrder.CREATOR);
                    break;
                case 5:
                    arrayListCreateStringList = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createStringList(parcel, header);
                    break;
                case 6:
                    z = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 7:
                    arrayListCreateTypedList = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createTypedList(parcel, header, com.google.android.gms.drive.DriveSpace.CREATOR);
                    break;
                case 8:
                    z2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(parcel, header);
                    break;
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new com.google.android.gms.drive.query.Query(zzrVar, strCreateString, sortOrder, arrayListCreateStringList, z, arrayListCreateTypedList, z2);
    }
}
