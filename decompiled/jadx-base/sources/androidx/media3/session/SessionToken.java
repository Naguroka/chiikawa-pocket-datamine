package androidx.media3.session;

/* JADX INFO: loaded from: classes.dex */
public final class SessionToken {
    private static final java.lang.String FIELD_IMPL;
    private static final java.lang.String FIELD_IMPL_TYPE;
    private static final int IMPL_TYPE_BASE = 0;
    private static final int IMPL_TYPE_LEGACY = 1;
    static final int TYPE_BROWSER_SERVICE_LEGACY = 101;
    public static final int TYPE_LIBRARY_SERVICE = 2;
    public static final int TYPE_SESSION = 0;
    static final int TYPE_SESSION_LEGACY = 100;
    public static final int TYPE_SESSION_SERVICE = 1;
    private static final long WAIT_TIME_MS_FOR_SESSION3_TOKEN = 500;
    private final androidx.media3.session.SessionToken.SessionTokenImpl impl;

    interface SessionTokenImpl {
        java.lang.Object getBinder();

        android.content.ComponentName getComponentName();

        android.os.Bundle getExtras();

        int getInterfaceVersion();

        int getLibraryVersion();

        java.lang.String getPackageName();

        java.lang.String getServiceName();

        int getType();

        int getUid();

        boolean isLegacySession();

        android.os.Bundle toBundle();
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface TokenType {
    }

    static {
        androidx.media3.common.MediaLibraryInfo.registerModule("media3.session");
        FIELD_IMPL_TYPE = androidx.media3.common.util.Util.intToStringMaxRadix(0);
        FIELD_IMPL = androidx.media3.common.util.Util.intToStringMaxRadix(1);
    }

    public SessionToken(android.content.Context context, android.content.ComponentName componentName) {
        int i;
        androidx.media3.common.util.Assertions.checkNotNull(context, "context must not be null");
        androidx.media3.common.util.Assertions.checkNotNull(componentName, "serviceComponent must not be null");
        android.content.pm.PackageManager packageManager = context.getPackageManager();
        int uid = getUid(packageManager, componentName.getPackageName());
        if (isInterfaceDeclared(packageManager, androidx.media3.session.MediaLibraryService.SERVICE_INTERFACE, componentName)) {
            i = 2;
        } else if (isInterfaceDeclared(packageManager, androidx.media3.session.MediaSessionService.SERVICE_INTERFACE, componentName)) {
            i = 1;
        } else {
            if (!isInterfaceDeclared(packageManager, "android.media.browse.MediaBrowserService", componentName)) {
                throw new java.lang.IllegalArgumentException("Failed to resolve SessionToken for " + componentName + ". Manifest doesn't declare one of either MediaSessionService, MediaLibraryService, MediaBrowserService or MediaBrowserServiceCompat. Use service's full name.");
            }
            i = 101;
        }
        if (i != 101) {
            this.impl = new androidx.media3.session.SessionTokenImplBase(componentName, uid, i);
        } else {
            this.impl = new androidx.media3.session.SessionTokenImplLegacy(componentName, uid);
        }
    }

    SessionToken(int i, int i2, int i3, int i4, java.lang.String str, androidx.media3.session.IMediaSession iMediaSession, android.os.Bundle bundle) {
        this.impl = new androidx.media3.session.SessionTokenImplBase(i, i2, i3, i4, str, iMediaSession, bundle);
    }

    private SessionToken(androidx.media3.session.legacy.MediaSessionCompat.Token token, java.lang.String str, int i, android.os.Bundle bundle) {
        this.impl = new androidx.media3.session.SessionTokenImplLegacy(token, str, i, bundle);
    }

    private SessionToken(android.os.Bundle bundle) {
        java.lang.String str = FIELD_IMPL_TYPE;
        androidx.media3.common.util.Assertions.checkArgument(bundle.containsKey(str), "Impl type needs to be set.");
        int i = bundle.getInt(str);
        android.os.Bundle bundle2 = (android.os.Bundle) androidx.media3.common.util.Assertions.checkNotNull(bundle.getBundle(FIELD_IMPL));
        if (i == 0) {
            this.impl = androidx.media3.session.SessionTokenImplBase.fromBundle(bundle2);
        } else {
            this.impl = androidx.media3.session.SessionTokenImplLegacy.fromBundle(bundle2);
        }
    }

    public int hashCode() {
        return this.impl.hashCode();
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof androidx.media3.session.SessionToken) {
            return this.impl.equals(((androidx.media3.session.SessionToken) obj).impl);
        }
        return false;
    }

    public java.lang.String toString() {
        return this.impl.toString();
    }

    public int getUid() {
        return this.impl.getUid();
    }

    public java.lang.String getPackageName() {
        return this.impl.getPackageName();
    }

    public java.lang.String getServiceName() {
        return this.impl.getServiceName();
    }

    android.content.ComponentName getComponentName() {
        return this.impl.getComponentName();
    }

    public int getType() {
        return this.impl.getType();
    }

    public int getSessionVersion() {
        return this.impl.getLibraryVersion();
    }

    public int getInterfaceVersion() {
        return this.impl.getInterfaceVersion();
    }

    public android.os.Bundle getExtras() {
        return this.impl.getExtras();
    }

    boolean isLegacySession() {
        return this.impl.isLegacySession();
    }

    java.lang.Object getBinder() {
        return this.impl.getBinder();
    }

    public static com.google.common.util.concurrent.ListenableFuture<androidx.media3.session.SessionToken> createSessionToken(android.content.Context context, android.os.Parcelable parcelable) {
        return createSessionToken(context, createCompatToken(parcelable));
    }

    public static com.google.common.util.concurrent.ListenableFuture<androidx.media3.session.SessionToken> createSessionToken(android.content.Context context, android.os.Parcelable parcelable, android.os.Looper looper) {
        return createSessionToken(context, createCompatToken(parcelable), looper);
    }

    private static androidx.media3.session.legacy.MediaSessionCompat.Token createCompatToken(android.os.Parcelable parcelable) {
        if (androidx.media3.common.util.Util.SDK_INT >= 21 && (parcelable instanceof android.media.session.MediaSession.Token)) {
            return androidx.media3.session.legacy.MediaSessionCompat.Token.fromToken(parcelable);
        }
        return (androidx.media3.session.legacy.MediaSessionCompat.Token) androidx.media3.session.legacy.LegacyParcelableUtil.convert(parcelable, androidx.media3.session.legacy.MediaSessionCompat.Token.CREATOR);
    }

    private static com.google.common.util.concurrent.ListenableFuture<androidx.media3.session.SessionToken> createSessionToken(android.content.Context context, androidx.media3.session.legacy.MediaSessionCompat.Token token) {
        final android.os.HandlerThread handlerThread = new android.os.HandlerThread("SessionTokenThread");
        handlerThread.start();
        com.google.common.util.concurrent.ListenableFuture<androidx.media3.session.SessionToken> listenableFutureCreateSessionToken = createSessionToken(context, token, handlerThread.getLooper());
        java.util.Objects.requireNonNull(handlerThread);
        listenableFutureCreateSessionToken.addListener(new java.lang.Runnable() { // from class: androidx.media3.session.SessionToken$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                handlerThread.quit();
            }
        }, com.google.common.util.concurrent.MoreExecutors.directExecutor());
        return listenableFutureCreateSessionToken;
    }

    private static com.google.common.util.concurrent.ListenableFuture<androidx.media3.session.SessionToken> createSessionToken(final android.content.Context context, final androidx.media3.session.legacy.MediaSessionCompat.Token token, android.os.Looper looper) {
        androidx.media3.common.util.Assertions.checkNotNull(context, "context must not be null");
        androidx.media3.common.util.Assertions.checkNotNull(token, "compatToken must not be null");
        final com.google.common.util.concurrent.SettableFuture settableFutureCreate = com.google.common.util.concurrent.SettableFuture.create();
        final androidx.media3.session.legacy.MediaControllerCompat mediaControllerCompat = new androidx.media3.session.legacy.MediaControllerCompat(context, token);
        final java.lang.String str = (java.lang.String) androidx.media3.common.util.Assertions.checkNotNull(mediaControllerCompat.getPackageName());
        final android.os.Handler handler = new android.os.Handler(looper);
        final java.lang.Runnable runnable = new java.lang.Runnable() { // from class: androidx.media3.session.SessionToken$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                android.content.Context context2 = context;
                java.lang.String str2 = str;
                settableFutureCreate.set(new androidx.media3.session.SessionToken(token, str2, androidx.media3.session.SessionToken.getUid(context2.getPackageManager(), str2), mediaControllerCompat.getSessionInfo()));
            }
        };
        handler.postDelayed(runnable, 500L);
        mediaControllerCompat.sendCommand("androidx.media3.session.SESSION_COMMAND_REQUEST_SESSION3_TOKEN", null, new android.os.ResultReceiver(handler) { // from class: androidx.media3.session.SessionToken.1
            @Override // android.os.ResultReceiver
            protected void onReceiveResult(int i, android.os.Bundle bundle) {
                handler.removeCallbacksAndMessages(null);
                try {
                    settableFutureCreate.set(androidx.media3.session.SessionToken.fromBundle(bundle));
                } catch (java.lang.RuntimeException unused) {
                    runnable.run();
                }
            }
        });
        return settableFutureCreate;
    }

    public static com.google.common.collect.ImmutableSet<androidx.media3.session.SessionToken> getAllServiceTokens(android.content.Context context) {
        android.content.pm.PackageManager packageManager = context.getPackageManager();
        java.util.ArrayList<android.content.pm.ResolveInfo> arrayList = new java.util.ArrayList();
        java.util.List<android.content.pm.ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(new android.content.Intent(androidx.media3.session.MediaLibraryService.SERVICE_INTERFACE), 128);
        if (listQueryIntentServices != null) {
            arrayList.addAll(listQueryIntentServices);
        }
        java.util.List<android.content.pm.ResolveInfo> listQueryIntentServices2 = packageManager.queryIntentServices(new android.content.Intent(androidx.media3.session.MediaSessionService.SERVICE_INTERFACE), 128);
        if (listQueryIntentServices2 != null) {
            arrayList.addAll(listQueryIntentServices2);
        }
        java.util.List<android.content.pm.ResolveInfo> listQueryIntentServices3 = packageManager.queryIntentServices(new android.content.Intent("android.media.browse.MediaBrowserService"), 128);
        if (listQueryIntentServices3 != null) {
            arrayList.addAll(listQueryIntentServices3);
        }
        com.google.common.collect.ImmutableSet.Builder builder = com.google.common.collect.ImmutableSet.builder();
        for (android.content.pm.ResolveInfo resolveInfo : arrayList) {
            if (resolveInfo != null && resolveInfo.serviceInfo != null) {
                android.content.pm.ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                builder.add(new androidx.media3.session.SessionToken(context, new android.content.ComponentName(serviceInfo.packageName, serviceInfo.name)));
            }
        }
        return builder.build();
    }

    private static boolean isInterfaceDeclared(android.content.pm.PackageManager packageManager, java.lang.String str, android.content.ComponentName componentName) {
        android.content.Intent intent = new android.content.Intent(str);
        intent.setPackage(componentName.getPackageName());
        java.util.List<android.content.pm.ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, 128);
        if (listQueryIntentServices != null) {
            for (int i = 0; i < listQueryIntentServices.size(); i++) {
                android.content.pm.ResolveInfo resolveInfo = listQueryIntentServices.get(i);
                if (resolveInfo != null && resolveInfo.serviceInfo != null && android.text.TextUtils.equals(resolveInfo.serviceInfo.name, componentName.getClassName())) {
                    return true;
                }
            }
        }
        return false;
    }

    private static int getUid(android.content.pm.PackageManager packageManager, java.lang.String str) {
        try {
            return packageManager.getApplicationInfo(str, 0).uid;
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            return -1;
        }
    }

    public android.os.Bundle toBundle() {
        android.os.Bundle bundle = new android.os.Bundle();
        if (this.impl instanceof androidx.media3.session.SessionTokenImplBase) {
            bundle.putInt(FIELD_IMPL_TYPE, 0);
        } else {
            bundle.putInt(FIELD_IMPL_TYPE, 1);
        }
        bundle.putBundle(FIELD_IMPL, this.impl.toBundle());
        return bundle;
    }

    public static androidx.media3.session.SessionToken fromBundle(android.os.Bundle bundle) {
        return new androidx.media3.session.SessionToken(bundle);
    }
}
