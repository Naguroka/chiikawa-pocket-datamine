package androidx.media3.session.legacy;

/* JADX INFO: loaded from: classes.dex */
public abstract class VolumeProviderCompat {
    public static final int VOLUME_CONTROL_ABSOLUTE = 2;
    public static final int VOLUME_CONTROL_FIXED = 0;
    public static final int VOLUME_CONTROL_RELATIVE = 1;
    private androidx.media3.session.legacy.VolumeProviderCompat.Callback mCallback;
    private final java.lang.String mControlId;
    private final int mControlType;
    private int mCurrentVolume;
    private final int mMaxVolume;
    private android.media.VolumeProvider mVolumeProviderFwk;

    public static abstract class Callback {
        public abstract void onVolumeChanged(androidx.media3.session.legacy.VolumeProviderCompat volumeProviderCompat);
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface ControlType {
    }

    public void onAdjustVolume(int i) {
    }

    public void onSetVolumeTo(int i) {
    }

    public VolumeProviderCompat(int i, int i2, int i3) {
        this(i, i2, i3, null);
    }

    public VolumeProviderCompat(int i, int i2, int i3, java.lang.String str) {
        this.mControlType = i;
        this.mMaxVolume = i2;
        this.mCurrentVolume = i3;
        this.mControlId = str;
    }

    public final int getCurrentVolume() {
        return this.mCurrentVolume;
    }

    public final int getVolumeControl() {
        return this.mControlType;
    }

    public final int getMaxVolume() {
        return this.mMaxVolume;
    }

    public final void setCurrentVolume(int i) {
        this.mCurrentVolume = i;
        androidx.media3.session.legacy.VolumeProviderCompat.Api21Impl.setCurrentVolume((android.media.VolumeProvider) getVolumeProvider(), i);
        androidx.media3.session.legacy.VolumeProviderCompat.Callback callback = this.mCallback;
        if (callback != null) {
            callback.onVolumeChanged(this);
        }
    }

    public final java.lang.String getVolumeControlId() {
        return this.mControlId;
    }

    public void setCallback(androidx.media3.session.legacy.VolumeProviderCompat.Callback callback) {
        this.mCallback = callback;
    }

    public java.lang.Object getVolumeProvider() {
        if (this.mVolumeProviderFwk == null) {
            if (android.os.Build.VERSION.SDK_INT >= 30) {
                this.mVolumeProviderFwk = new android.media.VolumeProvider(this.mControlType, this.mMaxVolume, this.mCurrentVolume, this.mControlId) { // from class: androidx.media3.session.legacy.VolumeProviderCompat.1
                    @Override // android.media.VolumeProvider
                    public void onSetVolumeTo(int i) {
                        androidx.media3.session.legacy.VolumeProviderCompat.this.onSetVolumeTo(i);
                    }

                    @Override // android.media.VolumeProvider
                    public void onAdjustVolume(int i) {
                        androidx.media3.session.legacy.VolumeProviderCompat.this.onAdjustVolume(i);
                    }
                };
            } else {
                this.mVolumeProviderFwk = new android.media.VolumeProvider(this.mControlType, this.mMaxVolume, this.mCurrentVolume) { // from class: androidx.media3.session.legacy.VolumeProviderCompat.2
                    @Override // android.media.VolumeProvider
                    public void onSetVolumeTo(int i) {
                        androidx.media3.session.legacy.VolumeProviderCompat.this.onSetVolumeTo(i);
                    }

                    @Override // android.media.VolumeProvider
                    public void onAdjustVolume(int i) {
                        androidx.media3.session.legacy.VolumeProviderCompat.this.onAdjustVolume(i);
                    }
                };
            }
        }
        return this.mVolumeProviderFwk;
    }

    private static class Api21Impl {
        private Api21Impl() {
        }

        static void setCurrentVolume(android.media.VolumeProvider volumeProvider, int i) {
            volumeProvider.setCurrentVolume(i);
        }
    }
}
