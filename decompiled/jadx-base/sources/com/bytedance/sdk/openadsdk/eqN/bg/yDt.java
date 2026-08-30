package com.bytedance.sdk.openadsdk.eqN.bg;

/* JADX INFO: loaded from: classes4.dex */
public class yDt {
    public static com.bytedance.sdk.openadsdk.eqN.bg.yDt bg = new com.bytedance.sdk.openadsdk.eqN.bg.yDt();
    private com.bytedance.sdk.openadsdk.eqN.bg.yDt.bg IL;
    private final java.util.Map<java.lang.String, com.bytedance.sdk.openadsdk.eqN.bg.yDt.bg> bX = new java.util.HashMap();
    private volatile boolean eqN;

    private int IL() {
        com.bytedance.sdk.openadsdk.eqN.bg.yDt.bg bgVar = this.IL;
        if (bgVar != null) {
            return bgVar.bg();
        }
        return 3;
    }

    private int bX() {
        com.bytedance.sdk.openadsdk.eqN.bg.yDt.bg bgVar = this.IL;
        if (bgVar != null) {
            return bgVar.IL();
        }
        return 30;
    }

    public void bg(com.bytedance.sdk.openadsdk.eqN.bg.yDt.bg bgVar) {
        this.IL = bgVar;
    }

    public void bg(java.lang.String str, com.bytedance.sdk.openadsdk.eqN.bg.yDt.bg bgVar) {
        if (android.text.TextUtils.isEmpty(str) || bgVar == null) {
            return;
        }
        this.bX.put(str, bgVar);
    }

    public int bg(java.lang.String str) {
        if (!bg()) {
            return 4;
        }
        com.bytedance.sdk.openadsdk.eqN.bg.yDt.bg bgVar = this.bX.get(str);
        if (bgVar == null) {
            return IL();
        }
        return bgVar.bg();
    }

    public int IL(java.lang.String str) {
        com.bytedance.sdk.openadsdk.eqN.bg.yDt.bg bgVar = this.bX.get(str);
        if (bgVar == null) {
            return bX();
        }
        return bgVar.IL();
    }

    public boolean bg() {
        return this.eqN;
    }

    public void bg(boolean z) {
        this.eqN = z;
    }

    public static class bg {
        private final int IL;
        private final int bg;

        public bg(int i, int i2) {
            this.bg = (i < 0 || i > 5) ? 3 : i;
            this.IL = i2 < 10 ? 30 : i2;
        }

        public int bg() {
            return this.bg;
        }

        public int IL() {
            return this.IL;
        }
    }
}
