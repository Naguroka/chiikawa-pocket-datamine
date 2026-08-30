package com.google.android.gms.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class AdActivity extends android.app.Activity {
    public static final java.lang.String CLASS_NAME = "com.google.android.gms.ads.AdActivity";
    private com.google.android.gms.internal.ads.zzbte zza;

    private final void zza() {
        com.google.android.gms.internal.ads.zzbte zzbteVar = this.zza;
        if (zzbteVar != null) {
            try {
                zzbteVar.zzx();
            } catch (android.os.RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
            }
        }
    }

    @Override // android.app.Activity
    protected final void onActivityResult(int i, int i2, android.content.Intent intent) {
        try {
            com.google.android.gms.internal.ads.zzbte zzbteVar = this.zza;
            if (zzbteVar != null) {
                zzbteVar.zzh(i, i2, intent);
            }
        } catch (java.lang.Exception e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        try {
            com.google.android.gms.internal.ads.zzbte zzbteVar = this.zza;
            if (zzbteVar != null && !zzbteVar.zzH()) {
                return;
            }
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
        super.onBackPressed();
        try {
            com.google.android.gms.internal.ads.zzbte zzbteVar2 = this.zza;
            if (zzbteVar2 != null) {
                zzbteVar2.zzi();
            }
        } catch (android.os.RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e2);
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        try {
            com.google.android.gms.internal.ads.zzbte zzbteVar = this.zza;
            if (zzbteVar != null) {
                zzbteVar.zzk(com.google.android.gms.dynamic.ObjectWrapper.wrap(configuration));
            }
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // android.app.Activity
    protected final void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.google.android.gms.internal.ads.zzbte zzbteVarZzq = com.google.android.gms.ads.internal.client.zzbc.zza().zzq(this);
        this.zza = zzbteVarZzq;
        if (zzbteVarZzq == null) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", null);
            finish();
            return;
        }
        try {
            zzbteVarZzq.zzl(bundle);
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
            finish();
        }
    }

    @Override // android.app.Activity
    protected final void onDestroy() {
        try {
            com.google.android.gms.internal.ads.zzbte zzbteVar = this.zza;
            if (zzbteVar != null) {
                zzbteVar.zzm();
            }
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    protected final void onPause() {
        try {
            com.google.android.gms.internal.ads.zzbte zzbteVar = this.zza;
            if (zzbteVar != null) {
                zzbteVar.zzo();
            }
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
            finish();
        }
        super.onPause();
    }

    @Override // android.app.Activity
    public final void onRequestPermissionsResult(int i, java.lang.String[] strArr, int[] iArr) {
        try {
            com.google.android.gms.internal.ads.zzbte zzbteVar = this.zza;
            if (zzbteVar != null) {
                zzbteVar.zzp(i, strArr, iArr);
            }
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // android.app.Activity
    protected final void onRestart() {
        super.onRestart();
        try {
            com.google.android.gms.internal.ads.zzbte zzbteVar = this.zza;
            if (zzbteVar != null) {
                zzbteVar.zzq();
            }
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
            finish();
        }
    }

    @Override // android.app.Activity
    protected final void onResume() {
        super.onResume();
        try {
            com.google.android.gms.internal.ads.zzbte zzbteVar = this.zza;
            if (zzbteVar != null) {
                zzbteVar.zzr();
            }
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
            finish();
        }
    }

    @Override // android.app.Activity
    protected final void onSaveInstanceState(android.os.Bundle bundle) {
        try {
            com.google.android.gms.internal.ads.zzbte zzbteVar = this.zza;
            if (zzbteVar != null) {
                zzbteVar.zzs(bundle);
            }
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
            finish();
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    protected final void onStart() {
        super.onStart();
        try {
            com.google.android.gms.internal.ads.zzbte zzbteVar = this.zza;
            if (zzbteVar != null) {
                zzbteVar.zzt();
            }
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
            finish();
        }
    }

    @Override // android.app.Activity
    protected final void onStop() {
        try {
            com.google.android.gms.internal.ads.zzbte zzbteVar = this.zza;
            if (zzbteVar != null) {
                zzbteVar.zzu();
            }
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
            finish();
        }
        super.onStop();
    }

    @Override // android.app.Activity
    protected final void onUserLeaveHint() {
        super.onUserLeaveHint();
        try {
            com.google.android.gms.internal.ads.zzbte zzbteVar = this.zza;
            if (zzbteVar != null) {
                zzbteVar.zzv();
            }
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // android.app.Activity
    public final void setContentView(int i) {
        super.setContentView(i);
        zza();
    }

    @Override // android.app.Activity
    public final void setContentView(android.view.View view) {
        super.setContentView(view);
        zza();
    }

    @Override // android.app.Activity
    public final void setContentView(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        zza();
    }
}
