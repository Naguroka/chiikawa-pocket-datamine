package com.google.firebase.crashlytics.internal.common;

/* JADX INFO: loaded from: classes5.dex */
class InstallerPackageNameProvider {
    private static final java.lang.String NO_INSTALLER_PACKAGE_NAME = "";
    private java.lang.String installerPackageName;

    InstallerPackageNameProvider() {
    }

    synchronized java.lang.String getInstallerPackageName(android.content.Context context) {
        if (this.installerPackageName == null) {
            this.installerPackageName = loadInstallerPackageName(context);
        }
        return "".equals(this.installerPackageName) ? null : this.installerPackageName;
    }

    private static java.lang.String loadInstallerPackageName(android.content.Context context) {
        java.lang.String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        return installerPackageName == null ? "" : installerPackageName;
    }
}
