package gatewayprotocol.v1;

/* JADX INFO: compiled from: PrivacyUpdateRequestKt.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lgatewayprotocol/v1/PrivacyUpdateRequestKt;", "", "()V", "Dsl", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PrivacyUpdateRequestKt {
    public static final gatewayprotocol.v1.PrivacyUpdateRequestKt INSTANCE = new gatewayprotocol.v1.PrivacyUpdateRequestKt();

    /* JADX INFO: compiled from: PrivacyUpdateRequestKt.kt */
    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0012\u001a\u00020\u0013H\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\u0006\u0010\u0016\u001a\u00020\u0015R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0018"}, d2 = {"Lgatewayprotocol/v1/PrivacyUpdateRequestKt$Dsl;", "", "_builder", "Lgatewayprotocol/v1/PrivacyUpdateRequestOuterClass$PrivacyUpdateRequest$Builder;", "(Lgatewayprotocol/v1/PrivacyUpdateRequestOuterClass$PrivacyUpdateRequest$Builder;)V", "value", "Lcom/google/protobuf/ByteString;", "content", "getContent", "()Lcom/google/protobuf/ByteString;", "setContent", "(Lcom/google/protobuf/ByteString;)V", "", "version", com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridge.versionMethodName, "()I", "setVersion", "(I)V", "_build", "Lgatewayprotocol/v1/PrivacyUpdateRequestOuterClass$PrivacyUpdateRequest;", "clearContent", "", "clearVersion", "Companion", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Dsl {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final gatewayprotocol.v1.PrivacyUpdateRequestKt.Dsl.Companion INSTANCE = new gatewayprotocol.v1.PrivacyUpdateRequestKt.Dsl.Companion(null);
        private final gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.Builder _builder;

        public /* synthetic */ Dsl(gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.Builder builder, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        private Dsl(gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.Builder builder) {
            this._builder = builder;
        }

        /* JADX INFO: compiled from: PrivacyUpdateRequestKt.kt */
        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, d2 = {"Lgatewayprotocol/v1/PrivacyUpdateRequestKt$Dsl$Companion;", "", "()V", "_create", "Lgatewayprotocol/v1/PrivacyUpdateRequestKt$Dsl;", "builder", "Lgatewayprotocol/v1/PrivacyUpdateRequestOuterClass$PrivacyUpdateRequest$Builder;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final /* synthetic */ gatewayprotocol.v1.PrivacyUpdateRequestKt.Dsl _create(gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.Builder builder) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "builder");
                return new gatewayprotocol.v1.PrivacyUpdateRequestKt.Dsl(builder, null);
            }
        }

        public final /* synthetic */ gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest _build() {
            gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest privacyUpdateRequestBuild = this._builder.build();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(privacyUpdateRequestBuild, "_builder.build()");
            return privacyUpdateRequestBuild;
        }

        public final int getVersion() {
            return this._builder.getVersion();
        }

        public final void setVersion(int i) {
            this._builder.setVersion(i);
        }

        public final void clearVersion() {
            this._builder.clearVersion();
        }

        public final com.google.protobuf.ByteString getContent() {
            com.google.protobuf.ByteString content = this._builder.getContent();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(content, "_builder.getContent()");
            return content;
        }

        public final void setContent(com.google.protobuf.ByteString value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setContent(value);
        }

        public final void clearContent() {
            this._builder.clearContent();
        }
    }

    private PrivacyUpdateRequestKt() {
    }
}
