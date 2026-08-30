package com.unity3d.ads.core.data.repository;

/* JADX INFO: compiled from: SessionRepository.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u000f\bf\u0018\u00002\u00020\u0001J\u0011\u0010I\u001a\u00020\rH¦@ø\u0001\u0000¢\u0006\u0002\u0010JJ\u0011\u0010K\u001a\u00020\rH¦@ø\u0001\u0000¢\u0006\u0002\u0010JJ\u0011\u0010L\u001a\u00020\rH¦@ø\u0001\u0000¢\u0006\u0002\u0010JJ\b\u0010M\u001a\u00020NH&J\b\u0010O\u001a\u00020NH&J\b\u0010P\u001a\u00020NH&J\b\u0010Q\u001a\u00020NH&J\b\u0010R\u001a\u00020NH&J\b\u0010S\u001a\u00020NH&J\b\u0010T\u001a\u00020NH&J\b\u0010U\u001a\u00020NH&J\u0011\u0010V\u001a\u00020NH¦@ø\u0001\u0000¢\u0006\u0002\u0010JJ\b\u0010W\u001a\u00020NH&J\u0019\u0010X\u001a\u00020N2\u0006\u0010Y\u001a\u00020\rH¦@ø\u0001\u0000¢\u0006\u0002\u0010ZJ\u0019\u0010[\u001a\u00020N2\u0006\u0010Y\u001a\u00020\rH¦@ø\u0001\u0000¢\u0006\u0002\u0010ZJ\u0019\u0010\\\u001a\u00020N2\u0006\u0010Y\u001a\u00020\rH¦@ø\u0001\u0000¢\u0006\u0002\u0010ZR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u0007X¦\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0018\u0010\f\u001a\u00020\rX¦\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0012\u001a\u00020\u0007X¦\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\t\"\u0004\b\u0014\u0010\u000bR\u0012\u0010\u0015\u001a\u00020\u0016X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\u0019\u001a\u00020\u001aX¦\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0012\u0010\u001f\u001a\u00020 X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010!R\u0012\u0010\"\u001a\u00020 X¦\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010!R\u0012\u0010#\u001a\u00020 X¦\u0004¢\u0006\u0006\u001a\u0004\b#\u0010!R\u0012\u0010$\u001a\u00020 X¦\u0004¢\u0006\u0006\u001a\u0004\b$\u0010!R\u0018\u0010%\u001a\u00020&X¦\u000e¢\u0006\f\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u0018\u0010+\u001a\b\u0012\u0004\u0012\u00020\u001a0,X¦\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0018\u0010/\u001a\b\u0012\u0004\u0012\u00020100X¦\u0004¢\u0006\u0006\u001a\u0004\b2\u00103R\u0018\u00104\u001a\u000205X¦\u000e¢\u0006\f\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u0012\u0010:\u001a\u00020\rX¦\u0004¢\u0006\u0006\u001a\u0004\b;\u0010\u000fR\u0018\u0010<\u001a\u00020\rX¦\u000e¢\u0006\f\u001a\u0004\b=\u0010\u000f\"\u0004\b>\u0010\u0011R\u0018\u0010?\u001a\u00020 X¦\u000e¢\u0006\f\u001a\u0004\b@\u0010!\"\u0004\bA\u0010BR\u0018\u0010C\u001a\u00020DX¦\u000e¢\u0006\f\u001a\u0004\bE\u0010F\"\u0004\bG\u0010H\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006]"}, d2 = {"Lcom/unity3d/ads/core/data/repository/SessionRepository;", "", "featureFlags", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$FeatureFlags;", "getFeatureFlags", "()Lgatewayprotocol/v1/NativeConfigurationOuterClass$FeatureFlags;", com.unity3d.ads.core.domain.AndroidGetAdPlayerContext.KEY_GAME_ID, "", "getGameId", "()Ljava/lang/String;", "setGameId", "(Ljava/lang/String;)V", "gatewayState", "Lcom/google/protobuf/ByteString;", "getGatewayState", "()Lcom/google/protobuf/ByteString;", "setGatewayState", "(Lcom/google/protobuf/ByteString;)V", "gatewayUrl", "getGatewayUrl", "setGatewayUrl", "headerBiddingTokenCounter", "", "getHeaderBiddingTokenCounter", "()I", "initializationState", "Lcom/unity3d/ads/core/data/model/InitializationState;", "getInitializationState", "()Lcom/unity3d/ads/core/data/model/InitializationState;", "setInitializationState", "(Lcom/unity3d/ads/core/data/model/InitializationState;)V", "isDiagnosticsEnabled", "", "()Z", "isOmEnabled", "isSdkInitialized", "isTestModeEnabled", "nativeConfiguration", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$NativeConfiguration;", "getNativeConfiguration", "()Lgatewayprotocol/v1/NativeConfigurationOuterClass$NativeConfiguration;", "setNativeConfiguration", "(Lgatewayprotocol/v1/NativeConfigurationOuterClass$NativeConfiguration;)V", "observeInitializationState", "Lkotlinx/coroutines/flow/Flow;", "getObserveInitializationState", "()Lkotlinx/coroutines/flow/Flow;", "onChange", "Lkotlinx/coroutines/flow/SharedFlow;", "Lcom/unity3d/ads/core/data/model/SessionChange;", "getOnChange", "()Lkotlinx/coroutines/flow/SharedFlow;", "sessionCounters", "Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;", "getSessionCounters", "()Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;", "setSessionCounters", "(Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;)V", com.unity3d.services.core.device.reader.JsonStorageKeyNames.SESSION_ID_KEY, "getSessionId", "sessionToken", "getSessionToken", "setSessionToken", "shouldInitialize", "getShouldInitialize", "setShouldInitialize", "(Z)V", "tokenCounters", "Lcom/unity3d/ads/core/data/model/TokenCounters;", "getTokenCounters", "()Lcom/unity3d/ads/core/data/model/TokenCounters;", "setTokenCounters", "(Lcom/unity3d/ads/core/data/model/TokenCounters;)V", "getGatewayCache", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPrivacy", "getPrivacyFsm", "incrementBannerImpressionCount", "", "incrementBannerLoadRequestAdmCount", "incrementBannerLoadRequestCount", "incrementLoadRequestAdmCount", "incrementLoadRequestCount", "incrementTokenSequenceNumber", "incrementTokenStartsCount", "incrementTokenWinsCount", "persistNativeConfiguration", "resetTokenCounters", "setGatewayCache", "value", "(Lcom/google/protobuf/ByteString;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setPrivacy", "setPrivacyFsm", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface SessionRepository {
    gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags getFeatureFlags();

    java.lang.String getGameId();

    java.lang.Object getGatewayCache(kotlin.coroutines.Continuation<? super com.google.protobuf.ByteString> continuation);

    com.google.protobuf.ByteString getGatewayState();

    java.lang.String getGatewayUrl();

    int getHeaderBiddingTokenCounter();

    com.unity3d.ads.core.data.model.InitializationState getInitializationState();

    gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration getNativeConfiguration();

    kotlinx.coroutines.flow.Flow<com.unity3d.ads.core.data.model.InitializationState> getObserveInitializationState();

    kotlinx.coroutines.flow.SharedFlow<com.unity3d.ads.core.data.model.SessionChange> getOnChange();

    java.lang.Object getPrivacy(kotlin.coroutines.Continuation<? super com.google.protobuf.ByteString> continuation);

    java.lang.Object getPrivacyFsm(kotlin.coroutines.Continuation<? super com.google.protobuf.ByteString> continuation);

    gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters getSessionCounters();

    com.google.protobuf.ByteString getSessionId();

    com.google.protobuf.ByteString getSessionToken();

    boolean getShouldInitialize();

    com.unity3d.ads.core.data.model.TokenCounters getTokenCounters();

    void incrementBannerImpressionCount();

    void incrementBannerLoadRequestAdmCount();

    void incrementBannerLoadRequestCount();

    void incrementLoadRequestAdmCount();

    void incrementLoadRequestCount();

    void incrementTokenSequenceNumber();

    void incrementTokenStartsCount();

    void incrementTokenWinsCount();

    boolean isDiagnosticsEnabled();

    boolean isOmEnabled();

    boolean isSdkInitialized();

    boolean isTestModeEnabled();

    java.lang.Object persistNativeConfiguration(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    void resetTokenCounters();

    void setGameId(java.lang.String str);

    java.lang.Object setGatewayCache(com.google.protobuf.ByteString byteString, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    void setGatewayState(com.google.protobuf.ByteString byteString);

    void setGatewayUrl(java.lang.String str);

    void setInitializationState(com.unity3d.ads.core.data.model.InitializationState initializationState);

    void setNativeConfiguration(gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration nativeConfiguration);

    java.lang.Object setPrivacy(com.google.protobuf.ByteString byteString, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    java.lang.Object setPrivacyFsm(com.google.protobuf.ByteString byteString, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    void setSessionCounters(gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters sessionCounters);

    void setSessionToken(com.google.protobuf.ByteString byteString);

    void setShouldInitialize(boolean z);

    void setTokenCounters(com.unity3d.ads.core.data.model.TokenCounters tokenCounters);
}
