package com.unity3d.ads.datastore;

/* JADX INFO: compiled from: ByteStringStoreKt.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a*\u0010\u0000\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0087\bø\u0001\u0000¢\u0006\u0002\b\u0007\u001a)\u0010\b\u001a\u00020\u0001*\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\t"}, d2 = {"byteStringStore", "Lcom/unity3d/ads/datastore/ByteStringStoreOuterClass$ByteStringStore;", "block", "Lkotlin/Function1;", "Lcom/unity3d/ads/datastore/ByteStringStoreKt$Dsl;", "", "Lkotlin/ExtensionFunctionType;", "-initializebyteStringStore", "copy", "unity-ads_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ByteStringStoreKtKt {
    /* JADX INFO: renamed from: -initializebyteStringStore, reason: not valid java name */
    public static final com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore m1116initializebyteStringStore(kotlin.jvm.functions.Function1<? super com.unity3d.ads.datastore.ByteStringStoreKt.Dsl, kotlin.Unit> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        com.unity3d.ads.datastore.ByteStringStoreKt.Dsl.Companion companion = com.unity3d.ads.datastore.ByteStringStoreKt.Dsl.INSTANCE;
        com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore.Builder builderNewBuilder = com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore.newBuilder();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        com.unity3d.ads.datastore.ByteStringStoreKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore copy(com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore byteStringStore, kotlin.jvm.functions.Function1<? super com.unity3d.ads.datastore.ByteStringStoreKt.Dsl, kotlin.Unit> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteStringStore, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        com.unity3d.ads.datastore.ByteStringStoreKt.Dsl.Companion companion = com.unity3d.ads.datastore.ByteStringStoreKt.Dsl.INSTANCE;
        com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore.Builder builder = byteStringStore.toBuilder();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(builder, "this.toBuilder()");
        com.unity3d.ads.datastore.ByteStringStoreKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }
}
