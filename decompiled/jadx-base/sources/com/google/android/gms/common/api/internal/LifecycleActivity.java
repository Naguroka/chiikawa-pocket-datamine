package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public class LifecycleActivity {
    private final java.lang.Object zza;

    public LifecycleActivity(android.app.Activity activity) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(activity, "Activity must not be null");
        this.zza = activity;
    }

    public final android.app.Activity zza() {
        return (android.app.Activity) this.zza;
    }

    public final androidx.fragment.app.FragmentActivity zzb() {
        return (androidx.fragment.app.FragmentActivity) this.zza;
    }

    public final boolean zzc() {
        return this.zza instanceof android.app.Activity;
    }

    public final boolean zzd() {
        return this.zza instanceof androidx.fragment.app.FragmentActivity;
    }

    @java.lang.Deprecated
    public LifecycleActivity(android.content.ContextWrapper contextWrapper) {
        throw new java.lang.UnsupportedOperationException();
    }
}
