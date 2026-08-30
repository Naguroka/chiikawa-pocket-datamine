package com.bytedance.adsdk.ugeno.iR;

/* JADX INFO: loaded from: classes3.dex */
public class bg {

    /* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.iR.bg$bg, reason: collision with other inner class name */
    public static class C0092bg {
        public int[] IL;
        public float[] bX;
        public android.graphics.drawable.GradientDrawable.Orientation bg;
    }

    public static int bg(java.lang.String str) {
        return bg(str, androidx.core.view.ViewCompat.MEASURED_STATE_MASK);
    }

    public static int bg(java.lang.String str, int i) {
        if (android.text.TextUtils.isEmpty(str)) {
            return i;
        }
        if (str.equals(com.ironsource.y8.h.T)) {
            return 0;
        }
        if (str.charAt(0) == '#' && str.length() == 4) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("#");
            char[] charArray = str.toCharArray();
            for (int i2 = 1; i2 < charArray.length; i2++) {
                sb.append(charArray[i2]).append(charArray[i2]);
            }
            return android.graphics.Color.parseColor(sb.toString());
        }
        if (str.charAt(0) == '#' && str.length() == 7) {
            return android.graphics.Color.parseColor(str);
        }
        if (str.charAt(0) == '#' && str.length() == 9) {
            return android.graphics.Color.parseColor(str);
        }
        if (!str.startsWith("rgba")) {
            return androidx.core.view.ViewCompat.MEASURED_STATE_MASK;
        }
        java.lang.String[] strArrSplit = str.substring(str.indexOf("(") + 1, str.indexOf(")")).split(",");
        if (strArrSplit == null || strArrSplit.length != 4) {
            return i;
        }
        return (((int) ((java.lang.Float.parseFloat(strArrSplit[3]) * 255.0f) + 0.5f)) << 24) | (((int) java.lang.Float.parseFloat(strArrSplit[0])) << 16) | (((int) java.lang.Float.parseFloat(strArrSplit[1])) << 8) | ((int) java.lang.Float.parseFloat(strArrSplit[2])) | 0;
    }

    public static com.bytedance.adsdk.ugeno.iR.bg.C0092bg IL(java.lang.String str) {
        int iIndexOf;
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        java.lang.String strSubstring = str.substring(str.indexOf("(") + 1, str.lastIndexOf(")"));
        if (android.text.TextUtils.isEmpty(strSubstring)) {
            return null;
        }
        int iBg = bg(strSubstring, '%');
        int iIndexOf2 = strSubstring.indexOf(",");
        java.lang.String strSubstring2 = strSubstring.substring(0, iIndexOf2);
        com.bytedance.adsdk.ugeno.iR.bg.C0092bg c0092bg = new com.bytedance.adsdk.ugeno.iR.bg.C0092bg();
        c0092bg.bg = eqN(strSubstring2);
        java.lang.String strSubstring3 = strSubstring.substring(iIndexOf2 + 1);
        int[] iArr = new int[iBg];
        float[] fArr = new float[iBg];
        for (int i = 0; i < iBg; i++) {
            int iIndexOf3 = strSubstring3.indexOf("%");
            java.lang.String strTrim = strSubstring3.substring(0, iIndexOf3 + 1).trim();
            if (strTrim.contains("rgba")) {
                iIndexOf = strTrim.indexOf(")");
            } else {
                iIndexOf = strTrim.indexOf(" ");
            }
            int i2 = iIndexOf + 1;
            iArr[i] = bg(strTrim.substring(0, i2).trim());
            fArr[i] = com.bytedance.adsdk.ugeno.iR.bX.bg(strTrim.substring(i2, strTrim.indexOf("%")).trim(), 0.0f) / 100.0f;
            int i3 = iIndexOf3 + 2;
            if (strSubstring3.length() <= i3) {
                break;
            }
            strSubstring3 = strSubstring3.substring(i3);
        }
        c0092bg.IL = iArr;
        c0092bg.bX = fArr;
        return c0092bg;
    }

    public static int bg(java.lang.String str, char c) {
        if (android.text.TextUtils.isEmpty(str)) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < str.length(); i2++) {
            if (str.charAt(i2) == c) {
                i++;
            }
        }
        return i;
    }

    public static boolean bX(java.lang.String str) {
        return !android.text.TextUtils.isEmpty(str) && str.startsWith("linear-gradient");
    }

    public static android.graphics.drawable.GradientDrawable.Orientation eqN(java.lang.String str) {
        int i;
        try {
            if (str.contains("deg")) {
                i = java.lang.Integer.parseInt(str.substring(0, str.length() - 3).trim());
            } else {
                i = java.lang.Integer.parseInt(str);
            }
            if (i == 90) {
                return android.graphics.drawable.GradientDrawable.Orientation.LEFT_RIGHT;
            }
            if (i == 180) {
                return android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM;
            }
            if (i == 270) {
                return android.graphics.drawable.GradientDrawable.Orientation.RIGHT_LEFT;
            }
            if (i == 135) {
                return android.graphics.drawable.GradientDrawable.Orientation.TL_BR;
            }
            if (i == 45) {
                return android.graphics.drawable.GradientDrawable.Orientation.BL_TR;
            }
            return android.graphics.drawable.GradientDrawable.Orientation.BOTTOM_TOP;
        } catch (java.lang.Exception unused) {
            return android.graphics.drawable.GradientDrawable.Orientation.LEFT_RIGHT;
        }
    }

    public static int bg(int i, int i2) {
        if (i2 < 0 || i2 > 255) {
            android.util.Log.e("ColorUtils", "alpha must be between 0 and 255. ");
            i2 = 255;
        }
        return (i & androidx.core.view.ViewCompat.MEASURED_SIZE_MASK) | (i2 << 24);
    }
}
