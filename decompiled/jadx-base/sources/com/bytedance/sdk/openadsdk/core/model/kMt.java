package com.bytedance.sdk.openadsdk.core.model;

/* JADX INFO: loaded from: classes4.dex */
public class kMt extends com.bytedance.sdk.openadsdk.core.model.tuV {
    private boolean ApA;
    private java.lang.String DCn;
    private com.bytedance.sdk.openadsdk.AdSlot Dt;
    private int Dxa;
    private java.lang.String FFy;
    private boolean Fb;
    private java.lang.String GR;
    private java.util.Map<java.lang.String, java.lang.Object> GZ;
    private java.lang.String GZy;
    private java.lang.String Gih;
    private int GvG;
    private com.bytedance.sdk.openadsdk.core.model.tC Hn;
    private com.bytedance.sdk.openadsdk.core.VB.ldr.bg IE;
    private int IEI;
    private org.json.JSONObject IGR;
    private java.lang.String JAA;
    private int JMw;
    private java.lang.String Ja;
    private com.bytedance.sdk.openadsdk.core.model.eqN JaB;
    private org.json.JSONObject JxS;
    private int KRc;
    public long Kg;
    private java.lang.String Ld;
    private int Lq;
    private int NHy;
    private com.bytedance.sdk.openadsdk.core.model.zx NU;
    private int Ny;
    private boolean OLh;
    private com.bykv.vk.openvk.bg.bg.bg.bX.IL Pae;
    private com.bykv.vk.openvk.bg.bg.bg.bX.IL RJ;
    private boolean Rh;
    private int Ta;
    private com.bytedance.sdk.openadsdk.core.model.bX Uq;
    private int Uw;
    private java.lang.String VHL;
    private java.lang.String VJ;
    private int VW;
    private com.bytedance.sdk.openadsdk.core.model.Ja Vm;
    private java.lang.String VzQ;
    private com.bytedance.sdk.openadsdk.core.model.PX ZyO;
    private com.bytedance.sdk.openadsdk.core.model.VB aGH;
    private com.bytedance.sdk.openadsdk.core.VB.ldr.bg aMs;
    private java.lang.String ayS;
    private com.bytedance.sdk.openadsdk.core.model.tuV.bg bCU;
    private int bN;
    private int bu;
    private int dRo;
    private java.lang.String daV;
    private java.lang.String dtS;
    private com.bytedance.sdk.openadsdk.core.model.rri ews;
    private boolean fE;
    private int fkt;
    private boolean gJ;
    private int gXn;
    private int gtr;
    private java.lang.String huT;
    private org.json.JSONObject jA;
    private java.lang.String jf;
    private com.bykv.vk.openvk.bg.bg.bg.bX.IL jz;
    private java.lang.String kMt;
    private java.lang.String kU;
    private boolean lM;
    private java.lang.String mLT;
    private com.bytedance.sdk.openadsdk.core.model.VzQ ovC;
    private java.lang.String pA;
    private long qC;
    private int qSG;
    private int rgo;
    private int rr;
    private java.lang.String rri;
    private boolean sVc;
    private java.lang.String tC;
    private java.lang.String tuV;
    private boolean txA;
    private int uV;
    private java.lang.String uny;
    private com.bytedance.sdk.openadsdk.core.model.Lq vb;
    private org.json.JSONObject wS;
    private boolean waE;
    private com.bytedance.sdk.openadsdk.core.model.Ta wq;
    private int xFs;
    private int xZ;
    private com.bytedance.sdk.openadsdk.core.model.Lq xxp;
    private int yDt;
    private volatile boolean yda;
    private com.bytedance.sdk.openadsdk.core.PX.bg zU;
    private final java.util.List<com.bytedance.sdk.openadsdk.core.model.Lq> WR = new java.util.ArrayList();
    private final java.util.List<java.lang.String> eo = new java.util.ArrayList();
    private final java.util.List<com.bytedance.sdk.openadsdk.FilterWord> VB = new java.util.ArrayList();
    private final com.bytedance.sdk.openadsdk.utils.daV PX = com.bytedance.sdk.openadsdk.utils.daV.IL();
    public boolean iR = false;
    private java.util.List<java.lang.String> Fy = new java.util.ArrayList();
    private java.util.List<java.lang.String> LZ = new java.util.ArrayList();
    private java.lang.String DDQ = "0";
    private java.lang.String ZQc = "";
    private int LKE = 0;
    private int CQc = 2;
    private int uu = 0;
    private int cZH = 0;
    private int zCS = 1;
    private com.bytedance.sdk.openadsdk.core.model.WR Ys = new com.bytedance.sdk.openadsdk.core.model.WR();
    private int dS = com.applovin.sdk.AppLovinErrorCodes.UNABLE_TO_PRECACHE_RESOURCES;
    private int RiO = 0;
    private int bOf = 1;
    private int qp = 0;
    private int eDa = 0;
    private int RFq = 0;
    private int hff = 1;
    private int ZTq = 1;
    private float gCm = 100.0f;
    private int HXG = 2;
    private int hi = 1;
    private int eK = 0;
    private int JlG = -1;
    private long mZk = -1;
    private int Fx = 0;
    private boolean dFf = false;
    private int PC = 0;
    private int bZw = 50;
    private int vTg = -1;

    public static boolean iR(com.bytedance.sdk.openadsdk.core.model.tuV tuv) {
        if (tuv == null) {
            return false;
        }
        int iBOf = tuv.bOf();
        return tuv.HXG() || iBOf == 5 || iBOf == 15 || iBOf == 50;
    }

    private static double ldr(org.json.JSONObject jSONObject) {
        if (jSONObject != null) {
            return jSONObject.optDouble("pack_time", 0.0d);
        }
        return 0.0d;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            com.bytedance.sdk.openadsdk.core.model.tuV tuv = (com.bytedance.sdk.openadsdk.core.model.tuV) obj;
            if (this.DDQ.equals(tuv.Ys()) && this.ayS.equals(tuv.Ny())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public boolean eqN() {
        return this.txA;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public void bg(boolean z) {
        this.txA = z;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public boolean zx() {
        return this.sVc;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public void IL(boolean z) {
        this.sVc = z;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public void bX(boolean z) {
        this.ApA = z;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public java.lang.String ldr() {
        return this.GR;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public void zx(java.lang.String str) {
        this.GR = str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public java.lang.String iR() {
        return this.Gih;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public void ldr(java.lang.String str) {
        this.Gih = str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public boolean Kg() {
        return (android.text.TextUtils.isEmpty(ldr()) || android.text.TextUtils.isEmpty(iR())) ? false : true;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public com.bytedance.sdk.openadsdk.core.model.VzQ WR() {
        return this.ovC;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public void bg(com.bytedance.sdk.openadsdk.core.model.zx zxVar) {
        this.NU = zxVar;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public com.bytedance.sdk.openadsdk.core.model.zx eo() {
        return this.NU;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public void bg(com.bytedance.sdk.openadsdk.core.model.VzQ vzQ) {
        this.ovC = vzQ;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public boolean NU() {
        return this.gJ;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public void iR(boolean z) {
        this.gJ = z;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public void Ja(java.lang.String str) {
        this.DCn = str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public java.lang.String Hn() {
        return this.DCn;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public void uu(int i) {
        this.JMw = i;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public void Uw(java.lang.String str) {
        this.VHL = str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public java.lang.String Ky() {
        return this.VHL;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public boolean NC() {
        java.util.List<java.lang.Integer> listBX;
        return (LKE() == null || (listBX = LKE().bX()) == null || !listBX.contains(57)) ? false : true;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public java.lang.String Cv() {
        return this.dtS;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public boolean yN() {
        return this.fE;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public com.bytedance.sdk.openadsdk.core.VB.ldr.bg Az() {
        return this.aMs;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public void bg(com.bytedance.sdk.openadsdk.core.VB.ldr.bg bgVar) {
        this.aMs = bgVar;
        com.bytedance.sdk.openadsdk.core.VB.bg.IL.bg().bg(bgVar, "endcard");
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public void IL(com.bytedance.sdk.openadsdk.core.VB.ldr.bg bgVar) {
        this.IE = bgVar;
        com.bytedance.sdk.openadsdk.core.VB.bg.IL.bg().bg(bgVar, "endcard");
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public com.bytedance.sdk.openadsdk.core.VB.ldr.bg hSp() {
        return this.IE;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public void qC(int i) {
        this.PC = i;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public int ULi() {
        return this.PC;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public void wF() {
        this.waE = true;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public boolean dY() {
        return this.waE;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public void sbN() {
        this.Fb = true;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public boolean GJw() {
        return this.Fb;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public int GEa() {
        try {
            org.json.JSONObject jSONObjectDCn = DCn();
            if (jSONObjectDCn != null) {
                return jSONObjectDCn.optInt("rec_clk", 0);
            }
            return 0;
        } catch (java.lang.Exception unused) {
            return 0;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public boolean XQ() {
        return this.OLh;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public void Kg(boolean z) {
        this.OLh = z;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public boolean eq() {
        return this.Rh;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public void WR(boolean z) {
        this.Rh = z;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public void Dxa(int i) {
        this.bZw = i;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public int jB() {
        return this.bZw;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public java.lang.String MM() {
        org.json.JSONObject jSONObjectDCn;
        if (this.pA == null && (jSONObjectDCn = DCn()) != null) {
            this.pA = jSONObjectDCn.optString(androidx.media3.exoplayer.upstream.CmcdConfiguration.KEY_CONTENT_ID, "");
        }
        return this.pA;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public void DDQ(java.lang.String str) {
        this.GZy = str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public java.lang.String jUS() {
        return this.GZy;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public int fVE() {
        if (this.vTg < 0) {
            try {
                org.json.JSONObject jSONObjectDCn = DCn();
                if (jSONObjectDCn != null) {
                    this.vTg = jSONObjectDCn.optInt("is_drop_to_retargeting_sample", 0);
                } else {
                    this.vTg = 0;
                }
            } catch (java.lang.Throwable unused) {
                this.vTg = 0;
            }
        }
        return this.vTg;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public void bN(int i) {
        this.dRo = i;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public boolean dX() {
        if (this.JlG <= 0) {
            this.JlG = Fx();
        }
        int i = this.JlG;
        return (i == 7 || i == 8) && !iR(this) && xxp() != 21 && this.dRo == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public void jwM() {
        com.bykv.vk.openvk.bg.bg.bg.bX.IL il = this.jz;
        if (il == null || android.text.TextUtils.isEmpty(il.PX())) {
            return;
        }
        try {
            if (this.jz.PX().contains("style_id")) {
                this.fE = true;
                this.dtS = android.net.Uri.parse(this.jz.PX()).getQueryParameters("style_id").get(0);
            } else {
                this.fE = false;
            }
        } catch (java.lang.Throwable th) {
            com.bytedance.sdk.component.utils.PX.IL(th.getMessage());
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public com.bytedance.sdk.openadsdk.core.model.eqN VB() {
        return this.JaB;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public void bg(com.bytedance.sdk.openadsdk.core.model.eqN eqn) {
        this.JaB = eqn;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public int PX() {
        com.bytedance.sdk.openadsdk.core.model.eqN eqn = this.JaB;
        if (eqn == null) {
            return 2;
        }
        return eqn.bg();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public int Ta() {
        if (NC()) {
            return 5;
        }
        if (eK()) {
            return 4;
        }
        com.bytedance.sdk.openadsdk.core.model.eqN eqn = this.JaB;
        if (eqn == null) {
            return 1;
        }
        return eqn.IL();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public long yDt() {
        com.bytedance.sdk.openadsdk.core.model.eqN eqn = this.JaB;
        if (eqn == null) {
            return 0L;
        }
        return eqn.bX();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public com.bytedance.sdk.openadsdk.core.model.rri Lq() {
        return this.ews;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public void bg(com.bytedance.sdk.openadsdk.core.model.rri rriVar) {
        this.ews = rriVar;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public int vb() {
        return this.yDt;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public void bg(int i) {
        bg(i, -1);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public int xxp() {
        return this.Lq;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public void IL(int i) {
        this.yDt = i;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public void bg(int i, int i2) {
        this.Lq = i;
        this.yDt = i;
        if (this.Dt == null) {
            this.yDt = 0;
            return;
        }
        if (i2 <= 0) {
            i2 = Fx();
        }
        if (this.Dt.getNativeAdType() == 3 || this.Dt.getDurationSlotType() == 3 || i2 == 3) {
            this.yDt = 14;
            return;
        }
        if (this.Dt.getNativeAdType() == 7 || this.Dt.getNativeAdType() == 8 || this.Dt.getDurationSlotType() == 7 || this.Dt.getDurationSlotType() == 8 || i2 == 7 || i2 == 8) {
            if (com.bytedance.sdk.openadsdk.core.model.rri.bX(this)) {
                this.yDt = 12;
                return;
            }
            if (com.bytedance.sdk.openadsdk.core.model.rri.IL(this)) {
                this.yDt = 9;
                return;
            }
            if (this.Lq == 5 && !com.bytedance.sdk.openadsdk.core.model.xxp.bX(this)) {
                this.yDt = 7;
            }
            if (this.Lq == 6 && !com.bytedance.sdk.openadsdk.core.model.xxp.IL(this)) {
                this.yDt = 7;
            }
            if (this.Lq == 8 && UfS() != 100) {
                this.yDt = 7;
            }
            if (this.Lq == 19 && android.text.TextUtils.isEmpty(this.VzQ)) {
                this.yDt = 7;
            }
            if (this.Lq == 20 && android.text.TextUtils.isEmpty(this.VzQ)) {
                this.yDt = 7;
            }
            if (i < 5) {
                this.yDt = 7;
                return;
            }
            return;
        }
        if (com.bytedance.sdk.openadsdk.core.model.rri.IL(this)) {
            this.yDt = 4;
            return;
        }
        if (this.Lq == 4 && !com.bytedance.sdk.openadsdk.core.model.rri.IL(this)) {
            this.yDt = 0;
        }
        if (i >= 5) {
            this.yDt = 0;
            return;
        }
        if (this.Lq == 2 && jz() != 3) {
            this.yDt = 0;
        } else if (i == 0 || (i == 1 && jz() != 3)) {
            this.yDt = 0;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public int VzQ() {
        return this.hi;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public void bg(double d) {
        if (d != 2.0d && d != 1.0d) {
            this.hi = 1;
        } else {
            this.hi = (int) d;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public int tuV() {
        return this.HXG;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public void IL(double d) {
        if (d != 2.0d && d != 1.0d) {
            this.HXG = 2;
        } else {
            this.HXG = (int) d;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public java.lang.String Fy() {
        return this.ZQc;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public void iR(java.lang.String str) {
        this.ZQc = str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public int LZ() {
        return this.LKE;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public void bX(int i) {
        this.LKE = i;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public int tC() {
        int i = this.yDt;
        if (i == 5 || i == 6 || i == 33) {
            return 1;
        }
        if (Fb()) {
            return 2;
        }
        return this.CQc;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public void eqN(int i) {
        this.CQc = i;
    }

    public int eD() {
        return this.qp;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public void zx(int i) {
        this.qp = i;
    }

    public java.lang.String Uzu() {
        return this.FFy;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public void Kg(java.lang.String str) {
        this.FFy = str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public boolean rri() {
        return this.qp == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public int kMt() {
        return this.RFq;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public void ldr(int i) {
        this.RFq = i;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public int JAA() {
        return this.cZH;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public void iR(int i) {
        this.cZH = i;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public int Ja() {
        return this.zCS;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public void Kg(int i) {
        this.zCS = i;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public java.lang.String Uw() {
        return this.jf;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public void WR(java.lang.String str) {
        this.jf = str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public int DDQ() {
        return this.eDa;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public void WR(int i) {
        this.eDa = i;
    }

    public int IN() {
        return this.bOf;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public void eo(int i) {
        this.bOf = i;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public int Uq() {
        if (HXG()) {
            return 5;
        }
        if (jf() != 100.0f || tC() == 2) {
            return 0;
        }
        return this.RiO;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public void VB(int i) {
        this.RiO = i;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public com.bytedance.sdk.openadsdk.core.model.WR aGH() {
        return this.Ys;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public void bg(com.bytedance.sdk.openadsdk.core.model.WR wr) {
        this.Ys = wr;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public com.bytedance.sdk.openadsdk.AdSlot VW() {
        return this.Dt;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public void bg(com.bytedance.sdk.openadsdk.AdSlot adSlot) {
        this.Dt = adSlot;
    }

    public int mm() {
        return this.Ny;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public void PX(int i) {
        this.Ny = i;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public int VJ() {
        return this.dS;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public void Ta(int i) {
        this.dS = i;
    }

    public int oT() {
        return this.hff;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public void yDt(int i) {
        this.hff = i;
    }

    public int OO() {
        return this.xFs;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public void Lq(int i) {
        this.xFs = i;
    }

    public int UfS() {
        return this.bN;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public void vb(int i) {
        this.bN = i;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public java.lang.String daV() {
        return this.Ld;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public void eo(java.lang.String str) {
        this.Ld = str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public boolean ayS() {
        return UfS() == 100 || this.yDt == 20;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public int ZQc() {
        return this.gXn;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public void xxp(int i) {
        this.gXn = i;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public com.bytedance.sdk.openadsdk.core.model.tuV.bg LKE() {
        return this.bCU;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public void bg(com.bytedance.sdk.openadsdk.core.model.tuV.bg bgVar) {
        this.bCU = bgVar;
        com.bytedance.sdk.component.adexpress.bg.bX.eqN eqnVvL = VvL();
        if (eqnVvL != null && !CQc()) {
            com.bytedance.sdk.component.adexpress.bg.IL.IL.bg(eqnVvL);
        }
        if (bgVar == null || android.text.TextUtils.isEmpty(bgVar.Lq())) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.VB.bg.IL.bg().bg(XdK(), "ad");
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public void bg(com.bytedance.sdk.openadsdk.core.model.Ja ja) {
        this.Vm = ja;
        if (ja == null || android.text.TextUtils.isEmpty(ja.bX())) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.VB.bg.IL.bg().bg(Ga(), "adv3");
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public boolean CQc() {
        com.bytedance.sdk.openadsdk.core.model.tuV.bg bgVar = this.bCU;
        if (bgVar != null) {
            return !android.text.TextUtils.isEmpty(bgVar.Ta());
        }
        int i = this.cZH;
        return i == 9 || i == 10;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public void IL(org.json.JSONObject jSONObject) {
        this.IGR = jSONObject;
    }

    public org.json.JSONObject ArQ() {
        return this.IGR;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public com.bytedance.sdk.openadsdk.core.model.Ja uu() {
        return this.Vm;
    }

    private com.bytedance.sdk.openadsdk.core.VB.ldr.bg XdK() {
        com.bytedance.sdk.openadsdk.core.model.tuV.bg bgVarLKE = LKE();
        if (bgVarLKE == null) {
            return null;
        }
        return com.bytedance.sdk.openadsdk.core.model.tuV.bg.IL(bgVarLKE, java.lang.String.valueOf(IGR()));
    }

    private com.bytedance.sdk.openadsdk.core.VB.ldr.bg Ga() {
        com.bytedance.sdk.openadsdk.core.model.Ja jaUu = uu();
        if (jaUu == null) {
            return null;
        }
        return new com.bytedance.sdk.openadsdk.core.VB.ldr.bg().bg(jaUu.bg()).IL(jaUu.IL()).bX(jaUu.bX()).eqN(jaUu.eqN()).zx(IGR() + "_v3");
    }

    public com.bytedance.sdk.component.adexpress.bg.bX.eqN VvL() {
        com.bytedance.sdk.openadsdk.core.model.tuV.bg bgVarLKE = LKE();
        if (bgVarLKE == null) {
            return null;
        }
        return com.bytedance.sdk.openadsdk.core.model.tuV.bg.bg(bgVarLKE, java.lang.String.valueOf(IGR()));
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public int qC() {
        com.bytedance.sdk.openadsdk.core.model.PX px = this.ZyO;
        if (px == null) {
            return 0;
        }
        return px.bg();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public com.bykv.vk.openvk.bg.bg.bg.bX.IL Dxa() {
        return this.jz;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public void bg(com.bykv.vk.openvk.bg.bg.bg.bX.IL il) {
        this.jz = il;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public void bg(com.bytedance.sdk.openadsdk.core.model.PX px) {
        this.ZyO = px;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public java.lang.String bN() {
        return this.VJ;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public void VB(java.lang.String str) {
        this.VJ = str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public void PX(java.lang.String str) {
        this.Ja = str;
    }

    public java.lang.String DS() {
        return this.Ja;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public int jz() {
        return this.Ta;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public boolean Pae() {
        return this.fkt == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public void VzQ(int i) {
        this.fkt = i;
    }

    public int nIU() {
        return this.fkt;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public void tuV(int i) {
        this.Ta = i;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public boolean RJ() {
        return this.xZ == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public void Fy(int i) {
        this.xZ = i;
    }

    public int gE() {
        return this.xZ;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public void LZ(int i) {
        this.NHy = i;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public int txA() {
        return this.NHy;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public com.bytedance.sdk.openadsdk.core.model.Lq sVc() {
        return this.vb;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public void bg(com.bytedance.sdk.openadsdk.core.model.Lq lq) {
        bg(lq, com.bytedance.sdk.openadsdk.core.model.tuV.ldr);
        java.lang.String strAGH = aGH(lq.bg());
        if (!android.text.TextUtils.isEmpty(strAGH)) {
            lq.IL(strAGH);
        }
        this.vb = lq;
    }

    private java.lang.String aGH(java.lang.String str) {
        try {
            if (android.text.TextUtils.isEmpty(str)) {
                return null;
            }
            return com.bytedance.sdk.component.zx.bX.bX.bX.bg(str);
        } catch (java.lang.Throwable th) {
            com.bytedance.sdk.component.utils.PX.bg("MaterialMeta", "generate icon key error", th.getMessage());
            return null;
        }
    }

    private void bg(com.bytedance.sdk.openadsdk.core.model.Lq lq, int i) {
        if (lq != null) {
            try {
                if (android.text.TextUtils.isEmpty(lq.bg())) {
                    return;
                }
                if (lq.IL() == 0 && lq.bX() == 0) {
                    lq.bg(i);
                    lq.IL(i);
                    return;
                }
                if (lq.IL() == 0) {
                    if (lq.bX() > i) {
                        lq.IL(i);
                        lq.bg(i);
                        return;
                    } else {
                        lq.bg(lq.bX());
                        return;
                    }
                }
                if (lq.bX() == 0) {
                    if (lq.IL() > i) {
                        lq.IL(i);
                        lq.bg(i);
                        return;
                    } else {
                        lq.IL(lq.IL());
                        return;
                    }
                }
                if (lq.IL() > lq.bX()) {
                    if (lq.IL() > i) {
                        lq.IL((int) (i / (lq.IL() / lq.bX())));
                        lq.bg(i);
                        return;
                    }
                    return;
                }
                if (lq.bX() > i) {
                    lq.bg((int) (i * (lq.IL() / lq.bX())));
                    lq.IL(i);
                }
            } catch (java.lang.Throwable unused) {
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public com.bytedance.sdk.openadsdk.core.model.Lq ApA() {
        return this.xxp;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public void IL(com.bytedance.sdk.openadsdk.core.model.Lq lq) {
        this.xxp = lq;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public java.lang.String GvG() {
        return this.VzQ;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public void Ta(java.lang.String str) {
        this.VzQ = str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public java.util.List<com.bytedance.sdk.openadsdk.core.model.Lq> lM() {
        return this.WR;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public void bX(com.bytedance.sdk.openadsdk.core.model.Lq lq) {
        this.WR.add(lq);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public java.lang.String gXn() {
        return this.tuV;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public void yDt(java.lang.String str) {
        this.tuV = str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public java.util.List<java.lang.String> GZ() {
        return this.Fy;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public java.util.List<java.lang.String> bCU() {
        return this.LZ;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public java.util.List<java.lang.String> Ld() {
        return this.eo;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public java.lang.String wS() {
        return this.tC;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public void Lq(java.lang.String str) {
        this.tC = str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public java.lang.String cZH() {
        return this.rri;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public void vb(java.lang.String str) {
        this.rri = str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public java.lang.String zCS() {
        if (!android.text.TextUtils.isEmpty(this.kMt)) {
            return this.kMt;
        }
        android.content.Context contextBg = com.bytedance.sdk.openadsdk.core.VzQ.bg();
        int iJz = jz();
        if (iJz != 2 && iJz != 3) {
            if (iJz == 4) {
                if (contextBg != null) {
                    return com.bytedance.sdk.component.utils.Fy.bg(contextBg, "tt_video_download_apk");
                }
                return this.kMt;
            }
            if (iJz != 8) {
                return this.kMt;
            }
        }
        if (contextBg != null) {
            return com.bytedance.sdk.component.utils.Fy.bg(contextBg, "tt_video_mobile_go_detail");
        }
        return this.kMt;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public void xxp(java.lang.String str) {
        this.kMt = str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public java.lang.String Ys() {
        return this.DDQ;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public void VzQ(java.lang.String str) {
        this.DDQ = str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public java.lang.String dS() {
        return this.daV;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public void tuV(java.lang.String str) {
        this.daV = str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public com.bytedance.sdk.openadsdk.core.model.bX RiO() {
        return this.Uq;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public void bg(com.bytedance.sdk.openadsdk.core.model.bX bXVar) {
        this.Uq = bXVar;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public com.bytedance.sdk.openadsdk.core.model.VB Dt() {
        return this.aGH;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public void bg(com.bytedance.sdk.openadsdk.core.model.VB vb) {
        this.aGH = vb;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public java.lang.String Ny() {
        return this.ayS;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public void Fy(java.lang.String str) {
        this.ayS = str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public int bOf() {
        return this.VW;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public void tC(int i) {
        this.VW = i;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public java.util.List<com.bytedance.sdk.openadsdk.FilterWord> kU() {
        return this.VB;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public void bg(com.bytedance.sdk.openadsdk.FilterWord filterWord) {
        this.VB.add(filterWord);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public java.lang.String qp() {
        return this.huT;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public void LZ(java.lang.String str) {
        this.huT = str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public long eDa() {
        return this.qC;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public void IL(long j) {
        this.qC = j;
    }

    public int PD() {
        return this.Dxa;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public void rri(int i) {
        this.Dxa = i;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public boolean RFq() {
        return this.lM;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public void eqN(boolean z) {
        this.lM = z;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public java.util.Map<java.lang.String, java.lang.Object> jA() {
        return this.GZ;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public void bg(java.util.Map<java.lang.String, java.lang.Object> map) {
        this.GZ = map;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public org.json.JSONObject hff() {
        return this.jA;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public void bX(org.json.JSONObject jSONObject) {
        this.jA = jSONObject;
    }

    public java.lang.String mD() {
        return this.kU;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public void tC(java.lang.String str) {
        this.kU = str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public int xFs() {
        if (this.ZTq != 2) {
            this.ZTq = 1;
        }
        return this.ZTq;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public void kMt(int i) {
        this.ZTq = i;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public float jf() {
        if (this.gCm <= 0.0f) {
            this.gCm = 100.0f;
        }
        return (this.gCm * 1000.0f) / 1000.0f;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public void bg(float f) {
        this.gCm = f;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public boolean huT() {
        if (this.WR.isEmpty()) {
            return false;
        }
        if (this.VW == 4 && this.WR.size() < 3) {
            return false;
        }
        java.util.Iterator<com.bytedance.sdk.openadsdk.core.model.Lq> it = this.WR.iterator();
        while (it.hasNext()) {
            if (!it.next().zx()) {
                return false;
            }
        }
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public boolean ZyO() {
        return !HXG() && sP() == 1;
    }

    public int sP() {
        return this.uu;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public void JAA(int i) {
        this.uu = i;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public void eqN(org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        this.Ta = 4;
        this.DDQ = jSONObject.optString("id");
        this.VJ = jSONObject.optString("source");
        com.bytedance.sdk.openadsdk.core.model.bX bXVar = new com.bytedance.sdk.openadsdk.core.model.bX();
        this.Uq = bXVar;
        bXVar.bX(jSONObject.optString("pkg_name"));
        this.Uq.IL(jSONObject.optString("name"));
        this.Uq.bg(jSONObject.optString("download_url"));
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public org.json.JSONObject ZTq() {
        java.lang.Object objBX;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("interaction_type", jz());
            jSONObject.put(eqN, nIU());
            jSONObject.put("interaction_method", xxp());
            jSONObject.put(bX, gE());
            jSONObject.put(zx, txA());
            jSONObject.put("target_url", GvG());
            jSONObject.put("app_log_url", dS());
            jSONObject.put("gecko_id", qp());
            jSONObject.put("extension", ews());
            jSONObject.put("ad_id", Ys());
            jSONObject.put("source", bN());
            jSONObject.put("app_name", DS());
            jSONObject.put("screenshot", RFq());
            jSONObject.put("dislike_control", sP());
            jSONObject.put("play_bar_show_time", VJ());
            jSONObject.put("play_bar_style", Uq());
            jSONObject.put("if_block_lp", eD());
            jSONObject.put("cache_sort", oT());
            jSONObject.put("if_sp_cache", OO());
            jSONObject.put("render_control", tC());
            jSONObject.put("mrc_report", this.KRc);
            jSONObject.put("isMrcReportFinish", this.yda);
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put(com.ironsource.y8.h.G0, tuV());
            jSONObject2.put("other", VzQ());
            jSONObject.put("set_click_type", jSONObject2);
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            jSONObject3.put("reward_name", Fy());
            jSONObject3.put("reward_amount", LZ());
            jSONObject.put("reward_data", jSONObject3);
            if (!android.text.TextUtils.isEmpty(ldr()) && !android.text.TextUtils.isEmpty(iR())) {
                org.json.JSONObject jSONObject4 = new org.json.JSONObject();
                jSONObject4.put("adchoices_icon", ldr());
                jSONObject4.put("adchoices_url", iR());
                jSONObject.put("dsp_adchoices", jSONObject4);
            }
            com.bytedance.sdk.openadsdk.core.model.Lq lqSVc = sVc();
            if (lqSVc != null && !android.text.TextUtils.isEmpty(lqSVc.bg())) {
                org.json.JSONObject jSONObject5 = new org.json.JSONObject();
                jSONObject5.put("url", lqSVc.bg());
                jSONObject5.put("height", lqSVc.bX());
                jSONObject5.put("width", lqSVc.IL());
                jSONObject.put(com.ironsource.y8.h.H0, jSONObject5);
            }
            com.bytedance.sdk.openadsdk.core.model.Lq lqApA = ApA();
            if (lqApA != null && !android.text.TextUtils.isEmpty(lqApA.bg())) {
                org.json.JSONObject jSONObject6 = new org.json.JSONObject();
                jSONObject6.put("url", lqApA.bg());
                jSONObject6.put("height", lqApA.bX());
                jSONObject6.put("width", lqApA.IL());
                jSONObject.put("cover_image", jSONObject6);
            }
            java.lang.Object objHff = hff();
            if (objHff != null) {
                jSONObject.put("session_params", objHff);
            }
            com.bytedance.sdk.openadsdk.core.model.WR wrAGH = aGH();
            if (wrAGH != null) {
                org.json.JSONObject jSONObject7 = new org.json.JSONObject();
                jSONObject7.put("click_upper_content_area", wrAGH.bg);
                jSONObject7.put("click_upper_non_content_area", wrAGH.IL);
                jSONObject7.put("click_lower_content_area", wrAGH.bX);
                jSONObject7.put("click_lower_non_content_area", wrAGH.eqN);
                jSONObject7.put("click_button_area", wrAGH.zx);
                jSONObject7.put("click_video_area", wrAGH.ldr);
                jSONObject.put("click_area", jSONObject7);
            }
            com.bytedance.sdk.openadsdk.core.model.zx zxVarEo = eo();
            if (zxVarEo != null) {
                jSONObject.put("arbitrage_interceptor_params", zxVarEo.Kg());
            }
            com.bytedance.sdk.openadsdk.AdSlot adSlotVW = VW();
            if (adSlotVW != null) {
                jSONObject.put("adslot", adSlotVW.toJsonObj());
            }
            java.util.List<com.bytedance.sdk.openadsdk.core.model.Lq> listLM = lM();
            if (listLM != null) {
                org.json.JSONArray jSONArray = new org.json.JSONArray();
                for (com.bytedance.sdk.openadsdk.core.model.Lq lq : listLM) {
                    org.json.JSONObject jSONObject8 = new org.json.JSONObject();
                    jSONObject8.put("url", lq.bg());
                    jSONObject8.put("height", lq.bX());
                    jSONObject8.put("width", lq.IL());
                    jSONObject8.put("image_preview", lq.ldr());
                    jSONObject8.put("image_key", lq.iR());
                    jSONArray.put(jSONObject8);
                }
                jSONObject.put("image", jSONArray);
            }
            java.util.List<java.lang.String> listGZ = GZ();
            if (listGZ != null) {
                org.json.JSONArray jSONArray2 = new org.json.JSONArray();
                java.util.Iterator<java.lang.String> it = listGZ.iterator();
                while (it.hasNext()) {
                    jSONArray2.put(it.next());
                }
                jSONObject.put("show_url", jSONArray2);
            }
            java.util.List<java.lang.String> listBCU = bCU();
            if (listBCU != null) {
                org.json.JSONArray jSONArray3 = new org.json.JSONArray();
                java.util.Iterator<java.lang.String> it2 = listBCU.iterator();
                while (it2.hasNext()) {
                    jSONArray3.put(it2.next());
                }
                jSONObject.put("click_url", jSONArray3);
            }
            java.util.List<java.lang.String> listLd = Ld();
            if (listLd != null) {
                org.json.JSONArray jSONArray4 = new org.json.JSONArray();
                java.util.Iterator<java.lang.String> it3 = listLd.iterator();
                while (it3.hasNext()) {
                    jSONArray4.put(it3.next());
                }
                jSONObject.put("play_start", jSONArray4);
            }
            jSONObject.put("phone_num", gXn());
            jSONObject.put(com.ironsource.y8.h.D0, wS());
            jSONObject.put("description", cZH());
            jSONObject.put("ext", Ny());
            jSONObject.put("image_mode", bOf());
            jSONObject.put("cover_click_area", UfS());
            jSONObject.put("intercept_flag", mm());
            jSONObject.put("button_text", zCS());
            jSONObject.put("ad_logo", IN());
            jSONObject.put("video_adaptation", DDQ());
            jSONObject.put("feed_video_opentype", kMt());
            jSONObject.put("orientation", xFs());
            jSONObject.put("aspect_ratio", jf());
            com.bytedance.sdk.openadsdk.core.model.bX bXVarRiO = RiO();
            if (bXVarRiO != null) {
                org.json.JSONObject jSONObject9 = new org.json.JSONObject();
                jSONObject9.put("app_name", bXVarRiO.IL());
                jSONObject9.put(com.ironsource.y8.h.V, bXVarRiO.bX());
                jSONObject9.put("download_url", bXVarRiO.bg());
                jSONObject9.put(com.google.firebase.analytics.FirebaseAnalytics.Param.SCORE, bXVarRiO.eqN());
                jSONObject9.put("comment_num", bXVarRiO.zx());
                jSONObject9.put("app_size", bXVarRiO.ldr());
                jSONObject9.put("app_category", bXVarRiO.iR());
                jSONObject.put("app", jSONObject9);
            }
            com.bytedance.sdk.openadsdk.core.model.VB vbDt = Dt();
            if (vbDt != null) {
                org.json.JSONObject jSONObject10 = new org.json.JSONObject();
                jSONObject10.put("deeplink_url", vbDt.bg());
                jSONObject10.put("fallback_url", vbDt.IL());
                jSONObject10.put("fallback_type", vbDt.bX());
                jSONObject.put("deep_link", jSONObject10);
            }
            com.bytedance.sdk.openadsdk.core.model.tC tCVarFW = fW();
            if (tCVarFW != null && (objBX = tCVarFW.bX()) != null) {
                jSONObject.put("oem", objBX);
            }
            java.util.List<com.bytedance.sdk.openadsdk.FilterWord> listKU = kU();
            if (listKU != null) {
                org.json.JSONArray jSONArray5 = new org.json.JSONArray();
                java.util.Iterator<com.bytedance.sdk.openadsdk.FilterWord> it4 = listKU.iterator();
                while (it4.hasNext()) {
                    org.json.JSONObject jSONObjectIL = IL(it4.next());
                    if (jSONObjectIL != null) {
                        jSONArray5.put(jSONObjectIL);
                    }
                }
                jSONObject.put("filter_words", jSONArray5);
            }
            Lq().bg(jSONObject);
            jSONObject.put("count_down", PD());
            jSONObject.put("expiration_time", eDa());
            com.bykv.vk.openvk.bg.bg.bg.bX.IL ilWq = wq();
            if (ilWq != null) {
                jSONObject.put("video", ilWq.VzQ());
            }
            com.bykv.vk.openvk.bg.bg.bg.bX.IL ilGR = GR();
            if (ilGR != null) {
                jSONObject.put("h265_video", ilGR.VzQ());
            }
            jSONObject.put("video_encode_type", qSG());
            org.json.JSONObject jSONObject11 = new org.json.JSONObject();
            jSONObject11.put("if_send_click", qC());
            jSONObject.put("download_conf", jSONObject11);
            if (jA() != null) {
                org.json.JSONObject jSONObject12 = new org.json.JSONObject();
                java.util.Set<java.util.Map.Entry<java.lang.String, java.lang.Object>> setEntrySet = jA().entrySet();
                if (!setEntrySet.isEmpty()) {
                    for (java.util.Map.Entry<java.lang.String, java.lang.Object> entry : setEntrySet) {
                        jSONObject12.put(entry.getKey(), entry.getValue());
                    }
                }
                jSONObject.put("media_ext", jSONObject12);
            }
            com.bytedance.sdk.openadsdk.core.model.tuV.bg bgVarLKE = LKE();
            if (bgVarLKE != null) {
                org.json.JSONObject jSONObject13 = new org.json.JSONObject();
                jSONObject13.put("id", bgVarLKE.ldr());
                jSONObject13.put("md5", bgVarLKE.iR());
                jSONObject13.put("url", bgVarLKE.Kg());
                jSONObject13.put("data", bgVarLKE.WR());
                jSONObject13.put("diff_data", bgVarLKE.eo());
                jSONObject13.put("version", bgVarLKE.zx());
                jSONObject13.put("dynamic_creative", bgVarLKE.VB());
                jSONObject13.put("engine_version", bgVarLKE.Ta());
                jSONObject13.put("ugen_data", bgVarLKE.xxp());
                jSONObject13.put("ugen_md5", bgVarLKE.vb());
                jSONObject13.put("ugen_url", bgVarLKE.Lq());
                jSONObject.put("tpl_info", jSONObject13);
            }
            com.bytedance.sdk.openadsdk.core.model.Ja ja = this.Vm;
            if (ja != null) {
                jSONObject.put("tpl_info_v3", ja.ldr());
            }
            jSONObject.put("dynamic_creative", ArQ());
            jSONObject.put("creative_extra", daV());
            jSONObject.put("market_url", mD());
            jSONObject.put("auction_price", Uw());
            jSONObject.put("ad_info", Uzu());
            jSONObject.put("is_package_open", FFy());
            jSONObject.put("playable_duration_time", gtr());
            jSONObject.put("playable_endcard_close_time", IEI());
            jSONObject.put("endcard_close_time", bu());
            org.json.JSONObject jSONObject14 = new org.json.JSONObject();
            jSONObject14.put("render_sequence", JAA());
            jSONObject14.put("backup_render_control", Ja());
            jSONObject14.put("reserve_time", KRc());
            jSONObject14.put("render_thread", yda());
            jSONObject.put("render", jSONObject14);
            if (this.ovC == null) {
                com.bytedance.sdk.openadsdk.core.model.VzQ vzQ = new com.bytedance.sdk.openadsdk.core.model.VzQ();
                this.ovC = vzQ;
                vzQ.bg("");
                this.ovC.bg(10L);
                this.ovC.IL(20L);
                this.ovC.bX(10L);
                this.ovC.eqN(20L);
            }
            org.json.JSONObject jSONObject15 = new org.json.JSONObject();
            jSONObject15.put("onlylp_loading_maxtime", this.ovC.bg());
            jSONObject15.put("straight_lp_showtime", this.ovC.IL());
            jSONObject15.put("onlyagg_loading_maxtime", this.ovC.bX());
            jSONObject15.put("straight_agg_showtime", this.ovC.eqN());
            jSONObject15.put("loading_text", this.ovC.zx());
            jSONObject.put("interaction_method_params", jSONObject15);
            org.json.JSONObject jSONObject16 = new org.json.JSONObject();
            jSONObject16.put("splash_clickarea", PX());
            jSONObject16.put("splash_layout_id", Ta());
            jSONObject16.put("load_wait_time", yDt());
            jSONObject.put("splash_control", jSONObject16);
            if (eK()) {
                jSONObject.put("dsp_html", this.uny);
            }
            if (HXG()) {
                jSONObject.put("vast_json", this.zU.eo());
            }
            jSONObject.put("dsp_material_type", OLh());
            jSONObject.put("deep_link_appname", this.JAA);
            jSONObject.put("landing_page_download_clicktype", this.Uw);
            com.bytedance.sdk.openadsdk.core.model.Ta ta = this.wq;
            if (ta != null) {
                jSONObject.put("dsp_style", ta.zx());
            }
            jSONObject.put("jump_probability", this.JMw);
            jSONObject.put("identificationOverlayContent", this.VHL);
            if (this.aMs != null) {
                org.json.JSONObject jSONObject17 = new org.json.JSONObject();
                jSONObject17.put("endcard", this.aMs.bg(this.IE));
                jSONObject.put("ugen", jSONObject17);
            }
            jSONObject.put("preload_h5_type", ULi());
            jSONObject.put("hasReportShow", this.OLh);
            jSONObject.put("endcard_creative", this.GZy);
            jSONObject.put("image_stay", this.dRo);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public org.json.JSONObject gCm() {
        org.json.JSONObject jSONObjectZTq = ZTq();
        org.json.JSONObject jSONObjectVzQ = com.bytedance.sdk.openadsdk.core.settings.xxp.zU().VzQ(java.lang.String.valueOf(IGR()));
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            jSONArray.put(jSONObjectZTq);
            jSONObject.put("creatives", jSONArray);
            jSONObject.put("did", 1);
            jSONObject.put("processing_time_ms", 100);
            jSONObject.put("request_id", "aaaaaaaa-aaaa-aaaa-aaaa-aaaaaaaaaaaa");
            jSONObject.put("s_receive_ts", 1);
            jSONObject.put("s_send_ts", 1);
            jSONObject.put("status_code", 20000);
            jSONObject.put("core_settings", jSONObjectVzQ);
        } catch (org.json.JSONException e) {
            com.bytedance.sdk.component.utils.PX.bg("MaterialMeta", "toJsonObjPlus", e.getMessage());
        }
        return jSONObject;
    }

    private org.json.JSONObject IL(com.bytedance.sdk.openadsdk.FilterWord filterWord) {
        if (filterWord == null) {
            return null;
        }
        try {
            if (filterWord.isValid()) {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("id", filterWord.getId());
                jSONObject.put("name", filterWord.getName());
                jSONObject.put("is_selected", filterWord.getIsSelected());
                if (filterWord.hasSecondOptions()) {
                    org.json.JSONArray jSONArray = new org.json.JSONArray();
                    java.util.Iterator<com.bytedance.sdk.openadsdk.FilterWord> it = filterWord.getOptions().iterator();
                    while (it.hasNext()) {
                        jSONArray.put(IL(it.next()));
                    }
                    if (jSONArray.length() > 0) {
                        jSONObject.put("options", jSONArray);
                    }
                }
                return jSONObject;
            }
        } catch (java.lang.Throwable unused) {
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public int FFy() {
        return this.rr;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public void Ja(int i) {
        this.rr = i;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public int gtr() {
        int i = this.gtr;
        if (i > 0) {
            return i;
        }
        return 20;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public void Uw(int i) {
        this.gtr = i;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public int IEI() {
        return this.IEI;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public void DDQ(int i) {
        this.IEI = i;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public int bu() {
        return this.bu;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public void Uq(int i) {
        this.bu = i;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public boolean HXG() {
        int i = this.Fx;
        return (i == 1 || i == 3) && hi() != null;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public com.bytedance.sdk.openadsdk.core.PX.bg hi() {
        return this.zU;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public void bg(com.bytedance.sdk.openadsdk.core.PX.bg bgVar) {
        this.zU = bgVar;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public boolean eK() {
        return this.Fx == 2;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public java.lang.String rgo() {
        return this.uny;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public void rri(java.lang.String str) {
        this.uny = str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public int ovC() {
        org.json.JSONObject jSONObject = this.JxS;
        if (jSONObject != null) {
            return jSONObject.optInt("easy_playable_skip_duration", 0);
        }
        return 0;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public org.json.JSONObject ews() {
        return this.JxS;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public void zx(org.json.JSONObject jSONObject) {
        this.JxS = jSONObject;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public boolean zU() {
        return this.KRc == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public void aGH(int i) {
        this.KRc = i;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public void uny() {
        this.yda = true;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public boolean JxS() {
        return this.yda;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public int KRc() {
        return this.uV;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public void VW(int i) {
        this.uV = java.lang.Math.max(0, i);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public int yda() {
        return this.qSG;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public void VJ(int i) {
        this.qSG = i;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public void bg(com.bytedance.sdk.openadsdk.core.model.Ta ta) {
        this.wq = ta;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public com.bytedance.sdk.openadsdk.core.model.Ta JlG() {
        return this.wq;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public void daV(int i) {
        this.GvG = i;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public int mZk() {
        return this.GvG;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public com.bytedance.sdk.component.WR.IL.bg mLT() {
        com.bytedance.sdk.component.WR.IL.bg bgVar = new com.bytedance.sdk.component.WR.IL.bg();
        bgVar.bg(this.gXn);
        bgVar.IL(this.DDQ);
        bgVar.bg(Ny());
        return bgVar;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public int uV() {
        return this.eK;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public void ayS(int i) {
        this.eK = i;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public int qSG() {
        return this.rgo;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public void ZQc(int i) {
        this.rgo = i;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public com.bykv.vk.openvk.bg.bg.bg.bX.IL wq() {
        return this.RJ;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public void IL(com.bykv.vk.openvk.bg.bg.bg.bX.IL il) {
        this.RJ = il;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public com.bykv.vk.openvk.bg.bg.bg.bX.IL GR() {
        return this.Pae;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public void bX(com.bykv.vk.openvk.bg.bg.bg.bX.IL il) {
        this.Pae = il;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public java.lang.String Gih() {
        return this.JAA;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public void kMt(java.lang.String str) {
        this.JAA = str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public int JaB() {
        return this.Uw;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public void LKE(int i) {
        this.Uw = i;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public boolean gJ() {
        com.bykv.vk.openvk.bg.bg.bg.bX.IL il = this.jz;
        return il == null || il.tuV() != 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public org.json.JSONObject DCn() {
        if (this.wS == null) {
            try {
                if (!android.text.TextUtils.isEmpty(this.ayS)) {
                    this.wS = new org.json.JSONObject(this.ayS);
                }
            } catch (org.json.JSONException e) {
                com.bytedance.sdk.component.utils.PX.bg("MaterialMeta", e.getMessage());
            }
        }
        return this.wS;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public int Fx() {
        if (this.JlG < 0) {
            org.json.JSONObject jSONObjectDCn = DCn();
            if (jSONObjectDCn != null) {
                this.JlG = jSONObjectDCn.optInt("ad_slot_type", 0);
            } else {
                this.JlG = 0;
            }
        }
        return this.JlG;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public int JMw() {
        return this.JlG;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public long VHL() {
        if (this.mZk < 0) {
            org.json.JSONObject jSONObjectDCn = DCn();
            if (jSONObjectDCn != null) {
                this.mZk = jSONObjectDCn.optLong("ad_id", 0L);
            } else {
                this.mZk = 0L;
            }
        }
        return this.mZk;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public boolean dtS() {
        return Fx() == 3 || Fx() == 4;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public boolean fE() {
        return Fx() == 7;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public boolean aMs() {
        return Fx() == 8;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public boolean IE() {
        return Fx() == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public boolean Vm() {
        return Fx() == 5;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public int IGR() {
        org.json.JSONObject jSONObjectDCn = DCn();
        if (jSONObjectDCn != null) {
            return jSONObjectDCn.optInt("rit", 0);
        }
        return 0;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public double dFf() {
        return ldr(DCn());
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public java.lang.String JAA(java.lang.String str) {
        org.json.JSONObject jSONObjectDCn = DCn();
        return jSONObjectDCn != null ? jSONObjectDCn.optString("rit", str) : str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public java.lang.String PC() {
        com.bytedance.sdk.openadsdk.core.model.bX bXVarRiO = RiO();
        if (bXVarRiO == null || android.text.TextUtils.isEmpty(bXVarRiO.bg())) {
            return null;
        }
        return bXVarRiO.bg();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public java.lang.String waE() {
        org.json.JSONObject jSONObjectDCn;
        java.lang.String strOptString = this.mLT;
        if (android.text.TextUtils.isEmpty(strOptString) && (jSONObjectDCn = DCn()) != null) {
            strOptString = jSONObjectDCn.optString("req_id", "");
            Uq(strOptString);
        }
        return strOptString == null ? "" : strOptString;
    }

    public void Uq(java.lang.String str) {
        this.mLT = str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public boolean Fb() {
        return VW() != null && VW().getDurationSlotType() == 8 && eK();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public int OLh() {
        return this.Fx;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public void CQc(int i) {
        this.Fx = i;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public boolean Rh() {
        int i = this.yDt;
        return (i == 2 || i == 1) && 3 == this.Ta;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public boolean bZw() {
        com.bytedance.sdk.openadsdk.core.model.Ta ta;
        return HXG() && !vTg() && (ta = this.wq) != null && ta.bg() == 1;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002a  */
    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public boolean pA() {
        int iIL;
        if (!vTg()) {
            int iNextInt = new java.util.Random().nextInt(100);
            if (HXG()) {
                com.bytedance.sdk.openadsdk.core.model.Ta ta = this.wq;
                if (ta != null) {
                    iIL = ta.IL();
                } else {
                    iIL = 0;
                }
            } else if (com.bytedance.sdk.openadsdk.core.model.rri.IL(this)) {
                iIL = 0;
            } else {
                iIL = this.JMw;
            }
            if (iNextInt < iIL) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public boolean GZy() {
        if (HXG() && !vTg()) {
            int iNextInt = new java.util.Random().nextInt(100);
            com.bytedance.sdk.openadsdk.core.model.Ta ta = this.wq;
            if (ta != null && iNextInt < ta.bX()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public boolean vTg() {
        return this.PX.bg > 0;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public com.bytedance.sdk.openadsdk.utils.daV dRo() {
        return this.PX;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public void fkt() {
        this.PX.eqN();
        iR(false);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public long xZ() {
        return this.Kg;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public void bX(long j) {
        this.Kg = j;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public boolean NHy() {
        return this.iR;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public void ldr(boolean z) {
        this.iR = z;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public void zx(boolean z) {
        this.dFf = z;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public boolean rr() {
        return this.dFf;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public void bg(com.bytedance.sdk.openadsdk.core.model.tC tCVar) {
        this.Hn = tCVar;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public com.bytedance.sdk.openadsdk.core.model.tC fW() {
        return this.Hn;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public boolean kCH() {
        return this.bg;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public boolean zqp() {
        return this.IL;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tuV
    public void eo(boolean z) {
        this.IL = z;
    }
}
