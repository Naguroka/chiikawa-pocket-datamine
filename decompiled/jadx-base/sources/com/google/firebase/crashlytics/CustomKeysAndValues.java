package com.google.firebase.crashlytics;

/* JADX INFO: loaded from: classes5.dex */
public class CustomKeysAndValues {
    final java.util.Map<java.lang.String, java.lang.String> keysAndValues;

    public static class Builder {
        private java.util.Map<java.lang.String, java.lang.String> keysAndValues = new java.util.HashMap();

        public com.google.firebase.crashlytics.CustomKeysAndValues.Builder putString(java.lang.String str, java.lang.String str2) {
            this.keysAndValues.put(str, str2);
            return this;
        }

        public com.google.firebase.crashlytics.CustomKeysAndValues.Builder putBoolean(java.lang.String str, boolean z) {
            this.keysAndValues.put(str, java.lang.Boolean.toString(z));
            return this;
        }

        public com.google.firebase.crashlytics.CustomKeysAndValues.Builder putDouble(java.lang.String str, double d) {
            this.keysAndValues.put(str, java.lang.Double.toString(d));
            return this;
        }

        public com.google.firebase.crashlytics.CustomKeysAndValues.Builder putFloat(java.lang.String str, float f) {
            this.keysAndValues.put(str, java.lang.Float.toString(f));
            return this;
        }

        public com.google.firebase.crashlytics.CustomKeysAndValues.Builder putLong(java.lang.String str, long j) {
            this.keysAndValues.put(str, java.lang.Long.toString(j));
            return this;
        }

        public com.google.firebase.crashlytics.CustomKeysAndValues.Builder putInt(java.lang.String str, int i) {
            this.keysAndValues.put(str, java.lang.Integer.toString(i));
            return this;
        }

        public com.google.firebase.crashlytics.CustomKeysAndValues build() {
            return new com.google.firebase.crashlytics.CustomKeysAndValues(this);
        }
    }

    CustomKeysAndValues(com.google.firebase.crashlytics.CustomKeysAndValues.Builder builder) {
        this.keysAndValues = builder.keysAndValues;
    }
}
