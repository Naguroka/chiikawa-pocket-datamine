package com.bytedance.sdk.openadsdk.activity;

/* JADX INFO: loaded from: classes4.dex */
public class TTFullScreenExpressVideoActivity extends com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity {
    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public boolean VzQ() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    protected void bX() {
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity, com.bytedance.sdk.openadsdk.core.Ta.eqN.IL
    public boolean bg(long j, boolean z) {
        com.bytedance.sdk.openadsdk.eqN.iR iRVar;
        if (this.IL.Ja != null && this.IL.Ja.bg() != null) {
            iRVar = this.IL.Ja.bg().getAdShowTime();
        } else {
            iRVar = new com.bytedance.sdk.openadsdk.eqN.iR();
        }
        if (this.bX != null && (this.bX instanceof com.bytedance.sdk.openadsdk.component.reward.IL.Kg) && !this.IL.ApA) {
            this.IL.rri.bg(((com.bytedance.sdk.openadsdk.component.reward.IL.Kg) this.bX).Uq(), iRVar);
        } else {
            this.IL.rri.bg(this.IL.Ja.IL(), iRVar);
        }
        java.util.HashMap map = new java.util.HashMap();
        if (this.IL.Ja != null) {
            map.put("dynamic_show_type", java.lang.Integer.valueOf(this.IL.Ja.WR()));
            org.json.JSONObject jSONObjectBg = this.IL.Ja.bg((org.json.JSONObject) null);
            if (jSONObjectBg != null) {
                java.util.Iterator<java.lang.String> itKeys = jSONObjectBg.keys();
                while (itKeys.hasNext()) {
                    java.lang.String next = itKeys.next();
                    try {
                        map.put(next, jSONObjectBg.get(next));
                    } catch (org.json.JSONException unused) {
                    }
                }
            }
        }
        this.IL.rri.bg(new com.bykv.vk.openvk.bg.bg.bg.eqN.bX.bg() { // from class: com.bytedance.sdk.openadsdk.activity.TTFullScreenExpressVideoActivity.1
            boolean bg;

            @Override // com.bykv.vk.openvk.bg.bg.bg.eqN.bX.bg
            public void bg(long j2, int i) {
                if (this.bg) {
                    return;
                }
                this.bg = true;
                com.bytedance.sdk.openadsdk.activity.TTFullScreenExpressVideoActivity.this.eqN.removeMessages(com.google.android.gms.nearby.messages.Strategy.TTL_SECONDS_DEFAULT);
                com.bytedance.sdk.openadsdk.activity.TTFullScreenExpressVideoActivity.this.Lq();
                com.bytedance.sdk.openadsdk.activity.TTFullScreenExpressVideoActivity.this.IL.rri.bg(j2, j2);
                com.bytedance.sdk.openadsdk.activity.TTFullScreenExpressVideoActivity.this.IL.Ja.IL(true);
                if (com.bytedance.sdk.openadsdk.activity.TTFullScreenExpressVideoActivity.this.IL.IL.vb() == 36 && com.bytedance.sdk.openadsdk.activity.TTFullScreenExpressVideoActivity.this.IL.bX) {
                    com.bytedance.sdk.openadsdk.activity.TTFullScreenExpressVideoActivity.this.IL.kMt.bX().eqN();
                    com.bytedance.sdk.openadsdk.utils.PX.IL();
                }
                if (com.bytedance.sdk.openadsdk.activity.TTFullScreenExpressVideoActivity.this.IL.IL.vb() == 21 && !com.bytedance.sdk.openadsdk.activity.TTFullScreenExpressVideoActivity.this.IL.IL.eqN()) {
                    com.bytedance.sdk.openadsdk.activity.TTFullScreenExpressVideoActivity.this.IL.IL.IL(true);
                    com.bytedance.sdk.openadsdk.activity.TTFullScreenExpressVideoActivity.this.IL.LKE.xxp();
                }
                if (com.bytedance.sdk.openadsdk.activity.TTFullScreenExpressVideoActivity.this.IL.bX) {
                    if (com.bytedance.sdk.openadsdk.activity.TTFullScreenExpressVideoActivity.this.IL.IL.dX()) {
                        if (com.bytedance.sdk.openadsdk.activity.TTFullScreenExpressVideoActivity.this.IL.Ja.WR() == 1) {
                            com.bytedance.sdk.openadsdk.activity.TTFullScreenExpressVideoActivity.this.IL.ayS.bX();
                            return;
                        }
                        return;
                    } else {
                        com.bytedance.sdk.openadsdk.activity.TTFullScreenExpressVideoActivity.this.bg(false, 5);
                        if (com.bytedance.sdk.openadsdk.core.model.tuV.zx(com.bytedance.sdk.openadsdk.activity.TTFullScreenExpressVideoActivity.this.IL.IL)) {
                            return;
                        }
                        com.bytedance.sdk.openadsdk.activity.TTFullScreenExpressVideoActivity.this.IL.rri.bg("skip", true);
                        return;
                    }
                }
                if (com.bytedance.sdk.openadsdk.core.model.tuV.zx(com.bytedance.sdk.openadsdk.activity.TTFullScreenExpressVideoActivity.this.IL.IL)) {
                    com.bytedance.sdk.openadsdk.activity.TTFullScreenExpressVideoActivity.this.finish();
                    return;
                }
                if (com.bytedance.sdk.openadsdk.activity.TTFullScreenExpressVideoActivity.this.IL.Ja == null || com.bytedance.sdk.openadsdk.activity.TTFullScreenExpressVideoActivity.this.IL.Ja.bg() == null) {
                    return;
                }
                com.bytedance.sdk.openadsdk.activity.TTFullScreenExpressVideoActivity.this.IL.Ja.bg().setTime("0", 0, 0, false);
                if (com.bytedance.sdk.openadsdk.activity.TTFullScreenExpressVideoActivity.this.IL.Ja.Kg()) {
                    com.bytedance.sdk.openadsdk.activity.TTFullScreenExpressVideoActivity.this.IL.ayS.bg("0", "X");
                    com.bytedance.sdk.openadsdk.activity.TTFullScreenExpressVideoActivity.this.IL.ayS.zx(true);
                    com.bytedance.sdk.openadsdk.activity.TTFullScreenExpressVideoActivity.this.IL.ayS.bX();
                }
            }

            @Override // com.bykv.vk.openvk.bg.bg.bg.eqN.bX.bg
            public void IL(long j2, int i) {
                com.bytedance.sdk.openadsdk.activity.TTFullScreenExpressVideoActivity.this.eqN.removeMessages(com.google.android.gms.nearby.messages.Strategy.TTL_SECONDS_DEFAULT);
                if (com.bytedance.sdk.openadsdk.activity.TTFullScreenExpressVideoActivity.this.IL.rri.IL()) {
                    com.bytedance.sdk.openadsdk.activity.TTFullScreenExpressVideoActivity.this.Ta();
                    return;
                }
                com.bytedance.sdk.openadsdk.activity.TTFullScreenExpressVideoActivity.this.IL.rri.Ta();
                com.bytedance.sdk.component.utils.PX.bg("TTAD.FSEVA", "fullscreen_interstitial_ad", "onError、、、、、、、、");
                com.bytedance.sdk.openadsdk.activity.TTFullScreenExpressVideoActivity.this.IL.Ja.bg(true);
                if (com.bytedance.sdk.openadsdk.activity.TTFullScreenExpressVideoActivity.this.IL.bX) {
                    com.bytedance.sdk.openadsdk.activity.TTFullScreenExpressVideoActivity.this.bg(false, 3);
                    com.bytedance.sdk.openadsdk.activity.TTFullScreenExpressVideoActivity.this.IL.rri.bg(!com.bytedance.sdk.openadsdk.activity.TTFullScreenExpressVideoActivity.this.IL.rri.Uw() ? 1 : 0, 2);
                } else {
                    com.bytedance.sdk.openadsdk.activity.TTFullScreenExpressVideoActivity.this.finish();
                }
            }

            @Override // com.bykv.vk.openvk.bg.bg.bg.eqN.bX.bg
            public void bg() {
                com.bytedance.sdk.openadsdk.activity.TTFullScreenExpressVideoActivity.this.eqN.removeMessages(com.google.android.gms.nearby.messages.Strategy.TTL_SECONDS_DEFAULT);
                com.bytedance.sdk.openadsdk.activity.TTFullScreenExpressVideoActivity.this.Lq();
                java.lang.Object[] objArr = new java.lang.Object[2];
                if (com.bytedance.sdk.openadsdk.activity.TTFullScreenExpressVideoActivity.this.IL.bX) {
                    com.bytedance.sdk.openadsdk.activity.TTFullScreenExpressVideoActivity.this.bg(false, 6);
                } else {
                    com.bytedance.sdk.openadsdk.activity.TTFullScreenExpressVideoActivity.this.finish();
                }
                com.bytedance.sdk.openadsdk.activity.TTFullScreenExpressVideoActivity.this.IL.rri.bg(!com.bytedance.sdk.openadsdk.activity.TTFullScreenExpressVideoActivity.this.IL.rri.Uw() ? 1 : 0, !com.bytedance.sdk.openadsdk.activity.TTFullScreenExpressVideoActivity.this.IL.rri.Uw() ? 1 : 0);
                com.bytedance.sdk.openadsdk.activity.TTFullScreenExpressVideoActivity.this.IL.rri.Ta();
            }

            @Override // com.bykv.vk.openvk.bg.bg.bg.eqN.bX.bg
            public void bg(long j2, long j3) {
                if (!com.bytedance.sdk.openadsdk.activity.TTFullScreenExpressVideoActivity.this.IL.txA && com.bytedance.sdk.openadsdk.activity.TTFullScreenExpressVideoActivity.this.IL.rri.IL()) {
                    com.bytedance.sdk.openadsdk.activity.TTFullScreenExpressVideoActivity.this.IL.rri.Lq();
                }
                if (com.bytedance.sdk.openadsdk.activity.TTFullScreenExpressVideoActivity.this.IL.eo.get()) {
                    return;
                }
                com.bytedance.sdk.openadsdk.activity.TTFullScreenExpressVideoActivity.this.eqN.removeMessages(com.google.android.gms.nearby.messages.Strategy.TTL_SECONDS_DEFAULT);
                if (j2 != com.bytedance.sdk.openadsdk.activity.TTFullScreenExpressVideoActivity.this.IL.rri.Kg()) {
                    com.bytedance.sdk.openadsdk.activity.TTFullScreenExpressVideoActivity.this.Lq();
                }
                if (com.bytedance.sdk.openadsdk.activity.TTFullScreenExpressVideoActivity.this.IL.rri.IL()) {
                    com.bytedance.sdk.openadsdk.activity.TTFullScreenExpressVideoActivity.this.IL.rri.bg(j2, j3);
                    com.bytedance.sdk.openadsdk.activity.TTFullScreenExpressVideoActivity tTFullScreenExpressVideoActivity = com.bytedance.sdk.openadsdk.activity.TTFullScreenExpressVideoActivity.this;
                    long j4 = j2 / 1000;
                    tTFullScreenExpressVideoActivity.ldr = (int) (tTFullScreenExpressVideoActivity.IL.rri.DDQ() - j4);
                    int i = (int) j4;
                    if ((com.bytedance.sdk.openadsdk.activity.TTFullScreenExpressVideoActivity.this.IL.Fy.get() || com.bytedance.sdk.openadsdk.activity.TTFullScreenExpressVideoActivity.this.IL.VB.get()) && com.bytedance.sdk.openadsdk.activity.TTFullScreenExpressVideoActivity.this.IL.rri.IL()) {
                        com.bytedance.sdk.openadsdk.activity.TTFullScreenExpressVideoActivity.this.IL.rri.Lq();
                    }
                    if (com.bytedance.sdk.openadsdk.activity.TTFullScreenExpressVideoActivity.this.IL.Ja != null && com.bytedance.sdk.openadsdk.activity.TTFullScreenExpressVideoActivity.this.IL.Ja.bg() != null) {
                        com.bytedance.sdk.openadsdk.activity.TTFullScreenExpressVideoActivity.this.IL.Ja.bg().setTime(java.lang.String.valueOf(com.bytedance.sdk.openadsdk.activity.TTFullScreenExpressVideoActivity.this.ldr), i, 0, false);
                    }
                    if (com.bytedance.sdk.openadsdk.activity.TTFullScreenExpressVideoActivity.this.IL.Ja.Kg() || com.bytedance.sdk.openadsdk.activity.TTFullScreenExpressVideoActivity.this.IL.IL.Fb()) {
                        com.bytedance.sdk.openadsdk.activity.TTFullScreenExpressVideoActivity.this.bX(i);
                        if (com.bytedance.sdk.openadsdk.activity.TTFullScreenExpressVideoActivity.this.ldr >= 0) {
                            com.bytedance.sdk.openadsdk.activity.TTFullScreenExpressVideoActivity.this.IL.ayS.eqN(true);
                            com.bytedance.sdk.openadsdk.activity.TTFullScreenExpressVideoActivity.this.IL.ayS.bg(java.lang.String.valueOf(com.bytedance.sdk.openadsdk.activity.TTFullScreenExpressVideoActivity.this.ldr), null);
                        }
                    }
                }
            }
        });
        return this.IL.rri.bg(j, z, map, this.bX);
    }
}
