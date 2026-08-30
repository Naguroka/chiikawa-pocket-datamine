package com.google.android.gms.ads.formats;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class AdManagerAdViewOptions extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.ads.formats.AdManagerAdViewOptions> CREATOR = new com.google.android.gms.ads.formats.zzc();
    private final boolean zza;
    private final android.os.IBinder zzb;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
    public static final class Builder {
        private boolean zza = false;

        public com.google.android.gms.ads.formats.AdManagerAdViewOptions build() {
            return new com.google.android.gms.ads.formats.AdManagerAdViewOptions(this, (com.google.android.gms.ads.formats.zzb) null);
        }

        public com.google.android.gms.ads.formats.AdManagerAdViewOptions.Builder setManualImpressionsEnabled(boolean z) {
            this.zza = z;
            return this;
        }
    }

    /* synthetic */ AdManagerAdViewOptions(com.google.android.gms.ads.formats.AdManagerAdViewOptions.Builder builder, com.google.android.gms.ads.formats.zzb zzbVar) {
        this.zza = builder.zza;
        this.zzb = null;
    }

    public boolean getManualImpressionsEnabled() {
        return this.zza;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 1, getManualImpressionsEnabled());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(parcel, 2, this.zzb, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final com.google.android.gms.internal.ads.zzbhn zza() {
        android.os.IBinder iBinder = this.zzb;
        if (iBinder == null) {
            return null;
        }
        return com.google.android.gms.internal.ads.zzbhm.zzb(iBinder);
    }

    AdManagerAdViewOptions(boolean z, android.os.IBinder iBinder) {
        this.zza = z;
        this.zzb = iBinder;
    }
}
