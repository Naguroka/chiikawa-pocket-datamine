package androidx.core.graphics.drawable;

/* JADX INFO: loaded from: classes.dex */
final class WrappedDrawableState extends android.graphics.drawable.Drawable.ConstantState {
    int mChangingConfigurations;
    android.graphics.drawable.Drawable.ConstantState mDrawableState;
    android.content.res.ColorStateList mTint;
    android.graphics.PorterDuff.Mode mTintMode;

    WrappedDrawableState(androidx.core.graphics.drawable.WrappedDrawableState wrappedDrawableState) {
        this.mTint = null;
        this.mTintMode = androidx.core.graphics.drawable.WrappedDrawableApi14.DEFAULT_TINT_MODE;
        if (wrappedDrawableState != null) {
            this.mChangingConfigurations = wrappedDrawableState.mChangingConfigurations;
            this.mDrawableState = wrappedDrawableState.mDrawableState;
            this.mTint = wrappedDrawableState.mTint;
            this.mTintMode = wrappedDrawableState.mTintMode;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public android.graphics.drawable.Drawable newDrawable() {
        return newDrawable(null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public android.graphics.drawable.Drawable newDrawable(android.content.res.Resources resources) {
        return new androidx.core.graphics.drawable.WrappedDrawableApi21(this, resources);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        int i = this.mChangingConfigurations;
        android.graphics.drawable.Drawable.ConstantState constantState = this.mDrawableState;
        return i | (constantState != null ? constantState.getChangingConfigurations() : 0);
    }

    boolean canConstantState() {
        return this.mDrawableState != null;
    }
}
