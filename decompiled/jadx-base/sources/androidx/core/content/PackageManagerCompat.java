package androidx.core.content;

/* JADX INFO: loaded from: classes.dex */
public final class PackageManagerCompat {
    public static final java.lang.String ACTION_PERMISSION_REVOCATION_SETTINGS = "android.intent.action.AUTO_REVOKE_PERMISSIONS";
    public static final java.lang.String LOG_TAG = "PackageManagerCompat";

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface UnusedAppRestrictionsStatus {
    }

    private PackageManagerCompat() {
    }

    public static com.google.common.util.concurrent.ListenableFuture<java.lang.Integer> getUnusedAppRestrictionsStatus(android.content.Context context) {
        androidx.concurrent.futures.ResolvableFuture<java.lang.Integer> resolvableFutureCreate = androidx.concurrent.futures.ResolvableFuture.create();
        if (!androidx.core.os.UserManagerCompat.isUserUnlocked(context)) {
            resolvableFutureCreate.set(0);
            android.util.Log.e(LOG_TAG, "User is in locked direct boot mode");
            return resolvableFutureCreate;
        }
        if (!areUnusedAppRestrictionsAvailable(context.getPackageManager())) {
            resolvableFutureCreate.set(1);
            return resolvableFutureCreate;
        }
        int i = context.getApplicationInfo().targetSdkVersion;
        if (i < 30) {
            resolvableFutureCreate.set(0);
            android.util.Log.e(LOG_TAG, "Target SDK version below API 30");
            return resolvableFutureCreate;
        }
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            if (androidx.core.content.PackageManagerCompat.Api30Impl.areUnusedAppRestrictionsEnabled(context)) {
                resolvableFutureCreate.set(java.lang.Integer.valueOf(i >= 31 ? 5 : 4));
            } else {
                resolvableFutureCreate.set(2);
            }
            return resolvableFutureCreate;
        }
        if (android.os.Build.VERSION.SDK_INT == 30) {
            resolvableFutureCreate.set(java.lang.Integer.valueOf(androidx.core.content.PackageManagerCompat.Api30Impl.areUnusedAppRestrictionsEnabled(context) ? 4 : 2));
            return resolvableFutureCreate;
        }
        final androidx.core.content.UnusedAppRestrictionsBackportServiceConnection unusedAppRestrictionsBackportServiceConnection = new androidx.core.content.UnusedAppRestrictionsBackportServiceConnection(context);
        java.util.Objects.requireNonNull(unusedAppRestrictionsBackportServiceConnection);
        resolvableFutureCreate.addListener(new java.lang.Runnable() { // from class: androidx.core.content.PackageManagerCompat$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                unusedAppRestrictionsBackportServiceConnection.disconnectFromService();
            }
        }, java.util.concurrent.Executors.newSingleThreadExecutor());
        unusedAppRestrictionsBackportServiceConnection.connectAndFetchResult(resolvableFutureCreate);
        return resolvableFutureCreate;
    }

    public static boolean areUnusedAppRestrictionsAvailable(android.content.pm.PackageManager packageManager) {
        boolean z = android.os.Build.VERSION.SDK_INT >= 30;
        boolean z2 = android.os.Build.VERSION.SDK_INT < 30;
        boolean z3 = getPermissionRevocationVerifierApp(packageManager) != null;
        if (z) {
            return true;
        }
        return z2 && z3;
    }

    public static java.lang.String getPermissionRevocationVerifierApp(android.content.pm.PackageManager packageManager) {
        java.lang.String str = null;
        java.util.Iterator<android.content.pm.ResolveInfo> it = packageManager.queryIntentActivities(new android.content.Intent(ACTION_PERMISSION_REVOCATION_SETTINGS).setData(android.net.Uri.fromParts("package", "com.example", null)), 0).iterator();
        while (it.hasNext()) {
            java.lang.String str2 = it.next().activityInfo.packageName;
            if (packageManager.checkPermission("android.permission.PACKAGE_VERIFICATION_AGENT", str2) == 0) {
                if (str != null) {
                    return str;
                }
                str = str2;
            }
        }
        return str;
    }

    private static class Api30Impl {
        private Api30Impl() {
        }

        static boolean areUnusedAppRestrictionsEnabled(android.content.Context context) {
            return !context.getPackageManager().isAutoRevokeWhitelisted();
        }
    }
}
