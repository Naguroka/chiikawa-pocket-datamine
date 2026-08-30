package com.google.android.gms.internal.location;

/* JADX INFO: compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzbf implements android.os.Parcelable.Creator<com.google.android.gms.internal.location.zzbe> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.location.zzbe createFromParcel(android.os.Parcel parcel) {
        int iValidateObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(parcel);
        java.lang.String strCreateString = null;
        int i = 0;
        short s = 0;
        int i2 = 0;
        double d = 0.0d;
        double d2 = 0.0d;
        float f = 0.0f;
        long j = 0;
        int i3 = -1;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(header)) {
                case 1:
                    strCreateString = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, header);
                    break;
                case 2:
                    j = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(parcel, header);
                    break;
                case 3:
                    s = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readShort(parcel, header);
                    break;
                case 4:
                    d = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readDouble(parcel, header);
                    break;
                case 5:
                    d2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readDouble(parcel, header);
                    break;
                case 6:
                    f = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readFloat(parcel, header);
                    break;
                case 7:
                    i = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(parcel, header);
                    break;
                case 8:
                    i2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(parcel, header);
                    break;
                case 9:
                    i3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(parcel, header);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(parcel, header);
                    break;
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new com.google.android.gms.internal.location.zzbe(strCreateString, i, s, d, d2, f, j, i2, i3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.location.zzbe[] newArray(int i) {
        return new com.google.android.gms.internal.location.zzbe[i];
    }
}
