package androidx.datastore;

/* JADX INFO: compiled from: DataStoreDelegate.android.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001ar\u0010\u0000\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u00030\u0001\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00040\b2\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u0002H\u0004\u0018\u00010\n2 \b\u0002\u0010\u000b\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u000e0\r0\f2\b\b\u0002\u0010\u000f\u001a\u00020\u0010¨\u0006\u0011"}, d2 = {"dataStore", "Lkotlin/properties/ReadOnlyProperty;", "Landroid/content/Context;", "Landroidx/datastore/core/DataStore;", "T", com.ironsource.rc.c.b, "", "serializer", "Landroidx/datastore/core/Serializer;", "corruptionHandler", "Landroidx/datastore/core/handlers/ReplaceFileCorruptionHandler;", "produceMigrations", "Lkotlin/Function1;", "", "Landroidx/datastore/core/DataMigration;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "datastore_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class DataStoreDelegateKt {
    public static /* synthetic */ kotlin.properties.ReadOnlyProperty dataStore$default(java.lang.String str, androidx.datastore.core.Serializer serializer, androidx.datastore.core.handlers.ReplaceFileCorruptionHandler replaceFileCorruptionHandler, kotlin.jvm.functions.Function1 function1, kotlinx.coroutines.CoroutineScope coroutineScope, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            replaceFileCorruptionHandler = null;
        }
        if ((i & 8) != 0) {
            function1 = new kotlin.jvm.functions.Function1<android.content.Context, java.util.List<? extends androidx.datastore.core.DataMigration<T>>>() { // from class: androidx.datastore.DataStoreDelegateKt.dataStore.1
                @Override // kotlin.jvm.functions.Function1
                public final java.util.List<androidx.datastore.core.DataMigration<T>> invoke(android.content.Context it) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                    return kotlin.collections.CollectionsKt.emptyList();
                }
            };
        }
        if ((i & 16) != 0) {
            coroutineScope = kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(kotlinx.coroutines.Dispatchers.getIO().plus(kotlinx.coroutines.SupervisorKt.SupervisorJob$default((kotlinx.coroutines.Job) null, 1, (java.lang.Object) null)));
        }
        return dataStore(str, serializer, replaceFileCorruptionHandler, function1, coroutineScope);
    }

    public static final <T> kotlin.properties.ReadOnlyProperty<android.content.Context, androidx.datastore.core.DataStore<T>> dataStore(java.lang.String fileName, androidx.datastore.core.Serializer<T> serializer, androidx.datastore.core.handlers.ReplaceFileCorruptionHandler<T> replaceFileCorruptionHandler, kotlin.jvm.functions.Function1<? super android.content.Context, ? extends java.util.List<? extends androidx.datastore.core.DataMigration<T>>> produceMigrations, kotlinx.coroutines.CoroutineScope scope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileName, "fileName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serializer, "serializer");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(produceMigrations, "produceMigrations");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "scope");
        return new androidx.datastore.DataStoreSingletonDelegate(fileName, new androidx.datastore.OkioSerializerWrapper(serializer), replaceFileCorruptionHandler, produceMigrations, scope);
    }
}
