package androidx.browser.customtabs;

/* JADX INFO: loaded from: classes.dex */
public final class CustomTabsSession {
    private static final java.lang.String TAG = "CustomTabsSession";
    static final java.lang.String TARGET_ORIGIN_KEY = "target_origin";
    private final android.support.customtabs.ICustomTabsCallback mCallback;
    private final android.content.ComponentName mComponentName;
    private final android.app.PendingIntent mId;
    private final java.lang.Object mLock = new java.lang.Object();
    private final android.support.customtabs.ICustomTabsService mService;

    public static androidx.browser.customtabs.CustomTabsSession createMockSessionForTesting(android.content.ComponentName componentName) {
        return new androidx.browser.customtabs.CustomTabsSession(new androidx.browser.customtabs.CustomTabsSession.MockSession(), new androidx.browser.customtabs.CustomTabsSessionToken.MockCallback(), componentName, null);
    }

    CustomTabsSession(android.support.customtabs.ICustomTabsService iCustomTabsService, android.support.customtabs.ICustomTabsCallback iCustomTabsCallback, android.content.ComponentName componentName, android.app.PendingIntent pendingIntent) {
        this.mService = iCustomTabsService;
        this.mCallback = iCustomTabsCallback;
        this.mComponentName = componentName;
        this.mId = pendingIntent;
    }

    public boolean mayLaunchUrl(android.net.Uri uri, android.os.Bundle bundle, java.util.List<android.os.Bundle> list) {
        try {
            return this.mService.mayLaunchUrl(this.mCallback, uri, createBundleWithId(bundle), list);
        } catch (android.os.RemoteException unused) {
            return false;
        }
    }

    public boolean setActionButton(android.graphics.Bitmap bitmap, java.lang.String str) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putParcelable(androidx.browser.customtabs.CustomTabsIntent.KEY_ICON, bitmap);
        bundle.putString(androidx.browser.customtabs.CustomTabsIntent.KEY_DESCRIPTION, str);
        android.os.Bundle bundle2 = new android.os.Bundle();
        bundle2.putBundle(androidx.browser.customtabs.CustomTabsIntent.EXTRA_ACTION_BUTTON_BUNDLE, bundle);
        addIdToBundle(bundle);
        try {
            return this.mService.updateVisuals(this.mCallback, bundle2);
        } catch (android.os.RemoteException unused) {
            return false;
        }
    }

    public boolean setSecondaryToolbarViews(android.widget.RemoteViews remoteViews, int[] iArr, android.app.PendingIntent pendingIntent) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putParcelable(androidx.browser.customtabs.CustomTabsIntent.EXTRA_REMOTEVIEWS, remoteViews);
        bundle.putIntArray(androidx.browser.customtabs.CustomTabsIntent.EXTRA_REMOTEVIEWS_VIEW_IDS, iArr);
        bundle.putParcelable(androidx.browser.customtabs.CustomTabsIntent.EXTRA_REMOTEVIEWS_PENDINGINTENT, pendingIntent);
        addIdToBundle(bundle);
        try {
            return this.mService.updateVisuals(this.mCallback, bundle);
        } catch (android.os.RemoteException unused) {
            return false;
        }
    }

    public boolean setSecondaryToolbarSwipeUpGesture(android.app.PendingIntent pendingIntent) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putParcelable(androidx.browser.customtabs.CustomTabsIntent.EXTRA_SECONDARY_TOOLBAR_SWIPE_UP_GESTURE, pendingIntent);
        addIdToBundle(bundle);
        try {
            return this.mService.updateVisuals(this.mCallback, bundle);
        } catch (android.os.RemoteException unused) {
            return false;
        }
    }

    @java.lang.Deprecated
    public boolean setToolbarItem(int i, android.graphics.Bitmap bitmap, java.lang.String str) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt(androidx.browser.customtabs.CustomTabsIntent.KEY_ID, i);
        bundle.putParcelable(androidx.browser.customtabs.CustomTabsIntent.KEY_ICON, bitmap);
        bundle.putString(androidx.browser.customtabs.CustomTabsIntent.KEY_DESCRIPTION, str);
        android.os.Bundle bundle2 = new android.os.Bundle();
        bundle2.putBundle(androidx.browser.customtabs.CustomTabsIntent.EXTRA_ACTION_BUTTON_BUNDLE, bundle);
        addIdToBundle(bundle2);
        try {
            return this.mService.updateVisuals(this.mCallback, bundle2);
        } catch (android.os.RemoteException unused) {
            return false;
        }
    }

    public boolean requestPostMessageChannel(android.net.Uri uri) {
        return requestPostMessageChannel(uri, null, new android.os.Bundle());
    }

    public boolean requestPostMessageChannel(android.net.Uri uri, android.net.Uri uri2, android.os.Bundle bundle) {
        try {
            android.os.Bundle bundleCreatePostMessageExtraBundle = createPostMessageExtraBundle(uri2);
            if (bundleCreatePostMessageExtraBundle != null) {
                bundle.putAll(bundleCreatePostMessageExtraBundle);
                return this.mService.requestPostMessageChannelWithExtras(this.mCallback, uri, bundle);
            }
            return this.mService.requestPostMessageChannel(this.mCallback, uri);
        } catch (android.os.RemoteException unused) {
            return false;
        }
    }

    public int postMessage(java.lang.String str, android.os.Bundle bundle) {
        int iPostMessage;
        android.os.Bundle bundleCreateBundleWithId = createBundleWithId(bundle);
        synchronized (this.mLock) {
            try {
                try {
                    iPostMessage = this.mService.postMessage(this.mCallback, str, bundleCreateBundleWithId);
                } catch (android.os.RemoteException unused) {
                    return -2;
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return iPostMessage;
    }

    public boolean validateRelationship(int i, android.net.Uri uri, android.os.Bundle bundle) {
        if (i >= 1 && i <= 2) {
            try {
                return this.mService.validateRelationship(this.mCallback, i, uri, createBundleWithId(bundle));
            } catch (android.os.RemoteException unused) {
            }
        }
        return false;
    }

    public boolean receiveFile(android.net.Uri uri, int i, android.os.Bundle bundle) {
        try {
            return this.mService.receiveFile(this.mCallback, uri, i, createBundleWithId(bundle));
        } catch (android.os.RemoteException unused) {
            return false;
        }
    }

    public boolean isEngagementSignalsApiAvailable(android.os.Bundle bundle) throws android.os.RemoteException {
        try {
            return this.mService.isEngagementSignalsApiAvailable(this.mCallback, createBundleWithId(bundle));
        } catch (java.lang.SecurityException e) {
            throw new java.lang.UnsupportedOperationException("This method isn't supported by the Custom Tabs implementation.", e);
        }
    }

    public boolean setEngagementSignalsCallback(androidx.browser.customtabs.EngagementSignalsCallback engagementSignalsCallback, android.os.Bundle bundle) throws android.os.RemoteException {
        try {
            return this.mService.setEngagementSignalsCallback(this.mCallback, createEngagementSignalsCallbackWrapper(engagementSignalsCallback).asBinder(), createBundleWithId(bundle));
        } catch (java.lang.SecurityException e) {
            throw new java.lang.UnsupportedOperationException("This method isn't supported by the Custom Tabs implementation.", e);
        }
    }

    /* JADX INFO: renamed from: androidx.browser.customtabs.CustomTabsSession$1, reason: invalid class name */
    class AnonymousClass1 extends android.support.customtabs.IEngagementSignalsCallback.Stub {
        private final android.os.Handler mHandler = new android.os.Handler(android.os.Looper.getMainLooper());
        final /* synthetic */ androidx.browser.customtabs.EngagementSignalsCallback val$callback;

        AnonymousClass1(androidx.browser.customtabs.EngagementSignalsCallback engagementSignalsCallback) {
            this.val$callback = engagementSignalsCallback;
        }

        @Override // android.support.customtabs.IEngagementSignalsCallback
        public void onVerticalScrollEvent(final boolean z, final android.os.Bundle bundle) {
            android.os.Handler handler = this.mHandler;
            final androidx.browser.customtabs.EngagementSignalsCallback engagementSignalsCallback = this.val$callback;
            handler.post(new java.lang.Runnable() { // from class: androidx.browser.customtabs.CustomTabsSession$1$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    engagementSignalsCallback.onVerticalScrollEvent(z, bundle);
                }
            });
        }

        @Override // android.support.customtabs.IEngagementSignalsCallback
        public void onGreatestScrollPercentageIncreased(final int i, final android.os.Bundle bundle) {
            android.os.Handler handler = this.mHandler;
            final androidx.browser.customtabs.EngagementSignalsCallback engagementSignalsCallback = this.val$callback;
            handler.post(new java.lang.Runnable() { // from class: androidx.browser.customtabs.CustomTabsSession$1$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    engagementSignalsCallback.onGreatestScrollPercentageIncreased(i, bundle);
                }
            });
        }

        @Override // android.support.customtabs.IEngagementSignalsCallback
        public void onSessionEnded(final boolean z, final android.os.Bundle bundle) {
            android.os.Handler handler = this.mHandler;
            final androidx.browser.customtabs.EngagementSignalsCallback engagementSignalsCallback = this.val$callback;
            handler.post(new java.lang.Runnable() { // from class: androidx.browser.customtabs.CustomTabsSession$1$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    engagementSignalsCallback.onSessionEnded(z, bundle);
                }
            });
        }
    }

    private android.support.customtabs.IEngagementSignalsCallback.Stub createEngagementSignalsCallbackWrapper(androidx.browser.customtabs.EngagementSignalsCallback engagementSignalsCallback) {
        return new androidx.browser.customtabs.CustomTabsSession.AnonymousClass1(engagementSignalsCallback);
    }

    public boolean setEngagementSignalsCallback(java.util.concurrent.Executor executor, androidx.browser.customtabs.EngagementSignalsCallback engagementSignalsCallback, android.os.Bundle bundle) throws android.os.RemoteException {
        try {
            return this.mService.setEngagementSignalsCallback(this.mCallback, createEngagementSignalsCallbackWrapper(engagementSignalsCallback, executor).asBinder(), createBundleWithId(bundle));
        } catch (java.lang.SecurityException e) {
            throw new java.lang.UnsupportedOperationException("This method isn't supported by the Custom Tabs implementation.", e);
        }
    }

    /* JADX INFO: renamed from: androidx.browser.customtabs.CustomTabsSession$2, reason: invalid class name */
    class AnonymousClass2 extends android.support.customtabs.IEngagementSignalsCallback.Stub {
        private final java.util.concurrent.Executor mExecutor;
        final /* synthetic */ androidx.browser.customtabs.EngagementSignalsCallback val$callback;
        final /* synthetic */ java.util.concurrent.Executor val$executor;

        AnonymousClass2(java.util.concurrent.Executor executor, androidx.browser.customtabs.EngagementSignalsCallback engagementSignalsCallback) {
            this.val$executor = executor;
            this.val$callback = engagementSignalsCallback;
            this.mExecutor = executor;
        }

        @Override // android.support.customtabs.IEngagementSignalsCallback
        public void onVerticalScrollEvent(final boolean z, final android.os.Bundle bundle) {
            long jClearCallingIdentity = android.os.Binder.clearCallingIdentity();
            try {
                java.util.concurrent.Executor executor = this.mExecutor;
                final androidx.browser.customtabs.EngagementSignalsCallback engagementSignalsCallback = this.val$callback;
                executor.execute(new java.lang.Runnable() { // from class: androidx.browser.customtabs.CustomTabsSession$2$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        engagementSignalsCallback.onVerticalScrollEvent(z, bundle);
                    }
                });
            } finally {
                android.os.Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        }

        @Override // android.support.customtabs.IEngagementSignalsCallback
        public void onGreatestScrollPercentageIncreased(final int i, final android.os.Bundle bundle) {
            long jClearCallingIdentity = android.os.Binder.clearCallingIdentity();
            try {
                java.util.concurrent.Executor executor = this.mExecutor;
                final androidx.browser.customtabs.EngagementSignalsCallback engagementSignalsCallback = this.val$callback;
                executor.execute(new java.lang.Runnable() { // from class: androidx.browser.customtabs.CustomTabsSession$2$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        engagementSignalsCallback.onGreatestScrollPercentageIncreased(i, bundle);
                    }
                });
            } finally {
                android.os.Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        }

        @Override // android.support.customtabs.IEngagementSignalsCallback
        public void onSessionEnded(final boolean z, final android.os.Bundle bundle) {
            long jClearCallingIdentity = android.os.Binder.clearCallingIdentity();
            try {
                java.util.concurrent.Executor executor = this.mExecutor;
                final androidx.browser.customtabs.EngagementSignalsCallback engagementSignalsCallback = this.val$callback;
                executor.execute(new java.lang.Runnable() { // from class: androidx.browser.customtabs.CustomTabsSession$2$$ExternalSyntheticLambda2
                    @Override // java.lang.Runnable
                    public final void run() {
                        engagementSignalsCallback.onSessionEnded(z, bundle);
                    }
                });
            } finally {
                android.os.Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        }
    }

    private android.support.customtabs.IEngagementSignalsCallback.Stub createEngagementSignalsCallbackWrapper(androidx.browser.customtabs.EngagementSignalsCallback engagementSignalsCallback, java.util.concurrent.Executor executor) {
        return new androidx.browser.customtabs.CustomTabsSession.AnonymousClass2(executor, engagementSignalsCallback);
    }

    private android.os.Bundle createPostMessageExtraBundle(android.net.Uri uri) {
        android.os.Bundle bundle = new android.os.Bundle();
        if (uri != null) {
            bundle.putParcelable(TARGET_ORIGIN_KEY, uri);
        }
        if (this.mId != null) {
            addIdToBundle(bundle);
        }
        if (bundle.isEmpty()) {
            return null;
        }
        return bundle;
    }

    private android.os.Bundle createBundleWithId(android.os.Bundle bundle) {
        android.os.Bundle bundle2 = new android.os.Bundle();
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
        addIdToBundle(bundle2);
        return bundle2;
    }

    private void addIdToBundle(android.os.Bundle bundle) {
        android.app.PendingIntent pendingIntent = this.mId;
        if (pendingIntent != null) {
            bundle.putParcelable(androidx.browser.customtabs.CustomTabsIntent.EXTRA_SESSION_ID, pendingIntent);
        }
    }

    android.os.IBinder getBinder() {
        return this.mCallback.asBinder();
    }

    android.content.ComponentName getComponentName() {
        return this.mComponentName;
    }

    android.app.PendingIntent getId() {
        return this.mId;
    }

    public static class PendingSession {
        private final androidx.browser.customtabs.CustomTabsCallback mCallback;
        private final android.app.PendingIntent mId;

        PendingSession(androidx.browser.customtabs.CustomTabsCallback customTabsCallback, android.app.PendingIntent pendingIntent) {
            this.mCallback = customTabsCallback;
            this.mId = pendingIntent;
        }

        android.app.PendingIntent getId() {
            return this.mId;
        }

        androidx.browser.customtabs.CustomTabsCallback getCallback() {
            return this.mCallback;
        }
    }

    static class MockSession extends android.support.customtabs.ICustomTabsService.Stub {
        @Override // android.support.customtabs.ICustomTabsService
        public android.os.Bundle extraCommand(java.lang.String str, android.os.Bundle bundle) throws android.os.RemoteException {
            return null;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean isEngagementSignalsApiAvailable(android.support.customtabs.ICustomTabsCallback iCustomTabsCallback, android.os.Bundle bundle) throws android.os.RemoteException {
            return false;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean mayLaunchUrl(android.support.customtabs.ICustomTabsCallback iCustomTabsCallback, android.net.Uri uri, android.os.Bundle bundle, java.util.List<android.os.Bundle> list) throws android.os.RemoteException {
            return false;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean newSession(android.support.customtabs.ICustomTabsCallback iCustomTabsCallback) throws android.os.RemoteException {
            return false;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean newSessionWithExtras(android.support.customtabs.ICustomTabsCallback iCustomTabsCallback, android.os.Bundle bundle) throws android.os.RemoteException {
            return false;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public int postMessage(android.support.customtabs.ICustomTabsCallback iCustomTabsCallback, java.lang.String str, android.os.Bundle bundle) throws android.os.RemoteException {
            return 0;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean receiveFile(android.support.customtabs.ICustomTabsCallback iCustomTabsCallback, android.net.Uri uri, int i, android.os.Bundle bundle) throws android.os.RemoteException {
            return false;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean requestPostMessageChannel(android.support.customtabs.ICustomTabsCallback iCustomTabsCallback, android.net.Uri uri) throws android.os.RemoteException {
            return false;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean requestPostMessageChannelWithExtras(android.support.customtabs.ICustomTabsCallback iCustomTabsCallback, android.net.Uri uri, android.os.Bundle bundle) throws android.os.RemoteException {
            return false;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean setEngagementSignalsCallback(android.support.customtabs.ICustomTabsCallback iCustomTabsCallback, android.os.IBinder iBinder, android.os.Bundle bundle) throws android.os.RemoteException {
            return false;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean updateVisuals(android.support.customtabs.ICustomTabsCallback iCustomTabsCallback, android.os.Bundle bundle) throws android.os.RemoteException {
            return false;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean validateRelationship(android.support.customtabs.ICustomTabsCallback iCustomTabsCallback, int i, android.net.Uri uri, android.os.Bundle bundle) throws android.os.RemoteException {
            return false;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean warmup(long j) throws android.os.RemoteException {
            return false;
        }

        MockSession() {
        }
    }
}
