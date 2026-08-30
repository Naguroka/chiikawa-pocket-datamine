package androidx.media3.exoplayer.drm;

/* JADX INFO: loaded from: classes.dex */
public final class LocalMediaDrmCallback implements androidx.media3.exoplayer.drm.MediaDrmCallback {
    private final byte[] keyResponse;

    public LocalMediaDrmCallback(byte[] bArr) {
        this.keyResponse = (byte[]) androidx.media3.common.util.Assertions.checkNotNull(bArr);
    }

    @Override // androidx.media3.exoplayer.drm.MediaDrmCallback
    public byte[] executeProvisionRequest(java.util.UUID uuid, androidx.media3.exoplayer.drm.ExoMediaDrm.ProvisionRequest provisionRequest) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // androidx.media3.exoplayer.drm.MediaDrmCallback
    public byte[] executeKeyRequest(java.util.UUID uuid, androidx.media3.exoplayer.drm.ExoMediaDrm.KeyRequest keyRequest) {
        return this.keyResponse;
    }
}
