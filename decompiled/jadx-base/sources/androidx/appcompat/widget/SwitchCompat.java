package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
public class SwitchCompat extends android.widget.CompoundButton implements androidx.appcompat.widget.EmojiCompatConfigurationView {
    private static final java.lang.String ACCESSIBILITY_EVENT_CLASS_NAME = "android.widget.Switch";
    private static final int MONOSPACE = 3;
    private static final int SANS = 1;
    private static final int SERIF = 2;
    private static final int THUMB_ANIMATION_DURATION = 250;
    private static final int TOUCH_MODE_DOWN = 1;
    private static final int TOUCH_MODE_DRAGGING = 2;
    private static final int TOUCH_MODE_IDLE = 0;
    private androidx.appcompat.widget.AppCompatEmojiTextHelper mAppCompatEmojiTextHelper;
    private androidx.appcompat.widget.SwitchCompat.EmojiCompatInitCallback mEmojiCompatInitCallback;
    private boolean mEnforceSwitchWidth;
    private boolean mHasThumbTint;
    private boolean mHasThumbTintMode;
    private boolean mHasTrackTint;
    private boolean mHasTrackTintMode;
    private int mMinFlingVelocity;
    private android.text.Layout mOffLayout;
    private android.text.Layout mOnLayout;
    android.animation.ObjectAnimator mPositionAnimator;
    private boolean mShowText;
    private boolean mSplitTrack;
    private int mSwitchBottom;
    private int mSwitchHeight;
    private int mSwitchLeft;
    private int mSwitchMinWidth;
    private int mSwitchPadding;
    private int mSwitchRight;
    private int mSwitchTop;
    private android.text.method.TransformationMethod mSwitchTransformationMethod;
    private int mSwitchWidth;
    private final android.graphics.Rect mTempRect;
    private android.content.res.ColorStateList mTextColors;
    private final androidx.appcompat.widget.AppCompatTextHelper mTextHelper;
    private java.lang.CharSequence mTextOff;
    private java.lang.CharSequence mTextOffTransformed;
    private java.lang.CharSequence mTextOn;
    private java.lang.CharSequence mTextOnTransformed;
    private final android.text.TextPaint mTextPaint;
    private android.graphics.drawable.Drawable mThumbDrawable;
    float mThumbPosition;
    private int mThumbTextPadding;
    private android.content.res.ColorStateList mThumbTintList;
    private android.graphics.PorterDuff.Mode mThumbTintMode;
    private int mThumbWidth;
    private int mTouchMode;
    private int mTouchSlop;
    private float mTouchX;
    private float mTouchY;
    private android.graphics.drawable.Drawable mTrackDrawable;
    private android.content.res.ColorStateList mTrackTintList;
    private android.graphics.PorterDuff.Mode mTrackTintMode;
    private android.view.VelocityTracker mVelocityTracker;
    private static final android.util.Property<androidx.appcompat.widget.SwitchCompat, java.lang.Float> THUMB_POS = new android.util.Property<androidx.appcompat.widget.SwitchCompat, java.lang.Float>(java.lang.Float.class, "thumbPos") { // from class: androidx.appcompat.widget.SwitchCompat.1
        @Override // android.util.Property
        public java.lang.Float get(androidx.appcompat.widget.SwitchCompat switchCompat) {
            return java.lang.Float.valueOf(switchCompat.mThumbPosition);
        }

        @Override // android.util.Property
        public void set(androidx.appcompat.widget.SwitchCompat switchCompat, java.lang.Float f) {
            switchCompat.setThumbPosition(f.floatValue());
        }
    };
    private static final int[] CHECKED_STATE_SET = {android.R.attr.state_checked};

    private static float constrain(float f, float f2, float f3) {
        if (f < f2) {
            return f2;
        }
        return f > f3 ? f3 : f;
    }

    public SwitchCompat(android.content.Context context) {
        this(context, null);
    }

    public SwitchCompat(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, androidx.appcompat.R.attr.switchStyle);
    }

    public SwitchCompat(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mThumbTintList = null;
        this.mThumbTintMode = null;
        this.mHasThumbTint = false;
        this.mHasThumbTintMode = false;
        this.mTrackTintList = null;
        this.mTrackTintMode = null;
        this.mHasTrackTint = false;
        this.mHasTrackTintMode = false;
        this.mVelocityTracker = android.view.VelocityTracker.obtain();
        this.mEnforceSwitchWidth = true;
        this.mTempRect = new android.graphics.Rect();
        androidx.appcompat.widget.ThemeUtils.checkAppCompatTheme(this, getContext());
        android.text.TextPaint textPaint = new android.text.TextPaint(1);
        this.mTextPaint = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        androidx.appcompat.widget.TintTypedArray tintTypedArrayObtainStyledAttributes = androidx.appcompat.widget.TintTypedArray.obtainStyledAttributes(context, attributeSet, androidx.appcompat.R.styleable.SwitchCompat, i, 0);
        androidx.core.view.ViewCompat.saveAttributeDataForStyleable(this, context, androidx.appcompat.R.styleable.SwitchCompat, attributeSet, tintTypedArrayObtainStyledAttributes.getWrappedTypeArray(), i, 0);
        android.graphics.drawable.Drawable drawable = tintTypedArrayObtainStyledAttributes.getDrawable(androidx.appcompat.R.styleable.SwitchCompat_android_thumb);
        this.mThumbDrawable = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        android.graphics.drawable.Drawable drawable2 = tintTypedArrayObtainStyledAttributes.getDrawable(androidx.appcompat.R.styleable.SwitchCompat_track);
        this.mTrackDrawable = drawable2;
        if (drawable2 != null) {
            drawable2.setCallback(this);
        }
        setTextOnInternal(tintTypedArrayObtainStyledAttributes.getText(androidx.appcompat.R.styleable.SwitchCompat_android_textOn));
        setTextOffInternal(tintTypedArrayObtainStyledAttributes.getText(androidx.appcompat.R.styleable.SwitchCompat_android_textOff));
        this.mShowText = tintTypedArrayObtainStyledAttributes.getBoolean(androidx.appcompat.R.styleable.SwitchCompat_showText, true);
        this.mThumbTextPadding = tintTypedArrayObtainStyledAttributes.getDimensionPixelSize(androidx.appcompat.R.styleable.SwitchCompat_thumbTextPadding, 0);
        this.mSwitchMinWidth = tintTypedArrayObtainStyledAttributes.getDimensionPixelSize(androidx.appcompat.R.styleable.SwitchCompat_switchMinWidth, 0);
        this.mSwitchPadding = tintTypedArrayObtainStyledAttributes.getDimensionPixelSize(androidx.appcompat.R.styleable.SwitchCompat_switchPadding, 0);
        this.mSplitTrack = tintTypedArrayObtainStyledAttributes.getBoolean(androidx.appcompat.R.styleable.SwitchCompat_splitTrack, false);
        android.content.res.ColorStateList colorStateList = tintTypedArrayObtainStyledAttributes.getColorStateList(androidx.appcompat.R.styleable.SwitchCompat_thumbTint);
        if (colorStateList != null) {
            this.mThumbTintList = colorStateList;
            this.mHasThumbTint = true;
        }
        android.graphics.PorterDuff.Mode tintMode = androidx.appcompat.widget.DrawableUtils.parseTintMode(tintTypedArrayObtainStyledAttributes.getInt(androidx.appcompat.R.styleable.SwitchCompat_thumbTintMode, -1), null);
        if (this.mThumbTintMode != tintMode) {
            this.mThumbTintMode = tintMode;
            this.mHasThumbTintMode = true;
        }
        if (this.mHasThumbTint || this.mHasThumbTintMode) {
            applyThumbTint();
        }
        android.content.res.ColorStateList colorStateList2 = tintTypedArrayObtainStyledAttributes.getColorStateList(androidx.appcompat.R.styleable.SwitchCompat_trackTint);
        if (colorStateList2 != null) {
            this.mTrackTintList = colorStateList2;
            this.mHasTrackTint = true;
        }
        android.graphics.PorterDuff.Mode tintMode2 = androidx.appcompat.widget.DrawableUtils.parseTintMode(tintTypedArrayObtainStyledAttributes.getInt(androidx.appcompat.R.styleable.SwitchCompat_trackTintMode, -1), null);
        if (this.mTrackTintMode != tintMode2) {
            this.mTrackTintMode = tintMode2;
            this.mHasTrackTintMode = true;
        }
        if (this.mHasTrackTint || this.mHasTrackTintMode) {
            applyTrackTint();
        }
        int resourceId = tintTypedArrayObtainStyledAttributes.getResourceId(androidx.appcompat.R.styleable.SwitchCompat_switchTextAppearance, 0);
        if (resourceId != 0) {
            setSwitchTextAppearance(context, resourceId);
        }
        androidx.appcompat.widget.AppCompatTextHelper appCompatTextHelper = new androidx.appcompat.widget.AppCompatTextHelper(this);
        this.mTextHelper = appCompatTextHelper;
        appCompatTextHelper.loadFromAttributes(attributeSet, i);
        tintTypedArrayObtainStyledAttributes.recycle();
        android.view.ViewConfiguration viewConfiguration = android.view.ViewConfiguration.get(context);
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
        this.mMinFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
        getEmojiTextViewHelper().loadFromAttributes(attributeSet, i);
        refreshDrawableState();
        setChecked(isChecked());
    }

    public void setSwitchTextAppearance(android.content.Context context, int i) {
        androidx.appcompat.widget.TintTypedArray tintTypedArrayObtainStyledAttributes = androidx.appcompat.widget.TintTypedArray.obtainStyledAttributes(context, i, androidx.appcompat.R.styleable.TextAppearance);
        android.content.res.ColorStateList colorStateList = tintTypedArrayObtainStyledAttributes.getColorStateList(androidx.appcompat.R.styleable.TextAppearance_android_textColor);
        if (colorStateList != null) {
            this.mTextColors = colorStateList;
        } else {
            this.mTextColors = getTextColors();
        }
        int dimensionPixelSize = tintTypedArrayObtainStyledAttributes.getDimensionPixelSize(androidx.appcompat.R.styleable.TextAppearance_android_textSize, 0);
        if (dimensionPixelSize != 0) {
            float f = dimensionPixelSize;
            if (f != this.mTextPaint.getTextSize()) {
                this.mTextPaint.setTextSize(f);
                requestLayout();
            }
        }
        setSwitchTypefaceByIndex(tintTypedArrayObtainStyledAttributes.getInt(androidx.appcompat.R.styleable.TextAppearance_android_typeface, -1), tintTypedArrayObtainStyledAttributes.getInt(androidx.appcompat.R.styleable.TextAppearance_android_textStyle, -1));
        if (tintTypedArrayObtainStyledAttributes.getBoolean(androidx.appcompat.R.styleable.TextAppearance_textAllCaps, false)) {
            this.mSwitchTransformationMethod = new androidx.appcompat.text.AllCapsTransformationMethod(getContext());
        } else {
            this.mSwitchTransformationMethod = null;
        }
        setTextOnInternal(this.mTextOn);
        setTextOffInternal(this.mTextOff);
        tintTypedArrayObtainStyledAttributes.recycle();
    }

    private void setSwitchTypefaceByIndex(int i, int i2) {
        android.graphics.Typeface typeface;
        if (i == 1) {
            typeface = android.graphics.Typeface.SANS_SERIF;
        } else if (i == 2) {
            typeface = android.graphics.Typeface.SERIF;
        } else {
            typeface = i != 3 ? null : android.graphics.Typeface.MONOSPACE;
        }
        setSwitchTypeface(typeface, i2);
    }

    public void setSwitchTypeface(android.graphics.Typeface typeface, int i) {
        android.graphics.Typeface typefaceCreate;
        if (i > 0) {
            if (typeface == null) {
                typefaceCreate = android.graphics.Typeface.defaultFromStyle(i);
            } else {
                typefaceCreate = android.graphics.Typeface.create(typeface, i);
            }
            setSwitchTypeface(typefaceCreate);
            int i2 = (~(typefaceCreate != null ? typefaceCreate.getStyle() : 0)) & i;
            this.mTextPaint.setFakeBoldText((i2 & 1) != 0);
            this.mTextPaint.setTextSkewX((i2 & 2) != 0 ? -0.25f : 0.0f);
            return;
        }
        this.mTextPaint.setFakeBoldText(false);
        this.mTextPaint.setTextSkewX(0.0f);
        setSwitchTypeface(typeface);
    }

    public void setSwitchTypeface(android.graphics.Typeface typeface) {
        if ((this.mTextPaint.getTypeface() == null || this.mTextPaint.getTypeface().equals(typeface)) && (this.mTextPaint.getTypeface() != null || typeface == null)) {
            return;
        }
        this.mTextPaint.setTypeface(typeface);
        requestLayout();
        invalidate();
    }

    public void setSwitchPadding(int i) {
        this.mSwitchPadding = i;
        requestLayout();
    }

    public int getSwitchPadding() {
        return this.mSwitchPadding;
    }

    public void setSwitchMinWidth(int i) {
        this.mSwitchMinWidth = i;
        requestLayout();
    }

    public int getSwitchMinWidth() {
        return this.mSwitchMinWidth;
    }

    public void setThumbTextPadding(int i) {
        this.mThumbTextPadding = i;
        requestLayout();
    }

    public int getThumbTextPadding() {
        return this.mThumbTextPadding;
    }

    public void setTrackDrawable(android.graphics.drawable.Drawable drawable) {
        android.graphics.drawable.Drawable drawable2 = this.mTrackDrawable;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.mTrackDrawable = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i) {
        setTrackDrawable(androidx.appcompat.content.res.AppCompatResources.getDrawable(getContext(), i));
    }

    public android.graphics.drawable.Drawable getTrackDrawable() {
        return this.mTrackDrawable;
    }

    public void setTrackTintList(android.content.res.ColorStateList colorStateList) {
        this.mTrackTintList = colorStateList;
        this.mHasTrackTint = true;
        applyTrackTint();
    }

    public android.content.res.ColorStateList getTrackTintList() {
        return this.mTrackTintList;
    }

    public void setTrackTintMode(android.graphics.PorterDuff.Mode mode) {
        this.mTrackTintMode = mode;
        this.mHasTrackTintMode = true;
        applyTrackTint();
    }

    public android.graphics.PorterDuff.Mode getTrackTintMode() {
        return this.mTrackTintMode;
    }

    private void applyTrackTint() {
        android.graphics.drawable.Drawable drawable = this.mTrackDrawable;
        if (drawable != null) {
            if (this.mHasTrackTint || this.mHasTrackTintMode) {
                android.graphics.drawable.Drawable drawableMutate = androidx.core.graphics.drawable.DrawableCompat.wrap(drawable).mutate();
                this.mTrackDrawable = drawableMutate;
                if (this.mHasTrackTint) {
                    androidx.core.graphics.drawable.DrawableCompat.setTintList(drawableMutate, this.mTrackTintList);
                }
                if (this.mHasTrackTintMode) {
                    androidx.core.graphics.drawable.DrawableCompat.setTintMode(this.mTrackDrawable, this.mTrackTintMode);
                }
                if (this.mTrackDrawable.isStateful()) {
                    this.mTrackDrawable.setState(getDrawableState());
                }
            }
        }
    }

    public void setThumbDrawable(android.graphics.drawable.Drawable drawable) {
        android.graphics.drawable.Drawable drawable2 = this.mThumbDrawable;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.mThumbDrawable = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbResource(int i) {
        setThumbDrawable(androidx.appcompat.content.res.AppCompatResources.getDrawable(getContext(), i));
    }

    public android.graphics.drawable.Drawable getThumbDrawable() {
        return this.mThumbDrawable;
    }

    public void setThumbTintList(android.content.res.ColorStateList colorStateList) {
        this.mThumbTintList = colorStateList;
        this.mHasThumbTint = true;
        applyThumbTint();
    }

    public android.content.res.ColorStateList getThumbTintList() {
        return this.mThumbTintList;
    }

    public void setThumbTintMode(android.graphics.PorterDuff.Mode mode) {
        this.mThumbTintMode = mode;
        this.mHasThumbTintMode = true;
        applyThumbTint();
    }

    public android.graphics.PorterDuff.Mode getThumbTintMode() {
        return this.mThumbTintMode;
    }

    private void applyThumbTint() {
        android.graphics.drawable.Drawable drawable = this.mThumbDrawable;
        if (drawable != null) {
            if (this.mHasThumbTint || this.mHasThumbTintMode) {
                android.graphics.drawable.Drawable drawableMutate = androidx.core.graphics.drawable.DrawableCompat.wrap(drawable).mutate();
                this.mThumbDrawable = drawableMutate;
                if (this.mHasThumbTint) {
                    androidx.core.graphics.drawable.DrawableCompat.setTintList(drawableMutate, this.mThumbTintList);
                }
                if (this.mHasThumbTintMode) {
                    androidx.core.graphics.drawable.DrawableCompat.setTintMode(this.mThumbDrawable, this.mThumbTintMode);
                }
                if (this.mThumbDrawable.isStateful()) {
                    this.mThumbDrawable.setState(getDrawableState());
                }
            }
        }
    }

    public void setSplitTrack(boolean z) {
        this.mSplitTrack = z;
        invalidate();
    }

    public boolean getSplitTrack() {
        return this.mSplitTrack;
    }

    public java.lang.CharSequence getTextOn() {
        return this.mTextOn;
    }

    private void setTextOnInternal(java.lang.CharSequence charSequence) {
        this.mTextOn = charSequence;
        this.mTextOnTransformed = doTransformForOnOffText(charSequence);
        this.mOnLayout = null;
        if (this.mShowText) {
            setupEmojiCompatLoadCallback();
        }
    }

    public void setTextOn(java.lang.CharSequence charSequence) {
        setTextOnInternal(charSequence);
        requestLayout();
        if (isChecked()) {
            setOnStateDescriptionOnRAndAbove();
        }
    }

    public java.lang.CharSequence getTextOff() {
        return this.mTextOff;
    }

    private void setTextOffInternal(java.lang.CharSequence charSequence) {
        this.mTextOff = charSequence;
        this.mTextOffTransformed = doTransformForOnOffText(charSequence);
        this.mOffLayout = null;
        if (this.mShowText) {
            setupEmojiCompatLoadCallback();
        }
    }

    public void setTextOff(java.lang.CharSequence charSequence) {
        setTextOffInternal(charSequence);
        requestLayout();
        if (isChecked()) {
            return;
        }
        setOffStateDescriptionOnRAndAbove();
    }

    private java.lang.CharSequence doTransformForOnOffText(java.lang.CharSequence charSequence) {
        android.text.method.TransformationMethod transformationMethodWrapTransformationMethod = getEmojiTextViewHelper().wrapTransformationMethod(this.mSwitchTransformationMethod);
        return transformationMethodWrapTransformationMethod != null ? transformationMethodWrapTransformationMethod.getTransformation(charSequence, this) : charSequence;
    }

    public void setShowText(boolean z) {
        if (this.mShowText != z) {
            this.mShowText = z;
            requestLayout();
            if (z) {
                setupEmojiCompatLoadCallback();
            }
        }
    }

    public boolean getShowText() {
        return this.mShowText;
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        int intrinsicWidth;
        int intrinsicHeight;
        int iMax;
        if (this.mShowText) {
            if (this.mOnLayout == null) {
                this.mOnLayout = makeLayout(this.mTextOnTransformed);
            }
            if (this.mOffLayout == null) {
                this.mOffLayout = makeLayout(this.mTextOffTransformed);
            }
        }
        android.graphics.Rect rect = this.mTempRect;
        android.graphics.drawable.Drawable drawable = this.mThumbDrawable;
        int intrinsicHeight2 = 0;
        if (drawable != null) {
            drawable.getPadding(rect);
            intrinsicWidth = (this.mThumbDrawable.getIntrinsicWidth() - rect.left) - rect.right;
            intrinsicHeight = this.mThumbDrawable.getIntrinsicHeight();
        } else {
            intrinsicWidth = 0;
            intrinsicHeight = 0;
        }
        this.mThumbWidth = java.lang.Math.max(this.mShowText ? java.lang.Math.max(this.mOnLayout.getWidth(), this.mOffLayout.getWidth()) + (this.mThumbTextPadding * 2) : 0, intrinsicWidth);
        android.graphics.drawable.Drawable drawable2 = this.mTrackDrawable;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            intrinsicHeight2 = this.mTrackDrawable.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int iMax2 = rect.left;
        int iMax3 = rect.right;
        android.graphics.drawable.Drawable drawable3 = this.mThumbDrawable;
        if (drawable3 != null) {
            android.graphics.Rect opticalBounds = androidx.appcompat.widget.DrawableUtils.getOpticalBounds(drawable3);
            iMax2 = java.lang.Math.max(iMax2, opticalBounds.left);
            iMax3 = java.lang.Math.max(iMax3, opticalBounds.right);
        }
        if (this.mEnforceSwitchWidth) {
            iMax = java.lang.Math.max(this.mSwitchMinWidth, (this.mThumbWidth * 2) + iMax2 + iMax3);
        } else {
            iMax = this.mSwitchMinWidth;
        }
        int iMax4 = java.lang.Math.max(intrinsicHeight2, intrinsicHeight);
        this.mSwitchWidth = iMax;
        this.mSwitchHeight = iMax4;
        super.onMeasure(i, i2);
        if (getMeasuredHeight() < iMax4) {
            setMeasuredDimension(getMeasuredWidthAndState(), iMax4);
        }
    }

    @Override // android.view.View
    public void onPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        java.lang.CharSequence charSequence = isChecked() ? this.mTextOn : this.mTextOff;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    private android.text.Layout makeLayout(java.lang.CharSequence charSequence) {
        android.text.TextPaint textPaint = this.mTextPaint;
        return new android.text.StaticLayout(charSequence, textPaint, charSequence != null ? (int) java.lang.Math.ceil(android.text.Layout.getDesiredWidth(charSequence, textPaint)) : 0, android.text.Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    private boolean hitThumb(float f, float f2) {
        if (this.mThumbDrawable == null) {
            return false;
        }
        int thumbOffset = getThumbOffset();
        this.mThumbDrawable.getPadding(this.mTempRect);
        int i = this.mSwitchTop;
        int i2 = this.mTouchSlop;
        int i3 = i - i2;
        int i4 = (this.mSwitchLeft + thumbOffset) - i2;
        int i5 = this.mThumbWidth + i4 + this.mTempRect.left + this.mTempRect.right;
        int i6 = this.mTouchSlop;
        return f > ((float) i4) && f < ((float) (i5 + i6)) && f2 > ((float) i3) && f2 < ((float) (this.mSwitchBottom + i6));
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0089  */
    /* JADX WARN: Code duplicated, block: B:36:0x008d  */
    /* JADX WARN: Code duplicated, block: B:38:0x0094  */
    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        float f;
        this.mVelocityTracker.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if (isEnabled() && hitThumb(x, y)) {
                this.mTouchMode = 1;
                this.mTouchX = x;
                this.mTouchY = y;
            }
        } else if (actionMasked == 1) {
            if (this.mTouchMode == 2) {
                stopDrag(motionEvent);
                super.onTouchEvent(motionEvent);
                return true;
            }
            this.mTouchMode = 0;
            this.mVelocityTracker.clear();
        } else if (actionMasked == 2) {
            int i = this.mTouchMode;
            if (i == 1) {
                float x2 = motionEvent.getX();
                float y2 = motionEvent.getY();
                if (java.lang.Math.abs(x2 - this.mTouchX) > this.mTouchSlop || java.lang.Math.abs(y2 - this.mTouchY) > this.mTouchSlop) {
                    this.mTouchMode = 2;
                    getParent().requestDisallowInterceptTouchEvent(true);
                    this.mTouchX = x2;
                    this.mTouchY = y2;
                    return true;
                }
            } else if (i == 2) {
                float x3 = motionEvent.getX();
                int thumbScrollRange = getThumbScrollRange();
                float f2 = x3 - this.mTouchX;
                if (thumbScrollRange != 0) {
                    f = f2 / thumbScrollRange;
                } else {
                    f = f2 > 0.0f ? 1.0f : -1.0f;
                }
                if (androidx.appcompat.widget.ViewUtils.isLayoutRtl(this)) {
                    f = -f;
                }
                float fConstrain = constrain(this.mThumbPosition + f, 0.0f, 1.0f);
                if (fConstrain != this.mThumbPosition) {
                    this.mTouchX = x3;
                    setThumbPosition(fConstrain);
                }
                return true;
            }
        } else if (actionMasked == 3) {
            if (this.mTouchMode == 2) {
                stopDrag(motionEvent);
                super.onTouchEvent(motionEvent);
                return true;
            }
            this.mTouchMode = 0;
            this.mVelocityTracker.clear();
        }
        return super.onTouchEvent(motionEvent);
    }

    private void cancelSuperTouch(android.view.MotionEvent motionEvent) {
        android.view.MotionEvent motionEventObtain = android.view.MotionEvent.obtain(motionEvent);
        motionEventObtain.setAction(3);
        super.onTouchEvent(motionEventObtain);
        motionEventObtain.recycle();
    }

    private void stopDrag(android.view.MotionEvent motionEvent) {
        this.mTouchMode = 0;
        boolean targetCheckedState = true;
        boolean z = motionEvent.getAction() == 1 && isEnabled();
        boolean zIsChecked = isChecked();
        if (z) {
            this.mVelocityTracker.computeCurrentVelocity(1000);
            float xVelocity = this.mVelocityTracker.getXVelocity();
            if (java.lang.Math.abs(xVelocity) > this.mMinFlingVelocity) {
                if (!androidx.appcompat.widget.ViewUtils.isLayoutRtl(this) ? xVelocity <= 0.0f : xVelocity >= 0.0f) {
                    targetCheckedState = false;
                }
            } else {
                targetCheckedState = getTargetCheckedState();
            }
        } else {
            targetCheckedState = zIsChecked;
        }
        if (targetCheckedState != zIsChecked) {
            playSoundEffect(0);
        }
        setChecked(targetCheckedState);
        cancelSuperTouch(motionEvent);
    }

    private void animateThumbToCheckedState(boolean z) {
        android.animation.ObjectAnimator objectAnimatorOfFloat = android.animation.ObjectAnimator.ofFloat(this, THUMB_POS, z ? 1.0f : 0.0f);
        this.mPositionAnimator = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(250L);
        androidx.appcompat.widget.SwitchCompat.Api18Impl.setAutoCancel(this.mPositionAnimator, true);
        this.mPositionAnimator.start();
    }

    private void cancelPositionAnimator() {
        android.animation.ObjectAnimator objectAnimator = this.mPositionAnimator;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    private boolean getTargetCheckedState() {
        return this.mThumbPosition > 0.5f;
    }

    protected final float getThumbPosition() {
        return this.mThumbPosition;
    }

    void setThumbPosition(float f) {
        this.mThumbPosition = f;
        invalidate();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        super.setChecked(z);
        boolean zIsChecked = isChecked();
        if (zIsChecked) {
            setOnStateDescriptionOnRAndAbove();
        } else {
            setOffStateDescriptionOnRAndAbove();
        }
        if (getWindowToken() != null && androidx.core.view.ViewCompat.isLaidOut(this)) {
            animateThumbToCheckedState(zIsChecked);
        } else {
            cancelPositionAnimator();
            setThumbPosition(zIsChecked ? 1.0f : 0.0f);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iMax;
        int width;
        int paddingLeft;
        int i5;
        int paddingTop;
        int height;
        super.onLayout(z, i, i2, i3, i4);
        int iMax2 = 0;
        if (this.mThumbDrawable != null) {
            android.graphics.Rect rect = this.mTempRect;
            android.graphics.drawable.Drawable drawable = this.mTrackDrawable;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            android.graphics.Rect opticalBounds = androidx.appcompat.widget.DrawableUtils.getOpticalBounds(this.mThumbDrawable);
            iMax = java.lang.Math.max(0, opticalBounds.left - rect.left);
            iMax2 = java.lang.Math.max(0, opticalBounds.right - rect.right);
        } else {
            iMax = 0;
        }
        if (androidx.appcompat.widget.ViewUtils.isLayoutRtl(this)) {
            paddingLeft = getPaddingLeft() + iMax;
            width = ((this.mSwitchWidth + paddingLeft) - iMax) - iMax2;
        } else {
            width = (getWidth() - getPaddingRight()) - iMax2;
            paddingLeft = (width - this.mSwitchWidth) + iMax + iMax2;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            int paddingTop2 = ((getPaddingTop() + getHeight()) - getPaddingBottom()) / 2;
            i5 = this.mSwitchHeight;
            paddingTop = paddingTop2 - (i5 / 2);
        } else {
            if (gravity != 80) {
                paddingTop = getPaddingTop();
                i5 = this.mSwitchHeight;
            } else {
                height = getHeight() - getPaddingBottom();
                paddingTop = height - this.mSwitchHeight;
            }
            this.mSwitchLeft = paddingLeft;
            this.mSwitchTop = paddingTop;
            this.mSwitchBottom = height;
            this.mSwitchRight = width;
        }
        height = i5 + paddingTop;
        this.mSwitchLeft = paddingLeft;
        this.mSwitchTop = paddingTop;
        this.mSwitchBottom = height;
        this.mSwitchRight = width;
    }

    @Override // android.view.View
    public void draw(android.graphics.Canvas canvas) {
        android.graphics.Rect opticalBounds;
        int i;
        int i2;
        android.graphics.Rect rect = this.mTempRect;
        int i3 = this.mSwitchLeft;
        int i4 = this.mSwitchTop;
        int i5 = this.mSwitchRight;
        int i6 = this.mSwitchBottom;
        int thumbOffset = getThumbOffset() + i3;
        android.graphics.drawable.Drawable drawable = this.mThumbDrawable;
        if (drawable != null) {
            opticalBounds = androidx.appcompat.widget.DrawableUtils.getOpticalBounds(drawable);
        } else {
            opticalBounds = androidx.appcompat.widget.DrawableUtils.INSETS_NONE;
        }
        android.graphics.drawable.Drawable drawable2 = this.mTrackDrawable;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            thumbOffset += rect.left;
            if (opticalBounds != null) {
                if (opticalBounds.left > rect.left) {
                    i3 += opticalBounds.left - rect.left;
                }
                i = opticalBounds.top > rect.top ? (opticalBounds.top - rect.top) + i4 : i4;
                if (opticalBounds.right > rect.right) {
                    i5 -= opticalBounds.right - rect.right;
                }
                if (opticalBounds.bottom > rect.bottom) {
                    i2 = i6 - (opticalBounds.bottom - rect.bottom);
                }
                this.mTrackDrawable.setBounds(i3, i, i5, i2);
            } else {
                i = i4;
            }
            i2 = i6;
            this.mTrackDrawable.setBounds(i3, i, i5, i2);
        }
        android.graphics.drawable.Drawable drawable3 = this.mThumbDrawable;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i7 = thumbOffset - rect.left;
            int i8 = thumbOffset + this.mThumbWidth + rect.right;
            this.mThumbDrawable.setBounds(i7, i4, i8, i6);
            android.graphics.drawable.Drawable background = getBackground();
            if (background != null) {
                androidx.core.graphics.drawable.DrawableCompat.setHotspotBounds(background, i7, i4, i8, i6);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void onDraw(android.graphics.Canvas canvas) {
        int width;
        super.onDraw(canvas);
        android.graphics.Rect rect = this.mTempRect;
        android.graphics.drawable.Drawable drawable = this.mTrackDrawable;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i = this.mSwitchTop;
        int i2 = this.mSwitchBottom;
        int i3 = i + rect.top;
        int i4 = i2 - rect.bottom;
        android.graphics.drawable.Drawable drawable2 = this.mThumbDrawable;
        if (drawable != null) {
            if (this.mSplitTrack && drawable2 != null) {
                android.graphics.Rect opticalBounds = androidx.appcompat.widget.DrawableUtils.getOpticalBounds(drawable2);
                drawable2.copyBounds(rect);
                rect.left += opticalBounds.left;
                rect.right -= opticalBounds.right;
                int iSave = canvas.save();
                canvas.clipRect(rect, android.graphics.Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(iSave);
            } else {
                drawable.draw(canvas);
            }
        }
        int iSave2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        android.text.Layout layout = getTargetCheckedState() ? this.mOnLayout : this.mOffLayout;
        if (layout != null) {
            int[] drawableState = getDrawableState();
            android.content.res.ColorStateList colorStateList = this.mTextColors;
            if (colorStateList != null) {
                this.mTextPaint.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            this.mTextPaint.drawableState = drawableState;
            if (drawable2 != null) {
                android.graphics.Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (layout.getWidth() / 2), ((i3 + i4) / 2) - (layout.getHeight() / 2));
            layout.draw(canvas);
        }
        canvas.restoreToCount(iSave2);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        if (!androidx.appcompat.widget.ViewUtils.isLayoutRtl(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.mSwitchWidth;
        return !android.text.TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.mSwitchPadding : compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        if (androidx.appcompat.widget.ViewUtils.isLayoutRtl(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.mSwitchWidth;
        return !android.text.TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.mSwitchPadding : compoundPaddingRight;
    }

    private int getThumbOffset() {
        float f;
        if (androidx.appcompat.widget.ViewUtils.isLayoutRtl(this)) {
            f = 1.0f - this.mThumbPosition;
        } else {
            f = this.mThumbPosition;
        }
        return (int) ((f * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        android.graphics.Rect opticalBounds;
        android.graphics.drawable.Drawable drawable = this.mTrackDrawable;
        if (drawable == null) {
            return 0;
        }
        android.graphics.Rect rect = this.mTempRect;
        drawable.getPadding(rect);
        android.graphics.drawable.Drawable drawable2 = this.mThumbDrawable;
        if (drawable2 != null) {
            opticalBounds = androidx.appcompat.widget.DrawableUtils.getOpticalBounds(drawable2);
        } else {
            opticalBounds = androidx.appcompat.widget.DrawableUtils.INSETS_NONE;
        }
        return ((((this.mSwitchWidth - this.mThumbWidth) - rect.left) - rect.right) - opticalBounds.left) - opticalBounds.right;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            mergeDrawableStates(iArrOnCreateDrawableState, CHECKED_STATE_SET);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        android.graphics.drawable.Drawable drawable = this.mThumbDrawable;
        boolean state = false;
        if (drawable != null && drawable.isStateful()) {
            state = false | drawable.setState(drawableState);
        }
        android.graphics.drawable.Drawable drawable2 = this.mTrackDrawable;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        android.graphics.drawable.Drawable drawable = this.mThumbDrawable;
        if (drawable != null) {
            androidx.core.graphics.drawable.DrawableCompat.setHotspot(drawable, f, f2);
        }
        android.graphics.drawable.Drawable drawable2 = this.mTrackDrawable;
        if (drawable2 != null) {
            androidx.core.graphics.drawable.DrawableCompat.setHotspot(drawable2, f, f2);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected boolean verifyDrawable(android.graphics.drawable.Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.mThumbDrawable || drawable == this.mTrackDrawable;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        android.graphics.drawable.Drawable drawable = this.mThumbDrawable;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        android.graphics.drawable.Drawable drawable2 = this.mTrackDrawable;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        android.animation.ObjectAnimator objectAnimator = this.mPositionAnimator;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            return;
        }
        this.mPositionAnimator.end();
        this.mPositionAnimator = null;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(ACCESSIBILITY_EVENT_CLASS_NAME);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(ACCESSIBILITY_EVENT_CLASS_NAME);
        if (android.os.Build.VERSION.SDK_INT < 30) {
            java.lang.CharSequence charSequence = isChecked() ? this.mTextOn : this.mTextOff;
            if (android.text.TextUtils.isEmpty(charSequence)) {
                return;
            }
            java.lang.CharSequence text = accessibilityNodeInfo.getText();
            if (android.text.TextUtils.isEmpty(text)) {
                accessibilityNodeInfo.setText(charSequence);
                return;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(text).append(' ').append(charSequence);
            accessibilityNodeInfo.setText(sb);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(android.view.ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.TextViewCompat.wrapCustomSelectionActionModeCallback(this, callback));
    }

    @Override // android.widget.TextView
    public android.view.ActionMode.Callback getCustomSelectionActionModeCallback() {
        return androidx.core.widget.TextViewCompat.unwrapCustomSelectionActionModeCallback(super.getCustomSelectionActionModeCallback());
    }

    protected final void setEnforceSwitchWidth(boolean z) {
        this.mEnforceSwitchWidth = z;
        invalidate();
    }

    private void setOnStateDescriptionOnRAndAbove() {
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            java.lang.CharSequence string = this.mTextOn;
            if (string == null) {
                string = getResources().getString(androidx.appcompat.R.string.abc_capital_on);
            }
            androidx.core.view.ViewCompat.setStateDescription(this, string);
        }
    }

    private void setOffStateDescriptionOnRAndAbove() {
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            java.lang.CharSequence string = this.mTextOff;
            if (string == null) {
                string = getResources().getString(androidx.appcompat.R.string.abc_capital_off);
            }
            androidx.core.view.ViewCompat.setStateDescription(this, string);
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().setAllCaps(z);
    }

    @Override // android.widget.TextView
    public void setFilters(android.text.InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().getFilters(inputFilterArr));
    }

    private androidx.appcompat.widget.AppCompatEmojiTextHelper getEmojiTextViewHelper() {
        if (this.mAppCompatEmojiTextHelper == null) {
            this.mAppCompatEmojiTextHelper = new androidx.appcompat.widget.AppCompatEmojiTextHelper(this);
        }
        return this.mAppCompatEmojiTextHelper;
    }

    @Override // androidx.appcompat.widget.EmojiCompatConfigurationView
    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().setEnabled(z);
        setTextOnInternal(this.mTextOn);
        setTextOffInternal(this.mTextOff);
        requestLayout();
    }

    @Override // androidx.appcompat.widget.EmojiCompatConfigurationView
    public boolean isEmojiCompatEnabled() {
        return getEmojiTextViewHelper().isEnabled();
    }

    private void setupEmojiCompatLoadCallback() {
        if (this.mEmojiCompatInitCallback == null && this.mAppCompatEmojiTextHelper.isEnabled() && androidx.emoji2.text.EmojiCompat.isConfigured()) {
            androidx.emoji2.text.EmojiCompat emojiCompat = androidx.emoji2.text.EmojiCompat.get();
            int loadState = emojiCompat.getLoadState();
            if (loadState == 3 || loadState == 0) {
                androidx.appcompat.widget.SwitchCompat.EmojiCompatInitCallback emojiCompatInitCallback = new androidx.appcompat.widget.SwitchCompat.EmojiCompatInitCallback(this);
                this.mEmojiCompatInitCallback = emojiCompatInitCallback;
                emojiCompat.registerInitCallback(emojiCompatInitCallback);
            }
        }
    }

    void onEmojiCompatInitializedForSwitchText() {
        setTextOnInternal(this.mTextOn);
        setTextOffInternal(this.mTextOff);
        requestLayout();
    }

    static class EmojiCompatInitCallback extends androidx.emoji2.text.EmojiCompat.InitCallback {
        private final java.lang.ref.Reference<androidx.appcompat.widget.SwitchCompat> mOuterWeakRef;

        EmojiCompatInitCallback(androidx.appcompat.widget.SwitchCompat switchCompat) {
            this.mOuterWeakRef = new java.lang.ref.WeakReference(switchCompat);
        }

        @Override // androidx.emoji2.text.EmojiCompat.InitCallback
        public void onInitialized() {
            androidx.appcompat.widget.SwitchCompat switchCompat = this.mOuterWeakRef.get();
            if (switchCompat != null) {
                switchCompat.onEmojiCompatInitializedForSwitchText();
            }
        }

        @Override // androidx.emoji2.text.EmojiCompat.InitCallback
        public void onFailed(java.lang.Throwable th) {
            androidx.appcompat.widget.SwitchCompat switchCompat = this.mOuterWeakRef.get();
            if (switchCompat != null) {
                switchCompat.onEmojiCompatInitializedForSwitchText();
            }
        }
    }

    static class Api18Impl {
        private Api18Impl() {
        }

        static void setAutoCancel(android.animation.ObjectAnimator objectAnimator, boolean z) {
            objectAnimator.setAutoCancel(z);
        }
    }
}
