package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
class AppCompatCheckedTextViewHelper {
    private android.content.res.ColorStateList mCheckMarkTintList = null;
    private android.graphics.PorterDuff.Mode mCheckMarkTintMode = null;
    private boolean mHasCheckMarkTint = false;
    private boolean mHasCheckMarkTintMode = false;
    private boolean mSkipNextApply;
    private final android.widget.CheckedTextView mView;

    AppCompatCheckedTextViewHelper(android.widget.CheckedTextView checkedTextView) {
        this.mView = checkedTextView;
    }

    void loadFromAttributes(android.util.AttributeSet attributeSet, int i) {
        boolean z;
        int resourceId;
        int resourceId2;
        androidx.appcompat.widget.TintTypedArray tintTypedArrayObtainStyledAttributes = androidx.appcompat.widget.TintTypedArray.obtainStyledAttributes(this.mView.getContext(), attributeSet, androidx.appcompat.R.styleable.CheckedTextView, i, 0);
        android.widget.CheckedTextView checkedTextView = this.mView;
        androidx.core.view.ViewCompat.saveAttributeDataForStyleable(checkedTextView, checkedTextView.getContext(), androidx.appcompat.R.styleable.CheckedTextView, attributeSet, tintTypedArrayObtainStyledAttributes.getWrappedTypeArray(), i, 0);
        try {
            if (!tintTypedArrayObtainStyledAttributes.hasValue(androidx.appcompat.R.styleable.CheckedTextView_checkMarkCompat) || (resourceId2 = tintTypedArrayObtainStyledAttributes.getResourceId(androidx.appcompat.R.styleable.CheckedTextView_checkMarkCompat, 0)) == 0) {
                z = false;
            } else {
                try {
                    android.widget.CheckedTextView checkedTextView2 = this.mView;
                    checkedTextView2.setCheckMarkDrawable(androidx.appcompat.content.res.AppCompatResources.getDrawable(checkedTextView2.getContext(), resourceId2));
                    z = true;
                } catch (android.content.res.Resources.NotFoundException unused) {
                    z = false;
                }
            }
            if (!z && tintTypedArrayObtainStyledAttributes.hasValue(androidx.appcompat.R.styleable.CheckedTextView_android_checkMark) && (resourceId = tintTypedArrayObtainStyledAttributes.getResourceId(androidx.appcompat.R.styleable.CheckedTextView_android_checkMark, 0)) != 0) {
                android.widget.CheckedTextView checkedTextView3 = this.mView;
                checkedTextView3.setCheckMarkDrawable(androidx.appcompat.content.res.AppCompatResources.getDrawable(checkedTextView3.getContext(), resourceId));
            }
            if (tintTypedArrayObtainStyledAttributes.hasValue(androidx.appcompat.R.styleable.CheckedTextView_checkMarkTint)) {
                androidx.core.widget.CheckedTextViewCompat.setCheckMarkTintList(this.mView, tintTypedArrayObtainStyledAttributes.getColorStateList(androidx.appcompat.R.styleable.CheckedTextView_checkMarkTint));
            }
            if (tintTypedArrayObtainStyledAttributes.hasValue(androidx.appcompat.R.styleable.CheckedTextView_checkMarkTintMode)) {
                androidx.core.widget.CheckedTextViewCompat.setCheckMarkTintMode(this.mView, androidx.appcompat.widget.DrawableUtils.parseTintMode(tintTypedArrayObtainStyledAttributes.getInt(androidx.appcompat.R.styleable.CheckedTextView_checkMarkTintMode, -1), null));
            }
        } finally {
            tintTypedArrayObtainStyledAttributes.recycle();
        }
    }

    void setSupportCheckMarkTintList(android.content.res.ColorStateList colorStateList) {
        this.mCheckMarkTintList = colorStateList;
        this.mHasCheckMarkTint = true;
        applyCheckMarkTint();
    }

    android.content.res.ColorStateList getSupportCheckMarkTintList() {
        return this.mCheckMarkTintList;
    }

    void setSupportCheckMarkTintMode(android.graphics.PorterDuff.Mode mode) {
        this.mCheckMarkTintMode = mode;
        this.mHasCheckMarkTintMode = true;
        applyCheckMarkTint();
    }

    android.graphics.PorterDuff.Mode getSupportCheckMarkTintMode() {
        return this.mCheckMarkTintMode;
    }

    void onSetCheckMarkDrawable() {
        if (this.mSkipNextApply) {
            this.mSkipNextApply = false;
        } else {
            this.mSkipNextApply = true;
            applyCheckMarkTint();
        }
    }

    void applyCheckMarkTint() {
        android.graphics.drawable.Drawable checkMarkDrawable = androidx.core.widget.CheckedTextViewCompat.getCheckMarkDrawable(this.mView);
        if (checkMarkDrawable != null) {
            if (this.mHasCheckMarkTint || this.mHasCheckMarkTintMode) {
                android.graphics.drawable.Drawable drawableMutate = androidx.core.graphics.drawable.DrawableCompat.wrap(checkMarkDrawable).mutate();
                if (this.mHasCheckMarkTint) {
                    androidx.core.graphics.drawable.DrawableCompat.setTintList(drawableMutate, this.mCheckMarkTintList);
                }
                if (this.mHasCheckMarkTintMode) {
                    androidx.core.graphics.drawable.DrawableCompat.setTintMode(drawableMutate, this.mCheckMarkTintMode);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(this.mView.getDrawableState());
                }
                this.mView.setCheckMarkDrawable(drawableMutate);
            }
        }
    }
}
