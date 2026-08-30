package com.iab.omid.library.unity3d.adsession;

/* JADX INFO: loaded from: classes5.dex */
public final class AdEvents {
    private final com.iab.omid.library.unity3d.adsession.a adSession;

    private AdEvents(com.iab.omid.library.unity3d.adsession.a aVar) {
        this.adSession = aVar;
    }

    public static com.iab.omid.library.unity3d.adsession.AdEvents createAdEvents(com.iab.omid.library.unity3d.adsession.AdSession adSession) {
        com.iab.omid.library.unity3d.adsession.a aVar = (com.iab.omid.library.unity3d.adsession.a) adSession;
        com.iab.omid.library.unity3d.utils.g.a(adSession, "AdSession is null");
        com.iab.omid.library.unity3d.utils.g.g(aVar);
        com.iab.omid.library.unity3d.utils.g.b(aVar);
        com.iab.omid.library.unity3d.adsession.AdEvents adEvents = new com.iab.omid.library.unity3d.adsession.AdEvents(aVar);
        aVar.getAdSessionStatePublisher().a(adEvents);
        return adEvents;
    }

    public void impressionOccurred() {
        com.iab.omid.library.unity3d.utils.g.b(this.adSession);
        com.iab.omid.library.unity3d.utils.g.e(this.adSession);
        if (!this.adSession.f()) {
            try {
                this.adSession.start();
            } catch (java.lang.Exception unused) {
            }
        }
        if (this.adSession.f()) {
            this.adSession.k();
        }
    }

    public void loaded() {
        com.iab.omid.library.unity3d.utils.g.a(this.adSession);
        com.iab.omid.library.unity3d.utils.g.e(this.adSession);
        this.adSession.l();
    }

    public void loaded(com.iab.omid.library.unity3d.adsession.media.VastProperties vastProperties) {
        com.iab.omid.library.unity3d.utils.g.a(vastProperties, "VastProperties is null");
        com.iab.omid.library.unity3d.utils.g.a(this.adSession);
        com.iab.omid.library.unity3d.utils.g.e(this.adSession);
        this.adSession.a(vastProperties.a());
    }
}
