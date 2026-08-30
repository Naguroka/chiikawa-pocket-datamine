package com.google.android.gms.auth.api.signin;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zab implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        int iValidateObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(parcel);
        java.lang.String strCreateString = null;
        java.lang.String strCreateString2 = null;
        java.lang.String strCreateString3 = null;
        java.lang.String strCreateString4 = null;
        android.net.Uri uri = null;
        java.lang.String strCreateString5 = null;
        java.lang.String strCreateString6 = null;
        java.util.ArrayList arrayListCreateTypedList = null;
        java.lang.String strCreateString7 = null;
        java.lang.String strCreateString8 = null;
        long j = 0;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(header)) {
                case 2:
                    strCreateString = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, header);
                    break;
                case 3:
                    strCreateString2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, header);
                    break;
                case 4:
                    strCreateString3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, header);
                    break;
                case 5:
                    strCreateString4 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, header);
                    break;
                case 6:
                    uri = (android.net.Uri) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, header, android.net.Uri.CREATOR);
                    break;
                case 7:
                    strCreateString5 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, header);
                    break;
                case 8:
                    j = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(parcel, header);
                    break;
                case 9:
                    strCreateString6 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, header);
                    break;
                case 10:
                    arrayListCreateTypedList = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createTypedList(parcel, header, com.google.android.gms.common.api.Scope.CREATOR);
                    break;
                case 11:
                    strCreateString7 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, header);
                    break;
                case 12:
                    strCreateString8 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, header);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(parcel, header);
                    break;
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new com.google.android.gms.auth.api.signin.GoogleSignInAccount(strCreateString, strCreateString2, strCreateString3, strCreateString4, uri, strCreateString5, j, strCreateString6, arrayListCreateTypedList, strCreateString7, strCreateString8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        return new com.google.android.gms.auth.api.signin.GoogleSignInAccount[i];
    }
}
