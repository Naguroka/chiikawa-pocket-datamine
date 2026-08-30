package com.google.android.play.core.assetpacks;

/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AssetPackState {
    public static com.google.android.play.core.assetpacks.AssetPackState a(java.lang.String str, int i, int i2, long j, long j2, double d, int i3, java.lang.String str2, java.lang.String str3) {
        return new com.google.android.play.core.assetpacks.bn(str, i, i2, j, j2, (int) java.lang.Math.rint(100.0d * d), i3, str2, str3);
    }

    static com.google.android.play.core.assetpacks.AssetPackState b(android.os.Bundle bundle, java.lang.String str, com.google.android.play.core.assetpacks.co coVar, com.google.android.play.core.assetpacks.eb ebVar, com.google.android.play.core.assetpacks.be beVar) {
        int iA = beVar.a(bundle.getInt(com.google.android.play.core.assetpacks.model.b.a("status", str)), str);
        int i = bundle.getInt(com.google.android.play.core.assetpacks.model.b.a("error_code", str));
        long j = bundle.getLong(com.google.android.play.core.assetpacks.model.b.a("bytes_downloaded", str));
        long j2 = bundle.getLong(com.google.android.play.core.assetpacks.model.b.a("total_bytes_to_download", str));
        double dA = coVar.a(str);
        long j3 = bundle.getLong(com.google.android.play.core.assetpacks.model.b.a("pack_version", str));
        long j4 = bundle.getLong(com.google.android.play.core.assetpacks.model.b.a("pack_base_version", str));
        int i2 = 1;
        int i3 = 4;
        if (iA != 4) {
            i3 = iA;
        } else if (j4 != 0 && j4 != j3) {
            i2 = 2;
        }
        return a(str, i3, i, j, j2, dA, i2, bundle.getString(com.google.android.play.core.assetpacks.model.b.a("pack_version_tag", str), java.lang.String.valueOf(bundle.getInt("app_version_code"))), ebVar.a(str));
    }

    public abstract java.lang.String availableVersionTag();

    public abstract long bytesDownloaded();

    public abstract int errorCode();

    public abstract java.lang.String installedVersionTag();

    public abstract java.lang.String name();

    public abstract int status();

    public abstract long totalBytesToDownload();

    public abstract int transferProgressPercentage();

    public abstract int updateAvailability();
}
