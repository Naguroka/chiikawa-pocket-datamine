package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbvl implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        int iValidateObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(parcel);
        android.os.Bundle bundleCreateBundle = null;
        com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel = null;
        android.content.pm.ApplicationInfo applicationInfo = null;
        java.lang.String strCreateString = null;
        java.util.ArrayList<java.lang.String> arrayListCreateStringList = null;
        android.content.pm.PackageInfo packageInfo = null;
        java.lang.String strCreateString2 = null;
        java.lang.String strCreateString3 = null;
        com.google.android.gms.internal.ads.zzfed zzfedVar = null;
        java.lang.String strCreateString4 = null;
        android.os.Bundle bundleCreateBundle2 = null;
        android.os.Bundle bundleCreateBundle3 = null;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(header)) {
                case 1:
                    bundleCreateBundle = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createBundle(parcel, header);
                    break;
                case 2:
                    versionInfoParcel = (com.google.android.gms.ads.internal.util.client.VersionInfoParcel) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, header, com.google.android.gms.ads.internal.util.client.VersionInfoParcel.CREATOR);
                    break;
                case 3:
                    applicationInfo = (android.content.pm.ApplicationInfo) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, header, android.content.pm.ApplicationInfo.CREATOR);
                    break;
                case 4:
                    strCreateString = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, header);
                    break;
                case 5:
                    arrayListCreateStringList = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createStringList(parcel, header);
                    break;
                case 6:
                    packageInfo = (android.content.pm.PackageInfo) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, header, android.content.pm.PackageInfo.CREATOR);
                    break;
                case 7:
                    strCreateString2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, header);
                    break;
                case 8:
                default:
                    com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(parcel, header);
                    break;
                case 9:
                    strCreateString3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, header);
                    break;
                case 10:
                    zzfedVar = (com.google.android.gms.internal.ads.zzfed) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, header, com.google.android.gms.internal.ads.zzfed.CREATOR);
                    break;
                case 11:
                    strCreateString4 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, header);
                    break;
                case 12:
                    z = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 13:
                    z2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 14:
                    bundleCreateBundle2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createBundle(parcel, header);
                    break;
                case 15:
                    bundleCreateBundle3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createBundle(parcel, header);
                    break;
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new com.google.android.gms.internal.ads.zzbvk(bundleCreateBundle, versionInfoParcel, applicationInfo, strCreateString, arrayListCreateStringList, packageInfo, strCreateString2, strCreateString3, zzfedVar, strCreateString4, z, z2, bundleCreateBundle2, bundleCreateBundle3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        return new com.google.android.gms.internal.ads.zzbvk[i];
    }
}
