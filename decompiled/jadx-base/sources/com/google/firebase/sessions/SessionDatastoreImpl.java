package com.google.firebase.sessions;

/* JADX INFO: compiled from: SessionDatastore.kt */
/* JADX INFO: loaded from: classes5.dex */
@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00142\u00020\u0001:\u0002\u0014\u0015B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\n\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\u0010\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\rH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/google/firebase/sessions/SessionDatastoreImpl;", "Lcom/google/firebase/sessions/SessionDatastore;", "appContext", "Landroid/content/Context;", "backgroundDispatcher", "Lkotlin/coroutines/CoroutineContext;", "(Landroid/content/Context;Lkotlin/coroutines/CoroutineContext;)V", "currentSessionFromDatastore", "Ljava/util/concurrent/atomic/AtomicReference;", "Lcom/google/firebase/sessions/FirebaseSessionsData;", "firebaseSessionDataFlow", "Lkotlinx/coroutines/flow/Flow;", "getCurrentSessionId", "", "mapSessionsData", "preferences", "Landroidx/datastore/preferences/core/Preferences;", "updateSessionId", "", com.unity3d.services.core.device.reader.JsonStorageKeyNames.SESSION_ID_KEY, "Companion", "FirebaseSessionDataKeys", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SessionDatastoreImpl implements com.google.firebase.sessions.SessionDatastore {
    private static final java.lang.String TAG = "FirebaseSessionsRepo";
    private final android.content.Context appContext;
    private final kotlin.coroutines.CoroutineContext backgroundDispatcher;
    private final java.util.concurrent.atomic.AtomicReference<com.google.firebase.sessions.FirebaseSessionsData> currentSessionFromDatastore;
    private final kotlinx.coroutines.flow.Flow<com.google.firebase.sessions.FirebaseSessionsData> firebaseSessionDataFlow;
    private static final com.google.firebase.sessions.SessionDatastoreImpl.Companion Companion = new com.google.firebase.sessions.SessionDatastoreImpl.Companion(null);
    private static final kotlin.properties.ReadOnlyProperty<android.content.Context, androidx.datastore.core.DataStore<androidx.datastore.preferences.core.Preferences>> dataStore$delegate = androidx.datastore.preferences.PreferenceDataStoreDelegateKt.preferencesDataStore$default(com.google.firebase.sessions.SessionDataStoreConfigs.INSTANCE.getSESSIONS_CONFIG_NAME(), new androidx.datastore.core.handlers.ReplaceFileCorruptionHandler(new kotlin.jvm.functions.Function1<androidx.datastore.core.CorruptionException, androidx.datastore.preferences.core.Preferences>() { // from class: com.google.firebase.sessions.SessionDatastoreImpl$Companion$dataStore$2
        @Override // kotlin.jvm.functions.Function1
        public final androidx.datastore.preferences.core.Preferences invoke(androidx.datastore.core.CorruptionException ex) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ex, "ex");
            android.util.Log.w("FirebaseSessionsRepo", "CorruptionException in sessions DataStore in " + com.google.firebase.sessions.ProcessDetailsProvider.INSTANCE.getProcessName$com_google_firebase_firebase_sessions() + '.', ex);
            return androidx.datastore.preferences.core.PreferencesFactory.createEmpty();
        }
    }), null, null, 12, null);

    @javax.inject.Inject
    public SessionDatastoreImpl(android.content.Context appContext, @com.google.firebase.annotations.concurrent.Background kotlin.coroutines.CoroutineContext backgroundDispatcher) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appContext, "appContext");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(backgroundDispatcher, "backgroundDispatcher");
        this.appContext = appContext;
        this.backgroundDispatcher = backgroundDispatcher;
        this.currentSessionFromDatastore = new java.util.concurrent.atomic.AtomicReference<>();
        final kotlinx.coroutines.flow.Flow flowM2834catch = kotlinx.coroutines.flow.FlowKt.m2834catch(Companion.getDataStore(appContext).getData(), new com.google.firebase.sessions.SessionDatastoreImpl$firebaseSessionDataFlow$1(null));
        this.firebaseSessionDataFlow = new kotlinx.coroutines.flow.Flow<com.google.firebase.sessions.FirebaseSessionsData>() { // from class: com.google.firebase.sessions.SessionDatastoreImpl$special$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super com.google.firebase.sessions.FirebaseSessionsData> flowCollector, kotlin.coroutines.Continuation continuation) {
                java.lang.Object objCollect = flowM2834catch.collect(new com.google.firebase.sessions.SessionDatastoreImpl$special$$inlined$map$1.AnonymousClass2(flowCollector, this), continuation);
                return objCollect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : kotlin.Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: com.google.firebase.sessions.SessionDatastoreImpl$special$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: Emitters.kt */
            @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 3, mv = {1, 8, 0}, xi = 48)
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
                final /* synthetic */ kotlinx.coroutines.flow.FlowCollector $this_unsafeFlow;
                final /* synthetic */ com.google.firebase.sessions.SessionDatastoreImpl this$0;

                /* JADX INFO: renamed from: com.google.firebase.sessions.SessionDatastoreImpl$special$$inlined$map$1$2$1, reason: invalid class name */
                /* JADX INFO: compiled from: Emitters.kt */
                @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.google.firebase.sessions.SessionDatastoreImpl$special$$inlined$map$1$2", f = "SessionDatastore.kt", i = {}, l = {223}, m = "emit", n = {}, s = {})
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                    java.lang.Object L$0;
                    int label;
                    /* synthetic */ java.lang.Object result;

                    public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return com.google.firebase.sessions.SessionDatastoreImpl$special$$inlined$map$1.AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector, com.google.firebase.sessions.SessionDatastoreImpl sessionDatastoreImpl) {
                    this.$this_unsafeFlow = flowCollector;
                    this.this$0 = sessionDatastoreImpl;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0014  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                    com.google.firebase.sessions.SessionDatastoreImpl$special$$inlined$map$1.AnonymousClass2.AnonymousClass1 anonymousClass1;
                    if (continuation instanceof com.google.firebase.sessions.SessionDatastoreImpl$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) {
                        anonymousClass1 = (com.google.firebase.sessions.SessionDatastoreImpl$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) continuation;
                        if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label -= Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new com.google.firebase.sessions.SessionDatastoreImpl$special$$inlined$map$1.AnonymousClass2.AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new com.google.firebase.sessions.SessionDatastoreImpl$special$$inlined$map$1.AnonymousClass2.AnonymousClass1(continuation);
                    }
                    java.lang.Object obj2 = anonymousClass1.result;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = anonymousClass1.label;
                    if (i == 0) {
                        kotlin.ResultKt.throwOnFailure(obj2);
                        kotlinx.coroutines.flow.FlowCollector flowCollector = this.$this_unsafeFlow;
                        com.google.firebase.sessions.FirebaseSessionsData firebaseSessionsDataMapSessionsData = this.this$0.mapSessionsData((androidx.datastore.preferences.core.Preferences) obj);
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(firebaseSessionsDataMapSessionsData, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj2);
                    }
                    return kotlin.Unit.INSTANCE;
                }
            }
        };
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(backgroundDispatcher), null, null, new com.google.firebase.sessions.SessionDatastoreImpl.AnonymousClass1(null), 3, null);
    }

    /* JADX INFO: compiled from: SessionDatastore.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/google/firebase/sessions/SessionDatastoreImpl$FirebaseSessionDataKeys;", "", "()V", "SESSION_ID", "Landroidx/datastore/preferences/core/Preferences$Key;", "", "getSESSION_ID", "()Landroidx/datastore/preferences/core/Preferences$Key;", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class FirebaseSessionDataKeys {
        public static final com.google.firebase.sessions.SessionDatastoreImpl.FirebaseSessionDataKeys INSTANCE = new com.google.firebase.sessions.SessionDatastoreImpl.FirebaseSessionDataKeys();
        private static final androidx.datastore.preferences.core.Preferences.Key<java.lang.String> SESSION_ID = androidx.datastore.preferences.core.PreferencesKeys.stringKey("session_id");

        private FirebaseSessionDataKeys() {
        }

        public final androidx.datastore.preferences.core.Preferences.Key<java.lang.String> getSESSION_ID() {
            return SESSION_ID;
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.sessions.SessionDatastoreImpl$1, reason: invalid class name */
    /* JADX INFO: compiled from: SessionDatastore.kt */
    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.google.firebase.sessions.SessionDatastoreImpl$1", f = "SessionDatastore.kt", i = {}, l = {88}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        int label;

        AnonymousClass1(kotlin.coroutines.Continuation<? super com.google.firebase.sessions.SessionDatastoreImpl.AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.google.firebase.sessions.SessionDatastoreImpl.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.google.firebase.sessions.SessionDatastoreImpl.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                kotlinx.coroutines.flow.Flow flow = com.google.firebase.sessions.SessionDatastoreImpl.this.firebaseSessionDataFlow;
                final com.google.firebase.sessions.SessionDatastoreImpl sessionDatastoreImpl = com.google.firebase.sessions.SessionDatastoreImpl.this;
                this.label = 1;
                if (flow.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.google.firebase.sessions.SessionDatastoreImpl.1.1
                    public final java.lang.Object emit(com.google.firebase.sessions.FirebaseSessionsData firebaseSessionsData, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                        sessionDatastoreImpl.currentSessionFromDatastore.set(firebaseSessionsData);
                        return kotlin.Unit.INSTANCE;
                    }

                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                        return emit((com.google.firebase.sessions.FirebaseSessionsData) obj2, (kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation);
                    }
                }, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            return kotlin.Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.sessions.SessionDatastoreImpl$updateSessionId$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: SessionDatastore.kt */
    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.google.firebase.sessions.SessionDatastoreImpl$updateSessionId$1", f = "SessionDatastore.kt", i = {}, l = {95}, m = "invokeSuspend", n = {}, s = {})
    static final class C15221 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ java.lang.String $sessionId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C15221(java.lang.String str, kotlin.coroutines.Continuation<? super com.google.firebase.sessions.SessionDatastoreImpl.C15221> continuation) {
            super(2, continuation);
            this.$sessionId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.google.firebase.sessions.SessionDatastoreImpl.this.new C15221(this.$sessionId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.google.firebase.sessions.SessionDatastoreImpl.C15221) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    this.label = 1;
                    if (androidx.datastore.preferences.core.PreferencesKt.edit(com.google.firebase.sessions.SessionDatastoreImpl.Companion.getDataStore(com.google.firebase.sessions.SessionDatastoreImpl.this.appContext), new com.google.firebase.sessions.SessionDatastoreImpl.C15221.C02021(this.$sessionId, null), this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
            } catch (java.io.IOException e) {
                android.util.Log.w(com.google.firebase.sessions.SessionDatastoreImpl.TAG, "Failed to update session Id: " + e);
            }
            return kotlin.Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: com.google.firebase.sessions.SessionDatastoreImpl$updateSessionId$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: SessionDatastore.kt */
        @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "preferences", "Landroidx/datastore/preferences/core/MutablePreferences;"}, k = 3, mv = {1, 8, 0}, xi = 48)
        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.google.firebase.sessions.SessionDatastoreImpl$updateSessionId$1$1", f = "SessionDatastore.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class C02021 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<androidx.datastore.preferences.core.MutablePreferences, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
            final /* synthetic */ java.lang.String $sessionId;
            /* synthetic */ java.lang.Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C02021(java.lang.String str, kotlin.coroutines.Continuation<? super com.google.firebase.sessions.SessionDatastoreImpl.C15221.C02021> continuation) {
                super(2, continuation);
                this.$sessionId = str;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                com.google.firebase.sessions.SessionDatastoreImpl.C15221.C02021 c02021 = new com.google.firebase.sessions.SessionDatastoreImpl.C15221.C02021(this.$sessionId, continuation);
                c02021.L$0 = obj;
                return c02021;
            }

            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(androidx.datastore.preferences.core.MutablePreferences mutablePreferences, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                return ((com.google.firebase.sessions.SessionDatastoreImpl.C15221.C02021) create(mutablePreferences, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                ((androidx.datastore.preferences.core.MutablePreferences) this.L$0).set(com.google.firebase.sessions.SessionDatastoreImpl.FirebaseSessionDataKeys.INSTANCE.getSESSION_ID(), this.$sessionId);
                return kotlin.Unit.INSTANCE;
            }
        }
    }

    @Override // com.google.firebase.sessions.SessionDatastore
    public void updateSessionId(java.lang.String sessionId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(this.backgroundDispatcher), null, null, new com.google.firebase.sessions.SessionDatastoreImpl.C15221(sessionId, null), 3, null);
    }

    @Override // com.google.firebase.sessions.SessionDatastore
    public java.lang.String getCurrentSessionId() {
        com.google.firebase.sessions.FirebaseSessionsData firebaseSessionsData = this.currentSessionFromDatastore.get();
        if (firebaseSessionsData != null) {
            return firebaseSessionsData.getSessionId();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.google.firebase.sessions.FirebaseSessionsData mapSessionsData(androidx.datastore.preferences.core.Preferences preferences) {
        return new com.google.firebase.sessions.FirebaseSessionsData((java.lang.String) preferences.get(com.google.firebase.sessions.SessionDatastoreImpl.FirebaseSessionDataKeys.INSTANCE.getSESSION_ID()));
    }

    /* JADX INFO: compiled from: SessionDatastore.kt */
    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R%\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006*\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/google/firebase/sessions/SessionDatastoreImpl$Companion;", "", "()V", "TAG", "", "dataStore", "Landroidx/datastore/core/DataStore;", "Landroidx/datastore/preferences/core/Preferences;", "Landroid/content/Context;", "getDataStore", "(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", "dataStore$delegate", "Lkotlin/properties/ReadOnlyProperty;", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class Companion {
        static final /* synthetic */ kotlin.reflect.KProperty<java.lang.Object>[] $$delegatedProperties = {kotlin.jvm.internal.Reflection.property2(new kotlin.jvm.internal.PropertyReference2Impl(com.google.firebase.sessions.SessionDatastoreImpl.Companion.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0))};

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final androidx.datastore.core.DataStore<androidx.datastore.preferences.core.Preferences> getDataStore(android.content.Context context) {
            return (androidx.datastore.core.DataStore) com.google.firebase.sessions.SessionDatastoreImpl.dataStore$delegate.getValue(context, $$delegatedProperties[0]);
        }
    }
}
