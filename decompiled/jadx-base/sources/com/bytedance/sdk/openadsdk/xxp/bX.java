package com.bytedance.sdk.openadsdk.xxp;

/* JADX INFO: loaded from: classes4.dex */
public class bX {
    private static volatile com.bytedance.sdk.openadsdk.xxp.bX bg;
    private final com.bytedance.sdk.component.iR.bg IL;
    private com.bytedance.sdk.openadsdk.xxp.bg.bX bX;

    public static com.bytedance.sdk.openadsdk.xxp.bX bg() {
        if (bg == null) {
            synchronized (com.bytedance.sdk.openadsdk.xxp.bX.class) {
                if (bg == null) {
                    bg = new com.bytedance.sdk.openadsdk.xxp.bX(com.bytedance.sdk.openadsdk.core.VzQ.bg());
                }
            }
        }
        return bg;
    }

    private bX(android.content.Context context) {
        com.bytedance.sdk.component.iR.bg bgVarBg = new com.bytedance.sdk.component.iR.bg.C0112bg().bg(10000L, java.util.concurrent.TimeUnit.MILLISECONDS).IL(10000L, java.util.concurrent.TimeUnit.MILLISECONDS).bX(10000L, java.util.concurrent.TimeUnit.MILLISECONDS).bg(true).bg();
        this.IL = bgVarBg;
        com.bytedance.sdk.component.IL.bg.bg.bg.bg.bg(new com.bytedance.sdk.component.IL.bg.bg.bg.WR() { // from class: com.bytedance.sdk.openadsdk.xxp.bX.1
            @Override // com.bytedance.sdk.component.IL.bg.bg.bg.WR
            public java.util.concurrent.ExecutorService bg() {
                if (com.bytedance.sdk.openadsdk.core.settings.xxp.zU().eK()) {
                    return com.bytedance.sdk.openadsdk.utils.VJ.eo();
                }
                return null;
            }

            @Override // com.bytedance.sdk.component.IL.bg.bg.bg.WR
            public boolean IL() {
                return com.bytedance.sdk.openadsdk.core.settings.xxp.zU().eK();
            }
        });
        com.bytedance.sdk.component.IL.bg.eqN eqnBg = bgVarBg.zx().bg();
        if (eqnBg != null) {
            eqnBg.bg(32);
        }
    }

    public com.bytedance.sdk.component.iR.bg IL() {
        return this.IL;
    }

    public com.bytedance.sdk.openadsdk.xxp.bg.bX bX() {
        eqN();
        return this.bX;
    }

    public void bg(java.lang.String str, int i, int i2, android.widget.ImageView imageView, com.bytedance.sdk.openadsdk.core.model.tuV tuv) {
        com.bytedance.sdk.openadsdk.WR.eqN.bg(str).bg(i).IL(i2).zx(com.bytedance.sdk.openadsdk.utils.ZQc.eqN(com.bytedance.sdk.openadsdk.core.VzQ.bg())).eqN(com.bytedance.sdk.openadsdk.utils.ZQc.bX(com.bytedance.sdk.openadsdk.core.VzQ.bg())).bX(2).bg(com.bytedance.sdk.openadsdk.WR.bX.bg(tuv, str, imageView));
    }

    public void bg(int i, final android.widget.ImageView imageView, final com.bytedance.sdk.openadsdk.core.model.tuV tuv) {
        com.bytedance.sdk.openadsdk.WR.eqN.bg(tuv.ldr()).bg(i).IL(i).zx(com.bytedance.sdk.openadsdk.utils.ZQc.eqN(com.bytedance.sdk.openadsdk.core.VzQ.bg())).eqN(com.bytedance.sdk.openadsdk.utils.ZQc.bX(com.bytedance.sdk.openadsdk.core.VzQ.bg())).bX(2).bg(com.bytedance.sdk.openadsdk.WR.bX.bg(tuv, tuv.ldr(), imageView));
        if (imageView != null) {
            imageView.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.xxp.bX.2
                @Override // android.view.View.OnClickListener
                public void onClick(android.view.View view) {
                    if (imageView.getDrawable() != null) {
                        android.content.Intent intent = new android.content.Intent();
                        java.lang.String strIR = tuv.iR();
                        intent.setAction("android.intent.action.VIEW");
                        intent.setData(android.net.Uri.parse(strIR));
                        try {
                            com.bytedance.sdk.component.utils.IL.bg(com.bytedance.sdk.openadsdk.core.VzQ.bg(), intent, null);
                        } catch (java.lang.Exception unused) {
                        }
                    }
                }
            });
        }
    }

    public void bg(com.bytedance.sdk.openadsdk.core.model.Lq lq, android.widget.ImageView imageView, com.bytedance.sdk.openadsdk.core.model.tuV tuv) {
        if (lq == null || android.text.TextUtils.isEmpty(lq.bg()) || imageView == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.WR.eqN.bg(lq).bX(2).bg(com.bytedance.sdk.openadsdk.WR.bX.bg(tuv, lq.bg(), imageView));
    }

    public void bg(java.lang.String str, android.view.View view) {
        if (view == null || android.text.TextUtils.isEmpty(str)) {
            return;
        }
        final java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(view);
        com.bytedance.sdk.openadsdk.WR.eqN.bg(str).bX(2).bg(new com.bytedance.sdk.component.zx.Kg() { // from class: com.bytedance.sdk.openadsdk.xxp.bX.4
            @Override // com.bytedance.sdk.component.zx.Kg
            public android.graphics.Bitmap bg(android.graphics.Bitmap bitmap) {
                android.view.View view2 = (android.view.View) weakReference.get();
                if (view2 == null) {
                    return null;
                }
                return com.bytedance.sdk.component.adexpress.eqN.bg.bg(view2.getContext(), bitmap, 10);
            }
        }).bg(new com.bytedance.sdk.component.zx.xxp<android.graphics.Bitmap>() { // from class: com.bytedance.sdk.openadsdk.xxp.bX.3
            @Override // com.bytedance.sdk.component.zx.xxp
            public void bg(int i, java.lang.String str2, java.lang.Throwable th) {
            }

            @Override // com.bytedance.sdk.component.zx.xxp
            public void bg(com.bytedance.sdk.component.zx.VB<android.graphics.Bitmap> vb) {
                final android.view.View view2;
                if (vb == null) {
                    return;
                }
                final android.graphics.Bitmap bitmapIL = vb.IL();
                if (!(bitmapIL instanceof android.graphics.Bitmap) || (view2 = (android.view.View) weakReference.get()) == null) {
                    return;
                }
                if (com.bytedance.sdk.openadsdk.utils.VJ.zx()) {
                    if (view2 instanceof android.widget.ImageView) {
                        ((android.widget.ImageView) view2).setImageDrawable(new android.graphics.drawable.BitmapDrawable(view2.getResources(), bitmapIL));
                        return;
                    } else {
                        view2.setBackground(new android.graphics.drawable.BitmapDrawable(view2.getResources(), bitmapIL));
                        return;
                    }
                }
                view2.post(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.xxp.bX.3.1
                    @Override // java.lang.Runnable
                    public void run() {
                        android.view.View view3 = view2;
                        if (view3 instanceof android.widget.ImageView) {
                            ((android.widget.ImageView) view3).setImageDrawable(new android.graphics.drawable.BitmapDrawable(view2.getResources(), (android.graphics.Bitmap) bitmapIL));
                        } else {
                            view3.setBackground(new android.graphics.drawable.BitmapDrawable(view2.getResources(), (android.graphics.Bitmap) bitmapIL));
                        }
                    }
                });
            }
        });
    }

    private void eqN() {
        if (this.bX == null) {
            this.bX = new com.bytedance.sdk.openadsdk.xxp.bg.bX();
        }
    }
}
