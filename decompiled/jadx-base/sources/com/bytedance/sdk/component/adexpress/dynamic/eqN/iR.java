package com.bytedance.sdk.component.adexpress.dynamic.eqN;

/* JADX INFO: loaded from: classes3.dex */
public class iR {
    public java.lang.String IL;
    public org.json.JSONObject bX;
    public int bg;
    private com.bytedance.sdk.component.adexpress.dynamic.eqN.ldr eqN;
    private java.lang.String ldr;
    private com.bytedance.sdk.component.adexpress.dynamic.eqN.zx zx;

    public iR(com.bytedance.sdk.component.adexpress.dynamic.eqN.zx zxVar) {
        this.zx = zxVar;
        this.bg = zxVar.bg();
        this.IL = zxVar.bX();
        this.bX = zxVar.zx().RiO();
        this.ldr = zxVar.eqN();
        if (com.bytedance.sdk.component.adexpress.eqN.bX() == 1) {
            this.eqN = zxVar.iR();
        } else {
            this.eqN = zxVar.zx();
        }
        if (com.bytedance.sdk.component.adexpress.eqN.IL()) {
            this.eqN = zxVar.zx();
        }
    }

    public int bg() {
        return (int) this.eqN.yDt();
    }

    public int IL() {
        return (int) this.eqN.xxp();
    }

    public int bX() {
        return (int) this.eqN.Lq();
    }

    public int eqN() {
        return (int) this.eqN.vb();
    }

    public float zx() {
        return this.eqN.VzQ();
    }

    public java.lang.String ldr() {
        if (this.bg != 0) {
            return "";
        }
        if (!android.text.TextUtils.isEmpty(this.IL)) {
            return this.IL;
        }
        return this.bX.optString(com.bytedance.sdk.component.adexpress.eqN.Kg.bX(com.bytedance.sdk.component.adexpress.eqN.bg()));
    }

    public int iR() {
        return bg(this.eqN.tC());
    }

    public int Kg() {
        java.lang.String strLZ = this.eqN.LZ();
        if (androidx.media3.extractor.text.ttml.TtmlNode.LEFT.equals(strLZ)) {
            return 17;
        }
        if (androidx.media3.extractor.text.ttml.TtmlNode.CENTER.equals(strLZ)) {
            return 4;
        }
        return androidx.media3.extractor.text.ttml.TtmlNode.RIGHT.equals(strLZ) ? 3 : 2;
    }

    public int WR() {
        int iKg = Kg();
        if (iKg == 4) {
            return 17;
        }
        return iKg == 3 ? androidx.core.view.GravityCompat.END : androidx.core.view.GravityCompat.START;
    }

    public java.lang.String eo() {
        int i = this.bg;
        return (i == 2 || i == 13) ? this.IL : "";
    }

    public java.lang.String VB() {
        return this.bg == 1 ? this.IL : "";
    }

    public java.lang.String PX() {
        return this.ldr;
    }

    public double Ta() {
        if (this.bg == 11) {
            try {
                double d = java.lang.Double.parseDouble(this.IL);
                return !com.bytedance.sdk.component.adexpress.eqN.IL() ? (int) d : d;
            } catch (java.lang.NumberFormatException unused) {
            }
        }
        return -1.0d;
    }

    public double yDt() {
        return this.eqN.tuV();
    }

    public float Lq() {
        return this.eqN.VB();
    }

    public int vb() {
        return bg(this.eqN.Ja());
    }

    public float xxp() {
        return this.eqN.PX();
    }

    public int VzQ() {
        return this.eqN.zU();
    }

    public int tuV() {
        return this.eqN.JxS();
    }

    public boolean Fy() {
        return this.eqN.uny();
    }

    public java.lang.String LZ() {
        return this.eqN.kMt();
    }

    public void bg(float f) {
        this.eqN.bg(f);
    }

    public boolean tC() {
        return this.eqN.bN();
    }

    public int rri() {
        return this.eqN.jz();
    }

    public java.lang.String kMt() {
        return this.eqN.CQc();
    }

    public java.lang.String JAA() {
        return this.eqN.Gih();
    }

    public long Ja() {
        return this.eqN.JaB();
    }

    public int Uw() {
        java.lang.String strCQc = this.eqN.CQc();
        if ("skip-with-time-skip-btn".equals(this.zx.IL()) || "skip".equals(this.zx.IL()) || android.text.TextUtils.equals("skip-with-countdowns-skip-btn", this.zx.IL())) {
            return 6;
        }
        if (!"skip-with-time-countdown".equals(this.zx.IL()) && !"skip-with-time".equals(this.zx.IL())) {
            if (this.bg == 10 && android.text.TextUtils.equals(this.eqN.uu(), com.json.z8.d)) {
                return 5;
            }
            if (jA() && hff()) {
                return 0;
            }
            if (jA()) {
                return 7;
            }
            if ("feedback-dislike".equals(this.zx.IL())) {
                return 3;
            }
            if (!android.text.TextUtils.isEmpty(strCQc) && !strCQc.equals("none")) {
                if (strCQc.equals("video") || (this.zx.bg() == 7 && android.text.TextUtils.equals(strCQc, com.adjust.sdk.Constants.NORMAL))) {
                    return (com.bytedance.sdk.component.adexpress.eqN.IL() && this.zx.zx() != null && this.zx.zx().yda()) ? 11 : 4;
                }
                if (strCQc.equals(com.adjust.sdk.Constants.NORMAL)) {
                    return 1;
                }
                return (strCQc.equals("creative") || "slide".equals(this.eqN.uu())) ? 2 : 0;
            }
        }
        return 0;
    }

    private boolean jA() {
        return (com.bytedance.sdk.component.adexpress.eqN.IL() && (this.zx.IL().contains("logo-union") || this.zx.IL().contains("logounion") || this.zx.IL().contains("logoad"))) || "logo-union".equals(this.zx.IL()) || "logounion".equals(this.zx.IL()) || "logoad".equals(this.zx.IL());
    }

    public int DDQ() {
        return bg(this.eqN.rri());
    }

    public double Uq() {
        return this.eqN.Kg();
    }

    public int aGH() {
        return this.eqN.bX();
    }

    public int VW() {
        return this.eqN.IL();
    }

    public int VJ() {
        return this.eqN.zx();
    }

    public int daV() {
        return this.eqN.eqN();
    }

    public int ayS() {
        return this.eqN.WR();
    }

    public java.lang.String ZQc() {
        return this.eqN.eo();
    }

    public java.lang.String LKE() {
        return this.eqN.uu();
    }

    private boolean hff() {
        if (com.bytedance.sdk.component.adexpress.eqN.IL()) {
            return false;
        }
        return (!android.text.TextUtils.isEmpty(this.IL) && this.IL.contains("adx:")) || com.bytedance.sdk.component.adexpress.dynamic.zx.VB.IL();
    }

    public static int bg(java.lang.String str) {
        java.lang.String[] strArrSplit;
        if (android.text.TextUtils.isEmpty(str)) {
            return androidx.core.view.ViewCompat.MEASURED_STATE_MASK;
        }
        if (str.equals(com.ironsource.y8.h.T)) {
            return 0;
        }
        if (str.charAt(0) == '#' && str.length() == 7) {
            return android.graphics.Color.parseColor(str);
        }
        if (str.charAt(0) == '#' && str.length() == 9) {
            return android.graphics.Color.parseColor(str);
        }
        if (str.startsWith("rgba") && (strArrSplit = str.substring(str.indexOf("(") + 1, str.indexOf(")")).split(",")) != null) {
            try {
                if (strArrSplit.length == 4) {
                    return (((int) ((java.lang.Float.parseFloat(strArrSplit[3]) * 255.0f) + 0.5f)) << 24) | (((int) java.lang.Float.parseFloat(strArrSplit[0])) << 16) | (((int) java.lang.Float.parseFloat(strArrSplit[1])) << 8) | ((int) java.lang.Float.parseFloat(strArrSplit[2])) | 0;
                }
            } catch (java.lang.NumberFormatException unused) {
                return 0;
            }
        }
        return androidx.core.view.ViewCompat.MEASURED_STATE_MASK;
    }

    public static float[] IL(java.lang.String str) {
        java.lang.String[] strArrSplit = str.substring(str.indexOf("(") + 1, str.indexOf(")")).split(",");
        return (strArrSplit == null || strArrSplit.length != 4) ? new float[]{0.0f, 0.0f, 0.0f, 0.0f} : new float[]{java.lang.Float.parseFloat(strArrSplit[0]), java.lang.Float.parseFloat(strArrSplit[1]), java.lang.Float.parseFloat(strArrSplit[2]), java.lang.Float.parseFloat(strArrSplit[3])};
    }

    public boolean bg(int i) {
        com.bytedance.sdk.component.adexpress.dynamic.eqN.zx zxVar = this.zx;
        if (zxVar == null) {
            return false;
        }
        if (i == 1) {
            this.eqN = zxVar.iR();
        } else {
            this.eqN = zxVar.zx();
        }
        return this.eqN != null;
    }

    public boolean CQc() {
        return this.eqN.Ny();
    }

    public int uu() {
        return this.eqN.kU();
    }

    public int qC() {
        return this.eqN.bOf();
    }

    public java.lang.String Dxa() {
        return this.eqN.LKE();
    }

    public boolean bN() {
        return this.eqN.gtr();
    }

    public int jz() {
        return this.eqN.iR();
    }

    public int Pae() {
        return this.eqN.ews();
    }

    public int RJ() {
        return this.eqN.JlG();
    }

    public int txA() {
        return this.eqN.IEI();
    }

    public int sVc() {
        return this.eqN.huT();
    }

    public boolean ApA() {
        return this.eqN.bu();
    }

    public java.lang.String GvG() {
        return this.eqN.Uq();
    }

    public java.lang.String lM() {
        return this.eqN.HXG();
    }

    public java.lang.String gXn() {
        return this.eqN.mZk();
    }

    public boolean GZ() {
        return this.eqN.Ta();
    }

    public boolean bCU() {
        return this.eqN.VW();
    }

    public java.lang.String Ld() {
        return this.eqN.aGH();
    }

    public int wS() {
        return this.eqN.VJ();
    }

    public int cZH() {
        return this.eqN.daV();
    }

    public double zCS() {
        return this.eqN.ayS();
    }

    public double Ys() {
        return this.eqN.ZQc();
    }

    public int dS() {
        return this.eqN.hi();
    }

    public java.lang.String RiO() {
        return this.eqN.qSG();
    }

    public java.lang.String Dt() {
        return this.eqN.ZyO();
    }

    public boolean Ny() {
        return this.eqN.ZTq();
    }

    public int bOf() {
        return this.eqN.rr();
    }

    public int kU() {
        return this.eqN.FFy();
    }

    public int qp() {
        return this.eqN.gCm();
    }

    public boolean eDa() {
        return this.eqN.bu();
    }

    public java.lang.String RFq() {
        return this.eqN.JAA();
    }
}
