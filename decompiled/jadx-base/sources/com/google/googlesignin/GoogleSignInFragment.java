package com.google.googlesignin;

/* JADX INFO: loaded from: classes5.dex */
public class GoogleSignInFragment extends android.app.Fragment implements com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener {
    public static final java.lang.String FRAGMENT_TAG = "signin.SignInFragment";
    private static final int RC_SIGNIN = 9009;
    private static com.google.googlesignin.GoogleSignInFragment theFragment;
    private com.google.android.gms.common.api.GoogleApiClient mGoogleApiClient;
    private com.google.googlesignin.TokenRequest request = null;
    private com.google.googlesignin.GoogleSignInFragment.State state;

    private enum State {
        NEW,
        READY,
        PENDING,
        PENDING_SILENT,
        BUSY
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public void onConnected(android.os.Bundle bundle) {
        com.google.googlesignin.GoogleSignInHelper.logDebug("onConnected!");
        if (this.mGoogleApiClient.hasConnectedApi(com.google.android.gms.auth.api.Auth.GOOGLE_SIGN_IN_API)) {
            com.google.googlesignin.GoogleSignInHelper.logDebug("has connected auth!");
            com.google.android.gms.auth.api.Auth.GoogleSignInApi.silentSignIn(this.mGoogleApiClient).setResultCallback(new com.google.android.gms.common.api.ResultCallback<com.google.android.gms.auth.api.signin.GoogleSignInResult>() { // from class: com.google.googlesignin.GoogleSignInFragment.1
                @Override // com.google.android.gms.common.api.ResultCallback
                public void onResult(com.google.android.gms.auth.api.signin.GoogleSignInResult googleSignInResult) {
                    if (googleSignInResult.isSuccess()) {
                        com.google.googlesignin.GoogleSignInHelper.nativeOnResult(com.google.googlesignin.GoogleSignInFragment.this.request.getHandle(), googleSignInResult.getStatus().getStatusCode(), googleSignInResult.getSignInAccount());
                        com.google.googlesignin.GoogleSignInFragment.this.setState(com.google.googlesignin.GoogleSignInFragment.State.READY);
                    } else {
                        com.google.googlesignin.GoogleSignInHelper.logError("Error with silentSignIn: " + googleSignInResult.getStatus());
                        com.google.googlesignin.GoogleSignInHelper.nativeOnResult(com.google.googlesignin.GoogleSignInFragment.this.request.getHandle(), googleSignInResult.getStatus().getStatusCode(), googleSignInResult.getSignInAccount());
                        com.google.googlesignin.GoogleSignInFragment.this.setState(com.google.googlesignin.GoogleSignInFragment.State.READY);
                    }
                }
            });
        } else {
            startActivityForResult(com.google.android.gms.auth.api.Auth.GoogleSignInApi.getSignInIntent(this.mGoogleApiClient), RC_SIGNIN);
        }
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public void onConnectionSuspended(int i) {
        com.google.googlesignin.GoogleSignInHelper.logDebug("onConnectionSuspended() called: " + i);
    }

    @Override // com.google.android.gms.common.api.internal.OnConnectionFailedListener
    public void onConnectionFailed(com.google.android.gms.common.ConnectionResult connectionResult) {
        com.google.googlesignin.GoogleSignInHelper.logError("Connection failed: " + connectionResult.getErrorCode());
        if (connectionResult.hasResolution()) {
            startActivityForResult(com.google.android.gms.auth.api.Auth.GoogleSignInApi.getSignInIntent(this.mGoogleApiClient), RC_SIGNIN);
        } else {
            com.google.googlesignin.GoogleSignInHelper.nativeOnResult(this.request.getHandle(), connectionResult.getErrorCode(), null);
        }
    }

    public void disconnect() {
        com.google.android.gms.common.api.GoogleApiClient googleApiClient = this.mGoogleApiClient;
        if (googleApiClient != null) {
            googleApiClient.disconnect();
        }
    }

    public static com.google.googlesignin.GoogleSignInFragment getInstance(android.app.Activity activity) {
        com.google.googlesignin.GoogleSignInFragment googleSignInFragment = (com.google.googlesignin.GoogleSignInFragment) activity.getFragmentManager().findFragmentByTag(FRAGMENT_TAG);
        if (googleSignInFragment == null) {
            googleSignInFragment = theFragment;
        }
        if (googleSignInFragment != null) {
            return googleSignInFragment;
        }
        com.google.googlesignin.GoogleSignInHelper.logDebug("Creating fragment");
        com.google.googlesignin.GoogleSignInFragment googleSignInFragment2 = new com.google.googlesignin.GoogleSignInFragment();
        android.app.FragmentTransaction fragmentTransactionBeginTransaction = activity.getFragmentManager().beginTransaction();
        fragmentTransactionBeginTransaction.add(googleSignInFragment2, FRAGMENT_TAG);
        fragmentTransactionBeginTransaction.commitAllowingStateLoss();
        theFragment = googleSignInFragment2;
        return googleSignInFragment2;
    }

    public synchronized boolean submitRequest(com.google.googlesignin.TokenRequest tokenRequest) {
        if (this.request != null && this.state != com.google.googlesignin.GoogleSignInFragment.State.READY) {
            com.google.googlesignin.GoogleSignInHelper.logError(java.lang.String.format(java.util.Locale.getDefault(), "Existing request: %s ignoring %s.  State = %s", this.request, tokenRequest, this.state));
            return false;
        }
        this.request = tokenRequest;
        return true;
    }

    private synchronized com.google.googlesignin.GoogleSignInFragment.State getState() {
        return this.state;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void setState(com.google.googlesignin.GoogleSignInFragment.State state) {
        this.state = state;
    }

    public void signOut() {
        clearRequest(true);
        if (this.mGoogleApiClient != null) {
            com.google.android.gms.auth.api.Auth.GoogleSignInApi.signOut(this.mGoogleApiClient);
        }
    }

    public boolean startSignIn() {
        if (this.request == null) {
            com.google.googlesignin.GoogleSignInHelper.logError("Request not configured! Failing authenticate");
            return false;
        }
        if (getState() == com.google.googlesignin.GoogleSignInFragment.State.BUSY) {
            com.google.googlesignin.GoogleSignInHelper.logError("There is already a pending callback configured.");
            return true;
        }
        if (getState() == com.google.googlesignin.GoogleSignInFragment.State.READY) {
            processRequest(false);
            return true;
        }
        processWhenReady(false);
        return true;
    }

    public boolean startSignInSilently() {
        if (this.request == null) {
            com.google.googlesignin.GoogleSignInHelper.logError("Request not configured! Failing authenticate");
            return false;
        }
        if (getState() == com.google.googlesignin.GoogleSignInFragment.State.BUSY) {
            com.google.googlesignin.GoogleSignInHelper.logError("There is already a pending callback configured.");
        } else if (getState() == com.google.googlesignin.GoogleSignInFragment.State.READY) {
            processRequest(true);
        } else {
            processWhenReady(true);
        }
        return true;
    }

    private void processWhenReady(boolean z) {
        com.google.googlesignin.GoogleSignInHelper.logInfo("Fragment not initialized yet, waiting to authenticate");
        setState(z ? com.google.googlesignin.GoogleSignInFragment.State.PENDING_SILENT : com.google.googlesignin.GoogleSignInFragment.State.PENDING);
    }

    private void processRequest(boolean z) {
        try {
            if (this.request != null) {
                setState(com.google.googlesignin.GoogleSignInFragment.State.BUSY);
                this.request.getPendingResponse().setResultCallback(new com.google.android.gms.common.api.ResultCallback<com.google.googlesignin.TokenResult>() { // from class: com.google.googlesignin.GoogleSignInFragment.2
                    @Override // com.google.android.gms.common.api.ResultCallback
                    public void onResult(com.google.googlesignin.TokenResult tokenResult) {
                        com.google.googlesignin.GoogleSignInHelper.logDebug(java.lang.String.format(java.util.Locale.getDefault(), "Calling nativeOnResult: handle: %s, status: %d acct: %s", java.lang.Long.valueOf(tokenResult.getHandle()), java.lang.Integer.valueOf(tokenResult.getStatus().getStatusCode()), tokenResult.getAccount()));
                        com.google.googlesignin.GoogleSignInHelper.nativeOnResult(tokenResult.getHandle(), tokenResult.getStatus().getStatusCode(), tokenResult.getAccount());
                        com.google.googlesignin.GoogleSignInFragment.this.clearRequest(false);
                    }
                });
                buildClient(this.request);
                com.google.googlesignin.GoogleSignInHelper.logDebug(" Has connected == " + this.mGoogleApiClient.hasConnectedApi(com.google.android.gms.auth.api.Auth.GOOGLE_SIGN_IN_API));
                if (!this.mGoogleApiClient.hasConnectedApi(com.google.android.gms.auth.api.Auth.GOOGLE_SIGN_IN_API)) {
                    if (!z) {
                        startActivityForResult(com.google.android.gms.auth.api.Auth.GoogleSignInApi.getSignInIntent(this.mGoogleApiClient), RC_SIGNIN);
                    } else {
                        com.google.android.gms.auth.api.Auth.GoogleSignInApi.silentSignIn(this.mGoogleApiClient).setResultCallback(new com.google.android.gms.common.api.ResultCallback<com.google.android.gms.auth.api.signin.GoogleSignInResult>() { // from class: com.google.googlesignin.GoogleSignInFragment.3
                            @Override // com.google.android.gms.common.api.ResultCallback
                            public void onResult(com.google.android.gms.auth.api.signin.GoogleSignInResult googleSignInResult) {
                                if (googleSignInResult.isSuccess()) {
                                    com.google.googlesignin.GoogleSignInHelper.nativeOnResult(com.google.googlesignin.GoogleSignInFragment.this.request.getHandle(), googleSignInResult.getStatus().getStatusCode(), googleSignInResult.getSignInAccount());
                                    com.google.googlesignin.GoogleSignInFragment.this.setState(com.google.googlesignin.GoogleSignInFragment.State.READY);
                                } else {
                                    com.google.googlesignin.GoogleSignInHelper.logError("Error with silentSignIn: " + googleSignInResult.getStatus());
                                    com.google.googlesignin.GoogleSignInHelper.nativeOnResult(com.google.googlesignin.GoogleSignInFragment.this.request.getHandle(), googleSignInResult.getStatus().getStatusCode(), googleSignInResult.getSignInAccount());
                                    com.google.googlesignin.GoogleSignInFragment.this.setState(com.google.googlesignin.GoogleSignInFragment.State.READY);
                                }
                            }
                        });
                    }
                }
                com.google.googlesignin.GoogleSignInHelper.logDebug("Done with processRequest!");
                return;
            }
            com.google.googlesignin.GoogleSignInHelper.logInfo("No pending configuration, returning");
        } catch (java.lang.Throwable th) {
            com.google.googlesignin.GoogleSignInHelper.logError("Exception caught! " + th.getMessage());
            this.request.setResult(8, null);
        }
    }

    private void buildClient(com.google.googlesignin.TokenRequest tokenRequest) {
        com.google.android.gms.auth.api.signin.GoogleSignInOptions.Builder builder;
        if (tokenRequest.getUseGamesConfig()) {
            com.google.googlesignin.GoogleSignInHelper.logDebug("Using DEFAULT_GAMES_SIGN_IN");
            builder = new com.google.android.gms.auth.api.signin.GoogleSignInOptions.Builder(com.google.android.gms.auth.api.signin.GoogleSignInOptions.DEFAULT_GAMES_SIGN_IN);
        } else {
            com.google.googlesignin.GoogleSignInHelper.logDebug("Using DEFAULT_SIGN_IN");
            builder = new com.google.android.gms.auth.api.signin.GoogleSignInOptions.Builder(com.google.android.gms.auth.api.signin.GoogleSignInOptions.DEFAULT_SIGN_IN);
        }
        if (tokenRequest.getDoAuthCode()) {
            if (!tokenRequest.getWebClientId().isEmpty()) {
                com.google.googlesignin.GoogleSignInHelper.logDebug("Requesting AuthCode force = " + tokenRequest.getForceRefresh() + "client: " + tokenRequest.getWebClientId());
                builder.requestServerAuthCode(tokenRequest.getWebClientId(), tokenRequest.getForceRefresh());
            } else {
                com.google.googlesignin.GoogleSignInHelper.logError("Web client ID is needed for Auth Code");
                tokenRequest.setResult(10, null);
                throw new java.lang.IllegalStateException("Web client ID is needed for Auth Code");
            }
        }
        if (tokenRequest.getDoEmail()) {
            com.google.googlesignin.GoogleSignInHelper.logDebug("Requesting email");
            builder.requestEmail();
        }
        if (tokenRequest.getDoIdToken()) {
            if (!tokenRequest.getWebClientId().isEmpty()) {
                com.google.googlesignin.GoogleSignInHelper.logDebug("Requesting IDToken  client: " + tokenRequest.getWebClientId());
                builder.requestIdToken(tokenRequest.getWebClientId());
            } else {
                com.google.googlesignin.GoogleSignInHelper.logError("Web client ID is needed for ID Token");
                tokenRequest.setResult(10, null);
                throw new java.lang.IllegalStateException("Web client ID is needed for Auth Code");
            }
        }
        if (tokenRequest.getScopes() != null) {
            for (java.lang.String str : tokenRequest.getScopes()) {
                com.google.googlesignin.GoogleSignInHelper.logDebug("Adding scope: " + str);
                builder.requestScopes(new com.google.android.gms.common.api.Scope(str), new com.google.android.gms.common.api.Scope[0]);
            }
        }
        if (tokenRequest.getHidePopups() && tokenRequest.getUseGamesConfig()) {
            com.google.googlesignin.GoogleSignInHelper.logDebug("hiding popup views for games API");
            builder.addExtension(getGamesExtension());
        }
        if (tokenRequest.getAccountName() != null) {
            com.google.googlesignin.GoogleSignInHelper.logDebug("Setting accountName: " + tokenRequest.getAccountName());
            builder.setAccountName(tokenRequest.getAccountName());
        }
        com.google.android.gms.common.api.GoogleApiClient.Builder builderAddApi = new com.google.android.gms.common.api.GoogleApiClient.Builder(getActivity()).addApi(com.google.android.gms.auth.api.Auth.GOOGLE_SIGN_IN_API, builder.build());
        if (tokenRequest.getUseGamesConfig()) {
            com.google.googlesignin.GoogleSignInHelper.logDebug("Adding games API");
            try {
                builderAddApi.addApi(getGamesAPI());
            } catch (java.lang.Exception e) {
                com.google.googlesignin.GoogleSignInHelper.logError("Exception getting Games API: " + e.getMessage());
                tokenRequest.setResult(10, null);
                return;
            }
        }
        if (tokenRequest.getHidePopups()) {
            android.view.View view = new android.view.View(getActivity());
            view.setVisibility(4);
            view.setClickable(false);
            builderAddApi.setViewForPopups(view);
        }
        com.google.android.gms.common.api.GoogleApiClient googleApiClientBuild = builderAddApi.build();
        this.mGoogleApiClient = googleApiClientBuild;
        googleApiClientBuild.connect(2);
    }

    private com.google.android.gms.common.api.Api<? extends com.google.android.gms.common.api.Api.ApiOptions.NotRequiredOptions> getGamesAPI() {
        try {
            return (com.google.android.gms.common.api.Api) java.lang.Class.forName("com.google.android.gms.games.Games").getField("API").get(null);
        } catch (java.lang.ClassNotFoundException e) {
            throw new java.lang.IllegalArgumentException("Games API requested, but can't load Games class", e);
        } catch (java.lang.IllegalAccessException e2) {
            throw new java.lang.IllegalArgumentException("Games API requested, but can't load Games API field", e2);
        } catch (java.lang.NoSuchFieldException e3) {
            throw new java.lang.IllegalArgumentException("Games API requested, but can't load Games API field", e3);
        }
    }

    private com.google.android.gms.auth.api.signin.GoogleSignInOptionsExtension getGamesExtension() {
        try {
            java.lang.Object objInvoke = java.lang.Class.forName("com.google.android.gms.games.Games$GamesOptions").getMethod("builder()", new java.lang.Class[0]).invoke(null, new java.lang.Object[0]);
            objInvoke.getClass().getMethod("setShowConnectingPopup", java.lang.Boolean.TYPE).invoke(objInvoke, false);
            return (com.google.android.gms.auth.api.signin.GoogleSignInOptionsExtension) objInvoke.getClass().getMethod("build", new java.lang.Class[0]).invoke(objInvoke, new java.lang.Object[0]);
        } catch (java.lang.ClassNotFoundException e) {
            throw new java.lang.IllegalArgumentException("Games API requested, butcan't load Games$GamesOptions class", e);
        } catch (java.lang.IllegalAccessException e2) {
            throw new java.lang.IllegalArgumentException("Games API requested, butcan't invoke builder() static method.", e2);
        } catch (java.lang.NoSuchMethodException e3) {
            throw new java.lang.IllegalArgumentException("Games API requested, butcan't find builder() static method.", e3);
        } catch (java.lang.reflect.InvocationTargetException e4) {
            throw new java.lang.IllegalArgumentException("Games API requested, butcan't invoke builder() static method.", e4);
        }
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        com.google.android.gms.common.api.GoogleApiClient googleApiClient = this.mGoogleApiClient;
        if (googleApiClient != null) {
            googleApiClient.connect(2);
        }
    }

    @Override // android.app.Fragment
    public void onResume() {
        com.google.googlesignin.GoogleSignInHelper.logDebug("onResume called");
        if (theFragment != this) {
            theFragment = this;
        }
        super.onResume();
        if (getState() == com.google.googlesignin.GoogleSignInFragment.State.PENDING) {
            com.google.googlesignin.GoogleSignInHelper.logDebug("State is pending, calling processRequest(false)");
            processRequest(false);
        } else if (getState() == com.google.googlesignin.GoogleSignInFragment.State.PENDING_SILENT) {
            com.google.googlesignin.GoogleSignInHelper.logDebug("State is pending_silent, calling processRequest(true)");
            processRequest(true);
        } else {
            com.google.googlesignin.GoogleSignInHelper.logDebug("State is now ready");
            setState(com.google.googlesignin.GoogleSignInFragment.State.READY);
        }
    }

    @Override // android.app.Fragment
    public void onActivityResult(int i, int i2, android.content.Intent intent) {
        com.google.googlesignin.GoogleSignInHelper.logDebug("onActivityResult: " + i + " " + i2);
        if (i == RC_SIGNIN) {
            com.google.android.gms.auth.api.signin.GoogleSignInResult signInResultFromIntent = com.google.android.gms.auth.api.Auth.GoogleSignInApi.getSignInResultFromIntent(intent);
            com.google.googlesignin.TokenRequest tokenRequest = this.request;
            if (tokenRequest == null) {
                com.google.googlesignin.GoogleSignInHelper.logError("Pending request is null, can't return result!");
                return;
            }
            if (signInResultFromIntent == null) {
                if (i2 >= 0) {
                    i2 = 13;
                }
                tokenRequest.setResult(i2, null);
                com.google.googlesignin.GoogleSignInHelper.logError("GoogleSignIn result is null, returning error.");
                return;
            }
            tokenRequest.setResult(signInResultFromIntent.getStatus().getStatusCode(), signInResultFromIntent.getSignInAccount());
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:10:0x0016 A[Catch: all -> 0x001d, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:7:0x000a, B:9:0x0013, B:11:0x0018, B:10:0x0016), top: B:17:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:9:0x0013 A[Catch: all -> 0x001d, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:7:0x000a, B:9:0x0013, B:11:0x0018, B:10:0x0016), top: B:17:0x0003 }] */
    public synchronized void clearRequest(boolean z) {
        com.google.googlesignin.GoogleSignInFragment.State state;
        if (z) {
            com.google.googlesignin.TokenRequest tokenRequest = this.request;
            if (tokenRequest != null) {
                tokenRequest.cancel();
            }
            this.request = null;
            if (getActivity() != null) {
                state = com.google.googlesignin.GoogleSignInFragment.State.READY;
            } else {
                state = com.google.googlesignin.GoogleSignInFragment.State.NEW;
            }
            setState(state);
        } else {
            this.request = null;
            if (getActivity() != null) {
                state = com.google.googlesignin.GoogleSignInFragment.State.READY;
            } else {
                state = com.google.googlesignin.GoogleSignInFragment.State.NEW;
            }
            setState(state);
        }
        throw th;
    }
}
