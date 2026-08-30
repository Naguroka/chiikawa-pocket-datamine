package com.google.android.gms.location;

/* JADX INFO: compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class LocationResult extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    private final java.util.List<android.location.Location> zzb;
    static final java.util.List<android.location.Location> zza = java.util.Collections.emptyList();
    public static final android.os.Parcelable.Creator<com.google.android.gms.location.LocationResult> CREATOR = new com.google.android.gms.location.zzbg();

    LocationResult(java.util.List<android.location.Location> list) {
        this.zzb = list;
    }

    public static com.google.android.gms.location.LocationResult create(java.util.List<android.location.Location> list) {
        if (list == null) {
            list = zza;
        }
        return new com.google.android.gms.location.LocationResult(list);
    }

    public static com.google.android.gms.location.LocationResult extractResult(android.content.Intent intent) {
        if (hasResult(intent)) {
            return (com.google.android.gms.location.LocationResult) intent.getParcelableExtra("com.google.android.gms.location.EXTRA_LOCATION_RESULT");
        }
        return null;
    }

    public static boolean hasResult(android.content.Intent intent) {
        if (intent == null) {
            return false;
        }
        return intent.hasExtra("com.google.android.gms.location.EXTRA_LOCATION_RESULT");
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.location.LocationResult)) {
            return false;
        }
        com.google.android.gms.location.LocationResult locationResult = (com.google.android.gms.location.LocationResult) obj;
        if (locationResult.zzb.size() != this.zzb.size()) {
            return false;
        }
        java.util.Iterator<android.location.Location> it = locationResult.zzb.iterator();
        java.util.Iterator<android.location.Location> it2 = this.zzb.iterator();
        while (it.hasNext()) {
            if (it2.next().getTime() != it.next().getTime()) {
                return false;
            }
        }
        return true;
    }

    public android.location.Location getLastLocation() {
        int size = this.zzb.size();
        if (size == 0) {
            return null;
        }
        return this.zzb.get(size - 1);
    }

    public java.util.List<android.location.Location> getLocations() {
        return this.zzb;
    }

    public int hashCode() {
        java.util.Iterator<android.location.Location> it = this.zzb.iterator();
        int i = 17;
        while (it.hasNext()) {
            long time = it.next().getTime();
            i = (i * 31) + ((int) (time ^ (time >>> 32)));
        }
        return i;
    }

    public java.lang.String toString() {
        java.lang.String strValueOf = java.lang.String.valueOf(this.zzb);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(strValueOf).length() + 27);
        sb.append("LocationResult[locations: ");
        sb.append(strValueOf);
        sb.append(com.ironsource.y8.i.e);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(parcel, 1, getLocations(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
