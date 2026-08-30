package com.bytedance.sdk.openadsdk.WR;

/* JADX INFO: loaded from: classes4.dex */
public class bX implements com.bytedance.sdk.component.zx.xxp<android.graphics.Bitmap> {
    private final java.lang.String IL = "ImageLoaderToViewWrapper";
    private final java.lang.ref.WeakReference<android.widget.ImageView> bg;

    @Override // com.bytedance.sdk.component.zx.xxp
    public void bg(int i, java.lang.String str, java.lang.Throwable th) {
    }

    public static com.bytedance.sdk.component.zx.xxp bg(com.bytedance.sdk.openadsdk.core.model.tuV tuv, java.lang.String str, android.widget.ImageView imageView) {
        return new com.bytedance.sdk.openadsdk.WR.IL(tuv, str, new com.bytedance.sdk.openadsdk.WR.bX(imageView));
    }

    private bX(android.widget.ImageView imageView) {
        this.bg = new java.lang.ref.WeakReference<>(imageView);
    }

    @Override // com.bytedance.sdk.component.zx.xxp
    public void bg(com.bytedance.sdk.component.zx.VB<android.graphics.Bitmap> vb) {
        final android.widget.ImageView imageView = this.bg.get();
        if (imageView == null || !(vb.IL() instanceof android.graphics.Bitmap)) {
            return;
        }
        final android.graphics.Bitmap bitmapIL = vb.IL();
        if (com.bytedance.sdk.openadsdk.utils.VJ.zx()) {
            imageView.setImageBitmap(bitmapIL);
        } else {
            com.bytedance.sdk.openadsdk.core.yDt.bX().post(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.WR.bX.1
                @Override // java.lang.Runnable
                public void run() {
                    imageView.setImageBitmap(bitmapIL);
                }
            });
        }
    }
}
