package androidx.core.content.pm;

/* JADX INFO: loaded from: classes.dex */
public class ShortcutManagerCompat {
    static final java.lang.String ACTION_INSTALL_SHORTCUT = "com.android.launcher.action.INSTALL_SHORTCUT";
    private static final int DEFAULT_MAX_ICON_DIMENSION_DP = 96;
    private static final int DEFAULT_MAX_ICON_DIMENSION_LOWRAM_DP = 48;
    public static final java.lang.String EXTRA_SHORTCUT_ID = "android.intent.extra.shortcut.ID";
    public static final int FLAG_MATCH_CACHED = 8;
    public static final int FLAG_MATCH_DYNAMIC = 2;
    public static final int FLAG_MATCH_MANIFEST = 1;
    public static final int FLAG_MATCH_PINNED = 4;
    static final java.lang.String INSTALL_SHORTCUT_PERMISSION = "com.android.launcher.permission.INSTALL_SHORTCUT";
    private static final java.lang.String SHORTCUT_LISTENER_INTENT_FILTER_ACTION = "androidx.core.content.pm.SHORTCUT_LISTENER";
    private static final java.lang.String SHORTCUT_LISTENER_META_DATA_KEY = "androidx.core.content.pm.shortcut_listener_impl";
    private static volatile java.util.List<androidx.core.content.pm.ShortcutInfoChangeListener> sShortcutInfoChangeListeners;
    private static volatile androidx.core.content.pm.ShortcutInfoCompatSaver<?> sShortcutInfoCompatSaver;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface ShortcutMatchFlags {
    }

    private ShortcutManagerCompat() {
    }

    public static boolean isRequestPinShortcutSupported(android.content.Context context) {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            return ((android.content.pm.ShortcutManager) context.getSystemService(android.content.pm.ShortcutManager.class)).isRequestPinShortcutSupported();
        }
        if (androidx.core.content.ContextCompat.checkSelfPermission(context, INSTALL_SHORTCUT_PERMISSION) != 0) {
            return false;
        }
        java.util.Iterator<android.content.pm.ResolveInfo> it = context.getPackageManager().queryBroadcastReceivers(new android.content.Intent(ACTION_INSTALL_SHORTCUT), 0).iterator();
        while (it.hasNext()) {
            java.lang.String str = it.next().activityInfo.permission;
            if (android.text.TextUtils.isEmpty(str) || INSTALL_SHORTCUT_PERMISSION.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static boolean requestPinShortcut(android.content.Context context, androidx.core.content.pm.ShortcutInfoCompat shortcutInfoCompat, final android.content.IntentSender intentSender) {
        if (android.os.Build.VERSION.SDK_INT <= 31 && shortcutInfoCompat.isExcludedFromSurfaces(1)) {
            return false;
        }
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            return ((android.content.pm.ShortcutManager) context.getSystemService(android.content.pm.ShortcutManager.class)).requestPinShortcut(shortcutInfoCompat.toShortcutInfo(), intentSender);
        }
        if (!isRequestPinShortcutSupported(context)) {
            return false;
        }
        android.content.Intent intentAddToIntent = shortcutInfoCompat.addToIntent(new android.content.Intent(ACTION_INSTALL_SHORTCUT));
        if (intentSender == null) {
            context.sendBroadcast(intentAddToIntent);
            return true;
        }
        context.sendOrderedBroadcast(intentAddToIntent, null, new android.content.BroadcastReceiver() { // from class: androidx.core.content.pm.ShortcutManagerCompat.1
            @Override // android.content.BroadcastReceiver
            public void onReceive(android.content.Context context2, android.content.Intent intent) {
                try {
                    intentSender.sendIntent(context2, 0, null, null, null);
                } catch (android.content.IntentSender.SendIntentException unused) {
                }
            }
        }, null, -1, null, null);
        return true;
    }

    public static android.content.Intent createShortcutResultIntent(android.content.Context context, androidx.core.content.pm.ShortcutInfoCompat shortcutInfoCompat) {
        android.content.Intent intentCreateShortcutResultIntent = android.os.Build.VERSION.SDK_INT >= 26 ? ((android.content.pm.ShortcutManager) context.getSystemService(android.content.pm.ShortcutManager.class)).createShortcutResultIntent(shortcutInfoCompat.toShortcutInfo()) : null;
        if (intentCreateShortcutResultIntent == null) {
            intentCreateShortcutResultIntent = new android.content.Intent();
        }
        return shortcutInfoCompat.addToIntent(intentCreateShortcutResultIntent);
    }

    public static java.util.List<androidx.core.content.pm.ShortcutInfoCompat> getShortcuts(android.content.Context context, int i) {
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            return androidx.core.content.pm.ShortcutInfoCompat.fromShortcuts(context, ((android.content.pm.ShortcutManager) context.getSystemService(android.content.pm.ShortcutManager.class)).getShortcuts(i));
        }
        if (android.os.Build.VERSION.SDK_INT >= 25) {
            android.content.pm.ShortcutManager shortcutManager = (android.content.pm.ShortcutManager) context.getSystemService(android.content.pm.ShortcutManager.class);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            if ((i & 1) != 0) {
                arrayList.addAll(shortcutManager.getManifestShortcuts());
            }
            if ((i & 2) != 0) {
                arrayList.addAll(shortcutManager.getDynamicShortcuts());
            }
            if ((i & 4) != 0) {
                arrayList.addAll(shortcutManager.getPinnedShortcuts());
            }
            return androidx.core.content.pm.ShortcutInfoCompat.fromShortcuts(context, arrayList);
        }
        if ((i & 2) != 0) {
            try {
                return getShortcutInfoSaverInstance(context).getShortcuts();
            } catch (java.lang.Exception unused) {
            }
        }
        return java.util.Collections.emptyList();
    }

    public static boolean addDynamicShortcuts(android.content.Context context, java.util.List<androidx.core.content.pm.ShortcutInfoCompat> list) {
        java.util.List<androidx.core.content.pm.ShortcutInfoCompat> listRemoveShortcutsExcludedFromSurface = removeShortcutsExcludedFromSurface(list, 1);
        if (android.os.Build.VERSION.SDK_INT <= 29) {
            convertUriIconsToBitmapIcons(context, listRemoveShortcutsExcludedFromSurface);
        }
        if (android.os.Build.VERSION.SDK_INT >= 25) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator<androidx.core.content.pm.ShortcutInfoCompat> it = listRemoveShortcutsExcludedFromSurface.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().toShortcutInfo());
            }
            if (!((android.content.pm.ShortcutManager) context.getSystemService(android.content.pm.ShortcutManager.class)).addDynamicShortcuts(arrayList)) {
                return false;
            }
        }
        getShortcutInfoSaverInstance(context).addShortcuts(listRemoveShortcutsExcludedFromSurface);
        java.util.Iterator<androidx.core.content.pm.ShortcutInfoChangeListener> it2 = getShortcutInfoListeners(context).iterator();
        while (it2.hasNext()) {
            it2.next().onShortcutAdded(list);
        }
        return true;
    }

    public static int getMaxShortcutCountPerActivity(android.content.Context context) {
        androidx.core.util.Preconditions.checkNotNull(context);
        if (android.os.Build.VERSION.SDK_INT >= 25) {
            return ((android.content.pm.ShortcutManager) context.getSystemService(android.content.pm.ShortcutManager.class)).getMaxShortcutCountPerActivity();
        }
        return 5;
    }

    public static boolean isRateLimitingActive(android.content.Context context) {
        androidx.core.util.Preconditions.checkNotNull(context);
        if (android.os.Build.VERSION.SDK_INT >= 25) {
            return ((android.content.pm.ShortcutManager) context.getSystemService(android.content.pm.ShortcutManager.class)).isRateLimitingActive();
        }
        return getShortcuts(context, 3).size() == getMaxShortcutCountPerActivity(context);
    }

    public static int getIconMaxWidth(android.content.Context context) {
        androidx.core.util.Preconditions.checkNotNull(context);
        if (android.os.Build.VERSION.SDK_INT >= 25) {
            return ((android.content.pm.ShortcutManager) context.getSystemService(android.content.pm.ShortcutManager.class)).getIconMaxWidth();
        }
        return getIconDimensionInternal(context, true);
    }

    public static int getIconMaxHeight(android.content.Context context) {
        androidx.core.util.Preconditions.checkNotNull(context);
        if (android.os.Build.VERSION.SDK_INT >= 25) {
            return ((android.content.pm.ShortcutManager) context.getSystemService(android.content.pm.ShortcutManager.class)).getIconMaxHeight();
        }
        return getIconDimensionInternal(context, false);
    }

    public static void reportShortcutUsed(android.content.Context context, java.lang.String str) {
        androidx.core.util.Preconditions.checkNotNull(context);
        androidx.core.util.Preconditions.checkNotNull(str);
        if (android.os.Build.VERSION.SDK_INT >= 25) {
            ((android.content.pm.ShortcutManager) context.getSystemService(android.content.pm.ShortcutManager.class)).reportShortcutUsed(str);
        }
        java.util.Iterator<androidx.core.content.pm.ShortcutInfoChangeListener> it = getShortcutInfoListeners(context).iterator();
        while (it.hasNext()) {
            it.next().onShortcutUsageReported(java.util.Collections.singletonList(str));
        }
    }

    public static boolean setDynamicShortcuts(android.content.Context context, java.util.List<androidx.core.content.pm.ShortcutInfoCompat> list) {
        androidx.core.util.Preconditions.checkNotNull(context);
        androidx.core.util.Preconditions.checkNotNull(list);
        java.util.List<androidx.core.content.pm.ShortcutInfoCompat> listRemoveShortcutsExcludedFromSurface = removeShortcutsExcludedFromSurface(list, 1);
        if (android.os.Build.VERSION.SDK_INT >= 25) {
            java.util.ArrayList arrayList = new java.util.ArrayList(listRemoveShortcutsExcludedFromSurface.size());
            java.util.Iterator<androidx.core.content.pm.ShortcutInfoCompat> it = listRemoveShortcutsExcludedFromSurface.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().toShortcutInfo());
            }
            if (!((android.content.pm.ShortcutManager) context.getSystemService(android.content.pm.ShortcutManager.class)).setDynamicShortcuts(arrayList)) {
                return false;
            }
        }
        getShortcutInfoSaverInstance(context).removeAllShortcuts();
        getShortcutInfoSaverInstance(context).addShortcuts(listRemoveShortcutsExcludedFromSurface);
        for (androidx.core.content.pm.ShortcutInfoChangeListener shortcutInfoChangeListener : getShortcutInfoListeners(context)) {
            shortcutInfoChangeListener.onAllShortcutsRemoved();
            shortcutInfoChangeListener.onShortcutAdded(list);
        }
        return true;
    }

    public static java.util.List<androidx.core.content.pm.ShortcutInfoCompat> getDynamicShortcuts(android.content.Context context) {
        if (android.os.Build.VERSION.SDK_INT >= 25) {
            java.util.List<android.content.pm.ShortcutInfo> dynamicShortcuts = ((android.content.pm.ShortcutManager) context.getSystemService(android.content.pm.ShortcutManager.class)).getDynamicShortcuts();
            java.util.ArrayList arrayList = new java.util.ArrayList(dynamicShortcuts.size());
            java.util.Iterator<android.content.pm.ShortcutInfo> it = dynamicShortcuts.iterator();
            while (it.hasNext()) {
                arrayList.add(new androidx.core.content.pm.ShortcutInfoCompat.Builder(context, it.next()).build());
            }
            return arrayList;
        }
        try {
            return getShortcutInfoSaverInstance(context).getShortcuts();
        } catch (java.lang.Exception unused) {
            return new java.util.ArrayList();
        }
    }

    public static boolean updateShortcuts(android.content.Context context, java.util.List<androidx.core.content.pm.ShortcutInfoCompat> list) {
        java.util.List<androidx.core.content.pm.ShortcutInfoCompat> listRemoveShortcutsExcludedFromSurface = removeShortcutsExcludedFromSurface(list, 1);
        if (android.os.Build.VERSION.SDK_INT <= 29) {
            convertUriIconsToBitmapIcons(context, listRemoveShortcutsExcludedFromSurface);
        }
        if (android.os.Build.VERSION.SDK_INT >= 25) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator<androidx.core.content.pm.ShortcutInfoCompat> it = listRemoveShortcutsExcludedFromSurface.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().toShortcutInfo());
            }
            if (!((android.content.pm.ShortcutManager) context.getSystemService(android.content.pm.ShortcutManager.class)).updateShortcuts(arrayList)) {
                return false;
            }
        }
        getShortcutInfoSaverInstance(context).addShortcuts(listRemoveShortcutsExcludedFromSurface);
        java.util.Iterator<androidx.core.content.pm.ShortcutInfoChangeListener> it2 = getShortcutInfoListeners(context).iterator();
        while (it2.hasNext()) {
            it2.next().onShortcutUpdated(list);
        }
        return true;
    }

    static boolean convertUriIconToBitmapIcon(android.content.Context context, androidx.core.content.pm.ShortcutInfoCompat shortcutInfoCompat) {
        android.graphics.Bitmap bitmapDecodeStream;
        androidx.core.graphics.drawable.IconCompat iconCompatCreateWithBitmap;
        if (shortcutInfoCompat.mIcon == null) {
            return false;
        }
        int i = shortcutInfoCompat.mIcon.mType;
        if (i != 6 && i != 4) {
            return true;
        }
        java.io.InputStream uriInputStream = shortcutInfoCompat.mIcon.getUriInputStream(context);
        if (uriInputStream == null || (bitmapDecodeStream = android.graphics.BitmapFactory.decodeStream(uriInputStream)) == null) {
            return false;
        }
        if (i == 6) {
            iconCompatCreateWithBitmap = androidx.core.graphics.drawable.IconCompat.createWithAdaptiveBitmap(bitmapDecodeStream);
        } else {
            iconCompatCreateWithBitmap = androidx.core.graphics.drawable.IconCompat.createWithBitmap(bitmapDecodeStream);
        }
        shortcutInfoCompat.mIcon = iconCompatCreateWithBitmap;
        return true;
    }

    static void convertUriIconsToBitmapIcons(android.content.Context context, java.util.List<androidx.core.content.pm.ShortcutInfoCompat> list) {
        for (androidx.core.content.pm.ShortcutInfoCompat shortcutInfoCompat : new java.util.ArrayList(list)) {
            if (!convertUriIconToBitmapIcon(context, shortcutInfoCompat)) {
                list.remove(shortcutInfoCompat);
            }
        }
    }

    public static void disableShortcuts(android.content.Context context, java.util.List<java.lang.String> list, java.lang.CharSequence charSequence) {
        if (android.os.Build.VERSION.SDK_INT >= 25) {
            ((android.content.pm.ShortcutManager) context.getSystemService(android.content.pm.ShortcutManager.class)).disableShortcuts(list, charSequence);
        }
        getShortcutInfoSaverInstance(context).removeShortcuts(list);
        java.util.Iterator<androidx.core.content.pm.ShortcutInfoChangeListener> it = getShortcutInfoListeners(context).iterator();
        while (it.hasNext()) {
            it.next().onShortcutRemoved(list);
        }
    }

    public static void enableShortcuts(android.content.Context context, java.util.List<androidx.core.content.pm.ShortcutInfoCompat> list) {
        java.util.List<androidx.core.content.pm.ShortcutInfoCompat> listRemoveShortcutsExcludedFromSurface = removeShortcutsExcludedFromSurface(list, 1);
        if (android.os.Build.VERSION.SDK_INT >= 25) {
            java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
            java.util.Iterator<androidx.core.content.pm.ShortcutInfoCompat> it = listRemoveShortcutsExcludedFromSurface.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().mId);
            }
            ((android.content.pm.ShortcutManager) context.getSystemService(android.content.pm.ShortcutManager.class)).enableShortcuts(arrayList);
        }
        getShortcutInfoSaverInstance(context).addShortcuts(listRemoveShortcutsExcludedFromSurface);
        java.util.Iterator<androidx.core.content.pm.ShortcutInfoChangeListener> it2 = getShortcutInfoListeners(context).iterator();
        while (it2.hasNext()) {
            it2.next().onShortcutAdded(list);
        }
    }

    public static void removeDynamicShortcuts(android.content.Context context, java.util.List<java.lang.String> list) {
        if (android.os.Build.VERSION.SDK_INT >= 25) {
            ((android.content.pm.ShortcutManager) context.getSystemService(android.content.pm.ShortcutManager.class)).removeDynamicShortcuts(list);
        }
        getShortcutInfoSaverInstance(context).removeShortcuts(list);
        java.util.Iterator<androidx.core.content.pm.ShortcutInfoChangeListener> it = getShortcutInfoListeners(context).iterator();
        while (it.hasNext()) {
            it.next().onShortcutRemoved(list);
        }
    }

    public static void removeAllDynamicShortcuts(android.content.Context context) {
        if (android.os.Build.VERSION.SDK_INT >= 25) {
            ((android.content.pm.ShortcutManager) context.getSystemService(android.content.pm.ShortcutManager.class)).removeAllDynamicShortcuts();
        }
        getShortcutInfoSaverInstance(context).removeAllShortcuts();
        java.util.Iterator<androidx.core.content.pm.ShortcutInfoChangeListener> it = getShortcutInfoListeners(context).iterator();
        while (it.hasNext()) {
            it.next().onAllShortcutsRemoved();
        }
    }

    public static void removeLongLivedShortcuts(android.content.Context context, java.util.List<java.lang.String> list) {
        if (android.os.Build.VERSION.SDK_INT < 30) {
            removeDynamicShortcuts(context, list);
            return;
        }
        ((android.content.pm.ShortcutManager) context.getSystemService(android.content.pm.ShortcutManager.class)).removeLongLivedShortcuts(list);
        getShortcutInfoSaverInstance(context).removeShortcuts(list);
        java.util.Iterator<androidx.core.content.pm.ShortcutInfoChangeListener> it = getShortcutInfoListeners(context).iterator();
        while (it.hasNext()) {
            it.next().onShortcutRemoved(list);
        }
    }

    public static boolean pushDynamicShortcut(android.content.Context context, androidx.core.content.pm.ShortcutInfoCompat shortcutInfoCompat) {
        androidx.core.util.Preconditions.checkNotNull(context);
        androidx.core.util.Preconditions.checkNotNull(shortcutInfoCompat);
        if (android.os.Build.VERSION.SDK_INT <= 31 && shortcutInfoCompat.isExcludedFromSurfaces(1)) {
            java.util.Iterator<androidx.core.content.pm.ShortcutInfoChangeListener> it = getShortcutInfoListeners(context).iterator();
            while (it.hasNext()) {
                it.next().onShortcutAdded(java.util.Collections.singletonList(shortcutInfoCompat));
            }
            return true;
        }
        int maxShortcutCountPerActivity = getMaxShortcutCountPerActivity(context);
        if (maxShortcutCountPerActivity == 0) {
            return false;
        }
        if (android.os.Build.VERSION.SDK_INT <= 29) {
            convertUriIconToBitmapIcon(context, shortcutInfoCompat);
        }
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            ((android.content.pm.ShortcutManager) context.getSystemService(android.content.pm.ShortcutManager.class)).pushDynamicShortcut(shortcutInfoCompat.toShortcutInfo());
        } else if (android.os.Build.VERSION.SDK_INT >= 25) {
            android.content.pm.ShortcutManager shortcutManager = (android.content.pm.ShortcutManager) context.getSystemService(android.content.pm.ShortcutManager.class);
            if (shortcutManager.isRateLimitingActive()) {
                return false;
            }
            java.util.List<android.content.pm.ShortcutInfo> dynamicShortcuts = shortcutManager.getDynamicShortcuts();
            if (dynamicShortcuts.size() >= maxShortcutCountPerActivity) {
                shortcutManager.removeDynamicShortcuts(java.util.Arrays.asList(androidx.core.content.pm.ShortcutManagerCompat.Api25Impl.getShortcutInfoWithLowestRank(dynamicShortcuts)));
            }
            shortcutManager.addDynamicShortcuts(java.util.Arrays.asList(shortcutInfoCompat.toShortcutInfo()));
        }
        androidx.core.content.pm.ShortcutInfoCompatSaver<?> shortcutInfoSaverInstance = getShortcutInfoSaverInstance(context);
        try {
            java.util.List<androidx.core.content.pm.ShortcutInfoCompat> shortcuts = shortcutInfoSaverInstance.getShortcuts();
            if (shortcuts.size() >= maxShortcutCountPerActivity) {
                shortcutInfoSaverInstance.removeShortcuts(java.util.Arrays.asList(getShortcutInfoCompatWithLowestRank(shortcuts)));
            }
            shortcutInfoSaverInstance.addShortcuts(java.util.Arrays.asList(shortcutInfoCompat));
            return true;
        } catch (java.lang.Exception unused) {
            return false;
        } finally {
            java.util.Iterator<androidx.core.content.pm.ShortcutInfoChangeListener> it2 = getShortcutInfoListeners(context).iterator();
            while (it2.hasNext()) {
                it2.next().onShortcutAdded(java.util.Collections.singletonList(shortcutInfoCompat));
            }
            reportShortcutUsed(context, shortcutInfoCompat.getId());
        }
    }

    private static java.lang.String getShortcutInfoCompatWithLowestRank(java.util.List<androidx.core.content.pm.ShortcutInfoCompat> list) {
        int rank = -1;
        java.lang.String id = null;
        for (androidx.core.content.pm.ShortcutInfoCompat shortcutInfoCompat : list) {
            if (shortcutInfoCompat.getRank() > rank) {
                id = shortcutInfoCompat.getId();
                rank = shortcutInfoCompat.getRank();
            }
        }
        return id;
    }

    static void setShortcutInfoCompatSaver(androidx.core.content.pm.ShortcutInfoCompatSaver<java.lang.Void> shortcutInfoCompatSaver) {
        sShortcutInfoCompatSaver = shortcutInfoCompatSaver;
    }

    static void setShortcutInfoChangeListeners(java.util.List<androidx.core.content.pm.ShortcutInfoChangeListener> list) {
        sShortcutInfoChangeListeners = list;
    }

    static java.util.List<androidx.core.content.pm.ShortcutInfoChangeListener> getShortcutInfoChangeListeners() {
        return sShortcutInfoChangeListeners;
    }

    private static int getIconDimensionInternal(android.content.Context context, boolean z) {
        android.app.ActivityManager activityManager = (android.app.ActivityManager) context.getSystemService("activity");
        int iMax = java.lang.Math.max(1, activityManager == null || activityManager.isLowRamDevice() ? 48 : 96);
        android.util.DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        return (int) (iMax * ((z ? displayMetrics.xdpi : displayMetrics.ydpi) / 160.0f));
    }

    private static androidx.core.content.pm.ShortcutInfoCompatSaver<?> getShortcutInfoSaverInstance(android.content.Context context) {
        if (sShortcutInfoCompatSaver == null) {
            try {
                sShortcutInfoCompatSaver = (androidx.core.content.pm.ShortcutInfoCompatSaver) java.lang.Class.forName("androidx.sharetarget.ShortcutInfoCompatSaverImpl", false, androidx.core.content.pm.ShortcutManagerCompat.class.getClassLoader()).getMethod("getInstance", android.content.Context.class).invoke(null, context);
            } catch (java.lang.Exception unused) {
            }
            if (sShortcutInfoCompatSaver == null) {
                sShortcutInfoCompatSaver = new androidx.core.content.pm.ShortcutInfoCompatSaver.NoopImpl();
            }
        }
        return sShortcutInfoCompatSaver;
    }

    private static java.util.List<androidx.core.content.pm.ShortcutInfoChangeListener> getShortcutInfoListeners(android.content.Context context) {
        android.os.Bundle bundle;
        java.lang.String string;
        if (sShortcutInfoChangeListeners == null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            android.content.pm.PackageManager packageManager = context.getPackageManager();
            android.content.Intent intent = new android.content.Intent(SHORTCUT_LISTENER_INTENT_FILTER_ACTION);
            intent.setPackage(context.getPackageName());
            java.util.Iterator<android.content.pm.ResolveInfo> it = packageManager.queryIntentActivities(intent, 128).iterator();
            while (it.hasNext()) {
                android.content.pm.ActivityInfo activityInfo = it.next().activityInfo;
                if (activityInfo != null && (bundle = activityInfo.metaData) != null && (string = bundle.getString(SHORTCUT_LISTENER_META_DATA_KEY)) != null) {
                    try {
                        arrayList.add((androidx.core.content.pm.ShortcutInfoChangeListener) java.lang.Class.forName(string, false, androidx.core.content.pm.ShortcutManagerCompat.class.getClassLoader()).getMethod("getInstance", android.content.Context.class).invoke(null, context));
                    } catch (java.lang.Exception unused) {
                    }
                }
            }
            if (sShortcutInfoChangeListeners == null) {
                sShortcutInfoChangeListeners = arrayList;
            }
        }
        return sShortcutInfoChangeListeners;
    }

    private static java.util.List<androidx.core.content.pm.ShortcutInfoCompat> removeShortcutsExcludedFromSurface(java.util.List<androidx.core.content.pm.ShortcutInfoCompat> list, int i) {
        java.util.Objects.requireNonNull(list);
        if (android.os.Build.VERSION.SDK_INT > 31) {
            return list;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(list);
        for (androidx.core.content.pm.ShortcutInfoCompat shortcutInfoCompat : list) {
            if (shortcutInfoCompat.isExcludedFromSurfaces(i)) {
                arrayList.remove(shortcutInfoCompat);
            }
        }
        return arrayList;
    }

    private static class Api25Impl {
        private Api25Impl() {
        }

        static java.lang.String getShortcutInfoWithLowestRank(java.util.List<android.content.pm.ShortcutInfo> list) {
            int rank = -1;
            java.lang.String id = null;
            for (android.content.pm.ShortcutInfo shortcutInfo : list) {
                if (shortcutInfo.getRank() > rank) {
                    id = shortcutInfo.getId();
                    rank = shortcutInfo.getRank();
                }
            }
            return id;
        }
    }
}
