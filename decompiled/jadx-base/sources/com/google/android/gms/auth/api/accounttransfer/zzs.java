package com.google.android.gms.auth.api.accounttransfer;

/* JADX INFO: loaded from: classes4.dex */
public final class zzs implements android.os.Parcelable.Creator<com.google.android.gms.auth.api.accounttransfer.zzr> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.auth.api.accounttransfer.zzr[] newArray(int i) {
        return new com.google.android.gms.auth.api.accounttransfer.zzr[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.auth.api.accounttransfer.zzr createFromParcel(android.os.Parcel parcel) {
        int iValidateObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(parcel);
        java.util.HashSet hashSet = new java.util.HashSet();
        com.google.android.gms.auth.api.accounttransfer.zzt zztVar = null;
        java.lang.String strCreateString = null;
        java.lang.String strCreateString2 = null;
        java.lang.String strCreateString3 = null;
        int i = 0;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(parcel);
            int fieldId = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(header);
            if (fieldId == 1) {
                i = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(parcel, header);
                hashSet.add(1);
            } else if (fieldId == 2) {
                zztVar = (com.google.android.gms.auth.api.accounttransfer.zzt) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, header, com.google.android.gms.auth.api.accounttransfer.zzt.CREATOR);
                hashSet.add(2);
            } else if (fieldId == 3) {
                strCreateString = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, header);
                hashSet.add(3);
            } else if (fieldId == 4) {
                strCreateString2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, header);
                hashSet.add(4);
            } else if (fieldId == 5) {
                strCreateString3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, header);
                hashSet.add(5);
            } else {
                com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(parcel, header);
            }
        }
        if (parcel.dataPosition() != iValidateObjectHeader) {
            throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException(new java.lang.StringBuilder(37).append("Overread allowed size end=").append(iValidateObjectHeader).toString(), parcel);
        }
        return new com.google.android.gms.auth.api.accounttransfer.zzr(hashSet, i, zztVar, strCreateString, strCreateString2, strCreateString3);
    }
}
