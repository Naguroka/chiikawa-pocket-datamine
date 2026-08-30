package androidx.media3.effect;

/* JADX INFO: loaded from: classes.dex */
public abstract class DrawableOverlay extends androidx.media3.effect.BitmapOverlay {
    private android.graphics.Bitmap lastBitmap;
    private android.graphics.drawable.Drawable lastDrawable;

    public abstract android.graphics.drawable.Drawable getDrawable(long j);

    @Override // androidx.media3.effect.BitmapOverlay
    public android.graphics.Bitmap getBitmap(long j) {
        android.graphics.drawable.Drawable drawable = getDrawable(j);
        if (!drawable.equals(this.lastDrawable)) {
            this.lastDrawable = drawable;
            android.graphics.Bitmap bitmap = this.lastBitmap;
            if (bitmap == null || bitmap.getWidth() != this.lastDrawable.getIntrinsicWidth() || this.lastBitmap.getHeight() != this.lastDrawable.getIntrinsicHeight()) {
                this.lastBitmap = android.graphics.Bitmap.createBitmap(this.lastDrawable.getIntrinsicWidth(), this.lastDrawable.getIntrinsicHeight(), android.graphics.Bitmap.Config.ARGB_8888);
            }
            android.graphics.Canvas canvas = new android.graphics.Canvas(this.lastBitmap);
            canvas.drawColor(0, android.graphics.PorterDuff.Mode.CLEAR);
            this.lastDrawable.draw(canvas);
        }
        return (android.graphics.Bitmap) androidx.media3.common.util.Assertions.checkNotNull(this.lastBitmap);
    }

    public static androidx.media3.effect.DrawableOverlay createStaticDrawableOverlay(final android.graphics.drawable.Drawable drawable, final androidx.media3.effect.OverlaySettings overlaySettings) {
        return new androidx.media3.effect.DrawableOverlay() { // from class: androidx.media3.effect.DrawableOverlay.1
            @Override // androidx.media3.effect.DrawableOverlay
            public android.graphics.drawable.Drawable getDrawable(long j) {
                return drawable;
            }

            @Override // androidx.media3.effect.TextureOverlay
            public androidx.media3.effect.OverlaySettings getOverlaySettings(long j) {
                return overlaySettings;
            }
        };
    }
}
