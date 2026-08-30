package com.bytedance.adsdk.ugeno.eqN.IL;

/* JADX INFO: loaded from: classes3.dex */
public abstract class bg {
    public static final java.util.HashSet<java.lang.String> bg = new java.util.HashSet<>(java.util.Arrays.asList("convert", "dislike", "openAppPermission", "openAppPolicy", "openPrivacy", "openAppFunction", "close", "skip", "videoControl", "pauseVideo", "resumeVideo", "muteVideo"));
    protected com.bytedance.adsdk.ugeno.eqN.IL.bg IL;
    protected com.bytedance.adsdk.ugeno.IL.bX bX;
    protected java.lang.String eqN;
    protected java.lang.String iR;
    protected java.util.Map<java.lang.String, java.lang.String> ldr;
    protected java.lang.String zx;

    public abstract void bg();

    public bg(com.bytedance.adsdk.ugeno.IL.bX bXVar, java.lang.String str, com.bytedance.adsdk.ugeno.eqN.IL.bg bgVar) {
        this.bX = bXVar;
        this.IL = bgVar;
        this.iR = str;
        IL();
    }

    private void IL() {
        com.bytedance.adsdk.ugeno.eqN.IL.bg bgVar = this.IL;
        if (bgVar == null) {
            return;
        }
        this.eqN = bgVar.bg();
        this.zx = this.IL.IL();
        this.ldr = this.IL.bX();
    }

    /* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.eqN.IL.bg$bg, reason: collision with other inner class name */
    public static class C0090bg {
        public static com.bytedance.adsdk.ugeno.eqN.IL.bg bg(com.bytedance.adsdk.ugeno.IL.bX bXVar, java.lang.String str, com.bytedance.adsdk.ugeno.eqN.IL.bg bgVar) {
            if (bgVar == null) {
                return null;
            }
            java.lang.String strIL = bgVar.IL();
            if (com.bytedance.adsdk.ugeno.eqN.IL.bg.bg.contains(strIL)) {
                return new com.bytedance.adsdk.ugeno.eqN.IL.bX(bXVar, str, bgVar);
            }
            strIL.hashCode();
            if (strIL.equals("update")) {
                return new com.bytedance.adsdk.ugeno.eqN.IL.eqN(bXVar, str, bgVar);
            }
            if (strIL.equals("emit")) {
                return new com.bytedance.adsdk.ugeno.eqN.IL.IL(bXVar, str, bgVar);
            }
            return null;
        }
    }
}
