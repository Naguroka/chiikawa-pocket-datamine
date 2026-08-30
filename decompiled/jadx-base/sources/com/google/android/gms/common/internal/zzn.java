package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzn implements android.os.Parcelable.Creator {
    static void zza(com.google.android.gms.common.internal.GetServiceRequest getServiceRequest, android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, getServiceRequest.zzc);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 2, getServiceRequest.zzd);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 3, getServiceRequest.zze);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 4, getServiceRequest.zzf, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(parcel, 5, getServiceRequest.zzg, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedArray(parcel, 6, getServiceRequest.zzh, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBundle(parcel, 7, getServiceRequest.zzi, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 8, getServiceRequest.zzj, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedArray(parcel, 10, getServiceRequest.zzk, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedArray(parcel, 11, getServiceRequest.zzl, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 12, getServiceRequest.zzm);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 13, getServiceRequest.zzn);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 14, getServiceRequest.zzo);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 15, getServiceRequest.getAttributionTag(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        int iValidateObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(parcel);
        com.google.android.gms.common.api.Scope[] scopeArr = com.google.android.gms.common.internal.GetServiceRequest.zza;
        android.os.Bundle bundle = new android.os.Bundle();
        com.google.android.gms.common.Feature[] featureArr = com.google.android.gms.common.internal.GetServiceRequest.zzb;
        com.google.android.gms.common.Feature[] featureArr2 = featureArr;
        java.lang.String strCreateString = null;
        android.os.IBinder iBinder = null;
        android.accounts.Account account = null;
        java.lang.String strCreateString2 = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        int i4 = 0;
        boolean z2 = false;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(header)) {
                case 1:
                    i = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(parcel, header);
                    break;
                case 2:
                    i2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(parcel, header);
                    break;
                case 3:
                    i3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(parcel, header);
                    break;
                case 4:
                    strCreateString = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, header);
                    break;
                case 5:
                    iBinder = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readIBinder(parcel, header);
                    break;
                case 6:
                    scopeArr = (com.google.android.gms.common.api.Scope[]) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createTypedArray(parcel, header, com.google.android.gms.common.api.Scope.CREATOR);
                    break;
                case 7:
                    bundle = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createBundle(parcel, header);
                    break;
                case 8:
                    account = (android.accounts.Account) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, header, android.accounts.Account.CREATOR);
                    break;
                case 9:
                default:
                    com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(parcel, header);
                    break;
                case 10:
                    featureArr = (com.google.android.gms.common.Feature[]) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createTypedArray(parcel, header, com.google.android.gms.common.Feature.CREATOR);
                    break;
                case 11:
                    featureArr2 = (com.google.android.gms.common.Feature[]) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createTypedArray(parcel, header, com.google.android.gms.common.Feature.CREATOR);
                    break;
                case 12:
                    z = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 13:
                    i4 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(parcel, header);
                    break;
                case 14:
                    z2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 15:
                    strCreateString2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, header);
                    break;
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new com.google.android.gms.common.internal.GetServiceRequest(i, i2, i3, strCreateString, iBinder, scopeArr, bundle, account, featureArr, featureArr2, z, i4, z2, strCreateString2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        return new com.google.android.gms.common.internal.GetServiceRequest[i];
    }
}
