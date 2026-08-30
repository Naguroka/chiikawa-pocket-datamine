package com.google.android.gms.common;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public class GooglePlayServicesUtilLight {
    static final int GMS_AVAILABILITY_NOTIFICATION_ID = 10436;
    static final int GMS_GENERAL_ERROR_NOTIFICATION_ID = 39789;
    public static final java.lang.String GOOGLE_PLAY_GAMES_PACKAGE = "com.google.android.play.games";

    @java.lang.Deprecated
    public static final java.lang.String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";

    @java.lang.Deprecated
    public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = 12451000;
    public static final java.lang.String GOOGLE_PLAY_STORE_PACKAGE = "com.android.vending";
    public static final java.lang.String GOOGLE_SERVICES_FRAMEWORK_PACKAGE = "com.google.android.gsf";
    static boolean zza = false;
    private static boolean zzb = false;

    @java.lang.Deprecated
    static final java.util.concurrent.atomic.AtomicBoolean sCanceledAvailabilityNotification = new java.util.concurrent.atomic.AtomicBoolean();
    private static final java.util.concurrent.atomic.AtomicBoolean zzc = new java.util.concurrent.atomic.AtomicBoolean();

    GooglePlayServicesUtilLight() {
    }

    @java.lang.Deprecated
    public static void cancelAvailabilityErrorNotifications(android.content.Context context) {
        if (sCanceledAvailabilityNotification.getAndSet(true)) {
            return;
        }
        try {
            android.app.NotificationManager notificationManager = (android.app.NotificationManager) context.getSystemService("notification");
            if (notificationManager != null) {
                notificationManager.cancel(GMS_AVAILABILITY_NOTIFICATION_ID);
            }
        } catch (java.lang.SecurityException e) {
            android.util.Log.d("GooglePlayServicesUtil", "Suppressing Security Exception %s in cancelAvailabilityErrorNotifications.", e);
        }
    }

    public static void enableUsingApkIndependentContext() {
        zzc.set(true);
    }

    @java.lang.Deprecated
    public static void ensurePlayServicesAvailable(android.content.Context context, int i) throws com.google.android.gms.common.GooglePlayServicesRepairableException, com.google.android.gms.common.GooglePlayServicesNotAvailableException {
        int iIsGooglePlayServicesAvailable = com.google.android.gms.common.GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(context, i);
        if (iIsGooglePlayServicesAvailable != 0) {
            android.content.Intent errorResolutionIntent = com.google.android.gms.common.GoogleApiAvailabilityLight.getInstance().getErrorResolutionIntent(context, iIsGooglePlayServicesAvailable, "e");
            android.util.Log.e("GooglePlayServicesUtil", "GooglePlayServices not available due to error " + iIsGooglePlayServicesAvailable);
            if (errorResolutionIntent != null) {
                throw new com.google.android.gms.common.GooglePlayServicesRepairableException(iIsGooglePlayServicesAvailable, "Google Play Services not available", errorResolutionIntent);
            }
            throw new com.google.android.gms.common.GooglePlayServicesNotAvailableException(iIsGooglePlayServicesAvailable);
        }
    }

    @java.lang.Deprecated
    public static int getApkVersion(android.content.Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            android.util.Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            return 0;
        }
    }

    @java.lang.Deprecated
    public static int getClientVersion(android.content.Context context) {
        com.google.android.gms.common.internal.Preconditions.checkState(true);
        return com.google.android.gms.common.util.ClientLibraryUtils.getClientVersion(context, context.getPackageName());
    }

    @java.lang.Deprecated
    public static android.app.PendingIntent getErrorPendingIntent(int i, android.content.Context context, int i2) {
        return com.google.android.gms.common.GoogleApiAvailabilityLight.getInstance().getErrorResolutionPendingIntent(context, i, i2);
    }

    @java.lang.Deprecated
    public static java.lang.String getErrorString(int i) {
        return com.google.android.gms.common.ConnectionResult.zza(i);
    }

    @java.lang.Deprecated
    public static android.content.Intent getGooglePlayServicesAvailabilityRecoveryIntent(int i) {
        return com.google.android.gms.common.GoogleApiAvailabilityLight.getInstance().getErrorResolutionIntent(null, i, null);
    }

    public static android.content.Context getRemoteContext(android.content.Context context) {
        try {
            return context.createPackageContext("com.google.android.gms", 3);
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static android.content.res.Resources getRemoteResource(android.content.Context context) {
        try {
            return context.getPackageManager().getResourcesForApplication("com.google.android.gms");
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static boolean honorsDebugCertificates(android.content.Context context) {
        try {
            if (!zza) {
                android.content.pm.PackageInfo packageInfo = com.google.android.gms.common.wrappers.Wrappers.packageManager(context).getPackageInfo("com.google.android.gms", android.os.Build.VERSION.SDK_INT >= 28 ? 134217792 : 64);
                com.google.android.gms.common.GoogleSignatureVerifier.getInstance(context);
                if (packageInfo == null || com.google.android.gms.common.GoogleSignatureVerifier.zza(packageInfo, false) || !com.google.android.gms.common.GoogleSignatureVerifier.zza(packageInfo, true)) {
                    zzb = false;
                } else {
                    zzb = true;
                }
            }
        } catch (android.content.pm.PackageManager.NameNotFoundException e) {
            android.util.Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e);
        } finally {
            zza = true;
        }
        return zzb || !com.google.android.gms.common.util.DeviceProperties.isUserBuild();
    }

    @java.lang.Deprecated
    public static int isGooglePlayServicesAvailable(android.content.Context context) {
        return isGooglePlayServicesAvailable(context, GOOGLE_PLAY_SERVICES_VERSION_CODE);
    }

    @java.lang.Deprecated
    public static boolean isGooglePlayServicesUid(android.content.Context context, int i) {
        return com.google.android.gms.common.util.UidVerifier.isGooglePlayServicesUid(context, i);
    }

    @java.lang.Deprecated
    public static boolean isPlayServicesPossiblyUpdating(android.content.Context context, int i) {
        if (i == 18) {
            return true;
        }
        if (i == 1) {
            return zza(context, "com.google.android.gms");
        }
        return false;
    }

    @java.lang.Deprecated
    public static boolean isPlayStorePossiblyUpdating(android.content.Context context, int i) {
        if (i == 9) {
            return zza(context, "com.android.vending");
        }
        return false;
    }

    public static boolean isRestrictedUserProfile(android.content.Context context) {
        java.lang.Object systemService = context.getSystemService("user");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(systemService);
        android.os.Bundle applicationRestrictions = ((android.os.UserManager) systemService).getApplicationRestrictions(context.getPackageName());
        return applicationRestrictions != null && com.json.mediationsdk.metadata.a.g.equals(applicationRestrictions.getString("restricted_profile"));
    }

    @java.lang.Deprecated
    public static boolean isSidewinderDevice(android.content.Context context) {
        return com.google.android.gms.common.util.DeviceProperties.isSidewinder(context);
    }

    @java.lang.Deprecated
    public static boolean isUserRecoverableError(int i) {
        return i == 1 || i == 2 || i == 3 || i == 9;
    }

    @java.lang.Deprecated
    public static boolean uidHasPackageName(android.content.Context context, int i, java.lang.String str) {
        return com.google.android.gms.common.util.UidVerifier.uidHasPackageName(context, i, str);
    }

    static boolean zza(android.content.Context context, java.lang.String str) throws android.content.pm.PackageManager.NameNotFoundException {
        boolean zEquals = str.equals("com.google.android.gms");
        try {
            java.util.Iterator<android.content.pm.PackageInstaller.SessionInfo> it = context.getPackageManager().getPackageInstaller().getAllSessions().iterator();
            while (it.hasNext()) {
                if (str.equals(it.next().getAppPackageName())) {
                    return true;
                }
            }
            android.content.pm.ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(str, 8192);
            if (zEquals) {
                return applicationInfo.enabled;
            }
            return applicationInfo.enabled && !isRestrictedUserProfile(context);
        } catch (android.content.pm.PackageManager.NameNotFoundException | java.lang.Exception unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:59:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:60:0x0118  */
    /* JADX WARN: Code duplicated, block: B:68:0x0134 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x0136 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:76:0x011c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:59:0x00f3, please report this as an issue */
    @java.lang.Deprecated
    public static int isGooglePlayServicesAvailable(android.content.Context context, int i) {
        android.content.pm.PackageInfo packageInfo;
        android.content.pm.ApplicationInfo applicationInfo;
        try {
            context.getResources().getString(com.google.android.gms.common.R.string.common_google_play_services_unknown_issue);
        } catch (java.lang.Throwable unused) {
            android.util.Log.e("GooglePlayServicesUtil", "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.");
        }
        if (!"com.google.android.gms".equals(context.getPackageName()) && !zzc.get()) {
            int iZza = com.google.android.gms.common.internal.zzag.zza(context);
            if (iZza == 0) {
                throw new com.google.android.gms.common.GooglePlayServicesMissingManifestValueException();
            }
            if (iZza != GOOGLE_PLAY_SERVICES_VERSION_CODE) {
                throw new com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException(iZza);
            }
        }
        boolean z = (com.google.android.gms.common.util.DeviceProperties.isWearableWithoutPlayStore(context) || com.google.android.gms.common.util.DeviceProperties.zzb(context)) ? false : true;
        com.google.android.gms.common.internal.Preconditions.checkArgument(i >= 0);
        java.lang.String packageName = context.getPackageName();
        android.content.pm.PackageManager packageManager = context.getPackageManager();
        if (z) {
            try {
                packageInfo = packageManager.getPackageInfo("com.android.vending", android.os.Build.VERSION.SDK_INT >= 28 ? 134225984 : 8256);
            } catch (android.content.pm.PackageManager.NameNotFoundException unused2) {
                android.util.Log.w("GooglePlayServicesUtil", java.lang.String.valueOf(packageName).concat(" requires the Google Play Store, but it is missing."));
            }
        } else {
            packageInfo = null;
        }
        try {
            android.content.pm.PackageInfo packageInfo2 = packageManager.getPackageInfo("com.google.android.gms", android.os.Build.VERSION.SDK_INT >= 28 ? 134217792 : 64);
            com.google.android.gms.common.GoogleSignatureVerifier.getInstance(context);
            if (!com.google.android.gms.common.GoogleSignatureVerifier.zza(packageInfo2, true)) {
                android.util.Log.w("GooglePlayServicesUtil", java.lang.String.valueOf(packageName).concat(" requires Google Play services, but their signature is invalid."));
            } else {
                if (!z) {
                    if (z) {
                    }
                    if (com.google.android.gms.common.util.zza.zza(packageInfo2.versionCode) >= com.google.android.gms.common.util.zza.zza(i)) {
                        applicationInfo = packageInfo2.applicationInfo;
                        if (applicationInfo == null) {
                            applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                        }
                        if (applicationInfo.enabled) {
                            return 0;
                        }
                        return 3;
                    }
                    android.util.Log.w("GooglePlayServicesUtil", "Google Play services out of date for " + packageName + ".  Requires " + i + " but found " + packageInfo2.versionCode);
                    return 2;
                }
                com.google.android.gms.common.internal.Preconditions.checkNotNull(packageInfo);
                if (!com.google.android.gms.common.GoogleSignatureVerifier.zza(packageInfo, true)) {
                    android.util.Log.w("GooglePlayServicesUtil", java.lang.String.valueOf(packageName).concat(" requires Google Play Store, but its signature is invalid."));
                } else {
                    if (z || packageInfo == null || packageInfo.signatures[0].equals(packageInfo2.signatures[0])) {
                        if (com.google.android.gms.common.util.zza.zza(packageInfo2.versionCode) >= com.google.android.gms.common.util.zza.zza(i)) {
                            android.util.Log.w("GooglePlayServicesUtil", "Google Play services out of date for " + packageName + ".  Requires " + i + " but found " + packageInfo2.versionCode);
                            return 2;
                        }
                        applicationInfo = packageInfo2.applicationInfo;
                        if (applicationInfo == null) {
                            try {
                                applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                            } catch (android.content.pm.PackageManager.NameNotFoundException e) {
                                android.util.Log.wtf("GooglePlayServicesUtil", java.lang.String.valueOf(packageName).concat(" requires Google Play services, but they're missing when getting application info."), e);
                                return 1;
                            }
                        }
                        if (applicationInfo.enabled) {
                            return 3;
                        }
                        return 0;
                    }
                    android.util.Log.w("GooglePlayServicesUtil", java.lang.String.valueOf(packageName).concat(" requires Google Play Store, but its signature doesn't match that of Google Play services."));
                }
            }
            return 9;
        } catch (android.content.pm.PackageManager.NameNotFoundException unused3) {
            android.util.Log.w("GooglePlayServicesUtil", java.lang.String.valueOf(packageName).concat(" requires Google Play services, but they are missing."));
            return 1;
        }
    }
}
