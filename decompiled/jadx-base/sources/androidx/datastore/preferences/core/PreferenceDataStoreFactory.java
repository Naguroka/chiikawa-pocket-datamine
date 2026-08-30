package androidx.datastore.preferences.core;

/* JADX INFO: compiled from: PreferenceDataStoreFactory.jvm.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JN\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\t2\u0014\b\u0002\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\f0\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0007JN\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\t2\u0014\b\u0002\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\f0\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0007JN\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\t2\u0014\b\u0002\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\f0\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00130\u0010H\u0007¨\u0006\u0014"}, d2 = {"Landroidx/datastore/preferences/core/PreferenceDataStoreFactory;", "", "()V", "create", "Landroidx/datastore/core/DataStore;", "Landroidx/datastore/preferences/core/Preferences;", com.ironsource.y8.a.k, "Landroidx/datastore/core/Storage;", "corruptionHandler", "Landroidx/datastore/core/handlers/ReplaceFileCorruptionHandler;", "migrations", "", "Landroidx/datastore/core/DataMigration;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "produceFile", "Lkotlin/Function0;", "Ljava/io/File;", "createWithPath", "Lokio/Path;", "datastore-preferences-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PreferenceDataStoreFactory {
    public static final androidx.datastore.preferences.core.PreferenceDataStoreFactory INSTANCE = new androidx.datastore.preferences.core.PreferenceDataStoreFactory();

    public final androidx.datastore.core.DataStore<androidx.datastore.preferences.core.Preferences> create(androidx.datastore.core.Storage<androidx.datastore.preferences.core.Preferences> storage) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(storage, "storage");
        return create$default(this, storage, (androidx.datastore.core.handlers.ReplaceFileCorruptionHandler) null, (java.util.List) null, (kotlinx.coroutines.CoroutineScope) null, 14, (java.lang.Object) null);
    }

    public final androidx.datastore.core.DataStore<androidx.datastore.preferences.core.Preferences> create(androidx.datastore.core.Storage<androidx.datastore.preferences.core.Preferences> storage, androidx.datastore.core.handlers.ReplaceFileCorruptionHandler<androidx.datastore.preferences.core.Preferences> replaceFileCorruptionHandler) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(storage, "storage");
        return create$default(this, storage, replaceFileCorruptionHandler, (java.util.List) null, (kotlinx.coroutines.CoroutineScope) null, 12, (java.lang.Object) null);
    }

    public final androidx.datastore.core.DataStore<androidx.datastore.preferences.core.Preferences> create(androidx.datastore.core.Storage<androidx.datastore.preferences.core.Preferences> storage, androidx.datastore.core.handlers.ReplaceFileCorruptionHandler<androidx.datastore.preferences.core.Preferences> replaceFileCorruptionHandler, java.util.List<? extends androidx.datastore.core.DataMigration<androidx.datastore.preferences.core.Preferences>> migrations) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(storage, "storage");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(migrations, "migrations");
        return create$default(this, storage, replaceFileCorruptionHandler, migrations, (kotlinx.coroutines.CoroutineScope) null, 8, (java.lang.Object) null);
    }

    public final androidx.datastore.core.DataStore<androidx.datastore.preferences.core.Preferences> create(androidx.datastore.core.handlers.ReplaceFileCorruptionHandler<androidx.datastore.preferences.core.Preferences> replaceFileCorruptionHandler, java.util.List<? extends androidx.datastore.core.DataMigration<androidx.datastore.preferences.core.Preferences>> migrations, kotlin.jvm.functions.Function0<? extends java.io.File> produceFile) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(migrations, "migrations");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(produceFile, "produceFile");
        return create$default(this, replaceFileCorruptionHandler, migrations, (kotlinx.coroutines.CoroutineScope) null, produceFile, 4, (java.lang.Object) null);
    }

    public final androidx.datastore.core.DataStore<androidx.datastore.preferences.core.Preferences> create(androidx.datastore.core.handlers.ReplaceFileCorruptionHandler<androidx.datastore.preferences.core.Preferences> replaceFileCorruptionHandler, kotlin.jvm.functions.Function0<? extends java.io.File> produceFile) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(produceFile, "produceFile");
        return create$default(this, replaceFileCorruptionHandler, (java.util.List) null, (kotlinx.coroutines.CoroutineScope) null, produceFile, 6, (java.lang.Object) null);
    }

    public final androidx.datastore.core.DataStore<androidx.datastore.preferences.core.Preferences> create(kotlin.jvm.functions.Function0<? extends java.io.File> produceFile) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(produceFile, "produceFile");
        return create$default(this, (androidx.datastore.core.handlers.ReplaceFileCorruptionHandler) null, (java.util.List) null, (kotlinx.coroutines.CoroutineScope) null, produceFile, 7, (java.lang.Object) null);
    }

    public final androidx.datastore.core.DataStore<androidx.datastore.preferences.core.Preferences> createWithPath(androidx.datastore.core.handlers.ReplaceFileCorruptionHandler<androidx.datastore.preferences.core.Preferences> replaceFileCorruptionHandler, java.util.List<? extends androidx.datastore.core.DataMigration<androidx.datastore.preferences.core.Preferences>> migrations, kotlin.jvm.functions.Function0<okio.Path> produceFile) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(migrations, "migrations");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(produceFile, "produceFile");
        return createWithPath$default(this, replaceFileCorruptionHandler, migrations, null, produceFile, 4, null);
    }

    public final androidx.datastore.core.DataStore<androidx.datastore.preferences.core.Preferences> createWithPath(androidx.datastore.core.handlers.ReplaceFileCorruptionHandler<androidx.datastore.preferences.core.Preferences> replaceFileCorruptionHandler, kotlin.jvm.functions.Function0<okio.Path> produceFile) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(produceFile, "produceFile");
        return createWithPath$default(this, replaceFileCorruptionHandler, null, null, produceFile, 6, null);
    }

    public final androidx.datastore.core.DataStore<androidx.datastore.preferences.core.Preferences> createWithPath(kotlin.jvm.functions.Function0<okio.Path> produceFile) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(produceFile, "produceFile");
        return createWithPath$default(this, null, null, null, produceFile, 7, null);
    }

    private PreferenceDataStoreFactory() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ androidx.datastore.core.DataStore create$default(androidx.datastore.preferences.core.PreferenceDataStoreFactory preferenceDataStoreFactory, androidx.datastore.core.Storage storage, androidx.datastore.core.handlers.ReplaceFileCorruptionHandler replaceFileCorruptionHandler, java.util.List list, kotlinx.coroutines.CoroutineScope coroutineScope, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            replaceFileCorruptionHandler = null;
        }
        if ((i & 4) != 0) {
            list = kotlin.collections.CollectionsKt.emptyList();
        }
        if ((i & 8) != 0) {
            coroutineScope = kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(androidx.datastore.preferences.core.Actual_jvmKt.ioDispatcher().plus(kotlinx.coroutines.SupervisorKt.SupervisorJob$default((kotlinx.coroutines.Job) null, 1, (java.lang.Object) null)));
        }
        return preferenceDataStoreFactory.create((androidx.datastore.core.Storage<androidx.datastore.preferences.core.Preferences>) storage, (androidx.datastore.core.handlers.ReplaceFileCorruptionHandler<androidx.datastore.preferences.core.Preferences>) replaceFileCorruptionHandler, (java.util.List<? extends androidx.datastore.core.DataMigration<androidx.datastore.preferences.core.Preferences>>) list, coroutineScope);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ androidx.datastore.core.DataStore create$default(androidx.datastore.preferences.core.PreferenceDataStoreFactory preferenceDataStoreFactory, androidx.datastore.core.handlers.ReplaceFileCorruptionHandler replaceFileCorruptionHandler, java.util.List list, kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.jvm.functions.Function0 function0, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            replaceFileCorruptionHandler = null;
        }
        if ((i & 2) != 0) {
            list = kotlin.collections.CollectionsKt.emptyList();
        }
        if ((i & 4) != 0) {
            coroutineScope = kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(kotlinx.coroutines.Dispatchers.getIO().plus(kotlinx.coroutines.SupervisorKt.SupervisorJob$default((kotlinx.coroutines.Job) null, 1, (java.lang.Object) null)));
        }
        return preferenceDataStoreFactory.create((androidx.datastore.core.handlers.ReplaceFileCorruptionHandler<androidx.datastore.preferences.core.Preferences>) replaceFileCorruptionHandler, (java.util.List<? extends androidx.datastore.core.DataMigration<androidx.datastore.preferences.core.Preferences>>) list, coroutineScope, (kotlin.jvm.functions.Function0<? extends java.io.File>) function0);
    }

    public final androidx.datastore.core.DataStore<androidx.datastore.preferences.core.Preferences> create(androidx.datastore.core.handlers.ReplaceFileCorruptionHandler<androidx.datastore.preferences.core.Preferences> corruptionHandler, java.util.List<? extends androidx.datastore.core.DataMigration<androidx.datastore.preferences.core.Preferences>> migrations, kotlinx.coroutines.CoroutineScope scope, final kotlin.jvm.functions.Function0<? extends java.io.File> produceFile) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(migrations, "migrations");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "scope");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(produceFile, "produceFile");
        return new androidx.datastore.preferences.core.PreferenceDataStore(create(new androidx.datastore.core.okio.OkioStorage(okio.FileSystem.SYSTEM, androidx.datastore.preferences.core.PreferencesSerializer.INSTANCE, null, new kotlin.jvm.functions.Function0<okio.Path>() { // from class: androidx.datastore.preferences.core.PreferenceDataStoreFactory$create$delegate$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final okio.Path invoke() {
                java.io.File fileInvoke = produceFile.invoke();
                if (!kotlin.jvm.internal.Intrinsics.areEqual(kotlin.io.FilesKt.getExtension(fileInvoke), androidx.datastore.preferences.core.PreferencesSerializer.fileExtension)) {
                    throw new java.lang.IllegalStateException(("File extension for file: " + fileInvoke + " does not match required extension for Preferences file: preferences_pb").toString());
                }
                okio.Path.Companion companion = okio.Path.INSTANCE;
                java.io.File absoluteFile = fileInvoke.getAbsoluteFile();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(absoluteFile, "file.absoluteFile");
                return okio.Path.Companion.get$default(companion, absoluteFile, false, 1, (java.lang.Object) null);
            }
        }, 4, null), corruptionHandler, migrations, scope));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ androidx.datastore.core.DataStore createWithPath$default(androidx.datastore.preferences.core.PreferenceDataStoreFactory preferenceDataStoreFactory, androidx.datastore.core.handlers.ReplaceFileCorruptionHandler replaceFileCorruptionHandler, java.util.List list, kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.jvm.functions.Function0 function0, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            replaceFileCorruptionHandler = null;
        }
        if ((i & 2) != 0) {
            list = kotlin.collections.CollectionsKt.emptyList();
        }
        if ((i & 4) != 0) {
            coroutineScope = kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(androidx.datastore.preferences.core.Actual_jvmKt.ioDispatcher().plus(kotlinx.coroutines.SupervisorKt.SupervisorJob$default((kotlinx.coroutines.Job) null, 1, (java.lang.Object) null)));
        }
        return preferenceDataStoreFactory.createWithPath(replaceFileCorruptionHandler, list, coroutineScope, function0);
    }

    public final androidx.datastore.core.DataStore<androidx.datastore.preferences.core.Preferences> create(androidx.datastore.core.Storage<androidx.datastore.preferences.core.Preferences> storage, androidx.datastore.core.handlers.ReplaceFileCorruptionHandler<androidx.datastore.preferences.core.Preferences> corruptionHandler, java.util.List<? extends androidx.datastore.core.DataMigration<androidx.datastore.preferences.core.Preferences>> migrations, kotlinx.coroutines.CoroutineScope scope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(storage, "storage");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(migrations, "migrations");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "scope");
        return new androidx.datastore.preferences.core.PreferenceDataStore(androidx.datastore.core.DataStoreFactory.INSTANCE.create(storage, corruptionHandler, migrations, scope));
    }

    public final androidx.datastore.core.DataStore<androidx.datastore.preferences.core.Preferences> createWithPath(androidx.datastore.core.handlers.ReplaceFileCorruptionHandler<androidx.datastore.preferences.core.Preferences> corruptionHandler, java.util.List<? extends androidx.datastore.core.DataMigration<androidx.datastore.preferences.core.Preferences>> migrations, kotlinx.coroutines.CoroutineScope scope, final kotlin.jvm.functions.Function0<okio.Path> produceFile) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(migrations, "migrations");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "scope");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(produceFile, "produceFile");
        return create(corruptionHandler, migrations, scope, new kotlin.jvm.functions.Function0<java.io.File>() { // from class: androidx.datastore.preferences.core.PreferenceDataStoreFactory.createWithPath.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final java.io.File invoke() {
                return produceFile.invoke().toFile();
            }
        });
    }
}
