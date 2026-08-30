package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbqk implements com.google.android.gms.ads.mediation.NativeMediationAdRequest {
    private final java.util.Date zza;
    private final int zzb;
    private final java.util.Set zzc;
    private final boolean zzd;
    private final android.location.Location zze;
    private final int zzf;
    private final com.google.android.gms.internal.ads.zzbfl zzg;
    private final boolean zzi;
    private final java.util.List zzh = new java.util.ArrayList();
    private final java.util.Map zzj = new java.util.HashMap();

    public zzbqk(java.util.Date date, int i, java.util.Set set, android.location.Location location, boolean z, int i2, com.google.android.gms.internal.ads.zzbfl zzbflVar, java.util.List list, boolean z2, int i3, java.lang.String str) {
        this.zza = date;
        this.zzb = i;
        this.zzc = set;
        this.zze = location;
        this.zzd = z;
        this.zzf = i2;
        this.zzg = zzbflVar;
        this.zzi = z2;
        if (list != null) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                java.lang.String str2 = (java.lang.String) it.next();
                if (str2.startsWith("custom:")) {
                    java.lang.String[] strArrSplit = str2.split(":", 3);
                    if (strArrSplit.length == 3) {
                        if (com.json.mediationsdk.metadata.a.g.equals(strArrSplit[2])) {
                            this.zzj.put(strArrSplit[1], true);
                        } else if ("false".equals(strArrSplit[2])) {
                            this.zzj.put(strArrSplit[1], false);
                        }
                    }
                } else {
                    this.zzh.add(str2);
                }
            }
        }
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final float getAdVolume() {
        return com.google.android.gms.ads.internal.client.zzex.zzf().zza();
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    @java.lang.Deprecated
    public final java.util.Date getBirthday() {
        return this.zza;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    @java.lang.Deprecated
    public final int getGender() {
        return this.zzb;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final java.util.Set<java.lang.String> getKeywords() {
        return this.zzc;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final android.location.Location getLocation() {
        return this.zze;
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final com.google.android.gms.ads.formats.NativeAdOptions getNativeAdOptions() {
        com.google.android.gms.ads.formats.NativeAdOptions.Builder builder = new com.google.android.gms.ads.formats.NativeAdOptions.Builder();
        com.google.android.gms.internal.ads.zzbfl zzbflVar = this.zzg;
        if (zzbflVar == null) {
            return builder.build();
        }
        int i = zzbflVar.zza;
        if (i == 2) {
            builder.setAdChoicesPlacement(zzbflVar.zze);
        } else {
            if (i != 3) {
                if (i == 4) {
                    builder.setRequestCustomMuteThisAd(zzbflVar.zzg);
                    builder.setMediaAspectRatio(zzbflVar.zzh);
                }
            }
            com.google.android.gms.ads.internal.client.zzga zzgaVar = zzbflVar.zzf;
            if (zzgaVar != null) {
                builder.setVideoOptions(new com.google.android.gms.ads.VideoOptions(zzgaVar));
            }
            builder.setAdChoicesPlacement(zzbflVar.zze);
        }
        builder.setReturnUrlsForImageAssets(zzbflVar.zzb);
        builder.setImageOrientation(zzbflVar.zzc);
        builder.setRequestMultipleImages(zzbflVar.zzd);
        return builder.build();
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final com.google.android.gms.ads.nativead.NativeAdOptions getNativeAdRequestOptions() {
        return com.google.android.gms.internal.ads.zzbfl.zza(this.zzg);
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final boolean isAdMuted() {
        return com.google.android.gms.ads.internal.client.zzex.zzf().zzy();
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    @java.lang.Deprecated
    public final boolean isDesignedForFamilies() {
        return this.zzi;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final boolean isTesting() {
        return this.zzd;
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final boolean isUnifiedNativeAdRequested() {
        return this.zzh.contains("6");
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final int taggedForChildDirectedTreatment() {
        return this.zzf;
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final java.util.Map zza() {
        return this.zzj;
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final boolean zzb() {
        return this.zzh.contains(androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_3D);
    }
}
