package androidx.media3.exoplayer.drm;

/* JADX INFO: loaded from: classes.dex */
public final class FrameworkCryptoConfig implements androidx.media3.decoder.CryptoConfig {
    public static final boolean WORKAROUND_DEVICE_NEEDS_KEYS_TO_CONFIGURE_CODEC;

    @java.lang.Deprecated
    public final boolean forceAllowInsecureDecoderComponents;
    public final byte[] sessionId;
    public final java.util.UUID uuid;

    static {
        WORKAROUND_DEVICE_NEEDS_KEYS_TO_CONFIGURE_CODEC = "Amazon".equals(androidx.media3.common.util.Util.MANUFACTURER) && ("AFTM".equals(androidx.media3.common.util.Util.MODEL) || "AFTB".equals(androidx.media3.common.util.Util.MODEL));
    }

    public FrameworkCryptoConfig(java.util.UUID uuid, byte[] bArr, boolean z) {
        this.uuid = uuid;
        this.sessionId = bArr;
        this.forceAllowInsecureDecoderComponents = z;
    }
}
