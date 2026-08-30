package com.google.android.gms.drive.metadata.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class zzq extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.drive.metadata.internal.zzq> CREATOR = new com.google.android.gms.drive.metadata.internal.zzr();
    final java.lang.String zzad;
    final long zzae;
    final int zzaf;

    public zzq(java.lang.String str, long j, int i) {
        this.zzad = str;
        this.zzae = j;
        this.zzaf = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, this.zzad, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 3, this.zzae);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 4, this.zzaf);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
