package com.bytedance.sdk.openadsdk.activity;

/* JADX INFO: loaded from: classes4.dex */
public class IL {
    private static com.bytedance.sdk.openadsdk.bg.zx.bg IL;
    private static com.bytedance.sdk.openadsdk.bg.bX.IL bX;
    private com.bytedance.sdk.openadsdk.Ta.VB Fy;
    private int JAA;
    private java.lang.Runnable Ja;
    private com.bytedance.sdk.openadsdk.bg.zx.bg Kg;
    private com.bytedance.sdk.openadsdk.component.reward.top.bX LZ;
    private com.bytedance.sdk.openadsdk.activity.bX Lq;
    private com.bytedance.sdk.openadsdk.activity.ldr PX;
    private int Ta;
    private android.app.Activity VB;
    private int VzQ;
    private com.bytedance.sdk.openadsdk.bg.bX.IL WR;
    public com.bytedance.sdk.openadsdk.utils.VB bg;
    private boolean eo;
    private final com.bytedance.sdk.openadsdk.PX.Kg iR;
    private boolean kMt;
    private boolean rri;
    private com.bytedance.sdk.openadsdk.activity.IL.AbstractC0124IL tC;
    private android.os.Bundle tuV;
    private com.bytedance.sdk.openadsdk.core.zx.bX vb;
    private com.bytedance.sdk.openadsdk.core.zx.Kg xxp;
    private com.bytedance.sdk.openadsdk.core.zx.bX yDt;
    private final com.bytedance.sdk.openadsdk.core.model.tuV zx;
    private final java.util.List<com.bytedance.sdk.openadsdk.activity.ldr> eqN = new java.util.ArrayList();
    private final android.os.Bundle ldr = new android.os.Bundle();

    public IL(android.app.Activity activity, com.bytedance.sdk.openadsdk.core.model.tuV tuv) {
        com.bytedance.sdk.openadsdk.core.model.bg bgVarED;
        java.util.List<com.bytedance.sdk.openadsdk.core.model.tuV> listBX;
        this.zx = tuv;
        this.VB = activity;
        this.iR = new com.bytedance.sdk.openadsdk.PX.Kg(activity.getApplicationContext());
        int i = 0;
        if ((tuv instanceof com.bytedance.sdk.openadsdk.core.model.Fy) && (bgVarED = ((com.bytedance.sdk.openadsdk.core.model.Fy) tuv).eD()) != null) {
            boolean zVB = bgVarED.VB();
            this.eo = zVB;
            if (zVB) {
                if (!com.bytedance.sdk.openadsdk.core.settings.xxp.zU().IEI()) {
                    this.eo = false;
                }
                if (this.eo && (listBX = bgVarED.bX()) != null) {
                    java.util.Iterator<com.bytedance.sdk.openadsdk.core.model.tuV> it = listBX.iterator();
                    while (it.hasNext()) {
                        this.eqN.add(bg(this, it.next(), i));
                        this.JAA++;
                        i++;
                    }
                }
            }
        }
        if (this.eqN.isEmpty() && !com.bytedance.sdk.openadsdk.core.model.rri.bX(tuv)) {
            this.eqN.add(bg(this, tuv, i));
            i++;
        }
        if (com.bytedance.sdk.openadsdk.core.settings.xxp.zU().yDt(java.lang.String.valueOf(tuv.IGR())) || com.bytedance.sdk.openadsdk.core.model.rri.bX(tuv)) {
            this.eqN.add(new com.bytedance.sdk.openadsdk.activity.bX(this, tuv, i));
        } else if (bg()) {
            this.bg = com.bytedance.sdk.openadsdk.utils.ldr.bg(activity, new com.bytedance.sdk.openadsdk.utils.ldr.bg() { // from class: com.bytedance.sdk.openadsdk.activity.IL.1
                @Override // com.bytedance.sdk.openadsdk.utils.ldr.bg
                public android.view.View bg() {
                    if (com.bytedance.sdk.openadsdk.activity.IL.this.LZ != null) {
                        return com.bytedance.sdk.openadsdk.activity.IL.this.LZ.getCloseButton();
                    }
                    return null;
                }

                @Override // com.bytedance.sdk.openadsdk.utils.ldr.bg
                public void IL() {
                    if (com.bytedance.sdk.openadsdk.activity.IL.this.LZ != null) {
                        com.bytedance.sdk.openadsdk.activity.IL.this.LZ.setSkipInvisiable();
                    }
                }
            });
        }
    }

    private static com.bytedance.sdk.openadsdk.activity.ldr bg(com.bytedance.sdk.openadsdk.activity.IL il, com.bytedance.sdk.openadsdk.core.model.tuV tuv, int i) {
        boolean zFE = tuv.fE();
        com.bytedance.sdk.openadsdk.AdSlot adSlotVW = tuv.VW();
        if (adSlotVW != null) {
            zFE = adSlotVW.getDurationSlotType() == 7;
        }
        if (zFE) {
            return new com.bytedance.sdk.openadsdk.activity.zx(il, tuv, i);
        }
        return new com.bytedance.sdk.openadsdk.activity.eqN(il, tuv, i);
    }

    public boolean bg() {
        return this.eo;
    }

    public void bg(com.bytedance.sdk.openadsdk.activity.TTAdActivity tTAdActivity, android.os.Bundle bundle, com.bytedance.sdk.openadsdk.bg.zx.bg bgVar, com.bytedance.sdk.openadsdk.bg.bX.IL il) {
        this.tuV = bundle;
        this.VzQ = 1;
        this.yDt = new com.bytedance.sdk.openadsdk.core.zx.bX(tTAdActivity);
        if (android.os.Build.VERSION.SDK_INT >= 35) {
            this.yDt.setFitsSystemWindows(true);
        }
        com.bytedance.sdk.openadsdk.core.zx.bX bXVar = new com.bytedance.sdk.openadsdk.core.zx.bX(tTAdActivity);
        this.vb = bXVar;
        this.yDt.addView(bXVar, new android.widget.FrameLayout.LayoutParams(-1, -1));
        if (this.eo) {
            this.Fy = new com.bytedance.sdk.openadsdk.Ta.VB(tTAdActivity);
            android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, com.bytedance.sdk.openadsdk.utils.ZQc.bX(tTAdActivity, 2.0f));
            layoutParams.gravity = 80;
            this.yDt.addView(this.Fy, layoutParams);
            com.bytedance.sdk.openadsdk.core.zx.Kg kg = new com.bytedance.sdk.openadsdk.core.zx.Kg(tTAdActivity);
            this.xxp = kg;
            kg.setTextColor(-1);
            this.xxp.setTextSize(15.0f);
            this.xxp.setShadowLayer(1.0f, 0.0f, 1.0f, androidx.core.view.ViewCompat.MEASURED_STATE_MASK);
            android.widget.FrameLayout.LayoutParams layoutParams2 = new android.widget.FrameLayout.LayoutParams(-2, -2);
            layoutParams2.topMargin = com.bytedance.sdk.openadsdk.utils.ZQc.bX(tTAdActivity, 60.0f);
            layoutParams2.rightMargin = com.bytedance.sdk.openadsdk.utils.ZQc.bX(tTAdActivity, 16.0f);
            layoutParams2.gravity = 8388661;
            this.yDt.addView(this.xxp, layoutParams2);
            com.bytedance.sdk.openadsdk.component.reward.top.bX bXVar2 = new com.bytedance.sdk.openadsdk.component.reward.top.bX(tTAdActivity);
            this.LZ = bXVar2;
            this.yDt.addView(bXVar2, new android.widget.FrameLayout.LayoutParams(-1, -2));
            this.LZ.bg(this.zx);
            this.LZ.setShowDislike(true);
        }
        this.Kg = bgVar;
        this.WR = il;
        if (bgVar == null && bundle != null) {
            this.Kg = IL;
            IL = null;
        }
        if (il == null && bundle != null) {
            this.WR = bX;
            bX = null;
        }
        IL(null, new com.bytedance.sdk.openadsdk.activity.IL.zx(1, null));
    }

    private void IL(com.bytedance.sdk.openadsdk.activity.ldr ldrVar, com.bytedance.sdk.openadsdk.activity.IL.zx zxVar) {
        if (this.VB == null) {
            return;
        }
        IL();
        if (ldrVar == null) {
            com.bytedance.sdk.openadsdk.activity.ldr ldrVar2 = this.PX;
            int i = ldrVar2 != null ? ldrVar2.WR + 1 : 0;
            if (i < this.eqN.size()) {
                ldrVar = this.eqN.get(i);
            }
            if (ldrVar == null) {
                bg(this.PX);
                return;
            }
        }
        com.bytedance.sdk.openadsdk.activity.ldr ldrVar3 = this.PX;
        if (ldrVar3 != null) {
            if (ldrVar3 == ldrVar) {
                return;
            }
            ldrVar3.zx(this.VB);
            this.PX.bX(this.VB);
            android.view.View viewBg = this.PX.bg();
            if (viewBg != null) {
                this.vb.removeView(viewBg);
            }
            this.PX.Lq();
            this.PX.eo = false;
        }
        ldrVar.eo = true;
        ldrVar.bg(this.VB, zxVar);
        android.view.View viewBg2 = ldrVar.bg();
        if (viewBg2 != null) {
            android.view.ViewParent parent = viewBg2.getParent();
            if (parent != null) {
                if (parent == this.vb) {
                    viewBg2.setVisibility(0);
                } else if (parent instanceof android.view.ViewGroup) {
                    ((android.view.ViewGroup) parent).removeView(viewBg2);
                }
            }
            if (viewBg2.getParent() == null) {
                this.vb.addView(viewBg2, new android.view.ViewGroup.LayoutParams(-1, -1));
            }
            if (this.VB.getWindow().getContainer() == null) {
                this.VB.setContentView(this.yDt);
            }
        }
        com.bytedance.sdk.openadsdk.activity.ldr ldrVar4 = this.PX;
        this.PX = ldrVar;
        bg(ldrVar4, ldrVar, zxVar);
    }

    private void bg(com.bytedance.sdk.openadsdk.activity.ldr ldrVar, com.bytedance.sdk.openadsdk.activity.ldr ldrVar2, com.bytedance.sdk.openadsdk.activity.IL.zx zxVar) {
        if (this.eo) {
            boolean z = ldrVar2 instanceof com.bytedance.sdk.openadsdk.activity.bg;
            if (z) {
                this.Ta++;
                bg(0.0f);
                if (this.tC == null) {
                    if (ldrVar2 instanceof com.bytedance.sdk.openadsdk.activity.eqN) {
                        this.tC = new com.bytedance.sdk.openadsdk.activity.IL.bg(this, this.zx, this.LZ);
                    } else {
                        this.tC = new com.bytedance.sdk.openadsdk.activity.IL.eqN(this, this.zx, this.LZ);
                    }
                }
                int iLdr = 0;
                for (int i = ldrVar2.WR; i < this.eqN.size(); i++) {
                    com.bytedance.sdk.openadsdk.activity.ldr ldrVar3 = this.eqN.get(i);
                    if (ldrVar3 instanceof com.bytedance.sdk.openadsdk.activity.bX) {
                        break;
                    }
                    com.bykv.vk.openvk.bg.bg.bg.bX.IL ilDxa = ldrVar3.Kg.Dxa();
                    iLdr = ilDxa != null ? (int) (((double) iLdr) + ilDxa.ldr()) : (int) (((long) iLdr) + 10);
                }
                this.tC.bg(iLdr);
                com.bytedance.sdk.openadsdk.utils.VB vb = this.bg;
                if (vb != null && ldrVar == null) {
                    vb.bg(iLdr * 1000);
                }
            } else if (ldrVar2 instanceof com.bytedance.sdk.openadsdk.activity.bX) {
                com.bytedance.sdk.openadsdk.Ta.VB vb2 = this.Fy;
                if (vb2 != null) {
                    com.bytedance.sdk.openadsdk.utils.ZQc.iR(vb2);
                    this.Fy = null;
                }
                com.bytedance.sdk.openadsdk.component.reward.top.bX bXVar = this.LZ;
                if (bXVar != null) {
                    com.bytedance.sdk.openadsdk.utils.ZQc.iR(bXVar);
                    com.bytedance.sdk.openadsdk.utils.ZQc.iR(this.LZ.getITopLayout());
                    this.LZ = null;
                }
                com.bytedance.sdk.openadsdk.activity.IL.AbstractC0124IL abstractC0124IL = this.tC;
                if (abstractC0124IL != null) {
                    abstractC0124IL.bX();
                }
                if (ldrVar instanceof com.bytedance.sdk.openadsdk.activity.zx) {
                    ((com.bytedance.sdk.openadsdk.activity.zx) ldrVar).rri();
                }
                com.bytedance.sdk.openadsdk.utils.VB vb3 = this.bg;
                if (vb3 != null) {
                    vb3.bX();
                }
            }
            if (z) {
                this.xxp.setText(this.VB.getString(com.bytedance.sdk.component.utils.Fy.IL(com.bytedance.sdk.openadsdk.core.VzQ.bg(), "tt_multiple_ad_indicator"), new java.lang.Object[]{java.lang.Integer.valueOf(ldrVar2.WR + 1), java.lang.Integer.valueOf(this.JAA)}));
            } else {
                this.xxp.setVisibility(8);
            }
        }
        for (int i2 = ldrVar != null ? ldrVar.WR : 0; i2 < this.eqN.size(); i2++) {
            this.eqN.get(i2).bg(ldrVar, ldrVar2, zxVar);
        }
        ldrVar2.bg(this.VB, this.tuV);
        int i3 = this.VzQ;
        if (i3 == 2) {
            ldrVar2.eqN(this.VB);
            return;
        }
        if (i3 == 3) {
            ldrVar2.eqN(this.VB);
            ldrVar2.IL(this.VB);
            ldrVar2.IL(true);
        } else if (i3 == 4) {
            ldrVar2.IL(false);
            ldrVar2.zx(this.VB);
        } else {
            if (i3 != 5) {
                return;
            }
            ldrVar2.bX(this.VB);
        }
    }

    public void bg(com.bytedance.sdk.openadsdk.activity.TTAdActivity tTAdActivity) {
        this.VzQ = 2;
        com.bytedance.sdk.openadsdk.activity.ldr ldrVar = this.PX;
        if (ldrVar != null) {
            ldrVar.eqN(tTAdActivity);
        }
    }

    public void IL(com.bytedance.sdk.openadsdk.activity.TTAdActivity tTAdActivity) {
        this.VzQ = 3;
        com.bytedance.sdk.openadsdk.activity.ldr ldrVar = this.PX;
        if (ldrVar != null) {
            ldrVar.IL(tTAdActivity);
        }
        com.bytedance.sdk.openadsdk.activity.IL.AbstractC0124IL abstractC0124IL = this.tC;
        if (abstractC0124IL != null) {
            abstractC0124IL.IL();
        }
        com.bytedance.sdk.openadsdk.utils.VB vb = this.bg;
        if (vb != null) {
            vb.bg();
        }
    }

    public void bg(boolean z) {
        com.bytedance.sdk.openadsdk.activity.ldr ldrVar = this.PX;
        if (ldrVar != null) {
            ldrVar.IL(z);
        }
    }

    public void bX(com.bytedance.sdk.openadsdk.activity.TTAdActivity tTAdActivity) {
        this.VzQ = 4;
        com.bytedance.sdk.openadsdk.activity.ldr ldrVar = this.PX;
        if (ldrVar != null) {
            ldrVar.zx(tTAdActivity);
        }
        com.bytedance.sdk.openadsdk.activity.IL.AbstractC0124IL abstractC0124IL = this.tC;
        if (abstractC0124IL != null) {
            abstractC0124IL.bg();
        }
        com.bytedance.sdk.openadsdk.utils.VB vb = this.bg;
        if (vb != null) {
            vb.IL();
        }
    }

    public void eqN(com.bytedance.sdk.openadsdk.activity.TTAdActivity tTAdActivity) {
        this.VzQ = 5;
        com.bytedance.sdk.openadsdk.activity.ldr ldrVar = this.PX;
        if (ldrVar != null) {
            ldrVar.bX(tTAdActivity);
        }
    }

    public void bg(com.bytedance.sdk.openadsdk.activity.TTAdActivity tTAdActivity, android.os.Bundle bundle) {
        com.bytedance.sdk.openadsdk.bg.zx.bg bgVar = this.Kg;
        if (bgVar != null) {
            IL = bgVar;
            return;
        }
        com.bytedance.sdk.openadsdk.bg.bX.IL il = this.WR;
        if (il != null) {
            bX = il;
        }
    }

    public void zx(com.bytedance.sdk.openadsdk.activity.TTAdActivity tTAdActivity) {
        this.VzQ = 6;
        int iIL = IL();
        for (com.bytedance.sdk.openadsdk.activity.ldr ldrVar : this.eqN) {
            if (ldrVar.WR >= iIL) {
                ldrVar.Lq();
            }
        }
        com.bytedance.sdk.openadsdk.activity.ldr ldrVar2 = this.PX;
        if (ldrVar2 != null) {
            ldrVar2.Uw();
        }
        com.bytedance.sdk.openadsdk.activity.ldr ldrVar3 = this.PX;
        if (ldrVar3 != null && !ldrVar3.tuV()) {
            com.bytedance.sdk.openadsdk.core.yDt.IL().post(new com.bytedance.sdk.openadsdk.activity.IL.bX(this.zx));
        }
        com.bytedance.sdk.openadsdk.activity.IL.AbstractC0124IL abstractC0124IL = this.tC;
        if (abstractC0124IL != null) {
            abstractC0124IL.bX();
        }
        com.bytedance.sdk.openadsdk.utils.VB vb = this.bg;
        if (vb != null) {
            vb.bX();
        }
        this.PX = null;
        this.VB = null;
    }

    public int IL() {
        com.bytedance.sdk.openadsdk.activity.ldr ldrVar = this.PX;
        if (ldrVar != null) {
            return ldrVar.WR;
        }
        return -1;
    }

    public void bg(com.bytedance.sdk.openadsdk.activity.ldr ldrVar, com.bytedance.sdk.openadsdk.activity.IL.zx zxVar) {
        com.bytedance.sdk.openadsdk.activity.ldr ldrVar2 = this.PX;
        if (ldrVar2 == null || ldrVar2 == ldrVar) {
            IL(null, zxVar);
        }
    }

    public void bg(com.bytedance.sdk.openadsdk.activity.ldr ldrVar) {
        android.app.Activity activity = this.VB;
        if (activity != null) {
            activity.finish();
        }
    }

    public android.app.Activity bX() {
        return this.VB;
    }

    public void bg(com.bytedance.sdk.openadsdk.activity.ldr ldrVar, boolean z, boolean z2, boolean z3, int i) {
        com.bytedance.sdk.openadsdk.activity.bX bXVarZx;
        com.bytedance.sdk.openadsdk.activity.ldr ldrVar2 = this.PX;
        if ((ldrVar2 == null || ldrVar2 == ldrVar) && (bXVarZx = zx()) != null) {
            com.bytedance.sdk.openadsdk.activity.IL.zx zxVar = new com.bytedance.sdk.openadsdk.activity.IL.zx(i, ldrVar != null ? ldrVar.tC() : null);
            zxVar.bg.putBoolean("isSkip", z);
            zxVar.bg.putBoolean("force", z2);
            zxVar.bg.putBoolean("isFromLandingPage", z3);
            IL(bXVarZx, zxVar);
        }
    }

    public void bg(android.app.Activity activity) {
        com.bytedance.sdk.openadsdk.activity.ldr ldrVar = this.PX;
        if (ldrVar != null) {
            ldrVar.bg(activity);
        }
    }

    public void eqN() {
        com.bytedance.sdk.openadsdk.activity.ldr ldrVar = this.PX;
        if (ldrVar != null) {
            ldrVar.xxp();
        }
    }

    public com.bytedance.sdk.openadsdk.activity.bX zx() {
        com.bytedance.sdk.openadsdk.activity.bX bXVar = this.Lq;
        if (bXVar != null) {
            return bXVar;
        }
        com.bytedance.sdk.openadsdk.activity.ldr ldrVar = this.PX;
        int i = ldrVar != null ? ldrVar.WR : -1;
        for (int size = this.eqN.size() - 1; size > i; size--) {
            com.bytedance.sdk.openadsdk.activity.ldr ldrVar2 = this.eqN.get(size);
            if (ldrVar2 instanceof com.bytedance.sdk.openadsdk.activity.bX) {
                this.Lq = (com.bytedance.sdk.openadsdk.activity.bX) ldrVar2;
                break;
            }
        }
        return this.Lq;
    }

    public void bg(float f) {
        com.bytedance.sdk.openadsdk.Ta.VB vb = this.Fy;
        if (vb == null) {
            return;
        }
        vb.setProgress(f);
        if (f == 0.0f && this.Fy.getVisibility() == 0) {
            this.Fy.setVisibility(4);
        } else {
            if (f <= 0.0f || this.Fy.getVisibility() == 0) {
                return;
            }
            this.Fy.setVisibility(0);
        }
    }

    public int ldr() {
        return this.Ta;
    }

    public com.bytedance.sdk.openadsdk.component.reward.top.bX iR() {
        return this.LZ;
    }

    public void bg(int i) {
        com.bytedance.sdk.openadsdk.activity.IL.AbstractC0124IL abstractC0124IL = this.tC;
        if (abstractC0124IL == null) {
            return;
        }
        if (i == 2) {
            abstractC0124IL.bg();
            com.bytedance.sdk.openadsdk.utils.VB vb = this.bg;
            if (vb != null) {
                vb.IL();
                return;
            }
            return;
        }
        if (i == 1) {
            abstractC0124IL.IL();
            com.bytedance.sdk.openadsdk.utils.VB vb2 = this.bg;
            if (vb2 != null) {
                vb2.bg();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.bytedance.sdk.openadsdk.activity.ldr VzQ() {
        return this.PX;
    }

    public com.bytedance.sdk.openadsdk.activity.ldr Kg() {
        int i;
        com.bytedance.sdk.openadsdk.activity.ldr ldrVar = this.PX;
        if (ldrVar != null && (i = ldrVar.WR + 1) >= 0 && i < this.eqN.size()) {
            return this.eqN.get(i);
        }
        return null;
    }

    public android.os.Bundle WR() {
        return this.ldr;
    }

    public void eo() {
        com.bytedance.sdk.openadsdk.bg.zx.bg bgVar = this.Kg;
        if (bgVar != null) {
            bgVar.onAdClicked();
            return;
        }
        com.bytedance.sdk.openadsdk.bg.bX.IL il = this.WR;
        if (il != null) {
            il.onAdClicked();
        }
    }

    public void VB() {
        com.bytedance.sdk.openadsdk.bg.zx.bg bgVar = this.Kg;
        if (bgVar != null) {
            bgVar.IL();
            return;
        }
        com.bytedance.sdk.openadsdk.bg.bX.IL il = this.WR;
        if (il != null) {
            il.IL();
        }
    }

    public void PX() {
        if (Lq()) {
            return;
        }
        vb();
        com.bytedance.sdk.openadsdk.bg.zx.bg bgVar = this.Kg;
        if (bgVar != null) {
            bgVar.bg();
        } else {
            com.bytedance.sdk.openadsdk.bg.bX.IL il = this.WR;
            if (il != null) {
                il.bg();
            }
        }
        java.lang.Runnable runnable = this.Ja;
        if (runnable != null) {
            runnable.run();
            this.Ja = null;
        }
    }

    public boolean Ta() {
        return this.kMt;
    }

    public void yDt() {
        this.kMt = true;
    }

    public void bg(final com.bytedance.sdk.openadsdk.activity.ldr ldrVar, final boolean z, final int i, final java.lang.String str, final int i2, final java.lang.String str2) {
        android.app.Activity activity;
        if (!this.rri) {
            this.Ja = new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.IL.2
                @Override // java.lang.Runnable
                public void run() {
                    com.bytedance.sdk.openadsdk.activity.IL.this.bg(ldrVar, z, i, str, i2, str2);
                }
            };
            return;
        }
        if (Ta()) {
            return;
        }
        yDt();
        if (this.Kg == null || (activity = this.VB) == null) {
            return;
        }
        activity.runOnUiThread(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.IL.3
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.openadsdk.activity.IL.this.Kg.bg(z, i, str, i2, str2);
            }
        });
        if (bg()) {
            com.bytedance.sdk.openadsdk.eqN.bX.bg(java.lang.System.currentTimeMillis(), ldrVar.Kg, ldrVar.b_(), z ? "reward_success" : "reward_fail");
        }
    }

    public boolean Lq() {
        return this.rri;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean tuV() {
        if (this.eqN.isEmpty()) {
            return false;
        }
        java.util.List<com.bytedance.sdk.openadsdk.activity.ldr> list = this.eqN;
        return list.get(list.size() - 1) instanceof com.bytedance.sdk.openadsdk.activity.bX;
    }

    public void vb() {
        this.rri = true;
    }

    public com.bytedance.sdk.openadsdk.PX.Kg xxp() {
        return this.iR;
    }

    public void bg(android.view.View view) {
        if (view.getParent() != null) {
            return;
        }
        view.setVisibility(4);
        this.vb.addView(view, 0);
    }

    public static class zx {
        public final int IL;
        public final com.bytedance.sdk.openadsdk.component.reward.bg.bg bX;
        public final android.os.Bundle bg = new android.os.Bundle();
        public boolean eqN;
        public boolean zx;

        public zx(int i, com.bytedance.sdk.openadsdk.component.reward.bg.bg bgVar) {
            this.IL = i;
            this.bX = bgVar;
        }
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.activity.IL$IL, reason: collision with other inner class name */
    static abstract class AbstractC0124IL implements android.os.Handler.Callback {
        protected final com.bytedance.sdk.openadsdk.core.model.tuV IL;
        private final android.content.Context Kg;
        private boolean WR;
        protected float bX;
        protected final com.bytedance.sdk.openadsdk.activity.IL bg;
        private boolean eo;
        protected int eqN;
        private final com.bytedance.sdk.openadsdk.component.reward.top.bX iR;
        private final android.os.Handler ldr = new android.os.Handler(android.os.Looper.getMainLooper(), this);
        protected int zx;

        protected abstract int bg(com.bytedance.sdk.openadsdk.core.model.tuV tuv);

        public AbstractC0124IL(com.bytedance.sdk.openadsdk.activity.IL il, com.bytedance.sdk.openadsdk.core.model.tuV tuv, com.bytedance.sdk.openadsdk.component.reward.top.bX bXVar) {
            this.bg = il;
            this.IL = tuv;
            this.iR = bXVar;
            this.Kg = bXVar.getContext();
            this.eqN = bg(tuv);
        }

        public void bg() {
            this.ldr.removeMessages(this.zx);
        }

        public void IL() {
            if (this.eqN < 0 || this.WR || this.eo) {
                return;
            }
            this.ldr.removeMessages(this.zx);
            this.ldr.sendEmptyMessage(this.zx);
        }

        public void bX() {
            this.ldr.removeMessages(this.zx);
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(android.os.Message message) {
            if (message.what == 1) {
                if (this.eqN > 0) {
                    this.iR.setSkipText(this.eqN + androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_SS);
                    int i = this.eqN - 1;
                    this.eqN = i;
                    if (i >= 0) {
                        this.ldr.removeMessages(message.what);
                        this.ldr.sendEmptyMessageDelayed(message.what, 1000L);
                    }
                } else {
                    eqN();
                }
            } else if (message.what == 2) {
                if (this.eqN > 0) {
                    this.iR.setSkipText(this.eqN + androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_SS);
                    int i2 = this.eqN - 1;
                    this.eqN = i2;
                    if (i2 >= 0) {
                        this.ldr.removeMessages(message.what);
                        this.ldr.sendEmptyMessageDelayed(message.what, 1000L);
                    }
                } else {
                    eqN();
                }
            }
            return true;
        }

        private void eqN() {
            if (this.bg.tuV()) {
                this.iR.showSkipButton();
                this.WR = true;
            } else {
                this.eo = true;
                this.iR.showCloseButton();
            }
        }

        public void bg(int i) {
            if (this.WR || this.eo) {
                return;
            }
            float f = i;
            this.bX = f;
            if (f > this.eqN) {
                if (this.zx == 0) {
                    this.zx = 1;
                }
            } else {
                this.zx = 2;
                this.eqN = (int) f;
            }
            this.ldr.removeCallbacksAndMessages(null);
            this.ldr.sendEmptyMessage(this.zx);
        }
    }

    static class eqN extends com.bytedance.sdk.openadsdk.activity.IL.AbstractC0124IL {
        private boolean Kg;
        private int iR;
        private final int ldr;

        public eqN(com.bytedance.sdk.openadsdk.activity.IL il, com.bytedance.sdk.openadsdk.core.model.tuV tuv, com.bytedance.sdk.openadsdk.component.reward.top.bX bXVar) {
            super(il, tuv, bXVar);
            this.ldr = com.bytedance.sdk.openadsdk.core.VzQ.eqN().Uw(java.lang.String.valueOf(tuv.IGR())).ldr;
        }

        @Override // com.bytedance.sdk.openadsdk.activity.IL.AbstractC0124IL
        protected int bg(com.bytedance.sdk.openadsdk.core.model.tuV tuv) {
            return com.bytedance.sdk.openadsdk.core.VzQ.eqN().VB(java.lang.String.valueOf(tuv.IGR()));
        }

        @Override // com.bytedance.sdk.openadsdk.activity.IL.AbstractC0124IL
        public void bg(int i) {
            boolean z = this.zx == 0;
            int i2 = this.eqN;
            super.bg(i);
            if (!z) {
                if (this.bX < i2) {
                    this.iR = (int) ((1.0f - (this.ldr / 100.0f)) * this.eqN);
                }
            } else if (this.zx == 1) {
                this.iR = 3;
            } else {
                this.iR = (int) ((1.0f - (this.ldr / 100.0f)) * this.bX);
            }
        }

        @Override // com.bytedance.sdk.openadsdk.activity.IL.AbstractC0124IL, android.os.Handler.Callback
        public boolean handleMessage(android.os.Message message) {
            if (!this.Kg && this.eqN <= this.iR) {
                this.Kg = true;
                com.bytedance.sdk.openadsdk.activity.ldr ldrVarVzQ = this.bg.VzQ();
                if (ldrVarVzQ instanceof com.bytedance.sdk.openadsdk.activity.zx) {
                    ((com.bytedance.sdk.openadsdk.activity.zx) ldrVarVzQ).rri();
                }
            }
            super.handleMessage(message);
            return true;
        }
    }

    static class bg extends com.bytedance.sdk.openadsdk.activity.IL.AbstractC0124IL {
        public bg(com.bytedance.sdk.openadsdk.activity.IL il, com.bytedance.sdk.openadsdk.core.model.tuV tuv, com.bytedance.sdk.openadsdk.component.reward.top.bX bXVar) {
            super(il, tuv, bXVar);
        }

        @Override // com.bytedance.sdk.openadsdk.activity.IL.AbstractC0124IL
        protected int bg(com.bytedance.sdk.openadsdk.core.model.tuV tuv) {
            return com.bytedance.sdk.openadsdk.core.VzQ.eqN().tuV(java.lang.String.valueOf(tuv.IGR()));
        }
    }

    private static class bX implements java.lang.Runnable {
        private final com.bytedance.sdk.openadsdk.core.model.tuV bg;

        public bX(com.bytedance.sdk.openadsdk.core.model.tuV tuv) {
            this.bg = tuv;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.bg.fE()) {
                com.bytedance.sdk.openadsdk.component.reward.PX.bg(com.bytedance.sdk.openadsdk.core.VzQ.bg()).bg(this.bg.VW());
            } else {
                com.bytedance.sdk.openadsdk.component.reward.zx.bg(com.bytedance.sdk.openadsdk.core.VzQ.bg()).bg(this.bg.VW());
            }
        }
    }
}
