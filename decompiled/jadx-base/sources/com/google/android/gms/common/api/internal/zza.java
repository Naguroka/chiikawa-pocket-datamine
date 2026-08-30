package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zza extends android.app.Fragment implements com.google.android.gms.common.api.internal.LifecycleFragment {
    private static final java.util.WeakHashMap zza = new java.util.WeakHashMap();
    private final com.google.android.gms.common.api.internal.zzc zzb = new com.google.android.gms.common.api.internal.zzc();

    public static com.google.android.gms.common.api.internal.zza zza(android.app.Activity activity) {
        com.google.android.gms.common.api.internal.zza zzaVar;
        java.util.WeakHashMap weakHashMap = zza;
        java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) weakHashMap.get(activity);
        if (weakReference != null && (zzaVar = (com.google.android.gms.common.api.internal.zza) weakReference.get()) != null) {
            return zzaVar;
        }
        try {
            com.google.android.gms.common.api.internal.zza zzaVar2 = (com.google.android.gms.common.api.internal.zza) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
            if (zzaVar2 == null || zzaVar2.isRemoving()) {
                zzaVar2 = new com.google.android.gms.common.api.internal.zza();
                activity.getFragmentManager().beginTransaction().add(zzaVar2, "LifecycleFragmentImpl").commitAllowingStateLoss();
            }
            weakHashMap.put(activity, new java.lang.ref.WeakReference(zzaVar2));
            return zzaVar2;
        } catch (java.lang.ClassCastException e) {
            throw new java.lang.IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e);
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleFragment
    public final void addCallback(java.lang.String str, com.google.android.gms.common.api.internal.LifecycleCallback lifecycleCallback) {
        this.zzb.zzd(str, lifecycleCallback);
    }

    @Override // android.app.Fragment
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

    @Override // android.app.Fragment
    public final void onActivityResult(int i, int i2, android.content.Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.zzb.zzf(i, i2, intent);
    }

    @Override // android.app.Fragment
    public final void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.zzb.zzg(bundle);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.zzb.zzh();
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        this.zzb.zzi();
    }

    @Override // android.app.Fragment
    public final void onSaveInstanceState(android.os.Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.zzb.zzj(bundle);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        this.zzb.zzk();
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        this.zzb.zzl();
    }
}
