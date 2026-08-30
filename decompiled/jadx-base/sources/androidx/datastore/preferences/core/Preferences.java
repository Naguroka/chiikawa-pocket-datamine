package androidx.datastore.preferences.core;

/* JADX INFO: compiled from: Preferences.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001:\u0002\u000f\u0010B\u0007\b\u0000¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u0004\u0012\u00020\u00010\u0004H&J\u001d\u0010\u0006\u001a\u00020\u0007\"\u0004\b\u0000\u0010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\b0\u0005H¦\u0002J$\u0010\n\u001a\u0004\u0018\u0001H\b\"\u0004\b\u0000\u0010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\b0\u0005H¦\u0002¢\u0006\u0002\u0010\u000bJ\u0006\u0010\f\u001a\u00020\rJ\u0006\u0010\u000e\u001a\u00020\u0000¨\u0006\u0011"}, d2 = {"Landroidx/datastore/preferences/core/Preferences;", "", "()V", "asMap", "", "Landroidx/datastore/preferences/core/Preferences$Key;", "contains", "", "T", com.ironsource.y8.h.W, "get", "(Landroidx/datastore/preferences/core/Preferences$Key;)Ljava/lang/Object;", "toMutablePreferences", "Landroidx/datastore/preferences/core/MutablePreferences;", "toPreferences", "Key", "Pair", "datastore-preferences-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class Preferences {
    public abstract java.util.Map<androidx.datastore.preferences.core.Preferences.Key<?>, java.lang.Object> asMap();

    public abstract <T> boolean contains(androidx.datastore.preferences.core.Preferences.Key<T> key);

    public abstract <T> T get(androidx.datastore.preferences.core.Preferences.Key<T> key);

    /* JADX INFO: compiled from: Preferences.kt */
    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u000f\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u000b\u001a\u00020\fH\u0016J\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u000f\u001a\u00028\u0000H\u0086\u0004¢\u0006\u0002\u0010\u0010J\b\u0010\u0011\u001a\u00020\u0004H\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Landroidx/datastore/preferences/core/Preferences$Key;", "T", "", "name", "", "(Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "equals", "", "other", "hashCode", "", androidx.constraintlayout.core.motion.utils.TypedValues.TransitionType.S_TO, "Landroidx/datastore/preferences/core/Preferences$Pair;", "value", "(Ljava/lang/Object;)Landroidx/datastore/preferences/core/Preferences$Pair;", "toString", "datastore-preferences-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Key<T> {
        private final java.lang.String name;

        public Key(java.lang.String name) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
            this.name = name;
        }

        public final java.lang.String getName() {
            return this.name;
        }

        public final androidx.datastore.preferences.core.Preferences.Pair<T> to(T value) {
            return new androidx.datastore.preferences.core.Preferences.Pair<>(this, value);
        }

        public boolean equals(java.lang.Object other) {
            if (other instanceof androidx.datastore.preferences.core.Preferences.Key) {
                return kotlin.jvm.internal.Intrinsics.areEqual(this.name, ((androidx.datastore.preferences.core.Preferences.Key) other).name);
            }
            return false;
        }

        public int hashCode() {
            return this.name.hashCode();
        }

        public java.lang.String toString() {
            return this.name;
        }
    }

    /* JADX INFO: compiled from: Preferences.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u001d\b\u0000\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0002\u0010\u0006R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0005\u001a\u00028\u0000X\u0080\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Landroidx/datastore/preferences/core/Preferences$Pair;", "T", "", com.ironsource.y8.h.W, "Landroidx/datastore/preferences/core/Preferences$Key;", "value", "(Landroidx/datastore/preferences/core/Preferences$Key;Ljava/lang/Object;)V", "getKey$datastore_preferences_core", "()Landroidx/datastore/preferences/core/Preferences$Key;", "getValue$datastore_preferences_core", "()Ljava/lang/Object;", "Ljava/lang/Object;", "datastore-preferences-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Pair<T> {
        private final androidx.datastore.preferences.core.Preferences.Key<T> key;
        private final T value;

        public Pair(androidx.datastore.preferences.core.Preferences.Key<T> key, T t) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
            this.key = key;
            this.value = t;
        }

        public final androidx.datastore.preferences.core.Preferences.Key<T> getKey$datastore_preferences_core() {
            return this.key;
        }

        public final T getValue$datastore_preferences_core() {
            return this.value;
        }
    }

    public final androidx.datastore.preferences.core.MutablePreferences toMutablePreferences() {
        return new androidx.datastore.preferences.core.MutablePreferences(kotlin.collections.MapsKt.toMutableMap(asMap()), false);
    }

    public final androidx.datastore.preferences.core.Preferences toPreferences() {
        return new androidx.datastore.preferences.core.MutablePreferences(kotlin.collections.MapsKt.toMutableMap(asMap()), true);
    }
}
