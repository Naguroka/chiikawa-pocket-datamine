package com.google.protobuf;

/* JADX INFO: compiled from: EmptyKt.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/google/protobuf/EmptyKt;", "", "()V", "Dsl", "protobuf-kotlin-lite"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class EmptyKt {
    public static final com.google.protobuf.EmptyKt INSTANCE = new com.google.protobuf.EmptyKt();

    /* JADX INFO: compiled from: EmptyKt.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/google/protobuf/EmptyKt$Dsl;", "", "_builder", "Lcom/google/protobuf/Empty$Builder;", "(Lcom/google/protobuf/Empty$Builder;)V", "_build", "Lcom/google/protobuf/Empty;", "Companion", "protobuf-kotlin-lite"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Dsl {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final com.google.protobuf.EmptyKt.Dsl.Companion INSTANCE = new com.google.protobuf.EmptyKt.Dsl.Companion(null);
        private final com.google.protobuf.Empty.Builder _builder;

        public /* synthetic */ Dsl(com.google.protobuf.Empty.Builder builder, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        private Dsl(com.google.protobuf.Empty.Builder builder) {
            this._builder = builder;
        }

        /* JADX INFO: compiled from: EmptyKt.kt */
        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, d2 = {"Lcom/google/protobuf/EmptyKt$Dsl$Companion;", "", "()V", "_create", "Lcom/google/protobuf/EmptyKt$Dsl;", "builder", "Lcom/google/protobuf/Empty$Builder;", "protobuf-kotlin-lite"}, k = 1, mv = {1, 6, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final /* synthetic */ com.google.protobuf.EmptyKt.Dsl _create(com.google.protobuf.Empty.Builder builder) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "builder");
                return new com.google.protobuf.EmptyKt.Dsl(builder, null);
            }
        }

        public final /* synthetic */ com.google.protobuf.Empty _build() {
            com.google.protobuf.Empty emptyBuild = this._builder.build();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(emptyBuild, "_builder.build()");
            return emptyBuild;
        }
    }

    private EmptyKt() {
    }
}
