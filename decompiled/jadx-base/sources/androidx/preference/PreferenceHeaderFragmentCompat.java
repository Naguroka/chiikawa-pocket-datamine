package androidx.preference;

/* JADX INFO: compiled from: PreferenceHeaderFragmentCompat.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u00012\u00020\u0002:\u0001&B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0017J\n\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u0016J\b\u0010\u0012\u001a\u00020\u0013H&J$\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0017J\u0018\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u001eH\u0017J\u001a\u0010\u001f\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0017J\u0012\u0010!\u001a\u00020\u000e2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u0012\u0010\"\u001a\u00020\u000e2\b\u0010#\u001a\u0004\u0018\u00010$H\u0002J\u0010\u0010\"\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020\u001eH\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006'"}, d2 = {"Landroidx/preference/PreferenceHeaderFragmentCompat;", "Landroidx/fragment/app/Fragment;", "Landroidx/preference/PreferenceFragmentCompat$OnPreferenceStartFragmentCallback;", "()V", "onBackPressedCallback", "Landroidx/activity/OnBackPressedCallback;", "slidingPaneLayout", "Landroidx/slidingpanelayout/widget/SlidingPaneLayout;", "getSlidingPaneLayout", "()Landroidx/slidingpanelayout/widget/SlidingPaneLayout;", "buildContentView", "inflater", "Landroid/view/LayoutInflater;", "onAttach", "", "context", "Landroid/content/Context;", "onCreateInitialDetailFragment", "onCreatePreferenceHeader", "Landroidx/preference/PreferenceFragmentCompat;", "onCreateView", "Landroid/view/View;", androidx.media3.extractor.text.ttml.TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onPreferenceStartFragment", "", "caller", "pref", "Landroidx/preference/Preference;", "onViewCreated", "view", "onViewStateRestored", "openPreferenceHeader", "intent", "Landroid/content/Intent;", "header", "InnerOnBackPressedCallback", "preference_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public abstract class PreferenceHeaderFragmentCompat extends androidx.fragment.app.Fragment implements androidx.preference.PreferenceFragmentCompat.OnPreferenceStartFragmentCallback {
    private androidx.activity.OnBackPressedCallback onBackPressedCallback;

    public abstract androidx.preference.PreferenceFragmentCompat onCreatePreferenceHeader();

    public final androidx.slidingpanelayout.widget.SlidingPaneLayout getSlidingPaneLayout() {
        return (androidx.slidingpanelayout.widget.SlidingPaneLayout) requireView();
    }

    @Override // androidx.preference.PreferenceFragmentCompat.OnPreferenceStartFragmentCallback
    public boolean onPreferenceStartFragment(androidx.preference.PreferenceFragmentCompat caller, androidx.preference.Preference pref) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(caller, "caller");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pref, "pref");
        if (caller.getId() == androidx.preference.R.id.preferences_header) {
            openPreferenceHeader(pref);
            return true;
        }
        if (caller.getId() != androidx.preference.R.id.preferences_detail) {
            return false;
        }
        androidx.fragment.app.FragmentFactory fragmentFactory = getChildFragmentManager().getFragmentFactory();
        java.lang.ClassLoader classLoader = requireContext().getClassLoader();
        java.lang.String fragment = pref.getFragment();
        kotlin.jvm.internal.Intrinsics.checkNotNull(fragment);
        androidx.fragment.app.Fragment fragmentInstantiate = fragmentFactory.instantiate(classLoader, fragment);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(fragmentInstantiate, "childFragmentManager.fra….fragment!!\n            )");
        fragmentInstantiate.setArguments(pref.getExtras());
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(childFragmentManager, "childFragmentManager");
        androidx.fragment.app.FragmentTransaction fragmentTransactionBeginTransaction = childFragmentManager.beginTransaction();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction, "beginTransaction()");
        fragmentTransactionBeginTransaction.setReorderingAllowed(true);
        fragmentTransactionBeginTransaction.replace(androidx.preference.R.id.preferences_detail, fragmentInstantiate);
        fragmentTransactionBeginTransaction.setTransition(androidx.fragment.app.FragmentTransaction.TRANSIT_FRAGMENT_FADE);
        fragmentTransactionBeginTransaction.addToBackStack(null);
        fragmentTransactionBeginTransaction.commit();
        return true;
    }

    /* JADX INFO: compiled from: PreferenceHeaderFragmentCompat.kt */
    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\f\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Landroidx/preference/PreferenceHeaderFragmentCompat$InnerOnBackPressedCallback;", "Landroidx/activity/OnBackPressedCallback;", "Landroidx/slidingpanelayout/widget/SlidingPaneLayout$PanelSlideListener;", "caller", "Landroidx/preference/PreferenceHeaderFragmentCompat;", "(Landroidx/preference/PreferenceHeaderFragmentCompat;)V", "handleOnBackPressed", "", "onPanelClosed", "panel", "Landroid/view/View;", "onPanelOpened", "onPanelSlide", "slideOffset", "", "preference_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    private static final class InnerOnBackPressedCallback extends androidx.activity.OnBackPressedCallback implements androidx.slidingpanelayout.widget.SlidingPaneLayout.PanelSlideListener {
        private final androidx.preference.PreferenceHeaderFragmentCompat caller;

        @Override // androidx.slidingpanelayout.widget.SlidingPaneLayout.PanelSlideListener
        public void onPanelSlide(android.view.View panel, float slideOffset) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(panel, "panel");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InnerOnBackPressedCallback(androidx.preference.PreferenceHeaderFragmentCompat caller) {
            super(true);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(caller, "caller");
            this.caller = caller;
            caller.getSlidingPaneLayout().addPanelSlideListener(this);
        }

        @Override // androidx.activity.OnBackPressedCallback
        public void handleOnBackPressed() {
            this.caller.getSlidingPaneLayout().closePane();
        }

        @Override // androidx.slidingpanelayout.widget.SlidingPaneLayout.PanelSlideListener
        public void onPanelOpened(android.view.View panel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(panel, "panel");
            setEnabled(true);
        }

        @Override // androidx.slidingpanelayout.widget.SlidingPaneLayout.PanelSlideListener
        public void onPanelClosed(android.view.View panel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(panel, "panel");
            setEnabled(false);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        androidx.fragment.app.FragmentManager parentFragmentManager = getParentFragmentManager();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parentFragmentManager");
        androidx.fragment.app.FragmentTransaction fragmentTransactionBeginTransaction = parentFragmentManager.beginTransaction();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction, "beginTransaction()");
        fragmentTransactionBeginTransaction.setPrimaryNavigationFragment(this);
        fragmentTransactionBeginTransaction.commit();
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inflater, "inflater");
        androidx.slidingpanelayout.widget.SlidingPaneLayout slidingPaneLayoutBuildContentView = buildContentView(inflater);
        if (getChildFragmentManager().findFragmentById(androidx.preference.R.id.preferences_header) == null) {
            androidx.preference.PreferenceFragmentCompat preferenceFragmentCompatOnCreatePreferenceHeader = onCreatePreferenceHeader();
            androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(childFragmentManager, "childFragmentManager");
            androidx.fragment.app.FragmentTransaction fragmentTransactionBeginTransaction = childFragmentManager.beginTransaction();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction, "beginTransaction()");
            fragmentTransactionBeginTransaction.setReorderingAllowed(true);
            fragmentTransactionBeginTransaction.add(androidx.preference.R.id.preferences_header, preferenceFragmentCompatOnCreatePreferenceHeader);
            fragmentTransactionBeginTransaction.commit();
        }
        slidingPaneLayoutBuildContentView.setLockMode(3);
        return slidingPaneLayoutBuildContentView;
    }

    private final androidx.slidingpanelayout.widget.SlidingPaneLayout buildContentView(android.view.LayoutInflater inflater) {
        androidx.slidingpanelayout.widget.SlidingPaneLayout slidingPaneLayout = new androidx.slidingpanelayout.widget.SlidingPaneLayout(inflater.getContext());
        slidingPaneLayout.setId(androidx.preference.R.id.preferences_sliding_pane_layout);
        androidx.fragment.app.FragmentContainerView fragmentContainerView = new androidx.fragment.app.FragmentContainerView(inflater.getContext());
        fragmentContainerView.setId(androidx.preference.R.id.preferences_header);
        androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams layoutParams = new androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams(getResources().getDimensionPixelSize(androidx.preference.R.dimen.preferences_header_width), -1);
        layoutParams.weight = getResources().getInteger(androidx.preference.R.integer.preferences_header_pane_weight);
        slidingPaneLayout.addView(fragmentContainerView, layoutParams);
        androidx.fragment.app.FragmentContainerView fragmentContainerView2 = new androidx.fragment.app.FragmentContainerView(inflater.getContext());
        fragmentContainerView2.setId(androidx.preference.R.id.preferences_detail);
        androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams layoutParams2 = new androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams(getResources().getDimensionPixelSize(androidx.preference.R.dimen.preferences_detail_width), -1);
        layoutParams2.weight = getResources().getInteger(androidx.preference.R.integer.preferences_detail_pane_weight);
        slidingPaneLayout.addView(fragmentContainerView2, layoutParams2);
        return slidingPaneLayout;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(android.view.View view, android.os.Bundle savedInstanceState) {
        androidx.activity.OnBackPressedDispatcher onBackPressedDispatcher;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        this.onBackPressedCallback = new androidx.preference.PreferenceHeaderFragmentCompat.InnerOnBackPressedCallback(this);
        androidx.slidingpanelayout.widget.SlidingPaneLayout slidingPaneLayout = getSlidingPaneLayout();
        if (androidx.core.view.ViewCompat.isLaidOut(slidingPaneLayout) && !slidingPaneLayout.isLayoutRequested()) {
            androidx.activity.OnBackPressedCallback onBackPressedCallback = this.onBackPressedCallback;
            kotlin.jvm.internal.Intrinsics.checkNotNull(onBackPressedCallback);
            onBackPressedCallback.setEnabled(getSlidingPaneLayout().isSlideable() && getSlidingPaneLayout().isOpen());
        } else {
            slidingPaneLayout.addOnLayoutChangeListener(new android.view.View.OnLayoutChangeListener() { // from class: androidx.preference.PreferenceHeaderFragmentCompat$onViewCreated$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(android.view.View view2, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(view2, "view");
                    view2.removeOnLayoutChangeListener(this);
                    androidx.activity.OnBackPressedCallback onBackPressedCallback2 = this.this$0.onBackPressedCallback;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(onBackPressedCallback2);
                    onBackPressedCallback2.setEnabled(this.this$0.getSlidingPaneLayout().isSlideable() && this.this$0.getSlidingPaneLayout().isOpen());
                }
            });
        }
        getChildFragmentManager().addOnBackStackChangedListener(new androidx.fragment.app.FragmentManager.OnBackStackChangedListener() { // from class: androidx.preference.PreferenceHeaderFragmentCompat$$ExternalSyntheticLambda0
            @Override // androidx.fragment.app.FragmentManager.OnBackStackChangedListener
            public final void onBackStackChanged() {
                androidx.preference.PreferenceHeaderFragmentCompat.m463onViewCreated$lambda10(this.f$0);
            }
        });
        androidx.activity.OnBackPressedDispatcherOwner onBackPressedDispatcherOwner = androidx.activity.ViewTreeOnBackPressedDispatcherOwner.get(view);
        if (onBackPressedDispatcherOwner == null || (onBackPressedDispatcher = onBackPressedDispatcherOwner.getOnBackPressedDispatcher()) == null) {
            return;
        }
        androidx.lifecycle.LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        androidx.activity.OnBackPressedCallback onBackPressedCallback2 = this.onBackPressedCallback;
        kotlin.jvm.internal.Intrinsics.checkNotNull(onBackPressedCallback2);
        onBackPressedDispatcher.addCallback(viewLifecycleOwner, onBackPressedCallback2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onViewCreated$lambda-10, reason: not valid java name */
    public static final void m463onViewCreated$lambda10(androidx.preference.PreferenceHeaderFragmentCompat this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        androidx.activity.OnBackPressedCallback onBackPressedCallback = this$0.onBackPressedCallback;
        kotlin.jvm.internal.Intrinsics.checkNotNull(onBackPressedCallback);
        onBackPressedCallback.setEnabled(this$0.getChildFragmentManager().getBackStackEntryCount() == 0);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewStateRestored(android.os.Bundle savedInstanceState) {
        androidx.fragment.app.Fragment fragmentOnCreateInitialDetailFragment;
        super.onViewStateRestored(savedInstanceState);
        if (savedInstanceState != null || (fragmentOnCreateInitialDetailFragment = onCreateInitialDetailFragment()) == null) {
            return;
        }
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(childFragmentManager, "childFragmentManager");
        androidx.fragment.app.FragmentTransaction fragmentTransactionBeginTransaction = childFragmentManager.beginTransaction();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction, "beginTransaction()");
        fragmentTransactionBeginTransaction.setReorderingAllowed(true);
        fragmentTransactionBeginTransaction.replace(androidx.preference.R.id.preferences_detail, fragmentOnCreateInitialDetailFragment);
        fragmentTransactionBeginTransaction.commit();
    }

    public androidx.fragment.app.Fragment onCreateInitialDetailFragment() {
        androidx.fragment.app.Fragment fragmentFindFragmentById = getChildFragmentManager().findFragmentById(androidx.preference.R.id.preferences_header);
        if (fragmentFindFragmentById == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type androidx.preference.PreferenceFragmentCompat");
        }
        androidx.preference.PreferenceFragmentCompat preferenceFragmentCompat = (androidx.preference.PreferenceFragmentCompat) fragmentFindFragmentById;
        androidx.fragment.app.Fragment fragmentInstantiate = null;
        if (preferenceFragmentCompat.getPreferenceScreen().getPreferenceCount() <= 0) {
            return null;
        }
        int preferenceCount = preferenceFragmentCompat.getPreferenceScreen().getPreferenceCount();
        int i = 0;
        while (i < preferenceCount) {
            int i2 = i + 1;
            androidx.preference.Preference preference = preferenceFragmentCompat.getPreferenceScreen().getPreference(i);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(preference, "headerFragment.preferenc…reen.getPreference(index)");
            if (preference.getFragment() != null) {
                java.lang.String fragment = preference.getFragment();
                fragmentInstantiate = fragment != null ? getChildFragmentManager().getFragmentFactory().instantiate(requireContext().getClassLoader(), fragment) : null;
                if (fragmentInstantiate == null) {
                    break;
                }
                fragmentInstantiate.setArguments(preference.getExtras());
                break;
            }
            i = i2;
        }
        return fragmentInstantiate;
    }

    private final void openPreferenceHeader(androidx.preference.Preference header) {
        if (header.getFragment() == null) {
            openPreferenceHeader(header.getIntent());
            return;
        }
        java.lang.String fragment = header.getFragment();
        androidx.fragment.app.Fragment fragmentInstantiate = fragment == null ? null : getChildFragmentManager().getFragmentFactory().instantiate(requireContext().getClassLoader(), fragment);
        if (fragmentInstantiate != null) {
            fragmentInstantiate.setArguments(header.getExtras());
        }
        if (getChildFragmentManager().getBackStackEntryCount() > 0) {
            androidx.fragment.app.FragmentManager.BackStackEntry backStackEntryAt = getChildFragmentManager().getBackStackEntryAt(0);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(backStackEntryAt, "childFragmentManager.getBackStackEntryAt(0)");
            getChildFragmentManager().popBackStack(backStackEntryAt.getId(), 1);
        }
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(childFragmentManager, "childFragmentManager");
        androidx.fragment.app.FragmentTransaction fragmentTransactionBeginTransaction = childFragmentManager.beginTransaction();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction, "beginTransaction()");
        fragmentTransactionBeginTransaction.setReorderingAllowed(true);
        int i = androidx.preference.R.id.preferences_detail;
        kotlin.jvm.internal.Intrinsics.checkNotNull(fragmentInstantiate);
        fragmentTransactionBeginTransaction.replace(i, fragmentInstantiate);
        if (getSlidingPaneLayout().isOpen()) {
            fragmentTransactionBeginTransaction.setTransition(androidx.fragment.app.FragmentTransaction.TRANSIT_FRAGMENT_FADE);
        }
        getSlidingPaneLayout().openPane();
        fragmentTransactionBeginTransaction.commit();
    }

    private final void openPreferenceHeader(android.content.Intent intent) {
        if (intent == null) {
            return;
        }
        startActivity(intent);
    }
}
