package org.fmod;

/* JADX INFO: loaded from: classes6.dex */
public class FMODAudioDevice implements java.lang.Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile java.lang.Thread f3960a = null;
    private volatile boolean b = false;
    private android.media.AudioTrack c = null;
    private boolean d = false;
    private java.nio.ByteBuffer e = null;
    private byte[] f = null;
    private volatile org.fmod.a g;

    private native int fmodGetInfo(int i);

    private native int fmodProcess(java.nio.ByteBuffer byteBuffer);

    private void releaseAudioTrack() {
        android.media.AudioTrack audioTrack = this.c;
        if (audioTrack != null) {
            if (audioTrack.getState() == 1) {
                this.c.stop();
            }
            this.c.release();
            this.c = null;
        }
        this.e = null;
        this.f = null;
        this.d = false;
    }

    public synchronized void close() {
        stop();
    }

    native int fmodProcessMicData(java.nio.ByteBuffer byteBuffer, int i);

    public boolean isRunning() {
        return this.f3960a != null && this.f3960a.isAlive();
    }

    @Override // java.lang.Runnable
    public void run() {
        int i = 3;
        while (this.b) {
            if (!this.d && i > 0) {
                releaseAudioTrack();
                int iFmodGetInfo = fmodGetInfo(0);
                int i2 = fmodGetInfo(4) == 1 ? 4 : 12;
                int minBufferSize = android.media.AudioTrack.getMinBufferSize(iFmodGetInfo, i2, 2);
                int iFmodGetInfo2 = fmodGetInfo(4) * 2;
                int iRound = java.lang.Math.round(minBufferSize * 1.1f) & (~(iFmodGetInfo2 - 1));
                int iFmodGetInfo3 = fmodGetInfo(1);
                int iFmodGetInfo4 = fmodGetInfo(2) * iFmodGetInfo3 * iFmodGetInfo2;
                android.media.AudioTrack audioTrack = new android.media.AudioTrack(3, iFmodGetInfo, i2, 2, iFmodGetInfo4 > iRound ? iFmodGetInfo4 : iRound, 1);
                this.c = audioTrack;
                boolean z = audioTrack.getState() == 1;
                this.d = z;
                if (z) {
                    java.nio.ByteBuffer byteBufferAllocateDirect = java.nio.ByteBuffer.allocateDirect(iFmodGetInfo3 * iFmodGetInfo2);
                    this.e = byteBufferAllocateDirect;
                    this.f = new byte[byteBufferAllocateDirect.capacity()];
                    this.c.play();
                    i = 3;
                } else {
                    android.util.Log.e("FMOD", "AudioTrack failed to initialize (status " + this.c.getState() + ")");
                    releaseAudioTrack();
                    i--;
                }
            }
            if (this.d) {
                if (fmodGetInfo(3) == 1) {
                    fmodProcess(this.e);
                    java.nio.ByteBuffer byteBuffer = this.e;
                    byteBuffer.get(this.f, 0, byteBuffer.capacity());
                    this.c.write(this.f, 0, this.e.capacity());
                    this.e.position(0);
                } else {
                    releaseAudioTrack();
                }
            }
        }
        releaseAudioTrack();
    }

    public synchronized void start() {
        if (this.f3960a != null) {
            stop();
        }
        this.f3960a = new java.lang.Thread(this, "FMODAudioDevice");
        this.f3960a.setPriority(10);
        this.b = true;
        this.f3960a.start();
        if (this.g != null) {
            this.g.c();
        }
    }

    public synchronized int startAudioRecord(int i, int i2, int i3) {
        if (this.g == null) {
            this.g = new org.fmod.a(this, i, i2);
            this.g.c();
        }
        return this.g.a();
    }

    public synchronized void stop() {
        while (this.f3960a != null) {
            this.b = false;
            try {
                this.f3960a.join();
                this.f3960a = null;
            } catch (java.lang.InterruptedException unused) {
            }
        }
        if (this.g != null) {
            this.g.d();
        }
    }

    public synchronized void stopAudioRecord() {
        if (this.g != null) {
            this.g.d();
            this.g = null;
        }
    }
}
