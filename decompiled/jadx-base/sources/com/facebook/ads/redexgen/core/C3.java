package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C3 {
    public static byte[] A07;
    public static java.lang.String[] A08 = {"6kStEXL0N53GFq3V1gqexDowqRHYGeCf", "GvacQN", "vwcu66U", "A1GXyDBA", "87T5d6sd1ik", "wZXLMf", "Pesi6L7S5NgS5H9VNXNfznCxhERgloSD", "i5d"};
    public static final int[] A09;
    public static final int[] A0A;
    public static final int[] A0B;
    public static final int[] A0C;
    public static final int[] A0D;
    public static final int[] A0E;
    public static final java.lang.String[] A0F;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public java.lang.String A06;

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 6);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A02() {
        A07 = new byte[]{87, 67, 82, 95, 89, 25, 91, 70, 83, 81, 24, 12, 29, 16, 22, 86, 20, 9, 28, 30, 84, 53, 72, 66, 86, 71, 74, 76, 12, 78, 83, 70, 68, 14, 111, 17};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 18 out of bounds for length 18
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:147)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static boolean A04(int i, com.facebook.ads.redexgen.core.C3 c3) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        if ((i & (-2097152)) != -2097152) {
            return false;
        }
        int i7 = (i >>> 19) & 3;
        if (A08[4].length() == 11) {
            java.lang.String[] strArr = A08;
            strArr[0] = "RiUw1eqoDvBahj8V6TDcRS8iwH7eOScG";
            strArr[6] = "kmp5wJKEvw6YmujV2HYKRga0mutSjdRV";
            if (i7 == 1) {
                return false;
            }
            int i8 = (i >>> 17) & 3;
            java.lang.String[] strArr2 = A08;
            if (strArr2[2].length() == strArr2[3].length()) {
                throw new java.lang.RuntimeException();
            }
            A08[7] = "sO7yywxLPUYvKcLMkDALEGxaOlT";
            if (i8 == 0 || (i2 = (i >>> 12) & 15) == 0 || i2 == 15 || (i3 = (i >>> 10) & 3) == 3) {
                return false;
            }
            int i9 = A0E[i3];
            if (i7 == 2) {
                i9 /= 2;
            } else if (i7 == 0) {
                i9 /= 4;
            }
            int i10 = i >>> 9;
            if (A08[4].length() == 11) {
                java.lang.String[] strArr3 = A08;
                strArr3[0] = "VOyNOfFo7BnWiNbVlgRj6mnxWRwbIkpB";
                strArr3[6] = "81RrLaAoVLspvvFVdtLQ2olTPTjFw09L";
                int i11 = i10 & 1;
                if (i8 == 3) {
                    i4 = i7 == 3 ? A09[i2 - 1] : A0D[i2 - 1];
                    i6 = (((i4 * 12000) / i9) + i11) * 4;
                    i5 = androidx.media3.exoplayer.RendererCapabilities.DECODER_SUPPORT_MASK;
                    java.lang.String[] strArr4 = A08;
                    if (strArr4[2].length() == strArr4[3].length()) {
                        throw new java.lang.RuntimeException();
                    }
                    java.lang.String[] strArr5 = A08;
                    strArr5[2] = "h6mf2Ke";
                    strArr5[3] = "gfVBXOvo";
                } else {
                    if (i7 == 3) {
                        i4 = i8 == 2 ? A0A[i2 - 1] : A0B[i2 - 1];
                        i5 = 1152;
                        i6 = ((144000 * i4) / i9) + i11;
                    } else {
                        i4 = A0C[i2 - 1];
                        i5 = i8 == 1 ? 576 : 1152;
                        i6 = (((i8 == 1 ? 72000 : 144000) * i4) / i9) + i11;
                    }
                }
                c3.A03(i7, A0F[3 - i8], i6, i9, ((i >> 6) & 3) == 3 ? 1 : 2, i4 * 1000, i5);
                return true;
            }
        }
        throw new java.lang.RuntimeException();
    }

    static {
        A02();
        A0F = new java.lang.String[]{A01(10, 13, 127), A01(23, 13, 37), A01(0, 10, 48)};
        A0E = new int[]{44100, androidx.media3.extractor.OpusUtil.SAMPLE_RATE, 32000};
        A09 = new int[]{32, 64, 96, 128, org.objectweb.asm.Opcodes.IF_ICMPNE, 192, 224, 256, 288, 320, 352, androidx.media3.exoplayer.RendererCapabilities.DECODER_SUPPORT_MASK, 416, 448};
        A0D = new int[]{32, 48, 56, 64, 80, 96, 112, 128, org.objectweb.asm.Opcodes.D2F, org.objectweb.asm.Opcodes.IF_ICMPNE, org.objectweb.asm.Opcodes.ARETURN, 192, 224, 256};
        A0A = new int[]{32, 48, 56, 64, 80, 96, 112, 128, org.objectweb.asm.Opcodes.IF_ICMPNE, 192, 224, 256, 320, androidx.media3.exoplayer.RendererCapabilities.DECODER_SUPPORT_MASK};
        A0B = new int[]{32, 40, 48, 56, 64, 80, 96, 112, 128, org.objectweb.asm.Opcodes.IF_ICMPNE, 192, 224, 256, 320};
        A0C = new int[]{8, 16, 24, 32, 40, 48, 56, 64, 80, 96, 112, 128, org.objectweb.asm.Opcodes.D2F, org.objectweb.asm.Opcodes.IF_ICMPNE};
    }

    public static int A00(int i) {
        int padding;
        int bitrateIndex;
        int layer;
        int i2;
        int i3;
        int version;
        if ((i & (-2097152)) != -2097152 || (padding = (i >>> 19) & 3) == 1 || (bitrateIndex = (i >>> 17) & 3) == 0 || (layer = (i >>> 12) & 15) == 0 || layer == 15 || (i2 = (i >>> 10) & 3) == 3) {
            return -1;
        }
        int i4 = A0E[i2];
        if (A08[4].length() == 11) {
            java.lang.String[] strArr = A08;
            strArr[0] = "SACavNzUqDihaCCVBwhZqH9dgMV7CCgo";
            strArr[6] = "NGXmQ6vSzJX8uyjVaek6YMFly75gW1GO";
            if (padding == 2) {
                i4 /= 2;
            } else if (padding == 0) {
                i4 /= 4;
            }
            int i5 = (i >>> 9) & 1;
            if (bitrateIndex == 3) {
                if (padding == 3) {
                    int[] iArr = A09;
                    java.lang.String[] strArr2 = A08;
                    java.lang.String str = strArr2[2];
                    java.lang.String str2 = strArr2[3];
                    int length = str.length();
                    int version2 = str2.length();
                    if (length != version2) {
                        java.lang.String[] strArr3 = A08;
                        strArr3[1] = "i4D7hx";
                        strArr3[5] = "J2Oys6";
                        int version3 = layer - 1;
                        version = iArr[version3];
                    } else {
                        int version4 = layer - 1;
                        version = iArr[version4];
                    }
                } else {
                    int[] iArr2 = A0D;
                    int layer2 = layer - 1;
                    java.lang.String[] strArr4 = A08;
                    java.lang.String str3 = strArr4[1];
                    java.lang.String str4 = strArr4[5];
                    int bitrate = str3.length();
                    int version5 = str4.length();
                    if (bitrate == version5) {
                        java.lang.String[] strArr5 = A08;
                        strArr5[0] = "C0vPmVzFtdLa424VF7oLSPXdFv7JPKYl";
                        strArr5[6] = "qJ70LKr8xHxcQctVJa4tIMefqwiAYJOB";
                        version = iArr2[layer2];
                    }
                }
                return (((version * 12000) / i4) + i5) * 4;
            }
            if (padding == 3) {
                if (bitrateIndex == 2) {
                    int version6 = layer - 1;
                    i3 = A0A[version6];
                } else {
                    int version7 = layer - 1;
                    i3 = A0B[version7];
                }
            } else {
                int[] iArr3 = A0C;
                java.lang.String[] strArr6 = A08;
                java.lang.String str5 = strArr6[2];
                java.lang.String str6 = strArr6[3];
                int length2 = str5.length();
                int version8 = str6.length();
                if (length2 != version8) {
                    A08[4] = "atDS8UAgb8L";
                    int version9 = layer - 1;
                    i3 = iArr3[version9];
                }
            }
            if (padding == 3) {
                int version10 = 144000 * i3;
                return (version10 / i4) + i5;
            }
            int version11 = bitrateIndex == 1 ? 72000 : 144000;
            return ((version11 * i3) / i4) + i5;
        }
        throw new java.lang.RuntimeException();
    }

    private void A03(int i, java.lang.String str, int i2, int i3, int i4, int i5, int i6) {
        this.A05 = i;
        this.A06 = str;
        this.A02 = i2;
        this.A03 = i3;
        this.A01 = i4;
        this.A00 = i5;
        this.A04 = i6;
    }
}
