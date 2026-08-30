package com.bytedance.sdk.openadsdk.utils;

/* JADX INFO: loaded from: classes4.dex */
public class bX {
    public static void bg(android.view.ViewGroup viewGroup, com.bytedance.sdk.openadsdk.core.model.tuV tuv) {
        if (viewGroup == null || tuv == null || android.text.TextUtils.isEmpty(tuv.Ky())) {
            return;
        }
        try {
            if (viewGroup.getTag(com.bytedance.sdk.openadsdk.utils.Ta.Ky) != null) {
                return;
            }
            int i = com.bytedance.sdk.openadsdk.utils.Ta.Ky;
            viewGroup.setTag(i, java.lang.Integer.valueOf(i));
            android.graphics.drawable.Drawable drawableBg = bg(viewGroup.getResources(), tuv);
            if (drawableBg == null) {
                return;
            }
            viewGroup.setForeground(drawableBg);
        } catch (java.lang.Throwable th) {
            com.bytedance.sdk.component.utils.PX.bg("add overlay fail", th.getMessage());
        }
    }

    public static void bg(android.app.Activity activity, com.bytedance.sdk.openadsdk.core.model.tuV tuv) {
        if (activity == null || tuv == null || android.text.TextUtils.isEmpty(tuv.Ky())) {
            return;
        }
        try {
            if (activity.getWindow().getDecorView().getTag(com.bytedance.sdk.openadsdk.utils.Ta.Ky) != null) {
                return;
            }
            android.view.View decorView = activity.getWindow().getDecorView();
            int i = com.bytedance.sdk.openadsdk.utils.Ta.Ky;
            decorView.setTag(i, java.lang.Integer.valueOf(i));
            android.graphics.drawable.Drawable drawableBg = bg(activity.getResources(), tuv);
            if (drawableBg == null) {
                return;
            }
            activity.getWindow().getDecorView().setForeground(drawableBg);
        } catch (java.lang.Throwable th) {
            com.bytedance.sdk.component.utils.PX.bg("add overlay fail", th.getMessage());
        }
    }

    private static android.graphics.drawable.Drawable bg(android.content.res.Resources resources, com.bytedance.sdk.openadsdk.core.model.tuV tuv) {
        try {
            java.lang.String strKy = tuv.Ky();
            if (android.text.TextUtils.isEmpty(strKy)) {
                return null;
            }
            byte[] bArrDecode = android.util.Base64.decode(strKy, 0);
            android.graphics.drawable.BitmapDrawable bitmapDrawable = new android.graphics.drawable.BitmapDrawable(resources, android.graphics.BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length));
            android.graphics.Shader.TileMode tileMode = android.graphics.Shader.TileMode.REPEAT;
            bitmapDrawable.setTileModeXY(tileMode, tileMode);
            bitmapDrawable.setTargetDensity(resources.getDisplayMetrics());
            return bitmapDrawable;
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    private static class bg implements android.view.View.OnLayoutChangeListener {
        private int IL;
        private int bX;
        private final android.graphics.drawable.Drawable bg;

        public bg(android.graphics.drawable.Drawable drawable) {
            this.bg = drawable;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(android.view.View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            int i9 = i3 - i;
            int i10 = i4 - i2;
            if (i9 == this.IL && i10 == this.bX) {
                return;
            }
            this.IL = i9;
            this.bX = i10;
            this.bg.setBounds(0, 0, i9, i10);
        }
    }
}
