package com.bytedance.adsdk.IL.bX;

/* JADX INFO: loaded from: classes3.dex */
public class ldr {
    public final float IL;
    private final java.lang.String bX;
    public final float bg;

    public ldr(java.lang.String str, float f, float f2) {
        this.bX = str;
        this.IL = f2;
        this.bg = f;
    }

    public boolean bg(java.lang.String str) {
        if (this.bX.equalsIgnoreCase(str)) {
            return true;
        }
        if (this.bX.endsWith("\r")) {
            java.lang.String str2 = this.bX;
            if (str2.substring(0, str2.length() - 1).equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }
}
