package com.google.android.gms.internal.nearby;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzhg extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.nearby.zzhg> CREATOR = new com.google.android.gms.internal.nearby.zzhh();
    private final int zza;
    private final android.os.ParcelUuid zzb;
    private final android.os.ParcelUuid zzc;
    private final android.os.ParcelUuid zzd;
    private final byte[] zze;
    private final byte[] zzf;
    private final int zzg;
    private final byte[] zzh;
    private final byte[] zzi;

    zzhg(int i, android.os.ParcelUuid parcelUuid, android.os.ParcelUuid parcelUuid2, android.os.ParcelUuid parcelUuid3, byte[] bArr, byte[] bArr2, int i2, byte[] bArr3, byte[] bArr4) {
        this.zza = i;
        this.zzb = parcelUuid;
        this.zzc = parcelUuid2;
        this.zzd = parcelUuid3;
        this.zze = bArr;
        this.zzf = bArr2;
        this.zzg = i2;
        this.zzh = bArr3;
        this.zzi = bArr4;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            com.google.android.gms.internal.nearby.zzhg zzhgVar = (com.google.android.gms.internal.nearby.zzhg) obj;
            if (this.zzg == zzhgVar.zzg && java.util.Arrays.equals(this.zzh, zzhgVar.zzh) && java.util.Arrays.equals(this.zzi, zzhgVar.zzi) && com.google.android.gms.common.internal.Objects.equal(this.zzd, zzhgVar.zzd) && java.util.Arrays.equals(this.zze, zzhgVar.zze) && java.util.Arrays.equals(this.zzf, zzhgVar.zzf) && com.google.android.gms.common.internal.Objects.equal(this.zzb, zzhgVar.zzb) && com.google.android.gms.common.internal.Objects.equal(this.zzc, zzhgVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(java.lang.Integer.valueOf(this.zzg), java.lang.Integer.valueOf(java.util.Arrays.hashCode(this.zzh)), java.lang.Integer.valueOf(java.util.Arrays.hashCode(this.zzi)), this.zzd, java.lang.Integer.valueOf(java.util.Arrays.hashCode(this.zze)), java.lang.Integer.valueOf(java.util.Arrays.hashCode(this.zzf)), this.zzb, this.zzc);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, this.zza);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 4, this.zzb, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 5, this.zzc, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 6, this.zzd, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(parcel, 7, this.zze, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(parcel, 8, this.zzf, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 9, this.zzg);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(parcel, 10, this.zzh, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(parcel, 11, this.zzi, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
