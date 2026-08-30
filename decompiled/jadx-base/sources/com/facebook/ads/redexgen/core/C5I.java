package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.5I, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C5I {
    public static byte[] A00;

    static {
        A03();
    }

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 7);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{17, 32, 47, 51, 65, 5, 4, 21, 4, 2, 21, 4, 5, 91, 117, 121, 123, 56, 112, 119, 117, 115, 116, 121, 121, 125, 56, 119, 114, 101};
    }

    private java.lang.String A00() {
        java.lang.Thread mainThread = android.os.Looper.getMainLooper().getThread();
        for (java.lang.StackTraceElement element : mainThread.getStackTrace()) {
            if (element.getClassName().startsWith(A01(14, 16, 17))) {
                return element.toString();
            }
        }
        return null;
    }

    private java.util.Map<java.lang.Thread, java.lang.StackTraceElement[]> A02() {
        final java.lang.Thread thread = android.os.Looper.getMainLooper().getThread();
        java.util.Map<java.lang.Thread, java.lang.StackTraceElement[]> stackTraces = new java.util.TreeMap<>(new java.util.Comparator<java.lang.Thread>() { // from class: com.facebook.ads.redexgen.X.5H
            public static java.lang.String[] A02 = {"I2VmByDixuV", "bEgjeHiCKL8bN0Y2xmhvt", "Ep8bZoaW9qgdmenOEM", "U1x4f2Mle4YpVecP", "6pFKFCdnQFQQrPpkBrBSvGNPTjtJIqqH", "uR6rFONyTXbT3WTsrhnl74", "HWYTd9Yr1UQKCKQrjsxmT8cIIu2", "gbeo1KbNmS02dvrZyrXpgnCOAkkwIw0y"};

            /* JADX INFO: Access modifiers changed from: private */
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final int compare(java.lang.Thread thread2, java.lang.Thread thread3) {
                if (thread2 != thread3) {
                    if (thread2 == thread) {
                        return -1;
                    }
                    if (thread3 == thread) {
                        return 1;
                    }
                    return thread3.getName().compareTo(thread2.getName());
                }
                java.lang.String[] strArr = A02;
                if (strArr[2].length() == strArr[0].length()) {
                    throw new java.lang.RuntimeException();
                }
                A02[6] = "KlossopSTK0WgZ36dTrk3tViYspVBMBU";
                return 0;
            }
        });
        stackTraces.putAll(java.lang.Thread.getAllStackTraces());
        return stackTraces;
    }

    public final java.lang.String A04() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(A01(1, 13, 102));
        sb.append(A00());
        java.lang.String strA01 = A01(0, 1, 28);
        sb.append(strA01);
        for (java.util.Map.Entry<java.lang.Thread, java.lang.StackTraceElement[]> entry : A02().entrySet()) {
            sb.append(entry.getKey().getName());
            sb.append(strA01);
            for (java.lang.StackTraceElement stackTraceElement : entry.getValue()) {
                sb.append('\t');
                sb.append(stackTraceElement.toString());
                sb.append(strA01);
            }
        }
        return sb.toString();
    }

    public final boolean A05() {
        return A00() != null;
    }
}
