package com.bytedance.adsdk.IL.bX.IL;

/* JADX INFO: loaded from: classes3.dex */
public class eqN {
    private final int[] IL;
    private final float[] bg;

    public eqN(float[] fArr, int[] iArr) {
        this.bg = fArr;
        this.IL = iArr;
    }

    public float[] bg() {
        return this.bg;
    }

    public int[] IL() {
        return this.IL;
    }

    public int bX() {
        return this.IL.length;
    }

    public void bg(com.bytedance.adsdk.IL.bX.IL.eqN eqn, com.bytedance.adsdk.IL.bX.IL.eqN eqn2, float f) {
        if (eqn.IL.length != eqn2.IL.length) {
            throw new java.lang.IllegalArgumentException("Cannot interpolate between gradients. Lengths vary (" + eqn.IL.length + " vs " + eqn2.IL.length + ")");
        }
        for (int i = 0; i < eqn.IL.length; i++) {
            this.bg[i] = com.bytedance.adsdk.IL.ldr.zx.bg(eqn.bg[i], eqn2.bg[i], f);
            this.IL[i] = com.bytedance.adsdk.IL.ldr.IL.bg(f, eqn.IL[i], eqn2.IL[i]);
        }
    }

    public com.bytedance.adsdk.IL.bX.IL.eqN bg(float[] fArr) {
        int[] iArr = new int[fArr.length];
        for (int i = 0; i < fArr.length; i++) {
            iArr[i] = bg(fArr[i]);
        }
        return new com.bytedance.adsdk.IL.bX.IL.eqN(fArr, iArr);
    }

    private int bg(float f) {
        int iBinarySearch = java.util.Arrays.binarySearch(this.bg, f);
        if (iBinarySearch >= 0) {
            return this.IL[iBinarySearch];
        }
        int i = -(iBinarySearch + 1);
        if (i == 0) {
            return this.IL[0];
        }
        int[] iArr = this.IL;
        if (i == iArr.length - 1) {
            return iArr[iArr.length - 1];
        }
        float[] fArr = this.bg;
        int i2 = i - 1;
        float f2 = fArr[i2];
        return com.bytedance.adsdk.IL.ldr.IL.bg((f - f2) / (fArr[i] - f2), iArr[i2], iArr[i]);
    }
}
