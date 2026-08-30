package com.google.android.gms.games.snapshot;

/* JADX INFO: compiled from: com.google.android.gms:play-services-games-v2@@17.0.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class SnapshotContentsEntity extends com.google.android.gms.games.internal.zzh implements com.google.android.gms.games.snapshot.SnapshotContents {
    private com.google.android.gms.drive.Contents zzb;
    private static final java.lang.Object zza = new java.lang.Object();
    public static final android.os.Parcelable.Creator<com.google.android.gms.games.snapshot.SnapshotContentsEntity> CREATOR = new com.google.android.gms.games.snapshot.zza();

    public SnapshotContentsEntity(com.google.android.gms.drive.Contents contents) {
        this.zzb = contents;
    }

    private final boolean zzc(int i, byte[] bArr, int i2, int i3, boolean z) {
        com.google.android.gms.common.internal.Preconditions.checkState(!isClosed(), "Must provide a previously opened SnapshotContents");
        synchronized (zza) {
            java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(this.zzb.getParcelFileDescriptor().getFileDescriptor());
            java.io.BufferedOutputStream bufferedOutputStream = new java.io.BufferedOutputStream(fileOutputStream);
            try {
                java.nio.channels.FileChannel channel = fileOutputStream.getChannel();
                channel.position(i);
                bufferedOutputStream.write(bArr, i2, i3);
                if (z) {
                    channel.truncate(bArr.length);
                }
                bufferedOutputStream.flush();
            } catch (java.io.IOException e) {
                com.google.android.gms.internal.games_v2.zzez.zze("SnapshotContentsEntity", "Failed to write snapshot data", e);
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotContents
    public final android.os.ParcelFileDescriptor getParcelFileDescriptor() {
        com.google.android.gms.common.internal.Preconditions.checkState(!isClosed(), "Cannot mutate closed contents!");
        return this.zzb.getParcelFileDescriptor();
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotContents
    public final boolean isClosed() {
        return this.zzb == null;
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotContents
    public final boolean modifyBytes(int i, byte[] bArr, int i2, int i3) {
        return zzc(i, bArr, i2, bArr.length, false);
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotContents
    public final byte[] readFully() throws java.io.IOException {
        byte[] inputStreamFully;
        com.google.android.gms.common.internal.Preconditions.checkState(!isClosed(), "Must provide a previously opened Snapshot");
        synchronized (zza) {
            java.io.FileInputStream fileInputStream = new java.io.FileInputStream(this.zzb.getParcelFileDescriptor().getFileDescriptor());
            java.io.BufferedInputStream bufferedInputStream = new java.io.BufferedInputStream(fileInputStream);
            try {
                fileInputStream.getChannel().position(0L);
                inputStreamFully = com.google.android.gms.common.util.IOUtils.readInputStreamFully(bufferedInputStream, false);
                fileInputStream.getChannel().position(0L);
            } catch (java.io.IOException e) {
                com.google.android.gms.internal.games_v2.zzez.zzh("SnapshotContentsEntity", "Failed to read snapshot data", e);
                throw e;
            }
        }
        return inputStreamFully;
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotContents
    public final boolean writeBytes(byte[] bArr) {
        return zzc(0, bArr, 0, bArr.length, true);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 1, this.zzb, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotContents
    public final com.google.android.gms.drive.Contents zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotContents
    public final void zzb() {
        this.zzb = null;
    }
}
