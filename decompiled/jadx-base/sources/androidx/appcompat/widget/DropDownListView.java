package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
class DropDownListView extends android.widget.ListView {
    public static final int INVALID_POSITION = -1;
    public static final int NO_POSITION = -1;
    private androidx.core.view.ViewPropertyAnimatorCompat mClickAnimation;
    private boolean mDrawsInPressedState;
    private boolean mHijackFocus;
    private boolean mListSelectionHidden;
    private int mMotionPosition;
    androidx.appcompat.widget.DropDownListView.ResolveHoverRunnable mResolveHoverRunnable;
    private androidx.core.widget.ListViewAutoScrollHelper mScrollHelper;
    private int mSelectionBottomPadding;
    private int mSelectionLeftPadding;
    private int mSelectionRightPadding;
    private int mSelectionTopPadding;
    private androidx.appcompat.widget.DropDownListView.GateKeeperDrawable mSelector;
    private final android.graphics.Rect mSelectorRect;

    DropDownListView(android.content.Context context, boolean z) {
        super(context, null, androidx.appcompat.R.attr.dropDownListViewStyle);
        this.mSelectorRect = new android.graphics.Rect();
        this.mSelectionLeftPadding = 0;
        this.mSelectionTopPadding = 0;
        this.mSelectionRightPadding = 0;
        this.mSelectionBottomPadding = 0;
        this.mHijackFocus = z;
        setCacheColorHint(0);
    }

    private boolean superIsSelectedChildViewEnabled() {
        if (androidx.core.os.BuildCompat.isAtLeastT()) {
            return androidx.appcompat.widget.DropDownListView.Api33Impl.isSelectedChildViewEnabled(this);
        }
        return androidx.appcompat.widget.DropDownListView.PreApi33Impl.isSelectedChildViewEnabled(this);
    }

    private void superSetSelectedChildViewEnabled(boolean z) {
        if (androidx.core.os.BuildCompat.isAtLeastT()) {
            androidx.appcompat.widget.DropDownListView.Api33Impl.setSelectedChildViewEnabled(this, z);
        } else {
            androidx.appcompat.widget.DropDownListView.PreApi33Impl.setSelectedChildViewEnabled(this, z);
        }
    }

    @Override // android.view.View
    public boolean isInTouchMode() {
        return (this.mHijackFocus && this.mListSelectionHidden) || super.isInTouchMode();
    }

    @Override // android.view.View
    public boolean hasWindowFocus() {
        return this.mHijackFocus || super.hasWindowFocus();
    }

    @Override // android.view.View
    public boolean isFocused() {
        return this.mHijackFocus || super.isFocused();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean hasFocus() {
        return this.mHijackFocus || super.hasFocus();
    }

    @Override // android.widget.AbsListView
    public void setSelector(android.graphics.drawable.Drawable drawable) {
        androidx.appcompat.widget.DropDownListView.GateKeeperDrawable gateKeeperDrawable = drawable != null ? new androidx.appcompat.widget.DropDownListView.GateKeeperDrawable(drawable) : null;
        this.mSelector = gateKeeperDrawable;
        super.setSelector(gateKeeperDrawable);
        android.graphics.Rect rect = new android.graphics.Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.mSelectionLeftPadding = rect.left;
        this.mSelectionTopPadding = rect.top;
        this.mSelectionRightPadding = rect.right;
        this.mSelectionBottomPadding = rect.bottom;
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        if (this.mResolveHoverRunnable != null) {
            return;
        }
        super.drawableStateChanged();
        setSelectorEnabled(true);
        updateSelectorStateCompat();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void dispatchDraw(android.graphics.Canvas canvas) {
        drawSelectorCompat(canvas);
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.mMotionPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        androidx.appcompat.widget.DropDownListView.ResolveHoverRunnable resolveHoverRunnable = this.mResolveHoverRunnable;
        if (resolveHoverRunnable != null) {
            resolveHoverRunnable.cancel();
        }
        return super.onTouchEvent(motionEvent);
    }

    public int lookForSelectablePosition(int i, boolean z) {
        int iMin;
        android.widget.ListAdapter adapter = getAdapter();
        if (adapter != null && !isInTouchMode()) {
            int count = adapter.getCount();
            if (!getAdapter().areAllItemsEnabled()) {
                if (z) {
                    iMin = java.lang.Math.max(0, i);
                    while (iMin < count && !adapter.isEnabled(iMin)) {
                        iMin++;
                    }
                } else {
                    iMin = java.lang.Math.min(i, count - 1);
                    while (iMin >= 0 && !adapter.isEnabled(iMin)) {
                        iMin--;
                    }
                }
                if (iMin < 0 || iMin >= count) {
                    return -1;
                }
                return iMin;
            }
            if (i >= 0 && i < count) {
                return i;
            }
        }
        return -1;
    }

    public int measureHeightOfChildrenCompat(int i, int i2, int i3, int i4, int i5) {
        int iMakeMeasureSpec;
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        android.graphics.drawable.Drawable divider = getDivider();
        android.widget.ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int measuredHeight = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        android.view.View view = null;
        while (i6 < count) {
            int itemViewType = adapter.getItemViewType(i6);
            if (itemViewType != i7) {
                view = null;
                i7 = itemViewType;
            }
            view = adapter.getView(i6, view, this);
            android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            if (layoutParams.height > 0) {
                iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(layoutParams.height, 1073741824);
            } else {
                iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
            }
            view.measure(i, iMakeMeasureSpec);
            view.forceLayout();
            if (i6 > 0) {
                measuredHeight += dividerHeight;
            }
            measuredHeight += view.getMeasuredHeight();
            if (measuredHeight >= i4) {
                return (i5 < 0 || i6 <= i5 || i8 <= 0 || measuredHeight == i4) ? i4 : i8;
            }
            if (i5 >= 0 && i6 >= i5) {
                i8 = measuredHeight;
            }
            i6++;
        }
        return measuredHeight;
    }

    private void setSelectorEnabled(boolean z) {
        androidx.appcompat.widget.DropDownListView.GateKeeperDrawable gateKeeperDrawable = this.mSelector;
        if (gateKeeperDrawable != null) {
            gateKeeperDrawable.setEnabled(z);
        }
    }

    private static class GateKeeperDrawable extends androidx.appcompat.graphics.drawable.DrawableWrapperCompat {
        private boolean mEnabled;

        GateKeeperDrawable(android.graphics.drawable.Drawable drawable) {
            super(drawable);
            this.mEnabled = true;
        }

        void setEnabled(boolean z) {
            this.mEnabled = z;
        }

        @Override // androidx.appcompat.graphics.drawable.DrawableWrapperCompat, android.graphics.drawable.Drawable
        public boolean setState(int[] iArr) {
            if (this.mEnabled) {
                return super.setState(iArr);
            }
            return false;
        }

        @Override // androidx.appcompat.graphics.drawable.DrawableWrapperCompat, android.graphics.drawable.Drawable
        public void draw(android.graphics.Canvas canvas) {
            if (this.mEnabled) {
                super.draw(canvas);
            }
        }

        @Override // androidx.appcompat.graphics.drawable.DrawableWrapperCompat, android.graphics.drawable.Drawable
        public void setHotspot(float f, float f2) {
            if (this.mEnabled) {
                super.setHotspot(f, f2);
            }
        }

        @Override // androidx.appcompat.graphics.drawable.DrawableWrapperCompat, android.graphics.drawable.Drawable
        public void setHotspotBounds(int i, int i2, int i3, int i4) {
            if (this.mEnabled) {
                super.setHotspotBounds(i, i2, i3, i4);
            }
        }

        @Override // androidx.appcompat.graphics.drawable.DrawableWrapperCompat, android.graphics.drawable.Drawable
        public boolean setVisible(boolean z, boolean z2) {
            if (this.mEnabled) {
                return super.setVisible(z, z2);
            }
            return false;
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(android.view.MotionEvent motionEvent) {
        if (android.os.Build.VERSION.SDK_INT < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.mResolveHoverRunnable == null) {
            androidx.appcompat.widget.DropDownListView.ResolveHoverRunnable resolveHoverRunnable = new androidx.appcompat.widget.DropDownListView.ResolveHoverRunnable();
            this.mResolveHoverRunnable = resolveHoverRunnable;
            resolveHoverRunnable.post();
        }
        boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (iPointToPosition != -1 && iPointToPosition != getSelectedItemPosition()) {
                android.view.View childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    requestFocus();
                    if (android.os.Build.VERSION.SDK_INT >= 30 && androidx.appcompat.widget.DropDownListView.Api30Impl.canPositionSelectorForHoveredItem()) {
                        androidx.appcompat.widget.DropDownListView.Api30Impl.positionSelectorForHoveredItem(this, iPointToPosition, childAt);
                    } else {
                        setSelectionFromTop(iPointToPosition, childAt.getTop() - getTop());
                    }
                }
                updateSelectorStateCompat();
            }
        } else {
            setSelection(-1);
        }
        return zOnHoverEvent;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        this.mResolveHoverRunnable = null;
        super.onDetachedFromWindow();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x004a  */
    /* JADX WARN: Code duplicated, block: B:25:0x004f  */
    /* JADX WARN: Code duplicated, block: B:27:0x0053  */
    /* JADX WARN: Code duplicated, block: B:29:0x0065  */
    /* JADX WARN: Code duplicated, block: B:31:0x0069  */
    /* JADX WARN: Code duplicated, block: B:9:0x0011  */
    public boolean onForwardedEvent(android.view.MotionEvent motionEvent, int i) {
        boolean z;
        boolean z2;
        androidx.core.widget.ListViewAutoScrollHelper listViewAutoScrollHelper;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1) {
            z = false;
        } else {
            if (actionMasked != 2) {
                if (actionMasked != 3) {
                    z = true;
                    z2 = false;
                } else {
                    z2 = false;
                    z = false;
                }
                if (z || z2) {
                    clearPressedItem();
                }
                if (z) {
                    if (this.mScrollHelper == null) {
                        this.mScrollHelper = new androidx.core.widget.ListViewAutoScrollHelper(this);
                    }
                    this.mScrollHelper.setEnabled(true);
                    this.mScrollHelper.onTouch(this, motionEvent);
                } else {
                    listViewAutoScrollHelper = this.mScrollHelper;
                    if (listViewAutoScrollHelper != null) {
                        listViewAutoScrollHelper.setEnabled(false);
                    }
                }
                return z;
            }
            z = true;
        }
        int iFindPointerIndex = motionEvent.findPointerIndex(i);
        if (iFindPointerIndex < 0) {
            z2 = false;
            z = false;
        } else {
            int x = (int) motionEvent.getX(iFindPointerIndex);
            int y = (int) motionEvent.getY(iFindPointerIndex);
            int iPointToPosition = pointToPosition(x, y);
            if (iPointToPosition == -1) {
                z2 = true;
            } else {
                android.view.View childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
                setPressedItem(childAt, iPointToPosition, x, y);
                if (actionMasked == 1) {
                    clickPressedItem(childAt, iPointToPosition);
                }
                z = true;
                z2 = false;
            }
        }
        if (z) {
            clearPressedItem();
        } else {
            clearPressedItem();
        }
        if (z) {
            if (this.mScrollHelper == null) {
                this.mScrollHelper = new androidx.core.widget.ListViewAutoScrollHelper(this);
            }
            this.mScrollHelper.setEnabled(true);
            this.mScrollHelper.onTouch(this, motionEvent);
        } else {
            listViewAutoScrollHelper = this.mScrollHelper;
            if (listViewAutoScrollHelper != null) {
                listViewAutoScrollHelper.setEnabled(false);
            }
        }
        return z;
    }

    private void clickPressedItem(android.view.View view, int i) {
        performItemClick(view, i, getItemIdAtPosition(i));
    }

    void setListSelectionHidden(boolean z) {
        this.mListSelectionHidden = z;
    }

    private void updateSelectorStateCompat() {
        android.graphics.drawable.Drawable selector = getSelector();
        if (selector != null && touchModeDrawsInPressedStateCompat() && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    private void drawSelectorCompat(android.graphics.Canvas canvas) {
        android.graphics.drawable.Drawable selector;
        if (this.mSelectorRect.isEmpty() || (selector = getSelector()) == null) {
            return;
        }
        selector.setBounds(this.mSelectorRect);
        selector.draw(canvas);
    }

    private void positionSelectorLikeTouchCompat(int i, android.view.View view, float f, float f2) {
        positionSelectorLikeFocusCompat(i, view);
        android.graphics.drawable.Drawable selector = getSelector();
        if (selector == null || i == -1) {
            return;
        }
        androidx.core.graphics.drawable.DrawableCompat.setHotspot(selector, f, f2);
    }

    private void positionSelectorLikeFocusCompat(int i, android.view.View view) {
        android.graphics.drawable.Drawable selector = getSelector();
        boolean z = (selector == null || i == -1) ? false : true;
        if (z) {
            selector.setVisible(false, false);
        }
        positionSelectorCompat(i, view);
        if (z) {
            android.graphics.Rect rect = this.mSelectorRect;
            float fExactCenterX = rect.exactCenterX();
            float fExactCenterY = rect.exactCenterY();
            selector.setVisible(getVisibility() == 0, false);
            androidx.core.graphics.drawable.DrawableCompat.setHotspot(selector, fExactCenterX, fExactCenterY);
        }
    }

    private void positionSelectorCompat(int i, android.view.View view) {
        android.graphics.Rect rect = this.mSelectorRect;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        rect.left -= this.mSelectionLeftPadding;
        rect.top -= this.mSelectionTopPadding;
        rect.right += this.mSelectionRightPadding;
        rect.bottom += this.mSelectionBottomPadding;
        boolean zSuperIsSelectedChildViewEnabled = superIsSelectedChildViewEnabled();
        if (view.isEnabled() != zSuperIsSelectedChildViewEnabled) {
            superSetSelectedChildViewEnabled(!zSuperIsSelectedChildViewEnabled);
            if (i != -1) {
                refreshDrawableState();
            }
        }
    }

    private void clearPressedItem() {
        this.mDrawsInPressedState = false;
        setPressed(false);
        drawableStateChanged();
        android.view.View childAt = getChildAt(this.mMotionPosition - getFirstVisiblePosition());
        if (childAt != null) {
            childAt.setPressed(false);
        }
        androidx.core.view.ViewPropertyAnimatorCompat viewPropertyAnimatorCompat = this.mClickAnimation;
        if (viewPropertyAnimatorCompat != null) {
            viewPropertyAnimatorCompat.cancel();
            this.mClickAnimation = null;
        }
    }

    private void setPressedItem(android.view.View view, int i, float f, float f2) {
        android.view.View childAt;
        this.mDrawsInPressedState = true;
        androidx.appcompat.widget.DropDownListView.Api21Impl.drawableHotspotChanged(this, f, f2);
        if (!isPressed()) {
            setPressed(true);
        }
        layoutChildren();
        int i2 = this.mMotionPosition;
        if (i2 != -1 && (childAt = getChildAt(i2 - getFirstVisiblePosition())) != null && childAt != view && childAt.isPressed()) {
            childAt.setPressed(false);
        }
        this.mMotionPosition = i;
        androidx.appcompat.widget.DropDownListView.Api21Impl.drawableHotspotChanged(view, f - view.getLeft(), f2 - view.getTop());
        if (!view.isPressed()) {
            view.setPressed(true);
        }
        positionSelectorLikeTouchCompat(i, view, f, f2);
        setSelectorEnabled(false);
        refreshDrawableState();
    }

    private boolean touchModeDrawsInPressedStateCompat() {
        return this.mDrawsInPressedState;
    }

    private class ResolveHoverRunnable implements java.lang.Runnable {
        ResolveHoverRunnable() {
        }

        @Override // java.lang.Runnable
        public void run() {
            androidx.appcompat.widget.DropDownListView.this.mResolveHoverRunnable = null;
            androidx.appcompat.widget.DropDownListView.this.drawableStateChanged();
        }

        public void cancel() {
            androidx.appcompat.widget.DropDownListView.this.mResolveHoverRunnable = null;
            androidx.appcompat.widget.DropDownListView.this.removeCallbacks(this);
        }

        public void post() {
            androidx.appcompat.widget.DropDownListView.this.post(this);
        }
    }

    static class Api30Impl {
        private static boolean sHasMethods;
        private static java.lang.reflect.Method sPositionSelector;
        private static java.lang.reflect.Method sSetNextSelectedPositionInt;
        private static java.lang.reflect.Method sSetSelectedPositionInt;

        static {
            try {
                java.lang.reflect.Method declaredMethod = android.widget.AbsListView.class.getDeclaredMethod("positionSelector", java.lang.Integer.TYPE, android.view.View.class, java.lang.Boolean.TYPE, java.lang.Float.TYPE, java.lang.Float.TYPE);
                sPositionSelector = declaredMethod;
                declaredMethod.setAccessible(true);
                java.lang.reflect.Method declaredMethod2 = android.widget.AdapterView.class.getDeclaredMethod("setSelectedPositionInt", java.lang.Integer.TYPE);
                sSetSelectedPositionInt = declaredMethod2;
                declaredMethod2.setAccessible(true);
                java.lang.reflect.Method declaredMethod3 = android.widget.AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", java.lang.Integer.TYPE);
                sSetNextSelectedPositionInt = declaredMethod3;
                declaredMethod3.setAccessible(true);
                sHasMethods = true;
            } catch (java.lang.NoSuchMethodException e) {
                e.printStackTrace();
            }
        }

        private Api30Impl() {
        }

        static boolean canPositionSelectorForHoveredItem() {
            return sHasMethods;
        }

        static void positionSelectorForHoveredItem(androidx.appcompat.widget.DropDownListView dropDownListView, int i, android.view.View view) {
            try {
                sPositionSelector.invoke(dropDownListView, java.lang.Integer.valueOf(i), view, false, -1, -1);
                sSetSelectedPositionInt.invoke(dropDownListView, java.lang.Integer.valueOf(i));
                sSetNextSelectedPositionInt.invoke(dropDownListView, java.lang.Integer.valueOf(i));
            } catch (java.lang.IllegalAccessException e) {
                e.printStackTrace();
            } catch (java.lang.reflect.InvocationTargetException e2) {
                e2.printStackTrace();
            }
        }
    }

    static class Api21Impl {
        private Api21Impl() {
        }

        static void drawableHotspotChanged(android.view.View view, float f, float f2) {
            view.drawableHotspotChanged(f, f2);
        }
    }

    static class PreApi33Impl {
        private static final java.lang.reflect.Field sIsChildViewEnabled;

        static {
            java.lang.reflect.Field declaredField = null;
            try {
                declaredField = android.widget.AbsListView.class.getDeclaredField("mIsChildViewEnabled");
                declaredField.setAccessible(true);
            } catch (java.lang.NoSuchFieldException e) {
                e.printStackTrace();
            }
            sIsChildViewEnabled = declaredField;
        }

        private PreApi33Impl() {
        }

        static boolean isSelectedChildViewEnabled(android.widget.AbsListView absListView) {
            java.lang.reflect.Field field = sIsChildViewEnabled;
            if (field == null) {
                return false;
            }
            try {
                return field.getBoolean(absListView);
            } catch (java.lang.IllegalAccessException e) {
                e.printStackTrace();
                return false;
            }
        }

        static void setSelectedChildViewEnabled(android.widget.AbsListView absListView, boolean z) {
            java.lang.reflect.Field field = sIsChildViewEnabled;
            if (field != null) {
                try {
                    field.set(absListView, java.lang.Boolean.valueOf(z));
                } catch (java.lang.IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    static class Api33Impl {
        private Api33Impl() {
        }

        static boolean isSelectedChildViewEnabled(android.widget.AbsListView absListView) {
            return absListView.isSelectedChildViewEnabled();
        }

        static void setSelectedChildViewEnabled(android.widget.AbsListView absListView, boolean z) {
            absListView.setSelectedChildViewEnabled(z);
        }
    }
}
