package com.google.android.gms.internal.nearby;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzgr implements android.os.Parcelable.Creator<com.google.android.gms.internal.nearby.zzgq> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.nearby.zzgq createFromParcel(android.os.Parcel parcel) {
        int iValidateObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(parcel);
        android.os.IBinder iBinder = null;
        com.google.android.gms.internal.nearby.zzgd zzgdVar = null;
        boolean z = false;
        java.lang.String[] strArrCreateStringArray = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(parcel);
            int fieldId = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(header);
            if (fieldId == 1) {
                iBinder = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readIBinder(parcel, header);
            } else if (fieldId == 2) {
                strArrCreateStringArray = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createStringArray(parcel, header);
            } else if (fieldId == 3) {
                zzgdVar = (com.google.android.gms.internal.nearby.zzgd) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, header, com.google.android.gms.internal.nearby.zzgd.CREATOR);
            } else if (fieldId != 4) {
                com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(parcel, header);
            } else {
                z = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(parcel, header);
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new com.google.android.gms.internal.nearby.zzgq(iBinder, strArrCreateStringArray, zzgdVar, z);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.nearby.zzgq[] newArray(int i) {
        return new com.google.android.gms.internal.nearby.zzgq[i];
    }
}
