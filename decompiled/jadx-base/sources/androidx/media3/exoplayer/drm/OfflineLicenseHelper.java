package androidx.media3.exoplayer.drm;

/* JADX INFO: loaded from: classes.dex */
public final class OfflineLicenseHelper {
    private static final androidx.media3.common.Format FORMAT_WITH_EMPTY_DRM_INIT_DATA = new androidx.media3.common.Format.Builder().setDrmInitData(new androidx.media3.common.DrmInitData(new androidx.media3.common.DrmInitData.SchemeData[0])).build();
    private final android.os.ConditionVariable drmListenerConditionVariable;
    private final androidx.media3.exoplayer.drm.DefaultDrmSessionManager drmSessionManager;
    private final androidx.media3.exoplayer.drm.DrmSessionEventListener.EventDispatcher eventDispatcher;
    private final android.os.Handler handler;
    private final android.os.HandlerThread handlerThread;

    public static androidx.media3.exoplayer.drm.OfflineLicenseHelper newWidevineInstance(java.lang.String str, androidx.media3.datasource.DataSource.Factory factory, androidx.media3.exoplayer.drm.DrmSessionEventListener.EventDispatcher eventDispatcher) {
        return newWidevineInstance(str, false, factory, eventDispatcher);
    }

    public static androidx.media3.exoplayer.drm.OfflineLicenseHelper newWidevineInstance(java.lang.String str, boolean z, androidx.media3.datasource.DataSource.Factory factory, androidx.media3.exoplayer.drm.DrmSessionEventListener.EventDispatcher eventDispatcher) {
        return newWidevineInstance(str, z, factory, null, eventDispatcher);
    }

    public static androidx.media3.exoplayer.drm.OfflineLicenseHelper newWidevineInstance(java.lang.String str, boolean z, androidx.media3.datasource.DataSource.Factory factory, java.util.Map<java.lang.String, java.lang.String> map, androidx.media3.exoplayer.drm.DrmSessionEventListener.EventDispatcher eventDispatcher) {
        return new androidx.media3.exoplayer.drm.OfflineLicenseHelper(new androidx.media3.exoplayer.drm.DefaultDrmSessionManager.Builder().setKeyRequestParameters(map).build(new androidx.media3.exoplayer.drm.HttpMediaDrmCallback(str, z, factory)), eventDispatcher);
    }

    public OfflineLicenseHelper(androidx.media3.exoplayer.drm.DefaultDrmSessionManager defaultDrmSessionManager, androidx.media3.exoplayer.drm.DrmSessionEventListener.EventDispatcher eventDispatcher) {
        this.drmSessionManager = defaultDrmSessionManager;
        this.eventDispatcher = eventDispatcher;
        android.os.HandlerThread handlerThread = new android.os.HandlerThread("ExoPlayer:OfflineLicenseHelper");
        this.handlerThread = handlerThread;
        handlerThread.start();
        this.handler = new android.os.Handler(handlerThread.getLooper());
        this.drmListenerConditionVariable = new android.os.ConditionVariable();
        eventDispatcher.addEventListener(new android.os.Handler(handlerThread.getLooper()), new androidx.media3.exoplayer.drm.DrmSessionEventListener() { // from class: androidx.media3.exoplayer.drm.OfflineLicenseHelper.1
            @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
            public void onDrmKeysLoaded(int i, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId) {
                androidx.media3.exoplayer.drm.OfflineLicenseHelper.this.drmListenerConditionVariable.open();
            }

            @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
            public void onDrmSessionManagerError(int i, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, java.lang.Exception exc) {
                androidx.media3.exoplayer.drm.OfflineLicenseHelper.this.drmListenerConditionVariable.open();
            }

            @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
            public void onDrmKeysRestored(int i, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId) {
                androidx.media3.exoplayer.drm.OfflineLicenseHelper.this.drmListenerConditionVariable.open();
            }

            @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
            public void onDrmKeysRemoved(int i, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId) {
                androidx.media3.exoplayer.drm.OfflineLicenseHelper.this.drmListenerConditionVariable.open();
            }
        });
    }

    public synchronized byte[] downloadLicense(androidx.media3.common.Format format) throws androidx.media3.exoplayer.drm.DrmSession.DrmSessionException {
        androidx.media3.common.util.Assertions.checkArgument(format.drmInitData != null);
        return acquireSessionAndGetOfflineLicenseKeySetIdOnHandlerThread(2, null, format);
    }

    public synchronized byte[] renewLicense(byte[] bArr) throws androidx.media3.exoplayer.drm.DrmSession.DrmSessionException {
        androidx.media3.common.util.Assertions.checkNotNull(bArr);
        return acquireSessionAndGetOfflineLicenseKeySetIdOnHandlerThread(2, bArr, FORMAT_WITH_EMPTY_DRM_INIT_DATA);
    }

    public synchronized void releaseLicense(byte[] bArr) throws androidx.media3.exoplayer.drm.DrmSession.DrmSessionException {
        androidx.media3.common.util.Assertions.checkNotNull(bArr);
        acquireSessionAndGetOfflineLicenseKeySetIdOnHandlerThread(3, bArr, FORMAT_WITH_EMPTY_DRM_INIT_DATA);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public synchronized android.util.Pair<java.lang.Long, java.lang.Long> getLicenseDurationRemainingSec(byte[] bArr) throws androidx.media3.exoplayer.drm.DrmSession.DrmSessionException {
        android.util.Pair<java.lang.Long, java.lang.Long> pair;
        androidx.media3.common.util.Assertions.checkNotNull(bArr);
        try {
            final androidx.media3.exoplayer.drm.DrmSession drmSessionAcquireFirstSessionOnHandlerThread = acquireFirstSessionOnHandlerThread(1, bArr, FORMAT_WITH_EMPTY_DRM_INIT_DATA);
            final com.google.common.util.concurrent.SettableFuture settableFutureCreate = com.google.common.util.concurrent.SettableFuture.create();
            this.handler.post(new java.lang.Runnable() { // from class: androidx.media3.exoplayer.drm.OfflineLicenseHelper$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m166xc6195285(settableFutureCreate, drmSessionAcquireFirstSessionOnHandlerThread);
                }
            });
            try {
                try {
                    pair = (android.util.Pair) settableFutureCreate.get();
                    releaseManagerOnHandlerThread();
                } catch (java.lang.Throwable th) {
                    releaseManagerOnHandlerThread();
                    throw th;
                }
            } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException e) {
                throw new java.lang.IllegalStateException(e);
            }
        } catch (androidx.media3.exoplayer.drm.DrmSession.DrmSessionException e2) {
            if (e2.getCause() instanceof androidx.media3.exoplayer.drm.KeysExpiredException) {
                return android.util.Pair.create(0L, 0L);
            }
            throw e2;
        }
        return pair;
    }

    /* JADX INFO: renamed from: lambda$getLicenseDurationRemainingSec$0$androidx-media3-exoplayer-drm-OfflineLicenseHelper, reason: not valid java name */
    /* synthetic */ void m166xc6195285(com.google.common.util.concurrent.SettableFuture settableFuture, androidx.media3.exoplayer.drm.DrmSession drmSession) {
        try {
            settableFuture.set((android.util.Pair) androidx.media3.common.util.Assertions.checkNotNull(androidx.media3.exoplayer.drm.WidevineUtil.getLicenseDurationRemainingSec(drmSession)));
        } catch (java.lang.Throwable th) {
            try {
                settableFuture.setException(th);
            } finally {
                drmSession.release(this.eventDispatcher);
            }
        }
    }

    public void release() {
        this.handlerThread.quit();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private byte[] acquireSessionAndGetOfflineLicenseKeySetIdOnHandlerThread(int i, byte[] bArr, androidx.media3.common.Format format) throws androidx.media3.exoplayer.drm.DrmSession.DrmSessionException {
        final androidx.media3.exoplayer.drm.DrmSession drmSessionAcquireFirstSessionOnHandlerThread = acquireFirstSessionOnHandlerThread(i, bArr, format);
        final com.google.common.util.concurrent.SettableFuture settableFutureCreate = com.google.common.util.concurrent.SettableFuture.create();
        this.handler.post(new java.lang.Runnable() { // from class: androidx.media3.exoplayer.drm.OfflineLicenseHelper$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m165x4ec00c9e(settableFutureCreate, drmSessionAcquireFirstSessionOnHandlerThread);
            }
        });
        try {
            try {
                byte[] bArr2 = (byte[]) androidx.media3.common.util.Assertions.checkNotNull((byte[]) settableFutureCreate.get());
                releaseManagerOnHandlerThread();
                return bArr2;
            } catch (java.lang.Throwable th) {
                releaseManagerOnHandlerThread();
                throw th;
            }
        } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException e) {
            throw new java.lang.IllegalStateException(e);
        }
    }

    /* JADX INFO: renamed from: lambda$acquireSessionAndGetOfflineLicenseKeySetIdOnHandlerThread$1$androidx-media3-exoplayer-drm-OfflineLicenseHelper, reason: not valid java name */
    /* synthetic */ void m165x4ec00c9e(com.google.common.util.concurrent.SettableFuture settableFuture, androidx.media3.exoplayer.drm.DrmSession drmSession) {
        try {
            settableFuture.set(drmSession.getOfflineLicenseKeySetId());
        } catch (java.lang.Throwable th) {
            try {
                settableFuture.setException(th);
            } finally {
                drmSession.release(this.eventDispatcher);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private androidx.media3.exoplayer.drm.DrmSession acquireFirstSessionOnHandlerThread(final int i, final byte[] bArr, final androidx.media3.common.Format format) throws androidx.media3.exoplayer.drm.DrmSession.DrmSessionException {
        androidx.media3.common.util.Assertions.checkNotNull(format.drmInitData);
        final com.google.common.util.concurrent.SettableFuture settableFutureCreate = com.google.common.util.concurrent.SettableFuture.create();
        this.drmListenerConditionVariable.close();
        this.handler.post(new java.lang.Runnable() { // from class: androidx.media3.exoplayer.drm.OfflineLicenseHelper$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m163xf4292904(i, bArr, settableFutureCreate, format);
            }
        });
        try {
            final androidx.media3.exoplayer.drm.DrmSession drmSession = (androidx.media3.exoplayer.drm.DrmSession) settableFutureCreate.get();
            this.drmListenerConditionVariable.block();
            final com.google.common.util.concurrent.SettableFuture settableFutureCreate2 = com.google.common.util.concurrent.SettableFuture.create();
            this.handler.post(new java.lang.Runnable() { // from class: androidx.media3.exoplayer.drm.OfflineLicenseHelper$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m164x2201c363(drmSession, settableFutureCreate2);
                }
            });
            try {
                if (settableFutureCreate2.get() == 0) {
                    return drmSession;
                }
                throw ((androidx.media3.exoplayer.drm.DrmSession.DrmSessionException) settableFutureCreate2.get());
            } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException e) {
                throw new java.lang.IllegalStateException(e);
            }
        } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException e2) {
            throw new java.lang.IllegalStateException(e2);
        }
    }

    /* JADX INFO: renamed from: lambda$acquireFirstSessionOnHandlerThread$2$androidx-media3-exoplayer-drm-OfflineLicenseHelper, reason: not valid java name */
    /* synthetic */ void m163xf4292904(int i, byte[] bArr, com.google.common.util.concurrent.SettableFuture settableFuture, androidx.media3.common.Format format) {
        try {
            this.drmSessionManager.setPlayer((android.os.Looper) androidx.media3.common.util.Assertions.checkNotNull(android.os.Looper.myLooper()), androidx.media3.exoplayer.analytics.PlayerId.UNSET);
            this.drmSessionManager.prepare();
            try {
                this.drmSessionManager.setMode(i, bArr);
                settableFuture.set((androidx.media3.exoplayer.drm.DrmSession) androidx.media3.common.util.Assertions.checkNotNull(this.drmSessionManager.acquireSession(this.eventDispatcher, format)));
            } catch (java.lang.Throwable th) {
                this.drmSessionManager.release();
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            settableFuture.setException(th2);
        }
    }

    /* JADX INFO: renamed from: lambda$acquireFirstSessionOnHandlerThread$3$androidx-media3-exoplayer-drm-OfflineLicenseHelper, reason: not valid java name */
    /* synthetic */ void m164x2201c363(androidx.media3.exoplayer.drm.DrmSession drmSession, com.google.common.util.concurrent.SettableFuture settableFuture) {
        try {
            androidx.media3.exoplayer.drm.DrmSession.DrmSessionException error = drmSession.getError();
            if (drmSession.getState() == 1) {
                drmSession.release(this.eventDispatcher);
                this.drmSessionManager.release();
            }
            settableFuture.set(error);
        } catch (java.lang.Throwable th) {
            settableFuture.setException(th);
            drmSession.release(this.eventDispatcher);
            this.drmSessionManager.release();
        }
    }

    private void releaseManagerOnHandlerThread() {
        final com.google.common.util.concurrent.SettableFuture settableFutureCreate = com.google.common.util.concurrent.SettableFuture.create();
        this.handler.post(new java.lang.Runnable() { // from class: androidx.media3.exoplayer.drm.OfflineLicenseHelper$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m167xf255d686(settableFutureCreate);
            }
        });
        try {
            settableFutureCreate.get();
        } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException e) {
            throw new java.lang.IllegalStateException(e);
        }
    }

    /* JADX INFO: renamed from: lambda$releaseManagerOnHandlerThread$4$androidx-media3-exoplayer-drm-OfflineLicenseHelper, reason: not valid java name */
    /* synthetic */ void m167xf255d686(com.google.common.util.concurrent.SettableFuture settableFuture) {
        try {
            this.drmSessionManager.release();
            settableFuture.set(null);
        } catch (java.lang.Throwable th) {
            settableFuture.setException(th);
        }
    }
}
