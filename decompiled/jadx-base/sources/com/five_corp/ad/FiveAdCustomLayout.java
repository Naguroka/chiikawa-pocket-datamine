package com.five_corp.ad;

/* JADX INFO: loaded from: classes4.dex */
public class FiveAdCustomLayout extends android.widget.FrameLayout implements com.five_corp.ad.FiveAdInterface, com.five_corp.ad.internal.adselector.c, com.five_corp.ad.c {
    public static final java.lang.String o = com.five_corp.ad.FiveAdCustomLayout.class.toString();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public java.lang.String f1764a;
    public final android.content.Context b;
    public final com.five_corp.ad.j c;
    public final com.five_corp.ad.internal.context.i d;
    public final com.five_corp.ad.internal.D e;
    public final com.five_corp.ad.internal.soundstate.c f;
    public final android.widget.FrameLayout g;
    public final com.five_corp.ad.internal.logger.a h;
    public final java.lang.Object i;
    public com.five_corp.ad.FiveAdState j;
    public com.five_corp.ad.f k;
    public com.five_corp.ad.internal.C l;
    public final int m;
    public boolean n;

    public FiveAdCustomLayout(android.content.Context context) {
        super(context);
        this.f1764a = null;
        this.i = new java.lang.Object();
        this.n = false;
        throw new java.lang.IllegalArgumentException("please use other constructor.");
    }

    private com.five_corp.ad.f getAdController() {
        com.five_corp.ad.f fVar;
        synchronized (this.i) {
            fVar = this.k;
        }
        return fVar;
    }

    private com.five_corp.ad.internal.ad.custom_layout.d getCustomLayoutConfig() {
        com.five_corp.ad.internal.view.C1519l c1519l;
        com.five_corp.ad.f adController = getAdController();
        if (adController == null || (c1519l = adController.c) == null) {
            return null;
        }
        return c1519l.getCustomLayoutConfig();
    }

    private com.five_corp.ad.internal.context.l getLoadedContext() {
        com.five_corp.ad.f adController = getAdController();
        if (adController != null) {
            return adController.l;
        }
        return null;
    }

    public final void a(int i, int i2) {
        com.five_corp.ad.internal.ad.custom_layout.d customLayoutConfig = getCustomLayoutConfig();
        if (customLayoutConfig == null) {
            return;
        }
        if (customLayoutConfig.f1800a * i2 < customLayoutConfig.b * i) {
            this.g.setLayoutParams(new android.widget.FrameLayout.LayoutParams((customLayoutConfig.f1800a * i2) / customLayoutConfig.b, i2, 17));
        } else {
            this.g.setLayoutParams(new android.widget.FrameLayout.LayoutParams(i, (customLayoutConfig.b * i) / customLayoutConfig.f1800a, 17));
        }
    }

    @Override // com.five_corp.ad.FiveAdInterface
    public void enableSound(boolean z) {
        this.f.a(z);
    }

    public java.lang.String getAdvertiserName() {
        java.lang.String str;
        com.five_corp.ad.internal.context.l loadedContext = getLoadedContext();
        return (loadedContext == null || (str = loadedContext.b.t) == null) ? "" : str;
    }

    @Override // com.five_corp.ad.FiveAdInterface
    public com.five_corp.ad.CreativeType getCreativeType() {
        com.five_corp.ad.f adController = getAdController();
        return adController != null ? adController.l.b.b : com.five_corp.ad.CreativeType.NOT_LOADED;
    }

    @Override // com.five_corp.ad.FiveAdInterface
    public java.lang.String getFiveAdTag() {
        return this.f1764a;
    }

    public int getLogicalHeight() {
        if (this.n) {
            return getHeight();
        }
        int i = this.m;
        com.five_corp.ad.internal.ad.custom_layout.d customLayoutConfig = getCustomLayoutConfig();
        if (getState() != com.five_corp.ad.FiveAdState.LOADED || customLayoutConfig == null) {
            return 0;
        }
        return (i * customLayoutConfig.b) / customLayoutConfig.f1800a;
    }

    public int getLogicalWidth() {
        return this.n ? getWidth() : this.m;
    }

    @Override // com.five_corp.ad.FiveAdInterface
    public java.lang.String getSlotId() {
        return this.d.c;
    }

    @Override // com.five_corp.ad.FiveAdInterface
    @java.lang.Deprecated
    public com.five_corp.ad.FiveAdState getState() {
        com.five_corp.ad.FiveAdState fiveAdState;
        synchronized (this.i) {
            fiveAdState = this.j;
        }
        return fiveAdState;
    }

    @Override // com.five_corp.ad.FiveAdInterface
    public boolean isSoundEnabled() {
        return this.f.a().a();
    }

    public void loadAdAsync() {
        boolean z;
        synchronized (this.i) {
            if (this.j != com.five_corp.ad.FiveAdState.NOT_LOADED || this.l == null) {
                z = false;
            } else {
                this.j = com.five_corp.ad.FiveAdState.LOADING;
                z = true;
            }
        }
        if (z) {
            this.c.l.a(this.d, com.five_corp.ad.internal.context.h.CUSTOM_LAYOUT, this.f.a(), this);
            return;
        }
        com.five_corp.ad.internal.D d = this.e;
        com.five_corp.ad.FiveAdErrorCode fiveAdErrorCode = com.five_corp.ad.FiveAdErrorCode.INVALID_STATE;
        com.five_corp.ad.FiveAdLoadListener fiveAdLoadListener = (com.five_corp.ad.FiveAdLoadListener) d.b.get();
        if (fiveAdLoadListener != null) {
            fiveAdLoadListener.onFiveAdLoadError(d.f1782a, fiveAdErrorCode);
        }
        android.util.Log.e(o, "Invalid state, loadAdAsync is ignored.");
    }

    @Override // com.five_corp.ad.c
    public void onAdControllerClose() {
        synchronized (this.i) {
            this.k = null;
            this.j = com.five_corp.ad.FiveAdState.CLOSED;
        }
    }

    @Override // com.five_corp.ad.c
    public void onAdControllerError() {
        synchronized (this.i) {
            this.j = com.five_corp.ad.FiveAdState.ERROR;
        }
    }

    @Override // com.five_corp.ad.internal.adselector.c
    public void onAdSuccessfullySelected(com.five_corp.ad.internal.context.l lVar) {
        com.five_corp.ad.internal.C c;
        synchronized (this.i) {
            c = this.l;
            this.l = null;
        }
        com.five_corp.ad.f fVar = new com.five_corp.ad.f(this.b, this.c, this.g, this.e, this.f, lVar, this);
        synchronized (this.i) {
            this.k = fVar;
            this.j = com.five_corp.ad.FiveAdState.LOADED;
        }
        if (c != null) {
            c.b(lVar);
        } else {
            this.h.a(4, "notifyLoad failed @ FiveAdInterstitial.onAdSuccessfullySelected");
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.n = true;
    }

    @Override // com.five_corp.ad.internal.adselector.c
    public void onFailureToSelectAd(com.five_corp.ad.internal.s sVar) {
        com.five_corp.ad.internal.C c;
        synchronized (this.i) {
            c = this.l;
            this.l = null;
            this.j = com.five_corp.ad.FiveAdState.ERROR;
        }
        if (c != null) {
            c.b(this.d, com.five_corp.ad.internal.context.h.CUSTOM_LAYOUT, sVar);
        } else {
            this.h.a(4, "notifyLoadError failed @ FiveAdInterstitial.onFailureToSelectAd");
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        try {
            int i3 = this.m;
            int i4 = 0;
            if (i3 <= 0) {
                if (android.view.View.MeasureSpec.getMode(i) == 0) {
                    int size = android.view.View.MeasureSpec.getSize(i2);
                    com.five_corp.ad.internal.ad.custom_layout.d customLayoutConfig = getCustomLayoutConfig();
                    if (getState() == com.five_corp.ad.FiveAdState.LOADED && customLayoutConfig != null) {
                        i4 = (size * customLayoutConfig.f1800a) / customLayoutConfig.b;
                    }
                    i = android.view.View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
                } else if (android.view.View.MeasureSpec.getMode(i2) == 0) {
                    int size2 = android.view.View.MeasureSpec.getSize(i);
                    com.five_corp.ad.internal.ad.custom_layout.d customLayoutConfig2 = getCustomLayoutConfig();
                    if (getState() == com.five_corp.ad.FiveAdState.LOADED && customLayoutConfig2 != null) {
                        i4 = (size2 * customLayoutConfig2.b) / customLayoutConfig2.f1800a;
                    }
                }
                a(android.view.View.MeasureSpec.getSize(i), android.view.View.MeasureSpec.getSize(i2));
                super.onMeasure(i, i2);
            }
            i = android.view.View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
            int i5 = this.m;
            com.five_corp.ad.internal.ad.custom_layout.d customLayoutConfig3 = getCustomLayoutConfig();
            if (getState() == com.five_corp.ad.FiveAdState.LOADED && customLayoutConfig3 != null) {
                i4 = (i5 * customLayoutConfig3.b) / customLayoutConfig3.f1800a;
            }
            i2 = android.view.View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
            a(android.view.View.MeasureSpec.getSize(i), android.view.View.MeasureSpec.getSize(i2));
        } catch (java.lang.Throwable th) {
            this.h.a(th);
        }
        super.onMeasure(i, i2);
    }

    public void registerFriendlyObstructionView(android.view.View view) {
        com.five_corp.ad.f adController = getAdController();
        if (adController == null) {
            android.util.Log.e(o, "You can call `registerFriendlyObstructionView` after ad is loaded.");
            return;
        }
        com.five_corp.ad.internal.context.l lVar = adController.l;
        if (lVar.f == com.five_corp.ad.internal.context.h.NATIVE || lVar.d.c.g) {
            adController.i.a(view, 4);
        } else {
            android.util.Log.e("com.five_corp.ad.f", "`registerFriendlyObstructionView` is not allowed.");
        }
    }

    public void setEventListener(com.five_corp.ad.FiveAdCustomLayoutEventListener fiveAdCustomLayoutEventListener) {
        com.five_corp.ad.internal.D d = this.e;
        d.d.set(new com.five_corp.ad.internal.C1436d(fiveAdCustomLayoutEventListener, this));
        com.five_corp.ad.internal.D d2 = this.e;
        d2.f.set(com.five_corp.ad.internal.q.a(fiveAdCustomLayoutEventListener, this));
    }

    @Override // com.five_corp.ad.FiveAdInterface
    public void setFiveAdTag(java.lang.String str) {
        this.f1764a = str;
    }

    @Override // com.five_corp.ad.FiveAdInterface
    public void setLoadListener(com.five_corp.ad.FiveAdLoadListener fiveAdLoadListener) {
        this.e.b.set(fiveAdLoadListener);
    }

    @Override // com.five_corp.ad.FiveAdInterface
    @java.lang.Deprecated
    public void setViewEventListener(com.five_corp.ad.FiveAdViewEventListener fiveAdViewEventListener) {
        this.e.c.set(fiveAdViewEventListener);
    }

    public FiveAdCustomLayout(android.content.Context context, com.five_corp.ad.j jVar, com.five_corp.ad.internal.context.l lVar, int i) {
        super(context);
        this.f1764a = null;
        this.i = new java.lang.Object();
        this.n = false;
        this.c = jVar;
        this.b = context;
        this.d = lVar.d.f1896a;
        com.five_corp.ad.internal.D d = new com.five_corp.ad.internal.D(this);
        this.e = d;
        com.five_corp.ad.internal.soundstate.c cVar = new com.five_corp.ad.internal.soundstate.c(jVar.a());
        this.f = cVar;
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(context);
        this.g = frameLayout;
        this.h = jVar.f2119a;
        this.j = com.five_corp.ad.FiveAdState.LOADED;
        this.l = null;
        this.k = new com.five_corp.ad.f(context, jVar, frameLayout, d, cVar, lVar, this);
        this.m = i;
        addView(frameLayout);
    }

    public FiveAdCustomLayout(android.content.Context context, java.lang.String str) {
        this(context, str, 0);
    }

    public FiveAdCustomLayout(android.content.Context context, java.lang.String str, int i) {
        super(context);
        this.f1764a = null;
        this.i = new java.lang.Object();
        this.n = false;
        com.five_corp.ad.j jVar = com.five_corp.ad.k.a().f2120a;
        this.c = jVar;
        this.b = context;
        this.d = jVar.k.a(str);
        com.five_corp.ad.internal.D d = new com.five_corp.ad.internal.D(this);
        this.e = d;
        com.five_corp.ad.internal.soundstate.c cVar = new com.five_corp.ad.internal.soundstate.c(jVar.a());
        this.f = cVar;
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(context);
        this.g = frameLayout;
        this.h = jVar.f2119a;
        this.j = com.five_corp.ad.FiveAdState.NOT_LOADED;
        this.l = new com.five_corp.ad.internal.C(d, jVar.q, cVar);
        this.k = null;
        this.m = i;
        addView(frameLayout);
    }
}
