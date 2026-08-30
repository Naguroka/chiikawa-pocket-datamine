package com.unity3d.ads.core.data.repository;

/* JADX INFO: compiled from: DiagnosticEventRepository.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005H&J\b\u0010\u000b\u001a\u00020\tH&J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000eH&J\b\u0010\u000f\u001a\u00020\tH&R\u001e\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/unity3d/ads/core/data/repository/DiagnosticEventRepository;", "", "diagnosticEvents", "Lkotlinx/coroutines/flow/SharedFlow;", "", "Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticEvent;", "getDiagnosticEvents", "()Lkotlinx/coroutines/flow/SharedFlow;", "addDiagnosticEvent", "", "diagnosticEvent", "clear", "configure", "diagnosticsEventsConfiguration", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$DiagnosticEventsConfiguration;", "flush", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface DiagnosticEventRepository {
    void addDiagnosticEvent(gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent diagnosticEvent);

    void clear();

    void configure(gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration diagnosticsEventsConfiguration);

    void flush();

    kotlinx.coroutines.flow.SharedFlow<java.util.List<gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent>> getDiagnosticEvents();
}
