package androidx.core.graphics.drawable;

/* JADX INFO: loaded from: classes.dex */
class WrappedDrawableApi14 extends android.graphics.drawable.Drawable implements android.graphics.drawable.Drawable.Callback, androidx.core.graphics.drawable.WrappedDrawable, androidx.core.graphics.drawable.TintAwareDrawable {
    static final android.graphics.PorterDuff.Mode DEFAULT_TINT_MODE = android.graphics.PorterDuff.Mode.SRC_IN;
    private boolean mColorFilterSet;
    private int mCurrentColor;
    private android.graphics.PorterDuff.Mode mCurrentMode;
    android.graphics.drawable.Drawable mDrawable;
    private boolean mMutated;
    androidx.core.graphics.drawable.WrappedDrawableState mState;

    protected boolean isCompatTintEnabled() {
        return true;
    }

    WrappedDrawableApi14(androidx.core.graphics.drawable.WrappedDrawableState wrappedDrawableState, android.content.res.Resources resources) {
        this.mState = wrappedDrawableState;
        updateLocalState(resources);
    }

    WrappedDrawableApi14(android.graphics.drawable.Drawable drawable) {
        this.mState = mutateConstantState();
        setWrappedDrawable(drawable);
    }

    private void updateLocalState(android.content.res.Resources resources) {
        androidx.core.graphics.drawable.WrappedDrawableState wrappedDrawableState = this.mState;
        if (wrappedDrawableState == null || wrappedDrawableState.mDrawableState == null) {
            return;
        }
        setWrappedDrawable(this.mState.mDrawableState.newDrawable(resources));
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        this.mDrawable.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas canvas) {
        this.mDrawable.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(android.graphics.Rect rect) {
        android.graphics.drawable.Drawable drawable = this.mDrawable;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setChangingConfigurations(int i) {
        this.mDrawable.setChangingConfigurations(i);
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        androidx.core.graphics.drawable.WrappedDrawableState wrappedDrawableState = this.mState;
        return changingConfigurations | (wrappedDrawableState != null ? wrappedDrawableState.getChangingConfigurations() : 0) | this.mDrawable.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        this.mDrawable.setDither(z);
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z) {
        this.mDrawable.setFilterBitmap(z);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.mDrawable.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter colorFilter) {
        this.mDrawable.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        androidx.core.graphics.drawable.WrappedDrawableState wrappedDrawableState;
        android.content.res.ColorStateList colorStateList = (!isCompatTintEnabled() || (wrappedDrawableState = this.mState) == null) ? null : wrappedDrawableState.mTint;
        return (colorStateList != null && colorStateList.isStateful()) || this.mDrawable.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        return updateTint(iArr) || this.mDrawable.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public int[] getState() {
        return this.mDrawable.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public android.graphics.drawable.Drawable getCurrent() {
        return this.mDrawable.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.mDrawable.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.mDrawable.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public android.graphics.Region getTransparentRegion() {
        return this.mDrawable.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.mDrawable.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.mDrawable.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return this.mDrawable.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return this.mDrawable.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(android.graphics.Rect rect) {
        return this.mDrawable.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        androidx.core.graphics.drawable.DrawableCompat.setAutoMirrored(this.mDrawable, z);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return androidx.core.graphics.drawable.DrawableCompat.isAutoMirrored(this.mDrawable);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i) {
        return androidx.core.graphics.drawable.DrawableCompat.setLayoutDirection(this.mDrawable, i);
    }

    @Override // android.graphics.drawable.Drawable
    public int getLayoutDirection() {
        return androidx.core.graphics.drawable.DrawableCompat.getLayoutDirection(this.mDrawable);
    }

    @Override // android.graphics.drawable.Drawable
    public android.graphics.drawable.Drawable.ConstantState getConstantState() {
        androidx.core.graphics.drawable.WrappedDrawableState wrappedDrawableState = this.mState;
        if (wrappedDrawableState == null || !wrappedDrawableState.canConstantState()) {
            return null;
        }
        this.mState.mChangingConfigurations = getChangingConfigurations();
        return this.mState;
    }

    @Override // android.graphics.drawable.Drawable
    public android.graphics.drawable.Drawable mutate() {
        if (!this.mMutated && super.mutate() == this) {
            this.mState = mutateConstantState();
            android.graphics.drawable.Drawable drawable = this.mDrawable;
            if (drawable != null) {
                drawable.mutate();
            }
            androidx.core.graphics.drawable.WrappedDrawableState wrappedDrawableState = this.mState;
            if (wrappedDrawableState != null) {
                android.graphics.drawable.Drawable drawable2 = this.mDrawable;
                wrappedDrawableState.mDrawableState = drawable2 != null ? drawable2.getConstantState() : null;
            }
            this.mMutated = true;
        }
        return this;
    }

    private androidx.core.graphics.drawable.WrappedDrawableState mutateConstantState() {
        return new androidx.core.graphics.drawable.WrappedDrawableState(this.mState);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(android.graphics.drawable.Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(android.graphics.drawable.Drawable drawable, java.lang.Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(android.graphics.drawable.Drawable drawable, java.lang.Runnable runnable) {
        unscheduleSelf(runnable);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i) {
        return this.mDrawable.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTint(int i) {
        setTintList(android.content.res.ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTintList(android.content.res.ColorStateList colorStateList) {
        this.mState.mTint = colorStateList;
        updateTint(getState());
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTintMode(android.graphics.PorterDuff.Mode mode) {
        this.mState.mTintMode = mode;
        updateTint(getState());
    }

    private boolean updateTint(int[] iArr) {
        if (!isCompatTintEnabled()) {
            return false;
        }
        android.content.res.ColorStateList colorStateList = this.mState.mTint;
        android.graphics.PorterDuff.Mode mode = this.mState.mTintMode;
        if (colorStateList != null && mode != null) {
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (!this.mColorFilterSet || colorForState != this.mCurrentColor || mode != this.mCurrentMode) {
                setColorFilter(colorForState, mode);
                this.mCurrentColor = colorForState;
                this.mCurrentMode = mode;
                this.mColorFilterSet = true;
                return true;
            }
        } else {
            this.mColorFilterSet = false;
            clearColorFilter();
        }
        return false;
    }

    @Override // androidx.core.graphics.drawable.WrappedDrawable
    public final android.graphics.drawable.Drawable getWrappedDrawable() {
        return this.mDrawable;
    }

    @Override // androidx.core.graphics.drawable.WrappedDrawable
    public final void setWrappedDrawable(android.graphics.drawable.Drawable drawable) {
        android.graphics.drawable.Drawable drawable2 = this.mDrawable;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.mDrawable = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            androidx.core.graphics.drawable.WrappedDrawableState wrappedDrawableState = this.mState;
            if (wrappedDrawableState != null) {
                wrappedDrawableState.mDrawableState = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }
}
