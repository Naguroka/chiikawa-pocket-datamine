package com.google.android.material.button;

/* JADX INFO: loaded from: classes5.dex */
public class MaterialButtonToggleGroup extends android.widget.LinearLayout {
    private static final int DEF_STYLE_RES = com.google.android.material.R.style.Widget_MaterialComponents_MaterialButtonToggleGroup;
    private static final java.lang.String LOG_TAG = "MaterialButtonToggleGroup";
    private java.util.Set<java.lang.Integer> checkedIds;
    private java.lang.Integer[] childOrder;
    private final java.util.Comparator<com.google.android.material.button.MaterialButton> childOrderComparator;
    private final int defaultCheckId;
    private final java.util.LinkedHashSet<com.google.android.material.button.MaterialButtonToggleGroup.OnButtonCheckedListener> onButtonCheckedListeners;
    private final java.util.List<com.google.android.material.button.MaterialButtonToggleGroup.CornerData> originalCornerData;
    private final com.google.android.material.button.MaterialButtonToggleGroup.PressedStateTracker pressedStateTracker;
    private boolean selectionRequired;
    private boolean singleSelection;
    private boolean skipCheckedStateTracker;

    public interface OnButtonCheckedListener {
        void onButtonChecked(com.google.android.material.button.MaterialButtonToggleGroup materialButtonToggleGroup, int i, boolean z);
    }

    public MaterialButtonToggleGroup(android.content.Context context) {
        this(context, null);
    }

    public MaterialButtonToggleGroup(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.material.R.attr.materialButtonToggleGroupStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialButtonToggleGroup(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        int i2 = DEF_STYLE_RES;
        super(com.google.android.material.theme.overlay.MaterialThemeOverlay.wrap(context, attributeSet, i, i2), attributeSet, i);
        this.originalCornerData = new java.util.ArrayList();
        this.pressedStateTracker = new com.google.android.material.button.MaterialButtonToggleGroup.PressedStateTracker();
        this.onButtonCheckedListeners = new java.util.LinkedHashSet<>();
        this.childOrderComparator = new java.util.Comparator<com.google.android.material.button.MaterialButton>() { // from class: com.google.android.material.button.MaterialButtonToggleGroup.1
            @Override // java.util.Comparator
            public int compare(com.google.android.material.button.MaterialButton materialButton, com.google.android.material.button.MaterialButton materialButton2) {
                int iCompareTo = java.lang.Boolean.valueOf(materialButton.isChecked()).compareTo(java.lang.Boolean.valueOf(materialButton2.isChecked()));
                if (iCompareTo != 0) {
                    return iCompareTo;
                }
                int iCompareTo2 = java.lang.Boolean.valueOf(materialButton.isPressed()).compareTo(java.lang.Boolean.valueOf(materialButton2.isPressed()));
                return iCompareTo2 != 0 ? iCompareTo2 : java.lang.Integer.valueOf(com.google.android.material.button.MaterialButtonToggleGroup.this.indexOfChild(materialButton)).compareTo(java.lang.Integer.valueOf(com.google.android.material.button.MaterialButtonToggleGroup.this.indexOfChild(materialButton2)));
            }
        };
        this.skipCheckedStateTracker = false;
        this.checkedIds = new java.util.HashSet();
        android.content.res.TypedArray typedArrayObtainStyledAttributes = com.google.android.material.internal.ThemeEnforcement.obtainStyledAttributes(getContext(), attributeSet, com.google.android.material.R.styleable.MaterialButtonToggleGroup, i, i2, new int[0]);
        setSingleSelection(typedArrayObtainStyledAttributes.getBoolean(com.google.android.material.R.styleable.MaterialButtonToggleGroup_singleSelection, false));
        this.defaultCheckId = typedArrayObtainStyledAttributes.getResourceId(com.google.android.material.R.styleable.MaterialButtonToggleGroup_checkedButton, -1);
        this.selectionRequired = typedArrayObtainStyledAttributes.getBoolean(com.google.android.material.R.styleable.MaterialButtonToggleGroup_selectionRequired, false);
        setChildrenDrawingOrderEnabled(true);
        typedArrayObtainStyledAttributes.recycle();
        androidx.core.view.ViewCompat.setImportantForAccessibility(this, 1);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        int i = this.defaultCheckId;
        if (i != -1) {
            updateCheckedIds(java.util.Collections.singleton(java.lang.Integer.valueOf(i)));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(android.graphics.Canvas canvas) {
        updateChildOrder();
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View view, int i, android.view.ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof com.google.android.material.button.MaterialButton)) {
            android.util.Log.e(LOG_TAG, "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i, layoutParams);
        com.google.android.material.button.MaterialButton materialButton = (com.google.android.material.button.MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        setupButtonChild(materialButton);
        checkInternal(materialButton.getId(), materialButton.isChecked());
        com.google.android.material.shape.ShapeAppearanceModel shapeAppearanceModel = materialButton.getShapeAppearanceModel();
        this.originalCornerData.add(new com.google.android.material.button.MaterialButtonToggleGroup.CornerData(shapeAppearanceModel.getTopLeftCornerSize(), shapeAppearanceModel.getBottomLeftCornerSize(), shapeAppearanceModel.getTopRightCornerSize(), shapeAppearanceModel.getBottomRightCornerSize()));
        androidx.core.view.ViewCompat.setAccessibilityDelegate(materialButton, new androidx.core.view.AccessibilityDelegateCompat() { // from class: com.google.android.material.button.MaterialButtonToggleGroup.2
            @Override // androidx.core.view.AccessibilityDelegateCompat
            public void onInitializeAccessibilityNodeInfo(android.view.View view2, androidx.core.view.accessibility.AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                super.onInitializeAccessibilityNodeInfo(view2, accessibilityNodeInfoCompat);
                accessibilityNodeInfoCompat.setCollectionItemInfo(androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(0, 1, com.google.android.material.button.MaterialButtonToggleGroup.this.getIndexWithinVisibleButtons(view2), 1, false, ((com.google.android.material.button.MaterialButton) view2).isChecked()));
            }
        });
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(android.view.View view) {
        super.onViewRemoved(view);
        if (view instanceof com.google.android.material.button.MaterialButton) {
            ((com.google.android.material.button.MaterialButton) view).setOnPressedChangeListenerInternal(null);
        }
        int iIndexOfChild = indexOfChild(view);
        if (iIndexOfChild >= 0) {
            this.originalCornerData.remove(iIndexOfChild);
        }
        updateChildShapes();
        adjustChildMarginsAndUpdateLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        updateChildShapes();
        adjustChildMarginsAndUpdateLayout();
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        androidx.core.view.accessibility.AccessibilityNodeInfoCompat.wrap(accessibilityNodeInfo).setCollectionInfo(androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionInfoCompat.obtain(1, getVisibleButtonCount(), false, isSingleSelection() ? 1 : 2));
    }

    public void check(int i) {
        checkInternal(i, true);
    }

    public void uncheck(int i) {
        checkInternal(i, false);
    }

    public void clearChecked() {
        updateCheckedIds(new java.util.HashSet());
    }

    public int getCheckedButtonId() {
        if (!this.singleSelection || this.checkedIds.isEmpty()) {
            return -1;
        }
        return this.checkedIds.iterator().next().intValue();
    }

    public java.util.List<java.lang.Integer> getCheckedButtonIds() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            int id = getChildButton(i).getId();
            if (this.checkedIds.contains(java.lang.Integer.valueOf(id))) {
                arrayList.add(java.lang.Integer.valueOf(id));
            }
        }
        return arrayList;
    }

    public void addOnButtonCheckedListener(com.google.android.material.button.MaterialButtonToggleGroup.OnButtonCheckedListener onButtonCheckedListener) {
        this.onButtonCheckedListeners.add(onButtonCheckedListener);
    }

    public void removeOnButtonCheckedListener(com.google.android.material.button.MaterialButtonToggleGroup.OnButtonCheckedListener onButtonCheckedListener) {
        this.onButtonCheckedListeners.remove(onButtonCheckedListener);
    }

    public void clearOnButtonCheckedListeners() {
        this.onButtonCheckedListeners.clear();
    }

    public boolean isSingleSelection() {
        return this.singleSelection;
    }

    public void setSingleSelection(boolean z) {
        if (this.singleSelection != z) {
            this.singleSelection = z;
            clearChecked();
        }
    }

    public void setSelectionRequired(boolean z) {
        this.selectionRequired = z;
    }

    public boolean isSelectionRequired() {
        return this.selectionRequired;
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }

    private void setCheckedStateForView(int i, boolean z) {
        android.view.View viewFindViewById = findViewById(i);
        if (viewFindViewById instanceof com.google.android.material.button.MaterialButton) {
            this.skipCheckedStateTracker = true;
            ((com.google.android.material.button.MaterialButton) viewFindViewById).setChecked(z);
            this.skipCheckedStateTracker = false;
        }
    }

    private void adjustChildMarginsAndUpdateLayout() {
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i = firstVisibleChildIndex + 1; i < getChildCount(); i++) {
            com.google.android.material.button.MaterialButton childButton = getChildButton(i);
            int iMin = java.lang.Math.min(childButton.getStrokeWidth(), getChildButton(i - 1).getStrokeWidth());
            android.widget.LinearLayout.LayoutParams layoutParamsBuildLayoutParams = buildLayoutParams(childButton);
            if (getOrientation() == 0) {
                androidx.core.view.MarginLayoutParamsCompat.setMarginEnd(layoutParamsBuildLayoutParams, 0);
                androidx.core.view.MarginLayoutParamsCompat.setMarginStart(layoutParamsBuildLayoutParams, -iMin);
                layoutParamsBuildLayoutParams.topMargin = 0;
            } else {
                layoutParamsBuildLayoutParams.bottomMargin = 0;
                layoutParamsBuildLayoutParams.topMargin = -iMin;
                androidx.core.view.MarginLayoutParamsCompat.setMarginStart(layoutParamsBuildLayoutParams, 0);
            }
            childButton.setLayoutParams(layoutParamsBuildLayoutParams);
        }
        resetChildMargins(firstVisibleChildIndex);
    }

    private com.google.android.material.button.MaterialButton getChildButton(int i) {
        return (com.google.android.material.button.MaterialButton) getChildAt(i);
    }

    private void resetChildMargins(int i) {
        if (getChildCount() == 0 || i == -1) {
            return;
        }
        android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) getChildButton(i).getLayoutParams();
        if (getOrientation() == 1) {
            layoutParams.topMargin = 0;
            layoutParams.bottomMargin = 0;
        } else {
            androidx.core.view.MarginLayoutParamsCompat.setMarginEnd(layoutParams, 0);
            androidx.core.view.MarginLayoutParamsCompat.setMarginStart(layoutParams, 0);
            layoutParams.leftMargin = 0;
            layoutParams.rightMargin = 0;
        }
    }

    void updateChildShapes() {
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i = 0; i < childCount; i++) {
            com.google.android.material.button.MaterialButton childButton = getChildButton(i);
            if (childButton.getVisibility() != 8) {
                com.google.android.material.shape.ShapeAppearanceModel.Builder builder = childButton.getShapeAppearanceModel().toBuilder();
                updateBuilderWithCornerData(builder, getNewCornerData(i, firstVisibleChildIndex, lastVisibleChildIndex));
                childButton.setShapeAppearanceModel(builder.build());
            }
        }
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (isChildVisible(i)) {
                return i;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (isChildVisible(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private boolean isChildVisible(int i) {
        return getChildAt(i).getVisibility() != 8;
    }

    private int getVisibleButtonCount() {
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if ((getChildAt(i2) instanceof com.google.android.material.button.MaterialButton) && isChildVisible(i2)) {
                i++;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getIndexWithinVisibleButtons(android.view.View view) {
        if (!(view instanceof com.google.android.material.button.MaterialButton)) {
            return -1;
        }
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if (getChildAt(i2) == view) {
                return i;
            }
            if ((getChildAt(i2) instanceof com.google.android.material.button.MaterialButton) && isChildVisible(i2)) {
                i++;
            }
        }
        return -1;
    }

    private com.google.android.material.button.MaterialButtonToggleGroup.CornerData getNewCornerData(int i, int i2, int i3) {
        com.google.android.material.button.MaterialButtonToggleGroup.CornerData cornerData = this.originalCornerData.get(i);
        if (i2 == i3) {
            return cornerData;
        }
        boolean z = getOrientation() == 0;
        if (i == i2) {
            return z ? com.google.android.material.button.MaterialButtonToggleGroup.CornerData.start(cornerData, this) : com.google.android.material.button.MaterialButtonToggleGroup.CornerData.top(cornerData);
        }
        if (i == i3) {
            return z ? com.google.android.material.button.MaterialButtonToggleGroup.CornerData.end(cornerData, this) : com.google.android.material.button.MaterialButtonToggleGroup.CornerData.bottom(cornerData);
        }
        return null;
    }

    private static void updateBuilderWithCornerData(com.google.android.material.shape.ShapeAppearanceModel.Builder builder, com.google.android.material.button.MaterialButtonToggleGroup.CornerData cornerData) {
        if (cornerData == null) {
            builder.setAllCornerSizes(0.0f);
        } else {
            builder.setTopLeftCornerSize(cornerData.topLeft).setBottomLeftCornerSize(cornerData.bottomLeft).setTopRightCornerSize(cornerData.topRight).setBottomRightCornerSize(cornerData.bottomRight);
        }
    }

    private void checkInternal(int i, boolean z) {
        if (i == -1) {
            android.util.Log.e(LOG_TAG, "Button ID is not valid: " + i);
            return;
        }
        java.util.HashSet hashSet = new java.util.HashSet(this.checkedIds);
        if (z && !hashSet.contains(java.lang.Integer.valueOf(i))) {
            if (this.singleSelection && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(java.lang.Integer.valueOf(i));
        } else {
            if (z || !hashSet.contains(java.lang.Integer.valueOf(i))) {
                return;
            }
            if (!this.selectionRequired || hashSet.size() > 1) {
                hashSet.remove(java.lang.Integer.valueOf(i));
            }
        }
        updateCheckedIds(hashSet);
    }

    private void updateCheckedIds(java.util.Set<java.lang.Integer> set) {
        java.util.Set<java.lang.Integer> set2 = this.checkedIds;
        this.checkedIds = new java.util.HashSet(set);
        for (int i = 0; i < getChildCount(); i++) {
            int id = getChildButton(i).getId();
            setCheckedStateForView(id, set.contains(java.lang.Integer.valueOf(id)));
            if (set2.contains(java.lang.Integer.valueOf(id)) != set.contains(java.lang.Integer.valueOf(id))) {
                dispatchOnButtonChecked(id, set.contains(java.lang.Integer.valueOf(id)));
            }
        }
        invalidate();
    }

    private void dispatchOnButtonChecked(int i, boolean z) {
        java.util.Iterator<com.google.android.material.button.MaterialButtonToggleGroup.OnButtonCheckedListener> it = this.onButtonCheckedListeners.iterator();
        while (it.hasNext()) {
            it.next().onButtonChecked(this, i, z);
        }
    }

    private void setGeneratedIdIfNeeded(com.google.android.material.button.MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            materialButton.setId(androidx.core.view.ViewCompat.generateViewId());
        }
    }

    private void setupButtonChild(com.google.android.material.button.MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(android.text.TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setOnPressedChangeListenerInternal(this.pressedStateTracker);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    private android.widget.LinearLayout.LayoutParams buildLayoutParams(android.view.View view) {
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof android.widget.LinearLayout.LayoutParams) {
            return (android.widget.LinearLayout.LayoutParams) layoutParams;
        }
        return new android.widget.LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i, int i2) {
        java.lang.Integer[] numArr = this.childOrder;
        if (numArr == null || i2 >= numArr.length) {
            android.util.Log.w(LOG_TAG, "Child order wasn't updated");
            return i2;
        }
        return numArr[i2].intValue();
    }

    private void updateChildOrder() {
        java.util.TreeMap treeMap = new java.util.TreeMap(this.childOrderComparator);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            treeMap.put(getChildButton(i), java.lang.Integer.valueOf(i));
        }
        this.childOrder = (java.lang.Integer[]) treeMap.values().toArray(new java.lang.Integer[0]);
    }

    void onButtonCheckedStateChanged(com.google.android.material.button.MaterialButton materialButton, boolean z) {
        if (this.skipCheckedStateTracker) {
            return;
        }
        checkInternal(materialButton.getId(), z);
    }

    private class PressedStateTracker implements com.google.android.material.button.MaterialButton.OnPressedChangeListener {
        private PressedStateTracker() {
        }

        @Override // com.google.android.material.button.MaterialButton.OnPressedChangeListener
        public void onPressedChanged(com.google.android.material.button.MaterialButton materialButton, boolean z) {
            com.google.android.material.button.MaterialButtonToggleGroup.this.invalidate();
        }
    }

    private static class CornerData {
        private static final com.google.android.material.shape.CornerSize noCorner = new com.google.android.material.shape.AbsoluteCornerSize(0.0f);
        com.google.android.material.shape.CornerSize bottomLeft;
        com.google.android.material.shape.CornerSize bottomRight;
        com.google.android.material.shape.CornerSize topLeft;
        com.google.android.material.shape.CornerSize topRight;

        CornerData(com.google.android.material.shape.CornerSize cornerSize, com.google.android.material.shape.CornerSize cornerSize2, com.google.android.material.shape.CornerSize cornerSize3, com.google.android.material.shape.CornerSize cornerSize4) {
            this.topLeft = cornerSize;
            this.topRight = cornerSize3;
            this.bottomRight = cornerSize4;
            this.bottomLeft = cornerSize2;
        }

        public static com.google.android.material.button.MaterialButtonToggleGroup.CornerData start(com.google.android.material.button.MaterialButtonToggleGroup.CornerData cornerData, android.view.View view) {
            return com.google.android.material.internal.ViewUtils.isLayoutRtl(view) ? right(cornerData) : left(cornerData);
        }

        public static com.google.android.material.button.MaterialButtonToggleGroup.CornerData end(com.google.android.material.button.MaterialButtonToggleGroup.CornerData cornerData, android.view.View view) {
            return com.google.android.material.internal.ViewUtils.isLayoutRtl(view) ? left(cornerData) : right(cornerData);
        }

        public static com.google.android.material.button.MaterialButtonToggleGroup.CornerData left(com.google.android.material.button.MaterialButtonToggleGroup.CornerData cornerData) {
            com.google.android.material.shape.CornerSize cornerSize = cornerData.topLeft;
            com.google.android.material.shape.CornerSize cornerSize2 = cornerData.bottomLeft;
            com.google.android.material.shape.CornerSize cornerSize3 = noCorner;
            return new com.google.android.material.button.MaterialButtonToggleGroup.CornerData(cornerSize, cornerSize2, cornerSize3, cornerSize3);
        }

        public static com.google.android.material.button.MaterialButtonToggleGroup.CornerData right(com.google.android.material.button.MaterialButtonToggleGroup.CornerData cornerData) {
            com.google.android.material.shape.CornerSize cornerSize = noCorner;
            return new com.google.android.material.button.MaterialButtonToggleGroup.CornerData(cornerSize, cornerSize, cornerData.topRight, cornerData.bottomRight);
        }

        public static com.google.android.material.button.MaterialButtonToggleGroup.CornerData top(com.google.android.material.button.MaterialButtonToggleGroup.CornerData cornerData) {
            com.google.android.material.shape.CornerSize cornerSize = cornerData.topLeft;
            com.google.android.material.shape.CornerSize cornerSize2 = noCorner;
            return new com.google.android.material.button.MaterialButtonToggleGroup.CornerData(cornerSize, cornerSize2, cornerData.topRight, cornerSize2);
        }

        public static com.google.android.material.button.MaterialButtonToggleGroup.CornerData bottom(com.google.android.material.button.MaterialButtonToggleGroup.CornerData cornerData) {
            com.google.android.material.shape.CornerSize cornerSize = noCorner;
            return new com.google.android.material.button.MaterialButtonToggleGroup.CornerData(cornerSize, cornerData.bottomLeft, cornerSize, cornerData.bottomRight);
        }
    }
}
