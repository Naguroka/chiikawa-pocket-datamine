package com.google.android.gms.internal.nearby;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzew extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.nearby.zzew> CREATOR = new com.google.android.gms.internal.nearby.zzex();
    private java.lang.String zza;
    private java.lang.String zzb;
    private java.lang.String zzc;
    private boolean zzd;
    private byte[] zze;
    private byte[] zzf;
    private byte[] zzg;
    private boolean zzh;

    private zzew() {
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.gms.internal.nearby.zzew) {
            com.google.android.gms.internal.nearby.zzew zzewVar = (com.google.android.gms.internal.nearby.zzew) obj;
            if (com.google.android.gms.common.internal.Objects.equal(this.zza, zzewVar.zza) && com.google.android.gms.common.internal.Objects.equal(this.zzb, zzewVar.zzb) && com.google.android.gms.common.internal.Objects.equal(this.zzc, zzewVar.zzc) && com.google.android.gms.common.internal.Objects.equal(java.lang.Boolean.valueOf(this.zzd), java.lang.Boolean.valueOf(zzewVar.zzd)) && java.util.Arrays.equals(this.zze, zzewVar.zze) && java.util.Arrays.equals(this.zzf, zzewVar.zzf) && java.util.Arrays.equals(this.zzg, zzewVar.zzg) && com.google.android.gms.common.internal.Objects.equal(java.lang.Boolean.valueOf(this.zzh), java.lang.Boolean.valueOf(zzewVar.zzh))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zza, this.zzb, this.zzc, java.lang.Boolean.valueOf(this.zzd), java.lang.Integer.valueOf(java.util.Arrays.hashCode(this.zze)), java.lang.Integer.valueOf(java.util.Arrays.hashCode(this.zzf)), java.lang.Integer.valueOf(java.util.Arrays.hashCode(this.zzg)), java.lang.Boolean.valueOf(this.zzh));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 1, this.zza, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 3, this.zzc, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 4, this.zzd);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(parcel, 5, this.zze, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(parcel, 6, this.zzf, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(parcel, 7, this.zzg, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 8, this.zzh);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final java.lang.String zza() {
        return this.zza;
    }

    public final java.lang.String zzb() {
        return this.zzb;
    }

    public final java.lang.String zzc() {
        return this.zzc;
    }

    public final boolean zzd() {
        return this.zzd;
    }

    public final byte[] zze() {
        return this.zzf;
    }

    public final byte[] zzf() {
        return this.zzg;
    }

    public final boolean zzg() {
        return this.zzh;
    }

    zzew(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, byte[] bArr, byte[] bArr2, byte[] bArr3, boolean z2) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = z;
        this.zze = bArr;
        this.zzf = bArr2;
        this.zzg = bArr3;
        this.zzh = z2;
    }
}
