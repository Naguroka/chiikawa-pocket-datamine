package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class G0 {
    public static byte[] A0M;
    public static java.lang.String[] A0N = {"QJUnHAm0ibR02ZfZO8weiFRQYuLD81n0", "6Jv", "Q0", "aBUJYB0uS7BrZTt8Q5KCQqzmSq39esRS", "beQY8V76mzBuRuCyaNDPBQ", "FLy0e9ZAdM2uukNE9IltB9hMNfieqFi6", "NzRHN1qY1CAXqTssLZL9m", "5VTHlH"};
    public static final int A0O;
    public static final int A0P;
    public static final int A0Q;
    public static final int[] A0R;
    public static final int[] A0S;
    public static final int[] A0T;
    public static final int[] A0U;
    public static final int[] A0V;
    public static final int[] A0W;
    public static final int[] A0X;
    public static final boolean[] A0Y;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public int A0E;
    public int A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public final java.util.List<android.text.SpannableString> A0L = new java.util.ArrayList();
    public final android.text.SpannableStringBuilder A0K = new android.text.SpannableStringBuilder();

    public static java.lang.String A03(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A0M, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 10);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A04() {
        A0M = new byte[]{118, 77, 70, 91, 83, 70, 64, 87, 70, 71, 3, 73, 86, 80, 87, 74, 69, 74, 64, 66, 87, 74, 76, 77, 3, 85, 66, 79, 86, 70, 25, 3};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 17 out of bounds for length 17
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public final com.facebook.ads.redexgen.core.XO A05() {
        android.text.Layout.Alignment alignment;
        float f;
        float f2;
        int i;
        if (A0H()) {
            return null;
        }
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        for (int i2 = 0; i2 < this.A0L.size(); i2++) {
            spannableStringBuilder.append((java.lang.CharSequence) this.A0L.get(i2));
            spannableStringBuilder.append('\n');
        }
        android.text.SpannableString spannableStringA02 = A02();
        java.lang.String[] strArr = A0N;
        if (strArr[7].length() == strArr[4].length()) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A0N;
        strArr2[2] = "TX";
        strArr2[1] = "Uoz";
        spannableStringBuilder.append((java.lang.CharSequence) spannableStringA02);
        switch (this.A07) {
            case 0:
            case 3:
                alignment = android.text.Layout.Alignment.ALIGN_NORMAL;
                break;
            case 1:
                alignment = android.text.Layout.Alignment.ALIGN_OPPOSITE;
                break;
            case 2:
                alignment = android.text.Layout.Alignment.ALIGN_CENTER;
                break;
            default:
                throw new java.lang.IllegalArgumentException(A03(0, 32, 41) + this.A07);
        }
        boolean z = this.A0H;
        java.lang.String[] strArr3 = A0N;
        if (strArr3[2].length() == strArr3[1].length()) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr4 = A0N;
        strArr4[2] = "oD";
        strArr4[1] = "nIi";
        if (z) {
            f = this.A05 / 99.0f;
            f2 = this.A0D / 99.0f;
        } else {
            f = this.A05 / 209.0f;
            f2 = this.A0D / 74.0f;
        }
        float f3 = (f * 0.9f) + 0.05f;
        float f4 = (0.9f * f2) + 0.05f;
        if (this.A00 % 3 == 0) {
            i = 0;
        } else if (this.A00 % 3 == 1) {
            i = 1;
        } else {
            i = 2;
            if (A0N[5].charAt(1) == 'K') {
                throw new java.lang.RuntimeException();
            }
            A0N[6] = "BI0fiPTqimUz0Y";
        }
        return new com.facebook.ads.redexgen.core.XO(spannableStringBuilder, alignment, f4, 0, i, f3, this.A00 / 3 == 0 ? 0 : this.A00 / 3 == 1 ? 1 : 2, Float.MIN_VALUE, this.A0E != A0O, this.A0E, this.A09);
    }

    static {
        A04();
        A0P = A01(2, 2, 2, 0);
        A0O = A01(0, 0, 0, 0);
        A0Q = A01(0, 0, 0, 3);
        A0V = new int[]{0, 0, 0, 0, 0, 2, 0};
        A0W = new int[]{0, 0, 0, 0, 0, 0, 2};
        A0X = new int[]{3, 3, 3, 3, 3, 3, 1};
        A0Y = new boolean[]{false, false, false, true, true, true, false};
        A0U = new int[]{A0O, A0Q, A0O, A0O, A0Q, A0O, A0O};
        A0T = new int[]{0, 1, 2, 3, 4, 3, 4};
        A0S = new int[]{0, 0, 0, 0, 0, 3, 3};
        A0R = new int[]{A0O, A0O, A0O, A0O, A0O, A0Q, A0Q};
    }

    public G0() {
        A08();
    }

    public static int A00(int i, int i2, int i3) {
        return A01(i, i2, i3, 0);
    }

    public static int A01(int i, int i2, int i3, int i4) {
        int i5;
        com.facebook.ads.redexgen.core.AbstractC0730Hf.A00(i, 0, 4);
        com.facebook.ads.redexgen.core.AbstractC0730Hf.A00(i2, 0, 4);
        com.facebook.ads.redexgen.core.AbstractC0730Hf.A00(i3, 0, 4);
        com.facebook.ads.redexgen.core.AbstractC0730Hf.A00(i4, 0, 4);
        switch (i4) {
            case 0:
            case 1:
                i5 = 255;
                break;
            case 2:
                i5 = 127;
                break;
            case 3:
                i5 = 0;
                break;
            default:
                i5 = 255;
                break;
        }
        int alpha = A0N[6].length();
        if (alpha != 5) {
            A0N[5] = "8BdDEGBeUdZb1tlGAu2Ypm8i98dJIYsP";
            int alpha2 = i > 1 ? 255 : 0;
            return android.graphics.Color.argb(i5, alpha2, i2 > 1 ? 255 : 0, i3 > 1 ? 255 : 0);
        }
        throw new java.lang.RuntimeException();
    }

    private final android.text.SpannableString A02() {
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(this.A0K);
        int length = spannableStringBuilder.length();
        if (length > 0) {
            if (this.A06 != -1) {
                spannableStringBuilder.setSpan(new android.text.style.StyleSpan(2), this.A06, length, 33);
            }
            if (this.A0C != -1) {
                spannableStringBuilder.setSpan(new android.text.style.UnderlineSpan(), this.A0C, length, 33);
            }
            if (this.A04 != -1) {
                spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(this.A03), this.A04, length, 33);
            }
            if (this.A02 != -1) {
                spannableStringBuilder.setSpan(new android.text.style.BackgroundColorSpan(this.A01), this.A02, length, 33);
            }
        }
        return new android.text.SpannableString(spannableStringBuilder);
    }

    public final void A06() {
        int length = this.A0K.length();
        if (length > 0) {
            int length2 = length - 1;
            this.A0K.delete(length2, length);
        }
    }

    public final void A07() {
        this.A0L.clear();
        this.A0K.clear();
        this.A06 = -1;
        this.A0C = -1;
        this.A04 = -1;
        this.A02 = -1;
        this.A0A = 0;
    }

    public final void A08() {
        A07();
        this.A0G = false;
        this.A0J = false;
        this.A09 = 4;
        this.A0H = false;
        this.A0D = 0;
        this.A05 = 0;
        this.A00 = 0;
        this.A0B = 15;
        this.A0I = true;
        this.A07 = 0;
        this.A0F = 0;
        this.A08 = 0;
        this.A0E = A0O;
        this.A03 = A0P;
        this.A01 = A0O;
    }

    public final void A09(char c) {
        if (c == '\n') {
            this.A0L.add(A02());
            this.A0K.clear();
            if (this.A06 != -1) {
                this.A06 = 0;
            }
            if (this.A0C != -1) {
                this.A0C = 0;
            }
            if (this.A04 != -1) {
                this.A04 = 0;
            }
            if (this.A02 != -1) {
                this.A02 = 0;
            }
            while (true) {
                if ((this.A0I && this.A0L.size() >= this.A0B) || this.A0L.size() >= 15) {
                    this.A0L.remove(0);
                } else {
                    return;
                }
            }
        } else {
            this.A0K.append(c);
        }
    }

    public final void A0A(int i, int i2) {
        if (this.A0A != i) {
            A09('\n');
        }
        this.A0A = i;
    }

    public final void A0B(int i, int i2, int i3) {
        if (this.A04 != -1 && this.A03 != i) {
            this.A0K.setSpan(new android.text.style.ForegroundColorSpan(this.A03), this.A04, this.A0K.length(), 33);
        }
        if (i != A0P) {
            this.A04 = this.A0K.length();
            this.A03 = i;
        }
        if (this.A02 != -1 && this.A01 != i2) {
            this.A0K.setSpan(new android.text.style.BackgroundColorSpan(this.A01), this.A02, this.A0K.length(), 33);
        }
        if (i2 != A0O) {
            this.A02 = this.A0K.length();
            this.A01 = i2;
        }
    }

    public final void A0C(int i, int i2, int i3, boolean z, boolean z2, int i4, int i5) {
        if (this.A06 != -1) {
            if (!z) {
                this.A0K.setSpan(new android.text.style.StyleSpan(2), this.A06, this.A0K.length(), 33);
                this.A06 = -1;
            }
        } else if (z) {
            android.text.SpannableStringBuilder spannableStringBuilder = this.A0K;
            java.lang.String[] strArr = A0N;
            if (strArr[7].length() == strArr[4].length()) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A0N;
            strArr2[7] = "UWOqhf";
            strArr2[4] = "cfvP9lljFRwm1yNXDs4ULm";
            this.A06 = spannableStringBuilder.length();
        }
        if (this.A0C != -1) {
            if (!z2) {
                this.A0K.setSpan(new android.text.style.UnderlineSpan(), this.A0C, this.A0K.length(), 33);
                this.A0C = -1;
                return;
            }
            return;
        }
        if (!z2) {
            return;
        }
        this.A0C = this.A0K.length();
    }

    public final void A0D(int i, int i2, boolean z, int i3, int i4, int i5, int i6) {
        this.A0E = i;
        this.A07 = i6;
    }

    public final void A0E(boolean z) {
        this.A0J = z;
    }

    public final void A0F(boolean z, boolean z2, boolean z3, int i, boolean z4, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.A0G = true;
        this.A0J = z;
        this.A0I = z2;
        this.A09 = i;
        this.A0H = z4;
        this.A0D = i2;
        this.A05 = i3;
        this.A00 = i6;
        if (this.A0B != i4 + 1) {
            this.A0B = i4 + 1;
            while (true) {
                if ((!z2 || this.A0L.size() < this.A0B) && this.A0L.size() < 15) {
                    break;
                } else {
                    this.A0L.remove(0);
                }
            }
        }
        if (i7 != 0 && this.A0F != i7) {
            this.A0F = i7;
            int i9 = i7 - 1;
            A0D(A0U[i9], A0Q, A0Y[i9], 0, A0W[i9], A0X[i9], A0V[i9]);
        }
        if (i8 != 0 && this.A08 != i8) {
            this.A08 = i8;
            int i10 = i8 - 1;
            A0C(0, 1, 1, false, false, A0S[i10], A0T[i10]);
            A0B(A0P, A0R[i10], A0O);
        }
    }

    public final boolean A0G() {
        return this.A0G;
    }

    public final boolean A0H() {
        return !A0G() || (this.A0L.isEmpty() && this.A0K.length() == 0);
    }

    public final boolean A0I() {
        return this.A0J;
    }
}
