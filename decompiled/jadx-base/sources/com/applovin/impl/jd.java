package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class jd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f920a;
    public final java.lang.String b;
    public final java.lang.String c;
    public final android.media.MediaCodecInfo.CodecCapabilities d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    private final boolean k;

    private static boolean d(android.media.MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return com.applovin.impl.xp.f1515a >= 21 && e(codecCapabilities);
    }

    private static boolean f(android.media.MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return com.applovin.impl.xp.f1515a >= 21 && g(codecCapabilities);
    }

    private static boolean d(java.lang.String str) {
        return com.applovin.impl.xp.d.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str);
    }

    private static final boolean f(java.lang.String str) {
        return ("OMX.MTK.VIDEO.DECODER.HEVC".equals(str) && "mcv5a".equals(com.applovin.impl.xp.b)) ? false : true;
    }

    jd(java.lang.String str, java.lang.String str2, java.lang.String str3, android.media.MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.f920a = (java.lang.String) com.applovin.impl.b1.a((java.lang.Object) str);
        this.b = str2;
        this.c = str3;
        this.d = codecCapabilities;
        this.h = z;
        this.i = z2;
        this.j = z3;
        this.e = z4;
        this.f = z5;
        this.g = z6;
        this.k = com.applovin.impl.hf.i(str2);
    }

    public java.lang.String toString() {
        return this.f920a;
    }

    public boolean b(int i) {
        android.media.MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
        if (codecCapabilities == null) {
            b("sampleRate.caps");
            return false;
        }
        android.media.MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            b("sampleRate.aCaps");
            return false;
        }
        if (audioCapabilities.isSampleRateSupported(i)) {
            return true;
        }
        b("sampleRate.support, " + i);
        return false;
    }

    private static int a(java.lang.String str, java.lang.String str2, int i) {
        int i2;
        if (i > 1 || ((com.applovin.impl.xp.f1515a >= 26 && i > 0) || androidx.media3.common.MimeTypes.AUDIO_MPEG.equals(str2) || androidx.media3.common.MimeTypes.AUDIO_AMR_NB.equals(str2) || androidx.media3.common.MimeTypes.AUDIO_AMR_WB.equals(str2) || androidx.media3.common.MimeTypes.AUDIO_AAC.equals(str2) || androidx.media3.common.MimeTypes.AUDIO_VORBIS.equals(str2) || androidx.media3.common.MimeTypes.AUDIO_OPUS.equals(str2) || androidx.media3.common.MimeTypes.AUDIO_RAW.equals(str2) || androidx.media3.common.MimeTypes.AUDIO_FLAC.equals(str2) || androidx.media3.common.MimeTypes.AUDIO_ALAW.equals(str2) || androidx.media3.common.MimeTypes.AUDIO_MLAW.equals(str2) || androidx.media3.common.MimeTypes.AUDIO_MSGSM.equals(str2))) {
            return i;
        }
        if (androidx.media3.common.MimeTypes.AUDIO_AC3.equals(str2)) {
            i2 = 6;
        } else {
            i2 = androidx.media3.common.MimeTypes.AUDIO_E_AC3.equals(str2) ? 16 : 30;
        }
        com.applovin.impl.oc.d(androidx.media3.exoplayer.mediacodec.MediaCodecInfo.TAG, "AssumedMaxChannelAdjustment: " + str + ", [" + i + " to " + i2 + com.ironsource.y8.i.e);
        return i2;
    }

    private static boolean c(android.media.MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("adaptive-playback");
    }

    private static boolean g(android.media.MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("tunneled-playback");
    }

    private static boolean e(android.media.MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("secure-playback");
    }

    private static boolean e(java.lang.String str) {
        if (com.applovin.impl.xp.f1515a <= 22) {
            java.lang.String str2 = com.applovin.impl.xp.d;
            if (("ODROID-XU3".equals(str2) || "Nexus 10".equals(str2)) && ("OMX.Exynos.AVC.Decoder".equals(str) || "OMX.Exynos.AVC.Decoder.secure".equals(str))) {
                return true;
            }
        }
        return false;
    }

    public boolean b(com.applovin.impl.e9 e9Var) {
        int i;
        if (!a(e9Var)) {
            return false;
        }
        if (this.k) {
            int i2 = e9Var.r;
            if (i2 <= 0 || (i = e9Var.s) <= 0) {
                return true;
            }
            if (com.applovin.impl.xp.f1515a >= 21) {
                return a(i2, i, e9Var.t);
            }
            boolean z = i2 * i <= com.applovin.impl.md.b();
            if (!z) {
                b("legacyFrameSize, " + e9Var.r + "x" + e9Var.s);
            }
            return z;
        }
        if (com.applovin.impl.xp.f1515a >= 21) {
            int i3 = e9Var.A;
            if (i3 != -1 && !b(i3)) {
                return false;
            }
            int i4 = e9Var.z;
            if (i4 != -1 && !a(i4)) {
                return false;
            }
        }
        return true;
    }

    public boolean b() {
        if (com.applovin.impl.xp.f1515a >= 29 && androidx.media3.common.MimeTypes.VIDEO_VP9.equals(this.b)) {
            for (android.media.MediaCodecInfo.CodecProfileLevel codecProfileLevel : a()) {
                if (codecProfileLevel.profile == 16384) {
                    return true;
                }
            }
        }
        return false;
    }

    private void b(java.lang.String str) {
        com.applovin.impl.oc.a(androidx.media3.exoplayer.mediacodec.MediaCodecInfo.TAG, "NoSupport [" + str + "] [" + this.f920a + ", " + this.b + "] [" + com.applovin.impl.xp.e + com.ironsource.y8.i.e);
    }

    private static boolean b(android.media.MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return com.applovin.impl.xp.f1515a >= 19 && c(codecCapabilities);
    }

    public boolean c(com.applovin.impl.e9 e9Var) {
        if (this.k) {
            return this.e;
        }
        android.util.Pair pairA = com.applovin.impl.md.a(e9Var);
        return pairA != null && ((java.lang.Integer) pairA.first).intValue() == 42;
    }

    private static boolean c(java.lang.String str) {
        return androidx.media3.common.MimeTypes.AUDIO_OPUS.equals(str);
    }

    public android.graphics.Point a(int i, int i2) {
        android.media.MediaCodecInfo.VideoCapabilities videoCapabilities;
        android.media.MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        return a(videoCapabilities, i, i2);
    }

    private static android.graphics.Point a(android.media.MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        return new android.graphics.Point(com.applovin.impl.xp.a(i, widthAlignment) * widthAlignment, com.applovin.impl.xp.a(i2, heightAlignment) * heightAlignment);
    }

    private static boolean a(android.media.MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        android.graphics.Point pointA = a(videoCapabilities, i, i2);
        int i3 = pointA.x;
        int i4 = pointA.y;
        if (d != -1.0d && d >= 1.0d) {
            return videoCapabilities.areSizeAndRateSupported(i3, i4, java.lang.Math.floor(d));
        }
        return videoCapabilities.isSizeSupported(i3, i4);
    }

    public com.applovin.impl.p5 a(com.applovin.impl.e9 e9Var, com.applovin.impl.e9 e9Var2) {
        int i = !com.applovin.impl.xp.a((java.lang.Object) e9Var.m, (java.lang.Object) e9Var2.m) ? 8 : 0;
        if (this.k) {
            if (e9Var.u != e9Var2.u) {
                i |= 1024;
            }
            if (!this.e && (e9Var.r != e9Var2.r || e9Var.s != e9Var2.s)) {
                i |= 512;
            }
            if (!com.applovin.impl.xp.a(e9Var.y, e9Var2.y)) {
                i |= 2048;
            }
            if (d(this.f920a) && !e9Var.a(e9Var2)) {
                i |= 2;
            }
            if (i == 0) {
                return new com.applovin.impl.p5(this.f920a, e9Var, e9Var2, e9Var.a(e9Var2) ? 3 : 2, 0);
            }
        } else {
            if (e9Var.z != e9Var2.z) {
                i |= 4096;
            }
            if (e9Var.A != e9Var2.A) {
                i |= 8192;
            }
            if (e9Var.B != e9Var2.B) {
                i |= 16384;
            }
            if (i == 0 && androidx.media3.common.MimeTypes.AUDIO_AAC.equals(this.b)) {
                android.util.Pair pairA = com.applovin.impl.md.a(e9Var);
                android.util.Pair pairA2 = com.applovin.impl.md.a(e9Var2);
                if (pairA != null && pairA2 != null) {
                    int iIntValue = ((java.lang.Integer) pairA.first).intValue();
                    int iIntValue2 = ((java.lang.Integer) pairA2.first).intValue();
                    if (iIntValue == 42 && iIntValue2 == 42) {
                        return new com.applovin.impl.p5(this.f920a, e9Var, e9Var2, 3, 0);
                    }
                }
            }
            if (!e9Var.a(e9Var2)) {
                i |= 32;
            }
            if (c(this.b)) {
                i |= 2;
            }
            if (i == 0) {
                return new com.applovin.impl.p5(this.f920a, e9Var, e9Var2, 1, 0);
            }
        }
        return new com.applovin.impl.p5(this.f920a, e9Var, e9Var2, 0, i);
    }

    private static android.media.MediaCodecInfo.CodecProfileLevel[] a(android.media.MediaCodecInfo.CodecCapabilities codecCapabilities) {
        int i;
        android.media.MediaCodecInfo.VideoCapabilities videoCapabilities;
        int iIntValue = (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) ? 0 : ((java.lang.Integer) videoCapabilities.getBitrateRange().getUpper()).intValue();
        if (iIntValue >= 180000000) {
            i = 1024;
        } else if (iIntValue >= 120000000) {
            i = 512;
        } else if (iIntValue >= 60000000) {
            i = 256;
        } else if (iIntValue >= 30000000) {
            i = 128;
        } else if (iIntValue >= 18000000) {
            i = 64;
        } else if (iIntValue >= 12000000) {
            i = 32;
        } else if (iIntValue >= 7200000) {
            i = 16;
        } else if (iIntValue >= 3600000) {
            i = 8;
        } else if (iIntValue >= 1800000) {
            i = 4;
        } else {
            i = iIntValue >= 800000 ? 2 : 1;
        }
        android.media.MediaCodecInfo.CodecProfileLevel codecProfileLevel = new android.media.MediaCodecInfo.CodecProfileLevel();
        codecProfileLevel.profile = 1;
        codecProfileLevel.level = i;
        return new android.media.MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
    }

    public android.media.MediaCodecInfo.CodecProfileLevel[] a() {
        android.media.MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        android.media.MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
        return (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) ? new android.media.MediaCodecInfo.CodecProfileLevel[0] : codecProfileLevelArr;
    }

    public boolean a(int i) {
        android.media.MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
        if (codecCapabilities == null) {
            b("channelCount.caps");
            return false;
        }
        android.media.MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            b("channelCount.aCaps");
            return false;
        }
        if (a(this.f920a, this.b, audioCapabilities.getMaxInputChannelCount()) >= i) {
            return true;
        }
        b("channelCount.support, " + i);
        return false;
    }

    public boolean a(com.applovin.impl.e9 e9Var) {
        java.lang.String strB;
        java.lang.String str = e9Var.j;
        if (str == null || this.b == null || (strB = com.applovin.impl.hf.b(str)) == null) {
            return true;
        }
        if (!this.b.equals(strB)) {
            b("codec.mime " + e9Var.j + ", " + strB);
            return false;
        }
        android.util.Pair pairA = com.applovin.impl.md.a(e9Var);
        if (pairA == null) {
            return true;
        }
        int iIntValue = ((java.lang.Integer) pairA.first).intValue();
        int iIntValue2 = ((java.lang.Integer) pairA.second).intValue();
        if (!this.k && iIntValue != 42) {
            return true;
        }
        android.media.MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArrA = a();
        if (com.applovin.impl.xp.f1515a <= 23 && androidx.media3.common.MimeTypes.VIDEO_VP9.equals(this.b) && codecProfileLevelArrA.length == 0) {
            codecProfileLevelArrA = a(this.d);
        }
        for (android.media.MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecProfileLevelArrA) {
            if (codecProfileLevel.profile == iIntValue && codecProfileLevel.level >= iIntValue2) {
                return true;
            }
        }
        b("codec.profileLevel, " + e9Var.j + ", " + strB);
        return false;
    }

    public boolean a(int i, int i2, double d) {
        android.media.MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
        if (codecCapabilities == null) {
            b("sizeAndRate.caps");
            return false;
        }
        android.media.MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            b("sizeAndRate.vCaps");
            return false;
        }
        if (a(videoCapabilities, i, i2, d)) {
            return true;
        }
        if (i < i2 && f(this.f920a) && a(videoCapabilities, i2, i, d)) {
            a("sizeAndRate.rotated, " + i + "x" + i2 + "x" + d);
            return true;
        }
        b("sizeAndRate.support, " + i + "x" + i2 + "x" + d);
        return false;
    }

    public static com.applovin.impl.jd a(java.lang.String str, java.lang.String str2, java.lang.String str3, android.media.MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        return new com.applovin.impl.jd(str, str2, str3, codecCapabilities, z, z2, z3, (z4 || codecCapabilities == null || !b(codecCapabilities) || e(str)) ? false : true, codecCapabilities != null && f(codecCapabilities), z5 || (codecCapabilities != null && d(codecCapabilities)));
    }

    private void a(java.lang.String str) {
        com.applovin.impl.oc.a(androidx.media3.exoplayer.mediacodec.MediaCodecInfo.TAG, "AssumedSupport [" + str + "] [" + this.f920a + ", " + this.b + "] [" + com.applovin.impl.xp.e + com.ironsource.y8.i.e);
    }
}
