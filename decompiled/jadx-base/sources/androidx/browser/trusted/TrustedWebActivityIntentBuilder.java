package androidx.browser.trusted;

/* JADX INFO: loaded from: classes.dex */
public class TrustedWebActivityIntentBuilder {
    public static final java.lang.String EXTRA_ADDITIONAL_TRUSTED_ORIGINS = "android.support.customtabs.extra.ADDITIONAL_TRUSTED_ORIGINS";
    public static final java.lang.String EXTRA_DISPLAY_MODE = "androidx.browser.trusted.extra.DISPLAY_MODE";
    public static final java.lang.String EXTRA_SCREEN_ORIENTATION = "androidx.browser.trusted.extra.SCREEN_ORIENTATION";
    public static final java.lang.String EXTRA_SHARE_DATA = "androidx.browser.trusted.extra.SHARE_DATA";
    public static final java.lang.String EXTRA_SHARE_TARGET = "androidx.browser.trusted.extra.SHARE_TARGET";
    public static final java.lang.String EXTRA_SPLASH_SCREEN_PARAMS = "androidx.browser.trusted.EXTRA_SPLASH_SCREEN_PARAMS";
    private java.util.List<java.lang.String> mAdditionalTrustedOrigins;
    private androidx.browser.trusted.sharing.ShareData mShareData;
    private androidx.browser.trusted.sharing.ShareTarget mShareTarget;
    private android.os.Bundle mSplashScreenParams;
    private final android.net.Uri mUri;
    private final androidx.browser.customtabs.CustomTabsIntent.Builder mIntentBuilder = new androidx.browser.customtabs.CustomTabsIntent.Builder();
    private androidx.browser.trusted.TrustedWebActivityDisplayMode mDisplayMode = new androidx.browser.trusted.TrustedWebActivityDisplayMode.DefaultMode();
    private int mScreenOrientation = 0;

    public TrustedWebActivityIntentBuilder(android.net.Uri uri) {
        this.mUri = uri;
    }

    @java.lang.Deprecated
    public androidx.browser.trusted.TrustedWebActivityIntentBuilder setToolbarColor(int i) {
        this.mIntentBuilder.setToolbarColor(i);
        return this;
    }

    @java.lang.Deprecated
    public androidx.browser.trusted.TrustedWebActivityIntentBuilder setNavigationBarColor(int i) {
        this.mIntentBuilder.setNavigationBarColor(i);
        return this;
    }

    @java.lang.Deprecated
    public androidx.browser.trusted.TrustedWebActivityIntentBuilder setNavigationBarDividerColor(int i) {
        this.mIntentBuilder.setNavigationBarDividerColor(i);
        return this;
    }

    public androidx.browser.trusted.TrustedWebActivityIntentBuilder setColorScheme(int i) {
        this.mIntentBuilder.setColorScheme(i);
        return this;
    }

    public androidx.browser.trusted.TrustedWebActivityIntentBuilder setColorSchemeParams(int i, androidx.browser.customtabs.CustomTabColorSchemeParams customTabColorSchemeParams) {
        this.mIntentBuilder.setColorSchemeParams(i, customTabColorSchemeParams);
        return this;
    }

    public androidx.browser.trusted.TrustedWebActivityIntentBuilder setDefaultColorSchemeParams(androidx.browser.customtabs.CustomTabColorSchemeParams customTabColorSchemeParams) {
        this.mIntentBuilder.setDefaultColorSchemeParams(customTabColorSchemeParams);
        return this;
    }

    public androidx.browser.trusted.TrustedWebActivityIntentBuilder setAdditionalTrustedOrigins(java.util.List<java.lang.String> list) {
        this.mAdditionalTrustedOrigins = list;
        return this;
    }

    public androidx.browser.trusted.TrustedWebActivityIntentBuilder setSplashScreenParams(android.os.Bundle bundle) {
        this.mSplashScreenParams = bundle;
        return this;
    }

    public androidx.browser.trusted.TrustedWebActivityIntentBuilder setShareParams(androidx.browser.trusted.sharing.ShareTarget shareTarget, androidx.browser.trusted.sharing.ShareData shareData) {
        this.mShareTarget = shareTarget;
        this.mShareData = shareData;
        return this;
    }

    public androidx.browser.trusted.TrustedWebActivityIntentBuilder setDisplayMode(androidx.browser.trusted.TrustedWebActivityDisplayMode trustedWebActivityDisplayMode) {
        this.mDisplayMode = trustedWebActivityDisplayMode;
        return this;
    }

    public androidx.browser.trusted.TrustedWebActivityIntentBuilder setScreenOrientation(int i) {
        this.mScreenOrientation = i;
        return this;
    }

    public androidx.browser.trusted.TrustedWebActivityIntent build(androidx.browser.customtabs.CustomTabsSession customTabsSession) {
        if (customTabsSession == null) {
            throw new java.lang.NullPointerException("CustomTabsSession is required for launching a TWA");
        }
        this.mIntentBuilder.setSession(customTabsSession);
        android.content.Intent intent = this.mIntentBuilder.build().intent;
        intent.setData(this.mUri);
        intent.putExtra(androidx.browser.customtabs.TrustedWebUtils.EXTRA_LAUNCH_AS_TRUSTED_WEB_ACTIVITY, true);
        if (this.mAdditionalTrustedOrigins != null) {
            intent.putExtra(EXTRA_ADDITIONAL_TRUSTED_ORIGINS, new java.util.ArrayList(this.mAdditionalTrustedOrigins));
        }
        android.os.Bundle bundle = this.mSplashScreenParams;
        if (bundle != null) {
            intent.putExtra(EXTRA_SPLASH_SCREEN_PARAMS, bundle);
        }
        java.util.List<android.net.Uri> listEmptyList = java.util.Collections.emptyList();
        androidx.browser.trusted.sharing.ShareTarget shareTarget = this.mShareTarget;
        if (shareTarget != null && this.mShareData != null) {
            intent.putExtra(EXTRA_SHARE_TARGET, shareTarget.toBundle());
            intent.putExtra(EXTRA_SHARE_DATA, this.mShareData.toBundle());
            if (this.mShareData.uris != null) {
                listEmptyList = this.mShareData.uris;
            }
        }
        intent.putExtra(EXTRA_DISPLAY_MODE, this.mDisplayMode.toBundle());
        intent.putExtra(EXTRA_SCREEN_ORIENTATION, this.mScreenOrientation);
        return new androidx.browser.trusted.TrustedWebActivityIntent(intent, listEmptyList);
    }

    public androidx.browser.customtabs.CustomTabsIntent buildCustomTabsIntent() {
        return this.mIntentBuilder.build();
    }

    public android.net.Uri getUri() {
        return this.mUri;
    }

    public androidx.browser.trusted.TrustedWebActivityDisplayMode getDisplayMode() {
        return this.mDisplayMode;
    }
}
