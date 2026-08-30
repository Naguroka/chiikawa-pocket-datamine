package androidx.core.graphics.drawable;

/* JADX INFO: loaded from: classes.dex */
class WrappedDrawableApi21 extends androidx.core.graphics.drawable.WrappedDrawableApi14 {
    private static final java.lang.String TAG = "WrappedDrawableApi21";
    private static java.lang.reflect.Method sIsProjectedDrawableMethod;

    @Override // androidx.core.graphics.drawable.WrappedDrawableApi14
    protected boolean isCompatTintEnabled() {
        return false;
    }

    WrappedDrawableApi21(android.graphics.drawable.Drawable drawable) {
        super(drawable);
        findAndCacheIsProjectedDrawableMethod();
    }

    WrappedDrawableApi21(androidx.core.graphics.drawable.WrappedDrawableState wrappedDrawableState, android.content.res.Resources resources) {
        super(wrappedDrawableState, resources);
        findAndCacheIsProjectedDrawableMethod();
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f, float f2) {
        this.mDrawable.setHotspot(f, f2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        this.mDrawable.setHotspotBounds(i, i2, i3, i4);
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(android.graphics.Outline outline) {
        this.mDrawable.getOutline(outline);
    }

    @Override // android.graphics.drawable.Drawable
    public android.graphics.Rect getDirtyBounds() {
        return this.mDrawable.getDirtyBounds();
    }

    @Override // androidx.core.graphics.drawable.WrappedDrawableApi14, android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTintList(android.content.res.ColorStateList colorStateList) {
        if (isCompatTintEnabled()) {
            super.setTintList(colorStateList);
        } else {
            this.mDrawable.setTintList(colorStateList);
        }
    }

    @Override // androidx.core.graphics.drawable.WrappedDrawableApi14, android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTint(int i) {
        if (isCompatTintEnabled()) {
            super.setTint(i);
        } else {
            this.mDrawable.setTint(i);
        }
    }

    @Override // androidx.core.graphics.drawable.WrappedDrawableApi14, android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTintMode(android.graphics.PorterDuff.Mode mode) {
        if (isCompatTintEnabled()) {
            super.setTintMode(mode);
        } else {
            this.mDrawable.setTintMode(mode);
        }
    }

    @Override // androidx.core.graphics.drawable.WrappedDrawableApi14, android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        if (!super.setState(iArr)) {
            return false;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isProjected() {
        java.lang.reflect.Method method;
        if (this.mDrawable != null && (method = sIsProjectedDrawableMethod) != null) {
            try {
                return ((java.lang.Boolean) method.invoke(this.mDrawable, new java.lang.Object[0])).booleanValue();
            } catch (java.lang.Exception e) {
                android.util.Log.w(TAG, "Error calling Drawable#isProjected() method", e);
            }
        }
        return false;
    }

    private void findAndCacheIsProjectedDrawableMethod() {
        if (sIsProjectedDrawableMethod == null) {
            try {
                sIsProjectedDrawableMethod = android.graphics.drawable.Drawable.class.getDeclaredMethod("isProjected", new java.lang.Class[0]);
            } catch (java.lang.Exception e) {
                android.util.Log.w(TAG, "Failed to retrieve Drawable#isProjected() method", e);
            }
        }
    }
}
