package com.bytedance.adsdk.ugeno.bg.IL;

/* JADX INFO: loaded from: classes3.dex */
public class IL extends com.bytedance.adsdk.ugeno.bg.IL.bg {
    public IL(android.content.Context context, com.bytedance.adsdk.ugeno.IL.bX bXVar, java.lang.String str, java.util.TreeMap<java.lang.Float, java.lang.String> treeMap) {
        super(context, bXVar, str, treeMap);
    }

    /* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.bg.IL.IL$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] bg;

        static {
            int[] iArr = new int[com.bytedance.adsdk.ugeno.bg.eqN.values().length];
            bg = iArr;
            try {
                iArr[com.bytedance.adsdk.ugeno.bg.eqN.TRANSLATE_X.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                bg[com.bytedance.adsdk.ugeno.bg.eqN.TRANSLATE_Y.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                bg[com.bytedance.adsdk.ugeno.bg.eqN.SCALE_X.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                bg[com.bytedance.adsdk.ugeno.bg.eqN.SCALE_Y.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                bg[com.bytedance.adsdk.ugeno.bg.eqN.ROTATE_X.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                bg[com.bytedance.adsdk.ugeno.bg.eqN.ROTATE_Y.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                bg[com.bytedance.adsdk.ugeno.bg.eqN.ROTATE_Z.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                bg[com.bytedance.adsdk.ugeno.bg.eqN.ALPHA.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                bg[com.bytedance.adsdk.ugeno.bg.eqN.BORDER_RADIUS.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
        }
    }

    @Override // com.bytedance.adsdk.ugeno.bg.IL.bg
    public void IL() {
        float fPX;
        switch (com.bytedance.adsdk.ugeno.bg.IL.IL.AnonymousClass1.bg[this.eqN.ordinal()]) {
            case 1:
                fPX = this.iR.PX();
                break;
            case 2:
                fPX = this.iR.Ta();
                break;
            case 3:
                fPX = this.iR.yDt();
                break;
            case 4:
                fPX = this.iR.Lq();
                break;
            case 5:
                fPX = this.iR.vb();
                break;
            case 6:
                fPX = this.iR.xxp();
                break;
            case 7:
                fPX = this.iR.VzQ();
                break;
            case 8:
                fPX = this.iR.tuV();
                break;
            case 9:
                fPX = this.iR.Fy();
                break;
            default:
                fPX = 0.0f;
                break;
        }
        this.zx.add(android.animation.Keyframe.ofFloat(0.0f, fPX));
    }

    @Override // com.bytedance.adsdk.ugeno.bg.IL.bg
    public void bg(float f, java.lang.String str) {
        float fBg;
        if (this.IL.startsWith(com.bytedance.adsdk.ugeno.bg.eqN.TRANSLATE.bg()) || this.eqN == com.bytedance.adsdk.ugeno.bg.eqN.BORDER_RADIUS) {
            fBg = com.bytedance.adsdk.ugeno.iR.Kg.bg(this.bg, com.bytedance.adsdk.ugeno.iR.bX.bg(str, 0.0f));
        } else {
            fBg = com.bytedance.adsdk.ugeno.iR.bX.bg(str, 0.0f);
        }
        this.zx.add(android.animation.Keyframe.ofFloat(f, fBg));
    }

    @Override // com.bytedance.adsdk.ugeno.bg.IL.bg
    public android.animation.TypeEvaluator ldr() {
        return new android.animation.FloatEvaluator();
    }
}
