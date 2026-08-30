package com.bytedance.sdk.component.zx.bX.bg.IL;

/* JADX INFO: loaded from: classes3.dex */
public class eqN implements com.bytedance.sdk.component.zx.tuV {
    private final com.bytedance.sdk.component.zx.bX.bg.IL IL;
    private final com.bytedance.sdk.component.zx.tuV bg;

    public eqN(com.bytedance.sdk.component.zx.tuV tuv) {
        this(tuv, null);
    }

    public eqN(com.bytedance.sdk.component.zx.tuV tuv, com.bytedance.sdk.component.zx.bX.bg.IL il) {
        this.bg = tuv;
        this.IL = il;
    }

    @Override // com.bytedance.sdk.component.zx.bg
    public boolean bg(java.lang.String str, android.graphics.Bitmap bitmap) {
        boolean zBg = this.bg.bg(str, bitmap);
        if (this.IL != null) {
            java.lang.Boolean.valueOf(zBg);
        }
        return zBg;
    }

    @Override // com.bytedance.sdk.component.zx.bg
    public android.graphics.Bitmap bg(java.lang.String str) {
        return this.bg.bg(str);
    }

    @Override // com.bytedance.sdk.component.zx.bg
    public boolean IL(java.lang.String str) {
        return this.bg.IL(str);
    }
}
