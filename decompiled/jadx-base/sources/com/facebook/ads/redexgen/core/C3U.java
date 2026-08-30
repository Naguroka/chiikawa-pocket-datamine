package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.3U, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
@java.lang.Deprecated
public abstract class C3U {
    public static java.lang.reflect.Method A00;
    public static byte[] A01;
    public static java.lang.String[] A02 = {"oH0n9xAbcML0pK3kOEyCMAjio6eGJJqD", "GHXQlAAFRKh09bddZmMmvyBDBjZAjYiv", "8JVYZEo4WjVv17g9aGlnSLFSGTnTlVlV", "9RFKXGXKeKZpKk57elbUgU5Rr7HYGf7i", "pphhsLP65zu6ZwDFb6wQsw2VBCTq4rPR", "7bQdqYtwnU89UvKxRDm92gBnYRs5HvHU", "CoVMihrSOvAeKI017KlJ1GeUcMhjoF5o", "1TwObRYenAx9Xxo2pcbqEN0Hah2BLlTA"};

    public static java.lang.String A03(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 58);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A04() {
        if (A02[2].charAt(17) == 'u') {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr = A02;
        strArr[3] = "6RSw2BIRooHqNQZo6O6uqDXkY67gyuyt";
        strArr[5] = "6n2viGPYj5SHhnpzGoLQcwunY5cXqvEW";
        A01 = new byte[]{73, 101, 127, 102, 110, 42, 100, 101, 126, 42, 108, 99, 100, 110, 42, 103, 111, 126, 98, 101, 110, 42, 109, 111, 126, 89, 105, 107, 102, 111, 110, 89, 105, 120, 101, 102, 102, 76, 107, 105, 126, 101, 120, 34, 35, 42, 101, 100, 42, 92, 99, 111, 125, 73, 101, 100, 108, 99, 109, 127, 120, 107, 126, 99, 101, 100, 73, 118, 122, 104, 92, 112, 113, 121, 118, 120, 92, 112, 114, 111, 126, 107, 59, 57, 40, 15, okio.Utf8.REPLACEMENT_BYTE, kotlin.io.encoding.Base64.padSymbol, 48, 57, 56, 15, okio.Utf8.REPLACEMENT_BYTE, 46, 51, 48, 48, 26, kotlin.io.encoding.Base64.padSymbol, okio.Utf8.REPLACEMENT_BYTE, 40, 51, 46};
    }

    static {
        A04();
        if (android.os.Build.VERSION.SDK_INT == 25) {
            try {
                A00 = android.view.ViewConfiguration.class.getDeclaredMethod(A03(82, 21, 102), new java.lang.Class[0]);
            } catch (java.lang.Exception unused) {
                android.util.Log.i(A03(66, 16, 37), A03(0, 66, 48));
            }
        }
    }

    public static float A00(android.view.ViewConfiguration viewConfiguration, android.content.Context context) {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            float scaledHorizontalScrollFactor = viewConfiguration.getScaledHorizontalScrollFactor();
            java.lang.String[] strArr = A02;
            if (strArr[3].charAt(27) == strArr[5].charAt(27)) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A02;
            strArr2[0] = "0Ki4JXOncLynPK6ypbmoO1JP8yrdQeak";
            strArr2[1] = "cqlD2dZIdmZjhBfVp9VUMkw1vxAb5RnC";
            return scaledHorizontalScrollFactor;
        }
        return A02(viewConfiguration, context);
    }

    public static float A01(android.view.ViewConfiguration viewConfiguration, android.content.Context context) {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            return viewConfiguration.getScaledVerticalScrollFactor();
        }
        float fA02 = A02(viewConfiguration, context);
        java.lang.String[] strArr = A02;
        if (strArr[4].charAt(20) == strArr[6].charAt(20)) {
            throw new java.lang.RuntimeException();
        }
        A02[2] = "MeYqCAiPW6zL6oB0sS71srseS72Ki7Wj";
        return fA02;
    }

    public static float A02(android.view.ViewConfiguration viewConfiguration, android.content.Context context) {
        if (android.os.Build.VERSION.SDK_INT >= 25 && A00 != null) {
            try {
                return ((java.lang.Integer) A00.invoke(viewConfiguration, new java.lang.Object[0])).intValue();
            } catch (java.lang.Exception unused) {
                java.lang.String strA03 = A03(66, 16, 37);
                java.lang.String[] strArr = A02;
                if (strArr[3].charAt(27) == strArr[5].charAt(27)) {
                    throw new java.lang.RuntimeException();
                }
                java.lang.String[] strArr2 = A02;
                strArr2[0] = "k1KS2t9KIGKI4w6R1E4j5X81r1grad3n";
                strArr2[1] = "1ij9jDuHWzbgayt92o13kt38ESGEmluu";
                android.util.Log.i(strA03, A03(0, 66, 48));
            }
        }
        android.util.TypedValue typedValue = new android.util.TypedValue();
        if (context.getTheme().resolveAttribute(android.R.attr.listPreferredItemHeight, typedValue, true)) {
            return typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return 0.0f;
    }
}
