package com.google.android.gms.auth.api.signin.internal;

/* JADX INFO: loaded from: classes4.dex */
public class SignInHubActivity extends androidx.fragment.app.FragmentActivity {
    private static boolean zzbt = false;
    private boolean zzbu = false;
    private com.google.android.gms.auth.api.signin.internal.SignInConfiguration zzbv;
    private boolean zzbw;
    private int zzbx;
    private android.content.Intent zzby;

    private class zzc implements androidx.loader.app.LoaderManager.LoaderCallbacks<java.lang.Void> {
        private zzc() {
        }

        @Override // androidx.loader.app.LoaderManager.LoaderCallbacks
        public final void onLoaderReset(androidx.loader.content.Loader<java.lang.Void> loader) {
        }

        @Override // androidx.loader.app.LoaderManager.LoaderCallbacks
        public final androidx.loader.content.Loader<java.lang.Void> onCreateLoader(int i, android.os.Bundle bundle) {
            return new com.google.android.gms.auth.api.signin.internal.zze(com.google.android.gms.auth.api.signin.internal.SignInHubActivity.this, com.google.android.gms.common.api.GoogleApiClient.getAllClients());
        }

        @Override // androidx.loader.app.LoaderManager.LoaderCallbacks
        public final /* synthetic */ void onLoadFinished(androidx.loader.content.Loader<java.lang.Void> loader, java.lang.Void r3) {
            com.google.android.gms.auth.api.signin.internal.SignInHubActivity signInHubActivity = com.google.android.gms.auth.api.signin.internal.SignInHubActivity.this;
            signInHubActivity.setResult(signInHubActivity.zzbx, com.google.android.gms.auth.api.signin.internal.SignInHubActivity.this.zzby);
            com.google.android.gms.auth.api.signin.internal.SignInHubActivity.this.finish();
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        return true;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.content.Intent intent = getIntent();
        java.lang.String action = intent.getAction();
        if ("com.google.android.gms.auth.NO_IMPL".equals(action)) {
            zzc(com.google.android.gms.auth.api.signin.GoogleSignInStatusCodes.SIGN_IN_FAILED);
            return;
        }
        if (!action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN") && !action.equals("com.google.android.gms.auth.APPAUTH_SIGN_IN")) {
            java.lang.String strValueOf = java.lang.String.valueOf(intent.getAction());
            android.util.Log.e("AuthSignInClient", strValueOf.length() != 0 ? "Unknown action: ".concat(strValueOf) : new java.lang.String("Unknown action: "));
            finish();
            return;
        }
        com.google.android.gms.auth.api.signin.internal.SignInConfiguration signInConfiguration = (com.google.android.gms.auth.api.signin.internal.SignInConfiguration) intent.getBundleExtra("config").getParcelable("config");
        this.zzbv = signInConfiguration;
        if (signInConfiguration == null) {
            android.util.Log.e("AuthSignInClient", "Activity started with invalid configuration.");
            setResult(0);
            finish();
            return;
        }
        if (bundle == null) {
            if (zzbt) {
                setResult(0);
                zzc(com.google.android.gms.auth.api.signin.GoogleSignInStatusCodes.SIGN_IN_CURRENTLY_IN_PROGRESS);
                return;
            }
            zzbt = true;
            android.content.Intent intent2 = new android.content.Intent(action);
            if (action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN")) {
                intent2.setPackage("com.google.android.gms");
            } else {
                intent2.setPackage(getPackageName());
            }
            intent2.putExtra("config", this.zzbv);
            try {
                startActivityForResult(intent2, 40962);
                return;
            } catch (android.content.ActivityNotFoundException unused) {
                this.zzbu = true;
                android.util.Log.w("AuthSignInClient", "Could not launch sign in Intent. Google Play Service is probably being updated...");
                zzc(17);
                return;
            }
        }
        boolean z = bundle.getBoolean("signingInGoogleApiClients");
        this.zzbw = z;
        if (z) {
            this.zzbx = bundle.getInt("signInResultCode");
            this.zzby = (android.content.Intent) bundle.getParcelable("signInResultData");
            zzn();
        }
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onSaveInstanceState(android.os.Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("signingInGoogleApiClients", this.zzbw);
        if (this.zzbw) {
            bundle.putInt("signInResultCode", this.zzbx);
            bundle.putParcelable("signInResultData", this.zzby);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    protected void onActivityResult(int i, int i2, android.content.Intent intent) {
        if (this.zzbu) {
            return;
        }
        setResult(0);
        if (i != 40962) {
            return;
        }
        if (intent != null) {
            com.google.android.gms.auth.api.signin.SignInAccount signInAccount = (com.google.android.gms.auth.api.signin.SignInAccount) intent.getParcelableExtra(com.google.android.gms.auth.api.signin.GoogleSignInApi.EXTRA_SIGN_IN_ACCOUNT);
            if (signInAccount != null && signInAccount.getGoogleSignInAccount() != null) {
                com.google.android.gms.auth.api.signin.GoogleSignInAccount googleSignInAccount = signInAccount.getGoogleSignInAccount();
                com.google.android.gms.auth.api.signin.internal.zzp.zzd(this).zzc(this.zzbv.zzm(), googleSignInAccount);
                intent.removeExtra(com.google.android.gms.auth.api.signin.GoogleSignInApi.EXTRA_SIGN_IN_ACCOUNT);
                intent.putExtra("googleSignInAccount", googleSignInAccount);
                this.zzbw = true;
                this.zzbx = i2;
                this.zzby = intent;
                zzn();
                return;
            }
            if (intent.hasExtra(com.json.mediationsdk.utils.IronSourceConstants.EVENTS_ERROR_CODE)) {
                int intExtra = intent.getIntExtra(com.json.mediationsdk.utils.IronSourceConstants.EVENTS_ERROR_CODE, 8);
                if (intExtra == 13) {
                    intExtra = com.google.android.gms.auth.api.signin.GoogleSignInStatusCodes.SIGN_IN_CANCELLED;
                }
                zzc(intExtra);
                return;
            }
        }
        zzc(8);
    }

    private final void zzn() {
        getSupportLoaderManager().initLoader(0, null, new com.google.android.gms.auth.api.signin.internal.SignInHubActivity.zzc());
        zzbt = false;
    }

    private final void zzc(int i) {
        com.google.android.gms.common.api.Status status = new com.google.android.gms.common.api.Status(i);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("googleSignInStatus", status);
        setResult(0, intent);
        finish();
        zzbt = false;
    }
}
