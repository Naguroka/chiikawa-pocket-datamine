package com.bytedance.adsdk.IL.zx;

/* JADX INFO: loaded from: classes3.dex */
class LZ {
    private static android.util.SparseArray<java.lang.ref.WeakReference<android.view.animation.Interpolator>> IL;
    private static final android.view.animation.Interpolator bg = new android.view.animation.LinearInterpolator();

    LZ() {
    }

    private static android.util.SparseArray<java.lang.ref.WeakReference<android.view.animation.Interpolator>> bg() {
        if (IL == null) {
            IL = new android.util.SparseArray<>();
        }
        return IL;
    }

    private static java.lang.ref.WeakReference<android.view.animation.Interpolator> bg(int i) {
        java.lang.ref.WeakReference<android.view.animation.Interpolator> weakReference;
        synchronized (com.bytedance.adsdk.IL.zx.LZ.class) {
            weakReference = bg().get(i);
        }
        return weakReference;
    }

    private static void bg(int i, java.lang.ref.WeakReference<android.view.animation.Interpolator> weakReference) {
        synchronized (com.bytedance.adsdk.IL.zx.LZ.class) {
            IL.put(i, weakReference);
        }
    }

    static <T> com.bytedance.adsdk.IL.iR.bg<T> bg(android.util.JsonReader jsonReader, com.bytedance.adsdk.IL.iR iRVar, float f, com.bytedance.adsdk.IL.zx.bN<T> bNVar, boolean z, boolean z2) throws java.io.IOException {
        if (z && z2) {
            return IL(iRVar, jsonReader, f, bNVar);
        }
        if (z) {
            return bg(iRVar, jsonReader, f, bNVar);
        }
        return bg(jsonReader, f, bNVar);
    }

    private static <T> com.bytedance.adsdk.IL.iR.bg<T> bg(com.bytedance.adsdk.IL.iR iRVar, android.util.JsonReader jsonReader, float f, com.bytedance.adsdk.IL.zx.bN<T> bNVar) throws java.io.IOException {
        android.view.animation.Interpolator interpolatorBg;
        jsonReader.beginObject();
        android.graphics.PointF pointFIL = null;
        T tIL = null;
        T tIL2 = null;
        android.graphics.PointF pointFIL2 = null;
        android.graphics.PointF pointFIL3 = null;
        float fNextDouble = 0.0f;
        boolean z = false;
        android.graphics.PointF pointFIL4 = null;
        while (jsonReader.hasNext()) {
            java.lang.String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "e":
                    tIL = bNVar.IL(jsonReader, f);
                    break;
                case "h":
                    if (jsonReader.nextInt() != 1) {
                        z = false;
                        break;
                    } else {
                        z = true;
                        break;
                    }
                    break;
                case "i":
                    pointFIL4 = com.bytedance.adsdk.IL.zx.Fy.IL(jsonReader, 1.0f);
                    break;
                case "o":
                    pointFIL = com.bytedance.adsdk.IL.zx.Fy.IL(jsonReader, 1.0f);
                    break;
                case "s":
                    tIL2 = bNVar.IL(jsonReader, f);
                    break;
                case "t":
                    fNextDouble = (float) jsonReader.nextDouble();
                    break;
                case "ti":
                    pointFIL3 = com.bytedance.adsdk.IL.zx.Fy.IL(jsonReader, f);
                    break;
                case "to":
                    pointFIL2 = com.bytedance.adsdk.IL.zx.Fy.IL(jsonReader, f);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        if (!z) {
            if (pointFIL != null && pointFIL4 != null) {
                interpolatorBg = bg(pointFIL, pointFIL4);
            }
            com.bytedance.adsdk.IL.iR.bg<T> bgVar = new com.bytedance.adsdk.IL.iR.bg<>(iRVar, tIL2, tIL, interpolatorBg, fNextDouble, null);
            bgVar.Kg = pointFIL2;
            bgVar.WR = pointFIL3;
            return bgVar;
        }
        tIL = tIL2;
        interpolatorBg = bg;
        com.bytedance.adsdk.IL.iR.bg<T> bgVar2 = new com.bytedance.adsdk.IL.iR.bg<>(iRVar, tIL2, tIL, interpolatorBg, fNextDouble, null);
        bgVar2.Kg = pointFIL2;
        bgVar2.WR = pointFIL3;
        return bgVar2;
    }

    /* JADX WARN: Code duplicated, block: B:130:0x0273  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static <T> com.bytedance.adsdk.IL.iR.bg<T> IL(com.bytedance.adsdk.IL.iR iRVar, android.util.JsonReader jsonReader, float f, com.bytedance.adsdk.IL.zx.bN<T> bNVar) throws java.io.IOException {
        android.view.animation.Interpolator interpolatorBg;
        android.view.animation.Interpolator interpolatorBg2;
        T t;
        android.view.animation.Interpolator interpolatorBg3;
        com.bytedance.adsdk.IL.iR.bg<T> bgVar;
        float f2;
        android.graphics.PointF pointF;
        android.graphics.PointF pointF2;
        T t2;
        java.lang.String str;
        java.lang.String str2;
        jsonReader.beginObject();
        android.graphics.PointF pointFIL = null;
        boolean z = false;
        android.graphics.PointF pointFIL2 = null;
        android.graphics.PointF pointFIL3 = null;
        android.graphics.PointF pointF3 = null;
        T tIL = null;
        android.graphics.PointF pointF4 = null;
        android.graphics.PointF pointF5 = null;
        android.graphics.PointF pointF6 = null;
        float fNextDouble = 0.0f;
        android.graphics.PointF pointFIL4 = null;
        T tIL2 = null;
        while (jsonReader.hasNext()) {
            java.lang.String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            byte b = -1;
            switch (strNextName.hashCode()) {
                case 101:
                    if (strNextName.equals("e")) {
                        b = 0;
                    }
                    break;
                case 104:
                    if (strNextName.equals(androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_HLS)) {
                        b = 1;
                    }
                    break;
                case 105:
                    if (strNextName.equals(androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT)) {
                        b = 2;
                    }
                    break;
                case 111:
                    if (strNextName.equals("o")) {
                        b = 3;
                    }
                    break;
                case 115:
                    if (strNextName.equals(androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_SS)) {
                        b = 4;
                    }
                    break;
                case 116:
                    if (strNextName.equals("t")) {
                        b = 5;
                    }
                    break;
                case 3701:
                    if (strNextName.equals("ti")) {
                        b = 6;
                    }
                    break;
                case 3707:
                    if (strNextName.equals(androidx.constraintlayout.core.motion.utils.TypedValues.TransitionType.S_TO)) {
                        b = 7;
                    }
                    break;
            }
            java.lang.String str3 = "y";
            java.lang.String str4 = "x";
            switch (b) {
                case 0:
                    f2 = fNextDouble;
                    tIL2 = bNVar.IL(jsonReader, f);
                    fNextDouble = f2;
                    break;
                case 1:
                    pointF = pointFIL;
                    f2 = fNextDouble;
                    pointF2 = pointFIL4;
                    t2 = tIL;
                    z = jsonReader.nextInt() == 1;
                    tIL = t2;
                    pointFIL4 = pointF2;
                    pointFIL = pointF;
                    fNextDouble = f2;
                    break;
                case 2:
                    pointF = pointFIL;
                    f2 = fNextDouble;
                    pointF2 = pointFIL4;
                    t2 = tIL;
                    if (jsonReader.peek() == android.util.JsonToken.BEGIN_OBJECT) {
                        jsonReader.beginObject();
                        float fNextDouble2 = 0.0f;
                        float fNextDouble3 = 0.0f;
                        float fNextDouble4 = 0.0f;
                        float fNextDouble5 = 0.0f;
                        while (jsonReader.hasNext()) {
                            java.lang.String strNextName2 = jsonReader.nextName();
                            strNextName2.hashCode();
                            if (strNextName2.equals(str4)) {
                                str = str3;
                                str2 = str4;
                                if (jsonReader.peek() == android.util.JsonToken.NUMBER) {
                                    fNextDouble4 = (float) jsonReader.nextDouble();
                                    fNextDouble2 = fNextDouble4;
                                } else {
                                    jsonReader.beginArray();
                                    fNextDouble2 = (float) jsonReader.nextDouble();
                                    fNextDouble4 = jsonReader.peek() == android.util.JsonToken.NUMBER ? (float) jsonReader.nextDouble() : fNextDouble2;
                                    jsonReader.endArray();
                                }
                            } else if (strNextName2.equals(str3)) {
                                if (jsonReader.peek() == android.util.JsonToken.NUMBER) {
                                    str = str3;
                                    str2 = str4;
                                    fNextDouble5 = (float) jsonReader.nextDouble();
                                    fNextDouble3 = fNextDouble5;
                                } else {
                                    str = str3;
                                    str2 = str4;
                                    jsonReader.beginArray();
                                    fNextDouble3 = (float) jsonReader.nextDouble();
                                    fNextDouble5 = jsonReader.peek() == android.util.JsonToken.NUMBER ? (float) jsonReader.nextDouble() : fNextDouble3;
                                    jsonReader.endArray();
                                }
                            } else {
                                jsonReader.skipValue();
                            }
                            str3 = str;
                            str4 = str2;
                        }
                        android.graphics.PointF pointF7 = new android.graphics.PointF(fNextDouble2, fNextDouble3);
                        android.graphics.PointF pointF8 = new android.graphics.PointF(fNextDouble4, fNextDouble5);
                        jsonReader.endObject();
                        pointF6 = pointF8;
                        pointF5 = pointF7;
                    } else {
                        pointFIL3 = com.bytedance.adsdk.IL.zx.Fy.IL(jsonReader, f);
                    }
                    tIL = t2;
                    pointFIL4 = pointF2;
                    pointFIL = pointF;
                    fNextDouble = f2;
                    break;
                case 3:
                    pointF2 = pointFIL4;
                    pointF = pointFIL;
                    if (jsonReader.peek() == android.util.JsonToken.BEGIN_OBJECT) {
                        jsonReader.beginObject();
                        float fNextDouble6 = 0.0f;
                        float fNextDouble7 = 0.0f;
                        float fNextDouble8 = 0.0f;
                        float fNextDouble9 = 0.0f;
                        while (jsonReader.hasNext()) {
                            float f3 = fNextDouble;
                            java.lang.String strNextName3 = jsonReader.nextName();
                            strNextName3.hashCode();
                            if (strNextName3.equals("x")) {
                                if (jsonReader.peek() == android.util.JsonToken.NUMBER) {
                                    fNextDouble8 = (float) jsonReader.nextDouble();
                                    fNextDouble6 = fNextDouble8;
                                } else {
                                    jsonReader.beginArray();
                                    fNextDouble6 = (float) jsonReader.nextDouble();
                                    fNextDouble8 = jsonReader.peek() == android.util.JsonToken.NUMBER ? (float) jsonReader.nextDouble() : fNextDouble6;
                                    jsonReader.endArray();
                                }
                                tIL = tIL;
                            } else if (strNextName3.equals("y")) {
                                if (jsonReader.peek() == android.util.JsonToken.NUMBER) {
                                    fNextDouble9 = (float) jsonReader.nextDouble();
                                    fNextDouble7 = fNextDouble9;
                                } else {
                                    jsonReader.beginArray();
                                    fNextDouble7 = (float) jsonReader.nextDouble();
                                    fNextDouble9 = jsonReader.peek() == android.util.JsonToken.NUMBER ? (float) jsonReader.nextDouble() : fNextDouble7;
                                    jsonReader.endArray();
                                }
                            } else {
                                jsonReader.skipValue();
                            }
                            fNextDouble = f3;
                        }
                        f2 = fNextDouble;
                        android.graphics.PointF pointF9 = new android.graphics.PointF(fNextDouble6, fNextDouble7);
                        android.graphics.PointF pointF10 = new android.graphics.PointF(fNextDouble8, fNextDouble9);
                        jsonReader.endObject();
                        pointF4 = pointF10;
                        pointF3 = pointF9;
                    } else {
                        f2 = fNextDouble;
                        pointFIL2 = com.bytedance.adsdk.IL.zx.Fy.IL(jsonReader, f);
                    }
                    pointFIL4 = pointF2;
                    pointFIL = pointF;
                    fNextDouble = f2;
                    break;
                case 4:
                    tIL = bNVar.IL(jsonReader, f);
                    break;
                case 5:
                    fNextDouble = (float) jsonReader.nextDouble();
                    break;
                case 6:
                    pointFIL = com.bytedance.adsdk.IL.zx.Fy.IL(jsonReader, f);
                    break;
                case 7:
                    pointFIL4 = com.bytedance.adsdk.IL.zx.Fy.IL(jsonReader, f);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        android.graphics.PointF pointF11 = pointFIL;
        float f4 = fNextDouble;
        android.graphics.PointF pointF12 = pointFIL4;
        T t3 = tIL;
        jsonReader.endObject();
        if (!z) {
            if (pointFIL2 != null && pointFIL3 != null) {
                interpolatorBg3 = bg(pointFIL2, pointFIL3);
                t = tIL2;
                interpolatorBg = null;
                interpolatorBg2 = null;
            } else if (pointF3 != null && pointF4 != null && pointF5 != null && pointF6 != null) {
                interpolatorBg = bg(pointF3, pointF5);
                interpolatorBg2 = bg(pointF4, pointF6);
                t = tIL2;
                interpolatorBg3 = null;
            }
            if (interpolatorBg == null && interpolatorBg2 != null) {
                bgVar = new com.bytedance.adsdk.IL.iR.bg<>(iRVar, t3, t, interpolatorBg, interpolatorBg2, f4, null);
            } else {
                bgVar = new com.bytedance.adsdk.IL.iR.bg<>(iRVar, t3, t, interpolatorBg3, f4, null);
            }
            bgVar.Kg = pointF12;
            bgVar.WR = pointF11;
            return bgVar;
        }
        tIL2 = t3;
        interpolatorBg3 = bg;
        t = tIL2;
        interpolatorBg = null;
        interpolatorBg2 = null;
        if (interpolatorBg == null) {
            bgVar = new com.bytedance.adsdk.IL.iR.bg<>(iRVar, t3, t, interpolatorBg3, f4, null);
        } else {
            bgVar = new com.bytedance.adsdk.IL.iR.bg<>(iRVar, t3, t, interpolatorBg3, f4, null);
        }
        bgVar.Kg = pointF12;
        bgVar.WR = pointF11;
        return bgVar;
    }

    private static android.view.animation.Interpolator bg(android.graphics.PointF pointF, android.graphics.PointF pointF2) {
        android.view.animation.Interpolator linearInterpolator;
        pointF.x = com.bytedance.adsdk.IL.ldr.zx.IL(pointF.x, -1.0f, 1.0f);
        pointF.y = com.bytedance.adsdk.IL.ldr.zx.IL(pointF.y, -100.0f, 100.0f);
        pointF2.x = com.bytedance.adsdk.IL.ldr.zx.IL(pointF2.x, -1.0f, 1.0f);
        pointF2.y = com.bytedance.adsdk.IL.ldr.zx.IL(pointF2.y, -100.0f, 100.0f);
        int iBg = com.bytedance.adsdk.IL.ldr.ldr.bg(pointF.x, pointF.y, pointF2.x, pointF2.y);
        java.lang.ref.WeakReference<android.view.animation.Interpolator> weakReferenceBg = com.bytedance.adsdk.IL.zx.bg() ? null : bg(iBg);
        android.view.animation.Interpolator interpolator = weakReferenceBg != null ? weakReferenceBg.get() : null;
        if (weakReferenceBg == null || interpolator == null) {
            try {
                linearInterpolator = com.bytedance.adsdk.IL.VzQ.bg(pointF.x, pointF.y, pointF2.x, pointF2.y);
            } catch (java.lang.IllegalArgumentException e) {
                if ("The Path cannot loop back on itself.".equals(e.getMessage())) {
                    linearInterpolator = com.bytedance.adsdk.IL.VzQ.bg(java.lang.Math.min(pointF.x, 1.0f), pointF.y, java.lang.Math.max(pointF2.x, 0.0f), pointF2.y);
                } else {
                    linearInterpolator = new android.view.animation.LinearInterpolator();
                }
            }
            interpolator = linearInterpolator;
            if (!com.bytedance.adsdk.IL.zx.bg()) {
                try {
                    bg(iBg, (java.lang.ref.WeakReference<android.view.animation.Interpolator>) new java.lang.ref.WeakReference(interpolator));
                } catch (java.lang.ArrayIndexOutOfBoundsException unused) {
                }
            }
        }
        return interpolator;
    }

    private static <T> com.bytedance.adsdk.IL.iR.bg<T> bg(android.util.JsonReader jsonReader, float f, com.bytedance.adsdk.IL.zx.bN<T> bNVar) throws java.io.IOException {
        return new com.bytedance.adsdk.IL.iR.bg<>(bNVar.IL(jsonReader, f));
    }
}
