package com.unity3d.ads.core.data.datasource;

/* JADX INFO: compiled from: UniversalRequestDataSource.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u0011\u0010\u0006\u001a\u00020\u0004H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0007J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\fJ!\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0010R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Lcom/unity3d/ads/core/data/datasource/UniversalRequestDataSource;", "", "universalRequestStore", "Landroidx/datastore/core/DataStore;", "Lcom/unity3d/ads/datastore/UniversalRequestStoreOuterClass$UniversalRequestStore;", "(Landroidx/datastore/core/DataStore;)V", "get", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "remove", "", com.ironsource.y8.h.W, "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "set", "data", "Lcom/google/protobuf/ByteString;", "(Ljava/lang/String;Lcom/google/protobuf/ByteString;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class UniversalRequestDataSource {
    private final androidx.datastore.core.DataStore<com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore> universalRequestStore;

    public UniversalRequestDataSource(androidx.datastore.core.DataStore<com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore> universalRequestStore) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(universalRequestStore, "universalRequestStore");
        this.universalRequestStore = universalRequestStore;
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.datasource.UniversalRequestDataSource$get$2, reason: invalid class name */
    /* JADX INFO: compiled from: UniversalRequestDataSource.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/unity3d/ads/datastore/UniversalRequestStoreOuterClass$UniversalRequestStore;", "exception", ""}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.data.datasource.UniversalRequestDataSource$get$2", f = "UniversalRequestDataSource.kt", i = {}, l = {16}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.FlowCollector<? super com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore>, java.lang.Throwable, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        private /* synthetic */ java.lang.Object L$0;
        /* synthetic */ java.lang.Object L$1;
        int label;

        AnonymousClass2(kotlin.coroutines.Continuation<? super com.unity3d.ads.core.data.datasource.UniversalRequestDataSource.AnonymousClass2> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        public final java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore> flowCollector, java.lang.Throwable th, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            com.unity3d.ads.core.data.datasource.UniversalRequestDataSource.AnonymousClass2 anonymousClass2 = new com.unity3d.ads.core.data.datasource.UniversalRequestDataSource.AnonymousClass2(continuation);
            anonymousClass2.L$0 = flowCollector;
            anonymousClass2.L$1 = th;
            return anonymousClass2.invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) throws java.lang.Throwable {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                kotlinx.coroutines.flow.FlowCollector flowCollector = (kotlinx.coroutines.flow.FlowCollector) this.L$0;
                java.lang.Throwable th = (java.lang.Throwable) this.L$1;
                if (th instanceof androidx.datastore.core.CorruptionException) {
                    com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore defaultInstance = com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore.getDefaultInstance();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(defaultInstance, "getDefaultInstance()");
                    this.L$0 = null;
                    this.label = 1;
                    if (flowCollector.emit(defaultInstance, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    throw th;
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

    public final java.lang.Object get(kotlin.coroutines.Continuation<? super com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore> continuation) {
        return kotlinx.coroutines.flow.FlowKt.first(kotlinx.coroutines.flow.FlowKt.m2834catch(this.universalRequestStore.getData(), new com.unity3d.ads.core.data.datasource.UniversalRequestDataSource.AnonymousClass2(null)), continuation);
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.datasource.UniversalRequestDataSource$set$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: UniversalRequestDataSource.kt */
    @kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/datastore/UniversalRequestStoreOuterClass$UniversalRequestStore;", "currentData"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.data.datasource.UniversalRequestDataSource$set$2", f = "UniversalRequestDataSource.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class C16372 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore, kotlin.coroutines.Continuation<? super com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore>, java.lang.Object> {
        final /* synthetic */ com.google.protobuf.ByteString $data;
        final /* synthetic */ java.lang.String $key;
        /* synthetic */ java.lang.Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C16372(java.lang.String str, com.google.protobuf.ByteString byteString, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.data.datasource.UniversalRequestDataSource.C16372> continuation) {
            super(2, continuation);
            this.$key = str;
            this.$data = byteString;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.unity3d.ads.core.data.datasource.UniversalRequestDataSource.C16372 c16372 = new com.unity3d.ads.core.data.datasource.UniversalRequestDataSource.C16372(this.$key, this.$data, continuation);
            c16372.L$0 = obj;
            return c16372;
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore universalRequestStore, kotlin.coroutines.Continuation<? super com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore> continuation) {
            return ((com.unity3d.ads.core.data.datasource.UniversalRequestDataSource.C16372) create(universalRequestStore, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore.Builder builder = ((com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore) this.L$0).toBuilder();
            builder.putUniversalRequestMap(this.$key, this.$data);
            com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore universalRequestStoreBuild = builder.build();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(universalRequestStoreBuild, "dataBuilder.build()");
            return universalRequestStoreBuild;
        }
    }

    public final java.lang.Object set(java.lang.String str, com.google.protobuf.ByteString byteString, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object objUpdateData = this.universalRequestStore.updateData(new com.unity3d.ads.core.data.datasource.UniversalRequestDataSource.C16372(str, byteString, null), continuation);
        return objUpdateData == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objUpdateData : kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.datasource.UniversalRequestDataSource$remove$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: UniversalRequestDataSource.kt */
    @kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/datastore/UniversalRequestStoreOuterClass$UniversalRequestStore;", "currentData"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.data.datasource.UniversalRequestDataSource$remove$2", f = "UniversalRequestDataSource.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class C16362 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore, kotlin.coroutines.Continuation<? super com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore>, java.lang.Object> {
        final /* synthetic */ java.lang.String $key;
        /* synthetic */ java.lang.Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C16362(java.lang.String str, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.data.datasource.UniversalRequestDataSource.C16362> continuation) {
            super(2, continuation);
            this.$key = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.unity3d.ads.core.data.datasource.UniversalRequestDataSource.C16362 c16362 = new com.unity3d.ads.core.data.datasource.UniversalRequestDataSource.C16362(this.$key, continuation);
            c16362.L$0 = obj;
            return c16362;
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore universalRequestStore, kotlin.coroutines.Continuation<? super com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore> continuation) {
            return ((com.unity3d.ads.core.data.datasource.UniversalRequestDataSource.C16362) create(universalRequestStore, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore.Builder builder = ((com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore) this.L$0).toBuilder();
            builder.removeUniversalRequestMap(this.$key);
            com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore universalRequestStoreBuild = builder.build();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(universalRequestStoreBuild, "dataBuilder.build()");
            return universalRequestStoreBuild;
        }
    }

    public final java.lang.Object remove(java.lang.String str, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object objUpdateData = this.universalRequestStore.updateData(new com.unity3d.ads.core.data.datasource.UniversalRequestDataSource.C16362(str, null), continuation);
        return objUpdateData == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objUpdateData : kotlin.Unit.INSTANCE;
    }
}
