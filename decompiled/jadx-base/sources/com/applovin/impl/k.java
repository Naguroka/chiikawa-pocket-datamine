package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f934a = {1, 2, 3, 6};
    private static final int[] b = {androidx.media3.extractor.OpusUtil.SAMPLE_RATE, 44100, 32000};
    private static final int[] c = {24000, 22050, androidx.media3.extractor.AacUtil.AAC_HE_V1_MAX_RATE_BYTES_PER_SECOND};
    private static final int[] d = {2, 1, 2, 3, 3, 4, 4, 5};
    private static final int[] e = {32, 40, 48, 56, 64, 80, 96, 112, 128, org.objectweb.asm.Opcodes.IF_ICMPNE, 192, 224, 256, 320, androidx.media3.exoplayer.RendererCapabilities.DECODER_SUPPORT_MASK, 448, 512, 576, 640};
    private static final int[] f = {69, 87, 104, 121, 139, org.objectweb.asm.Opcodes.FRETURN, 208, 243, 278, 348, com.bytedance.sdk.openadsdk.TTAdConstant.DOWNLOAD_URL_AND_PACKAGE_NAME, 487, 557, 696, 835, 975, com.json.mediationsdk.utils.IronSourceConstants.RV_CALLBACK_AD_CLICKED, 1253, 1393};

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final java.lang.String f935a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;

        private b(java.lang.String str, int i, int i2, int i3, int i4, int i5) {
            this.f935a = str;
            this.b = i;
            this.d = i2;
            this.c = i3;
            this.e = i4;
            this.f = i5;
        }
    }

    public static int b(java.nio.ByteBuffer byteBuffer) {
        if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
            return f934a[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * 256;
        }
        return 1536;
    }

    public static int a(java.nio.ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit() - 10;
        for (int i = iPosition; i <= iLimit; i++) {
            if ((com.applovin.impl.xp.a(byteBuffer, i + 4) & (-2)) == -126718022) {
                return i - iPosition;
            }
        }
        return -1;
    }

    public static com.applovin.impl.e9 b(com.applovin.impl.ah ahVar, java.lang.String str, java.lang.String str2, com.applovin.impl.x6 x6Var) {
        ahVar.g(2);
        int i = b[(ahVar.w() & 192) >> 6];
        int iW = ahVar.w();
        int i2 = d[(iW & 14) >> 1];
        if ((iW & 1) != 0) {
            i2++;
        }
        if (((ahVar.w() & 30) >> 1) > 0 && (2 & ahVar.w()) != 0) {
            i2 += 2;
        }
        return new com.applovin.impl.e9.b().c(str).f((ahVar.a() <= 0 || (ahVar.w() & 1) == 0) ? androidx.media3.common.MimeTypes.AUDIO_E_AC3 : androidx.media3.common.MimeTypes.AUDIO_E_AC3_JOC).c(i2).n(i).a(x6Var).e(str2).a();
    }

    private static int a(int i, int i2) {
        int i3 = i2 / 2;
        if (i < 0) {
            return -1;
        }
        int[] iArr = b;
        if (i >= iArr.length || i2 < 0) {
            return -1;
        }
        int[] iArr2 = f;
        if (i3 >= iArr2.length) {
            return -1;
        }
        int i4 = iArr[i];
        if (i4 == 44100) {
            return (iArr2[i3] + (i2 % 2)) * 2;
        }
        int i5 = e[i3];
        return i4 == 32000 ? i5 * 6 : i5 * 4;
    }

    public static com.applovin.impl.e9 a(com.applovin.impl.ah ahVar, java.lang.String str, java.lang.String str2, com.applovin.impl.x6 x6Var) {
        int i = b[(ahVar.w() & 192) >> 6];
        int iW = ahVar.w();
        int i2 = d[(iW & 56) >> 3];
        if ((iW & 4) != 0) {
            i2++;
        }
        return new com.applovin.impl.e9.b().c(str).f(androidx.media3.common.MimeTypes.AUDIO_AC3).c(i2).n(i).a(x6Var).e(str2).a();
    }

    public static int b(byte[] bArr) {
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
            byte b2 = bArr[7];
            if ((b2 & 254) == 186) {
                return 40 << ((bArr[(b2 & 255) == 187 ? '\t' : '\b'] >> 4) & 7);
            }
        }
        return 0;
    }

    public static com.applovin.impl.k.b a(com.applovin.impl.zg zgVar) {
        int iA;
        int i;
        int i2;
        int i3;
        int i4;
        java.lang.String str;
        int iA2;
        int i5;
        int i6;
        int i7;
        int i8;
        int iE = zgVar.e();
        zgVar.d(40);
        boolean z = zgVar.a(5) > 10;
        zgVar.c(iE);
        int i9 = -1;
        if (z) {
            zgVar.d(16);
            int iA3 = zgVar.a(2);
            if (iA3 == 0) {
                i9 = 0;
            } else if (iA3 == 1) {
                i9 = 1;
            } else if (iA3 == 2) {
                i9 = 2;
            }
            zgVar.d(3);
            iA = (zgVar.a(11) + 1) * 2;
            int iA4 = zgVar.a(2);
            if (iA4 == 3) {
                i = c[zgVar.a(2)];
                i5 = 6;
                iA2 = 3;
            } else {
                iA2 = zgVar.a(2);
                i5 = f934a[iA2];
                i = b[iA4];
            }
            i3 = i5 * 256;
            int iA5 = zgVar.a(3);
            boolean zF = zgVar.f();
            i2 = d[iA5] + (zF ? 1 : 0);
            zgVar.d(10);
            if (zgVar.f()) {
                zgVar.d(8);
            }
            if (iA5 == 0) {
                zgVar.d(5);
                if (zgVar.f()) {
                    zgVar.d(8);
                }
            }
            if (i9 == 1 && zgVar.f()) {
                zgVar.d(16);
            }
            if (zgVar.f()) {
                if (iA5 > 2) {
                    zgVar.d(2);
                }
                if ((iA5 & 1) == 0 || iA5 <= 2) {
                    i7 = 6;
                } else {
                    i7 = 6;
                    zgVar.d(6);
                }
                if ((iA5 & 4) != 0) {
                    zgVar.d(i7);
                }
                if (zF && zgVar.f()) {
                    zgVar.d(5);
                }
                if (i9 == 0) {
                    if (zgVar.f()) {
                        i8 = 6;
                        zgVar.d(6);
                    } else {
                        i8 = 6;
                    }
                    if (iA5 == 0 && zgVar.f()) {
                        zgVar.d(i8);
                    }
                    if (zgVar.f()) {
                        zgVar.d(i8);
                    }
                    int iA6 = zgVar.a(2);
                    if (iA6 == 1) {
                        zgVar.d(5);
                    } else if (iA6 == 2) {
                        zgVar.d(12);
                    } else if (iA6 == 3) {
                        int iA7 = zgVar.a(5);
                        if (zgVar.f()) {
                            zgVar.d(5);
                            if (zgVar.f()) {
                                zgVar.d(4);
                            }
                            if (zgVar.f()) {
                                zgVar.d(4);
                            }
                            if (zgVar.f()) {
                                zgVar.d(4);
                            }
                            if (zgVar.f()) {
                                zgVar.d(4);
                            }
                            if (zgVar.f()) {
                                zgVar.d(4);
                            }
                            if (zgVar.f()) {
                                zgVar.d(4);
                            }
                            if (zgVar.f()) {
                                zgVar.d(4);
                            }
                            if (zgVar.f()) {
                                if (zgVar.f()) {
                                    zgVar.d(4);
                                }
                                if (zgVar.f()) {
                                    zgVar.d(4);
                                }
                            }
                        }
                        if (zgVar.f()) {
                            zgVar.d(5);
                            if (zgVar.f()) {
                                zgVar.d(7);
                                if (zgVar.f()) {
                                    zgVar.d(8);
                                }
                            }
                        }
                        zgVar.d((iA7 + 2) * 8);
                        zgVar.c();
                    }
                    if (iA5 < 2) {
                        if (zgVar.f()) {
                            zgVar.d(14);
                        }
                        if (iA5 == 0 && zgVar.f()) {
                            zgVar.d(14);
                        }
                    }
                    if (zgVar.f()) {
                        if (iA2 == 0) {
                            zgVar.d(5);
                        } else {
                            for (int i10 = 0; i10 < i5; i10++) {
                                if (zgVar.f()) {
                                    zgVar.d(5);
                                }
                            }
                        }
                    }
                }
            }
            if (zgVar.f()) {
                zgVar.d(5);
                if (iA5 == 2) {
                    zgVar.d(4);
                }
                if (iA5 >= 6) {
                    zgVar.d(2);
                }
                if (zgVar.f()) {
                    zgVar.d(8);
                }
                if (iA5 == 0 && zgVar.f()) {
                    zgVar.d(8);
                }
                if (iA4 < 3) {
                    zgVar.g();
                }
            }
            if (i9 == 0 && iA2 != 3) {
                zgVar.g();
            }
            if (i9 == 2 && (iA2 == 3 || zgVar.f())) {
                i6 = 6;
                zgVar.d(6);
            } else {
                i6 = 6;
            }
            str = (zgVar.f() && zgVar.a(i6) == 1 && zgVar.a(8) == 1) ? androidx.media3.common.MimeTypes.AUDIO_E_AC3_JOC : androidx.media3.common.MimeTypes.AUDIO_E_AC3;
            i4 = i9;
        } else {
            zgVar.d(32);
            int iA8 = zgVar.a(2);
            java.lang.String str2 = iA8 == 3 ? null : androidx.media3.common.MimeTypes.AUDIO_AC3;
            iA = a(iA8, zgVar.a(6));
            zgVar.d(8);
            int iA9 = zgVar.a(3);
            if ((iA9 & 1) != 0 && iA9 != 1) {
                zgVar.d(2);
            }
            if ((iA9 & 4) != 0) {
                zgVar.d(2);
            }
            if (iA9 == 2) {
                zgVar.d(2);
            }
            int[] iArr = b;
            i = iA8 < iArr.length ? iArr[iA8] : -1;
            i2 = d[iA9] + (zgVar.f() ? 1 : 0);
            i3 = 1536;
            i4 = -1;
            str = str2;
        }
        return new com.applovin.impl.k.b(str, i4, i2, i, iA, i3);
    }

    public static int a(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (((bArr[5] & 248) >> 3) > 10) {
            return (((bArr[3] & 255) | ((bArr[2] & 7) << 8)) + 1) * 2;
        }
        byte b2 = bArr[4];
        return a((b2 & 192) >> 6, b2 & okio.Utf8.REPLACEMENT_BYTE);
    }

    public static int a(java.nio.ByteBuffer byteBuffer, int i) {
        return 40 << ((byteBuffer.get((byteBuffer.position() + i) + ((byteBuffer.get((byteBuffer.position() + i) + 7) & 255) == 187 ? 9 : 8)) >> 4) & 7);
    }
}
