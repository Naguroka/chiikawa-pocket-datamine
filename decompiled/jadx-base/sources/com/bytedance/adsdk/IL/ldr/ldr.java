package com.bytedance.adsdk.IL.ldr;

/* JADX INFO: loaded from: classes3.dex */
public final class ldr {
    private static final java.lang.ThreadLocal<android.graphics.PathMeasure> bg = new java.lang.ThreadLocal<android.graphics.PathMeasure>() { // from class: com.bytedance.adsdk.IL.ldr.ldr.1
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: bg, reason: merged with bridge method [inline-methods] */
        public android.graphics.PathMeasure initialValue() {
            return new android.graphics.PathMeasure();
        }
    };
    private static final java.lang.ThreadLocal<android.graphics.Path> IL = new java.lang.ThreadLocal<android.graphics.Path>() { // from class: com.bytedance.adsdk.IL.ldr.ldr.2
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: bg, reason: merged with bridge method [inline-methods] */
        public android.graphics.Path initialValue() {
            return new android.graphics.Path();
        }
    };
    private static final java.lang.ThreadLocal<android.graphics.Path> bX = new java.lang.ThreadLocal<android.graphics.Path>() { // from class: com.bytedance.adsdk.IL.ldr.ldr.3
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: bg, reason: merged with bridge method [inline-methods] */
        public android.graphics.Path initialValue() {
            return new android.graphics.Path();
        }
    };
    private static final java.lang.ThreadLocal<float[]> eqN = new java.lang.ThreadLocal<float[]>() { // from class: com.bytedance.adsdk.IL.ldr.ldr.4
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: bg, reason: merged with bridge method [inline-methods] */
        public float[] initialValue() {
            return new float[4];
        }
    };
    private static final float zx = (float) (java.lang.Math.sqrt(2.0d) / 2.0d);

    public static int bg(float f, float f2, float f3, float f4) {
        int i = f != 0.0f ? (int) (f * 527.0f) : 17;
        if (f2 != 0.0f) {
            i = (int) (i * 31 * f2);
        }
        if (f3 != 0.0f) {
            i = (int) (i * 31 * f3);
        }
        return f4 != 0.0f ? (int) (i * 31 * f4) : i;
    }

    public static boolean bg(int i, int i2, int i3, int i4, int i5, int i6) {
        if (i < i4) {
            return false;
        }
        if (i > i4) {
            return true;
        }
        if (i2 < i5) {
            return false;
        }
        return i2 > i5 || i3 >= i6;
    }

    public static android.graphics.Path bg(android.graphics.PointF pointF, android.graphics.PointF pointF2, android.graphics.PointF pointF3, android.graphics.PointF pointF4) {
        android.graphics.Path path = new android.graphics.Path();
        path.moveTo(pointF.x, pointF.y);
        if (pointF3 != null && pointF4 != null && (pointF3.length() != 0.0f || pointF4.length() != 0.0f)) {
            path.cubicTo(pointF3.x + pointF.x, pointF.y + pointF3.y, pointF2.x + pointF4.x, pointF2.y + pointF4.y, pointF2.x, pointF2.y);
        } else {
            path.lineTo(pointF2.x, pointF2.y);
        }
        return path;
    }

    public static void bg(java.io.Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (java.lang.RuntimeException e) {
                throw e;
            } catch (java.lang.Exception unused) {
            }
        }
    }

    public static float bg(android.graphics.Matrix matrix) {
        float[] fArr = eqN.get();
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        float f = zx;
        fArr[2] = f;
        fArr[3] = f;
        matrix.mapPoints(fArr);
        return (float) java.lang.Math.hypot(fArr[2] - fArr[0], fArr[3] - fArr[1]);
    }

    public static boolean IL(android.graphics.Matrix matrix) {
        float[] fArr = eqN.get();
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        fArr[2] = 37394.73f;
        fArr[3] = 39575.234f;
        matrix.mapPoints(fArr);
        return fArr[0] == fArr[2] || fArr[1] == fArr[3];
    }

    public static void bg(android.graphics.Path path, com.bytedance.adsdk.IL.bg.bg.tC tCVar) {
        if (tCVar == null || tCVar.ldr()) {
            return;
        }
        bg(path, ((com.bytedance.adsdk.IL.bg.IL.eqN) tCVar.bX()).WR() / 100.0f, ((com.bytedance.adsdk.IL.bg.IL.eqN) tCVar.eqN()).WR() / 100.0f, ((com.bytedance.adsdk.IL.bg.IL.eqN) tCVar.zx()).WR() / 360.0f);
    }

    public static void bg(android.graphics.Path path, float f, float f2, float f3) {
        com.bytedance.adsdk.IL.zx.bg("applyTrimPathIfNeeded");
        android.graphics.PathMeasure pathMeasure = bg.get();
        android.graphics.Path path2 = IL.get();
        android.graphics.Path path3 = bX.get();
        pathMeasure.setPath(path, false);
        float length = pathMeasure.getLength();
        if (f == 1.0f && f2 == 0.0f) {
            com.bytedance.adsdk.IL.zx.IL("applyTrimPathIfNeeded");
            return;
        }
        if (length < 1.0f || java.lang.Math.abs((f2 - f) - 1.0f) < 0.01d) {
            com.bytedance.adsdk.IL.zx.IL("applyTrimPathIfNeeded");
            return;
        }
        float f4 = f * length;
        float f5 = f2 * length;
        float f6 = f3 * length;
        float fMin = java.lang.Math.min(f4, f5) + f6;
        float fMax = java.lang.Math.max(f4, f5) + f6;
        if (fMin >= length && fMax >= length) {
            fMin = com.bytedance.adsdk.IL.ldr.zx.bg(fMin, length);
            fMax = com.bytedance.adsdk.IL.ldr.zx.bg(fMax, length);
        }
        if (fMin < 0.0f) {
            fMin = com.bytedance.adsdk.IL.ldr.zx.bg(fMin, length);
        }
        if (fMax < 0.0f) {
            fMax = com.bytedance.adsdk.IL.ldr.zx.bg(fMax, length);
        }
        if (fMin == fMax) {
            path.reset();
            com.bytedance.adsdk.IL.zx.IL("applyTrimPathIfNeeded");
            return;
        }
        if (fMin >= fMax) {
            fMin -= length;
        }
        path2.reset();
        pathMeasure.getSegment(fMin, fMax, path2, true);
        if (fMax > length) {
            path3.reset();
            pathMeasure.getSegment(0.0f, fMax % length, path3, true);
            path2.addPath(path3);
        } else if (fMin < 0.0f) {
            path3.reset();
            pathMeasure.getSegment(fMin + length, length, path3, true);
            path2.addPath(path3);
        }
        path.set(path2);
        com.bytedance.adsdk.IL.zx.IL("applyTrimPathIfNeeded");
    }

    public static float bg() {
        return android.content.res.Resources.getSystem().getDisplayMetrics().density;
    }

    public static float bg(android.content.Context context) {
        return android.provider.Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
    }

    public static android.graphics.Bitmap bg(android.graphics.Bitmap bitmap, int i, int i2) {
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        android.graphics.Bitmap bitmapCreateScaledBitmap = android.graphics.Bitmap.createScaledBitmap(bitmap, i, i2, true);
        bitmap.recycle();
        return bitmapCreateScaledBitmap;
    }

    public static boolean bg(java.lang.Throwable th) {
        return (th instanceof java.net.SocketException) || (th instanceof java.nio.channels.ClosedChannelException) || (th instanceof java.io.InterruptedIOException) || (th instanceof java.net.ProtocolException) || (th instanceof javax.net.ssl.SSLException) || (th instanceof java.net.UnknownHostException) || (th instanceof java.net.UnknownServiceException);
    }

    public static void bg(android.graphics.Canvas canvas, android.graphics.RectF rectF, android.graphics.Paint paint) {
        bg(canvas, rectF, paint, 31);
    }

    public static void bg(android.graphics.Canvas canvas, android.graphics.RectF rectF, android.graphics.Paint paint, int i) {
        com.bytedance.adsdk.IL.zx.bg("Utils#saveLayer");
        canvas.saveLayer(rectF, paint);
        com.bytedance.adsdk.IL.zx.IL("Utils#saveLayer");
    }
}
