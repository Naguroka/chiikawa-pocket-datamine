package com.google.android.gms.auth.api.credentials;

/* JADX INFO: loaded from: classes4.dex */
public final class zzj implements android.os.Parcelable.Creator<com.google.android.gms.auth.api.credentials.HintRequest> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.auth.api.credentials.HintRequest[] newArray(int i) {
        return new com.google.android.gms.auth.api.credentials.HintRequest[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.auth.api.credentials.HintRequest createFromParcel(android.os.Parcel parcel) {
        int iValidateObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(parcel);
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        com.google.android.gms.auth.api.credentials.CredentialPickerConfig credentialPickerConfig = null;
        java.lang.String[] strArrCreateStringArray = null;
        java.lang.String strCreateString = null;
        java.lang.String strCreateString2 = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(parcel);
            int fieldId = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(header);
            if (fieldId != 1000) {
                switch (fieldId) {
                    case 1:
                        credentialPickerConfig = (com.google.android.gms.auth.api.credentials.CredentialPickerConfig) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, header, com.google.android.gms.auth.api.credentials.CredentialPickerConfig.CREATOR);
                        break;
                    case 2:
                        z = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(parcel, header);
                        break;
                    case 3:
                        z2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(parcel, header);
                        break;
                    case 4:
                        strArrCreateStringArray = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createStringArray(parcel, header);
                        break;
                    case 5:
                        z3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(parcel, header);
                        break;
                    case 6:
                        strCreateString = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, header);
                        break;
                    case 7:
                        strCreateString2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, header);
                        break;
                    default:
                        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(parcel, header);
                        break;
                }
            } else {
                i = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(parcel, header);
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new com.google.android.gms.auth.api.credentials.HintRequest(i, credentialPickerConfig, z, z2, strArrCreateStringArray, z3, strCreateString, strCreateString2);
    }
}
