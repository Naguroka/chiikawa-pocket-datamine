package com.onevcat.uniwebview;

/* JADX INFO: loaded from: classes5.dex */
public final class W {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.app.Activity f3696a;
    public final java.lang.String b;
    public final com.onevcat.uniwebview.c2 c;
    public final kotlin.jvm.functions.Function0 d;
    public boolean e;
    public final java.util.HashMap f;
    public final com.onevcat.uniwebview.V g;

    public W(android.app.Activity activity, java.lang.String name, com.onevcat.uniwebview.c2 messageSender, com.onevcat.uniwebview.C1584t customizeHeaders) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(messageSender, "messageSender");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customizeHeaders, "customizeHeaders");
        this.f3696a = activity;
        this.b = name;
        this.c = messageSender;
        this.d = customizeHeaders;
        this.e = true;
        this.f = new java.util.HashMap();
        this.g = new com.onevcat.uniwebview.V(this);
    }

    public final void a(java.lang.String url, java.lang.String str, java.lang.String str2, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
        com.onevcat.uniwebview.C1545g c1545g = null;
        if (kotlin.text.StringsKt.startsWith$default(url, "data:", false, 2, (java.lang.Object) null)) {
            try {
                com.onevcat.uniwebview.C1563m c1563mA = com.onevcat.uniwebview.U.a(url);
                if (c1563mA != null) {
                    com.onevcat.uniwebview.C1548h c1548h = new com.onevcat.uniwebview.C1548h(url, c1563mA.b);
                    if (str2 == null && (str2 = c1563mA.f3739a) == null) {
                        str2 = "";
                    }
                    java.lang.String extensionFromMimeType = android.webkit.MimeTypeMap.getSingleton().getExtensionFromMimeType(str2);
                    c1545g = new com.onevcat.uniwebview.C1545g(c1548h, extensionFromMimeType == null ? com.onevcat.uniwebview.AbstractC1572p.a(kotlin.jvm.internal.StringCompanionObject.INSTANCE) : com.onevcat.uniwebview.AbstractC1572p.a(kotlin.jvm.internal.StringCompanionObject.INSTANCE) + '.' + extensionFromMimeType, z);
                }
            } catch (java.lang.Exception e) {
                com.onevcat.uniwebview.C1560l c1560l = com.onevcat.uniwebview.C1560l.b;
                java.lang.String message = "Failed to parse data url: " + url + ". Error: " + e;
                c1560l.getClass();
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
                c1560l.a(com.onevcat.uniwebview.EnumC1557k.CRITICAL, message);
            }
        } else if (android.webkit.URLUtil.isValidUrl(url)) {
            java.lang.String fileName = android.webkit.URLUtil.guessFileName(url, str, str2);
            com.onevcat.uniwebview.C1551i c1551i = new com.onevcat.uniwebview.C1551i(url);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(fileName, "fileName");
            c1545g = new com.onevcat.uniwebview.C1545g(c1551i, fileName, z);
        }
        if (c1545g != null) {
            a(c1545g);
        } else {
            android.app.Activity activity = this.f3696a;
            android.widget.Toast.makeText(activity, activity.getResources().getString(com.onevcat.uniwebview.R.string.INVALID_URL), 1).show();
        }
    }

    public final void b(com.onevcat.uniwebview.C1545g c1545g) {
        com.onevcat.uniwebview.AbstractC1554j abstractC1554j = c1545g.f3722a;
        if (abstractC1554j instanceof com.onevcat.uniwebview.C1551i) {
            android.app.DownloadManager.Request request = new android.app.DownloadManager.Request(android.net.Uri.parse(c1545g.a()));
            request.allowScanningByMediaScanner();
            request.setNotificationVisibility(1);
            request.setDescription(c1545g.b);
            request.setTitle(c1545g.b);
            request.setDestinationInExternalFilesDir(this.f3696a, android.os.Environment.DIRECTORY_DOWNLOADS, c1545g.b);
            request.addRequestHeader(com.google.common.net.HttpHeaders.COOKIE, android.webkit.CookieManager.getInstance().getCookie(c1545g.a()));
            for (java.util.Map.Entry entry : ((java.util.Map) this.d.invoke()).entrySet()) {
                request.addRequestHeader((java.lang.String) entry.getKey(), (java.lang.String) entry.getValue());
            }
            java.lang.Object systemService = this.f3696a.getSystemService("download");
            if (systemService instanceof android.app.DownloadManager) {
                this.f.put(java.lang.Long.valueOf(((android.app.DownloadManager) systemService).enqueue(request)), c1545g);
                android.app.Activity activity = this.f3696a;
                android.widget.Toast.makeText(activity, activity.getResources().getString(com.onevcat.uniwebview.R.string.DOWNLOAD_STARTED), 1).show();
                if (c1545g.c) {
                    this.c.a(this.b, com.onevcat.uniwebview.d2.FileDownloadStarted, new com.onevcat.uniwebview.Y1(c1545g.a(), "0", c1545g.b, null));
                    return;
                }
                return;
            }
            return;
        }
        if (abstractC1554j instanceof com.onevcat.uniwebview.C1548h) {
            com.onevcat.uniwebview.C1548h c1548h = (com.onevcat.uniwebview.C1548h) abstractC1554j;
            java.lang.String strA = c1545g.a();
            if (c1545g.c) {
                this.c.a(this.b, com.onevcat.uniwebview.d2.FileDownloadStarted, new com.onevcat.uniwebview.Y1(strA, "0", c1545g.b, null));
            }
            try {
                java.io.File file = new java.io.File(this.f3696a.getExternalFilesDir(android.os.Environment.DIRECTORY_DOWNLOADS), c1545g.b);
                kotlin.io.FilesKt.writeBytes(file, c1548h.b);
                if (c1545g.c) {
                    java.lang.String absolutePath = file.getAbsolutePath();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(absolutePath, "file.absolutePath");
                    this.c.a(this.b, com.onevcat.uniwebview.d2.FileDownloadFinished, new com.onevcat.uniwebview.Y1(strA, "0", absolutePath, null));
                }
            } catch (java.lang.Exception e) {
                com.onevcat.uniwebview.C1560l c1560l = com.onevcat.uniwebview.C1560l.b;
                java.lang.String message = "Failed to download base64 data: " + strA + ". Error: " + e;
                c1560l.getClass();
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
                c1560l.a(com.onevcat.uniwebview.EnumC1557k.CRITICAL, message);
            }
        }
    }

    public final void a() {
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            this.f3696a.registerReceiver(this.g, new android.content.IntentFilter("android.intent.action.DOWNLOAD_COMPLETE"), 2);
        } else {
            this.f3696a.registerReceiver(this.g, new android.content.IntentFilter("android.intent.action.DOWNLOAD_COMPLETE"));
        }
    }

    public final void a(final com.onevcat.uniwebview.C1545g c1545g) {
        if (!this.e) {
            b(c1545g);
            return;
        }
        final android.widget.EditText editText = new android.widget.EditText(this.f3696a);
        editText.setSingleLine();
        editText.setText(c1545g.b);
        android.app.AlertDialog.Builder cancelable = new android.app.AlertDialog.Builder(this.f3696a).setTitle(c1545g.a()).setMessage(this.f3696a.getResources().getString(com.onevcat.uniwebview.R.string.DOWNLOAD_DESCRIPTION)).setIcon(android.R.drawable.ic_dialog_info).setCancelable(true);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(cancelable, "Builder(activity)\n      …     .setCancelable(true)");
        com.onevcat.uniwebview.AbstractC1527a.a(cancelable, editText).setPositiveButton(android.R.string.ok, new android.content.DialogInterface.OnClickListener() { // from class: com.onevcat.uniwebview.W$$ExternalSyntheticLambda0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(android.content.DialogInterface dialogInterface, int i) {
                com.onevcat.uniwebview.W.a(editText, c1545g, this, dialogInterface, i);
            }
        }).setNegativeButton(android.R.string.cancel, new android.content.DialogInterface.OnClickListener() { // from class: com.onevcat.uniwebview.W$$ExternalSyntheticLambda1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(android.content.DialogInterface dialogInterface, int i) {
                com.onevcat.uniwebview.W.a(dialogInterface, i);
            }
        }).create().show();
    }

    public static final void a(android.widget.EditText input, com.onevcat.uniwebview.C1545g task, com.onevcat.uniwebview.W this$0, android.content.DialogInterface dialogInterface, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "$input");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(task, "$task");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        java.lang.String string = input.getText().toString();
        dialogInterface.dismiss();
        task.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(string, "<set-?>");
        task.b = string;
        this$0.b(task);
    }

    public static final void a(android.content.DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
    }
}
