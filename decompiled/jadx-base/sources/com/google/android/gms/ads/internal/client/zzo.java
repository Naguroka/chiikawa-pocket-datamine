package com.google.android.gms.ads.internal.client;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzo implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        int iValidateObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(parcel);
        long j = 0;
        long j2 = 0;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        boolean z2 = false;
        boolean z3 = false;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        android.os.Bundle bundleCreateBundle = null;
        java.util.ArrayList<java.lang.String> arrayListCreateStringList = null;
        java.lang.String strCreateString = null;
        com.google.android.gms.ads.internal.client.zzfx zzfxVar = null;
        android.location.Location location = null;
        java.lang.String strCreateString2 = null;
        android.os.Bundle bundleCreateBundle2 = null;
        android.os.Bundle bundleCreateBundle3 = null;
        java.util.ArrayList<java.lang.String> arrayListCreateStringList2 = null;
        java.lang.String strCreateString3 = null;
        java.lang.String strCreateString4 = null;
        com.google.android.gms.ads.internal.client.zzc zzcVar = null;
        java.lang.String strCreateString5 = null;
        java.util.ArrayList<java.lang.String> arrayListCreateStringList3 = null;
        java.lang.String strCreateString6 = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(header)) {
                case 1:
                    i = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(parcel, header);
                    break;
                case 2:
                    j = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(parcel, header);
                    break;
                case 3:
                    bundleCreateBundle = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createBundle(parcel, header);
                    break;
                case 4:
                    i2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(parcel, header);
                    break;
                case 5:
                    arrayListCreateStringList = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createStringList(parcel, header);
                    break;
                case 6:
                    z = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 7:
                    i3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(parcel, header);
                    break;
                case 8:
                    z2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 9:
                    strCreateString = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, header);
                    break;
                case 10:
                    zzfxVar = (com.google.android.gms.ads.internal.client.zzfx) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, header, com.google.android.gms.ads.internal.client.zzfx.CREATOR);
                    break;
                case 11:
                    location = (android.location.Location) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, header, android.location.Location.CREATOR);
                    break;
                case 12:
                    strCreateString2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, header);
                    break;
                case 13:
                    bundleCreateBundle2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createBundle(parcel, header);
                    break;
                case 14:
                    bundleCreateBundle3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createBundle(parcel, header);
                    break;
                case 15:
                    arrayListCreateStringList2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createStringList(parcel, header);
                    break;
                case 16:
                    strCreateString3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, header);
                    break;
                case 17:
                    strCreateString4 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, header);
                    break;
                case 18:
                    z3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 19:
                    zzcVar = (com.google.android.gms.ads.internal.client.zzc) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, header, com.google.android.gms.ads.internal.client.zzc.CREATOR);
                    break;
                case 20:
                    i4 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(parcel, header);
                    break;
                case 21:
                    strCreateString5 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, header);
                    break;
                case 22:
                    arrayListCreateStringList3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createStringList(parcel, header);
                    break;
                case 23:
                    i5 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(parcel, header);
                    break;
                case 24:
                    strCreateString6 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, header);
                    break;
                case 25:
                    i6 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(parcel, header);
                    break;
                case 26:
                    j2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(parcel, header);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(parcel, header);
                    break;
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new com.google.android.gms.ads.internal.client.zzm(i, j, bundleCreateBundle, i2, arrayListCreateStringList, z, i3, z2, strCreateString, zzfxVar, location, strCreateString2, bundleCreateBundle2, bundleCreateBundle3, arrayListCreateStringList2, strCreateString3, strCreateString4, z3, zzcVar, i4, strCreateString5, arrayListCreateStringList3, i5, strCreateString6, i6, j2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        return new com.google.android.gms.ads.internal.client.zzm[i];
    }
}
