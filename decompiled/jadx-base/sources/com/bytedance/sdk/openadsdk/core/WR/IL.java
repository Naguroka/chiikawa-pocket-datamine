package com.bytedance.sdk.openadsdk.core.WR;

/* JADX INFO: loaded from: classes4.dex */
class IL {
    private static com.bytedance.sdk.openadsdk.core.WR.bg bg;
    private java.lang.String IL;

    private IL() {
        this.IL = null;
        bg = new com.bytedance.sdk.openadsdk.core.WR.bg();
    }

    public void bg(java.lang.String str) {
        com.bytedance.sdk.openadsdk.core.WR.bg bgVar;
        if (android.text.TextUtils.isEmpty(str) || (bgVar = bg) == null) {
            return;
        }
        bgVar.bg(str);
    }

    public void IL(java.lang.String str) {
        com.bytedance.sdk.openadsdk.core.WR.bg bgVar;
        if (android.text.TextUtils.isEmpty(str) || (bgVar = bg) == null) {
            return;
        }
        bgVar.IL(str);
    }

    public void bg() {
        com.bytedance.sdk.openadsdk.core.WR.bg bgVar = bg;
        if (bgVar != null) {
            bgVar.bX();
        }
    }

    public static com.bytedance.sdk.openadsdk.core.WR.IL IL() {
        return com.bytedance.sdk.openadsdk.core.WR.IL.bg.bg;
    }

    public void bg(java.lang.String str, java.util.Map<java.lang.String, java.lang.Object> map) {
        com.bytedance.sdk.openadsdk.core.WR.bg bgVar = bg;
        if (bgVar != null) {
            bgVar.bg(str, map);
        }
    }

    public boolean bX() {
        com.bytedance.sdk.openadsdk.core.WR.bg bgVar = bg;
        if (bgVar == null) {
            return false;
        }
        return bgVar.IL();
    }

    public java.lang.String eqN() {
        java.lang.String strEqN;
        com.bytedance.sdk.openadsdk.core.WR.bg bgVar = bg;
        return (bgVar == null || (strEqN = bgVar.eqN()) == null) ? "" : strEqN;
    }

    public java.util.Map<java.lang.String, java.lang.String> bg(java.lang.String str, byte[] bArr) {
        com.bytedance.sdk.openadsdk.core.WR.bg bgVar = bg;
        if (bgVar != null) {
            return bgVar.bg(str, bArr);
        }
        return new java.util.HashMap();
    }

    public java.lang.String zx() {
        com.bytedance.sdk.openadsdk.core.WR.bg bgVar = bg;
        return bgVar != null ? bgVar.zx() : "";
    }

    public long ldr() {
        com.bytedance.sdk.openadsdk.core.WR.bg bgVar = bg;
        if (bgVar != null) {
            return bgVar.ldr();
        }
        return 0L;
    }

    public int iR() {
        com.bytedance.sdk.openadsdk.core.WR.bg bgVar = bg;
        if (bgVar != null) {
            return bgVar.iR();
        }
        return 1;
    }

    public void bg(android.view.MotionEvent motionEvent) {
        com.bytedance.sdk.openadsdk.core.WR.bg bgVar = bg;
        if (bgVar != null) {
            bgVar.bg(motionEvent);
        }
    }

    private static class bg {
        private static final com.bytedance.sdk.openadsdk.core.WR.IL bg = new com.bytedance.sdk.openadsdk.core.WR.IL();
    }
}
