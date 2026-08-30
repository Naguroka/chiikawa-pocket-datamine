package com.bytedance.adsdk.IL;

/* JADX INFO: loaded from: classes3.dex */
public class Kg {
    private static final java.util.Map<java.lang.String, com.bytedance.adsdk.IL.Ta<com.bytedance.adsdk.IL.iR>> bg = new java.util.HashMap();
    private static final java.util.Set<java.lang.Object> IL = new java.util.HashSet();
    private static final byte[] bX = {80, 75, 3, 4};

    public static com.bytedance.adsdk.IL.Ta<com.bytedance.adsdk.IL.iR> bg(android.content.Context context, java.lang.String str) {
        return bg(context, str, "url_".concat(java.lang.String.valueOf(str)));
    }

    public static com.bytedance.adsdk.IL.Ta<com.bytedance.adsdk.IL.iR> bg(final android.content.Context context, final java.lang.String str, final java.lang.String str2) {
        return bg(str2, new java.util.concurrent.Callable<com.bytedance.adsdk.IL.PX<com.bytedance.adsdk.IL.iR>>() { // from class: com.bytedance.adsdk.IL.Kg.1
            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: bg, reason: merged with bridge method [inline-methods] */
            public com.bytedance.adsdk.IL.PX<com.bytedance.adsdk.IL.iR> call() throws java.lang.Exception {
                com.bytedance.adsdk.IL.PX<com.bytedance.adsdk.IL.iR> pxBg = com.bytedance.adsdk.IL.zx.bg(context).bg(context, str, str2);
                if (str2 != null && pxBg.bg() != null) {
                    com.bytedance.adsdk.IL.bX.zx.bg().bg(str2, pxBg.bg());
                }
                return pxBg;
            }
        });
    }

    public static com.bytedance.adsdk.IL.Ta<com.bytedance.adsdk.IL.iR> IL(android.content.Context context, java.lang.String str) {
        return IL(context, str, "asset_".concat(java.lang.String.valueOf(str)));
    }

    public static com.bytedance.adsdk.IL.Ta<com.bytedance.adsdk.IL.iR> IL(android.content.Context context, final java.lang.String str, final java.lang.String str2) {
        final android.content.Context applicationContext = context.getApplicationContext();
        return bg(str2, new java.util.concurrent.Callable<com.bytedance.adsdk.IL.PX<com.bytedance.adsdk.IL.iR>>() { // from class: com.bytedance.adsdk.IL.Kg.4
            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: bg, reason: merged with bridge method [inline-methods] */
            public com.bytedance.adsdk.IL.PX<com.bytedance.adsdk.IL.iR> call() throws java.lang.Exception {
                return com.bytedance.adsdk.IL.Kg.bX(applicationContext, str, str2);
            }
        });
    }

    public static com.bytedance.adsdk.IL.PX<com.bytedance.adsdk.IL.iR> bX(android.content.Context context, java.lang.String str) {
        return bX(context, str, "asset_".concat(java.lang.String.valueOf(str)));
    }

    public static com.bytedance.adsdk.IL.PX<com.bytedance.adsdk.IL.iR> bX(android.content.Context context, java.lang.String str, java.lang.String str2) {
        try {
            if (!str.endsWith(".zip") && !str.endsWith(".lottie")) {
                return IL(context.getAssets().open(str), str2);
            }
            return bg(context, new java.util.zip.ZipInputStream(context.getAssets().open(str)), str2);
        } catch (java.io.IOException e) {
            return new com.bytedance.adsdk.IL.PX<>((java.lang.Throwable) e);
        }
    }

    public static com.bytedance.adsdk.IL.Ta<com.bytedance.adsdk.IL.iR> bg(android.content.Context context, int i) {
        return bg(context, i, bX(context, i));
    }

    public static com.bytedance.adsdk.IL.Ta<com.bytedance.adsdk.IL.iR> bg(android.content.Context context, final int i, final java.lang.String str) {
        final java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(context);
        final android.content.Context applicationContext = context.getApplicationContext();
        return bg(str, new java.util.concurrent.Callable<com.bytedance.adsdk.IL.PX<com.bytedance.adsdk.IL.iR>>() { // from class: com.bytedance.adsdk.IL.Kg.5
            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: bg, reason: merged with bridge method [inline-methods] */
            public com.bytedance.adsdk.IL.PX<com.bytedance.adsdk.IL.iR> call() throws java.lang.Exception {
                android.content.Context context2 = (android.content.Context) weakReference.get();
                if (context2 == null) {
                    context2 = applicationContext;
                }
                return com.bytedance.adsdk.IL.Kg.IL(context2, i, str);
            }
        });
    }

    public static com.bytedance.adsdk.IL.PX<com.bytedance.adsdk.IL.iR> IL(android.content.Context context, int i) {
        return IL(context, i, bX(context, i));
    }

    public static com.bytedance.adsdk.IL.PX<com.bytedance.adsdk.IL.iR> IL(android.content.Context context, int i, java.lang.String str) {
        try {
            return IL(context.getResources().openRawResource(i), bX(context, i));
        } catch (android.content.res.Resources.NotFoundException e) {
            return new com.bytedance.adsdk.IL.PX<>((java.lang.Throwable) e);
        }
    }

    private static java.lang.String bX(android.content.Context context, int i) {
        return "rawRes" + (bg(context) ? "_night_" : "_day_") + i;
    }

    private static boolean bg(android.content.Context context) {
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }

    public static com.bytedance.adsdk.IL.Ta<com.bytedance.adsdk.IL.iR> bg(final java.io.InputStream inputStream, final java.lang.String str) {
        return bg(str, new java.util.concurrent.Callable<com.bytedance.adsdk.IL.PX<com.bytedance.adsdk.IL.iR>>() { // from class: com.bytedance.adsdk.IL.Kg.6
            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: bg, reason: merged with bridge method [inline-methods] */
            public com.bytedance.adsdk.IL.PX<com.bytedance.adsdk.IL.iR> call() throws java.lang.Exception {
                return com.bytedance.adsdk.IL.Kg.IL(inputStream, str);
            }
        });
    }

    public static com.bytedance.adsdk.IL.PX<com.bytedance.adsdk.IL.iR> IL(java.io.InputStream inputStream, java.lang.String str) {
        return bg(inputStream, str, true);
    }

    private static com.bytedance.adsdk.IL.PX<com.bytedance.adsdk.IL.iR> bg(java.io.InputStream inputStream, java.lang.String str, boolean z) {
        try {
            return bg(new android.util.JsonReader(new java.io.InputStreamReader(inputStream)), str);
        } finally {
            if (z) {
                com.bytedance.adsdk.IL.ldr.ldr.bg(inputStream);
            }
        }
    }

    public static com.bytedance.adsdk.IL.PX<com.bytedance.adsdk.IL.iR> bg(android.util.JsonReader jsonReader, java.lang.String str) {
        return bg(jsonReader, str, true);
    }

    private static com.bytedance.adsdk.IL.PX<com.bytedance.adsdk.IL.iR> bg(android.util.JsonReader jsonReader, java.lang.String str, boolean z) {
        try {
            com.bytedance.adsdk.IL.iR iRVarBg = com.bytedance.adsdk.IL.zx.kMt.bg(jsonReader);
            com.bytedance.adsdk.IL.bX.zx.bg().bg(str, iRVarBg);
            return new com.bytedance.adsdk.IL.PX<>(iRVarBg);
        } catch (java.lang.Exception e) {
            return new com.bytedance.adsdk.IL.PX<>((java.lang.Throwable) e);
        } finally {
            if (z) {
                bg(jsonReader);
            }
        }
    }

    public static void bg(java.io.Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (java.lang.RuntimeException e) {
                throw e;
            } catch (java.lang.Exception unused) {
            }
        }
    }

    public static com.bytedance.adsdk.IL.PX<com.bytedance.adsdk.IL.iR> bg(android.content.Context context, java.util.zip.ZipInputStream zipInputStream, java.lang.String str) {
        try {
            return IL(context, zipInputStream, str);
        } finally {
            com.bytedance.adsdk.IL.ldr.ldr.bg(zipInputStream);
        }
    }

    /* JADX WARN: Code duplicated, block: B:55:0x0107 A[Catch: IOException -> 0x0287, TryCatch #0 {IOException -> 0x0287, blocks: (B:3:0x000a, B:6:0x0014, B:8:0x0020, B:61:0x0137, B:9:0x0025, B:11:0x0031, B:12:0x0036, B:14:0x0042, B:15:0x0059, B:18:0x0065, B:20:0x006d, B:22:0x0075, B:25:0x007f, B:27:0x0087, B:30:0x0090, B:31:0x0095, B:33:0x009b, B:34:0x00a4, B:53:0x00fd, B:55:0x0107, B:56:0x0115, B:52:0x00e9, B:57:0x0119, B:59:0x011f, B:60:0x0128, B:35:0x00c2, B:42:0x00d9, B:51:0x00e8, B:50:0x00e5), top: B:113:0x000a, inners: #3 }] */
    private static com.bytedance.adsdk.IL.PX<com.bytedance.adsdk.IL.iR> IL(android.content.Context context, java.util.zip.ZipInputStream zipInputStream, java.lang.String str) {
        java.util.HashMap map = new java.util.HashMap();
        java.util.HashMap map2 = new java.util.HashMap();
        try {
            java.util.zip.ZipEntry nextEntry = zipInputStream.getNextEntry();
            com.bytedance.adsdk.IL.iR iRVarBg = null;
            while (nextEntry != null) {
                java.lang.String name = nextEntry.getName();
                if (name.contains("__MACOSX")) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().equalsIgnoreCase("manifest.json")) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().endsWith(".json")) {
                    iRVarBg = bg(new android.util.JsonReader(new java.io.InputStreamReader(zipInputStream)), (java.lang.String) null, false).bg();
                } else if (name.endsWith(".png") || name.endsWith(".webp") || name.endsWith(".jpg") || name.endsWith(".jpeg")) {
                    if (name.contains("../")) {
                        zipInputStream.closeEntry();
                        nextEntry = zipInputStream.getNextEntry();
                    } else {
                        java.lang.String[] strArrSplit = name.split("/");
                        map.put(strArrSplit[strArrSplit.length - 1], android.graphics.BitmapFactory.decodeStream(zipInputStream));
                    }
                } else if (name.endsWith(".ttf") || name.endsWith(".otf")) {
                    if (name.contains("../")) {
                        zipInputStream.closeEntry();
                        nextEntry = zipInputStream.getNextEntry();
                    } else {
                        java.lang.String[] strArrSplit2 = name.split("/");
                        java.lang.String str2 = strArrSplit2[strArrSplit2.length - 1];
                        java.lang.String str3 = str2.split("\\.")[0];
                        java.io.File file = new java.io.File(context.getCacheDir(), str2);
                        new java.io.FileOutputStream(file);
                        try {
                            java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(file);
                            try {
                                byte[] bArr = new byte[4096];
                                while (true) {
                                    int i = zipInputStream.read(bArr);
                                    if (i == -1) {
                                        break;
                                    }
                                    fileOutputStream.write(bArr, 0, i);
                                }
                                fileOutputStream.flush();
                                fileOutputStream.close();
                            } catch (java.lang.Throwable th) {
                                try {
                                    throw th;
                                } catch (java.lang.Throwable th2) {
                                    try {
                                        fileOutputStream.close();
                                    } catch (java.lang.Throwable th3) {
                                        th.addSuppressed(th3);
                                    }
                                    throw th2;
                                }
                            }
                        } catch (java.lang.Throwable unused) {
                            new java.lang.StringBuilder("Unable to save font ").append(str3).append(" to the temporary file: ").append(str2);
                            android.graphics.Typeface typefaceCreateFromFile = android.graphics.Typeface.createFromFile(file);
                            if (!file.delete()) {
                                new java.lang.StringBuilder("Failed to delete temp font file ").append(file.getAbsolutePath());
                            }
                            map2.put(str3, typefaceCreateFromFile);
                            nextEntry = zipInputStream.getNextEntry();
                        }
                        android.graphics.Typeface typefaceCreateFromFile2 = android.graphics.Typeface.createFromFile(file);
                        if (!file.delete()) {
                            new java.lang.StringBuilder("Failed to delete temp font file ").append(file.getAbsolutePath());
                        }
                        map2.put(str3, typefaceCreateFromFile2);
                    }
                } else {
                    zipInputStream.closeEntry();
                }
                nextEntry = zipInputStream.getNextEntry();
            }
            if (iRVarBg == null) {
                return new com.bytedance.adsdk.IL.PX<>((java.lang.Throwable) new java.lang.IllegalArgumentException("Unable to parse composition"));
            }
            for (java.util.Map.Entry entry : map.entrySet()) {
                com.bytedance.adsdk.IL.eo eoVarBg = bg(iRVarBg, (java.lang.String) entry.getKey());
                if (eoVarBg != null) {
                    eoVarBg.bg(com.bytedance.adsdk.IL.ldr.ldr.bg((android.graphics.Bitmap) entry.getValue(), eoVarBg.bg(), eoVarBg.IL()));
                }
            }
            for (java.util.Map.Entry entry2 : map2.entrySet()) {
                boolean z = false;
                for (com.bytedance.adsdk.IL.bX.bX bXVar : iRVarBg.Lq().values()) {
                    if (bXVar.bg().equals(entry2.getKey())) {
                        bXVar.bg((android.graphics.Typeface) entry2.getValue());
                        z = true;
                    }
                }
                if (!z) {
                }
            }
            if (map.isEmpty()) {
                java.util.Iterator<java.util.Map.Entry<java.lang.String, com.bytedance.adsdk.IL.eo>> it = iRVarBg.vb().entrySet().iterator();
                while (it.hasNext()) {
                    com.bytedance.adsdk.IL.eo value = it.next().getValue();
                    if (value == null) {
                        return null;
                    }
                    java.lang.String strKg = value.Kg();
                    android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
                    options.inScaled = true;
                    options.inDensity = org.objectweb.asm.Opcodes.IF_ICMPNE;
                    if (strKg.startsWith("data:") && strKg.indexOf("base64,") > 0) {
                        try {
                            byte[] bArrDecode = android.util.Base64.decode(strKg.substring(strKg.indexOf(44) + 1), 0);
                            value.bg(android.graphics.BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options));
                        } catch (java.lang.IllegalArgumentException unused2) {
                            return null;
                        }
                    }
                }
            }
            for (java.util.Map.Entry<java.lang.String, com.bytedance.adsdk.IL.eo> entry3 : iRVarBg.vb().entrySet()) {
                if (entry3.getValue().eo() == null) {
                    return new com.bytedance.adsdk.IL.PX<>((java.lang.Throwable) new java.lang.IllegalStateException("There is no image for " + entry3.getValue().Kg()));
                }
            }
            if (str != null) {
                com.bytedance.adsdk.IL.bX.zx.bg().bg(str, iRVarBg);
            }
            return new com.bytedance.adsdk.IL.PX<>(iRVarBg);
        } catch (java.io.IOException e) {
            return new com.bytedance.adsdk.IL.PX<>((java.lang.Throwable) e);
        }
    }

    private static com.bytedance.adsdk.IL.eo bg(com.bytedance.adsdk.IL.iR iRVar, java.lang.String str) {
        for (com.bytedance.adsdk.IL.eo eoVar : iRVar.vb().values()) {
            if (eoVar.Kg().equals(str)) {
                return eoVar;
            }
        }
        return null;
    }

    private static com.bytedance.adsdk.IL.Ta<com.bytedance.adsdk.IL.iR> bg(final java.lang.String str, java.util.concurrent.Callable<com.bytedance.adsdk.IL.PX<com.bytedance.adsdk.IL.iR>> callable) {
        final com.bytedance.adsdk.IL.iR iRVarBg = str == null ? null : com.bytedance.adsdk.IL.bX.zx.bg().bg(str);
        if (iRVarBg != null) {
            return new com.bytedance.adsdk.IL.Ta<>(new java.util.concurrent.Callable<com.bytedance.adsdk.IL.PX<com.bytedance.adsdk.IL.iR>>() { // from class: com.bytedance.adsdk.IL.Kg.7
                @Override // java.util.concurrent.Callable
                /* JADX INFO: renamed from: bg, reason: merged with bridge method [inline-methods] */
                public com.bytedance.adsdk.IL.PX<com.bytedance.adsdk.IL.iR> call() throws java.lang.Exception {
                    return new com.bytedance.adsdk.IL.PX<>(iRVarBg);
                }
            });
        }
        if (str != null) {
            java.util.Map<java.lang.String, com.bytedance.adsdk.IL.Ta<com.bytedance.adsdk.IL.iR>> map = bg;
            if (map.containsKey(str)) {
                return map.get(str);
            }
        }
        com.bytedance.adsdk.IL.Ta<com.bytedance.adsdk.IL.iR> ta = new com.bytedance.adsdk.IL.Ta<>(callable);
        if (str != null) {
            final java.util.concurrent.atomic.AtomicBoolean atomicBoolean = new java.util.concurrent.atomic.AtomicBoolean(false);
            ta.bg(new com.bytedance.adsdk.IL.VB<com.bytedance.adsdk.IL.iR>() { // from class: com.bytedance.adsdk.IL.Kg.2
                @Override // com.bytedance.adsdk.IL.VB
                public void bg(com.bytedance.adsdk.IL.iR iRVar) {
                    com.bytedance.adsdk.IL.Kg.bg.remove(str);
                    atomicBoolean.set(true);
                    if (com.bytedance.adsdk.IL.Kg.bg.size() == 0) {
                        com.bytedance.adsdk.IL.Kg.IL(true);
                    }
                }
            });
            ta.bX(new com.bytedance.adsdk.IL.VB<java.lang.Throwable>() { // from class: com.bytedance.adsdk.IL.Kg.3
                @Override // com.bytedance.adsdk.IL.VB
                public void bg(java.lang.Throwable th) {
                    com.bytedance.adsdk.IL.Kg.bg.remove(str);
                    atomicBoolean.set(true);
                    if (com.bytedance.adsdk.IL.Kg.bg.size() == 0) {
                        com.bytedance.adsdk.IL.Kg.IL(true);
                    }
                }
            });
            if (!atomicBoolean.get()) {
                java.util.Map<java.lang.String, com.bytedance.adsdk.IL.Ta<com.bytedance.adsdk.IL.iR>> map2 = bg;
                map2.put(str, ta);
                if (map2.size() == 1) {
                    IL(false);
                }
            }
        }
        return ta;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void IL(boolean z) {
        java.util.ArrayList arrayList = new java.util.ArrayList(IL);
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList.get(i);
        }
    }
}
