package com.unity3d.ads.core.data.manager;

/* JADX INFO: compiled from: AndroidOmidManager.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0018\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\f\u001a\u00020\u0015H\u0016J0\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0004H\u0016J0\u0010\u001f\u001a\u00020\u00152\b\u0010 \u001a\u0004\u0018\u00010!2\b\u0010\"\u001a\u0004\u0018\u00010#2\b\u0010$\u001a\u0004\u0018\u00010\u00072\b\u0010%\u001a\u0004\u0018\u00010\u0007H\u0016J0\u0010&\u001a\u00020\u00152\b\u0010 \u001a\u0004\u0018\u00010!2\b\u0010\"\u001a\u0004\u0018\u00010#2\b\u0010$\u001a\u0004\u0018\u00010\u00072\b\u0010%\u001a\u0004\u0018\u00010\u0007H\u0016R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006'"}, d2 = {"Lcom/unity3d/ads/core/data/manager/AndroidOmidManager;", "Lcom/unity3d/ads/core/data/manager/OmidManager;", "()V", "isActive", "", "()Z", "version", "", com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridge.versionMethodName, "()Ljava/lang/String;", "activate", "", "context", "Landroid/content/Context;", "createAdEvents", "Lcom/iab/omid/library/unity3d/adsession/AdEvents;", "adSession", "Lcom/iab/omid/library/unity3d/adsession/AdSession;", "createAdSession", "adSessionConfiguration", "Lcom/iab/omid/library/unity3d/adsession/AdSessionConfiguration;", "Lcom/iab/omid/library/unity3d/adsession/AdSessionContext;", "createAdSessionConfiguration", "creativeType", "Lcom/iab/omid/library/unity3d/adsession/CreativeType;", "impressionType", "Lcom/iab/omid/library/unity3d/adsession/ImpressionType;", "owner", "Lcom/iab/omid/library/unity3d/adsession/Owner;", "mediaEventsOwner", "isolateVerificationScripts", "createHtmlAdSessionContext", "partner", "Lcom/iab/omid/library/unity3d/adsession/Partner;", "adView", "Landroid/webkit/WebView;", "contentUrl", "customReferenceData", "createJavaScriptAdSessionContext", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AndroidOmidManager implements com.unity3d.ads.core.data.manager.OmidManager {
    @Override // com.unity3d.ads.core.data.manager.OmidManager
    public boolean isActive() {
        return com.iab.omid.library.unity3d.Omid.isActive();
    }

    @Override // com.unity3d.ads.core.data.manager.OmidManager
    public java.lang.String getVersion() {
        java.lang.String version = com.iab.omid.library.unity3d.Omid.getVersion();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(version, "getVersion()");
        return version;
    }

    @Override // com.unity3d.ads.core.data.manager.OmidManager
    public void activate(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        com.iab.omid.library.unity3d.Omid.activate(context);
    }

    @Override // com.unity3d.ads.core.data.manager.OmidManager
    public com.iab.omid.library.unity3d.adsession.AdSessionContext createHtmlAdSessionContext(com.iab.omid.library.unity3d.adsession.Partner partner, android.webkit.WebView adView, java.lang.String contentUrl, java.lang.String customReferenceData) {
        com.iab.omid.library.unity3d.adsession.AdSessionContext adSessionContextCreateHtmlAdSessionContext = com.iab.omid.library.unity3d.adsession.AdSessionContext.createHtmlAdSessionContext(partner, adView, contentUrl, customReferenceData);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(adSessionContextCreateHtmlAdSessionContext, "createHtmlAdSessionConte…customReferenceData\n    )");
        return adSessionContextCreateHtmlAdSessionContext;
    }

    @Override // com.unity3d.ads.core.data.manager.OmidManager
    public com.iab.omid.library.unity3d.adsession.AdSessionContext createJavaScriptAdSessionContext(com.iab.omid.library.unity3d.adsession.Partner partner, android.webkit.WebView adView, java.lang.String contentUrl, java.lang.String customReferenceData) {
        com.iab.omid.library.unity3d.adsession.AdSessionContext adSessionContextCreateJavascriptAdSessionContext = com.iab.omid.library.unity3d.adsession.AdSessionContext.createJavascriptAdSessionContext(partner, adView, contentUrl, customReferenceData);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(adSessionContextCreateJavascriptAdSessionContext, "createJavascriptAdSessio…customReferenceData\n    )");
        return adSessionContextCreateJavascriptAdSessionContext;
    }

    @Override // com.unity3d.ads.core.data.manager.OmidManager
    public com.iab.omid.library.unity3d.adsession.AdSessionConfiguration createAdSessionConfiguration(com.iab.omid.library.unity3d.adsession.CreativeType creativeType, com.iab.omid.library.unity3d.adsession.ImpressionType impressionType, com.iab.omid.library.unity3d.adsession.Owner owner, com.iab.omid.library.unity3d.adsession.Owner mediaEventsOwner, boolean isolateVerificationScripts) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creativeType, "creativeType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(impressionType, "impressionType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(owner, "owner");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mediaEventsOwner, "mediaEventsOwner");
        com.iab.omid.library.unity3d.adsession.AdSessionConfiguration adSessionConfigurationCreateAdSessionConfiguration = com.iab.omid.library.unity3d.adsession.AdSessionConfiguration.createAdSessionConfiguration(creativeType, impressionType, owner, mediaEventsOwner, isolateVerificationScripts);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(adSessionConfigurationCreateAdSessionConfiguration, "createAdSessionConfigura…VerificationScripts\n    )");
        return adSessionConfigurationCreateAdSessionConfiguration;
    }

    @Override // com.unity3d.ads.core.data.manager.OmidManager
    public com.iab.omid.library.unity3d.adsession.AdSession createAdSession(com.iab.omid.library.unity3d.adsession.AdSessionConfiguration adSessionConfiguration, com.iab.omid.library.unity3d.adsession.AdSessionContext context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adSessionConfiguration, "adSessionConfiguration");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        com.iab.omid.library.unity3d.adsession.AdSession adSessionCreateAdSession = com.iab.omid.library.unity3d.adsession.AdSession.createAdSession(adSessionConfiguration, context);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(adSessionCreateAdSession, "createAdSession(adSessionConfiguration, context)");
        return adSessionCreateAdSession;
    }

    @Override // com.unity3d.ads.core.data.manager.OmidManager
    public com.iab.omid.library.unity3d.adsession.AdEvents createAdEvents(com.iab.omid.library.unity3d.adsession.AdSession adSession) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adSession, "adSession");
        com.iab.omid.library.unity3d.adsession.AdEvents adEventsCreateAdEvents = com.iab.omid.library.unity3d.adsession.AdEvents.createAdEvents(adSession);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(adEventsCreateAdEvents, "createAdEvents(adSession)");
        return adEventsCreateAdEvents;
    }
}
