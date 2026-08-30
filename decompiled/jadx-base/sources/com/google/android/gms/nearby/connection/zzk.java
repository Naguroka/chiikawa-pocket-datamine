package com.google.android.gms.nearby.connection;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzk implements android.os.Parcelable.Creator<com.google.android.gms.nearby.connection.ConnectionOptions> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ com.google.android.gms.nearby.connection.ConnectionOptions createFromParcel(android.os.Parcel parcel) {
        int iValidateObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(parcel);
        boolean z = false;
        boolean z2 = false;
        boolean z3 = true;
        boolean z4 = true;
        boolean z5 = true;
        boolean z6 = true;
        boolean z7 = true;
        boolean z8 = true;
        boolean z9 = true;
        boolean z10 = true;
        boolean z11 = true;
        byte[] bArrCreateByteArray = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(header)) {
                case 1:
                    z = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 2:
                    z3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 3:
                    z4 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 4:
                    z5 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 5:
                    z6 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 6:
                    z7 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 7:
                    z8 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 8:
                    z9 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 9:
                    bArrCreateByteArray = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createByteArray(parcel, header);
                    break;
                case 10:
                    z2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 11:
                    z10 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 12:
                    z11 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(parcel, header);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(parcel, header);
                    break;
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new com.google.android.gms.nearby.connection.ConnectionOptions(z, z3, z4, z5, z6, z7, z8, z9, bArrCreateByteArray, z2, z10, z11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ com.google.android.gms.nearby.connection.ConnectionOptions[] newArray(int i) {
        return new com.google.android.gms.nearby.connection.ConnectionOptions[i];
    }
}
