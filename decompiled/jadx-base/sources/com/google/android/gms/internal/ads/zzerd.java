package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzerd implements com.google.android.gms.internal.ads.zzetr {
    private final com.google.android.gms.internal.ads.zzgcs zza;
    private final android.view.ViewGroup zzb;
    private final android.content.Context zzc;
    private final java.util.Set zzd;

    public zzerd(com.google.android.gms.internal.ads.zzgcs zzgcsVar, android.view.ViewGroup viewGroup, android.content.Context context, java.util.Set set) {
        this.zza = zzgcsVar;
        this.zzd = set;
        this.zzb = viewGroup;
        this.zzc = context;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final int zza() {
        return 22;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final com.google.common.util.concurrent.ListenableFuture zzb() {
        return this.zza.zzb(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.zzerc
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return this.zza.zzc();
            }
        });
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzere zzc() throws java.lang.Exception {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzfM)).booleanValue() && this.zzb != null && this.zzd.contains("banner")) {
            return new com.google.android.gms.internal.ads.zzere(java.lang.Boolean.valueOf(this.zzb.isHardwareAccelerated()));
        }
        java.lang.Boolean boolValueOf = null;
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzfN)).booleanValue() && this.zzd.contains(com.json.mediationsdk.utils.IronSourceConstants.EVENTS_NATIVE)) {
            android.content.Context context = this.zzc;
            if (context instanceof android.app.Activity) {
                android.app.Activity activity = (android.app.Activity) context;
                android.view.Window window = activity.getWindow();
                boolean z = true;
                if (window == null || (window.getAttributes().flags & 16777216) == 0) {
                    try {
                        if ((activity.getPackageManager().getActivityInfo(activity.getComponentName(), 0).flags & 512) == 0) {
                            z = false;
                        }
                        boolValueOf = java.lang.Boolean.valueOf(z);
                    } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
                    }
                } else {
                    boolValueOf = true;
                }
                return new com.google.android.gms.internal.ads.zzere(boolValueOf);
            }
        }
        return new com.google.android.gms.internal.ads.zzere(null);
    }
}
