package com.bytedance.sdk.component.adexpress.dynamic.animation.view;

/* JADX INFO: loaded from: classes3.dex */
public class bX {
    android.graphics.Path IL = new android.graphics.Path();
    android.graphics.Path bX = new android.graphics.Path();
    android.graphics.Paint bg;
    private int eqN;
    private int ldr;
    private int zx;

    public bX() {
        android.graphics.Paint paint = new android.graphics.Paint();
        this.bg = paint;
        paint.setAntiAlias(true);
    }

    public void bg(android.graphics.Canvas canvas, com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation iAnimation, android.view.View view) {
        int iIntValue;
        int iIntValue2;
        java.lang.String str;
        float[] fArrIL;
        if (iAnimation.getRippleValue() != 0.0f) {
            if (com.bytedance.sdk.component.adexpress.bg.bg.bg.bg().bX() != null) {
                try {
                    str = (java.lang.String) view.getTag(2097610712);
                    try {
                        fArrIL = com.bytedance.sdk.component.adexpress.dynamic.eqN.iR.IL(str);
                    } catch (java.lang.Exception unused) {
                        fArrIL = null;
                    }
                } catch (java.lang.Exception unused2) {
                    str = "";
                }
                if (str.startsWith("#")) {
                    this.bg.setColor(android.graphics.Color.parseColor(str));
                    this.bg.setAlpha(90);
                } else if (fArrIL != null) {
                    this.bg.setColor(com.bytedance.sdk.component.adexpress.eqN.Kg.bg(fArrIL[3] * (1.0f - iAnimation.getRippleValue()), fArrIL[0] / 256.0f, fArrIL[1] / 256.0f, fArrIL[2] / 256.0f));
                }
            }
            ((android.view.ViewGroup) view.getParent()).setClipChildren(true);
            int i = this.eqN;
            int i2 = this.zx;
            canvas.drawCircle(i, i2, java.lang.Math.min(i, i2) * 2 * iAnimation.getRippleValue(), this.bg);
        }
        if (iAnimation.getShineValue() != 0.0f) {
            if (view.getParent() != null) {
                ((android.view.ViewGroup) view.getParent()).setClipChildren(true);
            }
            if (view.getParent().getParent() != null) {
                ((android.view.ViewGroup) view.getParent().getParent()).setClipChildren(true);
            }
            this.IL.reset();
            try {
                iIntValue2 = ((java.lang.Integer) view.getTag(2097610711)).intValue();
            } catch (java.lang.Exception unused3) {
                iIntValue2 = 0;
            }
            if (iIntValue2 >= 0) {
                int shineValue = ((int) ((((this.eqN * 4) + (iIntValue2 * 2)) + (this.zx * 2)) * iAnimation.getShineValue())) - ((this.zx * 2) + iIntValue2);
                float f = shineValue;
                int i3 = this.zx;
                this.bg.setShader(new android.graphics.LinearGradient(f, 0.0f, ((iIntValue2 + i3) / 2) + shineValue, i3 / 2, new int[]{android.graphics.Color.parseColor("#20ffffff"), android.graphics.Color.parseColor("#60ffffff"), android.graphics.Color.parseColor("#65ffffff")}, (float[]) null, android.graphics.Shader.TileMode.MIRROR));
                this.bg.setStrokeWidth(this.eqN * 2);
                android.graphics.Path path = this.bX;
                if (path != null) {
                    canvas.clipPath(path, android.graphics.Region.Op.INTERSECT);
                }
                int i4 = shineValue + iIntValue2;
                int i5 = this.zx;
                canvas.drawLine(f, 0.0f, i4 + i5, i5, this.bg);
            }
        }
        if (iAnimation.getMarqueeValue() != 0.0f) {
            try {
                iIntValue = ((java.lang.Integer) view.getTag(2097610709)).intValue();
            } catch (java.lang.Exception unused4) {
                iIntValue = 0;
            }
            if (iIntValue >= 0) {
                this.IL.reset();
                this.IL.moveTo(0.0f, 0.0f);
                this.IL.lineTo(this.eqN * 2, 0.0f);
                this.IL.lineTo(this.eqN * 2, this.zx * 2);
                this.IL.lineTo(0.0f, this.zx * 2);
                this.IL.lineTo(0.0f, 0.0f);
                this.bg.setShader(new android.graphics.LinearGradient(0.0f, 0.0f, this.eqN * 2, this.zx * 2, new int[]{(int) (iAnimation.getMarqueeValue() * (-65536.0f)), (int) ((1.0f - iAnimation.getMarqueeValue()) * (-65536.0f))}, (float[]) null, android.graphics.Shader.TileMode.CLAMP));
                this.bg.setColor(-65536);
                this.bg.setStyle(android.graphics.Paint.Style.STROKE);
                this.bg.setStrokeWidth(iIntValue);
                canvas.drawPath(this.IL, this.bg);
            }
        }
    }

    public void bg(android.view.View view, float f) {
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = (int) (this.ldr * f);
        view.setTranslationX((this.ldr - layoutParams.width) / 2);
        if (view instanceof com.bytedance.sdk.component.adexpress.dynamic.dynamicview.VB) {
            int i = 0;
            while (true) {
                android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
                if (i >= viewGroup.getChildCount()) {
                    break;
                }
                viewGroup.getChildAt(i).setTranslationX((-(this.ldr - layoutParams.width)) / 2);
                i++;
            }
        }
        view.setLayoutParams(layoutParams);
    }

    public void bg(android.view.View view, int i, int i2) {
        java.lang.String str;
        this.eqN = i / 2;
        this.zx = i2 / 2;
        if (this.ldr == 0 && view.getLayoutParams().width > 0) {
            this.ldr = view.getLayoutParams().width;
        }
        try {
            str = (java.lang.String) view.getTag(2097610710);
            try {
                this.bX.addRoundRect(new android.graphics.RectF(0.0f, 0.0f, i, i2), i2 / 2, i2 / 2, android.graphics.Path.Direction.CW);
            } catch (java.lang.Exception unused) {
            }
        } catch (java.lang.Exception unused2) {
            str = "";
        }
        if (androidx.media3.extractor.text.ttml.TtmlNode.RIGHT.equals(str)) {
            view.setPivotX(this.eqN * 2);
            view.setPivotY(this.zx);
        } else if (androidx.media3.extractor.text.ttml.TtmlNode.LEFT.equals(str)) {
            view.setPivotX(0.0f);
            view.setPivotY(this.zx);
        } else {
            view.setPivotX(this.eqN);
            view.setPivotY(this.zx);
        }
    }
}
