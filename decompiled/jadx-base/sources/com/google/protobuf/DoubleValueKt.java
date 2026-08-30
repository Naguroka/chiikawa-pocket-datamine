package com.google.protobuf;

/* JADX INFO: compiled from: DoubleValueKt.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/google/protobuf/DoubleValueKt;", "", "()V", "Dsl", "protobuf-kotlin-lite"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class DoubleValueKt {
    public static final com.google.protobuf.DoubleValueKt INSTANCE = new com.google.protobuf.DoubleValueKt();

    /* JADX INFO: compiled from: DoubleValueKt.kt */
    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u000b\u001a\u00020\fH\u0001J\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u0010"}, d2 = {"Lcom/google/protobuf/DoubleValueKt$Dsl;", "", "_builder", "Lcom/google/protobuf/DoubleValue$Builder;", "(Lcom/google/protobuf/DoubleValue$Builder;)V", "value", "", "getValue", "()D", "setValue", "(D)V", "_build", "Lcom/google/protobuf/DoubleValue;", "clearValue", "", "Companion", "protobuf-kotlin-lite"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Dsl {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final com.google.protobuf.DoubleValueKt.Dsl.Companion INSTANCE = new com.google.protobuf.DoubleValueKt.Dsl.Companion(null);
        private final com.google.protobuf.DoubleValue.Builder _builder;

        public /* synthetic */ Dsl(com.google.protobuf.DoubleValue.Builder builder, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        private Dsl(com.google.protobuf.DoubleValue.Builder builder) {
            this._builder = builder;
        }

        /* JADX INFO: compiled from: DoubleValueKt.kt */
        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, d2 = {"Lcom/google/protobuf/DoubleValueKt$Dsl$Companion;", "", "()V", "_create", "Lcom/google/protobuf/DoubleValueKt$Dsl;", "builder", "Lcom/google/protobuf/DoubleValue$Builder;", "protobuf-kotlin-lite"}, k = 1, mv = {1, 6, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final /* synthetic */ com.google.protobuf.DoubleValueKt.Dsl _create(com.google.protobuf.DoubleValue.Builder builder) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "builder");
                return new com.google.protobuf.DoubleValueKt.Dsl(builder, null);
            }
        }

        public final /* synthetic */ com.google.protobuf.DoubleValue _build() {
            com.google.protobuf.DoubleValue doubleValueBuild = this._builder.build();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(doubleValueBuild, "_builder.build()");
            return doubleValueBuild;
        }

        public final double getValue() {
            return this._builder.getValue();
        }

        public final void setValue(double d) {
            this._builder.setValue(d);
        }

        public final void clearValue() {
            this._builder.clearValue();
        }
    }

    private DoubleValueKt() {
    }
}
