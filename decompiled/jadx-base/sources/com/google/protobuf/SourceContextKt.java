package com.google.protobuf;

/* JADX INFO: compiled from: SourceContextKt.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/google/protobuf/SourceContextKt;", "", "()V", "Dsl", "protobuf-kotlin-lite"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class SourceContextKt {
    public static final com.google.protobuf.SourceContextKt INSTANCE = new com.google.protobuf.SourceContextKt();

    /* JADX INFO: compiled from: SourceContextKt.kt */
    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\f\u001a\u00020\rH\u0001J\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u0011"}, d2 = {"Lcom/google/protobuf/SourceContextKt$Dsl;", "", "_builder", "Lcom/google/protobuf/SourceContext$Builder;", "(Lcom/google/protobuf/SourceContext$Builder;)V", "value", "", com.ironsource.rc.c.b, "getFileName", "()Ljava/lang/String;", "setFileName", "(Ljava/lang/String;)V", "_build", "Lcom/google/protobuf/SourceContext;", "clearFileName", "", "Companion", "protobuf-kotlin-lite"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Dsl {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final com.google.protobuf.SourceContextKt.Dsl.Companion INSTANCE = new com.google.protobuf.SourceContextKt.Dsl.Companion(null);
        private final com.google.protobuf.SourceContext.Builder _builder;

        public /* synthetic */ Dsl(com.google.protobuf.SourceContext.Builder builder, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        private Dsl(com.google.protobuf.SourceContext.Builder builder) {
            this._builder = builder;
        }

        /* JADX INFO: compiled from: SourceContextKt.kt */
        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, d2 = {"Lcom/google/protobuf/SourceContextKt$Dsl$Companion;", "", "()V", "_create", "Lcom/google/protobuf/SourceContextKt$Dsl;", "builder", "Lcom/google/protobuf/SourceContext$Builder;", "protobuf-kotlin-lite"}, k = 1, mv = {1, 6, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final /* synthetic */ com.google.protobuf.SourceContextKt.Dsl _create(com.google.protobuf.SourceContext.Builder builder) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "builder");
                return new com.google.protobuf.SourceContextKt.Dsl(builder, null);
            }
        }

        public final /* synthetic */ com.google.protobuf.SourceContext _build() {
            com.google.protobuf.SourceContext sourceContextBuild = this._builder.build();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sourceContextBuild, "_builder.build()");
            return sourceContextBuild;
        }

        public final java.lang.String getFileName() {
            java.lang.String fileName = this._builder.getFileName();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(fileName, "_builder.getFileName()");
            return fileName;
        }

        public final void setFileName(java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setFileName(value);
        }

        public final void clearFileName() {
            this._builder.clearFileName();
        }
    }

    private SourceContextKt() {
    }
}
