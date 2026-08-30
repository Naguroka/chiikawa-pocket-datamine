package com.unity3d.ads.core.data.manager;

/* JADX INFO: compiled from: OmidManager.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH&J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H&J\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\u0014H&J0\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0003H&J0\u0010\u001e\u001a\u00020\u00142\b\u0010\u001f\u001a\u0004\u0018\u00010 2\b\u0010!\u001a\u0004\u0018\u00010\"2\b\u0010#\u001a\u0004\u0018\u00010\u00062\b\u0010$\u001a\u0004\u0018\u00010\u0006H&J0\u0010%\u001a\u00020\u00142\b\u0010\u001f\u001a\u0004\u0018\u00010 2\b\u0010!\u001a\u0004\u0018\u00010\"2\b\u0010#\u001a\u0004\u0018\u00010\u00062\b\u0010$\u001a\u0004\u0018\u00010\u0006H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0004R\u0012\u0010\u0005\u001a\u00020\u0006X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006&"}, d2 = {"Lcom/unity3d/ads/core/data/manager/OmidManager;", "", "isActive", "", "()Z", "version", "", com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridge.versionMethodName, "()Ljava/lang/String;", "activate", "", "context", "Landroid/content/Context;", "createAdEvents", "Lcom/iab/omid/library/unity3d/adsession/AdEvents;", "adSession", "Lcom/iab/omid/library/unity3d/adsession/AdSession;", "createAdSession", "adSessionConfiguration", "Lcom/iab/omid/library/unity3d/adsession/AdSessionConfiguration;", "Lcom/iab/omid/library/unity3d/adsession/AdSessionContext;", "createAdSessionConfiguration", "creativeType", "Lcom/iab/omid/library/unity3d/adsession/CreativeType;", "impressionType", "Lcom/iab/omid/library/unity3d/adsession/ImpressionType;", "owner", "Lcom/iab/omid/library/unity3d/adsession/Owner;", "mediaEventsOwner", "isolateVerificationScripts", "createHtmlAdSessionContext", "partner", "Lcom/iab/omid/library/unity3d/adsession/Partner;", "adView", "Landroid/webkit/WebView;", "contentUrl", "customReferenceData", "createJavaScriptAdSessionContext", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface OmidManager {
    void activate(android.content.Context context);

    com.iab.omid.library.unity3d.adsession.AdEvents createAdEvents(com.iab.omid.library.unity3d.adsession.AdSession adSession);

    com.iab.omid.library.unity3d.adsession.AdSession createAdSession(com.iab.omid.library.unity3d.adsession.AdSessionConfiguration adSessionConfiguration, com.iab.omid.library.unity3d.adsession.AdSessionContext context);

    com.iab.omid.library.unity3d.adsession.AdSessionConfiguration createAdSessionConfiguration(com.iab.omid.library.unity3d.adsession.CreativeType creativeType, com.iab.omid.library.unity3d.adsession.ImpressionType impressionType, com.iab.omid.library.unity3d.adsession.Owner owner, com.iab.omid.library.unity3d.adsession.Owner mediaEventsOwner, boolean isolateVerificationScripts);

    com.iab.omid.library.unity3d.adsession.AdSessionContext createHtmlAdSessionContext(com.iab.omid.library.unity3d.adsession.Partner partner, android.webkit.WebView adView, java.lang.String contentUrl, java.lang.String customReferenceData);

    com.iab.omid.library.unity3d.adsession.AdSessionContext createJavaScriptAdSessionContext(com.iab.omid.library.unity3d.adsession.Partner partner, android.webkit.WebView adView, java.lang.String contentUrl, java.lang.String customReferenceData);

    java.lang.String getVersion();

    boolean isActive();
}
