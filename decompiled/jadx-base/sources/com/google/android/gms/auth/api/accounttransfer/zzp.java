package com.google.android.gms.auth.api.accounttransfer;

/* JADX INFO: loaded from: classes4.dex */
public final class zzp implements android.os.Parcelable.Creator<com.google.android.gms.auth.api.accounttransfer.zzo> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.auth.api.accounttransfer.zzo[] newArray(int i) {
        return new com.google.android.gms.auth.api.accounttransfer.zzo[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.auth.api.accounttransfer.zzo createFromParcel(android.os.Parcel parcel) {
        int iValidateObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(parcel);
        int i = 0;
        java.util.ArrayList<java.lang.String> arrayListCreateStringList = null;
        java.util.ArrayList<java.lang.String> arrayListCreateStringList2 = null;
        java.util.ArrayList<java.lang.String> arrayListCreateStringList3 = null;
        java.util.ArrayList<java.lang.String> arrayListCreateStringList4 = null;
        java.util.ArrayList<java.lang.String> arrayListCreateStringList5 = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(header)) {
                case 1:
                    i = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(parcel, header);
                    break;
                case 2:
                    arrayListCreateStringList = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createStringList(parcel, header);
                    break;
                case 3:
                    arrayListCreateStringList2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createStringList(parcel, header);
                    break;
                case 4:
                    arrayListCreateStringList3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createStringList(parcel, header);
                    break;
                case 5:
                    arrayListCreateStringList4 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createStringList(parcel, header);
                    break;
                case 6:
                    arrayListCreateStringList5 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createStringList(parcel, header);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(parcel, header);
                    break;
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new com.google.android.gms.auth.api.accounttransfer.zzo(i, arrayListCreateStringList, arrayListCreateStringList2, arrayListCreateStringList3, arrayListCreateStringList4, arrayListCreateStringList5);
    }
}
