package com.google.firebase.provider;

/* JADX INFO: loaded from: classes5.dex */
public class FirebaseInitProvider extends android.content.ContentProvider {
    static final java.lang.String EMPTY_APPLICATION_ID_PROVIDER_AUTHORITY = "com.google.firebase.firebaseinitprovider";
    private static final java.lang.String TAG = "FirebaseInitProvider";
    private static com.google.firebase.StartupTime startupTime = com.google.firebase.StartupTime.now();
    private static java.util.concurrent.atomic.AtomicBoolean currentlyInitializing = new java.util.concurrent.atomic.AtomicBoolean(false);

    @Override // android.content.ContentProvider
    public int delete(android.net.Uri uri, java.lang.String str, java.lang.String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public java.lang.String getType(android.net.Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public android.net.Uri insert(android.net.Uri uri, android.content.ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public android.database.Cursor query(android.net.Uri uri, java.lang.String[] strArr, java.lang.String str, java.lang.String[] strArr2, java.lang.String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(android.net.Uri uri, android.content.ContentValues contentValues, java.lang.String str, java.lang.String[] strArr) {
        return 0;
    }

    public static com.google.firebase.StartupTime getStartupTime() {
        return startupTime;
    }

    public static boolean isCurrentlyInitializing() {
        return currentlyInitializing.get();
    }

    @Override // android.content.ContentProvider
    public void attachInfo(android.content.Context context, android.content.pm.ProviderInfo providerInfo) {
        checkContentProviderAuthority(providerInfo);
        super.attachInfo(context, providerInfo);
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        try {
            currentlyInitializing.set(true);
            if (com.google.firebase.FirebaseApp.initializeApp(getContext()) == null) {
                android.util.Log.i(TAG, "FirebaseApp initialization unsuccessful");
            } else {
                android.util.Log.i(TAG, "FirebaseApp initialization successful");
            }
            return false;
        } finally {
            currentlyInitializing.set(false);
        }
    }

    private static void checkContentProviderAuthority(android.content.pm.ProviderInfo providerInfo) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(providerInfo, "FirebaseInitProvider ProviderInfo cannot be null.");
        if (EMPTY_APPLICATION_ID_PROVIDER_AUTHORITY.equals(providerInfo.authority)) {
            throw new java.lang.IllegalStateException("Incorrect provider authority in manifest. Most likely due to a missing applicationId variable in application's build.gradle.");
        }
    }
}
