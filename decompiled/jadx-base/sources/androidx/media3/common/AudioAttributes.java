package androidx.media3.common;

/* JADX INFO: loaded from: classes.dex */
public final class AudioAttributes {
    public final int allowedCapturePolicy;
    private androidx.media3.common.AudioAttributes.AudioAttributesV21 audioAttributesV21;
    public final int contentType;
    public final int flags;
    public final int spatializationBehavior;
    public final int usage;
    public static final androidx.media3.common.AudioAttributes DEFAULT = new androidx.media3.common.AudioAttributes.Builder().build();
    private static final java.lang.String FIELD_CONTENT_TYPE = androidx.media3.common.util.Util.intToStringMaxRadix(0);
    private static final java.lang.String FIELD_FLAGS = androidx.media3.common.util.Util.intToStringMaxRadix(1);
    private static final java.lang.String FIELD_USAGE = androidx.media3.common.util.Util.intToStringMaxRadix(2);
    private static final java.lang.String FIELD_ALLOWED_CAPTURE_POLICY = androidx.media3.common.util.Util.intToStringMaxRadix(3);
    private static final java.lang.String FIELD_SPATIALIZATION_BEHAVIOR = androidx.media3.common.util.Util.intToStringMaxRadix(4);

    public static final class AudioAttributesV21 {
        public final android.media.AudioAttributes audioAttributes;

        private AudioAttributesV21(androidx.media3.common.AudioAttributes audioAttributes) {
            android.media.AudioAttributes.Builder usage = new android.media.AudioAttributes.Builder().setContentType(audioAttributes.contentType).setFlags(audioAttributes.flags).setUsage(audioAttributes.usage);
            if (androidx.media3.common.util.Util.SDK_INT >= 29) {
                androidx.media3.common.AudioAttributes.Api29.setAllowedCapturePolicy(usage, audioAttributes.allowedCapturePolicy);
            }
            if (androidx.media3.common.util.Util.SDK_INT >= 32) {
                androidx.media3.common.AudioAttributes.Api32.setSpatializationBehavior(usage, audioAttributes.spatializationBehavior);
            }
            this.audioAttributes = usage.build();
        }
    }

    public static final class Builder {
        private int contentType = 0;
        private int flags = 0;
        private int usage = 1;
        private int allowedCapturePolicy = 1;
        private int spatializationBehavior = 0;

        public androidx.media3.common.AudioAttributes.Builder setContentType(int i) {
            this.contentType = i;
            return this;
        }

        public androidx.media3.common.AudioAttributes.Builder setFlags(int i) {
            this.flags = i;
            return this;
        }

        public androidx.media3.common.AudioAttributes.Builder setUsage(int i) {
            this.usage = i;
            return this;
        }

        public androidx.media3.common.AudioAttributes.Builder setAllowedCapturePolicy(int i) {
            this.allowedCapturePolicy = i;
            return this;
        }

        public androidx.media3.common.AudioAttributes.Builder setSpatializationBehavior(int i) {
            this.spatializationBehavior = i;
            return this;
        }

        public androidx.media3.common.AudioAttributes build() {
            return new androidx.media3.common.AudioAttributes(this.contentType, this.flags, this.usage, this.allowedCapturePolicy, this.spatializationBehavior);
        }
    }

    private AudioAttributes(int i, int i2, int i3, int i4, int i5) {
        this.contentType = i;
        this.flags = i2;
        this.usage = i3;
        this.allowedCapturePolicy = i4;
        this.spatializationBehavior = i5;
    }

    public androidx.media3.common.AudioAttributes.AudioAttributesV21 getAudioAttributesV21() {
        if (this.audioAttributesV21 == null) {
            this.audioAttributesV21 = new androidx.media3.common.AudioAttributes.AudioAttributesV21();
        }
        return this.audioAttributesV21;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        androidx.media3.common.AudioAttributes audioAttributes = (androidx.media3.common.AudioAttributes) obj;
        return this.contentType == audioAttributes.contentType && this.flags == audioAttributes.flags && this.usage == audioAttributes.usage && this.allowedCapturePolicy == audioAttributes.allowedCapturePolicy && this.spatializationBehavior == audioAttributes.spatializationBehavior;
    }

    public int hashCode() {
        return ((((((((com.json.mediationsdk.logger.IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.contentType) * 31) + this.flags) * 31) + this.usage) * 31) + this.allowedCapturePolicy) * 31) + this.spatializationBehavior;
    }

    public android.os.Bundle toBundle() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt(FIELD_CONTENT_TYPE, this.contentType);
        bundle.putInt(FIELD_FLAGS, this.flags);
        bundle.putInt(FIELD_USAGE, this.usage);
        bundle.putInt(FIELD_ALLOWED_CAPTURE_POLICY, this.allowedCapturePolicy);
        bundle.putInt(FIELD_SPATIALIZATION_BEHAVIOR, this.spatializationBehavior);
        return bundle;
    }

    public static androidx.media3.common.AudioAttributes fromBundle(android.os.Bundle bundle) {
        androidx.media3.common.AudioAttributes.Builder builder = new androidx.media3.common.AudioAttributes.Builder();
        java.lang.String str = FIELD_CONTENT_TYPE;
        if (bundle.containsKey(str)) {
            builder.setContentType(bundle.getInt(str));
        }
        java.lang.String str2 = FIELD_FLAGS;
        if (bundle.containsKey(str2)) {
            builder.setFlags(bundle.getInt(str2));
        }
        java.lang.String str3 = FIELD_USAGE;
        if (bundle.containsKey(str3)) {
            builder.setUsage(bundle.getInt(str3));
        }
        java.lang.String str4 = FIELD_ALLOWED_CAPTURE_POLICY;
        if (bundle.containsKey(str4)) {
            builder.setAllowedCapturePolicy(bundle.getInt(str4));
        }
        java.lang.String str5 = FIELD_SPATIALIZATION_BEHAVIOR;
        if (bundle.containsKey(str5)) {
            builder.setSpatializationBehavior(bundle.getInt(str5));
        }
        return builder.build();
    }

    private static final class Api29 {
        private Api29() {
        }

        public static void setAllowedCapturePolicy(android.media.AudioAttributes.Builder builder, int i) {
            builder.setAllowedCapturePolicy(i);
        }
    }

    private static final class Api32 {
        private Api32() {
        }

        public static void setSpatializationBehavior(android.media.AudioAttributes.Builder builder, int i) {
            builder.setSpatializationBehavior(i);
        }
    }
}
