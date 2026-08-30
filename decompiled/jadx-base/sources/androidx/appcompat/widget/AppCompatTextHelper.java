package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
class AppCompatTextHelper {
    private static final int MONOSPACE = 3;
    private static final int SANS = 1;
    private static final int SERIF = 2;
    private static final int TEXT_FONT_WEIGHT_UNSPECIFIED = -1;
    private boolean mAsyncFontPending;
    private final androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper mAutoSizeTextHelper;
    private androidx.appcompat.widget.TintInfo mDrawableBottomTint;
    private androidx.appcompat.widget.TintInfo mDrawableEndTint;
    private androidx.appcompat.widget.TintInfo mDrawableLeftTint;
    private androidx.appcompat.widget.TintInfo mDrawableRightTint;
    private androidx.appcompat.widget.TintInfo mDrawableStartTint;
    private androidx.appcompat.widget.TintInfo mDrawableTint;
    private androidx.appcompat.widget.TintInfo mDrawableTopTint;
    private android.graphics.Typeface mFontTypeface;
    private final android.widget.TextView mView;
    private int mStyle = 0;
    private int mFontWeight = -1;

    AppCompatTextHelper(android.widget.TextView textView) {
        this.mView = textView;
        this.mAutoSizeTextHelper = new androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper(textView);
    }

    void loadFromAttributes(android.util.AttributeSet attributeSet, int i) {
        boolean z;
        boolean z2;
        java.lang.String string;
        java.lang.String string2;
        boolean z3;
        android.content.Context context = this.mView.getContext();
        androidx.appcompat.widget.AppCompatDrawableManager appCompatDrawableManager = androidx.appcompat.widget.AppCompatDrawableManager.get();
        androidx.appcompat.widget.TintTypedArray tintTypedArrayObtainStyledAttributes = androidx.appcompat.widget.TintTypedArray.obtainStyledAttributes(context, attributeSet, androidx.appcompat.R.styleable.AppCompatTextHelper, i, 0);
        android.widget.TextView textView = this.mView;
        androidx.core.view.ViewCompat.saveAttributeDataForStyleable(textView, textView.getContext(), androidx.appcompat.R.styleable.AppCompatTextHelper, attributeSet, tintTypedArrayObtainStyledAttributes.getWrappedTypeArray(), i, 0);
        int resourceId = tintTypedArrayObtainStyledAttributes.getResourceId(androidx.appcompat.R.styleable.AppCompatTextHelper_android_textAppearance, -1);
        if (tintTypedArrayObtainStyledAttributes.hasValue(androidx.appcompat.R.styleable.AppCompatTextHelper_android_drawableLeft)) {
            this.mDrawableLeftTint = createTintInfo(context, appCompatDrawableManager, tintTypedArrayObtainStyledAttributes.getResourceId(androidx.appcompat.R.styleable.AppCompatTextHelper_android_drawableLeft, 0));
        }
        if (tintTypedArrayObtainStyledAttributes.hasValue(androidx.appcompat.R.styleable.AppCompatTextHelper_android_drawableTop)) {
            this.mDrawableTopTint = createTintInfo(context, appCompatDrawableManager, tintTypedArrayObtainStyledAttributes.getResourceId(androidx.appcompat.R.styleable.AppCompatTextHelper_android_drawableTop, 0));
        }
        if (tintTypedArrayObtainStyledAttributes.hasValue(androidx.appcompat.R.styleable.AppCompatTextHelper_android_drawableRight)) {
            this.mDrawableRightTint = createTintInfo(context, appCompatDrawableManager, tintTypedArrayObtainStyledAttributes.getResourceId(androidx.appcompat.R.styleable.AppCompatTextHelper_android_drawableRight, 0));
        }
        if (tintTypedArrayObtainStyledAttributes.hasValue(androidx.appcompat.R.styleable.AppCompatTextHelper_android_drawableBottom)) {
            this.mDrawableBottomTint = createTintInfo(context, appCompatDrawableManager, tintTypedArrayObtainStyledAttributes.getResourceId(androidx.appcompat.R.styleable.AppCompatTextHelper_android_drawableBottom, 0));
        }
        if (tintTypedArrayObtainStyledAttributes.hasValue(androidx.appcompat.R.styleable.AppCompatTextHelper_android_drawableStart)) {
            this.mDrawableStartTint = createTintInfo(context, appCompatDrawableManager, tintTypedArrayObtainStyledAttributes.getResourceId(androidx.appcompat.R.styleable.AppCompatTextHelper_android_drawableStart, 0));
        }
        if (tintTypedArrayObtainStyledAttributes.hasValue(androidx.appcompat.R.styleable.AppCompatTextHelper_android_drawableEnd)) {
            this.mDrawableEndTint = createTintInfo(context, appCompatDrawableManager, tintTypedArrayObtainStyledAttributes.getResourceId(androidx.appcompat.R.styleable.AppCompatTextHelper_android_drawableEnd, 0));
        }
        tintTypedArrayObtainStyledAttributes.recycle();
        boolean z4 = this.mView.getTransformationMethod() instanceof android.text.method.PasswordTransformationMethod;
        if (resourceId != -1) {
            androidx.appcompat.widget.TintTypedArray tintTypedArrayObtainStyledAttributes2 = androidx.appcompat.widget.TintTypedArray.obtainStyledAttributes(context, resourceId, androidx.appcompat.R.styleable.TextAppearance);
            if (z4 || !tintTypedArrayObtainStyledAttributes2.hasValue(androidx.appcompat.R.styleable.TextAppearance_textAllCaps)) {
                z = false;
                z2 = false;
            } else {
                z = tintTypedArrayObtainStyledAttributes2.getBoolean(androidx.appcompat.R.styleable.TextAppearance_textAllCaps, false);
                z2 = true;
            }
            updateTypefaceAndStyle(context, tintTypedArrayObtainStyledAttributes2);
            string = tintTypedArrayObtainStyledAttributes2.hasValue(androidx.appcompat.R.styleable.TextAppearance_textLocale) ? tintTypedArrayObtainStyledAttributes2.getString(androidx.appcompat.R.styleable.TextAppearance_textLocale) : null;
            string2 = (android.os.Build.VERSION.SDK_INT < 26 || !tintTypedArrayObtainStyledAttributes2.hasValue(androidx.appcompat.R.styleable.TextAppearance_fontVariationSettings)) ? null : tintTypedArrayObtainStyledAttributes2.getString(androidx.appcompat.R.styleable.TextAppearance_fontVariationSettings);
            tintTypedArrayObtainStyledAttributes2.recycle();
        } else {
            z = false;
            z2 = false;
            string = null;
            string2 = null;
        }
        androidx.appcompat.widget.TintTypedArray tintTypedArrayObtainStyledAttributes3 = androidx.appcompat.widget.TintTypedArray.obtainStyledAttributes(context, attributeSet, androidx.appcompat.R.styleable.TextAppearance, i, 0);
        if (z4 || !tintTypedArrayObtainStyledAttributes3.hasValue(androidx.appcompat.R.styleable.TextAppearance_textAllCaps)) {
            z3 = z2;
        } else {
            z = tintTypedArrayObtainStyledAttributes3.getBoolean(androidx.appcompat.R.styleable.TextAppearance_textAllCaps, false);
            z3 = true;
        }
        if (tintTypedArrayObtainStyledAttributes3.hasValue(androidx.appcompat.R.styleable.TextAppearance_textLocale)) {
            string = tintTypedArrayObtainStyledAttributes3.getString(androidx.appcompat.R.styleable.TextAppearance_textLocale);
        }
        if (android.os.Build.VERSION.SDK_INT >= 26 && tintTypedArrayObtainStyledAttributes3.hasValue(androidx.appcompat.R.styleable.TextAppearance_fontVariationSettings)) {
            string2 = tintTypedArrayObtainStyledAttributes3.getString(androidx.appcompat.R.styleable.TextAppearance_fontVariationSettings);
        }
        if (android.os.Build.VERSION.SDK_INT >= 28 && tintTypedArrayObtainStyledAttributes3.hasValue(androidx.appcompat.R.styleable.TextAppearance_android_textSize) && tintTypedArrayObtainStyledAttributes3.getDimensionPixelSize(androidx.appcompat.R.styleable.TextAppearance_android_textSize, -1) == 0) {
            this.mView.setTextSize(0, 0.0f);
        }
        updateTypefaceAndStyle(context, tintTypedArrayObtainStyledAttributes3);
        tintTypedArrayObtainStyledAttributes3.recycle();
        if (!z4 && z3) {
            setAllCaps(z);
        }
        android.graphics.Typeface typeface = this.mFontTypeface;
        if (typeface != null) {
            if (this.mFontWeight == -1) {
                this.mView.setTypeface(typeface, this.mStyle);
            } else {
                this.mView.setTypeface(typeface);
            }
        }
        if (string2 != null) {
            androidx.appcompat.widget.AppCompatTextHelper.Api26Impl.setFontVariationSettings(this.mView, string2);
        }
        if (string != null) {
            androidx.appcompat.widget.AppCompatTextHelper.Api24Impl.setTextLocales(this.mView, androidx.appcompat.widget.AppCompatTextHelper.Api24Impl.forLanguageTags(string));
        }
        this.mAutoSizeTextHelper.loadFromAttributes(attributeSet, i);
        if (androidx.appcompat.widget.ViewUtils.SDK_LEVEL_SUPPORTS_AUTOSIZE && this.mAutoSizeTextHelper.getAutoSizeTextType() != 0) {
            int[] autoSizeTextAvailableSizes = this.mAutoSizeTextHelper.getAutoSizeTextAvailableSizes();
            if (autoSizeTextAvailableSizes.length > 0) {
                if (androidx.appcompat.widget.AppCompatTextHelper.Api26Impl.getAutoSizeStepGranularity(this.mView) != -1.0f) {
                    androidx.appcompat.widget.AppCompatTextHelper.Api26Impl.setAutoSizeTextTypeUniformWithConfiguration(this.mView, this.mAutoSizeTextHelper.getAutoSizeMinTextSize(), this.mAutoSizeTextHelper.getAutoSizeMaxTextSize(), this.mAutoSizeTextHelper.getAutoSizeStepGranularity(), 0);
                } else {
                    androidx.appcompat.widget.AppCompatTextHelper.Api26Impl.setAutoSizeTextTypeUniformWithPresetSizes(this.mView, autoSizeTextAvailableSizes, 0);
                }
            }
        }
        androidx.appcompat.widget.TintTypedArray tintTypedArrayObtainStyledAttributes4 = androidx.appcompat.widget.TintTypedArray.obtainStyledAttributes(context, attributeSet, androidx.appcompat.R.styleable.AppCompatTextView);
        int resourceId2 = tintTypedArrayObtainStyledAttributes4.getResourceId(androidx.appcompat.R.styleable.AppCompatTextView_drawableLeftCompat, -1);
        android.graphics.drawable.Drawable drawable = resourceId2 != -1 ? appCompatDrawableManager.getDrawable(context, resourceId2) : null;
        int resourceId3 = tintTypedArrayObtainStyledAttributes4.getResourceId(androidx.appcompat.R.styleable.AppCompatTextView_drawableTopCompat, -1);
        android.graphics.drawable.Drawable drawable2 = resourceId3 != -1 ? appCompatDrawableManager.getDrawable(context, resourceId3) : null;
        int resourceId4 = tintTypedArrayObtainStyledAttributes4.getResourceId(androidx.appcompat.R.styleable.AppCompatTextView_drawableRightCompat, -1);
        android.graphics.drawable.Drawable drawable3 = resourceId4 != -1 ? appCompatDrawableManager.getDrawable(context, resourceId4) : null;
        int resourceId5 = tintTypedArrayObtainStyledAttributes4.getResourceId(androidx.appcompat.R.styleable.AppCompatTextView_drawableBottomCompat, -1);
        android.graphics.drawable.Drawable drawable4 = resourceId5 != -1 ? appCompatDrawableManager.getDrawable(context, resourceId5) : null;
        int resourceId6 = tintTypedArrayObtainStyledAttributes4.getResourceId(androidx.appcompat.R.styleable.AppCompatTextView_drawableStartCompat, -1);
        android.graphics.drawable.Drawable drawable5 = resourceId6 != -1 ? appCompatDrawableManager.getDrawable(context, resourceId6) : null;
        int resourceId7 = tintTypedArrayObtainStyledAttributes4.getResourceId(androidx.appcompat.R.styleable.AppCompatTextView_drawableEndCompat, -1);
        setCompoundDrawables(drawable, drawable2, drawable3, drawable4, drawable5, resourceId7 != -1 ? appCompatDrawableManager.getDrawable(context, resourceId7) : null);
        if (tintTypedArrayObtainStyledAttributes4.hasValue(androidx.appcompat.R.styleable.AppCompatTextView_drawableTint)) {
            androidx.core.widget.TextViewCompat.setCompoundDrawableTintList(this.mView, tintTypedArrayObtainStyledAttributes4.getColorStateList(androidx.appcompat.R.styleable.AppCompatTextView_drawableTint));
        }
        if (tintTypedArrayObtainStyledAttributes4.hasValue(androidx.appcompat.R.styleable.AppCompatTextView_drawableTintMode)) {
            androidx.core.widget.TextViewCompat.setCompoundDrawableTintMode(this.mView, androidx.appcompat.widget.DrawableUtils.parseTintMode(tintTypedArrayObtainStyledAttributes4.getInt(androidx.appcompat.R.styleable.AppCompatTextView_drawableTintMode, -1), null));
        }
        int dimensionPixelSize = tintTypedArrayObtainStyledAttributes4.getDimensionPixelSize(androidx.appcompat.R.styleable.AppCompatTextView_firstBaselineToTopHeight, -1);
        int dimensionPixelSize2 = tintTypedArrayObtainStyledAttributes4.getDimensionPixelSize(androidx.appcompat.R.styleable.AppCompatTextView_lastBaselineToBottomHeight, -1);
        int dimensionPixelSize3 = tintTypedArrayObtainStyledAttributes4.getDimensionPixelSize(androidx.appcompat.R.styleable.AppCompatTextView_lineHeight, -1);
        tintTypedArrayObtainStyledAttributes4.recycle();
        if (dimensionPixelSize != -1) {
            androidx.core.widget.TextViewCompat.setFirstBaselineToTopHeight(this.mView, dimensionPixelSize);
        }
        if (dimensionPixelSize2 != -1) {
            androidx.core.widget.TextViewCompat.setLastBaselineToBottomHeight(this.mView, dimensionPixelSize2);
        }
        if (dimensionPixelSize3 != -1) {
            androidx.core.widget.TextViewCompat.setLineHeight(this.mView, dimensionPixelSize3);
        }
    }

    private void updateTypefaceAndStyle(android.content.Context context, androidx.appcompat.widget.TintTypedArray tintTypedArray) {
        int i;
        java.lang.String string;
        this.mStyle = tintTypedArray.getInt(androidx.appcompat.R.styleable.TextAppearance_android_textStyle, this.mStyle);
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            int i2 = tintTypedArray.getInt(androidx.appcompat.R.styleable.TextAppearance_android_textFontWeight, -1);
            this.mFontWeight = i2;
            if (i2 != -1) {
                this.mStyle = (this.mStyle & 2) | 0;
            }
        }
        if (tintTypedArray.hasValue(androidx.appcompat.R.styleable.TextAppearance_android_fontFamily) || tintTypedArray.hasValue(androidx.appcompat.R.styleable.TextAppearance_fontFamily)) {
            this.mFontTypeface = null;
            if (tintTypedArray.hasValue(androidx.appcompat.R.styleable.TextAppearance_fontFamily)) {
                i = androidx.appcompat.R.styleable.TextAppearance_fontFamily;
            } else {
                i = androidx.appcompat.R.styleable.TextAppearance_android_fontFamily;
            }
            final int i3 = this.mFontWeight;
            final int i4 = this.mStyle;
            if (!context.isRestricted()) {
                final java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(this.mView);
                try {
                    android.graphics.Typeface font = tintTypedArray.getFont(i, this.mStyle, new androidx.core.content.res.ResourcesCompat.FontCallback() { // from class: androidx.appcompat.widget.AppCompatTextHelper.1
                        @Override // androidx.core.content.res.ResourcesCompat.FontCallback
                        /* JADX INFO: renamed from: onFontRetrievalFailed */
                        public void m21xb24343b7(int i5) {
                        }

                        @Override // androidx.core.content.res.ResourcesCompat.FontCallback
                        /* JADX INFO: renamed from: onFontRetrieved */
                        public void m22x46c88379(android.graphics.Typeface typeface) {
                            int i5;
                            if (android.os.Build.VERSION.SDK_INT >= 28 && (i5 = i3) != -1) {
                                typeface = androidx.appcompat.widget.AppCompatTextHelper.Api28Impl.create(typeface, i5, (i4 & 2) != 0);
                            }
                            androidx.appcompat.widget.AppCompatTextHelper.this.onAsyncTypefaceReceived(weakReference, typeface);
                        }
                    });
                    if (font != null) {
                        if (android.os.Build.VERSION.SDK_INT >= 28 && this.mFontWeight != -1) {
                            this.mFontTypeface = androidx.appcompat.widget.AppCompatTextHelper.Api28Impl.create(android.graphics.Typeface.create(font, 0), this.mFontWeight, (this.mStyle & 2) != 0);
                        } else {
                            this.mFontTypeface = font;
                        }
                    }
                    this.mAsyncFontPending = this.mFontTypeface == null;
                } catch (android.content.res.Resources.NotFoundException | java.lang.UnsupportedOperationException unused) {
                }
            }
            if (this.mFontTypeface != null || (string = tintTypedArray.getString(i)) == null) {
                return;
            }
            if (android.os.Build.VERSION.SDK_INT >= 28 && this.mFontWeight != -1) {
                this.mFontTypeface = androidx.appcompat.widget.AppCompatTextHelper.Api28Impl.create(android.graphics.Typeface.create(string, 0), this.mFontWeight, (this.mStyle & 2) != 0);
                return;
            } else {
                this.mFontTypeface = android.graphics.Typeface.create(string, this.mStyle);
                return;
            }
        }
        if (tintTypedArray.hasValue(androidx.appcompat.R.styleable.TextAppearance_android_typeface)) {
            this.mAsyncFontPending = false;
            int i5 = tintTypedArray.getInt(androidx.appcompat.R.styleable.TextAppearance_android_typeface, 1);
            if (i5 == 1) {
                this.mFontTypeface = android.graphics.Typeface.SANS_SERIF;
            } else if (i5 == 2) {
                this.mFontTypeface = android.graphics.Typeface.SERIF;
            } else {
                if (i5 != 3) {
                    return;
                }
                this.mFontTypeface = android.graphics.Typeface.MONOSPACE;
            }
        }
    }

    void onAsyncTypefaceReceived(java.lang.ref.WeakReference<android.widget.TextView> weakReference, final android.graphics.Typeface typeface) {
        if (this.mAsyncFontPending) {
            this.mFontTypeface = typeface;
            final android.widget.TextView textView = weakReference.get();
            if (textView != null) {
                if (androidx.core.view.ViewCompat.isAttachedToWindow(textView)) {
                    final int i = this.mStyle;
                    textView.post(new java.lang.Runnable() { // from class: androidx.appcompat.widget.AppCompatTextHelper.2
                        @Override // java.lang.Runnable
                        public void run() {
                            textView.setTypeface(typeface, i);
                        }
                    });
                } else {
                    textView.setTypeface(typeface, this.mStyle);
                }
            }
        }
    }

    void onSetTextAppearance(android.content.Context context, int i) {
        java.lang.String string;
        androidx.appcompat.widget.TintTypedArray tintTypedArrayObtainStyledAttributes = androidx.appcompat.widget.TintTypedArray.obtainStyledAttributes(context, i, androidx.appcompat.R.styleable.TextAppearance);
        if (tintTypedArrayObtainStyledAttributes.hasValue(androidx.appcompat.R.styleable.TextAppearance_textAllCaps)) {
            setAllCaps(tintTypedArrayObtainStyledAttributes.getBoolean(androidx.appcompat.R.styleable.TextAppearance_textAllCaps, false));
        }
        if (tintTypedArrayObtainStyledAttributes.hasValue(androidx.appcompat.R.styleable.TextAppearance_android_textSize) && tintTypedArrayObtainStyledAttributes.getDimensionPixelSize(androidx.appcompat.R.styleable.TextAppearance_android_textSize, -1) == 0) {
            this.mView.setTextSize(0, 0.0f);
        }
        updateTypefaceAndStyle(context, tintTypedArrayObtainStyledAttributes);
        if (android.os.Build.VERSION.SDK_INT >= 26 && tintTypedArrayObtainStyledAttributes.hasValue(androidx.appcompat.R.styleable.TextAppearance_fontVariationSettings) && (string = tintTypedArrayObtainStyledAttributes.getString(androidx.appcompat.R.styleable.TextAppearance_fontVariationSettings)) != null) {
            androidx.appcompat.widget.AppCompatTextHelper.Api26Impl.setFontVariationSettings(this.mView, string);
        }
        tintTypedArrayObtainStyledAttributes.recycle();
        android.graphics.Typeface typeface = this.mFontTypeface;
        if (typeface != null) {
            this.mView.setTypeface(typeface, this.mStyle);
        }
    }

    void setAllCaps(boolean z) {
        this.mView.setAllCaps(z);
    }

    void onSetCompoundDrawables() {
        applyCompoundDrawablesTints();
    }

    void applyCompoundDrawablesTints() {
        if (this.mDrawableLeftTint != null || this.mDrawableTopTint != null || this.mDrawableRightTint != null || this.mDrawableBottomTint != null) {
            android.graphics.drawable.Drawable[] compoundDrawables = this.mView.getCompoundDrawables();
            applyCompoundDrawableTint(compoundDrawables[0], this.mDrawableLeftTint);
            applyCompoundDrawableTint(compoundDrawables[1], this.mDrawableTopTint);
            applyCompoundDrawableTint(compoundDrawables[2], this.mDrawableRightTint);
            applyCompoundDrawableTint(compoundDrawables[3], this.mDrawableBottomTint);
        }
        if (this.mDrawableStartTint == null && this.mDrawableEndTint == null) {
            return;
        }
        android.graphics.drawable.Drawable[] compoundDrawablesRelative = androidx.appcompat.widget.AppCompatTextHelper.Api17Impl.getCompoundDrawablesRelative(this.mView);
        applyCompoundDrawableTint(compoundDrawablesRelative[0], this.mDrawableStartTint);
        applyCompoundDrawableTint(compoundDrawablesRelative[2], this.mDrawableEndTint);
    }

    private void applyCompoundDrawableTint(android.graphics.drawable.Drawable drawable, androidx.appcompat.widget.TintInfo tintInfo) {
        if (drawable == null || tintInfo == null) {
            return;
        }
        androidx.appcompat.widget.AppCompatDrawableManager.tintDrawable(drawable, tintInfo, this.mView.getDrawableState());
    }

    private static androidx.appcompat.widget.TintInfo createTintInfo(android.content.Context context, androidx.appcompat.widget.AppCompatDrawableManager appCompatDrawableManager, int i) {
        android.content.res.ColorStateList tintList = appCompatDrawableManager.getTintList(context, i);
        if (tintList == null) {
            return null;
        }
        androidx.appcompat.widget.TintInfo tintInfo = new androidx.appcompat.widget.TintInfo();
        tintInfo.mHasTintList = true;
        tintInfo.mTintList = tintList;
        return tintInfo;
    }

    void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (androidx.appcompat.widget.ViewUtils.SDK_LEVEL_SUPPORTS_AUTOSIZE) {
            return;
        }
        autoSizeText();
    }

    void setTextSize(int i, float f) {
        if (androidx.appcompat.widget.ViewUtils.SDK_LEVEL_SUPPORTS_AUTOSIZE || isAutoSizeEnabled()) {
            return;
        }
        setTextSizeInternal(i, f);
    }

    void autoSizeText() {
        this.mAutoSizeTextHelper.autoSizeText();
    }

    boolean isAutoSizeEnabled() {
        return this.mAutoSizeTextHelper.isAutoSizeEnabled();
    }

    private void setTextSizeInternal(int i, float f) {
        this.mAutoSizeTextHelper.setTextSizeInternal(i, f);
    }

    void setAutoSizeTextTypeWithDefaults(int i) {
        this.mAutoSizeTextHelper.setAutoSizeTextTypeWithDefaults(i);
    }

    void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) throws java.lang.IllegalArgumentException {
        this.mAutoSizeTextHelper.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
    }

    void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) throws java.lang.IllegalArgumentException {
        this.mAutoSizeTextHelper.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
    }

    int getAutoSizeTextType() {
        return this.mAutoSizeTextHelper.getAutoSizeTextType();
    }

    int getAutoSizeStepGranularity() {
        return this.mAutoSizeTextHelper.getAutoSizeStepGranularity();
    }

    int getAutoSizeMinTextSize() {
        return this.mAutoSizeTextHelper.getAutoSizeMinTextSize();
    }

    int getAutoSizeMaxTextSize() {
        return this.mAutoSizeTextHelper.getAutoSizeMaxTextSize();
    }

    int[] getAutoSizeTextAvailableSizes() {
        return this.mAutoSizeTextHelper.getAutoSizeTextAvailableSizes();
    }

    android.content.res.ColorStateList getCompoundDrawableTintList() {
        androidx.appcompat.widget.TintInfo tintInfo = this.mDrawableTint;
        if (tintInfo != null) {
            return tintInfo.mTintList;
        }
        return null;
    }

    void setCompoundDrawableTintList(android.content.res.ColorStateList colorStateList) {
        if (this.mDrawableTint == null) {
            this.mDrawableTint = new androidx.appcompat.widget.TintInfo();
        }
        this.mDrawableTint.mTintList = colorStateList;
        this.mDrawableTint.mHasTintList = colorStateList != null;
        setCompoundTints();
    }

    android.graphics.PorterDuff.Mode getCompoundDrawableTintMode() {
        androidx.appcompat.widget.TintInfo tintInfo = this.mDrawableTint;
        if (tintInfo != null) {
            return tintInfo.mTintMode;
        }
        return null;
    }

    void setCompoundDrawableTintMode(android.graphics.PorterDuff.Mode mode) {
        if (this.mDrawableTint == null) {
            this.mDrawableTint = new androidx.appcompat.widget.TintInfo();
        }
        this.mDrawableTint.mTintMode = mode;
        this.mDrawableTint.mHasTintMode = mode != null;
        setCompoundTints();
    }

    private void setCompoundTints() {
        androidx.appcompat.widget.TintInfo tintInfo = this.mDrawableTint;
        this.mDrawableLeftTint = tintInfo;
        this.mDrawableTopTint = tintInfo;
        this.mDrawableRightTint = tintInfo;
        this.mDrawableBottomTint = tintInfo;
        this.mDrawableStartTint = tintInfo;
        this.mDrawableEndTint = tintInfo;
    }

    private void setCompoundDrawables(android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2, android.graphics.drawable.Drawable drawable3, android.graphics.drawable.Drawable drawable4, android.graphics.drawable.Drawable drawable5, android.graphics.drawable.Drawable drawable6) {
        if (drawable5 != null || drawable6 != null) {
            android.graphics.drawable.Drawable[] compoundDrawablesRelative = androidx.appcompat.widget.AppCompatTextHelper.Api17Impl.getCompoundDrawablesRelative(this.mView);
            android.widget.TextView textView = this.mView;
            if (drawable5 == null) {
                drawable5 = compoundDrawablesRelative[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative[1];
            }
            if (drawable6 == null) {
                drawable6 = compoundDrawablesRelative[2];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative[3];
            }
            androidx.appcompat.widget.AppCompatTextHelper.Api17Impl.setCompoundDrawablesRelativeWithIntrinsicBounds(textView, drawable5, drawable2, drawable6, drawable4);
            return;
        }
        if (drawable == null && drawable2 == null && drawable3 == null && drawable4 == null) {
            return;
        }
        android.graphics.drawable.Drawable[] compoundDrawablesRelative2 = androidx.appcompat.widget.AppCompatTextHelper.Api17Impl.getCompoundDrawablesRelative(this.mView);
        android.graphics.drawable.Drawable drawable7 = compoundDrawablesRelative2[0];
        if (drawable7 != null || compoundDrawablesRelative2[2] != null) {
            android.widget.TextView textView2 = this.mView;
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative2[1];
            }
            android.graphics.drawable.Drawable drawable8 = compoundDrawablesRelative2[2];
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative2[3];
            }
            androidx.appcompat.widget.AppCompatTextHelper.Api17Impl.setCompoundDrawablesRelativeWithIntrinsicBounds(textView2, drawable7, drawable2, drawable8, drawable4);
            return;
        }
        android.graphics.drawable.Drawable[] compoundDrawables = this.mView.getCompoundDrawables();
        android.widget.TextView textView3 = this.mView;
        if (drawable == null) {
            drawable = compoundDrawables[0];
        }
        if (drawable2 == null) {
            drawable2 = compoundDrawables[1];
        }
        if (drawable3 == null) {
            drawable3 = compoundDrawables[2];
        }
        if (drawable4 == null) {
            drawable4 = compoundDrawables[3];
        }
        textView3.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    void populateSurroundingTextIfNeeded(android.widget.TextView textView, android.view.inputmethod.InputConnection inputConnection, android.view.inputmethod.EditorInfo editorInfo) {
        if (android.os.Build.VERSION.SDK_INT >= 30 || inputConnection == null) {
            return;
        }
        androidx.core.view.inputmethod.EditorInfoCompat.setInitialSurroundingText(editorInfo, textView.getText());
    }

    static class Api26Impl {
        private Api26Impl() {
        }

        static boolean setFontVariationSettings(android.widget.TextView textView, java.lang.String str) {
            return textView.setFontVariationSettings(str);
        }

        static int getAutoSizeStepGranularity(android.widget.TextView textView) {
            return textView.getAutoSizeStepGranularity();
        }

        static void setAutoSizeTextTypeUniformWithConfiguration(android.widget.TextView textView, int i, int i2, int i3, int i4) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
        }

        static void setAutoSizeTextTypeUniformWithPresetSizes(android.widget.TextView textView, int[] iArr, int i) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
        }
    }

    static class Api24Impl {
        private Api24Impl() {
        }

        static void setTextLocales(android.widget.TextView textView, android.os.LocaleList localeList) {
            textView.setTextLocales(localeList);
        }

        static android.os.LocaleList forLanguageTags(java.lang.String str) {
            return android.os.LocaleList.forLanguageTags(str);
        }
    }

    static class Api17Impl {
        private Api17Impl() {
        }

        static void setTextLocale(android.widget.TextView textView, java.util.Locale locale) {
            textView.setTextLocale(locale);
        }

        static void setCompoundDrawablesRelativeWithIntrinsicBounds(android.widget.TextView textView, android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2, android.graphics.drawable.Drawable drawable3, android.graphics.drawable.Drawable drawable4) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }

        static android.graphics.drawable.Drawable[] getCompoundDrawablesRelative(android.widget.TextView textView) {
            return textView.getCompoundDrawablesRelative();
        }
    }

    static class Api21Impl {
        private Api21Impl() {
        }

        static java.util.Locale forLanguageTag(java.lang.String str) {
            return java.util.Locale.forLanguageTag(str);
        }
    }

    static class Api28Impl {
        private Api28Impl() {
        }

        static android.graphics.Typeface create(android.graphics.Typeface typeface, int i, boolean z) {
            return android.graphics.Typeface.create(typeface, i, z);
        }
    }
}
