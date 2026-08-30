package androidx.datastore;

/* JADX INFO: compiled from: DataStoreDelegate.android.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00040\u0002BU\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\n\u0012\u001e\u0010\u000b\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e0\r0\f\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0002\u0010\u0011J#\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0016\u001a\u00020\u00032\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u0018H\u0096\u0002R\u001a\u0010\u0012\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\u000b\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e0\r0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Landroidx/datastore/DataStoreSingletonDelegate;", "T", "Lkotlin/properties/ReadOnlyProperty;", "Landroid/content/Context;", "Landroidx/datastore/core/DataStore;", com.ironsource.rc.c.b, "", "serializer", "Landroidx/datastore/core/okio/OkioSerializer;", "corruptionHandler", "Landroidx/datastore/core/handlers/ReplaceFileCorruptionHandler;", "produceMigrations", "Lkotlin/Function1;", "", "Landroidx/datastore/core/DataMigration;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "(Ljava/lang/String;Landroidx/datastore/core/okio/OkioSerializer;Landroidx/datastore/core/handlers/ReplaceFileCorruptionHandler;Lkotlin/jvm/functions/Function1;Lkotlinx/coroutines/CoroutineScope;)V", "INSTANCE", "lock", "", "getValue", "thisRef", "property", "Lkotlin/reflect/KProperty;", "datastore_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DataStoreSingletonDelegate<T> implements kotlin.properties.ReadOnlyProperty<android.content.Context, androidx.datastore.core.DataStore<T>> {
    private volatile androidx.datastore.core.DataStore<T> INSTANCE;
    private final androidx.datastore.core.handlers.ReplaceFileCorruptionHandler<T> corruptionHandler;
    private final java.lang.String fileName;
    private final java.lang.Object lock;
    private final kotlin.jvm.functions.Function1<android.content.Context, java.util.List<androidx.datastore.core.DataMigration<T>>> produceMigrations;
    private final kotlinx.coroutines.CoroutineScope scope;
    private final androidx.datastore.core.okio.OkioSerializer<T> serializer;

    /* JADX WARN: Multi-variable type inference failed */
    public DataStoreSingletonDelegate(java.lang.String fileName, androidx.datastore.core.okio.OkioSerializer<T> serializer, androidx.datastore.core.handlers.ReplaceFileCorruptionHandler<T> replaceFileCorruptionHandler, kotlin.jvm.functions.Function1<? super android.content.Context, ? extends java.util.List<? extends androidx.datastore.core.DataMigration<T>>> produceMigrations, kotlinx.coroutines.CoroutineScope scope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileName, "fileName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serializer, "serializer");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(produceMigrations, "produceMigrations");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "scope");
        this.fileName = fileName;
        this.serializer = serializer;
        this.corruptionHandler = replaceFileCorruptionHandler;
        this.produceMigrations = produceMigrations;
        this.scope = scope;
        this.lock = new java.lang.Object();
    }

    @Override // kotlin.properties.ReadOnlyProperty
    public /* bridge */ /* synthetic */ java.lang.Object getValue(android.content.Context context, kotlin.reflect.KProperty kProperty) {
        return getValue2(context, (kotlin.reflect.KProperty<?>) kProperty);
    }

    /* JADX INFO: renamed from: getValue, reason: avoid collision after fix types in other method */
    public androidx.datastore.core.DataStore<T> getValue2(android.content.Context thisRef, kotlin.reflect.KProperty<?> property) {
        androidx.datastore.core.DataStore<T> dataStore;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(thisRef, "thisRef");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(property, "property");
        androidx.datastore.core.DataStore<T> dataStore2 = this.INSTANCE;
        if (dataStore2 != null) {
            return dataStore2;
        }
        synchronized (this.lock) {
            if (this.INSTANCE == null) {
                final android.content.Context applicationContext = thisRef.getApplicationContext();
                androidx.datastore.core.DataStoreFactory dataStoreFactory = androidx.datastore.core.DataStoreFactory.INSTANCE;
                androidx.datastore.core.okio.OkioStorage okioStorage = new androidx.datastore.core.okio.OkioStorage(okio.FileSystem.SYSTEM, this.serializer, null, new kotlin.jvm.functions.Function0<okio.Path>() { // from class: androidx.datastore.DataStoreSingletonDelegate$getValue$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final okio.Path invoke() {
                        okio.Path.Companion companion = okio.Path.INSTANCE;
                        android.content.Context applicationContext2 = applicationContext;
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(applicationContext2, "applicationContext");
                        java.lang.String absolutePath = androidx.datastore.DataStoreFile.dataStoreFile(applicationContext2, ((androidx.datastore.DataStoreSingletonDelegate) this).fileName).getAbsolutePath();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(absolutePath, "applicationContext.dataS…le(fileName).absolutePath");
                        return okio.Path.Companion.get$default(companion, absolutePath, false, 1, (java.lang.Object) null);
                    }
                }, 4, null);
                androidx.datastore.core.handlers.ReplaceFileCorruptionHandler<T> replaceFileCorruptionHandler = this.corruptionHandler;
                kotlin.jvm.functions.Function1<android.content.Context, java.util.List<androidx.datastore.core.DataMigration<T>>> function1 = this.produceMigrations;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
                this.INSTANCE = dataStoreFactory.create(okioStorage, replaceFileCorruptionHandler, function1.invoke(applicationContext), this.scope);
            }
            dataStore = this.INSTANCE;
            kotlin.jvm.internal.Intrinsics.checkNotNull(dataStore);
        }
        return dataStore;
    }
}
