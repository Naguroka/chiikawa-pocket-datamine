package androidx.media;

/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesCompatParcelizer {
    public static androidx.media.AudioAttributesCompat read(androidx.versionedparcelable.VersionedParcel versionedParcel) {
        androidx.media.AudioAttributesCompat audioAttributesCompat = new androidx.media.AudioAttributesCompat();
        audioAttributesCompat.mImpl = (androidx.media.AudioAttributesImpl) versionedParcel.readVersionedParcelable(audioAttributesCompat.mImpl, 1);
        return audioAttributesCompat;
    }

    public static void write(androidx.media.AudioAttributesCompat audioAttributesCompat, androidx.versionedparcelable.VersionedParcel versionedParcel) {
        versionedParcel.setSerializationFlags(false, false);
        versionedParcel.writeVersionedParcelable(audioAttributesCompat.mImpl, 1);
    }
}
