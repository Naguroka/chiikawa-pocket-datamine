package com.bytedance.sdk.component.Kg;

/* JADX INFO: loaded from: classes3.dex */
public class zx {
    private static com.bytedance.sdk.component.Kg.eo bg = new com.bytedance.sdk.component.Kg.eo() { // from class: com.bytedance.sdk.component.Kg.zx.1
        @Override // com.bytedance.sdk.component.Kg.eo
        public com.bytedance.sdk.component.Kg.WR createThreadFactory(int i, java.lang.String str) {
            return new com.bytedance.sdk.component.Kg.WR(i, str);
        }
    };

    public static void bg(com.bytedance.sdk.component.Kg.eo eoVar) {
        bg = eoVar;
    }

    public static com.bytedance.sdk.component.Kg.eo bg() {
        return bg;
    }
}
