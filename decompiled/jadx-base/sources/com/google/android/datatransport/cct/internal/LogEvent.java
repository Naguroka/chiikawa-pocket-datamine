package com.google.android.datatransport.cct.internal;

/* JADX INFO: loaded from: classes4.dex */
public abstract class LogEvent {

    public static abstract class Builder {
        public abstract com.google.android.datatransport.cct.internal.LogEvent build();

        public abstract com.google.android.datatransport.cct.internal.LogEvent.Builder setComplianceData(com.google.android.datatransport.cct.internal.ComplianceData complianceData);

        public abstract com.google.android.datatransport.cct.internal.LogEvent.Builder setEventCode(java.lang.Integer num);

        public abstract com.google.android.datatransport.cct.internal.LogEvent.Builder setEventTimeMs(long j);

        public abstract com.google.android.datatransport.cct.internal.LogEvent.Builder setEventUptimeMs(long j);

        public abstract com.google.android.datatransport.cct.internal.LogEvent.Builder setExperimentIds(com.google.android.datatransport.cct.internal.ExperimentIds experimentIds);

        public abstract com.google.android.datatransport.cct.internal.LogEvent.Builder setNetworkConnectionInfo(com.google.android.datatransport.cct.internal.NetworkConnectionInfo networkConnectionInfo);

        abstract com.google.android.datatransport.cct.internal.LogEvent.Builder setSourceExtension(byte[] bArr);

        abstract com.google.android.datatransport.cct.internal.LogEvent.Builder setSourceExtensionJsonProto3(java.lang.String str);

        public abstract com.google.android.datatransport.cct.internal.LogEvent.Builder setTimezoneOffsetSeconds(long j);
    }

    public abstract com.google.android.datatransport.cct.internal.ComplianceData getComplianceData();

    public abstract java.lang.Integer getEventCode();

    public abstract long getEventTimeMs();

    public abstract long getEventUptimeMs();

    public abstract com.google.android.datatransport.cct.internal.ExperimentIds getExperimentIds();

    public abstract com.google.android.datatransport.cct.internal.NetworkConnectionInfo getNetworkConnectionInfo();

    public abstract byte[] getSourceExtension();

    public abstract java.lang.String getSourceExtensionJsonProto3();

    public abstract long getTimezoneOffsetSeconds();

    public static com.google.android.datatransport.cct.internal.LogEvent.Builder protoBuilder(byte[] bArr) {
        return builder().setSourceExtension(bArr);
    }

    public static com.google.android.datatransport.cct.internal.LogEvent.Builder jsonBuilder(java.lang.String str) {
        return builder().setSourceExtensionJsonProto3(str);
    }

    private static com.google.android.datatransport.cct.internal.LogEvent.Builder builder() {
        return new com.google.android.datatransport.cct.internal.AutoValue_LogEvent.Builder();
    }
}
