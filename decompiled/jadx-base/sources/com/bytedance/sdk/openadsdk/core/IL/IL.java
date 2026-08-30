package com.bytedance.sdk.openadsdk.core.IL;

/* JADX INFO: loaded from: classes4.dex */
public class IL extends com.bytedance.sdk.openadsdk.core.IL.bX {
    private static int ayS = Integer.MIN_VALUE;
    protected int Fy;
    private java.lang.ref.WeakReference<android.app.Activity> IL;
    protected final int Kg;
    protected boolean Lq;
    protected com.bytedance.sdk.openadsdk.core.IL.IL.bg PX;
    protected com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd Ta;
    protected com.bytedance.sdk.openadsdk.core.model.eo VB;
    protected com.bytedance.sdk.openadsdk.api.PangleAd VzQ;
    protected java.lang.ref.WeakReference<android.view.View> WR;
    private boolean bX;
    private java.lang.String bg;
    protected java.lang.ref.WeakReference<android.view.View> eo;
    protected android.content.Context eqN;
    protected final java.lang.String iR;
    protected final com.bytedance.sdk.openadsdk.core.model.tuV ldr;
    protected com.bytedance.sdk.openadsdk.core.Kg.IL tuV;
    protected com.bytedance.sdk.openadsdk.VzQ.bg.bg.ldr vb;
    protected java.util.Map<java.lang.String, java.lang.Object> xxp;
    protected com.bykv.vk.openvk.bg.bg.bg.eqN.bX yDt;
    public com.bytedance.sdk.openadsdk.core.model.yDt zx;

    public interface bg {
        void bg(android.view.View view, int i);
    }

    public boolean bg(com.bytedance.sdk.openadsdk.core.model.eo eoVar, java.util.Map<java.lang.String, java.lang.Object> map) {
        return false;
    }

    public void bg(com.bytedance.sdk.openadsdk.VzQ.bg.bg.ldr ldrVar) {
        this.vb = ldrVar;
    }

    public void bg(com.bytedance.sdk.openadsdk.core.Kg.IL il) {
        this.tuV = il;
    }

    public void bg(com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd pAGNativeAd) {
        this.Ta = pAGNativeAd;
    }

    public void bg(com.bytedance.sdk.openadsdk.api.PangleAd pangleAd) {
        this.VzQ = pangleAd;
    }

    public void eqN(boolean z) {
        this.Lq = z;
    }

    public void bg(com.bykv.vk.openvk.bg.bg.bg.eqN.bX bXVar) {
        this.yDt = bXVar;
    }

    public IL(android.content.Context context, com.bytedance.sdk.openadsdk.core.model.tuV tuv, java.lang.String str, int i) {
        this.Lq = false;
        this.Fy = 0;
        this.bX = false;
        this.eqN = context;
        this.ldr = tuv;
        this.iR = str;
        this.Kg = i;
    }

    public IL(android.content.Context context, com.bytedance.sdk.openadsdk.core.model.tuV tuv, java.lang.String str, int i, boolean z) {
        this(context, tuv, str, i);
        this.bX = z;
    }

    public void bg(com.bytedance.sdk.openadsdk.core.IL.IL.bg bgVar) {
        this.PX = bgVar;
    }

    public void bg(android.app.Activity activity) {
        if (activity == null) {
            return;
        }
        this.IL = new java.lang.ref.WeakReference<>(activity);
    }

    public void bg(android.view.View view) {
        if (view == null) {
            return;
        }
        this.WR = new java.lang.ref.WeakReference<>(view);
    }

    public void IL(android.view.View view) {
        if (view == null) {
            return;
        }
        this.eo = new java.lang.ref.WeakReference<>(view);
    }

    public android.view.View eqN() {
        java.lang.ref.WeakReference<android.app.Activity> weakReference = this.IL;
        if (weakReference == null || weakReference.get() == null) {
            return null;
        }
        return this.IL.get().findViewById(android.R.id.content);
    }

    public android.view.View zx() {
        java.lang.ref.WeakReference<android.app.Activity> weakReference = this.IL;
        if (weakReference == null || weakReference.get() == null) {
            return null;
        }
        android.view.View viewFindViewById = this.IL.get().findViewById(520093713);
        return viewFindViewById == null ? this.IL.get().findViewById(520093713) : viewFindViewById;
    }

    public void bg(java.util.Map<java.lang.String, java.lang.Object> map) {
        java.util.Map<java.lang.String, java.lang.Object> map2 = this.xxp;
        if (map2 != null) {
            map2.putAll(map);
            map.putAll(this.xxp);
        }
        this.xxp = map;
    }

    public void bg(int i) {
        this.Uq = i;
    }

    public void IL(int i) {
        this.DDQ = i;
    }

    public void bX(int i) {
        this.Uw = i;
    }

    public void eqN(int i) {
        this.Fy = i;
    }

    @Override // com.bytedance.sdk.openadsdk.core.IL.bX
    public void bg(android.view.View view, float f, float f2, float f3, float f4, android.util.SparseArray<com.bytedance.sdk.openadsdk.core.IL.bX.bg> sparseArray, boolean z) {
        int i;
        boolean z2;
        org.json.JSONObject jSONObject;
        org.json.JSONObject jSONObject2;
        com.bytedance.sdk.openadsdk.core.model.tuV tuv;
        if (this.eqN == null) {
            this.eqN = com.bytedance.sdk.openadsdk.core.VzQ.bg();
        }
        if ((this.bX || !bg(view, 1, f, f2, f3, f4, sparseArray, z)) && this.eqN != null) {
            com.bytedance.sdk.openadsdk.core.model.yDt ydt = this.zx;
            if (ydt != null) {
                i = ydt.PX;
                jSONObject = this.zx.Ta;
                jSONObject2 = this.zx.xxp;
                z2 = this.zx.VzQ;
            } else {
                i = -1;
                z2 = false;
                jSONObject = null;
                jSONObject2 = null;
            }
            long j = this.JAA;
            long j2 = this.Ja;
            java.lang.ref.WeakReference<android.view.View> weakReference = this.WR;
            android.view.View view2 = weakReference == null ? null : weakReference.get();
            java.lang.ref.WeakReference<android.view.View> weakReference2 = this.eo;
            com.bytedance.sdk.openadsdk.core.model.eo eoVarBg = bg(f, f2, f3, f4, sparseArray, j, j2, view2, weakReference2 == null ? null : weakReference2.get(), ldr(), com.bytedance.sdk.openadsdk.utils.ZQc.zx(this.eqN), com.bytedance.sdk.openadsdk.utils.ZQc.iR(this.eqN), com.bytedance.sdk.openadsdk.utils.ZQc.ldr(this.eqN), i, jSONObject, jSONObject2);
            this.VB = eoVarBg;
            if (bg(eoVarBg, this.xxp)) {
                return;
            }
            if (this.yDt != null) {
                if (this.xxp == null) {
                    this.xxp = new java.util.HashMap();
                }
                this.xxp.put("duration", java.lang.Long.valueOf(this.yDt.zx()));
            }
            if (this.bX || z2) {
                com.bytedance.sdk.openadsdk.eqN.bX.bg(com.json.z8.CLICK, this.ldr, this.VB, this.iR, true, this.xxp, z ? 1 : 2);
                return;
            }
            com.bytedance.sdk.openadsdk.core.IL.IL.bg bgVar = this.PX;
            if (bgVar != null) {
                bgVar.bg(view, -1);
            }
            if (bg(view, z)) {
                boolean zIL = com.bytedance.sdk.openadsdk.core.model.rri.IL(this.ldr);
                java.lang.String strBg = zIL ? this.iR : com.bytedance.sdk.openadsdk.utils.ayS.bg(this.Kg);
                if (view != null) {
                    try {
                        java.lang.Boolean bool = (java.lang.Boolean) view.getTag(520093762);
                        if (bool.booleanValue()) {
                            com.bytedance.sdk.openadsdk.core.VJ.bg(true);
                        }
                    } catch (java.lang.Exception unused) {
                    }
                }
                android.app.Activity activityBg = view != null ? com.bytedance.sdk.component.utils.IL.bg(view) : null;
                boolean zBg = com.bytedance.sdk.openadsdk.core.VJ.bg(activityBg == null ? this.eqN : activityBg, this.ldr, this.Kg, this.Ta, this.VzQ, strBg, this.vb, zIL, 0);
                com.bytedance.sdk.openadsdk.core.VJ.bg(false);
                if (zBg || (tuv = this.ldr) == null || tuv.Dt() == null || this.ldr.Dt().bX() != 2) {
                    com.bytedance.sdk.openadsdk.core.model.tuV tuv2 = this.ldr;
                    if (tuv2 != null && !zBg && android.text.TextUtils.isEmpty(tuv2.GvG()) && com.bytedance.sdk.openadsdk.eqN.IL.bg(this.iR)) {
                        com.bytedance.sdk.openadsdk.VzQ.bg.bg.iR.bg(this.eqN, this.ldr, this.iR).eqN();
                    }
                    com.bytedance.sdk.openadsdk.eqN.bX.bg(com.json.z8.CLICK, this.ldr, this.VB, this.iR, zBg, this.xxp, z ? 1 : 2);
                }
            }
        }
    }

    public boolean bg(android.view.View view, boolean z) {
        return bg(view, this.ldr, z);
    }

    public static boolean bg(android.view.View view, com.bytedance.sdk.openadsdk.core.model.tuV tuv, boolean z) {
        if (view != null && tuv != null) {
            try {
                java.lang.String strValueOf = java.lang.String.valueOf(view.getTag(com.bytedance.sdk.component.adexpress.dynamic.bg.Fy));
                if (view.getTag(com.bytedance.sdk.component.adexpress.dynamic.bg.Fy) != null && !android.text.TextUtils.isEmpty(strValueOf)) {
                    if (com.json.z8.CLICK.equals(strValueOf)) {
                        return z;
                    }
                    return true;
                }
            } catch (java.lang.Exception unused) {
            }
            if (bX(view)) {
                return tuv.tuV() != 1 || z;
            }
            if (tuv.VzQ() == 1 && !z) {
                return false;
            }
        }
        return true;
    }

    protected com.bytedance.sdk.openadsdk.core.model.eo bg(float f, float f2, float f3, float f4, android.util.SparseArray<com.bytedance.sdk.openadsdk.core.IL.bX.bg> sparseArray, long j, long j2, android.view.View view, android.view.View view2, java.lang.String str, float f5, int i, float f6, int i2, org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2) {
        return new com.bytedance.sdk.openadsdk.core.model.eo.bg().ldr(f).zx(f2).eqN(f3).bX(f4).IL(j).bg(j2).IL(com.bytedance.sdk.openadsdk.utils.ZQc.bg(view)).bg(com.bytedance.sdk.openadsdk.utils.ZQc.bg(view2)).bX(com.bytedance.sdk.openadsdk.utils.ZQc.bX(view)).eqN(com.bytedance.sdk.openadsdk.utils.ZQc.bX(view2)).eqN(this.Uw).zx(this.DDQ).ldr(this.Uq).bg(sparseArray).IL(com.bytedance.sdk.openadsdk.core.WR.IL().bg() ? 1 : 2).bg(str).bg(f5).bX(i).IL(f6).bg(i2).bg(jSONObject).IL(jSONObject2).bg();
    }

    protected boolean bg(android.view.View view, int i, float f, float f2, float f3, float f4, android.util.SparseArray<com.bytedance.sdk.openadsdk.core.IL.bX.bg> sparseArray, boolean z) {
        if (this.tuV == null) {
            return false;
        }
        int[] iArrBg = new int[2];
        int[] iArrBX = new int[2];
        java.lang.ref.WeakReference<android.view.View> weakReference = this.eo;
        if (weakReference != null) {
            iArrBg = com.bytedance.sdk.openadsdk.utils.ZQc.bg(weakReference.get());
            iArrBX = com.bytedance.sdk.openadsdk.utils.ZQc.bX(this.eo.get());
        }
        this.tuV.bg(view, i, new com.bytedance.sdk.openadsdk.core.model.yDt.bg().eqN(f).bX(f2).IL(f3).bg(f4).IL(this.JAA).bg(this.Ja).bX(iArrBg[0]).eqN(iArrBg[1]).zx(iArrBX[0]).ldr(iArrBX[1]).bg(sparseArray).bg(z).bg());
        return true;
    }

    public static boolean bX(android.view.View view) {
        return 520093705 == view.getId() || 520093707 == view.getId() || 520093703 == view.getId() || bg(view.getContext()) == view.getId() || com.bytedance.sdk.openadsdk.utils.Ta.gCm == view.getId() || com.bytedance.sdk.openadsdk.utils.Ta.PC == view.getId();
    }

    private static int bg(android.content.Context context) {
        if (ayS == Integer.MIN_VALUE) {
            ayS = com.bytedance.sdk.component.utils.Fy.zx(context, "btn_native_creative");
        }
        return ayS;
    }

    public java.lang.String ldr() {
        return this.bg;
    }

    public void bg(java.lang.String str) {
        this.bg = str;
    }
}
