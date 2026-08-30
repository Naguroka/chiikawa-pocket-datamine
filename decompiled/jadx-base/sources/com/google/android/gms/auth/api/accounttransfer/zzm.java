package com.google.android.gms.auth.api.accounttransfer;

/* JADX INFO: loaded from: classes4.dex */
public final class zzm implements android.os.Parcelable.Creator<com.google.android.gms.auth.api.accounttransfer.zzl> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.auth.api.accounttransfer.zzl[] newArray(int i) {
        return new com.google.android.gms.auth.api.accounttransfer.zzl[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.auth.api.accounttransfer.zzl createFromParcel(android.os.Parcel parcel) {
        int iValidateObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(parcel);
        java.util.HashSet hashSet = new java.util.HashSet();
        int i = 0;
        java.util.ArrayList arrayListCreateTypedList = null;
        com.google.android.gms.auth.api.accounttransfer.zzo zzoVar = null;
        int i2 = 0;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(parcel);
            int fieldId = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(header);
            if (fieldId == 1) {
                i2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(parcel, header);
                hashSet.add(1);
            } else if (fieldId == 2) {
                arrayListCreateTypedList = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createTypedList(parcel, header, com.google.android.gms.auth.api.accounttransfer.zzr.CREATOR);
                hashSet.add(2);
            } else if (fieldId == 3) {
                i = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(parcel, header);
                hashSet.add(3);
            } else if (fieldId == 4) {
                zzoVar = (com.google.android.gms.auth.api.accounttransfer.zzo) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, header, com.google.android.gms.auth.api.accounttransfer.zzo.CREATOR);
                hashSet.add(4);
            } else {
                com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(parcel, header);
            }
        }
        if (parcel.dataPosition() != iValidateObjectHeader) {
            throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException(new java.lang.StringBuilder(37).append("Overread allowed size end=").append(iValidateObjectHeader).toString(), parcel);
        }
        return new com.google.android.gms.auth.api.accounttransfer.zzl(hashSet, i2, arrayListCreateTypedList, i, zzoVar);
    }
}
