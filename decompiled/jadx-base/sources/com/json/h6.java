package com.json;

/* JADX INFO: loaded from: classes5.dex */
public class h6 extends com.json.n7<com.json.p1> implements com.json.mediationsdk.adunit.adapter.listener.BannerAdListener, com.json.a2 {
    public static final java.lang.String t = "bannerLayout";
    public static final java.lang.String u = "bannerSize";
    private final com.json.mediationsdk.IronSourceBannerLayout r;
    private final boolean s;

    class a extends com.json.dr {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.view.View f2707a;
        final /* synthetic */ android.widget.FrameLayout.LayoutParams b;

        a(android.view.View view, android.widget.FrameLayout.LayoutParams layoutParams) {
            this.f2707a = view;
            this.b = layoutParams;
        }

        @Override // com.json.dr
        public void a() {
            com.json.h6.this.a(this.f2707a, this.b);
        }
    }

    class b extends com.json.dr {
        b() {
        }

        @Override // com.json.dr
        public void a() {
            com.json.h6.this.J();
        }
    }

    public h6(com.json.pp ppVar, com.json.j1 j1Var, com.json.mediationsdk.adunit.adapter.internal.BaseAdAdapter<?, com.json.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener> baseAdAdapter, com.json.mediationsdk.IronSourceBannerLayout ironSourceBannerLayout, com.json.mediationsdk.model.Placement placement, boolean z, com.json.j5 j5Var, com.json.p1 p1Var) {
        super(ppVar, j1Var, baseAdAdapter, new com.json.z2(j1Var.g(), j1Var.g().getBannerSettings(), com.ironsource.mediationsdk.IronSource.AD_UNIT.BANNER), j5Var, p1Var);
        this.r = ironSourceBannerLayout;
        this.g = placement;
        this.s = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J() {
        com.json.mediationsdk.logger.IronLog ironLog = com.json.mediationsdk.logger.IronLog.INTERNAL;
        ironLog.verbose(d());
        if (y()) {
            super.onAdOpened();
        } else {
            if (this.e == com.ironsource.n7.h.FAILED) {
                return;
            }
            ironLog.error(java.lang.String.format("unexpected onAdOpened for %s, state - %s", k(), this.e));
            if (this.d != null) {
                this.d.k.p(java.lang.String.format("unexpected onAdOpened, state - %s", this.e));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(android.view.View view, android.widget.FrameLayout.LayoutParams layoutParams) {
        Listener listener;
        super.onAdLoadSuccess();
        if (!y() || (listener = this.b) == 0) {
            return;
        }
        ((com.json.p1) listener).a(this, view, layoutParams);
    }

    @Override // com.json.n7
    protected void G() {
        java.lang.Object obj = this.c;
        if (obj instanceof com.json.mediationsdk.adunit.adapter.internal.AdapterBannerInterface) {
            ((com.json.mediationsdk.adunit.adapter.internal.AdapterBannerInterface) obj).loadAd(this.k, com.json.environment.ContextProvider.getInstance().getCurrentActiveActivity(), this.r.getSize(), this);
        } else {
            com.json.mediationsdk.logger.IronLog.INTERNAL.error(a("adapter not instance of AdapterBannerInterface"));
        }
    }

    @Override // com.json.n7
    protected boolean O() {
        return false;
    }

    public void P() {
        com.json.mediationsdk.logger.IronLog ironLog = com.json.mediationsdk.logger.IronLog.INTERNAL;
        ironLog.verbose(k());
        a(com.ironsource.n7.h.NONE);
        java.lang.Object obj = this.c;
        if (obj == null) {
            ironLog.warning("mAdapter == null");
            return;
        }
        try {
            if (obj instanceof com.json.mediationsdk.adunit.adapter.internal.AdapterBannerInterface) {
                ((com.json.mediationsdk.adunit.adapter.internal.AdapterBannerInterface) obj).destroyAd(this.k);
            } else {
                ironLog.error(a("adapter not instance of AdapterBannerInterface"));
            }
        } catch (java.lang.Throwable th) {
            com.json.l9.d().a(th);
            java.lang.String str = "destroyBanner - exception = " + th.getLocalizedMessage() + " state = " + this.e;
            com.json.mediationsdk.logger.IronLog.INTERNAL.error(a(str));
            com.json.b2 b2Var = this.d;
            if (b2Var != null) {
                b2Var.k.g(str);
            }
        }
        com.json.b2 b2Var2 = this.d;
        if (b2Var2 != null) {
            b2Var2.g.a(r().intValue());
        }
    }

    public void Q() {
        java.lang.Object obj = this.c;
        if (obj instanceof com.json.mediationsdk.adunit.adapter.internal.AdapterBindAdViewInterface) {
            ((com.json.mediationsdk.adunit.adapter.internal.AdapterBindAdViewInterface) obj).onAdViewBound(this.k);
        }
    }

    public void R() {
        java.lang.Object obj = this.c;
        if (obj instanceof com.json.mediationsdk.adunit.adapter.internal.AdapterBindAdViewInterface) {
            ((com.json.mediationsdk.adunit.adapter.internal.AdapterBindAdViewInterface) obj).onAdViewWillBind(this.k);
        }
    }

    @Override // com.json.n7
    protected com.json.mediationsdk.adunit.adapter.utility.AdData a(java.lang.String str, java.util.Map<java.lang.String, java.lang.Object> map) {
        return new com.json.mediationsdk.adunit.adapter.utility.AdData(str, q(), a(map));
    }

    @Override // com.json.n7, com.json.a2
    public java.util.Map<java.lang.String, java.lang.Object> a(com.json.y1 y1Var) {
        java.util.Map<java.lang.String, java.lang.Object> mapA = super.a(y1Var);
        com.json.mediationsdk.IronSourceBannerLayout ironSourceBannerLayout = this.r;
        if (ironSourceBannerLayout != null && !ironSourceBannerLayout.isDestroyed()) {
            com.json.mediationsdk.l.a(mapA, this.r.getSize());
        }
        if (this.g != null) {
            mapA.put("placement", j());
        }
        return mapA;
    }

    @Override // com.json.n7
    protected java.util.Map<java.lang.String, java.lang.Object> a(java.util.Map<java.lang.String, java.lang.Object> map) {
        java.util.Map<java.lang.String, java.lang.Object> mapA = super.a(map);
        com.json.j1 j1Var = this.f3063a;
        if (j1Var != null && this.r != null && android.text.TextUtils.isEmpty(j1Var.g().getCustomNetwork())) {
            mapA.put("bannerLayout", this.r);
        }
        return mapA;
    }

    @Override // com.json.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    public void onAdLeftApplication() {
        com.json.b2 b2Var;
        com.json.mediationsdk.model.Placement placement = this.g;
        if (placement != null && (b2Var = this.d) != null) {
            b2Var.j.f(placement.getCom.ironsource.op.d java.lang.String());
        }
        Listener listener = this.b;
        if (listener != 0) {
            ((com.json.p1) listener).d(this);
        }
    }

    @Override // com.json.mediationsdk.adunit.adapter.listener.BannerAdListener, com.json.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    public void onAdLoadSuccess(android.view.View view, android.widget.FrameLayout.LayoutParams layoutParams) {
        if (u().c()) {
            u().a(new com.ironsource.h6.a(view, layoutParams));
        } else {
            a(view, layoutParams);
        }
    }

    @Override // com.json.n7, com.json.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdOpened() {
        if (u().c()) {
            u().a(new com.ironsource.h6.b());
        } else {
            J();
        }
    }

    @Override // com.json.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    public void onAdScreenDismissed() {
        com.json.b2 b2Var;
        com.json.mediationsdk.model.Placement placement = this.g;
        if (placement != null && (b2Var = this.d) != null) {
            b2Var.j.c(placement.getCom.ironsource.op.d java.lang.String());
        }
        Listener listener = this.b;
        if (listener != 0) {
            ((com.json.p1) listener).c(this);
        }
    }

    @Override // com.json.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    public void onAdScreenPresented() {
        com.json.b2 b2Var;
        com.json.mediationsdk.model.Placement placement = this.g;
        if (placement != null && (b2Var = this.d) != null) {
            b2Var.j.h(placement.getCom.ironsource.op.d java.lang.String());
        }
        Listener listener = this.b;
        if (listener != 0) {
            ((com.json.p1) listener).a(this);
        }
    }

    @Override // com.json.n7
    protected boolean v() {
        return this.s;
    }
}
