package com.google.android.gms.drive;

/* JADX INFO: loaded from: classes4.dex */
@java.lang.Deprecated
public final class Drive {

    @java.lang.Deprecated
    public static final com.google.android.gms.common.api.Api<com.google.android.gms.common.api.Api.ApiOptions.NoOptions> API;
    public static final com.google.android.gms.common.api.Api.ClientKey<com.google.android.gms.internal.drive.zzaw> CLIENT_KEY;

    @java.lang.Deprecated
    public static final com.google.android.gms.drive.DriveApi DriveApi;

    @java.lang.Deprecated
    public static final com.google.android.gms.drive.DrivePreferencesApi DrivePreferencesApi;
    public static final com.google.android.gms.common.api.Scope SCOPE_APPFOLDER;
    public static final com.google.android.gms.common.api.Scope SCOPE_FILE;
    private static final com.google.android.gms.common.api.Api.AbstractClientBuilder<com.google.android.gms.internal.drive.zzaw, com.google.android.gms.common.api.Api.ApiOptions.NoOptions> zzq;
    private static final com.google.android.gms.common.api.Api.AbstractClientBuilder<com.google.android.gms.internal.drive.zzaw, com.google.android.gms.drive.Drive.zzb> zzr;
    private static final com.google.android.gms.common.api.Api.AbstractClientBuilder<com.google.android.gms.internal.drive.zzaw, com.google.android.gms.drive.Drive.zza> zzs;
    private static final com.google.android.gms.common.api.Scope zzt;
    private static final com.google.android.gms.common.api.Scope zzu;
    private static final com.google.android.gms.common.api.Api<com.google.android.gms.drive.Drive.zzb> zzv;
    public static final com.google.android.gms.common.api.Api<com.google.android.gms.drive.Drive.zza> zzw;

    @java.lang.Deprecated
    private static final com.google.android.gms.drive.zzj zzx;
    private static final com.google.android.gms.drive.zzl zzy;

    public static class zzb implements com.google.android.gms.common.api.Api.ApiOptions.Optional {
    }

    private static void zza(com.google.android.gms.auth.api.signin.GoogleSignInAccount googleSignInAccount) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(googleSignInAccount);
        java.util.Set<com.google.android.gms.common.api.Scope> requestedScopes = googleSignInAccount.getRequestedScopes();
        com.google.android.gms.common.internal.Preconditions.checkArgument(requestedScopes.contains(SCOPE_FILE) || requestedScopes.contains(SCOPE_APPFOLDER) || requestedScopes.contains(zzt) || requestedScopes.contains(zzu), "You must request a Drive scope in order to interact with the Drive API.");
    }

    public static class zza implements com.google.android.gms.common.api.Api.ApiOptions.HasGoogleSignInAccountOptions {
        private final com.google.android.gms.auth.api.signin.GoogleSignInAccount zzaa;
        private final android.os.Bundle zzz = new android.os.Bundle();

        public zza(com.google.android.gms.auth.api.signin.GoogleSignInAccount googleSignInAccount) {
            this.zzaa = googleSignInAccount;
        }

        public final android.os.Bundle zzh() {
            return this.zzz;
        }

        @Override // com.google.android.gms.common.api.Api.ApiOptions.HasGoogleSignInAccountOptions
        public final com.google.android.gms.auth.api.signin.GoogleSignInAccount getGoogleSignInAccount() {
            return this.zzaa;
        }

        public final boolean equals(java.lang.Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj != null && obj.getClass() == getClass()) {
                com.google.android.gms.drive.Drive.zza zzaVar = (com.google.android.gms.drive.Drive.zza) obj;
                if (!com.google.android.gms.common.internal.Objects.equal(this.zzaa, zzaVar.getGoogleSignInAccount())) {
                    return false;
                }
                java.lang.String string = this.zzz.getString("method_trace_filename");
                java.lang.String string2 = zzaVar.zzz.getString("method_trace_filename");
                if (((string == null && string2 == null) || (string != null && string2 != null && string.equals(string2))) && this.zzz.getBoolean("bypass_initial_sync") == zzaVar.zzz.getBoolean("bypass_initial_sync") && this.zzz.getInt("proxy_type") == zzaVar.zzz.getInt("proxy_type")) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return com.google.android.gms.common.internal.Objects.hashCode(this.zzaa, this.zzz.getString("method_trace_filename", ""), java.lang.Integer.valueOf(this.zzz.getInt("proxy_type")), java.lang.Boolean.valueOf(this.zzz.getBoolean("bypass_initial_sync")));
        }
    }

    @java.lang.Deprecated
    public static com.google.android.gms.drive.DriveClient getDriveClient(android.content.Context context, com.google.android.gms.auth.api.signin.GoogleSignInAccount googleSignInAccount) {
        zza(googleSignInAccount);
        return new com.google.android.gms.internal.drive.zzbb(context, new com.google.android.gms.drive.Drive.zza(googleSignInAccount));
    }

    @java.lang.Deprecated
    public static com.google.android.gms.drive.DriveClient getDriveClient(android.app.Activity activity, com.google.android.gms.auth.api.signin.GoogleSignInAccount googleSignInAccount) {
        zza(googleSignInAccount);
        return new com.google.android.gms.internal.drive.zzbb(activity, new com.google.android.gms.drive.Drive.zza(googleSignInAccount));
    }

    @java.lang.Deprecated
    public static com.google.android.gms.drive.DriveResourceClient getDriveResourceClient(android.content.Context context, com.google.android.gms.auth.api.signin.GoogleSignInAccount googleSignInAccount) {
        zza(googleSignInAccount);
        return new com.google.android.gms.internal.drive.zzch(context, new com.google.android.gms.drive.Drive.zza(googleSignInAccount));
    }

    @java.lang.Deprecated
    public static com.google.android.gms.drive.DriveResourceClient getDriveResourceClient(android.app.Activity activity, com.google.android.gms.auth.api.signin.GoogleSignInAccount googleSignInAccount) {
        zza(googleSignInAccount);
        return new com.google.android.gms.internal.drive.zzch(activity, new com.google.android.gms.drive.Drive.zza(googleSignInAccount));
    }

    private Drive() {
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.google.android.gms.drive.zzj, com.google.android.gms.internal.drive.zzbr] */
    /* JADX WARN: Type inference failed for: r0v3, types: [com.google.android.gms.drive.zzl, com.google.android.gms.internal.drive.zzeb] */
    static {
        com.google.android.gms.common.api.Api.ClientKey<com.google.android.gms.internal.drive.zzaw> clientKey = new com.google.android.gms.common.api.Api.ClientKey<>();
        CLIENT_KEY = clientKey;
        com.google.android.gms.drive.zze zzeVar = new com.google.android.gms.drive.zze();
        zzq = zzeVar;
        com.google.android.gms.drive.zzf zzfVar = new com.google.android.gms.drive.zzf();
        zzr = zzfVar;
        com.google.android.gms.drive.zzg zzgVar = new com.google.android.gms.drive.zzg();
        zzs = zzgVar;
        SCOPE_FILE = new com.google.android.gms.common.api.Scope(com.google.android.gms.common.Scopes.DRIVE_FILE);
        SCOPE_APPFOLDER = new com.google.android.gms.common.api.Scope(com.google.android.gms.common.Scopes.DRIVE_APPFOLDER);
        zzt = new com.google.android.gms.common.api.Scope(com.google.android.gms.common.Scopes.DRIVE_FULL);
        zzu = new com.google.android.gms.common.api.Scope(com.google.android.gms.common.Scopes.DRIVE_APPS);
        API = new com.google.android.gms.common.api.Api<>("Drive.API", zzeVar, clientKey);
        zzv = new com.google.android.gms.common.api.Api<>("Drive.INTERNAL_API", zzfVar, clientKey);
        zzw = new com.google.android.gms.common.api.Api<>("Drive.API_CONNECTIONLESS", zzgVar, clientKey);
        DriveApi = new com.google.android.gms.internal.drive.zzaf();
        zzx = new com.google.android.gms.internal.drive.zzbr();
        zzy = new com.google.android.gms.internal.drive.zzeb();
        DrivePreferencesApi = new com.google.android.gms.internal.drive.zzcb();
    }
}
