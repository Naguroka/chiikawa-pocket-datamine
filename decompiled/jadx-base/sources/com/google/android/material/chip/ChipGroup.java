package com.google.android.material.chip;

/* JADX INFO: loaded from: classes5.dex */
public class ChipGroup extends com.google.android.material.internal.FlowLayout {
    private static final int DEF_STYLE_RES = com.google.android.material.R.style.Widget_MaterialComponents_ChipGroup;
    private final com.google.android.material.internal.CheckableGroup<com.google.android.material.chip.Chip> checkableGroup;
    private int chipSpacingHorizontal;
    private int chipSpacingVertical;
    private final int defaultCheckedId;
    private com.google.android.material.chip.ChipGroup.OnCheckedStateChangeListener onCheckedStateChangeListener;
    private final com.google.android.material.chip.ChipGroup.PassThroughHierarchyChangeListener passThroughListener;

    @java.lang.Deprecated
    public interface OnCheckedChangeListener {
        void onCheckedChanged(com.google.android.material.chip.ChipGroup chipGroup, int i);
    }

    public interface OnCheckedStateChangeListener {
        void onCheckedChanged(com.google.android.material.chip.ChipGroup chipGroup, java.util.List<java.lang.Integer> list);
    }

    public static class LayoutParams extends android.view.ViewGroup.MarginLayoutParams {
        public LayoutParams(android.content.Context context, android.util.AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(android.view.ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    public ChipGroup(android.content.Context context) {
        this(context, null);
    }

    public ChipGroup(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.material.R.attr.chipGroupStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ChipGroup(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        int i2 = DEF_STYLE_RES;
        super(com.google.android.material.theme.overlay.MaterialThemeOverlay.wrap(context, attributeSet, i, i2), attributeSet, i);
        com.google.android.material.internal.CheckableGroup<com.google.android.material.chip.Chip> checkableGroup = new com.google.android.material.internal.CheckableGroup<>();
        this.checkableGroup = checkableGroup;
        com.google.android.material.chip.ChipGroup.PassThroughHierarchyChangeListener passThroughHierarchyChangeListener = new com.google.android.material.chip.ChipGroup.PassThroughHierarchyChangeListener();
        this.passThroughListener = passThroughHierarchyChangeListener;
        android.content.res.TypedArray typedArrayObtainStyledAttributes = com.google.android.material.internal.ThemeEnforcement.obtainStyledAttributes(getContext(), attributeSet, com.google.android.material.R.styleable.ChipGroup, i, i2, new int[0]);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(com.google.android.material.R.styleable.ChipGroup_chipSpacing, 0);
        setChipSpacingHorizontal(typedArrayObtainStyledAttributes.getDimensionPixelOffset(com.google.android.material.R.styleable.ChipGroup_chipSpacingHorizontal, dimensionPixelOffset));
        setChipSpacingVertical(typedArrayObtainStyledAttributes.getDimensionPixelOffset(com.google.android.material.R.styleable.ChipGroup_chipSpacingVertical, dimensionPixelOffset));
        setSingleLine(typedArrayObtainStyledAttributes.getBoolean(com.google.android.material.R.styleable.ChipGroup_singleLine, false));
        setSingleSelection(typedArrayObtainStyledAttributes.getBoolean(com.google.android.material.R.styleable.ChipGroup_singleSelection, false));
        setSelectionRequired(typedArrayObtainStyledAttributes.getBoolean(com.google.android.material.R.styleable.ChipGroup_selectionRequired, false));
        this.defaultCheckedId = typedArrayObtainStyledAttributes.getResourceId(com.google.android.material.R.styleable.ChipGroup_checkedChip, -1);
        typedArrayObtainStyledAttributes.recycle();
        checkableGroup.setOnCheckedStateChangeListener(new com.google.android.material.internal.CheckableGroup.OnCheckedStateChangeListener() { // from class: com.google.android.material.chip.ChipGroup.1
            @Override // com.google.android.material.internal.CheckableGroup.OnCheckedStateChangeListener
            public void onCheckedStateChanged(java.util.Set<java.lang.Integer> set) {
                if (com.google.android.material.chip.ChipGroup.this.onCheckedStateChangeListener != null) {
                    com.google.android.material.chip.ChipGroup.OnCheckedStateChangeListener onCheckedStateChangeListener = com.google.android.material.chip.ChipGroup.this.onCheckedStateChangeListener;
                    com.google.android.material.chip.ChipGroup chipGroup = com.google.android.material.chip.ChipGroup.this;
                    onCheckedStateChangeListener.onCheckedChanged(chipGroup, chipGroup.checkableGroup.getCheckedIdsSortedByChildOrder(com.google.android.material.chip.ChipGroup.this));
                }
            }
        });
        super.setOnHierarchyChangeListener(passThroughHierarchyChangeListener);
        androidx.core.view.ViewCompat.setImportantForAccessibility(this, 1);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        androidx.core.view.accessibility.AccessibilityNodeInfoCompat.wrap(accessibilityNodeInfo).setCollectionInfo(androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionInfoCompat.obtain(getRowCount(), isSingleLine() ? getVisibleChipCount() : -1, false, isSingleSelection() ? 1 : 2));
    }

    @Override // android.view.ViewGroup
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet attributeSet) {
        return new com.google.android.material.chip.ChipGroup.LayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return new com.google.android.material.chip.ChipGroup.LayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup
    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new com.google.android.material.chip.ChipGroup.LayoutParams(-2, -2);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof com.google.android.material.chip.ChipGroup.LayoutParams);
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(android.view.ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.passThroughListener.onHierarchyChangeListener = onHierarchyChangeListener;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        int i = this.defaultCheckedId;
        if (i != -1) {
            this.checkableGroup.check(i);
        }
    }

    @java.lang.Deprecated
    public void setDividerDrawableHorizontal(android.graphics.drawable.Drawable drawable) {
        throw new java.lang.UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @java.lang.Deprecated
    public void setDividerDrawableVertical(android.graphics.drawable.Drawable drawable) {
        throw new java.lang.UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @java.lang.Deprecated
    public void setShowDividerHorizontal(int i) {
        throw new java.lang.UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @java.lang.Deprecated
    public void setShowDividerVertical(int i) {
        throw new java.lang.UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @java.lang.Deprecated
    public void setFlexWrap(int i) {
        throw new java.lang.UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    public void check(int i) {
        this.checkableGroup.check(i);
    }

    public int getCheckedChipId() {
        return this.checkableGroup.getSingleCheckedId();
    }

    public java.util.List<java.lang.Integer> getCheckedChipIds() {
        return this.checkableGroup.getCheckedIdsSortedByChildOrder(this);
    }

    public void clearCheck() {
        this.checkableGroup.clearCheck();
    }

    @java.lang.Deprecated
    public void setOnCheckedChangeListener(final com.google.android.material.chip.ChipGroup.OnCheckedChangeListener onCheckedChangeListener) {
        if (onCheckedChangeListener == null) {
            setOnCheckedStateChangeListener(null);
        } else {
            setOnCheckedStateChangeListener(new com.google.android.material.chip.ChipGroup.OnCheckedStateChangeListener() { // from class: com.google.android.material.chip.ChipGroup.2
                @Override // com.google.android.material.chip.ChipGroup.OnCheckedStateChangeListener
                public void onCheckedChanged(com.google.android.material.chip.ChipGroup chipGroup, java.util.List<java.lang.Integer> list) {
                    if (com.google.android.material.chip.ChipGroup.this.checkableGroup.isSingleSelection()) {
                        onCheckedChangeListener.onCheckedChanged(chipGroup, com.google.android.material.chip.ChipGroup.this.getCheckedChipId());
                    }
                }
            });
        }
    }

    public void setOnCheckedStateChangeListener(com.google.android.material.chip.ChipGroup.OnCheckedStateChangeListener onCheckedStateChangeListener) {
        this.onCheckedStateChangeListener = onCheckedStateChangeListener;
    }

    private int getVisibleChipCount() {
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if ((getChildAt(i2) instanceof com.google.android.material.chip.Chip) && isChildVisible(i2)) {
                i++;
            }
        }
        return i;
    }

    int getIndexOfChip(android.view.View view) {
        if (!(view instanceof com.google.android.material.chip.Chip)) {
            return -1;
        }
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            android.view.View childAt = getChildAt(i2);
            if ((childAt instanceof com.google.android.material.chip.Chip) && isChildVisible(i2)) {
                if (((com.google.android.material.chip.Chip) childAt) == view) {
                    return i;
                }
                i++;
            }
        }
        return -1;
    }

    private boolean isChildVisible(int i) {
        return getChildAt(i).getVisibility() == 0;
    }

    public void setChipSpacing(int i) {
        setChipSpacingHorizontal(i);
        setChipSpacingVertical(i);
    }

    public void setChipSpacingResource(int i) {
        setChipSpacing(getResources().getDimensionPixelOffset(i));
    }

    public int getChipSpacingHorizontal() {
        return this.chipSpacingHorizontal;
    }

    public void setChipSpacingHorizontal(int i) {
        if (this.chipSpacingHorizontal != i) {
            this.chipSpacingHorizontal = i;
            setItemSpacing(i);
            requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(int i) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i));
    }

    public int getChipSpacingVertical() {
        return this.chipSpacingVertical;
    }

    public void setChipSpacingVertical(int i) {
        if (this.chipSpacingVertical != i) {
            this.chipSpacingVertical = i;
            setLineSpacing(i);
            requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(int i) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i));
    }

    @Override // com.google.android.material.internal.FlowLayout
    public boolean isSingleLine() {
        return super.isSingleLine();
    }

    @Override // com.google.android.material.internal.FlowLayout
    public void setSingleLine(boolean z) {
        super.setSingleLine(z);
    }

    public void setSingleLine(int i) {
        setSingleLine(getResources().getBoolean(i));
    }

    public boolean isSingleSelection() {
        return this.checkableGroup.isSingleSelection();
    }

    public void setSingleSelection(boolean z) {
        this.checkableGroup.setSingleSelection(z);
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }

    public void setSelectionRequired(boolean z) {
        this.checkableGroup.setSelectionRequired(z);
    }

    public boolean isSelectionRequired() {
        return this.checkableGroup.isSelectionRequired();
    }

    private class PassThroughHierarchyChangeListener implements android.view.ViewGroup.OnHierarchyChangeListener {
        private android.view.ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener;

        private PassThroughHierarchyChangeListener() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(android.view.View view, android.view.View view2) {
            if (view == com.google.android.material.chip.ChipGroup.this && (view2 instanceof com.google.android.material.chip.Chip)) {
                if (view2.getId() == -1) {
                    view2.setId(androidx.core.view.ViewCompat.generateViewId());
                }
                com.google.android.material.chip.ChipGroup.this.checkableGroup.addCheckable((com.google.android.material.chip.Chip) view2);
            }
            android.view.ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.onHierarchyChangeListener;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(android.view.View view, android.view.View view2) {
            com.google.android.material.chip.ChipGroup chipGroup = com.google.android.material.chip.ChipGroup.this;
            if (view == chipGroup && (view2 instanceof com.google.android.material.chip.Chip)) {
                chipGroup.checkableGroup.removeCheckable((com.google.android.material.chip.Chip) view2);
            }
            android.view.ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.onHierarchyChangeListener;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }
}
