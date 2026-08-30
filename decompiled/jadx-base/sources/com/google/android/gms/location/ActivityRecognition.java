package com.google.android.gms.location;

/* JADX INFO: compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public class ActivityRecognition {
    public static final com.google.android.gms.common.api.Api<com.google.android.gms.common.api.Api.ApiOptions.NoOptions> API;

    @java.lang.Deprecated
    public static final com.google.android.gms.location.ActivityRecognitionApi ActivityRecognitionApi;
    public static final java.lang.String CLIENT_NAME = "activity_recognition";
    private static final com.google.android.gms.common.api.Api.ClientKey<com.google.android.gms.internal.location.zzaz> zza;
    private static final com.google.android.gms.common.api.Api.AbstractClientBuilder<com.google.android.gms.internal.location.zzaz, com.google.android.gms.common.api.Api.ApiOptions.NoOptions> zzb;

    static {
        com.google.android.gms.common.api.Api.ClientKey<com.google.android.gms.internal.location.zzaz> clientKey = new com.google.android.gms.common.api.Api.ClientKey<>();
        zza = clientKey;
        com.google.android.gms.location.zza zzaVar = new com.google.android.gms.location.zza();
        zzb = zzaVar;
        API = new com.google.android.gms.common.api.Api<>("ActivityRecognition.API", zzaVar, clientKey);
        ActivityRecognitionApi = new com.google.android.gms.internal.location.zzg();
    }

    private ActivityRecognition() {
    }

    public static com.google.android.gms.location.ActivityRecognitionClient getClient(android.app.Activity activity) {
        return new com.google.android.gms.location.ActivityRecognitionClient(activity);
    }

    public static com.google.android.gms.location.ActivityRecognitionClient getClient(android.content.Context context) {
        return new com.google.android.gms.location.ActivityRecognitionClient(context);
    }
}
