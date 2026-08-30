package com.bytedance.sdk.component.adexpress.dynamic.eqN;

/* JADX INFO: loaded from: classes3.dex */
public class zx {
    public static final java.util.Map<java.lang.String, java.lang.Integer> bg;
    private java.lang.String IL;
    private java.lang.String bX;
    private com.bytedance.sdk.component.adexpress.dynamic.eqN.ldr eqN;
    private java.lang.String ldr;
    private com.bytedance.sdk.component.adexpress.dynamic.eqN.ldr zx;

    static {
        java.util.HashMap map = new java.util.HashMap();
        bg = map;
        map.put("root", 8);
        map.put("footer", 6);
        map.put("empty", 6);
        map.put(com.ironsource.y8.h.D0, 0);
        map.put("subtitle", 0);
        map.put("source", 0);
        map.put("score-count", 0);
        map.put("text_star", 0);
        map.put("text", 0);
        map.put("tag-group", 17);
        map.put("app-version", 0);
        map.put("development-name", 0);
        map.put("privacy-detail", 23);
        map.put("image", 1);
        map.put("image-wide", 1);
        map.put("image-square", 1);
        map.put("image-long", 1);
        map.put("image-splash", 1);
        map.put("image-cover", 1);
        map.put("app-icon", 1);
        map.put("icon-download", 1);
        map.put("logoad", 4);
        map.put("logounion", 5);
        map.put("logo-union", 9);
        map.put("dislike", 3);
        map.put("close", 3);
        map.put("close-fill", 3);
        map.put("webview-close", 22);
        map.put("feedback-dislike", 12);
        map.put("button", 2);
        map.put("downloadWithIcon", 2);
        map.put("downloadButton", 2);
        map.put("fillButton", 2);
        map.put("laceButton", 2);
        map.put("cardButton", 2);
        map.put("colourMixtureButton", 2);
        map.put("arrowButton", 1);
        map.put("download-progress-button", 2);
        map.put("vessel", 6);
        map.put("image-group", 6);
        map.put("custom-component-vessel", 6);
        map.put("carousel", 24);
        map.put("carousel-vessel", 26);
        map.put("leisure-interact", 25);
        map.put("video-hd", 7);
        map.put("video", 7);
        map.put("video-vd", 7);
        map.put("video-sq", 7);
        map.put("muted", 10);
        map.put("star", 11);
        map.put("skip-countdowns", 19);
        map.put("skip-with-countdowns-skip-btn", 21);
        map.put("skip-with-countdowns-video-countdown", 13);
        map.put("skip-with-countdowns-skip-countdown", 20);
        map.put("skip-with-time", 14);
        map.put("skip-with-time-countdown", 13);
        map.put("skip-with-time-skip-btn", 15);
        map.put("skip", 27);
        map.put("timedown", 13);
        map.put(com.ironsource.y8.h.H0, 16);
        map.put("scoreCountWithIcon", 6);
        map.put("split-line", 18);
        map.put("creative-playable-bait", 0);
        map.put("score-count-type-2", 0);
        map.put("lottie", 28);
    }

    public int bg() {
        if (android.text.TextUtils.isEmpty(this.IL)) {
            return 0;
        }
        if (this.IL.equals("logo")) {
            java.lang.String str = this.IL + this.bX;
            this.IL = str;
            if (str.contains("logoad")) {
                return 4;
            }
            if (this.IL.contains("logounion")) {
                return 5;
            }
        }
        java.util.Map<java.lang.String, java.lang.Integer> map = bg;
        if (map.get(this.IL) != null) {
            return map.get(this.IL).intValue();
        }
        return -1;
    }

    public java.lang.String IL() {
        return this.IL;
    }

    public void bg(java.lang.String str) {
        this.IL = str;
    }

    public java.lang.String bX() {
        return this.bX;
    }

    public void IL(java.lang.String str) {
        this.bX = str;
    }

    public void bX(java.lang.String str) {
        this.ldr = str;
    }

    public java.lang.String eqN() {
        return this.ldr;
    }

    public com.bytedance.sdk.component.adexpress.dynamic.eqN.ldr zx() {
        return this.eqN;
    }

    public int ldr() {
        return this.eqN.RFq();
    }

    public void bg(com.bytedance.sdk.component.adexpress.dynamic.eqN.ldr ldrVar) {
        this.eqN = ldrVar;
    }

    public void IL(com.bytedance.sdk.component.adexpress.dynamic.eqN.ldr ldrVar) {
        this.zx = ldrVar;
    }

    public com.bytedance.sdk.component.adexpress.dynamic.eqN.ldr iR() {
        return this.zx;
    }

    public java.lang.String toString() {
        return "DynamicLayoutBrick{type='" + this.IL + "', data='" + this.bX + "', value=" + this.eqN + ", themeValue=" + this.zx + ", dataExtraInfo='" + this.ldr + "'}";
    }
}
