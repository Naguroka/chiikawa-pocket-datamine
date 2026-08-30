package com.google.android.gms.internal.p000authapi;

/* JADX INFO: loaded from: classes4.dex */
public final class zzt implements android.os.Parcelable.Creator<com.google.android.gms.internal.p000authapi.zzs> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.internal.p000authapi.zzs[] newArray(int i) {
        return new com.google.android.gms.internal.p000authapi.zzs[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.internal.p000authapi.zzs createFromParcel(android.os.Parcel parcel) {
        int iValidateObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(parcel);
        com.google.android.gms.auth.api.credentials.Credential credential = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(parcel);
            if (com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(header) == 1) {
                credential = (com.google.android.gms.auth.api.credentials.Credential) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, header, com.google.android.gms.auth.api.credentials.Credential.CREATOR);
            } else {
                com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(parcel, header);
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new com.google.android.gms.internal.p000authapi.zzs(credential);
    }
}
