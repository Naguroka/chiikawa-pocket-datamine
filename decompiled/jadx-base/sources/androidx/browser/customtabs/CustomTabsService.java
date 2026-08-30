package androidx.browser.customtabs;

/* JADX INFO: loaded from: classes.dex */
public abstract class CustomTabsService extends android.app.Service {
    public static final java.lang.String ACTION_CUSTOM_TABS_CONNECTION = "android.support.customtabs.action.CustomTabsService";
    public static final java.lang.String CATEGORY_COLOR_SCHEME_CUSTOMIZATION = "androidx.browser.customtabs.category.ColorSchemeCustomization";
    public static final java.lang.String CATEGORY_NAVBAR_COLOR_CUSTOMIZATION = "androidx.browser.customtabs.category.NavBarColorCustomization";
    public static final java.lang.String CATEGORY_TRUSTED_WEB_ACTIVITY_IMMERSIVE_MODE = "androidx.browser.trusted.category.ImmersiveMode";
    public static final java.lang.String CATEGORY_WEB_SHARE_TARGET_V2 = "androidx.browser.trusted.category.WebShareTargetV2";
    public static final int FILE_PURPOSE_TRUSTED_WEB_ACTIVITY_SPLASH_IMAGE = 1;
    public static final java.lang.String KEY_SUCCESS = "androidx.browser.customtabs.SUCCESS";
    public static final java.lang.String KEY_URL = "android.support.customtabs.otherurls.URL";
    public static final int RELATION_HANDLE_ALL_URLS = 2;
    public static final int RELATION_USE_AS_ORIGIN = 1;
    public static final int RESULT_FAILURE_DISALLOWED = -1;
    public static final int RESULT_FAILURE_MESSAGING_ERROR = -3;
    public static final int RESULT_FAILURE_REMOTE_ERROR = -2;
    public static final int RESULT_SUCCESS = 0;
    private static final java.lang.String TAG = "CustomTabsService";
    public static final java.lang.String TRUSTED_WEB_ACTIVITY_CATEGORY = "androidx.browser.trusted.category.TrustedWebActivities";
    final androidx.collection.SimpleArrayMap<android.os.IBinder, android.os.IBinder.DeathRecipient> mDeathRecipientMap = new androidx.collection.SimpleArrayMap<>();
    private android.support.customtabs.ICustomTabsService.Stub mBinder = new androidx.browser.customtabs.CustomTabsService.AnonymousClass1();

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface FilePurpose {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface Relation {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface Result {
    }

    protected abstract android.os.Bundle extraCommand(java.lang.String str, android.os.Bundle bundle);

    protected boolean isEngagementSignalsApiAvailable(androidx.browser.customtabs.CustomTabsSessionToken customTabsSessionToken, android.os.Bundle bundle) {
        return false;
    }

    protected abstract boolean mayLaunchUrl(androidx.browser.customtabs.CustomTabsSessionToken customTabsSessionToken, android.net.Uri uri, android.os.Bundle bundle, java.util.List<android.os.Bundle> list);

    protected abstract boolean newSession(androidx.browser.customtabs.CustomTabsSessionToken customTabsSessionToken);

    protected abstract int postMessage(androidx.browser.customtabs.CustomTabsSessionToken customTabsSessionToken, java.lang.String str, android.os.Bundle bundle);

    protected abstract boolean receiveFile(androidx.browser.customtabs.CustomTabsSessionToken customTabsSessionToken, android.net.Uri uri, int i, android.os.Bundle bundle);

    protected abstract boolean requestPostMessageChannel(androidx.browser.customtabs.CustomTabsSessionToken customTabsSessionToken, android.net.Uri uri);

    protected boolean setEngagementSignalsCallback(androidx.browser.customtabs.CustomTabsSessionToken customTabsSessionToken, androidx.browser.customtabs.EngagementSignalsCallback engagementSignalsCallback, android.os.Bundle bundle) {
        return false;
    }

    protected abstract boolean updateVisuals(androidx.browser.customtabs.CustomTabsSessionToken customTabsSessionToken, android.os.Bundle bundle);

    protected abstract boolean validateRelationship(androidx.browser.customtabs.CustomTabsSessionToken customTabsSessionToken, int i, android.net.Uri uri, android.os.Bundle bundle);

    protected abstract boolean warmup(long j);

    /* JADX INFO: renamed from: androidx.browser.customtabs.CustomTabsService$1, reason: invalid class name */
    class AnonymousClass1 extends android.support.customtabs.ICustomTabsService.Stub {
        AnonymousClass1() {
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean warmup(long j) {
            return androidx.browser.customtabs.CustomTabsService.this.warmup(j);
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean newSession(android.support.customtabs.ICustomTabsCallback iCustomTabsCallback) {
            return newSessionInternal(iCustomTabsCallback, null);
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean newSessionWithExtras(android.support.customtabs.ICustomTabsCallback iCustomTabsCallback, android.os.Bundle bundle) {
            return newSessionInternal(iCustomTabsCallback, getSessionIdFromBundle(bundle));
        }

        private boolean newSessionInternal(android.support.customtabs.ICustomTabsCallback iCustomTabsCallback, android.app.PendingIntent pendingIntent) {
            final androidx.browser.customtabs.CustomTabsSessionToken customTabsSessionToken = new androidx.browser.customtabs.CustomTabsSessionToken(iCustomTabsCallback, pendingIntent);
            try {
                android.os.IBinder.DeathRecipient deathRecipient = new android.os.IBinder.DeathRecipient() { // from class: androidx.browser.customtabs.CustomTabsService$1$$ExternalSyntheticLambda0
                    @Override // android.os.IBinder.DeathRecipient
                    public final void binderDied() {
                        this.f$0.m8x67c68af6(customTabsSessionToken);
                    }
                };
                synchronized (androidx.browser.customtabs.CustomTabsService.this.mDeathRecipientMap) {
                    iCustomTabsCallback.asBinder().linkToDeath(deathRecipient, 0);
                    androidx.browser.customtabs.CustomTabsService.this.mDeathRecipientMap.put(iCustomTabsCallback.asBinder(), deathRecipient);
                }
                return androidx.browser.customtabs.CustomTabsService.this.newSession(customTabsSessionToken);
            } catch (android.os.RemoteException unused) {
                return false;
            }
        }

        /* JADX INFO: renamed from: lambda$newSessionInternal$0$androidx-browser-customtabs-CustomTabsService$1, reason: not valid java name */
        /* synthetic */ void m8x67c68af6(androidx.browser.customtabs.CustomTabsSessionToken customTabsSessionToken) {
            androidx.browser.customtabs.CustomTabsService.this.cleanUpSession(customTabsSessionToken);
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean mayLaunchUrl(android.support.customtabs.ICustomTabsCallback iCustomTabsCallback, android.net.Uri uri, android.os.Bundle bundle, java.util.List<android.os.Bundle> list) {
            return androidx.browser.customtabs.CustomTabsService.this.mayLaunchUrl(new androidx.browser.customtabs.CustomTabsSessionToken(iCustomTabsCallback, getSessionIdFromBundle(bundle)), uri, bundle, list);
        }

        @Override // android.support.customtabs.ICustomTabsService
        public android.os.Bundle extraCommand(java.lang.String str, android.os.Bundle bundle) {
            return androidx.browser.customtabs.CustomTabsService.this.extraCommand(str, bundle);
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean updateVisuals(android.support.customtabs.ICustomTabsCallback iCustomTabsCallback, android.os.Bundle bundle) {
            return androidx.browser.customtabs.CustomTabsService.this.updateVisuals(new androidx.browser.customtabs.CustomTabsSessionToken(iCustomTabsCallback, getSessionIdFromBundle(bundle)), bundle);
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean requestPostMessageChannel(android.support.customtabs.ICustomTabsCallback iCustomTabsCallback, android.net.Uri uri) {
            return androidx.browser.customtabs.CustomTabsService.this.requestPostMessageChannel(new androidx.browser.customtabs.CustomTabsSessionToken(iCustomTabsCallback, null), uri, null, new android.os.Bundle());
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean requestPostMessageChannelWithExtras(android.support.customtabs.ICustomTabsCallback iCustomTabsCallback, android.net.Uri uri, android.os.Bundle bundle) {
            return androidx.browser.customtabs.CustomTabsService.this.requestPostMessageChannel(new androidx.browser.customtabs.CustomTabsSessionToken(iCustomTabsCallback, getSessionIdFromBundle(bundle)), uri, getTargetOriginFromBundle(bundle), bundle);
        }

        @Override // android.support.customtabs.ICustomTabsService
        public int postMessage(android.support.customtabs.ICustomTabsCallback iCustomTabsCallback, java.lang.String str, android.os.Bundle bundle) {
            return androidx.browser.customtabs.CustomTabsService.this.postMessage(new androidx.browser.customtabs.CustomTabsSessionToken(iCustomTabsCallback, getSessionIdFromBundle(bundle)), str, bundle);
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean validateRelationship(android.support.customtabs.ICustomTabsCallback iCustomTabsCallback, int i, android.net.Uri uri, android.os.Bundle bundle) {
            return androidx.browser.customtabs.CustomTabsService.this.validateRelationship(new androidx.browser.customtabs.CustomTabsSessionToken(iCustomTabsCallback, getSessionIdFromBundle(bundle)), i, uri, bundle);
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean receiveFile(android.support.customtabs.ICustomTabsCallback iCustomTabsCallback, android.net.Uri uri, int i, android.os.Bundle bundle) {
            return androidx.browser.customtabs.CustomTabsService.this.receiveFile(new androidx.browser.customtabs.CustomTabsSessionToken(iCustomTabsCallback, getSessionIdFromBundle(bundle)), uri, i, bundle);
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean isEngagementSignalsApiAvailable(android.support.customtabs.ICustomTabsCallback iCustomTabsCallback, android.os.Bundle bundle) {
            return androidx.browser.customtabs.CustomTabsService.this.isEngagementSignalsApiAvailable(new androidx.browser.customtabs.CustomTabsSessionToken(iCustomTabsCallback, getSessionIdFromBundle(bundle)), bundle);
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean setEngagementSignalsCallback(android.support.customtabs.ICustomTabsCallback iCustomTabsCallback, android.os.IBinder iBinder, android.os.Bundle bundle) {
            return androidx.browser.customtabs.CustomTabsService.this.setEngagementSignalsCallback(new androidx.browser.customtabs.CustomTabsSessionToken(iCustomTabsCallback, getSessionIdFromBundle(bundle)), androidx.browser.customtabs.EngagementSignalsCallbackRemote.fromBinder(iBinder), bundle);
        }

        private android.app.PendingIntent getSessionIdFromBundle(android.os.Bundle bundle) {
            if (bundle == null) {
                return null;
            }
            android.app.PendingIntent pendingIntent = (android.app.PendingIntent) bundle.getParcelable(androidx.browser.customtabs.CustomTabsIntent.EXTRA_SESSION_ID);
            bundle.remove(androidx.browser.customtabs.CustomTabsIntent.EXTRA_SESSION_ID);
            return pendingIntent;
        }

        private android.net.Uri getTargetOriginFromBundle(android.os.Bundle bundle) {
            if (bundle == null) {
                return null;
            }
            if (android.os.Build.VERSION.SDK_INT >= 33) {
                return (android.net.Uri) androidx.browser.customtabs.Api33Impl.getParcelable(bundle, "target_origin", android.net.Uri.class);
            }
            return (android.net.Uri) bundle.getParcelable("target_origin");
        }
    }

    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent intent) {
        return this.mBinder;
    }

    protected boolean cleanUpSession(androidx.browser.customtabs.CustomTabsSessionToken customTabsSessionToken) {
        try {
            synchronized (this.mDeathRecipientMap) {
                android.os.IBinder callbackBinder = customTabsSessionToken.getCallbackBinder();
                if (callbackBinder == null) {
                    return false;
                }
                callbackBinder.unlinkToDeath(this.mDeathRecipientMap.get(callbackBinder), 0);
                this.mDeathRecipientMap.remove(callbackBinder);
                return true;
            }
        } catch (java.util.NoSuchElementException unused) {
            return false;
        }
    }

    protected boolean requestPostMessageChannel(androidx.browser.customtabs.CustomTabsSessionToken customTabsSessionToken, android.net.Uri uri, android.net.Uri uri2, android.os.Bundle bundle) {
        return requestPostMessageChannel(customTabsSessionToken, uri);
    }
}
