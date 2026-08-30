package androidx.browser.customtabs;

/* JADX INFO: loaded from: classes.dex */
public final class CustomTabsIntent {
    public static final int ACTIVITY_HEIGHT_ADJUSTABLE = 1;
    public static final int ACTIVITY_HEIGHT_DEFAULT = 0;
    public static final int ACTIVITY_HEIGHT_FIXED = 2;
    private static final int ACTIVITY_HEIGHT_MAX = 2;
    public static final int ACTIVITY_SIDE_SHEET_DECORATION_TYPE_DEFAULT = 0;
    public static final int ACTIVITY_SIDE_SHEET_DECORATION_TYPE_DIVIDER = 3;
    private static final int ACTIVITY_SIDE_SHEET_DECORATION_TYPE_MAX = 3;
    public static final int ACTIVITY_SIDE_SHEET_DECORATION_TYPE_NONE = 1;
    public static final int ACTIVITY_SIDE_SHEET_DECORATION_TYPE_SHADOW = 2;
    public static final int ACTIVITY_SIDE_SHEET_POSITION_DEFAULT = 0;
    public static final int ACTIVITY_SIDE_SHEET_POSITION_END = 2;
    private static final int ACTIVITY_SIDE_SHEET_POSITION_MAX = 2;
    public static final int ACTIVITY_SIDE_SHEET_POSITION_START = 1;
    public static final int ACTIVITY_SIDE_SHEET_ROUNDED_CORNERS_POSITION_DEFAULT = 0;
    private static final int ACTIVITY_SIDE_SHEET_ROUNDED_CORNERS_POSITION_MAX = 2;
    public static final int ACTIVITY_SIDE_SHEET_ROUNDED_CORNERS_POSITION_NONE = 1;
    public static final int ACTIVITY_SIDE_SHEET_ROUNDED_CORNERS_POSITION_TOP = 2;
    public static final int CLOSE_BUTTON_POSITION_DEFAULT = 0;
    public static final int CLOSE_BUTTON_POSITION_END = 2;
    private static final int CLOSE_BUTTON_POSITION_MAX = 2;
    public static final int CLOSE_BUTTON_POSITION_START = 1;
    public static final int COLOR_SCHEME_DARK = 2;
    public static final int COLOR_SCHEME_LIGHT = 1;
    private static final int COLOR_SCHEME_MAX = 2;
    public static final int COLOR_SCHEME_SYSTEM = 0;
    public static final java.lang.String EXTRA_ACTION_BUTTON_BUNDLE = "android.support.customtabs.extra.ACTION_BUTTON_BUNDLE";
    public static final java.lang.String EXTRA_ACTIVITY_HEIGHT_RESIZE_BEHAVIOR = "androidx.browser.customtabs.extra.ACTIVITY_HEIGHT_RESIZE_BEHAVIOR";
    public static final java.lang.String EXTRA_ACTIVITY_SIDE_SHEET_BREAKPOINT_DP = "androidx.browser.customtabs.extra.ACTIVITY_SIDE_SHEET_BREAKPOINT_DP";
    public static final java.lang.String EXTRA_ACTIVITY_SIDE_SHEET_DECORATION_TYPE = "androidx.browser.customtabs.extra.ACTIVITY_SIDE_SHEET_DECORATION_TYPE";
    public static final java.lang.String EXTRA_ACTIVITY_SIDE_SHEET_ENABLE_MAXIMIZATION = "androidx.browser.customtabs.extra.ACTIVITY_SIDE_SHEET_ENABLE_MAXIMIZATION";
    public static final java.lang.String EXTRA_ACTIVITY_SIDE_SHEET_POSITION = "androidx.browser.customtabs.extra.ACTIVITY_SIDE_SHEET_POSITION";
    public static final java.lang.String EXTRA_ACTIVITY_SIDE_SHEET_ROUNDED_CORNERS_POSITION = "androidx.browser.customtabs.extra.ACTIVITY_SIDE_SHEET_ROUNDED_CORNERS_POSITION";
    public static final java.lang.String EXTRA_CLOSE_BUTTON_ICON = "android.support.customtabs.extra.CLOSE_BUTTON_ICON";
    public static final java.lang.String EXTRA_CLOSE_BUTTON_POSITION = "androidx.browser.customtabs.extra.CLOSE_BUTTON_POSITION";
    public static final java.lang.String EXTRA_COLOR_SCHEME = "androidx.browser.customtabs.extra.COLOR_SCHEME";
    public static final java.lang.String EXTRA_COLOR_SCHEME_PARAMS = "androidx.browser.customtabs.extra.COLOR_SCHEME_PARAMS";

    @java.lang.Deprecated
    public static final java.lang.String EXTRA_DEFAULT_SHARE_MENU_ITEM = "android.support.customtabs.extra.SHARE_MENU_ITEM";
    public static final java.lang.String EXTRA_DISABLE_BACKGROUND_INTERACTION = "androidx.browser.customtabs.extra.DISABLE_BACKGROUND_INTERACTION";
    public static final java.lang.String EXTRA_DISABLE_BOOKMARKS_BUTTON = "org.chromium.chrome.browser.customtabs.EXTRA_DISABLE_STAR_BUTTON";
    public static final java.lang.String EXTRA_DISABLE_DOWNLOAD_BUTTON = "org.chromium.chrome.browser.customtabs.EXTRA_DISABLE_DOWNLOAD_BUTTON";
    public static final java.lang.String EXTRA_ENABLE_INSTANT_APPS = "android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS";
    public static final java.lang.String EXTRA_ENABLE_URLBAR_HIDING = "android.support.customtabs.extra.ENABLE_URLBAR_HIDING";
    public static final java.lang.String EXTRA_EXIT_ANIMATION_BUNDLE = "android.support.customtabs.extra.EXIT_ANIMATION_BUNDLE";
    public static final java.lang.String EXTRA_INITIAL_ACTIVITY_HEIGHT_PX = "androidx.browser.customtabs.extra.INITIAL_ACTIVITY_HEIGHT_PX";
    public static final java.lang.String EXTRA_INITIAL_ACTIVITY_WIDTH_PX = "androidx.browser.customtabs.extra.INITIAL_ACTIVITY_WIDTH_PX";
    public static final java.lang.String EXTRA_MENU_ITEMS = "android.support.customtabs.extra.MENU_ITEMS";
    public static final java.lang.String EXTRA_NAVIGATION_BAR_COLOR = "androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR";
    public static final java.lang.String EXTRA_NAVIGATION_BAR_DIVIDER_COLOR = "androidx.browser.customtabs.extra.NAVIGATION_BAR_DIVIDER_COLOR";
    public static final java.lang.String EXTRA_REMOTEVIEWS = "android.support.customtabs.extra.EXTRA_REMOTEVIEWS";
    public static final java.lang.String EXTRA_REMOTEVIEWS_CLICKED_ID = "android.support.customtabs.extra.EXTRA_REMOTEVIEWS_CLICKED_ID";
    public static final java.lang.String EXTRA_REMOTEVIEWS_PENDINGINTENT = "android.support.customtabs.extra.EXTRA_REMOTEVIEWS_PENDINGINTENT";
    public static final java.lang.String EXTRA_REMOTEVIEWS_VIEW_IDS = "android.support.customtabs.extra.EXTRA_REMOTEVIEWS_VIEW_IDS";
    public static final java.lang.String EXTRA_SECONDARY_TOOLBAR_COLOR = "android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR";
    public static final java.lang.String EXTRA_SECONDARY_TOOLBAR_SWIPE_UP_GESTURE = "androidx.browser.customtabs.extra.SECONDARY_TOOLBAR_SWIPE_UP_GESTURE";
    public static final java.lang.String EXTRA_SEND_TO_EXTERNAL_DEFAULT_HANDLER = "android.support.customtabs.extra.SEND_TO_EXTERNAL_HANDLER";
    public static final java.lang.String EXTRA_SESSION = "android.support.customtabs.extra.SESSION";
    public static final java.lang.String EXTRA_SESSION_ID = "android.support.customtabs.extra.SESSION_ID";
    public static final java.lang.String EXTRA_SHARE_STATE = "androidx.browser.customtabs.extra.SHARE_STATE";
    public static final java.lang.String EXTRA_TINT_ACTION_BUTTON = "android.support.customtabs.extra.TINT_ACTION_BUTTON";
    public static final java.lang.String EXTRA_TITLE_VISIBILITY_STATE = "android.support.customtabs.extra.TITLE_VISIBILITY";
    public static final java.lang.String EXTRA_TOOLBAR_COLOR = "android.support.customtabs.extra.TOOLBAR_COLOR";
    public static final java.lang.String EXTRA_TOOLBAR_CORNER_RADIUS_DP = "androidx.browser.customtabs.extra.TOOLBAR_CORNER_RADIUS_DP";
    public static final java.lang.String EXTRA_TOOLBAR_ITEMS = "android.support.customtabs.extra.TOOLBAR_ITEMS";
    public static final java.lang.String EXTRA_TRANSLATE_LANGUAGE_TAG = "androidx.browser.customtabs.extra.TRANSLATE_LANGUAGE_TAG";
    private static final java.lang.String EXTRA_USER_OPT_OUT_FROM_CUSTOM_TABS = "android.support.customtabs.extra.user_opt_out";
    private static final java.lang.String HTTP_ACCEPT_LANGUAGE = "Accept-Language";
    public static final java.lang.String KEY_DESCRIPTION = "android.support.customtabs.customaction.DESCRIPTION";
    public static final java.lang.String KEY_ICON = "android.support.customtabs.customaction.ICON";
    public static final java.lang.String KEY_ID = "android.support.customtabs.customaction.ID";
    public static final java.lang.String KEY_MENU_ITEM_TITLE = "android.support.customtabs.customaction.MENU_ITEM_TITLE";
    public static final java.lang.String KEY_PENDING_INTENT = "android.support.customtabs.customaction.PENDING_INTENT";
    private static final int MAX_TOOLBAR_CORNER_RADIUS_DP = 16;
    private static final int MAX_TOOLBAR_ITEMS = 5;
    public static final int NO_TITLE = 0;
    public static final int SHARE_STATE_DEFAULT = 0;
    private static final int SHARE_STATE_MAX = 2;
    public static final int SHARE_STATE_OFF = 2;
    public static final int SHARE_STATE_ON = 1;
    public static final int SHOW_PAGE_TITLE = 1;
    public static final int TOOLBAR_ACTION_BUTTON_ID = 0;
    public final android.content.Intent intent;
    public final android.os.Bundle startAnimationBundle;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface ActivityHeightResizeBehavior {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface ActivitySideSheetDecorationType {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface ActivitySideSheetPosition {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface ActivitySideSheetRoundedCornersPosition {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface CloseButtonPosition {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface ColorScheme {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface ShareState {
    }

    public static int getMaxToolbarItems() {
        return 5;
    }

    public void launchUrl(android.content.Context context, android.net.Uri uri) {
        this.intent.setData(uri);
        androidx.core.content.ContextCompat.startActivity(context, this.intent, this.startAnimationBundle);
    }

    CustomTabsIntent(android.content.Intent intent, android.os.Bundle bundle) {
        this.intent = intent;
        this.startAnimationBundle = bundle;
    }

    public static final class Builder {
        private java.util.ArrayList<android.os.Bundle> mActionButtons;
        private android.app.ActivityOptions mActivityOptions;
        private android.util.SparseArray<android.os.Bundle> mColorSchemeParamBundles;
        private android.os.Bundle mDefaultColorSchemeBundle;
        private java.util.ArrayList<android.os.Bundle> mMenuItems;
        private boolean mShareIdentity;
        private final android.content.Intent mIntent = new android.content.Intent("android.intent.action.VIEW");
        private final androidx.browser.customtabs.CustomTabColorSchemeParams.Builder mDefaultColorSchemeBuilder = new androidx.browser.customtabs.CustomTabColorSchemeParams.Builder();
        private int mShareState = 0;
        private boolean mInstantAppsEnabled = true;

        public Builder() {
        }

        public Builder(androidx.browser.customtabs.CustomTabsSession customTabsSession) {
            if (customTabsSession != null) {
                setSession(customTabsSession);
            }
        }

        public androidx.browser.customtabs.CustomTabsIntent.Builder setSession(androidx.browser.customtabs.CustomTabsSession customTabsSession) {
            this.mIntent.setPackage(customTabsSession.getComponentName().getPackageName());
            setSessionParameters(customTabsSession.getBinder(), customTabsSession.getId());
            return this;
        }

        public androidx.browser.customtabs.CustomTabsIntent.Builder setPendingSession(androidx.browser.customtabs.CustomTabsSession.PendingSession pendingSession) {
            setSessionParameters(null, pendingSession.getId());
            return this;
        }

        private void setSessionParameters(android.os.IBinder iBinder, android.app.PendingIntent pendingIntent) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putBinder(androidx.browser.customtabs.CustomTabsIntent.EXTRA_SESSION, iBinder);
            if (pendingIntent != null) {
                bundle.putParcelable(androidx.browser.customtabs.CustomTabsIntent.EXTRA_SESSION_ID, pendingIntent);
            }
            this.mIntent.putExtras(bundle);
        }

        @java.lang.Deprecated
        public androidx.browser.customtabs.CustomTabsIntent.Builder setToolbarColor(int i) {
            this.mDefaultColorSchemeBuilder.setToolbarColor(i);
            return this;
        }

        @java.lang.Deprecated
        public androidx.browser.customtabs.CustomTabsIntent.Builder enableUrlBarHiding() {
            this.mIntent.putExtra(androidx.browser.customtabs.CustomTabsIntent.EXTRA_ENABLE_URLBAR_HIDING, true);
            return this;
        }

        public androidx.browser.customtabs.CustomTabsIntent.Builder setUrlBarHidingEnabled(boolean z) {
            this.mIntent.putExtra(androidx.browser.customtabs.CustomTabsIntent.EXTRA_ENABLE_URLBAR_HIDING, z);
            return this;
        }

        public androidx.browser.customtabs.CustomTabsIntent.Builder setCloseButtonIcon(android.graphics.Bitmap bitmap) {
            this.mIntent.putExtra(androidx.browser.customtabs.CustomTabsIntent.EXTRA_CLOSE_BUTTON_ICON, bitmap);
            return this;
        }

        public androidx.browser.customtabs.CustomTabsIntent.Builder setShowTitle(boolean z) {
            this.mIntent.putExtra(androidx.browser.customtabs.CustomTabsIntent.EXTRA_TITLE_VISIBILITY_STATE, z ? 1 : 0);
            return this;
        }

        public androidx.browser.customtabs.CustomTabsIntent.Builder addMenuItem(java.lang.String str, android.app.PendingIntent pendingIntent) {
            if (this.mMenuItems == null) {
                this.mMenuItems = new java.util.ArrayList<>();
            }
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString(androidx.browser.customtabs.CustomTabsIntent.KEY_MENU_ITEM_TITLE, str);
            bundle.putParcelable(androidx.browser.customtabs.CustomTabsIntent.KEY_PENDING_INTENT, pendingIntent);
            this.mMenuItems.add(bundle);
            return this;
        }

        @java.lang.Deprecated
        public androidx.browser.customtabs.CustomTabsIntent.Builder addDefaultShareMenuItem() {
            setShareState(1);
            return this;
        }

        @java.lang.Deprecated
        public androidx.browser.customtabs.CustomTabsIntent.Builder setDefaultShareMenuItemEnabled(boolean z) {
            if (z) {
                setShareState(1);
            } else {
                setShareState(2);
            }
            return this;
        }

        public androidx.browser.customtabs.CustomTabsIntent.Builder setShareState(int i) {
            if (i < 0 || i > 2) {
                throw new java.lang.IllegalArgumentException("Invalid value for the shareState argument");
            }
            this.mShareState = i;
            if (i == 1) {
                this.mIntent.putExtra(androidx.browser.customtabs.CustomTabsIntent.EXTRA_DEFAULT_SHARE_MENU_ITEM, true);
            } else if (i == 2) {
                this.mIntent.putExtra(androidx.browser.customtabs.CustomTabsIntent.EXTRA_DEFAULT_SHARE_MENU_ITEM, false);
            } else {
                this.mIntent.removeExtra(androidx.browser.customtabs.CustomTabsIntent.EXTRA_DEFAULT_SHARE_MENU_ITEM);
            }
            return this;
        }

        public androidx.browser.customtabs.CustomTabsIntent.Builder setActionButton(android.graphics.Bitmap bitmap, java.lang.String str, android.app.PendingIntent pendingIntent, boolean z) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt(androidx.browser.customtabs.CustomTabsIntent.KEY_ID, 0);
            bundle.putParcelable(androidx.browser.customtabs.CustomTabsIntent.KEY_ICON, bitmap);
            bundle.putString(androidx.browser.customtabs.CustomTabsIntent.KEY_DESCRIPTION, str);
            bundle.putParcelable(androidx.browser.customtabs.CustomTabsIntent.KEY_PENDING_INTENT, pendingIntent);
            this.mIntent.putExtra(androidx.browser.customtabs.CustomTabsIntent.EXTRA_ACTION_BUTTON_BUNDLE, bundle);
            this.mIntent.putExtra(androidx.browser.customtabs.CustomTabsIntent.EXTRA_TINT_ACTION_BUTTON, z);
            return this;
        }

        public androidx.browser.customtabs.CustomTabsIntent.Builder setActionButton(android.graphics.Bitmap bitmap, java.lang.String str, android.app.PendingIntent pendingIntent) {
            return setActionButton(bitmap, str, pendingIntent, false);
        }

        @java.lang.Deprecated
        public androidx.browser.customtabs.CustomTabsIntent.Builder addToolbarItem(int i, android.graphics.Bitmap bitmap, java.lang.String str, android.app.PendingIntent pendingIntent) throws java.lang.IllegalStateException {
            if (this.mActionButtons == null) {
                this.mActionButtons = new java.util.ArrayList<>();
            }
            if (this.mActionButtons.size() >= 5) {
                throw new java.lang.IllegalStateException("Exceeded maximum toolbar item count of 5");
            }
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt(androidx.browser.customtabs.CustomTabsIntent.KEY_ID, i);
            bundle.putParcelable(androidx.browser.customtabs.CustomTabsIntent.KEY_ICON, bitmap);
            bundle.putString(androidx.browser.customtabs.CustomTabsIntent.KEY_DESCRIPTION, str);
            bundle.putParcelable(androidx.browser.customtabs.CustomTabsIntent.KEY_PENDING_INTENT, pendingIntent);
            this.mActionButtons.add(bundle);
            return this;
        }

        @java.lang.Deprecated
        public androidx.browser.customtabs.CustomTabsIntent.Builder setSecondaryToolbarColor(int i) {
            this.mDefaultColorSchemeBuilder.setSecondaryToolbarColor(i);
            return this;
        }

        @java.lang.Deprecated
        public androidx.browser.customtabs.CustomTabsIntent.Builder setNavigationBarColor(int i) {
            this.mDefaultColorSchemeBuilder.setNavigationBarColor(i);
            return this;
        }

        @java.lang.Deprecated
        public androidx.browser.customtabs.CustomTabsIntent.Builder setNavigationBarDividerColor(int i) {
            this.mDefaultColorSchemeBuilder.setNavigationBarDividerColor(i);
            return this;
        }

        public androidx.browser.customtabs.CustomTabsIntent.Builder setSecondaryToolbarViews(android.widget.RemoteViews remoteViews, int[] iArr, android.app.PendingIntent pendingIntent) {
            this.mIntent.putExtra(androidx.browser.customtabs.CustomTabsIntent.EXTRA_REMOTEVIEWS, remoteViews);
            this.mIntent.putExtra(androidx.browser.customtabs.CustomTabsIntent.EXTRA_REMOTEVIEWS_VIEW_IDS, iArr);
            this.mIntent.putExtra(androidx.browser.customtabs.CustomTabsIntent.EXTRA_REMOTEVIEWS_PENDINGINTENT, pendingIntent);
            return this;
        }

        public androidx.browser.customtabs.CustomTabsIntent.Builder setSecondaryToolbarSwipeUpGesture(android.app.PendingIntent pendingIntent) {
            this.mIntent.putExtra(androidx.browser.customtabs.CustomTabsIntent.EXTRA_SECONDARY_TOOLBAR_SWIPE_UP_GESTURE, pendingIntent);
            return this;
        }

        public androidx.browser.customtabs.CustomTabsIntent.Builder setInstantAppsEnabled(boolean z) {
            this.mInstantAppsEnabled = z;
            return this;
        }

        public androidx.browser.customtabs.CustomTabsIntent.Builder setStartAnimations(android.content.Context context, int i, int i2) {
            this.mActivityOptions = android.app.ActivityOptions.makeCustomAnimation(context, i, i2);
            return this;
        }

        public androidx.browser.customtabs.CustomTabsIntent.Builder setExitAnimations(android.content.Context context, int i, int i2) {
            this.mIntent.putExtra(androidx.browser.customtabs.CustomTabsIntent.EXTRA_EXIT_ANIMATION_BUNDLE, androidx.core.app.ActivityOptionsCompat.makeCustomAnimation(context, i, i2).toBundle());
            return this;
        }

        public androidx.browser.customtabs.CustomTabsIntent.Builder setColorScheme(int i) {
            if (i < 0 || i > 2) {
                throw new java.lang.IllegalArgumentException("Invalid value for the colorScheme argument");
            }
            this.mIntent.putExtra(androidx.browser.customtabs.CustomTabsIntent.EXTRA_COLOR_SCHEME, i);
            return this;
        }

        public androidx.browser.customtabs.CustomTabsIntent.Builder setColorSchemeParams(int i, androidx.browser.customtabs.CustomTabColorSchemeParams customTabColorSchemeParams) {
            if (i < 0 || i > 2 || i == 0) {
                throw new java.lang.IllegalArgumentException("Invalid colorScheme: " + i);
            }
            if (this.mColorSchemeParamBundles == null) {
                this.mColorSchemeParamBundles = new android.util.SparseArray<>();
            }
            this.mColorSchemeParamBundles.put(i, customTabColorSchemeParams.toBundle());
            return this;
        }

        public androidx.browser.customtabs.CustomTabsIntent.Builder setDefaultColorSchemeParams(androidx.browser.customtabs.CustomTabColorSchemeParams customTabColorSchemeParams) {
            this.mDefaultColorSchemeBundle = customTabColorSchemeParams.toBundle();
            return this;
        }

        public androidx.browser.customtabs.CustomTabsIntent.Builder setInitialActivityHeightPx(int i, int i2) {
            if (i <= 0) {
                throw new java.lang.IllegalArgumentException("Invalid value for the initialHeightPx argument");
            }
            if (i2 < 0 || i2 > 2) {
                throw new java.lang.IllegalArgumentException("Invalid value for the activityHeightResizeBehavior argument");
            }
            this.mIntent.putExtra(androidx.browser.customtabs.CustomTabsIntent.EXTRA_INITIAL_ACTIVITY_HEIGHT_PX, i);
            this.mIntent.putExtra(androidx.browser.customtabs.CustomTabsIntent.EXTRA_ACTIVITY_HEIGHT_RESIZE_BEHAVIOR, i2);
            return this;
        }

        public androidx.browser.customtabs.CustomTabsIntent.Builder setInitialActivityHeightPx(int i) {
            return setInitialActivityHeightPx(i, 0);
        }

        public androidx.browser.customtabs.CustomTabsIntent.Builder setInitialActivityWidthPx(int i) {
            if (i <= 0) {
                throw new java.lang.IllegalArgumentException("Invalid value for the initialWidthPx argument");
            }
            this.mIntent.putExtra(androidx.browser.customtabs.CustomTabsIntent.EXTRA_INITIAL_ACTIVITY_WIDTH_PX, i);
            return this;
        }

        public androidx.browser.customtabs.CustomTabsIntent.Builder setActivitySideSheetBreakpointDp(int i) {
            if (i <= 0) {
                throw new java.lang.IllegalArgumentException("Invalid value for the initialWidthPx argument");
            }
            this.mIntent.putExtra(androidx.browser.customtabs.CustomTabsIntent.EXTRA_ACTIVITY_SIDE_SHEET_BREAKPOINT_DP, i);
            return this;
        }

        public androidx.browser.customtabs.CustomTabsIntent.Builder setActivitySideSheetMaximizationEnabled(boolean z) {
            this.mIntent.putExtra(androidx.browser.customtabs.CustomTabsIntent.EXTRA_ACTIVITY_SIDE_SHEET_ENABLE_MAXIMIZATION, z);
            return this;
        }

        public androidx.browser.customtabs.CustomTabsIntent.Builder setActivitySideSheetPosition(int i) {
            if (i < 0 || i > 2) {
                throw new java.lang.IllegalArgumentException("Invalid value for the sideSheetPosition argument");
            }
            this.mIntent.putExtra(androidx.browser.customtabs.CustomTabsIntent.EXTRA_ACTIVITY_SIDE_SHEET_POSITION, i);
            return this;
        }

        public androidx.browser.customtabs.CustomTabsIntent.Builder setActivitySideSheetDecorationType(int i) {
            if (i < 0 || i > 3) {
                throw new java.lang.IllegalArgumentException("Invalid value for the decorationType argument");
            }
            this.mIntent.putExtra(androidx.browser.customtabs.CustomTabsIntent.EXTRA_ACTIVITY_SIDE_SHEET_DECORATION_TYPE, i);
            return this;
        }

        public androidx.browser.customtabs.CustomTabsIntent.Builder setActivitySideSheetRoundedCornersPosition(int i) {
            if (i < 0 || i > 2) {
                throw new java.lang.IllegalArgumentException("Invalid value for the roundedCornersPosition./ argument");
            }
            this.mIntent.putExtra(androidx.browser.customtabs.CustomTabsIntent.EXTRA_ACTIVITY_SIDE_SHEET_ROUNDED_CORNERS_POSITION, i);
            return this;
        }

        public androidx.browser.customtabs.CustomTabsIntent.Builder setToolbarCornerRadiusDp(int i) {
            if (i < 0 || i > 16) {
                throw new java.lang.IllegalArgumentException("Invalid value for the cornerRadiusDp argument");
            }
            this.mIntent.putExtra(androidx.browser.customtabs.CustomTabsIntent.EXTRA_TOOLBAR_CORNER_RADIUS_DP, i);
            return this;
        }

        public androidx.browser.customtabs.CustomTabsIntent.Builder setCloseButtonPosition(int i) {
            if (i < 0 || i > 2) {
                throw new java.lang.IllegalArgumentException("Invalid value for the position argument");
            }
            this.mIntent.putExtra(androidx.browser.customtabs.CustomTabsIntent.EXTRA_CLOSE_BUTTON_POSITION, i);
            return this;
        }

        public androidx.browser.customtabs.CustomTabsIntent.Builder setBookmarksButtonEnabled(boolean z) {
            this.mIntent.putExtra(androidx.browser.customtabs.CustomTabsIntent.EXTRA_DISABLE_BOOKMARKS_BUTTON, !z);
            return this;
        }

        public androidx.browser.customtabs.CustomTabsIntent.Builder setDownloadButtonEnabled(boolean z) {
            this.mIntent.putExtra(androidx.browser.customtabs.CustomTabsIntent.EXTRA_DISABLE_DOWNLOAD_BUTTON, !z);
            return this;
        }

        public androidx.browser.customtabs.CustomTabsIntent.Builder setSendToExternalDefaultHandlerEnabled(boolean z) {
            this.mIntent.putExtra(androidx.browser.customtabs.CustomTabsIntent.EXTRA_SEND_TO_EXTERNAL_DEFAULT_HANDLER, z);
            return this;
        }

        public androidx.browser.customtabs.CustomTabsIntent.Builder setTranslateLocale(java.util.Locale locale) {
            setLanguageTag(locale);
            return this;
        }

        public androidx.browser.customtabs.CustomTabsIntent.Builder setBackgroundInteractionEnabled(boolean z) {
            this.mIntent.putExtra(androidx.browser.customtabs.CustomTabsIntent.EXTRA_DISABLE_BACKGROUND_INTERACTION, !z);
            return this;
        }

        public androidx.browser.customtabs.CustomTabsIntent.Builder setShareIdentityEnabled(boolean z) {
            this.mShareIdentity = z;
            return this;
        }

        public androidx.browser.customtabs.CustomTabsIntent build() {
            if (!this.mIntent.hasExtra(androidx.browser.customtabs.CustomTabsIntent.EXTRA_SESSION)) {
                setSessionParameters(null, null);
            }
            java.util.ArrayList<android.os.Bundle> arrayList = this.mMenuItems;
            if (arrayList != null) {
                this.mIntent.putParcelableArrayListExtra(androidx.browser.customtabs.CustomTabsIntent.EXTRA_MENU_ITEMS, arrayList);
            }
            java.util.ArrayList<android.os.Bundle> arrayList2 = this.mActionButtons;
            if (arrayList2 != null) {
                this.mIntent.putParcelableArrayListExtra(androidx.browser.customtabs.CustomTabsIntent.EXTRA_TOOLBAR_ITEMS, arrayList2);
            }
            this.mIntent.putExtra(androidx.browser.customtabs.CustomTabsIntent.EXTRA_ENABLE_INSTANT_APPS, this.mInstantAppsEnabled);
            this.mIntent.putExtras(this.mDefaultColorSchemeBuilder.build().toBundle());
            android.os.Bundle bundle = this.mDefaultColorSchemeBundle;
            if (bundle != null) {
                this.mIntent.putExtras(bundle);
            }
            if (this.mColorSchemeParamBundles != null) {
                android.os.Bundle bundle2 = new android.os.Bundle();
                bundle2.putSparseParcelableArray(androidx.browser.customtabs.CustomTabsIntent.EXTRA_COLOR_SCHEME_PARAMS, this.mColorSchemeParamBundles);
                this.mIntent.putExtras(bundle2);
            }
            this.mIntent.putExtra(androidx.browser.customtabs.CustomTabsIntent.EXTRA_SHARE_STATE, this.mShareState);
            setCurrentLocaleAsDefaultAcceptLanguage();
            if (android.os.Build.VERSION.SDK_INT >= 34) {
                setShareIdentityEnabled();
            }
            android.app.ActivityOptions activityOptions = this.mActivityOptions;
            return new androidx.browser.customtabs.CustomTabsIntent(this.mIntent, activityOptions != null ? activityOptions.toBundle() : null);
        }

        private void setCurrentLocaleAsDefaultAcceptLanguage() {
            java.lang.String defaultLocale = androidx.browser.customtabs.CustomTabsIntent.Api24Impl.getDefaultLocale();
            if (android.text.TextUtils.isEmpty(defaultLocale)) {
                return;
            }
            android.os.Bundle bundleExtra = this.mIntent.hasExtra("com.android.browser.headers") ? this.mIntent.getBundleExtra("com.android.browser.headers") : new android.os.Bundle();
            if (bundleExtra.containsKey("Accept-Language")) {
                return;
            }
            bundleExtra.putString("Accept-Language", defaultLocale);
            this.mIntent.putExtra("com.android.browser.headers", bundleExtra);
        }

        private void setLanguageTag(java.util.Locale locale) {
            androidx.browser.customtabs.CustomTabsIntent.Api21Impl.setLanguageTag(this.mIntent, locale);
        }

        private void setShareIdentityEnabled() {
            if (this.mActivityOptions == null) {
                this.mActivityOptions = androidx.browser.customtabs.CustomTabsIntent.Api23Impl.makeBasicActivityOptions();
            }
            androidx.browser.customtabs.CustomTabsIntent.Api34Impl.setShareIdentityEnabled(this.mActivityOptions, this.mShareIdentity);
        }
    }

    public static android.content.Intent setAlwaysUseBrowserUI(android.content.Intent intent) {
        if (intent == null) {
            intent = new android.content.Intent("android.intent.action.VIEW");
        }
        intent.addFlags(268435456);
        intent.putExtra(EXTRA_USER_OPT_OUT_FROM_CUSTOM_TABS, true);
        return intent;
    }

    public static boolean shouldAlwaysUseBrowserUI(android.content.Intent intent) {
        return intent.getBooleanExtra(EXTRA_USER_OPT_OUT_FROM_CUSTOM_TABS, false) && (intent.getFlags() & 268435456) != 0;
    }

    public static androidx.browser.customtabs.CustomTabColorSchemeParams getColorSchemeParams(android.content.Intent intent, int i) {
        android.os.Bundle bundle;
        if (i < 0 || i > 2 || i == 0) {
            throw new java.lang.IllegalArgumentException("Invalid colorScheme: " + i);
        }
        android.os.Bundle extras = intent.getExtras();
        if (extras == null) {
            return androidx.browser.customtabs.CustomTabColorSchemeParams.fromBundle(null);
        }
        androidx.browser.customtabs.CustomTabColorSchemeParams customTabColorSchemeParamsFromBundle = androidx.browser.customtabs.CustomTabColorSchemeParams.fromBundle(extras);
        android.util.SparseArray sparseParcelableArray = extras.getSparseParcelableArray(EXTRA_COLOR_SCHEME_PARAMS);
        return (sparseParcelableArray == null || (bundle = (android.os.Bundle) sparseParcelableArray.get(i)) == null) ? customTabColorSchemeParamsFromBundle : androidx.browser.customtabs.CustomTabColorSchemeParams.fromBundle(bundle).withDefaults(customTabColorSchemeParamsFromBundle);
    }

    public static int getActivityResizeBehavior(android.content.Intent intent) {
        return intent.getIntExtra(EXTRA_ACTIVITY_HEIGHT_RESIZE_BEHAVIOR, 0);
    }

    public static int getInitialActivityHeightPx(android.content.Intent intent) {
        return intent.getIntExtra(EXTRA_INITIAL_ACTIVITY_HEIGHT_PX, 0);
    }

    public static int getInitialActivityWidthPx(android.content.Intent intent) {
        return intent.getIntExtra(EXTRA_INITIAL_ACTIVITY_WIDTH_PX, 0);
    }

    public static int getActivitySideSheetBreakpointDp(android.content.Intent intent) {
        return intent.getIntExtra(EXTRA_ACTIVITY_SIDE_SHEET_BREAKPOINT_DP, 0);
    }

    public static boolean isActivitySideSheetMaximizationEnabled(android.content.Intent intent) {
        return intent.getBooleanExtra(EXTRA_ACTIVITY_SIDE_SHEET_ENABLE_MAXIMIZATION, false);
    }

    public static int getActivitySideSheetPosition(android.content.Intent intent) {
        return intent.getIntExtra(EXTRA_ACTIVITY_SIDE_SHEET_POSITION, 0);
    }

    public static int getActivitySideSheetDecorationType(android.content.Intent intent) {
        return intent.getIntExtra(EXTRA_ACTIVITY_SIDE_SHEET_DECORATION_TYPE, 0);
    }

    public static int getActivitySideSheetRoundedCornersPosition(android.content.Intent intent) {
        return intent.getIntExtra(EXTRA_ACTIVITY_SIDE_SHEET_ROUNDED_CORNERS_POSITION, 0);
    }

    public static int getToolbarCornerRadiusDp(android.content.Intent intent) {
        return intent.getIntExtra(EXTRA_TOOLBAR_CORNER_RADIUS_DP, 16);
    }

    public static int getCloseButtonPosition(android.content.Intent intent) {
        return intent.getIntExtra(EXTRA_CLOSE_BUTTON_POSITION, 0);
    }

    public static boolean isBookmarksButtonEnabled(android.content.Intent intent) {
        return !intent.getBooleanExtra(EXTRA_DISABLE_BOOKMARKS_BUTTON, false);
    }

    public static boolean isDownloadButtonEnabled(android.content.Intent intent) {
        return !intent.getBooleanExtra(EXTRA_DISABLE_DOWNLOAD_BUTTON, false);
    }

    public static boolean isSendToExternalDefaultHandlerEnabled(android.content.Intent intent) {
        return intent.getBooleanExtra(EXTRA_SEND_TO_EXTERNAL_DEFAULT_HANDLER, false);
    }

    public static java.util.Locale getTranslateLocale(android.content.Intent intent) {
        return getLocaleForLanguageTag(intent);
    }

    private static java.util.Locale getLocaleForLanguageTag(android.content.Intent intent) {
        return androidx.browser.customtabs.CustomTabsIntent.Api21Impl.getLocaleForLanguageTag(intent);
    }

    public static boolean isBackgroundInteractionEnabled(android.content.Intent intent) {
        return !intent.getBooleanExtra(EXTRA_DISABLE_BACKGROUND_INTERACTION, false);
    }

    public static android.app.PendingIntent getSecondaryToolbarSwipeUpGesture(android.content.Intent intent) {
        return (android.app.PendingIntent) intent.getParcelableExtra(EXTRA_SECONDARY_TOOLBAR_SWIPE_UP_GESTURE);
    }

    private static class Api21Impl {
        private Api21Impl() {
        }

        static void setLanguageTag(android.content.Intent intent, java.util.Locale locale) {
            intent.putExtra(androidx.browser.customtabs.CustomTabsIntent.EXTRA_TRANSLATE_LANGUAGE_TAG, locale.toLanguageTag());
        }

        static java.util.Locale getLocaleForLanguageTag(android.content.Intent intent) {
            java.lang.String stringExtra = intent.getStringExtra(androidx.browser.customtabs.CustomTabsIntent.EXTRA_TRANSLATE_LANGUAGE_TAG);
            if (stringExtra != null) {
                return java.util.Locale.forLanguageTag(stringExtra);
            }
            return null;
        }
    }

    private static class Api23Impl {
        private Api23Impl() {
        }

        static android.app.ActivityOptions makeBasicActivityOptions() {
            return android.app.ActivityOptions.makeBasic();
        }
    }

    private static class Api24Impl {
        private Api24Impl() {
        }

        static java.lang.String getDefaultLocale() {
            android.os.LocaleList adjustedDefault = android.os.LocaleList.getAdjustedDefault();
            if (adjustedDefault.size() > 0) {
                return adjustedDefault.get(0).toLanguageTag();
            }
            return null;
        }
    }

    private static class Api34Impl {
        private Api34Impl() {
        }

        static void setShareIdentityEnabled(android.app.ActivityOptions activityOptions, boolean z) {
            activityOptions.setShareIdentityEnabled(z);
        }
    }
}
