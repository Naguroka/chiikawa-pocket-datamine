package androidx.appcompat.app;

/* JADX INFO: loaded from: classes.dex */
public abstract class AppCompatDelegate {
    static final boolean DEBUG = false;
    public static final int FEATURE_ACTION_MODE_OVERLAY = 10;
    public static final int FEATURE_SUPPORT_ACTION_BAR = 108;
    public static final int FEATURE_SUPPORT_ACTION_BAR_OVERLAY = 109;

    @java.lang.Deprecated
    public static final int MODE_NIGHT_AUTO = 0;
    public static final int MODE_NIGHT_AUTO_BATTERY = 3;

    @java.lang.Deprecated
    public static final int MODE_NIGHT_AUTO_TIME = 0;
    public static final int MODE_NIGHT_FOLLOW_SYSTEM = -1;
    public static final int MODE_NIGHT_NO = 1;
    public static final int MODE_NIGHT_UNSPECIFIED = -100;
    public static final int MODE_NIGHT_YES = 2;
    static final java.lang.String TAG = "AppCompatDelegate";
    static androidx.appcompat.app.AppLocalesStorageHelper.SerialExecutor sSerialExecutorForLocalesStorage = new androidx.appcompat.app.AppLocalesStorageHelper.SerialExecutor(new androidx.appcompat.app.AppLocalesStorageHelper.ThreadPerTaskExecutor());
    private static int sDefaultNightMode = -100;
    private static androidx.core.os.LocaleListCompat sRequestedAppLocales = null;
    private static androidx.core.os.LocaleListCompat sStoredAppLocales = null;
    private static java.lang.Boolean sIsAutoStoreLocalesOptedIn = null;
    private static boolean sIsFrameworkSyncChecked = false;
    private static java.lang.Object sLocaleManager = null;
    private static android.content.Context sAppContext = null;
    private static final androidx.collection.ArraySet<java.lang.ref.WeakReference<androidx.appcompat.app.AppCompatDelegate>> sActivityDelegates = new androidx.collection.ArraySet<>();
    private static final java.lang.Object sActivityDelegatesLock = new java.lang.Object();
    private static final java.lang.Object sAppLocalesStorageSyncLock = new java.lang.Object();

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface NightMode {
    }

    public abstract void addContentView(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams);

    boolean applyAppLocales() {
        return false;
    }

    public abstract boolean applyDayNight();

    @java.lang.Deprecated
    public void attachBaseContext(android.content.Context context) {
    }

    public abstract android.view.View createView(android.view.View view, java.lang.String str, android.content.Context context, android.util.AttributeSet attributeSet);

    public abstract <T extends android.view.View> T findViewById(int i);

    public android.content.Context getContextForDelegate() {
        return null;
    }

    public abstract androidx.appcompat.app.ActionBarDrawerToggle.Delegate getDrawerToggleDelegate();

    public int getLocalNightMode() {
        return -100;
    }

    public abstract android.view.MenuInflater getMenuInflater();

    public abstract androidx.appcompat.app.ActionBar getSupportActionBar();

    public abstract boolean hasWindowFeature(int i);

    public abstract void installViewFactory();

    public abstract void invalidateOptionsMenu();

    public abstract boolean isHandleNativeActionModesEnabled();

    public abstract void onConfigurationChanged(android.content.res.Configuration configuration);

    public abstract void onCreate(android.os.Bundle bundle);

    public abstract void onDestroy();

    public abstract void onPostCreate(android.os.Bundle bundle);

    public abstract void onPostResume();

    public abstract void onSaveInstanceState(android.os.Bundle bundle);

    public abstract void onStart();

    public abstract void onStop();

    public abstract boolean requestWindowFeature(int i);

    public abstract void setContentView(int i);

    public abstract void setContentView(android.view.View view);

    public abstract void setContentView(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams);

    public abstract void setHandleNativeActionModesEnabled(boolean z);

    public abstract void setLocalNightMode(int i);

    public void setOnBackInvokedDispatcher(android.window.OnBackInvokedDispatcher onBackInvokedDispatcher) {
    }

    public abstract void setSupportActionBar(androidx.appcompat.widget.Toolbar toolbar);

    public void setTheme(int i) {
    }

    public abstract void setTitle(java.lang.CharSequence charSequence);

    public abstract androidx.appcompat.view.ActionMode startSupportActionMode(androidx.appcompat.view.ActionMode.Callback callback);

    public static androidx.appcompat.app.AppCompatDelegate create(android.app.Activity activity, androidx.appcompat.app.AppCompatCallback appCompatCallback) {
        return new androidx.appcompat.app.AppCompatDelegateImpl(activity, appCompatCallback);
    }

    public static androidx.appcompat.app.AppCompatDelegate create(android.app.Dialog dialog, androidx.appcompat.app.AppCompatCallback appCompatCallback) {
        return new androidx.appcompat.app.AppCompatDelegateImpl(dialog, appCompatCallback);
    }

    public static androidx.appcompat.app.AppCompatDelegate create(android.content.Context context, android.view.Window window, androidx.appcompat.app.AppCompatCallback appCompatCallback) {
        return new androidx.appcompat.app.AppCompatDelegateImpl(context, window, appCompatCallback);
    }

    public static androidx.appcompat.app.AppCompatDelegate create(android.content.Context context, android.app.Activity activity, androidx.appcompat.app.AppCompatCallback appCompatCallback) {
        return new androidx.appcompat.app.AppCompatDelegateImpl(context, activity, appCompatCallback);
    }

    AppCompatDelegate() {
    }

    public android.content.Context attachBaseContext2(android.content.Context context) {
        attachBaseContext(context);
        return context;
    }

    public static void setDefaultNightMode(int i) {
        if (i == -1 || i == 0 || i == 1 || i == 2 || i == 3) {
            if (sDefaultNightMode != i) {
                sDefaultNightMode = i;
                applyDayNightToActiveDelegates();
                return;
            }
            return;
        }
        android.util.Log.d(TAG, "setDefaultNightMode() called with an unknown mode");
    }

    public static void setApplicationLocales(androidx.core.os.LocaleListCompat localeListCompat) {
        java.util.Objects.requireNonNull(localeListCompat);
        if (androidx.core.os.BuildCompat.isAtLeastT()) {
            java.lang.Object localeManagerForApplication = getLocaleManagerForApplication();
            if (localeManagerForApplication != null) {
                androidx.appcompat.app.AppCompatDelegate.Api33Impl.localeManagerSetApplicationLocales(localeManagerForApplication, androidx.appcompat.app.AppCompatDelegate.Api24Impl.localeListForLanguageTags(localeListCompat.toLanguageTags()));
                return;
            }
            return;
        }
        if (localeListCompat.equals(sRequestedAppLocales)) {
            return;
        }
        synchronized (sActivityDelegatesLock) {
            sRequestedAppLocales = localeListCompat;
            applyLocalesToActiveDelegates();
        }
    }

    public static androidx.core.os.LocaleListCompat getApplicationLocales() {
        if (androidx.core.os.BuildCompat.isAtLeastT()) {
            java.lang.Object localeManagerForApplication = getLocaleManagerForApplication();
            if (localeManagerForApplication != null) {
                return androidx.core.os.LocaleListCompat.wrap(androidx.appcompat.app.AppCompatDelegate.Api33Impl.localeManagerGetApplicationLocales(localeManagerForApplication));
            }
        } else {
            androidx.core.os.LocaleListCompat localeListCompat = sRequestedAppLocales;
            if (localeListCompat != null) {
                return localeListCompat;
            }
        }
        return androidx.core.os.LocaleListCompat.getEmptyLocaleList();
    }

    public static int getDefaultNightMode() {
        return sDefaultNightMode;
    }

    static androidx.core.os.LocaleListCompat getRequestedAppLocales() {
        return sRequestedAppLocales;
    }

    static androidx.core.os.LocaleListCompat getStoredAppLocales() {
        return sStoredAppLocales;
    }

    static void resetStaticRequestedAndStoredLocales() {
        sRequestedAppLocales = null;
        sStoredAppLocales = null;
    }

    static void setIsAutoStoreLocalesOptedIn(boolean z) {
        sIsAutoStoreLocalesOptedIn = java.lang.Boolean.valueOf(z);
    }

    static java.lang.Object getLocaleManagerForApplication() {
        android.content.Context contextForDelegate;
        java.lang.Object obj = sLocaleManager;
        if (obj != null) {
            return obj;
        }
        if (sAppContext == null) {
            java.util.Iterator<java.lang.ref.WeakReference<androidx.appcompat.app.AppCompatDelegate>> it = sActivityDelegates.iterator();
            while (it.hasNext()) {
                androidx.appcompat.app.AppCompatDelegate appCompatDelegate = it.next().get();
                if (appCompatDelegate != null && (contextForDelegate = appCompatDelegate.getContextForDelegate()) != null) {
                    sAppContext = contextForDelegate;
                    break;
                }
            }
        }
        android.content.Context context = sAppContext;
        if (context != null) {
            sLocaleManager = context.getSystemService("locale");
        }
        return sLocaleManager;
    }

    static boolean isAutoStorageOptedIn(android.content.Context context) {
        if (sIsAutoStoreLocalesOptedIn == null) {
            try {
                android.content.pm.ServiceInfo serviceInfo = androidx.appcompat.app.AppLocalesMetadataHolderService.getServiceInfo(context);
                if (serviceInfo.metaData != null) {
                    sIsAutoStoreLocalesOptedIn = java.lang.Boolean.valueOf(serviceInfo.metaData.getBoolean("autoStoreLocales"));
                }
            } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
                android.util.Log.d(TAG, "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                sIsAutoStoreLocalesOptedIn = false;
            }
        }
        return sIsAutoStoreLocalesOptedIn.booleanValue();
    }

    void asyncExecuteSyncRequestedAndStoredLocales(final android.content.Context context) {
        sSerialExecutorForLocalesStorage.execute(new java.lang.Runnable() { // from class: androidx.appcompat.app.AppCompatDelegate$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                androidx.appcompat.app.AppCompatDelegate.syncRequestedAndStoredLocales(context);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void syncRequestedAndStoredLocales(final android.content.Context context) {
        if (isAutoStorageOptedIn(context)) {
            if (androidx.core.os.BuildCompat.isAtLeastT()) {
                if (sIsFrameworkSyncChecked) {
                    return;
                }
                sSerialExecutorForLocalesStorage.execute(new java.lang.Runnable() { // from class: androidx.appcompat.app.AppCompatDelegate$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.appcompat.app.AppCompatDelegate.lambda$syncRequestedAndStoredLocales$1(context);
                    }
                });
                return;
            }
            synchronized (sAppLocalesStorageSyncLock) {
                androidx.core.os.LocaleListCompat localeListCompat = sRequestedAppLocales;
                if (localeListCompat == null) {
                    if (sStoredAppLocales == null) {
                        sStoredAppLocales = androidx.core.os.LocaleListCompat.forLanguageTags(androidx.appcompat.app.AppLocalesStorageHelper.readLocales(context));
                    }
                    if (sStoredAppLocales.isEmpty()) {
                    } else {
                        sRequestedAppLocales = sStoredAppLocales;
                    }
                } else if (!localeListCompat.equals(sStoredAppLocales)) {
                    androidx.core.os.LocaleListCompat localeListCompat2 = sRequestedAppLocales;
                    sStoredAppLocales = localeListCompat2;
                    androidx.appcompat.app.AppLocalesStorageHelper.persistLocales(context, localeListCompat2.toLanguageTags());
                }
            }
        }
    }

    static /* synthetic */ void lambda$syncRequestedAndStoredLocales$1(android.content.Context context) {
        androidx.appcompat.app.AppLocalesStorageHelper.syncLocalesToFramework(context);
        sIsFrameworkSyncChecked = true;
    }

    static void setAppContext(android.content.Context context) {
        sAppContext = context;
    }

    public static void setCompatVectorFromResourcesEnabled(boolean z) {
        androidx.appcompat.widget.VectorEnabledTintResources.setCompatVectorFromResourcesEnabled(z);
    }

    public static boolean isCompatVectorFromResourcesEnabled() {
        return androidx.appcompat.widget.VectorEnabledTintResources.isCompatVectorFromResourcesEnabled();
    }

    static void addActiveDelegate(androidx.appcompat.app.AppCompatDelegate appCompatDelegate) {
        synchronized (sActivityDelegatesLock) {
            removeDelegateFromActives(appCompatDelegate);
            sActivityDelegates.add(new java.lang.ref.WeakReference<>(appCompatDelegate));
        }
    }

    static void removeActivityDelegate(androidx.appcompat.app.AppCompatDelegate appCompatDelegate) {
        synchronized (sActivityDelegatesLock) {
            removeDelegateFromActives(appCompatDelegate);
        }
    }

    private static void removeDelegateFromActives(androidx.appcompat.app.AppCompatDelegate appCompatDelegate) {
        synchronized (sActivityDelegatesLock) {
            java.util.Iterator<java.lang.ref.WeakReference<androidx.appcompat.app.AppCompatDelegate>> it = sActivityDelegates.iterator();
            while (it.hasNext()) {
                androidx.appcompat.app.AppCompatDelegate appCompatDelegate2 = it.next().get();
                if (appCompatDelegate2 == appCompatDelegate || appCompatDelegate2 == null) {
                    it.remove();
                }
            }
        }
    }

    private static void applyDayNightToActiveDelegates() {
        synchronized (sActivityDelegatesLock) {
            java.util.Iterator<java.lang.ref.WeakReference<androidx.appcompat.app.AppCompatDelegate>> it = sActivityDelegates.iterator();
            while (it.hasNext()) {
                androidx.appcompat.app.AppCompatDelegate appCompatDelegate = it.next().get();
                if (appCompatDelegate != null) {
                    appCompatDelegate.applyDayNight();
                }
            }
        }
    }

    private static void applyLocalesToActiveDelegates() {
        java.util.Iterator<java.lang.ref.WeakReference<androidx.appcompat.app.AppCompatDelegate>> it = sActivityDelegates.iterator();
        while (it.hasNext()) {
            androidx.appcompat.app.AppCompatDelegate appCompatDelegate = it.next().get();
            if (appCompatDelegate != null) {
                appCompatDelegate.applyAppLocales();
            }
        }
    }

    static class Api24Impl {
        private Api24Impl() {
        }

        static android.os.LocaleList localeListForLanguageTags(java.lang.String str) {
            return android.os.LocaleList.forLanguageTags(str);
        }
    }

    static class Api33Impl {
        private Api33Impl() {
        }

        static void localeManagerSetApplicationLocales(java.lang.Object obj, android.os.LocaleList localeList) {
            ((android.app.LocaleManager) obj).setApplicationLocales(localeList);
        }

        static android.os.LocaleList localeManagerGetApplicationLocales(java.lang.Object obj) {
            return ((android.app.LocaleManager) obj).getApplicationLocales();
        }
    }
}
