package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class XE implements com.facebook.ads.redexgen.core.InterfaceC0694Ft {
    public static byte[] A04;
    public static java.lang.String[] A05 = {"cgQiINiiVsu26aPZ9Pgp8V4pQLBJh1", "STqVvaQvfsIBxOWUdRx7t9fX4dhB6WaE", "l10Uc2sObXQrfE5LSRWaITwRG6VP7m3G", "Li97firq2k3yJwXt43iS9teS3vokxfgN", "lEAcrUgQN40rK9SSjAwJ22cZB26GWfbz", "JzhYJjhyCfpGQZW0XGEf9gVBtclqQrE4", "eZRWN9ebZjj6lHeH8Be", "xK8S8Vs0X7"};
    public final int A00;
    public final java.util.List<com.facebook.ads.redexgen.core.XF> A01;
    public final long[] A02;
    public final long[] A03;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 56);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{65};
    }

    static {
        A01();
    }

    public XE(java.util.List<com.facebook.ads.redexgen.core.XF> list) {
        this.A01 = list;
        this.A00 = list.size();
        this.A02 = new long[this.A00 * 2];
        for (int i = 0; i < cueIndex; i++) {
            com.facebook.ads.redexgen.core.XF xf = list.get(i);
            int i2 = i * 2;
            this.A02[i2] = xf.A01;
            int arrayIndex = i2 + 1;
            this.A02[arrayIndex] = xf.A00;
        }
        this.A03 = java.util.Arrays.copyOf(this.A02, this.A02.length);
        java.util.Arrays.sort(this.A03);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0694Ft
    public final java.util.List<com.facebook.ads.redexgen.core.C0693Fs> A6x(long j) {
        java.util.ArrayList arrayList = null;
        com.facebook.ads.redexgen.core.XF xf = null;
        android.text.SpannableStringBuilder spannableStringBuilder = null;
        int i = 0;
        while (true) {
            int i2 = this.A00;
            if (A05[7].length() == 14) {
                throw new java.lang.RuntimeException();
            }
            A05[4] = "jlPWqnSdxT0Usk6otqcOvu4ShZWMKlZ7";
            if (i < i2) {
                if (this.A02[i * 2] <= j && j < this.A02[(i * 2) + 1]) {
                    if (arrayList == null) {
                        arrayList = new java.util.ArrayList();
                    }
                    com.facebook.ads.redexgen.core.XF xf2 = this.A01.get(i);
                    if (xf2.A00()) {
                        if (xf == null) {
                            xf = xf2;
                        } else {
                            java.lang.String strA00 = A00(0, 1, 115);
                            if (spannableStringBuilder == null) {
                                spannableStringBuilder = new android.text.SpannableStringBuilder();
                                spannableStringBuilder.append(xf.A0C).append((java.lang.CharSequence) strA00).append(xf2.A0C);
                            } else {
                                spannableStringBuilder.append((java.lang.CharSequence) strA00).append(xf2.A0C);
                            }
                        }
                    } else {
                        arrayList.add(xf2);
                    }
                }
                i++;
            } else {
                if (spannableStringBuilder != null) {
                    arrayList.add(new com.facebook.ads.redexgen.core.XF(spannableStringBuilder));
                } else if (xf != null) {
                    arrayList.add(xf);
                }
                if (arrayList != null) {
                    return arrayList;
                }
                return java.util.Collections.emptyList();
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0694Ft
    public final long A7O(int i) {
        boolean z = true;
        com.facebook.ads.redexgen.core.AbstractC0730Hf.A03(i >= 0);
        if (i >= this.A03.length) {
            z = false;
        }
        com.facebook.ads.redexgen.core.AbstractC0730Hf.A03(z);
        return this.A03[i];
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0694Ft
    public final int A7P() {
        return this.A03.length;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0694Ft
    public final int A7r(long j) {
        int iA0A = com.facebook.ads.redexgen.core.IK.A0A(this.A03, j, false, false);
        int index = this.A03.length;
        if (iA0A < index) {
            return iA0A;
        }
        return -1;
    }
}
