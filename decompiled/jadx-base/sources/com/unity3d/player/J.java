package com.unity3d.player;

/* JADX INFO: loaded from: classes6.dex */
final class J extends android.view.View implements android.view.PixelCopy.OnPixelCopyFinishedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    android.graphics.Bitmap f3872a;

    J(android.content.Context context) {
        super(context);
    }

    public final void a(android.view.SurfaceView surfaceView) {
        android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(surfaceView.getWidth(), surfaceView.getHeight(), android.graphics.Bitmap.Config.ARGB_8888);
        this.f3872a = bitmapCreateBitmap;
        android.view.PixelCopy.request(surfaceView, bitmapCreateBitmap, this, new android.os.Handler(android.os.Looper.getMainLooper()));
    }

    @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
    public final void onPixelCopyFinished(int i) {
        if (i == 0) {
            setBackground(new android.graphics.drawable.LayerDrawable(new android.graphics.drawable.Drawable[]{new android.graphics.drawable.ColorDrawable(androidx.core.view.ViewCompat.MEASURED_STATE_MASK), new android.graphics.drawable.BitmapDrawable(getResources(), this.f3872a)}));
        }
    }
}
