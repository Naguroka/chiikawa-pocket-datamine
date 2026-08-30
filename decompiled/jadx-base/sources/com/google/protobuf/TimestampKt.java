package com.google.protobuf;

/* JADX INFO: compiled from: TimestampKt.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/google/protobuf/TimestampKt;", "", "()V", "Dsl", "protobuf-kotlin-lite"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class TimestampKt {
    public static final com.google.protobuf.TimestampKt INSTANCE = new com.google.protobuf.TimestampKt();

    /* JADX INFO: compiled from: TimestampKt.kt */
    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0012\u001a\u00020\u0013H\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\u0006\u0010\u0016\u001a\u00020\u0015R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0018"}, d2 = {"Lcom/google/protobuf/TimestampKt$Dsl;", "", "_builder", "Lcom/google/protobuf/Timestamp$Builder;", "(Lcom/google/protobuf/Timestamp$Builder;)V", "value", "", "nanos", "getNanos", "()I", "setNanos", "(I)V", "", "seconds", "getSeconds", "()J", "setSeconds", "(J)V", "_build", "Lcom/google/protobuf/Timestamp;", "clearNanos", "", "clearSeconds", "Companion", "protobuf-kotlin-lite"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Dsl {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final com.google.protobuf.TimestampKt.Dsl.Companion INSTANCE = new com.google.protobuf.TimestampKt.Dsl.Companion(null);
        private final com.google.protobuf.Timestamp.Builder _builder;

        public /* synthetic */ Dsl(com.google.protobuf.Timestamp.Builder builder, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        private Dsl(com.google.protobuf.Timestamp.Builder builder) {
            this._builder = builder;
        }

        /* JADX INFO: compiled from: TimestampKt.kt */
        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, d2 = {"Lcom/google/protobuf/TimestampKt$Dsl$Companion;", "", "()V", "_create", "Lcom/google/protobuf/TimestampKt$Dsl;", "builder", "Lcom/google/protobuf/Timestamp$Builder;", "protobuf-kotlin-lite"}, k = 1, mv = {1, 6, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final /* synthetic */ com.google.protobuf.TimestampKt.Dsl _create(com.google.protobuf.Timestamp.Builder builder) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "builder");
                return new com.google.protobuf.TimestampKt.Dsl(builder, null);
            }
        }

        public final /* synthetic */ com.google.protobuf.Timestamp _build() {
            com.google.protobuf.Timestamp timestampBuild = this._builder.build();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(timestampBuild, "_builder.build()");
            return timestampBuild;
        }

        public final long getSeconds() {
            return this._builder.getSeconds();
        }

        public final void setSeconds(long j) {
            this._builder.setSeconds(j);
        }

        public final void clearSeconds() {
            this._builder.clearSeconds();
        }

        public final int getNanos() {
            return this._builder.getNanos();
        }

        public final void setNanos(int i) {
            this._builder.setNanos(i);
        }

        public final void clearNanos() {
            this._builder.clearNanos();
        }
    }

    private TimestampKt() {
    }
}
