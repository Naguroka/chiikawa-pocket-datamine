package androidx.core.app;

/* JADX INFO: loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static androidx.core.app.RemoteActionCompat read(androidx.versionedparcelable.VersionedParcel versionedParcel) {
        androidx.core.app.RemoteActionCompat remoteActionCompat = new androidx.core.app.RemoteActionCompat();
        remoteActionCompat.mIcon = (androidx.core.graphics.drawable.IconCompat) versionedParcel.readVersionedParcelable(remoteActionCompat.mIcon, 1);
        remoteActionCompat.mTitle = versionedParcel.readCharSequence(remoteActionCompat.mTitle, 2);
        remoteActionCompat.mContentDescription = versionedParcel.readCharSequence(remoteActionCompat.mContentDescription, 3);
        remoteActionCompat.mActionIntent = (android.app.PendingIntent) versionedParcel.readParcelable(remoteActionCompat.mActionIntent, 4);
        remoteActionCompat.mEnabled = versionedParcel.readBoolean(remoteActionCompat.mEnabled, 5);
        remoteActionCompat.mShouldShowIcon = versionedParcel.readBoolean(remoteActionCompat.mShouldShowIcon, 6);
        return remoteActionCompat;
    }

    public static void write(androidx.core.app.RemoteActionCompat remoteActionCompat, androidx.versionedparcelable.VersionedParcel versionedParcel) {
        versionedParcel.setSerializationFlags(false, false);
        versionedParcel.writeVersionedParcelable(remoteActionCompat.mIcon, 1);
        versionedParcel.writeCharSequence(remoteActionCompat.mTitle, 2);
        versionedParcel.writeCharSequence(remoteActionCompat.mContentDescription, 3);
        versionedParcel.writeParcelable(remoteActionCompat.mActionIntent, 4);
        versionedParcel.writeBoolean(remoteActionCompat.mEnabled, 5);
        versionedParcel.writeBoolean(remoteActionCompat.mShouldShowIcon, 6);
    }
}
