package com.bytedance.sdk.openadsdk.core.Ta.IL;

/* JADX INFO: loaded from: classes4.dex */
public class eqN extends com.bytedance.sdk.openadsdk.core.Ta.IL.zx {
    private android.widget.TextView ApA;
    private android.view.View CQc;
    private float Dt;
    private android.widget.TextView Dxa;
    private final android.graphics.Rect FFy;
    private boolean GZ;
    private android.widget.TextView GvG;
    private android.widget.ImageView LKE;
    private int Ld;
    private final android.graphics.Rect Ny;
    private android.widget.ImageView Pae;
    private final android.view.View.OnTouchListener RFq;
    private android.widget.TextView RJ;
    private android.content.res.ColorStateList RiO;
    private int Ys;
    private android.widget.TextView ZQc;
    private float ZTq;
    private android.content.res.ColorStateList ZyO;
    private boolean bCU;
    private android.widget.ImageView bN;
    private int bOf;
    private int cZH;
    private final android.graphics.Rect dS;
    private final com.bytedance.sdk.openadsdk.core.widget.tuV eDa;
    private final android.graphics.Rect gCm;
    private final com.bytedance.sdk.component.utils.JAA gXn;
    private android.content.res.ColorStateList hff;
    private float huT;
    private float jA;
    private final android.graphics.Rect jf;
    private android.view.View jz;
    private final int kU;
    private android.widget.ImageView lM;
    private android.widget.TextView qC;
    private final int qp;
    private android.widget.SeekBar sVc;
    private android.view.View txA;
    private android.widget.TextView uu;
    private int wS;
    private float xFs;
    private int zCS;

    @Override // com.bytedance.sdk.openadsdk.core.Ta.IL.zx, com.bykv.vk.openvk.bg.bg.bg.eqN.IL
    public /* bridge */ /* synthetic */ void bg(com.bytedance.sdk.openadsdk.core.model.tuV tuv, java.lang.ref.WeakReference weakReference, boolean z) {
        bg(tuv, (java.lang.ref.WeakReference<android.content.Context>) weakReference, z);
    }

    public eqN(android.content.Context context, android.view.ViewGroup viewGroup, boolean z, int i, com.bytedance.sdk.openadsdk.core.model.tuV tuv, com.bykv.vk.openvk.bg.bg.bg.eqN.bX bXVar, boolean z2) {
        super(context, viewGroup, z, i, tuv, bXVar, z2);
        this.gXn = new com.bytedance.sdk.component.utils.JAA(this);
        this.GZ = false;
        this.bCU = false;
        this.Ld = 0;
        this.wS = 0;
        this.cZH = 0;
        this.zCS = 0;
        this.Ys = 0;
        this.dS = new android.graphics.Rect();
        this.Ny = new android.graphics.Rect();
        this.bOf = 0;
        this.RFq = new android.view.View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.core.Ta.IL.eqN.7
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked == 2) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                } else if (actionMasked == 3) {
                    view.getParent().requestDisallowInterceptTouchEvent(false);
                }
                return false;
            }
        };
        this.jf = new android.graphics.Rect();
        this.gCm = new android.graphics.Rect();
        this.FFy = new android.graphics.Rect();
        this.Ja = com.bytedance.sdk.openadsdk.core.VzQ.bg().getApplicationContext();
        eqN(z2);
        this.bX = viewGroup;
        this.LZ = z;
        com.bytedance.sdk.openadsdk.core.widget.tuV tuv2 = new com.bytedance.sdk.openadsdk.core.widget.tuV(this);
        this.eDa = tuv2;
        tuv2.bg(this.LZ);
        android.util.DisplayMetrics displayMetrics = this.Ja.getResources().getDisplayMetrics();
        this.kU = displayMetrics.widthPixels;
        this.qp = displayMetrics.heightPixels;
        this.kMt = i;
        this.VW = bXVar;
        this.JAA = tuv;
        eqN(8);
        bg(context, this.bX);
        eqN();
        PX();
    }

    @Override // com.bytedance.sdk.openadsdk.core.Ta.IL.zx
    protected void bg(android.content.Context context, android.view.View view) {
        super.bg(context, view);
        this.ZQc = (android.widget.TextView) view.findViewById(com.bytedance.sdk.openadsdk.utils.Ta.fE);
        this.LKE = (android.widget.ImageView) view.findViewById(com.bytedance.sdk.openadsdk.utils.Ta.uV);
        this.CQc = view.findViewById(com.bytedance.sdk.openadsdk.utils.Ta.wq);
        this.bN = (android.widget.ImageView) view.findViewById(com.bytedance.sdk.openadsdk.utils.Ta.GR);
        this.uu = (android.widget.TextView) view.findViewById(com.bytedance.sdk.openadsdk.utils.Ta.qSG);
        this.qC = (android.widget.TextView) view.findViewById(com.bytedance.sdk.openadsdk.utils.Ta.Gih);
        this.Dxa = (android.widget.TextView) view.findViewById(com.bytedance.sdk.openadsdk.utils.Ta.gJ);
        this.jz = view.findViewById(com.bytedance.sdk.openadsdk.utils.Ta.JlG);
        this.Pae = (android.widget.ImageView) view.findViewById(com.bytedance.sdk.openadsdk.utils.Ta.mZk);
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.bytedance.sdk.openadsdk.utils.Ta.mLT);
        this.RJ = textView;
        textView.setText(com.bytedance.sdk.component.utils.Fy.bg(context, "tt_video_retry_des_txt"));
        this.sVc = (android.widget.SeekBar) view.findViewById(com.bytedance.sdk.openadsdk.utils.Ta.JMw);
        this.ApA = (android.widget.TextView) view.findViewById(com.bytedance.sdk.openadsdk.utils.Ta.VHL);
        this.GvG = (android.widget.TextView) view.findViewById(com.bytedance.sdk.openadsdk.utils.Ta.Fx);
        this.txA = view.findViewById(com.bytedance.sdk.openadsdk.utils.Ta.DCn);
        this.lM = (android.widget.ImageView) view.findViewById(com.bytedance.sdk.openadsdk.utils.Ta.dtS);
        this.WR = view.findViewById(com.bytedance.sdk.openadsdk.utils.Ta.ovC);
    }

    @Override // com.bytedance.sdk.openadsdk.core.Ta.IL.zx
    protected void eqN() {
        super.eqN();
        this.eDa.bg(this.bX);
        com.bytedance.sdk.openadsdk.utils.ZQc.bg((android.view.View) this.LKE, (this.LZ || (this.kMt & 1) == 1) ? 8 : 0);
        this.LKE.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.Ta.IL.eqN.1
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view) {
                if (com.bytedance.sdk.openadsdk.core.Ta.IL.eqN.this.vb()) {
                    com.bytedance.sdk.openadsdk.core.Ta.IL.eqN.this.DDQ.bX(com.bytedance.sdk.openadsdk.core.Ta.IL.eqN.this, view);
                }
            }
        });
        com.bytedance.sdk.openadsdk.utils.ZQc.bg((android.view.View) this.ZQc, (!this.LZ || (this.kMt & 2) == 2) ? 0 : 8);
        this.ZQc.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.Ta.IL.eqN.2
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view) {
                if (com.bytedance.sdk.openadsdk.core.Ta.IL.eqN.this.vb()) {
                    com.bytedance.sdk.openadsdk.core.Ta.IL.eqN.this.DDQ.eqN(com.bytedance.sdk.openadsdk.core.Ta.IL.eqN.this, view);
                }
            }
        });
        this.bN.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.Ta.IL.eqN.3
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view) {
                if (com.bytedance.sdk.openadsdk.core.Ta.IL.eqN.this.vb()) {
                    com.bytedance.sdk.openadsdk.core.Ta.IL.eqN.this.DDQ.zx(com.bytedance.sdk.openadsdk.core.Ta.IL.eqN.this, view);
                }
            }
        });
        this.Pae.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.Ta.IL.eqN.4
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view) {
                com.bytedance.sdk.openadsdk.core.Ta.IL.eqN.this.IL(false, true);
                com.bytedance.sdk.openadsdk.core.Ta.IL.eqN.this.Kg();
                com.bytedance.sdk.openadsdk.core.Ta.IL.eqN.this.iR();
                com.bytedance.sdk.openadsdk.core.Ta.IL.eqN.this.vb();
            }
        });
        this.lM.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.Ta.IL.eqN.5
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view) {
                if (com.bytedance.sdk.openadsdk.core.Ta.IL.eqN.this.vb()) {
                    com.bytedance.sdk.openadsdk.core.Ta.IL.eqN.this.DDQ.IL(com.bytedance.sdk.openadsdk.core.Ta.IL.eqN.this, view);
                }
            }
        });
        this.sVc.setThumbOffset(0);
        this.sVc.setOnSeekBarChangeListener(new android.widget.SeekBar.OnSeekBarChangeListener() { // from class: com.bytedance.sdk.openadsdk.core.Ta.IL.eqN.6
            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStopTrackingTouch(android.widget.SeekBar seekBar) {
                if (!com.bytedance.sdk.openadsdk.core.Ta.IL.eqN.this.GZ && com.bytedance.sdk.openadsdk.core.Ta.IL.eqN.this.Ja != null) {
                    seekBar.setThumb(com.bytedance.sdk.openadsdk.utils.Kg.bg(com.bytedance.sdk.openadsdk.core.VzQ.bg(), "tt_seek_thumb_normal"));
                }
                if (com.bytedance.sdk.openadsdk.core.Ta.IL.eqN.this.vb()) {
                    seekBar.setThumbOffset(0);
                    com.bytedance.sdk.openadsdk.core.Ta.IL.eqN.this.DDQ.bg(com.bytedance.sdk.openadsdk.core.Ta.IL.eqN.this, seekBar.getProgress());
                }
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStartTrackingTouch(android.widget.SeekBar seekBar) {
                if (!com.bytedance.sdk.openadsdk.core.Ta.IL.eqN.this.GZ && com.bytedance.sdk.openadsdk.core.Ta.IL.eqN.this.Ja != null) {
                    seekBar.setThumb(com.bytedance.sdk.openadsdk.utils.Kg.bg(com.bytedance.sdk.openadsdk.core.VzQ.bg(), "tt_seek_thumb_press"));
                }
                if (com.bytedance.sdk.openadsdk.core.Ta.IL.eqN.this.vb()) {
                    seekBar.setThumbOffset(0);
                    com.bytedance.sdk.openadsdk.core.Ta.IL.eqN.this.DDQ.IL(com.bytedance.sdk.openadsdk.core.Ta.IL.eqN.this, seekBar.getProgress());
                }
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onProgressChanged(android.widget.SeekBar seekBar, int i, boolean z) {
                if (com.bytedance.sdk.openadsdk.core.Ta.IL.eqN.this.vb()) {
                    com.bytedance.sdk.openadsdk.core.Ta.IL.eqN.this.DDQ.bg(com.bytedance.sdk.openadsdk.core.Ta.IL.eqN.this, i, z);
                }
            }
        });
        this.sVc.setOnTouchListener(this.RFq);
    }

    @Override // com.bytedance.sdk.openadsdk.core.Ta.IL.zx
    public void zx() {
        this.gXn.removeMessages(1);
        this.gXn.sendMessageDelayed(this.gXn.obtainMessage(1), 2000L);
    }

    @Override // com.bytedance.sdk.openadsdk.core.Ta.IL.zx
    public void ldr() {
        this.gXn.removeMessages(1);
    }

    @Override // com.bytedance.sdk.openadsdk.core.Ta.IL.zx
    public void IL(boolean z) {
        int i = eo() ? this.qp : this.xxp;
        int iBX = eo() ? this.kU : this.VzQ;
        if (this.Fy <= 0 || this.tuV <= 0 || i <= 0) {
            return;
        }
        if (!LZ() && !eo() && (this.kMt & 8) != 8) {
            iBX = com.bytedance.sdk.openadsdk.utils.ZQc.bX(this.Ja, 228.0f);
        }
        int i2 = (int) (this.Fy * ((i * 1.0f) / this.tuV));
        if (i2 > iBX) {
            i = (int) (this.tuV * ((iBX * 1.0f) / this.Fy));
        } else {
            iBX = i2;
        }
        if (!z && !eo()) {
            i = this.xxp;
            iBX = this.VzQ;
        }
        this.eqN.bg(i, iBX);
    }

    @Override // com.bytedance.sdk.openadsdk.core.Ta.IL.zx
    public void bg(java.lang.String str) {
        android.widget.TextView textView = this.uu;
        if (textView != null) {
            textView.setText(str);
        }
        android.widget.TextView textView2 = this.qC;
        if (textView2 != null) {
            textView2.setText(str);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.Ta.IL.zx
    public void bg(int i) {
        android.view.View view = this.txA;
        if (view == null || view.getVisibility() != 0) {
            this.sVc.setProgress(i);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.Ta.IL.zx
    public void bg(long j, long j2) {
        this.ApA.setText(com.bykv.vk.openvk.bg.bg.IL.zx.bg.bg(j2));
        this.GvG.setText(com.bykv.vk.openvk.bg.bg.IL.zx.bg.bg(j));
        this.sVc.setProgress(com.bykv.vk.openvk.bg.bg.IL.zx.bg.bg(j, j2));
    }

    @Override // com.bytedance.sdk.openadsdk.core.Ta.IL.zx
    public void iR() {
        com.bytedance.sdk.openadsdk.utils.ZQc.ldr(this.ldr);
        com.bytedance.sdk.openadsdk.utils.ZQc.ldr(this.iR);
        com.bytedance.sdk.openadsdk.utils.ZQc.zx(this.jz);
        if (this.Kg != null && this.JAA != null && this.JAA.Dxa() != null && this.JAA.Dxa().eo() != null) {
            com.bytedance.sdk.openadsdk.utils.ZQc.ldr(this.Kg);
            com.bytedance.sdk.openadsdk.xxp.bX.bg().bg(this.JAA.Dxa().eo(), this.JAA.Dxa().bX(), this.JAA.Dxa().IL(), this.Kg, this.JAA);
        }
        if (this.zx.getVisibility() == 0) {
            com.bytedance.sdk.openadsdk.utils.ZQc.bg((android.view.View) this.zx, 8);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.Ta.IL.zx, com.bykv.vk.openvk.bg.bg.bg.eqN.IL
    public void bg() {
        bg(false, this.LZ);
        tuV();
    }

    @Override // com.bytedance.sdk.openadsdk.core.Ta.IL.zx
    public void bg(long j) {
        this.GvG.setText(com.bykv.vk.openvk.bg.bg.IL.zx.bg.bg(j));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.sdk.openadsdk.core.Ta.IL.zx
    public void bg(com.bytedance.sdk.openadsdk.core.model.tuV tuv, java.lang.ref.WeakReference<android.content.Context> weakReference, boolean z) {
        java.lang.String strCZH;
        java.lang.String strBg;
        if (tuv == null) {
            return;
        }
        bg(this.bX, com.bytedance.sdk.openadsdk.core.VzQ.bg());
        bg(false, this.LZ);
        com.bytedance.sdk.openadsdk.utils.ZQc.bg(this.eo, 0);
        com.bytedance.sdk.openadsdk.utils.ZQc.bg((android.view.View) this.VB, 0);
        com.bytedance.sdk.openadsdk.utils.ZQc.bg(this.PX, 0);
        if (this.VB != null && this.JAA != null && this.JAA.Dxa() != null && this.JAA.Dxa().eo() != null) {
            com.bytedance.sdk.openadsdk.xxp.bX.bg().bg(this.JAA.Dxa().eo(), this.JAA.Dxa().bX(), this.JAA.Dxa().IL(), this.VB, this.JAA);
        }
        if (!android.text.TextUtils.isEmpty(tuv.bN())) {
            strCZH = tuv.bN();
        } else if (!android.text.TextUtils.isEmpty(tuv.wS())) {
            strCZH = tuv.wS();
        } else {
            strCZH = !android.text.TextUtils.isEmpty(tuv.cZH()) ? tuv.cZH() : "";
        }
        if (this.JAA != null && this.JAA.sVc() != null && this.JAA.sVc().bg() != null) {
            com.bytedance.sdk.openadsdk.utils.ZQc.bg((android.view.View) this.Ta, 0);
            com.bytedance.sdk.openadsdk.utils.ZQc.bg((android.view.View) this.yDt, 4);
            if (this.Ta != null) {
                com.bytedance.sdk.openadsdk.xxp.bX.bg().bg(this.JAA.sVc(), this.Ta, tuv);
                this.Ta.setOnClickListener(this.VJ);
                this.Ta.setOnTouchListener(this.VJ);
            }
        } else if (!android.text.TextUtils.isEmpty(strCZH)) {
            com.bytedance.sdk.openadsdk.utils.ZQc.bg((android.view.View) this.Ta, 4);
            com.bytedance.sdk.openadsdk.utils.ZQc.bg((android.view.View) this.yDt, 0);
            if (this.yDt != null) {
                this.yDt.setText(strCZH.substring(0, 1));
                this.yDt.setOnClickListener(this.VJ);
                this.yDt.setOnTouchListener(this.VJ);
            }
        }
        if (this.Lq != null && !android.text.TextUtils.isEmpty(strCZH)) {
            this.Lq.setText(strCZH);
        }
        com.bytedance.sdk.openadsdk.utils.ZQc.bg((android.view.View) this.Lq, 0);
        com.bytedance.sdk.openadsdk.utils.ZQc.bg((android.view.View) this.vb, 0);
        int iJz = tuv.jz();
        if (iJz == 4) {
            strBg = com.bytedance.sdk.component.utils.Fy.bg(this.Ja, "tt_video_download_apk");
        } else if (iJz == 5) {
            strBg = com.bytedance.sdk.component.utils.Fy.bg(this.Ja, "tt_video_dial_phone");
        } else {
            strBg = com.bytedance.sdk.component.utils.Fy.bg(this.Ja, "tt_video_mobile_go_detail");
        }
        if (this.vb != null) {
            this.vb.setText(strBg);
            this.vb.setOnClickListener(this.VJ);
            this.vb.setOnTouchListener(this.VJ);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.Ta.IL.zx
    public void Kg() {
        com.bytedance.sdk.openadsdk.utils.ZQc.zx(this.ldr);
        com.bytedance.sdk.openadsdk.utils.ZQc.zx(this.jz);
    }

    @Override // com.bytedance.sdk.openadsdk.core.Ta.IL.zx
    public void WR() {
        this.sVc.setProgress(0);
        this.sVc.setSecondaryProgress(0);
        this.ApA.setText(com.bytedance.sdk.component.utils.Fy.bg(this.Ja, "tt_00_00"));
        this.GvG.setText(com.bytedance.sdk.component.utils.Fy.bg(this.Ja, "tt_00_00"));
        eqN(8);
        if (kMt()) {
            this.eqN.setVisibility(8);
        }
        if (this.Kg != null) {
            this.Kg.setImageDrawable(null);
        }
        eqN(8);
        com.bytedance.sdk.openadsdk.utils.ZQc.bg(this.txA, 8);
        com.bytedance.sdk.openadsdk.utils.ZQc.bg(this.eo, 8);
        com.bytedance.sdk.openadsdk.utils.ZQc.bg((android.view.View) this.VB, 8);
        com.bytedance.sdk.openadsdk.utils.ZQc.bg(this.PX, 8);
        com.bytedance.sdk.openadsdk.utils.ZQc.bg((android.view.View) this.Ta, 8);
        com.bytedance.sdk.openadsdk.utils.ZQc.bg((android.view.View) this.yDt, 8);
        com.bytedance.sdk.openadsdk.utils.ZQc.bg((android.view.View) this.Lq, 8);
        if (this.Uw != null) {
            this.Uw.bg(true);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.Ta.IL.zx, com.bytedance.sdk.openadsdk.core.widget.Fy.IL
    public boolean eo() {
        return this.GZ;
    }

    @Override // com.bytedance.sdk.openadsdk.core.Ta.IL.zx
    public void bg(android.view.ViewGroup viewGroup) {
        if (viewGroup != null && (this.bX.getLayoutParams() instanceof android.view.ViewGroup.MarginLayoutParams)) {
            this.GZ = true;
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) this.bX.getLayoutParams();
            this.wS = marginLayoutParams.leftMargin;
            this.Ld = marginLayoutParams.topMargin;
            this.cZH = marginLayoutParams.width;
            this.zCS = marginLayoutParams.height;
            marginLayoutParams.width = -1;
            marginLayoutParams.height = -1;
            marginLayoutParams.topMargin = 0;
            marginLayoutParams.leftMargin = 0;
            this.bX.setLayoutParams(marginLayoutParams);
            android.view.ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            if (layoutParams instanceof android.widget.RelativeLayout.LayoutParams) {
                android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) layoutParams;
                int[] rules = layoutParams2.getRules();
                this.Ys = rules.length > 0 ? rules[3] : 0;
                layoutParams2.addRule(3, 0);
                viewGroup.setLayoutParams(layoutParams2);
            }
            if (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams) {
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
                this.dS.set(marginLayoutParams2.leftMargin, marginLayoutParams2.topMargin, marginLayoutParams2.rightMargin, marginLayoutParams2.bottomMargin);
                com.bytedance.sdk.openadsdk.utils.ZQc.bg(viewGroup, 0, 0, 0, 0);
            }
            IL(true);
            this.lM.setImageDrawable(com.bytedance.sdk.component.utils.Fy.bX(this.Ja, "tt_shrink_video"));
            this.sVc.setThumb(com.bytedance.sdk.openadsdk.utils.Kg.bg(this.Ja, "tt_seek_thumb_fullscreen_selector"));
            this.sVc.setThumbOffset(0);
            com.bykv.vk.openvk.bg.bg.IL.zx.bg.bg((android.view.View) this.bX, false);
            zx(this.GZ);
            com.bytedance.sdk.openadsdk.utils.ZQc.bg(this.CQc, 8);
            if (!this.LZ) {
                com.bytedance.sdk.openadsdk.utils.ZQc.bg((android.view.View) this.LKE, 8);
                com.bytedance.sdk.openadsdk.utils.ZQc.bg((android.view.View) this.ZQc, 8);
            } else if ((this.kMt & 1) == 1) {
                com.bytedance.sdk.openadsdk.utils.ZQc.bg((android.view.View) this.LKE, 8);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.Ta.IL.zx
    public void IL(android.view.ViewGroup viewGroup) {
        com.bytedance.sdk.component.utils.PX.bg("FullScreen", "Detail exitFullScreen.....");
        if (viewGroup == null || this.bX == null || !(this.bX.getLayoutParams() instanceof android.view.ViewGroup.MarginLayoutParams)) {
            return;
        }
        this.GZ = false;
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) this.bX.getLayoutParams();
        marginLayoutParams.width = this.cZH;
        marginLayoutParams.height = this.zCS;
        marginLayoutParams.leftMargin = this.wS;
        marginLayoutParams.topMargin = this.Ld;
        this.bX.setLayoutParams(marginLayoutParams);
        android.view.ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        if (layoutParams instanceof android.widget.RelativeLayout.LayoutParams) {
            android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) layoutParams;
            layoutParams2.addRule(3, this.Ys);
            viewGroup.setLayoutParams(layoutParams2);
        }
        if (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams) {
            com.bytedance.sdk.openadsdk.utils.ZQc.bg(viewGroup, this.dS.left, this.dS.top, this.dS.right, this.dS.bottom);
        }
        IL(true);
        this.lM.setImageDrawable(com.bytedance.sdk.component.utils.Fy.bX(this.Ja, "tt_enlarge_video"));
        this.sVc.setThumb(com.bytedance.sdk.openadsdk.utils.Kg.bg(this.Ja, "tt_seek_thumb_normal"));
        this.sVc.setThumbOffset(0);
        com.bykv.vk.openvk.bg.bg.IL.zx.bg.bg((android.view.View) this.bX, true);
        zx(this.GZ);
        com.bytedance.sdk.openadsdk.utils.ZQc.bg(this.CQc, 8);
        if ((this.kMt & 2) == 2) {
            com.bytedance.sdk.openadsdk.utils.ZQc.bg((android.view.View) this.ZQc, 0);
        }
    }

    private void zx(boolean z) {
        if (z) {
            JAA();
        } else {
            Ja();
        }
    }

    private void JAA() {
        android.util.DisplayMetrics displayMetrics = this.Ja.getResources().getDisplayMetrics();
        android.widget.TextView textView = this.GvG;
        if (textView != null) {
            this.jA = textView.getTextSize();
            this.GvG.setTextSize(2, 14.0f);
            android.content.res.ColorStateList textColors = this.GvG.getTextColors();
            this.hff = textColors;
            if (textColors != null) {
                this.GvG.setTextColor(-1);
            }
            this.xFs = this.GvG.getAlpha();
            this.GvG.setAlpha(0.85f);
            this.GvG.setShadowLayer(0.0f, com.bytedance.sdk.openadsdk.utils.ZQc.bX(this.Ja, 0.5f), com.bytedance.sdk.openadsdk.utils.ZQc.bX(this.Ja, 0.5f), com.bytedance.sdk.component.utils.Fy.iR(this.Ja, "tt_b2000000"));
            android.view.ViewGroup.LayoutParams layoutParams = this.GvG.getLayoutParams();
            if (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams) {
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
                this.jf.set(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
                com.bytedance.sdk.openadsdk.utils.ZQc.bg(this.GvG, (int) android.util.TypedValue.applyDimension(1, 16.0f, displayMetrics), this.jf.top, (int) android.util.TypedValue.applyDimension(1, 14.0f, displayMetrics), this.jf.bottom);
            }
        }
        android.widget.TextView textView2 = this.ApA;
        if (textView2 != null) {
            this.huT = textView2.getTextSize();
            this.ApA.setTextSize(2, 14.0f);
            android.content.res.ColorStateList textColors2 = this.ApA.getTextColors();
            this.ZyO = textColors2;
            if (textColors2 != null) {
                this.ApA.setTextColor(-1);
            }
            this.ZTq = this.ApA.getAlpha();
            this.ApA.setAlpha(0.85f);
            this.ApA.setShadowLayer(0.0f, com.bytedance.sdk.openadsdk.utils.ZQc.bX(this.Ja, 0.5f), com.bytedance.sdk.openadsdk.utils.ZQc.bX(this.Ja, 0.5f), com.bytedance.sdk.component.utils.Fy.iR(this.Ja, "tt_b2000000"));
            android.view.ViewGroup.LayoutParams layoutParams2 = this.ApA.getLayoutParams();
            if (layoutParams2 instanceof android.view.ViewGroup.MarginLayoutParams) {
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = (android.view.ViewGroup.MarginLayoutParams) layoutParams2;
                this.gCm.set(marginLayoutParams2.leftMargin, marginLayoutParams2.topMargin, marginLayoutParams2.rightMargin, marginLayoutParams2.bottomMargin);
                com.bytedance.sdk.openadsdk.utils.ZQc.bg(this.ApA, (int) android.util.TypedValue.applyDimension(1, 14.0f, displayMetrics), this.gCm.top, this.gCm.right, this.gCm.bottom);
            }
        }
        android.widget.ImageView imageView = this.lM;
        if (imageView != null) {
            android.view.ViewGroup.LayoutParams layoutParams3 = imageView.getLayoutParams();
            if (layoutParams3 instanceof android.view.ViewGroup.MarginLayoutParams) {
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams3 = (android.view.ViewGroup.MarginLayoutParams) layoutParams3;
                this.FFy.set(marginLayoutParams3.leftMargin, marginLayoutParams3.topMargin, marginLayoutParams3.rightMargin, marginLayoutParams3.bottomMargin);
                com.bytedance.sdk.openadsdk.utils.ZQc.bg(this.lM, this.FFy.left, this.FFy.top, (int) android.util.TypedValue.applyDimension(1, 16.0f, displayMetrics), this.FFy.bottom);
            }
        }
        android.widget.ImageView imageView2 = this.lM;
        if (imageView2 != null) {
            imageView2.setImageDrawable(com.bytedance.sdk.component.utils.Fy.bX(this.Ja, "tt_shrink_fullscreen"));
        }
        android.widget.TextView textView3 = this.qC;
        if (textView3 != null) {
            android.content.res.ColorStateList textColors3 = textView3.getTextColors();
            this.RiO = textColors3;
            if (textColors3 != null) {
                this.qC.setTextColor(-1);
            }
            this.Dt = this.qC.getAlpha();
            this.qC.setAlpha(0.85f);
            android.view.ViewGroup.LayoutParams layoutParams4 = this.qC.getLayoutParams();
            if (layoutParams4 instanceof android.view.ViewGroup.MarginLayoutParams) {
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams4 = (android.view.ViewGroup.MarginLayoutParams) layoutParams4;
                this.Ny.set(marginLayoutParams4.leftMargin, marginLayoutParams4.topMargin, marginLayoutParams4.rightMargin, marginLayoutParams4.bottomMargin);
                com.bytedance.sdk.openadsdk.utils.ZQc.bg(this.qC, (int) android.util.TypedValue.applyDimension(1, 1.0f, displayMetrics), this.gCm.top, this.gCm.right, this.gCm.bottom);
            }
        }
        android.view.View view = this.CQc;
        if (view != null) {
            android.view.ViewGroup.LayoutParams layoutParams5 = view.getLayoutParams();
            this.bOf = layoutParams5.height;
            layoutParams5.height = (int) android.util.TypedValue.applyDimension(1, 49.0f, displayMetrics);
            this.CQc.setLayoutParams(layoutParams5);
            this.CQc.setBackgroundResource(com.bytedance.sdk.component.utils.Fy.eqN(this.Ja, "tt_shadow_fullscreen_top"));
        }
        IL(false, true);
    }

    private void Ja() {
        android.widget.TextView textView = this.GvG;
        if (textView != null) {
            textView.setTextSize(0, this.jA);
            android.content.res.ColorStateList colorStateList = this.hff;
            if (colorStateList != null) {
                this.GvG.setTextColor(colorStateList);
            }
            this.GvG.setAlpha(this.xFs);
            this.GvG.setShadowLayer(com.bytedance.sdk.openadsdk.utils.ZQc.bX(this.Ja, 1.0f), 0.0f, 0.0f, com.bytedance.sdk.component.utils.Fy.iR(this.Ja, "tt_72000000"));
            com.bytedance.sdk.openadsdk.utils.ZQc.bg(this.GvG, this.jf.left, this.jf.top, this.jf.right, this.jf.bottom);
        }
        android.widget.TextView textView2 = this.ApA;
        if (textView2 != null) {
            textView2.setTextSize(0, this.huT);
            android.content.res.ColorStateList colorStateList2 = this.ZyO;
            if (colorStateList2 != null) {
                this.ApA.setTextColor(colorStateList2);
            }
            this.ApA.setAlpha(this.ZTq);
            this.ApA.setShadowLayer(com.bytedance.sdk.openadsdk.utils.ZQc.bX(this.Ja, 1.0f), 0.0f, 0.0f, com.bytedance.sdk.component.utils.Fy.iR(this.Ja, "tt_72000000"));
            com.bytedance.sdk.openadsdk.utils.ZQc.bg(this.ApA, this.gCm.left, this.gCm.top, this.gCm.right, this.gCm.bottom);
        }
        android.widget.ImageView imageView = this.lM;
        if (imageView != null) {
            com.bytedance.sdk.openadsdk.utils.ZQc.bg(imageView, this.FFy.left, this.FFy.top, this.FFy.right, this.FFy.bottom);
        }
        android.widget.ImageView imageView2 = this.lM;
        if (imageView2 != null) {
            imageView2.setImageDrawable(com.bytedance.sdk.component.utils.Fy.bX(this.Ja, "tt_enlarge_video"));
        }
        android.widget.TextView textView3 = this.qC;
        if (textView3 != null) {
            android.content.res.ColorStateList colorStateList3 = this.RiO;
            if (colorStateList3 != null) {
                textView3.setTextColor(colorStateList3);
            }
            this.qC.setAlpha(this.Dt);
            com.bytedance.sdk.openadsdk.utils.ZQc.bg(this.qC, this.gCm.left, this.gCm.top, this.gCm.right, this.gCm.bottom);
        }
        android.view.View view = this.CQc;
        if (view != null) {
            android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.height = this.bOf;
            this.CQc.setLayoutParams(layoutParams);
            this.CQc.setBackground(com.bytedance.sdk.openadsdk.utils.Kg.bg(this.Ja, "tt_video_black_desc_gradient"));
        }
        IL(false, true);
    }

    @Override // com.bytedance.sdk.openadsdk.core.Ta.IL.zx, com.bytedance.sdk.component.utils.JAA.bg
    public void bg(android.os.Message message) {
        if (message.what != 1) {
            return;
        }
        VB();
    }

    @Override // com.bytedance.sdk.openadsdk.core.Ta.IL.zx
    public void bg(boolean z, boolean z2, boolean z3) {
        com.bytedance.sdk.openadsdk.utils.ZQc.bg(this.txA, 0);
        if (this.GZ) {
            com.bytedance.sdk.openadsdk.utils.ZQc.bg(this.CQc, 0);
            com.bytedance.sdk.openadsdk.utils.ZQc.bg((android.view.View) this.qC, 0);
        } else if (z3) {
            com.bytedance.sdk.openadsdk.utils.ZQc.bg(this.CQc, 8);
        }
        com.bytedance.sdk.openadsdk.utils.ZQc.bg((android.view.View) this.zx, (!z || this.ldr.getVisibility() == 0) ? 8 : 0);
        if (!this.LZ && !this.GZ) {
            if ((this.kMt & 1) != 1 && !z3) {
                com.bytedance.sdk.openadsdk.utils.ZQc.bg((android.view.View) this.LKE, 0);
            }
            com.bytedance.sdk.openadsdk.utils.ZQc.bg((android.view.View) this.ZQc, z3 ? 8 : 0);
        }
        com.bytedance.sdk.openadsdk.utils.ZQc.bg((android.view.View) this.ApA, 0);
        com.bytedance.sdk.openadsdk.utils.ZQc.bg((android.view.View) this.GvG, 0);
        com.bytedance.sdk.openadsdk.utils.ZQc.bg((android.view.View) this.sVc, 0);
    }

    @Override // com.bytedance.sdk.openadsdk.core.Ta.IL.zx
    public void bg(boolean z, boolean z2) {
        com.bytedance.sdk.openadsdk.utils.ZQc.bg(this.txA, 8);
        com.bytedance.sdk.openadsdk.utils.ZQc.bg(this.CQc, 8);
        com.bytedance.sdk.openadsdk.utils.ZQc.bg((android.view.View) this.zx, 8);
        if (!this.LZ && !this.GZ) {
            com.bytedance.sdk.openadsdk.utils.ZQc.bg((android.view.View) this.LKE, 8);
            if ((this.kMt & 2) != 2) {
                com.bytedance.sdk.openadsdk.utils.ZQc.bg((android.view.View) this.ZQc, 8);
            }
        } else if ((this.kMt & 1) == 1) {
            com.bytedance.sdk.openadsdk.utils.ZQc.bg((android.view.View) this.LKE, 8);
        }
        if (z2) {
            com.bytedance.sdk.openadsdk.utils.ZQc.bg((android.view.View) this.LKE, 8);
            com.bytedance.sdk.openadsdk.utils.ZQc.bg((android.view.View) this.ZQc, 8);
        }
        bX(false);
    }

    @Override // com.bytedance.sdk.openadsdk.core.Ta.IL.zx, com.bytedance.sdk.openadsdk.core.widget.Fy.IL
    public void VB() {
        bg(true, false);
    }

    @Override // com.bytedance.sdk.openadsdk.core.Ta.IL.zx
    public boolean IL(int i) {
        android.widget.SeekBar seekBar = this.sVc;
        return seekBar != null && i > seekBar.getSecondaryProgress();
    }

    @Override // com.bytedance.sdk.openadsdk.core.Ta.IL.zx
    public void bX(boolean z) {
        android.widget.TextView textView;
        android.widget.TextView textView2;
        int i;
        if (this.uu != null) {
            if (this.LZ) {
                textView2 = this.uu;
            } else {
                textView = this.uu;
                if (z) {
                    i = 0;
                } else {
                    textView2 = textView;
                }
                com.bytedance.sdk.openadsdk.utils.ZQc.bg((android.view.View) textView, i);
            }
            textView = textView2;
            i = 8;
            com.bytedance.sdk.openadsdk.utils.ZQc.bg((android.view.View) textView, i);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.Ta.IL.zx, com.bytedance.sdk.openadsdk.core.widget.tuV.bg
    public void bg(android.view.View view, boolean z) {
        if (eo()) {
            java.lang.String str = new java.text.SimpleDateFormat("HH:mm", java.util.Locale.getDefault()).format(new java.util.Date());
            if (this.JAA != null && !android.text.TextUtils.isEmpty(this.JAA.wS())) {
                bg(this.JAA.wS());
            }
            this.Dxa.setText(str);
        } else {
            bg("");
            this.Dxa.setText("");
        }
        if (this.Uq) {
            return;
        }
        bX(this.LZ && !this.GZ);
        if (vb()) {
            this.DDQ.bg(this, view, true, this.ldr.getVisibility() != 0);
        }
    }
}
