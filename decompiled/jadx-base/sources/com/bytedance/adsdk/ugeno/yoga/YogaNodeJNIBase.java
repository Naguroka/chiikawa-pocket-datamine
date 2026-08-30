package com.bytedance.adsdk.ugeno.yoga;

/* JADX INFO: loaded from: classes3.dex */
public abstract class YogaNodeJNIBase extends com.bytedance.adsdk.ugeno.yoga.PX implements java.lang.Cloneable {
    private com.bytedance.adsdk.ugeno.yoga.YogaNodeJNIBase IL;
    private float[] arr;
    private java.util.List<com.bytedance.adsdk.ugeno.yoga.YogaNodeJNIBase> bX;
    protected long bg;
    private com.bytedance.adsdk.ugeno.yoga.WR eqN;
    private boolean iR;
    private java.lang.Object ldr;
    private int mLayoutDirection;
    private com.bytedance.adsdk.ugeno.yoga.bX zx;

    private YogaNodeJNIBase(long j) {
        this.arr = null;
        this.mLayoutDirection = 0;
        this.iR = true;
        if (j == 0) {
            throw new java.lang.IllegalStateException("Failed to allocate native memory");
        }
        this.bg = j;
    }

    YogaNodeJNIBase() {
        this(com.bytedance.adsdk.ugeno.yoga.YogaNative.jni_YGNodeNewJNI());
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.PX
    public int bg() {
        java.util.List<com.bytedance.adsdk.ugeno.yoga.YogaNodeJNIBase> list = this.bX;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.PX
    /* JADX INFO: renamed from: bX, reason: merged with bridge method [inline-methods] */
    public com.bytedance.adsdk.ugeno.yoga.YogaNodeJNIBase bg(int i) {
        java.util.List<com.bytedance.adsdk.ugeno.yoga.YogaNodeJNIBase> list = this.bX;
        if (list == null) {
            throw new java.lang.IllegalStateException("YogaNode does not have children");
        }
        return list.get(i);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.PX
    public void bg(com.bytedance.adsdk.ugeno.yoga.PX px, int i) {
        if (px instanceof com.bytedance.adsdk.ugeno.yoga.YogaNodeJNIBase) {
            com.bytedance.adsdk.ugeno.yoga.YogaNodeJNIBase yogaNodeJNIBase = (com.bytedance.adsdk.ugeno.yoga.YogaNodeJNIBase) px;
            if (yogaNodeJNIBase.IL != null) {
                throw new java.lang.IllegalStateException("Child already has a parent, it must be removed first.");
            }
            if (this.bX == null) {
                this.bX = new java.util.ArrayList(4);
            }
            this.bX.add(i, yogaNodeJNIBase);
            yogaNodeJNIBase.IL = this;
            com.bytedance.adsdk.ugeno.yoga.YogaNative.jni_YGNodeInsertChildJNI(this.bg, yogaNodeJNIBase.bg, i);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.PX
    /* JADX INFO: renamed from: eqN, reason: merged with bridge method [inline-methods] */
    public com.bytedance.adsdk.ugeno.yoga.YogaNodeJNIBase IL(int i) {
        java.util.List<com.bytedance.adsdk.ugeno.yoga.YogaNodeJNIBase> list = this.bX;
        if (list == null) {
            throw new java.lang.IllegalStateException("Trying to remove a child of a YogaNode that does not have children");
        }
        com.bytedance.adsdk.ugeno.yoga.YogaNodeJNIBase yogaNodeJNIBaseRemove = list.remove(i);
        yogaNodeJNIBaseRemove.IL = null;
        com.bytedance.adsdk.ugeno.yoga.YogaNative.jni_YGNodeRemoveChildJNI(this.bg, yogaNodeJNIBaseRemove.bg);
        return yogaNodeJNIBaseRemove;
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.PX
    /* JADX INFO: renamed from: eo, reason: merged with bridge method [inline-methods] */
    public com.bytedance.adsdk.ugeno.yoga.YogaNodeJNIBase IL() {
        return this.IL;
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.PX
    public int bg(com.bytedance.adsdk.ugeno.yoga.PX px) {
        java.util.List<com.bytedance.adsdk.ugeno.yoga.YogaNodeJNIBase> list = this.bX;
        if (list == null) {
            return -1;
        }
        return list.indexOf(px);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.PX
    public void bg(float f, float f2) {
        IL((com.bytedance.adsdk.ugeno.yoga.PX) null);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(this);
        for (int i = 0; i < arrayList.size(); i++) {
            com.bytedance.adsdk.ugeno.yoga.YogaNodeJNIBase yogaNodeJNIBase = (com.bytedance.adsdk.ugeno.yoga.YogaNodeJNIBase) arrayList.get(i);
            java.util.List<com.bytedance.adsdk.ugeno.yoga.YogaNodeJNIBase> list = yogaNodeJNIBase.bX;
            if (list != null) {
                for (com.bytedance.adsdk.ugeno.yoga.YogaNodeJNIBase yogaNodeJNIBase2 : list) {
                    yogaNodeJNIBase2.IL(yogaNodeJNIBase);
                    arrayList.add(yogaNodeJNIBase2);
                }
            }
        }
        com.bytedance.adsdk.ugeno.yoga.YogaNodeJNIBase[] yogaNodeJNIBaseArr = (com.bytedance.adsdk.ugeno.yoga.YogaNodeJNIBase[]) arrayList.toArray(new com.bytedance.adsdk.ugeno.yoga.YogaNodeJNIBase[arrayList.size()]);
        long[] jArr = new long[yogaNodeJNIBaseArr.length];
        for (int i2 = 0; i2 < yogaNodeJNIBaseArr.length; i2++) {
            jArr[i2] = yogaNodeJNIBaseArr[i2].bg;
        }
        com.bytedance.adsdk.ugeno.yoga.YogaNative.jni_YGNodeCalculateLayoutJNI(this.bg, f, f2, jArr, yogaNodeJNIBaseArr);
    }

    private void IL(com.bytedance.adsdk.ugeno.yoga.PX px) {
        WR();
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.PX
    public void bg(com.bytedance.adsdk.ugeno.yoga.eqN eqn) {
        com.bytedance.adsdk.ugeno.yoga.YogaNative.jni_YGNodeStyleSetDirectionJNI(this.bg, eqn.bg());
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.PX
    public void bg(com.bytedance.adsdk.ugeno.yoga.ldr ldrVar) {
        com.bytedance.adsdk.ugeno.yoga.YogaNative.jni_YGNodeStyleSetFlexDirectionJNI(this.bg, ldrVar.bg());
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.PX
    public void bg(com.bytedance.adsdk.ugeno.yoga.iR iRVar) {
        com.bytedance.adsdk.ugeno.yoga.YogaNative.jni_YGNodeStyleSetJustifyContentJNI(this.bg, iRVar.bg());
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.PX
    public void bg(com.bytedance.adsdk.ugeno.yoga.IL il) {
        com.bytedance.adsdk.ugeno.yoga.YogaNative.jni_YGNodeStyleSetAlignItemsJNI(this.bg, il.bg());
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.PX
    public void IL(com.bytedance.adsdk.ugeno.yoga.IL il) {
        com.bytedance.adsdk.ugeno.yoga.YogaNative.jni_YGNodeStyleSetAlignSelfJNI(this.bg, il.bg());
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.PX
    public void bX(com.bytedance.adsdk.ugeno.yoga.IL il) {
        com.bytedance.adsdk.ugeno.yoga.YogaNative.jni_YGNodeStyleSetAlignContentJNI(this.bg, il.bg());
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.PX
    public void bg(com.bytedance.adsdk.ugeno.yoga.Lq lq) {
        com.bytedance.adsdk.ugeno.yoga.YogaNative.jni_YGNodeStyleSetPositionTypeJNI(this.bg, lq.bg());
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.PX
    public void bg(com.bytedance.adsdk.ugeno.yoga.xxp xxpVar) {
        com.bytedance.adsdk.ugeno.yoga.YogaNative.jni_YGNodeStyleSetFlexWrapJNI(this.bg, xxpVar.bg());
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.PX
    public void bg(float f) {
        com.bytedance.adsdk.ugeno.yoga.YogaNative.jni_YGNodeStyleSetFlexGrowJNI(this.bg, f);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.PX
    public void IL(float f) {
        com.bytedance.adsdk.ugeno.yoga.YogaNative.jni_YGNodeStyleSetFlexShrinkJNI(this.bg, f);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.PX
    public void bX(float f) {
        com.bytedance.adsdk.ugeno.yoga.YogaNative.jni_YGNodeStyleSetFlexBasisJNI(this.bg, f);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.PX
    public void bg(com.bytedance.adsdk.ugeno.yoga.zx zxVar, float f) {
        com.bytedance.adsdk.ugeno.yoga.YogaNative.jni_YGNodeStyleSetMarginJNI(this.bg, zxVar.bg(), f);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.PX
    public void IL(com.bytedance.adsdk.ugeno.yoga.zx zxVar, float f) {
        com.bytedance.adsdk.ugeno.yoga.YogaNative.jni_YGNodeStyleSetPaddingJNI(this.bg, zxVar.bg(), f);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.PX
    public void bX(com.bytedance.adsdk.ugeno.yoga.zx zxVar, float f) {
        com.bytedance.adsdk.ugeno.yoga.YogaNative.jni_YGNodeStyleSetPositionJNI(this.bg, zxVar.bg(), f);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.PX
    public void eqN(float f) {
        com.bytedance.adsdk.ugeno.yoga.YogaNative.jni_YGNodeStyleSetWidthJNI(this.bg, f);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.PX
    public void zx(float f) {
        com.bytedance.adsdk.ugeno.yoga.YogaNative.jni_YGNodeStyleSetWidthPercentJNI(this.bg, f);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.PX
    public void bX() {
        com.bytedance.adsdk.ugeno.yoga.YogaNative.jni_YGNodeStyleSetWidthAutoJNI(this.bg);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.PX
    public void ldr(float f) {
        com.bytedance.adsdk.ugeno.yoga.YogaNative.jni_YGNodeStyleSetHeightJNI(this.bg, f);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.PX
    public void iR(float f) {
        com.bytedance.adsdk.ugeno.yoga.YogaNative.jni_YGNodeStyleSetHeightPercentJNI(this.bg, f);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.PX
    public void eqN() {
        com.bytedance.adsdk.ugeno.yoga.YogaNative.jni_YGNodeStyleSetHeightAutoJNI(this.bg);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.PX
    public void Kg(float f) {
        com.bytedance.adsdk.ugeno.yoga.YogaNative.jni_YGNodeStyleSetMaxWidthJNI(this.bg, f);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.PX
    public void WR(float f) {
        com.bytedance.adsdk.ugeno.yoga.YogaNative.jni_YGNodeStyleSetMaxHeightJNI(this.bg, f);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.PX
    public void eo(float f) {
        com.bytedance.adsdk.ugeno.yoga.YogaNative.jni_YGNodeStyleSetAspectRatioJNI(this.bg, f);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.PX
    public void bg(com.bytedance.adsdk.ugeno.yoga.WR wr) {
        this.eqN = wr;
        com.bytedance.adsdk.ugeno.yoga.YogaNative.jni_YGNodeSetHasMeasureFuncJNI(this.bg, wr != null);
    }

    public final long measure(float f, int i, float f2, int i2) {
        if (!VB()) {
            throw new java.lang.RuntimeException("Measure function isn't defined!");
        }
        return this.eqN.bg(this, f, com.bytedance.adsdk.ugeno.yoga.eo.bg(i), f2, com.bytedance.adsdk.ugeno.yoga.eo.bg(i2));
    }

    public final float baseline(float f, float f2) {
        return this.zx.bg(this, f, f2);
    }

    public boolean VB() {
        return this.eqN != null;
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.PX
    public void bg(java.lang.Object obj) {
        this.ldr = obj;
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.PX
    public java.lang.Object WR() {
        return this.ldr;
    }

    private final long replaceChild(com.bytedance.adsdk.ugeno.yoga.YogaNodeJNIBase yogaNodeJNIBase, int i) {
        java.util.List<com.bytedance.adsdk.ugeno.yoga.YogaNodeJNIBase> list = this.bX;
        if (list == null) {
            throw new java.lang.IllegalStateException("Cannot replace child. YogaNode does not have children");
        }
        list.remove(i);
        this.bX.add(i, yogaNodeJNIBase);
        yogaNodeJNIBase.IL = this;
        return yogaNodeJNIBase.bg;
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.PX
    public float zx() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[3];
        }
        return 0.0f;
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.PX
    public float ldr() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[4];
        }
        return 0.0f;
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.PX
    public float iR() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[1];
        }
        return 0.0f;
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.PX
    public float Kg() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[2];
        }
        return 0.0f;
    }
}
