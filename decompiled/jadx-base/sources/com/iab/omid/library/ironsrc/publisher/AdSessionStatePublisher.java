package com.iab.omid.library.ironsrc.publisher;

/* JADX INFO: loaded from: classes5.dex */
public abstract class AdSessionStatePublisher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.iab.omid.library.ironsrc.weakreference.b f2435a;
    private com.iab.omid.library.ironsrc.adsession.AdEvents b;
    private com.iab.omid.library.ironsrc.adsession.media.MediaEvents c;
    private com.iab.omid.library.ironsrc.publisher.AdSessionStatePublisher.a d;
    private long e;

    enum a {
        AD_STATE_IDLE,
        AD_STATE_VISIBLE,
        AD_STATE_NOTVISIBLE
    }

    public AdSessionStatePublisher() {
        a();
        this.f2435a = new com.iab.omid.library.ironsrc.weakreference.b(null);
    }

    public void a() {
        this.e = com.iab.omid.library.ironsrc.utils.f.b();
        this.d = com.iab.omid.library.ironsrc.publisher.AdSessionStatePublisher.a.AD_STATE_IDLE;
    }

    public void a(float f) {
        com.iab.omid.library.ironsrc.internal.g.a().a(getWebView(), f);
    }

    void a(android.webkit.WebView webView) {
        this.f2435a = new com.iab.omid.library.ironsrc.weakreference.b(webView);
    }

    public void a(com.iab.omid.library.ironsrc.adsession.AdEvents adEvents) {
        this.b = adEvents;
    }

    public void a(com.iab.omid.library.ironsrc.adsession.AdSessionConfiguration adSessionConfiguration) {
        com.iab.omid.library.ironsrc.internal.g.a().a(getWebView(), adSessionConfiguration.toJsonObject());
    }

    public void a(com.iab.omid.library.ironsrc.adsession.ErrorType errorType, java.lang.String str) {
        com.iab.omid.library.ironsrc.internal.g.a().a(getWebView(), errorType, str);
    }

    public void a(com.iab.omid.library.ironsrc.adsession.a aVar, com.iab.omid.library.ironsrc.adsession.AdSessionContext adSessionContext) {
        a(aVar, adSessionContext, null);
    }

    protected void a(com.iab.omid.library.ironsrc.adsession.a aVar, com.iab.omid.library.ironsrc.adsession.AdSessionContext adSessionContext, org.json.JSONObject jSONObject) {
        java.lang.String adSessionId = aVar.getAdSessionId();
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        com.iab.omid.library.ironsrc.utils.c.a(jSONObject2, "environment", "app");
        com.iab.omid.library.ironsrc.utils.c.a(jSONObject2, "adSessionType", adSessionContext.getAdSessionContextType());
        com.iab.omid.library.ironsrc.utils.c.a(jSONObject2, "deviceInfo", com.iab.omid.library.ironsrc.utils.b.d());
        com.iab.omid.library.ironsrc.utils.c.a(jSONObject2, "deviceCategory", com.iab.omid.library.ironsrc.utils.a.a().toString());
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        com.iab.omid.library.ironsrc.utils.c.a(jSONObject2, "supports", jSONArray);
        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
        com.iab.omid.library.ironsrc.utils.c.a(jSONObject3, com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_OM_PARTNER, adSessionContext.getPartner().getName());
        com.iab.omid.library.ironsrc.utils.c.a(jSONObject3, com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_OM_PARTNER_VERSION, adSessionContext.getPartner().getVersion());
        com.iab.omid.library.ironsrc.utils.c.a(jSONObject2, "omidNativeInfo", jSONObject3);
        org.json.JSONObject jSONObject4 = new org.json.JSONObject();
        com.iab.omid.library.ironsrc.utils.c.a(jSONObject4, "libraryVersion", "1.4.2-Ironsrc");
        com.iab.omid.library.ironsrc.utils.c.a(jSONObject4, "appId", com.iab.omid.library.ironsrc.internal.f.b().a().getApplicationContext().getPackageName());
        com.iab.omid.library.ironsrc.utils.c.a(jSONObject2, "app", jSONObject4);
        if (adSessionContext.getContentUrl() != null) {
            com.iab.omid.library.ironsrc.utils.c.a(jSONObject2, "contentUrl", adSessionContext.getContentUrl());
        }
        if (adSessionContext.getCustomReferenceData() != null) {
            com.iab.omid.library.ironsrc.utils.c.a(jSONObject2, "customReferenceData", adSessionContext.getCustomReferenceData());
        }
        org.json.JSONObject jSONObject5 = new org.json.JSONObject();
        for (com.iab.omid.library.ironsrc.adsession.VerificationScriptResource verificationScriptResource : adSessionContext.getVerificationScriptResources()) {
            com.iab.omid.library.ironsrc.utils.c.a(jSONObject5, verificationScriptResource.getVendorKey(), verificationScriptResource.getVerificationParameters());
        }
        com.iab.omid.library.ironsrc.internal.g.a().a(getWebView(), adSessionId, jSONObject2, jSONObject5, jSONObject);
    }

    public void a(com.iab.omid.library.ironsrc.adsession.media.MediaEvents mediaEvents) {
        this.c = mediaEvents;
    }

    public void a(java.lang.String str) {
        com.iab.omid.library.ironsrc.internal.g.a().a(getWebView(), str, (org.json.JSONObject) null);
    }

    public void a(java.lang.String str, long j) {
        if (j >= this.e) {
            com.iab.omid.library.ironsrc.publisher.AdSessionStatePublisher.a aVar = this.d;
            com.iab.omid.library.ironsrc.publisher.AdSessionStatePublisher.a aVar2 = com.iab.omid.library.ironsrc.publisher.AdSessionStatePublisher.a.AD_STATE_NOTVISIBLE;
            if (aVar != aVar2) {
                this.d = aVar2;
                com.iab.omid.library.ironsrc.internal.g.a().a(getWebView(), str);
            }
        }
    }

    public void a(java.lang.String str, org.json.JSONObject jSONObject) {
        com.iab.omid.library.ironsrc.internal.g.a().a(getWebView(), str, jSONObject);
    }

    public void a(java.util.Date date) {
        if (date == null) {
            return;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        com.iab.omid.library.ironsrc.utils.c.a(jSONObject, com.ironsource.aa.a.d, java.lang.Long.valueOf(date.getTime()));
        com.iab.omid.library.ironsrc.internal.g.a().c(getWebView(), jSONObject);
    }

    public void a(org.json.JSONObject jSONObject) {
        com.iab.omid.library.ironsrc.internal.g.a().b(getWebView(), jSONObject);
    }

    public void a(boolean z) {
        if (e()) {
            com.iab.omid.library.ironsrc.internal.g.a().b(getWebView(), z ? "foregrounded" : "backgrounded");
        }
    }

    public void b() {
        this.f2435a.clear();
    }

    public void b(java.lang.String str, long j) {
        if (j >= this.e) {
            this.d = com.iab.omid.library.ironsrc.publisher.AdSessionStatePublisher.a.AD_STATE_VISIBLE;
            com.iab.omid.library.ironsrc.internal.g.a().a(getWebView(), str);
        }
    }

    public com.iab.omid.library.ironsrc.adsession.AdEvents c() {
        return this.b;
    }

    public com.iab.omid.library.ironsrc.adsession.media.MediaEvents d() {
        return this.c;
    }

    public boolean e() {
        return this.f2435a.get() != null;
    }

    public void f() {
        com.iab.omid.library.ironsrc.internal.g.a().a(getWebView());
    }

    public void g() {
        com.iab.omid.library.ironsrc.internal.g.a().b(getWebView());
    }

    public android.webkit.WebView getWebView() {
        return this.f2435a.get();
    }

    public void h() {
        com.iab.omid.library.ironsrc.internal.g.a().c(getWebView());
    }

    public void i() {
    }
}
