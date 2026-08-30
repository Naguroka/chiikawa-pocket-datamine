package com.google.android.gms.internal.nearby;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzey extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.nearby.zzey> CREATOR = new com.google.android.gms.internal.nearby.zzez();
    private java.lang.String zza;
    private java.lang.String zzb;
    private byte[] zzc;

    private zzey() {
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.gms.internal.nearby.zzey) {
            com.google.android.gms.internal.nearby.zzey zzeyVar = (com.google.android.gms.internal.nearby.zzey) obj;
            if (com.google.android.gms.common.internal.Objects.equal(this.zza, zzeyVar.zza) && com.google.android.gms.common.internal.Objects.equal(this.zzb, zzeyVar.zzb) && java.util.Arrays.equals(this.zzc, zzeyVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zza, this.zzb, java.lang.Integer.valueOf(java.util.Arrays.hashCode(this.zzc)));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 1, this.zza, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(parcel, 3, this.zzc, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final java.lang.String zza() {
        return this.zza;
    }

    public final java.lang.String zzb() {
        return this.zzb;
    }

    public final byte[] zzc() {
        return this.zzc;
    }

    zzey(java.lang.String str, java.lang.String str2, byte[] bArr) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = bArr;
    }
}
