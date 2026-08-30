package com.google.android.gms.location.places;

/* JADX INFO: loaded from: classes3.dex */
public final class zza implements android.os.Parcelable.Creator<com.google.android.gms.location.places.PlaceReport> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.location.places.PlaceReport createFromParcel(android.os.Parcel parcel) {
        int iValidateObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(parcel);
        int i = 0;
        java.lang.String strCreateString = null;
        java.lang.String strCreateString2 = null;
        java.lang.String strCreateString3 = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(parcel);
            int fieldId = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(header);
            if (fieldId == 1) {
                i = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(parcel, header);
            } else if (fieldId == 2) {
                strCreateString = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, header);
            } else if (fieldId == 3) {
                strCreateString2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, header);
            } else if (fieldId != 4) {
                com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(parcel, header);
            } else {
                strCreateString3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, header);
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new com.google.android.gms.location.places.PlaceReport(i, strCreateString, strCreateString2, strCreateString3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.location.places.PlaceReport[] newArray(int i) {
        return new com.google.android.gms.location.places.PlaceReport[i];
    }
}
