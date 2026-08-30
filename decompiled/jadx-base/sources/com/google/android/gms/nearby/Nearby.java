package com.google.android.gms.nearby;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class Nearby {

    @java.lang.Deprecated
    public static final com.google.android.gms.common.api.Api<com.google.android.gms.nearby.connection.ConnectionsOptions> CONNECTIONS_API = new com.google.android.gms.common.api.Api<>("Nearby.CONNECTIONS_API", com.google.android.gms.internal.nearby.zzdm.zzb, com.google.android.gms.internal.nearby.zzdm.zza);

    @java.lang.Deprecated
    public static final com.google.android.gms.nearby.connection.Connections Connections = new com.google.android.gms.internal.nearby.zzdm();

    @java.lang.Deprecated
    public static final com.google.android.gms.common.api.Api<com.google.android.gms.nearby.messages.MessagesOptions> MESSAGES_API = new com.google.android.gms.common.api.Api<>("Nearby.MESSAGES_API", com.google.android.gms.nearby.messages.internal.zzbw.zzc, com.google.android.gms.nearby.messages.internal.zzbw.zzb);

    @java.lang.Deprecated
    public static final com.google.android.gms.nearby.messages.Messages Messages = com.google.android.gms.nearby.messages.internal.zzbw.zza;
    public static final com.google.android.gms.nearby.messages.zzc zza = new com.google.android.gms.nearby.messages.internal.zzbx();

    @java.lang.Deprecated
    public static final com.google.android.gms.common.api.Api<com.google.android.gms.common.api.Api.ApiOptions.NoOptions> zzb = new com.google.android.gms.common.api.Api<>("Nearby.BOOTSTRAP_API", com.google.android.gms.internal.nearby.zzk.zzb, com.google.android.gms.internal.nearby.zzk.zza);

    @java.lang.Deprecated
    public static final com.google.android.gms.internal.nearby.zzh zzc = new com.google.android.gms.internal.nearby.zzk();

    private Nearby() {
    }

    public static final com.google.android.gms.nearby.connection.ConnectionsClient getConnectionsClient(android.app.Activity activity) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(activity, "Activity must not be null");
        return new com.google.android.gms.internal.nearby.zzcn(activity, (com.google.android.gms.nearby.connection.ConnectionsOptions) null);
    }

    public static final com.google.android.gms.nearby.messages.MessagesClient getMessagesClient(android.app.Activity activity) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(activity, "Activity must not be null");
        return new com.google.android.gms.nearby.messages.internal.zzbg(activity, (com.google.android.gms.nearby.messages.MessagesOptions) null);
    }

    public static boolean zza(android.content.Context context) {
        if (com.google.android.gms.common.wrappers.Wrappers.packageManager(context).checkCallingOrSelfPermission("com.google.android.providers.gsf.permission.READ_GSERVICES") == 0) {
            return com.google.android.gms.internal.nearby.zzhw.zza(context.getContentResolver(), "gms:nearby:requires_gms_check", true);
        }
        return true;
    }

    public static final com.google.android.gms.nearby.connection.ConnectionsClient getConnectionsClient(android.content.Context context) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(context, "Context must not be null");
        return new com.google.android.gms.internal.nearby.zzcn(context, (com.google.android.gms.nearby.connection.ConnectionsOptions) null);
    }

    public static final com.google.android.gms.nearby.messages.MessagesClient getMessagesClient(android.app.Activity activity, com.google.android.gms.nearby.messages.MessagesOptions messagesOptions) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(activity, "Activity must not be null");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(messagesOptions, "Options must not be null");
        return new com.google.android.gms.nearby.messages.internal.zzbg(activity, messagesOptions);
    }

    public static final com.google.android.gms.nearby.messages.MessagesClient getMessagesClient(android.content.Context context) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(context, "Context must not be null");
        return new com.google.android.gms.nearby.messages.internal.zzbg(context, (com.google.android.gms.nearby.messages.MessagesOptions) null);
    }

    public static final com.google.android.gms.nearby.messages.MessagesClient getMessagesClient(android.content.Context context, com.google.android.gms.nearby.messages.MessagesOptions messagesOptions) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(context, "Context must not be null");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(messagesOptions, "Options must not be null");
        return new com.google.android.gms.nearby.messages.internal.zzbg(context, messagesOptions);
    }
}
