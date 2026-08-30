package com.google.android.gms.auth.api.signin;

/* JADX INFO: loaded from: classes4.dex */
public final class zzd implements android.os.Parcelable.Creator<com.google.android.gms.auth.api.signin.SignInAccount> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.auth.api.signin.SignInAccount[] newArray(int i) {
        return new com.google.android.gms.auth.api.signin.SignInAccount[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.auth.api.signin.SignInAccount createFromParcel(android.os.Parcel parcel) {
        int iValidateObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(parcel);
        java.lang.String strCreateString = "";
        com.google.android.gms.auth.api.signin.GoogleSignInAccount googleSignInAccount = null;
        java.lang.String strCreateString2 = "";
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(parcel);
            int fieldId = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(header);
            if (fieldId == 4) {
                strCreateString = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, header);
            } else if (fieldId == 7) {
                googleSignInAccount = (com.google.android.gms.auth.api.signin.GoogleSignInAccount) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, header, com.google.android.gms.auth.api.signin.GoogleSignInAccount.CREATOR);
            } else if (fieldId == 8) {
                strCreateString2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, header);
            } else {
                com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(parcel, header);
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new com.google.android.gms.auth.api.signin.SignInAccount(strCreateString, googleSignInAccount, strCreateString2);
    }
}
