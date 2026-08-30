package com.google.android.material.badge;

/* JADX INFO: loaded from: classes5.dex */
public class BadgeDrawable extends android.graphics.drawable.Drawable implements com.google.android.material.internal.TextDrawableHelper.TextDrawableDelegate {
    public static final int BOTTOM_END = 8388693;
    public static final int BOTTOM_START = 8388691;
    static final java.lang.String DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX = "+";
    private static final int DEFAULT_STYLE = com.google.android.material.R.style.Widget_MaterialComponents_Badge;
    private static final int DEFAULT_THEME_ATTR = com.google.android.material.R.attr.badgeStyle;
    private static final int MAX_CIRCULAR_BADGE_NUMBER_COUNT = 9;
    public static final int TOP_END = 8388661;
    public static final int TOP_START = 8388659;
    private java.lang.ref.WeakReference<android.view.View> anchorViewRef;
    private final android.graphics.Rect badgeBounds;
    private float badgeCenterX;
    private float badgeCenterY;
    private final java.lang.ref.WeakReference<android.content.Context> contextRef;
    private float cornerRadius;
    private java.lang.ref.WeakReference<android.widget.FrameLayout> customBadgeParentRef;
    private float halfBadgeHeight;
    private float halfBadgeWidth;
    private int maxBadgeNumber;
    private final com.google.android.material.shape.MaterialShapeDrawable shapeDrawable;
    private final com.google.android.material.badge.BadgeState state;
    private final com.google.android.material.internal.TextDrawableHelper textDrawableHelper;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface BadgeGravity {
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter colorFilter) {
    }

    com.google.android.material.badge.BadgeState.State getSavedState() {
        return this.state.getOverridingState();
    }

    static com.google.android.material.badge.BadgeDrawable createFromSavedState(android.content.Context context, com.google.android.material.badge.BadgeState.State state) {
        return new com.google.android.material.badge.BadgeDrawable(context, 0, DEFAULT_THEME_ATTR, DEFAULT_STYLE, state);
    }

    public static com.google.android.material.badge.BadgeDrawable create(android.content.Context context) {
        return new com.google.android.material.badge.BadgeDrawable(context, 0, DEFAULT_THEME_ATTR, DEFAULT_STYLE, null);
    }

    public static com.google.android.material.badge.BadgeDrawable createFromResource(android.content.Context context, int i) {
        return new com.google.android.material.badge.BadgeDrawable(context, i, DEFAULT_THEME_ATTR, DEFAULT_STYLE, null);
    }

    public void setVisible(boolean z) {
        this.state.setVisible(z);
        onVisibilityUpdated();
    }

    private void onVisibilityUpdated() {
        boolean zIsVisible = this.state.isVisible();
        setVisible(zIsVisible, false);
        if (!com.google.android.material.badge.BadgeUtils.USE_COMPAT_PARENT || getCustomBadgeParent() == null || zIsVisible) {
            return;
        }
        ((android.view.ViewGroup) getCustomBadgeParent().getParent()).invalidate();
    }

    private void restoreState() {
        onMaxCharacterCountUpdated();
        onNumberUpdated();
        onAlphaUpdated();
        onBackgroundColorUpdated();
        onBadgeTextColorUpdated();
        onBadgeGravityUpdated();
        updateCenterAndBounds();
        onVisibilityUpdated();
    }

    private BadgeDrawable(android.content.Context context, int i, int i2, int i3, com.google.android.material.badge.BadgeState.State state) {
        this.contextRef = new java.lang.ref.WeakReference<>(context);
        com.google.android.material.internal.ThemeEnforcement.checkMaterialTheme(context);
        this.badgeBounds = new android.graphics.Rect();
        this.shapeDrawable = new com.google.android.material.shape.MaterialShapeDrawable();
        com.google.android.material.internal.TextDrawableHelper textDrawableHelper = new com.google.android.material.internal.TextDrawableHelper(this);
        this.textDrawableHelper = textDrawableHelper;
        textDrawableHelper.getTextPaint().setTextAlign(android.graphics.Paint.Align.CENTER);
        setTextAppearanceResource(com.google.android.material.R.style.TextAppearance_MaterialComponents_Badge);
        this.state = new com.google.android.material.badge.BadgeState(context, i, i2, i3, state);
        restoreState();
    }

    @java.lang.Deprecated
    public void updateBadgeCoordinates(android.view.View view, android.view.ViewGroup viewGroup) {
        if (!(viewGroup instanceof android.widget.FrameLayout)) {
            throw new java.lang.IllegalArgumentException("customBadgeParent must be a FrameLayout");
        }
        updateBadgeCoordinates(view, (android.widget.FrameLayout) viewGroup);
    }

    public void updateBadgeCoordinates(android.view.View view) {
        updateBadgeCoordinates(view, (android.widget.FrameLayout) null);
    }

    public void updateBadgeCoordinates(android.view.View view, android.widget.FrameLayout frameLayout) {
        this.anchorViewRef = new java.lang.ref.WeakReference<>(view);
        if (com.google.android.material.badge.BadgeUtils.USE_COMPAT_PARENT && frameLayout == null) {
            tryWrapAnchorInCompatParent(view);
        } else {
            this.customBadgeParentRef = new java.lang.ref.WeakReference<>(frameLayout);
        }
        if (!com.google.android.material.badge.BadgeUtils.USE_COMPAT_PARENT) {
            updateAnchorParentToNotClip(view);
        }
        updateCenterAndBounds();
        invalidateSelf();
    }

    public android.widget.FrameLayout getCustomBadgeParent() {
        java.lang.ref.WeakReference<android.widget.FrameLayout> weakReference = this.customBadgeParentRef;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    private void tryWrapAnchorInCompatParent(final android.view.View view) {
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) view.getParent();
        if (viewGroup == null || viewGroup.getId() != com.google.android.material.R.id.mtrl_anchor_parent) {
            java.lang.ref.WeakReference<android.widget.FrameLayout> weakReference = this.customBadgeParentRef;
            if (weakReference == null || weakReference.get() != viewGroup) {
                updateAnchorParentToNotClip(view);
                final android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(view.getContext());
                frameLayout.setId(com.google.android.material.R.id.mtrl_anchor_parent);
                frameLayout.setClipChildren(false);
                frameLayout.setClipToPadding(false);
                frameLayout.setLayoutParams(view.getLayoutParams());
                frameLayout.setMinimumWidth(view.getWidth());
                frameLayout.setMinimumHeight(view.getHeight());
                int iIndexOfChild = viewGroup.indexOfChild(view);
                viewGroup.removeViewAt(iIndexOfChild);
                view.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
                frameLayout.addView(view);
                viewGroup.addView(frameLayout, iIndexOfChild);
                this.customBadgeParentRef = new java.lang.ref.WeakReference<>(frameLayout);
                frameLayout.post(new java.lang.Runnable() { // from class: com.google.android.material.badge.BadgeDrawable.1
                    @Override // java.lang.Runnable
                    public void run() {
                        com.google.android.material.badge.BadgeDrawable.this.updateBadgeCoordinates(view, frameLayout);
                    }
                });
            }
        }
    }

    private static void updateAnchorParentToNotClip(android.view.View view) {
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
    }

    public int getBackgroundColor() {
        return this.shapeDrawable.getFillColor().getDefaultColor();
    }

    public void setBackgroundColor(int i) {
        this.state.setBackgroundColor(i);
        onBackgroundColorUpdated();
    }

    private void onBackgroundColorUpdated() {
        android.content.res.ColorStateList colorStateListValueOf = android.content.res.ColorStateList.valueOf(this.state.getBackgroundColor());
        if (this.shapeDrawable.getFillColor() != colorStateListValueOf) {
            this.shapeDrawable.setFillColor(colorStateListValueOf);
            invalidateSelf();
        }
    }

    public int getBadgeTextColor() {
        return this.textDrawableHelper.getTextPaint().getColor();
    }

    public void setBadgeTextColor(int i) {
        if (this.textDrawableHelper.getTextPaint().getColor() != i) {
            this.state.setBadgeTextColor(i);
            onBadgeTextColorUpdated();
        }
    }

    private void onBadgeTextColorUpdated() {
        this.textDrawableHelper.getTextPaint().setColor(this.state.getBadgeTextColor());
        invalidateSelf();
    }

    public java.util.Locale getBadgeNumberLocale() {
        return this.state.getNumberLocale();
    }

    public void setBadgeNumberLocale(java.util.Locale locale) {
        if (locale.equals(this.state.getNumberLocale())) {
            return;
        }
        this.state.setNumberLocale(locale);
        invalidateSelf();
    }

    public boolean hasNumber() {
        return this.state.hasNumber();
    }

    public int getNumber() {
        if (hasNumber()) {
            return this.state.getNumber();
        }
        return 0;
    }

    public void setNumber(int i) {
        int iMax = java.lang.Math.max(0, i);
        if (this.state.getNumber() != iMax) {
            this.state.setNumber(iMax);
            onNumberUpdated();
        }
    }

    public void clearNumber() {
        if (hasNumber()) {
            this.state.clearNumber();
            onNumberUpdated();
        }
    }

    private void onNumberUpdated() {
        this.textDrawableHelper.setTextWidthDirty(true);
        updateCenterAndBounds();
        invalidateSelf();
    }

    public int getMaxCharacterCount() {
        return this.state.getMaxCharacterCount();
    }

    public void setMaxCharacterCount(int i) {
        if (this.state.getMaxCharacterCount() != i) {
            this.state.setMaxCharacterCount(i);
            onMaxCharacterCountUpdated();
        }
    }

    private void onMaxCharacterCountUpdated() {
        updateMaxBadgeNumber();
        this.textDrawableHelper.setTextWidthDirty(true);
        updateCenterAndBounds();
        invalidateSelf();
    }

    public int getBadgeGravity() {
        return this.state.getBadgeGravity();
    }

    public void setBadgeGravity(int i) {
        if (this.state.getBadgeGravity() != i) {
            this.state.setBadgeGravity(i);
            onBadgeGravityUpdated();
        }
    }

    private void onBadgeGravityUpdated() {
        java.lang.ref.WeakReference<android.view.View> weakReference = this.anchorViewRef;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        android.view.View view = this.anchorViewRef.get();
        java.lang.ref.WeakReference<android.widget.FrameLayout> weakReference2 = this.customBadgeParentRef;
        updateBadgeCoordinates(view, weakReference2 != null ? weakReference2.get() : null);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.state.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.state.setAlpha(i);
        onAlphaUpdated();
    }

    private void onAlphaUpdated() {
        this.textDrawableHelper.getTextPaint().setAlpha(getAlpha());
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.badgeBounds.height();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.badgeBounds.width();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas canvas) {
        if (getBounds().isEmpty() || getAlpha() == 0 || !isVisible()) {
            return;
        }
        this.shapeDrawable.draw(canvas);
        if (hasNumber()) {
            drawText(canvas);
        }
    }

    @Override // com.google.android.material.internal.TextDrawableHelper.TextDrawableDelegate
    public void onTextSizeChange() {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable, com.google.android.material.internal.TextDrawableHelper.TextDrawableDelegate
    public boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    public void setContentDescriptionNumberless(java.lang.CharSequence charSequence) {
        this.state.setContentDescriptionNumberless(charSequence);
    }

    public void setContentDescriptionQuantityStringsResource(int i) {
        this.state.setContentDescriptionQuantityStringsResource(i);
    }

    public void setContentDescriptionExceedsMaxBadgeNumberStringResource(int i) {
        this.state.setContentDescriptionExceedsMaxBadgeNumberStringResource(i);
    }

    public java.lang.CharSequence getContentDescription() {
        android.content.Context context;
        if (!isVisible()) {
            return null;
        }
        if (hasNumber()) {
            if (this.state.getContentDescriptionQuantityStrings() == 0 || (context = this.contextRef.get()) == null) {
                return null;
            }
            if (getNumber() <= this.maxBadgeNumber) {
                return context.getResources().getQuantityString(this.state.getContentDescriptionQuantityStrings(), getNumber(), java.lang.Integer.valueOf(getNumber()));
            }
            return context.getString(this.state.getContentDescriptionExceedsMaxBadgeNumberStringResource(), java.lang.Integer.valueOf(this.maxBadgeNumber));
        }
        return this.state.getContentDescriptionNumberless();
    }

    public void setHorizontalOffset(int i) {
        setHorizontalOffsetWithoutText(i);
        setHorizontalOffsetWithText(i);
    }

    public int getHorizontalOffset() {
        return this.state.getHorizontalOffsetWithoutText();
    }

    public void setHorizontalOffsetWithoutText(int i) {
        this.state.setHorizontalOffsetWithoutText(i);
        updateCenterAndBounds();
    }

    public int getHorizontalOffsetWithoutText() {
        return this.state.getHorizontalOffsetWithoutText();
    }

    public void setHorizontalOffsetWithText(int i) {
        this.state.setHorizontalOffsetWithText(i);
        updateCenterAndBounds();
    }

    public int getHorizontalOffsetWithText() {
        return this.state.getHorizontalOffsetWithText();
    }

    void setAdditionalHorizontalOffset(int i) {
        this.state.setAdditionalHorizontalOffset(i);
        updateCenterAndBounds();
    }

    int getAdditionalHorizontalOffset() {
        return this.state.getAdditionalHorizontalOffset();
    }

    public void setVerticalOffset(int i) {
        setVerticalOffsetWithoutText(i);
        setVerticalOffsetWithText(i);
    }

    public int getVerticalOffset() {
        return this.state.getVerticalOffsetWithoutText();
    }

    public void setVerticalOffsetWithoutText(int i) {
        this.state.setVerticalOffsetWithoutText(i);
        updateCenterAndBounds();
    }

    public int getVerticalOffsetWithoutText() {
        return this.state.getVerticalOffsetWithoutText();
    }

    public void setVerticalOffsetWithText(int i) {
        this.state.setVerticalOffsetWithText(i);
        updateCenterAndBounds();
    }

    public int getVerticalOffsetWithText() {
        return this.state.getVerticalOffsetWithText();
    }

    void setAdditionalVerticalOffset(int i) {
        this.state.setAdditionalVerticalOffset(i);
        updateCenterAndBounds();
    }

    int getAdditionalVerticalOffset() {
        return this.state.getAdditionalVerticalOffset();
    }

    private void setTextAppearanceResource(int i) {
        android.content.Context context = this.contextRef.get();
        if (context == null) {
            return;
        }
        setTextAppearance(new com.google.android.material.resources.TextAppearance(context, i));
    }

    private void setTextAppearance(com.google.android.material.resources.TextAppearance textAppearance) {
        android.content.Context context;
        if (this.textDrawableHelper.getTextAppearance() == textAppearance || (context = this.contextRef.get()) == null) {
            return;
        }
        this.textDrawableHelper.setTextAppearance(textAppearance, context);
        updateCenterAndBounds();
    }

    private void updateCenterAndBounds() {
        android.content.Context context = this.contextRef.get();
        java.lang.ref.WeakReference<android.view.View> weakReference = this.anchorViewRef;
        android.view.View view = weakReference != null ? weakReference.get() : null;
        if (context == null || view == null) {
            return;
        }
        android.graphics.Rect rect = new android.graphics.Rect();
        rect.set(this.badgeBounds);
        android.graphics.Rect rect2 = new android.graphics.Rect();
        view.getDrawingRect(rect2);
        java.lang.ref.WeakReference<android.widget.FrameLayout> weakReference2 = this.customBadgeParentRef;
        android.widget.FrameLayout frameLayout = weakReference2 != null ? weakReference2.get() : null;
        if (frameLayout != null || com.google.android.material.badge.BadgeUtils.USE_COMPAT_PARENT) {
            if (frameLayout == null) {
                frameLayout = (android.view.ViewGroup) view.getParent();
            }
            frameLayout.offsetDescendantRectToMyCoords(view, rect2);
        }
        calculateCenterAndBounds(context, rect2, view);
        com.google.android.material.badge.BadgeUtils.updateBadgeBounds(this.badgeBounds, this.badgeCenterX, this.badgeCenterY, this.halfBadgeWidth, this.halfBadgeHeight);
        this.shapeDrawable.setCornerSize(this.cornerRadius);
        if (rect.equals(this.badgeBounds)) {
            return;
        }
        this.shapeDrawable.setBounds(this.badgeBounds);
    }

    private int getTotalVerticalOffsetForState() {
        return (hasNumber() ? this.state.getVerticalOffsetWithText() : this.state.getVerticalOffsetWithoutText()) + this.state.getAdditionalVerticalOffset();
    }

    private int getTotalHorizontalOffsetForState() {
        return (hasNumber() ? this.state.getHorizontalOffsetWithText() : this.state.getHorizontalOffsetWithoutText()) + this.state.getAdditionalHorizontalOffset();
    }

    private void calculateCenterAndBounds(android.content.Context context, android.graphics.Rect rect, android.view.View view) {
        int i;
        float f;
        float f2;
        int totalVerticalOffsetForState = getTotalVerticalOffsetForState();
        int badgeGravity = this.state.getBadgeGravity();
        if (badgeGravity == 8388691 || badgeGravity == 8388693) {
            this.badgeCenterY = rect.bottom - totalVerticalOffsetForState;
        } else {
            this.badgeCenterY = rect.top + totalVerticalOffsetForState;
        }
        if (getNumber() <= 9) {
            float f3 = !hasNumber() ? this.state.badgeRadius : this.state.badgeWithTextRadius;
            this.cornerRadius = f3;
            this.halfBadgeHeight = f3;
            this.halfBadgeWidth = f3;
        } else {
            float f4 = this.state.badgeWithTextRadius;
            this.cornerRadius = f4;
            this.halfBadgeHeight = f4;
            this.halfBadgeWidth = (this.textDrawableHelper.getTextWidth(getBadgeText()) / 2.0f) + this.state.badgeWidePadding;
        }
        android.content.res.Resources resources = context.getResources();
        if (hasNumber()) {
            i = com.google.android.material.R.dimen.mtrl_badge_text_horizontal_edge_offset;
        } else {
            i = com.google.android.material.R.dimen.mtrl_badge_horizontal_edge_offset;
        }
        int dimensionPixelSize = resources.getDimensionPixelSize(i);
        int totalHorizontalOffsetForState = getTotalHorizontalOffsetForState();
        int badgeGravity2 = this.state.getBadgeGravity();
        if (badgeGravity2 == 8388659 || badgeGravity2 == 8388691) {
            if (androidx.core.view.ViewCompat.getLayoutDirection(view) == 0) {
                f = (rect.left - this.halfBadgeWidth) + dimensionPixelSize + totalHorizontalOffsetForState;
            } else {
                f = ((rect.right + this.halfBadgeWidth) - dimensionPixelSize) - totalHorizontalOffsetForState;
            }
            this.badgeCenterX = f;
            return;
        }
        if (androidx.core.view.ViewCompat.getLayoutDirection(view) == 0) {
            f2 = ((rect.right + this.halfBadgeWidth) - dimensionPixelSize) - totalHorizontalOffsetForState;
        } else {
            f2 = (rect.left - this.halfBadgeWidth) + dimensionPixelSize + totalHorizontalOffsetForState;
        }
        this.badgeCenterX = f2;
    }

    private void drawText(android.graphics.Canvas canvas) {
        android.graphics.Rect rect = new android.graphics.Rect();
        java.lang.String badgeText = getBadgeText();
        this.textDrawableHelper.getTextPaint().getTextBounds(badgeText, 0, badgeText.length(), rect);
        canvas.drawText(badgeText, this.badgeCenterX, this.badgeCenterY + (rect.height() / 2), this.textDrawableHelper.getTextPaint());
    }

    private java.lang.String getBadgeText() {
        if (getNumber() <= this.maxBadgeNumber) {
            return java.text.NumberFormat.getInstance(this.state.getNumberLocale()).format(getNumber());
        }
        android.content.Context context = this.contextRef.get();
        return context == null ? "" : java.lang.String.format(this.state.getNumberLocale(), context.getString(com.google.android.material.R.string.mtrl_exceed_max_badge_number_suffix), java.lang.Integer.valueOf(this.maxBadgeNumber), DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX);
    }

    private void updateMaxBadgeNumber() {
        this.maxBadgeNumber = ((int) java.lang.Math.pow(10.0d, ((double) getMaxCharacterCount()) - 1.0d)) - 1;
    }
}
