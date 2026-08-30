package com.bytedance.sdk.component.utils;

/* JADX INFO: loaded from: classes3.dex */
public class PX {
    private static int IL = 4;
    private static com.bytedance.sdk.component.bg bX = null;
    private static boolean bg = false;
    private static java.lang.String eqN = "";

    public static void bg(java.lang.String str) {
        eqN = str;
    }

    public static void bg(int i) {
        IL = i;
    }

    public static boolean bg() {
        return IL <= 3;
    }

    public static void IL() {
        bg = true;
        bg(3);
    }

    public static void bX() {
        bg = false;
        bg(7);
    }

    public static boolean eqN() {
        return bg;
    }

    public static void IL(java.lang.String str) {
        if (bg) {
            bg("Logger", str);
        }
    }

    public static void bg(java.lang.String str, java.lang.String str2) {
        if (bX != null) {
            bX(str);
        }
        if (bg && str2 != null && IL <= 6) {
            android.util.Log.e(bX(str), str2);
        }
    }

    public static void bg(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Throwable th) {
        if (bg) {
            bg(IL(str, str2), str3, th);
        }
    }

    public static void bg(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        if (bX != null) {
            bX(str);
        }
        if (bg) {
            if (!(str2 == null && th == null) && IL <= 6) {
                android.util.Log.e(bX(str), str2, th);
            }
        }
    }

    public static void bg(java.lang.String str, java.lang.Object... objArr) {
        if (bX != null) {
            bX(str);
            bg(objArr);
        }
        if (bg && objArr != null && IL <= 6) {
            android.util.Log.e(bX(str), bg(objArr));
        }
    }

    private static java.lang.String bg(java.lang.Object... objArr) {
        if (objArr == null || objArr.length == 0) {
            return "";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (java.lang.Object obj : objArr) {
            if (obj != null) {
                sb.append(obj.toString());
            } else {
                sb.append(" null ");
            }
            sb.append(" ");
        }
        return sb.toString();
    }

    public static java.lang.String bX(java.lang.String str) {
        return android.text.TextUtils.isEmpty(eqN) ? str : bg(com.ironsource.y8.i.d + eqN + "]-[" + str + com.ironsource.y8.i.e);
    }

    public static java.lang.String IL(java.lang.String str, java.lang.String str2) {
        return android.text.TextUtils.isEmpty(eqN) ? str : bg(str2 + "]-[" + str);
    }
}
