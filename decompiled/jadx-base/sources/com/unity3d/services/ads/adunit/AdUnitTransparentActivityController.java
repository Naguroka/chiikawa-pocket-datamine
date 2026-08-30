package com.unity3d.services.ads.adunit;

/* JADX INFO: loaded from: classes6.dex */
public class AdUnitTransparentActivityController extends com.unity3d.services.ads.adunit.AdUnitActivityController {
    public AdUnitTransparentActivityController(com.unity3d.services.ads.adunit.IAdUnitActivity iAdUnitActivity, com.unity3d.services.core.webview.bridge.IEventSender iEventSender, com.unity3d.services.ads.adunit.IAdUnitViewHandlerFactory iAdUnitViewHandlerFactory) {
        super(iAdUnitActivity, iEventSender, iAdUnitViewHandlerFactory);
    }

    @Override // com.unity3d.services.ads.adunit.AdUnitActivityController
    protected void createLayout() {
        super.createLayout();
        com.unity3d.services.core.misc.ViewUtilities.setBackground(this._layout, new android.graphics.drawable.ColorDrawable(0));
    }
}
