package androidx.webkit;

/* JADX INFO: loaded from: classes3.dex */
public class WebSettingsCompat {
    public static final int ATTRIBUTION_BEHAVIOR_APP_SOURCE_AND_APP_TRIGGER = 3;
    public static final int ATTRIBUTION_BEHAVIOR_APP_SOURCE_AND_WEB_TRIGGER = 1;
    public static final int ATTRIBUTION_BEHAVIOR_DISABLED = 0;
    public static final int ATTRIBUTION_BEHAVIOR_WEB_SOURCE_AND_WEB_TRIGGER = 2;

    @java.lang.Deprecated
    public static final int DARK_STRATEGY_PREFER_WEB_THEME_OVER_USER_AGENT_DARKENING = 2;

    @java.lang.Deprecated
    public static final int DARK_STRATEGY_USER_AGENT_DARKENING_ONLY = 0;

    @java.lang.Deprecated
    public static final int DARK_STRATEGY_WEB_THEME_DARKENING_ONLY = 1;

    @java.lang.Deprecated
    public static final int FORCE_DARK_AUTO = 1;

    @java.lang.Deprecated
    public static final int FORCE_DARK_OFF = 0;

    @java.lang.Deprecated
    public static final int FORCE_DARK_ON = 2;

    @java.lang.annotation.Target({java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.METHOD})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface ForceDark {
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.METHOD})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface ForceDarkStrategy {
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.METHOD})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface MenuItemFlags {
    }

    private WebSettingsCompat() {
    }

    public static void setOffscreenPreRaster(android.webkit.WebSettings webSettings, boolean z) {
        androidx.webkit.internal.ApiFeature.M m = androidx.webkit.internal.WebViewFeatureInternal.OFF_SCREEN_PRERASTER;
        if (m.isSupportedByFramework()) {
            androidx.webkit.internal.ApiHelperForM.setOffscreenPreRaster(webSettings, z);
        } else {
            if (m.isSupportedByWebView()) {
                getAdapter(webSettings).setOffscreenPreRaster(z);
                return;
            }
            throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
        }
    }

    public static boolean getOffscreenPreRaster(android.webkit.WebSettings webSettings) {
        androidx.webkit.internal.ApiFeature.M m = androidx.webkit.internal.WebViewFeatureInternal.OFF_SCREEN_PRERASTER;
        if (m.isSupportedByFramework()) {
            return androidx.webkit.internal.ApiHelperForM.getOffscreenPreRaster(webSettings);
        }
        if (m.isSupportedByWebView()) {
            return getAdapter(webSettings).getOffscreenPreRaster();
        }
        throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static void setSafeBrowsingEnabled(android.webkit.WebSettings webSettings, boolean z) {
        androidx.webkit.internal.ApiFeature.O o = androidx.webkit.internal.WebViewFeatureInternal.SAFE_BROWSING_ENABLE;
        if (o.isSupportedByFramework()) {
            androidx.webkit.internal.ApiHelperForO.setSafeBrowsingEnabled(webSettings, z);
        } else {
            if (o.isSupportedByWebView()) {
                getAdapter(webSettings).setSafeBrowsingEnabled(z);
                return;
            }
            throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
        }
    }

    public static boolean getSafeBrowsingEnabled(android.webkit.WebSettings webSettings) {
        androidx.webkit.internal.ApiFeature.O o = androidx.webkit.internal.WebViewFeatureInternal.SAFE_BROWSING_ENABLE;
        if (o.isSupportedByFramework()) {
            return androidx.webkit.internal.ApiHelperForO.getSafeBrowsingEnabled(webSettings);
        }
        if (o.isSupportedByWebView()) {
            return getAdapter(webSettings).getSafeBrowsingEnabled();
        }
        throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static void setDisabledActionModeMenuItems(android.webkit.WebSettings webSettings, int i) {
        androidx.webkit.internal.ApiFeature.N n = androidx.webkit.internal.WebViewFeatureInternal.DISABLED_ACTION_MODE_MENU_ITEMS;
        if (n.isSupportedByFramework()) {
            androidx.webkit.internal.ApiHelperForN.setDisabledActionModeMenuItems(webSettings, i);
        } else {
            if (n.isSupportedByWebView()) {
                getAdapter(webSettings).setDisabledActionModeMenuItems(i);
                return;
            }
            throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
        }
    }

    public static int getDisabledActionModeMenuItems(android.webkit.WebSettings webSettings) {
        androidx.webkit.internal.ApiFeature.N n = androidx.webkit.internal.WebViewFeatureInternal.DISABLED_ACTION_MODE_MENU_ITEMS;
        if (n.isSupportedByFramework()) {
            return androidx.webkit.internal.ApiHelperForN.getDisabledActionModeMenuItems(webSettings);
        }
        if (n.isSupportedByWebView()) {
            return getAdapter(webSettings).getDisabledActionModeMenuItems();
        }
        throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
    }

    @java.lang.Deprecated
    public static void setForceDark(android.webkit.WebSettings webSettings, int i) {
        androidx.webkit.internal.ApiFeature.Q q = androidx.webkit.internal.WebViewFeatureInternal.FORCE_DARK;
        if (q.isSupportedByFramework()) {
            androidx.webkit.internal.ApiHelperForQ.setForceDark(webSettings, i);
        } else {
            if (q.isSupportedByWebView()) {
                getAdapter(webSettings).setForceDark(i);
                return;
            }
            throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
        }
    }

    @java.lang.Deprecated
    public static int getForceDark(android.webkit.WebSettings webSettings) {
        androidx.webkit.internal.ApiFeature.Q q = androidx.webkit.internal.WebViewFeatureInternal.FORCE_DARK;
        if (q.isSupportedByFramework()) {
            return androidx.webkit.internal.ApiHelperForQ.getForceDark(webSettings);
        }
        if (q.isSupportedByWebView()) {
            return getAdapter(webSettings).getForceDark();
        }
        throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static void setAlgorithmicDarkeningAllowed(android.webkit.WebSettings webSettings, boolean z) {
        if (androidx.webkit.internal.WebViewFeatureInternal.ALGORITHMIC_DARKENING.isSupportedByWebView()) {
            getAdapter(webSettings).setAlgorithmicDarkeningAllowed(z);
            return;
        }
        throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static boolean isAlgorithmicDarkeningAllowed(android.webkit.WebSettings webSettings) {
        if (androidx.webkit.internal.WebViewFeatureInternal.ALGORITHMIC_DARKENING.isSupportedByWebView()) {
            return getAdapter(webSettings).isAlgorithmicDarkeningAllowed();
        }
        throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
    }

    @java.lang.Deprecated
    public static void setForceDarkStrategy(android.webkit.WebSettings webSettings, int i) {
        if (androidx.webkit.internal.WebViewFeatureInternal.FORCE_DARK_STRATEGY.isSupportedByWebView()) {
            getAdapter(webSettings).setForceDarkStrategy(i);
            return;
        }
        throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
    }

    @java.lang.Deprecated
    public static int getForceDarkStrategy(android.webkit.WebSettings webSettings) {
        if (androidx.webkit.internal.WebViewFeatureInternal.FORCE_DARK_STRATEGY.isSupportedByWebView()) {
            return getAdapter(webSettings).getForceDark();
        }
        throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static void setEnterpriseAuthenticationAppLinkPolicyEnabled(android.webkit.WebSettings webSettings, boolean z) {
        if (androidx.webkit.internal.WebViewFeatureInternal.ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY.isSupportedByWebView()) {
            getAdapter(webSettings).setEnterpriseAuthenticationAppLinkPolicyEnabled(z);
            return;
        }
        throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static boolean getEnterpriseAuthenticationAppLinkPolicyEnabled(android.webkit.WebSettings webSettings) {
        if (androidx.webkit.internal.WebViewFeatureInternal.ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY.isSupportedByWebView()) {
            return getAdapter(webSettings).getEnterpriseAuthenticationAppLinkPolicyEnabled();
        }
        throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static java.util.Set<java.lang.String> getRequestedWithHeaderOriginAllowList(android.webkit.WebSettings webSettings) {
        if (androidx.webkit.internal.WebViewFeatureInternal.REQUESTED_WITH_HEADER_ALLOW_LIST.isSupportedByWebView()) {
            return getAdapter(webSettings).getRequestedWithHeaderOriginAllowList();
        }
        throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static void setRequestedWithHeaderOriginAllowList(android.webkit.WebSettings webSettings, java.util.Set<java.lang.String> set) {
        if (androidx.webkit.internal.WebViewFeatureInternal.REQUESTED_WITH_HEADER_ALLOW_LIST.isSupportedByWebView()) {
            getAdapter(webSettings).setRequestedWithHeaderOriginAllowList(set);
            return;
        }
        throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static void setUserAgentMetadata(android.webkit.WebSettings webSettings, androidx.webkit.UserAgentMetadata userAgentMetadata) {
        if (androidx.webkit.internal.WebViewFeatureInternal.USER_AGENT_METADATA.isSupportedByWebView()) {
            getAdapter(webSettings).setUserAgentMetadata(userAgentMetadata);
            return;
        }
        throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static androidx.webkit.UserAgentMetadata getUserAgentMetadata(android.webkit.WebSettings webSettings) {
        if (androidx.webkit.internal.WebViewFeatureInternal.USER_AGENT_METADATA.isSupportedByWebView()) {
            return getAdapter(webSettings).getUserAgentMetadata();
        }
        throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static void setAttributionRegistrationBehavior(android.webkit.WebSettings webSettings, int i) {
        if (androidx.webkit.internal.WebViewFeatureInternal.ATTRIBUTION_REGISTRATION_BEHAVIOR.isSupportedByWebView()) {
            getAdapter(webSettings).setAttributionRegistrationBehavior(i);
            return;
        }
        throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static int getAttributionRegistrationBehavior(android.webkit.WebSettings webSettings) {
        if (androidx.webkit.internal.WebViewFeatureInternal.ATTRIBUTION_REGISTRATION_BEHAVIOR.isSupportedByWebView()) {
            return getAdapter(webSettings).getAttributionRegistrationBehavior();
        }
        throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static void setWebViewMediaIntegrityApiStatus(android.webkit.WebSettings webSettings, androidx.webkit.WebViewMediaIntegrityApiStatusConfig webViewMediaIntegrityApiStatusConfig) {
        if (androidx.webkit.internal.WebViewFeatureInternal.WEBVIEW_MEDIA_INTEGRITY_API_STATUS.isSupportedByWebView()) {
            getAdapter(webSettings).setWebViewMediaIntegrityApiStatus(webViewMediaIntegrityApiStatusConfig);
            return;
        }
        throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static androidx.webkit.WebViewMediaIntegrityApiStatusConfig getWebViewMediaIntegrityApiStatus(android.webkit.WebSettings webSettings) {
        if (androidx.webkit.internal.WebViewFeatureInternal.WEBVIEW_MEDIA_INTEGRITY_API_STATUS.isSupportedByWebView()) {
            return getAdapter(webSettings).getWebViewMediaIntegrityApiStatus();
        }
        throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
    }

    private static androidx.webkit.internal.WebSettingsAdapter getAdapter(android.webkit.WebSettings webSettings) {
        return androidx.webkit.internal.WebViewGlueCommunicator.getCompatConverter().convertSettings(webSettings);
    }
}
