package com.bytedance.sdk.openadsdk.core.PX.bg;

/* JADX INFO: loaded from: classes4.dex */
public abstract class IL {
    protected final android.content.Context IL;
    protected int bX;
    public int bg;
    protected double eqN;
    public com.bytedance.sdk.openadsdk.core.PX.bg.IL.bg ldr;
    public int zx;

    public static class bg {
        public int IL;
        public boolean bX;
        public int bg;
    }

    public abstract com.bytedance.sdk.openadsdk.core.PX.bg bg(java.lang.String str, java.util.List<com.bytedance.sdk.openadsdk.core.PX.IL.bX> list);

    public IL(android.content.Context context, int i, int i2) {
        this.bX = 0;
        this.eqN = 0.0d;
        if (i2 > 0 && i > 0) {
            this.eqN = ((double) i) / ((double) i2);
        }
        float fZx = com.bytedance.sdk.openadsdk.utils.ZQc.zx(context);
        if (fZx != 0.0f && i > 0) {
            this.bX = (int) (i / fZx);
        }
        this.IL = context.getApplicationContext();
    }

    protected void bg(java.lang.Exception exc, int i) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("exception", exc.getMessage());
            jSONObject.put("error_code", i);
            com.bytedance.sdk.openadsdk.yDt.bX.bg().bg("load_vast", jSONObject);
        } catch (java.lang.Exception unused) {
        }
    }

    protected boolean bg(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return true;
        }
        try {
            return java.lang.Integer.parseInt(str) < 2;
        } catch (java.lang.NumberFormatException unused) {
            return true;
        }
    }

    protected java.lang.String IL(java.lang.String str, java.util.List<com.bytedance.sdk.openadsdk.core.PX.IL.bX> list) {
        java.lang.String strEqN;
        int i = this.bg;
        if (i >= 5) {
            return null;
        }
        this.bg = i + 1;
        if (str == null) {
            return null;
        }
        try {
            com.bytedance.sdk.component.iR.IL.IL ilBX = com.bytedance.sdk.openadsdk.xxp.bX.bg().IL().bX();
            ilBX.IL(str);
            com.bytedance.sdk.component.iR.IL ilBg = ilBX.bg();
            strEqN = ilBg.eqN();
            try {
                ilBg.bg();
            } catch (java.lang.Exception e) {
                e = e;
                bg(e, 0);
                if (!list.isEmpty()) {
                    com.bytedance.sdk.openadsdk.core.PX.IL.bX.IL(list, com.bytedance.sdk.openadsdk.core.PX.bg.bg.WRAPPER_TIMEOUT, -1L, null);
                }
            }
        } catch (java.lang.Exception e2) {
            e = e2;
            strEqN = null;
        }
        return strEqN;
    }
}
