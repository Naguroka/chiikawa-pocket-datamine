package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfl extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    private final int status;
    final long zzhy;
    final long zzhz;
    private final java.util.List<com.google.android.gms.drive.zzh> zzia;
    private static final java.util.List<com.google.android.gms.drive.zzh> zzhx = java.util.Collections.emptyList();
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.drive.zzfl> CREATOR = new com.google.android.gms.internal.drive.zzfm();

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 2, this.zzhy);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 3, this.zzhz);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 4, this.status);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(parcel, 5, this.zzia, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public zzfl(long j, long j2, int i, java.util.List<com.google.android.gms.drive.zzh> list) {
        this.zzhy = j;
        this.zzhz = j2;
        this.status = i;
        this.zzia = list;
    }
}
