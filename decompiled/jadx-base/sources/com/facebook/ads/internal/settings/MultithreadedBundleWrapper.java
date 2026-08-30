package com.facebook.ads.internal.settings;

/* JADX INFO: loaded from: classes4.dex */
public class MultithreadedBundleWrapper {
    private final android.os.Bundle mBundle = new android.os.Bundle();

    public synchronized void putBoolean(java.lang.String str, boolean z) {
        this.mBundle.putBoolean(str, z);
    }

    public synchronized boolean getBoolean(java.lang.String str) {
        return this.mBundle.getBoolean(str);
    }

    public synchronized boolean getBoolean(java.lang.String str, boolean z) {
        return this.mBundle.getBoolean(str, z);
    }

    public synchronized java.util.ArrayList<java.lang.String> getStringArrayList(java.lang.String str) {
        return this.mBundle.getStringArrayList(str);
    }

    public synchronized void putStringArrayList(java.lang.String str, java.util.ArrayList<java.lang.String> arrayList) {
        this.mBundle.putStringArrayList(str, arrayList);
    }

    public synchronized java.lang.String getString(java.lang.String str, java.lang.String str2) {
        return this.mBundle.getString(str, str2);
    }

    public synchronized void putString(java.lang.String str, java.lang.String str2) {
        this.mBundle.putString(str, str2);
    }

    public synchronized void putSerializable(java.lang.String str, java.io.Serializable serializable) {
        this.mBundle.putSerializable(str, serializable);
    }

    public synchronized void putStringArray(java.lang.String str, java.lang.String[] strArr) {
        this.mBundle.putStringArray(str, strArr);
    }

    public synchronized java.lang.String[] getStringArray(java.lang.String str) {
        return this.mBundle.getStringArray(str);
    }

    public synchronized void putInteger(java.lang.String str, java.lang.Integer num) {
        try {
            if (num != null) {
                this.mBundle.putInt(str, num.intValue());
            } else {
                this.mBundle.remove(str);
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    public synchronized java.lang.Integer getInteger(java.lang.String str) {
        return this.mBundle.containsKey(str) ? java.lang.Integer.valueOf(this.mBundle.getInt(str)) : null;
    }

    public synchronized java.io.Serializable getSerializable(java.lang.String str) {
        return this.mBundle.getSerializable(str);
    }

    public android.os.Bundle toBundle() {
        return new android.os.Bundle(this.mBundle);
    }

    public synchronized void reset(android.os.Bundle bundle) {
        this.mBundle.clear();
        this.mBundle.putAll(bundle);
    }
}
