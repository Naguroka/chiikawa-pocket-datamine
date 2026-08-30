package com.bytedance.sdk.component.utils;

/* JADX INFO: loaded from: classes3.dex */
public class bg {

    /* JADX INFO: renamed from: com.bytedance.sdk.component.utils.bg$bg, reason: collision with other inner class name */
    static class C0118bg {
        static final java.util.Random bg = com.bytedance.sdk.component.utils.bg.bX();
    }

    public static org.json.JSONObject bg(org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            return new org.json.JSONObject();
        }
        return bg(jSONObject.toString());
    }

    public static org.json.JSONObject bg(java.lang.String str) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        if (android.text.TextUtils.isEmpty(str)) {
            return jSONObject;
        }
        try {
            try {
                java.lang.String strIL = IL(str);
                if (!android.text.TextUtils.isEmpty(strIL)) {
                    jSONObject.put(com.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE, strIL);
                    jSONObject.put("cypher", 3);
                } else {
                    jSONObject.put(com.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE, str);
                    jSONObject.put("cypher", 0);
                }
            } catch (java.lang.Throwable th) {
                th.getMessage();
            }
        } catch (java.lang.Throwable unused) {
            jSONObject.put(com.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE, str);
            jSONObject.put("cypher", 0);
        }
        return jSONObject;
    }

    public static java.lang.String IL(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return str;
        }
        java.lang.String strBg = bg();
        java.lang.String strBg2 = bg(strBg, 32);
        java.lang.String strIL = IL();
        java.lang.String strBg3 = (strBg2 == null || strIL == null) ? null : com.bytedance.sdk.component.eqN.bg.bg(str, strIL, strBg2);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_3D);
        sb.append(strBg).append(strIL).append(strBg3);
        return sb.toString();
    }

    public static java.lang.String bX(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str) || str.length() < 49) {
            return str;
        }
        java.lang.String strBg = bg(str.substring(1, 33), 32);
        java.lang.String strSubstring = str.substring(33, 49);
        return (strSubstring == null || strBg == null) ? str : com.bytedance.sdk.component.eqN.bg.IL(str.substring(49), strSubstring, strBg);
    }

    public static java.lang.String bg() {
        java.lang.String strBg = bg(16);
        if (strBg == null || strBg.length() != 32) {
            return null;
        }
        return strBg;
    }

    public static java.lang.String bg(java.lang.String str, int i) {
        if (str == null || str.length() != i) {
            return null;
        }
        int i2 = i / 2;
        return str.substring(i2, i) + str.substring(0, i2);
    }

    public static java.lang.String IL() {
        java.lang.String strBg = bg(8);
        if (strBg == null || strBg.length() != 16) {
            return null;
        }
        return strBg;
    }

    public static java.lang.String bg(int i) {
        try {
            byte[] bArr = new byte[i];
            com.bytedance.sdk.component.utils.bg.C0118bg.bg.nextBytes(bArr);
            return com.bytedance.sdk.component.utils.zx.bg(bArr);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public static java.util.Random bX() {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            try {
                return java.security.SecureRandom.getInstanceStrong();
            } catch (java.lang.Throwable unused) {
                return new java.security.SecureRandom();
            }
        }
        return new java.security.SecureRandom();
    }
}
