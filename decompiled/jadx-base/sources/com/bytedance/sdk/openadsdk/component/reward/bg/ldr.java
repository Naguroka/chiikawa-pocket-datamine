package com.bytedance.sdk.openadsdk.component.reward.bg;

/* JADX INFO: loaded from: classes4.dex */
public class ldr {
    private final com.bytedance.sdk.openadsdk.component.reward.bg.bg bg;

    public ldr(com.bytedance.sdk.openadsdk.component.reward.bg.bg bgVar) {
        this.bg = bgVar;
    }

    public void bg(float[] fArr, final com.bytedance.sdk.openadsdk.core.Ta.eqN.IL il, final com.bytedance.sdk.openadsdk.component.reward.IL.IL il2) {
        android.widget.FrameLayout.LayoutParams layoutParams;
        java.util.Arrays.toString(fArr);
        this.bg.Ja.bg(new com.bytedance.sdk.openadsdk.AdSlot.Builder().setCodeId(java.lang.String.valueOf(this.bg.IL.IGR())).setExpressViewAcceptedSize(fArr[0], fArr[1]).build());
        if (this.bg.ayS != null && this.bg.Ja != null) {
            this.bg.ayS.bg(this.bg.Ja.bg());
        }
        this.bg.Ja.bg(new com.bytedance.sdk.openadsdk.core.Kg.yDt() { // from class: com.bytedance.sdk.openadsdk.component.reward.bg.ldr.1
            @Override // com.bytedance.sdk.openadsdk.core.Kg.yDt
            public void bg(boolean z) {
                if (com.bytedance.sdk.openadsdk.component.reward.bg.ldr.this.bg.RJ != z) {
                    com.bytedance.sdk.openadsdk.component.reward.bg.ldr.this.bg.ayS.zx();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.Kg.yDt
            public void bg() {
                com.bytedance.sdk.openadsdk.component.reward.bg.ldr.this.bg.ayS.eqN();
            }

            @Override // com.bytedance.sdk.openadsdk.core.Kg.yDt
            public void IL() {
                if (com.bytedance.sdk.openadsdk.component.reward.bg.ldr.this.bg.LKE == null || com.bytedance.sdk.openadsdk.component.reward.bg.ldr.this.bg.LKE.eo() == null) {
                    return;
                }
                com.bytedance.sdk.openadsdk.component.reward.bg.ldr.this.bg.LKE.eo().performClick();
            }

            @Override // com.bytedance.sdk.openadsdk.core.Kg.yDt
            public void bg(int i) {
                if (i != 1) {
                    if (i == 2) {
                        com.bytedance.sdk.openadsdk.component.reward.bg.ldr.this.bg.rri.Ja();
                        return;
                    }
                    if (i == 3) {
                        com.bytedance.sdk.openadsdk.component.reward.bg.ldr.this.bg.rri.bg(il);
                        return;
                    } else if (i == 4) {
                        com.bytedance.sdk.openadsdk.component.reward.bg.ldr.this.bg.rri.PX();
                        return;
                    } else if (i != 5) {
                        return;
                    }
                }
                if (com.bytedance.sdk.openadsdk.component.reward.bg.ldr.this.bg.rri.IL() || com.bytedance.sdk.openadsdk.component.reward.bg.ldr.this.bg.rri.eqN()) {
                    return;
                }
                il.bg(0L, false);
            }

            @Override // com.bytedance.sdk.openadsdk.core.Kg.yDt
            public long bX() {
                return com.bytedance.sdk.openadsdk.component.reward.bg.ldr.this.bg.rri.Kg();
            }

            @Override // com.bytedance.sdk.openadsdk.core.Kg.yDt
            public int eqN() {
                if (com.bytedance.sdk.openadsdk.component.reward.bg.ldr.this.bg.Ja.bX()) {
                    return 4;
                }
                if (com.bytedance.sdk.openadsdk.component.reward.bg.ldr.this.bg.Ja.eqN()) {
                    return 5;
                }
                if (com.bytedance.sdk.openadsdk.component.reward.bg.ldr.this.bg.rri.zx()) {
                    return 1;
                }
                if (com.bytedance.sdk.openadsdk.component.reward.bg.ldr.this.bg.rri.IL()) {
                    return 2;
                }
                com.bytedance.sdk.openadsdk.component.reward.bg.ldr.this.bg.rri.eqN();
                return 3;
            }

            @Override // com.bytedance.sdk.openadsdk.core.Kg.yDt
            public void zx() {
                com.bytedance.sdk.openadsdk.component.reward.bg.ldr.this.bg.aGH.bg(il2);
            }

            @Override // com.bytedance.sdk.openadsdk.core.Kg.yDt
            public void IL(int i) {
                com.bytedance.sdk.openadsdk.component.reward.bg.ldr.this.bg.sVc = i;
            }

            @Override // com.bytedance.sdk.openadsdk.core.Kg.yDt
            public void bg(int i, java.lang.String str) {
                com.bytedance.sdk.openadsdk.component.reward.bg.ldr.this.bg.rri.bg(i, str);
            }
        });
        this.bg.Ja.bg(new com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.bg.ldr.2
            @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
            public void onAdDismissed() {
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
            public void onAdShow(android.view.View view, int i) {
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
            public void onAdClicked() {
                if (com.bytedance.sdk.openadsdk.component.reward.bg.ldr.this.bg == null || com.bytedance.sdk.openadsdk.component.reward.bg.ldr.this.bg.IL == null || !com.bytedance.sdk.openadsdk.component.reward.bg.ldr.this.bg.IL.eK()) {
                    return;
                }
                il.c_();
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
            public void onRenderFail(android.view.View view, java.lang.String str, int i) {
                if (!com.bytedance.sdk.openadsdk.component.reward.bg.ldr.this.bg.IL.Fb()) {
                    com.bytedance.sdk.openadsdk.component.reward.bg.ldr.this.bg.VJ.bg(true);
                    com.bytedance.sdk.openadsdk.component.reward.bg.ldr.this.bg.VJ.zx();
                }
                com.bytedance.sdk.openadsdk.component.reward.bg.ldr.this.bg.Ja.zx().post(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.bg.ldr.2.1
                    @Override // java.lang.Runnable
                    public void run() {
                        il2.bg(false, false, false, 90);
                    }
                });
                com.bytedance.sdk.openadsdk.component.reward.bg.ldr.this.bg.LKE.Ta();
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
            public void onRenderSuccess(android.view.View view, float f, float f2) {
                if (com.bytedance.sdk.openadsdk.core.model.rri.VzQ(com.bytedance.sdk.openadsdk.component.reward.bg.ldr.this.bg.IL)) {
                    return;
                }
                if (!com.bytedance.sdk.openadsdk.component.reward.bg.ldr.this.bg.IL.Fb()) {
                    if (!com.bytedance.sdk.openadsdk.component.reward.bg.ldr.this.bg.Ja.Kg()) {
                        com.bytedance.sdk.openadsdk.component.reward.bg.ldr.this.bg.rri.eqN(true);
                    } else {
                        il2.bg(true);
                        com.bytedance.sdk.openadsdk.component.reward.bg.ldr.this.bg.rri.eqN(false);
                    }
                    com.bytedance.sdk.openadsdk.component.reward.bg.ldr.this.bg.LKE.bg(8);
                    com.bytedance.sdk.openadsdk.component.reward.bg.ldr.this.bg.VJ.bg(true);
                    com.bytedance.sdk.openadsdk.component.reward.bg.ldr.this.bg.VJ.zx();
                    if (com.bytedance.sdk.openadsdk.component.reward.bg.ldr.this.bg.Ja.Kg()) {
                        com.bytedance.sdk.openadsdk.component.reward.bg.ldr.this.bg.Ja.IL().setBackgroundColor(androidx.core.view.ViewCompat.MEASURED_STATE_MASK);
                        il2.bg(com.bytedance.sdk.openadsdk.component.reward.bg.ldr.this.bg.LKE.ldr());
                    } else if (com.bytedance.sdk.openadsdk.component.reward.bg.ldr.this.bg.IL.Dxa() != null && il2.bg()) {
                        com.bytedance.sdk.openadsdk.component.reward.bg.ldr.this.bg.ApA = true;
                    }
                }
                il2.Ja();
                if (il2 instanceof com.bytedance.sdk.openadsdk.component.reward.IL.zx) {
                    com.bytedance.sdk.openadsdk.component.reward.IL.zx.bg(com.bytedance.sdk.openadsdk.component.reward.bg.ldr.this.bg.IL, com.bytedance.sdk.openadsdk.component.reward.bg.ldr.this.bg.Ja.Kg(), com.bytedance.sdk.openadsdk.component.reward.bg.ldr.this.bg.zx);
                    if (!com.bytedance.sdk.openadsdk.component.reward.bg.ldr.this.bg.Ja.Kg()) {
                        com.bytedance.sdk.openadsdk.component.reward.bg.ldr.this.bg.qC.ldr();
                    }
                }
                com.bytedance.sdk.openadsdk.component.reward.bg.ldr.this.bg.LKE.Ta();
            }
        });
        com.bytedance.sdk.openadsdk.core.Kg.WR wr = new com.bytedance.sdk.openadsdk.core.Kg.WR(this.bg.uu, this.bg.IL, this.bg.zx, com.bytedance.sdk.openadsdk.utils.ayS.bg(this.bg.zx)) { // from class: com.bytedance.sdk.openadsdk.component.reward.bg.ldr.3
            @Override // com.bytedance.sdk.openadsdk.core.IL.IL, com.bytedance.sdk.openadsdk.core.IL.bX
            public void bg(android.view.View view, float f, float f2, float f3, float f4, android.util.SparseArray<com.bytedance.sdk.openadsdk.core.IL.bX.bg> sparseArray, boolean z) {
                super.bg(view, f, f2, f3, f4, sparseArray, z);
            }
        };
        wr.bg(new com.bytedance.sdk.openadsdk.core.IL.IL.bg() { // from class: com.bytedance.sdk.openadsdk.component.reward.bg.ldr.4
            @Override // com.bytedance.sdk.openadsdk.core.IL.IL.bg
            public void bg(android.view.View view, int i) {
                il.c_();
            }
        });
        java.util.HashMap map = new java.util.HashMap();
        if (com.bytedance.sdk.openadsdk.core.model.rri.VzQ(this.bg.IL)) {
            map.put("click_scence", 3);
        } else {
            map.put("click_scence", 1);
        }
        if (this.bg.Ny && this.bg.kU != null) {
            map.put("ad_show_order", java.lang.Integer.valueOf(this.bg.kU.WR + 1));
        }
        wr.bg(map);
        com.bytedance.sdk.openadsdk.core.Kg.Kg kg = new com.bytedance.sdk.openadsdk.core.Kg.Kg(this.bg.uu, this.bg.IL, this.bg.zx, com.bytedance.sdk.openadsdk.utils.ayS.bg(this.bg.zx)) { // from class: com.bytedance.sdk.openadsdk.component.reward.bg.ldr.5
            @Override // com.bytedance.sdk.openadsdk.core.IL.bg, com.bytedance.sdk.openadsdk.core.IL.IL, com.bytedance.sdk.openadsdk.core.IL.bX
            public void bg(android.view.View view, float f, float f2, float f3, float f4, android.util.SparseArray<com.bytedance.sdk.openadsdk.core.IL.bX.bg> sparseArray, boolean z) {
                java.util.HashMap map2 = new java.util.HashMap();
                map2.put("duration", java.lang.Long.valueOf(com.bytedance.sdk.openadsdk.component.reward.bg.ldr.this.bg.rri.iR()));
                bg(map2);
                super.bg(view, f, f2, f3, f4, sparseArray, z);
            }
        };
        kg.bg(new com.bytedance.sdk.openadsdk.core.IL.IL.bg() { // from class: com.bytedance.sdk.openadsdk.component.reward.bg.ldr.6
            @Override // com.bytedance.sdk.openadsdk.core.IL.IL.bg
            public void bg(android.view.View view, int i) {
                il.c_();
            }
        });
        java.util.HashMap map2 = new java.util.HashMap();
        if (com.bytedance.sdk.openadsdk.core.model.rri.VzQ(this.bg.IL)) {
            map2.put("click_scence", 3);
        } else {
            map2.put("click_scence", 1);
        }
        kg.bg(map2);
        this.bg.Ja.bg(wr, kg);
        if (this.bg.IL.Fb() || com.bytedance.sdk.openadsdk.core.VB.bX.bg(this.bg.IL.JAA())) {
            layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -1);
        } else {
            layoutParams = new android.widget.FrameLayout.LayoutParams(-2, -2);
        }
        layoutParams.gravity = 17;
        this.bg.LKE.ldr().addView(this.bg.Ja.bg(), layoutParams);
        if (!this.bg.Ja.Kg()) {
            il2.bg(false);
        }
        this.bg.Ja.VB();
    }
}
