package com.google.android.gms.common;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public class GoogleApiAvailabilityLight {
    public static final java.lang.String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";
    public static final java.lang.String GOOGLE_PLAY_STORE_PACKAGE = "com.android.vending";
    static final java.lang.String TRACKING_SOURCE_DIALOG = "d";
    static final java.lang.String TRACKING_SOURCE_NOTIFICATION = "n";
    public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = com.google.android.gms.common.GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    private static final com.google.android.gms.common.GoogleApiAvailabilityLight zza = new com.google.android.gms.common.GoogleApiAvailabilityLight();

    GoogleApiAvailabilityLight() {
    }

    public static com.google.android.gms.common.GoogleApiAvailabilityLight getInstance() {
        return zza;
    }

    public void cancelAvailabilityErrorNotifications(android.content.Context context) {
        com.google.android.gms.common.GooglePlayServicesUtilLight.cancelAvailabilityErrorNotifications(context);
    }

    public int getApkVersion(android.content.Context context) {
        return com.google.android.gms.common.GooglePlayServicesUtilLight.getApkVersion(context);
    }

    public int getClientVersion(android.content.Context context) {
        return com.google.android.gms.common.GooglePlayServicesUtilLight.getClientVersion(context);
    }

    @java.lang.Deprecated
    public android.content.Intent getErrorResolutionIntent(int i) {
        return getErrorResolutionIntent(null, i, null);
    }

    public android.app.PendingIntent getErrorResolutionPendingIntent(android.content.Context context, int i, int i2) {
        return getErrorResolutionPendingIntent(context, i, i2, null);
    }

    public java.lang.String getErrorString(int i) {
        return com.google.android.gms.common.GooglePlayServicesUtilLight.getErrorString(i);
    }

    public int isGooglePlayServicesAvailable(android.content.Context context) {
        return isGooglePlayServicesAvailable(context, GOOGLE_PLAY_SERVICES_VERSION_CODE);
    }

    public boolean isPlayServicesPossiblyUpdating(android.content.Context context, int i) {
        return com.google.android.gms.common.GooglePlayServicesUtilLight.isPlayServicesPossiblyUpdating(context, i);
    }

    public boolean isPlayStorePossiblyUpdating(android.content.Context context, int i) {
        return com.google.android.gms.common.GooglePlayServicesUtilLight.isPlayStorePossiblyUpdating(context, i);
    }

    public boolean isUninstalledAppPossiblyUpdating(android.content.Context context, java.lang.String str) {
        return com.google.android.gms.common.GooglePlayServicesUtilLight.zza(context, str);
    }

    public boolean isUserResolvableError(int i) {
        return com.google.android.gms.common.GooglePlayServicesUtilLight.isUserRecoverableError(i);
    }

    public void verifyGooglePlayServicesIsAvailable(android.content.Context context, int i) throws com.google.android.gms.common.GooglePlayServicesRepairableException, com.google.android.gms.common.GooglePlayServicesNotAvailableException {
        com.google.android.gms.common.GooglePlayServicesUtilLight.ensurePlayServicesAvailable(context, i);
    }

    public android.content.Intent getErrorResolutionIntent(android.content.Context context, int i, java.lang.String str) {
        if (i != 1 && i != 2) {
            if (i != 3) {
                return null;
            }
            android.net.Uri uriFromParts = android.net.Uri.fromParts("package", "com.google.android.gms", null);
            android.content.Intent intent = new android.content.Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(uriFromParts);
            return intent;
        }
        if (context != null && com.google.android.gms.common.util.DeviceProperties.isWearableWithoutPlayStore(context)) {
            android.content.Intent intent2 = new android.content.Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
            intent2.setPackage("com.google.android.wearable.app");
            return intent2;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("gcore_");
        sb.append(GOOGLE_PLAY_SERVICES_VERSION_CODE);
        sb.append("-");
        if (!android.text.TextUtils.isEmpty(str)) {
            sb.append(str);
        }
        sb.append("-");
        if (context != null) {
            sb.append(context.getPackageName());
        }
        sb.append("-");
        if (context != null) {
            try {
                sb.append(com.google.android.gms.common.wrappers.Wrappers.packageManager(context).getPackageInfo(context.getPackageName(), 0).versionCode);
            } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            }
        }
        java.lang.String string = sb.toString();
        android.content.Intent intent3 = new android.content.Intent("android.intent.action.VIEW");
        android.net.Uri.Builder builderAppendQueryParameter = android.net.Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.gms");
        if (!android.text.TextUtils.isEmpty(string)) {
            builderAppendQueryParameter.appendQueryParameter("pcampaignid", string);
        }
        intent3.setData(builderAppendQueryParameter.build());
        intent3.setPackage("com.android.vending");
        intent3.addFlags(524288);
        return intent3;
    }

    public android.app.PendingIntent getErrorResolutionPendingIntent(android.content.Context context, int i, int i2, java.lang.String str) {
        android.content.Intent errorResolutionIntent = getErrorResolutionIntent(context, i, str);
        if (errorResolutionIntent == null) {
            return null;
        }
        return androidx.core.app.PendingIntentCompat.getActivity(context, i2, errorResolutionIntent, androidx.media3.common.C.BUFFER_FLAG_FIRST_SAMPLE, false);
    }

    public int isGooglePlayServicesAvailable(android.content.Context context, int i) {
        int iIsGooglePlayServicesAvailable = com.google.android.gms.common.GooglePlayServicesUtilLight.isGooglePlayServicesAvailable(context, i);
        if (com.google.android.gms.common.GooglePlayServicesUtilLight.isPlayServicesPossiblyUpdating(context, iIsGooglePlayServicesAvailable)) {
            return 18;
        }
        return iIsGooglePlayServicesAvailable;
    }
}
