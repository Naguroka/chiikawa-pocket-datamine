package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Yc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1157Yc implements com.facebook.ads.redexgen.core.InterfaceC0609Bx {
    public static byte[] A0p;
    public static java.lang.String[] A0q = {"rxtglFl1g0Um93LlgG73fPdHkECfhKTJ", "156rIhkjT5ca6mPiErNt0KfDlMTC", "do9WW65ZTIOUPfb1TmF4h6vlquEuLjy3", "QV7gmxZ9dxFMEmtOO1dnCHFrQrj32J64", "QDdPnTaHPqSIAhGd7OJ", "0MPgRfIRGG9Z3GM5iK3KXo10VaKBAgiN", "eMES0qt6ZhGX5hbnTa3YivJZAsKhiDVN", "cMd8ydiemrnpAsn7XU3xyG8InpRYLS"};
    public static final com.facebook.ads.redexgen.core.C0 A0r;
    public static final java.util.UUID A0s;
    public static final byte[] A0t;
    public static final byte[] A0u;
    public static final byte[] A0v;
    public static final byte[] A0w;
    public static final byte[] A0x;
    public byte A00;
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
    public long A0C;
    public long A0D;
    public long A0E;
    public long A0F;
    public long A0G;
    public long A0H;
    public long A0I;
    public long A0J;
    public long A0K;
    public long A0L;
    public long A0M;
    public com.facebook.ads.redexgen.core.InterfaceC0611Bz A0N;
    public com.facebook.ads.redexgen.core.CJ A0O;
    public com.facebook.ads.redexgen.core.C0745Hu A0P;
    public com.facebook.ads.redexgen.core.C0745Hu A0Q;
    public java.nio.ByteBuffer A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public int[] A0b;
    public final android.util.SparseArray<com.facebook.ads.redexgen.core.CJ> A0c;
    public final com.facebook.ads.redexgen.core.CF A0d;
    public final com.facebook.ads.redexgen.core.CM A0e;
    public final com.facebook.ads.redexgen.core.I4 A0f;
    public final com.facebook.ads.redexgen.core.I4 A0g;
    public final com.facebook.ads.redexgen.core.I4 A0h;
    public final com.facebook.ads.redexgen.core.I4 A0i;
    public final com.facebook.ads.redexgen.core.I4 A0j;
    public final com.facebook.ads.redexgen.core.I4 A0k;
    public final com.facebook.ads.redexgen.core.I4 A0l;
    public final com.facebook.ads.redexgen.core.I4 A0m;
    public final com.facebook.ads.redexgen.core.I4 A0n;
    public final boolean A0o;

    public static java.lang.String A03(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A0p, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 97);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A06() {
        java.lang.String[] strArr = A0q;
        if (strArr[5].charAt(3) != strArr[0].charAt(3)) {
            throw new java.lang.RuntimeException();
        }
        A0q[7] = "VtyRGyix4nImbLWXcmGsSmYiZpiT2B";
        A0p = new byte[]{-91, -13, -12, -7, -91, -8, -6, -11, -11, -12, -9, -7, -22, -23, -121, -110, -109, -58, -100, -121, -110, -108, -58, -100, -121, -110, -108, -58, -100, -121, -110, -108, -58, -94, -83, -81, -31, -73, -94, -83, -81, -31, -73, -94, -83, -81, -31, -87, -94, -83, -80, -31, -17, -13, 1, 1, 19, 34, 34, 23, 28, 21, 33, -15, 23, 30, 22, 19, 32, -5, 29, 18, 19, -50, -6, 24, -6, -6, -4, -42, -12, -42, -40, -56, -61, -31, -58, -42, -43, -60, -30, -57, -41, -42, -78, -56, -37, -45, -43, -56, -42, -42, -78, -48, -75, -59, -60, -96, -67, -64, -60, -60, -67, -74, -60, -60, -1, 29, 3, -1, 1, -15, -45, -15, -40, -34, -45, -43, -53, -23, -41, -38, -49, -47, -71, -42, -68, -11, 19, 1, 4, -7, -5, -29, 0, -25, 32, 62, 44, 50, 14, 32, 34, 44, -66, -36, -52, -51, -46, -48, -22, 8, -7, -20, -10, -40, -14, -9, -3, -40, -11, -14, -3, 22, 52, 41, 39, 42, 26, 29, 25, -64, -34, -43, -50, -47, -63, -56, -46, -74, -44, -31, -102, -25, -109, -26, -42, -44, -33, -40, -109, -25, -36, -32, -40, -42, -30, -41, -40, -109, -29, -27, -36, -30, -27, -109, -25, -30, -109, -25, -36, -32, -40, -42, -30, -41, -40, -58, -42, -44, -33, -40, -109, -43, -40, -36, -31, -38, -109, -26, -40, -25, -95, -45, -1, -3, -14, -7, -2, -7, -2, -9, -80, -11, -2, -13, 2, 9, 0, 4, -7, -1, -2, -80, -15, -2, -12, -80, -13, -1, -3, 0, 2, -11, 3, 3, -7, -1, -2, -80, -7, 3, -80, -2, -1, 4, -80, 3, 5, 0, 0, -1, 2, 4, -11, -12, -27, 17, 16, 22, 7, 16, 22, -27, 17, 15, 18, -29, 14, 9, 17, -62, -9, 35, 34, 40, 25, 34, 40, -7, 34, 23, -11, 32, 27, 35, -44, -21, 23, 22, 28, 13, 22, 28, -19, 22, 11, 23, 12, 17, 22, 15, -9, 26, 12, 13, 26, -56, -50, -6, -7, -1, -16, -7, -1, -48, -7, -18, -6, -17, -12, -7, -14, -34, -18, -6, -5, -16, -85, -88, -45, -57, -72, -35, -44, -55, -124, -49, -6, -18, -33, 4, -5, -16, -35, -16, -20, -17, -31, -16, -3, -2, -12, -6, -7, -85, -51, -54, -43, -44, -88, -12, -23, -21, -15, -10, -17, -88, -5, -23, -11, -8, -12, -19, -88, -5, -15, 2, -19, -88, -9, -3, -4, -88, -9, -18, -88, -6, -23, -10, -17, -19, -74, -40, -43, -32, -33, -27, -8, -12, -9, -23, -8, 5, 6, -4, 2, 1, -77, -17, 24, 13, 28, 35, 26, 30, 15, 14, -54, -2, 28, 11, 13, 21, -54, 16, 25, 31, 24, 14, -54, 12, 31, 30, -54, -19, 25, 24, 30, 15, 24, 30, -17, 24, 13, -11, 15, 35, -13, -18, -54, 33, 11, 29, -54, 24, 25, 30, -54, 16, 25, 31, 24, 14, 6, 57, 53, 38, 47, 52, 42, 48, 47, -31, 35, 42, 53, -31, 42, 52, -31, 52, 38, 53, -31, 42, 47, -31, 52, 42, 40, 47, 34, 45, -31, 35, 58, 53, 38, -57, -16, -13, -18, -30, -11, -69, -95, -44, -11, -30, -13, -11, -83, -95, -58, -17, -27, -83, -95, -45, -26, -30, -27, -48, -13, -27, -26, -13, -83, -95, -51, -30, -6, -26, -13, -83, -95, -44, -11, -6, -19, -26, -83, -95, -49, -30, -18, -26, -83, -95, -50, -30, -13, -24, -22, -17, -51, -83, -95, -50, -30, -13, -24, -22, -17, -45, -83, -95, -50, -30, -13, -24, -22, -17, -41, -83, -95, -58, -25, -25, -26, -28, -11, -83, -95, -43, -26, -7, -11, -13, 8, 10, 16, 21, 14, -57, 22, 21, 19, 32, -57, 26, 28, 23, 23, 22, 25, 27, 12, 11, -57, 16, 21, -57, -6, 16, 20, 23, 19, 12, -23, 19, 22, 10, 18, 26, -43, -13, 7, 20, 10, 7, 26, 21, 24, 31, -58, 11, 18, 11, 19, 11, 20, 26, -58, -7, 11, 11, 17, -17, -22, -58, 21, 24, -58, -7, 11, 11, 17, -10, 21, 25, 15, 26, 15, 21, 20, -58, 20, 21, 26, -58, 12, 21, 27, 20, 10, -47, -7, -16, -8, -19, -12, -16, -23, -92, -41, -23, -21, -15, -23, -14, -8, -92, -23, -16, -23, -15, -23, -14, -8, -9, -92, -14, -13, -8, -92, -9, -7, -12, -12, -13, -10, -8, -23, -24, -52, -19, -98, -12, -33, -22, -25, -30, -98, -14, -16, -33, -31, -23, -15, -98, -11, -29, -16, -29, -98, -28, -19, -13, -20, -30, 1, 34, -45, 41, 20, 31, 28, 23, -45, 41, 20, 37, 28, 33, 39, -45, 31, 24, 33, 26, 39, 27, -45, 32, 20, 38, 30, -45, 25, 34, 40, 33, 23, 12, 24, -3, 15, -5, 12, 14, -5, 18, 30, 7, 3, 12, 21, -18, 15, 6, 18, 13, 25, 14, -1, 18, 14, -23, -5, 13, 13, 29, 41, 30, 15, 34, 30, -7, 31, 30, 16, 2, -39, -27, -36, -43, -56, -39, -37, -56, -11, 14, 5, 24, 16, 5, 3, 20, 5, 4, -64, 9, 4, -38, -64, -9, 16, 7, 26, 18, 7, 5, 22, 7, 6, -62, 14, 3, 5, 11, 16, 9, -62, 24, 3, 14, 23, 7, -36, -62, 51, 60, 42, 45, 34, 36, 15, 39, 48, 30, 33, 22, 24, 5, 0, 26, 36, 32, 0, 18, 33, 6, 15, -3, 0, -11, -9, -28, -33, -7, 3, -1, -33, -15, 3, 0, -69, -60, -78, -75, -86, -84, -103, -108, -82, -72, -76, -108, -90, -69, -88, 34, 43, 25, 28, 17, 19, 0, -5, 21, 31, 27, -5, 31, 28, -3, 6, -12, -9, -20, -18, -17, -42, -16, -6, -10, -42, -17, -20, -3, -22, -16, -7, -25, -19, -55, -16, -32, -15, -55, -32, -23, -17, -20, -35, -35, -26, -17, 
        -28, -40, -43, -33, -30, -47, -21, -12, -21, -27, -51, 54, okio.Utf8.REPLACEMENT_BYTE, 54, 48, 25, 70, 58, 77, 75, 72, 76, 68, 58, 37, 24, 19, 20, 30, -34, 38, 20, 17, 28, 80, 62, 59, 70};
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:108:0x0320  */
    /* JADX WARN: Code duplicated, block: B:38:0x010a  */
    /* JADX WARN: Code duplicated, block: B:40:0x010e  */
    /* JADX WARN: Code duplicated, block: B:42:0x011e  */
    /* JADX WARN: Code duplicated, block: B:47:0x016c  */
    /* JADX WARN: Code duplicated, block: B:51:0x0182  */
    /* JADX WARN: Code duplicated, block: B:53:0x018d  */
    /* JADX WARN: Code duplicated, block: B:55:0x0198  */
    /* JADX WARN: Code duplicated, block: B:64:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:66:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:68:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:69:0x0201  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0091, code lost:
    
        if ((r11.A0k.A00[0] & 128) != 128) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0093, code lost:
    
        r11.A00 = r11.A0k.A00[0];
        r11.A0X = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01b2, code lost:
    
        if ((r11.A0k.A00[0] & 128) != 128) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x021d, code lost:
    
        throw new com.facebook.ads.redexgen.core.A0(A03(504, 35, 96));
     */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 15 out of bounds for length 15
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void A08(com.facebook.ads.redexgen.core.InterfaceC0610By interfaceC0610By, com.facebook.ads.redexgen.core.CJ cj, int i) throws java.lang.InterruptedException, java.io.IOException {
        boolean z;
        int i2;
        int iA0H;
        int i3;
        int i4;
        java.nio.ByteBuffer byteBuffer;
        int i5;
        com.facebook.ads.redexgen.core.I4 i6;
        if (A03(843, 11, 105).equals(cj.A0Y)) {
            A09(interfaceC0610By, A0w, i);
            return;
        }
        if (A03(833, 10, 89).equals(cj.A0Y)) {
            A09(interfaceC0610By, A0u, i);
            return;
        }
        com.facebook.ads.redexgen.core.C9 c9 = cj.A0W;
        if (!this.A0S) {
            if (cj.A0c) {
                this.A01 &= -1073741825;
                boolean z2 = this.A0X;
                java.lang.String[] strArr = A0q;
                if (strArr[4].length() != strArr[1].length()) {
                    A0q[7] = "w2kfPmHe3lM5ITuiAgWXTb0Z1PYvpP";
                    if (!z2) {
                        interfaceC0610By.readFully(this.A0k.A00, 0, 1);
                        int i7 = this.A07 + 1;
                        java.lang.String[] strArr2 = A0q;
                        if (strArr2[4].length() != strArr2[1].length()) {
                            A0q[3] = "RdPXUMUKsZO7TyAQwEqXlEp3UjXv71g4";
                            this.A07 = i7;
                        } else {
                            this.A07 = i7;
                        }
                    }
                    if ((this.A00 & 1) == 1) {
                        boolean z3 = (this.A00 & 2) == 2;
                        this.A01 |= 1073741824;
                        if (!this.A0T) {
                            interfaceC0610By.readFully(this.A0f.A00, 0, 8);
                            this.A07 += 8;
                            this.A0T = true;
                            this.A0k.A00[0] = (byte) ((z3 ? 128 : 0) | 8);
                            this.A0k.A0Y(0);
                            c9.AFv(this.A0k, 1);
                            this.A08++;
                            this.A0f.A0Y(0);
                            c9.AFv(this.A0f, 8);
                            int i8 = this.A08;
                            if (A0q[3].charAt(1) != 'J') {
                                java.lang.String[] strArr3 = A0q;
                                strArr3[2] = "egekVBDNjwy6KHk3To1PJp7zHj1M58zH";
                                strArr3[6] = "Rod7ROx6FEIW3lDSTPptzr2clJY8baMO";
                                this.A08 = i8 + 8;
                                if (z3) {
                                    if (!this.A0U) {
                                        i6 = this.A0k;
                                        if (A0q[3].charAt(1) != 'J') {
                                            java.lang.String[] strArr4 = A0q;
                                            strArr4[2] = "YBfqsyAjIQPcgTdqT13K1G4cewdmD78z";
                                            strArr4[6] = "0sOepeKnl36tOJggTvUL8semqA7J9RPI";
                                            interfaceC0610By.readFully(i6.A00, 0, 1);
                                            this.A07++;
                                            this.A0k.A0Y(0);
                                            this.A0A = this.A0k.A0E();
                                            this.A0U = true;
                                        }
                                    }
                                    int i9 = this.A0A * 4;
                                    this.A0k.A0W(i9);
                                    interfaceC0610By.readFully(this.A0k.A00, 0, i9);
                                    this.A07 += i9;
                                    short s = (short) ((this.A0A / 2) + 1);
                                    i2 = (s * 6) + 2;
                                    if (this.A0R != null || this.A0R.capacity() < i2) {
                                        this.A0R = java.nio.ByteBuffer.allocate(i2);
                                    }
                                    this.A0R.position(0);
                                    this.A0R.putShort(s);
                                    iA0H = 0;
                                    for (i3 = 0; i3 < this.A0A; i3++) {
                                        i5 = iA0H;
                                        iA0H = this.A0k.A0H();
                                        if (i3 % 2 == 0) {
                                            this.A0R.putShort((short) (iA0H - i5));
                                        } else {
                                            this.A0R.putInt(iA0H - i5);
                                        }
                                    }
                                    i4 = (i - this.A07) - iA0H;
                                    if (this.A0A % 2 == 1) {
                                        byteBuffer = this.A0R;
                                        if (A0q[3].charAt(1) != 'J') {
                                            A0q[3] = "kfXg12OioK0hjDSelFEy9V55gOjCcb34";
                                            byteBuffer.putInt(i4);
                                        } else {
                                            java.lang.String[] strArr5 = A0q;
                                            strArr5[4] = "yDpkG8vb2XfFcx4XTCy";
                                            strArr5[1] = "c0YP1PzKjWXaH1DeD1M5DWrNtY5V";
                                            byteBuffer.putInt(i4);
                                        }
                                    } else {
                                        this.A0R.putShort((short) i4);
                                        this.A0R.putInt(0);
                                    }
                                    this.A0g.A0b(this.A0R.array(), i2);
                                    c9.AFv(this.A0g, i2);
                                    this.A08 += i2;
                                }
                            }
                        } else if (z3) {
                            if (!this.A0U) {
                                i6 = this.A0k;
                                if (A0q[3].charAt(1) != 'J') {
                                    java.lang.String[] strArr6 = A0q;
                                    strArr6[2] = "YBfqsyAjIQPcgTdqT13K1G4cewdmD78z";
                                    strArr6[6] = "0sOepeKnl36tOJggTvUL8semqA7J9RPI";
                                    interfaceC0610By.readFully(i6.A00, 0, 1);
                                    this.A07++;
                                    this.A0k.A0Y(0);
                                    this.A0A = this.A0k.A0E();
                                    this.A0U = true;
                                }
                            }
                            int i10 = this.A0A * 4;
                            this.A0k.A0W(i10);
                            interfaceC0610By.readFully(this.A0k.A00, 0, i10);
                            this.A07 += i10;
                            short s2 = (short) ((this.A0A / 2) + 1);
                            i2 = (s2 * 6) + 2;
                            if (this.A0R != null) {
                                this.A0R = java.nio.ByteBuffer.allocate(i2);
                            } else {
                                this.A0R = java.nio.ByteBuffer.allocate(i2);
                            }
                            this.A0R.position(0);
                            this.A0R.putShort(s2);
                            iA0H = 0;
                            while (i3 < this.A0A) {
                                i5 = iA0H;
                                iA0H = this.A0k.A0H();
                                if (i3 % 2 == 0) {
                                    this.A0R.putShort((short) (iA0H - i5));
                                } else {
                                    this.A0R.putInt(iA0H - i5);
                                }
                            }
                            i4 = (i - this.A07) - iA0H;
                            if (this.A0A % 2 == 1) {
                                byteBuffer = this.A0R;
                                if (A0q[3].charAt(1) != 'J') {
                                    A0q[3] = "kfXg12OioK0hjDSelFEy9V55gOjCcb34";
                                    byteBuffer.putInt(i4);
                                } else {
                                    java.lang.String[] strArr7 = A0q;
                                    strArr7[4] = "yDpkG8vb2XfFcx4XTCy";
                                    strArr7[1] = "c0YP1PzKjWXaH1DeD1M5DWrNtY5V";
                                    byteBuffer.putInt(i4);
                                }
                            } else {
                                this.A0R.putShort((short) i4);
                                this.A0R.putInt(0);
                            }
                            this.A0g.A0b(this.A0R.array(), i2);
                            c9.AFv(this.A0g, i2);
                            this.A08 += i2;
                        }
                    }
                    this.A0S = true;
                }
                throw new java.lang.RuntimeException();
            }
            if (cj.A0f != null) {
                com.facebook.ads.redexgen.core.I4 i11 = this.A0j;
                byte[] bArr = cj.A0f;
                byte[] bArr2 = cj.A0f;
                java.lang.String[] strArr8 = A0q;
                if (strArr8[5].charAt(3) == strArr8[0].charAt(3)) {
                    A0q[7] = "xMGmFyw9deXvF8JCLVlyimc8uFtOm0";
                    i11.A0b(bArr, bArr2.length);
                }
                throw new java.lang.RuntimeException();
            }
            this.A0S = true;
        }
        int iA07 = i + this.A0j.A07();
        if (A03(938, 15, 4).equals(cj.A0Y) || A03(967, 16, 70).equals(cj.A0Y)) {
            byte[] bArr3 = this.A0h.A00;
            bArr3[0] = 0;
            bArr3[1] = 0;
            bArr3[2] = 0;
            int i12 = cj.A0M;
            int i13 = 4 - cj.A0M;
            while (this.A07 < iA07) {
                if (this.A09 == 0) {
                    A0A(interfaceC0610By, bArr3, i13, i12);
                    this.A0h.A0Y(0);
                    if (A0q[7].length() != 30) {
                        throw new java.lang.RuntimeException();
                    }
                    java.lang.String[] strArr9 = A0q;
                    strArr9[2] = "r7rQPzLmtnzbZfDaT4qVCto0YidT5MSa";
                    strArr9[6] = "skvo7CHoM9lLyHX4TkoB8l2xfezul64L";
                    this.A09 = this.A0h.A0H();
                    this.A0i.A0Y(0);
                    c9.AFv(this.A0i, 4);
                    this.A08 += 4;
                } else {
                    this.A09 -= A00(interfaceC0610By, c9, this.A09);
                }
            }
        } else {
            if (cj.A0X != null) {
                int iA08 = this.A0j.A07();
                java.lang.String[] strArr10 = A0q;
                if (strArr10[5].charAt(3) == strArr10[0].charAt(3)) {
                    A0q[7] = "NTWnixobIA9UVjfcvv4OHXfPyMDPo0";
                    if (iA08 == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else if (iA08 == 0) {
                    z = true;
                } else {
                    z = false;
                }
                com.facebook.ads.redexgen.core.AbstractC0730Hf.A04(z);
                cj.A0X.A01(interfaceC0610By, this.A01, iA07);
            }
            while (this.A07 < iA07) {
                A00(interfaceC0610By, c9, iA07 - this.A07);
            }
        }
        if (A03(org.objectweb.asm.Opcodes.PUTFIELD, 8, 30).equals(cj.A0Y)) {
            this.A0n.A0Y(0);
            c9.AFv(this.A0n, 4);
            this.A08 += 4;
        }
    }

    static {
        A06();
        A0r = new com.facebook.ads.redexgen.core.C1159Ye();
        A0w = new byte[]{49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
        A0x = new byte[]{32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32};
        A0t = com.facebook.ads.redexgen.core.IK.A0i(A03(539, 90, 32));
        A0u = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        A0v = new byte[]{32, 32, 32, 32, 32, 32, 32, 32, 32, 32};
        A0s = new java.util.UUID(72057594037932032L, -9223371306706625679L);
    }

    public C1157Yc() {
        this(0);
    }

    public C1157Yc(int i) {
        this(new com.facebook.ads.redexgen.core.C1160Yf(), i);
    }

    public C1157Yc(com.facebook.ads.redexgen.core.CF cf, int i) {
        this.A0K = -1L;
        this.A0M = androidx.media3.common.C.TIME_UNSET;
        this.A0G = androidx.media3.common.C.TIME_UNSET;
        this.A0H = androidx.media3.common.C.TIME_UNSET;
        this.A0F = -1L;
        this.A0J = -1L;
        this.A0E = androidx.media3.common.C.TIME_UNSET;
        this.A0d = cf;
        this.A0d.A9E(new com.facebook.ads.redexgen.core.C1158Yd(this, null));
        this.A0o = (i & 1) == 0;
        this.A0e = new com.facebook.ads.redexgen.core.CM();
        this.A0c = new android.util.SparseArray<>();
        this.A0k = new com.facebook.ads.redexgen.core.I4(4);
        this.A0n = new com.facebook.ads.redexgen.core.I4(java.nio.ByteBuffer.allocate(4).putInt(-1).array());
        this.A0l = new com.facebook.ads.redexgen.core.I4(4);
        this.A0i = new com.facebook.ads.redexgen.core.I4(com.facebook.ads.redexgen.core.I0.A03);
        this.A0h = new com.facebook.ads.redexgen.core.I4(4);
        this.A0j = new com.facebook.ads.redexgen.core.I4();
        this.A0m = new com.facebook.ads.redexgen.core.I4();
        this.A0f = new com.facebook.ads.redexgen.core.I4(8);
        this.A0g = new com.facebook.ads.redexgen.core.I4();
    }

    private int A00(com.facebook.ads.redexgen.core.InterfaceC0610By interfaceC0610By, com.facebook.ads.redexgen.core.C9 c9, int i) throws java.lang.InterruptedException, java.io.IOException {
        int bytesRead;
        int strippedBytesLeft = this.A0j.A04();
        if (strippedBytesLeft > 0) {
            bytesRead = java.lang.Math.min(i, strippedBytesLeft);
            c9.AFv(this.A0j, bytesRead);
        } else {
            bytesRead = c9.AFu(interfaceC0610By, i, false);
        }
        this.A07 += bytesRead;
        this.A08 += bytesRead;
        return bytesRead;
    }

    private long A01(long j) throws com.facebook.ads.redexgen.core.A0 {
        if (this.A0M != androidx.media3.common.C.TIME_UNSET) {
            return com.facebook.ads.redexgen.core.IK.A0F(j, this.A0M, 1000L);
        }
        throw new com.facebook.ads.redexgen.core.A0(A03(189, 54, 18));
    }

    private com.facebook.ads.redexgen.core.C6 A02() {
        if (this.A0K == -1 || this.A0H == androidx.media3.common.C.TIME_UNSET || this.A0Q == null || this.A0Q.A02() == 0 || this.A0P == null || this.A0P.A02() != this.A0Q.A02()) {
            this.A0Q = null;
            this.A0P = null;
            return new com.facebook.ads.redexgen.core.C1169Yo(this.A0H);
        }
        int iA02 = this.A0Q.A02();
        int[] iArr = new int[iA02];
        long[] jArr = new long[iA02];
        long[] timesUs = new long[iA02];
        long[] jArr2 = new long[iA02];
        for (int i = 0; i < iA02; i++) {
            jArr2[i] = this.A0Q.A03(i);
            jArr[i] = this.A0K + this.A0P.A03(i);
        }
        for (int i2 = 0; i2 < cuePointsSize; i2++) {
            int cuePointsSize = i2 + 1;
            iArr[i2] = (int) (jArr[cuePointsSize] - jArr[i2]);
            int cuePointsSize2 = i2 + 1;
            timesUs[i2] = jArr2[cuePointsSize2] - jArr2[i2];
        }
        int cuePointsSize3 = iA02 - 1;
        iArr[iA02 - 1] = (int) ((this.A0K + this.A0L) - jArr[cuePointsSize3]);
        timesUs[iA02 - 1] = this.A0H - jArr2[iA02 - 1];
        this.A0Q = null;
        this.A0P = null;
        return new com.facebook.ads.redexgen.core.C1174Yt(iArr, jArr, timesUs, jArr2);
    }

    private void A05() {
        this.A07 = 0;
        this.A08 = 0;
        this.A09 = 0;
        this.A0S = false;
        this.A0X = false;
        this.A0U = false;
        this.A0A = 0;
        this.A00 = (byte) 0;
        this.A0T = false;
        this.A0j.A0V();
    }

    private void A07(com.facebook.ads.redexgen.core.InterfaceC0610By interfaceC0610By, int i) throws java.lang.InterruptedException, java.io.IOException {
        if (this.A0k.A07() >= i) {
            return;
        }
        if (this.A0k.A05() < i) {
            com.facebook.ads.redexgen.core.I4 i4 = this.A0k;
            com.facebook.ads.redexgen.core.I4 i5 = this.A0k;
            java.lang.String[] strArr = A0q;
            if (strArr[4].length() == strArr[1].length()) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A0q;
            strArr2[4] = "rT72M2ede8MzF7iNlXS";
            strArr2[1] = "ZGqx0ngevM9RicVUzOfV30c6jBNW";
            i4.A0b(java.util.Arrays.copyOf(i5.A00, java.lang.Math.max(this.A0k.A00.length * 2, i)), this.A0k.A07());
        }
        interfaceC0610By.readFully(this.A0k.A00, this.A0k.A07(), i - this.A0k.A07());
        this.A0k.A0X(i);
    }

    private void A09(com.facebook.ads.redexgen.core.InterfaceC0610By interfaceC0610By, byte[] bArr, int i) throws java.lang.InterruptedException, java.io.IOException {
        int length = bArr.length + i;
        int sizeWithPrefix = this.A0m.A05();
        if (sizeWithPrefix < length) {
            int sizeWithPrefix2 = length + i;
            this.A0m.A00 = java.util.Arrays.copyOf(bArr, sizeWithPrefix2);
        } else {
            java.lang.System.arraycopy(bArr, 0, this.A0m.A00, 0, bArr.length);
        }
        byte[] bArr2 = this.A0m.A00;
        int sizeWithPrefix3 = bArr.length;
        interfaceC0610By.readFully(bArr2, sizeWithPrefix3, i);
        this.A0m.A0W(length);
    }

    private void A0A(com.facebook.ads.redexgen.core.InterfaceC0610By interfaceC0610By, byte[] bArr, int i, int i2) throws java.lang.InterruptedException, java.io.IOException {
        int iMin = java.lang.Math.min(i2, this.A0j.A04());
        int pendingStrippedBytes = i2 - iMin;
        interfaceC0610By.readFully(bArr, i + iMin, pendingStrippedBytes);
        if (iMin > 0) {
            this.A0j.A0c(bArr, i, iMin);
        }
        int pendingStrippedBytes2 = this.A07;
        this.A07 = pendingStrippedBytes2 + i2;
    }

    private void A0B(com.facebook.ads.redexgen.core.CJ cj, long j) {
        if (cj.A0X != null) {
            cj.A0X.A03(cj, j);
        } else {
            if (A03(843, 11, 105).equals(cj.A0Y)) {
                A0C(cj, A03(33, 19, 28), 19, 1000L, A0x);
            } else if (A03(833, 10, 89).equals(cj.A0Y)) {
                A0C(cj, A03(14, 19, 1), 21, 10000L, A0v);
            }
            cj.A0W.AFw(j, this.A01, this.A08, 0, cj.A0V);
        }
        this.A0V = true;
        A05();
    }

    private void A0C(com.facebook.ads.redexgen.core.CJ cj, java.lang.String str, int i, long j, byte[] bArr) {
        A0D(this.A0m.A00, this.A0C, str, i, j, bArr);
        cj.A0W.AFv(this.A0m, this.A0m.A07());
        this.A08 += this.A0m.A07();
    }

    public static void A0D(byte[] bArr, long j, java.lang.String str, int i, long j2, byte[] bArr2) {
        byte[] timeCodeData;
        if (j == androidx.media3.common.C.TIME_UNSET) {
            timeCodeData = bArr2;
        } else {
            int i2 = (int) (j / 3600000000L);
            long j3 = j - (((long) (i2 * 3600)) * 1000000);
            int i3 = (int) (j3 / 60000000);
            int minutes = i3 * 60;
            long j4 = j3 - (((long) minutes) * 1000000);
            int lastValue = (int) (j4 / 1000000);
            int minutes2 = (int) ((j4 - (((long) lastValue) * 1000000)) / j2);
            timeCodeData = com.facebook.ads.redexgen.core.IK.A0i(java.lang.String.format(java.util.Locale.US, str, java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(i3), java.lang.Integer.valueOf(lastValue), java.lang.Integer.valueOf(minutes2)));
        }
        java.lang.System.arraycopy(timeCodeData, 0, bArr, i, bArr2.length);
    }

    private boolean A0E(com.facebook.ads.redexgen.core.C4 c4, long j) {
        if (this.A0Y) {
            this.A0J = j;
            c4.A00 = this.A0F;
            this.A0Y = false;
            java.lang.String[] strArr = A0q;
            if (strArr[5].charAt(3) != strArr[0].charAt(3)) {
                throw new java.lang.RuntimeException();
            }
            A0q[3] = "3sMiiyikeABHc79KuFbt5PifQhbEMiPL";
            return true;
        }
        if (!this.A0a || this.A0J == -1) {
            return false;
        }
        c4.A00 = this.A0J;
        this.A0J = -1L;
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:30:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:32:0x0102  */
    /* JADX WARN: Code duplicated, block: B:34:0x0111  */
    /* JADX WARN: Code duplicated, block: B:56:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:58:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:60:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:64:0x0201  */
    /* JADX WARN: Code duplicated, block: B:66:0x021b  */
    /* JADX WARN: Code duplicated, block: B:68:0x022b  */
    /* JADX WARN: Code duplicated, block: B:73:0x023f  */
    /* JADX WARN: Code duplicated, block: B:76:0x024e  */
    /* JADX WARN: Code duplicated, block: B:79:0x0266  */
    public static boolean A0F(java.lang.String str) {
        java.lang.String[] strArr;
        if (!A03(1006, 5, 52).equals(str) && !A03(1011, 5, 127).equals(str) && !A03(androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_COLOR, 7, 124).equals(str) && !A03(953, 14, 107).equals(str)) {
            java.lang.String strA03 = A03(923, 15, 79);
            if (A0q[3].charAt(1) == 'J') {
                throw new java.lang.RuntimeException();
            }
            A0q[7] = "GL4c1uFVryft0C0RqMAB4Zff6k4fBx";
            if (!strA03.equals(str) && !A03(909, 14, 112).equals(str) && !A03(938, 15, 4).equals(str) && !A03(967, 16, 70).equals(str) && !A03(983, 15, 57).equals(str) && !A03(androidx.datastore.preferences.protobuf.DescriptorProtos.Edition.EDITION_PROTO2_VALUE, 8, 47).equals(str)) {
                java.lang.String[] strArr2 = A0q;
                if (strArr2[2].charAt(16) != strArr2[6].charAt(16)) {
                    if (!A03(154, 6, 28).equals(str)) {
                        strArr = A0q;
                        if (strArr[4].length() != strArr[1].length()) {
                            java.lang.String[] strArr3 = A0q;
                            strArr3[2] = "7cKpE7xR7J3Aq7pNTLEDFNkVH25Zgbua";
                            strArr3[6] = "8CcZX4JJYq12yj73T9598uB0Y3yvkFOz";
                            if (!A03(org.objectweb.asm.Opcodes.PUTFIELD, 8, 30).equals(str)) {
                                if (!A03(74, 5, 88).equals(str) && !A03(128, 9, 41).equals(str) && !A03(org.objectweb.asm.Opcodes.L2F, 9, 83).equals(str) && !A03(79, 5, 52).equals(str) && !A03(116, 6, 93).equals(str) && !A03(org.objectweb.asm.Opcodes.LRETURN, 8, 116).equals(str) && !A03(84, 5, 33).equals(str) && !A03(89, 13, 34).equals(str) && !A03(102, 14, 16).equals(str) && !A03(122, 6, 49).equals(str) && !A03(org.objectweb.asm.Opcodes.I2C, 8, 126).equals(str)) {
                                    if (A0q[7].length() != 30) {
                                        A0q[7] = "hCOrDW1Xt9EUQRBJh4lIFcdmIau3uO";
                                        if (!A03(org.objectweb.asm.Opcodes.IF_ICMPNE, 13, 72).equals(str)) {
                                            if (!A03(843, 11, 105).equals(str) && !A03(833, 10, 89).equals(str)) {
                                                if (A0q[3].charAt(1) != 'J') {
                                                    java.lang.String[] strArr4 = A0q;
                                                    strArr4[2] = "2Y1KYLFk3QhgHC6kTmmXwzPMLyCgOOml";
                                                    strArr4[6] = "5mhsWfLPzlfy0mrjTbURgRjZHxOWOUq3";
                                                    if (!A03(854, 8, 37).equals(str)) {
                                                        if (A03(823, 10, 94).equals(str) && !A03(815, 8, 88).equals(str)) {
                                                            return false;
                                                        }
                                                    }
                                                } else if (!A03(854, 8, 37).equals(str)) {
                                                    if (A03(823, 10, 94).equals(str)) {
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        java.lang.String[] strArr5 = A0q;
                                        strArr5[2] = "g5yfSR3lkhXiJ6bMTwygRkv9DkY9Awd9";
                                        strArr5[6] = "Ux785EUFU4U6vpERTZn7VKH4gfY9IFZT";
                                        if (!A03(org.objectweb.asm.Opcodes.IF_ICMPNE, 13, 72).equals(str)) {
                                            if (!A03(843, 11, 105).equals(str)) {
                                                if (A0q[3].charAt(1) != 'J') {
                                                    java.lang.String[] strArr6 = A0q;
                                                    strArr6[2] = "2Y1KYLFk3QhgHC6kTmmXwzPMLyCgOOml";
                                                    strArr6[6] = "5mhsWfLPzlfy0mrjTbURgRjZHxOWOUq3";
                                                    if (!A03(854, 8, 37).equals(str)) {
                                                        if (A03(823, 10, 94).equals(str)) {
                                                        }
                                                    }
                                                } else if (!A03(854, 8, 37).equals(str)) {
                                                    if (A03(823, 10, 94).equals(str)) {
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            A0q[3] = "57SEv8zsmKegk4FairLq34Nwn3RXRdHM";
                            if (!A03(org.objectweb.asm.Opcodes.PUTFIELD, 8, 25).equals(str)) {
                                if (!A03(74, 5, 88).equals(str)) {
                                    if (A0q[7].length() != 30) {
                                        A0q[7] = "hCOrDW1Xt9EUQRBJh4lIFcdmIau3uO";
                                        if (!A03(org.objectweb.asm.Opcodes.IF_ICMPNE, 13, 72).equals(str)) {
                                            if (!A03(843, 11, 105).equals(str)) {
                                                if (A0q[3].charAt(1) != 'J') {
                                                    java.lang.String[] strArr7 = A0q;
                                                    strArr7[2] = "2Y1KYLFk3QhgHC6kTmmXwzPMLyCgOOml";
                                                    strArr7[6] = "5mhsWfLPzlfy0mrjTbURgRjZHxOWOUq3";
                                                    if (!A03(854, 8, 37).equals(str)) {
                                                        if (A03(823, 10, 94).equals(str)) {
                                                        }
                                                    }
                                                } else if (!A03(854, 8, 37).equals(str)) {
                                                    if (A03(823, 10, 94).equals(str)) {
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        java.lang.String[] strArr8 = A0q;
                                        strArr8[2] = "g5yfSR3lkhXiJ6bMTwygRkv9DkY9Awd9";
                                        strArr8[6] = "Ux785EUFU4U6vpERTZn7VKH4gfY9IFZT";
                                        if (!A03(org.objectweb.asm.Opcodes.IF_ICMPNE, 13, 72).equals(str)) {
                                            if (!A03(843, 11, 105).equals(str)) {
                                                if (A0q[3].charAt(1) != 'J') {
                                                    java.lang.String[] strArr9 = A0q;
                                                    strArr9[2] = "2Y1KYLFk3QhgHC6kTmmXwzPMLyCgOOml";
                                                    strArr9[6] = "5mhsWfLPzlfy0mrjTbURgRjZHxOWOUq3";
                                                    if (!A03(854, 8, 37).equals(str)) {
                                                        if (A03(823, 10, 94).equals(str)) {
                                                        }
                                                    }
                                                } else if (!A03(854, 8, 37).equals(str)) {
                                                    if (A03(823, 10, 94).equals(str)) {
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    A0q[7] = "K2qczMKmwV73mbRHKzDlVhU6QdsMH0";
                    if (!A03(154, 6, 28).equals(str)) {
                        strArr = A0q;
                        if (strArr[4].length() != strArr[1].length()) {
                            java.lang.String[] strArr10 = A0q;
                            strArr10[2] = "7cKpE7xR7J3Aq7pNTLEDFNkVH25Zgbua";
                            strArr10[6] = "8CcZX4JJYq12yj73T9598uB0Y3yvkFOz";
                            if (!A03(org.objectweb.asm.Opcodes.PUTFIELD, 8, 30).equals(str)) {
                                if (!A03(74, 5, 88).equals(str)) {
                                    if (A0q[7].length() != 30) {
                                        A0q[7] = "hCOrDW1Xt9EUQRBJh4lIFcdmIau3uO";
                                        if (!A03(org.objectweb.asm.Opcodes.IF_ICMPNE, 13, 72).equals(str)) {
                                            if (!A03(843, 11, 105).equals(str)) {
                                                if (A0q[3].charAt(1) != 'J') {
                                                    java.lang.String[] strArr11 = A0q;
                                                    strArr11[2] = "2Y1KYLFk3QhgHC6kTmmXwzPMLyCgOOml";
                                                    strArr11[6] = "5mhsWfLPzlfy0mrjTbURgRjZHxOWOUq3";
                                                    if (!A03(854, 8, 37).equals(str)) {
                                                        if (A03(823, 10, 94).equals(str)) {
                                                        }
                                                    }
                                                } else if (!A03(854, 8, 37).equals(str)) {
                                                    if (A03(823, 10, 94).equals(str)) {
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        java.lang.String[] strArr12 = A0q;
                                        strArr12[2] = "g5yfSR3lkhXiJ6bMTwygRkv9DkY9Awd9";
                                        strArr12[6] = "Ux785EUFU4U6vpERTZn7VKH4gfY9IFZT";
                                        if (!A03(org.objectweb.asm.Opcodes.IF_ICMPNE, 13, 72).equals(str)) {
                                            if (!A03(843, 11, 105).equals(str)) {
                                                if (A0q[3].charAt(1) != 'J') {
                                                    java.lang.String[] strArr13 = A0q;
                                                    strArr13[2] = "2Y1KYLFk3QhgHC6kTmmXwzPMLyCgOOml";
                                                    strArr13[6] = "5mhsWfLPzlfy0mrjTbURgRjZHxOWOUq3";
                                                    if (!A03(854, 8, 37).equals(str)) {
                                                        if (A03(823, 10, 94).equals(str)) {
                                                        }
                                                    }
                                                } else if (!A03(854, 8, 37).equals(str)) {
                                                    if (A03(823, 10, 94).equals(str)) {
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            A0q[3] = "57SEv8zsmKegk4FairLq34Nwn3RXRdHM";
                            if (!A03(org.objectweb.asm.Opcodes.PUTFIELD, 8, 25).equals(str)) {
                                if (!A03(74, 5, 88).equals(str)) {
                                    if (A0q[7].length() != 30) {
                                        A0q[7] = "hCOrDW1Xt9EUQRBJh4lIFcdmIau3uO";
                                        if (!A03(org.objectweb.asm.Opcodes.IF_ICMPNE, 13, 72).equals(str)) {
                                            if (!A03(843, 11, 105).equals(str)) {
                                                if (A0q[3].charAt(1) != 'J') {
                                                    java.lang.String[] strArr14 = A0q;
                                                    strArr14[2] = "2Y1KYLFk3QhgHC6kTmmXwzPMLyCgOOml";
                                                    strArr14[6] = "5mhsWfLPzlfy0mrjTbURgRjZHxOWOUq3";
                                                    if (!A03(854, 8, 37).equals(str)) {
                                                        if (A03(823, 10, 94).equals(str)) {
                                                        }
                                                    }
                                                } else if (!A03(854, 8, 37).equals(str)) {
                                                    if (A03(823, 10, 94).equals(str)) {
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        java.lang.String[] strArr15 = A0q;
                                        strArr15[2] = "g5yfSR3lkhXiJ6bMTwygRkv9DkY9Awd9";
                                        strArr15[6] = "Ux785EUFU4U6vpERTZn7VKH4gfY9IFZT";
                                        if (!A03(org.objectweb.asm.Opcodes.IF_ICMPNE, 13, 72).equals(str)) {
                                            if (!A03(843, 11, 105).equals(str)) {
                                                if (A0q[3].charAt(1) != 'J') {
                                                    java.lang.String[] strArr16 = A0q;
                                                    strArr16[2] = "2Y1KYLFk3QhgHC6kTmmXwzPMLyCgOOml";
                                                    strArr16[6] = "5mhsWfLPzlfy0mrjTbURgRjZHxOWOUq3";
                                                    if (!A03(854, 8, 37).equals(str)) {
                                                        if (A03(823, 10, 94).equals(str)) {
                                                        }
                                                    }
                                                } else if (!A03(854, 8, 37).equals(str)) {
                                                    if (A03(823, 10, 94).equals(str)) {
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return true;
    }

    public static int[] A0H(int[] iArr, int i) {
        if (iArr == null) {
            return new int[i];
        }
        int length = iArr.length;
        java.lang.String[] strArr = A0q;
        if (strArr[4].length() == strArr[1].length()) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A0q;
        strArr2[2] = "KGTULEZOhECvdgncTg0P5sR2NlniOyva";
        strArr2[6] = "LglDNYTdNlWs2NlpTSjFbJOzEAAFHyKn";
        if (length >= i) {
            return iArr;
        }
        return new int[java.lang.Math.max(iArr.length * 2, i)];
    }

    public final void A0I(int i) throws com.facebook.ads.redexgen.core.A0 {
        switch (i) {
            case org.objectweb.asm.Opcodes.IF_ICMPNE /* 160 */:
                if (this.A04 != 2) {
                    return;
                }
                if (!this.A0W) {
                    this.A01 = 1 | this.A01;
                }
                A0B(this.A0c.get(this.A05), this.A0D);
                this.A04 = 0;
                return;
            case org.objectweb.asm.Opcodes.FRETURN /* 174 */:
                if (A0F(this.A0O.A0Y)) {
                    this.A0O.A09(this.A0N, this.A0O.A0N);
                    this.A0c.put(this.A0O.A0N, this.A0O);
                }
                this.A0O = null;
                return;
            case 19899:
                if (this.A0B != -1 && this.A0I != -1) {
                    if (this.A0B != 475249515) {
                        return;
                    }
                    this.A0F = this.A0I;
                    return;
                }
                throw new com.facebook.ads.redexgen.core.A0(A03(667, 50, 69));
            case 25152:
                if (!this.A0O.A0c) {
                    return;
                }
                if (this.A0O.A0V != null) {
                    this.A0O.A0U = new com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmInitData(new com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmInitData.SchemeData(com.facebook.ads.redexgen.core.AbstractC05389b.A05, A03(1024, 10, 78), this.A0O.A0V.A03));
                    return;
                }
                throw new com.facebook.ads.redexgen.core.A0(A03(449, 55, 73));
            case 28032:
                if (!this.A0O.A0c || this.A0O.A0f == null) {
                    return;
                } else {
                    throw new com.facebook.ads.redexgen.core.A0(A03(243, 53, 47));
                }
            case 357149030:
                if (this.A0M == androidx.media3.common.C.TIME_UNSET) {
                    this.A0M = 1000000L;
                }
                if (this.A0G == androidx.media3.common.C.TIME_UNSET) {
                    return;
                }
                this.A0H = A01(this.A0G);
                return;
            case 374648427:
                if (this.A0c.size() != 0) {
                    this.A0N.A5u();
                    return;
                }
                throw new com.facebook.ads.redexgen.core.A0(A03(756, 26, 29));
            case 475249515:
                if (this.A0a) {
                    return;
                }
                this.A0N.AG8(A02());
                this.A0a = true;
                return;
            default:
                return;
        }
    }

    public final void A0J(int i, double d) {
        switch (i) {
            case org.objectweb.asm.Opcodes.PUTFIELD /* 181 */:
                this.A0O.A0O = (int) d;
                break;
            case 17545:
                this.A0G = (long) d;
                break;
            case 21969:
                this.A0O.A06 = (float) d;
                break;
            case 21970:
                this.A0O.A07 = (float) d;
                break;
            case 21971:
                this.A0O.A04 = (float) d;
                break;
            case 21972:
                this.A0O.A05 = (float) d;
                break;
            case 21973:
                this.A0O.A02 = (float) d;
                break;
            case 21974:
                this.A0O.A03 = (float) d;
                break;
            case 21975:
                this.A0O.A08 = (float) d;
                break;
            case 21976:
                this.A0O.A09 = (float) d;
                break;
            case 21977:
                this.A0O.A00 = (float) d;
                break;
            case 21978:
                this.A0O.A01 = (float) d;
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:109:0x0381  */
    /* JADX WARN: Code duplicated, block: B:133:0x031c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:134:0x0316 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:135:0x031c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:136:0x031c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:139:0x02c1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x028d  */
    /* JADX WARN: Code duplicated, block: B:79:0x029b  */
    /* JADX WARN: Code duplicated, block: B:81:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:83:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:86:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:87:0x02d7  */
    public final void A0K(int i, int lacing, com.facebook.ads.redexgen.core.InterfaceC0610By interfaceC0610By) throws java.lang.InterruptedException, java.io.IOException {
        java.lang.String[] strArr;
        int sampleIndex;
        int i2;
        boolean z;
        int i3 = 0;
        int sampleIndex2 = 1;
        switch (i) {
            case org.objectweb.asm.Opcodes.IF_ICMPLT /* 161 */:
            case org.objectweb.asm.Opcodes.IF_ICMPGT /* 163 */:
                if (this.A04 == 0) {
                    this.A05 = (int) this.A0e.A05(interfaceC0610By, false, true, 8);
                    this.A06 = this.A0e.A04();
                    this.A0C = androidx.media3.common.C.TIME_UNSET;
                    this.A04 = 1;
                    this.A0k.A0V();
                }
                com.facebook.ads.redexgen.core.CJ cj = this.A0c.get(this.A05);
                if (cj == null) {
                    interfaceC0610By.AGq(lacing - this.A06);
                    this.A04 = 0;
                    return;
                }
                int i4 = this.A04;
                if (A0q[3].charAt(1) != 'J') {
                    java.lang.String[] strArr2 = A0q;
                    strArr2[2] = "M8C3xfNgC7BEln7mT97Vuf0ErLxvQOKJ";
                    strArr2[6] = "TAtiqtuXAaJIrhLkTfPGbjwesQZeRf5r";
                    if (i4 == 1) {
                        A07(interfaceC0610By, 3);
                        int i5 = (this.A0k.A00[2] & 6) >> 1;
                        if (i5 == 0) {
                            this.A02 = 1;
                            this.A0b = A0H(this.A0b, 1);
                            this.A0b[0] = (lacing - this.A06) - 3;
                        } else if (i == 163) {
                            A07(interfaceC0610By, 4);
                            this.A02 = (this.A0k.A00[3] & 255) + 1;
                            this.A0b = A0H(this.A0b, this.A02);
                            if (i5 == 2) {
                                java.util.Arrays.fill(this.A0b, 0, this.A02, ((lacing - this.A06) - 4) / this.A02);
                            } else if (i5 != 1) {
                                if (i5 == 3) {
                                    int i6 = 0;
                                    int i7 = 4;
                                    int i8 = 0;
                                    while (true) {
                                        int i9 = this.A02 - sampleIndex2;
                                        java.lang.String[] strArr3 = A0q;
                                        if (strArr3[4].length() == strArr3[1].length()) {
                                            throw new java.lang.RuntimeException();
                                        }
                                        java.lang.String[] strArr4 = A0q;
                                        strArr4[4] = "MQfWXGVG2KH52nZfmLE";
                                        strArr4[1] = "qeuRrtIg6ODYL4r1KEbQwHddDicF";
                                        if (i8 < i9) {
                                            this.A0b[i8] = i3;
                                            i7++;
                                            A07(interfaceC0610By, i7);
                                            if (this.A0k.A00[i7 - 1] != 0) {
                                                long j = 0;
                                                int i10 = 0;
                                                while (i10 < 8) {
                                                    int sampleIndex3 = sampleIndex2 << (7 - i10);
                                                    if ((this.A0k.A00[i7 - 1] & sampleIndex3) != 0) {
                                                        int i11 = i7 - 1;
                                                        i7 += i10;
                                                        A07(interfaceC0610By, i7);
                                                        int i12 = i11 + 1;
                                                        j = this.A0k.A00[i11] & 255 & (sampleIndex3 ^ (-1));
                                                        while (i12 < i7) {
                                                            int sampleIndex4 = i12 + 1;
                                                            j = (j << 8) | ((long) (this.A0k.A00[i12] & 255));
                                                            i12 = sampleIndex4;
                                                        }
                                                        if (i8 > 0) {
                                                            j -= (1 << ((i10 * 7) + 6)) - 1;
                                                        }
                                                        strArr = A0q;
                                                        if (strArr[2].charAt(16) != strArr[6].charAt(16)) {
                                                            java.lang.String[] strArr5 = A0q;
                                                            strArr5[5] = "TvDgZIf9DA1SeorJXp0mfcls0ZdzUlz1";
                                                            strArr5[0] = "UbWgMjA05fRq1K8xl0ZmRkK7hQjnDzF1";
                                                            if (j >= -2147483648L) {
                                                                if (A0q[3].charAt(1) != 'J') {
                                                                    throw new java.lang.RuntimeException();
                                                                }
                                                                java.lang.String[] strArr6 = A0q;
                                                                strArr6[2] = "RdR8QrOy5TYsbF6bT9KDaIfUqENOfCsY";
                                                                strArr6[6] = "OykVGwHphLwsaZDZTyeZeGBzLv9hBUjA";
                                                                if (j <= 2147483647L) {
                                                                    sampleIndex = (int) j;
                                                                    int[] iArr = this.A0b;
                                                                    if (i8 == 0) {
                                                                        sampleIndex += this.A0b[i8 - 1];
                                                                    }
                                                                    iArr[i8] = sampleIndex;
                                                                    i6 += this.A0b[i8];
                                                                    i8++;
                                                                    i3 = 0;
                                                                    sampleIndex2 = 1;
                                                                }
                                                            }
                                                        } else {
                                                            A0q[7] = "9rDRbhLgdj9JuYz7wQFdnMzx1GQn6n";
                                                            if (j >= -2147483648L) {
                                                                if (A0q[3].charAt(1) != 'J') {
                                                                    throw new java.lang.RuntimeException();
                                                                }
                                                                java.lang.String[] strArr7 = A0q;
                                                                strArr7[2] = "RdR8QrOy5TYsbF6bT9KDaIfUqENOfCsY";
                                                                strArr7[6] = "OykVGwHphLwsaZDZTyeZeGBzLv9hBUjA";
                                                                if (j <= 2147483647L) {
                                                                    sampleIndex = (int) j;
                                                                    int[] iArr2 = this.A0b;
                                                                    if (i8 == 0) {
                                                                        sampleIndex += this.A0b[i8 - 1];
                                                                    }
                                                                    iArr2[i8] = sampleIndex;
                                                                    i6 += this.A0b[i8];
                                                                    i8++;
                                                                    i3 = 0;
                                                                    sampleIndex2 = 1;
                                                                }
                                                            }
                                                        }
                                                        throw new com.facebook.ads.redexgen.core.A0(A03(396, 37, 39));
                                                    }
                                                    i10++;
                                                    sampleIndex2 = 1;
                                                }
                                                strArr = A0q;
                                                if (strArr[2].charAt(16) != strArr[6].charAt(16)) {
                                                    java.lang.String[] strArr8 = A0q;
                                                    strArr8[5] = "TvDgZIf9DA1SeorJXp0mfcls0ZdzUlz1";
                                                    strArr8[0] = "UbWgMjA05fRq1K8xl0ZmRkK7hQjnDzF1";
                                                    if (j >= -2147483648L) {
                                                        if (A0q[3].charAt(1) != 'J') {
                                                            throw new java.lang.RuntimeException();
                                                        }
                                                        java.lang.String[] strArr9 = A0q;
                                                        strArr9[2] = "RdR8QrOy5TYsbF6bT9KDaIfUqENOfCsY";
                                                        strArr9[6] = "OykVGwHphLwsaZDZTyeZeGBzLv9hBUjA";
                                                        if (j <= 2147483647L) {
                                                            sampleIndex = (int) j;
                                                            int[] iArr3 = this.A0b;
                                                            if (i8 == 0) {
                                                                sampleIndex += this.A0b[i8 - 1];
                                                            }
                                                            iArr3[i8] = sampleIndex;
                                                            i6 += this.A0b[i8];
                                                            i8++;
                                                            i3 = 0;
                                                            sampleIndex2 = 1;
                                                        }
                                                    }
                                                } else {
                                                    A0q[7] = "9rDRbhLgdj9JuYz7wQFdnMzx1GQn6n";
                                                    if (j >= -2147483648L) {
                                                        if (A0q[3].charAt(1) != 'J') {
                                                            throw new java.lang.RuntimeException();
                                                        }
                                                        java.lang.String[] strArr10 = A0q;
                                                        strArr10[2] = "RdR8QrOy5TYsbF6bT9KDaIfUqENOfCsY";
                                                        strArr10[6] = "OykVGwHphLwsaZDZTyeZeGBzLv9hBUjA";
                                                        if (j <= 2147483647L) {
                                                            sampleIndex = (int) j;
                                                            int[] iArr4 = this.A0b;
                                                            if (i8 == 0) {
                                                                sampleIndex += this.A0b[i8 - 1];
                                                            }
                                                            iArr4[i8] = sampleIndex;
                                                            i6 += this.A0b[i8];
                                                            i8++;
                                                            i3 = 0;
                                                            sampleIndex2 = 1;
                                                        }
                                                    }
                                                }
                                                throw new com.facebook.ads.redexgen.core.A0(A03(396, 37, 39));
                                            }
                                            throw new com.facebook.ads.redexgen.core.A0(A03(782, 33, 82));
                                        }
                                        int[] iArr5 = this.A0b;
                                        int i13 = this.A02 - 1;
                                        int lacing2 = (lacing - this.A06) - i7;
                                        java.lang.String[] strArr11 = A0q;
                                        if (strArr11[5].charAt(3) == strArr11[0].charAt(3)) {
                                            java.lang.String[] strArr12 = A0q;
                                            strArr12[5] = "oIKgVgnUIz37d8pGe3wSnmhGfIVOz94k";
                                            strArr12[0] = "yVugaSbmWBfkDrjvTkcEi0wv2ti8RFPs";
                                            iArr5[i13] = lacing2 - i6;
                                        }
                                    }
                                } else {
                                    throw new com.facebook.ads.redexgen.core.A0(A03(877, 25, 65) + i5);
                                }
                            } else {
                                int byteValue = 0;
                                int i14 = 4;
                                for (int i15 = 0; i15 < this.A02 - 1; i15++) {
                                    this.A0b[i15] = 0;
                                    do {
                                        i14++;
                                        A07(interfaceC0610By, i14);
                                        i2 = this.A0k.A00[i14 - 1] & 255;
                                        int[] iArr6 = this.A0b;
                                        iArr6[i15] = iArr6[i15] + i2;
                                    } while (i2 == 255);
                                    int[] iArr7 = this.A0b;
                                    if (A0q[7].length() != 30) {
                                        throw new java.lang.RuntimeException();
                                    }
                                    A0q[7] = "dX5RLaDk9a8QoBSZoba0Fx5WU6iQDF";
                                    byteValue += iArr7[i15];
                                }
                                this.A0b[this.A02 - 1] = ((lacing - this.A06) - i14) - byteValue;
                            }
                        } else {
                            throw new com.facebook.ads.redexgen.core.A0(A03(com.unity3d.mediation.LevelPlayAdError.ERROR_CODE_LOAD_WHILE_SHOW, 38, 70));
                        }
                        this.A0D = this.A0E + A01((this.A0k.A00[0] << 8) | (this.A0k.A00[1] & 255));
                        boolean z2 = (this.A0k.A00[2] & 8) == 8;
                        if (cj.A0Q == 2) {
                            z = true;
                        } else {
                            if (i == 163) {
                                byte[] bArr = this.A0k.A00;
                                java.lang.String[] strArr13 = A0q;
                                if (strArr13[2].charAt(16) != strArr13[6].charAt(16)) {
                                    throw new java.lang.RuntimeException();
                                }
                                A0q[7] = "mTJD45wEFWeykLuF1tHcpapHce5gGu";
                                if ((bArr[2] & 128) == 128) {
                                    z = true;
                                }
                            }
                            z = false;
                        }
                        this.A01 = (z ? 1 : 0) | (z2 ? Integer.MIN_VALUE : 0);
                        this.A04 = 2;
                        this.A03 = 0;
                    }
                    if (i == 163) {
                        while (this.A03 < this.A02) {
                            A08(interfaceC0610By, cj, this.A0b[this.A03]);
                            A0B(cj, this.A0D + ((long) ((this.A03 * cj.A0F) / 1000)));
                            this.A03++;
                        }
                        this.A04 = 0;
                        return;
                    }
                    A08(interfaceC0610By, cj, this.A0b[0]);
                    return;
                }
                throw new java.lang.RuntimeException();
            case 16981:
                this.A0O.A0f = new byte[lacing];
                interfaceC0610By.readFully(this.A0O.A0f, 0, lacing);
                return;
            case 18402:
                byte[] bArr2 = new byte[lacing];
                interfaceC0610By.readFully(bArr2, 0, lacing);
                this.A0O.A0V = new com.facebook.ads.redexgen.core.C8(1, bArr2, 0, 0);
                return;
            case 21419:
                com.facebook.ads.redexgen.core.I4 i16 = this.A0l;
                java.lang.String[] strArr14 = A0q;
                if (strArr14[5].charAt(3) == strArr14[0].charAt(3)) {
                    A0q[3] = "VNV5ZjCLoHGO91ld0HAXM6ewiX5wkEXL";
                    java.util.Arrays.fill(i16.A00, (byte) 0);
                    interfaceC0610By.readFully(this.A0l.A00, 4 - lacing, lacing);
                    this.A0l.A0Y(0);
                    this.A0B = (int) this.A0l.A0M();
                    return;
                }
                break;
            case 25506:
                this.A0O.A0d = new byte[lacing];
                interfaceC0610By.readFully(this.A0O.A0d, 0, lacing);
                return;
            case 30322:
                this.A0O.A0e = new byte[lacing];
                interfaceC0610By.readFully(this.A0O.A0e, 0, lacing);
                return;
            default:
                throw new com.facebook.ads.redexgen.core.A0(A03(862, 15, 63) + i);
        }
        throw new java.lang.RuntimeException();
    }

    public final void A0L(int i, long j) throws com.facebook.ads.redexgen.core.A0 {
        java.lang.String strA03 = A03(0, 14, 36);
        switch (i) {
            case org.objectweb.asm.Opcodes.LXOR /* 131 */:
                this.A0O.A0Q = (int) j;
                return;
            case 136:
                this.A0O.A0Z = j == 1;
                return;
            case 155:
                this.A0C = A01(j);
                return;
            case org.objectweb.asm.Opcodes.IF_ICMPEQ /* 159 */:
                com.facebook.ads.redexgen.core.CJ cj = this.A0O;
                java.lang.String[] strArr = A0q;
                if (strArr[4].length() != strArr[1].length()) {
                    java.lang.String[] strArr2 = A0q;
                    strArr2[5] = "i9uguL91zJnK2yVYCyHqAB59vxZFjl2P";
                    strArr2[0] = "fGsgm4Hoe7bESI0hQ7ztbHh2GgFDcRlr";
                    cj.A0B = (int) j;
                    return;
                }
                break;
            case org.objectweb.asm.Opcodes.ARETURN /* 176 */:
                com.facebook.ads.redexgen.core.CJ cj2 = this.A0O;
                int i2 = (int) j;
                java.lang.String[] strArr3 = A0q;
                if (strArr3[2].charAt(16) == strArr3[6].charAt(16)) {
                    java.lang.String[] strArr4 = A0q;
                    strArr4[4] = "W80lq1iXH9TjQZFEMfH";
                    strArr4[1] = "1TwlxhYaNWr6kTom4YkUw4A2VhQH";
                    cj2.A0R = i2;
                    return;
                }
                break;
            case org.objectweb.asm.Opcodes.PUTSTATIC /* 179 */:
                this.A0Q.A04(A01(j));
                return;
            case org.objectweb.asm.Opcodes.INVOKEDYNAMIC /* 186 */:
                this.A0O.A0J = (int) j;
                return;
            case 215:
                this.A0O.A0N = (int) j;
                return;
            case 231:
                long jA01 = A01(j);
                java.lang.String[] strArr5 = A0q;
                if (strArr5[5].charAt(3) != strArr5[0].charAt(3)) {
                    A0q[3] = "01bhmw6SIf50qa1UvEULm1xpTobjuZdK";
                    this.A0E = jA01;
                    return;
                } else {
                    java.lang.String[] strArr6 = A0q;
                    strArr6[5] = "zc5gYpUx9kUe1cbXfien411w3j0Oc62D";
                    strArr6[0] = "7oEgI3j4aZ7oW1BIigIE5Jd90ipFBRir";
                    this.A0E = jA01;
                    return;
                }
            case 241:
                if (this.A0Z) {
                    return;
                }
                this.A0P.A04(j);
                this.A0Z = true;
                return;
            case 251:
                this.A0W = true;
                return;
            case 16980:
                if (j == 3) {
                    return;
                } else {
                    throw new com.facebook.ads.redexgen.core.A0(A03(296, 16, 65) + j + strA03);
                }
            case 17029:
                if (j >= 1 && j <= 2) {
                    return;
                } else {
                    throw new com.facebook.ads.redexgen.core.A0(A03(377, 19, 42) + j + strA03);
                }
            case 17143:
                if (j == 1) {
                    return;
                } else {
                    throw new com.facebook.ads.redexgen.core.A0(A03(433, 16, 50) + j + strA03);
                }
            case 18401:
                if (j == 5) {
                    return;
                } else {
                    throw new com.facebook.ads.redexgen.core.A0(A03(312, 15, 83) + j + strA03);
                }
            case 18408:
                java.lang.String[] strArr7 = A0q;
                if (strArr7[4].length() != strArr7[1].length()) {
                    A0q[3] = "Wv4RFKmG8mcGFxh8unEsyyCM2rxpQxvN";
                    if (j == 1) {
                        return;
                    }
                } else if (j == 1) {
                    return;
                }
                throw new com.facebook.ads.redexgen.core.A0(A03(52, 22, 77) + j + strA03);
            case 20529:
                if (j == 0) {
                    return;
                } else {
                    throw new com.facebook.ads.redexgen.core.A0(A03(327, 21, 71) + j + strA03);
                }
            case 20530:
                if (j == 1) {
                    return;
                } else {
                    throw new com.facebook.ads.redexgen.core.A0(A03(348, 21, 42) + j + strA03);
                }
            case 21420:
                this.A0I = this.A0K + j;
                return;
            case 21432:
                int layout = (int) j;
                switch (layout) {
                    case 0:
                        this.A0O.A0P = 0;
                        return;
                    case 1:
                        this.A0O.A0P = 2;
                        return;
                    case 3:
                        this.A0O.A0P = 1;
                        return;
                    case 15:
                        this.A0O.A0P = 3;
                        return;
                    default:
                        return;
                }
            case 21680:
                this.A0O.A0I = (int) j;
                return;
            case 21682:
                this.A0O.A0H = (int) j;
                return;
            case 21690:
                this.A0O.A0G = (int) j;
                return;
            case 21930:
                this.A0O.A0a = j == 1;
                return;
            case 21945:
                switch ((int) j) {
                    case 1:
                        this.A0O.A0C = 2;
                        return;
                    case 2:
                        this.A0O.A0C = 1;
                        return;
                    default:
                        return;
                }
            case 21946:
                switch ((int) j) {
                    case 1:
                    case 6:
                    case 7:
                        com.facebook.ads.redexgen.core.CJ cj3 = this.A0O;
                        if (A0q[7].length() == 30) {
                            A0q[3] = "o21GLcMPNJMcED1O2vXu5w77jIlJ8guS";
                            cj3.A0E = 3;
                            return;
                        }
                        break;
                    case 16:
                        com.facebook.ads.redexgen.core.CJ cj4 = this.A0O;
                        if (A0q[7].length() != 30) {
                            A0q[7] = "mXidLWW1i3yrNrPwlFzzUTQJav29FK";
                            cj4.A0E = 6;
                            return;
                        } else {
                            A0q[7] = "3moLrrg0xEs1nAkmqBQAqsfn8DUGij";
                            cj4.A0E = 6;
                            return;
                        }
                    case 18:
                        this.A0O.A0E = 7;
                        return;
                    default:
                        return;
                }
                break;
            case 21947:
                this.A0O.A0b = true;
                switch ((int) j) {
                    case 1:
                        com.facebook.ads.redexgen.core.CJ cj5 = this.A0O;
                        java.lang.String[] strArr8 = A0q;
                        if (strArr8[4].length() != strArr8[1].length()) {
                            A0q[7] = "vpjfNkBO6dSnn0S8dhvELD276wtN1F";
                            cj5.A0D = 1;
                            return;
                        } else {
                            A0q[7] = "pQF6ELdXf0Obpj4fRq0XGpi3v3f9Nm";
                            cj5.A0D = 1;
                            return;
                        }
                    case 2:
                    case 3:
                    case 8:
                    default:
                        return;
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        com.facebook.ads.redexgen.core.CJ cj6 = this.A0O;
                        if (A0q[7].length() == 30) {
                            A0q[3] = "JSeo3PWHalgHTbM2IhwBsXhqeEuSwt71";
                            cj6.A0D = 2;
                            return;
                        }
                        break;
                    case 9:
                        this.A0O.A0D = 6;
                        return;
                }
                break;
            case 21948:
                this.A0O.A0K = (int) j;
                return;
            case 21949:
                this.A0O.A0L = (int) j;
                return;
            case 22186:
                this.A0O.A0S = j;
                return;
            case 22203:
                this.A0O.A0T = j;
                return;
            case 25188:
                this.A0O.A0A = (int) j;
                return;
            case 2352003:
                this.A0O.A0F = (int) j;
                return;
            case 2807729:
                this.A0M = j;
                return;
            default:
                return;
        }
        throw new java.lang.RuntimeException();
    }

    public final void A0M(int i, long j, long j2) throws com.facebook.ads.redexgen.core.A0 {
        switch (i) {
            case org.objectweb.asm.Opcodes.IF_ICMPNE /* 160 */:
                this.A0W = false;
                return;
            case org.objectweb.asm.Opcodes.FRETURN /* 174 */:
                this.A0O = new com.facebook.ads.redexgen.core.CJ(null);
                return;
            case org.objectweb.asm.Opcodes.NEW /* 187 */:
                this.A0Z = false;
                return;
            case 19899:
                this.A0B = -1;
                this.A0I = -1L;
                return;
            case 20533:
                this.A0O.A0c = true;
                return;
            case 21968:
                this.A0O.A0b = true;
                return;
            case 25152:
            default:
                return;
            case 408125543:
                if (this.A0K == -1 || this.A0K == j) {
                    this.A0K = j;
                    this.A0L = j2;
                    return;
                }
                throw new com.facebook.ads.redexgen.core.A0(A03(717, 39, 35));
            case 475249515:
                this.A0Q = new com.facebook.ads.redexgen.core.C0745Hu();
                this.A0P = new com.facebook.ads.redexgen.core.C0745Hu();
                return;
            case 524531317:
                if (this.A0a) {
                    return;
                }
                if (this.A0o && this.A0F != -1) {
                    this.A0Y = true;
                    return;
                } else {
                    this.A0N.AG8(new com.facebook.ads.redexgen.core.C1169Yo(this.A0H));
                    this.A0a = true;
                    return;
                }
        }
    }

    public final void A0N(int i, java.lang.String str) throws com.facebook.ads.redexgen.core.A0 {
        switch (i) {
            case 134:
                this.A0O.A0Y = str;
                return;
            case com.google.firebase.FirebaseError.ERROR_WEAK_PASSWORD /* 17026 */:
                if (A03(com.json.mediationsdk.logger.IronSourceError.ERROR_RV_LOAD_UNEXPECTED_CALLBACK, 4, 120).equals(str) || A03(1016, 8, 120).equals(str)) {
                    return;
                } else {
                    throw new com.facebook.ads.redexgen.core.A0(A03(369, 8, 3) + str + A03(0, 14, 36));
                }
            case 2274716:
                this.A0O.A0g = str;
                return;
            default:
                return;
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0609Bx
    public final void A9D(com.facebook.ads.redexgen.core.InterfaceC0611Bz interfaceC0611Bz) {
        this.A0N = interfaceC0611Bz;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0609Bx
    public final int AEk(com.facebook.ads.redexgen.core.InterfaceC0610By interfaceC0610By, com.facebook.ads.redexgen.core.C4 c4) throws java.lang.InterruptedException, java.io.IOException {
        this.A0V = false;
        boolean zAEm = true;
        while (zAEm && !this.A0V) {
            zAEm = this.A0d.AEm(interfaceC0610By);
            if (zAEm && A0E(c4, interfaceC0610By.A86())) {
                if (A0q[3].charAt(1) == 'J') {
                    throw new java.lang.RuntimeException();
                }
                java.lang.String[] strArr = A0q;
                strArr[2] = "se170HPsCtciHjkeTQyW7DT5ObsxAmwx";
                strArr[6] = "URe0kLdIOILeikJhTJE89Pmrza1tWgxy";
                return 1;
            }
        }
        if (zAEm) {
            return 0;
        }
        int i = 0;
        while (true) {
            android.util.SparseArray<com.facebook.ads.redexgen.core.CJ> sparseArray = this.A0c;
            java.lang.String[] strArr2 = A0q;
            java.lang.String str = strArr2[4];
            java.lang.String str2 = strArr2[1];
            int length = str.length();
            int i2 = str2.length();
            if (length == i2) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr3 = A0q;
            strArr3[2] = "BBxvBeLNC3LYTmo5ThGzIX5hnTuY03sZ";
            strArr3[6] = "mExXYWe8H7ZKtLInTkLjkcCrXDoIOUkG";
            int i3 = sparseArray.size();
            if (i < i3) {
                this.A0c.valueAt(i).A07();
                i++;
            } else {
                return -1;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0609Bx
    public final void AG7(long j, long j2) {
        this.A0E = androidx.media3.common.C.TIME_UNSET;
        this.A04 = 0;
        this.A0d.reset();
        this.A0e.A06();
        A05();
        for (int i = 0; i < i; i++) {
            this.A0c.valueAt(i).A08();
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0609Bx
    public final boolean AGs(com.facebook.ads.redexgen.core.InterfaceC0610By interfaceC0610By) throws java.lang.InterruptedException, java.io.IOException {
        return new com.facebook.ads.redexgen.core.CL().A01(interfaceC0610By);
    }
}
