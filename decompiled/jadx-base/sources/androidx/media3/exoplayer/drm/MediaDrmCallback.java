package androidx.media3.exoplayer.drm;

/* JADX INFO: loaded from: classes.dex */
public interface MediaDrmCallback {
    byte[] executeKeyRequest(java.util.UUID uuid, androidx.media3.exoplayer.drm.ExoMediaDrm.KeyRequest keyRequest) throws androidx.media3.exoplayer.drm.MediaDrmCallbackException;

    byte[] executeProvisionRequest(java.util.UUID uuid, androidx.media3.exoplayer.drm.ExoMediaDrm.ProvisionRequest provisionRequest) throws androidx.media3.exoplayer.drm.MediaDrmCallbackException;
}
