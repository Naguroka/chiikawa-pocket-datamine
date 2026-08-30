package com.bytedance.adsdk.IL.zx;

/* JADX INFO: loaded from: classes3.dex */
public class Lq implements com.bytedance.adsdk.IL.zx.bN<com.bytedance.adsdk.IL.bX.IL.eqN> {
    private int bg;

    public Lq(int i) {
        this.bg = i;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00c9  */
    @Override // com.bytedance.adsdk.IL.zx.bN
    /* JADX INFO: renamed from: bg, reason: merged with bridge method [inline-methods] */
    public com.bytedance.adsdk.IL.bX.IL.eqN IL(android.util.JsonReader jsonReader, float f) throws java.io.IOException {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        boolean z = jsonReader.peek() == android.util.JsonToken.BEGIN_ARRAY;
        if (z) {
            jsonReader.beginArray();
        }
        while (jsonReader.hasNext()) {
            arrayList.add(java.lang.Float.valueOf((float) jsonReader.nextDouble()));
        }
        if (arrayList.size() == 4 && arrayList.get(0).floatValue() == 1.0f) {
            arrayList.set(0, java.lang.Float.valueOf(0.0f));
            arrayList.add(java.lang.Float.valueOf(1.0f));
            arrayList.add(arrayList.get(1));
            arrayList.add(arrayList.get(2));
            arrayList.add(arrayList.get(3));
            this.bg = 2;
        }
        if (z) {
            jsonReader.endArray();
        }
        if (this.bg == -1) {
            this.bg = arrayList.size() / 4;
        }
        int i = this.bg;
        float[] fArr = new float[i];
        int[] iArr = new int[i];
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < this.bg * 4; i4++) {
            int i5 = i4 / 4;
            double dFloatValue = arrayList.get(i4).floatValue();
            int i6 = i4 % 4;
            if (i6 != 0) {
                if (i6 == 1) {
                    i2 = (int) (dFloatValue * 255.0d);
                } else if (i6 == 2) {
                    i3 = (int) (dFloatValue * 255.0d);
                } else if (i6 == 3) {
                    iArr[i5] = android.graphics.Color.argb(255, i2, i3, (int) (dFloatValue * 255.0d));
                }
            } else if (i5 > 0) {
                float f2 = (float) dFloatValue;
                if (fArr[i5 - 1] >= f2) {
                    fArr[i5] = f2 + 0.01f;
                } else {
                    fArr[i5] = (float) dFloatValue;
                }
            } else {
                fArr[i5] = (float) dFloatValue;
            }
        }
        return bg(new com.bytedance.adsdk.IL.bX.IL.eqN(fArr, iArr), arrayList);
    }

    private com.bytedance.adsdk.IL.bX.IL.eqN bg(com.bytedance.adsdk.IL.bX.IL.eqN eqn, java.util.List<java.lang.Float> list) {
        int i = this.bg * 4;
        if (list.size() <= i) {
            return eqn;
        }
        float[] fArrBg = eqn.bg();
        int[] iArrIL = eqn.IL();
        int size = (list.size() - i) / 2;
        float[] fArr = new float[size];
        float[] fArr2 = new float[size];
        int i2 = 0;
        while (i < list.size()) {
            if (i % 2 == 0) {
                fArr[i2] = list.get(i).floatValue();
            } else {
                fArr2[i2] = list.get(i).floatValue();
                i2++;
            }
            i++;
        }
        float[] fArrBg2 = bg(eqn.bg(), fArr);
        int length = fArrBg2.length;
        int[] iArr = new int[length];
        for (int i3 = 0; i3 < length; i3++) {
            float f = fArrBg2[i3];
            int iBinarySearch = java.util.Arrays.binarySearch(fArrBg, f);
            int iBinarySearch2 = java.util.Arrays.binarySearch(fArr, f);
            if (iBinarySearch < 0 || iBinarySearch2 > 0) {
                if (iBinarySearch2 < 0) {
                    iBinarySearch2 = -(iBinarySearch2 + 1);
                }
                iArr[i3] = bg(f, fArr2[iBinarySearch2], fArrBg, iArrIL);
            } else {
                iArr[i3] = bg(f, iArrIL[iBinarySearch], fArr, fArr2);
            }
        }
        return new com.bytedance.adsdk.IL.bX.IL.eqN(fArrBg2, iArr);
    }

    int bg(float f, float f2, float[] fArr, int[] iArr) {
        if (iArr.length < 2 || f == fArr[0]) {
            return iArr[0];
        }
        for (int i = 1; i < fArr.length; i++) {
            float f3 = fArr[i];
            if (f3 >= f || i == fArr.length - 1) {
                int i2 = i - 1;
                float f4 = fArr[i2];
                float f5 = (f - f4) / (f3 - f4);
                int i3 = iArr[i];
                int i4 = iArr[i2];
                return android.graphics.Color.argb((int) (f2 * 255.0f), com.bytedance.adsdk.IL.ldr.IL.bg(f5, android.graphics.Color.red(i4), android.graphics.Color.red(i3)), com.bytedance.adsdk.IL.ldr.IL.bg(f5, android.graphics.Color.green(i4), android.graphics.Color.green(i3)), com.bytedance.adsdk.IL.ldr.IL.bg(f5, android.graphics.Color.blue(i4), android.graphics.Color.blue(i3)));
            }
        }
        throw new java.lang.IllegalArgumentException("Unreachable code.");
    }

    private int bg(float f, int i, float[] fArr, float[] fArr2) {
        float fBg;
        if (fArr2.length < 2 || f <= fArr[0]) {
            return android.graphics.Color.argb((int) (fArr2[0] * 255.0f), android.graphics.Color.red(i), android.graphics.Color.green(i), android.graphics.Color.blue(i));
        }
        for (int i2 = 1; i2 < fArr.length; i2++) {
            float f2 = fArr[i2];
            if (f2 >= f || i2 == fArr.length - 1) {
                if (f2 <= f) {
                    fBg = fArr2[i2];
                } else {
                    int i3 = i2 - 1;
                    float f3 = fArr[i3];
                    fBg = com.bytedance.adsdk.IL.ldr.zx.bg(fArr2[i3], fArr2[i2], (f - f3) / (f2 - f3));
                }
                return android.graphics.Color.argb((int) (fBg * 255.0f), android.graphics.Color.red(i), android.graphics.Color.green(i), android.graphics.Color.blue(i));
            }
        }
        throw new java.lang.IllegalArgumentException("Unreachable code.");
    }

    protected static float[] bg(float[] fArr, float[] fArr2) {
        if (fArr.length == 0) {
            return fArr2;
        }
        if (fArr2.length == 0) {
            return fArr;
        }
        int length = fArr.length + fArr2.length;
        float[] fArr3 = new float[length];
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            float f = i2 < fArr.length ? fArr[i2] : Float.NaN;
            float f2 = i3 < fArr2.length ? fArr2[i3] : Float.NaN;
            if (java.lang.Float.isNaN(f2) || f < f2) {
                fArr3[i4] = f;
                i2++;
            } else if (java.lang.Float.isNaN(f) || f2 < f) {
                fArr3[i4] = f2;
                i3++;
            } else {
                fArr3[i4] = f;
                i2++;
                i3++;
                i++;
            }
        }
        return i == 0 ? fArr3 : java.util.Arrays.copyOf(fArr3, length - i);
    }
}
