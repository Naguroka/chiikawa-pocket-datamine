package com.bytedance.adsdk.IL.IL;

/* JADX INFO: loaded from: classes3.dex */
public class bg {
    private final android.content.res.AssetManager eqN;
    private com.bytedance.adsdk.IL.bX zx;
    private final com.bytedance.adsdk.IL.bX.iR<java.lang.String> bg = new com.bytedance.adsdk.IL.bX.iR<>();
    private final java.util.Map<com.bytedance.adsdk.IL.bX.iR<java.lang.String>, android.graphics.Typeface> IL = new java.util.HashMap();
    private final java.util.Map<java.lang.String, android.graphics.Typeface> bX = new java.util.HashMap();
    private java.lang.String ldr = ".ttf";

    public bg(android.graphics.drawable.Drawable.Callback callback, com.bytedance.adsdk.IL.bX bXVar) {
        this.zx = bXVar;
        if (!(callback instanceof android.view.View)) {
            this.eqN = null;
        } else {
            this.eqN = ((android.view.View) callback).getContext().getAssets();
        }
    }

    public void bg(com.bytedance.adsdk.IL.bX bXVar) {
        this.zx = bXVar;
    }

    public void bg(java.lang.String str) {
        this.ldr = str;
    }

    public android.graphics.Typeface bg(com.bytedance.adsdk.IL.bX.bX bXVar) {
        this.bg.bg(bXVar.bg(), bXVar.bX());
        android.graphics.Typeface typeface = this.IL.get(this.bg);
        if (typeface != null) {
            return typeface;
        }
        android.graphics.Typeface typefaceBg = bg(IL(bXVar), bXVar.bX());
        this.IL.put(this.bg, typefaceBg);
        return typefaceBg;
    }

    private android.graphics.Typeface IL(com.bytedance.adsdk.IL.bX.bX bXVar) {
        android.graphics.Typeface typefaceCreateFromAsset;
        java.lang.String strBg = bXVar.bg();
        android.graphics.Typeface typeface = this.bX.get(strBg);
        if (typeface != null) {
            return typeface;
        }
        java.lang.String strBX = bXVar.bX();
        java.lang.String strIL = bXVar.IL();
        com.bytedance.adsdk.IL.bX bXVar2 = this.zx;
        if (bXVar2 != null) {
            typefaceCreateFromAsset = bXVar2.bg(strBg, strBX, strIL);
            if (typefaceCreateFromAsset == null) {
                typefaceCreateFromAsset = this.zx.bg(strBg);
            }
        } else {
            typefaceCreateFromAsset = null;
        }
        com.bytedance.adsdk.IL.bX bXVar3 = this.zx;
        if (bXVar3 != null && typefaceCreateFromAsset == null) {
            java.lang.String strIL2 = bXVar3.IL(strBg, strBX, strIL);
            if (strIL2 == null) {
                strIL2 = this.zx.IL(strBg);
            }
            if (strIL2 != null) {
                try {
                    typefaceCreateFromAsset = android.graphics.Typeface.createFromAsset(this.eqN, strIL2);
                } catch (java.lang.Throwable unused) {
                    typefaceCreateFromAsset = android.graphics.Typeface.DEFAULT;
                }
            }
        }
        if (bXVar.eqN() != null) {
            return bXVar.eqN();
        }
        if (typefaceCreateFromAsset == null) {
            try {
                typefaceCreateFromAsset = android.graphics.Typeface.createFromAsset(this.eqN, "fonts/" + strBg + this.ldr);
            } catch (java.lang.Throwable unused2) {
                typefaceCreateFromAsset = android.graphics.Typeface.DEFAULT;
            }
        }
        this.bX.put(strBg, typefaceCreateFromAsset);
        return typefaceCreateFromAsset;
    }

    private android.graphics.Typeface bg(android.graphics.Typeface typeface, java.lang.String str) {
        int i;
        boolean zContains = str.contains("Italic");
        boolean zContains2 = str.contains("Bold");
        if (zContains && zContains2) {
            i = 3;
        } else if (zContains) {
            i = 2;
        } else {
            i = zContains2 ? 1 : 0;
        }
        return typeface.getStyle() == i ? typeface : android.graphics.Typeface.create(typeface, i);
    }
}
