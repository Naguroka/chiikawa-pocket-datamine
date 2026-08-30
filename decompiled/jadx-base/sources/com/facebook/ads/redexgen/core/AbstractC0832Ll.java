package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ll, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC0832Ll {
    public static byte[] A00;
    public static java.lang.String[] A01 = {"LplfTEYRnODnDpz21EneRZRsMargZTNK", "2NrlLG7hqMfWnzI4aYc74QPIxJ4DJ1XR", "L7pmDhfbtl8pdMobHzydLQ1D6YOazgIb", "V9Kuj32Ww6lLhCXMI4XEd9rHt60G9lJq", "k0plFnx6zt0D5xnpu3Hlko5", "WGZsYEfxfTD4T7Cqe3yCHw86dz09xOKF", "rh2k8IOHNldhKVbVonTuZ6bN28ke0n", "kkjOWDxiYS6HSpJcTpvH6ub4oru0qlUQ"};
    public static final java.util.regex.Pattern A02;

    public static java.lang.String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 44);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A07() {
        A00 = new byte[]{13, 121, 86, 14, 68, 81, 121, 86, 14, 126, 68, 8, 95, 11, 120, 14, 12, 126, 100, 8, 127, 120, 11, 15, 125, 75, 76, 76, 91, 80, 74, 30, 77, 74, 95, 93, 85, 30, 74, 76, 95, 93, 91, 77, 65, 67, 0, 72, 79, 77, 75, 76, 65, 65, 69, 0, 79, 74, 93};
    }

    static {
        A07();
        A02 = java.util.regex.Pattern.compile(A02(0, 24, 9));
    }

    public static java.lang.String A00() {
        return A06(new java.lang.Exception(A02(24, 19, 18)), -1, -1, false);
    }

    public static java.lang.String A01(int i) {
        if (i <= 0) {
            return null;
        }
        float rate = new java.util.Random().nextFloat();
        if (rate >= 1.0f / i) {
            return null;
        }
        return A00();
    }

    public static java.lang.String A03(android.content.Context context, java.lang.Throwable th) {
        int iA0K = com.facebook.ads.redexgen.core.C0762Im.A0K(context);
        int maxStacktraceLines = com.facebook.ads.redexgen.core.C0762Im.A03(context);
        return A06(th, iA0K, maxStacktraceLines, com.facebook.ads.redexgen.core.C0762Im.A1X(context));
    }

    public static java.lang.String A04(java.lang.String str) {
        java.util.regex.Matcher matcher = A02.matcher(str);
        if (matcher.matches()) {
            return matcher.group(1);
        }
        return str;
    }

    public static java.lang.String A06(java.lang.Throwable th, int i, int i2, boolean z) {
        java.lang.String strA02 = A02(0, 0, 105);
        if (th == null) {
            return strA02;
        }
        try {
            com.facebook.ads.redexgen.core.C1093Vm c1093Vm = new com.facebook.ads.redexgen.core.C1093Vm();
            com.facebook.ads.redexgen.core.InterfaceC0830Lj c1092Vl = c1093Vm;
            java.lang.String[] strArr = A01;
            if (strArr[4].length() == strArr[6].length()) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A01;
            strArr2[4] = "oxxlcYcFfaMihpA7yH6yiqF";
            strArr2[6] = "gkLsRpbpRAovdKGTxU7IYJzRyz6pLt";
            if (i2 >= 0) {
                c1092Vl = new com.facebook.ads.redexgen.core.C1091Vk(c1092Vl, i2);
            }
            if (i >= 0) {
                c1092Vl = new com.facebook.ads.redexgen.core.C1090Vj(c1092Vl, i, i);
            }
            if (z) {
                c1092Vl = new com.facebook.ads.redexgen.core.C1092Vl(c1092Vl);
            }
            com.facebook.ads.redexgen.core.C1094Vn c1094Vn = new com.facebook.ads.redexgen.core.C1094Vn(c1093Vm, 1, c1092Vl);
            th.printStackTrace(new java.io.PrintWriter(new com.facebook.ads.redexgen.core.C0831Lk(c1094Vn)));
            c1094Vn.flush();
            return c1093Vm.toString();
        } catch (java.lang.Exception unused) {
            return strA02;
        }
    }

    public static boolean A08(com.facebook.ads.redexgen.core.C0829Li c0829Li) {
        java.lang.String middle = c0829Li.A02();
        if (middle == null) {
            return false;
        }
        boolean zA0A = A0A(middle);
        if (A01[7].charAt(20) == 'o') {
            throw new java.lang.RuntimeException();
        }
        A01[2] = "GqDFUg33w18rdOydcZHrPduzmWx6ZxUu";
        if (zA0A) {
            return true;
        }
        for (java.lang.String str : c0829Li.A01()) {
            if (A01[2].charAt(10) != '8') {
                if (A0A(str)) {
                    return true;
                }
            } else {
                java.lang.String[] strArr = A01;
                strArr[5] = "ZCUrIEQiGOY9U2nVCEFSNgqRdbKvDffQ";
                strArr[0] = "2Hs1eEyuwWDgIwWONAgBlK6IqUqjA257";
                if (A0A(str)) {
                    return true;
                }
            }
        }
        java.util.Iterator<java.lang.String> it = c0829Li.A00().iterator();
        while (it.hasNext()) {
            if (A0A(it.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean A0A(java.lang.String str) {
        return str.contains(A02(43, 16, 2));
    }
}
