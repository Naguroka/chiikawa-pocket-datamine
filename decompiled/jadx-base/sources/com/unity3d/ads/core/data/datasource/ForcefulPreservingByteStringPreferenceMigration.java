package com.unity3d.ads.core.data.datasource;

/* JADX INFO: compiled from: ForcefulPreservingByteStringPreferenceMigration.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0011\u0010\u000b\u001a\u00020\fH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\rJ\u0019\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0010J\u0019\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0010R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"Lcom/unity3d/ads/core/data/datasource/ForcefulPreservingByteStringPreferenceMigration;", "Landroidx/datastore/core/DataMigration;", "Lcom/unity3d/ads/datastore/ByteStringStoreOuterClass$ByteStringStore;", "context", "Landroid/content/Context;", "name", "", com.ironsource.y8.h.W, "getByteStringData", "Lcom/unity3d/ads/core/data/datasource/GetByteStringData;", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/unity3d/ads/core/data/datasource/GetByteStringData;)V", "cleanUp", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "migrate", "currentData", "(Lcom/unity3d/ads/datastore/ByteStringStoreOuterClass$ByteStringStore;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "shouldMigrate", "", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ForcefulPreservingByteStringPreferenceMigration implements androidx.datastore.core.DataMigration<com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore> {
    private final android.content.Context context;
    private final com.unity3d.ads.core.data.datasource.GetByteStringData getByteStringData;
    private final java.lang.String key;
    private final java.lang.String name;

    public ForcefulPreservingByteStringPreferenceMigration(android.content.Context context, java.lang.String name, java.lang.String key, com.unity3d.ads.core.data.datasource.GetByteStringData getByteStringData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getByteStringData, "getByteStringData");
        this.context = context;
        this.name = name;
        this.key = key;
        this.getByteStringData = getByteStringData;
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
        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true);
    }

    @Override // androidx.datastore.core.DataMigration
    public java.lang.Object migrate(com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore byteStringStore, kotlin.coroutines.Continuation<? super com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore> continuation) {
        java.lang.String string = this.context.getSharedPreferences(this.name, 0).getString(this.key, null);
        java.lang.String str = string;
        if (str == null || str.length() == 0) {
            return byteStringStore;
        }
        com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore byteStringStoreBuild = com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore.newBuilder().setData(this.getByteStringData.invoke(string)).build();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(byteStringStoreBuild, "newBuilder()\n           …\n                .build()");
        return byteStringStoreBuild;
    }
}
