package com.google.android.gms.games.snapshot;

/* JADX INFO: compiled from: com.google.android.gms:play-services-games-v2@@17.0.0 */
/* JADX INFO: loaded from: classes4.dex */
public interface Snapshot extends com.google.android.gms.common.data.Freezable<com.google.android.gms.games.snapshot.Snapshot>, android.os.Parcelable {
    com.google.android.gms.games.snapshot.SnapshotMetadata getMetadata();

    com.google.android.gms.games.snapshot.SnapshotContents getSnapshotContents();
}
