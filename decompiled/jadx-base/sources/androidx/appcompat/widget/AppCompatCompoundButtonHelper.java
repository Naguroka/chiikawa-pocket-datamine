package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
class AppCompatCompoundButtonHelper {
    private android.content.res.ColorStateList mButtonTintList = null;
    private android.graphics.PorterDuff.Mode mButtonTintMode = null;
    private boolean mHasButtonTint = false;
    private boolean mHasButtonTintMode = false;
    private boolean mSkipNextApply;
    private final android.widget.CompoundButton mView;

    int getCompoundPaddingLeft(int i) {
        return i;
    }

    AppCompatCompoundButtonHelper(android.widget.CompoundButton compoundButton) {
        this.mView = compoundButton;
    }

    void loadFromAttributes(android.util.AttributeSet attributeSet, int i) {
        boolean z;
        int resourceId;
        int resourceId2;
        androidx.appcompat.widget.TintTypedArray tintTypedArrayObtainStyledAttributes = androidx.appcompat.widget.TintTypedArray.obtainStyledAttributes(this.mView.getContext(), attributeSet, androidx.appcompat.R.styleable.CompoundButton, i, 0);
        android.widget.CompoundButton compoundButton = this.mView;
        androidx.core.view.ViewCompat.saveAttributeDataForStyleable(compoundButton, compoundButton.getContext(), androidx.appcompat.R.styleable.CompoundButton, attributeSet, tintTypedArrayObtainStyledAttributes.getWrappedTypeArray(), i, 0);
        try {
            if (!tintTypedArrayObtainStyledAttributes.hasValue(androidx.appcompat.R.styleable.CompoundButton_buttonCompat) || (resourceId2 = tintTypedArrayObtainStyledAttributes.getResourceId(androidx.appcompat.R.styleable.CompoundButton_buttonCompat, 0)) == 0) {
                z = false;
            } else {
                try {
                    android.widget.CompoundButton compoundButton2 = this.mView;
                    compoundButton2.setButtonDrawable(androidx.appcompat.content.res.AppCompatResources.getDrawable(compoundButton2.getContext(), resourceId2));
                    z = true;
                } catch (android.content.res.Resources.NotFoundException unused) {
                    z = false;
                }
            }
            if (!z && tintTypedArrayObtainStyledAttributes.hasValue(androidx.appcompat.R.styleable.CompoundButton_android_button) && (resourceId = tintTypedArrayObtainStyledAttributes.getResourceId(androidx.appcompat.R.styleable.CompoundButton_android_button, 0)) != 0) {
                android.widget.CompoundButton compoundButton3 = this.mView;
                compoundButton3.setButtonDrawable(androidx.appcompat.content.res.AppCompatResources.getDrawable(compoundButton3.getContext(), resourceId));
            }
            if (tintTypedArrayObtainStyledAttributes.hasValue(androidx.appcompat.R.styleable.CompoundButton_buttonTint)) {
                androidx.core.widget.CompoundButtonCompat.setButtonTintList(this.mView, tintTypedArrayObtainStyledAttributes.getColorStateList(androidx.appcompat.R.styleable.CompoundButton_buttonTint));
            }
            if (tintTypedArrayObtainStyledAttributes.hasValue(androidx.appcompat.R.styleable.CompoundButton_buttonTintMode)) {
                androidx.core.widget.CompoundButtonCompat.setButtonTintMode(this.mView, androidx.appcompat.widget.DrawableUtils.parseTintMode(tintTypedArrayObtainStyledAttributes.getInt(androidx.appcompat.R.styleable.CompoundButton_buttonTintMode, -1), null));
            }
        } finally {
            tintTypedArrayObtainStyledAttributes.recycle();
        }
    }

    void setSupportButtonTintList(android.content.res.ColorStateList colorStateList) {
        this.mButtonTintList = colorStateList;
        this.mHasButtonTint = true;
        applyButtonTint();
    }

    android.content.res.ColorStateList getSupportButtonTintList() {
        return this.mButtonTintList;
    }

    void setSupportButtonTintMode(android.graphics.PorterDuff.Mode mode) {
        this.mButtonTintMode = mode;
        this.mHasButtonTintMode = true;
        applyButtonTint();
    }

    android.graphics.PorterDuff.Mode getSupportButtonTintMode() {
        return this.mButtonTintMode;
    }

    void onSetButtonDrawable() {
        if (this.mSkipNextApply) {
            this.mSkipNextApply = false;
        } else {
            this.mSkipNextApply = true;
            applyButtonTint();
        }
    }

    void applyButtonTint() {
        android.graphics.drawable.Drawable buttonDrawable = androidx.core.widget.CompoundButtonCompat.getButtonDrawable(this.mView);
        if (buttonDrawable != null) {
            if (this.mHasButtonTint || this.mHasButtonTintMode) {
                android.graphics.drawable.Drawable drawableMutate = androidx.core.graphics.drawable.DrawableCompat.wrap(buttonDrawable).mutate();
                if (this.mHasButtonTint) {
                    androidx.core.graphics.drawable.DrawableCompat.setTintList(drawableMutate, this.mButtonTintList);
                }
                if (this.mHasButtonTintMode) {
                    androidx.core.graphics.drawable.DrawableCompat.setTintMode(drawableMutate, this.mButtonTintMode);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(this.mView.getDrawableState());
                }
                this.mView.setButtonDrawable(drawableMutate);
            }
        }
    }
}
