package com.bytedance.sdk.component.adexpress.ldr;

/* JADX INFO: loaded from: classes3.dex */
public class ldr extends com.bytedance.sdk.component.adexpress.ldr.rri {
    private com.bytedance.sdk.component.adexpress.ldr.LZ bg;

    public ldr(android.content.Context context, int i, int i2, int i3, org.json.JSONObject jSONObject) {
        super(context);
        bg(context, i, i2, i3, jSONObject);
    }

    private void bg(android.content.Context context, int i, int i2, int i3, org.json.JSONObject jSONObject) {
        com.bytedance.sdk.component.adexpress.ldr.LZ lz = new com.bytedance.sdk.component.adexpress.ldr.LZ(context, com.bytedance.sdk.component.adexpress.bX.bg.bX(context), i, i2, i3, jSONObject);
        this.bg = lz;
        addView(lz);
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(14);
        layoutParams.addRule(12);
        this.bg.setLayoutParams(layoutParams);
    }

    public com.bytedance.sdk.component.adexpress.ldr.LZ getShakeView() {
        return this.bg;
    }

    public void setShakeText(java.lang.String str) {
        if (this.bg == null) {
            return;
        }
        if (android.text.TextUtils.isEmpty(str)) {
            this.bg.setShakeText("");
        } else {
            this.bg.setShakeText(str);
        }
    }
}
