package com.google.android.gms.drive.query.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class zzh implements android.os.Parcelable.Creator<com.google.android.gms.drive.query.internal.FilterHolder> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.drive.query.internal.FilterHolder[] newArray(int i) {
        return new com.google.android.gms.drive.query.internal.FilterHolder[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.drive.query.internal.FilterHolder createFromParcel(android.os.Parcel parcel) {
        int iValidateObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(parcel);
        com.google.android.gms.drive.query.internal.zzb zzbVar = null;
        com.google.android.gms.drive.query.internal.zzd zzdVar = null;
        com.google.android.gms.drive.query.internal.zzr zzrVar = null;
        com.google.android.gms.drive.query.internal.zzv zzvVar = null;
        com.google.android.gms.drive.query.internal.zzp zzpVar = null;
        com.google.android.gms.drive.query.internal.zzt zztVar = null;
        com.google.android.gms.drive.query.internal.zzn zznVar = null;
        com.google.android.gms.drive.query.internal.zzl zzlVar = null;
        com.google.android.gms.drive.query.internal.zzz zzzVar = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(header)) {
                case 1:
                    zzbVar = (com.google.android.gms.drive.query.internal.zzb) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, header, com.google.android.gms.drive.query.internal.zzb.CREATOR);
                    break;
                case 2:
                    zzdVar = (com.google.android.gms.drive.query.internal.zzd) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, header, com.google.android.gms.drive.query.internal.zzd.CREATOR);
                    break;
                case 3:
                    zzrVar = (com.google.android.gms.drive.query.internal.zzr) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, header, com.google.android.gms.drive.query.internal.zzr.CREATOR);
                    break;
                case 4:
                    zzvVar = (com.google.android.gms.drive.query.internal.zzv) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, header, com.google.android.gms.drive.query.internal.zzv.CREATOR);
                    break;
                case 5:
                    zzpVar = (com.google.android.gms.drive.query.internal.zzp) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, header, com.google.android.gms.drive.query.internal.zzp.CREATOR);
                    break;
                case 6:
                    zztVar = (com.google.android.gms.drive.query.internal.zzt) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, header, com.google.android.gms.drive.query.internal.zzt.CREATOR);
                    break;
                case 7:
                    zznVar = (com.google.android.gms.drive.query.internal.zzn) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, header, com.google.android.gms.drive.query.internal.zzn.CREATOR);
                    break;
                case 8:
                    zzlVar = (com.google.android.gms.drive.query.internal.zzl) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, header, com.google.android.gms.drive.query.internal.zzl.CREATOR);
                    break;
                case 9:
                    zzzVar = (com.google.android.gms.drive.query.internal.zzz) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, header, com.google.android.gms.drive.query.internal.zzz.CREATOR);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(parcel, header);
                    break;
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new com.google.android.gms.drive.query.internal.FilterHolder(zzbVar, zzdVar, zzrVar, zzvVar, zzpVar, zztVar, zznVar, zzlVar, zzzVar);
    }
}
