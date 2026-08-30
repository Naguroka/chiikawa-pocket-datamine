package com.bytedance.adsdk.IL.bg;

/* JADX INFO: loaded from: classes3.dex */
public class bg extends android.graphics.Paint {
    @Override // android.graphics.Paint
    public void setTextLocales(android.os.LocaleList localeList) {
    }

    public bg() {
    }

    public bg(int i) {
        super(i);
    }

    public bg(android.graphics.PorterDuff.Mode mode) {
        setXfermode(new android.graphics.PorterDuffXfermode(mode));
    }

    public bg(int i, android.graphics.PorterDuff.Mode mode) {
        super(i);
        setXfermode(new android.graphics.PorterDuffXfermode(mode));
    }

    @Override // android.graphics.Paint
    public void setAlpha(int i) {
        if (android.os.Build.VERSION.SDK_INT < 29) {
            setColor((com.bytedance.adsdk.IL.ldr.zx.bg(i, 0, 255) << 24) | (getColor() & androidx.core.view.ViewCompat.MEASURED_SIZE_MASK));
        } else {
            super.setAlpha(com.bytedance.adsdk.IL.ldr.zx.bg(i, 0, 255));
        }
    }
}
