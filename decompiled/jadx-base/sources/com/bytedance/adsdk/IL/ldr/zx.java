package com.bytedance.adsdk.IL.ldr;

/* JADX INFO: loaded from: classes3.dex */
public class zx {
    private static final android.graphics.PointF bg = new android.graphics.PointF();

    public static boolean bX(float f, float f2, float f3) {
        return f >= f2 && f <= f3;
    }

    public static float bg(float f, float f2, float f3) {
        return f + (f3 * (f2 - f));
    }

    public static int bg(int i, int i2, float f) {
        return (int) (i + (f * (i2 - i)));
    }

    public static android.graphics.PointF bg(android.graphics.PointF pointF, android.graphics.PointF pointF2) {
        return new android.graphics.PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    public static void bg(com.bytedance.adsdk.IL.bX.IL.yDt ydt, android.graphics.Path path) {
        path.reset();
        android.graphics.PointF pointFBg = ydt.bg();
        path.moveTo(pointFBg.x, pointFBg.y);
        bg.set(pointFBg.x, pointFBg.y);
        for (int i = 0; i < ydt.bX().size(); i++) {
            com.bytedance.adsdk.IL.bX.bg bgVar = ydt.bX().get(i);
            android.graphics.PointF pointFBg2 = bgVar.bg();
            android.graphics.PointF pointFIL = bgVar.IL();
            android.graphics.PointF pointFBX = bgVar.bX();
            android.graphics.PointF pointF = bg;
            if (pointFBg2.equals(pointF) && pointFIL.equals(pointFBX)) {
                path.lineTo(pointFBX.x, pointFBX.y);
            } else {
                path.cubicTo(pointFBg2.x, pointFBg2.y, pointFIL.x, pointFIL.y, pointFBX.x, pointFBX.y);
            }
            pointF.set(pointFBX.x, pointFBX.y);
        }
        if (ydt.IL()) {
            path.close();
        }
    }

    static int bg(float f, float f2) {
        return bg((int) f, (int) f2);
    }

    private static int bg(int i, int i2) {
        return i - (i2 * IL(i, i2));
    }

    private static int IL(int i, int i2) {
        int i3 = i / i2;
        return (((i ^ i2) >= 0) || i % i2 == 0) ? i3 : i3 - 1;
    }

    public static int bg(int i, int i2, int i3) {
        return java.lang.Math.max(i2, java.lang.Math.min(i3, i));
    }

    public static float IL(float f, float f2, float f3) {
        return java.lang.Math.max(f2, java.lang.Math.min(f3, f));
    }
}
