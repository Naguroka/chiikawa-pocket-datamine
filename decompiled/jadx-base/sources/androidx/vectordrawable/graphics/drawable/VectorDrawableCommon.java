package androidx.vectordrawable.graphics.drawable;

/* JADX INFO: loaded from: classes3.dex */
abstract class VectorDrawableCommon extends android.graphics.drawable.Drawable implements androidx.core.graphics.drawable.TintAwareDrawable {
    android.graphics.drawable.Drawable mDelegateDrawable;

    VectorDrawableCommon() {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(int i, android.graphics.PorterDuff.Mode mode) {
        android.graphics.drawable.Drawable drawable = this.mDelegateDrawable;
        if (drawable != null) {
            drawable.setColorFilter(i, mode);
        } else {
            super.setColorFilter(i, mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i) {
        android.graphics.drawable.Drawable drawable = this.mDelegateDrawable;
        if (drawable != null) {
            return drawable.setLevel(i);
        }
        return super.onLevelChange(i);
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(android.graphics.Rect rect) {
        android.graphics.drawable.Drawable drawable = this.mDelegateDrawable;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            super.onBoundsChange(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f, float f2) {
        android.graphics.drawable.Drawable drawable = this.mDelegateDrawable;
        if (drawable != null) {
            androidx.core.graphics.drawable.DrawableCompat.setHotspot(drawable, f, f2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        android.graphics.drawable.Drawable drawable = this.mDelegateDrawable;
        if (drawable != null) {
            androidx.core.graphics.drawable.DrawableCompat.setHotspotBounds(drawable, i, i2, i3, i4);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z) {
        android.graphics.drawable.Drawable drawable = this.mDelegateDrawable;
        if (drawable != null) {
            drawable.setFilterBitmap(z);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        android.graphics.drawable.Drawable drawable = this.mDelegateDrawable;
        if (drawable != null) {
            androidx.core.graphics.drawable.DrawableCompat.jumpToCurrentState(drawable);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(android.content.res.Resources.Theme theme) {
        android.graphics.drawable.Drawable drawable = this.mDelegateDrawable;
        if (drawable != null) {
            androidx.core.graphics.drawable.DrawableCompat.applyTheme(drawable, theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void clearColorFilter() {
        android.graphics.drawable.Drawable drawable = this.mDelegateDrawable;
        if (drawable != null) {
            drawable.clearColorFilter();
        } else {
            super.clearColorFilter();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public android.graphics.drawable.Drawable getCurrent() {
        android.graphics.drawable.Drawable drawable = this.mDelegateDrawable;
        if (drawable != null) {
            return drawable.getCurrent();
        }
        return super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        android.graphics.drawable.Drawable drawable = this.mDelegateDrawable;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        android.graphics.drawable.Drawable drawable = this.mDelegateDrawable;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return super.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(android.graphics.Rect rect) {
        android.graphics.drawable.Drawable drawable = this.mDelegateDrawable;
        if (drawable != null) {
            return drawable.getPadding(rect);
        }
        return super.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public int[] getState() {
        android.graphics.drawable.Drawable drawable = this.mDelegateDrawable;
        if (drawable != null) {
            return drawable.getState();
        }
        return super.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public android.graphics.Region getTransparentRegion() {
        android.graphics.drawable.Drawable drawable = this.mDelegateDrawable;
        if (drawable != null) {
            return drawable.getTransparentRegion();
        }
        return super.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable
    public void setChangingConfigurations(int i) {
        android.graphics.drawable.Drawable drawable = this.mDelegateDrawable;
        if (drawable != null) {
            drawable.setChangingConfigurations(i);
        } else {
            super.setChangingConfigurations(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        android.graphics.drawable.Drawable drawable = this.mDelegateDrawable;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        return super.setState(iArr);
    }
}
