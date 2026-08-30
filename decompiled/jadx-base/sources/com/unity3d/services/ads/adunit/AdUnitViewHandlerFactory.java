package com.unity3d.services.ads.adunit;

/* JADX INFO: loaded from: classes6.dex */
public class AdUnitViewHandlerFactory implements com.unity3d.services.ads.adunit.IAdUnitViewHandlerFactory {
    @Override // com.unity3d.services.ads.adunit.IAdUnitViewHandlerFactory
    public com.unity3d.services.ads.adunit.IAdUnitViewHandler createViewHandler(java.lang.String str) {
        java.util.Map<java.lang.String, java.lang.Class> adUnitViewHandlers;
        if (com.unity3d.services.core.webview.WebViewApp.getCurrentApp() != null) {
            com.unity3d.services.core.configuration.Configuration configuration = com.unity3d.services.core.webview.WebViewApp.getCurrentApp().getConfiguration();
            for (java.lang.Class cls : configuration.getModuleConfigurationList()) {
                com.unity3d.services.core.configuration.IModuleConfiguration moduleConfiguration = configuration.getModuleConfiguration(cls);
                if ((moduleConfiguration instanceof com.unity3d.services.ads.configuration.IAdsModuleConfiguration) && (adUnitViewHandlers = ((com.unity3d.services.ads.configuration.IAdsModuleConfiguration) moduleConfiguration).getAdUnitViewHandlers()) != null && adUnitViewHandlers.containsKey(str)) {
                    try {
                        return (com.unity3d.services.ads.adunit.IAdUnitViewHandler) adUnitViewHandlers.get(str).newInstance();
                    } catch (java.lang.Exception unused) {
                        com.unity3d.services.core.log.DeviceLog.error("Error creating view: " + str);
                        return null;
                    }
                }
            }
        }
        return null;
    }
}
