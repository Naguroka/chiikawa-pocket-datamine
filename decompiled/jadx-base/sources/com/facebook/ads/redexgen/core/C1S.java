package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.1S, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1S {
    public static int A06;
    public static byte[] A07;
    public static java.lang.String[] A08 = {"Vkhbk7q", "bbLm7avGUtHkF3jUZkJgwv05OQOBaWiK", "tolCyKl3IftnRlKEmRnT2sO5c0DyKStU", "eQuD8llomM2wZCZ6oqqCRxFaVaKQS5vz", "G8C7OMdE9YEe4", "q", "0", "mGkZm9P"};
    public int A00;
    public int A01;
    public long A03;
    public java.lang.String A04;
    public int A02 = 0;
    public java.util.LinkedList<java.lang.Integer> A05 = new java.util.LinkedList<>();

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 107);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A03() {
        A07 = new byte[]{-50, 31, -7, 26, -44, 0, -13, -1, 3, -13, -4, -15, 7, -82, -47, -17, -2, -2, -9, -4, -11, -82, -46, -17, 2, -17, -56, -82, -4, -3, -4, -13, -82, -41, -4, 2, -13, -11, -13, 0, -82, -3, -15, -15, 3, 0, 0, -13, -4, -15, -13, 44, 16, 14, 29, 1, 10, -1, 14, 21, 12, 16, 1, 0, -5, 5, 0, -16, -28, -5, -30, -26, -28, -13, -13, -24, -25, -30, -28, -11, -11, -28, -4, -30, -17, -24, -15, -22, -9, -21, 37, 25, 25, 43, 40, 40, 27, 36, 25, 27, 41, 44, 33, 46, 37, 43, 32, 57, 48, 54, 53, 32, 48, 36, 36, 54, 51, 51, 38, 47, 36, 38, 32, 52, 38, 36, 52, -19, -28, -22, -23, -44, -27, -38, -25, -34, -28, -39, 3, 101};
    }

    static {
        A03();
        A06 = 50;
    }

    public C1S(java.lang.String str) {
        this.A04 = str;
    }

    public static int A00() {
        int i = A06;
        if (A08[3].charAt(20) == '5') {
            throw new java.lang.RuntimeException();
        }
        A08[1] = "fgVvaJPNAH92mxaTJIosOWA9xsF7cqZV";
        return i;
    }

    private void A02() {
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis() / 1000;
        while (true) {
            java.util.LinkedList<java.lang.Integer> linkedList = this.A05;
            if (A08[6].length() != 1) {
                throw new java.lang.RuntimeException();
            }
            A08[2] = "YiLzIz5T1838NHRcssOQsoNOVVrgTctO";
            if (!linkedList.isEmpty() && this.A05.peekFirst() != null) {
                long currentTime = this.A05.peekFirst().intValue();
                if (jCurrentTimeMillis - currentTime >= this.A00) {
                    this.A05.removeFirst();
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    public final void A04(int i) {
        this.A02 = i;
    }

    public final void A05(int i, int i2, long j, int i3) {
        this.A00 = i;
        this.A01 = i2;
        this.A03 = j;
        A06 = i3;
    }

    public final void A06(org.json.JSONArray jSONArray) throws org.json.JSONException {
        for (int i = 0; i < idx; i++) {
            if (jSONArray.get(i) instanceof java.lang.Integer) {
                this.A05.addLast((java.lang.Integer) jSONArray.get(i));
            } else {
                throw new org.json.JSONException(A01(4, 47, 35));
            }
        }
    }

    public final void A07(boolean z) {
        if (z) {
            this.A05.addLast(java.lang.Integer.valueOf((int) (java.lang.System.currentTimeMillis() / 1000)));
        }
        A02();
    }

    public final boolean A08() {
        return ((long) this.A05.size()) >= this.A03;
    }

    public final boolean A09() {
        return (java.lang.System.currentTimeMillis() / 1000) - ((long) this.A02) <= ((long) this.A01);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(A01(138, 1, 29));
        sb.append(A01(55, 12, 49));
        java.lang.String strA01 = A01(1, 1, 122);
        sb.append(strA01);
        sb.append(this.A04);
        java.lang.String strA02 = A01(0, 1, 55);
        sb.append(strA02);
        sb.append(A01(101, 6, 81));
        sb.append(strA01);
        sb.append(this.A00);
        sb.append(strA02);
        sb.append(A01(127, 11, 10));
        sb.append(strA01);
        sb.append(this.A01);
        sb.append(strA02);
        sb.append(A01(52, 3, 66));
        sb.append(strA01);
        sb.append(this.A03);
        sb.append(strA02);
        sb.append(A01(107, 20, 86));
        sb.append(strA01);
        sb.append(this.A02);
        sb.append(strA02);
        sb.append(A01(67, 23, 24));
        sb.append(strA01);
        sb.append(A06);
        sb.append(strA02);
        sb.append(A01(90, 11, 75));
        sb.append(A01(2, 2, 84));
        java.util.Iterator<java.lang.Integer> itr = this.A05.iterator();
        while (itr.hasNext()) {
            sb.append(itr.next());
            if (itr.hasNext()) {
                sb.append(strA02);
            }
        }
        sb.append(A01(51, 1, 100));
        if (A08[1].charAt(17) == 'M') {
            throw new java.lang.RuntimeException();
        }
        A08[6] = com.google.android.gms.ads.RequestConfiguration.MAX_AD_CONTENT_RATING_G;
        sb.append(A01(139, 1, 125));
        return sb.toString();
    }
}
