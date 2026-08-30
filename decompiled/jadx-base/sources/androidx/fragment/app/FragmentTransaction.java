package androidx.fragment.app;

/* JADX INFO: loaded from: classes.dex */
public abstract class FragmentTransaction {
    static final int OP_ADD = 1;
    static final int OP_ATTACH = 7;
    static final int OP_DETACH = 6;
    static final int OP_HIDE = 4;
    static final int OP_NULL = 0;
    static final int OP_REMOVE = 3;
    static final int OP_REPLACE = 2;
    static final int OP_SET_MAX_LIFECYCLE = 10;
    static final int OP_SET_PRIMARY_NAV = 8;
    static final int OP_SHOW = 5;
    static final int OP_UNSET_PRIMARY_NAV = 9;
    public static final int TRANSIT_ENTER_MASK = 4096;
    public static final int TRANSIT_EXIT_MASK = 8192;
    public static final int TRANSIT_FRAGMENT_CLOSE = 8194;
    public static final int TRANSIT_FRAGMENT_FADE = 4099;
    public static final int TRANSIT_FRAGMENT_OPEN = 4097;
    public static final int TRANSIT_NONE = 0;
    public static final int TRANSIT_UNSET = -1;
    boolean mAddToBackStack;
    boolean mAllowAddToBackStack;
    int mBreadCrumbShortTitleRes;
    java.lang.CharSequence mBreadCrumbShortTitleText;
    int mBreadCrumbTitleRes;
    java.lang.CharSequence mBreadCrumbTitleText;
    private final java.lang.ClassLoader mClassLoader;
    java.util.ArrayList<java.lang.Runnable> mCommitRunnables;
    int mEnterAnim;
    int mExitAnim;
    private final androidx.fragment.app.FragmentFactory mFragmentFactory;
    java.lang.String mName;
    java.util.ArrayList<androidx.fragment.app.FragmentTransaction.Op> mOps;
    int mPopEnterAnim;
    int mPopExitAnim;
    boolean mReorderingAllowed;
    java.util.ArrayList<java.lang.String> mSharedElementSourceNames;
    java.util.ArrayList<java.lang.String> mSharedElementTargetNames;
    int mTransition;

    public abstract int commit();

    public abstract int commitAllowingStateLoss();

    public abstract void commitNow();

    public abstract void commitNowAllowingStateLoss();

    @java.lang.Deprecated
    public androidx.fragment.app.FragmentTransaction setTransitionStyle(int i) {
        return this;
    }

    static final class Op {
        int mCmd;
        androidx.lifecycle.Lifecycle.State mCurrentMaxState;
        int mEnterAnim;
        int mExitAnim;
        androidx.fragment.app.Fragment mFragment;
        androidx.lifecycle.Lifecycle.State mOldMaxState;
        int mPopEnterAnim;
        int mPopExitAnim;

        Op() {
        }

        Op(int i, androidx.fragment.app.Fragment fragment) {
            this.mCmd = i;
            this.mFragment = fragment;
            this.mOldMaxState = androidx.lifecycle.Lifecycle.State.RESUMED;
            this.mCurrentMaxState = androidx.lifecycle.Lifecycle.State.RESUMED;
        }

        Op(int i, androidx.fragment.app.Fragment fragment, androidx.lifecycle.Lifecycle.State state) {
            this.mCmd = i;
            this.mFragment = fragment;
            this.mOldMaxState = fragment.mMaxState;
            this.mCurrentMaxState = state;
        }
    }

    @java.lang.Deprecated
    public FragmentTransaction() {
        this.mOps = new java.util.ArrayList<>();
        this.mAllowAddToBackStack = true;
        this.mReorderingAllowed = false;
        this.mFragmentFactory = null;
        this.mClassLoader = null;
    }

    FragmentTransaction(androidx.fragment.app.FragmentFactory fragmentFactory, java.lang.ClassLoader classLoader) {
        this.mOps = new java.util.ArrayList<>();
        this.mAllowAddToBackStack = true;
        this.mReorderingAllowed = false;
        this.mFragmentFactory = fragmentFactory;
        this.mClassLoader = classLoader;
    }

    void addOp(androidx.fragment.app.FragmentTransaction.Op op) {
        this.mOps.add(op);
        op.mEnterAnim = this.mEnterAnim;
        op.mExitAnim = this.mExitAnim;
        op.mPopEnterAnim = this.mPopEnterAnim;
        op.mPopExitAnim = this.mPopExitAnim;
    }

    private androidx.fragment.app.Fragment createFragment(java.lang.Class<? extends androidx.fragment.app.Fragment> cls, android.os.Bundle bundle) {
        androidx.fragment.app.FragmentFactory fragmentFactory = this.mFragmentFactory;
        if (fragmentFactory == null) {
            throw new java.lang.IllegalStateException("Creating a Fragment requires that this FragmentTransaction was built with FragmentManager.beginTransaction()");
        }
        java.lang.ClassLoader classLoader = this.mClassLoader;
        if (classLoader == null) {
            throw new java.lang.IllegalStateException("The FragmentManager must be attached to itshost to create a Fragment");
        }
        androidx.fragment.app.Fragment fragmentInstantiate = fragmentFactory.instantiate(classLoader, cls.getName());
        if (bundle != null) {
            fragmentInstantiate.setArguments(bundle);
        }
        return fragmentInstantiate;
    }

    public final androidx.fragment.app.FragmentTransaction add(java.lang.Class<? extends androidx.fragment.app.Fragment> cls, android.os.Bundle bundle, java.lang.String str) {
        return add(createFragment(cls, bundle), str);
    }

    public androidx.fragment.app.FragmentTransaction add(androidx.fragment.app.Fragment fragment, java.lang.String str) {
        doAddOp(0, fragment, str, 1);
        return this;
    }

    public final androidx.fragment.app.FragmentTransaction add(int i, java.lang.Class<? extends androidx.fragment.app.Fragment> cls, android.os.Bundle bundle) {
        return add(i, createFragment(cls, bundle));
    }

    public androidx.fragment.app.FragmentTransaction add(int i, androidx.fragment.app.Fragment fragment) {
        doAddOp(i, fragment, null, 1);
        return this;
    }

    public final androidx.fragment.app.FragmentTransaction add(int i, java.lang.Class<? extends androidx.fragment.app.Fragment> cls, android.os.Bundle bundle, java.lang.String str) {
        return add(i, createFragment(cls, bundle), str);
    }

    public androidx.fragment.app.FragmentTransaction add(int i, androidx.fragment.app.Fragment fragment, java.lang.String str) {
        doAddOp(i, fragment, str, 1);
        return this;
    }

    androidx.fragment.app.FragmentTransaction add(android.view.ViewGroup viewGroup, androidx.fragment.app.Fragment fragment, java.lang.String str) {
        fragment.mContainer = viewGroup;
        return add(viewGroup.getId(), fragment, str);
    }

    void doAddOp(int i, androidx.fragment.app.Fragment fragment, java.lang.String str, int i2) {
        java.lang.Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !java.lang.reflect.Modifier.isPublic(modifiers) || (cls.isMemberClass() && !java.lang.reflect.Modifier.isStatic(modifiers))) {
            throw new java.lang.IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            if (fragment.mTag != null && !str.equals(fragment.mTag)) {
                throw new java.lang.IllegalStateException("Can't change tag of fragment " + fragment + ": was " + fragment.mTag + " now " + str);
            }
            fragment.mTag = str;
        }
        if (i != 0) {
            if (i == -1) {
                throw new java.lang.IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
            }
            if (fragment.mFragmentId != 0 && fragment.mFragmentId != i) {
                throw new java.lang.IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.mFragmentId + " now " + i);
            }
            fragment.mFragmentId = i;
            fragment.mContainerId = i;
        }
        addOp(new androidx.fragment.app.FragmentTransaction.Op(i2, fragment));
    }

    public final androidx.fragment.app.FragmentTransaction replace(int i, java.lang.Class<? extends androidx.fragment.app.Fragment> cls, android.os.Bundle bundle) {
        return replace(i, cls, bundle, null);
    }

    public androidx.fragment.app.FragmentTransaction replace(int i, androidx.fragment.app.Fragment fragment) {
        return replace(i, fragment, (java.lang.String) null);
    }

    public final androidx.fragment.app.FragmentTransaction replace(int i, java.lang.Class<? extends androidx.fragment.app.Fragment> cls, android.os.Bundle bundle, java.lang.String str) {
        return replace(i, createFragment(cls, bundle), str);
    }

    public androidx.fragment.app.FragmentTransaction replace(int i, androidx.fragment.app.Fragment fragment, java.lang.String str) {
        if (i == 0) {
            throw new java.lang.IllegalArgumentException("Must use non-zero containerViewId");
        }
        doAddOp(i, fragment, str, 2);
        return this;
    }

    public androidx.fragment.app.FragmentTransaction remove(androidx.fragment.app.Fragment fragment) {
        addOp(new androidx.fragment.app.FragmentTransaction.Op(3, fragment));
        return this;
    }

    public androidx.fragment.app.FragmentTransaction hide(androidx.fragment.app.Fragment fragment) {
        addOp(new androidx.fragment.app.FragmentTransaction.Op(4, fragment));
        return this;
    }

    public androidx.fragment.app.FragmentTransaction show(androidx.fragment.app.Fragment fragment) {
        addOp(new androidx.fragment.app.FragmentTransaction.Op(5, fragment));
        return this;
    }

    public androidx.fragment.app.FragmentTransaction detach(androidx.fragment.app.Fragment fragment) {
        addOp(new androidx.fragment.app.FragmentTransaction.Op(6, fragment));
        return this;
    }

    public androidx.fragment.app.FragmentTransaction attach(androidx.fragment.app.Fragment fragment) {
        addOp(new androidx.fragment.app.FragmentTransaction.Op(7, fragment));
        return this;
    }

    public androidx.fragment.app.FragmentTransaction setPrimaryNavigationFragment(androidx.fragment.app.Fragment fragment) {
        addOp(new androidx.fragment.app.FragmentTransaction.Op(8, fragment));
        return this;
    }

    public androidx.fragment.app.FragmentTransaction setMaxLifecycle(androidx.fragment.app.Fragment fragment, androidx.lifecycle.Lifecycle.State state) {
        addOp(new androidx.fragment.app.FragmentTransaction.Op(10, fragment, state));
        return this;
    }

    public boolean isEmpty() {
        return this.mOps.isEmpty();
    }

    public androidx.fragment.app.FragmentTransaction setCustomAnimations(int i, int i2) {
        return setCustomAnimations(i, i2, 0, 0);
    }

    public androidx.fragment.app.FragmentTransaction setCustomAnimations(int i, int i2, int i3, int i4) {
        this.mEnterAnim = i;
        this.mExitAnim = i2;
        this.mPopEnterAnim = i3;
        this.mPopExitAnim = i4;
        return this;
    }

    public androidx.fragment.app.FragmentTransaction addSharedElement(android.view.View view, java.lang.String str) {
        if (androidx.fragment.app.FragmentTransition.supportsTransition()) {
            java.lang.String transitionName = androidx.core.view.ViewCompat.getTransitionName(view);
            if (transitionName == null) {
                throw new java.lang.IllegalArgumentException("Unique transitionNames are required for all sharedElements");
            }
            if (this.mSharedElementSourceNames == null) {
                this.mSharedElementSourceNames = new java.util.ArrayList<>();
                this.mSharedElementTargetNames = new java.util.ArrayList<>();
            } else {
                if (this.mSharedElementTargetNames.contains(str)) {
                    throw new java.lang.IllegalArgumentException("A shared element with the target name '" + str + "' has already been added to the transaction.");
                }
                if (this.mSharedElementSourceNames.contains(transitionName)) {
                    throw new java.lang.IllegalArgumentException("A shared element with the source name '" + transitionName + "' has already been added to the transaction.");
                }
            }
            this.mSharedElementSourceNames.add(transitionName);
            this.mSharedElementTargetNames.add(str);
        }
        return this;
    }

    public androidx.fragment.app.FragmentTransaction setTransition(int i) {
        this.mTransition = i;
        return this;
    }

    public androidx.fragment.app.FragmentTransaction addToBackStack(java.lang.String str) {
        if (!this.mAllowAddToBackStack) {
            throw new java.lang.IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
        }
        this.mAddToBackStack = true;
        this.mName = str;
        return this;
    }

    public boolean isAddToBackStackAllowed() {
        return this.mAllowAddToBackStack;
    }

    public androidx.fragment.app.FragmentTransaction disallowAddToBackStack() {
        if (this.mAddToBackStack) {
            throw new java.lang.IllegalStateException("This transaction is already being added to the back stack");
        }
        this.mAllowAddToBackStack = false;
        return this;
    }

    @java.lang.Deprecated
    public androidx.fragment.app.FragmentTransaction setBreadCrumbTitle(int i) {
        this.mBreadCrumbTitleRes = i;
        this.mBreadCrumbTitleText = null;
        return this;
    }

    @java.lang.Deprecated
    public androidx.fragment.app.FragmentTransaction setBreadCrumbTitle(java.lang.CharSequence charSequence) {
        this.mBreadCrumbTitleRes = 0;
        this.mBreadCrumbTitleText = charSequence;
        return this;
    }

    @java.lang.Deprecated
    public androidx.fragment.app.FragmentTransaction setBreadCrumbShortTitle(int i) {
        this.mBreadCrumbShortTitleRes = i;
        this.mBreadCrumbShortTitleText = null;
        return this;
    }

    @java.lang.Deprecated
    public androidx.fragment.app.FragmentTransaction setBreadCrumbShortTitle(java.lang.CharSequence charSequence) {
        this.mBreadCrumbShortTitleRes = 0;
        this.mBreadCrumbShortTitleText = charSequence;
        return this;
    }

    public androidx.fragment.app.FragmentTransaction setReorderingAllowed(boolean z) {
        this.mReorderingAllowed = z;
        return this;
    }

    @java.lang.Deprecated
    public androidx.fragment.app.FragmentTransaction setAllowOptimization(boolean z) {
        return setReorderingAllowed(z);
    }

    public androidx.fragment.app.FragmentTransaction runOnCommit(java.lang.Runnable runnable) {
        disallowAddToBackStack();
        if (this.mCommitRunnables == null) {
            this.mCommitRunnables = new java.util.ArrayList<>();
        }
        this.mCommitRunnables.add(runnable);
        return this;
    }
}
