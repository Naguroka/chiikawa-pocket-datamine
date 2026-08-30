package com.bytedance.sdk.component.zx.bX.bg.IL;

/* JADX INFO: loaded from: classes3.dex */
public class bX implements com.bytedance.sdk.component.zx.Fy {
    private int IL;
    private com.bytedance.sdk.component.zx.bX.bg.bX<java.lang.String, byte[]> bX;
    private int bg;

    public bX(int i, int i2) {
        this.IL = i;
        this.bg = i2;
        this.bX = new com.bytedance.sdk.component.zx.bX.bg.bX<java.lang.String, byte[]>(i) { // from class: com.bytedance.sdk.component.zx.bX.bg.IL.bX.1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.bytedance.sdk.component.zx.bX.bg.bX
            /* JADX INFO: renamed from: bg, reason: merged with bridge method [inline-methods] */
            public int IL(java.lang.String str, byte[] bArr) {
                if (bArr == null) {
                    return 0;
                }
                return bArr.length;
            }
        };
    }

    @Override // com.bytedance.sdk.component.zx.bg
    public boolean bg(java.lang.String str, byte[] bArr) {
        if (str == null || bArr == null) {
            return false;
        }
        this.bX.bg(str, bArr);
        return true;
    }

    @Override // com.bytedance.sdk.component.zx.bg
    public byte[] bg(java.lang.String str) {
        return this.bX.bg(str);
    }

    @Override // com.bytedance.sdk.component.zx.bg
    public boolean IL(java.lang.String str) {
        return this.bX.bg(str) != null;
    }
}
