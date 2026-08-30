package androidx.fragment.app;

/* JADX INFO: loaded from: classes.dex */
class FragmentStateManager {
    private static final java.lang.String TAG = "FragmentManager";
    private static final java.lang.String TARGET_REQUEST_CODE_STATE_TAG = "android:target_req_state";
    private static final java.lang.String TARGET_STATE_TAG = "android:target_state";
    private static final java.lang.String USER_VISIBLE_HINT_TAG = "android:user_visible_hint";
    private static final java.lang.String VIEW_REGISTRY_STATE_TAG = "android:view_registry_state";
    private static final java.lang.String VIEW_STATE_TAG = "android:view_state";
    private final androidx.fragment.app.FragmentLifecycleCallbacksDispatcher mDispatcher;
    private final androidx.fragment.app.Fragment mFragment;
    private final androidx.fragment.app.FragmentStore mFragmentStore;
    private boolean mMovingToState = false;
    private int mFragmentManagerState = -1;

    FragmentStateManager(androidx.fragment.app.FragmentLifecycleCallbacksDispatcher fragmentLifecycleCallbacksDispatcher, androidx.fragment.app.FragmentStore fragmentStore, androidx.fragment.app.Fragment fragment) {
        this.mDispatcher = fragmentLifecycleCallbacksDispatcher;
        this.mFragmentStore = fragmentStore;
        this.mFragment = fragment;
    }

    FragmentStateManager(androidx.fragment.app.FragmentLifecycleCallbacksDispatcher fragmentLifecycleCallbacksDispatcher, androidx.fragment.app.FragmentStore fragmentStore, java.lang.ClassLoader classLoader, androidx.fragment.app.FragmentFactory fragmentFactory, androidx.fragment.app.FragmentState fragmentState) {
        this.mDispatcher = fragmentLifecycleCallbacksDispatcher;
        this.mFragmentStore = fragmentStore;
        androidx.fragment.app.Fragment fragmentInstantiate = fragmentFactory.instantiate(classLoader, fragmentState.mClassName);
        this.mFragment = fragmentInstantiate;
        if (fragmentState.mArguments != null) {
            fragmentState.mArguments.setClassLoader(classLoader);
        }
        fragmentInstantiate.setArguments(fragmentState.mArguments);
        fragmentInstantiate.mWho = fragmentState.mWho;
        fragmentInstantiate.mFromLayout = fragmentState.mFromLayout;
        fragmentInstantiate.mRestored = true;
        fragmentInstantiate.mFragmentId = fragmentState.mFragmentId;
        fragmentInstantiate.mContainerId = fragmentState.mContainerId;
        fragmentInstantiate.mTag = fragmentState.mTag;
        fragmentInstantiate.mRetainInstance = fragmentState.mRetainInstance;
        fragmentInstantiate.mRemoving = fragmentState.mRemoving;
        fragmentInstantiate.mDetached = fragmentState.mDetached;
        fragmentInstantiate.mHidden = fragmentState.mHidden;
        fragmentInstantiate.mMaxState = androidx.lifecycle.Lifecycle.State.values()[fragmentState.mMaxLifecycleState];
        if (fragmentState.mSavedFragmentState != null) {
            fragmentInstantiate.mSavedFragmentState = fragmentState.mSavedFragmentState;
        } else {
            fragmentInstantiate.mSavedFragmentState = new android.os.Bundle();
        }
        if (androidx.fragment.app.FragmentManager.isLoggingEnabled(2)) {
            android.util.Log.v(TAG, "Instantiated fragment " + fragmentInstantiate);
        }
    }

    FragmentStateManager(androidx.fragment.app.FragmentLifecycleCallbacksDispatcher fragmentLifecycleCallbacksDispatcher, androidx.fragment.app.FragmentStore fragmentStore, androidx.fragment.app.Fragment fragment, androidx.fragment.app.FragmentState fragmentState) {
        this.mDispatcher = fragmentLifecycleCallbacksDispatcher;
        this.mFragmentStore = fragmentStore;
        this.mFragment = fragment;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
        fragment.mBackStackNesting = 0;
        fragment.mInLayout = false;
        fragment.mAdded = false;
        fragment.mTargetWho = fragment.mTarget != null ? fragment.mTarget.mWho : null;
        fragment.mTarget = null;
        if (fragmentState.mSavedFragmentState != null) {
            fragment.mSavedFragmentState = fragmentState.mSavedFragmentState;
        } else {
            fragment.mSavedFragmentState = new android.os.Bundle();
        }
    }

    androidx.fragment.app.Fragment getFragment() {
        return this.mFragment;
    }

    void setFragmentManagerState(int i) {
        this.mFragmentManagerState = i;
    }

    int computeExpectedState() {
        if (this.mFragment.mFragmentManager == null) {
            return this.mFragment.mState;
        }
        int iMin = this.mFragmentManagerState;
        int i = androidx.fragment.app.FragmentStateManager.AnonymousClass2.$SwitchMap$androidx$lifecycle$Lifecycle$State[this.mFragment.mMaxState.ordinal()];
        if (i != 1) {
            if (i == 2) {
                iMin = java.lang.Math.min(iMin, 5);
            } else if (i == 3) {
                iMin = java.lang.Math.min(iMin, 1);
            } else if (i == 4) {
                iMin = java.lang.Math.min(iMin, 0);
            } else {
                iMin = java.lang.Math.min(iMin, -1);
            }
        }
        if (this.mFragment.mFromLayout) {
            if (this.mFragment.mInLayout) {
                iMin = java.lang.Math.max(this.mFragmentManagerState, 2);
                if (this.mFragment.mView != null && this.mFragment.mView.getParent() == null) {
                    iMin = java.lang.Math.min(iMin, 2);
                }
            } else {
                iMin = this.mFragmentManagerState < 4 ? java.lang.Math.min(iMin, this.mFragment.mState) : java.lang.Math.min(iMin, 1);
            }
        }
        if (!this.mFragment.mAdded) {
            iMin = java.lang.Math.min(iMin, 1);
        }
        androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact awaitingCompletionLifecycleImpact = (!androidx.fragment.app.FragmentManager.USE_STATE_MANAGER || this.mFragment.mContainer == null) ? null : androidx.fragment.app.SpecialEffectsController.getOrCreateController(this.mFragment.mContainer, this.mFragment.getParentFragmentManager()).getAwaitingCompletionLifecycleImpact(this);
        if (awaitingCompletionLifecycleImpact == androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.ADDING) {
            iMin = java.lang.Math.min(iMin, 6);
        } else if (awaitingCompletionLifecycleImpact == androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.REMOVING) {
            iMin = java.lang.Math.max(iMin, 3);
        } else if (this.mFragment.mRemoving) {
            if (this.mFragment.isInBackStack()) {
                iMin = java.lang.Math.min(iMin, 1);
            } else {
                iMin = java.lang.Math.min(iMin, -1);
            }
        }
        if (this.mFragment.mDeferStart && this.mFragment.mState < 5) {
            iMin = java.lang.Math.min(iMin, 4);
        }
        if (androidx.fragment.app.FragmentManager.isLoggingEnabled(2)) {
            android.util.Log.v(TAG, "computeExpectedState() of " + iMin + " for " + this.mFragment);
        }
        return iMin;
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentStateManager$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$androidx$lifecycle$Lifecycle$State;

        static {
            int[] iArr = new int[androidx.lifecycle.Lifecycle.State.values().length];
            $SwitchMap$androidx$lifecycle$Lifecycle$State = iArr;
            try {
                iArr[androidx.lifecycle.Lifecycle.State.RESUMED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$androidx$lifecycle$Lifecycle$State[androidx.lifecycle.Lifecycle.State.STARTED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$androidx$lifecycle$Lifecycle$State[androidx.lifecycle.Lifecycle.State.CREATED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$androidx$lifecycle$Lifecycle$State[androidx.lifecycle.Lifecycle.State.INITIALIZED.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
        }
    }

    void moveToExpectedState() {
        if (this.mMovingToState) {
            if (androidx.fragment.app.FragmentManager.isLoggingEnabled(2)) {
                android.util.Log.v(TAG, "Ignoring re-entrant call to moveToExpectedState() for " + getFragment());
                return;
            }
            return;
        }
        try {
            this.mMovingToState = true;
            while (true) {
                int iComputeExpectedState = computeExpectedState();
                if (iComputeExpectedState != this.mFragment.mState) {
                    if (iComputeExpectedState > this.mFragment.mState) {
                        switch (this.mFragment.mState + 1) {
                            case 0:
                                attach();
                                break;
                            case 1:
                                create();
                                break;
                            case 2:
                                ensureInflatedView();
                                createView();
                                break;
                            case 3:
                                activityCreated();
                                break;
                            case 4:
                                if (this.mFragment.mView != null && this.mFragment.mContainer != null) {
                                    androidx.fragment.app.SpecialEffectsController.getOrCreateController(this.mFragment.mContainer, this.mFragment.getParentFragmentManager()).enqueueAdd(androidx.fragment.app.SpecialEffectsController.Operation.State.from(this.mFragment.mView.getVisibility()), this);
                                }
                                this.mFragment.mState = 4;
                                break;
                            case 5:
                                start();
                                break;
                            case 6:
                                this.mFragment.mState = 6;
                                break;
                            case 7:
                                resume();
                                break;
                        }
                    } else {
                        switch (this.mFragment.mState - 1) {
                            case -1:
                                detach();
                                break;
                            case 0:
                                destroy();
                                break;
                            case 1:
                                destroyFragmentView();
                                this.mFragment.mState = 1;
                                break;
                            case 2:
                                this.mFragment.mInLayout = false;
                                this.mFragment.mState = 2;
                                break;
                            case 3:
                                if (androidx.fragment.app.FragmentManager.isLoggingEnabled(3)) {
                                    android.util.Log.d(TAG, "movefrom ACTIVITY_CREATED: " + this.mFragment);
                                }
                                if (this.mFragment.mView != null && this.mFragment.mSavedViewState == null) {
                                    saveViewState();
                                }
                                if (this.mFragment.mView != null && this.mFragment.mContainer != null) {
                                    androidx.fragment.app.SpecialEffectsController.getOrCreateController(this.mFragment.mContainer, this.mFragment.getParentFragmentManager()).enqueueRemove(this);
                                }
                                this.mFragment.mState = 3;
                                break;
                            case 4:
                                stop();
                                break;
                            case 5:
                                this.mFragment.mState = 5;
                                break;
                            case 6:
                                pause();
                                break;
                        }
                    }
                } else {
                    if (androidx.fragment.app.FragmentManager.USE_STATE_MANAGER && this.mFragment.mHiddenChanged) {
                        if (this.mFragment.mView != null && this.mFragment.mContainer != null) {
                            androidx.fragment.app.SpecialEffectsController orCreateController = androidx.fragment.app.SpecialEffectsController.getOrCreateController(this.mFragment.mContainer, this.mFragment.getParentFragmentManager());
                            if (this.mFragment.mHidden) {
                                orCreateController.enqueueHide(this);
                            } else {
                                orCreateController.enqueueShow(this);
                            }
                        }
                        if (this.mFragment.mFragmentManager != null) {
                            this.mFragment.mFragmentManager.invalidateMenuForFragment(this.mFragment);
                        }
                        this.mFragment.mHiddenChanged = false;
                        androidx.fragment.app.Fragment fragment = this.mFragment;
                        fragment.onHiddenChanged(fragment.mHidden);
                    }
                    return;
                }
            }
        } finally {
            this.mMovingToState = false;
        }
    }

    void ensureInflatedView() {
        if (this.mFragment.mFromLayout && this.mFragment.mInLayout && !this.mFragment.mPerformedCreateView) {
            if (androidx.fragment.app.FragmentManager.isLoggingEnabled(3)) {
                android.util.Log.d(TAG, "moveto CREATE_VIEW: " + this.mFragment);
            }
            androidx.fragment.app.Fragment fragment = this.mFragment;
            fragment.performCreateView(fragment.performGetLayoutInflater(fragment.mSavedFragmentState), null, this.mFragment.mSavedFragmentState);
            if (this.mFragment.mView != null) {
                this.mFragment.mView.setSaveFromParentEnabled(false);
                this.mFragment.mView.setTag(androidx.fragment.R.id.fragment_container_view_tag, this.mFragment);
                if (this.mFragment.mHidden) {
                    this.mFragment.mView.setVisibility(8);
                }
                this.mFragment.performViewCreated();
                androidx.fragment.app.FragmentLifecycleCallbacksDispatcher fragmentLifecycleCallbacksDispatcher = this.mDispatcher;
                androidx.fragment.app.Fragment fragment2 = this.mFragment;
                fragmentLifecycleCallbacksDispatcher.dispatchOnFragmentViewCreated(fragment2, fragment2.mView, this.mFragment.mSavedFragmentState, false);
                this.mFragment.mState = 2;
            }
        }
    }

    void restoreState(java.lang.ClassLoader classLoader) {
        if (this.mFragment.mSavedFragmentState == null) {
            return;
        }
        this.mFragment.mSavedFragmentState.setClassLoader(classLoader);
        androidx.fragment.app.Fragment fragment = this.mFragment;
        fragment.mSavedViewState = fragment.mSavedFragmentState.getSparseParcelableArray(VIEW_STATE_TAG);
        androidx.fragment.app.Fragment fragment2 = this.mFragment;
        fragment2.mSavedViewRegistryState = fragment2.mSavedFragmentState.getBundle(VIEW_REGISTRY_STATE_TAG);
        androidx.fragment.app.Fragment fragment3 = this.mFragment;
        fragment3.mTargetWho = fragment3.mSavedFragmentState.getString(TARGET_STATE_TAG);
        if (this.mFragment.mTargetWho != null) {
            androidx.fragment.app.Fragment fragment4 = this.mFragment;
            fragment4.mTargetRequestCode = fragment4.mSavedFragmentState.getInt(TARGET_REQUEST_CODE_STATE_TAG, 0);
        }
        if (this.mFragment.mSavedUserVisibleHint != null) {
            androidx.fragment.app.Fragment fragment5 = this.mFragment;
            fragment5.mUserVisibleHint = fragment5.mSavedUserVisibleHint.booleanValue();
            this.mFragment.mSavedUserVisibleHint = null;
        } else {
            androidx.fragment.app.Fragment fragment6 = this.mFragment;
            fragment6.mUserVisibleHint = fragment6.mSavedFragmentState.getBoolean(USER_VISIBLE_HINT_TAG, true);
        }
        if (this.mFragment.mUserVisibleHint) {
            return;
        }
        this.mFragment.mDeferStart = true;
    }

    void attach() {
        if (androidx.fragment.app.FragmentManager.isLoggingEnabled(3)) {
            android.util.Log.d(TAG, "moveto ATTACHED: " + this.mFragment);
        }
        androidx.fragment.app.FragmentStateManager fragmentStateManager = null;
        if (this.mFragment.mTarget != null) {
            androidx.fragment.app.FragmentStateManager fragmentStateManager2 = this.mFragmentStore.getFragmentStateManager(this.mFragment.mTarget.mWho);
            if (fragmentStateManager2 == null) {
                throw new java.lang.IllegalStateException("Fragment " + this.mFragment + " declared target fragment " + this.mFragment.mTarget + " that does not belong to this FragmentManager!");
            }
            androidx.fragment.app.Fragment fragment = this.mFragment;
            fragment.mTargetWho = fragment.mTarget.mWho;
            this.mFragment.mTarget = null;
            fragmentStateManager = fragmentStateManager2;
        } else if (this.mFragment.mTargetWho != null && (fragmentStateManager = this.mFragmentStore.getFragmentStateManager(this.mFragment.mTargetWho)) == null) {
            throw new java.lang.IllegalStateException("Fragment " + this.mFragment + " declared target fragment " + this.mFragment.mTargetWho + " that does not belong to this FragmentManager!");
        }
        if (fragmentStateManager != null && (androidx.fragment.app.FragmentManager.USE_STATE_MANAGER || fragmentStateManager.getFragment().mState < 1)) {
            fragmentStateManager.moveToExpectedState();
        }
        androidx.fragment.app.Fragment fragment2 = this.mFragment;
        fragment2.mHost = fragment2.mFragmentManager.getHost();
        androidx.fragment.app.Fragment fragment3 = this.mFragment;
        fragment3.mParentFragment = fragment3.mFragmentManager.getParent();
        this.mDispatcher.dispatchOnFragmentPreAttached(this.mFragment, false);
        this.mFragment.performAttach();
        this.mDispatcher.dispatchOnFragmentAttached(this.mFragment, false);
    }

    void create() {
        if (androidx.fragment.app.FragmentManager.isLoggingEnabled(3)) {
            android.util.Log.d(TAG, "moveto CREATED: " + this.mFragment);
        }
        if (!this.mFragment.mIsCreated) {
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher fragmentLifecycleCallbacksDispatcher = this.mDispatcher;
            androidx.fragment.app.Fragment fragment = this.mFragment;
            fragmentLifecycleCallbacksDispatcher.dispatchOnFragmentPreCreated(fragment, fragment.mSavedFragmentState, false);
            androidx.fragment.app.Fragment fragment2 = this.mFragment;
            fragment2.performCreate(fragment2.mSavedFragmentState);
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher fragmentLifecycleCallbacksDispatcher2 = this.mDispatcher;
            androidx.fragment.app.Fragment fragment3 = this.mFragment;
            fragmentLifecycleCallbacksDispatcher2.dispatchOnFragmentCreated(fragment3, fragment3.mSavedFragmentState, false);
            return;
        }
        androidx.fragment.app.Fragment fragment4 = this.mFragment;
        fragment4.restoreChildFragmentState(fragment4.mSavedFragmentState);
        this.mFragment.mState = 1;
    }

    void createView() {
        android.view.ViewGroup viewGroup;
        java.lang.String resourceName;
        if (this.mFragment.mFromLayout) {
            return;
        }
        if (androidx.fragment.app.FragmentManager.isLoggingEnabled(3)) {
            android.util.Log.d(TAG, "moveto CREATE_VIEW: " + this.mFragment);
        }
        androidx.fragment.app.Fragment fragment = this.mFragment;
        android.view.LayoutInflater layoutInflaterPerformGetLayoutInflater = fragment.performGetLayoutInflater(fragment.mSavedFragmentState);
        if (this.mFragment.mContainer != null) {
            viewGroup = this.mFragment.mContainer;
        } else if (this.mFragment.mContainerId == 0) {
            viewGroup = null;
        } else {
            if (this.mFragment.mContainerId == -1) {
                throw new java.lang.IllegalArgumentException("Cannot create fragment " + this.mFragment + " for a container view with no id");
            }
            viewGroup = (android.view.ViewGroup) this.mFragment.mFragmentManager.getContainer().onFindViewById(this.mFragment.mContainerId);
            if (viewGroup == null && !this.mFragment.mRestored) {
                try {
                    resourceName = this.mFragment.getResources().getResourceName(this.mFragment.mContainerId);
                } catch (android.content.res.Resources.NotFoundException unused) {
                    resourceName = "unknown";
                }
                throw new java.lang.IllegalArgumentException("No view found for id 0x" + java.lang.Integer.toHexString(this.mFragment.mContainerId) + " (" + resourceName + ") for fragment " + this.mFragment);
            }
        }
        this.mFragment.mContainer = viewGroup;
        androidx.fragment.app.Fragment fragment2 = this.mFragment;
        fragment2.performCreateView(layoutInflaterPerformGetLayoutInflater, viewGroup, fragment2.mSavedFragmentState);
        if (this.mFragment.mView != null) {
            boolean z = false;
            this.mFragment.mView.setSaveFromParentEnabled(false);
            this.mFragment.mView.setTag(androidx.fragment.R.id.fragment_container_view_tag, this.mFragment);
            if (viewGroup != null) {
                addViewToContainer();
            }
            if (this.mFragment.mHidden) {
                this.mFragment.mView.setVisibility(8);
            }
            if (androidx.core.view.ViewCompat.isAttachedToWindow(this.mFragment.mView)) {
                androidx.core.view.ViewCompat.requestApplyInsets(this.mFragment.mView);
            } else {
                final android.view.View view = this.mFragment.mView;
                view.addOnAttachStateChangeListener(new android.view.View.OnAttachStateChangeListener() { // from class: androidx.fragment.app.FragmentStateManager.1
                    @Override // android.view.View.OnAttachStateChangeListener
                    public void onViewDetachedFromWindow(android.view.View view2) {
                    }

                    @Override // android.view.View.OnAttachStateChangeListener
                    public void onViewAttachedToWindow(android.view.View view2) {
                        view.removeOnAttachStateChangeListener(this);
                        androidx.core.view.ViewCompat.requestApplyInsets(view);
                    }
                });
            }
            this.mFragment.performViewCreated();
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher fragmentLifecycleCallbacksDispatcher = this.mDispatcher;
            androidx.fragment.app.Fragment fragment3 = this.mFragment;
            fragmentLifecycleCallbacksDispatcher.dispatchOnFragmentViewCreated(fragment3, fragment3.mView, this.mFragment.mSavedFragmentState, false);
            int visibility = this.mFragment.mView.getVisibility();
            float alpha = this.mFragment.mView.getAlpha();
            if (androidx.fragment.app.FragmentManager.USE_STATE_MANAGER) {
                this.mFragment.setPostOnViewCreatedAlpha(alpha);
                if (this.mFragment.mContainer != null && visibility == 0) {
                    android.view.View viewFindFocus = this.mFragment.mView.findFocus();
                    if (viewFindFocus != null) {
                        this.mFragment.setFocusedView(viewFindFocus);
                        if (androidx.fragment.app.FragmentManager.isLoggingEnabled(2)) {
                            android.util.Log.v(TAG, "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + this.mFragment);
                        }
                    }
                    this.mFragment.mView.setAlpha(0.0f);
                }
            } else {
                androidx.fragment.app.Fragment fragment4 = this.mFragment;
                if (visibility == 0 && fragment4.mContainer != null) {
                    z = true;
                }
                fragment4.mIsNewlyAdded = z;
            }
        }
        this.mFragment.mState = 2;
    }

    void activityCreated() {
        if (androidx.fragment.app.FragmentManager.isLoggingEnabled(3)) {
            android.util.Log.d(TAG, "moveto ACTIVITY_CREATED: " + this.mFragment);
        }
        androidx.fragment.app.Fragment fragment = this.mFragment;
        fragment.performActivityCreated(fragment.mSavedFragmentState);
        androidx.fragment.app.FragmentLifecycleCallbacksDispatcher fragmentLifecycleCallbacksDispatcher = this.mDispatcher;
        androidx.fragment.app.Fragment fragment2 = this.mFragment;
        fragmentLifecycleCallbacksDispatcher.dispatchOnFragmentActivityCreated(fragment2, fragment2.mSavedFragmentState, false);
    }

    void start() {
        if (androidx.fragment.app.FragmentManager.isLoggingEnabled(3)) {
            android.util.Log.d(TAG, "moveto STARTED: " + this.mFragment);
        }
        this.mFragment.performStart();
        this.mDispatcher.dispatchOnFragmentStarted(this.mFragment, false);
    }

    void resume() {
        if (androidx.fragment.app.FragmentManager.isLoggingEnabled(3)) {
            android.util.Log.d(TAG, "moveto RESUMED: " + this.mFragment);
        }
        android.view.View focusedView = this.mFragment.getFocusedView();
        if (focusedView != null && isFragmentViewChild(focusedView)) {
            boolean zRequestFocus = focusedView.requestFocus();
            if (androidx.fragment.app.FragmentManager.isLoggingEnabled(2)) {
                android.util.Log.v(TAG, "requestFocus: Restoring focused view " + focusedView + " " + (zRequestFocus ? "succeeded" : com.ironsource.y8.h.t) + " on Fragment " + this.mFragment + " resulting in focused view " + this.mFragment.mView.findFocus());
            }
        }
        this.mFragment.setFocusedView(null);
        this.mFragment.performResume();
        this.mDispatcher.dispatchOnFragmentResumed(this.mFragment, false);
        this.mFragment.mSavedFragmentState = null;
        this.mFragment.mSavedViewState = null;
        this.mFragment.mSavedViewRegistryState = null;
    }

    private boolean isFragmentViewChild(android.view.View view) {
        if (view == this.mFragment.mView) {
            return true;
        }
        for (android.view.ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == this.mFragment.mView) {
                return true;
            }
        }
        return false;
    }

    void pause() {
        if (androidx.fragment.app.FragmentManager.isLoggingEnabled(3)) {
            android.util.Log.d(TAG, "movefrom RESUMED: " + this.mFragment);
        }
        this.mFragment.performPause();
        this.mDispatcher.dispatchOnFragmentPaused(this.mFragment, false);
    }

    void stop() {
        if (androidx.fragment.app.FragmentManager.isLoggingEnabled(3)) {
            android.util.Log.d(TAG, "movefrom STARTED: " + this.mFragment);
        }
        this.mFragment.performStop();
        this.mDispatcher.dispatchOnFragmentStopped(this.mFragment, false);
    }

    androidx.fragment.app.FragmentState saveState() {
        androidx.fragment.app.FragmentState fragmentState = new androidx.fragment.app.FragmentState(this.mFragment);
        if (this.mFragment.mState > -1 && fragmentState.mSavedFragmentState == null) {
            fragmentState.mSavedFragmentState = saveBasicState();
            if (this.mFragment.mTargetWho != null) {
                if (fragmentState.mSavedFragmentState == null) {
                    fragmentState.mSavedFragmentState = new android.os.Bundle();
                }
                fragmentState.mSavedFragmentState.putString(TARGET_STATE_TAG, this.mFragment.mTargetWho);
                if (this.mFragment.mTargetRequestCode != 0) {
                    fragmentState.mSavedFragmentState.putInt(TARGET_REQUEST_CODE_STATE_TAG, this.mFragment.mTargetRequestCode);
                }
            }
        } else {
            fragmentState.mSavedFragmentState = this.mFragment.mSavedFragmentState;
        }
        return fragmentState;
    }

    androidx.fragment.app.Fragment.SavedState saveInstanceState() {
        android.os.Bundle bundleSaveBasicState;
        if (this.mFragment.mState <= -1 || (bundleSaveBasicState = saveBasicState()) == null) {
            return null;
        }
        return new androidx.fragment.app.Fragment.SavedState(bundleSaveBasicState);
    }

    private android.os.Bundle saveBasicState() {
        android.os.Bundle bundle = new android.os.Bundle();
        this.mFragment.performSaveInstanceState(bundle);
        this.mDispatcher.dispatchOnFragmentSaveInstanceState(this.mFragment, bundle, false);
        if (bundle.isEmpty()) {
            bundle = null;
        }
        if (this.mFragment.mView != null) {
            saveViewState();
        }
        if (this.mFragment.mSavedViewState != null) {
            if (bundle == null) {
                bundle = new android.os.Bundle();
            }
            bundle.putSparseParcelableArray(VIEW_STATE_TAG, this.mFragment.mSavedViewState);
        }
        if (this.mFragment.mSavedViewRegistryState != null) {
            if (bundle == null) {
                bundle = new android.os.Bundle();
            }
            bundle.putBundle(VIEW_REGISTRY_STATE_TAG, this.mFragment.mSavedViewRegistryState);
        }
        if (!this.mFragment.mUserVisibleHint) {
            if (bundle == null) {
                bundle = new android.os.Bundle();
            }
            bundle.putBoolean(USER_VISIBLE_HINT_TAG, this.mFragment.mUserVisibleHint);
        }
        return bundle;
    }

    void saveViewState() {
        if (this.mFragment.mView == null) {
            return;
        }
        android.util.SparseArray<android.os.Parcelable> sparseArray = new android.util.SparseArray<>();
        this.mFragment.mView.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            this.mFragment.mSavedViewState = sparseArray;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        this.mFragment.mViewLifecycleOwner.performSave(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        this.mFragment.mSavedViewRegistryState = bundle;
    }

    void destroyFragmentView() {
        if (androidx.fragment.app.FragmentManager.isLoggingEnabled(3)) {
            android.util.Log.d(TAG, "movefrom CREATE_VIEW: " + this.mFragment);
        }
        if (this.mFragment.mContainer != null && this.mFragment.mView != null) {
            this.mFragment.mContainer.removeView(this.mFragment.mView);
        }
        this.mFragment.performDestroyView();
        this.mDispatcher.dispatchOnFragmentViewDestroyed(this.mFragment, false);
        this.mFragment.mContainer = null;
        this.mFragment.mView = null;
        this.mFragment.mViewLifecycleOwner = null;
        this.mFragment.mViewLifecycleOwnerLiveData.setValue(null);
        this.mFragment.mInLayout = false;
    }

    void destroy() {
        androidx.fragment.app.Fragment fragmentFindActiveFragment;
        if (androidx.fragment.app.FragmentManager.isLoggingEnabled(3)) {
            android.util.Log.d(TAG, "movefrom CREATED: " + this.mFragment);
        }
        boolean zIsChangingConfigurations = true;
        boolean z = this.mFragment.mRemoving && !this.mFragment.isInBackStack();
        if (z || this.mFragmentStore.getNonConfig().shouldDestroy(this.mFragment)) {
            androidx.fragment.app.FragmentHostCallback<?> fragmentHostCallback = this.mFragment.mHost;
            if (fragmentHostCallback instanceof androidx.lifecycle.ViewModelStoreOwner) {
                zIsChangingConfigurations = this.mFragmentStore.getNonConfig().isCleared();
            } else if (fragmentHostCallback.getContext() instanceof android.app.Activity) {
                zIsChangingConfigurations = true ^ ((android.app.Activity) fragmentHostCallback.getContext()).isChangingConfigurations();
            }
            if (z || zIsChangingConfigurations) {
                this.mFragmentStore.getNonConfig().clearNonConfigState(this.mFragment);
            }
            this.mFragment.performDestroy();
            this.mDispatcher.dispatchOnFragmentDestroyed(this.mFragment, false);
            for (androidx.fragment.app.FragmentStateManager fragmentStateManager : this.mFragmentStore.getActiveFragmentStateManagers()) {
                if (fragmentStateManager != null) {
                    androidx.fragment.app.Fragment fragment = fragmentStateManager.getFragment();
                    if (this.mFragment.mWho.equals(fragment.mTargetWho)) {
                        fragment.mTarget = this.mFragment;
                        fragment.mTargetWho = null;
                    }
                }
            }
            if (this.mFragment.mTargetWho != null) {
                androidx.fragment.app.Fragment fragment2 = this.mFragment;
                fragment2.mTarget = this.mFragmentStore.findActiveFragment(fragment2.mTargetWho);
            }
            this.mFragmentStore.makeInactive(this);
            return;
        }
        if (this.mFragment.mTargetWho != null && (fragmentFindActiveFragment = this.mFragmentStore.findActiveFragment(this.mFragment.mTargetWho)) != null && fragmentFindActiveFragment.mRetainInstance) {
            this.mFragment.mTarget = fragmentFindActiveFragment;
        }
        this.mFragment.mState = 0;
    }

    void detach() {
        if (androidx.fragment.app.FragmentManager.isLoggingEnabled(3)) {
            android.util.Log.d(TAG, "movefrom ATTACHED: " + this.mFragment);
        }
        this.mFragment.performDetach();
        boolean z = false;
        this.mDispatcher.dispatchOnFragmentDetached(this.mFragment, false);
        this.mFragment.mState = -1;
        this.mFragment.mHost = null;
        this.mFragment.mParentFragment = null;
        this.mFragment.mFragmentManager = null;
        if (this.mFragment.mRemoving && !this.mFragment.isInBackStack()) {
            z = true;
        }
        if (z || this.mFragmentStore.getNonConfig().shouldDestroy(this.mFragment)) {
            if (androidx.fragment.app.FragmentManager.isLoggingEnabled(3)) {
                android.util.Log.d(TAG, "initState called for fragment: " + this.mFragment);
            }
            this.mFragment.initState();
        }
    }

    void addViewToContainer() {
        this.mFragment.mContainer.addView(this.mFragment.mView, this.mFragmentStore.findFragmentIndexInContainer(this.mFragment));
    }
}
