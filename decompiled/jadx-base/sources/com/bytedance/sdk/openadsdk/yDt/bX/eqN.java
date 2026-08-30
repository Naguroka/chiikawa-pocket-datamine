package com.bytedance.sdk.openadsdk.yDt.bX;

/* JADX INFO: loaded from: classes4.dex */
class eqN implements com.bytedance.sdk.openadsdk.yDt.bX.IL {
    private static volatile com.bytedance.sdk.openadsdk.yDt.bX.eqN bg;

    @Override // com.bytedance.sdk.openadsdk.yDt.bX.IL
    public void bg(com.bytedance.sdk.openadsdk.yDt.IL il) {
    }

    @Override // com.bytedance.sdk.openadsdk.yDt.bX.IL
    public void bg(com.bytedance.sdk.openadsdk.yDt.IL il, boolean z) {
    }

    public static com.bytedance.sdk.openadsdk.yDt.bX.eqN bg() {
        if (bg == null) {
            synchronized (com.bytedance.sdk.openadsdk.yDt.bX.eqN.class) {
                if (bg == null) {
                    bg = new com.bytedance.sdk.openadsdk.yDt.bX.eqN();
                }
            }
        }
        return bg;
    }

    private eqN() {
    }
}
