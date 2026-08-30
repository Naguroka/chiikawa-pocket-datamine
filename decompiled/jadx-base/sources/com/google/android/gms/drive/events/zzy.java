package com.google.android.gms.drive.events;

/* JADX INFO: loaded from: classes4.dex */
public final class zzy implements android.os.Parcelable.Creator<com.google.android.gms.drive.events.zzx> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.drive.events.zzx[] newArray(int i) {
        return new com.google.android.gms.drive.events.zzx[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.drive.events.zzx createFromParcel(android.os.Parcel parcel) {
        int iValidateObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(parcel);
        java.util.ArrayList arrayListCreateTypedList = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(parcel);
            if (com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(header) == 2) {
                arrayListCreateTypedList = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createTypedList(parcel, header, com.google.android.gms.drive.DriveSpace.CREATOR);
            } else {
                com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(parcel, header);
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new com.google.android.gms.drive.events.zzx(arrayListCreateTypedList);
    }
}
