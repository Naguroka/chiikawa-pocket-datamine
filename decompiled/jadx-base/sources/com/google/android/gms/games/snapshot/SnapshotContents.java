package com.google.android.gms.games.snapshot;

/* JADX INFO: compiled from: com.google.android.gms:play-services-games-v2@@17.0.0 */
/* JADX INFO: loaded from: classes4.dex */
public interface SnapshotContents extends android.os.Parcelable {
    android.os.ParcelFileDescriptor getParcelFileDescriptor();

    boolean isClosed();

    boolean modifyBytes(int i, byte[] bArr, int i2, int i3);

    byte[] readFully() throws java.io.IOException;

    boolean writeBytes(byte[] bArr);

    com.google.android.gms.drive.Contents zza();

    void zzb();
}
