package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class BaseGmsClient<T extends android.os.IInterface> {
    public static final int CONNECT_STATE_CONNECTED = 4;
    public static final int CONNECT_STATE_DISCONNECTED = 1;
    public static final int CONNECT_STATE_DISCONNECTING = 5;
    public static final java.lang.String DEFAULT_ACCOUNT = "<<default account>>";
    public static final java.lang.String KEY_PENDING_INTENT = "pendingIntent";
    private volatile java.lang.String zzA;
    private volatile com.google.android.gms.common.wrappers.AttributionSourceWrapper zzB;
    private com.google.android.gms.common.ConnectionResult zzC;
    private boolean zzD;
    private volatile com.google.android.gms.common.internal.zzk zzE;
    com.google.android.gms.common.internal.zzu zza;
    final android.os.Handler zzb;
    protected com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks zzc;
    protected java.util.concurrent.atomic.AtomicInteger zzd;
    private int zzf;
    private long zzg;
    private long zzh;
    private int zzi;
    private long zzj;
    private volatile java.lang.String zzk;
    private final android.content.Context zzl;
    private final android.os.Looper zzm;
    private final com.google.android.gms.common.internal.GmsClientSupervisor zzn;
    private final com.google.android.gms.common.GoogleApiAvailabilityLight zzo;
    private final java.lang.Object zzp;
    private final java.lang.Object zzq;
    private com.google.android.gms.common.internal.IGmsServiceBroker zzr;
    private android.os.IInterface zzs;
    private final java.util.ArrayList zzt;
    private com.google.android.gms.common.internal.zze zzu;
    private int zzv;
    private final com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks zzw;
    private final com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener zzx;
    private final int zzy;
    private final java.lang.String zzz;
    private static final com.google.android.gms.common.Feature[] zze = new com.google.android.gms.common.Feature[0];
    public static final java.lang.String[] GOOGLE_PLUS_REQUIRED_FEATURES = {"service_esmobile", "service_googleme"};

    /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.6.0 */
    public interface BaseConnectionCallbacks {
        public static final int CAUSE_DEAD_OBJECT_EXCEPTION = 3;
        public static final int CAUSE_SERVICE_DISCONNECTED = 1;

        void onConnected(android.os.Bundle bundle);

        void onConnectionSuspended(int i);
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.6.0 */
    public interface BaseOnConnectionFailedListener {
        void onConnectionFailed(com.google.android.gms.common.ConnectionResult connectionResult);
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.6.0 */
    public interface ConnectionProgressReportCallbacks {
        void onReportServiceBinding(com.google.android.gms.common.ConnectionResult connectionResult);
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.6.0 */
    protected class LegacyClientCallbackAdapter implements com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks {
        public LegacyClientCallbackAdapter() {
        }

        @Override // com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks
        public final void onReportServiceBinding(com.google.android.gms.common.ConnectionResult connectionResult) {
            if (connectionResult.isSuccess()) {
                com.google.android.gms.common.internal.BaseGmsClient baseGmsClient = com.google.android.gms.common.internal.BaseGmsClient.this;
                baseGmsClient.getRemoteService(null, baseGmsClient.getScopes());
            } else if (com.google.android.gms.common.internal.BaseGmsClient.this.zzx != null) {
                com.google.android.gms.common.internal.BaseGmsClient.this.zzx.onConnectionFailed(connectionResult);
            }
        }
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.6.0 */
    public interface SignOutCallbacks {
        void onSignOutComplete();
    }

    protected BaseGmsClient(android.content.Context context, android.os.Handler handler, com.google.android.gms.common.internal.GmsClientSupervisor gmsClientSupervisor, com.google.android.gms.common.GoogleApiAvailabilityLight googleApiAvailabilityLight, int i, com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks baseConnectionCallbacks, com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener baseOnConnectionFailedListener) {
        this.zzk = null;
        this.zzp = new java.lang.Object();
        this.zzq = new java.lang.Object();
        this.zzt = new java.util.ArrayList();
        this.zzv = 1;
        this.zzC = null;
        this.zzD = false;
        this.zzE = null;
        this.zzd = new java.util.concurrent.atomic.AtomicInteger(0);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(context, "Context must not be null");
        this.zzl = context;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(handler, "Handler must not be null");
        this.zzb = handler;
        this.zzm = handler.getLooper();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(gmsClientSupervisor, "Supervisor must not be null");
        this.zzn = gmsClientSupervisor;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(googleApiAvailabilityLight, "API availability must not be null");
        this.zzo = googleApiAvailabilityLight;
        this.zzy = i;
        this.zzw = baseConnectionCallbacks;
        this.zzx = baseOnConnectionFailedListener;
        this.zzz = null;
    }

    static /* bridge */ /* synthetic */ void zzj(com.google.android.gms.common.internal.BaseGmsClient baseGmsClient, com.google.android.gms.common.internal.zzk zzkVar) {
        baseGmsClient.zzE = zzkVar;
        if (baseGmsClient.usesClientTelemetry()) {
            com.google.android.gms.common.internal.ConnectionTelemetryConfiguration connectionTelemetryConfiguration = zzkVar.zzd;
            com.google.android.gms.common.internal.RootTelemetryConfigManager.getInstance().zza(connectionTelemetryConfiguration == null ? null : connectionTelemetryConfiguration.zza());
        }
    }

    static /* bridge */ /* synthetic */ void zzk(com.google.android.gms.common.internal.BaseGmsClient baseGmsClient, int i) {
        int i2;
        int i3;
        synchronized (baseGmsClient.zzp) {
            i2 = baseGmsClient.zzv;
        }
        if (i2 == 3) {
            baseGmsClient.zzD = true;
            i3 = 5;
        } else {
            i3 = 4;
        }
        android.os.Handler handler = baseGmsClient.zzb;
        handler.sendMessage(handler.obtainMessage(i3, baseGmsClient.zzd.get(), 16));
    }

    static /* bridge */ /* synthetic */ boolean zzn(com.google.android.gms.common.internal.BaseGmsClient baseGmsClient, int i, int i2, android.os.IInterface iInterface) {
        synchronized (baseGmsClient.zzp) {
            if (baseGmsClient.zzv != i) {
                return false;
            }
            baseGmsClient.zzp(i2, iInterface);
            return true;
        }
    }

    static /* bridge */ /* synthetic */ boolean zzo(com.google.android.gms.common.internal.BaseGmsClient baseGmsClient) {
        if (baseGmsClient.zzD || android.text.TextUtils.isEmpty(baseGmsClient.getServiceDescriptor()) || android.text.TextUtils.isEmpty(baseGmsClient.getLocalStartServiceAction())) {
            return false;
        }
        try {
            java.lang.Class.forName(baseGmsClient.getServiceDescriptor());
            return true;
        } catch (java.lang.ClassNotFoundException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzp(int i, android.os.IInterface iInterface) {
        com.google.android.gms.common.internal.zzu zzuVar;
        com.google.android.gms.common.internal.Preconditions.checkArgument((i == 4) == (iInterface != null));
        synchronized (this.zzp) {
            this.zzv = i;
            this.zzs = iInterface;
            android.os.Bundle bundle = null;
            if (i == 1) {
                com.google.android.gms.common.internal.zze zzeVar = this.zzu;
                if (zzeVar != null) {
                    com.google.android.gms.common.internal.GmsClientSupervisor gmsClientSupervisor = this.zzn;
                    java.lang.String strZzb = this.zza.zzb();
                    com.google.android.gms.common.internal.Preconditions.checkNotNull(strZzb);
                    java.lang.String str = strZzb;
                    gmsClientSupervisor.zzc(strZzb, this.zza.zza(), 4225, zzeVar, zze(), this.zza.zzc());
                    this.zzu = null;
                }
            } else if (i == 2 || i == 3) {
                com.google.android.gms.common.internal.zze zzeVar2 = this.zzu;
                if (zzeVar2 != null && (zzuVar = this.zza) != null) {
                    android.util.Log.e("GmsClient", "Calling connect() while still connected, missing disconnect() for " + zzuVar.zzb() + " on " + zzuVar.zza());
                    com.google.android.gms.common.internal.GmsClientSupervisor gmsClientSupervisor2 = this.zzn;
                    java.lang.String strZzb2 = this.zza.zzb();
                    com.google.android.gms.common.internal.Preconditions.checkNotNull(strZzb2);
                    java.lang.String str2 = strZzb2;
                    gmsClientSupervisor2.zzc(strZzb2, this.zza.zza(), 4225, zzeVar2, zze(), this.zza.zzc());
                    this.zzd.incrementAndGet();
                }
                com.google.android.gms.common.internal.zze zzeVar3 = new com.google.android.gms.common.internal.zze(this, this.zzd.get());
                this.zzu = zzeVar3;
                com.google.android.gms.common.internal.zzu zzuVar2 = (this.zzv != 3 || getLocalStartServiceAction() == null) ? new com.google.android.gms.common.internal.zzu(getStartServicePackage(), getStartServiceAction(), false, 4225, getUseDynamicLookup()) : new com.google.android.gms.common.internal.zzu(getContext().getPackageName(), getLocalStartServiceAction(), true, 4225, false);
                this.zza = zzuVar2;
                if (zzuVar2.zzc() && getMinApkVersion() < 17895000) {
                    throw new java.lang.IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(java.lang.String.valueOf(this.zza.zzb())));
                }
                com.google.android.gms.common.internal.GmsClientSupervisor gmsClientSupervisor3 = this.zzn;
                java.lang.String strZzb3 = this.zza.zzb();
                com.google.android.gms.common.internal.Preconditions.checkNotNull(strZzb3);
                java.lang.String str3 = strZzb3;
                com.google.android.gms.common.ConnectionResult connectionResultZza = gmsClientSupervisor3.zza(new com.google.android.gms.common.internal.zzo(strZzb3, this.zza.zza(), 4225, this.zza.zzc()), zzeVar3, zze(), getBindServiceExecutor());
                if (!connectionResultZza.isSuccess()) {
                    android.util.Log.w("GmsClient", "unable to connect to service: " + this.zza.zzb() + " on " + this.zza.zza());
                    int errorCode = connectionResultZza.getErrorCode() == -1 ? 16 : connectionResultZza.getErrorCode();
                    if (connectionResultZza.getResolution() != null) {
                        bundle = new android.os.Bundle();
                        bundle.putParcelable(KEY_PENDING_INTENT, connectionResultZza.getResolution());
                    }
                    zzl(errorCode, bundle, this.zzd.get());
                }
            } else if (i == 4) {
                com.google.android.gms.common.internal.Preconditions.checkNotNull(iInterface);
                onConnectedLocked(iInterface);
            }
        }
    }

    public void checkAvailabilityAndConnect() {
        int iIsGooglePlayServicesAvailable = this.zzo.isGooglePlayServicesAvailable(this.zzl, getMinApkVersion());
        if (iIsGooglePlayServicesAvailable == 0) {
            connect(new com.google.android.gms.common.internal.BaseGmsClient.LegacyClientCallbackAdapter());
        } else {
            zzp(1, null);
            triggerNotAvailable(new com.google.android.gms.common.internal.BaseGmsClient.LegacyClientCallbackAdapter(), iIsGooglePlayServicesAvailable, null);
        }
    }

    protected final void checkConnected() {
        if (!isConnected()) {
            throw new java.lang.IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    public void connect(com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks connectionProgressReportCallbacks) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(connectionProgressReportCallbacks, "Connection progress callbacks cannot be null.");
        this.zzc = connectionProgressReportCallbacks;
        zzp(2, null);
    }

    protected abstract T createServiceInterface(android.os.IBinder iBinder);

    public void disconnect() {
        this.zzd.incrementAndGet();
        synchronized (this.zzt) {
            int size = this.zzt.size();
            for (int i = 0; i < size; i++) {
                ((com.google.android.gms.common.internal.zzc) this.zzt.get(i)).zzf();
            }
            this.zzt.clear();
        }
        synchronized (this.zzq) {
            this.zzr = null;
        }
        zzp(1, null);
    }

    public void dump(java.lang.String str, java.io.FileDescriptor fileDescriptor, java.io.PrintWriter printWriter, java.lang.String[] strArr) {
        int i;
        android.os.IInterface iInterface;
        com.google.android.gms.common.internal.IGmsServiceBroker iGmsServiceBroker;
        synchronized (this.zzp) {
            i = this.zzv;
            iInterface = this.zzs;
        }
        synchronized (this.zzq) {
            iGmsServiceBroker = this.zzr;
        }
        printWriter.append((java.lang.CharSequence) str).append("mConnectState=");
        if (i == 1) {
            printWriter.print("DISCONNECTED");
        } else if (i == 2) {
            printWriter.print("REMOTE_CONNECTING");
        } else if (i == 3) {
            printWriter.print("LOCAL_CONNECTING");
        } else if (i == 4) {
            printWriter.print("CONNECTED");
        } else if (i != 5) {
            printWriter.print("UNKNOWN");
        } else {
            printWriter.print("DISCONNECTING");
        }
        printWriter.append(" mService=");
        if (iInterface == null) {
            printWriter.append("null");
        } else {
            printWriter.append((java.lang.CharSequence) getServiceDescriptor()).append("@").append((java.lang.CharSequence) java.lang.Integer.toHexString(java.lang.System.identityHashCode(iInterface.asBinder())));
        }
        printWriter.append(" mServiceBroker=");
        if (iGmsServiceBroker == null) {
            printWriter.println("null");
        } else {
            printWriter.append("IGmsServiceBroker@").println(java.lang.Integer.toHexString(java.lang.System.identityHashCode(iGmsServiceBroker.asBinder())));
        }
        java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", java.util.Locale.US);
        if (this.zzh > 0) {
            java.io.PrintWriter printWriterAppend = printWriter.append((java.lang.CharSequence) str).append("lastConnectedTime=");
            long j = this.zzh;
            printWriterAppend.println(j + " " + simpleDateFormat.format(new java.util.Date(j)));
        }
        if (this.zzg > 0) {
            printWriter.append((java.lang.CharSequence) str).append("lastSuspendedCause=");
            int i2 = this.zzf;
            if (i2 == 1) {
                printWriter.append("CAUSE_SERVICE_DISCONNECTED");
            } else if (i2 == 2) {
                printWriter.append("CAUSE_NETWORK_LOST");
            } else if (i2 != 3) {
                printWriter.append((java.lang.CharSequence) java.lang.String.valueOf(i2));
            } else {
                printWriter.append("CAUSE_DEAD_OBJECT_EXCEPTION");
            }
            java.io.PrintWriter printWriterAppend2 = printWriter.append(" lastSuspendedTime=");
            long j2 = this.zzg;
            printWriterAppend2.println(j2 + " " + simpleDateFormat.format(new java.util.Date(j2)));
        }
        if (this.zzj > 0) {
            printWriter.append((java.lang.CharSequence) str).append("lastFailedStatus=").append((java.lang.CharSequence) com.google.android.gms.common.api.CommonStatusCodes.getStatusCodeString(this.zzi));
            java.io.PrintWriter printWriterAppend3 = printWriter.append(" lastFailedTime=");
            long j3 = this.zzj;
            printWriterAppend3.println(j3 + " " + simpleDateFormat.format(new java.util.Date(j3)));
        }
    }

    protected boolean enableLocalFallback() {
        return false;
    }

    public android.accounts.Account getAccount() {
        return null;
    }

    public com.google.android.gms.common.Feature[] getApiFeatures() {
        return zze;
    }

    public com.google.android.gms.common.wrappers.AttributionSourceWrapper getAttributionSourceWrapper() {
        return this.zzB;
    }

    public final com.google.android.gms.common.Feature[] getAvailableFeatures() {
        com.google.android.gms.common.internal.zzk zzkVar = this.zzE;
        if (zzkVar == null) {
            return null;
        }
        return zzkVar.zzb;
    }

    protected java.util.concurrent.Executor getBindServiceExecutor() {
        return null;
    }

    public android.os.Bundle getConnectionHint() {
        return null;
    }

    public final android.content.Context getContext() {
        return this.zzl;
    }

    public java.lang.String getEndpointPackageName() {
        com.google.android.gms.common.internal.zzu zzuVar;
        if (!isConnected() || (zzuVar = this.zza) == null) {
            throw new java.lang.RuntimeException("Failed to connect when checking package");
        }
        return zzuVar.zza();
    }

    public int getGCoreServiceId() {
        return this.zzy;
    }

    protected android.os.Bundle getGetServiceRequestExtraArgs() {
        return new android.os.Bundle();
    }

    public java.lang.String getLastDisconnectMessage() {
        return this.zzk;
    }

    protected java.lang.String getLocalStartServiceAction() {
        return null;
    }

    public final android.os.Looper getLooper() {
        return this.zzm;
    }

    public int getMinApkVersion() {
        return com.google.android.gms.common.GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    }

    public void getRemoteService(com.google.android.gms.common.internal.IAccountAccessor iAccountAccessor, java.util.Set<com.google.android.gms.common.api.Scope> set) {
        android.content.AttributionSource attributionSource;
        android.os.Bundle getServiceRequestExtraArgs = getGetServiceRequestExtraArgs();
        java.lang.String attributionTag = (android.os.Build.VERSION.SDK_INT < 31 || this.zzB == null || (attributionSource = this.zzB.getAttributionSource()) == null || attributionSource.getAttributionTag() == null) ? this.zzA : attributionSource.getAttributionTag();
        java.lang.String str = attributionTag;
        int i = this.zzy;
        int i2 = com.google.android.gms.common.GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
        com.google.android.gms.common.api.Scope[] scopeArr = com.google.android.gms.common.internal.GetServiceRequest.zza;
        android.os.Bundle bundle = new android.os.Bundle();
        com.google.android.gms.common.Feature[] featureArr = com.google.android.gms.common.internal.GetServiceRequest.zzb;
        com.google.android.gms.common.internal.GetServiceRequest getServiceRequest = new com.google.android.gms.common.internal.GetServiceRequest(6, i, i2, null, null, scopeArr, bundle, null, featureArr, featureArr, true, 0, false, str);
        getServiceRequest.zzf = this.zzl.getPackageName();
        getServiceRequest.zzi = getServiceRequestExtraArgs;
        if (set != null) {
            getServiceRequest.zzh = (com.google.android.gms.common.api.Scope[]) set.toArray(new com.google.android.gms.common.api.Scope[0]);
        }
        if (requiresSignIn()) {
            android.accounts.Account account = getAccount();
            if (account == null) {
                account = new android.accounts.Account("<<default account>>", "com.google");
            }
            getServiceRequest.zzj = account;
            if (iAccountAccessor != null) {
                getServiceRequest.zzg = iAccountAccessor.asBinder();
            }
        } else if (requiresAccount()) {
            getServiceRequest.zzj = getAccount();
        }
        getServiceRequest.zzk = zze;
        getServiceRequest.zzl = getApiFeatures();
        if (usesClientTelemetry()) {
            getServiceRequest.zzo = true;
        }
        try {
            synchronized (this.zzq) {
                com.google.android.gms.common.internal.IGmsServiceBroker iGmsServiceBroker = this.zzr;
                if (iGmsServiceBroker != null) {
                    iGmsServiceBroker.getService(new com.google.android.gms.common.internal.zzd(this, this.zzd.get()), getServiceRequest);
                } else {
                    android.util.Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                }
            }
        } catch (android.os.DeadObjectException e) {
            android.util.Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            triggerConnectionSuspended(3);
        } catch (android.os.RemoteException e2) {
            e = e2;
            android.util.Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            onPostInitHandler(8, null, null, this.zzd.get());
        } catch (java.lang.SecurityException e3) {
            throw e3;
        } catch (java.lang.RuntimeException e4) {
            e = e4;
            android.util.Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            onPostInitHandler(8, null, null, this.zzd.get());
        }
    }

    protected java.util.Set<com.google.android.gms.common.api.Scope> getScopes() {
        return java.util.Collections.emptySet();
    }

    public final T getService() throws android.os.DeadObjectException {
        T t;
        synchronized (this.zzp) {
            if (this.zzv == 5) {
                throw new android.os.DeadObjectException();
            }
            checkConnected();
            t = (T) this.zzs;
            com.google.android.gms.common.internal.Preconditions.checkNotNull(t, "Client is connected but service is null");
        }
        return t;
    }

    protected abstract java.lang.String getServiceDescriptor();

    public android.content.Intent getSignInIntent() {
        throw new java.lang.UnsupportedOperationException("Not a sign in API");
    }

    protected abstract java.lang.String getStartServiceAction();

    protected java.lang.String getStartServicePackage() {
        return "com.google.android.gms";
    }

    public com.google.android.gms.common.internal.ConnectionTelemetryConfiguration getTelemetryConfiguration() {
        com.google.android.gms.common.internal.zzk zzkVar = this.zzE;
        if (zzkVar == null) {
            return null;
        }
        return zzkVar.zzd;
    }

    protected boolean getUseDynamicLookup() {
        return getMinApkVersion() >= 211700000;
    }

    public boolean hasConnectionInfo() {
        return this.zzE != null;
    }

    public boolean isConnected() {
        boolean z;
        synchronized (this.zzp) {
            z = this.zzv == 4;
        }
        return z;
    }

    public boolean isConnecting() {
        boolean z;
        synchronized (this.zzp) {
            int i = this.zzv;
            z = true;
            if (i != 2 && i != 3) {
                z = false;
            }
        }
        return z;
    }

    protected void onConnectedLocked(T t) {
        this.zzh = java.lang.System.currentTimeMillis();
    }

    protected void onConnectionFailed(com.google.android.gms.common.ConnectionResult connectionResult) {
        this.zzi = connectionResult.getErrorCode();
        this.zzj = java.lang.System.currentTimeMillis();
    }

    protected void onConnectionSuspended(int i) {
        this.zzf = i;
        this.zzg = java.lang.System.currentTimeMillis();
    }

    protected void onPostInitHandler(int i, android.os.IBinder iBinder, android.os.Bundle bundle, int i2) {
        this.zzb.sendMessage(this.zzb.obtainMessage(1, i2, -1, new com.google.android.gms.common.internal.zzf(this, i, iBinder, bundle)));
    }

    public void onUserSignOut(com.google.android.gms.common.internal.BaseGmsClient.SignOutCallbacks signOutCallbacks) {
        signOutCallbacks.onSignOutComplete();
    }

    public boolean providesSignIn() {
        return false;
    }

    public boolean requiresAccount() {
        return false;
    }

    public boolean requiresGooglePlayServices() {
        return true;
    }

    public boolean requiresSignIn() {
        return false;
    }

    public void setAttributionSourceWrapper(com.google.android.gms.common.wrappers.AttributionSourceWrapper attributionSourceWrapper) {
        this.zzB = attributionSourceWrapper;
    }

    public void setAttributionTag(java.lang.String str) {
        this.zzA = str;
    }

    public void triggerConnectionSuspended(int i) {
        this.zzb.sendMessage(this.zzb.obtainMessage(6, this.zzd.get(), i));
    }

    protected void triggerNotAvailable(com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks connectionProgressReportCallbacks, int i, android.app.PendingIntent pendingIntent) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(connectionProgressReportCallbacks, "Connection progress callbacks cannot be null.");
        this.zzc = connectionProgressReportCallbacks;
        this.zzb.sendMessage(this.zzb.obtainMessage(3, this.zzd.get(), i, pendingIntent));
    }

    public boolean usesClientTelemetry() {
        return false;
    }

    protected final java.lang.String zze() {
        java.lang.String str = this.zzz;
        return str == null ? this.zzl.getClass().getName() : str;
    }

    protected final void zzl(int i, android.os.Bundle bundle, int i2) {
        this.zzb.sendMessage(this.zzb.obtainMessage(7, i2, -1, new com.google.android.gms.common.internal.zzg(this, i, bundle)));
    }

    public android.os.IBinder getServiceBrokerBinder() {
        synchronized (this.zzq) {
            com.google.android.gms.common.internal.IGmsServiceBroker iGmsServiceBroker = this.zzr;
            if (iGmsServiceBroker == null) {
                return null;
            }
            return iGmsServiceBroker.asBinder();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    protected BaseGmsClient(android.content.Context context, android.os.Looper looper, int i, com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks baseConnectionCallbacks, com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener baseOnConnectionFailedListener, java.lang.String str) {
        com.google.android.gms.common.internal.GmsClientSupervisor gmsClientSupervisor = com.google.android.gms.common.internal.GmsClientSupervisor.getInstance(context);
        com.google.android.gms.common.GoogleApiAvailabilityLight googleApiAvailabilityLight = com.google.android.gms.common.GoogleApiAvailabilityLight.getInstance();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(baseConnectionCallbacks);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(baseOnConnectionFailedListener);
        this(context, looper, gmsClientSupervisor, googleApiAvailabilityLight, i, baseConnectionCallbacks, baseOnConnectionFailedListener, str);
    }

    public void disconnect(java.lang.String str) {
        this.zzk = str;
        disconnect();
    }

    protected BaseGmsClient(android.content.Context context, android.os.Looper looper, com.google.android.gms.common.internal.GmsClientSupervisor gmsClientSupervisor, com.google.android.gms.common.GoogleApiAvailabilityLight googleApiAvailabilityLight, int i, com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks baseConnectionCallbacks, com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener baseOnConnectionFailedListener, java.lang.String str) {
        this.zzk = null;
        this.zzp = new java.lang.Object();
        this.zzq = new java.lang.Object();
        this.zzt = new java.util.ArrayList();
        this.zzv = 1;
        this.zzC = null;
        this.zzD = false;
        this.zzE = null;
        this.zzd = new java.util.concurrent.atomic.AtomicInteger(0);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(context, "Context must not be null");
        this.zzl = context;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(looper, "Looper must not be null");
        this.zzm = looper;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(gmsClientSupervisor, "Supervisor must not be null");
        this.zzn = gmsClientSupervisor;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(googleApiAvailabilityLight, "API availability must not be null");
        this.zzo = googleApiAvailabilityLight;
        this.zzb = new com.google.android.gms.common.internal.zzb(this, looper);
        this.zzy = i;
        this.zzw = baseConnectionCallbacks;
        this.zzx = baseOnConnectionFailedListener;
        this.zzz = str;
    }
}
