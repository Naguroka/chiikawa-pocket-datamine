package com.amoad;

/* JADX INFO: loaded from: classes3.dex */
final class y {
    private static final android.graphics.Bitmap.CompressFormat c = android.graphics.Bitmap.CompressFormat.JPEG;
    private static com.amoad.y f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    com.amoad.z f349a;
    final java.lang.Object b;
    private com.amoad.y.a d;
    private boolean e;

    static class a {
        public java.io.File b;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f350a = 10485760;
        public android.graphics.Bitmap.CompressFormat c = com.amoad.y.c;
        public int d = 70;
        public boolean e = false;
        public boolean f = true;
        public boolean g = true;

        a(android.content.Context context, java.lang.String str) {
            this.b = com.amoad.y.a(context, str);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001f, code lost:
    
        if (r1 != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private y(android.content.Context context, com.amoad.y.a aVar) {
        java.lang.Object obj = new java.lang.Object();
        this.b = obj;
        boolean z = true;
        this.e = true;
        this.d = aVar;
        if (aVar.g) {
            synchronized (obj) {
                com.amoad.z zVar = this.f349a;
                if (zVar != null) {
                    if (zVar.f351a != null) {
                        z = false;
                    }
                }
                java.io.File file = this.d.b;
                if (this.d.f && file != null) {
                    if (!file.exists()) {
                        file.mkdirs();
                    }
                    if (file.getUsableSpace() > this.d.f350a) {
                        try {
                            this.f349a = com.amoad.z.a(file, this.d.f350a);
                            com.amoad.AMoAdLogger.getInstance().d("Disk cache initialized");
                        } catch (java.io.IOException e) {
                            this.d.b = null;
                            com.amoad.AMoAdLogger.getInstance().e("initDiskCache - ".concat(java.lang.String.valueOf(e)));
                        }
                    }
                }
                this.e = false;
                this.b.notifyAll();
            }
        }
        java.io.File file2 = new java.io.File(context.getCacheDir(), "com.amoad.videoad");
        if (file2.exists()) {
            file2.delete();
        }
    }

    private static int a(android.graphics.BitmapFactory.Options options) {
        int i = options.outHeight;
        int i2 = options.outWidth;
        int i3 = 1;
        if (i > Integer.MAX_VALUE || i2 > Integer.MAX_VALUE) {
            int i4 = i / 2;
            int i5 = i2 / 2;
            while (i4 / i3 > Integer.MAX_VALUE && i5 / i3 > Integer.MAX_VALUE) {
                i3 *= 2;
            }
            for (long j = (i2 * i) / i3; j > 2; j /= 2) {
                i3 *= 2;
            }
        }
        return i3;
    }

    static com.amoad.y a(android.content.Context context) {
        if (f == null) {
            f = new com.amoad.y(context, new com.amoad.y.a(context, "com_amoad_native_images"));
        }
        return f;
    }

    static java.io.File a(android.content.Context context, java.lang.String str) {
        return new java.io.File(context.getCacheDir().getPath() + java.io.File.separator + str);
    }

    static java.lang.String c(java.lang.String str) {
        try {
            java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes());
            byte[] bArrDigest = messageDigest.digest();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            for (byte b : bArrDigest) {
                java.lang.String hexString = java.lang.Integer.toHexString(b & 255);
                if (hexString.length() == 1) {
                    sb.append('0');
                }
                sb.append(hexString);
            }
            return sb.toString();
        } catch (java.security.NoSuchAlgorithmException unused) {
            return java.lang.String.valueOf(str.hashCode());
        }
    }

    final android.media.MediaPlayer a(java.lang.String str, byte[] bArr) {
        java.io.OutputStream outputStreamB;
        if (str == null || bArr == null) {
            return null;
        }
        synchronized (this.b) {
            if (this.f349a != null) {
                java.lang.String strC = c(str);
                try {
                    com.amoad.z.c cVarA = this.f349a.a(strC);
                    if (cVarA == null) {
                        com.amoad.z.a aVarB = this.f349a.b(strC);
                        if (aVarB != null) {
                            outputStreamB = aVarB.b();
                            try {
                                outputStreamB.write(bArr);
                                aVarB.c();
                                outputStreamB.close();
                                android.media.MediaPlayer mediaPlayerB = b(str);
                                try {
                                    outputStreamB.close();
                                } catch (java.io.IOException unused) {
                                }
                                return mediaPlayerB;
                            } catch (java.lang.Throwable th) {
                                th = th;
                                try {
                                    com.amoad.AMoAdLogger.getInstance().e("addVideoToCache - ".concat(java.lang.String.valueOf(th)));
                                    if (outputStreamB != null) {
                                        try {
                                            outputStreamB.close();
                                        } catch (java.io.IOException unused2) {
                                        }
                                    }
                                    return null;
                                } catch (java.lang.Throwable th2) {
                                    if (outputStreamB != null) {
                                        try {
                                            outputStreamB.close();
                                        } catch (java.io.IOException unused3) {
                                        }
                                    }
                                    throw th2;
                                }
                            }
                        }
                    } else {
                        cVarA.c[0].close();
                    }
                } catch (java.lang.Throwable th3) {
                    th = th3;
                    outputStreamB = null;
                }
            }
            return null;
        }
    }

    final com.amoad.d a(java.lang.String str) {
        com.amoad.d dVar;
        java.io.InputStream inputStreamA;
        com.amoad.d dVar2;
        android.graphics.Bitmap bitmapDecodeFileDescriptor;
        com.amoad.ac acVar;
        java.lang.String strC = c(str);
        synchronized (this.b) {
            while (this.e) {
                try {
                    try {
                        this.b.wait();
                    } catch (java.lang.InterruptedException unused) {
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
            com.amoad.z zVar = this.f349a;
            dVar = null;
            java.io.InputStream inputStream = null;
            dVar = null;
            dVar = null;
            dVar = null;
            if (zVar != null) {
                try {
                    com.amoad.z.c cVarA = zVar.a(strC);
                    if (cVarA != null) {
                        com.amoad.AMoAdLogger.getInstance().d("Disk cache hit");
                        com.amoad.z.a aVarA = com.amoad.z.this.a(cVarA.f356a, cVarA.b);
                        inputStreamA = aVarA.a();
                        if (inputStreamA != null) {
                            try {
                                boolean zA = com.amoad.ac.a(inputStreamA);
                                inputStreamA = aVarA.a();
                                if (zA) {
                                    acVar = new com.amoad.ac(inputStreamA);
                                    bitmapDecodeFileDescriptor = null;
                                } else {
                                    java.io.FileDescriptor fd = ((java.io.FileInputStream) inputStreamA).getFD();
                                    android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
                                    options.inJustDecodeBounds = true;
                                    android.graphics.BitmapFactory.decodeFileDescriptor(fd, null, options);
                                    options.inSampleSize = a(options);
                                    options.inJustDecodeBounds = false;
                                    bitmapDecodeFileDescriptor = android.graphics.BitmapFactory.decodeFileDescriptor(fd, null, options);
                                    acVar = null;
                                }
                                dVar2 = new com.amoad.d(bitmapDecodeFileDescriptor, acVar);
                            } catch (java.lang.Throwable th2) {
                                th = th2;
                                try {
                                    com.amoad.AMoAdLogger.getInstance().e("getImageFromDiskCache - ".concat(java.lang.String.valueOf(th)));
                                    if (inputStreamA != null) {
                                        try {
                                            inputStreamA.close();
                                        } catch (java.io.IOException unused2) {
                                        }
                                    }
                                } catch (java.lang.Throwable th3) {
                                    if (inputStreamA != null) {
                                        try {
                                            inputStreamA.close();
                                        } catch (java.io.IOException unused3) {
                                        }
                                    }
                                    throw th3;
                                }
                            }
                        } else {
                            dVar2 = null;
                        }
                        inputStream = inputStreamA;
                    } else {
                        dVar2 = null;
                    }
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (java.io.IOException unused4) {
                        }
                    }
                    dVar = dVar2;
                } catch (java.lang.Throwable th4) {
                    th = th4;
                    inputStreamA = null;
                }
            }
        }
        return dVar;
    }

    /* JADX WARN: Code duplicated, block: B:54:0x004d A[EXC_TOP_SPLITTER, PHI: r2 r6
  0x004d: PHI (r2v3 android.media.MediaPlayer) = (r2v1 android.media.MediaPlayer), (r2v0 android.media.MediaPlayer) binds: [B:35:0x006c, B:26:0x004b] A[DONT_GENERATE, DONT_INLINE]
  0x004d: PHI (r6v5 java.io.InputStream) = (r6v4 java.io.InputStream), (r6v8 java.io.InputStream) binds: [B:35:0x006c, B:26:0x004b] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    final android.media.MediaPlayer b(java.lang.String str) {
        java.io.InputStream inputStream;
        android.media.MediaPlayer mediaPlayer;
        java.lang.String strC = c(str);
        synchronized (this.b) {
            while (this.e) {
                try {
                    this.b.wait();
                } catch (java.lang.InterruptedException unused) {
                }
            }
            com.amoad.z zVar = this.f349a;
            android.media.MediaPlayer mediaPlayer2 = null;
            if (zVar != null) {
                try {
                    com.amoad.z.c cVarA = zVar.a(strC);
                    if (cVarA != null) {
                        com.amoad.AMoAdLogger.getInstance().d("Disk cache hit");
                        inputStream = cVarA.c[0];
                        if (inputStream != null) {
                            try {
                                java.io.FileDescriptor fd = ((java.io.FileInputStream) inputStream).getFD();
                                mediaPlayer = new android.media.MediaPlayer();
                                try {
                                    mediaPlayer.setDataSource(fd);
                                    mediaPlayer.prepare();
                                    if (inputStream != null) {
                                        try {
                                            inputStream.close();
                                        } catch (java.io.IOException unused2) {
                                        }
                                    }
                                    return mediaPlayer;
                                } catch (java.lang.Throwable th) {
                                    th = th;
                                    if (mediaPlayer != null) {
                                        try {
                                            mediaPlayer.release();
                                        } catch (java.lang.Throwable th2) {
                                            if (inputStream != null) {
                                                try {
                                                    inputStream.close();
                                                } catch (java.io.IOException unused3) {
                                                }
                                            }
                                            throw th2;
                                        }
                                    } else {
                                        mediaPlayer2 = mediaPlayer;
                                    }
                                    com.amoad.AMoAdLogger.getInstance().e("getVideoFromDiskCache - ".concat(java.lang.String.valueOf(th)));
                                    if (inputStream != null) {
                                        try {
                                            inputStream.close();
                                        } catch (java.io.IOException unused4) {
                                        }
                                    }
                                    return mediaPlayer2;
                                }
                            } catch (java.lang.Throwable th3) {
                                th = th3;
                                mediaPlayer = null;
                            }
                        }
                    } else {
                        inputStream = null;
                    }
                    if (inputStream != null) {
                        inputStream.close();
                    }
                } catch (java.lang.Throwable th4) {
                    th = th4;
                    inputStream = null;
                    mediaPlayer = null;
                }
            }
            return mediaPlayer2;
        }
    }
}
