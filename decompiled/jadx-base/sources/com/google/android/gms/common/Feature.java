package com.google.android.gms.common;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public class Feature extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.Feature> CREATOR = new com.google.android.gms.common.zzd();
    private final java.lang.String zza;

    @java.lang.Deprecated
    private final int zzb;
    private final long zzc;

    public Feature(java.lang.String str, int i, long j) {
        this.zza = str;
        this.zzb = i;
        this.zzc = j;
    }

    public Feature(java.lang.String str, long j) {
        this.zza = str;
        this.zzc = j;
        this.zzb = -1;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof com.google.android.gms.common.Feature) {
            com.google.android.gms.common.Feature feature = (com.google.android.gms.common.Feature) obj;
            if (((getName() != null && getName().equals(feature.getName())) || (getName() == null && feature.getName() == null)) && getVersion() == feature.getVersion()) {
                return true;
            }
        }
        return false;
    }

    public java.lang.String getName() {
        return this.zza;
    }

    public long getVersion() {
        long j = this.zzc;
        return j == -1 ? this.zzb : j;
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(getName(), java.lang.Long.valueOf(getVersion()));
    }

    public final java.lang.String toString() {
        com.google.android.gms.common.internal.Objects.ToStringHelper stringHelper = com.google.android.gms.common.internal.Objects.toStringHelper(this);
        stringHelper.add("name", getName());
        stringHelper.add("version", java.lang.Long.valueOf(getVersion()));
        return stringHelper.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 1, getName(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 3, getVersion());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
