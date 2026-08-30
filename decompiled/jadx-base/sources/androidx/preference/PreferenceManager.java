package androidx.preference;

/* JADX INFO: loaded from: classes3.dex */
public class PreferenceManager {
    public static final java.lang.String KEY_HAS_SET_DEFAULT_VALUES = "_has_set_default_values";
    private static final int STORAGE_DEFAULT = 0;
    private static final int STORAGE_DEVICE_PROTECTED = 1;
    private final android.content.Context mContext;
    private android.content.SharedPreferences.Editor mEditor;
    private boolean mNoCommit;
    private androidx.preference.PreferenceManager.OnDisplayPreferenceDialogListener mOnDisplayPreferenceDialogListener;
    private androidx.preference.PreferenceManager.OnNavigateToScreenListener mOnNavigateToScreenListener;
    private androidx.preference.PreferenceManager.OnPreferenceTreeClickListener mOnPreferenceTreeClickListener;
    private androidx.preference.PreferenceManager.PreferenceComparisonCallback mPreferenceComparisonCallback;
    private androidx.preference.PreferenceDataStore mPreferenceDataStore;
    private androidx.preference.PreferenceScreen mPreferenceScreen;
    private android.content.SharedPreferences mSharedPreferences;
    private int mSharedPreferencesMode;
    private java.lang.String mSharedPreferencesName;
    private long mNextId = 0;
    private int mStorage = 0;

    public interface OnDisplayPreferenceDialogListener {
        void onDisplayPreferenceDialog(androidx.preference.Preference preference);
    }

    public interface OnNavigateToScreenListener {
        void onNavigateToScreen(androidx.preference.PreferenceScreen preferenceScreen);
    }

    public interface OnPreferenceTreeClickListener {
        boolean onPreferenceTreeClick(androidx.preference.Preference preference);
    }

    public static abstract class PreferenceComparisonCallback {
        public abstract boolean arePreferenceContentsTheSame(androidx.preference.Preference preference, androidx.preference.Preference preference2);

        public abstract boolean arePreferenceItemsTheSame(androidx.preference.Preference preference, androidx.preference.Preference preference2);
    }

    private static int getDefaultSharedPreferencesMode() {
        return 0;
    }

    public PreferenceManager(android.content.Context context) {
        this.mContext = context;
        setSharedPreferencesName(getDefaultSharedPreferencesName(context));
    }

    public static android.content.SharedPreferences getDefaultSharedPreferences(android.content.Context context) {
        return context.getSharedPreferences(getDefaultSharedPreferencesName(context), getDefaultSharedPreferencesMode());
    }

    private static java.lang.String getDefaultSharedPreferencesName(android.content.Context context) {
        return context.getPackageName() + "_preferences";
    }

    public static void setDefaultValues(android.content.Context context, int i, boolean z) {
        setDefaultValues(context, getDefaultSharedPreferencesName(context), getDefaultSharedPreferencesMode(), i, z);
    }

    public static void setDefaultValues(android.content.Context context, java.lang.String str, int i, int i2, boolean z) {
        android.content.SharedPreferences sharedPreferences = context.getSharedPreferences(KEY_HAS_SET_DEFAULT_VALUES, 0);
        if (z || !sharedPreferences.getBoolean(KEY_HAS_SET_DEFAULT_VALUES, false)) {
            androidx.preference.PreferenceManager preferenceManager = new androidx.preference.PreferenceManager(context);
            preferenceManager.setSharedPreferencesName(str);
            preferenceManager.setSharedPreferencesMode(i);
            preferenceManager.inflateFromResource(context, i2, null);
            sharedPreferences.edit().putBoolean(KEY_HAS_SET_DEFAULT_VALUES, true).apply();
        }
    }

    public androidx.preference.PreferenceScreen inflateFromResource(android.content.Context context, int i, androidx.preference.PreferenceScreen preferenceScreen) {
        setNoCommit(true);
        androidx.preference.PreferenceScreen preferenceScreen2 = (androidx.preference.PreferenceScreen) new androidx.preference.PreferenceInflater(context, this).inflate(i, preferenceScreen);
        preferenceScreen2.onAttachedToHierarchy(this);
        setNoCommit(false);
        return preferenceScreen2;
    }

    public androidx.preference.PreferenceScreen createPreferenceScreen(android.content.Context context) {
        androidx.preference.PreferenceScreen preferenceScreen = new androidx.preference.PreferenceScreen(context, null);
        preferenceScreen.onAttachedToHierarchy(this);
        return preferenceScreen;
    }

    long getNextId() {
        long j;
        synchronized (this) {
            j = this.mNextId;
            this.mNextId = 1 + j;
        }
        return j;
    }

    public java.lang.String getSharedPreferencesName() {
        return this.mSharedPreferencesName;
    }

    public void setSharedPreferencesName(java.lang.String str) {
        this.mSharedPreferencesName = str;
        this.mSharedPreferences = null;
    }

    public int getSharedPreferencesMode() {
        return this.mSharedPreferencesMode;
    }

    public void setSharedPreferencesMode(int i) {
        this.mSharedPreferencesMode = i;
        this.mSharedPreferences = null;
    }

    public void setStorageDefault() {
        this.mStorage = 0;
        this.mSharedPreferences = null;
    }

    public void setStorageDeviceProtected() {
        this.mStorage = 1;
        this.mSharedPreferences = null;
    }

    public boolean isStorageDefault() {
        return this.mStorage == 0;
    }

    public boolean isStorageDeviceProtected() {
        return this.mStorage == 1;
    }

    public void setPreferenceDataStore(androidx.preference.PreferenceDataStore preferenceDataStore) {
        this.mPreferenceDataStore = preferenceDataStore;
    }

    public androidx.preference.PreferenceDataStore getPreferenceDataStore() {
        return this.mPreferenceDataStore;
    }

    public android.content.SharedPreferences getSharedPreferences() {
        android.content.Context contextCreateDeviceProtectedStorageContext;
        if (getPreferenceDataStore() != null) {
            return null;
        }
        if (this.mSharedPreferences == null) {
            if (this.mStorage == 1) {
                contextCreateDeviceProtectedStorageContext = androidx.core.content.ContextCompat.createDeviceProtectedStorageContext(this.mContext);
            } else {
                contextCreateDeviceProtectedStorageContext = this.mContext;
            }
            this.mSharedPreferences = contextCreateDeviceProtectedStorageContext.getSharedPreferences(this.mSharedPreferencesName, this.mSharedPreferencesMode);
        }
        return this.mSharedPreferences;
    }

    public androidx.preference.PreferenceScreen getPreferenceScreen() {
        return this.mPreferenceScreen;
    }

    public boolean setPreferences(androidx.preference.PreferenceScreen preferenceScreen) {
        androidx.preference.PreferenceScreen preferenceScreen2 = this.mPreferenceScreen;
        if (preferenceScreen == preferenceScreen2) {
            return false;
        }
        if (preferenceScreen2 != null) {
            preferenceScreen2.onDetached();
        }
        this.mPreferenceScreen = preferenceScreen;
        return true;
    }

    public <T extends androidx.preference.Preference> T findPreference(java.lang.CharSequence charSequence) {
        androidx.preference.PreferenceScreen preferenceScreen = this.mPreferenceScreen;
        if (preferenceScreen == null) {
            return null;
        }
        return (T) preferenceScreen.findPreference(charSequence);
    }

    android.content.SharedPreferences.Editor getEditor() {
        if (this.mPreferenceDataStore != null) {
            return null;
        }
        if (this.mNoCommit) {
            if (this.mEditor == null) {
                this.mEditor = getSharedPreferences().edit();
            }
            return this.mEditor;
        }
        return getSharedPreferences().edit();
    }

    boolean shouldCommit() {
        return !this.mNoCommit;
    }

    private void setNoCommit(boolean z) {
        android.content.SharedPreferences.Editor editor;
        if (!z && (editor = this.mEditor) != null) {
            editor.apply();
        }
        this.mNoCommit = z;
    }

    public android.content.Context getContext() {
        return this.mContext;
    }

    public androidx.preference.PreferenceManager.PreferenceComparisonCallback getPreferenceComparisonCallback() {
        return this.mPreferenceComparisonCallback;
    }

    public void setPreferenceComparisonCallback(androidx.preference.PreferenceManager.PreferenceComparisonCallback preferenceComparisonCallback) {
        this.mPreferenceComparisonCallback = preferenceComparisonCallback;
    }

    public androidx.preference.PreferenceManager.OnDisplayPreferenceDialogListener getOnDisplayPreferenceDialogListener() {
        return this.mOnDisplayPreferenceDialogListener;
    }

    public void setOnDisplayPreferenceDialogListener(androidx.preference.PreferenceManager.OnDisplayPreferenceDialogListener onDisplayPreferenceDialogListener) {
        this.mOnDisplayPreferenceDialogListener = onDisplayPreferenceDialogListener;
    }

    public void showDialog(androidx.preference.Preference preference) {
        androidx.preference.PreferenceManager.OnDisplayPreferenceDialogListener onDisplayPreferenceDialogListener = this.mOnDisplayPreferenceDialogListener;
        if (onDisplayPreferenceDialogListener != null) {
            onDisplayPreferenceDialogListener.onDisplayPreferenceDialog(preference);
        }
    }

    public void setOnPreferenceTreeClickListener(androidx.preference.PreferenceManager.OnPreferenceTreeClickListener onPreferenceTreeClickListener) {
        this.mOnPreferenceTreeClickListener = onPreferenceTreeClickListener;
    }

    public androidx.preference.PreferenceManager.OnPreferenceTreeClickListener getOnPreferenceTreeClickListener() {
        return this.mOnPreferenceTreeClickListener;
    }

    public void setOnNavigateToScreenListener(androidx.preference.PreferenceManager.OnNavigateToScreenListener onNavigateToScreenListener) {
        this.mOnNavigateToScreenListener = onNavigateToScreenListener;
    }

    public androidx.preference.PreferenceManager.OnNavigateToScreenListener getOnNavigateToScreenListener() {
        return this.mOnNavigateToScreenListener;
    }

    public static class SimplePreferenceComparisonCallback extends androidx.preference.PreferenceManager.PreferenceComparisonCallback {
        @Override // androidx.preference.PreferenceManager.PreferenceComparisonCallback
        public boolean arePreferenceItemsTheSame(androidx.preference.Preference preference, androidx.preference.Preference preference2) {
            return preference.getId() == preference2.getId();
        }

        @Override // androidx.preference.PreferenceManager.PreferenceComparisonCallback
        public boolean arePreferenceContentsTheSame(androidx.preference.Preference preference, androidx.preference.Preference preference2) {
            if (preference.getClass() != preference2.getClass()) {
                return false;
            }
            if ((preference == preference2 && preference.wasDetached()) || !android.text.TextUtils.equals(preference.getTitle(), preference2.getTitle()) || !android.text.TextUtils.equals(preference.getSummary(), preference2.getSummary())) {
                return false;
            }
            android.graphics.drawable.Drawable icon = preference.getIcon();
            android.graphics.drawable.Drawable icon2 = preference2.getIcon();
            if ((icon != icon2 && (icon == null || !icon.equals(icon2))) || preference.isEnabled() != preference2.isEnabled() || preference.isSelectable() != preference2.isSelectable()) {
                return false;
            }
            if (!(preference instanceof androidx.preference.TwoStatePreference) || ((androidx.preference.TwoStatePreference) preference).isChecked() == ((androidx.preference.TwoStatePreference) preference2).isChecked()) {
                return !(preference instanceof androidx.preference.DropDownPreference) || preference == preference2;
            }
            return false;
        }
    }
}
