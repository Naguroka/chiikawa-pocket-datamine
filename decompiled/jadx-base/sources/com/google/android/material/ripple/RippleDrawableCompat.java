package com.google.android.material.ripple;

/* JADX INFO: loaded from: classes5.dex */
public class RippleDrawableCompat extends android.graphics.drawable.Drawable implements com.google.android.material.shape.Shapeable, androidx.core.graphics.drawable.TintAwareDrawable {
    private com.google.android.material.ripple.RippleDrawableCompat.RippleDrawableCompatState drawableState;

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    public RippleDrawableCompat(com.google.android.material.shape.ShapeAppearanceModel shapeAppearanceModel) {
        this(new com.google.android.material.ripple.RippleDrawableCompat.RippleDrawableCompatState(new com.google.android.material.shape.MaterialShapeDrawable(shapeAppearanceModel)));
    }

    private RippleDrawableCompat(com.google.android.material.ripple.RippleDrawableCompat.RippleDrawableCompatState rippleDrawableCompatState) {
        this.drawableState = rippleDrawableCompatState;
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTint(int i) {
        this.drawableState.delegate.setTint(i);
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTintMode(android.graphics.PorterDuff.Mode mode) {
        this.drawableState.delegate.setTintMode(mode);
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTintList(android.content.res.ColorStateList colorStateList) {
        this.drawableState.delegate.setTintList(colorStateList);
    }

    @Override // com.google.android.material.shape.Shapeable
    public void setShapeAppearanceModel(com.google.android.material.shape.ShapeAppearanceModel shapeAppearanceModel) {
        this.drawableState.delegate.setShapeAppearanceModel(shapeAppearanceModel);
    }

    @Override // com.google.android.material.shape.Shapeable
    public com.google.android.material.shape.ShapeAppearanceModel getShapeAppearanceModel() {
        return this.drawableState.delegate.getShapeAppearanceModel();
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        boolean zOnStateChange = super.onStateChange(iArr);
        if (this.drawableState.delegate.setState(iArr)) {
            zOnStateChange = true;
        }
        boolean zShouldDrawRippleCompat = com.google.android.material.ripple.RippleUtils.shouldDrawRippleCompat(iArr);
        if (this.drawableState.shouldDrawDelegate == zShouldDrawRippleCompat) {
            return zOnStateChange;
        }
        this.drawableState.shouldDrawDelegate = zShouldDrawRippleCompat;
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas canvas) {
        if (this.drawableState.shouldDrawDelegate) {
            this.drawableState.delegate.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(android.graphics.Rect rect) {
        super.onBoundsChange(rect);
        this.drawableState.delegate.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public android.graphics.drawable.Drawable.ConstantState getConstantState() {
        return this.drawableState;
    }

    @Override // android.graphics.drawable.Drawable
    public com.google.android.material.ripple.RippleDrawableCompat mutate() {
        this.drawableState = new com.google.android.material.ripple.RippleDrawableCompat.RippleDrawableCompatState(this.drawableState);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.drawableState.delegate.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter colorFilter) {
        this.drawableState.delegate.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.drawableState.delegate.getOpacity();
    }

    static final class RippleDrawableCompatState extends android.graphics.drawable.Drawable.ConstantState {
        com.google.android.material.shape.MaterialShapeDrawable delegate;
        boolean shouldDrawDelegate;

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        public RippleDrawableCompatState(com.google.android.material.shape.MaterialShapeDrawable materialShapeDrawable) {
            this.delegate = materialShapeDrawable;
            this.shouldDrawDelegate = false;
        }

        public RippleDrawableCompatState(com.google.android.material.ripple.RippleDrawableCompat.RippleDrawableCompatState rippleDrawableCompatState) {
            this.delegate = (com.google.android.material.shape.MaterialShapeDrawable) rippleDrawableCompatState.delegate.getConstantState().newDrawable();
            this.shouldDrawDelegate = rippleDrawableCompatState.shouldDrawDelegate;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public com.google.android.material.ripple.RippleDrawableCompat newDrawable() {
            return new com.google.android.material.ripple.RippleDrawableCompat(new com.google.android.material.ripple.RippleDrawableCompat.RippleDrawableCompatState(this));
        }
    }
}
