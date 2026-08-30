package com.unity3d.services.ads.adunit;

/* JADX INFO: loaded from: classes6.dex */
public class AdUnitTransparentActivity extends com.unity3d.services.ads.adunit.AdUnitActivity {
    @Override // com.unity3d.services.ads.adunit.AdUnitActivity, android.app.Activity
    protected void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.unity3d.services.core.misc.ViewUtilities.setBackground(this._controller._layout, new android.graphics.drawable.ColorDrawable(0));
    }

    @Override // com.unity3d.services.ads.adunit.AdUnitActivity
    protected com.unity3d.services.ads.adunit.AdUnitActivityController createController() {
        return new com.unity3d.services.ads.adunit.AdUnitTransparentActivityController(this, com.unity3d.services.core.webview.bridge.SharedInstances.INSTANCE.getWebViewEventSender(), new com.unity3d.services.ads.adunit.AdUnitViewHandlerFactory());
    }
}
