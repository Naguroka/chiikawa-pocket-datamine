package com.unity3d.services.analytics.core.configuration;

/* JADX INFO: loaded from: classes6.dex */
public class AnalyticsModuleConfiguration implements com.unity3d.services.core.configuration.IModuleConfiguration {
    private static final java.lang.Class[] WEB_APP_API_CLASS_LIST = {com.unity3d.services.analytics.core.api.Analytics.class};

    @Override // com.unity3d.services.core.configuration.IModuleConfiguration
    public boolean initCompleteState(com.unity3d.services.core.configuration.Configuration configuration) {
        return true;
    }

    @Override // com.unity3d.services.core.configuration.IModuleConfiguration
    public boolean initErrorState(com.unity3d.services.core.configuration.Configuration configuration, com.unity3d.services.core.configuration.ErrorState errorState, java.lang.String str) {
        return true;
    }

    @Override // com.unity3d.services.core.configuration.IModuleConfiguration
    public boolean resetState(com.unity3d.services.core.configuration.Configuration configuration) {
        return true;
    }

    @Override // com.unity3d.services.core.configuration.IModuleConfiguration
    public java.lang.Class[] getWebAppApiClassList() {
        return WEB_APP_API_CLASS_LIST;
    }
}
