package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatImageHelper {
    private androidx.appcompat.widget.TintInfo mImageTint;
    private androidx.appcompat.widget.TintInfo mInternalImageTint;
    private int mLevel = 0;
    private androidx.appcompat.widget.TintInfo mTmpInfo;
    private final android.widget.ImageView mView;

    public AppCompatImageHelper(android.widget.ImageView imageView) {
        this.mView = imageView;
    }

    public void loadFromAttributes(android.util.AttributeSet attributeSet, int i) {
        int resourceId;
        androidx.appcompat.widget.TintTypedArray tintTypedArrayObtainStyledAttributes = androidx.appcompat.widget.TintTypedArray.obtainStyledAttributes(this.mView.getContext(), attributeSet, androidx.appcompat.R.styleable.AppCompatImageView, i, 0);
        android.widget.ImageView imageView = this.mView;
        androidx.core.view.ViewCompat.saveAttributeDataForStyleable(imageView, imageView.getContext(), androidx.appcompat.R.styleable.AppCompatImageView, attributeSet, tintTypedArrayObtainStyledAttributes.getWrappedTypeArray(), i, 0);
        try {
            android.graphics.drawable.Drawable drawable = this.mView.getDrawable();
            if (drawable == null && (resourceId = tintTypedArrayObtainStyledAttributes.getResourceId(androidx.appcompat.R.styleable.AppCompatImageView_srcCompat, -1)) != -1 && (drawable = androidx.appcompat.content.res.AppCompatResources.getDrawable(this.mView.getContext(), resourceId)) != null) {
                this.mView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                androidx.appcompat.widget.DrawableUtils.fixDrawable(drawable);
            }
            if (tintTypedArrayObtainStyledAttributes.hasValue(androidx.appcompat.R.styleable.AppCompatImageView_tint)) {
                androidx.core.widget.ImageViewCompat.setImageTintList(this.mView, tintTypedArrayObtainStyledAttributes.getColorStateList(androidx.appcompat.R.styleable.AppCompatImageView_tint));
            }
            if (tintTypedArrayObtainStyledAttributes.hasValue(androidx.appcompat.R.styleable.AppCompatImageView_tintMode)) {
                androidx.core.widget.ImageViewCompat.setImageTintMode(this.mView, androidx.appcompat.widget.DrawableUtils.parseTintMode(tintTypedArrayObtainStyledAttributes.getInt(androidx.appcompat.R.styleable.AppCompatImageView_tintMode, -1), null));
            }
        } finally {
            tintTypedArrayObtainStyledAttributes.recycle();
        }
    }

    public void setImageResource(int i) {
        if (i != 0) {
            android.graphics.drawable.Drawable drawable = androidx.appcompat.content.res.AppCompatResources.getDrawable(this.mView.getContext(), i);
            if (drawable != null) {
                androidx.appcompat.widget.DrawableUtils.fixDrawable(drawable);
            }
            this.mView.setImageDrawable(drawable);
        } else {
            this.mView.setImageDrawable(null);
        }
        applySupportImageTint();
    }

    boolean hasOverlappingRendering() {
        return !(this.mView.getBackground() instanceof android.graphics.drawable.RippleDrawable);
    }

    void setSupportImageTintList(android.content.res.ColorStateList colorStateList) {
        if (this.mImageTint == null) {
            this.mImageTint = new androidx.appcompat.widget.TintInfo();
        }
        this.mImageTint.mTintList = colorStateList;
        this.mImageTint.mHasTintList = true;
        applySupportImageTint();
    }

    android.content.res.ColorStateList getSupportImageTintList() {
        androidx.appcompat.widget.TintInfo tintInfo = this.mImageTint;
        if (tintInfo != null) {
            return tintInfo.mTintList;
        }
        return null;
    }

    void setSupportImageTintMode(android.graphics.PorterDuff.Mode mode) {
        if (this.mImageTint == null) {
            this.mImageTint = new androidx.appcompat.widget.TintInfo();
        }
        this.mImageTint.mTintMode = mode;
        this.mImageTint.mHasTintMode = true;
        applySupportImageTint();
    }

    android.graphics.PorterDuff.Mode getSupportImageTintMode() {
        androidx.appcompat.widget.TintInfo tintInfo = this.mImageTint;
        if (tintInfo != null) {
            return tintInfo.mTintMode;
        }
        return null;
    }

    void applySupportImageTint() {
        android.graphics.drawable.Drawable drawable = this.mView.getDrawable();
        if (drawable != null) {
            androidx.appcompat.widget.DrawableUtils.fixDrawable(drawable);
        }
        if (drawable != null) {
            if (shouldApplyFrameworkTintUsingColorFilter() && applyFrameworkTintUsingColorFilter(drawable)) {
                return;
            }
            androidx.appcompat.widget.TintInfo tintInfo = this.mImageTint;
            if (tintInfo != null) {
                androidx.appcompat.widget.AppCompatDrawableManager.tintDrawable(drawable, tintInfo, this.mView.getDrawableState());
                return;
            }
            androidx.appcompat.widget.TintInfo tintInfo2 = this.mInternalImageTint;
            if (tintInfo2 != null) {
                androidx.appcompat.widget.AppCompatDrawableManager.tintDrawable(drawable, tintInfo2, this.mView.getDrawableState());
            }
        }
    }

    void setInternalImageTint(android.content.res.ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.mInternalImageTint == null) {
                this.mInternalImageTint = new androidx.appcompat.widget.TintInfo();
            }
            this.mInternalImageTint.mTintList = colorStateList;
            this.mInternalImageTint.mHasTintList = true;
        } else {
            this.mInternalImageTint = null;
        }
        applySupportImageTint();
    }

    private boolean shouldApplyFrameworkTintUsingColorFilter() {
        return this.mInternalImageTint != null;
    }

    private boolean applyFrameworkTintUsingColorFilter(android.graphics.drawable.Drawable drawable) {
        if (this.mTmpInfo == null) {
            this.mTmpInfo = new androidx.appcompat.widget.TintInfo();
        }
        androidx.appcompat.widget.TintInfo tintInfo = this.mTmpInfo;
        tintInfo.clear();
        android.content.res.ColorStateList imageTintList = androidx.core.widget.ImageViewCompat.getImageTintList(this.mView);
        if (imageTintList != null) {
            tintInfo.mHasTintList = true;
            tintInfo.mTintList = imageTintList;
        }
        android.graphics.PorterDuff.Mode imageTintMode = androidx.core.widget.ImageViewCompat.getImageTintMode(this.mView);
        if (imageTintMode != null) {
            tintInfo.mHasTintMode = true;
            tintInfo.mTintMode = imageTintMode;
        }
        if (!tintInfo.mHasTintList && !tintInfo.mHasTintMode) {
            return false;
        }
        androidx.appcompat.widget.AppCompatDrawableManager.tintDrawable(drawable, tintInfo, this.mView.getDrawableState());
        return true;
    }

    void obtainLevelFromDrawable(android.graphics.drawable.Drawable drawable) {
        this.mLevel = drawable.getLevel();
    }

    void applyImageLevel() {
        if (this.mView.getDrawable() != null) {
            this.mView.getDrawable().setLevel(this.mLevel);
        }
    }
}
