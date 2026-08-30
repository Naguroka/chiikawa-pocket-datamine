package com.google.android.gms.internal.nearby;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzfa extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.nearby.zzfa> CREATOR = new com.google.android.gms.internal.nearby.zzfb();
    private java.lang.String zza;
    private int zzb;
    private byte[] zzc;

    private zzfa() {
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.gms.internal.nearby.zzfa) {
            com.google.android.gms.internal.nearby.zzfa zzfaVar = (com.google.android.gms.internal.nearby.zzfa) obj;
            if (com.google.android.gms.common.internal.Objects.equal(this.zza, zzfaVar.zza) && com.google.android.gms.common.internal.Objects.equal(java.lang.Integer.valueOf(this.zzb), java.lang.Integer.valueOf(zzfaVar.zzb)) && java.util.Arrays.equals(this.zzc, zzfaVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zza, java.lang.Integer.valueOf(this.zzb), java.lang.Integer.valueOf(java.util.Arrays.hashCode(this.zzc)));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 1, this.zza, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(parcel, 3, this.zzc, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final java.lang.String zza() {
        return this.zza;
    }

    public final int zzb() {
        return this.zzb;
    }

    public final byte[] zzc() {
        return this.zzc;
    }

    zzfa(java.lang.String str, int i, byte[] bArr) {
        this.zza = str;
        this.zzb = i;
        this.zzc = bArr;
    }
}
