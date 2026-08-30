package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes3.dex */
public final class zzw extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.drive.zzw> CREATOR = new com.google.android.gms.internal.drive.zzx();
    private final java.lang.String zzan;
    private final com.google.android.gms.drive.Contents zzdf;
    private final com.google.android.gms.drive.metadata.internal.MetadataBundle zzdn;
    private final java.lang.Integer zzdo;
    private final com.google.android.gms.drive.DriveId zzdp;
    private final boolean zzdq;
    private final int zzdr;
    private final int zzds;

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 2, this.zzdp, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 3, this.zzdn, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 4, this.zzdf, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIntegerObject(parcel, 5, this.zzdo, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 6, this.zzdq);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 7, this.zzan, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 8, this.zzdr);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 9, this.zzds);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    zzw(com.google.android.gms.drive.DriveId driveId, com.google.android.gms.drive.metadata.internal.MetadataBundle metadataBundle, com.google.android.gms.drive.Contents contents, int i, boolean z, java.lang.String str, int i2, int i3) {
        if (contents != null && i3 != 0) {
            com.google.android.gms.common.internal.Preconditions.checkArgument(contents.getRequestId() == i3, "inconsistent contents reference");
        }
        if (i == 0 && contents == null && i3 == 0) {
            throw new java.lang.IllegalArgumentException("Need a valid contents");
        }
        this.zzdp = (com.google.android.gms.drive.DriveId) com.google.android.gms.common.internal.Preconditions.checkNotNull(driveId);
        this.zzdn = (com.google.android.gms.drive.metadata.internal.MetadataBundle) com.google.android.gms.common.internal.Preconditions.checkNotNull(metadataBundle);
        this.zzdf = contents;
        this.zzdo = java.lang.Integer.valueOf(i);
        this.zzan = str;
        this.zzdr = i2;
        this.zzdq = z;
        this.zzds = i3;
    }

    public zzw(com.google.android.gms.drive.DriveId driveId, com.google.android.gms.drive.metadata.internal.MetadataBundle metadataBundle, int i, int i2, com.google.android.gms.drive.ExecutionOptions executionOptions) {
        this(driveId, metadataBundle, null, i2, executionOptions.zzm(), executionOptions.zzl(), executionOptions.zzn(), i);
    }
}
