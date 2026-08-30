package com.five_corp.ad;

/* JADX INFO: loaded from: classes4.dex */
public class FiveAdVideoReward implements com.five_corp.ad.FiveAdInterface, com.five_corp.ad.internal.adselector.c, com.five_corp.ad.c {
    public static final java.lang.String l = com.five_corp.ad.FiveAdVideoReward.class.toString();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.content.Context f1770a;
    public final com.five_corp.ad.j b;
    public final com.five_corp.ad.internal.context.i c;
    public final com.five_corp.ad.internal.D d;
    public final com.five_corp.ad.internal.soundstate.c e;
    public final com.five_corp.ad.internal.logger.a f;
    public final java.lang.Object g;
    public com.five_corp.ad.FiveAdState h;
    public com.five_corp.ad.f i;
    public com.five_corp.ad.internal.C j;
    public java.lang.String k;

    public FiveAdVideoReward(android.app.Activity activity, java.lang.String str) {
        this(activity.getApplicationContext(), str);
    }

    @Override // com.five_corp.ad.FiveAdInterface
    public void enableSound(boolean z) {
        this.e.a(z);
    }

    @Override // com.five_corp.ad.FiveAdInterface
    public com.five_corp.ad.CreativeType getCreativeType() {
        com.five_corp.ad.f fVar;
        synchronized (this.g) {
            fVar = this.i;
        }
        return fVar != null ? fVar.l.b.b : com.five_corp.ad.CreativeType.NOT_LOADED;
    }

    @Override // com.five_corp.ad.FiveAdInterface
    public java.lang.String getFiveAdTag() {
        return this.k;
    }

    @Override // com.five_corp.ad.FiveAdInterface
    public java.lang.String getSlotId() {
        return this.c.c;
    }

    @Override // com.five_corp.ad.FiveAdInterface
    @java.lang.Deprecated
    public com.five_corp.ad.FiveAdState getState() {
        com.five_corp.ad.FiveAdState fiveAdState;
        synchronized (this.g) {
            fiveAdState = this.h;
        }
        return fiveAdState;
    }

    @Override // com.five_corp.ad.FiveAdInterface
    public boolean isSoundEnabled() {
        return this.e.a().a();
    }

    public void loadAdAsync() {
        boolean z;
        synchronized (this.g) {
            if (this.h != com.five_corp.ad.FiveAdState.NOT_LOADED || this.j == null) {
                z = false;
            } else {
                this.h = com.five_corp.ad.FiveAdState.LOADING;
                z = true;
            }
        }
        if (z) {
            this.b.l.a(this.c, com.five_corp.ad.internal.context.h.VIDEO_REWARD, this.e.a(), this);
            return;
        }
        com.five_corp.ad.internal.D d = this.d;
        com.five_corp.ad.FiveAdErrorCode fiveAdErrorCode = com.five_corp.ad.FiveAdErrorCode.INVALID_STATE;
        com.five_corp.ad.FiveAdLoadListener fiveAdLoadListener = (com.five_corp.ad.FiveAdLoadListener) d.b.get();
        if (fiveAdLoadListener != null) {
            fiveAdLoadListener.onFiveAdLoadError(d.f1782a, fiveAdErrorCode);
        }
        android.util.Log.e(l, "Invalid state, loadAdAsync is ignored.");
    }

    @Override // com.five_corp.ad.c
    public void onAdControllerClose() {
        synchronized (this.g) {
            this.i = null;
            this.h = com.five_corp.ad.FiveAdState.CLOSED;
        }
    }

    @Override // com.five_corp.ad.c
    public void onAdControllerError() {
        synchronized (this.g) {
            this.i = null;
            this.h = com.five_corp.ad.FiveAdState.ERROR;
        }
    }

    @Override // com.five_corp.ad.internal.adselector.c
    public void onAdSuccessfullySelected(com.five_corp.ad.internal.context.l lVar) {
        com.five_corp.ad.internal.C c;
        synchronized (this.g) {
            c = this.j;
            this.j = null;
        }
        com.five_corp.ad.f fVar = new com.five_corp.ad.f(this.f1770a, this.b, null, this.d, this.e, lVar, this);
        synchronized (this.g) {
            this.i = fVar;
            this.h = com.five_corp.ad.FiveAdState.LOADED;
        }
        if (c != null) {
            c.b(lVar);
        } else {
            this.f.a(4, "notifyLoad failed @ FiveAdVideoReward.onAdSuccessfullySelected");
        }
    }

    @Override // com.five_corp.ad.internal.adselector.c
    public void onFailureToSelectAd(com.five_corp.ad.internal.s sVar) {
        com.five_corp.ad.internal.C c;
        synchronized (this.g) {
            c = this.j;
            this.j = null;
            this.h = com.five_corp.ad.FiveAdState.ERROR;
        }
        if (c != null) {
            c.b(this.c, com.five_corp.ad.internal.context.h.VIDEO_REWARD, sVar);
        } else {
            this.f.a(4, "notifyLoadError failed @ FiveAdVideoReward.onFailureToSelectAd");
        }
    }

    public void setEventListener(com.five_corp.ad.FiveAdVideoRewardEventListener fiveAdVideoRewardEventListener) {
        com.five_corp.ad.internal.D d = this.d;
        d.d.set(new com.five_corp.ad.internal.C1438f(this, fiveAdVideoRewardEventListener));
        com.five_corp.ad.internal.D d2 = this.d;
        d2.e.set(new com.five_corp.ad.internal.y(this, fiveAdVideoRewardEventListener));
    }

    @Override // com.five_corp.ad.FiveAdInterface
    public void setFiveAdTag(java.lang.String str) {
        this.k = str;
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

    @java.lang.Deprecated
    public boolean show() {
        com.five_corp.ad.f fVar;
        synchronized (this.g) {
            fVar = this.i;
        }
        if (fVar != null) {
            return fVar.q();
        }
        com.five_corp.ad.internal.D d = this.d;
        com.five_corp.ad.FiveAdErrorCode fiveAdErrorCode = com.five_corp.ad.FiveAdErrorCode.INVALID_STATE;
        com.five_corp.ad.FiveAdViewEventListener fiveAdViewEventListener = (com.five_corp.ad.FiveAdViewEventListener) d.c.get();
        if (fiveAdViewEventListener != null) {
            fiveAdViewEventListener.onFiveAdViewError(d.f1782a, fiveAdErrorCode);
        }
        com.five_corp.ad.internal.InterfaceC1440h interfaceC1440h = (com.five_corp.ad.internal.InterfaceC1440h) d.d.get();
        if (interfaceC1440h != null) {
            interfaceC1440h.a(fiveAdErrorCode);
        }
        android.util.Log.e(l, "Invalid state, showAd is ignored.");
        return false;
    }

    public void showAd() {
        com.five_corp.ad.f fVar;
        synchronized (this.g) {
            fVar = this.i;
        }
        if (fVar != null) {
            fVar.q();
            return;
        }
        com.five_corp.ad.internal.D d = this.d;
        com.five_corp.ad.FiveAdErrorCode fiveAdErrorCode = com.five_corp.ad.FiveAdErrorCode.INVALID_STATE;
        com.five_corp.ad.FiveAdViewEventListener fiveAdViewEventListener = (com.five_corp.ad.FiveAdViewEventListener) d.c.get();
        if (fiveAdViewEventListener != null) {
            fiveAdViewEventListener.onFiveAdViewError(d.f1782a, fiveAdErrorCode);
        }
        com.five_corp.ad.internal.InterfaceC1440h interfaceC1440h = (com.five_corp.ad.internal.InterfaceC1440h) d.d.get();
        if (interfaceC1440h != null) {
            interfaceC1440h.a(fiveAdErrorCode);
        }
        android.util.Log.e(l, "Invalid state, showAd is ignored.");
    }

    public FiveAdVideoReward(android.content.Context context, com.five_corp.ad.j jVar, com.five_corp.ad.internal.context.l lVar) {
        this.g = new java.lang.Object();
        this.b = jVar;
        this.f1770a = context;
        this.c = lVar.d.f1896a;
        com.five_corp.ad.internal.D d = new com.five_corp.ad.internal.D(this);
        this.d = d;
        com.five_corp.ad.internal.soundstate.c cVar = new com.five_corp.ad.internal.soundstate.c(jVar.a());
        this.e = cVar;
        this.f = jVar.f2119a;
        this.h = com.five_corp.ad.FiveAdState.LOADED;
        this.j = null;
        this.i = new com.five_corp.ad.f(context, jVar, null, d, cVar, lVar, this);
    }

    public FiveAdVideoReward(android.content.Context context, java.lang.String str) {
        this.g = new java.lang.Object();
        com.five_corp.ad.j jVar = com.five_corp.ad.k.a().f2120a;
        this.b = jVar;
        this.f1770a = context;
        this.c = jVar.k.a(str);
        com.five_corp.ad.internal.D d = new com.five_corp.ad.internal.D(this);
        this.d = d;
        com.five_corp.ad.internal.soundstate.c cVar = new com.five_corp.ad.internal.soundstate.c(jVar.a());
        this.e = cVar;
        this.f = jVar.f2119a;
        this.h = com.five_corp.ad.FiveAdState.NOT_LOADED;
        this.j = new com.five_corp.ad.internal.C(d, jVar.q, cVar);
        this.i = null;
    }

    @java.lang.Deprecated
    public boolean show(android.app.Activity activity) {
        com.five_corp.ad.f fVar;
        synchronized (this.g) {
            fVar = this.i;
        }
        if (fVar != null) {
            return fVar.q();
        }
        com.five_corp.ad.internal.D d = this.d;
        com.five_corp.ad.FiveAdErrorCode fiveAdErrorCode = com.five_corp.ad.FiveAdErrorCode.INVALID_STATE;
        com.five_corp.ad.FiveAdViewEventListener fiveAdViewEventListener = (com.five_corp.ad.FiveAdViewEventListener) d.c.get();
        if (fiveAdViewEventListener != null) {
            fiveAdViewEventListener.onFiveAdViewError(d.f1782a, fiveAdErrorCode);
        }
        com.five_corp.ad.internal.InterfaceC1440h interfaceC1440h = (com.five_corp.ad.internal.InterfaceC1440h) d.d.get();
        if (interfaceC1440h != null) {
            interfaceC1440h.a(fiveAdErrorCode);
        }
        android.util.Log.e(l, "Invalid state, showAd is ignored.");
        return false;
    }
}
