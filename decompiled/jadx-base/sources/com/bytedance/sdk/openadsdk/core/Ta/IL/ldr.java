package com.bytedance.sdk.openadsdk.core.Ta.IL;

/* JADX INFO: loaded from: classes4.dex */
public class ldr extends com.bytedance.sdk.openadsdk.core.zx.bX implements com.bykv.vk.openvk.bg.bg.bg.eqN.bX.bg, com.bytedance.sdk.component.utils.JAA.bg, com.bytedance.sdk.openadsdk.core.Ta.IL.bX.bg {
    private static final java.lang.Integer LZ = 0;
    private static final java.lang.Integer tC = 1;
    private android.view.ViewTreeObserver.OnGlobalLayoutListener CQc;
    private long DDQ;
    private boolean Dxa;
    private java.lang.String Fy;
    protected com.bykv.vk.openvk.bg.bg.bg.eqN.bX IL;
    private boolean JAA;
    private boolean Ja;
    protected android.widget.ImageView Kg;
    private com.bykv.vk.openvk.bg.bg.bg.eqN.bX.InterfaceC0071bX LKE;
    public com.bytedance.sdk.openadsdk.core.Ta.IL.ldr.IL Lq;
    protected java.lang.String PX;
    protected int Ta;
    private final boolean Uq;
    private boolean Uw;
    protected boolean VB;
    private long VJ;
    private boolean VW;
    private boolean VzQ;
    protected android.widget.ImageView WR;
    private android.view.View ZQc;
    private final android.os.Handler aGH;
    private final java.lang.String ayS;
    private final java.util.concurrent.atomic.AtomicBoolean bN;
    protected android.widget.FrameLayout bX;
    protected final com.bytedance.sdk.openadsdk.core.model.tuV bg;
    private boolean daV;
    protected android.widget.ImageView eo;
    protected boolean eqN;
    protected android.widget.RelativeLayout iR;
    private final android.view.ViewTreeObserver.OnScrollChangedListener jz;
    private boolean kMt;
    public com.bytedance.sdk.openadsdk.eqN.iR ldr;
    private final java.lang.Runnable qC;
    private java.lang.String rri;
    private boolean tuV;
    private final java.util.concurrent.atomic.AtomicBoolean uu;
    private final android.content.Context vb;
    private android.view.ViewGroup xxp;
    boolean yDt;
    public boolean zx;

    public interface IL {
        void bg(boolean z, long j, long j2, long j3, boolean z2);
    }

    public interface bg {
        void bg(android.view.View view, int i);
    }

    @Override // com.bykv.vk.openvk.bg.bg.bg.eqN.bX.bg
    public void IL(long j, int i) {
    }

    @Override // com.bykv.vk.openvk.bg.bg.bg.eqN.bX.bg
    public void bg() {
        java.lang.Object[] objArr = new java.lang.Object[2];
    }

    public void setAdCreativeClickListener(com.bytedance.sdk.openadsdk.core.Ta.IL.ldr.bg bgVar) {
        com.bykv.vk.openvk.bg.bg.bg.eqN.bX bXVar = this.IL;
        if (bXVar != null) {
            ((com.bytedance.sdk.openadsdk.core.Ta.IL.bX) bXVar).bg(bgVar);
        }
    }

    public void setVideoPlayCallback(com.bytedance.sdk.openadsdk.core.Ta.IL.IL il) {
        com.bykv.vk.openvk.bg.bg.bg.eqN.bX bXVar = this.IL;
        if (bXVar != null) {
            ((com.bytedance.sdk.openadsdk.core.Ta.IL.bX) bXVar).bg(il);
        }
    }

    public void setControllerStatusCallBack(com.bytedance.sdk.openadsdk.core.Ta.IL.ldr.IL il) {
        this.Lq = il;
    }

    @Override // com.bykv.vk.openvk.bg.bg.bg.eqN.bX.bg
    public void bg(long j, int i) {
        com.bykv.vk.openvk.bg.bg.bg.eqN.bX.InterfaceC0071bX interfaceC0071bX = this.LKE;
        if (interfaceC0071bX != null) {
            interfaceC0071bX.i_();
        }
    }

    private void eqN() {
        bg(0L, 0);
        this.LKE = null;
    }

    @Override // com.bykv.vk.openvk.bg.bg.bg.eqN.bX.bg
    public void bg(long j, long j2) {
        com.bykv.vk.openvk.bg.bg.bg.eqN.bX.InterfaceC0071bX interfaceC0071bX = this.LKE;
        if (interfaceC0071bX != null) {
            interfaceC0071bX.bg(j, j2);
        }
    }

    public ldr(android.content.Context context, com.bytedance.sdk.openadsdk.core.model.tuV tuv, boolean z, com.bytedance.sdk.openadsdk.eqN.iR iRVar) {
        this(context, tuv, z, "embeded_ad", false, false, iRVar);
    }

    public ldr(android.content.Context context, com.bytedance.sdk.openadsdk.core.model.tuV tuv, java.lang.String str, boolean z, boolean z2, com.bytedance.sdk.openadsdk.eqN.iR iRVar) {
        this(context, tuv, false, str, z, z2, iRVar);
    }

    public ldr(android.content.Context context, com.bytedance.sdk.openadsdk.core.model.tuV tuv, com.bytedance.sdk.openadsdk.eqN.iR iRVar) {
        this(context, tuv, false, iRVar);
    }

    public ldr(android.content.Context context, com.bytedance.sdk.openadsdk.core.model.tuV tuv, boolean z, java.lang.String str, boolean z2, boolean z3, com.bytedance.sdk.openadsdk.eqN.iR iRVar) {
        super(context);
        this.VzQ = true;
        this.eqN = true;
        this.tuV = false;
        this.zx = false;
        this.kMt = true;
        this.JAA = false;
        this.Ja = true;
        this.VB = true;
        this.PX = "embeded_ad";
        this.Ta = 50;
        this.Uw = true;
        this.Uq = false;
        this.aGH = new com.bytedance.sdk.component.utils.JAA(com.bytedance.sdk.openadsdk.core.yDt.IL().getLooper(), this);
        this.daV = false;
        this.ayS = android.os.Build.MODEL;
        this.yDt = false;
        this.uu = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.qC = new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.core.Ta.IL.ldr.4
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.openadsdk.core.Ta.IL.ldr ldrVar = com.bytedance.sdk.openadsdk.core.Ta.IL.ldr.this;
                ldrVar.bg(ldrVar.VW, com.bytedance.sdk.openadsdk.core.Ta.IL.ldr.LZ.intValue());
            }
        };
        this.Dxa = true;
        this.bN = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.jz = new android.view.ViewTreeObserver.OnScrollChangedListener() { // from class: com.bytedance.sdk.openadsdk.core.Ta.IL.ldr.6
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public void onScrollChanged() {
                com.bytedance.sdk.openadsdk.core.Ta.IL.ldr.this.xxp();
            }
        };
        try {
            if (tuv.dtS()) {
                this.rri = com.bytedance.sdk.openadsdk.CacheDirFactory.getICacheDir(0).IL();
            }
        } catch (java.lang.Throwable unused) {
        }
        if (iRVar != null) {
            this.ldr = iRVar;
        }
        this.PX = str;
        this.vb = context;
        this.bg = tuv;
        this.tuV = z;
        setContentDescription("NativeVideoTsView");
        this.JAA = z2;
        this.Ja = z3;
        IL();
        zx();
    }

    protected void IL() {
        com.bytedance.sdk.openadsdk.core.model.tuV tuv = this.bg;
        if (tuv == null) {
            return;
        }
        int iIGR = tuv.IGR();
        int iIL = com.bytedance.sdk.openadsdk.core.VzQ.eqN().IL(iIGR);
        int iBX = com.bytedance.sdk.component.utils.Lq.bX(com.bytedance.sdk.openadsdk.core.VzQ.bg());
        if (iIL == 1) {
            this.VzQ = com.bytedance.sdk.openadsdk.utils.ayS.eqN(iBX);
        } else if (iIL == 2) {
            this.VzQ = com.bytedance.sdk.openadsdk.utils.ayS.zx(iBX) || com.bytedance.sdk.openadsdk.utils.ayS.eqN(iBX) || com.bytedance.sdk.openadsdk.utils.ayS.ldr(iBX);
        } else if (iIL == 3) {
            this.VzQ = false;
        } else if (iIL == 4) {
            this.yDt = true;
        } else if (iIL == 5) {
            this.VzQ = com.bytedance.sdk.openadsdk.utils.ayS.eqN(iBX) || com.bytedance.sdk.openadsdk.utils.ayS.ldr(iBX);
        }
        if (!this.tuV) {
            if (!this.zx || !com.bytedance.sdk.openadsdk.core.Kg.kMt.IL(this.PX)) {
                this.eqN = com.bytedance.sdk.openadsdk.core.VzQ.eqN().bX(java.lang.String.valueOf(iIGR));
            }
        } else {
            this.eqN = false;
        }
        if ("open_ad".equals(this.PX)) {
            this.VzQ = true;
            this.eqN = true;
        }
        com.bykv.vk.openvk.bg.bg.bg.eqN.bX bXVar = this.IL;
        if (bXVar != null) {
            bXVar.eqN(this.VzQ);
        }
        this.zx = true;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        com.bytedance.sdk.openadsdk.core.Ta.IL.ldr.IL il;
        com.bykv.vk.openvk.bg.bg.bg.eqN.bX bXVar;
        if (!this.tuV && (il = this.Lq) != null && (bXVar = this.IL) != null) {
            il.bg(bXVar.Lq(), this.IL.Kg(), this.IL.WR(), this.IL.zx(), this.VzQ);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    private android.view.View bg(android.content.Context context) {
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(context);
        new android.widget.FrameLayout.LayoutParams(-1, -1).gravity = 17;
        frameLayout.setVisibility(8);
        this.xxp = frameLayout;
        android.widget.FrameLayout frameLayout2 = new android.widget.FrameLayout(context);
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        frameLayout2.setLayoutParams(layoutParams);
        frameLayout.addView(frameLayout2);
        this.bX = frameLayout2;
        android.view.View view = new android.view.View(context);
        view.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(view);
        this.ZQc = view;
        return frameLayout;
    }

    private android.widget.RelativeLayout IL(android.content.Context context) {
        com.bytedance.sdk.openadsdk.core.zx.iR iRVar = new com.bytedance.sdk.openadsdk.core.zx.iR(context);
        iRVar.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
        iRVar.setVisibility(8);
        com.bytedance.sdk.openadsdk.core.zx.eqN eqn = new com.bytedance.sdk.openadsdk.core.zx.eqN(context);
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        eqn.setLayoutParams(layoutParams);
        eqn.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
        this.Kg = eqn;
        com.bytedance.sdk.openadsdk.core.zx.eqN eqn2 = new com.bytedance.sdk.openadsdk.core.zx.eqN(context);
        android.widget.RelativeLayout.LayoutParams layoutParams2 = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(13);
        eqn2.setLayoutParams(layoutParams2);
        eqn2.setVisibility(8);
        eqn2.setBackground(com.bytedance.sdk.component.utils.Fy.bX(context, "tt_new_play_video"));
        this.eo = eqn2;
        iRVar.addView(eqn);
        iRVar.addView(eqn2);
        return iRVar;
    }

    private void zx() {
        addView(bg(this.vb));
        VzQ();
        addOnAttachStateChangeListener(new android.view.View.OnAttachStateChangeListener() { // from class: com.bytedance.sdk.openadsdk.core.Ta.IL.ldr.1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(android.view.View view) {
                com.bytedance.sdk.openadsdk.core.Ta.IL.ldr.this.xxp();
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(android.view.View view) {
                com.bytedance.sdk.openadsdk.core.Ta.IL.ldr.this.xxp();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void xxp() {
        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
        android.os.Handler handler = this.aGH;
        if (handler == null || jElapsedRealtime - this.VJ <= 500) {
            return;
        }
        this.VJ = jElapsedRealtime;
        handler.sendEmptyMessageDelayed(1, 500L);
    }

    public void setVideoAdClickListenerTTNativeAd(com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd pAGNativeAd) {
        com.bykv.vk.openvk.bg.bg.bg.eqN.bX bXVar = this.IL;
        if (bXVar != null) {
            ((com.bytedance.sdk.openadsdk.core.Ta.IL.bX) bXVar).bg(pAGNativeAd);
        }
    }

    public void iR() {
        android.view.View view;
        if (this.vb == null || (view = this.ZQc) == null || view.getParent() == null || this.bg == null || this.iR != null) {
            return;
        }
        android.view.ViewParent parent = this.ZQc.getParent();
        android.widget.RelativeLayout relativeLayoutIL = IL(this.vb);
        if (parent != null && (parent instanceof android.view.ViewGroup)) {
            bg(relativeLayoutIL, (android.view.ViewGroup) parent, this.ZQc);
        }
        this.iR = relativeLayoutIL;
        if (this.VB) {
            com.bytedance.sdk.openadsdk.utils.ZQc.bg((android.view.View) this.eo, 0);
        }
        if (this.bg.Dxa() != null && this.bg.Dxa().eo() != null) {
            com.bytedance.sdk.openadsdk.xxp.bX.bg().bg(this.bg.Dxa().eo(), this.bg.Dxa().bX(), this.bg.Dxa().IL(), this.Kg, this.bg);
        }
        android.widget.ImageView imageView = this.eo;
        if (imageView != null) {
            imageView.setClickable(true);
            this.eo.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.Ta.IL.ldr.2
                @Override // android.view.View.OnClickListener
                public void onClick(android.view.View view2) {
                    com.bytedance.sdk.openadsdk.core.Ta.IL.ldr.this.bX();
                }
            });
        }
    }

    private void bg(android.view.View view, android.view.ViewGroup viewGroup, android.view.View view2) {
        int iIndexOfChild = viewGroup.indexOfChild(view2);
        viewGroup.removeViewInLayout(view2);
        android.view.ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        if (layoutParams != null) {
            viewGroup.addView(view, iIndexOfChild, layoutParams);
        } else {
            viewGroup.addView(view, iIndexOfChild);
        }
    }

    private void VzQ() {
        this.IL = new com.bytedance.sdk.openadsdk.core.Ta.IL.bX(this.vb, this.bX, this.bg, this.PX, !VW(), this.JAA, this.Ja, this.ldr);
        tuV();
        if (this.CQc == null) {
            this.CQc = new android.view.ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.bytedance.sdk.openadsdk.core.Ta.IL.ldr.3
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public void onGlobalLayout() {
                    if (com.bytedance.sdk.openadsdk.core.Ta.IL.ldr.this.xxp == null || com.bytedance.sdk.openadsdk.core.Ta.IL.ldr.this.xxp.getViewTreeObserver() == null || com.bytedance.sdk.openadsdk.core.Ta.IL.ldr.this.IL == null) {
                        return;
                    }
                    ((com.bytedance.sdk.openadsdk.core.Ta.IL.bX) com.bytedance.sdk.openadsdk.core.Ta.IL.ldr.this.IL).bg(com.bytedance.sdk.openadsdk.core.Ta.IL.ldr.this.xxp.getWidth(), com.bytedance.sdk.openadsdk.core.Ta.IL.ldr.this.xxp.getHeight());
                    com.bytedance.sdk.openadsdk.core.Ta.IL.ldr.this.xxp.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    com.bytedance.sdk.openadsdk.core.Ta.IL.ldr.this.CQc = null;
                }
            };
            this.xxp.getViewTreeObserver().addOnGlobalLayoutListener(this.CQc);
        }
    }

    public void setVideoAdLoadListener(com.bykv.vk.openvk.bg.bg.bg.eqN.bX.eqN eqn) {
        com.bykv.vk.openvk.bg.bg.bg.eqN.bX bXVar = this.IL;
        if (bXVar != null) {
            bXVar.bg(eqn);
        }
    }

    public boolean bg(long j, boolean z, boolean z2) {
        boolean zBg = false;
        this.xxp.setVisibility(0);
        this.DDQ = j;
        if (!VW()) {
            return true;
        }
        this.IL.bg(false);
        com.bytedance.sdk.openadsdk.core.model.tuV tuv = this.bg;
        if (tuv != null && tuv.Dxa() != null) {
            com.bytedance.sdk.openadsdk.core.Ta.bg.IL ilBg = com.bytedance.sdk.openadsdk.core.model.tuV.bg(com.bytedance.sdk.openadsdk.CacheDirFactory.getICacheDir(this.bg.uV()).bX(), this.bg);
            ilBg.IL(this.bg.Ys());
            ilBg.bg(this.xxp.getWidth());
            ilBg.IL(this.xxp.getHeight());
            ilBg.bX(this.bg.Ny());
            ilBg.bg(j);
            ilBg.bg(WR());
            bg(ilBg);
            if (z2) {
                this.IL.IL(ilBg);
                return true;
            }
            zBg = this.IL.bg(ilBg);
        }
        if (((j > 0 && !z && !z2) || (j > 0 && z)) && this.IL != null) {
            com.bytedance.sdk.openadsdk.eqN.zx.IL.Lq.bg bgVar = new com.bytedance.sdk.openadsdk.eqN.zx.IL.Lq.bg();
            bgVar.bg(this.IL.zx());
            bgVar.bX(this.IL.Kg());
            bgVar.IL(this.IL.ldr());
            com.bytedance.sdk.openadsdk.eqN.zx.bg.bg.IL(this.IL.Ta(), bgVar);
        }
        return zBg;
    }

    private void tuV() {
        com.bykv.vk.openvk.bg.bg.bg.eqN.bX bXVar = this.IL;
        if (bXVar == null) {
            return;
        }
        bXVar.eqN(this.VzQ);
        ((com.bytedance.sdk.openadsdk.core.Ta.IL.bX) this.IL).bg((com.bytedance.sdk.openadsdk.core.Ta.IL.bX.bg) this);
        this.IL.bg(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Fy();
        getViewTreeObserver().addOnScrollChangedListener(this.jz);
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        Fy();
    }

    private void Fy() {
        com.bykv.vk.openvk.bg.bg.bg.eqN.bX bXVar = this.IL;
        if (bXVar == null) {
            VzQ();
        } else if ((bXVar instanceof com.bytedance.sdk.openadsdk.core.Ta.IL.bX) && !VW()) {
            ((com.bytedance.sdk.openadsdk.core.Ta.IL.bX) this.IL).VzQ();
        }
        if (this.IL == null || !this.uu.get()) {
            return;
        }
        this.uu.set(false);
        IL();
        if (Kg()) {
            com.bytedance.sdk.openadsdk.utils.ZQc.bg((android.view.View) this.iR, 8);
            android.widget.ImageView imageView = this.WR;
            if (imageView != null) {
                com.bytedance.sdk.openadsdk.utils.ZQc.bg((android.view.View) imageView, 8);
            }
            com.bytedance.sdk.openadsdk.core.model.tuV tuv = this.bg;
            if (tuv != null && tuv.Dxa() != null) {
                com.bytedance.sdk.openadsdk.core.Ta.bg.IL ilBg = com.bytedance.sdk.openadsdk.core.model.tuV.bg(com.bytedance.sdk.openadsdk.CacheDirFactory.getICacheDir(this.bg.uV()).bX(), this.bg);
                ilBg.IL(this.bg.Ys());
                ilBg.bg(this.xxp.getWidth());
                ilBg.IL(this.xxp.getHeight());
                ilBg.bX(this.bg.Ny());
                ilBg.bg(0L);
                ilBg.bg(WR());
                bg(ilBg);
                this.IL.bg(ilBg);
                this.IL.bX(false);
                return;
            }
            com.bytedance.sdk.component.utils.PX.bg("NativeVideoTsView", "attachTask materialMeta.getVideo() is null !!");
            return;
        }
        if (this.IL.Lq()) {
            this.IL.Lq();
            IL(true);
        } else {
            iR();
            com.bytedance.sdk.openadsdk.utils.ZQc.bg((android.view.View) this.iR, 0);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        LZ();
        android.view.ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnScrollChangedListener(this.jz);
        }
        android.view.ViewGroup viewGroup = this.xxp;
        if (viewGroup == null || this.CQc == null) {
            return;
        }
        android.view.ViewTreeObserver viewTreeObserver2 = viewGroup.getViewTreeObserver();
        if (viewTreeObserver2.isAlive()) {
            viewTreeObserver2.removeOnGlobalLayoutListener(this.CQc);
            this.CQc = null;
        }
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        LZ();
    }

    private void LZ() {
        this.Lq = null;
        if ((this.IL instanceof com.bytedance.sdk.openadsdk.core.Ta.IL.bX) && !VW()) {
            ((com.bytedance.sdk.openadsdk.core.Ta.IL.bX) this.IL).VJ();
        }
        eo();
        bg(false);
        tC();
    }

    private void tC() {
        if (!this.uu.get()) {
            this.uu.set(true);
            com.bykv.vk.openvk.bg.bg.bg.eqN.bX bXVar = this.IL;
            if (bXVar != null) {
                bXVar.bg(true, 3);
            }
        }
        this.bN.set(false);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 4 || i == 8) {
            tC();
        }
    }

    @Override // com.bytedance.sdk.component.utils.JAA.bg
    public void bg(android.os.Message message) {
        if (message.what == 1) {
            rri();
        }
    }

    private void rri() {
        this.VW = VB();
        com.bytedance.sdk.openadsdk.utils.VJ.bg(this.qC);
    }

    private boolean kMt() {
        com.bytedance.sdk.openadsdk.core.model.tuV tuv = this.bg;
        if (tuv == null) {
            return false;
        }
        return tuv.Rh();
    }

    private boolean JAA() {
        if (VW() || !kMt()) {
            return false;
        }
        return com.bytedance.sdk.openadsdk.multipro.eqN.bg.bg("sp_multi_native_video_data", "key_video_is_from_detail_page", false) || com.bytedance.sdk.openadsdk.multipro.eqN.bg.bg("sp_multi_native_video_data", "key_video_isfromvideodetailpage", false);
    }

    private void Ja() {
        if (VW() || !kMt()) {
            return;
        }
        com.bytedance.sdk.openadsdk.multipro.eqN.bg.bg("sp_multi_native_video_data", "key_video_isfromvideodetailpage", java.lang.Boolean.FALSE);
        com.bytedance.sdk.openadsdk.multipro.eqN.bg.bg("sp_multi_native_video_data", "key_video_is_from_detail_page", java.lang.Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bg(boolean z, int i) {
        if (this.bg == null || this.IL == null) {
            return;
        }
        boolean zJAA = JAA();
        Ja();
        if (zJAA && this.IL.Lq()) {
            this.IL.Lq();
            IL(true);
            eqN();
            return;
        }
        if (z && this.kMt && !this.IL.Lq() && !this.IL.VB()) {
            if (this.IL.PX() != null && this.IL.PX().iR()) {
                if (this.VzQ || i == 1) {
                    com.bykv.vk.openvk.bg.bg.bg.eqN.bX bXVar = this.IL;
                    if (bXVar != null) {
                        setIsQuiet(bXVar.yDt());
                    }
                    if ("ALP-AL00".equals(this.ayS)) {
                        this.IL.IL();
                    } else {
                        if (!com.bytedance.sdk.openadsdk.core.WR.IL().Lq()) {
                            zJAA = true;
                        }
                        ((com.bytedance.sdk.openadsdk.core.Ta.IL.bX) this.IL).Kg(zJAA);
                    }
                    bg(false);
                    com.bykv.vk.openvk.bg.bg.bg.eqN.bX.InterfaceC0071bX interfaceC0071bX = this.LKE;
                    if (interfaceC0071bX != null) {
                        interfaceC0071bX.h_();
                        return;
                    }
                    return;
                }
                return;
            }
            if (this.VzQ && this.IL.PX() == null) {
                if (!this.uu.get()) {
                    this.uu.set(true);
                }
                this.bN.set(false);
                Fy();
                return;
            }
            return;
        }
        if (this.IL.PX() == null || !this.IL.PX().ldr()) {
            return;
        }
        this.IL.bg();
        bg(true);
        com.bykv.vk.openvk.bg.bg.bg.eqN.bX.InterfaceC0071bX interfaceC0071bX2 = this.LKE;
        if (interfaceC0071bX2 != null) {
            interfaceC0071bX2.g_();
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        com.bykv.vk.openvk.bg.bg.bg.eqN.bX bXVar;
        com.bykv.vk.openvk.bg.bg.bg.eqN.bX bXVar2;
        com.bykv.vk.openvk.bg.bg.bg.eqN.bX bXVar3;
        com.bykv.vk.openvk.bg.bg.bg.eqN.bX bXVar4;
        if (!"open_ad".equals(this.PX)) {
            this.kMt = z;
            super.onWindowFocusChanged(z);
            DDQ();
            if (JAA() && (bXVar4 = this.IL) != null && bXVar4.Lq()) {
                Ja();
                com.bytedance.sdk.openadsdk.utils.ZQc.bg((android.view.View) this.iR, 8);
                IL(true);
                eqN();
                return;
            }
            IL();
            if (VW() || !Kg() || (bXVar2 = this.IL) == null || bXVar2.VB()) {
                if (Kg()) {
                    return;
                }
                if (!z && (bXVar = this.IL) != null && bXVar.PX() != null && this.IL.PX().ldr()) {
                    Uw();
                    bg(false, LZ.intValue());
                    return;
                } else {
                    if (z) {
                        this.aGH.obtainMessage(1).sendToTarget();
                        return;
                    }
                    return;
                }
            }
            if (this.aGH != null) {
                if (z && (bXVar3 = this.IL) != null && !bXVar3.Lq()) {
                    this.aGH.obtainMessage(1).sendToTarget();
                    return;
                } else {
                    Uw();
                    bg(false, LZ.intValue());
                    return;
                }
            }
            return;
        }
        Uw();
    }

    private void Uw() {
        this.aGH.removeMessages(1);
        com.bytedance.sdk.openadsdk.core.yDt.bX().removeCallbacks(this.qC);
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i) {
        com.bykv.vk.openvk.bg.bg.bg.eqN.bX bXVar;
        com.bytedance.sdk.openadsdk.core.model.tuV tuv;
        com.bykv.vk.openvk.bg.bg.bg.eqN.bX bXVar2;
        com.bykv.vk.openvk.bg.bg.bg.eqN.bX bXVar3;
        super.onWindowVisibilityChanged(i);
        DDQ();
        if (this.Dxa) {
            this.Dxa = i == 0;
        }
        if (JAA() && (bXVar3 = this.IL) != null && bXVar3.Lq()) {
            Ja();
            com.bytedance.sdk.openadsdk.utils.ZQc.bg((android.view.View) this.iR, 8);
            IL(true);
            eqN();
            return;
        }
        IL();
        if (VW() || !Kg() || (bXVar = this.IL) == null || bXVar.VB() || (tuv = this.bg) == null) {
            return;
        }
        if (this.Uw && tuv.Dxa() != null) {
            this.bg.Dxa();
            com.bytedance.sdk.openadsdk.core.Ta.bg.IL ilBg = com.bytedance.sdk.openadsdk.core.model.tuV.bg(com.bytedance.sdk.openadsdk.CacheDirFactory.getICacheDir(this.bg.uV()).bX(), this.bg);
            ilBg.IL(this.bg.Ys());
            ilBg.bg(this.xxp.getWidth());
            ilBg.IL(this.xxp.getHeight());
            ilBg.bX(this.bg.Ny());
            ilBg.bg(this.DDQ);
            ilBg.bg(WR());
            bg(ilBg);
            this.IL.bg(ilBg);
            this.Uw = false;
            com.bytedance.sdk.openadsdk.utils.ZQc.bg((android.view.View) this.iR, 8);
        } else {
            com.bytedance.sdk.component.utils.PX.bg("NativeVideoTsView", "attachTask materialMeta.getVideo() is null !!");
        }
        if (i != 0 || this.aGH == null || (bXVar2 = this.IL) == null || bXVar2.Lq()) {
            return;
        }
        this.aGH.obtainMessage(1).sendToTarget();
    }

    private void DDQ() {
        boolean zBg = false;
        if (this.IL == null || VW() || (kMt() && !com.bytedance.sdk.openadsdk.multipro.eqN.bg.bg("sp_multi_native_video_data", "key_video_is_update_flag", false))) {
            return;
        }
        long jKg = this.IL.Kg() + this.IL.ldr();
        long jKg2 = this.IL.Kg();
        long jBg = 0;
        if (kMt()) {
            zBg = com.bytedance.sdk.openadsdk.multipro.eqN.bg.bg("sp_multi_native_video_data", "key_native_video_complete", false);
            jBg = com.bytedance.sdk.openadsdk.multipro.eqN.bg.bg("sp_multi_native_video_data", "key_video_current_play_position", 0L);
            jKg = com.bytedance.sdk.openadsdk.multipro.eqN.bg.bg("sp_multi_native_video_data", "key_video_total_play_duration", this.IL.Kg() + this.IL.ldr());
            jKg2 = com.bytedance.sdk.openadsdk.multipro.eqN.bg.bg("sp_multi_native_video_data", "key_video_duration", this.IL.Kg());
            com.bytedance.sdk.openadsdk.multipro.eqN.bg.bg("sp_multi_native_video_data", "key_video_is_update_flag", java.lang.Boolean.FALSE);
            this.IL.bX(zBg);
            this.IL.bg(jBg);
            this.IL.IL(jKg);
            this.IL.bX(jKg2);
        }
        com.bytedance.sdk.component.utils.PX.bg("MultiProcess", "onResumeFeedNativeVideoControllerData-isComplete=" + zBg + ",position=" + jBg + ",totalPlayDuration=" + jKg + ",duration=" + jKg2);
    }

    public com.bykv.vk.openvk.bg.bg.bg.eqN.bX getNativeVideoController() {
        return this.IL;
    }

    public boolean Kg() {
        return this.VzQ;
    }

    public void setIsAutoPlay(boolean z) {
        if (this.daV) {
            return;
        }
        int iIL = com.bytedance.sdk.openadsdk.core.VzQ.eqN().IL(this.bg.IGR());
        if (z && iIL != 4 && (!com.bytedance.sdk.component.utils.Lq.zx(this.vb) ? !(!com.bytedance.sdk.component.utils.Lq.ldr(this.vb) ? com.bytedance.sdk.component.utils.Lq.eqN(this.vb) : Uq() || aGH()) : !Uq())) {
            z = false;
        }
        this.VzQ = z;
        com.bykv.vk.openvk.bg.bg.bg.eqN.bX bXVar = this.IL;
        if (bXVar != null) {
            bXVar.eqN(z);
        }
        if (!this.VzQ) {
            iR();
            android.widget.RelativeLayout relativeLayout = this.iR;
            if (relativeLayout != null) {
                com.bytedance.sdk.openadsdk.utils.ZQc.bg((android.view.View) relativeLayout, 0);
                com.bytedance.sdk.openadsdk.core.model.tuV tuv = this.bg;
                if (tuv != null && tuv.Dxa() != null) {
                    com.bytedance.sdk.openadsdk.xxp.bX.bg().bg(this.bg.Dxa().eo(), this.bg.Dxa().bX(), this.bg.Dxa().IL(), this.Kg, this.bg);
                }
            }
        } else {
            com.bytedance.sdk.openadsdk.utils.ZQc.bg((android.view.View) this.iR, 8);
        }
        this.daV = true;
    }

    private boolean Uq() {
        return 2 == com.bytedance.sdk.openadsdk.core.VzQ.eqN().IL(this.bg.IGR());
    }

    private boolean aGH() {
        return 5 == com.bytedance.sdk.openadsdk.core.VzQ.eqN().IL(this.bg.IGR());
    }

    public boolean WR() {
        return this.eqN;
    }

    public void setIsQuiet(boolean z) {
        this.eqN = z;
        com.bykv.vk.openvk.bg.bg.bg.eqN.bX bXVar = this.IL;
        if (bXVar != null) {
            bXVar.IL(z);
        }
    }

    private boolean VW() {
        return this.tuV;
    }

    public void setVideoAdInteractionListener(com.bykv.vk.openvk.bg.bg.bg.eqN.bX.InterfaceC0071bX interfaceC0071bX) {
        this.LKE = interfaceC0071bX;
    }

    @Override // com.bytedance.sdk.openadsdk.core.Ta.IL.bX.bg
    public void ldr() {
        com.bykv.vk.openvk.bg.bg.bg.eqN.bX.InterfaceC0071bX interfaceC0071bX = this.LKE;
        if (interfaceC0071bX != null) {
            interfaceC0071bX.d_();
        }
    }

    public void setNeedNativeVideoPlayBtnVisible(boolean z) {
        this.VB = z;
    }

    @Override // com.bytedance.sdk.openadsdk.core.Ta.IL.bX.bg
    public void bg(int i) {
        IL();
    }

    protected void bX() {
        if (PX()) {
            return;
        }
        yDt();
    }

    protected void bg(boolean z) {
        if (this.WR == null) {
            this.WR = new android.widget.ImageView(getContext());
            if (com.bytedance.sdk.openadsdk.core.WR.IL().vb() != null) {
                this.WR.setImageBitmap(com.bytedance.sdk.openadsdk.core.WR.IL().vb());
            } else {
                this.WR.setImageResource(com.bytedance.sdk.component.utils.Fy.eqN(com.bytedance.sdk.openadsdk.core.VzQ.bg(), "tt_new_play_video"));
            }
            this.WR.setScaleType(android.widget.ImageView.ScaleType.FIT_XY);
            int iBX = com.bytedance.sdk.openadsdk.utils.ZQc.bX(getContext(), this.Ta);
            int iBX2 = com.bytedance.sdk.openadsdk.utils.ZQc.bX(getContext(), 10.0f);
            android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(iBX, iBX);
            layoutParams.gravity = 17;
            layoutParams.rightMargin = iBX2;
            layoutParams.bottomMargin = iBX2;
            this.xxp.addView(this.WR, layoutParams);
            this.WR.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.Ta.IL.ldr.5
                @Override // android.view.View.OnClickListener
                public void onClick(android.view.View view) {
                    com.bytedance.sdk.openadsdk.core.Ta.IL.ldr.this.yDt();
                }
            });
        }
        if (z) {
            this.WR.setVisibility(0);
        } else {
            this.WR.setVisibility(8);
        }
    }

    public void IL(boolean z) {
        com.bykv.vk.openvk.bg.bg.bg.eqN.bX bXVar = this.IL;
        if (bXVar != null) {
            bXVar.bX(z);
            com.bykv.vk.openvk.bg.bg.bg.eqN.IL ilTa = this.IL.Ta();
            if (ilTa != null) {
                ilTa.IL();
                android.view.View viewBX = ilTa.bX();
                if (viewBX != null) {
                    if (viewBX.getParent() != null) {
                        ((android.view.ViewGroup) viewBX.getParent()).removeView(viewBX);
                    }
                    viewBX.setVisibility(0);
                    addView(viewBX);
                    ilTa.bg(this.bg, new java.lang.ref.WeakReference<>(this.vb), false);
                }
            }
        }
    }

    public void eo() {
        com.bykv.vk.openvk.bg.bg.bg.eqN.IL ilTa;
        com.bykv.vk.openvk.bg.bg.bg.eqN.bX bXVar = this.IL;
        if (bXVar == null || (ilTa = bXVar.Ta()) == null) {
            return;
        }
        ilTa.bg();
        android.view.View viewBX = ilTa.bX();
        if (viewBX != null) {
            viewBX.setVisibility(8);
            if (viewBX.getParent() != null) {
                ((android.view.ViewGroup) viewBX.getParent()).removeView(viewBX);
            }
        }
    }

    private void VJ() {
        com.bytedance.sdk.openadsdk.utils.ZQc.zx(this.WR);
        com.bytedance.sdk.openadsdk.utils.ZQc.zx(this.iR);
    }

    public void setVideoCacheUrl(java.lang.String str) {
        this.Fy = str;
    }

    boolean VB() {
        return com.bytedance.sdk.openadsdk.core.VW.bg(this, 50, com.bytedance.sdk.openadsdk.core.Kg.kMt.IL(this.PX) ? 1 : 5);
    }

    public boolean PX() {
        boolean z = false;
        if (com.bytedance.sdk.component.utils.Lq.bX(com.bytedance.sdk.openadsdk.core.VzQ.bg()) == 0) {
            return false;
        }
        if (this.IL.PX() != null && this.IL.PX().ldr()) {
            bg(false, LZ.intValue());
            android.os.Handler handler = this.aGH;
            z = true;
            if (handler != null) {
                handler.removeMessages(1);
            }
        }
        return z;
    }

    public void Ta() {
        if (getNativeVideoController() == null || !(getNativeVideoController() instanceof com.bytedance.sdk.openadsdk.core.Ta.IL.bX)) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.Ta.IL.bX bXVar = (com.bytedance.sdk.openadsdk.core.Ta.IL.bX) getNativeVideoController();
        bXVar.bg(bXVar.Ta(), this);
    }

    public void yDt() {
        if (com.bytedance.sdk.component.utils.Lq.bX(com.bytedance.sdk.openadsdk.core.VzQ.bg()) != 0 && VB()) {
            if (this.IL.PX() != null && this.IL.PX().iR()) {
                bg(true, tC.intValue());
                IL();
                android.os.Handler handler = this.aGH;
                if (handler != null) {
                    handler.sendEmptyMessageDelayed(1, 500L);
                    return;
                }
                return;
            }
            if (Kg() || this.bN.get()) {
                return;
            }
            this.bN.set(true);
            VJ();
            com.bytedance.sdk.openadsdk.core.model.tuV tuv = this.bg;
            if (tuv != null && tuv.Dxa() != null) {
                VJ();
                this.bg.Dxa();
                com.bytedance.sdk.openadsdk.core.Ta.bg.IL ilBg = com.bytedance.sdk.openadsdk.core.model.tuV.bg(com.bytedance.sdk.openadsdk.CacheDirFactory.getICacheDir(this.bg.uV()).bX(), this.bg);
                ilBg.IL(this.bg.Ys());
                ilBg.bg(this.xxp.getWidth());
                ilBg.IL(this.xxp.getHeight());
                ilBg.bX(this.bg.Ny());
                ilBg.bg(this.DDQ);
                ilBg.bg(WR());
                ilBg.bg(com.bytedance.sdk.openadsdk.CacheDirFactory.getICacheDir(this.bg.uV()).bX());
                bg(ilBg);
                this.IL.bg(ilBg);
            }
            android.os.Handler handler2 = this.aGH;
            if (handler2 != null) {
                handler2.sendEmptyMessageDelayed(1, 500L);
            }
            bg(false);
        }
    }

    public double getCurrentPlayTime() {
        com.bykv.vk.openvk.bg.bg.bg.eqN.bX bXVar = this.IL;
        if (bXVar != null) {
            return (bXVar.zx() * 1.0d) / 1000.0d;
        }
        return 0.0d;
    }

    public void Lq() {
        com.bytedance.sdk.openadsdk.core.model.tuV tuv = this.bg;
        if (tuv == null || tuv.hi() == null) {
            return;
        }
        this.bg.hi().Lq();
        this.bg.hi().bg().zx(this.DDQ);
    }

    public com.bytedance.sdk.openadsdk.core.PX.ldr bg(java.util.List<android.util.Pair<android.view.View, com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose>> list) {
        com.bykv.vk.openvk.bg.bg.bg.eqN.bX bXVar = this.IL;
        if (bXVar instanceof com.bytedance.sdk.openadsdk.core.Ta.IL.bX) {
            return ((com.bytedance.sdk.openadsdk.core.Ta.IL.bX) bXVar).bg(this, list);
        }
        return null;
    }

    private void bg(com.bykv.vk.openvk.bg.bg.bg.bX.bX bXVar) {
        try {
            if (this.bg.dtS()) {
                bXVar.bg(this.rri);
            }
        } catch (java.lang.Throwable unused) {
        }
    }
}
