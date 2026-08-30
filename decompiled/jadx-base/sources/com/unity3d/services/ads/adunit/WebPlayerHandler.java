package com.unity3d.services.ads.adunit;

/* JADX INFO: loaded from: classes6.dex */
public class WebPlayerHandler implements com.unity3d.services.ads.adunit.IAdUnitViewHandler {
    private static java.lang.String webPlayerViewId = "webplayer";
    private com.unity3d.services.ads.webplayer.WebPlayerView _webPlayerView;

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
    public boolean create(com.unity3d.services.ads.adunit.IAdUnitActivity iAdUnitActivity) {
        if (this._webPlayerView != null) {
            return true;
        }
        com.unity3d.services.ads.webplayer.WebPlayerSettingsCache webPlayerSettingsCache = com.unity3d.services.ads.webplayer.WebPlayerSettingsCache.getInstance();
        android.content.Context context = iAdUnitActivity.getContext();
        java.lang.String str = webPlayerViewId;
        com.unity3d.services.ads.webplayer.WebPlayerView webPlayerView = new com.unity3d.services.ads.webplayer.WebPlayerView(context, str, webPlayerSettingsCache.getWebSettings(str), webPlayerSettingsCache.getWebPlayerSettings(webPlayerViewId));
        this._webPlayerView = webPlayerView;
        webPlayerView.setEventSettings(webPlayerSettingsCache.getWebPlayerEventSettings(webPlayerViewId));
        com.unity3d.services.ads.webplayer.WebPlayerViewCache.getInstance().addWebPlayer(webPlayerViewId, this._webPlayerView);
        return true;
    }

    @Override // com.unity3d.services.ads.adunit.IAdUnitViewHandler
    public boolean destroy() {
        com.unity3d.services.ads.webplayer.WebPlayerView webPlayerView = this._webPlayerView;
        if (webPlayerView != null) {
            com.unity3d.services.core.misc.ViewUtilities.removeViewFromParent(webPlayerView);
            this._webPlayerView.destroy();
        }
        com.unity3d.services.ads.webplayer.WebPlayerViewCache.getInstance().removeWebPlayer(webPlayerViewId);
        this._webPlayerView = null;
        return true;
    }

    @Override // com.unity3d.services.ads.adunit.IAdUnitViewHandler
    public android.view.View getView() {
        return this._webPlayerView;
    }

    @Override // com.unity3d.services.ads.adunit.IAdUnitViewHandler
    public void onCreate(com.unity3d.services.ads.adunit.IAdUnitActivity iAdUnitActivity, android.os.Bundle bundle) {
        create(iAdUnitActivity);
    }

    @Override // com.unity3d.services.ads.adunit.IAdUnitViewHandler
    public void onDestroy(com.unity3d.services.ads.adunit.IAdUnitActivity iAdUnitActivity) {
        if (iAdUnitActivity.isFinishing()) {
            destroy();
        }
    }
}
