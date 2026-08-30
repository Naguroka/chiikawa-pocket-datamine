package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzt implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.ads.zzt> CREATOR = new com.google.android.gms.internal.ads.zzs();
    public final java.util.UUID zza;
    public final java.lang.String zzb;
    public final java.lang.String zzc;
    public final byte[] zzd;
    private int zze;

    zzt(android.os.Parcel parcel) {
        this.zza = new java.util.UUID(parcel.readLong(), parcel.readLong());
        this.zzb = parcel.readString();
        java.lang.String string = parcel.readString();
        int i = com.google.android.gms.internal.ads.zzei.zza;
        this.zzc = string;
        this.zzd = parcel.createByteArray();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.internal.ads.zzt)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        com.google.android.gms.internal.ads.zzt zztVar = (com.google.android.gms.internal.ads.zzt) obj;
        return java.util.Objects.equals(this.zzb, zztVar.zzb) && java.util.Objects.equals(this.zzc, zztVar.zzc) && java.util.Objects.equals(this.zza, zztVar.zza) && java.util.Arrays.equals(this.zzd, zztVar.zzd);
    }

    public final int hashCode() {
        int i = this.zze;
        if (i != 0) {
            return i;
        }
        int iHashCode = this.zza.hashCode() * 31;
        java.lang.String str = this.zzb;
        int iHashCode2 = ((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.zzc.hashCode()) * 31) + java.util.Arrays.hashCode(this.zzd);
        this.zze = iHashCode2;
        return iHashCode2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeLong(this.zza.getMostSignificantBits());
        parcel.writeLong(this.zza.getLeastSignificantBits());
        parcel.writeString(this.zzb);
        parcel.writeString(this.zzc);
        parcel.writeByteArray(this.zzd);
    }

    public zzt(java.util.UUID uuid, java.lang.String str, java.lang.String str2, byte[] bArr) {
        uuid.getClass();
        this.zza = uuid;
        this.zzb = null;
        this.zzc = com.google.android.gms.internal.ads.zzbb.zze(str2);
        this.zzd = bArr;
    }
}
