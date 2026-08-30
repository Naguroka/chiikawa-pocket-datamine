package com.unity3d.ads.datastore;

/* JADX INFO: compiled from: ByteStringStoreKt.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/unity3d/ads/datastore/ByteStringStoreKt;", "", "()V", "Dsl", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ByteStringStoreKt {
    public static final com.unity3d.ads.datastore.ByteStringStoreKt INSTANCE = new com.unity3d.ads.datastore.ByteStringStoreKt();

    /* JADX INFO: compiled from: ByteStringStoreKt.kt */
    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\f\u001a\u00020\rH\u0001J\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u0011"}, d2 = {"Lcom/unity3d/ads/datastore/ByteStringStoreKt$Dsl;", "", "_builder", "Lcom/unity3d/ads/datastore/ByteStringStoreOuterClass$ByteStringStore$Builder;", "(Lcom/unity3d/ads/datastore/ByteStringStoreOuterClass$ByteStringStore$Builder;)V", "value", "Lcom/google/protobuf/ByteString;", "data", "getData", "()Lcom/google/protobuf/ByteString;", "setData", "(Lcom/google/protobuf/ByteString;)V", "_build", "Lcom/unity3d/ads/datastore/ByteStringStoreOuterClass$ByteStringStore;", "clearData", "", "Companion", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Dsl {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final com.unity3d.ads.datastore.ByteStringStoreKt.Dsl.Companion INSTANCE = new com.unity3d.ads.datastore.ByteStringStoreKt.Dsl.Companion(null);
        private final com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore.Builder _builder;

        public /* synthetic */ Dsl(com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore.Builder builder, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        private Dsl(com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore.Builder builder) {
            this._builder = builder;
        }

        /* JADX INFO: compiled from: ByteStringStoreKt.kt */
        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, d2 = {"Lcom/unity3d/ads/datastore/ByteStringStoreKt$Dsl$Companion;", "", "()V", "_create", "Lcom/unity3d/ads/datastore/ByteStringStoreKt$Dsl;", "builder", "Lcom/unity3d/ads/datastore/ByteStringStoreOuterClass$ByteStringStore$Builder;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final /* synthetic */ com.unity3d.ads.datastore.ByteStringStoreKt.Dsl _create(com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore.Builder builder) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "builder");
                return new com.unity3d.ads.datastore.ByteStringStoreKt.Dsl(builder, null);
            }
        }

        public final /* synthetic */ com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore _build() {
            com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore byteStringStoreBuild = this._builder.build();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(byteStringStoreBuild, "_builder.build()");
            return byteStringStoreBuild;
        }

        public final com.google.protobuf.ByteString getData() {
            com.google.protobuf.ByteString data = this._builder.getData();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(data, "_builder.getData()");
            return data;
        }

        public final void setData(com.google.protobuf.ByteString value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setData(value);
        }

        public final void clearData() {
            this._builder.clearData();
        }
    }

    private ByteStringStoreKt() {
    }
}
