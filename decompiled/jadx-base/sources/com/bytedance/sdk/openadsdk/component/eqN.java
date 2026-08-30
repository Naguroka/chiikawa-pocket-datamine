package com.bytedance.sdk.openadsdk.component;

/* JADX INFO: loaded from: classes4.dex */
public class eqN extends com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAd {
    private final com.bytedance.sdk.openadsdk.core.model.tuV IL;
    private boolean Kg;
    private boolean WR;
    private final com.bytedance.sdk.openadsdk.AdSlot bX;
    private final android.content.Context bg;
    private com.bytedance.sdk.openadsdk.bg.eqN.IL eqN;
    private final boolean iR;
    private final java.util.concurrent.atomic.AtomicBoolean zx = new java.util.concurrent.atomic.AtomicBoolean(false);
    private final java.lang.String ldr = com.bytedance.sdk.openadsdk.utils.rri.bg();

    public eqN(android.content.Context context, com.bytedance.sdk.openadsdk.core.model.tuV tuv, boolean z, com.bytedance.sdk.openadsdk.AdSlot adSlot) {
        this.bg = context;
        this.IL = tuv;
        this.iR = z;
        this.bX = adSlot;
    }

    @Override // com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAd
    public void setAdInteractionListener(com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdInteractionListener pAGAppOpenAdInteractionListener) {
        this.eqN = new com.bytedance.sdk.openadsdk.component.zx(pAGAppOpenAdInteractionListener);
        bg();
    }

    @Override // com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAd
    public void setAdInteractionCallback(com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdInteractionCallback pAGAppOpenAdInteractionCallback) {
        this.eqN = new com.bytedance.sdk.openadsdk.component.zx(pAGAppOpenAdInteractionCallback);
        bg();
    }

    private void bg() {
        if (com.bytedance.sdk.openadsdk.multipro.IL.bX()) {
            com.bytedance.sdk.openadsdk.utils.VJ.bX(new com.bytedance.sdk.component.Kg.Kg("AppOpenAd_registerMultiProcessListener") { // from class: com.bytedance.sdk.openadsdk.component.eqN.1
                @Override // java.lang.Runnable
                public void run() {
                    com.bytedance.sdk.openadsdk.IListenerManager iListenerManagerAsInterface;
                    com.bytedance.sdk.openadsdk.multipro.aidl.bg bgVarBg = com.bytedance.sdk.openadsdk.multipro.aidl.bg.bg();
                    if (com.bytedance.sdk.openadsdk.component.eqN.this.eqN == null || (iListenerManagerAsInterface = com.bytedance.sdk.openadsdk.multipro.aidl.bg.IL.asInterface(bgVarBg.bg(7))) == null) {
                        return;
                    }
                    try {
                        iListenerManagerAsInterface.registerAppOpenAdListener(com.bytedance.sdk.openadsdk.component.eqN.this.ldr, new com.bytedance.sdk.openadsdk.multipro.aidl.IL.bg(com.bytedance.sdk.openadsdk.component.eqN.this.eqN));
                        com.bytedance.sdk.openadsdk.component.eqN.this.eqN = null;
                    } catch (android.os.RemoteException e) {
                        com.bytedance.sdk.component.utils.PX.bg("TTAppOpenAdImpl", e.getMessage());
                    }
                }
            }, 5);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAd
    public void show(android.app.Activity activity) {
        int rotation;
        if (activity != null && activity.isFinishing()) {
            activity = null;
        }
        if (this.zx.getAndSet(true)) {
            return;
        }
        if (android.os.Looper.getMainLooper() != android.os.Looper.myLooper()) {
            com.bytedance.sdk.component.utils.PX.bg("TTAppOpenAdImpl", "showTTAppOpenAd error: not main looper");
            throw new java.lang.IllegalStateException("Cannot be called in a child thread ---- TTAppOpenAdImpl.showAppOpenAd");
        }
        com.bytedance.sdk.openadsdk.oem.IPMiBroadcastReceiver.bg(this.bg, this.IL);
        android.content.Context contextBg = activity != null ? activity : this.bg;
        if (contextBg == null) {
            contextBg = com.bytedance.sdk.openadsdk.core.VzQ.bg();
        }
        try {
            rotation = activity.getWindowManager().getDefaultDisplay().getRotation();
        } catch (java.lang.Exception unused) {
            rotation = 0;
        }
        android.content.Intent intent = new android.content.Intent(contextBg, (java.lang.Class<?>) com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.class);
        intent.putExtra("orientation_angle", rotation);
        intent.putExtra(com.google.firebase.analytics.FirebaseAnalytics.Param.AD_SOURCE, this.iR ? 1 : 2);
        if (com.bytedance.sdk.openadsdk.multipro.IL.bX()) {
            intent.putExtra(com.bytedance.sdk.openadsdk.TTAdConstant.MULTI_PROCESS_MATERIALMETA, this.IL.ZTq().toString());
            intent.putExtra(com.bytedance.sdk.openadsdk.TTAdConstant.MULTI_PROCESS_META_MD5, this.ldr);
        } else {
            com.bytedance.sdk.openadsdk.core.JAA.bg().ldr();
            com.bytedance.sdk.openadsdk.core.JAA.bg().bg(this.IL);
            com.bytedance.sdk.openadsdk.core.JAA.bg().bg(this.eqN);
            this.eqN = null;
        }
        intent.putExtra("start_show_time", android.os.SystemClock.elapsedRealtime());
        com.bytedance.sdk.component.utils.IL.bg(contextBg, intent, new com.bytedance.sdk.component.utils.IL.InterfaceC0117IL() { // from class: com.bytedance.sdk.openadsdk.component.eqN.2
            @Override // com.bytedance.sdk.component.utils.IL.InterfaceC0117IL
            public void bg() {
            }

            @Override // com.bytedance.sdk.component.utils.IL.InterfaceC0117IL
            public void bg(java.lang.Throwable th) {
            }
        });
        com.bytedance.sdk.openadsdk.core.yDt.IL().post(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.component.eqN.3
            @Override // java.lang.Runnable
            public void run() {
                if (com.bytedance.sdk.openadsdk.component.eqN.this.bX != null) {
                    try {
                        if (com.bytedance.sdk.openadsdk.core.settings.xxp.zU().JAA(com.bytedance.sdk.openadsdk.component.eqN.this.bX.getCodeId()) != 1 || com.bytedance.sdk.openadsdk.core.model.tuV.ldr(com.bytedance.sdk.openadsdk.component.eqN.this.IL)) {
                            return;
                        }
                        com.bytedance.sdk.openadsdk.component.ldr ldrVarBg = com.bytedance.sdk.openadsdk.component.ldr.bg(com.bytedance.sdk.openadsdk.component.eqN.this.bg);
                        ldrVarBg.iR(java.lang.Integer.parseInt(com.bytedance.sdk.openadsdk.component.eqN.this.bX.getCodeId()));
                        ldrVarBg.bg(com.bytedance.sdk.openadsdk.component.eqN.this.bX);
                    } catch (java.lang.Throwable unused2) {
                    }
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void win(java.lang.Double d) {
        if (this.Kg) {
            return;
        }
        com.bytedance.sdk.openadsdk.utils.DDQ.bg(this.IL, d);
        this.Kg = true;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void loss(java.lang.Double d, java.lang.String str, java.lang.String str2) {
        if (this.WR) {
            return;
        }
        com.bytedance.sdk.openadsdk.utils.DDQ.bg(this.IL, d, str, str2);
        this.WR = true;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PangleAd
    public java.util.Map<java.lang.String, java.lang.Object> getMediaExtraInfo() {
        com.bytedance.sdk.openadsdk.core.model.tuV tuv = this.IL;
        if (tuv != null) {
            return tuv.jA();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PangleAd
    public java.lang.Object getExtraInfo(java.lang.String str) {
        com.bytedance.sdk.openadsdk.core.model.tuV tuv = this.IL;
        if (tuv == null || tuv.jA() == null) {
            return null;
        }
        try {
            return this.IL.jA().get(str);
        } catch (java.lang.Throwable th) {
            com.bytedance.sdk.component.utils.PX.bg("TTAppOpenAdImpl", th.getMessage());
            return null;
        }
    }
}
