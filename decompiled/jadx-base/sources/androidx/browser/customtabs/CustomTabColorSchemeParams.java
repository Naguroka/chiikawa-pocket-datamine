package androidx.browser.customtabs;

/* JADX INFO: loaded from: classes.dex */
public final class CustomTabColorSchemeParams {
    public final java.lang.Integer navigationBarColor;
    public final java.lang.Integer navigationBarDividerColor;
    public final java.lang.Integer secondaryToolbarColor;
    public final java.lang.Integer toolbarColor;

    CustomTabColorSchemeParams(java.lang.Integer num, java.lang.Integer num2, java.lang.Integer num3, java.lang.Integer num4) {
        this.toolbarColor = num;
        this.secondaryToolbarColor = num2;
        this.navigationBarColor = num3;
        this.navigationBarDividerColor = num4;
    }

    android.os.Bundle toBundle() {
        android.os.Bundle bundle = new android.os.Bundle();
        java.lang.Integer num = this.toolbarColor;
        if (num != null) {
            bundle.putInt(androidx.browser.customtabs.CustomTabsIntent.EXTRA_TOOLBAR_COLOR, num.intValue());
        }
        java.lang.Integer num2 = this.secondaryToolbarColor;
        if (num2 != null) {
            bundle.putInt(androidx.browser.customtabs.CustomTabsIntent.EXTRA_SECONDARY_TOOLBAR_COLOR, num2.intValue());
        }
        java.lang.Integer num3 = this.navigationBarColor;
        if (num3 != null) {
            bundle.putInt(androidx.browser.customtabs.CustomTabsIntent.EXTRA_NAVIGATION_BAR_COLOR, num3.intValue());
        }
        java.lang.Integer num4 = this.navigationBarDividerColor;
        if (num4 != null) {
            bundle.putInt(androidx.browser.customtabs.CustomTabsIntent.EXTRA_NAVIGATION_BAR_DIVIDER_COLOR, num4.intValue());
        }
        return bundle;
    }

    static androidx.browser.customtabs.CustomTabColorSchemeParams fromBundle(android.os.Bundle bundle) {
        if (bundle == null) {
            bundle = new android.os.Bundle(0);
        }
        return new androidx.browser.customtabs.CustomTabColorSchemeParams((java.lang.Integer) bundle.get(androidx.browser.customtabs.CustomTabsIntent.EXTRA_TOOLBAR_COLOR), (java.lang.Integer) bundle.get(androidx.browser.customtabs.CustomTabsIntent.EXTRA_SECONDARY_TOOLBAR_COLOR), (java.lang.Integer) bundle.get(androidx.browser.customtabs.CustomTabsIntent.EXTRA_NAVIGATION_BAR_COLOR), (java.lang.Integer) bundle.get(androidx.browser.customtabs.CustomTabsIntent.EXTRA_NAVIGATION_BAR_DIVIDER_COLOR));
    }

    androidx.browser.customtabs.CustomTabColorSchemeParams withDefaults(androidx.browser.customtabs.CustomTabColorSchemeParams customTabColorSchemeParams) {
        java.lang.Integer num = this.toolbarColor;
        if (num == null) {
            num = customTabColorSchemeParams.toolbarColor;
        }
        java.lang.Integer num2 = this.secondaryToolbarColor;
        if (num2 == null) {
            num2 = customTabColorSchemeParams.secondaryToolbarColor;
        }
        java.lang.Integer num3 = this.navigationBarColor;
        if (num3 == null) {
            num3 = customTabColorSchemeParams.navigationBarColor;
        }
        java.lang.Integer num4 = this.navigationBarDividerColor;
        if (num4 == null) {
            num4 = customTabColorSchemeParams.navigationBarDividerColor;
        }
        return new androidx.browser.customtabs.CustomTabColorSchemeParams(num, num2, num3, num4);
    }

    public static final class Builder {
        private java.lang.Integer mNavigationBarColor;
        private java.lang.Integer mNavigationBarDividerColor;
        private java.lang.Integer mSecondaryToolbarColor;
        private java.lang.Integer mToolbarColor;

        public androidx.browser.customtabs.CustomTabColorSchemeParams.Builder setToolbarColor(int i) {
            this.mToolbarColor = java.lang.Integer.valueOf(i | androidx.core.view.ViewCompat.MEASURED_STATE_MASK);
            return this;
        }

        public androidx.browser.customtabs.CustomTabColorSchemeParams.Builder setSecondaryToolbarColor(int i) {
            this.mSecondaryToolbarColor = java.lang.Integer.valueOf(i);
            return this;
        }

        public androidx.browser.customtabs.CustomTabColorSchemeParams.Builder setNavigationBarColor(int i) {
            this.mNavigationBarColor = java.lang.Integer.valueOf(i | androidx.core.view.ViewCompat.MEASURED_STATE_MASK);
            return this;
        }

        public androidx.browser.customtabs.CustomTabColorSchemeParams.Builder setNavigationBarDividerColor(int i) {
            this.mNavigationBarDividerColor = java.lang.Integer.valueOf(i);
            return this;
        }

        public androidx.browser.customtabs.CustomTabColorSchemeParams build() {
            return new androidx.browser.customtabs.CustomTabColorSchemeParams(this.mToolbarColor, this.mSecondaryToolbarColor, this.mNavigationBarColor, this.mNavigationBarDividerColor);
        }
    }
}
