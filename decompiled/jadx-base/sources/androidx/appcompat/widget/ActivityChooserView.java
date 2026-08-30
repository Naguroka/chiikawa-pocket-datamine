package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
public class ActivityChooserView extends android.view.ViewGroup implements androidx.appcompat.widget.ActivityChooserModel.ActivityChooserModelClient {
    private final android.view.View mActivityChooserContent;
    private final android.graphics.drawable.Drawable mActivityChooserContentBackground;
    final androidx.appcompat.widget.ActivityChooserView.ActivityChooserViewAdapter mAdapter;
    private final androidx.appcompat.widget.ActivityChooserView.Callbacks mCallbacks;
    private int mDefaultActionButtonContentDescription;
    final android.widget.FrameLayout mDefaultActivityButton;
    private final android.widget.ImageView mDefaultActivityButtonImage;
    final android.widget.FrameLayout mExpandActivityOverflowButton;
    private final android.widget.ImageView mExpandActivityOverflowButtonImage;
    int mInitialActivityCount;
    private boolean mIsAttachedToWindow;
    boolean mIsSelectingDefaultActivity;
    private final int mListPopupMaxWidth;
    private androidx.appcompat.widget.ListPopupWindow mListPopupWindow;
    final android.database.DataSetObserver mModelDataSetObserver;
    android.widget.PopupWindow.OnDismissListener mOnDismissListener;
    private final android.view.ViewTreeObserver.OnGlobalLayoutListener mOnGlobalLayoutListener;
    androidx.core.view.ActionProvider mProvider;

    public ActivityChooserView(android.content.Context context) {
        this(context, null);
    }

    public ActivityChooserView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActivityChooserView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mModelDataSetObserver = new android.database.DataSetObserver() { // from class: androidx.appcompat.widget.ActivityChooserView.1
            @Override // android.database.DataSetObserver
            public void onChanged() {
                super.onChanged();
                androidx.appcompat.widget.ActivityChooserView.this.mAdapter.notifyDataSetChanged();
            }

            @Override // android.database.DataSetObserver
            public void onInvalidated() {
                super.onInvalidated();
                androidx.appcompat.widget.ActivityChooserView.this.mAdapter.notifyDataSetInvalidated();
            }
        };
        this.mOnGlobalLayoutListener = new android.view.ViewTreeObserver.OnGlobalLayoutListener() { // from class: androidx.appcompat.widget.ActivityChooserView.2
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                if (androidx.appcompat.widget.ActivityChooserView.this.isShowingPopup()) {
                    if (!androidx.appcompat.widget.ActivityChooserView.this.isShown()) {
                        androidx.appcompat.widget.ActivityChooserView.this.getListPopupWindow().dismiss();
                        return;
                    }
                    androidx.appcompat.widget.ActivityChooserView.this.getListPopupWindow().show();
                    if (androidx.appcompat.widget.ActivityChooserView.this.mProvider != null) {
                        androidx.appcompat.widget.ActivityChooserView.this.mProvider.subUiVisibilityChanged(true);
                    }
                }
            }
        };
        this.mInitialActivityCount = 4;
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.appcompat.R.styleable.ActivityChooserView, i, 0);
        androidx.core.view.ViewCompat.saveAttributeDataForStyleable(this, context, androidx.appcompat.R.styleable.ActivityChooserView, attributeSet, typedArrayObtainStyledAttributes, i, 0);
        this.mInitialActivityCount = typedArrayObtainStyledAttributes.getInt(androidx.appcompat.R.styleable.ActivityChooserView_initialActivityCount, 4);
        android.graphics.drawable.Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(androidx.appcompat.R.styleable.ActivityChooserView_expandActivityOverflowButtonDrawable);
        typedArrayObtainStyledAttributes.recycle();
        android.view.LayoutInflater.from(getContext()).inflate(androidx.appcompat.R.layout.abc_activity_chooser_view, (android.view.ViewGroup) this, true);
        androidx.appcompat.widget.ActivityChooserView.Callbacks callbacks = new androidx.appcompat.widget.ActivityChooserView.Callbacks();
        this.mCallbacks = callbacks;
        android.view.View viewFindViewById = findViewById(androidx.appcompat.R.id.activity_chooser_view_content);
        this.mActivityChooserContent = viewFindViewById;
        this.mActivityChooserContentBackground = viewFindViewById.getBackground();
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) findViewById(androidx.appcompat.R.id.default_activity_button);
        this.mDefaultActivityButton = frameLayout;
        frameLayout.setOnClickListener(callbacks);
        frameLayout.setOnLongClickListener(callbacks);
        this.mDefaultActivityButtonImage = (android.widget.ImageView) frameLayout.findViewById(androidx.appcompat.R.id.image);
        android.widget.FrameLayout frameLayout2 = (android.widget.FrameLayout) findViewById(androidx.appcompat.R.id.expand_activities_button);
        frameLayout2.setOnClickListener(callbacks);
        frameLayout2.setAccessibilityDelegate(new android.view.View.AccessibilityDelegate() { // from class: androidx.appcompat.widget.ActivityChooserView.3
            @Override // android.view.View.AccessibilityDelegate
            public void onInitializeAccessibilityNodeInfo(android.view.View view, android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat.wrap(accessibilityNodeInfo).setCanOpenPopup(true);
            }
        });
        frameLayout2.setOnTouchListener(new androidx.appcompat.widget.ForwardingListener(frameLayout2) { // from class: androidx.appcompat.widget.ActivityChooserView.4
            @Override // androidx.appcompat.widget.ForwardingListener
            public androidx.appcompat.view.menu.ShowableListMenu getPopup() {
                return androidx.appcompat.widget.ActivityChooserView.this.getListPopupWindow();
            }

            @Override // androidx.appcompat.widget.ForwardingListener
            protected boolean onForwardingStarted() {
                androidx.appcompat.widget.ActivityChooserView.this.showPopup();
                return true;
            }

            @Override // androidx.appcompat.widget.ForwardingListener
            protected boolean onForwardingStopped() {
                androidx.appcompat.widget.ActivityChooserView.this.dismissPopup();
                return true;
            }
        });
        this.mExpandActivityOverflowButton = frameLayout2;
        android.widget.ImageView imageView = (android.widget.ImageView) frameLayout2.findViewById(androidx.appcompat.R.id.image);
        this.mExpandActivityOverflowButtonImage = imageView;
        imageView.setImageDrawable(drawable);
        androidx.appcompat.widget.ActivityChooserView.ActivityChooserViewAdapter activityChooserViewAdapter = new androidx.appcompat.widget.ActivityChooserView.ActivityChooserViewAdapter();
        this.mAdapter = activityChooserViewAdapter;
        activityChooserViewAdapter.registerDataSetObserver(new android.database.DataSetObserver() { // from class: androidx.appcompat.widget.ActivityChooserView.5
            @Override // android.database.DataSetObserver
            public void onChanged() {
                super.onChanged();
                androidx.appcompat.widget.ActivityChooserView.this.updateAppearance();
            }
        });
        android.content.res.Resources resources = context.getResources();
        this.mListPopupMaxWidth = java.lang.Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(androidx.appcompat.R.dimen.abc_config_prefDialogWidth));
    }

    @Override // androidx.appcompat.widget.ActivityChooserModel.ActivityChooserModelClient
    public void setActivityChooserModel(androidx.appcompat.widget.ActivityChooserModel activityChooserModel) {
        this.mAdapter.setDataModel(activityChooserModel);
        if (isShowingPopup()) {
            dismissPopup();
            showPopup();
        }
    }

    public void setExpandActivityOverflowButtonDrawable(android.graphics.drawable.Drawable drawable) {
        this.mExpandActivityOverflowButtonImage.setImageDrawable(drawable);
    }

    public void setExpandActivityOverflowButtonContentDescription(int i) {
        this.mExpandActivityOverflowButtonImage.setContentDescription(getContext().getString(i));
    }

    public void setProvider(androidx.core.view.ActionProvider actionProvider) {
        this.mProvider = actionProvider;
    }

    public boolean showPopup() {
        if (isShowingPopup() || !this.mIsAttachedToWindow) {
            return false;
        }
        this.mIsSelectingDefaultActivity = false;
        showPopupUnchecked(this.mInitialActivityCount);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean, int] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    void showPopupUnchecked(int i) {
        if (this.mAdapter.getDataModel() == null) {
            throw new java.lang.IllegalStateException("No data model. Did you call #setDataModel?");
        }
        getViewTreeObserver().addOnGlobalLayoutListener(this.mOnGlobalLayoutListener);
        ?? r0 = this.mDefaultActivityButton.getVisibility() == 0 ? 1 : 0;
        int activityCount = this.mAdapter.getActivityCount();
        if (i != Integer.MAX_VALUE && activityCount > i + r0) {
            this.mAdapter.setShowFooterView(true);
            this.mAdapter.setMaxActivityCount(i - 1);
        } else {
            this.mAdapter.setShowFooterView(false);
            this.mAdapter.setMaxActivityCount(i);
        }
        androidx.appcompat.widget.ListPopupWindow listPopupWindow = getListPopupWindow();
        if (listPopupWindow.isShowing()) {
            return;
        }
        if (this.mIsSelectingDefaultActivity || r0 == 0) {
            this.mAdapter.setShowDefaultActivity(true, r0);
        } else {
            this.mAdapter.setShowDefaultActivity(false, false);
        }
        listPopupWindow.setContentWidth(java.lang.Math.min(this.mAdapter.measureContentWidth(), this.mListPopupMaxWidth));
        listPopupWindow.show();
        androidx.core.view.ActionProvider actionProvider = this.mProvider;
        if (actionProvider != null) {
            actionProvider.subUiVisibilityChanged(true);
        }
        listPopupWindow.getListView().setContentDescription(getContext().getString(androidx.appcompat.R.string.abc_activitychooserview_choose_application));
        listPopupWindow.getListView().setSelector(new android.graphics.drawable.ColorDrawable(0));
    }

    public boolean dismissPopup() {
        if (!isShowingPopup()) {
            return true;
        }
        getListPopupWindow().dismiss();
        android.view.ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (!viewTreeObserver.isAlive()) {
            return true;
        }
        viewTreeObserver.removeGlobalOnLayoutListener(this.mOnGlobalLayoutListener);
        return true;
    }

    public boolean isShowingPopup() {
        return getListPopupWindow().isShowing();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        androidx.appcompat.widget.ActivityChooserModel dataModel = this.mAdapter.getDataModel();
        if (dataModel != null) {
            dataModel.registerObserver(this.mModelDataSetObserver);
        }
        this.mIsAttachedToWindow = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        androidx.appcompat.widget.ActivityChooserModel dataModel = this.mAdapter.getDataModel();
        if (dataModel != null) {
            dataModel.unregisterObserver(this.mModelDataSetObserver);
        }
        android.view.ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.mOnGlobalLayoutListener);
        }
        if (isShowingPopup()) {
            dismissPopup();
        }
        this.mIsAttachedToWindow = false;
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        android.view.View view = this.mActivityChooserContent;
        if (this.mDefaultActivityButton.getVisibility() != 0) {
            i2 = android.view.View.MeasureSpec.makeMeasureSpec(android.view.View.MeasureSpec.getSize(i2), 1073741824);
        }
        measureChild(view, i, i2);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.mActivityChooserContent.layout(0, 0, i3 - i, i4 - i2);
        if (isShowingPopup()) {
            return;
        }
        dismissPopup();
    }

    public androidx.appcompat.widget.ActivityChooserModel getDataModel() {
        return this.mAdapter.getDataModel();
    }

    public void setOnDismissListener(android.widget.PopupWindow.OnDismissListener onDismissListener) {
        this.mOnDismissListener = onDismissListener;
    }

    public void setInitialActivityCount(int i) {
        this.mInitialActivityCount = i;
    }

    public void setDefaultActionButtonContentDescription(int i) {
        this.mDefaultActionButtonContentDescription = i;
    }

    androidx.appcompat.widget.ListPopupWindow getListPopupWindow() {
        if (this.mListPopupWindow == null) {
            androidx.appcompat.widget.ListPopupWindow listPopupWindow = new androidx.appcompat.widget.ListPopupWindow(getContext());
            this.mListPopupWindow = listPopupWindow;
            listPopupWindow.setAdapter(this.mAdapter);
            this.mListPopupWindow.setAnchorView(this);
            this.mListPopupWindow.setModal(true);
            this.mListPopupWindow.setOnItemClickListener(this.mCallbacks);
            this.mListPopupWindow.setOnDismissListener(this.mCallbacks);
        }
        return this.mListPopupWindow;
    }

    void updateAppearance() {
        if (this.mAdapter.getCount() > 0) {
            this.mExpandActivityOverflowButton.setEnabled(true);
        } else {
            this.mExpandActivityOverflowButton.setEnabled(false);
        }
        int activityCount = this.mAdapter.getActivityCount();
        int historySize = this.mAdapter.getHistorySize();
        if (activityCount == 1 || (activityCount > 1 && historySize > 0)) {
            this.mDefaultActivityButton.setVisibility(0);
            android.content.pm.ResolveInfo defaultActivity = this.mAdapter.getDefaultActivity();
            android.content.pm.PackageManager packageManager = getContext().getPackageManager();
            this.mDefaultActivityButtonImage.setImageDrawable(defaultActivity.loadIcon(packageManager));
            if (this.mDefaultActionButtonContentDescription != 0) {
                this.mDefaultActivityButton.setContentDescription(getContext().getString(this.mDefaultActionButtonContentDescription, defaultActivity.loadLabel(packageManager)));
            }
        } else {
            this.mDefaultActivityButton.setVisibility(8);
        }
        if (this.mDefaultActivityButton.getVisibility() == 0) {
            this.mActivityChooserContent.setBackgroundDrawable(this.mActivityChooserContentBackground);
        } else {
            this.mActivityChooserContent.setBackgroundDrawable(null);
        }
    }

    private class Callbacks implements android.widget.AdapterView.OnItemClickListener, android.view.View.OnClickListener, android.view.View.OnLongClickListener, android.widget.PopupWindow.OnDismissListener {
        Callbacks() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(android.widget.AdapterView<?> adapterView, android.view.View view, int i, long j) {
            int itemViewType = ((androidx.appcompat.widget.ActivityChooserView.ActivityChooserViewAdapter) adapterView.getAdapter()).getItemViewType(i);
            if (itemViewType != 0) {
                if (itemViewType == 1) {
                    androidx.appcompat.widget.ActivityChooserView.this.showPopupUnchecked(Integer.MAX_VALUE);
                    return;
                }
                throw new java.lang.IllegalArgumentException();
            }
            androidx.appcompat.widget.ActivityChooserView.this.dismissPopup();
            if (androidx.appcompat.widget.ActivityChooserView.this.mIsSelectingDefaultActivity) {
                if (i > 0) {
                    androidx.appcompat.widget.ActivityChooserView.this.mAdapter.getDataModel().setDefaultActivity(i);
                    return;
                }
                return;
            }
            if (!androidx.appcompat.widget.ActivityChooserView.this.mAdapter.getShowDefaultActivity()) {
                i++;
            }
            android.content.Intent intentChooseActivity = androidx.appcompat.widget.ActivityChooserView.this.mAdapter.getDataModel().chooseActivity(i);
            if (intentChooseActivity != null) {
                intentChooseActivity.addFlags(524288);
                androidx.appcompat.widget.ActivityChooserView.this.getContext().startActivity(intentChooseActivity);
            }
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View view) {
            if (view == androidx.appcompat.widget.ActivityChooserView.this.mDefaultActivityButton) {
                androidx.appcompat.widget.ActivityChooserView.this.dismissPopup();
                android.content.Intent intentChooseActivity = androidx.appcompat.widget.ActivityChooserView.this.mAdapter.getDataModel().chooseActivity(androidx.appcompat.widget.ActivityChooserView.this.mAdapter.getDataModel().getActivityIndex(androidx.appcompat.widget.ActivityChooserView.this.mAdapter.getDefaultActivity()));
                if (intentChooseActivity != null) {
                    intentChooseActivity.addFlags(524288);
                    androidx.appcompat.widget.ActivityChooserView.this.getContext().startActivity(intentChooseActivity);
                    return;
                }
                return;
            }
            if (view == androidx.appcompat.widget.ActivityChooserView.this.mExpandActivityOverflowButton) {
                androidx.appcompat.widget.ActivityChooserView.this.mIsSelectingDefaultActivity = false;
                androidx.appcompat.widget.ActivityChooserView activityChooserView = androidx.appcompat.widget.ActivityChooserView.this;
                activityChooserView.showPopupUnchecked(activityChooserView.mInitialActivityCount);
                return;
            }
            throw new java.lang.IllegalArgumentException();
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(android.view.View view) {
            if (view == androidx.appcompat.widget.ActivityChooserView.this.mDefaultActivityButton) {
                if (androidx.appcompat.widget.ActivityChooserView.this.mAdapter.getCount() > 0) {
                    androidx.appcompat.widget.ActivityChooserView.this.mIsSelectingDefaultActivity = true;
                    androidx.appcompat.widget.ActivityChooserView activityChooserView = androidx.appcompat.widget.ActivityChooserView.this;
                    activityChooserView.showPopupUnchecked(activityChooserView.mInitialActivityCount);
                }
                return true;
            }
            throw new java.lang.IllegalArgumentException();
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            notifyOnDismissListener();
            if (androidx.appcompat.widget.ActivityChooserView.this.mProvider != null) {
                androidx.appcompat.widget.ActivityChooserView.this.mProvider.subUiVisibilityChanged(false);
            }
        }

        private void notifyOnDismissListener() {
            if (androidx.appcompat.widget.ActivityChooserView.this.mOnDismissListener != null) {
                androidx.appcompat.widget.ActivityChooserView.this.mOnDismissListener.onDismiss();
            }
        }
    }

    private class ActivityChooserViewAdapter extends android.widget.BaseAdapter {
        private static final int ITEM_VIEW_TYPE_ACTIVITY = 0;
        private static final int ITEM_VIEW_TYPE_COUNT = 3;
        private static final int ITEM_VIEW_TYPE_FOOTER = 1;
        public static final int MAX_ACTIVITY_COUNT_DEFAULT = 4;
        public static final int MAX_ACTIVITY_COUNT_UNLIMITED = Integer.MAX_VALUE;
        private androidx.appcompat.widget.ActivityChooserModel mDataModel;
        private boolean mHighlightDefaultActivity;
        private int mMaxActivityCount = 4;
        private boolean mShowDefaultActivity;
        private boolean mShowFooterView;

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getViewTypeCount() {
            return 3;
        }

        ActivityChooserViewAdapter() {
        }

        public void setDataModel(androidx.appcompat.widget.ActivityChooserModel activityChooserModel) {
            androidx.appcompat.widget.ActivityChooserModel dataModel = androidx.appcompat.widget.ActivityChooserView.this.mAdapter.getDataModel();
            if (dataModel != null && androidx.appcompat.widget.ActivityChooserView.this.isShown()) {
                dataModel.unregisterObserver(androidx.appcompat.widget.ActivityChooserView.this.mModelDataSetObserver);
            }
            this.mDataModel = activityChooserModel;
            if (activityChooserModel != null && androidx.appcompat.widget.ActivityChooserView.this.isShown()) {
                activityChooserModel.registerObserver(androidx.appcompat.widget.ActivityChooserView.this.mModelDataSetObserver);
            }
            notifyDataSetChanged();
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getItemViewType(int i) {
            return (this.mShowFooterView && i == getCount() - 1) ? 1 : 0;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            int activityCount = this.mDataModel.getActivityCount();
            if (!this.mShowDefaultActivity && this.mDataModel.getDefaultActivity() != null) {
                activityCount--;
            }
            int iMin = java.lang.Math.min(activityCount, this.mMaxActivityCount);
            return this.mShowFooterView ? iMin + 1 : iMin;
        }

        @Override // android.widget.Adapter
        public java.lang.Object getItem(int i) {
            int itemViewType = getItemViewType(i);
            if (itemViewType != 0) {
                if (itemViewType == 1) {
                    return null;
                }
                throw new java.lang.IllegalArgumentException();
            }
            if (!this.mShowDefaultActivity && this.mDataModel.getDefaultActivity() != null) {
                i++;
            }
            return this.mDataModel.getActivity(i);
        }

        @Override // android.widget.Adapter
        public android.view.View getView(int i, android.view.View view, android.view.ViewGroup viewGroup) {
            int itemViewType = getItemViewType(i);
            if (itemViewType != 0) {
                if (itemViewType == 1) {
                    if (view != null && view.getId() == 1) {
                        return view;
                    }
                    android.view.View viewInflate = android.view.LayoutInflater.from(androidx.appcompat.widget.ActivityChooserView.this.getContext()).inflate(androidx.appcompat.R.layout.abc_activity_chooser_view_list_item, viewGroup, false);
                    viewInflate.setId(1);
                    ((android.widget.TextView) viewInflate.findViewById(androidx.appcompat.R.id.title)).setText(androidx.appcompat.widget.ActivityChooserView.this.getContext().getString(androidx.appcompat.R.string.abc_activity_chooser_view_see_all));
                    return viewInflate;
                }
                throw new java.lang.IllegalArgumentException();
            }
            if (view == null || view.getId() != androidx.appcompat.R.id.list_item) {
                view = android.view.LayoutInflater.from(androidx.appcompat.widget.ActivityChooserView.this.getContext()).inflate(androidx.appcompat.R.layout.abc_activity_chooser_view_list_item, viewGroup, false);
            }
            android.content.pm.PackageManager packageManager = androidx.appcompat.widget.ActivityChooserView.this.getContext().getPackageManager();
            android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(androidx.appcompat.R.id.icon);
            android.content.pm.ResolveInfo resolveInfo = (android.content.pm.ResolveInfo) getItem(i);
            imageView.setImageDrawable(resolveInfo.loadIcon(packageManager));
            ((android.widget.TextView) view.findViewById(androidx.appcompat.R.id.title)).setText(resolveInfo.loadLabel(packageManager));
            if (this.mShowDefaultActivity && i == 0 && this.mHighlightDefaultActivity) {
                view.setActivated(true);
            } else {
                view.setActivated(false);
            }
            return view;
        }

        public int measureContentWidth() {
            int i = this.mMaxActivityCount;
            this.mMaxActivityCount = Integer.MAX_VALUE;
            int iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
            int iMakeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
            int count = getCount();
            int iMax = 0;
            android.view.View view = null;
            for (int i2 = 0; i2 < count; i2++) {
                view = getView(i2, view, null);
                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                iMax = java.lang.Math.max(iMax, view.getMeasuredWidth());
            }
            this.mMaxActivityCount = i;
            return iMax;
        }

        public void setMaxActivityCount(int i) {
            if (this.mMaxActivityCount != i) {
                this.mMaxActivityCount = i;
                notifyDataSetChanged();
            }
        }

        public android.content.pm.ResolveInfo getDefaultActivity() {
            return this.mDataModel.getDefaultActivity();
        }

        public void setShowFooterView(boolean z) {
            if (this.mShowFooterView != z) {
                this.mShowFooterView = z;
                notifyDataSetChanged();
            }
        }

        public int getActivityCount() {
            return this.mDataModel.getActivityCount();
        }

        public int getHistorySize() {
            return this.mDataModel.getHistorySize();
        }

        public androidx.appcompat.widget.ActivityChooserModel getDataModel() {
            return this.mDataModel;
        }

        public void setShowDefaultActivity(boolean z, boolean z2) {
            if (this.mShowDefaultActivity == z && this.mHighlightDefaultActivity == z2) {
                return;
            }
            this.mShowDefaultActivity = z;
            this.mHighlightDefaultActivity = z2;
            notifyDataSetChanged();
        }

        public boolean getShowDefaultActivity() {
            return this.mShowDefaultActivity;
        }
    }

    public static class InnerLayout extends android.widget.LinearLayout {
        private static final int[] TINT_ATTRS = {android.R.attr.background};

        public InnerLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
            super(context, attributeSet);
            androidx.appcompat.widget.TintTypedArray tintTypedArrayObtainStyledAttributes = androidx.appcompat.widget.TintTypedArray.obtainStyledAttributes(context, attributeSet, TINT_ATTRS);
            setBackgroundDrawable(tintTypedArrayObtainStyledAttributes.getDrawable(0));
            tintTypedArrayObtainStyledAttributes.recycle();
        }
    }
}
