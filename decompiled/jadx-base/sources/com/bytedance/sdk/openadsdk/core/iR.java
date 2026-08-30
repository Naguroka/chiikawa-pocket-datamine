package com.bytedance.sdk.openadsdk.core;

/* JADX INFO: loaded from: classes4.dex */
public class iR extends android.view.View implements com.bytedance.sdk.component.utils.JAA.bg {
    private boolean IL;
    private int Kg;
    private boolean PX;
    private final java.lang.Runnable Ta;
    private android.view.ViewTreeObserver.OnGlobalLayoutListener VB;
    private final android.os.Handler WR;
    private com.bytedance.sdk.openadsdk.core.iR.bg bX;
    private boolean bg;
    private final java.util.concurrent.atomic.AtomicBoolean eo;
    private android.view.View eqN;
    private boolean iR;
    private java.util.List<android.view.View> ldr;
    private java.util.List<android.view.View> zx;

    public interface bg {
        void IL();

        void bg();

        void bg(android.view.View view);

        void bg(boolean z);
    }

    public iR(android.content.Context context, android.view.View view) {
        super(com.bytedance.sdk.openadsdk.core.VzQ.bg());
        this.WR = new com.bytedance.sdk.component.utils.JAA(com.bytedance.sdk.openadsdk.core.yDt.IL().getLooper(), this);
        this.eo = new java.util.concurrent.atomic.AtomicBoolean(true);
        this.PX = false;
        this.Ta = new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.core.iR.3
            @Override // java.lang.Runnable
            public void run() {
                if (com.bytedance.sdk.openadsdk.core.iR.this.bX != null) {
                    com.bytedance.sdk.openadsdk.core.iR.this.bX.bg(com.bytedance.sdk.openadsdk.core.iR.this.eqN);
                }
            }
        };
        this.eqN = view;
        setLayoutParams(new android.view.ViewGroup.LayoutParams(0, 0));
        this.VB = new android.view.ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.bytedance.sdk.openadsdk.core.iR.1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                if (com.bytedance.sdk.openadsdk.core.iR.this.PX) {
                    return;
                }
                com.bytedance.sdk.openadsdk.core.iR.this.zx();
                com.bytedance.sdk.openadsdk.core.iR.this.eqN();
            }
        };
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        com.bytedance.sdk.openadsdk.core.iR.bg bgVar = this.bX;
        if (bgVar != null) {
            bgVar.bg(z);
        }
    }

    @Override // android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.iR = false;
        IL();
        if (this.VB != null) {
            getViewTreeObserver().addOnGlobalLayoutListener(this.VB);
        }
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        IL();
    }

    private void IL() {
        com.bytedance.sdk.openadsdk.core.iR.bg bgVar;
        if (!this.eo.getAndSet(false) || (bgVar = this.bX) == null) {
            return;
        }
        bgVar.bg();
    }

    private void bX() {
        com.bytedance.sdk.openadsdk.core.iR.bg bgVar;
        if (this.eo.getAndSet(true) || (bgVar = this.bX) == null) {
            return;
        }
        bgVar.IL();
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        zx();
        this.iR = true;
        bX();
        bg(false);
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        bX();
    }

    public void setRefClickViews(java.util.List<android.view.View> list) {
        this.zx = list;
    }

    public void setRefCreativeViews(java.util.List<android.view.View> list) {
        this.ldr = list;
    }

    public void bg() {
        bg(this.zx, (com.bytedance.sdk.openadsdk.core.IL.bX) null);
        bg(this.ldr, (com.bytedance.sdk.openadsdk.core.IL.bX) null);
    }

    public void bg(java.util.List<android.view.View> list, com.bytedance.sdk.openadsdk.core.IL.bX bXVar) {
        if (com.bytedance.sdk.component.utils.eo.IL(list)) {
            for (android.view.View view : list) {
                if (view != null) {
                    view.setOnClickListener(bXVar);
                    view.setOnTouchListener(bXVar);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void eqN() {
        if (!this.IL || this.bg) {
            return;
        }
        this.bg = true;
        this.WR.sendEmptyMessage(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zx() {
        if (this.bg) {
            this.WR.removeCallbacksAndMessages(null);
            this.bg = false;
        }
    }

    public void setNeedCheckingShow(boolean z) {
        this.IL = z;
        if (!z && this.bg) {
            zx();
        } else {
            if (!z || this.bg) {
                return;
            }
            eqN();
        }
    }

    public void setCallback(com.bytedance.sdk.openadsdk.core.iR.bg bgVar) {
        this.bX = bgVar;
    }

    public void setAdType(int i) {
        this.Kg = i;
    }

    @Override // com.bytedance.sdk.component.utils.JAA.bg
    public void bg(android.os.Message message) {
        if (message.what == 1 && this.bg) {
            if (ldr() && com.bytedance.sdk.openadsdk.core.VW.bg(this.eqN, 20, this.Kg)) {
                zx();
                this.PX = true;
                com.bytedance.sdk.openadsdk.core.yDt.bX().post(this.Ta);
                bg(true);
                return;
            }
            this.WR.sendEmptyMessageDelayed(1, 1000L);
        }
    }

    private boolean ldr() {
        android.view.View view = this.eqN;
        if (view instanceof com.bytedance.sdk.openadsdk.core.Kg.Fy) {
            return ((com.bytedance.sdk.openadsdk.core.Kg.Fy) view).Lq();
        }
        return true;
    }

    private void bg(final boolean z) {
        final android.view.ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        com.bytedance.sdk.component.utils.iR.IL().post(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.core.iR.2
            @Override // java.lang.Runnable
            public void run() {
                android.view.ViewTreeObserver viewTreeObserver2;
                if (com.bytedance.sdk.openadsdk.core.iR.this.VB != null && (viewTreeObserver2 = viewTreeObserver) != null) {
                    try {
                        viewTreeObserver2.removeOnGlobalLayoutListener(com.bytedance.sdk.openadsdk.core.iR.this.VB);
                    } catch (java.lang.Exception unused) {
                    }
                }
                if (z) {
                    com.bytedance.sdk.openadsdk.core.iR.this.VB = null;
                }
            }
        });
    }
}
