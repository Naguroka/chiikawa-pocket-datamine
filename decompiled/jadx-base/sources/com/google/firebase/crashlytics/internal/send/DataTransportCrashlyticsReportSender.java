package com.google.firebase.crashlytics.internal.send;

/* JADX INFO: loaded from: classes5.dex */
public class DataTransportCrashlyticsReportSender {
    private static final java.lang.String CRASHLYTICS_TRANSPORT_NAME = "FIREBASE_CRASHLYTICS_REPORT";
    private final com.google.firebase.crashlytics.internal.send.ReportQueue reportQueue;
    private final com.google.android.datatransport.Transformer<com.google.firebase.crashlytics.internal.model.CrashlyticsReport, byte[]> transportTransform;
    private static final com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform TRANSFORM = new com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform();
    private static final java.lang.String CRASHLYTICS_ENDPOINT = mergeStrings("hts/cahyiseot-agolai.o/1frlglgc/aclg", "tp:/rsltcrprsp.ogepscmv/ieo/eaybtho");
    private static final java.lang.String CRASHLYTICS_API_KEY = mergeStrings("AzSBpY4F0rHiHFdinTvM", "IayrSTFL9eJ69YeSUO2");
    private static final com.google.android.datatransport.Transformer<com.google.firebase.crashlytics.internal.model.CrashlyticsReport, byte[]> DEFAULT_TRANSFORM = new com.google.android.datatransport.Transformer() { // from class: com.google.firebase.crashlytics.internal.send.DataTransportCrashlyticsReportSender$$ExternalSyntheticLambda0
        @Override // com.google.android.datatransport.Transformer
        public final java.lang.Object apply(java.lang.Object obj) {
            return com.google.firebase.crashlytics.internal.send.DataTransportCrashlyticsReportSender.TRANSFORM.reportToJson((com.google.firebase.crashlytics.internal.model.CrashlyticsReport) obj).getBytes(java.nio.charset.Charset.forName(com.adjust.sdk.Constants.ENCODING));
        }
    };

    public static com.google.firebase.crashlytics.internal.send.DataTransportCrashlyticsReportSender create(android.content.Context context, com.google.firebase.crashlytics.internal.settings.SettingsProvider settingsProvider, com.google.firebase.crashlytics.internal.common.OnDemandCounter onDemandCounter) {
        com.google.android.datatransport.runtime.TransportRuntime.initialize(context);
        com.google.android.datatransport.TransportFactory transportFactoryNewFactory = com.google.android.datatransport.runtime.TransportRuntime.getInstance().newFactory(new com.google.android.datatransport.cct.CCTDestination(CRASHLYTICS_ENDPOINT, CRASHLYTICS_API_KEY));
        com.google.android.datatransport.Encoding encodingOf = com.google.android.datatransport.Encoding.of("json");
        com.google.android.datatransport.Transformer<com.google.firebase.crashlytics.internal.model.CrashlyticsReport, byte[]> transformer = DEFAULT_TRANSFORM;
        return new com.google.firebase.crashlytics.internal.send.DataTransportCrashlyticsReportSender(new com.google.firebase.crashlytics.internal.send.ReportQueue(transportFactoryNewFactory.getTransport(CRASHLYTICS_TRANSPORT_NAME, com.google.firebase.crashlytics.internal.model.CrashlyticsReport.class, encodingOf, transformer), settingsProvider.getSettingsSync(), onDemandCounter), transformer);
    }

    DataTransportCrashlyticsReportSender(com.google.firebase.crashlytics.internal.send.ReportQueue reportQueue, com.google.android.datatransport.Transformer<com.google.firebase.crashlytics.internal.model.CrashlyticsReport, byte[]> transformer) {
        this.reportQueue = reportQueue;
        this.transportTransform = transformer;
    }

    public com.google.android.gms.tasks.Task<com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId> enqueueReport(com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId crashlyticsReportWithSessionId, boolean z) {
        return this.reportQueue.enqueueReport(crashlyticsReportWithSessionId, z).getTask();
    }

    private static java.lang.String mergeStrings(java.lang.String str, java.lang.String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new java.lang.IllegalArgumentException("Invalid input received");
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(str.length() + str2.length());
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
            if (str2.length() > i) {
                sb.append(str2.charAt(i));
            }
        }
        return sb.toString();
    }
}
