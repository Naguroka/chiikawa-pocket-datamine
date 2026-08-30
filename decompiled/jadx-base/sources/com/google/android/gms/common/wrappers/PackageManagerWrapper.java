package com.google.android.gms.common.wrappers;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public class PackageManagerWrapper {
    protected final android.content.Context zza;

    public PackageManagerWrapper(android.content.Context context) {
        this.zza = context;
    }

    public int checkCallingOrSelfPermission(java.lang.String str) {
        return this.zza.checkCallingOrSelfPermission(str);
    }

    public int checkPermission(java.lang.String str, java.lang.String str2) {
        return this.zza.getPackageManager().checkPermission(str, str2);
    }

    public android.content.pm.ApplicationInfo getApplicationInfo(java.lang.String str, int i) throws android.content.pm.PackageManager.NameNotFoundException {
        return this.zza.getPackageManager().getApplicationInfo(str, i);
    }

    public java.lang.CharSequence getApplicationLabel(java.lang.String str) throws android.content.pm.PackageManager.NameNotFoundException {
        android.content.Context context = this.zza;
        return context.getPackageManager().getApplicationLabel(context.getPackageManager().getApplicationInfo(str, 0));
    }

    public androidx.core.util.Pair<java.lang.CharSequence, android.graphics.drawable.Drawable> getApplicationLabelAndIcon(java.lang.String str) throws android.content.pm.PackageManager.NameNotFoundException {
        android.content.pm.ApplicationInfo applicationInfo = this.zza.getPackageManager().getApplicationInfo(str, 0);
        return androidx.core.util.Pair.create(this.zza.getPackageManager().getApplicationLabel(applicationInfo), this.zza.getPackageManager().getApplicationIcon(applicationInfo));
    }

    public android.content.pm.PackageInfo getPackageInfo(java.lang.String str, int i) throws android.content.pm.PackageManager.NameNotFoundException {
        return this.zza.getPackageManager().getPackageInfo(str, i);
    }

    public java.lang.String[] getPackagesForUid(int i) {
        return this.zza.getPackageManager().getPackagesForUid(i);
    }

    public boolean isCallerInstantApp() {
        java.lang.String nameForUid;
        if (android.os.Binder.getCallingUid() == android.os.Process.myUid()) {
            return com.google.android.gms.common.wrappers.InstantApps.isInstantApp(this.zza);
        }
        if (!com.google.android.gms.common.util.PlatformVersion.isAtLeastO() || (nameForUid = this.zza.getPackageManager().getNameForUid(android.os.Binder.getCallingUid())) == null) {
            return false;
        }
        return this.zza.getPackageManager().isInstantApp(nameForUid);
    }

    public final boolean zza(int i, java.lang.String str) {
        try {
            android.app.AppOpsManager appOpsManager = (android.app.AppOpsManager) this.zza.getSystemService("appops");
            if (appOpsManager == null) {
                throw new java.lang.NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
            }
            appOpsManager.checkPackage(i, str);
            return true;
        } catch (java.lang.SecurityException unused) {
            return false;
        }
    }
}
