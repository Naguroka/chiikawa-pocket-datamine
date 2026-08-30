package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class kr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f968a;
    private final java.lang.String b;
    private final java.util.List c;

    public java.lang.String a() {
        return this.f968a;
    }

    public java.lang.String b() {
        return this.b;
    }

    public java.util.List c() {
        return this.c;
    }

    public kr(org.json.JSONObject jSONObject) {
        this.f968a = com.applovin.impl.sdk.utils.JsonUtils.getString(jSONObject, "user_type", androidx.media3.extractor.text.ttml.TtmlNode.COMBINE_ALL);
        this.b = com.applovin.impl.sdk.utils.JsonUtils.getString(jSONObject, "device_type", androidx.media3.extractor.text.ttml.TtmlNode.COMBINE_ALL);
        this.c = com.applovin.impl.sdk.utils.JsonUtils.getStringList(jSONObject, "segments", null);
    }
}
