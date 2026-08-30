package androidx.datastore.preferences;

/* JADX INFO: compiled from: PreferenceDataStoreDelegate.android.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001BG\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\b\u0012\u001e\u0010\t\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\f0\u000b0\n\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ#\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0014\u001a\u00020\u00022\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u0016H\u0096\u0002R\u001a\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\t\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\f0\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Landroidx/datastore/preferences/PreferenceDataStoreSingletonDelegate;", "Lkotlin/properties/ReadOnlyProperty;", "Landroid/content/Context;", "Landroidx/datastore/core/DataStore;", "Landroidx/datastore/preferences/core/Preferences;", "name", "", "corruptionHandler", "Landroidx/datastore/core/handlers/ReplaceFileCorruptionHandler;", "produceMigrations", "Lkotlin/Function1;", "", "Landroidx/datastore/core/DataMigration;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "(Ljava/lang/String;Landroidx/datastore/core/handlers/ReplaceFileCorruptionHandler;Lkotlin/jvm/functions/Function1;Lkotlinx/coroutines/CoroutineScope;)V", "INSTANCE", "lock", "", "getValue", "thisRef", "property", "Lkotlin/reflect/KProperty;", "datastore-preferences_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PreferenceDataStoreSingletonDelegate implements kotlin.properties.ReadOnlyProperty<android.content.Context, androidx.datastore.core.DataStore<androidx.datastore.preferences.core.Preferences>> {
    private volatile androidx.datastore.core.DataStore<androidx.datastore.preferences.core.Preferences> INSTANCE;
    private final androidx.datastore.core.handlers.ReplaceFileCorruptionHandler<androidx.datastore.preferences.core.Preferences> corruptionHandler;
    private final java.lang.Object lock;
    private final java.lang.String name;
    private final kotlin.jvm.functions.Function1<android.content.Context, java.util.List<androidx.datastore.core.DataMigration<androidx.datastore.preferences.core.Preferences>>> produceMigrations;
    private final kotlinx.coroutines.CoroutineScope scope;

    /* JADX WARN: Multi-variable type inference failed */
    public PreferenceDataStoreSingletonDelegate(java.lang.String name, androidx.datastore.core.handlers.ReplaceFileCorruptionHandler<androidx.datastore.preferences.core.Preferences> replaceFileCorruptionHandler, kotlin.jvm.functions.Function1<? super android.content.Context, ? extends java.util.List<? extends androidx.datastore.core.DataMigration<androidx.datastore.preferences.core.Preferences>>> produceMigrations, kotlinx.coroutines.CoroutineScope scope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(produceMigrations, "produceMigrations");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "scope");
        this.name = name;
        this.corruptionHandler = replaceFileCorruptionHandler;
        this.produceMigrations = produceMigrations;
        this.scope = scope;
        this.lock = new java.lang.Object();
    }

    @Override // kotlin.properties.ReadOnlyProperty
    public /* bridge */ /* synthetic */ androidx.datastore.core.DataStore<androidx.datastore.preferences.core.Preferences> getValue(android.content.Context context, kotlin.reflect.KProperty kProperty) {
        return getValue2(context, (kotlin.reflect.KProperty<?>) kProperty);
    }

    /* JADX INFO: renamed from: getValue, reason: avoid collision after fix types in other method */
    public androidx.datastore.core.DataStore<androidx.datastore.preferences.core.Preferences> getValue2(android.content.Context thisRef, kotlin.reflect.KProperty<?> property) {
        androidx.datastore.core.DataStore<androidx.datastore.preferences.core.Preferences> dataStore;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(thisRef, "thisRef");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(property, "property");
        androidx.datastore.core.DataStore<androidx.datastore.preferences.core.Preferences> dataStore2 = this.INSTANCE;
        if (dataStore2 != null) {
            return dataStore2;
        }
        synchronized (this.lock) {
            if (this.INSTANCE == null) {
                final android.content.Context applicationContext = thisRef.getApplicationContext();
                androidx.datastore.preferences.core.PreferenceDataStoreFactory preferenceDataStoreFactory = androidx.datastore.preferences.core.PreferenceDataStoreFactory.INSTANCE;
                androidx.datastore.core.handlers.ReplaceFileCorruptionHandler<androidx.datastore.preferences.core.Preferences> replaceFileCorruptionHandler = this.corruptionHandler;
                kotlin.jvm.functions.Function1<android.content.Context, java.util.List<androidx.datastore.core.DataMigration<androidx.datastore.preferences.core.Preferences>>> function1 = this.produceMigrations;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
                this.INSTANCE = preferenceDataStoreFactory.create(replaceFileCorruptionHandler, function1.invoke(applicationContext), this.scope, new kotlin.jvm.functions.Function0<java.io.File>() { // from class: androidx.datastore.preferences.PreferenceDataStoreSingletonDelegate$getValue$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.io.File invoke() {
                        android.content.Context applicationContext2 = applicationContext;
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(applicationContext2, "applicationContext");
                        return androidx.datastore.preferences.PreferenceDataStoreFile.preferencesDataStoreFile(applicationContext2, this.name);
                    }
                });
            }
            dataStore = this.INSTANCE;
            kotlin.jvm.internal.Intrinsics.checkNotNull(dataStore);
        }
        return dataStore;
    }
}
