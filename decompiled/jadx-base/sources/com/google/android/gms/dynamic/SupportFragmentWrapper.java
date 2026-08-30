package com.google.android.gms.dynamic;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class SupportFragmentWrapper extends com.google.android.gms.dynamic.IFragmentWrapper.Stub {
    private final androidx.fragment.app.Fragment zza;

    private SupportFragmentWrapper(androidx.fragment.app.Fragment fragment) {
        this.zza = fragment;
    }

    public static com.google.android.gms.dynamic.SupportFragmentWrapper wrap(androidx.fragment.app.Fragment fragment) {
        if (fragment != null) {
            return new com.google.android.gms.dynamic.SupportFragmentWrapper(fragment);
        }
        return null;
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean zzA() {
        return this.zza.isVisible();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final int zzb() {
        return this.zza.getId();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final int zzc() {
        return this.zza.getTargetRequestCode();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final android.os.Bundle zzd() {
        return this.zza.getArguments();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final com.google.android.gms.dynamic.IFragmentWrapper zze() {
        return wrap(this.zza.getParentFragment());
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final com.google.android.gms.dynamic.IFragmentWrapper zzf() {
        return wrap(this.zza.getTargetFragment());
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final com.google.android.gms.dynamic.IObjectWrapper zzg() {
        return com.google.android.gms.dynamic.ObjectWrapper.wrap(this.zza.getActivity());
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final com.google.android.gms.dynamic.IObjectWrapper zzh() {
        return com.google.android.gms.dynamic.ObjectWrapper.wrap(this.zza.getResources());
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final com.google.android.gms.dynamic.IObjectWrapper zzi() {
        return com.google.android.gms.dynamic.ObjectWrapper.wrap(this.zza.getView());
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final java.lang.String zzj() {
        return this.zza.getTag();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void zzk(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) {
        android.view.View view = (android.view.View) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(view);
        this.zza.registerForContextMenu(view);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void zzl(boolean z) {
        this.zza.setHasOptionsMenu(z);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void zzm(boolean z) {
        this.zza.setMenuVisibility(z);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void zzn(boolean z) {
        this.zza.setRetainInstance(z);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void zzo(boolean z) {
        this.zza.setUserVisibleHint(z);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void zzp(android.content.Intent intent) {
        this.zza.startActivity(intent);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void zzq(android.content.Intent intent, int i) {
        this.zza.startActivityForResult(intent, i);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void zzr(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) {
        android.view.View view = (android.view.View) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(view);
        this.zza.unregisterForContextMenu(view);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean zzs() {
        return this.zza.getRetainInstance();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean zzt() {
        return this.zza.getUserVisibleHint();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean zzu() {
        return this.zza.isAdded();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean zzv() {
        return this.zza.isDetached();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean zzw() {
        return this.zza.isHidden();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean zzx() {
        return this.zza.isInLayout();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean zzy() {
        return this.zza.isRemoving();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean zzz() {
        return this.zza.isResumed();
    }
}
