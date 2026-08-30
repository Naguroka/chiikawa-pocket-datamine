package androidx.datastore.preferences.core;

/* JADX INFO: compiled from: PreferencesFactory.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\r\u0010\u0000\u001a\u00020\u0001H\u0007¢\u0006\u0002\b\u0002\u001a+\u0010\u0003\u001a\u00020\u00042\u001a\u0010\u0005\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00070\u0006\"\u0006\u0012\u0002\b\u00030\u0007H\u0007¢\u0006\u0004\b\b\u0010\t\u001a+\u0010\n\u001a\u00020\u00012\u001a\u0010\u0005\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00070\u0006\"\u0006\u0012\u0002\b\u00030\u0007H\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"emptyPreferences", "Landroidx/datastore/preferences/core/Preferences;", "createEmpty", "mutablePreferencesOf", "Landroidx/datastore/preferences/core/MutablePreferences;", "pairs", "", "Landroidx/datastore/preferences/core/Preferences$Pair;", "createMutable", "([Landroidx/datastore/preferences/core/Preferences$Pair;)Landroidx/datastore/preferences/core/MutablePreferences;", "preferencesOf", "create", "([Landroidx/datastore/preferences/core/Preferences$Pair;)Landroidx/datastore/preferences/core/Preferences;", "datastore-preferences-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class PreferencesFactory {
    public static final androidx.datastore.preferences.core.Preferences createEmpty() {
        return new androidx.datastore.preferences.core.MutablePreferences(null, true, 1, null);
    }

    public static final androidx.datastore.preferences.core.Preferences create(androidx.datastore.preferences.core.Preferences.Pair<?>... pairs) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pairs, "pairs");
        return createMutable((androidx.datastore.preferences.core.Preferences.Pair[]) java.util.Arrays.copyOf(pairs, pairs.length));
    }

    public static final androidx.datastore.preferences.core.MutablePreferences createMutable(androidx.datastore.preferences.core.Preferences.Pair<?>... pairs) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pairs, "pairs");
        androidx.datastore.preferences.core.MutablePreferences mutablePreferences = new androidx.datastore.preferences.core.MutablePreferences(null, false, 1, null);
        mutablePreferences.putAll((androidx.datastore.preferences.core.Preferences.Pair[]) java.util.Arrays.copyOf(pairs, pairs.length));
        return mutablePreferences;
    }
}
