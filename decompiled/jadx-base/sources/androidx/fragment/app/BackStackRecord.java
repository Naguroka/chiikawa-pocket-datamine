package androidx.fragment.app;

/* JADX INFO: loaded from: classes.dex */
final class BackStackRecord extends androidx.fragment.app.FragmentTransaction implements androidx.fragment.app.FragmentManager.BackStackEntry, androidx.fragment.app.FragmentManager.OpGenerator {
    private static final java.lang.String TAG = "FragmentManager";
    boolean mCommitted;
    int mIndex;
    final androidx.fragment.app.FragmentManager mManager;

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)));
        if (this.mIndex >= 0) {
            sb.append(" #");
            sb.append(this.mIndex);
        }
        if (this.mName != null) {
            sb.append(" ");
            sb.append(this.mName);
        }
        sb.append("}");
        return sb.toString();
    }

    public void dump(java.lang.String str, java.io.PrintWriter printWriter) {
        dump(str, printWriter, true);
    }

    public void dump(java.lang.String str, java.io.PrintWriter printWriter, boolean z) {
        java.lang.String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.mName);
            printWriter.print(" mIndex=");
            printWriter.print(this.mIndex);
            printWriter.print(" mCommitted=");
            printWriter.println(this.mCommitted);
            if (this.mTransition != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(java.lang.Integer.toHexString(this.mTransition));
            }
            if (this.mEnterAnim != 0 || this.mExitAnim != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(java.lang.Integer.toHexString(this.mEnterAnim));
                printWriter.print(" mExitAnim=#");
                printWriter.println(java.lang.Integer.toHexString(this.mExitAnim));
            }
            if (this.mPopEnterAnim != 0 || this.mPopExitAnim != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(java.lang.Integer.toHexString(this.mPopEnterAnim));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(java.lang.Integer.toHexString(this.mPopExitAnim));
            }
            if (this.mBreadCrumbTitleRes != 0 || this.mBreadCrumbTitleText != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(java.lang.Integer.toHexString(this.mBreadCrumbTitleRes));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.mBreadCrumbTitleText);
            }
            if (this.mBreadCrumbShortTitleRes != 0 || this.mBreadCrumbShortTitleText != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(java.lang.Integer.toHexString(this.mBreadCrumbShortTitleRes));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.mBreadCrumbShortTitleText);
            }
        }
        if (this.mOps.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = this.mOps.size();
        for (int i = 0; i < size; i++) {
            androidx.fragment.app.FragmentTransaction.Op op = this.mOps.get(i);
            switch (op.mCmd) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + op.mCmd;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(op.mFragment);
            if (z) {
                if (op.mEnterAnim != 0 || op.mExitAnim != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(java.lang.Integer.toHexString(op.mEnterAnim));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(java.lang.Integer.toHexString(op.mExitAnim));
                }
                if (op.mPopEnterAnim != 0 || op.mPopExitAnim != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(java.lang.Integer.toHexString(op.mPopEnterAnim));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(java.lang.Integer.toHexString(op.mPopExitAnim));
                }
            }
        }
    }

    BackStackRecord(androidx.fragment.app.FragmentManager fragmentManager) {
        super(fragmentManager.getFragmentFactory(), fragmentManager.getHost() != null ? fragmentManager.getHost().getContext().getClassLoader() : null);
        this.mIndex = -1;
        this.mManager = fragmentManager;
    }

    @Override // androidx.fragment.app.FragmentManager.BackStackEntry
    public int getId() {
        return this.mIndex;
    }

    @Override // androidx.fragment.app.FragmentManager.BackStackEntry
    public int getBreadCrumbTitleRes() {
        return this.mBreadCrumbTitleRes;
    }

    @Override // androidx.fragment.app.FragmentManager.BackStackEntry
    public int getBreadCrumbShortTitleRes() {
        return this.mBreadCrumbShortTitleRes;
    }

    @Override // androidx.fragment.app.FragmentManager.BackStackEntry
    public java.lang.CharSequence getBreadCrumbTitle() {
        if (this.mBreadCrumbTitleRes != 0) {
            return this.mManager.getHost().getContext().getText(this.mBreadCrumbTitleRes);
        }
        return this.mBreadCrumbTitleText;
    }

    @Override // androidx.fragment.app.FragmentManager.BackStackEntry
    public java.lang.CharSequence getBreadCrumbShortTitle() {
        if (this.mBreadCrumbShortTitleRes != 0) {
            return this.mManager.getHost().getContext().getText(this.mBreadCrumbShortTitleRes);
        }
        return this.mBreadCrumbShortTitleText;
    }

    @Override // androidx.fragment.app.FragmentTransaction
    void doAddOp(int i, androidx.fragment.app.Fragment fragment, java.lang.String str, int i2) {
        super.doAddOp(i, fragment, str, i2);
        fragment.mFragmentManager = this.mManager;
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public androidx.fragment.app.FragmentTransaction remove(androidx.fragment.app.Fragment fragment) {
        if (fragment.mFragmentManager != null && fragment.mFragmentManager != this.mManager) {
            throw new java.lang.IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
        }
        return super.remove(fragment);
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public androidx.fragment.app.FragmentTransaction hide(androidx.fragment.app.Fragment fragment) {
        if (fragment.mFragmentManager != null && fragment.mFragmentManager != this.mManager) {
            throw new java.lang.IllegalStateException("Cannot hide Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
        }
        return super.hide(fragment);
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public androidx.fragment.app.FragmentTransaction show(androidx.fragment.app.Fragment fragment) {
        if (fragment.mFragmentManager != null && fragment.mFragmentManager != this.mManager) {
            throw new java.lang.IllegalStateException("Cannot show Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
        }
        return super.show(fragment);
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public androidx.fragment.app.FragmentTransaction detach(androidx.fragment.app.Fragment fragment) {
        if (fragment.mFragmentManager != null && fragment.mFragmentManager != this.mManager) {
            throw new java.lang.IllegalStateException("Cannot detach Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
        }
        return super.detach(fragment);
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public androidx.fragment.app.FragmentTransaction setPrimaryNavigationFragment(androidx.fragment.app.Fragment fragment) {
        if (fragment != null && fragment.mFragmentManager != null && fragment.mFragmentManager != this.mManager) {
            throw new java.lang.IllegalStateException("Cannot setPrimaryNavigation for Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
        }
        return super.setPrimaryNavigationFragment(fragment);
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public androidx.fragment.app.FragmentTransaction setMaxLifecycle(androidx.fragment.app.Fragment fragment, androidx.lifecycle.Lifecycle.State state) {
        if (fragment.mFragmentManager != this.mManager) {
            throw new java.lang.IllegalArgumentException("Cannot setMaxLifecycle for Fragment not attached to FragmentManager " + this.mManager);
        }
        if (state == androidx.lifecycle.Lifecycle.State.INITIALIZED && fragment.mState > -1) {
            throw new java.lang.IllegalArgumentException("Cannot set maximum Lifecycle to " + state + " after the Fragment has been created");
        }
        if (state == androidx.lifecycle.Lifecycle.State.DESTROYED) {
            throw new java.lang.IllegalArgumentException("Cannot set maximum Lifecycle to " + state + ". Use remove() to remove the fragment from the FragmentManager and trigger its destruction.");
        }
        return super.setMaxLifecycle(fragment, state);
    }

    void bumpBackStackNesting(int i) {
        if (this.mAddToBackStack) {
            if (androidx.fragment.app.FragmentManager.isLoggingEnabled(2)) {
                android.util.Log.v(TAG, "Bump nesting in " + this + " by " + i);
            }
            int size = this.mOps.size();
            for (int i2 = 0; i2 < size; i2++) {
                androidx.fragment.app.FragmentTransaction.Op op = this.mOps.get(i2);
                if (op.mFragment != null) {
                    op.mFragment.mBackStackNesting += i;
                    if (androidx.fragment.app.FragmentManager.isLoggingEnabled(2)) {
                        android.util.Log.v(TAG, "Bump nesting of " + op.mFragment + " to " + op.mFragment.mBackStackNesting);
                    }
                }
            }
        }
    }

    public void runOnCommitRunnables() {
        if (this.mCommitRunnables != null) {
            for (int i = 0; i < this.mCommitRunnables.size(); i++) {
                this.mCommitRunnables.get(i).run();
            }
            this.mCommitRunnables = null;
        }
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public int commit() {
        return commitInternal(false);
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public int commitAllowingStateLoss() {
        return commitInternal(true);
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public void commitNow() {
        disallowAddToBackStack();
        this.mManager.execSingleAction(this, false);
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public void commitNowAllowingStateLoss() {
        disallowAddToBackStack();
        this.mManager.execSingleAction(this, true);
    }

    int commitInternal(boolean z) {
        if (this.mCommitted) {
            throw new java.lang.IllegalStateException("commit already called");
        }
        if (androidx.fragment.app.FragmentManager.isLoggingEnabled(2)) {
            android.util.Log.v(TAG, "Commit: " + this);
            java.io.PrintWriter printWriter = new java.io.PrintWriter(new androidx.fragment.app.LogWriter(TAG));
            dump("  ", printWriter);
            printWriter.close();
        }
        this.mCommitted = true;
        if (this.mAddToBackStack) {
            this.mIndex = this.mManager.allocBackStackIndex();
        } else {
            this.mIndex = -1;
        }
        this.mManager.enqueueAction(this, z);
        return this.mIndex;
    }

    @Override // androidx.fragment.app.FragmentManager.OpGenerator
    public boolean generateOps(java.util.ArrayList<androidx.fragment.app.BackStackRecord> arrayList, java.util.ArrayList<java.lang.Boolean> arrayList2) {
        if (androidx.fragment.app.FragmentManager.isLoggingEnabled(2)) {
            android.util.Log.v(TAG, "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(false);
        if (!this.mAddToBackStack) {
            return true;
        }
        this.mManager.addBackStackState(this);
        return true;
    }

    boolean interactsWith(int i) {
        int size = this.mOps.size();
        for (int i2 = 0; i2 < size; i2++) {
            androidx.fragment.app.FragmentTransaction.Op op = this.mOps.get(i2);
            int i3 = op.mFragment != null ? op.mFragment.mContainerId : 0;
            if (i3 != 0 && i3 == i) {
                return true;
            }
        }
        return false;
    }

    boolean interactsWith(java.util.ArrayList<androidx.fragment.app.BackStackRecord> arrayList, int i, int i2) {
        if (i2 == i) {
            return false;
        }
        int size = this.mOps.size();
        int i3 = -1;
        for (int i4 = 0; i4 < size; i4++) {
            androidx.fragment.app.FragmentTransaction.Op op = this.mOps.get(i4);
            int i5 = op.mFragment != null ? op.mFragment.mContainerId : 0;
            if (i5 != 0 && i5 != i3) {
                for (int i6 = i; i6 < i2; i6++) {
                    androidx.fragment.app.BackStackRecord backStackRecord = arrayList.get(i6);
                    int size2 = backStackRecord.mOps.size();
                    for (int i7 = 0; i7 < size2; i7++) {
                        androidx.fragment.app.FragmentTransaction.Op op2 = backStackRecord.mOps.get(i7);
                        if ((op2.mFragment != null ? op2.mFragment.mContainerId : 0) == i5) {
                            return true;
                        }
                    }
                }
                i3 = i5;
            }
        }
        return false;
    }

    void executeOps() {
        int size = this.mOps.size();
        for (int i = 0; i < size; i++) {
            androidx.fragment.app.FragmentTransaction.Op op = this.mOps.get(i);
            androidx.fragment.app.Fragment fragment = op.mFragment;
            if (fragment != null) {
                fragment.setPopDirection(false);
                fragment.setNextTransition(this.mTransition);
                fragment.setSharedElementNames(this.mSharedElementSourceNames, this.mSharedElementTargetNames);
            }
            switch (op.mCmd) {
                case 1:
                    fragment.setAnimations(op.mEnterAnim, op.mExitAnim, op.mPopEnterAnim, op.mPopExitAnim);
                    this.mManager.setExitAnimationOrder(fragment, false);
                    this.mManager.addFragment(fragment);
                    break;
                case 2:
                default:
                    throw new java.lang.IllegalArgumentException("Unknown cmd: " + op.mCmd);
                case 3:
                    fragment.setAnimations(op.mEnterAnim, op.mExitAnim, op.mPopEnterAnim, op.mPopExitAnim);
                    this.mManager.removeFragment(fragment);
                    break;
                case 4:
                    fragment.setAnimations(op.mEnterAnim, op.mExitAnim, op.mPopEnterAnim, op.mPopExitAnim);
                    this.mManager.hideFragment(fragment);
                    break;
                case 5:
                    fragment.setAnimations(op.mEnterAnim, op.mExitAnim, op.mPopEnterAnim, op.mPopExitAnim);
                    this.mManager.setExitAnimationOrder(fragment, false);
                    this.mManager.showFragment(fragment);
                    break;
                case 6:
                    fragment.setAnimations(op.mEnterAnim, op.mExitAnim, op.mPopEnterAnim, op.mPopExitAnim);
                    this.mManager.detachFragment(fragment);
                    break;
                case 7:
                    fragment.setAnimations(op.mEnterAnim, op.mExitAnim, op.mPopEnterAnim, op.mPopExitAnim);
                    this.mManager.setExitAnimationOrder(fragment, false);
                    this.mManager.attachFragment(fragment);
                    break;
                case 8:
                    this.mManager.setPrimaryNavigationFragment(fragment);
                    break;
                case 9:
                    this.mManager.setPrimaryNavigationFragment(null);
                    break;
                case 10:
                    this.mManager.setMaxLifecycle(fragment, op.mCurrentMaxState);
                    break;
            }
            if (!this.mReorderingAllowed && op.mCmd != 1 && fragment != null && !androidx.fragment.app.FragmentManager.USE_STATE_MANAGER) {
                this.mManager.moveFragmentToExpectedState(fragment);
            }
        }
        if (this.mReorderingAllowed || androidx.fragment.app.FragmentManager.USE_STATE_MANAGER) {
            return;
        }
        androidx.fragment.app.FragmentManager fragmentManager = this.mManager;
        fragmentManager.moveToState(fragmentManager.mCurState, true);
    }

    void executePopOps(boolean z) {
        for (int size = this.mOps.size() - 1; size >= 0; size--) {
            androidx.fragment.app.FragmentTransaction.Op op = this.mOps.get(size);
            androidx.fragment.app.Fragment fragment = op.mFragment;
            if (fragment != null) {
                fragment.setPopDirection(true);
                fragment.setNextTransition(androidx.fragment.app.FragmentManager.reverseTransit(this.mTransition));
                fragment.setSharedElementNames(this.mSharedElementTargetNames, this.mSharedElementSourceNames);
            }
            switch (op.mCmd) {
                case 1:
                    fragment.setAnimations(op.mEnterAnim, op.mExitAnim, op.mPopEnterAnim, op.mPopExitAnim);
                    this.mManager.setExitAnimationOrder(fragment, true);
                    this.mManager.removeFragment(fragment);
                    break;
                case 2:
                default:
                    throw new java.lang.IllegalArgumentException("Unknown cmd: " + op.mCmd);
                case 3:
                    fragment.setAnimations(op.mEnterAnim, op.mExitAnim, op.mPopEnterAnim, op.mPopExitAnim);
                    this.mManager.addFragment(fragment);
                    break;
                case 4:
                    fragment.setAnimations(op.mEnterAnim, op.mExitAnim, op.mPopEnterAnim, op.mPopExitAnim);
                    this.mManager.showFragment(fragment);
                    break;
                case 5:
                    fragment.setAnimations(op.mEnterAnim, op.mExitAnim, op.mPopEnterAnim, op.mPopExitAnim);
                    this.mManager.setExitAnimationOrder(fragment, true);
                    this.mManager.hideFragment(fragment);
                    break;
                case 6:
                    fragment.setAnimations(op.mEnterAnim, op.mExitAnim, op.mPopEnterAnim, op.mPopExitAnim);
                    this.mManager.attachFragment(fragment);
                    break;
                case 7:
                    fragment.setAnimations(op.mEnterAnim, op.mExitAnim, op.mPopEnterAnim, op.mPopExitAnim);
                    this.mManager.setExitAnimationOrder(fragment, true);
                    this.mManager.detachFragment(fragment);
                    break;
                case 8:
                    this.mManager.setPrimaryNavigationFragment(null);
                    break;
                case 9:
                    this.mManager.setPrimaryNavigationFragment(fragment);
                    break;
                case 10:
                    this.mManager.setMaxLifecycle(fragment, op.mOldMaxState);
                    break;
            }
            if (!this.mReorderingAllowed && op.mCmd != 3 && fragment != null && !androidx.fragment.app.FragmentManager.USE_STATE_MANAGER) {
                this.mManager.moveFragmentToExpectedState(fragment);
            }
        }
        if (this.mReorderingAllowed || !z || androidx.fragment.app.FragmentManager.USE_STATE_MANAGER) {
            return;
        }
        androidx.fragment.app.FragmentManager fragmentManager = this.mManager;
        fragmentManager.moveToState(fragmentManager.mCurState, true);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00b4  */
    androidx.fragment.app.Fragment expandOps(java.util.ArrayList<androidx.fragment.app.Fragment> arrayList, androidx.fragment.app.Fragment fragment) {
        androidx.fragment.app.Fragment fragment2 = fragment;
        int i = 0;
        while (i < this.mOps.size()) {
            androidx.fragment.app.FragmentTransaction.Op op = this.mOps.get(i);
            int i2 = op.mCmd;
            if (i2 == 1) {
                arrayList.add(op.mFragment);
            } else if (i2 == 2) {
                androidx.fragment.app.Fragment fragment3 = op.mFragment;
                int i3 = fragment3.mContainerId;
                boolean z = false;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    androidx.fragment.app.Fragment fragment4 = arrayList.get(size);
                    if (fragment4.mContainerId == i3) {
                        if (fragment4 == fragment3) {
                            z = true;
                        } else {
                            if (fragment4 == fragment2) {
                                this.mOps.add(i, new androidx.fragment.app.FragmentTransaction.Op(9, fragment4));
                                i++;
                                fragment2 = null;
                            }
                            androidx.fragment.app.FragmentTransaction.Op op2 = new androidx.fragment.app.FragmentTransaction.Op(3, fragment4);
                            op2.mEnterAnim = op.mEnterAnim;
                            op2.mPopEnterAnim = op.mPopEnterAnim;
                            op2.mExitAnim = op.mExitAnim;
                            op2.mPopExitAnim = op.mPopExitAnim;
                            this.mOps.add(i, op2);
                            arrayList.remove(fragment4);
                            i++;
                        }
                    }
                }
                if (z) {
                    this.mOps.remove(i);
                    i--;
                } else {
                    op.mCmd = 1;
                    arrayList.add(fragment3);
                }
            } else if (i2 == 3 || i2 == 6) {
                arrayList.remove(op.mFragment);
                if (op.mFragment == fragment2) {
                    this.mOps.add(i, new androidx.fragment.app.FragmentTransaction.Op(9, op.mFragment));
                    i++;
                    fragment2 = null;
                }
            } else if (i2 == 7) {
                arrayList.add(op.mFragment);
            } else if (i2 == 8) {
                this.mOps.add(i, new androidx.fragment.app.FragmentTransaction.Op(9, fragment2));
                i++;
                fragment2 = op.mFragment;
            }
            i++;
        }
        return fragment2;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0027  */
    /* JADX WARN: Code duplicated, block: B:14:0x002d  */
    androidx.fragment.app.Fragment trackAddedFragmentsInPop(java.util.ArrayList<androidx.fragment.app.Fragment> arrayList, androidx.fragment.app.Fragment fragment) {
        for (int size = this.mOps.size() - 1; size >= 0; size--) {
            androidx.fragment.app.FragmentTransaction.Op op = this.mOps.get(size);
            int i = op.mCmd;
            if (i == 1) {
                arrayList.remove(op.mFragment);
            } else if (i != 3) {
                switch (i) {
                    case 6:
                        arrayList.add(op.mFragment);
                        break;
                    case 7:
                        arrayList.remove(op.mFragment);
                        break;
                    case 8:
                        fragment = null;
                        break;
                    case 9:
                        fragment = op.mFragment;
                        break;
                    case 10:
                        op.mCurrentMaxState = op.mOldMaxState;
                        break;
                }
            } else {
                arrayList.add(op.mFragment);
            }
        }
        return fragment;
    }

    boolean isPostponed() {
        for (int i = 0; i < this.mOps.size(); i++) {
            if (isFragmentPostponed(this.mOps.get(i))) {
                return true;
            }
        }
        return false;
    }

    void setOnStartPostponedListener(androidx.fragment.app.Fragment.OnStartEnterTransitionListener onStartEnterTransitionListener) {
        for (int i = 0; i < this.mOps.size(); i++) {
            androidx.fragment.app.FragmentTransaction.Op op = this.mOps.get(i);
            if (isFragmentPostponed(op)) {
                op.mFragment.setOnStartEnterTransitionListener(onStartEnterTransitionListener);
            }
        }
    }

    private static boolean isFragmentPostponed(androidx.fragment.app.FragmentTransaction.Op op) {
        androidx.fragment.app.Fragment fragment = op.mFragment;
        return (fragment == null || !fragment.mAdded || fragment.mView == null || fragment.mDetached || fragment.mHidden || !fragment.isPostponed()) ? false : true;
    }

    @Override // androidx.fragment.app.FragmentManager.BackStackEntry
    public java.lang.String getName() {
        return this.mName;
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public boolean isEmpty() {
        return this.mOps.isEmpty();
    }
}
