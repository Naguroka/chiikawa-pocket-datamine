package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzebv extends com.google.android.gms.internal.ads.zzbsw {
    final java.util.Map zza = new java.util.HashMap();
    private final android.content.Context zzb;
    private final com.google.android.gms.internal.ads.zzdrw zzc;
    private final com.google.android.gms.ads.internal.util.client.zzu zzd;
    private final com.google.android.gms.internal.ads.zzebk zze;
    private java.lang.String zzf;
    private java.lang.String zzg;

    public zzebv(android.content.Context context, com.google.android.gms.internal.ads.zzebk zzebkVar, com.google.android.gms.ads.internal.util.client.zzu zzuVar, com.google.android.gms.internal.ads.zzdrw zzdrwVar) {
        this.zzb = context;
        this.zzc = zzdrwVar;
        this.zzd = zzuVar;
        this.zze = zzebkVar;
    }

    public static void zzc(android.content.Context context, com.google.android.gms.internal.ads.zzdrw zzdrwVar, com.google.android.gms.internal.ads.zzebk zzebkVar, java.lang.String str, java.lang.String str2) {
        zzd(context, zzdrwVar, zzebkVar, str, str2, new java.util.HashMap());
    }

    public static void zzd(android.content.Context context, com.google.android.gms.internal.ads.zzdrw zzdrwVar, com.google.android.gms.internal.ads.zzebk zzebkVar, java.lang.String str, java.lang.String str2, java.util.Map map) {
        java.lang.String strZze;
        java.lang.String str3 = true != com.google.android.gms.ads.internal.zzv.zzp().zzA(context) ? "offline" : androidx.browser.customtabs.CustomTabsCallback.ONLINE_EXTRAS_KEY;
        if (zzdrwVar != null) {
            com.google.android.gms.internal.ads.zzdrv zzdrvVarZza = zzdrwVar.zza();
            zzdrvVarZza.zzb("gqi", str);
            zzdrvVarZza.zzb("action", str2);
            zzdrvVarZza.zzb("device_connectivity", str3);
            zzdrvVarZza.zzb("event_timestamp", java.lang.String.valueOf(com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis()));
            for (java.util.Map.Entry entry : map.entrySet()) {
                zzdrvVarZza.zzb((java.lang.String) entry.getKey(), (java.lang.String) entry.getValue());
            }
            strZze = zzdrvVarZza.zze();
        } else {
            strZze = "";
        }
        zzebkVar.zzd(new com.google.android.gms.internal.ads.zzebm(com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis(), str, strZze, 2));
    }

    public static final android.app.PendingIntent zzr(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        android.content.Intent intent = new android.content.Intent();
        intent.setAction(str);
        intent.putExtra("offline_notification_action", str);
        intent.putExtra("gws_query_id", str2);
        intent.putExtra("uri", str3);
        if (android.os.Build.VERSION.SDK_INT < 29 || !str.equals("offline_notification_clicked")) {
            intent.setClassName(context, com.google.android.gms.ads.AdService.CLASS_NAME);
            return com.google.android.gms.internal.ads.zzfrk.zzb(context, 0, intent, com.google.android.gms.internal.ads.zzfrk.zza | 1073741824, 0);
        }
        intent.setClassName(context, com.google.android.gms.ads.NotificationHandlerActivity.CLASS_NAME);
        return com.google.android.gms.internal.ads.zzfrk.zza(context, 0, intent, 201326592);
    }

    private final android.app.AlertDialog zzs(android.app.Activity activity, final com.google.android.gms.ads.internal.overlay.zzm zzmVar) {
        com.google.android.gms.ads.internal.zzv.zzq();
        android.app.AlertDialog.Builder onCancelListener = com.google.android.gms.ads.internal.util.zzs.zzL(activity).setOnCancelListener(new android.content.DialogInterface.OnCancelListener() { // from class: com.google.android.gms.internal.ads.zzebn
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(android.content.DialogInterface dialogInterface) {
                com.google.android.gms.ads.internal.overlay.zzm zzmVar2 = zzmVar;
                if (zzmVar2 != null) {
                    zzmVar2.zzb();
                }
            }
        });
        android.content.res.XmlResourceParser xmlResourceParserZzt = zzt(com.google.android.gms.ads.impl.R.layout.offline_ads_dialog);
        if (xmlResourceParserZzt == null) {
            onCancelListener.setMessage(zzv(com.google.android.gms.ads.impl.R.string.offline_dialog_text, "Thanks for your interest.\nWe will share more once you're back online."));
            return onCancelListener.create();
        }
        try {
            android.view.View viewInflate = activity.getLayoutInflater().inflate(xmlResourceParserZzt, (android.view.ViewGroup) null);
            onCancelListener.setView(viewInflate);
            java.lang.String strZzu = zzu();
            if (!android.text.TextUtils.isEmpty(strZzu)) {
                android.widget.TextView textView = (android.widget.TextView) viewInflate.findViewById(com.google.android.gms.ads.impl.R.id.offline_dialog_advertiser_name);
                textView.setVisibility(0);
                textView.setText(strZzu);
            }
            com.google.android.gms.internal.ads.zzebc zzebcVar = (com.google.android.gms.internal.ads.zzebc) this.zza.get(this.zzf);
            android.graphics.drawable.Drawable drawableZza = zzebcVar != null ? zzebcVar.zza() : null;
            if (drawableZza != null) {
                ((android.widget.ImageView) viewInflate.findViewById(com.google.android.gms.ads.impl.R.id.offline_dialog_image)).setImageDrawable(drawableZza);
            }
            android.app.AlertDialog alertDialogCreate = onCancelListener.create();
            alertDialogCreate.getWindow().setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(0));
            return alertDialogCreate;
        } catch (android.content.res.Resources.NotFoundException unused) {
            onCancelListener.setMessage(zzv(com.google.android.gms.ads.impl.R.string.offline_dialog_text, "Thanks for your interest.\nWe will share more once you're back online."));
            return onCancelListener.create();
        }
    }

    private static android.content.res.XmlResourceParser zzt(int i) {
        android.content.res.Resources resourcesZze = com.google.android.gms.ads.internal.zzv.zzp().zze();
        if (resourcesZze == null) {
            return null;
        }
        try {
            return resourcesZze.getLayout(i);
        } catch (android.content.res.Resources.NotFoundException unused) {
            return null;
        }
    }

    private final java.lang.String zzu() {
        com.google.android.gms.internal.ads.zzebc zzebcVar = (com.google.android.gms.internal.ads.zzebc) this.zza.get(this.zzf);
        return zzebcVar == null ? "" : zzebcVar.zzb();
    }

    private static java.lang.String zzv(int i, java.lang.String str) {
        android.content.res.Resources resourcesZze = com.google.android.gms.ads.internal.zzv.zzp().zze();
        if (resourcesZze == null) {
            return str;
        }
        try {
            return resourcesZze.getString(i);
        } catch (android.content.res.Resources.NotFoundException unused) {
            return str;
        }
    }

    private final void zzw(java.lang.String str, java.lang.String str2, java.util.Map map) {
        zzd(this.zzb, this.zzc, this.zze, str, str2, map);
    }

    private final void zzx() {
        boolean zZzg;
        try {
            com.google.android.gms.ads.internal.zzv.zzq();
            com.google.android.gms.ads.internal.util.zzbr zzbrVarZzA = com.google.android.gms.ads.internal.util.zzs.zzA(this.zzb);
            com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperWrap = com.google.android.gms.dynamic.ObjectWrapper.wrap(this.zzb);
            java.lang.String str = this.zzg;
            java.lang.String str2 = this.zzf;
            com.google.android.gms.internal.ads.zzebc zzebcVar = (com.google.android.gms.internal.ads.zzebc) this.zza.get(str2);
            zZzg = zzbrVarZzA.zzg(iObjectWrapperWrap, new com.google.android.gms.ads.internal.offline.buffering.zza(str, str2, zzebcVar == null ? "" : zzebcVar.zzc()));
            if (!zZzg) {
                try {
                    zZzg = zzbrVarZzA.zzf(com.google.android.gms.dynamic.ObjectWrapper.wrap(this.zzb), this.zzg, this.zzf);
                } catch (android.os.RemoteException e) {
                    e = e;
                    com.google.android.gms.ads.internal.util.client.zzo.zzh("Failed to schedule offline notification poster.", e);
                }
            }
        } catch (android.os.RemoteException e2) {
            e = e2;
            zZzg = false;
        }
        if (zZzg) {
            return;
        }
        this.zze.zzc(this.zzf);
        zzw(this.zzf, "offline_notification_worker_not_scheduled", com.google.android.gms.internal.ads.zzfxq.zzd());
    }

    private final void zzy(final android.app.Activity activity, final com.google.android.gms.ads.internal.overlay.zzm zzmVar) {
        com.google.android.gms.ads.internal.zzv.zzq();
        if (androidx.core.app.NotificationManagerCompat.from(activity).areNotificationsEnabled()) {
            zzx();
            zzz(activity, zzmVar);
        } else {
            if (android.os.Build.VERSION.SDK_INT >= 33) {
                activity.requestPermissions(new java.lang.String[]{"android.permission.POST_NOTIFICATIONS"}, 12345);
                zzw(this.zzf, "asnpdi", com.google.android.gms.internal.ads.zzfxq.zzd());
                return;
            }
            com.google.android.gms.ads.internal.zzv.zzq();
            android.app.AlertDialog.Builder builderZzL = com.google.android.gms.ads.internal.util.zzs.zzL(activity);
            builderZzL.setTitle(zzv(com.google.android.gms.ads.impl.R.string.notifications_permission_title, "Allow app to send you notifications?")).setPositiveButton(zzv(com.google.android.gms.ads.impl.R.string.notifications_permission_confirm, com.google.common.net.HttpHeaders.ALLOW), new android.content.DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzebo
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(android.content.DialogInterface dialogInterface, int i) {
                    this.zza.zzk(activity, zzmVar, dialogInterface, i);
                }
            }).setNegativeButton(zzv(com.google.android.gms.ads.impl.R.string.notifications_permission_decline, "Don't allow"), new android.content.DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzebp
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(android.content.DialogInterface dialogInterface, int i) {
                    this.zza.zzl(zzmVar, dialogInterface, i);
                }
            }).setOnCancelListener(new android.content.DialogInterface.OnCancelListener() { // from class: com.google.android.gms.internal.ads.zzebq
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(android.content.DialogInterface dialogInterface) {
                    this.zza.zzm(zzmVar, dialogInterface);
                }
            });
            builderZzL.create().show();
            zzw(this.zzf, "rtsdi", com.google.android.gms.internal.ads.zzfxq.zzd());
        }
    }

    private final void zzz(android.app.Activity activity, com.google.android.gms.ads.internal.overlay.zzm zzmVar) {
        android.app.AlertDialog alertDialogZzs = zzs(activity, zzmVar);
        alertDialogZzs.show();
        java.util.Timer timer = new java.util.Timer();
        timer.schedule(new com.google.android.gms.internal.ads.zzebu(this, alertDialogZzs, timer, zzmVar), androidx.media3.common.C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS);
    }

    @Override // com.google.android.gms.internal.ads.zzbsx
    public final void zze(android.content.Intent intent) {
        java.lang.String stringExtra = intent.getStringExtra("offline_notification_action");
        if (stringExtra.equals("offline_notification_clicked") || stringExtra.equals("offline_notification_dismissed")) {
            java.lang.String stringExtra2 = intent.getStringExtra("gws_query_id");
            java.lang.String stringExtra3 = intent.getStringExtra("uri");
            boolean zZzA = com.google.android.gms.ads.internal.zzv.zzp().zzA(this.zzb);
            java.util.HashMap map = new java.util.HashMap();
            char c = 2;
            if (stringExtra.equals("offline_notification_clicked")) {
                map.put("offline_notification_action", "offline_notification_clicked");
                c = true == zZzA ? (char) 1 : (char) 2;
                map.put("obvs", java.lang.String.valueOf(android.os.Build.VERSION.SDK_INT));
                map.put("olaih", java.lang.String.valueOf(stringExtra3.startsWith(androidx.webkit.ProxyConfig.MATCH_HTTP)));
                try {
                    android.content.Intent launchIntentForPackage = this.zzb.getPackageManager().getLaunchIntentForPackage(stringExtra3);
                    if (launchIntentForPackage == null) {
                        launchIntentForPackage = new android.content.Intent("android.intent.action.VIEW");
                        launchIntentForPackage.setData(android.net.Uri.parse(stringExtra3));
                    }
                    launchIntentForPackage.addFlags(268435456);
                    this.zzb.startActivity(launchIntentForPackage);
                    map.put("olaa", "olas");
                } catch (android.content.ActivityNotFoundException unused) {
                    map.put("olaa", "olaf");
                }
            } else {
                map.put("offline_notification_action", "offline_notification_dismissed");
            }
            zzw(stringExtra2, "offline_notification_action", map);
            try {
                android.database.sqlite.SQLiteDatabase writableDatabase = this.zze.getWritableDatabase();
                if (c == 1) {
                    this.zze.zzg(writableDatabase, this.zzd, stringExtra2);
                } else {
                    com.google.android.gms.internal.ads.zzebk.zzi(writableDatabase, stringExtra2);
                }
            } catch (android.database.sqlite.SQLiteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Failed to get writable offline buffering database: ".concat(e.toString()));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsx
    public final void zzf(java.lang.String[] strArr, int[] iArr, com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) {
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].equals("android.permission.POST_NOTIFICATIONS")) {
                com.google.android.gms.internal.ads.zzebx zzebxVar = (com.google.android.gms.internal.ads.zzebx) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper);
                android.app.Activity activityZza = zzebxVar.zza();
                com.google.android.gms.ads.internal.overlay.zzm zzmVarZzb = zzebxVar.zzb();
                java.util.HashMap map = new java.util.HashMap();
                if (iArr[i] == 0) {
                    map.put("dialog_action", "confirm");
                    zzx();
                    zzz(activityZza, zzmVarZzb);
                } else {
                    map.put("dialog_action", "dismiss");
                    if (zzmVarZzb != null) {
                        zzmVarZzb.zzb();
                    }
                }
                zzw(this.zzf, "asnpdc", map);
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsx
    public final void zzg(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) {
        com.google.android.gms.internal.ads.zzebx zzebxVar = (com.google.android.gms.internal.ads.zzebx) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper);
        final android.app.Activity activityZza = zzebxVar.zza();
        final com.google.android.gms.ads.internal.overlay.zzm zzmVarZzb = zzebxVar.zzb();
        this.zzf = zzebxVar.zzc();
        this.zzg = zzebxVar.zzd();
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzip)).booleanValue()) {
            zzy(activityZza, zzmVarZzb);
            return;
        }
        zzw(this.zzf, "dialog_impression", com.google.android.gms.internal.ads.zzfxq.zzd());
        com.google.android.gms.ads.internal.zzv.zzq();
        android.app.AlertDialog.Builder builderZzL = com.google.android.gms.ads.internal.util.zzs.zzL(activityZza);
        builderZzL.setTitle(zzv(com.google.android.gms.ads.impl.R.string.offline_opt_in_title, "Open ad when you're back online.")).setMessage(zzv(com.google.android.gms.ads.impl.R.string.offline_opt_in_message, "We'll send you a notification with a link to the advertiser site.")).setPositiveButton(zzv(com.google.android.gms.ads.impl.R.string.offline_opt_in_confirm, "OK"), new android.content.DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzebr
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(android.content.DialogInterface dialogInterface, int i) {
                this.zza.zzn(activityZza, zzmVarZzb, dialogInterface, i);
            }
        }).setNegativeButton(zzv(com.google.android.gms.ads.impl.R.string.offline_opt_in_decline, "No thanks"), new android.content.DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzebs
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(android.content.DialogInterface dialogInterface, int i) {
                this.zza.zzo(zzmVarZzb, dialogInterface, i);
            }
        }).setOnCancelListener(new android.content.DialogInterface.OnCancelListener() { // from class: com.google.android.gms.internal.ads.zzebt
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(android.content.DialogInterface dialogInterface) {
                this.zza.zzp(zzmVarZzb, dialogInterface);
            }
        });
        builderZzL.create().show();
    }

    @Override // com.google.android.gms.internal.ads.zzbsx
    public final void zzh() {
        final com.google.android.gms.ads.internal.util.client.zzu zzuVar = this.zzd;
        this.zze.zze(new com.google.android.gms.internal.ads.zzffr() { // from class: com.google.android.gms.internal.ads.zzebd
            @Override // com.google.android.gms.internal.ads.zzffr
            public final java.lang.Object zza(java.lang.Object obj) throws java.lang.Exception {
                com.google.android.gms.internal.ads.zzebk.zzb(zzuVar, (android.database.sqlite.SQLiteDatabase) obj);
                return null;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbsx
    public final void zzi(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, java.lang.String str, java.lang.String str2) {
        zzj(iObjectWrapper, new com.google.android.gms.ads.internal.offline.buffering.zza(str, str2, ""));
    }

    @Override // com.google.android.gms.internal.ads.zzbsx
    public final void zzj(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.offline.buffering.zza zzaVar) {
        android.graphics.Bitmap bitmapDecodeStream;
        java.lang.String str;
        android.content.Context context = (android.content.Context) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper);
        java.lang.String str2 = zzaVar.zza;
        java.lang.String str3 = zzaVar.zzb;
        java.lang.String str4 = zzaVar.zzc;
        java.lang.String strZzu = zzu();
        com.google.android.gms.ads.internal.zzv.zzr().zzh(context, "offline_notification_channel", "AdMob Offline Notifications");
        android.app.PendingIntent pendingIntentZzr = zzr(context, "offline_notification_clicked", str3, str2);
        android.app.PendingIntent pendingIntentZzr2 = zzr(context, "offline_notification_dismissed", str3, str2);
        androidx.core.app.NotificationCompat.Builder builder = new androidx.core.app.NotificationCompat.Builder(context, "offline_notification_channel");
        if (android.text.TextUtils.isEmpty(strZzu)) {
            builder.setContentTitle(zzv(com.google.android.gms.ads.impl.R.string.offline_notification_title, "You are back online! Let's pick up where we left off"));
        } else {
            builder.setContentTitle(java.lang.String.format(zzv(com.google.android.gms.ads.impl.R.string.offline_notification_title_with_advertiser, "You are back online! Continue learning about %s"), strZzu));
        }
        builder.setAutoCancel(true).setDeleteIntent(pendingIntentZzr2).setContentIntent(pendingIntentZzr).setSmallIcon(context.getApplicationInfo().icon).setPriority(((java.lang.Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zziq)).intValue());
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzis)).booleanValue() || str4.isEmpty()) {
            bitmapDecodeStream = null;
        } else {
            try {
                bitmapDecodeStream = android.graphics.BitmapFactory.decodeStream(new java.net.URL(str4).openConnection().getInputStream());
            } catch (java.io.IOException unused) {
                bitmapDecodeStream = null;
            }
        }
        if (bitmapDecodeStream != null) {
            try {
                builder.setLargeIcon(bitmapDecodeStream).setStyle(new androidx.core.app.NotificationCompat.BigPictureStyle().bigPicture(bitmapDecodeStream).bigLargeIcon(null));
            } catch (android.content.res.Resources.NotFoundException unused2) {
            }
        }
        android.app.NotificationManager notificationManager = (android.app.NotificationManager) context.getSystemService("notification");
        java.util.HashMap map = new java.util.HashMap();
        try {
            notificationManager.notify(str3, 54321, builder.build());
            str = "offline_notification_impression";
        } catch (java.lang.IllegalArgumentException e) {
            map.put("notification_not_shown_reason", e.getMessage());
            str = "offline_notification_failed";
        }
        zzw(str3, str, map);
    }

    final /* synthetic */ void zzk(android.app.Activity activity, com.google.android.gms.ads.internal.overlay.zzm zzmVar, android.content.DialogInterface dialogInterface, int i) {
        java.util.HashMap map = new java.util.HashMap();
        map.put("dialog_action", "confirm");
        zzw(this.zzf, "rtsdc", map);
        activity.startActivity(com.google.android.gms.ads.internal.zzv.zzr().zzf(activity));
        zzx();
        if (zzmVar != null) {
            zzmVar.zzb();
        }
    }

    final /* synthetic */ void zzl(com.google.android.gms.ads.internal.overlay.zzm zzmVar, android.content.DialogInterface dialogInterface, int i) {
        this.zze.zzc(this.zzf);
        java.util.HashMap map = new java.util.HashMap();
        map.put("dialog_action", "dismiss");
        zzw(this.zzf, "rtsdc", map);
        if (zzmVar != null) {
            zzmVar.zzb();
        }
    }

    final /* synthetic */ void zzm(com.google.android.gms.ads.internal.overlay.zzm zzmVar, android.content.DialogInterface dialogInterface) {
        this.zze.zzc(this.zzf);
        java.util.HashMap map = new java.util.HashMap();
        map.put("dialog_action", "dismiss");
        zzw(this.zzf, "rtsdc", map);
        if (zzmVar != null) {
            zzmVar.zzb();
        }
    }

    final /* synthetic */ void zzn(android.app.Activity activity, com.google.android.gms.ads.internal.overlay.zzm zzmVar, android.content.DialogInterface dialogInterface, int i) {
        java.util.HashMap map = new java.util.HashMap();
        map.put("dialog_action", "confirm");
        zzw(this.zzf, "dialog_click", map);
        zzy(activity, zzmVar);
    }

    final /* synthetic */ void zzo(com.google.android.gms.ads.internal.overlay.zzm zzmVar, android.content.DialogInterface dialogInterface, int i) {
        this.zze.zzc(this.zzf);
        java.util.HashMap map = new java.util.HashMap();
        map.put("dialog_action", "dismiss");
        zzw(this.zzf, "dialog_click", map);
        if (zzmVar != null) {
            zzmVar.zzb();
        }
    }

    final /* synthetic */ void zzp(com.google.android.gms.ads.internal.overlay.zzm zzmVar, android.content.DialogInterface dialogInterface) {
        this.zze.zzc(this.zzf);
        java.util.HashMap map = new java.util.HashMap();
        map.put("dialog_action", "dismiss");
        zzw(this.zzf, "dialog_click", map);
        if (zzmVar != null) {
            zzmVar.zzb();
        }
    }

    public final void zzq(java.lang.String str, com.google.android.gms.internal.ads.zzdif zzdifVar) {
        java.lang.String strZzx = zzdifVar.zzx();
        java.lang.String strZzB = zzdifVar.zzB();
        java.lang.String string = "";
        if (android.text.TextUtils.isEmpty(strZzx)) {
            strZzx = strZzB != null ? strZzB : "";
        }
        com.google.android.gms.internal.ads.zzbfw zzbfwVarZzm = zzdifVar.zzm();
        if (zzbfwVarZzm != null) {
            try {
                string = zzbfwVarZzm.zze().toString();
            } catch (android.os.RemoteException unused) {
            }
        }
        com.google.android.gms.internal.ads.zzbfw zzbfwVarZzn = zzdifVar.zzn();
        android.graphics.drawable.Drawable drawable = null;
        if (zzbfwVarZzn != null) {
            try {
                com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperZzf = zzbfwVarZzn.zzf();
                if (iObjectWrapperZzf != null) {
                    drawable = (android.graphics.drawable.Drawable) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapperZzf);
                }
            } catch (android.os.RemoteException unused2) {
            }
        }
        this.zza.put(str, new com.google.android.gms.internal.ads.zzeay(strZzx, string, drawable));
    }
}
