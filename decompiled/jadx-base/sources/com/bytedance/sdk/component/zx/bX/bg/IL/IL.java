package com.bytedance.sdk.component.zx.bX.bg.IL;

/* JADX INFO: loaded from: classes3.dex */
public class IL implements com.bytedance.sdk.component.zx.tuV {
    private int IL;
    private com.bytedance.sdk.component.zx.bX.bg.bX<java.lang.String, android.graphics.Bitmap> bX;
    private int bg;

    public IL(int i, int i2) {
        this.IL = i;
        this.bg = i2;
        this.bX = new com.bytedance.sdk.component.zx.bX.bg.bX<java.lang.String, android.graphics.Bitmap>(i) { // from class: com.bytedance.sdk.component.zx.bX.bg.IL.IL.1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.bytedance.sdk.component.zx.bX.bg.bX
            /* JADX INFO: renamed from: bg, reason: merged with bridge method [inline-methods] */
            public int IL(java.lang.String str, android.graphics.Bitmap bitmap) {
                if (bitmap == null) {
                    return 0;
                }
                return com.bytedance.sdk.component.zx.bX.bg.IL.IL.bg(bitmap);
            }
        };
    }

    @Override // com.bytedance.sdk.component.zx.bg
    public boolean bg(java.lang.String str, android.graphics.Bitmap bitmap) {
        if (str == null || bitmap == null) {
            return false;
        }
        this.bX.bg(str, bitmap);
        return true;
    }

    @Override // com.bytedance.sdk.component.zx.bg
    public android.graphics.Bitmap bg(java.lang.String str) {
        return this.bX.bg(str);
    }

    @Override // com.bytedance.sdk.component.zx.bg
    public boolean IL(java.lang.String str) {
        return this.bX.bg(str) != null;
    }

    public static int bg(android.graphics.Bitmap bitmap) {
        if (bitmap == null) {
            return 0;
        }
        return bitmap.getAllocationByteCount();
    }
}
