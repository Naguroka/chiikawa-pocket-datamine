package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class k4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.j f945a;
    private final org.json.JSONObject b;

    public enum a {
        NEUTRAL,
        POSITIVE,
        NEGATIVE
    }

    public java.lang.String toString() {
        return "ConsentFlowStateAlertAction{title=" + d() + "destinationStateId=" + a() + "event=" + b() + "}";
    }

    public static com.applovin.impl.k4 a(org.json.JSONObject jSONObject, com.applovin.impl.sdk.j jVar) {
        java.lang.String string = com.applovin.impl.sdk.utils.JsonUtils.getString(com.applovin.impl.sdk.utils.JsonUtils.getJSONObject(jSONObject, com.ironsource.y8.h.D0, (org.json.JSONObject) null), com.ironsource.y8.h.W, null);
        if ("TOS".equalsIgnoreCase(string) && jVar.u().h() == null) {
            return null;
        }
        if ("PP".equalsIgnoreCase(string) && jVar.u().g() == null) {
            return null;
        }
        return new com.applovin.impl.k4(jSONObject, jVar);
    }

    private k4(org.json.JSONObject jSONObject, com.applovin.impl.sdk.j jVar) {
        this.f945a = jVar;
        this.b = jSONObject;
    }

    public java.lang.String d() {
        org.json.JSONObject jSONObject = com.applovin.impl.sdk.utils.JsonUtils.getJSONObject(this.b, com.ironsource.y8.h.D0, (org.json.JSONObject) null);
        return com.applovin.impl.sdk.j.a(com.applovin.impl.sdk.utils.JsonUtils.getString(jSONObject, com.ironsource.y8.h.W, ""), com.applovin.impl.sdk.utils.JsonUtils.optList(com.applovin.impl.sdk.utils.JsonUtils.getJSONArray(jSONObject, "replacements", null), null));
    }

    public com.applovin.impl.k4.a c() {
        java.lang.String string = com.applovin.impl.sdk.utils.JsonUtils.getString(this.b, androidx.media3.extractor.text.ttml.TtmlNode.TAG_STYLE, null);
        if ("default".equalsIgnoreCase(string)) {
            return com.applovin.impl.k4.a.POSITIVE;
        }
        if (!"destructive".equalsIgnoreCase(string) && !"cancel".equalsIgnoreCase(string)) {
            return com.applovin.impl.k4.a.NEUTRAL;
        }
        return com.applovin.impl.k4.a.NEGATIVE;
    }

    public java.lang.String b() {
        return com.applovin.impl.sdk.utils.JsonUtils.getString(this.b, androidx.core.app.NotificationCompat.CATEGORY_EVENT, null);
    }

    public java.lang.String a() {
        return com.applovin.impl.sdk.utils.JsonUtils.getString(this.b, "destination_state_id", null);
    }
}
