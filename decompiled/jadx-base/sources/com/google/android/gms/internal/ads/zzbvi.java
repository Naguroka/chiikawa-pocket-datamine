package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbvi extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.ads.zzbvi> CREATOR = new com.google.android.gms.internal.ads.zzbvj();
    android.os.ParcelFileDescriptor zza;
    private android.os.Parcelable zzb = null;
    private boolean zzc = true;

    public zzbvi(android.os.ParcelFileDescriptor parcelFileDescriptor) {
        this.zza = parcelFileDescriptor;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        final android.os.ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream;
        if (this.zza == null) {
            android.os.Parcel parcelObtain = android.os.Parcel.obtain();
            try {
                this.zzb.writeToParcel(parcelObtain, 0);
                final byte[] bArrMarshall = parcelObtain.marshall();
                parcelObtain.recycle();
                android.os.ParcelFileDescriptor parcelFileDescriptor = null;
                try {
                    android.os.ParcelFileDescriptor[] parcelFileDescriptorArrCreatePipe = android.os.ParcelFileDescriptor.createPipe();
                    autoCloseOutputStream = new android.os.ParcelFileDescriptor.AutoCloseOutputStream(parcelFileDescriptorArrCreatePipe[1]);
                    try {
                        com.google.android.gms.internal.ads.zzbzw.zza.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzbvh
                            @Override // java.lang.Runnable
                            public final void run() throws java.lang.Throwable {
                                android.os.Parcelable.Creator<com.google.android.gms.internal.ads.zzbvi> creator = com.google.android.gms.internal.ads.zzbvi.CREATOR;
                                java.io.OutputStream outputStream = autoCloseOutputStream;
                                byte[] bArr = bArrMarshall;
                                java.io.DataOutputStream dataOutputStream = null;
                                try {
                                    try {
                                        java.io.DataOutputStream dataOutputStream2 = new java.io.DataOutputStream(outputStream);
                                        try {
                                            dataOutputStream2.writeInt(bArr.length);
                                            dataOutputStream2.write(bArr);
                                            com.google.android.gms.common.util.IOUtils.closeQuietly(dataOutputStream2);
                                        } catch (java.io.IOException e) {
                                            e = e;
                                            dataOutputStream = dataOutputStream2;
                                            com.google.android.gms.ads.internal.util.client.zzo.zzh("Error transporting the ad response", e);
                                            com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "LargeParcelTeleporter.pipeData.1");
                                            if (dataOutputStream == null) {
                                                com.google.android.gms.common.util.IOUtils.closeQuietly(outputStream);
                                            } else {
                                                com.google.android.gms.common.util.IOUtils.closeQuietly(dataOutputStream);
                                            }
                                        } catch (java.lang.Throwable th) {
                                            th = th;
                                            dataOutputStream = dataOutputStream2;
                                            if (dataOutputStream == null) {
                                                com.google.android.gms.common.util.IOUtils.closeQuietly(outputStream);
                                            } else {
                                                com.google.android.gms.common.util.IOUtils.closeQuietly(dataOutputStream);
                                            }
                                            throw th;
                                        }
                                    } catch (java.io.IOException e2) {
                                        e = e2;
                                    }
                                } catch (java.lang.Throwable th2) {
                                    th = th2;
                                }
                            }
                        });
                        parcelFileDescriptor = parcelFileDescriptorArrCreatePipe[0];
                    } catch (java.io.IOException e) {
                        e = e;
                        com.google.android.gms.ads.internal.util.client.zzo.zzh("Error transporting the ad response", e);
                        com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "LargeParcelTeleporter.pipeData.2");
                        com.google.android.gms.common.util.IOUtils.closeQuietly(autoCloseOutputStream);
                    }
                } catch (java.io.IOException e2) {
                    e = e2;
                    autoCloseOutputStream = null;
                }
                this.zza = parcelFileDescriptor;
            } catch (java.lang.Throwable th) {
                parcelObtain.recycle();
                throw th;
            }
        }
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 2, this.zza, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final com.google.android.gms.common.internal.safeparcel.SafeParcelable zza(android.os.Parcelable.Creator creator) {
        if (this.zzc) {
            if (this.zza == null) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("File descriptor is empty, returning null.");
                return null;
            }
            java.io.DataInputStream dataInputStream = new java.io.DataInputStream(new android.os.ParcelFileDescriptor.AutoCloseInputStream(this.zza));
            try {
                try {
                    int i = dataInputStream.readInt();
                    byte[] bArr = new byte[i];
                    dataInputStream.readFully(bArr, 0, i);
                    com.google.android.gms.common.util.IOUtils.closeQuietly(dataInputStream);
                    android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                    try {
                        parcelObtain.unmarshall(bArr, 0, i);
                        parcelObtain.setDataPosition(0);
                        this.zzb = (android.os.Parcelable) creator.createFromParcel(parcelObtain);
                        parcelObtain.recycle();
                        this.zzc = false;
                    } catch (java.lang.Throwable th) {
                        parcelObtain.recycle();
                        throw th;
                    }
                } catch (java.io.IOException e) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzh("Could not read from parcel file descriptor", e);
                    com.google.android.gms.common.util.IOUtils.closeQuietly(dataInputStream);
                    return null;
                }
            } catch (java.lang.Throwable th2) {
                com.google.android.gms.common.util.IOUtils.closeQuietly(dataInputStream);
                throw th2;
            }
        }
        return (com.google.android.gms.common.internal.safeparcel.SafeParcelable) this.zzb;
    }
}
