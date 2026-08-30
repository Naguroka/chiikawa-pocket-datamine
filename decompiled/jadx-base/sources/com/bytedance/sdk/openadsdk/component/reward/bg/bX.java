package com.bytedance.sdk.openadsdk.component.reward.bg;

/* JADX INFO: loaded from: classes4.dex */
public class bX {
    private com.bytedance.sdk.openadsdk.common.Lq IL;
    private com.bytedance.sdk.openadsdk.common.TTAdDislikeToast bX;
    private final com.bytedance.sdk.openadsdk.component.reward.bg.bg bg;

    public bX(com.bytedance.sdk.openadsdk.component.reward.bg.bg bgVar) {
        this.bg = bgVar;
    }

    public void bg(com.bytedance.sdk.openadsdk.component.reward.IL.IL il) {
        if (this.bg.uu.isFinishing()) {
            return;
        }
        if (this.bg.PX.get()) {
            this.bX.show(com.bytedance.sdk.openadsdk.common.TTAdDislikeToast.getDislikeTip());
            return;
        }
        if (this.IL == null) {
            try {
                IL(il);
            } catch (java.lang.Throwable th) {
                com.bytedance.sdk.openadsdk.ApmHelper.reportCustomError("initDislike error", "RewardFullDislikeManager", th);
            }
        }
        com.bytedance.sdk.openadsdk.common.Lq lq = this.IL;
        if (lq != null) {
            lq.bg();
        }
    }

    public void bg() {
        com.bytedance.sdk.openadsdk.common.TTAdDislikeToast tTAdDislikeToast = this.bX;
        if (tTAdDislikeToast != null) {
            tTAdDislikeToast.hide();
        }
    }

    public void IL() {
        com.bytedance.sdk.openadsdk.common.TTAdDislikeToast tTAdDislikeToast = this.bX;
        if (tTAdDislikeToast != null) {
            tTAdDislikeToast.onDestroy();
        }
    }

    private void IL(final com.bytedance.sdk.openadsdk.component.reward.IL.IL il) {
        if (this.IL == null) {
            com.bytedance.sdk.openadsdk.common.Lq lq = new com.bytedance.sdk.openadsdk.common.Lq(this.bg.uu, this.bg.IL);
            this.IL = lq;
            lq.setCallback(new com.bytedance.sdk.openadsdk.common.Lq.bg() { // from class: com.bytedance.sdk.openadsdk.component.reward.bg.bX.1
                @Override // com.bytedance.sdk.openadsdk.common.Lq.bg
                public void bg(android.view.View view) {
                    com.bytedance.sdk.openadsdk.component.reward.bg.bX.this.bg.VB.set(true);
                    java.lang.String str = "landing_page";
                    if (!com.bytedance.sdk.openadsdk.core.model.xxp.IL(com.bytedance.sdk.openadsdk.component.reward.bg.bX.this.bg.IL) && !com.bytedance.sdk.openadsdk.core.model.xxp.bX(com.bytedance.sdk.openadsdk.component.reward.bg.bX.this.bg.IL) && !com.bytedance.sdk.openadsdk.core.model.xxp.eqN(com.bytedance.sdk.openadsdk.component.reward.bg.bX.this.bg.IL)) {
                        if (!com.bytedance.sdk.openadsdk.component.reward.bg.bX.this.bg.eo.get()) {
                            str = "video_player";
                        } else if (com.bytedance.sdk.openadsdk.core.model.rri.IL(com.bytedance.sdk.openadsdk.component.reward.bg.bX.this.bg.IL)) {
                            str = "playable";
                        } else if (!com.bytedance.sdk.openadsdk.component.reward.bg.bX.this.bg.IL.ayS()) {
                            str = "endcard";
                        }
                    }
                    com.bytedance.sdk.openadsdk.component.reward.bg.bX.this.IL.setDislikeSource(str);
                    if (com.bytedance.sdk.openadsdk.component.reward.bg.bX.this.bg.rri.zx) {
                        if (com.bytedance.sdk.openadsdk.component.reward.bg.bX.this.bg.Ja != null) {
                            com.bytedance.sdk.openadsdk.component.reward.bg.bX.this.bg.Ja.bg(8, false);
                        }
                    } else {
                        il.vb();
                        if (com.bytedance.sdk.openadsdk.component.reward.bg.bX.this.bg.rri.IL()) {
                            com.bytedance.sdk.openadsdk.component.reward.bg.bX.this.bg.rri.Lq();
                        }
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.common.Lq.bg
                public void IL(android.view.View view) {
                    com.bytedance.sdk.openadsdk.component.reward.bg.bX.this.bg.VB.set(false);
                    if (com.bytedance.sdk.openadsdk.component.reward.bg.bX.this.bg.rri.zx) {
                        if (com.bytedance.sdk.openadsdk.component.reward.bg.bX.this.bg.Ja != null) {
                            com.bytedance.sdk.openadsdk.component.reward.bg.bX.this.bg.Ja.bg(0, true);
                        }
                    } else {
                        com.bytedance.sdk.openadsdk.component.reward.bg.bX.this.bg.rri.bg(il);
                        if (com.bytedance.sdk.openadsdk.component.reward.bg.bX.this.bg.rri.eqN()) {
                            com.bytedance.sdk.openadsdk.component.reward.bg.bX.this.bg.rri.yDt();
                        }
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.common.Lq.bg
                public void bg(com.bytedance.sdk.openadsdk.FilterWord filterWord) {
                    if (com.bytedance.sdk.openadsdk.component.reward.bg.bX.this.bg.PX.get() || filterWord == null || filterWord.hasSecondOptions()) {
                        return;
                    }
                    com.bytedance.sdk.openadsdk.component.reward.bg.bX.this.bg.PX.set(true);
                    com.bytedance.sdk.openadsdk.component.reward.bg.bX.this.bX();
                }
            });
            ((android.widget.FrameLayout) this.bg.uu.findViewById(android.R.id.content)).addView(this.IL);
        }
        if (this.bX == null) {
            this.bX = new com.bytedance.sdk.openadsdk.common.TTAdDislikeToast(this.bg.uu);
            ((android.widget.FrameLayout) this.bg.uu.findViewById(android.R.id.content)).addView(this.bX);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bX() {
        this.bX.show(com.bytedance.sdk.openadsdk.common.TTAdDislikeToast.getDislikeSendTip());
    }
}
