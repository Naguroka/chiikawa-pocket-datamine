package com.bytedance.sdk.component.zx.bg;

/* JADX INFO: loaded from: classes3.dex */
public class IL {
    public static com.bytedance.sdk.component.zx.PX bg() {
        return new com.bytedance.sdk.component.zx.PX() { // from class: com.bytedance.sdk.component.zx.bg.IL.1
            private java.util.WeakHashMap<java.lang.String, java.lang.String> bg = new java.util.WeakHashMap<>();

            @Override // com.bytedance.sdk.component.zx.PX
            public java.lang.String bg(com.bytedance.sdk.component.zx.WR wr) {
                return bg(wr.bg() + "#width=" + wr.IL() + "#height=" + wr.bX() + "#scaletype=" + wr.eqN() + "#bitmapConfig=" + wr.ldr());
            }

            @Override // com.bytedance.sdk.component.zx.PX
            public java.lang.String IL(com.bytedance.sdk.component.zx.WR wr) {
                return bg(wr.bg());
            }

            private java.lang.String bg(java.lang.String str) {
                java.lang.String str2 = this.bg.get(str);
                if (str2 != null) {
                    return str2;
                }
                java.lang.String strBg = com.bytedance.sdk.component.zx.bX.bX.bX.bg(str);
                this.bg.put(str, strBg);
                return strBg;
            }
        };
    }
}
