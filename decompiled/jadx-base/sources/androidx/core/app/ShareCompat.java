package androidx.core.app;

/* JADX INFO: loaded from: classes.dex */
public final class ShareCompat {
    public static final java.lang.String EXTRA_CALLING_ACTIVITY = "androidx.core.app.EXTRA_CALLING_ACTIVITY";
    public static final java.lang.String EXTRA_CALLING_ACTIVITY_INTEROP = "android.support.v4.app.EXTRA_CALLING_ACTIVITY";
    public static final java.lang.String EXTRA_CALLING_PACKAGE = "androidx.core.app.EXTRA_CALLING_PACKAGE";
    public static final java.lang.String EXTRA_CALLING_PACKAGE_INTEROP = "android.support.v4.app.EXTRA_CALLING_PACKAGE";
    private static final java.lang.String HISTORY_FILENAME_PREFIX = ".sharecompat_";

    private ShareCompat() {
    }

    public static java.lang.String getCallingPackage(android.app.Activity activity) {
        android.content.Intent intent = activity.getIntent();
        java.lang.String callingPackage = activity.getCallingPackage();
        return (callingPackage != null || intent == null) ? callingPackage : getCallingPackage(intent);
    }

    static java.lang.String getCallingPackage(android.content.Intent intent) {
        java.lang.String stringExtra = intent.getStringExtra(EXTRA_CALLING_PACKAGE);
        return stringExtra == null ? intent.getStringExtra(EXTRA_CALLING_PACKAGE_INTEROP) : stringExtra;
    }

    public static android.content.ComponentName getCallingActivity(android.app.Activity activity) {
        android.content.Intent intent = activity.getIntent();
        android.content.ComponentName callingActivity = activity.getCallingActivity();
        return callingActivity == null ? getCallingActivity(intent) : callingActivity;
    }

    static android.content.ComponentName getCallingActivity(android.content.Intent intent) {
        android.content.ComponentName componentName = (android.content.ComponentName) intent.getParcelableExtra(EXTRA_CALLING_ACTIVITY);
        return componentName == null ? (android.content.ComponentName) intent.getParcelableExtra(EXTRA_CALLING_ACTIVITY_INTEROP) : componentName;
    }

    @java.lang.Deprecated
    public static void configureMenuItem(android.view.MenuItem menuItem, androidx.core.app.ShareCompat.IntentBuilder intentBuilder) {
        android.widget.ShareActionProvider shareActionProvider;
        android.view.ActionProvider actionProvider = menuItem.getActionProvider();
        if (!(actionProvider instanceof android.widget.ShareActionProvider)) {
            shareActionProvider = new android.widget.ShareActionProvider(intentBuilder.getContext());
        } else {
            shareActionProvider = (android.widget.ShareActionProvider) actionProvider;
        }
        shareActionProvider.setShareHistoryFileName(HISTORY_FILENAME_PREFIX + intentBuilder.getContext().getClass().getName());
        shareActionProvider.setShareIntent(intentBuilder.getIntent());
        menuItem.setActionProvider(shareActionProvider);
    }

    @java.lang.Deprecated
    public static void configureMenuItem(android.view.Menu menu, int i, androidx.core.app.ShareCompat.IntentBuilder intentBuilder) {
        android.view.MenuItem menuItemFindItem = menu.findItem(i);
        if (menuItemFindItem == null) {
            throw new java.lang.IllegalArgumentException("Could not find menu item with id " + i + " in the supplied menu");
        }
        configureMenuItem(menuItemFindItem, intentBuilder);
    }

    public static class IntentBuilder {
        private java.util.ArrayList<java.lang.String> mBccAddresses;
        private java.util.ArrayList<java.lang.String> mCcAddresses;
        private java.lang.CharSequence mChooserTitle;
        private final android.content.Context mContext;
        private final android.content.Intent mIntent;
        private java.util.ArrayList<android.net.Uri> mStreams;
        private java.util.ArrayList<java.lang.String> mToAddresses;

        @java.lang.Deprecated
        public static androidx.core.app.ShareCompat.IntentBuilder from(android.app.Activity activity) {
            return new androidx.core.app.ShareCompat.IntentBuilder(activity);
        }

        public IntentBuilder(android.content.Context context) {
            android.app.Activity activity;
            this.mContext = (android.content.Context) androidx.core.util.Preconditions.checkNotNull(context);
            android.content.Intent action = new android.content.Intent().setAction("android.intent.action.SEND");
            this.mIntent = action;
            action.putExtra(androidx.core.app.ShareCompat.EXTRA_CALLING_PACKAGE, context.getPackageName());
            action.putExtra(androidx.core.app.ShareCompat.EXTRA_CALLING_PACKAGE_INTEROP, context.getPackageName());
            action.addFlags(524288);
            while (true) {
                if (!(context instanceof android.content.ContextWrapper)) {
                    activity = null;
                    break;
                } else {
                    if (context instanceof android.app.Activity) {
                        activity = (android.app.Activity) context;
                        break;
                    }
                    context = ((android.content.ContextWrapper) context).getBaseContext();
                }
            }
            if (activity != null) {
                android.content.ComponentName componentName = activity.getComponentName();
                this.mIntent.putExtra(androidx.core.app.ShareCompat.EXTRA_CALLING_ACTIVITY, componentName);
                this.mIntent.putExtra(androidx.core.app.ShareCompat.EXTRA_CALLING_ACTIVITY_INTEROP, componentName);
            }
        }

        /* JADX WARN: Code duplicated, block: B:16:0x002f  */
        public android.content.Intent getIntent() {
            boolean z;
            java.util.ArrayList<java.lang.String> arrayList = this.mToAddresses;
            if (arrayList != null) {
                combineArrayExtra("android.intent.extra.EMAIL", arrayList);
                this.mToAddresses = null;
            }
            java.util.ArrayList<java.lang.String> arrayList2 = this.mCcAddresses;
            if (arrayList2 != null) {
                combineArrayExtra("android.intent.extra.CC", arrayList2);
                this.mCcAddresses = null;
            }
            java.util.ArrayList<java.lang.String> arrayList3 = this.mBccAddresses;
            if (arrayList3 != null) {
                combineArrayExtra("android.intent.extra.BCC", arrayList3);
                this.mBccAddresses = null;
            }
            java.util.ArrayList<android.net.Uri> arrayList4 = this.mStreams;
            if (arrayList4 != null) {
                z = arrayList4.size() > 1;
            }
            if (!z) {
                this.mIntent.setAction("android.intent.action.SEND");
                java.util.ArrayList<android.net.Uri> arrayList5 = this.mStreams;
                if (arrayList5 != null && !arrayList5.isEmpty()) {
                    this.mIntent.putExtra("android.intent.extra.STREAM", this.mStreams.get(0));
                    androidx.core.app.ShareCompat.Api16Impl.migrateExtraStreamToClipData(this.mIntent, this.mStreams);
                } else {
                    this.mIntent.removeExtra("android.intent.extra.STREAM");
                    androidx.core.app.ShareCompat.Api16Impl.removeClipData(this.mIntent);
                }
            } else {
                this.mIntent.setAction("android.intent.action.SEND_MULTIPLE");
                this.mIntent.putParcelableArrayListExtra("android.intent.extra.STREAM", this.mStreams);
                androidx.core.app.ShareCompat.Api16Impl.migrateExtraStreamToClipData(this.mIntent, this.mStreams);
            }
            return this.mIntent;
        }

        android.content.Context getContext() {
            return this.mContext;
        }

        private void combineArrayExtra(java.lang.String str, java.util.ArrayList<java.lang.String> arrayList) {
            java.lang.String[] stringArrayExtra = this.mIntent.getStringArrayExtra(str);
            int length = stringArrayExtra != null ? stringArrayExtra.length : 0;
            java.lang.String[] strArr = new java.lang.String[arrayList.size() + length];
            arrayList.toArray(strArr);
            if (stringArrayExtra != null) {
                java.lang.System.arraycopy(stringArrayExtra, 0, strArr, arrayList.size(), length);
            }
            this.mIntent.putExtra(str, strArr);
        }

        private void combineArrayExtra(java.lang.String str, java.lang.String[] strArr) {
            android.content.Intent intent = getIntent();
            java.lang.String[] stringArrayExtra = intent.getStringArrayExtra(str);
            int length = stringArrayExtra != null ? stringArrayExtra.length : 0;
            java.lang.String[] strArr2 = new java.lang.String[strArr.length + length];
            if (stringArrayExtra != null) {
                java.lang.System.arraycopy(stringArrayExtra, 0, strArr2, 0, length);
            }
            java.lang.System.arraycopy(strArr, 0, strArr2, length, strArr.length);
            intent.putExtra(str, strArr2);
        }

        public android.content.Intent createChooserIntent() {
            return android.content.Intent.createChooser(getIntent(), this.mChooserTitle);
        }

        public void startChooser() {
            this.mContext.startActivity(createChooserIntent());
        }

        public androidx.core.app.ShareCompat.IntentBuilder setChooserTitle(java.lang.CharSequence charSequence) {
            this.mChooserTitle = charSequence;
            return this;
        }

        public androidx.core.app.ShareCompat.IntentBuilder setChooserTitle(int i) {
            return setChooserTitle(this.mContext.getText(i));
        }

        public androidx.core.app.ShareCompat.IntentBuilder setType(java.lang.String str) {
            this.mIntent.setType(str);
            return this;
        }

        public androidx.core.app.ShareCompat.IntentBuilder setText(java.lang.CharSequence charSequence) {
            this.mIntent.putExtra("android.intent.extra.TEXT", charSequence);
            return this;
        }

        public androidx.core.app.ShareCompat.IntentBuilder setHtmlText(java.lang.String str) {
            this.mIntent.putExtra(androidx.core.content.IntentCompat.EXTRA_HTML_TEXT, str);
            if (!this.mIntent.hasExtra("android.intent.extra.TEXT")) {
                setText(android.text.Html.fromHtml(str));
            }
            return this;
        }

        public androidx.core.app.ShareCompat.IntentBuilder setStream(android.net.Uri uri) {
            this.mStreams = null;
            if (uri != null) {
                addStream(uri);
            }
            return this;
        }

        public androidx.core.app.ShareCompat.IntentBuilder addStream(android.net.Uri uri) {
            if (this.mStreams == null) {
                this.mStreams = new java.util.ArrayList<>();
            }
            this.mStreams.add(uri);
            return this;
        }

        public androidx.core.app.ShareCompat.IntentBuilder setEmailTo(java.lang.String[] strArr) {
            if (this.mToAddresses != null) {
                this.mToAddresses = null;
            }
            this.mIntent.putExtra("android.intent.extra.EMAIL", strArr);
            return this;
        }

        public androidx.core.app.ShareCompat.IntentBuilder addEmailTo(java.lang.String str) {
            if (this.mToAddresses == null) {
                this.mToAddresses = new java.util.ArrayList<>();
            }
            this.mToAddresses.add(str);
            return this;
        }

        public androidx.core.app.ShareCompat.IntentBuilder addEmailTo(java.lang.String[] strArr) {
            combineArrayExtra("android.intent.extra.EMAIL", strArr);
            return this;
        }

        public androidx.core.app.ShareCompat.IntentBuilder setEmailCc(java.lang.String[] strArr) {
            this.mIntent.putExtra("android.intent.extra.CC", strArr);
            return this;
        }

        public androidx.core.app.ShareCompat.IntentBuilder addEmailCc(java.lang.String str) {
            if (this.mCcAddresses == null) {
                this.mCcAddresses = new java.util.ArrayList<>();
            }
            this.mCcAddresses.add(str);
            return this;
        }

        public androidx.core.app.ShareCompat.IntentBuilder addEmailCc(java.lang.String[] strArr) {
            combineArrayExtra("android.intent.extra.CC", strArr);
            return this;
        }

        public androidx.core.app.ShareCompat.IntentBuilder setEmailBcc(java.lang.String[] strArr) {
            this.mIntent.putExtra("android.intent.extra.BCC", strArr);
            return this;
        }

        public androidx.core.app.ShareCompat.IntentBuilder addEmailBcc(java.lang.String str) {
            if (this.mBccAddresses == null) {
                this.mBccAddresses = new java.util.ArrayList<>();
            }
            this.mBccAddresses.add(str);
            return this;
        }

        public androidx.core.app.ShareCompat.IntentBuilder addEmailBcc(java.lang.String[] strArr) {
            combineArrayExtra("android.intent.extra.BCC", strArr);
            return this;
        }

        public androidx.core.app.ShareCompat.IntentBuilder setSubject(java.lang.String str) {
            this.mIntent.putExtra("android.intent.extra.SUBJECT", str);
            return this;
        }
    }

    public static class IntentReader {
        private static final java.lang.String TAG = "IntentReader";
        private final android.content.ComponentName mCallingActivity;
        private final java.lang.String mCallingPackage;
        private final android.content.Context mContext;
        private final android.content.Intent mIntent;
        private java.util.ArrayList<android.net.Uri> mStreams;

        @java.lang.Deprecated
        public static androidx.core.app.ShareCompat.IntentReader from(android.app.Activity activity) {
            return new androidx.core.app.ShareCompat.IntentReader(activity);
        }

        public IntentReader(android.app.Activity activity) {
            this((android.content.Context) androidx.core.util.Preconditions.checkNotNull(activity), activity.getIntent());
        }

        public IntentReader(android.content.Context context, android.content.Intent intent) {
            this.mContext = (android.content.Context) androidx.core.util.Preconditions.checkNotNull(context);
            this.mIntent = (android.content.Intent) androidx.core.util.Preconditions.checkNotNull(intent);
            this.mCallingPackage = androidx.core.app.ShareCompat.getCallingPackage(intent);
            this.mCallingActivity = androidx.core.app.ShareCompat.getCallingActivity(intent);
        }

        public boolean isShareIntent() {
            java.lang.String action = this.mIntent.getAction();
            return "android.intent.action.SEND".equals(action) || "android.intent.action.SEND_MULTIPLE".equals(action);
        }

        public boolean isSingleShare() {
            return "android.intent.action.SEND".equals(this.mIntent.getAction());
        }

        public boolean isMultipleShare() {
            return "android.intent.action.SEND_MULTIPLE".equals(this.mIntent.getAction());
        }

        public java.lang.String getType() {
            return this.mIntent.getType();
        }

        public java.lang.CharSequence getText() {
            return this.mIntent.getCharSequenceExtra("android.intent.extra.TEXT");
        }

        public java.lang.String getHtmlText() {
            java.lang.String stringExtra = this.mIntent.getStringExtra(androidx.core.content.IntentCompat.EXTRA_HTML_TEXT);
            if (stringExtra != null) {
                return stringExtra;
            }
            java.lang.CharSequence text = getText();
            if (text instanceof android.text.Spanned) {
                return android.text.Html.toHtml((android.text.Spanned) text);
            }
            return text != null ? androidx.core.app.ShareCompat.Api16Impl.escapeHtml(text) : stringExtra;
        }

        private static void withinStyle(java.lang.StringBuilder sb, java.lang.CharSequence charSequence, int i, int i2) {
            while (i < i2) {
                char cCharAt = charSequence.charAt(i);
                if (cCharAt == '<') {
                    sb.append("&lt;");
                } else if (cCharAt == '>') {
                    sb.append("&gt;");
                } else if (cCharAt == '&') {
                    sb.append("&amp;");
                } else if (cCharAt > '~' || cCharAt < ' ') {
                    sb.append("&#").append((int) cCharAt).append(";");
                } else if (cCharAt == ' ') {
                    while (true) {
                        int i3 = i + 1;
                        if (i3 >= i2 || charSequence.charAt(i3) != ' ') {
                            break;
                        }
                        sb.append("&nbsp;");
                        i = i3;
                    }
                    sb.append(' ');
                } else {
                    sb.append(cCharAt);
                }
                i++;
            }
        }

        public android.net.Uri getStream() {
            return (android.net.Uri) this.mIntent.getParcelableExtra("android.intent.extra.STREAM");
        }

        public android.net.Uri getStream(int i) {
            if (this.mStreams == null && isMultipleShare()) {
                this.mStreams = this.mIntent.getParcelableArrayListExtra("android.intent.extra.STREAM");
            }
            java.util.ArrayList<android.net.Uri> arrayList = this.mStreams;
            if (arrayList != null) {
                return arrayList.get(i);
            }
            if (i == 0) {
                return (android.net.Uri) this.mIntent.getParcelableExtra("android.intent.extra.STREAM");
            }
            throw new java.lang.IndexOutOfBoundsException("Stream items available: " + getStreamCount() + " index requested: " + i);
        }

        public int getStreamCount() {
            if (this.mStreams == null && isMultipleShare()) {
                this.mStreams = this.mIntent.getParcelableArrayListExtra("android.intent.extra.STREAM");
            }
            java.util.ArrayList<android.net.Uri> arrayList = this.mStreams;
            if (arrayList != null) {
                return arrayList.size();
            }
            return this.mIntent.hasExtra("android.intent.extra.STREAM") ? 1 : 0;
        }

        public java.lang.String[] getEmailTo() {
            return this.mIntent.getStringArrayExtra("android.intent.extra.EMAIL");
        }

        public java.lang.String[] getEmailCc() {
            return this.mIntent.getStringArrayExtra("android.intent.extra.CC");
        }

        public java.lang.String[] getEmailBcc() {
            return this.mIntent.getStringArrayExtra("android.intent.extra.BCC");
        }

        public java.lang.String getSubject() {
            return this.mIntent.getStringExtra("android.intent.extra.SUBJECT");
        }

        public java.lang.String getCallingPackage() {
            return this.mCallingPackage;
        }

        public android.content.ComponentName getCallingActivity() {
            return this.mCallingActivity;
        }

        public android.graphics.drawable.Drawable getCallingActivityIcon() {
            if (this.mCallingActivity == null) {
                return null;
            }
            try {
                return this.mContext.getPackageManager().getActivityIcon(this.mCallingActivity);
            } catch (android.content.pm.PackageManager.NameNotFoundException e) {
                android.util.Log.e(TAG, "Could not retrieve icon for calling activity", e);
                return null;
            }
        }

        public android.graphics.drawable.Drawable getCallingApplicationIcon() {
            if (this.mCallingPackage == null) {
                return null;
            }
            try {
                return this.mContext.getPackageManager().getApplicationIcon(this.mCallingPackage);
            } catch (android.content.pm.PackageManager.NameNotFoundException e) {
                android.util.Log.e(TAG, "Could not retrieve icon for calling application", e);
                return null;
            }
        }

        public java.lang.CharSequence getCallingApplicationLabel() {
            if (this.mCallingPackage == null) {
                return null;
            }
            android.content.pm.PackageManager packageManager = this.mContext.getPackageManager();
            try {
                return packageManager.getApplicationLabel(packageManager.getApplicationInfo(this.mCallingPackage, 0));
            } catch (android.content.pm.PackageManager.NameNotFoundException e) {
                android.util.Log.e(TAG, "Could not retrieve label for calling application", e);
                return null;
            }
        }
    }

    private static class Api16Impl {
        private Api16Impl() {
        }

        static void migrateExtraStreamToClipData(android.content.Intent intent, java.util.ArrayList<android.net.Uri> arrayList) {
            android.content.ClipData clipData = new android.content.ClipData(null, new java.lang.String[]{intent.getType()}, new android.content.ClipData.Item(intent.getCharSequenceExtra("android.intent.extra.TEXT"), intent.getStringExtra(androidx.core.content.IntentCompat.EXTRA_HTML_TEXT), null, arrayList.get(0)));
            int size = arrayList.size();
            for (int i = 1; i < size; i++) {
                clipData.addItem(new android.content.ClipData.Item(arrayList.get(i)));
            }
            intent.setClipData(clipData);
            intent.addFlags(1);
        }

        static void removeClipData(android.content.Intent intent) {
            intent.setClipData(null);
            intent.setFlags(intent.getFlags() & (-2));
        }

        static java.lang.String escapeHtml(java.lang.CharSequence charSequence) {
            return android.text.Html.escapeHtml(charSequence);
        }
    }
}
