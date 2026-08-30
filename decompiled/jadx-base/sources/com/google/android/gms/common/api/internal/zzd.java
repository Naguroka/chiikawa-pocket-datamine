package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzd extends androidx.fragment.app.Fragment implements com.google.android.gms.common.api.internal.LifecycleFragment {
    private static final java.util.WeakHashMap zza = new java.util.WeakHashMap();
    private final com.google.android.gms.common.api.internal.zzc zzb = new com.google.android.gms.common.api.internal.zzc();

    public static com.google.android.gms.common.api.internal.zzd zza(androidx.fragment.app.FragmentActivity fragmentActivity) {
        com.google.android.gms.common.api.internal.zzd zzdVar;
        java.util.WeakHashMap weakHashMap = zza;
        java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) weakHashMap.get(fragmentActivity);
        if (weakReference != null && (zzdVar = (com.google.android.gms.common.api.internal.zzd) weakReference.get()) != null) {
            return zzdVar;
        }
        try {
            com.google.android.gms.common.api.internal.zzd zzdVar2 = (com.google.android.gms.common.api.internal.zzd) fragmentActivity.getSupportFragmentManager().findFragmentByTag("SLifecycleFragmentImpl");
            if (zzdVar2 == null || zzdVar2.isRemoving()) {
                zzdVar2 = new com.google.android.gms.common.api.internal.zzd();
                fragmentActivity.getSupportFragmentManager().beginTransaction().add(zzdVar2, "SLifecycleFragmentImpl").commitAllowingStateLoss();
            }
            weakHashMap.put(fragmentActivity, new java.lang.ref.WeakReference(zzdVar2));
            return zzdVar2;
        } catch (java.lang.ClassCastException e) {
            throw new java.lang.IllegalStateException("Fragment with tag SLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e);
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleFragment
    public final void addCallback(java.lang.String str, com.google.android.gms.common.api.internal.LifecycleCallback lifecycleCallback) {
        this.zzb.zzd(str, lifecycleCallback);
    }

    @Override // androidx.fragment.app.Fragment
    public final void dump(java.lang.String str, java.io.FileDescriptor fileDescriptor, java.io.PrintWriter printWriter, java.lang.String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        this.zzb.zze(str, fileDescriptor, printWriter, strArr);
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleFragment
    public final <T extends com.google.android.gms.common.api.internal.LifecycleCallback> T getCallbackOrNull(java.lang.String str, java.lang.Class<T> cls) {
        return (T) this.zzb.zzc(str, cls);
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleFragment
    public final android.app.Activity getLifecycleActivity() {
        return getActivity();
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleFragment
    public final boolean isCreated() {
        return this.zzb.zzm();
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleFragment
    public final boolean isStarted() {
        return this.zzb.zzn();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, android.content.Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.zzb.zzf(i, i2, intent);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.zzb.zzg(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.zzb.zzh();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        this.zzb.zzi();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(android.os.Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.zzb.zzj(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        this.zzb.zzk();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        this.zzb.zzl();
    }
}
