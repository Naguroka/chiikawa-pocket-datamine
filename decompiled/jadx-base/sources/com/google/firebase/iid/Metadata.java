package com.google.firebase.iid;

/* JADX INFO: compiled from: com.google.firebase:firebase-iid@@21.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public class Metadata {
    private java.lang.String appVersionCode;
    private java.lang.String appVersionName;
    private final android.content.Context context;
    private int gmsVersionCode;
    private int iidImplementation = 0;

    public Metadata(android.content.Context context) {
        this.context = context;
    }

    public static java.lang.String getDefaultSenderId(com.google.firebase.FirebaseApp firebaseApp) {
        java.lang.String gcmSenderId = firebaseApp.getOptions().getGcmSenderId();
        if (gcmSenderId != null) {
            return gcmSenderId;
        }
        java.lang.String applicationId = firebaseApp.getOptions().getApplicationId();
        if (!applicationId.startsWith("1:")) {
            return applicationId;
        }
        java.lang.String[] strArrSplit = applicationId.split(":");
        if (strArrSplit.length < 2) {
            return null;
        }
        java.lang.String str = strArrSplit[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    private android.content.pm.PackageInfo getPackageInfo(java.lang.String str) {
        try {
            return this.context.getPackageManager().getPackageInfo(str, 0);
        } catch (android.content.pm.PackageManager.NameNotFoundException e) {
            java.lang.String strValueOf = java.lang.String.valueOf(e);
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(strValueOf).length() + 23);
            sb.append("Failed to find package ");
            sb.append(strValueOf);
            android.util.Log.w("FirebaseInstanceId", sb.toString());
            return null;
        }
    }

    private synchronized void populateAppVersionInfo() {
        android.content.pm.PackageInfo packageInfo = getPackageInfo(this.context.getPackageName());
        if (packageInfo != null) {
            this.appVersionCode = java.lang.Integer.toString(packageInfo.versionCode);
            this.appVersionName = packageInfo.versionName;
        }
    }

    public synchronized java.lang.String getAppVersionCode() {
        if (this.appVersionCode == null) {
            populateAppVersionInfo();
        }
        return this.appVersionCode;
    }

    public synchronized java.lang.String getAppVersionName() {
        if (this.appVersionName == null) {
            populateAppVersionInfo();
        }
        return this.appVersionName;
    }

    public synchronized int getGmsVersionCode() {
        android.content.pm.PackageInfo packageInfo;
        if (this.gmsVersionCode == 0 && (packageInfo = getPackageInfo("com.google.android.gms")) != null) {
            this.gmsVersionCode = packageInfo.versionCode;
        }
        return this.gmsVersionCode;
    }

    public synchronized int getIidImplementation() {
        int i = this.iidImplementation;
        if (i != 0) {
            return i;
        }
        android.content.pm.PackageManager packageManager = this.context.getPackageManager();
        if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            android.util.Log.e("FirebaseInstanceId", "Google Play services missing or without correct permission.");
            return 0;
        }
        int i2 = 1;
        if (!com.google.android.gms.common.util.PlatformVersion.isAtLeastO()) {
            android.content.Intent intent = new android.content.Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            java.util.List<android.content.pm.ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (listQueryIntentServices != null && listQueryIntentServices.size() > 0) {
                this.iidImplementation = 1;
                return 1;
            }
        }
        android.content.Intent intent2 = new android.content.Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        java.util.List<android.content.pm.ResolveInfo> listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (listQueryBroadcastReceivers != null && listQueryBroadcastReceivers.size() > 0) {
            this.iidImplementation = 2;
            return 2;
        }
        android.util.Log.w("FirebaseInstanceId", "Failed to resolve IID implementation package, falling back");
        if (com.google.android.gms.common.util.PlatformVersion.isAtLeastO()) {
            this.iidImplementation = 2;
            i2 = 2;
        } else {
            this.iidImplementation = 1;
        }
        return i2;
    }

    public boolean isGmscorePresent() {
        return getIidImplementation() != 0;
    }
}
