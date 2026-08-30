package gatewayprotocol.v1;

/* JADX INFO: compiled from: RequestRetryPolicyKt.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lgatewayprotocol/v1/RequestRetryPolicyKt;", "", "()V", "Dsl", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class RequestRetryPolicyKt {
    public static final gatewayprotocol.v1.RequestRetryPolicyKt INSTANCE = new gatewayprotocol.v1.RequestRetryPolicyKt();

    /* JADX INFO: compiled from: RequestRetryPolicyKt.kt */
    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 *2\u00020\u0001:\u0001*B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010!\u001a\u00020\"H\u0001J\u0006\u0010#\u001a\u00020$J\u0006\u0010%\u001a\u00020$J\u0006\u0010&\u001a\u00020$J\u0006\u0010'\u001a\u00020$J\u0006\u0010(\u001a\u00020$J\u0006\u0010)\u001a\u00020$R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\t\"\u0004\b\u0014\u0010\u000bR$\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\u000f\"\u0004\b\u0017\u0010\u0011R$\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\t\"\u0004\b\u001a\u0010\u000bR$\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0005\u001a\u00020\u001b8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006+"}, d2 = {"Lgatewayprotocol/v1/RequestRetryPolicyKt$Dsl;", "", "_builder", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$RequestRetryPolicy$Builder;", "(Lgatewayprotocol/v1/NativeConfigurationOuterClass$RequestRetryPolicy$Builder;)V", "value", "", "maxDuration", "getMaxDuration", "()I", "setMaxDuration", "(I)V", "", "retryJitterPct", "getRetryJitterPct", "()F", "setRetryJitterPct", "(F)V", "retryMaxInterval", "getRetryMaxInterval", "setRetryMaxInterval", "retryScalingFactor", "getRetryScalingFactor", "setRetryScalingFactor", "retryWaitBase", "getRetryWaitBase", "setRetryWaitBase", "", "shouldStoreLocally", "getShouldStoreLocally", "()Z", "setShouldStoreLocally", "(Z)V", "_build", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$RequestRetryPolicy;", "clearMaxDuration", "", "clearRetryJitterPct", "clearRetryMaxInterval", "clearRetryScalingFactor", "clearRetryWaitBase", "clearShouldStoreLocally", "Companion", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Dsl {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final gatewayprotocol.v1.RequestRetryPolicyKt.Dsl.Companion INSTANCE = new gatewayprotocol.v1.RequestRetryPolicyKt.Dsl.Companion(null);
        private final gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy.Builder _builder;

        public /* synthetic */ Dsl(gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy.Builder builder, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        private Dsl(gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy.Builder builder) {
            this._builder = builder;
        }

        /* JADX INFO: compiled from: RequestRetryPolicyKt.kt */
        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, d2 = {"Lgatewayprotocol/v1/RequestRetryPolicyKt$Dsl$Companion;", "", "()V", "_create", "Lgatewayprotocol/v1/RequestRetryPolicyKt$Dsl;", "builder", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$RequestRetryPolicy$Builder;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final /* synthetic */ gatewayprotocol.v1.RequestRetryPolicyKt.Dsl _create(gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy.Builder builder) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "builder");
                return new gatewayprotocol.v1.RequestRetryPolicyKt.Dsl(builder, null);
            }
        }

        public final /* synthetic */ gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy _build() {
            gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy requestRetryPolicyBuild = this._builder.build();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(requestRetryPolicyBuild, "_builder.build()");
            return requestRetryPolicyBuild;
        }

        public final int getMaxDuration() {
            return this._builder.getMaxDuration();
        }

        public final void setMaxDuration(int i) {
            this._builder.setMaxDuration(i);
        }

        public final void clearMaxDuration() {
            this._builder.clearMaxDuration();
        }

        public final int getRetryWaitBase() {
            return this._builder.getRetryWaitBase();
        }

        public final void setRetryWaitBase(int i) {
            this._builder.setRetryWaitBase(i);
        }

        public final void clearRetryWaitBase() {
            this._builder.clearRetryWaitBase();
        }

        public final int getRetryMaxInterval() {
            return this._builder.getRetryMaxInterval();
        }

        public final void setRetryMaxInterval(int i) {
            this._builder.setRetryMaxInterval(i);
        }

        public final void clearRetryMaxInterval() {
            this._builder.clearRetryMaxInterval();
        }

        public final float getRetryJitterPct() {
            return this._builder.getRetryJitterPct();
        }

        public final void setRetryJitterPct(float f) {
            this._builder.setRetryJitterPct(f);
        }

        public final void clearRetryJitterPct() {
            this._builder.clearRetryJitterPct();
        }

        public final float getRetryScalingFactor() {
            return this._builder.getRetryScalingFactor();
        }

        public final void setRetryScalingFactor(float f) {
            this._builder.setRetryScalingFactor(f);
        }

        public final void clearRetryScalingFactor() {
            this._builder.clearRetryScalingFactor();
        }

        public final boolean getShouldStoreLocally() {
            return this._builder.getShouldStoreLocally();
        }

        public final void setShouldStoreLocally(boolean z) {
            this._builder.setShouldStoreLocally(z);
        }

        public final void clearShouldStoreLocally() {
            this._builder.clearShouldStoreLocally();
        }
    }

    private RequestRetryPolicyKt() {
    }
}
