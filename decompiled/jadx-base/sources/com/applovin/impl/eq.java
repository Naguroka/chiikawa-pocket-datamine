package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public abstract class eq {
    private static final java.util.List f = java.util.Arrays.asList(androidx.media3.common.MimeTypes.VIDEO_MP4, "video/webm", androidx.media3.common.MimeTypes.VIDEO_H263, androidx.media3.common.MimeTypes.VIDEO_MATROSKA);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.j f768a;
    private final org.json.JSONObject c;
    private final org.json.JSONObject d;
    protected java.util.List b = new java.util.ArrayList();
    private final long e = java.lang.System.currentTimeMillis();

    public eq(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, com.applovin.impl.sdk.j jVar) {
        this.f768a = jVar;
        this.c = jSONObject;
        this.d = jSONObject2;
    }

    public int d() {
        return this.b.size();
    }

    public java.util.List a() {
        return this.b;
    }

    public org.json.JSONObject b() {
        return this.c;
    }

    public org.json.JSONObject e() {
        return this.d;
    }

    public long c() {
        return this.e;
    }

    public java.util.List f() {
        java.util.List<java.lang.String> listExplode = com.applovin.impl.sdk.utils.CollectionUtils.explode(com.applovin.impl.sdk.utils.JsonUtils.getString(this.c, "vast_preferred_video_types", null));
        return !listExplode.isEmpty() ? listExplode : f;
    }

    public int g() {
        return com.applovin.impl.yp.a(com.applovin.impl.sdk.utils.JsonUtils.getInt(this.c, "video_completion_percent", -1));
    }
}
