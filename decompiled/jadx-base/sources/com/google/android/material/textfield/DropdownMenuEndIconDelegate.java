package com.google.android.material.textfield;

/* JADX INFO: loaded from: classes5.dex */
class DropdownMenuEndIconDelegate extends com.google.android.material.textfield.EndIconDelegate {
    private static final int ANIMATION_FADE_IN_DURATION = 67;
    private static final int ANIMATION_FADE_OUT_DURATION = 50;
    private static final boolean IS_LOLLIPOP = true;
    private android.view.accessibility.AccessibilityManager accessibilityManager;
    private android.widget.AutoCompleteTextView autoCompleteTextView;
    private long dropdownPopupActivatedAt;
    private boolean dropdownPopupDirty;
    private boolean editTextHasFocus;
    private android.animation.ValueAnimator fadeInAnim;
    private android.animation.ValueAnimator fadeOutAnim;
    private boolean isEndIconChecked;
    private final android.view.View.OnFocusChangeListener onEditTextFocusChangeListener;
    private final android.view.View.OnClickListener onIconClickListener;
    private final androidx.core.view.accessibility.AccessibilityManagerCompat.TouchExplorationStateChangeListener touchExplorationStateChangeListener;

    @Override // com.google.android.material.textfield.EndIconDelegate
    boolean isBoxBackgroundModeSupported(int i) {
        return i != 0;
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    boolean isIconActivable() {
        return true;
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    boolean isIconCheckable() {
        return true;
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    boolean shouldTintIconOnError() {
        return true;
    }

    /* JADX INFO: renamed from: lambda$new$0$com-google-android-material-textfield-DropdownMenuEndIconDelegate, reason: not valid java name */
    /* synthetic */ void m782xd03fedd4(android.view.View view) {
        showHideDropdown();
    }

    /* JADX INFO: renamed from: lambda$new$1$com-google-android-material-textfield-DropdownMenuEndIconDelegate, reason: not valid java name */
    /* synthetic */ void m783xac016995(android.view.View view, boolean z) {
        this.editTextHasFocus = z;
        refreshIconState();
        if (z) {
            return;
        }
        setEndIconChecked(false);
        this.dropdownPopupDirty = false;
    }

    /* JADX INFO: renamed from: lambda$new$2$com-google-android-material-textfield-DropdownMenuEndIconDelegate, reason: not valid java name */
    /* synthetic */ void m784x87c2e556(boolean z) {
        android.widget.AutoCompleteTextView autoCompleteTextView = this.autoCompleteTextView;
        if (autoCompleteTextView == null || com.google.android.material.textfield.EditTextUtils.isEditable(autoCompleteTextView)) {
            return;
        }
        androidx.core.view.ViewCompat.setImportantForAccessibility(this.endIconView, z ? 2 : 1);
    }

    DropdownMenuEndIconDelegate(com.google.android.material.textfield.EndCompoundLayout endCompoundLayout) {
        super(endCompoundLayout);
        this.onIconClickListener = new android.view.View.OnClickListener() { // from class: com.google.android.material.textfield.DropdownMenuEndIconDelegate$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                this.f$0.m782xd03fedd4(view);
            }
        };
        this.onEditTextFocusChangeListener = new android.view.View.OnFocusChangeListener() { // from class: com.google.android.material.textfield.DropdownMenuEndIconDelegate$$ExternalSyntheticLambda1
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(android.view.View view, boolean z) {
                this.f$0.m783xac016995(view, z);
            }
        };
        this.touchExplorationStateChangeListener = new androidx.core.view.accessibility.AccessibilityManagerCompat.TouchExplorationStateChangeListener() { // from class: com.google.android.material.textfield.DropdownMenuEndIconDelegate$$ExternalSyntheticLambda2
            @Override // androidx.core.view.accessibility.AccessibilityManagerCompat.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z) {
                this.f$0.m784x87c2e556(z);
            }
        };
        this.dropdownPopupActivatedAt = Long.MAX_VALUE;
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    void setUp() {
        initAnimators();
        this.accessibilityManager = (android.view.accessibility.AccessibilityManager) this.context.getSystemService("accessibility");
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    void tearDown() {
        android.widget.AutoCompleteTextView autoCompleteTextView = this.autoCompleteTextView;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            if (IS_LOLLIPOP) {
                this.autoCompleteTextView.setOnDismissListener(null);
            }
        }
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public androidx.core.view.accessibility.AccessibilityManagerCompat.TouchExplorationStateChangeListener getTouchExplorationStateChangeListener() {
        return this.touchExplorationStateChangeListener;
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    int getIconDrawableResId() {
        return IS_LOLLIPOP ? com.google.android.material.R.drawable.mtrl_dropdown_arrow : com.google.android.material.R.drawable.mtrl_ic_arrow_drop_down;
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    int getIconContentDescriptionResId() {
        return com.google.android.material.R.string.exposed_dropdown_menu_content_description;
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    boolean isIconChecked() {
        return this.isEndIconChecked;
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    boolean isIconActivated() {
        return this.editTextHasFocus;
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    android.view.View.OnClickListener getOnIconClickListener() {
        return this.onIconClickListener;
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public void onEditTextAttached(android.widget.EditText editText) {
        this.autoCompleteTextView = castAutoCompleteTextViewOrThrow(editText);
        setUpDropdownShowHideBehavior();
        this.textInputLayout.setErrorIconDrawable((android.graphics.drawable.Drawable) null);
        if (!com.google.android.material.textfield.EditTextUtils.isEditable(editText) && this.accessibilityManager.isTouchExplorationEnabled()) {
            androidx.core.view.ViewCompat.setImportantForAccessibility(this.endIconView, 2);
        }
        this.textInputLayout.setEndIconVisible(true);
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public void afterEditTextChanged(android.text.Editable editable) {
        if (this.accessibilityManager.isTouchExplorationEnabled() && com.google.android.material.textfield.EditTextUtils.isEditable(this.autoCompleteTextView) && !this.endIconView.hasFocus()) {
            this.autoCompleteTextView.dismissDropDown();
        }
        this.autoCompleteTextView.post(new java.lang.Runnable() { // from class: com.google.android.material.textfield.DropdownMenuEndIconDelegate$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m780xae660ff2();
            }
        });
    }

    /* JADX INFO: renamed from: lambda$afterEditTextChanged$3$com-google-android-material-textfield-DropdownMenuEndIconDelegate, reason: not valid java name */
    /* synthetic */ void m780xae660ff2() {
        boolean zIsPopupShowing = this.autoCompleteTextView.isPopupShowing();
        setEndIconChecked(zIsPopupShowing);
        this.dropdownPopupDirty = zIsPopupShowing;
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    android.view.View.OnFocusChangeListener getOnEditTextFocusChangeListener() {
        return this.onEditTextFocusChangeListener;
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public void onInitializeAccessibilityNodeInfo(android.view.View view, androidx.core.view.accessibility.AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        if (!com.google.android.material.textfield.EditTextUtils.isEditable(this.autoCompleteTextView)) {
            accessibilityNodeInfoCompat.setClassName(android.widget.Spinner.class.getName());
        }
        if (accessibilityNodeInfoCompat.isShowingHintText()) {
            accessibilityNodeInfoCompat.setHintText(null);
        }
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public void onPopulateAccessibilityEvent(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 1 && this.accessibilityManager.isEnabled() && !com.google.android.material.textfield.EditTextUtils.isEditable(this.autoCompleteTextView)) {
            showHideDropdown();
            updateDropdownPopupDirty();
        }
    }

    private void showHideDropdown() {
        if (this.autoCompleteTextView == null) {
            return;
        }
        if (isDropdownPopupActive()) {
            this.dropdownPopupDirty = false;
        }
        if (!this.dropdownPopupDirty) {
            if (IS_LOLLIPOP) {
                setEndIconChecked(!this.isEndIconChecked);
            } else {
                this.isEndIconChecked = !this.isEndIconChecked;
                refreshIconState();
            }
            if (this.isEndIconChecked) {
                this.autoCompleteTextView.requestFocus();
                this.autoCompleteTextView.showDropDown();
                return;
            } else {
                this.autoCompleteTextView.dismissDropDown();
                return;
            }
        }
        this.dropdownPopupDirty = false;
    }

    private void setUpDropdownShowHideBehavior() {
        this.autoCompleteTextView.setOnTouchListener(new android.view.View.OnTouchListener() { // from class: com.google.android.material.textfield.DropdownMenuEndIconDelegate$$ExternalSyntheticLambda5
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
                return this.f$0.m785x5f2e2537(view, motionEvent);
            }
        });
        if (IS_LOLLIPOP) {
            this.autoCompleteTextView.setOnDismissListener(new android.widget.AutoCompleteTextView.OnDismissListener() { // from class: com.google.android.material.textfield.DropdownMenuEndIconDelegate$$ExternalSyntheticLambda6
                @Override // android.widget.AutoCompleteTextView.OnDismissListener
                public final void onDismiss() {
                    this.f$0.m786x3aefa0f8();
                }
            });
        }
        this.autoCompleteTextView.setThreshold(0);
    }

    /* JADX INFO: renamed from: lambda$setUpDropdownShowHideBehavior$4$com-google-android-material-textfield-DropdownMenuEndIconDelegate, reason: not valid java name */
    /* synthetic */ boolean m785x5f2e2537(android.view.View view, android.view.MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            if (isDropdownPopupActive()) {
                this.dropdownPopupDirty = false;
            }
            showHideDropdown();
            updateDropdownPopupDirty();
        }
        return false;
    }

    /* JADX INFO: renamed from: lambda$setUpDropdownShowHideBehavior$5$com-google-android-material-textfield-DropdownMenuEndIconDelegate, reason: not valid java name */
    /* synthetic */ void m786x3aefa0f8() {
        updateDropdownPopupDirty();
        setEndIconChecked(false);
    }

    private boolean isDropdownPopupActive() {
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis() - this.dropdownPopupActivatedAt;
        return jCurrentTimeMillis < 0 || jCurrentTimeMillis > 300;
    }

    private static android.widget.AutoCompleteTextView castAutoCompleteTextViewOrThrow(android.widget.EditText editText) {
        if (!(editText instanceof android.widget.AutoCompleteTextView)) {
            throw new java.lang.RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
        }
        return (android.widget.AutoCompleteTextView) editText;
    }

    private void updateDropdownPopupDirty() {
        this.dropdownPopupDirty = true;
        this.dropdownPopupActivatedAt = java.lang.System.currentTimeMillis();
    }

    private void setEndIconChecked(boolean z) {
        if (this.isEndIconChecked != z) {
            this.isEndIconChecked = z;
            this.fadeInAnim.cancel();
            this.fadeOutAnim.start();
        }
    }

    private void initAnimators() {
        this.fadeInAnim = getAlphaAnimator(67, 0.0f, 1.0f);
        android.animation.ValueAnimator alphaAnimator = getAlphaAnimator(50, 1.0f, 0.0f);
        this.fadeOutAnim = alphaAnimator;
        alphaAnimator.addListener(new android.animation.AnimatorListenerAdapter() { // from class: com.google.android.material.textfield.DropdownMenuEndIconDelegate.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(android.animation.Animator animator) {
                com.google.android.material.textfield.DropdownMenuEndIconDelegate.this.refreshIconState();
                com.google.android.material.textfield.DropdownMenuEndIconDelegate.this.fadeInAnim.start();
            }
        });
    }

    private android.animation.ValueAnimator getAlphaAnimator(int i, float... fArr) {
        android.animation.ValueAnimator valueAnimatorOfFloat = android.animation.ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(com.google.android.material.animation.AnimationUtils.LINEAR_INTERPOLATOR);
        valueAnimatorOfFloat.setDuration(i);
        valueAnimatorOfFloat.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.textfield.DropdownMenuEndIconDelegate$$ExternalSyntheticLambda3
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                this.f$0.m781x6b943a83(valueAnimator);
            }
        });
        return valueAnimatorOfFloat;
    }

    /* JADX INFO: renamed from: lambda$getAlphaAnimator$6$com-google-android-material-textfield-DropdownMenuEndIconDelegate, reason: not valid java name */
    /* synthetic */ void m781x6b943a83(android.animation.ValueAnimator valueAnimator) {
        this.endIconView.setAlpha(((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
