package com.bytedance.adsdk.IL;

/* JADX INFO: loaded from: classes3.dex */
public class LZ {
    private boolean IL;
    private final java.util.Map<java.lang.String, java.lang.String> bg;

    public java.lang.String bg(java.lang.String str) {
        return str;
    }

    public java.lang.String bg(java.lang.String str, java.lang.String str2) {
        return bg(str2);
    }

    public final java.lang.String IL(java.lang.String str, java.lang.String str2) {
        if (this.IL && this.bg.containsKey(str2)) {
            return this.bg.get(str2);
        }
        java.lang.String strBg = bg(str, str2);
        if (this.IL) {
            this.bg.put(str2, strBg);
        }
        return strBg;
    }
}
