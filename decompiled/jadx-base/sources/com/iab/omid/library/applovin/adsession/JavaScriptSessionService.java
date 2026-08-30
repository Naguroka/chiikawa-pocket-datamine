package com.iab.omid.library.applovin.adsession;

/* JADX INFO: loaded from: classes5.dex */
public class JavaScriptSessionService {
    private static java.lang.String JS_MESSAGE_DATA_AD_SESSION_ID = "adSessionId";
    private static java.lang.String JS_MESSAGE_KEY_DATA = "data";
    private static java.lang.String JS_MESSAGE_KEY_METHOD = "method";
    private static java.lang.String JS_MESSAGE_LISTENER_JS_SESSION_SERVICE = "omidJsSessionService";
    private static java.lang.String JS_MESSAGE_METHOD_FINISH_SESSION = "finishSession";
    private static java.lang.String JS_MESSAGE_METHOD_START_SESSION = "startSession";
    private static com.iab.omid.library.applovin.utils.i webViewUtil = new com.iab.omid.library.applovin.utils.i();
    private final java.util.HashMap<java.lang.String, com.iab.omid.library.applovin.adsession.AdSession> adSessions = new java.util.HashMap<>();
    private final com.iab.omid.library.applovin.internal.f friendlyObstructions = new com.iab.omid.library.applovin.internal.f();
    private final boolean isHtmlAdView;
    private final com.iab.omid.library.applovin.adsession.Partner partner;
    private com.iab.omid.library.applovin.weakreference.a weakAdView;
    private final android.webkit.WebView webView;

    public interface TearDownHandler {
        void onTearDown(boolean z);
    }

    private JavaScriptSessionService(com.iab.omid.library.applovin.adsession.Partner partner, android.webkit.WebView webView, boolean z) {
        com.iab.omid.library.applovin.utils.g.a();
        com.iab.omid.library.applovin.utils.g.a(partner, "Partner is null");
        com.iab.omid.library.applovin.utils.g.a(webView, "WebView is null");
        this.partner = partner;
        this.webView = webView;
        this.isHtmlAdView = z;
        addWebViewListener();
    }

    private void addWebViewListener() {
        if (!androidx.webkit.WebViewFeature.isFeatureSupported("WEB_MESSAGE_LISTENER")) {
            throw new java.lang.UnsupportedOperationException("The JavaScriptSessionService cannot be supported in this WebView version.");
        }
        removeWebViewListener();
        webViewUtil.a(this.webView, JS_MESSAGE_LISTENER_JS_SESSION_SERVICE, new java.util.HashSet(java.util.Arrays.asList(androidx.webkit.ProxyConfig.MATCH_ALL_SCHEMES)), new androidx.webkit.WebViewCompat.WebMessageListener() { // from class: com.iab.omid.library.applovin.adsession.JavaScriptSessionService.2
            @Override // androidx.webkit.WebViewCompat.WebMessageListener
            public void onPostMessage(android.webkit.WebView webView, androidx.webkit.WebMessageCompat webMessageCompat, android.net.Uri uri, boolean z, androidx.webkit.JavaScriptReplyProxy javaScriptReplyProxy) {
                try {
                    org.json.JSONObject jSONObject = new org.json.JSONObject(webMessageCompat.getData());
                    java.lang.String string = jSONObject.getString(com.iab.omid.library.applovin.adsession.JavaScriptSessionService.JS_MESSAGE_KEY_METHOD);
                    java.lang.String string2 = jSONObject.getJSONObject(com.iab.omid.library.applovin.adsession.JavaScriptSessionService.JS_MESSAGE_KEY_DATA).getString(com.iab.omid.library.applovin.adsession.JavaScriptSessionService.JS_MESSAGE_DATA_AD_SESSION_ID);
                    if (string.equals(com.iab.omid.library.applovin.adsession.JavaScriptSessionService.JS_MESSAGE_METHOD_START_SESSION)) {
                        com.iab.omid.library.applovin.adsession.JavaScriptSessionService.this.startSession(string2);
                    } else if (string.equals(com.iab.omid.library.applovin.adsession.JavaScriptSessionService.JS_MESSAGE_METHOD_FINISH_SESSION)) {
                        com.iab.omid.library.applovin.adsession.JavaScriptSessionService.this.finishSession(string2);
                    } else {
                        com.iab.omid.library.applovin.utils.d.b("Unexpected method in JavaScriptSessionService: " + string);
                    }
                } catch (org.json.JSONException e) {
                    com.iab.omid.library.applovin.utils.d.a("Error parsing JS message in JavaScriptSessionService.", e);
                }
            }
        });
    }

    public static com.iab.omid.library.applovin.adsession.JavaScriptSessionService create(com.iab.omid.library.applovin.adsession.Partner partner, android.webkit.WebView webView, boolean z) {
        return new com.iab.omid.library.applovin.adsession.JavaScriptSessionService(partner, webView, z);
    }

    private com.iab.omid.library.applovin.adsession.AdSessionConfiguration createAdSessionConfiguration() {
        com.iab.omid.library.applovin.adsession.CreativeType creativeType = com.iab.omid.library.applovin.adsession.CreativeType.DEFINED_BY_JAVASCRIPT;
        com.iab.omid.library.applovin.adsession.ImpressionType impressionType = com.iab.omid.library.applovin.adsession.ImpressionType.DEFINED_BY_JAVASCRIPT;
        com.iab.omid.library.applovin.adsession.Owner owner = com.iab.omid.library.applovin.adsession.Owner.JAVASCRIPT;
        return com.iab.omid.library.applovin.adsession.AdSessionConfiguration.createAdSessionConfiguration(creativeType, impressionType, owner, owner, false);
    }

    private com.iab.omid.library.applovin.adsession.AdSessionContext createAdSessionContext() {
        return this.isHtmlAdView ? com.iab.omid.library.applovin.adsession.AdSessionContext.createHtmlAdSessionContext(this.partner, this.webView, null, null) : com.iab.omid.library.applovin.adsession.AdSessionContext.createJavascriptAdSessionContext(this.partner, this.webView, null, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void finishSession(java.lang.String str) {
        com.iab.omid.library.applovin.adsession.AdSession adSession = this.adSessions.get(str);
        if (adSession != null) {
            adSession.finish();
            this.adSessions.remove(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeWebViewListener() {
        webViewUtil.a(this.webView, JS_MESSAGE_LISTENER_JS_SESSION_SERVICE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startSession(java.lang.String str) {
        com.iab.omid.library.applovin.adsession.a aVar = new com.iab.omid.library.applovin.adsession.a(createAdSessionConfiguration(), createAdSessionContext(), str);
        this.adSessions.put(str, aVar);
        aVar.registerAdView(this.isHtmlAdView ? this.webView : getAdView());
        for (com.iab.omid.library.applovin.internal.e eVar : this.friendlyObstructions.a()) {
            aVar.addFriendlyObstruction(eVar.c().get(), eVar.b(), eVar.a());
        }
        aVar.start();
    }

    public void addFriendlyObstruction(android.view.View view, com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose friendlyObstructionPurpose, java.lang.String str) {
        java.util.Iterator<com.iab.omid.library.applovin.adsession.AdSession> it = this.adSessions.values().iterator();
        while (it.hasNext()) {
            it.next().addFriendlyObstruction(view, friendlyObstructionPurpose, str);
        }
        this.friendlyObstructions.a(view, friendlyObstructionPurpose, str);
    }

    android.view.View getAdView() {
        com.iab.omid.library.applovin.weakreference.a aVar = this.weakAdView;
        if (aVar == null) {
            return null;
        }
        return aVar.get();
    }

    public void removeAllFriendlyObstructions() {
        java.util.Iterator<com.iab.omid.library.applovin.adsession.AdSession> it = this.adSessions.values().iterator();
        while (it.hasNext()) {
            it.next().removeAllFriendlyObstructions();
        }
        this.friendlyObstructions.b();
    }

    public void removeFriendlyObstruction(android.view.View view) {
        java.util.Iterator<com.iab.omid.library.applovin.adsession.AdSession> it = this.adSessions.values().iterator();
        while (it.hasNext()) {
            it.next().removeFriendlyObstruction(view);
        }
        this.friendlyObstructions.c(view);
    }

    public void setAdView(android.view.View view) {
        if (this.isHtmlAdView) {
            if (view != this.webView) {
                throw new java.lang.UnsupportedOperationException("For HTML-rendered ads, the ad view is automatically set to the web view and cannot be changed.");
            }
        } else {
            java.util.Iterator<com.iab.omid.library.applovin.adsession.AdSession> it = this.adSessions.values().iterator();
            while (it.hasNext()) {
                it.next().registerAdView(view);
            }
            this.weakAdView = new com.iab.omid.library.applovin.weakreference.a(view);
        }
    }

    public void tearDown(final com.iab.omid.library.applovin.adsession.JavaScriptSessionService.TearDownHandler tearDownHandler) {
        java.util.Iterator<com.iab.omid.library.applovin.adsession.AdSession> it = this.adSessions.values().iterator();
        while (it.hasNext()) {
            it.next().finish();
        }
        final java.util.Timer timer = new java.util.Timer();
        timer.schedule(new java.util.TimerTask() { // from class: com.iab.omid.library.applovin.adsession.JavaScriptSessionService.1
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                com.iab.omid.library.applovin.adsession.JavaScriptSessionService.this.removeWebViewListener();
                tearDownHandler.onTearDown(true);
                timer.cancel();
            }
        }, 1000L);
    }
}
