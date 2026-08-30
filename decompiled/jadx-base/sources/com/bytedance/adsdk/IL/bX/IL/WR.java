package com.bytedance.adsdk.IL.bX.IL;

/* JADX INFO: loaded from: classes3.dex */
public class WR implements com.bytedance.adsdk.IL.bX.IL.bX {
    private final com.bytedance.adsdk.IL.bX.IL.WR.bg IL;
    private final boolean bX;
    private final java.lang.String bg;

    public enum bg {
        MERGE,
        ADD,
        SUBTRACT,
        INTERSECT,
        EXCLUDE_INTERSECTIONS;

        public static com.bytedance.adsdk.IL.bX.IL.WR.bg bg(int i) {
            if (i == 1) {
                return MERGE;
            }
            if (i == 2) {
                return ADD;
            }
            if (i == 3) {
                return SUBTRACT;
            }
            if (i == 4) {
                return INTERSECT;
            }
            if (i == 5) {
                return EXCLUDE_INTERSECTIONS;
            }
            return MERGE;
        }
    }

    public WR(java.lang.String str, com.bytedance.adsdk.IL.bX.IL.WR.bg bgVar, boolean z) {
        this.bg = str;
        this.IL = bgVar;
        this.bX = z;
    }

    public java.lang.String bg() {
        return this.bg;
    }

    public com.bytedance.adsdk.IL.bX.IL.WR.bg IL() {
        return this.IL;
    }

    public boolean bX() {
        return this.bX;
    }

    @Override // com.bytedance.adsdk.IL.bX.IL.bX
    public com.bytedance.adsdk.IL.bg.bg.bX bg(com.bytedance.adsdk.IL.WR wr, com.bytedance.adsdk.IL.iR iRVar, com.bytedance.adsdk.IL.bX.bX.bg bgVar) {
        return new com.bytedance.adsdk.IL.bg.bg.PX(this);
    }

    public java.lang.String toString() {
        return "MergePaths{mode=" + this.IL + '}';
    }
}
