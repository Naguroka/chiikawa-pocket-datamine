package androidx.media;

/* JADX INFO: loaded from: classes.dex */
public interface AudioAttributesImpl extends androidx.versionedparcelable.VersionedParcelable {

    public interface Builder {
        androidx.media.AudioAttributesImpl build();

        androidx.media.AudioAttributesImpl.Builder setContentType(int i);

        androidx.media.AudioAttributesImpl.Builder setFlags(int i);

        androidx.media.AudioAttributesImpl.Builder setLegacyStreamType(int i);

        androidx.media.AudioAttributesImpl.Builder setUsage(int i);
    }

    java.lang.Object getAudioAttributes();

    int getContentType();

    int getFlags();

    int getLegacyStreamType();

    int getRawLegacyStreamType();

    int getUsage();

    int getVolumeControlStream();
}
