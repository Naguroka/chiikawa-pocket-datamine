package androidx.datastore.preferences;

/* JADX INFO: compiled from: SharedPreferencesMigration.android.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a,\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0007\u001a.\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0007\u001a/\u0010\u000f\u001a$\b\u0001\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0010H\u0002¢\u0006\u0002\u0010\u0014\u001a7\u0010\u0015\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00162\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0002¢\u0006\u0002\u0010\u0018\"\u001a\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0019"}, d2 = {"MIGRATE_ALL_KEYS", "", "", "getMIGRATE_ALL_KEYS", "()Ljava/util/Set;", "SharedPreferencesMigration", "Landroidx/datastore/migrations/SharedPreferencesMigration;", "Landroidx/datastore/preferences/core/Preferences;", "produceSharedPreferences", "Lkotlin/Function0;", "Landroid/content/SharedPreferences;", "keysToMigrate", "context", "Landroid/content/Context;", "sharedPreferencesName", "getMigrationFunction", "Lkotlin/Function3;", "Landroidx/datastore/migrations/SharedPreferencesView;", "Lkotlin/coroutines/Continuation;", "", "()Lkotlin/jvm/functions/Function3;", "getShouldRunMigration", "Lkotlin/Function2;", "", "(Ljava/util/Set;)Lkotlin/jvm/functions/Function2;", "datastore-preferences_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class SharedPreferencesMigrationKt {
    private static final java.util.Set<java.lang.String> MIGRATE_ALL_KEYS = new java.util.LinkedHashSet();

    public static final androidx.datastore.migrations.SharedPreferencesMigration<androidx.datastore.preferences.core.Preferences> SharedPreferencesMigration(android.content.Context context, java.lang.String sharedPreferencesName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sharedPreferencesName, "sharedPreferencesName");
        return SharedPreferencesMigration$default(context, sharedPreferencesName, null, 4, null);
    }

    public static final androidx.datastore.migrations.SharedPreferencesMigration<androidx.datastore.preferences.core.Preferences> SharedPreferencesMigration(kotlin.jvm.functions.Function0<? extends android.content.SharedPreferences> produceSharedPreferences) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(produceSharedPreferences, "produceSharedPreferences");
        return SharedPreferencesMigration$default(produceSharedPreferences, null, 2, null);
    }

    public static /* synthetic */ androidx.datastore.migrations.SharedPreferencesMigration SharedPreferencesMigration$default(kotlin.jvm.functions.Function0 function0, java.util.Set set, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            set = MIGRATE_ALL_KEYS;
        }
        return SharedPreferencesMigration((kotlin.jvm.functions.Function0<? extends android.content.SharedPreferences>) function0, (java.util.Set<java.lang.String>) set);
    }

    public static final androidx.datastore.migrations.SharedPreferencesMigration<androidx.datastore.preferences.core.Preferences> SharedPreferencesMigration(kotlin.jvm.functions.Function0<? extends android.content.SharedPreferences> produceSharedPreferences, java.util.Set<java.lang.String> keysToMigrate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(produceSharedPreferences, "produceSharedPreferences");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(keysToMigrate, "keysToMigrate");
        if (keysToMigrate == MIGRATE_ALL_KEYS) {
            return new androidx.datastore.migrations.SharedPreferencesMigration<>(produceSharedPreferences, (java.util.Set) null, getShouldRunMigration(keysToMigrate), getMigrationFunction(), 2, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        }
        return new androidx.datastore.migrations.SharedPreferencesMigration<>(produceSharedPreferences, keysToMigrate, getShouldRunMigration(keysToMigrate), getMigrationFunction());
    }

    public static /* synthetic */ androidx.datastore.migrations.SharedPreferencesMigration SharedPreferencesMigration$default(android.content.Context context, java.lang.String str, java.util.Set set, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            set = MIGRATE_ALL_KEYS;
        }
        return SharedPreferencesMigration(context, str, set);
    }

    public static final androidx.datastore.migrations.SharedPreferencesMigration<androidx.datastore.preferences.core.Preferences> SharedPreferencesMigration(android.content.Context context, java.lang.String sharedPreferencesName, java.util.Set<java.lang.String> keysToMigrate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sharedPreferencesName, "sharedPreferencesName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(keysToMigrate, "keysToMigrate");
        if (keysToMigrate == MIGRATE_ALL_KEYS) {
            return new androidx.datastore.migrations.SharedPreferencesMigration<>(context, sharedPreferencesName, null, getShouldRunMigration(keysToMigrate), getMigrationFunction(), 4, null);
        }
        return new androidx.datastore.migrations.SharedPreferencesMigration<>(context, sharedPreferencesName, keysToMigrate, getShouldRunMigration(keysToMigrate), getMigrationFunction());
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.SharedPreferencesMigrationKt$getMigrationFunction$1, reason: invalid class name */
    /* JADX INFO: compiled from: SharedPreferencesMigration.android.kt */
    @kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", "Landroidx/datastore/preferences/core/Preferences;", "sharedPrefs", "Landroidx/datastore/migrations/SharedPreferencesView;", "currentData"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.datastore.preferences.SharedPreferencesMigrationKt$getMigrationFunction$1", f = "SharedPreferencesMigration.android.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<androidx.datastore.migrations.SharedPreferencesView, androidx.datastore.preferences.core.Preferences, kotlin.coroutines.Continuation<? super androidx.datastore.preferences.core.Preferences>, java.lang.Object> {
        /* synthetic */ java.lang.Object L$0;
        /* synthetic */ java.lang.Object L$1;
        int label;

        AnonymousClass1(kotlin.coroutines.Continuation<? super androidx.datastore.preferences.SharedPreferencesMigrationKt.AnonymousClass1> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        public final java.lang.Object invoke(androidx.datastore.migrations.SharedPreferencesView sharedPreferencesView, androidx.datastore.preferences.core.Preferences preferences, kotlin.coroutines.Continuation<? super androidx.datastore.preferences.core.Preferences> continuation) {
            androidx.datastore.preferences.SharedPreferencesMigrationKt.AnonymousClass1 anonymousClass1 = new androidx.datastore.preferences.SharedPreferencesMigrationKt.AnonymousClass1(continuation);
            anonymousClass1.L$0 = sharedPreferencesView;
            anonymousClass1.L$1 = preferences;
            return anonymousClass1.invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            androidx.datastore.migrations.SharedPreferencesView sharedPreferencesView = (androidx.datastore.migrations.SharedPreferencesView) this.L$0;
            androidx.datastore.preferences.core.Preferences preferences = (androidx.datastore.preferences.core.Preferences) this.L$1;
            java.util.Set<androidx.datastore.preferences.core.Preferences.Key<?>> setKeySet = preferences.asMap().keySet();
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(setKeySet, 10));
            java.util.Iterator<T> it = setKeySet.iterator();
            while (it.hasNext()) {
                arrayList.add(((androidx.datastore.preferences.core.Preferences.Key) it.next()).getName());
            }
            java.util.ArrayList arrayList2 = arrayList;
            java.util.Map<java.lang.String, java.lang.Object> all = sharedPreferencesView.getAll();
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            for (java.util.Map.Entry<java.lang.String, java.lang.Object> entry : all.entrySet()) {
                if (!arrayList2.contains(entry.getKey())) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            androidx.datastore.preferences.core.MutablePreferences mutablePreferences = preferences.toMutablePreferences();
            for (java.util.Map.Entry entry2 : linkedHashMap.entrySet()) {
                java.lang.String str = (java.lang.String) entry2.getKey();
                java.lang.Object value = entry2.getValue();
                if (value instanceof java.lang.Boolean) {
                    mutablePreferences.set(androidx.datastore.preferences.core.PreferencesKeys.booleanKey(str), value);
                } else if (value instanceof java.lang.Float) {
                    mutablePreferences.set(androidx.datastore.preferences.core.PreferencesKeys.floatKey(str), value);
                } else if (value instanceof java.lang.Integer) {
                    mutablePreferences.set(androidx.datastore.preferences.core.PreferencesKeys.intKey(str), value);
                } else if (value instanceof java.lang.Long) {
                    mutablePreferences.set(androidx.datastore.preferences.core.PreferencesKeys.longKey(str), value);
                } else if (value instanceof java.lang.String) {
                    mutablePreferences.set(androidx.datastore.preferences.core.PreferencesKeys.stringKey(str), value);
                } else if (value instanceof java.util.Set) {
                    androidx.datastore.preferences.core.Preferences.Key<java.util.Set<java.lang.String>> keyStringSetKey = androidx.datastore.preferences.core.PreferencesKeys.stringSetKey(str);
                    kotlin.jvm.internal.Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
                    mutablePreferences.set(keyStringSetKey, (java.util.Set) value);
                }
            }
            return mutablePreferences.toPreferences();
        }
    }

    private static final kotlin.jvm.functions.Function3<androidx.datastore.migrations.SharedPreferencesView, androidx.datastore.preferences.core.Preferences, kotlin.coroutines.Continuation<? super androidx.datastore.preferences.core.Preferences>, java.lang.Object> getMigrationFunction() {
        return new androidx.datastore.preferences.SharedPreferencesMigrationKt.AnonymousClass1(null);
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.SharedPreferencesMigrationKt$getShouldRunMigration$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: SharedPreferencesMigration.android.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "prefs", "Landroidx/datastore/preferences/core/Preferences;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.datastore.preferences.SharedPreferencesMigrationKt$getShouldRunMigration$1", f = "SharedPreferencesMigration.android.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class C03021 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<androidx.datastore.preferences.core.Preferences, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> {
        final /* synthetic */ java.util.Set<java.lang.String> $keysToMigrate;
        /* synthetic */ java.lang.Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C03021(java.util.Set<java.lang.String> set, kotlin.coroutines.Continuation<? super androidx.datastore.preferences.SharedPreferencesMigrationKt.C03021> continuation) {
            super(2, continuation);
            this.$keysToMigrate = set;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            androidx.datastore.preferences.SharedPreferencesMigrationKt.C03021 c03021 = new androidx.datastore.preferences.SharedPreferencesMigrationKt.C03021(this.$keysToMigrate, continuation);
            c03021.L$0 = obj;
            return c03021;
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(androidx.datastore.preferences.core.Preferences preferences, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
            return ((androidx.datastore.preferences.SharedPreferencesMigrationKt.C03021) create(preferences, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            java.util.Set<androidx.datastore.preferences.core.Preferences.Key<?>> setKeySet = ((androidx.datastore.preferences.core.Preferences) this.L$0).asMap().keySet();
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(setKeySet, 10));
            java.util.Iterator<T> it = setKeySet.iterator();
            while (it.hasNext()) {
                arrayList.add(((androidx.datastore.preferences.core.Preferences.Key) it.next()).getName());
            }
            java.util.ArrayList arrayList2 = arrayList;
            boolean z = true;
            if (this.$keysToMigrate != androidx.datastore.preferences.SharedPreferencesMigrationKt.getMIGRATE_ALL_KEYS()) {
                java.util.Set<java.lang.String> set = this.$keysToMigrate;
                if ((set instanceof java.util.Collection) && set.isEmpty()) {
                    z = false;
                } else {
                    java.util.Iterator<T> it2 = set.iterator();
                    while (it2.hasNext()) {
                        if (!arrayList2.contains((java.lang.String) it2.next())) {
                        }
                    }
                    z = false;
                }
            }
            return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(z);
        }
    }

    private static final kotlin.jvm.functions.Function2<androidx.datastore.preferences.core.Preferences, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> getShouldRunMigration(java.util.Set<java.lang.String> set) {
        return new androidx.datastore.preferences.SharedPreferencesMigrationKt.C03021(set, null);
    }

    public static final java.util.Set<java.lang.String> getMIGRATE_ALL_KEYS() {
        return MIGRATE_ALL_KEYS;
    }
}
