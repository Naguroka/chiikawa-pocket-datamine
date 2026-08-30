package gatewayprotocol.v1;

/* JADX INFO: compiled from: TimestampsKt.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lgatewayprotocol/v1/TimestampsKt;", "", "()V", "Dsl", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TimestampsKt {
    public static final gatewayprotocol.v1.TimestampsKt INSTANCE = new gatewayprotocol.v1.TimestampsKt();

    /* JADX INFO: compiled from: TimestampsKt.kt */
    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0012\u001a\u00020\u0013H\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\u0006\u0010\u0016\u001a\u00020\u0015J\u0006\u0010\u0017\u001a\u00020\u0018R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u001a"}, d2 = {"Lgatewayprotocol/v1/TimestampsKt$Dsl;", "", "_builder", "Lgatewayprotocol/v1/TimestampsOuterClass$Timestamps$Builder;", "(Lgatewayprotocol/v1/TimestampsOuterClass$Timestamps$Builder;)V", "value", "", "sessionTimestamp", "getSessionTimestamp", "()J", "setSessionTimestamp", "(J)V", "Lcom/google/protobuf/Timestamp;", com.ironsource.aa.a.d, "getTimestamp", "()Lcom/google/protobuf/Timestamp;", "setTimestamp", "(Lcom/google/protobuf/Timestamp;)V", "_build", "Lgatewayprotocol/v1/TimestampsOuterClass$Timestamps;", "clearSessionTimestamp", "", "clearTimestamp", "hasTimestamp", "", "Companion", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Dsl {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final gatewayprotocol.v1.TimestampsKt.Dsl.Companion INSTANCE = new gatewayprotocol.v1.TimestampsKt.Dsl.Companion(null);
        private final gatewayprotocol.v1.TimestampsOuterClass.Timestamps.Builder _builder;

        public /* synthetic */ Dsl(gatewayprotocol.v1.TimestampsOuterClass.Timestamps.Builder builder, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        private Dsl(gatewayprotocol.v1.TimestampsOuterClass.Timestamps.Builder builder) {
            this._builder = builder;
        }

        /* JADX INFO: compiled from: TimestampsKt.kt */
        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, d2 = {"Lgatewayprotocol/v1/TimestampsKt$Dsl$Companion;", "", "()V", "_create", "Lgatewayprotocol/v1/TimestampsKt$Dsl;", "builder", "Lgatewayprotocol/v1/TimestampsOuterClass$Timestamps$Builder;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final /* synthetic */ gatewayprotocol.v1.TimestampsKt.Dsl _create(gatewayprotocol.v1.TimestampsOuterClass.Timestamps.Builder builder) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "builder");
                return new gatewayprotocol.v1.TimestampsKt.Dsl(builder, null);
            }
        }

        public final /* synthetic */ gatewayprotocol.v1.TimestampsOuterClass.Timestamps _build() {
            gatewayprotocol.v1.TimestampsOuterClass.Timestamps timestampsBuild = this._builder.build();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(timestampsBuild, "_builder.build()");
            return timestampsBuild;
        }

        public final com.google.protobuf.Timestamp getTimestamp() {
            com.google.protobuf.Timestamp timestamp = this._builder.getTimestamp();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(timestamp, "_builder.getTimestamp()");
            return timestamp;
        }

        public final void setTimestamp(com.google.protobuf.Timestamp value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setTimestamp(value);
        }

        public final void clearTimestamp() {
            this._builder.clearTimestamp();
        }

        public final boolean hasTimestamp() {
            return this._builder.hasTimestamp();
        }

        public final long getSessionTimestamp() {
            return this._builder.getSessionTimestamp();
        }

        public final void setSessionTimestamp(long j) {
            this._builder.setSessionTimestamp(j);
        }

        public final void clearSessionTimestamp() {
            this._builder.clearSessionTimestamp();
        }
    }

    private TimestampsKt() {
    }
}
