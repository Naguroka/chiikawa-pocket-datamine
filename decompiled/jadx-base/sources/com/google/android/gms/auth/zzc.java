package com.google.android.gms.auth;

/* JADX INFO: loaded from: classes4.dex */
public final class zzc implements android.os.Parcelable.Creator<com.google.android.gms.auth.AccountChangeEventsResponse> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.auth.AccountChangeEventsResponse[] newArray(int i) {
        return new com.google.android.gms.auth.AccountChangeEventsResponse[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.auth.AccountChangeEventsResponse createFromParcel(android.os.Parcel parcel) {
        int iValidateObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(parcel);
        int i = 0;
        java.util.ArrayList arrayListCreateTypedList = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(parcel);
            int fieldId = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(header);
            if (fieldId == 1) {
                i = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(parcel, header);
            } else if (fieldId == 2) {
                arrayListCreateTypedList = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createTypedList(parcel, header, com.google.android.gms.auth.AccountChangeEvent.CREATOR);
            } else {
                com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(parcel, header);
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new com.google.android.gms.auth.AccountChangeEventsResponse(i, arrayListCreateTypedList);
    }
}
