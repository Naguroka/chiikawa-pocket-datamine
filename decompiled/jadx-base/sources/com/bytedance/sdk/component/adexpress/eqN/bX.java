package com.bytedance.sdk.component.adexpress.eqN;

/* JADX INFO: loaded from: classes3.dex */
public class bX {
    public static android.graphics.drawable.Drawable bg(android.content.Context context, com.bytedance.sdk.component.adexpress.dynamic.eqN.iR iRVar) {
        if (context == null || iRVar == null) {
            return null;
        }
        return bg(context, (int) com.bytedance.sdk.component.adexpress.eqN.Kg.bg(context, iRVar.xxp()), iRVar.vb(), iRVar.DDQ());
    }

    public static android.graphics.drawable.Drawable bg(android.content.Context context, int i, int i2, int i3) {
        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
        gradientDrawable.setShape(1);
        if (context != null) {
            gradientDrawable.setStroke(i, i2);
        }
        gradientDrawable.setColor(i3);
        return gradientDrawable;
    }
}
