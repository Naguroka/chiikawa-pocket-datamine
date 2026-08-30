package com.google.android.gms.internal.nearby;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzfz extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.nearby.zzfz> CREATOR = new com.google.android.gms.internal.nearby.zzfy();
    private byte[] zza;
    private android.os.ParcelFileDescriptor zzb;

    private zzfz() {
        this.zza = new byte[0];
    }

    static byte[] zzb(android.os.ParcelFileDescriptor parcelFileDescriptor) {
        java.io.DataInputStream dataInputStream = new java.io.DataInputStream(new android.os.ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor));
        try {
            try {
                byte[] bArr = new byte[dataInputStream.readInt()];
                dataInputStream.read(bArr);
                zze(dataInputStream);
                return bArr;
            } catch (java.io.IOException e) {
                throw new java.lang.IllegalStateException("Could not read from parcel file descriptor", e);
            }
        } catch (java.lang.Throwable th) {
            zze(dataInputStream);
            throw th;
        }
    }

    private static void zze(java.io.Closeable closeable) {
        try {
            closeable.close();
        } catch (java.io.IOException e) {
            android.util.Log.w("ParcelByteArray", "Could not close stream", e);
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.gms.internal.nearby.zzfz) {
            return java.util.Arrays.equals(this.zza, ((com.google.android.gms.internal.nearby.zzfz) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(this.zza);
    }

    /* JADX WARN: Not initialized variable reg: 5, insn: 0x00ce: MOVE (r2 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]), block:B:40:0x00ce */
    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) throws java.lang.Throwable {
        java.io.Closeable closeable;
        java.io.DataOutputStream dataOutputStream;
        android.os.ParcelFileDescriptor parcelFileDescriptor;
        byte[] bArr = this.zza;
        java.io.Closeable closeable2 = null;
        if (bArr != null) {
            try {
                if (this.zzb == null) {
                    try {
                        try {
                            java.io.File fileZzc = com.google.android.gms.internal.nearby.zzgf.zzc();
                            if (fileZzc == null) {
                                throw new java.lang.IllegalStateException("Must set temp dir before writing this object to a parcel");
                            }
                            try {
                                java.io.File fileCreateTempFile = java.io.File.createTempFile("teleporter" + android.os.SystemClock.elapsedRealtime(), ".tmp", fileZzc);
                                try {
                                    java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(fileCreateTempFile);
                                    android.os.ParcelFileDescriptor parcelFileDescriptorOpen = android.os.ParcelFileDescriptor.open(fileCreateTempFile, 268435456);
                                    fileCreateTempFile.delete();
                                    android.util.Pair pairCreate = android.util.Pair.create(fileOutputStream, parcelFileDescriptorOpen);
                                    dataOutputStream = new java.io.DataOutputStream(new java.io.BufferedOutputStream((java.io.OutputStream) pairCreate.first));
                                    try {
                                        dataOutputStream.writeInt(bArr.length);
                                        dataOutputStream.write(bArr);
                                        parcelFileDescriptor = (android.os.ParcelFileDescriptor) pairCreate.second;
                                        zze(dataOutputStream);
                                    } catch (java.io.IOException e) {
                                        e = e;
                                        java.lang.String strValueOf = java.lang.String.valueOf(e);
                                        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(strValueOf).length() + 36);
                                        sb.append("Could not write into unlinked file. ");
                                        sb.append(strValueOf);
                                        android.util.Log.e("ParcelByteArray", sb.toString());
                                        if (dataOutputStream != null) {
                                            zze(dataOutputStream);
                                        }
                                        parcelFileDescriptor = null;
                                    } catch (java.lang.IllegalStateException e2) {
                                        e = e2;
                                        java.lang.String strValueOf2 = java.lang.String.valueOf(e);
                                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder(java.lang.String.valueOf(strValueOf2).length() + 32);
                                        sb2.append("Could not create unlinked file. ");
                                        sb2.append(strValueOf2);
                                        android.util.Log.e("ParcelByteArray", sb2.toString());
                                        if (dataOutputStream != null) {
                                            zze(dataOutputStream);
                                        }
                                        parcelFileDescriptor = null;
                                    }
                                    this.zzb = parcelFileDescriptor;
                                } catch (java.io.FileNotFoundException e3) {
                                    throw new java.lang.IllegalStateException("Temporary file is somehow already deleted", e3);
                                }
                            } catch (java.io.IOException e4) {
                                throw new java.lang.IllegalStateException("Could not create temporary file", e4);
                            }
                        } catch (java.io.IOException e5) {
                            e = e5;
                            dataOutputStream = null;
                        }
                    } catch (java.lang.IllegalStateException e6) {
                        e = e6;
                        dataOutputStream = null;
                    } catch (java.lang.Throwable th) {
                        th = th;
                        if (closeable2 != null) {
                            zze(closeable2);
                        }
                        throw th;
                    }
                }
            } catch (java.lang.Throwable th2) {
                th = th2;
                closeable2 = closeable;
            }
        }
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 1, this.zzb, i | 1, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
        this.zzb = null;
    }

    public final byte[] zza() {
        return this.zza;
    }

    zzfz(android.os.ParcelFileDescriptor parcelFileDescriptor) {
        this.zza = new byte[0];
        this.zzb = parcelFileDescriptor;
    }
}
