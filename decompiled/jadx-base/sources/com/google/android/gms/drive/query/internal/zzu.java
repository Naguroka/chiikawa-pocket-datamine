package com.google.android.gms.drive.query.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class zzu implements android.os.Parcelable.Creator<com.google.android.gms.drive.query.internal.zzt> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.drive.query.internal.zzt[] newArray(int i) {
        return new com.google.android.gms.drive.query.internal.zzt[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.drive.query.internal.zzt createFromParcel(android.os.Parcel parcel) {
        int iValidateObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(parcel);
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(parcel);
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(header);
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(parcel, header);
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new com.google.android.gms.drive.query.internal.zzt();
    }
}
