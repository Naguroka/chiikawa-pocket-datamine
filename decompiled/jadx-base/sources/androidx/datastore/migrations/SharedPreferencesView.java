package androidx.datastore.migrations;

/* JADX INFO: compiled from: SharedPreferencesMigration.android.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0002J\u0011\u0010\n\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u0006H\u0086\u0002J\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\rJ\u0016\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000bJ\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0011J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0013J\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0015J\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\u00062\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0006J(\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\u00062\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005R\u0016\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Landroidx/datastore/migrations/SharedPreferencesView;", "", "prefs", "Landroid/content/SharedPreferences;", "keySet", "", "", "(Landroid/content/SharedPreferences;Ljava/util/Set;)V", "checkKey", com.ironsource.y8.h.W, "contains", "", "getAll", "", "getBoolean", "defValue", "getFloat", "", "getInt", "", "getLong", "", "getString", "getStringSet", "defValues", "datastore_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SharedPreferencesView {
    private final java.util.Set<java.lang.String> keySet;
    private final android.content.SharedPreferences prefs;

    public SharedPreferencesView(android.content.SharedPreferences prefs, java.util.Set<java.lang.String> set) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(prefs, "prefs");
        this.prefs = prefs;
        this.keySet = set;
    }

    public final boolean contains(java.lang.String key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        return this.prefs.contains(checkKey(key));
    }

    public final boolean getBoolean(java.lang.String key, boolean defValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        return this.prefs.getBoolean(checkKey(key), defValue);
    }

    public final float getFloat(java.lang.String key, float defValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        return this.prefs.getFloat(checkKey(key), defValue);
    }

    public final int getInt(java.lang.String key, int defValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        return this.prefs.getInt(checkKey(key), defValue);
    }

    public final long getLong(java.lang.String key, long defValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        return this.prefs.getLong(checkKey(key), defValue);
    }

    public static /* synthetic */ java.lang.String getString$default(androidx.datastore.migrations.SharedPreferencesView sharedPreferencesView, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return sharedPreferencesView.getString(str, str2);
    }

    public final java.lang.String getString(java.lang.String key, java.lang.String defValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        return this.prefs.getString(checkKey(key), defValue);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ java.util.Set getStringSet$default(androidx.datastore.migrations.SharedPreferencesView sharedPreferencesView, java.lang.String str, java.util.Set set, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            set = null;
        }
        return sharedPreferencesView.getStringSet(str, set);
    }

    public final java.util.Set<java.lang.String> getStringSet(java.lang.String key, java.util.Set<java.lang.String> defValues) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        java.util.Set<java.lang.String> stringSet = this.prefs.getStringSet(checkKey(key), defValues);
        if (stringSet != null) {
            return kotlin.collections.CollectionsKt.toMutableSet(stringSet);
        }
        return null;
    }

    public final java.util.Map<java.lang.String, java.lang.Object> getAll() {
        java.util.Map<java.lang.String, ?> all = this.prefs.getAll();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(all, "prefs.all");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.util.Map.Entry<java.lang.String, ?> entry : all.entrySet()) {
            java.lang.String key = entry.getKey();
            java.util.Set<java.lang.String> set = this.keySet;
            if (set != null ? set.contains(key) : true) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap(kotlin.collections.MapsKt.mapCapacity(linkedHashMap.size()));
        for (java.util.Map.Entry entry2 : linkedHashMap.entrySet()) {
            java.lang.Object key2 = entry2.getKey();
            java.lang.Object value = entry2.getValue();
            if (value instanceof java.util.Set) {
                value = kotlin.collections.CollectionsKt.toSet((java.lang.Iterable) value);
            }
            linkedHashMap2.put(key2, value);
        }
        return linkedHashMap2;
    }

    private final java.lang.String checkKey(java.lang.String key) {
        java.util.Set<java.lang.String> set = this.keySet;
        if (set == null || set.contains(key)) {
            return key;
        }
        throw new java.lang.IllegalStateException(("Can't access key outside migration: " + key).toString());
    }
}
