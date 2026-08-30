package androidx.media3.common;

/* JADX INFO: loaded from: classes.dex */
public final class DeviceInfo {
    public static final int PLAYBACK_TYPE_LOCAL = 0;
    public static final int PLAYBACK_TYPE_REMOTE = 1;
    public final int maxVolume;
    public final int minVolume;
    public final int playbackType;
    public final java.lang.String routingControllerId;
    public static final androidx.media3.common.DeviceInfo UNKNOWN = new androidx.media3.common.DeviceInfo.Builder(0).build();
    private static final java.lang.String FIELD_PLAYBACK_TYPE = androidx.media3.common.util.Util.intToStringMaxRadix(0);
    private static final java.lang.String FIELD_MIN_VOLUME = androidx.media3.common.util.Util.intToStringMaxRadix(1);
    private static final java.lang.String FIELD_MAX_VOLUME = androidx.media3.common.util.Util.intToStringMaxRadix(2);
    private static final java.lang.String FIELD_ROUTING_CONTROLLER_ID = androidx.media3.common.util.Util.intToStringMaxRadix(3);

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface PlaybackType {
    }

    public static final class Builder {
        private int maxVolume;
        private int minVolume;
        private final int playbackType;
        private java.lang.String routingControllerId;

        public Builder(int i) {
            this.playbackType = i;
        }

        public androidx.media3.common.DeviceInfo.Builder setMinVolume(int i) {
            this.minVolume = i;
            return this;
        }

        public androidx.media3.common.DeviceInfo.Builder setMaxVolume(int i) {
            this.maxVolume = i;
            return this;
        }

        public androidx.media3.common.DeviceInfo.Builder setRoutingControllerId(java.lang.String str) {
            androidx.media3.common.util.Assertions.checkArgument(this.playbackType != 0 || str == null);
            this.routingControllerId = str;
            return this;
        }

        public androidx.media3.common.DeviceInfo build() {
            androidx.media3.common.util.Assertions.checkArgument(this.minVolume <= this.maxVolume);
            return new androidx.media3.common.DeviceInfo(this);
        }
    }

    @java.lang.Deprecated
    public DeviceInfo(int i, int i2, int i3) {
        this(new androidx.media3.common.DeviceInfo.Builder(i).setMinVolume(i2).setMaxVolume(i3));
    }

    private DeviceInfo(androidx.media3.common.DeviceInfo.Builder builder) {
        this.playbackType = builder.playbackType;
        this.minVolume = builder.minVolume;
        this.maxVolume = builder.maxVolume;
        this.routingControllerId = builder.routingControllerId;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof androidx.media3.common.DeviceInfo)) {
            return false;
        }
        androidx.media3.common.DeviceInfo deviceInfo = (androidx.media3.common.DeviceInfo) obj;
        return this.playbackType == deviceInfo.playbackType && this.minVolume == deviceInfo.minVolume && this.maxVolume == deviceInfo.maxVolume && androidx.media3.common.util.Util.areEqual(this.routingControllerId, deviceInfo.routingControllerId);
    }

    public int hashCode() {
        int i = (((((com.json.mediationsdk.logger.IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.playbackType) * 31) + this.minVolume) * 31) + this.maxVolume) * 31;
        java.lang.String str = this.routingControllerId;
        return i + (str == null ? 0 : str.hashCode());
    }

    public android.os.Bundle toBundle() {
        android.os.Bundle bundle = new android.os.Bundle();
        int i = this.playbackType;
        if (i != 0) {
            bundle.putInt(FIELD_PLAYBACK_TYPE, i);
        }
        int i2 = this.minVolume;
        if (i2 != 0) {
            bundle.putInt(FIELD_MIN_VOLUME, i2);
        }
        int i3 = this.maxVolume;
        if (i3 != 0) {
            bundle.putInt(FIELD_MAX_VOLUME, i3);
        }
        java.lang.String str = this.routingControllerId;
        if (str != null) {
            bundle.putString(FIELD_ROUTING_CONTROLLER_ID, str);
        }
        return bundle;
    }

    public static androidx.media3.common.DeviceInfo fromBundle(android.os.Bundle bundle) {
        int i = bundle.getInt(FIELD_PLAYBACK_TYPE, 0);
        int i2 = bundle.getInt(FIELD_MIN_VOLUME, 0);
        int i3 = bundle.getInt(FIELD_MAX_VOLUME, 0);
        return new androidx.media3.common.DeviceInfo.Builder(i).setMinVolume(i2).setMaxVolume(i3).setRoutingControllerId(bundle.getString(FIELD_ROUTING_CONTROLLER_ID)).build();
    }
}
