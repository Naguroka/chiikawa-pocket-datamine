package androidx.core.app;

/* JADX INFO: loaded from: classes.dex */
public final class PictureInPictureModeChangedInfo {
    private final boolean mIsInPictureInPictureMode;
    private final android.content.res.Configuration mNewConfig;

    public PictureInPictureModeChangedInfo(boolean z) {
        this.mIsInPictureInPictureMode = z;
        this.mNewConfig = null;
    }

    public PictureInPictureModeChangedInfo(boolean z, android.content.res.Configuration configuration) {
        this.mIsInPictureInPictureMode = z;
        this.mNewConfig = configuration;
    }

    public boolean isInPictureInPictureMode() {
        return this.mIsInPictureInPictureMode;
    }

    public android.content.res.Configuration getNewConfig() {
        android.content.res.Configuration configuration = this.mNewConfig;
        if (configuration != null) {
            return configuration;
        }
        throw new java.lang.IllegalStateException("PictureInPictureModeChangedInfo must be constructed with the constructor that takes a Configuration to call getNewConfig(). Are you running on an API 26 or higher device that makes this information available?");
    }
}
