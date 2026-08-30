package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class d5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final org.json.JSONObject f706a;

    public d5(org.json.JSONObject jSONObject) {
        this.f706a = jSONObject;
    }

    protected java.lang.String b() {
        return com.applovin.impl.sdk.utils.JsonUtils.getString(this.f706a, "digital_asset_link_url", null);
    }

    protected java.lang.Integer e() {
        return com.applovin.impl.sdk.utils.JsonUtils.getInteger(this.f706a, "session_url_relation", null);
    }

    protected java.lang.String d() {
        return com.applovin.impl.sdk.utils.JsonUtils.getString(this.f706a, com.adjust.sdk.Constants.REFERRER, null);
    }

    protected java.lang.Integer h() {
        return com.applovin.impl.sdk.utils.JsonUtils.getInteger(this.f706a, "toolbar_color", null);
    }

    protected java.lang.Integer a() {
        return com.applovin.impl.sdk.utils.JsonUtils.getInteger(this.f706a, "dark_mode_toolbar_color", null);
    }

    protected java.lang.Integer f() {
        return com.applovin.impl.sdk.utils.JsonUtils.getInteger(this.f706a, "share_state", null);
    }

    protected java.lang.Boolean c() {
        return com.applovin.impl.sdk.utils.JsonUtils.getBoolean(this.f706a, "instant_apps_enabled", null);
    }

    protected java.lang.Boolean i() {
        return com.applovin.impl.sdk.utils.JsonUtils.getBoolean(this.f706a, "url_bar_hiding_enabled", null);
    }

    protected java.lang.Boolean g() {
        return com.applovin.impl.sdk.utils.JsonUtils.getBoolean(this.f706a, "should_show_title", null);
    }
}
