package com.google.android.gms.auth.api.proxy;

/* JADX INFO: loaded from: classes4.dex */
public final class zzb implements android.os.Parcelable.Creator<com.google.android.gms.auth.api.proxy.ProxyResponse> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.auth.api.proxy.ProxyResponse[] newArray(int i) {
        return new com.google.android.gms.auth.api.proxy.ProxyResponse[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.auth.api.proxy.ProxyResponse createFromParcel(android.os.Parcel parcel) {
        int iValidateObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(parcel);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        android.app.PendingIntent pendingIntent = null;
        android.os.Bundle bundleCreateBundle = null;
        byte[] bArrCreateByteArray = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(parcel);
            int fieldId = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(header);
            if (fieldId == 1) {
                i2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(parcel, header);
            } else if (fieldId == 2) {
                pendingIntent = (android.app.PendingIntent) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, header, android.app.PendingIntent.CREATOR);
            } else if (fieldId == 3) {
                i3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(parcel, header);
            } else if (fieldId == 4) {
                bundleCreateBundle = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createBundle(parcel, header);
            } else if (fieldId == 5) {
                bArrCreateByteArray = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createByteArray(parcel, header);
            } else if (fieldId == 1000) {
                i = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(parcel, header);
            } else {
                com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(parcel, header);
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new com.google.android.gms.auth.api.proxy.ProxyResponse(i, i2, pendingIntent, i3, bundleCreateBundle, bArrCreateByteArray);
    }
}
