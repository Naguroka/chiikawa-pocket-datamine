package com.unity3d.ads.core.data.datasource;

/* JADX INFO: compiled from: AndroidDynamicDeviceInfoDataSource.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "Lcom/unity3d/ads/core/data/datasource/VolumeSettingsChange;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1", f = "AndroidDynamicDeviceInfoDataSource.kt", i = {}, l = {com.unity3d.mediation.LevelPlayAdError.ERROR_CODE_LOAD_FAILED_ALREADY_CALLED}, m = "invokeSuspend", n = {}, s = {})
final class AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super com.unity3d.ads.core.data.datasource.VolumeSettingsChange>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    private /* synthetic */ java.lang.Object L$0;
    int label;
    final /* synthetic */ com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1(com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource androidDynamicDeviceInfoDataSource, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1> continuation) {
        super(2, continuation);
        this.this$0 = androidDynamicDeviceInfoDataSource;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1 androidDynamicDeviceInfoDataSource$volumeSettingsChange$1 = new com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1(this.this$0, continuation);
        androidDynamicDeviceInfoDataSource$volumeSettingsChange$1.L$0 = obj;
        return androidDynamicDeviceInfoDataSource$volumeSettingsChange$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.channels.ProducerScope<? super com.unity3d.ads.core.data.datasource.VolumeSettingsChange> producerScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1) create(producerScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1$contentObserver$1] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            final kotlinx.coroutines.channels.ProducerScope producerScope = (kotlinx.coroutines.channels.ProducerScope) this.L$0;
            final kotlin.jvm.internal.Ref.DoubleRef doubleRef = new kotlin.jvm.internal.Ref.DoubleRef();
            doubleRef.element = this.this$0.getStreamVolume(3);
            kotlinx.coroutines.channels.ProducerScope producerScope2 = producerScope;
            kotlinx.coroutines.channels.ChannelsKt.trySendBlocking(producerScope2, new com.unity3d.ads.core.data.datasource.VolumeSettingsChange.VolumeChange(doubleRef.element));
            final kotlin.jvm.internal.Ref.IntRef intRef = new kotlin.jvm.internal.Ref.IntRef();
            intRef.element = this.this$0.getRingerMode();
            kotlinx.coroutines.channels.ChannelsKt.trySendBlocking(producerScope2, new com.unity3d.ads.core.data.datasource.VolumeSettingsChange.MuteChange(intRef.element == 0));
            final com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource androidDynamicDeviceInfoDataSource = this.this$0;
            final ?? r3 = new android.database.ContentObserver() { // from class: com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1$contentObserver$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(null);
                }

                @Override // android.database.ContentObserver
                public void onChange(boolean selfChange) {
                    super.onChange(selfChange);
                    double streamVolume = androidDynamicDeviceInfoDataSource.getStreamVolume(3);
                    if (!(streamVolume == doubleRef.element)) {
                        doubleRef.element = streamVolume;
                        kotlinx.coroutines.channels.ChannelsKt.trySendBlocking(producerScope, new com.unity3d.ads.core.data.datasource.VolumeSettingsChange.VolumeChange(streamVolume));
                    }
                    int ringerMode = androidDynamicDeviceInfoDataSource.getRingerMode();
                    if (ringerMode != intRef.element) {
                        intRef.element = ringerMode;
                        kotlinx.coroutines.channels.ChannelsKt.trySendBlocking(producerScope, new com.unity3d.ads.core.data.datasource.VolumeSettingsChange.MuteChange(ringerMode == 0));
                    }
                }
            };
            this.this$0.getContext().getContentResolver().registerContentObserver(android.provider.Settings.System.CONTENT_URI, true, (android.database.ContentObserver) r3);
            final com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource androidDynamicDeviceInfoDataSource2 = this.this$0;
            this.label = 1;
            if (kotlinx.coroutines.channels.ProduceKt.awaitClose(producerScope, new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                    invoke2();
                    return kotlin.Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    androidDynamicDeviceInfoDataSource2.getContext().getContentResolver().unregisterContentObserver(r3);
                }
            }, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }
}
