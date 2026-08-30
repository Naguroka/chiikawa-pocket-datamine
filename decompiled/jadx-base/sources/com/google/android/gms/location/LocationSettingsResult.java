package com.google.android.gms.location;

/* JADX INFO: compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class LocationSettingsResult extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.api.Result {
    public static final android.os.Parcelable.Creator<com.google.android.gms.location.LocationSettingsResult> CREATOR = new com.google.android.gms.location.zzbm();
    private final com.google.android.gms.common.api.Status zza;
    private final com.google.android.gms.location.LocationSettingsStates zzb;

    public LocationSettingsResult(com.google.android.gms.common.api.Status status, com.google.android.gms.location.LocationSettingsStates locationSettingsStates) {
        this.zza = status;
        this.zzb = locationSettingsStates;
    }

    public com.google.android.gms.location.LocationSettingsStates getLocationSettingsStates() {
        return this.zzb;
    }

    @Override // com.google.android.gms.common.api.Result
    public com.google.android.gms.common.api.Status getStatus() {
        return this.zza;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 1, getStatus(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 2, getLocationSettingsStates(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
