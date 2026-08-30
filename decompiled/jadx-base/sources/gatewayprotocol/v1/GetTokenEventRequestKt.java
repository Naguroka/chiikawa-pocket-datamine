package gatewayprotocol.v1;

/* JADX INFO: compiled from: GetTokenEventRequestKt.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lgatewayprotocol/v1/GetTokenEventRequestKt;", "", "()V", "Dsl", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class GetTokenEventRequestKt {
    public static final gatewayprotocol.v1.GetTokenEventRequestKt INSTANCE = new gatewayprotocol.v1.GetTokenEventRequestKt();

    /* JADX INFO: compiled from: GetTokenEventRequestKt.kt */
    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u0000  2\u00020\u0001:\u0001 B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0015\u001a\u00020\u0016H\u0001J\u0006\u0010\u0017\u001a\u00020\u0018J\u0006\u0010\u0019\u001a\u00020\u0018J\u0006\u0010\u001a\u001a\u00020\u0018J\u0006\u0010\u001b\u001a\u00020\u0018J\u0006\u0010\u001c\u001a\u00020\u001dJ\u0006\u0010\u001e\u001a\u00020\u001dJ\u0006\u0010\u001f\u001a\u00020\u001dR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000bR$\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000bR$\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\t\"\u0004\b\u0014\u0010\u000b¨\u0006!"}, d2 = {"Lgatewayprotocol/v1/GetTokenEventRequestKt$Dsl;", "", "_builder", "Lgatewayprotocol/v1/GetTokenEventRequestOuterClass$GetTokenEventRequest$Builder;", "(Lgatewayprotocol/v1/GetTokenEventRequestOuterClass$GetTokenEventRequest$Builder;)V", "value", "Lcom/google/protobuf/ByteString;", "banner", "getBanner", "()Lcom/google/protobuf/ByteString;", "setBanner", "(Lcom/google/protobuf/ByteString;)V", "interstitial", "getInterstitial", "setInterstitial", "rewarded", "getRewarded", "setRewarded", "tokenId", "getTokenId", "setTokenId", "_build", "Lgatewayprotocol/v1/GetTokenEventRequestOuterClass$GetTokenEventRequest;", "clearBanner", "", "clearInterstitial", "clearRewarded", "clearTokenId", "hasBanner", "", "hasInterstitial", "hasRewarded", "Companion", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Dsl {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final gatewayprotocol.v1.GetTokenEventRequestKt.Dsl.Companion INSTANCE = new gatewayprotocol.v1.GetTokenEventRequestKt.Dsl.Companion(null);
        private final gatewayprotocol.v1.GetTokenEventRequestOuterClass.GetTokenEventRequest.Builder _builder;

        public /* synthetic */ Dsl(gatewayprotocol.v1.GetTokenEventRequestOuterClass.GetTokenEventRequest.Builder builder, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        private Dsl(gatewayprotocol.v1.GetTokenEventRequestOuterClass.GetTokenEventRequest.Builder builder) {
            this._builder = builder;
        }

        /* JADX INFO: compiled from: GetTokenEventRequestKt.kt */
        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, d2 = {"Lgatewayprotocol/v1/GetTokenEventRequestKt$Dsl$Companion;", "", "()V", "_create", "Lgatewayprotocol/v1/GetTokenEventRequestKt$Dsl;", "builder", "Lgatewayprotocol/v1/GetTokenEventRequestOuterClass$GetTokenEventRequest$Builder;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final /* synthetic */ gatewayprotocol.v1.GetTokenEventRequestKt.Dsl _create(gatewayprotocol.v1.GetTokenEventRequestOuterClass.GetTokenEventRequest.Builder builder) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "builder");
                return new gatewayprotocol.v1.GetTokenEventRequestKt.Dsl(builder, null);
            }
        }

        public final /* synthetic */ gatewayprotocol.v1.GetTokenEventRequestOuterClass.GetTokenEventRequest _build() {
            gatewayprotocol.v1.GetTokenEventRequestOuterClass.GetTokenEventRequest getTokenEventRequestBuild = this._builder.build();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(getTokenEventRequestBuild, "_builder.build()");
            return getTokenEventRequestBuild;
        }

        public final com.google.protobuf.ByteString getRewarded() {
            com.google.protobuf.ByteString rewarded = this._builder.getRewarded();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(rewarded, "_builder.getRewarded()");
            return rewarded;
        }

        public final void setRewarded(com.google.protobuf.ByteString value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setRewarded(value);
        }

        public final void clearRewarded() {
            this._builder.clearRewarded();
        }

        public final boolean hasRewarded() {
            return this._builder.hasRewarded();
        }

        public final com.google.protobuf.ByteString getInterstitial() {
            com.google.protobuf.ByteString interstitial = this._builder.getInterstitial();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(interstitial, "_builder.getInterstitial()");
            return interstitial;
        }

        public final void setInterstitial(com.google.protobuf.ByteString value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setInterstitial(value);
        }

        public final void clearInterstitial() {
            this._builder.clearInterstitial();
        }

        public final boolean hasInterstitial() {
            return this._builder.hasInterstitial();
        }

        public final com.google.protobuf.ByteString getBanner() {
            com.google.protobuf.ByteString banner = this._builder.getBanner();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(banner, "_builder.getBanner()");
            return banner;
        }

        public final void setBanner(com.google.protobuf.ByteString value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setBanner(value);
        }

        public final void clearBanner() {
            this._builder.clearBanner();
        }

        public final boolean hasBanner() {
            return this._builder.hasBanner();
        }

        public final com.google.protobuf.ByteString getTokenId() {
            com.google.protobuf.ByteString tokenId = this._builder.getTokenId();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(tokenId, "_builder.getTokenId()");
            return tokenId;
        }

        public final void setTokenId(com.google.protobuf.ByteString value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setTokenId(value);
        }

        public final void clearTokenId() {
            this._builder.clearTokenId();
        }
    }

    private GetTokenEventRequestKt() {
    }
}
