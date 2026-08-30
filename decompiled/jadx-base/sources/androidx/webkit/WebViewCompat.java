package androidx.webkit;

/* JADX INFO: loaded from: classes3.dex */
public class WebViewCompat {
    private static final android.net.Uri WILDCARD_URI = android.net.Uri.parse(androidx.webkit.ProxyConfig.MATCH_ALL_SCHEMES);
    private static final android.net.Uri EMPTY_URI = android.net.Uri.parse("");

    public interface VisualStateCallback {
        void onComplete(long j);
    }

    public interface WebMessageListener {
        void onPostMessage(android.webkit.WebView webView, androidx.webkit.WebMessageCompat webMessageCompat, android.net.Uri uri, boolean z, androidx.webkit.JavaScriptReplyProxy javaScriptReplyProxy);
    }

    private WebViewCompat() {
    }

    public static void postVisualStateCallback(android.webkit.WebView webView, long j, androidx.webkit.WebViewCompat.VisualStateCallback visualStateCallback) {
        androidx.webkit.internal.ApiFeature.M m = androidx.webkit.internal.WebViewFeatureInternal.VISUAL_STATE_CALLBACK;
        if (m.isSupportedByFramework()) {
            androidx.webkit.internal.ApiHelperForM.postVisualStateCallback(webView, j, visualStateCallback);
        } else {
            if (m.isSupportedByWebView()) {
                checkThread(webView);
                getProvider(webView).insertVisualStateCallback(j, visualStateCallback);
                return;
            }
            throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
        }
    }

    public static void startSafeBrowsing(android.content.Context context, android.webkit.ValueCallback<java.lang.Boolean> valueCallback) {
        androidx.webkit.internal.ApiFeature.O_MR1 o_mr1 = androidx.webkit.internal.WebViewFeatureInternal.START_SAFE_BROWSING;
        if (o_mr1.isSupportedByFramework()) {
            androidx.webkit.internal.ApiHelperForOMR1.startSafeBrowsing(context, valueCallback);
        } else {
            if (o_mr1.isSupportedByWebView()) {
                getFactory().getStatics().initSafeBrowsing(context, valueCallback);
                return;
            }
            throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
        }
    }

    public static void setSafeBrowsingAllowlist(java.util.Set<java.lang.String> set, android.webkit.ValueCallback<java.lang.Boolean> valueCallback) {
        androidx.webkit.internal.ApiFeature.O_MR1 o_mr1 = androidx.webkit.internal.WebViewFeatureInternal.SAFE_BROWSING_ALLOWLIST_PREFERRED_TO_PREFERRED;
        androidx.webkit.internal.ApiFeature.O_MR1 o_mr2 = androidx.webkit.internal.WebViewFeatureInternal.SAFE_BROWSING_ALLOWLIST_PREFERRED_TO_DEPRECATED;
        if (o_mr1.isSupportedByWebView()) {
            getFactory().getStatics().setSafeBrowsingAllowlist(set, valueCallback);
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(set);
        if (o_mr2.isSupportedByFramework()) {
            androidx.webkit.internal.ApiHelperForOMR1.setSafeBrowsingWhitelist(arrayList, valueCallback);
        } else {
            if (o_mr2.isSupportedByWebView()) {
                getFactory().getStatics().setSafeBrowsingWhitelist(arrayList, valueCallback);
                return;
            }
            throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
        }
    }

    @java.lang.Deprecated
    public static void setSafeBrowsingWhitelist(java.util.List<java.lang.String> list, android.webkit.ValueCallback<java.lang.Boolean> valueCallback) {
        setSafeBrowsingAllowlist(new java.util.HashSet(list), valueCallback);
    }

    public static android.net.Uri getSafeBrowsingPrivacyPolicyUrl() {
        androidx.webkit.internal.ApiFeature.O_MR1 o_mr1 = androidx.webkit.internal.WebViewFeatureInternal.SAFE_BROWSING_PRIVACY_POLICY_URL;
        if (o_mr1.isSupportedByFramework()) {
            return androidx.webkit.internal.ApiHelperForOMR1.getSafeBrowsingPrivacyPolicyUrl();
        }
        if (o_mr1.isSupportedByWebView()) {
            return getFactory().getStatics().getSafeBrowsingPrivacyPolicyUrl();
        }
        throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static android.content.pm.PackageInfo getCurrentWebViewPackage(android.content.Context context) {
        android.content.pm.PackageInfo currentLoadedWebViewPackage = getCurrentLoadedWebViewPackage();
        return currentLoadedWebViewPackage != null ? currentLoadedWebViewPackage : getNotYetLoadedWebViewPackageInfo(context);
    }

    public static android.content.pm.PackageInfo getCurrentLoadedWebViewPackage() {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            return androidx.webkit.internal.ApiHelperForO.getCurrentWebViewPackage();
        }
        try {
            return getLoadedWebViewPackageInfo();
        } catch (java.lang.ClassNotFoundException | java.lang.IllegalAccessException | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException unused) {
            return null;
        }
    }

    private static android.content.pm.PackageInfo getLoadedWebViewPackageInfo() throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.ClassNotFoundException, java.lang.reflect.InvocationTargetException {
        return (android.content.pm.PackageInfo) java.lang.Class.forName("android.webkit.WebViewFactory").getMethod("getLoadedPackageInfo", new java.lang.Class[0]).invoke(null, new java.lang.Object[0]);
    }

    private static android.content.pm.PackageInfo getNotYetLoadedWebViewPackageInfo(android.content.Context context) {
        try {
            java.lang.String str = (java.lang.String) java.lang.Class.forName("android.webkit.WebViewUpdateService").getMethod("getCurrentWebViewPackageName", new java.lang.Class[0]).invoke(null, new java.lang.Object[0]);
            if (str == null) {
                return null;
            }
            return context.getPackageManager().getPackageInfo(str, 0);
        } catch (android.content.pm.PackageManager.NameNotFoundException | java.lang.ClassNotFoundException | java.lang.IllegalAccessException | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException unused) {
            return null;
        }
    }

    private static androidx.webkit.internal.WebViewProviderAdapter getProvider(android.webkit.WebView webView) {
        return new androidx.webkit.internal.WebViewProviderAdapter(createProvider(webView));
    }

    public static androidx.webkit.WebMessagePortCompat[] createWebMessageChannel(android.webkit.WebView webView) {
        androidx.webkit.internal.ApiFeature.M m = androidx.webkit.internal.WebViewFeatureInternal.CREATE_WEB_MESSAGE_CHANNEL;
        if (m.isSupportedByFramework()) {
            return androidx.webkit.internal.WebMessagePortImpl.portsToCompat(androidx.webkit.internal.ApiHelperForM.createWebMessageChannel(webView));
        }
        if (m.isSupportedByWebView()) {
            return getProvider(webView).createWebMessageChannel();
        }
        throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static void postWebMessage(android.webkit.WebView webView, androidx.webkit.WebMessageCompat webMessageCompat, android.net.Uri uri) {
        if (WILDCARD_URI.equals(uri)) {
            uri = EMPTY_URI;
        }
        androidx.webkit.internal.ApiFeature.M m = androidx.webkit.internal.WebViewFeatureInternal.POST_WEB_MESSAGE;
        if (m.isSupportedByFramework() && webMessageCompat.getType() == 0) {
            androidx.webkit.internal.ApiHelperForM.postWebMessage(webView, androidx.webkit.internal.WebMessagePortImpl.compatToFrameworkMessage(webMessageCompat), uri);
        } else {
            if (m.isSupportedByWebView() && androidx.webkit.internal.WebMessageAdapter.isMessagePayloadTypeSupportedByWebView(webMessageCompat.getType())) {
                getProvider(webView).postWebMessage(webMessageCompat, uri);
                return;
            }
            throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
        }
    }

    public static void addWebMessageListener(android.webkit.WebView webView, java.lang.String str, java.util.Set<java.lang.String> set, androidx.webkit.WebViewCompat.WebMessageListener webMessageListener) {
        if (androidx.webkit.internal.WebViewFeatureInternal.WEB_MESSAGE_LISTENER.isSupportedByWebView()) {
            getProvider(webView).addWebMessageListener(str, (java.lang.String[]) set.toArray(new java.lang.String[0]), webMessageListener);
            return;
        }
        throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static void removeWebMessageListener(android.webkit.WebView webView, java.lang.String str) {
        if (androidx.webkit.internal.WebViewFeatureInternal.WEB_MESSAGE_LISTENER.isSupportedByWebView()) {
            getProvider(webView).removeWebMessageListener(str);
            return;
        }
        throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static androidx.webkit.ScriptHandler addDocumentStartJavaScript(android.webkit.WebView webView, java.lang.String str, java.util.Set<java.lang.String> set) {
        if (androidx.webkit.internal.WebViewFeatureInternal.DOCUMENT_START_SCRIPT.isSupportedByWebView()) {
            return getProvider(webView).addDocumentStartJavaScript(str, (java.lang.String[]) set.toArray(new java.lang.String[0]));
        }
        throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static android.webkit.WebViewClient getWebViewClient(android.webkit.WebView webView) {
        androidx.webkit.internal.ApiFeature.O o = androidx.webkit.internal.WebViewFeatureInternal.GET_WEB_VIEW_CLIENT;
        if (o.isSupportedByFramework()) {
            return androidx.webkit.internal.ApiHelperForO.getWebViewClient(webView);
        }
        if (o.isSupportedByWebView()) {
            return getProvider(webView).getWebViewClient();
        }
        throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static android.webkit.WebChromeClient getWebChromeClient(android.webkit.WebView webView) {
        androidx.webkit.internal.ApiFeature.O o = androidx.webkit.internal.WebViewFeatureInternal.GET_WEB_CHROME_CLIENT;
        if (o.isSupportedByFramework()) {
            return androidx.webkit.internal.ApiHelperForO.getWebChromeClient(webView);
        }
        if (o.isSupportedByWebView()) {
            return getProvider(webView).getWebChromeClient();
        }
        throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static androidx.webkit.WebViewRenderProcess getWebViewRenderProcess(android.webkit.WebView webView) {
        androidx.webkit.internal.ApiFeature.Q q = androidx.webkit.internal.WebViewFeatureInternal.GET_WEB_VIEW_RENDERER;
        if (q.isSupportedByFramework()) {
            android.webkit.WebViewRenderProcess webViewRenderProcess = androidx.webkit.internal.ApiHelperForQ.getWebViewRenderProcess(webView);
            if (webViewRenderProcess != null) {
                return androidx.webkit.internal.WebViewRenderProcessImpl.forFrameworkObject(webViewRenderProcess);
            }
            return null;
        }
        if (q.isSupportedByWebView()) {
            return getProvider(webView).getWebViewRenderProcess();
        }
        throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static void setWebViewRenderProcessClient(android.webkit.WebView webView, java.util.concurrent.Executor executor, androidx.webkit.WebViewRenderProcessClient webViewRenderProcessClient) {
        androidx.webkit.internal.ApiFeature.Q q = androidx.webkit.internal.WebViewFeatureInternal.WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE;
        if (q.isSupportedByFramework()) {
            androidx.webkit.internal.ApiHelperForQ.setWebViewRenderProcessClient(webView, executor, webViewRenderProcessClient);
        } else {
            if (q.isSupportedByWebView()) {
                getProvider(webView).setWebViewRenderProcessClient(executor, webViewRenderProcessClient);
                return;
            }
            throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
        }
    }

    public static void setWebViewRenderProcessClient(android.webkit.WebView webView, androidx.webkit.WebViewRenderProcessClient webViewRenderProcessClient) {
        androidx.webkit.internal.ApiFeature.Q q = androidx.webkit.internal.WebViewFeatureInternal.WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE;
        if (q.isSupportedByFramework()) {
            androidx.webkit.internal.ApiHelperForQ.setWebViewRenderProcessClient(webView, webViewRenderProcessClient);
        } else {
            if (q.isSupportedByWebView()) {
                getProvider(webView).setWebViewRenderProcessClient(null, webViewRenderProcessClient);
                return;
            }
            throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
        }
    }

    public static androidx.webkit.WebViewRenderProcessClient getWebViewRenderProcessClient(android.webkit.WebView webView) {
        androidx.webkit.internal.ApiFeature.Q q = androidx.webkit.internal.WebViewFeatureInternal.WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE;
        if (q.isSupportedByFramework()) {
            android.webkit.WebViewRenderProcessClient webViewRenderProcessClient = androidx.webkit.internal.ApiHelperForQ.getWebViewRenderProcessClient(webView);
            if (webViewRenderProcessClient == null || !(webViewRenderProcessClient instanceof androidx.webkit.internal.WebViewRenderProcessClientFrameworkAdapter)) {
                return null;
            }
            return ((androidx.webkit.internal.WebViewRenderProcessClientFrameworkAdapter) webViewRenderProcessClient).getFrameworkRenderProcessClient();
        }
        if (q.isSupportedByWebView()) {
            return getProvider(webView).getWebViewRenderProcessClient();
        }
        throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static boolean isMultiProcessEnabled() {
        if (androidx.webkit.internal.WebViewFeatureInternal.MULTI_PROCESS.isSupportedByWebView()) {
            return getFactory().getStatics().isMultiProcessEnabled();
        }
        throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static java.lang.String getVariationsHeader() {
        if (androidx.webkit.internal.WebViewFeatureInternal.GET_VARIATIONS_HEADER.isSupportedByWebView()) {
            return getFactory().getStatics().getVariationsHeader();
        }
        throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static void setProfile(android.webkit.WebView webView, java.lang.String str) {
        if (androidx.webkit.internal.WebViewFeatureInternal.MULTI_PROFILE.isSupportedByWebView()) {
            getProvider(webView).setProfileWithName(str);
            return;
        }
        throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static androidx.webkit.Profile getProfile(android.webkit.WebView webView) {
        if (androidx.webkit.internal.WebViewFeatureInternal.MULTI_PROFILE.isSupportedByWebView()) {
            return getProvider(webView).getProfile();
        }
        throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static boolean isAudioMuted(android.webkit.WebView webView) {
        if (androidx.webkit.internal.WebViewFeatureInternal.MUTE_AUDIO.isSupportedByWebView()) {
            return getProvider(webView).isAudioMuted();
        }
        throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static void setAudioMuted(android.webkit.WebView webView, boolean z) {
        if (androidx.webkit.internal.WebViewFeatureInternal.MUTE_AUDIO.isSupportedByWebView()) {
            getProvider(webView).setAudioMuted(z);
            return;
        }
        throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
    }

    private static androidx.webkit.internal.WebViewProviderFactory getFactory() {
        return androidx.webkit.internal.WebViewGlueCommunicator.getFactory();
    }

    private static org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface createProvider(android.webkit.WebView webView) {
        return getFactory().createWebView(webView);
    }

    private static void checkThread(android.webkit.WebView webView) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            android.os.Looper webViewLooper = androidx.webkit.internal.ApiHelperForP.getWebViewLooper(webView);
            if (webViewLooper != android.os.Looper.myLooper()) {
                throw new java.lang.RuntimeException("A WebView method was called on thread '" + java.lang.Thread.currentThread().getName() + "'. All WebView methods must be called on the same thread. (Expected Looper " + webViewLooper + " called on " + android.os.Looper.myLooper() + ", FYI main Looper is " + android.os.Looper.getMainLooper() + ")");
            }
            return;
        }
        try {
            java.lang.reflect.Method declaredMethod = android.webkit.WebView.class.getDeclaredMethod("checkThread", new java.lang.Class[0]);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(webView, new java.lang.Object[0]);
        } catch (java.lang.IllegalAccessException e) {
            throw new java.lang.RuntimeException(e);
        } catch (java.lang.NoSuchMethodException e2) {
            throw new java.lang.RuntimeException(e2);
        } catch (java.lang.reflect.InvocationTargetException e3) {
            throw new java.lang.RuntimeException(e3);
        }
    }
}
