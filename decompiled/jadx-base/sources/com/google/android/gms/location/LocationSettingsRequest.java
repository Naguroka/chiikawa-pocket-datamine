package com.google.android.gms.location;

/* JADX INFO: compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class LocationSettingsRequest extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.location.LocationSettingsRequest> CREATOR = new com.google.android.gms.location.zzbl();
    private final java.util.List<com.google.android.gms.location.LocationRequest> zza;
    private final boolean zzb;
    private final boolean zzc;
    private com.google.android.gms.location.zzbj zzd;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-location@@18.0.0 */
    public static final class Builder {
        private final java.util.ArrayList<com.google.android.gms.location.LocationRequest> zza = new java.util.ArrayList<>();
        private boolean zzb = false;
        private boolean zzc = false;

        public com.google.android.gms.location.LocationSettingsRequest.Builder addAllLocationRequests(java.util.Collection<com.google.android.gms.location.LocationRequest> collection) {
            for (com.google.android.gms.location.LocationRequest locationRequest : collection) {
                if (locationRequest != null) {
                    this.zza.add(locationRequest);
                }
            }
            return this;
        }

        public com.google.android.gms.location.LocationSettingsRequest.Builder addLocationRequest(com.google.android.gms.location.LocationRequest locationRequest) {
            if (locationRequest != null) {
                this.zza.add(locationRequest);
            }
            return this;
        }

        public com.google.android.gms.location.LocationSettingsRequest build() {
            return new com.google.android.gms.location.LocationSettingsRequest(this.zza, this.zzb, this.zzc, null);
        }

        public com.google.android.gms.location.LocationSettingsRequest.Builder setAlwaysShow(boolean z) {
            this.zzb = z;
            return this;
        }

        public com.google.android.gms.location.LocationSettingsRequest.Builder setNeedBle(boolean z) {
            this.zzc = z;
            return this;
        }
    }

    LocationSettingsRequest(java.util.List<com.google.android.gms.location.LocationRequest> list, boolean z, boolean z2, com.google.android.gms.location.zzbj zzbjVar) {
        this.zza = list;
        this.zzb = z;
        this.zzc = z2;
        this.zzd = zzbjVar;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(parcel, 1, java.util.Collections.unmodifiableList(this.zza), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 2, this.zzb);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 3, this.zzc);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 5, this.zzd, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
