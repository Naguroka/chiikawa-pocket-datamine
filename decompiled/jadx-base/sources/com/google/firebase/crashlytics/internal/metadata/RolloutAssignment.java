package com.google.firebase.crashlytics.internal.metadata;

/* JADX INFO: loaded from: classes5.dex */
@com.google.firebase.encoders.annotations.Encodable
public abstract class RolloutAssignment {
    private static final int MAX_PARAMETER_VALUE_LENGTH = 256;
    public static final com.google.firebase.encoders.DataEncoder ROLLOUT_ASSIGNMENT_JSON_ENCODER = new com.google.firebase.encoders.json.JsonDataEncoderBuilder().configureWith(com.google.firebase.crashlytics.internal.metadata.AutoRolloutAssignmentEncoder.CONFIG).build();

    public abstract java.lang.String getParameterKey();

    public abstract java.lang.String getParameterValue();

    public abstract java.lang.String getRolloutId();

    public abstract long getTemplateVersion();

    public abstract java.lang.String getVariantId();

    public static com.google.firebase.crashlytics.internal.metadata.RolloutAssignment create(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, long j) {
        return new com.google.firebase.crashlytics.internal.metadata.AutoValue_RolloutAssignment(str, str2, validate(str3), str4, j);
    }

    static com.google.firebase.crashlytics.internal.metadata.RolloutAssignment create(java.lang.String str) throws org.json.JSONException {
        org.json.JSONObject jSONObject = new org.json.JSONObject(str);
        return create(jSONObject.getString("rolloutId"), jSONObject.getString("parameterKey"), jSONObject.getString("parameterValue"), jSONObject.getString("variantId"), jSONObject.getLong("templateVersion"));
    }

    public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment toReportProto() {
        return com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.builder().setRolloutVariant(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant.builder().setVariantId(getVariantId()).setRolloutId(getRolloutId()).build()).setParameterKey(getParameterKey()).setParameterValue(getParameterValue()).setTemplateVersion(getTemplateVersion()).build();
    }

    private static java.lang.String validate(java.lang.String str) {
        return str.length() > 256 ? str.substring(0, 256) : str;
    }
}
