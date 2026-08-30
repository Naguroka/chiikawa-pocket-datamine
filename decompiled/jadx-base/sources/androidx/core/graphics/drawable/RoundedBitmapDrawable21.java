package androidx.core.graphics.drawable;

/* JADX INFO: loaded from: classes.dex */
class RoundedBitmapDrawable21 extends androidx.core.graphics.drawable.RoundedBitmapDrawable {
    protected RoundedBitmapDrawable21(android.content.res.Resources resources, android.graphics.Bitmap bitmap) {
        super(resources, bitmap);
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(android.graphics.Outline outline) {
        updateDstRect();
        outline.setRoundRect(this.mDstRect, getCornerRadius());
    }

    @Override // androidx.core.graphics.drawable.RoundedBitmapDrawable
    public void setMipMap(boolean z) {
        if (this.mBitmap != null) {
            this.mBitmap.setHasMipMap(z);
            invalidateSelf();
        }
    }

    @Override // androidx.core.graphics.drawable.RoundedBitmapDrawable
    public boolean hasMipMap() {
        return this.mBitmap != null && this.mBitmap.hasMipMap();
    }

    @Override // androidx.core.graphics.drawable.RoundedBitmapDrawable
    void gravityCompatApply(int i, int i2, int i3, android.graphics.Rect rect, android.graphics.Rect rect2) {
        android.view.Gravity.apply(i, i2, i3, rect, rect2, 0);
    }
}
