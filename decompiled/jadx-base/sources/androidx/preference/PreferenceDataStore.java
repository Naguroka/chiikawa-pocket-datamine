package androidx.preference;

/* JADX INFO: loaded from: classes3.dex */
public abstract class PreferenceDataStore {
    public boolean getBoolean(java.lang.String str, boolean z) {
        return z;
    }

    public float getFloat(java.lang.String str, float f) {
        return f;
    }

    public int getInt(java.lang.String str, int i) {
        return i;
    }

    public long getLong(java.lang.String str, long j) {
        return j;
    }

    public java.lang.String getString(java.lang.String str, java.lang.String str2) {
        return str2;
    }

    public java.util.Set<java.lang.String> getStringSet(java.lang.String str, java.util.Set<java.lang.String> set) {
        return set;
    }

    public void putString(java.lang.String str, java.lang.String str2) {
        throw new java.lang.UnsupportedOperationException("Not implemented on this data store");
    }

    public void putStringSet(java.lang.String str, java.util.Set<java.lang.String> set) {
        throw new java.lang.UnsupportedOperationException("Not implemented on this data store");
    }

    public void putInt(java.lang.String str, int i) {
        throw new java.lang.UnsupportedOperationException("Not implemented on this data store");
    }

    public void putLong(java.lang.String str, long j) {
        throw new java.lang.UnsupportedOperationException("Not implemented on this data store");
    }

    public void putFloat(java.lang.String str, float f) {
        throw new java.lang.UnsupportedOperationException("Not implemented on this data store");
    }

    public void putBoolean(java.lang.String str, boolean z) {
        throw new java.lang.UnsupportedOperationException("Not implemented on this data store");
    }
}
