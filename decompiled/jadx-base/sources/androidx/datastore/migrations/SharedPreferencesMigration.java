package androidx.datastore.migrations;

/* JADX INFO: compiled from: SharedPreferencesMigration.android.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010#\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002:\u0001,Bu\b\u0017\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012$\b\u0002\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\r0\n\u0012(\u0010\u000e\u001a$\b\u0001\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000f¢\u0006\u0002\u0010\u0011Bw\b\u0017\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\b\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012$\b\u0002\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\r0\n\u0012(\u0010\u000e\u001a$\b\u0001\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000f¢\u0006\u0002\u0010\u0015B\u0087\u0001\b\u0002\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012$\b\u0002\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\r0\n\u0012(\u0010\u000e\u001a$\b\u0001\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\u0017J\u000e\u0010!\u001a\u00020\"H\u0096@¢\u0006\u0002\u0010#J\u0018\u0010$\u001a\u00020\"2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\bH\u0002J\u0010\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020&H\u0002J\u0018\u0010(\u001a\u00020&2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\bH\u0002J\u0016\u0010\u000e\u001a\u00028\u00002\u0006\u0010)\u001a\u00028\u0000H\u0096@¢\u0006\u0002\u0010*J\u0016\u0010+\u001a\u00020\f2\u0006\u0010)\u001a\u00028\u0000H\u0096@¢\u0006\u0002\u0010*R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R2\u0010\u000e\u001a$\b\u0001\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000fX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001aR\u0010\u0010\u0016\u001a\u0004\u0018\u00010\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u001b\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u001dR,\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\r0\nX\u0082\u0004¢\u0006\u0004\n\u0002\u0010 ¨\u0006-"}, d2 = {"Landroidx/datastore/migrations/SharedPreferencesMigration;", "T", "Landroidx/datastore/core/DataMigration;", "produceSharedPreferences", "Lkotlin/Function0;", "Landroid/content/SharedPreferences;", "keysToMigrate", "", "", "shouldRunMigration", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "", "migrate", "Lkotlin/Function3;", "Landroidx/datastore/migrations/SharedPreferencesView;", "(Lkotlin/jvm/functions/Function0;Ljava/util/Set;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;)V", "context", "Landroid/content/Context;", "sharedPreferencesName", "(Landroid/content/Context;Ljava/lang/String;Ljava/util/Set;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;)V", "name", "(Lkotlin/jvm/functions/Function0;Ljava/util/Set;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Landroid/content/Context;Ljava/lang/String;)V", "keySet", "", "Lkotlin/jvm/functions/Function3;", "sharedPrefs", "getSharedPrefs", "()Landroid/content/SharedPreferences;", "sharedPrefs$delegate", "Lkotlin/Lazy;", "Lkotlin/jvm/functions/Function2;", "cleanUp", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteSharedPreferences", "getSharedPrefsBackup", "Ljava/io/File;", "prefsFile", "getSharedPrefsFile", "currentData", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "shouldMigrate", "Api24Impl", "datastore_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SharedPreferencesMigration<T> implements androidx.datastore.core.DataMigration<T> {
    private final android.content.Context context;
    private final java.util.Set<java.lang.String> keySet;
    private final kotlin.jvm.functions.Function3<androidx.datastore.migrations.SharedPreferencesView, T, kotlin.coroutines.Continuation<? super T>, java.lang.Object> migrate;
    private final java.lang.String name;

    /* JADX INFO: renamed from: sharedPrefs$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy sharedPrefs;
    private final kotlin.jvm.functions.Function2<T, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> shouldRunMigration;

    /* JADX INFO: renamed from: androidx.datastore.migrations.SharedPreferencesMigration$shouldMigrate$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: SharedPreferencesMigration.android.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.datastore.migrations.SharedPreferencesMigration", f = "SharedPreferencesMigration.android.kt", i = {0}, l = {org.objectweb.asm.Opcodes.DCMPL}, m = "shouldMigrate", n = {"this"}, s = {"L$0"})
    static final class C03011 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        int label;
        /* synthetic */ java.lang.Object result;
        final /* synthetic */ androidx.datastore.migrations.SharedPreferencesMigration<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C03011(androidx.datastore.migrations.SharedPreferencesMigration<T> sharedPreferencesMigration, kotlin.coroutines.Continuation<? super androidx.datastore.migrations.SharedPreferencesMigration.C03011> continuation) {
            super(continuation);
            this.this$0 = sharedPreferencesMigration;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.shouldMigrate(null, this);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SharedPreferencesMigration(android.content.Context context, java.lang.String sharedPreferencesName, java.util.Set<java.lang.String> keysToMigrate, kotlin.jvm.functions.Function3<? super androidx.datastore.migrations.SharedPreferencesView, ? super T, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> migrate) {
        this(context, sharedPreferencesName, keysToMigrate, null, migrate, 8, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sharedPreferencesName, "sharedPreferencesName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(keysToMigrate, "keysToMigrate");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(migrate, "migrate");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SharedPreferencesMigration(android.content.Context context, java.lang.String sharedPreferencesName, kotlin.jvm.functions.Function3<? super androidx.datastore.migrations.SharedPreferencesView, ? super T, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> migrate) {
        this(context, sharedPreferencesName, null, null, migrate, 12, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sharedPreferencesName, "sharedPreferencesName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(migrate, "migrate");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SharedPreferencesMigration(kotlin.jvm.functions.Function0<? extends android.content.SharedPreferences> produceSharedPreferences, java.util.Set<java.lang.String> keysToMigrate, kotlin.jvm.functions.Function3<? super androidx.datastore.migrations.SharedPreferencesView, ? super T, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> migrate) {
        this(produceSharedPreferences, keysToMigrate, (kotlin.jvm.functions.Function2) null, migrate, 4, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(produceSharedPreferences, "produceSharedPreferences");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(keysToMigrate, "keysToMigrate");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(migrate, "migrate");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SharedPreferencesMigration(kotlin.jvm.functions.Function0<? extends android.content.SharedPreferences> produceSharedPreferences, kotlin.jvm.functions.Function3<? super androidx.datastore.migrations.SharedPreferencesView, ? super T, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> migrate) {
        this(produceSharedPreferences, (java.util.Set) null, (kotlin.jvm.functions.Function2) null, migrate, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(produceSharedPreferences, "produceSharedPreferences");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(migrate, "migrate");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private SharedPreferencesMigration(kotlin.jvm.functions.Function0<? extends android.content.SharedPreferences> function0, java.util.Set<java.lang.String> set, kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super java.lang.Boolean>, ? extends java.lang.Object> function2, kotlin.jvm.functions.Function3<? super androidx.datastore.migrations.SharedPreferencesView, ? super T, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> function3, android.content.Context context, java.lang.String str) {
        this.shouldRunMigration = function2;
        this.migrate = function3;
        this.context = context;
        this.name = str;
        this.sharedPrefs = kotlin.LazyKt.lazy(function0);
        this.keySet = set == androidx.datastore.migrations.SharedPreferencesMigration_androidKt.getMIGRATE_ALL_KEYS() ? null : kotlin.collections.CollectionsKt.toMutableSet(set);
    }

    /* JADX INFO: renamed from: androidx.datastore.migrations.SharedPreferencesMigration$1, reason: invalid class name */
    /* JADX INFO: compiled from: SharedPreferencesMigration.android.kt */
    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@"}, d2 = {"<anonymous>", "", "T", "it"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.datastore.migrations.SharedPreferencesMigration$1", f = "SharedPreferencesMigration.android.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<T, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> {
        int label;

        AnonymousClass1(kotlin.coroutines.Continuation<? super androidx.datastore.migrations.SharedPreferencesMigration.AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new androidx.datastore.migrations.SharedPreferencesMigration.AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(T t, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
            return ((androidx.datastore.migrations.SharedPreferencesMigration.AnonymousClass1) create(t, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true);
        }
    }

    /* synthetic */ SharedPreferencesMigration(kotlin.jvm.functions.Function0 function0, java.util.Set set, androidx.datastore.migrations.SharedPreferencesMigration.AnonymousClass1 anonymousClass1, kotlin.jvm.functions.Function3 function3, android.content.Context context, java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((kotlin.jvm.functions.Function0<? extends android.content.SharedPreferences>) function0, (java.util.Set<java.lang.String>) set, (i & 4) != 0 ? new androidx.datastore.migrations.SharedPreferencesMigration.AnonymousClass1(null) : anonymousClass1, function3, context, str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: renamed from: androidx.datastore.migrations.SharedPreferencesMigration$2, reason: invalid class name */
    /* JADX INFO: compiled from: SharedPreferencesMigration.android.kt */
    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@"}, d2 = {"<anonymous>", "", "T", "it"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.datastore.migrations.SharedPreferencesMigration$2", f = "SharedPreferencesMigration.android.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<T, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> {
        int label;

        AnonymousClass2(kotlin.coroutines.Continuation<? super androidx.datastore.migrations.SharedPreferencesMigration.AnonymousClass2> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new androidx.datastore.migrations.SharedPreferencesMigration.AnonymousClass2(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(T t, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
            return ((androidx.datastore.migrations.SharedPreferencesMigration.AnonymousClass2) create(t, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true);
        }
    }

    public /* synthetic */ SharedPreferencesMigration(kotlin.jvm.functions.Function0 function0, java.util.Set set, androidx.datastore.migrations.SharedPreferencesMigration.AnonymousClass2 anonymousClass2, kotlin.jvm.functions.Function3 function3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((kotlin.jvm.functions.Function0<? extends android.content.SharedPreferences>) function0, (java.util.Set<java.lang.String>) ((i & 2) != 0 ? androidx.datastore.migrations.SharedPreferencesMigration_androidKt.getMIGRATE_ALL_KEYS() : set), (i & 4) != 0 ? new androidx.datastore.migrations.SharedPreferencesMigration.AnonymousClass2(null) : anonymousClass2, function3);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SharedPreferencesMigration(kotlin.jvm.functions.Function0<? extends android.content.SharedPreferences> produceSharedPreferences, java.util.Set<java.lang.String> keysToMigrate, kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super java.lang.Boolean>, ? extends java.lang.Object> shouldRunMigration, kotlin.jvm.functions.Function3<? super androidx.datastore.migrations.SharedPreferencesView, ? super T, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> migrate) {
        this(produceSharedPreferences, keysToMigrate, shouldRunMigration, migrate, (android.content.Context) null, (java.lang.String) null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(produceSharedPreferences, "produceSharedPreferences");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(keysToMigrate, "keysToMigrate");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(shouldRunMigration, "shouldRunMigration");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(migrate, "migrate");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: renamed from: androidx.datastore.migrations.SharedPreferencesMigration$3, reason: invalid class name */
    /* JADX INFO: compiled from: SharedPreferencesMigration.android.kt */
    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@"}, d2 = {"<anonymous>", "", "T", "it"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.datastore.migrations.SharedPreferencesMigration$3", f = "SharedPreferencesMigration.android.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass3 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<T, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> {
        int label;

        AnonymousClass3(kotlin.coroutines.Continuation<? super androidx.datastore.migrations.SharedPreferencesMigration.AnonymousClass3> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new androidx.datastore.migrations.SharedPreferencesMigration.AnonymousClass3(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(T t, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
            return ((androidx.datastore.migrations.SharedPreferencesMigration.AnonymousClass3) create(t, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true);
        }
    }

    public /* synthetic */ SharedPreferencesMigration(android.content.Context context, java.lang.String str, java.util.Set set, androidx.datastore.migrations.SharedPreferencesMigration.AnonymousClass3 anonymousClass3, kotlin.jvm.functions.Function3 function3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, (i & 4) != 0 ? androidx.datastore.migrations.SharedPreferencesMigration_androidKt.getMIGRATE_ALL_KEYS() : set, (i & 8) != 0 ? new androidx.datastore.migrations.SharedPreferencesMigration.AnonymousClass3(null) : anonymousClass3, function3);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SharedPreferencesMigration(final android.content.Context context, final java.lang.String sharedPreferencesName, java.util.Set<java.lang.String> keysToMigrate, kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super java.lang.Boolean>, ? extends java.lang.Object> shouldRunMigration, kotlin.jvm.functions.Function3<? super androidx.datastore.migrations.SharedPreferencesView, ? super T, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> migrate) {
        this(new kotlin.jvm.functions.Function0<android.content.SharedPreferences>() { // from class: androidx.datastore.migrations.SharedPreferencesMigration.4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final android.content.SharedPreferences invoke() {
                android.content.SharedPreferences sharedPreferences = context.getSharedPreferences(sharedPreferencesName, 0);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sharedPreferences, "context.getSharedPrefere…me, Context.MODE_PRIVATE)");
                return sharedPreferences;
            }
        }, keysToMigrate, shouldRunMigration, migrate, context, sharedPreferencesName);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sharedPreferencesName, "sharedPreferencesName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(keysToMigrate, "keysToMigrate");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(shouldRunMigration, "shouldRunMigration");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(migrate, "migrate");
    }

    private final android.content.SharedPreferences getSharedPrefs() {
        return (android.content.SharedPreferences) this.sharedPrefs.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:27:0x006d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @Override // androidx.datastore.core.DataMigration
    public java.lang.Object shouldMigrate(T t, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        androidx.datastore.migrations.SharedPreferencesMigration.C03011 c03011;
        androidx.datastore.migrations.SharedPreferencesMigration<T> sharedPreferencesMigration;
        if (continuation instanceof androidx.datastore.migrations.SharedPreferencesMigration.C03011) {
            c03011 = (androidx.datastore.migrations.SharedPreferencesMigration.C03011) continuation;
            if ((c03011.label & Integer.MIN_VALUE) != 0) {
                c03011.label -= Integer.MIN_VALUE;
            } else {
                c03011 = new androidx.datastore.migrations.SharedPreferencesMigration.C03011(this, continuation);
            }
        } else {
            c03011 = new androidx.datastore.migrations.SharedPreferencesMigration.C03011(this, continuation);
        }
        java.lang.Object objInvoke = c03011.result;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c03011.label;
        boolean z = true;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(objInvoke);
            kotlin.jvm.functions.Function2<T, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> function2 = this.shouldRunMigration;
            c03011.L$0 = this;
            c03011.label = 1;
            objInvoke = function2.invoke(t, c03011);
            if (objInvoke == coroutine_suspended) {
                return coroutine_suspended;
            }
            sharedPreferencesMigration = this;
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sharedPreferencesMigration = (androidx.datastore.migrations.SharedPreferencesMigration) c03011.L$0;
            kotlin.ResultKt.throwOnFailure(objInvoke);
        }
        if (!((java.lang.Boolean) objInvoke).booleanValue()) {
            return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false);
        }
        java.util.Set<java.lang.String> set = sharedPreferencesMigration.keySet;
        if (set == null) {
            java.util.Map<java.lang.String, ?> all = sharedPreferencesMigration.getSharedPrefs().getAll();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(all, "sharedPrefs.all");
            if (all.isEmpty()) {
                z = false;
            }
        } else {
            java.util.Set<java.lang.String> set2 = set;
            android.content.SharedPreferences sharedPrefs = sharedPreferencesMigration.getSharedPrefs();
            if ((set2 instanceof java.util.Collection) && set2.isEmpty()) {
                z = false;
            } else {
                java.util.Iterator<T> it = set2.iterator();
                while (it.hasNext()) {
                    if (sharedPrefs.contains((java.lang.String) it.next())) {
                    }
                }
                z = false;
            }
        }
        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(z);
    }

    @Override // androidx.datastore.core.DataMigration
    public java.lang.Object migrate(T t, kotlin.coroutines.Continuation<? super T> continuation) {
        return this.migrate.invoke(new androidx.datastore.migrations.SharedPreferencesView(getSharedPrefs(), this.keySet), t, continuation);
    }

    @Override // androidx.datastore.core.DataMigration
    public java.lang.Object cleanUp(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) throws java.io.IOException {
        android.content.Context context;
        java.lang.String str;
        android.content.SharedPreferences.Editor editorEdit = getSharedPrefs().edit();
        java.util.Set<java.lang.String> set = this.keySet;
        if (set == null) {
            editorEdit.clear();
        } else {
            java.util.Iterator<T> it = set.iterator();
            while (it.hasNext()) {
                editorEdit.remove((java.lang.String) it.next());
            }
        }
        if (!editorEdit.commit()) {
            throw new java.io.IOException("Unable to delete migrated keys from SharedPreferences.");
        }
        if (getSharedPrefs().getAll().isEmpty() && (context = this.context) != null && (str = this.name) != null) {
            deleteSharedPreferences(context, str);
        }
        java.util.Set<java.lang.String> set2 = this.keySet;
        if (set2 != null) {
            set2.clear();
        }
        return kotlin.Unit.INSTANCE;
    }

    private final void deleteSharedPreferences(android.content.Context context, java.lang.String name) {
        androidx.datastore.migrations.SharedPreferencesMigration.Api24Impl.deleteSharedPreferences(context, name);
    }

    private final java.io.File getSharedPrefsFile(android.content.Context context, java.lang.String name) {
        return new java.io.File(new java.io.File(context.getApplicationInfo().dataDir, "shared_prefs"), name + ".xml");
    }

    private final java.io.File getSharedPrefsBackup(java.io.File prefsFile) {
        return new java.io.File(prefsFile.getPath() + ".bak");
    }

    /* JADX INFO: compiled from: SharedPreferencesMigration.android.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\t"}, d2 = {"Landroidx/datastore/migrations/SharedPreferencesMigration$Api24Impl;", "", "()V", "deleteSharedPreferences", "", "context", "Landroid/content/Context;", "name", "", "datastore_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class Api24Impl {
        public static final androidx.datastore.migrations.SharedPreferencesMigration.Api24Impl INSTANCE = new androidx.datastore.migrations.SharedPreferencesMigration.Api24Impl();

        private Api24Impl() {
        }

        @kotlin.jvm.JvmStatic
        public static final boolean deleteSharedPreferences(android.content.Context context, java.lang.String name) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
            return context.deleteSharedPreferences(name);
        }
    }
}
