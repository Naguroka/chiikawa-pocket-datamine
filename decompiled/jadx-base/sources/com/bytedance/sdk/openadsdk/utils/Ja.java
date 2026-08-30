package com.bytedance.sdk.openadsdk.utils;

/* JADX INFO: loaded from: classes4.dex */
public class Ja implements com.bytedance.sdk.component.zx.xxp<android.graphics.Bitmap> {
    private final java.lang.ref.WeakReference<android.widget.ImageView> bg;

    public Ja(android.widget.ImageView imageView) {
        this.bg = new java.lang.ref.WeakReference<>(imageView);
    }

    @Override // com.bytedance.sdk.component.zx.xxp
    public void bg(com.bytedance.sdk.component.zx.VB<android.graphics.Bitmap> vb) {
        android.widget.ImageView imageView = this.bg.get();
        if (imageView == null) {
            return;
        }
        if (vb != null) {
            try {
                if (vb.IL() != null) {
                    imageView.setImageBitmap(vb.IL());
                    return;
                }
            } catch (java.lang.Throwable unused) {
                imageView.setVisibility(8);
                return;
            }
        }
        imageView.setVisibility(8);
    }

    @Override // com.bytedance.sdk.component.zx.xxp
    public void bg(int i, java.lang.String str, java.lang.Throwable th) {
        android.widget.ImageView imageView = this.bg.get();
        if (imageView == null) {
            return;
        }
        imageView.setVisibility(8);
    }
}
