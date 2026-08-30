package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes3.dex */
public final class zzy extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.drive.zzy> CREATOR = new com.google.android.gms.internal.drive.zzz();
    private final com.google.android.gms.drive.metadata.internal.MetadataBundle zzdn;
    private final com.google.android.gms.drive.DriveId zzdp;

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 2, this.zzdp, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 3, this.zzdn, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public zzy(com.google.android.gms.drive.DriveId driveId, com.google.android.gms.drive.metadata.internal.MetadataBundle metadataBundle) {
        this.zzdp = (com.google.android.gms.drive.DriveId) com.google.android.gms.common.internal.Preconditions.checkNotNull(driveId);
        this.zzdn = (com.google.android.gms.drive.metadata.internal.MetadataBundle) com.google.android.gms.common.internal.Preconditions.checkNotNull(metadataBundle);
    }
}
