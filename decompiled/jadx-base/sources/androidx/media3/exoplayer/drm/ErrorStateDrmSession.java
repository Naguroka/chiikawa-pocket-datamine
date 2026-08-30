package androidx.media3.exoplayer.drm;

/* JADX INFO: loaded from: classes.dex */
public final class ErrorStateDrmSession implements androidx.media3.exoplayer.drm.DrmSession {
    private final androidx.media3.exoplayer.drm.DrmSession.DrmSessionException error;

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public void acquire(androidx.media3.exoplayer.drm.DrmSessionEventListener.EventDispatcher eventDispatcher) {
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public androidx.media3.decoder.CryptoConfig getCryptoConfig() {
        return null;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public byte[] getOfflineLicenseKeySetId() {
        return null;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public int getState() {
        return 1;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public boolean playClearSamplesWithoutKeys() {
        return false;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public java.util.Map<java.lang.String, java.lang.String> queryKeyStatus() {
        return null;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public void release(androidx.media3.exoplayer.drm.DrmSessionEventListener.EventDispatcher eventDispatcher) {
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public boolean requiresSecureDecoder(java.lang.String str) {
        return false;
    }

    public ErrorStateDrmSession(androidx.media3.exoplayer.drm.DrmSession.DrmSessionException drmSessionException) {
        this.error = (androidx.media3.exoplayer.drm.DrmSession.DrmSessionException) androidx.media3.common.util.Assertions.checkNotNull(drmSessionException);
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public androidx.media3.exoplayer.drm.DrmSession.DrmSessionException getError() {
        return this.error;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public final java.util.UUID getSchemeUuid() {
        return androidx.media3.common.C.UUID_NIL;
    }
}
