package gatewayprotocol.v1;

/* JADX INFO: compiled from: PiiKt.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lgatewayprotocol/v1/PiiKt;", "", "()V", "Dsl", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PiiKt {
    public static final gatewayprotocol.v1.PiiKt INSTANCE = new gatewayprotocol.v1.PiiKt();

    /* JADX INFO: compiled from: PiiKt.kt */
    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0012\u001a\u00020\u0013H\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\u0006\u0010\u0016\u001a\u00020\u0015J\u0006\u0010\u0017\u001a\u00020\u0015R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000bR$\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000b¨\u0006\u0019"}, d2 = {"Lgatewayprotocol/v1/PiiKt$Dsl;", "", "_builder", "Lgatewayprotocol/v1/PiiOuterClass$Pii$Builder;", "(Lgatewayprotocol/v1/PiiOuterClass$Pii$Builder;)V", "value", "Lcom/google/protobuf/ByteString;", "advertisingId", "getAdvertisingId", "()Lcom/google/protobuf/ByteString;", "setAdvertisingId", "(Lcom/google/protobuf/ByteString;)V", "openAdvertisingTrackingId", "getOpenAdvertisingTrackingId", "setOpenAdvertisingTrackingId", "vendorId", "getVendorId", "setVendorId", "_build", "Lgatewayprotocol/v1/PiiOuterClass$Pii;", "clearAdvertisingId", "", "clearOpenAdvertisingTrackingId", "clearVendorId", "Companion", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Dsl {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final gatewayprotocol.v1.PiiKt.Dsl.Companion INSTANCE = new gatewayprotocol.v1.PiiKt.Dsl.Companion(null);
        private final gatewayprotocol.v1.PiiOuterClass.Pii.Builder _builder;

        public /* synthetic */ Dsl(gatewayprotocol.v1.PiiOuterClass.Pii.Builder builder, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        private Dsl(gatewayprotocol.v1.PiiOuterClass.Pii.Builder builder) {
            this._builder = builder;
        }

        /* JADX INFO: compiled from: PiiKt.kt */
        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, d2 = {"Lgatewayprotocol/v1/PiiKt$Dsl$Companion;", "", "()V", "_create", "Lgatewayprotocol/v1/PiiKt$Dsl;", "builder", "Lgatewayprotocol/v1/PiiOuterClass$Pii$Builder;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final /* synthetic */ gatewayprotocol.v1.PiiKt.Dsl _create(gatewayprotocol.v1.PiiOuterClass.Pii.Builder builder) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "builder");
                return new gatewayprotocol.v1.PiiKt.Dsl(builder, null);
            }
        }

        public final /* synthetic */ gatewayprotocol.v1.PiiOuterClass.Pii _build() {
            gatewayprotocol.v1.PiiOuterClass.Pii piiBuild = this._builder.build();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(piiBuild, "_builder.build()");
            return piiBuild;
        }

        public final com.google.protobuf.ByteString getAdvertisingId() {
            com.google.protobuf.ByteString advertisingId = this._builder.getAdvertisingId();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(advertisingId, "_builder.getAdvertisingId()");
            return advertisingId;
        }

        public final void setAdvertisingId(com.google.protobuf.ByteString value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setAdvertisingId(value);
        }

        public final void clearAdvertisingId() {
            this._builder.clearAdvertisingId();
        }

        public final com.google.protobuf.ByteString getVendorId() {
            com.google.protobuf.ByteString vendorId = this._builder.getVendorId();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(vendorId, "_builder.getVendorId()");
            return vendorId;
        }

        public final void setVendorId(com.google.protobuf.ByteString value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setVendorId(value);
        }

        public final void clearVendorId() {
            this._builder.clearVendorId();
        }

        public final com.google.protobuf.ByteString getOpenAdvertisingTrackingId() {
            com.google.protobuf.ByteString openAdvertisingTrackingId = this._builder.getOpenAdvertisingTrackingId();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(openAdvertisingTrackingId, "_builder.getOpenAdvertisingTrackingId()");
            return openAdvertisingTrackingId;
        }

        public final void setOpenAdvertisingTrackingId(com.google.protobuf.ByteString value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setOpenAdvertisingTrackingId(value);
        }

        public final void clearOpenAdvertisingTrackingId() {
            this._builder.clearOpenAdvertisingTrackingId();
        }
    }

    private PiiKt() {
    }
}
