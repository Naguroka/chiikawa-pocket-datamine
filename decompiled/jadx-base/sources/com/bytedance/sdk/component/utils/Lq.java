package com.bytedance.sdk.component.utils;

/* JADX INFO: loaded from: classes3.dex */
public class Lq {
    public static boolean bg(android.content.Context context) {
        return bX(context) != 0;
    }

    public static int IL(android.content.Context context) {
        int iBX = bX(context);
        if (iBX == 1) {
            return 0;
        }
        if (iBX == 4) {
            return 1;
        }
        if (iBX == 5) {
            return 4;
        }
        if (iBX != 6) {
            return iBX;
        }
        return 6;
    }

    public static int bX(android.content.Context context) {
        return com.bytedance.sdk.component.utils.rri.bg(context, 60000L);
    }

    public static boolean eqN(android.content.Context context) {
        return bX(context) == 4;
    }

    public static boolean zx(android.content.Context context) {
        return bX(context) == 5;
    }

    public static boolean ldr(android.content.Context context) {
        return bX(context) == 6;
    }

    public static java.lang.String iR(android.content.Context context) {
        int iBX = bX(context);
        if (iBX == 2) {
            return "2g";
        }
        if (iBX == 3) {
            return com.json.u8.f3464a;
        }
        if (iBX == 4) {
            return com.json.u8.b;
        }
        if (iBX != 5) {
            return iBX != 6 ? "mobile" : "5g";
        }
        return "4g";
    }

    public static boolean bg(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith("http://") || str.startsWith("https://");
    }

    public static boolean Kg(android.content.Context context) {
        if (context == null) {
            return false;
        }
        int iBX = bX(context);
        char c = 2;
        if (iBX != 2) {
            c = 3;
            if (iBX != 3) {
                c = 4;
                if (iBX == 4) {
                    c = 1;
                } else if (iBX != 5) {
                    c = iBX != 6 ? (char) 0 : (char) 5;
                }
            }
        }
        return c != 0;
    }
}
