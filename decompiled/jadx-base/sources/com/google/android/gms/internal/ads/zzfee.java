package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzfee implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        int iValidateObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(parcel);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        java.lang.String strCreateString = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(header)) {
                case 1:
                    i = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(parcel, header);
                    break;
                case 2:
                    i2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(parcel, header);
                    break;
                case 3:
                    i3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(parcel, header);
                    break;
                case 4:
                    i4 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(parcel, header);
                    break;
                case 5:
                    strCreateString = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, header);
                    break;
                case 6:
                    i5 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(parcel, header);
                    break;
                case 7:
                    i6 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(parcel, header);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(parcel, header);
                    break;
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new com.google.android.gms.internal.ads.zzfed(i, i2, i3, i4, strCreateString, i5, i6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        return new com.google.android.gms.internal.ads.zzfed[i];
    }
}
