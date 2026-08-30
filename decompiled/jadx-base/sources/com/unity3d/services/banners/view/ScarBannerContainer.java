package com.unity3d.services.banners.view;

/* JADX INFO: loaded from: classes6.dex */
public class ScarBannerContainer extends android.widget.RelativeLayout {
    private java.lang.String _bannerAdId;

    public ScarBannerContainer(android.content.Context context, java.lang.String str) {
        super(context);
        this._bannerAdId = str;
    }

    public void destroy() {
        com.unity3d.services.core.misc.Utilities.runOnUiThread(new java.lang.Runnable() { // from class: com.unity3d.services.banners.view.ScarBannerContainer$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.unity3d.services.banners.view.ScarBannerContainer.lambda$destroy$0(this.f$0);
            }
        });
    }

    static /* synthetic */ void lambda$destroy$0(com.unity3d.services.banners.view.ScarBannerContainer scarBannerContainer) {
        scarBannerContainer.removeAllViews();
        android.view.ViewParent parent = scarBannerContainer.getParent();
        if (parent instanceof android.view.ViewGroup) {
            ((android.view.ViewGroup) parent).removeView(scarBannerContainer);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.unity3d.services.banners.bridge.BannerBridge.didAttachScarBanner(this._bannerAdId);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.unity3d.services.banners.bridge.BannerBridge.didDetachScarBanner(this._bannerAdId);
    }
}
