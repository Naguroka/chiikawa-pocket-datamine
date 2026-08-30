package com.google.android.gms.location.places;

/* JADX INFO: loaded from: classes3.dex */
public class PlaceReport extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.location.places.PlaceReport> CREATOR = new com.google.android.gms.location.places.zza();
    private final java.lang.String tag;
    private final int versionCode;
    private final java.lang.String zza;
    private final java.lang.String zzb;

    PlaceReport(int i, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.versionCode = i;
        this.zza = str;
        this.tag = str2;
        this.zzb = str3;
    }

    public static com.google.android.gms.location.places.PlaceReport create(java.lang.String str, java.lang.String str2) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(str);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str2);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty("unknown");
        com.google.android.gms.common.internal.Preconditions.checkArgument(true, "Invalid source");
        return new com.google.android.gms.location.places.PlaceReport(1, str, str2, "unknown");
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.location.places.PlaceReport)) {
            return false;
        }
        com.google.android.gms.location.places.PlaceReport placeReport = (com.google.android.gms.location.places.PlaceReport) obj;
        return com.google.android.gms.common.internal.Objects.equal(this.zza, placeReport.zza) && com.google.android.gms.common.internal.Objects.equal(this.tag, placeReport.tag) && com.google.android.gms.common.internal.Objects.equal(this.zzb, placeReport.zzb);
    }

    public java.lang.String getPlaceId() {
        return this.zza;
    }

    public java.lang.String getTag() {
        return this.tag;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zza, this.tag, this.zzb);
    }

    public java.lang.String toString() {
        com.google.android.gms.common.internal.Objects.ToStringHelper stringHelper = com.google.android.gms.common.internal.Objects.toStringHelper(this);
        stringHelper.add("placeId", this.zza);
        stringHelper.add("tag", this.tag);
        if (!"unknown".equals(this.zzb)) {
            stringHelper.add("source", this.zzb);
        }
        return stringHelper.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, this.versionCode);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, getPlaceId(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 3, getTag(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 4, this.zzb, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
