package gatewayprotocol.v1;

/* JADX INFO: compiled from: RequestTimeoutPolicyKt.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lgatewayprotocol/v1/RequestTimeoutPolicyKt;", "", "()V", "Dsl", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class RequestTimeoutPolicyKt {
    public static final gatewayprotocol.v1.RequestTimeoutPolicyKt INSTANCE = new gatewayprotocol.v1.RequestTimeoutPolicyKt();

    /* JADX INFO: compiled from: RequestTimeoutPolicyKt.kt */
    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0015\u001a\u00020\u0016H\u0001J\u0006\u0010\u0017\u001a\u00020\u0018J\u0006\u0010\u0019\u001a\u00020\u0018J\u0006\u0010\u001a\u001a\u00020\u0018J\u0006\u0010\u001b\u001a\u00020\u0018R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000bR$\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000bR$\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\t\"\u0004\b\u0014\u0010\u000b¨\u0006\u001d"}, d2 = {"Lgatewayprotocol/v1/RequestTimeoutPolicyKt$Dsl;", "", "_builder", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$RequestTimeoutPolicy$Builder;", "(Lgatewayprotocol/v1/NativeConfigurationOuterClass$RequestTimeoutPolicy$Builder;)V", "value", "", "connectTimeoutMs", "getConnectTimeoutMs", "()I", "setConnectTimeoutMs", "(I)V", "overallTimeoutMs", "getOverallTimeoutMs", "setOverallTimeoutMs", "readTimeoutMs", "getReadTimeoutMs", "setReadTimeoutMs", "writeTimeoutMs", "getWriteTimeoutMs", "setWriteTimeoutMs", "_build", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$RequestTimeoutPolicy;", "clearConnectTimeoutMs", "", "clearOverallTimeoutMs", "clearReadTimeoutMs", "clearWriteTimeoutMs", "Companion", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Dsl {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final gatewayprotocol.v1.RequestTimeoutPolicyKt.Dsl.Companion INSTANCE = new gatewayprotocol.v1.RequestTimeoutPolicyKt.Dsl.Companion(null);
        private final gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy.Builder _builder;

        public /* synthetic */ Dsl(gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy.Builder builder, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        private Dsl(gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy.Builder builder) {
            this._builder = builder;
        }

        /* JADX INFO: compiled from: RequestTimeoutPolicyKt.kt */
        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, d2 = {"Lgatewayprotocol/v1/RequestTimeoutPolicyKt$Dsl$Companion;", "", "()V", "_create", "Lgatewayprotocol/v1/RequestTimeoutPolicyKt$Dsl;", "builder", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$RequestTimeoutPolicy$Builder;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final /* synthetic */ gatewayprotocol.v1.RequestTimeoutPolicyKt.Dsl _create(gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy.Builder builder) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "builder");
                return new gatewayprotocol.v1.RequestTimeoutPolicyKt.Dsl(builder, null);
            }
        }

        public final /* synthetic */ gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy _build() {
            gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy requestTimeoutPolicyBuild = this._builder.build();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(requestTimeoutPolicyBuild, "_builder.build()");
            return requestTimeoutPolicyBuild;
        }

        public final int getConnectTimeoutMs() {
            return this._builder.getConnectTimeoutMs();
        }

        public final void setConnectTimeoutMs(int i) {
            this._builder.setConnectTimeoutMs(i);
        }

        public final void clearConnectTimeoutMs() {
            this._builder.clearConnectTimeoutMs();
        }

        public final int getReadTimeoutMs() {
            return this._builder.getReadTimeoutMs();
        }

        public final void setReadTimeoutMs(int i) {
            this._builder.setReadTimeoutMs(i);
        }

        public final void clearReadTimeoutMs() {
            this._builder.clearReadTimeoutMs();
        }

        public final int getWriteTimeoutMs() {
            return this._builder.getWriteTimeoutMs();
        }

        public final void setWriteTimeoutMs(int i) {
            this._builder.setWriteTimeoutMs(i);
        }

        public final void clearWriteTimeoutMs() {
            this._builder.clearWriteTimeoutMs();
        }

        public final int getOverallTimeoutMs() {
            return this._builder.getOverallTimeoutMs();
        }

        public final void setOverallTimeoutMs(int i) {
            this._builder.setOverallTimeoutMs(i);
        }

        public final void clearOverallTimeoutMs() {
            this._builder.clearOverallTimeoutMs();
        }
    }

    private RequestTimeoutPolicyKt() {
    }
}
