package com.bytedance.adsdk.IL;

/* JADX INFO: loaded from: classes3.dex */
public class tuV {
    private boolean bg = false;
    private final java.util.Set<java.lang.Object> IL = new com.bytedance.adsdk.IL.bg();
    private final java.util.Map<java.lang.String, com.bytedance.adsdk.IL.ldr.eqN> bX = new java.util.HashMap();
    private final java.util.Comparator<android.util.Pair<java.lang.String, java.lang.Float>> eqN = new java.util.Comparator<android.util.Pair<java.lang.String, java.lang.Float>>() { // from class: com.bytedance.adsdk.IL.tuV.1
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: bg, reason: merged with bridge method [inline-methods] */
        public int compare(android.util.Pair<java.lang.String, java.lang.Float> pair, android.util.Pair<java.lang.String, java.lang.Float> pair2) {
            float fFloatValue = ((java.lang.Float) pair.second).floatValue();
            float fFloatValue2 = ((java.lang.Float) pair2.second).floatValue();
            if (fFloatValue2 > fFloatValue) {
                return 1;
            }
            return fFloatValue > fFloatValue2 ? -1 : 0;
        }
    };

    void bg(boolean z) {
        this.bg = z;
    }

    public void bg(java.lang.String str, float f) {
        if (this.bg) {
            com.bytedance.adsdk.IL.ldr.eqN eqn = this.bX.get(str);
            if (eqn == null) {
                eqn = new com.bytedance.adsdk.IL.ldr.eqN();
                this.bX.put(str, eqn);
            }
            eqn.bg(f);
            if (str.equals("__container")) {
                java.util.Iterator<java.lang.Object> it = this.IL.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }
        }
    }
}
