package androidx.browser.browseractions;

/* JADX INFO: loaded from: classes.dex */
@java.lang.Deprecated
public class BrowserActionsIntent {
    public static final java.lang.String ACTION_BROWSER_ACTIONS_OPEN = "androidx.browser.browseractions.browser_action_open";
    public static final java.lang.String EXTRA_APP_ID = "androidx.browser.browseractions.APP_ID";
    public static final java.lang.String EXTRA_MENU_ITEMS = "androidx.browser.browseractions.extra.MENU_ITEMS";
    public static final java.lang.String EXTRA_SELECTED_ACTION_PENDING_INTENT = "androidx.browser.browseractions.extra.SELECTED_ACTION_PENDING_INTENT";
    public static final java.lang.String EXTRA_TYPE = "androidx.browser.browseractions.extra.TYPE";
    public static final int ITEM_COPY = 3;
    public static final int ITEM_DOWNLOAD = 2;
    public static final int ITEM_INVALID_ITEM = -1;
    public static final int ITEM_OPEN_IN_INCOGNITO = 1;
    public static final int ITEM_OPEN_IN_NEW_TAB = 0;
    public static final int ITEM_SHARE = 4;
    public static final java.lang.String KEY_ACTION = "androidx.browser.browseractions.ACTION";
    public static final java.lang.String KEY_ICON_ID = "androidx.browser.browseractions.ICON_ID";
    private static final java.lang.String KEY_ICON_URI = "androidx.browser.browseractions.ICON_URI";
    public static final java.lang.String KEY_TITLE = "androidx.browser.browseractions.TITLE";
    public static final int MAX_CUSTOM_ITEMS = 5;
    private static final java.lang.String TAG = "BrowserActions";
    private static final java.lang.String TEST_URL = "https://www.example.com";
    public static final int URL_TYPE_AUDIO = 3;
    public static final int URL_TYPE_FILE = 4;
    public static final int URL_TYPE_IMAGE = 1;
    public static final int URL_TYPE_NONE = 0;
    public static final int URL_TYPE_PLUGIN = 5;
    public static final int URL_TYPE_VIDEO = 2;
    private static androidx.browser.browseractions.BrowserActionsIntent.BrowserActionsFallDialogListener sDialogListenter;
    private final android.content.Intent mIntent;

    interface BrowserActionsFallDialogListener {
        void onDialogShown();
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface BrowserActionsItemId {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface BrowserActionsUrlType {
    }

    public android.content.Intent getIntent() {
        return this.mIntent;
    }

    BrowserActionsIntent(android.content.Intent intent) {
        this.mIntent = intent;
    }

    public static final class Builder {
        private android.content.Context mContext;
        private android.net.Uri mUri;
        private final android.content.Intent mIntent = new android.content.Intent(androidx.browser.browseractions.BrowserActionsIntent.ACTION_BROWSER_ACTIONS_OPEN);
        private int mType = 0;
        private java.util.ArrayList<android.os.Bundle> mMenuItems = new java.util.ArrayList<>();
        private android.app.PendingIntent mOnItemSelectedPendingIntent = null;
        private java.util.List<android.net.Uri> mImageUris = new java.util.ArrayList();

        public Builder(android.content.Context context, android.net.Uri uri) {
            this.mContext = context;
            this.mUri = uri;
        }

        public androidx.browser.browseractions.BrowserActionsIntent.Builder setUrlType(int i) {
            this.mType = i;
            return this;
        }

        public androidx.browser.browseractions.BrowserActionsIntent.Builder setCustomItems(java.util.ArrayList<androidx.browser.browseractions.BrowserActionItem> arrayList) {
            if (arrayList.size() > 5) {
                throw new java.lang.IllegalStateException("Exceeded maximum toolbar item count of 5");
            }
            for (int i = 0; i < arrayList.size(); i++) {
                if (android.text.TextUtils.isEmpty(arrayList.get(i).getTitle()) || arrayList.get(i).getAction() == null) {
                    throw new java.lang.IllegalArgumentException("Custom item should contain a non-empty title and non-null intent.");
                }
                this.mMenuItems.add(getBundleFromItem(arrayList.get(i)));
                if (arrayList.get(i).getIconUri() != null) {
                    this.mImageUris.add(arrayList.get(i).getIconUri());
                }
            }
            return this;
        }

        public androidx.browser.browseractions.BrowserActionsIntent.Builder setCustomItems(androidx.browser.browseractions.BrowserActionItem... browserActionItemArr) {
            return setCustomItems(new java.util.ArrayList<>(java.util.Arrays.asList(browserActionItemArr)));
        }

        public androidx.browser.browseractions.BrowserActionsIntent.Builder setOnItemSelectedAction(android.app.PendingIntent pendingIntent) {
            this.mOnItemSelectedPendingIntent = pendingIntent;
            return this;
        }

        private android.os.Bundle getBundleFromItem(androidx.browser.browseractions.BrowserActionItem browserActionItem) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString(androidx.browser.browseractions.BrowserActionsIntent.KEY_TITLE, browserActionItem.getTitle());
            bundle.putParcelable(androidx.browser.browseractions.BrowserActionsIntent.KEY_ACTION, browserActionItem.getAction());
            if (browserActionItem.getIconId() != 0) {
                bundle.putInt(androidx.browser.browseractions.BrowserActionsIntent.KEY_ICON_ID, browserActionItem.getIconId());
            }
            if (browserActionItem.getIconUri() != null) {
                bundle.putParcelable(androidx.browser.browseractions.BrowserActionsIntent.KEY_ICON_URI, browserActionItem.getIconUri());
            }
            return bundle;
        }

        public androidx.browser.browseractions.BrowserActionsIntent build() {
            this.mIntent.setData(this.mUri);
            this.mIntent.putExtra(androidx.browser.browseractions.BrowserActionsIntent.EXTRA_TYPE, this.mType);
            this.mIntent.putParcelableArrayListExtra(androidx.browser.browseractions.BrowserActionsIntent.EXTRA_MENU_ITEMS, this.mMenuItems);
            this.mIntent.putExtra(androidx.browser.browseractions.BrowserActionsIntent.EXTRA_APP_ID, android.app.PendingIntent.getActivity(this.mContext, 0, new android.content.Intent(), 67108864));
            android.app.PendingIntent pendingIntent = this.mOnItemSelectedPendingIntent;
            if (pendingIntent != null) {
                this.mIntent.putExtra(androidx.browser.browseractions.BrowserActionsIntent.EXTRA_SELECTED_ACTION_PENDING_INTENT, pendingIntent);
            }
            androidx.browser.browseractions.BrowserServiceFileProvider.grantReadPermission(this.mIntent, this.mImageUris, this.mContext);
            return new androidx.browser.browseractions.BrowserActionsIntent(this.mIntent);
        }
    }

    public static void openBrowserAction(android.content.Context context, android.net.Uri uri) {
        launchIntent(context, new androidx.browser.browseractions.BrowserActionsIntent.Builder(context, uri).build().getIntent());
    }

    public static void openBrowserAction(android.content.Context context, android.net.Uri uri, int i, java.util.ArrayList<androidx.browser.browseractions.BrowserActionItem> arrayList, android.app.PendingIntent pendingIntent) {
        launchIntent(context, new androidx.browser.browseractions.BrowserActionsIntent.Builder(context, uri).setUrlType(i).setCustomItems(arrayList).setOnItemSelectedAction(pendingIntent).build().getIntent());
    }

    public static void launchIntent(android.content.Context context, android.content.Intent intent) {
        launchIntent(context, intent, getBrowserActionsIntentHandlers(context));
    }

    static void launchIntent(android.content.Context context, android.content.Intent intent, java.util.List<android.content.pm.ResolveInfo> list) {
        if (list == null || list.size() == 0) {
            openFallbackBrowserActionsMenu(context, intent);
            return;
        }
        if (list.size() == 1) {
            intent.setPackage(list.get(0).activityInfo.packageName);
        } else {
            android.content.pm.ResolveInfo resolveInfoResolveActivity = context.getPackageManager().resolveActivity(new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(TEST_URL)), 65536);
            if (resolveInfoResolveActivity != null) {
                java.lang.String str = resolveInfoResolveActivity.activityInfo.packageName;
                for (int i = 0; i < list.size(); i++) {
                    if (str.equals(list.get(i).activityInfo.packageName)) {
                        intent.setPackage(str);
                        break;
                    }
                }
            }
        }
        androidx.core.content.ContextCompat.startActivity(context, intent, null);
    }

    public static java.util.List<android.content.pm.ResolveInfo> getBrowserActionsIntentHandlers(android.content.Context context) {
        return context.getPackageManager().queryIntentActivities(new android.content.Intent(ACTION_BROWSER_ACTIONS_OPEN, android.net.Uri.parse(TEST_URL)), 131072);
    }

    private static void openFallbackBrowserActionsMenu(android.content.Context context, android.content.Intent intent) {
        android.net.Uri data = intent.getData();
        java.util.ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra(EXTRA_MENU_ITEMS);
        openFallbackBrowserActionsMenu(context, data, parcelableArrayListExtra != null ? parseBrowserActionItems(parcelableArrayListExtra) : null);
    }

    static void setDialogShownListenter(androidx.browser.browseractions.BrowserActionsIntent.BrowserActionsFallDialogListener browserActionsFallDialogListener) {
        sDialogListenter = browserActionsFallDialogListener;
    }

    private static void openFallbackBrowserActionsMenu(android.content.Context context, android.net.Uri uri, java.util.List<androidx.browser.browseractions.BrowserActionItem> list) {
        new androidx.browser.browseractions.BrowserActionsFallbackMenuUi(context, uri, list).displayMenu();
        androidx.browser.browseractions.BrowserActionsIntent.BrowserActionsFallDialogListener browserActionsFallDialogListener = sDialogListenter;
        if (browserActionsFallDialogListener != null) {
            browserActionsFallDialogListener.onDialogShown();
        }
    }

    public static java.util.List<androidx.browser.browseractions.BrowserActionItem> parseBrowserActionItems(java.util.ArrayList<android.os.Bundle> arrayList) {
        androidx.browser.browseractions.BrowserActionItem browserActionItem;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (int i = 0; i < arrayList.size(); i++) {
            android.os.Bundle bundle = arrayList.get(i);
            java.lang.String string = bundle.getString(KEY_TITLE);
            android.app.PendingIntent pendingIntent = (android.app.PendingIntent) bundle.getParcelable(KEY_ACTION);
            int i2 = bundle.getInt(KEY_ICON_ID);
            android.net.Uri uri = (android.net.Uri) bundle.getParcelable(KEY_ICON_URI);
            if (!android.text.TextUtils.isEmpty(string) && pendingIntent != null) {
                if (i2 != 0) {
                    browserActionItem = new androidx.browser.browseractions.BrowserActionItem(string, pendingIntent, i2);
                } else {
                    browserActionItem = new androidx.browser.browseractions.BrowserActionItem(string, pendingIntent, uri);
                }
                arrayList2.add(browserActionItem);
            } else {
                throw new java.lang.IllegalArgumentException("Custom item should contain a non-empty title and non-null intent.");
            }
        }
        return arrayList2;
    }

    public static java.lang.String getUntrustedCreatorPackageName(android.content.Intent intent) {
        android.app.PendingIntent pendingIntent = (android.app.PendingIntent) intent.getParcelableExtra(EXTRA_APP_ID);
        if (pendingIntent != null) {
            return pendingIntent.getTargetPackage();
        }
        return null;
    }

    @java.lang.Deprecated
    public static java.lang.String getCreatorPackageName(android.content.Intent intent) {
        return getUntrustedCreatorPackageName(intent);
    }
}
