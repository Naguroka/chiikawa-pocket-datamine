package androidx.media3.exoplayer.drm;

/* JADX INFO: loaded from: classes.dex */
public interface DrmSessionManager {
    public static final androidx.media3.exoplayer.drm.DrmSessionManager DRM_UNSUPPORTED = new androidx.media3.exoplayer.drm.DrmSessionManager() { // from class: androidx.media3.exoplayer.drm.DrmSessionManager.1
        @Override // androidx.media3.exoplayer.drm.DrmSessionManager
        public void setPlayer(android.os.Looper looper, androidx.media3.exoplayer.analytics.PlayerId playerId) {
        }

        @Override // androidx.media3.exoplayer.drm.DrmSessionManager
        public androidx.media3.exoplayer.drm.DrmSession acquireSession(androidx.media3.exoplayer.drm.DrmSessionEventListener.EventDispatcher eventDispatcher, androidx.media3.common.Format format) {
            if (format.drmInitData == null) {
                return null;
            }
            return new androidx.media3.exoplayer.drm.ErrorStateDrmSession(new androidx.media3.exoplayer.drm.DrmSession.DrmSessionException(new androidx.media3.exoplayer.drm.UnsupportedDrmException(1), 6001));
        }

        @Override // androidx.media3.exoplayer.drm.DrmSessionManager
        public int getCryptoType(androidx.media3.common.Format format) {
            return format.drmInitData != null ? 1 : 0;
        }
    };

    public interface DrmSessionReference {
        public static final androidx.media3.exoplayer.drm.DrmSessionManager.DrmSessionReference EMPTY = new androidx.media3.exoplayer.drm.DrmSessionManager.DrmSessionReference() { // from class: androidx.media3.exoplayer.drm.DrmSessionManager$DrmSessionReference$$ExternalSyntheticLambda0
            @Override // androidx.media3.exoplayer.drm.DrmSessionManager.DrmSessionReference
            public final void release() {
                androidx.media3.exoplayer.drm.DrmSessionManager.DrmSessionReference.lambda$static$0();
            }
        };

        static /* synthetic */ void lambda$static$0() {
        }

        void release();
    }

    androidx.media3.exoplayer.drm.DrmSession acquireSession(androidx.media3.exoplayer.drm.DrmSessionEventListener.EventDispatcher eventDispatcher, androidx.media3.common.Format format);

    int getCryptoType(androidx.media3.common.Format format);

    default void prepare() {
    }

    default void release() {
    }

    void setPlayer(android.os.Looper looper, androidx.media3.exoplayer.analytics.PlayerId playerId);

    default androidx.media3.exoplayer.drm.DrmSessionManager.DrmSessionReference preacquireSession(androidx.media3.exoplayer.drm.DrmSessionEventListener.EventDispatcher eventDispatcher, androidx.media3.common.Format format) {
        return androidx.media3.exoplayer.drm.DrmSessionManager.DrmSessionReference.EMPTY;
    }
}
