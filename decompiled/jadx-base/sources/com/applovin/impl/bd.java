package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class bd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final org.json.JSONObject f643a;

    public bd(org.json.JSONObject jSONObject) {
        this.f643a = jSONObject == null ? new org.json.JSONObject() : jSONObject;
    }

    public int a() {
        java.lang.String string = com.applovin.impl.sdk.utils.JsonUtils.getString(this.f643a, "background_color", null);
        return string != null ? android.graphics.Color.parseColor(string) : androidx.core.view.ViewCompat.MEASURED_STATE_MASK;
    }

    public int f() {
        return com.applovin.impl.sdk.utils.JsonUtils.getInt(this.f643a, "close_button_top_margin", 20);
    }

    public int d() {
        return com.applovin.impl.sdk.utils.JsonUtils.getInt(this.f643a, "close_button_h_margin", 5);
    }

    public int e() {
        return com.applovin.impl.sdk.utils.JsonUtils.getInt(this.f643a, "close_button_size", 30);
    }

    public int c() {
        return com.applovin.impl.sdk.utils.JsonUtils.getInt(this.f643a, "close_button_extended_touch_area_size", 10);
    }

    public long b() {
        return com.applovin.impl.sdk.utils.JsonUtils.getLong(this.f643a, "close_button_delay_ms", androidx.media3.common.C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS);
    }
}
