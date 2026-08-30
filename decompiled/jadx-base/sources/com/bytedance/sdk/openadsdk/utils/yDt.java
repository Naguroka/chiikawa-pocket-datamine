package com.bytedance.sdk.openadsdk.utils;

/* JADX INFO: loaded from: classes4.dex */
public class yDt {

    public interface bg {
        void bg();

        void bg(com.bytedance.sdk.openadsdk.xxp.bg.IL il);
    }

    public static void bg(com.bytedance.sdk.openadsdk.xxp.bg bgVar, int i, int i2, com.bytedance.sdk.openadsdk.utils.yDt.bg bgVar2, java.lang.String str) {
        bg(bgVar, i, i2, bgVar2, str, 0);
    }

    public static void bg(com.bytedance.sdk.openadsdk.xxp.bg bgVar, int i, int i2, final com.bytedance.sdk.openadsdk.utils.yDt.bg bgVar2, java.lang.String str, int i3) {
        com.bytedance.sdk.component.utils.PX.bg("splashLoadAd", " getImageBytes url ".concat(java.lang.String.valueOf(bgVar)));
        com.bytedance.sdk.openadsdk.xxp.bX.bg().bX().bg(bgVar, new com.bytedance.sdk.openadsdk.xxp.bg.bg.InterfaceC0169bg() { // from class: com.bytedance.sdk.openadsdk.utils.yDt.1
            @Override // com.bytedance.sdk.openadsdk.xxp.bg.bg.InterfaceC0169bg
            public void bg(java.lang.String str2, com.bytedance.sdk.openadsdk.xxp.bg.IL il) {
                com.bytedance.sdk.openadsdk.utils.yDt.bg bgVar3;
                if (il.eqN() && (bgVar3 = bgVar2) != null) {
                    bgVar3.bg(il);
                    return;
                }
                com.bytedance.sdk.openadsdk.utils.yDt.bg bgVar4 = bgVar2;
                if (bgVar4 != null) {
                    bgVar4.bg();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.xxp.bg.bg.InterfaceC0169bg
            public void bg(int i4, java.lang.String str2, java.lang.Throwable th) {
                com.bytedance.sdk.openadsdk.utils.yDt.bg bgVar3 = bgVar2;
                if (bgVar3 != null) {
                    bgVar3.bg();
                }
            }
        }, i, i2, android.widget.ImageView.ScaleType.CENTER_INSIDE, str, i3, null);
    }

    public static android.graphics.drawable.Drawable bg(byte[] bArr, int i) {
        if (bArr == null || bArr.length <= 0) {
            return new android.graphics.drawable.ColorDrawable(0);
        }
        try {
            return new android.graphics.drawable.BitmapDrawable(android.graphics.BitmapFactory.decodeByteArray(bArr, 0, bArr.length));
        } catch (java.lang.Throwable unused) {
            return new android.graphics.drawable.ColorDrawable(0);
        }
    }
}
