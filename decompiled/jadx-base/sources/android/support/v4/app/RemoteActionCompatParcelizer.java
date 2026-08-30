package android.support.v4.app;

/* JADX INFO: loaded from: classes.dex */
public final class RemoteActionCompatParcelizer extends androidx.core.app.RemoteActionCompatParcelizer {
    public static androidx.core.app.RemoteActionCompat read(androidx.versionedparcelable.VersionedParcel versionedParcel) {
        return androidx.core.app.RemoteActionCompatParcelizer.read(versionedParcel);
    }

    public static void write(androidx.core.app.RemoteActionCompat remoteActionCompat, androidx.versionedparcelable.VersionedParcel versionedParcel) {
        androidx.core.app.RemoteActionCompatParcelizer.write(remoteActionCompat, versionedParcel);
    }
}
