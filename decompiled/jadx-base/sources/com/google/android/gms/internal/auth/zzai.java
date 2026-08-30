package com.google.android.gms.internal.auth;

/* JADX INFO: loaded from: classes4.dex */
public final class zzai implements android.os.Parcelable.Creator<com.google.android.gms.internal.auth.zzah> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.internal.auth.zzah[] newArray(int i) {
        return new com.google.android.gms.internal.auth.zzah[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.internal.auth.zzah createFromParcel(android.os.Parcel parcel) {
        int iValidateObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(parcel);
        int i = 0;
        java.lang.String strCreateString = null;
        android.app.PendingIntent pendingIntent = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(parcel);
            int fieldId = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(header);
            if (fieldId == 1) {
                i = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(parcel, header);
            } else if (fieldId == 2) {
                strCreateString = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, header);
            } else if (fieldId == 3) {
                pendingIntent = (android.app.PendingIntent) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, header, android.app.PendingIntent.CREATOR);
            } else {
                com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(parcel, header);
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new com.google.android.gms.internal.auth.zzah(i, strCreateString, pendingIntent);
    }
}
