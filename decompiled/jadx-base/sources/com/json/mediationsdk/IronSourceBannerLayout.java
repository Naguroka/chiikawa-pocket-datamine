package com.json.mediationsdk;

/* JADX INFO: loaded from: classes5.dex */
public class IronSourceBannerLayout extends android.widget.FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private android.view.View f2927a;
    private com.json.mediationsdk.ISBannerSize b;
    private java.lang.String c;
    private android.app.Activity d;
    private boolean e;
    private boolean f;
    private com.ironsource.mediationsdk.IronSourceBannerLayout.a g;

    public interface a {
        void onWindowFocusChanged(boolean z);
    }

    public IronSourceBannerLayout(android.app.Activity activity, com.json.mediationsdk.ISBannerSize iSBannerSize) {
        super(activity);
        this.e = false;
        this.f = false;
        this.d = activity;
        this.b = iSBannerSize == null ? com.json.mediationsdk.ISBannerSize.BANNER : iSBannerSize;
    }

    public IronSourceBannerLayout(android.content.Context context) {
        super(context);
        this.e = false;
        this.f = false;
    }

    protected void a() {
        this.e = true;
        this.d = null;
        this.b = null;
        this.c = null;
        this.f2927a = null;
        this.g = null;
        removeBannerListener();
    }

    protected com.json.mediationsdk.IronSourceBannerLayout b() {
        com.json.mediationsdk.IronSourceBannerLayout ironSourceBannerLayout = new com.json.mediationsdk.IronSourceBannerLayout(this.d, this.b);
        ironSourceBannerLayout.setPlacementName(this.c);
        return ironSourceBannerLayout;
    }

    public android.app.Activity getActivity() {
        return this.d;
    }

    public com.json.mediationsdk.sdk.LevelPlayBannerListener getLevelPlayBannerListener() {
        return com.json.q5.a().b();
    }

    public java.lang.String getPlacementName() {
        return this.c;
    }

    public com.json.mediationsdk.ISBannerSize getSize() {
        return this.b;
    }

    public com.ironsource.mediationsdk.IronSourceBannerLayout.a getWindowFocusChangedListener() {
        return this.g;
    }

    public boolean isDestroyed() {
        return this.e;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        com.ironsource.mediationsdk.IronSourceBannerLayout.a aVar = this.g;
        if (aVar != null) {
            aVar.onWindowFocusChanged(z);
        }
    }

    public void removeBannerListener() {
        com.json.mediationsdk.logger.IronLog.API.info();
        com.json.q5.a().a((com.json.mediationsdk.sdk.LevelPlayBannerListener) null);
    }

    public void setBannerSize(com.json.mediationsdk.ISBannerSize iSBannerSize) {
        this.b = iSBannerSize;
    }

    @java.lang.Deprecated
    public void setLevelPlayBannerListener(com.json.mediationsdk.sdk.LevelPlayBannerListener levelPlayBannerListener) {
        com.json.mediationsdk.logger.IronLog.API.info();
        com.json.q5.a().a(levelPlayBannerListener);
    }

    public void setPlacementName(java.lang.String str) {
        this.c = str;
    }

    public void setWindowFocusChangedListener(com.ironsource.mediationsdk.IronSourceBannerLayout.a aVar) {
        this.g = aVar;
    }
}
