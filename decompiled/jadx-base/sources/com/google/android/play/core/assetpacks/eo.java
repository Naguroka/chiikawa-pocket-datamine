package com.google.android.play.core.assetpacks;

/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class eo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.google.android.play.core.assetpacks.internal.o f2227a = new com.google.android.play.core.assetpacks.internal.o("SliceMetadataManager");
    private final com.google.android.play.core.assetpacks.bh c;
    private final java.lang.String d;
    private final int e;
    private final long f;
    private final java.lang.String g;
    private final byte[] b = new byte[8192];
    private int h = -1;

    eo(com.google.android.play.core.assetpacks.bh bhVar, java.lang.String str, int i, long j, java.lang.String str2) {
        this.c = bhVar;
        this.d = str;
        this.e = i;
        this.f = j;
        this.g = str2;
    }

    private final java.io.File n() {
        java.io.File fileO = this.c.o(this.d, this.e, this.f, this.g);
        if (!fileO.exists()) {
            fileO.mkdirs();
        }
        return fileO;
    }

    private final java.io.File o() throws java.io.IOException {
        java.io.File fileN = this.c.n(this.d, this.e, this.f, this.g);
        fileN.getParentFile().mkdirs();
        fileN.createNewFile();
        return fileN;
    }

    final int a() throws java.lang.IllegalAccessException, java.io.IOException, java.lang.reflect.InvocationTargetException {
        java.io.File fileN = this.c.n(this.d, this.e, this.f, this.g);
        if (!fileN.exists()) {
            return 0;
        }
        java.io.FileInputStream fileInputStream = new java.io.FileInputStream(fileN);
        try {
            java.util.Properties properties = new java.util.Properties();
            properties.load(fileInputStream);
            fileInputStream.close();
            if (java.lang.Integer.parseInt(properties.getProperty("fileStatus", "-1")) == 4) {
                return -1;
            }
            if (properties.getProperty("previousChunk") != null) {
                return java.lang.Integer.parseInt(properties.getProperty("previousChunk")) + 1;
            }
            throw new com.google.android.play.core.assetpacks.ck("Slice checkpoint file corrupt.");
        } catch (java.lang.Throwable th) {
            try {
                fileInputStream.close();
            } catch (java.lang.Throwable th2) {
                java.lang.Throwable.class.getDeclaredMethod("addSuppressed", java.lang.Throwable.class).invoke(th, th2);
            }
            throw th;
        }
    }

    final com.google.android.play.core.assetpacks.em b() throws java.lang.IllegalAccessException, java.io.IOException, java.lang.reflect.InvocationTargetException {
        java.io.File fileN = this.c.n(this.d, this.e, this.f, this.g);
        if (!fileN.exists()) {
            throw new com.google.android.play.core.assetpacks.ck("Slice checkpoint file does not exist.");
        }
        java.util.Properties properties = new java.util.Properties();
        java.io.FileInputStream fileInputStream = new java.io.FileInputStream(fileN);
        try {
            properties.load(fileInputStream);
            fileInputStream.close();
            if (properties.getProperty("fileStatus") == null || properties.getProperty("previousChunk") == null) {
                throw new com.google.android.play.core.assetpacks.ck("Slice checkpoint file corrupt.");
            }
            try {
                int i = java.lang.Integer.parseInt(properties.getProperty("fileStatus"));
                java.lang.String property = properties.getProperty(com.ironsource.rc.c.b);
                long j = java.lang.Long.parseLong(properties.getProperty("fileOffset", "-1"));
                long j2 = java.lang.Long.parseLong(properties.getProperty("remainingBytes", "-1"));
                int i2 = java.lang.Integer.parseInt(properties.getProperty("previousChunk"));
                this.h = java.lang.Integer.parseInt(properties.getProperty("metadataFileCounter", "0"));
                return new com.google.android.play.core.assetpacks.bp(i, property, j, j2, i2);
            } catch (java.lang.NumberFormatException e) {
                throw new com.google.android.play.core.assetpacks.ck("Slice checkpoint file corrupt.", e);
            }
        } catch (java.lang.Throwable th) {
            try {
                fileInputStream.close();
            } catch (java.lang.Throwable th2) {
                java.lang.Throwable.class.getDeclaredMethod("addSuppressed", java.lang.Throwable.class).invoke(th, th2);
            }
            throw th;
        }
    }

    final java.io.File c() {
        return new java.io.File(n(), java.lang.String.format("%s-NAM.dat", java.lang.Integer.valueOf(this.h)));
    }

    final void d(java.io.InputStream inputStream, long j) throws java.lang.IllegalAccessException, java.io.IOException, java.lang.reflect.InvocationTargetException {
        int i;
        java.io.RandomAccessFile randomAccessFile = new java.io.RandomAccessFile(c(), "rw");
        try {
            randomAccessFile.seek(j);
            do {
                i = inputStream.read(this.b);
                if (i > 0) {
                    randomAccessFile.write(this.b, 0, i);
                }
            } while (i == 8192);
            randomAccessFile.close();
        } catch (java.lang.Throwable th) {
            try {
                randomAccessFile.close();
            } catch (java.lang.Throwable th2) {
                java.lang.Throwable.class.getDeclaredMethod("addSuppressed", java.lang.Throwable.class).invoke(th, th2);
            }
            throw th;
        }
    }

    final void e(long j, byte[] bArr, int i, int i2) throws java.lang.IllegalAccessException, java.io.IOException, java.lang.reflect.InvocationTargetException {
        java.io.RandomAccessFile randomAccessFile = new java.io.RandomAccessFile(c(), "rw");
        try {
            randomAccessFile.seek(j);
            randomAccessFile.write(bArr, i, i2);
            randomAccessFile.close();
        } catch (java.lang.Throwable th) {
            try {
                randomAccessFile.close();
            } catch (java.lang.Throwable th2) {
                java.lang.Throwable.class.getDeclaredMethod("addSuppressed", java.lang.Throwable.class).invoke(th, th2);
            }
            throw th;
        }
    }

    final void f(int i) throws java.lang.IllegalAccessException, java.io.IOException, java.lang.reflect.InvocationTargetException {
        java.util.Properties properties = new java.util.Properties();
        properties.put("fileStatus", androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_3D);
        properties.put("fileOffset", java.lang.String.valueOf(c().length()));
        properties.put("previousChunk", java.lang.String.valueOf(i));
        properties.put("metadataFileCounter", java.lang.String.valueOf(this.h));
        java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(o());
        try {
            properties.store(fileOutputStream, (java.lang.String) null);
            fileOutputStream.close();
        } catch (java.lang.Throwable th) {
            try {
                fileOutputStream.close();
            } catch (java.lang.Throwable th2) {
                java.lang.Throwable.class.getDeclaredMethod("addSuppressed", java.lang.Throwable.class).invoke(th, th2);
            }
            throw th;
        }
    }

    final void g(java.lang.String str, long j, long j2, int i) throws java.lang.IllegalAccessException, java.io.IOException, java.lang.reflect.InvocationTargetException {
        java.util.Properties properties = new java.util.Properties();
        properties.put("fileStatus", "1");
        properties.put(com.ironsource.rc.c.b, str);
        properties.put("fileOffset", java.lang.String.valueOf(j));
        properties.put("remainingBytes", java.lang.String.valueOf(j2));
        properties.put("previousChunk", java.lang.String.valueOf(i));
        properties.put("metadataFileCounter", java.lang.String.valueOf(this.h));
        java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(o());
        try {
            properties.store(fileOutputStream, (java.lang.String) null);
            fileOutputStream.close();
        } catch (java.lang.Throwable th) {
            try {
                fileOutputStream.close();
            } catch (java.lang.Throwable th2) {
                java.lang.Throwable.class.getDeclaredMethod("addSuppressed", java.lang.Throwable.class).invoke(th, th2);
            }
            throw th;
        }
    }

    final void h(byte[] bArr, int i) throws java.lang.IllegalAccessException, java.io.IOException, java.lang.reflect.InvocationTargetException {
        java.util.Properties properties = new java.util.Properties();
        properties.put("fileStatus", "2");
        properties.put("previousChunk", java.lang.String.valueOf(i));
        properties.put("metadataFileCounter", java.lang.String.valueOf(this.h));
        java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(o());
        try {
            properties.store(fileOutputStream, (java.lang.String) null);
            fileOutputStream.close();
            java.io.File fileM = this.c.m(this.d, this.e, this.f, this.g);
            if (fileM.exists()) {
                fileM.delete();
            }
            java.io.FileOutputStream fileOutputStream2 = new java.io.FileOutputStream(fileM);
            try {
                fileOutputStream2.write(bArr);
                fileOutputStream2.close();
            } catch (java.lang.Throwable th) {
                try {
                    fileOutputStream2.close();
                } catch (java.lang.Throwable th2) {
                    java.lang.Throwable.class.getDeclaredMethod("addSuppressed", java.lang.Throwable.class).invoke(th, th2);
                }
                throw th;
            }
        } catch (java.lang.Throwable th3) {
            try {
                fileOutputStream.close();
            } catch (java.lang.Throwable th4) {
                java.lang.Throwable.class.getDeclaredMethod("addSuppressed", java.lang.Throwable.class).invoke(th3, th4);
            }
            throw th3;
        }
    }

    final void i(int i) throws java.lang.IllegalAccessException, java.io.IOException, java.lang.reflect.InvocationTargetException {
        java.util.Properties properties = new java.util.Properties();
        properties.put("fileStatus", "4");
        properties.put("previousChunk", java.lang.String.valueOf(i));
        properties.put("metadataFileCounter", java.lang.String.valueOf(this.h));
        java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(o());
        try {
            properties.store(fileOutputStream, (java.lang.String) null);
            fileOutputStream.close();
        } catch (java.lang.Throwable th) {
            try {
                fileOutputStream.close();
            } catch (java.lang.Throwable th2) {
                java.lang.Throwable.class.getDeclaredMethod("addSuppressed", java.lang.Throwable.class).invoke(th, th2);
            }
            throw th;
        }
    }

    final void j(byte[] bArr) throws java.lang.IllegalAccessException, java.io.IOException, java.lang.reflect.InvocationTargetException {
        this.h++;
        try {
            java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(new java.io.File(n(), java.lang.String.format("%s-LFH.dat", java.lang.Integer.valueOf(this.h))));
            try {
                fileOutputStream.write(bArr);
                fileOutputStream.close();
            } catch (java.lang.Throwable th) {
                try {
                    fileOutputStream.close();
                } catch (java.lang.Throwable th2) {
                    java.lang.Throwable.class.getDeclaredMethod("addSuppressed", java.lang.Throwable.class).invoke(th, th2);
                }
                throw th;
            }
        } catch (java.io.IOException e) {
            throw new com.google.android.play.core.assetpacks.ck("Could not write metadata file.", e);
        }
    }

    final void k(byte[] bArr, java.io.InputStream inputStream) throws java.lang.IllegalAccessException, java.io.IOException, java.lang.reflect.InvocationTargetException {
        this.h++;
        java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(c());
        try {
            fileOutputStream.write(bArr);
            int i = inputStream.read(this.b);
            while (i > 0) {
                fileOutputStream.write(this.b, 0, i);
                i = inputStream.read(this.b);
            }
            fileOutputStream.close();
        } catch (java.lang.Throwable th) {
            try {
                fileOutputStream.close();
            } catch (java.lang.Throwable th2) {
                java.lang.Throwable.class.getDeclaredMethod("addSuppressed", java.lang.Throwable.class).invoke(th, th2);
            }
            throw th;
        }
    }

    final void l(byte[] bArr, int i, int i2) throws java.lang.IllegalAccessException, java.io.IOException, java.lang.reflect.InvocationTargetException {
        this.h++;
        java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(c());
        try {
            fileOutputStream.write(bArr, 0, i2);
            fileOutputStream.close();
        } catch (java.lang.Throwable th) {
            try {
                fileOutputStream.close();
            } catch (java.lang.Throwable th2) {
                java.lang.Throwable.class.getDeclaredMethod("addSuppressed", java.lang.Throwable.class).invoke(th, th2);
            }
            throw th;
        }
    }

    final boolean m() throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        java.io.File fileN = this.c.n(this.d, this.e, this.f, this.g);
        if (!fileN.exists()) {
            return false;
        }
        try {
            java.io.FileInputStream fileInputStream = new java.io.FileInputStream(fileN);
            try {
                java.util.Properties properties = new java.util.Properties();
                properties.load(fileInputStream);
                fileInputStream.close();
                if (properties.getProperty("fileStatus") != null) {
                    return java.lang.Integer.parseInt(properties.getProperty("fileStatus")) == 4;
                }
                f2227a.b("Slice checkpoint file corrupt while checking if extraction finished.", new java.lang.Object[0]);
                return false;
            } catch (java.lang.Throwable th) {
                try {
                    fileInputStream.close();
                } catch (java.lang.Throwable th2) {
                    java.lang.Throwable.class.getDeclaredMethod("addSuppressed", java.lang.Throwable.class).invoke(th, th2);
                }
                throw th;
            }
        } catch (java.io.IOException e) {
            f2227a.b("Could not read checkpoint while checking if extraction finished. %s", e);
            return false;
        }
    }
}
