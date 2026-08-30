package androidx.media3.exoplayer.drm;

/* JADX INFO: loaded from: classes.dex */
public class DefaultDrmSessionManager implements androidx.media3.exoplayer.drm.DrmSessionManager {
    public static final long DEFAULT_SESSION_KEEPALIVE_MS = 300000;
    public static final int INITIAL_DRM_REQUEST_RETRY_COUNT = 3;
    public static final int MODE_DOWNLOAD = 2;
    public static final int MODE_PLAYBACK = 0;
    public static final int MODE_QUERY = 1;
    public static final int MODE_RELEASE = 3;
    public static final java.lang.String PLAYREADY_CUSTOM_DATA_KEY = "PRCustomData";
    private static final java.lang.String TAG = "DefaultDrmSessionMgr";
    private final androidx.media3.exoplayer.drm.MediaDrmCallback callback;
    private androidx.media3.exoplayer.drm.ExoMediaDrm exoMediaDrm;
    private final androidx.media3.exoplayer.drm.ExoMediaDrm.Provider exoMediaDrmProvider;
    private final java.util.Set<androidx.media3.exoplayer.drm.DefaultDrmSession> keepaliveSessions;
    private final java.util.HashMap<java.lang.String, java.lang.String> keyRequestParameters;
    private final androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy loadErrorHandlingPolicy;
    volatile androidx.media3.exoplayer.drm.DefaultDrmSessionManager.MediaDrmHandler mediaDrmHandler;
    private int mode;
    private final boolean multiSession;
    private androidx.media3.exoplayer.drm.DefaultDrmSession noMultiSessionDrmSession;
    private byte[] offlineLicenseKeySetId;
    private androidx.media3.exoplayer.drm.DefaultDrmSession placeholderDrmSession;
    private final boolean playClearSamplesWithoutKeys;
    private android.os.Handler playbackHandler;
    private android.os.Looper playbackLooper;
    private androidx.media3.exoplayer.analytics.PlayerId playerId;
    private final java.util.Set<androidx.media3.exoplayer.drm.DefaultDrmSessionManager.PreacquiredSessionReference> preacquiredSessionReferences;
    private int prepareCallsCount;
    private final androidx.media3.exoplayer.drm.DefaultDrmSessionManager.ProvisioningManagerImpl provisioningManagerImpl;
    private final androidx.media3.exoplayer.drm.DefaultDrmSessionManager.ReferenceCountListenerImpl referenceCountListener;
    private final long sessionKeepaliveMs;
    private final java.util.List<androidx.media3.exoplayer.drm.DefaultDrmSession> sessions;
    private final int[] useDrmSessionsForClearContentTrackTypes;
    private final java.util.UUID uuid;

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface Mode {
    }

    public static final class Builder {
        private boolean multiSession;
        private final java.util.HashMap<java.lang.String, java.lang.String> keyRequestParameters = new java.util.HashMap<>();
        private java.util.UUID uuid = androidx.media3.common.C.WIDEVINE_UUID;
        private androidx.media3.exoplayer.drm.ExoMediaDrm.Provider exoMediaDrmProvider = androidx.media3.exoplayer.drm.FrameworkMediaDrm.DEFAULT_PROVIDER;
        private int[] useDrmSessionsForClearContentTrackTypes = new int[0];
        private boolean playClearSamplesWithoutKeys = true;
        private androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy loadErrorHandlingPolicy = new androidx.media3.exoplayer.upstream.DefaultLoadErrorHandlingPolicy();
        private long sessionKeepaliveMs = 300000;

        public androidx.media3.exoplayer.drm.DefaultDrmSessionManager.Builder setKeyRequestParameters(java.util.Map<java.lang.String, java.lang.String> map) {
            this.keyRequestParameters.clear();
            if (map != null) {
                this.keyRequestParameters.putAll(map);
            }
            return this;
        }

        public androidx.media3.exoplayer.drm.DefaultDrmSessionManager.Builder setUuidAndExoMediaDrmProvider(java.util.UUID uuid, androidx.media3.exoplayer.drm.ExoMediaDrm.Provider provider) {
            this.uuid = (java.util.UUID) androidx.media3.common.util.Assertions.checkNotNull(uuid);
            this.exoMediaDrmProvider = (androidx.media3.exoplayer.drm.ExoMediaDrm.Provider) androidx.media3.common.util.Assertions.checkNotNull(provider);
            return this;
        }

        public androidx.media3.exoplayer.drm.DefaultDrmSessionManager.Builder setMultiSession(boolean z) {
            this.multiSession = z;
            return this;
        }

        public androidx.media3.exoplayer.drm.DefaultDrmSessionManager.Builder setUseDrmSessionsForClearContent(int... iArr) {
            for (int i : iArr) {
                boolean z = true;
                if (i != 2 && i != 1) {
                    z = false;
                }
                androidx.media3.common.util.Assertions.checkArgument(z);
            }
            this.useDrmSessionsForClearContentTrackTypes = (int[]) iArr.clone();
            return this;
        }

        public androidx.media3.exoplayer.drm.DefaultDrmSessionManager.Builder setPlayClearSamplesWithoutKeys(boolean z) {
            this.playClearSamplesWithoutKeys = z;
            return this;
        }

        public androidx.media3.exoplayer.drm.DefaultDrmSessionManager.Builder setLoadErrorHandlingPolicy(androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy loadErrorHandlingPolicy) {
            this.loadErrorHandlingPolicy = (androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy) androidx.media3.common.util.Assertions.checkNotNull(loadErrorHandlingPolicy);
            return this;
        }

        public androidx.media3.exoplayer.drm.DefaultDrmSessionManager.Builder setSessionKeepaliveMs(long j) {
            androidx.media3.common.util.Assertions.checkArgument(j > 0 || j == androidx.media3.common.C.TIME_UNSET);
            this.sessionKeepaliveMs = j;
            return this;
        }

        public androidx.media3.exoplayer.drm.DefaultDrmSessionManager build(androidx.media3.exoplayer.drm.MediaDrmCallback mediaDrmCallback) {
            return new androidx.media3.exoplayer.drm.DefaultDrmSessionManager(this.uuid, this.exoMediaDrmProvider, mediaDrmCallback, this.keyRequestParameters, this.multiSession, this.useDrmSessionsForClearContentTrackTypes, this.playClearSamplesWithoutKeys, this.loadErrorHandlingPolicy, this.sessionKeepaliveMs);
        }
    }

    public static final class MissingSchemeDataException extends java.lang.Exception {
        private MissingSchemeDataException(java.util.UUID uuid) {
            super("Media does not support uuid: " + uuid);
        }
    }

    private DefaultDrmSessionManager(java.util.UUID uuid, androidx.media3.exoplayer.drm.ExoMediaDrm.Provider provider, androidx.media3.exoplayer.drm.MediaDrmCallback mediaDrmCallback, java.util.HashMap<java.lang.String, java.lang.String> map, boolean z, int[] iArr, boolean z2, androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy loadErrorHandlingPolicy, long j) {
        androidx.media3.common.util.Assertions.checkNotNull(uuid);
        androidx.media3.common.util.Assertions.checkArgument(!androidx.media3.common.C.COMMON_PSSH_UUID.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.uuid = uuid;
        this.exoMediaDrmProvider = provider;
        this.callback = mediaDrmCallback;
        this.keyRequestParameters = map;
        this.multiSession = z;
        this.useDrmSessionsForClearContentTrackTypes = iArr;
        this.playClearSamplesWithoutKeys = z2;
        this.loadErrorHandlingPolicy = loadErrorHandlingPolicy;
        this.provisioningManagerImpl = new androidx.media3.exoplayer.drm.DefaultDrmSessionManager.ProvisioningManagerImpl();
        this.referenceCountListener = new androidx.media3.exoplayer.drm.DefaultDrmSessionManager.ReferenceCountListenerImpl();
        this.mode = 0;
        this.sessions = new java.util.ArrayList();
        this.preacquiredSessionReferences = com.google.common.collect.Sets.newIdentityHashSet();
        this.keepaliveSessions = com.google.common.collect.Sets.newIdentityHashSet();
        this.sessionKeepaliveMs = j;
    }

    public void setMode(int i, byte[] bArr) {
        androidx.media3.common.util.Assertions.checkState(this.sessions.isEmpty());
        if (i == 1 || i == 3) {
            androidx.media3.common.util.Assertions.checkNotNull(bArr);
        }
        this.mode = i;
        this.offlineLicenseKeySetId = bArr;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSessionManager
    public final void prepare() {
        verifyPlaybackThread(true);
        int i = this.prepareCallsCount;
        this.prepareCallsCount = i + 1;
        if (i != 0) {
            return;
        }
        if (this.exoMediaDrm == null) {
            androidx.media3.exoplayer.drm.ExoMediaDrm exoMediaDrmAcquireExoMediaDrm = this.exoMediaDrmProvider.acquireExoMediaDrm(this.uuid);
            this.exoMediaDrm = exoMediaDrmAcquireExoMediaDrm;
            exoMediaDrmAcquireExoMediaDrm.setOnEventListener(new androidx.media3.exoplayer.drm.DefaultDrmSessionManager.MediaDrmEventListener());
        } else if (this.sessionKeepaliveMs != androidx.media3.common.C.TIME_UNSET) {
            for (int i2 = 0; i2 < this.sessions.size(); i2++) {
                this.sessions.get(i2).acquire(null);
            }
        }
    }

    @Override // androidx.media3.exoplayer.drm.DrmSessionManager
    public final void release() {
        verifyPlaybackThread(true);
        int i = this.prepareCallsCount - 1;
        this.prepareCallsCount = i;
        if (i != 0) {
            return;
        }
        if (this.sessionKeepaliveMs != androidx.media3.common.C.TIME_UNSET) {
            java.util.ArrayList arrayList = new java.util.ArrayList(this.sessions);
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                ((androidx.media3.exoplayer.drm.DefaultDrmSession) arrayList.get(i2)).release(null);
            }
        }
        releaseAllPreacquiredSessions();
        maybeReleaseMediaDrm();
    }

    @Override // androidx.media3.exoplayer.drm.DrmSessionManager
    public void setPlayer(android.os.Looper looper, androidx.media3.exoplayer.analytics.PlayerId playerId) {
        initPlaybackLooper(looper);
        this.playerId = playerId;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSessionManager
    public androidx.media3.exoplayer.drm.DrmSessionManager.DrmSessionReference preacquireSession(androidx.media3.exoplayer.drm.DrmSessionEventListener.EventDispatcher eventDispatcher, androidx.media3.common.Format format) {
        androidx.media3.common.util.Assertions.checkState(this.prepareCallsCount > 0);
        androidx.media3.common.util.Assertions.checkStateNotNull(this.playbackLooper);
        androidx.media3.exoplayer.drm.DefaultDrmSessionManager.PreacquiredSessionReference preacquiredSessionReference = new androidx.media3.exoplayer.drm.DefaultDrmSessionManager.PreacquiredSessionReference(eventDispatcher);
        preacquiredSessionReference.acquire(format);
        return preacquiredSessionReference;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSessionManager
    public androidx.media3.exoplayer.drm.DrmSession acquireSession(androidx.media3.exoplayer.drm.DrmSessionEventListener.EventDispatcher eventDispatcher, androidx.media3.common.Format format) {
        verifyPlaybackThread(false);
        androidx.media3.common.util.Assertions.checkState(this.prepareCallsCount > 0);
        androidx.media3.common.util.Assertions.checkStateNotNull(this.playbackLooper);
        return acquireSession(this.playbackLooper, eventDispatcher, format, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public androidx.media3.exoplayer.drm.DrmSession acquireSession(android.os.Looper looper, androidx.media3.exoplayer.drm.DrmSessionEventListener.EventDispatcher eventDispatcher, androidx.media3.common.Format format, boolean z) {
        java.util.List<androidx.media3.common.DrmInitData.SchemeData> schemeDatas;
        maybeCreateMediaDrmHandler(looper);
        if (format.drmInitData == null) {
            return maybeAcquirePlaceholderSession(androidx.media3.common.MimeTypes.getTrackType(format.sampleMimeType), z);
        }
        androidx.media3.exoplayer.drm.DefaultDrmSession defaultDrmSessionCreateAndAcquireSessionWithRetry = null;
        java.lang.Object[] objArr = 0;
        if (this.offlineLicenseKeySetId == null) {
            schemeDatas = getSchemeDatas((androidx.media3.common.DrmInitData) androidx.media3.common.util.Assertions.checkNotNull(format.drmInitData), this.uuid, false);
            if (schemeDatas.isEmpty()) {
                androidx.media3.exoplayer.drm.DefaultDrmSessionManager.MissingSchemeDataException missingSchemeDataException = new androidx.media3.exoplayer.drm.DefaultDrmSessionManager.MissingSchemeDataException(this.uuid);
                androidx.media3.common.util.Log.e(TAG, "DRM error", missingSchemeDataException);
                if (eventDispatcher != null) {
                    eventDispatcher.drmSessionManagerError(missingSchemeDataException);
                }
                return new androidx.media3.exoplayer.drm.ErrorStateDrmSession(new androidx.media3.exoplayer.drm.DrmSession.DrmSessionException(missingSchemeDataException, 6003));
            }
        } else {
            schemeDatas = null;
        }
        if (!this.multiSession) {
            defaultDrmSessionCreateAndAcquireSessionWithRetry = this.noMultiSessionDrmSession;
        } else {
            for (androidx.media3.exoplayer.drm.DefaultDrmSession defaultDrmSession : this.sessions) {
                if (androidx.media3.common.util.Util.areEqual(defaultDrmSession.schemeDatas, schemeDatas)) {
                    defaultDrmSessionCreateAndAcquireSessionWithRetry = defaultDrmSession;
                    break;
                }
            }
        }
        if (defaultDrmSessionCreateAndAcquireSessionWithRetry == null) {
            defaultDrmSessionCreateAndAcquireSessionWithRetry = createAndAcquireSessionWithRetry(schemeDatas, false, eventDispatcher, z);
            if (!this.multiSession) {
                this.noMultiSessionDrmSession = defaultDrmSessionCreateAndAcquireSessionWithRetry;
            }
            this.sessions.add(defaultDrmSessionCreateAndAcquireSessionWithRetry);
        } else {
            defaultDrmSessionCreateAndAcquireSessionWithRetry.acquire(eventDispatcher);
        }
        return defaultDrmSessionCreateAndAcquireSessionWithRetry;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSessionManager
    public int getCryptoType(androidx.media3.common.Format format) {
        verifyPlaybackThread(false);
        int cryptoType = ((androidx.media3.exoplayer.drm.ExoMediaDrm) androidx.media3.common.util.Assertions.checkNotNull(this.exoMediaDrm)).getCryptoType();
        if (format.drmInitData == null) {
            if (androidx.media3.common.util.Util.linearSearch(this.useDrmSessionsForClearContentTrackTypes, androidx.media3.common.MimeTypes.getTrackType(format.sampleMimeType)) != -1) {
                return cryptoType;
            }
            return 0;
        }
        if (canAcquireSession(format.drmInitData)) {
            return cryptoType;
        }
        return 1;
    }

    private androidx.media3.exoplayer.drm.DrmSession maybeAcquirePlaceholderSession(int i, boolean z) {
        androidx.media3.exoplayer.drm.ExoMediaDrm exoMediaDrm = (androidx.media3.exoplayer.drm.ExoMediaDrm) androidx.media3.common.util.Assertions.checkNotNull(this.exoMediaDrm);
        if ((exoMediaDrm.getCryptoType() == 2 && androidx.media3.exoplayer.drm.FrameworkCryptoConfig.WORKAROUND_DEVICE_NEEDS_KEYS_TO_CONFIGURE_CODEC) || androidx.media3.common.util.Util.linearSearch(this.useDrmSessionsForClearContentTrackTypes, i) == -1 || exoMediaDrm.getCryptoType() == 1) {
            return null;
        }
        androidx.media3.exoplayer.drm.DefaultDrmSession defaultDrmSession = this.placeholderDrmSession;
        if (defaultDrmSession == null) {
            androidx.media3.exoplayer.drm.DefaultDrmSession defaultDrmSessionCreateAndAcquireSessionWithRetry = createAndAcquireSessionWithRetry(com.google.common.collect.ImmutableList.of(), true, null, z);
            this.sessions.add(defaultDrmSessionCreateAndAcquireSessionWithRetry);
            this.placeholderDrmSession = defaultDrmSessionCreateAndAcquireSessionWithRetry;
        } else {
            defaultDrmSession.acquire(null);
        }
        return this.placeholderDrmSession;
    }

    private boolean canAcquireSession(androidx.media3.common.DrmInitData drmInitData) {
        if (this.offlineLicenseKeySetId != null) {
            return true;
        }
        if (getSchemeDatas(drmInitData, this.uuid, true).isEmpty()) {
            if (drmInitData.schemeDataCount != 1 || !drmInitData.get(0).matches(androidx.media3.common.C.COMMON_PSSH_UUID)) {
                return false;
            }
            androidx.media3.common.util.Log.w(TAG, "DrmInitData only contains common PSSH SchemeData. Assuming support for: " + this.uuid);
        }
        java.lang.String str = drmInitData.schemeType;
        if (str == null || androidx.media3.common.C.CENC_TYPE_cenc.equals(str)) {
            return true;
        }
        if (androidx.media3.common.C.CENC_TYPE_cbcs.equals(str)) {
            return androidx.media3.common.util.Util.SDK_INT >= 25;
        }
        return (androidx.media3.common.C.CENC_TYPE_cbc1.equals(str) || androidx.media3.common.C.CENC_TYPE_cens.equals(str)) ? false : true;
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"this.playbackLooper", "this.playbackHandler"})
    private synchronized void initPlaybackLooper(android.os.Looper looper) {
        android.os.Looper looper2 = this.playbackLooper;
        if (looper2 == null) {
            this.playbackLooper = looper;
            this.playbackHandler = new android.os.Handler(looper);
        } else {
            androidx.media3.common.util.Assertions.checkState(looper2 == looper);
            androidx.media3.common.util.Assertions.checkNotNull(this.playbackHandler);
        }
    }

    private void maybeCreateMediaDrmHandler(android.os.Looper looper) {
        if (this.mediaDrmHandler == null) {
            this.mediaDrmHandler = new androidx.media3.exoplayer.drm.DefaultDrmSessionManager.MediaDrmHandler(looper);
        }
    }

    private androidx.media3.exoplayer.drm.DefaultDrmSession createAndAcquireSessionWithRetry(java.util.List<androidx.media3.common.DrmInitData.SchemeData> list, boolean z, androidx.media3.exoplayer.drm.DrmSessionEventListener.EventDispatcher eventDispatcher, boolean z2) {
        androidx.media3.exoplayer.drm.DefaultDrmSession defaultDrmSessionCreateAndAcquireSession = createAndAcquireSession(list, z, eventDispatcher);
        if (acquisitionFailedIndicatingResourceShortage(defaultDrmSessionCreateAndAcquireSession) && !this.keepaliveSessions.isEmpty()) {
            releaseAllKeepaliveSessions();
            undoAcquisition(defaultDrmSessionCreateAndAcquireSession, eventDispatcher);
            defaultDrmSessionCreateAndAcquireSession = createAndAcquireSession(list, z, eventDispatcher);
        }
        if (!acquisitionFailedIndicatingResourceShortage(defaultDrmSessionCreateAndAcquireSession) || !z2 || this.preacquiredSessionReferences.isEmpty()) {
            return defaultDrmSessionCreateAndAcquireSession;
        }
        releaseAllPreacquiredSessions();
        if (!this.keepaliveSessions.isEmpty()) {
            releaseAllKeepaliveSessions();
        }
        undoAcquisition(defaultDrmSessionCreateAndAcquireSession, eventDispatcher);
        return createAndAcquireSession(list, z, eventDispatcher);
    }

    private static boolean acquisitionFailedIndicatingResourceShortage(androidx.media3.exoplayer.drm.DrmSession drmSession) {
        if (drmSession.getState() != 1) {
            return false;
        }
        java.lang.Throwable cause = ((androidx.media3.exoplayer.drm.DrmSession.DrmSessionException) androidx.media3.common.util.Assertions.checkNotNull(drmSession.getError())).getCause();
        return (cause instanceof android.media.ResourceBusyException) || androidx.media3.exoplayer.drm.DrmUtil.isFailureToConstructResourceBusyException(cause);
    }

    private void undoAcquisition(androidx.media3.exoplayer.drm.DrmSession drmSession, androidx.media3.exoplayer.drm.DrmSessionEventListener.EventDispatcher eventDispatcher) {
        drmSession.release(eventDispatcher);
        if (this.sessionKeepaliveMs != androidx.media3.common.C.TIME_UNSET) {
            drmSession.release(null);
        }
    }

    private void releaseAllKeepaliveSessions() {
        com.google.common.collect.UnmodifiableIterator it = com.google.common.collect.ImmutableSet.copyOf((java.util.Collection) this.keepaliveSessions).iterator();
        while (it.hasNext()) {
            ((androidx.media3.exoplayer.drm.DrmSession) it.next()).release(null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void releaseAllPreacquiredSessions() {
        com.google.common.collect.UnmodifiableIterator it = com.google.common.collect.ImmutableSet.copyOf((java.util.Collection) this.preacquiredSessionReferences).iterator();
        while (it.hasNext()) {
            ((androidx.media3.exoplayer.drm.DefaultDrmSessionManager.PreacquiredSessionReference) it.next()).release();
        }
    }

    private androidx.media3.exoplayer.drm.DefaultDrmSession createAndAcquireSession(java.util.List<androidx.media3.common.DrmInitData.SchemeData> list, boolean z, androidx.media3.exoplayer.drm.DrmSessionEventListener.EventDispatcher eventDispatcher) {
        androidx.media3.common.util.Assertions.checkNotNull(this.exoMediaDrm);
        androidx.media3.exoplayer.drm.DefaultDrmSession defaultDrmSession = new androidx.media3.exoplayer.drm.DefaultDrmSession(this.uuid, this.exoMediaDrm, this.provisioningManagerImpl, this.referenceCountListener, list, this.mode, this.playClearSamplesWithoutKeys | z, z, this.offlineLicenseKeySetId, this.keyRequestParameters, this.callback, (android.os.Looper) androidx.media3.common.util.Assertions.checkNotNull(this.playbackLooper), this.loadErrorHandlingPolicy, (androidx.media3.exoplayer.analytics.PlayerId) androidx.media3.common.util.Assertions.checkNotNull(this.playerId));
        defaultDrmSession.acquire(eventDispatcher);
        if (this.sessionKeepaliveMs != androidx.media3.common.C.TIME_UNSET) {
            defaultDrmSession.acquire(null);
        }
        return defaultDrmSession;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void maybeReleaseMediaDrm() {
        if (this.exoMediaDrm != null && this.prepareCallsCount == 0 && this.sessions.isEmpty() && this.preacquiredSessionReferences.isEmpty()) {
            ((androidx.media3.exoplayer.drm.ExoMediaDrm) androidx.media3.common.util.Assertions.checkNotNull(this.exoMediaDrm)).release();
            this.exoMediaDrm = null;
        }
    }

    private void verifyPlaybackThread(boolean z) {
        if (z && this.playbackLooper == null) {
            androidx.media3.common.util.Log.w(TAG, "DefaultDrmSessionManager accessed before setPlayer(), possibly on the wrong thread.", new java.lang.IllegalStateException());
        } else if (java.lang.Thread.currentThread() != ((android.os.Looper) androidx.media3.common.util.Assertions.checkNotNull(this.playbackLooper)).getThread()) {
            androidx.media3.common.util.Log.w(TAG, "DefaultDrmSessionManager accessed on the wrong thread.\nCurrent thread: " + java.lang.Thread.currentThread().getName() + "\nExpected thread: " + this.playbackLooper.getThread().getName(), new java.lang.IllegalStateException());
        }
    }

    private static java.util.List<androidx.media3.common.DrmInitData.SchemeData> getSchemeDatas(androidx.media3.common.DrmInitData drmInitData, java.util.UUID uuid, boolean z) {
        java.util.ArrayList arrayList = new java.util.ArrayList(drmInitData.schemeDataCount);
        for (int i = 0; i < drmInitData.schemeDataCount; i++) {
            androidx.media3.common.DrmInitData.SchemeData schemeData = drmInitData.get(i);
            if ((schemeData.matches(uuid) || (androidx.media3.common.C.CLEARKEY_UUID.equals(uuid) && schemeData.matches(androidx.media3.common.C.COMMON_PSSH_UUID))) && (schemeData.data != null || z)) {
                arrayList.add(schemeData);
            }
        }
        return arrayList;
    }

    private class MediaDrmHandler extends android.os.Handler {
        public MediaDrmHandler(android.os.Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(android.os.Message message) {
            byte[] bArr = (byte[]) message.obj;
            if (bArr == null) {
                return;
            }
            for (androidx.media3.exoplayer.drm.DefaultDrmSession defaultDrmSession : androidx.media3.exoplayer.drm.DefaultDrmSessionManager.this.sessions) {
                if (defaultDrmSession.hasSessionId(bArr)) {
                    defaultDrmSession.onMediaDrmEvent(message.what);
                    return;
                }
            }
        }
    }

    private class ProvisioningManagerImpl implements androidx.media3.exoplayer.drm.DefaultDrmSession.ProvisioningManager {
        private androidx.media3.exoplayer.drm.DefaultDrmSession provisioningSession;
        private final java.util.Set<androidx.media3.exoplayer.drm.DefaultDrmSession> sessionsAwaitingProvisioning = new java.util.HashSet();

        public ProvisioningManagerImpl() {
        }

        @Override // androidx.media3.exoplayer.drm.DefaultDrmSession.ProvisioningManager
        public void provisionRequired(androidx.media3.exoplayer.drm.DefaultDrmSession defaultDrmSession) {
            this.sessionsAwaitingProvisioning.add(defaultDrmSession);
            if (this.provisioningSession != null) {
                return;
            }
            this.provisioningSession = defaultDrmSession;
            defaultDrmSession.provision();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.media3.exoplayer.drm.DefaultDrmSession.ProvisioningManager
        public void onProvisionCompleted() {
            this.provisioningSession = null;
            com.google.common.collect.ImmutableList immutableListCopyOf = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) this.sessionsAwaitingProvisioning);
            this.sessionsAwaitingProvisioning.clear();
            com.google.common.collect.UnmodifiableIterator it = immutableListCopyOf.iterator();
            while (it.hasNext()) {
                ((androidx.media3.exoplayer.drm.DefaultDrmSession) it.next()).onProvisionCompleted();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.media3.exoplayer.drm.DefaultDrmSession.ProvisioningManager
        public void onProvisionError(java.lang.Exception exc, boolean z) {
            this.provisioningSession = null;
            com.google.common.collect.ImmutableList immutableListCopyOf = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) this.sessionsAwaitingProvisioning);
            this.sessionsAwaitingProvisioning.clear();
            com.google.common.collect.UnmodifiableIterator it = immutableListCopyOf.iterator();
            while (it.hasNext()) {
                ((androidx.media3.exoplayer.drm.DefaultDrmSession) it.next()).onProvisionError(exc, z);
            }
        }

        public void onSessionFullyReleased(androidx.media3.exoplayer.drm.DefaultDrmSession defaultDrmSession) {
            this.sessionsAwaitingProvisioning.remove(defaultDrmSession);
            if (this.provisioningSession == defaultDrmSession) {
                this.provisioningSession = null;
                if (this.sessionsAwaitingProvisioning.isEmpty()) {
                    return;
                }
                androidx.media3.exoplayer.drm.DefaultDrmSession next = this.sessionsAwaitingProvisioning.iterator().next();
                this.provisioningSession = next;
                next.provision();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    class ReferenceCountListenerImpl implements androidx.media3.exoplayer.drm.DefaultDrmSession.ReferenceCountListener {
        private ReferenceCountListenerImpl() {
        }

        @Override // androidx.media3.exoplayer.drm.DefaultDrmSession.ReferenceCountListener
        public void onReferenceCountIncremented(androidx.media3.exoplayer.drm.DefaultDrmSession defaultDrmSession, int i) {
            if (androidx.media3.exoplayer.drm.DefaultDrmSessionManager.this.sessionKeepaliveMs != androidx.media3.common.C.TIME_UNSET) {
                androidx.media3.exoplayer.drm.DefaultDrmSessionManager.this.keepaliveSessions.remove(defaultDrmSession);
                ((android.os.Handler) androidx.media3.common.util.Assertions.checkNotNull(androidx.media3.exoplayer.drm.DefaultDrmSessionManager.this.playbackHandler)).removeCallbacksAndMessages(defaultDrmSession);
            }
        }

        @Override // androidx.media3.exoplayer.drm.DefaultDrmSession.ReferenceCountListener
        public void onReferenceCountDecremented(final androidx.media3.exoplayer.drm.DefaultDrmSession defaultDrmSession, int i) {
            if (i == 1 && androidx.media3.exoplayer.drm.DefaultDrmSessionManager.this.prepareCallsCount > 0 && androidx.media3.exoplayer.drm.DefaultDrmSessionManager.this.sessionKeepaliveMs != androidx.media3.common.C.TIME_UNSET) {
                androidx.media3.exoplayer.drm.DefaultDrmSessionManager.this.keepaliveSessions.add(defaultDrmSession);
                ((android.os.Handler) androidx.media3.common.util.Assertions.checkNotNull(androidx.media3.exoplayer.drm.DefaultDrmSessionManager.this.playbackHandler)).postAtTime(new java.lang.Runnable() { // from class: androidx.media3.exoplayer.drm.DefaultDrmSessionManager$ReferenceCountListenerImpl$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        defaultDrmSession.release(null);
                    }
                }, defaultDrmSession, android.os.SystemClock.uptimeMillis() + androidx.media3.exoplayer.drm.DefaultDrmSessionManager.this.sessionKeepaliveMs);
            } else if (i == 0) {
                androidx.media3.exoplayer.drm.DefaultDrmSessionManager.this.sessions.remove(defaultDrmSession);
                if (androidx.media3.exoplayer.drm.DefaultDrmSessionManager.this.placeholderDrmSession == defaultDrmSession) {
                    androidx.media3.exoplayer.drm.DefaultDrmSessionManager.this.placeholderDrmSession = null;
                }
                if (androidx.media3.exoplayer.drm.DefaultDrmSessionManager.this.noMultiSessionDrmSession == defaultDrmSession) {
                    androidx.media3.exoplayer.drm.DefaultDrmSessionManager.this.noMultiSessionDrmSession = null;
                }
                androidx.media3.exoplayer.drm.DefaultDrmSessionManager.this.provisioningManagerImpl.onSessionFullyReleased(defaultDrmSession);
                if (androidx.media3.exoplayer.drm.DefaultDrmSessionManager.this.sessionKeepaliveMs != androidx.media3.common.C.TIME_UNSET) {
                    ((android.os.Handler) androidx.media3.common.util.Assertions.checkNotNull(androidx.media3.exoplayer.drm.DefaultDrmSessionManager.this.playbackHandler)).removeCallbacksAndMessages(defaultDrmSession);
                    androidx.media3.exoplayer.drm.DefaultDrmSessionManager.this.keepaliveSessions.remove(defaultDrmSession);
                }
            }
            androidx.media3.exoplayer.drm.DefaultDrmSessionManager.this.maybeReleaseMediaDrm();
        }
    }

    private class MediaDrmEventListener implements androidx.media3.exoplayer.drm.ExoMediaDrm.OnEventListener {
        private MediaDrmEventListener() {
        }

        @Override // androidx.media3.exoplayer.drm.ExoMediaDrm.OnEventListener
        public void onEvent(androidx.media3.exoplayer.drm.ExoMediaDrm exoMediaDrm, byte[] bArr, int i, int i2, byte[] bArr2) {
            ((androidx.media3.exoplayer.drm.DefaultDrmSessionManager.MediaDrmHandler) androidx.media3.common.util.Assertions.checkNotNull(androidx.media3.exoplayer.drm.DefaultDrmSessionManager.this.mediaDrmHandler)).obtainMessage(i, bArr).sendToTarget();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    class PreacquiredSessionReference implements androidx.media3.exoplayer.drm.DrmSessionManager.DrmSessionReference {
        private final androidx.media3.exoplayer.drm.DrmSessionEventListener.EventDispatcher eventDispatcher;
        private boolean isReleased;
        private androidx.media3.exoplayer.drm.DrmSession session;

        public PreacquiredSessionReference(androidx.media3.exoplayer.drm.DrmSessionEventListener.EventDispatcher eventDispatcher) {
            this.eventDispatcher = eventDispatcher;
        }

        public void acquire(final androidx.media3.common.Format format) {
            ((android.os.Handler) androidx.media3.common.util.Assertions.checkNotNull(androidx.media3.exoplayer.drm.DefaultDrmSessionManager.this.playbackHandler)).post(new java.lang.Runnable() { // from class: androidx.media3.exoplayer.drm.DefaultDrmSessionManager$PreacquiredSessionReference$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m152x937f548e(format);
                }
            });
        }

        /* JADX INFO: renamed from: lambda$acquire$0$androidx-media3-exoplayer-drm-DefaultDrmSessionManager$PreacquiredSessionReference, reason: not valid java name */
        /* synthetic */ void m152x937f548e(androidx.media3.common.Format format) {
            if (androidx.media3.exoplayer.drm.DefaultDrmSessionManager.this.prepareCallsCount == 0 || this.isReleased) {
                return;
            }
            androidx.media3.exoplayer.drm.DefaultDrmSessionManager defaultDrmSessionManager = androidx.media3.exoplayer.drm.DefaultDrmSessionManager.this;
            this.session = defaultDrmSessionManager.acquireSession((android.os.Looper) androidx.media3.common.util.Assertions.checkNotNull(defaultDrmSessionManager.playbackLooper), this.eventDispatcher, format, false);
            androidx.media3.exoplayer.drm.DefaultDrmSessionManager.this.preacquiredSessionReferences.add(this);
        }

        @Override // androidx.media3.exoplayer.drm.DrmSessionManager.DrmSessionReference
        public void release() {
            androidx.media3.common.util.Util.postOrRun((android.os.Handler) androidx.media3.common.util.Assertions.checkNotNull(androidx.media3.exoplayer.drm.DefaultDrmSessionManager.this.playbackHandler), new java.lang.Runnable() { // from class: androidx.media3.exoplayer.drm.DefaultDrmSessionManager$PreacquiredSessionReference$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m153xce10c5c();
                }
            });
        }

        /* JADX INFO: renamed from: lambda$release$1$androidx-media3-exoplayer-drm-DefaultDrmSessionManager$PreacquiredSessionReference, reason: not valid java name */
        /* synthetic */ void m153xce10c5c() {
            if (this.isReleased) {
                return;
            }
            androidx.media3.exoplayer.drm.DrmSession drmSession = this.session;
            if (drmSession != null) {
                drmSession.release(this.eventDispatcher);
            }
            androidx.media3.exoplayer.drm.DefaultDrmSessionManager.this.preacquiredSessionReferences.remove(this);
            this.isReleased = true;
        }
    }
}
