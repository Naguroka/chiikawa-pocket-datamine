package com.applovin.impl.sdk.ad;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends com.applovin.impl.sdk.ad.b implements com.applovin.impl.hh {
    private final java.lang.String l;
    private final java.lang.String m;
    private final java.lang.String n;
    private final com.applovin.impl.mg o;

    public a(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, com.applovin.impl.sdk.j jVar) {
        super(jSONObject, jSONObject2, jVar);
        this.l = l1();
        this.m = q1();
        this.n = p1();
        this.o = new com.applovin.impl.mg(this);
    }

    public static com.applovin.impl.sdk.ad.a a(org.json.JSONObject jSONObject, com.applovin.impl.sdk.j jVar) {
        org.json.JSONObject jSONObject2;
        if (jSONObject == null || (jSONObject2 = com.applovin.impl.sdk.utils.JsonUtils.getJSONObject(jSONObject, "full_response", (org.json.JSONObject) null)) == null) {
            return null;
        }
        org.json.JSONObject jSONObject3 = com.applovin.impl.sdk.utils.JsonUtils.getJSONObject(com.applovin.impl.sdk.utils.JsonUtils.getJSONArray(jSONObject2, "ads", new org.json.JSONArray()), 0, (org.json.JSONObject) null);
        if (jSONObject3 == null) {
            return null;
        }
        java.lang.String string = com.applovin.impl.sdk.utils.JsonUtils.getString(jSONObject3, "html", "");
        if (android.text.TextUtils.isEmpty(string)) {
            return null;
        }
        java.lang.String string2 = com.applovin.impl.sdk.utils.JsonUtils.getString(jSONObject3, "video", "");
        com.applovin.impl.sdk.utils.JsonUtils.putString(jSONObject3, "html", com.applovin.impl.sdk.utils.JsonUtils.getString(jSONObject, "original_html_source", ""));
        com.applovin.impl.sdk.utils.JsonUtils.putString(jSONObject3, "video", com.applovin.impl.sdk.utils.JsonUtils.getString(jSONObject, "original_video_uri_string", ""));
        com.applovin.impl.sdk.ad.a aVar = new com.applovin.impl.sdk.ad.a(jSONObject3, jSONObject2, jVar);
        org.json.JSONArray jSONArray = com.applovin.impl.sdk.utils.JsonUtils.getJSONArray(jSONObject, "cached_ad_html_resources_urls", new org.json.JSONArray());
        for (int i = 0; i < jSONArray.length(); i++) {
            java.lang.Object objectAtIndex = com.applovin.impl.sdk.utils.JsonUtils.getObjectAtIndex(jSONArray, i, null);
            if (objectAtIndex instanceof java.lang.String) {
                java.lang.String str = (java.lang.String) objectAtIndex;
                if (!android.text.TextUtils.isEmpty(str)) {
                    aVar.a(android.net.Uri.parse(str));
                }
            }
        }
        aVar.b(string);
        if (com.applovin.impl.sdk.utils.StringUtils.isValidString(string2)) {
            aVar.d(android.net.Uri.parse(string2));
        }
        return aVar;
    }

    private java.lang.String p1() {
        return getStringFromAdObject("stream_url", "");
    }

    @Override // com.applovin.impl.sdk.ad.b
    public boolean G0() {
        return getBooleanFromFullResponse("is_persisted_ad", false);
    }

    @Override // com.applovin.impl.sdk.ad.b
    public boolean K0() {
        return containsKeyForAdObject("stream_url");
    }

    @Override // com.applovin.impl.sdk.ad.b
    public void N0() {
        com.applovin.impl.tl tlVar = this.synchronizedAdObject;
        if (tlVar != null) {
            tlVar.a(new androidx.core.util.Consumer() { // from class: com.applovin.impl.sdk.ad.a$$ExternalSyntheticLambda0
                @Override // androidx.core.util.Consumer
                public final void accept(java.lang.Object obj) {
                    this.f$0.w((com.applovin.impl.tl) obj);
                }
            });
            return;
        }
        synchronized (this.adObjectLock) {
            com.applovin.impl.sdk.utils.JsonUtils.putString(this.adObject, "html", this.l);
            com.applovin.impl.sdk.utils.JsonUtils.putString(this.adObject, "stream_url", this.n);
        }
    }

    @Override // com.applovin.impl.sdk.ad.b
    public java.lang.String Q() {
        return this.m;
    }

    public void b(java.lang.String str) {
        com.applovin.impl.tl tlVar = this.synchronizedAdObject;
        if (tlVar != null) {
            tlVar.b("html", str);
            return;
        }
        synchronized (this.adObjectLock) {
            com.applovin.impl.sdk.utils.JsonUtils.putString(this.adObject, "html", str);
        }
    }

    public void d(android.net.Uri uri) {
        com.applovin.impl.tl tlVar = this.synchronizedAdObject;
        if (tlVar != null) {
            tlVar.b("video", uri.toString());
            return;
        }
        synchronized (this.adObjectLock) {
            com.applovin.impl.sdk.utils.JsonUtils.putString(this.adObject, "video", uri.toString());
        }
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public org.json.JSONObject getOriginalFullResponse() {
        org.json.JSONObject jSONObjectDeepCopy;
        org.json.JSONObject jSONObjectA;
        com.applovin.impl.tl tlVar = this.synchronizedFullResponse;
        if (tlVar != null) {
            jSONObjectA = tlVar.a();
        } else {
            synchronized (this.fullResponseLock) {
                jSONObjectDeepCopy = com.applovin.impl.sdk.utils.JsonUtils.deepCopy(this.fullResponse);
            }
            jSONObjectA = jSONObjectDeepCopy;
        }
        org.json.JSONArray jSONArray = com.applovin.impl.sdk.utils.JsonUtils.getJSONArray(jSONObjectA, "ads", new org.json.JSONArray());
        if (jSONArray.length() > 0) {
            org.json.JSONObject jSONObject = com.applovin.impl.sdk.utils.JsonUtils.getJSONObject(jSONArray, 0, new org.json.JSONObject());
            com.applovin.impl.sdk.utils.JsonUtils.putString(jSONObject, "html", this.l);
            com.applovin.impl.sdk.utils.JsonUtils.putString(jSONObject, "video", this.m);
            com.applovin.impl.sdk.utils.JsonUtils.putString(jSONObject, "stream_url", this.n);
        }
        return jSONObjectA;
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public boolean hasVideoUrl() {
        return u0() != null;
    }

    @Override // com.applovin.impl.sdk.ad.b, com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.kg
    public boolean isOpenMeasurementEnabled() {
        if (this.sdk.V().e()) {
            return true;
        }
        return getBooleanFromAdObject("omsdk_enabled", java.lang.Boolean.FALSE);
    }

    @Override // com.applovin.impl.sdk.ad.b
    public android.net.Uri j() {
        java.lang.String stringFromAdObject = getStringFromAdObject("click_url", "");
        if (com.applovin.impl.sdk.utils.StringUtils.isValidString(stringFromAdObject)) {
            return android.net.Uri.parse(stringFromAdObject);
        }
        return null;
    }

    public com.applovin.impl.adview.e.a k1() {
        return a(getIntFromAdObject("expandable_style", com.applovin.impl.adview.e.a.INVISIBLE.b()));
    }

    @Override // com.applovin.impl.sdk.ad.b
    public android.net.Uri l0() {
        java.lang.String stringFromAdObject = getStringFromAdObject("video_click_url", "");
        return com.applovin.impl.sdk.utils.StringUtils.isValidString(stringFromAdObject) ? android.net.Uri.parse(stringFromAdObject) : j();
    }

    public java.lang.String l1() {
        return getStringFromAdObject("html", "");
    }

    public java.lang.String m1() {
        return getStringFromAdObject("html_url", "");
    }

    public float n1() {
        return getFloatFromAdObject("mraid_close_delay_graphic", 0.0f);
    }

    public java.lang.String o1() {
        return this.n;
    }

    public java.lang.String q1() {
        return getStringFromAdObject("video", "");
    }

    public boolean r1() {
        if (this.adObject.has("close_button_expandable_hidden")) {
            return getBooleanFromAdObject("close_button_expandable_hidden", java.lang.Boolean.FALSE);
        }
        return true;
    }

    public void s1() {
        com.applovin.impl.tl tlVar = this.synchronizedAdObject;
        if (tlVar != null) {
            tlVar.c("stream_url");
            return;
        }
        synchronized (this.adObjectLock) {
            this.adObject.remove("stream_url");
        }
    }

    public boolean t1() {
        return getBooleanFromAdObject("should_cache_html_url_contents", java.lang.Boolean.FALSE);
    }

    @Override // com.applovin.impl.sdk.ad.b
    public android.net.Uri u0() {
        java.lang.String strP1 = p1();
        if (com.applovin.impl.sdk.utils.StringUtils.isValidString(strP1)) {
            return android.net.Uri.parse(strP1);
        }
        java.lang.String strQ1 = q1();
        if (com.applovin.impl.sdk.utils.StringUtils.isValidString(strQ1)) {
            return android.net.Uri.parse(strQ1);
        }
        return null;
    }

    public boolean u1() {
        return getBooleanFromAdObject("should_respect_whitelist_when_retrieving_html_from_url", java.lang.Boolean.FALSE);
    }

    @Override // com.applovin.impl.hh
    public org.json.JSONObject a() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        com.applovin.impl.sdk.utils.JsonUtils.putString(jSONObject, "original_html_source", this.l);
        com.applovin.impl.sdk.utils.JsonUtils.putString(jSONObject, "original_video_uri_string", this.m);
        com.applovin.impl.sdk.utils.JsonUtils.putString(jSONObject, "original_video_stream_uri_string", this.n);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = i().iterator();
        while (it.hasNext()) {
            arrayList.add(((android.net.Uri) it.next()).toString());
        }
        com.applovin.impl.sdk.utils.JsonUtils.putJsonArray(jSONObject, "cached_ad_html_resources_urls", new org.json.JSONArray((java.util.Collection) arrayList));
        com.applovin.impl.tl tlVar = this.synchronizedFullResponse;
        if (tlVar != null) {
            com.applovin.impl.sdk.utils.JsonUtils.putJSONObject(jSONObject, "full_response", tlVar.a());
        } else {
            synchronized (this.fullResponseLock) {
                com.applovin.impl.sdk.utils.JsonUtils.putJSONObject(jSONObject, "full_response", this.fullResponse);
            }
        }
        return jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w(com.applovin.impl.tl tlVar) {
        tlVar.b("html", this.l);
        tlVar.b("stream_url", this.n);
    }

    @Override // com.applovin.impl.sdk.ad.b, com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.kg
    public com.applovin.impl.mg getAdEventTracker() {
        return this.o;
    }
}
