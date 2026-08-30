package com.five_corp.ad;

/* JADX INFO: loaded from: classes4.dex */
public class FiveAdNative implements com.five_corp.ad.FiveAdInterface, com.five_corp.ad.internal.adselector.c, com.five_corp.ad.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.content.Context f1768a;
    public final com.five_corp.ad.j b;
    public final com.five_corp.ad.internal.context.i c;
    public final com.five_corp.ad.internal.D d;
    public final com.five_corp.ad.internal.soundstate.c e;
    public final android.widget.FrameLayout f;
    public final com.five_corp.ad.internal.logger.a g;
    public final java.lang.Object h;
    public com.five_corp.ad.FiveAdState i;
    public com.five_corp.ad.f j;
    public com.five_corp.ad.internal.C k;
    public final com.five_corp.ad.NativeMainView l;
    public final android.os.Handler m;
    public java.lang.String n;

    public interface LoadImageCallback {
        void onImageLoad(android.graphics.Bitmap bitmap);
    }

    public FiveAdNative(android.content.Context context, com.five_corp.ad.j jVar, com.five_corp.ad.internal.context.l lVar, int i) {
        int i2;
        int i3;
        this.h = new java.lang.Object();
        this.f1768a = context;
        this.b = jVar;
        this.c = lVar.d.f1896a;
        com.five_corp.ad.internal.D d = new com.five_corp.ad.internal.D(this);
        this.d = d;
        com.five_corp.ad.internal.soundstate.c cVar = new com.five_corp.ad.internal.soundstate.c(jVar.a());
        this.e = cVar;
        this.g = jVar.f2119a;
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(context);
        this.f = frameLayout;
        this.i = com.five_corp.ad.FiveAdState.LOADED;
        this.k = null;
        this.j = new com.five_corp.ad.f(context, jVar, frameLayout, d, cVar, lVar, this);
        com.five_corp.ad.NativeMainView nativeMainView = new com.five_corp.ad.NativeMainView(context, frameLayout, jVar.f2119a, i);
        this.l = nativeMainView;
        com.five_corp.ad.internal.ad.custom_layout.d dVar = lVar.e.b;
        if (dVar != null && (i2 = dVar.f1800a) > 0 && (i3 = dVar.b) > 0) {
            nativeMainView.setConfigHeightToWidthRatio(((double) i3) / ((double) i2));
        }
        this.m = new android.os.Handler(android.os.Looper.getMainLooper());
    }

    public static /* synthetic */ void c(com.five_corp.ad.FiveAdNative.LoadImageCallback loadImageCallback) {
        android.util.Log.e("com.five_corp.ad.FiveAdNative", "You can use `loadInformationIconImageAsync` after ad is loaded.");
        loadImageCallback.onImageLoad(null);
    }

    public final com.five_corp.ad.f a() {
        com.five_corp.ad.f fVar;
        synchronized (this.h) {
            fVar = this.j;
        }
        return fVar;
    }

    public final com.five_corp.ad.internal.context.l b() {
        com.five_corp.ad.f fVarA = a();
        if (fVarA != null) {
            return fVarA.l;
        }
        return null;
    }

    @Override // com.five_corp.ad.FiveAdInterface
    public void enableSound(boolean z) {
        this.e.a(z);
    }

    public android.view.View getAdMainView() {
        return this.l;
    }

    public java.lang.String getAdTitle() {
        java.lang.String str;
        com.five_corp.ad.internal.context.l lVarB = b();
        return (lVarB == null || (str = lVarB.b.u) == null) ? "" : str;
    }

    public java.lang.String getAdvertiserName() {
        java.lang.String str;
        com.five_corp.ad.internal.context.l lVarB = b();
        return (lVarB == null || (str = lVarB.b.t) == null) ? "" : str;
    }

    public java.lang.String getButtonText() {
        java.lang.String str;
        com.five_corp.ad.internal.context.l lVarB = b();
        return (lVarB == null || (str = lVarB.b.v) == null) ? "" : str;
    }

    public int getContentViewLogicalHeight() {
        return this.l.getLogicalHeight();
    }

    public int getContentViewLogicalWidth() {
        return this.l.getLogicalWidth();
    }

    @Override // com.five_corp.ad.FiveAdInterface
    public com.five_corp.ad.CreativeType getCreativeType() {
        com.five_corp.ad.f fVarA = a();
        return fVarA != null ? fVarA.l.b.b : com.five_corp.ad.CreativeType.NOT_LOADED;
    }

    public java.lang.String getDescriptionText() {
        java.lang.String str;
        com.five_corp.ad.internal.context.l lVarB = b();
        return (lVarB == null || (str = lVarB.b.w) == null) ? "" : str;
    }

    @Override // com.five_corp.ad.FiveAdInterface
    public java.lang.String getFiveAdTag() {
        return this.n;
    }

    public java.lang.String getLongDescriptionText() {
        java.lang.String str;
        com.five_corp.ad.internal.context.l lVarB = b();
        return (lVarB == null || (str = lVarB.b.x) == null) ? "" : str;
    }

    @Override // com.five_corp.ad.FiveAdInterface
    public java.lang.String getSlotId() {
        return this.c.c;
    }

    @Override // com.five_corp.ad.FiveAdInterface
    @java.lang.Deprecated
    public com.five_corp.ad.FiveAdState getState() {
        com.five_corp.ad.FiveAdState fiveAdState;
        synchronized (this.h) {
            fiveAdState = this.i;
        }
        return fiveAdState;
    }

    @Override // com.five_corp.ad.FiveAdInterface
    public boolean isSoundEnabled() {
        return this.e.a().a();
    }

    public void loadAdAsync() {
        boolean z;
        synchronized (this.h) {
            if (this.i != com.five_corp.ad.FiveAdState.NOT_LOADED || this.k == null) {
                z = false;
            } else {
                this.i = com.five_corp.ad.FiveAdState.LOADING;
                z = true;
            }
        }
        if (z) {
            this.b.l.a(this.c, com.five_corp.ad.internal.context.h.NATIVE, this.e.a(), this);
            return;
        }
        com.five_corp.ad.internal.D d = this.d;
        com.five_corp.ad.FiveAdErrorCode fiveAdErrorCode = com.five_corp.ad.FiveAdErrorCode.INVALID_STATE;
        com.five_corp.ad.FiveAdLoadListener fiveAdLoadListener = (com.five_corp.ad.FiveAdLoadListener) d.b.get();
        if (fiveAdLoadListener != null) {
            fiveAdLoadListener.onFiveAdLoadError(d.f1782a, fiveAdErrorCode);
        }
        android.util.Log.e("com.five_corp.ad.FiveAdNative", "Invalid state, loadAdAsync is ignored.");
    }

    public void loadIconImageAsync(final com.five_corp.ad.FiveAdNative.LoadImageCallback loadImageCallback) {
        com.five_corp.ad.internal.context.l lVarB = b();
        if (lVarB == null) {
            this.m.post(new java.lang.Runnable() { // from class: com.five_corp.ad.FiveAdNative$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    com.five_corp.ad.FiveAdNative.a(loadImageCallback);
                }
            });
            return;
        }
        com.five_corp.ad.internal.ad.w wVar = lVarB.b.q;
        if (wVar == null) {
            this.m.post(new java.lang.Runnable() { // from class: com.five_corp.ad.FiveAdNative$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    loadImageCallback.onImageLoad(null);
                }
            });
        } else {
            lVarB.h.a(wVar, new com.five_corp.ad.l(loadImageCallback));
        }
    }

    public void loadInformationIconImageAsync(final com.five_corp.ad.FiveAdNative.LoadImageCallback loadImageCallback) {
        com.five_corp.ad.internal.context.l lVarB = b();
        if (lVarB == null) {
            this.m.post(new java.lang.Runnable() { // from class: com.five_corp.ad.FiveAdNative$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    com.five_corp.ad.FiveAdNative.c(loadImageCallback);
                }
            });
            return;
        }
        com.five_corp.ad.internal.ad.w wVar = lVarB.b.r;
        if (wVar == null) {
            this.m.post(new java.lang.Runnable() { // from class: com.five_corp.ad.FiveAdNative$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    loadImageCallback.onImageLoad(null);
                }
            });
        } else {
            lVarB.h.a(wVar, new com.five_corp.ad.m(loadImageCallback));
        }
    }

    @Override // com.five_corp.ad.c
    public void onAdControllerClose() {
        synchronized (this.h) {
            this.j = null;
            this.i = com.five_corp.ad.FiveAdState.CLOSED;
        }
    }

    @Override // com.five_corp.ad.c
    public void onAdControllerError() {
        synchronized (this.h) {
            this.i = com.five_corp.ad.FiveAdState.ERROR;
        }
    }

    @Override // com.five_corp.ad.internal.adselector.c
    public void onAdSuccessfullySelected(com.five_corp.ad.internal.context.l lVar) {
        com.five_corp.ad.internal.C c;
        synchronized (this.h) {
            c = this.k;
            this.k = null;
        }
        com.five_corp.ad.internal.ad.custom_layout.d dVar = lVar.e.b;
        if (dVar == null || dVar.f1800a == 0 || dVar.b == 0) {
            synchronized (this.h) {
                this.i = com.five_corp.ad.FiveAdState.ERROR;
            }
            if (c != null) {
                c.b(this.c, com.five_corp.ad.internal.context.h.NATIVE, new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.I4, null, null, null));
                return;
            } else {
                this.g.a(4, "notifyLoadError failed @ FiveAdInterstitial.onAdSuccessfullySelected");
                return;
            }
        }
        com.five_corp.ad.f fVar = new com.five_corp.ad.f(this.f1768a, this.b, this.f, this.d, this.e, lVar, this);
        synchronized (this.h) {
            this.j = fVar;
            this.i = com.five_corp.ad.FiveAdState.LOADED;
        }
        this.l.setConfigHeightToWidthRatio(((double) dVar.b) / ((double) dVar.f1800a));
        if (c != null) {
            c.b(lVar);
        } else {
            this.g.a(4, "notifyLoad failed @ FiveAdInterstitial.onAdSuccessfullySelected");
        }
    }

    @Override // com.five_corp.ad.internal.adselector.c
    public void onFailureToSelectAd(com.five_corp.ad.internal.s sVar) {
        com.five_corp.ad.internal.C c;
        synchronized (this.h) {
            c = this.k;
            this.k = null;
            this.i = com.five_corp.ad.FiveAdState.ERROR;
        }
        if (c != null) {
            c.b(this.c, com.five_corp.ad.internal.context.h.NATIVE, sVar);
        } else {
            this.g.a(4, "notifyLoadError failed @ FiveAdInterstitial.onFailureToSelectAd");
        }
    }

    public void registerFriendlyObstructionView(android.view.View view) {
        com.five_corp.ad.f fVarA = a();
        if (fVarA == null) {
            android.util.Log.e("com.five_corp.ad.FiveAdNative", "You can call `registerFriendlyObstructionView` after ad is loaded.");
            return;
        }
        com.five_corp.ad.internal.context.l lVar = fVarA.l;
        if (lVar.f == com.five_corp.ad.internal.context.h.NATIVE || lVar.d.c.g) {
            fVarA.i.a(view, 4);
        } else {
            android.util.Log.e("com.five_corp.ad.f", "`registerFriendlyObstructionView` is not allowed.");
        }
    }

    public void registerViews(android.view.View view, android.view.View view2, java.util.List<android.view.View> list) {
        com.five_corp.ad.f fVarA = a();
        if (fVarA == null) {
            android.util.Log.e("com.five_corp.ad.FiveAdNative", "You can call `registerViews` after ad is loaded.");
            return;
        }
        fVarA.i.f = view;
        if (view2 != null) {
            view2.setOnClickListener(new com.five_corp.ad.n(fVarA));
        }
        java.util.Iterator<android.view.View> it = list.iterator();
        while (it.hasNext()) {
            it.next().setOnClickListener(new com.five_corp.ad.o(fVarA));
        }
    }

    public void setEventListener(com.five_corp.ad.FiveAdNativeEventListener fiveAdNativeEventListener) {
        com.five_corp.ad.internal.D d = this.d;
        d.d.set(new com.five_corp.ad.internal.C1439g(fiveAdNativeEventListener, this));
        com.five_corp.ad.internal.D d2 = this.d;
        d2.f.set(com.five_corp.ad.internal.q.a(fiveAdNativeEventListener, this));
    }

    @Override // com.five_corp.ad.FiveAdInterface
    public void setFiveAdTag(java.lang.String str) {
        this.n = str;
    }

    @Override // com.five_corp.ad.FiveAdInterface
    public void setLoadListener(com.five_corp.ad.FiveAdLoadListener fiveAdLoadListener) {
        this.d.b.set(fiveAdLoadListener);
    }

    @Override // com.five_corp.ad.FiveAdInterface
    @java.lang.Deprecated
    public void setViewEventListener(com.five_corp.ad.FiveAdViewEventListener fiveAdViewEventListener) {
        this.d.c.set(fiveAdViewEventListener);
    }

    public FiveAdNative(android.content.Context context, java.lang.String str) {
        this(context, str, 0);
    }

    public static /* synthetic */ void a(com.five_corp.ad.FiveAdNative.LoadImageCallback loadImageCallback) {
        android.util.Log.e("com.five_corp.ad.FiveAdNative", "You can use `loadIconImageAsync` after ad is loaded.");
        loadImageCallback.onImageLoad(null);
    }

    public FiveAdNative(android.content.Context context, java.lang.String str, int i) {
        this.h = new java.lang.Object();
        this.f1768a = context;
        com.five_corp.ad.j jVar = com.five_corp.ad.k.a().f2120a;
        this.b = jVar;
        this.c = jVar.k.a(str);
        com.five_corp.ad.internal.D d = new com.five_corp.ad.internal.D(this);
        this.d = d;
        com.five_corp.ad.internal.soundstate.c cVar = new com.five_corp.ad.internal.soundstate.c(jVar.a());
        this.e = cVar;
        this.g = jVar.f2119a;
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(context);
        this.f = frameLayout;
        this.i = com.five_corp.ad.FiveAdState.NOT_LOADED;
        this.k = new com.five_corp.ad.internal.C(d, jVar.q, cVar);
        this.j = null;
        this.l = new com.five_corp.ad.NativeMainView(context, frameLayout, jVar.f2119a, i);
        this.m = new android.os.Handler(android.os.Looper.getMainLooper());
    }
}
