package com.bytedance.sdk.component.iR.eqN;

/* JADX INFO: loaded from: classes3.dex */
public class bX {
    private com.bytedance.sdk.component.iR.eqN.bX.IL IL;
    private com.bytedance.sdk.component.iR.eqN.bX.bg bg;

    public interface IL {
    }

    public enum bg {
        DEBUG,
        INFO,
        ERROR,
        OFF
    }

    private bX() {
        this.bg = com.bytedance.sdk.component.iR.eqN.bX.bg.OFF;
        this.IL = new com.bytedance.sdk.component.iR.eqN.IL();
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.component.iR.eqN.bX$bX, reason: collision with other inner class name */
    private static class C0113bX {
        private static final com.bytedance.sdk.component.iR.eqN.bX bg = new com.bytedance.sdk.component.iR.eqN.bX();
    }

    public static void bg(com.bytedance.sdk.component.iR.eqN.bX.bg bgVar) {
        synchronized (com.bytedance.sdk.component.iR.eqN.bX.class) {
            com.bytedance.sdk.component.iR.eqN.bX.C0113bX.bg.bg = bgVar;
        }
    }
}
