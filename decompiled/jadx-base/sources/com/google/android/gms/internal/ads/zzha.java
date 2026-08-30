package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzha extends com.google.android.gms.internal.ads.zzfr {
    private final byte[] zza;
    private final java.net.DatagramPacket zzb;
    private android.net.Uri zzc;
    private java.net.DatagramSocket zzd;
    private java.net.MulticastSocket zze;
    private java.net.InetAddress zzf;
    private boolean zzg;
    private int zzh;

    public zzha() {
        throw null;
    }

    public zzha(int i) {
        super(true);
        byte[] bArr = new byte[2000];
        this.zza = bArr;
        this.zzb = new java.net.DatagramPacket(bArr, 0, 2000);
    }

    @Override // com.google.android.gms.internal.ads.zzl
    public final int zza(byte[] bArr, int i, int i2) throws com.google.android.gms.internal.ads.zzgz {
        if (i2 == 0) {
            return 0;
        }
        if (this.zzh == 0) {
            try {
                java.net.DatagramSocket datagramSocket = this.zzd;
                datagramSocket.getClass();
                datagramSocket.receive(this.zzb);
                int length = this.zzb.getLength();
                this.zzh = length;
                zzg(length);
            } catch (java.net.SocketTimeoutException e) {
                throw new com.google.android.gms.internal.ads.zzgz(e, 2002);
            } catch (java.io.IOException e2) {
                throw new com.google.android.gms.internal.ads.zzgz(e2, 2001);
            }
        }
        int length2 = this.zzb.getLength();
        int i3 = this.zzh;
        int iMin = java.lang.Math.min(i3, i2);
        java.lang.System.arraycopy(this.zza, length2 - i3, bArr, i, iMin);
        this.zzh -= iMin;
        return iMin;
    }

    @Override // com.google.android.gms.internal.ads.zzfy
    public final long zzb(com.google.android.gms.internal.ads.zzgd zzgdVar) throws com.google.android.gms.internal.ads.zzgz {
        android.net.Uri uri = zzgdVar.zza;
        this.zzc = uri;
        java.lang.String host = uri.getHost();
        host.getClass();
        int port = this.zzc.getPort();
        zzi(zzgdVar);
        try {
            this.zzf = java.net.InetAddress.getByName(host);
            java.net.InetSocketAddress inetSocketAddress = new java.net.InetSocketAddress(this.zzf, port);
            if (this.zzf.isMulticastAddress()) {
                java.net.MulticastSocket multicastSocket = new java.net.MulticastSocket(inetSocketAddress);
                this.zze = multicastSocket;
                multicastSocket.joinGroup(this.zzf);
                this.zzd = this.zze;
            } else {
                this.zzd = new java.net.DatagramSocket(inetSocketAddress);
            }
            this.zzd.setSoTimeout(8000);
            this.zzg = true;
            zzj(zzgdVar);
            return -1L;
        } catch (java.io.IOException e) {
            throw new com.google.android.gms.internal.ads.zzgz(e, 2001);
        } catch (java.lang.SecurityException e2) {
            throw new com.google.android.gms.internal.ads.zzgz(e2, 2006);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfy
    public final android.net.Uri zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzfy
    public final void zzd() {
        this.zzc = null;
        java.net.MulticastSocket multicastSocket = this.zze;
        if (multicastSocket != null) {
            try {
                java.net.InetAddress inetAddress = this.zzf;
                inetAddress.getClass();
                multicastSocket.leaveGroup(inetAddress);
            } catch (java.io.IOException unused) {
            }
            this.zze = null;
        }
        java.net.DatagramSocket datagramSocket = this.zzd;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.zzd = null;
        }
        this.zzf = null;
        this.zzh = 0;
        if (this.zzg) {
            this.zzg = false;
            zzh();
        }
    }
}
