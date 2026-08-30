package androidx.webkit.internal;

/* JADX INFO: loaded from: classes3.dex */
public class ApiHelperForOMR1 {
    private ApiHelperForOMR1() {
    }

    public static void showInterstitial(android.webkit.SafeBrowsingResponse safeBrowsingResponse, boolean z) {
        safeBrowsingResponse.showInterstitial(z);
    }

    public static void proceed(android.webkit.SafeBrowsingResponse safeBrowsingResponse, boolean z) {
        safeBrowsingResponse.proceed(z);
    }

    public static void backToSafety(android.webkit.SafeBrowsingResponse safeBrowsingResponse, boolean z) {
        safeBrowsingResponse.backToSafety(z);
    }

    public static void startSafeBrowsing(android.content.Context context, android.webkit.ValueCallback<java.lang.Boolean> valueCallback) {
        android.webkit.WebView.startSafeBrowsing(context, valueCallback);
    }

    public static void setSafeBrowsingWhitelist(java.util.List<java.lang.String> list, android.webkit.ValueCallback<java.lang.Boolean> valueCallback) {
        android.webkit.WebView.setSafeBrowsingWhitelist(list, valueCallback);
    }

    public static android.net.Uri getSafeBrowsingPrivacyPolicyUrl() {
        return android.webkit.WebView.getSafeBrowsingPrivacyPolicyUrl();
    }
}
