package com.bytedance.sdk.openadsdk.core.PX;

/* JADX INFO: loaded from: classes4.dex */
public class bX {
    protected int IL;
    protected java.lang.String Kg;
    private com.bytedance.sdk.openadsdk.core.model.tuV PX;
    private final java.util.concurrent.atomic.AtomicBoolean VB = new java.util.concurrent.atomic.AtomicBoolean(false);
    protected java.lang.String WR = "endcard_click";
    protected com.bytedance.sdk.openadsdk.core.PX.bX.bg.EnumC0137bg bX;
    protected int bg;
    private java.lang.String eo;
    protected com.bytedance.sdk.openadsdk.core.PX.bX.bg.IL eqN;
    protected java.util.List<com.bytedance.sdk.openadsdk.core.PX.IL.bX> iR;
    protected java.util.List<com.bytedance.sdk.openadsdk.core.PX.IL.bX> ldr;
    protected java.lang.String zx;

    public bX(int i, int i2, com.bytedance.sdk.openadsdk.core.PX.bX.bg.EnumC0137bg enumC0137bg, com.bytedance.sdk.openadsdk.core.PX.bX.bg.IL il, java.lang.String str, java.util.List<com.bytedance.sdk.openadsdk.core.PX.IL.bX> list, java.util.List<com.bytedance.sdk.openadsdk.core.PX.IL.bX> list2, java.lang.String str2) {
        this.ldr = new java.util.ArrayList();
        this.iR = new java.util.ArrayList();
        this.bg = i;
        this.IL = i2;
        this.bX = enumC0137bg;
        this.eqN = il;
        this.zx = str;
        this.ldr = list;
        this.iR = list2;
        this.Kg = str2;
    }

    public int IL() {
        return this.bg;
    }

    public int bX() {
        return this.IL;
    }

    public void bg(long j) {
        com.bytedance.sdk.openadsdk.core.PX.IL.bX.bg(this.ldr, null, j, this.eo, new com.bytedance.sdk.openadsdk.core.PX.IL.bX.IL(this.WR, this.PX));
    }

    public void IL(long j) {
        if (this.VB.compareAndSet(false, true)) {
            com.bytedance.sdk.openadsdk.core.PX.IL.bX.IL(this.iR, null, j, this.eo);
        }
    }

    public static float bg(int i, int i2, int i3, int i4, com.bytedance.sdk.openadsdk.core.PX.bX.bg.IL il, com.bytedance.sdk.openadsdk.core.PX.bX.bg.EnumC0137bg enumC0137bg) {
        if (i2 == 0 || i4 == 0) {
            return 0.0f;
        }
        float f = i;
        float f2 = i3;
        return bg(il, enumC0137bg) / ((java.lang.Math.abs((f / i2) - (f2 / i4)) + java.lang.Math.abs((f - f2) / f)) + 1.0f);
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.PX.bX$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] bg;

        static {
            int[] iArr = new int[com.bytedance.sdk.openadsdk.core.PX.bX.bg.IL.values().length];
            bg = iArr;
            try {
                iArr[com.bytedance.sdk.openadsdk.core.PX.bX.bg.IL.STATIC_RESOURCE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                bg[com.bytedance.sdk.openadsdk.core.PX.bX.bg.IL.HTML_RESOURCE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                bg[com.bytedance.sdk.openadsdk.core.PX.bX.bg.IL.IFRAME_RESOURCE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
        }
    }

    private static float bg(com.bytedance.sdk.openadsdk.core.PX.bX.bg.IL il, com.bytedance.sdk.openadsdk.core.PX.bX.bg.EnumC0137bg enumC0137bg) {
        int i = com.bytedance.sdk.openadsdk.core.PX.bX.AnonymousClass1.bg[il.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return i != 3 ? 0.0f : 1.0f;
            }
            return 1.2f;
        }
        if (com.bytedance.sdk.openadsdk.core.PX.bX.bg.EnumC0137bg.JAVASCRIPT.equals(enumC0137bg)) {
            return 1.0f;
        }
        return com.bytedance.sdk.openadsdk.core.PX.bX.bg.EnumC0137bg.IMAGE.equals(enumC0137bg) ? 0.8f : 0.0f;
    }

    public java.lang.String eqN() {
        int i = com.bytedance.sdk.openadsdk.core.PX.bX.AnonymousClass1.bg[this.eqN.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return this.zx;
            }
            if (i != 3) {
                return null;
            }
            return "<iframe frameborder=\"0\" scrolling=\"no\" marginheight=\"0\" marginwidth=\"0\" style=\"border: 0px; margin: 0px;\" width=\"" + this.bg + "\" height=\"" + this.IL + "\" src=\"" + this.zx + "\"></iframe>";
        }
        if (this.bX == com.bytedance.sdk.openadsdk.core.PX.bX.bg.EnumC0137bg.IMAGE) {
            return "<html><head></head><body style=\"margin:0;padding:0\"><img src=\"" + this.zx + "\" width=\"100%\" style=\"max-width:100%;max-height:100%;\" /></body></html>";
        }
        if (this.bX == com.bytedance.sdk.openadsdk.core.PX.bX.bg.EnumC0137bg.JAVASCRIPT) {
            return "<script src=\"" + this.zx + "\"></script>";
        }
        return null;
    }

    public java.lang.String zx() {
        if (this.eqN == com.bytedance.sdk.openadsdk.core.PX.bX.bg.IL.STATIC_RESOURCE && this.bX == com.bytedance.sdk.openadsdk.core.PX.bX.bg.EnumC0137bg.IMAGE) {
            return this.zx;
        }
        return null;
    }

    public java.lang.String ldr() {
        return this.zx;
    }

    public void bg(java.lang.String str) {
        this.eo = str;
    }

    public static com.bytedance.sdk.openadsdk.core.PX.bX IL(org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        int iOptInt = jSONObject.optInt("width");
        int iOptInt2 = jSONObject.optInt("height");
        java.lang.String strOptString = jSONObject.optString("creativeType", com.bytedance.sdk.openadsdk.core.PX.bX.bg.EnumC0137bg.NONE.toString());
        java.lang.String strOptString2 = jSONObject.optString("resourceType", com.bytedance.sdk.openadsdk.core.PX.bX.bg.IL.HTML_RESOURCE.toString());
        java.lang.String strOptString3 = jSONObject.optString("contentUrl");
        java.lang.String strOptString4 = jSONObject.optString("clickThroughUri");
        org.json.JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("clickTrackers");
        org.json.JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("creativeViewTrackers");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            arrayList.add(new com.bytedance.sdk.openadsdk.core.PX.IL.bX.bg(jSONArrayOptJSONArray.optString(i)).bg());
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (int i2 = 0; i2 < jSONArrayOptJSONArray2.length(); i2++) {
            arrayList2.add(new com.bytedance.sdk.openadsdk.core.PX.IL.bX.bg(jSONArrayOptJSONArray2.optString(i2)).bg());
        }
        return new com.bytedance.sdk.openadsdk.core.PX.bX(iOptInt, iOptInt2, com.bytedance.sdk.openadsdk.core.PX.bX.bg.EnumC0137bg.valueOf(strOptString), com.bytedance.sdk.openadsdk.core.PX.bX.bg.IL.valueOf(strOptString2), strOptString3, arrayList, arrayList2, strOptString4);
    }

    public org.json.JSONObject bg() throws org.json.JSONException {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("width", this.bg);
        jSONObject.put("height", this.IL);
        jSONObject.put("creativeType", this.bX.toString());
        jSONObject.put("resourceType", this.eqN.toString());
        jSONObject.put("contentUrl", this.zx);
        jSONObject.put("clickThroughUri", this.Kg);
        jSONObject.put("clickTrackers", com.bytedance.sdk.openadsdk.core.PX.IL.bX.bg(this.ldr));
        jSONObject.put("creativeViewTrackers", com.bytedance.sdk.openadsdk.core.PX.IL.bX.bg(this.iR));
        return jSONObject;
    }

    public void bg(com.bytedance.sdk.openadsdk.core.model.tuV tuv) {
        this.PX = tuv;
    }
}
