package androidx.preference;

/* JADX INFO: loaded from: classes3.dex */
public abstract class PreferenceFragmentCompat extends androidx.fragment.app.Fragment implements androidx.preference.PreferenceManager.OnPreferenceTreeClickListener, androidx.preference.PreferenceManager.OnDisplayPreferenceDialogListener, androidx.preference.PreferenceManager.OnNavigateToScreenListener, androidx.preference.DialogPreference.TargetFragment {
    public static final java.lang.String ARG_PREFERENCE_ROOT = "androidx.preference.PreferenceFragmentCompat.PREFERENCE_ROOT";
    private static final java.lang.String DIALOG_FRAGMENT_TAG = "androidx.preference.PreferenceFragment.DIALOG";
    private static final int MSG_BIND_PREFERENCES = 1;
    private static final java.lang.String PREFERENCES_TAG = "android:preferences";
    private static final java.lang.String TAG = "PreferenceFragment";
    private boolean mHavePrefs;
    private boolean mInitDone;
    androidx.recyclerview.widget.RecyclerView mList;
    private androidx.preference.PreferenceManager mPreferenceManager;
    private java.lang.Runnable mSelectPreferenceRunnable;
    private final androidx.preference.PreferenceFragmentCompat.DividerDecoration mDividerDecoration = new androidx.preference.PreferenceFragmentCompat.DividerDecoration();
    private int mLayoutResId = androidx.preference.R.layout.preference_list_fragment;
    private final android.os.Handler mHandler = new android.os.Handler(android.os.Looper.getMainLooper()) { // from class: androidx.preference.PreferenceFragmentCompat.1
        @Override // android.os.Handler
        public void handleMessage(android.os.Message message) {
            if (message.what != 1) {
                return;
            }
            androidx.preference.PreferenceFragmentCompat.this.bindPreferences();
        }
    };
    private final java.lang.Runnable mRequestFocus = new java.lang.Runnable() { // from class: androidx.preference.PreferenceFragmentCompat.2
        @Override // java.lang.Runnable
        public void run() {
            androidx.preference.PreferenceFragmentCompat.this.mList.focusableViewAvailable(androidx.preference.PreferenceFragmentCompat.this.mList);
        }
    };

    public interface OnPreferenceDisplayDialogCallback {
        boolean onPreferenceDisplayDialog(androidx.preference.PreferenceFragmentCompat preferenceFragmentCompat, androidx.preference.Preference preference);
    }

    public interface OnPreferenceStartFragmentCallback {
        boolean onPreferenceStartFragment(androidx.preference.PreferenceFragmentCompat preferenceFragmentCompat, androidx.preference.Preference preference);
    }

    public interface OnPreferenceStartScreenCallback {
        boolean onPreferenceStartScreen(androidx.preference.PreferenceFragmentCompat preferenceFragmentCompat, androidx.preference.PreferenceScreen preferenceScreen);
    }

    public androidx.fragment.app.Fragment getCallbackFragment() {
        return null;
    }

    protected void onBindPreferences() {
    }

    public abstract void onCreatePreferences(android.os.Bundle bundle, java.lang.String str);

    protected void onUnbindPreferences() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.util.TypedValue typedValue = new android.util.TypedValue();
        requireContext().getTheme().resolveAttribute(androidx.preference.R.attr.preferenceTheme, typedValue, true);
        int i = typedValue.resourceId;
        if (i == 0) {
            i = androidx.preference.R.style.PreferenceThemeOverlay;
        }
        requireContext().getTheme().applyStyle(i, false);
        androidx.preference.PreferenceManager preferenceManager = new androidx.preference.PreferenceManager(requireContext());
        this.mPreferenceManager = preferenceManager;
        preferenceManager.setOnNavigateToScreenListener(this);
        onCreatePreferences(bundle, getArguments() != null ? getArguments().getString("androidx.preference.PreferenceFragmentCompat.PREFERENCE_ROOT") : null);
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        android.content.res.TypedArray typedArrayObtainStyledAttributes = requireContext().obtainStyledAttributes(null, androidx.preference.R.styleable.PreferenceFragmentCompat, androidx.preference.R.attr.preferenceFragmentCompatStyle, 0);
        this.mLayoutResId = typedArrayObtainStyledAttributes.getResourceId(androidx.preference.R.styleable.PreferenceFragmentCompat_android_layout, this.mLayoutResId);
        android.graphics.drawable.Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(androidx.preference.R.styleable.PreferenceFragmentCompat_android_divider);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(androidx.preference.R.styleable.PreferenceFragmentCompat_android_dividerHeight, -1);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(androidx.preference.R.styleable.PreferenceFragmentCompat_allowDividerAfterLastItem, true);
        typedArrayObtainStyledAttributes.recycle();
        android.view.LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(requireContext());
        android.view.View viewInflate = layoutInflaterCloneInContext.inflate(this.mLayoutResId, viewGroup, false);
        android.view.View viewFindViewById = viewInflate.findViewById(android.R.id.list_container);
        if (!(viewFindViewById instanceof android.view.ViewGroup)) {
            throw new java.lang.IllegalStateException("Content has view with id attribute 'android.R.id.list_container' that is not a ViewGroup class");
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

    public void setDivider(android.graphics.drawable.Drawable drawable) {
        this.mDividerDecoration.setDivider(drawable);
    }

    public void setDividerHeight(int i) {
        this.mDividerDecoration.setDividerHeight(i);
    }

    @Override // androidx.fragment.app.Fragment
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

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        this.mPreferenceManager.setOnPreferenceTreeClickListener(this);
        this.mPreferenceManager.setOnDisplayPreferenceDialogListener(this);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        this.mPreferenceManager.setOnPreferenceTreeClickListener(null);
        this.mPreferenceManager.setOnDisplayPreferenceDialogListener(null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.mHandler.removeCallbacks(this.mRequestFocus);
        this.mHandler.removeMessages(1);
        if (this.mHavePrefs) {
            unbindPreferences();
        }
        this.mList = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(android.os.Bundle bundle) {
        super.onSaveInstanceState(bundle);
        androidx.preference.PreferenceScreen preferenceScreen = getPreferenceScreen();
        if (preferenceScreen != null) {
            android.os.Bundle bundle2 = new android.os.Bundle();
            preferenceScreen.saveHierarchyState(bundle2);
            bundle.putBundle(PREFERENCES_TAG, bundle2);
        }
    }

    public androidx.preference.PreferenceManager getPreferenceManager() {
        return this.mPreferenceManager;
    }

    public androidx.preference.PreferenceScreen getPreferenceScreen() {
        return this.mPreferenceManager.getPreferenceScreen();
    }

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

    public void addPreferencesFromResource(int i) {
        requirePreferenceManager();
        setPreferenceScreen(this.mPreferenceManager.inflateFromResource(requireContext(), i, getPreferenceScreen()));
    }

    public void setPreferencesFromResource(int i, java.lang.String str) {
        androidx.preference.Preference preferenceFindPreference;
        requirePreferenceManager();
        androidx.preference.PreferenceScreen preferenceScreenInflateFromResource = this.mPreferenceManager.inflateFromResource(requireContext(), i, null);
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
    public boolean onPreferenceTreeClick(androidx.preference.Preference preference) {
        if (preference.getFragment() == null) {
            return false;
        }
        boolean zOnPreferenceStartFragment = getCallbackFragment() instanceof androidx.preference.PreferenceFragmentCompat.OnPreferenceStartFragmentCallback ? ((androidx.preference.PreferenceFragmentCompat.OnPreferenceStartFragmentCallback) getCallbackFragment()).onPreferenceStartFragment(this, preference) : false;
        for (androidx.fragment.app.Fragment parentFragment = this; !zOnPreferenceStartFragment && parentFragment != null; parentFragment = parentFragment.getParentFragment()) {
            if (parentFragment instanceof androidx.preference.PreferenceFragmentCompat.OnPreferenceStartFragmentCallback) {
                zOnPreferenceStartFragment = ((androidx.preference.PreferenceFragmentCompat.OnPreferenceStartFragmentCallback) parentFragment).onPreferenceStartFragment(this, preference);
            }
        }
        if (!zOnPreferenceStartFragment && (getContext() instanceof androidx.preference.PreferenceFragmentCompat.OnPreferenceStartFragmentCallback)) {
            zOnPreferenceStartFragment = ((androidx.preference.PreferenceFragmentCompat.OnPreferenceStartFragmentCallback) getContext()).onPreferenceStartFragment(this, preference);
        }
        if (!zOnPreferenceStartFragment && (getActivity() instanceof androidx.preference.PreferenceFragmentCompat.OnPreferenceStartFragmentCallback)) {
            zOnPreferenceStartFragment = ((androidx.preference.PreferenceFragmentCompat.OnPreferenceStartFragmentCallback) getActivity()).onPreferenceStartFragment(this, preference);
        }
        if (zOnPreferenceStartFragment) {
            return true;
        }
        android.util.Log.w(TAG, "onPreferenceStartFragment is not implemented in the parent activity - attempting to use a fallback implementation. You should implement this method so that you can configure the new fragment that will be displayed, and set a transition between the fragments.");
        androidx.fragment.app.FragmentManager parentFragmentManager = getParentFragmentManager();
        android.os.Bundle extras = preference.getExtras();
        androidx.fragment.app.Fragment fragmentInstantiate = parentFragmentManager.getFragmentFactory().instantiate(requireActivity().getClassLoader(), preference.getFragment());
        fragmentInstantiate.setArguments(extras);
        fragmentInstantiate.setTargetFragment(this, 0);
        parentFragmentManager.beginTransaction().replace(((android.view.View) requireView().getParent()).getId(), fragmentInstantiate).addToBackStack(null).commit();
        return true;
    }

    @Override // androidx.preference.PreferenceManager.OnNavigateToScreenListener
    public void onNavigateToScreen(androidx.preference.PreferenceScreen preferenceScreen) {
        boolean zOnPreferenceStartScreen = getCallbackFragment() instanceof androidx.preference.PreferenceFragmentCompat.OnPreferenceStartScreenCallback ? ((androidx.preference.PreferenceFragmentCompat.OnPreferenceStartScreenCallback) getCallbackFragment()).onPreferenceStartScreen(this, preferenceScreen) : false;
        for (androidx.fragment.app.Fragment parentFragment = this; !zOnPreferenceStartScreen && parentFragment != null; parentFragment = parentFragment.getParentFragment()) {
            if (parentFragment instanceof androidx.preference.PreferenceFragmentCompat.OnPreferenceStartScreenCallback) {
                zOnPreferenceStartScreen = ((androidx.preference.PreferenceFragmentCompat.OnPreferenceStartScreenCallback) parentFragment).onPreferenceStartScreen(this, preferenceScreen);
            }
        }
        if (!zOnPreferenceStartScreen && (getContext() instanceof androidx.preference.PreferenceFragmentCompat.OnPreferenceStartScreenCallback)) {
            zOnPreferenceStartScreen = ((androidx.preference.PreferenceFragmentCompat.OnPreferenceStartScreenCallback) getContext()).onPreferenceStartScreen(this, preferenceScreen);
        }
        if (zOnPreferenceStartScreen || !(getActivity() instanceof androidx.preference.PreferenceFragmentCompat.OnPreferenceStartScreenCallback)) {
            return;
        }
        ((androidx.preference.PreferenceFragmentCompat.OnPreferenceStartScreenCallback) getActivity()).onPreferenceStartScreen(this, preferenceScreen);
    }

    @Override // androidx.preference.DialogPreference.TargetFragment
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
        getListView().setAdapter(null);
        androidx.preference.PreferenceScreen preferenceScreen = getPreferenceScreen();
        if (preferenceScreen != null) {
            preferenceScreen.onDetached();
        }
        onUnbindPreferences();
    }

    public final androidx.recyclerview.widget.RecyclerView getListView() {
        return this.mList;
    }

    public androidx.recyclerview.widget.RecyclerView onCreateRecyclerView(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        androidx.recyclerview.widget.RecyclerView recyclerView;
        if (requireContext().getPackageManager().hasSystemFeature("android.hardware.type.automotive") && (recyclerView = (androidx.recyclerview.widget.RecyclerView) viewGroup.findViewById(androidx.preference.R.id.recycler_view)) != null) {
            return recyclerView;
        }
        androidx.recyclerview.widget.RecyclerView recyclerView2 = (androidx.recyclerview.widget.RecyclerView) layoutInflater.inflate(androidx.preference.R.layout.preference_recyclerview, viewGroup, false);
        recyclerView2.setLayoutManager(onCreateLayoutManager());
        recyclerView2.setAccessibilityDelegateCompat(new androidx.preference.PreferenceRecyclerViewAccessibilityDelegate(recyclerView2));
        return recyclerView2;
    }

    public androidx.recyclerview.widget.RecyclerView.LayoutManager onCreateLayoutManager() {
        return new androidx.recyclerview.widget.LinearLayoutManager(requireContext());
    }

    protected androidx.recyclerview.widget.RecyclerView.Adapter onCreateAdapter(androidx.preference.PreferenceScreen preferenceScreen) {
        return new androidx.preference.PreferenceGroupAdapter(preferenceScreen);
    }

    @Override // androidx.preference.PreferenceManager.OnDisplayPreferenceDialogListener
    public void onDisplayPreferenceDialog(androidx.preference.Preference preference) {
        androidx.fragment.app.DialogFragment dialogFragmentNewInstance;
        boolean zOnPreferenceDisplayDialog = getCallbackFragment() instanceof androidx.preference.PreferenceFragmentCompat.OnPreferenceDisplayDialogCallback ? ((androidx.preference.PreferenceFragmentCompat.OnPreferenceDisplayDialogCallback) getCallbackFragment()).onPreferenceDisplayDialog(this, preference) : false;
        for (androidx.fragment.app.Fragment parentFragment = this; !zOnPreferenceDisplayDialog && parentFragment != null; parentFragment = parentFragment.getParentFragment()) {
            if (parentFragment instanceof androidx.preference.PreferenceFragmentCompat.OnPreferenceDisplayDialogCallback) {
                zOnPreferenceDisplayDialog = ((androidx.preference.PreferenceFragmentCompat.OnPreferenceDisplayDialogCallback) parentFragment).onPreferenceDisplayDialog(this, preference);
            }
        }
        if (!zOnPreferenceDisplayDialog && (getContext() instanceof androidx.preference.PreferenceFragmentCompat.OnPreferenceDisplayDialogCallback)) {
            zOnPreferenceDisplayDialog = ((androidx.preference.PreferenceFragmentCompat.OnPreferenceDisplayDialogCallback) getContext()).onPreferenceDisplayDialog(this, preference);
        }
        if (!zOnPreferenceDisplayDialog && (getActivity() instanceof androidx.preference.PreferenceFragmentCompat.OnPreferenceDisplayDialogCallback)) {
            zOnPreferenceDisplayDialog = ((androidx.preference.PreferenceFragmentCompat.OnPreferenceDisplayDialogCallback) getActivity()).onPreferenceDisplayDialog(this, preference);
        }
        if (!zOnPreferenceDisplayDialog && getParentFragmentManager().findFragmentByTag(DIALOG_FRAGMENT_TAG) == null) {
            if (preference instanceof androidx.preference.EditTextPreference) {
                dialogFragmentNewInstance = androidx.preference.EditTextPreferenceDialogFragmentCompat.newInstance(preference.getKey());
            } else if (preference instanceof androidx.preference.ListPreference) {
                dialogFragmentNewInstance = androidx.preference.ListPreferenceDialogFragmentCompat.newInstance(preference.getKey());
            } else if (preference instanceof androidx.preference.MultiSelectListPreference) {
                dialogFragmentNewInstance = androidx.preference.MultiSelectListPreferenceDialogFragmentCompat.newInstance(preference.getKey());
            } else {
                throw new java.lang.IllegalArgumentException("Cannot display dialog for an unknown Preference type: " + preference.getClass().getSimpleName() + ". Make sure to implement onPreferenceDisplayDialog() to handle displaying a custom dialog for this Preference.");
            }
            dialogFragmentNewInstance.setTargetFragment(this, 0);
            dialogFragmentNewInstance.show(getParentFragmentManager(), DIALOG_FRAGMENT_TAG);
        }
    }

    public void scrollToPreference(java.lang.String str) {
        scrollToPreferenceInternal(null, str);
    }

    public void scrollToPreference(androidx.preference.Preference preference) {
        scrollToPreferenceInternal(preference, null);
    }

    private void scrollToPreferenceInternal(final androidx.preference.Preference preference, final java.lang.String str) {
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: androidx.preference.PreferenceFragmentCompat.3
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public void run() {
                int preferenceAdapterPosition;
                androidx.recyclerview.widget.RecyclerView.Adapter adapter = androidx.preference.PreferenceFragmentCompat.this.mList.getAdapter();
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
                    androidx.preference.PreferenceFragmentCompat.this.mList.scrollToPosition(preferenceAdapterPosition);
                } else {
                    adapter.registerAdapterDataObserver(new androidx.preference.PreferenceFragmentCompat.ScrollToPreferenceObserver(adapter, androidx.preference.PreferenceFragmentCompat.this.mList, preference, str));
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
            androidx.preference.PreferenceFragmentCompat.this.mList.invalidateItemDecorations();
        }

        public void setDividerHeight(int i) {
            this.mDividerHeight = i;
            androidx.preference.PreferenceFragmentCompat.this.mList.invalidateItemDecorations();
        }

        public void setAllowDividerAfterLastItem(boolean z) {
            this.mAllowDividerAfterLastItem = z;
        }
    }
}
