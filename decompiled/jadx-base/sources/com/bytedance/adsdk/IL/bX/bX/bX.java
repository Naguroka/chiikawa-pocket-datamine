package com.bytedance.adsdk.IL.bX.bX;

/* JADX INFO: loaded from: classes3.dex */
public class bX extends com.bytedance.adsdk.IL.bX.bX.eqN {
    private android.widget.LinearLayout Kg;
    private java.lang.String PX;
    private final java.util.List<android.widget.TextView> VB;
    private final android.widget.LinearLayout.LayoutParams WR;
    private final java.util.List<java.lang.String> eo;

    public bX(com.bytedance.adsdk.IL.WR wr, com.bytedance.adsdk.IL.bX.bX.zx zxVar, android.content.Context context) {
        java.util.List<com.bytedance.adsdk.IL.eo.bg> listBX;
        super(wr, zxVar);
        this.WR = new android.widget.LinearLayout.LayoutParams(-2, -2);
        this.eo = new java.util.ArrayList();
        this.VB = new java.util.ArrayList();
        if (this.iR == null || (listBX = this.iR.bX()) == null || listBX.size() <= 0) {
            return;
        }
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(context);
        this.Kg = linearLayout;
        int i = 0;
        linearLayout.setOrientation(0);
        this.Kg.setGravity(17);
        android.widget.LinearLayout linearLayout2 = new android.widget.LinearLayout(context);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(80);
        this.Kg.addView(linearLayout2);
        java.util.List<java.lang.String> listPX = PX();
        while (i < listBX.size()) {
            com.bytedance.adsdk.IL.eo.bg bgVar = listBX.get(i);
            android.widget.TextView textView = new android.widget.TextView(context);
            bg(textView, bgVar, (listPX == null || i >= listPX.size()) ? "" : listPX.get(i));
            if (bgVar.ldr != 0) {
                this.WR.bottomMargin = (int) (bgVar.ldr * com.bytedance.adsdk.IL.ldr.ldr.bg());
                linearLayout2.addView(textView, this.WR);
            } else {
                linearLayout2.addView(textView);
            }
            i++;
        }
        float fBg = com.bytedance.adsdk.IL.ldr.ldr.bg();
        bg(this.Kg, (int) (this.iR.bg() * fBg), (int) (this.iR.IL() * fBg));
    }

    private void bg(android.widget.TextView textView, com.bytedance.adsdk.IL.eo.bg bgVar, java.lang.String str) {
        if (!android.text.TextUtils.isEmpty(str)) {
            textView.setText(str);
        } else {
            textView.setText("");
        }
        if (!android.text.TextUtils.isEmpty(bgVar.bX)) {
            textView.setTextColor(android.graphics.Color.parseColor(bgVar.bX));
        }
        if (!android.text.TextUtils.isEmpty(bgVar.eqN)) {
            textView.setBackgroundColor(android.graphics.Color.parseColor(bgVar.eqN));
        }
        textView.setTextAlignment(4);
        textView.setTextSize(bgVar.zx);
    }

    @Override // com.bytedance.adsdk.IL.bX.bX.eqN, com.bytedance.adsdk.IL.bX.bX.bg
    public void IL(android.graphics.Canvas canvas, android.graphics.Matrix matrix, int i) {
        if (this.Kg != null) {
            canvas.save();
            canvas.concat(matrix);
            bg(i);
            bX(ldr());
            this.Kg.draw(canvas);
            canvas.restore();
            return;
        }
        super.IL(canvas, matrix, i);
    }

    private void bX(float f) {
        java.util.List<com.bytedance.adsdk.IL.eo.bg> listBX;
        if (this.iR == null || (listBX = this.iR.bX()) == null || listBX.size() <= 0) {
            return;
        }
        this.Kg.setOrientation(0);
        this.Kg.setGravity(17);
        if (this.Kg.getChildCount() <= 0) {
            return;
        }
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) this.Kg.getChildAt(0);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(80);
        this.Kg.removeAllViews();
        if (linearLayout.getChildCount() != listBX.size()) {
            return;
        }
        java.util.List<java.lang.String> listPX = PX();
        this.VB.clear();
        int i = 0;
        while (i < listBX.size()) {
            com.bytedance.adsdk.IL.eo.bg bgVar = listBX.get(i);
            android.widget.TextView textView = (android.widget.TextView) linearLayout.getChildAt(i);
            this.VB.add(textView);
            bg(textView, bgVar, (listPX == null || i >= listPX.size()) ? "" : listPX.get(i));
            i++;
        }
        linearLayout.removeAllViews();
        for (int i2 = 0; i2 < listBX.size(); i2++) {
            com.bytedance.adsdk.IL.eo.bg bgVar2 = listBX.get(i2);
            android.widget.TextView textView2 = this.VB.get(i2);
            textView2.setAlpha(f);
            linearLayout.setAlpha(f);
            if (bgVar2.ldr != 0) {
                this.WR.bottomMargin = (int) (bgVar2.ldr * com.bytedance.adsdk.IL.ldr.ldr.bg());
                linearLayout.addView(textView2, this.WR);
            } else {
                linearLayout.addView(textView2);
            }
        }
        this.Kg.setAlpha(f);
        this.Kg.addView(linearLayout);
        float fBg = com.bytedance.adsdk.IL.ldr.ldr.bg();
        bg(this.Kg, (int) (this.iR.bg() * fBg), (int) (this.iR.IL() * fBg));
    }

    private java.util.List<java.lang.String> PX() {
        com.bytedance.adsdk.IL.LZ lzTC;
        java.util.List<com.bytedance.adsdk.IL.eo.bg> listBX;
        if (this.iR == null || this.IL == null || (lzTC = this.IL.tC()) == null) {
            return null;
        }
        java.lang.String strEqN = this.iR.eqN();
        if ((!android.text.TextUtils.isEmpty(strEqN) || !android.text.TextUtils.isEmpty(this.PX)) && (listBX = this.iR.bX()) != null) {
            java.lang.String strBg = this.PX;
            if (android.text.TextUtils.isEmpty(strBg)) {
                strBg = lzTC.bg(strEqN);
            }
            if (!android.text.TextUtils.isEmpty(strBg)) {
                this.eo.clear();
                for (int i = 0; i < listBX.size(); i++) {
                    com.bytedance.adsdk.IL.eo.bg bgVar = listBX.get(i);
                    int length = bgVar.bg;
                    int i2 = bgVar.IL;
                    if (i2 == 0) {
                        this.eo.add(strBg);
                    } else {
                        if (length < 0) {
                            length += strBg.length();
                        }
                        int length2 = i2 < 0 ? strBg.length() + i2 : length + i2;
                        if (length2 > strBg.length()) {
                            length2 = strBg.length();
                        }
                        if (length >= 0 && length < strBg.length() && length2 > length) {
                            this.eo.add(strBg.substring(length, length2));
                        } else {
                            this.eo.add("");
                        }
                    }
                }
                return this.eo;
            }
        }
        return null;
    }

    private static void bg(android.view.View view, int i, int i2) {
        view.layout(0, 0, i, i2);
        view.measure(android.view.View.MeasureSpec.makeMeasureSpec(i, 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(i2, 1073741824));
        view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    public void bg(java.lang.String str) {
        this.PX = str;
    }
}
