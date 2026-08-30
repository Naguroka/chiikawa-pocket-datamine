package org.chromium.support_lib_boundary;

/* JADX INFO: loaded from: classes6.dex */
public interface StaticsBoundaryInterface {
    android.net.Uri getSafeBrowsingPrivacyPolicyUrl();

    java.lang.String getVariationsHeader();

    void initSafeBrowsing(android.content.Context context, android.webkit.ValueCallback<java.lang.Boolean> valueCallback);

    boolean isMultiProcessEnabled();

    void setSafeBrowsingAllowlist(java.util.Set<java.lang.String> set, android.webkit.ValueCallback<java.lang.Boolean> valueCallback);

    void setSafeBrowsingWhitelist(java.util.List<java.lang.String> list, android.webkit.ValueCallback<java.lang.Boolean> valueCallback);
}
