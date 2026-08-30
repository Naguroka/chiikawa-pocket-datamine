package androidx.media3.exoplayer.drm;

/* JADX INFO: loaded from: classes.dex */
class DefaultDrmSession implements androidx.media3.exoplayer.drm.DrmSession {
    private static final int MAX_LICENSE_DURATION_TO_RENEW_SECONDS = 60;
    private static final int MSG_KEYS = 2;
    private static final int MSG_PROVISION = 1;
    private static final java.lang.String TAG = "DefaultDrmSession";
    private final androidx.media3.exoplayer.drm.MediaDrmCallback callback;
    private androidx.media3.decoder.CryptoConfig cryptoConfig;
    private androidx.media3.exoplayer.drm.ExoMediaDrm.KeyRequest currentKeyRequest;
    private androidx.media3.exoplayer.drm.ExoMediaDrm.ProvisionRequest currentProvisionRequest;
    private final androidx.media3.common.util.CopyOnWriteMultiset<androidx.media3.exoplayer.drm.DrmSessionEventListener.EventDispatcher> eventDispatchers;
    private final boolean isPlaceholderSession;
    private final java.util.HashMap<java.lang.String, java.lang.String> keyRequestParameters;
    private androidx.media3.exoplayer.drm.DrmSession.DrmSessionException lastException;
    private final androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy loadErrorHandlingPolicy;
    private final androidx.media3.exoplayer.drm.ExoMediaDrm mediaDrm;
    private final int mode;
    private byte[] offlineLicenseKeySetId;
    private final boolean playClearSamplesWithoutKeys;
    private final android.os.Looper playbackLooper;
    private final androidx.media3.exoplayer.analytics.PlayerId playerId;
    private final androidx.media3.exoplayer.drm.DefaultDrmSession.ProvisioningManager provisioningManager;
    private int referenceCount;
    private final androidx.media3.exoplayer.drm.DefaultDrmSession.ReferenceCountListener referenceCountListener;
    private androidx.media3.exoplayer.drm.DefaultDrmSession.RequestHandler requestHandler;
    private android.os.HandlerThread requestHandlerThread;
    private final androidx.media3.exoplayer.drm.DefaultDrmSession.ResponseHandler responseHandler;
    public final java.util.List<androidx.media3.common.DrmInitData.SchemeData> schemeDatas;
    private byte[] sessionId;
    private int state;
    private final java.util.UUID uuid;

    public interface ProvisioningManager {
        void onProvisionCompleted();

        void onProvisionError(java.lang.Exception exc, boolean z);

        void provisionRequired(androidx.media3.exoplayer.drm.DefaultDrmSession defaultDrmSession);
    }

    public interface ReferenceCountListener {
        void onReferenceCountDecremented(androidx.media3.exoplayer.drm.DefaultDrmSession defaultDrmSession, int i);

        void onReferenceCountIncremented(androidx.media3.exoplayer.drm.DefaultDrmSession defaultDrmSession, int i);
    }

    public static final class UnexpectedDrmSessionException extends java.io.IOException {
        public UnexpectedDrmSessionException(java.lang.Throwable th) {
            super(th);
        }
    }

    public DefaultDrmSession(java.util.UUID uuid, androidx.media3.exoplayer.drm.ExoMediaDrm exoMediaDrm, androidx.media3.exoplayer.drm.DefaultDrmSession.ProvisioningManager provisioningManager, androidx.media3.exoplayer.drm.DefaultDrmSession.ReferenceCountListener referenceCountListener, java.util.List<androidx.media3.common.DrmInitData.SchemeData> list, int i, boolean z, boolean z2, byte[] bArr, java.util.HashMap<java.lang.String, java.lang.String> map, androidx.media3.exoplayer.drm.MediaDrmCallback mediaDrmCallback, android.os.Looper looper, androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy loadErrorHandlingPolicy, androidx.media3.exoplayer.analytics.PlayerId playerId) {
        if (i == 1 || i == 3) {
            androidx.media3.common.util.Assertions.checkNotNull(bArr);
        }
        this.uuid = uuid;
        this.provisioningManager = provisioningManager;
        this.referenceCountListener = referenceCountListener;
        this.mediaDrm = exoMediaDrm;
        this.mode = i;
        this.playClearSamplesWithoutKeys = z;
        this.isPlaceholderSession = z2;
        if (bArr != null) {
            this.offlineLicenseKeySetId = bArr;
            this.schemeDatas = null;
        } else {
            this.schemeDatas = java.util.Collections.unmodifiableList((java.util.List) androidx.media3.common.util.Assertions.checkNotNull(list));
        }
        this.keyRequestParameters = map;
        this.callback = mediaDrmCallback;
        this.eventDispatchers = new androidx.media3.common.util.CopyOnWriteMultiset<>();
        this.loadErrorHandlingPolicy = loadErrorHandlingPolicy;
        this.playerId = playerId;
        this.state = 2;
        this.playbackLooper = looper;
        this.responseHandler = new androidx.media3.exoplayer.drm.DefaultDrmSession.ResponseHandler(looper);
    }

    public boolean hasSessionId(byte[] bArr) {
        verifyPlaybackThread();
        return java.util.Arrays.equals(this.sessionId, bArr);
    }

    void onMediaDrmEvent(int i) {
        if (i != 2) {
            return;
        }
        onKeysRequired();
    }

    void provision() {
        this.currentProvisionRequest = this.mediaDrm.getProvisionRequest();
        ((androidx.media3.exoplayer.drm.DefaultDrmSession.RequestHandler) androidx.media3.common.util.Util.castNonNull(this.requestHandler)).post(1, androidx.media3.common.util.Assertions.checkNotNull(this.currentProvisionRequest), true);
    }

    void onProvisionCompleted() {
        if (openInternal()) {
            doLicense(true);
        }
    }

    void onProvisionError(java.lang.Exception exc, boolean z) {
        onError(exc, z ? 1 : 3);
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public final int getState() {
        verifyPlaybackThread();
        return this.state;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public boolean playClearSamplesWithoutKeys() {
        verifyPlaybackThread();
        return this.playClearSamplesWithoutKeys;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public final androidx.media3.exoplayer.drm.DrmSession.DrmSessionException getError() {
        verifyPlaybackThread();
        if (this.state == 1) {
            return this.lastException;
        }
        return null;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public final java.util.UUID getSchemeUuid() {
        verifyPlaybackThread();
        return this.uuid;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public final androidx.media3.decoder.CryptoConfig getCryptoConfig() {
        verifyPlaybackThread();
        return this.cryptoConfig;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public java.util.Map<java.lang.String, java.lang.String> queryKeyStatus() {
        verifyPlaybackThread();
        byte[] bArr = this.sessionId;
        if (bArr == null) {
            return null;
        }
        return this.mediaDrm.queryKeyStatus(bArr);
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public byte[] getOfflineLicenseKeySetId() {
        verifyPlaybackThread();
        return this.offlineLicenseKeySetId;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public boolean requiresSecureDecoder(java.lang.String str) {
        verifyPlaybackThread();
        return this.mediaDrm.requiresSecureDecoder((byte[]) androidx.media3.common.util.Assertions.checkStateNotNull(this.sessionId), str);
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public void acquire(androidx.media3.exoplayer.drm.DrmSessionEventListener.EventDispatcher eventDispatcher) {
        verifyPlaybackThread();
        if (this.referenceCount < 0) {
            androidx.media3.common.util.Log.e(TAG, "Session reference count less than zero: " + this.referenceCount);
            this.referenceCount = 0;
        }
        if (eventDispatcher != null) {
            this.eventDispatchers.add(eventDispatcher);
        }
        int i = this.referenceCount + 1;
        this.referenceCount = i;
        if (i == 1) {
            androidx.media3.common.util.Assertions.checkState(this.state == 2);
            android.os.HandlerThread handlerThread = new android.os.HandlerThread("ExoPlayer:DrmRequestHandler");
            this.requestHandlerThread = handlerThread;
            handlerThread.start();
            this.requestHandler = new androidx.media3.exoplayer.drm.DefaultDrmSession.RequestHandler(this.requestHandlerThread.getLooper());
            if (openInternal()) {
                doLicense(true);
            }
        } else if (eventDispatcher != null && isOpen() && this.eventDispatchers.count(eventDispatcher) == 1) {
            eventDispatcher.drmSessionAcquired(this.state);
        }
        this.referenceCountListener.onReferenceCountIncremented(this, this.referenceCount);
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public void release(androidx.media3.exoplayer.drm.DrmSessionEventListener.EventDispatcher eventDispatcher) {
        verifyPlaybackThread();
        int i = this.referenceCount;
        if (i <= 0) {
            androidx.media3.common.util.Log.e(TAG, "release() called on a session that's already fully released.");
            return;
        }
        int i2 = i - 1;
        this.referenceCount = i2;
        if (i2 == 0) {
            this.state = 0;
            ((androidx.media3.exoplayer.drm.DefaultDrmSession.ResponseHandler) androidx.media3.common.util.Util.castNonNull(this.responseHandler)).removeCallbacksAndMessages(null);
            ((androidx.media3.exoplayer.drm.DefaultDrmSession.RequestHandler) androidx.media3.common.util.Util.castNonNull(this.requestHandler)).release();
            this.requestHandler = null;
            ((android.os.HandlerThread) androidx.media3.common.util.Util.castNonNull(this.requestHandlerThread)).quit();
            this.requestHandlerThread = null;
            this.cryptoConfig = null;
            this.lastException = null;
            this.currentKeyRequest = null;
            this.currentProvisionRequest = null;
            byte[] bArr = this.sessionId;
            if (bArr != null) {
                this.mediaDrm.closeSession(bArr);
                this.sessionId = null;
            }
        }
        if (eventDispatcher != null) {
            this.eventDispatchers.remove(eventDispatcher);
            if (this.eventDispatchers.count(eventDispatcher) == 0) {
                eventDispatcher.drmSessionReleased();
            }
        }
        this.referenceCountListener.onReferenceCountDecremented(this, this.referenceCount);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003b  */
    /* JADX WARN: Code duplicated, block: B:13:0x0041  */
    @org.checkerframework.checker.nullness.qual.EnsuresNonNullIf(expression = {com.unity3d.services.core.device.reader.JsonStorageKeyNames.SESSION_ID_KEY}, result = true)
    private boolean openInternal() {
        if (isOpen()) {
            return true;
        }
        try {
            byte[] bArrOpenSession = this.mediaDrm.openSession();
            this.sessionId = bArrOpenSession;
            this.mediaDrm.setPlayerIdForSession(bArrOpenSession, this.playerId);
            this.cryptoConfig = this.mediaDrm.createCryptoConfig(this.sessionId);
            final int i = 3;
            this.state = 3;
            dispatchEvent(new androidx.media3.common.util.Consumer() { // from class: androidx.media3.exoplayer.drm.DefaultDrmSession$$ExternalSyntheticLambda1
                @Override // androidx.media3.common.util.Consumer
                public final void accept(java.lang.Object obj) {
                    ((androidx.media3.exoplayer.drm.DrmSessionEventListener.EventDispatcher) obj).drmSessionAcquired(i);
                }
            });
            androidx.media3.common.util.Assertions.checkNotNull(this.sessionId);
            return true;
        } catch (android.media.NotProvisionedException unused) {
            this.provisioningManager.provisionRequired(this);
            return false;
        } catch (java.lang.Exception e) {
            e = e;
            if (androidx.media3.exoplayer.drm.DrmUtil.isFailureToConstructNotProvisionedException(e)) {
                this.provisioningManager.provisionRequired(this);
                return false;
            }
            onError(e, 1);
            return false;
        } catch (java.lang.NoSuchMethodError e2) {
            e = e2;
            if (androidx.media3.exoplayer.drm.DrmUtil.isFailureToConstructNotProvisionedException(e)) {
                this.provisioningManager.provisionRequired(this);
                return false;
            }
            onError(e, 1);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onProvisionResponse(java.lang.Object obj, java.lang.Object obj2) {
        if (obj == this.currentProvisionRequest) {
            if (this.state == 2 || isOpen()) {
                this.currentProvisionRequest = null;
                if (obj2 instanceof java.lang.Exception) {
                    this.provisioningManager.onProvisionError((java.lang.Exception) obj2, false);
                    return;
                }
                try {
                    this.mediaDrm.provideProvisionResponse((byte[]) obj2);
                    this.provisioningManager.onProvisionCompleted();
                } catch (java.lang.Exception e) {
                    this.provisioningManager.onProvisionError(e, true);
                }
            }
        }
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({com.unity3d.services.core.device.reader.JsonStorageKeyNames.SESSION_ID_KEY})
    private void doLicense(boolean z) {
        if (this.isPlaceholderSession) {
            return;
        }
        byte[] bArr = (byte[]) androidx.media3.common.util.Util.castNonNull(this.sessionId);
        int i = this.mode;
        if (i != 0 && i != 1) {
            if (i == 2) {
                if (this.offlineLicenseKeySetId == null || restoreKeys()) {
                    postKeyRequest(bArr, 2, z);
                    return;
                }
                return;
            }
            if (i != 3) {
                return;
            }
            androidx.media3.common.util.Assertions.checkNotNull(this.offlineLicenseKeySetId);
            androidx.media3.common.util.Assertions.checkNotNull(this.sessionId);
            postKeyRequest(this.offlineLicenseKeySetId, 3, z);
            return;
        }
        if (this.offlineLicenseKeySetId == null) {
            postKeyRequest(bArr, 1, z);
            return;
        }
        if (this.state == 4 || restoreKeys()) {
            long licenseDurationRemainingSec = getLicenseDurationRemainingSec();
            if (this.mode == 0 && licenseDurationRemainingSec <= 60) {
                androidx.media3.common.util.Log.d(TAG, "Offline license has expired or will expire soon. Remaining seconds: " + licenseDurationRemainingSec);
                postKeyRequest(bArr, 2, z);
            } else if (licenseDurationRemainingSec <= 0) {
                onError(new androidx.media3.exoplayer.drm.KeysExpiredException(), 2);
            } else {
                this.state = 4;
                dispatchEvent(new androidx.media3.common.util.Consumer() { // from class: androidx.media3.exoplayer.drm.DefaultDrmSession$$ExternalSyntheticLambda2
                    @Override // androidx.media3.common.util.Consumer
                    public final void accept(java.lang.Object obj) {
                        ((androidx.media3.exoplayer.drm.DrmSessionEventListener.EventDispatcher) obj).drmKeysRestored();
                    }
                });
            }
        }
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({com.unity3d.services.core.device.reader.JsonStorageKeyNames.SESSION_ID_KEY, "offlineLicenseKeySetId"})
    private boolean restoreKeys() {
        try {
            this.mediaDrm.restoreKeys(this.sessionId, this.offlineLicenseKeySetId);
            return true;
        } catch (java.lang.Exception | java.lang.NoSuchMethodError e) {
            onError(e, 1);
            return false;
        }
    }

    private long getLicenseDurationRemainingSec() {
        if (!androidx.media3.common.C.WIDEVINE_UUID.equals(this.uuid)) {
            return Long.MAX_VALUE;
        }
        android.util.Pair pair = (android.util.Pair) androidx.media3.common.util.Assertions.checkNotNull(androidx.media3.exoplayer.drm.WidevineUtil.getLicenseDurationRemainingSec(this));
        return java.lang.Math.min(((java.lang.Long) pair.first).longValue(), ((java.lang.Long) pair.second).longValue());
    }

    private void postKeyRequest(byte[] bArr, int i, boolean z) {
        try {
            this.currentKeyRequest = this.mediaDrm.getKeyRequest(bArr, this.schemeDatas, i, this.keyRequestParameters);
            ((androidx.media3.exoplayer.drm.DefaultDrmSession.RequestHandler) androidx.media3.common.util.Util.castNonNull(this.requestHandler)).post(2, androidx.media3.common.util.Assertions.checkNotNull(this.currentKeyRequest), z);
        } catch (java.lang.Exception | java.lang.NoSuchMethodError e) {
            onKeysError(e, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onKeyResponse(java.lang.Object obj, java.lang.Object obj2) {
        if (obj == this.currentKeyRequest && isOpen()) {
            this.currentKeyRequest = null;
            if ((obj2 instanceof java.lang.Exception) || (obj2 instanceof java.lang.NoSuchMethodError)) {
                onKeysError((java.lang.Throwable) obj2, false);
                return;
            }
            try {
                byte[] bArr = (byte[]) obj2;
                if (this.mode == 3) {
                    this.mediaDrm.provideKeyResponse((byte[]) androidx.media3.common.util.Util.castNonNull(this.offlineLicenseKeySetId), bArr);
                    dispatchEvent(new androidx.media3.common.util.Consumer() { // from class: androidx.media3.exoplayer.drm.DefaultDrmSession$$ExternalSyntheticLambda3
                        @Override // androidx.media3.common.util.Consumer
                        public final void accept(java.lang.Object obj3) {
                            ((androidx.media3.exoplayer.drm.DrmSessionEventListener.EventDispatcher) obj3).drmKeysRemoved();
                        }
                    });
                    return;
                }
                byte[] bArrProvideKeyResponse = this.mediaDrm.provideKeyResponse(this.sessionId, bArr);
                int i = this.mode;
                if ((i == 2 || (i == 0 && this.offlineLicenseKeySetId != null)) && bArrProvideKeyResponse != null && bArrProvideKeyResponse.length != 0) {
                    this.offlineLicenseKeySetId = bArrProvideKeyResponse;
                }
                this.state = 4;
                dispatchEvent(new androidx.media3.common.util.Consumer() { // from class: androidx.media3.exoplayer.drm.DefaultDrmSession$$ExternalSyntheticLambda4
                    @Override // androidx.media3.common.util.Consumer
                    public final void accept(java.lang.Object obj3) {
                        ((androidx.media3.exoplayer.drm.DrmSessionEventListener.EventDispatcher) obj3).drmKeysLoaded();
                    }
                });
            } catch (java.lang.Exception | java.lang.NoSuchMethodError e) {
                onKeysError(e, true);
            }
        }
    }

    private void onKeysRequired() {
        if (this.mode == 0 && this.state == 4) {
            androidx.media3.common.util.Util.castNonNull(this.sessionId);
            doLicense(false);
        }
    }

    private void onKeysError(java.lang.Throwable th, boolean z) {
        if ((th instanceof android.media.NotProvisionedException) || androidx.media3.exoplayer.drm.DrmUtil.isFailureToConstructNotProvisionedException(th)) {
            this.provisioningManager.provisionRequired(this);
        } else {
            onError(th, z ? 1 : 2);
        }
    }

    private void onError(final java.lang.Throwable th, int i) {
        this.lastException = new androidx.media3.exoplayer.drm.DrmSession.DrmSessionException(th, androidx.media3.exoplayer.drm.DrmUtil.getErrorCodeForMediaDrmException(th, i));
        androidx.media3.common.util.Log.e(TAG, "DRM session error", th);
        if (th instanceof java.lang.Exception) {
            dispatchEvent(new androidx.media3.common.util.Consumer() { // from class: androidx.media3.exoplayer.drm.DefaultDrmSession$$ExternalSyntheticLambda0
                @Override // androidx.media3.common.util.Consumer
                public final void accept(java.lang.Object obj) {
                    ((androidx.media3.exoplayer.drm.DrmSessionEventListener.EventDispatcher) obj).drmSessionManagerError((java.lang.Exception) th);
                }
            });
        } else if (th instanceof java.lang.Error) {
            if (!androidx.media3.exoplayer.drm.DrmUtil.isFailureToConstructResourceBusyException(th) && !androidx.media3.exoplayer.drm.DrmUtil.isFailureToConstructNotProvisionedException(th)) {
                throw ((java.lang.Error) th);
            }
        } else {
            throw new java.lang.IllegalStateException("Unexpected Throwable subclass", th);
        }
        if (this.state != 4) {
            this.state = 1;
        }
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNullIf(expression = {com.unity3d.services.core.device.reader.JsonStorageKeyNames.SESSION_ID_KEY}, result = true)
    private boolean isOpen() {
        int i = this.state;
        return i == 3 || i == 4;
    }

    private void dispatchEvent(androidx.media3.common.util.Consumer<androidx.media3.exoplayer.drm.DrmSessionEventListener.EventDispatcher> consumer) {
        java.util.Iterator<androidx.media3.exoplayer.drm.DrmSessionEventListener.EventDispatcher> it = this.eventDispatchers.elementSet().iterator();
        while (it.hasNext()) {
            consumer.accept(it.next());
        }
    }

    private void verifyPlaybackThread() {
        if (java.lang.Thread.currentThread() != this.playbackLooper.getThread()) {
            androidx.media3.common.util.Log.w(TAG, "DefaultDrmSession accessed on the wrong thread.\nCurrent thread: " + java.lang.Thread.currentThread().getName() + "\nExpected thread: " + this.playbackLooper.getThread().getName(), new java.lang.IllegalStateException());
        }
    }

    private class ResponseHandler extends android.os.Handler {
        public ResponseHandler(android.os.Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(android.os.Message message) {
            android.util.Pair pair = (android.util.Pair) message.obj;
            java.lang.Object obj = pair.first;
            java.lang.Object obj2 = pair.second;
            int i = message.what;
            if (i == 1) {
                androidx.media3.exoplayer.drm.DefaultDrmSession.this.onProvisionResponse(obj, obj2);
            } else {
                if (i != 2) {
                    return;
                }
                androidx.media3.exoplayer.drm.DefaultDrmSession.this.onKeyResponse(obj, obj2);
            }
        }
    }

    private class RequestHandler extends android.os.Handler {
        private boolean isReleased;

        public RequestHandler(android.os.Looper looper) {
            super(looper);
        }

        void post(int i, java.lang.Object obj, boolean z) {
            obtainMessage(i, new androidx.media3.exoplayer.drm.DefaultDrmSession.RequestTask(androidx.media3.exoplayer.source.LoadEventInfo.getNewId(), z, android.os.SystemClock.elapsedRealtime(), obj)).sendToTarget();
        }

        @Override // android.os.Handler
        public void handleMessage(android.os.Message message) {
            java.lang.Object objExecuteProvisionRequest;
            androidx.media3.exoplayer.drm.DefaultDrmSession.RequestTask requestTask = (androidx.media3.exoplayer.drm.DefaultDrmSession.RequestTask) message.obj;
            try {
                int i = message.what;
                if (i == 1) {
                    objExecuteProvisionRequest = androidx.media3.exoplayer.drm.DefaultDrmSession.this.callback.executeProvisionRequest(androidx.media3.exoplayer.drm.DefaultDrmSession.this.uuid, (androidx.media3.exoplayer.drm.ExoMediaDrm.ProvisionRequest) requestTask.request);
                } else if (i == 2) {
                    objExecuteProvisionRequest = androidx.media3.exoplayer.drm.DefaultDrmSession.this.callback.executeKeyRequest(androidx.media3.exoplayer.drm.DefaultDrmSession.this.uuid, (androidx.media3.exoplayer.drm.ExoMediaDrm.KeyRequest) requestTask.request);
                } else {
                    throw new java.lang.RuntimeException();
                }
            } catch (androidx.media3.exoplayer.drm.MediaDrmCallbackException e) {
                boolean zMaybeRetryRequest = maybeRetryRequest(message, e);
                objExecuteProvisionRequest = e;
                if (zMaybeRetryRequest) {
                    return;
                }
            } catch (java.lang.Exception e2) {
                androidx.media3.common.util.Log.w(androidx.media3.exoplayer.drm.DefaultDrmSession.TAG, "Key/provisioning request produced an unexpected exception. Not retrying.", e2);
                objExecuteProvisionRequest = e2;
            }
            androidx.media3.exoplayer.drm.DefaultDrmSession.this.loadErrorHandlingPolicy.onLoadTaskConcluded(requestTask.taskId);
            synchronized (this) {
                if (!this.isReleased) {
                    androidx.media3.exoplayer.drm.DefaultDrmSession.this.responseHandler.obtainMessage(message.what, android.util.Pair.create(requestTask.request, objExecuteProvisionRequest)).sendToTarget();
                }
            }
        }

        private boolean maybeRetryRequest(android.os.Message message, androidx.media3.exoplayer.drm.MediaDrmCallbackException mediaDrmCallbackException) {
            java.io.IOException unexpectedDrmSessionException;
            androidx.media3.exoplayer.drm.DefaultDrmSession.RequestTask requestTask = (androidx.media3.exoplayer.drm.DefaultDrmSession.RequestTask) message.obj;
            if (!requestTask.allowRetry) {
                return false;
            }
            requestTask.errorCount++;
            if (requestTask.errorCount > androidx.media3.exoplayer.drm.DefaultDrmSession.this.loadErrorHandlingPolicy.getMinimumLoadableRetryCount(3)) {
                return false;
            }
            androidx.media3.exoplayer.source.LoadEventInfo loadEventInfo = new androidx.media3.exoplayer.source.LoadEventInfo(requestTask.taskId, mediaDrmCallbackException.dataSpec, mediaDrmCallbackException.uriAfterRedirects, mediaDrmCallbackException.responseHeaders, android.os.SystemClock.elapsedRealtime(), android.os.SystemClock.elapsedRealtime() - requestTask.startTimeMs, mediaDrmCallbackException.bytesLoaded);
            androidx.media3.exoplayer.source.MediaLoadData mediaLoadData = new androidx.media3.exoplayer.source.MediaLoadData(3);
            if (mediaDrmCallbackException.getCause() instanceof java.io.IOException) {
                unexpectedDrmSessionException = (java.io.IOException) mediaDrmCallbackException.getCause();
            } else {
                unexpectedDrmSessionException = new androidx.media3.exoplayer.drm.DefaultDrmSession.UnexpectedDrmSessionException(mediaDrmCallbackException.getCause());
            }
            long retryDelayMsFor = androidx.media3.exoplayer.drm.DefaultDrmSession.this.loadErrorHandlingPolicy.getRetryDelayMsFor(new androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy.LoadErrorInfo(loadEventInfo, mediaLoadData, unexpectedDrmSessionException, requestTask.errorCount));
            if (retryDelayMsFor == androidx.media3.common.C.TIME_UNSET) {
                return false;
            }
            synchronized (this) {
                if (this.isReleased) {
                    return false;
                }
                sendMessageDelayed(android.os.Message.obtain(message), retryDelayMsFor);
                return true;
            }
        }

        public synchronized void release() {
            removeCallbacksAndMessages(null);
            this.isReleased = true;
        }
    }

    private static final class RequestTask {
        public final boolean allowRetry;
        public int errorCount;
        public final java.lang.Object request;
        public final long startTimeMs;
        public final long taskId;

        public RequestTask(long j, boolean z, long j2, java.lang.Object obj) {
            this.taskId = j;
            this.allowRetry = z;
            this.startTimeMs = j2;
            this.request = obj;
        }
    }
}
