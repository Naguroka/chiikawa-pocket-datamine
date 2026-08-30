package androidx.core.content;

/* JADX INFO: loaded from: classes.dex */
public final class IntentCompat {
    public static final java.lang.String ACTION_CREATE_REMINDER = "android.intent.action.CREATE_REMINDER";
    public static final java.lang.String CATEGORY_LEANBACK_LAUNCHER = "android.intent.category.LEANBACK_LAUNCHER";
    public static final java.lang.String EXTRA_HTML_TEXT = "android.intent.extra.HTML_TEXT";
    public static final java.lang.String EXTRA_START_PLAYBACK = "android.intent.extra.START_PLAYBACK";
    public static final java.lang.String EXTRA_TIME = "android.intent.extra.TIME";

    private IntentCompat() {
    }

    public static android.content.Intent makeMainSelectorActivity(java.lang.String str, java.lang.String str2) {
        return androidx.core.content.IntentCompat.Api15Impl.makeMainSelectorActivity(str, str2);
    }

    public static android.content.Intent createManageUnusedAppRestrictionsIntent(android.content.Context context, java.lang.String str) {
        if (!androidx.core.content.PackageManagerCompat.areUnusedAppRestrictionsAvailable(context.getPackageManager())) {
            throw new java.lang.UnsupportedOperationException("Unused App Restriction features are not available on this device");
        }
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            return new android.content.Intent("android.settings.APPLICATION_DETAILS_SETTINGS").setData(android.net.Uri.fromParts("package", str, null));
        }
        android.content.Intent data = new android.content.Intent(androidx.core.content.PackageManagerCompat.ACTION_PERMISSION_REVOCATION_SETTINGS).setData(android.net.Uri.fromParts("package", str, null));
        return android.os.Build.VERSION.SDK_INT >= 30 ? data : data.setPackage((java.lang.String) androidx.core.util.Preconditions.checkNotNull(androidx.core.content.PackageManagerCompat.getPermissionRevocationVerifierApp(context.getPackageManager())));
    }

    static class Api15Impl {
        private Api15Impl() {
        }

        static android.content.Intent makeMainSelectorActivity(java.lang.String str, java.lang.String str2) {
            return android.content.Intent.makeMainSelectorActivity(str, str2);
        }
    }
}
