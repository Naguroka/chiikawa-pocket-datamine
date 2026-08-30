package com.google.android.gms.ads.internal.overlay;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzo implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        int iValidateObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(parcel);
        long j = 0;
        boolean z = false;
        int i = 0;
        int i2 = 0;
        boolean z2 = false;
        com.google.android.gms.ads.internal.overlay.zzc zzcVar = null;
        android.os.IBinder iBinder = null;
        android.os.IBinder iBinder2 = null;
        android.os.IBinder iBinder3 = null;
        android.os.IBinder iBinder4 = null;
        java.lang.String strCreateString = null;
        java.lang.String strCreateString2 = null;
        android.os.IBinder iBinder5 = null;
        java.lang.String strCreateString3 = null;
        com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel = null;
        java.lang.String strCreateString4 = null;
        com.google.android.gms.ads.internal.zzl zzlVar = null;
        android.os.IBinder iBinder6 = null;
        java.lang.String strCreateString5 = null;
        java.lang.String strCreateString6 = null;
        java.lang.String strCreateString7 = null;
        android.os.IBinder iBinder7 = null;
        android.os.IBinder iBinder8 = null;
        android.os.IBinder iBinder9 = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(header)) {
                case 2:
                    zzcVar = (com.google.android.gms.ads.internal.overlay.zzc) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, header, com.google.android.gms.ads.internal.overlay.zzc.CREATOR);
                    break;
                case 3:
                    iBinder = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readIBinder(parcel, header);
                    break;
                case 4:
                    iBinder2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readIBinder(parcel, header);
                    break;
                case 5:
                    iBinder3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readIBinder(parcel, header);
                    break;
                case 6:
                    iBinder4 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readIBinder(parcel, header);
                    break;
                case 7:
                    strCreateString = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, header);
                    break;
                case 8:
                    z = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 9:
                    strCreateString2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, header);
                    break;
                case 10:
                    iBinder5 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readIBinder(parcel, header);
                    break;
                case 11:
                    i = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(parcel, header);
                    break;
                case 12:
                    i2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(parcel, header);
                    break;
                case 13:
                    strCreateString3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, header);
                    break;
                case 14:
                    versionInfoParcel = (com.google.android.gms.ads.internal.util.client.VersionInfoParcel) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, header, com.google.android.gms.ads.internal.util.client.VersionInfoParcel.CREATOR);
                    break;
                case 15:
                case 20:
                case 21:
                case 22:
                case 23:
                default:
                    com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(parcel, header);
                    break;
                case 16:
                    strCreateString4 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, header);
                    break;
                case 17:
                    zzlVar = (com.google.android.gms.ads.internal.zzl) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, header, com.google.android.gms.ads.internal.zzl.CREATOR);
                    break;
                case 18:
                    iBinder6 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readIBinder(parcel, header);
                    break;
                case 19:
                    strCreateString5 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, header);
                    break;
                case 24:
                    strCreateString6 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, header);
                    break;
                case 25:
                    strCreateString7 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, header);
                    break;
                case 26:
                    iBinder7 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readIBinder(parcel, header);
                    break;
                case 27:
                    iBinder8 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readIBinder(parcel, header);
                    break;
                case 28:
                    iBinder9 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readIBinder(parcel, header);
                    break;
                case 29:
                    z2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 30:
                    j = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(parcel, header);
                    break;
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel(zzcVar, iBinder, iBinder2, iBinder3, iBinder4, strCreateString, z, strCreateString2, iBinder5, i, i2, strCreateString3, versionInfoParcel, strCreateString4, zzlVar, iBinder6, strCreateString5, strCreateString6, strCreateString7, iBinder7, iBinder8, iBinder9, z2, j);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        return new com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel[i];
    }
}
