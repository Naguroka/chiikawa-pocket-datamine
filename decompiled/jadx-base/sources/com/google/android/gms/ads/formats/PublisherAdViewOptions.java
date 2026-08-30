package com.google.android.gms.ads.formats;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
@java.lang.Deprecated
public final class PublisherAdViewOptions extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.ads.formats.PublisherAdViewOptions> CREATOR = new com.google.android.gms.ads.formats.zzh();
    private final boolean zza;
    private final com.google.android.gms.ads.internal.client.zzcm zzb;
    private final android.os.IBinder zzc;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
    @java.lang.Deprecated
    public static final class Builder {
        public com.google.android.gms.ads.formats.PublisherAdViewOptions.Builder setShouldDelayBannerRenderingListener(com.google.android.gms.ads.formats.ShouldDelayBannerRenderingListener shouldDelayBannerRenderingListener) {
            return this;
        }
    }

    PublisherAdViewOptions(boolean z, android.os.IBinder iBinder, android.os.IBinder iBinder2) {
        this.zza = z;
        this.zzb = iBinder != null ? com.google.android.gms.ads.internal.client.zzcl.zzd(iBinder) : null;
        this.zzc = iBinder2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 1, this.zza);
        com.google.android.gms.ads.internal.client.zzcm zzcmVar = this.zzb;
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(parcel, 2, zzcmVar == null ? null : zzcmVar.asBinder(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(parcel, 3, this.zzc, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final com.google.android.gms.ads.internal.client.zzcm zza() {
        return this.zzb;
    }

    public final com.google.android.gms.internal.ads.zzbhn zzb() {
        android.os.IBinder iBinder = this.zzc;
        if (iBinder == null) {
            return null;
        }
        return com.google.android.gms.internal.ads.zzbhm.zzb(iBinder);
    }

    public final boolean zzc() {
        return this.zza;
    }
}
