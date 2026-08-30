package gatewayprotocol.v1;

/* JADX INFO: compiled from: ErrorKt.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lgatewayprotocol/v1/ErrorKt;", "", "()V", "Dsl", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ErrorKt {
    public static final gatewayprotocol.v1.ErrorKt INSTANCE = new gatewayprotocol.v1.ErrorKt();

    /* JADX INFO: compiled from: ErrorKt.kt */
    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\f\u001a\u00020\rH\u0001J\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u0011"}, d2 = {"Lgatewayprotocol/v1/ErrorKt$Dsl;", "", "_builder", "Lgatewayprotocol/v1/ErrorOuterClass$Error$Builder;", "(Lgatewayprotocol/v1/ErrorOuterClass$Error$Builder;)V", "value", "", "errorText", "getErrorText", "()Ljava/lang/String;", "setErrorText", "(Ljava/lang/String;)V", "_build", "Lgatewayprotocol/v1/ErrorOuterClass$Error;", "clearErrorText", "", "Companion", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Dsl {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final gatewayprotocol.v1.ErrorKt.Dsl.Companion INSTANCE = new gatewayprotocol.v1.ErrorKt.Dsl.Companion(null);
        private final gatewayprotocol.v1.ErrorOuterClass.Error.Builder _builder;

        public /* synthetic */ Dsl(gatewayprotocol.v1.ErrorOuterClass.Error.Builder builder, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        private Dsl(gatewayprotocol.v1.ErrorOuterClass.Error.Builder builder) {
            this._builder = builder;
        }

        /* JADX INFO: compiled from: ErrorKt.kt */
        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, d2 = {"Lgatewayprotocol/v1/ErrorKt$Dsl$Companion;", "", "()V", "_create", "Lgatewayprotocol/v1/ErrorKt$Dsl;", "builder", "Lgatewayprotocol/v1/ErrorOuterClass$Error$Builder;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final /* synthetic */ gatewayprotocol.v1.ErrorKt.Dsl _create(gatewayprotocol.v1.ErrorOuterClass.Error.Builder builder) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "builder");
                return new gatewayprotocol.v1.ErrorKt.Dsl(builder, null);
            }
        }

        public final /* synthetic */ gatewayprotocol.v1.ErrorOuterClass.Error _build() {
            gatewayprotocol.v1.ErrorOuterClass.Error errorBuild = this._builder.build();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(errorBuild, "_builder.build()");
            return errorBuild;
        }

        public final java.lang.String getErrorText() {
            java.lang.String errorText = this._builder.getErrorText();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(errorText, "_builder.getErrorText()");
            return errorText;
        }

        public final void setErrorText(java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setErrorText(value);
        }

        public final void clearErrorText() {
            this._builder.clearErrorText();
        }
    }

    private ErrorKt() {
    }
}
