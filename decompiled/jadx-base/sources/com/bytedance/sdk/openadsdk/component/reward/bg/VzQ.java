package com.bytedance.sdk.openadsdk.component.reward.bg;

/* JADX INFO: loaded from: classes4.dex */
public class VzQ {
    private com.bytedance.sdk.openadsdk.eqN.iR Fy;
    private final com.bytedance.sdk.openadsdk.core.model.tuV Kg;
    private long PX;
    private long VB;
    private boolean VzQ;
    private android.widget.FrameLayout WR;
    boolean bX;
    private final java.lang.String eo;
    final boolean eqN;
    private final android.app.Activity iR;
    com.bykv.vk.openvk.bg.bg.bg.eqN.bX ldr;
    private com.bytedance.sdk.openadsdk.core.Ta.eqN.bg.InterfaceC0142bg tuV;
    private boolean vb;
    private final com.bytedance.sdk.openadsdk.component.reward.bg.bg xxp;
    private java.lang.String yDt;
    protected boolean bg = false;
    boolean IL = false;
    protected boolean zx = false;
    private int Ta = -1;
    private java.util.HashSet<java.lang.String> Lq = new java.util.HashSet<>();

    public com.bytedance.sdk.openadsdk.eqN.iR bg() {
        return this.Fy;
    }

    public VzQ(com.bytedance.sdk.openadsdk.component.reward.bg.bg bgVar) {
        this.xxp = bgVar;
        this.iR = bgVar.uu;
        this.Kg = bgVar.IL;
        this.eqN = bgVar.eqN;
        this.eo = bgVar.zx;
    }

    public void bg(android.widget.FrameLayout frameLayout, com.bytedance.sdk.openadsdk.eqN.iR iRVar) {
        if (this.vb) {
            return;
        }
        this.vb = true;
        this.WR = frameLayout;
        this.Fy = iRVar;
        if (com.bytedance.sdk.openadsdk.core.model.tuV.zx(this.Kg)) {
            this.ldr = new com.bytedance.sdk.openadsdk.core.Ta.eqN.bg(this.iR, this.WR, this.Kg, iRVar);
            eqN(this.VzQ);
            com.bytedance.sdk.openadsdk.core.Ta.eqN.bg.InterfaceC0142bg interfaceC0142bg = this.tuV;
            if (interfaceC0142bg != null) {
                ((com.bytedance.sdk.openadsdk.core.Ta.eqN.bg) this.ldr).bg(interfaceC0142bg);
                return;
            }
            return;
        }
        com.bytedance.sdk.openadsdk.component.reward.bX bXVar = new com.bytedance.sdk.openadsdk.component.reward.bX(this.Kg, iRVar);
        this.ldr = bXVar;
        com.bytedance.sdk.openadsdk.core.Ta.eqN.bg.InterfaceC0142bg interfaceC0142bg2 = this.tuV;
        if (interfaceC0142bg2 != null) {
            bXVar.bg(interfaceC0142bg2);
        }
    }

    public void bg(com.bytedance.sdk.openadsdk.eqN.iR iRVar) {
        this.Fy = iRVar;
    }

    public boolean IL() {
        com.bykv.vk.openvk.bg.bg.bg.eqN.bX bXVar = this.ldr;
        return (bXVar == null || bXVar.PX() == null || !this.ldr.PX().ldr()) ? false : true;
    }

    public com.bykv.vk.openvk.bg.bg.bg.IL.bg bX() {
        com.bykv.vk.openvk.bg.bg.bg.eqN.bX bXVar = this.ldr;
        if (bXVar == null) {
            return null;
        }
        if (bXVar instanceof com.bytedance.sdk.openadsdk.component.reward.bX) {
            return ((com.bytedance.sdk.openadsdk.component.reward.bX) bXVar).VzQ();
        }
        return bXVar.Ta();
    }

    public boolean eqN() {
        com.bykv.vk.openvk.bg.bg.bg.eqN.bX bXVar = this.ldr;
        return (bXVar == null || bXVar.PX() == null || !this.ldr.PX().iR()) ? false : true;
    }

    public boolean zx() {
        com.bykv.vk.openvk.bg.bg.bg.eqN.bX bXVar = this.ldr;
        return bXVar != null && bXVar.vb();
    }

    public void bg(long j, long j2) {
        this.PX = j;
        IL(j, j2);
    }

    private void IL(long j, long j2) {
        int iAbs = (int) java.lang.Math.abs(((long) this.Ta) - j);
        int i = this.Ta;
        if (i < 0 || iAbs > 500 || i > j2 || iAbs >= 500 || this.Lq.contains(this.yDt)) {
            return;
        }
        if (this.Ta > j) {
            com.bytedance.sdk.openadsdk.core.yDt.bX().postDelayed(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.bg.VzQ.1
                @Override // java.lang.Runnable
                public void run() {
                    com.bytedance.sdk.openadsdk.component.reward.bg.VzQ.this.Ja();
                    com.bytedance.sdk.openadsdk.component.reward.bg.VzQ.this.xxp.Ja.bg(com.bytedance.sdk.openadsdk.component.reward.bg.VzQ.this.Ta, com.bytedance.sdk.openadsdk.component.reward.bg.VzQ.this.yDt);
                }
            }, iAbs);
        } else {
            Ja();
            this.xxp.Ja.bg(this.Ta, this.yDt);
        }
        this.Lq.add(this.yDt);
    }

    public void bg(int i, java.lang.String str) {
        this.Ta = i;
        this.yDt = str;
    }

    public boolean ldr() {
        return this.bg;
    }

    public long iR() {
        com.bykv.vk.openvk.bg.bg.bg.eqN.bX bXVar = this.ldr;
        if (bXVar != null) {
            return bXVar.zx();
        }
        return this.VB;
    }

    public long Kg() {
        return this.PX;
    }

    public long WR() {
        return this.VB;
    }

    public void bg(long j) {
        this.VB = j;
    }

    public void bg(boolean z) {
        this.bg = z;
    }

    public void eo() {
        try {
            if (IL()) {
                this.ldr.bg();
            }
        } catch (java.lang.Throwable th) {
            com.bytedance.sdk.component.utils.PX.IL("RewardFullVideoPlayerManager onPause throw Exception :" + th.getMessage());
        }
    }

    public void bg(int i, int i2) {
        if (this.ldr != null) {
            com.bytedance.sdk.openadsdk.eqN.zx.IL.Lq.bg bgVar = new com.bytedance.sdk.openadsdk.eqN.zx.IL.Lq.bg();
            bgVar.IL(VB());
            bgVar.bX(tuV());
            bgVar.bg(iR());
            bgVar.bg(i);
            bgVar.IL(i2);
            com.bytedance.sdk.openadsdk.eqN.zx.bg.bg.eqN(this.ldr.Ta(), bgVar);
        }
    }

    public long VB() {
        com.bykv.vk.openvk.bg.bg.bg.eqN.bX bXVar = this.ldr;
        if (bXVar != null) {
            return bXVar.ldr();
        }
        return 0L;
    }

    private void daV() {
        com.bykv.vk.openvk.bg.bg.bg.eqN.bX bXVar = this.ldr;
        if (bXVar == null || bXVar.PX() == null) {
            return;
        }
        this.VB = this.ldr.zx();
        if (this.ldr.PX().bX() || !this.ldr.PX().IL()) {
            this.ldr.bg();
            this.ldr.bX();
            this.bg = true;
        }
    }

    public void PX() {
        com.bykv.vk.openvk.bg.bg.bg.eqN.bX bXVar = this.ldr;
        if (bXVar == null) {
            return;
        }
        bXVar.bX();
        this.ldr = null;
    }

    public void Ta() {
        com.bykv.vk.openvk.bg.bg.bg.eqN.bX bXVar = this.ldr;
        if (bXVar != null) {
            bXVar.eqN();
        }
    }

    public void yDt() {
        com.bykv.vk.openvk.bg.bg.bg.eqN.bX bXVar = this.ldr;
        if (bXVar != null) {
            bXVar.IL();
        }
    }

    public void Lq() {
        com.bykv.vk.openvk.bg.bg.bg.eqN.bX bXVar = this.ldr;
        if (bXVar != null) {
            bXVar.bg();
        }
    }

    public void bg(com.bykv.vk.openvk.bg.bg.bg.eqN.bX.bg bgVar) {
        com.bykv.vk.openvk.bg.bg.bg.eqN.bX bXVar = this.ldr;
        if (bXVar != null) {
            bXVar.bg(bgVar);
        }
    }

    public void IL(boolean z) {
        com.bykv.vk.openvk.bg.bg.bg.eqN.bX bXVar = this.ldr;
        if (bXVar != null) {
            bXVar.IL(z);
        }
    }

    public long vb() {
        com.bykv.vk.openvk.bg.bg.bg.eqN.bX bXVar = this.ldr;
        if (bXVar != null) {
            return bXVar.Kg();
        }
        return 0L;
    }

    public int xxp() {
        com.bykv.vk.openvk.bg.bg.bg.eqN.bX bXVar = this.ldr;
        if (bXVar != null) {
            return bXVar.eo();
        }
        return 0;
    }

    public int VzQ() {
        com.bykv.vk.openvk.bg.bg.bg.eqN.bX bXVar = this.ldr;
        if (bXVar != null) {
            return bXVar.iR();
        }
        return 0;
    }

    public long tuV() {
        com.bykv.vk.openvk.bg.bg.bg.eqN.bX bXVar = this.ldr;
        if (bXVar != null) {
            return bXVar.Kg() + this.ldr.ldr();
        }
        return 0L;
    }

    public void bg(java.lang.String str, boolean z) {
        if (this.ldr != null) {
            long jIR = iR();
            if (this.Kg.dX()) {
                jIR = this.xxp.bX();
            }
            long j = jIR;
            org.json.JSONObject jSONObjectBg = com.bytedance.sdk.openadsdk.utils.ayS.bg(this.Kg, this.ldr.ldr(), this.ldr.PX());
            try {
                jSONObjectBg.put("auto_click", z);
            } catch (java.lang.Exception unused) {
            }
            com.bytedance.sdk.openadsdk.eqN.bX.bg(this.Kg, this.eo, str, j, xxp(), jSONObjectBg, this.Fy);
            tuV();
            xxp();
        }
        VW();
    }

    public long Fy() {
        com.bykv.vk.openvk.bg.bg.bg.eqN.bX bXVar = this.ldr;
        if (bXVar != null) {
            return bXVar.Kg();
        }
        return 0L;
    }

    public boolean LZ() {
        com.bykv.vk.openvk.bg.bg.bg.eqN.bX bXVar = this.ldr;
        if (bXVar != null) {
            if (bXVar.PX() != null) {
                com.bykv.vk.openvk.bg.bg.bg.bg bgVarPX = this.ldr.PX();
                if (bgVarPX.iR() || bgVarPX.Kg()) {
                    com.bykv.vk.openvk.bg.bg.bg.eqN.bX bXVar2 = this.ldr;
                    if (bXVar2 instanceof com.bytedance.sdk.openadsdk.core.Ta.eqN.bg) {
                        ((com.bytedance.sdk.openadsdk.core.Ta.eqN.bg) bXVar2).daV();
                    }
                    return true;
                }
            } else if (ldr()) {
                bg(false);
                com.bykv.vk.openvk.bg.bg.bg.eqN.bX bXVar3 = this.ldr;
                if (bXVar3 instanceof com.bytedance.sdk.openadsdk.core.Ta.eqN.bg) {
                    ((com.bytedance.sdk.openadsdk.core.Ta.eqN.bg) bXVar3).daV();
                }
                return true;
            }
        }
        return false;
    }

    public boolean tC() {
        return this.ldr != null;
    }

    public boolean rri() {
        com.bykv.vk.openvk.bg.bg.bg.eqN.bX bXVar = this.ldr;
        return bXVar != null && bXVar.PX() == null;
    }

    public boolean bg(long j, boolean z, java.util.Map<java.lang.String, java.lang.Object> map, com.bytedance.sdk.openadsdk.component.reward.IL.IL il) {
        boolean zBg = false;
        if (!tC()) {
            return false;
        }
        if (com.bytedance.sdk.openadsdk.core.model.xxp.bX(this.xxp.IL) || com.bytedance.sdk.openadsdk.core.model.xxp.eqN(this.xxp.IL)) {
            return true;
        }
        if (!z || !rri()) {
            bg(il);
        }
        try {
            zBg = bg(j, this.xxp.RJ);
        } catch (java.lang.Exception e) {
            android.util.Log.e("TTAD.RFVideoPlayerMag", "playVideo: ", e);
        }
        if (zBg && !z) {
            this.xxp.DDQ.bg(map);
        }
        return zBg;
    }

    public void bg(com.bytedance.sdk.openadsdk.component.reward.IL.IL il) {
        if (this.xxp.eo.get() || !this.xxp.txA || com.bytedance.sdk.openadsdk.core.model.rri.bX(this.xxp.IL)) {
            return;
        }
        if ((!com.bytedance.sdk.openadsdk.core.model.tuV.zx(this.xxp.IL) && com.bytedance.sdk.openadsdk.core.VzQ.eqN().Ta(java.lang.String.valueOf(this.xxp.ldr)) == 1 && this.xxp.Ja.eqN()) || com.bytedance.sdk.openadsdk.core.model.xxp.bX(this.xxp.IL) || com.bytedance.sdk.openadsdk.core.model.xxp.eqN(this.xxp.IL) || this.zx || !il.ldr()) {
            return;
        }
        this.xxp.bN.removeMessages(com.google.android.gms.nearby.messages.Strategy.TTL_SECONDS_DEFAULT);
        android.os.Message messageObtain = android.os.Message.obtain();
        messageObtain.what = com.google.android.gms.nearby.messages.Strategy.TTL_SECONDS_DEFAULT;
        this.xxp.bN.sendMessageDelayed(messageObtain, 5000L);
    }

    private boolean bg(long j, boolean z) {
        if (this.ldr == null || this.Kg.Dxa() == null) {
            return false;
        }
        java.lang.String strBg = com.bytedance.sdk.openadsdk.CacheDirFactory.getICacheDir(this.Kg.uV()).bg();
        java.io.File file = new java.io.File(strBg, this.Kg.Dxa().yDt());
        if (file.exists() && file.length() > 0) {
            this.IL = true;
        }
        com.bytedance.sdk.openadsdk.core.Ta.bg.IL ilBg = com.bytedance.sdk.openadsdk.core.model.tuV.bg(strBg, this.Kg);
        ilBg.IL(this.Kg.Ys());
        ilBg.bg(this.WR.getWidth());
        ilBg.IL(this.WR.getHeight());
        ilBg.bX(this.Kg.Ny());
        ilBg.bg(j);
        ilBg.bg(z);
        if (this.xxp.IL.bg() && !this.xxp.Ja.Kg() && com.bytedance.sdk.openadsdk.core.model.tuV.zx(this.Kg)) {
            ilBg.eqN = 1;
        }
        return this.ldr.bg(ilBg);
    }

    public void bX(boolean z) {
        this.bX = z;
    }

    public boolean kMt() {
        return this.bX;
    }

    public void JAA() {
        PX();
    }

    public void Ja() {
        try {
            if (IL()) {
                this.zx = true;
                Lq();
            }
        } catch (java.lang.Exception e) {
            com.bytedance.sdk.component.utils.PX.bg("TTAD.RFVideoPlayerMag", "onPause throw Exception :" + e.getMessage());
        }
    }

    public void bg(com.bytedance.sdk.openadsdk.core.Ta.eqN.IL il) {
        try {
            this.zx = false;
            if (ldr()) {
                daV();
                IL(il);
            } else if (eqN()) {
                yDt();
            }
        } catch (java.lang.Throwable th) {
            com.bytedance.sdk.component.utils.PX.bg("TTAD.RFVideoPlayerMag", "onContinue throw Exception :" + th.getMessage());
        }
    }

    public void bg(boolean z, com.bytedance.sdk.openadsdk.core.Ta.eqN.IL il, boolean z2) {
        if (!z2 || z || this.zx) {
            return;
        }
        if (eqN()) {
            yDt();
            android.util.Log.i("TTAD.RFVideoPlayerMag", "resumeOrRestartVideo: continue play");
        } else {
            daV();
            IL(il);
            android.util.Log.i("TTAD.RFVideoPlayerMag", "resumeOrRestartVideo: recreate video player & exec play");
        }
    }

    public boolean Uw() {
        com.bykv.vk.openvk.bg.bg.bg.eqN.bX bXVar = this.ldr;
        if (bXVar == null || bXVar.PX() == null) {
            return false;
        }
        return this.ldr.PX().bg();
    }

    protected void IL(com.bytedance.sdk.openadsdk.core.Ta.eqN.IL il) {
        if (!LZ() || il == null) {
            return;
        }
        il.bg(WR(), true);
    }

    public double DDQ() {
        long jEqN;
        com.bytedance.sdk.openadsdk.core.model.VzQ vzQWR = this.Kg.WR();
        if (com.bytedance.sdk.openadsdk.core.model.xxp.bX(this.Kg) && vzQWR != null) {
            jEqN = vzQWR.IL();
        } else if (com.bytedance.sdk.openadsdk.core.model.xxp.eqN(this.Kg) && vzQWR != null) {
            jEqN = vzQWR.eqN();
        } else {
            com.bykv.vk.openvk.bg.bg.bg.bX.IL ilDxa = this.Kg.Dxa();
            if (ilDxa != null) {
                return ilDxa.ldr() * ((double) ilDxa.tC());
            }
            return 0.0d;
        }
        return jEqN;
    }

    public void Uq() {
        com.bykv.vk.openvk.bg.bg.bg.eqN.bX bXVar = this.ldr;
        if (bXVar instanceof com.bytedance.sdk.openadsdk.core.Ta.eqN.bg) {
            ((com.bytedance.sdk.openadsdk.core.Ta.eqN.bg) bXVar).VJ();
        }
    }

    public android.view.View aGH() {
        com.bykv.vk.openvk.bg.bg.bg.eqN.bX bXVar = this.ldr;
        if (bXVar instanceof com.bytedance.sdk.openadsdk.core.Ta.eqN.bg) {
            return (android.view.View) ((com.bytedance.sdk.openadsdk.core.Ta.eqN.bg) bXVar).ayS();
        }
        return null;
    }

    public void VW() {
        com.bykv.vk.openvk.bg.bg.bg.eqN.bX bXVar = this.ldr;
        if (bXVar instanceof com.bytedance.sdk.openadsdk.core.Ta.eqN.bg) {
            ((com.bytedance.sdk.openadsdk.core.Ta.eqN.bg) bXVar).ZQc();
        }
    }

    public void VJ() {
        com.bykv.vk.openvk.bg.bg.bg.eqN.bX bXVar = this.ldr;
        if (bXVar instanceof com.bytedance.sdk.openadsdk.core.Ta.eqN.bg) {
            ((com.bytedance.sdk.openadsdk.core.Ta.eqN.bg) bXVar).LKE();
        }
    }

    public void eqN(boolean z) {
        this.VzQ = z;
        if (this.ldr instanceof com.bytedance.sdk.openadsdk.core.Ta.eqN.bg) {
            if (z) {
                ((com.bytedance.sdk.openadsdk.core.Ta.eqN.bg) this.ldr).IL(this.Kg.Dxa().tC());
            } else {
                this.Kg.Dxa().eo(1);
                ((com.bytedance.sdk.openadsdk.core.Ta.eqN.bg) this.ldr).IL(1);
            }
        }
    }

    public void bg(com.bytedance.sdk.openadsdk.core.Ta.eqN.bg.InterfaceC0142bg interfaceC0142bg) {
        this.tuV = interfaceC0142bg;
    }
}
