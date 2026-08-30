package com.iab.omid.library.applovin.adsession.media;

/* JADX INFO: loaded from: classes5.dex */
public final class VastProperties {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f2350a;
    private final java.lang.Float b;
    private final boolean c;
    private final com.iab.omid.library.applovin.adsession.media.Position d;

    private VastProperties(boolean z, java.lang.Float f, boolean z2, com.iab.omid.library.applovin.adsession.media.Position position) {
        this.f2350a = z;
        this.b = f;
        this.c = z2;
        this.d = position;
    }

    public static com.iab.omid.library.applovin.adsession.media.VastProperties createVastPropertiesForNonSkippableMedia(boolean z, com.iab.omid.library.applovin.adsession.media.Position position) {
        com.iab.omid.library.applovin.utils.g.a(position, "Position is null");
        return new com.iab.omid.library.applovin.adsession.media.VastProperties(false, null, z, position);
    }

    public static com.iab.omid.library.applovin.adsession.media.VastProperties createVastPropertiesForSkippableMedia(float f, boolean z, com.iab.omid.library.applovin.adsession.media.Position position) {
        com.iab.omid.library.applovin.utils.g.a(position, "Position is null");
        return new com.iab.omid.library.applovin.adsession.media.VastProperties(true, java.lang.Float.valueOf(f), z, position);
    }

    public org.json.JSONObject a() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("skippable", this.f2350a);
            if (this.f2350a) {
                jSONObject.put("skipOffset", this.b);
            }
            jSONObject.put("autoPlay", this.c);
            jSONObject.put(com.ironsource.y8.h.L, this.d);
        } catch (org.json.JSONException e) {
            com.iab.omid.library.applovin.utils.d.a("VastProperties: JSON error", e);
        }
        return jSONObject;
    }

    public com.iab.omid.library.applovin.adsession.media.Position getPosition() {
        return this.d;
    }

    public java.lang.Float getSkipOffset() {
        return this.b;
    }

    public boolean isAutoPlay() {
        return this.c;
    }

    public boolean isSkippable() {
        return this.f2350a;
    }
}
