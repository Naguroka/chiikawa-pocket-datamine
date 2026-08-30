package com.google.android.gms.internal.location;

/* JADX INFO: compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzbd implements android.os.Parcelable.Creator<com.google.android.gms.internal.location.zzbc> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.location.zzbc createFromParcel(android.os.Parcel parcel) {
        int iValidateObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(parcel);
        int i = 1;
        com.google.android.gms.internal.location.zzba zzbaVar = null;
        android.os.IBinder iBinder = null;
        android.app.PendingIntent pendingIntent = null;
        android.os.IBinder iBinder2 = null;
        android.os.IBinder iBinder3 = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(header)) {
                case 1:
                    i = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(parcel, header);
                    break;
                case 2:
                    zzbaVar = (com.google.android.gms.internal.location.zzba) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, header, com.google.android.gms.internal.location.zzba.CREATOR);
                    break;
                case 3:
                    iBinder = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readIBinder(parcel, header);
                    break;
                case 4:
                    pendingIntent = (android.app.PendingIntent) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, header, android.app.PendingIntent.CREATOR);
                    break;
                case 5:
                    iBinder2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readIBinder(parcel, header);
                    break;
                case 6:
                    iBinder3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readIBinder(parcel, header);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(parcel, header);
                    break;
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new com.google.android.gms.internal.location.zzbc(i, zzbaVar, iBinder, pendingIntent, iBinder2, iBinder3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.location.zzbc[] newArray(int i) {
        return new com.google.android.gms.internal.location.zzbc[i];
    }
}
