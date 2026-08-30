package com.google.protobuf;

/* JADX INFO: compiled from: AnyKt.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/google/protobuf/AnyKt;", "", "()V", "Dsl", "protobuf-kotlin-lite"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class AnyKt {
    public static final com.google.protobuf.AnyKt INSTANCE = new com.google.protobuf.AnyKt();

    /* JADX INFO: compiled from: AnyKt.kt */
    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0011\u001a\u00020\u0012H\u0001J\u0006\u0010\u0013\u001a\u00020\u0014J\u0006\u0010\u0015\u001a\u00020\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\u0005\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0017"}, d2 = {"Lcom/google/protobuf/AnyKt$Dsl;", "", "_builder", "Lcom/google/protobuf/Any$Builder;", "(Lcom/google/protobuf/Any$Builder;)V", "value", "", "typeUrl", "getTypeUrl", "()Ljava/lang/String;", "setTypeUrl", "(Ljava/lang/String;)V", "Lcom/google/protobuf/ByteString;", "getValue", "()Lcom/google/protobuf/ByteString;", "setValue", "(Lcom/google/protobuf/ByteString;)V", "_build", "Lcom/google/protobuf/Any;", "clearTypeUrl", "", "clearValue", "Companion", "protobuf-kotlin-lite"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Dsl {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final com.google.protobuf.AnyKt.Dsl.Companion INSTANCE = new com.google.protobuf.AnyKt.Dsl.Companion(null);
        private final com.google.protobuf.Any.Builder _builder;

        public /* synthetic */ Dsl(com.google.protobuf.Any.Builder builder, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        private Dsl(com.google.protobuf.Any.Builder builder) {
            this._builder = builder;
        }

        /* JADX INFO: compiled from: AnyKt.kt */
        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, d2 = {"Lcom/google/protobuf/AnyKt$Dsl$Companion;", "", "()V", "_create", "Lcom/google/protobuf/AnyKt$Dsl;", "builder", "Lcom/google/protobuf/Any$Builder;", "protobuf-kotlin-lite"}, k = 1, mv = {1, 6, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final /* synthetic */ com.google.protobuf.AnyKt.Dsl _create(com.google.protobuf.Any.Builder builder) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "builder");
                return new com.google.protobuf.AnyKt.Dsl(builder, null);
            }
        }

        public final /* synthetic */ com.google.protobuf.Any _build() {
            com.google.protobuf.Any anyBuild = this._builder.build();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(anyBuild, "_builder.build()");
            return anyBuild;
        }

        public final java.lang.String getTypeUrl() {
            java.lang.String typeUrl = this._builder.getTypeUrl();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(typeUrl, "_builder.getTypeUrl()");
            return typeUrl;
        }

        public final void setTypeUrl(java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setTypeUrl(value);
        }

        public final void clearTypeUrl() {
            this._builder.clearTypeUrl();
        }

        public final com.google.protobuf.ByteString getValue() {
            com.google.protobuf.ByteString value = this._builder.getValue();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(value, "_builder.getValue()");
            return value;
        }

        public final void setValue(com.google.protobuf.ByteString value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setValue(value);
        }

        public final void clearValue() {
            this._builder.clearValue();
        }
    }

    private AnyKt() {
    }
}
