package com.google.firebase.remoteconfig.interop.rollouts;

/* JADX INFO: loaded from: classes5.dex */
@com.google.firebase.encoders.annotations.Encodable
public abstract class RolloutAssignment {
    private static final java.lang.String PARAMETER_KEY = "parameterKey";
    private static final java.lang.String PARAMETER_VALUE = "parameterValue";
    public static final com.google.firebase.encoders.DataEncoder ROLLOUT_ASSIGNMENT_JSON_ENCODER = new com.google.firebase.encoders.json.JsonDataEncoderBuilder().configureWith(com.google.firebase.remoteconfig.interop.rollouts.AutoRolloutAssignmentEncoder.CONFIG).build();
    private static final java.lang.String ROLLOUT_ID = "rolloutId";
    private static final java.lang.String TEMPLATE_VERSION = "templateVersion";
    private static final java.lang.String VARIANT_ID = "variantId";

    public static abstract class Builder {
        public abstract com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment build();

        public abstract com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment.Builder setParameterKey(java.lang.String str);

        public abstract com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment.Builder setParameterValue(java.lang.String str);

        public abstract com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment.Builder setRolloutId(java.lang.String str);

        public abstract com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment.Builder setTemplateVersion(long j);

        public abstract com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment.Builder setVariantId(java.lang.String str);
    }

    public abstract java.lang.String getParameterKey();

    public abstract java.lang.String getParameterValue();

    public abstract java.lang.String getRolloutId();

    public abstract long getTemplateVersion();

    public abstract java.lang.String getVariantId();

    public static com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment create(org.json.JSONObject jSONObject) throws org.json.JSONException {
        return builder().setRolloutId(jSONObject.getString(ROLLOUT_ID)).setVariantId(jSONObject.getString(VARIANT_ID)).setParameterKey(jSONObject.getString(PARAMETER_KEY)).setParameterValue(jSONObject.getString(PARAMETER_VALUE)).setTemplateVersion(jSONObject.getLong(TEMPLATE_VERSION)).build();
    }

    public static com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment create(java.lang.String str) throws org.json.JSONException {
        return create(new org.json.JSONObject(str));
    }

    public static com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment.Builder builder() {
        return new com.google.firebase.remoteconfig.interop.rollouts.AutoValue_RolloutAssignment.Builder();
    }
}
