package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzcl extends com.google.android.gms.internal.ads.zzci {
    /* JADX WARN: Code duplicated, block: B:14:0x0032  */
    @Override // com.google.android.gms.internal.ads.zzch
    public final void zze(java.nio.ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i = iLimit - iPosition;
        int i2 = this.zzb.zzd;
        if (i2 == 3) {
            i += i;
        } else if (i2 == 4) {
            i /= 2;
        } else {
            if (i2 != 21) {
                if (i2 == 22) {
                    i /= 2;
                } else if (i2 != 268435456) {
                    if (i2 != 1342177280) {
                        if (i2 != 1610612736) {
                            throw new java.lang.IllegalStateException();
                        }
                        i /= 2;
                    }
                }
            }
            i /= 3;
            i += i;
        }
        java.nio.ByteBuffer byteBufferZzj = zzj(i);
        int i3 = this.zzb.zzd;
        if (i3 == 3) {
            while (iPosition < iLimit) {
                byteBufferZzj.put((byte) 0);
                byteBufferZzj.put((byte) ((byteBuffer.get(iPosition) & 255) - 128));
                iPosition++;
            }
        } else if (i3 == 4) {
            while (iPosition < iLimit) {
                short sMax = (short) (java.lang.Math.max(-1.0f, java.lang.Math.min(byteBuffer.getFloat(iPosition), 1.0f)) * 32767.0f);
                byteBufferZzj.put((byte) (sMax & 255));
                byteBufferZzj.put((byte) ((sMax >> 8) & 255));
                iPosition += 4;
            }
        } else if (i3 == 21) {
            while (iPosition < iLimit) {
                byteBufferZzj.put(byteBuffer.get(iPosition + 1));
                byteBufferZzj.put(byteBuffer.get(iPosition + 2));
                iPosition += 3;
            }
        } else if (i3 == 22) {
            while (iPosition < iLimit) {
                byteBufferZzj.put(byteBuffer.get(iPosition + 2));
                byteBufferZzj.put(byteBuffer.get(iPosition + 3));
                iPosition += 4;
            }
        } else if (i3 == 268435456) {
            while (iPosition < iLimit) {
                byteBufferZzj.put(byteBuffer.get(iPosition + 1));
                byteBufferZzj.put(byteBuffer.get(iPosition));
                iPosition += 2;
            }
        } else if (i3 == 1342177280) {
            while (iPosition < iLimit) {
                byteBufferZzj.put(byteBuffer.get(iPosition + 1));
                byteBufferZzj.put(byteBuffer.get(iPosition));
                iPosition += 3;
            }
        } else {
            if (i3 != 1610612736) {
                throw new java.lang.IllegalStateException();
            }
            while (iPosition < iLimit) {
                byteBufferZzj.put(byteBuffer.get(iPosition + 1));
                byteBufferZzj.put(byteBuffer.get(iPosition));
                iPosition += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferZzj.flip();
    }

    @Override // com.google.android.gms.internal.ads.zzci
    public final com.google.android.gms.internal.ads.zzcf zzi(com.google.android.gms.internal.ads.zzcf zzcfVar) throws com.google.android.gms.internal.ads.zzcg {
        int i = zzcfVar.zzd;
        if (i != 3) {
            if (i == 2) {
                return com.google.android.gms.internal.ads.zzcf.zza;
            }
            if (i != 268435456 && i != 21 && i != 1342177280 && i != 22 && i != 1610612736 && i != 4) {
                throw new com.google.android.gms.internal.ads.zzcg("Unhandled input format:", zzcfVar);
            }
        }
        return new com.google.android.gms.internal.ads.zzcf(zzcfVar.zzb, zzcfVar.zzc, 2);
    }
}
