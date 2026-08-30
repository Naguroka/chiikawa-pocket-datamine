package com.iab.omid.library.unity3d.publisher;

/* JADX INFO: loaded from: classes5.dex */
public abstract class AdSessionStatePublisher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private java.lang.String f2468a;
    private com.iab.omid.library.unity3d.weakreference.b b;
    private com.iab.omid.library.unity3d.adsession.AdEvents c;
    private com.iab.omid.library.unity3d.adsession.media.MediaEvents d;
    private com.iab.omid.library.unity3d.publisher.AdSessionStatePublisher.a e;
    private long f;

    enum a {
        AD_STATE_IDLE,
        AD_STATE_VISIBLE,
        AD_STATE_NOTVISIBLE
    }

    public AdSessionStatePublisher(java.lang.String str) {
        a();
        this.f2468a = str;
        this.b = new com.iab.omid.library.unity3d.weakreference.b(null);
    }

    public void a() {
        this.f = com.iab.omid.library.unity3d.utils.f.b();
        this.e = com.iab.omid.library.unity3d.publisher.AdSessionStatePublisher.a.AD_STATE_IDLE;
    }

    public void a(float f) {
        com.iab.omid.library.unity3d.internal.g.a().a(getWebView(), this.f2468a, f);
    }

    void a(android.webkit.WebView webView) {
        this.b = new com.iab.omid.library.unity3d.weakreference.b(webView);
    }

    public void a(com.iab.omid.library.unity3d.adsession.AdEvents adEvents) {
        this.c = adEvents;
    }

    public void a(com.iab.omid.library.unity3d.adsession.AdSessionConfiguration adSessionConfiguration) {
        com.iab.omid.library.unity3d.internal.g.a().a(getWebView(), this.f2468a, adSessionConfiguration.toJsonObject());
    }

    public void a(com.iab.omid.library.unity3d.adsession.ErrorType errorType, java.lang.String str) {
        com.iab.omid.library.unity3d.internal.g.a().a(getWebView(), this.f2468a, errorType, str);
    }

    public void a(com.iab.omid.library.unity3d.adsession.a aVar, com.iab.omid.library.unity3d.adsession.AdSessionContext adSessionContext) {
        a(aVar, adSessionContext, null);
    }

    protected void a(com.iab.omid.library.unity3d.adsession.a aVar, com.iab.omid.library.unity3d.adsession.AdSessionContext adSessionContext, org.json.JSONObject jSONObject) {
        java.lang.String adSessionId = aVar.getAdSessionId();
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        com.iab.omid.library.unity3d.utils.c.a(jSONObject2, "environment", "app");
        com.iab.omid.library.unity3d.utils.c.a(jSONObject2, "adSessionType", adSessionContext.getAdSessionContextType());
        com.iab.omid.library.unity3d.utils.c.a(jSONObject2, "deviceInfo", com.iab.omid.library.unity3d.utils.b.d());
        com.iab.omid.library.unity3d.utils.c.a(jSONObject2, "deviceCategory", com.iab.omid.library.unity3d.utils.a.a().toString());
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        com.iab.omid.library.unity3d.utils.c.a(jSONObject2, "supports", jSONArray);
        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
        com.iab.omid.library.unity3d.utils.c.a(jSONObject3, com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_OM_PARTNER, adSessionContext.getPartner().getName());
        com.iab.omid.library.unity3d.utils.c.a(jSONObject3, com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_OM_PARTNER_VERSION, adSessionContext.getPartner().getVersion());
        com.iab.omid.library.unity3d.utils.c.a(jSONObject2, "omidNativeInfo", jSONObject3);
        org.json.JSONObject jSONObject4 = new org.json.JSONObject();
        com.iab.omid.library.unity3d.utils.c.a(jSONObject4, "libraryVersion", "1.4.9-Unity3d");
        com.iab.omid.library.unity3d.utils.c.a(jSONObject4, "appId", com.iab.omid.library.unity3d.internal.f.b().a().getApplicationContext().getPackageName());
        com.iab.omid.library.unity3d.utils.c.a(jSONObject2, "app", jSONObject4);
        if (adSessionContext.getContentUrl() != null) {
            com.iab.omid.library.unity3d.utils.c.a(jSONObject2, "contentUrl", adSessionContext.getContentUrl());
        }
        if (adSessionContext.getCustomReferenceData() != null) {
            com.iab.omid.library.unity3d.utils.c.a(jSONObject2, "customReferenceData", adSessionContext.getCustomReferenceData());
        }
        org.json.JSONObject jSONObject5 = new org.json.JSONObject();
        for (com.iab.omid.library.unity3d.adsession.VerificationScriptResource verificationScriptResource : adSessionContext.getVerificationScriptResources()) {
            com.iab.omid.library.unity3d.utils.c.a(jSONObject5, verificationScriptResource.getVendorKey(), verificationScriptResource.getVerificationParameters());
        }
        com.iab.omid.library.unity3d.internal.g.a().a(getWebView(), adSessionId, jSONObject2, jSONObject5, jSONObject);
    }

    public void a(com.iab.omid.library.unity3d.adsession.media.MediaEvents mediaEvents) {
        this.d = mediaEvents;
    }

    public void a(java.lang.String str) {
        a(str, (org.json.JSONObject) null);
    }

    public void a(java.lang.String str, long j) {
        if (j >= this.f) {
            com.iab.omid.library.unity3d.publisher.AdSessionStatePublisher.a aVar = this.e;
            com.iab.omid.library.unity3d.publisher.AdSessionStatePublisher.a aVar2 = com.iab.omid.library.unity3d.publisher.AdSessionStatePublisher.a.AD_STATE_NOTVISIBLE;
            if (aVar != aVar2) {
                this.e = aVar2;
                com.iab.omid.library.unity3d.internal.g.a().a(getWebView(), this.f2468a, str);
            }
        }
    }

    public void a(java.lang.String str, org.json.JSONObject jSONObject) {
        com.iab.omid.library.unity3d.internal.g.a().a(getWebView(), this.f2468a, str, jSONObject);
    }

    public void a(java.util.Date date) {
        if (date == null) {
            return;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        com.iab.omid.library.unity3d.utils.c.a(jSONObject, com.ironsource.aa.a.d, java.lang.Long.valueOf(date.getTime()));
        com.iab.omid.library.unity3d.internal.g.a().a(getWebView(), jSONObject);
    }

    public void a(org.json.JSONObject jSONObject) {
        com.iab.omid.library.unity3d.internal.g.a().b(getWebView(), this.f2468a, jSONObject);
    }

    public void a(boolean z) {
        if (e()) {
            com.iab.omid.library.unity3d.internal.g.a().b(getWebView(), this.f2468a, z ? "foregrounded" : "backgrounded");
        }
    }

    public void b() {
        this.b.clear();
    }

    public void b(java.lang.String str, long j) {
        if (j >= this.f) {
            this.e = com.iab.omid.library.unity3d.publisher.AdSessionStatePublisher.a.AD_STATE_VISIBLE;
            com.iab.omid.library.unity3d.internal.g.a().a(getWebView(), this.f2468a, str);
        }
    }

    public com.iab.omid.library.unity3d.adsession.AdEvents c() {
        return this.c;
    }

    public com.iab.omid.library.unity3d.adsession.media.MediaEvents d() {
        return this.d;
    }

    public boolean e() {
        return this.b.get() != null;
    }

    public void f() {
        com.iab.omid.library.unity3d.internal.g.a().a(getWebView(), this.f2468a);
    }

    public void g() {
        com.iab.omid.library.unity3d.internal.g.a().b(getWebView(), this.f2468a);
    }

    public android.webkit.WebView getWebView() {
        return this.b.get();
    }

    public void h() {
        a((org.json.JSONObject) null);
    }

    public void i() {
    }
}
