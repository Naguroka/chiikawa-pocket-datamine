package com.google.android.gms.common.data;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public class BitmapTeleporter extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.data.BitmapTeleporter> CREATOR = new com.google.android.gms.common.data.zaa();
    final int zaa;
    android.os.ParcelFileDescriptor zab;
    final int zac;
    private android.graphics.Bitmap zad;
    private boolean zae;
    private java.io.File zaf;

    BitmapTeleporter(int i, android.os.ParcelFileDescriptor parcelFileDescriptor, int i2) {
        this.zaa = i;
        this.zab = parcelFileDescriptor;
        this.zac = i2;
        this.zad = null;
        this.zae = false;
    }

    private static final void zaa(java.io.Closeable closeable) {
        try {
            closeable.close();
        } catch (java.io.IOException e) {
            android.util.Log.w("BitmapTeleporter", "Could not close stream", e);
        }
    }

    public android.graphics.Bitmap get() {
        if (!this.zae) {
            java.io.DataInputStream dataInputStream = new java.io.DataInputStream(new android.os.ParcelFileDescriptor.AutoCloseInputStream((android.os.ParcelFileDescriptor) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zab)));
            try {
                try {
                    byte[] bArr = new byte[dataInputStream.readInt()];
                    int i = dataInputStream.readInt();
                    int i2 = dataInputStream.readInt();
                    android.graphics.Bitmap.Config configValueOf = android.graphics.Bitmap.Config.valueOf(dataInputStream.readUTF());
                    dataInputStream.read(bArr);
                    zaa(dataInputStream);
                    java.nio.ByteBuffer byteBufferWrap = java.nio.ByteBuffer.wrap(bArr);
                    android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(i, i2, configValueOf);
                    bitmapCreateBitmap.copyPixelsFromBuffer(byteBufferWrap);
                    this.zad = bitmapCreateBitmap;
                    this.zae = true;
                } catch (java.io.IOException e) {
                    throw new java.lang.IllegalStateException("Could not read from parcel file descriptor", e);
                }
            } catch (java.lang.Throwable th) {
                zaa(dataInputStream);
                throw th;
            }
        }
        return this.zad;
    }

    public void release() {
        if (this.zae) {
            return;
        }
        try {
            ((android.os.ParcelFileDescriptor) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zab)).close();
        } catch (java.io.IOException e) {
            android.util.Log.w("BitmapTeleporter", "Could not close PFD", e);
        }
    }

    public void setTempDir(java.io.File file) {
        if (file == null) {
            throw new java.lang.NullPointerException("Cannot set null temp directory");
        }
        this.zaf = file;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        if (this.zab == null) {
            android.graphics.Bitmap bitmap = (android.graphics.Bitmap) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zad);
            java.nio.ByteBuffer byteBufferAllocate = java.nio.ByteBuffer.allocate(bitmap.getRowBytes() * bitmap.getHeight());
            bitmap.copyPixelsToBuffer(byteBufferAllocate);
            byte[] bArrArray = byteBufferAllocate.array();
            java.io.File file = this.zaf;
            if (file == null) {
                throw new java.lang.IllegalStateException("setTempDir() must be called before writing this object to a parcel");
            }
            try {
                java.io.File fileCreateTempFile = java.io.File.createTempFile("teleporter", ".tmp", file);
                try {
                    java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(fileCreateTempFile);
                    this.zab = android.os.ParcelFileDescriptor.open(fileCreateTempFile, 268435456);
                    fileCreateTempFile.delete();
                    java.io.DataOutputStream dataOutputStream = new java.io.DataOutputStream(new java.io.BufferedOutputStream(fileOutputStream));
                    try {
                        try {
                            dataOutputStream.writeInt(bArrArray.length);
                            dataOutputStream.writeInt(bitmap.getWidth());
                            dataOutputStream.writeInt(bitmap.getHeight());
                            dataOutputStream.writeUTF(bitmap.getConfig().toString());
                            dataOutputStream.write(bArrArray);
                            zaa(dataOutputStream);
                        } catch (java.io.IOException e) {
                            throw new java.lang.IllegalStateException("Could not write into unlinked file", e);
                        }
                    } catch (java.lang.Throwable th) {
                        zaa(dataOutputStream);
                        throw th;
                    }
                } catch (java.io.FileNotFoundException unused) {
                    throw new java.lang.IllegalStateException("Temporary file is somehow already deleted");
                }
            } catch (java.io.IOException e2) {
                throw new java.lang.IllegalStateException("Could not create temporary file", e2);
            }
        }
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, this.zaa);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 2, this.zab, i | 1, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 3, this.zac);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
        this.zab = null;
    }

    public BitmapTeleporter(android.graphics.Bitmap bitmap) {
        this.zaa = 1;
        this.zab = null;
        this.zac = 0;
        this.zad = bitmap;
        this.zae = true;
    }
}
