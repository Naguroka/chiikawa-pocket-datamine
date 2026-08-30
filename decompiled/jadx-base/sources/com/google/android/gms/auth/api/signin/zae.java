package com.google.android.gms.auth.api.signin;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zae implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        int iValidateObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(parcel);
        java.util.ArrayList arrayListCreateTypedList = null;
        android.accounts.Account account = null;
        java.lang.String strCreateString = null;
        java.lang.String strCreateString2 = null;
        java.util.ArrayList arrayListCreateTypedList2 = null;
        java.lang.String strCreateString3 = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(header)) {
                case 1:
                    i = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(parcel, header);
                    break;
                case 2:
                    arrayListCreateTypedList = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createTypedList(parcel, header, com.google.android.gms.common.api.Scope.CREATOR);
                    break;
                case 3:
                    account = (android.accounts.Account) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, header, android.accounts.Account.CREATOR);
                    break;
                case 4:
                    z = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 5:
                    z2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 6:
                    z3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 7:
                    strCreateString = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, header);
                    break;
                case 8:
                    strCreateString2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, header);
                    break;
                case 9:
                    arrayListCreateTypedList2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createTypedList(parcel, header, com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable.CREATOR);
                    break;
                case 10:
                    strCreateString3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, header);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(parcel, header);
                    break;
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new com.google.android.gms.auth.api.signin.GoogleSignInOptions(i, arrayListCreateTypedList, account, z, z2, z3, strCreateString, strCreateString2, arrayListCreateTypedList2, strCreateString3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        return new com.google.android.gms.auth.api.signin.GoogleSignInOptions[i];
    }
}
