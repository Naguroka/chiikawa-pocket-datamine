package androidx.preference;

/* JADX INFO: loaded from: classes3.dex */
@java.lang.Deprecated
public abstract class PreferenceFragment extends android.app.Fragment implements androidx.preference.PreferenceManager.OnPreferenceTreeClickListener, androidx.preference.PreferenceManager.OnDisplayPreferenceDialogListener, androidx.preference.PreferenceManager.OnNavigateToScreenListener, androidx.preference.DialogPreference.TargetFragment {

    @java.lang.Deprecated
    public static final java.lang.String ARG_PREFERENCE_ROOT = "androidx.preference.PreferenceFragmentCompat.PREFERENCE_ROOT";
    private static final java.lang.String DIALOG_FRAGMENT_TAG = "androidx.preference.PreferenceFragment.DIALOG";
    private static final int MSG_BIND_PREFERENCES = 1;
    private static final java.lang.String PREFERENCES_TAG = "android:preferences";
    private boolean mHavePrefs;
    private boolean mInitDone;
    androidx.recyclerview.widget.RecyclerView mList;
    private androidx.preference.PreferenceManager mPreferenceManager;
    private java.lang.Runnable mSelectPreferenceRunnable;
    private android.content.Context mStyledContext;
    private final androidx.preference.PreferenceFragment.DividerDecoration mDividerDecoration = new androidx.preference.PreferenceFragment.DividerDecoration();
    private int mLayoutResId = androidx.preference.R.layout.preference_list_fragment;
    private final android.os.Handler mHandler = new android.os.Handler() { // from class: androidx.preference.PreferenceFragment.1
        @Override // android.os.Handler
        public void handleMessage(android.os.Message message) {
            if (message.what != 1) {
                return;
            }
            androidx.preference.PreferenceFragment.this.bindPreferences();
        }
    };
    private final java.lang.Runnable mRequestFocus = new java.lang.Runnable() { // from class: androidx.preference.PreferenceFragment.2
        @Override // java.lang.Runnable
        public void run() {
            androidx.preference.PreferenceFragment.this.mList.focusableViewAvailable(androidx.preference.PreferenceFragment.this.mList);
        }
    };

    public interface OnPreferenceDisplayDialogCallback {
        boolean onPreferenceDisplayDialog(androidx.preference.PreferenceFragment preferenceFragment, androidx.preference.Preference preference);
    }

    public interface OnPreferenceStartFragmentCallback {
        boolean onPreferenceStartFragment(androidx.preference.PreferenceFragment preferenceFragment, androidx.preference.Preference preference);
    }

    public interface OnPreferenceStartScreenCallback {
        boolean onPreferenceStartScreen(androidx.preference.PreferenceFragment preferenceFragment, androidx.preference.PreferenceScreen preferenceScreen);
    }

    public android.app.Fragment getCallbackFragment() {
        return null;
    }

    protected void onBindPreferences() {
    }

    @java.lang.Deprecated
    public abstract void onCreatePreferences(android.os.Bundle bundle, java.lang.String str);

    protected void onUnbindPreferences() {
    }

    @Override // android.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.util.TypedValue typedValue = new android.util.TypedValue();
        getActivity().getTheme().resolveAttribute(androidx.preference.R.attr.preferenceTheme, typedValue, true);
        int i = typedValue.resourceId;
        if (i == 0) {
            i = androidx.preference.R.style.PreferenceThemeOverlay;
        }
        this.mStyledContext = new android.view.ContextThemeWrapper(getActivity(), i);
        androidx.preference.PreferenceManager preferenceManager = new androidx.preference.PreferenceManager(this.mStyledContext);
        this.mPreferenceManager = preferenceManager;
        preferenceManager.setOnNavigateToScreenListener(this);
        onCreatePreferences(bundle, getArguments() != null ? getArguments().getString("androidx.preference.PreferenceFragmentCompat.PREFERENCE_ROOT") : null);
    }

    @Override // android.app.Fragment
    public android.view.View onCreateView(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        android.content.res.TypedArray typedArrayObtainStyledAttributes = this.mStyledContext.obtainStyledAttributes(null, androidx.preference.R.styleable.PreferenceFragment, androidx.core.content.res.TypedArrayUtils.getAttr(this.mStyledContext, androidx.preference.R.attr.preferenceFragmentStyle, android.R.attr.preferenceFragmentStyle), 0);
        this.mLayoutResId = typedArrayObtainStyledAttributes.getResourceId(androidx.preference.R.styleable.PreferenceFragment_android_layout, this.mLayoutResId);
        android.graphics.drawable.Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(androidx.preference.R.styleable.PreferenceFragment_android_divider);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(androidx.preference.R.styleable.PreferenceFragment_android_dividerHeight, -1);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(androidx.preference.R.styleable.PreferenceFragment_allowDividerAfterLastItem, true);
        typedArrayObtainStyledAttributes.recycle();
        android.view.LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(this.mStyledContext);
        android.view.View viewInflate = layoutInflaterCloneInContext.inflate(this.mLayoutResId, viewGroup, false);
        android.view.View viewFindViewById = viewInflate.findViewById(android.R.id.list_container);
        if (!(viewFindViewById instanceof android.view.ViewGroup)) {
            throw new java.lang.RuntimeException("Content has view with id attribute 'android.R.id.list_container' that is not a ViewGroup class");
        }
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) viewFindViewById;
        androidx.recyclerview.widget.RecyclerView recyclerViewOnCreateRecyclerView = onCreateRecyclerView(layoutInflaterCloneInContext, viewGroup2, bundle);
        if (recyclerViewOnCreateRecyclerView == null) {
            throw new java.lang.RuntimeException("Could not create RecyclerView");
        }
        this.mList = recyclerViewOnCreateRecyclerView;
        recyclerViewOnCreateRecyclerView.addItemDecoration(this.mDividerDecoration);
        setDivider(drawable);
        if (dimensionPixelSize != -1) {
            setDividerHeight(dimensionPixelSize);
        }
        this.mDividerDecoration.setAllowDividerAfterLastItem(z);
        if (this.mList.getParent() == null) {
            viewGroup2.addView(this.mList);
        }
        this.mHandler.post(this.mRequestFocus);
        return viewInflate;
    }

    @java.lang.Deprecated
    public void setDivider(android.graphics.drawable.Drawable drawable) {
        this.mDividerDecoration.setDivider(drawable);
    }

    @java.lang.Deprecated
    public void setDividerHeight(int i) {
        this.mDividerDecoration.setDividerHeight(i);
    }

    @Override // android.app.Fragment
    public void onViewCreated(android.view.View view, android.os.Bundle bundle) {
        android.os.Bundle bundle2;
        androidx.preference.PreferenceScreen preferenceScreen;
        super.onViewCreated(view, bundle);
        if (bundle != null && (bundle2 = bundle.getBundle(PREFERENCES_TAG)) != null && (preferenceScreen = getPreferenceScreen()) != null) {
            preferenceScreen.restoreHierarchyState(bundle2);
        }
        if (this.mHavePrefs) {
            bindPreferences();
            java.lang.Runnable runnable = this.mSelectPreferenceRunnable;
            if (runnable != null) {
                runnable.run();
                this.mSelectPreferenceRunnable = null;
            }
        }
        this.mInitDone = true;
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        this.mPreferenceManager.setOnPreferenceTreeClickListener(this);
        this.mPreferenceManager.setOnDisplayPreferenceDialogListener(this);
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
        this.mPreferenceManager.setOnPreferenceTreeClickListener(null);
        this.mPreferenceManager.setOnDisplayPreferenceDialogListener(null);
    }

    @Override // android.app.Fragment
    public void onDestroyView() {
        this.mHandler.removeCallbacks(this.mRequestFocus);
        this.mHandler.removeMessages(1);
        if (this.mHavePrefs) {
            unbindPreferences();
        }
        this.mList = null;
        super.onDestroyView();
    }

    @Override // android.app.Fragment
    public void onSaveInstanceState(android.os.Bundle bundle) {
        super.onSaveInstanceState(bundle);
        androidx.preference.PreferenceScreen preferenceScreen = getPreferenceScreen();
        if (preferenceScreen != null) {
            android.os.Bundle bundle2 = new android.os.Bundle();
            preferenceScreen.saveHierarchyState(bundle2);
            bundle.putBundle(PREFERENCES_TAG, bundle2);
        }
    }

    @java.lang.Deprecated
    public androidx.preference.PreferenceManager getPreferenceManager() {
        return this.mPreferenceManager;
    }

    @java.lang.Deprecated
    public void setPreferenceScreen(androidx.preference.PreferenceScreen preferenceScreen) {
        if (!this.mPreferenceManager.setPreferences(preferenceScreen) || preferenceScreen == null) {
            return;
        }
        onUnbindPreferences();
        this.mHavePrefs = true;
        if (this.mInitDone) {
            postBindPreferences();
        }
    }

    @java.lang.Deprecated
    public androidx.preference.PreferenceScreen getPreferenceScreen() {
        return this.mPreferenceManager.getPreferenceScreen();
    }

    @java.lang.Deprecated
    public void addPreferencesFromResource(int i) {
        requirePreferenceManager();
        setPreferenceScreen(this.mPreferenceManager.inflateFromResource(this.mStyledContext, i, getPreferenceScreen()));
    }

    @java.lang.Deprecated
    public void setPreferencesFromResource(int i, java.lang.String str) {
        androidx.preference.Preference preferenceFindPreference;
        requirePreferenceManager();
        androidx.preference.PreferenceScreen preferenceScreenInflateFromResource = this.mPreferenceManager.inflateFromResource(this.mStyledContext, i, null);
        androidx.preference.Preference preference = preferenceScreenInflateFromResource;
        if (str != null) {
            preferenceFindPreference = preferenceScreenInflateFromResource.findPreference(str);
            if (!(preferenceFindPreference instanceof androidx.preference.PreferenceScreen)) {
                preference = preferenceFindPreference;
                throw new java.lang.IllegalArgumentException("Preference object with key " + str + " is not a PreferenceScreen");
            }
        }
        preference = preferenceFindPreference;
        setPreferenceScreen((androidx.preference.PreferenceScreen) preference);
    }

    @Override // androidx.preference.PreferenceManager.OnPreferenceTreeClickListener
    @java.lang.Deprecated
    public boolean onPreferenceTreeClick(androidx.preference.Preference preference) {
        if (preference.getFragment() == null) {
            return false;
        }
        boolean zOnPreferenceStartFragment = getCallbackFragment() instanceof androidx.preference.PreferenceFragment.OnPreferenceStartFragmentCallback ? ((androidx.preference.PreferenceFragment.OnPreferenceStartFragmentCallback) getCallbackFragment()).onPreferenceStartFragment(this, preference) : false;
        return (zOnPreferenceStartFragment || !(getActivity() instanceof androidx.preference.PreferenceFragment.OnPreferenceStartFragmentCallback)) ? zOnPreferenceStartFragment : ((androidx.preference.PreferenceFragment.OnPreferenceStartFragmentCallback) getActivity()).onPreferenceStartFragment(this, preference);
    }

    @Override // androidx.preference.PreferenceManager.OnNavigateToScreenListener
    @java.lang.Deprecated
    public void onNavigateToScreen(androidx.preference.PreferenceScreen preferenceScreen) {
        if ((getCallbackFragment() instanceof androidx.preference.PreferenceFragment.OnPreferenceStartScreenCallback ? ((androidx.preference.PreferenceFragment.OnPreferenceStartScreenCallback) getCallbackFragment()).onPreferenceStartScreen(this, preferenceScreen) : false) || !(getActivity() instanceof androidx.preference.PreferenceFragment.OnPreferenceStartScreenCallback)) {
            return;
        }
        ((androidx.preference.PreferenceFragment.OnPreferenceStartScreenCallback) getActivity()).onPreferenceStartScreen(this, preferenceScreen);
    }

    @Override // androidx.preference.DialogPreference.TargetFragment
    @java.lang.Deprecated
    public <T extends androidx.preference.Preference> T findPreference(java.lang.CharSequence charSequence) {
        androidx.preference.PreferenceManager preferenceManager = this.mPreferenceManager;
        if (preferenceManager == null) {
            return null;
        }
        return (T) preferenceManager.findPreference(charSequence);
    }

    private void requirePreferenceManager() {
        if (this.mPreferenceManager == null) {
            throw new java.lang.RuntimeException("This should be called after super.onCreate.");
        }
    }

    private void postBindPreferences() {
        if (this.mHandler.hasMessages(1)) {
            return;
        }
        this.mHandler.obtainMessage(1).sendToTarget();
    }

    void bindPreferences() {
        androidx.preference.PreferenceScreen preferenceScreen = getPreferenceScreen();
        if (preferenceScreen != null) {
            getListView().setAdapter(onCreateAdapter(preferenceScreen));
            preferenceScreen.onAttached();
        }
        onBindPreferences();
    }

    private void unbindPreferences() {
        androidx.preference.PreferenceScreen preferenceScreen = getPreferenceScreen();
        if (preferenceScreen != null) {
            preferenceScreen.onDetached();
        }
        onUnbindPreferences();
    }

    @java.lang.Deprecated
    public final androidx.recyclerview.widget.RecyclerView getListView() {
        return this.mList;
    }

    @java.lang.Deprecated
    public androidx.recyclerview.widget.RecyclerView onCreateRecyclerView(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        androidx.recyclerview.widget.RecyclerView recyclerView;
        if (this.mStyledContext.getPackageManager().hasSystemFeature("android.hardware.type.automotive") && (recyclerView = (androidx.recyclerview.widget.RecyclerView) viewGroup.findViewById(androidx.preference.R.id.recycler_view)) != null) {
            return recyclerView;
        }
        androidx.recyclerview.widget.RecyclerView recyclerView2 = (androidx.recyclerview.widget.RecyclerView) layoutInflater.inflate(androidx.preference.R.layout.preference_recyclerview, viewGroup, false);
        recyclerView2.setLayoutManager(onCreateLayoutManager());
        recyclerView2.setAccessibilityDelegateCompat(new androidx.preference.PreferenceRecyclerViewAccessibilityDelegate(recyclerView2));
        return recyclerView2;
    }

    @java.lang.Deprecated
    public androidx.recyclerview.widget.RecyclerView.LayoutManager onCreateLayoutManager() {
        return new androidx.recyclerview.widget.LinearLayoutManager(getActivity());
    }

    @java.lang.Deprecated
    protected androidx.recyclerview.widget.RecyclerView.Adapter onCreateAdapter(androidx.preference.PreferenceScreen preferenceScreen) {
        return new androidx.preference.PreferenceGroupAdapter(preferenceScreen);
    }

    @Override // androidx.preference.PreferenceManager.OnDisplayPreferenceDialogListener
    @java.lang.Deprecated
    public void onDisplayPreferenceDialog(androidx.preference.Preference preference) {
        android.app.DialogFragment dialogFragmentNewInstance;
        boolean zOnPreferenceDisplayDialog = getCallbackFragment() instanceof androidx.preference.PreferenceFragment.OnPreferenceDisplayDialogCallback ? ((androidx.preference.PreferenceFragment.OnPreferenceDisplayDialogCallback) getCallbackFragment()).onPreferenceDisplayDialog(this, preference) : false;
        if (!zOnPreferenceDisplayDialog && (getActivity() instanceof androidx.preference.PreferenceFragment.OnPreferenceDisplayDialogCallback)) {
            zOnPreferenceDisplayDialog = ((androidx.preference.PreferenceFragment.OnPreferenceDisplayDialogCallback) getActivity()).onPreferenceDisplayDialog(this, preference);
        }
        if (!zOnPreferenceDisplayDialog && getFragmentManager().findFragmentByTag(DIALOG_FRAGMENT_TAG) == null) {
            if (preference instanceof androidx.preference.EditTextPreference) {
                dialogFragmentNewInstance = androidx.preference.EditTextPreferenceDialogFragment.newInstance(preference.getKey());
            } else if (preference instanceof androidx.preference.ListPreference) {
                dialogFragmentNewInstance = androidx.preference.ListPreferenceDialogFragment.newInstance(preference.getKey());
            } else if (preference instanceof androidx.preference.MultiSelectListPreference) {
                dialogFragmentNewInstance = androidx.preference.MultiSelectListPreferenceDialogFragment.newInstance(preference.getKey());
            } else {
                throw new java.lang.IllegalArgumentException("Tried to display dialog for unknown preference type. Did you forget to override onDisplayPreferenceDialog()?");
            }
            dialogFragmentNewInstance.setTargetFragment(this, 0);
            dialogFragmentNewInstance.show(getFragmentManager(), DIALOG_FRAGMENT_TAG);
        }
    }

    @java.lang.Deprecated
    public void scrollToPreference(java.lang.String str) {
        scrollToPreferenceInternal(null, str);
    }

    @java.lang.Deprecated
    public void scrollToPreference(androidx.preference.Preference preference) {
        scrollToPreferenceInternal(preference, null);
    }

    private void scrollToPreferenceInternal(final androidx.preference.Preference preference, final java.lang.String str) {
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: androidx.preference.PreferenceFragment.3
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public void run() {
                int preferenceAdapterPosition;
                androidx.recyclerview.widget.RecyclerView.Adapter adapter = androidx.preference.PreferenceFragment.this.mList.getAdapter();
                if (!(adapter instanceof androidx.preference.PreferenceGroup.PreferencePositionCallback)) {
                    if (adapter != 0) {
                        throw new java.lang.IllegalStateException("Adapter must implement PreferencePositionCallback");
                    }
                    return;
                }
                androidx.preference.Preference preference2 = preference;
                if (preference2 != null) {
                    preferenceAdapterPosition = ((androidx.preference.PreferenceGroup.PreferencePositionCallback) adapter).getPreferenceAdapterPosition(preference2);
                } else {
                    preferenceAdapterPosition = ((androidx.preference.PreferenceGroup.PreferencePositionCallback) adapter).getPreferenceAdapterPosition(str);
                }
                if (preferenceAdapterPosition != -1) {
                    androidx.preference.PreferenceFragment.this.mList.scrollToPosition(preferenceAdapterPosition);
                } else {
                    adapter.registerAdapterDataObserver(new androidx.preference.PreferenceFragment.ScrollToPreferenceObserver(adapter, androidx.preference.PreferenceFragment.this.mList, preference, str));
                }
            }
        };
        if (this.mList == null) {
            this.mSelectPreferenceRunnable = runnable;
        } else {
            runnable.run();
        }
    }

    private static class ScrollToPreferenceObserver extends androidx.recyclerview.widget.RecyclerView.AdapterDataObserver {
        private final androidx.recyclerview.widget.RecyclerView.Adapter<?> mAdapter;
        private final java.lang.String mKey;
        private final androidx.recyclerview.widget.RecyclerView mList;
        private final androidx.preference.Preference mPreference;

        ScrollToPreferenceObserver(androidx.recyclerview.widget.RecyclerView.Adapter<?> adapter, androidx.recyclerview.widget.RecyclerView recyclerView, androidx.preference.Preference preference, java.lang.String str) {
            this.mAdapter = adapter;
            this.mList = recyclerView;
            this.mPreference = preference;
            this.mKey = str;
        }

        private void scrollToPreference() {
            int preferenceAdapterPosition;
            this.mAdapter.unregisterAdapterDataObserver(this);
            androidx.preference.Preference preference = this.mPreference;
            if (preference != null) {
                preferenceAdapterPosition = ((androidx.preference.PreferenceGroup.PreferencePositionCallback) this.mAdapter).getPreferenceAdapterPosition(preference);
            } else {
                preferenceAdapterPosition = ((androidx.preference.PreferenceGroup.PreferencePositionCallback) this.mAdapter).getPreferenceAdapterPosition(this.mKey);
            }
            if (preferenceAdapterPosition != -1) {
                this.mList.scrollToPosition(preferenceAdapterPosition);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onChanged() {
            scrollToPreference();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeChanged(int i, int i2) {
            scrollToPreference();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeChanged(int i, int i2, java.lang.Object obj) {
            scrollToPreference();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeInserted(int i, int i2) {
            scrollToPreference();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeRemoved(int i, int i2) {
            scrollToPreference();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeMoved(int i, int i2, int i3) {
            scrollToPreference();
        }
    }

    private class DividerDecoration extends androidx.recyclerview.widget.RecyclerView.ItemDecoration {
        private boolean mAllowDividerAfterLastItem = true;
        private android.graphics.drawable.Drawable mDivider;
        private int mDividerHeight;

        DividerDecoration() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void onDrawOver(android.graphics.Canvas canvas, androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.RecyclerView.State state) {
            if (this.mDivider == null) {
                return;
            }
            int childCount = recyclerView.getChildCount();
            int width = recyclerView.getWidth();
            for (int i = 0; i < childCount; i++) {
                android.view.View childAt = recyclerView.getChildAt(i);
                if (shouldDrawDividerBelow(childAt, recyclerView)) {
                    int y = ((int) childAt.getY()) + childAt.getHeight();
                    this.mDivider.setBounds(0, y, width, this.mDividerHeight + y);
                    this.mDivider.draw(canvas);
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(android.graphics.Rect rect, android.view.View view, androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.RecyclerView.State state) {
            if (shouldDrawDividerBelow(view, recyclerView)) {
                rect.bottom = this.mDividerHeight;
            }
        }

        private boolean shouldDrawDividerBelow(android.view.View view, androidx.recyclerview.widget.RecyclerView recyclerView) {
            androidx.recyclerview.widget.RecyclerView.ViewHolder childViewHolder = recyclerView.getChildViewHolder(view);
            boolean z = false;
            if (!((childViewHolder instanceof androidx.preference.PreferenceViewHolder) && ((androidx.preference.PreferenceViewHolder) childViewHolder).isDividerAllowedBelow())) {
                return false;
            }
            boolean z2 = this.mAllowDividerAfterLastItem;
            int iIndexOfChild = recyclerView.indexOfChild(view);
            if (iIndexOfChild >= recyclerView.getChildCount() - 1) {
                return z2;
            }
            androidx.recyclerview.widget.RecyclerView.ViewHolder childViewHolder2 = recyclerView.getChildViewHolder(recyclerView.getChildAt(iIndexOfChild + 1));
            if ((childViewHolder2 instanceof androidx.preference.PreferenceViewHolder) && ((androidx.preference.PreferenceViewHolder) childViewHolder2).isDividerAllowedAbove()) {
                z = true;
            }
            return z;
        }

        public void setDivider(android.graphics.drawable.Drawable drawable) {
            if (drawable != null) {
                this.mDividerHeight = drawable.getIntrinsicHeight();
            } else {
                this.mDividerHeight = 0;
            }
            this.mDivider = drawable;
            androidx.preference.PreferenceFragment.this.mList.invalidateItemDecorations();
        }

        public void setDividerHeight(int i) {
            this.mDividerHeight = i;
            androidx.preference.PreferenceFragment.this.mList.invalidateItemDecorations();
        }

        public void setAllowDividerAfterLastItem(boolean z) {
            this.mAllowDividerAfterLastItem = z;
        }
    }
}
