package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class Z3 implements com.facebook.ads.redexgen.core.InterfaceC0581At {
    public static boolean A0p;
    public static boolean A0q;
    public static byte[] A0r;
    public static java.lang.String[] A0s = {"t4Cm734G1ZBoSBzvfJuYh", "Dmy7gQRb9w8", "l4mYs0AOLGPZCQ2ag", "2Zh3YzuvljTLmHNyZBM74", "UUZ6L1FPfPRElr6W9S6mi", "GbPTI", "DRH4d", "cvuwXH0lqzE"};
    public float A00;
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
    public long A0E;
    public long A0F;
    public long A0G;
    public long A0H;
    public long A0I;
    public long A0J;
    public long A0K;
    public long A0L;
    public android.media.AudioTrack A0M;
    public android.media.AudioTrack A0N;
    public com.facebook.ads.redexgen.core.A2 A0O;
    public com.facebook.ads.redexgen.core.A2 A0P;
    public com.facebook.ads.redexgen.core.AY A0Q;
    public com.facebook.ads.redexgen.core.InterfaceC0579Ar A0R;
    public java.nio.ByteBuffer A0S;
    public java.nio.ByteBuffer A0T;
    public java.nio.ByteBuffer A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public byte[] A0c;
    public com.facebook.ads.redexgen.core.InterfaceC0568Ag[] A0d;
    public java.nio.ByteBuffer[] A0e;
    public final android.os.ConditionVariable A0f;
    public final com.facebook.ads.redexgen.core.AZ A0g;
    public final com.facebook.ads.redexgen.core.C0587Az A0h;
    public final com.facebook.ads.redexgen.core.Z6 A0i;
    public final com.facebook.ads.redexgen.core.B2 A0j;
    public final com.facebook.ads.redexgen.core.C1178Yx A0k;
    public final java.util.ArrayDeque<com.facebook.ads.redexgen.core.B4> A0l;
    public final boolean A0m;
    public final com.facebook.ads.redexgen.core.InterfaceC0568Ag[] A0n;
    public final com.facebook.ads.redexgen.core.InterfaceC0568Ag[] A0o;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 10
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    private android.media.AudioTrack A0F(int i) {
        return new android.media.AudioTrack(3, 4000, 4, 2, 2, 0, i);
    }

    public static java.lang.String A0I(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A0r, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 40);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A0O() {
        A0r = new byte[]{76, 64, 7, 15, 20, 64, 5, 49, 32, 45, 43, 16, 54, 37, 39, 47, 73, 100, 126, 110, 98, 99, 121, 100, 99, 120, 100, 121, 116, 45, 105, 104, 121, 104, 110, 121, 104, 105, 45, 86, 104, 117, 125, 104, 110, 121, 104, 105, 45, 33, 57, 38, 43, 38, 46, 47, 24, 14, 24, 9, 9, 20, 19, 26, 93, 14, 9, 28, 17, 17, 24, 25, 93, 28, 8, 25, 20, 18, 93, 9, 15, 28, 30, 22, 47, 20, 31, 2, 10, 31, 25, 14, 31, 30, 90, 27, 15, 30, 19, 21, 90, 31, 20, 25, 21, 30, 19, 20, 29, 64, 90, kotlin.io.encoding.Base64.padSymbol, 6, 27, 29, 24, 24, 7, 26, 28, 13, 12, 72, 11, 0, 9, 6, 6, 13, 4, 72, 11, 7, 29, 6, 28, 82, 72, 98, 30, 23, 11, 12, 29, 10, 91, 72, 90, 72};
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01c4, code lost:
    
        if (r10.A08 != 6) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01c6, code lost:
    
        r10.A02 = androidx.media3.datasource.cache.CacheDataSink.DEFAULT_BUFFER_SIZE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01ce, code lost:
    
        if (r10.A08 != 7) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01d0, code lost:
    
        r10.A02 = 49152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01d6, code lost:
    
        r10.A02 = 294912;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0171, code lost:
    
        if (r14 != 0) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0173, code lost:
    
        r10.A02 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0175, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0182, code lost:
    
        if (r14 != 0) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0187, code lost:
    
        if (r10.A0X == false) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0189, code lost:
    
        r2 = android.media.AudioTrack.getMinBufferSize(r13, r5, r10.A08);
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0190, code lost:
    
        if (r2 == (-2)) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0192, code lost:
    
        com.facebook.ads.redexgen.core.AbstractC0730Hf.A04(r4);
        r10.A02 = com.facebook.ads.redexgen.core.IK.A06(r2 * 4, ((int) A07(250000)) * r10.A09, (int) java.lang.Math.max(r2, A07(750000) * ((long) r10.A09)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01ba, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01bf, code lost:
    
        if (r10.A08 == 5) goto L101;
     */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 18 out of bounds for length 18
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    @Override // com.facebook.ads.redexgen.core.InterfaceC0581At
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A4l(int i, int i2, int i3, int i4, int[] iArr, int i5, int i6) throws com.facebook.ads.redexgen.core.C0577Ap {
        int i7;
        boolean z;
        int iA05;
        boolean zA4m = false;
        this.A06 = i3;
        this.A0X = com.facebook.ads.redexgen.core.IK.A0c(i);
        this.A0a = this.A0m && A9P(1073741824) && com.facebook.ads.redexgen.core.IK.A0b(i);
        if (this.A0X) {
            this.A0B = com.facebook.ads.redexgen.core.IK.A05(i, i2);
        }
        int iA7w = i;
        boolean z2 = this.A0X && i != 4;
        this.A0V = z2 && !this.A0a;
        if (z2) {
            this.A0k.A00(i5, i6);
            this.A0i.A00(iArr);
            for (com.facebook.ads.redexgen.core.InterfaceC0568Ag interfaceC0568Ag : A0V()) {
                try {
                    zA4m |= interfaceC0568Ag.A4m(i3, i2, iA7w);
                    if (interfaceC0568Ag.A9L()) {
                        i2 = interfaceC0568Ag.A7v();
                        i3 = interfaceC0568Ag.A7x();
                        iA7w = interfaceC0568Ag.A7w();
                    }
                } catch (com.facebook.ads.redexgen.core.C0567Af e) {
                    throw new com.facebook.ads.redexgen.core.C0577Ap(e);
                }
            }
        }
        switch (i2) {
            case 1:
                i7 = 4;
                break;
            case 2:
                i7 = 12;
                break;
            case 3:
                i7 = 28;
                break;
            case 4:
                i7 = 204;
                break;
            case 5:
                i7 = 220;
                break;
            case 6:
                i7 = 252;
                break;
            case 7:
                i7 = 1276;
                break;
            case 8:
                i7 = com.facebook.ads.redexgen.core.AbstractC05389b.A01;
                break;
            default:
                throw new com.facebook.ads.redexgen.core.C0577Ap(A0I(111, 27, 64) + i2);
        }
        if (com.facebook.ads.redexgen.core.IK.A02 <= 23 && A0I(139, 6, 80).equals(com.facebook.ads.redexgen.core.IK.A03) && A0I(49, 6, 71).equals(com.facebook.ads.redexgen.core.IK.A05)) {
            switch (i2) {
                case 3:
                case 5:
                    i7 = 252;
                    break;
                case 7:
                    i7 = com.facebook.ads.redexgen.core.AbstractC05389b.A01;
                    break;
            }
        }
        if (com.facebook.ads.redexgen.core.IK.A02 > 25 || !A0I(org.objectweb.asm.Opcodes.I2B, 4, 21).equals(com.facebook.ads.redexgen.core.IK.A03) || this.A0X) {
            z = true;
        } else {
            z = true;
            if (i2 == 1) {
                i7 = 12;
            }
        }
        if (!zA4m && A0U() && this.A08 == iA7w && this.A0A == i3 && this.A07 == i7) {
            return;
        }
        reset();
        this.A0Z = z2;
        this.A0A = i3;
        this.A07 = i7;
        this.A08 = iA7w;
        if (this.A0X) {
            int i8 = this.A08;
            java.lang.String[] strArr = A0s;
            if (strArr[2].length() == strArr[0].length()) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A0s;
            strArr2[1] = "9YKTVCpZWk4";
            strArr2[7] = "EYNy9aE7j1F";
            iA05 = com.facebook.ads.redexgen.core.IK.A05(i8, i2);
        } else {
            iA05 = -1;
        }
        this.A09 = iA05;
        java.lang.String[] strArr3 = A0s;
        if (strArr3[3].length() != strArr3[4].length()) {
            java.lang.String[] strArr4 = A0s;
            strArr4[1] = "N3tP4qzYzy6";
            strArr4[7] = "Nd4Agad9zFS";
        } else {
            java.lang.String[] strArr5 = A0s;
            strArr5[2] = "EUcc0rQhStoAQ0tZQ";
            strArr5[0] = "FT6D3MKFXjDdBIgoRTe3w";
        }
    }

    static {
        A0O();
        A0p = false;
        A0q = false;
    }

    public Z3(com.facebook.ads.redexgen.core.AZ az, com.facebook.ads.redexgen.core.B2 b2, boolean z) {
        this.A0g = az;
        this.A0j = (com.facebook.ads.redexgen.core.B2) com.facebook.ads.redexgen.core.AbstractC0730Hf.A01(b2);
        this.A0m = z;
        this.A0f = new android.os.ConditionVariable(true);
        this.A0h = new com.facebook.ads.redexgen.core.C0587Az(new com.facebook.ads.redexgen.core.Z4(this, null));
        this.A0i = new com.facebook.ads.redexgen.core.Z6();
        this.A0k = new com.facebook.ads.redexgen.core.C1178Yx();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Collections.addAll(arrayList, new com.facebook.ads.redexgen.core.Z0(), this.A0i, this.A0k);
        java.util.Collections.addAll(arrayList, b2.A6S());
        this.A0o = (com.facebook.ads.redexgen.core.InterfaceC0568Ag[]) arrayList.toArray(new com.facebook.ads.redexgen.core.InterfaceC0568Ag[arrayList.size()]);
        this.A0n = new com.facebook.ads.redexgen.core.InterfaceC0568Ag[]{new com.facebook.ads.redexgen.core.Z2()};
        this.A00 = 1.0f;
        this.A0D = 0;
        this.A0Q = com.facebook.ads.redexgen.core.AY.A04;
        this.A01 = 0;
        this.A0P = com.facebook.ads.redexgen.core.A2.A05;
        this.A04 = -1;
        this.A0d = new com.facebook.ads.redexgen.core.InterfaceC0568Ag[0];
        this.A0e = new java.nio.ByteBuffer[0];
        this.A0l = new java.util.ArrayDeque<>();
    }

    public Z3(com.facebook.ads.redexgen.core.AZ az, com.facebook.ads.redexgen.core.InterfaceC0568Ag[] interfaceC0568AgArr) {
        this(az, interfaceC0568AgArr, false);
    }

    public Z3(com.facebook.ads.redexgen.core.AZ az, com.facebook.ads.redexgen.core.InterfaceC0568Ag[] interfaceC0568AgArr, boolean z) {
        this(az, new com.facebook.ads.redexgen.core.Z5(interfaceC0568AgArr), z);
    }

    public static int A00(int i, java.nio.ByteBuffer byteBuffer) {
        if (i == 7 || i == 8) {
            return com.facebook.ads.redexgen.core.B6.A00(byteBuffer);
        }
        if (i == 5) {
            return com.facebook.ads.redexgen.core.AV.A00();
        }
        if (i == 6) {
            return com.facebook.ads.redexgen.core.AV.A03(byteBuffer);
        }
        if (i == 14) {
            int iA02 = com.facebook.ads.redexgen.core.AV.A02(byteBuffer);
            if (iA02 == -1) {
                return 0;
            }
            int syncframeOffset = com.facebook.ads.redexgen.core.AV.A04(byteBuffer, iA02);
            return syncframeOffset * 16;
        }
        throw new java.lang.IllegalStateException(A0I(84, 27, 82) + i);
    }

    public static int A01(android.media.AudioTrack audioTrack, java.nio.ByteBuffer byteBuffer, int i) {
        return audioTrack.write(byteBuffer, i, 1);
    }

    private int A02(android.media.AudioTrack audioTrack, java.nio.ByteBuffer byteBuffer, int i, long j) {
        if (this.A0S == null) {
            this.A0S = java.nio.ByteBuffer.allocate(16);
            this.A0S.order(java.nio.ByteOrder.BIG_ENDIAN);
            this.A0S.putInt(1431633921);
        }
        if (this.A03 == 0) {
            this.A0S.putInt(4, i);
            this.A0S.putLong(8, 1000 * j);
            this.A0S.position(0);
            this.A03 = i;
        }
        int result = this.A0S.remaining();
        if (result > 0) {
            int iWrite = audioTrack.write(this.A0S, result, 1);
            if (iWrite < 0) {
                this.A03 = 0;
                java.lang.String[] strArr = A0s;
                java.lang.String str = strArr[5];
                java.lang.String str2 = strArr[6];
                int length = str.length();
                int avSyncHeaderBytesRemaining = str2.length();
                if (length != avSyncHeaderBytesRemaining) {
                    throw new java.lang.RuntimeException();
                }
                java.lang.String[] strArr2 = A0s;
                strArr2[2] = "wdvofg3jRCjWXCeFa";
                strArr2[0] = "UgNyGUdkLeiqvUWu5ibBo";
                return iWrite;
            }
            if (iWrite < result) {
                return 0;
            }
        }
        int iA01 = A01(audioTrack, byteBuffer, i);
        if (iA01 < 0) {
            this.A03 = 0;
            return iA01;
        }
        int avSyncHeaderBytesRemaining2 = this.A03;
        this.A03 = avSyncHeaderBytesRemaining2 - iA01;
        return iA01;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long A03() {
        if (!this.A0X) {
            return this.A0I;
        }
        long j = this.A0J;
        int i = this.A0B;
        java.lang.String[] strArr = A0s;
        if (strArr[3].length() != strArr[4].length()) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A0s;
        strArr2[3] = "MPJfaYuGd4augtfmCZOH8";
        strArr2[4] = "0BEM3uVvtYbq56GldupHk";
        return j / ((long) i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long A04() {
        return this.A0X ? this.A0L / ((long) this.A09) : this.A0K;
    }

    private long A05(long j) {
        return A08(this.A0j.A8O()) + j;
    }

    private long A06(long j) {
        com.facebook.ads.redexgen.core.B4 b4Remove = null;
        while (!this.A0l.isEmpty()) {
            com.facebook.ads.redexgen.core.B4 checkpoint = this.A0l.getFirst();
            if (j < checkpoint.A01) {
                break;
            }
            b4Remove = this.A0l.remove();
        }
        if (b4Remove != null) {
            this.A0P = b4Remove.A02;
            this.A0G = b4Remove.A01;
            this.A0F = b4Remove.A00 - this.A0H;
        }
        if (this.A0P.A01 == 1.0f) {
            return (this.A0F + j) - this.A0G;
        }
        if (this.A0l.isEmpty()) {
            return this.A0F + this.A0j.A7m(j - this.A0G);
        }
        return this.A0F + com.facebook.ads.redexgen.core.IK.A0C(j - this.A0G, this.A0P.A01);
    }

    private long A07(long j) {
        return (((long) this.A0A) * j) / 1000000;
    }

    private long A08(long j) {
        return (1000000 * j) / ((long) this.A0A);
    }

    private long A09(long j) {
        return (1000000 * j) / ((long) this.A06);
    }

    private android.media.AudioTrack A0D() {
        android.media.AudioAttributes audioAttributesA00;
        int audioSessionId;
        if (this.A0b) {
            audioAttributesA00 = new android.media.AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
        } else {
            com.facebook.ads.redexgen.core.AY ay = this.A0Q;
            java.lang.String[] strArr = A0s;
            if (strArr[2].length() == strArr[0].length()) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A0s;
            strArr2[3] = "goXRCtH77jRt5o2HiRu2K";
            strArr2[4] = "TssJQhAfwC6lhctx3HZdA";
            audioAttributesA00 = ay.A00();
        }
        android.media.AudioFormat audioFormatBuild = new android.media.AudioFormat.Builder().setChannelMask(this.A07).setEncoding(this.A08).setSampleRate(this.A0A).build();
        if (this.A01 != 0) {
            audioSessionId = this.A01;
        } else {
            audioSessionId = 0;
        }
        return new android.media.AudioTrack(audioAttributesA00, audioFormatBuild, this.A02, 1, audioSessionId);
    }

    private android.media.AudioTrack A0E() throws com.facebook.ads.redexgen.core.C0578Aq {
        android.media.AudioTrack audioTrack;
        if (com.facebook.ads.redexgen.core.IK.A02 >= 21) {
            audioTrack = A0D();
        } else {
            int iA03 = com.facebook.ads.redexgen.core.IK.A03(this.A0Q.A03);
            int streamType = this.A01;
            if (streamType == 0) {
                audioTrack = new android.media.AudioTrack(iA03, this.A0A, this.A07, this.A08, this.A02, 1);
            } else {
                audioTrack = new android.media.AudioTrack(iA03, this.A0A, this.A07, this.A08, this.A02, 1, this.A01);
            }
        }
        int state = audioTrack.getState();
        if (state == 1) {
            return audioTrack;
        }
        try {
            audioTrack.release();
        } catch (java.lang.Exception unused) {
        }
        throw new com.facebook.ads.redexgen.core.C0578Aq(state, this.A0A, this.A07, this.A02);
    }

    private void A0J() {
        for (int i = 0; i < i; i++) {
            com.facebook.ads.redexgen.core.InterfaceC0568Ag interfaceC0568Ag = this.A0d[i];
            interfaceC0568Ag.flush();
            this.A0e[i] = interfaceC0568Ag.A7u();
        }
    }

    private void A0K() throws com.facebook.ads.redexgen.core.C0578Aq {
        com.facebook.ads.redexgen.core.A2 a2A3x;
        this.A0f.block();
        this.A0M = A0E();
        int audioSessionId = this.A0M.getAudioSessionId();
        if (A0p && com.facebook.ads.redexgen.core.IK.A02 < 21) {
            if (this.A0N != null) {
                int audioSessionId2 = this.A0N.getAudioSessionId();
                if (audioSessionId != audioSessionId2) {
                    A0L();
                }
            }
            if (this.A0N == null) {
                this.A0N = A0F(audioSessionId);
            }
        }
        int audioSessionId3 = this.A01;
        if (audioSessionId3 != audioSessionId) {
            this.A01 = audioSessionId;
            if (this.A0R != null) {
                this.A0R.ABI(audioSessionId);
            }
        }
        if (this.A0V) {
            a2A3x = this.A0j.A3x(this.A0P);
        } else {
            a2A3x = com.facebook.ads.redexgen.core.A2.A05;
        }
        this.A0P = a2A3x;
        A0N();
        com.facebook.ads.redexgen.core.C0587Az c0587Az = this.A0h;
        android.media.AudioTrack audioTrack = this.A0M;
        int i = this.A08;
        int i2 = this.A09;
        int audioSessionId4 = this.A02;
        c0587Az.A0G(audioTrack, i, i2, audioSessionId4);
        A0M();
    }

    private void A0L() {
        if (this.A0N == null) {
            return;
        }
        android.media.AudioTrack audioTrack = this.A0N;
        this.A0N = null;
        new com.facebook.ads.redexgen.core.B1(this, audioTrack).start();
    }

    private void A0M() {
        if (!A0U()) {
            return;
        }
        if (com.facebook.ads.redexgen.core.IK.A02 >= 21) {
            A0Q(this.A0M, this.A00);
        } else {
            A0R(this.A0M, this.A00);
        }
    }

    private void A0N() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.facebook.ads.redexgen.core.InterfaceC0568Ag interfaceC0568Ag : A0V()) {
            java.lang.String[] strArr = A0s;
            if (strArr[5].length() != strArr[6].length()) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A0s;
            strArr2[3] = "vBclGACfTssbiJ4n8qhCW";
            strArr2[4] = "IqJQjehZlhuyKPOSbJGKP";
            if (interfaceC0568Ag.A9L()) {
                arrayList.add(interfaceC0568Ag);
            } else {
                interfaceC0568Ag.flush();
            }
        }
        int count = arrayList.size();
        this.A0d = (com.facebook.ads.redexgen.core.InterfaceC0568Ag[]) arrayList.toArray(new com.facebook.ads.redexgen.core.InterfaceC0568Ag[count]);
        this.A0e = new java.nio.ByteBuffer[count];
        A0J();
    }

    private void A0P(long j) throws com.facebook.ads.redexgen.core.C0580As {
        java.nio.ByteBuffer input;
        int length = this.A0d.length;
        int i = length;
        while (i >= 0) {
            if (i > 0) {
                int count = i - 1;
                input = this.A0e[count];
            } else {
                input = this.A0T != null ? this.A0T : com.facebook.ads.redexgen.core.InterfaceC0568Ag.A00;
            }
            if (i == length) {
                A0S(input, j);
            } else {
                com.facebook.ads.redexgen.core.InterfaceC0568Ag interfaceC0568Ag = this.A0d[i];
                interfaceC0568Ag.AEi(input);
                java.nio.ByteBuffer byteBufferA7u = interfaceC0568Ag.A7u();
                this.A0e[i] = byteBufferA7u;
                if (byteBufferA7u.hasRemaining()) {
                    i++;
                }
            }
            if (input.hasRemaining()) {
                return;
            } else {
                i--;
            }
        }
    }

    public static void A0Q(android.media.AudioTrack audioTrack, float f) {
        audioTrack.setVolume(f);
    }

    public static void A0R(android.media.AudioTrack audioTrack, float f) {
        audioTrack.setStereoVolume(f, f);
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00a3  */
    private void A0S(java.nio.ByteBuffer byteBuffer, long j) throws com.facebook.ads.redexgen.core.C0580As {
        if (!byteBuffer.hasRemaining()) {
            return;
        }
        if (this.A0U != null) {
            com.facebook.ads.redexgen.core.AbstractC0730Hf.A03(this.A0U == byteBuffer);
        } else {
            this.A0U = byteBuffer;
            if (com.facebook.ads.redexgen.core.IK.A02 < 21) {
                int iRemaining = byteBuffer.remaining();
                if (this.A0c != null) {
                    int bytesRemaining = this.A0c.length;
                    if (bytesRemaining < iRemaining) {
                        this.A0c = new byte[iRemaining];
                    }
                } else {
                    this.A0c = new byte[iRemaining];
                }
                int bytesToWrite = byteBuffer.position();
                byteBuffer.get(this.A0c, 0, iRemaining);
                byteBuffer.position(bytesToWrite);
                this.A0C = 0;
            }
        }
        int iRemaining2 = byteBuffer.remaining();
        int bytesWritten = 0;
        if (com.facebook.ads.redexgen.core.IK.A02 < 21) {
            int iA0B = this.A0h.A0B(this.A0L);
            if (iA0B > 0) {
                bytesWritten = this.A0M.write(this.A0c, this.A0C, java.lang.Math.min(iRemaining2, iA0B));
                if (bytesWritten > 0) {
                    this.A0C += bytesWritten;
                    byteBuffer.position(byteBuffer.position() + bytesWritten);
                }
            }
        } else if (!this.A0b) {
            bytesWritten = A01(this.A0M, byteBuffer, iRemaining2);
        } else {
            com.facebook.ads.redexgen.core.AbstractC0730Hf.A04(j != androidx.media3.common.C.TIME_UNSET);
            bytesWritten = A02(this.A0M, byteBuffer, iRemaining2, j);
        }
        this.A0E = android.os.SystemClock.elapsedRealtime();
        if (bytesWritten >= 0) {
            if (this.A0X) {
                this.A0L += (long) bytesWritten;
            }
            if (bytesWritten == iRemaining2) {
                if (!this.A0X) {
                    this.A0K += (long) this.A05;
                }
                this.A0U = null;
                return;
            }
            return;
        }
        throw new com.facebook.ads.redexgen.core.C0580As(bytesWritten);
    }

    private boolean A0T() throws com.facebook.ads.redexgen.core.C0580As {
        boolean z = false;
        if (this.A04 == -1) {
            boolean audioProcessorNeedsEndOfStream = this.A0Z;
            this.A04 = audioProcessorNeedsEndOfStream ? 0 : this.A0d.length;
            z = true;
        }
        while (true) {
            int i = this.A04;
            int length = this.A0d.length;
            java.lang.String[] strArr = A0s;
            if (strArr[5].length() != strArr[6].length()) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A0s;
            strArr2[2] = "dPL4LqCPelyuF995w";
            strArr2[0] = "Xq2i67i3Xt4f88z4gHihD";
            if (i < length) {
                com.facebook.ads.redexgen.core.InterfaceC0568Ag audioProcessor = this.A0d[this.A04];
                if (z) {
                    audioProcessor.AEh();
                }
                A0P(androidx.media3.common.C.TIME_UNSET);
                if (!audioProcessor.A9Q()) {
                    return false;
                }
                z = true;
                this.A04++;
            } else {
                if (this.A0U != null) {
                    A0S(this.A0U, androidx.media3.common.C.TIME_UNSET);
                    if (this.A0U != null) {
                        return false;
                    }
                }
                this.A04 = -1;
                return true;
            }
        }
    }

    private boolean A0U() {
        return this.A0M != null;
    }

    private com.facebook.ads.redexgen.core.InterfaceC0568Ag[] A0V() {
        if (this.A0a) {
            return this.A0n;
        }
        return this.A0o;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0581At
    public final void A5V() {
        if (this.A0b) {
            this.A0b = false;
            this.A01 = 0;
            reset();
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0581At
    public final void A5s(int i) {
        com.facebook.ads.redexgen.core.AbstractC0730Hf.A04(com.facebook.ads.redexgen.core.IK.A02 >= 21);
        if (!this.A0b || this.A01 != i) {
            this.A0b = true;
            this.A01 = i;
            reset();
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0581At
    public final long A72(boolean z) {
        if (!A0U()) {
            return Long.MIN_VALUE;
        }
        int i = this.A0D;
        java.lang.String[] strArr = A0s;
        if (strArr[2].length() == strArr[0].length()) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A0s;
        strArr2[2] = "qIZGNUBvwPES78nSd";
        strArr2[0] = "zLcsMXgFzMqXbvyn8iNvP";
        if (i == 0) {
            return Long.MIN_VALUE;
        }
        long jA0C = this.A0h.A0C(z);
        long positionUs = A04();
        return this.A0H + A05(A06(java.lang.Math.min(jA0C, A08(positionUs))));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0581At
    public final com.facebook.ads.redexgen.core.A2 A85() {
        return this.A0P;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0581At
    public final boolean A8p(java.nio.ByteBuffer byteBuffer, long j) throws com.facebook.ads.redexgen.core.C0580As, com.facebook.ads.redexgen.core.C0578Aq {
        com.facebook.ads.redexgen.core.AbstractC0730Hf.A03(this.A0T == null || byteBuffer == this.A0T);
        if (!A0U()) {
            A0K();
            if (this.A0Y) {
                AEV();
            }
        }
        if (!this.A0h.A0L(A04())) {
            return false;
        }
        java.nio.ByteBuffer byteBuffer2 = this.A0T;
        java.lang.String strA0I = A0I(6, 10, 108);
        if (byteBuffer2 == null) {
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            if (!this.A0X && this.A05 == 0) {
                this.A05 = A00(this.A08, byteBuffer);
                if (this.A05 == 0) {
                    return true;
                }
            }
            if (this.A0O != null) {
                if (!A0T()) {
                    return false;
                }
                com.facebook.ads.redexgen.core.A2 a2 = this.A0O;
                this.A0O = null;
                this.A0l.add(new com.facebook.ads.redexgen.core.B4(this.A0j.A3x(a2), java.lang.Math.max(0L, j), A08(A04()), null));
                A0N();
            }
            if (this.A0D == 0) {
                this.A0H = java.lang.Math.max(0L, j);
                this.A0D = 1;
            } else {
                long expectedPresentationTimeUs = this.A0H + A09(A03());
                if (this.A0D == 1 && java.lang.Math.abs(expectedPresentationTimeUs - j) > 200000) {
                    android.util.Log.e(strA0I, A0I(16, 33, 37) + expectedPresentationTimeUs + A0I(0, 6, 72) + j + A0I(138, 1, 23));
                    this.A0D = 2;
                }
                if (this.A0D == 2) {
                    this.A0H += j - expectedPresentationTimeUs;
                    this.A0D = 1;
                    if (this.A0R != null) {
                        com.facebook.ads.redexgen.core.InterfaceC0579Ar interfaceC0579Ar = this.A0R;
                        java.lang.String[] strArr = A0s;
                        if (strArr[3].length() != strArr[4].length()) {
                            throw new java.lang.RuntimeException();
                        }
                        java.lang.String[] strArr2 = A0s;
                        strArr2[2] = "GNfkWkIOSoa9yovb6";
                        strArr2[0] = "Q7LeOkpUea2dWONG5VwgU";
                        interfaceC0579Ar.AD9();
                    }
                }
            }
            if (this.A0X) {
                this.A0J += (long) byteBuffer.remaining();
            } else {
                this.A0I += (long) this.A05;
            }
            this.A0T = byteBuffer;
        }
        if (!this.A0Z) {
            A0S(this.A0T, j);
        } else {
            A0P(j);
        }
        if (!this.A0T.hasRemaining()) {
            this.A0T = null;
            return true;
        }
        if (this.A0h.A0K(A04())) {
            android.util.Log.w(strA0I, A0I(55, 29, 85));
            reset();
            return true;
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0581At
    public final void A8s() {
        if (this.A0D == 1) {
            this.A0D = 2;
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0581At
    public final boolean A8y() {
        return A0U() && this.A0h.A0J(A04());
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0581At
    public final boolean A9P(int i) {
        if (com.facebook.ads.redexgen.core.IK.A0c(i)) {
            return i != 4 || com.facebook.ads.redexgen.core.IK.A02 >= 21;
        }
        if (this.A0g != null) {
            boolean zA04 = this.A0g.A04(i);
            java.lang.String[] strArr = A0s;
            if (strArr[2].length() == strArr[0].length()) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A0s;
            strArr2[2] = "CXIqBidM6dH7rAKwS";
            strArr2[0] = "lSgEtHU3xwjUl8rjmAKEf";
            if (zA04) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0581At
    public final boolean A9Q() {
        if (A0U()) {
            boolean z = this.A0W;
            java.lang.String[] strArr = A0s;
            if (strArr[2].length() == strArr[0].length()) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A0s;
            strArr2[5] = "E9yrX";
            strArr2[6] = "x1eL6";
            if (!z || A8y()) {
                return false;
            }
        }
        return true;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0581At
    public final void AEV() {
        this.A0Y = true;
        if (A0U()) {
            this.A0h.A0E();
            this.A0M.play();
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0581At
    public final void AEW() throws com.facebook.ads.redexgen.core.C0580As {
        if (!this.A0W && A0U() && A0T()) {
            this.A0h.A0F(A04());
            this.A0M.stop();
            this.A03 = 0;
            this.A0W = true;
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0581At
    public final void AEy() {
        reset();
        A0L();
        for (com.facebook.ads.redexgen.core.InterfaceC0568Ag interfaceC0568Ag : this.A0o) {
            interfaceC0568Ag.reset();
        }
        for (com.facebook.ads.redexgen.core.InterfaceC0568Ag interfaceC0568Ag2 : this.A0n) {
            interfaceC0568Ag2.reset();
        }
        this.A01 = 0;
        this.A0Y = false;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0581At
    public final void AGI(com.facebook.ads.redexgen.core.AY ay) {
        if (this.A0Q.equals(ay)) {
            return;
        }
        this.A0Q = ay;
        if (this.A0b) {
            return;
        }
        reset();
        this.A01 = 0;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0581At
    public final void AGU(com.facebook.ads.redexgen.core.InterfaceC0579Ar interfaceC0579Ar) {
        this.A0R = interfaceC0579Ar;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0581At
    public final com.facebook.ads.redexgen.core.A2 AGa(com.facebook.ads.redexgen.core.A2 a2) {
        com.facebook.ads.redexgen.core.A2 lastSetPlaybackParameters;
        if (A0U() && !this.A0V) {
            this.A0P = com.facebook.ads.redexgen.core.A2.A05;
            return this.A0P;
        }
        if (this.A0O != null) {
            lastSetPlaybackParameters = this.A0O;
        } else if (!this.A0l.isEmpty()) {
            lastSetPlaybackParameters = this.A0l.getLast().A02;
        } else {
            lastSetPlaybackParameters = this.A0P;
        }
        if (!a2.equals(lastSetPlaybackParameters)) {
            if (A0U()) {
                this.A0O = a2;
            } else {
                com.facebook.ads.redexgen.core.A2 lastSetPlaybackParameters2 = this.A0j.A3x(a2);
                this.A0P = lastSetPlaybackParameters2;
            }
        }
        com.facebook.ads.redexgen.core.A2 lastSetPlaybackParameters3 = this.A0P;
        return lastSetPlaybackParameters3;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0581At
    public final void pause() {
        this.A0Y = false;
        if (A0U() && this.A0h.A0I()) {
            android.media.AudioTrack audioTrack = this.A0M;
            java.lang.String[] strArr = A0s;
            if (strArr[1].length() != strArr[7].length()) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A0s;
            strArr2[5] = "Aocfm";
            strArr2[6] = "G14Pt";
            audioTrack.pause();
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0071  */
    @Override // com.facebook.ads.redexgen.core.InterfaceC0581At
    public final void reset() {
        if (A0U()) {
            this.A0J = 0L;
            this.A0I = 0L;
            this.A0L = 0L;
            this.A0K = 0L;
            this.A05 = 0;
            if (this.A0O != null) {
                this.A0P = this.A0O;
                java.lang.String[] strArr = A0s;
                if (strArr[2].length() == strArr[0].length()) {
                    throw new java.lang.RuntimeException();
                }
                java.lang.String[] strArr2 = A0s;
                strArr2[2] = "ZTIDfQpd4HDVI6hTK";
                strArr2[0] = "cfHGChZk6uhr4DLomEqFb";
                this.A0O = null;
            } else if (!this.A0l.isEmpty()) {
                this.A0P = this.A0l.getLast().A02;
            }
            this.A0l.clear();
            this.A0F = 0L;
            this.A0G = 0L;
            java.lang.String[] strArr3 = A0s;
            if (strArr3[5].length() != strArr3[6].length()) {
                this.A0T = null;
                this.A0U = null;
                A0J();
                this.A0W = false;
                this.A04 = -1;
                this.A0S = null;
                this.A03 = 0;
                this.A0D = 0;
                if (this.A0h.A0H()) {
                    this.A0M.pause();
                }
            } else {
                java.lang.String[] strArr4 = A0s;
                strArr4[3] = "Yo69kelq6UGKf7OeAKyxx";
                strArr4[4] = "oDJXE0uB3cUDHD8ob32Qx";
                this.A0T = null;
                this.A0U = null;
                A0J();
                this.A0W = false;
                this.A04 = -1;
                this.A0S = null;
                this.A03 = 0;
                this.A0D = 0;
                if (this.A0h.A0H()) {
                    this.A0M.pause();
                }
            }
            android.media.AudioTrack audioTrack = this.A0M;
            this.A0M = null;
            this.A0h.A0D();
            this.A0f.close();
            new com.facebook.ads.redexgen.core.B0(this, audioTrack).start();
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0581At
    public final void setVolume(float f) {
        if (this.A00 != f) {
            this.A00 = f;
            A0M();
        }
    }
}
