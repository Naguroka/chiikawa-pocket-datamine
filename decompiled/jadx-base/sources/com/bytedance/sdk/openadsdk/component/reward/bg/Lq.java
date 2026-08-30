package com.bytedance.sdk.openadsdk.component.reward.bg;

/* JADX INFO: loaded from: classes4.dex */
public class Lq {
    private final com.bytedance.sdk.openadsdk.component.reward.bg.bg IL;
    private volatile long Kg;
    private com.bytedance.adsdk.ugeno.IL.bX Ta;
    private java.lang.String WR;
    private android.widget.FrameLayout bX;
    final com.bytedance.sdk.openadsdk.core.model.tuV bg;
    private volatile long iR;
    private volatile long ldr;
    private boolean xxp;
    private com.bytedance.adsdk.ugeno.IL.bX yDt;
    private final java.util.concurrent.atomic.AtomicBoolean eqN = new java.util.concurrent.atomic.AtomicBoolean(false);
    private final java.util.concurrent.atomic.AtomicBoolean zx = new java.util.concurrent.atomic.AtomicBoolean(false);
    private final java.util.concurrent.atomic.AtomicBoolean eo = new java.util.concurrent.atomic.AtomicBoolean(false);
    private long VB = 0;
    private long PX = 0;
    private java.lang.String Lq = null;
    private boolean vb = false;

    public Lq(com.bytedance.sdk.openadsdk.component.reward.bg.bg bgVar) {
        this.IL = bgVar;
        this.bg = bgVar.IL;
        this.WR = bgVar.zx;
    }

    public void bg() {
        if (this.xxp) {
            return;
        }
        this.xxp = true;
        IL();
    }

    void IL() {
        this.bX = (android.widget.FrameLayout) this.IL.CQc.findViewById(com.bytedance.sdk.openadsdk.utils.Ta.Lq);
    }

    public void bX() {
        com.bytedance.sdk.openadsdk.core.VB.ldr.bg bgVarAz;
        com.bytedance.sdk.openadsdk.core.model.tuV tuv = this.bg;
        if (tuv == null || (bgVarAz = tuv.Az()) == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.VB.bX.IL il = new com.bytedance.sdk.openadsdk.core.VB.bX.IL(this.IL.uu, this.bg, bgVarAz, this.WR, new com.bytedance.sdk.openadsdk.core.VB.zx.IL() { // from class: com.bytedance.sdk.openadsdk.component.reward.bg.Lq.1
            @Override // com.bytedance.sdk.openadsdk.core.VB.zx.bX
            public void bg(java.lang.String str) {
                com.bytedance.sdk.openadsdk.component.reward.bg.Lq.this.VB = android.os.SystemClock.elapsedRealtime();
            }

            @Override // com.bytedance.sdk.openadsdk.core.VB.zx.bX
            public void bg(int i, java.lang.String str, java.lang.String str2) {
                com.bytedance.sdk.openadsdk.component.reward.bg.Lq.this.Lq = str2;
                com.bytedance.sdk.openadsdk.component.reward.bg.Lq.this.eqN.set(false);
                com.bytedance.sdk.openadsdk.eqN.bX.bg(com.bytedance.sdk.openadsdk.component.reward.bg.Lq.this.bg, false, com.bytedance.sdk.openadsdk.component.reward.bg.Lq.this.WR, com.ironsource.y8.f.e, android.os.SystemClock.elapsedRealtime() - com.bytedance.sdk.openadsdk.component.reward.bg.Lq.this.VB, str2, "endcard", i, str);
            }

            @Override // com.bytedance.sdk.openadsdk.core.VB.zx.bX
            public void IL(java.lang.String str) {
                com.bytedance.sdk.openadsdk.component.reward.bg.Lq.this.Lq = str;
                com.bytedance.sdk.openadsdk.eqN.bX.bg(com.bytedance.sdk.openadsdk.component.reward.bg.Lq.this.bg, false, com.bytedance.sdk.openadsdk.component.reward.bg.Lq.this.WR, "success", android.os.SystemClock.elapsedRealtime() - com.bytedance.sdk.openadsdk.component.reward.bg.Lq.this.VB, str, "endcard", 0, null);
            }

            @Override // com.bytedance.sdk.openadsdk.core.VB.zx.IL
            public void bg() {
                com.bytedance.sdk.openadsdk.component.reward.bg.Lq.this.zx();
            }

            @Override // com.bytedance.sdk.openadsdk.core.VB.zx.IL
            public void bg(int i, java.lang.String str) {
                com.bytedance.sdk.openadsdk.component.reward.bg.Lq.this.eqN.set(false);
                com.bytedance.sdk.openadsdk.eqN.bX.bg(com.bytedance.sdk.openadsdk.component.reward.bg.Lq.this.bg, com.bytedance.sdk.openadsdk.component.reward.bg.Lq.this.WR, android.os.SystemClock.elapsedRealtime() - com.bytedance.sdk.openadsdk.component.reward.bg.Lq.this.ldr, i, str, (java.lang.String) null);
            }

            @Override // com.bytedance.sdk.openadsdk.core.VB.zx.IL
            public void bg(com.bytedance.adsdk.ugeno.IL.bX<android.view.View> bXVar) {
                com.bytedance.sdk.openadsdk.component.reward.bg.Lq.this.Ta = bXVar;
                com.bytedance.sdk.openadsdk.component.reward.bg.Lq.this.eqN.set(true);
                com.bytedance.sdk.openadsdk.component.reward.bg.Lq.this.iR = android.os.SystemClock.elapsedRealtime();
                if (com.bytedance.sdk.openadsdk.component.reward.bg.Lq.this.IL.VJ.Ja()) {
                    android.view.View viewEo = com.bytedance.sdk.openadsdk.component.reward.bg.Lq.this.IL.LKE.eo();
                    if (viewEo instanceof com.bytedance.sdk.openadsdk.core.zx.eqN) {
                        ((com.bytedance.sdk.openadsdk.core.zx.eqN) viewEo).setImageResource(com.bytedance.sdk.component.utils.Fy.eqN(com.bytedance.sdk.openadsdk.component.reward.bg.Lq.this.IL.Dxa, "tt_skip_btn"));
                    }
                }
                com.bytedance.sdk.openadsdk.component.reward.bg.Lq.this.yDt();
                com.bytedance.sdk.openadsdk.component.reward.bg.Lq.this.WR();
                com.bytedance.sdk.openadsdk.eqN.bX.bg(com.bytedance.sdk.openadsdk.component.reward.bg.Lq.this.bg, com.bytedance.sdk.openadsdk.component.reward.bg.Lq.this.WR, com.bytedance.sdk.openadsdk.component.reward.bg.Lq.this.iR - com.bytedance.sdk.openadsdk.component.reward.bg.Lq.this.ldr);
            }
        });
        if (this.bg.hSp() != null) {
            il.bg(new com.bytedance.sdk.openadsdk.core.VB.zx.bg() { // from class: com.bytedance.sdk.openadsdk.component.reward.bg.Lq.2
                @Override // com.bytedance.sdk.openadsdk.core.VB.zx.bg
                public void IL() {
                }

                @Override // com.bytedance.sdk.openadsdk.core.VB.zx.bg
                public java.lang.String bg() {
                    return com.adjust.sdk.Constants.NORMAL;
                }
            });
        }
        il.bg();
        il.bg(this.IL.LKE.eo());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void yDt() {
        com.bytedance.sdk.openadsdk.core.VB.ldr.bg bgVarHSp;
        com.bytedance.sdk.openadsdk.core.model.tuV tuv = this.bg;
        if (tuv == null || (bgVarHSp = tuv.hSp()) == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.VB.bX.IL il = new com.bytedance.sdk.openadsdk.core.VB.bX.IL(this.IL.uu, this.bg, bgVarHSp, this.WR, new com.bytedance.sdk.openadsdk.core.VB.zx.IL() { // from class: com.bytedance.sdk.openadsdk.component.reward.bg.Lq.3
            @Override // com.bytedance.sdk.openadsdk.core.VB.zx.IL
            public void bg() {
            }

            @Override // com.bytedance.sdk.openadsdk.core.VB.zx.bX
            public void bg(java.lang.String str) {
                com.bytedance.sdk.openadsdk.component.reward.bg.Lq.this.PX = android.os.SystemClock.elapsedRealtime();
            }

            @Override // com.bytedance.sdk.openadsdk.core.VB.zx.bX
            public void bg(int i, java.lang.String str, java.lang.String str2) {
                com.bytedance.sdk.openadsdk.component.reward.bg.Lq.this.zx.set(false);
                com.bytedance.sdk.openadsdk.eqN.bX.bg(com.bytedance.sdk.openadsdk.component.reward.bg.Lq.this.bg, true, com.bytedance.sdk.openadsdk.component.reward.bg.Lq.this.WR, com.ironsource.y8.f.e, android.os.SystemClock.elapsedRealtime() - com.bytedance.sdk.openadsdk.component.reward.bg.Lq.this.PX, str2, "endcard", i, str);
            }

            @Override // com.bytedance.sdk.openadsdk.core.VB.zx.bX
            public void IL(java.lang.String str) {
                com.bytedance.sdk.openadsdk.eqN.bX.bg(com.bytedance.sdk.openadsdk.component.reward.bg.Lq.this.bg, true, com.bytedance.sdk.openadsdk.component.reward.bg.Lq.this.WR, "success", android.os.SystemClock.elapsedRealtime() - com.bytedance.sdk.openadsdk.component.reward.bg.Lq.this.PX, str, "endcard", 0, null);
            }

            @Override // com.bytedance.sdk.openadsdk.core.VB.zx.IL
            public void bg(int i, java.lang.String str) {
                com.bytedance.sdk.openadsdk.component.reward.bg.Lq.this.zx.set(false);
            }

            @Override // com.bytedance.sdk.openadsdk.core.VB.zx.IL
            public void bg(com.bytedance.adsdk.ugeno.IL.bX<android.view.View> bXVar) {
                com.bytedance.sdk.openadsdk.component.reward.bg.Lq.this.yDt = bXVar;
                com.bytedance.sdk.openadsdk.component.reward.bg.Lq.this.zx.set(true);
            }
        });
        il.bg(new com.bytedance.sdk.openadsdk.core.VB.zx.bg() { // from class: com.bytedance.sdk.openadsdk.component.reward.bg.Lq.4
            @Override // com.bytedance.sdk.openadsdk.core.VB.zx.bg
            public java.lang.String bg() {
                return "overlay";
            }

            @Override // com.bytedance.sdk.openadsdk.core.VB.zx.bg
            public void IL() {
                com.bytedance.sdk.openadsdk.component.reward.bg.Lq.this.vb = true;
                com.bytedance.sdk.openadsdk.component.reward.bg.Lq.this.IL.LKE.eo().performClick();
            }
        });
        il.bg();
        il.bg(this.IL.LKE.eo());
    }

    public boolean eqN() {
        return this.vb;
    }

    public void bg(int i) {
        com.bytedance.sdk.openadsdk.utils.ZQc.bg((android.view.View) this.bX, i);
    }

    public void zx() {
        this.ldr = android.os.SystemClock.elapsedRealtime();
        com.bytedance.sdk.openadsdk.eqN.bX.bg(this.bg, this.WR);
    }

    public void ldr() {
        this.Kg = android.os.SystemClock.elapsedRealtime();
    }

    public void iR() {
        eo();
        WR();
        com.bytedance.adsdk.ugeno.IL.bX bXVar = this.Ta;
        if (bXVar != null) {
            this.bX.addView(bXVar.WR(), new android.widget.FrameLayout.LayoutParams(this.Ta.VJ(), this.Ta.daV()));
        }
    }

    public void Kg() {
        com.bytedance.adsdk.ugeno.IL.bX bXVar = this.yDt;
        if (bXVar != null) {
            this.bX.addView(bXVar.WR(), new android.widget.FrameLayout.LayoutParams(this.yDt.VJ(), this.yDt.daV()));
        }
    }

    public void WR() {
        if (this.Kg <= 0 || this.iR <= 0 || this.eo.getAndSet(true)) {
            return;
        }
        com.bytedance.sdk.openadsdk.eqN.bX.IL(this.iR - this.Kg, this.bg, this.WR, this.Lq);
    }

    public void eo() {
        com.bytedance.sdk.openadsdk.eqN.bX.bX(this.bg, this.WR);
    }

    public void VB() {
        com.bytedance.sdk.openadsdk.eqN.bX.bg(android.os.SystemClock.elapsedRealtime() - this.Kg, this.bg, this.WR);
    }

    public boolean PX() {
        return this.eqN.get();
    }

    public boolean Ta() {
        return this.zx.get();
    }
}
