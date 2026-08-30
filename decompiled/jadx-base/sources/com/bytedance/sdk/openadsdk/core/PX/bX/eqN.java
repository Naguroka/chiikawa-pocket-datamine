package com.bytedance.sdk.openadsdk.core.PX.bX;

/* JADX INFO: loaded from: classes4.dex */
public class eqN {
    public static final java.util.List<java.lang.String> bg = java.util.Arrays.asList(androidx.media3.common.MimeTypes.VIDEO_MP4, androidx.media3.common.MimeTypes.VIDEO_H263);

    public static double bg(int i, double d, int i2, int i3, int i4, java.lang.String str) {
        double dBg = bg(i, d, i2, i3);
        return bg(str) * (1.0d / ((dBg + 1.0d) + bg(i4)));
    }

    private static double bg(int i, double d, int i2, int i3) {
        return (d > 0.0d ? java.lang.Math.abs(d - (i3 > 0 ? ((double) i2) / ((double) i3) : 0.0d)) : 0.0d) + (i > 0 ? java.lang.Math.abs((i - i2) / i) : 0.0d);
    }

    private static double bg(int i) {
        int iMax = java.lang.Math.max(i, 0);
        if (700 > iMax || iMax > 1500) {
            return java.lang.Math.min(java.lang.Math.abs(700 - iMax) / 700.0f, java.lang.Math.abs(1500 - iMax) / 1500.0f);
        }
        return 0.0d;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0027  */
    private static double bg(java.lang.String str) {
        byte b;
        if (str == null) {
            str = "";
        }
        int iHashCode = str.hashCode();
        if (iHashCode != -1664118616) {
            if (iHashCode == 1331848029 && str.equals(androidx.media3.common.MimeTypes.VIDEO_MP4)) {
                b = 0;
            } else {
                b = -1;
            }
        } else if (str.equals(androidx.media3.common.MimeTypes.VIDEO_H263)) {
            b = 1;
        } else {
            b = -1;
        }
        return b != 0 ? 1.0d : 1.5d;
    }
}
