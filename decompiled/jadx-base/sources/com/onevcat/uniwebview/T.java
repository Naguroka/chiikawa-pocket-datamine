package com.onevcat.uniwebview;

/* JADX INFO: loaded from: classes5.dex */
public final class T implements com.onevcat.uniwebview.InterfaceC1601y {
    public final android.webkit.ValueCallback b;
    public final android.webkit.WebChromeClient.FileChooserParams c;
    public boolean d;
    public java.io.File e;
    public java.io.File f;
    public java.lang.String g;
    public android.content.Context h;

    public T(android.webkit.ValueCallback valueCallback, android.webkit.WebChromeClient.FileChooserParams fileChooserParams) {
        this.b = valueCallback;
        this.c = fileChooserParams;
    }

    public static boolean a(java.lang.String[] strArr, java.lang.String str) {
        for (java.lang.String str2 : strArr) {
            if (str2 != null && kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str2, (java.lang.CharSequence) str, false, 2, (java.lang.Object) null)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.onevcat.uniwebview.InterfaceC1601y
    public final void a() {
    }

    @Override // com.onevcat.uniwebview.InterfaceC1601y
    public final void a(android.content.Intent intent) {
    }

    @Override // com.onevcat.uniwebview.InterfaceC1601y
    public final void b() {
        android.webkit.ValueCallback valueCallback;
        com.onevcat.uniwebview.C1598x c1598x = com.onevcat.uniwebview.InterfaceC1601y.f3771a;
        java.lang.String id = this.g;
        if (id == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("handlerId");
            id = null;
        }
        c1598x.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "id");
        com.onevcat.uniwebview.C1598x.b.remove(id);
        if (this.d || (valueCallback = this.b) == null) {
            return;
        }
        valueCallback.onReceiveValue(new android.net.Uri[0]);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a9  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void a(android.net.Uri uri, java.io.File file) throws java.lang.Throwable {
        java.io.InputStream inputStreamOpenInputStream;
        java.lang.Throwable th;
        java.io.FileOutputStream fileOutputStream;
        com.onevcat.uniwebview.C1560l c1560l = com.onevcat.uniwebview.C1560l.b;
        java.lang.String message = "copyInputStream uri: '" + uri + "' ToFile: " + file;
        c1560l.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        com.onevcat.uniwebview.EnumC1557k enumC1557k = com.onevcat.uniwebview.EnumC1557k.VERBOSE;
        c1560l.a(enumC1557k, message);
        com.onevcat.uniwebview.EnumC1557k enumC1557k2 = null;
        fileOutputStream = null;
        java.io.FileOutputStream fileOutputStream2 = null;
        try {
            try {
                android.content.Context context = this.h;
                if (context == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("context");
                    context = null;
                }
                inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
                try {
                    if (inputStreamOpenInputStream == 0) {
                        java.lang.String message2 = "Empty input stream with uri: " + uri + ". Aborting...";
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message2, "message");
                        c1560l.a(com.onevcat.uniwebview.EnumC1557k.CRITICAL, message2);
                        return;
                    }
                    fileOutputStream = new java.io.FileOutputStream(file);
                    try {
                        byte[] bArr = new byte[1024];
                        while (true) {
                            int i = inputStreamOpenInputStream.read(bArr);
                            if (i <= 0) {
                                fileOutputStream.close();
                                fileOutputStream.close();
                                inputStreamOpenInputStream.close();
                                return;
                            }
                            fileOutputStream.write(bArr, 0, i);
                        }
                    } catch (java.lang.Exception unused) {
                        fileOutputStream2 = fileOutputStream;
                        com.onevcat.uniwebview.C1560l c1560l2 = com.onevcat.uniwebview.C1560l.b;
                        c1560l2.getClass();
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("copyInputStreamToFile ", com.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE);
                        c1560l2.a(com.onevcat.uniwebview.EnumC1557k.CRITICAL, "copyInputStreamToFile ");
                        if (fileOutputStream2 != null) {
                            fileOutputStream2.close();
                        }
                        if (inputStreamOpenInputStream != 0) {
                            inputStreamOpenInputStream.close();
                        }
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        if (fileOutputStream != null) {
                            fileOutputStream.close();
                        }
                        if (inputStreamOpenInputStream != 0) {
                            inputStreamOpenInputStream.close();
                        }
                        throw th;
                    }
                } catch (java.lang.Exception unused2) {
                }
            } catch (java.lang.Throwable th3) {
                th = th3;
                enumC1557k2 = enumC1557k;
                inputStreamOpenInputStream = enumC1557k2;
                th = th;
                fileOutputStream = null;
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
                if (inputStreamOpenInputStream != 0) {
                    inputStreamOpenInputStream.close();
                }
                throw th;
            }
        } catch (java.lang.Exception unused3) {
            inputStreamOpenInputStream = 0;
        } catch (java.lang.Throwable th4) {
            th = th4;
            inputStreamOpenInputStream = enumC1557k2;
            th = th;
            fileOutputStream = null;
            if (fileOutputStream != null) {
                fileOutputStream.close();
            }
            if (inputStreamOpenInputStream != 0) {
                inputStreamOpenInputStream.close();
            }
            throw th;
        }
    }

    public final java.io.File a(int i) throws java.io.IOException {
        java.lang.String str;
        java.lang.String str2;
        int iA = com.onevcat.uniwebview.AbstractC1533c.a(i);
        if (iA == 1) {
            java.lang.String str3 = android.os.Environment.DIRECTORY_PICTURES;
            str = "image-";
            str2 = ".jpg";
        } else if (iA != 2) {
            str = "";
            str2 = "";
        } else {
            java.lang.String str4 = android.os.Environment.DIRECTORY_MOVIES;
            str = "video-";
            str2 = ".mp4";
        }
        android.content.Context context = this.h;
        if (context == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("context");
            context = null;
        }
        java.io.File externalFilesDir = context.getExternalFilesDir(android.os.Environment.DIRECTORY_PICTURES);
        com.onevcat.uniwebview.C1560l c1560l = com.onevcat.uniwebview.C1560l.b;
        java.lang.String message = com.onevcat.uniwebview.O.a("Trying to create file as: prefix: ", str, ", suffix: ", str2, c1560l);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        c1560l.a(com.onevcat.uniwebview.EnumC1557k.VERBOSE, message);
        java.io.File outputFile = java.io.File.createTempFile(str, str2, externalFilesDir);
        com.onevcat.uniwebview.C1560l c1560l2 = com.onevcat.uniwebview.C1560l.b;
        java.lang.String message2 = "Temp file created: " + outputFile;
        c1560l2.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message2, "message");
        c1560l2.a(com.onevcat.uniwebview.EnumC1557k.VERBOSE, message2);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(outputFile, "outputFile");
        return outputFile;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0014, code lost:
    
        if (r0.length() == 0) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static java.lang.String[] a(java.lang.String[] strArr) {
        java.lang.String str;
        if (strArr.length != 0) {
            if (strArr.length == 1 && (str = strArr[0]) != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(str);
            }
            java.util.ArrayList arrayList = new java.util.ArrayList(strArr.length);
            for (java.lang.String mimeTypeFromExtension : strArr) {
                if (mimeTypeFromExtension != null && new kotlin.text.Regex("\\.\\w+").matches(mimeTypeFromExtension)) {
                    mimeTypeFromExtension = android.webkit.MimeTypeMap.getSingleton().getMimeTypeFromExtension(kotlin.text.StringsKt.replace$default(mimeTypeFromExtension, ".", "", false, 4, (java.lang.Object) null));
                }
                arrayList.add(mimeTypeFromExtension);
            }
            java.lang.Object[] array = arrayList.toArray(new java.lang.String[0]);
            if (array != null) {
                return (java.lang.String[]) array;
            }
            throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        return new java.lang.String[]{"*/*"};
    }

    public final android.net.Uri a(java.io.File file) {
        android.content.Context context = this.h;
        android.content.Context context2 = null;
        if (context == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("context");
            context = null;
        }
        java.lang.String packageName = context.getPackageName();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(packageName, "context.packageName");
        android.content.Context context3 = this.h;
        if (context3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("context");
        } else {
            context2 = context3;
        }
        android.net.Uri uriForFile = androidx.core.content.FileProvider.getUriForFile(context2, packageName + ".uniwebview_fileprovider", file);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(uriForFile, "getUriForFile(context, \"…eprovider\", capturedFile)");
        return uriForFile;
    }

    /* JADX WARN: Code duplicated, block: B:126:0x0297 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:139:0x02c6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:14:0x0077  */
    /* JADX WARN: Code duplicated, block: B:20:0x0089  */
    /* JADX WARN: Code duplicated, block: B:46:0x011b  */
    /* JADX WARN: Code duplicated, block: B:74:0x0213  */
    /* JADX WARN: Code duplicated, block: B:89:0x0291 A[PHI: r3 r14 r18 r19 r20
  0x0291: PHI (r3v11 java.io.File) = (r3v10 java.io.File), (r3v23 java.io.File) binds: [B:88:0x028f, B:79:0x025f] A[DONT_GENERATE, DONT_INLINE]
  0x0291: PHI (r14v4 android.database.Cursor) = (r14v3 android.database.Cursor), (r14v8 android.database.Cursor) binds: [B:88:0x028f, B:79:0x025f] A[DONT_GENERATE, DONT_INLINE]
  0x0291: PHI (r18v7 boolean) = (r18v6 boolean), (r18v14 boolean) binds: [B:88:0x028f, B:79:0x025f] A[DONT_GENERATE, DONT_INLINE]
  0x0291: PHI (r19v7 boolean) = (r19v6 boolean), (r19v12 boolean) binds: [B:88:0x028f, B:79:0x025f] A[DONT_GENERATE, DONT_INLINE]
  0x0291: PHI (r20v3 android.webkit.ValueCallback) = (r20v2 android.webkit.ValueCallback), (r20v11 android.webkit.ValueCallback) binds: [B:88:0x028f, B:79:0x025f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:96:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:98:0x02c3  */
    @Override // com.onevcat.uniwebview.InterfaceC1601y
    public final void a(com.onevcat.uniwebview.UniWebViewProxyActivity activity, int i, int i2, android.content.Intent intent) throws java.lang.Throwable {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        android.net.Uri[] uriArr;
        android.webkit.ValueCallback valueCallback;
        android.net.Uri[] uriArr2;
        android.database.Cursor cursor;
        boolean z5;
        boolean z6;
        android.database.Cursor cursorQuery;
        java.io.File fileCreateTempFile;
        android.net.Uri uriFromFile;
        java.lang.String strJoinToString$default;
        android.net.Uri[] result;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        com.onevcat.uniwebview.C1560l c1560l = com.onevcat.uniwebview.C1560l.b;
        com.onevcat.uniwebview.C1560l c1560l2 = com.onevcat.uniwebview.C1560l.b;
        java.lang.String message = "handleResult. requestCode: " + i + ", resultCode: " + i2 + ", data: " + intent;
        c1560l2.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        com.onevcat.uniwebview.EnumC1557k enumC1557k = com.onevcat.uniwebview.EnumC1557k.VERBOSE;
        c1560l2.a(enumC1557k, message);
        if (i != 19238467) {
            return;
        }
        if (this.b == null) {
            c1560l2.getClass();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter("filePathCallback is null for some reason. Aborting...", com.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE);
            c1560l2.a(com.onevcat.uniwebview.EnumC1557k.CRITICAL, "filePathCallback is null for some reason. Aborting...");
            this.d = true;
            activity.finish();
            return;
        }
        java.io.File file = this.e;
        int i3 = 0;
        if (file != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(file);
            if (file.length() > 0) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        java.io.File file2 = this.f;
        if (file2 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(file2);
            if (file2.length() > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            z2 = false;
        }
        if (i2 == -1) {
            if (z) {
                c1560l2.getClass();
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter("imageTaken detected. Callback with output image uri.", com.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE);
                c1560l2.a(enumC1557k, "imageTaken detected. Callback with output image uri.");
                android.webkit.ValueCallback valueCallback2 = this.b;
                java.io.File file3 = this.e;
                kotlin.jvm.internal.Intrinsics.checkNotNull(file3);
                valueCallback2.onReceiveValue(new android.net.Uri[]{a(file3)});
            } else if (z2) {
                c1560l2.getClass();
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter("videoTaken detected. Callback with output video uri.", com.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE);
                c1560l2.a(enumC1557k, "videoTaken detected. Callback with output video uri.");
                android.webkit.ValueCallback valueCallback3 = this.b;
                java.io.File file4 = this.f;
                kotlin.jvm.internal.Intrinsics.checkNotNull(file4);
                valueCallback3.onReceiveValue(new android.net.Uri[]{a(file4)});
            } else {
                if (intent != null) {
                    android.content.ClipData clipData = intent.getClipData();
                    if (clipData != null) {
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        int itemCount = clipData.getItemCount();
                        for (int i4 = 0; i4 < itemCount; i4++) {
                            android.net.Uri item = clipData.getItemAt(i4).getUri();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(item, "item");
                            arrayList.add(item);
                        }
                        java.lang.Object[] array = arrayList.toArray(new android.net.Uri[0]);
                        if (array == null) {
                            throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                        }
                        result = (android.net.Uri[]) array;
                    } else if (intent.getData() == null || i2 != -1) {
                        uriArr = null;
                    } else {
                        result = android.webkit.WebChromeClient.FileChooserParams.parseResult(i2, intent);
                    }
                    uriArr = result;
                } else {
                    uriArr = null;
                }
                com.onevcat.uniwebview.C1560l c1560l3 = com.onevcat.uniwebview.C1560l.b;
                com.onevcat.uniwebview.C1560l c1560l4 = com.onevcat.uniwebview.C1560l.b;
                java.lang.String message2 = "File picking detected. externalUris: " + uriArr + ". Start processing...";
                c1560l4.getClass();
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message2, "message");
                c1560l4.a(com.onevcat.uniwebview.EnumC1557k.VERBOSE, message2);
                android.webkit.ValueCallback valueCallback4 = this.b;
                if (uriArr != null) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    int length = uriArr.length;
                    int i5 = 0;
                    while (i5 < length) {
                        android.net.Uri uri = uriArr[i5];
                        com.onevcat.uniwebview.C1560l c1560l5 = com.onevcat.uniwebview.C1560l.b;
                        java.lang.String message3 = "processStreamUri: " + uri;
                        c1560l5.getClass();
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message3, "message");
                        com.onevcat.uniwebview.EnumC1557k enumC1557k2 = com.onevcat.uniwebview.EnumC1557k.VERBOSE;
                        c1560l5.a(enumC1557k2, message3);
                        android.net.Uri[] uriArr3 = uriArr;
                        int i6 = length;
                        try {
                            android.content.Context context = this.h;
                            if (context == null) {
                                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("context");
                                context = null;
                            }
                            cursorQuery = context.getContentResolver().query(uri, null, null, null, null, null);
                            java.lang.String str = "tmp_file";
                            java.lang.String str2 = "";
                            if (cursorQuery != null) {
                                try {
                                    try {
                                        if (cursorQuery.moveToFirst()) {
                                            z5 = z2;
                                            try {
                                                java.lang.String fullFileName = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_display_name"));
                                                z6 = z;
                                                try {
                                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(fullFileName, "fullFileName");
                                                    java.util.List listSplit$default = kotlin.text.StringsKt.split$default((java.lang.CharSequence) fullFileName, new java.lang.String[]{"."}, false, 0, 6, (java.lang.Object) null);
                                                    valueCallback4 = valueCallback4;
                                                    if (listSplit$default.size() >= 2) {
                                                        try {
                                                            java.lang.String str3 = "." + ((java.lang.String) kotlin.collections.CollectionsKt.last(listSplit$default));
                                                            strJoinToString$default = kotlin.collections.CollectionsKt.joinToString$default(kotlin.collections.CollectionsKt.dropLast(listSplit$default, 1), ".", null, null, 0, null, null, 62, null);
                                                            str2 = str3;
                                                        } catch (java.lang.Exception unused) {
                                                            com.onevcat.uniwebview.C1560l c1560l6 = com.onevcat.uniwebview.C1560l.b;
                                                            java.lang.String message4 = "Error while createChoosingTempFileBasedOn uri: " + uri;
                                                            c1560l6.getClass();
                                                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message4, "message");
                                                            c1560l6.a(com.onevcat.uniwebview.EnumC1557k.CRITICAL, message4);
                                                            fileCreateTempFile = null;
                                                            if (cursorQuery != null) {
                                                                cursorQuery.close();
                                                            }
                                                        }
                                                    } else {
                                                        if (listSplit$default.size() == 1) {
                                                            strJoinToString$default = (java.lang.String) listSplit$default.get(0);
                                                        }
                                                        if (fileCreateTempFile == null) {
                                                            uriFromFile = null;
                                                        } else {
                                                            try {
                                                                a(uri, fileCreateTempFile);
                                                                uriFromFile = android.net.Uri.fromFile(fileCreateTempFile);
                                                            } catch (java.lang.Exception e) {
                                                                com.onevcat.uniwebview.C1560l c1560l7 = com.onevcat.uniwebview.C1560l.b;
                                                                java.lang.String message5 = "Error while processStreamUri. " + e.getMessage();
                                                                c1560l7.getClass();
                                                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message5, "message");
                                                                c1560l7.a(com.onevcat.uniwebview.EnumC1557k.CRITICAL, message5);
                                                                uriFromFile = null;
                                                            }
                                                        }
                                                        if (uriFromFile != null) {
                                                            arrayList2.add(uriFromFile);
                                                        }
                                                        i5++;
                                                        uriArr = uriArr3;
                                                        length = i6;
                                                        z2 = z5;
                                                        z = z6;
                                                        valueCallback4 = valueCallback4;
                                                        i3 = 0;
                                                    }
                                                    str = strJoinToString$default;
                                                } catch (java.lang.Exception unused2) {
                                                    valueCallback4 = valueCallback4;
                                                }
                                            } catch (java.lang.Exception unused3) {
                                                z6 = z;
                                                com.onevcat.uniwebview.C1560l c1560l8 = com.onevcat.uniwebview.C1560l.b;
                                                java.lang.String message6 = "Error while createChoosingTempFileBasedOn uri: " + uri;
                                                c1560l8.getClass();
                                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message6, "message");
                                                c1560l8.a(com.onevcat.uniwebview.EnumC1557k.CRITICAL, message6);
                                                fileCreateTempFile = null;
                                                if (cursorQuery != null) {
                                                    cursorQuery.close();
                                                }
                                                if (fileCreateTempFile == null) {
                                                    uriFromFile = null;
                                                } else {
                                                    a(uri, fileCreateTempFile);
                                                    uriFromFile = android.net.Uri.fromFile(fileCreateTempFile);
                                                }
                                                if (uriFromFile != null) {
                                                    arrayList2.add(uriFromFile);
                                                }
                                                i5++;
                                                uriArr = uriArr3;
                                                length = i6;
                                                z2 = z5;
                                                z = z6;
                                                valueCallback4 = valueCallback4;
                                                i3 = 0;
                                            }
                                        } else {
                                            valueCallback4 = valueCallback4;
                                            z5 = z2;
                                            z6 = z;
                                        }
                                    } catch (java.lang.Throwable th) {
                                        th = th;
                                        cursor = cursorQuery;
                                        if (cursor != null) {
                                            cursor.close();
                                        }
                                        throw th;
                                    }
                                } catch (java.lang.Exception unused4) {
                                    z5 = z2;
                                }
                            } else {
                                valueCallback4 = valueCallback4;
                                z5 = z2;
                                z6 = z;
                            }
                            java.lang.String str4 = str;
                            java.lang.String str5 = str2;
                            java.lang.String message7 = "Creating temp file with name " + str4 + '.' + str5;
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message7, "message");
                            c1560l5.a(enumC1557k2, message7);
                            android.content.Context context2 = this.h;
                            if (context2 == null) {
                                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("context");
                                context2 = null;
                            }
                            fileCreateTempFile = java.io.File.createTempFile(str4, str5, context2.getExternalFilesDir(android.os.Environment.DIRECTORY_PICTURES));
                            java.lang.String message8 = "File created: " + fileCreateTempFile;
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message8, "message");
                            c1560l5.a(enumC1557k2, message8);
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                        } catch (java.lang.Exception unused5) {
                            valueCallback4 = valueCallback4;
                            z5 = z2;
                            z6 = z;
                            cursorQuery = null;
                        } catch (java.lang.Throwable th2) {
                            th = th2;
                            cursor = null;
                        }
                        if (fileCreateTempFile == null) {
                            uriFromFile = null;
                        } else {
                            a(uri, fileCreateTempFile);
                            uriFromFile = android.net.Uri.fromFile(fileCreateTempFile);
                        }
                        if (uriFromFile != null) {
                            arrayList2.add(uriFromFile);
                        }
                        i5++;
                        uriArr = uriArr3;
                        length = i6;
                        z2 = z5;
                        z = z6;
                        valueCallback4 = valueCallback4;
                        i3 = 0;
                    }
                    android.webkit.ValueCallback valueCallback5 = valueCallback4;
                    z3 = z2;
                    z4 = z;
                    java.lang.Object[] array2 = arrayList2.toArray(new android.net.Uri[i3]);
                    if (array2 == null) {
                        throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                    }
                    uriArr2 = (android.net.Uri[]) array2;
                    valueCallback = valueCallback5;
                } else {
                    z3 = z2;
                    z4 = z;
                    valueCallback = valueCallback4;
                    uriArr2 = null;
                }
                valueCallback.onReceiveValue(uriArr2);
            }
            z3 = z2;
            z4 = z;
        } else {
            z3 = z2;
            z4 = z;
            this.b.onReceiveValue(null);
        }
        java.io.File file5 = this.e;
        if (file5 != null && !z4) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(file5);
            file5.delete();
        }
        java.io.File file6 = this.f;
        if (file6 != null && !z3) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(file6);
            file6.delete();
        }
        this.e = null;
        this.f = null;
        this.d = true;
        activity.finish();
    }

    /* JADX WARN: Code duplicated, block: B:48:0x013e  */
    @Override // com.onevcat.uniwebview.InterfaceC1601y
    public final void a(com.onevcat.uniwebview.UniWebViewProxyActivity activity) {
        java.lang.Exception e;
        android.content.Intent intent;
        java.lang.Exception e2;
        android.content.Intent intent2;
        boolean z;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        com.onevcat.uniwebview.C1560l c1560l = com.onevcat.uniwebview.C1560l.b;
        c1560l.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("Starting File Chooser...", com.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE);
        com.onevcat.uniwebview.EnumC1557k enumC1557k = com.onevcat.uniwebview.EnumC1557k.VERBOSE;
        c1560l.a(enumC1557k, "Starting File Chooser...");
        android.webkit.WebChromeClient.FileChooserParams fileChooserParams = this.c;
        android.content.Intent intent3 = null;
        java.lang.String[] acceptTypes = fileChooserParams != null ? fileChooserParams.getAcceptTypes() : null;
        if (acceptTypes == null) {
            acceptTypes = new java.lang.String[0];
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Accept types from file chooser params: ");
        android.webkit.WebChromeClient.FileChooserParams fileChooserParams2 = this.c;
        java.lang.String message = sb.append(fileChooserParams2 != null ? fileChooserParams2.getAcceptTypes() : null).toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        c1560l.a(enumC1557k, message);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.String[] strArrA = a(acceptTypes);
        if (a(strArrA, "*/*") || a(strArrA, "image")) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter("params contains image. Adding photo intent.", com.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE);
            c1560l.a(enumC1557k, "params contains image. Adding photo intent.");
            try {
                java.io.File fileA = a(2);
                android.net.Uri uriA = a(fileA);
                java.lang.String message2 = "Output image uri: " + uriA;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message2, "message");
                c1560l.a(enumC1557k, message2);
                this.e = fileA;
                intent = new android.content.Intent("android.media.action.IMAGE_CAPTURE");
                try {
                    intent.putExtra(org.jacoco.core.runtime.AgentOptions.OUTPUT, uriA);
                } catch (java.lang.Exception e3) {
                    e = e3;
                    com.onevcat.uniwebview.C1560l c1560l2 = com.onevcat.uniwebview.C1560l.b;
                    java.lang.String message3 = "getPhotoIntent errored (IOException). Cannot create the temp file. " + e;
                    c1560l2.getClass();
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message3, "message");
                    c1560l2.a(com.onevcat.uniwebview.EnumC1557k.CRITICAL, message3);
                    e.printStackTrace();
                }
            } catch (java.lang.Exception e4) {
                e = e4;
                intent = null;
            }
            if (intent != null) {
                arrayList.add(intent);
            }
        }
        java.lang.String[] strArrA2 = a(acceptTypes);
        if (a(strArrA2, "*/*") || a(strArrA2, "video")) {
            com.onevcat.uniwebview.C1560l c1560l3 = com.onevcat.uniwebview.C1560l.b;
            c1560l3.getClass();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter("params contains video. Adding video intent.", com.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE);
            com.onevcat.uniwebview.EnumC1557k enumC1557k2 = com.onevcat.uniwebview.EnumC1557k.VERBOSE;
            c1560l3.a(enumC1557k2, "params contains video. Adding video intent.");
            try {
                java.io.File fileA2 = a(3);
                android.net.Uri uriA2 = a(fileA2);
                java.lang.String message4 = "Output video uri: " + uriA2;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message4, "message");
                c1560l3.a(enumC1557k2, message4);
                this.f = fileA2;
                intent2 = new android.content.Intent("android.media.action.VIDEO_CAPTURE");
                try {
                    intent2.putExtra(org.jacoco.core.runtime.AgentOptions.OUTPUT, uriA2);
                } catch (java.lang.Exception e5) {
                    e2 = e5;
                    intent3 = intent2;
                    com.onevcat.uniwebview.C1560l c1560l4 = com.onevcat.uniwebview.C1560l.b;
                    java.lang.String message5 = "getVideoIntent errored (IOException). Cannot create the temp file. " + e2;
                    c1560l4.getClass();
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message5, "message");
                    c1560l4.a(com.onevcat.uniwebview.EnumC1557k.CRITICAL, message5);
                    e2.printStackTrace();
                    intent2 = intent3;
                }
            } catch (java.lang.Exception e6) {
                e2 = e6;
            }
            if (intent2 != null) {
                arrayList.add(intent2);
            }
        }
        android.webkit.WebChromeClient.FileChooserParams fileChooserParams3 = this.c;
        if (fileChooserParams3 != null) {
            z = fileChooserParams3.getMode() == 1;
        }
        android.content.Intent intent4 = new android.content.Intent("android.intent.action.GET_CONTENT");
        intent4.addCategory("android.intent.category.OPENABLE");
        intent4.setType("*/*");
        intent4.putExtra("android.intent.extra.MIME_TYPES", a(acceptTypes));
        intent4.putExtra("android.intent.extra.ALLOW_MULTIPLE", z);
        android.content.Intent intent5 = new android.content.Intent("android.intent.action.CHOOSER");
        intent5.putExtra("android.intent.extra.TITLE", activity.getResources().getString(com.onevcat.uniwebview.R.string.CHOOSE_IMAGE));
        intent5.putExtra("android.intent.extra.INTENT", intent4);
        intent5.putExtra("android.intent.extra.INITIAL_INTENTS", (android.os.Parcelable[]) arrayList.toArray(new android.os.Parcelable[0]));
        activity.startActivityForResult(intent5, 19238467);
    }
}
