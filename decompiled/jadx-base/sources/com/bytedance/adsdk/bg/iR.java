package com.bytedance.adsdk.bg;

/* JADX INFO: loaded from: classes3.dex */
public class iR {
    public static java.lang.Object bg(com.bytedance.adsdk.bg.IL.bg.bg bgVar) {
        com.bytedance.adsdk.bg.zx zxVarBg;
        if (bgVar == null || (zxVarBg = bg(bgVar.bg())) == null) {
            return null;
        }
        return zxVarBg.bg(null, bgVar.IL());
    }

    public static com.bytedance.adsdk.bg.zx bg(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        str.hashCode();
        switch (str) {
            case "find":
                return new com.bytedance.adsdk.bg.bX();
            case "exist":
                return new com.bytedance.adsdk.bg.IL();
            case "translate":
                return new com.bytedance.adsdk.bg.ldr();
            case "isDigit":
                return new com.bytedance.adsdk.bg.eqN();
            default:
                return null;
        }
    }
}
