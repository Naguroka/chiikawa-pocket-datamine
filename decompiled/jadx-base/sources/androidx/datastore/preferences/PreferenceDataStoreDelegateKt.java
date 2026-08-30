package androidx.datastore.preferences;

/* JADX INFO: compiled from: PreferenceDataStoreDelegate.android.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a^\u0010\u0000\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\b2 \b\u0002\u0010\t\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\f0\u000b0\n2\b\b\u0002\u0010\r\u001a\u00020\u000e¨\u0006\u000f"}, d2 = {"preferencesDataStore", "Lkotlin/properties/ReadOnlyProperty;", "Landroid/content/Context;", "Landroidx/datastore/core/DataStore;", "Landroidx/datastore/preferences/core/Preferences;", "name", "", "corruptionHandler", "Landroidx/datastore/core/handlers/ReplaceFileCorruptionHandler;", "produceMigrations", "Lkotlin/Function1;", "", "Landroidx/datastore/core/DataMigration;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "datastore-preferences_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class PreferenceDataStoreDelegateKt {
    public static /* synthetic */ kotlin.properties.ReadOnlyProperty preferencesDataStore$default(java.lang.String str, androidx.datastore.core.handlers.ReplaceFileCorruptionHandler replaceFileCorruptionHandler, kotlin.jvm.functions.Function1 function1, kotlinx.coroutines.CoroutineScope coroutineScope, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            replaceFileCorruptionHandler = null;
        }
        if ((i & 4) != 0) {
            function1 = new kotlin.jvm.functions.Function1<android.content.Context, java.util.List<? extends androidx.datastore.core.DataMigration<androidx.datastore.preferences.core.Preferences>>>() { // from class: androidx.datastore.preferences.PreferenceDataStoreDelegateKt.preferencesDataStore.1
                @Override // kotlin.jvm.functions.Function1
                public final java.util.List<androidx.datastore.core.DataMigration<androidx.datastore.preferences.core.Preferences>> invoke(android.content.Context it) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                    return kotlin.collections.CollectionsKt.emptyList();
                }
            };
        }
        if ((i & 8) != 0) {
            coroutineScope = kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(kotlinx.coroutines.Dispatchers.getIO().plus(kotlinx.coroutines.SupervisorKt.SupervisorJob$default((kotlinx.coroutines.Job) null, 1, (java.lang.Object) null)));
        }
        return preferencesDataStore(str, replaceFileCorruptionHandler, function1, coroutineScope);
    }

    public static final kotlin.properties.ReadOnlyProperty<android.content.Context, androidx.datastore.core.DataStore<androidx.datastore.preferences.core.Preferences>> preferencesDataStore(java.lang.String name, androidx.datastore.core.handlers.ReplaceFileCorruptionHandler<androidx.datastore.preferences.core.Preferences> replaceFileCorruptionHandler, kotlin.jvm.functions.Function1<? super android.content.Context, ? extends java.util.List<? extends androidx.datastore.core.DataMigration<androidx.datastore.preferences.core.Preferences>>> produceMigrations, kotlinx.coroutines.CoroutineScope scope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(produceMigrations, "produceMigrations");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "scope");
        return new androidx.datastore.preferences.PreferenceDataStoreSingletonDelegate(name, replaceFileCorruptionHandler, produceMigrations, scope);
    }
}
