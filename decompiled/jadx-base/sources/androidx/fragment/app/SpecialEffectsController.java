package androidx.fragment.app;

/* JADX INFO: loaded from: classes.dex */
abstract class SpecialEffectsController {
    private final android.view.ViewGroup mContainer;
    final java.util.ArrayList<androidx.fragment.app.SpecialEffectsController.Operation> mPendingOperations = new java.util.ArrayList<>();
    final java.util.ArrayList<androidx.fragment.app.SpecialEffectsController.Operation> mRunningOperations = new java.util.ArrayList<>();
    boolean mOperationDirectionIsPop = false;
    boolean mIsContainerPostponed = false;

    abstract void executeOperations(java.util.List<androidx.fragment.app.SpecialEffectsController.Operation> list, boolean z);

    static androidx.fragment.app.SpecialEffectsController getOrCreateController(android.view.ViewGroup viewGroup, androidx.fragment.app.FragmentManager fragmentManager) {
        return getOrCreateController(viewGroup, fragmentManager.getSpecialEffectsControllerFactory());
    }

    static androidx.fragment.app.SpecialEffectsController getOrCreateController(android.view.ViewGroup viewGroup, androidx.fragment.app.SpecialEffectsControllerFactory specialEffectsControllerFactory) {
        java.lang.Object tag = viewGroup.getTag(androidx.fragment.R.id.special_effects_controller_view_tag);
        if (tag instanceof androidx.fragment.app.SpecialEffectsController) {
            return (androidx.fragment.app.SpecialEffectsController) tag;
        }
        androidx.fragment.app.SpecialEffectsController specialEffectsControllerCreateController = specialEffectsControllerFactory.createController(viewGroup);
        viewGroup.setTag(androidx.fragment.R.id.special_effects_controller_view_tag, specialEffectsControllerCreateController);
        return specialEffectsControllerCreateController;
    }

    SpecialEffectsController(android.view.ViewGroup viewGroup) {
        this.mContainer = viewGroup;
    }

    public android.view.ViewGroup getContainer() {
        return this.mContainer;
    }

    androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact getAwaitingCompletionLifecycleImpact(androidx.fragment.app.FragmentStateManager fragmentStateManager) {
        androidx.fragment.app.SpecialEffectsController.Operation operationFindPendingOperation = findPendingOperation(fragmentStateManager.getFragment());
        androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact lifecycleImpact = operationFindPendingOperation != null ? operationFindPendingOperation.getLifecycleImpact() : null;
        androidx.fragment.app.SpecialEffectsController.Operation operationFindRunningOperation = findRunningOperation(fragmentStateManager.getFragment());
        return (operationFindRunningOperation == null || !(lifecycleImpact == null || lifecycleImpact == androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.NONE)) ? lifecycleImpact : operationFindRunningOperation.getLifecycleImpact();
    }

    private androidx.fragment.app.SpecialEffectsController.Operation findPendingOperation(androidx.fragment.app.Fragment fragment) {
        for (androidx.fragment.app.SpecialEffectsController.Operation operation : this.mPendingOperations) {
            if (operation.getFragment().equals(fragment) && !operation.isCanceled()) {
                return operation;
            }
        }
        return null;
    }

    private androidx.fragment.app.SpecialEffectsController.Operation findRunningOperation(androidx.fragment.app.Fragment fragment) {
        for (androidx.fragment.app.SpecialEffectsController.Operation operation : this.mRunningOperations) {
            if (operation.getFragment().equals(fragment) && !operation.isCanceled()) {
                return operation;
            }
        }
        return null;
    }

    void enqueueAdd(androidx.fragment.app.SpecialEffectsController.Operation.State state, androidx.fragment.app.FragmentStateManager fragmentStateManager) {
        if (androidx.fragment.app.FragmentManager.isLoggingEnabled(2)) {
            android.util.Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + fragmentStateManager.getFragment());
        }
        enqueue(state, androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.ADDING, fragmentStateManager);
    }

    void enqueueShow(androidx.fragment.app.FragmentStateManager fragmentStateManager) {
        if (androidx.fragment.app.FragmentManager.isLoggingEnabled(2)) {
            android.util.Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + fragmentStateManager.getFragment());
        }
        enqueue(androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE, androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.NONE, fragmentStateManager);
    }

    void enqueueHide(androidx.fragment.app.FragmentStateManager fragmentStateManager) {
        if (androidx.fragment.app.FragmentManager.isLoggingEnabled(2)) {
            android.util.Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + fragmentStateManager.getFragment());
        }
        enqueue(androidx.fragment.app.SpecialEffectsController.Operation.State.GONE, androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.NONE, fragmentStateManager);
    }

    void enqueueRemove(androidx.fragment.app.FragmentStateManager fragmentStateManager) {
        if (androidx.fragment.app.FragmentManager.isLoggingEnabled(2)) {
            android.util.Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + fragmentStateManager.getFragment());
        }
        enqueue(androidx.fragment.app.SpecialEffectsController.Operation.State.REMOVED, androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.REMOVING, fragmentStateManager);
    }

    private void enqueue(androidx.fragment.app.SpecialEffectsController.Operation.State state, androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact lifecycleImpact, androidx.fragment.app.FragmentStateManager fragmentStateManager) {
        synchronized (this.mPendingOperations) {
            androidx.core.os.CancellationSignal cancellationSignal = new androidx.core.os.CancellationSignal();
            androidx.fragment.app.SpecialEffectsController.Operation operationFindPendingOperation = findPendingOperation(fragmentStateManager.getFragment());
            if (operationFindPendingOperation != null) {
                operationFindPendingOperation.mergeWith(state, lifecycleImpact);
                return;
            }
            final androidx.fragment.app.SpecialEffectsController.FragmentStateManagerOperation fragmentStateManagerOperation = new androidx.fragment.app.SpecialEffectsController.FragmentStateManagerOperation(state, lifecycleImpact, fragmentStateManager, cancellationSignal);
            this.mPendingOperations.add(fragmentStateManagerOperation);
            fragmentStateManagerOperation.addCompletionListener(new java.lang.Runnable() { // from class: androidx.fragment.app.SpecialEffectsController.1
                @Override // java.lang.Runnable
                public void run() {
                    if (androidx.fragment.app.SpecialEffectsController.this.mPendingOperations.contains(fragmentStateManagerOperation)) {
                        fragmentStateManagerOperation.getFinalState().applyState(fragmentStateManagerOperation.getFragment().mView);
                    }
                }
            });
            fragmentStateManagerOperation.addCompletionListener(new java.lang.Runnable() { // from class: androidx.fragment.app.SpecialEffectsController.2
                @Override // java.lang.Runnable
                public void run() {
                    androidx.fragment.app.SpecialEffectsController.this.mPendingOperations.remove(fragmentStateManagerOperation);
                    androidx.fragment.app.SpecialEffectsController.this.mRunningOperations.remove(fragmentStateManagerOperation);
                }
            });
        }
    }

    void updateOperationDirection(boolean z) {
        this.mOperationDirectionIsPop = z;
    }

    void markPostponedState() {
        synchronized (this.mPendingOperations) {
            updateFinalState();
            this.mIsContainerPostponed = false;
            for (int size = this.mPendingOperations.size() - 1; size >= 0; size--) {
                androidx.fragment.app.SpecialEffectsController.Operation operation = this.mPendingOperations.get(size);
                androidx.fragment.app.SpecialEffectsController.Operation.State stateFrom = androidx.fragment.app.SpecialEffectsController.Operation.State.from(operation.getFragment().mView);
                if (operation.getFinalState() == androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE && stateFrom != androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE) {
                    this.mIsContainerPostponed = operation.getFragment().isPostponed();
                    break;
                }
            }
        }
    }

    void forcePostponedExecutePendingOperations() {
        if (this.mIsContainerPostponed) {
            this.mIsContainerPostponed = false;
            executePendingOperations();
        }
    }

    void executePendingOperations() {
        if (this.mIsContainerPostponed) {
            return;
        }
        if (!androidx.core.view.ViewCompat.isAttachedToWindow(this.mContainer)) {
            forceCompleteAllOperations();
            this.mOperationDirectionIsPop = false;
            return;
        }
        synchronized (this.mPendingOperations) {
            if (!this.mPendingOperations.isEmpty()) {
                java.util.ArrayList<androidx.fragment.app.SpecialEffectsController.Operation> arrayList = new java.util.ArrayList(this.mRunningOperations);
                this.mRunningOperations.clear();
                for (androidx.fragment.app.SpecialEffectsController.Operation operation : arrayList) {
                    if (androidx.fragment.app.FragmentManager.isLoggingEnabled(2)) {
                        android.util.Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + operation);
                    }
                    operation.cancel();
                    if (!operation.isComplete()) {
                        this.mRunningOperations.add(operation);
                    }
                }
                updateFinalState();
                java.util.ArrayList arrayList2 = new java.util.ArrayList(this.mPendingOperations);
                this.mPendingOperations.clear();
                this.mRunningOperations.addAll(arrayList2);
                java.util.Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((androidx.fragment.app.SpecialEffectsController.Operation) it.next()).onStart();
                }
                executeOperations(arrayList2, this.mOperationDirectionIsPop);
                this.mOperationDirectionIsPop = false;
            }
        }
    }

    void forceCompleteAllOperations() {
        boolean zIsAttachedToWindow = androidx.core.view.ViewCompat.isAttachedToWindow(this.mContainer);
        synchronized (this.mPendingOperations) {
            updateFinalState();
            java.util.Iterator<androidx.fragment.app.SpecialEffectsController.Operation> it = this.mPendingOperations.iterator();
            while (it.hasNext()) {
                it.next().onStart();
            }
            for (androidx.fragment.app.SpecialEffectsController.Operation operation : new java.util.ArrayList(this.mRunningOperations)) {
                if (androidx.fragment.app.FragmentManager.isLoggingEnabled(2)) {
                    android.util.Log.v("FragmentManager", "SpecialEffectsController: " + (zIsAttachedToWindow ? "" : "Container " + this.mContainer + " is not attached to window. ") + "Cancelling running operation " + operation);
                }
                operation.cancel();
            }
            for (androidx.fragment.app.SpecialEffectsController.Operation operation2 : new java.util.ArrayList(this.mPendingOperations)) {
                if (androidx.fragment.app.FragmentManager.isLoggingEnabled(2)) {
                    android.util.Log.v("FragmentManager", "SpecialEffectsController: " + (zIsAttachedToWindow ? "" : "Container " + this.mContainer + " is not attached to window. ") + "Cancelling pending operation " + operation2);
                }
                operation2.cancel();
            }
        }
    }

    private void updateFinalState() {
        for (androidx.fragment.app.SpecialEffectsController.Operation operation : this.mPendingOperations) {
            if (operation.getLifecycleImpact() == androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.ADDING) {
                operation.mergeWith(androidx.fragment.app.SpecialEffectsController.Operation.State.from(operation.getFragment().requireView().getVisibility()), androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.NONE);
            }
        }
    }

    static class Operation {
        private androidx.fragment.app.SpecialEffectsController.Operation.State mFinalState;
        private final androidx.fragment.app.Fragment mFragment;
        private androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact mLifecycleImpact;
        private final java.util.List<java.lang.Runnable> mCompletionListeners = new java.util.ArrayList();
        private final java.util.HashSet<androidx.core.os.CancellationSignal> mSpecialEffectsSignals = new java.util.HashSet<>();
        private boolean mIsCanceled = false;
        private boolean mIsComplete = false;

        enum LifecycleImpact {
            NONE,
            ADDING,
            REMOVING
        }

        void onStart() {
        }

        enum State {
            REMOVED,
            VISIBLE,
            GONE,
            INVISIBLE;

            static androidx.fragment.app.SpecialEffectsController.Operation.State from(android.view.View view) {
                if (view.getAlpha() == 0.0f && view.getVisibility() == 0) {
                    return INVISIBLE;
                }
                return from(view.getVisibility());
            }

            static androidx.fragment.app.SpecialEffectsController.Operation.State from(int i) {
                if (i == 0) {
                    return VISIBLE;
                }
                if (i == 4) {
                    return INVISIBLE;
                }
                if (i == 8) {
                    return GONE;
                }
                throw new java.lang.IllegalArgumentException("Unknown visibility " + i);
            }

            void applyState(android.view.View view) {
                int i = androidx.fragment.app.SpecialEffectsController.AnonymousClass3.$SwitchMap$androidx$fragment$app$SpecialEffectsController$Operation$State[ordinal()];
                if (i == 1) {
                    android.view.ViewGroup viewGroup = (android.view.ViewGroup) view.getParent();
                    if (viewGroup != null) {
                        if (androidx.fragment.app.FragmentManager.isLoggingEnabled(2)) {
                            android.util.Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                        }
                        viewGroup.removeView(view);
                        return;
                    }
                    return;
                }
                if (i == 2) {
                    if (androidx.fragment.app.FragmentManager.isLoggingEnabled(2)) {
                        android.util.Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
                    }
                    view.setVisibility(0);
                } else if (i == 3) {
                    if (androidx.fragment.app.FragmentManager.isLoggingEnabled(2)) {
                        android.util.Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
                    }
                    view.setVisibility(8);
                } else {
                    if (i != 4) {
                        return;
                    }
                    if (androidx.fragment.app.FragmentManager.isLoggingEnabled(2)) {
                        android.util.Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
                    }
                    view.setVisibility(4);
                }
            }
        }

        Operation(androidx.fragment.app.SpecialEffectsController.Operation.State state, androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact lifecycleImpact, androidx.fragment.app.Fragment fragment, androidx.core.os.CancellationSignal cancellationSignal) {
            this.mFinalState = state;
            this.mLifecycleImpact = lifecycleImpact;
            this.mFragment = fragment;
            cancellationSignal.setOnCancelListener(new androidx.core.os.CancellationSignal.OnCancelListener() { // from class: androidx.fragment.app.SpecialEffectsController.Operation.1
                @Override // androidx.core.os.CancellationSignal.OnCancelListener
                public void onCancel() {
                    androidx.fragment.app.SpecialEffectsController.Operation.this.cancel();
                }
            });
        }

        public androidx.fragment.app.SpecialEffectsController.Operation.State getFinalState() {
            return this.mFinalState;
        }

        androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact getLifecycleImpact() {
            return this.mLifecycleImpact;
        }

        public final androidx.fragment.app.Fragment getFragment() {
            return this.mFragment;
        }

        final boolean isCanceled() {
            return this.mIsCanceled;
        }

        public java.lang.String toString() {
            return "Operation {" + java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)) + "} {mFinalState = " + this.mFinalState + "} {mLifecycleImpact = " + this.mLifecycleImpact + "} {mFragment = " + this.mFragment + "}";
        }

        final void cancel() {
            if (isCanceled()) {
                return;
            }
            this.mIsCanceled = true;
            if (this.mSpecialEffectsSignals.isEmpty()) {
                complete();
                return;
            }
            java.util.Iterator it = new java.util.ArrayList(this.mSpecialEffectsSignals).iterator();
            while (it.hasNext()) {
                ((androidx.core.os.CancellationSignal) it.next()).cancel();
            }
        }

        final void mergeWith(androidx.fragment.app.SpecialEffectsController.Operation.State state, androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact lifecycleImpact) {
            int i = androidx.fragment.app.SpecialEffectsController.AnonymousClass3.$SwitchMap$androidx$fragment$app$SpecialEffectsController$Operation$LifecycleImpact[lifecycleImpact.ordinal()];
            if (i == 1) {
                if (this.mFinalState == androidx.fragment.app.SpecialEffectsController.Operation.State.REMOVED) {
                    if (androidx.fragment.app.FragmentManager.isLoggingEnabled(2)) {
                        android.util.Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.mFragment + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + this.mLifecycleImpact + " to ADDING.");
                    }
                    this.mFinalState = androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE;
                    this.mLifecycleImpact = androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.ADDING;
                    return;
                }
                return;
            }
            if (i == 2) {
                if (androidx.fragment.app.FragmentManager.isLoggingEnabled(2)) {
                    android.util.Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.mFragment + " mFinalState = " + this.mFinalState + " -> REMOVED. mLifecycleImpact  = " + this.mLifecycleImpact + " to REMOVING.");
                }
                this.mFinalState = androidx.fragment.app.SpecialEffectsController.Operation.State.REMOVED;
                this.mLifecycleImpact = androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.REMOVING;
                return;
            }
            if (i == 3 && this.mFinalState != androidx.fragment.app.SpecialEffectsController.Operation.State.REMOVED) {
                if (androidx.fragment.app.FragmentManager.isLoggingEnabled(2)) {
                    android.util.Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.mFragment + " mFinalState = " + this.mFinalState + " -> " + state + ". ");
                }
                this.mFinalState = state;
            }
        }

        final void addCompletionListener(java.lang.Runnable runnable) {
            this.mCompletionListeners.add(runnable);
        }

        public final void markStartedSpecialEffect(androidx.core.os.CancellationSignal cancellationSignal) {
            onStart();
            this.mSpecialEffectsSignals.add(cancellationSignal);
        }

        public final void completeSpecialEffect(androidx.core.os.CancellationSignal cancellationSignal) {
            if (this.mSpecialEffectsSignals.remove(cancellationSignal) && this.mSpecialEffectsSignals.isEmpty()) {
                complete();
            }
        }

        final boolean isComplete() {
            return this.mIsComplete;
        }

        public void complete() {
            if (this.mIsComplete) {
                return;
            }
            if (androidx.fragment.app.FragmentManager.isLoggingEnabled(2)) {
                android.util.Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.mIsComplete = true;
            java.util.Iterator<java.lang.Runnable> it = this.mCompletionListeners.iterator();
            while (it.hasNext()) {
                it.next().run();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.SpecialEffectsController$3, reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] $SwitchMap$androidx$fragment$app$SpecialEffectsController$Operation$LifecycleImpact;
        static final /* synthetic */ int[] $SwitchMap$androidx$fragment$app$SpecialEffectsController$Operation$State;

        static {
            int[] iArr = new int[androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.values().length];
            $SwitchMap$androidx$fragment$app$SpecialEffectsController$Operation$LifecycleImpact = iArr;
            try {
                iArr[androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.ADDING.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$androidx$fragment$app$SpecialEffectsController$Operation$LifecycleImpact[androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.REMOVING.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$androidx$fragment$app$SpecialEffectsController$Operation$LifecycleImpact[androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.NONE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[androidx.fragment.app.SpecialEffectsController.Operation.State.values().length];
            $SwitchMap$androidx$fragment$app$SpecialEffectsController$Operation$State = iArr2;
            try {
                iArr2[androidx.fragment.app.SpecialEffectsController.Operation.State.REMOVED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$androidx$fragment$app$SpecialEffectsController$Operation$State[androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$androidx$fragment$app$SpecialEffectsController$Operation$State[androidx.fragment.app.SpecialEffectsController.Operation.State.GONE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$androidx$fragment$app$SpecialEffectsController$Operation$State[androidx.fragment.app.SpecialEffectsController.Operation.State.INVISIBLE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
        }
    }

    private static class FragmentStateManagerOperation extends androidx.fragment.app.SpecialEffectsController.Operation {
        private final androidx.fragment.app.FragmentStateManager mFragmentStateManager;

        FragmentStateManagerOperation(androidx.fragment.app.SpecialEffectsController.Operation.State state, androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact lifecycleImpact, androidx.fragment.app.FragmentStateManager fragmentStateManager, androidx.core.os.CancellationSignal cancellationSignal) {
            super(state, lifecycleImpact, fragmentStateManager.getFragment(), cancellationSignal);
            this.mFragmentStateManager = fragmentStateManager;
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Operation
        void onStart() {
            if (getLifecycleImpact() == androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.ADDING) {
                androidx.fragment.app.Fragment fragment = this.mFragmentStateManager.getFragment();
                android.view.View viewFindFocus = fragment.mView.findFocus();
                if (viewFindFocus != null) {
                    fragment.setFocusedView(viewFindFocus);
                    if (androidx.fragment.app.FragmentManager.isLoggingEnabled(2)) {
                        android.util.Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + fragment);
                    }
                }
                android.view.View viewRequireView = getFragment().requireView();
                if (viewRequireView.getParent() == null) {
                    this.mFragmentStateManager.addViewToContainer();
                    viewRequireView.setAlpha(0.0f);
                }
                if (viewRequireView.getAlpha() == 0.0f && viewRequireView.getVisibility() == 0) {
                    viewRequireView.setVisibility(4);
                }
                viewRequireView.setAlpha(fragment.getPostOnViewCreatedAlpha());
            }
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Operation
        public void complete() {
            super.complete();
            this.mFragmentStateManager.moveToExpectedState();
        }
    }
}
