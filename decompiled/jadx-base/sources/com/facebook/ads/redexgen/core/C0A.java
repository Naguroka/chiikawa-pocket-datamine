package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.0A, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0A {
    public static byte[] A00;
    public static java.lang.String[] A01 = {"tEEVNd46OYTAYJSvyZnVijwEJ9mxfgyG", "BJ13dc7vhZee7KVmjVySYl", "uE9iMCRF0OSjC6XoeKPzOCY04vXFo0vs", "DUz1uNpjuvZzd5dAiuCT4alZ5wEF4BPh", "e8UGMtu5263EOY4JBlmpZ4vkWui3yNma", "jevJBWsVVFh2OOXdK4BBnA9fQcBAm7nu", "BtKAl", "xnRt56CD5b22yVN7z7QNi6lTzhm5niaa"};

    static {
        A02();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            byte b = bArrCopyOfRange[i4];
            if (A01[6].length() == 24) {
                throw new java.lang.RuntimeException();
            }
            A01[5] = "03i3f9u06CqTOPMXzFUkxIwTnPnoVd6c";
            bArrCopyOfRange[i4] = (byte) ((b ^ i3) ^ 100);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{5};
    }

    private java.lang.String A01(java.lang.String str) {
        int iLastIndexOf = str.lastIndexOf(46);
        int slashIndex = str.lastIndexOf(47);
        if (iLastIndexOf != -1 && iLastIndexOf > slashIndex) {
            int dotIndex = iLastIndexOf + 2;
            int slashIndex2 = dotIndex + 4;
            int dotIndex2 = str.length();
            if (slashIndex2 > dotIndex2) {
                int slashIndex3 = iLastIndexOf + 1;
                int dotIndex3 = str.length();
                return str.substring(slashIndex3, dotIndex3);
            }
        }
        return A00(0, 0, 87);
    }

    public final java.lang.String A03(java.lang.String str) {
        java.lang.String strA01 = A01(str);
        java.lang.String name = com.facebook.ads.redexgen.core.C0I.A02(str);
        if (android.text.TextUtils.isEmpty(strA01)) {
            return name;
        }
        java.lang.StringBuilder sbAppend = new java.lang.StringBuilder().append(name);
        java.lang.String extension = A00(0, 1, 79);
        return sbAppend.append(extension).append(strA01).toString();
    }
}
