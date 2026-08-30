package com.google.android.gms.common;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class GooglePlayServicesUtil extends com.google.android.gms.common.GooglePlayServicesUtilLight {
    public static final java.lang.String GMS_ERROR_DIALOG = "GooglePlayServicesErrorDialog";

    @java.lang.Deprecated
    public static final java.lang.String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";

    @java.lang.Deprecated
    public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = com.google.android.gms.common.GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    public static final java.lang.String GOOGLE_PLAY_STORE_PACKAGE = "com.android.vending";

    private GooglePlayServicesUtil() {
    }

    @java.lang.Deprecated
    public static android.app.Dialog getErrorDialog(int i, android.app.Activity activity, int i2) {
        return getErrorDialog(i, activity, i2, null);
    }

    @java.lang.Deprecated
    public static android.app.PendingIntent getErrorPendingIntent(int i, android.content.Context context, int i2) {
        return com.google.android.gms.common.GoogleApiAvailabilityLight.getInstance().getErrorResolutionPendingIntent(context, i, i2);
    }

    @java.lang.Deprecated
    public static java.lang.String getErrorString(int i) {
        return com.google.android.gms.common.GooglePlayServicesUtilLight.getErrorString(i);
    }

    public static android.content.Context getRemoteContext(android.content.Context context) {
        return com.google.android.gms.common.GooglePlayServicesUtilLight.getRemoteContext(context);
    }

    public static android.content.res.Resources getRemoteResource(android.content.Context context) {
        return com.google.android.gms.common.GooglePlayServicesUtilLight.getRemoteResource(context);
    }

    @java.lang.Deprecated
    public static int isGooglePlayServicesAvailable(android.content.Context context) {
        return com.google.android.gms.common.GooglePlayServicesUtilLight.isGooglePlayServicesAvailable(context);
    }

    @java.lang.Deprecated
    public static boolean isUserRecoverableError(int i) {
        return com.google.android.gms.common.GooglePlayServicesUtilLight.isUserRecoverableError(i);
    }

    public static boolean isUsingBackgroundThreadExecutorForBindService() {
        return com.google.android.gms.common.api.internal.GoogleApiManager.zaE();
    }

    @java.lang.Deprecated
    public static boolean showErrorDialogFragment(int i, android.app.Activity activity, int i2) {
        return showErrorDialogFragment(i, activity, i2, null);
    }

    @java.lang.Deprecated
    public static void showErrorNotification(int i, android.content.Context context) {
        com.google.android.gms.common.GoogleApiAvailability googleApiAvailability = com.google.android.gms.common.GoogleApiAvailability.getInstance();
        if (com.google.android.gms.common.GooglePlayServicesUtilLight.isPlayServicesPossiblyUpdating(context, i) || com.google.android.gms.common.GooglePlayServicesUtilLight.isPlayStorePossiblyUpdating(context, i)) {
            googleApiAvailability.zaf(context);
        } else {
            googleApiAvailability.showErrorNotification(context, i);
        }
    }

    public static boolean useBackgroundThreadExecutorForBindService() {
        return com.google.android.gms.common.api.internal.GoogleApiManager.zaF();
    }

    public static void useBackgroundThreadForConnectionCallback() {
        com.google.android.gms.common.internal.GmsClientSupervisor.setUseHandlerThreadForCallbacks();
    }

    @java.lang.Deprecated
    public static android.app.Dialog getErrorDialog(int i, android.app.Activity activity, int i2, android.content.DialogInterface.OnCancelListener onCancelListener) {
        if (true == com.google.android.gms.common.GooglePlayServicesUtilLight.isPlayServicesPossiblyUpdating(activity, i)) {
            i = 18;
        }
        return com.google.android.gms.common.GoogleApiAvailability.getInstance().getErrorDialog(activity, i, i2, onCancelListener);
    }

    @java.lang.Deprecated
    public static int isGooglePlayServicesAvailable(android.content.Context context, int i) {
        return com.google.android.gms.common.GooglePlayServicesUtilLight.isGooglePlayServicesAvailable(context, i);
    }

    @java.lang.Deprecated
    public static boolean showErrorDialogFragment(int i, android.app.Activity activity, int i2, android.content.DialogInterface.OnCancelListener onCancelListener) {
        return showErrorDialogFragment(i, activity, null, i2, onCancelListener);
    }

    public static boolean showErrorDialogFragment(int i, android.app.Activity activity, androidx.fragment.app.Fragment fragment, int i2, android.content.DialogInterface.OnCancelListener onCancelListener) {
        if (true == com.google.android.gms.common.GooglePlayServicesUtilLight.isPlayServicesPossiblyUpdating(activity, i)) {
            i = 18;
        }
        int i3 = i;
        com.google.android.gms.common.GoogleApiAvailability googleApiAvailability = com.google.android.gms.common.GoogleApiAvailability.getInstance();
        if (fragment == null) {
            return googleApiAvailability.showErrorDialogFragment(activity, i3, i2, onCancelListener);
        }
        android.app.Dialog dialogZaa = googleApiAvailability.zaa(activity, i3, com.google.android.gms.common.internal.zag.zac(fragment, com.google.android.gms.common.GoogleApiAvailability.getInstance().getErrorResolutionIntent(activity, i3, "d"), i2), onCancelListener, null);
        if (dialogZaa == null) {
            return false;
        }
        googleApiAvailability.zad(activity, dialogZaa, GMS_ERROR_DIALOG, onCancelListener);
        return true;
    }
}
