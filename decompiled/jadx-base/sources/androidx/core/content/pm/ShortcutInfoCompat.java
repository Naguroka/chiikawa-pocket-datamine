package androidx.core.content.pm;

/* JADX INFO: loaded from: classes.dex */
public class ShortcutInfoCompat {
    private static final java.lang.String EXTRA_LOCUS_ID = "extraLocusId";
    private static final java.lang.String EXTRA_LONG_LIVED = "extraLongLived";
    private static final java.lang.String EXTRA_PERSON_ = "extraPerson_";
    private static final java.lang.String EXTRA_PERSON_COUNT = "extraPersonCount";
    private static final java.lang.String EXTRA_SLICE_URI = "extraSliceUri";
    public static final int SURFACE_LAUNCHER = 1;
    android.content.ComponentName mActivity;
    java.util.Set<java.lang.String> mCategories;
    android.content.Context mContext;
    java.lang.CharSequence mDisabledMessage;
    int mDisabledReason;
    int mExcludedSurfaces;
    android.os.PersistableBundle mExtras;
    boolean mHasKeyFieldsOnly;
    androidx.core.graphics.drawable.IconCompat mIcon;
    java.lang.String mId;
    android.content.Intent[] mIntents;
    boolean mIsAlwaysBadged;
    boolean mIsCached;
    boolean mIsDeclaredInManifest;
    boolean mIsDynamic;
    boolean mIsEnabled = true;
    boolean mIsImmutable;
    boolean mIsLongLived;
    boolean mIsPinned;
    java.lang.CharSequence mLabel;
    long mLastChangedTimestamp;
    androidx.core.content.LocusIdCompat mLocusId;
    java.lang.CharSequence mLongLabel;
    java.lang.String mPackageName;
    androidx.core.app.Person[] mPersons;
    int mRank;
    android.os.Bundle mTransientExtras;
    android.os.UserHandle mUser;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface Surface {
    }

    ShortcutInfoCompat() {
    }

    public android.content.pm.ShortcutInfo toShortcutInfo() {
        android.content.pm.ShortcutInfo.Builder intents = new android.content.pm.ShortcutInfo.Builder(this.mContext, this.mId).setShortLabel(this.mLabel).setIntents(this.mIntents);
        androidx.core.graphics.drawable.IconCompat iconCompat = this.mIcon;
        if (iconCompat != null) {
            intents.setIcon(iconCompat.toIcon(this.mContext));
        }
        if (!android.text.TextUtils.isEmpty(this.mLongLabel)) {
            intents.setLongLabel(this.mLongLabel);
        }
        if (!android.text.TextUtils.isEmpty(this.mDisabledMessage)) {
            intents.setDisabledMessage(this.mDisabledMessage);
        }
        android.content.ComponentName componentName = this.mActivity;
        if (componentName != null) {
            intents.setActivity(componentName);
        }
        java.util.Set<java.lang.String> set = this.mCategories;
        if (set != null) {
            intents.setCategories(set);
        }
        intents.setRank(this.mRank);
        android.os.PersistableBundle persistableBundle = this.mExtras;
        if (persistableBundle != null) {
            intents.setExtras(persistableBundle);
        }
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            androidx.core.app.Person[] personArr = this.mPersons;
            if (personArr != null && personArr.length > 0) {
                int length = personArr.length;
                android.app.Person[] personArr2 = new android.app.Person[length];
                for (int i = 0; i < length; i++) {
                    personArr2[i] = this.mPersons[i].toAndroidPerson();
                }
                intents.setPersons(personArr2);
            }
            androidx.core.content.LocusIdCompat locusIdCompat = this.mLocusId;
            if (locusIdCompat != null) {
                intents.setLocusId(locusIdCompat.toLocusId());
            }
            intents.setLongLived(this.mIsLongLived);
        } else {
            intents.setExtras(buildLegacyExtrasBundle());
        }
        return intents.build();
    }

    private android.os.PersistableBundle buildLegacyExtrasBundle() {
        if (this.mExtras == null) {
            this.mExtras = new android.os.PersistableBundle();
        }
        androidx.core.app.Person[] personArr = this.mPersons;
        if (personArr != null && personArr.length > 0) {
            this.mExtras.putInt(EXTRA_PERSON_COUNT, personArr.length);
            int i = 0;
            while (i < this.mPersons.length) {
                int i2 = i + 1;
                this.mExtras.putPersistableBundle(EXTRA_PERSON_ + i2, this.mPersons[i].toPersistableBundle());
                i = i2;
            }
        }
        androidx.core.content.LocusIdCompat locusIdCompat = this.mLocusId;
        if (locusIdCompat != null) {
            this.mExtras.putString(EXTRA_LOCUS_ID, locusIdCompat.getId());
        }
        this.mExtras.putBoolean(EXTRA_LONG_LIVED, this.mIsLongLived);
        return this.mExtras;
    }

    android.content.Intent addToIntent(android.content.Intent intent) {
        android.content.Intent[] intentArr = this.mIntents;
        intent.putExtra("android.intent.extra.shortcut.INTENT", intentArr[intentArr.length - 1]).putExtra("android.intent.extra.shortcut.NAME", this.mLabel.toString());
        if (this.mIcon != null) {
            android.graphics.drawable.Drawable activityIcon = null;
            if (this.mIsAlwaysBadged) {
                android.content.pm.PackageManager packageManager = this.mContext.getPackageManager();
                android.content.ComponentName componentName = this.mActivity;
                if (componentName != null) {
                    try {
                        activityIcon = packageManager.getActivityIcon(componentName);
                    } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
                    }
                }
                if (activityIcon == null) {
                    activityIcon = this.mContext.getApplicationInfo().loadIcon(packageManager);
                }
            }
            this.mIcon.addToShortcutIntent(intent, activityIcon, this.mContext);
        }
        return intent;
    }

    public java.lang.String getId() {
        return this.mId;
    }

    public java.lang.String getPackage() {
        return this.mPackageName;
    }

    public android.content.ComponentName getActivity() {
        return this.mActivity;
    }

    public java.lang.CharSequence getShortLabel() {
        return this.mLabel;
    }

    public java.lang.CharSequence getLongLabel() {
        return this.mLongLabel;
    }

    public java.lang.CharSequence getDisabledMessage() {
        return this.mDisabledMessage;
    }

    public int getDisabledReason() {
        return this.mDisabledReason;
    }

    public android.content.Intent getIntent() {
        android.content.Intent[] intentArr = this.mIntents;
        return intentArr[intentArr.length - 1];
    }

    public android.content.Intent[] getIntents() {
        android.content.Intent[] intentArr = this.mIntents;
        return (android.content.Intent[]) java.util.Arrays.copyOf(intentArr, intentArr.length);
    }

    public java.util.Set<java.lang.String> getCategories() {
        return this.mCategories;
    }

    public androidx.core.content.LocusIdCompat getLocusId() {
        return this.mLocusId;
    }

    public int getRank() {
        return this.mRank;
    }

    public androidx.core.graphics.drawable.IconCompat getIcon() {
        return this.mIcon;
    }

    static androidx.core.app.Person[] getPersonsFromExtra(android.os.PersistableBundle persistableBundle) {
        if (persistableBundle == null || !persistableBundle.containsKey(EXTRA_PERSON_COUNT)) {
            return null;
        }
        int i = persistableBundle.getInt(EXTRA_PERSON_COUNT);
        androidx.core.app.Person[] personArr = new androidx.core.app.Person[i];
        int i2 = 0;
        while (i2 < i) {
            int i3 = i2 + 1;
            personArr[i2] = androidx.core.app.Person.fromPersistableBundle(persistableBundle.getPersistableBundle(EXTRA_PERSON_ + i3));
            i2 = i3;
        }
        return personArr;
    }

    static boolean getLongLivedFromExtra(android.os.PersistableBundle persistableBundle) {
        if (persistableBundle == null || !persistableBundle.containsKey(EXTRA_LONG_LIVED)) {
            return false;
        }
        return persistableBundle.getBoolean(EXTRA_LONG_LIVED);
    }

    static java.util.List<androidx.core.content.pm.ShortcutInfoCompat> fromShortcuts(android.content.Context context, java.util.List<android.content.pm.ShortcutInfo> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        java.util.Iterator<android.content.pm.ShortcutInfo> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new androidx.core.content.pm.ShortcutInfoCompat.Builder(context, it.next()).build());
        }
        return arrayList;
    }

    public android.os.PersistableBundle getExtras() {
        return this.mExtras;
    }

    public android.os.Bundle getTransientExtras() {
        return this.mTransientExtras;
    }

    public android.os.UserHandle getUserHandle() {
        return this.mUser;
    }

    public long getLastChangedTimestamp() {
        return this.mLastChangedTimestamp;
    }

    public boolean isCached() {
        return this.mIsCached;
    }

    public boolean isDynamic() {
        return this.mIsDynamic;
    }

    public boolean isPinned() {
        return this.mIsPinned;
    }

    public boolean isDeclaredInManifest() {
        return this.mIsDeclaredInManifest;
    }

    public boolean isImmutable() {
        return this.mIsImmutable;
    }

    public boolean isEnabled() {
        return this.mIsEnabled;
    }

    public boolean hasKeyFieldsOnly() {
        return this.mHasKeyFieldsOnly;
    }

    static androidx.core.content.LocusIdCompat getLocusId(android.content.pm.ShortcutInfo shortcutInfo) {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            if (shortcutInfo.getLocusId() == null) {
                return null;
            }
            return androidx.core.content.LocusIdCompat.toLocusIdCompat(shortcutInfo.getLocusId());
        }
        return getLocusIdFromExtra(shortcutInfo.getExtras());
    }

    public boolean isExcludedFromSurfaces(int i) {
        return (i & this.mExcludedSurfaces) != 0;
    }

    public int getExcludedFromSurfaces() {
        return this.mExcludedSurfaces;
    }

    private static androidx.core.content.LocusIdCompat getLocusIdFromExtra(android.os.PersistableBundle persistableBundle) {
        java.lang.String string;
        if (persistableBundle == null || (string = persistableBundle.getString(EXTRA_LOCUS_ID)) == null) {
            return null;
        }
        return new androidx.core.content.LocusIdCompat(string);
    }

    public static class Builder {
        private java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<java.lang.String>>> mCapabilityBindingParams;
        private java.util.Set<java.lang.String> mCapabilityBindings;
        private final androidx.core.content.pm.ShortcutInfoCompat mInfo;
        private boolean mIsConversation;
        private android.net.Uri mSliceUri;

        public Builder(android.content.Context context, java.lang.String str) {
            androidx.core.content.pm.ShortcutInfoCompat shortcutInfoCompat = new androidx.core.content.pm.ShortcutInfoCompat();
            this.mInfo = shortcutInfoCompat;
            shortcutInfoCompat.mContext = context;
            shortcutInfoCompat.mId = str;
        }

        public Builder(androidx.core.content.pm.ShortcutInfoCompat shortcutInfoCompat) {
            androidx.core.content.pm.ShortcutInfoCompat shortcutInfoCompat2 = new androidx.core.content.pm.ShortcutInfoCompat();
            this.mInfo = shortcutInfoCompat2;
            shortcutInfoCompat2.mContext = shortcutInfoCompat.mContext;
            shortcutInfoCompat2.mId = shortcutInfoCompat.mId;
            shortcutInfoCompat2.mPackageName = shortcutInfoCompat.mPackageName;
            shortcutInfoCompat2.mIntents = (android.content.Intent[]) java.util.Arrays.copyOf(shortcutInfoCompat.mIntents, shortcutInfoCompat.mIntents.length);
            shortcutInfoCompat2.mActivity = shortcutInfoCompat.mActivity;
            shortcutInfoCompat2.mLabel = shortcutInfoCompat.mLabel;
            shortcutInfoCompat2.mLongLabel = shortcutInfoCompat.mLongLabel;
            shortcutInfoCompat2.mDisabledMessage = shortcutInfoCompat.mDisabledMessage;
            shortcutInfoCompat2.mDisabledReason = shortcutInfoCompat.mDisabledReason;
            shortcutInfoCompat2.mIcon = shortcutInfoCompat.mIcon;
            shortcutInfoCompat2.mIsAlwaysBadged = shortcutInfoCompat.mIsAlwaysBadged;
            shortcutInfoCompat2.mUser = shortcutInfoCompat.mUser;
            shortcutInfoCompat2.mLastChangedTimestamp = shortcutInfoCompat.mLastChangedTimestamp;
            shortcutInfoCompat2.mIsCached = shortcutInfoCompat.mIsCached;
            shortcutInfoCompat2.mIsDynamic = shortcutInfoCompat.mIsDynamic;
            shortcutInfoCompat2.mIsPinned = shortcutInfoCompat.mIsPinned;
            shortcutInfoCompat2.mIsDeclaredInManifest = shortcutInfoCompat.mIsDeclaredInManifest;
            shortcutInfoCompat2.mIsImmutable = shortcutInfoCompat.mIsImmutable;
            shortcutInfoCompat2.mIsEnabled = shortcutInfoCompat.mIsEnabled;
            shortcutInfoCompat2.mLocusId = shortcutInfoCompat.mLocusId;
            shortcutInfoCompat2.mIsLongLived = shortcutInfoCompat.mIsLongLived;
            shortcutInfoCompat2.mHasKeyFieldsOnly = shortcutInfoCompat.mHasKeyFieldsOnly;
            shortcutInfoCompat2.mRank = shortcutInfoCompat.mRank;
            if (shortcutInfoCompat.mPersons != null) {
                shortcutInfoCompat2.mPersons = (androidx.core.app.Person[]) java.util.Arrays.copyOf(shortcutInfoCompat.mPersons, shortcutInfoCompat.mPersons.length);
            }
            if (shortcutInfoCompat.mCategories != null) {
                shortcutInfoCompat2.mCategories = new java.util.HashSet(shortcutInfoCompat.mCategories);
            }
            if (shortcutInfoCompat.mExtras != null) {
                shortcutInfoCompat2.mExtras = shortcutInfoCompat.mExtras;
            }
            shortcutInfoCompat2.mExcludedSurfaces = shortcutInfoCompat.mExcludedSurfaces;
        }

        public Builder(android.content.Context context, android.content.pm.ShortcutInfo shortcutInfo) {
            androidx.core.content.pm.ShortcutInfoCompat shortcutInfoCompat = new androidx.core.content.pm.ShortcutInfoCompat();
            this.mInfo = shortcutInfoCompat;
            shortcutInfoCompat.mContext = context;
            shortcutInfoCompat.mId = shortcutInfo.getId();
            shortcutInfoCompat.mPackageName = shortcutInfo.getPackage();
            android.content.Intent[] intents = shortcutInfo.getIntents();
            shortcutInfoCompat.mIntents = (android.content.Intent[]) java.util.Arrays.copyOf(intents, intents.length);
            shortcutInfoCompat.mActivity = shortcutInfo.getActivity();
            shortcutInfoCompat.mLabel = shortcutInfo.getShortLabel();
            shortcutInfoCompat.mLongLabel = shortcutInfo.getLongLabel();
            shortcutInfoCompat.mDisabledMessage = shortcutInfo.getDisabledMessage();
            if (android.os.Build.VERSION.SDK_INT >= 28) {
                shortcutInfoCompat.mDisabledReason = shortcutInfo.getDisabledReason();
            } else {
                shortcutInfoCompat.mDisabledReason = shortcutInfo.isEnabled() ? 0 : 3;
            }
            shortcutInfoCompat.mCategories = shortcutInfo.getCategories();
            shortcutInfoCompat.mPersons = androidx.core.content.pm.ShortcutInfoCompat.getPersonsFromExtra(shortcutInfo.getExtras());
            shortcutInfoCompat.mUser = shortcutInfo.getUserHandle();
            shortcutInfoCompat.mLastChangedTimestamp = shortcutInfo.getLastChangedTimestamp();
            if (android.os.Build.VERSION.SDK_INT >= 30) {
                shortcutInfoCompat.mIsCached = shortcutInfo.isCached();
            }
            shortcutInfoCompat.mIsDynamic = shortcutInfo.isDynamic();
            shortcutInfoCompat.mIsPinned = shortcutInfo.isPinned();
            shortcutInfoCompat.mIsDeclaredInManifest = shortcutInfo.isDeclaredInManifest();
            shortcutInfoCompat.mIsImmutable = shortcutInfo.isImmutable();
            shortcutInfoCompat.mIsEnabled = shortcutInfo.isEnabled();
            shortcutInfoCompat.mHasKeyFieldsOnly = shortcutInfo.hasKeyFieldsOnly();
            shortcutInfoCompat.mLocusId = androidx.core.content.pm.ShortcutInfoCompat.getLocusId(shortcutInfo);
            shortcutInfoCompat.mRank = shortcutInfo.getRank();
            shortcutInfoCompat.mExtras = shortcutInfo.getExtras();
        }

        public androidx.core.content.pm.ShortcutInfoCompat.Builder setShortLabel(java.lang.CharSequence charSequence) {
            this.mInfo.mLabel = charSequence;
            return this;
        }

        public androidx.core.content.pm.ShortcutInfoCompat.Builder setLongLabel(java.lang.CharSequence charSequence) {
            this.mInfo.mLongLabel = charSequence;
            return this;
        }

        public androidx.core.content.pm.ShortcutInfoCompat.Builder setDisabledMessage(java.lang.CharSequence charSequence) {
            this.mInfo.mDisabledMessage = charSequence;
            return this;
        }

        public androidx.core.content.pm.ShortcutInfoCompat.Builder setIntent(android.content.Intent intent) {
            return setIntents(new android.content.Intent[]{intent});
        }

        public androidx.core.content.pm.ShortcutInfoCompat.Builder setIntents(android.content.Intent[] intentArr) {
            this.mInfo.mIntents = intentArr;
            return this;
        }

        public androidx.core.content.pm.ShortcutInfoCompat.Builder setIcon(androidx.core.graphics.drawable.IconCompat iconCompat) {
            this.mInfo.mIcon = iconCompat;
            return this;
        }

        public androidx.core.content.pm.ShortcutInfoCompat.Builder setLocusId(androidx.core.content.LocusIdCompat locusIdCompat) {
            this.mInfo.mLocusId = locusIdCompat;
            return this;
        }

        public androidx.core.content.pm.ShortcutInfoCompat.Builder setIsConversation() {
            this.mIsConversation = true;
            return this;
        }

        public androidx.core.content.pm.ShortcutInfoCompat.Builder setActivity(android.content.ComponentName componentName) {
            this.mInfo.mActivity = componentName;
            return this;
        }

        public androidx.core.content.pm.ShortcutInfoCompat.Builder setAlwaysBadged() {
            this.mInfo.mIsAlwaysBadged = true;
            return this;
        }

        public androidx.core.content.pm.ShortcutInfoCompat.Builder setPerson(androidx.core.app.Person person) {
            return setPersons(new androidx.core.app.Person[]{person});
        }

        public androidx.core.content.pm.ShortcutInfoCompat.Builder setPersons(androidx.core.app.Person[] personArr) {
            this.mInfo.mPersons = personArr;
            return this;
        }

        public androidx.core.content.pm.ShortcutInfoCompat.Builder setCategories(java.util.Set<java.lang.String> set) {
            this.mInfo.mCategories = set;
            return this;
        }

        @java.lang.Deprecated
        public androidx.core.content.pm.ShortcutInfoCompat.Builder setLongLived() {
            this.mInfo.mIsLongLived = true;
            return this;
        }

        public androidx.core.content.pm.ShortcutInfoCompat.Builder setLongLived(boolean z) {
            this.mInfo.mIsLongLived = z;
            return this;
        }

        public androidx.core.content.pm.ShortcutInfoCompat.Builder setExcludedFromSurfaces(int i) {
            this.mInfo.mExcludedSurfaces = i;
            return this;
        }

        public androidx.core.content.pm.ShortcutInfoCompat.Builder setRank(int i) {
            this.mInfo.mRank = i;
            return this;
        }

        public androidx.core.content.pm.ShortcutInfoCompat.Builder setExtras(android.os.PersistableBundle persistableBundle) {
            this.mInfo.mExtras = persistableBundle;
            return this;
        }

        public androidx.core.content.pm.ShortcutInfoCompat.Builder setTransientExtras(android.os.Bundle bundle) {
            this.mInfo.mTransientExtras = (android.os.Bundle) androidx.core.util.Preconditions.checkNotNull(bundle);
            return this;
        }

        public androidx.core.content.pm.ShortcutInfoCompat.Builder addCapabilityBinding(java.lang.String str) {
            if (this.mCapabilityBindings == null) {
                this.mCapabilityBindings = new java.util.HashSet();
            }
            this.mCapabilityBindings.add(str);
            return this;
        }

        public androidx.core.content.pm.ShortcutInfoCompat.Builder addCapabilityBinding(java.lang.String str, java.lang.String str2, java.util.List<java.lang.String> list) {
            addCapabilityBinding(str);
            if (!list.isEmpty()) {
                if (this.mCapabilityBindingParams == null) {
                    this.mCapabilityBindingParams = new java.util.HashMap();
                }
                if (this.mCapabilityBindingParams.get(str) == null) {
                    this.mCapabilityBindingParams.put(str, new java.util.HashMap());
                }
                this.mCapabilityBindingParams.get(str).put(str2, list);
            }
            return this;
        }

        public androidx.core.content.pm.ShortcutInfoCompat.Builder setSliceUri(android.net.Uri uri) {
            this.mSliceUri = uri;
            return this;
        }

        public androidx.core.content.pm.ShortcutInfoCompat build() {
            if (android.text.TextUtils.isEmpty(this.mInfo.mLabel)) {
                throw new java.lang.IllegalArgumentException("Shortcut must have a non-empty label");
            }
            if (this.mInfo.mIntents == null || this.mInfo.mIntents.length == 0) {
                throw new java.lang.IllegalArgumentException("Shortcut must have an intent");
            }
            if (this.mIsConversation) {
                if (this.mInfo.mLocusId == null) {
                    this.mInfo.mLocusId = new androidx.core.content.LocusIdCompat(this.mInfo.mId);
                }
                this.mInfo.mIsLongLived = true;
            }
            if (this.mCapabilityBindings != null) {
                if (this.mInfo.mCategories == null) {
                    this.mInfo.mCategories = new java.util.HashSet();
                }
                this.mInfo.mCategories.addAll(this.mCapabilityBindings);
            }
            if (this.mCapabilityBindingParams != null) {
                if (this.mInfo.mExtras == null) {
                    this.mInfo.mExtras = new android.os.PersistableBundle();
                }
                for (java.lang.String str : this.mCapabilityBindingParams.keySet()) {
                    java.util.Map<java.lang.String, java.util.List<java.lang.String>> map = this.mCapabilityBindingParams.get(str);
                    this.mInfo.mExtras.putStringArray(str, (java.lang.String[]) map.keySet().toArray(new java.lang.String[0]));
                    for (java.lang.String str2 : map.keySet()) {
                        java.util.List<java.lang.String> list = map.get(str2);
                        this.mInfo.mExtras.putStringArray(str + "/" + str2, list == null ? new java.lang.String[0] : (java.lang.String[]) list.toArray(new java.lang.String[0]));
                    }
                }
            }
            if (this.mSliceUri != null) {
                if (this.mInfo.mExtras == null) {
                    this.mInfo.mExtras = new android.os.PersistableBundle();
                }
                this.mInfo.mExtras.putString(androidx.core.content.pm.ShortcutInfoCompat.EXTRA_SLICE_URI, androidx.core.net.UriCompat.toSafeString(this.mSliceUri));
            }
            return this.mInfo;
        }
    }
}
