package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbur implements android.os.Parcelable.Creator {
    public static final com.google.android.gms.internal.ads.zzbuq zza(android.os.Parcel parcel) {
        int iValidateObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(parcel);
        android.os.Bundle bundleCreateBundle = null;
        com.google.android.gms.ads.internal.client.zzm zzmVar = null;
        com.google.android.gms.ads.internal.client.zzs zzsVar = null;
        java.lang.String strCreateString = null;
        android.content.pm.ApplicationInfo applicationInfo = null;
        android.content.pm.PackageInfo packageInfo = null;
        java.lang.String strCreateString2 = null;
        java.lang.String strCreateString3 = null;
        java.lang.String strCreateString4 = null;
        com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel = null;
        android.os.Bundle bundleCreateBundle2 = null;
        java.util.ArrayList<java.lang.String> arrayListCreateStringList = null;
        android.os.Bundle bundleCreateBundle3 = null;
        java.lang.String strCreateString5 = null;
        java.lang.String strCreateString6 = null;
        java.util.ArrayList<java.lang.String> arrayListCreateStringList2 = null;
        java.lang.String strCreateString7 = null;
        com.google.android.gms.internal.ads.zzbfl zzbflVar = null;
        java.util.ArrayList<java.lang.String> arrayListCreateStringList3 = null;
        java.lang.String strCreateString8 = null;
        java.lang.String strCreateString9 = null;
        java.lang.String strCreateString10 = null;
        android.os.Bundle bundleCreateBundle4 = null;
        java.lang.String strCreateString11 = null;
        com.google.android.gms.ads.internal.client.zzef zzefVar = null;
        android.os.Bundle bundleCreateBundle5 = null;
        java.lang.String strCreateString12 = null;
        java.lang.String strCreateString13 = null;
        java.lang.String strCreateString14 = null;
        java.util.ArrayList<java.lang.Integer> arrayListCreateIntegerList = null;
        java.lang.String strCreateString15 = null;
        java.util.ArrayList<java.lang.String> arrayListCreateStringList4 = null;
        java.util.ArrayList<java.lang.String> arrayListCreateStringList5 = null;
        java.lang.String strCreateString16 = null;
        com.google.android.gms.internal.ads.zzblz zzblzVar = null;
        java.lang.String strCreateString17 = null;
        android.os.Bundle bundleCreateBundle6 = null;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        int i4 = 0;
        boolean z2 = false;
        int i5 = 0;
        int i6 = 0;
        boolean z3 = false;
        boolean z4 = false;
        int i7 = 0;
        boolean z5 = false;
        boolean z6 = false;
        int i8 = 0;
        boolean z7 = false;
        boolean z8 = false;
        boolean z9 = false;
        float f = 0.0f;
        float f2 = 0.0f;
        long j = 0;
        long j2 = 0;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(header)) {
                case 1:
                    i = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(parcel, header);
                    break;
                case 2:
                    bundleCreateBundle = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createBundle(parcel, header);
                    break;
                case 3:
                    zzmVar = (com.google.android.gms.ads.internal.client.zzm) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, header, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                    break;
                case 4:
                    zzsVar = (com.google.android.gms.ads.internal.client.zzs) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, header, com.google.android.gms.ads.internal.client.zzs.CREATOR);
                    break;
                case 5:
                    strCreateString = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, header);
                    break;
                case 6:
                    applicationInfo = (android.content.pm.ApplicationInfo) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, header, android.content.pm.ApplicationInfo.CREATOR);
                    break;
                case 7:
                    packageInfo = (android.content.pm.PackageInfo) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, header, android.content.pm.PackageInfo.CREATOR);
                    break;
                case 8:
                    strCreateString2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, header);
                    break;
                case 9:
                    strCreateString3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, header);
                    break;
                case 10:
                    strCreateString4 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, header);
                    break;
                case 11:
                    versionInfoParcel = (com.google.android.gms.ads.internal.util.client.VersionInfoParcel) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, header, com.google.android.gms.ads.internal.util.client.VersionInfoParcel.CREATOR);
                    break;
                case 12:
                    bundleCreateBundle2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createBundle(parcel, header);
                    break;
                case 13:
                    i2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(parcel, header);
                    break;
                case 14:
                    arrayListCreateStringList = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createStringList(parcel, header);
                    break;
                case 15:
                    bundleCreateBundle3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createBundle(parcel, header);
                    break;
                case 16:
                    z = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 17:
                case 22:
                case 23:
                case 24:
                case 32:
                case 38:
                case 62:
                default:
                    com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(parcel, header);
                    break;
                case 18:
                    i3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(parcel, header);
                    break;
                case 19:
                    i4 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(parcel, header);
                    break;
                case 20:
                    f = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readFloat(parcel, header);
                    break;
                case 21:
                    strCreateString5 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, header);
                    break;
                case 25:
                    j = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(parcel, header);
                    break;
                case 26:
                    strCreateString6 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, header);
                    break;
                case 27:
                    arrayListCreateStringList2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createStringList(parcel, header);
                    break;
                case 28:
                    strCreateString7 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, header);
                    break;
                case 29:
                    zzbflVar = (com.google.android.gms.internal.ads.zzbfl) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, header, com.google.android.gms.internal.ads.zzbfl.CREATOR);
                    break;
                case 30:
                    arrayListCreateStringList3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createStringList(parcel, header);
                    break;
                case 31:
                    j2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(parcel, header);
                    break;
                case 33:
                    strCreateString8 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, header);
                    break;
                case 34:
                    f2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readFloat(parcel, header);
                    break;
                case 35:
                    i5 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(parcel, header);
                    break;
                case 36:
                    i6 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(parcel, header);
                    break;
                case 37:
                    z3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 39:
                    strCreateString9 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, header);
                    break;
                case 40:
                    z2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 41:
                    strCreateString10 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, header);
                    break;
                case 42:
                    z4 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 43:
                    i7 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(parcel, header);
                    break;
                case 44:
                    bundleCreateBundle4 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createBundle(parcel, header);
                    break;
                case 45:
                    strCreateString11 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, header);
                    break;
                case 46:
                    zzefVar = (com.google.android.gms.ads.internal.client.zzef) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, header, com.google.android.gms.ads.internal.client.zzef.CREATOR);
                    break;
                case 47:
                    z5 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 48:
                    bundleCreateBundle5 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createBundle(parcel, header);
                    break;
                case 49:
                    strCreateString12 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, header);
                    break;
                case 50:
                    strCreateString13 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, header);
                    break;
                case 51:
                    strCreateString14 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, header);
                    break;
                case 52:
                    z6 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 53:
                    arrayListCreateIntegerList = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createIntegerList(parcel, header);
                    break;
                case 54:
                    strCreateString15 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, header);
                    break;
                case 55:
                    arrayListCreateStringList4 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createStringList(parcel, header);
                    break;
                case 56:
                    i8 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(parcel, header);
                    break;
                case 57:
                    z7 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 58:
                    z8 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 59:
                    z9 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 60:
                    arrayListCreateStringList5 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createStringList(parcel, header);
                    break;
                case 61:
                    strCreateString16 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, header);
                    break;
                case 63:
                    zzblzVar = (com.google.android.gms.internal.ads.zzblz) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, header, com.google.android.gms.internal.ads.zzblz.CREATOR);
                    break;
                case 64:
                    strCreateString17 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, header);
                    break;
                case 65:
                    bundleCreateBundle6 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createBundle(parcel, header);
                    break;
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new com.google.android.gms.internal.ads.zzbuq(i, bundleCreateBundle, zzmVar, zzsVar, strCreateString, applicationInfo, packageInfo, strCreateString2, strCreateString3, strCreateString4, versionInfoParcel, bundleCreateBundle2, i2, arrayListCreateStringList, bundleCreateBundle3, z, i3, i4, f, strCreateString5, j, strCreateString6, arrayListCreateStringList2, strCreateString7, zzbflVar, arrayListCreateStringList3, j2, strCreateString8, f2, z2, i5, i6, z3, strCreateString9, strCreateString10, z4, i7, bundleCreateBundle4, strCreateString11, zzefVar, z5, bundleCreateBundle5, strCreateString12, strCreateString13, strCreateString14, z6, arrayListCreateIntegerList, strCreateString15, arrayListCreateStringList4, i8, z7, z8, z9, arrayListCreateStringList5, strCreateString16, zzblzVar, strCreateString17, bundleCreateBundle6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return zza(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        return new com.google.android.gms.internal.ads.zzbuq[i];
    }
}
