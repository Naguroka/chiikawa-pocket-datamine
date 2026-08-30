package com.google.android.gms.drive.query.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class zzc implements android.os.Parcelable.Creator<com.google.android.gms.drive.query.internal.zzb> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.drive.query.internal.zzb[] newArray(int i) {
        return new com.google.android.gms.drive.query.internal.zzb[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.drive.query.internal.zzb createFromParcel(android.os.Parcel parcel) {
        int iValidateObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(parcel);
        com.google.android.gms.drive.query.internal.zzx zzxVar = null;
        com.google.android.gms.drive.metadata.internal.MetadataBundle metadataBundle = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(parcel);
            int fieldId = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(header);
            if (fieldId == 1) {
                zzxVar = (com.google.android.gms.drive.query.internal.zzx) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, header, com.google.android.gms.drive.query.internal.zzx.CREATOR);
            } else if (fieldId == 2) {
                metadataBundle = (com.google.android.gms.drive.metadata.internal.MetadataBundle) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, header, com.google.android.gms.drive.metadata.internal.MetadataBundle.CREATOR);
            } else {
                com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(parcel, header);
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new com.google.android.gms.drive.query.internal.zzb(zzxVar, metadataBundle);
    }
}
