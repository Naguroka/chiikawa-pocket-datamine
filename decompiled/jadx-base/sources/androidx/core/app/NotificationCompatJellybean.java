package androidx.core.app;

/* JADX INFO: loaded from: classes.dex */
class NotificationCompatJellybean {
    static final java.lang.String EXTRA_ALLOW_GENERATED_REPLIES = "android.support.allowGeneratedReplies";
    static final java.lang.String EXTRA_DATA_ONLY_REMOTE_INPUTS = "android.support.dataRemoteInputs";
    private static final java.lang.String KEY_ACTION_INTENT = "actionIntent";
    private static final java.lang.String KEY_ALLOWED_DATA_TYPES = "allowedDataTypes";
    private static final java.lang.String KEY_ALLOW_FREE_FORM_INPUT = "allowFreeFormInput";
    private static final java.lang.String KEY_CHOICES = "choices";
    private static final java.lang.String KEY_DATA_ONLY_REMOTE_INPUTS = "dataOnlyRemoteInputs";
    private static final java.lang.String KEY_EXTRAS = "extras";
    private static final java.lang.String KEY_ICON = "icon";
    private static final java.lang.String KEY_LABEL = "label";
    private static final java.lang.String KEY_REMOTE_INPUTS = "remoteInputs";
    private static final java.lang.String KEY_RESULT_KEY = "resultKey";
    private static final java.lang.String KEY_SEMANTIC_ACTION = "semanticAction";
    private static final java.lang.String KEY_SHOWS_USER_INTERFACE = "showsUserInterface";
    private static final java.lang.String KEY_TITLE = "title";
    public static final java.lang.String TAG = "NotificationCompat";
    private static java.lang.reflect.Field sActionIconField;
    private static java.lang.reflect.Field sActionIntentField;
    private static java.lang.reflect.Field sActionTitleField;
    private static boolean sActionsAccessFailed;
    private static java.lang.reflect.Field sActionsField;
    private static java.lang.reflect.Field sExtrasField;
    private static boolean sExtrasFieldAccessFailed;
    private static final java.lang.Object sExtrasLock = new java.lang.Object();
    private static final java.lang.Object sActionsLock = new java.lang.Object();

    public static android.util.SparseArray<android.os.Bundle> buildActionExtrasMap(java.util.List<android.os.Bundle> list) {
        int size = list.size();
        android.util.SparseArray<android.os.Bundle> sparseArray = null;
        for (int i = 0; i < size; i++) {
            android.os.Bundle bundle = list.get(i);
            if (bundle != null) {
                if (sparseArray == null) {
                    sparseArray = new android.util.SparseArray<>();
                }
                sparseArray.put(i, bundle);
            }
        }
        return sparseArray;
    }

    public static android.os.Bundle getExtras(android.app.Notification notification) {
        synchronized (sExtrasLock) {
            if (sExtrasFieldAccessFailed) {
                return null;
            }
            try {
                if (sExtrasField == null) {
                    java.lang.reflect.Field declaredField = android.app.Notification.class.getDeclaredField(KEY_EXTRAS);
                    if (!android.os.Bundle.class.isAssignableFrom(declaredField.getType())) {
                        android.util.Log.e(TAG, "Notification.extras field is not of type Bundle");
                        sExtrasFieldAccessFailed = true;
                        return null;
                    }
                    declaredField.setAccessible(true);
                    sExtrasField = declaredField;
                }
                android.os.Bundle bundle = (android.os.Bundle) sExtrasField.get(notification);
                if (bundle == null) {
                    bundle = new android.os.Bundle();
                    sExtrasField.set(notification, bundle);
                }
                return bundle;
            } catch (java.lang.IllegalAccessException e) {
                android.util.Log.e(TAG, "Unable to access notification extras", e);
                sExtrasFieldAccessFailed = true;
                return null;
            } catch (java.lang.NoSuchFieldException e2) {
                android.util.Log.e(TAG, "Unable to access notification extras", e2);
                sExtrasFieldAccessFailed = true;
                return null;
            }
        }
    }

    public static androidx.core.app.NotificationCompat.Action readAction(int i, java.lang.CharSequence charSequence, android.app.PendingIntent pendingIntent, android.os.Bundle bundle) {
        androidx.core.app.RemoteInput[] remoteInputArrFromBundleArray;
        androidx.core.app.RemoteInput[] remoteInputArrFromBundleArray2;
        boolean z;
        if (bundle != null) {
            remoteInputArrFromBundleArray = fromBundleArray(getBundleArrayFromBundle(bundle, androidx.core.app.NotificationCompatExtras.EXTRA_REMOTE_INPUTS));
            remoteInputArrFromBundleArray2 = fromBundleArray(getBundleArrayFromBundle(bundle, EXTRA_DATA_ONLY_REMOTE_INPUTS));
            z = bundle.getBoolean(EXTRA_ALLOW_GENERATED_REPLIES);
        } else {
            remoteInputArrFromBundleArray = null;
            remoteInputArrFromBundleArray2 = null;
            z = false;
        }
        return new androidx.core.app.NotificationCompat.Action(i, charSequence, pendingIntent, bundle, remoteInputArrFromBundleArray, remoteInputArrFromBundleArray2, z, 0, true, false, false);
    }

    public static android.os.Bundle writeActionAndGetExtras(android.app.Notification.Builder builder, androidx.core.app.NotificationCompat.Action action) {
        androidx.core.graphics.drawable.IconCompat iconCompat = action.getIconCompat();
        builder.addAction(iconCompat != null ? iconCompat.getResId() : 0, action.getTitle(), action.getActionIntent());
        android.os.Bundle bundle = new android.os.Bundle(action.getExtras());
        if (action.getRemoteInputs() != null) {
            bundle.putParcelableArray(androidx.core.app.NotificationCompatExtras.EXTRA_REMOTE_INPUTS, toBundleArray(action.getRemoteInputs()));
        }
        if (action.getDataOnlyRemoteInputs() != null) {
            bundle.putParcelableArray(EXTRA_DATA_ONLY_REMOTE_INPUTS, toBundleArray(action.getDataOnlyRemoteInputs()));
        }
        bundle.putBoolean(EXTRA_ALLOW_GENERATED_REPLIES, action.getAllowGeneratedReplies());
        return bundle;
    }

    public static int getActionCount(android.app.Notification notification) {
        int length;
        synchronized (sActionsLock) {
            java.lang.Object[] actionObjectsLocked = getActionObjectsLocked(notification);
            length = actionObjectsLocked != null ? actionObjectsLocked.length : 0;
        }
        return length;
    }

    public static androidx.core.app.NotificationCompat.Action getAction(android.app.Notification notification, int i) {
        android.util.SparseArray sparseParcelableArray;
        synchronized (sActionsLock) {
            try {
                try {
                    java.lang.Object[] actionObjectsLocked = getActionObjectsLocked(notification);
                    if (actionObjectsLocked != null) {
                        java.lang.Object obj = actionObjectsLocked[i];
                        android.os.Bundle extras = getExtras(notification);
                        return readAction(sActionIconField.getInt(obj), (java.lang.CharSequence) sActionTitleField.get(obj), (android.app.PendingIntent) sActionIntentField.get(obj), (extras == null || (sparseParcelableArray = extras.getSparseParcelableArray(androidx.core.app.NotificationCompatExtras.EXTRA_ACTION_EXTRAS)) == null) ? null : (android.os.Bundle) sparseParcelableArray.get(i));
                    }
                } catch (java.lang.IllegalAccessException e) {
                    android.util.Log.e(TAG, "Unable to access notification actions", e);
                    sActionsAccessFailed = true;
                }
                return null;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    private static java.lang.Object[] getActionObjectsLocked(android.app.Notification notification) {
        synchronized (sActionsLock) {
            if (!ensureActionReflectionReadyLocked()) {
                return null;
            }
            try {
                return (java.lang.Object[]) sActionsField.get(notification);
            } catch (java.lang.IllegalAccessException e) {
                android.util.Log.e(TAG, "Unable to access notification actions", e);
                sActionsAccessFailed = true;
                return null;
            }
        }
    }

    private static boolean ensureActionReflectionReadyLocked() {
        if (sActionsAccessFailed) {
            return false;
        }
        try {
            if (sActionsField == null) {
                java.lang.Class<?> cls = java.lang.Class.forName("android.app.Notification$Action");
                sActionIconField = cls.getDeclaredField("icon");
                sActionTitleField = cls.getDeclaredField("title");
                sActionIntentField = cls.getDeclaredField(KEY_ACTION_INTENT);
                java.lang.reflect.Field declaredField = android.app.Notification.class.getDeclaredField("actions");
                sActionsField = declaredField;
                declaredField.setAccessible(true);
            }
        } catch (java.lang.ClassNotFoundException e) {
            android.util.Log.e(TAG, "Unable to access notification actions", e);
            sActionsAccessFailed = true;
        } catch (java.lang.NoSuchFieldException e2) {
            android.util.Log.e(TAG, "Unable to access notification actions", e2);
            sActionsAccessFailed = true;
        }
        return !sActionsAccessFailed;
    }

    static androidx.core.app.NotificationCompat.Action getActionFromBundle(android.os.Bundle bundle) {
        android.os.Bundle bundle2 = bundle.getBundle(KEY_EXTRAS);
        return new androidx.core.app.NotificationCompat.Action(bundle.getInt("icon"), bundle.getCharSequence("title"), (android.app.PendingIntent) bundle.getParcelable(KEY_ACTION_INTENT), bundle.getBundle(KEY_EXTRAS), fromBundleArray(getBundleArrayFromBundle(bundle, KEY_REMOTE_INPUTS)), fromBundleArray(getBundleArrayFromBundle(bundle, KEY_DATA_ONLY_REMOTE_INPUTS)), bundle2 != null ? bundle2.getBoolean(EXTRA_ALLOW_GENERATED_REPLIES, false) : false, bundle.getInt(KEY_SEMANTIC_ACTION), bundle.getBoolean(KEY_SHOWS_USER_INTERFACE), false, false);
    }

    static android.os.Bundle getBundleForAction(androidx.core.app.NotificationCompat.Action action) {
        android.os.Bundle bundle;
        android.os.Bundle bundle2 = new android.os.Bundle();
        androidx.core.graphics.drawable.IconCompat iconCompat = action.getIconCompat();
        bundle2.putInt("icon", iconCompat != null ? iconCompat.getResId() : 0);
        bundle2.putCharSequence("title", action.getTitle());
        bundle2.putParcelable(KEY_ACTION_INTENT, action.getActionIntent());
        if (action.getExtras() != null) {
            bundle = new android.os.Bundle(action.getExtras());
        } else {
            bundle = new android.os.Bundle();
        }
        bundle.putBoolean(EXTRA_ALLOW_GENERATED_REPLIES, action.getAllowGeneratedReplies());
        bundle2.putBundle(KEY_EXTRAS, bundle);
        bundle2.putParcelableArray(KEY_REMOTE_INPUTS, toBundleArray(action.getRemoteInputs()));
        bundle2.putBoolean(KEY_SHOWS_USER_INTERFACE, action.getShowsUserInterface());
        bundle2.putInt(KEY_SEMANTIC_ACTION, action.getSemanticAction());
        return bundle2;
    }

    private static androidx.core.app.RemoteInput fromBundle(android.os.Bundle bundle) {
        java.util.ArrayList<java.lang.String> stringArrayList = bundle.getStringArrayList(KEY_ALLOWED_DATA_TYPES);
        java.util.HashSet hashSet = new java.util.HashSet();
        if (stringArrayList != null) {
            java.util.Iterator<java.lang.String> it = stringArrayList.iterator();
            while (it.hasNext()) {
                hashSet.add(it.next());
            }
        }
        return new androidx.core.app.RemoteInput(bundle.getString(KEY_RESULT_KEY), bundle.getCharSequence("label"), bundle.getCharSequenceArray(KEY_CHOICES), bundle.getBoolean(KEY_ALLOW_FREE_FORM_INPUT), 0, bundle.getBundle(KEY_EXTRAS), hashSet);
    }

    private static android.os.Bundle toBundle(androidx.core.app.RemoteInput remoteInput) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString(KEY_RESULT_KEY, remoteInput.getResultKey());
        bundle.putCharSequence("label", remoteInput.getLabel());
        bundle.putCharSequenceArray(KEY_CHOICES, remoteInput.getChoices());
        bundle.putBoolean(KEY_ALLOW_FREE_FORM_INPUT, remoteInput.getAllowFreeFormInput());
        bundle.putBundle(KEY_EXTRAS, remoteInput.getExtras());
        java.util.Set<java.lang.String> allowedDataTypes = remoteInput.getAllowedDataTypes();
        if (allowedDataTypes != null && !allowedDataTypes.isEmpty()) {
            java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>(allowedDataTypes.size());
            java.util.Iterator<java.lang.String> it = allowedDataTypes.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            bundle.putStringArrayList(KEY_ALLOWED_DATA_TYPES, arrayList);
        }
        return bundle;
    }

    private static androidx.core.app.RemoteInput[] fromBundleArray(android.os.Bundle[] bundleArr) {
        if (bundleArr == null) {
            return null;
        }
        androidx.core.app.RemoteInput[] remoteInputArr = new androidx.core.app.RemoteInput[bundleArr.length];
        for (int i = 0; i < bundleArr.length; i++) {
            remoteInputArr[i] = fromBundle(bundleArr[i]);
        }
        return remoteInputArr;
    }

    private static android.os.Bundle[] toBundleArray(androidx.core.app.RemoteInput[] remoteInputArr) {
        if (remoteInputArr == null) {
            return null;
        }
        android.os.Bundle[] bundleArr = new android.os.Bundle[remoteInputArr.length];
        for (int i = 0; i < remoteInputArr.length; i++) {
            bundleArr[i] = toBundle(remoteInputArr[i]);
        }
        return bundleArr;
    }

    private static android.os.Bundle[] getBundleArrayFromBundle(android.os.Bundle bundle, java.lang.String str) {
        android.os.Parcelable[] parcelableArray = bundle.getParcelableArray(str);
        if ((parcelableArray instanceof android.os.Bundle[]) || parcelableArray == null) {
            return (android.os.Bundle[]) parcelableArray;
        }
        android.os.Bundle[] bundleArr = (android.os.Bundle[]) java.util.Arrays.copyOf(parcelableArray, parcelableArray.length, android.os.Bundle[].class);
        bundle.putParcelableArray(str, bundleArr);
        return bundleArr;
    }

    private NotificationCompatJellybean() {
    }
}
