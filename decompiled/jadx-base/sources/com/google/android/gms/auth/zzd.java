package com.google.android.gms.auth;

/* JADX INFO: loaded from: classes4.dex */
public class zzd {
    public static final int CHANGE_TYPE_ACCOUNT_ADDED = 1;
    public static final int CHANGE_TYPE_ACCOUNT_REMOVED = 2;
    public static final int CHANGE_TYPE_ACCOUNT_RENAMED_FROM = 3;
    public static final int CHANGE_TYPE_ACCOUNT_RENAMED_TO = 4;
    public static final java.lang.String GOOGLE_ACCOUNT_TYPE = "com.google";
    public static final java.lang.String KEY_SUPPRESS_PROGRESS_SCREEN = "suppressProgressScreen";
    public static final java.lang.String WORK_ACCOUNT_TYPE = "com.google.work";
    private static final java.lang.String[] ACCEPTABLE_ACCOUNT_TYPES = {"com.google", "com.google.work", "cn.google"};
    public static final java.lang.String KEY_CALLER_UID = "callerUid";
    public static final java.lang.String KEY_ANDROID_PACKAGE_NAME = "androidPackageName";
    private static final android.content.ComponentName zzm = new android.content.ComponentName("com.google.android.gms", "com.google.android.gms.auth.GetToken");
    private static final com.google.android.gms.common.logging.Logger zzn = new com.google.android.gms.common.logging.Logger("Auth", "GoogleAuthUtil");

    @java.lang.Deprecated
    public static java.lang.String getToken(android.content.Context context, java.lang.String str, java.lang.String str2) throws java.io.IOException, com.google.android.gms.auth.GoogleAuthException {
        return getToken(context, new android.accounts.Account(str, "com.google"), str2);
    }

    @java.lang.Deprecated
    public static java.lang.String getToken(android.content.Context context, java.lang.String str, java.lang.String str2, android.os.Bundle bundle) throws java.io.IOException, com.google.android.gms.auth.GoogleAuthException {
        return getToken(context, new android.accounts.Account(str, "com.google"), str2, bundle);
    }

    public static java.lang.String getToken(android.content.Context context, android.accounts.Account account, java.lang.String str) throws java.io.IOException, com.google.android.gms.auth.GoogleAuthException {
        return getToken(context, account, str, new android.os.Bundle());
    }

    public static java.lang.String getToken(android.content.Context context, android.accounts.Account account, java.lang.String str, android.os.Bundle bundle) throws java.io.IOException, com.google.android.gms.auth.GoogleAuthException {
        zzb(account);
        return zzb(context, account, str, bundle).zzb();
    }

    public static com.google.android.gms.auth.TokenData zzb(android.content.Context context, android.accounts.Account account, java.lang.String str, android.os.Bundle bundle) throws com.google.android.gms.auth.GoogleAuthException, java.io.IOException {
        com.google.android.gms.common.internal.Preconditions.checkNotMainThread("Calling this from your main thread can lead to deadlock");
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str, "Scope cannot be empty or null.");
        zzb(account);
        ensurePlayServicesAvailable(context, 8400000);
        android.os.Bundle bundle2 = bundle == null ? new android.os.Bundle() : new android.os.Bundle(bundle);
        java.lang.String str2 = context.getApplicationInfo().packageName;
        bundle2.putString("clientPackageName", str2);
        java.lang.String str3 = KEY_ANDROID_PACKAGE_NAME;
        if (android.text.TextUtils.isEmpty(bundle2.getString(str3))) {
            bundle2.putString(str3, str2);
        }
        bundle2.putLong("service_connection_start_time_millis", android.os.SystemClock.elapsedRealtime());
        return (com.google.android.gms.auth.TokenData) zza(context, zzm, new com.google.android.gms.auth.zze(account, str, bundle2));
    }

    @java.lang.Deprecated
    public static void invalidateToken(android.content.Context context, java.lang.String str) {
        android.accounts.AccountManager.get(context).invalidateAuthToken("com.google", str);
    }

    public static void clearToken(android.content.Context context, java.lang.String str) throws com.google.android.gms.auth.GoogleAuthException, java.io.IOException {
        com.google.android.gms.common.internal.Preconditions.checkNotMainThread("Calling this from your main thread can lead to deadlock");
        ensurePlayServicesAvailable(context, 8400000);
        android.os.Bundle bundle = new android.os.Bundle();
        java.lang.String str2 = context.getApplicationInfo().packageName;
        bundle.putString("clientPackageName", str2);
        java.lang.String str3 = KEY_ANDROID_PACKAGE_NAME;
        if (!bundle.containsKey(str3)) {
            bundle.putString(str3, str2);
        }
        zza(context, zzm, new com.google.android.gms.auth.zzf(str, bundle));
    }

    public static java.util.List<com.google.android.gms.auth.AccountChangeEvent> getAccountChangeEvents(android.content.Context context, int i, java.lang.String str) throws com.google.android.gms.auth.GoogleAuthException, java.io.IOException {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str, "accountName must be provided");
        com.google.android.gms.common.internal.Preconditions.checkNotMainThread("Calling this from your main thread can lead to deadlock");
        ensurePlayServicesAvailable(context, 8400000);
        return (java.util.List) zza(context, zzm, new com.google.android.gms.auth.zzg(str, i));
    }

    public static java.lang.String getAccountId(android.content.Context context, java.lang.String str) throws com.google.android.gms.auth.GoogleAuthException, java.io.IOException {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str, "accountName must be provided");
        com.google.android.gms.common.internal.Preconditions.checkNotMainThread("Calling this from your main thread can lead to deadlock");
        ensurePlayServicesAvailable(context, 8400000);
        return getToken(context, str, "^^_account_id_^^", new android.os.Bundle());
    }

    public static android.os.Bundle removeAccount(android.content.Context context, android.accounts.Account account) throws com.google.android.gms.auth.GoogleAuthException, java.io.IOException {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(context);
        zzb(account);
        ensurePlayServicesAvailable(context, 8400000);
        return (android.os.Bundle) zza(context, zzm, new com.google.android.gms.auth.zzh(account));
    }

    public static java.lang.Boolean requestGoogleAccountsAccess(android.content.Context context) throws com.google.android.gms.auth.GoogleAuthException, java.io.IOException {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(context);
        ensurePlayServicesAvailable(context, 11400000);
        return (java.lang.Boolean) zza(context, zzm, new com.google.android.gms.auth.zzi(context.getApplicationInfo().packageName));
    }

    private static void zzb(android.accounts.Account account) {
        if (account == null) {
            throw new java.lang.IllegalArgumentException("Account cannot be null");
        }
        if (android.text.TextUtils.isEmpty(account.name)) {
            throw new java.lang.IllegalArgumentException("Account name cannot be empty!");
        }
        for (java.lang.String str : ACCEPTABLE_ACCOUNT_TYPES) {
            if (str.equals(account.type)) {
                return;
            }
        }
        throw new java.lang.IllegalArgumentException("Account type not supported");
    }

    private static void ensurePlayServicesAvailable(android.content.Context context, int i) throws com.google.android.gms.auth.GoogleAuthException {
        try {
            com.google.android.gms.common.GooglePlayServicesUtilLight.ensurePlayServicesAvailable(context.getApplicationContext(), i);
        } catch (com.google.android.gms.common.GooglePlayServicesNotAvailableException e) {
            throw new com.google.android.gms.auth.GoogleAuthException(e.getMessage());
        } catch (com.google.android.gms.common.GooglePlayServicesRepairableException e2) {
            throw new com.google.android.gms.auth.GooglePlayServicesAvailabilityException(e2.getConnectionStatusCode(), e2.getMessage(), e2.getIntent());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T> T zza(T t) throws java.io.IOException {
        if (t != null) {
            return t;
        }
        zzn.w("GoogleAuthUtil", "Binder call returned null.");
        throw new java.io.IOException("Service unavailable.");
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private static <T> T zza(android.content.Context context, android.content.ComponentName componentName, com.google.android.gms.auth.zzj<T> zzjVar) throws java.io.IOException, com.google.android.gms.auth.GoogleAuthException {
        com.google.android.gms.common.BlockingServiceConnection blockingServiceConnection = new com.google.android.gms.common.BlockingServiceConnection();
        com.google.android.gms.common.internal.GmsClientSupervisor gmsClientSupervisor = com.google.android.gms.common.internal.GmsClientSupervisor.getInstance(context);
        try {
            if (gmsClientSupervisor.bindService(componentName, blockingServiceConnection, "GoogleAuthUtil")) {
                try {
                    T tZzb = zzjVar.zzb(blockingServiceConnection.getService());
                    gmsClientSupervisor.unbindService(componentName, blockingServiceConnection, "GoogleAuthUtil");
                    return tZzb;
                } catch (android.os.RemoteException | java.lang.InterruptedException e) {
                    zzn.i("GoogleAuthUtil", "Error on service connection.", e);
                    throw new java.io.IOException("Error on service connection.", e);
                }
            }
            throw new java.io.IOException("Could not bind to service.");
        } catch (java.lang.Throwable th) {
            gmsClientSupervisor.unbindService(componentName, blockingServiceConnection, "GoogleAuthUtil");
            throw th;
        }
    }

    zzd() {
    }
}
