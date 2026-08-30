package com.bytedance.sdk.component.adexpress.ldr;

/* JADX INFO: loaded from: classes3.dex */
public class LZ extends com.bytedance.sdk.component.adexpress.ldr.Fy {
    private android.widget.TextView bg;

    public LZ(android.content.Context context, android.view.View view, int i, int i2, int i3, org.json.JSONObject jSONObject) {
        super(context, view, i, i2, i3, jSONObject);
    }

    @Override // com.bytedance.sdk.component.adexpress.ldr.Fy
    protected void bg(android.content.Context context, android.view.View view) {
        addView(view);
        this.bg = (android.widget.TextView) findViewById(2097610747);
    }

    @Override // com.bytedance.sdk.component.adexpress.ldr.Fy
    public void setShakeText(java.lang.String str) {
        if (this.bg == null) {
            return;
        }
        if (android.text.TextUtils.isEmpty(str)) {
            try {
                this.bg.setText(com.bytedance.sdk.component.utils.Fy.IL(this.bg.getContext(), "tt_splash_default_click_shake"));
                return;
            } catch (java.lang.Exception e) {
                com.bytedance.sdk.component.utils.PX.bg("shakeClickView", e.getMessage());
                return;
            }
        }
        this.bg.setText(str);
    }
}
