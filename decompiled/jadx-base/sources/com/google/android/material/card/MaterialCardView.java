package com.google.android.material.card;

/* JADX INFO: loaded from: classes5.dex */
public class MaterialCardView extends androidx.cardview.widget.CardView implements android.widget.Checkable, com.google.android.material.shape.Shapeable {
    private static final java.lang.String ACCESSIBILITY_CLASS_NAME = "androidx.cardview.widget.CardView";
    public static final int CHECKED_ICON_GRAVITY_BOTTOM_END = 8388693;
    public static final int CHECKED_ICON_GRAVITY_BOTTOM_START = 8388691;
    public static final int CHECKED_ICON_GRAVITY_TOP_END = 8388661;
    public static final int CHECKED_ICON_GRAVITY_TOP_START = 8388659;
    private static final java.lang.String LOG_TAG = "MaterialCardView";
    private final com.google.android.material.card.MaterialCardViewHelper cardViewHelper;
    private boolean checked;
    private boolean dragged;
    private boolean isParentCardViewDoneInitializing;
    private com.google.android.material.card.MaterialCardView.OnCheckedChangeListener onCheckedChangeListener;
    private static final int[] CHECKABLE_STATE_SET = {android.R.attr.state_checkable};
    private static final int[] CHECKED_STATE_SET = {android.R.attr.state_checked};
    private static final int[] DRAGGED_STATE_SET = {com.google.android.material.R.attr.state_dragged};
    private static final int DEF_STYLE_RES = com.google.android.material.R.style.Widget_MaterialComponents_CardView;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface CheckedIconGravity {
    }

    public interface OnCheckedChangeListener {
        void onCheckedChanged(com.google.android.material.card.MaterialCardView materialCardView, boolean z);
    }

    public MaterialCardView(android.content.Context context) {
        this(context, null);
    }

    public MaterialCardView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.material.R.attr.materialCardViewStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialCardView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        int i2 = DEF_STYLE_RES;
        super(com.google.android.material.theme.overlay.MaterialThemeOverlay.wrap(context, attributeSet, i, i2), attributeSet, i);
        this.checked = false;
        this.dragged = false;
        this.isParentCardViewDoneInitializing = true;
        android.content.res.TypedArray typedArrayObtainStyledAttributes = com.google.android.material.internal.ThemeEnforcement.obtainStyledAttributes(getContext(), attributeSet, com.google.android.material.R.styleable.MaterialCardView, i, i2, new int[0]);
        com.google.android.material.card.MaterialCardViewHelper materialCardViewHelper = new com.google.android.material.card.MaterialCardViewHelper(this, attributeSet, i, i2);
        this.cardViewHelper = materialCardViewHelper;
        materialCardViewHelper.setCardBackgroundColor(super.getCardBackgroundColor());
        materialCardViewHelper.setUserContentPadding(super.getContentPaddingLeft(), super.getContentPaddingTop(), super.getContentPaddingRight(), super.getContentPaddingBottom());
        materialCardViewHelper.loadFromAttributes(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(ACCESSIBILITY_CLASS_NAME);
        accessibilityNodeInfo.setCheckable(isCheckable());
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(isChecked());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(ACCESSIBILITY_CLASS_NAME);
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // androidx.cardview.widget.CardView, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.cardViewHelper.recalculateCheckedIconPosition(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setStrokeColor(int i) {
        setStrokeColor(android.content.res.ColorStateList.valueOf(i));
    }

    public void setStrokeColor(android.content.res.ColorStateList colorStateList) {
        this.cardViewHelper.setStrokeColor(colorStateList);
        invalidate();
    }

    @java.lang.Deprecated
    public int getStrokeColor() {
        return this.cardViewHelper.getStrokeColor();
    }

    public android.content.res.ColorStateList getStrokeColorStateList() {
        return this.cardViewHelper.getStrokeColorStateList();
    }

    public void setStrokeWidth(int i) {
        this.cardViewHelper.setStrokeWidth(i);
        invalidate();
    }

    public int getStrokeWidth() {
        return this.cardViewHelper.getStrokeWidth();
    }

    @Override // androidx.cardview.widget.CardView
    public void setRadius(float f) {
        super.setRadius(f);
        this.cardViewHelper.setCornerRadius(f);
    }

    @Override // androidx.cardview.widget.CardView
    public float getRadius() {
        return this.cardViewHelper.getCornerRadius();
    }

    float getCardViewRadius() {
        return super.getRadius();
    }

    public void setProgress(float f) {
        this.cardViewHelper.setProgress(f);
    }

    public float getProgress() {
        return this.cardViewHelper.getProgress();
    }

    @Override // androidx.cardview.widget.CardView
    public void setContentPadding(int i, int i2, int i3, int i4) {
        this.cardViewHelper.setUserContentPadding(i, i2, i3, i4);
    }

    void setAncestorContentPadding(int i, int i2, int i3, int i4) {
        super.setContentPadding(i, i2, i3, i4);
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingLeft() {
        return this.cardViewHelper.getUserContentPadding().left;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingTop() {
        return this.cardViewHelper.getUserContentPadding().top;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingRight() {
        return this.cardViewHelper.getUserContentPadding().right;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingBottom() {
        return this.cardViewHelper.getUserContentPadding().bottom;
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(int i) {
        this.cardViewHelper.setCardBackgroundColor(android.content.res.ColorStateList.valueOf(i));
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(android.content.res.ColorStateList colorStateList) {
        this.cardViewHelper.setCardBackgroundColor(colorStateList);
    }

    @Override // androidx.cardview.widget.CardView
    public android.content.res.ColorStateList getCardBackgroundColor() {
        return this.cardViewHelper.getCardBackgroundColor();
    }

    public void setCardForegroundColor(android.content.res.ColorStateList colorStateList) {
        this.cardViewHelper.setCardForegroundColor(colorStateList);
    }

    public android.content.res.ColorStateList getCardForegroundColor() {
        return this.cardViewHelper.getCardForegroundColor();
    }

    @Override // android.view.View
    public void setClickable(boolean z) {
        super.setClickable(z);
        com.google.android.material.card.MaterialCardViewHelper materialCardViewHelper = this.cardViewHelper;
        if (materialCardViewHelper != null) {
            materialCardViewHelper.updateClickable();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.google.android.material.shape.MaterialShapeUtils.setParentAbsoluteElevation(this, this.cardViewHelper.getBackground());
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardElevation(float f) {
        super.setCardElevation(f);
        this.cardViewHelper.updateElevation();
    }

    @Override // androidx.cardview.widget.CardView
    public void setMaxCardElevation(float f) {
        super.setMaxCardElevation(f);
        this.cardViewHelper.updateInsets();
    }

    @Override // androidx.cardview.widget.CardView
    public void setUseCompatPadding(boolean z) {
        super.setUseCompatPadding(z);
        this.cardViewHelper.updateInsets();
        this.cardViewHelper.updateContentPadding();
    }

    @Override // androidx.cardview.widget.CardView
    public void setPreventCornerOverlap(boolean z) {
        super.setPreventCornerOverlap(z);
        this.cardViewHelper.updateInsets();
        this.cardViewHelper.updateContentPadding();
    }

    @Override // android.view.View
    public void setBackground(android.graphics.drawable.Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(android.graphics.drawable.Drawable drawable) {
        if (this.isParentCardViewDoneInitializing) {
            if (!this.cardViewHelper.isBackgroundOverwritten()) {
                android.util.Log.i(LOG_TAG, "Setting a custom background is not supported.");
                this.cardViewHelper.setBackgroundOverwritten(true);
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    void setBackgroundInternal(android.graphics.drawable.Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.checked;
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (this.checked != z) {
            toggle();
        }
    }

    public void setDragged(boolean z) {
        if (this.dragged != z) {
            this.dragged = z;
            refreshDrawableState();
            forceRippleRedrawIfNeeded();
            invalidate();
        }
    }

    public boolean isDragged() {
        return this.dragged;
    }

    public boolean isCheckable() {
        com.google.android.material.card.MaterialCardViewHelper materialCardViewHelper = this.cardViewHelper;
        return materialCardViewHelper != null && materialCardViewHelper.isCheckable();
    }

    public void setCheckable(boolean z) {
        this.cardViewHelper.setCheckable(z);
    }

    @Override // android.widget.Checkable
    public void toggle() {
        if (isCheckable() && isEnabled()) {
            this.checked = !this.checked;
            refreshDrawableState();
            forceRippleRedrawIfNeeded();
            this.cardViewHelper.setChecked(this.checked);
            com.google.android.material.card.MaterialCardView.OnCheckedChangeListener onCheckedChangeListener = this.onCheckedChangeListener;
            if (onCheckedChangeListener != null) {
                onCheckedChangeListener.onCheckedChanged(this, this.checked);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 3);
        if (isCheckable()) {
            mergeDrawableStates(iArrOnCreateDrawableState, CHECKABLE_STATE_SET);
        }
        if (isChecked()) {
            mergeDrawableStates(iArrOnCreateDrawableState, CHECKED_STATE_SET);
        }
        if (isDragged()) {
            mergeDrawableStates(iArrOnCreateDrawableState, DRAGGED_STATE_SET);
        }
        return iArrOnCreateDrawableState;
    }

    public void setOnCheckedChangeListener(com.google.android.material.card.MaterialCardView.OnCheckedChangeListener onCheckedChangeListener) {
        this.onCheckedChangeListener = onCheckedChangeListener;
    }

    public void setRippleColor(android.content.res.ColorStateList colorStateList) {
        this.cardViewHelper.setRippleColor(colorStateList);
    }

    public void setRippleColorResource(int i) {
        this.cardViewHelper.setRippleColor(androidx.appcompat.content.res.AppCompatResources.getColorStateList(getContext(), i));
    }

    public android.content.res.ColorStateList getRippleColor() {
        return this.cardViewHelper.getRippleColor();
    }

    public android.graphics.drawable.Drawable getCheckedIcon() {
        return this.cardViewHelper.getCheckedIcon();
    }

    public void setCheckedIconResource(int i) {
        this.cardViewHelper.setCheckedIcon(androidx.appcompat.content.res.AppCompatResources.getDrawable(getContext(), i));
    }

    public void setCheckedIcon(android.graphics.drawable.Drawable drawable) {
        this.cardViewHelper.setCheckedIcon(drawable);
    }

    public android.content.res.ColorStateList getCheckedIconTint() {
        return this.cardViewHelper.getCheckedIconTint();
    }

    public void setCheckedIconTint(android.content.res.ColorStateList colorStateList) {
        this.cardViewHelper.setCheckedIconTint(colorStateList);
    }

    public int getCheckedIconSize() {
        return this.cardViewHelper.getCheckedIconSize();
    }

    public void setCheckedIconSize(int i) {
        this.cardViewHelper.setCheckedIconSize(i);
    }

    public void setCheckedIconSizeResource(int i) {
        if (i != 0) {
            this.cardViewHelper.setCheckedIconSize(getResources().getDimensionPixelSize(i));
        }
    }

    public int getCheckedIconMargin() {
        return this.cardViewHelper.getCheckedIconMargin();
    }

    public void setCheckedIconMargin(int i) {
        this.cardViewHelper.setCheckedIconMargin(i);
    }

    public void setCheckedIconMarginResource(int i) {
        if (i != -1) {
            this.cardViewHelper.setCheckedIconMargin(getResources().getDimensionPixelSize(i));
        }
    }

    private android.graphics.RectF getBoundsAsRectF() {
        android.graphics.RectF rectF = new android.graphics.RectF();
        rectF.set(this.cardViewHelper.getBackground().getBounds());
        return rectF;
    }

    @Override // com.google.android.material.shape.Shapeable
    public void setShapeAppearanceModel(com.google.android.material.shape.ShapeAppearanceModel shapeAppearanceModel) {
        setClipToOutline(shapeAppearanceModel.isRoundRect(getBoundsAsRectF()));
        this.cardViewHelper.setShapeAppearanceModel(shapeAppearanceModel);
    }

    @Override // com.google.android.material.shape.Shapeable
    public com.google.android.material.shape.ShapeAppearanceModel getShapeAppearanceModel() {
        return this.cardViewHelper.getShapeAppearanceModel();
    }

    private void forceRippleRedrawIfNeeded() {
        if (android.os.Build.VERSION.SDK_INT > 26) {
            this.cardViewHelper.forceRippleRedraw();
        }
    }

    public int getCheckedIconGravity() {
        return this.cardViewHelper.getCheckedIconGravity();
    }

    public void setCheckedIconGravity(int i) {
        if (this.cardViewHelper.getCheckedIconGravity() != i) {
            this.cardViewHelper.setCheckedIconGravity(i);
        }
    }
}
