package com.unity3d.player.a;

/* JADX INFO: loaded from: classes6.dex */
public final class f extends android.view.View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f3907a;
    final int b;
    int c;
    android.graphics.Bitmap d;
    android.graphics.Bitmap e;

    public f(android.content.Context context, int i) {
        super(context);
        this.c = androidx.core.view.ViewCompat.MEASURED_STATE_MASK;
        this.f3907a = i;
        int identifier = getResources().getIdentifier("unity_static_splash", "drawable", getContext().getPackageName());
        this.b = identifier;
        if (identifier != 0) {
            forceLayout();
        }
        int identifier2 = getResources().getIdentifier("staticSplashScreenBackgroundColor", "color", getContext().getPackageName());
        if (identifier2 != 0) {
            this.c = getResources().getColor(identifier2);
        }
        setBackgroundColor(this.c);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        android.graphics.Bitmap bitmap = this.d;
        if (bitmap != null) {
            bitmap.recycle();
            this.d = null;
        }
        android.graphics.Bitmap bitmap2 = this.e;
        if (bitmap2 != null) {
            bitmap2.recycle();
            this.e = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x006a  */
    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.b == 0) {
            return;
        }
        if (this.d == null) {
            android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
            options.inScaled = false;
            this.d = android.graphics.BitmapFactory.decodeResource(getResources(), this.b, options);
        }
        int width = this.d.getWidth();
        int height = this.d.getHeight();
        int width2 = getWidth();
        int height2 = getHeight();
        if (width2 == 0 || height2 == 0) {
            return;
        }
        float f = width / height;
        float f2 = width2;
        float f3 = height2;
        boolean z2 = f2 / f3 <= f;
        int iA = com.unity3d.player.a.a.a(this.f3907a);
        if (iA == 0) {
            if (width2 < width) {
                height = (int) (f2 / f);
                width = width2;
            }
            if (height2 < height) {
                width = (int) (f3 * f);
                height = height2;
            }
        } else if (iA == 1 || iA == 2) {
            if ((this.f3907a == 3) ^ z2) {
                height = (int) (f2 / f);
                width = width2;
            } else {
                width = (int) (f3 * f);
                height = height2;
            }
        }
        android.graphics.Bitmap bitmap = this.e;
        if (bitmap != null) {
            if (bitmap.getWidth() == width && this.e.getHeight() == height) {
                return;
            }
            android.graphics.Bitmap bitmap2 = this.e;
            if (bitmap2 != this.d) {
                bitmap2.recycle();
                this.e = null;
            }
        }
        android.graphics.Bitmap bitmapCreateScaledBitmap = android.graphics.Bitmap.createScaledBitmap(this.d, width, height, true);
        this.e = bitmapCreateScaledBitmap;
        bitmapCreateScaledBitmap.setDensity(getResources().getDisplayMetrics().densityDpi);
        android.graphics.drawable.ColorDrawable colorDrawable = new android.graphics.drawable.ColorDrawable(this.c);
        android.graphics.drawable.BitmapDrawable bitmapDrawable = new android.graphics.drawable.BitmapDrawable(getResources(), this.e);
        bitmapDrawable.setGravity(17);
        setBackground(new android.graphics.drawable.LayerDrawable(new android.graphics.drawable.Drawable[]{colorDrawable, bitmapDrawable}));
    }
}
