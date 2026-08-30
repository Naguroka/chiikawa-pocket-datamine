package com.google.android.gms.auth;

/* JADX INFO: loaded from: classes4.dex */
public final class zzb implements android.os.Parcelable.Creator<com.google.android.gms.auth.AccountChangeEventsRequest> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.auth.AccountChangeEventsRequest[] newArray(int i) {
        return new com.google.android.gms.auth.AccountChangeEventsRequest[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.auth.AccountChangeEventsRequest createFromParcel(android.os.Parcel parcel) {
        int iValidateObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(parcel);
        int i = 0;
        java.lang.String strCreateString = null;
        android.accounts.Account account = null;
        int i2 = 0;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(parcel);
            int fieldId = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(header);
            if (fieldId == 1) {
                i = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(parcel, header);
            } else if (fieldId == 2) {
                i2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(parcel, header);
            } else if (fieldId == 3) {
                strCreateString = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, header);
            } else if (fieldId == 4) {
                account = (android.accounts.Account) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, header, android.accounts.Account.CREATOR);
            } else {
                com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(parcel, header);
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new com.google.android.gms.auth.AccountChangeEventsRequest(i, i2, strCreateString, account);
    }
}
