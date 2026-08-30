package com.bytedance.sdk.component.adexpress.dynamic.eqN;

/* JADX INFO: loaded from: classes3.dex */
public class ldr {
    private java.lang.String ApA;
    private int CQc;
    private java.lang.String DCn;
    private double DDQ;
    private int Dt;
    private int Dxa;
    private boolean FFy;
    private java.lang.String Fx;
    private java.lang.String Fy;
    private int GR;
    private boolean GZ;
    private java.lang.String Gih;
    private boolean GvG;
    private org.json.JSONObject HXG;
    private double IEI;
    private float IL;
    private boolean JAA;
    private int Ja;
    private java.lang.String JaB;
    private int JlG;
    private int JxS;
    private int KRc;
    private float Kg;
    private int LKE;
    private java.lang.String LZ;
    private org.json.JSONObject Ld;
    private java.lang.String Lq;
    private int Ny;
    private double PX;
    private boolean Pae;
    private int RFq;
    private int RJ;
    private int RiO;
    private java.lang.String Ta;
    private double Uq;
    private int Uw;
    private double VB;
    private java.lang.String VJ;
    private java.lang.String VW;
    private java.lang.String VzQ;
    private float WR;
    private int Ys;
    private boolean ZQc;
    private boolean ZTq;
    private int ZyO;
    private java.lang.String aGH;
    private java.lang.String ayS;
    private java.lang.String bCU;
    private double bN;
    private java.lang.String bOf;
    private float bX;
    private float bg;
    private org.json.JSONObject bu;
    private boolean cZH;
    private int dS;
    private java.lang.String daV;
    private int eDa;
    private java.lang.String eK;
    private float eo;
    private float eqN;
    private int ews;
    private boolean gCm;
    private long gJ = -1;
    private boolean gXn;
    private boolean gtr;
    private java.util.List<com.bytedance.sdk.component.adexpress.dynamic.eqN.bg> hff;
    private int hi;
    private int huT;
    private float iR;
    private int jA;
    private int jf;
    private int jz;
    private java.lang.String kMt;
    private java.lang.String kU;
    private boolean lM;
    private float ldr;
    private java.lang.String mLT;
    private boolean mZk;
    private org.json.JSONObject ovC;
    private int qC;
    private int qSG;
    private boolean qp;
    private boolean rgo;
    private int rr;
    private java.lang.String rri;
    private int sVc;
    private java.lang.String tC;
    private java.lang.String tuV;
    private boolean txA;
    private boolean uV;
    private int uny;
    private int uu;
    private java.lang.String vb;
    private int wS;
    private int wq;
    private int xFs;
    private java.lang.String xxp;
    private java.lang.String yDt;
    private java.lang.String yda;
    private int zCS;
    private int zU;
    private boolean zx;

    public static com.bytedance.sdk.component.adexpress.dynamic.eqN.ldr bg(org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        com.bytedance.sdk.component.adexpress.dynamic.eqN.ldr ldrVar = new com.bytedance.sdk.component.adexpress.dynamic.eqN.ldr();
        ldrVar.IL(jSONObject.optString("adType", "embeded"));
        ldrVar.Lq(jSONObject.optString("clickArea", "creative"));
        ldrVar.vb(jSONObject.optString("clickTigger", com.json.z8.d));
        ldrVar.bX(jSONObject.optString(androidx.media3.extractor.text.ttml.TtmlNode.ATTR_TTS_FONT_FAMILY, "PingFangSC"));
        ldrVar.eqN(jSONObject.optString(androidx.media3.extractor.text.ttml.TtmlNode.ATTR_TTS_TEXT_ALIGN, androidx.media3.extractor.text.ttml.TtmlNode.LEFT));
        ldrVar.zx(jSONObject.optString("color", "#999999"));
        ldrVar.ldr(jSONObject.optString("bgColor", com.ironsource.y8.h.T));
        ldrVar.iR(jSONObject.optString("bgImgUrl", ""));
        ldrVar.Uw(jSONObject.optString("bgImgData", ""));
        ldrVar.Kg(jSONObject.optString("borderColor", "#000000"));
        ldrVar.WR(jSONObject.optString("borderStyle", "solid"));
        ldrVar.eo(jSONObject.optString("heightMode", "auto"));
        ldrVar.VB(jSONObject.optString("widthMode", "fixed"));
        ldrVar.PX(jSONObject.optString("interactText", ""));
        ldrVar.bX(jSONObject.optBoolean("isShowBgControl", false));
        ldrVar.Ta(jSONObject.optString("interactBgColor", ""));
        org.json.JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("interactPosition");
        if (jSONObjectOptJSONObject != null) {
            ldrVar.iR(jSONObjectOptJSONObject.optInt("translateY", 0));
            ldrVar.Kg(jSONObjectOptJSONObject.optInt("translateX", 0));
            ldrVar.eqN(jSONObjectOptJSONObject.optDouble("scaleX", 0.0d));
            ldrVar.zx(jSONObjectOptJSONObject.optDouble("scaleY", 0.0d));
        }
        ldrVar.yDt(jSONObject.optString("interactType", ""));
        ldrVar.zx(jSONObject.optInt("interactSlideDirection", -1));
        ldrVar.xxp(jSONObject.optString("justifyHorizontal", "space-around"));
        ldrVar.VzQ(jSONObject.optString("justifyVertical", "flex-start"));
        ldrVar.IL(jSONObject.optDouble("timingStart"));
        ldrVar.bX(jSONObject.optDouble("timingEnd"));
        ldrVar.eqN((float) jSONObject.optDouble("width", 0.0d));
        ldrVar.bX((float) jSONObject.optDouble("height", 0.0d));
        ldrVar.bg((float) jSONObject.optDouble("borderRadius", 0.0d));
        ldrVar.IL((float) jSONObject.optDouble("borderSize", 0.0d));
        ldrVar.IL(jSONObject.optBoolean("interactValidate", false));
        ldrVar.WR((float) jSONObject.optDouble(androidx.media3.extractor.text.ttml.TtmlNode.ATTR_TTS_FONT_SIZE, 0.0d));
        ldrVar.zx((float) jSONObject.optDouble("paddingBottom", 0.0d));
        ldrVar.ldr((float) jSONObject.optDouble("paddingLeft", 0.0d));
        ldrVar.iR((float) jSONObject.optDouble("paddingRight", 0.0d));
        ldrVar.Kg((float) jSONObject.optDouble("paddingTop", 0.0d));
        ldrVar.eqN(jSONObject.optBoolean("lineFeed", false));
        ldrVar.WR(jSONObject.optInt("lineCount", 0));
        ldrVar.ldr(jSONObject.optDouble("lineHeight", 1.2d));
        ldrVar.yDt(jSONObject.optInt("letterSpacing", 0));
        ldrVar.zx(jSONObject.optBoolean("isDataFixed", false));
        ldrVar.Lq(jSONObject.optInt(androidx.media3.extractor.text.ttml.TtmlNode.ATTR_TTS_FONT_WEIGHT));
        ldrVar.ldr(jSONObject.optBoolean("lineLimit"));
        ldrVar.vb(jSONObject.optInt(com.ironsource.y8.h.L));
        ldrVar.tuV(jSONObject.optString("align"));
        ldrVar.iR(jSONObject.optBoolean("useLeft"));
        ldrVar.Kg(jSONObject.optBoolean("useRight"));
        ldrVar.WR(jSONObject.optBoolean("useTop"));
        ldrVar.eo(jSONObject.optBoolean("useBottom"));
        ldrVar.Fy(jSONObject.optString("data"));
        ldrVar.IL(jSONObject.optJSONObject("i18n"));
        ldrVar.PX(jSONObject.optInt("marginLeft"));
        ldrVar.Ta(jSONObject.optInt("marginRight"));
        ldrVar.eo(jSONObject.optInt("marginTop"));
        ldrVar.VB(jSONObject.optInt("marginBottom"));
        ldrVar.xxp(jSONObject.optInt("tagMaxCount"));
        ldrVar.VB(jSONObject.optBoolean("allowTextFlow"));
        ldrVar.VzQ(jSONObject.optInt("textFlowType"));
        ldrVar.tuV(jSONObject.optInt("textFlowDuration"));
        ldrVar.Fy(jSONObject.optInt(androidx.media3.extractor.text.ttml.TtmlNode.LEFT));
        ldrVar.LZ(jSONObject.optInt(androidx.media3.extractor.text.ttml.TtmlNode.RIGHT));
        ldrVar.tC(jSONObject.optInt("top"));
        ldrVar.rri(jSONObject.optInt("bottom"));
        ldrVar.LZ(jSONObject.optString("alignItems", "flex-start"));
        ldrVar.tC(jSONObject.optString("direction", ""));
        ldrVar.bg(jSONObject.optBoolean("loop", false));
        ldrVar.kMt(jSONObject.optInt("zIndex"));
        ldrVar.Uq(jSONObject.optInt("interactVisibleTime"));
        ldrVar.JAA(jSONObject.optInt("interactHiddenTime"));
        ldrVar.Ta(jSONObject.optBoolean("interactEnableMask"));
        ldrVar.yDt(jSONObject.optBoolean("interactWontHide"));
        ldrVar.bg(jSONObject.optString("bgGradient"));
        ldrVar.VW(jSONObject.optInt("areaType"));
        ldrVar.VJ(jSONObject.optInt("interactSlideThreshold", 0));
        ldrVar.ZQc(jSONObject.optInt("interactBottomDistance", com.bytedance.sdk.component.adexpress.eqN.IL() ? 0 : 120));
        ldrVar.VzQ(jSONObject.optBoolean("openPlayableLandingPage", false));
        ldrVar.bX(jSONObject.optJSONObject("video"));
        ldrVar.eqN(jSONObject.optJSONObject("image"));
        ldrVar.daV(jSONObject.optInt("borderShadowExtent"));
        ldrVar.Lq(jSONObject.optBoolean("bgGauseBlur"));
        ldrVar.ayS(jSONObject.optInt("bgGauseBlurRadius"));
        ldrVar.vb(jSONObject.optBoolean("showTimeProgress", false));
        ldrVar.xxp(jSONObject.optBoolean("showPlayButton", false));
        ldrVar.bg(jSONObject.optDouble("bgColorCg", 0.0d));
        ldrVar.ldr(jSONObject.optInt("bgMaterialCenterCalcColor", 0));
        ldrVar.IL(jSONObject.optInt("borderTopLeftRadius", 0));
        ldrVar.bg(jSONObject.optInt("borderTopRightRadius", 0));
        ldrVar.eqN(jSONObject.optInt("borderBottomLeftRadius", 0));
        ldrVar.bX(jSONObject.optInt("borderBottomRightRadius", 0));
        ldrVar.zx(jSONObject.optJSONObject("interactI18n"));
        ldrVar.kMt(jSONObject.optString("imageObjectFit"));
        ldrVar.JAA(jSONObject.optString("interactTitle"));
        ldrVar.aGH(jSONObject.optInt("interactTextPositionTop"));
        ldrVar.rri(jSONObject.optString("imageLottieTosPath"));
        ldrVar.PX(jSONObject.optBoolean("animationsLoop"));
        ldrVar.Ja(jSONObject.optInt("lottieAppNameMaxLength"));
        ldrVar.DDQ(jSONObject.optInt("lottieAdDescMaxLength"));
        ldrVar.Uw(jSONObject.optInt("lottieAdTitleMaxLength"));
        try {
            org.json.JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("animations");
            if (jSONArrayOptJSONArray != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    org.json.JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i);
                    com.bytedance.sdk.component.adexpress.dynamic.eqN.bg bgVar = new com.bytedance.sdk.component.adexpress.dynamic.eqN.bg();
                    bgVar.bX(jSONObject2.optString("animationType"));
                    bgVar.bg(jSONObject2.optDouble("animationDuration"));
                    bgVar.IL(jSONObject2.optDouble("animationScaleX"));
                    bgVar.bX(jSONObject2.optDouble("animationScaleY"));
                    bgVar.eqN(jSONObject2.optString("animationTimeFunction"));
                    bgVar.eqN(jSONObject2.optDouble("animationDelay"));
                    bgVar.ldr(jSONObject2.optInt("animationIterationCount"));
                    bgVar.zx(jSONObject2.optString("animationDirection"));
                    bgVar.zx(jSONObject2.optDouble("animationInterval"));
                    bgVar.bg(jSONObject2.optInt("animationBorderWidth"));
                    bgVar.bg(jSONObject2.optLong(com.ironsource.y8.h.W));
                    bgVar.IL(jSONObject2.optInt("animationEffectWidth"));
                    bgVar.bX(jSONObject2.optInt("animationSwing", 1));
                    bgVar.eqN(jSONObject2.optInt("animationTranslateX"));
                    bgVar.zx(jSONObject2.optInt("animationTranslateY"));
                    bgVar.IL(jSONObject2.optString("animationRippleBackgroundColor"));
                    bgVar.bg(jSONObject2.optString("animationScaleDirection"));
                    bgVar.iR(jSONObject2.optInt("animationFadeStart"));
                    bgVar.Kg(jSONObject2.optInt("animationFadeEnd"));
                    bgVar.ldr(jSONObject2.optString("animationFillMode"));
                    bgVar.WR(jSONObject2.optInt("animationBounceHeight"));
                    if (ldrVar.tuV() > 0.0d) {
                        bgVar.eqN(bgVar.yDt() + ldrVar.tuV());
                    }
                    arrayList.add(bgVar);
                }
                ldrVar.bg(arrayList);
            }
            if (jSONObject.has("triggerSlideMinDistance")) {
                ldrVar.Ja(jSONObject.optString("triggerSlideDirection", "0"));
                ldrVar.bg(jSONObject.optLong("triggerSlideMinDistance", 0L));
            }
        } catch (java.lang.Exception unused) {
        }
        return ldrVar;
    }

    public boolean bg() {
        return this.qp;
    }

    public void bg(boolean z) {
        this.qp = z;
    }

    public int IL() {
        return this.zU;
    }

    public void bg(int i) {
        this.zU = i;
    }

    public int bX() {
        return this.uny;
    }

    public void IL(int i) {
        this.uny = i;
    }

    public int eqN() {
        return this.JxS;
    }

    public void bX(int i) {
        this.JxS = i;
    }

    public int zx() {
        return this.KRc;
    }

    public void eqN(int i) {
        this.KRc = i;
    }

    public org.json.JSONObject ldr() {
        return this.ovC;
    }

    public int iR() {
        return this.hi;
    }

    public void zx(int i) {
        this.hi = i;
    }

    public double Kg() {
        return this.IEI;
    }

    public void bg(double d) {
        this.IEI = d;
    }

    public int WR() {
        return this.ews;
    }

    public void ldr(int i) {
        this.ews = i;
    }

    public java.lang.String eo() {
        return this.Fx;
    }

    public void bg(java.lang.String str) {
        this.Fx = str;
    }

    public float VB() {
        return this.bg;
    }

    public void bg(float f) {
        this.bg = f;
    }

    public float PX() {
        return this.IL;
    }

    public void IL(float f) {
        this.IL = f;
    }

    public void bX(float f) {
        this.bX = f;
    }

    public void eqN(float f) {
        this.eqN = f;
    }

    public boolean Ta() {
        return this.zx;
    }

    public void IL(boolean z) {
        this.zx = z;
    }

    public float yDt() {
        return this.ldr;
    }

    public void zx(float f) {
        this.ldr = f;
    }

    public float Lq() {
        return this.iR;
    }

    public void ldr(float f) {
        this.iR = f;
    }

    public float vb() {
        return this.Kg;
    }

    public void iR(float f) {
        this.Kg = f;
    }

    public float xxp() {
        return this.WR;
    }

    public void Kg(float f) {
        this.WR = f;
    }

    public float VzQ() {
        return this.eo;
    }

    public void WR(float f) {
        this.eo = f;
    }

    public double tuV() {
        return this.VB;
    }

    public void IL(double d) {
        this.VB = d;
    }

    public double Fy() {
        return this.PX;
    }

    public void bX(double d) {
        this.PX = d;
    }

    public void IL(java.lang.String str) {
        this.Ta = str;
    }

    public void bX(java.lang.String str) {
        this.yDt = str;
    }

    public java.lang.String LZ() {
        return this.Lq;
    }

    public void eqN(java.lang.String str) {
        this.Lq = str;
    }

    public java.lang.String tC() {
        return this.vb;
    }

    public void zx(java.lang.String str) {
        this.vb = str;
    }

    public java.lang.String rri() {
        return this.xxp;
    }

    public void ldr(java.lang.String str) {
        this.xxp = str;
    }

    public void iR(java.lang.String str) {
        this.VzQ = str;
    }

    public java.lang.String kMt() {
        return this.VzQ;
    }

    private void Uw(java.lang.String str) {
        this.DCn = str;
    }

    public java.lang.String JAA() {
        return this.DCn;
    }

    public java.lang.String Ja() {
        return this.tuV;
    }

    public void Kg(java.lang.String str) {
        this.tuV = str;
    }

    public void WR(java.lang.String str) {
        this.Fy = str;
    }

    public java.lang.String Uw() {
        return this.LZ;
    }

    public void eo(java.lang.String str) {
        this.LZ = str;
    }

    public java.lang.String DDQ() {
        return this.tC;
    }

    public void VB(java.lang.String str) {
        this.tC = str;
    }

    public java.lang.String Uq() {
        return this.rri;
    }

    public void PX(java.lang.String str) {
        this.rri = str;
    }

    public java.lang.String aGH() {
        return this.kMt;
    }

    public void Ta(java.lang.String str) {
        this.kMt = str;
    }

    public boolean VW() {
        return this.JAA;
    }

    public void bX(boolean z) {
        this.JAA = z;
    }

    public int VJ() {
        return this.Ja;
    }

    public void iR(int i) {
        this.Ja = i;
    }

    public int daV() {
        return this.Uw;
    }

    public void Kg(int i) {
        this.Uw = i;
    }

    public double ayS() {
        return this.DDQ;
    }

    public void eqN(double d) {
        this.DDQ = d;
    }

    public double ZQc() {
        return this.Uq;
    }

    public void zx(double d) {
        this.Uq = d;
    }

    public java.lang.String LKE() {
        return this.aGH;
    }

    public void yDt(java.lang.String str) {
        this.aGH = str;
    }

    public java.lang.String CQc() {
        return this.VW;
    }

    public void Lq(java.lang.String str) {
        this.VW = str;
    }

    public java.lang.String uu() {
        return this.VJ;
    }

    public void vb(java.lang.String str) {
        this.VJ = str;
    }

    public java.lang.String qC() {
        return this.daV;
    }

    public void xxp(java.lang.String str) {
        this.daV = str;
    }

    public java.lang.String Dxa() {
        return this.ayS;
    }

    public void VzQ(java.lang.String str) {
        this.ayS = str;
    }

    public boolean bN() {
        return this.ZQc;
    }

    public void eqN(boolean z) {
        this.ZQc = z;
    }

    public void WR(int i) {
        this.LKE = i;
    }

    public int jz() {
        return this.LKE;
    }

    public int Pae() {
        return this.CQc;
    }

    public void eo(int i) {
        this.CQc = i;
    }

    public int RJ() {
        return this.uu;
    }

    public void VB(int i) {
        this.uu = i;
    }

    public int txA() {
        return this.qC;
    }

    public void PX(int i) {
        this.qC = i;
    }

    public int sVc() {
        return this.Dxa;
    }

    public void Ta(int i) {
        this.Dxa = i;
    }

    public double ApA() {
        return this.bN;
    }

    public void ldr(double d) {
        this.bN = d;
    }

    public int GvG() {
        return this.jz;
    }

    public void yDt(int i) {
        this.jz = i;
    }

    public boolean lM() {
        return this.Pae;
    }

    public void zx(boolean z) {
        this.Pae = z;
    }

    public int gXn() {
        return this.RJ;
    }

    public void Lq(int i) {
        this.RJ = i;
    }

    public boolean GZ() {
        return this.txA;
    }

    public void ldr(boolean z) {
        this.txA = z;
    }

    public int bCU() {
        return this.sVc;
    }

    public void vb(int i) {
        this.sVc = i;
    }

    public java.lang.String Ld() {
        return this.ApA;
    }

    public void tuV(java.lang.String str) {
        this.ApA = str;
    }

    public boolean wS() {
        return this.GvG;
    }

    public void iR(boolean z) {
        this.GvG = z;
    }

    public boolean cZH() {
        return this.lM;
    }

    public void Kg(boolean z) {
        this.lM = z;
    }

    public boolean zCS() {
        return this.gXn;
    }

    public void WR(boolean z) {
        this.gXn = z;
    }

    public boolean Ys() {
        return this.GZ;
    }

    public void eo(boolean z) {
        this.GZ = z;
    }

    public java.lang.String dS() {
        return this.bCU;
    }

    public void Fy(java.lang.String str) {
        this.bCU = str;
    }

    public void IL(org.json.JSONObject jSONObject) {
        this.Ld = jSONObject;
    }

    public org.json.JSONObject RiO() {
        return this.Ld;
    }

    public int Dt() {
        return this.wS;
    }

    public void xxp(int i) {
        this.wS = i;
    }

    public boolean Ny() {
        return this.cZH;
    }

    public void VB(boolean z) {
        this.cZH = z;
    }

    public int bOf() {
        return this.zCS;
    }

    public void VzQ(int i) {
        this.zCS = i;
    }

    public int kU() {
        return this.Ys;
    }

    public void tuV(int i) {
        this.Ys = i;
    }

    public int qp() {
        return this.dS;
    }

    public void Fy(int i) {
        this.dS = i;
    }

    public int eDa() {
        return this.RiO;
    }

    public void LZ(int i) {
        this.RiO = i;
    }

    public int RFq() {
        return this.Dt;
    }

    public void tC(int i) {
        this.Dt = i;
    }

    public int jA() {
        return this.Ny;
    }

    public void rri(int i) {
        this.Ny = i;
    }

    public java.lang.String hff() {
        return this.bOf;
    }

    public void LZ(java.lang.String str) {
        this.bOf = str;
    }

    public java.lang.String xFs() {
        return this.kU;
    }

    public void tC(java.lang.String str) {
        this.kU = str;
    }

    public int jf() {
        return this.eDa;
    }

    public void kMt(int i) {
        this.eDa = i;
    }

    public int huT() {
        return this.RFq;
    }

    public void JAA(int i) {
        this.RFq = i;
    }

    public java.lang.String ZyO() {
        return this.mLT;
    }

    public void rri(java.lang.String str) {
        this.mLT = str;
    }

    public boolean ZTq() {
        return this.uV;
    }

    public void PX(boolean z) {
        this.uV = z;
    }

    public int gCm() {
        return this.qSG;
    }

    public void Ja(int i) {
        this.qSG = i;
    }

    public int FFy() {
        return this.wq;
    }

    public void Uw(int i) {
        this.wq = i;
    }

    public int rr() {
        return this.GR;
    }

    public void DDQ(int i) {
        this.GR = i;
    }

    public boolean gtr() {
        return this.mZk;
    }

    public void Ta(boolean z) {
        this.mZk = z;
    }

    public int IEI() {
        return this.jA;
    }

    public void Uq(int i) {
        this.jA = i;
    }

    public void yDt(boolean z) {
        this.rgo = z;
    }

    public boolean bu() {
        return this.rgo;
    }

    public void kMt(java.lang.String str) {
        this.yda = str;
    }

    public java.lang.String HXG() {
        return this.yda;
    }

    public void aGH(int i) {
        this.JlG = i;
    }

    public int hi() {
        return this.JlG;
    }

    public java.util.List<com.bytedance.sdk.component.adexpress.dynamic.eqN.bg> eK() {
        return this.hff;
    }

    public int rgo() {
        java.util.List<com.bytedance.sdk.component.adexpress.dynamic.eqN.bg> list = this.hff;
        if (list == null) {
            return 0;
        }
        for (com.bytedance.sdk.component.adexpress.dynamic.eqN.bg bgVar : list) {
            if ("translate".equals(bgVar.WR()) && bgVar.iR() < 0) {
                return -bgVar.iR();
            }
        }
        return 0;
    }

    public void bg(java.util.List<com.bytedance.sdk.component.adexpress.dynamic.eqN.bg> list) {
        this.hff = list;
    }

    public int ovC() {
        return this.xFs;
    }

    public void VW(int i) {
        this.xFs = i;
    }

    public int ews() {
        return this.jf;
    }

    public void VJ(int i) {
        this.jf = i;
    }

    public int zU() {
        return this.huT;
    }

    public void daV(int i) {
        this.huT = i;
    }

    public boolean uny() {
        return this.ZTq;
    }

    public void Lq(boolean z) {
        this.ZTq = z;
    }

    public int JxS() {
        return this.ZyO;
    }

    public void ayS(int i) {
        this.ZyO = i;
    }

    public boolean KRc() {
        return this.gCm;
    }

    public void vb(boolean z) {
        this.gCm = z;
    }

    public boolean yda() {
        return this.FFy;
    }

    public void xxp(boolean z) {
        this.FFy = z;
    }

    public int JlG() {
        return this.rr;
    }

    public void ZQc(int i) {
        this.rr = i;
    }

    public java.lang.String mZk() {
        return this.eK;
    }

    public boolean mLT() {
        return this.gtr;
    }

    public void VzQ(boolean z) {
        this.gtr = z;
    }

    public void bX(org.json.JSONObject jSONObject) {
        this.bu = jSONObject;
    }

    public org.json.JSONObject uV() {
        return this.HXG;
    }

    public void eqN(org.json.JSONObject jSONObject) {
        this.HXG = jSONObject;
    }

    public void zx(org.json.JSONObject jSONObject) {
        this.ovC = jSONObject;
    }

    public java.lang.String qSG() {
        return this.Gih;
    }

    public void JAA(java.lang.String str) {
        this.Gih = str;
    }

    public void wq() {
        bg(this, this.bu);
    }

    public void GR() {
        bg(this, this.HXG);
    }

    public java.lang.String Gih() {
        return this.JaB;
    }

    public void Ja(java.lang.String str) {
        this.JaB = str;
    }

    public long JaB() {
        return this.gJ;
    }

    public void bg(long j) {
        this.gJ = j;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private void bg(com.bytedance.sdk.component.adexpress.dynamic.eqN.ldr ldrVar, org.json.JSONObject jSONObject) {
        if (ldrVar == null || jSONObject == null) {
            return;
        }
        java.util.Iterator<java.lang.String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            java.lang.String next = itKeys.next();
            next.hashCode();
            byte b = -1;
            switch (next.hashCode()) {
                case -2067713583:
                    if (next.equals("isShowBgControl")) {
                        b = 0;
                    }
                    break;
                case -1965619659:
                    if (next.equals("clickArea")) {
                        b = 1;
                    }
                    break;
                case -1912831834:
                    if (next.equals("triggerSlideDirection")) {
                        b = 2;
                    }
                    break;
                case -1885934767:
                    if (next.equals("bgImgUrl")) {
                        b = 3;
                    }
                    break;
                case -1822062213:
                    if (next.equals("lineCount")) {
                        b = 4;
                    }
                    break;
                case -1821293778:
                    if (next.equals("openPlayableLandingPage")) {
                        b = 5;
                    }
                    break;
                case -1813937113:
                    if (next.equals("lineLimit")) {
                        b = 6;
                    }
                    break;
                case -1578250488:
                    if (next.equals("interactBgColor")) {
                        b = 7;
                    }
                    break;
                case -1501175880:
                    if (next.equals("paddingLeft")) {
                        b = 8;
                    }
                    break;
                case -1422965251:
                    if (next.equals("adType")) {
                        b = 9;
                    }
                    break;
                case -1383228885:
                    if (next.equals("bottom")) {
                        b = 10;
                    }
                    break;
                case -1224696685:
                    if (next.equals(androidx.media3.extractor.text.ttml.TtmlNode.ATTR_TTS_FONT_FAMILY)) {
                        b = 11;
                    }
                    break;
                case -1221029593:
                    if (next.equals("height")) {
                        b = 12;
                    }
                    break;
                case -1065511464:
                    if (next.equals(androidx.media3.extractor.text.ttml.TtmlNode.ATTR_TTS_TEXT_ALIGN)) {
                        b = 13;
                    }
                    break;
                case -1063257157:
                    if (next.equals("alignItems")) {
                        b = 14;
                    }
                    break;
                case -1046708884:
                    if (next.equals("interactValidate")) {
                        b = 15;
                    }
                    break;
                case -1044792121:
                    if (next.equals("marginTop")) {
                        b = 16;
                    }
                    break;
                case -1019884910:
                    if (next.equals("useBottom")) {
                        b = 17;
                    }
                    break;
                case -1005195314:
                    if (next.equals("triggerSlideMinDistance")) {
                        b = 18;
                    }
                    break;
                case -962590849:
                    if (next.equals("direction")) {
                        b = 19;
                    }
                    break;
                case -912366651:
                    if (next.equals("tagMaxCount")) {
                        b = 20;
                    }
                    break;
                case -848877971:
                    if (next.equals("interactHiddenTime")) {
                        b = 21;
                    }
                    break;
                case -836058546:
                    if (next.equals("useTop")) {
                        b = 22;
                    }
                    break;
                case -734428249:
                    if (next.equals(androidx.media3.extractor.text.ttml.TtmlNode.ATTR_TTS_FONT_WEIGHT)) {
                        b = 23;
                    }
                    break;
                case -731417480:
                    if (next.equals("zIndex")) {
                        b = 24;
                    }
                    break;
                case -709393864:
                    if (next.equals("timingStart")) {
                        b = 25;
                    }
                    break;
                case -515807685:
                    if (next.equals("lineHeight")) {
                        b = 26;
                    }
                    break;
                case -321658193:
                    if (next.equals("textFlowDuration")) {
                        b = 27;
                    }
                    break;
                case -295409451:
                    if (next.equals("useRight")) {
                        b = 28;
                    }
                    break;
                case -289173127:
                    if (next.equals("marginBottom")) {
                        b = 29;
                    }
                    break;
                case -204859874:
                    if (next.equals("bgColor")) {
                        b = 30;
                    }
                    break;
                case -148259282:
                    if (next.equals("useLeft")) {
                        b = 31;
                    }
                    break;
                case -51738487:
                    if (next.equals("widthMode")) {
                        b = 32;
                    }
                    break;
                case 115029:
                    if (next.equals("top")) {
                        b = 33;
                    }
                    break;
                case 3076010:
                    if (next.equals("data")) {
                        b = 34;
                    }
                    break;
                case 3317767:
                    if (next.equals(androidx.media3.extractor.text.ttml.TtmlNode.LEFT)) {
                        b = 35;
                    }
                    break;
                case 3327652:
                    if (next.equals("loop")) {
                        b = 36;
                    }
                    break;
                case 90130308:
                    if (next.equals("paddingTop")) {
                        b = 37;
                    }
                    break;
                case 92903173:
                    if (next.equals("align")) {
                        b = 38;
                    }
                    break;
                case 94842723:
                    if (next.equals("color")) {
                        b = 39;
                    }
                    break;
                case 108511772:
                    if (next.equals(androidx.media3.extractor.text.ttml.TtmlNode.RIGHT)) {
                        b = 40;
                    }
                    break;
                case 113126854:
                    if (next.equals("width")) {
                        b = 41;
                    }
                    break;
                case 164611121:
                    if (next.equals("timingEnd")) {
                        b = 42;
                    }
                    break;
                case 202355100:
                    if (next.equals("paddingBottom")) {
                        b = 43;
                    }
                    break;
                case 247204452:
                    if (next.equals("allowTextFlow")) {
                        b = 44;
                    }
                    break;
                case 302841174:
                    if (next.equals("interactWontHide")) {
                        b = 45;
                    }
                    break;
                case 365601008:
                    if (next.equals(androidx.media3.extractor.text.ttml.TtmlNode.ATTR_TTS_FONT_SIZE)) {
                        b = 46;
                    }
                    break;
                case 428975654:
                    if (next.equals("justifyVertical")) {
                        b = 47;
                    }
                    break;
                case 439444041:
                    if (next.equals("interactVisibleTime")) {
                        b = 48;
                    }
                    break;
                case 713848971:
                    if (next.equals("paddingRight")) {
                        b = 49;
                    }
                    break;
                case 722830999:
                    if (next.equals("borderColor")) {
                        b = 50;
                    }
                    break;
                case 737768677:
                    if (next.equals("borderStyle")) {
                        b = 51;
                    }
                    break;
                case 747804969:
                    if (next.equals(com.ironsource.y8.h.L)) {
                        b = 52;
                    }
                    break;
                case 791643104:
                    if (next.equals("isDataFixed")) {
                        b = 53;
                    }
                    break;
                case 975087886:
                    if (next.equals("marginRight")) {
                        b = 54;
                    }
                    break;
                case 1110826708:
                    if (next.equals("justifyHorizontal")) {
                        b = 55;
                    }
                    break;
                case 1122368895:
                    if (next.equals("interactPosition")) {
                        b = 56;
                    }
                    break;
                case 1188229042:
                    if (next.equals("lineFeed")) {
                        b = 57;
                    }
                    break;
                case 1332036739:
                    if (next.equals("interactText")) {
                        b = 58;
                    }
                    break;
                case 1332055696:
                    if (next.equals("interactType")) {
                        b = 59;
                    }
                    break;
                case 1349188574:
                    if (next.equals("borderRadius")) {
                        b = 60;
                    }
                    break;
                case 1360828714:
                    if (next.equals("clickTigger")) {
                        b = kotlin.io.encoding.Base64.padSymbol;
                    }
                    break;
                case 1490178922:
                    if (next.equals("heightMode")) {
                        b = 62;
                    }
                    break;
                case 1761274325:
                    if (next.equals("textFlowType")) {
                        b = okio.Utf8.REPLACEMENT_BYTE;
                    }
                    break;
                case 1824903757:
                    if (next.equals("borderSize")) {
                        b = 64;
                    }
                    break;
                case 1970934485:
                    if (next.equals("marginLeft")) {
                        b = 65;
                    }
                    break;
                case 2111078717:
                    if (next.equals("letterSpacing")) {
                        b = 66;
                    }
                    break;
            }
            switch (b) {
                case 0:
                    ldrVar.bX(jSONObject.optBoolean(next, false));
                    break;
                case 1:
                    ldrVar.Lq(jSONObject.optString(next));
                    break;
                case 2:
                    ldrVar.Ja(jSONObject.optString(next));
                    break;
                case 3:
                    ldrVar.iR(jSONObject.optString(next));
                    break;
                case 4:
                    ldrVar.WR(jSONObject.optInt(next));
                    break;
                case 5:
                    ldrVar.VzQ(jSONObject.optBoolean(next));
                    break;
                case 6:
                    ldrVar.ldr(jSONObject.optBoolean(next));
                    break;
                case 7:
                    ldrVar.Ta(jSONObject.optString(next));
                    break;
                case 8:
                    ldrVar.ldr((float) jSONObject.optDouble(next));
                    break;
                case 9:
                    ldrVar.IL(jSONObject.optString(next));
                    break;
                case 10:
                    ldrVar.rri(jSONObject.optInt(next));
                    break;
                case 11:
                    ldrVar.bX(jSONObject.optString(next));
                    break;
                case 12:
                    ldrVar.bX((float) jSONObject.optDouble(next));
                    break;
                case 13:
                    ldrVar.eqN(jSONObject.optString(next));
                    break;
                case 14:
                    ldrVar.LZ(jSONObject.optString(next));
                    break;
                case 15:
                    ldrVar.IL(jSONObject.optBoolean(next));
                    break;
                case 16:
                    ldrVar.eo(jSONObject.optInt(next));
                    break;
                case 17:
                    ldrVar.eo(jSONObject.optBoolean(next));
                    break;
                case 18:
                    ldrVar.bg(jSONObject.optLong(next));
                    break;
                case 19:
                    ldrVar.tC(jSONObject.optString(next));
                    break;
                case 20:
                    ldrVar.xxp(jSONObject.optInt(next));
                    break;
                case 21:
                    ldrVar.JAA(jSONObject.optInt(next));
                    break;
                case 22:
                    ldrVar.WR(jSONObject.optBoolean(next));
                    break;
                case 23:
                    ldrVar.Lq(jSONObject.optInt(next));
                    break;
                case 24:
                    ldrVar.kMt(jSONObject.optInt(next));
                    break;
                case 25:
                    ldrVar.IL(jSONObject.optDouble(next));
                    break;
                case 26:
                    ldrVar.ldr(jSONObject.optDouble(next));
                    break;
                case 27:
                    ldrVar.tuV(jSONObject.optInt(next));
                    break;
                case 28:
                    ldrVar.Kg(jSONObject.optBoolean(next));
                    break;
                case 29:
                    ldrVar.VB(jSONObject.optInt(next));
                    break;
                case 30:
                    ldrVar.ldr(jSONObject.optString(next));
                    break;
                case 31:
                    ldrVar.iR(jSONObject.optBoolean(next));
                    break;
                case 32:
                    ldrVar.VB(jSONObject.optString(next));
                    break;
                case 33:
                    ldrVar.tC(jSONObject.optInt(next));
                    break;
                case 34:
                    ldrVar.Fy(jSONObject.optString(next));
                    break;
                case 35:
                    ldrVar.Fy(jSONObject.optInt(next));
                    break;
                case 36:
                    ldrVar.bg(jSONObject.optBoolean(next));
                    break;
                case 37:
                    ldrVar.Kg((float) jSONObject.optDouble(next));
                    break;
                case 38:
                    ldrVar.tuV(jSONObject.optString(next));
                    break;
                case 39:
                    ldrVar.zx(jSONObject.optString(next));
                    break;
                case 40:
                    ldrVar.LZ(jSONObject.optInt(next));
                    break;
                case 41:
                    ldrVar.eqN((float) jSONObject.optDouble(next));
                    break;
                case 42:
                    ldrVar.bX(jSONObject.optDouble(next));
                    break;
                case 43:
                    ldrVar.zx((float) jSONObject.optDouble(next));
                    break;
                case 44:
                    ldrVar.VB(jSONObject.optBoolean(next));
                    break;
                case 45:
                    ldrVar.yDt(jSONObject.optBoolean(next));
                    break;
                case 46:
                    ldrVar.WR((float) jSONObject.optDouble(next));
                    break;
                case 47:
                    ldrVar.VzQ(jSONObject.optString(next));
                    break;
                case 48:
                    ldrVar.Uq(jSONObject.optInt(next));
                    break;
                case 49:
                    ldrVar.iR((float) jSONObject.optDouble(next));
                    break;
                case 50:
                    ldrVar.Kg(jSONObject.optString(next));
                    break;
                case 51:
                    ldrVar.WR(jSONObject.optString(next));
                    break;
                case 52:
                    ldrVar.vb(jSONObject.optInt(next));
                    break;
                case 53:
                    ldrVar.zx(jSONObject.optBoolean(next));
                    break;
                case 54:
                    ldrVar.Ta(jSONObject.optInt(next));
                    break;
                case 55:
                    ldrVar.xxp(jSONObject.optString(next));
                    break;
                case 56:
                    org.json.JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(next);
                    if (jSONObjectOptJSONObject != null) {
                        ldrVar.iR(jSONObjectOptJSONObject.optInt("translateY", 0));
                        ldrVar.Kg(jSONObjectOptJSONObject.optInt("translateX", 0));
                        ldrVar.eqN(jSONObjectOptJSONObject.optDouble("scaleX", 0.0d));
                        ldrVar.zx(jSONObjectOptJSONObject.optDouble("scaleY", 0.0d));
                    }
                    break;
                case 57:
                    ldrVar.eqN(jSONObject.optBoolean(next));
                    break;
                case 58:
                    ldrVar.PX(jSONObject.optString(next));
                    break;
                case 59:
                    ldrVar.yDt(jSONObject.optString(next));
                    break;
                case 60:
                    ldrVar.bg((float) jSONObject.optDouble(next));
                    break;
                case 61:
                    ldrVar.vb(jSONObject.optString(next));
                    break;
                case 62:
                    ldrVar.eo(jSONObject.optString(next));
                    break;
                case 63:
                    ldrVar.VzQ(jSONObject.optInt(next));
                    break;
                case 64:
                    ldrVar.IL((float) jSONObject.optDouble(next));
                    break;
                case 65:
                    ldrVar.PX(jSONObject.optInt(next));
                    break;
                case 66:
                    ldrVar.yDt(jSONObject.optInt(next));
                    break;
            }
        }
    }
}
