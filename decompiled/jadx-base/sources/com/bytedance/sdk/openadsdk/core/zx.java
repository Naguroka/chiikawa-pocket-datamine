package com.bytedance.sdk.openadsdk.core;

/* JADX INFO: loaded from: classes4.dex */
public class zx extends com.bytedance.sdk.openadsdk.core.ldr {
    private static volatile com.bytedance.sdk.openadsdk.core.zx bg;

    @Override // com.bytedance.sdk.openadsdk.core.ldr
    public /* bridge */ /* synthetic */ com.bytedance.sdk.openadsdk.core.ldr.bX bg() {
        return super.bg();
    }

    public static com.bytedance.sdk.openadsdk.core.zx bg(android.content.Context context) {
        if (bg == null) {
            synchronized (com.bytedance.sdk.openadsdk.core.zx.class) {
                if (bg == null) {
                    bg = new com.bytedance.sdk.openadsdk.core.zx(context);
                }
            }
        }
        return bg;
    }

    private zx(android.content.Context context) {
        super(context);
    }
}
