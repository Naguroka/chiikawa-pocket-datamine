package com.google.android.material.textfield;

/* JADX INFO: loaded from: classes5.dex */
public class TextInputLayout extends android.widget.LinearLayout {
    public static final int BOX_BACKGROUND_FILLED = 1;
    public static final int BOX_BACKGROUND_NONE = 0;
    public static final int BOX_BACKGROUND_OUTLINE = 2;
    private static final int DEF_STYLE_RES = com.google.android.material.R.style.Widget_Design_TextInputLayout;
    private static final int[][] EDIT_TEXT_BACKGROUND_RIPPLE_STATE = {new int[]{android.R.attr.state_pressed}, new int[0]};
    public static final int END_ICON_CLEAR_TEXT = 2;
    public static final int END_ICON_CUSTOM = -1;
    public static final int END_ICON_DROPDOWN_MENU = 3;
    public static final int END_ICON_NONE = 0;
    public static final int END_ICON_PASSWORD_TOGGLE = 1;
    private static final int INVALID_MAX_LENGTH = -1;
    private static final int LABEL_SCALE_ANIMATION_DURATION = 167;
    private static final java.lang.String LOG_TAG = "TextInputLayout";
    private static final int NO_WIDTH = -1;
    private static final long PLACEHOLDER_FADE_DURATION = 87;
    private static final long PLACEHOLDER_START_DELAY = 67;
    private android.animation.ValueAnimator animator;
    private boolean areCornerRadiiRtl;
    private com.google.android.material.shape.MaterialShapeDrawable boxBackground;
    private boolean boxBackgroundApplied;
    private int boxBackgroundColor;
    private int boxBackgroundMode;
    private int boxCollapsedPaddingTopPx;
    private final int boxLabelCutoutPaddingPx;
    private int boxStrokeColor;
    private int boxStrokeWidthDefaultPx;
    private int boxStrokeWidthFocusedPx;
    private int boxStrokeWidthPx;
    private com.google.android.material.shape.MaterialShapeDrawable boxUnderlineDefault;
    private com.google.android.material.shape.MaterialShapeDrawable boxUnderlineFocused;
    final com.google.android.material.internal.CollapsingTextHelper collapsingTextHelper;
    boolean counterEnabled;
    private int counterMaxLength;
    private int counterOverflowTextAppearance;
    private android.content.res.ColorStateList counterOverflowTextColor;
    private boolean counterOverflowed;
    private int counterTextAppearance;
    private android.content.res.ColorStateList counterTextColor;
    private android.widget.TextView counterView;
    private int defaultFilledBackgroundColor;
    private android.content.res.ColorStateList defaultHintTextColor;
    private int defaultStrokeColor;
    private int disabledColor;
    private int disabledFilledBackgroundColor;
    android.widget.EditText editText;
    private final java.util.LinkedHashSet<com.google.android.material.textfield.TextInputLayout.OnEditTextAttachedListener> editTextAttachedListeners;
    private android.graphics.drawable.Drawable endDummyDrawable;
    private int endDummyDrawableWidth;
    private final com.google.android.material.textfield.EndCompoundLayout endLayout;
    private boolean expandedHintEnabled;
    private android.graphics.drawable.StateListDrawable filledDropDownMenuBackground;
    private int focusedFilledBackgroundColor;
    private int focusedStrokeColor;
    private android.content.res.ColorStateList focusedTextColor;
    private java.lang.CharSequence hint;
    private boolean hintAnimationEnabled;
    private boolean hintEnabled;
    private boolean hintExpanded;
    private int hoveredFilledBackgroundColor;
    private int hoveredStrokeColor;
    private boolean inDrawableStateChanged;
    private final com.google.android.material.textfield.IndicatorViewController indicatorViewController;
    private final android.widget.FrameLayout inputFrame;
    private boolean isProvidingHint;
    private com.google.android.material.textfield.TextInputLayout.LengthCounter lengthCounter;
    private int maxEms;
    private int maxWidth;
    private int minEms;
    private int minWidth;
    private android.graphics.drawable.Drawable originalEditTextEndDrawable;
    private java.lang.CharSequence originalHint;
    private com.google.android.material.shape.MaterialShapeDrawable outlinedDropDownMenuBackground;
    private boolean placeholderEnabled;
    private androidx.transition.Fade placeholderFadeIn;
    private androidx.transition.Fade placeholderFadeOut;
    private java.lang.CharSequence placeholderText;
    private int placeholderTextAppearance;
    private android.content.res.ColorStateList placeholderTextColor;
    private android.widget.TextView placeholderTextView;
    private boolean restoringSavedState;
    private com.google.android.material.shape.ShapeAppearanceModel shapeAppearanceModel;
    private android.graphics.drawable.Drawable startDummyDrawable;
    private int startDummyDrawableWidth;
    private final com.google.android.material.textfield.StartCompoundLayout startLayout;
    private android.content.res.ColorStateList strokeErrorColor;
    private final android.graphics.Rect tmpBoundsRect;
    private final android.graphics.Rect tmpRect;
    private final android.graphics.RectF tmpRectF;
    private android.graphics.Typeface typeface;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface BoxBackgroundMode {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface EndIconMode {
    }

    public interface LengthCounter {
        int countLength(android.text.Editable editable);
    }

    public interface OnEditTextAttachedListener {
        void onEditTextAttached(com.google.android.material.textfield.TextInputLayout textInputLayout);
    }

    public interface OnEndIconChangedListener {
        void onEndIconChanged(com.google.android.material.textfield.TextInputLayout textInputLayout, int i);
    }

    static /* synthetic */ int lambda$new$0(android.text.Editable editable) {
        if (editable != null) {
            return editable.length();
        }
        return 0;
    }

    public TextInputLayout(android.content.Context context) {
        this(context, null);
    }

    public TextInputLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.material.R.attr.textInputStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TextInputLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        int i2 = DEF_STYLE_RES;
        super(com.google.android.material.theme.overlay.MaterialThemeOverlay.wrap(context, attributeSet, i, i2), attributeSet, i);
        this.minEms = -1;
        this.maxEms = -1;
        this.minWidth = -1;
        this.maxWidth = -1;
        this.indicatorViewController = new com.google.android.material.textfield.IndicatorViewController(this);
        this.lengthCounter = new com.google.android.material.textfield.TextInputLayout.LengthCounter() { // from class: com.google.android.material.textfield.TextInputLayout$$ExternalSyntheticLambda0
            @Override // com.google.android.material.textfield.TextInputLayout.LengthCounter
            public final int countLength(android.text.Editable editable) {
                return com.google.android.material.textfield.TextInputLayout.lambda$new$0(editable);
            }
        };
        this.tmpRect = new android.graphics.Rect();
        this.tmpBoundsRect = new android.graphics.Rect();
        this.tmpRectF = new android.graphics.RectF();
        this.editTextAttachedListeners = new java.util.LinkedHashSet<>();
        com.google.android.material.internal.CollapsingTextHelper collapsingTextHelper = new com.google.android.material.internal.CollapsingTextHelper(this);
        this.collapsingTextHelper = collapsingTextHelper;
        android.content.Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(context2);
        this.inputFrame = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        collapsingTextHelper.setTextSizeInterpolator(com.google.android.material.animation.AnimationUtils.LINEAR_INTERPOLATOR);
        collapsingTextHelper.setPositionInterpolator(com.google.android.material.animation.AnimationUtils.LINEAR_INTERPOLATOR);
        collapsingTextHelper.setCollapsedTextGravity(8388659);
        androidx.appcompat.widget.TintTypedArray tintTypedArrayObtainTintedStyledAttributes = com.google.android.material.internal.ThemeEnforcement.obtainTintedStyledAttributes(context2, attributeSet, com.google.android.material.R.styleable.TextInputLayout, i, i2, com.google.android.material.R.styleable.TextInputLayout_counterTextAppearance, com.google.android.material.R.styleable.TextInputLayout_counterOverflowTextAppearance, com.google.android.material.R.styleable.TextInputLayout_errorTextAppearance, com.google.android.material.R.styleable.TextInputLayout_helperTextTextAppearance, com.google.android.material.R.styleable.TextInputLayout_hintTextAppearance);
        com.google.android.material.textfield.StartCompoundLayout startCompoundLayout = new com.google.android.material.textfield.StartCompoundLayout(this, tintTypedArrayObtainTintedStyledAttributes);
        this.startLayout = startCompoundLayout;
        this.hintEnabled = tintTypedArrayObtainTintedStyledAttributes.getBoolean(com.google.android.material.R.styleable.TextInputLayout_hintEnabled, true);
        setHint(tintTypedArrayObtainTintedStyledAttributes.getText(com.google.android.material.R.styleable.TextInputLayout_android_hint));
        this.hintAnimationEnabled = tintTypedArrayObtainTintedStyledAttributes.getBoolean(com.google.android.material.R.styleable.TextInputLayout_hintAnimationEnabled, true);
        this.expandedHintEnabled = tintTypedArrayObtainTintedStyledAttributes.getBoolean(com.google.android.material.R.styleable.TextInputLayout_expandedHintEnabled, true);
        if (tintTypedArrayObtainTintedStyledAttributes.hasValue(com.google.android.material.R.styleable.TextInputLayout_android_minEms)) {
            setMinEms(tintTypedArrayObtainTintedStyledAttributes.getInt(com.google.android.material.R.styleable.TextInputLayout_android_minEms, -1));
        } else if (tintTypedArrayObtainTintedStyledAttributes.hasValue(com.google.android.material.R.styleable.TextInputLayout_android_minWidth)) {
            setMinWidth(tintTypedArrayObtainTintedStyledAttributes.getDimensionPixelSize(com.google.android.material.R.styleable.TextInputLayout_android_minWidth, -1));
        }
        if (tintTypedArrayObtainTintedStyledAttributes.hasValue(com.google.android.material.R.styleable.TextInputLayout_android_maxEms)) {
            setMaxEms(tintTypedArrayObtainTintedStyledAttributes.getInt(com.google.android.material.R.styleable.TextInputLayout_android_maxEms, -1));
        } else if (tintTypedArrayObtainTintedStyledAttributes.hasValue(com.google.android.material.R.styleable.TextInputLayout_android_maxWidth)) {
            setMaxWidth(tintTypedArrayObtainTintedStyledAttributes.getDimensionPixelSize(com.google.android.material.R.styleable.TextInputLayout_android_maxWidth, -1));
        }
        this.shapeAppearanceModel = com.google.android.material.shape.ShapeAppearanceModel.builder(context2, attributeSet, i, i2).build();
        this.boxLabelCutoutPaddingPx = context2.getResources().getDimensionPixelOffset(com.google.android.material.R.dimen.mtrl_textinput_box_label_cutout_padding);
        this.boxCollapsedPaddingTopPx = tintTypedArrayObtainTintedStyledAttributes.getDimensionPixelOffset(com.google.android.material.R.styleable.TextInputLayout_boxCollapsedPaddingTop, 0);
        this.boxStrokeWidthDefaultPx = tintTypedArrayObtainTintedStyledAttributes.getDimensionPixelSize(com.google.android.material.R.styleable.TextInputLayout_boxStrokeWidth, context2.getResources().getDimensionPixelSize(com.google.android.material.R.dimen.mtrl_textinput_box_stroke_width_default));
        this.boxStrokeWidthFocusedPx = tintTypedArrayObtainTintedStyledAttributes.getDimensionPixelSize(com.google.android.material.R.styleable.TextInputLayout_boxStrokeWidthFocused, context2.getResources().getDimensionPixelSize(com.google.android.material.R.dimen.mtrl_textinput_box_stroke_width_focused));
        this.boxStrokeWidthPx = this.boxStrokeWidthDefaultPx;
        float dimension = tintTypedArrayObtainTintedStyledAttributes.getDimension(com.google.android.material.R.styleable.TextInputLayout_boxCornerRadiusTopStart, -1.0f);
        float dimension2 = tintTypedArrayObtainTintedStyledAttributes.getDimension(com.google.android.material.R.styleable.TextInputLayout_boxCornerRadiusTopEnd, -1.0f);
        float dimension3 = tintTypedArrayObtainTintedStyledAttributes.getDimension(com.google.android.material.R.styleable.TextInputLayout_boxCornerRadiusBottomEnd, -1.0f);
        float dimension4 = tintTypedArrayObtainTintedStyledAttributes.getDimension(com.google.android.material.R.styleable.TextInputLayout_boxCornerRadiusBottomStart, -1.0f);
        com.google.android.material.shape.ShapeAppearanceModel.Builder builder = this.shapeAppearanceModel.toBuilder();
        if (dimension >= 0.0f) {
            builder.setTopLeftCornerSize(dimension);
        }
        if (dimension2 >= 0.0f) {
            builder.setTopRightCornerSize(dimension2);
        }
        if (dimension3 >= 0.0f) {
            builder.setBottomRightCornerSize(dimension3);
        }
        if (dimension4 >= 0.0f) {
            builder.setBottomLeftCornerSize(dimension4);
        }
        this.shapeAppearanceModel = builder.build();
        android.content.res.ColorStateList colorStateList = com.google.android.material.resources.MaterialResources.getColorStateList(context2, tintTypedArrayObtainTintedStyledAttributes, com.google.android.material.R.styleable.TextInputLayout_boxBackgroundColor);
        if (colorStateList != null) {
            int defaultColor = colorStateList.getDefaultColor();
            this.defaultFilledBackgroundColor = defaultColor;
            this.boxBackgroundColor = defaultColor;
            if (colorStateList.isStateful()) {
                this.disabledFilledBackgroundColor = colorStateList.getColorForState(new int[]{-16842910}, -1);
                this.focusedFilledBackgroundColor = colorStateList.getColorForState(new int[]{android.R.attr.state_focused, android.R.attr.state_enabled}, -1);
                this.hoveredFilledBackgroundColor = colorStateList.getColorForState(new int[]{android.R.attr.state_hovered, android.R.attr.state_enabled}, -1);
            } else {
                this.focusedFilledBackgroundColor = this.defaultFilledBackgroundColor;
                android.content.res.ColorStateList colorStateList2 = androidx.appcompat.content.res.AppCompatResources.getColorStateList(context2, com.google.android.material.R.color.mtrl_filled_background_color);
                this.disabledFilledBackgroundColor = colorStateList2.getColorForState(new int[]{-16842910}, -1);
                this.hoveredFilledBackgroundColor = colorStateList2.getColorForState(new int[]{android.R.attr.state_hovered}, -1);
            }
        } else {
            this.boxBackgroundColor = 0;
            this.defaultFilledBackgroundColor = 0;
            this.disabledFilledBackgroundColor = 0;
            this.focusedFilledBackgroundColor = 0;
            this.hoveredFilledBackgroundColor = 0;
        }
        if (tintTypedArrayObtainTintedStyledAttributes.hasValue(com.google.android.material.R.styleable.TextInputLayout_android_textColorHint)) {
            android.content.res.ColorStateList colorStateList3 = tintTypedArrayObtainTintedStyledAttributes.getColorStateList(com.google.android.material.R.styleable.TextInputLayout_android_textColorHint);
            this.focusedTextColor = colorStateList3;
            this.defaultHintTextColor = colorStateList3;
        }
        android.content.res.ColorStateList colorStateList4 = com.google.android.material.resources.MaterialResources.getColorStateList(context2, tintTypedArrayObtainTintedStyledAttributes, com.google.android.material.R.styleable.TextInputLayout_boxStrokeColor);
        this.focusedStrokeColor = tintTypedArrayObtainTintedStyledAttributes.getColor(com.google.android.material.R.styleable.TextInputLayout_boxStrokeColor, 0);
        this.defaultStrokeColor = androidx.core.content.ContextCompat.getColor(context2, com.google.android.material.R.color.mtrl_textinput_default_box_stroke_color);
        this.disabledColor = androidx.core.content.ContextCompat.getColor(context2, com.google.android.material.R.color.mtrl_textinput_disabled_color);
        this.hoveredStrokeColor = androidx.core.content.ContextCompat.getColor(context2, com.google.android.material.R.color.mtrl_textinput_hovered_box_stroke_color);
        if (colorStateList4 != null) {
            setBoxStrokeColorStateList(colorStateList4);
        }
        if (tintTypedArrayObtainTintedStyledAttributes.hasValue(com.google.android.material.R.styleable.TextInputLayout_boxStrokeErrorColor)) {
            setBoxStrokeErrorColor(com.google.android.material.resources.MaterialResources.getColorStateList(context2, tintTypedArrayObtainTintedStyledAttributes, com.google.android.material.R.styleable.TextInputLayout_boxStrokeErrorColor));
        }
        if (tintTypedArrayObtainTintedStyledAttributes.getResourceId(com.google.android.material.R.styleable.TextInputLayout_hintTextAppearance, -1) != -1) {
            setHintTextAppearance(tintTypedArrayObtainTintedStyledAttributes.getResourceId(com.google.android.material.R.styleable.TextInputLayout_hintTextAppearance, 0));
        }
        int resourceId = tintTypedArrayObtainTintedStyledAttributes.getResourceId(com.google.android.material.R.styleable.TextInputLayout_errorTextAppearance, 0);
        java.lang.CharSequence text = tintTypedArrayObtainTintedStyledAttributes.getText(com.google.android.material.R.styleable.TextInputLayout_errorContentDescription);
        boolean z = tintTypedArrayObtainTintedStyledAttributes.getBoolean(com.google.android.material.R.styleable.TextInputLayout_errorEnabled, false);
        int resourceId2 = tintTypedArrayObtainTintedStyledAttributes.getResourceId(com.google.android.material.R.styleable.TextInputLayout_helperTextTextAppearance, 0);
        boolean z2 = tintTypedArrayObtainTintedStyledAttributes.getBoolean(com.google.android.material.R.styleable.TextInputLayout_helperTextEnabled, false);
        java.lang.CharSequence text2 = tintTypedArrayObtainTintedStyledAttributes.getText(com.google.android.material.R.styleable.TextInputLayout_helperText);
        int resourceId3 = tintTypedArrayObtainTintedStyledAttributes.getResourceId(com.google.android.material.R.styleable.TextInputLayout_placeholderTextAppearance, 0);
        java.lang.CharSequence text3 = tintTypedArrayObtainTintedStyledAttributes.getText(com.google.android.material.R.styleable.TextInputLayout_placeholderText);
        boolean z3 = tintTypedArrayObtainTintedStyledAttributes.getBoolean(com.google.android.material.R.styleable.TextInputLayout_counterEnabled, false);
        setCounterMaxLength(tintTypedArrayObtainTintedStyledAttributes.getInt(com.google.android.material.R.styleable.TextInputLayout_counterMaxLength, -1));
        this.counterTextAppearance = tintTypedArrayObtainTintedStyledAttributes.getResourceId(com.google.android.material.R.styleable.TextInputLayout_counterTextAppearance, 0);
        this.counterOverflowTextAppearance = tintTypedArrayObtainTintedStyledAttributes.getResourceId(com.google.android.material.R.styleable.TextInputLayout_counterOverflowTextAppearance, 0);
        setBoxBackgroundMode(tintTypedArrayObtainTintedStyledAttributes.getInt(com.google.android.material.R.styleable.TextInputLayout_boxBackgroundMode, 0));
        setErrorContentDescription(text);
        setCounterOverflowTextAppearance(this.counterOverflowTextAppearance);
        setHelperTextTextAppearance(resourceId2);
        setErrorTextAppearance(resourceId);
        setCounterTextAppearance(this.counterTextAppearance);
        setPlaceholderText(text3);
        setPlaceholderTextAppearance(resourceId3);
        if (tintTypedArrayObtainTintedStyledAttributes.hasValue(com.google.android.material.R.styleable.TextInputLayout_errorTextColor)) {
            setErrorTextColor(tintTypedArrayObtainTintedStyledAttributes.getColorStateList(com.google.android.material.R.styleable.TextInputLayout_errorTextColor));
        }
        if (tintTypedArrayObtainTintedStyledAttributes.hasValue(com.google.android.material.R.styleable.TextInputLayout_helperTextTextColor)) {
            setHelperTextColor(tintTypedArrayObtainTintedStyledAttributes.getColorStateList(com.google.android.material.R.styleable.TextInputLayout_helperTextTextColor));
        }
        if (tintTypedArrayObtainTintedStyledAttributes.hasValue(com.google.android.material.R.styleable.TextInputLayout_hintTextColor)) {
            setHintTextColor(tintTypedArrayObtainTintedStyledAttributes.getColorStateList(com.google.android.material.R.styleable.TextInputLayout_hintTextColor));
        }
        if (tintTypedArrayObtainTintedStyledAttributes.hasValue(com.google.android.material.R.styleable.TextInputLayout_counterTextColor)) {
            setCounterTextColor(tintTypedArrayObtainTintedStyledAttributes.getColorStateList(com.google.android.material.R.styleable.TextInputLayout_counterTextColor));
        }
        if (tintTypedArrayObtainTintedStyledAttributes.hasValue(com.google.android.material.R.styleable.TextInputLayout_counterOverflowTextColor)) {
            setCounterOverflowTextColor(tintTypedArrayObtainTintedStyledAttributes.getColorStateList(com.google.android.material.R.styleable.TextInputLayout_counterOverflowTextColor));
        }
        if (tintTypedArrayObtainTintedStyledAttributes.hasValue(com.google.android.material.R.styleable.TextInputLayout_placeholderTextColor)) {
            setPlaceholderTextColor(tintTypedArrayObtainTintedStyledAttributes.getColorStateList(com.google.android.material.R.styleable.TextInputLayout_placeholderTextColor));
        }
        com.google.android.material.textfield.EndCompoundLayout endCompoundLayout = new com.google.android.material.textfield.EndCompoundLayout(this, tintTypedArrayObtainTintedStyledAttributes);
        this.endLayout = endCompoundLayout;
        boolean z4 = tintTypedArrayObtainTintedStyledAttributes.getBoolean(com.google.android.material.R.styleable.TextInputLayout_android_enabled, true);
        tintTypedArrayObtainTintedStyledAttributes.recycle();
        androidx.core.view.ViewCompat.setImportantForAccessibility(this, 2);
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            androidx.core.view.ViewCompat.setImportantForAutofill(this, 1);
        }
        frameLayout.addView(startCompoundLayout);
        frameLayout.addView(endCompoundLayout);
        addView(frameLayout);
        setEnabled(z4);
        setHelperTextEnabled(z2);
        setErrorEnabled(z);
        setCounterEnabled(z3);
        setHelperText(text2);
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View view, int i, android.view.ViewGroup.LayoutParams layoutParams) {
        if (view instanceof android.widget.EditText) {
            android.widget.FrameLayout.LayoutParams layoutParams2 = new android.widget.FrameLayout.LayoutParams(layoutParams);
            layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
            this.inputFrame.addView(view, layoutParams2);
            this.inputFrame.setLayoutParams(layoutParams);
            updateInputLayoutMargins();
            setEditText((android.widget.EditText) view);
            return;
        }
        super.addView(view, i, layoutParams);
    }

    com.google.android.material.shape.MaterialShapeDrawable getBoxBackground() {
        int i = this.boxBackgroundMode;
        if (i == 1 || i == 2) {
            return this.boxBackground;
        }
        throw new java.lang.IllegalStateException();
    }

    public void setBoxBackgroundMode(int i) {
        if (i == this.boxBackgroundMode) {
            return;
        }
        this.boxBackgroundMode = i;
        if (this.editText != null) {
            onApplyBoxBackgroundMode();
        }
    }

    public int getBoxBackgroundMode() {
        return this.boxBackgroundMode;
    }

    private void onApplyBoxBackgroundMode() {
        assignBoxBackgroundByMode();
        updateEditTextBoxBackgroundIfNeeded();
        updateTextInputBoxState();
        updateBoxCollapsedPaddingTop();
        adjustFilledEditTextPaddingForLargeFont();
        if (this.boxBackgroundMode != 0) {
            updateInputLayoutMargins();
        }
        setDropDownMenuBackgroundIfNeeded();
    }

    private void assignBoxBackgroundByMode() {
        int i = this.boxBackgroundMode;
        if (i == 0) {
            this.boxBackground = null;
            this.boxUnderlineDefault = null;
            this.boxUnderlineFocused = null;
        } else if (i == 1) {
            this.boxBackground = new com.google.android.material.shape.MaterialShapeDrawable(this.shapeAppearanceModel);
            this.boxUnderlineDefault = new com.google.android.material.shape.MaterialShapeDrawable();
            this.boxUnderlineFocused = new com.google.android.material.shape.MaterialShapeDrawable();
        } else {
            if (i == 2) {
                if (this.hintEnabled && !(this.boxBackground instanceof com.google.android.material.textfield.CutoutDrawable)) {
                    this.boxBackground = new com.google.android.material.textfield.CutoutDrawable(this.shapeAppearanceModel);
                } else {
                    this.boxBackground = new com.google.android.material.shape.MaterialShapeDrawable(this.shapeAppearanceModel);
                }
                this.boxUnderlineDefault = null;
                this.boxUnderlineFocused = null;
                return;
            }
            throw new java.lang.IllegalArgumentException(this.boxBackgroundMode + " is illegal; only @BoxBackgroundMode constants are supported.");
        }
    }

    void updateEditTextBoxBackgroundIfNeeded() {
        android.widget.EditText editText = this.editText;
        if (editText == null || this.boxBackground == null) {
            return;
        }
        if ((this.boxBackgroundApplied || editText.getBackground() == null) && this.boxBackgroundMode != 0) {
            androidx.core.view.ViewCompat.setBackground(this.editText, getEditTextBoxBackground());
            this.boxBackgroundApplied = true;
        }
    }

    private android.graphics.drawable.Drawable getEditTextBoxBackground() {
        android.widget.EditText editText = this.editText;
        if (!(editText instanceof android.widget.AutoCompleteTextView) || com.google.android.material.textfield.EditTextUtils.isEditable(editText)) {
            return this.boxBackground;
        }
        int color = com.google.android.material.color.MaterialColors.getColor(this.editText, com.google.android.material.R.attr.colorControlHighlight);
        int i = this.boxBackgroundMode;
        if (i == 2) {
            return getOutlinedBoxBackgroundWithRipple(getContext(), this.boxBackground, color, EDIT_TEXT_BACKGROUND_RIPPLE_STATE);
        }
        if (i == 1) {
            return getFilledBoxBackgroundWithRipple(this.boxBackground, this.boxBackgroundColor, color, EDIT_TEXT_BACKGROUND_RIPPLE_STATE);
        }
        return null;
    }

    private static android.graphics.drawable.Drawable getOutlinedBoxBackgroundWithRipple(android.content.Context context, com.google.android.material.shape.MaterialShapeDrawable materialShapeDrawable, int i, int[][] iArr) {
        int color = com.google.android.material.color.MaterialColors.getColor(context, com.google.android.material.R.attr.colorSurface, LOG_TAG);
        com.google.android.material.shape.MaterialShapeDrawable materialShapeDrawable2 = new com.google.android.material.shape.MaterialShapeDrawable(materialShapeDrawable.getShapeAppearanceModel());
        int iLayer = com.google.android.material.color.MaterialColors.layer(i, color, 0.1f);
        materialShapeDrawable2.setFillColor(new android.content.res.ColorStateList(iArr, new int[]{iLayer, 0}));
        materialShapeDrawable2.setTint(color);
        android.content.res.ColorStateList colorStateList = new android.content.res.ColorStateList(iArr, new int[]{iLayer, color});
        com.google.android.material.shape.MaterialShapeDrawable materialShapeDrawable3 = new com.google.android.material.shape.MaterialShapeDrawable(materialShapeDrawable.getShapeAppearanceModel());
        materialShapeDrawable3.setTint(-1);
        return new android.graphics.drawable.LayerDrawable(new android.graphics.drawable.Drawable[]{new android.graphics.drawable.RippleDrawable(colorStateList, materialShapeDrawable2, materialShapeDrawable3), materialShapeDrawable});
    }

    private static android.graphics.drawable.Drawable getFilledBoxBackgroundWithRipple(com.google.android.material.shape.MaterialShapeDrawable materialShapeDrawable, int i, int i2, int[][] iArr) {
        return new android.graphics.drawable.RippleDrawable(new android.content.res.ColorStateList(iArr, new int[]{com.google.android.material.color.MaterialColors.layer(i2, i, 0.1f), i}), materialShapeDrawable, materialShapeDrawable);
    }

    private void setDropDownMenuBackgroundIfNeeded() {
        android.widget.EditText editText = this.editText;
        if (editText instanceof android.widget.AutoCompleteTextView) {
            android.widget.AutoCompleteTextView autoCompleteTextView = (android.widget.AutoCompleteTextView) editText;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i = this.boxBackgroundMode;
                if (i == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
                } else if (i == 1) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateFilledDropDownMenuBackground());
                }
            }
        }
    }

    private android.graphics.drawable.Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.outlinedDropDownMenuBackground == null) {
            this.outlinedDropDownMenuBackground = getDropDownMaterialShapeDrawable(true);
        }
        return this.outlinedDropDownMenuBackground;
    }

    private android.graphics.drawable.Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.filledDropDownMenuBackground == null) {
            android.graphics.drawable.StateListDrawable stateListDrawable = new android.graphics.drawable.StateListDrawable();
            this.filledDropDownMenuBackground = stateListDrawable;
            stateListDrawable.addState(new int[]{android.R.attr.state_above_anchor}, getOrCreateOutlinedDropDownMenuBackground());
            this.filledDropDownMenuBackground.addState(new int[0], getDropDownMaterialShapeDrawable(false));
        }
        return this.filledDropDownMenuBackground;
    }

    private com.google.android.material.shape.MaterialShapeDrawable getDropDownMaterialShapeDrawable(boolean z) {
        float dimensionPixelOffset;
        float dimensionPixelOffset2 = getResources().getDimensionPixelOffset(com.google.android.material.R.dimen.mtrl_shape_corner_size_small_component);
        float f = z ? dimensionPixelOffset2 : 0.0f;
        android.widget.EditText editText = this.editText;
        if (editText instanceof com.google.android.material.textfield.MaterialAutoCompleteTextView) {
            dimensionPixelOffset = ((com.google.android.material.textfield.MaterialAutoCompleteTextView) editText).getPopupElevation();
        } else {
            dimensionPixelOffset = getResources().getDimensionPixelOffset(com.google.android.material.R.dimen.mtrl_exposed_dropdown_menu_popup_elevation);
        }
        int dimensionPixelOffset3 = getResources().getDimensionPixelOffset(com.google.android.material.R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        com.google.android.material.shape.ShapeAppearanceModel shapeAppearanceModelBuild = com.google.android.material.shape.ShapeAppearanceModel.builder().setTopLeftCornerSize(f).setTopRightCornerSize(f).setBottomLeftCornerSize(dimensionPixelOffset2).setBottomRightCornerSize(dimensionPixelOffset2).build();
        com.google.android.material.shape.MaterialShapeDrawable materialShapeDrawableCreateWithElevationOverlay = com.google.android.material.shape.MaterialShapeDrawable.createWithElevationOverlay(getContext(), dimensionPixelOffset);
        materialShapeDrawableCreateWithElevationOverlay.setShapeAppearanceModel(shapeAppearanceModelBuild);
        materialShapeDrawableCreateWithElevationOverlay.setPadding(0, dimensionPixelOffset3, 0, dimensionPixelOffset3);
        return materialShapeDrawableCreateWithElevationOverlay;
    }

    private void updateBoxCollapsedPaddingTop() {
        if (this.boxBackgroundMode == 1) {
            if (com.google.android.material.resources.MaterialResources.isFontScaleAtLeast2_0(getContext())) {
                this.boxCollapsedPaddingTopPx = getResources().getDimensionPixelSize(com.google.android.material.R.dimen.material_font_2_0_box_collapsed_padding_top);
            } else if (com.google.android.material.resources.MaterialResources.isFontScaleAtLeast1_3(getContext())) {
                this.boxCollapsedPaddingTopPx = getResources().getDimensionPixelSize(com.google.android.material.R.dimen.material_font_1_3_box_collapsed_padding_top);
            }
        }
    }

    private void adjustFilledEditTextPaddingForLargeFont() {
        if (this.editText == null || this.boxBackgroundMode != 1) {
            return;
        }
        if (com.google.android.material.resources.MaterialResources.isFontScaleAtLeast2_0(getContext())) {
            android.widget.EditText editText = this.editText;
            androidx.core.view.ViewCompat.setPaddingRelative(editText, androidx.core.view.ViewCompat.getPaddingStart(editText), getResources().getDimensionPixelSize(com.google.android.material.R.dimen.material_filled_edittext_font_2_0_padding_top), androidx.core.view.ViewCompat.getPaddingEnd(this.editText), getResources().getDimensionPixelSize(com.google.android.material.R.dimen.material_filled_edittext_font_2_0_padding_bottom));
        } else if (com.google.android.material.resources.MaterialResources.isFontScaleAtLeast1_3(getContext())) {
            android.widget.EditText editText2 = this.editText;
            androidx.core.view.ViewCompat.setPaddingRelative(editText2, androidx.core.view.ViewCompat.getPaddingStart(editText2), getResources().getDimensionPixelSize(com.google.android.material.R.dimen.material_filled_edittext_font_1_3_padding_top), androidx.core.view.ViewCompat.getPaddingEnd(this.editText), getResources().getDimensionPixelSize(com.google.android.material.R.dimen.material_filled_edittext_font_1_3_padding_bottom));
        }
    }

    public void setBoxCollapsedPaddingTop(int i) {
        this.boxCollapsedPaddingTopPx = i;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.boxCollapsedPaddingTopPx;
    }

    public void setBoxStrokeWidthResource(int i) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public void setBoxStrokeWidth(int i) {
        this.boxStrokeWidthDefaultPx = i;
        updateTextInputBoxState();
    }

    public int getBoxStrokeWidth() {
        return this.boxStrokeWidthDefaultPx;
    }

    public void setBoxStrokeWidthFocusedResource(int i) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i));
    }

    public void setBoxStrokeWidthFocused(int i) {
        this.boxStrokeWidthFocusedPx = i;
        updateTextInputBoxState();
    }

    public int getBoxStrokeWidthFocused() {
        return this.boxStrokeWidthFocusedPx;
    }

    public void setBoxStrokeColor(int i) {
        if (this.focusedStrokeColor != i) {
            this.focusedStrokeColor = i;
            updateTextInputBoxState();
        }
    }

    public int getBoxStrokeColor() {
        return this.focusedStrokeColor;
    }

    public void setBoxStrokeColorStateList(android.content.res.ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.defaultStrokeColor = colorStateList.getDefaultColor();
            this.disabledColor = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.hoveredStrokeColor = colorStateList.getColorForState(new int[]{android.R.attr.state_hovered, android.R.attr.state_enabled}, -1);
            this.focusedStrokeColor = colorStateList.getColorForState(new int[]{android.R.attr.state_focused, android.R.attr.state_enabled}, -1);
        } else if (this.focusedStrokeColor != colorStateList.getDefaultColor()) {
            this.focusedStrokeColor = colorStateList.getDefaultColor();
        }
        updateTextInputBoxState();
    }

    public void setBoxStrokeErrorColor(android.content.res.ColorStateList colorStateList) {
        if (this.strokeErrorColor != colorStateList) {
            this.strokeErrorColor = colorStateList;
            updateTextInputBoxState();
        }
    }

    public android.content.res.ColorStateList getBoxStrokeErrorColor() {
        return this.strokeErrorColor;
    }

    public void setBoxBackgroundColorResource(int i) {
        setBoxBackgroundColor(androidx.core.content.ContextCompat.getColor(getContext(), i));
    }

    public void setBoxBackgroundColor(int i) {
        if (this.boxBackgroundColor != i) {
            this.boxBackgroundColor = i;
            this.defaultFilledBackgroundColor = i;
            this.focusedFilledBackgroundColor = i;
            this.hoveredFilledBackgroundColor = i;
            applyBoxAttributes();
        }
    }

    public void setBoxBackgroundColorStateList(android.content.res.ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.defaultFilledBackgroundColor = defaultColor;
        this.boxBackgroundColor = defaultColor;
        this.disabledFilledBackgroundColor = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.focusedFilledBackgroundColor = colorStateList.getColorForState(new int[]{android.R.attr.state_focused, android.R.attr.state_enabled}, -1);
        this.hoveredFilledBackgroundColor = colorStateList.getColorForState(new int[]{android.R.attr.state_hovered, android.R.attr.state_enabled}, -1);
        applyBoxAttributes();
    }

    public int getBoxBackgroundColor() {
        return this.boxBackgroundColor;
    }

    public void setBoxCornerRadiiResources(int i, int i2, int i3, int i4) {
        setBoxCornerRadii(getContext().getResources().getDimension(i), getContext().getResources().getDimension(i2), getContext().getResources().getDimension(i4), getContext().getResources().getDimension(i3));
    }

    public void setBoxCornerRadii(float f, float f2, float f3, float f4) {
        boolean zIsLayoutRtl = com.google.android.material.internal.ViewUtils.isLayoutRtl(this);
        this.areCornerRadiiRtl = zIsLayoutRtl;
        float f5 = zIsLayoutRtl ? f2 : f;
        if (!zIsLayoutRtl) {
            f = f2;
        }
        float f6 = zIsLayoutRtl ? f4 : f3;
        if (!zIsLayoutRtl) {
            f3 = f4;
        }
        com.google.android.material.shape.MaterialShapeDrawable materialShapeDrawable = this.boxBackground;
        if (materialShapeDrawable != null && materialShapeDrawable.getTopLeftCornerResolvedSize() == f5 && this.boxBackground.getTopRightCornerResolvedSize() == f && this.boxBackground.getBottomLeftCornerResolvedSize() == f6 && this.boxBackground.getBottomRightCornerResolvedSize() == f3) {
            return;
        }
        this.shapeAppearanceModel = this.shapeAppearanceModel.toBuilder().setTopLeftCornerSize(f5).setTopRightCornerSize(f).setBottomLeftCornerSize(f6).setBottomRightCornerSize(f3).build();
        applyBoxAttributes();
    }

    public float getBoxCornerRadiusTopStart() {
        if (com.google.android.material.internal.ViewUtils.isLayoutRtl(this)) {
            return this.shapeAppearanceModel.getTopRightCornerSize().getCornerSize(this.tmpRectF);
        }
        return this.shapeAppearanceModel.getTopLeftCornerSize().getCornerSize(this.tmpRectF);
    }

    public float getBoxCornerRadiusTopEnd() {
        if (com.google.android.material.internal.ViewUtils.isLayoutRtl(this)) {
            return this.shapeAppearanceModel.getTopLeftCornerSize().getCornerSize(this.tmpRectF);
        }
        return this.shapeAppearanceModel.getTopRightCornerSize().getCornerSize(this.tmpRectF);
    }

    public float getBoxCornerRadiusBottomEnd() {
        if (com.google.android.material.internal.ViewUtils.isLayoutRtl(this)) {
            return this.shapeAppearanceModel.getBottomLeftCornerSize().getCornerSize(this.tmpRectF);
        }
        return this.shapeAppearanceModel.getBottomRightCornerSize().getCornerSize(this.tmpRectF);
    }

    public float getBoxCornerRadiusBottomStart() {
        if (com.google.android.material.internal.ViewUtils.isLayoutRtl(this)) {
            return this.shapeAppearanceModel.getBottomRightCornerSize().getCornerSize(this.tmpRectF);
        }
        return this.shapeAppearanceModel.getBottomLeftCornerSize().getCornerSize(this.tmpRectF);
    }

    public void setTypeface(android.graphics.Typeface typeface) {
        if (typeface != this.typeface) {
            this.typeface = typeface;
            this.collapsingTextHelper.setTypefaces(typeface);
            this.indicatorViewController.setTypefaces(typeface);
            android.widget.TextView textView = this.counterView;
            if (textView != null) {
                textView.setTypeface(typeface);
            }
        }
    }

    public android.graphics.Typeface getTypeface() {
        return this.typeface;
    }

    public void setLengthCounter(com.google.android.material.textfield.TextInputLayout.LengthCounter lengthCounter) {
        this.lengthCounter = lengthCounter;
    }

    public com.google.android.material.textfield.TextInputLayout.LengthCounter getLengthCounter() {
        return this.lengthCounter;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchProvideAutofillStructure(android.view.ViewStructure viewStructure, int i) {
        android.widget.EditText editText = this.editText;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        if (this.originalHint != null) {
            boolean z = this.isProvidingHint;
            this.isProvidingHint = false;
            java.lang.CharSequence hint = editText.getHint();
            this.editText.setHint(this.originalHint);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
                return;
            } finally {
                this.editText.setHint(hint);
                this.isProvidingHint = z;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i);
        onProvideAutofillVirtualStructure(viewStructure, i);
        viewStructure.setChildCount(this.inputFrame.getChildCount());
        for (int i2 = 0; i2 < this.inputFrame.getChildCount(); i2++) {
            android.view.View childAt = this.inputFrame.getChildAt(i2);
            android.view.ViewStructure viewStructureNewChild = viewStructure.newChild(i2);
            childAt.dispatchProvideAutofillStructure(viewStructureNewChild, i);
            if (childAt == this.editText) {
                viewStructureNewChild.setHint(getHint());
            }
        }
    }

    private void setEditText(android.widget.EditText editText) {
        if (this.editText != null) {
            throw new java.lang.IllegalArgumentException("We already have an EditText, can only have one");
        }
        if (getEndIconMode() != 3 && !(editText instanceof com.google.android.material.textfield.TextInputEditText)) {
            android.util.Log.i(LOG_TAG, "EditText added is not a TextInputEditText. Please switch to using that class instead.");
        }
        this.editText = editText;
        int i = this.minEms;
        if (i != -1) {
            setMinEms(i);
        } else {
            setMinWidth(this.minWidth);
        }
        int i2 = this.maxEms;
        if (i2 != -1) {
            setMaxEms(i2);
        } else {
            setMaxWidth(this.maxWidth);
        }
        this.boxBackgroundApplied = false;
        onApplyBoxBackgroundMode();
        setTextInputAccessibilityDelegate(new com.google.android.material.textfield.TextInputLayout.AccessibilityDelegate(this));
        this.collapsingTextHelper.setTypefaces(this.editText.getTypeface());
        this.collapsingTextHelper.setExpandedTextSize(this.editText.getTextSize());
        this.collapsingTextHelper.setExpandedLetterSpacing(this.editText.getLetterSpacing());
        int gravity = this.editText.getGravity();
        this.collapsingTextHelper.setCollapsedTextGravity((gravity & (-113)) | 48);
        this.collapsingTextHelper.setExpandedTextGravity(gravity);
        this.editText.addTextChangedListener(new android.text.TextWatcher() { // from class: com.google.android.material.textfield.TextInputLayout.1
            @Override // android.text.TextWatcher
            public void beforeTextChanged(java.lang.CharSequence charSequence, int i3, int i4, int i5) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(java.lang.CharSequence charSequence, int i3, int i4, int i5) {
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(android.text.Editable editable) {
                com.google.android.material.textfield.TextInputLayout textInputLayout = com.google.android.material.textfield.TextInputLayout.this;
                textInputLayout.updateLabelState(!textInputLayout.restoringSavedState);
                if (com.google.android.material.textfield.TextInputLayout.this.counterEnabled) {
                    com.google.android.material.textfield.TextInputLayout.this.updateCounter(editable);
                }
                if (com.google.android.material.textfield.TextInputLayout.this.placeholderEnabled) {
                    com.google.android.material.textfield.TextInputLayout.this.updatePlaceholderText(editable);
                }
            }
        });
        if (this.defaultHintTextColor == null) {
            this.defaultHintTextColor = this.editText.getHintTextColors();
        }
        if (this.hintEnabled) {
            if (android.text.TextUtils.isEmpty(this.hint)) {
                java.lang.CharSequence hint = this.editText.getHint();
                this.originalHint = hint;
                setHint(hint);
                this.editText.setHint((java.lang.CharSequence) null);
            }
            this.isProvidingHint = true;
        }
        if (this.counterView != null) {
            updateCounter(this.editText.getText());
        }
        updateEditTextBackground();
        this.indicatorViewController.adjustIndicatorPadding();
        this.startLayout.bringToFront();
        this.endLayout.bringToFront();
        dispatchOnEditTextAttached();
        this.endLayout.updateSuffixTextViewPadding();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        updateLabelState(false, true);
    }

    private void updateInputLayoutMargins() {
        if (this.boxBackgroundMode != 1) {
            android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) this.inputFrame.getLayoutParams();
            int iCalculateLabelMarginTop = calculateLabelMarginTop();
            if (iCalculateLabelMarginTop != layoutParams.topMargin) {
                layoutParams.topMargin = iCalculateLabelMarginTop;
                this.inputFrame.requestLayout();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        android.widget.EditText editText = this.editText;
        if (editText != null) {
            return editText.getBaseline() + getPaddingTop() + calculateLabelMarginTop();
        }
        return super.getBaseline();
    }

    void updateLabelState(boolean z) {
        updateLabelState(z, false);
    }

    private void updateLabelState(boolean z, boolean z2) {
        android.content.res.ColorStateList colorStateList;
        android.widget.TextView textView;
        int colorForState;
        boolean zIsEnabled = isEnabled();
        android.widget.EditText editText = this.editText;
        boolean z3 = (editText == null || android.text.TextUtils.isEmpty(editText.getText())) ? false : true;
        android.widget.EditText editText2 = this.editText;
        boolean z4 = editText2 != null && editText2.hasFocus();
        android.content.res.ColorStateList colorStateList2 = this.defaultHintTextColor;
        if (colorStateList2 != null) {
            this.collapsingTextHelper.setCollapsedTextColor(colorStateList2);
            this.collapsingTextHelper.setExpandedTextColor(this.defaultHintTextColor);
        }
        if (!zIsEnabled) {
            android.content.res.ColorStateList colorStateList3 = this.defaultHintTextColor;
            if (colorStateList3 != null) {
                colorForState = colorStateList3.getColorForState(new int[]{-16842910}, this.disabledColor);
            } else {
                colorForState = this.disabledColor;
            }
            this.collapsingTextHelper.setCollapsedTextColor(android.content.res.ColorStateList.valueOf(colorForState));
            this.collapsingTextHelper.setExpandedTextColor(android.content.res.ColorStateList.valueOf(colorForState));
        } else if (shouldShowError()) {
            this.collapsingTextHelper.setCollapsedTextColor(this.indicatorViewController.getErrorViewTextColors());
        } else if (this.counterOverflowed && (textView = this.counterView) != null) {
            this.collapsingTextHelper.setCollapsedTextColor(textView.getTextColors());
        } else if (z4 && (colorStateList = this.focusedTextColor) != null) {
            this.collapsingTextHelper.setCollapsedTextColor(colorStateList);
        }
        if (z3 || !this.expandedHintEnabled || (isEnabled() && z4)) {
            if (z2 || this.hintExpanded) {
                collapseHint(z);
                return;
            }
            return;
        }
        if (z2 || !this.hintExpanded) {
            expandHint(z);
        }
    }

    public android.widget.EditText getEditText() {
        return this.editText;
    }

    public void setMinEms(int i) {
        this.minEms = i;
        android.widget.EditText editText = this.editText;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinEms(i);
    }

    public int getMinEms() {
        return this.minEms;
    }

    public void setMaxEms(int i) {
        this.maxEms = i;
        android.widget.EditText editText = this.editText;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxEms(i);
    }

    public int getMaxEms() {
        return this.maxEms;
    }

    public void setMinWidth(int i) {
        this.minWidth = i;
        android.widget.EditText editText = this.editText;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinWidth(i);
    }

    public void setMinWidthResource(int i) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    public int getMinWidth() {
        return this.minWidth;
    }

    public void setMaxWidth(int i) {
        this.maxWidth = i;
        android.widget.EditText editText = this.editText;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxWidth(i);
    }

    public void setMaxWidthResource(int i) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    public int getMaxWidth() {
        return this.maxWidth;
    }

    public void setHint(java.lang.CharSequence charSequence) {
        if (this.hintEnabled) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHint(int i) {
        setHint(i != 0 ? getResources().getText(i) : null);
    }

    private void setHintInternal(java.lang.CharSequence charSequence) {
        if (android.text.TextUtils.equals(charSequence, this.hint)) {
            return;
        }
        this.hint = charSequence;
        this.collapsingTextHelper.setText(charSequence);
        if (this.hintExpanded) {
            return;
        }
        openCutout();
    }

    public java.lang.CharSequence getHint() {
        if (this.hintEnabled) {
            return this.hint;
        }
        return null;
    }

    public void setHintEnabled(boolean z) {
        if (z != this.hintEnabled) {
            this.hintEnabled = z;
            if (!z) {
                this.isProvidingHint = false;
                if (!android.text.TextUtils.isEmpty(this.hint) && android.text.TextUtils.isEmpty(this.editText.getHint())) {
                    this.editText.setHint(this.hint);
                }
                setHintInternal(null);
            } else {
                java.lang.CharSequence hint = this.editText.getHint();
                if (!android.text.TextUtils.isEmpty(hint)) {
                    if (android.text.TextUtils.isEmpty(this.hint)) {
                        setHint(hint);
                    }
                    this.editText.setHint((java.lang.CharSequence) null);
                }
                this.isProvidingHint = true;
            }
            if (this.editText != null) {
                updateInputLayoutMargins();
            }
        }
    }

    public boolean isHintEnabled() {
        return this.hintEnabled;
    }

    public boolean isProvidingHint() {
        return this.isProvidingHint;
    }

    public void setHintTextAppearance(int i) {
        this.collapsingTextHelper.setCollapsedTextAppearance(i);
        this.focusedTextColor = this.collapsingTextHelper.getCollapsedTextColor();
        if (this.editText != null) {
            updateLabelState(false);
            updateInputLayoutMargins();
        }
    }

    public void setHintTextColor(android.content.res.ColorStateList colorStateList) {
        if (this.focusedTextColor != colorStateList) {
            if (this.defaultHintTextColor == null) {
                this.collapsingTextHelper.setCollapsedTextColor(colorStateList);
            }
            this.focusedTextColor = colorStateList;
            if (this.editText != null) {
                updateLabelState(false);
            }
        }
    }

    public android.content.res.ColorStateList getHintTextColor() {
        return this.focusedTextColor;
    }

    public void setDefaultHintTextColor(android.content.res.ColorStateList colorStateList) {
        this.defaultHintTextColor = colorStateList;
        this.focusedTextColor = colorStateList;
        if (this.editText != null) {
            updateLabelState(false);
        }
    }

    public android.content.res.ColorStateList getDefaultHintTextColor() {
        return this.defaultHintTextColor;
    }

    public void setErrorEnabled(boolean z) {
        this.indicatorViewController.setErrorEnabled(z);
    }

    public void setErrorTextAppearance(int i) {
        this.indicatorViewController.setErrorTextAppearance(i);
    }

    public void setErrorTextColor(android.content.res.ColorStateList colorStateList) {
        this.indicatorViewController.setErrorViewTextColor(colorStateList);
    }

    public int getErrorCurrentTextColors() {
        return this.indicatorViewController.getErrorViewCurrentTextColor();
    }

    public void setHelperTextTextAppearance(int i) {
        this.indicatorViewController.setHelperTextAppearance(i);
    }

    public void setHelperTextColor(android.content.res.ColorStateList colorStateList) {
        this.indicatorViewController.setHelperTextViewTextColor(colorStateList);
    }

    public boolean isErrorEnabled() {
        return this.indicatorViewController.isErrorEnabled();
    }

    public void setHelperTextEnabled(boolean z) {
        this.indicatorViewController.setHelperTextEnabled(z);
    }

    public void setHelperText(java.lang.CharSequence charSequence) {
        if (android.text.TextUtils.isEmpty(charSequence)) {
            if (isHelperTextEnabled()) {
                setHelperTextEnabled(false);
            }
        } else {
            if (!isHelperTextEnabled()) {
                setHelperTextEnabled(true);
            }
            this.indicatorViewController.showHelper(charSequence);
        }
    }

    public boolean isHelperTextEnabled() {
        return this.indicatorViewController.isHelperTextEnabled();
    }

    public int getHelperTextCurrentTextColor() {
        return this.indicatorViewController.getHelperTextViewCurrentTextColor();
    }

    public void setErrorContentDescription(java.lang.CharSequence charSequence) {
        this.indicatorViewController.setErrorContentDescription(charSequence);
    }

    public java.lang.CharSequence getErrorContentDescription() {
        return this.indicatorViewController.getErrorContentDescription();
    }

    public void setError(java.lang.CharSequence charSequence) {
        if (!this.indicatorViewController.isErrorEnabled()) {
            if (android.text.TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (!android.text.TextUtils.isEmpty(charSequence)) {
            this.indicatorViewController.showError(charSequence);
        } else {
            this.indicatorViewController.hideError();
        }
    }

    public void setErrorIconDrawable(int i) {
        this.endLayout.setErrorIconDrawable(i);
    }

    public void setErrorIconDrawable(android.graphics.drawable.Drawable drawable) {
        this.endLayout.setErrorIconDrawable(drawable);
    }

    public android.graphics.drawable.Drawable getErrorIconDrawable() {
        return this.endLayout.getErrorIconDrawable();
    }

    public void setErrorIconTintList(android.content.res.ColorStateList colorStateList) {
        this.endLayout.setErrorIconTintList(colorStateList);
    }

    public void setErrorIconTintMode(android.graphics.PorterDuff.Mode mode) {
        this.endLayout.setErrorIconTintMode(mode);
    }

    public void setCounterEnabled(boolean z) {
        if (this.counterEnabled != z) {
            if (z) {
                androidx.appcompat.widget.AppCompatTextView appCompatTextView = new androidx.appcompat.widget.AppCompatTextView(getContext());
                this.counterView = appCompatTextView;
                appCompatTextView.setId(com.google.android.material.R.id.textinput_counter);
                android.graphics.Typeface typeface = this.typeface;
                if (typeface != null) {
                    this.counterView.setTypeface(typeface);
                }
                this.counterView.setMaxLines(1);
                this.indicatorViewController.addIndicator(this.counterView, 2);
                androidx.core.view.MarginLayoutParamsCompat.setMarginStart((android.view.ViewGroup.MarginLayoutParams) this.counterView.getLayoutParams(), getResources().getDimensionPixelOffset(com.google.android.material.R.dimen.mtrl_textinput_counter_margin_start));
                updateCounterTextAppearanceAndColor();
                updateCounter();
            } else {
                this.indicatorViewController.removeIndicator(this.counterView, 2);
                this.counterView = null;
            }
            this.counterEnabled = z;
        }
    }

    public void setCounterTextAppearance(int i) {
        if (this.counterTextAppearance != i) {
            this.counterTextAppearance = i;
            updateCounterTextAppearanceAndColor();
        }
    }

    public void setCounterTextColor(android.content.res.ColorStateList colorStateList) {
        if (this.counterTextColor != colorStateList) {
            this.counterTextColor = colorStateList;
            updateCounterTextAppearanceAndColor();
        }
    }

    public android.content.res.ColorStateList getCounterTextColor() {
        return this.counterTextColor;
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.counterOverflowTextAppearance != i) {
            this.counterOverflowTextAppearance = i;
            updateCounterTextAppearanceAndColor();
        }
    }

    public void setCounterOverflowTextColor(android.content.res.ColorStateList colorStateList) {
        if (this.counterOverflowTextColor != colorStateList) {
            this.counterOverflowTextColor = colorStateList;
            updateCounterTextAppearanceAndColor();
        }
    }

    public android.content.res.ColorStateList getCounterOverflowTextColor() {
        return this.counterTextColor;
    }

    public boolean isCounterEnabled() {
        return this.counterEnabled;
    }

    public void setCounterMaxLength(int i) {
        if (this.counterMaxLength != i) {
            if (i > 0) {
                this.counterMaxLength = i;
            } else {
                this.counterMaxLength = -1;
            }
            if (this.counterEnabled) {
                updateCounter();
            }
        }
    }

    private void updateCounter() {
        if (this.counterView != null) {
            android.widget.EditText editText = this.editText;
            updateCounter(editText == null ? null : editText.getText());
        }
    }

    void updateCounter(android.text.Editable editable) {
        int iCountLength = this.lengthCounter.countLength(editable);
        boolean z = this.counterOverflowed;
        int i = this.counterMaxLength;
        if (i == -1) {
            this.counterView.setText(java.lang.String.valueOf(iCountLength));
            this.counterView.setContentDescription(null);
            this.counterOverflowed = false;
        } else {
            this.counterOverflowed = iCountLength > i;
            updateCounterContentDescription(getContext(), this.counterView, iCountLength, this.counterMaxLength, this.counterOverflowed);
            if (z != this.counterOverflowed) {
                updateCounterTextAppearanceAndColor();
            }
            this.counterView.setText(androidx.core.text.BidiFormatter.getInstance().unicodeWrap(getContext().getString(com.google.android.material.R.string.character_counter_pattern, java.lang.Integer.valueOf(iCountLength), java.lang.Integer.valueOf(this.counterMaxLength))));
        }
        if (this.editText == null || z == this.counterOverflowed) {
            return;
        }
        updateLabelState(false);
        updateTextInputBoxState();
        updateEditTextBackground();
    }

    private static void updateCounterContentDescription(android.content.Context context, android.widget.TextView textView, int i, int i2, boolean z) {
        int i3;
        if (z) {
            i3 = com.google.android.material.R.string.character_counter_overflowed_content_description;
        } else {
            i3 = com.google.android.material.R.string.character_counter_content_description;
        }
        textView.setContentDescription(context.getString(i3, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2)));
    }

    public void setPlaceholderText(java.lang.CharSequence charSequence) {
        if (this.placeholderTextView == null) {
            androidx.appcompat.widget.AppCompatTextView appCompatTextView = new androidx.appcompat.widget.AppCompatTextView(getContext());
            this.placeholderTextView = appCompatTextView;
            appCompatTextView.setId(com.google.android.material.R.id.textinput_placeholder);
            androidx.core.view.ViewCompat.setImportantForAccessibility(this.placeholderTextView, 2);
            androidx.transition.Fade fadeCreatePlaceholderFadeTransition = createPlaceholderFadeTransition();
            this.placeholderFadeIn = fadeCreatePlaceholderFadeTransition;
            fadeCreatePlaceholderFadeTransition.setStartDelay(PLACEHOLDER_START_DELAY);
            this.placeholderFadeOut = createPlaceholderFadeTransition();
            setPlaceholderTextAppearance(this.placeholderTextAppearance);
            setPlaceholderTextColor(this.placeholderTextColor);
        }
        if (android.text.TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.placeholderEnabled) {
                setPlaceholderTextEnabled(true);
            }
            this.placeholderText = charSequence;
        }
        updatePlaceholderText();
    }

    public java.lang.CharSequence getPlaceholderText() {
        if (this.placeholderEnabled) {
            return this.placeholderText;
        }
        return null;
    }

    private void setPlaceholderTextEnabled(boolean z) {
        if (this.placeholderEnabled == z) {
            return;
        }
        if (z) {
            addPlaceholderTextView();
        } else {
            removePlaceholderTextView();
            this.placeholderTextView = null;
        }
        this.placeholderEnabled = z;
    }

    private androidx.transition.Fade createPlaceholderFadeTransition() {
        androidx.transition.Fade fade = new androidx.transition.Fade();
        fade.setDuration(PLACEHOLDER_FADE_DURATION);
        fade.setInterpolator(com.google.android.material.animation.AnimationUtils.LINEAR_INTERPOLATOR);
        return fade;
    }

    private void updatePlaceholderText() {
        android.widget.EditText editText = this.editText;
        updatePlaceholderText(editText == null ? null : editText.getText());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updatePlaceholderText(android.text.Editable editable) {
        if (this.lengthCounter.countLength(editable) == 0 && !this.hintExpanded) {
            showPlaceholderText();
        } else {
            hidePlaceholderText();
        }
    }

    private void showPlaceholderText() {
        if (this.placeholderTextView == null || !this.placeholderEnabled || android.text.TextUtils.isEmpty(this.placeholderText)) {
            return;
        }
        this.placeholderTextView.setText(this.placeholderText);
        androidx.transition.TransitionManager.beginDelayedTransition(this.inputFrame, this.placeholderFadeIn);
        this.placeholderTextView.setVisibility(0);
        this.placeholderTextView.bringToFront();
        announceForAccessibility(this.placeholderText);
    }

    private void hidePlaceholderText() {
        android.widget.TextView textView = this.placeholderTextView;
        if (textView == null || !this.placeholderEnabled) {
            return;
        }
        textView.setText((java.lang.CharSequence) null);
        androidx.transition.TransitionManager.beginDelayedTransition(this.inputFrame, this.placeholderFadeOut);
        this.placeholderTextView.setVisibility(4);
    }

    private void addPlaceholderTextView() {
        android.widget.TextView textView = this.placeholderTextView;
        if (textView != null) {
            this.inputFrame.addView(textView);
            this.placeholderTextView.setVisibility(0);
        }
    }

    private void removePlaceholderTextView() {
        android.widget.TextView textView = this.placeholderTextView;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    public void setPlaceholderTextColor(android.content.res.ColorStateList colorStateList) {
        if (this.placeholderTextColor != colorStateList) {
            this.placeholderTextColor = colorStateList;
            android.widget.TextView textView = this.placeholderTextView;
            if (textView == null || colorStateList == null) {
                return;
            }
            textView.setTextColor(colorStateList);
        }
    }

    public android.content.res.ColorStateList getPlaceholderTextColor() {
        return this.placeholderTextColor;
    }

    public void setPlaceholderTextAppearance(int i) {
        this.placeholderTextAppearance = i;
        android.widget.TextView textView = this.placeholderTextView;
        if (textView != null) {
            androidx.core.widget.TextViewCompat.setTextAppearance(textView, i);
        }
    }

    public int getPlaceholderTextAppearance() {
        return this.placeholderTextAppearance;
    }

    public void setPrefixText(java.lang.CharSequence charSequence) {
        this.startLayout.setPrefixText(charSequence);
    }

    public java.lang.CharSequence getPrefixText() {
        return this.startLayout.getPrefixText();
    }

    public android.widget.TextView getPrefixTextView() {
        return this.startLayout.getPrefixTextView();
    }

    public void setPrefixTextColor(android.content.res.ColorStateList colorStateList) {
        this.startLayout.setPrefixTextColor(colorStateList);
    }

    public android.content.res.ColorStateList getPrefixTextColor() {
        return this.startLayout.getPrefixTextColor();
    }

    public void setPrefixTextAppearance(int i) {
        this.startLayout.setPrefixTextAppearance(i);
    }

    public void setSuffixText(java.lang.CharSequence charSequence) {
        this.endLayout.setSuffixText(charSequence);
    }

    public java.lang.CharSequence getSuffixText() {
        return this.endLayout.getSuffixText();
    }

    public android.widget.TextView getSuffixTextView() {
        return this.endLayout.getSuffixTextView();
    }

    public void setSuffixTextColor(android.content.res.ColorStateList colorStateList) {
        this.endLayout.setSuffixTextColor(colorStateList);
    }

    public android.content.res.ColorStateList getSuffixTextColor() {
        return this.endLayout.getSuffixTextColor();
    }

    public void setSuffixTextAppearance(int i) {
        this.endLayout.setSuffixTextAppearance(i);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        recursiveSetEnabled(this, z);
        super.setEnabled(z);
    }

    private static void recursiveSetEnabled(android.view.ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            android.view.View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof android.view.ViewGroup) {
                recursiveSetEnabled((android.view.ViewGroup) childAt, z);
            }
        }
    }

    public int getCounterMaxLength() {
        return this.counterMaxLength;
    }

    java.lang.CharSequence getCounterOverflowDescription() {
        android.widget.TextView textView;
        if (this.counterEnabled && this.counterOverflowed && (textView = this.counterView) != null) {
            return textView.getContentDescription();
        }
        return null;
    }

    private void updateCounterTextAppearanceAndColor() {
        android.content.res.ColorStateList colorStateList;
        android.content.res.ColorStateList colorStateList2;
        android.widget.TextView textView = this.counterView;
        if (textView != null) {
            setTextAppearanceCompatWithErrorFallback(textView, this.counterOverflowed ? this.counterOverflowTextAppearance : this.counterTextAppearance);
            if (!this.counterOverflowed && (colorStateList2 = this.counterTextColor) != null) {
                this.counterView.setTextColor(colorStateList2);
            }
            if (!this.counterOverflowed || (colorStateList = this.counterOverflowTextColor) == null) {
                return;
            }
            this.counterView.setTextColor(colorStateList);
        }
    }

    void setTextAppearanceCompatWithErrorFallback(android.widget.TextView textView, int i) {
        boolean z = true;
        try {
            androidx.core.widget.TextViewCompat.setTextAppearance(textView, i);
            if (textView.getTextColors().getDefaultColor() != -65281) {
                z = false;
            }
        } catch (java.lang.Exception unused) {
        }
        if (z) {
            androidx.core.widget.TextViewCompat.setTextAppearance(textView, com.google.android.material.R.style.TextAppearance_AppCompat_Caption);
            textView.setTextColor(androidx.core.content.ContextCompat.getColor(getContext(), com.google.android.material.R.color.design_error));
        }
    }

    private int calculateLabelMarginTop() {
        float collapsedTextHeight;
        if (!this.hintEnabled) {
            return 0;
        }
        int i = this.boxBackgroundMode;
        if (i == 0) {
            collapsedTextHeight = this.collapsingTextHelper.getCollapsedTextHeight();
        } else {
            if (i != 2) {
                return 0;
            }
            collapsedTextHeight = this.collapsingTextHelper.getCollapsedTextHeight() / 2.0f;
        }
        return (int) collapsedTextHeight;
    }

    private android.graphics.Rect calculateCollapsedTextBounds(android.graphics.Rect rect) {
        if (this.editText == null) {
            throw new java.lang.IllegalStateException();
        }
        android.graphics.Rect rect2 = this.tmpBoundsRect;
        boolean zIsLayoutRtl = com.google.android.material.internal.ViewUtils.isLayoutRtl(this);
        rect2.bottom = rect.bottom;
        int i = this.boxBackgroundMode;
        if (i == 1) {
            rect2.left = getLabelLeftBoundAlightWithPrefix(rect.left, zIsLayoutRtl);
            rect2.top = rect.top + this.boxCollapsedPaddingTopPx;
            rect2.right = getLabelRightBoundAlignedWithSuffix(rect.right, zIsLayoutRtl);
            return rect2;
        }
        if (i == 2) {
            rect2.left = rect.left + this.editText.getPaddingLeft();
            rect2.top = rect.top - calculateLabelMarginTop();
            rect2.right = rect.right - this.editText.getPaddingRight();
            return rect2;
        }
        rect2.left = getLabelLeftBoundAlightWithPrefix(rect.left, zIsLayoutRtl);
        rect2.top = getPaddingTop();
        rect2.right = getLabelRightBoundAlignedWithSuffix(rect.right, zIsLayoutRtl);
        return rect2;
    }

    private int getLabelLeftBoundAlightWithPrefix(int i, boolean z) {
        int compoundPaddingLeft = i + this.editText.getCompoundPaddingLeft();
        return (getPrefixText() == null || z) ? compoundPaddingLeft : (compoundPaddingLeft - getPrefixTextView().getMeasuredWidth()) + getPrefixTextView().getPaddingLeft();
    }

    private int getLabelRightBoundAlignedWithSuffix(int i, boolean z) {
        int compoundPaddingRight = i - this.editText.getCompoundPaddingRight();
        return (getPrefixText() == null || !z) ? compoundPaddingRight : compoundPaddingRight + (getPrefixTextView().getMeasuredWidth() - getPrefixTextView().getPaddingRight());
    }

    private android.graphics.Rect calculateExpandedTextBounds(android.graphics.Rect rect) {
        if (this.editText == null) {
            throw new java.lang.IllegalStateException();
        }
        android.graphics.Rect rect2 = this.tmpBoundsRect;
        float expandedTextHeight = this.collapsingTextHelper.getExpandedTextHeight();
        rect2.left = rect.left + this.editText.getCompoundPaddingLeft();
        rect2.top = calculateExpandedLabelTop(rect, expandedTextHeight);
        rect2.right = rect.right - this.editText.getCompoundPaddingRight();
        rect2.bottom = calculateExpandedLabelBottom(rect, rect2, expandedTextHeight);
        return rect2;
    }

    private int calculateExpandedLabelTop(android.graphics.Rect rect, float f) {
        if (isSingleLineFilledTextField()) {
            return (int) (rect.centerY() - (f / 2.0f));
        }
        return rect.top + this.editText.getCompoundPaddingTop();
    }

    private int calculateExpandedLabelBottom(android.graphics.Rect rect, android.graphics.Rect rect2, float f) {
        if (isSingleLineFilledTextField()) {
            return (int) (rect2.top + f);
        }
        return rect.bottom - this.editText.getCompoundPaddingBottom();
    }

    private boolean isSingleLineFilledTextField() {
        return this.boxBackgroundMode == 1 && this.editText.getMinLines() <= 1;
    }

    private int calculateBoxBackgroundColor() {
        return this.boxBackgroundMode == 1 ? com.google.android.material.color.MaterialColors.layer(com.google.android.material.color.MaterialColors.getColor(this, com.google.android.material.R.attr.colorSurface, 0), this.boxBackgroundColor) : this.boxBackgroundColor;
    }

    private void applyBoxAttributes() {
        com.google.android.material.shape.MaterialShapeDrawable materialShapeDrawable = this.boxBackground;
        if (materialShapeDrawable == null) {
            return;
        }
        com.google.android.material.shape.ShapeAppearanceModel shapeAppearanceModel = materialShapeDrawable.getShapeAppearanceModel();
        com.google.android.material.shape.ShapeAppearanceModel shapeAppearanceModel2 = this.shapeAppearanceModel;
        if (shapeAppearanceModel != shapeAppearanceModel2) {
            this.boxBackground.setShapeAppearanceModel(shapeAppearanceModel2);
        }
        if (canDrawOutlineStroke()) {
            this.boxBackground.setStroke(this.boxStrokeWidthPx, this.boxStrokeColor);
        }
        int iCalculateBoxBackgroundColor = calculateBoxBackgroundColor();
        this.boxBackgroundColor = iCalculateBoxBackgroundColor;
        this.boxBackground.setFillColor(android.content.res.ColorStateList.valueOf(iCalculateBoxBackgroundColor));
        applyBoxUnderlineAttributes();
        updateEditTextBoxBackgroundIfNeeded();
    }

    private void applyBoxUnderlineAttributes() {
        android.content.res.ColorStateList colorStateListValueOf;
        if (this.boxUnderlineDefault == null || this.boxUnderlineFocused == null) {
            return;
        }
        if (canDrawStroke()) {
            com.google.android.material.shape.MaterialShapeDrawable materialShapeDrawable = this.boxUnderlineDefault;
            if (this.editText.isFocused()) {
                colorStateListValueOf = android.content.res.ColorStateList.valueOf(this.defaultStrokeColor);
            } else {
                colorStateListValueOf = android.content.res.ColorStateList.valueOf(this.boxStrokeColor);
            }
            materialShapeDrawable.setFillColor(colorStateListValueOf);
            this.boxUnderlineFocused.setFillColor(android.content.res.ColorStateList.valueOf(this.boxStrokeColor));
        }
        invalidate();
    }

    private boolean canDrawOutlineStroke() {
        return this.boxBackgroundMode == 2 && canDrawStroke();
    }

    private boolean canDrawStroke() {
        return this.boxStrokeWidthPx > -1 && this.boxStrokeColor != 0;
    }

    void updateEditTextBackground() {
        android.graphics.drawable.Drawable background;
        android.widget.TextView textView;
        android.widget.EditText editText = this.editText;
        if (editText == null || this.boxBackgroundMode != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        if (androidx.appcompat.widget.DrawableUtils.canSafelyMutateDrawable(background)) {
            background = background.mutate();
        }
        if (shouldShowError()) {
            background.setColorFilter(androidx.appcompat.widget.AppCompatDrawableManager.getPorterDuffColorFilter(getErrorCurrentTextColors(), android.graphics.PorterDuff.Mode.SRC_IN));
        } else if (this.counterOverflowed && (textView = this.counterView) != null) {
            background.setColorFilter(androidx.appcompat.widget.AppCompatDrawableManager.getPorterDuffColorFilter(textView.getCurrentTextColor(), android.graphics.PorterDuff.Mode.SRC_IN));
        } else {
            androidx.core.graphics.drawable.DrawableCompat.clearColorFilter(background);
            this.editText.refreshDrawableState();
        }
    }

    boolean shouldShowError() {
        return this.indicatorViewController.errorShouldBeShown();
    }

    static class SavedState extends androidx.customview.view.AbsSavedState {
        public static final android.os.Parcelable.Creator<com.google.android.material.textfield.TextInputLayout.SavedState> CREATOR = new android.os.Parcelable.ClassLoaderCreator<com.google.android.material.textfield.TextInputLayout.SavedState>() { // from class: com.google.android.material.textfield.TextInputLayout.SavedState.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public com.google.android.material.textfield.TextInputLayout.SavedState createFromParcel(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
                return new com.google.android.material.textfield.TextInputLayout.SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public com.google.android.material.textfield.TextInputLayout.SavedState createFromParcel(android.os.Parcel parcel) {
                return new com.google.android.material.textfield.TextInputLayout.SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public com.google.android.material.textfield.TextInputLayout.SavedState[] newArray(int i) {
                return new com.google.android.material.textfield.TextInputLayout.SavedState[i];
            }
        };
        java.lang.CharSequence error;
        boolean isEndIconChecked;

        SavedState(android.os.Parcelable parcelable) {
            super(parcelable);
        }

        SavedState(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
            super(parcel, classLoader);
            this.error = (java.lang.CharSequence) android.text.TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.isEndIconChecked = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            android.text.TextUtils.writeToParcel(this.error, parcel, i);
            parcel.writeInt(this.isEndIconChecked ? 1 : 0);
        }

        public java.lang.String toString() {
            return "TextInputLayout.SavedState{" + java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)) + " error=" + ((java.lang.Object) this.error) + "}";
        }
    }

    @Override // android.view.View
    public android.os.Parcelable onSaveInstanceState() {
        com.google.android.material.textfield.TextInputLayout.SavedState savedState = new com.google.android.material.textfield.TextInputLayout.SavedState(super.onSaveInstanceState());
        if (shouldShowError()) {
            savedState.error = getError();
        }
        savedState.isEndIconChecked = this.endLayout.isEndIconChecked();
        return savedState;
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(android.os.Parcelable parcelable) {
        if (!(parcelable instanceof com.google.android.material.textfield.TextInputLayout.SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        com.google.android.material.textfield.TextInputLayout.SavedState savedState = (com.google.android.material.textfield.TextInputLayout.SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setError(savedState.error);
        if (savedState.isEndIconChecked) {
            post(new java.lang.Runnable() { // from class: com.google.android.material.textfield.TextInputLayout.2
                @Override // java.lang.Runnable
                public void run() {
                    com.google.android.material.textfield.TextInputLayout.this.endLayout.checkEndIcon();
                }
            });
        }
        requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(android.util.SparseArray<android.os.Parcelable> sparseArray) {
        this.restoringSavedState = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.restoringSavedState = false;
    }

    public java.lang.CharSequence getError() {
        if (this.indicatorViewController.isErrorEnabled()) {
            return this.indicatorViewController.getErrorText();
        }
        return null;
    }

    public java.lang.CharSequence getHelperText() {
        if (this.indicatorViewController.isHelperTextEnabled()) {
            return this.indicatorViewController.getHelperText();
        }
        return null;
    }

    public boolean isHintAnimationEnabled() {
        return this.hintAnimationEnabled;
    }

    public void setHintAnimationEnabled(boolean z) {
        this.hintAnimationEnabled = z;
    }

    public boolean isExpandedHintEnabled() {
        return this.expandedHintEnabled;
    }

    public void setExpandedHintEnabled(boolean z) {
        if (this.expandedHintEnabled != z) {
            this.expandedHintEnabled = z;
            updateLabelState(false);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        boolean z = false;
        boolean z2 = i == 1;
        boolean z3 = this.areCornerRadiiRtl;
        if (z2 != z3) {
            if (z2 && !z3) {
                z = true;
            }
            float cornerSize = this.shapeAppearanceModel.getTopLeftCornerSize().getCornerSize(this.tmpRectF);
            float cornerSize2 = this.shapeAppearanceModel.getTopRightCornerSize().getCornerSize(this.tmpRectF);
            float cornerSize3 = this.shapeAppearanceModel.getBottomLeftCornerSize().getCornerSize(this.tmpRectF);
            float cornerSize4 = this.shapeAppearanceModel.getBottomRightCornerSize().getCornerSize(this.tmpRectF);
            float f = z ? cornerSize : cornerSize2;
            if (z) {
                cornerSize = cornerSize2;
            }
            float f2 = z ? cornerSize3 : cornerSize4;
            if (z) {
                cornerSize3 = cornerSize4;
            }
            setBoxCornerRadii(f, cornerSize, f2, cornerSize3);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        boolean zUpdateEditTextHeightBasedOnIcon = updateEditTextHeightBasedOnIcon();
        boolean zUpdateDummyDrawables = updateDummyDrawables();
        if (zUpdateEditTextHeightBasedOnIcon || zUpdateDummyDrawables) {
            this.editText.post(new java.lang.Runnable() { // from class: com.google.android.material.textfield.TextInputLayout.3
                @Override // java.lang.Runnable
                public void run() {
                    com.google.android.material.textfield.TextInputLayout.this.editText.requestLayout();
                }
            });
        }
        updatePlaceholderMeasurementsBasedOnEditText();
        this.endLayout.updateSuffixTextViewPadding();
    }

    private boolean updateEditTextHeightBasedOnIcon() {
        int iMax;
        if (this.editText == null || this.editText.getMeasuredHeight() >= (iMax = java.lang.Math.max(this.endLayout.getMeasuredHeight(), this.startLayout.getMeasuredHeight()))) {
            return false;
        }
        this.editText.setMinimumHeight(iMax);
        return true;
    }

    private void updatePlaceholderMeasurementsBasedOnEditText() {
        android.widget.EditText editText;
        if (this.placeholderTextView == null || (editText = this.editText) == null) {
            return;
        }
        this.placeholderTextView.setGravity(editText.getGravity());
        this.placeholderTextView.setPadding(this.editText.getCompoundPaddingLeft(), this.editText.getCompoundPaddingTop(), this.editText.getCompoundPaddingRight(), this.editText.getCompoundPaddingBottom());
    }

    public void setStartIconDrawable(int i) {
        setStartIconDrawable(i != 0 ? androidx.appcompat.content.res.AppCompatResources.getDrawable(getContext(), i) : null);
    }

    public void setStartIconDrawable(android.graphics.drawable.Drawable drawable) {
        this.startLayout.setStartIconDrawable(drawable);
    }

    public android.graphics.drawable.Drawable getStartIconDrawable() {
        return this.startLayout.getStartIconDrawable();
    }

    public void setStartIconOnClickListener(android.view.View.OnClickListener onClickListener) {
        this.startLayout.setStartIconOnClickListener(onClickListener);
    }

    public void setStartIconOnLongClickListener(android.view.View.OnLongClickListener onLongClickListener) {
        this.startLayout.setStartIconOnLongClickListener(onLongClickListener);
    }

    public void setStartIconVisible(boolean z) {
        this.startLayout.setStartIconVisible(z);
    }

    public boolean isStartIconVisible() {
        return this.startLayout.isStartIconVisible();
    }

    public void refreshStartIconDrawableState() {
        this.startLayout.refreshStartIconDrawableState();
    }

    public void setStartIconCheckable(boolean z) {
        this.startLayout.setStartIconCheckable(z);
    }

    public boolean isStartIconCheckable() {
        return this.startLayout.isStartIconCheckable();
    }

    public void setStartIconContentDescription(int i) {
        setStartIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setStartIconContentDescription(java.lang.CharSequence charSequence) {
        this.startLayout.setStartIconContentDescription(charSequence);
    }

    public java.lang.CharSequence getStartIconContentDescription() {
        return this.startLayout.getStartIconContentDescription();
    }

    public void setStartIconTintList(android.content.res.ColorStateList colorStateList) {
        this.startLayout.setStartIconTintList(colorStateList);
    }

    public void setStartIconTintMode(android.graphics.PorterDuff.Mode mode) {
        this.startLayout.setStartIconTintMode(mode);
    }

    public void setEndIconMode(int i) {
        this.endLayout.setEndIconMode(i);
    }

    public int getEndIconMode() {
        return this.endLayout.getEndIconMode();
    }

    public void setEndIconOnClickListener(android.view.View.OnClickListener onClickListener) {
        this.endLayout.setEndIconOnClickListener(onClickListener);
    }

    public void setErrorIconOnClickListener(android.view.View.OnClickListener onClickListener) {
        this.endLayout.setErrorIconOnClickListener(onClickListener);
    }

    public void setEndIconOnLongClickListener(android.view.View.OnLongClickListener onLongClickListener) {
        this.endLayout.setEndIconOnLongClickListener(onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(android.view.View.OnLongClickListener onLongClickListener) {
        this.endLayout.setErrorIconOnLongClickListener(onLongClickListener);
    }

    public void refreshErrorIconDrawableState() {
        this.endLayout.refreshErrorIconDrawableState();
    }

    public void setEndIconVisible(boolean z) {
        this.endLayout.setEndIconVisible(z);
    }

    public boolean isEndIconVisible() {
        return this.endLayout.isEndIconVisible();
    }

    public void setEndIconActivated(boolean z) {
        this.endLayout.setEndIconActivated(z);
    }

    public void refreshEndIconDrawableState() {
        this.endLayout.refreshEndIconDrawableState();
    }

    public void setEndIconCheckable(boolean z) {
        this.endLayout.setEndIconCheckable(z);
    }

    public boolean isEndIconCheckable() {
        return this.endLayout.isEndIconCheckable();
    }

    public void setEndIconDrawable(int i) {
        this.endLayout.setEndIconDrawable(i);
    }

    public void setEndIconDrawable(android.graphics.drawable.Drawable drawable) {
        this.endLayout.setEndIconDrawable(drawable);
    }

    public android.graphics.drawable.Drawable getEndIconDrawable() {
        return this.endLayout.getEndIconDrawable();
    }

    public void setEndIconContentDescription(int i) {
        this.endLayout.setEndIconContentDescription(i);
    }

    public void setEndIconContentDescription(java.lang.CharSequence charSequence) {
        this.endLayout.setEndIconContentDescription(charSequence);
    }

    public java.lang.CharSequence getEndIconContentDescription() {
        return this.endLayout.getEndIconContentDescription();
    }

    public void setEndIconTintList(android.content.res.ColorStateList colorStateList) {
        this.endLayout.setEndIconTintList(colorStateList);
    }

    public void setEndIconTintMode(android.graphics.PorterDuff.Mode mode) {
        this.endLayout.setEndIconTintMode(mode);
    }

    public void addOnEndIconChangedListener(com.google.android.material.textfield.TextInputLayout.OnEndIconChangedListener onEndIconChangedListener) {
        this.endLayout.addOnEndIconChangedListener(onEndIconChangedListener);
    }

    public void removeOnEndIconChangedListener(com.google.android.material.textfield.TextInputLayout.OnEndIconChangedListener onEndIconChangedListener) {
        this.endLayout.removeOnEndIconChangedListener(onEndIconChangedListener);
    }

    public void clearOnEndIconChangedListeners() {
        this.endLayout.clearOnEndIconChangedListeners();
    }

    public void addOnEditTextAttachedListener(com.google.android.material.textfield.TextInputLayout.OnEditTextAttachedListener onEditTextAttachedListener) {
        this.editTextAttachedListeners.add(onEditTextAttachedListener);
        if (this.editText != null) {
            onEditTextAttachedListener.onEditTextAttached(this);
        }
    }

    public void removeOnEditTextAttachedListener(com.google.android.material.textfield.TextInputLayout.OnEditTextAttachedListener onEditTextAttachedListener) {
        this.editTextAttachedListeners.remove(onEditTextAttachedListener);
    }

    public void clearOnEditTextAttachedListeners() {
        this.editTextAttachedListeners.clear();
    }

    @java.lang.Deprecated
    public void setPasswordVisibilityToggleDrawable(int i) {
        this.endLayout.setPasswordVisibilityToggleDrawable(i);
    }

    @java.lang.Deprecated
    public void setPasswordVisibilityToggleDrawable(android.graphics.drawable.Drawable drawable) {
        this.endLayout.setPasswordVisibilityToggleDrawable(drawable);
    }

    @java.lang.Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i) {
        this.endLayout.setPasswordVisibilityToggleContentDescription(i);
    }

    @java.lang.Deprecated
    public void setPasswordVisibilityToggleContentDescription(java.lang.CharSequence charSequence) {
        this.endLayout.setPasswordVisibilityToggleContentDescription(charSequence);
    }

    @java.lang.Deprecated
    public android.graphics.drawable.Drawable getPasswordVisibilityToggleDrawable() {
        return this.endLayout.getPasswordVisibilityToggleDrawable();
    }

    @java.lang.Deprecated
    public java.lang.CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.endLayout.getPasswordVisibilityToggleContentDescription();
    }

    @java.lang.Deprecated
    public boolean isPasswordVisibilityToggleEnabled() {
        return this.endLayout.isPasswordVisibilityToggleEnabled();
    }

    @java.lang.Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z) {
        this.endLayout.setPasswordVisibilityToggleEnabled(z);
    }

    @java.lang.Deprecated
    public void setPasswordVisibilityToggleTintList(android.content.res.ColorStateList colorStateList) {
        this.endLayout.setPasswordVisibilityToggleTintList(colorStateList);
    }

    @java.lang.Deprecated
    public void setPasswordVisibilityToggleTintMode(android.graphics.PorterDuff.Mode mode) {
        this.endLayout.setPasswordVisibilityToggleTintMode(mode);
    }

    @java.lang.Deprecated
    public void passwordVisibilityToggleRequested(boolean z) {
        this.endLayout.togglePasswordVisibilityToggle(z);
    }

    public void setTextInputAccessibilityDelegate(com.google.android.material.textfield.TextInputLayout.AccessibilityDelegate accessibilityDelegate) {
        android.widget.EditText editText = this.editText;
        if (editText != null) {
            androidx.core.view.ViewCompat.setAccessibilityDelegate(editText, accessibilityDelegate);
        }
    }

    com.google.android.material.internal.CheckableImageButton getEndIconView() {
        return this.endLayout.getEndIconView();
    }

    private void dispatchOnEditTextAttached() {
        java.util.Iterator<com.google.android.material.textfield.TextInputLayout.OnEditTextAttachedListener> it = this.editTextAttachedListeners.iterator();
        while (it.hasNext()) {
            it.next().onEditTextAttached(this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0062  */
    boolean updateDummyDrawables() {
        boolean z;
        if (this.editText == null) {
            return false;
        }
        boolean z2 = true;
        if (shouldUpdateStartDummyDrawable()) {
            int measuredWidth = this.startLayout.getMeasuredWidth() - this.editText.getPaddingLeft();
            if (this.startDummyDrawable == null || this.startDummyDrawableWidth != measuredWidth) {
                android.graphics.drawable.ColorDrawable colorDrawable = new android.graphics.drawable.ColorDrawable();
                this.startDummyDrawable = colorDrawable;
                this.startDummyDrawableWidth = measuredWidth;
                colorDrawable.setBounds(0, 0, measuredWidth, 1);
            }
            android.graphics.drawable.Drawable[] compoundDrawablesRelative = androidx.core.widget.TextViewCompat.getCompoundDrawablesRelative(this.editText);
            android.graphics.drawable.Drawable drawable = compoundDrawablesRelative[0];
            android.graphics.drawable.Drawable drawable2 = this.startDummyDrawable;
            if (drawable != drawable2) {
                androidx.core.widget.TextViewCompat.setCompoundDrawablesRelative(this.editText, drawable2, compoundDrawablesRelative[1], compoundDrawablesRelative[2], compoundDrawablesRelative[3]);
                z = true;
            } else {
                z = false;
            }
        } else if (this.startDummyDrawable != null) {
            android.graphics.drawable.Drawable[] compoundDrawablesRelative2 = androidx.core.widget.TextViewCompat.getCompoundDrawablesRelative(this.editText);
            androidx.core.widget.TextViewCompat.setCompoundDrawablesRelative(this.editText, null, compoundDrawablesRelative2[1], compoundDrawablesRelative2[2], compoundDrawablesRelative2[3]);
            this.startDummyDrawable = null;
            z = true;
        } else {
            z = false;
        }
        if (shouldUpdateEndDummyDrawable()) {
            int measuredWidth2 = this.endLayout.getSuffixTextView().getMeasuredWidth() - this.editText.getPaddingRight();
            com.google.android.material.internal.CheckableImageButton currentEndIconView = this.endLayout.getCurrentEndIconView();
            if (currentEndIconView != null) {
                measuredWidth2 = measuredWidth2 + currentEndIconView.getMeasuredWidth() + androidx.core.view.MarginLayoutParamsCompat.getMarginStart((android.view.ViewGroup.MarginLayoutParams) currentEndIconView.getLayoutParams());
            }
            android.graphics.drawable.Drawable[] compoundDrawablesRelative3 = androidx.core.widget.TextViewCompat.getCompoundDrawablesRelative(this.editText);
            android.graphics.drawable.Drawable drawable3 = this.endDummyDrawable;
            if (drawable3 != null && this.endDummyDrawableWidth != measuredWidth2) {
                this.endDummyDrawableWidth = measuredWidth2;
                drawable3.setBounds(0, 0, measuredWidth2, 1);
                androidx.core.widget.TextViewCompat.setCompoundDrawablesRelative(this.editText, compoundDrawablesRelative3[0], compoundDrawablesRelative3[1], this.endDummyDrawable, compoundDrawablesRelative3[3]);
            } else {
                if (drawable3 == null) {
                    android.graphics.drawable.ColorDrawable colorDrawable2 = new android.graphics.drawable.ColorDrawable();
                    this.endDummyDrawable = colorDrawable2;
                    this.endDummyDrawableWidth = measuredWidth2;
                    colorDrawable2.setBounds(0, 0, measuredWidth2, 1);
                }
                android.graphics.drawable.Drawable drawable4 = compoundDrawablesRelative3[2];
                android.graphics.drawable.Drawable drawable5 = this.endDummyDrawable;
                if (drawable4 != drawable5) {
                    this.originalEditTextEndDrawable = drawable4;
                    androidx.core.widget.TextViewCompat.setCompoundDrawablesRelative(this.editText, compoundDrawablesRelative3[0], compoundDrawablesRelative3[1], drawable5, compoundDrawablesRelative3[3]);
                } else {
                    z2 = z;
                }
            }
        } else {
            if (this.endDummyDrawable == null) {
                return z;
            }
            android.graphics.drawable.Drawable[] compoundDrawablesRelative4 = androidx.core.widget.TextViewCompat.getCompoundDrawablesRelative(this.editText);
            if (compoundDrawablesRelative4[2] == this.endDummyDrawable) {
                androidx.core.widget.TextViewCompat.setCompoundDrawablesRelative(this.editText, compoundDrawablesRelative4[0], compoundDrawablesRelative4[1], this.originalEditTextEndDrawable, compoundDrawablesRelative4[3]);
            } else {
                z2 = z;
            }
            this.endDummyDrawable = null;
        }
        return z2;
    }

    private boolean shouldUpdateStartDummyDrawable() {
        return (getStartIconDrawable() != null || (getPrefixText() != null && getPrefixTextView().getVisibility() == 0)) && this.startLayout.getMeasuredWidth() > 0;
    }

    private boolean shouldUpdateEndDummyDrawable() {
        return (this.endLayout.isErrorIconVisible() || ((this.endLayout.hasEndIcon() && isEndIconVisible()) || this.endLayout.getSuffixText() != null)) && this.endLayout.getMeasuredWidth() > 0;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        android.widget.EditText editText = this.editText;
        if (editText != null) {
            android.graphics.Rect rect = this.tmpRect;
            com.google.android.material.internal.DescendantOffsetUtils.getDescendantRect(this, editText, rect);
            updateBoxUnderlineBounds(rect);
            if (this.hintEnabled) {
                this.collapsingTextHelper.setExpandedTextSize(this.editText.getTextSize());
                int gravity = this.editText.getGravity();
                this.collapsingTextHelper.setCollapsedTextGravity((gravity & (-113)) | 48);
                this.collapsingTextHelper.setExpandedTextGravity(gravity);
                this.collapsingTextHelper.setCollapsedBounds(calculateCollapsedTextBounds(rect));
                this.collapsingTextHelper.setExpandedBounds(calculateExpandedTextBounds(rect));
                this.collapsingTextHelper.recalculate();
                if (!cutoutEnabled() || this.hintExpanded) {
                    return;
                }
                openCutout();
            }
        }
    }

    private void updateBoxUnderlineBounds(android.graphics.Rect rect) {
        if (this.boxUnderlineDefault != null) {
            this.boxUnderlineDefault.setBounds(rect.left, rect.bottom - this.boxStrokeWidthDefaultPx, rect.right, rect.bottom);
        }
        if (this.boxUnderlineFocused != null) {
            this.boxUnderlineFocused.setBounds(rect.left, rect.bottom - this.boxStrokeWidthFocusedPx, rect.right, rect.bottom);
        }
    }

    @Override // android.view.View
    public void draw(android.graphics.Canvas canvas) {
        super.draw(canvas);
        drawHint(canvas);
        drawBoxUnderline(canvas);
    }

    @Override // android.view.View
    protected void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.collapsingTextHelper.maybeUpdateFontWeightAdjustment(configuration);
    }

    private void drawHint(android.graphics.Canvas canvas) {
        if (this.hintEnabled) {
            this.collapsingTextHelper.draw(canvas);
        }
    }

    private void drawBoxUnderline(android.graphics.Canvas canvas) {
        com.google.android.material.shape.MaterialShapeDrawable materialShapeDrawable;
        if (this.boxUnderlineFocused == null || (materialShapeDrawable = this.boxUnderlineDefault) == null) {
            return;
        }
        materialShapeDrawable.draw(canvas);
        if (this.editText.isFocused()) {
            android.graphics.Rect bounds = this.boxUnderlineFocused.getBounds();
            android.graphics.Rect bounds2 = this.boxUnderlineDefault.getBounds();
            float expansionFraction = this.collapsingTextHelper.getExpansionFraction();
            int iCenterX = bounds2.centerX();
            bounds.left = com.google.android.material.animation.AnimationUtils.lerp(iCenterX, bounds2.left, expansionFraction);
            bounds.right = com.google.android.material.animation.AnimationUtils.lerp(iCenterX, bounds2.right, expansionFraction);
            this.boxUnderlineFocused.draw(canvas);
        }
    }

    private void collapseHint(boolean z) {
        android.animation.ValueAnimator valueAnimator = this.animator;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.animator.cancel();
        }
        if (z && this.hintAnimationEnabled) {
            animateToExpansionFraction(1.0f);
        } else {
            this.collapsingTextHelper.setExpansionFraction(1.0f);
        }
        this.hintExpanded = false;
        if (cutoutEnabled()) {
            openCutout();
        }
        updatePlaceholderText();
        this.startLayout.onHintStateChanged(false);
        this.endLayout.onHintStateChanged(false);
    }

    private boolean cutoutEnabled() {
        return this.hintEnabled && !android.text.TextUtils.isEmpty(this.hint) && (this.boxBackground instanceof com.google.android.material.textfield.CutoutDrawable);
    }

    private void openCutout() {
        if (cutoutEnabled()) {
            android.graphics.RectF rectF = this.tmpRectF;
            this.collapsingTextHelper.getCollapsedTextActualBounds(rectF, this.editText.getWidth(), this.editText.getGravity());
            if (rectF.width() <= 0.0f || rectF.height() <= 0.0f) {
                return;
            }
            applyCutoutPadding(rectF);
            rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.boxStrokeWidthPx);
            ((com.google.android.material.textfield.CutoutDrawable) this.boxBackground).setCutout(rectF);
        }
    }

    private void recalculateCutout() {
        if (!cutoutEnabled() || this.hintExpanded) {
            return;
        }
        closeCutout();
        openCutout();
    }

    private void closeCutout() {
        if (cutoutEnabled()) {
            ((com.google.android.material.textfield.CutoutDrawable) this.boxBackground).removeCutout();
        }
    }

    private void applyCutoutPadding(android.graphics.RectF rectF) {
        rectF.left -= this.boxLabelCutoutPaddingPx;
        rectF.right += this.boxLabelCutoutPaddingPx;
    }

    boolean cutoutIsOpen() {
        return cutoutEnabled() && ((com.google.android.material.textfield.CutoutDrawable) this.boxBackground).hasCutout();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        if (this.inDrawableStateChanged) {
            return;
        }
        this.inDrawableStateChanged = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        com.google.android.material.internal.CollapsingTextHelper collapsingTextHelper = this.collapsingTextHelper;
        boolean state = collapsingTextHelper != null ? collapsingTextHelper.setState(drawableState) | false : false;
        if (this.editText != null) {
            updateLabelState(androidx.core.view.ViewCompat.isLaidOut(this) && isEnabled());
        }
        updateEditTextBackground();
        updateTextInputBoxState();
        if (state) {
            invalidate();
        }
        this.inDrawableStateChanged = false;
    }

    void updateTextInputBoxState() {
        android.widget.TextView textView;
        android.widget.EditText editText;
        android.widget.EditText editText2;
        if (this.boxBackground == null || this.boxBackgroundMode == 0) {
            return;
        }
        boolean z = false;
        boolean z2 = isFocused() || ((editText2 = this.editText) != null && editText2.hasFocus());
        if (isHovered() || ((editText = this.editText) != null && editText.isHovered())) {
            z = true;
        }
        if (!isEnabled()) {
            this.boxStrokeColor = this.disabledColor;
        } else if (shouldShowError()) {
            if (this.strokeErrorColor != null) {
                updateStrokeErrorColor(z2, z);
            } else {
                this.boxStrokeColor = getErrorCurrentTextColors();
            }
        } else if (!this.counterOverflowed || (textView = this.counterView) == null) {
            if (z2) {
                this.boxStrokeColor = this.focusedStrokeColor;
            } else if (z) {
                this.boxStrokeColor = this.hoveredStrokeColor;
            } else {
                this.boxStrokeColor = this.defaultStrokeColor;
            }
        } else if (this.strokeErrorColor != null) {
            updateStrokeErrorColor(z2, z);
        } else {
            this.boxStrokeColor = textView.getCurrentTextColor();
        }
        this.endLayout.onTextInputBoxStateUpdated();
        refreshStartIconDrawableState();
        if (this.boxBackgroundMode == 2) {
            int i = this.boxStrokeWidthPx;
            if (z2 && isEnabled()) {
                this.boxStrokeWidthPx = this.boxStrokeWidthFocusedPx;
            } else {
                this.boxStrokeWidthPx = this.boxStrokeWidthDefaultPx;
            }
            if (this.boxStrokeWidthPx != i) {
                recalculateCutout();
            }
        }
        if (this.boxBackgroundMode == 1) {
            if (!isEnabled()) {
                this.boxBackgroundColor = this.disabledFilledBackgroundColor;
            } else if (z && !z2) {
                this.boxBackgroundColor = this.hoveredFilledBackgroundColor;
            } else if (z2) {
                this.boxBackgroundColor = this.focusedFilledBackgroundColor;
            } else {
                this.boxBackgroundColor = this.defaultFilledBackgroundColor;
            }
        }
        applyBoxAttributes();
    }

    private void updateStrokeErrorColor(boolean z, boolean z2) {
        int defaultColor = this.strokeErrorColor.getDefaultColor();
        int colorForState = this.strokeErrorColor.getColorForState(new int[]{android.R.attr.state_hovered, android.R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.strokeErrorColor.getColorForState(new int[]{android.R.attr.state_activated, android.R.attr.state_enabled}, defaultColor);
        if (z) {
            this.boxStrokeColor = colorForState2;
        } else if (z2) {
            this.boxStrokeColor = colorForState;
        } else {
            this.boxStrokeColor = defaultColor;
        }
    }

    private void expandHint(boolean z) {
        android.animation.ValueAnimator valueAnimator = this.animator;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.animator.cancel();
        }
        if (z && this.hintAnimationEnabled) {
            animateToExpansionFraction(0.0f);
        } else {
            this.collapsingTextHelper.setExpansionFraction(0.0f);
        }
        if (cutoutEnabled() && ((com.google.android.material.textfield.CutoutDrawable) this.boxBackground).hasCutout()) {
            closeCutout();
        }
        this.hintExpanded = true;
        hidePlaceholderText();
        this.startLayout.onHintStateChanged(true);
        this.endLayout.onHintStateChanged(true);
    }

    void animateToExpansionFraction(float f) {
        if (this.collapsingTextHelper.getExpansionFraction() == f) {
            return;
        }
        if (this.animator == null) {
            android.animation.ValueAnimator valueAnimator = new android.animation.ValueAnimator();
            this.animator = valueAnimator;
            valueAnimator.setInterpolator(com.google.android.material.animation.AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR);
            this.animator.setDuration(167L);
            this.animator.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.textfield.TextInputLayout.4
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator2) {
                    com.google.android.material.textfield.TextInputLayout.this.collapsingTextHelper.setExpansionFraction(((java.lang.Float) valueAnimator2.getAnimatedValue()).floatValue());
                }
            });
        }
        this.animator.setFloatValues(this.collapsingTextHelper.getExpansionFraction(), f);
        this.animator.start();
    }

    final boolean isHintExpanded() {
        return this.hintExpanded;
    }

    final boolean isHelperTextDisplayed() {
        return this.indicatorViewController.helperTextIsDisplayed();
    }

    final int getHintCurrentCollapsedTextColor() {
        return this.collapsingTextHelper.getCurrentCollapsedTextColor();
    }

    final float getHintCollapsedTextHeight() {
        return this.collapsingTextHelper.getCollapsedTextHeight();
    }

    public static class AccessibilityDelegate extends androidx.core.view.AccessibilityDelegateCompat {
        private final com.google.android.material.textfield.TextInputLayout layout;

        public AccessibilityDelegate(com.google.android.material.textfield.TextInputLayout textInputLayout) {
            this.layout = textInputLayout;
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityNodeInfo(android.view.View view, androidx.core.view.accessibility.AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            android.widget.EditText editText = this.layout.getEditText();
            java.lang.CharSequence text = editText != null ? editText.getText() : null;
            java.lang.CharSequence hint = this.layout.getHint();
            java.lang.CharSequence error = this.layout.getError();
            java.lang.CharSequence placeholderText = this.layout.getPlaceholderText();
            int counterMaxLength = this.layout.getCounterMaxLength();
            java.lang.CharSequence counterOverflowDescription = this.layout.getCounterOverflowDescription();
            boolean z = !android.text.TextUtils.isEmpty(text);
            boolean z2 = !android.text.TextUtils.isEmpty(hint);
            boolean z3 = !this.layout.isHintExpanded();
            boolean z4 = !android.text.TextUtils.isEmpty(error);
            boolean z5 = z4 || !android.text.TextUtils.isEmpty(counterOverflowDescription);
            java.lang.String string = z2 ? hint.toString() : "";
            this.layout.startLayout.setupAccessibilityNodeInfo(accessibilityNodeInfoCompat);
            if (z) {
                accessibilityNodeInfoCompat.setText(text);
            } else if (!android.text.TextUtils.isEmpty(string)) {
                accessibilityNodeInfoCompat.setText(string);
                if (z3 && placeholderText != null) {
                    accessibilityNodeInfoCompat.setText(string + ", " + ((java.lang.Object) placeholderText));
                }
            } else if (placeholderText != null) {
                accessibilityNodeInfoCompat.setText(placeholderText);
            }
            if (!android.text.TextUtils.isEmpty(string)) {
                if (android.os.Build.VERSION.SDK_INT >= 26) {
                    accessibilityNodeInfoCompat.setHintText(string);
                } else {
                    if (z) {
                        string = ((java.lang.Object) text) + ", " + string;
                    }
                    accessibilityNodeInfoCompat.setText(string);
                }
                accessibilityNodeInfoCompat.setShowingHintText(!z);
            }
            if (text == null || text.length() != counterMaxLength) {
                counterMaxLength = -1;
            }
            accessibilityNodeInfoCompat.setMaxTextLength(counterMaxLength);
            if (z5) {
                if (!z4) {
                    error = counterOverflowDescription;
                }
                accessibilityNodeInfoCompat.setError(error);
            }
            android.view.View helperTextView = this.layout.indicatorViewController.getHelperTextView();
            if (helperTextView != null) {
                accessibilityNodeInfoCompat.setLabelFor(helperTextView);
            }
            this.layout.endLayout.getEndIconDelegate().onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onPopulateAccessibilityEvent(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
            super.onPopulateAccessibilityEvent(view, accessibilityEvent);
            this.layout.endLayout.getEndIconDelegate().onPopulateAccessibilityEvent(view, accessibilityEvent);
        }
    }
}
