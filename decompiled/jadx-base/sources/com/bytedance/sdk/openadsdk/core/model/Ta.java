package com.bytedance.sdk.openadsdk.core.model;

/* JADX INFO: loaded from: classes4.dex */
public class Ta {
    private final int IL;
    private final int bX;
    private final int bg;
    private final int eqN;

    public Ta(org.json.JSONObject jSONObject) {
        this.bg = jSONObject.optInt("auto_click", 0);
        this.IL = jSONObject.optInt("close_jump_probability", 0);
        this.bX = jSONObject.optInt("skip_jump_probability", 0);
        this.eqN = jSONObject.optInt("hidden_bar", 0);
    }

    public int bg() {
        return this.bg;
    }

    public int IL() {
        int i = this.IL;
        if (i < 0 || i > 100) {
            return 0;
        }
        return i;
    }

    public int bX() {
        int i = this.bX;
        if (i < 0 || i > 100) {
            return 0;
        }
        return i;
    }

    public boolean eqN() {
        return this.eqN == 1;
    }

    public org.json.JSONObject zx() {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            int i = this.bg;
            if (i == 1) {
                jSONObject.put("auto_click", i);
            }
            int i2 = this.IL;
            if (i2 > 0 && i2 <= 100) {
                jSONObject.put("close_jump_probability", i2);
            }
            int i3 = this.bX;
            if (i3 > 0 && i3 <= 100) {
                jSONObject.put("skip_jump_probability", i3);
            }
            if (this.eqN == 1) {
                jSONObject.put("hidden_bar", 1);
            }
            return jSONObject;
        } catch (org.json.JSONException unused) {
            return null;
        }
    }

    public static boolean bg(com.bytedance.sdk.openadsdk.core.model.tuV tuv) {
        if (tuv == null || !tuv.HXG() || tuv.JlG() == null) {
            return false;
        }
        return tuv.JlG().eqN();
    }
}
