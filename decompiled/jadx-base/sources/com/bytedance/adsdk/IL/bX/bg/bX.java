package com.bytedance.adsdk.IL.bX.bg;

/* JADX INFO: loaded from: classes3.dex */
public class bX extends com.bytedance.adsdk.IL.bX.bg.yDt<com.bytedance.adsdk.IL.bX.IL.eqN, com.bytedance.adsdk.IL.bX.IL.eqN> {
    @Override // com.bytedance.adsdk.IL.bX.bg.yDt, com.bytedance.adsdk.IL.bX.bg.Ta
    public /* bridge */ /* synthetic */ boolean IL() {
        return super.IL();
    }

    @Override // com.bytedance.adsdk.IL.bX.bg.yDt, com.bytedance.adsdk.IL.bX.bg.Ta
    public /* bridge */ /* synthetic */ java.util.List bX() {
        return super.bX();
    }

    @Override // com.bytedance.adsdk.IL.bX.bg.yDt
    public /* bridge */ /* synthetic */ java.lang.String toString() {
        return super.toString();
    }

    public bX(java.util.List<com.bytedance.adsdk.IL.iR.bg<com.bytedance.adsdk.IL.bX.IL.eqN>> list) {
        super(bg(list));
    }

    private static java.util.List<com.bytedance.adsdk.IL.iR.bg<com.bytedance.adsdk.IL.bX.IL.eqN>> bg(java.util.List<com.bytedance.adsdk.IL.iR.bg<com.bytedance.adsdk.IL.bX.IL.eqN>> list) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, bg(list.get(i)));
        }
        return list;
    }

    private static com.bytedance.adsdk.IL.iR.bg<com.bytedance.adsdk.IL.bX.IL.eqN> bg(com.bytedance.adsdk.IL.iR.bg<com.bytedance.adsdk.IL.bX.IL.eqN> bgVar) {
        com.bytedance.adsdk.IL.bX.IL.eqN eqn = bgVar.bg;
        com.bytedance.adsdk.IL.bX.IL.eqN eqn2 = bgVar.IL;
        if (eqn == null || eqn2 == null || eqn.bg().length == eqn2.bg().length) {
            return bgVar;
        }
        float[] fArrBg = bg(eqn.bg(), eqn2.bg());
        return bgVar.bg(eqn.bg(fArrBg), eqn2.bg(fArrBg));
    }

    static float[] bg(float[] fArr, float[] fArr2) {
        int length = fArr.length + fArr2.length;
        float[] fArr3 = new float[length];
        java.lang.System.arraycopy(fArr, 0, fArr3, 0, fArr.length);
        java.lang.System.arraycopy(fArr2, 0, fArr3, fArr.length, fArr2.length);
        java.util.Arrays.sort(fArr3);
        float f = Float.NaN;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            float f2 = fArr3[i2];
            if (f2 != f) {
                fArr3[i] = f2;
                i++;
                f = fArr3[i2];
            }
        }
        return java.util.Arrays.copyOfRange(fArr3, 0, i);
    }

    @Override // com.bytedance.adsdk.IL.bX.bg.Ta
    public com.bytedance.adsdk.IL.bg.IL.bg<com.bytedance.adsdk.IL.bX.IL.eqN, com.bytedance.adsdk.IL.bX.IL.eqN> bg() {
        return new com.bytedance.adsdk.IL.bg.IL.zx(this.bg);
    }
}
