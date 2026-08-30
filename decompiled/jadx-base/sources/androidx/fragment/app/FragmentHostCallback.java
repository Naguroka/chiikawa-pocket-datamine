package androidx.fragment.app;

/* JADX INFO: loaded from: classes.dex */
public abstract class FragmentHostCallback<E> extends androidx.fragment.app.FragmentContainer {
    private final android.app.Activity mActivity;
    private final android.content.Context mContext;
    final androidx.fragment.app.FragmentManager mFragmentManager;
    private final android.os.Handler mHandler;
    private final int mWindowAnimations;

    public void onDump(java.lang.String str, java.io.FileDescriptor fileDescriptor, java.io.PrintWriter printWriter, java.lang.String[] strArr) {
    }

    @Override // androidx.fragment.app.FragmentContainer
    public android.view.View onFindViewById(int i) {
        return null;
    }

    public abstract E onGetHost();

    @Override // androidx.fragment.app.FragmentContainer
    public boolean onHasView() {
        return true;
    }

    public boolean onHasWindowAnimations() {
        return true;
    }

    @java.lang.Deprecated
    public void onRequestPermissionsFromFragment(androidx.fragment.app.Fragment fragment, java.lang.String[] strArr, int i) {
    }

    public boolean onShouldSaveFragmentState(androidx.fragment.app.Fragment fragment) {
        return true;
    }

    public boolean onShouldShowRequestPermissionRationale(java.lang.String str) {
        return false;
    }

    public void onSupportInvalidateOptionsMenu() {
    }

    public FragmentHostCallback(android.content.Context context, android.os.Handler handler, int i) {
        this(context instanceof android.app.Activity ? (android.app.Activity) context : null, context, handler, i);
    }

    FragmentHostCallback(androidx.fragment.app.FragmentActivity fragmentActivity) {
        this(fragmentActivity, fragmentActivity, new android.os.Handler(), 0);
    }

    FragmentHostCallback(android.app.Activity activity, android.content.Context context, android.os.Handler handler, int i) {
        this.mFragmentManager = new androidx.fragment.app.FragmentManagerImpl();
        this.mActivity = activity;
        this.mContext = (android.content.Context) androidx.core.util.Preconditions.checkNotNull(context, "context == null");
        this.mHandler = (android.os.Handler) androidx.core.util.Preconditions.checkNotNull(handler, "handler == null");
        this.mWindowAnimations = i;
    }

    public android.view.LayoutInflater onGetLayoutInflater() {
        return android.view.LayoutInflater.from(this.mContext);
    }

    public void onStartActivityFromFragment(androidx.fragment.app.Fragment fragment, android.content.Intent intent, int i) {
        onStartActivityFromFragment(fragment, intent, i, null);
    }

    public void onStartActivityFromFragment(androidx.fragment.app.Fragment fragment, android.content.Intent intent, int i, android.os.Bundle bundle) {
        if (i != -1) {
            throw new java.lang.IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
        androidx.core.content.ContextCompat.startActivity(this.mContext, intent, bundle);
    }

    @java.lang.Deprecated
    public void onStartIntentSenderFromFragment(androidx.fragment.app.Fragment fragment, android.content.IntentSender intentSender, int i, android.content.Intent intent, int i2, int i3, int i4, android.os.Bundle bundle) throws android.content.IntentSender.SendIntentException {
        if (i != -1) {
            throw new java.lang.IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
        }
        androidx.core.app.ActivityCompat.startIntentSenderForResult(this.mActivity, intentSender, i, intent, i2, i3, i4, bundle);
    }

    public int onGetWindowAnimations() {
        return this.mWindowAnimations;
    }

    android.app.Activity getActivity() {
        return this.mActivity;
    }

    android.content.Context getContext() {
        return this.mContext;
    }

    android.os.Handler getHandler() {
        return this.mHandler;
    }
}
