package com.unity3d.services.ads.configuration;

/* JADX INFO: loaded from: classes6.dex */
public class AdsModuleConfiguration implements com.unity3d.services.ads.configuration.IAdsModuleConfiguration {
    private java.net.InetAddress _address;
    private final com.unity3d.services.ads.token.TokenStorage tokenStorage = (com.unity3d.services.ads.token.TokenStorage) com.unity3d.services.core.misc.Utilities.getService(com.unity3d.services.ads.token.TokenStorage.class);
    private final com.unity3d.services.ads.token.AsyncTokenStorage asyncTokenStorage = (com.unity3d.services.ads.token.AsyncTokenStorage) com.unity3d.services.core.misc.Utilities.getService(com.unity3d.services.ads.token.AsyncTokenStorage.class);

    @Override // com.unity3d.services.core.configuration.IModuleConfiguration
    public java.lang.Class[] getWebAppApiClassList() {
        return new java.lang.Class[]{com.unity3d.services.ads.api.AdUnit.class, com.unity3d.services.ads.api.VideoPlayer.class, com.unity3d.services.ads.api.WebPlayer.class, com.unity3d.services.ads.api.Load.class, com.unity3d.services.ads.api.Show.class, com.unity3d.services.ads.api.Token.class, com.unity3d.services.ads.api.GMAScar.class, com.unity3d.services.ads.api.Measurements.class, com.unity3d.services.ads.api.Topics.class};
    }

    @Override // com.unity3d.services.core.configuration.IModuleConfiguration
    public boolean resetState(com.unity3d.services.core.configuration.Configuration configuration) {
        com.unity3d.services.ads.adunit.AdUnitOpen.setConfiguration(configuration);
        com.unity3d.services.ads.UnityAdsImplementation.setConfiguration(configuration);
        this.tokenStorage.deleteTokens();
        this.asyncTokenStorage.setConfiguration(configuration);
        return true;
    }

    @Override // com.unity3d.services.core.configuration.IModuleConfiguration
    public boolean initErrorState(com.unity3d.services.core.configuration.Configuration configuration, com.unity3d.services.core.configuration.ErrorState errorState, java.lang.String str) {
        this.tokenStorage.setInitToken(null);
        this.tokenStorage.deleteTokens();
        return true;
    }

    @Override // com.unity3d.services.core.configuration.IModuleConfiguration
    public boolean initCompleteState(com.unity3d.services.core.configuration.Configuration configuration) {
        com.unity3d.services.ads.adunit.AdUnitOpen.setConfiguration(configuration);
        com.unity3d.services.ads.UnityAdsImplementation.setConfiguration(configuration);
        this.asyncTokenStorage.setConfiguration(configuration);
        return true;
    }

    @Override // com.unity3d.services.ads.configuration.IAdsModuleConfiguration
    public java.util.Map<java.lang.String, java.lang.Class> getAdUnitViewHandlers() {
        java.util.HashMap map = new java.util.HashMap();
        map.put("videoplayer", com.unity3d.services.ads.adunit.VideoPlayerHandler.class);
        map.put("webplayer", com.unity3d.services.ads.adunit.WebPlayerHandler.class);
        map.put(com.ironsource.y8.h.K, com.unity3d.services.ads.adunit.WebViewHandler.class);
        return map;
    }
}
