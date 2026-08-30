package com.google.android.gms.nearby.connection;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzr implements android.os.Parcelable.Creator<com.google.android.gms.nearby.connection.PayloadTransferUpdate> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ com.google.android.gms.nearby.connection.PayloadTransferUpdate createFromParcel(android.os.Parcel parcel) {
        int iValidateObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(parcel);
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        int i = 0;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(parcel);
            int fieldId = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(header);
            if (fieldId == 1) {
                j = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(parcel, header);
            } else if (fieldId == 2) {
                i = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(parcel, header);
            } else if (fieldId == 3) {
                j2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(parcel, header);
            } else if (fieldId != 4) {
                com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(parcel, header);
            } else {
                j3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(parcel, header);
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new com.google.android.gms.nearby.connection.PayloadTransferUpdate(j, i, j2, j3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ com.google.android.gms.nearby.connection.PayloadTransferUpdate[] newArray(int i) {
        return new com.google.android.gms.nearby.connection.PayloadTransferUpdate[i];
    }
}
