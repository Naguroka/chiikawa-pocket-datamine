package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public class LifecycleCallback {
    protected final com.google.android.gms.common.api.internal.LifecycleFragment mLifecycleFragment;

    protected LifecycleCallback(com.google.android.gms.common.api.internal.LifecycleFragment lifecycleFragment) {
        this.mLifecycleFragment = lifecycleFragment;
    }

    public static com.google.android.gms.common.api.internal.LifecycleFragment getFragment(android.app.Activity activity) {
        return getFragment(new com.google.android.gms.common.api.internal.LifecycleActivity(activity));
    }

    public void dump(java.lang.String str, java.io.FileDescriptor fileDescriptor, java.io.PrintWriter printWriter, java.lang.String[] strArr) {
    }

    public android.app.Activity getActivity() {
        android.app.Activity lifecycleActivity = this.mLifecycleFragment.getLifecycleActivity();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(lifecycleActivity);
        return lifecycleActivity;
    }

    public void onActivityResult(int i, int i2, android.content.Intent intent) {
    }

    public void onCreate(android.os.Bundle bundle) {
    }

    public void onDestroy() {
    }

    public void onResume() {
    }

    public void onSaveInstanceState(android.os.Bundle bundle) {
    }

    public void onStart() {
    }

    public void onStop() {
    }

    public static com.google.android.gms.common.api.internal.LifecycleFragment getFragment(android.content.ContextWrapper contextWrapper) {
        throw new java.lang.UnsupportedOperationException();
    }

    protected static com.google.android.gms.common.api.internal.LifecycleFragment getFragment(com.google.android.gms.common.api.internal.LifecycleActivity lifecycleActivity) {
        if (lifecycleActivity.zzd()) {
            return com.google.android.gms.common.api.internal.zzd.zza(lifecycleActivity.zzb());
        }
        if (lifecycleActivity.zzc()) {
            return com.google.android.gms.common.api.internal.zza.zza(lifecycleActivity.zza());
        }
        throw new java.lang.IllegalArgumentException("Can't get fragment for unexpected activity.");
    }
}
