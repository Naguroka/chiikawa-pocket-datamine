package com.json.mediationsdk.demandOnly;

/* JADX INFO: loaded from: classes5.dex */
public class ISDemandOnlyBannerLayout extends android.widget.FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private android.view.View f2945a;
    private com.json.mediationsdk.ISBannerSize b;
    private java.lang.String c;
    private android.app.Activity d;
    private boolean e;
    private com.json.p5 f;

    class a implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.view.View f2946a;
        final /* synthetic */ android.widget.FrameLayout.LayoutParams b;

        a(android.view.View view, android.widget.FrameLayout.LayoutParams layoutParams) {
            this.f2946a = view;
            this.b = layoutParams;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.json.mediationsdk.demandOnly.ISDemandOnlyBannerLayout.this.removeAllViews();
            android.view.ViewParent parent = this.f2946a.getParent();
            if (parent instanceof android.view.ViewGroup) {
                ((android.view.ViewGroup) parent).removeView(this.f2946a);
            }
            com.json.mediationsdk.demandOnly.ISDemandOnlyBannerLayout.this.f2945a = this.f2946a;
            com.json.mediationsdk.demandOnly.ISDemandOnlyBannerLayout.this.addView(this.f2946a, 0, this.b);
        }
    }

    public ISDemandOnlyBannerLayout(android.app.Activity activity, com.json.mediationsdk.ISBannerSize iSBannerSize) {
        super(activity);
        this.e = false;
        this.d = activity;
        this.b = iSBannerSize == null ? com.json.mediationsdk.ISBannerSize.BANNER : iSBannerSize;
        this.f = new com.json.p5();
    }

    private ISDemandOnlyBannerLayout(android.content.Context context) {
        super(context);
        this.e = false;
    }

    protected void a() {
        this.e = true;
        this.d = null;
        this.b = null;
        this.c = null;
        this.f2945a = null;
        removeBannerListener();
    }

    void a(android.view.View view, android.widget.FrameLayout.LayoutParams layoutParams) {
        com.json.environment.thread.IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerLayout.a(view, layoutParams));
    }

    public android.app.Activity getActivity() {
        return this.d;
    }

    public com.json.mediationsdk.demandOnly.ISDemandOnlyBannerListener getBannerDemandOnlyListener() {
        return this.f.a();
    }

    public android.view.View getBannerView() {
        return this.f2945a;
    }

    public com.json.p5 getListener() {
        return this.f;
    }

    public java.lang.String getPlacementName() {
        return this.c;
    }

    public com.json.mediationsdk.ISBannerSize getSize() {
        return this.b;
    }

    public boolean isDestroyed() {
        return this.e;
    }

    public void removeBannerListener() {
        com.json.mediationsdk.logger.IronLog.API.info();
        this.f.b((java.lang.Object) null);
    }

    public void setBannerDemandOnlyListener(com.json.mediationsdk.demandOnly.ISDemandOnlyBannerListener iSDemandOnlyBannerListener) {
        com.json.mediationsdk.logger.IronLog.API.info();
        this.f.b(iSDemandOnlyBannerListener);
    }

    public void setPlacementName(java.lang.String str) {
        this.c = str;
    }
}
