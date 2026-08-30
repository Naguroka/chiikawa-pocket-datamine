package com.google.android.gms.nearby.messages;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzf implements android.os.Parcelable.Creator<com.google.android.gms.nearby.messages.Strategy> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ com.google.android.gms.nearby.messages.Strategy createFromParcel(android.os.Parcel parcel) {
        int iValidateObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(parcel);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        boolean z = false;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(parcel);
            int fieldId = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(header);
            if (fieldId != 1000) {
                switch (fieldId) {
                    case 1:
                        i2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(parcel, header);
                        break;
                    case 2:
                        i3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(parcel, header);
                        break;
                    case 3:
                        i4 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(parcel, header);
                        break;
                    case 4:
                        z = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(parcel, header);
                        break;
                    case 5:
                        i5 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(parcel, header);
                        break;
                    case 6:
                        i6 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(parcel, header);
                        break;
                    case 7:
                        i7 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(parcel, header);
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
        return new com.google.android.gms.nearby.messages.Strategy(i, i2, i3, i4, z, i5, i6, i7);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ com.google.android.gms.nearby.messages.Strategy[] newArray(int i) {
        return new com.google.android.gms.nearby.messages.Strategy[i];
    }
}
