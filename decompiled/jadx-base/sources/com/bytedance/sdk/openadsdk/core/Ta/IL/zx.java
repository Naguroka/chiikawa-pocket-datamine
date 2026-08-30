package com.bytedance.sdk.openadsdk.core.Ta.IL;

/* JADX INFO: loaded from: classes4.dex */
public class zx implements com.bykv.vk.openvk.bg.bg.bg.eqN.IL<com.bytedance.sdk.openadsdk.core.model.tuV>, com.bykv.vk.openvk.bg.bg.bg.ldr.bg, com.bytedance.sdk.component.utils.JAA.bg, com.bytedance.sdk.openadsdk.core.IL.bg.InterfaceC0132bg, com.bytedance.sdk.openadsdk.core.widget.Fy.IL, com.bytedance.sdk.openadsdk.core.widget.tuV.bg {
    private final java.lang.String CQc;
    com.bytedance.sdk.openadsdk.core.Ta.IL.bg DDQ;
    int Fy;
    protected final int IL;
    com.bytedance.sdk.openadsdk.core.model.tuV JAA;
    android.content.Context Ja;
    android.widget.ImageView Kg;
    private long LKE;
    boolean LZ;
    android.widget.TextView Lq;
    android.view.View PX;
    com.bytedance.sdk.openadsdk.core.widget.bg Ta;
    boolean Uq;
    com.bytedance.sdk.openadsdk.core.widget.Fy Uw;
    android.widget.ImageView VB;
    com.bytedance.sdk.openadsdk.core.IL.bg VJ;
    com.bykv.vk.openvk.bg.bg.bg.eqN.bX VW;
    int VzQ;
    android.view.View WR;
    private com.bytedance.sdk.openadsdk.core.Ta.IL.ldr.bg ZQc;
    com.bytedance.sdk.openadsdk.VzQ.bg.bg.ldr aGH;
    boolean ayS;
    android.view.ViewGroup bX;
    protected final int bg;
    com.bytedance.sdk.openadsdk.core.IL.bg daV;
    android.view.View eo;
    com.bykv.vk.openvk.bg.bg.bg.ldr.IL eqN;
    android.view.View iR;
    int kMt;
    android.view.View ldr;
    int rri;
    boolean tC;
    int tuV;
    android.widget.TextView vb;
    int xxp;
    android.widget.TextView yDt;
    android.widget.ImageView zx;

    public void IL(android.view.ViewGroup viewGroup) {
    }

    public void IL(boolean z) {
    }

    public boolean IL(int i) {
        return false;
    }

    public void bX(boolean z) {
    }

    public void bg(int i) {
    }

    public void bg(long j) {
    }

    public void bg(long j, long j2) {
    }

    public void bg(android.os.Message message) {
    }

    public void bg(android.view.View view, boolean z) {
    }

    public void bg(android.view.ViewGroup viewGroup) {
    }

    public void bg(java.lang.String str) {
    }

    public boolean eo() {
        return false;
    }

    public void ldr() {
    }

    public void zx() {
    }

    @Override // com.bykv.vk.openvk.bg.bg.bg.eqN.IL
    public /* bridge */ /* synthetic */ void bg(com.bytedance.sdk.openadsdk.core.model.tuV tuv, java.lang.ref.WeakReference weakReference, boolean z) {
        bg(tuv, (java.lang.ref.WeakReference<android.content.Context>) weakReference, z);
    }

    public zx(android.content.Context context, android.view.ViewGroup viewGroup, boolean z, int i, com.bytedance.sdk.openadsdk.core.model.tuV tuv, com.bykv.vk.openvk.bg.bg.bg.eqN.bX bXVar, boolean z2) {
        this.bg = 228;
        this.IL = org.objectweb.asm.Opcodes.IF_ICMPNE;
        this.LZ = true;
        this.Uq = true;
        this.ayS = true;
        this.CQc = android.os.Build.MODEL;
        if (this instanceof com.bytedance.sdk.openadsdk.core.Ta.IL.eqN) {
            return;
        }
        this.Ja = com.bytedance.sdk.openadsdk.core.VzQ.bg().getApplicationContext();
        eqN(z2);
        this.bX = viewGroup;
        this.LZ = z;
        this.kMt = i;
        this.VW = bXVar;
        this.JAA = tuv;
        eqN(8);
        bg(context, this.bX);
        eqN();
        PX();
    }

    public zx(android.content.Context context, android.view.ViewGroup viewGroup, boolean z, int i, com.bytedance.sdk.openadsdk.core.model.tuV tuv, com.bykv.vk.openvk.bg.bg.bg.eqN.bX bXVar) {
        this(context, viewGroup, z, i, tuv, bXVar, true);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003b  */
    /* JADX WARN: Code duplicated, block: B:22:0x005c  */
    /* JADX WARN: Code duplicated, block: B:23:0x0062  */
    /* JADX WARN: Code duplicated, block: B:31:0x0094  */
    /* JADX WARN: Code duplicated, block: B:33:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:36:? A[RETURN, SYNTHETIC] */
    void PX() {
        java.lang.String str;
        int i;
        java.lang.String str2;
        int i2;
        com.bytedance.sdk.openadsdk.VzQ.bg.bg.ldr ldrVar;
        com.bytedance.sdk.openadsdk.VzQ.bg.bg.ldr ldrVar2;
        com.bytedance.sdk.openadsdk.core.IL.bg bgVar;
        java.lang.String str3 = this.Uq ? "embeded_ad" : "embeded_ad_landingpage";
        if (this.JAA.fE()) {
            str2 = "rewarded_video";
            i2 = 7;
        } else {
            if (!this.JAA.aMs()) {
                if (this.JAA.IE()) {
                    str2 = "banner_ad";
                    i2 = 2;
                } else {
                    str = str3;
                    i = 1;
                }
                if (this.JAA.jz() == 4) {
                    this.aGH = com.bytedance.sdk.openadsdk.VzQ.bg.bg.iR.bg(this.Ja, this.JAA, str);
                }
                com.bytedance.sdk.openadsdk.core.IL.bg bgVar2 = new com.bytedance.sdk.openadsdk.core.IL.bg(this.Ja, this.JAA, str, i);
                this.VJ = bgVar2;
                bgVar2.bg(this);
                this.VJ.IL(true);
                if (this.Uq) {
                    this.VJ.bg(true);
                } else {
                    this.VJ.bg(false);
                    this.VJ.bX(true);
                }
                this.VJ.bg(this.VW);
                this.VJ.eqN(true);
                this.VJ.bg(new com.bytedance.sdk.openadsdk.core.IL.IL.bg() { // from class: com.bytedance.sdk.openadsdk.core.Ta.IL.zx.1
                    @Override // com.bytedance.sdk.openadsdk.core.IL.IL.bg
                    public void bg(android.view.View view, int i3) {
                        if (com.bytedance.sdk.openadsdk.core.Ta.IL.zx.this.ZQc != null) {
                            com.bytedance.sdk.openadsdk.core.Ta.IL.zx.this.ZQc.bg(view, i3);
                        }
                    }
                });
                ldrVar = this.aGH;
                if (ldrVar != null && (bgVar = this.VJ) != null) {
                    bgVar.bg(ldrVar);
                }
                if (JAA()) {
                    com.bytedance.sdk.openadsdk.core.IL.bg bgVar3 = new com.bytedance.sdk.openadsdk.core.IL.bg(this.Ja, this.JAA, str, i) { // from class: com.bytedance.sdk.openadsdk.core.Ta.IL.zx.2
                        @Override // com.bytedance.sdk.openadsdk.core.IL.bg
                        public boolean IL() {
                            boolean zBg = com.bytedance.sdk.openadsdk.core.Ta.IL.zx.this.Uw != null ? com.bytedance.sdk.openadsdk.core.Ta.IL.zx.this.Uw.bg() : false;
                            com.bytedance.sdk.openadsdk.core.Ta.IL.zx.this.zx.getVisibility();
                            return zBg || com.bytedance.sdk.openadsdk.core.Ta.IL.zx.this.zx.getVisibility() == 0;
                        }

                        @Override // com.bytedance.sdk.openadsdk.core.IL.bg
                        public boolean bX() {
                            if (com.bytedance.sdk.openadsdk.core.Ta.IL.zx.this.eo != null && com.bytedance.sdk.openadsdk.core.Ta.IL.zx.this.eo.getVisibility() == 0) {
                                return true;
                            }
                            if (com.bytedance.sdk.openadsdk.core.Ta.IL.zx.this.PX != null && com.bytedance.sdk.openadsdk.core.Ta.IL.zx.this.PX.getVisibility() == 0) {
                                return true;
                            }
                            if (com.bytedance.sdk.openadsdk.core.Ta.IL.zx.this.Ta == null || com.bytedance.sdk.openadsdk.core.Ta.IL.zx.this.Ta.getVisibility() != 0) {
                                return com.bytedance.sdk.openadsdk.core.Ta.IL.zx.this.yDt != null && com.bytedance.sdk.openadsdk.core.Ta.IL.zx.this.yDt.getVisibility() == 0;
                            }
                            return true;
                        }
                    };
                    this.daV = bgVar3;
                    bgVar3.bg(new com.bytedance.sdk.openadsdk.core.IL.IL.bg() { // from class: com.bytedance.sdk.openadsdk.core.Ta.IL.zx.3
                        @Override // com.bytedance.sdk.openadsdk.core.IL.IL.bg
                        public void bg(android.view.View view, int i3) {
                            if (com.bytedance.sdk.openadsdk.core.Ta.IL.zx.this.ZQc != null) {
                                com.bytedance.sdk.openadsdk.core.Ta.IL.zx.this.ZQc.bg(view, i3);
                            }
                        }
                    });
                    this.daV.IL(true);
                    this.daV.bg(this.Uq);
                    this.daV.bg(this.VW);
                    this.daV.eqN(true);
                    ldrVar2 = this.aGH;
                    if (ldrVar2 != null) {
                        this.daV.bg(ldrVar2);
                    }
                    this.daV.bg(this);
                }
            }
            str2 = "fullscreen_interstitial_ad";
            i2 = 5;
        }
        str = str2;
        i = i2;
        if (this.JAA.jz() == 4) {
            this.aGH = com.bytedance.sdk.openadsdk.VzQ.bg.bg.iR.bg(this.Ja, this.JAA, str);
        }
        com.bytedance.sdk.openadsdk.core.IL.bg bgVar4 = new com.bytedance.sdk.openadsdk.core.IL.bg(this.Ja, this.JAA, str, i);
        this.VJ = bgVar4;
        bgVar4.bg(this);
        this.VJ.IL(true);
        if (this.Uq) {
            this.VJ.bg(true);
        } else {
            this.VJ.bg(false);
            this.VJ.bX(true);
        }
        this.VJ.bg(this.VW);
        this.VJ.eqN(true);
        this.VJ.bg(new com.bytedance.sdk.openadsdk.core.IL.IL.bg() { // from class: com.bytedance.sdk.openadsdk.core.Ta.IL.zx.1
            @Override // com.bytedance.sdk.openadsdk.core.IL.IL.bg
            public void bg(android.view.View view, int i3) {
                if (com.bytedance.sdk.openadsdk.core.Ta.IL.zx.this.ZQc != null) {
                    com.bytedance.sdk.openadsdk.core.Ta.IL.zx.this.ZQc.bg(view, i3);
                }
            }
        });
        ldrVar = this.aGH;
        if (ldrVar != null) {
            bgVar.bg(ldrVar);
        }
        if (JAA()) {
            com.bytedance.sdk.openadsdk.core.IL.bg bgVar5 = new com.bytedance.sdk.openadsdk.core.IL.bg(this.Ja, this.JAA, str, i) { // from class: com.bytedance.sdk.openadsdk.core.Ta.IL.zx.2
                @Override // com.bytedance.sdk.openadsdk.core.IL.bg
                public boolean IL() {
                    boolean zBg = com.bytedance.sdk.openadsdk.core.Ta.IL.zx.this.Uw != null ? com.bytedance.sdk.openadsdk.core.Ta.IL.zx.this.Uw.bg() : false;
                    com.bytedance.sdk.openadsdk.core.Ta.IL.zx.this.zx.getVisibility();
                    return zBg || com.bytedance.sdk.openadsdk.core.Ta.IL.zx.this.zx.getVisibility() == 0;
                }

                @Override // com.bytedance.sdk.openadsdk.core.IL.bg
                public boolean bX() {
                    if (com.bytedance.sdk.openadsdk.core.Ta.IL.zx.this.eo != null && com.bytedance.sdk.openadsdk.core.Ta.IL.zx.this.eo.getVisibility() == 0) {
                        return true;
                    }
                    if (com.bytedance.sdk.openadsdk.core.Ta.IL.zx.this.PX != null && com.bytedance.sdk.openadsdk.core.Ta.IL.zx.this.PX.getVisibility() == 0) {
                        return true;
                    }
                    if (com.bytedance.sdk.openadsdk.core.Ta.IL.zx.this.Ta == null || com.bytedance.sdk.openadsdk.core.Ta.IL.zx.this.Ta.getVisibility() != 0) {
                        return com.bytedance.sdk.openadsdk.core.Ta.IL.zx.this.yDt != null && com.bytedance.sdk.openadsdk.core.Ta.IL.zx.this.yDt.getVisibility() == 0;
                    }
                    return true;
                }
            };
            this.daV = bgVar5;
            bgVar5.bg(new com.bytedance.sdk.openadsdk.core.IL.IL.bg() { // from class: com.bytedance.sdk.openadsdk.core.Ta.IL.zx.3
                @Override // com.bytedance.sdk.openadsdk.core.IL.IL.bg
                public void bg(android.view.View view, int i3) {
                    if (com.bytedance.sdk.openadsdk.core.Ta.IL.zx.this.ZQc != null) {
                        com.bytedance.sdk.openadsdk.core.Ta.IL.zx.this.ZQc.bg(view, i3);
                    }
                }
            });
            this.daV.IL(true);
            this.daV.bg(this.Uq);
            this.daV.bg(this.VW);
            this.daV.eqN(true);
            ldrVar2 = this.aGH;
            if (ldrVar2 != null) {
                this.daV.bg(ldrVar2);
            }
            this.daV.bg(this);
        }
    }

    private boolean JAA() {
        return com.bytedance.sdk.openadsdk.core.model.tuV.zx(this.JAA) && (!com.bytedance.sdk.openadsdk.core.VB.bX.bg(this.JAA.JAA()) ? this.JAA.LKE() == null : this.JAA.uu() == null) && this.JAA.kMt() == 1;
    }

    public void bg(com.bytedance.sdk.openadsdk.core.Ta.IL.ldr.bg bgVar) {
        this.ZQc = bgVar;
    }

    public void bg(com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd pAGNativeAd) {
        com.bytedance.sdk.openadsdk.core.IL.bg bgVar = this.VJ;
        if (bgVar != null) {
            bgVar.bg(pAGNativeAd);
        }
        com.bytedance.sdk.openadsdk.core.IL.bg bgVar2 = this.daV;
        if (bgVar2 != null) {
            bgVar2.bg(pAGNativeAd);
        }
    }

    public com.bykv.vk.openvk.bg.bg.bg.ldr.IL Ta() {
        return this.eqN;
    }

    /* JADX WARN: Multi-variable type inference failed */
    void bg(android.content.Context context, android.view.View view) {
        android.view.View bXVar;
        java.lang.System.currentTimeMillis();
        com.bytedance.sdk.openadsdk.core.model.tuV tuv = this.JAA;
        if ((tuv == null || ((!tuv.Vm() && !this.JAA.IE()) || com.bytedance.sdk.openadsdk.core.settings.xxp.zU().rgo())) && view != null) {
            view.setKeepScreenOn(true);
        }
        com.bykv.vk.openvk.bg.bg.bg.eqN.bX bXVar2 = this.VW;
        if (bXVar2 != null && bXVar2.xxp()) {
            bXVar = new com.bykv.vk.openvk.bg.bg.bg.ldr.eqN(this.Ja);
        } else {
            bXVar = new com.bykv.vk.openvk.bg.bg.bg.ldr.bX(this.Ja);
        }
        if (view instanceof android.widget.RelativeLayout) {
            android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(13);
            ((android.widget.RelativeLayout) view).addView(bXVar, 0, layoutParams);
        }
        com.bytedance.sdk.openadsdk.utils.ZQc.bg(bXVar, 8);
        this.eqN = (com.bykv.vk.openvk.bg.bg.bg.ldr.IL) bXVar;
        this.zx = (android.widget.ImageView) view.findViewById(com.bytedance.sdk.openadsdk.utils.Ta.yda);
        this.ldr = view.findViewById(com.bytedance.sdk.openadsdk.utils.Ta.uny);
        this.iR = view.findViewById(com.bytedance.sdk.openadsdk.utils.Ta.KRc);
        this.Kg = (android.widget.ImageView) view.findViewById(com.bytedance.sdk.openadsdk.utils.Ta.JxS);
        this.WR = view.findViewById(com.bytedance.sdk.openadsdk.utils.Ta.ovC);
        java.lang.System.currentTimeMillis();
    }

    void bg(android.view.View view, android.content.Context context) {
        android.view.View view2;
        if (view == null || context == null || (view2 = this.WR) == null || view2.getParent() == null || this.eo != null) {
            return;
        }
        this.eo = this.WR;
        this.VB = (android.widget.ImageView) view.findViewById(com.bytedance.sdk.openadsdk.utils.Ta.zU);
        this.PX = view.findViewById(com.bytedance.sdk.openadsdk.utils.Ta.ews);
        this.Ta = (com.bytedance.sdk.openadsdk.core.widget.bg) view.findViewById(com.bytedance.sdk.openadsdk.utils.Ta.qC);
        this.yDt = (android.widget.TextView) view.findViewById(com.bytedance.sdk.openadsdk.utils.Ta.Dxa);
        this.Lq = (android.widget.TextView) view.findViewById(com.bytedance.sdk.openadsdk.utils.Ta.bN);
        this.vb = (android.widget.TextView) view.findViewById(com.bytedance.sdk.openadsdk.utils.Ta.jz);
    }

    void yDt() {
        if (this.DDQ == null || this.Uw != null) {
            return;
        }
        java.lang.System.currentTimeMillis();
        com.bytedance.sdk.openadsdk.core.widget.Fy fy = new com.bytedance.sdk.openadsdk.core.widget.Fy();
        this.Uw = fy;
        fy.bg(this.Ja, this.bX);
        this.Uw.bg(this.DDQ, this);
        java.lang.System.currentTimeMillis();
    }

    public boolean bg(int i, com.bykv.vk.openvk.bg.bg.bg.bX.IL il, boolean z) {
        com.bytedance.sdk.openadsdk.core.widget.Fy fy = this.Uw;
        return fy == null || fy.bg(i, il, z);
    }

    public void Lq() {
        com.bytedance.sdk.openadsdk.core.widget.Fy fy = this.Uw;
        if (fy != null) {
            fy.bg(false);
        }
    }

    public void bg(com.bykv.vk.openvk.bg.bg.bg.eqN.bg bgVar) {
        if (bgVar instanceof com.bytedance.sdk.openadsdk.core.Ta.IL.bg) {
            this.DDQ = (com.bytedance.sdk.openadsdk.core.Ta.IL.bg) bgVar;
            yDt();
        }
    }

    boolean vb() {
        if (this.DDQ != null) {
            return true;
        }
        com.bytedance.sdk.component.utils.PX.bg("NewLiveViewLayout", "callback is null");
        return false;
    }

    void eqN() {
        this.eqN.bg(this);
        this.zx.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.Ta.IL.zx.4
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view) {
                if (com.bytedance.sdk.openadsdk.core.Ta.IL.zx.this.vb()) {
                    if (com.bytedance.sdk.openadsdk.core.Ta.IL.zx.this.vb == null || com.bytedance.sdk.openadsdk.core.Ta.IL.zx.this.vb.getVisibility() != 0) {
                        com.bytedance.sdk.openadsdk.core.Ta.IL.zx.this.DDQ.bg(com.bytedance.sdk.openadsdk.core.Ta.IL.zx.this, view);
                    }
                }
            }
        });
    }

    public void bX(int i) {
        com.bytedance.sdk.openadsdk.utils.ZQc.bg((android.view.View) this.bX, 0);
        com.bykv.vk.openvk.bg.bg.bg.ldr.IL il = this.eqN;
        if (il != null) {
            il.setVisibility(i);
        }
    }

    public void eqN(boolean z) {
        this.Uq = z;
        if (z) {
            com.bytedance.sdk.openadsdk.core.IL.bg bgVar = this.VJ;
            if (bgVar != null) {
                bgVar.bg(true);
            }
            com.bytedance.sdk.openadsdk.core.IL.bg bgVar2 = this.daV;
            if (bgVar2 != null) {
                bgVar2.bg(true);
                return;
            }
            return;
        }
        com.bytedance.sdk.openadsdk.core.IL.bg bgVar3 = this.VJ;
        if (bgVar3 != null) {
            bgVar3.bg(false);
        }
        com.bytedance.sdk.openadsdk.core.IL.bg bgVar4 = this.daV;
        if (bgVar4 != null) {
            bgVar4.bg(false);
        }
    }

    public void bg(int i, int i2) {
        if (i == -1) {
            i = com.bytedance.sdk.openadsdk.utils.ZQc.bX(this.Ja);
        }
        if (i <= 0) {
            return;
        }
        this.xxp = i;
        if (LZ() || eo() || (this.kMt & 8) == 8) {
            this.VzQ = i2;
        } else {
            this.VzQ = zx(i);
        }
        IL(this.xxp, this.VzQ);
    }

    public void IL(boolean z, boolean z2) {
        android.widget.ImageView imageView = this.zx;
        if (imageView != null) {
            if (z) {
                imageView.setImageDrawable(com.bytedance.sdk.openadsdk.utils.Kg.bg(this.Ja, "tt_play_movebar_textpage"));
            } else {
                imageView.setImageDrawable(com.bytedance.sdk.openadsdk.utils.Kg.bg(this.Ja, "tt_stop_movebar_textpage"));
            }
        }
    }

    public void IL(int i, int i2) {
        android.view.ViewGroup.LayoutParams layoutParams = this.bX.getLayoutParams();
        if (i == -1 || i == -2 || i > 0) {
            layoutParams.width = i;
        }
        if (i2 == -1 || i2 == -2 || i2 > 0) {
            layoutParams.height = i2;
        }
        this.bX.setLayoutParams(layoutParams);
    }

    private int zx(int i) {
        if (this.tuV <= 0 || this.Fy <= 0) {
            return 0;
        }
        int iBX = com.bytedance.sdk.openadsdk.utils.ZQc.bX(this.Ja, 228.0f);
        int iBX2 = com.bytedance.sdk.openadsdk.utils.ZQc.bX(this.Ja, 160.0f);
        int i2 = (int) (this.Fy * ((i * 1.0f) / this.tuV));
        if (i2 > iBX) {
            return iBX;
        }
        return i2 < iBX2 ? iBX2 : i2;
    }

    public void bX(int i, int i2) {
        this.tuV = i;
        this.Fy = i2;
    }

    public void bX(android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            return;
        }
        if (this.bX.getParent() == null) {
            viewGroup.addView(this.bX);
        }
        eqN(0);
    }

    @Override // com.bykv.vk.openvk.bg.bg.bg.eqN.IL
    public android.view.View bX() {
        return this.bX;
    }

    public void iR() {
        com.bytedance.sdk.openadsdk.core.model.tuV tuv;
        com.bytedance.sdk.openadsdk.utils.ZQc.ldr(this.ldr);
        com.bytedance.sdk.openadsdk.utils.ZQc.ldr(this.iR);
        if (this.Kg != null && (tuv = this.JAA) != null && tuv.Dxa() != null && this.JAA.Dxa().eo() != null) {
            com.bytedance.sdk.openadsdk.utils.ZQc.ldr(this.Kg);
            com.bytedance.sdk.openadsdk.xxp.bX.bg().bg(this.JAA.Dxa().eo(), this.JAA.Dxa().bX(), this.JAA.Dxa().IL(), this.Kg, this.JAA);
        }
        if (this.zx.getVisibility() == 0) {
            com.bytedance.sdk.openadsdk.utils.ZQc.bg((android.view.View) this.zx, 8);
        }
    }

    public void xxp() {
        com.bytedance.sdk.openadsdk.utils.ZQc.ldr(this.ldr);
        com.bytedance.sdk.openadsdk.utils.ZQc.ldr(this.iR);
        if (this.zx.getVisibility() == 0) {
            com.bytedance.sdk.openadsdk.utils.ZQc.bg((android.view.View) this.zx, 8);
        }
    }

    @Override // com.bykv.vk.openvk.bg.bg.bg.eqN.IL
    public void bg() {
        bg(false, this.LZ);
        tuV();
    }

    public void VzQ() {
        com.bytedance.sdk.openadsdk.utils.ZQc.bg((android.view.View) this.bX, 0);
        com.bykv.vk.openvk.bg.bg.bg.ldr.IL il = this.eqN;
        if (il != null) {
            com.bytedance.sdk.openadsdk.utils.ZQc.bg(il.getView(), 0);
        }
    }

    void tuV() {
        try {
            com.bytedance.sdk.openadsdk.utils.ZQc.bg(this.eo, 8);
            com.bytedance.sdk.openadsdk.utils.ZQc.bg((android.view.View) this.VB, 8);
            com.bytedance.sdk.openadsdk.utils.ZQc.bg(this.PX, 8);
            com.bytedance.sdk.openadsdk.utils.ZQc.bg((android.view.View) this.Ta, 8);
            com.bytedance.sdk.openadsdk.utils.ZQc.bg((android.view.View) this.yDt, 8);
            com.bytedance.sdk.openadsdk.utils.ZQc.bg((android.view.View) this.Lq, 8);
            com.bytedance.sdk.openadsdk.utils.ZQc.bg((android.view.View) this.vb, 8);
        } catch (java.lang.Exception unused) {
        }
    }

    public void Fy() {
        android.widget.ImageView imageView = this.VB;
        if (imageView != null) {
            imageView.setImageBitmap(null);
        }
        com.bytedance.sdk.openadsdk.core.widget.bg bgVar = this.Ta;
        if (bgVar != null) {
            bgVar.setImageBitmap(null);
        }
    }

    private void ldr(int i) {
        com.bytedance.sdk.openadsdk.utils.ZQc.bg(this.PX, i);
    }

    @Override // com.bykv.vk.openvk.bg.bg.bg.eqN.IL
    public void bg(boolean z) {
        this.ayS = z;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Code duplicated, block: B:92:0x0218  */
    public void bg(final com.bytedance.sdk.openadsdk.core.model.tuV tuv, java.lang.ref.WeakReference<android.content.Context> weakReference, boolean z) {
        java.lang.String strCZH;
        com.bytedance.sdk.openadsdk.core.model.tuV tuv2;
        com.bytedance.sdk.openadsdk.core.model.tuV tuv3;
        if (tuv == null) {
            return;
        }
        bg(false, this.LZ);
        bg(this.bX, com.bytedance.sdk.openadsdk.core.VzQ.bg());
        android.view.View view = this.eo;
        if (view != null) {
            com.bytedance.sdk.openadsdk.utils.ZQc.bg(view, 0);
        }
        android.widget.ImageView imageView = this.VB;
        if (imageView != null) {
            com.bytedance.sdk.openadsdk.utils.ZQc.bg((android.view.View) imageView, 0);
        }
        com.bytedance.sdk.openadsdk.utils.ZQc.bg(this.PX, 0);
        if (this.VB != null && (tuv3 = this.JAA) != null && tuv3.Dxa() != null && this.JAA.Dxa().eo() != null) {
            com.bytedance.sdk.openadsdk.xxp.bX.bg().bg(this.JAA.Dxa().eo(), this.JAA.Dxa().bX(), this.JAA.Dxa().IL(), this.VB, tuv);
        }
        if (!android.text.TextUtils.isEmpty(tuv.bN())) {
            strCZH = tuv.bN();
        } else if (!android.text.TextUtils.isEmpty(tuv.wS())) {
            strCZH = tuv.wS();
        } else {
            strCZH = !android.text.TextUtils.isEmpty(tuv.cZH()) ? tuv.cZH() : "";
        }
        if (this.Ta != null && (tuv2 = this.JAA) != null && tuv2.sVc() != null && this.JAA.sVc().bg() != null) {
            com.bytedance.sdk.openadsdk.utils.ZQc.bg((android.view.View) this.Ta, 0);
            com.bytedance.sdk.openadsdk.utils.ZQc.bg((android.view.View) this.yDt, 4);
            com.bytedance.sdk.openadsdk.core.model.tuV tuv4 = this.JAA;
            if (tuv4 != null && tuv4.HXG()) {
                com.bytedance.sdk.openadsdk.WR.eqN.bg(this.JAA.sVc()).bX(2).bg(new com.bytedance.sdk.openadsdk.WR.IL(tuv, this.JAA.sVc().bg(), new com.bytedance.sdk.component.zx.xxp<android.graphics.Bitmap>() { // from class: com.bytedance.sdk.openadsdk.core.Ta.IL.zx.5
                    @Override // com.bytedance.sdk.component.zx.xxp
                    public void bg(com.bytedance.sdk.component.zx.VB<android.graphics.Bitmap> vb) {
                        if (vb == null || vb.IL() == null) {
                            return;
                        }
                        if (com.bytedance.sdk.openadsdk.core.Ta.IL.zx.this.Ta != null) {
                            com.bytedance.sdk.openadsdk.core.Ta.IL.zx.this.Ta.setImageBitmap(vb.IL());
                        }
                        com.bytedance.sdk.openadsdk.eqN.bX.IL(com.bytedance.sdk.openadsdk.core.Ta.IL.zx.this.JAA, com.bytedance.sdk.openadsdk.core.Ta.IL.zx.this.JAA != null ? com.bytedance.sdk.openadsdk.utils.ayS.bX(tuv.Fx()) : null, "load_vast_icon_success", (org.json.JSONObject) null);
                    }

                    @Override // com.bytedance.sdk.component.zx.xxp
                    public void bg(int i, java.lang.String str, java.lang.Throwable th) {
                        com.bytedance.sdk.openadsdk.core.Ta.IL.zx.this.bg(i, str, tuv);
                    }
                }));
                if (this.JAA.hi() != null && this.JAA.hi().IL() != null) {
                    this.JAA.hi().IL().IL(0L);
                }
            } else {
                com.bytedance.sdk.openadsdk.xxp.bX.bg().bg(this.JAA.sVc(), this.Ta, tuv);
            }
            com.bytedance.sdk.openadsdk.core.model.tuV tuv5 = this.JAA;
            if (tuv5 != null && tuv5.HXG()) {
                try {
                    this.Ta.setTag(570425345, "VAST_ICON");
                } catch (java.lang.Throwable unused) {
                }
            }
            com.bytedance.sdk.openadsdk.core.model.tuV tuv6 = this.JAA;
            if (tuv6 != null && tuv6.hi() != null && this.JAA.hi().IL() != null) {
                final com.bytedance.sdk.openadsdk.core.PX.IL IL = this.JAA.hi().IL();
                com.bytedance.sdk.openadsdk.core.widget.bg bgVar = this.Ta;
                if (bgVar != null) {
                    bgVar.post(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.core.Ta.IL.zx.6
                        @Override // java.lang.Runnable
                        public void run() {
                            com.bytedance.sdk.openadsdk.core.PX.IL il;
                            if (com.bytedance.sdk.openadsdk.core.Ta.IL.zx.this.Ta == null || !com.bytedance.sdk.openadsdk.core.Ta.IL.zx.this.Ta.isShown() || (il = IL) == null) {
                                return;
                            }
                            il.IL(com.bytedance.sdk.openadsdk.core.Ta.IL.zx.this.getVideoProgress());
                        }
                    });
                }
            }
            if (JAA()) {
                this.Ta.setOnClickListener(this.daV);
                this.Ta.setOnTouchListener(this.daV);
            } else {
                this.Ta.setOnClickListener(this.VJ);
                this.Ta.setOnTouchListener(this.VJ);
            }
        } else if (!android.text.TextUtils.isEmpty(strCZH)) {
            com.bytedance.sdk.openadsdk.utils.ZQc.bg((android.view.View) this.Ta, 4);
            com.bytedance.sdk.openadsdk.utils.ZQc.bg((android.view.View) this.yDt, 0);
            android.widget.TextView textView = this.yDt;
            if (textView != null) {
                textView.setText(strCZH.substring(0, 1));
                if (JAA()) {
                    this.yDt.setOnClickListener(this.daV);
                    this.yDt.setOnTouchListener(this.daV);
                } else {
                    this.yDt.setOnClickListener(this.VJ);
                    this.yDt.setOnTouchListener(this.VJ);
                }
            }
        }
        if (this.Lq != null && !android.text.TextUtils.isEmpty(strCZH)) {
            this.Lq.setText(strCZH);
            this.Lq.setTag(570425345, "VAST_TITLE");
        }
        com.bytedance.sdk.openadsdk.utils.ZQc.bg((android.view.View) this.Lq, 0);
        com.bytedance.sdk.openadsdk.utils.ZQc.bg((android.view.View) this.vb, 0);
        java.lang.String strZCS = tuv.zCS();
        if (android.text.TextUtils.isEmpty(strZCS)) {
            int iJz = tuv.jz();
            if (iJz == 2 || iJz == 3) {
                strZCS = com.bytedance.sdk.component.utils.Fy.bg(this.Ja, "tt_video_mobile_go_detail");
            } else if (iJz == 4) {
                strZCS = com.bytedance.sdk.component.utils.Fy.bg(this.Ja, "tt_video_download_apk");
            } else if (iJz == 5) {
                strZCS = com.bytedance.sdk.component.utils.Fy.bg(this.Ja, "tt_video_dial_phone");
            } else if (iJz == 8) {
                strZCS = com.bytedance.sdk.component.utils.Fy.bg(this.Ja, "tt_video_mobile_go_detail");
            } else {
                strZCS = com.bytedance.sdk.component.utils.Fy.bg(this.Ja, "tt_video_mobile_go_detail");
            }
        }
        android.widget.TextView textView2 = this.vb;
        if (textView2 != null) {
            textView2.setText(strZCS);
            this.vb.setOnClickListener(this.VJ);
            this.vb.setOnTouchListener(this.VJ);
        }
        if (this.ayS) {
            return;
        }
        ldr(4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bg(final int i, final java.lang.String str, final com.bytedance.sdk.openadsdk.core.model.tuV tuv) {
        com.bytedance.sdk.openadsdk.eqN.bX.bg(new com.bytedance.sdk.component.Kg.Kg("load_vast_icon_fail") { // from class: com.bytedance.sdk.openadsdk.core.Ta.IL.zx.7
            @Override // java.lang.Runnable
            public void run() {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                try {
                    jSONObject.put("error_code", i);
                    jSONObject.put("description", i + ":" + str);
                    jSONObject.put("url", com.bytedance.sdk.openadsdk.core.Ta.IL.zx.this.JAA.sVc().bg());
                } catch (java.lang.Throwable unused) {
                }
                com.bytedance.sdk.openadsdk.eqN.bX.IL(com.bytedance.sdk.openadsdk.core.Ta.IL.zx.this.JAA, com.bytedance.sdk.openadsdk.core.Ta.IL.zx.this.JAA != null ? com.bytedance.sdk.openadsdk.utils.ayS.bX(tuv.Fx()) : null, "load_vast_icon_fail", jSONObject);
            }
        });
    }

    @Override // com.bykv.vk.openvk.bg.bg.bg.eqN.IL
    public void IL() {
        com.bytedance.sdk.openadsdk.utils.ZQc.zx(this.ldr);
        com.bytedance.sdk.openadsdk.utils.ZQc.zx(this.iR);
        android.widget.ImageView imageView = this.Kg;
        if (imageView != null) {
            com.bytedance.sdk.openadsdk.utils.ZQc.zx(imageView);
        }
    }

    public void Kg() {
        com.bytedance.sdk.openadsdk.utils.ZQc.zx(this.ldr);
    }

    @Override // com.bykv.vk.openvk.bg.bg.bg.ldr.bg
    public void bg(android.view.SurfaceHolder surfaceHolder) {
        if (surfaceHolder != this.eqN.getHolder()) {
            return;
        }
        this.tC = true;
        if (vb()) {
            this.DDQ.bg(this, surfaceHolder);
        }
    }

    @Override // com.bykv.vk.openvk.bg.bg.bg.ldr.bg
    public void bg(android.view.SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        if (surfaceHolder != this.eqN.getHolder()) {
            return;
        }
        vb();
    }

    @Override // com.bykv.vk.openvk.bg.bg.bg.ldr.bg
    public void IL(android.view.SurfaceHolder surfaceHolder) {
        if (surfaceHolder != this.eqN.getHolder()) {
            return;
        }
        this.tC = false;
        if (vb()) {
            this.DDQ.IL(this, surfaceHolder);
        }
    }

    @Override // com.bykv.vk.openvk.bg.bg.bg.ldr.bg
    public void bg(android.graphics.SurfaceTexture surfaceTexture, int i, int i2) {
        this.tC = true;
        if (vb()) {
            this.DDQ.bg(this, surfaceTexture);
        }
    }

    @Override // com.bykv.vk.openvk.bg.bg.bg.ldr.bg
    public boolean bg(android.graphics.SurfaceTexture surfaceTexture) {
        this.tC = false;
        if (!vb()) {
            return true;
        }
        this.DDQ.IL(this, surfaceTexture);
        return true;
    }

    public void WR() {
        eqN(8);
        if (kMt()) {
            this.eqN.setVisibility(8);
        }
        android.widget.ImageView imageView = this.Kg;
        if (imageView != null) {
            imageView.setImageDrawable(null);
        }
        eqN(8);
        com.bytedance.sdk.openadsdk.utils.ZQc.bg(this.eo, 8);
        com.bytedance.sdk.openadsdk.utils.ZQc.bg((android.view.View) this.VB, 8);
        com.bytedance.sdk.openadsdk.utils.ZQc.bg(this.PX, 8);
        com.bytedance.sdk.openadsdk.utils.ZQc.bg((android.view.View) this.Ta, 8);
        com.bytedance.sdk.openadsdk.utils.ZQc.bg((android.view.View) this.yDt, 8);
        com.bytedance.sdk.openadsdk.utils.ZQc.bg((android.view.View) this.Lq, 8);
        com.bytedance.sdk.openadsdk.core.widget.Fy fy = this.Uw;
        if (fy != null) {
            fy.bg(true);
        }
    }

    public boolean LZ() {
        return this.LZ;
    }

    public void bg(boolean z, boolean z2, boolean z3) {
        com.bytedance.sdk.openadsdk.utils.ZQc.bg((android.view.View) this.zx, (!z || this.ldr.getVisibility() == 0) ? 8 : 0);
    }

    public void bg(boolean z, boolean z2) {
        com.bytedance.sdk.openadsdk.utils.ZQc.bg((android.view.View) this.zx, 8);
    }

    public void VB() {
        bg(true, false);
    }

    public boolean tC() {
        return this.tC;
    }

    public void eqN(int i) {
        this.rri = i;
        com.bytedance.sdk.openadsdk.utils.ZQc.bg((android.view.View) this.bX, i);
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.tuV.bg
    public boolean rri() {
        com.bytedance.sdk.openadsdk.core.widget.Fy fy = this.Uw;
        return fy != null && fy.bg();
    }

    boolean kMt() {
        return (this.kMt & 4) != 4 || this.LZ;
    }

    @Override // com.bykv.vk.openvk.bg.bg.bg.eqN.IL
    public void bg(android.graphics.drawable.Drawable drawable) {
        android.view.ViewGroup viewGroup = this.bX;
        if (viewGroup != null) {
            viewGroup.setBackgroundDrawable(drawable);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.IL.bg.InterfaceC0132bg
    public long getVideoProgress() {
        if (this.LKE <= 0) {
            com.bytedance.sdk.openadsdk.core.model.tuV tuv = this.JAA;
            if (tuv != null && tuv.Dxa() != null) {
                this.LKE = (long) (this.JAA.Dxa().ldr() * 1000.0d);
            }
            com.bykv.vk.openvk.bg.bg.bg.eqN.bX bXVar = this.VW;
            if (bXVar != null) {
                this.LKE = bXVar.Kg();
            }
        }
        return this.LKE;
    }
}
