package com.unity3d.services.ads.token;

/* JADX INFO: loaded from: classes6.dex */
public class NativeTokenGeneratorWithPrivacyAwait implements com.unity3d.services.ads.token.INativeTokenGenerator {
    private final java.util.concurrent.ExecutorService _executorService;
    private final com.unity3d.services.ads.token.INativeTokenGenerator _nativeTokenGenerator;
    private final android.os.ConditionVariable _privacyAwait = new android.os.ConditionVariable();
    private final int _privacyAwaitTimeout;

    public NativeTokenGeneratorWithPrivacyAwait(java.util.concurrent.ExecutorService executorService, com.unity3d.services.ads.token.INativeTokenGenerator iNativeTokenGenerator, int i) {
        this._executorService = executorService;
        this._nativeTokenGenerator = iNativeTokenGenerator;
        this._privacyAwaitTimeout = i;
    }

    @Override // com.unity3d.services.ads.token.INativeTokenGenerator
    public void generateToken(final com.unity3d.services.ads.token.INativeTokenGeneratorListener iNativeTokenGeneratorListener) {
        final com.unity3d.services.core.misc.IObserver<com.unity3d.services.core.configuration.PrivacyConfig> iObserver = new com.unity3d.services.core.misc.IObserver<com.unity3d.services.core.configuration.PrivacyConfig>() { // from class: com.unity3d.services.ads.token.NativeTokenGeneratorWithPrivacyAwait.1
            @Override // com.unity3d.services.core.misc.IObserver
            public void updated(com.unity3d.services.core.configuration.PrivacyConfig privacyConfig) {
                com.unity3d.services.ads.token.NativeTokenGeneratorWithPrivacyAwait.this._privacyAwait.open();
            }
        };
        com.unity3d.services.core.configuration.PrivacyConfigStorage.getInstance().registerObserver(iObserver);
        this._executorService.execute(new java.lang.Runnable() { // from class: com.unity3d.services.ads.token.NativeTokenGeneratorWithPrivacyAwait.2
            @Override // java.lang.Runnable
            public void run() {
                com.unity3d.services.ads.token.NativeTokenGeneratorWithPrivacyAwait.this._privacyAwait.block(com.unity3d.services.ads.token.NativeTokenGeneratorWithPrivacyAwait.this._privacyAwaitTimeout);
                com.unity3d.services.core.configuration.PrivacyConfigStorage.getInstance().unregisterObserver(iObserver);
                com.unity3d.services.ads.token.NativeTokenGeneratorWithPrivacyAwait.this._nativeTokenGenerator.generateToken(iNativeTokenGeneratorListener);
            }
        });
    }
}
