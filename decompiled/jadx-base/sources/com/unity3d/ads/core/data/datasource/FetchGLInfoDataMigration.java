package com.unity3d.ads.core.data.datasource;

/* JADX INFO: compiled from: FetchGLInfoDataMigration.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0011\u0010\u0006\u001a\u00020\u0007H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0002J\u0019\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\rJ\u0019\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\rR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"Lcom/unity3d/ads/core/data/datasource/FetchGLInfoDataMigration;", "Landroidx/datastore/core/DataMigration;", "Lcom/unity3d/ads/datastore/ByteStringStoreOuterClass$ByteStringStore;", "getOpenGLRendererInfo", "Lcom/unity3d/ads/core/domain/GetOpenGLRendererInfo;", "(Lcom/unity3d/ads/core/domain/GetOpenGLRendererInfo;)V", "cleanUp", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "gatherOpenGLRendererInfo", "Lcom/google/protobuf/ByteString;", "migrate", "currentData", "(Lcom/unity3d/ads/datastore/ByteStringStoreOuterClass$ByteStringStore;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "shouldMigrate", "", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class FetchGLInfoDataMigration implements androidx.datastore.core.DataMigration<com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore> {
    private final com.unity3d.ads.core.domain.GetOpenGLRendererInfo getOpenGLRendererInfo;

    public FetchGLInfoDataMigration(com.unity3d.ads.core.domain.GetOpenGLRendererInfo getOpenGLRendererInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getOpenGLRendererInfo, "getOpenGLRendererInfo");
        this.getOpenGLRendererInfo = getOpenGLRendererInfo;
    }

    @Override // androidx.datastore.core.DataMigration
    public /* bridge */ /* synthetic */ java.lang.Object shouldMigrate(com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore byteStringStore, kotlin.coroutines.Continuation continuation) {
        return shouldMigrate2(byteStringStore, (kotlin.coroutines.Continuation<? super java.lang.Boolean>) continuation);
    }

    @Override // androidx.datastore.core.DataMigration
    public java.lang.Object cleanUp(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: shouldMigrate, reason: avoid collision after fix types in other method */
    public java.lang.Object shouldMigrate2(com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore byteStringStore, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(byteStringStore.getData().isEmpty());
    }

    @Override // androidx.datastore.core.DataMigration
    public java.lang.Object migrate(com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore byteStringStore, kotlin.coroutines.Continuation<? super com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore> continuation) {
        com.google.protobuf.ByteString byteStringGatherOpenGLRendererInfo;
        try {
            byteStringGatherOpenGLRendererInfo = gatherOpenGLRendererInfo();
        } catch (java.lang.Exception unused) {
            byteStringGatherOpenGLRendererInfo = com.google.protobuf.ByteString.EMPTY;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(byteStringGatherOpenGLRendererInfo, "{\n            ByteString.EMPTY\n        }");
        }
        com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore byteStringStoreBuild = com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore.newBuilder().setData(byteStringGatherOpenGLRendererInfo).build();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(byteStringStoreBuild, "newBuilder()\n           …rer)\n            .build()");
        return byteStringStoreBuild;
    }

    private final com.google.protobuf.ByteString gatherOpenGLRendererInfo() {
        return this.getOpenGLRendererInfo.invoke();
    }
}
