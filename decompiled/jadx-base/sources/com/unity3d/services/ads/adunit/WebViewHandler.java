package com.unity3d.services.ads.adunit;

/* JADX INFO: loaded from: classes6.dex */
public class WebViewHandler implements com.unity3d.services.ads.adunit.IAdUnitViewHandler {
    @Override // com.unity3d.services.ads.adunit.IAdUnitViewHandler
    public boolean create(com.unity3d.services.ads.adunit.IAdUnitActivity iAdUnitActivity) {
        return true;
    }

    @Override // com.unity3d.services.ads.adunit.IAdUnitViewHandler
    public void onCreate(com.unity3d.services.ads.adunit.IAdUnitActivity iAdUnitActivity, android.os.Bundle bundle) {
    }

    @Override // com.unity3d.services.ads.adunit.IAdUnitViewHandler
    public void onPause(com.unity3d.services.ads.adunit.IAdUnitActivity iAdUnitActivity) {
    }

    @Override // com.unity3d.services.ads.adunit.IAdUnitViewHandler
    public void onResume(com.unity3d.services.ads.adunit.IAdUnitActivity iAdUnitActivity) {
    }

    @Override // com.unity3d.services.ads.adunit.IAdUnitViewHandler
    public void onStart(com.unity3d.services.ads.adunit.IAdUnitActivity iAdUnitActivity) {
    }

    @Override // com.unity3d.services.ads.adunit.IAdUnitViewHandler
    public void onStop(com.unity3d.services.ads.adunit.IAdUnitActivity iAdUnitActivity) {
    }

    @Override // com.unity3d.services.ads.adunit.IAdUnitViewHandler
    public boolean destroy() {
        if (com.unity3d.services.core.webview.WebViewApp.getCurrentApp() == null || com.unity3d.services.core.webview.WebViewApp.getCurrentApp().getWebView() == null) {
            return true;
        }
        com.unity3d.services.core.misc.ViewUtilities.removeViewFromParent(com.unity3d.services.core.webview.WebViewApp.getCurrentApp().getWebView());
        return true;
    }

    @Override // com.unity3d.services.ads.adunit.IAdUnitViewHandler
    public android.view.View getView() {
        if (com.unity3d.services.core.webview.WebViewApp.getCurrentApp() != null) {
            return com.unity3d.services.core.webview.WebViewApp.getCurrentApp().getWebView();
        }
        return null;
    }

    @Override // com.unity3d.services.ads.adunit.IAdUnitViewHandler
    public void onDestroy(com.unity3d.services.ads.adunit.IAdUnitActivity iAdUnitActivity) {
        destroy();
    }
}
