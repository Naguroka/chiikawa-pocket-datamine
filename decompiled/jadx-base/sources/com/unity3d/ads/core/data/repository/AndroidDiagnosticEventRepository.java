package com.unity3d.ads.core.data.repository;

/* JADX INFO: compiled from: AndroidDiagnosticEventRepository.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\nH\u0016J\b\u0010 \u001a\u00020\u001eH\u0016J\u0010\u0010!\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020#H\u0016J\b\u0010$\u001a\u00020\u001eH\u0016R\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R2\u0010\u000b\u001a&\u0012\f\u0012\n \u000e*\u0004\u0018\u00010\r0\r \u000e*\u0012\u0012\f\u0012\n \u000e*\u0004\u0018\u00010\r0\r\u0018\u00010\u000f0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00120\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R2\u0010\u0013\u001a&\u0012\f\u0012\n \u000e*\u0004\u0018\u00010\r0\r \u000e*\u0012\u0012\f\u0012\n \u000e*\u0004\u0018\u00010\r0\r\u0018\u00010\u000f0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0017X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00150\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/unity3d/ads/core/data/repository/AndroidDiagnosticEventRepository;", "Lcom/unity3d/ads/core/data/repository/DiagnosticEventRepository;", "flushTimer", "Lcom/unity3d/ads/core/utils/CoroutineTimer;", "getDiagnosticEventRequest", "Lcom/unity3d/ads/core/domain/events/GetDiagnosticEventRequest;", "(Lcom/unity3d/ads/core/utils/CoroutineTimer;Lcom/unity3d/ads/core/domain/events/GetDiagnosticEventRequest;)V", "_diagnosticEvents", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "", "Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticEvent;", "allowedEvents", "", "Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticEventType;", "kotlin.jvm.PlatformType", "", "batch", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "blockedEvents", "configured", "", "diagnosticEvents", "Lkotlinx/coroutines/flow/SharedFlow;", "getDiagnosticEvents", "()Lkotlinx/coroutines/flow/SharedFlow;", "enabled", "maxBatchSize", "", "addDiagnosticEvent", "", "diagnosticEvent", "clear", "configure", "diagnosticsEventsConfiguration", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$DiagnosticEventsConfiguration;", "flush", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AndroidDiagnosticEventRepository implements com.unity3d.ads.core.data.repository.DiagnosticEventRepository {
    private final kotlinx.coroutines.flow.MutableSharedFlow<java.util.List<gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent>> _diagnosticEvents;
    private final java.util.Set<gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventType> allowedEvents;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent>> batch;
    private final java.util.Set<gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventType> blockedEvents;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> configured;
    private final kotlinx.coroutines.flow.SharedFlow<java.util.List<gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent>> diagnosticEvents;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> enabled;
    private final com.unity3d.ads.core.utils.CoroutineTimer flushTimer;
    private final com.unity3d.ads.core.domain.events.GetDiagnosticEventRequest getDiagnosticEventRequest;
    private int maxBatchSize;

    public AndroidDiagnosticEventRepository(com.unity3d.ads.core.utils.CoroutineTimer flushTimer, com.unity3d.ads.core.domain.events.GetDiagnosticEventRequest getDiagnosticEventRequest) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flushTimer, "flushTimer");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getDiagnosticEventRequest, "getDiagnosticEventRequest");
        this.flushTimer = flushTimer;
        this.getDiagnosticEventRequest = getDiagnosticEventRequest;
        java.util.List listSynchronizedList = java.util.Collections.synchronizedList(new java.util.ArrayList());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(listSynchronizedList, "synchronizedList(mutableListOf())");
        this.batch = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(listSynchronizedList);
        this.maxBatchSize = Integer.MAX_VALUE;
        this.allowedEvents = java.util.Collections.synchronizedSet(new java.util.LinkedHashSet());
        this.blockedEvents = java.util.Collections.synchronizedSet(new java.util.LinkedHashSet());
        this.enabled = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(false);
        this.configured = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(false);
        kotlinx.coroutines.flow.MutableSharedFlow<java.util.List<gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent>> MutableSharedFlow = kotlinx.coroutines.flow.SharedFlowKt.MutableSharedFlow(10, 10, kotlinx.coroutines.channels.BufferOverflow.DROP_OLDEST);
        this._diagnosticEvents = MutableSharedFlow;
        this.diagnosticEvents = kotlinx.coroutines.flow.FlowKt.asSharedFlow(MutableSharedFlow);
    }

    @Override // com.unity3d.ads.core.data.repository.DiagnosticEventRepository
    public kotlinx.coroutines.flow.SharedFlow<java.util.List<gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent>> getDiagnosticEvents() {
        return this.diagnosticEvents;
    }

    @Override // com.unity3d.ads.core.data.repository.DiagnosticEventRepository
    public void addDiagnosticEvent(gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent diagnosticEvent) {
        java.util.List<gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent> value;
        java.util.List<gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent> list;
        java.util.List<gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent> value2;
        java.util.List<gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent> list2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(diagnosticEvent, "diagnosticEvent");
        if (!this.configured.getValue().booleanValue()) {
            kotlinx.coroutines.flow.MutableStateFlow<java.util.List<gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent>> mutableStateFlow = this.batch;
            do {
                value2 = mutableStateFlow.getValue();
                list2 = value2;
                list2.add(diagnosticEvent);
            } while (!mutableStateFlow.compareAndSet(value2, list2));
            return;
        }
        if (this.enabled.getValue().booleanValue()) {
            kotlinx.coroutines.flow.MutableStateFlow<java.util.List<gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent>> mutableStateFlow2 = this.batch;
            do {
                value = mutableStateFlow2.getValue();
                list = value;
                list.add(diagnosticEvent);
            } while (!mutableStateFlow2.compareAndSet(value, list));
            if (this.batch.getValue().size() >= this.maxBatchSize) {
                flush();
            }
        }
    }

    @Override // com.unity3d.ads.core.data.repository.DiagnosticEventRepository
    public void flush() {
        java.util.List<gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent> value;
        kotlinx.coroutines.flow.MutableStateFlow<java.util.List<gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent>> mutableStateFlow = this.batch;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, new java.util.ArrayList()));
        java.util.List<gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent> list = kotlin.sequences.SequencesKt.toList(kotlin.sequences.SequencesKt.filter(kotlin.sequences.SequencesKt.filter(kotlin.sequences.SequencesKt.map(kotlin.collections.CollectionsKt.asSequence(value), new kotlin.jvm.functions.Function1<gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent, gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent>() { // from class: com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository$flush$events$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent invoke(gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent diagnosticEvent) {
                return diagnosticEvent == null ? this.this$0.getDiagnosticEventRequest.invoke("null_diagnostic_event", null, null, null, null, null, null, null) : diagnosticEvent;
            }
        }), new kotlin.jvm.functions.Function1<gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent, java.lang.Boolean>() { // from class: com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository$flush$events$3
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Boolean invoke(gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent it) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                return java.lang.Boolean.valueOf(this.this$0.allowedEvents.isEmpty() || this.this$0.allowedEvents.contains(it.getEventType()));
            }
        }), new kotlin.jvm.functions.Function1<gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent, java.lang.Boolean>() { // from class: com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository$flush$events$4
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Boolean invoke(gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent it) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                return java.lang.Boolean.valueOf(!this.this$0.blockedEvents.contains(it.getEventType()));
            }
        }));
        if (!list.isEmpty()) {
            com.unity3d.services.core.log.DeviceLog.debug("Unity Ads Sending diagnostic batch enabled: " + this.enabled.getValue().booleanValue() + " size: " + list.size() + " :: " + list);
            this._diagnosticEvents.tryEmit(list);
        }
    }

    @Override // com.unity3d.ads.core.data.repository.DiagnosticEventRepository
    public void clear() {
        kotlinx.coroutines.flow.MutableStateFlow<java.util.List<gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent>> mutableStateFlow = this.batch;
        while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), new java.util.ArrayList())) {
        }
    }

    @Override // com.unity3d.ads.core.data.repository.DiagnosticEventRepository
    public void configure(gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration diagnosticsEventsConfiguration) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(diagnosticsEventsConfiguration, "diagnosticsEventsConfiguration");
        this.configured.setValue(true);
        this.enabled.setValue(java.lang.Boolean.valueOf(diagnosticsEventsConfiguration.getEnabled()));
        if (!this.enabled.getValue().booleanValue()) {
            clear();
            return;
        }
        this.maxBatchSize = diagnosticsEventsConfiguration.getMaxBatchSize();
        java.util.Set<gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventType> set = this.allowedEvents;
        java.util.List<gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventType> allowedEventsList = diagnosticsEventsConfiguration.getAllowedEventsList();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(allowedEventsList, "diagnosticsEventsConfiguration.allowedEventsList");
        set.addAll(allowedEventsList);
        java.util.Set<gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventType> set2 = this.blockedEvents;
        java.util.List<gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventType> blockedEventsList = diagnosticsEventsConfiguration.getBlockedEventsList();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(blockedEventsList, "diagnosticsEventsConfiguration.blockedEventsList");
        set2.addAll(blockedEventsList);
        this.flushTimer.start(0L, diagnosticsEventsConfiguration.getMaxBatchIntervalMs(), new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository.configure.1
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
                com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository.this.flush();
            }
        });
    }
}
