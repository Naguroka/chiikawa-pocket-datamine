package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzfos extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.ads.zzfos> CREATOR = new com.google.android.gms.internal.ads.zzfot();
    public final int zza;
    private com.google.android.gms.internal.ads.zzasy zzb = null;
    private byte[] zzc;

    zzfos(int i, byte[] bArr) {
        this.zza = i;
        this.zzc = bArr;
        zzb();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int i2 = this.zza;
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, i2);
        byte[] bArrZzaV = this.zzc;
        if (bArrZzaV == null) {
            bArrZzaV = this.zzb.zzaV();
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(parcel, 2, bArrZzaV, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final com.google.android.gms.internal.ads.zzasy zza() {
        if (this.zzb == null) {
            try {
                this.zzb = com.google.android.gms.internal.ads.zzasy.zzd(this.zzc, com.google.android.gms.internal.ads.zzgxb.zza());
                this.zzc = null;
            } catch (com.google.android.gms.internal.ads.zzgyg | java.lang.NullPointerException e) {
                throw new java.lang.IllegalStateException(e);
            }
        }
        zzb();
        return this.zzb;
    }

    private final void zzb() {
        com.google.android.gms.internal.ads.zzasy zzasyVar = this.zzb;
        if (zzasyVar != null || this.zzc == null) {
            if (zzasyVar == null || this.zzc != null) {
                if (zzasyVar != null && this.zzc != null) {
                    throw new java.lang.IllegalStateException("Invalid internal representation - full");
                }
                if (zzasyVar != null || this.zzc != null) {
                    throw new java.lang.IllegalStateException("Impossible");
                }
                throw new java.lang.IllegalStateException("Invalid internal representation - empty");
            }
        }
    }
}
