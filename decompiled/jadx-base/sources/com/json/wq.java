package com.json;

/* JADX INFO: loaded from: classes5.dex */
public class wq extends com.json.p7 {
    private static com.json.wq R;
    private java.lang.String P;
    private final com.json.vh Q = com.json.im.S().k();

    private wq() {
        this.H = "outcome";
        this.G = 3;
        this.I = com.json.mediationsdk.utils.IronSourceConstants.REWARDED_VIDEO_EVENT_TYPE;
        this.P = "";
    }

    public static synchronized com.json.wq i() {
        if (R == null) {
            com.json.wq wqVar = new com.json.wq();
            R = wqVar;
            wqVar.e();
        }
        return R;
    }

    @Override // com.json.p7
    protected int c(com.json.wb wbVar) {
        return this.Q.a(com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO);
    }

    @Override // com.json.p7
    protected void d() {
        this.J.add(1000);
        this.J.add(1001);
        this.J.add(1002);
        this.J.add(1003);
        this.J.add(1200);
        this.J.add(java.lang.Integer.valueOf(com.json.mediationsdk.utils.IronSourceConstants.RV_INSTANCE_SHOW_CHANCE));
        this.J.add(1210);
        this.J.add(1211);
        this.J.add(java.lang.Integer.valueOf(com.json.mediationsdk.utils.IronSourceConstants.RV_INSTANCE_LOAD_FAILED_REASON));
        this.J.add(1213);
        this.J.add(java.lang.Integer.valueOf(com.json.mediationsdk.utils.IronSourceConstants.RV_MEDIATION_LOAD_ERROR));
    }

    @Override // com.json.p7
    protected boolean d(com.json.wb wbVar) {
        int iC = wbVar.c();
        return iC == 14 || iC == 514 || iC == 515 || iC == 516 || iC == 1003 || iC == 1005 || iC == 1203 || iC == 1010 || iC == 1301 || iC == 1302;
    }

    @Override // com.json.p7
    protected java.lang.String e(int i) {
        return (i == 15 || (i >= 300 && i < 400)) ? this.P : "";
    }

    @Override // com.json.p7
    protected void f(com.json.wb wbVar) {
        if (wbVar.c() == 15 || (wbVar.c() >= 300 && wbVar.c() < 400)) {
            this.P = wbVar.b().optString("placement");
        }
    }

    @Override // com.json.p7
    protected boolean j(com.json.wb wbVar) {
        return false;
    }
}
