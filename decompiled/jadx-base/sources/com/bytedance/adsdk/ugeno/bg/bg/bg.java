package com.bytedance.adsdk.ugeno.bg.bg;

/* JADX INFO: loaded from: classes3.dex */
public abstract class bg {
    protected com.bytedance.adsdk.ugeno.IL.bX IL;
    private java.lang.String bX;
    protected org.json.JSONObject bg;

    public abstract void IL();

    public abstract java.util.List<android.animation.PropertyValuesHolder> bX();

    public abstract void bg(int i, int i2);

    public abstract void bg(android.graphics.Canvas canvas);

    public bg(com.bytedance.adsdk.ugeno.IL.bX bXVar, org.json.JSONObject jSONObject) {
        this.bg = jSONObject;
        this.IL = bXVar;
        bg();
    }

    public void bg() {
        this.bX = this.bg.optString("type");
        IL();
    }

    public java.lang.String eqN() {
        return this.bX;
    }

    /* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.bg.bg.bg$bg, reason: collision with other inner class name */
    public static class C0087bg {
        public static com.bytedance.adsdk.ugeno.bg.bg.bg bg(com.bytedance.adsdk.ugeno.IL.bX bXVar, org.json.JSONObject jSONObject) {
            if (bXVar == null || jSONObject == null) {
                return null;
            }
            java.lang.String strOptString = jSONObject.optString("type");
            strOptString.hashCode();
            switch (strOptString) {
                case "stretch":
                    return new com.bytedance.adsdk.ugeno.bg.bg.zx(bXVar, jSONObject);
                case "ripple":
                    return new com.bytedance.adsdk.ugeno.bg.bg.IL(bXVar, jSONObject);
                case "rub_in":
                    return new com.bytedance.adsdk.ugeno.bg.bg.bX(bXVar, jSONObject);
                case "shine":
                    return new com.bytedance.adsdk.ugeno.bg.bg.eqN(bXVar, jSONObject);
                default:
                    return null;
            }
        }
    }
}
