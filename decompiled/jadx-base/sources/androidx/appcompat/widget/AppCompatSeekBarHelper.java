package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
class AppCompatSeekBarHelper extends androidx.appcompat.widget.AppCompatProgressBarHelper {
    private boolean mHasTickMarkTint;
    private boolean mHasTickMarkTintMode;
    private android.graphics.drawable.Drawable mTickMark;
    private android.content.res.ColorStateList mTickMarkTintList;
    private android.graphics.PorterDuff.Mode mTickMarkTintMode;
    private final android.widget.SeekBar mView;

    AppCompatSeekBarHelper(android.widget.SeekBar seekBar) {
        super(seekBar);
        this.mTickMarkTintList = null;
        this.mTickMarkTintMode = null;
        this.mHasTickMarkTint = false;
        this.mHasTickMarkTintMode = false;
        this.mView = seekBar;
    }

    @Override // androidx.appcompat.widget.AppCompatProgressBarHelper
    void loadFromAttributes(android.util.AttributeSet attributeSet, int i) {
        super.loadFromAttributes(attributeSet, i);
        androidx.appcompat.widget.TintTypedArray tintTypedArrayObtainStyledAttributes = androidx.appcompat.widget.TintTypedArray.obtainStyledAttributes(this.mView.getContext(), attributeSet, androidx.appcompat.R.styleable.AppCompatSeekBar, i, 0);
        android.widget.SeekBar seekBar = this.mView;
        androidx.core.view.ViewCompat.saveAttributeDataForStyleable(seekBar, seekBar.getContext(), androidx.appcompat.R.styleable.AppCompatSeekBar, attributeSet, tintTypedArrayObtainStyledAttributes.getWrappedTypeArray(), i, 0);
        android.graphics.drawable.Drawable drawableIfKnown = tintTypedArrayObtainStyledAttributes.getDrawableIfKnown(androidx.appcompat.R.styleable.AppCompatSeekBar_android_thumb);
        if (drawableIfKnown != null) {
            this.mView.setThumb(drawableIfKnown);
        }
        setTickMark(tintTypedArrayObtainStyledAttributes.getDrawable(androidx.appcompat.R.styleable.AppCompatSeekBar_tickMark));
        if (tintTypedArrayObtainStyledAttributes.hasValue(androidx.appcompat.R.styleable.AppCompatSeekBar_tickMarkTintMode)) {
            this.mTickMarkTintMode = androidx.appcompat.widget.DrawableUtils.parseTintMode(tintTypedArrayObtainStyledAttributes.getInt(androidx.appcompat.R.styleable.AppCompatSeekBar_tickMarkTintMode, -1), this.mTickMarkTintMode);
            this.mHasTickMarkTintMode = true;
        }
        if (tintTypedArrayObtainStyledAttributes.hasValue(androidx.appcompat.R.styleable.AppCompatSeekBar_tickMarkTint)) {
            this.mTickMarkTintList = tintTypedArrayObtainStyledAttributes.getColorStateList(androidx.appcompat.R.styleable.AppCompatSeekBar_tickMarkTint);
            this.mHasTickMarkTint = true;
        }
        tintTypedArrayObtainStyledAttributes.recycle();
        applyTickMarkTint();
    }

    void setTickMark(android.graphics.drawable.Drawable drawable) {
        android.graphics.drawable.Drawable drawable2 = this.mTickMark;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.mTickMark = drawable;
        if (drawable != null) {
            drawable.setCallback(this.mView);
            androidx.core.graphics.drawable.DrawableCompat.setLayoutDirection(drawable, androidx.core.view.ViewCompat.getLayoutDirection(this.mView));
            if (drawable.isStateful()) {
                drawable.setState(this.mView.getDrawableState());
            }
            applyTickMarkTint();
        }
        this.mView.invalidate();
    }

    android.graphics.drawable.Drawable getTickMark() {
        return this.mTickMark;
    }

    void setTickMarkTintList(android.content.res.ColorStateList colorStateList) {
        this.mTickMarkTintList = colorStateList;
        this.mHasTickMarkTint = true;
        applyTickMarkTint();
    }

    android.content.res.ColorStateList getTickMarkTintList() {
        return this.mTickMarkTintList;
    }

    void setTickMarkTintMode(android.graphics.PorterDuff.Mode mode) {
        this.mTickMarkTintMode = mode;
        this.mHasTickMarkTintMode = true;
        applyTickMarkTint();
    }

    android.graphics.PorterDuff.Mode getTickMarkTintMode() {
        return this.mTickMarkTintMode;
    }

    private void applyTickMarkTint() {
        android.graphics.drawable.Drawable drawable = this.mTickMark;
        if (drawable != null) {
            if (this.mHasTickMarkTint || this.mHasTickMarkTintMode) {
                android.graphics.drawable.Drawable drawableWrap = androidx.core.graphics.drawable.DrawableCompat.wrap(drawable.mutate());
                this.mTickMark = drawableWrap;
                if (this.mHasTickMarkTint) {
                    androidx.core.graphics.drawable.DrawableCompat.setTintList(drawableWrap, this.mTickMarkTintList);
                }
                if (this.mHasTickMarkTintMode) {
                    androidx.core.graphics.drawable.DrawableCompat.setTintMode(this.mTickMark, this.mTickMarkTintMode);
                }
                if (this.mTickMark.isStateful()) {
                    this.mTickMark.setState(this.mView.getDrawableState());
                }
            }
        }
    }

    void jumpDrawablesToCurrentState() {
        android.graphics.drawable.Drawable drawable = this.mTickMark;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    void drawableStateChanged() {
        android.graphics.drawable.Drawable drawable = this.mTickMark;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.mView.getDrawableState())) {
            this.mView.invalidateDrawable(drawable);
        }
    }

    void drawTickMarks(android.graphics.Canvas canvas) {
        if (this.mTickMark != null) {
            int max = this.mView.getMax();
            if (max > 1) {
                int intrinsicWidth = this.mTickMark.getIntrinsicWidth();
                int intrinsicHeight = this.mTickMark.getIntrinsicHeight();
                int i = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i2 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.mTickMark.setBounds(-i, -i2, i, i2);
                float width = ((this.mView.getWidth() - this.mView.getPaddingLeft()) - this.mView.getPaddingRight()) / max;
                int iSave = canvas.save();
                canvas.translate(this.mView.getPaddingLeft(), this.mView.getHeight() / 2);
                for (int i3 = 0; i3 <= max; i3++) {
                    this.mTickMark.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }
}
