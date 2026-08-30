package androidx.datastore.core;

/* JADX INFO: compiled from: MultiProcessDataStoreFactory.android.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002Jb\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00050\u00072\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u0002H\u0005\u0018\u00010\t2\u0014\b\u0002\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00050\f0\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0007JT\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u00052\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00050\u00132\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u0002H\u0005\u0018\u00010\t2\u0014\b\u0002\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00050\f0\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0007¨\u0006\u0014"}, d2 = {"Landroidx/datastore/core/MultiProcessDataStoreFactory;", "", "()V", "create", "Landroidx/datastore/core/DataStore;", "T", "serializer", "Landroidx/datastore/core/Serializer;", "corruptionHandler", "Landroidx/datastore/core/handlers/ReplaceFileCorruptionHandler;", "migrations", "", "Landroidx/datastore/core/DataMigration;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "produceFile", "Lkotlin/Function0;", "Ljava/io/File;", com.ironsource.y8.a.k, "Landroidx/datastore/core/Storage;", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class MultiProcessDataStoreFactory {
    public static final androidx.datastore.core.MultiProcessDataStoreFactory INSTANCE = new androidx.datastore.core.MultiProcessDataStoreFactory();

    public final <T> androidx.datastore.core.DataStore<T> create(androidx.datastore.core.Serializer<T> serializer, androidx.datastore.core.handlers.ReplaceFileCorruptionHandler<T> replaceFileCorruptionHandler, java.util.List<? extends androidx.datastore.core.DataMigration<T>> migrations, kotlin.jvm.functions.Function0<? extends java.io.File> produceFile) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serializer, "serializer");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(migrations, "migrations");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(produceFile, "produceFile");
        return create$default(this, serializer, replaceFileCorruptionHandler, migrations, null, produceFile, 8, null);
    }

    public final <T> androidx.datastore.core.DataStore<T> create(androidx.datastore.core.Serializer<T> serializer, androidx.datastore.core.handlers.ReplaceFileCorruptionHandler<T> replaceFileCorruptionHandler, kotlin.jvm.functions.Function0<? extends java.io.File> produceFile) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serializer, "serializer");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(produceFile, "produceFile");
        return create$default(this, serializer, replaceFileCorruptionHandler, null, null, produceFile, 12, null);
    }

    public final <T> androidx.datastore.core.DataStore<T> create(androidx.datastore.core.Serializer<T> serializer, kotlin.jvm.functions.Function0<? extends java.io.File> produceFile) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serializer, "serializer");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(produceFile, "produceFile");
        return create$default(this, serializer, null, null, null, produceFile, 14, null);
    }

    public final <T> androidx.datastore.core.DataStore<T> create(androidx.datastore.core.Storage<T> storage) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(storage, "storage");
        return create$default(this, storage, null, null, null, 14, null);
    }

    public final <T> androidx.datastore.core.DataStore<T> create(androidx.datastore.core.Storage<T> storage, androidx.datastore.core.handlers.ReplaceFileCorruptionHandler<T> replaceFileCorruptionHandler) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(storage, "storage");
        return create$default(this, storage, replaceFileCorruptionHandler, null, null, 12, null);
    }

    public final <T> androidx.datastore.core.DataStore<T> create(androidx.datastore.core.Storage<T> storage, androidx.datastore.core.handlers.ReplaceFileCorruptionHandler<T> replaceFileCorruptionHandler, java.util.List<? extends androidx.datastore.core.DataMigration<T>> migrations) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(storage, "storage");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(migrations, "migrations");
        return create$default(this, storage, replaceFileCorruptionHandler, migrations, null, 8, null);
    }

    private MultiProcessDataStoreFactory() {
    }

    public static /* synthetic */ androidx.datastore.core.DataStore create$default(androidx.datastore.core.MultiProcessDataStoreFactory multiProcessDataStoreFactory, androidx.datastore.core.Storage storage, androidx.datastore.core.handlers.ReplaceFileCorruptionHandler replaceFileCorruptionHandler, java.util.List list, kotlinx.coroutines.CoroutineScope coroutineScope, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            replaceFileCorruptionHandler = null;
        }
        if ((i & 4) != 0) {
            list = kotlin.collections.CollectionsKt.emptyList();
        }
        if ((i & 8) != 0) {
            coroutineScope = kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(kotlinx.coroutines.Dispatchers.getIO().plus(kotlinx.coroutines.SupervisorKt.SupervisorJob$default((kotlinx.coroutines.Job) null, 1, (java.lang.Object) null)));
        }
        return multiProcessDataStoreFactory.create(storage, replaceFileCorruptionHandler, list, coroutineScope);
    }

    public final <T> androidx.datastore.core.DataStore<T> create(androidx.datastore.core.Storage<T> storage, androidx.datastore.core.handlers.ReplaceFileCorruptionHandler<T> corruptionHandler, java.util.List<? extends androidx.datastore.core.DataMigration<T>> migrations, kotlinx.coroutines.CoroutineScope scope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(storage, "storage");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(migrations, "migrations");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "scope");
        java.util.List listListOf = kotlin.collections.CollectionsKt.listOf(androidx.datastore.core.DataMigrationInitializer.INSTANCE.getInitializer(migrations));
        if (corruptionHandler == null) {
            corruptionHandler = (androidx.datastore.core.handlers.ReplaceFileCorruptionHandler<T>) new androidx.datastore.core.handlers.NoOpCorruptionHandler();
        }
        return new androidx.datastore.core.DataStoreImpl(storage, listListOf, corruptionHandler, scope);
    }

    public static /* synthetic */ androidx.datastore.core.DataStore create$default(androidx.datastore.core.MultiProcessDataStoreFactory multiProcessDataStoreFactory, androidx.datastore.core.Serializer serializer, androidx.datastore.core.handlers.ReplaceFileCorruptionHandler replaceFileCorruptionHandler, java.util.List list, kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.jvm.functions.Function0 function0, int i, java.lang.Object obj) {
        androidx.datastore.core.handlers.ReplaceFileCorruptionHandler replaceFileCorruptionHandler2 = (i & 2) != 0 ? null : replaceFileCorruptionHandler;
        if ((i & 4) != 0) {
            list = kotlin.collections.CollectionsKt.emptyList();
        }
        java.util.List list2 = list;
        if ((i & 8) != 0) {
            coroutineScope = kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(kotlinx.coroutines.Dispatchers.getIO().plus(kotlinx.coroutines.SupervisorKt.SupervisorJob$default((kotlinx.coroutines.Job) null, 1, (java.lang.Object) null)));
        }
        return multiProcessDataStoreFactory.create(serializer, replaceFileCorruptionHandler2, list2, coroutineScope, function0);
    }

    public final <T> androidx.datastore.core.DataStore<T> create(androidx.datastore.core.Serializer<T> serializer, androidx.datastore.core.handlers.ReplaceFileCorruptionHandler<T> corruptionHandler, java.util.List<? extends androidx.datastore.core.DataMigration<T>> migrations, final kotlinx.coroutines.CoroutineScope scope, kotlin.jvm.functions.Function0<? extends java.io.File> produceFile) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serializer, "serializer");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(migrations, "migrations");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "scope");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(produceFile, "produceFile");
        androidx.datastore.core.FileStorage fileStorage = new androidx.datastore.core.FileStorage(serializer, new kotlin.jvm.functions.Function1<java.io.File, androidx.datastore.core.InterProcessCoordinator>() { // from class: androidx.datastore.core.MultiProcessDataStoreFactory.create.1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final androidx.datastore.core.InterProcessCoordinator invoke(java.io.File it) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                return new androidx.datastore.core.MultiProcessCoordinator(scope.getCoroutineContext(), it);
            }
        }, produceFile);
        java.util.List listListOf = kotlin.collections.CollectionsKt.listOf(androidx.datastore.core.DataMigrationInitializer.INSTANCE.getInitializer(migrations));
        if (corruptionHandler == null) {
            corruptionHandler = (androidx.datastore.core.handlers.ReplaceFileCorruptionHandler<T>) new androidx.datastore.core.handlers.NoOpCorruptionHandler();
        }
        return new androidx.datastore.core.DataStoreImpl(fileStorage, listListOf, corruptionHandler, scope);
    }
}
