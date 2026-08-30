package com.google.android.gms.drive.events;

/* JADX INFO: loaded from: classes4.dex */
public final class zzg implements android.os.Parcelable.Creator<com.google.android.gms.drive.events.CompletionEvent> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.drive.events.CompletionEvent[] newArray(int i) {
        return new com.google.android.gms.drive.events.CompletionEvent[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.drive.events.CompletionEvent createFromParcel(android.os.Parcel parcel) {
        int iValidateObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(parcel);
        com.google.android.gms.drive.DriveId driveId = null;
        java.lang.String strCreateString = null;
        android.os.ParcelFileDescriptor parcelFileDescriptor = null;
        android.os.ParcelFileDescriptor parcelFileDescriptor2 = null;
        com.google.android.gms.drive.metadata.internal.MetadataBundle metadataBundle = null;
        java.util.ArrayList<java.lang.String> arrayListCreateStringList = null;
        android.os.IBinder iBinder = null;
        int i = 0;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(header)) {
                case 2:
                    driveId = (com.google.android.gms.drive.DriveId) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, header, com.google.android.gms.drive.DriveId.CREATOR);
                    break;
                case 3:
                    strCreateString = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, header);
                    break;
                case 4:
                    parcelFileDescriptor = (android.os.ParcelFileDescriptor) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, header, android.os.ParcelFileDescriptor.CREATOR);
                    break;
                case 5:
                    parcelFileDescriptor2 = (android.os.ParcelFileDescriptor) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, header, android.os.ParcelFileDescriptor.CREATOR);
                    break;
                case 6:
                    metadataBundle = (com.google.android.gms.drive.metadata.internal.MetadataBundle) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, header, com.google.android.gms.drive.metadata.internal.MetadataBundle.CREATOR);
                    break;
                case 7:
                    arrayListCreateStringList = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createStringList(parcel, header);
                    break;
                case 8:
                    i = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(parcel, header);
                    break;
                case 9:
                    iBinder = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readIBinder(parcel, header);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(parcel, header);
                    break;
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new com.google.android.gms.drive.events.CompletionEvent(driveId, strCreateString, parcelFileDescriptor, parcelFileDescriptor2, metadataBundle, arrayListCreateStringList, i, iBinder);
    }
}
