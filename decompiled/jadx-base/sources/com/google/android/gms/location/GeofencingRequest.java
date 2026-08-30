package com.google.android.gms.location;

/* JADX INFO: compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public class GeofencingRequest extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.location.GeofencingRequest> CREATOR = new com.google.android.gms.location.zzau();
    public static final int INITIAL_TRIGGER_DWELL = 4;
    public static final int INITIAL_TRIGGER_ENTER = 1;
    public static final int INITIAL_TRIGGER_EXIT = 2;
    private final java.util.List<com.google.android.gms.internal.location.zzbe> zza;
    private final int zzb;
    private final java.lang.String zzc;
    private final java.lang.String zzd;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-location@@18.0.0 */
    public static final class Builder {
        private final java.util.List<com.google.android.gms.internal.location.zzbe> zza = new java.util.ArrayList();
        private int zzb = 5;
        private java.lang.String zzc = "";

        public com.google.android.gms.location.GeofencingRequest.Builder addGeofence(com.google.android.gms.location.Geofence geofence) {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(geofence, "geofence can't be null.");
            com.google.android.gms.common.internal.Preconditions.checkArgument(geofence instanceof com.google.android.gms.internal.location.zzbe, "Geofence must be created using Geofence.Builder.");
            this.zza.add((com.google.android.gms.internal.location.zzbe) geofence);
            return this;
        }

        public com.google.android.gms.location.GeofencingRequest.Builder addGeofences(java.util.List<com.google.android.gms.location.Geofence> list) {
            if (list != null && !list.isEmpty()) {
                for (com.google.android.gms.location.Geofence geofence : list) {
                    if (geofence != null) {
                        addGeofence(geofence);
                    }
                }
            }
            return this;
        }

        public com.google.android.gms.location.GeofencingRequest build() {
            com.google.android.gms.common.internal.Preconditions.checkArgument(!this.zza.isEmpty(), "No geofence has been added to this request.");
            return new com.google.android.gms.location.GeofencingRequest(this.zza, this.zzb, this.zzc, null);
        }

        public com.google.android.gms.location.GeofencingRequest.Builder setInitialTrigger(int i) {
            this.zzb = i & 7;
            return this;
        }
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-location@@18.0.0 */
    public @interface InitialTrigger {
    }

    GeofencingRequest(java.util.List<com.google.android.gms.internal.location.zzbe> list, int i, java.lang.String str, java.lang.String str2) {
        this.zza = list;
        this.zzb = i;
        this.zzc = str;
        this.zzd = str2;
    }

    public java.util.List<com.google.android.gms.location.Geofence> getGeofences() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.addAll(this.zza);
        return arrayList;
    }

    public int getInitialTrigger() {
        return this.zzb;
    }

    public java.lang.String toString() {
        return "GeofencingRequest[geofences=" + this.zza + ", initialTrigger=" + this.zzb + ", tag=" + this.zzc + ", attributionTag=" + this.zzd + com.ironsource.y8.i.e;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(parcel, 1, this.zza, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 2, getInitialTrigger());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 3, this.zzc, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 4, this.zzd, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final com.google.android.gms.location.GeofencingRequest zza(java.lang.String str) {
        return new com.google.android.gms.location.GeofencingRequest(this.zza, this.zzb, this.zzc, str);
    }
}
