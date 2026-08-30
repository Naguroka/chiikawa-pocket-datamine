package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
public class ListPopupWindow implements androidx.appcompat.view.menu.ShowableListMenu {
    private static final boolean DEBUG = false;
    static final int EXPAND_LIST_TIMEOUT = 250;
    public static final int INPUT_METHOD_FROM_FOCUSABLE = 0;
    public static final int INPUT_METHOD_NEEDED = 1;
    public static final int INPUT_METHOD_NOT_NEEDED = 2;
    public static final int MATCH_PARENT = -1;
    public static final int POSITION_PROMPT_ABOVE = 0;
    public static final int POSITION_PROMPT_BELOW = 1;
    private static final java.lang.String TAG = "ListPopupWindow";
    public static final int WRAP_CONTENT = -2;
    private static java.lang.reflect.Method sGetMaxAvailableHeightMethod;
    private static java.lang.reflect.Method sSetClipToWindowEnabledMethod;
    private static java.lang.reflect.Method sSetEpicenterBoundsMethod;
    private android.widget.ListAdapter mAdapter;
    private android.content.Context mContext;
    private boolean mDropDownAlwaysVisible;
    private android.view.View mDropDownAnchorView;
    private int mDropDownGravity;
    private int mDropDownHeight;
    private int mDropDownHorizontalOffset;
    androidx.appcompat.widget.DropDownListView mDropDownList;
    private android.graphics.drawable.Drawable mDropDownListHighlight;
    private int mDropDownVerticalOffset;
    private boolean mDropDownVerticalOffsetSet;
    private int mDropDownWidth;
    private int mDropDownWindowLayoutType;
    private android.graphics.Rect mEpicenterBounds;
    private boolean mForceIgnoreOutsideTouch;
    final android.os.Handler mHandler;
    private final androidx.appcompat.widget.ListPopupWindow.ListSelectorHider mHideSelector;
    private android.widget.AdapterView.OnItemClickListener mItemClickListener;
    private android.widget.AdapterView.OnItemSelectedListener mItemSelectedListener;
    int mListItemExpandMaximum;
    private boolean mModal;
    private android.database.DataSetObserver mObserver;
    private boolean mOverlapAnchor;
    private boolean mOverlapAnchorSet;
    android.widget.PopupWindow mPopup;
    private int mPromptPosition;
    private android.view.View mPromptView;
    final androidx.appcompat.widget.ListPopupWindow.ResizePopupRunnable mResizePopupRunnable;
    private final androidx.appcompat.widget.ListPopupWindow.PopupScrollListener mScrollListener;
    private java.lang.Runnable mShowDropDownRunnable;
    private final android.graphics.Rect mTempRect;
    private final androidx.appcompat.widget.ListPopupWindow.PopupTouchInterceptor mTouchInterceptor;

    private static boolean isConfirmKey(int i) {
        return i == 66 || i == 23;
    }

    static {
        if (android.os.Build.VERSION.SDK_INT <= 28) {
            try {
                sSetClipToWindowEnabledMethod = android.widget.PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", java.lang.Boolean.TYPE);
            } catch (java.lang.NoSuchMethodException unused) {
                android.util.Log.i(TAG, "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                sSetEpicenterBoundsMethod = android.widget.PopupWindow.class.getDeclaredMethod("setEpicenterBounds", android.graphics.Rect.class);
            } catch (java.lang.NoSuchMethodException unused2) {
                android.util.Log.i(TAG, "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    public ListPopupWindow(android.content.Context context) {
        this(context, null, androidx.appcompat.R.attr.listPopupWindowStyle);
    }

    public ListPopupWindow(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, androidx.appcompat.R.attr.listPopupWindowStyle);
    }

    public ListPopupWindow(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public ListPopupWindow(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        this.mDropDownHeight = -2;
        this.mDropDownWidth = -2;
        this.mDropDownWindowLayoutType = 1002;
        this.mDropDownGravity = 0;
        this.mDropDownAlwaysVisible = false;
        this.mForceIgnoreOutsideTouch = false;
        this.mListItemExpandMaximum = Integer.MAX_VALUE;
        this.mPromptPosition = 0;
        this.mResizePopupRunnable = new androidx.appcompat.widget.ListPopupWindow.ResizePopupRunnable();
        this.mTouchInterceptor = new androidx.appcompat.widget.ListPopupWindow.PopupTouchInterceptor();
        this.mScrollListener = new androidx.appcompat.widget.ListPopupWindow.PopupScrollListener();
        this.mHideSelector = new androidx.appcompat.widget.ListPopupWindow.ListSelectorHider();
        this.mTempRect = new android.graphics.Rect();
        this.mContext = context;
        this.mHandler = new android.os.Handler(context.getMainLooper());
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.appcompat.R.styleable.ListPopupWindow, i, i2);
        this.mDropDownHorizontalOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(androidx.appcompat.R.styleable.ListPopupWindow_android_dropDownHorizontalOffset, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(androidx.appcompat.R.styleable.ListPopupWindow_android_dropDownVerticalOffset, 0);
        this.mDropDownVerticalOffset = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.mDropDownVerticalOffsetSet = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        androidx.appcompat.widget.AppCompatPopupWindow appCompatPopupWindow = new androidx.appcompat.widget.AppCompatPopupWindow(context, attributeSet, i, i2);
        this.mPopup = appCompatPopupWindow;
        appCompatPopupWindow.setInputMethodMode(1);
    }

    public void setAdapter(android.widget.ListAdapter listAdapter) {
        android.database.DataSetObserver dataSetObserver = this.mObserver;
        if (dataSetObserver == null) {
            this.mObserver = new androidx.appcompat.widget.ListPopupWindow.PopupDataSetObserver();
        } else {
            android.widget.ListAdapter listAdapter2 = this.mAdapter;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.mAdapter = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.mObserver);
        }
        androidx.appcompat.widget.DropDownListView dropDownListView = this.mDropDownList;
        if (dropDownListView != null) {
            dropDownListView.setAdapter(this.mAdapter);
        }
    }

    public void setPromptPosition(int i) {
        this.mPromptPosition = i;
    }

    public int getPromptPosition() {
        return this.mPromptPosition;
    }

    public void setModal(boolean z) {
        this.mModal = z;
        this.mPopup.setFocusable(z);
    }

    public boolean isModal() {
        return this.mModal;
    }

    public void setForceIgnoreOutsideTouch(boolean z) {
        this.mForceIgnoreOutsideTouch = z;
    }

    public void setDropDownAlwaysVisible(boolean z) {
        this.mDropDownAlwaysVisible = z;
    }

    public boolean isDropDownAlwaysVisible() {
        return this.mDropDownAlwaysVisible;
    }

    public void setSoftInputMode(int i) {
        this.mPopup.setSoftInputMode(i);
    }

    public int getSoftInputMode() {
        return this.mPopup.getSoftInputMode();
    }

    public void setListSelector(android.graphics.drawable.Drawable drawable) {
        this.mDropDownListHighlight = drawable;
    }

    public android.graphics.drawable.Drawable getBackground() {
        return this.mPopup.getBackground();
    }

    public void setBackgroundDrawable(android.graphics.drawable.Drawable drawable) {
        this.mPopup.setBackgroundDrawable(drawable);
    }

    public void setAnimationStyle(int i) {
        this.mPopup.setAnimationStyle(i);
    }

    public int getAnimationStyle() {
        return this.mPopup.getAnimationStyle();
    }

    public android.view.View getAnchorView() {
        return this.mDropDownAnchorView;
    }

    public void setAnchorView(android.view.View view) {
        this.mDropDownAnchorView = view;
    }

    public int getHorizontalOffset() {
        return this.mDropDownHorizontalOffset;
    }

    public void setHorizontalOffset(int i) {
        this.mDropDownHorizontalOffset = i;
    }

    public int getVerticalOffset() {
        if (this.mDropDownVerticalOffsetSet) {
            return this.mDropDownVerticalOffset;
        }
        return 0;
    }

    public void setVerticalOffset(int i) {
        this.mDropDownVerticalOffset = i;
        this.mDropDownVerticalOffsetSet = true;
    }

    public void setEpicenterBounds(android.graphics.Rect rect) {
        this.mEpicenterBounds = rect != null ? new android.graphics.Rect(rect) : null;
    }

    public android.graphics.Rect getEpicenterBounds() {
        if (this.mEpicenterBounds != null) {
            return new android.graphics.Rect(this.mEpicenterBounds);
        }
        return null;
    }

    public void setDropDownGravity(int i) {
        this.mDropDownGravity = i;
    }

    public int getWidth() {
        return this.mDropDownWidth;
    }

    public void setWidth(int i) {
        this.mDropDownWidth = i;
    }

    public void setContentWidth(int i) {
        android.graphics.drawable.Drawable background = this.mPopup.getBackground();
        if (background != null) {
            background.getPadding(this.mTempRect);
            this.mDropDownWidth = this.mTempRect.left + this.mTempRect.right + i;
        } else {
            setWidth(i);
        }
    }

    public int getHeight() {
        return this.mDropDownHeight;
    }

    public void setHeight(int i) {
        if (i < 0 && -2 != i && -1 != i) {
            throw new java.lang.IllegalArgumentException("Invalid height. Must be a positive value, MATCH_PARENT, or WRAP_CONTENT.");
        }
        this.mDropDownHeight = i;
    }

    public void setWindowLayoutType(int i) {
        this.mDropDownWindowLayoutType = i;
    }

    public void setOnItemClickListener(android.widget.AdapterView.OnItemClickListener onItemClickListener) {
        this.mItemClickListener = onItemClickListener;
    }

    public void setOnItemSelectedListener(android.widget.AdapterView.OnItemSelectedListener onItemSelectedListener) {
        this.mItemSelectedListener = onItemSelectedListener;
    }

    public void setPromptView(android.view.View view) {
        boolean zIsShowing = isShowing();
        if (zIsShowing) {
            removePromptView();
        }
        this.mPromptView = view;
        if (zIsShowing) {
            show();
        }
    }

    public void postShow() {
        this.mHandler.post(this.mShowDropDownRunnable);
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public void show() {
        int iBuildDropDown = buildDropDown();
        boolean zIsInputMethodNotNeeded = isInputMethodNotNeeded();
        androidx.core.widget.PopupWindowCompat.setWindowLayoutType(this.mPopup, this.mDropDownWindowLayoutType);
        if (this.mPopup.isShowing()) {
            if (androidx.core.view.ViewCompat.isAttachedToWindow(getAnchorView())) {
                int width = this.mDropDownWidth;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = getAnchorView().getWidth();
                }
                int i = this.mDropDownHeight;
                if (i == -1) {
                    if (!zIsInputMethodNotNeeded) {
                        iBuildDropDown = -1;
                    }
                    if (zIsInputMethodNotNeeded) {
                        this.mPopup.setWidth(this.mDropDownWidth == -1 ? -1 : 0);
                        this.mPopup.setHeight(0);
                    } else {
                        this.mPopup.setWidth(this.mDropDownWidth == -1 ? -1 : 0);
                        this.mPopup.setHeight(-1);
                    }
                } else if (i != -2) {
                    iBuildDropDown = i;
                }
                this.mPopup.setOutsideTouchable((this.mForceIgnoreOutsideTouch || this.mDropDownAlwaysVisible) ? false : true);
                this.mPopup.update(getAnchorView(), this.mDropDownHorizontalOffset, this.mDropDownVerticalOffset, width < 0 ? -1 : width, iBuildDropDown < 0 ? -1 : iBuildDropDown);
                return;
            }
            return;
        }
        int width2 = this.mDropDownWidth;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = getAnchorView().getWidth();
        }
        int i2 = this.mDropDownHeight;
        if (i2 == -1) {
            iBuildDropDown = -1;
        } else if (i2 != -2) {
            iBuildDropDown = i2;
        }
        this.mPopup.setWidth(width2);
        this.mPopup.setHeight(iBuildDropDown);
        setPopupClipToScreenEnabled(true);
        this.mPopup.setOutsideTouchable((this.mForceIgnoreOutsideTouch || this.mDropDownAlwaysVisible) ? false : true);
        this.mPopup.setTouchInterceptor(this.mTouchInterceptor);
        if (this.mOverlapAnchorSet) {
            androidx.core.widget.PopupWindowCompat.setOverlapAnchor(this.mPopup, this.mOverlapAnchor);
        }
        if (android.os.Build.VERSION.SDK_INT <= 28) {
            java.lang.reflect.Method method = sSetEpicenterBoundsMethod;
            if (method != null) {
                try {
                    method.invoke(this.mPopup, this.mEpicenterBounds);
                } catch (java.lang.Exception e) {
                    android.util.Log.e(TAG, "Could not invoke setEpicenterBounds on PopupWindow", e);
                }
            }
        } else {
            androidx.appcompat.widget.ListPopupWindow.Api29Impl.setEpicenterBounds(this.mPopup, this.mEpicenterBounds);
        }
        androidx.core.widget.PopupWindowCompat.showAsDropDown(this.mPopup, getAnchorView(), this.mDropDownHorizontalOffset, this.mDropDownVerticalOffset, this.mDropDownGravity);
        this.mDropDownList.setSelection(-1);
        if (!this.mModal || this.mDropDownList.isInTouchMode()) {
            clearListSelection();
        }
        if (this.mModal) {
            return;
        }
        this.mHandler.post(this.mHideSelector);
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public void dismiss() {
        this.mPopup.dismiss();
        removePromptView();
        this.mPopup.setContentView(null);
        this.mDropDownList = null;
        this.mHandler.removeCallbacks(this.mResizePopupRunnable);
    }

    public void setOnDismissListener(android.widget.PopupWindow.OnDismissListener onDismissListener) {
        this.mPopup.setOnDismissListener(onDismissListener);
    }

    private void removePromptView() {
        android.view.View view = this.mPromptView;
        if (view != null) {
            android.view.ViewParent parent = view.getParent();
            if (parent instanceof android.view.ViewGroup) {
                ((android.view.ViewGroup) parent).removeView(this.mPromptView);
            }
        }
    }

    public void setInputMethodMode(int i) {
        this.mPopup.setInputMethodMode(i);
    }

    public int getInputMethodMode() {
        return this.mPopup.getInputMethodMode();
    }

    public void setSelection(int i) {
        androidx.appcompat.widget.DropDownListView dropDownListView = this.mDropDownList;
        if (!isShowing() || dropDownListView == null) {
            return;
        }
        dropDownListView.setListSelectionHidden(false);
        dropDownListView.setSelection(i);
        if (dropDownListView.getChoiceMode() != 0) {
            dropDownListView.setItemChecked(i, true);
        }
    }

    public void clearListSelection() {
        androidx.appcompat.widget.DropDownListView dropDownListView = this.mDropDownList;
        if (dropDownListView != null) {
            dropDownListView.setListSelectionHidden(true);
            dropDownListView.requestLayout();
        }
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public boolean isShowing() {
        return this.mPopup.isShowing();
    }

    public boolean isInputMethodNotNeeded() {
        return this.mPopup.getInputMethodMode() == 2;
    }

    public boolean performItemClick(int i) {
        if (!isShowing()) {
            return false;
        }
        if (this.mItemClickListener == null) {
            return true;
        }
        androidx.appcompat.widget.DropDownListView dropDownListView = this.mDropDownList;
        this.mItemClickListener.onItemClick(dropDownListView, dropDownListView.getChildAt(i - dropDownListView.getFirstVisiblePosition()), i, dropDownListView.getAdapter().getItemId(i));
        return true;
    }

    public java.lang.Object getSelectedItem() {
        if (isShowing()) {
            return this.mDropDownList.getSelectedItem();
        }
        return null;
    }

    public int getSelectedItemPosition() {
        if (isShowing()) {
            return this.mDropDownList.getSelectedItemPosition();
        }
        return -1;
    }

    public long getSelectedItemId() {
        if (isShowing()) {
            return this.mDropDownList.getSelectedItemId();
        }
        return Long.MIN_VALUE;
    }

    public android.view.View getSelectedView() {
        if (isShowing()) {
            return this.mDropDownList.getSelectedView();
        }
        return null;
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public android.widget.ListView getListView() {
        return this.mDropDownList;
    }

    androidx.appcompat.widget.DropDownListView createDropDownListView(android.content.Context context, boolean z) {
        return new androidx.appcompat.widget.DropDownListView(context, z);
    }

    void setListItemExpandMax(int i) {
        this.mListItemExpandMaximum = i;
    }

    public boolean onKeyDown(int i, android.view.KeyEvent keyEvent) {
        int iLookForSelectablePosition;
        int iLookForSelectablePosition2;
        if (isShowing() && i != 62 && (this.mDropDownList.getSelectedItemPosition() >= 0 || !isConfirmKey(i))) {
            int selectedItemPosition = this.mDropDownList.getSelectedItemPosition();
            boolean z = !this.mPopup.isAboveAnchor();
            android.widget.ListAdapter listAdapter = this.mAdapter;
            if (listAdapter != null) {
                boolean zAreAllItemsEnabled = listAdapter.areAllItemsEnabled();
                iLookForSelectablePosition = zAreAllItemsEnabled ? 0 : this.mDropDownList.lookForSelectablePosition(0, true);
                if (zAreAllItemsEnabled) {
                    iLookForSelectablePosition2 = listAdapter.getCount() - 1;
                } else {
                    iLookForSelectablePosition2 = this.mDropDownList.lookForSelectablePosition(listAdapter.getCount() - 1, false);
                }
            } else {
                iLookForSelectablePosition = Integer.MAX_VALUE;
                iLookForSelectablePosition2 = Integer.MIN_VALUE;
            }
            if ((z && i == 19 && selectedItemPosition <= iLookForSelectablePosition) || (!z && i == 20 && selectedItemPosition >= iLookForSelectablePosition2)) {
                clearListSelection();
                this.mPopup.setInputMethodMode(1);
                show();
                return true;
            }
            this.mDropDownList.setListSelectionHidden(false);
            if (this.mDropDownList.onKeyDown(i, keyEvent)) {
                this.mPopup.setInputMethodMode(2);
                this.mDropDownList.requestFocusFromTouch();
                show();
                if (i == 19 || i == 20 || i == 23 || i == 66) {
                    return true;
                }
            } else if (z && i == 20) {
                if (selectedItemPosition == iLookForSelectablePosition2) {
                    return true;
                }
            } else if (!z && i == 19 && selectedItemPosition == iLookForSelectablePosition) {
                return true;
            }
        }
        return false;
    }

    public boolean onKeyUp(int i, android.view.KeyEvent keyEvent) {
        if (!isShowing() || this.mDropDownList.getSelectedItemPosition() < 0) {
            return false;
        }
        boolean zOnKeyUp = this.mDropDownList.onKeyUp(i, keyEvent);
        if (zOnKeyUp && isConfirmKey(i)) {
            dismiss();
        }
        return zOnKeyUp;
    }

    public boolean onKeyPreIme(int i, android.view.KeyEvent keyEvent) {
        if (i != 4 || !isShowing()) {
            return false;
        }
        android.view.View view = this.mDropDownAnchorView;
        if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
            android.view.KeyEvent.DispatcherState keyDispatcherState = view.getKeyDispatcherState();
            if (keyDispatcherState != null) {
                keyDispatcherState.startTracking(keyEvent, this);
            }
            return true;
        }
        if (keyEvent.getAction() != 1) {
            return false;
        }
        android.view.KeyEvent.DispatcherState keyDispatcherState2 = view.getKeyDispatcherState();
        if (keyDispatcherState2 != null) {
            keyDispatcherState2.handleUpEvent(keyEvent);
        }
        if (!keyEvent.isTracking() || keyEvent.isCanceled()) {
            return false;
        }
        dismiss();
        return true;
    }

    public android.view.View.OnTouchListener createDragToOpenListener(android.view.View view) {
        return new androidx.appcompat.widget.ForwardingListener(view) { // from class: androidx.appcompat.widget.ListPopupWindow.1
            @Override // androidx.appcompat.widget.ForwardingListener
            public androidx.appcompat.widget.ListPopupWindow getPopup() {
                return androidx.appcompat.widget.ListPopupWindow.this;
            }
        };
    }

    private int buildDropDown() {
        int measuredHeight;
        int i;
        int iMakeMeasureSpec;
        android.view.View view;
        int i2;
        if (this.mDropDownList == null) {
            android.content.Context context = this.mContext;
            this.mShowDropDownRunnable = new java.lang.Runnable() { // from class: androidx.appcompat.widget.ListPopupWindow.2
                @Override // java.lang.Runnable
                public void run() {
                    android.view.View anchorView = androidx.appcompat.widget.ListPopupWindow.this.getAnchorView();
                    if (anchorView == null || anchorView.getWindowToken() == null) {
                        return;
                    }
                    androidx.appcompat.widget.ListPopupWindow.this.show();
                }
            };
            androidx.appcompat.widget.DropDownListView dropDownListViewCreateDropDownListView = createDropDownListView(context, !this.mModal);
            this.mDropDownList = dropDownListViewCreateDropDownListView;
            android.graphics.drawable.Drawable drawable = this.mDropDownListHighlight;
            if (drawable != null) {
                dropDownListViewCreateDropDownListView.setSelector(drawable);
            }
            this.mDropDownList.setAdapter(this.mAdapter);
            this.mDropDownList.setOnItemClickListener(this.mItemClickListener);
            this.mDropDownList.setFocusable(true);
            this.mDropDownList.setFocusableInTouchMode(true);
            this.mDropDownList.setOnItemSelectedListener(new android.widget.AdapterView.OnItemSelectedListener() { // from class: androidx.appcompat.widget.ListPopupWindow.3
                @Override // android.widget.AdapterView.OnItemSelectedListener
                public void onNothingSelected(android.widget.AdapterView<?> adapterView) {
                }

                @Override // android.widget.AdapterView.OnItemSelectedListener
                public void onItemSelected(android.widget.AdapterView<?> adapterView, android.view.View view2, int i3, long j) {
                    androidx.appcompat.widget.DropDownListView dropDownListView;
                    if (i3 == -1 || (dropDownListView = androidx.appcompat.widget.ListPopupWindow.this.mDropDownList) == null) {
                        return;
                    }
                    dropDownListView.setListSelectionHidden(false);
                }
            });
            this.mDropDownList.setOnScrollListener(this.mScrollListener);
            android.widget.AdapterView.OnItemSelectedListener onItemSelectedListener = this.mItemSelectedListener;
            if (onItemSelectedListener != null) {
                this.mDropDownList.setOnItemSelectedListener(onItemSelectedListener);
            }
            androidx.appcompat.widget.DropDownListView dropDownListView = this.mDropDownList;
            android.view.View view2 = this.mPromptView;
            if (view2 != null) {
                android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(context);
                linearLayout.setOrientation(1);
                android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-1, 0, 1.0f);
                int i3 = this.mPromptPosition;
                if (i3 == 0) {
                    linearLayout.addView(view2);
                    linearLayout.addView(dropDownListView, layoutParams);
                } else if (i3 == 1) {
                    linearLayout.addView(dropDownListView, layoutParams);
                    linearLayout.addView(view2);
                } else {
                    android.util.Log.e(TAG, "Invalid hint position " + this.mPromptPosition);
                }
                int i4 = this.mDropDownWidth;
                if (i4 >= 0) {
                    i2 = Integer.MIN_VALUE;
                } else {
                    i4 = 0;
                    i2 = 0;
                }
                view2.measure(android.view.View.MeasureSpec.makeMeasureSpec(i4, i2), 0);
                android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) view2.getLayoutParams();
                measuredHeight = view2.getMeasuredHeight() + layoutParams2.topMargin + layoutParams2.bottomMargin;
                view = linearLayout;
            } else {
                measuredHeight = 0;
                view = dropDownListView;
            }
            this.mPopup.setContentView(view);
        } else {
            android.view.View view3 = this.mPromptView;
            if (view3 != null) {
                android.widget.LinearLayout.LayoutParams layoutParams3 = (android.widget.LinearLayout.LayoutParams) view3.getLayoutParams();
                measuredHeight = view3.getMeasuredHeight() + layoutParams3.topMargin + layoutParams3.bottomMargin;
            } else {
                measuredHeight = 0;
            }
        }
        android.graphics.drawable.Drawable background = this.mPopup.getBackground();
        if (background != null) {
            background.getPadding(this.mTempRect);
            i = this.mTempRect.top + this.mTempRect.bottom;
            if (!this.mDropDownVerticalOffsetSet) {
                this.mDropDownVerticalOffset = -this.mTempRect.top;
            }
        } else {
            this.mTempRect.setEmpty();
            i = 0;
        }
        int maxAvailableHeight = getMaxAvailableHeight(getAnchorView(), this.mDropDownVerticalOffset, this.mPopup.getInputMethodMode() == 2);
        if (this.mDropDownAlwaysVisible || this.mDropDownHeight == -1) {
            return maxAvailableHeight + i;
        }
        int i5 = this.mDropDownWidth;
        if (i5 == -2) {
            iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(this.mContext.getResources().getDisplayMetrics().widthPixels - (this.mTempRect.left + this.mTempRect.right), Integer.MIN_VALUE);
        } else if (i5 == -1) {
            iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(this.mContext.getResources().getDisplayMetrics().widthPixels - (this.mTempRect.left + this.mTempRect.right), 1073741824);
        } else {
            iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
        }
        int iMeasureHeightOfChildrenCompat = this.mDropDownList.measureHeightOfChildrenCompat(iMakeMeasureSpec, 0, -1, maxAvailableHeight - measuredHeight, -1);
        if (iMeasureHeightOfChildrenCompat > 0) {
            measuredHeight += i + this.mDropDownList.getPaddingTop() + this.mDropDownList.getPaddingBottom();
        }
        return iMeasureHeightOfChildrenCompat + measuredHeight;
    }

    public void setOverlapAnchor(boolean z) {
        this.mOverlapAnchorSet = true;
        this.mOverlapAnchor = z;
    }

    private class PopupDataSetObserver extends android.database.DataSetObserver {
        PopupDataSetObserver() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            if (androidx.appcompat.widget.ListPopupWindow.this.isShowing()) {
                androidx.appcompat.widget.ListPopupWindow.this.show();
            }
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            androidx.appcompat.widget.ListPopupWindow.this.dismiss();
        }
    }

    private class ListSelectorHider implements java.lang.Runnable {
        ListSelectorHider() {
        }

        @Override // java.lang.Runnable
        public void run() {
            androidx.appcompat.widget.ListPopupWindow.this.clearListSelection();
        }
    }

    private class ResizePopupRunnable implements java.lang.Runnable {
        ResizePopupRunnable() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (androidx.appcompat.widget.ListPopupWindow.this.mDropDownList == null || !androidx.core.view.ViewCompat.isAttachedToWindow(androidx.appcompat.widget.ListPopupWindow.this.mDropDownList) || androidx.appcompat.widget.ListPopupWindow.this.mDropDownList.getCount() <= androidx.appcompat.widget.ListPopupWindow.this.mDropDownList.getChildCount() || androidx.appcompat.widget.ListPopupWindow.this.mDropDownList.getChildCount() > androidx.appcompat.widget.ListPopupWindow.this.mListItemExpandMaximum) {
                return;
            }
            androidx.appcompat.widget.ListPopupWindow.this.mPopup.setInputMethodMode(2);
            androidx.appcompat.widget.ListPopupWindow.this.show();
        }
    }

    private class PopupTouchInterceptor implements android.view.View.OnTouchListener {
        PopupTouchInterceptor() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (action == 0 && androidx.appcompat.widget.ListPopupWindow.this.mPopup != null && androidx.appcompat.widget.ListPopupWindow.this.mPopup.isShowing() && x >= 0 && x < androidx.appcompat.widget.ListPopupWindow.this.mPopup.getWidth() && y >= 0 && y < androidx.appcompat.widget.ListPopupWindow.this.mPopup.getHeight()) {
                androidx.appcompat.widget.ListPopupWindow.this.mHandler.postDelayed(androidx.appcompat.widget.ListPopupWindow.this.mResizePopupRunnable, 250L);
                return false;
            }
            if (action != 1) {
                return false;
            }
            androidx.appcompat.widget.ListPopupWindow.this.mHandler.removeCallbacks(androidx.appcompat.widget.ListPopupWindow.this.mResizePopupRunnable);
            return false;
        }
    }

    private class PopupScrollListener implements android.widget.AbsListView.OnScrollListener {
        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(android.widget.AbsListView absListView, int i, int i2, int i3) {
        }

        PopupScrollListener() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(android.widget.AbsListView absListView, int i) {
            if (i != 1 || androidx.appcompat.widget.ListPopupWindow.this.isInputMethodNotNeeded() || androidx.appcompat.widget.ListPopupWindow.this.mPopup.getContentView() == null) {
                return;
            }
            androidx.appcompat.widget.ListPopupWindow.this.mHandler.removeCallbacks(androidx.appcompat.widget.ListPopupWindow.this.mResizePopupRunnable);
            androidx.appcompat.widget.ListPopupWindow.this.mResizePopupRunnable.run();
        }
    }

    private void setPopupClipToScreenEnabled(boolean z) {
        if (android.os.Build.VERSION.SDK_INT <= 28) {
            java.lang.reflect.Method method = sSetClipToWindowEnabledMethod;
            if (method != null) {
                try {
                    method.invoke(this.mPopup, java.lang.Boolean.valueOf(z));
                    return;
                } catch (java.lang.Exception unused) {
                    android.util.Log.i(TAG, "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                    return;
                }
            }
            return;
        }
        androidx.appcompat.widget.ListPopupWindow.Api29Impl.setIsClippedToScreen(this.mPopup, z);
    }

    private int getMaxAvailableHeight(android.view.View view, int i, boolean z) {
        return androidx.appcompat.widget.ListPopupWindow.Api24Impl.getMaxAvailableHeight(this.mPopup, view, i, z);
    }

    static class Api29Impl {
        private Api29Impl() {
        }

        static void setEpicenterBounds(android.widget.PopupWindow popupWindow, android.graphics.Rect rect) {
            popupWindow.setEpicenterBounds(rect);
        }

        static void setIsClippedToScreen(android.widget.PopupWindow popupWindow, boolean z) {
            popupWindow.setIsClippedToScreen(z);
        }
    }

    static class Api24Impl {
        private Api24Impl() {
        }

        static int getMaxAvailableHeight(android.widget.PopupWindow popupWindow, android.view.View view, int i, boolean z) {
            return popupWindow.getMaxAvailableHeight(view, i, z);
        }
    }
}
