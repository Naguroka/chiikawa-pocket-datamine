package androidx.browser.customtabs;

/* JADX INFO: loaded from: classes.dex */
public class TrustedWebUtils {
    public static final java.lang.String ACTION_MANAGE_TRUSTED_WEB_ACTIVITY_DATA = "android.support.customtabs.action.ACTION_MANAGE_TRUSTED_WEB_ACTIVITY_DATA";
    public static final java.lang.String EXTRA_LAUNCH_AS_TRUSTED_WEB_ACTIVITY = "android.support.customtabs.extra.LAUNCH_AS_TRUSTED_WEB_ACTIVITY";

    private TrustedWebUtils() {
    }

    public static void launchBrowserSiteSettings(android.content.Context context, androidx.browser.customtabs.CustomTabsSession customTabsSession, android.net.Uri uri) {
        android.content.Intent intent = new android.content.Intent(ACTION_MANAGE_TRUSTED_WEB_ACTIVITY_DATA);
        intent.setPackage(customTabsSession.getComponentName().getPackageName());
        intent.setData(uri);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBinder(androidx.browser.customtabs.CustomTabsIntent.EXTRA_SESSION, customTabsSession.getBinder());
        intent.putExtras(bundle);
        android.app.PendingIntent id = customTabsSession.getId();
        if (id != null) {
            intent.putExtra(androidx.browser.customtabs.CustomTabsIntent.EXTRA_SESSION_ID, id);
        }
        context.startActivity(intent);
    }

    public static boolean areSplashScreensSupported(android.content.Context context, java.lang.String str, java.lang.String str2) {
        android.content.pm.ResolveInfo resolveInfoResolveService = context.getPackageManager().resolveService(new android.content.Intent().setAction(androidx.browser.customtabs.CustomTabsService.ACTION_CUSTOM_TABS_CONNECTION).setPackage(str), 64);
        if (resolveInfoResolveService == null || resolveInfoResolveService.filter == null) {
            return false;
        }
        return resolveInfoResolveService.filter.hasCategory(str2);
    }

    public static boolean transferSplashImage(android.content.Context context, java.io.File file, java.lang.String str, java.lang.String str2, androidx.browser.customtabs.CustomTabsSession customTabsSession) {
        android.net.Uri uriForFile = androidx.core.content.FileProvider.getUriForFile(context, str, file);
        context.grantUriPermission(str2, uriForFile, 1);
        return customTabsSession.receiveFile(uriForFile, 1, null);
    }

    @java.lang.Deprecated
    public static void launchAsTrustedWebActivity(android.content.Context context, androidx.browser.customtabs.CustomTabsIntent customTabsIntent, android.net.Uri uri) {
        if (customTabsIntent.intent.getExtras().getBinder(androidx.browser.customtabs.CustomTabsIntent.EXTRA_SESSION) == null) {
            throw new java.lang.IllegalArgumentException("Given CustomTabsIntent should be associated with a valid CustomTabsSession");
        }
        customTabsIntent.intent.putExtra(EXTRA_LAUNCH_AS_TRUSTED_WEB_ACTIVITY, true);
        customTabsIntent.launchUrl(context, uri);
    }
}
