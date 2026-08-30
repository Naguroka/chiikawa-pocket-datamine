package com.iab.omid.library.unity3d.adsession.media;

/* JADX INFO: loaded from: classes5.dex */
public final class MediaEvents {
    private final com.iab.omid.library.unity3d.adsession.a adSession;

    private MediaEvents(com.iab.omid.library.unity3d.adsession.a aVar) {
        this.adSession = aVar;
    }

    private void confirmValidDuration(float f) {
        if (f <= 0.0f) {
            throw new java.lang.IllegalArgumentException("Invalid Media duration");
        }
    }

    private void confirmValidVolume(float f) {
        if (f < 0.0f || f > 1.0f) {
            throw new java.lang.IllegalArgumentException("Invalid Media volume");
        }
    }

    public static com.iab.omid.library.unity3d.adsession.media.MediaEvents createMediaEvents(com.iab.omid.library.unity3d.adsession.AdSession adSession) {
        com.iab.omid.library.unity3d.adsession.a aVar = (com.iab.omid.library.unity3d.adsession.a) adSession;
        com.iab.omid.library.unity3d.utils.g.a(adSession, "AdSession is null");
        com.iab.omid.library.unity3d.utils.g.f(aVar);
        com.iab.omid.library.unity3d.utils.g.c(aVar);
        com.iab.omid.library.unity3d.utils.g.b(aVar);
        com.iab.omid.library.unity3d.utils.g.h(aVar);
        com.iab.omid.library.unity3d.adsession.media.MediaEvents mediaEvents = new com.iab.omid.library.unity3d.adsession.media.MediaEvents(aVar);
        aVar.getAdSessionStatePublisher().a(mediaEvents);
        return mediaEvents;
    }

    public void adUserInteraction(com.iab.omid.library.unity3d.adsession.media.InteractionType interactionType) {
        com.iab.omid.library.unity3d.utils.g.a(interactionType, "InteractionType is null");
        com.iab.omid.library.unity3d.utils.g.a(this.adSession);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        com.iab.omid.library.unity3d.utils.c.a(jSONObject, "interactionType", interactionType);
        this.adSession.getAdSessionStatePublisher().a("adUserInteraction", jSONObject);
    }

    public void bufferFinish() {
        com.iab.omid.library.unity3d.utils.g.a(this.adSession);
        this.adSession.getAdSessionStatePublisher().a("bufferFinish");
    }

    public void bufferStart() {
        com.iab.omid.library.unity3d.utils.g.a(this.adSession);
        this.adSession.getAdSessionStatePublisher().a("bufferStart");
    }

    public void complete() {
        com.iab.omid.library.unity3d.utils.g.a(this.adSession);
        this.adSession.getAdSessionStatePublisher().a("complete");
    }

    public void firstQuartile() {
        com.iab.omid.library.unity3d.utils.g.a(this.adSession);
        this.adSession.getAdSessionStatePublisher().a("firstQuartile");
    }

    public void midpoint() {
        com.iab.omid.library.unity3d.utils.g.a(this.adSession);
        this.adSession.getAdSessionStatePublisher().a("midpoint");
    }

    public void pause() {
        com.iab.omid.library.unity3d.utils.g.a(this.adSession);
        this.adSession.getAdSessionStatePublisher().a("pause");
    }

    public void playerStateChange(com.iab.omid.library.unity3d.adsession.media.PlayerState playerState) {
        com.iab.omid.library.unity3d.utils.g.a(playerState, "PlayerState is null");
        com.iab.omid.library.unity3d.utils.g.a(this.adSession);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        com.iab.omid.library.unity3d.utils.c.a(jSONObject, "state", playerState);
        this.adSession.getAdSessionStatePublisher().a("playerStateChange", jSONObject);
    }

    public void resume() {
        com.iab.omid.library.unity3d.utils.g.a(this.adSession);
        this.adSession.getAdSessionStatePublisher().a("resume");
    }

    public void skipped() {
        com.iab.omid.library.unity3d.utils.g.a(this.adSession);
        this.adSession.getAdSessionStatePublisher().a("skipped");
    }

    public void start(float f, float f2) {
        confirmValidDuration(f);
        confirmValidVolume(f2);
        com.iab.omid.library.unity3d.utils.g.a(this.adSession);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        com.iab.omid.library.unity3d.utils.c.a(jSONObject, "duration", java.lang.Float.valueOf(f));
        com.iab.omid.library.unity3d.utils.c.a(jSONObject, "mediaPlayerVolume", java.lang.Float.valueOf(f2));
        com.iab.omid.library.unity3d.utils.c.a(jSONObject, com.ironsource.y8.i.P, java.lang.Float.valueOf(com.iab.omid.library.unity3d.internal.h.c().b()));
        this.adSession.getAdSessionStatePublisher().a(androidx.media3.extractor.text.ttml.TtmlNode.START, jSONObject);
    }

    public void thirdQuartile() {
        com.iab.omid.library.unity3d.utils.g.a(this.adSession);
        this.adSession.getAdSessionStatePublisher().a("thirdQuartile");
    }

    public void volumeChange(float f) {
        confirmValidVolume(f);
        com.iab.omid.library.unity3d.utils.g.a(this.adSession);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        com.iab.omid.library.unity3d.utils.c.a(jSONObject, "mediaPlayerVolume", java.lang.Float.valueOf(f));
        com.iab.omid.library.unity3d.utils.c.a(jSONObject, com.ironsource.y8.i.P, java.lang.Float.valueOf(com.iab.omid.library.unity3d.internal.h.c().b()));
        this.adSession.getAdSessionStatePublisher().a("volumeChange", jSONObject);
    }
}
