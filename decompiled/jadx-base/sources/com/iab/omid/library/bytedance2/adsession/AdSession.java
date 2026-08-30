package com.iab.omid.library.bytedance2.adsession;

/* JADX INFO: loaded from: classes5.dex */
public abstract class AdSession {
    public static com.iab.omid.library.bytedance2.adsession.AdSession createAdSession(com.iab.omid.library.bytedance2.adsession.AdSessionConfiguration adSessionConfiguration, com.iab.omid.library.bytedance2.adsession.AdSessionContext adSessionContext) {
        com.iab.omid.library.bytedance2.utils.g.a();
        com.iab.omid.library.bytedance2.utils.g.a(adSessionConfiguration, "AdSessionConfiguration is null");
        com.iab.omid.library.bytedance2.utils.g.a(adSessionContext, "AdSessionContext is null");
        return new com.iab.omid.library.bytedance2.adsession.a(adSessionConfiguration, adSessionContext);
    }

    public abstract void addFriendlyObstruction(android.view.View view, com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose friendlyObstructionPurpose, java.lang.String str);

    public abstract void error(com.iab.omid.library.bytedance2.adsession.ErrorType errorType, java.lang.String str);

    public abstract void finish();

    public abstract java.lang.String getAdSessionId();

    public abstract com.iab.omid.library.bytedance2.publisher.AdSessionStatePublisher getAdSessionStatePublisher();

    public abstract void registerAdView(android.view.View view);

    public abstract void removeAllFriendlyObstructions();

    public abstract void removeFriendlyObstruction(android.view.View view);

    public abstract void setPossibleObstructionListener(com.iab.omid.library.bytedance2.adsession.PossibleObstructionListener possibleObstructionListener);

    public abstract void start();
}
