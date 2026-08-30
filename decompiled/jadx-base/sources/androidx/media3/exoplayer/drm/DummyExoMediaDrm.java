package androidx.media3.exoplayer.drm;

/* JADX INFO: loaded from: classes.dex */
public final class DummyExoMediaDrm implements androidx.media3.exoplayer.drm.ExoMediaDrm {
    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public void acquire() {
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public void closeSession(byte[] bArr) {
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public int getCryptoType() {
        return 1;
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public android.os.PersistableBundle getMetrics() {
        return null;
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public java.lang.String getPropertyString(java.lang.String str) {
        return "";
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public void release() {
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public void setOnEventListener(androidx.media3.exoplayer.drm.ExoMediaDrm.OnEventListener onEventListener) {
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public void setOnExpirationUpdateListener(androidx.media3.exoplayer.drm.ExoMediaDrm.OnExpirationUpdateListener onExpirationUpdateListener) {
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public void setOnKeyStatusChangeListener(androidx.media3.exoplayer.drm.ExoMediaDrm.OnKeyStatusChangeListener onKeyStatusChangeListener) {
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public void setPropertyByteArray(java.lang.String str, byte[] bArr) {
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public void setPropertyString(java.lang.String str, java.lang.String str2) {
    }

    public static androidx.media3.exoplayer.drm.DummyExoMediaDrm getInstance() {
        return new androidx.media3.exoplayer.drm.DummyExoMediaDrm();
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public byte[] openSession() throws android.media.MediaDrmException {
        throw new android.media.MediaDrmException("Attempting to open a session using a dummy ExoMediaDrm.");
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public androidx.media3.exoplayer.drm.ExoMediaDrm.KeyRequest getKeyRequest(byte[] bArr, java.util.List<androidx.media3.common.DrmInitData.SchemeData> list, int i, java.util.HashMap<java.lang.String, java.lang.String> map) {
        throw new java.lang.IllegalStateException();
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public byte[] provideKeyResponse(byte[] bArr, byte[] bArr2) {
        throw new java.lang.IllegalStateException();
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public androidx.media3.exoplayer.drm.ExoMediaDrm.ProvisionRequest getProvisionRequest() {
        throw new java.lang.IllegalStateException();
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public void provideProvisionResponse(byte[] bArr) {
        throw new java.lang.IllegalStateException();
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public java.util.Map<java.lang.String, java.lang.String> queryKeyStatus(byte[] bArr) {
        throw new java.lang.IllegalStateException();
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public boolean requiresSecureDecoder(byte[] bArr, java.lang.String str) {
        throw new java.lang.IllegalStateException();
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public void restoreKeys(byte[] bArr, byte[] bArr2) {
        throw new java.lang.IllegalStateException();
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public byte[] getPropertyByteArray(java.lang.String str) {
        return androidx.media3.common.util.Util.EMPTY_BYTE_ARRAY;
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public androidx.media3.decoder.CryptoConfig createCryptoConfig(byte[] bArr) {
        throw new java.lang.IllegalStateException();
    }
}
