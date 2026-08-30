package androidx.preference;

/* JADX INFO: loaded from: classes3.dex */
public class Preference implements java.lang.Comparable<androidx.preference.Preference> {
    private static final java.lang.String CLIPBOARD_ID = "Preference";
    public static final int DEFAULT_ORDER = Integer.MAX_VALUE;
    private boolean mAllowDividerAbove;
    private boolean mAllowDividerBelow;
    private boolean mBaseMethodCalled;
    private final android.view.View.OnClickListener mClickListener;
    private final android.content.Context mContext;
    private boolean mCopyingEnabled;
    private java.lang.Object mDefaultValue;
    private java.lang.String mDependencyKey;
    private boolean mDependencyMet;
    private java.util.List<androidx.preference.Preference> mDependents;
    private boolean mEnabled;
    private android.os.Bundle mExtras;
    private java.lang.String mFragment;
    private boolean mHasId;
    private boolean mHasSingleLineTitleAttr;
    private android.graphics.drawable.Drawable mIcon;
    private int mIconResId;
    private boolean mIconSpaceReserved;
    private long mId;
    private android.content.Intent mIntent;
    private java.lang.String mKey;
    private int mLayoutResId;
    private androidx.preference.Preference.OnPreferenceChangeInternalListener mListener;
    private androidx.preference.Preference.OnPreferenceChangeListener mOnChangeListener;
    private androidx.preference.Preference.OnPreferenceClickListener mOnClickListener;
    private androidx.preference.Preference.OnPreferenceCopyListener mOnCopyListener;
    private int mOrder;
    private boolean mParentDependencyMet;
    private androidx.preference.PreferenceGroup mParentGroup;
    private boolean mPersistent;
    private androidx.preference.PreferenceDataStore mPreferenceDataStore;
    private androidx.preference.PreferenceManager mPreferenceManager;
    private boolean mRequiresKey;
    private boolean mSelectable;
    private boolean mShouldDisableView;
    private boolean mSingleLineTitle;
    private java.lang.CharSequence mSummary;
    private androidx.preference.Preference.SummaryProvider mSummaryProvider;
    private java.lang.CharSequence mTitle;
    private int mViewId;
    private boolean mVisible;
    private boolean mWasDetached;
    private int mWidgetLayoutResId;

    interface OnPreferenceChangeInternalListener {
        void onPreferenceChange(androidx.preference.Preference preference);

        void onPreferenceHierarchyChange(androidx.preference.Preference preference);

        void onPreferenceVisibilityChange(androidx.preference.Preference preference);
    }

    public interface OnPreferenceChangeListener {
        boolean onPreferenceChange(androidx.preference.Preference preference, java.lang.Object obj);
    }

    public interface OnPreferenceClickListener {
        boolean onPreferenceClick(androidx.preference.Preference preference);
    }

    public interface SummaryProvider<T extends androidx.preference.Preference> {
        java.lang.CharSequence provideSummary(T t);
    }

    protected void onClick() {
    }

    protected java.lang.Object onGetDefaultValue(android.content.res.TypedArray typedArray, int i) {
        return null;
    }

    @java.lang.Deprecated
    public void onInitializeAccessibilityNodeInfo(androidx.core.view.accessibility.AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
    }

    protected void onSetInitialValue(java.lang.Object obj) {
    }

    public Preference(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        this.mOrder = Integer.MAX_VALUE;
        this.mViewId = 0;
        this.mEnabled = true;
        this.mSelectable = true;
        this.mPersistent = true;
        this.mDependencyMet = true;
        this.mParentDependencyMet = true;
        this.mVisible = true;
        this.mAllowDividerAbove = true;
        this.mAllowDividerBelow = true;
        this.mSingleLineTitle = true;
        this.mShouldDisableView = true;
        this.mLayoutResId = androidx.preference.R.layout.preference;
        this.mClickListener = new android.view.View.OnClickListener() { // from class: androidx.preference.Preference.1
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view) {
                androidx.preference.Preference.this.performClick(view);
            }
        };
        this.mContext = context;
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.preference.R.styleable.Preference, i, i2);
        this.mIconResId = androidx.core.content.res.TypedArrayUtils.getResourceId(typedArrayObtainStyledAttributes, androidx.preference.R.styleable.Preference_icon, androidx.preference.R.styleable.Preference_android_icon, 0);
        this.mKey = androidx.core.content.res.TypedArrayUtils.getString(typedArrayObtainStyledAttributes, androidx.preference.R.styleable.Preference_key, androidx.preference.R.styleable.Preference_android_key);
        this.mTitle = androidx.core.content.res.TypedArrayUtils.getText(typedArrayObtainStyledAttributes, androidx.preference.R.styleable.Preference_title, androidx.preference.R.styleable.Preference_android_title);
        this.mSummary = androidx.core.content.res.TypedArrayUtils.getText(typedArrayObtainStyledAttributes, androidx.preference.R.styleable.Preference_summary, androidx.preference.R.styleable.Preference_android_summary);
        this.mOrder = androidx.core.content.res.TypedArrayUtils.getInt(typedArrayObtainStyledAttributes, androidx.preference.R.styleable.Preference_order, androidx.preference.R.styleable.Preference_android_order, Integer.MAX_VALUE);
        this.mFragment = androidx.core.content.res.TypedArrayUtils.getString(typedArrayObtainStyledAttributes, androidx.preference.R.styleable.Preference_fragment, androidx.preference.R.styleable.Preference_android_fragment);
        this.mLayoutResId = androidx.core.content.res.TypedArrayUtils.getResourceId(typedArrayObtainStyledAttributes, androidx.preference.R.styleable.Preference_layout, androidx.preference.R.styleable.Preference_android_layout, androidx.preference.R.layout.preference);
        this.mWidgetLayoutResId = androidx.core.content.res.TypedArrayUtils.getResourceId(typedArrayObtainStyledAttributes, androidx.preference.R.styleable.Preference_widgetLayout, androidx.preference.R.styleable.Preference_android_widgetLayout, 0);
        this.mEnabled = androidx.core.content.res.TypedArrayUtils.getBoolean(typedArrayObtainStyledAttributes, androidx.preference.R.styleable.Preference_enabled, androidx.preference.R.styleable.Preference_android_enabled, true);
        this.mSelectable = androidx.core.content.res.TypedArrayUtils.getBoolean(typedArrayObtainStyledAttributes, androidx.preference.R.styleable.Preference_selectable, androidx.preference.R.styleable.Preference_android_selectable, true);
        this.mPersistent = androidx.core.content.res.TypedArrayUtils.getBoolean(typedArrayObtainStyledAttributes, androidx.preference.R.styleable.Preference_persistent, androidx.preference.R.styleable.Preference_android_persistent, true);
        this.mDependencyKey = androidx.core.content.res.TypedArrayUtils.getString(typedArrayObtainStyledAttributes, androidx.preference.R.styleable.Preference_dependency, androidx.preference.R.styleable.Preference_android_dependency);
        this.mAllowDividerAbove = androidx.core.content.res.TypedArrayUtils.getBoolean(typedArrayObtainStyledAttributes, androidx.preference.R.styleable.Preference_allowDividerAbove, androidx.preference.R.styleable.Preference_allowDividerAbove, this.mSelectable);
        this.mAllowDividerBelow = androidx.core.content.res.TypedArrayUtils.getBoolean(typedArrayObtainStyledAttributes, androidx.preference.R.styleable.Preference_allowDividerBelow, androidx.preference.R.styleable.Preference_allowDividerBelow, this.mSelectable);
        if (typedArrayObtainStyledAttributes.hasValue(androidx.preference.R.styleable.Preference_defaultValue)) {
            this.mDefaultValue = onGetDefaultValue(typedArrayObtainStyledAttributes, androidx.preference.R.styleable.Preference_defaultValue);
        } else if (typedArrayObtainStyledAttributes.hasValue(androidx.preference.R.styleable.Preference_android_defaultValue)) {
            this.mDefaultValue = onGetDefaultValue(typedArrayObtainStyledAttributes, androidx.preference.R.styleable.Preference_android_defaultValue);
        }
        this.mShouldDisableView = androidx.core.content.res.TypedArrayUtils.getBoolean(typedArrayObtainStyledAttributes, androidx.preference.R.styleable.Preference_shouldDisableView, androidx.preference.R.styleable.Preference_android_shouldDisableView, true);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(androidx.preference.R.styleable.Preference_singleLineTitle);
        this.mHasSingleLineTitleAttr = zHasValue;
        if (zHasValue) {
            this.mSingleLineTitle = androidx.core.content.res.TypedArrayUtils.getBoolean(typedArrayObtainStyledAttributes, androidx.preference.R.styleable.Preference_singleLineTitle, androidx.preference.R.styleable.Preference_android_singleLineTitle, true);
        }
        this.mIconSpaceReserved = androidx.core.content.res.TypedArrayUtils.getBoolean(typedArrayObtainStyledAttributes, androidx.preference.R.styleable.Preference_iconSpaceReserved, androidx.preference.R.styleable.Preference_android_iconSpaceReserved, false);
        this.mVisible = androidx.core.content.res.TypedArrayUtils.getBoolean(typedArrayObtainStyledAttributes, androidx.preference.R.styleable.Preference_isPreferenceVisible, androidx.preference.R.styleable.Preference_isPreferenceVisible, true);
        this.mCopyingEnabled = androidx.core.content.res.TypedArrayUtils.getBoolean(typedArrayObtainStyledAttributes, androidx.preference.R.styleable.Preference_enableCopying, androidx.preference.R.styleable.Preference_enableCopying, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    public Preference(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public Preference(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, androidx.core.content.res.TypedArrayUtils.getAttr(context, androidx.preference.R.attr.preferenceStyle, android.R.attr.preferenceStyle));
    }

    public Preference(android.content.Context context) {
        this(context, null);
    }

    public void setIntent(android.content.Intent intent) {
        this.mIntent = intent;
    }

    public android.content.Intent getIntent() {
        return this.mIntent;
    }

    public void setFragment(java.lang.String str) {
        this.mFragment = str;
    }

    public java.lang.String getFragment() {
        return this.mFragment;
    }

    public void setPreferenceDataStore(androidx.preference.PreferenceDataStore preferenceDataStore) {
        this.mPreferenceDataStore = preferenceDataStore;
    }

    public androidx.preference.PreferenceDataStore getPreferenceDataStore() {
        androidx.preference.PreferenceDataStore preferenceDataStore = this.mPreferenceDataStore;
        if (preferenceDataStore != null) {
            return preferenceDataStore;
        }
        androidx.preference.PreferenceManager preferenceManager = this.mPreferenceManager;
        if (preferenceManager != null) {
            return preferenceManager.getPreferenceDataStore();
        }
        return null;
    }

    public android.os.Bundle getExtras() {
        if (this.mExtras == null) {
            this.mExtras = new android.os.Bundle();
        }
        return this.mExtras;
    }

    public android.os.Bundle peekExtras() {
        return this.mExtras;
    }

    public void setLayoutResource(int i) {
        this.mLayoutResId = i;
    }

    public final int getLayoutResource() {
        return this.mLayoutResId;
    }

    public void setWidgetLayoutResource(int i) {
        this.mWidgetLayoutResId = i;
    }

    public final int getWidgetLayoutResource() {
        return this.mWidgetLayoutResId;
    }

    public void onBindViewHolder(androidx.preference.PreferenceViewHolder preferenceViewHolder) {
        java.lang.Integer numValueOf;
        android.view.View view = preferenceViewHolder.itemView;
        view.setOnClickListener(this.mClickListener);
        view.setId(this.mViewId);
        android.widget.TextView textView = (android.widget.TextView) preferenceViewHolder.findViewById(android.R.id.summary);
        if (textView != null) {
            java.lang.CharSequence summary = getSummary();
            if (!android.text.TextUtils.isEmpty(summary)) {
                textView.setText(summary);
                textView.setVisibility(0);
                numValueOf = java.lang.Integer.valueOf(textView.getCurrentTextColor());
            } else {
                textView.setVisibility(8);
                numValueOf = null;
            }
        } else {
            numValueOf = null;
        }
        android.widget.TextView textView2 = (android.widget.TextView) preferenceViewHolder.findViewById(android.R.id.title);
        if (textView2 != null) {
            java.lang.CharSequence title = getTitle();
            if (!android.text.TextUtils.isEmpty(title)) {
                textView2.setText(title);
                textView2.setVisibility(0);
                if (this.mHasSingleLineTitleAttr) {
                    textView2.setSingleLine(this.mSingleLineTitle);
                }
                if (!isSelectable() && isEnabled() && numValueOf != null) {
                    textView2.setTextColor(numValueOf.intValue());
                }
            } else {
                textView2.setVisibility(8);
            }
        }
        android.widget.ImageView imageView = (android.widget.ImageView) preferenceViewHolder.findViewById(android.R.id.icon);
        if (imageView != null) {
            int i = this.mIconResId;
            if (i != 0 || this.mIcon != null) {
                if (this.mIcon == null) {
                    this.mIcon = androidx.appcompat.content.res.AppCompatResources.getDrawable(this.mContext, i);
                }
                android.graphics.drawable.Drawable drawable = this.mIcon;
                if (drawable != null) {
                    imageView.setImageDrawable(drawable);
                }
            }
            if (this.mIcon != null) {
                imageView.setVisibility(0);
            } else {
                imageView.setVisibility(this.mIconSpaceReserved ? 4 : 8);
            }
        }
        android.view.View viewFindViewById = preferenceViewHolder.findViewById(androidx.preference.R.id.icon_frame);
        if (viewFindViewById == null) {
            viewFindViewById = preferenceViewHolder.findViewById(16908350);
        }
        if (viewFindViewById != null) {
            if (this.mIcon != null) {
                viewFindViewById.setVisibility(0);
            } else {
                viewFindViewById.setVisibility(this.mIconSpaceReserved ? 4 : 8);
            }
        }
        if (this.mShouldDisableView) {
            setEnabledStateOnViews(view, isEnabled());
        } else {
            setEnabledStateOnViews(view, true);
        }
        boolean zIsSelectable = isSelectable();
        view.setFocusable(zIsSelectable);
        view.setClickable(zIsSelectable);
        preferenceViewHolder.setDividerAllowedAbove(this.mAllowDividerAbove);
        preferenceViewHolder.setDividerAllowedBelow(this.mAllowDividerBelow);
        boolean zIsCopyingEnabled = isCopyingEnabled();
        if (zIsCopyingEnabled && this.mOnCopyListener == null) {
            this.mOnCopyListener = new androidx.preference.Preference.OnPreferenceCopyListener(this);
        }
        view.setOnCreateContextMenuListener(zIsCopyingEnabled ? this.mOnCopyListener : null);
        view.setLongClickable(zIsCopyingEnabled);
        if (!zIsCopyingEnabled || zIsSelectable) {
            return;
        }
        androidx.core.view.ViewCompat.setBackground(view, null);
    }

    private void setEnabledStateOnViews(android.view.View view, boolean z) {
        view.setEnabled(z);
        if (view instanceof android.view.ViewGroup) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                setEnabledStateOnViews(viewGroup.getChildAt(childCount), z);
            }
        }
    }

    public void setOrder(int i) {
        if (i != this.mOrder) {
            this.mOrder = i;
            notifyHierarchyChanged();
        }
    }

    public int getOrder() {
        return this.mOrder;
    }

    public void setViewId(int i) {
        this.mViewId = i;
    }

    public void setTitle(java.lang.CharSequence charSequence) {
        if (android.text.TextUtils.equals(charSequence, this.mTitle)) {
            return;
        }
        this.mTitle = charSequence;
        notifyChanged();
    }

    public void setTitle(int i) {
        setTitle(this.mContext.getString(i));
    }

    public java.lang.CharSequence getTitle() {
        return this.mTitle;
    }

    public void setIcon(android.graphics.drawable.Drawable drawable) {
        if (this.mIcon != drawable) {
            this.mIcon = drawable;
            this.mIconResId = 0;
            notifyChanged();
        }
    }

    public void setIcon(int i) {
        setIcon(androidx.appcompat.content.res.AppCompatResources.getDrawable(this.mContext, i));
        this.mIconResId = i;
    }

    public android.graphics.drawable.Drawable getIcon() {
        int i;
        if (this.mIcon == null && (i = this.mIconResId) != 0) {
            this.mIcon = androidx.appcompat.content.res.AppCompatResources.getDrawable(this.mContext, i);
        }
        return this.mIcon;
    }

    public java.lang.CharSequence getSummary() {
        if (getSummaryProvider() != null) {
            return getSummaryProvider().provideSummary(this);
        }
        return this.mSummary;
    }

    public void setSummary(java.lang.CharSequence charSequence) {
        if (getSummaryProvider() != null) {
            throw new java.lang.IllegalStateException("Preference already has a SummaryProvider set.");
        }
        if (android.text.TextUtils.equals(this.mSummary, charSequence)) {
            return;
        }
        this.mSummary = charSequence;
        notifyChanged();
    }

    public void setSummary(int i) {
        setSummary(this.mContext.getString(i));
    }

    public void setEnabled(boolean z) {
        if (this.mEnabled != z) {
            this.mEnabled = z;
            notifyDependencyChange(shouldDisableDependents());
            notifyChanged();
        }
    }

    public boolean isEnabled() {
        return this.mEnabled && this.mDependencyMet && this.mParentDependencyMet;
    }

    public void setSelectable(boolean z) {
        if (this.mSelectable != z) {
            this.mSelectable = z;
            notifyChanged();
        }
    }

    public boolean isSelectable() {
        return this.mSelectable;
    }

    public void setShouldDisableView(boolean z) {
        if (this.mShouldDisableView != z) {
            this.mShouldDisableView = z;
            notifyChanged();
        }
    }

    public boolean getShouldDisableView() {
        return this.mShouldDisableView;
    }

    public final void setVisible(boolean z) {
        if (this.mVisible != z) {
            this.mVisible = z;
            androidx.preference.Preference.OnPreferenceChangeInternalListener onPreferenceChangeInternalListener = this.mListener;
            if (onPreferenceChangeInternalListener != null) {
                onPreferenceChangeInternalListener.onPreferenceVisibilityChange(this);
            }
        }
    }

    public final boolean isVisible() {
        return this.mVisible;
    }

    public final boolean isShown() {
        if (!isVisible() || getPreferenceManager() == null) {
            return false;
        }
        if (this == getPreferenceManager().getPreferenceScreen()) {
            return true;
        }
        androidx.preference.PreferenceGroup parent = getParent();
        if (parent == null) {
            return false;
        }
        return parent.isShown();
    }

    long getId() {
        return this.mId;
    }

    public void setKey(java.lang.String str) {
        this.mKey = str;
        if (!this.mRequiresKey || hasKey()) {
            return;
        }
        requireKey();
    }

    public java.lang.String getKey() {
        return this.mKey;
    }

    void requireKey() {
        if (android.text.TextUtils.isEmpty(this.mKey)) {
            throw new java.lang.IllegalStateException("Preference does not have a key assigned.");
        }
        this.mRequiresKey = true;
    }

    public boolean hasKey() {
        return !android.text.TextUtils.isEmpty(this.mKey);
    }

    public boolean isPersistent() {
        return this.mPersistent;
    }

    protected boolean shouldPersist() {
        return this.mPreferenceManager != null && isPersistent() && hasKey();
    }

    public void setPersistent(boolean z) {
        this.mPersistent = z;
    }

    public void setSingleLineTitle(boolean z) {
        this.mHasSingleLineTitleAttr = true;
        this.mSingleLineTitle = z;
    }

    public boolean isSingleLineTitle() {
        return this.mSingleLineTitle;
    }

    public void setIconSpaceReserved(boolean z) {
        if (this.mIconSpaceReserved != z) {
            this.mIconSpaceReserved = z;
            notifyChanged();
        }
    }

    public boolean isIconSpaceReserved() {
        return this.mIconSpaceReserved;
    }

    public void setCopyingEnabled(boolean z) {
        if (this.mCopyingEnabled != z) {
            this.mCopyingEnabled = z;
            notifyChanged();
        }
    }

    public boolean isCopyingEnabled() {
        return this.mCopyingEnabled;
    }

    public final void setSummaryProvider(androidx.preference.Preference.SummaryProvider summaryProvider) {
        this.mSummaryProvider = summaryProvider;
        notifyChanged();
    }

    public final androidx.preference.Preference.SummaryProvider getSummaryProvider() {
        return this.mSummaryProvider;
    }

    public boolean callChangeListener(java.lang.Object obj) {
        androidx.preference.Preference.OnPreferenceChangeListener onPreferenceChangeListener = this.mOnChangeListener;
        return onPreferenceChangeListener == null || onPreferenceChangeListener.onPreferenceChange(this, obj);
    }

    public void setOnPreferenceChangeListener(androidx.preference.Preference.OnPreferenceChangeListener onPreferenceChangeListener) {
        this.mOnChangeListener = onPreferenceChangeListener;
    }

    public androidx.preference.Preference.OnPreferenceChangeListener getOnPreferenceChangeListener() {
        return this.mOnChangeListener;
    }

    public void setOnPreferenceClickListener(androidx.preference.Preference.OnPreferenceClickListener onPreferenceClickListener) {
        this.mOnClickListener = onPreferenceClickListener;
    }

    public androidx.preference.Preference.OnPreferenceClickListener getOnPreferenceClickListener() {
        return this.mOnClickListener;
    }

    protected void performClick(android.view.View view) {
        performClick();
    }

    public void performClick() {
        androidx.preference.PreferenceManager.OnPreferenceTreeClickListener onPreferenceTreeClickListener;
        if (isEnabled() && isSelectable()) {
            onClick();
            androidx.preference.Preference.OnPreferenceClickListener onPreferenceClickListener = this.mOnClickListener;
            if (onPreferenceClickListener == null || !onPreferenceClickListener.onPreferenceClick(this)) {
                androidx.preference.PreferenceManager preferenceManager = getPreferenceManager();
                if ((preferenceManager == null || (onPreferenceTreeClickListener = preferenceManager.getOnPreferenceTreeClickListener()) == null || !onPreferenceTreeClickListener.onPreferenceTreeClick(this)) && this.mIntent != null) {
                    getContext().startActivity(this.mIntent);
                }
            }
        }
    }

    public android.content.Context getContext() {
        return this.mContext;
    }

    public android.content.SharedPreferences getSharedPreferences() {
        if (this.mPreferenceManager == null || getPreferenceDataStore() != null) {
            return null;
        }
        return this.mPreferenceManager.getSharedPreferences();
    }

    @Override // java.lang.Comparable
    public int compareTo(androidx.preference.Preference preference) {
        int i = this.mOrder;
        int i2 = preference.mOrder;
        if (i != i2) {
            return i - i2;
        }
        java.lang.CharSequence charSequence = this.mTitle;
        java.lang.CharSequence charSequence2 = preference.mTitle;
        if (charSequence == charSequence2) {
            return 0;
        }
        if (charSequence == null) {
            return 1;
        }
        if (charSequence2 == null) {
            return -1;
        }
        return charSequence.toString().compareToIgnoreCase(preference.mTitle.toString());
    }

    final void setOnPreferenceChangeInternalListener(androidx.preference.Preference.OnPreferenceChangeInternalListener onPreferenceChangeInternalListener) {
        this.mListener = onPreferenceChangeInternalListener;
    }

    protected void notifyChanged() {
        androidx.preference.Preference.OnPreferenceChangeInternalListener onPreferenceChangeInternalListener = this.mListener;
        if (onPreferenceChangeInternalListener != null) {
            onPreferenceChangeInternalListener.onPreferenceChange(this);
        }
    }

    protected void notifyHierarchyChanged() {
        androidx.preference.Preference.OnPreferenceChangeInternalListener onPreferenceChangeInternalListener = this.mListener;
        if (onPreferenceChangeInternalListener != null) {
            onPreferenceChangeInternalListener.onPreferenceHierarchyChange(this);
        }
    }

    public androidx.preference.PreferenceManager getPreferenceManager() {
        return this.mPreferenceManager;
    }

    protected void onAttachedToHierarchy(androidx.preference.PreferenceManager preferenceManager) {
        this.mPreferenceManager = preferenceManager;
        if (!this.mHasId) {
            this.mId = preferenceManager.getNextId();
        }
        dispatchSetInitialValue();
    }

    protected void onAttachedToHierarchy(androidx.preference.PreferenceManager preferenceManager, long j) {
        this.mId = j;
        this.mHasId = true;
        try {
            onAttachedToHierarchy(preferenceManager);
        } finally {
            this.mHasId = false;
        }
    }

    void assignParent(androidx.preference.PreferenceGroup preferenceGroup) {
        if (preferenceGroup != null && this.mParentGroup != null) {
            throw new java.lang.IllegalStateException("This preference already has a parent. You must remove the existing parent before assigning a new one.");
        }
        this.mParentGroup = preferenceGroup;
    }

    public void onAttached() {
        registerDependency();
    }

    public void onDetached() {
        unregisterDependency();
        this.mWasDetached = true;
    }

    final boolean wasDetached() {
        return this.mWasDetached;
    }

    final void clearWasDetached() {
        this.mWasDetached = false;
    }

    private void registerDependency() {
        if (android.text.TextUtils.isEmpty(this.mDependencyKey)) {
            return;
        }
        androidx.preference.Preference preferenceFindPreferenceInHierarchy = findPreferenceInHierarchy(this.mDependencyKey);
        if (preferenceFindPreferenceInHierarchy != null) {
            preferenceFindPreferenceInHierarchy.registerDependent(this);
            return;
        }
        throw new java.lang.IllegalStateException("Dependency \"" + this.mDependencyKey + "\" not found for preference \"" + this.mKey + "\" (title: \"" + ((java.lang.Object) this.mTitle) + "\"");
    }

    private void unregisterDependency() {
        androidx.preference.Preference preferenceFindPreferenceInHierarchy;
        java.lang.String str = this.mDependencyKey;
        if (str == null || (preferenceFindPreferenceInHierarchy = findPreferenceInHierarchy(str)) == null) {
            return;
        }
        preferenceFindPreferenceInHierarchy.unregisterDependent(this);
    }

    protected <T extends androidx.preference.Preference> T findPreferenceInHierarchy(java.lang.String str) {
        androidx.preference.PreferenceManager preferenceManager = this.mPreferenceManager;
        if (preferenceManager == null) {
            return null;
        }
        return (T) preferenceManager.findPreference(str);
    }

    private void registerDependent(androidx.preference.Preference preference) {
        if (this.mDependents == null) {
            this.mDependents = new java.util.ArrayList();
        }
        this.mDependents.add(preference);
        preference.onDependencyChanged(this, shouldDisableDependents());
    }

    private void unregisterDependent(androidx.preference.Preference preference) {
        java.util.List<androidx.preference.Preference> list = this.mDependents;
        if (list != null) {
            list.remove(preference);
        }
    }

    public void notifyDependencyChange(boolean z) {
        java.util.List<androidx.preference.Preference> list = this.mDependents;
        if (list == null) {
            return;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            list.get(i).onDependencyChanged(this, z);
        }
    }

    public void onDependencyChanged(androidx.preference.Preference preference, boolean z) {
        if (this.mDependencyMet == z) {
            this.mDependencyMet = !z;
            notifyDependencyChange(shouldDisableDependents());
            notifyChanged();
        }
    }

    public void onParentChanged(androidx.preference.Preference preference, boolean z) {
        if (this.mParentDependencyMet == z) {
            this.mParentDependencyMet = !z;
            notifyDependencyChange(shouldDisableDependents());
            notifyChanged();
        }
    }

    public boolean shouldDisableDependents() {
        return !isEnabled();
    }

    public void setDependency(java.lang.String str) {
        unregisterDependency();
        this.mDependencyKey = str;
        registerDependency();
    }

    public java.lang.String getDependency() {
        return this.mDependencyKey;
    }

    public androidx.preference.PreferenceGroup getParent() {
        return this.mParentGroup;
    }

    protected void onPrepareForRemoval() {
        unregisterDependency();
    }

    public void setDefaultValue(java.lang.Object obj) {
        this.mDefaultValue = obj;
    }

    private void dispatchSetInitialValue() {
        if (getPreferenceDataStore() != null) {
            onSetInitialValue(true, this.mDefaultValue);
            return;
        }
        if (!shouldPersist() || !getSharedPreferences().contains(this.mKey)) {
            java.lang.Object obj = this.mDefaultValue;
            if (obj != null) {
                onSetInitialValue(false, obj);
                return;
            }
            return;
        }
        onSetInitialValue(true, null);
    }

    @java.lang.Deprecated
    protected void onSetInitialValue(boolean z, java.lang.Object obj) {
        onSetInitialValue(obj);
    }

    private void tryCommit(android.content.SharedPreferences.Editor editor) {
        if (this.mPreferenceManager.shouldCommit()) {
            editor.apply();
        }
    }

    protected boolean persistString(java.lang.String str) {
        if (!shouldPersist()) {
            return false;
        }
        if (android.text.TextUtils.equals(str, getPersistedString(null))) {
            return true;
        }
        androidx.preference.PreferenceDataStore preferenceDataStore = getPreferenceDataStore();
        if (preferenceDataStore != null) {
            preferenceDataStore.putString(this.mKey, str);
        } else {
            android.content.SharedPreferences.Editor editor = this.mPreferenceManager.getEditor();
            editor.putString(this.mKey, str);
            tryCommit(editor);
        }
        return true;
    }

    protected java.lang.String getPersistedString(java.lang.String str) {
        if (!shouldPersist()) {
            return str;
        }
        androidx.preference.PreferenceDataStore preferenceDataStore = getPreferenceDataStore();
        if (preferenceDataStore != null) {
            return preferenceDataStore.getString(this.mKey, str);
        }
        return this.mPreferenceManager.getSharedPreferences().getString(this.mKey, str);
    }

    public boolean persistStringSet(java.util.Set<java.lang.String> set) {
        if (!shouldPersist()) {
            return false;
        }
        if (set.equals(getPersistedStringSet(null))) {
            return true;
        }
        androidx.preference.PreferenceDataStore preferenceDataStore = getPreferenceDataStore();
        if (preferenceDataStore != null) {
            preferenceDataStore.putStringSet(this.mKey, set);
        } else {
            android.content.SharedPreferences.Editor editor = this.mPreferenceManager.getEditor();
            editor.putStringSet(this.mKey, set);
            tryCommit(editor);
        }
        return true;
    }

    public java.util.Set<java.lang.String> getPersistedStringSet(java.util.Set<java.lang.String> set) {
        if (!shouldPersist()) {
            return set;
        }
        androidx.preference.PreferenceDataStore preferenceDataStore = getPreferenceDataStore();
        if (preferenceDataStore != null) {
            return preferenceDataStore.getStringSet(this.mKey, set);
        }
        return this.mPreferenceManager.getSharedPreferences().getStringSet(this.mKey, set);
    }

    protected boolean persistInt(int i) {
        if (!shouldPersist()) {
            return false;
        }
        if (i == getPersistedInt(~i)) {
            return true;
        }
        androidx.preference.PreferenceDataStore preferenceDataStore = getPreferenceDataStore();
        if (preferenceDataStore != null) {
            preferenceDataStore.putInt(this.mKey, i);
        } else {
            android.content.SharedPreferences.Editor editor = this.mPreferenceManager.getEditor();
            editor.putInt(this.mKey, i);
            tryCommit(editor);
        }
        return true;
    }

    protected int getPersistedInt(int i) {
        if (!shouldPersist()) {
            return i;
        }
        androidx.preference.PreferenceDataStore preferenceDataStore = getPreferenceDataStore();
        if (preferenceDataStore != null) {
            return preferenceDataStore.getInt(this.mKey, i);
        }
        return this.mPreferenceManager.getSharedPreferences().getInt(this.mKey, i);
    }

    protected boolean persistFloat(float f) {
        if (!shouldPersist()) {
            return false;
        }
        if (f == getPersistedFloat(Float.NaN)) {
            return true;
        }
        androidx.preference.PreferenceDataStore preferenceDataStore = getPreferenceDataStore();
        if (preferenceDataStore != null) {
            preferenceDataStore.putFloat(this.mKey, f);
        } else {
            android.content.SharedPreferences.Editor editor = this.mPreferenceManager.getEditor();
            editor.putFloat(this.mKey, f);
            tryCommit(editor);
        }
        return true;
    }

    protected float getPersistedFloat(float f) {
        if (!shouldPersist()) {
            return f;
        }
        androidx.preference.PreferenceDataStore preferenceDataStore = getPreferenceDataStore();
        if (preferenceDataStore != null) {
            return preferenceDataStore.getFloat(this.mKey, f);
        }
        return this.mPreferenceManager.getSharedPreferences().getFloat(this.mKey, f);
    }

    protected boolean persistLong(long j) {
        if (!shouldPersist()) {
            return false;
        }
        if (j == getPersistedLong(~j)) {
            return true;
        }
        androidx.preference.PreferenceDataStore preferenceDataStore = getPreferenceDataStore();
        if (preferenceDataStore != null) {
            preferenceDataStore.putLong(this.mKey, j);
        } else {
            android.content.SharedPreferences.Editor editor = this.mPreferenceManager.getEditor();
            editor.putLong(this.mKey, j);
            tryCommit(editor);
        }
        return true;
    }

    protected long getPersistedLong(long j) {
        if (!shouldPersist()) {
            return j;
        }
        androidx.preference.PreferenceDataStore preferenceDataStore = getPreferenceDataStore();
        if (preferenceDataStore != null) {
            return preferenceDataStore.getLong(this.mKey, j);
        }
        return this.mPreferenceManager.getSharedPreferences().getLong(this.mKey, j);
    }

    protected boolean persistBoolean(boolean z) {
        if (!shouldPersist()) {
            return false;
        }
        if (z == getPersistedBoolean(!z)) {
            return true;
        }
        androidx.preference.PreferenceDataStore preferenceDataStore = getPreferenceDataStore();
        if (preferenceDataStore != null) {
            preferenceDataStore.putBoolean(this.mKey, z);
        } else {
            android.content.SharedPreferences.Editor editor = this.mPreferenceManager.getEditor();
            editor.putBoolean(this.mKey, z);
            tryCommit(editor);
        }
        return true;
    }

    protected boolean getPersistedBoolean(boolean z) {
        if (!shouldPersist()) {
            return z;
        }
        androidx.preference.PreferenceDataStore preferenceDataStore = getPreferenceDataStore();
        if (preferenceDataStore != null) {
            return preferenceDataStore.getBoolean(this.mKey, z);
        }
        return this.mPreferenceManager.getSharedPreferences().getBoolean(this.mKey, z);
    }

    public java.lang.String toString() {
        return getFilterableStringBuilder().toString();
    }

    java.lang.StringBuilder getFilterableStringBuilder() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.CharSequence title = getTitle();
        if (!android.text.TextUtils.isEmpty(title)) {
            sb.append(title).append(' ');
        }
        java.lang.CharSequence summary = getSummary();
        if (!android.text.TextUtils.isEmpty(summary)) {
            sb.append(summary).append(' ');
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        return sb;
    }

    public void saveHierarchyState(android.os.Bundle bundle) {
        dispatchSaveInstanceState(bundle);
    }

    void dispatchSaveInstanceState(android.os.Bundle bundle) {
        if (hasKey()) {
            this.mBaseMethodCalled = false;
            android.os.Parcelable parcelableOnSaveInstanceState = onSaveInstanceState();
            if (!this.mBaseMethodCalled) {
                throw new java.lang.IllegalStateException("Derived class did not call super.onSaveInstanceState()");
            }
            if (parcelableOnSaveInstanceState != null) {
                bundle.putParcelable(this.mKey, parcelableOnSaveInstanceState);
            }
        }
    }

    protected android.os.Parcelable onSaveInstanceState() {
        this.mBaseMethodCalled = true;
        return androidx.preference.Preference.BaseSavedState.EMPTY_STATE;
    }

    public void restoreHierarchyState(android.os.Bundle bundle) {
        dispatchRestoreInstanceState(bundle);
    }

    void dispatchRestoreInstanceState(android.os.Bundle bundle) {
        android.os.Parcelable parcelable;
        if (!hasKey() || (parcelable = bundle.getParcelable(this.mKey)) == null) {
            return;
        }
        this.mBaseMethodCalled = false;
        onRestoreInstanceState(parcelable);
        if (!this.mBaseMethodCalled) {
            throw new java.lang.IllegalStateException("Derived class did not call super.onRestoreInstanceState()");
        }
    }

    protected void onRestoreInstanceState(android.os.Parcelable parcelable) {
        this.mBaseMethodCalled = true;
        if (parcelable != androidx.preference.Preference.BaseSavedState.EMPTY_STATE && parcelable != null) {
            throw new java.lang.IllegalArgumentException("Wrong state class -- expecting Preference State");
        }
    }

    public static class BaseSavedState extends android.view.AbsSavedState {
        public static final android.os.Parcelable.Creator<androidx.preference.Preference.BaseSavedState> CREATOR = new android.os.Parcelable.Creator<androidx.preference.Preference.BaseSavedState>() { // from class: androidx.preference.Preference.BaseSavedState.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public androidx.preference.Preference.BaseSavedState createFromParcel(android.os.Parcel parcel) {
                return new androidx.preference.Preference.BaseSavedState(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public androidx.preference.Preference.BaseSavedState[] newArray(int i) {
                return new androidx.preference.Preference.BaseSavedState[i];
            }
        };

        public BaseSavedState(android.os.Parcel parcel) {
            super(parcel);
        }

        public BaseSavedState(android.os.Parcelable parcelable) {
            super(parcelable);
        }
    }

    private static class OnPreferenceCopyListener implements android.view.View.OnCreateContextMenuListener, android.view.MenuItem.OnMenuItemClickListener {
        private final androidx.preference.Preference mPreference;

        OnPreferenceCopyListener(androidx.preference.Preference preference) {
            this.mPreference = preference;
        }

        @Override // android.view.View.OnCreateContextMenuListener
        public void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
            java.lang.CharSequence summary = this.mPreference.getSummary();
            if (!this.mPreference.isCopyingEnabled() || android.text.TextUtils.isEmpty(summary)) {
                return;
            }
            contextMenu.setHeaderTitle(summary);
            contextMenu.add(0, 0, 0, androidx.preference.R.string.copy).setOnMenuItemClickListener(this);
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(android.view.MenuItem menuItem) {
            android.content.ClipboardManager clipboardManager = (android.content.ClipboardManager) this.mPreference.getContext().getSystemService("clipboard");
            java.lang.CharSequence summary = this.mPreference.getSummary();
            clipboardManager.setPrimaryClip(android.content.ClipData.newPlainText(androidx.preference.Preference.CLIPBOARD_ID, summary));
            android.widget.Toast.makeText(this.mPreference.getContext(), this.mPreference.getContext().getString(androidx.preference.R.string.preference_copied, summary), 0).show();
            return true;
        }
    }
}
