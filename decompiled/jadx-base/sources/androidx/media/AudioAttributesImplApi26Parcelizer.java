package androidx.media;

/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesImplApi26Parcelizer {
    public static androidx.media.AudioAttributesImplApi26 read(androidx.versionedparcelable.VersionedParcel versionedParcel) {
        androidx.media.AudioAttributesImplApi26 audioAttributesImplApi26 = new androidx.media.AudioAttributesImplApi26();
        audioAttributesImplApi26.mAudioAttributes = (android.media.AudioAttributes) versionedParcel.readParcelable(audioAttributesImplApi26.mAudioAttributes, 1);
        audioAttributesImplApi26.mLegacyStreamType = versionedParcel.readInt(audioAttributesImplApi26.mLegacyStreamType, 2);
        return audioAttributesImplApi26;
    }

    public static void write(androidx.media.AudioAttributesImplApi26 audioAttributesImplApi26, androidx.versionedparcelable.VersionedParcel versionedParcel) {
        versionedParcel.setSerializationFlags(false, false);
        versionedParcel.writeParcelable(audioAttributesImplApi26.mAudioAttributes, 1);
        versionedParcel.writeInt(audioAttributesImplApi26.mLegacyStreamType, 2);
    }
}
