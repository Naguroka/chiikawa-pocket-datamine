package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatSpinner extends android.widget.Spinner implements androidx.core.view.TintableBackgroundView {
    private static final int[] ATTRS_ANDROID_SPINNERMODE = {android.R.attr.spinnerMode};
    private static final int MAX_ITEMS_MEASURED = 15;
    private static final int MODE_DIALOG = 0;
    private static final int MODE_DROPDOWN = 1;
    private static final int MODE_THEME = -1;
    private static final java.lang.String TAG = "AppCompatSpinner";
    private final androidx.appcompat.widget.AppCompatBackgroundHelper mBackgroundTintHelper;
    int mDropDownWidth;
    private androidx.appcompat.widget.ForwardingListener mForwardingListener;
    private androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup mPopup;
    private final android.content.Context mPopupContext;
    private final boolean mPopupSet;
    private android.widget.SpinnerAdapter mTempAdapter;
    final android.graphics.Rect mTempRect;

    interface SpinnerPopup {
        void dismiss();

        android.graphics.drawable.Drawable getBackground();

        java.lang.CharSequence getHintText();

        int getHorizontalOffset();

        int getHorizontalOriginalOffset();

        int getVerticalOffset();

        boolean isShowing();

        void setAdapter(android.widget.ListAdapter listAdapter);

        void setBackgroundDrawable(android.graphics.drawable.Drawable drawable);

        void setHorizontalOffset(int i);

        void setHorizontalOriginalOffset(int i);

        void setPromptText(java.lang.CharSequence charSequence);

        void setVerticalOffset(int i);

        void show(int i, int i2);
    }

    public AppCompatSpinner(android.content.Context context) {
        this(context, (android.util.AttributeSet) null);
    }

    public AppCompatSpinner(android.content.Context context, int i) {
        this(context, null, androidx.appcompat.R.attr.spinnerStyle, i);
    }

    public AppCompatSpinner(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, androidx.appcompat.R.attr.spinnerStyle);
    }

    public AppCompatSpinner(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, -1);
    }

    public AppCompatSpinner(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        this(context, attributeSet, i, i2, null);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0051 A[PHI: r10 r11
  0x0051: PHI (r10v2 int) = (r10v0 int), (r10v4 int) binds: [B:24:0x0062, B:15:0x004f] A[DONT_GENERATE, DONT_INLINE]
  0x0051: PHI (r11v6 android.content.res.TypedArray) = (r11v5 android.content.res.TypedArray), (r11v8 android.content.res.TypedArray) binds: [B:24:0x0062, B:15:0x004f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    public AppCompatSpinner(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, android.content.res.Resources.Theme theme) throws java.lang.Throwable {
        android.content.res.TypedArray typedArrayObtainStyledAttributes;
        super(context, attributeSet, i);
        this.mTempRect = new android.graphics.Rect();
        androidx.appcompat.widget.ThemeUtils.checkAppCompatTheme(this, getContext());
        androidx.appcompat.widget.TintTypedArray tintTypedArrayObtainStyledAttributes = androidx.appcompat.widget.TintTypedArray.obtainStyledAttributes(context, attributeSet, androidx.appcompat.R.styleable.Spinner, i, 0);
        this.mBackgroundTintHelper = new androidx.appcompat.widget.AppCompatBackgroundHelper(this);
        if (theme != null) {
            this.mPopupContext = new androidx.appcompat.view.ContextThemeWrapper(context, theme);
        } else {
            int resourceId = tintTypedArrayObtainStyledAttributes.getResourceId(androidx.appcompat.R.styleable.Spinner_popupTheme, 0);
            if (resourceId != 0) {
                this.mPopupContext = new androidx.appcompat.view.ContextThemeWrapper(context, resourceId);
            } else {
                this.mPopupContext = context;
            }
        }
        android.content.res.TypedArray typedArray = 0;
        try {
            if (i2 == -1) {
                try {
                    typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ATTRS_ANDROID_SPINNERMODE, i, 0);
                    try {
                        i2 = typedArrayObtainStyledAttributes.hasValue(0) ? typedArrayObtainStyledAttributes.getInt(0, 0) : i2;
                        if (typedArrayObtainStyledAttributes != null) {
                            typedArrayObtainStyledAttributes.recycle();
                        }
                    } catch (java.lang.Exception e) {
                        e = e;
                        android.util.Log.i(TAG, "Could not read android:spinnerMode", e);
                        if (typedArrayObtainStyledAttributes != null) {
                            typedArrayObtainStyledAttributes.recycle();
                        }
                    }
                } catch (java.lang.Exception e2) {
                    e = e2;
                    typedArrayObtainStyledAttributes = null;
                } catch (java.lang.Throwable th) {
                    th = th;
                    if (typedArray != 0) {
                        typedArray.recycle();
                    }
                    throw th;
                }
            }
            if (i2 == 0) {
                androidx.appcompat.widget.AppCompatSpinner.DialogPopup dialogPopup = new androidx.appcompat.widget.AppCompatSpinner.DialogPopup();
                this.mPopup = dialogPopup;
                dialogPopup.setPromptText(tintTypedArrayObtainStyledAttributes.getString(androidx.appcompat.R.styleable.Spinner_android_prompt));
            } else if (i2 == 1) {
                final androidx.appcompat.widget.AppCompatSpinner.DropdownPopup dropdownPopup = new androidx.appcompat.widget.AppCompatSpinner.DropdownPopup(this.mPopupContext, attributeSet, i);
                androidx.appcompat.widget.TintTypedArray tintTypedArrayObtainStyledAttributes2 = androidx.appcompat.widget.TintTypedArray.obtainStyledAttributes(this.mPopupContext, attributeSet, androidx.appcompat.R.styleable.Spinner, i, 0);
                this.mDropDownWidth = tintTypedArrayObtainStyledAttributes2.getLayoutDimension(androidx.appcompat.R.styleable.Spinner_android_dropDownWidth, -2);
                dropdownPopup.setBackgroundDrawable(tintTypedArrayObtainStyledAttributes2.getDrawable(androidx.appcompat.R.styleable.Spinner_android_popupBackground));
                dropdownPopup.setPromptText(tintTypedArrayObtainStyledAttributes.getString(androidx.appcompat.R.styleable.Spinner_android_prompt));
                tintTypedArrayObtainStyledAttributes2.recycle();
                this.mPopup = dropdownPopup;
                this.mForwardingListener = new androidx.appcompat.widget.ForwardingListener(this) { // from class: androidx.appcompat.widget.AppCompatSpinner.1
                    @Override // androidx.appcompat.widget.ForwardingListener
                    public androidx.appcompat.view.menu.ShowableListMenu getPopup() {
                        return dropdownPopup;
                    }

                    @Override // androidx.appcompat.widget.ForwardingListener
                    public boolean onForwardingStarted() {
                        if (androidx.appcompat.widget.AppCompatSpinner.this.getInternalPopup().isShowing()) {
                            return true;
                        }
                        androidx.appcompat.widget.AppCompatSpinner.this.showPopup();
                        return true;
                    }
                };
            }
            java.lang.CharSequence[] textArray = tintTypedArrayObtainStyledAttributes.getTextArray(androidx.appcompat.R.styleable.Spinner_android_entries);
            if (textArray != null) {
                android.widget.ArrayAdapter arrayAdapter = new android.widget.ArrayAdapter(context, android.R.layout.simple_spinner_item, textArray);
                arrayAdapter.setDropDownViewResource(androidx.appcompat.R.layout.support_simple_spinner_dropdown_item);
                setAdapter((android.widget.SpinnerAdapter) arrayAdapter);
            }
            tintTypedArrayObtainStyledAttributes.recycle();
            this.mPopupSet = true;
            android.widget.SpinnerAdapter spinnerAdapter = this.mTempAdapter;
            if (spinnerAdapter != null) {
                setAdapter(spinnerAdapter);
                this.mTempAdapter = null;
            }
            this.mBackgroundTintHelper.loadFromAttributes(attributeSet, i);
        } catch (java.lang.Throwable th2) {
            th = th2;
            typedArray = -1;
        }
    }

    @Override // android.widget.Spinner
    public android.content.Context getPopupContext() {
        return this.mPopupContext;
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(android.graphics.drawable.Drawable drawable) {
        androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup spinnerPopup = this.mPopup;
        if (spinnerPopup != null) {
            spinnerPopup.setBackgroundDrawable(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(androidx.appcompat.content.res.AppCompatResources.getDrawable(getPopupContext(), i));
    }

    @Override // android.widget.Spinner
    public android.graphics.drawable.Drawable getPopupBackground() {
        androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup spinnerPopup = this.mPopup;
        if (spinnerPopup != null) {
            return spinnerPopup.getBackground();
        }
        return super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i) {
        androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup spinnerPopup = this.mPopup;
        if (spinnerPopup != null) {
            spinnerPopup.setVerticalOffset(i);
        } else {
            super.setDropDownVerticalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup spinnerPopup = this.mPopup;
        if (spinnerPopup != null) {
            return spinnerPopup.getVerticalOffset();
        }
        return super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i) {
        androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup spinnerPopup = this.mPopup;
        if (spinnerPopup != null) {
            spinnerPopup.setHorizontalOriginalOffset(i);
            this.mPopup.setHorizontalOffset(i);
        } else {
            super.setDropDownHorizontalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup spinnerPopup = this.mPopup;
        if (spinnerPopup != null) {
            return spinnerPopup.getHorizontalOffset();
        }
        return super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i) {
        if (this.mPopup != null) {
            this.mDropDownWidth = i;
        } else {
            super.setDropDownWidth(i);
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        if (this.mPopup != null) {
            return this.mDropDownWidth;
        }
        return super.getDropDownWidth();
    }

    @Override // android.widget.AdapterView
    public void setAdapter(android.widget.SpinnerAdapter spinnerAdapter) {
        if (!this.mPopupSet) {
            this.mTempAdapter = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.mPopup != null) {
            android.content.Context context = this.mPopupContext;
            if (context == null) {
                context = getContext();
            }
            this.mPopup.setAdapter(new androidx.appcompat.widget.AppCompatSpinner.DropDownAdapter(spinnerAdapter, context.getTheme()));
        }
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup spinnerPopup = this.mPopup;
        if (spinnerPopup == null || !spinnerPopup.isShowing()) {
            return;
        }
        this.mPopup.dismiss();
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        androidx.appcompat.widget.ForwardingListener forwardingListener = this.mForwardingListener;
        if (forwardingListener == null || !forwardingListener.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.mPopup == null || android.view.View.MeasureSpec.getMode(i) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(java.lang.Math.min(java.lang.Math.max(getMeasuredWidth(), compatMeasureContentWidth(getAdapter(), getBackground())), android.view.View.MeasureSpec.getSize(i)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean performClick() {
        androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup spinnerPopup = this.mPopup;
        if (spinnerPopup != null) {
            if (spinnerPopup.isShowing()) {
                return true;
            }
            showPopup();
            return true;
        }
        return super.performClick();
    }

    @Override // android.widget.Spinner
    public void setPrompt(java.lang.CharSequence charSequence) {
        androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup spinnerPopup = this.mPopup;
        if (spinnerPopup != null) {
            spinnerPopup.setPromptText(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    @Override // android.widget.Spinner
    public java.lang.CharSequence getPrompt() {
        androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup spinnerPopup = this.mPopup;
        return spinnerPopup != null ? spinnerPopup.getHintText() : super.getPrompt();
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        androidx.appcompat.widget.AppCompatBackgroundHelper appCompatBackgroundHelper = this.mBackgroundTintHelper;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.onSetBackgroundResource(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(android.graphics.drawable.Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        androidx.appcompat.widget.AppCompatBackgroundHelper appCompatBackgroundHelper = this.mBackgroundTintHelper;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.onSetBackgroundDrawable(drawable);
        }
    }

    @Override // androidx.core.view.TintableBackgroundView
    public void setSupportBackgroundTintList(android.content.res.ColorStateList colorStateList) {
        androidx.appcompat.widget.AppCompatBackgroundHelper appCompatBackgroundHelper = this.mBackgroundTintHelper;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.setSupportBackgroundTintList(colorStateList);
        }
    }

    @Override // androidx.core.view.TintableBackgroundView
    public android.content.res.ColorStateList getSupportBackgroundTintList() {
        androidx.appcompat.widget.AppCompatBackgroundHelper appCompatBackgroundHelper = this.mBackgroundTintHelper;
        if (appCompatBackgroundHelper != null) {
            return appCompatBackgroundHelper.getSupportBackgroundTintList();
        }
        return null;
    }

    @Override // androidx.core.view.TintableBackgroundView
    public void setSupportBackgroundTintMode(android.graphics.PorterDuff.Mode mode) {
        androidx.appcompat.widget.AppCompatBackgroundHelper appCompatBackgroundHelper = this.mBackgroundTintHelper;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.setSupportBackgroundTintMode(mode);
        }
    }

    @Override // androidx.core.view.TintableBackgroundView
    public android.graphics.PorterDuff.Mode getSupportBackgroundTintMode() {
        androidx.appcompat.widget.AppCompatBackgroundHelper appCompatBackgroundHelper = this.mBackgroundTintHelper;
        if (appCompatBackgroundHelper != null) {
            return appCompatBackgroundHelper.getSupportBackgroundTintMode();
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        androidx.appcompat.widget.AppCompatBackgroundHelper appCompatBackgroundHelper = this.mBackgroundTintHelper;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.applySupportBackgroundTint();
        }
    }

    int compatMeasureContentWidth(android.widget.SpinnerAdapter spinnerAdapter, android.graphics.drawable.Drawable drawable) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMax = java.lang.Math.max(0, getSelectedItemPosition());
        int iMin = java.lang.Math.min(spinnerAdapter.getCount(), iMax + 15);
        android.view.View view = null;
        int iMax2 = 0;
        for (int iMax3 = java.lang.Math.max(0, iMax - (15 - (iMin - iMax))); iMax3 < iMin; iMax3++) {
            int itemViewType = spinnerAdapter.getItemViewType(iMax3);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = spinnerAdapter.getView(iMax3, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new android.view.ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax2 = java.lang.Math.max(iMax2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return iMax2;
        }
        drawable.getPadding(this.mTempRect);
        return iMax2 + this.mTempRect.left + this.mTempRect.right;
    }

    final androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup getInternalPopup() {
        return this.mPopup;
    }

    void showPopup() {
        this.mPopup.show(androidx.appcompat.widget.AppCompatSpinner.Api17Impl.getTextDirection(this), androidx.appcompat.widget.AppCompatSpinner.Api17Impl.getTextAlignment(this));
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public android.os.Parcelable onSaveInstanceState() {
        androidx.appcompat.widget.AppCompatSpinner.SavedState savedState = new androidx.appcompat.widget.AppCompatSpinner.SavedState(super.onSaveInstanceState());
        androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup spinnerPopup = this.mPopup;
        savedState.mShowDropdown = spinnerPopup != null && spinnerPopup.isShowing();
        return savedState;
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onRestoreInstanceState(android.os.Parcelable parcelable) {
        android.view.ViewTreeObserver viewTreeObserver;
        androidx.appcompat.widget.AppCompatSpinner.SavedState savedState = (androidx.appcompat.widget.AppCompatSpinner.SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (!savedState.mShowDropdown || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new android.view.ViewTreeObserver.OnGlobalLayoutListener() { // from class: androidx.appcompat.widget.AppCompatSpinner.2
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                if (!androidx.appcompat.widget.AppCompatSpinner.this.getInternalPopup().isShowing()) {
                    androidx.appcompat.widget.AppCompatSpinner.this.showPopup();
                }
                android.view.ViewTreeObserver viewTreeObserver2 = androidx.appcompat.widget.AppCompatSpinner.this.getViewTreeObserver();
                if (viewTreeObserver2 != null) {
                    androidx.appcompat.widget.AppCompatSpinner.Api16Impl.removeOnGlobalLayoutListener(viewTreeObserver2, this);
                }
            }
        });
    }

    static class SavedState extends android.view.View.BaseSavedState {
        public static final android.os.Parcelable.Creator<androidx.appcompat.widget.AppCompatSpinner.SavedState> CREATOR = new android.os.Parcelable.Creator<androidx.appcompat.widget.AppCompatSpinner.SavedState>() { // from class: androidx.appcompat.widget.AppCompatSpinner.SavedState.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public androidx.appcompat.widget.AppCompatSpinner.SavedState createFromParcel(android.os.Parcel parcel) {
                return new androidx.appcompat.widget.AppCompatSpinner.SavedState(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public androidx.appcompat.widget.AppCompatSpinner.SavedState[] newArray(int i) {
                return new androidx.appcompat.widget.AppCompatSpinner.SavedState[i];
            }
        };
        boolean mShowDropdown;

        SavedState(android.os.Parcelable parcelable) {
            super(parcelable);
        }

        SavedState(android.os.Parcel parcel) {
            super(parcel);
            this.mShowDropdown = parcel.readByte() != 0;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeByte(this.mShowDropdown ? (byte) 1 : (byte) 0);
        }
    }

    private static class DropDownAdapter implements android.widget.ListAdapter, android.widget.SpinnerAdapter {
        private android.widget.SpinnerAdapter mAdapter;
        private android.widget.ListAdapter mListAdapter;

        @Override // android.widget.Adapter
        public int getItemViewType(int i) {
            return 0;
        }

        @Override // android.widget.Adapter
        public int getViewTypeCount() {
            return 1;
        }

        public DropDownAdapter(android.widget.SpinnerAdapter spinnerAdapter, android.content.res.Resources.Theme theme) {
            this.mAdapter = spinnerAdapter;
            if (spinnerAdapter instanceof android.widget.ListAdapter) {
                this.mListAdapter = (android.widget.ListAdapter) spinnerAdapter;
            }
            if (theme != null) {
                if (spinnerAdapter instanceof android.widget.ThemedSpinnerAdapter) {
                    androidx.appcompat.widget.AppCompatSpinner.Api23Impl.setDropDownViewTheme((android.widget.ThemedSpinnerAdapter) spinnerAdapter, theme);
                } else if (spinnerAdapter instanceof androidx.appcompat.widget.ThemedSpinnerAdapter) {
                    androidx.appcompat.widget.ThemedSpinnerAdapter themedSpinnerAdapter = (androidx.appcompat.widget.ThemedSpinnerAdapter) spinnerAdapter;
                    if (themedSpinnerAdapter.getDropDownViewTheme() == null) {
                        themedSpinnerAdapter.setDropDownViewTheme(theme);
                    }
                }
            }
        }

        @Override // android.widget.Adapter
        public int getCount() {
            android.widget.SpinnerAdapter spinnerAdapter = this.mAdapter;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        @Override // android.widget.Adapter
        public java.lang.Object getItem(int i) {
            android.widget.SpinnerAdapter spinnerAdapter = this.mAdapter;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            android.widget.SpinnerAdapter spinnerAdapter = this.mAdapter;
            if (spinnerAdapter == null) {
                return -1L;
            }
            return spinnerAdapter.getItemId(i);
        }

        @Override // android.widget.Adapter
        public android.view.View getView(int i, android.view.View view, android.view.ViewGroup viewGroup) {
            return getDropDownView(i, view, viewGroup);
        }

        @Override // android.widget.SpinnerAdapter
        public android.view.View getDropDownView(int i, android.view.View view, android.view.ViewGroup viewGroup) {
            android.widget.SpinnerAdapter spinnerAdapter = this.mAdapter;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public boolean hasStableIds() {
            android.widget.SpinnerAdapter spinnerAdapter = this.mAdapter;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        @Override // android.widget.Adapter
        public void registerDataSetObserver(android.database.DataSetObserver dataSetObserver) {
            android.widget.SpinnerAdapter spinnerAdapter = this.mAdapter;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        @Override // android.widget.Adapter
        public void unregisterDataSetObserver(android.database.DataSetObserver dataSetObserver) {
            android.widget.SpinnerAdapter spinnerAdapter = this.mAdapter;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }

        @Override // android.widget.ListAdapter
        public boolean areAllItemsEnabled() {
            android.widget.ListAdapter listAdapter = this.mListAdapter;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        @Override // android.widget.ListAdapter
        public boolean isEnabled(int i) {
            android.widget.ListAdapter listAdapter = this.mListAdapter;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i);
            }
            return true;
        }

        @Override // android.widget.Adapter
        public boolean isEmpty() {
            return getCount() == 0;
        }
    }

    class DialogPopup implements androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup, android.content.DialogInterface.OnClickListener {
        private android.widget.ListAdapter mListAdapter;
        androidx.appcompat.app.AlertDialog mPopup;
        private java.lang.CharSequence mPrompt;

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public android.graphics.drawable.Drawable getBackground() {
            return null;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public int getHorizontalOffset() {
            return 0;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public int getHorizontalOriginalOffset() {
            return 0;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public int getVerticalOffset() {
            return 0;
        }

        DialogPopup() {
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public void dismiss() {
            androidx.appcompat.app.AlertDialog alertDialog = this.mPopup;
            if (alertDialog != null) {
                alertDialog.dismiss();
                this.mPopup = null;
            }
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public boolean isShowing() {
            androidx.appcompat.app.AlertDialog alertDialog = this.mPopup;
            if (alertDialog != null) {
                return alertDialog.isShowing();
            }
            return false;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public void setAdapter(android.widget.ListAdapter listAdapter) {
            this.mListAdapter = listAdapter;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public void setPromptText(java.lang.CharSequence charSequence) {
            this.mPrompt = charSequence;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public java.lang.CharSequence getHintText() {
            return this.mPrompt;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public void show(int i, int i2) {
            if (this.mListAdapter == null) {
                return;
            }
            androidx.appcompat.app.AlertDialog.Builder builder = new androidx.appcompat.app.AlertDialog.Builder(androidx.appcompat.widget.AppCompatSpinner.this.getPopupContext());
            java.lang.CharSequence charSequence = this.mPrompt;
            if (charSequence != null) {
                builder.setTitle(charSequence);
            }
            androidx.appcompat.app.AlertDialog alertDialogCreate = builder.setSingleChoiceItems(this.mListAdapter, androidx.appcompat.widget.AppCompatSpinner.this.getSelectedItemPosition(), this).create();
            this.mPopup = alertDialogCreate;
            android.widget.ListView listView = alertDialogCreate.getListView();
            androidx.appcompat.widget.AppCompatSpinner.Api17Impl.setTextDirection(listView, i);
            androidx.appcompat.widget.AppCompatSpinner.Api17Impl.setTextAlignment(listView, i2);
            this.mPopup.show();
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(android.content.DialogInterface dialogInterface, int i) {
            androidx.appcompat.widget.AppCompatSpinner.this.setSelection(i);
            if (androidx.appcompat.widget.AppCompatSpinner.this.getOnItemClickListener() != null) {
                androidx.appcompat.widget.AppCompatSpinner.this.performItemClick(null, i, this.mListAdapter.getItemId(i));
            }
            dismiss();
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public void setBackgroundDrawable(android.graphics.drawable.Drawable drawable) {
            android.util.Log.e(androidx.appcompat.widget.AppCompatSpinner.TAG, "Cannot set popup background for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public void setVerticalOffset(int i) {
            android.util.Log.e(androidx.appcompat.widget.AppCompatSpinner.TAG, "Cannot set vertical offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public void setHorizontalOffset(int i) {
            android.util.Log.e(androidx.appcompat.widget.AppCompatSpinner.TAG, "Cannot set horizontal offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public void setHorizontalOriginalOffset(int i) {
            android.util.Log.e(androidx.appcompat.widget.AppCompatSpinner.TAG, "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
        }
    }

    class DropdownPopup extends androidx.appcompat.widget.ListPopupWindow implements androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup {
        android.widget.ListAdapter mAdapter;
        private java.lang.CharSequence mHintText;
        private int mOriginalHorizontalOffset;
        private final android.graphics.Rect mVisibleRect;

        public DropdownPopup(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.mVisibleRect = new android.graphics.Rect();
            setAnchorView(androidx.appcompat.widget.AppCompatSpinner.this);
            setModal(true);
            setPromptPosition(0);
            setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() { // from class: androidx.appcompat.widget.AppCompatSpinner.DropdownPopup.1
                @Override // android.widget.AdapterView.OnItemClickListener
                public void onItemClick(android.widget.AdapterView<?> adapterView, android.view.View view, int i2, long j) {
                    androidx.appcompat.widget.AppCompatSpinner.this.setSelection(i2);
                    if (androidx.appcompat.widget.AppCompatSpinner.this.getOnItemClickListener() != null) {
                        androidx.appcompat.widget.AppCompatSpinner.this.performItemClick(view, i2, androidx.appcompat.widget.AppCompatSpinner.DropdownPopup.this.mAdapter.getItemId(i2));
                    }
                    androidx.appcompat.widget.AppCompatSpinner.DropdownPopup.this.dismiss();
                }
            });
        }

        @Override // androidx.appcompat.widget.ListPopupWindow, androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public void setAdapter(android.widget.ListAdapter listAdapter) {
            super.setAdapter(listAdapter);
            this.mAdapter = listAdapter;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public java.lang.CharSequence getHintText() {
            return this.mHintText;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public void setPromptText(java.lang.CharSequence charSequence) {
            this.mHintText = charSequence;
        }

        void computeContentWidth() {
            int i;
            int horizontalOriginalOffset;
            android.graphics.drawable.Drawable background = getBackground();
            if (background != null) {
                background.getPadding(androidx.appcompat.widget.AppCompatSpinner.this.mTempRect);
                i = androidx.appcompat.widget.ViewUtils.isLayoutRtl(androidx.appcompat.widget.AppCompatSpinner.this) ? androidx.appcompat.widget.AppCompatSpinner.this.mTempRect.right : -androidx.appcompat.widget.AppCompatSpinner.this.mTempRect.left;
            } else {
                android.graphics.Rect rect = androidx.appcompat.widget.AppCompatSpinner.this.mTempRect;
                androidx.appcompat.widget.AppCompatSpinner.this.mTempRect.right = 0;
                rect.left = 0;
                i = 0;
            }
            int paddingLeft = androidx.appcompat.widget.AppCompatSpinner.this.getPaddingLeft();
            int paddingRight = androidx.appcompat.widget.AppCompatSpinner.this.getPaddingRight();
            int width = androidx.appcompat.widget.AppCompatSpinner.this.getWidth();
            if (androidx.appcompat.widget.AppCompatSpinner.this.mDropDownWidth == -2) {
                int iCompatMeasureContentWidth = androidx.appcompat.widget.AppCompatSpinner.this.compatMeasureContentWidth((android.widget.SpinnerAdapter) this.mAdapter, getBackground());
                int i2 = (androidx.appcompat.widget.AppCompatSpinner.this.getContext().getResources().getDisplayMetrics().widthPixels - androidx.appcompat.widget.AppCompatSpinner.this.mTempRect.left) - androidx.appcompat.widget.AppCompatSpinner.this.mTempRect.right;
                if (iCompatMeasureContentWidth > i2) {
                    iCompatMeasureContentWidth = i2;
                }
                setContentWidth(java.lang.Math.max(iCompatMeasureContentWidth, (width - paddingLeft) - paddingRight));
            } else if (androidx.appcompat.widget.AppCompatSpinner.this.mDropDownWidth == -1) {
                setContentWidth((width - paddingLeft) - paddingRight);
            } else {
                setContentWidth(androidx.appcompat.widget.AppCompatSpinner.this.mDropDownWidth);
            }
            if (androidx.appcompat.widget.ViewUtils.isLayoutRtl(androidx.appcompat.widget.AppCompatSpinner.this)) {
                horizontalOriginalOffset = i + (((width - paddingRight) - getWidth()) - getHorizontalOriginalOffset());
            } else {
                horizontalOriginalOffset = i + paddingLeft + getHorizontalOriginalOffset();
            }
            setHorizontalOffset(horizontalOriginalOffset);
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public void show(int i, int i2) {
            android.view.ViewTreeObserver viewTreeObserver;
            boolean zIsShowing = isShowing();
            computeContentWidth();
            setInputMethodMode(2);
            super.show();
            android.widget.ListView listView = getListView();
            listView.setChoiceMode(1);
            androidx.appcompat.widget.AppCompatSpinner.Api17Impl.setTextDirection(listView, i);
            androidx.appcompat.widget.AppCompatSpinner.Api17Impl.setTextAlignment(listView, i2);
            setSelection(androidx.appcompat.widget.AppCompatSpinner.this.getSelectedItemPosition());
            if (zIsShowing || (viewTreeObserver = androidx.appcompat.widget.AppCompatSpinner.this.getViewTreeObserver()) == null) {
                return;
            }
            final android.view.ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = new android.view.ViewTreeObserver.OnGlobalLayoutListener() { // from class: androidx.appcompat.widget.AppCompatSpinner.DropdownPopup.2
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public void onGlobalLayout() {
                    androidx.appcompat.widget.AppCompatSpinner.DropdownPopup dropdownPopup = androidx.appcompat.widget.AppCompatSpinner.DropdownPopup.this;
                    if (!dropdownPopup.isVisibleToUser(androidx.appcompat.widget.AppCompatSpinner.this)) {
                        androidx.appcompat.widget.AppCompatSpinner.DropdownPopup.this.dismiss();
                    } else {
                        androidx.appcompat.widget.AppCompatSpinner.DropdownPopup.this.computeContentWidth();
                        androidx.appcompat.widget.AppCompatSpinner.DropdownPopup.super.show();
                    }
                }
            };
            viewTreeObserver.addOnGlobalLayoutListener(onGlobalLayoutListener);
            setOnDismissListener(new android.widget.PopupWindow.OnDismissListener() { // from class: androidx.appcompat.widget.AppCompatSpinner.DropdownPopup.3
                @Override // android.widget.PopupWindow.OnDismissListener
                public void onDismiss() {
                    android.view.ViewTreeObserver viewTreeObserver2 = androidx.appcompat.widget.AppCompatSpinner.this.getViewTreeObserver();
                    if (viewTreeObserver2 != null) {
                        viewTreeObserver2.removeGlobalOnLayoutListener(onGlobalLayoutListener);
                    }
                }
            });
        }

        boolean isVisibleToUser(android.view.View view) {
            return androidx.core.view.ViewCompat.isAttachedToWindow(view) && view.getGlobalVisibleRect(this.mVisibleRect);
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public void setHorizontalOriginalOffset(int i) {
            this.mOriginalHorizontalOffset = i;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public int getHorizontalOriginalOffset() {
            return this.mOriginalHorizontalOffset;
        }
    }

    private static final class Api23Impl {
        private Api23Impl() {
        }

        static void setDropDownViewTheme(android.widget.ThemedSpinnerAdapter themedSpinnerAdapter, android.content.res.Resources.Theme theme) {
            if (androidx.core.util.ObjectsCompat.equals(themedSpinnerAdapter.getDropDownViewTheme(), theme)) {
                return;
            }
            themedSpinnerAdapter.setDropDownViewTheme(theme);
        }
    }

    private static final class Api17Impl {
        private Api17Impl() {
        }

        static int getTextAlignment(android.view.View view) {
            return view.getTextAlignment();
        }

        static void setTextAlignment(android.view.View view, int i) {
            view.setTextAlignment(i);
        }

        static int getTextDirection(android.view.View view) {
            return view.getTextDirection();
        }

        static void setTextDirection(android.view.View view, int i) {
            view.setTextDirection(i);
        }
    }

    private static final class Api16Impl {
        private Api16Impl() {
        }

        static void removeOnGlobalLayoutListener(android.view.ViewTreeObserver viewTreeObserver, android.view.ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }
}
