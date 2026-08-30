package com.google.android.gms.nearby.messages.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zze extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.nearby.messages.Distance {
    public static final android.os.Parcelable.Creator<com.google.android.gms.nearby.messages.internal.zze> CREATOR = new com.google.android.gms.nearby.messages.internal.zzf();
    final int zza;
    public final int zzb;
    public final double zzc;

    public zze(int i, double d) {
        this(1, 1, Double.NaN);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.lang.Comparable
    public final int compareTo(com.google.android.gms.nearby.messages.Distance distance) {
        if (java.lang.Double.isNaN(this.zzc) && java.lang.Double.isNaN(distance.getMeters())) {
            return 0;
        }
        return java.lang.Double.compare(this.zzc, distance.getMeters());
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.nearby.messages.internal.zze)) {
            return false;
        }
        com.google.android.gms.nearby.messages.internal.zze zzeVar = (com.google.android.gms.nearby.messages.internal.zze) obj;
        return this.zzb == zzeVar.zzb && compareTo((com.google.android.gms.nearby.messages.Distance) zzeVar) == 0;
    }

    @Override // com.google.android.gms.nearby.messages.Distance
    public final int getAccuracy() {
        return this.zzb;
    }

    @Override // com.google.android.gms.nearby.messages.Distance
    public final double getMeters() {
        return this.zzc;
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(java.lang.Integer.valueOf(this.zzb), java.lang.Double.valueOf(this.zzc));
    }

    public final java.lang.String toString() {
        java.util.Locale locale = java.util.Locale.US;
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = java.lang.Double.valueOf(this.zzc);
        objArr[1] = this.zzb != 1 ? "UNKNOWN" : "LOW";
        return java.lang.String.format(locale, "(%.1fm, %s)", objArr);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, this.zza);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeDouble(parcel, 3, this.zzc);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    zze(int i, int i2, double d) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = d;
    }
}
