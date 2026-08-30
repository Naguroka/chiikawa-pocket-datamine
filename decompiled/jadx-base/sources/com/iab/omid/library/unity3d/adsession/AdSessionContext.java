package com.iab.omid.library.unity3d.adsession;

/* JADX INFO: loaded from: classes5.dex */
public final class AdSessionContext {
    private final com.iab.omid.library.unity3d.adsession.AdSessionContextType adSessionContextType;
    private final java.lang.String contentUrl;
    private final java.lang.String customReferenceData;
    private final java.util.Map<java.lang.String, com.iab.omid.library.unity3d.adsession.VerificationScriptResource> injectedResourcesMap;
    private final java.lang.String omidJsScriptContent;
    private final com.iab.omid.library.unity3d.adsession.Partner partner;
    private final java.util.List<com.iab.omid.library.unity3d.adsession.VerificationScriptResource> verificationScriptResources;
    private final android.webkit.WebView webView;

    private AdSessionContext(com.iab.omid.library.unity3d.adsession.Partner partner, android.webkit.WebView webView, java.lang.String str, java.util.List<com.iab.omid.library.unity3d.adsession.VerificationScriptResource> list, java.lang.String str2, java.lang.String str3, com.iab.omid.library.unity3d.adsession.AdSessionContextType adSessionContextType) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.verificationScriptResources = arrayList;
        this.injectedResourcesMap = new java.util.HashMap();
        this.partner = partner;
        this.webView = webView;
        this.omidJsScriptContent = str;
        this.adSessionContextType = adSessionContextType;
        if (list != null) {
            arrayList.addAll(list);
            for (com.iab.omid.library.unity3d.adsession.VerificationScriptResource verificationScriptResource : list) {
                this.injectedResourcesMap.put(java.util.UUID.randomUUID().toString(), verificationScriptResource);
            }
        }
        this.contentUrl = str2;
        this.customReferenceData = str3;
    }

    public static com.iab.omid.library.unity3d.adsession.AdSessionContext createHtmlAdSessionContext(com.iab.omid.library.unity3d.adsession.Partner partner, android.webkit.WebView webView, java.lang.String str, java.lang.String str2) {
        com.iab.omid.library.unity3d.utils.g.a(partner, "Partner is null");
        com.iab.omid.library.unity3d.utils.g.a(webView, "WebView is null");
        if (str2 != null) {
            com.iab.omid.library.unity3d.utils.g.a(str2, 256, "CustomReferenceData is greater than 256 characters");
        }
        return new com.iab.omid.library.unity3d.adsession.AdSessionContext(partner, webView, null, null, str, str2, com.iab.omid.library.unity3d.adsession.AdSessionContextType.HTML);
    }

    public static com.iab.omid.library.unity3d.adsession.AdSessionContext createJavascriptAdSessionContext(com.iab.omid.library.unity3d.adsession.Partner partner, android.webkit.WebView webView, java.lang.String str, java.lang.String str2) {
        com.iab.omid.library.unity3d.utils.g.a(partner, "Partner is null");
        com.iab.omid.library.unity3d.utils.g.a(webView, "WebView is null");
        if (str2 != null) {
            com.iab.omid.library.unity3d.utils.g.a(str2, 256, "CustomReferenceData is greater than 256 characters");
        }
        return new com.iab.omid.library.unity3d.adsession.AdSessionContext(partner, webView, null, null, str, str2, com.iab.omid.library.unity3d.adsession.AdSessionContextType.JAVASCRIPT);
    }

    public static com.iab.omid.library.unity3d.adsession.AdSessionContext createNativeAdSessionContext(com.iab.omid.library.unity3d.adsession.Partner partner, java.lang.String str, java.util.List<com.iab.omid.library.unity3d.adsession.VerificationScriptResource> list, java.lang.String str2, java.lang.String str3) {
        com.iab.omid.library.unity3d.utils.g.a(partner, "Partner is null");
        com.iab.omid.library.unity3d.utils.g.a((java.lang.Object) str, "OM SDK JS script content is null");
        com.iab.omid.library.unity3d.utils.g.a(list, "VerificationScriptResources is null");
        if (str3 != null) {
            com.iab.omid.library.unity3d.utils.g.a(str3, 256, "CustomReferenceData is greater than 256 characters");
        }
        return new com.iab.omid.library.unity3d.adsession.AdSessionContext(partner, null, str, list, str2, str3, com.iab.omid.library.unity3d.adsession.AdSessionContextType.NATIVE);
    }

    public com.iab.omid.library.unity3d.adsession.AdSessionContextType getAdSessionContextType() {
        return this.adSessionContextType;
    }

    public java.lang.String getContentUrl() {
        return this.contentUrl;
    }

    public java.lang.String getCustomReferenceData() {
        return this.customReferenceData;
    }

    public java.util.Map<java.lang.String, com.iab.omid.library.unity3d.adsession.VerificationScriptResource> getInjectedResourcesMap() {
        return java.util.Collections.unmodifiableMap(this.injectedResourcesMap);
    }

    public java.lang.String getOmidJsScriptContent() {
        return this.omidJsScriptContent;
    }

    public com.iab.omid.library.unity3d.adsession.Partner getPartner() {
        return this.partner;
    }

    public java.util.List<com.iab.omid.library.unity3d.adsession.VerificationScriptResource> getVerificationScriptResources() {
        return java.util.Collections.unmodifiableList(this.verificationScriptResources);
    }

    public android.webkit.WebView getWebView() {
        return this.webView;
    }
}
