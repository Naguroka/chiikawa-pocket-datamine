package androidx.datastore.preferences.core;

/* JADX INFO: compiled from: PreferencesKeys.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u0002\u001a\u001b\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0007¢\u0006\u0002\b\u0005\u001a\u001b\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0007¢\u0006\u0002\b\b\u001a\u001b\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0007¢\u0006\u0002\b\u000b\u001a\u001b\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0007¢\u0006\u0002\b\u000e\u001a\u001b\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0007¢\u0006\u0002\b\u0011\u001a\u001b\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0007¢\u0006\u0002\b\u0014\u001a\u001b\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0007¢\u0006\u0002\b\u0016\u001a!\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00180\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0007¢\u0006\u0002\b\u0019¨\u0006\u001a"}, d2 = {"booleanPreferencesKey", "Landroidx/datastore/preferences/core/Preferences$Key;", "", "name", "", "booleanKey", "byteArrayPreferencesKey", "", "byteArrayKey", "doublePreferencesKey", "", "doubleKey", "floatPreferencesKey", "", "floatKey", "intPreferencesKey", "", "intKey", "longPreferencesKey", "", "longKey", "stringPreferencesKey", "stringKey", "stringSetPreferencesKey", "", "stringSetKey", "datastore-preferences-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class PreferencesKeys {
    public static final androidx.datastore.preferences.core.Preferences.Key<java.lang.Integer> intKey(java.lang.String name) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        return new androidx.datastore.preferences.core.Preferences.Key<>(name);
    }

    public static final androidx.datastore.preferences.core.Preferences.Key<java.lang.Double> doubleKey(java.lang.String name) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        return new androidx.datastore.preferences.core.Preferences.Key<>(name);
    }

    public static final androidx.datastore.preferences.core.Preferences.Key<java.lang.String> stringKey(java.lang.String name) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        return new androidx.datastore.preferences.core.Preferences.Key<>(name);
    }

    public static final androidx.datastore.preferences.core.Preferences.Key<java.lang.Boolean> booleanKey(java.lang.String name) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        return new androidx.datastore.preferences.core.Preferences.Key<>(name);
    }

    public static final androidx.datastore.preferences.core.Preferences.Key<java.lang.Float> floatKey(java.lang.String name) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        return new androidx.datastore.preferences.core.Preferences.Key<>(name);
    }

    public static final androidx.datastore.preferences.core.Preferences.Key<java.lang.Long> longKey(java.lang.String name) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        return new androidx.datastore.preferences.core.Preferences.Key<>(name);
    }

    public static final androidx.datastore.preferences.core.Preferences.Key<java.util.Set<java.lang.String>> stringSetKey(java.lang.String name) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        return new androidx.datastore.preferences.core.Preferences.Key<>(name);
    }

    public static final androidx.datastore.preferences.core.Preferences.Key<byte[]> byteArrayKey(java.lang.String name) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        return new androidx.datastore.preferences.core.Preferences.Key<>(name);
    }
}
