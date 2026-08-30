package com.iab.omid.library.unity3d.adsession;

/* JADX INFO: loaded from: classes5.dex */
public abstract class AdSession {
    public static com.iab.omid.library.unity3d.adsession.AdSession createAdSession(com.iab.omid.library.unity3d.adsession.AdSessionConfiguration adSessionConfiguration, com.iab.omid.library.unity3d.adsession.AdSessionContext adSessionContext) {
        com.iab.omid.library.unity3d.utils.g.a();
        com.iab.omid.library.unity3d.utils.g.a(adSessionConfiguration, "AdSessionConfiguration is null");
        com.iab.omid.library.unity3d.utils.g.a(adSessionContext, "AdSessionContext is null");
        return new com.iab.omid.library.unity3d.adsession.a(adSessionConfiguration, adSessionContext);
    }

    public abstract void addFriendlyObstruction(android.view.View view, com.iab.omid.library.unity3d.adsession.FriendlyObstructionPurpose friendlyObstructionPurpose, java.lang.String str);

    public abstract void error(com.iab.omid.library.unity3d.adsession.ErrorType errorType, java.lang.String str);

    public abstract void finish();

    public abstract java.lang.String getAdSessionId();

    public abstract com.iab.omid.library.unity3d.publisher.AdSessionStatePublisher getAdSessionStatePublisher();

    public abstract void registerAdView(android.view.View view);

    public abstract void removeAllFriendlyObstructions();

    public abstract void removeFriendlyObstruction(android.view.View view);

    public abstract void setPossibleObstructionListener(com.iab.omid.library.unity3d.adsession.PossibleObstructionListener possibleObstructionListener);

    public abstract void start();
}
