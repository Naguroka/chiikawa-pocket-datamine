package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
class AppCompatBackgroundHelper {
    private androidx.appcompat.widget.TintInfo mBackgroundTint;
    private androidx.appcompat.widget.TintInfo mInternalBackgroundTint;
    private androidx.appcompat.widget.TintInfo mTmpInfo;
    private final android.view.View mView;
    private int mBackgroundResId = -1;
    private final androidx.appcompat.widget.AppCompatDrawableManager mDrawableManager = androidx.appcompat.widget.AppCompatDrawableManager.get();

    AppCompatBackgroundHelper(android.view.View view) {
        this.mView = view;
    }

    void loadFromAttributes(android.util.AttributeSet attributeSet, int i) {
        androidx.appcompat.widget.TintTypedArray tintTypedArrayObtainStyledAttributes = androidx.appcompat.widget.TintTypedArray.obtainStyledAttributes(this.mView.getContext(), attributeSet, androidx.appcompat.R.styleable.ViewBackgroundHelper, i, 0);
        android.view.View view = this.mView;
        androidx.core.view.ViewCompat.saveAttributeDataForStyleable(view, view.getContext(), androidx.appcompat.R.styleable.ViewBackgroundHelper, attributeSet, tintTypedArrayObtainStyledAttributes.getWrappedTypeArray(), i, 0);
        try {
            if (tintTypedArrayObtainStyledAttributes.hasValue(androidx.appcompat.R.styleable.ViewBackgroundHelper_android_background)) {
                this.mBackgroundResId = tintTypedArrayObtainStyledAttributes.getResourceId(androidx.appcompat.R.styleable.ViewBackgroundHelper_android_background, -1);
                android.content.res.ColorStateList tintList = this.mDrawableManager.getTintList(this.mView.getContext(), this.mBackgroundResId);
                if (tintList != null) {
                    setInternalBackgroundTint(tintList);
                }
            }
            if (tintTypedArrayObtainStyledAttributes.hasValue(androidx.appcompat.R.styleable.ViewBackgroundHelper_backgroundTint)) {
                androidx.core.view.ViewCompat.setBackgroundTintList(this.mView, tintTypedArrayObtainStyledAttributes.getColorStateList(androidx.appcompat.R.styleable.ViewBackgroundHelper_backgroundTint));
            }
            if (tintTypedArrayObtainStyledAttributes.hasValue(androidx.appcompat.R.styleable.ViewBackgroundHelper_backgroundTintMode)) {
                androidx.core.view.ViewCompat.setBackgroundTintMode(this.mView, androidx.appcompat.widget.DrawableUtils.parseTintMode(tintTypedArrayObtainStyledAttributes.getInt(androidx.appcompat.R.styleable.ViewBackgroundHelper_backgroundTintMode, -1), null));
            }
        } finally {
            tintTypedArrayObtainStyledAttributes.recycle();
        }
    }

    void onSetBackgroundResource(int i) {
        this.mBackgroundResId = i;
        androidx.appcompat.widget.AppCompatDrawableManager appCompatDrawableManager = this.mDrawableManager;
        setInternalBackgroundTint(appCompatDrawableManager != null ? appCompatDrawableManager.getTintList(this.mView.getContext(), i) : null);
        applySupportBackgroundTint();
    }

    void onSetBackgroundDrawable(android.graphics.drawable.Drawable drawable) {
        this.mBackgroundResId = -1;
        setInternalBackgroundTint(null);
        applySupportBackgroundTint();
    }

    void setSupportBackgroundTintList(android.content.res.ColorStateList colorStateList) {
        if (this.mBackgroundTint == null) {
            this.mBackgroundTint = new androidx.appcompat.widget.TintInfo();
        }
        this.mBackgroundTint.mTintList = colorStateList;
        this.mBackgroundTint.mHasTintList = true;
        applySupportBackgroundTint();
    }

    android.content.res.ColorStateList getSupportBackgroundTintList() {
        androidx.appcompat.widget.TintInfo tintInfo = this.mBackgroundTint;
        if (tintInfo != null) {
            return tintInfo.mTintList;
        }
        return null;
    }

    void setSupportBackgroundTintMode(android.graphics.PorterDuff.Mode mode) {
        if (this.mBackgroundTint == null) {
            this.mBackgroundTint = new androidx.appcompat.widget.TintInfo();
        }
        this.mBackgroundTint.mTintMode = mode;
        this.mBackgroundTint.mHasTintMode = true;
        applySupportBackgroundTint();
    }

    android.graphics.PorterDuff.Mode getSupportBackgroundTintMode() {
        androidx.appcompat.widget.TintInfo tintInfo = this.mBackgroundTint;
        if (tintInfo != null) {
            return tintInfo.mTintMode;
        }
        return null;
    }

    void applySupportBackgroundTint() {
        android.graphics.drawable.Drawable background = this.mView.getBackground();
        if (background != null) {
            if (shouldApplyFrameworkTintUsingColorFilter() && applyFrameworkTintUsingColorFilter(background)) {
                return;
            }
            androidx.appcompat.widget.TintInfo tintInfo = this.mBackgroundTint;
            if (tintInfo != null) {
                androidx.appcompat.widget.AppCompatDrawableManager.tintDrawable(background, tintInfo, this.mView.getDrawableState());
                return;
            }
            androidx.appcompat.widget.TintInfo tintInfo2 = this.mInternalBackgroundTint;
            if (tintInfo2 != null) {
                androidx.appcompat.widget.AppCompatDrawableManager.tintDrawable(background, tintInfo2, this.mView.getDrawableState());
            }
        }
    }

    void setInternalBackgroundTint(android.content.res.ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.mInternalBackgroundTint == null) {
                this.mInternalBackgroundTint = new androidx.appcompat.widget.TintInfo();
            }
            this.mInternalBackgroundTint.mTintList = colorStateList;
            this.mInternalBackgroundTint.mHasTintList = true;
        } else {
            this.mInternalBackgroundTint = null;
        }
        applySupportBackgroundTint();
    }

    private boolean shouldApplyFrameworkTintUsingColorFilter() {
        return this.mInternalBackgroundTint != null;
    }

    private boolean applyFrameworkTintUsingColorFilter(android.graphics.drawable.Drawable drawable) {
        if (this.mTmpInfo == null) {
            this.mTmpInfo = new androidx.appcompat.widget.TintInfo();
        }
        androidx.appcompat.widget.TintInfo tintInfo = this.mTmpInfo;
        tintInfo.clear();
        android.content.res.ColorStateList backgroundTintList = androidx.core.view.ViewCompat.getBackgroundTintList(this.mView);
        if (backgroundTintList != null) {
            tintInfo.mHasTintList = true;
            tintInfo.mTintList = backgroundTintList;
        }
        android.graphics.PorterDuff.Mode backgroundTintMode = androidx.core.view.ViewCompat.getBackgroundTintMode(this.mView);
        if (backgroundTintMode != null) {
            tintInfo.mHasTintMode = true;
            tintInfo.mTintMode = backgroundTintMode;
        }
        if (!tintInfo.mHasTintList && !tintInfo.mHasTintMode) {
            return false;
        }
        androidx.appcompat.widget.AppCompatDrawableManager.tintDrawable(drawable, tintInfo, this.mView.getDrawableState());
        return true;
    }
}
