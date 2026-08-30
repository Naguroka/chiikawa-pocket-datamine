package com.bytedance.sdk.openadsdk.component.reward.bg;

/* JADX INFO: loaded from: classes4.dex */
public class Kg {
    public static int IL = 1;
    public static int bX = 2;
    public static int bg;
    private final boolean eqN;
    private com.bytedance.sdk.openadsdk.component.reward.bg.WR ldr;
    private com.bytedance.sdk.openadsdk.component.reward.bg.eo zx;

    public Kg(com.bytedance.sdk.openadsdk.component.reward.bg.bg bgVar, com.bytedance.sdk.openadsdk.core.model.tuV tuv) {
        boolean zKCH = tuv.kCH();
        this.eqN = zKCH;
        if (zKCH) {
            this.zx = com.bytedance.sdk.openadsdk.core.model.rri.ldr(tuv) ? new com.bytedance.sdk.openadsdk.component.reward.bg.iR(bgVar) : new com.bytedance.sdk.openadsdk.component.reward.bg.eo(bgVar);
        } else {
            this.ldr = new com.bytedance.sdk.openadsdk.component.reward.bg.WR(bgVar);
        }
    }

    public boolean bg() {
        com.bytedance.sdk.openadsdk.component.reward.bg.WR wr = this.ldr;
        return wr != null && wr.xxp();
    }

    public void bg(int i) {
        com.bytedance.sdk.openadsdk.component.reward.bg.WR wr = this.ldr;
        if (wr != null) {
            wr.IL(i);
        }
    }

    public float IL() {
        com.bytedance.sdk.openadsdk.component.reward.bg.WR wr = this.ldr;
        if (wr != null) {
            return wr.eo();
        }
        return 0.0f;
    }

    public boolean bX() {
        com.bytedance.sdk.openadsdk.component.reward.bg.WR wr = this.ldr;
        if (wr != null) {
            return wr.vb();
        }
        return true;
    }

    public void bg(boolean z) {
        com.bytedance.sdk.openadsdk.component.reward.bg.WR wr = this.ldr;
        if (wr != null) {
            wr.IL(z);
        }
    }

    public com.bytedance.sdk.openadsdk.tuV.Kg eqN() {
        com.bytedance.sdk.openadsdk.component.reward.bg.WR wr = this.ldr;
        if (wr != null) {
            return wr.VzQ();
        }
        return null;
    }

    public void zx() {
        com.bytedance.sdk.openadsdk.component.reward.bg.WR wr = this.ldr;
        if (wr != null) {
            wr.ldr();
        }
    }

    public void ldr() {
        com.bytedance.sdk.openadsdk.component.reward.bg.WR wr = this.ldr;
        if (wr != null) {
            wr.iR();
        }
    }

    public boolean iR() {
        com.bytedance.sdk.openadsdk.component.reward.bg.WR wr = this.ldr;
        if (wr != null) {
            return wr.Lq();
        }
        return false;
    }

    public int IL(int i) {
        com.bytedance.sdk.openadsdk.component.reward.bg.WR wr = this.ldr;
        if (wr != null) {
            return wr.eqN(i);
        }
        return 0;
    }

    public void Kg() {
        com.bytedance.sdk.openadsdk.component.reward.bg.WR wr = this.ldr;
        if (wr != null) {
            wr.IL();
        }
    }

    public void bg(org.json.JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.component.reward.bg.WR wr = this.ldr;
        if (wr != null) {
            wr.bg(jSONObject);
        }
    }

    public void IL(boolean z) {
        com.bytedance.sdk.openadsdk.component.reward.bg.WR wr = this.ldr;
        if (wr != null) {
            wr.ldr(z);
        }
    }

    public void bg(int i, com.bytedance.sdk.openadsdk.core.model.tuV tuv, boolean z) {
        com.bytedance.sdk.openadsdk.component.reward.bg.WR wr = this.ldr;
        if (wr != null) {
            wr.bg(i, tuv, z);
        }
    }

    public long WR() {
        com.bytedance.sdk.openadsdk.component.reward.bg.WR wr = this.ldr;
        if (wr != null) {
            return wr.WR();
        }
        return 0L;
    }

    public void eo() {
        com.bytedance.sdk.openadsdk.component.reward.bg.WR wr = this.ldr;
        if (wr != null) {
            wr.zx();
        }
    }

    public void bX(int i) {
        com.bytedance.sdk.openadsdk.component.reward.bg.WR wr = this.ldr;
        if (wr != null) {
            wr.bX(i);
        }
    }

    public void bg(android.webkit.DownloadListener downloadListener) {
        com.bytedance.sdk.openadsdk.component.reward.bg.WR wr = this.ldr;
        if (wr != null) {
            wr.bg(downloadListener);
        }
    }

    public void bX(boolean z) {
        com.bytedance.sdk.openadsdk.component.reward.bg.WR wr = this.ldr;
        if (wr != null) {
            wr.bg(z);
        }
    }

    public com.bytedance.sdk.openadsdk.PX.eqN VB() {
        com.bytedance.sdk.openadsdk.component.reward.bg.WR wr = this.ldr;
        if (wr != null) {
            return wr.yDt();
        }
        return null;
    }

    public void bg(java.lang.String str) {
        com.bytedance.sdk.openadsdk.component.reward.bg.WR wr = this.ldr;
        if (wr != null) {
            wr.bX(str);
        }
    }

    public void bg(int i, java.lang.String str, java.lang.String str2) {
        com.bytedance.sdk.openadsdk.component.reward.bg.WR wr = this.ldr;
        if (wr != null) {
            wr.bg(i, str, str2);
        }
    }

    public void bg(boolean z, java.lang.String str, int i) {
        com.bytedance.sdk.openadsdk.component.reward.bg.WR wr = this.ldr;
        if (wr != null) {
            wr.bg(z, str, i);
        }
    }

    public void eqN(boolean z) {
        com.bytedance.sdk.openadsdk.component.reward.bg.WR wr = this.ldr;
        if (wr != null) {
            wr.eqN(z);
        }
    }

    public void zx(boolean z) {
        com.bytedance.sdk.openadsdk.component.reward.bg.WR wr = this.ldr;
        if (wr != null) {
            wr.zx(z);
        }
    }

    public void IL(java.lang.String str) {
        com.bytedance.sdk.openadsdk.component.reward.bg.WR wr = this.ldr;
        if (wr != null) {
            wr.IL(str);
        }
    }

    public void PX() {
        com.bytedance.sdk.openadsdk.component.reward.bg.WR wr = this.ldr;
        if (wr != null) {
            wr.eqN();
        }
    }

    public void bX(java.lang.String str) {
        com.bytedance.sdk.openadsdk.component.reward.bg.WR wr = this.ldr;
        if (wr != null) {
            wr.bg(str);
        }
    }

    public boolean eqN(int i) {
        if (this.eqN) {
            com.bytedance.sdk.openadsdk.component.reward.bg.eo eoVar = this.zx;
            if (eoVar != null) {
                return eoVar.WR();
            }
        } else {
            com.bytedance.sdk.openadsdk.component.reward.bg.WR wr = this.ldr;
            if (wr != null && wr.WR() - this.ldr.eo() >= i) {
                return true;
            }
        }
        return false;
    }

    public void Ta() {
        if (this.eqN) {
            com.bytedance.sdk.openadsdk.component.reward.bg.eo eoVar = this.zx;
            if (eoVar != null) {
                eoVar.eqN();
                return;
            }
            return;
        }
        com.bytedance.sdk.openadsdk.component.reward.bg.WR wr = this.ldr;
        if (wr != null) {
            wr.VB();
        }
    }

    public void yDt() {
        if (this.eqN) {
            com.bytedance.sdk.openadsdk.component.reward.bg.eo eoVar = this.zx;
            if (eoVar != null) {
                eoVar.Kg();
                return;
            }
            return;
        }
        com.bytedance.sdk.openadsdk.component.reward.bg.WR wr = this.ldr;
        if (wr != null) {
            wr.Ta();
        }
    }

    public void zx(int i) {
        if (this.eqN) {
            com.bytedance.sdk.openadsdk.component.reward.bg.eo eoVar = this.zx;
            if (eoVar != null) {
                eoVar.bg(i);
                return;
            }
            return;
        }
        com.bytedance.sdk.openadsdk.component.reward.bg.WR wr = this.ldr;
        if (wr != null) {
            wr.bg(i);
        }
    }

    public void ldr(int i) {
        if (this.eqN) {
            com.bytedance.sdk.openadsdk.component.reward.bg.eo eoVar = this.zx;
            if (eoVar != null) {
                eoVar.IL(i);
                return;
            }
            return;
        }
        com.bytedance.sdk.openadsdk.component.reward.bg.WR wr = this.ldr;
        if (wr != null) {
            wr.ldr(i);
        }
    }

    public void bg(com.bytedance.sdk.openadsdk.core.IL.zx zxVar) {
        if (this.eqN) {
            com.bytedance.sdk.openadsdk.component.reward.bg.eo eoVar = this.zx;
            if (eoVar != null) {
                eoVar.bg(zxVar);
                return;
            }
            return;
        }
        com.bytedance.sdk.openadsdk.component.reward.bg.WR wr = this.ldr;
        if (wr != null) {
            wr.bg(zxVar);
        }
    }

    public void Lq() {
        if (this.eqN) {
            com.bytedance.sdk.openadsdk.component.reward.bg.eo eoVar = this.zx;
            if (eoVar != null) {
                eoVar.bg();
                return;
            }
            return;
        }
        com.bytedance.sdk.openadsdk.component.reward.bg.WR wr = this.ldr;
        if (wr != null) {
            wr.bg();
        }
    }

    public void vb() {
        if (this.eqN) {
            com.bytedance.sdk.openadsdk.component.reward.bg.eo eoVar = this.zx;
            if (eoVar != null) {
                eoVar.zx();
                return;
            }
            return;
        }
        com.bytedance.sdk.openadsdk.component.reward.bg.WR wr = this.ldr;
        if (wr != null) {
            wr.PX();
        }
    }

    public void iR(int i) {
        com.bytedance.sdk.openadsdk.component.reward.bg.eo eoVar;
        if (this.eqN && i != bX && (eoVar = this.zx) != null) {
            eoVar.ldr();
            return;
        }
        com.bytedance.sdk.openadsdk.component.reward.bg.WR wr = this.ldr;
        if (wr == null || i == IL) {
            return;
        }
        wr.bX();
    }

    public void bg(com.bytedance.sdk.openadsdk.PX.zx zxVar, boolean z) {
        if (this.eqN) {
            com.bytedance.sdk.openadsdk.component.reward.bg.eo eoVar = this.zx;
            if (eoVar != null) {
                eoVar.IL(z);
                return;
            }
            return;
        }
        com.bytedance.sdk.openadsdk.component.reward.bg.WR wr = this.ldr;
        if (wr != null) {
            wr.bg(zxVar, z);
        }
    }

    public boolean Kg(int i) {
        if (this.eqN && i == IL) {
            com.bytedance.sdk.openadsdk.component.reward.bg.eo eoVar = this.zx;
            if (eoVar != null) {
                return eoVar.eo();
            }
            return false;
        }
        com.bytedance.sdk.openadsdk.component.reward.bg.WR wr = this.ldr;
        if (wr != null) {
            return wr.Kg();
        }
        return false;
    }

    public void xxp() {
        com.bytedance.sdk.openadsdk.component.reward.bg.eo eoVar = this.zx;
        if (eoVar != null) {
            eoVar.VB();
        }
    }

    public void ldr(boolean z) {
        com.bytedance.sdk.openadsdk.component.reward.bg.eo eoVar = this.zx;
        if (eoVar != null) {
            eoVar.bX(z);
        }
    }

    public void VzQ() {
        com.bytedance.sdk.openadsdk.component.reward.bg.eo eoVar = this.zx;
        if (eoVar != null) {
            eoVar.bX();
        }
    }
}
