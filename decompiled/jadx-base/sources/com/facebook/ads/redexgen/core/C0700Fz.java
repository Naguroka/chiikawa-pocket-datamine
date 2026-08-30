package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Fz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0700Fz {
    public static java.lang.String[] A08 = {"NNB71xZWHcIAwa9uUtpvwNL455Xxeezs", "7QOt3X2j", "TEDKkRRul1WFzr82L9WTKNimJ5QIfSph", "GWtDxnTfe2ZoKDGEH1yJGGpEeFzji6Jf", "njyHzmlo1StOJj3vanJMJLtGSQUoz0PU", "cTvWCqBujMq", "198fKajelm", "8OSCnn3izS8kyTjbgbfvgF"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public final java.util.List<com.facebook.ads.redexgen.core.C0699Fy> A06 = new java.util.ArrayList();
    public final java.util.List<android.text.SpannableString> A07 = new java.util.ArrayList();
    public final java.lang.StringBuilder A05 = new java.lang.StringBuilder();

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 19 out of bounds for length 18
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public final com.facebook.ads.redexgen.core.C0693Fs A05() {
        float f;
        int i;
        int i2;
        int i3;
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        for (int i4 = 0; i4 < this.A07.size(); i4++) {
            spannableStringBuilder.append((java.lang.CharSequence) this.A07.get(i4));
            if (A08[6].length() == 28) {
                throw new java.lang.RuntimeException();
            }
            A08[3] = "0i5SpG4mJJwZoEfMhPDQtpKHtdTcA678";
            spannableStringBuilder.append('\n');
        }
        spannableStringBuilder.append((java.lang.CharSequence) A00());
        if (spannableStringBuilder.length() == 0) {
            if (A08[6].length() != 28) {
                A08[1] = "KIRLj8L4";
                return null;
            }
            throw new java.lang.RuntimeException();
        }
        int i5 = this.A02 + this.A04;
        int length = (32 - i5) - spannableStringBuilder.length();
        int i6 = i5 - length;
        if (this.A00 == 2 && (java.lang.Math.abs(i6) < 3 || length < 0)) {
            f = 0.5f;
            i = 1;
        } else if (this.A00 != 2 || i6 <= 0) {
            f = (0.8f * (i5 / 32.0f)) + 0.1f;
            i = 0;
        } else {
            int i7 = 32 - length;
            if (A08[6].length() == 28) {
                throw new java.lang.RuntimeException();
            }
            A08[7] = "W8LcHLOSVpSJo4o2Kc3V";
            f = (0.8f * (i7 / 32.0f)) + 0.1f;
            i = 2;
        }
        if (this.A00 == 1 || this.A03 > 7) {
            i2 = 2;
            if (A08[4].charAt(14) != 'q') {
                A08[6] = "a3l";
                i3 = (this.A03 - 15) - 2;
            } else {
                A08[1] = "rc69nRKD";
                i3 = (this.A03 - 6) - 1;
            }
        } else {
            i2 = 0;
            i3 = this.A03;
        }
        return new com.facebook.ads.redexgen.core.C0693Fs(spannableStringBuilder, android.text.Layout.Alignment.ALIGN_NORMAL, i3, 1, i2, f, i, Float.MIN_VALUE);
    }

    public C0700Fz(int i, int i2) {
        A09(i);
        A0A(i2);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00a6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x00a8  */
    private final android.text.SpannableString A00() {
        int i;
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(this.A05);
        int length = spannableStringBuilder.length();
        int nextPosition = -1;
        int i2 = -1;
        int i3 = 0;
        int nextColor = -1;
        boolean z = false;
        int i4 = -1;
        for (int color = 0; color < this.A06.size(); color++) {
            com.facebook.ads.redexgen.core.C0699Fy c0699Fy = this.A06.get(color);
            boolean z2 = c0699Fy.A02;
            int i5 = c0699Fy.A01;
            if (i5 != 8) {
                z = i5 == 7;
                if (i5 != 7) {
                    i4 = com.facebook.ads.redexgen.core.C5A.A0J()[i5];
                }
            }
            int italicStartPosition = c0699Fy.A00;
            if (color + 1 < this.A06.size()) {
                i = this.A06.get(color + 1).A00;
            } else {
                i = length;
            }
            if (italicStartPosition != i) {
                if (A08[1].length() != 8) {
                    throw new java.lang.RuntimeException();
                }
                A08[5] = "9lS1kLk5";
                if (nextPosition != -1 && !z2) {
                    A02(spannableStringBuilder, nextPosition, italicStartPosition);
                    nextPosition = -1;
                } else if (A08[6].length() != 28) {
                    java.lang.String[] strArr = A08;
                    strArr[0] = "nC0EGBHyGvmdBobVRqQD9SZ4g56V8B8j";
                    strArr[2] = "GZRnbLGejQQShSAr4hqHwh7J75aAFy3E";
                    if (nextPosition == -1) {
                        if (z2) {
                            nextPosition = italicStartPosition;
                        }
                    }
                } else {
                    A08[7] = "XDY74LPdJmawI5RQjl07s4D069q";
                    if (nextPosition == -1) {
                        if (z2) {
                            nextPosition = italicStartPosition;
                        }
                    }
                }
                if (i2 != -1 && !z) {
                    A01(spannableStringBuilder, i2, italicStartPosition);
                    i2 = -1;
                } else if (i2 == -1 && z) {
                    i2 = italicStartPosition;
                }
                if (i4 != nextColor) {
                    A03(spannableStringBuilder, i3, italicStartPosition, nextColor);
                    nextColor = i4;
                    i3 = italicStartPosition;
                }
            }
        }
        if (nextPosition != -1 && nextPosition != length) {
            A02(spannableStringBuilder, nextPosition, length);
        }
        if (i2 != -1 && i2 != length) {
            A01(spannableStringBuilder, i2, length);
        }
        if (i3 != length) {
            A03(spannableStringBuilder, i3, length, nextColor);
        }
        return new android.text.SpannableString(spannableStringBuilder);
    }

    public static void A01(android.text.SpannableStringBuilder spannableStringBuilder, int i, int i2) {
        spannableStringBuilder.setSpan(new android.text.style.StyleSpan(2), i, i2, 33);
    }

    public static void A02(android.text.SpannableStringBuilder spannableStringBuilder, int i, int i2) {
        spannableStringBuilder.setSpan(new android.text.style.UnderlineSpan(), i, i2, 33);
    }

    public static void A03(android.text.SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3) {
        if (i3 == -1) {
            return;
        }
        spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(i3), i, i2, 33);
    }

    public final int A04() {
        return this.A03;
    }

    public final void A06() {
        int length = this.A05.length();
        if (length > 0) {
            int length2 = length - 1;
            this.A05.delete(length2, length);
            int length3 = this.A06.size();
            for (int i = length3 - 1; i >= 0; i--) {
                com.facebook.ads.redexgen.core.C0699Fy c0699Fy = this.A06.get(i);
                int length4 = c0699Fy.A00;
                if (length4 == length) {
                    int length5 = c0699Fy.A00;
                    c0699Fy.A00 = length5 - 1;
                } else {
                    return;
                }
            }
        }
    }

    public final void A07() {
        this.A07.add(A00());
        this.A05.setLength(0);
        this.A06.clear();
        int iMin = java.lang.Math.min(this.A01, this.A03);
        while (numRows >= iMin) {
            this.A07.remove(0);
        }
    }

    public final void A08(char c) {
        this.A05.append(c);
    }

    public final void A09(int i) {
        this.A00 = i;
        this.A06.clear();
        this.A07.clear();
        this.A05.setLength(0);
        this.A03 = 15;
        this.A02 = 0;
        this.A04 = 0;
    }

    public final void A0A(int i) {
        this.A01 = i;
    }

    public final void A0B(int i) {
        this.A02 = i;
    }

    public final void A0C(int i) {
        this.A03 = i;
    }

    public final void A0D(int i) {
        this.A04 = i;
    }

    public final void A0E(int i, boolean z) {
        this.A06.add(new com.facebook.ads.redexgen.core.C0699Fy(i, z, this.A05.length()));
    }

    public final boolean A0F() {
        return this.A06.isEmpty() && this.A07.isEmpty() && this.A05.length() == 0;
    }

    public final java.lang.String toString() {
        return this.A05.toString();
    }
}
