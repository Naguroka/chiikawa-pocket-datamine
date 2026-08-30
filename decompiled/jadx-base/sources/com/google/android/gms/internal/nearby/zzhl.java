package com.google.android.gms.internal.nearby;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzhl extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.nearby.zzhl> CREATOR = new com.google.android.gms.internal.nearby.zzhm();
    final int zza;
    final int zzb;
    final byte[] zzc;
    final boolean zzd;

    zzhl(int i, int i2, byte[] bArr, boolean z) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = bArr;
        this.zzd = z;
    }

    public static com.google.android.gms.internal.nearby.zzhl zza(java.lang.String str, java.lang.String str2) {
        java.lang.String strValueOf = java.lang.String.valueOf(str);
        if (str2 == null) {
            str2 = "";
        }
        return new com.google.android.gms.internal.nearby.zzhl(2, new com.google.android.gms.nearby.messages.internal.zzg(com.google.android.gms.nearby.messages.internal.zzg.zzb(str2.length() != 0 ? strValueOf.concat(str2) : new java.lang.String(strValueOf))).zzc());
    }

    public static com.google.android.gms.internal.nearby.zzhl zzb(java.util.UUID uuid, java.lang.Short sh, java.lang.Short sh2) {
        return new com.google.android.gms.internal.nearby.zzhl(3, new com.google.android.gms.nearby.messages.internal.zzl(uuid, sh, sh2).zzc());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, this.zzb);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(parcel, 2, this.zzc, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 3, this.zzd);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1000, this.zza);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    private zzhl(int i, byte[] bArr) {
        this(1, i, bArr, false);
    }
}
