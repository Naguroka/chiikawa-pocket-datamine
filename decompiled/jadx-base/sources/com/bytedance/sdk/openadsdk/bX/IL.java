package com.bytedance.sdk.openadsdk.bX;

/* JADX INFO: loaded from: classes4.dex */
public class IL {
    private static volatile com.bytedance.sdk.openadsdk.bX.IL bg;
    private final com.bytedance.sdk.openadsdk.core.Fy<com.bytedance.sdk.openadsdk.eqN.bg> IL = com.bytedance.sdk.openadsdk.core.VzQ.bX();

    private IL() {
    }

    public static com.bytedance.sdk.openadsdk.bX.IL bg() {
        if (bg == null) {
            synchronized (com.bytedance.sdk.openadsdk.bX.IL.class) {
                if (bg == null) {
                    bg = new com.bytedance.sdk.openadsdk.bX.IL();
                }
            }
        }
        return bg;
    }

    public void bg(java.lang.String str, java.util.List<com.bytedance.sdk.openadsdk.FilterWord> list, java.lang.String str2) {
        bg(str, list, null, null, str2);
    }

    public void bg(java.lang.String str, java.util.List<com.bytedance.sdk.openadsdk.FilterWord> list, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        this.IL.bg(str, list, str2, str3, str4);
    }
}
