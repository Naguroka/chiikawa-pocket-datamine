package com.google.firebase.crashlytics.internal.common;

/* JADX INFO: loaded from: classes5.dex */
public class AppData {
    public final java.lang.String buildId;
    public final java.util.List<com.google.firebase.crashlytics.internal.common.BuildIdInfo> buildIdInfoList;
    public final com.google.firebase.crashlytics.internal.DevelopmentPlatformProvider developmentPlatformProvider;
    public final java.lang.String googleAppId;
    public final java.lang.String installerPackageName;
    public final java.lang.String packageName;
    public final java.lang.String versionCode;
    public final java.lang.String versionName;

    public static com.google.firebase.crashlytics.internal.common.AppData create(android.content.Context context, com.google.firebase.crashlytics.internal.common.IdManager idManager, java.lang.String str, java.lang.String str2, java.util.List<com.google.firebase.crashlytics.internal.common.BuildIdInfo> list, com.google.firebase.crashlytics.internal.DevelopmentPlatformProvider developmentPlatformProvider) throws android.content.pm.PackageManager.NameNotFoundException {
        java.lang.String packageName = context.getPackageName();
        java.lang.String installerPackageName = idManager.getInstallerPackageName();
        android.content.pm.PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        return new com.google.firebase.crashlytics.internal.common.AppData(str, str2, list, installerPackageName, packageName, getAppBuildVersion(packageInfo), packageInfo.versionName == null ? com.google.firebase.crashlytics.internal.common.IdManager.DEFAULT_VERSION_NAME : packageInfo.versionName, developmentPlatformProvider);
    }

    private static java.lang.String getAppBuildVersion(android.content.pm.PackageInfo packageInfo) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            return java.lang.Long.toString(packageInfo.getLongVersionCode());
        }
        return java.lang.Integer.toString(packageInfo.versionCode);
    }

    public AppData(java.lang.String str, java.lang.String str2, java.util.List<com.google.firebase.crashlytics.internal.common.BuildIdInfo> list, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, com.google.firebase.crashlytics.internal.DevelopmentPlatformProvider developmentPlatformProvider) {
        this.googleAppId = str;
        this.buildId = str2;
        this.buildIdInfoList = list;
        this.installerPackageName = str3;
        this.packageName = str4;
        this.versionCode = str5;
        this.versionName = str6;
        this.developmentPlatformProvider = developmentPlatformProvider;
    }
}
