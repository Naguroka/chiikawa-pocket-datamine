package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbkv {
    private final android.content.Context zza;
    private final com.google.android.gms.ads.h5.OnH5AdsEventListener zzb;
    private com.google.android.gms.internal.ads.zzbkr zzc;

    public zzbkv(android.content.Context context, com.google.android.gms.ads.h5.OnH5AdsEventListener onH5AdsEventListener) {
        com.google.android.gms.common.internal.Preconditions.checkState(true, "Android version must be Lollipop or higher");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(context);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(onH5AdsEventListener);
        this.zza = context;
        this.zzb = onH5AdsEventListener;
        com.google.android.gms.internal.ads.zzbcl.zza(context);
    }

    public static final boolean zzc(java.lang.String str) {
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzjN)).booleanValue()) {
            return false;
        }
        com.google.android.gms.common.internal.Preconditions.checkNotNull(str);
        if (str.length() > ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzjP)).intValue()) {
            com.google.android.gms.ads.internal.util.client.zzo.zze("H5 GMSG exceeds max length");
            return false;
        }
        android.net.Uri uri = android.net.Uri.parse(str);
        return "gmsg".equals(uri.getScheme()) && "mobileads.google.com".equals(uri.getHost()) && "/h5ads".equals(uri.getPath());
    }

    private final void zzd() {
        if (this.zzc != null) {
            return;
        }
        this.zzc = com.google.android.gms.ads.internal.client.zzbc.zza().zzn(this.zza, new com.google.android.gms.internal.ads.zzbpa(), this.zzb);
    }

    public final void zza() {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzjN)).booleanValue()) {
            zzd();
            com.google.android.gms.internal.ads.zzbkr zzbkrVar = this.zzc;
            if (zzbkrVar != null) {
                try {
                    zzbkrVar.zze();
                } catch (android.os.RemoteException e) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
                }
            }
        }
    }

    public final boolean zzb(java.lang.String str) {
        if (!zzc(str)) {
            return false;
        }
        zzd();
        com.google.android.gms.internal.ads.zzbkr zzbkrVar = this.zzc;
        if (zzbkrVar == null) {
            return false;
        }
        try {
            zzbkrVar.zzf(str);
            return true;
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
            return true;
        }
    }
}
