package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzenq implements com.google.android.gms.internal.ads.zzetq {

    @javax.annotation.Nullable
    private final java.lang.Integer zza;

    private zzenq(@javax.annotation.Nullable java.lang.Integer num) {
        this.zza = num;
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzenq zzc(com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel) {
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzjT)).booleanValue()) {
            return new com.google.android.gms.internal.ads.zzenq(null);
        }
        com.google.android.gms.ads.internal.zzv.zzq();
        int extensionVersion = 0;
        try {
            if (android.os.Build.VERSION.SDK_INT < 30 || android.os.ext.SdkExtensions.getExtensionVersion(30) <= 3) {
                if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzjW)).booleanValue()) {
                    if (versionInfoParcel.clientJarVersion >= ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzjV)).intValue() && android.os.Build.VERSION.SDK_INT >= 31 && android.os.ext.SdkExtensions.getExtensionVersion(31) >= 9) {
                        extensionVersion = android.os.ext.SdkExtensions.getExtensionVersion(31);
                    }
                }
            } else {
                extensionVersion = android.os.ext.SdkExtensions.getExtensionVersion(1000000);
            }
        } catch (java.lang.Exception e) {
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "AdUtil.getAdServicesExtensionVersion");
        }
        return new com.google.android.gms.internal.ads.zzenq(java.lang.Integer.valueOf(extensionVersion));
    }

    @Override // com.google.android.gms.internal.ads.zzetq
    public final /* synthetic */ void zza(java.lang.Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzetq
    public final /* bridge */ /* synthetic */ void zzb(java.lang.Object obj) {
        java.lang.Integer num = this.zza;
        com.google.android.gms.internal.ads.zzcuv zzcuvVar = (com.google.android.gms.internal.ads.zzcuv) obj;
        if (num != null) {
            zzcuvVar.zza.putInt("aos", num.intValue());
        }
    }
}
