package com.google.android.gms.common;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public class GoogleApiAvailability extends com.google.android.gms.common.GoogleApiAvailabilityLight {
    public static final java.lang.String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";
    private java.lang.String zac;
    private static final java.lang.Object zaa = new java.lang.Object();
    private static final com.google.android.gms.common.GoogleApiAvailability zab = new com.google.android.gms.common.GoogleApiAvailability();
    public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = com.google.android.gms.common.GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;

    public static com.google.android.gms.common.GoogleApiAvailability getInstance() {
        return zab;
    }

    public static final com.google.android.gms.tasks.Task zai(com.google.android.gms.common.api.HasApiKey hasApiKey, com.google.android.gms.common.api.HasApiKey... hasApiKeyArr) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(hasApiKey, "Requested API must not be null.");
        for (com.google.android.gms.common.api.HasApiKey hasApiKey2 : hasApiKeyArr) {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(hasApiKey2, "Requested API must not be null.");
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(hasApiKeyArr.length + 1);
        arrayList.add(hasApiKey);
        arrayList.addAll(java.util.Arrays.asList(hasApiKeyArr));
        return com.google.android.gms.common.api.internal.GoogleApiManager.zaj().zam(arrayList);
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> checkApiAvailability(com.google.android.gms.common.api.GoogleApi<?> googleApi, com.google.android.gms.common.api.GoogleApi<?>... googleApiArr) {
        return zai(googleApi, googleApiArr).onSuccessTask(new com.google.android.gms.tasks.SuccessContinuation() { // from class: com.google.android.gms.common.zab
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final com.google.android.gms.tasks.Task then(java.lang.Object obj) {
                int i = com.google.android.gms.common.GoogleApiAvailability.GOOGLE_PLAY_SERVICES_VERSION_CODE;
                return com.google.android.gms.tasks.Tasks.forResult(null);
            }
        });
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    public int getClientVersion(android.content.Context context) {
        return super.getClientVersion(context);
    }

    public android.app.Dialog getErrorDialog(android.app.Activity activity, int i, int i2) {
        return getErrorDialog(activity, i, i2, (android.content.DialogInterface.OnCancelListener) null);
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    public android.content.Intent getErrorResolutionIntent(android.content.Context context, int i, java.lang.String str) {
        return super.getErrorResolutionIntent(context, i, str);
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    public android.app.PendingIntent getErrorResolutionPendingIntent(android.content.Context context, int i, int i2) {
        return super.getErrorResolutionPendingIntent(context, i, i2);
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    public final java.lang.String getErrorString(int i) {
        return super.getErrorString(i);
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    public int isGooglePlayServicesAvailable(android.content.Context context) {
        return super.isGooglePlayServicesAvailable(context);
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    public final boolean isUserResolvableError(int i) {
        return super.isUserResolvableError(i);
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> makeGooglePlayServicesAvailable(android.app.Activity activity) {
        int i = GOOGLE_PLAY_SERVICES_VERSION_CODE;
        com.google.android.gms.common.internal.Preconditions.checkMainThread("makeGooglePlayServicesAvailable must be called from the main thread");
        int iIsGooglePlayServicesAvailable = isGooglePlayServicesAvailable(activity, i);
        if (iIsGooglePlayServicesAvailable == 0) {
            return com.google.android.gms.tasks.Tasks.forResult(null);
        }
        com.google.android.gms.common.api.internal.zaca zacaVarZaa = com.google.android.gms.common.api.internal.zaca.zaa(activity);
        zacaVarZaa.zah(new com.google.android.gms.common.ConnectionResult(iIsGooglePlayServicesAvailable, null), 0);
        return zacaVarZaa.zad();
    }

    public void setDefaultNotificationChannelId(android.content.Context context, java.lang.String str) {
        if (com.google.android.gms.common.util.PlatformVersion.isAtLeastO()) {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(((android.app.NotificationManager) com.google.android.gms.common.internal.Preconditions.checkNotNull(context.getSystemService("notification"))).getNotificationChannel(str));
        }
        synchronized (zaa) {
            this.zac = str;
        }
    }

    public boolean showErrorDialogFragment(android.app.Activity activity, int i, int i2) {
        return showErrorDialogFragment(activity, i, i2, (android.content.DialogInterface.OnCancelListener) null);
    }

    public void showErrorNotification(android.content.Context context, int i) {
        zae(context, i, null, getErrorResolutionPendingIntent(context, i, 0, com.json.zb.q));
    }

    final android.app.Dialog zaa(android.content.Context context, int i, com.google.android.gms.common.internal.zag zagVar, android.content.DialogInterface.OnCancelListener onCancelListener, android.content.DialogInterface.OnClickListener onClickListener) {
        android.app.AlertDialog.Builder builder;
        android.app.AlertDialog.Builder builder2 = null;
        if (i == 0) {
            return null;
        }
        android.util.TypedValue typedValue = new android.util.TypedValue();
        context.getTheme().resolveAttribute(android.R.attr.alertDialogTheme, typedValue, true);
        if ("Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId))) {
            builder = new android.app.AlertDialog.Builder(context, 5);
        }
        if (builder2 == null) {
            builder2 = builder;
            builder2 = new android.app.AlertDialog.Builder(context);
        }
        builder2 = builder;
        builder2.setMessage(com.google.android.gms.common.internal.zac.zac(context, i));
        if (onCancelListener != null) {
            builder2.setOnCancelListener(onCancelListener);
        }
        java.lang.String strZab = com.google.android.gms.common.internal.zac.zab(context, i);
        android.content.DialogInterface.OnClickListener onClickListener2 = zagVar;
        if (strZab != null) {
            if (zagVar == null) {
                onClickListener2 = onClickListener;
            }
            builder2.setPositiveButton(strZab, onClickListener2);
        }
        java.lang.String strZaf = com.google.android.gms.common.internal.zac.zaf(context, i);
        if (strZaf != null) {
            builder2.setTitle(strZaf);
        }
        android.util.Log.w("GoogleApiAvailability", java.lang.String.format("Creating dialog for Google Play services availability issue. ConnectionResult=%s", java.lang.Integer.valueOf(i)), new java.lang.IllegalArgumentException());
        return builder2.create();
    }

    public final android.app.Dialog zab(android.app.Activity activity, android.content.DialogInterface.OnCancelListener onCancelListener) {
        android.widget.ProgressBar progressBar = new android.widget.ProgressBar(activity, null, android.R.attr.progressBarStyleLarge);
        progressBar.setIndeterminate(true);
        progressBar.setVisibility(0);
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(activity);
        builder.setView(progressBar);
        builder.setMessage(com.google.android.gms.common.internal.zac.zac(activity, 18));
        builder.setPositiveButton("", (android.content.DialogInterface.OnClickListener) null);
        android.app.AlertDialog alertDialogCreate = builder.create();
        zad(activity, alertDialogCreate, "GooglePlayServicesUpdatingDialog", onCancelListener);
        return alertDialogCreate;
    }

    public final com.google.android.gms.common.api.internal.zabv zac(android.content.Context context, com.google.android.gms.common.api.internal.zabu zabuVar) {
        android.content.IntentFilter intentFilter = new android.content.IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        com.google.android.gms.common.api.internal.zabv zabvVar = new com.google.android.gms.common.api.internal.zabv(zabuVar);
        androidx.core.content.ContextCompat.registerReceiver(context, zabvVar, intentFilter, 2);
        zabvVar.zaa(context);
        if (isUninstalledAppPossiblyUpdating(context, "com.google.android.gms")) {
            return zabvVar;
        }
        zabuVar.zaa();
        zabvVar.zab();
        return null;
    }

    final void zad(android.app.Activity activity, android.app.Dialog dialog, java.lang.String str, android.content.DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof androidx.fragment.app.FragmentActivity) {
                com.google.android.gms.common.SupportErrorDialogFragment.newInstance(dialog, onCancelListener).show(((androidx.fragment.app.FragmentActivity) activity).getSupportFragmentManager(), str);
                return;
            }
        } catch (java.lang.NoClassDefFoundError unused) {
        }
        com.google.android.gms.common.ErrorDialogFragment.newInstance(dialog, onCancelListener).show(activity.getFragmentManager(), str);
    }

    final void zae(android.content.Context context, int i, java.lang.String str, android.app.PendingIntent pendingIntent) {
        int i2;
        java.lang.String str2;
        android.util.Log.w("GoogleApiAvailability", java.lang.String.format("GMS core API Availability. ConnectionResult=%s, tag=%s", java.lang.Integer.valueOf(i), null), new java.lang.IllegalArgumentException());
        if (i == 18) {
            zaf(context);
            return;
        }
        if (pendingIntent == null) {
            if (i == 6) {
                android.util.Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        java.lang.String strZae = com.google.android.gms.common.internal.zac.zae(context, i);
        java.lang.String strZad = com.google.android.gms.common.internal.zac.zad(context, i);
        android.content.res.Resources resources = context.getResources();
        android.app.NotificationManager notificationManager = (android.app.NotificationManager) com.google.android.gms.common.internal.Preconditions.checkNotNull(context.getSystemService("notification"));
        androidx.core.app.NotificationCompat.Builder style = new androidx.core.app.NotificationCompat.Builder(context).setLocalOnly(true).setAutoCancel(true).setContentTitle(strZae).setStyle(new androidx.core.app.NotificationCompat.BigTextStyle().bigText(strZad));
        boolean zIsWearable = com.google.android.gms.common.util.DeviceProperties.isWearable(context);
        int i3 = android.R.drawable.stat_sys_warning;
        if (zIsWearable) {
            com.google.android.gms.common.internal.Preconditions.checkState(com.google.android.gms.common.util.PlatformVersion.isAtLeastKitKatWatch());
            int i4 = context.getApplicationInfo().icon;
            if (i4 != 0) {
                i3 = i4;
            }
            style.setSmallIcon(i3).setPriority(2);
            if (com.google.android.gms.common.util.DeviceProperties.isWearableWithoutPlayStore(context)) {
                style.addAction(com.google.android.gms.base.R.drawable.common_full_open_on_phone, resources.getString(com.google.android.gms.base.R.string.common_open_on_phone), pendingIntent);
            } else {
                style.setContentIntent(pendingIntent);
            }
        } else {
            style.setSmallIcon(android.R.drawable.stat_sys_warning).setTicker(resources.getString(com.google.android.gms.base.R.string.common_google_play_services_notification_ticker)).setWhen(java.lang.System.currentTimeMillis()).setContentIntent(pendingIntent).setContentText(strZad);
        }
        if (com.google.android.gms.common.util.PlatformVersion.isAtLeastO()) {
            com.google.android.gms.common.internal.Preconditions.checkState(com.google.android.gms.common.util.PlatformVersion.isAtLeastO());
            synchronized (zaa) {
                str2 = this.zac;
            }
            if (str2 == null) {
                str2 = "com.google.android.gms.availability";
                android.app.NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
                java.lang.String string = context.getResources().getString(com.google.android.gms.base.R.string.common_google_play_services_notification_channel_name);
                if (notificationChannel == null) {
                    notificationManager.createNotificationChannel(new android.app.NotificationChannel("com.google.android.gms.availability", string, 4));
                } else if (!string.contentEquals(notificationChannel.getName())) {
                    notificationChannel.setName(string);
                    notificationManager.createNotificationChannel(notificationChannel);
                }
            }
            style.setChannelId(str2);
        }
        android.app.Notification notificationBuild = style.build();
        if (i == 1 || i == 2 || i == 3) {
            com.google.android.gms.common.GooglePlayServicesUtilLight.sCanceledAvailabilityNotification.set(false);
            i2 = 10436;
        } else {
            i2 = 39789;
        }
        notificationManager.notify(i2, notificationBuild);
    }

    final void zaf(android.content.Context context) {
        new com.google.android.gms.common.zad(this, context).sendEmptyMessageDelayed(1, com.unity3d.services.UnityAdsConstants.Timeout.INIT_TIMEOUT_MS);
    }

    public final boolean zag(android.app.Activity activity, com.google.android.gms.common.api.internal.LifecycleFragment lifecycleFragment, int i, int i2, android.content.DialogInterface.OnCancelListener onCancelListener) {
        android.app.Dialog dialogZaa = zaa(activity, i, com.google.android.gms.common.internal.zag.zad(lifecycleFragment, getErrorResolutionIntent(activity, i, "d"), 2), onCancelListener, null);
        if (dialogZaa == null) {
            return false;
        }
        zad(activity, dialogZaa, com.google.android.gms.common.GooglePlayServicesUtil.GMS_ERROR_DIALOG, onCancelListener);
        return true;
    }

    public final boolean zah(android.content.Context context, com.google.android.gms.common.ConnectionResult connectionResult, int i) {
        android.app.PendingIntent errorResolutionPendingIntent;
        if (com.google.android.gms.common.wrappers.InstantApps.isInstantApp(context) || (errorResolutionPendingIntent = getErrorResolutionPendingIntent(context, connectionResult)) == null) {
            return false;
        }
        zae(context, connectionResult.getErrorCode(), null, android.app.PendingIntent.getActivity(context, 0, com.google.android.gms.common.api.GoogleApiActivity.zaa(context, errorResolutionPendingIntent, i, true), com.google.android.gms.internal.base.zal.zaa | androidx.media3.common.C.BUFFER_FLAG_FIRST_SAMPLE));
        return true;
    }

    public android.app.Dialog getErrorDialog(android.app.Activity activity, int i, int i2, android.content.DialogInterface.OnCancelListener onCancelListener) {
        return zaa(activity, i, com.google.android.gms.common.internal.zag.zab(activity, getErrorResolutionIntent(activity, i, "d"), i2), onCancelListener, null);
    }

    public android.app.PendingIntent getErrorResolutionPendingIntent(android.content.Context context, com.google.android.gms.common.ConnectionResult connectionResult) {
        return connectionResult.hasResolution() ? connectionResult.getResolution() : getErrorResolutionPendingIntent(context, connectionResult.getErrorCode(), 0);
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    public int isGooglePlayServicesAvailable(android.content.Context context, int i) {
        return super.isGooglePlayServicesAvailable(context, i);
    }

    public boolean showErrorDialogFragment(android.app.Activity activity, int i, int i2, android.content.DialogInterface.OnCancelListener onCancelListener) {
        android.app.Dialog errorDialog = getErrorDialog(activity, i, i2, onCancelListener);
        if (errorDialog == null) {
            return false;
        }
        zad(activity, errorDialog, com.google.android.gms.common.GooglePlayServicesUtil.GMS_ERROR_DIALOG, onCancelListener);
        return true;
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> checkApiAvailability(com.google.android.gms.common.api.HasApiKey<?> hasApiKey, com.google.android.gms.common.api.HasApiKey<?>... hasApiKeyArr) {
        return zai(hasApiKey, hasApiKeyArr).onSuccessTask(new com.google.android.gms.tasks.SuccessContinuation() { // from class: com.google.android.gms.common.zaa
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final com.google.android.gms.tasks.Task then(java.lang.Object obj) {
                int i = com.google.android.gms.common.GoogleApiAvailability.GOOGLE_PLAY_SERVICES_VERSION_CODE;
                return com.google.android.gms.tasks.Tasks.forResult(null);
            }
        });
    }

    public void showErrorNotification(android.content.Context context, com.google.android.gms.common.ConnectionResult connectionResult) {
        zae(context, connectionResult.getErrorCode(), null, getErrorResolutionPendingIntent(context, connectionResult));
    }

    public android.app.Dialog getErrorDialog(androidx.fragment.app.Fragment fragment, int i, int i2) {
        return getErrorDialog(fragment, i, i2, (android.content.DialogInterface.OnCancelListener) null);
    }

    public boolean showErrorDialogFragment(android.app.Activity activity, int i, androidx.activity.result.ActivityResultLauncher<androidx.activity.result.IntentSenderRequest> activityResultLauncher, android.content.DialogInterface.OnCancelListener onCancelListener) {
        android.app.Dialog dialogZaa = zaa(activity, i, null, onCancelListener, new com.google.android.gms.common.zac(this, activity, i, activityResultLauncher));
        if (dialogZaa == null) {
            return false;
        }
        zad(activity, dialogZaa, com.google.android.gms.common.GooglePlayServicesUtil.GMS_ERROR_DIALOG, onCancelListener);
        return true;
    }

    public android.app.Dialog getErrorDialog(androidx.fragment.app.Fragment fragment, int i, int i2, android.content.DialogInterface.OnCancelListener onCancelListener) {
        return zaa(fragment.requireContext(), i, com.google.android.gms.common.internal.zag.zac(fragment, getErrorResolutionIntent(fragment.requireContext(), i, "d"), i2), onCancelListener, null);
    }
}
