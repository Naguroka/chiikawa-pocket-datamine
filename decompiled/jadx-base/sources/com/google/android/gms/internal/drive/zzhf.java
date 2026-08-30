package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes3.dex */
public final class zzhf extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.drive.zzhf> CREATOR = new com.google.android.gms.internal.drive.zzhg();
    private final com.google.android.gms.drive.DriveId zzdd;
    private final com.google.android.gms.drive.metadata.internal.MetadataBundle zzde;

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 2, this.zzdd, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 3, this.zzde, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public zzhf(com.google.android.gms.drive.DriveId driveId, com.google.android.gms.drive.metadata.internal.MetadataBundle metadataBundle) {
        this.zzdd = driveId;
        this.zzde = metadataBundle;
    }
}
