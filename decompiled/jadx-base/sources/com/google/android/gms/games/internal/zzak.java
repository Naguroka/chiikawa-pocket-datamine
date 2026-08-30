package com.google.android.gms.games.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-games-v2@@17.0.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzak extends com.google.android.gms.common.internal.GmsClient {
    public static final /* synthetic */ int zze = 0;
    private final com.google.android.gms.internal.games_v2.zzak zzf;
    private final java.lang.String zzg;
    private com.google.android.gms.games.PlayerEntity zzh;
    private com.google.android.gms.games.GameEntity zzi;
    private final com.google.android.gms.games.internal.zzaq zzj;
    private boolean zzk;
    private final long zzl;
    private final com.google.android.gms.games.zzn zzm;
    private final com.google.android.gms.games.internal.zzar zzn;

    public zzak(android.content.Context context, android.os.Looper looper, com.google.android.gms.common.internal.ClientSettings clientSettings, com.google.android.gms.games.zzn zznVar, com.google.android.gms.common.api.internal.ConnectionCallbacks connectionCallbacks, com.google.android.gms.common.api.internal.OnConnectionFailedListener onConnectionFailedListener, com.google.android.gms.games.internal.zzar zzarVar) {
        super(context, looper, 1, clientSettings, connectionCallbacks, onConnectionFailedListener);
        this.zzf = new com.google.android.gms.games.internal.zzm(this);
        this.zzk = false;
        this.zzg = clientSettings.getRealClientPackageName();
        this.zzn = (com.google.android.gms.games.internal.zzar) com.google.android.gms.common.internal.Preconditions.checkNotNull(zzarVar);
        com.google.android.gms.games.internal.zzaq zzaqVarZzd = com.google.android.gms.games.internal.zzaq.zzd(this, clientSettings.getGravityForPopups());
        this.zzj = zzaqVarZzd;
        this.zzl = hashCode();
        this.zzm = zznVar;
        boolean z = zznVar.zzh;
        if (clientSettings.getViewForPopups() != null || (context instanceof android.app.Activity)) {
            zzaqVarZzd.zzf(clientSettings.getViewForPopups());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzU(android.os.RemoteException remoteException) {
        com.google.android.gms.internal.games_v2.zzez.zzh("GamesGmsClientImpl", "service died", remoteException);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* bridge */ /* synthetic */ void zzq(com.google.android.gms.games.internal.zzak zzakVar, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        try {
            taskCompletionSource.setException(com.google.android.gms.games.FriendsResolutionRequiredException.zza(com.google.android.gms.games.GamesClientStatusCodes.zzb(com.google.android.gms.games.GamesClientStatusCodes.CONSENT_REQUIRED, ((com.google.android.gms.games.internal.zzap) zzakVar.getService()).zzf())));
        } catch (android.os.RemoteException e) {
            taskCompletionSource.setException(e);
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final void connect(com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks connectionProgressReportCallbacks) {
        this.zzh = null;
        this.zzi = null;
        super.connect(connectionProgressReportCallbacks);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final /* synthetic */ android.os.IInterface createServiceInterface(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.games.internal.IGamesService");
        return iInterfaceQueryLocalInterface instanceof com.google.android.gms.games.internal.zzap ? (com.google.android.gms.games.internal.zzap) iInterfaceQueryLocalInterface : new com.google.android.gms.games.internal.zzap(iBinder);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final void disconnect() {
        this.zzk = false;
        if (isConnected()) {
            try {
                this.zzf.zzb();
                ((com.google.android.gms.games.internal.zzap) getService()).zzq(this.zzl);
            } catch (android.os.RemoteException unused) {
                com.google.android.gms.internal.games_v2.zzez.zzg("GamesGmsClientImpl", "Failed to notify client disconnect.");
            }
        }
        super.disconnect();
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final com.google.android.gms.common.Feature[] getApiFeatures() {
        return com.google.android.gms.games.zzd.zzb;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final android.os.Bundle getConnectionHint() {
        return null;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final android.os.Bundle getGetServiceRequestExtraArgs() {
        java.lang.String string = getContext().getResources().getConfiguration().locale.toString();
        android.os.Bundle bundleZza = this.zzm.zza();
        bundleZza.putString(com.google.android.gms.common.internal.ServiceSpecificExtraArgs.GamesExtraArgs.GAME_PACKAGE_NAME, this.zzg);
        bundleZza.putString(com.google.android.gms.common.internal.ServiceSpecificExtraArgs.GamesExtraArgs.DESIRED_LOCALE, string);
        bundleZza.putParcelable(com.google.android.gms.common.internal.ServiceSpecificExtraArgs.GamesExtraArgs.WINDOW_TOKEN, new com.google.android.gms.common.internal.BinderWrapper(this.zzj.zzc()));
        if (!bundleZza.containsKey("com.google.android.gms.games.key.API_VERSION")) {
            bundleZza.putInt("com.google.android.gms.games.key.API_VERSION", 9);
        }
        bundleZza.putBundle(com.google.android.gms.common.internal.ServiceSpecificExtraArgs.GamesExtraArgs.SIGNIN_OPTIONS, com.google.android.gms.signin.internal.SignInClientImpl.createBundleFromClientSettings(getClientSettings()));
        return bundleZza;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.GmsClient, com.google.android.gms.common.api.Api.Client
    public final java.util.Set getScopesForConnectionlessNonSignIn() {
        return getScopes();
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final java.lang.String getServiceDescriptor() {
        return "com.google.android.gms.games.internal.IGamesService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final java.lang.String getStartServiceAction() {
        return "com.google.android.gms.games.service.START";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final /* bridge */ /* synthetic */ void onConnectedLocked(android.os.IInterface iInterface) {
        com.google.android.gms.games.internal.zzap zzapVar = (com.google.android.gms.games.internal.zzap) iInterface;
        super.onConnectedLocked(zzapVar);
        if (this.zzk) {
            this.zzj.zzg();
            this.zzk = false;
        }
        com.google.android.gms.games.zzn zznVar = this.zzm;
        boolean z = zznVar.zza;
        boolean z2 = zznVar.zzh;
        try {
            zzapVar.zzK(new com.google.android.gms.games.internal.zzn(new com.google.android.gms.internal.games_v2.zzan(this.zzj.zze())), this.zzl);
        } catch (android.os.RemoteException e) {
            zzU(e);
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final void onConnectionFailed(com.google.android.gms.common.ConnectionResult connectionResult) {
        super.onConnectionFailed(connectionResult);
        this.zzk = false;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final void onPostInitHandler(int i, android.os.IBinder iBinder, android.os.Bundle bundle, int i2) {
        if (i == 0) {
            i = 0;
            if (bundle != null) {
                bundle.setClassLoader(com.google.android.gms.games.internal.zzak.class.getClassLoader());
                this.zzk = bundle.getBoolean("show_welcome_popup");
                this.zzh = (com.google.android.gms.games.PlayerEntity) bundle.getParcelable("com.google.android.gms.games.current_player");
                this.zzi = (com.google.android.gms.games.GameEntity) bundle.getParcelable("com.google.android.gms.games.current_game");
            }
        }
        super.onPostInitHandler(i, iBinder, bundle, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final void onUserSignOut(com.google.android.gms.common.internal.BaseGmsClient.SignOutCallbacks signOutCallbacks) {
        try {
            com.google.android.gms.games.internal.zzo zzoVar = new com.google.android.gms.games.internal.zzo(signOutCallbacks);
            this.zzf.zzb();
            try {
                ((com.google.android.gms.games.internal.zzap) getService()).zzQ(new com.google.android.gms.games.internal.zzp(zzoVar));
            } catch (java.lang.SecurityException unused) {
                zzoVar.setFailedResult(com.google.android.gms.games.GamesClientStatusCodes.zza(4));
            }
        } catch (android.os.RemoteException unused2) {
            signOutCallbacks.onSignOutComplete();
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final boolean requiresAccount() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final boolean requiresSignIn() {
        if (this.zzm.zzo.zzb()) {
            return false;
        }
        com.google.android.gms.games.zzn zznVar = this.zzm;
        java.lang.String str = zznVar.zzl;
        boolean z = zznVar.zzh;
        return true;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final boolean usesClientTelemetry() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzA(com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource, boolean z) throws android.os.RemoteException {
        this.zzf.zzb();
        try {
            ((com.google.android.gms.games.internal.zzap) getService()).zzy(new com.google.android.gms.games.internal.zzv(taskCompletionSource), z);
        } catch (java.lang.SecurityException e) {
            com.google.android.gms.games.GamesStatusUtils.zzb(taskCompletionSource, e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzB(com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource, boolean z, java.lang.String... strArr) throws android.os.RemoteException {
        this.zzf.zzb();
        try {
            ((com.google.android.gms.games.internal.zzap) getService()).zzz(new com.google.android.gms.games.internal.zzv(taskCompletionSource), z, strArr);
        } catch (java.lang.SecurityException e) {
            com.google.android.gms.games.GamesStatusUtils.zzb(taskCompletionSource, e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzC(com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource, java.lang.String str, boolean z) throws android.os.RemoteException {
        try {
            ((com.google.android.gms.games.internal.zzap) getService()).zzA(new com.google.android.gms.games.internal.zzy(taskCompletionSource), str, z);
        } catch (java.lang.SecurityException e) {
            com.google.android.gms.games.GamesStatusUtils.zzb(taskCompletionSource, e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzD(com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource, boolean z) throws android.os.RemoteException {
        try {
            ((com.google.android.gms.games.internal.zzap) getService()).zzB(new com.google.android.gms.games.internal.zzab(taskCompletionSource), z);
        } catch (java.lang.SecurityException e) {
            com.google.android.gms.games.GamesStatusUtils.zzb(taskCompletionSource, e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzE(com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource, com.google.android.gms.games.leaderboard.LeaderboardScoreBuffer leaderboardScoreBuffer, int i, int i2) throws android.os.RemoteException {
        try {
            ((com.google.android.gms.games.internal.zzap) getService()).zzC(new com.google.android.gms.games.internal.zzaa(this, taskCompletionSource), leaderboardScoreBuffer.zza().zza(), i, i2);
        } catch (java.lang.SecurityException e) {
            com.google.android.gms.games.GamesStatusUtils.zzb(taskCompletionSource, e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzF(com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource, java.lang.String str, boolean z) throws android.os.RemoteException {
        try {
            ((com.google.android.gms.games.internal.zzap) getService()).zzF(new com.google.android.gms.games.internal.zzaf(taskCompletionSource), str, z);
        } catch (java.lang.SecurityException e) {
            com.google.android.gms.games.GamesStatusUtils.zzb(taskCompletionSource, e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzG(com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource, java.lang.String str, int i, int i2, int i3, boolean z) throws android.os.RemoteException {
        try {
            ((com.google.android.gms.games.internal.zzap) getService()).zzD(new com.google.android.gms.games.internal.zzaa(this, taskCompletionSource), str, i, i2, i3, z);
        } catch (java.lang.SecurityException e) {
            com.google.android.gms.games.GamesStatusUtils.zzb(taskCompletionSource, e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzH(com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource, boolean z) throws android.os.RemoteException {
        try {
            ((com.google.android.gms.games.internal.zzap) getService()).zzE(new com.google.android.gms.games.internal.zzad(taskCompletionSource), z);
        } catch (java.lang.SecurityException e) {
            com.google.android.gms.games.GamesStatusUtils.zzb(taskCompletionSource, e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzI(com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource, java.lang.String str, int i, boolean z, boolean z2) throws android.os.RemoteException {
        if (!str.equals("played_with") && !str.equals("friends_all")) {
            throw new java.lang.IllegalArgumentException(str.length() != 0 ? "Invalid player collection: ".concat(str) : new java.lang.String("Invalid player collection: "));
        }
        try {
            ((com.google.android.gms.games.internal.zzap) getService()).zzG(new com.google.android.gms.games.internal.zzae(this, taskCompletionSource), str, i, z, z2);
        } catch (java.lang.SecurityException e) {
            com.google.android.gms.games.GamesStatusUtils.zzb(taskCompletionSource, e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzJ(com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource, boolean z) throws android.os.RemoteException {
        try {
            ((com.google.android.gms.games.internal.zzap) getService()).zzH(new com.google.android.gms.games.internal.zzac(taskCompletionSource), z);
        } catch (java.lang.SecurityException e) {
            com.google.android.gms.games.GamesStatusUtils.zzb(taskCompletionSource, e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzK(com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource, java.lang.String str, int i, int i2, int i3, boolean z) throws android.os.RemoteException {
        try {
            ((com.google.android.gms.games.internal.zzap) getService()).zzI(new com.google.android.gms.games.internal.zzaa(this, taskCompletionSource), str, i, i2, i3, z);
        } catch (java.lang.SecurityException e) {
            com.google.android.gms.games.GamesStatusUtils.zzb(taskCompletionSource, e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzL(com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource, java.lang.String str, boolean z, int i) throws android.os.RemoteException {
        try {
            ((com.google.android.gms.games.internal.zzap) getService()).zzJ(new com.google.android.gms.games.internal.zzaj(taskCompletionSource), str, z, i);
        } catch (java.lang.SecurityException e) {
            com.google.android.gms.games.GamesStatusUtils.zzb(taskCompletionSource, e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzM(com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource, java.lang.String str, boolean z) throws android.os.RemoteException {
        ((com.google.android.gms.games.internal.zzap) getService()).zzL(new com.google.android.gms.games.internal.zzx(taskCompletionSource), str, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzN(com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource, java.lang.String str, java.lang.String str2, com.google.android.gms.games.snapshot.SnapshotMetadataChange snapshotMetadataChange, com.google.android.gms.games.snapshot.SnapshotContents snapshotContents) throws android.os.RemoteException {
        com.google.android.gms.common.internal.Preconditions.checkState(!snapshotContents.isClosed(), "SnapshotContents already closed");
        com.google.android.gms.common.data.BitmapTeleporter bitmapTeleporterZza = snapshotMetadataChange.zza();
        if (bitmapTeleporterZza != null) {
            bitmapTeleporterZza.setTempDir(getContext().getCacheDir());
        }
        com.google.android.gms.drive.Contents contentsZza = snapshotContents.zza();
        snapshotContents.zzb();
        try {
            ((com.google.android.gms.games.internal.zzap) getService()).zzM(new com.google.android.gms.games.internal.zzaj(taskCompletionSource), str, str2, (com.google.android.gms.games.snapshot.SnapshotMetadataChangeEntity) snapshotMetadataChange, contentsZza);
        } catch (java.lang.SecurityException e) {
            com.google.android.gms.games.GamesStatusUtils.zzb(taskCompletionSource, e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    final void zzQ(android.os.IBinder iBinder, android.os.Bundle bundle) {
        if (isConnected()) {
            if (this.zzm.zzo.zzd() && this.zzn.zzc()) {
                return;
            }
            try {
                ((com.google.android.gms.games.internal.zzap) getService()).zzP(iBinder, bundle);
                this.zzn.zzb();
            } catch (android.os.RemoteException e) {
                zzU(e);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzR(com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource, java.lang.String str, long j, java.lang.String str2) throws android.os.RemoteException {
        try {
            ((com.google.android.gms.games.internal.zzap) getService()).zzR(new com.google.android.gms.games.internal.zzah(taskCompletionSource), str, j, str2);
        } catch (java.lang.SecurityException e) {
            com.google.android.gms.games.GamesStatusUtils.zzb(taskCompletionSource, e);
        }
    }

    public final void zzS(com.google.android.gms.games.internal.zzg zzgVar) {
        zzgVar.zzf(this.zzj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final com.google.android.gms.games.Player zzp() throws android.os.RemoteException {
        checkConnected();
        synchronized (this) {
            if (this.zzh == null) {
                com.google.android.gms.games.PlayerBuffer playerBuffer = new com.google.android.gms.games.PlayerBuffer(((com.google.android.gms.games.internal.zzap) getService()).zzn());
                try {
                    if (playerBuffer.getCount() > 0) {
                        this.zzh = new com.google.android.gms.games.PlayerEntity(playerBuffer.get(0));
                    }
                    playerBuffer.release();
                } catch (java.lang.Throwable th) {
                    playerBuffer.release();
                    throw th;
                }
            }
        }
        return this.zzh;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final void zzs() {
        if (isConnected()) {
            try {
                ((com.google.android.gms.games.internal.zzap) getService()).zzp();
            } catch (android.os.RemoteException e) {
                zzU(e);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzt(com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource, com.google.android.gms.games.snapshot.Snapshot snapshot, com.google.android.gms.games.snapshot.SnapshotMetadataChange snapshotMetadataChange) throws android.os.RemoteException {
        com.google.android.gms.games.snapshot.SnapshotContents snapshotContents = snapshot.getSnapshotContents();
        com.google.android.gms.common.internal.Preconditions.checkState(!snapshotContents.isClosed(), "Snapshot already closed");
        com.google.android.gms.common.data.BitmapTeleporter bitmapTeleporterZza = snapshotMetadataChange.zza();
        if (bitmapTeleporterZza != null) {
            bitmapTeleporterZza.setTempDir(getContext().getCacheDir());
        }
        com.google.android.gms.drive.Contents contentsZza = snapshotContents.zza();
        snapshotContents.zzb();
        try {
            ((com.google.android.gms.games.internal.zzap) getService()).zzr(new com.google.android.gms.games.internal.zzt(taskCompletionSource), snapshot.getMetadata().getSnapshotId(), (com.google.android.gms.games.snapshot.SnapshotMetadataChangeEntity) snapshotMetadataChange, contentsZza);
        } catch (java.lang.SecurityException e) {
            com.google.android.gms.games.GamesStatusUtils.zzb(taskCompletionSource, e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzu(com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource, java.lang.String str) throws android.os.RemoteException {
        try {
            ((com.google.android.gms.games.internal.zzap) getService()).zzs(new com.google.android.gms.games.internal.zzu(taskCompletionSource), str);
        } catch (java.lang.SecurityException e) {
            com.google.android.gms.games.GamesStatusUtils.zzb(taskCompletionSource, e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzv(com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource, boolean z) throws android.os.RemoteException {
        try {
            ((com.google.android.gms.games.internal.zzap) getService()).zzF(new com.google.android.gms.games.internal.zzaf(taskCompletionSource), null, z);
        } catch (java.lang.SecurityException e) {
            com.google.android.gms.games.GamesStatusUtils.zzb(taskCompletionSource, e);
        }
    }

    public final void zzx(java.lang.String str, int i) {
        this.zzf.zzc(str, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzy(com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource, boolean z) throws android.os.RemoteException {
        try {
            ((com.google.android.gms.games.internal.zzap) getService()).zzx(new com.google.android.gms.games.internal.zzs(taskCompletionSource), z);
        } catch (java.lang.SecurityException e) {
            com.google.android.gms.games.GamesStatusUtils.zzb(taskCompletionSource, e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzz(com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource, java.lang.String str, int i, int i2) throws android.os.RemoteException {
        try {
            ((com.google.android.gms.games.internal.zzap) getService()).zzu(new com.google.android.gms.games.internal.zzz(this, taskCompletionSource), null, str, i, i2);
        } catch (java.lang.SecurityException e) {
            com.google.android.gms.games.GamesStatusUtils.zzb(taskCompletionSource, e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzO(com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource, java.lang.String str) throws android.os.RemoteException {
        try {
            ((com.google.android.gms.games.internal.zzap) getService()).zzN(taskCompletionSource == null ? null : new com.google.android.gms.games.internal.zzr(taskCompletionSource), str, this.zzj.zzc(), this.zzj.zzb());
        } catch (java.lang.SecurityException e) {
            com.google.android.gms.games.GamesStatusUtils.zzb(taskCompletionSource, e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzT(com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource, java.lang.String str) throws android.os.RemoteException {
        try {
            ((com.google.android.gms.games.internal.zzap) getService()).zzS(taskCompletionSource == null ? null : new com.google.android.gms.games.internal.zzr(taskCompletionSource), str, this.zzj.zzc(), this.zzj.zzb());
        } catch (java.lang.SecurityException e) {
            com.google.android.gms.games.GamesStatusUtils.zzb(taskCompletionSource, e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzP(com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource, java.lang.String str, int i) throws android.os.RemoteException {
        try {
            ((com.google.android.gms.games.internal.zzap) getService()).zzO(taskCompletionSource == null ? null : new com.google.android.gms.games.internal.zzq(taskCompletionSource), str, i, this.zzj.zzc(), this.zzj.zzb());
        } catch (java.lang.SecurityException e) {
            com.google.android.gms.games.GamesStatusUtils.zzb(taskCompletionSource, e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzw(com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource, java.lang.String str, int i) throws android.os.RemoteException {
        try {
            ((com.google.android.gms.games.internal.zzap) getService()).zzv(taskCompletionSource == null ? null : new com.google.android.gms.games.internal.zzq(taskCompletionSource), str, i, this.zzj.zzc(), this.zzj.zzb());
        } catch (java.lang.SecurityException e) {
            com.google.android.gms.games.GamesStatusUtils.zzb(taskCompletionSource, e);
        }
    }
}
