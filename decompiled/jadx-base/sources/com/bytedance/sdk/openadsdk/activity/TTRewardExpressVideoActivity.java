package com.bytedance.sdk.openadsdk.activity;

/* JADX INFO: loaded from: classes4.dex */
public class TTRewardExpressVideoActivity extends com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity {
    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public boolean VzQ() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    protected void bX() {
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity, com.bytedance.sdk.openadsdk.core.Ta.eqN.IL
    public boolean bg(long j, boolean z) {
        com.bytedance.sdk.openadsdk.eqN.iR iRVar;
        if (this.IL.Ja != null && this.IL.Ja.bg() != null) {
            iRVar = this.IL.Ja.bg().getAdShowTime();
        } else {
            iRVar = new com.bytedance.sdk.openadsdk.eqN.iR();
        }
        this.IL.rri.bg(this.IL.Ja.IL(), iRVar);
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
        this.IL.rri.bg(new com.bykv.vk.openvk.bg.bg.bg.eqN.bX.bg() { // from class: com.bytedance.sdk.openadsdk.activity.TTRewardExpressVideoActivity.1
            boolean bg;

            @Override // com.bykv.vk.openvk.bg.bg.bg.eqN.bX.bg
            public void bg(long j2, int i) {
                if (this.bg) {
                    return;
                }
                this.bg = true;
                com.bytedance.sdk.openadsdk.activity.TTRewardExpressVideoActivity.this.eqN.removeMessages(com.google.android.gms.nearby.messages.Strategy.TTL_SECONDS_DEFAULT);
                com.bytedance.sdk.openadsdk.activity.TTRewardExpressVideoActivity.this.Lq();
                com.bytedance.sdk.openadsdk.activity.TTRewardExpressVideoActivity.this.IL.rri.bg(j2, j2);
                com.bytedance.sdk.openadsdk.activity.TTRewardExpressVideoActivity.this.IL.Ja.IL(true);
                if (com.bytedance.sdk.openadsdk.activity.TTRewardExpressVideoActivity.this.IL.IL.vb() == 36 && com.bytedance.sdk.openadsdk.activity.TTRewardExpressVideoActivity.this.IL.bX) {
                    com.bytedance.sdk.openadsdk.activity.TTRewardExpressVideoActivity.this.IL.kMt.bX().eqN();
                    com.bytedance.sdk.openadsdk.utils.PX.IL();
                }
                if (com.bytedance.sdk.openadsdk.activity.TTRewardExpressVideoActivity.this.IL.IL.vb() == 21 && !com.bytedance.sdk.openadsdk.activity.TTRewardExpressVideoActivity.this.IL.IL.eqN()) {
                    com.bytedance.sdk.openadsdk.activity.TTRewardExpressVideoActivity.this.IL.IL.IL(true);
                    com.bytedance.sdk.openadsdk.activity.TTRewardExpressVideoActivity.this.IL.LKE.xxp();
                }
                if (com.bytedance.sdk.openadsdk.activity.TTRewardExpressVideoActivity.this.IL.bX) {
                    if (com.bytedance.sdk.openadsdk.activity.TTRewardExpressVideoActivity.this.IL.IL.dX()) {
                        if (com.bytedance.sdk.openadsdk.activity.TTRewardExpressVideoActivity.this.IL.Ja.WR() == 1) {
                            com.bytedance.sdk.openadsdk.activity.TTRewardExpressVideoActivity.this.IL.ayS.bX();
                        }
                    } else {
                        com.bytedance.sdk.openadsdk.activity.TTRewardExpressVideoActivity.this.bg(false, 5);
                        if (!com.bytedance.sdk.openadsdk.core.model.tuV.zx(com.bytedance.sdk.openadsdk.activity.TTRewardExpressVideoActivity.this.IL.IL)) {
                            com.bytedance.sdk.openadsdk.activity.TTRewardExpressVideoActivity.this.IL.rri.bg("skip", true);
                        }
                    }
                } else if (com.bytedance.sdk.openadsdk.activity.TTRewardExpressVideoActivity.this.IL.IL.dX()) {
                    if (com.bytedance.sdk.openadsdk.activity.TTRewardExpressVideoActivity.this.IL.Ja.WR() == 1) {
                        com.bytedance.sdk.openadsdk.activity.TTRewardExpressVideoActivity.this.IL.ayS.bX();
                    }
                } else {
                    if (!com.bytedance.sdk.openadsdk.core.model.tuV.zx(com.bytedance.sdk.openadsdk.activity.TTRewardExpressVideoActivity.this.IL.IL)) {
                        com.bytedance.sdk.openadsdk.activity.TTRewardExpressVideoActivity.this.IL.rri.bg("skip", true);
                    }
                    com.bytedance.sdk.openadsdk.activity.TTRewardExpressVideoActivity.this.finish();
                }
                com.bytedance.sdk.openadsdk.activity.TTRewardExpressVideoActivity.this.PX = (int) (java.lang.System.currentTimeMillis() / 1000);
                com.bytedance.sdk.openadsdk.activity.TTRewardExpressVideoActivity.this.tuV();
            }

            @Override // com.bykv.vk.openvk.bg.bg.bg.eqN.bX.bg
            public void IL(long j2, int i) {
                com.bytedance.sdk.openadsdk.activity.TTRewardExpressVideoActivity.this.eqN.removeMessages(com.google.android.gms.nearby.messages.Strategy.TTL_SECONDS_DEFAULT);
                if (com.bytedance.sdk.openadsdk.activity.TTRewardExpressVideoActivity.this.IL.rri.IL()) {
                    com.bytedance.sdk.openadsdk.activity.TTRewardExpressVideoActivity.this.Ta();
                    return;
                }
                com.bytedance.sdk.openadsdk.activity.TTRewardExpressVideoActivity.this.tuV();
                com.bytedance.sdk.openadsdk.activity.TTRewardExpressVideoActivity.this.IL.rri.Ta();
                if (com.bytedance.sdk.openadsdk.activity.TTRewardExpressVideoActivity.this.IL.bX) {
                    com.bytedance.sdk.openadsdk.activity.TTRewardExpressVideoActivity.this.bg(false, 3);
                } else {
                    com.bytedance.sdk.openadsdk.activity.TTRewardExpressVideoActivity.this.finish();
                }
                com.bytedance.sdk.openadsdk.activity.TTRewardExpressVideoActivity.this.IL.Ja.bg(true);
                com.bytedance.sdk.openadsdk.activity.TTRewardExpressVideoActivity.this.IL.rri.bg(1 ^ (com.bytedance.sdk.openadsdk.activity.TTRewardExpressVideoActivity.this.IL.rri.Uw() ? 1 : 0), 2);
            }

            @Override // com.bykv.vk.openvk.bg.bg.bg.eqN.bX.bg
            public void bg() {
                com.bytedance.sdk.openadsdk.activity.TTRewardExpressVideoActivity.this.eqN.removeMessages(com.google.android.gms.nearby.messages.Strategy.TTL_SECONDS_DEFAULT);
                com.bytedance.sdk.openadsdk.activity.TTRewardExpressVideoActivity.this.Lq();
                com.bytedance.sdk.openadsdk.activity.TTRewardExpressVideoActivity.this.tuV();
                if (com.bytedance.sdk.openadsdk.activity.TTRewardExpressVideoActivity.this.IL.bX) {
                    com.bytedance.sdk.openadsdk.activity.TTRewardExpressVideoActivity.this.bg(false, 6);
                } else {
                    com.bytedance.sdk.openadsdk.activity.TTRewardExpressVideoActivity.this.finish();
                }
                com.bytedance.sdk.openadsdk.activity.TTRewardExpressVideoActivity.this.IL.rri.bg(!com.bytedance.sdk.openadsdk.activity.TTRewardExpressVideoActivity.this.IL.rri.Uw() ? 1 : 0, !com.bytedance.sdk.openadsdk.activity.TTRewardExpressVideoActivity.this.IL.rri.Uw() ? 1 : 0);
                com.bytedance.sdk.openadsdk.activity.TTRewardExpressVideoActivity.this.IL.rri.Ta();
            }

            @Override // com.bykv.vk.openvk.bg.bg.bg.eqN.bX.bg
            public void bg(long j2, long j3) {
                if (!com.bytedance.sdk.openadsdk.activity.TTRewardExpressVideoActivity.this.IL.txA && com.bytedance.sdk.openadsdk.activity.TTRewardExpressVideoActivity.this.IL.rri.IL()) {
                    com.bytedance.sdk.openadsdk.activity.TTRewardExpressVideoActivity.this.IL.rri.Lq();
                }
                if (com.bytedance.sdk.openadsdk.activity.TTRewardExpressVideoActivity.this.IL.eo.get()) {
                    return;
                }
                com.bytedance.sdk.openadsdk.activity.TTRewardExpressVideoActivity.this.eqN.removeMessages(com.google.android.gms.nearby.messages.Strategy.TTL_SECONDS_DEFAULT);
                if (j2 != com.bytedance.sdk.openadsdk.activity.TTRewardExpressVideoActivity.this.IL.rri.Kg()) {
                    com.bytedance.sdk.openadsdk.activity.TTRewardExpressVideoActivity.this.Lq();
                }
                if (com.bytedance.sdk.openadsdk.activity.TTRewardExpressVideoActivity.this.IL.rri.IL()) {
                    com.bytedance.sdk.openadsdk.activity.TTRewardExpressVideoActivity.this.IL.rri.bg(j2, j3);
                    int iEo = com.bytedance.sdk.openadsdk.core.VzQ.eqN().eo(java.lang.String.valueOf(com.bytedance.sdk.openadsdk.activity.TTRewardExpressVideoActivity.this.IL.ldr));
                    boolean z2 = com.bytedance.sdk.openadsdk.activity.TTRewardExpressVideoActivity.this.IL.Ja.Kg() && iEo >= 0;
                    com.bytedance.sdk.openadsdk.activity.TTRewardExpressVideoActivity tTRewardExpressVideoActivity = com.bytedance.sdk.openadsdk.activity.TTRewardExpressVideoActivity.this;
                    long j4 = j2 / 1000;
                    tTRewardExpressVideoActivity.ldr = (int) (tTRewardExpressVideoActivity.IL.rri.DDQ() - j4);
                    int i = (int) j4;
                    if ((com.bytedance.sdk.openadsdk.activity.TTRewardExpressVideoActivity.this.IL.Fy.get() || com.bytedance.sdk.openadsdk.activity.TTRewardExpressVideoActivity.this.IL.VB.get()) && com.bytedance.sdk.openadsdk.activity.TTRewardExpressVideoActivity.this.IL.rri.IL()) {
                        com.bytedance.sdk.openadsdk.activity.TTRewardExpressVideoActivity.this.IL.rri.Lq();
                    }
                    if (com.bytedance.sdk.openadsdk.activity.TTRewardExpressVideoActivity.this.ldr >= 0) {
                        com.bytedance.sdk.openadsdk.activity.TTRewardExpressVideoActivity.this.IL.ayS.bg(java.lang.String.valueOf(com.bytedance.sdk.openadsdk.activity.TTRewardExpressVideoActivity.this.ldr), null);
                    }
                    com.bytedance.sdk.openadsdk.activity.TTRewardExpressVideoActivity.this.IL.LKE.eqN(i);
                    com.bytedance.sdk.openadsdk.activity.TTRewardExpressVideoActivity.this.bg(j2, j3);
                    if (com.bytedance.sdk.openadsdk.activity.TTRewardExpressVideoActivity.this.IL.Ja != null && com.bytedance.sdk.openadsdk.activity.TTRewardExpressVideoActivity.this.IL.Ja.bg() != null) {
                        com.bytedance.sdk.openadsdk.activity.TTRewardExpressVideoActivity.this.IL.Ja.bg().setTime(java.lang.String.valueOf(com.bytedance.sdk.openadsdk.activity.TTRewardExpressVideoActivity.this.ldr), i, 0, false);
                    }
                    if (com.bytedance.sdk.openadsdk.activity.TTRewardExpressVideoActivity.this.ldr > 0) {
                        if (z2 && i >= iEo && com.bytedance.sdk.openadsdk.activity.TTRewardExpressVideoActivity.this.IL.IL.vb() != 5 && com.bytedance.sdk.openadsdk.activity.TTRewardExpressVideoActivity.this.IL.IL.vb() != 33) {
                            com.bytedance.sdk.openadsdk.activity.TTRewardExpressVideoActivity.this.IL.bg(true);
                            com.bytedance.sdk.openadsdk.activity.TTRewardExpressVideoActivity.this.IL.ayS.bg(java.lang.String.valueOf(com.bytedance.sdk.openadsdk.activity.TTRewardExpressVideoActivity.this.ldr), com.bytedance.sdk.openadsdk.common.TTAdDislikeToast.getSkipText());
                            com.bytedance.sdk.openadsdk.activity.TTRewardExpressVideoActivity.this.IL.ayS.zx(true);
                            return;
                        }
                        com.bytedance.sdk.openadsdk.activity.TTRewardExpressVideoActivity.this.IL.ayS.bg(java.lang.String.valueOf(com.bytedance.sdk.openadsdk.activity.TTRewardExpressVideoActivity.this.ldr), null);
                    }
                }
            }
        });
        boolean zBg = this.IL.rri.bg(j, z, map, this.bX);
        if (zBg && !z) {
            this.VB = (int) (java.lang.System.currentTimeMillis() / 1000);
        }
        return zBg;
    }
}
