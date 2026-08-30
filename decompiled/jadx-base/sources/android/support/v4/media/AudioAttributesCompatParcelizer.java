package android.support.v4.media;

/* JADX INFO: loaded from: classes.dex */
public final class AudioAttributesCompatParcelizer extends androidx.media.AudioAttributesCompatParcelizer {
    public static androidx.media.AudioAttributesCompat read(androidx.versionedparcelable.VersionedParcel versionedParcel) {
        return androidx.media.AudioAttributesCompatParcelizer.read(versionedParcel);
    }

    public static void write(androidx.media.AudioAttributesCompat audioAttributesCompat, androidx.versionedparcelable.VersionedParcel versionedParcel) {
        androidx.media.AudioAttributesCompatParcelizer.write(audioAttributesCompat, versionedParcel);
    }
}
