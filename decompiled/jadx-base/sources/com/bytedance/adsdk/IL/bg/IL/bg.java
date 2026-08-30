package com.bytedance.adsdk.IL.bg.IL;

/* JADX INFO: loaded from: classes3.dex */
public abstract class bg<K, A> {
    protected com.bytedance.adsdk.IL.iR.IL<A> bX;
    private final com.bytedance.adsdk.IL.bg.IL.bg.bX<K> zx;
    final java.util.List<com.bytedance.adsdk.IL.bg.IL.bg.InterfaceC0076bg> bg = new java.util.ArrayList(1);
    private boolean eqN = false;
    protected float IL = 0.0f;
    private A ldr = null;
    private float iR = -1.0f;
    private float Kg = -1.0f;

    private interface bX<T> {
        com.bytedance.adsdk.IL.iR.bg<T> IL();

        boolean IL(float f);

        float bX();

        boolean bg();

        boolean bg(float f);

        float eqN();
    }

    /* JADX INFO: renamed from: com.bytedance.adsdk.IL.bg.IL.bg$bg, reason: collision with other inner class name */
    public interface InterfaceC0076bg {
        void bg();
    }

    abstract A bg(com.bytedance.adsdk.IL.iR.bg<K> bgVar, float f);

    bg(java.util.List<? extends com.bytedance.adsdk.IL.iR.bg<K>> list) {
        this.zx = bg(list);
    }

    public void bg() {
        this.eqN = true;
    }

    public void bg(com.bytedance.adsdk.IL.bg.IL.bg.InterfaceC0076bg interfaceC0076bg) {
        this.bg.add(interfaceC0076bg);
    }

    public void bg(float f) {
        if (this.zx.bg()) {
            return;
        }
        if (f < WR()) {
            f = WR();
        } else if (f > ldr()) {
            f = ldr();
        }
        if (f == this.IL) {
            return;
        }
        this.IL = f;
        if (this.zx.bg(f)) {
            IL();
        }
    }

    public void IL() {
        for (int i = 0; i < this.bg.size(); i++) {
            this.bg.get(i).bg();
        }
    }

    protected com.bytedance.adsdk.IL.iR.bg<K> bX() {
        com.bytedance.adsdk.IL.zx.bg("BaseKeyframeAnimation#getCurrentKeyframe");
        com.bytedance.adsdk.IL.iR.bg<K> bgVarIL = this.zx.IL();
        com.bytedance.adsdk.IL.zx.IL("BaseKeyframeAnimation#getCurrentKeyframe");
        return bgVarIL;
    }

    float eqN() {
        if (this.eqN) {
            return 0.0f;
        }
        com.bytedance.adsdk.IL.iR.bg<K> bgVarBX = bX();
        if (bgVarBX.zx()) {
            return 0.0f;
        }
        return (this.IL - bgVarBX.bX()) / (bgVarBX.eqN() - bgVarBX.bX());
    }

    protected float zx() {
        com.bytedance.adsdk.IL.iR.bg<K> bgVarBX = bX();
        if (bgVarBX == null || bgVarBX.zx()) {
            return 0.0f;
        }
        return bgVarBX.bX.getInterpolation(eqN());
    }

    private float WR() {
        if (this.iR == -1.0f) {
            this.iR = this.zx.bX();
        }
        return this.iR;
    }

    float ldr() {
        if (this.Kg == -1.0f) {
            this.Kg = this.zx.eqN();
        }
        return this.Kg;
    }

    public A iR() {
        A aBg;
        float fEqN = eqN();
        if (this.bX == null && this.zx.IL(fEqN)) {
            return this.ldr;
        }
        com.bytedance.adsdk.IL.iR.bg<K> bgVarBX = bX();
        if (bgVarBX.eqN != null && bgVarBX.zx != null) {
            aBg = bg(bgVarBX, fEqN, bgVarBX.eqN.getInterpolation(fEqN), bgVarBX.zx.getInterpolation(fEqN));
        } else {
            aBg = bg(bgVarBX, zx());
        }
        this.ldr = aBg;
        return aBg;
    }

    public float Kg() {
        return this.IL;
    }

    protected A bg(com.bytedance.adsdk.IL.iR.bg<K> bgVar, float f, float f2, float f3) {
        throw new java.lang.UnsupportedOperationException("This animation does not support split dimensions!");
    }

    private static <T> com.bytedance.adsdk.IL.bg.IL.bg.bX<T> bg(java.util.List<? extends com.bytedance.adsdk.IL.iR.bg<T>> list) {
        if (list.isEmpty()) {
            return new com.bytedance.adsdk.IL.bg.IL.bg.IL();
        }
        if (list.size() == 1) {
            return new com.bytedance.adsdk.IL.bg.IL.bg.zx(list);
        }
        return new com.bytedance.adsdk.IL.bg.IL.bg.eqN(list);
    }

    private static final class IL<T> implements com.bytedance.adsdk.IL.bg.IL.bg.bX<T> {
        @Override // com.bytedance.adsdk.IL.bg.IL.bg.bX
        public float bX() {
            return 0.0f;
        }

        @Override // com.bytedance.adsdk.IL.bg.IL.bg.bX
        public boolean bg() {
            return true;
        }

        @Override // com.bytedance.adsdk.IL.bg.IL.bg.bX
        public boolean bg(float f) {
            return false;
        }

        @Override // com.bytedance.adsdk.IL.bg.IL.bg.bX
        public float eqN() {
            return 1.0f;
        }

        private IL() {
        }

        @Override // com.bytedance.adsdk.IL.bg.IL.bg.bX
        public com.bytedance.adsdk.IL.iR.bg<T> IL() {
            throw new java.lang.IllegalStateException("not implemented");
        }

        @Override // com.bytedance.adsdk.IL.bg.IL.bg.bX
        public boolean IL(float f) {
            throw new java.lang.IllegalStateException("not implemented");
        }
    }

    private static final class zx<T> implements com.bytedance.adsdk.IL.bg.IL.bg.bX<T> {
        private float IL = -1.0f;
        private final com.bytedance.adsdk.IL.iR.bg<T> bg;

        @Override // com.bytedance.adsdk.IL.bg.IL.bg.bX
        public boolean bg() {
            return false;
        }

        zx(java.util.List<? extends com.bytedance.adsdk.IL.iR.bg<T>> list) {
            this.bg = list.get(0);
        }

        @Override // com.bytedance.adsdk.IL.bg.IL.bg.bX
        public boolean bg(float f) {
            return !this.bg.zx();
        }

        @Override // com.bytedance.adsdk.IL.bg.IL.bg.bX
        public com.bytedance.adsdk.IL.iR.bg<T> IL() {
            return this.bg;
        }

        @Override // com.bytedance.adsdk.IL.bg.IL.bg.bX
        public float bX() {
            return this.bg.bX();
        }

        @Override // com.bytedance.adsdk.IL.bg.IL.bg.bX
        public float eqN() {
            return this.bg.eqN();
        }

        @Override // com.bytedance.adsdk.IL.bg.IL.bg.bX
        public boolean IL(float f) {
            if (this.IL == f) {
                return true;
            }
            this.IL = f;
            return false;
        }
    }

    private static final class eqN<T> implements com.bytedance.adsdk.IL.bg.IL.bg.bX<T> {
        private final java.util.List<? extends com.bytedance.adsdk.IL.iR.bg<T>> bg;
        private com.bytedance.adsdk.IL.iR.bg<T> bX = null;
        private float eqN = -1.0f;
        private com.bytedance.adsdk.IL.iR.bg<T> IL = bX(0.0f);

        @Override // com.bytedance.adsdk.IL.bg.IL.bg.bX
        public boolean bg() {
            return false;
        }

        eqN(java.util.List<? extends com.bytedance.adsdk.IL.iR.bg<T>> list) {
            this.bg = list;
        }

        @Override // com.bytedance.adsdk.IL.bg.IL.bg.bX
        public boolean bg(float f) {
            if (this.IL.bg(f)) {
                return !this.IL.zx();
            }
            this.IL = bX(f);
            return true;
        }

        private com.bytedance.adsdk.IL.iR.bg<T> bX(float f) {
            java.util.List<? extends com.bytedance.adsdk.IL.iR.bg<T>> list = this.bg;
            com.bytedance.adsdk.IL.iR.bg<T> bgVar = list.get(list.size() - 1);
            if (f >= bgVar.bX()) {
                return bgVar;
            }
            for (int size = this.bg.size() - 2; size > 0; size--) {
                com.bytedance.adsdk.IL.iR.bg<T> bgVar2 = this.bg.get(size);
                if (this.IL != bgVar2 && bgVar2.bg(f)) {
                    return bgVar2;
                }
            }
            return this.bg.get(0);
        }

        @Override // com.bytedance.adsdk.IL.bg.IL.bg.bX
        public com.bytedance.adsdk.IL.iR.bg<T> IL() {
            return this.IL;
        }

        @Override // com.bytedance.adsdk.IL.bg.IL.bg.bX
        public float bX() {
            return this.bg.get(0).bX();
        }

        @Override // com.bytedance.adsdk.IL.bg.IL.bg.bX
        public float eqN() {
            java.util.List<? extends com.bytedance.adsdk.IL.iR.bg<T>> list = this.bg;
            return list.get(list.size() - 1).eqN();
        }

        @Override // com.bytedance.adsdk.IL.bg.IL.bg.bX
        public boolean IL(float f) {
            com.bytedance.adsdk.IL.iR.bg<T> bgVar = this.bX;
            com.bytedance.adsdk.IL.iR.bg<T> bgVar2 = this.IL;
            if (bgVar == bgVar2 && this.eqN == f) {
                return true;
            }
            this.bX = bgVar2;
            this.eqN = f;
            return false;
        }
    }
}
