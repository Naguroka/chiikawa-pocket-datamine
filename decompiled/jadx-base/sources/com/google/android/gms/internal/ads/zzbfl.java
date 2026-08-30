package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbfl extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.ads.zzbfl> CREATOR = new com.google.android.gms.internal.ads.zzbfm();
    public final int zza;
    public final boolean zzb;
    public final int zzc;
    public final boolean zzd;
    public final int zze;
    public final com.google.android.gms.ads.internal.client.zzga zzf;
    public final boolean zzg;
    public final int zzh;
    public final int zzi;
    public final boolean zzj;
    public final int zzk;

    public zzbfl(int i, boolean z, int i2, boolean z2, int i3, com.google.android.gms.ads.internal.client.zzga zzgaVar, boolean z3, int i4, int i5, boolean z4, int i6) {
        this.zza = i;
        this.zzb = z;
        this.zzc = i2;
        this.zzd = z2;
        this.zze = i3;
        this.zzf = zzgaVar;
        this.zzg = z3;
        this.zzh = i4;
        this.zzj = z4;
        this.zzi = i5;
        this.zzk = i6;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002e  */
    public static com.google.android.gms.ads.nativead.NativeAdOptions zza(com.google.android.gms.internal.ads.zzbfl zzbflVar) {
        com.google.android.gms.ads.nativead.NativeAdOptions.Builder builder = new com.google.android.gms.ads.nativead.NativeAdOptions.Builder();
        if (zzbflVar == null) {
            return builder.build();
        }
        int i = zzbflVar.zza;
        int i2 = 2;
        if (i == 2) {
            builder.setAdChoicesPlacement(zzbflVar.zze);
        } else {
            if (i != 3) {
                if (i == 4) {
                    builder.setRequestCustomMuteThisAd(zzbflVar.zzg);
                    builder.setMediaAspectRatio(zzbflVar.zzh);
                    builder.enableCustomClickGestureDirection(zzbflVar.zzi, zzbflVar.zzj);
                    int i3 = zzbflVar.zzk;
                    if (i3 == 0) {
                        i2 = 1;
                    } else if (i3 == 2) {
                        i2 = 3;
                    } else if (i3 != 1) {
                        i2 = 1;
                    }
                    builder.zzi(i2);
                }
            }
            com.google.android.gms.ads.internal.client.zzga zzgaVar = zzbflVar.zzf;
            if (zzgaVar != null) {
                builder.setVideoOptions(new com.google.android.gms.ads.VideoOptions(zzgaVar));
            }
            builder.setAdChoicesPlacement(zzbflVar.zze);
        }
        builder.setReturnUrlsForImageAssets(zzbflVar.zzb);
        builder.setRequestMultipleImages(zzbflVar.zzd);
        return builder.build();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int i2 = this.zza;
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, i2);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 2, this.zzb);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 3, this.zzc);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 4, this.zzd);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 5, this.zze);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 6, this.zzf, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 7, this.zzg);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 8, this.zzh);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 9, this.zzi);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 10, this.zzj);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 11, this.zzk);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @java.lang.Deprecated
    public zzbfl(com.google.android.gms.ads.formats.NativeAdOptions nativeAdOptions) {
        this(4, nativeAdOptions.shouldReturnUrlsForImageAssets(), nativeAdOptions.getImageOrientation(), nativeAdOptions.shouldRequestMultipleImages(), nativeAdOptions.getAdChoicesPlacement(), nativeAdOptions.getVideoOptions() != null ? new com.google.android.gms.ads.internal.client.zzga(nativeAdOptions.getVideoOptions()) : null, nativeAdOptions.zza(), nativeAdOptions.getMediaAspectRatio(), 0, false, 0);
    }
}
