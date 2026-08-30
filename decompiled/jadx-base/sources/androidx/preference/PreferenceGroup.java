package androidx.preference;

/* JADX INFO: loaded from: classes3.dex */
public abstract class PreferenceGroup extends androidx.preference.Preference {
    private static final java.lang.String TAG = "PreferenceGroup";
    private boolean mAttachedToHierarchy;
    private final java.lang.Runnable mClearRecycleCacheRunnable;
    private int mCurrentPreferenceOrder;
    private final android.os.Handler mHandler;
    final androidx.collection.SimpleArrayMap<java.lang.String, java.lang.Long> mIdRecycleCache;
    private int mInitialExpandedChildrenCount;
    private androidx.preference.PreferenceGroup.OnExpandButtonClickListener mOnExpandButtonClickListener;
    private boolean mOrderingAsAdded;
    private final java.util.List<androidx.preference.Preference> mPreferences;

    public interface OnExpandButtonClickListener {
        void onExpandButtonClick();
    }

    public interface PreferencePositionCallback {
        int getPreferenceAdapterPosition(androidx.preference.Preference preference);

        int getPreferenceAdapterPosition(java.lang.String str);
    }

    protected boolean isOnSameScreenAsChildren() {
        return true;
    }

    public PreferenceGroup(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.mIdRecycleCache = new androidx.collection.SimpleArrayMap<>();
        this.mHandler = new android.os.Handler(android.os.Looper.getMainLooper());
        this.mOrderingAsAdded = true;
        this.mCurrentPreferenceOrder = 0;
        this.mAttachedToHierarchy = false;
        this.mInitialExpandedChildrenCount = Integer.MAX_VALUE;
        this.mOnExpandButtonClickListener = null;
        this.mClearRecycleCacheRunnable = new java.lang.Runnable() { // from class: androidx.preference.PreferenceGroup.1
            @Override // java.lang.Runnable
            public void run() {
                synchronized (this) {
                    androidx.preference.PreferenceGroup.this.mIdRecycleCache.clear();
                }
            }
        };
        this.mPreferences = new java.util.ArrayList();
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.preference.R.styleable.PreferenceGroup, i, i2);
        this.mOrderingAsAdded = androidx.core.content.res.TypedArrayUtils.getBoolean(typedArrayObtainStyledAttributes, androidx.preference.R.styleable.PreferenceGroup_orderingFromXml, androidx.preference.R.styleable.PreferenceGroup_orderingFromXml, true);
        if (typedArrayObtainStyledAttributes.hasValue(androidx.preference.R.styleable.PreferenceGroup_initialExpandedChildrenCount)) {
            setInitialExpandedChildrenCount(androidx.core.content.res.TypedArrayUtils.getInt(typedArrayObtainStyledAttributes, androidx.preference.R.styleable.PreferenceGroup_initialExpandedChildrenCount, androidx.preference.R.styleable.PreferenceGroup_initialExpandedChildrenCount, Integer.MAX_VALUE));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public PreferenceGroup(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public PreferenceGroup(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void setOrderingAsAdded(boolean z) {
        this.mOrderingAsAdded = z;
    }

    public boolean isOrderingAsAdded() {
        return this.mOrderingAsAdded;
    }

    public void setInitialExpandedChildrenCount(int i) {
        if (i != Integer.MAX_VALUE && !hasKey()) {
            android.util.Log.e(TAG, getClass().getSimpleName() + " should have a key defined if it contains an expandable preference");
        }
        this.mInitialExpandedChildrenCount = i;
    }

    public int getInitialExpandedChildrenCount() {
        return this.mInitialExpandedChildrenCount;
    }

    public void addItemFromInflater(androidx.preference.Preference preference) {
        addPreference(preference);
    }

    public int getPreferenceCount() {
        return this.mPreferences.size();
    }

    public androidx.preference.Preference getPreference(int i) {
        return this.mPreferences.get(i);
    }

    public boolean addPreference(androidx.preference.Preference preference) {
        long nextId;
        if (this.mPreferences.contains(preference)) {
            return true;
        }
        if (preference.getKey() != null) {
            androidx.preference.PreferenceGroup parent = this;
            while (parent.getParent() != null) {
                parent = parent.getParent();
            }
            java.lang.String key = preference.getKey();
            if (parent.findPreference(key) != null) {
                android.util.Log.e(TAG, "Found duplicated key: \"" + key + "\". This can cause unintended behaviour, please use unique keys for every preference.");
            }
        }
        if (preference.getOrder() == Integer.MAX_VALUE) {
            if (this.mOrderingAsAdded) {
                int i = this.mCurrentPreferenceOrder;
                this.mCurrentPreferenceOrder = i + 1;
                preference.setOrder(i);
            }
            if (preference instanceof androidx.preference.PreferenceGroup) {
                ((androidx.preference.PreferenceGroup) preference).setOrderingAsAdded(this.mOrderingAsAdded);
            }
        }
        int iBinarySearch = java.util.Collections.binarySearch(this.mPreferences, preference);
        if (iBinarySearch < 0) {
            iBinarySearch = (iBinarySearch * (-1)) - 1;
        }
        if (!onPrepareAddPreference(preference)) {
            return false;
        }
        synchronized (this) {
            this.mPreferences.add(iBinarySearch, preference);
        }
        androidx.preference.PreferenceManager preferenceManager = getPreferenceManager();
        java.lang.String key2 = preference.getKey();
        if (key2 != null && this.mIdRecycleCache.containsKey(key2)) {
            nextId = this.mIdRecycleCache.get(key2).longValue();
            this.mIdRecycleCache.remove(key2);
        } else {
            nextId = preferenceManager.getNextId();
        }
        preference.onAttachedToHierarchy(preferenceManager, nextId);
        preference.assignParent(this);
        if (this.mAttachedToHierarchy) {
            preference.onAttached();
        }
        notifyHierarchyChanged();
        return true;
    }

    public boolean removePreference(androidx.preference.Preference preference) {
        boolean zRemovePreferenceInt = removePreferenceInt(preference);
        notifyHierarchyChanged();
        return zRemovePreferenceInt;
    }

    public boolean removePreferenceRecursively(java.lang.CharSequence charSequence) {
        androidx.preference.Preference preferenceFindPreference = findPreference(charSequence);
        if (preferenceFindPreference == null) {
            return false;
        }
        return preferenceFindPreference.getParent().removePreference(preferenceFindPreference);
    }

    private boolean removePreferenceInt(androidx.preference.Preference preference) {
        boolean zRemove;
        synchronized (this) {
            preference.onPrepareForRemoval();
            if (preference.getParent() == this) {
                preference.assignParent(null);
            }
            zRemove = this.mPreferences.remove(preference);
            if (zRemove) {
                java.lang.String key = preference.getKey();
                if (key != null) {
                    this.mIdRecycleCache.put(key, java.lang.Long.valueOf(preference.getId()));
                    this.mHandler.removeCallbacks(this.mClearRecycleCacheRunnable);
                    this.mHandler.post(this.mClearRecycleCacheRunnable);
                }
                if (this.mAttachedToHierarchy) {
                    preference.onDetached();
                }
            }
        }
        return zRemove;
    }

    public void removeAll() {
        synchronized (this) {
            java.util.List<androidx.preference.Preference> list = this.mPreferences;
            for (int size = list.size() - 1; size >= 0; size--) {
                removePreferenceInt(list.get(0));
            }
        }
        notifyHierarchyChanged();
    }

    protected boolean onPrepareAddPreference(androidx.preference.Preference preference) {
        preference.onParentChanged(this, shouldDisableDependents());
        return true;
    }

    public <T extends androidx.preference.Preference> T findPreference(java.lang.CharSequence charSequence) {
        T t;
        if (charSequence == null) {
            throw new java.lang.IllegalArgumentException("Key cannot be null");
        }
        if (android.text.TextUtils.equals(getKey(), charSequence)) {
            return this;
        }
        int preferenceCount = getPreferenceCount();
        for (int i = 0; i < preferenceCount; i++) {
            androidx.preference.PreferenceGroup preferenceGroup = (T) getPreference(i);
            if (android.text.TextUtils.equals(preferenceGroup.getKey(), charSequence)) {
                return preferenceGroup;
            }
            if ((preferenceGroup instanceof androidx.preference.PreferenceGroup) && (t = (T) preferenceGroup.findPreference(charSequence)) != null) {
                return t;
            }
        }
        return null;
    }

    public boolean isAttached() {
        return this.mAttachedToHierarchy;
    }

    public void setOnExpandButtonClickListener(androidx.preference.PreferenceGroup.OnExpandButtonClickListener onExpandButtonClickListener) {
        this.mOnExpandButtonClickListener = onExpandButtonClickListener;
    }

    public androidx.preference.PreferenceGroup.OnExpandButtonClickListener getOnExpandButtonClickListener() {
        return this.mOnExpandButtonClickListener;
    }

    @Override // androidx.preference.Preference
    public void onAttached() {
        super.onAttached();
        this.mAttachedToHierarchy = true;
        int preferenceCount = getPreferenceCount();
        for (int i = 0; i < preferenceCount; i++) {
            getPreference(i).onAttached();
        }
    }

    @Override // androidx.preference.Preference
    public void onDetached() {
        super.onDetached();
        this.mAttachedToHierarchy = false;
        int preferenceCount = getPreferenceCount();
        for (int i = 0; i < preferenceCount; i++) {
            getPreference(i).onDetached();
        }
    }

    @Override // androidx.preference.Preference
    public void notifyDependencyChange(boolean z) {
        super.notifyDependencyChange(z);
        int preferenceCount = getPreferenceCount();
        for (int i = 0; i < preferenceCount; i++) {
            getPreference(i).onParentChanged(this, z);
        }
    }

    void sortPreferences() {
        synchronized (this) {
            java.util.Collections.sort(this.mPreferences);
        }
    }

    @Override // androidx.preference.Preference
    protected void dispatchSaveInstanceState(android.os.Bundle bundle) {
        super.dispatchSaveInstanceState(bundle);
        int preferenceCount = getPreferenceCount();
        for (int i = 0; i < preferenceCount; i++) {
            getPreference(i).dispatchSaveInstanceState(bundle);
        }
    }

    @Override // androidx.preference.Preference
    protected void dispatchRestoreInstanceState(android.os.Bundle bundle) {
        super.dispatchRestoreInstanceState(bundle);
        int preferenceCount = getPreferenceCount();
        for (int i = 0; i < preferenceCount; i++) {
            getPreference(i).dispatchRestoreInstanceState(bundle);
        }
    }

    @Override // androidx.preference.Preference
    protected android.os.Parcelable onSaveInstanceState() {
        return new androidx.preference.PreferenceGroup.SavedState(super.onSaveInstanceState(), this.mInitialExpandedChildrenCount);
    }

    @Override // androidx.preference.Preference
    protected void onRestoreInstanceState(android.os.Parcelable parcelable) {
        if (parcelable == null || !parcelable.getClass().equals(androidx.preference.PreferenceGroup.SavedState.class)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        androidx.preference.PreferenceGroup.SavedState savedState = (androidx.preference.PreferenceGroup.SavedState) parcelable;
        this.mInitialExpandedChildrenCount = savedState.mInitialExpandedChildrenCount;
        super.onRestoreInstanceState(savedState.getSuperState());
    }

    static class SavedState extends androidx.preference.Preference.BaseSavedState {
        public static final android.os.Parcelable.Creator<androidx.preference.PreferenceGroup.SavedState> CREATOR = new android.os.Parcelable.Creator<androidx.preference.PreferenceGroup.SavedState>() { // from class: androidx.preference.PreferenceGroup.SavedState.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public androidx.preference.PreferenceGroup.SavedState createFromParcel(android.os.Parcel parcel) {
                return new androidx.preference.PreferenceGroup.SavedState(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public androidx.preference.PreferenceGroup.SavedState[] newArray(int i) {
                return new androidx.preference.PreferenceGroup.SavedState[i];
            }
        };
        int mInitialExpandedChildrenCount;

        SavedState(android.os.Parcel parcel) {
            super(parcel);
            this.mInitialExpandedChildrenCount = parcel.readInt();
        }

        SavedState(android.os.Parcelable parcelable, int i) {
            super(parcelable);
            this.mInitialExpandedChildrenCount = i;
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.mInitialExpandedChildrenCount);
        }
    }
}
