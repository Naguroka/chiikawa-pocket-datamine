package androidx.media;

/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesImplApi21Parcelizer {
    public static androidx.media.AudioAttributesImplApi21 read(androidx.versionedparcelable.VersionedParcel versionedParcel) {
        androidx.media.AudioAttributesImplApi21 audioAttributesImplApi21 = new androidx.media.AudioAttributesImplApi21();
        audioAttributesImplApi21.mAudioAttributes = (android.media.AudioAttributes) versionedParcel.readParcelable(audioAttributesImplApi21.mAudioAttributes, 1);
        audioAttributesImplApi21.mLegacyStreamType = versionedParcel.readInt(audioAttributesImplApi21.mLegacyStreamType, 2);
        return audioAttributesImplApi21;
    }

    public static void write(androidx.media.AudioAttributesImplApi21 audioAttributesImplApi21, androidx.versionedparcelable.VersionedParcel versionedParcel) {
        versionedParcel.setSerializationFlags(false, false);
        versionedParcel.writeParcelable(audioAttributesImplApi21.mAudioAttributes, 1);
        versionedParcel.writeInt(audioAttributesImplApi21.mLegacyStreamType, 2);
    }
}
