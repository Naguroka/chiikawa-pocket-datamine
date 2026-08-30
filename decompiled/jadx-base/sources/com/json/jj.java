package com.json;

/* JADX INFO: loaded from: classes5.dex */
public class jj extends com.json.p7 {
    private static com.json.jj R;
    private java.lang.String P;
    private final com.json.vh Q = com.json.im.S().k();

    private jj() {
        this.H = "ironbeast";
        this.G = 2;
        this.I = com.json.mediationsdk.utils.IronSourceConstants.INTERSTITIAL_EVENT_TYPE;
        this.P = "";
    }

    public static synchronized com.json.jj i() {
        if (R == null) {
            com.json.jj jjVar = new com.json.jj();
            R = jjVar;
            jjVar.e();
        }
        return R;
    }

    @Override // com.json.p7
    protected int c(com.json.wb wbVar) {
        com.json.vh vhVar;
        com.ironsource.mediationsdk.IronSource.AD_UNIT ad_unit;
        int iF = f(wbVar.c());
        if (iF == com.ironsource.p7.e.BANNER.a()) {
            vhVar = this.Q;
            ad_unit = com.ironsource.mediationsdk.IronSource.AD_UNIT.BANNER;
        } else if (iF == com.ironsource.p7.e.NATIVE_AD.a()) {
            vhVar = this.Q;
            ad_unit = com.ironsource.mediationsdk.IronSource.AD_UNIT.NATIVE_AD;
        } else {
            vhVar = this.Q;
            ad_unit = com.ironsource.mediationsdk.IronSource.AD_UNIT.INTERSTITIAL;
        }
        return vhVar.a(ad_unit);
    }

    @Override // com.json.p7
    protected void d() {
        this.J.add(2001);
        this.J.add(2002);
        this.J.add(2003);
        this.J.add(2004);
        this.J.add(2200);
        this.J.add(2213);
        this.J.add(2211);
        this.J.add(2212);
        this.J.add(3001);
        this.J.add(java.lang.Integer.valueOf(com.json.mediationsdk.utils.IronSourceConstants.BN_CALLBACK_LOAD_ERROR));
        this.J.add(java.lang.Integer.valueOf(com.json.mediationsdk.utils.IronSourceConstants.BN_RELOAD));
        this.J.add(java.lang.Integer.valueOf(com.json.mediationsdk.utils.IronSourceConstants.BN_CALLBACK_RELOAD_ERROR));
        this.J.add(java.lang.Integer.valueOf(com.json.mediationsdk.utils.IronSourceConstants.BN_CALLBACK_RELOAD_SUCCESS));
        this.J.add(3002);
        this.J.add(java.lang.Integer.valueOf(com.json.mediationsdk.utils.IronSourceConstants.BN_INSTANCE_RELOAD));
        this.J.add(3005);
        this.J.add(3300);
        this.J.add(java.lang.Integer.valueOf(com.json.mediationsdk.utils.IronSourceConstants.BN_INSTANCE_RELOAD_SUCCESS));
        this.J.add(java.lang.Integer.valueOf(com.json.mediationsdk.utils.IronSourceConstants.BN_INSTANCE_RELOAD_ERROR));
        this.J.add(java.lang.Integer.valueOf(com.json.mediationsdk.utils.IronSourceConstants.BN_INSTANCE_UNEXPECTED_LOAD_SUCCESS));
        this.J.add(java.lang.Integer.valueOf(com.json.mediationsdk.utils.IronSourceConstants.BN_INSTANCE_UNEXPECTED_RELOAD_SUCCESS));
        this.J.add(3009);
        this.J.add(4001);
        this.J.add(java.lang.Integer.valueOf(com.json.mediationsdk.utils.IronSourceConstants.NT_CALLBACK_LOAD_ERROR));
        this.J.add(4002);
        this.J.add(4005);
        this.J.add(java.lang.Integer.valueOf(com.json.mediationsdk.utils.IronSourceConstants.NT_INSTANCE_LOAD_ERROR));
        this.J.add(java.lang.Integer.valueOf(com.json.mediationsdk.utils.IronSourceConstants.NT_INSTANCE_SHOW));
    }

    @Override // com.json.p7
    protected boolean d(com.json.wb wbVar) {
        int iC = wbVar.c();
        return iC == 2004 || iC == 2005 || iC == 2204 || iC == 2301 || iC == 2300 || iC == 3009 || iC == 3502 || iC == 3501 || iC == 4005 || iC == 4009 || iC == 4502 || iC == 4501;
    }

    @Override // com.json.p7
    protected java.lang.String e(int i) {
        return this.P;
    }

    @Override // com.json.p7
    protected void f(com.json.wb wbVar) {
        this.P = wbVar.b().optString("placement");
    }

    @Override // com.json.p7
    protected boolean j(com.json.wb wbVar) {
        return false;
    }
}
