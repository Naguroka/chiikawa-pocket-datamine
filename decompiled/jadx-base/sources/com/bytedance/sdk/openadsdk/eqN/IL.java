package com.bytedance.sdk.openadsdk.eqN;

/* JADX INFO: loaded from: classes4.dex */
public class IL {
    public static final java.lang.String bg = com.bytedance.sdk.openadsdk.eqN.bX.bg.InterfaceC0158bg.bg;
    public static final java.lang.String IL = com.bytedance.sdk.openadsdk.eqN.bX.bg.InterfaceC0158bg.IL;
    public static final java.lang.String bX = com.bytedance.sdk.openadsdk.eqN.bX.bg.InterfaceC0158bg.bX;
    public static final java.lang.String eqN = com.bytedance.sdk.openadsdk.eqN.bX.bg.InterfaceC0158bg.eqN;
    public static final java.lang.String zx = com.bytedance.sdk.openadsdk.eqN.bX.bg.InterfaceC0158bg.zx;
    public static final java.lang.String ldr = com.bytedance.sdk.openadsdk.eqN.bX.bg.InterfaceC0158bg.ldr;
    public static final java.util.Set<java.lang.String> iR = new java.util.HashSet(java.util.Arrays.asList(com.json.z8.d, com.json.j5.v, "insight_log"));

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.eqN.IL$IL, reason: collision with other inner class name */
    public static class C0157IL {
        public static int IL = 2;
        public static int bX = 100;
        public static int bg = 1;
    }

    public static class bg {
        public static java.lang.String IL = "openAdLandPageLinks";
        public static java.lang.String bX = "direct";
        public static java.lang.String bg = "openDetailPage";
        public static java.lang.String eqN = "saLandingPageLinks";
    }

    public static boolean bg(java.lang.String str) {
        return "embeded_ad".equals(str) || "banner_ad".equals(str) || "interaction".equals(str) || "slide_banner_ad".equals(str);
    }
}
