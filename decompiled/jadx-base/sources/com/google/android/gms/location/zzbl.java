package com.google.android.gms.location;

/* JADX INFO: compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzbl implements android.os.Parcelable.Creator<com.google.android.gms.location.LocationSettingsRequest> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ com.google.android.gms.location.LocationSettingsRequest createFromParcel(android.os.Parcel parcel) {
        int iValidateObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(parcel);
        java.util.ArrayList arrayListCreateTypedList = null;
        boolean z = false;
        boolean z2 = false;
        com.google.android.gms.location.zzbj zzbjVar = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(parcel);
            int fieldId = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(header);
            if (fieldId == 1) {
                arrayListCreateTypedList = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createTypedList(parcel, header, com.google.android.gms.location.LocationRequest.CREATOR);
            } else if (fieldId == 2) {
                z = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(parcel, header);
            } else if (fieldId == 3) {
                z2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(parcel, header);
            } else if (fieldId != 5) {
                com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(parcel, header);
            } else {
                zzbjVar = (com.google.android.gms.location.zzbj) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, header, com.google.android.gms.location.zzbj.CREATOR);
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new com.google.android.gms.location.LocationSettingsRequest(arrayListCreateTypedList, z, z2, zzbjVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ com.google.android.gms.location.LocationSettingsRequest[] newArray(int i) {
        return new com.google.android.gms.location.LocationSettingsRequest[i];
    }
}
