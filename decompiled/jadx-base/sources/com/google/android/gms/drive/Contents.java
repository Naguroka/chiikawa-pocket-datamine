package com.google.android.gms.drive;

/* JADX INFO: loaded from: classes4.dex */
public class Contents extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.drive.Contents> CREATOR = new com.google.android.gms.drive.zzc();
    private final int mode;
    private final android.os.ParcelFileDescriptor zzi;
    final int zzj;
    private final com.google.android.gms.drive.DriveId zzk;
    private final boolean zzl;
    private final java.lang.String zzm;

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 2, this.zzi, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 3, this.zzj);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 4, this.mode);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 5, this.zzk, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 7, this.zzl);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 8, this.zzm, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public Contents(android.os.ParcelFileDescriptor parcelFileDescriptor, int i, int i2, com.google.android.gms.drive.DriveId driveId, boolean z, java.lang.String str) {
        this.zzi = parcelFileDescriptor;
        this.zzj = i;
        this.mode = i2;
        this.zzk = driveId;
        this.zzl = z;
        this.zzm = str;
    }

    public android.os.ParcelFileDescriptor getParcelFileDescriptor() {
        return this.zzi;
    }

    public final com.google.android.gms.drive.DriveId getDriveId() {
        return this.zzk;
    }

    public final java.io.InputStream getInputStream() {
        return new java.io.FileInputStream(this.zzi.getFileDescriptor());
    }

    public final java.io.OutputStream getOutputStream() {
        return new java.io.FileOutputStream(this.zzi.getFileDescriptor());
    }

    public final int getMode() {
        return this.mode;
    }

    public final int getRequestId() {
        return this.zzj;
    }

    public final boolean zzb() {
        return this.zzl;
    }
}
