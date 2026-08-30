package com.google.android.gms.nearby.messages.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzch implements android.os.Parcelable.Creator<com.google.android.gms.nearby.messages.internal.Update> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ com.google.android.gms.nearby.messages.internal.Update createFromParcel(android.os.Parcel parcel) {
        int iValidateObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(parcel);
        int i = 0;
        int i2 = 0;
        com.google.android.gms.nearby.messages.Message message = null;
        com.google.android.gms.nearby.messages.internal.zze zzeVar = null;
        com.google.android.gms.nearby.messages.internal.zza zzaVar = null;
        com.google.android.gms.internal.nearby.zzhj zzhjVar = null;
        byte[] bArrCreateByteArray = null;
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
                    message = (com.google.android.gms.nearby.messages.Message) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, header, com.google.android.gms.nearby.messages.Message.CREATOR);
                    break;
                case 4:
                    zzeVar = (com.google.android.gms.nearby.messages.internal.zze) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, header, com.google.android.gms.nearby.messages.internal.zze.CREATOR);
                    break;
                case 5:
                    zzaVar = (com.google.android.gms.nearby.messages.internal.zza) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, header, com.google.android.gms.nearby.messages.internal.zza.CREATOR);
                    break;
                case 6:
                    zzhjVar = (com.google.android.gms.internal.nearby.zzhj) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, header, com.google.android.gms.internal.nearby.zzhj.CREATOR);
                    break;
                case 7:
                    bArrCreateByteArray = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createByteArray(parcel, header);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(parcel, header);
                    break;
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new com.google.android.gms.nearby.messages.internal.Update(i, i2, message, zzeVar, zzaVar, zzhjVar, bArrCreateByteArray);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ com.google.android.gms.nearby.messages.internal.Update[] newArray(int i) {
        return new com.google.android.gms.nearby.messages.internal.Update[i];
    }
}
