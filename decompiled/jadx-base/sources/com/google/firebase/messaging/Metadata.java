package com.google.firebase.messaging;

/* JADX INFO: loaded from: classes5.dex */
class Metadata {
    private static final java.lang.String ACTION_C2DM_REGISTER = "com.google.android.c2dm.intent.REGISTER";
    private static final java.lang.String ACTION_IID_TOKEN_REQUEST = "com.google.iid.TOKEN_REQUEST";
    static final int GMSCORE_NOT_FOUND = 0;
    private static final java.lang.String GMSCORE_SEND_PERMISSION = "com.google.android.c2dm.permission.SEND";
    static final java.lang.String GMS_PACKAGE = "com.google.android.gms";
    static final int IID_VIA_RECEIVER = 2;
    static final int IID_VIA_SERVICE = 1;
    private java.lang.String appVersionCode;
    private java.lang.String appVersionName;
    private final android.content.Context context;
    private int gmsVersionCode;
    private int iidImplementation = 0;

    Metadata(android.content.Context context) {
        this.context = context;
    }

    boolean isGmscorePresent() {
        return getIidImplementation() != 0;
    }

    synchronized int getIidImplementation() {
        int i = this.iidImplementation;
        if (i != 0) {
            return i;
        }
        android.content.pm.PackageManager packageManager = this.context.getPackageManager();
        if (packageManager.checkPermission(GMSCORE_SEND_PERMISSION, "com.google.android.gms") == -1) {
            android.util.Log.e(com.google.firebase.messaging.Constants.TAG, "Google Play services missing or without correct permission.");
            return 0;
        }
        if (!com.google.android.gms.common.util.PlatformVersion.isAtLeastO()) {
            android.content.Intent intent = new android.content.Intent(ACTION_C2DM_REGISTER);
            intent.setPackage("com.google.android.gms");
            java.util.List<android.content.pm.ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (listQueryIntentServices != null && listQueryIntentServices.size() > 0) {
                this.iidImplementation = 1;
                return 1;
            }
        }
        android.content.Intent intent2 = new android.content.Intent(ACTION_IID_TOKEN_REQUEST);
        intent2.setPackage("com.google.android.gms");
        java.util.List<android.content.pm.ResolveInfo> listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (listQueryBroadcastReceivers != null && listQueryBroadcastReceivers.size() > 0) {
            this.iidImplementation = 2;
            return 2;
        }
        android.util.Log.w(com.google.firebase.messaging.Constants.TAG, "Failed to resolve IID implementation package, falling back");
        if (com.google.android.gms.common.util.PlatformVersion.isAtLeastO()) {
            this.iidImplementation = 2;
        } else {
            this.iidImplementation = 1;
        }
        return this.iidImplementation;
    }

    static java.lang.String getDefaultSenderId(com.google.firebase.FirebaseApp firebaseApp) {
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

    synchronized java.lang.String getAppVersionCode() {
        if (this.appVersionCode == null) {
            populateAppVersionInfo();
        }
        return this.appVersionCode;
    }

    synchronized java.lang.String getAppVersionName() {
        if (this.appVersionName == null) {
            populateAppVersionInfo();
        }
        return this.appVersionName;
    }

    synchronized int getGmsVersionCode() {
        android.content.pm.PackageInfo packageInfo;
        if (this.gmsVersionCode == 0 && (packageInfo = getPackageInfo("com.google.android.gms")) != null) {
            this.gmsVersionCode = packageInfo.versionCode;
        }
        return this.gmsVersionCode;
    }

    private synchronized void populateAppVersionInfo() {
        android.content.pm.PackageInfo packageInfo = getPackageInfo(this.context.getPackageName());
        if (packageInfo != null) {
            this.appVersionCode = java.lang.Integer.toString(packageInfo.versionCode);
            this.appVersionName = packageInfo.versionName;
        }
    }

    private android.content.pm.PackageInfo getPackageInfo(java.lang.String str) {
        try {
            return this.context.getPackageManager().getPackageInfo(str, 0);
        } catch (android.content.pm.PackageManager.NameNotFoundException e) {
            android.util.Log.w(com.google.firebase.messaging.Constants.TAG, "Failed to find package " + e);
            return null;
        }
    }
}
